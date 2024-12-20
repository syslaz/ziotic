package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.InsnFinder;

import static com.ziotic.asm.Opcodes.GETFIELD;
import static com.ziotic.asm.Opcodes.GETSTATIC;

/**
 * @author Lazaro
 */
public class TEntity extends AbstractTransformer {
    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n) {
        if (n.cst.equals("T2 - ")) {
            ClassNode entityClass = BotApp.client.getClass(TPlayer.entityClassName);
            BotApp.client.getHooker().injectInterface("Entity", entityClass);
            for (Object fo : entityClass.fields) {
                FieldNode f = (FieldNode) fo;

                if (f.desc.equals("Ljava/lang/String;")) {
                    BotApp.client.getHooker().injectGetter("getChat", entityClass, f);
                }
            }

            InsnFinder finder = new InsnFinder(m);

            while (finder.next() != n)
                ;

            finder.nextLDC(" - ");

            FieldInsnNode f = finder.next(GETSTATIC);
            ClassNode owner = BotApp.client.getClass(f.owner);
            BotApp.client.getHooker().injectGetter("getLastPacketSize", owner, BotApp.client.field(new FieldID(f)));

            finder.nextLDC(",");

            f = finder.next(GETSTATIC);
            if (f.desc.startsWith("L")) {
                f = finder.next(GETFIELD);
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getPosQueueX", owner, BotApp.client.field(new FieldID(f)));

                f = finder.next(GETSTATIC);
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getBaseX", owner, BotApp.client.field(new FieldID(f)));
            } else {
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getBaseX", owner, BotApp.client.field(new FieldID(f)));

                f = finder.next(GETFIELD);
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getPosQueueX", owner, BotApp.client.field(new FieldID(f)));
            }

            finder.nextLDC(",");

            f = finder.next(GETSTATIC);
            if (f.desc.startsWith("L")) {
                f = finder.next(GETFIELD);
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getPosQueueY", owner, BotApp.client.field(new FieldID(f)));

                f = finder.next(GETSTATIC);
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getBaseY", owner, BotApp.client.field(new FieldID(f)));
            } else {
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getBaseY", owner, BotApp.client.field(new FieldID(f)));

                f = finder.next(GETFIELD);
                owner = BotApp.client.getClass(f.owner);
                BotApp.client.getHooker().injectGetter("getPosQueueY", owner, BotApp.client.field(new FieldID(f)));
            }
        }
    }
}
