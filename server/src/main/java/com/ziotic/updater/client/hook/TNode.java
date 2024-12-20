package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldInsnNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.MethodID;

import static com.ziotic.asm.Opcodes.*;

/**
 * @author Lazaro
 */
public class TNode extends AbstractTransformer {
    public void visitClass(ClassNode c) {
        if (c.name.equals(TByteStream.nodeClassName)) {
            BotApp.client.getHooker().injectInterface("Node", c);
        }
    }

    public void visitField(ClassNode c, FieldNode f) {
        if (c.name.equals(TByteStream.nodeClassName)) {
            if ((f.access & ACC_STATIC) == 0 && f.desc.equals("J")) {
                BotApp.client.getHooker().injectGetter("getId", c, f);
            }
        }
    }

    public void visitFieldInsn(ClassNode c, MethodNode m, FieldInsnNode n) {
        if ((m.access & ACC_STATIC) == 0 && c.name.equals(TByteStream.nodeClassName)) {
            if (n.getOpcode() != GETFIELD) {
                return;
            }

            if (n.getPrevious().getOpcode() != ALOAD) {
                return;
            }

            if (n.getNext().getOpcode() != IFNONNULL) {
                return;
            }

            BotApp.client.getRefactorer().refactorMethod(new MethodID(c, m), "hasNext");

            FieldNode nextField = BotApp.client.field(new FieldID(n));
            BotApp.client.getHooker().injectGetter("getNext", c, nextField);

            for (Object fo : c.fields) {
                FieldNode prevField = (FieldNode) fo;

                if ((prevField.access & ACC_STATIC) != 0) {
                    continue;
                }

                if (!prevField.equals(nextField) && prevField.desc.equals(nextField.desc)) {
                    BotApp.client.getHooker().injectGetter("getPrev", c, prevField);

                    finished = true;
                    return;
                }
            }
        }
    }
}
