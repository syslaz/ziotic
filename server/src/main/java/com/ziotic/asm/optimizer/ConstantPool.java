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
package com.ziotic.asm.optimizer;

import java.util.HashMap;

import com.ziotic.asm.Type;

/**
 * A constant pool.
 *
 * @author Eric Bruneton
 */
public class ConstantPool extends HashMap {

    private final Constant key1 = new Constant();

    private final Constant key2 = new Constant();

    private final Constant key3 = new Constant();

    public Constant newInteger(final int value) {
        key1.set(value);
        Constant result = get(key1);
        if (result == null) {
            result = new Constant(key1);
            put(result);
        }
        return result;
    }

    public Constant newFloat(final float value) {
        key1.set(value);
        Constant result = get(key1);
        if (result == null) {
            result = new Constant(key1);
            put(result);
        }
        return result;
    }

    public Constant newLong(final long value) {
        key1.set(value);
        Constant result = get(key1);
        if (result == null) {
            result = new Constant(key1);
            put(result);
        }
        return result;
    }

    public Constant newDouble(final double value) {
        key1.set(value);
        Constant result = get(key1);
        if (result == null) {
            result = new Constant(key1);
            put(result);
        }
        return result;
    }

    public Constant newUTF8(final String value) {
        key1.set('s', value, null, null);
        Constant result = get(key1);
        if (result == null) {
            result = new Constant(key1);
            put(result);
        }
        return result;
    }

    private Constant newString(final String value) {
        key2.set('S', value, null, null);
        Constant result = get(key2);
        if (result == null) {
            newUTF8(value);
            result = new Constant(key2);
            put(result);
        }
        return result;
    }

    public Constant newClass(final String value) {
        key2.set('C', value, null, null);
        Constant result = get(key2);
        if (result == null) {
            newUTF8(value);
            result = new Constant(key2);
            put(result);
        }
        return result;
    }

    public Constant newConst(final Object cst) {
        if (cst instanceof Integer) {
            int val = ((Integer) cst).intValue();
            return newInteger(val);
        } else if (cst instanceof Float) {
            float val = ((Float) cst).floatValue();
            return newFloat(val);
        } else if (cst instanceof Long) {
            long val = ((Long) cst).longValue();
            return newLong(val);
        } else if (cst instanceof Double) {
            double val = ((Double) cst).doubleValue();
            return newDouble(val);
        } else if (cst instanceof String) {
            return newString((String) cst);
        } else if (cst instanceof Type) {
            Type t = (Type) cst;
            return newClass(t.getSort() == Type.OBJECT ? t.getInternalName() : t.getDescriptor());
        } else {
            throw new IllegalArgumentException("value " + cst);
        }
    }

    public Constant newField(final String owner, final String name, final String desc) {
        key3.set('G', owner, name, desc);
        Constant result = get(key3);
        if (result == null) {
            newClass(owner);
            newNameType(name, desc);
            result = new Constant(key3);
            put(result);
        }
        return result;
    }

    public Constant newMethod(final String owner, final String name, final String desc, final boolean itf) {
        key3.set(itf ? 'N' : 'M', owner, name, desc);
        Constant result = get(key3);
        if (result == null) {
            newClass(owner);
            newNameType(name, desc);
            result = new Constant(key3);
            put(result);
        }
        return result;
    }

    public Constant newNameType(final String name, final String desc) {
        key2.set('T', name, desc, null);
        Constant result = get(key2);
        if (result == null) {
            newUTF8(name);
            newUTF8(desc);
            result = new Constant(key2);
            put(result);
        }
        return result;
    }

    private Constant get(final Constant key) {
        return (Constant) get((Object) key);
    }

    private void put(final Constant cst) {
        put(cst, cst);
    }
}