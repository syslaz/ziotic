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

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.ziotic.asm.*;

/**
 * A {@link com.ziotic.asm.ClassAdapter} that adds a serial version unique identifier to a
 * class if missing. Here is typical usage of this class:
 * <p/>
 * <pre>
 *   ClassWriter cw = new ClassWriter(...);
 *   ClassVisitor sv = new SerialVersionUIDAdder(cw);
 *   ClassVisitor ca = new MyClassAdapter(sv);
 *   new ClassReader(orginalClass).accept(ca, false);
 * </pre>
 * <p/>
 * The SVUID algorithm can be found <a href=
 * "http://java.sun.com/j2se/1.4.2/docs/guide/serialization/spec/class.html"
 * >http://java.sun.com/j2se/1.4.2/docs/guide/serialization/spec/class.html</a>:
 * <p/>
 * <pre>
 * The serialVersionUID is computed using the signature of a stream of bytes
 * that reflect the class definition. The National Institute of Standards and
 * Technology (NIST) Secure Hash Algorithm (SHA-1) is used to compute a
 * signature for the stream. The first two 32-bit quantities are used to form a
 * 64-bit hash. A java.lang.DataOutputStream is used to convert primitive data
 * types to a sequence of bytes. The values input to the stream are defined by
 * the Java Virtual Machine (VM) specification for classes.
 *
 * The sequence of items in the stream is as follows:
 *
 * 1. The class name written using UTF encoding.
 * 2. The class modifiers written as a 32-bit integer.
 * 3. The name of each interface sorted by name written using UTF encoding.
 * 4. For each field of the class sorted by field name (except private static
 * and private transient fields):
 * 1. The name of the field in UTF encoding.
 * 2. The modifiers of the field written as a 32-bit integer.
 * 3. The descriptor of the field in UTF encoding
 * 5. If a class initializer exists, write out the following:
 * 1. The name of the method, &lt;clinit&gt;, in UTF encoding.
 * 2. The modifier of the method, java.lang.reflect.Modifier.STATIC,
 * written as a 32-bit integer.
 * 3. The descriptor of the method, ()V, in UTF encoding.
 * 6. For each non-private constructor sorted by method name and signature:
 * 1. The name of the method, &lt;init&gt;, in UTF encoding.
 * 2. The modifiers of the method written as a 32-bit integer.
 * 3. The descriptor of the method in UTF encoding.
 * 7. For each non-private method sorted by method name and signature:
 * 1. The name of the method in UTF encoding.
 * 2. The modifiers of the method written as a 32-bit integer.
 * 3. The descriptor of the method in UTF encoding.
 * 8. The SHA-1 algorithm is executed on the stream of bytes produced by
 * DataOutputStream and produces five 32-bit values sha[0..4].
 *
 * 9. The hash value is assembled from the first and second 32-bit values of
 * the SHA-1 message digest. If the result of the message digest, the five
 * 32-bit words H0 H1 H2 H3 H4, is in an array of five int values named
 * sha, the hash value would be computed as follows:
 *
 * long hash = ((sha[0] &gt;&gt;&gt; 24) &amp; 0xFF) |
 * ((sha[0] &gt;&gt;&gt; 16) &amp; 0xFF) &lt;&lt; 8 |
 * ((sha[0] &gt;&gt;&gt; 8) &amp; 0xFF) &lt;&lt; 16 |
 * ((sha[0] &gt;&gt;&gt; 0) &amp; 0xFF) &lt;&lt; 24 |
 * ((sha[1] &gt;&gt;&gt; 24) &amp; 0xFF) &lt;&lt; 32 |
 * ((sha[1] &gt;&gt;&gt; 16) &amp; 0xFF) &lt;&lt; 40 |
 * ((sha[1] &gt;&gt;&gt; 8) &amp; 0xFF) &lt;&lt; 48 |
 * ((sha[1] &gt;&gt;&gt; 0) &amp; 0xFF) &lt;&lt; 56;
 * </pre>
 *
 * @author Rajendra Inamdar, Vishal Vishnoi
 */
public class SerialVersionUIDAdder extends ClassAdapter {

    /**
     * Flag that indicates if we need to compute SVUID.
     */
    protected boolean computeSVUID;

    /**
     * Set to true if the class already has SVUID.
     */
    protected boolean hasSVUID;

    /**
     * Classes access flags.
     */
    protected int access;

    /**
     * Internal name of the class
     */
    protected String name;

    /**
     * Interfaces implemented by the class.
     */
    protected String[] interfaces;

    /**
     * Collection of fields. (except private static and private transient
     * fields)
     */
    protected Collection svuidFields;

    /**
     * Set to true if the class has static initializer.
     */
    protected boolean hasStaticInitializer;

    /**
     * Collection of non-private constructors.
     */
    protected Collection svuidConstructors;

    /**
     * Collection of non-private methods.
     */
    protected Collection svuidMethods;

    /**
     * Creates a new {@link SerialVersionUIDAdder}.
     *
     * @param cv a {@link ClassVisitor} to which this visitor will delegate
     *           calls.
     */
    public SerialVersionUIDAdder(final ClassVisitor cv) {
        super(cv);
        svuidFields = new ArrayList();
        svuidConstructors = new ArrayList();
        svuidMethods = new ArrayList();
    }

    // ------------------------------------------------------------------------
    // Overriden methods
    // ------------------------------------------------------------------------

    /*
     * Visit class header and get class name, access , and interfaces
     * information (step 1,2, and 3) for SVUID computation.
     */
    public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
        computeSVUID = (access & Opcodes.ACC_INTERFACE) == 0;

        if (computeSVUID) {
            this.name = name;
            this.access = access;
            this.interfaces = interfaces;
        }

        super.visit(version, access, name, signature, superName, interfaces);
    }

    /*
     * Visit the methods and get constructor and method information (step 5 and
     * 7). Also determine if there is a class initializer (step 6).
     */
    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        if (computeSVUID) {
            if ("<clinit>".equals(name)) {
                hasStaticInitializer = true;
            }
            /*
             * Remembers non private constructors and methods for SVUID
             * computation For constructor and method modifiers, only the
             * ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC, ACC_FINAL,
             * ACC_SYNCHRONIZED, ACC_NATIVE, ACC_ABSTRACT and ACC_STRICT flags
             * are used.
             */
            int mods = access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL | Opcodes.ACC_SYNCHRONIZED | Opcodes.ACC_NATIVE | Opcodes.ACC_ABSTRACT | Opcodes.ACC_STRICT);

            // all non private methods
            if ((access & Opcodes.ACC_PRIVATE) == 0) {
                if ("<init>".equals(name)) {
                    svuidConstructors.add(new Item(name, mods, desc));
                } else if (!"<clinit>".equals(name)) {
                    svuidMethods.add(new Item(name, mods, desc));
                }
            }
        }

        return cv.visitMethod(access, name, desc, signature, exceptions);
    }

    /*
     * Gets class field information for step 4 of the algorithm. Also determines
     * if the class already has a SVUID.
     */
    public FieldVisitor visitField(final int access, final String name, final String desc, final String signature, final Object value) {
        if (computeSVUID) {
            if ("serialVersionUID".equals(name)) {
                // since the class already has SVUID, we won't be computing it.
                computeSVUID = false;
                hasSVUID = true;
            }
            /*
             * Remember field for SVUID computation For field modifiers, only
             * the ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED, ACC_STATIC,
             * ACC_FINAL, ACC_VOLATILE, and ACC_TRANSIENT flags are used when
             * computing serialVersionUID values.
             */
            if ((access & Opcodes.ACC_PRIVATE) == 0 || (access & (Opcodes.ACC_STATIC | Opcodes.ACC_TRANSIENT)) == 0) {
                int mods = access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL | Opcodes.ACC_VOLATILE | Opcodes.ACC_TRANSIENT);
                svuidFields.add(new Item(name, mods, desc));
            }
        }

        return super.visitField(access, name, desc, signature, value);
    }

    /**
     * Handle a bizarre special case. Nested classes (static classes declared
     * inside another class) that are protected have their access bit set to
     * public in their class files to deal with some odd reflection situation.
     * Our SVUID computation must do as the JVM does and ignore access bits in
     * the class file in favor of the access bits InnerClass attribute.
     */
    public void visitInnerClass(final String aname, final String outerName, final String innerName, final int attr_access) {
        if ((name != null) && name.equals(aname)) {
            this.access = attr_access;
        }
        super.visitInnerClass(aname, outerName, innerName, attr_access);
    }

    /*
    * Add the SVUID if class doesn't have one
    */
    public void visitEnd() {
        // compute SVUID and add it to the class
        if (computeSVUID && !hasSVUID) {
            try {
                cv.visitField(Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "serialVersionUID", "J", null, new Long(computeSVUID()));
            } catch (Throwable e) {
                throw new RuntimeException("Error while computing SVUID for " + name, e);
            }
        }

        super.visitEnd();
    }

    // ------------------------------------------------------------------------
    // Utility methods
    // ------------------------------------------------------------------------

    /**
     * Returns the value of SVUID if the class doesn't have one already. Please
     * note that 0 is returned if the class already has SVUID, thus use
     * <code>isHasSVUID</code> to determine if the class already had an SVUID.
     *
     * @return Returns the serial version UID
     */
    protected long computeSVUID() throws IOException {
        ByteArrayOutputStream bos;
        DataOutputStream dos = null;
        long svuid = 0;

        try {
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);

            /*
             * 1. The class name written using UTF encoding.
             */
            dos.writeUTF(name.replace('/', '.'));

            /*
             * 2. The class modifiers written as a 32-bit integer.
             */
            dos.writeInt(access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL | Opcodes.ACC_INTERFACE | Opcodes.ACC_ABSTRACT));

            /*
             * 3. The name of each interface sorted by name written using UTF
             * encoding.
             */
            Arrays.sort(interfaces);
            for (int i = 0; i < interfaces.length; i++) {
                dos.writeUTF(interfaces[i].replace('/', '.'));
            }

            /*
             * 4. For each field of the class sorted by field name (except
             * private static and private transient fields):
             *
             * 1. The name of the field in UTF encoding. 2. The modifiers of the
             * field written as a 32-bit integer. 3. The descriptor of the field
             * in UTF encoding
             *
             * Note that field signatures are not dot separated. Method and
             * constructor signatures are dot separated. Go figure...
             */
            writeItems(svuidFields, dos, false);

            /*
             * 5. If a class initializer exists, write out the following: 1. The
             * name of the method, <clinit>, in UTF encoding. 2. The modifier of
             * the method, java.lang.reflect.Modifier.STATIC, written as a
             * 32-bit integer. 3. The descriptor of the method, ()V, in UTF
             * encoding.
             */
            if (hasStaticInitializer) {
                dos.writeUTF("<clinit>");
                dos.writeInt(Opcodes.ACC_STATIC);
                dos.writeUTF("()V");
            } // if..

            /*
             * 6. For each non-private constructor sorted by method name and
             * signature: 1. The name of the method, <init>, in UTF encoding. 2.
             * The modifiers of the method written as a 32-bit integer. 3. The
             * descriptor of the method in UTF encoding.
             */
            writeItems(svuidConstructors, dos, true);

            /*
             * 7. For each non-private method sorted by method name and
             * signature: 1. The name of the method in UTF encoding. 2. The
             * modifiers of the method written as a 32-bit integer. 3. The
             * descriptor of the method in UTF encoding.
             */
            writeItems(svuidMethods, dos, true);

            dos.flush();

            /*
             * 8. The SHA-1 algorithm is executed on the stream of bytes
             * produced by DataOutputStream and produces five 32-bit values
             * sha[0..4].
             */
            byte[] hashBytes = computeSHAdigest(bos.toByteArray());

            /*
             * 9. The hash value is assembled from the first and second 32-bit
             * values of the SHA-1 message digest. If the result of the message
             * digest, the five 32-bit words H0 H1 H2 H3 H4, is in an array of
             * five int values named sha, the hash value would be computed as
             * follows:
             *
             * long hash = ((sha[0] >>> 24) & 0xFF) | ((sha[0] >>> 16) & 0xFF) <<
             * 8 | ((sha[0] >>> 8) & 0xFF) << 16 | ((sha[0] >>> 0) & 0xFF) <<
             * 24 | ((sha[1] >>> 24) & 0xFF) << 32 | ((sha[1] >>> 16) & 0xFF) <<
             * 40 | ((sha[1] >>> 8) & 0xFF) << 48 | ((sha[1] >>> 0) & 0xFF) <<
             * 56;
             */
            for (int i = Math.min(hashBytes.length, 8) - 1; i >= 0; i--) {
                svuid = (svuid << 8) | (hashBytes[i] & 0xFF);
            }
        } finally {
            // close the stream (if open)
            if (dos != null) {
                dos.close();
            }
        }

        return svuid;
    }

    /**
     * Returns the SHA-1 message digest of the given value.
     *
     * @param value the value whose SHA message digest must be computed.
     * @return the SHA-1 message digest of the given value.
     */
    protected byte[] computeSHAdigest(final byte[] value) {
        try {
            return MessageDigest.getInstance("SHA").digest(value);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e.toString());
        }
    }

    /**
     * Sorts the items in the collection and writes it to the data output stream
     *
     * @param itemCollection collection of items
     * @param dos            a <code>DataOutputStream</code> value
     * @param dotted         a <code>boolean</code> value
     * @throws IOException if an error occurs
     */
    private static void writeItems(final Collection itemCollection, final DataOutput dos, final boolean dotted) throws IOException {
        int size = itemCollection.size();
        Item[] items = (Item[]) itemCollection.toArray(new Item[size]);
        Arrays.sort(items);
        for (int i = 0; i < size; i++) {
            dos.writeUTF(items[i].name);
            dos.writeInt(items[i].access);
            dos.writeUTF(dotted ? items[i].desc.replace('/', '.') : items[i].desc);
        }
    }

    // ------------------------------------------------------------------------
    // Inner classes
    // ------------------------------------------------------------------------

    static class Item implements Comparable {

        final String name;

        final int access;

        final String desc;

        Item(final String name, final int access, final String desc) {
            this.name = name;
            this.access = access;
            this.desc = desc;
        }

        public int compareTo(final Object o) {
            Item other = (Item) o;
            int retVal = name.compareTo(other.name);
            if (retVal == 0) {
                retVal = desc.compareTo(other.desc);
            }
            return retVal;
        }
    }
}
