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
package com.ziotic.jode.obfuscator.modules;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.*;
import com.ziotic.jode.jvm.InterpreterException;
import com.ziotic.jode.obfuscator.*;

/**
 * Analyze the code, assuming every field that is not yet written to
 * is constant.  This may imply that some code is dead code.
 *
 * @author Jochen Hoenicke
 */
public class ConstantAnalyzer extends SimpleAnalyzer implements Opcodes, CodeAnalyzer {

    BytecodeInfo bytecode;

    private static ConstantRuntimeEnvironment runtime = new ConstantRuntimeEnvironment();

    private final static int CMP_EQ = 0;
    private final static int CMP_NE = 1;
    private final static int CMP_LT = 2;
    private final static int CMP_GE = 3;
    private final static int CMP_GT = 4;
    private final static int CMP_LE = 5;
    private final static int CMP_GREATER_MASK = (1 << CMP_GT) | (1 << CMP_GE) | (1 << CMP_NE);
    private final static int CMP_LESS_MASK = (1 << CMP_LT) | (1 << CMP_LE) | (1 << CMP_NE);
    private final static int CMP_EQUAL_MASK = (1 << CMP_GE) | (1 << CMP_LE) | (1 << CMP_EQ);

    final static int CONSTANT = 0x02;
    final static int CONSTANTFLOW = 0x04;
    final static int RETASTORE = 0x08;
    final static int RETURNINGJSR = 0x10;

    private interface ConstantListener {
        public void constantChanged();
    }

    private final static class JSRTargetInfo implements Cloneable {
        Instruction jsrTarget;
        BitSet usedLocals;

        /**
         * The dependent entries, that want to know if the bit set changed.
         * This is either a StackLocalInfo (the ret info) or a single
         * JSRTargetInfo or a Collection of JSRTargetInfos.
         */
        Object dependent;

        public JSRTargetInfo(Instruction target) {
            jsrTarget = target;
            usedLocals = new BitSet();
        }

        public JSRTargetInfo copy() {
            try {
                JSRTargetInfo result = (JSRTargetInfo) clone();
                result.usedLocals = (BitSet) usedLocals.clone();
                addDependent(result);
                return result;
            } catch (CloneNotSupportedException ex) {
                throw new IncompatibleClassChangeError(ex.getMessage());
            }
        }

        private void addDependent(JSRTargetInfo result) {
            if (dependent == null || dependent == result)
                dependent = result;
            else if (dependent instanceof JSRTargetInfo) {
                Set newDeps = new HashSet();
                newDeps.add(dependent);
                newDeps.add(result);
            } else if (dependent instanceof Collection) {
                ((Collection) dependent).add(result);
            }
        }

        public void setRetInfo(StackLocalInfo retInfo) {
            dependent = retInfo;
        }

        public boolean uses(int localSlot) {
            return usedLocals.get(localSlot);
        }

        public void addUsed(int localSlot) {
            if (usedLocals.get(localSlot))
                return;
            usedLocals.set(localSlot);

            if (dependent instanceof StackLocalInfo)
                ((StackLocalInfo) dependent).enqueue();
            else if (dependent instanceof JSRTargetInfo)
                ((JSRTargetInfo) dependent).addUsed(localSlot);
            else if (dependent instanceof Collection) {
                Iterator iter = ((Collection) dependent).iterator();
                while (iter.hasNext()) {
                    JSRTargetInfo dep = (JSRTargetInfo) iter.next();
                    dep.addUsed(localSlot);
                }
            }
        }

        public void merge(JSRTargetInfo o) {
            o.addDependent(this);
            for (int slot = 0; slot < o.usedLocals.size(); slot++) {
                if (o.usedLocals.get(slot))
                    addUsed(slot);
            }
        }

        public String toString() {
            StringBuffer sb = new StringBuffer(String.valueOf(jsrTarget));
            if (dependent instanceof StackLocalInfo)
                sb.append("->").append(((StackLocalInfo) dependent).instr);
            return sb.append(usedLocals).append('_').append(hashCode()).toString();
        }
    }

    private static class ConstValue implements ConstantListener {
        public final static Object VOLATILE = new Object();
        /**
         * The constant value, VOLATILE if value is not constant.
         * This may also be an instance of JSRTargetInfo
         */
        Object value;
        /**
         * The number of slots this value takes on the stack.
         */
        int stackSize;
        /**
         * The constant listeners, that want to be informed if this is
         * no longer constant.
         */
        Set listeners;

        public ConstValue(Object constant) {
            value = constant;
            stackSize = (constant instanceof Double || constant instanceof Long) ? 2 : 1;
            listeners = new HashSet();
        }

        public ConstValue(ConstValue constant) {
            value = constant.value;
            stackSize = constant.stackSize;
            listeners = new HashSet();
            constant.addConstantListener(this);
        }

        public ConstValue(int stackSize) {
            this.value = VOLATILE;
            this.stackSize = stackSize;
        }

        public ConstValue copy() {
            return (value == VOLATILE) ? this : new ConstValue(this);
        }

        public void addConstantListener(ConstantListener l) {
            listeners.add(l);
        }

        public void removeConstantListener(ConstantListener l) {
            listeners.remove(l);
        }

        public void fireChanged() {
            value = VOLATILE;
            for (Iterator i = listeners.iterator(); i.hasNext(); )
                ((ConstantListener) i.next()).constantChanged();
            listeners = null;
        }

        public void constantChanged() {
            if (value != VOLATILE)
                fireChanged();
        }

        /**
         * Merge the other value into this value.
         */
        public void merge(ConstValue other) {
            if (this == other)
                return;

            if (value == null ? other.value == null : value.equals(other.value)) {
                if (value != VOLATILE) {
                    other.addConstantListener(this);
                    this.addConstantListener(other);
                }
                return;
            }

            if (value instanceof JSRTargetInfo && other.value instanceof JSRTargetInfo && (((JSRTargetInfo) value).jsrTarget == ((JSRTargetInfo) other.value).jsrTarget)) {
                ((JSRTargetInfo) value).merge((JSRTargetInfo) other.value);
                return;
            }

            if (value != VOLATILE)
                fireChanged();
//  	    if (other.value != VOLATILE)
//  		other.fireChanged();
        }

        public String toString() {
            return value == VOLATILE ? "vol(" + stackSize + ")" : "" + value;
        }
    }

    private static class TodoQueue {
        StackLocalInfo first;
    }

    private static class StackLocalInfo implements ConstantListener {
        ConstValue[] stack;
        ConstValue[] locals;
        Instruction instr;
        ConstantInfo constInfo;
        StackLocalInfo retInfo;

        StackLocalInfo nextOnQueue;

        /**
         * The queue that should be notified, if the constant values of
         * this instruction changes.  We put ourself on this queue in that
         * case.
         */
        TodoQueue notifyQueue;

        public ConstValue copy(ConstValue value) {
            return (value == null) ? null : value.copy();
        }

        private StackLocalInfo(ConstValue[] stack, ConstValue[] locals, TodoQueue notifyQueue) {
            this.stack = stack;
            this.locals = new ConstValue[locals.length];
            for (int i = 0; i < locals.length; i++)
                this.locals[i] = copy(locals[i]);
            this.notifyQueue = notifyQueue;
        }

        public StackLocalInfo(int numLocals, boolean isStatic, String methodTypeSig, TodoQueue notifyQueue) {

            String[] paramTypes = TypeSignature.getParameterTypes(methodTypeSig);
            locals = new ConstValue[numLocals];
            stack = new ConstValue[0];
            this.notifyQueue = notifyQueue;
            int slot = 0;
            if (!isStatic)
                locals[slot++] = new ConstValue(1);
            for (int i = 0; i < paramTypes.length; i++) {
                int stackSize = TypeSignature.getTypeSize(paramTypes[i]);
                locals[slot] = unknownValue[stackSize - 1];
                slot += stackSize;
            }
        }

        public final void enqueue() {
            if (nextOnQueue == null) {
                this.nextOnQueue = notifyQueue.first;
                notifyQueue.first = this;
            }
        }

        public void constantChanged() {
            enqueue();
        }

        public StackLocalInfo poppush(int pops, ConstValue push) {
            ConstValue[] newStack = new ConstValue[stack.length - pops + push.stackSize];
            ConstValue[] newLocals = (ConstValue[]) locals.clone();
            System.arraycopy(stack, 0, newStack, 0, stack.length - pops);
            newStack[stack.length - pops] = push.copy();
            return new StackLocalInfo(newStack, newLocals, notifyQueue);
        }

        public StackLocalInfo pop(int pops) {
            ConstValue[] newStack = new ConstValue[stack.length - pops];
            ConstValue[] newLocals = (ConstValue[]) locals.clone();
            System.arraycopy(stack, 0, newStack, 0, stack.length - pops);
            return new StackLocalInfo(newStack, newLocals, notifyQueue);
        }

        public StackLocalInfo dup(int count, int depth) {
            ConstValue[] newStack = new ConstValue[stack.length + count];
            ConstValue[] newLocals = (ConstValue[]) locals.clone();
            if (depth == 0)
                System.arraycopy(stack, 0, newStack, 0, stack.length);
            else {
                int pos = stack.length - count - depth;
                System.arraycopy(stack, 0, newStack, 0, pos);
                for (int i = 0; i < count; i++)
                    newStack[pos++] = copy(stack[stack.length - count + i]);
                for (int i = 0; i < depth; i++)
                    newStack[pos++] = copy(stack[stack.length - count - depth + i]);
            }
            for (int i = 0; i < count; i++)
                newStack[stack.length + i] = copy(stack[stack.length - count + i]);
            return new StackLocalInfo(newStack, newLocals, notifyQueue);
        }

        public StackLocalInfo swap() {
            ConstValue[] newStack = new ConstValue[stack.length];
            ConstValue[] newLocals = (ConstValue[]) locals.clone();
            System.arraycopy(stack, 0, newStack, 0, stack.length - 2);
            newStack[stack.length - 2] = stack[stack.length - 1].copy();
            newStack[stack.length - 1] = stack[stack.length - 2].copy();
            return new StackLocalInfo(newStack, newLocals, notifyQueue);
        }

        public StackLocalInfo copy() {
            ConstValue[] newStack = (ConstValue[]) stack.clone();
            ConstValue[] newLocals = (ConstValue[]) locals.clone();
            return new StackLocalInfo(newStack, newLocals, notifyQueue);
        }

        public ConstValue getLocal(int slot) {
            return locals[slot];
        }

        public ConstValue getStack(int depth) {
            return stack[stack.length - depth];
        }

        public StackLocalInfo setLocal(int slot, ConstValue value) {
            locals[slot] = value;
            if (value != null && value.stackSize == 2)
                locals[slot + 1] = null;
            for (int i = 0; i < locals.length; i++) {
                if (locals[i] != null && locals[i].value instanceof JSRTargetInfo) {
                    JSRTargetInfo jsrInfo = (JSRTargetInfo) locals[i].value;
                    if (!jsrInfo.uses(slot)) {
                        jsrInfo = jsrInfo.copy();
                        locals[i] = locals[i].copy();
                        locals[i].value = jsrInfo;
                        jsrInfo.addUsed(slot);
                    }
                }
            }
            for (int i = 0; i < stack.length; i++) {
                if (stack[i] != null && stack[i].value instanceof JSRTargetInfo) {
                    JSRTargetInfo jsrInfo = (JSRTargetInfo) stack[i].value;
                    if (!jsrInfo.uses(slot)) {
                        jsrInfo = jsrInfo.copy();
                        stack[i] = stack[i].copy();
                        stack[i].value = jsrInfo;
                        jsrInfo.addUsed(slot);
                    }
                }
            }
            return this;
        }

        public StackLocalInfo mergeRetLocals(JSRTargetInfo jsrTargetInfo, StackLocalInfo retInfo) {
            for (int slot = 0; slot < locals.length; slot++) {
                if (jsrTargetInfo.uses(slot))
                    locals[slot] = retInfo.locals[slot];
            }
            locals[retInfo.instr.getLocalSlot()] = null;

            for (int i = 0; i < locals.length; i++) {
                if (locals[i] != null && locals[i].value instanceof JSRTargetInfo) {
                    JSRTargetInfo jsrInfo = (JSRTargetInfo) locals[i].value;
                    jsrInfo = jsrInfo.copy();
                    locals[i] = locals[i].copy();
                    locals[i].value = jsrInfo;
                    for (int slot = 0; slot < locals.length; slot++) {
                        if (jsrTargetInfo.uses(slot))
                            jsrInfo.addUsed(slot);
                    }
                }
            }
            for (int i = 0; i < stack.length; i++) {
                if (stack[i] != null && stack[i].value instanceof JSRTargetInfo) {
                    JSRTargetInfo jsrInfo = (JSRTargetInfo) stack[i].value;
                    jsrInfo = jsrInfo.copy();
                    stack[i] = stack[i].copy();
                    stack[i].value = jsrInfo;
                    for (int slot = 0; slot < locals.length; slot++) {
                        if (jsrTargetInfo.uses(slot))
                            jsrInfo.addUsed(slot);
                    }
                }
            }
            return this;
        }

        public void merge(StackLocalInfo other) {
            for (int i = 0; i < locals.length; i++) {
                if (locals[i] != null) {
                    if (other.locals[i] == null) {
                        locals[i].constantChanged();
                        locals[i] = null;
                        enqueue();
                    } else {
                        locals[i].merge(other.locals[i]);
                    }
                }
            }
            if (stack.length != other.stack.length)
                throw new com.ziotic.jode.AssertError("stack length differs");
            for (int i = 0; i < stack.length; i++) {
                if ((other.stack[i] == null) != (stack[i] == null))
                    throw new com.ziotic.jode.AssertError("stack types differ");
                else if (stack[i] != null)
                    stack[i].merge(other.stack[i]);
            }
        }

        public String toString() {
            return "Locals: " + Arrays.asList(locals) + "Stack: " + Arrays.asList(stack) + "Instr: " + instr;
        }
    }

    private static class ConstantInfo implements ConstantListener {
        ConstantInfo() {
            this(0, null);
        }

        ConstantInfo(int flags) {
            this(flags, null);
        }

        ConstantInfo(int flags, Object constant) {
            this.flags = flags;
            this.constant = constant;
        }

        int flags;
        /**
         * The constant, may be an Instruction for CONSTANTFLOW.
         */
        Object constant;

        public void constantChanged() {
            constant = null;
            flags &= ~(CONSTANT | CONSTANTFLOW);
        }
    }

    private static ConstValue[] unknownValue = {new ConstValue(1), new ConstValue(2)};

    private static ConstantInfo unknownConstInfo = new ConstantInfo();

    public ConstantAnalyzer() {
    }

    public void mergeInfo(Instruction instr, StackLocalInfo info) {
        if (instr.getTmpInfo() == null) {
            instr.setTmpInfo(info);
            info.instr = instr;
            info.enqueue();
        } else
            ((StackLocalInfo) instr.getTmpInfo()).merge(info);
    }

    public void handleReference(Reference ref, boolean isVirtual) {
        Main.getClassBundle().reachableReference(ref, isVirtual);
    }

    public void handleClass(String clName) {
        int i = 0;
        while (i < clName.length() && clName.charAt(i) == '[')
            i++;
        if (i < clName.length() && clName.charAt(i) == 'L') {
            clName = clName.substring(i + 1, clName.length() - 1);
            Main.getClassBundle().reachableClass(clName);
        }
    }

    public void handleOpcode(StackLocalInfo info, Identifier fieldListener) {
        Instruction instr = info.instr;
        info.constInfo = unknownConstInfo;

        int opcode = instr.getOpcode();
        Handler[] handlers = bytecode.getExceptionHandlers();
        for (int i = 0; i < handlers.length; i++) {
            if (handlers[i].start.getAddr() <= instr.getAddr() && handlers[i].end.getAddr() >= instr.getAddr())
                mergeInfo(handlers[i].catcher, info.poppush(info.stack.length, unknownValue[0]));
        }
        ConstValue result;
        switch (opcode) {
            case opc_nop:
                mergeInfo(instr.getNextByAddr(), info.pop(0));
                break;

            case opc_ldc:
            case opc_ldc2_w:
                result = new ConstValue(instr.getConstant());
                mergeInfo(instr.getNextByAddr(), info.poppush(0, result));
                break;

            case opc_iload:
            case opc_lload:
            case opc_fload:
            case opc_dload:
            case opc_aload:
                result = info.getLocal(instr.getLocalSlot());
                if (result == null) {
                    dumpStackLocalInfo();
                    System.err.println(info);
                    System.err.println(instr);
                }
                if (result.value != ConstValue.VOLATILE) {
                    info.constInfo = new ConstantInfo(CONSTANT, result.value);
                    result.addConstantListener(info.constInfo);
                }
                mergeInfo(instr.getNextByAddr(), info.poppush(0, result).setLocal(instr.getLocalSlot(), result.copy()));
                break;
            case opc_iaload:
            case opc_laload:
            case opc_faload:
            case opc_daload:
            case opc_aaload:
            case opc_baload:
            case opc_caload:
            case opc_saload: {
//  	    ConstValue array = info.getStack(2);
//  	    ConstValue index = info.getStack(1);
//  	    ConstValue newValue = null;
//  	    if (index.value != index.ConstValue.VOLATILE
//  		&& array.value != array.ConstValue.VOLATILE
//  		&& array.value != null) {
//  		int indexVal = ((Integer) index.value).intValue();
//  		Object content;
//  		switch(opcode) {
//  		case opc_baload:
//  		    content = new Integer
//  			(array.value instanceof byte[]
//  			 ? ((byte[])array.value)[indexVal]
//  			 : ((boolean[])array.value)[indexVal] ? 1 : 0);
//  		case opc_caload:
//  		    content = new Integer(((char[])array.value)[indexVal]);
//  		    break;
//  		case opc_saload:
//  		    content = new Integer(((short[])array.value)[indexVal]);
//  		    break;
//  		case opc_iaload:
//  		case opc_laload:
//  		case opc_faload:
//  		case opc_daload:
//  		case opc_aaload:
//  		    content = Array.get(array.value, indexVal);
//  		    break;
//  		default:
//  		    throw new jode.AssertError("Can't happen.");
//  		}
//  		result = new ConstValue(content);
//  		array.addConstantListener(result);
//  		index.addConstantListener(result);
//  	    } else {
                result = unknownValue[(opcode == opc_laload || opcode == opc_daload) ? 1 : 0];
//  	    }
                mergeInfo(instr.getNextByAddr(), info.poppush(2, result));
                break;
            }
            case opc_istore:
            case opc_fstore:
            case opc_astore: {
                result = info.getStack(1);
                if (result.value instanceof JSRTargetInfo)
                    info.constInfo.flags |= RETASTORE;
                mergeInfo(instr.getNextByAddr(), info.pop(1).setLocal(instr.getLocalSlot(), result));
                break;
            }
            case opc_lstore:
            case opc_dstore: {
                mergeInfo(instr.getNextByAddr(), info.pop(2).setLocal(instr.getLocalSlot(), info.getStack(2)));
                break;
            }
            case opc_iastore:
            case opc_lastore:
            case opc_fastore:
            case opc_dastore:
            case opc_aastore:
            case opc_bastore:
            case opc_castore:
            case opc_sastore: {
                int size = (opcode == opc_lastore || opcode == opc_dastore) ? 2 : 1;
                mergeInfo(instr.getNextByAddr(), info.pop(2 + size));
                break;
            }
            case opc_pop:
                mergeInfo(instr.getNextByAddr(), info.pop(1));
                break;
            case opc_pop2:
                mergeInfo(instr.getNextByAddr(), info.pop(2));
                break;

            case opc_dup:
            case opc_dup_x1:
            case opc_dup_x2:
            case opc_dup2:
            case opc_dup2_x1:
            case opc_dup2_x2:
                mergeInfo(instr.getNextByAddr(), info.dup((opcode - (opc_dup - 3)) / 3, (opcode - (opc_dup - 3)) % 3));
                break;
            case opc_swap:
                mergeInfo(instr.getNextByAddr(), info.swap());
                break;

            case opc_iadd:
            case opc_ladd:
            case opc_fadd:
            case opc_dadd:
            case opc_isub:
            case opc_lsub:
            case opc_fsub:
            case opc_dsub:
            case opc_imul:
            case opc_lmul:
            case opc_fmul:
            case opc_dmul:
            case opc_idiv:
            case opc_ldiv:
            case opc_fdiv:
            case opc_ddiv:
            case opc_irem:
            case opc_lrem:
            case opc_frem:
            case opc_drem:
            case opc_iand:
            case opc_land:
            case opc_ior:
            case opc_lor:
            case opc_ixor:
            case opc_lxor: {
                int size = 1 + (opcode - opc_iadd & 1);
                ConstValue value1 = info.getStack(2 * size);
                ConstValue value2 = info.getStack(1 * size);
                boolean known = value1.value != ConstValue.VOLATILE && value2.value != ConstValue.VOLATILE;
                if (known) {
                    if (((opcode == opc_idiv || opcode == opc_irem) && ((Integer) value2.value).intValue() == 0) || ((opcode == opc_ldiv || opcode == opc_lrem) && ((Long) value2.value).longValue() == 0))
                        known = false;
                }
                if (known) {
                    Object newValue;
                    switch (opcode) {
                        case opc_iadd:
                            newValue = new Integer(((Integer) value1.value).intValue() + ((Integer) value2.value).intValue());
                            break;
                        case opc_isub:
                            newValue = new Integer(((Integer) value1.value).intValue() - ((Integer) value2.value).intValue());
                            break;
                        case opc_imul:
                            newValue = new Integer(((Integer) value1.value).intValue() * ((Integer) value2.value).intValue());
                            break;
                        case opc_idiv:
                            newValue = new Integer(((Integer) value1.value).intValue() / ((Integer) value2.value).intValue());
                            break;
                        case opc_irem:
                            newValue = new Integer(((Integer) value1.value).intValue() % ((Integer) value2.value).intValue());
                            break;
                        case opc_iand:
                            newValue = new Integer(((Integer) value1.value).intValue() & ((Integer) value2.value).intValue());
                            break;
                        case opc_ior:
                            newValue = new Integer(((Integer) value1.value).intValue() | ((Integer) value2.value).intValue());
                            break;
                        case opc_ixor:
                            newValue = new Integer(((Integer) value1.value).intValue() ^ ((Integer) value2.value).intValue());
                            break;

                        case opc_ladd:
                            newValue = new Long(((Long) value1.value).longValue() + ((Long) value2.value).longValue());
                            break;
                        case opc_lsub:
                            newValue = new Long(((Long) value1.value).longValue() - ((Long) value2.value).longValue());
                            break;
                        case opc_lmul:
                            newValue = new Long(((Long) value1.value).longValue() * ((Long) value2.value).longValue());
                            break;
                        case opc_ldiv:
                            newValue = new Long(((Long) value1.value).longValue() / ((Long) value2.value).longValue());
                            break;
                        case opc_lrem:
                            newValue = new Long(((Long) value1.value).longValue() % ((Long) value2.value).longValue());
                            break;
                        case opc_land:
                            newValue = new Long(((Long) value1.value).longValue() & ((Long) value2.value).longValue());
                            break;
                        case opc_lor:
                            newValue = new Long(((Long) value1.value).longValue() | ((Long) value2.value).longValue());
                            break;
                        case opc_lxor:
                            newValue = new Long(((Long) value1.value).longValue() ^ ((Long) value2.value).longValue());
                            break;

                        case opc_fadd:
                            newValue = new Float(((Float) value1.value).floatValue() + ((Float) value2.value).floatValue());
                            break;
                        case opc_fsub:
                            newValue = new Float(((Float) value1.value).floatValue() - ((Float) value2.value).floatValue());
                            break;
                        case opc_fmul:
                            newValue = new Float(((Float) value1.value).floatValue() * ((Float) value2.value).floatValue());
                            break;
                        case opc_fdiv:
                            newValue = new Float(((Float) value1.value).floatValue() / ((Float) value2.value).floatValue());
                            break;
                        case opc_frem:
                            newValue = new Float(((Float) value1.value).floatValue() % ((Float) value2.value).floatValue());
                            break;

                        case opc_dadd:
                            newValue = new Double(((Double) value1.value).doubleValue() + ((Double) value2.value).doubleValue());
                            break;
                        case opc_dsub:
                            newValue = new Double(((Double) value1.value).doubleValue() - ((Double) value2.value).doubleValue());
                            break;
                        case opc_dmul:
                            newValue = new Double(((Double) value1.value).doubleValue() * ((Double) value2.value).doubleValue());
                            break;
                        case opc_ddiv:
                            newValue = new Double(((Double) value1.value).doubleValue() / ((Double) value2.value).doubleValue());
                            break;
                        case opc_drem:
                            newValue = new Double(((Double) value1.value).doubleValue() % ((Double) value2.value).doubleValue());
                            break;
                        default:
                            throw new com.ziotic.jode.AssertError("Can't happen.");
                    }
                    info.constInfo = new ConstantInfo(CONSTANT, newValue);
                    result = new ConstValue(newValue);
                    result.addConstantListener(info.constInfo);
                    value1.addConstantListener(result);
                    value2.addConstantListener(result);
                } else
                    result = unknownValue[size - 1];
                mergeInfo(instr.getNextByAddr(), info.poppush(2 * size, result));
                break;
            }
            case opc_ineg:
            case opc_lneg:
            case opc_fneg:
            case opc_dneg: {
                int size = 1 + (opcode - opc_ineg & 1);
                ConstValue value = info.getStack(size);
                if (value.value != ConstValue.VOLATILE) {
                    Object newValue;
                    switch (opcode) {
                        case opc_ineg:
                            newValue = new Integer(-((Integer) value.value).intValue());
                            break;
                        case opc_lneg:
                            newValue = new Long(-((Long) value.value).longValue());
                            break;
                        case opc_fneg:
                            newValue = new Float(-((Float) value.value).floatValue());
                            break;
                        case opc_dneg:
                            newValue = new Double(-((Double) value.value).doubleValue());
                            break;
                        default:
                            throw new com.ziotic.jode.AssertError("Can't happen.");
                    }
                    info.constInfo = new ConstantInfo(CONSTANT, newValue);
                    result = new ConstValue(newValue);
                    result.addConstantListener(info.constInfo);
                    value.addConstantListener(result);
                } else
                    result = unknownValue[size - 1];
                mergeInfo(instr.getNextByAddr(), info.poppush(size, result));
                break;
            }
            case opc_ishl:
            case opc_lshl:
            case opc_ishr:
            case opc_lshr:
            case opc_iushr:
            case opc_lushr: {
                int size = 1 + (opcode - opc_iadd & 1);
                ConstValue value1 = info.getStack(size + 1);
                ConstValue value2 = info.getStack(1);
                if (value1.value != ConstValue.VOLATILE && value2.value != ConstValue.VOLATILE) {
                    Object newValue;
                    switch (opcode) {
                        case opc_ishl:
                            newValue = new Integer(((Integer) value1.value).intValue() << ((Integer) value2.value).intValue());
                            break;
                        case opc_ishr:
                            newValue = new Integer(((Integer) value1.value).intValue() >> ((Integer) value2.value).intValue());
                            break;
                        case opc_iushr:
                            newValue = new Integer(((Integer) value1.value).intValue() >>> ((Integer) value2.value).intValue());
                            break;

                        case opc_lshl:
                            newValue = new Long(((Long) value1.value).longValue() << ((Integer) value2.value).intValue());
                            break;
                        case opc_lshr:
                            newValue = new Long(((Long) value1.value).longValue() >> ((Integer) value2.value).intValue());
                            break;
                        case opc_lushr:
                            newValue = new Long(((Long) value1.value).longValue() >>> ((Integer) value2.value).intValue());
                            break;
                        default:
                            throw new com.ziotic.jode.AssertError("Can't happen.");
                    }
                    info.constInfo = new ConstantInfo(CONSTANT, newValue);
                    result = new ConstValue(newValue);
                    result.addConstantListener(info.constInfo);
                    value1.addConstantListener(result);
                    value2.addConstantListener(result);
                } else
                    result = unknownValue[size - 1];
                mergeInfo(instr.getNextByAddr(), info.poppush(size + 1, result));
                break;
            }
            case opc_iinc: {
                ConstValue local = info.getLocal(instr.getLocalSlot());
                if (local.value != ConstValue.VOLATILE) {
                    result = new ConstValue(new Integer(((Integer) local.value).intValue() + instr.getIncrement()));
                    local.addConstantListener(result);
                } else
                    result = unknownValue[0];
                mergeInfo(instr.getNextByAddr(), info.copy().setLocal(instr.getLocalSlot(), result));
                break;
            }
            case opc_i2l:
            case opc_i2f:
            case opc_i2d:
            case opc_l2i:
            case opc_l2f:
            case opc_l2d:
            case opc_f2i:
            case opc_f2l:
            case opc_f2d:
            case opc_d2i:
            case opc_d2l:
            case opc_d2f: {
                int insize = 1 + ((opcode - opc_i2l) / 3 & 1);
                ConstValue stack = info.getStack(insize);
                if (stack.value != ConstValue.VOLATILE) {
                    Object newVal;
                    switch (opcode) {
                        case opc_l2i:
                        case opc_f2i:
                        case opc_d2i:
                            newVal = new Integer(((Number) stack.value).intValue());
                            break;
                        case opc_i2l:
                        case opc_f2l:
                        case opc_d2l:
                            newVal = new Long(((Number) stack.value).longValue());
                            break;
                        case opc_i2f:
                        case opc_l2f:
                        case opc_d2f:
                            newVal = new Float(((Number) stack.value).floatValue());
                            break;
                        case opc_i2d:
                        case opc_l2d:
                        case opc_f2d:
                            newVal = new Double(((Number) stack.value).doubleValue());
                            break;
                        default:
                            throw new com.ziotic.jode.AssertError("Can't happen.");
                    }
                    info.constInfo = new ConstantInfo(CONSTANT, newVal);
                    result = new ConstValue(newVal);
                    result.addConstantListener(info.constInfo);
                    stack.addConstantListener(result);
                } else {
                    switch (opcode) {
                        case opc_i2l:
                        case opc_f2l:
                        case opc_d2l:
                        case opc_i2d:
                        case opc_l2d:
                        case opc_f2d:
                            result = unknownValue[1];
                            break;
                        default:
                            result = unknownValue[0];
                    }
                }
                mergeInfo(instr.getNextByAddr(), info.poppush(insize, result));
                break;
            }
            case opc_i2b:
            case opc_i2c:
            case opc_i2s: {
                ConstValue stack = info.getStack(1);
                if (stack.value != ConstValue.VOLATILE) {
                    int val = ((Integer) stack.value).intValue();
                    switch (opcode) {
                        case opc_i2b:
                            val = (byte) val;
                            break;
                        case opc_i2c:
                            val = (char) val;
                            break;
                        case opc_i2s:
                            val = (short) val;
                            break;
                    }
                    Integer newVal = new Integer(val);
                    info.constInfo = new ConstantInfo(CONSTANT, newVal);
                    result = new ConstValue(newVal);
                    stack.addConstantListener(info.constInfo);
                    stack.addConstantListener(result);
                } else
                    result = unknownValue[0];
                mergeInfo(instr.getNextByAddr(), info.poppush(1, result));
                break;
            }
            case opc_lcmp: {
                ConstValue val1 = info.getStack(4);
                ConstValue val2 = info.getStack(2);
                if (val1.value != ConstValue.VOLATILE && val2.value != ConstValue.VOLATILE) {
                    long value1 = ((Long) val1.value).longValue();
                    long value2 = ((Long) val1.value).longValue();
                    Integer newVal = new Integer(value1 == value2 ? 0 : value1 < value2 ? -1 : 1);
                    info.constInfo = new ConstantInfo(CONSTANT, newVal);
                    result = new ConstValue(newVal);
                    result.addConstantListener(info.constInfo);
                    val1.addConstantListener(result);
                    val2.addConstantListener(result);
                } else
                    result = unknownValue[0];
                mergeInfo(instr.getNextByAddr(), info.poppush(4, result));
                break;
            }
            case opc_fcmpl:
            case opc_fcmpg: {
                ConstValue val1 = info.getStack(2);
                ConstValue val2 = info.getStack(1);
                if (val1.value != ConstValue.VOLATILE && val2.value != ConstValue.VOLATILE) {
                    float value1 = ((Float) val1.value).floatValue();
                    float value2 = ((Float) val1.value).floatValue();
                    Integer newVal = new Integer(value1 == value2 ? 0 : (opcode == opc_fcmpg ? (value1 < value2 ? -1 : 1) : (value1 > value2 ? 1 : -1)));
                    info.constInfo = new ConstantInfo(CONSTANT, newVal);
                    result = new ConstValue(newVal);
                    result.addConstantListener(info.constInfo);
                    val1.addConstantListener(result);
                    val2.addConstantListener(result);
                } else
                    result = unknownValue[0];
                mergeInfo(instr.getNextByAddr(), info.poppush(2, result));
                break;
            }
            case opc_dcmpl:
            case opc_dcmpg: {
                ConstValue val1 = info.getStack(4);
                ConstValue val2 = info.getStack(2);
                if (val1.value != ConstValue.VOLATILE && val2.value != ConstValue.VOLATILE) {
                    double value1 = ((Double) val1.value).doubleValue();
                    double value2 = ((Double) val1.value).doubleValue();
                    Integer newVal = new Integer(value1 == value2 ? 0 : (opcode == opc_dcmpg ? (value1 < value2 ? -1 : 1) : (value1 > value2 ? 1 : -1)));
                    info.constInfo = new ConstantInfo(CONSTANT, newVal);
                    result = new ConstValue(newVal);
                    result.addConstantListener(info.constInfo);
                    val1.addConstantListener(result);
                    val2.addConstantListener(result);
                } else
                    result = unknownValue[0];
                mergeInfo(instr.getNextByAddr(), info.poppush(4, result));
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
                int size = 1;
                ConstValue stacktop = info.getStack(1);
                ConstValue other = null;
                boolean known = stacktop.value != ConstValue.VOLATILE;
                if (opcode >= opc_if_icmpeq && opcode <= opc_if_acmpne) {
                    other = info.getStack(2);
                    size = 2;
                    known &= other.value != ConstValue.VOLATILE;
                }
                if (known) {
                    stacktop.addConstantListener(info);
                    if (other != null)
                        other.addConstantListener(info);

                    Instruction pc = instr.getNextByAddr();
                    int opc_mask;
                    if (opcode >= opc_if_acmpeq) {
                        if (opcode >= opc_ifnull) {
                            opc_mask = stacktop.value == null ? CMP_EQUAL_MASK : CMP_GREATER_MASK;
                            opcode -= opc_ifnull;
                        } else {
                            opc_mask = stacktop.value == other.value ? CMP_EQUAL_MASK : CMP_GREATER_MASK;
                            opcode -= opc_if_acmpeq;
                        }
                    } else {
                        int value = ((Integer) stacktop.value).intValue();
                        if (opcode >= opc_if_icmpeq) {
                            int val1 = ((Integer) other.value).intValue();
                            opc_mask = (val1 == value ? CMP_EQUAL_MASK : val1 < value ? CMP_LESS_MASK : CMP_GREATER_MASK);
                            opcode -= opc_if_icmpeq;
                        } else {
                            opc_mask = (value == 0 ? CMP_EQUAL_MASK : value < 0 ? CMP_LESS_MASK : CMP_GREATER_MASK);
                            opcode -= opc_ifeq;
                        }
                    }

                    if ((opc_mask & (1 << opcode)) != 0)
                        pc = instr.getSingleSucc();

                    info.constInfo = new ConstantInfo(CONSTANTFLOW, pc);
                    mergeInfo(pc, info.pop(size));
                } else {
                    mergeInfo(instr.getNextByAddr(), info.pop(size));
                    mergeInfo(instr.getSingleSucc(), info.pop(size));
                }
                break;
            }
            case opc_goto:
                mergeInfo(instr.getSingleSucc(), info.copy());
                break;
            case opc_lookupswitch: {
                ConstValue stacktop = info.getStack(1);
                if (stacktop.value != ConstValue.VOLATILE) {
                    stacktop.addConstantListener(info);
                    Instruction pc;
                    int value = ((Integer) stacktop.value).intValue();
                    int[] values = instr.getValues();
                    pc = instr.getSuccs()[values.length];
                    for (int i = 0; i < values.length; i++) {
                        if (values[i] == value) {
                            pc = instr.getSuccs()[i];
                            break;
                        }
                    }
                    info.constInfo = new ConstantInfo(CONSTANTFLOW, pc);
                    mergeInfo(pc, info.pop(1));
                } else {
                    for (int i = 0; i < instr.getSuccs().length; i++)
                        mergeInfo(instr.getSuccs()[i], info.pop(1));
                }
                break;
            }
            case opc_jsr:
//  	    dumpStackLocalInfo();
//  	    System.err.println(instr);
                if (instr.getSingleSucc().getOpcode() != opc_astore)
                    throw new RuntimeException("Can't handle jsr to non astores");
                StackLocalInfo oldJsrInfo = (StackLocalInfo) instr.getSingleSucc().getTmpInfo();
                if (oldJsrInfo != null) {
                    result = oldJsrInfo.getStack(1);
                    if (oldJsrInfo.retInfo != null && result.value instanceof JSRTargetInfo) {
                        mergeInfo(instr.getNextByAddr(), info.copy().mergeRetLocals((JSRTargetInfo) result.value, oldJsrInfo.retInfo));
                    }
                } else {
                    result = new ConstValue(new JSRTargetInfo(instr.getSingleSucc()));
                }
                mergeInfo(instr.getSingleSucc(), info.poppush(0, result));
                break;
            case opc_ret: {
//  	    dumpStackLocalInfo();
//  	    System.err.println(instr);
                result = info.getLocal(instr.getLocalSlot());
                JSRTargetInfo jsrInfo = (JSRTargetInfo) result.value;
                jsrInfo.setRetInfo(info);
                result.addConstantListener(info);
                Instruction jsrTarget = jsrInfo.jsrTarget;
                StackLocalInfo jsrTargetStackInfo = (StackLocalInfo) jsrTarget.getTmpInfo();
                jsrTargetStackInfo.retInfo = info;
                jsrTargetStackInfo.constInfo.flags |= RETURNINGJSR;
                Instruction[] jsrs = jsrTarget.getPreds();
                for (int i = 0; i < jsrs.length; i++) {
                    Instruction jsr = jsrs[i];
                    if (jsr.getTmpInfo() != null) {
                        mergeInfo(jsr.getNextByAddr(), ((StackLocalInfo) jsr.getTmpInfo()).copy().mergeRetLocals(jsrInfo, info));
                    }
                }
                break;
            }
            case opc_ireturn:
            case opc_lreturn:
            case opc_freturn:
            case opc_dreturn:
            case opc_areturn:
            case opc_return:
            case opc_athrow:
                break;

            case opc_putstatic:
            case opc_putfield: {
                FieldIdentifier fi = (FieldIdentifier) canonizeReference(instr);
                Reference ref = instr.getReference();
                int size = TypeSignature.getTypeSize(ref.getType());
                if (fi != null && !fi.isNotConstant()) {
                    ConstValue stacktop = info.getStack(size);
                    Object fieldVal = fi.getConstant();
                    if (fieldVal == null)
                        fieldVal = runtime.getDefaultValue(ref.getType());
                    if (stacktop.value == null ? fieldVal == null : stacktop.value.equals(fieldVal)) {
                        stacktop.addConstantListener(info);
                    } else {
                        fi.setNotConstant();
                        fieldNotConstant(fi);
                    }
                }
                size += (opcode == opc_putstatic) ? 0 : 1;
                mergeInfo(instr.getNextByAddr(), info.pop(size));
                break;
            }
            case opc_getstatic:
            case opc_getfield: {
                int size = (opcode == opc_getstatic) ? 0 : 1;
                FieldIdentifier fi = (FieldIdentifier) canonizeReference(instr);
                Reference ref = instr.getReference();
                int typesize = TypeSignature.getTypeSize(ref.getType());
                if (fi != null) {
                    if (fi.isNotConstant()) {
                        fi.setReachable();
                        result = unknownValue[typesize - 1];
                    } else {
                        Object obj = fi.getConstant();
                        if (obj == null)
                            obj = runtime.getDefaultValue(ref.getType());
                        info.constInfo = new ConstantInfo(CONSTANT, obj);
                        result = new ConstValue(obj);
                        result.addConstantListener(info.constInfo);
                        fi.addFieldListener(fieldListener);
                    }
                } else
                    result = unknownValue[typesize - 1];
                mergeInfo(instr.getNextByAddr(), info.poppush(size, result));
                break;
            }
            case opc_invokespecial:
            case opc_invokestatic:
            case opc_invokeinterface:
            case opc_invokevirtual: {
                canonizeReference(instr);
                Reference ref = instr.getReference();
                boolean constant = true;
                int size = 0;
                Object cls = null;
                String[] paramTypes = TypeSignature.getParameterTypes(ref.getType());
                Object[] args = new Object[paramTypes.length];
                ConstValue clsValue = null;
                ConstValue[] argValues = new ConstValue[paramTypes.length];

                for (int i = paramTypes.length - 1; i >= 0; i--) {
                    size += TypeSignature.getTypeSize(paramTypes[i]);
                    Object value = (argValues[i] = info.getStack(size)).value;
                    if (value != ConstValue.VOLATILE)
                        args[i] = value;
                    else
                        constant = false;
                }

                if (opcode != opc_invokestatic) {
                    size++;
                    clsValue = info.getStack(size);
                    cls = clsValue.value;
                    if (cls == ConstValue.VOLATILE || cls == null)
                        constant = false;
                }
                String retType = TypeSignature.getReturnType(ref.getType());
                if (retType.equals("V")) {
                    handleReference(ref, opcode == opc_invokevirtual || opcode == opc_invokeinterface);
                    mergeInfo(instr.getNextByAddr(), info.pop(size));
                    break;
                }
                if (constant && !runtime.isWhite(retType)) {
                    /* This is not a valid constant type */
                    constant = false;
                }
                Object methodResult = null;
                if (constant) {
                    try {
                        methodResult = runtime.invokeMethod(ref, opcode != opc_invokespecial, cls, args);
                    } catch (InterpreterException ex) {
                        constant = false;
                        if (com.ziotic.jode.GlobalOptions.verboseLevel > 3)
                            GlobalOptions.err.println("Can't interpret " + ref + ": " + ex.getMessage());
                        /* result is not constant */
                    } catch (InvocationTargetException ex) {
                        constant = false;
                        if (com.ziotic.jode.GlobalOptions.verboseLevel > 3)
                            GlobalOptions.err.println("Method " + ref + " throwed exception: " + ex.getTargetException());
                        /* method always throws exception ? */
                    }
                }
                ConstValue returnVal;
                if (!constant) {
                    handleReference(ref, opcode == opc_invokevirtual || opcode == opc_invokeinterface);
                    int retsize = TypeSignature.getTypeSize(retType);
                    returnVal = unknownValue[retsize - 1];
                } else {
                    info.constInfo = new ConstantInfo(CONSTANT, methodResult);
                    returnVal = new ConstValue(methodResult);
                    returnVal.addConstantListener(info.constInfo);
                    if (clsValue != null)
                        clsValue.addConstantListener(returnVal);
                    for (int i = 0; i < argValues.length; i++)
                        argValues[i].addConstantListener(returnVal);
                }
                mergeInfo(instr.getNextByAddr(), info.poppush(size, returnVal));
                break;
            }

            case opc_new: {
                handleClass(instr.getClazzType());
                mergeInfo(instr.getNextByAddr(), info.poppush(0, unknownValue[0]));
                break;
            }
            case opc_arraylength: {
//  	    ConstValue array = info.getStack(1);
//  	    if (array.value != ConstValue.VOLATILE
//  		&& array.value != null) {
//  		Integer newValue = new Integer(Array.getLength(array.value));
//  		info.constInfo = new ConstantInfo(CONSTANT, newValue);
//  		result = new ConstValue(newValue);
//  		result.addConstantListener(info.constInfo);
//  		array.addConstantListener(result);
//  	    } else
                result = unknownValue[0];
                mergeInfo(instr.getNextByAddr(), info.poppush(1, result));
                break;
            }
            case opc_checkcast: {
                handleClass(instr.getClazzType());
                mergeInfo(instr.getNextByAddr(), info.pop(0));
                break;
            }
            case opc_instanceof: {
                handleClass(instr.getClazzType());
                mergeInfo(instr.getNextByAddr(), info.poppush(1, unknownValue[0]));
                break;
            }
            case opc_monitorenter:
            case opc_monitorexit:
                mergeInfo(instr.getNextByAddr(), info.pop(1));
                break;
            case opc_multianewarray:
                handleClass(instr.getClazzType());
                mergeInfo(instr.getNextByAddr(), info.poppush(instr.getDimensions(), unknownValue[0]));
                break;
            default:
                throw new IllegalArgumentException("Invalid opcode " + opcode);
        }
    }

    public void fieldNotConstant(FieldIdentifier fi) {
        for (Iterator iter = bytecode.getInstructions().iterator(); iter.hasNext(); ) {
            Instruction instr = (Instruction) iter.next();
            if (instr.getOpcode() == opc_getfield || instr.getOpcode() == opc_getstatic) {
                Reference ref = instr.getReference();
                if (ref.getName().equals(fi.getName()) && ref.getType().equals(fi.getType()) && instr.getTmpInfo() != null) {
                    ((StackLocalInfo) instr.getTmpInfo()).enqueue();
                }
            }
        }
    }

    public void dumpStackLocalInfo() {
        for (Iterator iter = bytecode.getInstructions().iterator(); iter.hasNext(); ) {
            Instruction instr = (Instruction) iter.next();
            System.err.println("" + instr.getTmpInfo());
            System.err.println(instr.getDescription());
        }
    }

    public void analyzeCode(MethodIdentifier methodIdent, BytecodeInfo bytecode) {
        this.bytecode = bytecode;
        TodoQueue modifiedQueue = new TodoQueue();
        MethodInfo minfo = bytecode.getMethodInfo();

        for (Iterator iter = bytecode.getInstructions().iterator(); iter.hasNext(); ) {
            Instruction instr = (Instruction) iter.next();
            instr.setTmpInfo(null);
        }

        StackLocalInfo firstInfo = new StackLocalInfo(bytecode.getMaxLocals(), minfo.isStatic(), minfo.getType(), modifiedQueue);
        firstInfo.instr = (Instruction) bytecode.getInstructions().get(0);
        firstInfo.instr.setTmpInfo(firstInfo);
        firstInfo.enqueue();
        runtime.setFieldListener(methodIdent);
        while (modifiedQueue.first != null) {
            StackLocalInfo info = modifiedQueue.first;
            modifiedQueue.first = info.nextOnQueue;
            info.nextOnQueue = null;
            handleOpcode(info, methodIdent);
        }
        runtime.setFieldListener(null);

        Handler[] handlers = bytecode.getExceptionHandlers();
        for (int i = 0; i < handlers.length; i++) {
            if (handlers[i].catcher.getTmpInfo() != null && handlers[i].type != null)
                Main.getClassBundle().reachableClass(handlers[i].type);
        }
        for (Iterator iter = bytecode.getInstructions().iterator(); iter.hasNext(); ) {
            Instruction instr = (Instruction) iter.next();
            StackLocalInfo info = (StackLocalInfo) instr.getTmpInfo();
            if (info != null) {
                if (info.constInfo.flags == 0)
                    instr.setTmpInfo(unknownConstInfo);
                else
                    instr.setTmpInfo(info.constInfo);
            }
        }
    }

    public static void replaceWith(ListIterator iter, Instruction instr, Instruction replacement) {
        switch (instr.getOpcode()) {
            case opc_goto:
            case opc_ldc:
            case opc_ldc2_w:
            case opc_iload:
            case opc_lload:
            case opc_fload:
            case opc_dload:
            case opc_aload:
            case opc_getstatic:
                if (replacement == null)
                    iter.remove();
                else
                    iter.set(replacement);
                return;
            case opc_ifeq:
            case opc_ifne:
            case opc_iflt:
            case opc_ifge:
            case opc_ifgt:
            case opc_ifle:
            case opc_ifnull:
            case opc_ifnonnull:
            case opc_arraylength:
            case opc_getfield:
            case opc_i2l:
            case opc_i2f:
            case opc_i2d:
            case opc_f2i:
            case opc_f2l:
            case opc_f2d:
            case opc_i2b:
            case opc_i2c:
            case opc_i2s:
            case opc_ineg:
            case opc_fneg:
                iter.set(new Instruction(opc_pop));
                break;
            case opc_lcmp:
            case opc_dcmpg:
            case opc_dcmpl:
            case opc_ladd:
            case opc_dadd:
            case opc_lsub:
            case opc_dsub:
            case opc_lmul:
            case opc_dmul:
            case opc_ldiv:
            case opc_ddiv:
            case opc_lrem:
            case opc_drem:
            case opc_land:
            case opc_lor:
            case opc_lxor:
                iter.set(new Instruction(opc_pop2));
                iter.add(new Instruction(opc_pop2));
                break;
            case opc_if_icmpeq:
            case opc_if_icmpne:
            case opc_if_icmplt:
            case opc_if_icmpge:
            case opc_if_icmpgt:
            case opc_if_icmple:
            case opc_if_acmpeq:
            case opc_if_acmpne:
            case opc_fcmpg:
            case opc_fcmpl:
            case opc_l2i:
            case opc_l2f:
            case opc_l2d:
            case opc_d2i:
            case opc_d2l:
            case opc_d2f:
            case opc_lneg:
            case opc_dneg:
            case opc_iadd:
            case opc_fadd:
            case opc_isub:
            case opc_fsub:
            case opc_imul:
            case opc_fmul:
            case opc_idiv:
            case opc_fdiv:
            case opc_irem:
            case opc_frem:
            case opc_iand:
            case opc_ior:
            case opc_ixor:
            case opc_ishl:
            case opc_ishr:
            case opc_iushr:
            case opc_iaload:
            case opc_laload:
            case opc_faload:
            case opc_daload:
            case opc_aaload:
            case opc_baload:
            case opc_caload:
            case opc_saload:
                iter.set(new Instruction(opc_pop2));
                break;

            case opc_lshl:
            case opc_lshr:
            case opc_lushr:
                iter.set(new Instruction(opc_pop));
                iter.add(new Instruction(opc_pop2));
                break;
            case opc_putstatic:
            case opc_putfield:
                if (TypeSignature.getTypeSize(instr.getReference().getType()) == 2) {
                    iter.set(new Instruction(opc_pop2));
                    if (instr.getOpcode() == opc_putfield)
                        iter.add(new Instruction(opc_pop));
                } else
                    iter.set(new Instruction(instr.getOpcode() == opc_putfield ? opc_pop2 : opc_pop));
                break;
            case opc_invokespecial:
            case opc_invokestatic:
            case opc_invokeinterface:
            case opc_invokevirtual: {
                Reference ref = instr.getReference();
                String[] pt = TypeSignature.getParameterTypes(ref.getType());
                int len = pt.length;

                if (len > 0) {
                    iter.set(new Instruction(TypeSignature.getTypeSize(pt[--len]) + opc_pop - 1));
                    for (int i = len - 1; i >= 0; i--)
                        iter.add(new Instruction(TypeSignature.getTypeSize(pt[i]) + opc_pop - 1));
                    if (instr.getOpcode() != opc_invokestatic)
                        iter.add(new Instruction(opc_pop));
                } else if (instr.getOpcode() != opc_invokestatic) {
                    iter.set(new Instruction(opc_pop));
                } else {
                    if (replacement == null)
                        iter.remove();
                    else
                        iter.set(replacement);
                    return;
                }
            }
        }
        if (replacement != null)
            iter.add(replacement);
    }

    public void appendJump(ListIterator iter, Instruction dest) {
        /* Add a goto instruction after this opcode. */
        Instruction gotoInstr = new Instruction(Instruction.opc_goto);
        gotoInstr.setSuccs(dest);
        iter.add(gotoInstr);
    }

    public void transformCode(BytecodeInfo bytecode) {
        for (ListIterator iter = bytecode.getInstructions().listIterator(); iter.hasNext(); ) {
            Instruction instr = (Instruction) iter.next();
            ConstantInfo info = (ConstantInfo) instr.getTmpInfo();
            instr.setTmpInfo(null);

            if (info == null || (info.flags & (RETURNINGJSR | RETASTORE)) == RETASTORE) {
                /* This instruction can't be reached logically, or
             * it is a return value astore, that should be removed */
                iter.remove();
            } else if ((info.flags & CONSTANT) != 0) {
                if (instr.getOpcode() > opc_ldc2_w) {
                    Instruction ldcInstr = new Instruction(info.constant instanceof Long || info.constant instanceof Double ? opc_ldc2_w : opc_ldc);
                    ldcInstr.setConstant(info.constant);
                    replaceWith(iter, instr, ldcInstr);
                    if (GlobalOptions.verboseLevel > 2)
                        GlobalOptions.err.println(bytecode + ": Replacing " + instr + " with constant " + info.constant);
                }
            } else if ((info.flags & CONSTANTFLOW) != 0) {
                Instruction pc = (Instruction) info.constant;
                if (instr.getOpcode() >= opc_if_icmpeq && instr.getOpcode() <= opc_if_acmpne)
                    iter.set(new Instruction(opc_pop2));
                else
                    iter.set(new Instruction(opc_pop));
                if (GlobalOptions.verboseLevel > 2)
                    GlobalOptions.err.println(bytecode + ": Replacing " + instr + " with goto " + pc.getAddr());
                while (iter.hasNext()) {
                    ConstantInfo nextinfo = (ConstantInfo) ((Instruction) iter.next()).getTmpInfo();
                    if (nextinfo != null) {
                        Instruction nextInstr = (Instruction) iter.previous();
                        if (pc != nextInstr)
                            appendJump(iter, pc);
                        break;
                    }
                    /* Next instruction can't be reached logically */
                    iter.remove();
                }
            } else {
                int opcode = instr.getOpcode();
                switch (opcode) {
                    case opc_nop:
                        iter.remove();
                        break;

                    case opc_jsr:
                        ConstantInfo jsrinfo = (ConstantInfo) instr.getSingleSucc().getTmpInfo();
                        if ((jsrinfo.flags & RETURNINGJSR) != 0)
                            /* A normal jsr, don't change it */
                            break;

                        /* This means, the jsr will never return.  We
                   * replace it with a goto,  the jsr will transform
                   * itself to remove the astore operation.
                   */
                        Instruction gotoInstr = new Instruction(opc_goto);
                        gotoInstr.setSuccs(instr.getSingleSucc());
                        iter.set(gotoInstr);
                        /* fall through */
                    case opc_goto:
                    case opc_ifeq:
                    case opc_ifne:
                    case opc_iflt:
                    case opc_ifge:
                    case opc_ifgt:
                    case opc_ifle:
                    case opc_ifnull:
                    case opc_ifnonnull:
                    case opc_if_icmpeq:
                    case opc_if_icmpne:
                    case opc_if_icmplt:
                    case opc_if_icmpge:
                    case opc_if_icmpgt:
                    case opc_if_icmple:
                    case opc_if_acmpeq:
                    case opc_if_acmpne:

                        while (iter.hasNext()) {
                            ConstantInfo nextinfo = (ConstantInfo) ((Instruction) iter.next()).getTmpInfo();
                            if (nextinfo != null && ((nextinfo.flags & (RETURNINGJSR | RETASTORE)) != RETASTORE)) {

                                Instruction nextInstr = (Instruction) iter.previous();
                                if (instr.getSingleSucc() == nextInstr) {
                                    /* put iter in sane state */
                                    iter.previous();
                                    iter.next();
                                    replaceWith(iter, instr, null);
                                }
                                break;
                            }
                            /* Next instruction can be removed */
                            iter.remove();
                        }
                        break;

                    case opc_putstatic:
                    case opc_putfield: {
                        Reference ref = instr.getReference();
                        FieldIdentifier fi = (FieldIdentifier) Main.getClassBundle().getIdentifier(ref);
                        if (fi != null && (Main.stripping & Main.STRIP_UNREACH) != 0 && !fi.isReachable()) {
                            replaceWith(iter, instr, null);
                        }
                        break;
                    }
                }
            }
        }
    }
}
