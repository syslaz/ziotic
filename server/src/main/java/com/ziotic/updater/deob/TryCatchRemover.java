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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.Utilities;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.*;

/**
 * @author Lazaro
 */
public class TryCatchRemover extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private int count = 0;

    public TryCatchRemover() {
        super(true);
    }

    @Override
    public void visitVarInsn(ClassNode c, MethodNode m, VarInsnNode start) {
        if (start.getOpcode() != ASTORE) {
            return;
        }

        AbstractInsnNode end = null;

        List<TryCatchBlockNode> correspondingTCBs = new LinkedList<TryCatchBlockNode>();
        for (Object tcbo : m.tryCatchBlocks) {
            TryCatchBlockNode tcb = (TryCatchBlockNode) tcbo;

            if (Utilities.nextRealInsn(tcb.handler) == start) {
                if (tcb.type == null || !tcb.type.equals("java/lang/RuntimeException")) {
                    return;
                }
                correspondingTCBs.add(tcb);
                if (end == null || end.getOpcode() != ATHROW) {
                    end = Utilities.nextRealInsn(tcb.end);
                    while (end != null && end.getOpcode() != ATHROW) {
                        end = end.getNext();
                    }
                }
            }
        }
        if (correspondingTCBs.isEmpty()) {
            return;
        }

        if (end == null || end.getOpcode() != ATHROW) {
            return;
        }

        for (TryCatchBlockNode tcb : correspondingTCBs) {
            m.tryCatchBlocks.remove(tcb);
        }
        LinkedList<AbstractInsnNode> tcb = new LinkedList<AbstractInsnNode>();
        LinkedList<String> tcbN = new LinkedList<String>();
        AbstractInsnNode n = start;
        while (n != null) {
            if (!(n.getOpcode() == -1)) {
                tcb.add(n);
                tcbN.add(Utilities.toString(n));
            }
            if (n == end) {
                break;
            }
            n = n.getNext();
        }
        if (tcb.getLast().getOpcode() == RETURN) {
            tcb.removeLast();
            tcbN.removeLast();
        }

        for (Iterator<AbstractInsnNode> it = tcb.iterator(); it.hasNext(); ) {
            m.instructions.remove(it.next());
        }
        count++;
    }

    @Override
    public void onFinish() {
        logger.info("Removed " + count + " faulty try-catches!");
    }
}
