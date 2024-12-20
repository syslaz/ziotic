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
 * A node that represents a jump instruction. A jump instruction is an
 * instruction that may jump to another instruction.
 *
 * @author Eric Bruneton
 */
public class JumpInsnNode extends AbstractInsnNode {

    /**
     * The operand of this instruction. This operand is a label that designates
     * the instruction to which this instruction may jump.
     */
    public LabelNode label;

    /**
     * Constructs a new {@link JumpInsnNode}.
     *
     * @param opcode the opcode of the type instruction to be constructed. This
     *               opcode must be IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE, IF_ICMPEQ,
     *               IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ACMPEQ,
     *               IF_ACMPNE, GOTO, JSR, IFNULL or IFNONNULL.
     * @param label  the operand of the instruction to be constructed. This
     *               operand is a label that designates the instruction to which the
     *               jump instruction may jump.
     */
    public JumpInsnNode(final int opcode, final LabelNode label) {
        super(opcode);
        this.label = label;
    }

    /**
     * Sets the opcode of this instruction.
     *
     * @param opcode the new instruction opcode. This opcode must be IFEQ, IFNE,
     *               IFLT, IFGE, IFGT, IFLE, IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT,
     *               IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ACMPEQ, IF_ACMPNE, GOTO, JSR,
     *               IFNULL or IFNONNULL.
     */
    public void setOpcode(final int opcode) {
        this.opcode = opcode;
    }

    public int getType() {
        return JUMP_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitJumpInsn(opcode, label.getLabel());
    }

    public AbstractInsnNode clone(final Map labels) {
        return new JumpInsnNode(opcode, clone(label, labels));
    }
}
