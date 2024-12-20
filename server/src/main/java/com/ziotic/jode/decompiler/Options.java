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

import com.ziotic.jode.bytecode.ClassInfo;
import com.ziotic.jode.bytecode.InnerClassInfo;

public class Options {
    public static final int TAB_SIZE_MASK = 0x0f;
    public static final int BRACE_AT_EOL = 0x10;
    public static final int BRACE_FLUSH_LEFT = 0x20;
    public static final int GNU_SPACING = 0x40;
    public static final int SUN_STYLE = 0x14;
    public static final int GNU_STYLE = 0x42;
    public static final int PASCAL_STYLE = 0x24;

    public static final int OPTION_LVT = 0x0001;
    public static final int OPTION_INNER = 0x0002;
    public static final int OPTION_ANON = 0x0004;
    public static final int OPTION_PUSH = 0x0008;
    public static final int OPTION_PRETTY = 0x0010;
    public static final int OPTION_DECRYPT = 0x0020;
    public static final int OPTION_ONETIME = 0x0040;
    public static final int OPTION_IMMEDIATE = 0x0080;
    public static final int OPTION_VERIFY = 0x0100;
    public static final int OPTION_CONTRAFO = 0x0200;

    public static int options = OPTION_LVT | OPTION_INNER | OPTION_ANON | OPTION_PRETTY | OPTION_DECRYPT | OPTION_VERIFY | OPTION_CONTRAFO;

    public static int outputStyle = SUN_STYLE;

    public final static boolean doAnonymous() {
        return (options & OPTION_ANON) != 0;
    }

    public final static boolean doInner() {
        return (options & OPTION_INNER) != 0;
    }

    public static boolean skipClass(ClassInfo clazz) {
        InnerClassInfo[] outers = clazz.getOuterClasses();
        if (outers != null) {
            if (outers[0].outer == null) {
                return doAnonymous();
            } else {
                return doInner();
            }
        }
        return false;
    }
}
