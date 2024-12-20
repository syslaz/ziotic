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
package com.ziotic.io;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import com.thoughtworks.xstream.XStream;

/**
 * @author Lazaro
 */
public class XMLSession {
  private final XStream xStream;

  public XMLSession() {
    xStream = new XStream();
    xStream.setMode(XStream.NO_REFERENCES);
  }

  /**
   * Loads the class aliases that simplify XML output.
   *
   * @param filePath The path of the XML file which stores the aliases.
   * @throws IOException            Error reading file.
   * @throws ClassNotFoundException Could not find the class specified in the XML
   *                                file.
   */
  public void loadAliases(String filePath) throws IOException, ClassNotFoundException {
    Properties aliases = new Properties();
    File file = new File(filePath);
    if (file.exists()) {
      FileInputStream inputStream = new FileInputStream(file);
      aliases.loadFromXML(inputStream);
    }
    for (Enumeration<?> e = aliases.propertyNames(); e.hasMoreElements();) {
      String alias = (String) e.nextElement();
      Class<?> aliasClass = Class.forName((String) aliases.get(alias));
      xStream.alias(alias, aliasClass);
    }

    // TODO: This is a temporary fix due to newer Java reflection safety
    // requirements
    xStream.allowTypesByWildcard(new String[] { "com.ziotic.logic.*.*", "com.ziotic.content.*.*",
        "com.ziotic.content.*.*.*", "com.ziotic.link.*", "com.ziotic.logic.npc.*.*" });
  }

  /**
   * Reads an <code>Object</code> from an XML file.
   *
   * @param filePath The path of the XML file.
   * @return The object.
   * @throws IOException Error reading file.
   */
  @SuppressWarnings("unchecked")
  public <T> T readObject(String filePath) throws IOException {
    File file = new File(filePath);
    InputStream inputStream = new FileInputStream(file);
    if (filePath.endsWith(".gz")) {
      inputStream = new GZIPInputStream(inputStream);
    }
    try {
      return (T) xStream.fromXML(inputStream);
    } finally {
      inputStream.close();
    }
  }

  /**
   * Writes an XML file from an <code>Object</code>.
   *
   * @param object   The object to write.
   * @param filePath The path to the XML file.
   * @throws IOException Error writing file.
   */
  public void writeObject(Object object, String filePath) throws IOException {
    File file = new File(filePath);
    OutputStream outputStream = new FileOutputStream(file);
    if (filePath.endsWith(".gz")) {
      outputStream = new GZIPOutputStream(outputStream);
    }
    xStream.toXML(object, outputStream);
    outputStream.close();
  }
}
