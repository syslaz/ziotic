package com.ziotic.updater.ref;

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

import java.util.Set;

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
