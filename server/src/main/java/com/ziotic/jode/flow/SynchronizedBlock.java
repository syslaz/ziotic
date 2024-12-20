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
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.util.SimpleSet;

/**
 * This class represents a synchronized structured block.
 *
 * @author Jochen Hoenicke
 */
public class SynchronizedBlock extends StructuredBlock {

    Expression object;
    LocalInfo local;
    boolean isEntered;

    StructuredBlock bodyBlock;

    public SynchronizedBlock(LocalInfo local) {
        this.local = local;
    }

    /**
     * Sets the body block.
     */
    public void setBodyBlock(StructuredBlock body) {
        bodyBlock = body;
        body.outer = this;
        body.setFlowBlock(flowBlock);
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return new StructuredBlock[]{bodyBlock};
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

    public Set getDeclarables() {
        Set used = new SimpleSet();
        if (object != null)
            object.fillDeclarables(used);
        else
            used.add(local);
        return used;
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        if (!isEntered)
            writer.println("MISSING MONITORENTER");
        writer.print("synchronized (");
        if (object != null)
            object.dumpExpression(writer.EXPL_PAREN, writer);
        else
            writer.print(local.getName());
        writer.print(")");
        writer.openBrace();
        writer.tab();
        bodyBlock.dumpSource(writer);
        writer.untab();
        writer.closeBrace();
    }

    public void simplify() {
        if (object != null)
            object = object.simplify();
        super.simplify();
    }

    public boolean doTransformations() {
        StructuredBlock last = flowBlock.lastModified;
        return (!isEntered && CompleteSynchronized.enter(this, last)) || (isEntered && object == null && CompleteSynchronized.combineObject(this, last));
    }
}
