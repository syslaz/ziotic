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
package com.ziotic.asm.util;

import java.util.Map;

/**
 * An attribute that can print the ASM code to create an equivalent attribute.
 * <p/>
 * Implementation should print the ASM code that generates attribute data
 * structures for current attribute state.
 *
 * @author Eugene Kuleshov
 */
public interface ASMifiable {

    /**
     * Prints the ASM code to create an attribute equal to this attribute.
     *
     * @param buf        A buffer used for printing Java code.
     * @param varName    name of the variable in a printed code used to store
     *                   attribute instance.
     * @param labelNames map of label instances to their names.
     */
    void asmify(StringBuffer buf, String varName, Map labelNames);
}
