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

import com.ziotic.asm.AnnotationVisitor;
import com.ziotic.asm.Label;
import com.ziotic.asm.MethodVisitor;

/**
 * A <code>MethodAdapter</code> for type mapping.
 *
 * @author Eugene Kuleshov
 */
public class RemappingMethodAdapter extends LocalVariablesSorter {

    protected final Remapper remapper;

    public RemappingMethodAdapter(int access, String desc, MethodVisitor mv, Remapper renamer) {
        super(access, desc, mv);
        this.remapper = renamer;
    }

    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        super.visitFieldInsn(opcode, remapper.mapType(owner), remapper.mapFieldName(owner, name, desc), remapper.mapDesc(desc));
    }

    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        super.visitMethodInsn(opcode, remapper.mapType(owner), remapper.mapMethodName(owner, name, desc), remapper.mapMethodDesc(desc));
    }

    public void visitTypeInsn(int opcode, String type) {
        super.visitTypeInsn(opcode, remapper.mapType(type));
    }

    public void visitLdcInsn(Object cst) {
        super.visitLdcInsn(remapper.mapValue(cst));
    }

    public void visitMultiANewArrayInsn(String desc, int dims) {
        super.visitMultiANewArrayInsn(remapper.mapDesc(desc), dims);
    }

    public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {
        super.visitTryCatchBlock(start, end, handler, //
                type == null ? null : remapper.mapType(type));
    }

    public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
        super.visitLocalVariable(name, remapper.mapDesc(desc), remapper.mapSignature(signature, true), start, end, index);
    }

    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        AnnotationVisitor av = mv.visitAnnotation(remapper.mapDesc(desc), visible);
        return av == null ? av : new RemappingAnnotationAdapter(av, remapper);
    }

    public AnnotationVisitor visitAnnotationDefault() {
        AnnotationVisitor av = mv.visitAnnotationDefault();
        return av == null ? av : new RemappingAnnotationAdapter(av, remapper);
    }

    public AnnotationVisitor visitParameterAnnotation(int parameter, String desc, boolean visible) {
        AnnotationVisitor av = mv.visitParameterAnnotation(parameter, remapper.mapDesc(desc), visible);
        return av == null ? av : new RemappingAnnotationAdapter(av, remapper);
    }

    public void visitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {
        super.visitFrame(type, nLocal, remapEntries(nLocal, local), nStack, remapEntries(nStack, stack));
    }

    private Object[] remapEntries(int n, Object[] entries) {
        for (int i = 0; i < n; i++) {
            if (entries[i] instanceof String) {
                Object[] newEntries = new Object[n];
                if (i > 0) {
                    System.arraycopy(entries, 0, newEntries, 0, i);
                }
                do {
                    Object t = entries[i];
                    newEntries[i++] = t instanceof String ? remapper.mapType((String) t) : t;
                } while (i < n);
                return newEntries;
            }
        }
        return entries;
    }
}
