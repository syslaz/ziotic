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
package com.ziotic.asm.commons;

import java.util.Collections;
import java.util.Comparator;

import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.asm.tree.TryCatchBlockNode;

/**
 * Sorts the exception handlers in a method innermost-to-outermost. This allows
 * the programmer to add handlers without worrying about ordering them correctly
 * with respect to existing, in-code handlers.
 * <p/>
 * Behavior is only defined for properly-nested handlers. If any "try" blocks
 * overlap (something that isn't possible in Java code) then this may not do
 * what you want. In fact, this adapter just sorts by the length of the "try"
 * block, taking advantage of the fact that a given try block must be larger
 * than any block it contains).
 *
 * @author Adrian Sampson
 */
public class TryCatchBlockSorter extends MethodNode {

    private final MethodVisitor mv;

    public TryCatchBlockSorter(final MethodVisitor mv, final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        super(access, name, desc, signature, exceptions);
        this.mv = mv;
    }

    public void visitEnd() {
        // Compares TryCatchBlockNodes by the length of their "try" block.
        Comparator comp = new Comparator() {

            public int compare(Object o1, Object o2) {
                int len1 = blockLength((TryCatchBlockNode) o1);
                int len2 = blockLength((TryCatchBlockNode) o2);
                return len1 - len2;
            }

            private int blockLength(TryCatchBlockNode block) {
                int startidx = instructions.indexOf(block.start);
                int endidx = instructions.indexOf(block.end);
                return endidx - startidx;
            }
        };
        Collections.sort(tryCatchBlocks, comp);
        if (mv != null) {
            accept(mv);
        }
    }
}
