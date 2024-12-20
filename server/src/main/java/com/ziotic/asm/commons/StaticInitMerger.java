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

import com.ziotic.asm.ClassAdapter;
import com.ziotic.asm.ClassVisitor;
import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.Opcodes;

/**
 * A {@link ClassAdapter} that merges clinit methods into a single one.
 *
 * @author Eric Bruneton
 */
public class StaticInitMerger extends ClassAdapter {

    private String name;

    private MethodVisitor clinit;

    private final String prefix;

    private int counter;

    public StaticInitMerger(final String prefix, final ClassVisitor cv) {
        super(cv);
        this.prefix = prefix;
    }

    public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
        cv.visit(version, access, name, signature, superName, interfaces);
        this.name = name;
    }

    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        MethodVisitor mv;
        if ("<clinit>".equals(name)) {
            int a = Opcodes.ACC_PRIVATE + Opcodes.ACC_STATIC;
            String n = prefix + counter++;
            mv = cv.visitMethod(a, n, desc, signature, exceptions);

            if (clinit == null) {
                clinit = cv.visitMethod(a, name, desc, null, null);
            }
            clinit.visitMethodInsn(Opcodes.INVOKESTATIC, this.name, n, desc);
        } else {
            mv = cv.visitMethod(access, name, desc, signature, exceptions);
        }
        return mv;
    }

    public void visitEnd() {
        if (clinit != null) {
            clinit.visitInsn(Opcodes.RETURN);
            clinit.visitMaxs(0, 0);
        }
        cv.visitEnd();
    }
}
