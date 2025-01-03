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

import com.ziotic.jode.AssertError;
import com.ziotic.jode.GlobalOptions;

/**
 * This class represents a set of reference types.  The set contains
 * all types that are castable to all the bottom types by a widening
 * cast and to which one of the top types can be casted to by a
 * widening cast. <br>
 * <p/>
 * For a totally unknown reference type bottomType is tObject and
 * topType is tNull.  The bottomType is always guaranteed to be not
 * tNull.  And all topTypes must be castable to all bottom types with
 * a widening cast. <br>
 * <p/>
 * To do intersection on range types, the reference types need three
 * more operations: specialization, generalization and
 * createRange. <p>
 * <p/>
 * specialization chooses all common sub type of two types.  It is
 * used to find the bottom of the intersected interval. <p>
 * <p/>
 * generalization chooses the common super type of two types. It
 * is used to find the top of the intersected interval. <p>
 * <p/>
 * When the new interval is created with <code>createRangeType</code>
 * the bottom and top are adjusted so that they only consists of
 * possible types.  It then decides, if it needs a range type, or if
 * the reference types already represents all types.
 *
 * @author Jochen Hoenicke
 * @date 98/08/06
 * @see ReferenceType
 */
public class RangeType extends Type {
    /**
     * The bottom type set.  It is special in that its interpretation
     * depends on what ReferenceType class it implements:
     * <p/>
     * <dl>
     * <dt>ClassInterfacesType</dt>
     * <dd>All types in this range must be widening castable to all interfaces
     * and to the class in the bottomType</dd>
     * <dt>ArrayType</dt>
     * <dd>All types in this range must be of the bottomType, or the
     * NullType.</dd>
     * <dt>NullType</dt>
     * <dd>not allowed</dd>
     * </dl>
     */
    final ReferenceType bottomType;
    /**
     * The top type set.  For each type in this range type, there is a
     * top type, that can be casted to this type.
     */
    final ReferenceType topType;

    /**
     * Create a new range type with the given bottom and top set.
     */
    public RangeType(ReferenceType bottomType, ReferenceType topType) {
        super(TC_RANGE);
        if (bottomType == tNull)
            throw new com.ziotic.jode.AssertError("bottom is NULL");
        this.bottomType = bottomType;
        this.topType = topType;
    }

    /**
     * Returns the bottom type set.  All types in this range type can
     * be casted to all bottom types by a widening cast.
     *
     * @return the bottom type set
     */
    public ReferenceType getBottom() {
        return bottomType;
    }

    /**
     * Returns the top type set.  For each type in this range type,
     * there is a top type, that can be casted to this type.
     *
     * @return the top type set
     */
    public ReferenceType getTop() {
        return topType;
    }

    /**
     * Returns the hint type of this range type set.  This returns the
     * singleton set containing only the first top type, except if it
     * is null and there is a unique bottom type, in which case it
     * returns the bottom type.
     *
     * @return the hint type.
     */
    public Type getHint() {
        Type bottomHint = bottomType.getHint();
        Type topHint = topType.getHint();

        if (topType == tNull && bottomType.equals(bottomHint))
            return bottomHint;

        return topHint;
    }

    /**
     * Returns the canonic type of this range type set.  This returns the
     * singleton set containing only the first top type.
     *
     * @return the canonic type.
     */
    public Type getCanonic() {
        return topType.getCanonic();
    }

    /**
     * The set of super types of this type.  This is the set of
     * super types of the top type.
     *
     * @return the set of super types.
     */
    public Type getSuperType() {
        return topType.getSuperType();
    }

    /**
     * The set of sub types of this type.  This is the set of
     * sub types of the bottom types.
     *
     * @return the set of super types.
     */
    public Type getSubType() {
        return tRange(bottomType, tNull);
    }

    /**
     * Checks if we need to cast to a middle type, before we can cast from
     * fromType to this type.
     *
     * @return the middle type, or null if it is not necessary.
     */
    public Type getCastHelper(Type fromType) {
        return topType.getCastHelper(fromType);
    }

    public String getTypeSignature() {
        if (topType.isClassType() || !bottomType.isValidType())
            return topType.getTypeSignature();
        else
            return bottomType.getTypeSignature();
    }

    public Class getTypeClass() throws ClassNotFoundException {
        if (topType.isClassType() || !bottomType.isValidType())
            return topType.getTypeClass();
        else
            return bottomType.getTypeClass();
    }

    public String toString() {
        return "<" + bottomType + "-" + topType + ">";
    }

    public String getDefaultName() {
        throw new AssertError("getDefaultName() called on range");
    }

    public int hashCode() {
        int hashcode = topType.hashCode();
        return (hashcode << 16 | hashcode >>> 16) ^ bottomType.hashCode();
    }

    public boolean equals(Object o) {
        if (o instanceof RangeType) {
            RangeType type = (RangeType) o;
            return topType.equals(type.topType) && bottomType.equals(type.bottomType);
        }
        return false;
    }

    /**
     * Intersect this type with another type and return the new type.
     *
     * @param type the other type.
     * @return the intersection, or tError, if a type conflict happens.
     */
    public Type intersection(Type type) {
        if (type == tError)
            return type;
        if (type == Type.tUnknown)
            return this;

        Type top, bottom, result;
        bottom = bottomType.getSpecializedType(type);
        top = topType.getGeneralizedType(type);
        if (top.equals(bottom))
            result = top;
        else if (top instanceof ReferenceType && bottom instanceof ReferenceType)
            result = ((ReferenceType) top).createRangeType((ReferenceType) bottom);
        else
            result = tError;

        if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_TYPES) != 0) {
            GlobalOptions.err.println("intersecting " + this + " and " + type + " to " + result);
        }
        return result;
    }
}
