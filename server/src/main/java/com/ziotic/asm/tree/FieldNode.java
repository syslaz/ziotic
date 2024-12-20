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

import com.ziotic.asm.Attribute;
import com.ziotic.asm.ClassVisitor;
import com.ziotic.asm.FieldVisitor;

/**
 * A node that represents a field.
 *
 * @author Eric Bruneton
 */
public class FieldNode extends MemberNode implements FieldVisitor {

    /**
     * The field's access flags (see {@link com.ziotic.asm.Opcodes}). This
     * field also indicates if the field is synthetic and/or deprecated.
     */
    public int access;

    /**
     * The field's name.
     */
    public String name;

    /**
     * The field's descriptor (see {@link com.ziotic.asm.Type}).
     */
    public String desc;

    /**
     * The field's signature. May be <tt>null</tt>.
     */
    public String signature;

    /**
     * The field's initial value. This field, which may be <tt>null</tt> if
     * the field does not have an initial value, must be an {@link Integer}, a
     * {@link Float}, a {@link Long}, a {@link Double} or a {@link String}.
     */
    public Object value;

    /**
     * Constructs a new {@link FieldNode}.
     *
     * @param access    the field's access flags (see
     *                  {@link com.ziotic.asm.Opcodes}). This parameter also indicates
     *                  if the field is synthetic and/or deprecated.
     * @param name      the field's name.
     * @param desc      the field's descriptor (see
     *                  {@link com.ziotic.asm.Type Type}).
     * @param signature the field's signature.
     * @param value     the field's initial value. This parameter, which may be
     *                  <tt>null</tt> if the field does not have an initial value, must
     *                  be an {@link Integer}, a {@link Float}, a {@link Long}, a
     *                  {@link Double} or a {@link String}.
     */
    public FieldNode(final int access, final String name, final String desc, final String signature, final Object value) {
        this.access = access;
        this.name = name;
        this.desc = desc;
        this.signature = signature;
        this.value = value;
    }

    /**
     * Makes the given class visitor visit this field.
     *
     * @param cv a class visitor.
     */
    public void accept(final ClassVisitor cv) {
        FieldVisitor fv = cv.visitField(access, name, desc, signature, value);
        if (fv == null) {
            return;
        }
        int i, n;
        n = visibleAnnotations == null ? 0 : visibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = (AnnotationNode) visibleAnnotations.get(i);
            an.accept(fv.visitAnnotation(an.desc, true));
        }
        n = invisibleAnnotations == null ? 0 : invisibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = (AnnotationNode) invisibleAnnotations.get(i);
            an.accept(fv.visitAnnotation(an.desc, false));
        }
        n = attrs == null ? 0 : attrs.size();
        for (i = 0; i < n; ++i) {
            fv.visitAttribute((Attribute) attrs.get(i));
        }
        fv.visitEnd();
    }
}
