package com.ziotic.updater.util;

import com.ziotic.asm.Type;
import com.ziotic.asm.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ziotic.asm.Opcodes.*;

/**
 * @author Lazaro
 */
public class Hooker {
    public static final String ACCESSOR_PACKAGE = "com/ziotic/updater/client/";

    public static class ClassHook {
        public String className;
        public String interfaceName;

        @Override
        public String toString() {
            return interfaceName;
        }
    }

    public static class FieldHook {
        public String className;
        public String fieldName;
        public String fieldSignature;
        public String injectClass;
        public String methodName;
        public String methodSignature;

        @Override
        public String toString() {
            return injectClass + "." + methodName + "()";
        }
    }

    private ClassCollection module;

    private Map<ID, ClassHook> classMap = new HashMap<ID, ClassHook>();
    private Map<ID, Map<FieldID, FieldHook>> classFieldMap = new HashMap<ID, Map<FieldID, FieldHook>>();

    public Hooker(ClassCollection module) {
        this.module = module;
    }

    public Map<ID, ClassHook> getClassMap() {
        return classMap;
    }

    public Map<ID, Map<FieldID, FieldHook>> getClassFieldMap() {
        return classFieldMap;
    }

    public void injectInterface(String interfaceName, ClassNode c) {
        ClassHook hook = new ClassHook();
        hook.className = c.name;
        hook.interfaceName = ACCESSOR_PACKAGE + interfaceName.replace(".", "/");

        c.interfaces.add(hook.interfaceName);

        classMap.put(new ID(c), hook);
        if (!classFieldMap.containsKey(new ID(c))) {
            classFieldMap.put(new ID(c), new HashMap<FieldID, FieldHook>());
        }

        // System.out.println(c.name + " -> " + interfaceName);
    }

    public void injectGetter(String methodName, ClassNode c, FieldNode f) {
        injectGetter(methodName, c, f, Type.getType(f.desc));
    }

    public void injectGetter(String methodName, ClassNode c, FieldNode f, Type returnType) {
        ClassNode injectedClass = c;

        boolean staticGetter = (f.access & ACC_STATIC) != 0;
        if (staticGetter) {
            injectedClass = module.getClass("client");
        }

        MethodNode m = new MethodNode(ACC_PUBLIC | (staticGetter ? ACC_STATIC : 0), methodName, "()" + returnType.getDescriptor(), null, null);

        if (!staticGetter) {
            m.instructions.add(new VarInsnNode(ALOAD, 0));
        }

        m.instructions.add(new FieldInsnNode(staticGetter ? GETSTATIC : GETFIELD, c.name, f.name, f.desc));

        Type fieldType = Type.getType(f.desc);
        if (!returnType.equals(fieldType) && returnType.getSort() != Type.OBJECT && returnType.getSort() != Type.ARRAY) {
            switch (fieldType.getSort()) {
                case Type.DOUBLE:
                    switch (returnType.getSort()) {
                        case Type.FLOAT:
                            m.instructions.add(new InsnNode(D2F));
                            break;
                        case Type.INT:
                            m.instructions.add(new InsnNode(D2I));
                            break;
                        case Type.LONG:
                            m.instructions.add(new InsnNode(D2L));
                            break;
                    }
                    break;
                case Type.FLOAT:
                    switch (returnType.getSort()) {
                        case Type.DOUBLE:
                            m.instructions.add(new InsnNode(F2D));
                            break;
                        case Type.INT:
                            m.instructions.add(new InsnNode(F2I));
                            break;
                        case Type.LONG:
                            m.instructions.add(new InsnNode(F2L));
                            break;
                    }
                    break;
                case Type.INT:
                    switch (returnType.getSort()) {
                        case Type.BYTE:
                            m.instructions.add(new InsnNode(I2B));
                            break;
                        case Type.CHAR:
                            m.instructions.add(new InsnNode(I2C));
                            break;
                        case Type.DOUBLE:
                            m.instructions.add(new InsnNode(I2D));
                            break;
                        case Type.FLOAT:
                            m.instructions.add(new InsnNode(I2F));
                            break;
                        case Type.LONG:
                            m.instructions.add(new InsnNode(I2L));
                            break;
                        case Type.SHORT:
                            m.instructions.add(new InsnNode(I2S));
                            break;
                    }
                    break;
                case Type.LONG:
                    switch (returnType.getSort()) {
                        case Type.DOUBLE:
                            m.instructions.add(new InsnNode(L2D));
                            break;
                        case Type.FLOAT:
                            m.instructions.add(new InsnNode(L2F));
                            break;
                        case Type.INT:
                            m.instructions.add(new InsnNode(L2I));
                            break;
                    }
                    break;
            }
        }

        m.instructions.add(new InsnNode(returnType.getOpcode(IRETURN)));

        injectedClass.methods.add(m);

        Map<FieldID, FieldHook> fieldMap = classFieldMap.get(new ID(injectedClass));
        if (fieldMap == null) {
            fieldMap = new HashMap<FieldID, FieldHook>();
            classFieldMap.put(new ID(injectedClass), fieldMap);
        }
        if (fieldMap.containsKey(new FieldID(c, f))) {
            throw new RuntimeException("Adding getter for field " + new FieldID(c, f) + " more than once!");
        }
        FieldHook hook = new FieldHook();
        hook.className = c.name;
        hook.fieldName = f.name;
        hook.fieldSignature = f.desc;
        hook.injectClass = injectedClass.name;
        hook.methodName = methodName;
        hook.methodSignature = returnType.getDescriptor();
        fieldMap.put(new FieldID(c, f), hook);

        // System.out.println(" - " + c.name + "." + f.name + " -> " + methodName + "()");
    }

    public ID[] forHook(String interfaceName) {
        List<ID> hooked = new ArrayList<ID>();
        for (Map.Entry<ID, ClassHook> hook : classMap.entrySet()) {
            if (hook.getValue().interfaceName.equals(interfaceName)) {
                hooked.add(hook.getKey());
            }
        }
        return hooked.toArray(new ID[0]);
    }
}
