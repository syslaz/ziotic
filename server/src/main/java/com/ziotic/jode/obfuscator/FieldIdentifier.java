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
package com.ziotic.jode.obfuscator;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.ziotic.jode.bytecode.FieldInfo;

public class FieldIdentifier extends Identifier {
    FieldInfo info;
    ClassIdentifier clazz;
    String name;
    String type;
    /**
     * This field tells if the value is not constant.  It is initially
     * set to false, and if a write to that field is found, it is set
     * to true.
     */
    private boolean notConstant;
    private Object constant;

    /**
     * The FieldChangeListener that should be notified if a
     * write to this field is found.
     */
    private Collection fieldListeners;

    public FieldIdentifier(ClassIdentifier clazz, FieldInfo info) {
        super(info.getName());
        this.name = info.getName();
        this.type = info.getType();
        this.info = info;
        this.clazz = clazz;
        this.constant = info.getConstant();
    }

    public void setSingleReachable() {
        super.setSingleReachable();
        Main.getClassBundle().analyzeIdentifier(this);
    }

    public void setSinglePreserved() {
        super.setSinglePreserved();
        setNotConstant();
    }

    public void analyze() {
        String type = getType();
        int index = type.indexOf('L');
        if (index != -1) {
            int end = type.indexOf(';', index);
            Main.getClassBundle().reachableClass(type.substring(index + 1, end).replace('/', '.'));
        }
    }

    public Identifier getParent() {
        return clazz;
    }

    public String getFullName() {
        return clazz.getFullName() + "." + getName() + "." + getType();
    }

    public String getFullAlias() {
        return clazz.getFullAlias() + "." + getAlias() + "." + Main.getClassBundle().getTypeAlias(getType());
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getModifiers() {
        return info.getModifiers();
    }

    public Iterator getChilds() {
        return Collections.EMPTY_LIST.iterator();
    }

    public boolean isNotConstant() {
        return notConstant;
    }

    public Object getConstant() {
        return constant;
    }

    public void addFieldListener(Identifier ident) {
        if (ident == null)
            throw new NullPointerException();
        if (fieldListeners == null)
            fieldListeners = new HashSet();
        if (!fieldListeners.contains(ident))
            fieldListeners.add(ident);
    }

    public void setNotConstant() {
        if (notConstant)
            return;

        notConstant = true;
        if (fieldListeners == null)
            return;

        for (Iterator i = fieldListeners.iterator(); i.hasNext(); )
            Main.getClassBundle().analyzeIdentifier((Identifier) i.next());
        fieldListeners = null;
    }

    public String toString() {
        return "FieldIdentifier " + getFullName();
    }

    public boolean conflicting(String newAlias) {
        return clazz.fieldConflicts(this, newAlias);
    }

    public void doTransformations() {
        info.setName(getAlias());
        info.setType(Main.getClassBundle().getTypeAlias(type));
    }
}
