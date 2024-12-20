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
package com.ziotic.updater.ref;

import java.util.Set;

import com.ziotic.Static;
import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.ClassCollection;
import com.ziotic.updater.util.MethodID;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.ACC_NATIVE;

/**
 * @author Lazaro
 */
public class MethodNameTransformer extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private int methodId = 1;

    public MethodNameTransformer() {
        super(true);
    }

    @Override
    public void transform(ClassCollection cc) {
        for (int level = 1; level < 32; level++) {
            classLoop:
            for (ClassNode c : cc.getClasses().values()) {
                if (cc.getLevel(c) == level && !Static.atr.<Set>get("ignoredClasses").contains(c)) {
                    methodLoop:
                    for (Object mo : c.methods) {
                        MethodNode m = (MethodNode) mo;

                        if ((m.access & ACC_NATIVE) == 0 && m.name.length() <= 3 && BotApp.client.getRefactorer().getMethod(new MethodID(c, m)) == null) {
                            ClassNode d = BotApp.client.getDeclorator(c, m);
                            if (d == c) {
                                ClassNode[] inheritors = BotApp.client.getInheritors(c, m);
                                for (ClassNode c2 : inheritors) {
                                    if (c2 != c) {
                                        for (Object mo2 : c2.methods) {
                                            MethodNode m2 = (MethodNode) mo2;

                                            if (m2.name.equals(m.name) && m2.desc.equals(m.desc) && ((m2.access & ACC_NATIVE) != 0 || Static.atr.<Set>get("ignoredClasses").contains(c2))) {
                                                continue methodLoop;
                                            }
                                        }
                                    }
                                }
                                String name = "method" + methodId++;
                                BotApp.client.getRefactorer().refactorMethod(new MethodID(c, m), name);
                                for (ClassNode c2 : inheritors) {
                                    if (c2 != c) {
                                        for (Object mo2 : c2.methods) {
                                            MethodNode m2 = (MethodNode) mo2;

                                            if (m2.name.equals(m.name) && m2.desc.equals(m.desc)) {
                                                BotApp.client.getRefactorer().refactorMethod(new MethodID(c2, m2), name);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onFinish() {
        logger.info("Refactored " + (methodId - 1) + " methods!");
    }
}
