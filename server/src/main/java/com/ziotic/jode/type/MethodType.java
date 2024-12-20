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
package com.ziotic.jode.type;

/**
 * This type represents an method type.
 *
 * @author Jochen Hoenicke
 */
public class MethodType extends Type {
    final String signature;
    final Type[] parameterTypes;
    final Type returnType;

    public MethodType(String signature) {
        super(TC_METHOD);
        this.signature = signature;
        int index = 1, types = 0;
        while (signature.charAt(index) != ')') {
            types++;
            while (signature.charAt(index) == '[')
                index++;
            if (signature.charAt(index) == 'L')
                index = signature.indexOf(';', index);
            index++;
        }
        parameterTypes = new Type[types];

        index = 1;
        types = 0;
        while (signature.charAt(index) != ')') {
            int lastindex = index;
            while (signature.charAt(index) == '[')
                index++;
            if (signature.charAt(index) == 'L')
                index = signature.indexOf(';', index);
            index++;
            parameterTypes[types++] = Type.tType(signature.substring(lastindex, index));
        }
        returnType = Type.tType(signature.substring(index + 1));
    }

    public final int stackSize() {
        int size = returnType.stackSize();
        for (int i = 0; i < parameterTypes.length; i++)
            size -= parameterTypes[i].stackSize();
        return size;
    }

    public Type[] getParameterTypes() {
        return parameterTypes;
    }

    public Class[] getParameterClasses() throws ClassNotFoundException {
        Class[] paramClasses = new Class[parameterTypes.length];
        for (int i = paramClasses.length; --i >= 0; )
            paramClasses[i] = parameterTypes[i].getTypeClass();
        return paramClasses;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Class getReturnClass() throws ClassNotFoundException {
        return returnType.getTypeClass();
    }

    public String getTypeSignature() {
        return signature;
    }

    public String toString() {
        return signature;
    }

    public boolean equals(Object o) {
        MethodType mt;
        return (o instanceof MethodType && signature.equals((mt = (MethodType) o).signature));
    }
}
