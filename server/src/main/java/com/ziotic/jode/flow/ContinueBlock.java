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

/**
 *
 */
public class ContinueBlock extends StructuredBlock {
    LoopBlock continuesBlock;
    String continueLabel;

    public ContinueBlock(LoopBlock continuesBlock, boolean needsLabel) {
        this.continuesBlock = continuesBlock;
        if (needsLabel)
            continueLabel = continuesBlock.getLabel();
        else
            continueLabel = null;
    }

    public void checkConsistent() {
        super.checkConsistent();
        StructuredBlock sb = outer;
        while (sb != continuesBlock) {
            if (sb == null)
                throw new RuntimeException("Inconsistency");
            sb = sb.outer;
        }
    }

    /**
     * Tells if this block is empty and only changes control flow.
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * Returns the block where the control will normally flow to, when
     * this block is finished (not ignoring the jump after this block).
     */
    public StructuredBlock getNextBlock() {
        /* This continues to continuesBlock. */
        return continuesBlock;
    }

    /**
     * Returns the flow block where the control will normally flow to,
     * when this block is finished (not ignoring the jump after this
     * block).
     *
     * @return null, if the control flows into a non empty structured
     *         block or if this is the outermost block.
     */
    public FlowBlock getNextFlowBlock() {
        return null;
    }

    /**
     * This is called after the analysis is completely done.  It
     * will remove all PUSH/stack_i expressions, (if the bytecode
     * is correct).
     *
     * @param stack the stackmap at begin of the block
     * @return null if the bytecode isn't correct and stack mapping
     *         didn't worked, otherwise the stack after the block has executed.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        continuesBlock.mergeContinueStack(stack);
        return null;
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        writer.println("continue" + (continueLabel == null ? "" : " " + continueLabel) + ";");
    }

    public boolean needsBraces() {
        return false;
    }

    public boolean jumpMayBeChanged() {
        return true;
    }
}
