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

/**
 * An <code>AnnotationVisitor</code> adapter for type remapping.
 *
 * @author Eugene Kuleshov
 */
public class RemappingAnnotationAdapter implements AnnotationVisitor {

    private final AnnotationVisitor av;

    private final Remapper renamer;

    public RemappingAnnotationAdapter(AnnotationVisitor av, Remapper renamer) {
        this.av = av;
        this.renamer = renamer;
    }

    public void visit(String name, Object value) {
        av.visit(name, renamer.mapValue(value));
    }

    public void visitEnum(String name, String desc, String value) {
        av.visitEnum(name, renamer.mapDesc(desc), value);
    }

    public AnnotationVisitor visitAnnotation(String name, String desc) {
        AnnotationVisitor v = av.visitAnnotation(name, renamer.mapDesc(desc));
        return v == null ? null : (v == av ? this : new RemappingAnnotationAdapter(v, renamer));
    }

    public AnnotationVisitor visitArray(String name) {
        AnnotationVisitor v = av.visitArray(name);
        return v == null ? null : (v == av ? this : new RemappingAnnotationAdapter(v, renamer));
    }

    public void visitEnd() {
        av.visitEnd();
    }
}
