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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ziotic.asm.Opcodes;
import com.ziotic.asm.Type;
import com.ziotic.asm.tree.AbstractInsnNode;
import com.ziotic.asm.tree.FieldInsnNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodInsnNode;

/**
 * An {@link Interpreter} for {@link SourceValue} values.
 *
 * @author Eric Bruneton
 */
public class SourceInterpreter implements Opcodes, Interpreter {

    public Value newValue(final Type type) {
        if (type == Type.VOID_TYPE) {
            return null;
        }
        return new SourceValue(type == null ? 1 : type.getSize());
    }

    public Value newOperation(final AbstractInsnNode insn) {
        int size;
        switch (insn.getOpcode()) {
            case LCONST_0:
            case LCONST_1:
            case DCONST_0:
            case DCONST_1:
                size = 2;
                break;
            case LDC:
                Object cst = ((LdcInsnNode) insn).cst;
                size = cst instanceof Long || cst instanceof Double ? 2 : 1;
                break;
            case GETSTATIC:
                size = Type.getType(((FieldInsnNode) insn).desc).getSize();
                break;
            default:
                size = 1;
        }
        return new SourceValue(size, insn);
    }

    public Value copyOperation(final AbstractInsnNode insn, final Value value) {
        return new SourceValue(value.getSize(), insn);
    }

    public Value unaryOperation(final AbstractInsnNode insn, final Value value) {
        int size;
        switch (insn.getOpcode()) {
            case LNEG:
            case DNEG:
            case I2L:
            case I2D:
            case L2D:
            case F2L:
            case F2D:
            case D2L:
                size = 2;
                break;
            case GETFIELD:
                size = Type.getType(((FieldInsnNode) insn).desc).getSize();
                break;
            default:
                size = 1;
        }
        return new SourceValue(size, insn);
    }

    public Value binaryOperation(final AbstractInsnNode insn, final Value value1, final Value value2) {
        int size;
        switch (insn.getOpcode()) {
            case LALOAD:
            case DALOAD:
            case LADD:
            case DADD:
            case LSUB:
            case DSUB:
            case LMUL:
            case DMUL:
            case LDIV:
            case DDIV:
            case LREM:
            case DREM:
            case LSHL:
            case LSHR:
            case LUSHR:
            case LAND:
            case LOR:
            case LXOR:
                size = 2;
                break;
            default:
                size = 1;
        }
        return new SourceValue(size, insn);
    }

    public Value ternaryOperation(final AbstractInsnNode insn, final Value value1, final Value value2, final Value value3) {
        return new SourceValue(1, insn);
    }

    public Value naryOperation(final AbstractInsnNode insn, final List values) {
        int size;
        if (insn.getOpcode() == MULTIANEWARRAY) {
            size = 1;
        } else {
            size = Type.getReturnType(((MethodInsnNode) insn).desc).getSize();
        }
        return new SourceValue(size, insn);
    }

    public void returnOperation(final AbstractInsnNode insn, final Value value, final Value expected) {
    }

    public Value merge(final Value v, final Value w) {
        SourceValue dv = (SourceValue) v;
        SourceValue dw = (SourceValue) w;
        if (dv.insns instanceof SmallSet && dw.insns instanceof SmallSet) {
            Set s = ((SmallSet) dv.insns).union((SmallSet) dw.insns);
            if (s == dv.insns && dv.size == dw.size) {
                return v;
            } else {
                return new SourceValue(Math.min(dv.size, dw.size), s);
            }
        }
        if (dv.size != dw.size || !dv.insns.containsAll(dw.insns)) {
            Set s = new HashSet();
            s.addAll(dv.insns);
            s.addAll(dw.insns);
            return new SourceValue(Math.min(dv.size, dw.size), s);
        }
        return v;
    }
}
