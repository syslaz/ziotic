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

import java.util.HashMap;
import java.util.Map;

import com.ziotic.asm.Type;

/**
 * A named method descriptor.
 *
 * @author Juozas Baliuka
 * @author Chris Nokleberg
 * @author Eric Bruneton
 */
public class Method {

    /**
     * The method name.
     */
    private final String name;

    /**
     * The method descriptor.
     */
    private final String desc;

    /**
     * Maps primitive Java type names to their descriptors.
     */
    private static final Map DESCRIPTORS;

    static {
        DESCRIPTORS = new HashMap();
        DESCRIPTORS.put("void", "V");
        DESCRIPTORS.put("byte", "B");
        DESCRIPTORS.put("char", "C");
        DESCRIPTORS.put("double", "D");
        DESCRIPTORS.put("float", "F");
        DESCRIPTORS.put("int", "I");
        DESCRIPTORS.put("long", "J");
        DESCRIPTORS.put("short", "S");
        DESCRIPTORS.put("boolean", "Z");
    }

    /**
     * Creates a new {@link Method}.
     *
     * @param name the method's name.
     * @param desc the method's descriptor.
     */
    public Method(final String name, final String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * Creates a new {@link Method}.
     *
     * @param name          the method's name.
     * @param returnType    the method's return type.
     * @param argumentTypes the method's argument types.
     */
    public Method(final String name, final Type returnType, final Type[] argumentTypes) {
        this(name, Type.getMethodDescriptor(returnType, argumentTypes));
    }

    /**
     * Creates a new {@link Method}.
     *
     * @param m a java.lang.reflect method descriptor
     * @return a {@link Method} corresponding to the given Java method
     *         declaration.
     */
    public static Method getMethod(java.lang.reflect.Method m) {
        return new Method(m.getName(), Type.getMethodDescriptor(m));
    }

    /**
     * Creates a new {@link Method}.
     *
     * @param c a java.lang.reflect constructor descriptor
     * @return a {@link Method} corresponding to the given Java constructor
     *         declaration.
     */
    public static Method getMethod(java.lang.reflect.Constructor c) {
        return new Method("<init>", Type.getConstructorDescriptor(c));
    }

    /**
     * Returns a {@link Method} corresponding to the given Java method
     * declaration.
     *
     * @param method a Java method declaration, without argument names, of the
     *               form "returnType name (argumentType1, ... argumentTypeN)", where
     *               the types are in plain Java (e.g. "int", "float",
     *               "java.util.List", ...). Classes of the java.lang package can be
     *               specified by their unqualified name; all other classes names must
     *               be fully qualified.
     * @return a {@link Method} corresponding to the given Java method
     *         declaration.
     * @throws IllegalArgumentException if <code>method</code> could not get
     *                                  parsed.
     */
    public static Method getMethod(final String method) throws IllegalArgumentException {
        return getMethod(method, false);
    }

    /**
     * Returns a {@link Method} corresponding to the given Java method
     * declaration.
     *
     * @param method         a Java method declaration, without argument names, of the
     *                       form "returnType name (argumentType1, ... argumentTypeN)", where
     *                       the types are in plain Java (e.g. "int", "float",
     *                       "java.util.List", ...). Classes of the java.lang package may be
     *                       specified by their unqualified name, depending on the
     *                       defaultPackage argument; all other classes names must be fully
     *                       qualified.
     * @param defaultPackage true if unqualified class names belong to the
     *                       default package, or false if they correspond to java.lang classes.
     *                       For instance "Object" means "Object" if this option is true, or
     *                       "java.lang.Object" otherwise.
     * @return a {@link Method} corresponding to the given Java method
     *         declaration.
     * @throws IllegalArgumentException if <code>method</code> could not get
     *                                  parsed.
     */
    public static Method getMethod(final String method, final boolean defaultPackage) throws IllegalArgumentException {
        int space = method.indexOf(' ');
        int start = method.indexOf('(', space) + 1;
        int end = method.indexOf(')', start);
        if (space == -1 || start == -1 || end == -1) {
            throw new IllegalArgumentException();
        }
        String returnType = method.substring(0, space);
        String methodName = method.substring(space + 1, start - 1).trim();
        StringBuffer sb = new StringBuffer();
        sb.append('(');
        int p;
        do {
            String s;
            p = method.indexOf(',', start);
            if (p == -1) {
                s = map(method.substring(start, end).trim(), defaultPackage);
            } else {
                s = map(method.substring(start, p).trim(), defaultPackage);
                start = p + 1;
            }
            sb.append(s);
        } while (p != -1);
        sb.append(')');
        sb.append(map(returnType, defaultPackage));
        return new Method(methodName, sb.toString());
    }

    private static String map(final String type, final boolean defaultPackage) {
        if ("".equals(type)) {
            return type;
        }

        StringBuffer sb = new StringBuffer();
        int index = 0;
        while ((index = type.indexOf("[]", index) + 1) > 0) {
            sb.append('[');
        }

        String t = type.substring(0, type.length() - sb.length() * 2);
        String desc = (String) DESCRIPTORS.get(t);
        if (desc != null) {
            sb.append(desc);
        } else {
            sb.append('L');
            if (t.indexOf('.') < 0) {
                if (!defaultPackage) {
                    sb.append("java/lang/");
                }
                sb.append(t);
            } else {
                sb.append(t.replace('.', '/'));
            }
            sb.append(';');
        }
        return sb.toString();
    }

    /**
     * Returns the name of the method described by this object.
     *
     * @return the name of the method described by this object.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the descriptor of the method described by this object.
     *
     * @return the descriptor of the method described by this object.
     */
    public String getDescriptor() {
        return desc;
    }

    /**
     * Returns the return type of the method described by this object.
     *
     * @return the return type of the method described by this object.
     */
    public Type getReturnType() {
        return Type.getReturnType(desc);
    }

    /**
     * Returns the argument types of the method described by this object.
     *
     * @return the argument types of the method described by this object.
     */
    public Type[] getArgumentTypes() {
        return Type.getArgumentTypes(desc);
    }

    public String toString() {
        return name + desc;
    }

    public boolean equals(final Object o) {
        if (!(o instanceof Method)) {
            return false;
        }
        Method other = (Method) o;
        return name.equals(other.name) && desc.equals(other.desc);
    }

    public int hashCode() {
        return name.hashCode() ^ desc.hashCode();
    }
}