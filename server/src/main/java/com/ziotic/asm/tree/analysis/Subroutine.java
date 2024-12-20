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
package com.ziotic.asm.tree.analysis;

import java.util.ArrayList;
import java.util.List;

import com.ziotic.asm.tree.JumpInsnNode;
import com.ziotic.asm.tree.LabelNode;

/**
 * A method subroutine (corresponds to a JSR instruction).
 *
 * @author Eric Bruneton
 */
class Subroutine {

    LabelNode start;

    boolean[] access;

    List callers;

    private Subroutine() {
    }

    Subroutine(final LabelNode start, final int maxLocals, final JumpInsnNode caller) {
        this.start = start;
        this.access = new boolean[maxLocals];
        this.callers = new ArrayList();
        callers.add(caller);
    }

    public Subroutine copy() {
        Subroutine result = new Subroutine();
        result.start = start;
        result.access = new boolean[access.length];
        System.arraycopy(access, 0, result.access, 0, access.length);
        result.callers = new ArrayList(callers);
        return result;
    }

    public boolean merge(final Subroutine subroutine) throws AnalyzerException {
        boolean changes = false;
        for (int i = 0; i < access.length; ++i) {
            if (subroutine.access[i] && !access[i]) {
                access[i] = true;
                changes = true;
            }
        }
        if (subroutine.start == start) {
            for (int i = 0; i < subroutine.callers.size(); ++i) {
                Object caller = subroutine.callers.get(i);
                if (!callers.contains(caller)) {
                    callers.add(caller);
                    changes = true;
                }
            }
        }
        return changes;
    }
}