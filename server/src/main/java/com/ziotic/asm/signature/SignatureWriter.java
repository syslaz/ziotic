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
 * A signature visitor that generates signatures in string format.
 *
 * @author Thomas Hallgren
 * @author Eric Bruneton
 */
public class SignatureWriter implements SignatureVisitor {

    /**
     * Buffer used to construct the signature.
     */
    private final StringBuffer buf = new StringBuffer();

    /**
     * Indicates if the signature contains formal type parameters.
     */
    private boolean hasFormals;

    /**
     * Indicates if the signature contains method parameter types.
     */
    private boolean hasParameters;

    /**
     * Stack used to keep track of class types that have arguments. Each element
     * of this stack is a boolean encoded in one bit. The top of the stack is
     * the lowest order bit. Pushing false = *2, pushing true = *2+1, popping =
     * /2.
     */
    private int argumentStack;

    /**
     * Constructs a new {@link SignatureWriter} object.
     */
    public SignatureWriter() {
    }

    // ------------------------------------------------------------------------
    // Implementation of the SignatureVisitor interface
    // ------------------------------------------------------------------------

    public void visitFormalTypeParameter(final String name) {
        if (!hasFormals) {
            hasFormals = true;
            buf.append('<');
        }
        buf.append(name);
        buf.append(':');
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        buf.append(':');
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        endFormals();
        return this;
    }

    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureVisitor visitParameterType() {
        endFormals();
        if (!hasParameters) {
            hasParameters = true;
            buf.append('(');
        }
        return this;
    }

    public SignatureVisitor visitReturnType() {
        endFormals();
        if (!hasParameters) {
            buf.append('(');
        }
        buf.append(')');
        return this;
    }

    public SignatureVisitor visitExceptionType() {
        buf.append('^');
        return this;
    }

    public void visitBaseType(final char descriptor) {
        buf.append(descriptor);
    }

    public void visitTypeVariable(final String name) {
        buf.append('T');
        buf.append(name);
        buf.append(';');
    }

    public SignatureVisitor visitArrayType() {
        buf.append('[');
        return this;
    }

    public void visitClassType(final String name) {
        buf.append('L');
        buf.append(name);
        argumentStack *= 2;
    }

    public void visitInnerClassType(final String name) {
        endArguments();
        buf.append('.');
        buf.append(name);
        argumentStack *= 2;
    }

    public void visitTypeArgument() {
        if (argumentStack % 2 == 0) {
            ++argumentStack;
            buf.append('<');
        }
        buf.append('*');
    }

    public SignatureVisitor visitTypeArgument(final char wildcard) {
        if (argumentStack % 2 == 0) {
            ++argumentStack;
            buf.append('<');
        }
        if (wildcard != '=') {
            buf.append(wildcard);
        }
        return this;
    }

    public void visitEnd() {
        endArguments();
        buf.append(';');
    }

    /**
     * Returns the signature that was built by this signature writer.
     *
     * @return the signature that was built by this signature writer.
     */
    public String toString() {
        return buf.toString();
    }

    // ------------------------------------------------------------------------
    // Utility methods
    // ------------------------------------------------------------------------

    /**
     * Ends the formal type parameters section of the signature.
     */
    private void endFormals() {
        if (hasFormals) {
            hasFormals = false;
            buf.append('>');
        }
    }

    /**
     * Ends the type arguments of a class or inner class type.
     */
    private void endArguments() {
        if (argumentStack % 2 != 0) {
            buf.append('>');
        }
        argumentStack /= 2;
    }
}