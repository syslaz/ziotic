package com.ziotic.updater.client.hook;

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldInsnNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.InsnFinder;
import com.ziotic.updater.util.InsnFinder.Constraint;

import static com.ziotic.asm.Opcodes.*;

/**
 * @author Lazaro
 */
public class TAnimable extends AbstractTransformer {
    public void visitClass(ClassNode c) {
        if (c.name.equals(TPlayer.animableClassName)) {
            BotApp.client.getHooker().injectInterface("Animable", c);
        }
    }

    public void visitLdcInsn(final ClassNode c, MethodNode m, LdcInsnNode n) {
        if (c.name.equals(TPlayer.animableClassName) && (m.access & ACC_STATIC) == 0) {
            if (n.cst.equals(16L)) {
                if (n.getNext().getOpcode() != LADD) {
                    return;
                }

                InsnFinder finder = new InsnFinder(m);

                final FieldInsnNode f = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.desc.equals("S") && n.owner.equals(c.name);
                    }
                }, GETFIELD);
                final FieldInsnNode f2 = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.desc.equals("S") && n.owner.equals(c.name) && !n.name.equals(f.name);
                    }
                }, GETFIELD);
                final FieldInsnNode f3 = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.desc.equals("S") && n.owner.equals(c.name) && !n.name.equals(f.name) && !n.name.equals(f2.name);
                    }
                }, GETFIELD);
                FieldInsnNode f4 = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.desc.equals("S") && n.owner.equals(c.name) && !n.name.equals(f.name) && !n.name.equals(f2.name) && !n.name.equals(f3.name);
                    }
                }, GETFIELD);

                if (f == null || f2 == null || f3 == null || f4 == null) {
                    return;
                }

                BotApp.client.getHooker().injectGetter("getX1", c, BotApp.client.field(new FieldID(f)));
                BotApp.client.getHooker().injectGetter("getX2", c, BotApp.client.field(new FieldID(f2)));
                BotApp.client.getHooker().injectGetter("getY1", c, BotApp.client.field(new FieldID(f3)));
                BotApp.client.getHooker().injectGetter("getY2", c, BotApp.client.field(new FieldID(f4)));

                finished = true;
            }
        }
    }
}
