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
package com.ziotic.jode.obfuscator;

import java.io.*;
import java.util.*;
import java.util.zip.ZipOutputStream;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.ClassInfo;
import com.ziotic.jode.bytecode.Reference;
import com.ziotic.jode.bytecode.SearchPath;
import com.ziotic.jode.obfuscator.modules.MultiIdentifierMatcher;
import com.ziotic.jode.obfuscator.modules.SimpleAnalyzer;
import com.ziotic.jode.obfuscator.modules.WildCard;

///#ifdef JDK12
///#endif

public class ClassBundle implements OptionHandler {
    PackageIdentifier basePackage;

    /**
     * the identifiers that must be analyzed.
     */
    Set toAnalyze = new HashSet();

    String classPath;
    String destDir;

    String inTableFile;
    String outTableFile;
    String outRevTableFile;

    IdentifierMatcher loading;
    IdentifierMatcher preserving;
    IdentifierMatcher reaching;
    CodeTransformer[] preTrafos;
    CodeAnalyzer analyzer;
    CodeTransformer[] postTrafos;
    Renamer renamer;

    public ClassBundle() {
        classPath = System.getProperty("java.class.path").replace(File.pathSeparatorChar, SearchPath.altPathSeparatorChar);
        destDir = ".";
        basePackage = new PackageIdentifier(this, null, "", "");
        basePackage.setReachable();
        basePackage.setPreserved();
    }

    ///#ifdef JDK12
    private static final Map aliasesHash = new WeakHashMap();
    ///#else
///    private static final Map aliasesHash = new HashMap();
///#endif
    private static final Map clazzCache = new HashMap();
    private static final Map referenceCache = new HashMap();

    public static void setStripOptions(Collection stripString) {
    }

    public void setOption(String option, Collection values) {
        if (option.equals("classpath")) {
            Iterator i = values.iterator();
            StringBuffer sb = new StringBuffer((String) i.next());
            while (i.hasNext()) {
                sb.append(SearchPath.altPathSeparatorChar).append((String) i.next());
            }
            ClassInfo.setClassPath(sb.toString());
            return;
        }

        if (option.equals("dest")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one destination path allowed");
            destDir = (String) values.iterator().next();
            return;
        }

        if (option.equals("verbose")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Verbose takes one int parameter");
            GlobalOptions.verboseLevel = ((Integer) values.iterator().next()).intValue();
            return;
        }

        if (option.equals("intable") || option.equals("table")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one destination path allowed");
            inTableFile = (String) values.iterator().next();
            return;
        }

        if (option.equals("outtable")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one destination path allowed");
            outTableFile = (String) values.iterator().next();
            return;
        }

        if (option.equals("outrevtable") || option.equals("revtable")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one destination path allowed");
            outRevTableFile = (String) values.iterator().next();
            return;
        }

        if (option.equals("strip")) {
            next_token:
            for (Iterator iter = values.iterator(); iter.hasNext(); ) {
                String token = (String) iter.next();
                for (int i = 0; i < Main.stripNames.length; i++) {
                    if (token.equals(Main.stripNames[i])) {
                        Main.stripping |= 1 << i;
                        continue next_token;
                    }
                }
                throw new IllegalArgumentException("Unknown strip option: `" + token + "'");
            }
            return;
        }

        if (option.equals("load")) {
            if (values.size() == 1) {
                Object value = values.iterator().next();
                if (value instanceof String)
                    loading = new WildCard((String) value);
                else
                    loading = (IdentifierMatcher) value;
            } else {
                IdentifierMatcher[] matchers = new IdentifierMatcher[values.size()];
                int j = 0;
                for (Iterator i = values.iterator(); i.hasNext(); ) {
                    Object value = i.next();
                    matchers[j++] = (value instanceof String ? new WildCard((String) value) : (IdentifierMatcher) value);
                }
                loading = new MultiIdentifierMatcher(MultiIdentifierMatcher.OR, matchers);
            }
            return;
        }

        if (option.equals("preserve")) {
            if (values.size() == 1) {
                Object value = values.iterator().next();
                if (value instanceof String)
                    preserving = new WildCard((String) value);
                else
                    preserving = (IdentifierMatcher) value;
            } else {
                IdentifierMatcher[] matchers = new IdentifierMatcher[values.size()];
                int j = 0;
                for (Iterator i = values.iterator(); i.hasNext(); ) {
                    Object value = i.next();
                    matchers[j++] = (value instanceof String ? new WildCard((String) value) : (IdentifierMatcher) value);
                }
                preserving = new MultiIdentifierMatcher(MultiIdentifierMatcher.OR, matchers);
            }
            return;
        }

        if (option.equals("reach")) {
            // NOT IMPLEMENTED YET
            if (values.size() == 1) {
                Object value = values.iterator().next();
                if (value instanceof String)
                    reaching = new WildCard((String) value);
                else
                    reaching = (IdentifierMatcher) value;
            } else {
                IdentifierMatcher[] matchers = new IdentifierMatcher[values.size()];
                int j = 0;
                for (Iterator i = values.iterator(); i.hasNext(); ) {
                    Object value = i.next();
                    matchers[j++] = (value instanceof String ? new WildCard((String) value) : (IdentifierMatcher) value);
                }
                reaching = new MultiIdentifierMatcher(MultiIdentifierMatcher.OR, matchers);
            }
        }

        if (option.equals("pre")) {
            preTrafos = (CodeTransformer[]) values.toArray(new CodeTransformer[values.size()]);
            return;
        }
        if (option.equals("analyzer")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one analyzer is allowed");
            analyzer = (CodeAnalyzer) values.iterator().next();
            return;
        }
        if (option.equals("post")) {
            postTrafos = (CodeTransformer[]) values.toArray(new CodeTransformer[values.size()]);
            return;
        }

        if (option.equals("renamer")) {
            if (values.size() != 1)
                throw new IllegalArgumentException("Only one renamer allowed");
            renamer = (Renamer) values.iterator().next();
            return;
        }
        throw new IllegalArgumentException("Invalid option `" + option + "'.");
    }

    public Reference getReferenceAlias(Reference ref) {
        Reference alias = (Reference) aliasesHash.get(ref);
        if (alias == null) {
            Identifier ident = getIdentifier(ref);
            String newType = getTypeAlias(ref.getType());
            if (ident == null)
                alias = Reference.getReference(ref.getClazz(), ref.getName(), newType);
            else
                alias = Reference.getReference("L" + ident.getParent().getFullAlias().replace('.', '/') + ';', ident.getAlias(), newType);
            aliasesHash.put(ref, alias);
        }
        return alias;
    }

    public String getClassAlias(String className) {
        ClassIdentifier classIdent = getClassIdentifier(className);
        if (classIdent == null)
            return className;
        return classIdent.getFullAlias();
    }

    public String getTypeAlias(String typeSig) {
        String alias = (String) aliasesHash.get(typeSig);
        if (alias == null) {
            StringBuffer newSig = new StringBuffer();
            int index = 0, nextindex;
            while ((nextindex = typeSig.indexOf('L', index)) != -1) {
                newSig.append(typeSig.substring(index, nextindex + 1));
                index = typeSig.indexOf(';', nextindex);
                String typeAlias = getClassAlias(typeSig.substring(nextindex + 1, index).replace('/', '.'));
                newSig.append(typeAlias.replace('.', '/'));
            }
            alias = newSig.append(typeSig.substring(index)).toString().intern();
            aliasesHash.put(typeSig, alias);
        }
        return alias;
    }

    public void addClassIdentifier(Identifier ident) {
    }

    public ClassIdentifier getClassIdentifier(String name) {
        if (clazzCache.containsKey(name))
            return (ClassIdentifier) clazzCache.get(name);
        ClassIdentifier ident = (ClassIdentifier) basePackage.getIdentifier(name);
        clazzCache.put(name, ident);
        return ident;
    }

    public Identifier getIdentifier(Reference ref) {
        if (referenceCache.containsKey(ref))
            return (Identifier) referenceCache.get(ref);

        String clName = ref.getClazz();
        if (clName.charAt(0) == '[')
            /* Can't represent arrays */
            return null;
        ClassIdentifier clazzIdent = getClassIdentifier(clName.substring(1, clName.length() - 1).replace('/', '.'));
        Identifier ident = clazzIdent == null ? null : clazzIdent.getIdentifier(ref.getName(), ref.getType());
        referenceCache.put(ref, ident);
        return ident;
    }

    public void reachableClass(String clazzName) {
        ClassIdentifier ident = getClassIdentifier(clazzName);
        if (ident != null)
            ident.setReachable();
    }

    public void reachableReference(Reference ref, boolean isVirtual) {
        String clName = ref.getClazz();
        if (clName.charAt(0) == '[')
            /* Can't represent arrays */
            return;
        ClassIdentifier ident = getClassIdentifier(clName.substring(1, clName.length() - 1).replace('/', '.'));
        if (ident != null)
            ident.reachableReference(ref, isVirtual);
    }

    public void analyzeIdentifier(Identifier ident) {
        if (ident == null)
            throw new NullPointerException();
        toAnalyze.add(ident);
    }

    public void analyze() {
        while (!toAnalyze.isEmpty()) {
            Identifier ident = (Identifier) toAnalyze.iterator().next();
            toAnalyze.remove(ident);
            ident.analyze();
        }
    }

    public IdentifierMatcher getPreserveRule() {
        return preserving;
    }

    public CodeAnalyzer getCodeAnalyzer() {
        return analyzer;
    }

    public CodeTransformer[] getPreTransformers() {
        return preTrafos;
    }

    public CodeTransformer[] getPostTransformers() {
        return postTrafos;
    }

    public void buildTable(Renamer renameRule) {
        basePackage.buildTable(renameRule);
    }

    public void readTable() {
        try {
            TranslationTable table = new TranslationTable();
            InputStream input = new FileInputStream(inTableFile);
            table.load(input);
            input.close();
            basePackage.readTable(table);
        } catch (java.io.IOException ex) {
            GlobalOptions.err.println("Can't read rename table " + inTableFile);
            ex.printStackTrace(GlobalOptions.err);
        }
    }

    public void writeTable() {
        TranslationTable table = new TranslationTable();
        basePackage.writeTable(table, false);
        try {
            OutputStream out = new FileOutputStream(outTableFile);
            table.store(out);
            out.close();
        } catch (java.io.IOException ex) {
            GlobalOptions.err.println("Can't write rename table " + outTableFile);
            ex.printStackTrace(GlobalOptions.err);
        }
    }

    public void writeRevTable() {
        TranslationTable revtable = new TranslationTable();
        basePackage.writeTable(revtable, true);
        try {
            OutputStream out = new FileOutputStream(outRevTableFile);
            revtable.store(out);
            out.close();
        } catch (java.io.IOException ex) {
            GlobalOptions.err.println("Can't write rename table " + outRevTableFile);
            ex.printStackTrace(GlobalOptions.err);
        }
    }

    public void doTransformations() {
        basePackage.doTransformations();
    }

    public void storeClasses() {
        if (destDir.endsWith(".jar") || destDir.endsWith(".zip")) {
            try {
                ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(destDir));
                basePackage.storeClasses(zip);
                zip.close();
            } catch (IOException ex) {
                GlobalOptions.err.println("Can't write zip file: " + destDir);
                ex.printStackTrace(GlobalOptions.err);
            }
        } else {
            File directory = new File(destDir);
            if (!directory.exists()) {
                GlobalOptions.err.println("Destination directory " + directory.getPath() + " doesn't exists.");
                return;
            }
            basePackage.storeClasses(new File(destDir));
        }
    }

    public void run() {
        if (analyzer == null)
            analyzer = new SimpleAnalyzer();
        if (preTrafos == null)
            preTrafos = new CodeTransformer[0];
        if (postTrafos == null)
            postTrafos = new CodeTransformer[0];
        if (renamer == null)
            renamer = new Renamer() {
                public Iterator generateNames(Identifier ident) {
                    final String base = ident.getName();
                    return new Iterator() {
                        int last = 0;

                        public boolean hasNext() {
                            return true;
                        }

                        public Object next() {
                            return (last++ == 0 ? base : base + last);
                        }

                        public void remove() {
                            throw new UnsupportedOperationException();
                        }
                    };
                }
            };

        Runtime runtime = Runtime.getRuntime();
        long free = runtime.freeMemory();
        long last;
        do {
            last = free;
            runtime.gc();
            runtime.runFinalization();
            free = runtime.freeMemory();
        } while (free < last);
        System.err.println("used before: " + (runtime.totalMemory() - free));

        GlobalOptions.err.println("Loading and preserving classes");

        long time = System.currentTimeMillis();
        basePackage.loadMatchingClasses(loading);
        basePackage.applyPreserveRule(preserving);
        System.err.println("Time used: " + (System.currentTimeMillis() - time));

        GlobalOptions.err.println("Computing reachability");
        time = System.currentTimeMillis();
        analyze();
        System.err.println("Time used: " + (System.currentTimeMillis() - time));

        free = runtime.freeMemory();
        do {
            last = free;
            runtime.gc();
            runtime.runFinalization();
            free = runtime.freeMemory();
        } while (free < last);
        System.err.println("used after analyze: " + (runtime.totalMemory() - free));

        GlobalOptions.err.println("Renaming methods");
        time = System.currentTimeMillis();
        if (inTableFile != null)
            readTable();
        buildTable(renamer);
        if (outTableFile != null)
            writeTable();
        if (outRevTableFile != null)
            writeRevTable();
        System.err.println("Time used: " + (System.currentTimeMillis() - time));

        GlobalOptions.err.println("Transforming the classes");
        time = System.currentTimeMillis();
        doTransformations();
        System.err.println("Time used: " + (System.currentTimeMillis() - time));

        free = runtime.freeMemory();
        do {
            last = free;
            runtime.gc();
            runtime.runFinalization();
            free = runtime.freeMemory();
        } while (free < last);
        System.err.println("used after transform: " + (runtime.totalMemory() - free));

        GlobalOptions.err.println("Writing new classes");
        time = System.currentTimeMillis();
        storeClasses();
        System.err.println("Time used: " + (System.currentTimeMillis() - time));
    }
}
