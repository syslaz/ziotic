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
