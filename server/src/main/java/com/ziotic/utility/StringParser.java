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
package com.ziotic.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lazaro
 */
public class StringParser {
    private Map<String, Object> variableValues = new HashMap<String, Object>();

    public void registerVariable(String variableName, Object variableValue) {
        variableValues.put(variableName, variableValue);
    }

    public void unregisterVariable(String variableName) {
        variableValues.remove(variableName);
    }

    public Object getVariable(String variableName) {
        return variableValues.get(variableName);
    }

    public String parseString(String string) {
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '\\') {
                i++;
                sb.append(chars[i]);
            } else if (c == '%') {
                StringBuilder varNameBuilder = new StringBuilder();
                for (int x = i + 1; x < chars.length; x++) {
                    char c2 = chars[x];
                    if (c2 == '%') {
                        break;
                    }
                    varNameBuilder.append(c2);
                }
                String varName = varNameBuilder.toString();
                sb.append(getVariable(varName).toString());
                i += varName.length() + 1;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
