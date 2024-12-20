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

import com.ziotic.asm.Opcodes;
import com.ziotic.asm.signature.SignatureVisitor;

/**
 * A {@link com.ziotic.asm.signature.SignatureVisitor} that prints a disassembled view of the signature
 * it visits.
 *
 * @author Eugene Kuleshov
 * @author Eric Bruneton
 */
public class TraceSignatureVisitor implements SignatureVisitor {

    private final StringBuffer declaration;

    private boolean isInterface;

    private boolean seenFormalParameter;

    private boolean seenInterfaceBound;

    private boolean seenParameter;

    private boolean seenInterface;

    private StringBuffer returnType;

    private StringBuffer exceptions;

    /**
     * Stack used to keep track of class types that have arguments. Each element
     * of this stack is a boolean encoded in one bit. The top of the stack is
     * the lowest order bit. Pushing false = *2, pushing true = *2+1, popping =
     * /2.
     */
    private int argumentStack;

    /**
     * Stack used to keep track of array class types. Each element of this stack
     * is a boolean encoded in one bit. The top of the stack is the lowest order
     * bit. Pushing false = *2, pushing true = *2+1, popping = /2.
     */
    private int arrayStack;

    private String separator = "";

    public TraceSignatureVisitor(final int access) {
        isInterface = (access & Opcodes.ACC_INTERFACE) != 0;
        this.declaration = new StringBuffer();
    }

    private TraceSignatureVisitor(final StringBuffer buf) {
        this.declaration = buf;
    }

    public void visitFormalTypeParameter(final String name) {
        declaration.append(seenFormalParameter ? ", " : "<").append(name);
        seenFormalParameter = true;
        seenInterfaceBound = false;
    }

    public SignatureVisitor visitClassBound() {
        separator = " extends ";
        startType();
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        separator = seenInterfaceBound ? ", " : " extends ";
        seenInterfaceBound = true;
        startType();
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        endFormals();
        separator = " extends ";
        startType();
        return this;
    }

    public SignatureVisitor visitInterface() {
        separator = seenInterface ? ", " : isInterface ? " extends " : " implements ";
        seenInterface = true;
        startType();
        return this;
    }

    public SignatureVisitor visitParameterType() {
        endFormals();
        if (seenParameter) {
            declaration.append(", ");
        } else {
            seenParameter = true;
            declaration.append('(');
        }
        startType();
        return this;
    }

    public SignatureVisitor visitReturnType() {
        endFormals();
        if (seenParameter) {
            seenParameter = false;
        } else {
            declaration.append('(');
        }
        declaration.append(')');
        returnType = new StringBuffer();
        return new TraceSignatureVisitor(returnType);
    }

    public SignatureVisitor visitExceptionType() {
        if (exceptions == null) {
            exceptions = new StringBuffer();
        } else {
            exceptions.append(", ");
        }
        // startType();
        return new TraceSignatureVisitor(exceptions);
    }

    public void visitBaseType(final char descriptor) {
        switch (descriptor) {
            case 'V':
                declaration.append("void");
                break;
            case 'B':
                declaration.append("byte");
                break;
            case 'J':
                declaration.append("long");
                break;
            case 'Z':
                declaration.append("boolean");
                break;
            case 'I':
                declaration.append("int");
                break;
            case 'S':
                declaration.append("short");
                break;
            case 'C':
                declaration.append("char");
                break;
            case 'F':
                declaration.append("float");
                break;
            // case 'D':
            default:
                declaration.append("double");
                break;
        }
        endType();
    }

    public void visitTypeVariable(final String name) {
        declaration.append(name);
        endType();
    }

    public SignatureVisitor visitArrayType() {
        startType();
        arrayStack |= 1;
        return this;
    }

    public void visitClassType(final String name) {
        if ("java/lang/Object".equals(name)) {
            // Map<java.lang.Object,java.util.List>
            // or
            // abstract public V get(Object key); (seen in Dictionary.class)
            // should have Object
            // but java.lang.String extends java.lang.Object is unnecessary
            boolean needObjectClass = argumentStack % 2 != 0 || seenParameter;
            if (needObjectClass) {
                declaration.append(separator).append(name.replace('/', '.'));
            }
        } else {
            declaration.append(separator).append(name.replace('/', '.'));
        }
        separator = "";
        argumentStack *= 2;
    }

    public void visitInnerClassType(final String name) {
        if (argumentStack % 2 != 0) {
            declaration.append('>');
        }
        argumentStack /= 2;
        declaration.append('.');
        declaration.append(separator).append(name.replace('/', '.'));
        separator = "";
        argumentStack *= 2;
    }

    public void visitTypeArgument() {
        if (argumentStack % 2 == 0) {
            ++argumentStack;
            declaration.append('<');
        } else {
            declaration.append(", ");
        }
        declaration.append('?');
    }

    public SignatureVisitor visitTypeArgument(final char tag) {
        if (argumentStack % 2 == 0) {
            ++argumentStack;
            declaration.append('<');
        } else {
            declaration.append(", ");
        }

        if (tag == EXTENDS) {
            declaration.append("? extends ");
        } else if (tag == SUPER) {
            declaration.append("? super ");
        }

        startType();
        return this;
    }

    public void visitEnd() {
        if (argumentStack % 2 != 0) {
            declaration.append('>');
        }
        argumentStack /= 2;
        endType();
    }

    public String getDeclaration() {
        return declaration.toString();
    }

    public String getReturnType() {
        return returnType == null ? null : returnType.toString();
    }

    public String getExceptions() {
        return exceptions == null ? null : exceptions.toString();
    }

    // -----------------------------------------------

    private void endFormals() {
        if (seenFormalParameter) {
            declaration.append('>');
            seenFormalParameter = false;
        }
    }

    private void startType() {
        arrayStack *= 2;
    }

    private void endType() {
        if (arrayStack % 2 == 0) {
            arrayStack /= 2;
        } else {
            while (arrayStack % 2 != 0) {
                arrayStack /= 2;
                declaration.append("[]");
            }
        }
    }
}
