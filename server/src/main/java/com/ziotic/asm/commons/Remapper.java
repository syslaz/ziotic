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

import com.ziotic.asm.Type;
import com.ziotic.asm.signature.SignatureReader;
import com.ziotic.asm.signature.SignatureVisitor;
import com.ziotic.asm.signature.SignatureWriter;

/**
 * A class responsible for remapping types and names.
 * Subclasses can override the following methods:
 * <p/>
 * <ul>
 * <li>{@link #map(String)} - map type</li>
 * <li>{@link #mapFieldName(String, String, String)} - map field name</li>
 * <li>{@link #mapMethodName(String, String, String)} - map method name</li>
 * </ul>
 *
 * @author Eugene Kuleshov
 */
public abstract class Remapper {

    public String mapDesc(String desc) {
        Type t = Type.getType(desc);
        switch (t.getSort()) {
            case Type.ARRAY:
                String s = mapDesc(t.getElementType().getDescriptor());
                for (int i = 0; i < t.getDimensions(); ++i) {
                    s = '[' + s;
                }
                return s;
            case Type.OBJECT:
                String newType = map(t.getInternalName());
                if (newType != null) {
                    return 'L' + newType + ';';
                }
        }
        return desc;
    }

    private Type mapType(Type t) {
        switch (t.getSort()) {
            case Type.ARRAY:
                String s = mapDesc(t.getElementType().getDescriptor());
                for (int i = 0; i < t.getDimensions(); ++i) {
                    s = '[' + s;
                }
                return Type.getType(s);
            case Type.OBJECT:
                s = map(t.getInternalName());
                if (s != null) {
                    return Type.getObjectType(s);
                }
        }
        return t;
    }

    public String mapType(String type) {
        if (type == null) {
            return null;
        }
        return mapType(Type.getObjectType(type)).getInternalName();
    }

    public String[] mapTypes(String[] types) {
        String[] newTypes = null;
        boolean needMapping = false;
        for (int i = 0; i < types.length; i++) {
            String type = types[i];
            String newType = map(type);
            if (newType != null && newTypes == null) {
                newTypes = new String[types.length];
                if (i > 0) {
                    System.arraycopy(types, 0, newTypes, 0, i);
                }
                needMapping = true;
            }
            if (needMapping) {
                newTypes[i] = newType == null ? type : newType;
            }
        }
        return needMapping ? newTypes : types;
    }

    public String mapMethodDesc(String desc) {
        if ("()V".equals(desc)) {
            return desc;
        }

        Type[] args = Type.getArgumentTypes(desc);
        String s = "(";
        for (int i = 0; i < args.length; i++) {
            s += mapDesc(args[i].getDescriptor());
        }
        Type returnType = Type.getReturnType(desc);
        if (returnType == Type.VOID_TYPE) {
            return s + ")V";
        }
        return s + ')' + mapDesc(returnType.getDescriptor());
    }

    public Object mapValue(Object value) {
        return value instanceof Type ? mapType((Type) value) : value;
    }

    /**
     * @param typeSignature true if signature is a FieldTypeSignature, such as
     *                      the signature parameter of the ClassVisitor.visitField or
     *                      MethodVisitor.visitLocalVariable methods
     */
    public String mapSignature(String signature, boolean typeSignature) {
        if (signature == null) {
            return null;
        }
        SignatureReader r = new SignatureReader(signature);
        SignatureWriter w = new SignatureWriter();
        SignatureVisitor a = createRemappingSignatureAdapter(w);
        if (typeSignature) {
            r.acceptType(a);
        } else {
            r.accept(a);
        }
        return w.toString();
    }

    protected SignatureVisitor createRemappingSignatureAdapter(SignatureVisitor v) {
        return new RemappingSignatureAdapter(v, this);
    }

    /**
     * Map method name to the new name. Subclasses can override.
     */
    public String mapMethodName(String owner, String name, String desc) {
        return name;
    }

    /**
     * Map field name to the new name. Subclasses can override.
     */
    public String mapFieldName(String owner, String name, String desc) {
        return name;
    }

    /**
     * Map type name to the new name. Subclasses can override.
     */
    public String map(String typeName) {
        return typeName;
    }
}
