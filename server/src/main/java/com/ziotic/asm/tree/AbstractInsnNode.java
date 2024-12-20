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

import java.util.List;
import java.util.Map;

import com.ziotic.asm.MethodVisitor;

/**
 * A node that represents a bytecode instruction. <i>An instruction can appear
 * at most once in at most one {@link InsnList} at a time</i>.
 *
 * @author Eric Bruneton
 */
public abstract class AbstractInsnNode {

    /**
     * The type of {@link InsnNode} instructions.
     */
    public static final int INSN = 0;

    /**
     * The type of {@link IntInsnNode} instructions.
     */
    public static final int INT_INSN = 1;

    /**
     * The type of {@link VarInsnNode} instructions.
     */
    public static final int VAR_INSN = 2;

    /**
     * The type of {@link TypeInsnNode} instructions.
     */
    public static final int TYPE_INSN = 3;

    /**
     * The type of {@link FieldInsnNode} instructions.
     */
    public static final int FIELD_INSN = 4;

    /**
     * The type of {@link MethodInsnNode} instructions.
     */
    public static final int METHOD_INSN = 5;

    /**
     * The type of {@link JumpInsnNode} instructions.
     */
    public static final int JUMP_INSN = 6;

    /**
     * The type of {@link LabelNode} "instructions".
     */
    public static final int LABEL = 7;

    /**
     * The type of {@link LdcInsnNode} instructions.
     */
    public static final int LDC_INSN = 8;

    /**
     * The type of {@link IincInsnNode} instructions.
     */
    public static final int IINC_INSN = 9;

    /**
     * The type of {@link TableSwitchInsnNode} instructions.
     */
    public static final int TABLESWITCH_INSN = 10;

    /**
     * The type of {@link LookupSwitchInsnNode} instructions.
     */
    public static final int LOOKUPSWITCH_INSN = 11;

    /**
     * The type of {@link MultiANewArrayInsnNode} instructions.
     */
    public static final int MULTIANEWARRAY_INSN = 12;

    /**
     * The type of {@link FrameNode} "instructions".
     */
    public static final int FRAME = 13;

    /**
     * The type of {@link LineNumberNode} "instructions".
     */
    public static final int LINE = 14;

    /**
     * The opcode of this instruction.
     */
    protected int opcode;

    /**
     * Previous instruction in the list to which this instruction belongs.
     */
    AbstractInsnNode prev;

    /**
     * Next instruction in the list to which this instruction belongs.
     */
    AbstractInsnNode next;

    /**
     * Index of this instruction in the list to which it belongs. The value of
     * this field is correct only when {@link InsnList#cache} is not null. A
     * value of -1 indicates that this instruction does not belong to any
     * {@link InsnList}.
     */
    int index;

    /**
     * Constructs a new {@link AbstractInsnNode}.
     *
     * @param opcode the opcode of the instruction to be constructed.
     */
    protected AbstractInsnNode(final int opcode) {
        this.opcode = opcode;
        this.index = -1;
    }

    /**
     * Returns the opcode of this instruction.
     *
     * @return the opcode of this instruction.
     */
    public int getOpcode() {
        return opcode;
    }

    /**
     * Returns the type of this instruction.
     *
     * @return the type of this instruction, i.e. one the constants defined in
     *         this class.
     */
    public abstract int getType();

    /**
     * Returns the previous instruction in the list to which this instruction
     * belongs, if any.
     *
     * @return the previous instruction in the list to which this instruction
     *         belongs, if any. May be <tt>null</tt>.
     */
    public AbstractInsnNode getPrevious() {
        return prev;
    }

    /**
     * Returns the next instruction in the list to which this instruction
     * belongs, if any.
     *
     * @return the next instruction in the list to which this instruction
     *         belongs, if any. May be <tt>null</tt>.
     */
    public AbstractInsnNode getNext() {
        return next;
    }

    /**
     * Makes the given code visitor visit this instruction.
     *
     * @param cv a code visitor.
     */
    public abstract void accept(final MethodVisitor cv);

    /**
     * Returns a copy of this instruction.
     *
     * @param labels a map from LabelNodes to cloned LabelNodes.
     * @return a copy of this instruction. The returned instruction does not
     *         belong to any {@link InsnList}.
     */
    public abstract AbstractInsnNode clone(final Map labels);

    /**
     * Returns the clone of the given label.
     *
     * @param label a label.
     * @param map   a map from LabelNodes to cloned LabelNodes.
     * @return the clone of the given label.
     */
    static LabelNode clone(final LabelNode label, final Map map) {
        return (LabelNode) map.get(label);
    }

    /**
     * Returns the clones of the given labels.
     *
     * @param labels a list of labels.
     * @param map    a map from LabelNodes to cloned LabelNodes.
     * @return the clones of the given labels.
     */
    static LabelNode[] clone(final List labels, final Map map) {
        LabelNode[] clones = new LabelNode[labels.size()];
        for (int i = 0; i < clones.length; ++i) {
            clones[i] = (LabelNode) map.get(labels.get(i));
        }
        return clones;
    }
}
