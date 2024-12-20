package com.ziotic.updater.deob;

import com.ziotic.asm.Opcodes;
import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.utility.Logging;
import org.apache.log4j.Logger;

/**
 * OP stands for opaque predicate.
 * <p/>
 * An OP is a confusing branch that bases it's
 * execution on the control field's state.
 * <p/>
 * This is a technique use by obfuscators to
 * confuse decompilers.
 * <p/>
 * Here we strip these OPs.
 *
 * @author Lazaro
 */
public class OPRemover extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private MethodNode iStoreMethod = null;
    private VarInsnNode istore = null;
    private int count = 0;

    public OPRemover() {
        super(true);
    }

    @Override
    public void visitVarInsn(ClassNode c, MethodNode m, VarInsnNode n) {
        if (n.getOpcode() != Opcodes.ISTORE) {
            return;
        }

        AbstractInsnNode prev = n.getPrevious();
        if (prev.getOpcode() != Opcodes.GETSTATIC) {
            return;
        }
        FieldInsnNode prev2 = (FieldInsnNode) prev;

        FieldNode f = BotApp.client.field(new FieldID(prev2));
        if (f != null && f.equals(BotApp.client.getAttributes().get("opControlField"))) {
            iStoreMethod = m;
            istore = n;
        }
    }

    @Override
    public void visitJumpInsn(ClassNode c, MethodNode m, JumpInsnNode n) {
        if (n.getOpcode() == Opcodes.IFEQ || n.getOpcode() == Opcodes.IFNE) {
            AbstractInsnNode prev = n.getPrevious();
            if (prev.getOpcode() != Opcodes.ILOAD && prev.getOpcode() != Opcodes.GETSTATIC)
                return;
            if (prev.getOpcode() == Opcodes.ILOAD) {
                VarInsnNode prev2 = (VarInsnNode) prev;
                if (istore == null) {
                    return;
                }
                if (m != iStoreMethod) {
                    return;
                }
                if (prev2.var != istore.var) {
                    return;
                }
                if (!hasUse(m, n, istore)) {
                    if (istore.getPrevious() != null) {
                        m.instructions.remove(istore.getPrevious());
                    }
                    m.instructions.remove(istore);
                }
            } else if (prev.getOpcode() == Opcodes.GETSTATIC) {
                FieldInsnNode prev2 = (FieldInsnNode) prev;

                FieldNode f = BotApp.client.field(new FieldID(prev2));
                if (f == null || !f.equals(BotApp.client.getAttributes().get("opControlField"))) {
                    return;
                }
            }
            if (n.getOpcode() == Opcodes.IFEQ) {
                m.instructions.set(n, new JumpInsnNode(Opcodes.GOTO, n.label));
                m.instructions.remove(prev);
            } else {
                m.instructions.remove(n);
            }
            count++;
        }
    }

    private boolean hasUse(MethodNode m, AbstractInsnNode pos, VarInsnNode istore) {
        AbstractInsnNode n = pos;
        while (n != null) {
            if (n instanceof VarInsnNode) {
                VarInsnNode n2 = (VarInsnNode) n;
                if (n2.var == istore.var) {
                    return true;
                }
            }
            n = n.getNext();
        }
        return false;
    }

    @Override
    public void onFinish() {
        logger.info("Stripped " + count + " opaque predicates!");
    }
}
