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
package com.ziotic.updater.util;

import com.ziotic.asm.tree.AbstractInsnNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodNode;

/**
 * @author Lazaro
 */
public class InsnFinder {
    public static interface Constraint<T extends AbstractInsnNode> {
        public boolean accept(T n);
    }

    private AbstractInsnNode[] instructions;
    private int index;

    public InsnFinder(MethodNode m) {
        instructions = m.instructions.toArray();
        index = -1;
    }

    public void index(int index) {
        this.index = index;
    }

    public AbstractInsnNode current() {
        return (index < 0 || index >= instructions.length) ? null : instructions[index];
    }

    public AbstractInsnNode next() {
        ++index;
        return current();
    }

    public AbstractInsnNode previous() {
        --index;
        return current();
    }

    public <T extends AbstractInsnNode> T next(Class<T> type) {
        while (++index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            if (type.isAssignableFrom(instr.getClass())) {
                return (T) instr;
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T previous(Class<T> type) {
        while (--index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            if (type.isAssignableFrom(instr.getClass())) {
                return (T) instr;
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T next(int... opcodes) {
        while (++index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            for (int opcode : opcodes) {
                if (instr.getOpcode() == opcode) {
                    return (T) instr;
                }
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T previous(int... opcodes) {
        while (--index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            for (int opcode : opcodes) {
                if (instr.getOpcode() == opcode) {
                    return (T) instr;
                }
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T next(Class<T> type, Constraint<T> constr) {
        while (++index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            if (type.isAssignableFrom(instr.getClass()) && (constr == null || constr.accept((T) instr))) {
                return type.cast(instr);
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T previous(Class<T> type, Constraint<T> constr) {
        while (--index >= 0) {
            AbstractInsnNode instr = instructions[index];
            if (type.isAssignableFrom(instr.getClass()) && (constr == null || constr.accept((T) instr))) {
                return type.cast(instr);
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T next(Constraint<T> constr, int... opcodes) {
        while (++index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            for (int opcode : opcodes) {
                if (instr.getOpcode() == opcode && (constr == null || constr.accept((T) instr))) {
                    return (T) instr;
                }
            }
        }
        return null;
    }

    public <T extends AbstractInsnNode> T previous(Constraint<T> constr, int... opcodes) {
        while (--index < instructions.length) {
            AbstractInsnNode instr = instructions[index];
            for (int opcode : opcodes) {
                if (instr.getOpcode() == opcode && (constr == null || constr.accept((T) instr))) {
                    return (T) instr;
                }
            }
        }
        return null;
    }

    public LdcInsnNode nextLDC(final Object val) {
        Constraint constraint = new Constraint() {
            public boolean accept(AbstractInsnNode n) {
                LdcInsnNode ldc = (LdcInsnNode) n;
                return ldc.cst.equals(val);
            }
        };
        return next(LdcInsnNode.class, constraint);
    }

    public LdcInsnNode previousLDC(final Object val) {
        Constraint constraint = new Constraint() {
            public boolean accept(AbstractInsnNode n) {
                LdcInsnNode ldc = (LdcInsnNode) n;
                return ldc.cst.equals(val);
            }
        };
        return next(LdcInsnNode.class, constraint);
    }
}
