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
package com.ziotic.jode.decompiler;

import java.util.*;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.ClassInfo;
import com.ziotic.jode.bytecode.InnerClassInfo;
import com.ziotic.jode.type.ArrayType;
import com.ziotic.jode.type.ClassInterfacesType;
import com.ziotic.jode.type.NullType;
import com.ziotic.jode.type.Type;

public class ImportHandler {
    /**
     * The default package limit.  MAX_VALUE means, do not import
     * packages at all.
     */
    public final static int DEFAULT_PACKAGE_LIMIT = Integer.MAX_VALUE;
    /**
     * The default class limit.  1 means, import every class used here.
     */
    public final static int DEFAULT_CLASS_LIMIT = 1;

    SortedMap imports;
    /* Classes that doesn't need to be qualified. */ Hashtable cachedClassNames = null;
    ClassAnalyzer main;
    String className;
    String pkg;

    int importPackageLimit;
    int importClassLimit;

    /**
     * A comparator to sort the imports.  We want java.* and javax.*
     * imports first.  java.lang.* should precede java.lang.ref.*, but
     * that is already guaranteed by ascii ordering.
     */
    static Comparator comparator = new Comparator() {
        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            boolean java1 = s1.startsWith("java");
            boolean java2 = s2.startsWith("java");

            if (java1 != java2)
                return java1 ? -1 : 1;
            return s1.compareTo(s2);
        }
    };

    public ImportHandler() {
        this(DEFAULT_PACKAGE_LIMIT, DEFAULT_CLASS_LIMIT);
    }

    public ImportHandler(int packageLimit, int classLimit) {
        importPackageLimit = packageLimit;
        importClassLimit = classLimit;
    }

    /**
     * Checks if the className conflicts with a class imported from
     * another package and must be fully qualified therefore.
     * The imports must should have been cleaned up before.
     * <p/>
     * Known Bug: If a class, local, field or method with the same
     * name as the package of className exists, using the fully
     * qualified name is no solution.  This sometimes can't be fixed
     * at all (except by renaming the package).  It happens only in
     * ambigous contexts, namely static field/method access.
     *
     * @param name The full qualified class name.
     * @return true if this className must be printed fully qualified.
     */
    private boolean conflictsImport(String name) {
        int pkgdelim = name.lastIndexOf('.');
        if (pkgdelim != -1) {
            String pkgName = name.substring(0, pkgdelim);
            /* All classes in this package doesn't conflict */
            if (pkgName.equals(pkg))
                return false;

            // name without package, but _including_ leading dot.
            name = name.substring(pkgdelim);

            if (pkg.length() != 0) {
                /* Does this conflict with a class in this package? */
                if (ClassInfo.exists(pkg + name))
                    return true;
            } else {
                /* Does this conflict with a class in this unnamed
              * package? */
                if (ClassInfo.exists(name.substring(1)))
                    return true;
            }

            Iterator iter = imports.keySet().iterator();
            while (iter.hasNext()) {
                String importName = (String) iter.next();
                if (importName.endsWith(".*")) {
                    /* strip the "*" */
                    importName = importName.substring(0, importName.length() - 2);
                    if (!importName.equals(pkgName)) {
                        if (ClassInfo.exists(importName + name))
                            return true;
                    }
                } else {
                    /* Is this a class import with same name? */
                    if (importName.endsWith(name) || importName.equals(name.substring(1)))
                        return true;
                }
            }
        }
        return false;
    }

    private void cleanUpImports() {
        Integer dummyVote = new Integer(Integer.MAX_VALUE);
        SortedMap newImports = new TreeMap(comparator);
        List classImports = new LinkedList();
        Iterator iter = imports.keySet().iterator();
        while (iter.hasNext()) {
            String importName = (String) iter.next();
            Integer vote = (Integer) imports.get(importName);
            if (!importName.endsWith(".*")) {
                if (vote.intValue() < importClassLimit)
                    continue;
                int delim = importName.lastIndexOf(".");

                if (delim != -1) {
                    /* Since the imports are sorted, newImports already
                  * contains the package if it should be imported.
                  */
                    if (newImports.containsKey(importName.substring(0, delim) + ".*"))
                        continue;

                    /* This is a single Class import, that is not
                  * superseeded by a package import.  Mark it for
                  * importation, but don't put it in newImports, yet.
                  */
                    classImports.add(importName);
                } else if (pkg.length() != 0) {
                    /* This is a Class import from the unnamed
                  * package.  It must always be imported.
                  */
                    newImports.put(importName, dummyVote);
                }
            } else {
                if (vote.intValue() < importPackageLimit)
                    continue;
                newImports.put(importName, dummyVote);
            }
        }

        imports = newImports;
        cachedClassNames = new Hashtable();
        /* Now check if the class import conflict with any of the
         * package imports.
         */
        iter = classImports.iterator();
        while (iter.hasNext()) {
            /* If there are more than one single class imports with
             * the same name, exactly the first (in sorted order) will
             * be imported.
         */
            String classFQName = (String) iter.next();
            if (!conflictsImport(classFQName)) {
                imports.put(classFQName, dummyVote);
                String name = classFQName.substring(classFQName.lastIndexOf('.') + 1);
                cachedClassNames.put(classFQName, name);
            }
        }
    }

    public void dumpHeader(TabbedPrintWriter writer) throws java.io.IOException {
        writer.println("/* " + className + " - Decompiled by JODE");
        writer.println(" * Visit " + GlobalOptions.URL);
        writer.println(" */");
        if (pkg.length() != 0)
            writer.println("package " + pkg + ";");

        cleanUpImports();
        Iterator iter = imports.keySet().iterator();
        String lastFirstPart = null;
        while (iter.hasNext()) {
            String pkgName = (String) iter.next();
            if (!pkgName.equals("java.lang.*")) {
                int firstDot = pkgName.indexOf('.');
                if (firstDot != -1) {
                    String firstPart = pkgName.substring(0, firstDot);
                    if (lastFirstPart != null && !lastFirstPart.equals(firstPart)) {
                        writer.println("");
                    }
                    lastFirstPart = firstPart;
                }
                writer.println("import " + pkgName + ";");
            }
        }
        writer.println("");
    }

    public void error(String message) {
        GlobalOptions.err.println(message);
    }

    public void init(String className) {
        imports = new TreeMap(comparator);
        /* java.lang is always imported */
        imports.put("java.lang.*", new Integer(Integer.MAX_VALUE));

        int pkgdelim = className.lastIndexOf('.');
        pkg = (pkgdelim == -1) ? "" : className.substring(0, pkgdelim);
        this.className = (pkgdelim == -1) ? className : className.substring(pkgdelim + 1);
    }

    /* Marks the clazz as used, so that it will be imported if used often
     * enough.
     */
    public void useClass(ClassInfo clazz) {
        for (; ; ) {
            /* First handle inner classes:  For class scoped classes
            * import outer class instead;  for method scoped classes
            * we don't import anything.
            */
            InnerClassInfo[] outerInfo = clazz.getOuterClasses();
            if (outerInfo == null)
                break;

            if (outerInfo[0].name == null || outerInfo[0].outer == null)
                return;
            clazz = ClassInfo.forName(outerInfo[0].outer);
        }

        String name = clazz.getName();

        Integer i = (Integer) imports.get(name);
        if (i == null) {
            /* This class wasn't imported before.  Mark the whole package
            * as used once more. */

            int pkgdelim = name.lastIndexOf('.');
            if (pkgdelim != -1) {
                String pkgName = name.substring(0, pkgdelim);
                if (pkgName.equals(pkg))
                    return;

                Integer pkgVote = (Integer) imports.get(pkgName + ".*");
                if (pkgVote != null && pkgVote.intValue() >= importPackageLimit)
                    return;

                pkgVote = (pkgVote == null) ? new Integer(1) : new Integer(pkgVote.intValue() + 1);
                imports.put(pkgName + ".*", pkgVote);
            }
            i = new Integer(1);
        } else {
            if (i.intValue() >= importClassLimit)
                return;
            i = new Integer(i.intValue() + 1);
        }
        imports.put(name, i);
    }

    public final void useType(Type type) {
        if (type instanceof ArrayType)
            useType(((ArrayType) type).getElementType());
        else if (type instanceof ClassInterfacesType)
            useClass(((ClassInterfacesType) type).getClassInfo());
    }

    /**
     * Check if clazz is imported and maybe remove package delimiter from
     * full qualified class name.
     * <p/>
     * Known Bug 1: If this is called before the imports are cleaned up,
     * (that is only for debugging messages), the result is unpredictable.
     * <p/>
     * Known Bug 2: It is not checked if the class name conflicts with
     * a local variable, field or method name.  This is very unlikely
     * since the java standard has different naming convention for those
     * names. (But maybe an intelligent obfuscator may use this fact.)
     * This can only happen with static fields or static methods.
     *
     * @return a legal string representation of clazz.
     */
    public String getClassString(ClassInfo clazz) {
        String name = clazz.getName();
        if (cachedClassNames == null)
            /* We are not yet clean, return the full name */
            return name;

        /* First look in our cache. */
        String cached = (String) cachedClassNames.get(name);
        if (cached != null)
            return cached;

        int pkgdelim = name.lastIndexOf('.');
        if (pkgdelim != -1) {

            String pkgName = name.substring(0, pkgdelim);

            Integer i;
            if (pkgName.equals(pkg) || (imports.get(pkgName + ".*") != null && !conflictsImport(name))) {
                String result = name.substring(pkgdelim + 1);
                cachedClassNames.put(name, result);
                return result;
            }
        }
        cachedClassNames.put(name, name);
        return name;
    }

    public String getTypeString(Type type) {
        if (type instanceof ArrayType)
            return getTypeString(((ArrayType) type).getElementType()) + "[]";
        else if (type instanceof ClassInterfacesType)
            return getClassString(((ClassInterfacesType) type).getClassInfo());
        else if (type instanceof NullType)
            return "Object";
        else
            return type.toString();
    }

    protected int loadFileFlags() {
        return 1;
    }
}
