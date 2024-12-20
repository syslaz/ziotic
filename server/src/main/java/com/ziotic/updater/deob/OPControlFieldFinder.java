package com.ziotic.updater.deob;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.utility.Logging;
import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.GETSTATIC;
import static com.ziotic.asm.Opcodes.ISTORE;

/**
 * OP stands for opaque predicate.
 * <p/>
 * An OP is a confusing branch that bases it's
 * execution on the control field's state.
 * <p/>
 * This is a technique use by obfuscators to
 * confuse decompilers.
 * <p/>
 * Here we find the control field.
 *
 * @author Lazaro
 */
public class OPControlFieldFinder extends AbstractTransformer {
    private static Logger logger = Logging.log();

    @Override
    public void visitVarInsn(ClassNode c, MethodNode m, VarInsnNode n) {
        if (!c.name.equals("client")) {
            return;
        }

        if (n.getOpcode() != ISTORE) {
            return;
        }

        AbstractInsnNode prev = n.getPrevious();
        if (prev.getOpcode() != GETSTATIC) {
            return;
        }
        FieldInsnNode prev2 = (FieldInsnNode) prev;

        FieldNode f = BotApp.client.field(new FieldID(prev2));
        if (f != null && (f.desc.equals("Z") || f.desc.equals("I"))) {
            if (BotApp.client.getAttributes().isSet("opControlField")) {
                logger.error("Ambiguous control field found : " + f.name);
            }
            BotApp.client.getAttributes().set("opControlField", f);
            BotApp.client.getRefactorer().refactorField(new FieldID(prev2), "opControl");
            finished = true;
        }
    }

    @Override
    public void onFinish() {
        logger.info("Opaque predicate control field : " + BotApp.client.getAttributes().<FieldNode>get("opControlField").name);
    }
}
