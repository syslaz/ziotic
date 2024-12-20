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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ziotic.Static;
import com.ziotic.asm.tree.AbstractInsnNode;
import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.LdcInsnNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.ClassCollection;
import com.ziotic.updater.util.ID;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;

import static com.ziotic.asm.Opcodes.ACC_INTERFACE;
import static com.ziotic.asm.Opcodes.ACC_NATIVE;

/**
 * @author Lazaro
 */
public class ClassNameTransformer extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private int interfaceId = 1;
    private Map<ID, Integer> classIds = new HashMap<ID, Integer>();
    private int cCount = 0;

    public ClassNameTransformer() {
        super(true);
        Static.atr.set("ignoredClasses", new HashSet<ID>());
    }

    @Override
    public void transform(ClassCollection cc) {
        for (int level = 1; level < 32; level++) {
            classLoop:
            for (ClassNode c : cc.getClasses().values()) {
                if (cc.getLevel(c) == level) {
                    if (c.name.length() <= 3 && !c.name.contains(".") && !containsNativeMethods(c) && BotApp.client.getRefactorer().getClass(new ID(c)) == null) {
                        String name;
                        if ((c.access & ACC_INTERFACE) != 0) {
                            name = "Interface" + interfaceId++;
                        } else {
                            name = name(c);
                            cCount++;
                        }
                        BotApp.client.getRefactorer().refactorClass(new ID(c), name);
                    } else {
                        for (Object mo : c.methods) {
                            MethodNode m = (MethodNode) mo;
                            if (m.name.equals("<init>")) {
                                for (AbstractInsnNode n : m.instructions.toArray()) {
                                    if (n instanceof LdcInsnNode) {
                                        if (((LdcInsnNode) n).cst.equals("sw3d")) {
                                            Static.atr.<Set>get("ignoredClasses").add(new ID(c));
                                            continue classLoop;
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
        logger.info("Refactored " + cCount + " classes and " + (interfaceId - 1) + " interfaces!");
    }

    private int id(ClassNode c) {
        if (c.superName == null) {
            return 1;
        } else {
            Integer i = classIds.get(new ID(c.superName));
            if (i == null) {
                i = 0;
            }
            i++;
            classIds.put(new ID(c.superName), i);
            return i;
        }
    }

    private String name(ClassNode c) {
        int id = id(c);
        int level = BotApp.client.getLevel(c);

        if (level == 1) {
            return "Class" + id;
        } else {
            StringBuilder name = new StringBuilder();
            String superName = BotApp.client.getRefactorer().getClass(new ID(c.superName));
            if (superName != null) {
                name.append(superName);
            } else {
                name.append(c.superName.substring(c.superName.lastIndexOf("/") + 1, c.superName.length()));
            }
            name.append("_Sub").append(id);
            return name.toString();
        }
    }

    private boolean containsNativeMethods(ClassNode c) {
        for (Object mo : c.methods) {
            MethodNode m = (MethodNode) mo;
            if ((m.access & ACC_NATIVE) != 0) {
                return true;
            }
        }
        return false;
    }
}
