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

import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.expr.*;
import com.ziotic.jode.util.SimpleSet;

/**
 * This is the structured block for an Loop block.
 */
public class LoopBlock extends StructuredBlock implements BreakableBlock {

    public static final int WHILE = 0;
    public static final int DOWHILE = 1;
    public static final int FOR = 2;
    public static final int POSSFOR = 3;

    public static final Expression TRUE = new ConstOperator(Boolean.TRUE);
    public static final Expression FALSE = new ConstOperator(Boolean.FALSE);

    /**
     * The condition.  Must be of boolean type.
     */
    Expression cond;
    /**
     * The stack the condition eats.
     */
    VariableStack condStack;
    /**
     * The init instruction block, only valid if type == POSSFOR
     */
    InstructionBlock initBlock;
    /**
     * The increase instruction block, only valid if type == POSSFOR.
     */
    InstructionBlock incrBlock;

    /**
     * The init instruction, only valid if type == FOR.
     */
    Expression initInstr;
    /**
     * The increase instruction, only valid if type == FOR.
     */
    Expression incrInstr;

    /**
     * True, if the initializer is a declaration.
     */
    boolean isDeclaration;

    /**
     * The type of the loop.  This must be one of DOWHILE, WHILE or FOR.
     */
    int type;

    /**
     * The body of this loop.  This is always a valid block and not null.
     */
    StructuredBlock bodyBlock;

    /**
     * The stack after the break.
     */
    VariableStack breakedStack;

    /**
     * The stack at begin of the loop.
     */
    VariableStack continueStack;

    /*{ invariant { type == POSSFOR || (incrBlock == null && initBlock == null)
            :: "(while/do while) with incr";
            type == FOR || (incrInstr == null && initInstr == null)
            :: "(while/do while/poss for) with init";
            type != POSSFOR || incrBlock != null
            :: "possible for without incr";
            type != FOR || incrInstr != null
            :: "for without incr";
            type != POSSFOR ||
                    incrBlock.getInstruction() instanceof CombineableOperator
            :: "possible for with invalid incr";
            initBlock == null ||
            (initBlock.getInstruction() instanceof CombinableOperator)
            :: "Initializer is not combinableOperator";
            initInstr == null ||
            (initInstr instanceof CombinableOperator)
            :: "Initializer is not combinableOperator";
            cond != null && cond.getType() == Type.tBoolean
            :: "invalid condition type";
            type != POSSFOR || bodyBlock.contains(incr)
            :: "incr is not in body of possible for" } }*/

    /**
     * Returns the block where the control will normally flow to, when
     * the given sub block is finished (<em>not</em> ignoring the jump
     * after this block). (This is overwritten by SequentialBlock and
     * SwitchBlock).  If this isn't called with a direct sub block,
     * the behaviour is undefined, so take care.
     *
     * @return null, if the control flows to another FlowBlock.
     */
    public StructuredBlock getNextBlock(StructuredBlock subBlock) {
        return this;
    }

    public FlowBlock getNextFlowBlock(StructuredBlock subBlock) {
        return null;
    }

    public LoopBlock(int type, Expression cond) {
        this.type = type;
        this.cond = cond;
        this.mayChangeJump = (cond == TRUE);
    }

    public void setBody(StructuredBlock body) {
        bodyBlock = body;
        bodyBlock.outer = this;
        body.setFlowBlock(flowBlock);
    }

    public void setInit(InstructionBlock initBlock) {
        if (type == POSSFOR) {
            this.initBlock = initBlock;
        } else if (type == FOR) {
            this.initInstr = initBlock.getInstruction();
            initBlock.removeBlock();
        }
    }

    public boolean conditionMatches(CombineableOperator combinable) {
        return (type == POSSFOR || cond.containsMatchingLoad(combinable));
    }

    public Expression getCondition() {
        return cond;
    }

    public void setCondition(Expression cond) {
        this.cond = cond;
        if (type == POSSFOR) {
            /* We can now say, if this is a for block or not.
             */
            if (cond.containsMatchingLoad((CombineableOperator) incrBlock.getInstruction())) {
                type = FOR;
                incrInstr = incrBlock.getInstruction();
                incrBlock.removeBlock();
                if (initBlock != null) {
                    if (cond.containsMatchingLoad((CombineableOperator) initBlock.getInstruction())) {
                        initInstr = initBlock.getInstruction();
                        initBlock.removeBlock();
                    }
                }
            } else {
                /* This is not a for block, as it seems first.  Make
                 * it a while block again, and forget about init and
                 * incr.  */
                type = WHILE;
            }
            initBlock = incrBlock = null;
        }
        mayChangeJump = false;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /**
     * Replaces the given sub block with a new block.
     *
     * @param oldBlock the old sub block.
     * @param newBlock the new sub block.
     * @return false, if oldBlock wasn't a direct sub block.
     */
    public boolean replaceSubBlock(StructuredBlock oldBlock, StructuredBlock newBlock) {
        if (bodyBlock == oldBlock)
            bodyBlock = newBlock;
        else
            return false;
        return true;
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return new StructuredBlock[]{bodyBlock};
    }

    /**
     * Remove all variables from set, that we can declare inside the
     * loop-block.  This is the initializer for for-blocks.
     */
    public void removeLocallyDeclareable(Set set) {
        if (type == FOR && initInstr instanceof StoreInstruction) {
            StoreInstruction storeOp = (StoreInstruction) initInstr;
            if (storeOp.getLValue() instanceof LocalStoreOperator) {
                LocalInfo local = ((LocalStoreOperator) storeOp.getLValue()).getLocalInfo();
                set.remove(local);
            }
        }
    }

    public Set getDeclarables() {
        Set used = new SimpleSet();
        if (type == FOR) {
            incrInstr.fillDeclarables(used);
            if (initInstr != null)
                initInstr.fillDeclarables(used);
        }
        cond.fillDeclarables(used);
        return used;
    }

    /**
     * Check if this is an local store instruction to a not yet declared
     * variable.  In that case mark this as declaration and return the
     * variable.
     */
    public void checkDeclaration(Set declareSet) {
        if (initInstr instanceof StoreInstruction && (((StoreInstruction) initInstr).getLValue() instanceof LocalStoreOperator)) {
            StoreInstruction storeOp = (StoreInstruction) initInstr;
            LocalInfo local = ((LocalStoreOperator) storeOp.getLValue()).getLocalInfo();
            if (declareSet.contains(local)) {
                /* Special case: This is a variable assignment, and
             * the variable has not been declared before.  We can
             * change this to a initializing variable declaration.
             */
                isDeclaration = true;
                declareSet.remove(local);
            }
        }
    }

    /**
     * Make the declarations, i.e. initialize the declare variable
     * to correct values.  This will declare every variable that
     * is marked as used, but not done.
     *
     * @param done The set of the already declare variables.
     */
    public void makeDeclaration(Set done) {
        if (type == FOR) {
            if (initInstr != null)
                initInstr.makeDeclaration(done);
            incrInstr.makeDeclaration(done);
        }
        cond.makeDeclaration(done);
        super.makeDeclaration(done);
        if (type == FOR && initInstr != null)
            checkDeclaration(declare);
    }

    public void dumpSource(TabbedPrintWriter writer) throws java.io.IOException {
        super.dumpSource(writer);
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        if (label != null) {
            writer.untab();
            writer.println(label + ":");
            writer.tab();
        }
        boolean needBrace = bodyBlock.needsBraces();
        switch (type) {
            case POSSFOR:
                /* a possible for is now treated like a WHILE */
            case WHILE:
                if (cond == TRUE)
                    /* special syntax for endless loops: */
                    writer.print("for (;;)");
                else {
                    writer.print("while (");
                    cond.dumpExpression(writer.EXPL_PAREN, writer);
                    writer.print(")");
                }
                break;
            case DOWHILE:
                writer.print("do");
                break;
            case FOR:
                writer.print("for (");
                writer.startOp(writer.EXPL_PAREN, 0);
                if (initInstr != null) {
                    if (isDeclaration) {
                        StoreInstruction store = (StoreInstruction) initInstr;
                        LocalInfo local = ((LocalStoreOperator) store.getLValue()).getLocalInfo();
                        writer.startOp(writer.NO_PAREN, 1);
                        local.dumpDeclaration(writer);
                        writer.breakOp();
                        writer.print(" = ");
                        store.getSubExpressions()[1].makeInitializer(local.getType());
                        store.getSubExpressions()[1].dumpExpression(writer, 100);
                        writer.endOp();
                    } else
                        initInstr.dumpExpression(writer.NO_PAREN, writer);
                } else {
                    writer.print("/**/");
                }
                writer.print("; ");
                writer.breakOp();
                cond.dumpExpression(writer.IMPL_PAREN, writer);
                writer.print("; ");
                writer.breakOp();
                incrInstr.dumpExpression(writer.NO_PAREN, writer);
                writer.endOp();
                writer.print(")");
                break;
        }
        if (needBrace)
            writer.openBrace();
        else
            writer.println();
        writer.tab();
        bodyBlock.dumpSource(writer);
        writer.untab();
        if (type == DOWHILE) {
            if (needBrace)
                writer.closeBraceContinue();
            writer.print("while (");
            cond.dumpExpression(writer.EXPL_PAREN, writer);
            writer.println(");");
        } else if (needBrace)
            writer.closeBrace();
    }

    boolean mayChangeJump = true;

    /**
     * The serial number for labels.
     */
    static int serialno = 0;

    /**
     * The label of this instruction, or null if it needs no label.
     */
    String label = null;

    /**
     * Returns the label of this block and creates a new label, if
     * there wasn't a label previously.
     */
    public String getLabel() {
        if (label == null)
            label = "while_" + (serialno++) + "_";
        return label;
    }

    /**
     * Is called by BreakBlock, to tell us that this block is breaked.
     */
    public void setBreaked() {
        mayChangeJump = false;
    }

    /**
     * This is called after the analysis is completely done.  It
     * will remove all PUSH/stack_i expressions, (if the bytecode
     * is correct).
     *
     * @param stack the stack at begin of the block
     * @return null if there is no way to the end of this block,
     *         otherwise the stack after the block has executed.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        if (type == DOWHILE) {
            VariableStack afterBody = bodyBlock.mapStackToLocal(stack);
            if (afterBody != null)
                mergeContinueStack(afterBody);

            if (continueStack != null) {
                VariableStack newStack;
                int params = cond.getFreeOperandCount();
                if (params > 0) {
                    condStack = continueStack.peek(params);
                    newStack = continueStack.pop(params);
                } else
                    newStack = continueStack;

                if (cond != TRUE)
                    mergeBreakedStack(newStack);
                if (cond != FALSE)
                    stack.merge(newStack);
            }
        } else {
            continueStack = stack;
            VariableStack newStack;
            int params = cond.getFreeOperandCount();
            if (params > 0) {
                condStack = stack.peek(params);
                newStack = stack.pop(params);
            } else
                newStack = stack;
            if (cond != TRUE)
                breakedStack = newStack;
            VariableStack afterBody = bodyBlock.mapStackToLocal(newStack);
            if (afterBody != null)
                mergeContinueStack(afterBody);
        }
        return breakedStack;
    }

    /**
     * Is called by BreakBlock, to tell us what the stack can be after a
     * break.
     *
     * @return false if the stack is inconsistent.
     */
    public void mergeContinueStack(VariableStack stack) {
        if (continueStack == null)
            continueStack = stack;
        else
            continueStack.merge(stack);
    }

    /**
     * Is called by BreakBlock, to tell us what the stack can be after a
     * break.
     *
     * @return false if the stack is inconsistent.
     */
    public void mergeBreakedStack(VariableStack stack) {
        if (breakedStack != null)
            breakedStack.merge(stack);
        else
            breakedStack = stack;
    }

    public void removePush() {
        if (condStack != null)
            cond = condStack.mergeIntoExpression(cond);
        bodyBlock.removePush();
    }

    /**
     * This method should remove local variables that are only written
     * and read one time directly after another.  <br>
     * <p/>
     * This is especially important for stack locals, that are created
     * when there are unusual swap or dup instructions, but also makes
     * inlined functions more pretty (but not that close to the
     * bytecode).
     */
    public void removeOnetimeLocals() {
        cond = cond.removeOnetimeLocals();
        if (type == FOR) {
            if (initInstr != null)
                initInstr.removeOnetimeLocals();
            incrInstr.removeOnetimeLocals();
        }
        super.removeOnetimeLocals();
    }

    /**
     * Replace all breaks to block with a continue to this.
     *
     * @param block the breakable block where the breaks originally
     *              breaked to (Have a break now, if you didn't understand that :-).
     */
    public void replaceBreakContinue(BreakableBlock block) {
        java.util.Stack todo = new java.util.Stack();
        todo.push(block);
        while (!todo.isEmpty()) {
            StructuredBlock[] subs = ((StructuredBlock) todo.pop()).getSubBlocks();
            for (int i = 0; i < subs.length; i++) {
                if (subs[i] instanceof BreakBlock) {
                    BreakBlock breakblk = (BreakBlock) subs[i];
                    if (breakblk.breaksBlock == block) {
                        new ContinueBlock(this, breakblk.label != null).replace(breakblk);
                    }
                }
                todo.push(subs[i]);
            }
        }
    }

    /**
     * Determines if there is a sub block, that flows through to the end
     * of this block.  If this returns true, you know that jump is null.
     *
     * @return true, if the jump may be safely changed.
     */
    public boolean jumpMayBeChanged() {
        return mayChangeJump;
    }

    public void simplify() {
        cond = cond.simplify();
        if (type == FOR) {
            incrInstr = incrInstr.simplify();
            if (initInstr != null)
                initInstr = initInstr.simplify();
        }
        super.simplify();
    }

    public boolean doTransformations() {
        return ((initBlock == null && type == POSSFOR) || (initInstr == null && type == FOR)) && CreateForInitializer.transform(this, flowBlock.lastModified);
    }
}
