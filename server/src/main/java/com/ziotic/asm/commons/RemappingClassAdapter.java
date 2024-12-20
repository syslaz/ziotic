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
 * A <code>ClassAdapter</code> for type remapping.
 *
 * @author Eugene Kuleshov
 */
public class RemappingClassAdapter extends ClassAdapter {

    protected final Remapper remapper;

    protected String className;

    public RemappingClassAdapter(ClassVisitor cv, Remapper remapper) {
        super(cv);
        this.remapper = remapper;
    }

    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        this.className = name;
        super.visit(version, access, remapper.mapType(name), remapper.mapSignature(signature, false), remapper.mapType(superName), interfaces == null ? null : remapper.mapTypes(interfaces));
    }

    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        AnnotationVisitor av;
        av = super.visitAnnotation(remapper.mapDesc(desc), visible);
        return av == null ? null : createRemappingAnnotationAdapter(av);
    }

    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        FieldVisitor fv = super.visitField(access, remapper.mapFieldName(className, name, desc), remapper.mapDesc(desc), remapper.mapSignature(signature, true), remapper.mapValue(value));
        return fv == null ? null : createRemappingFieldAdapter(fv);
    }

    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        String newDesc = remapper.mapMethodDesc(desc);
        MethodVisitor mv = super.visitMethod(access, remapper.mapMethodName(className, name, desc), newDesc, remapper.mapSignature(signature, false), exceptions == null ? null : remapper.mapTypes(exceptions));
        return mv == null ? null : createRemappingMethodAdapter(access, newDesc, mv);
    }

    public void visitInnerClass(String name, String outerName, String innerName, int access) {
        super.visitInnerClass(remapper.mapType(name), outerName == null ? null : remapper.mapType(outerName), innerName, // TODO should it be changed?
                access);
    }

    public void visitOuterClass(String owner, String name, String desc) {
        super.visitOuterClass(remapper.mapType(owner), name == null ? null : remapper.mapMethodName(owner, name, desc), desc == null ? null : remapper.mapMethodDesc(desc));
    }

    protected FieldVisitor createRemappingFieldAdapter(FieldVisitor fv) {
        return new RemappingFieldAdapter(fv, remapper);
    }

    protected MethodVisitor createRemappingMethodAdapter(int access, String newDesc, MethodVisitor mv) {
        return new RemappingMethodAdapter(access, newDesc, mv, remapper);
    }

    protected AnnotationVisitor createRemappingAnnotationAdapter(AnnotationVisitor av) {
        return new RemappingAnnotationAdapter(av, remapper);
    }
}
