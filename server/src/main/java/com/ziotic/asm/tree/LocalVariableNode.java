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
 * A node that represents a local variable declaration.
 *
 * @author Eric Bruneton
 */
public class LocalVariableNode {

    /**
     * The name of a local variable.
     */
    public String name;

    /**
     * The type descriptor of this local variable.
     */
    public String desc;

    /**
     * The signature of this local variable. May be <tt>null</tt>.
     */
    public String signature;

    /**
     * The first instruction corresponding to the scope of this local variable
     * (inclusive).
     */
    public LabelNode start;

    /**
     * The last instruction corresponding to the scope of this local variable
     * (exclusive).
     */
    public LabelNode end;

    /**
     * The local variable's index.
     */
    public int index;

    /**
     * Constructs a new {@link LocalVariableNode}.
     *
     * @param name      the name of a local variable.
     * @param desc      the type descriptor of this local variable.
     * @param signature the signature of this local variable. May be
     *                  <tt>null</tt>.
     * @param start     the first instruction corresponding to the scope of this
     *                  local variable (inclusive).
     * @param end       the last instruction corresponding to the scope of this local
     *                  variable (exclusive).
     * @param index     the local variable's index.
     */
    public LocalVariableNode(final String name, final String desc, final String signature, final LabelNode start, final LabelNode end, final int index) {
        this.name = name;
        this.desc = desc;
        this.signature = signature;
        this.start = start;
        this.end = end;
        this.index = index;
    }

    /**
     * Makes the given visitor visit this local variable declaration.
     *
     * @param mv a method visitor.
     */
    public void accept(final MethodVisitor mv) {
        mv.visitLocalVariable(name, desc, signature, start.getLabel(), end.getLabel(), index);
    }
}
