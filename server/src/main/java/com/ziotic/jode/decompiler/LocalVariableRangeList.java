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

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.type.Type;

public class LocalVariableRangeList {

    LocalVarEntry list = null;

    LocalVariableRangeList() {
    }

    private void add(LocalVarEntry li) {
        LocalVarEntry prev = null;
        LocalVarEntry next = list;
        while (next != null && next.endAddr < li.startAddr) {
            prev = next;
            next = next.next;
        }
        /* prev.endAddr < li.startAddr <= next.endAddr
       */
        if (next != null && li.endAddr >= next.startAddr) {
            if (next.type.equals(li.type) && next.name.equals(li.name)) {
                /* Same type, same name and overlapping range.
             * This is the same local: extend next to the common
             * range and don't add li.
             */
                next.startAddr = Math.min(next.startAddr, li.startAddr);
                next.endAddr = Math.max(next.endAddr, li.endAddr);
                return;
            }
            GlobalOptions.err.println("warning: non disjoint locals");
        }
        li.next = next;
        if (prev == null)
            list = li;
        else
            prev.next = li;
    }

    private LocalVarEntry find(int addr) {
        LocalVarEntry li = list;
        while (li != null && li.endAddr < addr)
            li = li.next;
        if (li == null || li.startAddr > addr) {
            return null;
        }
        return li;
    }

    public void addLocal(int startAddr, int endAddr, String name, Type type) {
        LocalVarEntry li = new LocalVarEntry(startAddr, endAddr, name, type);
        add(li);
    }

    public LocalVarEntry getInfo(int addr) {
        return find(addr);
    }
}
