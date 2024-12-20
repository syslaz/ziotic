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
package com.ziotic.jode.obfuscator.modules;

import java.util.*;

import com.ziotic.jode.obfuscator.*;

public class NameSwapper implements Renamer {
    private Random rand;
    private Set packs, clazzes, methods, fields, locals;

    public NameSwapper(boolean swapAll, long seed) {
        if (swapAll) {
            packs = clazzes = methods = fields = locals = new HashSet();
        } else {
            packs = new HashSet();
            clazzes = new HashSet();
            methods = new HashSet();
            fields = new HashSet();
            locals = new HashSet();
        }
    }

    public NameSwapper(boolean swapAll) {
        this(swapAll, System.currentTimeMillis());
    }

    private class NameGenerator implements Iterator {
        Collection pool;

        NameGenerator(Collection c) {
            pool = c;
        }

        public boolean hasNext() {
            return true;
        }

        public Object next() {
            int pos = rand.nextInt(pool.size());
            Iterator i = pool.iterator();
            while (pos > 0)
                i.next();
            return (String) i.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public final Collection getCollection(Identifier ident) {
        if (ident instanceof PackageIdentifier)
            return packs;
        else if (ident instanceof ClassIdentifier)
            return clazzes;
        else if (ident instanceof MethodIdentifier)
            return methods;
        else if (ident instanceof FieldIdentifier)
            return fields;
        else if (ident instanceof LocalIdentifier)
            return locals;
        else
            throw new IllegalArgumentException(ident.getClass().getName());
    }

    public final void addIdentifierName(Identifier ident) {
        getCollection(ident).add(ident.getName());
    }

    public Iterator generateNames(Identifier ident) {
        return new NameGenerator(getCollection(ident));
    }
}
