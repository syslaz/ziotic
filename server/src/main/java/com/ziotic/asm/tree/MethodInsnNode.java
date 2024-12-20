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
 * A node that represents a method instruction. A method instruction is an
 * instruction that invokes a method.
 *
 * @author Eric Bruneton
 */
public class MethodInsnNode extends AbstractInsnNode {

    /**
     * The internal name of the method's owner class (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     */
    public String owner;

    /**
     * The method's name.
     */
    public String name;

    /**
     * The method's descriptor (see {@link com.ziotic.asm.Type}).
     */
    public String desc;

    /**
     * Constructs a new {@link MethodInsnNode}.
     *
     * @param opcode the opcode of the type instruction to be constructed. This
     *               opcode must be INVOKEVIRTUAL, INVOKESPECIAL, INVOKESTATIC,
     *               INVOKEINTERFACE or INVOKEDYNAMIC.
     * @param owner  the internal name of the method's owner class (see
     *               {@link com.ziotic.asm.Type#getInternalName() getInternalName})
     *               or {@link com.ziotic.asm.Opcodes#INVOKEDYNAMIC_OWNER}.
     * @param name   the method's name.
     * @param desc   the method's descriptor (see {@link com.ziotic.asm.Type}).
     */
    public MethodInsnNode(final int opcode, final String owner, final String name, final String desc) {
        super(opcode);
        this.owner = owner;
        this.name = name;
        this.desc = desc;
    }

    /**
     * Sets the opcode of this instruction.
     *
     * @param opcode the new instruction opcode. This opcode must be
     *               INVOKEVIRTUAL, INVOKESPECIAL, INVOKESTATIC or INVOKEINTERFACE.
     */
    public void setOpcode(final int opcode) {
        this.opcode = opcode;
    }

    public int getType() {
        return METHOD_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitMethodInsn(opcode, owner, name, desc);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new MethodInsnNode(opcode, owner, name, desc);
    }
}