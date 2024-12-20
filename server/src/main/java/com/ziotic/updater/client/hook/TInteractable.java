/*
 * Copyright (c) 2024 Lazaro Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
public class TInteractable extends AbstractTransformer {
    public void visitIntInsn(final ClassNode c, MethodNode m, IntInsnNode n) {
        if (c.name.equals(TPlayer.entityClassName) && (m.access & ACC_STATIC) == 0) {
            if (n.operand == 240) {
                InsnFinder finder = new InsnFinder(m);

                FieldInsnNode sizeField = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.owner.equals(c.name);
                    }
                }, GETFIELD);

                if (sizeField == null) {
                    System.err.println("Entity.SIZE == NULL");
                    return;
                }

                final FieldInsnNode xField = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.owner.equals(TPlayer.interactableClassName);
                    }
                }, GETFIELD);

                if (xField == null) {
                    System.err.println("Interactable.X == NULL");
                    return;
                }

                FieldInsnNode yField = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.owner.equals(TPlayer.interactableClassName) && !n.name.equals(xField.name);
                    }
                }, GETFIELD);

                if (yField == null) {
                    System.err.println("Interactable.X == NULL");
                    return;
                }

                if (sizeField == null || xField == null || yField == null) {
                    return;
                }

                BotApp.client.getHooker().injectGetter("getSize", c, BotApp.client.field(new FieldID(sizeField)));

                ClassNode interactableClass = BotApp.client.getClass(xField.owner);

                BotApp.client.getHooker().injectInterface("Interactable", interactableClass);

                BotApp.client.getHooker().injectGetter("getX", interactableClass, BotApp.client.field(new FieldID(xField)));
                BotApp.client.getHooker().injectGetter("getY", interactableClass, BotApp.client.field(new FieldID(yField)));
            }
        }
    }

    public void visitLdcInsn(final ClassNode c, MethodNode m, LdcInsnNode n) {
        if (c.name.equals(TPlayer.interactableClassName) && (m.access & ACC_STATIC) == 0) {
            if (n.cst.equals(16L)) {
                if (n.getNext().getOpcode() != LADD) {
                    return;
                }

                InsnFinder finder = new InsnFinder(m);

                final FieldInsnNode f = finder.next(new Constraint<FieldInsnNode>() {
                    @Override
                    public boolean accept(FieldInsnNode n) {
                        return n.desc.equals("B") && n.owner.equals(c.name);
                    }
                }, GETFIELD);

                if (f == null) {
                    System.out.println("Interactable.PLANE == NULL");
                    return;
                }

                BotApp.client.getHooker().injectGetter("getPlane", c, BotApp.client.field(new FieldID(f)));
            }
        }
    }
}
