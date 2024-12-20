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

public class WildCard implements IdentifierMatcher, OptionHandler {

    String wildcard;
    int firstStar;

    public WildCard() {
    }

    public WildCard(String wild) {
        wildcard = wild;
        firstStar = wildcard.indexOf('*');
    }

    public void setOption(String option, Collection values) {
        if (option.equals("value")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Wildcard supports only one value.");
            wildcard = (String) values.iterator().next();
            firstStar = wildcard.indexOf('*');
        } else
            throw new IllegalArgumentException("Invalid option `" + option + "'.");
    }

    public String getNextComponent(Identifier ident) {
        String prefix = ident.getFullName();
        if (prefix.length() > 0)
            prefix += ".";

        int lastDot = prefix.length();
        if (!wildcard.startsWith(prefix))
            return null;

        int nextDot = wildcard.indexOf('.', lastDot);
        if (nextDot > 0 && (nextDot <= firstStar || firstStar == -1))
            return wildcard.substring(lastDot, nextDot);
        else if (firstStar == -1)
            return wildcard.substring(lastDot);
        else
            return null;
    }

    public boolean matchesSub(Identifier ident, String subident) {
        String prefix = ident.getFullName();
        if (prefix.length() > 0)
            prefix += ".";
        if (subident != null)
            prefix += subident;
        if (firstStar == -1 || firstStar >= prefix.length())
            return wildcard.startsWith(prefix);
        return prefix.startsWith(wildcard.substring(0, firstStar));
    }

    public boolean matches(Identifier ident) {
        String test = ident.getFullName();
        if (firstStar == -1) {
            if (wildcard.equals(test)) {
                return true;
            }
            return false;
        }
        if (!test.startsWith(wildcard.substring(0, firstStar)))
            return false;

        test = test.substring(firstStar);
        int lastWild = firstStar;
        int nextWild;
        while ((nextWild = wildcard.indexOf('*', lastWild + 1)) != -1) {
            String pattern = wildcard.substring(lastWild + 1, nextWild);
            while (!test.startsWith(pattern)) {
                if (test.length() == 0)
                    return false;
                test = test.substring(1);
            }
            test = test.substring(nextWild - lastWild - 1);
            lastWild = nextWild;
        }

        return test.endsWith(wildcard.substring(lastWild + 1));
    }

    public String toString() {
        return "Wildcard " + wildcard;
    }
}
