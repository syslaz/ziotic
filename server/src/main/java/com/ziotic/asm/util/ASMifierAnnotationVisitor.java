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
package com.ziotic.asm.util;

import com.ziotic.asm.AnnotationVisitor;

/**
 * An {@link com.ziotic.asm.AnnotationVisitor} that prints the ASM code that generates the
 * annotations it visits.
 *
 * @author Eric Bruneton
 */
public class ASMifierAnnotationVisitor extends AbstractVisitor implements AnnotationVisitor {

    /**
     * Identifier of the annotation visitor variable in the produced code.
     */
    protected final int id;

    /**
     * Constructs a new {@link ASMifierAnnotationVisitor}.
     *
     * @param id identifier of the annotation visitor variable in the produced
     *           code.
     */
    public ASMifierAnnotationVisitor(final int id) {
        this.id = id;
    }

    // ------------------------------------------------------------------------
    // Implementation of the AnnotationVisitor interface
    // ------------------------------------------------------------------------

    public void visit(final String name, final Object value) {
        buf.setLength(0);
        buf.append("av").append(id).append(".visit(");
        ASMifierAbstractVisitor.appendConstant(buf, name);
        buf.append(", ");
        ASMifierAbstractVisitor.appendConstant(buf, value);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitEnum(final String name, final String desc, final String value) {
        buf.setLength(0);
        buf.append("av").append(id).append(".visitEnum(");
        ASMifierAbstractVisitor.appendConstant(buf, name);
        buf.append(", ");
        ASMifierAbstractVisitor.appendConstant(buf, desc);
        buf.append(", ");
        ASMifierAbstractVisitor.appendConstant(buf, value);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        buf.setLength(0);
        buf.append("{\n");
        buf.append("AnnotationVisitor av").append(id + 1).append(" = av");
        buf.append(id).append(".visitAnnotation(");
        ASMifierAbstractVisitor.appendConstant(buf, name);
        buf.append(", ");
        ASMifierAbstractVisitor.appendConstant(buf, desc);
        buf.append(");\n");
        text.add(buf.toString());
        ASMifierAnnotationVisitor av = new ASMifierAnnotationVisitor(id + 1);
        text.add(av.getText());
        text.add("}\n");
        return av;
    }

    public AnnotationVisitor visitArray(final String name) {
        buf.setLength(0);
        buf.append("{\n");
        buf.append("AnnotationVisitor av").append(id + 1).append(" = av");
        buf.append(id).append(".visitArray(");
        ASMifierAbstractVisitor.appendConstant(buf, name);
        buf.append(");\n");
        text.add(buf.toString());
        ASMifierAnnotationVisitor av = new ASMifierAnnotationVisitor(id + 1);
        text.add(av.getText());
        text.add("}\n");
        return av;
    }

    public void visitEnd() {
        buf.setLength(0);
        buf.append("av").append(id).append(".visitEnd();\n");
        text.add(buf.toString());
    }
}
