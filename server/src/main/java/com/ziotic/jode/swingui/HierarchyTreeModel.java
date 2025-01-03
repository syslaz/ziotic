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
package com.ziotic.jode.swingui;

import java.util.*;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import com.ziotic.jode.bytecode.ClassInfo;

public class HierarchyTreeModel implements TreeModel, Runnable {
    static final int MAX_PACKAGE_LEVEL = 10;
    TreeElement root = new TreeElement("");
    Set listeners = new HashSet();
    JProgressBar progressBar;
    Main main;

    class TreeElement implements Comparable {
        String fullName;
        TreeSet childs;
        boolean inClassPath = false;

        public TreeElement(String fqn) {
            this.fullName = fqn;
            childs = new TreeSet();
        }

        public String getFullName() {
            return fullName;
        }

        public void addChild(TreeElement child) {
            childs.add(child);
        }

        public Collection getChilds() {
            return childs;
        }

        public String toString() {
            return fullName;
        }

        public int compareTo(Object o) {
            TreeElement other = (TreeElement) o;
            return fullName.compareTo(other.fullName);
        }

        public boolean equals(Object o) {
            return (o instanceof TreeElement) && fullName.equals(((TreeElement) o).fullName);
        }

        public int hashCode() {
            return fullName.hashCode();
        }
    }

    private TreeElement handleClass(HashMap classes, ClassInfo clazz) {
        if (clazz == null)
            return root;
        TreeElement elem = (TreeElement) classes.get(clazz);
        if (elem != null)
            return elem;

        elem = new TreeElement(clazz.getName());
        classes.put(clazz, elem);

        if (!clazz.isInterface()) {
            ClassInfo superClazz = clazz.getSuperclass();
            handleClass(classes, superClazz).addChild(elem);
        }
        ClassInfo[] ifaces = clazz.getInterfaces();
        for (int i = 0; i < ifaces.length; i++)
            handleClass(classes, ifaces[i]).addChild(elem);
        if (ifaces.length == 0 && clazz.isInterface())
            root.addChild(elem);
        return elem;
    }

    public int readPackage(int depth, HashMap classes, String packageName, int count) {
        if (depth++ >= MAX_PACKAGE_LEVEL)
            return count;
        String prefix = packageName.length() == 0 ? "" : packageName + ".";
        Enumeration enum_ = ClassInfo.getClassesAndPackages(packageName);
        while (enum_.hasMoreElements()) {
            //insert sorted and remove double elements;
            String name = (String) enum_.nextElement();
            String fqn = prefix + name;
            if (ClassInfo.isPackage(fqn)) {
                count = readPackage(depth, classes, fqn, count);
            } else {
                TreeElement elem = handleClass(classes, ClassInfo.forName(fqn));
                if (progressBar != null)
                    progressBar.setValue(++count);

                elem.inClassPath = true;
            }
        }
        return count;
    }

    public int countClasses(int depth, String packageName) {
        if (depth++ >= MAX_PACKAGE_LEVEL)
            return 0;
        int number = 0;
        String prefix = packageName.length() == 0 ? "" : packageName + ".";
        Enumeration enum__ = ClassInfo.getClassesAndPackages(packageName);
        while (enum__.hasMoreElements()) {
            //insert sorted and remove double elements;
            String name = (String) enum__.nextElement();
            String fqn = prefix + name;
            if (ClassInfo.isPackage(fqn)) {
                number += countClasses(depth, fqn);
            } else {
                number++;
            }
        }
        return number;
    }

    public HierarchyTreeModel(Main main) {
        this.main = main;
        this.progressBar = null;
        rebuild();
    }

    public HierarchyTreeModel(Main main, JProgressBar progressBar) {
        this.main = main;
        this.progressBar = progressBar;
        rebuild();
    }

    public void rebuild() {
        Thread t = new Thread(this);
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }

    public void run() {
        if (progressBar != null) {
            progressBar.setMinimum(0);
            progressBar.setMaximum(countClasses(0, ""));
        }
        readPackage(0, new HashMap(), "", 0);

        TreeModelListener[] ls;
        synchronized (listeners) {
            ls = (TreeModelListener[]) listeners.toArray(new TreeModelListener[listeners.size()]);
        }
        TreeModelEvent ev = new TreeModelEvent(this, new Object[]{root});
        for (int i = 0; i < ls.length; i++)
            ls[i].treeStructureChanged(ev);

        main.reselect();
    }

    public void addTreeModelListener(TreeModelListener l) {
        listeners.add(l);
    }

    public void removeTreeModelListener(TreeModelListener l) {
        listeners.remove(l);
    }

    public void valueForPathChanged(TreePath path, Object newValue) {
        // we don't allow values
    }

    public Object getChild(Object parent, int index) {
        Iterator iter = ((TreeElement) parent).getChilds().iterator();
        for (int i = 0; i < index; i++)
            iter.next();
        return iter.next();
    }

    public int getChildCount(Object parent) {
        return ((TreeElement) parent).getChilds().size();
    }

    public int getIndexOfChild(Object parent, Object child) {
        Iterator iter = ((TreeElement) parent).getChilds().iterator();
        int i = 0;
        while (iter.next() != child)
            i++;
        return i;
    }

    public Object getRoot() {
        return root;
    }

    public boolean isLeaf(Object node) {
        return ((TreeElement) node).getChilds().isEmpty();
    }

    public boolean isValidClass(Object node) {
        return ((TreeElement) node).inClassPath;
    }

    public String getFullName(Object node) {
        return ((TreeElement) node).getFullName();
    }

    public TreePath getPath(String fullName) {
        if (fullName == null || fullName.length() == 0)
            return new TreePath(root);

        int length = 2;
        ClassInfo ci = ClassInfo.forName(fullName);
        while (ci.getSuperclass() != null) {
            length++;
            ci = ci.getSuperclass();
        }

        TreeElement[] path = new TreeElement[length];
        path[0] = root;
        int nr = 0;
        next_component:
        while (nr < length - 1) {
            ci = ClassInfo.forName(fullName);
            for (int i = 2; i < length - nr; i++)
                ci = ci.getSuperclass();
            Iterator iter = path[nr].getChilds().iterator();
            while (iter.hasNext()) {
                TreeElement te = (TreeElement) iter.next();
                if (te.getFullName().equals(ci.getName())) {
                    path[++nr] = te;
                    continue next_component;
                }
            }
            return null;
        }
        return new TreePath(path);
    }
}
