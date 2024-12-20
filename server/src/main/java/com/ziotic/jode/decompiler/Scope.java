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
package com.ziotic.jode.decompiler;

/**
 * This interface describes a scope.  The basic scopes are: the package
 * scope, the class scope (one more for each inner class) and the method
 * scope.
 *
 * @author Jochen Hoenicke
 */
public interface Scope {
    public final int PACKAGENAME = 0;
    public final int CLASSNAME = 1;
    public final int METHODNAME = 2;
    public final int FIELDNAME = 3;
    public final int AMBIGUOUSNAME = 4;
    public final int LOCALNAME = 5;

    public final int NOSUPERMETHODNAME = 12;
    public final int NOSUPERFIELDNAME = 13;

    public final int CLASSSCOPE = 1;
    public final int METHODSCOPE = 2;

    /**
     * Simplifies the given name.
     * @param name the name to simplify.
     * @param usageType the context of this name.
     * @return null if the name hasn't a simplification in current
     * scope, the simplified name otherwise.
     */
    /**
     * Tells if this is the scope of name
     */
    public boolean isScopeOf(Object object, int scopeType);

    public boolean conflicts(String name, int usageType);
}
