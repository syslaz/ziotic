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

import com.ziotic.asm.ClassReader;
import com.ziotic.asm.ClassWriter;
import com.ziotic.asm.commons.Remapper;
import com.ziotic.asm.commons.SimpleRemapper;

/**
 * A class file shrinker utility.
 *
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
public class Shrinker {

    static final Properties MAPPING = new Properties();

    public static void main(final String[] args) throws IOException {
        int n = args.length - 1;
        for (int i = 0; i < n - 1; ++i) {
            MAPPING.load(new FileInputStream(args[i]));
        }
        final Set unused = new HashSet(MAPPING.keySet());

        File f = new File(args[n - 1]);
        File d = new File(args[n]);

        optimize(f, d, new SimpleRemapper(MAPPING) {
            public String map(String key) {
                String s = super.map(key);
                if (s != null) {
                    unused.remove(key);
                }
                return s;
            }
        });

        Iterator i = unused.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            if (!s.endsWith("/remove")) {
                System.out.println("INFO: unused mapping " + s);
            }
        }
    }

    static void optimize(final File f, final File d, final Remapper remapper) throws IOException {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; ++i) {
                optimize(files[i], d, remapper);
            }
        } else if (f.getName().endsWith(".class")) {
            ConstantPool cp = new ConstantPool();
            ClassReader cr = new ClassReader(new FileInputStream(f));
            ClassWriter cw = new ClassWriter(0);
            ClassConstantsCollector ccc = new ClassConstantsCollector(cw, cp);
            ClassOptimizer co = new ClassOptimizer(ccc, remapper);
            cr.accept(co, ClassReader.SKIP_DEBUG);

            Set constants = new TreeSet(new ConstantComparator());
            constants.addAll(cp.values());

            cr = new ClassReader(cw.toByteArray());
            cw = new ClassWriter(0);
            Iterator i = constants.iterator();
            while (i.hasNext()) {
                Constant c = (Constant) i.next();
                c.write(cw);
            }
            cr.accept(cw, ClassReader.SKIP_DEBUG);

            if (MAPPING.getProperty(cr.getClassName() + "/remove") != null) {
                return;
            }
            String n = remapper.mapType(cr.getClassName());
            File g = new File(d, n + ".class");
            if (!g.exists() || g.lastModified() < f.lastModified()) {
                g.getParentFile().mkdirs();
                OutputStream os = new FileOutputStream(g);
                os.write(cw.toByteArray());
                os.close();
            }
        }
    }

    static class ConstantComparator implements Comparator {

        public int compare(final Object o1, final Object o2) {
            Constant c1 = (Constant) o1;
            Constant c2 = (Constant) o2;
            int d = getSort(c1) - getSort(c2);
            if (d == 0) {
                switch (c1.type) {
                    case 'I':
                        return new Integer(c1.intVal).compareTo(new Integer(c2.intVal));
                    case 'J':
                        return new Long(c1.longVal).compareTo(new Long(c2.longVal));
                    case 'F':
                        return new Float(c1.floatVal).compareTo(new Float(c2.floatVal));
                    case 'D':
                        return new Double(c1.doubleVal).compareTo(new Double(c2.doubleVal));
                    case 's':
                    case 'S':
                    case 'C':
                        return c1.strVal1.compareTo(c2.strVal1);
                    case 'T':
                        d = c1.strVal1.compareTo(c2.strVal1);
                        if (d == 0) {
                            d = c1.strVal2.compareTo(c2.strVal2);
                        }
                        break;
                    default:
                        d = c1.strVal1.compareTo(c2.strVal1);
                        if (d == 0) {
                            d = c1.strVal2.compareTo(c2.strVal2);
                            if (d == 0) {
                                d = c1.strVal3.compareTo(c2.strVal3);
                            }
                        }
                }
            }
            return d;
        }

        private static int getSort(final Constant c) {
            switch (c.type) {
                case 'I':
                    return 0;
                case 'J':
                    return 1;
                case 'F':
                    return 2;
                case 'D':
                    return 3;
                case 's':
                    return 4;
                case 'S':
                    return 5;
                case 'C':
                    return 6;
                case 'T':
                    return 7;
                case 'G':
                    return 8;
                case 'M':
                    return 9;
                default:
                    return 10;
            }
        }
    }
}
