package com.ziotic.updater;

import com.ziotic.Application;
import com.ziotic.Static;
import com.ziotic.asm.tree.*;
import com.ziotic.updater.util.*;
import com.ziotic.utility.Logging;
import org.apache.log4j.Logger;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.ziotic.asm.Opcodes.ACC_ABSTRACT;
import static com.ziotic.asm.Opcodes.ACC_NATIVE;

/**
 * @author Lazaro
 */
public class UpdaterApp implements Application {
    private static Logger logger = Logging.log();

    private static int TOTAL_EXPECTED_CLASS_HOOKS = 10;
    private static int TOTAL_EXPECTED_FIELD_HOOKS = 35;

    public void main(String[] args) throws Throwable {
        Static.appType = AppType.UPDATER;

        URL loaderURL = new URL("jar:file:loader.jar!/");
        URL clientURL = new URL("jar:file:runescape.jar!/");
        if (!new File("loader.jar").exists()) {
            loaderURL = new URL("jar:http://world2.runescape.com/loader.jar!/");
        }
        if (!new File("runescape.jar").exists()) {
            clientURL = new URL("jar:http://world2.runescape.com/runescape.jar!/");
        }

        logger.info("Loading transformers...");
        List<String> loaderTransformerStrings = (List<String>) Static.xml.readObject(Static.parseString("%WORK_DIR%/loader.xml"));
        List<Transformer> loaderTransformers = new LinkedList<Transformer>();
        for (String tName : loaderTransformerStrings) {
            Class<?> tClass = Class.forName(tName);

            Transformer t = (Transformer) tClass.newInstance();

            loaderTransformers.add(t);
        }
        logger.info("Loaded " + loaderTransformers.size() + " loader transformers");

        List<String> clientTransformerStrings = (List<String>) Static.xml.readObject(Static.parseString("%WORK_DIR%/client.xml"));
        List<Transformer> clientTransformers = new LinkedList<Transformer>();
        for (String tName : clientTransformerStrings) {
            Class<?> tClass = Class.forName(tName);

            Transformer t = (Transformer) tClass.newInstance();

            clientTransformers.add(t);
        }
        logger.info("Loaded " + clientTransformers.size() + " client transformers");

        logger.info("Loading classes...");
        BotApp.loader = new ClassCollection(loaderURL);
        BotApp.loader.load();
        logger.info("Loaded " + BotApp.loader.getClasses().size() + " loader classes!");

        BotApp.client = new ClassCollection(clientURL);
        BotApp.client.load();
        logger.info("Loaded " + BotApp.client.getClasses().size() + " client classes!");

        transform(BotApp.loader, loaderTransformers);
        transform(BotApp.client, clientTransformers);

        int classHooks = 0;
        int fieldHooks = 0;
        for (Map.Entry<ID, Hooker.ClassHook> c : BotApp.loader.getHooker().getClassMap().entrySet()) {
            classHooks++;
            System.out.println("* " + c.getValue().interfaceName.replace(Hooker.ACCESSOR_PACKAGE, "") + " -> " + c.getKey().name);
            for (Map.Entry<FieldID, Hooker.FieldHook> f : BotApp.loader.getHooker().getClassFieldMap().get(c.getKey()).entrySet()) {
                fieldHooks++;
                System.out.println("   ^ " + f.getValue().methodName + "() -> " + f.getKey().toString());
            }
        }
        for (Map.Entry<ID, Hooker.ClassHook> c : BotApp.client.getHooker().getClassMap().entrySet()) {
            classHooks++;
            System.out.println("* " + c.getValue().interfaceName.replace(Hooker.ACCESSOR_PACKAGE, "") + " -> " + c.getKey().name);
            for (Map.Entry<FieldID, Hooker.FieldHook> f : BotApp.client.getHooker().getClassFieldMap().get(c.getKey()).entrySet()) {
                fieldHooks++;
                System.out.println("   ^ " + f.getValue().methodName + "() -> " + f.getKey().toString());
            }
        }

        System.out.println("Hooked " + classHooks + "/" + TOTAL_EXPECTED_CLASS_HOOKS + " classes");
        System.out.println("Hooked " + fieldHooks + "/" + TOTAL_EXPECTED_FIELD_HOOKS + " fields");

        BotApp.loader.transform();
        BotApp.client.transform();

        logger.info("Saving client...");
        BotApp.loader.save(new File("loader_out.jar"));
        BotApp.client.save(new File("runescape_out.jar"));
        logger.info("Saved client");
    }

    private void transform(ClassCollection module, List<Transformer> transformers) {
        trans:
        for (Transformer t : transformers) {
            try {
                // logger.debug("Applying " + t + "...");
                t.transform(module);
                for (ClassNode c : module.getClasses().values()) {
                    if (t.finished()) {
                        t.onFinish();
                        continue trans;
                    }

                    t.visitClass(c);

                    for (Object fo : new ArrayList(c.fields)) {
                        if (t.finished()) {
                            break;
                        }

                        FieldNode f = (FieldNode) fo;

                        t.visitField(c, f);
                    }

                    for (Object mo : new ArrayList(c.methods)) {
                        if (t.finished()) {
                            break;
                        }

                        MethodNode m = (MethodNode) mo;
                        if ((m.access & ACC_ABSTRACT) != 0 || (m.access & ACC_NATIVE) != 0) {
                            continue;
                        }

                        t.visitMethod(c, m);

                        AbstractInsnNode[] insns = m.instructions.toArray();
                        for (AbstractInsnNode insn : insns) {
                            if (insn == null || !m.instructions.contains(insn)) {
                                continue;
                            }
                            if (t.finished()) {
                                break;
                            }

                            t.visitInsn(c, m, insn);

                            if (insn instanceof IntInsnNode) {
                                t.visitIntInsn(c, m, (IntInsnNode) insn);
                            }
                            if (insn instanceof VarInsnNode) {
                                t.visitVarInsn(c, m, (VarInsnNode) insn);
                            }
                            if (insn instanceof TypeInsnNode) {
                                t.visitTypeInsn(c, m, (TypeInsnNode) insn);
                            }
                            if (insn instanceof FieldInsnNode) {
                                t.visitFieldInsn(c, m, (FieldInsnNode) insn);
                            }
                            if (insn instanceof MethodInsnNode) {
                                t.visitMethodInsn(c, m, (MethodInsnNode) insn);
                            }
                            if (insn instanceof JumpInsnNode) {
                                t.visitJumpInsn(c, m, (JumpInsnNode) insn);
                            }
                            if (insn instanceof LdcInsnNode) {
                                t.visitLdcInsn(c, m, (LdcInsnNode) insn);
                            }
                            if (insn instanceof IincInsnNode) {
                                t.visitIincInsn(c, m, (IincInsnNode) insn);
                            }
                            if (insn instanceof TableSwitchInsnNode) {
                                t.visitTableSwitchInsn(c, m, (TableSwitchInsnNode) insn);
                            }
                            if (insn instanceof LookupSwitchInsnNode) {
                                t.visitLookupSwitchInsn(c, m, (LookupSwitchInsnNode) insn);
                            }
                            if (insn instanceof MultiANewArrayInsnNode) {
                                t.visitMultiANewArrayInsn(c, m, (MultiANewArrayInsnNode) insn);
                            }
                        }

                        for (Object tcbo : m.tryCatchBlocks) {
                            if (t.finished()) {
                                break;
                            }
                            TryCatchBlockNode tcb = (TryCatchBlockNode) tcbo;

                            t.visitTryCatchBlock(c, m, tcb);
                        }
                    }
                }
                if (!t.finished() && t.forceFinish()) {
                    t.onFinish();
                }
            } catch (Exception e) {
                logger.fatal("Exception on transformer : " + t, e);
            }
        }
    }
}
