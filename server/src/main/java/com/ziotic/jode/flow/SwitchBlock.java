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
 * This is the structured block for an empty block.
 */
public class SwitchBlock extends InstructionContainer implements BreakableBlock {
    CaseBlock[] caseBlocks;
    VariableStack exprStack;
    VariableStack breakedStack;

    public SwitchBlock(Expression instr, int[] cases, FlowBlock[] dests) {
        super(instr);

        /* First remove all dests that jump to the default dest. */
        int numCases = dests.length;
        FlowBlock defaultDest = dests[cases.length];
        for (int i = 0; i < cases.length; i++) {
            if (dests[i] == defaultDest) {
                dests[i] = null;
                numCases--;
            }
        }

        caseBlocks = new CaseBlock[numCases];
        FlowBlock lastDest = null;
        for (int i = numCases - 1; i >= 0; i--) {
            /**
             * Sort the destinations by finding the greatest destAddr
             */
            int index = 0;
            for (int j = 1; j < dests.length; j++) {
                if (dests[j] != null && (dests[index] == null || dests[j].getAddr() >= dests[index].getAddr()))
                    index = j;
            }
            /* assert(dests[index] != null) */

            int value;
            if (index == cases.length)
                value = -1;
            else
                value = cases[index];

            if (dests[index] == lastDest)
                caseBlocks[i] = new CaseBlock(value);
            else
                caseBlocks[i] = new CaseBlock(value, new Jump(dests[index]));
            caseBlocks[i].outer = this;
            lastDest = dests[index];
            dests[index] = null;
            if (index == cases.length)
                caseBlocks[i].isDefault = true;
        }
        caseBlocks[numCases - 1].isLastBlock = true;
        this.jump = null;
        isBreaked = false;
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
            exprStack = stack.peek(params);
            newStack = stack.pop(params);
        } else
            newStack = stack;
        VariableStack lastStack = newStack;
        for (int i = 0; i < caseBlocks.length; i++) {
            if (lastStack != null)
                newStack.merge(lastStack);
            lastStack = caseBlocks[i].mapStackToLocal(newStack);
        }
        if (lastStack != null)
            mergeBreakedStack(lastStack);
        if (jump != null) {
            jump.stackMap = breakedStack;
            return null;
        }
        return breakedStack;
    }

    /**
     * Is called by BreakBlock, to tell us what the stack can be after a
     * break.
     */
    public void mergeBreakedStack(VariableStack stack) {
        if (breakedStack != null)
            breakedStack.merge(stack);
        else
            breakedStack = stack;
    }

    public void removePush() {
        if (exprStack != null)
            instr = exprStack.mergeIntoExpression(instr);
        super.removePush();
    }

    /**
     * Find the case that jumps directly to destination.
     *
     * @return The sub block of the case block, which jumps to destination.
     */
    public StructuredBlock findCase(FlowBlock destination) {
        for (int i = 0; i < caseBlocks.length; i++) {
            if (caseBlocks[i].subBlock != null && caseBlocks[i].subBlock instanceof EmptyBlock && caseBlocks[i].subBlock.jump != null && caseBlocks[i].subBlock.jump.destination == destination)

                return caseBlocks[i].subBlock;
        }
        return null;
    }

    /**
     * Find the case that precedes the given case.
     *
     * @param block The sub block of the case, whose predecessor should
     *              be returned.
     * @return The sub block of the case precedes the given case.
     */
    public StructuredBlock prevCase(StructuredBlock block) {
        for (int i = caseBlocks.length - 1; i >= 0; i--) {
            if (caseBlocks[i].subBlock == block) {
                for (i--; i >= 0; i--) {
                    if (caseBlocks[i].subBlock != null)
                        return caseBlocks[i].subBlock;
                }
            }
        }
        return null;
    }

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
        for (int i = 0; i < caseBlocks.length - 1; i++) {
            if (subBlock == caseBlocks[i]) {
                return caseBlocks[i + 1];
            }
        }
        return getNextBlock();
    }

    public FlowBlock getNextFlowBlock(StructuredBlock subBlock) {
        for (int i = 0; i < caseBlocks.length - 1; i++) {
            if (subBlock == caseBlocks[i]) {
                return null;
            }
        }
        return getNextFlowBlock();
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        if (label != null) {
            writer.untab();
            writer.println(label + ":");
            writer.tab();
        }
        writer.print("switch (");
        instr.dumpExpression(writer.EXPL_PAREN, writer);
        writer.print(")");
        writer.openBrace();
        for (int i = 0; i < caseBlocks.length; i++)
            caseBlocks[i].dumpSource(writer);
        writer.closeBrace();
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return caseBlocks;
    }

    boolean isBreaked = false;

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
            label = "switch_" + (serialno++) + "_";
        return label;
    }

    /**
     * Is called by BreakBlock, to tell us that this block is breaked.
     */
    public void setBreaked() {
        isBreaked = true;
    }

    /**
     * Determines if there is a sub block, that flows through to the end
     * of this block.  If this returns true, you know that jump is null.
     *
     * @return true, if the jump may be safely changed.
     */
    public boolean jumpMayBeChanged() {
        return !isBreaked && (caseBlocks[caseBlocks.length - 1].jump != null || caseBlocks[caseBlocks.length - 1].jumpMayBeChanged());
    }
}
