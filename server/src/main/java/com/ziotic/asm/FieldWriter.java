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
 * An {@link FieldVisitor} that generates Java fields in bytecode form.
 *
 * @author Eric Bruneton
 */
final class FieldWriter implements FieldVisitor {

    /**
     * Next field writer (see {@link ClassWriter#firstField firstField}).
     */
    FieldWriter next;

    /**
     * The class writer to which this field must be added.
     */
    private final ClassWriter cw;

    /**
     * Access flags of this field.
     */
    private final int access;

    /**
     * The index of the constant pool item that contains the name of this
     * method.
     */
    private final int name;

    /**
     * The index of the constant pool item that contains the descriptor of this
     * field.
     */
    private final int desc;

    /**
     * The index of the constant pool item that contains the signature of this
     * field.
     */
    private int signature;

    /**
     * The index of the constant pool item that contains the constant value of
     * this field.
     */
    private int value;

    /**
     * The runtime visible annotations of this field. May be <tt>null</tt>.
     */
    private AnnotationWriter anns;

    /**
     * The runtime invisible annotations of this field. May be <tt>null</tt>.
     */
    private AnnotationWriter ianns;

    /**
     * The non standard attributes of this field. May be <tt>null</tt>.
     */
    private Attribute attrs;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    /**
     * Constructs a new {@link FieldWriter}.
     *
     * @param cw        the class writer to which this field must be added.
     * @param access    the field's access flags (see {@link Opcodes}).
     * @param name      the field's name.
     * @param desc      the field's descriptor (see {@link Type}).
     * @param signature the field's signature. May be <tt>null</tt>.
     * @param value     the field's constant value. May be <tt>null</tt>.
     */
    FieldWriter(final ClassWriter cw, final int access, final String name, final String desc, final String signature, final Object value) {
        if (cw.firstField == null) {
            cw.firstField = this;
        } else {
            cw.lastField.next = this;
        }
        cw.lastField = this;
        this.cw = cw;
        this.access = access;
        this.name = cw.newUTF8(name);
        this.desc = cw.newUTF8(desc);
        if (ClassReader.SIGNATURES && signature != null) {
            this.signature = cw.newUTF8(signature);
        }
        if (value != null) {
            this.value = cw.newConstItem(value).index;
        }
    }

    // ------------------------------------------------------------------------
    // Implementation of the FieldVisitor interface
    // ------------------------------------------------------------------------

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        if (!ClassReader.ANNOTATIONS) {
            return null;
        }
        ByteVector bv = new ByteVector();
        // write type, and reserve space for values count
        bv.putShort(cw.newUTF8(desc)).putShort(0);
        AnnotationWriter aw = new AnnotationWriter(cw, true, bv, bv, 2);
        if (visible) {
            aw.next = anns;
            anns = aw;
        } else {
            aw.next = ianns;
            ianns = aw;
        }
        return aw;
    }

    public void visitAttribute(final Attribute attr) {
        attr.next = attrs;
        attrs = attr;
    }

    public void visitEnd() {
    }

    // ------------------------------------------------------------------------
    // Utility methods
    // ------------------------------------------------------------------------

    /**
     * Returns the size of this field.
     *
     * @return the size of this field.
     */
    int getSize() {
        int size = 8;
        if (value != 0) {
            cw.newUTF8("ConstantValue");
            size += 8;
        }
        if ((access & Opcodes.ACC_SYNTHETIC) != 0 && ((cw.version & 0xFFFF) < Opcodes.V1_5 || (access & ClassWriter.ACC_SYNTHETIC_ATTRIBUTE) != 0)) {
            cw.newUTF8("Synthetic");
            size += 6;
        }
        if ((access & Opcodes.ACC_DEPRECATED) != 0) {
            cw.newUTF8("Deprecated");
            size += 6;
        }
        if (ClassReader.SIGNATURES && signature != 0) {
            cw.newUTF8("Signature");
            size += 8;
        }
        if (ClassReader.ANNOTATIONS && anns != null) {
            cw.newUTF8("RuntimeVisibleAnnotations");
            size += 8 + anns.getSize();
        }
        if (ClassReader.ANNOTATIONS && ianns != null) {
            cw.newUTF8("RuntimeInvisibleAnnotations");
            size += 8 + ianns.getSize();
        }
        if (attrs != null) {
            size += attrs.getSize(cw, null, 0, -1, -1);
        }
        return size;
    }

    /**
     * Puts the content of this field into the given byte vector.
     *
     * @param out where the content of this field must be put.
     */
    void put(final ByteVector out) {
        int mask = Opcodes.ACC_DEPRECATED | ClassWriter.ACC_SYNTHETIC_ATTRIBUTE | ((access & ClassWriter.ACC_SYNTHETIC_ATTRIBUTE) / (ClassWriter.ACC_SYNTHETIC_ATTRIBUTE / Opcodes.ACC_SYNTHETIC));
        out.putShort(access & ~mask).putShort(name).putShort(desc);
        int attributeCount = 0;
        if (value != 0) {
            ++attributeCount;
        }
        if ((access & Opcodes.ACC_SYNTHETIC) != 0 && ((cw.version & 0xFFFF) < Opcodes.V1_5 || (access & ClassWriter.ACC_SYNTHETIC_ATTRIBUTE) != 0)) {
            ++attributeCount;
        }
        if ((access & Opcodes.ACC_DEPRECATED) != 0) {
            ++attributeCount;
        }
        if (ClassReader.SIGNATURES && signature != 0) {
            ++attributeCount;
        }
        if (ClassReader.ANNOTATIONS && anns != null) {
            ++attributeCount;
        }
        if (ClassReader.ANNOTATIONS && ianns != null) {
            ++attributeCount;
        }
        if (attrs != null) {
            attributeCount += attrs.getCount();
        }
        out.putShort(attributeCount);
        if (value != 0) {
            out.putShort(cw.newUTF8("ConstantValue"));
            out.putInt(2).putShort(value);
        }
        if ((access & Opcodes.ACC_SYNTHETIC) != 0 && ((cw.version & 0xFFFF) < Opcodes.V1_5 || (access & ClassWriter.ACC_SYNTHETIC_ATTRIBUTE) != 0)) {
            out.putShort(cw.newUTF8("Synthetic")).putInt(0);
        }
        if ((access & Opcodes.ACC_DEPRECATED) != 0) {
            out.putShort(cw.newUTF8("Deprecated")).putInt(0);
        }
        if (ClassReader.SIGNATURES && signature != 0) {
            out.putShort(cw.newUTF8("Signature"));
            out.putInt(2).putShort(signature);
        }
        if (ClassReader.ANNOTATIONS && anns != null) {
            out.putShort(cw.newUTF8("RuntimeVisibleAnnotations"));
            anns.put(out);
        }
        if (ClassReader.ANNOTATIONS && ianns != null) {
            out.putShort(cw.newUTF8("RuntimeInvisibleAnnotations"));
            ianns.put(out);
        }
        if (attrs != null) {
            attrs.put(cw, null, 0, -1, -1, out);
        }
    }
}
