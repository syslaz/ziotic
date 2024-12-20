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

import com.ziotic.asm.tree.ClassNode;
import com.ziotic.asm.tree.FieldInsnNode;
import com.ziotic.asm.tree.FieldNode;

/**
 * @author Lazaro
 */
public class FieldID extends ID {
    public String owner;
    public String desc;

    public FieldID(String owner, String name, String desc) {
        super(name);
        this.owner = owner;
        this.desc = desc;
    }

    public FieldID(ClassNode c, FieldNode f) {
        this(c.name, f.name, f.desc);
    }

    public FieldID(FieldInsnNode n) {
        this(n.owner, n.name, n.desc);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FieldID)) {
            return false;
        }

        FieldID id = (FieldID) o;
        return name.equals(id.name) && owner.equals(id.owner) && desc.equals(id.desc);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + owner.hashCode();
        result = prime * result + desc.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return owner.replace("/", ".") + "." + name + " " + desc;
    }
}
