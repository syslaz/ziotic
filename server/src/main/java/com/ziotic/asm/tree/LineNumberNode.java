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
package com.ziotic.asm.tree;

import java.util.Map;

import com.ziotic.asm.MethodVisitor;

/**
 * A node that represents a line number declaration. These nodes are pseudo
 * instruction nodes in order to be inserted in an instruction list.
 *
 * @author Eric Bruneton
 */
public class LineNumberNode extends AbstractInsnNode {

    /**
     * A line number. This number refers to the source file from which the class
     * was compiled.
     */
    public int line;

    /**
     * The first instruction corresponding to this line number.
     */
    public LabelNode start;

    /**
     * Constructs a new {@link LineNumberNode}.
     *
     * @param line  a line number. This number refers to the source file from
     *              which the class was compiled.
     * @param start the first instruction corresponding to this line number.
     */
    public LineNumberNode(final int line, final LabelNode start) {
        super(-1);
        this.line = line;
        this.start = start;
    }

    public int getType() {
        return LINE;
    }

    public void accept(final MethodVisitor mv) {
        mv.visitLineNumber(line, start.getLabel());
    }

    public AbstractInsnNode clone(final Map labels) {
        return new LineNumberNode(line, clone(start, labels));
    }
}
