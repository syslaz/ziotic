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
package com.ziotic.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lazaro
 */
public class Attributes {
    private Map<Object, Object> attributes = new HashMap<Object, Object>();

    /**
     * Gets an attribute from the attribute map based upon the key specified.
     *
     * @param key The key to retrieve the value.
     * @param <T> The type of the value.
     * @return The value.
     */
    @SuppressWarnings("unchecked")
    public <T> T get(Object key) {
        return (T) attributes.get(key);
    }


    @SuppressWarnings("unchecked")
    public <T> T get(Object key, T fail) {
        T value = (T) attributes.get(key);
        if (value == null) {
            return fail;
        }
        return value;
    }

    /**
     * Gets a byte from the attribute map.
     *
     * @param key The key of the attribute to retrieve the value back later.
     * @return The value.
     */
    public byte getByte(Object key) {
        Number n = get(key);
        if (n == null) {
            return (byte) 0;
        }
        return n.byteValue();
    }

    /**
     * Gets a double from the attribute map.
     *
     * @param key The key of the attribute to retrieve the value back later.
     * @return The value.
     */
    public double getDouble(Object key) {
        Number n = get(key);
        if (n == null) {
            return (double) 0;
        }
        return n.doubleValue();
    }

    /**
     * Gets a integer from the attribute map.
     *
     * @param key The key of the attribute to retrieve the value back later.
     * @return The value.
     */
    public int getInt(Object key) {
        Number n = get(key);
        if (n == null) {
            return (int) 0;
        }
        return n.intValue();
    }

    /**
     * Gets a long from the attribute map.
     *
     * @param key The key of the attribute to retrieve the value back later.
     * @return The value.
     */
    public long getLong(Object key) {
        Number n = get(key);
        if (n == null) {
            return (long) 0;
        }
        return n.longValue();
    }

    /**
     * Gets a short from the attribute map.
     *
     * @param key The key of the attribute to retrieve the value back later.
     * @return The value.
     */
    public short getShort(Object key) {
        Number n = get(key);
        if (n == null) {
            return (short) 0;
        }
        return n.shortValue();
    }

    /**
     * Gets a boolean from the attribute map.
     *
     * @param key The key of the attribute to retrieve the value back later.
     * @return The value.
     */
    public boolean is(Object key) {
        Boolean b = get(key);
        if (b == null) {
            return false;
        }
        return b;
    }

    /**
     * Sets an attribute.
     *
     * @param key   The key of the attribute to retrieve the value back later.
     * @param value The value to set.
     */
    public void set(Object key, Object value) {
        attributes.put(key, value);
    }

    /**
     * If an attribute is set.
     *
     * @param key The attribute key.
     */
    public boolean isSet(Object key) {
        return attributes.containsKey(key);
    }

    /**
     * Un-sets an attribute.
     *
     * @param key The key of the attribute to un-set.
     */
    public void unSet(Object key) {
        attributes.remove(key);
    }
}
