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

import java.util.Map;

import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.Opcodes;

/**
 * A node that represents a MULTIANEWARRAY instruction.
 *
 * @author Eric Bruneton
 */
public class MultiANewArrayInsnNode extends AbstractInsnNode {

    /**
     * An array type descriptor (see {@link com.ziotic.asm.Type}).
     */
    public String desc;

    /**
     * Number of dimensions of the array to allocate.
     */
    public int dims;

    /**
     * Constructs a new {@link MultiANewArrayInsnNode}.
     *
     * @param desc an array type descriptor (see {@link com.ziotic.asm.Type}).
     * @param dims number of dimensions of the array to allocate.
     */
    public MultiANewArrayInsnNode(final String desc, final int dims) {
        super(Opcodes.MULTIANEWARRAY);
        this.desc = desc;
        this.dims = dims;
    }

    public int getType() {
        return MULTIANEWARRAY_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitMultiANewArrayInsn(desc, dims);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new MultiANewArrayInsnNode(desc, dims);
    }
}