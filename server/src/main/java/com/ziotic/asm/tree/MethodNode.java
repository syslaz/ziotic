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

import com.ziotic.asm.*;

/**
 * A node that represents a method.
 *
 * @author Eric Bruneton
 */
public class MethodNode extends MemberNode implements MethodVisitor {

    /**
     * The method's access flags (see {@link com.ziotic.asm.Opcodes}). This field also
     * indicates if the method is synthetic and/or deprecated.
     */
    public int access;

    /**
     * The method's name.
     */
    public String name;

    /**
     * The method's descriptor (see {@link com.ziotic.asm.Type}).
     */
    public String desc;

    /**
     * The method's signature. May be <tt>null</tt>.
     */
    public String signature;

    /**
     * The internal names of the method's exception classes (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}). This list is a list of
     * {@link String} objects.
     */
    public List exceptions;

    /**
     * The default value of this annotation interface method. This field must be
     * a {@link Byte}, {@link Boolean}, {@link Character}, {@link Short},
     * {@link Integer}, {@link Long}, {@link Float}, {@link Double},
     * {@link String} or {@link com.ziotic.asm.Type}, or an two elements String array (for
     * enumeration values), a {@link AnnotationNode}, or a {@link List} of
     * values of one of the preceding types. May be <tt>null</tt>.
     */
    public Object annotationDefault;

    /**
     * The runtime visible parameter annotations of this method. These lists are
     * lists of {@link AnnotationNode} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.tree.AnnotationNode
     * @label invisible parameters
     */
    public List[] visibleParameterAnnotations;

    /**
     * The runtime invisible parameter annotations of this method. These lists
     * are lists of {@link AnnotationNode} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.tree.AnnotationNode
     * @label visible parameters
     */
    public List[] invisibleParameterAnnotations;

    /**
     * The instructions of this method. This list is a list of
     * {@link AbstractInsnNode} objects.
     *
     * @associates org.objectweb.asm.tree.AbstractInsnNode
     * @label instructions
     */
    public InsnList instructions;

    /**
     * The try catch blocks of this method. This list is a list of
     * {@link TryCatchBlockNode} objects.
     *
     * @associates org.objectweb.asm.tree.TryCatchBlockNode
     */
    public List tryCatchBlocks;

    /**
     * The maximum stack size of this method.
     */
    public int maxStack;

    /**
     * The maximum number of local variables of this method.
     */
    public int maxLocals;

    /**
     * The local variables of this method. This list is a list of
     * {@link LocalVariableNode} objects. May be <tt>null</tt>
     *
     * @associates org.objectweb.asm.tree.LocalVariableNode
     */
    public List localVariables;

    /**
     * Constructs an unitialized {@link MethodNode}.
     */
    public MethodNode() {
        this.instructions = new InsnList();
    }

    /**
     * Constructs a new {@link MethodNode}.
     *
     * @param access     the method's access flags (see {@link com.ziotic.asm.Opcodes}). This
     *                   parameter also indicates if the method is synthetic and/or
     *                   deprecated.
     * @param name       the method's name.
     * @param desc       the method's descriptor (see {@link com.ziotic.asm.Type}).
     * @param signature  the method's signature. May be <tt>null</tt>.
     * @param exceptions the internal names of the method's exception classes
     *                   (see {@link com.ziotic.asm.Type#getInternalName() getInternalName}). May be
     *                   <tt>null</tt>.
     */
    public MethodNode(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        this();
        this.access = access;
        this.name = name;
        this.desc = desc;
        this.signature = signature;
        this.exceptions = new ArrayList(exceptions == null ? 0 : exceptions.length);
        boolean isAbstract = (access & Opcodes.ACC_ABSTRACT) != 0;
        if (!isAbstract) {
            this.localVariables = new ArrayList(5);
        }
        this.tryCatchBlocks = new ArrayList();
        if (exceptions != null) {
            this.exceptions.addAll(Arrays.asList(exceptions));
        }
    }

    // ------------------------------------------------------------------------
    // Implementation of the MethodVisitor interface
    // ------------------------------------------------------------------------

    public AnnotationVisitor visitAnnotationDefault() {
        return new AnnotationNode(new ArrayList(0) {
            public boolean add(final Object o) {
                annotationDefault = o;
                return super.add(o);
            }
        });
    }

    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
        AnnotationNode an = new AnnotationNode(desc);
        if (visible) {
            if (visibleParameterAnnotations == null) {
                int params = Type.getArgumentTypes(this.desc).length;
                visibleParameterAnnotations = new List[params];
            }
            if (visibleParameterAnnotations[parameter] == null) {
                visibleParameterAnnotations[parameter] = new ArrayList(1);
            }
            visibleParameterAnnotations[parameter].add(an);
        } else {
            if (invisibleParameterAnnotations == null) {
                int params = Type.getArgumentTypes(this.desc).length;
                invisibleParameterAnnotations = new List[params];
            }
            if (invisibleParameterAnnotations[parameter] == null) {
                invisibleParameterAnnotations[parameter] = new ArrayList(1);
            }
            invisibleParameterAnnotations[parameter].add(an);
        }
        return an;
    }

    public void visitCode() {
    }

    public void visitFrame(final int type, final int nLocal, final Object[] local, final int nStack, final Object[] stack) {
        instructions.add(new FrameNode(type, nLocal, local == null ? null : getLabelNodes(local), nStack, stack == null ? null : getLabelNodes(stack)));
    }

    public void visitInsn(final int opcode) {
        instructions.add(new InsnNode(opcode));
    }

    public void visitIntInsn(final int opcode, final int operand) {
        instructions.add(new IntInsnNode(opcode, operand));
    }

    public void visitVarInsn(final int opcode, final int var) {
        instructions.add(new VarInsnNode(opcode, var));
    }

    public void visitTypeInsn(final int opcode, final String type) {
        instructions.add(new TypeInsnNode(opcode, type));
    }

    public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
        instructions.add(new FieldInsnNode(opcode, owner, name, desc));
    }

    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
        instructions.add(new MethodInsnNode(opcode, owner, name, desc));
    }

    public void visitJumpInsn(final int opcode, final Label label) {
        instructions.add(new JumpInsnNode(opcode, getLabelNode(label)));
    }

    public void visitLabel(final Label label) {
        instructions.add(getLabelNode(label));
    }

    public void visitLdcInsn(final Object cst) {
        instructions.add(new LdcInsnNode(cst));
    }

    public void visitIincInsn(final int var, final int increment) {
        instructions.add(new IincInsnNode(var, increment));
    }

    public void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label[] labels) {
        instructions.add(new TableSwitchInsnNode(min, max, getLabelNode(dflt), getLabelNodes(labels)));
    }

    public void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
        instructions.add(new LookupSwitchInsnNode(getLabelNode(dflt), keys, getLabelNodes(labels)));
    }

    public void visitMultiANewArrayInsn(final String desc, final int dims) {
        instructions.add(new MultiANewArrayInsnNode(desc, dims));
    }

    public void visitTryCatchBlock(final Label start, final Label end, final Label handler, final String type) {
        tryCatchBlocks.add(new TryCatchBlockNode(getLabelNode(start), getLabelNode(end), getLabelNode(handler), type));
    }

    public void visitLocalVariable(final String name, final String desc, final String signature, final Label start, final Label end, final int index) {
        localVariables.add(new LocalVariableNode(name, desc, signature, getLabelNode(start), getLabelNode(end), index));
    }

    public void visitLineNumber(final int line, final Label start) {
        instructions.add(new LineNumberNode(line, getLabelNode(start)));
    }

    public void visitMaxs(final int maxStack, final int maxLocals) {
        this.maxStack = maxStack;
        this.maxLocals = maxLocals;
    }

    /**
     * Returns the LabelNode corresponding to the given Label. Creates a new
     * LabelNode if necessary. The default implementation of this method uses
     * the {@link Label#info} field to store associations between labels and
     * label nodes.
     *
     * @param l a Label.
     * @return the LabelNode corresponding to l.
     */
    protected LabelNode getLabelNode(final Label l) {
        if (!(l.info instanceof LabelNode)) {
            l.info = new LabelNode(l);
        }
        return (LabelNode) l.info;
    }

    private LabelNode[] getLabelNodes(final Label[] l) {
        LabelNode[] nodes = new LabelNode[l.length];
        for (int i = 0; i < l.length; ++i) {
            nodes[i] = getLabelNode(l[i]);
        }
        return nodes;
    }

    private Object[] getLabelNodes(final Object[] objs) {
        Object[] nodes = new Object[objs.length];
        for (int i = 0; i < objs.length; ++i) {
            Object o = objs[i];
            if (o instanceof Label) {
                o = getLabelNode((Label) o);
            }
            nodes[i] = o;
        }
        return nodes;
    }

    // ------------------------------------------------------------------------
    // Accept method
    // ------------------------------------------------------------------------

    /**
     * Makes the given class visitor visit this method.
     *
     * @param cv a class visitor.
     */
    public void accept(final ClassVisitor cv) {
        String[] exceptions = new String[this.exceptions.size()];
        this.exceptions.toArray(exceptions);
        MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if (mv != null) {
            accept(mv);
        }
    }

    /**
     * Makes the given method visitor visit this method.
     *
     * @param mv a method visitor.
     */
    public void accept(final MethodVisitor mv) {
        // visits the method attributes
        int i, j, n;
        if (annotationDefault != null) {
            AnnotationVisitor av = mv.visitAnnotationDefault();
            AnnotationNode.accept(av, null, annotationDefault);
            if (av != null) {
                av.visitEnd();
            }
        }
        n = visibleAnnotations == null ? 0 : visibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = (AnnotationNode) visibleAnnotations.get(i);
            an.accept(mv.visitAnnotation(an.desc, true));
        }
        n = invisibleAnnotations == null ? 0 : invisibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = (AnnotationNode) invisibleAnnotations.get(i);
            an.accept(mv.visitAnnotation(an.desc, false));
        }
        n = visibleParameterAnnotations == null ? 0 : visibleParameterAnnotations.length;
        for (i = 0; i < n; ++i) {
            List l = visibleParameterAnnotations[i];
            if (l == null) {
                continue;
            }
            for (j = 0; j < l.size(); ++j) {
                AnnotationNode an = (AnnotationNode) l.get(j);
                an.accept(mv.visitParameterAnnotation(i, an.desc, true));
            }
        }
        n = invisibleParameterAnnotations == null ? 0 : invisibleParameterAnnotations.length;
        for (i = 0; i < n; ++i) {
            List l = invisibleParameterAnnotations[i];
            if (l == null) {
                continue;
            }
            for (j = 0; j < l.size(); ++j) {
                AnnotationNode an = (AnnotationNode) l.get(j);
                an.accept(mv.visitParameterAnnotation(i, an.desc, false));
            }
        }
        n = attrs == null ? 0 : attrs.size();
        for (i = 0; i < n; ++i) {
            mv.visitAttribute((Attribute) attrs.get(i));
        }
        // visits the method's code
        if (instructions.size() > 0) {
            mv.visitCode();
            // visits try catch blocks
            n = tryCatchBlocks == null ? 0 : tryCatchBlocks.size();
            for (i = 0; i < n; ++i) {
                ((TryCatchBlockNode) tryCatchBlocks.get(i)).accept(mv);
            }
            // visits instructions
            instructions.accept(mv);
            // visits local variables
            n = localVariables == null ? 0 : localVariables.size();
            for (i = 0; i < n; ++i) {
                ((LocalVariableNode) localVariables.get(i)).accept(mv);
            }
            // visits maxs
            mv.visitMaxs(maxStack, maxLocals);
        }
        mv.visitEnd();
    }
}
