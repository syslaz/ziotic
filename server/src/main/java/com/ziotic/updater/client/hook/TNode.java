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
import com.ziotic.asm.tree.FieldInsnNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.updater.util.MethodID;

import static com.ziotic.asm.Opcodes.*;

/**
 * @author Lazaro
 */
public class TNode extends AbstractTransformer {
    public void visitClass(ClassNode c) {
        if (c.name.equals(TByteStream.nodeClassName)) {
            BotApp.client.getHooker().injectInterface("Node", c);
        }
    }

    public void visitField(ClassNode c, FieldNode f) {
        if (c.name.equals(TByteStream.nodeClassName)) {
            if ((f.access & ACC_STATIC) == 0 && f.desc.equals("J")) {
                BotApp.client.getHooker().injectGetter("getId", c, f);
            }
        }
    }

    public void visitFieldInsn(ClassNode c, MethodNode m, FieldInsnNode n) {
        if ((m.access & ACC_STATIC) == 0 && c.name.equals(TByteStream.nodeClassName)) {
            if (n.getOpcode() != GETFIELD) {
                return;
            }

            if (n.getPrevious().getOpcode() != ALOAD) {
                return;
            }

            if (n.getNext().getOpcode() != IFNONNULL) {
                return;
            }

            BotApp.client.getRefactorer().refactorMethod(new MethodID(c, m), "hasNext");

            FieldNode nextField = BotApp.client.field(new FieldID(n));
            BotApp.client.getHooker().injectGetter("getNext", c, nextField);

            for (Object fo : c.fields) {
                FieldNode prevField = (FieldNode) fo;

                if ((prevField.access & ACC_STATIC) != 0) {
                    continue;
                }

                if (!prevField.equals(nextField) && prevField.desc.equals(nextField.desc)) {
                    BotApp.client.getHooker().injectGetter("getPrev", c, prevField);

                    finished = true;
                    return;
                }
            }
        }
    }
}
