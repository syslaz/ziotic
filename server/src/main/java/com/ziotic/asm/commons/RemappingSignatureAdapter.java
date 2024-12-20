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
package com.ziotic.asm.commons;

import com.ziotic.asm.signature.SignatureVisitor;

/**
 * A <code>SignatureVisitor</code> adapter for type mapping.
 *
 * @author Eugene Kuleshov
 */
public class RemappingSignatureAdapter implements SignatureVisitor {
    private final SignatureVisitor v;
    private final Remapper remapper;
    private String className;

    public RemappingSignatureAdapter(SignatureVisitor v, Remapper remapper) {
        this.v = v;
        this.remapper = remapper;
    }

    public void visitClassType(String name) {
        className = name;
        v.visitClassType(remapper.mapType(name));
    }

    public void visitInnerClassType(String name) {
        className = className + '$' + name;
        String remappedName = remapper.mapType(className);
        v.visitInnerClassType(remappedName.substring(remappedName.lastIndexOf('$') + 1));
    }

    public void visitFormalTypeParameter(String name) {
        v.visitFormalTypeParameter(name);
    }

    public void visitTypeVariable(String name) {
        v.visitTypeVariable(name);
    }

    public SignatureVisitor visitArrayType() {
        v.visitArrayType();
        return this;
    }

    public void visitBaseType(char descriptor) {
        v.visitBaseType(descriptor);
    }

    public SignatureVisitor visitClassBound() {
        v.visitClassBound();
        return this;
    }

    public SignatureVisitor visitExceptionType() {
        v.visitExceptionType();
        return this;
    }

    public SignatureVisitor visitInterface() {
        v.visitInterface();
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        v.visitInterfaceBound();
        return this;
    }

    public SignatureVisitor visitParameterType() {
        v.visitParameterType();
        return this;
    }

    public SignatureVisitor visitReturnType() {
        v.visitReturnType();
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        v.visitSuperclass();
        return this;
    }

    public void visitTypeArgument() {
        v.visitTypeArgument();
    }

    public SignatureVisitor visitTypeArgument(char wildcard) {
        v.visitTypeArgument(wildcard);
        return this;
    }

    public void visitEnd() {
        v.visitEnd();
    }
}
