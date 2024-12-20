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

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * This is a very simple map, using a set as backing.
 * The default backing set is a simple set, but you can specify any other
 * set of Map.Entry in the constructor.
 */
public class SimpleMap extends AbstractMap {
    private Set backing;

    public SimpleMap() {
        backing = new SimpleSet();
    }

    public SimpleMap(int initialCapacity) {
        backing = new SimpleSet(initialCapacity);
    }

    public SimpleMap(Set fromSet) {
        backing = fromSet;
    }

    public Set entrySet() {
        return backing;
    }

    public static class SimpleEntry implements Map.Entry {
        Object key;
        Object value;

        public SimpleEntry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Object setValue(Object newValue) {
            Object old = value;
            value = newValue;
            return old;
        }

        public int hashCode() {
            return key.hashCode() ^ value.hashCode();
        }

        public boolean equals(Object o) {
            if (o instanceof Map.Entry) {
                Map.Entry e = (Map.Entry) o;
                return key.equals(e.getKey()) && value.equals(e.getValue());
            }
            return false;
        }
    }

    public Object put(Object key, Object value) {
        for (Iterator i = backing.iterator(); i.hasNext(); ) {
            Map.Entry entry = (Map.Entry) i.next();
            if (key.equals(entry.getKey()))
                return entry.setValue(value);
        }
        backing.add(new SimpleEntry(key, value));
        return null;
    }
}
