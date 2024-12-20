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
package com.ziotic.updater.deob;

import com.ziotic.asm.tree.*;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.FieldID;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.GETSTATIC;
import static com.ziotic.asm.Opcodes.ISTORE;

/**
 * OP stands for opaque predicate.
 * <p/>
 * An OP is a confusing branch that bases it's
 * execution on the control field's state.
 * <p/>
 * This is a technique use by obfuscators to
 * confuse decompilers.
 * <p/>
 * Here we find the control field.
 *
 * @author Lazaro
 */
public class OPControlFieldFinder extends AbstractTransformer {
    private static Logger logger = Logging.log();

    @Override
    public void visitVarInsn(ClassNode c, MethodNode m, VarInsnNode n) {
        if (!c.name.equals("client")) {
            return;
        }

        if (n.getOpcode() != ISTORE) {
            return;
        }

        AbstractInsnNode prev = n.getPrevious();
        if (prev.getOpcode() != GETSTATIC) {
            return;
        }
        FieldInsnNode prev2 = (FieldInsnNode) prev;

        FieldNode f = BotApp.client.field(new FieldID(prev2));
        if (f != null && (f.desc.equals("Z") || f.desc.equals("I"))) {
            if (BotApp.client.getAttributes().isSet("opControlField")) {
                logger.error("Ambiguous control field found : " + f.name);
            }
            BotApp.client.getAttributes().set("opControlField", f);
            BotApp.client.getRefactorer().refactorField(new FieldID(prev2), "opControl");
            finished = true;
        }
    }

    @Override
    public void onFinish() {
        logger.info("Opaque predicate control field : " + BotApp.client.getAttributes().<FieldNode>get("opControlField").name);
    }
}
