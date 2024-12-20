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

import java.util.ArrayList;
import java.util.List;

import com.ziotic.asm.AnnotationVisitor;

/**
 * A node that represents an annotationn.
 *
 * @author Eric Bruneton
 */
public class AnnotationNode implements AnnotationVisitor {

    /**
     * The class descriptor of the annotation class.
     */
    public String desc;

    /**
     * The name value pairs of this annotation. Each name value pair is stored
     * as two consecutive elements in the list. The name is a {@link String},
     * and the value may be a {@link Byte}, {@link Boolean}, {@link Character},
     * {@link Short}, {@link Integer}, {@link Long}, {@link Float},
     * {@link Double}, {@link String} or {@link com.ziotic.asm.Type}, or an
     * two elements String array (for enumeration values), a
     * {@link AnnotationNode}, or a {@link List} of values of one of the
     * preceding types. The list may be <tt>null</tt> if there is no name
     * value pair.
     */
    public List values;

    /**
     * Constructs a new {@link AnnotationNode}.
     *
     * @param desc the class descriptor of the annotation class.
     */
    public AnnotationNode(final String desc) {
        this.desc = desc;
    }

    /**
     * Constructs a new {@link AnnotationNode} to visit an array value.
     *
     * @param values where the visited values must be stored.
     */
    AnnotationNode(final List values) {
        this.values = values;
    }

    // ------------------------------------------------------------------------
    // Implementation of the AnnotationVisitor interface
    // ------------------------------------------------------------------------

    public void visit(final String name, final Object value) {
        if (values == null) {
            values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            values.add(name);
        }
        values.add(value);
    }

    public void visitEnum(final String name, final String desc, final String value) {
        if (values == null) {
            values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            values.add(name);
        }
        values.add(new String[]{desc, value});
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        if (values == null) {
            values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            values.add(name);
        }
        AnnotationNode annotation = new AnnotationNode(desc);
        values.add(annotation);
        return annotation;
    }

    public AnnotationVisitor visitArray(final String name) {
        if (values == null) {
            values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            values.add(name);
        }
        List array = new ArrayList();
        values.add(array);
        return new AnnotationNode(array);
    }

    public void visitEnd() {
    }

    // ------------------------------------------------------------------------
    // Accept methods
    // ------------------------------------------------------------------------

    /**
     * Makes the given visitor visit this annotation.
     *
     * @param av an annotation visitor. Maybe <tt>null</tt>.
     */
    public void accept(final AnnotationVisitor av) {
        if (av != null) {
            if (values != null) {
                for (int i = 0; i < values.size(); i += 2) {
                    String name = (String) values.get(i);
                    Object value = values.get(i + 1);
                    accept(av, name, value);
                }
            }
            av.visitEnd();
        }
    }

    /**
     * Makes the given visitor visit a given annotation value.
     *
     * @param av    an annotation visitor. Maybe <tt>null</tt>.
     * @param name  the value name.
     * @param value the actual value.
     */
    static void accept(final AnnotationVisitor av, final String name, final Object value) {
        if (av != null) {
            if (value instanceof String[]) {
                String[] typeconst = (String[]) value;
                av.visitEnum(name, typeconst[0], typeconst[1]);
            } else if (value instanceof AnnotationNode) {
                AnnotationNode an = (AnnotationNode) value;
                an.accept(av.visitAnnotation(name, an.desc));
            } else if (value instanceof List) {
                AnnotationVisitor v = av.visitArray(name);
                List array = (List) value;
                for (int j = 0; j < array.size(); ++j) {
                    accept(v, null, array.get(j));
                }
                v.visitEnd();
            } else {
                av.visit(name, value);
            }
        }
    }
}
