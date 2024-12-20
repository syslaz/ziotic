package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;

/**
 * @author Lazaro
 */
public class TLoader extends AbstractTransformer {
    public void visitClass(ClassNode c) {
        if (c.name.equals("loader")) {
            BotApp.loader.getHooker().injectInterface("Loader", c);
        }
    }

    public void visitField(ClassNode c, FieldNode f) {
        if (f.desc.equals("Ljava/applet/Applet;")) {
            BotApp.loader.getHooker().injectGetter("getClient", c, f);

            finished = true;
        }
    }
}
