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
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import com.ziotic.jode.bytecode.ClassInfo;
import com.ziotic.jode.decompiler.Options;

public class PackagesTreeModel implements TreeModel {
    Map cachedChildrens = new HashMap();
    Main main;

    class TreeElement implements Comparable {
        String fullName;
        String name;
        boolean leaf;

        public TreeElement(String prefix, String name, boolean isLeaf) {
            this.fullName = prefix + name;
            this.name = name;
            this.leaf = isLeaf;
        }

        public String getFullName() {
            return fullName;
        }

        public String getName() {
            return name;
        }

        public boolean isLeaf() {
            return leaf;
        }

        public String toString() {
            return name;
        }

        public int compareTo(Object o) {
            TreeElement other = (TreeElement) o;
            if (leaf != other.leaf)
                // files come after directories
                return leaf ? 1 : -1;
            return fullName.compareTo(other.fullName);
        }

        public boolean equals(Object o) {
            return (o instanceof TreeElement) && fullName.equals(((TreeElement) o).fullName);
        }

        public int hashCode() {
            return fullName.hashCode();
        }
    }

    TreeElement root = new TreeElement("", "", false);
    Set listeners = new HashSet();

    public PackagesTreeModel(Main main) {
        this.main = main;
    }

    public void rebuild() {
        cachedChildrens.clear();
        TreeModelListener[] ls;
        synchronized (listeners) {
            ls = (TreeModelListener[]) listeners.toArray(new TreeModelListener[listeners.size()]);
        }
        TreeModelEvent ev = new TreeModelEvent(this, new Object[]{root});
        for (int i = 0; i < ls.length; i++)
            ls[i].treeStructureChanged(ev);

        main.reselect();
    }

    public TreeElement[] getChildrens(TreeElement parent) {
        TreeElement[] result = (TreeElement[]) cachedChildrens.get(parent);
        if (result == null) {
            TreeSet v = new TreeSet();
            String prefix = parent == root ? "" : parent.getFullName() + ".";
            Enumeration enum_ = ClassInfo.getClassesAndPackages(parent.getFullName());
            while (enum_.hasMoreElements()) {
                //insert sorted and remove double elements;
                String name = (String) enum_.nextElement();
                String fqn = prefix + name;
                boolean isClass = !ClassInfo.isPackage(fqn);

                if (isClass && Options.skipClass(ClassInfo.forName(fqn)))
                    continue;
                TreeElement newElem = new TreeElement(prefix, name, isClass);
                v.add(newElem);
            }
            result = (TreeElement[]) v.toArray(new TreeElement[v.size()]);
            cachedChildrens.put(parent, result);
        }
        return result;
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
        return getChildrens((TreeElement) parent)[index];
    }

    public int getChildCount(Object parent) {
        return getChildrens((TreeElement) parent).length;
    }

    public int getIndexOfChild(Object parent, Object child) {
        TreeElement[] childrens = getChildrens((TreeElement) parent);
        int i = Arrays.binarySearch(childrens, child);
        if (i >= 0)
            return i;
        throw new NoSuchElementException(((TreeElement) parent).getFullName() + "." + child);
    }

    public Object getRoot() {
        return root;
    }

    public boolean isLeaf(Object node) {
        return ((TreeElement) node).isLeaf();
    }

    public boolean isValidClass(Object node) {
        return ((TreeElement) node).isLeaf();
    }

    public TreePath getPath(String fullName) {
        if (fullName == null || fullName.length() == 0)
            return new TreePath(root);
        int pos = -1;
        int length = 2;
        while ((pos = fullName.indexOf('.', pos + 1)) != -1)
            length++;
        TreeElement[] path = new TreeElement[length];
        path[0] = root;
        int i = 0;
        pos = -1;
        next_component:
        while (pos < fullName.length()) {
            int start = pos + 1;
            pos = fullName.indexOf('.', start);
            if (pos == -1)
                pos = fullName.length();
            String component = fullName.substring(start, pos);
            TreeElement[] childs = getChildrens(path[i]);
            for (int j = 0; j < childs.length; j++) {
                if (childs[j].getName().equals(component)) {
                    path[++i] = childs[j];
                    continue next_component;
                }
            }
            return null;
        }
        return new TreePath(path);
    }

    public String getFullName(Object node) {
        return ((TreeElement) node).getFullName();
    }
}
