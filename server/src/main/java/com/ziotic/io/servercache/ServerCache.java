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
package com.ziotic.io.servercache;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.ziotic.utility.Logging;
import com.ziotic.utility.Streams;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class ServerCache {
    private static final Logger logger = Logging.log();

    private File dir;
    private RandomAccessFile dataFile = null;
    private Map<String, ServerCacheFileIndex> fileIndexMap = new HashMap<String, ServerCacheFileIndex>();

    public void load(File dir) throws IOException {
        this.dir = dir;

        validateFiles();

        dataFile = new RandomAccessFile(new File(dir, "servercache.dat"), "rw");

        loadFileIndexMap();

        logger.info("Loaded server cache with " + fileIndexMap.size() + " files");
    }

    private void validateFiles() throws IOException {
        File f1 = new File(dir, "servercache.dat");
        File f2 = new File(dir, "servercache.idx");
        if (!f1.exists()) {
            f1.createNewFile();
        }
        if (!f2.exists()) {
            f2.createNewFile();
        }
    }

    private void loadFileIndexMap() throws IOException {
        File fileIndexMapFile = new File(dir, "servercache.idx");
        DataInputStream stream = new DataInputStream(new FileInputStream(fileIndexMapFile));
        while (stream.available() > 0) {
            String name = Streams.readString(stream);
            int position = stream.readInt();
            int length = stream.readInt();

            fileIndexMap.put(name, new ServerCacheFileIndex(name, position, length));
        }
        stream.close();
    }

    private void flushFileIndexMap() throws IOException {
        File fileIndexMapFile = new File(dir, "servercache.idx");
        fileIndexMapFile.delete();

        DataOutputStream stream = new DataOutputStream(new FileOutputStream(fileIndexMapFile));
        for (ServerCacheFileIndex fileIndex : fileIndexMap.values()) {
            Streams.writeString(fileIndex.getName(), stream);
            stream.writeInt(fileIndex.getPosition());
            stream.writeInt(fileIndex.getLength());
        }
        stream.close();
    }

    public byte[] getFile(String name) throws IOException {
        ServerCacheFileIndex fileIndex = fileIndexMap.get(name);
        if (fileIndex == null) {
            return null;
        }
        byte[] data = new byte[fileIndex.getLength()];
        synchronized (dataFile) {
            dataFile.seek(fileIndex.getPosition());
            dataFile.read(data);
        }
        return data;
    }

    public void writeFile(String name, byte[] data) throws IOException {
        int position = -1;

        ServerCacheFileIndex fileIndex = fileIndexMap.get(name);
        if (fileIndex != null) {
            if (data.length < fileIndex.getLength()) {
                position = fileIndex.getPosition();
            }
        }

        synchronized (dataFile) {
            if (position == -1) {
                position = (int) dataFile.length();
            }

            dataFile.seek(position);
            dataFile.write(data);

            fileIndexMap.put(name, new ServerCacheFileIndex(name, position, data.length));

            flushFileIndexMap();
        }
    }
}
