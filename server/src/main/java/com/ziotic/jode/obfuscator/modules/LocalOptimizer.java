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

import java.util.*;

import com.ziotic.jode.AssertError;
import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.*;
import com.ziotic.jode.obfuscator.CodeTransformer;
import com.ziotic.jode.obfuscator.Main;

/**
 * This class takes some bytecode and tries to minimize the number
 * of locals used.  It will also remove unnecessary stores.
 * <p/>
 * This class can only work on verified code.  There should also be no
 * deadcode, since the verifier doesn't check that deadcode behaves
 * okay.
 * <p/>
 * This is done in two phases.  First we determine which locals are
 * the same, and which locals have a overlapping life time. In the
 * second phase we will then redistribute the locals with a coloring
 * graph algorithm.
 * <p/>
 * The idea for the first phase is: For each read we follow the
 * instruction flow backward to find the corresponding writes.  We can
 * also merge with another control flow that has a different read, in
 * this case we merge with that read, too.
 * <p/>
 * The tricky part is the subroutine handling.  We follow the local
 * that is used in a ret and find the corresponding jsr target (there
 * must be only one, if the verifier should accept this class).  While
 * we do this we remember in the info of the ret, which locals are
 * used in that subroutine.
 * <p/>
 * When we know the jsr target<->ret correlation, we promote from the
 * nextByAddr of every jsr the locals that are accessed by the
 * subroutine to the corresponding ret and the others to the jsr.  Also
 * we will promote all reads from the jsr targets to the jsr.
 * <p/>
 * If you think this might be to complicated, keep in mind that jsr's
 * are not only left by the ret instructions, but also "spontanously"
 * (by not reading the return address again).
 */
public class LocalOptimizer implements Opcodes, CodeTransformer {

    /**
     * This class keeps track of which locals must be the same, which
     * name and type each local (if there is a local variable table) and
     * which other locals have an intersecting life time.
     */
    class LocalInfo {
        LocalInfo shadow = null;

        public LocalInfo getReal() {
            LocalInfo real = this;
            while (real.shadow != null)
                real = real.shadow;
            return real;
        }

        String name;
        String type;
        Vector usingInstrs = new Vector();
        Vector conflictingLocals = new Vector();
        int size;
        int newSlot = -1;

        LocalInfo() {
        }

        LocalInfo(InstrInfo instr) {
            usingInstrs.addElement(instr);
        }

        void conflictsWith(LocalInfo l) {
            if (shadow != null) {
                getReal().conflictsWith(l);
            } else {
                l = l.getReal();
                if (!conflictingLocals.contains(l)) {
                    conflictingLocals.addElement(l);
                    l.conflictingLocals.addElement(this);
                }
            }
        }

        void combineInto(LocalInfo l) {
            if (shadow != null) {
                getReal().combineInto(l);
                return;
            }
            l = l.getReal();
            if (this == l)
                return;
            shadow = l;
            if (shadow.name == null) {
                shadow.name = name;
                shadow.type = type;
            }
            Enumeration enum_ = usingInstrs.elements();
            while (enum_.hasMoreElements()) {
                InstrInfo instr = (InstrInfo) enum_.nextElement();
                instr.local = l;
                l.usingInstrs.addElement(instr);
            }
        }

        public int getFirstAddr() {
            int minAddr = Integer.MAX_VALUE;
            Enumeration enum_ = usingInstrs.elements();
            while (enum_.hasMoreElements()) {
                InstrInfo info = (InstrInfo) enum_.nextElement();
                if (info.instr.getAddr() < minAddr)
                    minAddr = info.instr.getAddr();
            }
            return minAddr;
        }
    }

    private static class TodoQueue {
        public final InstrInfo LAST = new InstrInfo();
        InstrInfo first = LAST;

        public void add(InstrInfo info) {
            if (info.nextTodo == null) {
                /* only enqueue if not already on queue */
                info.nextTodo = first;
                first = info;
            }
        }

        public boolean isEmpty() {
            return first == LAST;
        }

        public InstrInfo remove() {
            if (first == LAST)
                throw new NoSuchElementException();
            InstrInfo result = first;
            first = result.nextTodo;
            result.nextTodo = null;
            return result;
        }
    }

    /**
     * This class contains information for each instruction.
     */
    static class InstrInfo {
        /**
         * The next changed InstrInfo, or null, if this instr info did
         * not changed.
         */
        InstrInfo nextTodo;

        /**
         * The LocalInfo that this instruction manipulates, or null
         * if this is not an ret, iinc, load or store instruction.
         */
        LocalInfo local;
        /**
         * For each slot, this contains the InstrInfo of one of the
         * next Instruction, that may read from that slot, without
         * prior writing.
         */
        InstrInfo[] nextReads;

        /**
         * This only has a value for ret instructions.  In that case
         * this bitset contains all locals, that may be used between
         * jsr and ret.
         */
        BitSet usedBySub;
        /**
         * For each slot if get() is true, no instruction may read
         * this slot, since it may contain different locals, depending
         * on flow.
         */
        LocalInfo[] lifeLocals;
        /**
         * If instruction is the destination of a jsr, this contains
         * the single allowed ret instruction info, or null if there
         * is no ret at all (or not yet detected).
         */
        InstrInfo retInfo;
        /**
         * If this instruction is a ret, this contains the single
         * allowed jsr target to which this ret belongs.
         */
        InstrInfo jsrTargetInfo;
        /**
         * The Instruction of this info
         */
        Instruction instr;
        /**
         * The next info in the chain.
         */
        InstrInfo nextInfo;
    }

    BytecodeInfo bc;

    TodoQueue changedInfos;
    InstrInfo firstInfo;
    Hashtable instrInfos;
    boolean produceLVT;
    int maxlocals;

    LocalInfo[] paramLocals;

    public LocalOptimizer() {
    }

    /**
     * Merges the given vector to a new vector.  Both vectors may
     * be null in which case they are interpreted as empty vectors.
     * The vectors will never changed, but the result may be one
     * of the given vectors.
     */
    Vector merge(Vector v1, Vector v2) {
        if (v1 == null || v1.isEmpty())
            return v2;
        if (v2 == null || v2.isEmpty())
            return v1;
        Vector result = (Vector) v1.clone();
        Enumeration enum_ = v2.elements();
        while (enum_.hasMoreElements()) {
            Object elem = enum_.nextElement();
            if (!result.contains(elem))
                result.addElement(elem);
        }
        return result;
    }

    void promoteReads(InstrInfo info, Instruction preInstr, BitSet mergeSet, boolean inverted) {
        InstrInfo preInfo = (InstrInfo) instrInfos.get(preInstr);
        int omitLocal = -1;
        if (preInstr.getOpcode() >= opc_istore && preInstr.getOpcode() <= opc_astore) {
            /* This is a store */
            omitLocal = preInstr.getLocalSlot();
            if (info.nextReads[omitLocal] != null)
                preInfo.local.combineInto(info.nextReads[omitLocal].local);
        }
        for (int i = 0; i < maxlocals; i++) {
            if (info.nextReads[i] != null && i != omitLocal && (mergeSet == null || mergeSet.get(i) != inverted)) {

                if (preInfo.nextReads[i] == null) {
                    preInfo.nextReads[i] = info.nextReads[i];
                    changedInfos.add(preInfo);
                } else {
                    preInfo.nextReads[i].local.combineInto(info.nextReads[i].local);
                }
            }
        }
    }

    void promoteReads(InstrInfo info, Instruction preInstr) {
        promoteReads(info, preInstr, null, false);
    }

    public LocalVariableInfo findLVTEntry(LocalVariableInfo[] lvt, int slot, int addr) {
        LocalVariableInfo match = null;
        for (int i = 0; i < lvt.length; i++) {
            if (lvt[i].slot == slot && lvt[i].start.getAddr() <= addr && lvt[i].end.getAddr() >= addr) {
                if (match != null && (!match.name.equals(lvt[i].name) || !match.type.equals(lvt[i].type))) {
                    /* Multiple matches..., give no info */
                    return null;
                }
                match = lvt[i];
            }
        }
        return match;
    }

    public LocalVariableInfo findLVTEntry(LocalVariableInfo[] lvt, Instruction instr) {
        int addr;
        if (instr.getOpcode() >= opc_istore && instr.getOpcode() <= opc_astore)
            addr = instr.getNextAddr();
        else
            addr = instr.getAddr();
        return findLVTEntry(lvt, instr.getLocalSlot(), addr);
    }

    public void calcLocalInfo() {
        maxlocals = bc.getMaxLocals();
        Handler[] handlers = bc.getExceptionHandlers();
        LocalVariableInfo[] lvt = bc.getLocalVariableTable();
        if (lvt != null)
            produceLVT = true;

        /* Initialize paramLocals */
        {
            String methodType = bc.getMethodInfo().getType();
            int paramCount = (bc.getMethodInfo().isStatic() ? 0 : 1) + TypeSignature.getArgumentSize(methodType);
            paramLocals = new LocalInfo[paramCount];
            int slot = 0;
            if (!bc.getMethodInfo().isStatic()) {
                LocalInfo local = new LocalInfo();
                if (lvt != null) {
                    LocalVariableInfo lvi = findLVTEntry(lvt, 0, 0);
                    if (lvi != null) {
                        local.name = lvi.name;
                        local.type = lvi.type;
                    }
                }
                local.size = 1;
                paramLocals[slot++] = local;
            }
            int pos = 1;
            while (pos < methodType.length() && methodType.charAt(pos) != ')') {

                LocalInfo local = new LocalInfo();
                if (lvt != null) {
                    LocalVariableInfo lvi = findLVTEntry(lvt, slot, 0);
                    if (lvi != null) {
                        local.name = lvi.name;
                    }
                }

                int start = pos;
                pos = TypeSignature.skipType(methodType, pos);
                local.type = methodType.substring(start, pos);
                local.size = TypeSignature.getTypeSize(local.type);
                paramLocals[slot] = local;
                slot += local.size;
            }
        }

        /* Initialize the InstrInfos and LocalInfos
       */
        changedInfos = new TodoQueue();
        instrInfos = new Hashtable();
        {
            InstrInfo info = firstInfo = new InstrInfo();
            Iterator i = bc.getInstructions().iterator();
            while (true) {
                Instruction instr = (Instruction) i.next();
                instrInfos.put(instr, info);
                info.instr = instr;
                info.nextReads = new InstrInfo[maxlocals];
                if (instr.hasLocalSlot()) {
                    info.local = new LocalInfo(info);
                    if (lvt != null) {
                        LocalVariableInfo lvi = findLVTEntry(lvt, instr);
                        if (lvi != null) {
                            info.local.name = lvi.name;
                            info.local.type = lvi.type;
                        }
                    }
                    info.local.size = 1;
                    switch (instr.getOpcode()) {
                        case opc_lload:
                        case opc_dload:
                            info.local.size = 2;
                            /* fall through */
                        case opc_iload:
                        case opc_fload:
                        case opc_aload:
                        case opc_iinc:
                            /* this is a load instruction */
                            info.nextReads[instr.getLocalSlot()] = info;
                            changedInfos.add(info);
                            break;

                        case opc_ret:
                            /* this is a ret instruction */
                            info.usedBySub = new BitSet();
                            info.nextReads[instr.getLocalSlot()] = info;
                            changedInfos.add(info);
                            break;

                        case opc_lstore:
                        case opc_dstore:
                            info.local.size = 2;
                            //case opc_istore: case opc_fstore: case opc_astore:
                    }
                }
                if (!i.hasNext())
                    break;
                info = info.nextInfo = new InstrInfo();
            }
        }

        /* find out which locals are the same.
       */
        while (!changedInfos.isEmpty()) {
            InstrInfo info = changedInfos.remove();
            Instruction instr = info.instr;

            /* Mark the local as used in all ret instructions */
            if (instr.hasLocalSlot()) {
                int slot = instr.getLocalSlot();
                for (int i = 0; i < maxlocals; i++) {
                    InstrInfo retInfo = info.nextReads[i];
                    if (retInfo != null && retInfo.instr.getOpcode() == opc_ret && !retInfo.usedBySub.get(slot)) {
                        retInfo.usedBySub.set(slot);
                        if (retInfo.jsrTargetInfo != null)
                            changedInfos.add(retInfo.jsrTargetInfo);
                    }
                }
            }

            Instruction prevInstr = instr.getPrevByAddr();
            if (prevInstr != null) {
                if (!prevInstr.doesAlwaysJump())
                    promoteReads(info, prevInstr);
                else if (prevInstr.getOpcode() == opc_jsr) {
                    /* Prev instr is a jsr, promote reads to the
                  * corresponding ret.
                  */
                    InstrInfo jsrInfo = (InstrInfo) instrInfos.get(prevInstr.getSingleSucc());
                    if (jsrInfo.retInfo != null) {
                        /* Now promote reads that are modified by the
                   * subroutine to the ret, and those that are not
                   * to the jsr instruction.
                   */
                        promoteReads(info, jsrInfo.retInfo.instr, jsrInfo.retInfo.usedBySub, false);
                        promoteReads(info, prevInstr, jsrInfo.retInfo.usedBySub, true);
                    }
                }
            }

            if (instr.getPreds() != null) {
                for (int i = 0; i < instr.getPreds().length; i++) {
                    Instruction predInstr = instr.getPreds()[i];
                    if (instr.getPreds()[i].getOpcode() == opc_jsr) {
                        /* This is the target of a jsr instr.
                   */
                        if (info.instr.getOpcode() != opc_astore) {
                            /* XXX Grrr, the bytecode verifier doesn't
                        * test if a jsr starts with astore.  So
                        * it is possible to do something else
                        * before putting the ret address into a
                        * local.  */
                            throw new AssertError("Non standard jsr");
                        }
                        InstrInfo retInfo = info.nextInfo.nextReads[info.instr.getLocalSlot()];

                        if (retInfo != null) {
                            if (retInfo.instr.getOpcode() != opc_ret)
                                throw new AssertError("reading return address");

                            info.retInfo = retInfo;
                            retInfo.jsrTargetInfo = info;

                            /* Now promote reads from the instruction
                        * after the jsr to the ret instruction if
                        * they are modified by the subroutine,
                        * and to the jsr instruction otherwise.
                        */
                            Instruction nextInstr = predInstr.getNextByAddr();
                            InstrInfo nextInfo = (InstrInfo) instrInfos.get(nextInstr);

                            promoteReads(nextInfo, retInfo.instr, retInfo.usedBySub, false);

                            promoteReads(nextInfo, predInstr, retInfo.usedBySub, true);
                        }
                    }
                    promoteReads(info, instr.getPreds()[i]);
                }
            }

            for (int i = 0; i < handlers.length; i++) {
                if (handlers[i].catcher == instr) {
                    for (Instruction preInstr = handlers[i].start; preInstr != handlers[i].end.getNextByAddr(); preInstr = preInstr.getNextByAddr()) {
                        promoteReads(info, preInstr);
                    }
                }
            }
        }
        changedInfos = null;

        /* Now merge with the parameters
       * The params should be the locals in firstInfo.nextReads
       */
        for (int i = 0; i < paramLocals.length; i++) {
            if (firstInfo.nextReads[i] != null) {
                firstInfo.nextReads[i].local.combineInto(paramLocals[i]);
                paramLocals[i] = paramLocals[i].getReal();
            }
        }
    }

    public void stripLocals() {
        ListIterator iter = bc.getInstructions().listIterator();
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            Instruction instr = (Instruction) iter.next();
            if (info.local != null && info.local.usingInstrs.size() == 1) {
                /* If this is a store, whose value is never read; it can
        * be removed, i.e replaced by a pop. */
                switch (instr.getOpcode()) {
                    case opc_istore:
                    case opc_fstore:
                    case opc_astore:
                        iter.set(new Instruction(opc_pop));
                        break;
                    case opc_lstore:
                    case opc_dstore:
                        iter.set(new Instruction(opc_pop2));
                        break;
                    default:
                }
            }
        }
    }

    void distributeLocals(Vector locals) {
        if (locals.size() == 0)
            return;

        /* Find the local with the least conflicts. */
        int min = Integer.MAX_VALUE;
        LocalInfo bestLocal = null;
        Enumeration enum_ = locals.elements();
        while (enum_.hasMoreElements()) {
            LocalInfo li = (LocalInfo) enum_.nextElement();
            int conflicts = 0;
            Enumeration conflenum = li.conflictingLocals.elements();
            while (conflenum.hasMoreElements()) {
                if (((LocalInfo) conflenum.nextElement()).newSlot != -2)
                    conflicts++;
            }
            if (conflicts < min) {
                min = conflicts;
                bestLocal = li;
            }
        }
        /* Mark the local as taken */
        locals.removeElement(bestLocal);
        bestLocal.newSlot = -2;
        /* Now distribute the remaining locals recursively. */
        distributeLocals(locals);

        /* Finally find a new slot */
        next_slot:
        for (int slot = 0; ; slot++) {
            Enumeration conflenum = bestLocal.conflictingLocals.elements();
            while (conflenum.hasMoreElements()) {
                LocalInfo conflLocal = (LocalInfo) conflenum.nextElement();
                if (bestLocal.size == 2 && conflLocal.newSlot == slot + 1) {
                    slot++;
                    continue next_slot;
                }
                if (conflLocal.size == 2 && conflLocal.newSlot + 1 == slot)
                    continue next_slot;
                if (conflLocal.newSlot == slot) {
                    if (conflLocal.size == 2)
                        slot++;
                    continue next_slot;
                }
            }
            bestLocal.newSlot = slot;
            break;
        }
    }

    public void distributeLocals() {
        /* give locals new slots.  This is a graph coloring
       * algorithm (the optimal solution is NP complete, but this
       * should be a good approximation).
       */

        /* first give the params the same slot as they had before.
       */
        for (int i = 0; i < paramLocals.length; i++)
            if (paramLocals[i] != null)
                paramLocals[i].newSlot = i;

        /* Now calculate the conflict settings.
       */
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            if (info.instr.getOpcode() >= BytecodeInfo.opc_istore && info.instr.getOpcode() <= BytecodeInfo.opc_astore) {
                /* This is a store.  It conflicts with every local, whose
             * value will be read without write.
             *
             * If this is inside a ret, it also conflicts with
             * locals, that are not used inside, and where any jsr
             * would conflict with.
             */
                for (int i = 0; i < maxlocals; i++) {
                    if (i != info.instr.getLocalSlot() && info.nextReads[i] != null)
                        info.local.conflictsWith(info.nextReads[i].local);
                    if (info.nextInfo.nextReads[i] != null && info.nextInfo.nextReads[i].jsrTargetInfo != null) {
                        Instruction[] jsrs = info.nextInfo.nextReads[i].jsrTargetInfo.instr.getPreds();
                        for (int j = 0; j < jsrs.length; j++) {
                            InstrInfo jsrInfo = (InstrInfo) instrInfos.get(jsrs[j]);
                            for (int k = 0; k < maxlocals; k++) {
                                if (!info.nextInfo.nextReads[i].usedBySub.get(k) && jsrInfo.nextReads[k] != null)
                                    info.local.conflictsWith(jsrInfo.nextReads[k].local);
                            }
                        }
                    }
                }
            }
        }

        /* Now put the locals that need a color into a vector.
       */
        Vector locals = new Vector();
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            if (info.local != null && info.local.newSlot == -1 && !locals.contains(info.local))
                locals.addElement(info.local);
        }

        /* Now distribute slots recursive.
       */
        distributeLocals(locals);

        /* Update the instructions.
       */
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            if (info.local != null)
                info.instr.setLocalSlot(info.local.newSlot);
        }

        /* Update LocalVariableTable
       */
        if (produceLVT)
            buildNewLVT();
    }

    private InstrInfo CONFLICT = new InstrInfo();

    boolean promoteLifeLocals(LocalInfo[] newLife, InstrInfo nextInfo) {
        if (nextInfo.lifeLocals == null) {
            nextInfo.lifeLocals = (LocalInfo[]) newLife.clone();
            return true;
        }
        boolean changed = false;
        for (int i = 0; i < maxlocals; i++) {
            LocalInfo local = nextInfo.lifeLocals[i];
            if (local == null)
                /* A conflict has already happened, or this slot
             * may not have been initialized. */
                continue;

            local = local.getReal();
            LocalInfo newLocal = newLife[i];
            if (newLocal != null)
                newLocal = newLocal.getReal();
            if (local != newLocal) {
                nextInfo.lifeLocals[i] = null;
                changed = true;
            }
        }
        return changed;
    }

    public void buildNewLVT() {
        /* First we recalculate the usedBySub, to use the new local numbers.
       */
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo)
            if (info.usedBySub != null)
                info.usedBySub = new BitSet();
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            if (info.local != null) {
                for (int i = 0; i < info.nextReads.length; i++) {
                    if (info.nextReads[i] != null && info.nextReads[i].instr.getOpcode() == opc_ret)
                        info.nextReads[i].usedBySub.set(info.local.newSlot);
                }
            }
        }

        /* Now we begin with the first Instruction and follow program flow.
       * We remember which locals are life in lifeLocals.
       */

        firstInfo.lifeLocals = new LocalInfo[maxlocals];
        for (int i = 0; i < paramLocals.length; i++)
            firstInfo.lifeLocals[i] = paramLocals[i];

        Stack changedInfo = new Stack();
        changedInfo.push(firstInfo);
        Handler[] handlers = bc.getExceptionHandlers();
        while (!changedInfo.isEmpty()) {
            InstrInfo info = (InstrInfo) changedInfo.pop();
            Instruction instr = info.instr;
            LocalInfo[] newLife = info.lifeLocals;
            if (instr.hasLocalSlot()) {
                int slot = instr.getLocalSlot();
                LocalInfo instrLocal = info.local.getReal();
                newLife = (LocalInfo[]) newLife.clone();
                newLife[slot] = instrLocal;
                if (instrLocal.name != null) {
                    for (int j = 0; j < newLife.length; j++) {
                        if (j != slot && newLife[j] != null && instrLocal.name.equals(newLife[j].name)) {
                            /* This local changed the slot. */
                            newLife[j] = null;
                        }
                    }
                }
            }

            if (!instr.doesAlwaysJump()) {
                InstrInfo nextInfo = info.nextInfo;
                if (promoteLifeLocals(newLife, nextInfo))
                    changedInfo.push(nextInfo);
            }
            if (instr.hasSuccs()) {
                Instruction[] succs = instr.getSuccs();
                for (int i = 0; i < succs.length; i++) {
                    InstrInfo nextInfo = (InstrInfo) instrInfos.get(succs[i]);
                    if (promoteLifeLocals(newLife, nextInfo))
                        changedInfo.push(nextInfo);
                }
            }
            for (int i = 0; i < handlers.length; i++) {
                if (handlers[i].start.compareTo(instr) <= 0 && handlers[i].end.compareTo(instr) >= 0) {
                    InstrInfo nextInfo = (InstrInfo) instrInfos.get(handlers[i].catcher);
                    if (promoteLifeLocals(newLife, nextInfo))
                        changedInfo.push(nextInfo);
                }
            }

            if (info.instr.getOpcode() == opc_jsr) {
                /* On a jsr we do a special merge */

                Instruction jsrTargetInstr = info.instr.getSingleSucc();
                InstrInfo jsrTargetInfo = (InstrInfo) instrInfos.get(jsrTargetInstr);
                InstrInfo retInfo = jsrTargetInfo.retInfo;
                if (retInfo != null && retInfo.lifeLocals != null) {
                    LocalInfo[] retLife = (LocalInfo[]) newLife.clone();
                    for (int i = 0; i < maxlocals; i++) {
                        if (retInfo.usedBySub.get(i))
                            retLife[i] = retInfo.lifeLocals[i];
                    }
                    if (promoteLifeLocals(retLife, info.nextInfo))
                        changedInfo.push(info.nextInfo);
                }
            }

            if (info.jsrTargetInfo != null) {
                /* On a ret we do a special merge */

                Instruction jsrTargetInstr = info.jsrTargetInfo.instr;
                for (int j = 0; j < jsrTargetInstr.getPreds().length; j++) {
                    InstrInfo jsrInfo = (InstrInfo) instrInfos.get(jsrTargetInstr.getPreds()[j]);

                    if (jsrInfo.lifeLocals == null)
                        /* life locals are not calculated, yet */
                        continue;
                    LocalInfo[] retLife = (LocalInfo[]) newLife.clone();
                    for (int i = 0; i < maxlocals; i++) {
                        if (!info.usedBySub.get(i))
                            retLife[i] = jsrInfo.lifeLocals[i];
                    }
                    if (promoteLifeLocals(retLife, jsrInfo.nextInfo))
                        changedInfo.push(jsrInfo.nextInfo);
                }
            }
        }

        Vector lvtEntries = new Vector();
        LocalVariableInfo[] lvi = new LocalVariableInfo[maxlocals];
        LocalInfo[] currentLocal = new LocalInfo[maxlocals];
        for (int i = 0; i < paramLocals.length; i++) {
            if (paramLocals[i] != null) {
                currentLocal[i] = paramLocals[i];
                if (currentLocal[i].name != null) {
                    lvi[i] = new LocalVariableInfo();
                    lvtEntries.addElement(lvi[i]);
                    lvi[i].name = currentLocal[i].name; /* XXX obfuscation? */
                    lvi[i].type = Main.getClassBundle().getTypeAlias(currentLocal[i].type);
                    lvi[i].start = (Instruction) bc.getInstructions().get(0);
                    lvi[i].slot = i;
                }
            }
        }
        Instruction lastInstr = null;
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            for (int i = 0; i < maxlocals; i++) {
                LocalInfo lcl = info.lifeLocals != null ? info.lifeLocals[i] : null;
                if (lcl != currentLocal[i] && (lcl == null || currentLocal[i] == null || lcl.name == null || lcl.type == null || !lcl.name.equals(currentLocal[i].name) || !lcl.type.equals(currentLocal[i].type))) {
                    if (lvi[i] != null) {
                        lvi[i].end = info.instr.getPrevByAddr();
                    }
                    lvi[i] = null;
                    currentLocal[i] = lcl;
                    if (currentLocal[i] != null && currentLocal[i].name != null && currentLocal[i].type != null) {
                        lvi[i] = new LocalVariableInfo();
                        lvtEntries.addElement(lvi[i]);
                        lvi[i].name = currentLocal[i].name;
                        lvi[i].type = Main.getClassBundle().getTypeAlias(currentLocal[i].type);
                        lvi[i].start = info.instr;
                        lvi[i].slot = i;
                    }
                }
            }
            lastInstr = info.instr;
        }
        for (int i = 0; i < maxlocals; i++) {
            if (lvi[i] != null)
                lvi[i].end = lastInstr;
        }
        LocalVariableInfo[] lvt = new LocalVariableInfo[lvtEntries.size()];
        lvtEntries.copyInto(lvt);
        bc.setLocalVariableTable(lvt);
    }

    public void dumpLocals() {
        Vector locals = new Vector();
        for (InstrInfo info = firstInfo; info != null; info = info.nextInfo) {
            GlobalOptions.err.println(info.instr.getDescription());
            GlobalOptions.err.print("nextReads: ");
            for (int i = 0; i < maxlocals; i++)
                if (info.nextReads[i] == null)
                    GlobalOptions.err.print("-,");
                else
                    GlobalOptions.err.print(info.nextReads[i].instr.getAddr() + ",");
            if (info.usedBySub != null)
                GlobalOptions.err.print("  usedBySub: " + info.usedBySub);
            if (info.retInfo != null)
                GlobalOptions.err.print("  ret info: " + info.retInfo.instr.getAddr());
            if (info.jsrTargetInfo != null)
                GlobalOptions.err.print("  jsr info: " + info.jsrTargetInfo.instr.getAddr());

            GlobalOptions.err.println();
            if (info.local != null && !locals.contains(info.local))
                locals.addElement(info.local);
        }
        Enumeration enum_ = locals.elements();
        while (enum_.hasMoreElements()) {
            LocalInfo li = (LocalInfo) enum_.nextElement();
            int slot = ((InstrInfo) li.usingInstrs.elementAt(0)).instr.getLocalSlot();
            GlobalOptions.err.print("Slot: " + slot + " conflicts:");
            Enumeration enum1 = li.conflictingLocals.elements();
            while (enum1.hasMoreElements()) {
                LocalInfo cfl = (LocalInfo) enum1.nextElement();
                GlobalOptions.err.print(cfl.getFirstAddr() + ", ");
            }
            GlobalOptions.err.println();
            GlobalOptions.err.print(li.getFirstAddr());
            GlobalOptions.err.print("     instrs: ");
            Enumeration enum2 = li.usingInstrs.elements();
            while (enum2.hasMoreElements())
                GlobalOptions.err.print(((InstrInfo) enum2.nextElement()).instr.getAddr() + ", ");
            GlobalOptions.err.println();
        }
        GlobalOptions.err.println("-----------");
    }

    public void transformCode(BytecodeInfo bytecode) {
        this.bc = bytecode;
        calcLocalInfo();
        if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_LOCALS) != 0) {
            GlobalOptions.err.println("Before Local Optimization: ");
            dumpLocals();
        }
        stripLocals();
        distributeLocals();

        if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_LOCALS) != 0) {
            GlobalOptions.err.println("After Local Optimization: ");
            dumpLocals();
        }

        firstInfo = null;
        changedInfos = null;
        instrInfos = null;
        paramLocals = null;
    }
}
