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
 * This is the structured block for an empty block.
 */
public class EmptyBlock extends StructuredBlock {
    public EmptyBlock() {
    }

    public EmptyBlock(Jump jump) {
        setJump(jump);
    }

    /**
     * Tells if this block is empty and only changes control flow.
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * Appends a block to this block.
     *
     * @return the new combined block.
     */
    public StructuredBlock appendBlock(StructuredBlock block) {
        if (outer instanceof ConditionalBlock) {
            IfThenElseBlock ifBlock = new IfThenElseBlock(((ConditionalBlock) outer).
                    getInstruction());
            ifBlock.moveDefinitions(outer, this);
            ifBlock.replace(outer);
            ifBlock.moveJump(outer.jump);
            ifBlock.setThenBlock(this);
        }
        block.replace(this);
        return block;
    }

    /**
     * Prepends a block to this block.
     *
     * @return the new combined block.
     */
    public StructuredBlock prependBlock(StructuredBlock block) {
        /* For empty blocks: append == prepend modulo jump */
        block = appendBlock(block);
        block.moveJump(this.jump);
        return block;
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        /* Only print the comment if jump null, since otherwise the block
       * isn't completely empty ;-)
       */
        if (jump == null)
            writer.println("/* empty */");
    }
}
