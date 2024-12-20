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

import com.ziotic.jode.obfuscator.Identifier;
import com.ziotic.jode.obfuscator.IdentifierMatcher;
import com.ziotic.jode.obfuscator.OptionHandler;

public class MultiIdentifierMatcher implements IdentifierMatcher, OptionHandler {
    /**
     * Useful constant for giving to the constructor.
     */
    public static boolean OR = true;
    /**
     * Useful constant for giving to the constructor.
     */
    public static boolean AND = false;

    IdentifierMatcher[] matchers;
    boolean isOr;

    /**
     * Create an empty MultiIdentifierMatcher.
     */
    public MultiIdentifierMatcher() {
        this.matchers = new IdentifierMatcher[0];
    }

    /**
     * Create an IdentifierMatcher out of other matchers.
     *
     * @param isOr     if true, match should return the logical (shortcut)
     *                 or of the underlying matchers, if false it returns the logical and.
     * @param matchers the underlying matchers
     */
    public MultiIdentifierMatcher(boolean isOr, IdentifierMatcher[] matchers) {
        this.isOr = isOr;
        this.matchers = matchers;
    }

    public void setOption(String option, Collection values) {
        if (option.equals("or")) {
            isOr = true;
            matchers = (IdentifierMatcher[]) values.toArray(new IdentifierMatcher[values.size()]);
        } else if (option.equals("and")) {
            isOr = false;
            matchers = (IdentifierMatcher[]) values.toArray(new IdentifierMatcher[values.size()]);
        } else
            throw new IllegalArgumentException("Invalid option `" + option + "'.");
    }

    public boolean matches(Identifier ident) {
        for (int i = 0; i < matchers.length; i++) {
            if (matchers[i].matches(ident) == isOr)
                return isOr;
        }
        return !isOr;
    }

    public boolean matchesSub(Identifier ident, String name) {
        for (int i = 0; i < matchers.length; i++) {
            if (matchers[i].matchesSub(ident, name) == isOr)
                return isOr;
        }
        return !isOr;
    }

    public String getNextComponent(Identifier ident) {
        if (isOr == AND) {
            for (int i = 0; i < matchers.length; i++) {
                String next = matchers[i].getNextComponent(ident);
                if (next != null && matchesSub(ident, next))
                    return next;
            }
            return null;
        }
        // OR case
        String next = null;
        for (int i = 0; i < matchers.length; i++) {
            if (!matchesSub(ident, null))
                continue;
            if (next != null && !matchers[i].getNextComponent(ident).equals(next))
                return null;
            next = matchers[i].getNextComponent(ident);
            if (next == null)
                return null;
        }
        return next;
    }
}
