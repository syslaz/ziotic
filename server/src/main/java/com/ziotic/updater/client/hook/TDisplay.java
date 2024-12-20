package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;

/**
 * @author Lazaro
 */
public class TDisplay extends AbstractTransformer {
    public void visitField(ClassNode c, FieldNode f) {
        if (f.desc.equals("Ljava/awt/DisplayMode;")) {
            BotApp.loader.getHooker().injectInterface("Display", c);

            BotApp.loader.getHooker().injectGetter("getDisplayMode", c, f);

            for (Object fo : c.fields) {
                FieldNode f2 = (FieldNode) fo;

                if (f2.desc.equals("Ljava/awt/GraphicsDevice;")) {
                    BotApp.loader.getHooker().injectGetter("getGraphicsDevice", c, f2);

                    finished = true;
                    return;
                }
            }
        }
    }
}
