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

import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.type.Type;

/**
 * This block represents a jsr instruction.  A jsr instruction is
 * used to call the finally block, or to call the monitorexit block in
 * a synchronized block.
 *
 * @author Jochen Hoenicke
 */
public class JsrBlock extends StructuredBlock {
    /**
     * The inner block that jumps to the subroutine.
     */
    StructuredBlock innerBlock;
    boolean good = false;

    public JsrBlock(Jump subroutine, Jump next) {
        innerBlock = new EmptyBlock(subroutine);
        innerBlock.outer = this;
        setJump(next);
    }

    public void setGood(boolean g) {
        good = g;
    }

    public boolean isGood() {
        return good;
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
        if (innerBlock == oldBlock)
            innerBlock = newBlock;
        else
            return false;
        return true;
    }

    /**
     * This is called after the analysis is completely done.  It
     * will remove all PUSH/stack_i expressions, (if the bytecode
     * is correct). <p>
     * The default implementation merges the stack after each sub block.
     * This may not be, what you want. <p>
     *
     * @param initialStack the stackmap at begin of the block
     * @return the stack after the block has executed.
     * @throw RuntimeException if something did get wrong.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        /* There shouldn't be any JSR blocks remaining, but who knows.
       */
        /* The innerBlock is startet with a new stack entry (return address)
       * It should GOTO immediately and never complete.
       */
        LocalInfo retAddr = new LocalInfo();
        retAddr.setType(Type.tUObject);
        innerBlock.mapStackToLocal(stack.push(retAddr));
        if (jump != null) {
            jump.stackMap = stack;
            return null;
        }
        return stack;
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return new StructuredBlock[]{innerBlock};
    }

    public void dumpInstruction(com.ziotic.jode.decompiler.TabbedPrintWriter writer) throws java.io.IOException {
        writer.println("JSR");
        writer.tab();
        innerBlock.dumpSource(writer);
        writer.untab();
    }
}
