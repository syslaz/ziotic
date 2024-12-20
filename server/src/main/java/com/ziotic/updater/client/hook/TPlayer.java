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

import java.util.ArrayList;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.InsnFinder;
import com.ziotic.updater.util.RegexInsnFinder;

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
