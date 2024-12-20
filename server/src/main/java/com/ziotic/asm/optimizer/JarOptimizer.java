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

import java.io.*;
import java.util.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import com.ziotic.asm.ClassReader;
import com.ziotic.asm.FieldVisitor;
import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.commons.EmptyVisitor;

/**
 * A Jar file optimizer.
 *
 * @author Eric Bruneton
 */
public class JarOptimizer {

    static final Set API = new HashSet();
    static final Map HIERARCHY = new HashMap();

    public static void main(final String[] args) throws IOException {
        File f = new File(args[0]);
        InputStream is = new GZIPInputStream(new FileInputStream(f));
        BufferedReader lnr = new LineNumberReader(new InputStreamReader(is));
        while (true) {
            String line = lnr.readLine();
            if (line != null) {
                if (line.startsWith("class")) {
                    String c = line.substring(6, line.lastIndexOf(' '));
                    String sc = line.substring(line.lastIndexOf(' ') + 1);
                    HIERARCHY.put(c, sc);
                } else {
                    API.add(line);
                }
            } else {
                break;
            }
        }
        optimize(new File(args[1]));
    }

    static void optimize(final File f) throws IOException {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; ++i) {
                optimize(files[i]);
            }
        } else if (f.getName().endsWith(".jar")) {
            File g = new File(f.getParentFile(), f.getName() + ".new");
            ZipFile zf = new ZipFile(f);
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(g));
            Enumeration e = zf.entries();
            byte[] buf = new byte[10000];
            while (e.hasMoreElements()) {
                ZipEntry ze = (ZipEntry) e.nextElement();
                if (ze.isDirectory()) {
                    continue;
                }
                out.putNextEntry(ze);
                if (ze.getName().endsWith(".class")) {
                    ClassReader cr = new ClassReader(zf.getInputStream(ze));
                    // cr.accept(new ClassDump(), 0);
                    cr.accept(new ClassVerifier(), 0);
                }
                InputStream is = zf.getInputStream(ze);
                int n;
                do {
                    n = is.read(buf, 0, buf.length);
                    if (n != -1) {
                        out.write(buf, 0, n);
                    }
                } while (n != -1);
                out.closeEntry();
            }
            out.close();
            zf.close();
            f.delete();
            g.renameTo(f);
        }
    }

    static class ClassDump extends EmptyVisitor {

        String owner;

        public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
            owner = name;
            if (owner.startsWith("java/")) {
                System.out.println("class " + name + ' ' + superName);
            }
        }

        public FieldVisitor visitField(final int access, final String name, final String desc, final String signature, final Object value) {
            if (owner.startsWith("java/")) {
                System.out.println(owner + ' ' + name);
            }
            return null;
        }

        public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
            if (owner.startsWith("java/")) {
                System.out.println(owner + ' ' + name + desc);
            }
            return null;
        }
    }

    static class ClassVerifier extends EmptyVisitor {

        String owner;
        String method;

        public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
            owner = name;
        }

        public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
            method = name + desc;
            return this;
        }

        public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
            check(owner, name);
        }

        public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
            check(owner, name + desc);
        }

        private void check(String owner, String member) {
            if (owner.startsWith("java/")) {
                String o = owner;
                while (o != null) {
                    if (API.contains(o + ' ' + member)) {
                        return;
                    }
                    o = (String) HIERARCHY.get(o);
                }
                System.out.println("WARNING: " + owner + ' ' + member + " called in " + this.owner + ' ' + method + " is not defined in JDK 1.3 API");
            }
        }
    }
}
