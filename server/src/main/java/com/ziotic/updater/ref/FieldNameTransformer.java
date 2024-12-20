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
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.updater.BotApp;
import com.ziotic.updater.util.AbstractTransformer;
import com.ziotic.updater.util.ClassCollection;
import com.ziotic.updater.util.FieldID;
import com.ziotic.utility.Logging;
import com.ziotic.utility.Text;

import org.apache.log4j.Logger;

/**
 * @author Lazaro
 */
public class FieldNameTransformer extends AbstractTransformer {
    private static final Logger logger = Logging.log();

    private int fieldId = 1;

    public FieldNameTransformer() {
        super(true);
    }

    @Override
    public void transform(ClassCollection cc) {
        for (int level = 1; level < 32; level++) {
            classLoop:
            for (ClassNode c : cc.getClasses().values()) {
                if (cc.getLevel(c) == level && !Static.atr.<Set>get("ignoredClasses").contains(c)) {
                    fieldLoop:
                    for (Object fo : c.fields) {
                        FieldNode f = (FieldNode) fo;

                        if (f.name.length() <= 3 && BotApp.client.getRefactorer().getField(new FieldID(c, f)) == null) {
                            ClassNode d = BotApp.client.getDeclorator(c, f);
                            if (d == c) {
                                ClassNode[] inheritors = BotApp.client.getInheritors(c, f);
                                for (ClassNode c2 : inheritors) {
                                    if (c2 != c) {
                                        for (Object fo2 : c2.fields) {
                                            FieldNode f2 = (FieldNode) fo2;

                                            if (f2.name.equals(f.name) && f2.desc.equals(f.desc) && Static.atr.<Set>get("ignoredClasses").contains(c2)) {
                                                continue fieldLoop;
                                            }
                                        }
                                    }
                                }
                                String intro;
                                String type;
                                String array = "";
                                String simpleDesc = f.desc.replace("[", "");

                                if (simpleDesc.equals("Z")) {
                                    type = "Bool";
                                } else if (simpleDesc.equals("B")) {
                                    type = "Byte";
                                } else if (simpleDesc.equals("C")) {
                                    type = "Char";
                                } else if (simpleDesc.equals("S")) {
                                    type = "Short";
                                } else if (simpleDesc.equals("I")) {
                                    type = "Int";
                                } else if (simpleDesc.equals("J")) {
                                    type = "Long";
                                } else if (simpleDesc.equals("F")) {
                                    type = "Float";
                                } else if (simpleDesc.equals("D")) {
                                    type = "Double";
                                } else if (simpleDesc.startsWith("L")) {
                                    type = simpleDesc.substring(1, simpleDesc.length() - 1);
                                    if (type.contains("/")) {
                                        type = type.substring(type.lastIndexOf("/") + 1);
                                    }
                                } else {
                                    return;
                                }

                                int dimensions = 1;
                                for (char ch : f.desc.toCharArray()) {
                                    if (ch == '[') {
                                        dimensions++;
                                    }
                                }

                                for (int i = 0; i < dimensions - 1; i++) {
                                    array += "Array";
                                }

                                if (Text.startsWithVowel(type)) {
                                    intro = "an";
                                } else {
                                    intro = "a";
                                }
                                String name = intro + type + array + fieldId++;
                                BotApp.client.getRefactorer().refactorField(new FieldID(c, f), name);
                                for (ClassNode c2 : inheritors) {
                                    if (c2 != c) {
                                        for (Object fo2 : c2.fields) {
                                            FieldNode f2 = (FieldNode) fo2;

                                            if (f2.name.equals(f.name) && f2.desc.equals(f.desc)) {
                                                BotApp.client.getRefactorer().refactorField(new FieldID(c2, f2), name);
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
        logger.info("Refactored " + (fieldId - 1) + " fields!");
    }
}
