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
package com.ziotic.jode.type;

/**
 * This class represents the NullType.  The null type is special as it
 * may only occur as top type in a range type.  It represents the type
 * of the null constant, which may be casted to any object. <br>
 * <p/>
 * Question: Should we replace tUObject = tRange(tObject, tNull) by tNull?
 * Question2: if not, should null have type tNull?
 *
 * @author Jochen Hoenicke
 */
public class NullType extends ReferenceType {
    public NullType() {
        super(TC_NULL);
    }

    public Type getSubType() {
        return this;
    }

    public Type createRangeType(ReferenceType bottomType) {
        return tRange(bottomType, this);
    }

    /**
     * Returns the generalized type of this and type.  We have two
     * classes and multiple interfaces.  The result should be the
     * object that is the the super class of both objects and all
     * interfaces, that one class or interface of each type
     * implements.
     */
    public Type getGeneralizedType(Type type) {
        if (type.typecode == TC_RANGE)
            type = ((RangeType) type).getTop();
        return type;
    }

    /**
     * Returns the specialized type of this and type.
     * We have two classes and multiple interfaces.  The result
     * should be the object that extends both objects
     * and the union of all interfaces.
     */
    public Type getSpecializedType(Type type) {
        if (type.typecode == TC_RANGE)
            type = ((RangeType) type).getBottom();
        return type;
    }

    public String toString() {
        return "tNull";
    }
}
