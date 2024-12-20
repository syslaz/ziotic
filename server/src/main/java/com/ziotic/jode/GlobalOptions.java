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
package com.ziotic.jode;

import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GlobalOptions {
    public final static String version = "1.1.2-pre1";
    public final static String email = "jochen@gnu.org";
    public final static String copyright = "Jode (c) 1998-2001 Jochen Hoenicke <" + email + ">";
    public final static String URL = "http://jode.sourceforge.net/";

    public static PrintWriter err = new PrintWriter(System.err, true);
    public static int verboseLevel = 0;
    public static int debuggingFlags = 0;

    public static final int DEBUG_BYTECODE = 0x001;
    public static final int DEBUG_VERIFIER = 0x002;
    public static final int DEBUG_TYPES = 0x004;
    public static final int DEBUG_FLOW = 0x008;
    public static final int DEBUG_INOUT = 0x010;
    public static final int DEBUG_ANALYZE = 0x020;
    public static final int DEBUG_LVT = 0x040;
    public static final int DEBUG_CHECK = 0x080;
    public static final int DEBUG_LOCALS = 0x100;
    public static final int DEBUG_CONSTRS = 0x200;
    public static final int DEBUG_INTERPRT = 0x400;

    public static final String[] debuggingNames = {"bytecode", "verifier", "types", "flow", "inout", "analyze", "lvt", "check", "locals", "constructors", "interpreter"};

    public static void usageDebugging() {
        err.println("Debugging option: --debug=flag1,flag2,...");
        err.println("possible flags:");
        err.println("  bytecode     " + "show bytecode, as it is read from class file.");
        err.println("  verifier     " + "show result of bytecode verification.");
        err.println("  types        " + "show type intersections");
        err.println("  flow         " + "show flow block merging.");
        err.println("  analyze      " + "show T1/T2 analyzation of flow blocks.");
        err.println("  inout        " + "show in/out set analysis.");
        err.println("  lvt          " + "dump LocalVariableTable.");
        err.println("  check        " + "do time consuming sanity checks.");
        err.println("  locals       " + "dump local merging information.");
        err.println("  constructors " + "dump constructor simplification.");
        err.println("  interpreter  " + "debug execution of interpreter.");
        System.exit(0);
    }

    /**
     * Parse the argument given to the debugging flag.
     *
     * @return true, if the argument parsed without problems.
     */
    public static boolean setDebugging(String debuggingString) {
        if (debuggingString.length() == 0 || debuggingString.equals("help")) {
            usageDebugging();
            return false;
        }

        StringTokenizer st = new StringTokenizer(debuggingString, ",");
        next_token:
        while (st.hasMoreTokens()) {
            String token = st.nextToken().intern();
            for (int i = 0; i < debuggingNames.length; i++) {
                if (token == debuggingNames[i]) {
                    debuggingFlags |= 1 << i;
                    continue next_token;
                }
            }
            err.println("Illegal debugging flag: " + token);
            return false;
        }
        return true;
    }
}
