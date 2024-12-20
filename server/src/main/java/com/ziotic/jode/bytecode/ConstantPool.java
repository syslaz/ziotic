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
package com.ziotic.jode.bytecode;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * This class represent the constant pool.
 *
 * @author Jochen Hoenicke
 */
public class ConstantPool {
    public final static int CLASS = 7;
    public final static int FIELDREF = 9;
    public final static int METHODREF = 10;
    public final static int INTERFACEMETHODREF = 11;
    public final static int STRING = 8;
    public final static int INTEGER = 3;
    public final static int FLOAT = 4;
    public final static int LONG = 5;
    public final static int DOUBLE = 6;
    public final static int NAMEANDTYPE = 12;
    public final static int UTF8 = 1;

    int count;
    int[] tags;
    int[] indices1, indices2;

    Object[] constants;

    public ConstantPool() {
    }

    public void read(DataInputStream stream) throws IOException {
        count = stream.readUnsignedShort();
        tags = new int[count];
        indices1 = new int[count];
        indices2 = new int[count];
        constants = new Object[count];

        for (int i = 1; i < count; i++) {
            int tag = stream.readUnsignedByte();
            tags[i] = tag;
            switch (tag) {
                case CLASS:
                    indices1[i] = stream.readUnsignedShort();
                    break;
                case FIELDREF:
                case METHODREF:
                case INTERFACEMETHODREF:
                    indices1[i] = stream.readUnsignedShort();
                    indices2[i] = stream.readUnsignedShort();
                    break;
                case STRING:
                    indices1[i] = stream.readUnsignedShort();
                    break;
                case INTEGER:
                    constants[i] = new Integer(stream.readInt());
                    break;
                case FLOAT:
                    constants[i] = new Float(stream.readFloat());
                    break;
                case LONG:
                    constants[i] = new Long(stream.readLong());
                    tags[++i] = -LONG;
                    break;
                case DOUBLE:
                    constants[i] = new Double(stream.readDouble());
                    tags[++i] = -DOUBLE;
                    break;
                case NAMEANDTYPE:
                    indices1[i] = stream.readUnsignedShort();
                    indices2[i] = stream.readUnsignedShort();
                    break;
                case UTF8:
                    constants[i] = stream.readUTF().intern();
                    break;
                default:
                    throw new ClassFormatException("unknown constant tag");
            }
        }
    }

    public int getTag(int i) throws ClassFormatException {
        if (i == 0)
            throw new ClassFormatException("null tag");
        return tags[i];
    }

    public String getUTF8(int i) throws ClassFormatException {
        if (i == 0)
            return null;
        if (tags[i] != UTF8)
            throw new ClassFormatException("Tag mismatch");
        return (String) constants[i];
    }

    public Reference getRef(int i) throws ClassFormatException {
        if (i == 0)
            return null;
        if (tags[i] != FIELDREF && tags[i] != METHODREF && tags[i] != INTERFACEMETHODREF)
            throw new ClassFormatException("Tag mismatch");
        if (constants[i] == null) {
            int classIndex = indices1[i];
            int nameTypeIndex = indices2[i];
            if (tags[nameTypeIndex] != NAMEANDTYPE)
                throw new ClassFormatException("Tag mismatch");
            String type = getUTF8(indices2[nameTypeIndex]);
            try {
                if (tags[i] == FIELDREF)
                    TypeSignature.checkTypeSig(type);
                else
                    TypeSignature.checkMethodTypeSig(type);
            } catch (IllegalArgumentException ex) {
                throw new ClassFormatException(ex.getMessage());
            }
            String clName = getClassType(classIndex);
            constants[i] = Reference.getReference(clName, getUTF8(indices1[nameTypeIndex]), type);
        }
        return (Reference) constants[i];
    }

    public Object getConstant(int i) throws ClassFormatException {
        if (i == 0)
            throw new ClassFormatException("null constant");
        switch (tags[i]) {
            case ConstantPool.INTEGER:
            case ConstantPool.FLOAT:
            case ConstantPool.LONG:
            case ConstantPool.DOUBLE:
                return constants[i];
            case ConstantPool.STRING:
                return getUTF8(indices1[i]);
        }
        throw new ClassFormatException("Tag mismatch: " + tags[i]);
    }

    public String getClassType(int i) throws ClassFormatException {
        if (i == 0)
            return null;
        if (tags[i] != CLASS)
            throw new ClassFormatException("Tag mismatch");
        String clName = getUTF8(indices1[i]);
        if (clName.charAt(0) != '[') {
            clName = ("L" + clName + ';').intern();
        }
        try {
            TypeSignature.checkTypeSig(clName);
        } catch (IllegalArgumentException ex) {
            throw new ClassFormatException(ex.getMessage());
        }

        return clName;
    }

    public String getClassName(int i) throws ClassFormatException {
        if (i == 0)
            return null;
        if (tags[i] != CLASS)
            throw new ClassFormatException("Tag mismatch");
        String clName = getUTF8(indices1[i]);
        try {
            TypeSignature.checkTypeSig("L" + clName + ";");
        } catch (IllegalArgumentException ex) {
            throw new ClassFormatException(ex.getMessage());
        }
        return clName.replace('/', '.').intern();
    }

    public String toString(int i) {
        switch (tags[i]) {
            case CLASS:
                return "Class " + toString(indices1[i]);
            case STRING:
                return "String \"" + toString(indices1[i]) + "\"";
            case INTEGER:
                return "Int " + constants[i].toString();
            case FLOAT:
                return "Float " + constants[i].toString();
            case LONG:
                return "Long " + constants[i].toString();
            case DOUBLE:
                return "Double " + constants[i].toString();
            case UTF8:
                return constants[i].toString();
            case FIELDREF:
                return "Fieldref: " + toString(indices1[i]) + "; " + toString(indices2[i]);
            case METHODREF:
                return "Methodref: " + toString(indices1[i]) + "; " + toString(indices2[i]);
            case INTERFACEMETHODREF:
                return "Interfaceref: " + toString(indices1[i]) + "; " + toString(indices2[i]);
            case NAMEANDTYPE:
                return "Name " + toString(indices1[i]) + "; Type " + toString(indices2[i]);
            default:
                return "unknown tag: " + tags[i];
        }
    }

    public int size() {
        return count;
    }

    public String toString() {
        StringBuffer result = new StringBuffer("[ null");
        for (int i = 1; i < count; i++) {
            result.append(", ").append(i).append(" = ").append(toString(i));
        }
        result.append(" ]");
        return result.toString();
    }
}
