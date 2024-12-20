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
package com.ziotic.asm.commons;

import com.ziotic.asm.Label;
import com.ziotic.asm.MethodAdapter;
import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.Opcodes;

/**
 * A {@link MethodAdapter} that can be used to approximate method size.
 *
 * @author Eugene Kuleshov
 */
public class CodeSizeEvaluator extends MethodAdapter implements Opcodes {

    private int minSize;

    private int maxSize;

    public CodeSizeEvaluator(final MethodVisitor mv) {
        super(mv);
    }

    public int getMinSize() {
        return this.minSize;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void visitInsn(final int opcode) {
        minSize += 1;
        maxSize += 1;
        if (mv != null) {
            mv.visitInsn(opcode);
        }
    }

    public void visitIntInsn(final int opcode, final int operand) {
        if (opcode == SIPUSH) {
            minSize += 3;
            maxSize += 3;
        } else {
            minSize += 2;
            maxSize += 2;
        }
        if (mv != null) {
            mv.visitIntInsn(opcode, operand);
        }
    }

    public void visitVarInsn(final int opcode, final int var) {
        if (var < 4 && opcode != RET) {
            minSize += 1;
            maxSize += 1;
        } else if (var >= 256) {
            minSize += 4;
            maxSize += 4;
        } else {
            minSize += 2;
            maxSize += 2;
        }
        if (mv != null) {
            mv.visitVarInsn(opcode, var);
        }
    }

    public void visitTypeInsn(final int opcode, final String type) {
        minSize += 3;
        maxSize += 3;
        if (mv != null) {
            mv.visitTypeInsn(opcode, type);
        }
    }

    public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {
        minSize += 3;
        maxSize += 3;
        if (mv != null) {
            mv.visitFieldInsn(opcode, owner, name, desc);
        }
    }

    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {
        if (opcode == INVOKEINTERFACE || opcode == INVOKEDYNAMIC) {
            minSize += 5;
            maxSize += 5;
        } else {
            minSize += 3;
            maxSize += 3;
        }
        if (mv != null) {
            mv.visitMethodInsn(opcode, owner, name, desc);
        }
    }

    public void visitJumpInsn(final int opcode, final Label label) {
        minSize += 3;
        if (opcode == GOTO || opcode == JSR) {
            maxSize += 5;
        } else {
            maxSize += 8;
        }
        if (mv != null) {
            mv.visitJumpInsn(opcode, label);
        }
    }

    public void visitLdcInsn(final Object cst) {
        if (cst instanceof Long || cst instanceof Double) {
            minSize += 3;
            maxSize += 3;
        } else {
            minSize += 2;
            maxSize += 3;
        }
        if (mv != null) {
            mv.visitLdcInsn(cst);
        }
    }

    public void visitIincInsn(final int var, final int increment) {
        if (var > 255 || increment > 127 || increment < -128) {
            minSize += 6;
            maxSize += 6;
        } else {
            minSize += 3;
            maxSize += 3;
        }
        if (mv != null) {
            mv.visitIincInsn(var, increment);
        }
    }

    public void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label[] labels) {
        minSize += 13 + labels.length * 4;
        maxSize += 16 + labels.length * 4;
        if (mv != null) {
            mv.visitTableSwitchInsn(min, max, dflt, labels);
        }
    }

    public void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
        minSize += 9 + keys.length * 8;
        maxSize += 12 + keys.length * 8;
        if (mv != null) {
            mv.visitLookupSwitchInsn(dflt, keys, labels);
        }
    }

    public void visitMultiANewArrayInsn(final String desc, final int dims) {
        minSize += 4;
        maxSize += 4;
        if (mv != null) {
            mv.visitMultiANewArrayInsn(desc, dims);
        }
    }
}
