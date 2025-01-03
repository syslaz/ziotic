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
package com.ziotic.asm.xml;

import com.ziotic.asm.AnnotationVisitor;
import com.ziotic.asm.Type;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

/**
 * SAXAnnotationAdapter
 *
 * @author Eugene Kuleshov
 */
public class SAXAnnotationAdapter extends SAXAdapter implements AnnotationVisitor {
    private final String elementName;

    public SAXAnnotationAdapter(final ContentHandler h, final String elementName, final int visible, final String name, final String desc) {
        this(h, elementName, visible, desc, name, -1);
    }

    public SAXAnnotationAdapter(final ContentHandler h, final String elementName, final int visible, final int parameter, final String desc) {
        this(h, elementName, visible, desc, null, parameter);
    }

    private SAXAnnotationAdapter(final ContentHandler h, final String elementName, final int visible, final String desc, final String name, final int parameter) {
        super(h);
        this.elementName = elementName;

        AttributesImpl att = new AttributesImpl();
        if (name != null) {
            att.addAttribute("", "name", "name", "", name);
        }
        if (visible != 0) {
            att.addAttribute("", "visible", "visible", "", visible > 0 ? "true" : "false");
        }
        if (parameter != -1) {
            att.addAttribute("", "parameter", "parameter", "", Integer.toString(parameter));
        }
        if (desc != null) {
            att.addAttribute("", "desc", "desc", "", desc);
        }

        addStart(elementName, att);
    }

    public void visit(final String name, final Object value) {
        Class c = value.getClass();
        if (c.isArray()) {
            AnnotationVisitor av = visitArray(name);
            if (value instanceof byte[]) {
                byte[] b = (byte[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Byte(b[i]));
                }
            } else if (value instanceof char[]) {
                char[] b = (char[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Character(b[i]));
                }
            } else if (value instanceof short[]) {
                short[] b = (short[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Short(b[i]));
                }
            } else if (value instanceof boolean[]) {
                boolean[] b = (boolean[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, Boolean.valueOf(b[i]));
                }
            } else if (value instanceof int[]) {
                int[] b = (int[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Integer(b[i]));
                }
            } else if (value instanceof long[]) {
                long[] b = (long[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Long(b[i]));
                }
            } else if (value instanceof float[]) {
                float[] b = (float[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Float(b[i]));
                }
            } else if (value instanceof double[]) {
                double[] b = (double[]) value;
                for (int i = 0; i < b.length; i++) {
                    av.visit(null, new Double(b[i]));
                }
            }
            av.visitEnd();
        } else {
            addValueElement("annotationValue", name, Type.getDescriptor(c), value.toString());
        }
    }

    public void visitEnum(final String name, final String desc, final String value) {
        addValueElement("annotationValueEnum", name, desc, value);
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        return new SAXAnnotationAdapter(getContentHandler(), "annotationValueAnnotation", 0, name, desc);
    }

    public AnnotationVisitor visitArray(final String name) {
        return new SAXAnnotationAdapter(getContentHandler(), "annotationValueArray", 0, name, null);
    }

    public void visitEnd() {
        addEnd(elementName);
    }

    private void addValueElement(final String element, final String name, final String desc, final String value) {
        AttributesImpl att = new AttributesImpl();
        if (name != null) {
            att.addAttribute("", "name", "name", "", name);
        }
        if (desc != null) {
            att.addAttribute("", "desc", "desc", "", desc);
        }
        if (value != null) {
            att.addAttribute("", "value", "value", "", SAXClassAdapter.encode(value));
        }

        addElement(element, att);
    }
}
