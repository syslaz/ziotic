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
package com.ziotic.jode.obfuscator.modules;

import java.lang.reflect.Modifier;
import java.util.Collection;

import com.ziotic.jode.obfuscator.*;

public class SerializePreserver implements IdentifierMatcher, OptionHandler {
    boolean onlySUID = true;

    public SerializePreserver() {
    }

    public void setOption(String option, Collection values) {
        if (option.equals("all")) {
            onlySUID = false;
        } else
            throw new IllegalArgumentException("Invalid option `" + option + "'.");
    }

    public final boolean matchesSub(Identifier ident, String name) {
        if (ident instanceof PackageIdentifier)
            return true;
        if (ident instanceof ClassIdentifier) {
            ClassIdentifier clazz = (ClassIdentifier) ident;
            return (clazz.isSerializable() && (!onlySUID || clazz.hasSUID()));
        }
        return false;
    }

    public final boolean matches(Identifier ident) {
        ClassIdentifier clazz;
        if (ident instanceof ClassIdentifier)
            clazz = (ClassIdentifier) ident;
        else if (ident instanceof FieldIdentifier)
            clazz = (ClassIdentifier) ident.getParent();
        else
            return false;

        if (!clazz.isSerializable() || (onlySUID && !clazz.hasSUID()))
            return false;

        if (ident instanceof FieldIdentifier) {
            FieldIdentifier field = (FieldIdentifier) ident;
            if ((field.getModifiers() & (Modifier.TRANSIENT | Modifier.STATIC)) == 0)
                return true;
            if (ident.getName().equals("serialPersistentFields") || ident.getName().equals("serialVersionUID"))
                return true;
        } else if (ident instanceof MethodIdentifier) {
            if (ident.getName().equals("writeObject") && ident.getType().equals("(Ljava.io.ObjectOutputStream)V"))
                return true;
            if (ident.getName().equals("readObject") && ident.getType().equals("(Ljava.io.ObjectInputStream)V"))
                return true;
        } else if (ident instanceof ClassIdentifier) {
            if (!clazz.hasSUID())
                clazz.addSUID();
            return true;
        }
        return false;
    }

    public final String getNextComponent(Identifier ident) {
        return null;
    }
}
