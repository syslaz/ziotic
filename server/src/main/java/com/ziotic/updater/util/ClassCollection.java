package com.ziotic.updater.util;

import com.ziotic.asm.ClassReader;
import com.ziotic.asm.ClassWriter;
import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldNode;
import com.ziotic.asm.tree.MethodNode;
import com.ziotic.utility.ArrayUtilities;
import com.ziotic.utility.Attributes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

import static com.ziotic.asm.Opcodes.ACC_INTERFACE;

/**
 * @author Lazaro
 */
public class ClassCollection {
    private URL jarURL;

    private Map<String, ClassNode> classes = null;
    private Attributes attributes = new Attributes();
    private Refactorer refactorer = new Refactorer(this);
    private Hooker hooker = new Hooker(this);

    private Map<ID, ClassNode> cachedExternalClasses = new HashMap<ID, ClassNode>();

    public ClassCollection(URL jarURL) {
        this.jarURL = jarURL;
    }

    public void load() throws IOException {
        classes = new HashMap<String, ClassNode>();

        JarFile jar = ((JarURLConnection) jarURL.openConnection()).getJarFile();
        Enumeration<JarEntry> entries = jar.entries();
        if (!entries.hasMoreElements()) {
            return;
        }
        JarEntry entry;
        while (entries.hasMoreElements()) {
            entry = entries.nextElement();

            if (!entry.getName().endsWith(".class")) {
                continue;
            }

            ClassNode c = new ClassNode();
            ClassReader cr = new ClassReader(jar.getInputStream(jar.getEntry(entry.getName())));
            cr.accept(c, 0);

            classes.put(c.name, c);
        }
    }

    public void transform() {
        refactorer.run();
    }

    public void save(File dst) throws IOException {
        JarOutputStream jos = new JarOutputStream(new FileOutputStream(dst));
        for (ClassNode c : classes.values()) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            c.accept(cw);
            JarEntry je = new JarEntry(c.name + ".class");
            jos.putNextEntry(je);
            jos.write(cw.toByteArray());
            jos.closeEntry();
        }
        jos.close();
    }

    public Map<String, ClassNode> getClasses() {
        return classes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Refactorer getRefactorer() {
        return refactorer;
    }

    public Hooker getHooker() {
        return hooker;
    }

    public FieldNode field(FieldID id) {
        ClassNode c = classes.get(id.owner);
        if (c != null) {
            for (Object fo : c.fields) {
                FieldNode f = (FieldNode) fo;
                if (f.name.equals(id.name)) {
                    return f;
                }
            }
        }
        return null;
    }

    public ClassNode[] getInheritors(ClassNode c, MethodNode m) {
        c = getDeclorator(c, m);
        for (Object mo : c.methods) {
            MethodNode m2 = (MethodNode) mo;
            if (m2.name.equals(m.name) && m2.desc.equals(m.desc)) {
                m = m2;
                break;
            }
        }

        List<ClassNode> inheritors = new LinkedList<ClassNode>();
        classLoop:
        for (ClassNode c2 : getClasses().values()) {
            ClassNode[] inherited = (c.access & ACC_INTERFACE) == 0 ? getHierarchy(c2) : getInterfaces(c2);
            int index = ArrayUtilities.searchArray(inherited, c);
            if (index >= 0) {
                for (Object mo : c2.methods) {
                    MethodNode m2 = (MethodNode) mo;
                    if (m2.name.equals(m.name) && m2.desc.equals(m.desc) && !inheritors.contains(c2)) {
                        inheritors.add(c2);
                        continue classLoop;
                    }
                }
            }
        }
        return inheritors.toArray(new ClassNode[0]);
    }

    public ClassNode[] getInheritors(ClassNode c, FieldNode f) {
        c = getDeclorator(c, f);
        for (Object fo : c.fields) {
            FieldNode f2 = (FieldNode) fo;
            if (f2.name.equals(f.name) && f2.desc.equals(f.desc)) {
                f = f2;
                break;
            }
        }

        List<ClassNode> inheritors = new LinkedList<ClassNode>();
        classLoop:
        for (ClassNode c2 : getClasses().values()) {
            ClassNode[] inherited = getHierarchy(c2);
            int index = ArrayUtilities.searchArray(inherited, c);
            if (index >= 0) {
                for (Object fo : c2.fields) {
                    FieldNode f2 = (FieldNode) fo;
                    if (f2.name.equals(f.name) && f2.desc.equals(f.desc) && !inheritors.contains(c2)) {
                        inheritors.add(c2);
                        continue classLoop;
                    }
                }
            }
        }
        return inheritors.toArray(new ClassNode[0]);
    }

    public ClassNode getDeclorator(ClassNode c, MethodNode m) {
        ClassNode[] interfaces = getInterfaces(c);
        ClassNode[] hierarchy = getHierarchy(c);

        for (int i = 0; i < interfaces.length; i++) {
            ClassNode c2 = interfaces[i];
            for (Object mo : c2.methods) {
                MethodNode m2 = (MethodNode) mo;
                if (m2.name.equals(m.name) && m2.desc.equals(m.desc)) {
                    return c2;
                }
            }
        }
        for (int i = 0; i < hierarchy.length; i++) {
            ClassNode c2 = hierarchy[i];

            for (Object mo : c2.methods) {
                MethodNode m2 = (MethodNode) mo;
                if (m2.name.equals(m.name) && m2.desc.equals(m.desc)) {
                    return c2;
                }
            }
        }

        return c;
    }

    public ClassNode getDeclorator(ClassNode c, FieldNode f) {
        ClassNode[] hierarchy = getHierarchy(c);

        for (int i = 0; i < hierarchy.length; i++) {
            ClassNode c2 = hierarchy[i];

            for (Object fo : c2.fields) {
                FieldNode f2 = (FieldNode) fo;
                if (f2.name.equals(f.name) && f2.desc.equals(f.desc)) {
                    return c2;
                }
            }
        }

        return c;
    }

    public ClassNode[] getHierarchy(ClassNode c) {
        LinkedList<ClassNode> hierarchy = new LinkedList<ClassNode>();

        ClassNode c2 = c;
        while (c2 != null) {
            hierarchy.addFirst(c2);

            if (c2.superName == null) {
                break;
            }

            c2 = getClass(c2.superName);
        }

        return hierarchy.toArray(new ClassNode[0]);
    }

    public ClassNode[] getInterfaces(ClassNode c) {
        LinkedList<ClassNode> interfaces = new LinkedList<ClassNode>();

        ClassNode[] hierarchy;
        if ((c.access & ACC_INTERFACE) == 0) {
            hierarchy = getHierarchy(c);
        } else {
            hierarchy = new ClassNode[]{c};
        }

        for (ClassNode c2 : hierarchy) {
            for (Object c3o : c2.interfaces) {
                ClassNode c3 = getClass((String) c3o);
                interfaces.addFirst(c3);
                if (!c3.interfaces.isEmpty()) {
                    for (ClassNode c4 : getInterfaces(c3)) {
                        interfaces.addFirst(c4);
                    }
                }
            }
        }

        return interfaces.toArray(new ClassNode[0]);
    }

    public ClassNode getClass(String name) {
        if (name == null) {
            return null;
        }

        ClassNode c = getClasses().get(name);
        if (c == null) {
            c = cachedExternalClasses.get(new ID(name));

            if (c == null) {
                c = new ClassNode();
                ClassReader cr;
                try {
                    cr = new ClassReader(name);
                } catch (IOException e) {
                    return null;
                }
                cr.accept(c, 0);

                cachedExternalClasses.put(new ID(name), c);
            }
        }
        return c;
    }

    public int getLevel(ClassNode c) {
        return getHierarchy(c).length - 1;
    }

    public boolean isExternal(ClassNode c) {
        return cachedExternalClasses.containsKey(new ID(c));
    }
}
