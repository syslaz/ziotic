package com.ziotic.updater.util;

import com.ziotic.asm.tree.ClassNode;

/**
 * @author Lazaro
 */
public class ID {
    public String name;

    public ID(String name) {
        this.name = name;
    }

    public ID(ClassNode c) {
        this(c.name);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ID)) {
            return false;
        }
        return name.equals(((ID) o).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
