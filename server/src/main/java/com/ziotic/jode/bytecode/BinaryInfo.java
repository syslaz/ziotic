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

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import com.ziotic.jode.util.SimpleMap;

/**
 * @author Jochen Hoenicke
 */
public class BinaryInfo {
    public static final int HIERARCHY = 0x01;
    public static final int FIELDS = 0x02;
    public static final int METHODS = 0x04;
    public static final int CONSTANTS = 0x08;
    public static final int KNOWNATTRIBS = 0x10;
    public static final int INNERCLASSES = 0x20;
    public static final int OUTERCLASSES = 0x40;
    public static final int UNKNOWNATTRIBS = 0x80;
    public static final int FULLINFO = 0xff;
    public static final int MOSTINFO = 0x7f;
    public static final int REFLECTINFO = 0x6f;

    private Map unknownAttributes = null;

    protected void skipAttributes(DataInputStream input) throws IOException {
        int count = input.readUnsignedShort();
        for (int i = 0; i < count; i++) {
            input.readUnsignedShort();  // the name index
            long length = input.readInt();
            while (length > 0) {
                long skipped = input.skip(length);
                if (skipped == 0)
                    throw new EOFException("Can't skip. EOF?");
                length -= skipped;
            }
        }
    }

    protected int getKnownAttributeCount() {
        return 0;
    }

    protected void readAttribute(String name, int length, ConstantPool constantPool, DataInputStream input, int howMuch) throws IOException {
        byte[] data = new byte[length];
        input.readFully(data);
        if ((howMuch & UNKNOWNATTRIBS) != 0) {
            if (unknownAttributes == null)
                unknownAttributes = new SimpleMap();
            unknownAttributes.put(name, data);
        }
    }

    static class ConstrainedInputStream extends FilterInputStream {
        int length;

        public ConstrainedInputStream(int attrLength, InputStream input) {
            super(input);
            length = attrLength;
        }

        public int read() throws IOException {
            if (length > 0) {
                int data = super.read();
                length--;
                return data;
            }
            throw new EOFException();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (length < len) {
                len = length;
            }
            if (len == 0)
                return -1;
            int count = super.read(b, off, len);
            length -= count;
            return count;
        }

        public int read(byte[] b) throws IOException {
            return read(b, 0, b.length);
        }

        public long skip(long count) throws IOException {
            if (length < count) {
                count = length;
            }
            count = super.skip(count);
            length -= (int) count;
            return count;
        }

        public void skipRemaining() throws IOException {
            while (length > 0) {
                int skipped = (int) skip(length);
                if (skipped == 0)
                    throw new EOFException();
                length -= skipped;
            }
        }
    }

    protected void readAttributes(ConstantPool constantPool, DataInputStream input, int howMuch) throws IOException {
        int count = input.readUnsignedShort();
        unknownAttributes = null;
        for (int i = 0; i < count; i++) {
            String attrName = constantPool.getUTF8(input.readUnsignedShort());
            final int attrLength = input.readInt();
            ConstrainedInputStream constrInput = new ConstrainedInputStream(attrLength, input);
            readAttribute(attrName, attrLength, constantPool, new DataInputStream(constrInput), howMuch);
            constrInput.skipRemaining();
        }
    }

    public void dropInfo(int howMuch) {
        if ((howMuch & UNKNOWNATTRIBS) != 0)
            unknownAttributes = null;
    }

    protected void prepareAttributes(GrowableConstantPool gcp) {
        if (unknownAttributes == null)
            return;
        Iterator i = unknownAttributes.keySet().iterator();
        while (i.hasNext())
            gcp.putUTF8((String) i.next());
    }

    protected void writeKnownAttributes(GrowableConstantPool constantPool, DataOutputStream output) throws IOException {
    }

    protected void writeAttributes(GrowableConstantPool constantPool, DataOutputStream output) throws IOException {
        int count = getKnownAttributeCount();
        if (unknownAttributes != null)
            count += unknownAttributes.size();
        output.writeShort(count);
        writeKnownAttributes(constantPool, output);
        if (unknownAttributes != null) {
            Iterator i = unknownAttributes.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry e = (Map.Entry) i.next();
                String name = (String) e.getKey();
                byte[] data = (byte[]) e.getValue();
                output.writeShort(constantPool.putUTF8(name));
                output.writeInt(data.length);
                output.write(data);
            }
        }
    }

    public int getAttributeSize() {
        int size = 2; /* attribute count */
        if (unknownAttributes != null) {
            Iterator i = unknownAttributes.values().iterator();
            while (i.hasNext())
                size += 2 + 4 + ((byte[]) i.next()).length;
        }
        return size;
    }

    public byte[] findAttribute(String name) {
        if (unknownAttributes != null)
            return (byte[]) unknownAttributes.get(name);
        return null;
    }

    public Iterator getAttributes() {
        if (unknownAttributes != null)
            return unknownAttributes.values().iterator();
        return Collections.EMPTY_SET.iterator();
    }

    public void setAttribute(String name, byte[] content) {
        if (unknownAttributes == null)
            unknownAttributes = new SimpleMap();
        unknownAttributes.put(name, content);
    }

    public byte[] removeAttribute(String name) {
        if (unknownAttributes != null)
            return (byte[]) unknownAttributes.remove(name);
        return null;
    }

    public void removeAllAttributes() {
        unknownAttributes = null;
    }
}
