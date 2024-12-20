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
package com.ziotic.jode.bytecode;

import java.util.Iterator;

import com.ziotic.jode.util.UnifyHash;

/**
 * This class represents a field or method reference.
 */
public class Reference {
    /**
     * A reference consists of a class name, a member name and a type.
     */
    private final String clazz, name, type;

    private static final UnifyHash unifier = new UnifyHash();

    public static Reference getReference(String className, String name, String type) {
        int hash = className.hashCode() ^ name.hashCode() ^ type.hashCode();
        Iterator iter = unifier.iterateHashCode(hash);
        while (iter.hasNext()) {
            Reference ref = (Reference) iter.next();
            if (ref.clazz.equals(className) && ref.name.equals(name) && ref.type.equals(type))
                return ref;
        }
        Reference ref = new Reference(className, name, type);
        unifier.put(hash, ref);
        return ref;
    }

    private Reference(String clazz, String name, String type) {
        this.clazz = clazz;
        this.name = name;
        this.type = type;
    }

    public String getClazz() {
        return clazz;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return clazz + " " + name + " " + type;
    }
}
