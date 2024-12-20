package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.InsnFinder;
import com.ziotic.updater.util.InsnFinder.Constraint;

import static com.ziotic.asm.Opcodes.*;

/**
 * @author Lazaro
 */
public class TCamera extends AbstractTransformer {
    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n) {
        if (n.cst.equals(-2607.5945876176133D)) {
            InsnFinder finder = new InsnFinder(m);

            if (finder.next(new Constraint<IincInsnNode>() {
                @Override
                public boolean accept(IincInsnNode n) {
                    return n.incr == 16384;
                }
            }, IINC) != null) {
                return;
            }

            finder.index(0);

            AbstractInsnNode checkpoint = finder.next(new Constraint<AbstractInsnNode>() {
                @Override
                public boolean accept(AbstractInsnNode n) {
                    AbstractInsnNode p = n.getPrevious();
                    if (p != null && p.getOpcode() == BIPUSH) {
                        IntInsnNode pInt = (IntInsnNode) p;
                        return pInt.operand == 100 || pInt.operand == -101;
                    }
                    return false;
                }
            }, IF_ICMPLT, IF_ICMPGT);

            if (checkpoint == null) {
                // System.out.println("CHECKPOINT == NULL [" + c.name + "." + m.name + m.desc + "]");
                return;
            }

            FieldInsnNode f = finder.next(GETSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraMovementX", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            f = finder.next(GETSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraMovementZ", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            finder.next(INVOKESTATIC);

            f = finder.next(GETSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraMovementY", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            f = finder.next(GETSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraX", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            f = finder.next(GETSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraY", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            f = finder.next(GETSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraZ", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            f = finder.next(PUTSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraPitch", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));

            f = finder.next(PUTSTATIC);
            BotApp.client.getHooker().injectGetter("getCameraYaw", BotApp.client.getClass(f.owner), BotApp.client.field(new FieldID(f)));
        }
    }
}
