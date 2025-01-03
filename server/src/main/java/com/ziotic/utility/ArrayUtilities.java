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

import java.lang.reflect.Array;

/**
 * @author Lazaro
 */
public class ArrayUtilities {
    public static int[] newIntArray(int size, int defaultValue) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = defaultValue;
        }
        return array;
    }

    public static byte[] primitive(Byte[] bytes) {
        byte[] pBytes = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            pBytes[i] = bytes[i];
        }
        return pBytes;
    }

    public static double[] primitive(Double[] doubles) {
        double[] pDoubles = new double[doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            pDoubles[i] = doubles[i];
        }
        return pDoubles;
    }

    public static int[] primitive(Integer[] integers) {
        int[] pIntegers = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {
            pIntegers[i] = integers[i];
        }
        return pIntegers;
    }

    public static short[] primitive(Short[] shorts) {
        short[] pShorts = new short[shorts.length];
        for (int i = 0; i < shorts.length; i++) {
            pShorts[i] = shorts[i];
        }
        return pShorts;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] toArray(String string, T[] a) {
        if (string.length() == 0) {
            return a;
        }
        String[] stringObjs = string.replace(";;", "\u1024").split(";");
        T[] r = a;
        if (stringObjs.length > r.length) {
            r = (T[]) Array.newInstance(a.getClass().getComponentType(), stringObjs.length);
        }
        for (int i = 0; i < stringObjs.length; i++) {
            stringObjs[i] = stringObjs[i].replace("\u1024", ";");
            if (a.getClass().getComponentType().isAssignableFrom(Integer.class)) {
                r[i] = (T) (Integer) Integer.parseInt(stringObjs[i]);
            } else if (a.getClass().getComponentType().isAssignableFrom(Short.class)) {
                r[i] = (T) (Short) Short.parseShort(stringObjs[i]);
            } else if (a.getClass().getComponentType().isAssignableFrom(Byte.class)) {
                r[i] = (T) (Byte) Byte.parseByte(stringObjs[i]);
            } else if (a.getClass().getComponentType().isAssignableFrom(Double.class)) {
                r[i] = (T) (Double) Double.parseDouble(stringObjs[i]);
            } else if (a.getClass().getComponentType().isAssignableFrom(String.class)) {
                r[i] = (T) stringObjs[i];
            } else {
                throw new UnsupportedOperationException("Cannot convert type : " + a.getClass().getComponentType().getName());
            }
        }
        return r;
    }

    public static String toString(Object array) {
        int len = Array.getLength(array);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            Object obj = Array.get(array, i);
            if (obj == null) {
                sb.append("null");
            } else {
                sb.append(obj.toString().replace(";", ";;"));
            }
            if (i != len - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static <T> int searchArray(T[] a, T key) {
        for (int i = 0; i < a.length; i++) {
            T t = a[i];
            if (t == key) {
                return i;
            }
        }
        return -1;
    }
}
