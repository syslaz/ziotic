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
package com.ziotic.logic.item;

import java.io.IOException;
import java.util.Map;

import com.ziotic.Static;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class ItemXMLDefinition implements Comparable<ItemXMLDefinition> {
    private static final Logger logger = Logging.log();

    private static Map<Integer, ItemXMLDefinition> xmlDefinitions = null;

    public static void load() throws IOException {
        xmlDefinitions = Static.xml.readObject(Static.parseString("%WORK_DIR%/itemdefs.xml"));
        logger.info("Loaded " + xmlDefinitions.size() + " XML item definitions");
    }

    public static Map<Integer, ItemXMLDefinition> getXMLDefinitions() {
        return xmlDefinitions;
    }

    public int id = -1;
    public String examine = "Nothing interesting.";
    public double weight = 0;

    @Override
    public int compareTo(ItemXMLDefinition def) {
        return def.id - id;
    }
}
