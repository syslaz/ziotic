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
package com.ziotic.jode.util;

import java.util.AbstractSet;
import java.util.Iterator;

public class SimpleSet extends AbstractSet implements Cloneable {
    Object[] elementObjects;
    int count = 0;

    public SimpleSet() {
        this(2);
    }

    public SimpleSet(int initialSize) {
        elementObjects = new Object[initialSize];
    }

    public int size() {
        return count;
    }

    public boolean add(Object element) {
        if (element == null)
            throw new NullPointerException();

        for (int i = 0; i < count; i++) {
            if (element.equals(elementObjects[i]))
                return false;
        }

        if (count == elementObjects.length) {
            Object[] newArray = new Object[(count + 1) * 3 / 2];
            System.arraycopy(elementObjects, 0, newArray, 0, count);
            elementObjects = newArray;
        }
        elementObjects[count++] = element;
        return true;
    }

    public Object clone() {
        try {
            SimpleSet other = (SimpleSet) super.clone();
            other.elementObjects = (Object[]) elementObjects.clone();
            return other;
        } catch (CloneNotSupportedException ex) {
            throw new com.ziotic.jode.AssertError("Clone?");
        }
    }

    public Iterator iterator() {
        return new Iterator() {
            int pos = 0;

            public boolean hasNext() {
                return pos < count;
            }

            public Object next() {
                return elementObjects[pos++];
            }

            public void remove() {
                if (pos < count)
                    System.arraycopy(elementObjects, pos, elementObjects, pos - 1, count - pos);
                count--;
                pos--;
            }
        };
    }
}
