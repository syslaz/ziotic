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
 * A node that represents a zero operand instruction.
 *
 * @author Eric Bruneton
 */
public class InsnNode extends AbstractInsnNode {

    /**
     * Constructs a new {@link InsnNode}.
     *
     * @param opcode the opcode of the instruction to be constructed. This
     *               opcode must be NOP, ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1,
     *               ICONST_2, ICONST_3, ICONST_4, ICONST_5, LCONST_0, LCONST_1,
     *               FCONST_0, FCONST_1, FCONST_2, DCONST_0, DCONST_1, IALOAD, LALOAD,
     *               FALOAD, DALOAD, AALOAD, BALOAD, CALOAD, SALOAD, IASTORE, LASTORE,
     *               FASTORE, DASTORE, AASTORE, BASTORE, CASTORE, SASTORE, POP, POP2,
     *               DUP, DUP_X1, DUP_X2, DUP2, DUP2_X1, DUP2_X2, SWAP, IADD, LADD,
     *               FADD, DADD, ISUB, LSUB, FSUB, DSUB, IMUL, LMUL, FMUL, DMUL, IDIV,
     *               LDIV, FDIV, DDIV, IREM, LREM, FREM, DREM, INEG, LNEG, FNEG, DNEG,
     *               ISHL, LSHL, ISHR, LSHR, IUSHR, LUSHR, IAND, LAND, IOR, LOR, IXOR,
     *               LXOR, I2L, I2F, I2D, L2I, L2F, L2D, F2I, F2L, F2D, D2I, D2L, D2F,
     *               I2B, I2C, I2S, LCMP, FCMPL, FCMPG, DCMPL, DCMPG, IRETURN, LRETURN,
     *               FRETURN, DRETURN, ARETURN, RETURN, ARRAYLENGTH, ATHROW,
     *               MONITORENTER, or MONITOREXIT.
     */
    public InsnNode(final int opcode) {
        super(opcode);
    }

    public int getType() {
        return INSN;
    }

    /**
     * Makes the given visitor visit this instruction.
     *
     * @param mv a method visitor.
     */
    public void accept(final MethodVisitor mv) {
        mv.visitInsn(opcode);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new InsnNode(opcode);
    }
}
