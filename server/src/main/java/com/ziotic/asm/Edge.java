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
package com.ziotic.asm;

/**
 * An edge in the control flow graph of a method body. See {@link Label Label}.
 *
 * @author Eric Bruneton
 */
class Edge {

    /**
     * Denotes a normal control flow graph edge.
     */
    static final int NORMAL = 0;

    /**
     * Denotes a control flow graph edge corresponding to an exception handler.
     * More precisely any {@link Edge} whose {@link #info} is strictly positive
     * corresponds to an exception handler. The actual value of {@link #info} is
     * the index, in the {@link ClassWriter} type table, of the exception that
     * is catched.
     */
    static final int EXCEPTION = 0x7FFFFFFF;

    /**
     * Information about this control flow graph edge. If
     * {@link ClassWriter#COMPUTE_MAXS} is used this field is the (relative)
     * stack size in the basic block from which this edge originates. This size
     * is equal to the stack size at the "jump" instruction to which this edge
     * corresponds, relatively to the stack size at the beginning of the
     * originating basic block. If {@link ClassWriter#COMPUTE_FRAMES} is used,
     * this field is the kind of this control flow graph edge (i.e. NORMAL or
     * EXCEPTION).
     */
    int info;

    /**
     * The successor block of the basic block from which this edge originates.
     */
    Label successor;

    /**
     * The next edge in the list of successors of the originating basic block.
     * See {@link Label#successors successors}.
     */
    Edge next;
}
