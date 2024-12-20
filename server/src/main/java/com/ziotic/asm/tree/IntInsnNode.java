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
 * A node that represents an instruction with a single int operand.
 *
 * @author Eric Bruneton
 */
public class IntInsnNode extends AbstractInsnNode {

    /**
     * The operand of this instruction.
     */
    public int operand;

    /**
     * Constructs a new {@link IntInsnNode}.
     *
     * @param opcode  the opcode of the instruction to be constructed. This
     *                opcode must be BIPUSH, SIPUSH or NEWARRAY.
     * @param operand the operand of the instruction to be constructed.
     */
    public IntInsnNode(final int opcode, final int operand) {
        super(opcode);
        this.operand = operand;
    }

    /**
     * Sets the opcode of this instruction.
     *
     * @param opcode the new instruction opcode. This opcode must be BIPUSH,
     *               SIPUSH or NEWARRAY.
     */
    public void setOpcode(final int opcode) {
        this.opcode = opcode;
    }

    public int getType() {
        return INT_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitIntInsn(opcode, operand);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new IntInsnNode(opcode, operand);
    }
}
