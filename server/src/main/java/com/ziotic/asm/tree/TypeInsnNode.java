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

/**
 * A node that represents a type instruction. A type instruction is an
 * instruction that takes a type descriptor as parameter.
 *
 * @author Eric Bruneton
 */
public class TypeInsnNode extends AbstractInsnNode {

    /**
     * The operand of this instruction. This operand is an internal name (see
     * {@link com.ziotic.asm.Type}).
     */
    public String desc;

    /**
     * Constructs a new {@link TypeInsnNode}.
     *
     * @param opcode the opcode of the type instruction to be constructed. This
     *               opcode must be NEW, ANEWARRAY, CHECKCAST or INSTANCEOF.
     * @param desc   the operand of the instruction to be constructed. This
     *               operand is an internal name (see {@link com.ziotic.asm.Type}).
     */
    public TypeInsnNode(final int opcode, final String desc) {
        super(opcode);
        this.desc = desc;
    }

    /**
     * Sets the opcode of this instruction.
     *
     * @param opcode the new instruction opcode. This opcode must be NEW,
     *               ANEWARRAY, CHECKCAST or INSTANCEOF.
     */
    public void setOpcode(final int opcode) {
        this.opcode = opcode;
    }

    public int getType() {
        return TYPE_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitTypeInsn(opcode, desc);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new TypeInsnNode(opcode, desc);
    }
}