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

import java.util.HashMap;

import com.ziotic.asm.AnnotationVisitor;
import com.ziotic.asm.Label;
import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.Opcodes;

/**
 * A {@link MethodVisitor} that prints the ASM code that generates the methods
 * it visits.
 *
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
public class ASMifierMethodVisitor extends ASMifierAbstractVisitor implements MethodVisitor {

    /**
     * Constructs a new {@link ASMifierMethodVisitor} object.
     */
    public ASMifierMethodVisitor() {
        super("mv");
        this.labelNames = new HashMap();
    }

    public AnnotationVisitor visitAnnotationDefault() {
        buf.setLength(0);
        buf.append("{\n").append("av0 = mv.visitAnnotationDefault();\n");
        text.add(buf.toString());
        ASMifierAnnotationVisitor av = new ASMifierAnnotationVisitor(0);
        text.add(av.getText());
        text.add("}\n");
        return av;
    }

    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
        buf.setLength(0);
        buf.append("{\n").append("av0 = mv.visitParameterAnnotation(").append(parameter).append(", ");
        appendConstant(desc);
        buf.append(", ").append(visible).append(");\n");
        text.add(buf.toString());
        ASMifierAnnotationVisitor av = new ASMifierAnnotationVisitor(0);
        text.add(av.getText());
        text.add("}\n");
        return av;
    }

    public void visitCode() {
        text.add("mv.visitCode();\n");
    }

    public void visitFrame(final int type, final int nLocal, final Object[] local, final int nStack, final Object[] stack) {
        buf.setLength(0);
        switch (type) {
            case Opcodes.F_NEW:
            case Opcodes.F_FULL:
                declareFrameTypes(nLocal, local);
                declareFrameTypes(nStack, stack);
                if (type == Opcodes.F_NEW) {
                    buf.append("mv.visitFrame(Opcodes.F_NEW, ");
                } else {
                    buf.append("mv.visitFrame(Opcodes.F_FULL, ");
                }
                buf.append(nLocal).append(", new Object[] {");
                appendFrameTypes(nLocal, local);
                buf.append("}, ").append(nStack).append(", new Object[] {");
                appendFrameTypes(nStack, stack);
                buf.append('}');
                break;
            case Opcodes.F_APPEND:
                declareFrameTypes(nLocal, local);
                buf.append("mv.visitFrame(Opcodes.F_APPEND,").append(nLocal).append(", new Object[] {");
                appendFrameTypes(nLocal, local);
                buf.append("}, 0, null");
                break;
            case Opcodes.F_CHOP:
                buf.append("mv.visitFrame(Opcodes.F_CHOP,").append(nLocal).append(", null, 0, null");
                break;
            case Opcodes.F_SAME:
                buf.append("mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null");
                break;
            case Opcodes.F_SAME1:
                declareFrameTypes(1, stack);
                buf.append("mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
                appendFrameTypes(1, stack);
                buf.append('}');
                break;
        }
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitInsn(final int opcode) {
        buf.setLength(0);
        buf.append("mv.visitInsn(").append(OPCODES[opcode]).append(");\n");
        text.add(buf.toString());
    }

    public void visitIntInsn(final int opcode, final int operand) {
        buf.setLength(0);
        buf.append("mv.visitIntInsn(").append(OPCODES[opcode]).append(", ").append(opcode == Opcodes.NEWARRAY ? TYPES[operand] : Integer.toString(operand)).append(");\n");
        text.add(buf.toString());
    }

    public void visitVarInsn(final int opcode, final int var) {
        buf.setLength(0);
        buf.append("mv.visitVarInsn(").append(OPCODES[opcode]).append(", ").append(var).append(");\n");
        text.add(buf.toString());
    }

    public void visitTypeInsn(final int opcode, final String type) {
        buf.setLength(0);
        buf.append("mv.visitTypeInsn(").append(OPCODES[opcode]).append(", ");
        appendConstant(type);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
        buf.setLength(0);
        buf.append("mv.visitFieldInsn(").append(OPCODES[opcode]).append(", ");
        appendConstant(owner);
        buf.append(", ");
        appendConstant(name);
        buf.append(", ");
        appendConstant(desc);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
        buf.setLength(0);
        buf.append("mv.visitMethodInsn(").append(OPCODES[opcode]).append(", ");
        appendConstant(owner);
        buf.append(", ");
        appendConstant(name);
        buf.append(", ");
        appendConstant(desc);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitJumpInsn(final int opcode, final Label label) {
        buf.setLength(0);
        declareLabel(label);
        buf.append("mv.visitJumpInsn(").append(OPCODES[opcode]).append(", ");
        appendLabel(label);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitLabel(final Label label) {
        buf.setLength(0);
        declareLabel(label);
        buf.append("mv.visitLabel(");
        appendLabel(label);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitLdcInsn(final Object cst) {
        buf.setLength(0);
        buf.append("mv.visitLdcInsn(");
        appendConstant(cst);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitIincInsn(final int var, final int increment) {
        buf.setLength(0);
        buf.append("mv.visitIincInsn(").append(var).append(", ").append(increment).append(");\n");
        text.add(buf.toString());
    }

    public void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label[] labels) {
        buf.setLength(0);
        for (int i = 0; i < labels.length; ++i) {
            declareLabel(labels[i]);
        }
        declareLabel(dflt);

        buf.append("mv.visitTableSwitchInsn(").append(min).append(", ").append(max).append(", ");
        appendLabel(dflt);
        buf.append(", new Label[] {");
        for (int i = 0; i < labels.length; ++i) {
            buf.append(i == 0 ? " " : ", ");
            appendLabel(labels[i]);
        }
        buf.append(" });\n");
        text.add(buf.toString());
    }

    public void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
        buf.setLength(0);
        for (int i = 0; i < labels.length; ++i) {
            declareLabel(labels[i]);
        }
        declareLabel(dflt);

        buf.append("mv.visitLookupSwitchInsn(");
        appendLabel(dflt);
        buf.append(", new int[] {");
        for (int i = 0; i < keys.length; ++i) {
            buf.append(i == 0 ? " " : ", ").append(keys[i]);
        }
        buf.append(" }, new Label[] {");
        for (int i = 0; i < labels.length; ++i) {
            buf.append(i == 0 ? " " : ", ");
            appendLabel(labels[i]);
        }
        buf.append(" });\n");
        text.add(buf.toString());
    }

    public void visitMultiANewArrayInsn(final String desc, final int dims) {
        buf.setLength(0);
        buf.append("mv.visitMultiANewArrayInsn(");
        appendConstant(desc);
        buf.append(", ").append(dims).append(");\n");
        text.add(buf.toString());
    }

    public void visitTryCatchBlock(final Label start, final Label end, final Label handler, final String type) {
        buf.setLength(0);
        declareLabel(start);
        declareLabel(end);
        declareLabel(handler);
        buf.append("mv.visitTryCatchBlock(");
        appendLabel(start);
        buf.append(", ");
        appendLabel(end);
        buf.append(", ");
        appendLabel(handler);
        buf.append(", ");
        appendConstant(type);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitLocalVariable(final String name, final String desc, final String signature, final Label start, final Label end, final int index) {
        buf.setLength(0);
        buf.append("mv.visitLocalVariable(");
        appendConstant(name);
        buf.append(", ");
        appendConstant(desc);
        buf.append(", ");
        appendConstant(signature);
        buf.append(", ");
        appendLabel(start);
        buf.append(", ");
        appendLabel(end);
        buf.append(", ").append(index).append(");\n");
        text.add(buf.toString());
    }

    public void visitLineNumber(final int line, final Label start) {
        buf.setLength(0);
        buf.append("mv.visitLineNumber(").append(line).append(", ");
        appendLabel(start);
        buf.append(");\n");
        text.add(buf.toString());
    }

    public void visitMaxs(final int maxStack, final int maxLocals) {
        buf.setLength(0);
        buf.append("mv.visitMaxs(").append(maxStack).append(", ").append(maxLocals).append(");\n");
        text.add(buf.toString());
    }

    private void declareFrameTypes(final int n, final Object[] o) {
        for (int i = 0; i < n; ++i) {
            if (o[i] instanceof Label) {
                declareLabel((Label) o[i]);
            }
        }
    }

    private void appendFrameTypes(final int n, final Object[] o) {
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                buf.append(", ");
            }
            if (o[i] instanceof String) {
                appendConstant(o[i]);
            } else if (o[i] instanceof Integer) {
                switch (((Integer) o[i]).intValue()) {
                    case 0:
                        buf.append("Opcodes.TOP");
                        break;
                    case 1:
                        buf.append("Opcodes.INTEGER");
                        break;
                    case 2:
                        buf.append("Opcodes.FLOAT");
                        break;
                    case 3:
                        buf.append("Opcodes.DOUBLE");
                        break;
                    case 4:
                        buf.append("Opcodes.LONG");
                        break;
                    case 5:
                        buf.append("Opcodes.NULL");
                        break;
                    case 6:
                        buf.append("Opcodes.UNINITIALIZED_THIS");
                        break;
                }
            } else {
                appendLabel((Label) o[i]);
            }
        }
    }

    /**
     * Appends a declaration of the given label to {@link #buf buf}. This
     * declaration is of the form "Label lXXX = new Label();". Does nothing if
     * the given label has already been declared.
     *
     * @param l a label.
     */
    private void declareLabel(final Label l) {
        String name = (String) labelNames.get(l);
        if (name == null) {
            name = "l" + labelNames.size();
            labelNames.put(l, name);
            buf.append("Label ").append(name).append(" = new Label();\n");
        }
    }

    /**
     * Appends the name of the given label to {@link #buf buf}. The given label
     * <i>must</i> already have a name. One way to ensure this is to always
     * call {@link #declareLabel declared} before calling this method.
     *
     * @param l a label.
     */
    private void appendLabel(final Label l) {
        buf.append((String) labelNames.get(l));
    }
}
