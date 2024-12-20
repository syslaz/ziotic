package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;

import static com.ziotic.asm.Opcodes.ACC_STATIC;

/**
 * @author Lazaro
 */
public class TByteStream extends AbstractTransformer {
    public static String nodeClassName = null;

    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n) {
        if (n.cst.toString().contains("gjstr2")) {
            BotApp.client.getHooker().injectInterface("ByteStream", c);

            for (Object fo : c.fields) {
                FieldNode f = (FieldNode) fo;

                if ((f.access & ACC_STATIC) == 0) {
                    if (f.desc.equals("I")) {
                        BotApp.client.getHooker().injectGetter("getPosition", c, f);
                    } else if (f.desc.equals("[B")) {
                        BotApp.client.getHooker().injectGetter("getData", c, f);
                    }
                }
            }

            nodeClassName = c.superName;

            finished = true;
        }
    }
}
