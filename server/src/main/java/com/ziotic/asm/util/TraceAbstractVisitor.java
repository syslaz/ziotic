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

/**
 * An abstract trace visitor.
 *
 * @author Eric Bruneton
 */
public abstract class TraceAbstractVisitor extends AbstractVisitor {

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for internal
     * type names in bytecode notation.
     */
    public static final int INTERNAL_NAME = 0;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for field
     * descriptors, formatted in bytecode notation
     */
    public static final int FIELD_DESCRIPTOR = 1;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for field
     * signatures, formatted in bytecode notation
     */
    public static final int FIELD_SIGNATURE = 2;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for method
     * descriptors, formatted in bytecode notation
     */
    public static final int METHOD_DESCRIPTOR = 3;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for method
     * signatures, formatted in bytecode notation
     */
    public static final int METHOD_SIGNATURE = 4;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for class
     * signatures, formatted in bytecode notation
     */
    public static final int CLASS_SIGNATURE = 5;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for field or
     * method return value signatures, formatted in default Java notation
     * (non-bytecode)
     */
    public static final int TYPE_DECLARATION = 6;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for class
     * signatures, formatted in default Java notation (non-bytecode)
     */
    public static final int CLASS_DECLARATION = 7;

    /**
     * Constant used in {@link #appendDescriptor appendDescriptor} for method
     * parameter signatures, formatted in default Java notation (non-bytecode)
     */
    public static final int PARAMETERS_DECLARATION = 8;

    /**
     * Tab for class members.
     */
    protected String tab = "  ";

    /**
     * Prints a disassembled view of the given annotation.
     *
     * @param desc    the class descriptor of the annotation class.
     * @param visible <tt>true</tt> if the annotation is visible at runtime.
     * @return a visitor to visit the annotation values.
     */
    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        buf.setLength(0);
        buf.append(tab).append('@');
        appendDescriptor(FIELD_DESCRIPTOR, desc);
        buf.append('(');
        text.add(buf.toString());
        TraceAnnotationVisitor tav = createTraceAnnotationVisitor();
        text.add(tav.getText());
        text.add(visible ? ")\n" : ") // invisible\n");
        return tav;
    }

    /**
     * Prints a disassembled view of the given attribute.
     *
     * @param attr an attribute.
     */
    public void visitAttribute(final Attribute attr) {
        buf.setLength(0);
        buf.append(tab).append("ATTRIBUTE ");
        appendDescriptor(-1, attr.type);

        if (attr instanceof Traceable) {
            ((Traceable) attr).trace(buf, null);
        } else {
            buf.append(" : unknown\n");
        }

        text.add(buf.toString());
    }

    /**
     * Does nothing.
     */
    public void visitEnd() {
        // does nothing
    }

    // ------------------------------------------------------------------------
    // Utility methods
    // ------------------------------------------------------------------------

    protected TraceAnnotationVisitor createTraceAnnotationVisitor() {
        return new TraceAnnotationVisitor();
    }

    /**
     * Appends an internal name, a type descriptor or a type signature to
     * {@link #buf buf}.
     *
     * @param type indicates if desc is an internal name, a field descriptor, a
     *             method descriptor, a class signature, ...
     * @param desc an internal name, type descriptor, or type signature. May be
     *             <tt>null</tt>.
     */
    protected void appendDescriptor(final int type, final String desc) {
        if (type == CLASS_SIGNATURE || type == FIELD_SIGNATURE || type == METHOD_SIGNATURE) {
            if (desc != null) {
                buf.append("// signature ").append(desc).append('\n');
            }
        } else {
            buf.append(desc);
        }
    }
}
