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
import com.ziotic.asm.Type;

/**
 * An {@link AnnotationVisitor} that prints a disassembled view of the
 * annotations it visits.
 *
 * @author Eric Bruneton
 */
public class TraceAnnotationVisitor extends TraceAbstractVisitor implements AnnotationVisitor {

    /**
     * The {@link AnnotationVisitor} to which this visitor delegates calls. May
     * be <tt>null</tt>.
     */
    protected AnnotationVisitor av;

    private int valueNumber = 0;

    /**
     * Constructs a new {@link TraceAnnotationVisitor}.
     */
    public TraceAnnotationVisitor() {
        // ignore
    }

    // ------------------------------------------------------------------------
    // Implementation of the AnnotationVisitor interface
    // ------------------------------------------------------------------------

    public void visit(final String name, final Object value) {
        buf.setLength(0);
        appendComa(valueNumber++);

        if (name != null) {
            buf.append(name).append('=');
        }

        if (value instanceof String) {
            visitString((String) value);
        } else if (value instanceof Type) {
            visitType((Type) value);
        } else if (value instanceof Byte) {
            visitByte(((Byte) value).byteValue());
        } else if (value instanceof Boolean) {
            visitBoolean(((Boolean) value).booleanValue());
        } else if (value instanceof Short) {
            visitShort(((Short) value).shortValue());
        } else if (value instanceof Character) {
            visitChar(((Character) value).charValue());
        } else if (value instanceof Integer) {
            visitInt(((Integer) value).intValue());
        } else if (value instanceof Float) {
            visitFloat(((Float) value).floatValue());
        } else if (value instanceof Long) {
            visitLong(((Long) value).longValue());
        } else if (value instanceof Double) {
            visitDouble(((Double) value).doubleValue());
        } else if (value.getClass().isArray()) {
            buf.append('{');
            if (value instanceof byte[]) {
                byte[] v = (byte[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitByte(v[i]);
                }
            } else if (value instanceof boolean[]) {
                boolean[] v = (boolean[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitBoolean(v[i]);
                }
            } else if (value instanceof short[]) {
                short[] v = (short[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitShort(v[i]);
                }
            } else if (value instanceof char[]) {
                char[] v = (char[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitChar(v[i]);
                }
            } else if (value instanceof int[]) {
                int[] v = (int[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitInt(v[i]);
                }
            } else if (value instanceof long[]) {
                long[] v = (long[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitLong(v[i]);
                }
            } else if (value instanceof float[]) {
                float[] v = (float[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitFloat(v[i]);
                }
            } else if (value instanceof double[]) {
                double[] v = (double[]) value;
                for (int i = 0; i < v.length; i++) {
                    appendComa(i);
                    visitDouble(v[i]);
                }
            }
            buf.append('}');
        }

        text.add(buf.toString());

        if (av != null) {
            av.visit(name, value);
        }
    }

    private void visitInt(final int value) {
        buf.append(value);
    }

    private void visitLong(final long value) {
        buf.append(value).append('L');
    }

    private void visitFloat(final float value) {
        buf.append(value).append('F');
    }

    private void visitDouble(final double value) {
        buf.append(value).append('D');
    }

    private void visitChar(final char value) {
        buf.append("(char)").append((int) value);
    }

    private void visitShort(final short value) {
        buf.append("(short)").append(value);
    }

    private void visitByte(final byte value) {
        buf.append("(byte)").append(value);
    }

    private void visitBoolean(final boolean value) {
        buf.append(value);
    }

    private void visitString(final String value) {
        appendString(buf, value);
    }

    private void visitType(final Type value) {
        buf.append(value.getClassName()).append(".class");
    }

    public void visitEnum(final String name, final String desc, final String value) {
        buf.setLength(0);
        appendComa(valueNumber++);
        if (name != null) {
            buf.append(name).append('=');
        }
        appendDescriptor(FIELD_DESCRIPTOR, desc);
        buf.append('.').append(value);
        text.add(buf.toString());

        if (av != null) {
            av.visitEnum(name, desc, value);
        }
    }

    public AnnotationVisitor visitAnnotation(final String name, final String desc) {
        buf.setLength(0);
        appendComa(valueNumber++);
        if (name != null) {
            buf.append(name).append('=');
        }
        buf.append('@');
        appendDescriptor(FIELD_DESCRIPTOR, desc);
        buf.append('(');
        text.add(buf.toString());
        TraceAnnotationVisitor tav = createTraceAnnotationVisitor();
        text.add(tav.getText());
        text.add(")");
        if (av != null) {
            tav.av = av.visitAnnotation(name, desc);
        }
        return tav;
    }

    public AnnotationVisitor visitArray(final String name) {
        buf.setLength(0);
        appendComa(valueNumber++);
        if (name != null) {
            buf.append(name).append('=');
        }
        buf.append('{');
        text.add(buf.toString());
        TraceAnnotationVisitor tav = createTraceAnnotationVisitor();
        text.add(tav.getText());
        text.add("}");
        if (av != null) {
            tav.av = av.visitArray(name);
        }
        return tav;
    }

    public void visitEnd() {
        if (av != null) {
            av.visitEnd();
        }
    }

    // ------------------------------------------------------------------------
    // Utility methods
    // ------------------------------------------------------------------------

    private void appendComa(final int i) {
        if (i != 0) {
            buf.append(", ");
        }
    }
}
