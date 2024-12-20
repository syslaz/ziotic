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
 * A node that represents an LDC instruction.
 *
 * @author Eric Bruneton
 */
public class LdcInsnNode extends AbstractInsnNode {

    /**
     * The constant to be loaded on the stack. This parameter must be a non null
     * {@link Integer}, a {@link Float}, a {@link Long}, a {@link Double}, a
     * {@link String} or a {@link com.ziotic.asm.Type}.
     */
    public Object cst;

    /**
     * Constructs a new {@link LdcInsnNode}.
     *
     * @param cst the constant to be loaded on the stack. This parameter must be
     *            a non null {@link Integer}, a {@link Float}, a {@link Long}, a
     *            {@link Double} or a {@link String}.
     */
    public LdcInsnNode(final Object cst) {
        super(Opcodes.LDC);
        this.cst = cst;
    }

    public int getType() {
        return LDC_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitLdcInsn(cst);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new LdcInsnNode(cst);
    }
}