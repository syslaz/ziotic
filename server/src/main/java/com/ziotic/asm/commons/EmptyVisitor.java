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
package com.ziotic.asm.commons;

import com.ziotic.asm.*;

/**
 * An empty implementation of the ASM visitor interfaces.
 *
 * @author Eric Bruneton
 */
public class EmptyVisitor implements ClassVisitor, FieldVisitor, MethodVisitor, AnnotationVisitor {

    public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
    }

    public void visitSource(final String source, final String debug) {
    }

    public void visitOuterClass(final String owner, final String name, final String desc) {
    }

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        return this;
    }

    public void visitAttribute(final Attribute attr) {
    }

    public void visitInnerClass(final String name, final String outerName, final String innerName, final int access) {
    }

    public FieldVisitor visitField(final int access, final String name, final String desc, final String signature, final Object value) {
        return this;
    }

    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        return this;
    }

    public void visitEnd() {
    }

    public AnnotationVisitor visitAnnotationDefault() {
        return this;
    }

    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
        return this;
    }

    public void visitCode() {
    }

    public void visitFrame(final int type, final int nLocal, final Object[] local, final int nStack, final Object[] stack) {
    }

    public void visitInsn(final int opcode) {
    }

    public void visitIntInsn(final int opcode, final int operand) {
    }

    public void visitVarInsn(final int opcode, final int var) {
    }

    public void visitTypeInsn(final int opcode, final String type) {
    }

    public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
    }

    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
    }

    public void visitJumpInsn(final int opcode, final Label label) {
    }

    public void visitLabel(final Label label) {
    }

    public void visitLdcInsn(final Object cst) {
    }

    public void visitIincInsn(final int var, final int increment) {
    }

    public void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label[] labels) {
    }

    public void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
    }

    public void visitMultiANewArrayInsn(final String desc, final int dims) {
    }

    public void visitTryCatchBlock(final Label start, final Label end, final Label handler, final String type) {
    }

    public void visitLocalVariable(final String name, final String desc, final String signature, final Label start, final Label end, final int index) {
    }

    public void visitLineNumber(final int line, final Label start) {
    }

    public void visitMaxs(final int maxStack, final int maxLocals) {
    }

    public void visit(final String name, final Object value) {
    }

    public void visitEnum(final String name, final String desc, final String value) {
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        return this;
    }

    public AnnotationVisitor visitArray(final String name) {
        return this;
    }
}
