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

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.ClassInfo;
import com.ziotic.jode.bytecode.SearchPath;

/**
 * This is the interface that other java classes may use to decompile
 * classes.  Feel free to use it in your own GNU GPL'ed project.
 * Please tell me about your project.<br>
 * <p/>
 * Note that the GNU GPL doesn't allow you to use this interface in
 * commercial programs.
 *
 * @author <a href="mailto:jochen@gnu.org">Jochen Hoenicke</a>
 * @version 1.0
 */
public class Decompiler {
    private SearchPath searchPath = null;
    private int importPackageLimit = ImportHandler.DEFAULT_PACKAGE_LIMIT;
    private int importClassLimit = ImportHandler.DEFAULT_CLASS_LIMIT;

    /**
     * We need a different pathSeparatorChar, since ':' (used for most
     * UNIX System) is used a protocol separator in URLs.
     * <p/>
     * We currently allow both pathSeparatorChar and
     * altPathSeparatorChar and decide if it is a protocol separator
     * by context.
     */
    public static final char altPathSeparatorChar = SearchPath.altPathSeparatorChar;

    /**
     * Create a new decompiler.
     */
    public Decompiler() {
    }

    /**
     * Sets the class path.  Should be called once before decompile is
     * called, otherwise the system class path is used.
     *
     * @param classpath A comma separated classpath.
     * @throws NullPointerException if classpath is null.
     * @see #setClassPath(String[])
     */
    public void setClassPath(String classpath) {
        searchPath = new SearchPath(classpath);
    }

    /**
     * Set the class path.  Should be called once before decompile is
     * called, otherwise the system class path is used.
     *
     * @param classpath a non empty array of jar files and directories;
     *                  URLs are allowed, too.
     * @throws NullPointerException      if classpath is null.
     * @throws IndexOutOfBoundsException if classpath array is empty.
     * @see #setClassPath(String)
     */
    public void setClassPath(String[] classpath) {
        StringBuffer sb = new StringBuffer(classpath[0]);
        for (int i = 1; i < classpath.length; i++)
            sb.append(altPathSeparatorChar).append(classpath[i]);
        searchPath = new SearchPath(sb.toString());
    }

    private static final String[] optionStrings = {"lvt", "inner", "anonymous", "push", "pretty", "decrypt", "onetime", "immediate", "verify", "contrafo"};

    /**
     * Set an option.
     *
     * @param option the option (pretty, style, decrypt, verify, etc.)
     * @param value  ("1"/"0" for on/off, "sun"/"gnu" for style)
     * @throws IllegalArgumentException if option or value is invalid.
     */
    public void setOption(String option, String value) {
        if (option.equals("style")) {
            if (value.equals("gnu"))
                Options.outputStyle = Options.GNU_STYLE;
            else if (value.equals("sun"))
                Options.outputStyle = Options.SUN_STYLE;
            else if (value.equals("pascal"))
                Options.outputStyle = Options.PASCAL_STYLE;
            else
                throw new IllegalArgumentException("Invalid style " + value);
            return;
        }
        if (option.equals("import")) {
            int comma = value.indexOf(',');
            int packLimit = Integer.parseInt(value.substring(0, comma));
            if (packLimit == 0)
                packLimit = Integer.MAX_VALUE;
            int clazzLimit = Integer.parseInt(value.substring(comma + 1));
            if (clazzLimit == 0)
                clazzLimit = Integer.MAX_VALUE;
            if (clazzLimit < 0 || packLimit < 0)
                throw new IllegalArgumentException("Option import doesn't allow negative parameters");
            importPackageLimit = packLimit;
            importClassLimit = clazzLimit;
            return;
        }
        if (option.equals("verbose")) {
            GlobalOptions.verboseLevel = Integer.parseInt(value);
            return;
        }
        for (int i = 0; i < optionStrings.length; i++) {
            if (option.equals(optionStrings[i])) {
                if (value.equals("0") || value.equals("off") || value.equals("no"))
                    Options.options &= ~(1 << i);
                else if (value.equals("1") || value.equals("on") || value.equals("yes"))
                    Options.options |= 1 << i;
                else
                    throw new IllegalArgumentException("Illegal value for " + option);
                return;
            }
        }
        throw new IllegalArgumentException("Illegal option: " + option);
    }

    /**
     * Set the stream where copyright and warnings/errors are printed
     * to.
     *
     * @param errorStream the error stream. Note that this is a
     *                    PrintWriter, not a PrintStream (which are deprecated since 1.1).
     */
    public void setErr(PrintWriter errorStream) {
        GlobalOptions.err = errorStream;
    }

    /**
     * Decompile a class.
     *
     * @param className full-qualified classname, dot separated, e.g.
     *                  "java.lang.Object"
     * @param writer    The stream where the decompiled code should be
     *                  written.  Hint:  Use a BufferedWriter for good performance.
     * @param progress  A progress listener (see below).  Null if you
     *                  don't need information about progress.
     * @throws IllegalArgumentException if className isn't correct.
     * @throws com.ziotic.jode.jvm.VerifyException
     *                                  The code
     *                                  isn't valid or a dependent class, needed for type
     *                                  guessing, couldn't be found.
     * @throws IOException              if writer throws an exception.
     * @throws RuntimeException         If jode has a bug ;-)
     */
    public void decompile(String className, Writer writer, ProgressListener progress) throws java.io.IOException {
        if (searchPath == null) {
            String classPath = System.getProperty("java.class.path").replace(File.pathSeparatorChar, altPathSeparatorChar);
            searchPath = new SearchPath(classPath);
        }

        ClassInfo.setClassPath(searchPath);
        ClassInfo clazz = ClassInfo.forName(className);
        ImportHandler imports = new ImportHandler(importPackageLimit, importClassLimit);
        TabbedPrintWriter tabbedWriter = new TabbedPrintWriter(writer, imports, false);
        ClassAnalyzer clazzAna = new ClassAnalyzer(null, clazz, imports);
        clazzAna.dumpJavaFile(tabbedWriter, progress);
        writer.flush();
    }
}
