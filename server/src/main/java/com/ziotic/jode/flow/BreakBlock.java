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
public class BreakBlock extends StructuredBlock {
    StructuredBlock breaksBlock;
    String label;

    public BreakBlock(BreakableBlock breaksBlock, boolean needsLabel) {
        this.breaksBlock = (StructuredBlock) breaksBlock;
        breaksBlock.setBreaked();
        if (needsLabel)
            label = breaksBlock.getLabel();
        else
            label = null;
    }

    public void checkConsistent() {
        super.checkConsistent();
        StructuredBlock sb = outer;
        while (sb != breaksBlock) {
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
     * this block is finished.
     */
    public StructuredBlock getNextBlock() {
        return breaksBlock.getNextBlock();
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
        return breaksBlock.getNextFlowBlock();
    }

    /**
     * This is called after the analysis is completely done.  It
     * will remove all PUSH/stack_i expressions, (if the bytecode
     * is correct).
     *
     * @param stack the stackmap at begin of the block
     * @return null since the stack has no successor.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        ((BreakableBlock) breaksBlock).mergeBreakedStack(stack);
        return null;
    }

    /**
     * Tells if this block needs braces when used in a if or while block.
     *
     * @return true if this block should be sorrounded by braces.
     */
    public boolean needsBraces() {
        return false;
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        writer.println("break" + (label == null ? "" : " " + label) + ";");
    }

    public boolean jumpMayBeChanged() {
        return true;
    }
}
