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

import com.ziotic.asm.AnnotationVisitor;
import com.ziotic.asm.Type;

/**
 * An {@link AnnotationVisitor} that collects the {@link Constant}s of the
 * annotations it visits.
 *
 * @author Eric Bruneton
 */
public class AnnotationConstantsCollector implements AnnotationVisitor {

    private final AnnotationVisitor av;

    private final ConstantPool cp;

    public AnnotationConstantsCollector(final AnnotationVisitor av, final ConstantPool cp) {
        this.av = av;
        this.cp = cp;
    }

    public void visit(final String name, final Object value) {
        if (name != null) {
            cp.newUTF8(name);
        }
        if (value instanceof Byte) {
            cp.newInteger(((Byte) value).byteValue());
        } else if (value instanceof Boolean) {
            cp.newInteger(((Boolean) value).booleanValue() ? 1 : 0);
        } else if (value instanceof Character) {
            cp.newInteger(((Character) value).charValue());
        } else if (value instanceof Short) {
            cp.newInteger(((Short) value).shortValue());
        } else if (value instanceof Type) {
            cp.newUTF8(((Type) value).getDescriptor());
        } else if (value instanceof byte[]) {
            byte[] v = (byte[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newInteger(v[i]);
            }
        } else if (value instanceof boolean[]) {
            boolean[] v = (boolean[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newInteger(v[i] ? 1 : 0);
            }
        } else if (value instanceof short[]) {
            short[] v = (short[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newInteger(v[i]);
            }
        } else if (value instanceof char[]) {
            char[] v = (char[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newInteger(v[i]);
            }
        } else if (value instanceof int[]) {
            int[] v = (int[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newInteger(v[i]);
            }
        } else if (value instanceof long[]) {
            long[] v = (long[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newLong(v[i]);
            }
        } else if (value instanceof float[]) {
            float[] v = (float[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newFloat(v[i]);
            }
        } else if (value instanceof double[]) {
            double[] v = (double[]) value;
            for (int i = 0; i < v.length; i++) {
                cp.newDouble(v[i]);
            }
        } else {
            cp.newConst(value);
        }
        av.visit(name, value);
    }

    public void visitEnum(final String name, final String desc, final String value) {
        if (name != null) {
            cp.newUTF8(name);
        }
        cp.newUTF8(desc);
        cp.newUTF8(value);
        av.visitEnum(name, desc, value);
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        if (name != null) {
            cp.newUTF8(name);
        }
        cp.newUTF8(desc);
        return new AnnotationConstantsCollector(av.visitAnnotation(name, desc), cp);
    }

    public AnnotationVisitor visitArray(final String name) {
        if (name != null) {
            cp.newUTF8(name);
        }
        return new AnnotationConstantsCollector(av.visitArray(name), cp);
    }

    public void visitEnd() {
        av.visitEnd();
    }
}
