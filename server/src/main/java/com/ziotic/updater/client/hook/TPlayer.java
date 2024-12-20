package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.InsnFinder;
import com.ziotic.updater.util.RegexInsnFinder;

import java.util.ArrayList;

import static com.ziotic.asm.Opcodes.ACC_STATIC;
import static com.ziotic.asm.Opcodes.PUTFIELD;

/**
 * @author Lazaro
 */
public class TPlayer extends AbstractTransformer {
    public static String playerClassName = null;
    public static String entityClassName = null;
    public static String animableClassName = null;
    public static String interactableClassName = null;

    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n) {
        if (n.cst.equals("gdn1")) {
            BotApp.client.getHooker().injectInterface("Player", c);

            playerClassName = c.name;
            entityClassName = c.superName;
            ClassNode animable = BotApp.client.getClass(BotApp.client.getClass(entityClassName).superName);
            animableClassName = animable.name;
            interactableClassName = animable.superName;

            for (Object mo : new ArrayList(c.methods)) {
                if (mo.equals(m))
                    continue;

                MethodNode m2 = (MethodNode) mo;

                if ((m2.access & ACC_STATIC) == 0) {
                    RegexInsnFinder finder = new RegexInsnFinder(m2);

                    AbstractInsnNode[] match = finder.find("ICONST_5 NEWARRAY");
                    if (match.length == 0) {
                        continue;
                    }

                    InsnFinder finder2 = new InsnFinder(m2);

                    while (finder2.next() != match[1])
                        ;

                    BotApp.client.getHooker().injectGetter("getRenderId", c, BotApp.client.field(new FieldID(finder2.<FieldInsnNode>next(PUTFIELD))));

                    BotApp.client.getHooker().injectGetter("getName", c, BotApp.client.field(new FieldID(finder2.<FieldInsnNode>next(PUTFIELD))));
                }
            }
        }
    }
}
