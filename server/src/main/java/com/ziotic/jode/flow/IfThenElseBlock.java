/*
 * Copyright (c) 2024 Lazaro Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ziotic.jode.flow;

import java.util.Set;

import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.util.SimpleSet;

/**
 * An IfThenElseBlock is the structured block representing an if
 * instruction.  The else part may be null.
 */
public class IfThenElseBlock extends StructuredBlock {

    /**
     * The condition.  Must be of boolean type.
     */
    Expression cond;
    /**
     * The loads that are on the stack before cond is executed.
     */
    VariableStack condStack;

    /**
     * The then part.  This is always a valid block and not null
     */
    StructuredBlock thenBlock;

    /**
     * The else part, may be null, and mustn't be the then part.
     */
    StructuredBlock elseBlock;

    /**
     * Creates a new if then else block.  The method setThenBlock must
     * be called shortly after the creation.
     */
    public IfThenElseBlock(Expression cond) {
        this.cond = cond;
    }

    /**
     * Sets the then block.
     *
     * @param thenBlock the then block, must be non null.
     */
    public void setThenBlock(StructuredBlock thenBlock) {
        this.thenBlock = thenBlock;
        thenBlock.outer = this;
        thenBlock.setFlowBlock(flowBlock);
    }

    /**
     * Sets the else block.
     *
     * @param elseBlock the else block
     */
    public void setElseBlock(StructuredBlock elseBlock) {
        this.elseBlock = elseBlock;
        elseBlock.outer = this;
        elseBlock.setFlowBlock(flowBlock);
    }

    /* The implementation of getNext[Flow]Block is the standard
  * implementation */

    /**
     * Replaces the given sub block with a new block.
     *
     * @param oldBlock the old sub block.
     * @param newBlock the new sub block.
     * @return false, if oldBlock wasn't a direct sub block.
     */
    public boolean replaceSubBlock(StructuredBlock oldBlock, StructuredBlock newBlock) {
        if (thenBlock == oldBlock)
            thenBlock = newBlock;
        else if (elseBlock == oldBlock)
            elseBlock = newBlock;
        else
            return false;
        return true;
    }

    /**
     * This does take the instr into account and modifies stack
     * accordingly.  It then calls super.mapStackToLocal.
     *
     * @param stack the stack before the instruction is called
     * @return stack the stack afterwards.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        VariableStack newStack;
        int params = cond.getFreeOperandCount();
        if (params > 0) {
            condStack = stack.peek(params);
            newStack = stack.pop(params);
        } else
            newStack = stack;

        VariableStack after = VariableStack.merge(thenBlock.mapStackToLocal(newStack), elseBlock == null ? newStack : elseBlock.mapStackToLocal(newStack));
        if (jump != null) {
            jump.stackMap = after;
            return null;
        }
        return after;
    }

    public void removePush() {
        if (condStack != null)
            cond = condStack.mergeIntoExpression(cond);
        thenBlock.removePush();
        if (elseBlock != null)
            elseBlock.removePush();
    }

    public Set getDeclarables() {
        Set used = new SimpleSet();
        cond.fillDeclarables(used);
        return used;
    }

    /**
     * Make the declarations, i.e. initialize the declare variable
     * to correct values.  This will declare every variable that
     * is marked as used, but not done.<br>
     * <p/>
     * This will now also combine locals, that use the same slot, have
     * compatible types and are declared in the same block. <br>
     *
     * @param done The set of the already declare variables.
     */
    public void makeDeclaration(Set done) {
        cond.makeDeclaration(done);
        super.makeDeclaration(done);
    }

    /**
     * Print the source code for this structured block.  This may be
     * called only once, because it remembers which local variables
     * were declared.
     */
    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        boolean needBrace = thenBlock.needsBraces();
        writer.print("if (");
        cond.dumpExpression(writer.EXPL_PAREN, writer);
        writer.print(")");
        if (needBrace)
            writer.openBrace();
        else
            writer.println();
        writer.tab();
        thenBlock.dumpSource(writer);
        writer.untab();
        if (elseBlock != null) {
            if (needBrace)
                writer.closeBraceContinue();

            if (elseBlock instanceof IfThenElseBlock && (elseBlock.declare == null || elseBlock.declare.isEmpty())) {
                needBrace = false;
                writer.print("else ");
                elseBlock.dumpSource(writer);
            } else {
                needBrace = elseBlock.needsBraces();
                writer.print("else");
                if (needBrace)
                    writer.openBrace();
                else
                    writer.println();
                writer.tab();
                elseBlock.dumpSource(writer);
                writer.untab();
            }
        }
        if (needBrace)
            writer.closeBrace();
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return (elseBlock == null) ? new StructuredBlock[]{thenBlock} : new StructuredBlock[]{thenBlock, elseBlock};
    }

    /**
     * Determines if there is a sub block, that flows through to the end
     * of this block.  If this returns true, you know that jump is null.
     *
     * @return true, if the jump may be safely changed.
     */
    public boolean jumpMayBeChanged() {
        return (thenBlock.jump != null || thenBlock.jumpMayBeChanged()) && elseBlock != null && (elseBlock.jump != null || elseBlock.jumpMayBeChanged());
    }

    public void simplify() {
        cond = cond.simplify();
        super.simplify();
    }

    public boolean doTransformations() {
        StructuredBlock last = flowBlock.lastModified;
        return CreateCheckNull.transformJikes(this, last) || CreateClassField.transform(this, last);
    }
}
