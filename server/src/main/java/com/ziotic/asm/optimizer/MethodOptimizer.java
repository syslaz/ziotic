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
package com.ziotic.asm.optimizer;

import com.ziotic.asm.AnnotationVisitor;
import com.ziotic.asm.Attribute;
import com.ziotic.asm.Label;
import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.commons.Remapper;
import com.ziotic.asm.commons.RemappingMethodAdapter;

/**
 * A {@link com.ziotic.asm.MethodAdapter} that renames fields and methods, and removes debug
 * info.
 *
 * @author Eugene Kuleshov
 */
public class MethodOptimizer extends RemappingMethodAdapter {

    public MethodOptimizer(int access, String desc, MethodVisitor mv, Remapper remapper) {
        super(access, desc, mv, remapper);
    }

    // ------------------------------------------------------------------------
    // Overridden methods
    // ------------------------------------------------------------------------

    public AnnotationVisitor visitAnnotationDefault() {
        // remove annotations
        return null;
    }

    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
        // remove annotations
        return null;
    }

    public void visitLocalVariable(final String name, final String desc, final String signature, final Label start, final Label end, final int index) {
        // remove debug info
    }

    public void visitLineNumber(final int line, final Label start) {
        // remove debug info
    }

    public void visitFrame(int type, int local, Object[] local2, int stack, Object[] stack2) {
        // remove frame info
    }

    public void visitAttribute(Attribute attr) {
        // remove non standard attributes
    }
}
