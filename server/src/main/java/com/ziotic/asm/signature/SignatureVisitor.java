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
package com.ziotic.asm.signature;

/**
 * A visitor to visit a generic signature. The methods of this interface must be
 * called in one of the three following orders (the last one is the only valid
 * order for a {@link SignatureVisitor} that is returned by a method of this
 * interface): <ul> <li><i>ClassSignature</i> = (
 * <tt>visitFormalTypeParameter</tt>
 * <tt>visitClassBound</tt>?
 * <tt>visitInterfaceBound</tt>* )* ( <tt>visitSuperClass</tt>
 * <tt>visitInterface</tt>* )</li>
 * <li><i>MethodSignature</i> = ( <tt>visitFormalTypeParameter</tt>
 * <tt>visitClassBound</tt>?
 * <tt>visitInterfaceBound</tt>* )* ( <tt>visitParameterType</tt>*
 * <tt>visitReturnType</tt>
 * <tt>visitExceptionType</tt>* )</li> <li><i>TypeSignature</i> =
 * <tt>visitBaseType</tt> | <tt>visitTypeVariable</tt> |
 * <tt>visitArrayType</tt> | (
 * <tt>visitClassType</tt> <tt>visitTypeArgument</tt>* (
 * <tt>visitInnerClassType</tt> <tt>visitTypeArgument</tt>* )*
 * <tt>visitEnd</tt> ) )</li> </ul>
 *
 * @author Thomas Hallgren
 * @author Eric Bruneton
 */
public interface SignatureVisitor {

    /**
     * Wildcard for an "extends" type argument.
     */
    char EXTENDS = '+';

    /**
     * Wildcard for a "super" type argument.
     */
    char SUPER = '-';

    /**
     * Wildcard for a normal type argument.
     */
    char INSTANCEOF = '=';

    /**
     * Visits a formal type parameter.
     *
     * @param name the name of the formal parameter.
     */
    void visitFormalTypeParameter(String name);

    /**
     * Visits the class bound of the last visited formal type parameter.
     *
     * @return a non null visitor to visit the signature of the class bound.
     */
    SignatureVisitor visitClassBound();

    /**
     * Visits an interface bound of the last visited formal type parameter.
     *
     * @return a non null visitor to visit the signature of the interface bound.
     */
    SignatureVisitor visitInterfaceBound();

    /**
     * Visits the type of the super class.
     *
     * @return a non null visitor to visit the signature of the super class
     *         type.
     */
    SignatureVisitor visitSuperclass();

    /**
     * Visits the type of an interface implemented by the class.
     *
     * @return a non null visitor to visit the signature of the interface type.
     */
    SignatureVisitor visitInterface();

    /**
     * Visits the type of a method parameter.
     *
     * @return a non null visitor to visit the signature of the parameter type.
     */
    SignatureVisitor visitParameterType();

    /**
     * Visits the return type of the method.
     *
     * @return a non null visitor to visit the signature of the return type.
     */
    SignatureVisitor visitReturnType();

    /**
     * Visits the type of a method exception.
     *
     * @return a non null visitor to visit the signature of the exception type.
     */
    SignatureVisitor visitExceptionType();

    /**
     * Visits a signature corresponding to a primitive type.
     *
     * @param descriptor the descriptor of the primitive type, or 'V' for
     *                   <tt>void</tt>.
     */
    void visitBaseType(char descriptor);

    /**
     * Visits a signature corresponding to a type variable.
     *
     * @param name the name of the type variable.
     */
    void visitTypeVariable(String name);

    /**
     * Visits a signature corresponding to an array type.
     *
     * @return a non null visitor to visit the signature of the array element
     *         type.
     */
    SignatureVisitor visitArrayType();

    /**
     * Starts the visit of a signature corresponding to a class or interface
     * type.
     *
     * @param name the internal name of the class or interface.
     */
    void visitClassType(String name);

    /**
     * Visits an inner class.
     *
     * @param name the local name of the inner class in its enclosing class.
     */
    void visitInnerClassType(String name);

    /**
     * Visits an unbounded type argument of the last visited class or inner
     * class type.
     */
    void visitTypeArgument();

    /**
     * Visits a type argument of the last visited class or inner class type.
     *
     * @param wildcard '+', '-' or '='.
     * @return a non null visitor to visit the signature of the type argument.
     */
    SignatureVisitor visitTypeArgument(char wildcard);

    /**
     * Ends the visit of a signature corresponding to a class or interface type.
     */
    void visitEnd();
}
