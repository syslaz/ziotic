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

import java.util.List;

import com.ziotic.asm.Type;
import com.ziotic.asm.tree.AbstractInsnNode;

/**
 * A semantic bytecode interpreter. More precisely, this interpreter only
 * manages the computation of values from other values: it does not manage the
 * transfer of values to or from the stack, and to or from the local variables.
 * This separation allows a generic bytecode {@link Analyzer} to work with
 * various semantic interpreters, without needing to duplicate the code to
 * simulate the transfer of values.
 *
 * @author Eric Bruneton
 */
public interface Interpreter {

    /**
     * Creates a new value that represents the given type.
     * <p/>
     * Called for method parameters (including <code>this</code>),
     * exception handler variable and with <code>null</code> type
     * for variables reserved by long and double types.
     *
     * @param type a primitive or reference type, or <tt>null</tt> to
     *             represent an uninitialized value.
     * @return a value that represents the given type. The size of the returned
     *         value must be equal to the size of the given type.
     */
    Value newValue(Type type);

    /**
     * Interprets a bytecode instruction without arguments. This method is
     * called for the following opcodes:
     * <p/>
     * ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1, ICONST_2, ICONST_3, ICONST_4,
     * ICONST_5, LCONST_0, LCONST_1, FCONST_0, FCONST_1, FCONST_2, DCONST_0,
     * DCONST_1, BIPUSH, SIPUSH, LDC, JSR, GETSTATIC, NEW
     *
     * @param insn the bytecode instruction to be interpreted.
     * @return the result of the interpretation of the given instruction.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    Value newOperation(AbstractInsnNode insn) throws AnalyzerException;

    /**
     * Interprets a bytecode instruction that moves a value on the stack or to
     * or from local variables. This method is called for the following opcodes:
     * <p/>
     * ILOAD, LLOAD, FLOAD, DLOAD, ALOAD, ISTORE, LSTORE, FSTORE, DSTORE,
     * ASTORE, DUP, DUP_X1, DUP_X2, DUP2, DUP2_X1, DUP2_X2, SWAP
     *
     * @param insn  the bytecode instruction to be interpreted.
     * @param value the value that must be moved by the instruction.
     * @return the result of the interpretation of the given instruction. The
     *         returned value must be <tt>equal</tt> to the given value.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    Value copyOperation(AbstractInsnNode insn, Value value) throws AnalyzerException;

    /**
     * Interprets a bytecode instruction with a single argument. This method is
     * called for the following opcodes:
     * <p/>
     * INEG, LNEG, FNEG, DNEG, IINC, I2L, I2F, I2D, L2I, L2F, L2D, F2I, F2L,
     * F2D, D2I, D2L, D2F, I2B, I2C, I2S, IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE,
     * TABLESWITCH, LOOKUPSWITCH, IRETURN, LRETURN, FRETURN, DRETURN, ARETURN,
     * PUTSTATIC, GETFIELD, NEWARRAY, ANEWARRAY, ARRAYLENGTH, ATHROW, CHECKCAST,
     * INSTANCEOF, MONITORENTER, MONITOREXIT, IFNULL, IFNONNULL
     *
     * @param insn  the bytecode instruction to be interpreted.
     * @param value the argument of the instruction to be interpreted.
     * @return the result of the interpretation of the given instruction.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    Value unaryOperation(AbstractInsnNode insn, Value value) throws AnalyzerException;

    /**
     * Interprets a bytecode instruction with two arguments. This method is
     * called for the following opcodes:
     * <p/>
     * IALOAD, LALOAD, FALOAD, DALOAD, AALOAD, BALOAD, CALOAD, SALOAD, IADD,
     * LADD, FADD, DADD, ISUB, LSUB, FSUB, DSUB, IMUL, LMUL, FMUL, DMUL, IDIV,
     * LDIV, FDIV, DDIV, IREM, LREM, FREM, DREM, ISHL, LSHL, ISHR, LSHR, IUSHR,
     * LUSHR, IAND, LAND, IOR, LOR, IXOR, LXOR, LCMP, FCMPL, FCMPG, DCMPL,
     * DCMPG, IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE,
     * IF_ACMPEQ, IF_ACMPNE, PUTFIELD
     *
     * @param insn   the bytecode instruction to be interpreted.
     * @param value1 the first argument of the instruction to be interpreted.
     * @param value2 the second argument of the instruction to be interpreted.
     * @return the result of the interpretation of the given instruction.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    Value binaryOperation(AbstractInsnNode insn, Value value1, Value value2) throws AnalyzerException;

    /**
     * Interprets a bytecode instruction with three arguments. This method is
     * called for the following opcodes:
     * <p/>
     * IASTORE, LASTORE, FASTORE, DASTORE, AASTORE, BASTORE, CASTORE, SASTORE
     *
     * @param insn   the bytecode instruction to be interpreted.
     * @param value1 the first argument of the instruction to be interpreted.
     * @param value2 the second argument of the instruction to be interpreted.
     * @param value3 the third argument of the instruction to be interpreted.
     * @return the result of the interpretation of the given instruction.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    Value ternaryOperation(AbstractInsnNode insn, Value value1, Value value2, Value value3) throws AnalyzerException;

    /**
     * Interprets a bytecode instruction with a variable number of arguments.
     * This method is called for the following opcodes:
     * <p/>
     * INVOKEVIRTUAL, INVOKESPECIAL, INVOKESTATIC, INVOKEINTERFACE,
     * MULTIANEWARRAY
     *
     * @param insn   the bytecode instruction to be interpreted.
     * @param values the arguments of the instruction to be interpreted.
     * @return the result of the interpretation of the given instruction.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    Value naryOperation(AbstractInsnNode insn, List values) throws AnalyzerException;

    /**
     * Interprets a bytecode return instruction. This method is called for the
     * following opcodes:
     * <p/>
     * IRETURN, LRETURN, FRETURN, DRETURN, ARETURN
     *
     * @param insn     the bytecode instruction to be interpreted.
     * @param value    the argument of the instruction to be interpreted.
     * @param expected the expected return type of the analyzed method.
     * @throws AnalyzerException if an error occured during the interpretation.
     */
    void returnOperation(AbstractInsnNode insn, Value value, Value expected) throws AnalyzerException;

    /**
     * Merges two values. The merge operation must return a value that
     * represents both values (for instance, if the two values are two types,
     * the merged value must be a common super type of the two types. If the two
     * values are integer intervals, the merged value must be an interval that
     * contains the previous ones. Likewise for other types of values).
     *
     * @param v a value.
     * @param w another value.
     * @return the merged value. If the merged value is equal to <tt>v</tt>,
     *         this method <i>must</i> return <tt>v</tt>.
     */
    Value merge(Value v, Value w);
}
