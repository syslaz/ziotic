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
 * A type signature parser to make a signature visitor visit an existing
 * signature.
 *
 * @author Thomas Hallgren
 * @author Eric Bruneton
 */
public class SignatureReader {

    /**
     * The signature to be read.
     */
    private final String signature;

    /**
     * Constructs a {@link SignatureReader} for the given signature.
     *
     * @param signature A <i>ClassSignature</i>, <i>MethodTypeSignature</i>,
     *                  or <i>FieldTypeSignature</i>.
     */
    public SignatureReader(final String signature) {
        this.signature = signature;
    }

    /**
     * Makes the given visitor visit the signature of this
     * {@link SignatureReader}. This signature is the one specified in the
     * constructor (see {@link #SignatureReader(String) SignatureReader}). This
     * method is intended to be called on a {@link SignatureReader} that was
     * created using a <i>ClassSignature</i> (such as the
     * <code>signature</code> parameter of the
     * {@link com.ziotic.asm.ClassVisitor#visit ClassVisitor.visit} method)
     * or a <i>MethodTypeSignature</i> (such as the <code>signature</code>
     * parameter of the
     * {@link com.ziotic.asm.ClassVisitor#visitMethod ClassVisitor.visitMethod}
     * method).
     *
     * @param v the visitor that must visit this signature.
     */
    public void accept(final SignatureVisitor v) {
        String signature = this.signature;
        int len = signature.length();
        int pos;
        char c;

        if (signature.charAt(0) == '<') {
            pos = 2;
            do {
                int end = signature.indexOf(':', pos);
                v.visitFormalTypeParameter(signature.substring(pos - 1, end));
                pos = end + 1;

                c = signature.charAt(pos);
                if (c == 'L' || c == '[' || c == 'T') {
                    pos = parseType(signature, pos, v.visitClassBound());
                }

                while ((c = signature.charAt(pos++)) == ':') {
                    pos = parseType(signature, pos, v.visitInterfaceBound());
                }
            } while (c != '>');
        } else {
            pos = 0;
        }

        if (signature.charAt(pos) == '(') {
            pos++;
            while (signature.charAt(pos) != ')') {
                pos = parseType(signature, pos, v.visitParameterType());
            }
            pos = parseType(signature, pos + 1, v.visitReturnType());
            while (pos < len) {
                pos = parseType(signature, pos + 1, v.visitExceptionType());
            }
        } else {
            pos = parseType(signature, pos, v.visitSuperclass());
            while (pos < len) {
                pos = parseType(signature, pos, v.visitInterface());
            }
        }
    }

    /**
     * Makes the given visitor visit the signature of this
     * {@link SignatureReader}. This signature is the one specified in the
     * constructor (see {@link #SignatureReader(String) SignatureReader}). This
     * method is intended to be called on a {@link SignatureReader} that was
     * created using a <i>FieldTypeSignature</i>, such as the
     * <code>signature</code> parameter of the
     * {@link com.ziotic.asm.ClassVisitor#visitField
     * ClassVisitor.visitField} or {@link
     * com.ziotic.asm.MethodVisitor#visitLocalVariable
     * MethodVisitor.visitLocalVariable} methods.
     *
     * @param v the visitor that must visit this signature.
     */
    public void acceptType(final SignatureVisitor v) {
        parseType(this.signature, 0, v);
    }

    /**
     * Parses a field type signature and makes the given visitor visit it.
     *
     * @param signature a string containing the signature that must be parsed.
     * @param pos       index of the first character of the signature to parsed.
     * @param v         the visitor that must visit this signature.
     * @return the index of the first character after the parsed signature.
     */
    private static int parseType(final String signature, int pos, final SignatureVisitor v) {
        char c;
        int start, end;
        boolean visited, inner;
        String name;

        switch (c = signature.charAt(pos++)) {
            case 'Z':
            case 'C':
            case 'B':
            case 'S':
            case 'I':
            case 'F':
            case 'J':
            case 'D':
            case 'V':
                v.visitBaseType(c);
                return pos;

            case '[':
                return parseType(signature, pos, v.visitArrayType());

            case 'T':
                end = signature.indexOf(';', pos);
                v.visitTypeVariable(signature.substring(pos, end));
                return end + 1;

            default: // case 'L':
                start = pos;
                visited = false;
                inner = false;
                for (; ; ) {
                    switch (c = signature.charAt(pos++)) {
                        case '.':
                        case ';':
                            if (!visited) {
                                name = signature.substring(start, pos - 1);
                                if (inner) {
                                    v.visitInnerClassType(name);
                                } else {
                                    v.visitClassType(name);
                                }
                            }
                            if (c == ';') {
                                v.visitEnd();
                                return pos;
                            }
                            start = pos;
                            visited = false;
                            inner = true;
                            break;

                        case '<':
                            name = signature.substring(start, pos - 1);
                            if (inner) {
                                v.visitInnerClassType(name);
                            } else {
                                v.visitClassType(name);
                            }
                            visited = true;
                            top:
                            for (; ; ) {
                                switch (c = signature.charAt(pos)) {
                                    case '>':
                                        break top;
                                    case '*':
                                        ++pos;
                                        v.visitTypeArgument();
                                        break;
                                    case '+':
                                    case '-':
                                        pos = parseType(signature, pos + 1, v.visitTypeArgument(c));
                                        break;
                                    default:
                                        pos = parseType(signature, pos, v.visitTypeArgument('='));
                                        break;
                                }
                            }
                    }
                }
        }
    }
}
