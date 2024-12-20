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

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import com.ziotic.asm.Type;

/**
 * A MAPPING from names to names, used to rename classes, fields and methods.
 *
 * @author Eric Bruneton
 */
public class NameMapping extends Properties {

    public final Set unused;

    public NameMapping(final String file) throws IOException {
        InputStream is = null;
        try {
            is = new BufferedInputStream(new FileInputStream(file));
            load(is);
            unused = new HashSet(keySet());
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public String map(final String name) {
        String s = (String) get(name);
        if (s == null) {
            int p = name.indexOf('.');
            if (p == -1) {
                s = name;
            } else {
                int q = name.indexOf('(');
                if (q == -1) {
                    s = name.substring(p + 1);
                } else {
                    s = name.substring(p + 1, q);
                }
            }
        } else {
            unused.remove(name);
        }
        return s;
    }

    public String fix(final String desc) {
        if (desc.startsWith("(")) {
            Type[] arguments = Type.getArgumentTypes(desc);
            Type result = Type.getReturnType(desc);
            for (int i = 0; i < arguments.length; ++i) {
                arguments[i] = fix(arguments[i]);
            }
            result = fix(result);
            return Type.getMethodDescriptor(result, arguments);
        } else {
            return fix(Type.getType(desc)).getDescriptor();
        }
    }

    private Type fix(final Type t) {
        if (t.getSort() == Type.OBJECT) {
            return Type.getObjectType(map(t.getInternalName()));
        } else if (t.getSort() == Type.ARRAY) {
            String s = fix(t.getElementType()).getDescriptor();
            for (int i = 0; i < t.getDimensions(); ++i) {
                s = '[' + s;
            }
            return Type.getType(s);
        } else {
            return t;
        }
    }
}
