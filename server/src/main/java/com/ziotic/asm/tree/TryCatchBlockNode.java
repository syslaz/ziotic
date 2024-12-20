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
package com.ziotic.asm.tree;

import com.ziotic.asm.MethodVisitor;

/**
 * A node that represents a try catch block.
 *
 * @author Eric Bruneton
 */
public class TryCatchBlockNode {

    /**
     * Beginning of the exception handler's scope (inclusive).
     */
    public LabelNode start;

    /**
     * End of the exception handler's scope (exclusive).
     */
    public LabelNode end;

    /**
     * Beginning of the exception handler's code.
     */
    public LabelNode handler;

    /**
     * Internal name of the type of exceptions handled by the handler. May be
     * <tt>null</tt> to catch any exceptions (for "finally" blocks).
     */
    public String type;

    /**
     * Constructs a new {@link TryCatchBlockNode}.
     *
     * @param start   beginning of the exception handler's scope (inclusive).
     * @param end     end of the exception handler's scope (exclusive).
     * @param handler beginning of the exception handler's code.
     * @param type    internal name of the type of exceptions handled by the
     *                handler, or <tt>null</tt> to catch any exceptions (for "finally"
     *                blocks).
     */
    public TryCatchBlockNode(final LabelNode start, final LabelNode end, final LabelNode handler, final String type) {
        this.start = start;
        this.end = end;
        this.handler = handler;
        this.type = type;
    }

    /**
     * Makes the given visitor visit this try catch block.
     *
     * @param mv a method visitor.
     */
    public void accept(final MethodVisitor mv) {
        mv.visitTryCatchBlock(start.getLabel(), end.getLabel(), handler == null ? null : handler.getLabel(), type);
    }
}
