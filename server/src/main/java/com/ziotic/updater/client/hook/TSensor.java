package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;

/**
 * @author Lazaro
 */
public class TSensor extends AbstractTransformer {
    public void visitField(ClassNode c, FieldNode f) {
        if (f.desc.equals("Ljava/awt/Robot;")) {
            BotApp.loader.getHooker().injectInterface("Sensor", c);

            BotApp.loader.getHooker().injectGetter("getRobot", c, f);

            for (Object fo : c.fields) {
                FieldNode f2 = (FieldNode) fo;

                if (f2.desc.equals("Ljava/awt/Component;")) {
                    BotApp.loader.getHooker().injectGetter("getComponent", c, f2);

                    finished = true;
                    return;
                }
            }
        }
    }
}
