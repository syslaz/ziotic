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
package com.ziotic.asm.xml;

import com.ziotic.asm.Attribute;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/**
 * SAXAdapter
 *
 * @author Eugene Kuleshov
 */
public abstract class SAXAdapter {

    private final ContentHandler h;

    protected SAXAdapter(final ContentHandler h) {
        this.h = h;
    }

    protected ContentHandler getContentHandler() {
        return h;
    }

    protected void addDocumentStart() {
        try {
            h.startDocument();
        } catch (SAXException ex) {
            throw new RuntimeException(ex.getException());
        }
    }

    protected void addDocumentEnd() {
        try {
            h.endDocument();
        } catch (SAXException ex) {
            throw new RuntimeException(ex.toString());
        }
    }

    protected final void addStart(final String name, final Attributes attrs) {
        try {
            h.startElement("", name, name, attrs);
        } catch (SAXException ex) {
            throw new RuntimeException(ex.toString());
        }
    }

    protected final void addEnd(final String name) {
        try {
            h.endElement("", name, name);
        } catch (SAXException ex) {
            throw new RuntimeException(ex.toString());
        }
    }

    protected final void addElement(final String name, final Attributes attrs) {
        addStart(name, attrs);
        addEnd(name);
    }

    public void visitAttribute(final Attribute attr) {
        // nothing to do
    }
}
