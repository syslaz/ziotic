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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ziotic.asm.Label;
import com.ziotic.asm.MethodVisitor;
import com.ziotic.asm.Opcodes;

/**
 * A node that represents a TABLESWITCH instruction.
 *
 * @author Eric Bruneton
 */
public class TableSwitchInsnNode extends AbstractInsnNode {

    /**
     * The minimum key value.
     */
    public int min;

    /**
     * The maximum key value.
     */
    public int max;

    /**
     * Beginning of the default handler block.
     */
    public LabelNode dflt;

    /**
     * Beginnings of the handler blocks. This list is a list of
     * {@link LabelNode} objects.
     */
    public List labels;

    /**
     * Constructs a new {@link TableSwitchInsnNode}.
     *
     * @param min    the minimum key value.
     * @param max    the maximum key value.
     * @param dflt   beginning of the default handler block.
     * @param labels beginnings of the handler blocks. <tt>labels[i]</tt> is
     *               the beginning of the handler block for the <tt>min + i</tt> key.
     */
    public TableSwitchInsnNode(final int min, final int max, final LabelNode dflt, final LabelNode[] labels) {
        super(Opcodes.TABLESWITCH);
        this.min = min;
        this.max = max;
        this.dflt = dflt;
        this.labels = new ArrayList();
        if (labels != null) {
            this.labels.addAll(Arrays.asList(labels));
        }
    }

    public int getType() {
        return TABLESWITCH_INSN;
    }

    public void accept(final MethodVisitor mv) {
        Label[] labels = new Label[this.labels.size()];
        for (int i = 0; i < labels.length; ++i) {
            labels[i] = ((LabelNode) this.labels.get(i)).getLabel();
        }
        mv.visitTableSwitchInsn(min, max, dflt.getLabel(), labels);
    }

    public AbstractInsnNode clone(final Map labels) {
        return new TableSwitchInsnNode(min, max, clone(dflt, labels), clone(this.labels, labels));
    }
}