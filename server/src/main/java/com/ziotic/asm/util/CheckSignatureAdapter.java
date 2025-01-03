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

import com.ziotic.asm.signature.SignatureVisitor;

/**
 * A {@link com.ziotic.asm.signature.SignatureVisitor} that checks that its methods are properly used.
 *
 * @author Eric Bruneton
 */
public class CheckSignatureAdapter implements SignatureVisitor {

    /**
     * Type to be used to check class signatures. See
     * {@link #CheckSignatureAdapter(int, SignatureVisitor) CheckSignatureAdapter}.
     */
    public static final int CLASS_SIGNATURE = 0;

    /**
     * Type to be used to check method signatures. See
     * {@link #CheckSignatureAdapter(int, SignatureVisitor) CheckSignatureAdapter}.
     */
    public static final int METHOD_SIGNATURE = 1;

    /**
     * Type to be used to check type signatures.See
     * {@link #CheckSignatureAdapter(int, SignatureVisitor) CheckSignatureAdapter}.
     */
    public static final int TYPE_SIGNATURE = 2;

    private static final int EMPTY = 1;

    private static final int FORMAL = 2;

    private static final int BOUND = 4;

    private static final int SUPER = 8;

    private static final int PARAM = 16;

    private static final int RETURN = 32;

    private static final int SIMPLE_TYPE = 64;

    private static final int CLASS_TYPE = 128;

    private static final int END = 256;

    /**
     * Type of the signature to be checked.
     */
    private final int type;

    /**
     * State of the automaton used to check the order of method calls.
     */
    private int state;

    /**
     * <tt>true</tt> if the checked type signature can be 'V'.
     */
    private boolean canBeVoid;

    /**
     * The visitor to which this adapter must delegate calls. May be
     * <tt>null</tt>.
     */
    private final SignatureVisitor sv;

    /**
     * Creates a new {@link CheckSignatureAdapter} object.
     *
     * @param type the type of signature to be checked. See
     *             {@link #CLASS_SIGNATURE}, {@link #METHOD_SIGNATURE} and
     *             {@link #TYPE_SIGNATURE}.
     * @param sv   the visitor to which this adapter must delegate calls. May be
     *             <tt>null</tt>.
     */
    public CheckSignatureAdapter(final int type, final SignatureVisitor sv) {
        this.type = type;
        this.state = EMPTY;
        this.sv = sv;
    }

    // class and method signatures

    public void visitFormalTypeParameter(final String name) {
        if (type == TYPE_SIGNATURE || (state != EMPTY && state != FORMAL && state != BOUND)) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkIdentifier(name, "formal type parameter");
        state = FORMAL;
        if (sv != null) {
            sv.visitFormalTypeParameter(name);
        }
    }

    public SignatureVisitor visitClassBound() {
        if (state != FORMAL) {
            throw new IllegalStateException();
        }
        state = BOUND;
        SignatureVisitor v = sv == null ? null : sv.visitClassBound();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    public SignatureVisitor visitInterfaceBound() {
        if (state != FORMAL && state != BOUND) {
            throw new IllegalArgumentException();
        }
        SignatureVisitor v = sv == null ? null : sv.visitInterfaceBound();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    // class signatures

    public SignatureVisitor visitSuperclass() {
        if (type != CLASS_SIGNATURE || (state & (EMPTY | FORMAL | BOUND)) == 0) {
            throw new IllegalArgumentException();
        }
        state = SUPER;
        SignatureVisitor v = sv == null ? null : sv.visitSuperclass();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    public SignatureVisitor visitInterface() {
        if (state != SUPER) {
            throw new IllegalStateException();
        }
        SignatureVisitor v = sv == null ? null : sv.visitInterface();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    // method signatures

    public SignatureVisitor visitParameterType() {
        if (type != METHOD_SIGNATURE || (state & (EMPTY | FORMAL | BOUND | PARAM)) == 0) {
            throw new IllegalArgumentException();
        }
        state = PARAM;
        SignatureVisitor v = sv == null ? null : sv.visitParameterType();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    public SignatureVisitor visitReturnType() {
        if (type != METHOD_SIGNATURE || (state & (EMPTY | FORMAL | BOUND | PARAM)) == 0) {
            throw new IllegalArgumentException();
        }
        state = RETURN;
        SignatureVisitor v = sv == null ? null : sv.visitReturnType();
        CheckSignatureAdapter cv = new CheckSignatureAdapter(TYPE_SIGNATURE, v);
        cv.canBeVoid = true;
        return cv;
    }

    public SignatureVisitor visitExceptionType() {
        if (state != RETURN) {
            throw new IllegalStateException();
        }
        SignatureVisitor v = sv == null ? null : sv.visitExceptionType();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    // type signatures

    public void visitBaseType(final char descriptor) {
        if (type != TYPE_SIGNATURE || state != EMPTY) {
            throw new IllegalStateException();
        }
        if (descriptor == 'V') {
            if (!canBeVoid) {
                throw new IllegalArgumentException();
            }
        } else {
            if ("ZCBSIFJD".indexOf(descriptor) == -1) {
                throw new IllegalArgumentException();
            }
        }
        state = SIMPLE_TYPE;
        if (sv != null) {
            sv.visitBaseType(descriptor);
        }
    }

    public void visitTypeVariable(final String name) {
        if (type != TYPE_SIGNATURE || state != EMPTY) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkIdentifier(name, "type variable");
        state = SIMPLE_TYPE;
        if (sv != null) {
            sv.visitTypeVariable(name);
        }
    }

    public SignatureVisitor visitArrayType() {
        if (type != TYPE_SIGNATURE || state != EMPTY) {
            throw new IllegalStateException();
        }
        state = SIMPLE_TYPE;
        SignatureVisitor v = sv == null ? null : sv.visitArrayType();
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    public void visitClassType(final String name) {
        if (type != TYPE_SIGNATURE || state != EMPTY) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkInternalName(name, "class name");
        state = CLASS_TYPE;
        if (sv != null) {
            sv.visitClassType(name);
        }
    }

    public void visitInnerClassType(final String name) {
        if (state != CLASS_TYPE) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkIdentifier(name, "inner class name");
        if (sv != null) {
            sv.visitInnerClassType(name);
        }
    }

    public void visitTypeArgument() {
        if (state != CLASS_TYPE) {
            throw new IllegalStateException();
        }
        if (sv != null) {
            sv.visitTypeArgument();
        }
    }

    public SignatureVisitor visitTypeArgument(final char wildcard) {
        if (state != CLASS_TYPE) {
            throw new IllegalStateException();
        }
        if ("+-=".indexOf(wildcard) == -1) {
            throw new IllegalArgumentException();
        }
        SignatureVisitor v = sv == null ? null : sv.visitTypeArgument(wildcard);
        return new CheckSignatureAdapter(TYPE_SIGNATURE, v);
    }

    public void visitEnd() {
        if (state != CLASS_TYPE) {
            throw new IllegalStateException();
        }
        state = END;
        if (sv != null) {
            sv.visitEnd();
        }
    }
}
