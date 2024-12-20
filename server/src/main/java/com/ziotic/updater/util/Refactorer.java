package com.ziotic.updater.util;

import com.ziotic.asm.commons.Remapper;
import com.ziotic.asm.commons.RemappingClassAdapter;
import com.ziotic.asm.tree.ClassNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lazaro
 */
public class Refactorer {
    private ClassCollection module;

    private Map<ID, String> classMap = new HashMap<ID, String>();
    private Map<FieldID, String> fieldMap = new HashMap<FieldID, String>();
    private Map<MethodID, String> methodMap = new HashMap<MethodID, String>();

    private Remapper remapper = new Remapper() {
        @Override
        public String mapFieldName(String owner, String name, String desc) {
            String newName = fieldMap.get(new FieldID(owner, name, desc));
            if (newName == null) {
                newName = name;
            }
            return newName;
        }

        @Override
        public String mapMethodName(String owner, String name, String desc) {
            String newName = methodMap.get(new MethodID(owner, name, desc));
            if (newName == null) {
                newName = name;
            }
            return newName;
        }

        @Override
        public String map(String name) {
            String newName = classMap.get(new ID(name));
            if (newName == null) {
                newName = name;
            }
            return newName;
        }
    };

    public Refactorer(ClassCollection module) {
        this.module = module;
    }

    public void run() {
        List<ClassNode> newClasses = new ArrayList<ClassNode>(module.getClasses().size());
        for (ClassNode c : module.getClasses().values()) {
            ClassNode c2 = new ClassNode();
            c.accept(new RemappingClassAdapter(c2, remapper));
            newClasses.add(c2);
        }
        module.getClasses().clear();
        for (ClassNode c : newClasses) {
            module.getClasses().put(c.name, c);
        }
    }

    public void refactorClass(ID id, String newName) {
        classMap.put(id, newName);
    }

    public void refactorField(FieldID id, String newName) {
        fieldMap.put(id, newName);
    }

    public void refactorMethod(MethodID id, String newName) {
        methodMap.put(id, newName);
    }

    public String getClass(ID id) {
        return classMap.get(id);
    }

    public String getField(FieldID id) {
        return fieldMap.get(id);
    }

    public String getMethod(MethodID id) {
        return methodMap.get(id);
    }
}
