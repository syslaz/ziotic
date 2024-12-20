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
 * A node that represents a LOOKUPSWITCH instruction.
 *
 * @author Eric Bruneton
 */
public class LookupSwitchInsnNode extends AbstractInsnNode {

    /**
     * Beginning of the default handler block.
     */
    public LabelNode dflt;

    /**
     * The values of the keys. This list is a list of {@link Integer} objects.
     */
    public List keys;

    /**
     * Beginnings of the handler blocks. This list is a list of
     * {@link LabelNode} objects.
     */
    public List labels;

    /**
     * Constructs a new {@link LookupSwitchInsnNode}.
     *
     * @param dflt   beginning of the default handler block.
     * @param keys   the values of the keys.
     * @param labels beginnings of the handler blocks. <tt>labels[i]</tt> is
     *               the beginning of the handler block for the <tt>keys[i]</tt> key.
     */
    public LookupSwitchInsnNode(final LabelNode dflt, final int[] keys, final LabelNode[] labels) {
        super(Opcodes.LOOKUPSWITCH);
        this.dflt = dflt;
        this.keys = new ArrayList(keys == null ? 0 : keys.length);
        this.labels = new ArrayList(labels == null ? 0 : labels.length);
        if (keys != null) {
            for (int i = 0; i < keys.length; ++i) {
                this.keys.add(new Integer(keys[i]));
            }
        }
        if (labels != null) {
            this.labels.addAll(Arrays.asList(labels));
        }
    }

    public int getType() {
        return LOOKUPSWITCH_INSN;
    }

    public void accept(final MethodVisitor mv) {
        int[] keys = new int[this.keys.size()];
        for (int i = 0; i < keys.length; ++i) {
            keys[i] = ((Integer) this.keys.get(i)).intValue();
        }
        Label[] labels = new Label[this.labels.size()];
        for (int i = 0; i < labels.length; ++i) {
            labels[i] = ((LabelNode) this.labels.get(i)).getLabel();
        }
        mv.visitLookupSwitchInsn(dflt.getLabel(), keys, labels);
    }

    public AbstractInsnNode clone(final Map labels) {
        LookupSwitchInsnNode clone = new LookupSwitchInsnNode(clone(dflt, labels), null, clone(this.labels, labels));
        clone.keys.addAll(keys);
        return clone;
    }
}
