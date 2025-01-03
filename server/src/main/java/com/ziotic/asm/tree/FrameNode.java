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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.Opcodes;

/**
 * A node that represents a stack map frame. These nodes are pseudo instruction
 * nodes in order to be inserted in an instruction list. In fact these nodes
 * must(*) be inserted <i>just before</i> any instruction node <b>i</b> that
 * follows an unconditionnal branch instruction such as GOTO or THROW, that is
 * the target of a jump instruction, or that starts an exception handler block.
 * The stack map frame types must describe the values of the local variables and
 * of the operand stack elements <i>just before</i> <b>i</b> is executed. <br>
 * <br> (*) this is mandatory only for classes whose version is greater than or
 * equal to {@link com.ziotic.asm.Opcodes#V1_6 V1_6}.
 *
 * @author Eric Bruneton
 */
public class FrameNode extends AbstractInsnNode {

    /**
     * The type of this frame. Must be {@link com.ziotic.asm.Opcodes#F_NEW} for expanded
     * frames, or {@link com.ziotic.asm.Opcodes#F_FULL}, {@link com.ziotic.asm.Opcodes#F_APPEND},
     * {@link com.ziotic.asm.Opcodes#F_CHOP}, {@link com.ziotic.asm.Opcodes#F_SAME} or
     * {@link com.ziotic.asm.Opcodes#F_APPEND}, {@link com.ziotic.asm.Opcodes#F_SAME1} for compressed frames.
     */
    public int type;

    /**
     * The types of the local variables of this stack map frame. Elements of
     * this list can be Integer, String or LabelNode objects (for primitive,
     * reference and uninitialized types respectively - see
     * {@link com.ziotic.asm.MethodVisitor}).
     */
    public List local;

    /**
     * The types of the operand stack elements of this stack map frame. Elements
     * of this list can be Integer, String or LabelNode objects (for primitive,
     * reference and uninitialized types respectively - see
     * {@link com.ziotic.asm.MethodVisitor}).
     */
    public List stack;

    private FrameNode() {
        super(-1);
    }

    /**
     * Constructs a new {@link FrameNode}.
     *
     * @param type   the type of this frame. Must be {@link com.ziotic.asm.Opcodes#F_NEW} for
     *               expanded frames, or {@link com.ziotic.asm.Opcodes#F_FULL},
     *               {@link com.ziotic.asm.Opcodes#F_APPEND}, {@link com.ziotic.asm.Opcodes#F_CHOP},
     *               {@link com.ziotic.asm.Opcodes#F_SAME} or {@link com.ziotic.asm.Opcodes#F_APPEND},
     *               {@link com.ziotic.asm.Opcodes#F_SAME1} for compressed frames.
     * @param nLocal number of local variables of this stack map frame.
     * @param local  the types of the local variables of this stack map frame.
     *               Elements of this list can be Integer, String or LabelNode objects
     *               (for primitive, reference and uninitialized types respectively -
     *               see {@link com.ziotic.asm.MethodVisitor}).
     * @param nStack number of operand stack elements of this stack map frame.
     * @param stack  the types of the operand stack elements of this stack map
     *               frame. Elements of this list can be Integer, String or LabelNode
     *               objects (for primitive, reference and uninitialized types
     *               respectively - see {@link com.ziotic.asm.MethodVisitor}).
     */
    public FrameNode(final int type, final int nLocal, final Object[] local, final int nStack, final Object[] stack) {
        super(-1);
        this.type = type;
        switch (type) {
            case Opcodes.F_NEW:
            case Opcodes.F_FULL:
                this.local = asList(nLocal, local);
                this.stack = asList(nStack, stack);
                break;
            case Opcodes.F_APPEND:
                this.local = asList(nLocal, local);
                break;
            case Opcodes.F_CHOP:
                this.local = Arrays.asList(new Object[nLocal]);
                break;
            case Opcodes.F_SAME:
                break;
            case Opcodes.F_SAME1:
                this.stack = asList(1, stack);
                break;
        }
    }

    public int getType() {
        return FRAME;
    }

    /**
     * Makes the given visitor visit this stack map frame.
     *
     * @param mv a method visitor.
     */
    public void accept(final MethodVisitor mv) {
        switch (type) {
            case Opcodes.F_NEW:
            case Opcodes.F_FULL:
                mv.visitFrame(type, local.size(), asArray(local), stack.size(), asArray(stack));
                break;
            case Opcodes.F_APPEND:
                mv.visitFrame(type, local.size(), asArray(local), 0, null);
                break;
            case Opcodes.F_CHOP:
                mv.visitFrame(type, local.size(), null, 0, null);
                break;
            case Opcodes.F_SAME:
                mv.visitFrame(type, 0, null, 0, null);
                break;
            case Opcodes.F_SAME1:
                mv.visitFrame(type, 0, null, 1, asArray(stack));
                break;
        }
    }

    public AbstractInsnNode clone(final Map labels) {
        FrameNode clone = new FrameNode();
        clone.type = type;
        if (local != null) {
            clone.local = new ArrayList();
            for (int i = 0; i < local.size(); ++i) {
                Object l = local.get(i);
                if (l instanceof LabelNode) {
                    l = labels.get(l);
                }
                clone.local.add(l);
            }
        }
        if (stack != null) {
            clone.stack = new ArrayList();
            for (int i = 0; i < stack.size(); ++i) {
                Object s = stack.get(i);
                if (s instanceof LabelNode) {
                    s = labels.get(s);
                }
                clone.stack.add(s);
            }
        }
        return clone;
    }

    // ------------------------------------------------------------------------

    private static List asList(final int n, final Object[] o) {
        return Arrays.asList(o).subList(0, n);
    }

    private static Object[] asArray(final List l) {
        Object[] objs = new Object[l.size()];
        for (int i = 0; i < objs.length; ++i) {
            Object o = l.get(i);
            if (o instanceof LabelNode) {
                o = ((LabelNode) o).getLabel();
            }
            objs[i] = o;
        }
        return objs;
    }
}
