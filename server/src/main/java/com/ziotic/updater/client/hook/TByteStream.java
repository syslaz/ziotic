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

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;

import static com.ziotic.asm.Opcodes.ACC_STATIC;

/**
 * @author Lazaro
 */
public class TByteStream extends AbstractTransformer {
    public static String nodeClassName = null;

    public void visitLdcInsn(ClassNode c, MethodNode m, LdcInsnNode n) {
        if (n.cst.toString().contains("gjstr2")) {
            BotApp.client.getHooker().injectInterface("ByteStream", c);

            for (Object fo : c.fields) {
                FieldNode f = (FieldNode) fo;

                if ((f.access & ACC_STATIC) == 0) {
                    if (f.desc.equals("I")) {
                        BotApp.client.getHooker().injectGetter("getPosition", c, f);
                    } else if (f.desc.equals("[B")) {
                        BotApp.client.getHooker().injectGetter("getData", c, f);
                    }
                }
            }

            nodeClassName = c.superName;

            finished = true;
        }
    }
}
