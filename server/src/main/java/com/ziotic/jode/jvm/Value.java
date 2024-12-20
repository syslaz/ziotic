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
package com.ziotic.jode.jvm;

/**
 * This class represents a stack value.
 *
 * @author Jochen Hoenicke
 */
class Value {
    Object value;
    NewObject newObj;

    public Value() {
    }

    public void setObject(Object obj) {
        newObj = null;
        value = obj;
    }

    public Object objectValue() {
        if (newObj != null)
            return newObj.objectValue();
        return value;
    }

    public void setInt(int i) {
        newObj = null;
        value = new Integer(i);
    }

    public int intValue() {
        return ((Integer) value).intValue();
    }

    public void setLong(long i) {
        newObj = null;
        value = new Long(i);
    }

    public long longValue() {
        return ((Long) value).longValue();
    }

    public void setFloat(float i) {
        newObj = null;
        value = new Float(i);
    }

    public float floatValue() {
        return ((Float) value).floatValue();
    }

    public void setDouble(double i) {
        newObj = null;
        value = new Double(i);
    }

    public double doubleValue() {
        return ((Double) value).doubleValue();
    }

    public void setNewObject(NewObject n) {
        newObj = n;
    }

    public NewObject getNewObject() {
        return newObj;
    }

    public void setValue(Value val) {
        value = val.value;
        newObj = val.newObj;
    }

    public String toString() {
        return newObj != null ? newObj.toString() : "" + value;
    }
}
