package com.ziotic.updater.deob;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.Utilities;
import com.ziotic.utility.Logging;
import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
