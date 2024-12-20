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

import java.util.List;

import com.ziotic.asm.Type;

/**
 * An extended {@link BasicVerifier} that performs more precise verifications.
 * This verifier computes exact class types, instead of using a single "object
 * reference" type (as done in the {@link BasicVerifier}).
 *
 * @author Eric Bruneton
 * @author Bing Ran
 */
public class SimpleVerifier extends BasicVerifier {

    /**
     * The class that is verified.
     */
    private final Type currentClass;

    /**
     * The super class of the class that is verified.
     */
    private final Type currentSuperClass;

    /**
     * The interfaces implemented by the class that is verified.
     */
    private final List currentClassInterfaces;

    /**
     * If the class that is verified is an interface.
     */
    private final boolean isInterface;

    /**
     * The loader to use for referenced classes.
     */
    private ClassLoader loader = getClass().getClassLoader();

    /**
     * Constructs a new {@link SimpleVerifier}.
     */
    public SimpleVerifier() {
        this(null, null, false);
    }

    /**
     * Constructs a new {@link SimpleVerifier} to verify a specific class. This
     * class will not be loaded into the JVM since it may be incorrect.
     *
     * @param currentClass      the class that is verified.
     * @param currentSuperClass the super class of the class that is verified.
     * @param isInterface       if the class that is verified is an interface.
     */
    public SimpleVerifier(final Type currentClass, final Type currentSuperClass, final boolean isInterface) {
        this(currentClass, currentSuperClass, null, isInterface);
    }

    /**
     * Constructs a new {@link SimpleVerifier} to verify a specific class. This
     * class will not be loaded into the JVM since it may be incorrect.
     *
     * @param currentClass           the class that is verified.
     * @param currentSuperClass      the super class of the class that is verified.
     * @param currentClassInterfaces the interfaces implemented by the class
     *                               that is verified.
     * @param isInterface            if the class that is verified is an interface.
     */
    public SimpleVerifier(final Type currentClass, final Type currentSuperClass, final List currentClassInterfaces, final boolean isInterface) {
        this.currentClass = currentClass;
        this.currentSuperClass = currentSuperClass;
        this.currentClassInterfaces = currentClassInterfaces;
        this.isInterface = isInterface;
    }

    /**
     * Set the <code>ClassLoader</code> which will be used to load referenced
     * classes. This is useful if you are verifying multiple interdependent
     * classes.
     *
     * @param loader a <code>ClassLoader</code> to use
     */
    public void setClassLoader(final ClassLoader loader) {
        this.loader = loader;
    }

    public Value newValue(final Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }

        boolean isArray = type.getSort() == Type.ARRAY;
        if (isArray) {
            switch (type.getElementType().getSort()) {
                case Type.BOOLEAN:
                case Type.CHAR:
                case Type.BYTE:
                case Type.SHORT:
                    return new BasicValue(type);
            }
        }

        Value v = super.newValue(type);
        if (BasicValue.REFERENCE_VALUE.equals(v)) {
            if (isArray) {
                v = newValue(type.getElementType());
                String desc = ((BasicValue) v).getType().getDescriptor();
                for (int i = 0; i < type.getDimensions(); ++i) {
                    desc = '[' + desc;
                }
                v = new BasicValue(Type.getType(desc));
            } else {
                v = new BasicValue(type);
            }
        }
        return v;
    }

    protected boolean isArrayValue(final Value value) {
        Type t = ((BasicValue) value).getType();
        return t != null && ("Lnull;".equals(t.getDescriptor()) || t.getSort() == Type.ARRAY);
    }

    protected Value getElementValue(final Value objectArrayValue) throws AnalyzerException {
        Type arrayType = ((BasicValue) objectArrayValue).getType();
        if (arrayType != null) {
            if (arrayType.getSort() == Type.ARRAY) {
                return newValue(Type.getType(arrayType.getDescriptor().substring(1)));
            } else if ("Lnull;".equals(arrayType.getDescriptor())) {
                return objectArrayValue;
            }
        }
        throw new Error("Internal error");
    }

    protected boolean isSubTypeOf(final Value value, final Value expected) {
        Type expectedType = ((BasicValue) expected).getType();
        Type type = ((BasicValue) value).getType();
        switch (expectedType.getSort()) {
            case Type.INT:
            case Type.FLOAT:
            case Type.LONG:
            case Type.DOUBLE:
                return type.equals(expectedType);
            case Type.ARRAY:
            case Type.OBJECT:
                if ("Lnull;".equals(type.getDescriptor())) {
                    return true;
                } else if (type.getSort() == Type.OBJECT || type.getSort() == Type.ARRAY) {
                    return isAssignableFrom(expectedType, type);
                } else {
                    return false;
                }
            default:
                throw new Error("Internal error");
        }
    }

    public Value merge(final Value v, final Value w) {
        if (!v.equals(w)) {
            Type t = ((BasicValue) v).getType();
            Type u = ((BasicValue) w).getType();
            if (t != null && (t.getSort() == Type.OBJECT || t.getSort() == Type.ARRAY)) {
                if (u != null && (u.getSort() == Type.OBJECT || u.getSort() == Type.ARRAY)) {
                    if ("Lnull;".equals(t.getDescriptor())) {
                        return w;
                    }
                    if ("Lnull;".equals(u.getDescriptor())) {
                        return v;
                    }
                    if (isAssignableFrom(t, u)) {
                        return v;
                    }
                    if (isAssignableFrom(u, t)) {
                        return w;
                    }
                    // TODO case of array classes of the same dimension
                    // TODO should we look also for a common super interface?
                    // problem: there may be several possible common super
                    // interfaces
                    do {
                        if (t == null || isInterface(t)) {
                            return BasicValue.REFERENCE_VALUE;
                        }
                        t = getSuperClass(t);
                        if (isAssignableFrom(t, u)) {
                            return newValue(t);
                        }
                    } while (true);
                }
            }
            return BasicValue.UNINITIALIZED_VALUE;
        }
        return v;
    }

    protected boolean isInterface(final Type t) {
        if (currentClass != null && t.equals(currentClass)) {
            return isInterface;
        }
        return getClass(t).isInterface();
    }

    protected Type getSuperClass(final Type t) {
        if (currentClass != null && t.equals(currentClass)) {
            return currentSuperClass;
        }
        Class c = getClass(t).getSuperclass();
        return c == null ? null : Type.getType(c);
    }

    protected boolean isAssignableFrom(final Type t, final Type u) {
        if (t.equals(u)) {
            return true;
        }
        if (currentClass != null && t.equals(currentClass)) {
            if (getSuperClass(u) == null) {
                return false;
            } else {
                if (isInterface) {
                    return u.getSort() == Type.OBJECT || u.getSort() == Type.ARRAY;
                }
                return isAssignableFrom(t, getSuperClass(u));
            }
        }
        if (currentClass != null && u.equals(currentClass)) {
            if (isAssignableFrom(t, currentSuperClass)) {
                return true;
            }
            if (currentClassInterfaces != null) {
                for (int i = 0; i < currentClassInterfaces.size(); ++i) {
                    Type v = (Type) currentClassInterfaces.get(i);
                    if (isAssignableFrom(t, v)) {
                        return true;
                    }
                }
            }
            return false;
        }
        Class tc = getClass(t);
        if (tc.isInterface()) {
            tc = Object.class;
        }
        return tc.isAssignableFrom(getClass(u));
    }

    protected Class getClass(final Type t) {
        try {
            if (t.getSort() == Type.ARRAY) {
                return Class.forName(t.getDescriptor().replace('/', '.'), false, loader);
            }
            return Class.forName(t.getClassName(), false, loader);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
