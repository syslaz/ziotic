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

import java.util.HashMap;
import java.util.Map;

import com.ziotic.asm.*;
import com.ziotic.asm.util.AbstractVisitor;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

/**
 * A {@link com.ziotic.asm.MethodVisitor} that generates SAX 2.0 events from the visited
 * method.
 *
 * @author Eugene Kuleshov
 * @see SAXClassAdapter
 * @see Processor
 */
public final class SAXCodeAdapter extends SAXAdapter implements MethodVisitor {

    static final String[] TYPES = {"top", "int", "float", "double", "long", "null", "uninitializedThis"};

    private final Map labelNames;

    /**
     * Constructs a new {@link SAXCodeAdapter SAXCodeAdapter} object.
     *
     * @param h content handler that will be used to send SAX 2.0 events.
     */
    public SAXCodeAdapter(final ContentHandler h, final int access) {
        super(h);
        labelNames = new HashMap();

        if ((access & (Opcodes.ACC_ABSTRACT | Opcodes.ACC_INTERFACE | Opcodes.ACC_NATIVE)) == 0) {
            addStart("code", new AttributesImpl());
        }
    }

    public final void visitCode() {
    }

    public void visitFrame(final int type, final int nLocal, final Object[] local, final int nStack, final Object[] stack) {
        AttributesImpl attrs = new AttributesImpl();
        switch (type) {
            case Opcodes.F_NEW:
            case Opcodes.F_FULL:
                if (type == Opcodes.F_NEW) {
                    attrs.addAttribute("", "type", "type", "", "NEW");
                } else {
                    attrs.addAttribute("", "type", "type", "", "FULL");
                }
                addStart("frame", attrs);
                appendFrameTypes(true, nLocal, local);
                appendFrameTypes(false, nStack, stack);
                break;
            case Opcodes.F_APPEND:
                attrs.addAttribute("", "type", "type", "", "APPEND");
                addStart("frame", attrs);
                appendFrameTypes(true, nLocal, local);
                break;
            case Opcodes.F_CHOP:
                attrs.addAttribute("", "type", "type", "", "CHOP");
                attrs.addAttribute("", "count", "count", "", Integer.toString(nLocal));
                addStart("frame", attrs);
                break;
            case Opcodes.F_SAME:
                attrs.addAttribute("", "type", "type", "", "SAME");
                addStart("frame", attrs);
                break;
            case Opcodes.F_SAME1:
                attrs.addAttribute("", "type", "type", "", "SAME1");
                addStart("frame", attrs);
                appendFrameTypes(false, 1, stack);
                break;
        }
        addEnd("frame");
    }

    private void appendFrameTypes(final boolean local, final int n, final Object[] types) {
        for (int i = 0; i < n; ++i) {
            Object type = types[i];
            AttributesImpl attrs = new AttributesImpl();
            if (type instanceof String) {
                attrs.addAttribute("", "type", "type", "", (String) type);
            } else if (type instanceof Integer) {
                attrs.addAttribute("", "type", "type", "", TYPES[((Integer) type).intValue()]);
            } else {
                attrs.addAttribute("", "type", "type", "", "uninitialized");
                attrs.addAttribute("", "label", "label", "", getLabel((Label) type));
            }
            addElement(local ? "local" : "stack", attrs);
        }
    }

    public final void visitInsn(final int opcode) {
        addElement(AbstractVisitor.OPCODES[opcode], new AttributesImpl());
    }

    public final void visitIntInsn(final int opcode, final int operand) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "value", "value", "", Integer.toString(operand));
        addElement(AbstractVisitor.OPCODES[opcode], attrs);
    }

    public final void visitVarInsn(final int opcode, final int var) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "var", "var", "", Integer.toString(var));
        addElement(AbstractVisitor.OPCODES[opcode], attrs);
    }

    public final void visitTypeInsn(final int opcode, final String type) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "desc", "desc", "", type);
        addElement(AbstractVisitor.OPCODES[opcode], attrs);
    }

    public final void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "owner", "owner", "", owner);
        attrs.addAttribute("", "name", "name", "", name);
        attrs.addAttribute("", "desc", "desc", "", desc);
        addElement(AbstractVisitor.OPCODES[opcode], attrs);
    }

    public final void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
        AttributesImpl attrs = new AttributesImpl();
        if (opcode != Opcodes.INVOKEDYNAMIC) {
            attrs.addAttribute("", "owner", "owner", "", owner);
        }
        attrs.addAttribute("", "name", "name", "", name);
        attrs.addAttribute("", "desc", "desc", "", desc);
        addElement(AbstractVisitor.OPCODES[opcode], attrs);
    }

    public final void visitJumpInsn(final int opcode, final Label label) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "label", "label", "", getLabel(label));
        addElement(AbstractVisitor.OPCODES[opcode], attrs);
    }

    public final void visitLabel(final Label label) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "name", "name", "", getLabel(label));
        addElement("Label", attrs);
    }

    public final void visitLdcInsn(final Object cst) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "cst", "cst", "", SAXClassAdapter.encode(cst.toString()));
        attrs.addAttribute("", "desc", "desc", "", Type.getDescriptor(cst.getClass()));
        addElement(AbstractVisitor.OPCODES[Opcodes.LDC], attrs);
    }

    public final void visitIincInsn(final int var, final int increment) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "var", "var", "", Integer.toString(var));
        attrs.addAttribute("", "inc", "inc", "", Integer.toString(increment));
        addElement(AbstractVisitor.OPCODES[Opcodes.IINC], attrs);
    }

    public final void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label[] labels) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "min", "min", "", Integer.toString(min));
        attrs.addAttribute("", "max", "max", "", Integer.toString(max));
        attrs.addAttribute("", "dflt", "dflt", "", getLabel(dflt));
        String o = AbstractVisitor.OPCODES[Opcodes.TABLESWITCH];
        addStart(o, attrs);
        for (int i = 0; i < labels.length; i++) {
            AttributesImpl att2 = new AttributesImpl();
            att2.addAttribute("", "name", "name", "", getLabel(labels[i]));
            addElement("label", att2);
        }
        addEnd(o);
    }

    public final void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
        AttributesImpl att = new AttributesImpl();
        att.addAttribute("", "dflt", "dflt", "", getLabel(dflt));
        String o = AbstractVisitor.OPCODES[Opcodes.LOOKUPSWITCH];
        addStart(o, att);
        for (int i = 0; i < labels.length; i++) {
            AttributesImpl att2 = new AttributesImpl();
            att2.addAttribute("", "name", "name", "", getLabel(labels[i]));
            att2.addAttribute("", "key", "key", "", Integer.toString(keys[i]));
            addElement("label", att2);
        }
        addEnd(o);
    }

    public final void visitMultiANewArrayInsn(final String desc, final int dims) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "desc", "desc", "", desc);
        attrs.addAttribute("", "dims", "dims", "", Integer.toString(dims));
        addElement(AbstractVisitor.OPCODES[Opcodes.MULTIANEWARRAY], attrs);
    }

    public final void visitTryCatchBlock(final Label start, final Label end, final Label handler, final String type) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "start", "start", "", getLabel(start));
        attrs.addAttribute("", "end", "end", "", getLabel(end));
        attrs.addAttribute("", "handler", "handler", "", getLabel(handler));
        if (type != null) {
            attrs.addAttribute("", "type", "type", "", type);
        }
        addElement("TryCatch", attrs);
    }

    public final void visitMaxs(final int maxStack, final int maxLocals) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "maxStack", "maxStack", "", Integer.toString(maxStack));
        attrs.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString(maxLocals));
        addElement("Max", attrs);

        addEnd("code");
    }

    public void visitLocalVariable(final String name, final String desc, final String signature, final Label start, final Label end, final int index) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "name", "name", "", name);
        attrs.addAttribute("", "desc", "desc", "", desc);
        if (signature != null) {
            attrs.addAttribute("", "signature", "signature", "", SAXClassAdapter.encode(signature));
        }
        attrs.addAttribute("", "start", "start", "", getLabel(start));
        attrs.addAttribute("", "end", "end", "", getLabel(end));
        attrs.addAttribute("", "var", "var", "", Integer.toString(index));
        addElement("LocalVar", attrs);
    }

    public final void visitLineNumber(final int line, final Label start) {
        AttributesImpl attrs = new AttributesImpl();
        attrs.addAttribute("", "line", "line", "", Integer.toString(line));
        attrs.addAttribute("", "start", "start", "", getLabel(start));
        addElement("LineNumber", attrs);
    }

    public AnnotationVisitor visitAnnotationDefault() {
        return new SAXAnnotationAdapter(getContentHandler(), "annotationDefault", 0, null, null);
    }

    public AnnotationVisitor visitAnnotation(final String desc, final boolean visible) {
        return new SAXAnnotationAdapter(getContentHandler(), "annotation", visible ? 1 : -1, null, desc);
    }

    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
        return new SAXAnnotationAdapter(getContentHandler(), "parameterAnnotation", visible ? 1 : -1, parameter, desc);
    }

    public void visitEnd() {
        addEnd("method");
    }

    private final String getLabel(final Label label) {
        String name = (String) labelNames.get(label);
        if (name == null) {
            name = Integer.toString(labelNames.size());
            labelNames.put(label, name);
        }
        return name;
    }
}
