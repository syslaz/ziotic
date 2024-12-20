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

import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.expr.Expression;

/**
 * An ConditionalBlock is the structured block representing an if
 * instruction.  The else part may be null.
 */
public class ConditionalBlock extends InstructionContainer {
    /**
     * The loads that are on the stack before instr is executed.
     */
    VariableStack stack;

    EmptyBlock trueBlock;

    public void checkConsistent() {
        super.checkConsistent();
        if (trueBlock.jump == null || !(trueBlock instanceof EmptyBlock))
            throw new com.ziotic.jode.AssertError("Inconsistency");
    }

    /**
     * Creates a new if conditional block.
     */
    public ConditionalBlock(Expression cond, Jump condJump, Jump elseJump) {
        super(cond, elseJump);
        /* cond is a CompareBinary or CompareUnary operator, so no
         * check for LocalVarOperator (for condJump) is needed here.
         */
        trueBlock = new EmptyBlock(condJump);
        trueBlock.outer = this;
    }

    /**
     * Creates a new if conditional block.
     */
    public ConditionalBlock(Expression cond) {
        super(cond);
        /* cond is a CompareBinary or CompareUnary operator, so no
         * check for LocalVarOperator (for condJump) is needed here.
         */
        trueBlock = new EmptyBlock();
        trueBlock.outer = this;
    }

    /* The implementation of getNext[Flow]Block is the standard
     * implementation
     */

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return new StructuredBlock[]{trueBlock};
    }

    /**
     * Replaces the given sub block with a new block.
     *
     * @param oldBlock the old sub block.
     * @param newBlock the new sub block.
     * @return false, if oldBlock wasn't a direct sub block.
     */
    public boolean replaceSubBlock(StructuredBlock oldBlock, StructuredBlock newBlock) {
        throw new com.ziotic.jode.AssertError("replaceSubBlock on ConditionalBlock");
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
        int params = instr.getFreeOperandCount();
        if (params > 0) {
            this.stack = stack.peek(params);
            newStack = stack.pop(params);
        } else
            newStack = stack;

        trueBlock.jump.stackMap = newStack;
        if (jump != null) {
            jump.stackMap = newStack;
            return null;
        }
        return newStack;
    }

    public void removePush() {
        if (stack != null)
            instr = stack.mergeIntoExpression(instr);
        trueBlock.removePush();
    }

    /**
     * Print the source code for this structured block.
     */
    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print("IF (");
        instr.dumpExpression(writer.EXPL_PAREN, writer);
        writer.println(")");
        writer.tab();
        trueBlock.dumpSource(writer);
        writer.untab();
    }

    public boolean doTransformations() {
        StructuredBlock last = flowBlock.lastModified;
        return super.doTransformations() || CombineIfGotoExpressions.transform(this, last) || CreateIfThenElseOperator.createFunny(this, last);
    }
}
