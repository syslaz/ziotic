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
package com.ziotic.updater.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ziotic.asm.commons.Remapper;
import com.ziotic.asm.commons.RemappingClassAdapter;
import com.ziotic.asm.tree.ClassNode;

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
