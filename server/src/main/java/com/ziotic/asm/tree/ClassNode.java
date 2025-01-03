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
package com.ziotic.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ziotic.asm.Attribute;
import com.ziotic.asm.ClassVisitor;
import com.ziotic.asm.FieldVisitor;
import com.ziotic.asm.MethodVisitor;

/**
 * A node that represents a class.
 *
 * @author Eric Bruneton
 */
public class ClassNode extends MemberNode implements ClassVisitor {

    /**
     * The class version.
     */
    public int version;

    /**
     * The class's access flags (see {@link com.ziotic.asm.Opcodes}). This
     * field also indicates if the class is deprecated.
     */
    public int access;

    /**
     * The internal name of the class (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     */
    public String name;

    /**
     * The signature of the class. Mayt be <tt>null</tt>.
     */
    public String signature;

    /**
     * The internal of name of the super class (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}). For
     * interfaces, the super class is {@link Object}. May be <tt>null</tt>,
     * but only for the {@link Object} class.
     */
    public String superName;

    /**
     * The internal names of the class's interfaces (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}). This
     * list is a list of {@link String} objects.
     */
    public List interfaces;

    /**
     * The name of the source file from which this class was compiled. May be
     * <tt>null</tt>.
     */
    public String sourceFile;

    /**
     * Debug information to compute the correspondance between source and
     * compiled elements of the class. May be <tt>null</tt>.
     */
    public String sourceDebug;

    /**
     * The internal name of the enclosing class of the class. May be
     * <tt>null</tt>.
     */
    public String outerClass;

    /**
     * The name of the method that contains the class, or <tt>null</tt> if the
     * class is not enclosed in a method.
     */
    public String outerMethod;

    /**
     * The descriptor of the method that contains the class, or <tt>null</tt>
     * if the class is not enclosed in a method.
     */
    public String outerMethodDesc;

    /**
     * Informations about the inner classes of this class. This list is a list
     * of {@link InnerClassNode} objects.
     *
     * @associates org.objectweb.asm.tree.InnerClassNode
     */
    public List innerClasses;

    /**
     * The fields of this class. This list is a list of {@link FieldNode}
     * objects.
     *
     * @associates org.objectweb.asm.tree.FieldNode
     */
    public List fields;

    /**
     * The methods of this class. This list is a list of {@link MethodNode}
     * objects.
     *
     * @associates org.objectweb.asm.tree.MethodNode
     */
    public List methods;

    /**
     * Constructs a new {@link ClassNode}.
     */
    public ClassNode() {
        this.interfaces = new ArrayList();
        this.innerClasses = new ArrayList();
        this.fields = new ArrayList();
        this.methods = new ArrayList();
    }

    // ------------------------------------------------------------------------
    // Implementation of the ClassVisitor interface
    // ------------------------------------------------------------------------

    public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
        this.version = version;
        this.access = access;
        this.name = name;
        this.signature = signature;
        this.superName = superName;
        if (interfaces != null) {
            this.interfaces.addAll(Arrays.asList(interfaces));
        }
    }

    public void visitSource(final String file, final String debug) {
        sourceFile = file;
        sourceDebug = debug;
    }

    public void visitOuterClass(final String owner, final String name, final String desc) {
        outerClass = owner;
        outerMethod = name;
        outerMethodDesc = desc;
    }

    public void visitInnerClass(final String name, final String outerName, final String innerName, final int access) {
        InnerClassNode icn = new InnerClassNode(name, outerName, innerName, access);
        innerClasses.add(icn);
    }

    public FieldVisitor visitField(final int access, final String name, final String desc, final String signature, final Object value) {
        FieldNode fn = new FieldNode(access, name, desc, signature, value);
        fields.add(fn);
        return fn;
    }

    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        MethodNode mn = new MethodNode(access, name, desc, signature, exceptions);
        methods.add(mn);
        return mn;
    }

    // ------------------------------------------------------------------------
    // Accept method
    // ------------------------------------------------------------------------

    /**
     * Makes the given class visitor visit this class.
     *
     * @param cv a class visitor.
     */
    public void accept(final ClassVisitor cv) {
        // visits header
        String[] interfaces = new String[this.interfaces.size()];
        this.interfaces.toArray(interfaces);
        cv.visit(version, access, name, signature, superName, interfaces);
        // visits source
        if (sourceFile != null || sourceDebug != null) {
            cv.visitSource(sourceFile, sourceDebug);
        }
        // visits outer class
        if (outerClass != null) {
            cv.visitOuterClass(outerClass, outerMethod, outerMethodDesc);
        }
        // visits attributes
        int i, n;
        n = visibleAnnotations == null ? 0 : visibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = (AnnotationNode) visibleAnnotations.get(i);
            an.accept(cv.visitAnnotation(an.desc, true));
        }
        n = invisibleAnnotations == null ? 0 : invisibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = (AnnotationNode) invisibleAnnotations.get(i);
            an.accept(cv.visitAnnotation(an.desc, false));
        }
        n = attrs == null ? 0 : attrs.size();
        for (i = 0; i < n; ++i) {
            cv.visitAttribute((Attribute) attrs.get(i));
        }
        // visits inner classes
        for (i = 0; i < innerClasses.size(); ++i) {
            ((InnerClassNode) innerClasses.get(i)).accept(cv);
        }
        // visits fields
        for (i = 0; i < fields.size(); ++i) {
            ((FieldNode) fields.get(i)).accept(cv);
        }
        // visits methods
        for (i = 0; i < methods.size(); ++i) {
            ((MethodNode) methods.get(i)).accept(cv);
        }
        // visits end
        cv.visitEnd();
    }
}
