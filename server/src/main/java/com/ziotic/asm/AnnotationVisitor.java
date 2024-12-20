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
 * A visitor to visit a Java annotation. The methods of this interface must be
 * called in the following order: (<tt>visit<tt> | <tt>visitEnum<tt> |
 * <tt>visitAnnotation<tt> | <tt>visitArray<tt>)* <tt>visitEnd<tt>.
 *
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
public interface AnnotationVisitor {

    /**
     * Visits a primitive value of the annotation.
     *
     * @param name  the value name.
     * @param value the actual value, whose type must be {@link Byte},
     *              {@link Boolean}, {@link Character}, {@link Short},
     *              {@link Integer}, {@link Long}, {@link Float}, {@link Double},
     *              {@link String} or {@link Type}. This value can also be an array
     *              of byte, boolean, short, char, int, long, float or double values
     *              (this is equivalent to using {@link #visitArray visitArray} and
     *              visiting each array element in turn, but is more convenient).
     */
    void visit(String name, Object value);

    /**
     * Visits an enumeration value of the annotation.
     *
     * @param name  the value name.
     * @param desc  the class descriptor of the enumeration class.
     * @param value the actual enumeration value.
     */
    void visitEnum(String name, String desc, String value);

    /**
     * Visits a nested annotation value of the annotation.
     *
     * @param name the value name.
     * @param desc the class descriptor of the nested annotation class.
     * @return a visitor to visit the actual nested annotation value, or
     *         <tt>null</tt> if this visitor is not interested in visiting
     *         this nested annotation. <i>The nested annotation value must be
     *         fully visited before calling other methods on this annotation
     *         visitor</i>.
     */
    AnnotationVisitor visitAnnotation(String name, String desc);

    /**
     * Visits an array value of the annotation. Note that arrays of primitive
     * types (such as byte, boolean, short, char, int, long, float or double)
     * can be passed as value to {@link #visit visit}. This is what
     * {@link ClassReader} does.
     *
     * @param name the value name.
     * @return a visitor to visit the actual array value elements, or
     *         <tt>null</tt> if this visitor is not interested in visiting
     *         these values. The 'name' parameters passed to the methods of this
     *         visitor are ignored. <i>All the array values must be visited
     *         before calling other methods on this annotation visitor</i>.
     */
    AnnotationVisitor visitArray(String name);

    /**
     * Visits the end of the annotation.
     */
    void visitEnd();
}
