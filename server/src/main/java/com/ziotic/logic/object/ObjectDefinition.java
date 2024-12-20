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
package com.ziotic.logic.object;

import java.util.HashMap;
import java.util.Map;

import com.ziotic.adapter.protocol.cache.format.ObjectDefinitionAdapter;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class ObjectDefinition {
    private static final Logger logger = Logging.log();

    private static Map<Integer, ObjectDefinition> cachedDefinitions = new HashMap<Integer, ObjectDefinition>();

    public static ObjectDefinition forId(int id) {
        ObjectDefinition def = cachedDefinitions.get(id);
        if (def == null) {
            try {
                def = ObjectDefinitionAdapter.forId(id);
            } catch (Exception e) {
                logger.error("Failed to load object definition for id : " + id/*, e*/);
                def = new ObjectDefinition();
            }
            cachedDefinitions.put(id, def);
        }
        return def;
    }

    public int id;
    public String name = "null";
    public boolean walkable = true;
    public boolean clippingFlag = false;
    public String[] actions = new String[5];
    public int actionCount = 2;
    public int sizeX = 1;
    public int sizeY = 1;
    public int walkToData = 0;
    public int miniMapSpriteId = -1;

    public boolean hasActions() {
        for (String s : actions) {
            if (s != null && !s.equals("null") && !s.equals("")) {
                return true;
            }
        }
        return false;
    }
}
