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

import java.util.Collection;
import java.util.Iterator;

import com.ziotic.jode.obfuscator.Identifier;
import com.ziotic.jode.obfuscator.OptionHandler;
import com.ziotic.jode.obfuscator.Renamer;

public class KeywordRenamer implements Renamer, OptionHandler {
    String keywords[];
    Renamer backup;

    public KeywordRenamer() {
        keywords = new String[]{"if", "else", "for", "while", "throw", "return", "class", "interface", "implements", "extends", "instanceof", "new", "int", "boolean", "long", "float", "double", "short", "public", "protected", "private", "static", "synchronized", "strict", "transient", "abstract", "volatile", "final",
                /* Not really keywords, but very confusing anyway. */
                "Object", "String", "Thread", "Runnable", "StringBuffer", "Vector"};
        backup = new StrongRenamer();
    }

    public void setOption(String option, Collection values) {
        if (option.startsWith("keywords")) {
            keywords = (String[]) values.toArray(new String[values.size()]);
        } else if (option.startsWith("backup")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one backup is allowed");
            backup = (Renamer) values.iterator().next();
        } else
            throw new IllegalArgumentException("Invalid option `" + option + "'");
    }

    public Iterator generateNames(final Identifier ident) {
        return new Iterator() {
            int pos = 0;
            Iterator backing = null;

            public boolean hasNext() {
                return true;
            }

            public Object next() {
                if (pos < keywords.length)
                    return keywords[pos++];

                if (backing == null)
                    backing = backup.generateNames(ident);

                return backing.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
