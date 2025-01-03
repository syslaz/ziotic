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
 * A visitor to visit a Java class. The methods of this interface must be called
 * in the following order: <tt>visit</tt> [ <tt>visitSource</tt> ] [
 * <tt>visitOuterClass</tt> ] ( <tt>visitAnnotation</tt> |
 * <tt>visitAttribute</tt> )* (<tt>visitInnerClass</tt> |
 * <tt>visitField</tt> | <tt>visitMethod</tt> )* <tt>visitEnd</tt>.
 *
 * @author Eric Bruneton
 */
public interface ClassVisitor {

    /**
     * Visits the header of the class.
     *
     * @param version    the class version.
     * @param access     the class's access flags (see {@link Opcodes}). This
     *                   parameter also indicates if the class is deprecated.
     * @param name       the internal name of the class (see
     *                   {@link Type#getInternalName() getInternalName}).
     * @param signature  the signature of this class. May be <tt>null</tt> if
     *                   the class is not a generic one, and does not extend or implement
     *                   generic classes or interfaces.
     * @param superName  the internal of name of the super class (see
     *                   {@link Type#getInternalName() getInternalName}). For interfaces,
     *                   the super class is {@link Object}. May be <tt>null</tt>, but
     *                   only for the {@link Object} class.
     * @param interfaces the internal names of the class's interfaces (see
     *                   {@link Type#getInternalName() getInternalName}). May be
     *                   <tt>null</tt>.
     */
    void visit(int version, int access, String name, String signature, String superName, String[] interfaces);

    /**
     * Visits the source of the class.
     *
     * @param source the name of the source file from which the class was
     *               compiled. May be <tt>null</tt>.
     * @param debug  additional debug information to compute the correspondance
     *               between source and compiled elements of the class. May be
     *               <tt>null</tt>.
     */
    void visitSource(String source, String debug);

    /**
     * Visits the enclosing class of the class. This method must be called only
     * if the class has an enclosing class.
     *
     * @param owner internal name of the enclosing class of the class.
     * @param name  the name of the method that contains the class, or
     *              <tt>null</tt> if the class is not enclosed in a method of its
     *              enclosing class.
     * @param desc  the descriptor of the method that contains the class, or
     *              <tt>null</tt> if the class is not enclosed in a method of its
     *              enclosing class.
     */
    void visitOuterClass(String owner, String name, String desc);

    /**
     * Visits an annotation of the class.
     *
     * @param desc    the class descriptor of the annotation class.
     * @param visible <tt>true</tt> if the annotation is visible at runtime.
     * @return a visitor to visit the annotation values, or <tt>null</tt> if
     *         this visitor is not interested in visiting this annotation.
     */
    AnnotationVisitor visitAnnotation(String desc, boolean visible);

    /**
     * Visits a non standard attribute of the class.
     *
     * @param attr an attribute.
     */
    void visitAttribute(Attribute attr);

    /**
     * Visits information about an inner class. This inner class is not
     * necessarily a member of the class being visited.
     *
     * @param name      the internal name of an inner class (see
     *                  {@link Type#getInternalName() getInternalName}).
     * @param outerName the internal name of the class to which the inner class
     *                  belongs (see {@link Type#getInternalName() getInternalName}). May
     *                  be <tt>null</tt> for not member classes.
     * @param innerName the (simple) name of the inner class inside its
     *                  enclosing class. May be <tt>null</tt> for anonymous inner
     *                  classes.
     * @param access    the access flags of the inner class as originally declared
     *                  in the enclosing class.
     */
    void visitInnerClass(String name, String outerName, String innerName, int access);

    /**
     * Visits a field of the class.
     *
     * @param access    the field's access flags (see {@link Opcodes}). This
     *                  parameter also indicates if the field is synthetic and/or
     *                  deprecated.
     * @param name      the field's name.
     * @param desc      the field's descriptor (see {@link Type Type}).
     * @param signature the field's signature. May be <tt>null</tt> if the
     *                  field's type does not use generic types.
     * @param value     the field's initial value. This parameter, which may be
     *                  <tt>null</tt> if the field does not have an initial value, must
     *                  be an {@link Integer}, a {@link Float}, a {@link Long}, a
     *                  {@link Double} or a {@link String} (for <tt>int</tt>,
     *                  <tt>float</tt>, <tt>long</tt> or <tt>String</tt> fields
     *                  respectively). <i>This parameter is only used for static fields</i>.
     *                  Its value is ignored for non static fields, which must be
     *                  initialized through bytecode instructions in constructors or
     *                  methods.
     * @return a visitor to visit field annotations and attributes, or
     *         <tt>null</tt> if this class visitor is not interested in
     *         visiting these annotations and attributes.
     */
    FieldVisitor visitField(int access, String name, String desc, String signature, Object value);

    /**
     * Visits a method of the class. This method <i>must</i> return a new
     * {@link MethodVisitor} instance (or <tt>null</tt>) each time it is
     * called, i.e., it should not return a previously returned visitor.
     *
     * @param access     the method's access flags (see {@link Opcodes}). This
     *                   parameter also indicates if the method is synthetic and/or
     *                   deprecated.
     * @param name       the method's name.
     * @param desc       the method's descriptor (see {@link Type Type}).
     * @param signature  the method's signature. May be <tt>null</tt> if the
     *                   method parameters, return type and exceptions do not use generic
     *                   types.
     * @param exceptions the internal names of the method's exception classes
     *                   (see {@link Type#getInternalName() getInternalName}). May be
     *                   <tt>null</tt>.
     * @return an object to visit the byte code of the method, or <tt>null</tt>
     *         if this class visitor is not interested in visiting the code of
     *         this method.
     */
    MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions);

    /**
     * Visits the end of the class. This method, which is the last one to be
     * called, is used to inform the visitor that all the fields and methods of
     * the class have been visited.
     */
    void visitEnd();
}
