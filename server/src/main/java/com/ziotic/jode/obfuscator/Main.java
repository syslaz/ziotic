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

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Random;

import com.ziotic.gnu.getopt.Getopt;
import com.ziotic.gnu.getopt.LongOpt;
import com.ziotic.jode.GlobalOptions;

public class Main {
    public static boolean swapOrder = false;

    public static final int OPTION_STRONGOVERLOAD = 0x0001;
    public static final int OPTION_PRESERVESERIAL = 0x0002;
    public static int options = OPTION_PRESERVESERIAL;

    private static final LongOpt[] longOptions = new LongOpt[]{new LongOpt("cp", LongOpt.REQUIRED_ARGUMENT, null, 'c'), new LongOpt("classpath", LongOpt.REQUIRED_ARGUMENT, null, 'c'), new LongOpt("destpath", LongOpt.REQUIRED_ARGUMENT, null, 'd'), new LongOpt("help", LongOpt.NO_ARGUMENT, null, 'h'), new LongOpt("version", LongOpt.NO_ARGUMENT, null, 'V'), new LongOpt("verbose", LongOpt.OPTIONAL_ARGUMENT, null, 'v'), new LongOpt("debug", LongOpt.OPTIONAL_ARGUMENT, null, 'D'),};

    public static final String[] stripNames = {"unreach", "inner", "lvt", "lnt", "source"};
    public static final int STRIP_UNREACH = 0x0001;
    public static final int STRIP_INNERINFO = 0x0002;
    public static final int STRIP_LVT = 0x0004;
    public static final int STRIP_LNT = 0x0008;
    public static final int STRIP_SOURCE = 0x0010;
    public static int stripping = 0;
    /**
     * A random pool used to destroy order of method identifiers and
     * classes in packages.  <br>
     * <p/>
     * A pseudo random is enough, no need to generate the seed
     * securely.  This makes obfuscating errors reproducable.
     */
    public static Random rand = new Random(123456);

    private static ClassBundle bundle;

    public static void usage() {
        PrintWriter err = GlobalOptions.err;
        err.println("usage: jode.Obfuscator flags* script");
        err.println("  -h, --help           " + "show this information.");
        err.println("  -V, --version        " + "output version information and exit.");
        err.println("  -v, --verbose        " + "be verbose (multiple times means more verbose).");
        err.println("  -c, --classpath <path> " + "search for classes in specified classpath.");
        err.println("                       " + "The directories should be separated by ','.");
        err.println("  -d, --dest <dir>     " + "write decompiled files to disk into directory destdir.");
        err.println("  -D, --debug=...      " + "use --debug=help for more information.");
    }

    public static ClassBundle getClassBundle() {
        return bundle;
    }

    public static void main(String[] params) {
        if (params.length == 0) {
            usage();
            return;
        }
        String cp = null, dest = null;

        GlobalOptions.err.println(GlobalOptions.copyright);
        bundle = new ClassBundle();
        boolean errorInParams = false;
        Getopt g = new Getopt("jode.obfuscator.Main", params, "hVvc:d:D:", longOptions, true);
        for (int opt = g.getopt(); opt != -1; opt = g.getopt()) {
            switch (opt) {
                case 0:
                    break;
                case 'h':
                    usage();
                    errorInParams = true;
                    break;
                case 'V':
                    GlobalOptions.err.println(GlobalOptions.version);
                    break;
                case 'c':
                    cp = g.getOptarg();
                    break;
                case 'd':
                    dest = g.getOptarg();
                    break;
                case 'v': {
                    String arg = g.getOptarg();
                    if (arg == null)
                        GlobalOptions.verboseLevel++;
                    else {
                        try {
                            GlobalOptions.verboseLevel = Integer.parseInt(arg);
                        } catch (NumberFormatException ex) {
                            GlobalOptions.err.println("jode.obfuscator.Main: Argument `" + arg + "' to --verbose must be numeric:");
                            errorInParams = true;
                        }
                    }
                    break;
                }
                case 'D': {
                    String arg = g.getOptarg();
                    if (arg == null)
                        arg = "help";
                    errorInParams |= !GlobalOptions.setDebugging(arg);
                    break;
                }
                default:
                    errorInParams = true;
                    break;
            }
        }
        if (errorInParams)
            return;

        if (g.getOptind() != params.length - 1) {
            GlobalOptions.err.println("You must specify exactly one script.");
            return;
        }

        try {
            String filename = params[g.getOptind()];
            ScriptParser parser = new ScriptParser(filename.equals("-") ? new InputStreamReader(System.in) : new FileReader(filename));
            parser.parseOptions(bundle);
        } catch (IOException ex) {
            GlobalOptions.err.println("IOException while reading script file.");
            ex.printStackTrace(GlobalOptions.err);
            return;
        } catch (ParseException ex) {
            GlobalOptions.err.println("Syntax error in script file: ");
            GlobalOptions.err.println(ex.getMessage());
            if (GlobalOptions.verboseLevel > 5)
                ex.printStackTrace(GlobalOptions.err);
            return;
        }

        // Command Line overwrites script options:
        if (cp != null)
            bundle.setOption("classpath", Collections.singleton(cp));
        if (dest != null)
            bundle.setOption("dest", Collections.singleton(dest));

        bundle.run();
    }
}
