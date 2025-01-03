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
package com.ziotic.asm;

/**
 * An {@link AnnotationVisitor} that generates annotations in bytecode form.
 *
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
final class AnnotationWriter implements AnnotationVisitor {

    /**
     * The class writer to which this annotation must be added.
     */
    private final ClassWriter cw;

    /**
     * The number of values in this annotation.
     */
    private int size;

    /**
     * <tt>true<tt> if values are named, <tt>false</tt> otherwise. Annotation
     * writers used for annotation default and annotation arrays use unnamed
     * values.
     */
    private final boolean named;

    /**
     * The annotation values in bytecode form. This byte vector only contains
     * the values themselves, i.e. the number of values must be stored as a
     * unsigned short just before these bytes.
     */
    private final ByteVector bv;

    /**
     * The byte vector to be used to store the number of values of this
     * annotation. See {@link #bv}.
     */
    private final ByteVector parent;

    /**
     * Where the number of values of this annotation must be stored in
     * {@link #parent}.
     */
    private final int offset;

    /**
     * Next annotation writer. This field is used to store annotation lists.
     */
    AnnotationWriter next;

    /**
     * Previous annotation writer. This field is used to store annotation lists.
     */
    AnnotationWriter prev;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    /**
     * Constructs a new {@link AnnotationWriter}.
     *
     * @param cw     the class writer to which this annotation must be added.
     * @param named  <tt>true<tt> if values are named, <tt>false</tt> otherwise.
     * @param bv     where the annotation values must be stored.
     * @param parent where the number of annotation values must be stored.
     * @param offset where in <tt>parent</tt> the number of annotation values must
     *               be stored.
     */
    AnnotationWriter(final ClassWriter cw, final boolean named, final ByteVector bv, final ByteVector parent, final int offset) {
        this.cw = cw;
        this.named = named;
        this.bv = bv;
        this.parent = parent;
        this.offset = offset;
    }

    // ------------------------------------------------------------------------
    // Implementation of the AnnotationVisitor interface
    // ------------------------------------------------------------------------

    public void visit(final String name, final Object value) {
        ++size;
        if (named) {
            bv.putShort(cw.newUTF8(name));
        }
        if (value instanceof String) {
            bv.put12('s', cw.newUTF8((String) value));
        } else if (value instanceof Byte) {
            bv.put12('B', cw.newInteger(((Byte) value).byteValue()).index);
        } else if (value instanceof Boolean) {
            int v = ((Boolean) value).booleanValue() ? 1 : 0;
            bv.put12('Z', cw.newInteger(v).index);
        } else if (value instanceof Character) {
            bv.put12('C', cw.newInteger(((Character) value).charValue()).index);
        } else if (value instanceof Short) {
            bv.put12('S', cw.newInteger(((Short) value).shortValue()).index);
        } else if (value instanceof Type) {
            bv.put12('c', cw.newUTF8(((Type) value).getDescriptor()));
        } else if (value instanceof byte[]) {
            byte[] v = (byte[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('B', cw.newInteger(v[i]).index);
            }
        } else if (value instanceof boolean[]) {
            boolean[] v = (boolean[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('Z', cw.newInteger(v[i] ? 1 : 0).index);
            }
        } else if (value instanceof short[]) {
            short[] v = (short[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('S', cw.newInteger(v[i]).index);
            }
        } else if (value instanceof char[]) {
            char[] v = (char[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('C', cw.newInteger(v[i]).index);
            }
        } else if (value instanceof int[]) {
            int[] v = (int[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('I', cw.newInteger(v[i]).index);
            }
        } else if (value instanceof long[]) {
            long[] v = (long[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('J', cw.newLong(v[i]).index);
            }
        } else if (value instanceof float[]) {
            float[] v = (float[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('F', cw.newFloat(v[i]).index);
            }
        } else if (value instanceof double[]) {
            double[] v = (double[]) value;
            bv.put12('[', v.length);
            for (int i = 0; i < v.length; i++) {
                bv.put12('D', cw.newDouble(v[i]).index);
            }
        } else {
            Item i = cw.newConstItem(value);
            bv.put12(".s.IFJDCS".charAt(i.type), i.index);
        }
    }

    public void visitEnum(final String name, final String desc, final String value) {
        ++size;
        if (named) {
            bv.putShort(cw.newUTF8(name));
        }
        bv.put12('e', cw.newUTF8(desc)).putShort(cw.newUTF8(value));
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        ++size;
        if (named) {
            bv.putShort(cw.newUTF8(name));
        }
        // write tag and type, and reserve space for values count
        bv.put12('@', cw.newUTF8(desc)).putShort(0);
        return new AnnotationWriter(cw, true, bv, bv, bv.length - 2);
    }

    public AnnotationVisitor visitArray(final String name) {
        ++size;
        if (named) {
            bv.putShort(cw.newUTF8(name));
        }
        // write tag, and reserve space for array size
        bv.put12('[', 0);
        return new AnnotationWriter(cw, false, bv, bv, bv.length - 2);
    }

    public void visitEnd() {
        if (parent != null) {
            byte[] data = parent.data;
            data[offset] = (byte) (size >>> 8);
            data[offset + 1] = (byte) size;
        }
    }

    // ------------------------------------------------------------------------
    // Utility methods
    // ------------------------------------------------------------------------

    /**
     * Returns the size of this annotation writer list.
     *
     * @return the size of this annotation writer list.
     */
    int getSize() {
        int size = 0;
        AnnotationWriter aw = this;
        while (aw != null) {
            size += aw.bv.length;
            aw = aw.next;
        }
        return size;
    }

    /**
     * Puts the annotations of this annotation writer list into the given byte
     * vector.
     *
     * @param out where the annotations must be put.
     */
    void put(final ByteVector out) {
        int n = 0;
        int size = 2;
        AnnotationWriter aw = this;
        AnnotationWriter last = null;
        while (aw != null) {
            ++n;
            size += aw.bv.length;
            aw.visitEnd(); // in case user forgot to call visitEnd
            aw.prev = last;
            last = aw;
            aw = aw.next;
        }
        out.putInt(size);
        out.putShort(n);
        aw = last;
        while (aw != null) {
            out.putByteArray(aw.bv.data, 0, aw.bv.length);
            aw = aw.prev;
        }
    }

    /**
     * Puts the given annotation lists into the given byte vector.
     *
     * @param panns an array of annotation writer lists.
     * @param off   index of the first annotation to be written.
     * @param out   where the annotations must be put.
     */
    static void put(final AnnotationWriter[] panns, final int off, final ByteVector out) {
        int size = 1 + 2 * (panns.length - off);
        for (int i = off; i < panns.length; ++i) {
            size += panns[i] == null ? 0 : panns[i].getSize();
        }
        out.putInt(size).putByte(panns.length - off);
        for (int i = off; i < panns.length; ++i) {
            AnnotationWriter aw = panns[i];
            AnnotationWriter last = null;
            int n = 0;
            while (aw != null) {
                ++n;
                aw.visitEnd(); // in case user forgot to call visitEnd
                aw.prev = last;
                last = aw;
                aw = aw.next;
            }
            out.putShort(n);
            aw = last;
            while (aw != null) {
                out.putByteArray(aw.bv.data, 0, aw.bv.length);
                aw = aw.prev;
            }
        }
    }
}
