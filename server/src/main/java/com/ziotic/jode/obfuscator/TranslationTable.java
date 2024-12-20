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
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

///#ifndef JDK12
///import java.util.Comparator;
///#endif

public class TranslationTable extends TreeMap {

///#ifndef JDK12
///    public TranslationTable() {
///	super(createStringComparator());
///    }
///
///    private static Comparator createStringComparator() {
///	return new Comparator() {
///	    public int compare(Object o1, Object o2) {
///		return ((String) o1).compareTo((String) o2);
///	    }
///	};
///    }
///#endif

    public void load(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.charAt(0) == '#')
                continue;
            int delim = line.indexOf('=');
            String key = line.substring(0, delim);
            String value = line.substring(delim + 1);
            put(key, value);
        }
    }

    public void store(OutputStream out) throws IOException {
        PrintWriter writer = new PrintWriter(out);
        for (Iterator i = entrySet().iterator(); i.hasNext(); ) {
            Map.Entry e = (Map.Entry) i.next();
            writer.println(e.getKey() + "=" + e.getValue());
        }
        writer.flush();
    }
}
