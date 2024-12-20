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

import com.ziotic.asm.*;
import com.ziotic.asm.commons.Remapper;
import com.ziotic.asm.commons.RemappingClassAdapter;

/**
 * A {@link com.ziotic.asm.ClassAdapter} that renames fields and methods, and removes debug
 * info.
 *
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
public class ClassOptimizer extends RemappingClassAdapter {

    private String pkgName;

    public ClassOptimizer(final ClassVisitor cv, final Remapper remapper) {
        super(cv, remapper);
    }

    // ------------------------------------------------------------------------
    // Overridden methods
    // ------------------------------------------------------------------------

    public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
        super.visit(version, access, name, null, superName, interfaces);
        pkgName = name.substring(0, name.lastIndexOf('/'));
    }

    public void visitSource(final String source, final String debug) {
        // remove debug info
    }

    public void visitOuterClass(final String owner, final String name, final String desc) {
        // remove debug info
    }

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        // remove annotations
        return null;
    }

    public void visitAttribute(final Attribute attr) {
        // remove non standard attributes
    }

    public void visitInnerClass(final String name, final String outerName, final String innerName, final int access) {
        // remove debug info
    }

    public FieldVisitor visitField(final int access, final String name, final String desc, final String signature, final Object value) {
        String s = remapper.mapFieldName(className, name, desc);
        if ("-".equals(s)) {
            return null;
        }
        if ((access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_PROTECTED)) == 0) {
            if ((access & Opcodes.ACC_FINAL) != 0 && (access & Opcodes.ACC_STATIC) != 0 && desc.length() == 1) {
                return null;
            }
            if ("org/objectweb/asm".equals(pkgName) && s.equals(name)) {
                System.out.println("INFO: " + s + " could be renamed");
            }
            super.visitField(access, name, desc, null, value);
        } else {
            if (!s.equals(name)) {
                throw new RuntimeException("The public or protected field " + className + '.' + name + " must not be renamed.");
            }
            super.visitField(access, name, desc, null, value);
        }
        return null; // remove debug info
    }

    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        String s = remapper.mapMethodName(className, name, desc);
        if ("-".equals(s)) {
            return null;
        }
        if ((access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_PROTECTED)) == 0) {
            if ("org/objectweb/asm".equals(pkgName) && !name.startsWith("<") && s.equals(name)) {
                System.out.println("INFO: " + s + " could be renamed");
            }
            return super.visitMethod(access, name, desc, null, exceptions);
        } else {
            if (!s.equals(name)) {
                throw new RuntimeException("The public or protected method " + className + '.' + name + desc + " must not be renamed.");
            }
            return super.visitMethod(access, name, desc, null, exceptions);
        }
    }

    protected MethodVisitor createRemappingMethodAdapter(int access, String newDesc, MethodVisitor mv) {
        return new MethodOptimizer(access, newDesc, mv, remapper);
    }
}
