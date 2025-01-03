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

import com.ziotic.jode.obfuscator.*;

public class StrongRenamer implements Renamer, OptionHandler {
    static String[] idents = {"Package", "Class", "Field", "Method", "Local"};
    static String[] parts = {"Start", "Part"};
    String charsets[][];

    String javaKeywords[] = {"abstract", "default", "if", "private", "throw", "boolean", "do", "implements", "protected", "throws", "break", "double", "import", "public", "transient", "byte", "else", "instanceof", "return", "try", "case", "extends", "int", "short", "void", "catch", "final", "interface", "static", "volatile", "char", "finally", "long", "super", "while", "class", "float", "native", "switch", "const", "for", "new", "synchronized", "continue", "goto", "package", "this", "strictfp", "null", "true", "false"};

    public StrongRenamer() {
        charsets = new String[idents.length][parts.length];
        for (int i = 0; i < idents.length; i++)
            for (int j = 0; j < parts.length; j++)
                charsets[i][j] = "abcdefghijklmnopqrstuvwxyz";
    }

    public void setOption(String option, Collection values) {
        if (option.startsWith("charset")) {
            Object value = values.iterator().next();
            if (values.size() != 1 || !(value instanceof String))
                throw new IllegalArgumentException("Only string parameter are supported.");
            String set = (String) value;
            String remOpt = option.substring("charset".length());
            int part = -1, ident = -1;
            if (remOpt.length() > 0) {
                for (int i = 0; i < idents.length; i++) {
                    if (remOpt.startsWith(idents[i])) {
                        remOpt = remOpt.substring(idents[i].length());
                        ident = i;
                        break;
                    }
                }
            }
            if (remOpt.length() > 0) {
                for (int j = 0; j < parts.length; j++) {
                    if (remOpt.startsWith(parts[j])) {
                        remOpt = remOpt.substring(parts[j].length());
                        part = j;
                        break;
                    }
                }
            }
            if (remOpt.length() > 0)
                throw new IllegalArgumentException("Invalid charset `" + option + "'");
            for (int i = 0; i < idents.length; i++) {
                if (ident >= 0 && ident != i)
                    continue;
                for (int j = 0; j < parts.length; j++) {
                    if (part >= 0 && part != j)
                        continue;
                    charsets[i][j] = set;
                }
            }
        } else
            throw new IllegalArgumentException("Invalid option `" + option + "'");
    }

    public Iterator generateNames(Identifier ident) {
        int identType;
        if (ident instanceof PackageIdentifier)
            identType = 0;
        else if (ident instanceof ClassIdentifier)
            identType = 1;
        else if (ident instanceof FieldIdentifier)
            identType = 2;
        else if (ident instanceof MethodIdentifier)
            identType = 3;
        else if (ident instanceof LocalIdentifier)
            identType = 4;
        else
            throw new IllegalArgumentException(ident.getClass().getName());
        final String[] theCharset = charsets[identType];

        return new Iterator() {
            char[] name = null;
            int headIndex;

            public boolean hasNext() {
                return true;
            }

            public Object next() {
                if (name == null) {
                    name = new char[]{theCharset[0].charAt(0)};
                    headIndex = 0;
                    return new String(name);
                }
                next_name:
                while (true) {
                    if (++headIndex < theCharset[0].length()) {
                        name[0] = theCharset[0].charAt(headIndex);
                        return new String(name);
                    }
                    headIndex = 0;
                    name[0] = theCharset[0].charAt(0);

                    String charset = theCharset[1];
                    for (int pos = 1; pos < name.length; pos++) {
                        int index = charset.indexOf(name[pos]) + 1;
                        if (index < charset.length()) {
                            name[pos] = charset.charAt(index);
                            return new String(name);
                        }
                        name[pos] = charset.charAt(0);
                    }

                    name = new char[name.length + 1];
                    name[0] = theCharset[0].charAt(0);
                    char firstCont = theCharset[1].charAt(0);
                    for (int i = 1; i < name.length; i++)
                        name[i] = firstCont;

                    String next = new String(name);
                    for (int i = 0; i < javaKeywords.length; i++) {
                        if (next.equals(javaKeywords[i]))
                            continue next_name;
                    }
                    return next;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
