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
 * A node that represents a field instruction. A field instruction is an
 * instruction that loads or stores the value of a field of an object.
 *
 * @author Eric Bruneton
 */
public class FieldInsnNode extends AbstractInsnNode {

    /**
     * The internal name of the field's owner class (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     */
    public String owner;

    /**
     * The field's name.
     */
    public String name;

    /**
     * The field's descriptor (see {@link com.ziotic.asm.Type}).
     */
    public String desc;

    /**
     * Constructs a new {@link FieldInsnNode}.
     *
     * @param opcode the opcode of the type instruction to be constructed. This
     *               opcode must be GETSTATIC, PUTSTATIC, GETFIELD or PUTFIELD.
     * @param owner  the internal name of the field's owner class (see
     *               {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     * @param name   the field's name.
     * @param desc   the field's descriptor (see {@link com.ziotic.asm.Type}).
     */
    public FieldInsnNode(final int opcode, final String owner, final String name, final String desc) {
        super(opcode);
        this.owner = owner;
        this.name = name;
        this.desc = desc;
    }

    /**
     * Sets the opcode of this instruction.
     *
     * @param opcode the new instruction opcode. This opcode must be GETSTATIC,
     *               PUTSTATIC, GETFIELD or PUTFIELD.
     */
    public void setOpcode(final int opcode) {
        this.opcode = opcode;
    }

    public int getType() {
        return FIELD_INSN;
    }

    public void accept(final MethodVisitor cv) {
        cv.visitFieldInsn(opcode, owner, name, desc);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new FieldInsnNode(opcode, owner, name, desc);
    }
}
