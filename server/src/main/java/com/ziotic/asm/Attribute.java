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
 * A non standard class, field, method or code attribute.
 *
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
public class Attribute {

    /**
     * The type of this attribute.
     */
    public final String type;

    /**
     * The raw value of this attribute, used only for unknown attributes.
     */
    byte[] value;

    /**
     * The next attribute in this attribute list. May be <tt>null</tt>.
     */
    Attribute next;

    /**
     * Constructs a new empty attribute.
     *
     * @param type the type of the attribute.
     */
    protected Attribute(final String type) {
        this.type = type;
    }

    /**
     * Returns <tt>true</tt> if this type of attribute is unknown. The default
     * implementation of this method always returns <tt>true</tt>.
     *
     * @return <tt>true</tt> if this type of attribute is unknown.
     */
    public boolean isUnknown() {
        return true;
    }

    /**
     * Returns <tt>true</tt> if this type of attribute is a code attribute.
     *
     * @return <tt>true</tt> if this type of attribute is a code attribute.
     */
    public boolean isCodeAttribute() {
        return false;
    }

    /**
     * Returns the labels corresponding to this attribute.
     *
     * @return the labels corresponding to this attribute, or <tt>null</tt> if
     *         this attribute is not a code attribute that contains labels.
     */
    protected Label[] getLabels() {
        return null;
    }

    /**
     * Reads a {@link #type type} attribute. This method must return a <i>new</i>
     * {@link Attribute} object, of type {@link #type type}, corresponding to
     * the <tt>len</tt> bytes starting at the given offset, in the given class
     * reader.
     *
     * @param cr      the class that contains the attribute to be read.
     * @param off     index of the first byte of the attribute's content in {@link
     *                ClassReader#b cr.b}. The 6 attribute header bytes, containing the
     *                type and the length of the attribute, are not taken into account
     *                here.
     * @param len     the length of the attribute's content.
     * @param buf     buffer to be used to call
     *                {@link ClassReader#readUTF8 readUTF8},
     *                {@link ClassReader#readClass(int, char[]) readClass} or
     *                {@link ClassReader#readConst readConst}.
     * @param codeOff index of the first byte of code's attribute content in
     *                {@link ClassReader#b cr.b}, or -1 if the attribute to be read is
     *                not a code attribute. The 6 attribute header bytes, containing the
     *                type and the length of the attribute, are not taken into account
     *                here.
     * @param labels  the labels of the method's code, or <tt>null</tt> if the
     *                attribute to be read is not a code attribute.
     * @return a <i>new</i> {@link Attribute} object corresponding to the given
     *         bytes.
     */
    protected Attribute read(final ClassReader cr, final int off, final int len, final char[] buf, final int codeOff, final Label[] labels) {
        Attribute attr = new Attribute(type);
        attr.value = new byte[len];
        System.arraycopy(cr.b, off, attr.value, 0, len);
        return attr;
    }

    /**
     * Returns the byte array form of this attribute.
     *
     * @param cw        the class to which this attribute must be added. This parameter
     *                  can be used to add to the constant pool of this class the items
     *                  that corresponds to this attribute.
     * @param code      the bytecode of the method corresponding to this code
     *                  attribute, or <tt>null</tt> if this attribute is not a code
     *                  attributes.
     * @param len       the length of the bytecode of the method corresponding to this
     *                  code attribute, or <tt>null</tt> if this attribute is not a code
     *                  attribute.
     * @param maxStack  the maximum stack size of the method corresponding to
     *                  this code attribute, or -1 if this attribute is not a code
     *                  attribute.
     * @param maxLocals the maximum number of local variables of the method
     *                  corresponding to this code attribute, or -1 if this attribute is
     *                  not a code attribute.
     * @return the byte array form of this attribute.
     */
    protected ByteVector write(final ClassWriter cw, final byte[] code, final int len, final int maxStack, final int maxLocals) {
        ByteVector v = new ByteVector();
        v.data = value;
        v.length = value.length;
        return v;
    }

    /**
     * Returns the length of the attribute list that begins with this attribute.
     *
     * @return the length of the attribute list that begins with this attribute.
     */
    final int getCount() {
        int count = 0;
        Attribute attr = this;
        while (attr != null) {
            count += 1;
            attr = attr.next;
        }
        return count;
    }

    /**
     * Returns the size of all the attributes in this attribute list.
     *
     * @param cw        the class writer to be used to convert the attributes into byte
     *                  arrays, with the {@link #write write} method.
     * @param code      the bytecode of the method corresponding to these code
     *                  attributes, or <tt>null</tt> if these attributes are not code
     *                  attributes.
     * @param len       the length of the bytecode of the method corresponding to
     *                  these code attributes, or <tt>null</tt> if these attributes are
     *                  not code attributes.
     * @param maxStack  the maximum stack size of the method corresponding to
     *                  these code attributes, or -1 if these attributes are not code
     *                  attributes.
     * @param maxLocals the maximum number of local variables of the method
     *                  corresponding to these code attributes, or -1 if these attributes
     *                  are not code attributes.
     * @return the size of all the attributes in this attribute list. This size
     *         includes the size of the attribute headers.
     */
    final int getSize(final ClassWriter cw, final byte[] code, final int len, final int maxStack, final int maxLocals) {
        Attribute attr = this;
        int size = 0;
        while (attr != null) {
            cw.newUTF8(attr.type);
            size += attr.write(cw, code, len, maxStack, maxLocals).length + 6;
            attr = attr.next;
        }
        return size;
    }

    /**
     * Writes all the attributes of this attribute list in the given byte
     * vector.
     *
     * @param cw        the class writer to be used to convert the attributes into byte
     *                  arrays, with the {@link #write write} method.
     * @param code      the bytecode of the method corresponding to these code
     *                  attributes, or <tt>null</tt> if these attributes are not code
     *                  attributes.
     * @param len       the length of the bytecode of the method corresponding to
     *                  these code attributes, or <tt>null</tt> if these attributes are
     *                  not code attributes.
     * @param maxStack  the maximum stack size of the method corresponding to
     *                  these code attributes, or -1 if these attributes are not code
     *                  attributes.
     * @param maxLocals the maximum number of local variables of the method
     *                  corresponding to these code attributes, or -1 if these attributes
     *                  are not code attributes.
     * @param out       where the attributes must be written.
     */
    final void put(final ClassWriter cw, final byte[] code, final int len, final int maxStack, final int maxLocals, final ByteVector out) {
        Attribute attr = this;
        while (attr != null) {
            ByteVector b = attr.write(cw, code, len, maxStack, maxLocals);
            out.putShort(cw.newUTF8(attr.type)).putInt(b.length);
            out.putByteArray(b.data, 0, b.length);
            attr = attr.next;
        }
    }
}
