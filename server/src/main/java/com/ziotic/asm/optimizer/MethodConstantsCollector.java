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
package com.ziotic.asm.optimizer;

import com.ziotic.asm.*;

/**
 * An {@link com.ziotic.asm.MethodVisitor} that collects the {@link Constant}s of the methods
 * it visits.
 *
 * @author Eric Bruneton
 */
public class MethodConstantsCollector extends MethodAdapter {

    private final ConstantPool cp;

    public MethodConstantsCollector(final MethodVisitor mv, final ConstantPool cp) {
        super(mv);
        this.cp = cp;
    }

    public AnnotationVisitor visitAnnotationDefault() {
        cp.newUTF8("AnnotationDefault");
        return new AnnotationConstantsCollector(mv.visitAnnotationDefault(), cp);
    }

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        cp.newUTF8(desc);
        if (visible) {
            cp.newUTF8("RuntimeVisibleAnnotations");
        } else {
            cp.newUTF8("RuntimeInvisibleAnnotations");
        }
        return new AnnotationConstantsCollector(mv.visitAnnotation(desc, visible), cp);
    }

    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
        cp.newUTF8(desc);
        if (visible) {
            cp.newUTF8("RuntimeVisibleParameterAnnotations");
        } else {
            cp.newUTF8("RuntimeInvisibleParameterAnnotations");
        }
        return new AnnotationConstantsCollector(mv.visitParameterAnnotation(parameter, desc, visible), cp);
    }

    public void visitTypeInsn(final int opcode, final String type) {
        cp.newClass(type);
        mv.visitTypeInsn(opcode, type);
    }

    public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
        cp.newField(owner, name, desc);
        mv.visitFieldInsn(opcode, owner, name, desc);
    }

    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
        boolean itf = opcode == Opcodes.INVOKEINTERFACE;
        cp.newMethod(owner, name, desc, itf);
        mv.visitMethodInsn(opcode, owner, name, desc);
    }

    public void visitLdcInsn(final Object cst) {
        cp.newConst(cst);
        mv.visitLdcInsn(cst);
    }

    public void visitMultiANewArrayInsn(final String desc, final int dims) {
        cp.newClass(desc);
        mv.visitMultiANewArrayInsn(desc, dims);
    }

    public void visitTryCatchBlock(final Label start, final Label end, final Label handler, final String type) {
        if (type != null) {
            cp.newClass(type);
        }
        mv.visitTryCatchBlock(start, end, handler, type);
    }

    public void visitLocalVariable(final String name, final String desc, final String signature, final Label start, final Label end, final int index) {
        if (signature != null) {
            cp.newUTF8("LocalVariableTypeTable");
            cp.newUTF8(name);
            cp.newUTF8(signature);
        }
        cp.newUTF8("LocalVariableTable");
        cp.newUTF8(name);
        cp.newUTF8(desc);
        mv.visitLocalVariable(name, desc, signature, start, end, index);
    }

    public void visitLineNumber(final int line, final Label start) {
        cp.newUTF8("LineNumberTable");
        mv.visitLineNumber(line, start);
    }

    public void visitMaxs(final int maxStack, final int maxLocals) {
        cp.newUTF8("Code");
        mv.visitMaxs(maxStack, maxLocals);
    }
}
