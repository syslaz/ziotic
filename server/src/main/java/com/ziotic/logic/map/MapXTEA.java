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
package com.ziotic.logic.map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.ziotic.Constants;
import com.ziotic.Static;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

public class MapXTEA {
    private static final Logger logger = Logging.log();
    private Map<Integer, int[]> xteas = new HashMap<Integer, int[]>();

    public MapXTEA() {
        try {
            if (!loadPackedFile()) {
                createPackedFile();
            }
            logger.info("Loaded " + xteas.size() + " map XTEA key(s)");
        } catch (IOException e) {
            logger.error("Failed to load map xtea(s)!", e);
        }
    }

    public void createPackedFile() throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream(Static.parseString(Constants.MAP_XTEA_FILE)));
        File directory = new File(Static.parseString(Constants.MAP_XTEA_DIR));
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    BufferedReader input = new BufferedReader(new FileReader(file));
                    int id = Integer.parseInt(file.getName().substring(0, file.getName().indexOf(".")));
                    output.writeInt(id);
                    int[] keys = new int[4];
                    for (int i = 0; i < 4; i++) {
                        String line = input.readLine();
                        if (line != null) {
                            keys[i] = Integer.parseInt(line);
                        } else {
                            logger.error("Corrupted XTEA file : " + id + "; line: " + line);
                            keys[i] = 0;
                        }
                        output.writeInt(keys[i]);
                    }
                    input.close();
                    xteas.put(id, keys);
                }
            }
        }
        output.close();
    }

    public int[] getKey(int region) {
        return xteas.get(region);
    }

    public Map<Integer, int[]> getXTEAs() {
        return xteas;
    }

    public boolean loadPackedFile() throws IOException {
        File file = new File(Static.parseString(Constants.MAP_XTEA_FILE));
        if (!file.exists()) {
            return false;
        }
        DataInputStream in = new DataInputStream(new FileInputStream(file));
        for (int i = 0; i < file.length() / (4 + (4 * 4)); i++) {
            int id = in.readInt();
            int[] key = new int[4];
            for (int i2 = 0; i2 < 4; i2++) {
                key[i2] = in.readInt();
            }
            xteas.put(id, key);
        }
        return true;
    }
}
