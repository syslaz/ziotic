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

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.ziotic.Static;

/**
 * @author Lazaro
 */
public class Configuration {
    private Map<String, Object> values = new HashMap<String, Object>();

    public Configuration(File file) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = null;
        while ((line = in.readLine()) != null) {
            if (line.startsWith("#")) {
                continue;
            }
            if (line.contains("=")) {
                String key = line.substring(0, line.indexOf("="));
                Object value = Static.parseString(line.substring(line.indexOf("=") + 1));
                try {
                    value = Integer.parseInt(value.toString());
                } catch (NumberFormatException ex) {
                }
                if (key.contains("[") && key.contains("]")) {
                    int index = Integer.parseInt(line.substring(line.indexOf("[") + 1, line.indexOf("]")));
                    key = key.substring(0, key.indexOf("["));
                    Object[] array = (Object[]) values.get(key);
                    array[index] = value;
                } else {
                    values.put(key, value);
                }
            } else if (line.startsWith("array") && line.contains("[") && line.contains("]")) {
                String key = line.substring(line.indexOf(" ") + 1, line.indexOf("["));
                int size = Integer.parseInt(line.substring(line.indexOf("[") + 1, line.indexOf("]")));
                Object[] array = new Object[size];
                values.put(key, array);
            }
        }
    }

    public Configuration(String file) throws IOException {
        this(new File(file));
    }

    public Object[] getArray(String key) {
        Object obj = values.get(key);
        if (obj instanceof Object[])
            return (Object[]) obj;
        return null;
    }

    public int getInt(String key) {
        Object value = values.get(key);
        if (value instanceof Integer)
            return (Integer) value;
        throw new RuntimeException("Requested variable, " + key + ", is not an integer or isn't available!");
    }

    public int[] getIntArray(String key) {
        return getIntArray(key, 0);
    }

    public int[] getIntArray(String key, int defaultValue) {
        Object obj = values.get(key);
        if (obj instanceof Object[]) {
            Object[] array = getArray(key);
            int[] intArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    intArray[i] = (Integer) array[i];
                } else {
                    intArray[i] = defaultValue;
                }
            }
            values.remove(key);
            values.put(key, intArray);
            return intArray;
        } else if (obj instanceof int[])
            return (int[]) obj;
        return null;
    }

    public String getString(String key) {
        Object obj = values.get(key);
        if (obj instanceof String || obj instanceof Integer)
            return obj.toString();
        return null;
    }

    public String[] getStringArray(String key) {
        Object obj = values.get(key);
        if (obj instanceof Object[]) {
            Object[] array = getArray(key);
            String[] stringArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    stringArray[i] = array[i].toString();
                }
            }
            values.remove(key);
            values.put(key, stringArray);
            return stringArray;
        } else if (obj instanceof String[])
            return (String[]) obj;
        return null;
    }
}
