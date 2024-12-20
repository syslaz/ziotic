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
package com.ziotic.jode.obfuscator;

public interface IdentifierMatcher {
    /**
     * Returns true, if the ident is matched by this matcher.
     */
    public boolean matches(Identifier ident);

    /**
     * Returns true, if there may be a sub ident, that is matched by
     * this matcher.
     *
     * @param subIdent the name of the sub ident, or null if every
     *                 name is okay.
     */
    public boolean matchesSub(Identifier ident, String subIdent);

    /**
     * Returns the unique name of the single sub item, for which matches
     * or matchesSub returns true.
     *
     * @return the unique name, or null, if there is not a unique sub
     *         item.
     */
    public String getNextComponent(Identifier ident);
}
