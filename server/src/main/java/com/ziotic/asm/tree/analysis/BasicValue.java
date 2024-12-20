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
package com.ziotic.asm.tree.analysis;

import com.ziotic.asm.Type;

/**
 * A {@link Value} that is represented by its type in a seven types type system.
 * This type system distinguishes the UNINITIALZED, INT, FLOAT, LONG, DOUBLE,
 * REFERENCE and RETURNADDRESS types.
 *
 * @author Eric Bruneton
 */
public class BasicValue implements Value {

    public static final Value UNINITIALIZED_VALUE = new BasicValue(null);

    public static final Value INT_VALUE = new BasicValue(Type.INT_TYPE);

    public static final Value FLOAT_VALUE = new BasicValue(Type.FLOAT_TYPE);

    public static final Value LONG_VALUE = new BasicValue(Type.LONG_TYPE);

    public static final Value DOUBLE_VALUE = new BasicValue(Type.DOUBLE_TYPE);

    public static final Value REFERENCE_VALUE = new BasicValue(Type.getObjectType("java/lang/Object"));

    public static final Value RETURNADDRESS_VALUE = new BasicValue(Type.VOID_TYPE);

    private final Type type;

    public BasicValue(final Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public int getSize() {
        return type == Type.LONG_TYPE || type == Type.DOUBLE_TYPE ? 2 : 1;
    }

    public boolean isReference() {
        return type != null && (type.getSort() == Type.OBJECT || type.getSort() == Type.ARRAY);
    }

    public boolean equals(final Object value) {
        if (value == this) {
            return true;
        } else if (value instanceof BasicValue) {
            if (type == null) {
                return ((BasicValue) value).type == null;
            } else {
                return type.equals(((BasicValue) value).type);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return type == null ? 0 : type.hashCode();
    }

    public String toString() {
        if (this == UNINITIALIZED_VALUE) {
            return ".";
        } else if (this == RETURNADDRESS_VALUE) {
            return "A";
        } else if (this == REFERENCE_VALUE) {
            return "R";
        } else {
            return type.getDescriptor();
        }
    }
}
