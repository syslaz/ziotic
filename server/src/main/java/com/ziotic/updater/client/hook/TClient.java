package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;

import static com.ziotic.asm.Opcodes.ACC_STATIC;

/**
 * @author Lazaro
 */
public class TClient extends AbstractTransformer {
    public void visitClass(ClassNode c) {
        if (c.name.equals("client")) {
            BotApp.client.getHooker().injectInterface("Client", c);
        }
    }

    public void visitField(ClassNode c, FieldNode f) {
        if ((f.access & ACC_STATIC) != 0) {
            if (f.desc.equals("[L" + TPlayer.playerClassName + ";")) {
                BotApp.client.getHooker().injectGetter("getPlayers", c, f);
            }
        }
    }
}
