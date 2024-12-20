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
package com.ziotic.updater.deob;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.Utilities;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.GOTO;
import static com.ziotic.asm.Opcodes.RETURN;

/**
 * @author Lazaro
 */
public class FlowSimplifier extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private int rCount = 0, gCount = 0;

    public FlowSimplifier() {
        super(true);
    }

    @Override
    public void visitInsn(ClassNode c, MethodNode m, AbstractInsnNode n) {
        if (n.getOpcode() == RETURN) {
            AbstractInsnNode nx = Utilities.nextRealInsn(n.getNext());
            if (nx == null)
                return;
            if (nx.getOpcode() == RETURN) {
                m.instructions.remove(n);
                rCount++;
            }
        }
    }

    @Override
    public void visitJumpInsn(ClassNode c, MethodNode m, JumpInsnNode n) {
        AbstractInsnNode r = Utilities.nextRealInsn(n.label);
        if (r != null && r.getOpcode() == GOTO) {
            JumpInsnNode rj = (JumpInsnNode) r;

            LabelNode ol = n.label;
            n.label = rj.label;

            //if(!Utilities.hasTargeters(m, ol)) {
            //    m.instructions.remove(rj);
            //}

            gCount++;
        }
    }

    @Override
    public void onFinish() {
        logger.info("Removed " + rCount + " redundant returns and simplified " + gCount + " complex jumps!");
    }
}
