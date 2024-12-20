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

import com.ziotic.asm.*;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

/**
 * A {@link com.ziotic.asm.ClassVisitor ClassVisitor} that generates SAX 2.0
 * events from the visited class. It can feed any kind of
 * {@link org.xml.sax.ContentHandler ContentHandler}, e.g. XML serializer, XSLT
 * or XQuery engines.
 *
 * @author Eugene Kuleshov
 * @see Processor
 * @see ASMContentHandler
 */
public final class SAXClassAdapter extends SAXAdapter implements ClassVisitor {
    private final boolean singleDocument;

    /**
     * Pseudo access flag used to distinguish class access flags.
     */
    private static final int ACCESS_CLASS = 262144;

    /**
     * Pseudo access flag used to distinguish field access flags.
     */
    private static final int ACCESS_FIELD = 524288;

    /**
     * Pseudo access flag used to distinguish inner class flags.
     */
    private static final int ACCESS_INNER = 1048576;

    /**
     * Constructs a new {@link SAXClassAdapter SAXClassAdapter} object.
     *
     * @param h              content handler that will be used to send SAX 2.0 events.
     * @param singleDocument if <tt>true</tt> adapter will not produce
     *                       {@link ContentHandler#startDocument() startDocument()} and
     *                       {@link ContentHandler#endDocument() endDocument()} events.
     */
    public SAXClassAdapter(final ContentHandler h, boolean singleDocument) {
        super(h);
        this.singleDocument = singleDocument;
        if (!singleDocument) {
            addDocumentStart();
        }
    }

    public void visitSource(final String source, final String debug) {
        AttributesImpl att = new AttributesImpl();
        if (source != null) {
            att.addAttribute("", "file", "file", "", encode(source));
        }
        if (debug != null) {
            att.addAttribute("", "debug", "debug", "", encode(debug));
        }

        addElement("source", att);
    }

    public void visitOuterClass(final String owner, final String name, final String desc) {
        AttributesImpl att = new AttributesImpl();
        att.addAttribute("", "owner", "owner", "", owner);
        if (name != null) {
            att.addAttribute("", "name", "name", "", name);
        }
        if (desc != null) {
            att.addAttribute("", "desc", "desc", "", desc);
        }

        addElement("outerclass", att);
    }

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        return new SAXAnnotationAdapter(getContentHandler(), "annotation", visible ? 1 : -1, null, desc);
    }

    public void visit(final int version, final int access, final String name, final String signature, final String superName, final String[] interfaces) {
        StringBuffer sb = new StringBuffer();
        appendAccess(access | ACCESS_CLASS, sb);

        AttributesImpl att = new AttributesImpl();
        att.addAttribute("", "access", "access", "", sb.toString());
        if (name != null) {
            att.addAttribute("", "name", "name", "", name);
        }
        if (signature != null) {
            att.addAttribute("", "signature", "signature", "", encode(signature));
        }
        if (superName != null) {
            att.addAttribute("", "parent", "parent", "", superName);
        }
        att.addAttribute("", "major", "major", "", Integer.toString(version & 0xFFFF));
        att.addAttribute("", "minor", "minor", "", Integer.toString(version >>> 16));
        addStart("class", att);

        addStart("interfaces", new AttributesImpl());
        if (interfaces != null && interfaces.length > 0) {
            for (int i = 0; i < interfaces.length; i++) {
                AttributesImpl att2 = new AttributesImpl();
                att2.addAttribute("", "name", "name", "", interfaces[i]);
                addElement("interface", att2);
            }
        }
        addEnd("interfaces");
    }

    public FieldVisitor visitField(final int access, final String name, final String desc, final String signature, final Object value) {
        StringBuffer sb = new StringBuffer();
        appendAccess(access | ACCESS_FIELD, sb);

        AttributesImpl att = new AttributesImpl();
        att.addAttribute("", "access", "access", "", sb.toString());
        att.addAttribute("", "name", "name", "", name);
        att.addAttribute("", "desc", "desc", "", desc);
        if (signature != null) {
            att.addAttribute("", "signature", "signature", "", encode(signature));
        }
        if (value != null) {
            att.addAttribute("", "value", "value", "", encode(value.toString()));
        }

        return new SAXFieldAdapter(getContentHandler(), att);
    }

    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        StringBuffer sb = new StringBuffer();
        appendAccess(access, sb);

        AttributesImpl att = new AttributesImpl();
        att.addAttribute("", "access", "access", "", sb.toString());
        att.addAttribute("", "name", "name", "", name);
        att.addAttribute("", "desc", "desc", "", desc);
        if (signature != null) {
            att.addAttribute("", "signature", "signature", "", signature);
        }
        addStart("method", att);

        addStart("exceptions", new AttributesImpl());
        if (exceptions != null && exceptions.length > 0) {
            for (int i = 0; i < exceptions.length; i++) {
                AttributesImpl att2 = new AttributesImpl();
                att2.addAttribute("", "name", "name", "", exceptions[i]);
                addElement("exception", att2);
            }
        }
        addEnd("exceptions");

        return new SAXCodeAdapter(getContentHandler(), access);
    }

    public final void visitInnerClass(final String name, final String outerName, final String innerName, final int access) {
        StringBuffer sb = new StringBuffer();
        appendAccess(access | ACCESS_INNER, sb);

        AttributesImpl att = new AttributesImpl();
        att.addAttribute("", "access", "access", "", sb.toString());
        if (name != null) {
            att.addAttribute("", "name", "name", "", name);
        }
        if (outerName != null) {
            att.addAttribute("", "outerName", "outerName", "", outerName);
        }
        if (innerName != null) {
            att.addAttribute("", "innerName", "innerName", "", innerName);
        }
        addElement("innerclass", att);
    }

    public final void visitEnd() {
        addEnd("class");
        if (!singleDocument) {
            addDocumentEnd();
        }
    }

    static final String encode(final String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\\') {
                sb.append("\\\\");
            } else if (c < 0x20 || c > 0x7f) {
                sb.append("\\u");
                if (c < 0x10) {
                    sb.append("000");
                } else if (c < 0x100) {
                    sb.append("00");
                } else if (c < 0x1000) {
                    sb.append('0');
                }
                sb.append(Integer.toString(c, 16));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static void appendAccess(final int access, final StringBuffer sb) {
        if ((access & Opcodes.ACC_PUBLIC) != 0) {
            sb.append("public ");
        }
        if ((access & Opcodes.ACC_PRIVATE) != 0) {
            sb.append("private ");
        }
        if ((access & Opcodes.ACC_PROTECTED) != 0) {
            sb.append("protected ");
        }
        if ((access & Opcodes.ACC_FINAL) != 0) {
            sb.append("final ");
        }
        if ((access & Opcodes.ACC_STATIC) != 0) {
            sb.append("static ");
        }
        if ((access & Opcodes.ACC_SUPER) != 0) {
            if ((access & ACCESS_CLASS) == 0) {
                sb.append("synchronized ");
            } else {
                sb.append("super ");
            }
        }
        if ((access & Opcodes.ACC_VOLATILE) != 0) {
            if ((access & ACCESS_FIELD) == 0) {
                sb.append("bridge ");
            } else {
                sb.append("volatile ");
            }
        }
        if ((access & Opcodes.ACC_TRANSIENT) != 0) {
            if ((access & ACCESS_FIELD) == 0) {
                sb.append("varargs ");
            } else {
                sb.append("transient ");
            }
        }
        if ((access & Opcodes.ACC_NATIVE) != 0) {
            sb.append("native ");
        }
        if ((access & Opcodes.ACC_STRICT) != 0) {
            sb.append("strict ");
        }
        if ((access & Opcodes.ACC_INTERFACE) != 0) {
            sb.append("interface ");
        }
        if ((access & Opcodes.ACC_ABSTRACT) != 0) {
            sb.append("abstract ");
        }
        if ((access & Opcodes.ACC_SYNTHETIC) != 0) {
            sb.append("synthetic ");
        }
        if ((access & Opcodes.ACC_ANNOTATION) != 0) {
            sb.append("annotation ");
        }
        if ((access & Opcodes.ACC_ENUM) != 0) {
            sb.append("enum ");
        }
        if ((access & Opcodes.ACC_DEPRECATED) != 0) {
            sb.append("deprecated ");
        }
    }
}
