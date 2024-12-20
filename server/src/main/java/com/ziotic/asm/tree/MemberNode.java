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
import com.ziotic.asm.Attribute;

/**
 * An abstract class, field or method node.
 *
 * @author Eric Bruneton
 */
public abstract class MemberNode {

    /**
     * The runtime visible annotations of this class, field or method. This list
     * is a list of {@link AnnotationNode} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.tree.AnnotationNode
     * @label visible
     */
    public List visibleAnnotations;

    /**
     * The runtime invisible annotations of this class, field or method. This
     * list is a list of {@link AnnotationNode} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.tree.AnnotationNode
     * @label invisible
     */
    public List invisibleAnnotations;

    /**
     * The non standard attributes of this class, field or method. This list is
     * a list of {@link com.ziotic.asm.Attribute} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.Attribute
     */
    public List attrs;

    /**
     * Constructs a new {@link MemberNode}.
     */
    protected MemberNode() {
    }

    /**
     * Visits an annotation of this class, field or method.
     *
     * @param desc    the class descriptor of the annotation class.
     * @param visible <tt>true</tt> if the annotation is visible at runtime.
     * @return a visitor to visit the annotation values.
     */
    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        AnnotationNode an = new AnnotationNode(desc);
        if (visible) {
            if (visibleAnnotations == null) {
                visibleAnnotations = new ArrayList(1);
            }
            visibleAnnotations.add(an);
        } else {
            if (invisibleAnnotations == null) {
                invisibleAnnotations = new ArrayList(1);
            }
            invisibleAnnotations.add(an);
        }
        return an;
    }

    /**
     * Visits a non standard attribute of this class, field or method.
     *
     * @param attr an attribute.
     */
    public void visitAttribute(final Attribute attr) {
        if (attrs == null) {
            attrs = new ArrayList(1);
        }
        attrs.add(attr);
    }

    /**
     * Visits the end of this class, field or method.
     */
    public void visitEnd() {
    }
}
