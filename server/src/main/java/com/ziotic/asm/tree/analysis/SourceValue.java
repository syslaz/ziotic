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
package com.ziotic.asm.tree.analysis;

import java.util.Set;

import com.ziotic.asm.tree.AbstractInsnNode;

/**
 * A {@link Value} that is represented by its type in a two types type system.
 * This type system distinguishes the ONEWORD and TWOWORDS types.
 *
 * @author Eric Bruneton
 */
public class SourceValue implements Value {

    /**
     * The size of this value.
     */
    public final int size;

    /**
     * The instructions that can produce this value. For example, for the Java
     * code below, the instructions that can produce the value of <tt>i</tt>
     * at line 5 are the txo ISTORE instructions at line 1 and 3:
     * <p/>
     * <pre>
     * 1: i = 0;
     * 2: if (...) {
     * 3:   i = 1;
     * 4: }
     * 5: return i;
     * </pre>
     * <p/>
     * This field is a set of {@link com.ziotic.asm.tree.AbstractInsnNode} objects.
     */
    public final Set insns;

    public SourceValue(final int size) {
        this(size, SmallSet.EMPTY_SET);
    }

    public SourceValue(final int size, final AbstractInsnNode insn) {
        this.size = size;
        this.insns = new SmallSet(insn, null);
    }

    public SourceValue(final int size, final Set insns) {
        this.size = size;
        this.insns = insns;
    }

    public int getSize() {
        return size;
    }

    public boolean equals(final Object value) {
        if (!(value instanceof SourceValue)) {
            return false;
        }
        SourceValue v = (SourceValue) value;
        return size == v.size && insns.equals(v.insns);
    }

    public int hashCode() {
        return insns.hashCode();
    }
}
