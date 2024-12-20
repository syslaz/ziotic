package com.ziotic.updater.util;

import com.ziotic.asm.tree.*;

/**
 * @author Lazaro
 */
public interface NodeVisitor {
    public void visitClass(ClassNode c);

    public void visitMethod(ClassNode c, MethodNode m);

    public void visitField(ClassNode c, FieldNode f);

    public void visitInsn(ClassNode c, MethodNode m, AbstractInsnNode n);

    public void visitIntInsn(ClassNode c, MethodNode m, IntInsnNode n);

    public void visitVarInsn(ClassNode c, MethodNode m, VarInsnNode n);

    public void visitTypeInsn(ClassNode c, MethodNode m, TypeInsnNode n);

    public void visitFieldInsn(ClassNode c, MethodNode m, FieldInsnNode n);

    public void visitMethodInsn(ClassNode c, MethodNode m, MethodInsnNode n);

    public void visitJumpInsn(ClassNode c, MethodNode m, JumpInsnNode n);

    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n);

    public void visitIincInsn(ClassNode c, MethodNode m, IincInsnNode n);

    public void visitTableSwitchInsn(ClassNode c, MethodNode m, TableSwitchInsnNode n);

    public void visitLookupSwitchInsn(ClassNode c, MethodNode m, LookupSwitchInsnNode n);

    public void visitMultiANewArrayInsn(ClassNode c, MethodNode m, MultiANewArrayInsnNode n);

    public void visitTryCatchBlock(ClassNode c, MethodNode m, TryCatchBlockNode n);
}
