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
 * A node that represents a local variable instruction. A local variable
 * instruction is an instruction that loads or stores the value of a local
 * variable.
 *
 * @author Eric Bruneton
 */
public class VarInsnNode extends AbstractInsnNode {

    /**
     * The operand of this instruction. This operand is the index of a local
     * variable.
     */
    public int var;

    /**
     * Constructs a new {@link VarInsnNode}.
     *
     * @param opcode the opcode of the local variable instruction to be
     *               constructed. This opcode must be ILOAD, LLOAD, FLOAD, DLOAD,
     *               ALOAD, ISTORE, LSTORE, FSTORE, DSTORE, ASTORE or RET.
     * @param var    the operand of the instruction to be constructed. This operand
     *               is the index of a local variable.
     */
    public VarInsnNode(final int opcode, final int var) {
        super(opcode);
        this.var = var;
    }

    /**
     * Sets the opcode of this instruction.
     *
     * @param opcode the new instruction opcode. This opcode must be ILOAD,
     *               LLOAD, FLOAD, DLOAD, ALOAD, ISTORE, LSTORE, FSTORE, DSTORE, ASTORE
     *               or RET.
     */
    public void setOpcode(final int opcode) {
        this.opcode = opcode;
    }

    public int getType() {
        return VAR_INSN;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitVarInsn(opcode, var);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new VarInsnNode(opcode, var);
    }
}