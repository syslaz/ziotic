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

/**
 * @author Jochen Hoenicke
 */
public class FinallyBlock extends StructuredBlock {
    /**
     * The catch block.
     */
    StructuredBlock subBlock;

    public FinallyBlock() {
    }

    /**
     * Sets the catch block.
     *
     * @param subBlock the catch block.
     */
    public void setCatchBlock(StructuredBlock subBlock) {
        this.subBlock = subBlock;
        subBlock.outer = this;
        subBlock.setFlowBlock(flowBlock);
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
        if (subBlock == oldBlock)
            subBlock = newBlock;
        else
            return false;
        return true;
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return new StructuredBlock[]{subBlock};
    }

    /**
     * A finally block starts with empty stack.  It must return with empty
     * stack too, but that need not to be checked.  If the JSR's aren't
     * correctly determined this may even not be true.
     *
     * @param stack the stack before the instruction is called
     * @return stack the stack afterwards.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        super.mapStackToLocal(stack);
        return null;
    }

    /**
     * Returns the block where the control will normally flow to, when
     * the given sub block is finished (<em>not</em> ignoring the jump
     * after this block).  FinallyBlock have a special behaviour, since
     * the finally block has no default successor at all (it is more a
     * subroutine) that will be called by try or any exception.
     *
     * @return null, if the control flows to another FlowBlock.
     */
    public StructuredBlock getNextBlock(StructuredBlock subBlock) {
        return null;
    }

    public FlowBlock getNextFlowBlock(StructuredBlock subBlock) {
        return null;
    }

    public void dumpInstruction(com.ziotic.jode.decompiler.TabbedPrintWriter writer) throws java.io.IOException {
        writer.closeBraceContinue();
        writer.print("finally");
        writer.openBrace();
        writer.tab();
        subBlock.dumpSource(writer);
        writer.untab();
    }
}
