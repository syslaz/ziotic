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
package com.ziotic.asm.util;

import com.ziotic.asm.AnnotationVisitor;
import com.ziotic.asm.Attribute;
import com.ziotic.asm.FieldVisitor;

/**
 * A {@link com.ziotic.asm.FieldVisitor} that prints a disassembled view of the fields it
 * visits.
 *
 * @author Eric Bruneton
 */
public class TraceFieldVisitor extends TraceAbstractVisitor implements FieldVisitor {

    /**
     * The {@link FieldVisitor} to which this visitor delegates calls. May be
     * <tt>null</tt>.
     */
    protected FieldVisitor fv;

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        AnnotationVisitor av = super.visitAnnotation(desc, visible);
        if (fv != null) {
            ((TraceAnnotationVisitor) av).av = fv.visitAnnotation(desc, visible);
        }
        return av;
    }

    public void visitAttribute(final Attribute attr) {
        super.visitAttribute(attr);

        if (fv != null) {
            fv.visitAttribute(attr);
        }
    }

    public void visitEnd() {
        super.visitEnd();

        if (fv != null) {
            fv.visitEnd();
        }
    }
}
