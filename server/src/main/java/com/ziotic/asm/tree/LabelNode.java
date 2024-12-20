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

import com.ziotic.asm.Label;
import com.ziotic.asm.MethodVisitor;

/**
 * An {@link AbstractInsnNode} that encapsulates a {@link Label}.
 */
public class LabelNode extends AbstractInsnNode {

    private Label label;

    public LabelNode() {
        super(-1);
    }

    public LabelNode(final Label label) {
        super(-1);
        this.label = label;
    }

    public int getType() {
        return LABEL;
    }

    public Label getLabel() {
        if (label == null) {
            label = new Label();
        }
        return label;
    }

    public void accept(final MethodVisitor cv) {
        cv.visitLabel(getLabel());
    }

    public AbstractInsnNode clone(final Map labels) {
        return (LabelNode) labels.get(this);
    }

    public void resetLabel() {
        label = null;
    }
}