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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ziotic.asm.Opcodes;
import com.ziotic.asm.Type;
import com.ziotic.asm.tree.*;

/**
 * A semantic bytecode analyzer. <i>This class does not fully check that JSR and
 * RET instructions are valid.</i>
 *
 * @author Eric Bruneton
 */
public class Analyzer implements Opcodes {

    private final Interpreter interpreter;

    private int n;

    private InsnList insns;

    private List[] handlers;

    private Frame[] frames;

    private Subroutine[] subroutines;

    private boolean[] queued;

    private int[] queue;

    private int top;

    /**
     * Constructs a new {@link Analyzer}.
     *
     * @param interpreter the interpreter to be used to symbolically interpret
     *                    the bytecode instructions.
     */
    public Analyzer(final Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    /**
     * Analyzes the given method.
     *
     * @param owner the internal name of the class to which the method belongs.
     * @param m     the method to be analyzed.
     * @return the symbolic state of the execution stack frame at each bytecode
     *         instruction of the method. The size of the returned array is
     *         equal to the number of instructions (and labels) of the method. A
     *         given frame is <tt>null</tt> if and only if the corresponding
     *         instruction cannot be reached (dead code).
     * @throws AnalyzerException if a problem occurs during the analysis.
     */
    public Frame[] analyze(final String owner, final MethodNode m) throws AnalyzerException {
        if ((m.access & (ACC_ABSTRACT | ACC_NATIVE)) != 0) {
            frames = new Frame[0];
            return frames;
        }
        n = m.instructions.size();
        insns = m.instructions;
        handlers = new List[n];
        frames = new Frame[n];
        subroutines = new Subroutine[n];
        queued = new boolean[n];
        queue = new int[n];
        top = 0;

        // computes exception handlers for each instruction
        for (int i = 0; i < m.tryCatchBlocks.size(); ++i) {
            TryCatchBlockNode tcb = (TryCatchBlockNode) m.tryCatchBlocks.get(i);
            int begin = insns.indexOf(tcb.start);
            int end = insns.indexOf(tcb.end);
            for (int j = begin; j < end; ++j) {
                List insnHandlers = handlers[j];
                if (insnHandlers == null) {
                    insnHandlers = new ArrayList();
                    handlers[j] = insnHandlers;
                }
                insnHandlers.add(tcb);
            }
        }

        // computes the subroutine for each instruction:
        Subroutine main = new Subroutine(null, m.maxLocals, null);
        List subroutineCalls = new ArrayList();
        Map subroutineHeads = new HashMap();
        findSubroutine(0, main, subroutineCalls);
        while (!subroutineCalls.isEmpty()) {
            JumpInsnNode jsr = (JumpInsnNode) subroutineCalls.remove(0);
            Subroutine sub = (Subroutine) subroutineHeads.get(jsr.label);
            if (sub == null) {
                sub = new Subroutine(jsr.label, m.maxLocals, jsr);
                subroutineHeads.put(jsr.label, sub);
                findSubroutine(insns.indexOf(jsr.label), sub, subroutineCalls);
            } else {
                sub.callers.add(jsr);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (subroutines[i] != null && subroutines[i].start == null) {
                subroutines[i] = null;
            }
        }

        // initializes the data structures for the control flow analysis
        Frame current = newFrame(m.maxLocals, m.maxStack);
        Frame handler = newFrame(m.maxLocals, m.maxStack);
        current.setReturn(interpreter.newValue(Type.getReturnType(m.desc)));
        Type[] args = Type.getArgumentTypes(m.desc);
        int local = 0;
        if ((m.access & ACC_STATIC) == 0) {
            Type ctype = Type.getObjectType(owner);
            current.setLocal(local++, interpreter.newValue(ctype));
        }
        for (int i = 0; i < args.length; ++i) {
            current.setLocal(local++, interpreter.newValue(args[i]));
            if (args[i].getSize() == 2) {
                current.setLocal(local++, interpreter.newValue(null));
            }
        }
        while (local < m.maxLocals) {
            current.setLocal(local++, interpreter.newValue(null));
        }
        merge(0, current, null);

        init(owner, m);

        // control flow analysis
        while (top > 0) {
            int insn = queue[--top];
            Frame f = frames[insn];
            Subroutine subroutine = subroutines[insn];
            queued[insn] = false;

            AbstractInsnNode insnNode = null;
            try {
                insnNode = m.instructions.get(insn);
                int insnOpcode = insnNode.getOpcode();
                int insnType = insnNode.getType();

                if (insnType == AbstractInsnNode.LABEL || insnType == AbstractInsnNode.LINE || insnType == AbstractInsnNode.FRAME) {
                    merge(insn + 1, f, subroutine);
                    newControlFlowEdge(insn, insn + 1);
                } else {
                    current.init(f).execute(insnNode, interpreter);
                    subroutine = subroutine == null ? null : subroutine.copy();

                    if (insnNode instanceof JumpInsnNode) {
                        JumpInsnNode j = (JumpInsnNode) insnNode;
                        if (insnOpcode != GOTO && insnOpcode != JSR) {
                            merge(insn + 1, current, subroutine);
                            newControlFlowEdge(insn, insn + 1);
                        }
                        int jump = insns.indexOf(j.label);
                        if (insnOpcode == JSR) {
                            merge(jump, current, new Subroutine(j.label, m.maxLocals, j));
                        } else {
                            merge(jump, current, subroutine);
                        }
                        newControlFlowEdge(insn, jump);
                    } else if (insnNode instanceof LookupSwitchInsnNode) {
                        LookupSwitchInsnNode lsi = (LookupSwitchInsnNode) insnNode;
                        int jump = insns.indexOf(lsi.dflt);
                        merge(jump, current, subroutine);
                        newControlFlowEdge(insn, jump);
                        for (int j = 0; j < lsi.labels.size(); ++j) {
                            LabelNode label = (LabelNode) lsi.labels.get(j);
                            jump = insns.indexOf(label);
                            merge(jump, current, subroutine);
                            newControlFlowEdge(insn, jump);
                        }
                    } else if (insnNode instanceof TableSwitchInsnNode) {
                        TableSwitchInsnNode tsi = (TableSwitchInsnNode) insnNode;
                        int jump = insns.indexOf(tsi.dflt);
                        merge(jump, current, subroutine);
                        newControlFlowEdge(insn, jump);
                        for (int j = 0; j < tsi.labels.size(); ++j) {
                            LabelNode label = (LabelNode) tsi.labels.get(j);
                            jump = insns.indexOf(label);
                            merge(jump, current, subroutine);
                            newControlFlowEdge(insn, jump);
                        }
                    } else if (insnOpcode == RET) {
                        if (subroutine == null) {
                            throw new AnalyzerException(insnNode, "RET instruction outside of a sub routine");
                        }
                        for (int i = 0; i < subroutine.callers.size(); ++i) {
                            Object caller = subroutine.callers.get(i);
                            int call = insns.indexOf((AbstractInsnNode) caller);
                            if (frames[call] != null) {
                                merge(call + 1, frames[call], current, subroutines[call], subroutine.access);
                                newControlFlowEdge(insn, call + 1);
                            }
                        }
                    } else if (insnOpcode != ATHROW && (insnOpcode < IRETURN || insnOpcode > RETURN)) {
                        if (subroutine != null) {
                            if (insnNode instanceof VarInsnNode) {
                                int var = ((VarInsnNode) insnNode).var;
                                subroutine.access[var] = true;
                                if (insnOpcode == LLOAD || insnOpcode == DLOAD || insnOpcode == LSTORE || insnOpcode == DSTORE) {
                                    subroutine.access[var + 1] = true;
                                }
                            } else if (insnNode instanceof IincInsnNode) {
                                int var = ((IincInsnNode) insnNode).var;
                                subroutine.access[var] = true;
                            }
                        }
                        merge(insn + 1, current, subroutine);
                        newControlFlowEdge(insn, insn + 1);
                    }
                }

                List insnHandlers = handlers[insn];
                if (insnHandlers != null) {
                    for (int i = 0; i < insnHandlers.size(); ++i) {
                        TryCatchBlockNode tcb = (TryCatchBlockNode) insnHandlers.get(i);
                        Type type;
                        if (tcb.type == null) {
                            type = Type.getObjectType("java/lang/Throwable");
                        } else {
                            type = Type.getObjectType(tcb.type);
                        }
                        int jump = insns.indexOf(tcb.handler);
                        if (newControlFlowExceptionEdge(insn, jump)) {
                            handler.init(f);
                            handler.clearStack();
                            handler.push(interpreter.newValue(type));
                            merge(jump, handler, subroutine);
                        }
                    }
                }
            } catch (AnalyzerException e) {
                throw new AnalyzerException(e.node, "Error at instruction " + insn + ": " + e.getMessage(), e);
            } catch (Exception e) {
                throw new AnalyzerException(insnNode, "Error at instruction " + insn + ": " + e.getMessage(), e);
            }
        }

        return frames;
    }

    private void findSubroutine(int insn, final Subroutine sub, final List calls) throws AnalyzerException {
        while (true) {
            if (insn < 0 || insn >= n) {
                throw new AnalyzerException(null, "Execution can fall off end of the code");
            }
            if (subroutines[insn] != null) {
                return;
            }
            subroutines[insn] = sub.copy();
            AbstractInsnNode node = insns.get(insn);

            // calls findSubroutine recursively on normal successors
            if (node instanceof JumpInsnNode) {
                if (node.getOpcode() == JSR) {
                    // do not follow a JSR, it leads to another subroutine!
                    calls.add(node);
                } else {
                    JumpInsnNode jnode = (JumpInsnNode) node;
                    findSubroutine(insns.indexOf(jnode.label), sub, calls);
                }
            } else if (node instanceof TableSwitchInsnNode) {
                TableSwitchInsnNode tsnode = (TableSwitchInsnNode) node;
                findSubroutine(insns.indexOf(tsnode.dflt), sub, calls);
                for (int i = tsnode.labels.size() - 1; i >= 0; --i) {
                    LabelNode l = (LabelNode) tsnode.labels.get(i);
                    findSubroutine(insns.indexOf(l), sub, calls);
                }
            } else if (node instanceof LookupSwitchInsnNode) {
                LookupSwitchInsnNode lsnode = (LookupSwitchInsnNode) node;
                findSubroutine(insns.indexOf(lsnode.dflt), sub, calls);
                for (int i = lsnode.labels.size() - 1; i >= 0; --i) {
                    LabelNode l = (LabelNode) lsnode.labels.get(i);
                    findSubroutine(insns.indexOf(l), sub, calls);
                }
            }

            // calls findSubroutine recursively on exception handler successors
            List insnHandlers = handlers[insn];
            if (insnHandlers != null) {
                for (int i = 0; i < insnHandlers.size(); ++i) {
                    TryCatchBlockNode tcb = (TryCatchBlockNode) insnHandlers.get(i);
                    findSubroutine(insns.indexOf(tcb.handler), sub, calls);
                }
            }

            // if insn does not falls through to the next instruction, return.
            switch (node.getOpcode()) {
                case GOTO:
                case RET:
                case TABLESWITCH:
                case LOOKUPSWITCH:
                case IRETURN:
                case LRETURN:
                case FRETURN:
                case DRETURN:
                case ARETURN:
                case RETURN:
                case ATHROW:
                    return;
            }
            insn++;
        }
    }

    /**
     * Returns the symbolic stack frame for each instruction of the last
     * recently analyzed method.
     *
     * @return the symbolic state of the execution stack frame at each bytecode
     *         instruction of the method. The size of the returned array is
     *         equal to the number of instructions (and labels) of the method. A
     *         given frame is <tt>null</tt> if the corresponding instruction
     *         cannot be reached, or if an error occured during the analysis of
     *         the method.
     */
    public Frame[] getFrames() {
        return frames;
    }

    /**
     * Returns the exception handlers for the given instruction.
     *
     * @param insn the index of an instruction of the last recently analyzed
     *             method.
     * @return a list of {@link com.ziotic.asm.tree.TryCatchBlockNode} objects.
     */
    public List getHandlers(final int insn) {
        return handlers[insn];
    }

    /**
     * Initializes this analyzer. This method is called just before the
     * execution of control flow analysis loop in #analyze. The default
     * implementation of this method does nothing.
     *
     * @param owner the internal name of the class to which the method belongs.
     * @param m     the method to be analyzed.
     * @throws AnalyzerException if a problem occurs.
     */
    protected void init(String owner, MethodNode m) throws AnalyzerException {
    }

    /**
     * Constructs a new frame with the given size.
     *
     * @param nLocals the maximum number of local variables of the frame.
     * @param nStack  the maximum stack size of the frame.
     * @return the created frame.
     */
    protected Frame newFrame(final int nLocals, final int nStack) {
        return new Frame(nLocals, nStack);
    }

    /**
     * Constructs a new frame that is identical to the given frame.
     *
     * @param src a frame.
     * @return the created frame.
     */
    protected Frame newFrame(final Frame src) {
        return new Frame(src);
    }

    /**
     * Creates a control flow graph edge. The default implementation of this
     * method does nothing. It can be overriden in order to construct the
     * control flow graph of a method (this method is called by the
     * {@link #analyze analyze} method during its visit of the method's code).
     *
     * @param insn      an instruction index.
     * @param successor index of a successor instruction.
     */
    protected void newControlFlowEdge(final int insn, final int successor) {
    }

    /**
     * Creates a control flow graph edge corresponding to an exception handler.
     * The default implementation of this method does nothing. It can be
     * overriden in order to construct the control flow graph of a method (this
     * method is called by the {@link #analyze analyze} method during its visit
     * of the method's code).
     *
     * @param insn      an instruction index.
     * @param successor index of a successor instruction.
     * @return true if this edge must be considered in the data flow analysis
     *         performed by this analyzer, or false otherwise. The default
     *         implementation of this method always returns true.
     */
    protected boolean newControlFlowExceptionEdge(final int insn, final int successor) {
        return true;
    }

    // -------------------------------------------------------------------------

    private void merge(final int insn, final Frame frame, final Subroutine subroutine) throws AnalyzerException {
        Frame oldFrame = frames[insn];
        Subroutine oldSubroutine = subroutines[insn];
        boolean changes;

        if (oldFrame == null) {
            frames[insn] = newFrame(frame);
            changes = true;
        } else {
            changes = oldFrame.merge(frame, interpreter);
        }

        if (oldSubroutine == null) {
            if (subroutine != null) {
                subroutines[insn] = subroutine.copy();
                changes = true;
            }
        } else {
            if (subroutine != null) {
                changes |= oldSubroutine.merge(subroutine);
            }
        }
        if (changes && !queued[insn]) {
            queued[insn] = true;
            queue[top++] = insn;
        }
    }

    private void merge(final int insn, final Frame beforeJSR, final Frame afterRET, final Subroutine subroutineBeforeJSR, final boolean[] access) throws AnalyzerException {
        Frame oldFrame = frames[insn];
        Subroutine oldSubroutine = subroutines[insn];
        boolean changes;

        afterRET.merge(beforeJSR, access);

        if (oldFrame == null) {
            frames[insn] = newFrame(afterRET);
            changes = true;
        } else {
            changes = oldFrame.merge(afterRET, access);
        }

        if (oldSubroutine != null && subroutineBeforeJSR != null) {
            changes |= oldSubroutine.merge(subroutineBeforeJSR);
        }
        if (changes && !queued[insn]) {
            queued[insn] = true;
            queue[top++] = insn;
        }
    }
}
