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
package com.ziotic.jode.jvm;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import com.ziotic.jode.AssertError;
import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.*;

/**
 * This class is a java virtual machine written in java :-).  Well not
 * exactly.  It does only handle a subset of the opcodes and is mainly
 * written do deobfuscate Strings.
 *
 * @author Jochen Hoenicke
 */
public class Interpreter implements Opcodes {

    private final static int CMP_EQ = 0;
    private final static int CMP_NE = 1;
    private final static int CMP_LT = 2;
    private final static int CMP_GE = 3;
    private final static int CMP_GT = 4;
    private final static int CMP_LE = 5;
    private final static int CMP_GREATER_MASK = (1 << CMP_GT) | (1 << CMP_GE) | (1 << CMP_NE);
    private final static int CMP_LESS_MASK = (1 << CMP_LT) | (1 << CMP_LE) | (1 << CMP_NE);
    private final static int CMP_EQUAL_MASK = (1 << CMP_GE) | (1 << CMP_LE) | (1 << CMP_EQ);

    private RuntimeEnvironment env;

    public Interpreter(RuntimeEnvironment env) {
        this.env = env;
    }

    private Value[] fillParameters(BytecodeInfo code, Object cls, Object[] params) {
        Value[] locals = new Value[code.getMaxLocals()];
        for (int i = 0; i < locals.length; i++)
            locals[i] = new Value();

        String myType = code.getMethodInfo().getType();
        String[] myParamTypes = TypeSignature.getParameterTypes(myType);
        int slot = 0;
        if (!code.getMethodInfo().isStatic())
            locals[slot++].setObject(cls);
        for (int i = 0; i < myParamTypes.length; i++) {
            locals[slot].setObject(params[i]);
            slot += TypeSignature.getTypeSize(myParamTypes[i]);
        }
        return locals;
    }

    public Object interpretMethod(BytecodeInfo code, Object instance, Object[] myParams) throws InterpreterException, InvocationTargetException {
        if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_INTERPRT) != 0)
            GlobalOptions.err.println("Interpreting " + code);

        Value[] locals = fillParameters(code, instance, myParams);
        Value[] stack = new Value[code.getMaxStack()];
        for (int i = 0; i < stack.length; i++)
            stack[i] = new Value();

        Instruction pc = (Instruction) code.getInstructions().get(0);
        int stacktop = 0;
        big_loop:
        for (; ; ) {
            try {
                Instruction instr = pc;
                if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_INTERPRT) != 0) {
                    GlobalOptions.err.println(instr.getDescription());
                    GlobalOptions.err.print("stack: [");
                    for (int i = 0; i < stacktop; i++) {
                        if (i > 0)
                            GlobalOptions.err.print(",");
                        GlobalOptions.err.print(stack[i]);
                        if (stack[i].objectValue() instanceof char[]) {
                            GlobalOptions.err.print(new String((char[]) stack[i].objectValue()));
                        }
                    }
                    GlobalOptions.err.println("]");
                    GlobalOptions.err.print("local: [");
                    for (int i = 0; i < locals.length; i++)
                        GlobalOptions.err.print(locals[i] + ",");
                    GlobalOptions.err.println("]");
                }
                pc = instr.getNextByAddr();
                int opcode = instr.getOpcode();
                switch (opcode) {
                    case opc_nop:
                        break;
                    case opc_ldc:
                        stack[stacktop++].setObject(instr.getConstant());
                        break;
                    case opc_ldc2_w:
                        stack[stacktop].setObject(instr.getConstant());
                        stacktop += 2;
                        break;
                    case opc_iload:
                    case opc_fload:
                    case opc_aload:
                        stack[stacktop++].setValue(locals[instr.getLocalSlot()]);
                        break;
                    case opc_lload:
                    case opc_dload:
                        stack[stacktop].setValue(locals[instr.getLocalSlot()]);
                        stacktop += 2;
                        break;
                    case opc_iaload:
                    case opc_laload:
                    case opc_faload:
                    case opc_daload:
                    case opc_aaload:
                    case opc_baload:
                    case opc_caload:
                    case opc_saload: {
                        int index = stack[--stacktop].intValue();
                        Object array = stack[--stacktop].objectValue();
                        Object result;
                        try {
                            switch (opcode) {
                                case opc_baload:
                                    result = new Integer(array instanceof byte[] ? ((byte[]) array)[index] : ((boolean[]) array)[index] ? 1 : 0);
                                    break;
                                case opc_caload:
                                    result = new Integer(((char[]) array)[index]);
                                    break;
                                case opc_saload:
                                    result = new Integer(((short[]) array)[index]);
                                    break;
                                default:
                                    result = Array.get(array, index);
                                    break;
                            }
                        } catch (NullPointerException ex) {
                            throw new InvocationTargetException(ex);
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        stack[stacktop++].setObject(result);
                        if (opcode == opc_laload || opcode == opc_daload)
                            stacktop++;
                        break;
                    }
                    case opc_istore:
                    case opc_fstore:
                    case opc_astore:
                        locals[instr.getLocalSlot()].setValue(stack[--stacktop]);
                        break;
                    case opc_lstore:
                    case opc_dstore:
                        locals[instr.getLocalSlot()].setValue(stack[stacktop -= 2]);
                        break;

                    case opc_lastore:
                    case opc_dastore:
                        stacktop--;
                        /* fall through */
                    case opc_iastore:
                    case opc_fastore:
                    case opc_aastore:
                    case opc_bastore:
                    case opc_castore:
                    case opc_sastore: {
                        Value value = stack[--stacktop];
                        int index = stack[--stacktop].intValue();
                        Object array = stack[--stacktop].objectValue();
                        try {
                            switch (opcode) {
                                case opc_bastore:
                                    if (array instanceof byte[])
                                        ((byte[]) array)[index] = (byte) value.intValue();
                                    else
                                        ((boolean[]) array)[index] = value.intValue() != 0;
                                    break;
                                case opc_castore:
                                    ((char[]) array)[index] = (char) value.intValue();
                                    break;
                                case opc_sastore:
                                    ((short[]) array)[index] = (short) value.intValue();
                                    break;
                                default:
                                    Array.set(array, index, value.objectValue());
                            }
                        } catch (NullPointerException ex) {
                            throw new InvocationTargetException(ex);
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            throw new InvocationTargetException(ex);
                        } catch (ArrayStoreException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        break;
                    }
                    case opc_pop:
                    case opc_pop2:
                        stacktop -= opcode - (opc_pop - 1);
                        break;
                    case opc_dup:
                    case opc_dup_x1:
                    case opc_dup_x2: {
                        int depth = opcode - opc_dup;
                        for (int i = 0; i < depth + 1; i++)
                            stack[stacktop - i].setValue(stack[stacktop - i - 1]);
                        stack[stacktop - depth - 1].setValue(stack[stacktop]);
                        stacktop++;
                        break;
                    }
                    case opc_dup2:
                    case opc_dup2_x1:
                    case opc_dup2_x2: {
                        int depth = opcode - opc_dup2;
                        for (int i = 0; i < depth + 2; i++)
                            stack[stacktop + 1 - i].setValue(stack[stacktop - 1 - i]);
                        stack[stacktop - depth - 1].setValue(stack[stacktop + 1]);
                        stack[stacktop - depth - 2].setValue(stack[stacktop]);
                        stacktop += 2;
                        break;
                    }
                    case opc_swap: {
                        Value tmp = stack[stacktop - 1];
                        stack[stacktop - 1] = stack[stacktop - 2];
                        stack[stacktop - 2] = tmp;
                        break;
                    }
                    case opc_iadd:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() + stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_isub:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() - stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_imul:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() * stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_idiv:
                        try {
                            stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() / stack[stacktop - 1].intValue());
                        } catch (ArithmeticException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        stacktop--;
                        break;
                    case opc_irem:
                        try {
                            stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() % stack[stacktop - 1].intValue());
                        } catch (ArithmeticException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        stacktop--;
                        break;

                    case opc_ladd:
                        stacktop -= 2;
                        stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() + stack[stacktop].longValue());
                        break;
                    case opc_lsub:
                        stacktop -= 2;
                        stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() - stack[stacktop].longValue());
                        break;
                    case opc_lmul:
                        stacktop -= 2;
                        stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() * stack[stacktop].longValue());
                        break;
                    case opc_ldiv:
                        stacktop -= 2;
                        try {
                            stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() / stack[stacktop].longValue());
                        } catch (ArithmeticException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        break;
                    case opc_lrem:
                        stacktop -= 2;
                        try {
                            stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() % stack[stacktop].longValue());
                        } catch (ArithmeticException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        break;

                    case opc_fadd:
                        stack[stacktop - 2].setFloat(stack[stacktop - 2].floatValue() + stack[stacktop - 1].floatValue());
                        stacktop--;
                        break;
                    case opc_fsub:
                        stack[stacktop - 2].setFloat(stack[stacktop - 2].floatValue() - stack[stacktop - 1].floatValue());
                        stacktop--;
                        break;
                    case opc_fmul:
                        stack[stacktop - 2].setFloat(stack[stacktop - 2].floatValue() * stack[stacktop - 1].floatValue());
                        stacktop--;
                        break;
                    case opc_fdiv:
                        stack[stacktop - 2].setFloat(stack[stacktop - 2].floatValue() / stack[stacktop - 1].floatValue());
                        stacktop--;
                        break;
                    case opc_frem:
                        stack[stacktop - 2].setFloat(stack[stacktop - 2].floatValue() % stack[stacktop - 1].floatValue());
                        stacktop--;
                        break;

                    case opc_dadd:
                        stacktop -= 2;
                        stack[stacktop - 2].setDouble(stack[stacktop - 2].doubleValue() + stack[stacktop].doubleValue());
                        break;
                    case opc_dsub:
                        stacktop -= 2;
                        stack[stacktop - 2].setDouble(stack[stacktop - 2].doubleValue() - stack[stacktop].doubleValue());
                        break;
                    case opc_dmul:
                        stacktop -= 2;
                        stack[stacktop - 2].setDouble(stack[stacktop - 2].doubleValue() * stack[stacktop].doubleValue());
                        break;
                    case opc_ddiv:
                        stacktop -= 2;
                        stack[stacktop - 2].setDouble(stack[stacktop - 2].doubleValue() / stack[stacktop].doubleValue());
                        break;
                    case opc_drem:
                        stacktop -= 2;
                        stack[stacktop - 2].setDouble(stack[stacktop - 2].doubleValue() % stack[stacktop].doubleValue());
                        break;

                    case opc_ineg:
                        stack[stacktop - 1].setInt(-stack[stacktop - 1].intValue());
                        break;
                    case opc_lneg:
                        stack[stacktop - 2].setLong(-stack[stacktop - 2].longValue());
                        break;
                    case opc_fneg:
                        stack[stacktop - 1].setFloat(-stack[stacktop - 1].floatValue());
                        break;
                    case opc_dneg:
                        stack[stacktop - 2].setDouble(-stack[stacktop - 2].doubleValue());
                        break;

                    case opc_ishl:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() << stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_ishr:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() >> stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_iushr:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() >>> stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_iand:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() & stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_ior:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() | stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_ixor:
                        stack[stacktop - 2].setInt(stack[stacktop - 2].intValue() ^ stack[stacktop - 1].intValue());
                        stacktop--;
                        break;

                    case opc_lshl:
                        stack[stacktop - 3].setLong(stack[stacktop - 3].longValue() << stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_lshr:
                        stack[stacktop - 3].setLong(stack[stacktop - 3].longValue() >> stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_lushr:
                        stack[stacktop - 3].setLong(stack[stacktop - 3].longValue() >>> stack[stacktop - 1].intValue());
                        stacktop--;
                        break;
                    case opc_land:
                        stacktop -= 2;
                        stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() & stack[stacktop].longValue());
                        break;
                    case opc_lor:
                        stacktop -= 2;
                        stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() | stack[stacktop].longValue());
                        break;
                    case opc_lxor:
                        stacktop -= 2;
                        stack[stacktop - 2].setLong(stack[stacktop - 2].longValue() ^ stack[stacktop].longValue());
                        break;

                    case opc_iinc:
                        locals[instr.getLocalSlot()].setInt(locals[instr.getLocalSlot()].intValue() + instr.getIncrement());
                        break;
                    case opc_i2l:
                        stack[stacktop - 1].setLong((long) stack[stacktop - 1].intValue());
                        stacktop++;
                        break;
                    case opc_i2f:
                        stack[stacktop - 1].setFloat((float) stack[stacktop - 1].intValue());
                        break;
                    case opc_i2d:
                        stack[stacktop - 1].setDouble((double) stack[stacktop - 1].intValue());
                        stacktop++;
                        break;

                    case opc_l2i:
                        stacktop--;
                        stack[stacktop - 1].setInt((int) stack[stacktop - 1].longValue());
                        break;
                    case opc_l2f:
                        stacktop--;
                        stack[stacktop - 1].setFloat((float) stack[stacktop - 1].longValue());
                        break;
                    case opc_l2d:
                        stack[stacktop - 2].setDouble((double) stack[stacktop - 2].longValue());
                        break;

                    case opc_f2i:
                        stack[stacktop - 1].setInt((int) stack[stacktop - 1].floatValue());
                        break;
                    case opc_f2l:
                        stack[stacktop - 1].setLong((long) stack[stacktop - 1].floatValue());
                        stacktop++;
                        break;
                    case opc_f2d:
                        stack[stacktop - 1].setDouble((double) stack[stacktop - 1].floatValue());
                        stacktop++;
                        break;

                    case opc_d2i:
                        stacktop--;
                        stack[stacktop - 1].setInt((int) stack[stacktop - 1].doubleValue());
                        break;
                    case opc_d2l:
                        stack[stacktop - 2].setLong((long) stack[stacktop - 2].doubleValue());
                        break;
                    case opc_d2f:
                        stacktop--;
                        stack[stacktop - 1].setFloat((float) stack[stacktop - 1].doubleValue());
                        break;

                    case opc_i2b:
                        stack[stacktop - 1].setInt((byte) stack[stacktop - 1].intValue());
                        break;
                    case opc_i2c:
                        stack[stacktop - 1].setInt((char) stack[stacktop - 1].intValue());
                        break;
                    case opc_i2s:
                        stack[stacktop - 1].setInt((short) stack[stacktop - 1].intValue());
                        break;
                    case opc_lcmp: {
                        stacktop -= 3;
                        long val1 = stack[stacktop - 1].longValue();
                        long val2 = stack[stacktop + 1].longValue();
                        stack[stacktop - 1].setInt(val1 == val2 ? 0 : val1 < val2 ? -1 : 1);
                        break;
                    }
                    case opc_fcmpl:
                    case opc_fcmpg: {
                        float val1 = stack[stacktop - 2].floatValue();
                        float val2 = stack[--stacktop].floatValue();
                        stack[stacktop - 1].setInt(val1 == val2 ? 0 : (opcode == opc_fcmpg ? (val1 < val2 ? -1 : 1) : (val1 > val2 ? 1 : -1)));
                        break;
                    }
                    case opc_dcmpl:
                    case opc_dcmpg: {
                        stacktop -= 3;
                        double val1 = stack[stacktop - 1].doubleValue();
                        double val2 = stack[stacktop + 1].doubleValue();
                        stack[stacktop - 1].setInt(val1 == val2 ? 0 : (opcode == opc_dcmpg ? (val1 < val2 ? -1 : 1) : (val1 > val2 ? 1 : -1)));
                        break;
                    }
                    case opc_ifeq:
                    case opc_ifne:
                    case opc_iflt:
                    case opc_ifge:
                    case opc_ifgt:
                    case opc_ifle:
                    case opc_if_icmpeq:
                    case opc_if_icmpne:
                    case opc_if_icmplt:
                    case opc_if_icmpge:
                    case opc_if_icmpgt:
                    case opc_if_icmple:
                    case opc_if_acmpeq:
                    case opc_if_acmpne:
                    case opc_ifnull:
                    case opc_ifnonnull: {
                        int value;
                        if (opcode >= opc_if_acmpeq) {
                            Object objValue = stack[--stacktop].objectValue();
                            if (opcode >= opc_ifnull) {
                                value = objValue == null ? 0 : 1;
                                opcode -= opc_ifnull;
                            } else {
                                value = objValue == stack[--stacktop].objectValue() ? 0 : 1;
                                opcode -= opc_if_acmpeq;
                            }
                        } else {
                            value = stack[--stacktop].intValue();
                            if (opcode >= opc_if_icmpeq) {
                                int val1 = stack[--stacktop].intValue();
                                value = (val1 == value ? 0 : val1 < value ? -1 : 1);
                                opcode -= opc_if_icmpeq;
                            } else
                                opcode -= opc_ifeq;
                        }
                        int opc_mask = 1 << opcode;
                        if (value > 0 && (opc_mask & CMP_GREATER_MASK) != 0 || value < 0 && (opc_mask & CMP_LESS_MASK) != 0 || value == 0 && (opc_mask & CMP_EQUAL_MASK) != 0)
                            pc = instr.getSingleSucc();
                        break;
                    }
                    case opc_jsr:
                    case opc_jsr_w:
                        stack[stacktop++].setObject(instr);
                        /* fall through */
                    case opc_goto:
                    case opc_goto_w:
                        pc = instr.getSingleSucc();
                        break;
                    case opc_ret:
                        pc = (Instruction) locals[instr.getLocalSlot()].objectValue();
                        break;
                    case opc_lookupswitch: {
                        int value = stack[--stacktop].intValue();
                        int[] values = instr.getValues();
                        int pos = Arrays.binarySearch(values, value);
                        pc = pos < 0 ? instr.getSuccs()[values.length] : instr.getSuccs()[pos];
                        break;
                    }
                    case opc_ireturn:
                    case opc_freturn:
                    case opc_areturn:
                        return stack[--stacktop].objectValue();
                    case opc_lreturn:
                    case opc_dreturn:
                        return stack[stacktop -= 2].objectValue();
                    case opc_return:
                        return Void.TYPE;
                    case opc_getstatic: {
                        Reference ref = instr.getReference();
                        Object result = env.getField(instr.getReference(), null);
                        stack[stacktop].setObject(result);
                        stacktop += TypeSignature.getTypeSize(ref.getType());
                        break;
                    }
                    case opc_getfield: {
                        Reference ref = instr.getReference();
                        Object cls = stack[--stacktop].objectValue();
                        if (cls == null)
                            throw new InvocationTargetException(new NullPointerException());
                        Object result = env.getField(instr.getReference(), cls);
                        stack[stacktop].setObject(result);
                        stacktop += TypeSignature.getTypeSize(ref.getType());
                        break;
                    }
                    case opc_putstatic: {
                        Reference ref = instr.getReference();
                        stacktop -= TypeSignature.getTypeSize(ref.getType());
                        Object value = stack[stacktop].objectValue();
                        env.putField(instr.getReference(), null, value);
                        break;
                    }
                    case opc_putfield: {
                        Reference ref = instr.getReference();
                        stacktop -= TypeSignature.getTypeSize(ref.getType());
                        Object value = stack[stacktop].objectValue();
                        Object cls = stack[--stacktop].objectValue();
                        if (cls == null)
                            throw new InvocationTargetException(new NullPointerException());
                        env.putField(instr.getReference(), cls, value);
                        break;
                    }
                    case opc_invokevirtual:
                    case opc_invokespecial:
                    case opc_invokestatic:
                    case opc_invokeinterface: {
                        Reference ref = instr.getReference();
                        String[] paramTypes = TypeSignature.getParameterTypes(ref.getType());
                        Object[] args = new Object[paramTypes.length];
                        for (int i = paramTypes.length - 1; i >= 0; i--) {
                            stacktop -= TypeSignature.getTypeSize(paramTypes[i]);
                            args[i] = stack[stacktop].objectValue();
                        }

                        Object result = null;
                        if (opcode == opc_invokespecial && ref.getName().equals("<init>") && stack[--stacktop].getNewObject() != null) {
                            NewObject newObj = stack[stacktop].getNewObject();
                            if (!newObj.getType().equals(ref.getClazz()))
                                throw new InterpreterException("constructor doesn't match new");
                            newObj.setObject(env.invokeConstructor(ref, args));
                        } else if (opcode == opc_invokestatic) {
                            result = env.invokeMethod(ref, false, null, args);
                        } else {
                            Object cls = stack[--stacktop].objectValue();
                            if (cls == null)
                                throw new InvocationTargetException(new NullPointerException());
                            result = env.invokeMethod(ref, opcode != opc_invokespecial, cls, args);
                        }
                        String retType = TypeSignature.getReturnType(ref.getType());
                        if (!retType.equals("V")) {
                            stack[stacktop].setObject(result);
                            stacktop += TypeSignature.getTypeSize(retType);
                        }
                        break;
                    }
                    case opc_new: {
                        String clazz = instr.getClazzType();
                        stack[stacktop++].setNewObject(new NewObject(clazz));
                        break;
                    }
                    case opc_arraylength: {
                        Object array = stack[--stacktop].objectValue();
                        if (array == null)
                            throw new InvocationTargetException(new NullPointerException());
                        stack[stacktop++].setInt(Array.getLength(array));
                        break;
                    }
                    case opc_athrow: {
                        Throwable exc = (Throwable) stack[--stacktop].objectValue();
                        throw new InvocationTargetException(exc == null ? new NullPointerException() : exc);
                    }
                    case opc_checkcast: {
                        Object obj = stack[stacktop - 1].objectValue();
                        if (obj != null && !env.instanceOf(obj, instr.getClazzType()))
                            throw new InvocationTargetException(new ClassCastException(obj.getClass().getName()));
                        break;
                    }
                    case opc_instanceof: {
                        Object obj = stack[--stacktop].objectValue();
                        stack[stacktop++].setInt(env.instanceOf(obj, instr.getClazzType()) ? 1 : 0);
                        break;
                    }
                    case opc_monitorenter:
                        env.enterMonitor(stack[--stacktop].objectValue());
                        break;
                    case opc_monitorexit:
                        env.exitMonitor(stack[--stacktop].objectValue());
                        break;
                    case opc_multianewarray: {
                        int dimension = instr.getDimensions();
                        int[] dims = new int[dimension];
                        for (int i = dimension - 1; i >= 0; i--)
                            dims[i] = stack[--stacktop].intValue();
                        try {
                            stack[stacktop++].setObject(env.newArray(instr.getClazzType(), dims));
                        } catch (NegativeArraySizeException ex) {
                            throw new InvocationTargetException(ex);
                        }
                        break;
                    }
                    default:
                        throw new AssertError("Invalid opcode " + opcode);
                }
            } catch (InvocationTargetException ex) {
                Handler[] handlers = code.getExceptionHandlers();
                Throwable obj = ex.getTargetException();
                for (int i = 0; i < handlers.length; i++) {
                    if (handlers[i].start.compareTo(pc) <= 0 && handlers[i].end.compareTo(pc) >= 0 && (handlers[i].type == null || env.instanceOf(obj, handlers[i].type))) {
                        stacktop = 0;
                        stack[stacktop++].setObject(obj);
                        pc = handlers[i].catcher;
                        continue big_loop;
                    }
                }
                throw ex;
            }
        }
    }
}
