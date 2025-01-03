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
package com.ziotic.jode.flow;

import java.util.AbstractSet;
import java.util.Iterator;

import com.ziotic.jode.decompiler.LocalInfo;

/**
 * This class represents a set of local info, all having different
 * slots.  It is used for representing the in sets of flow block. <p>
 * <p/>
 * Its add method will automatically merge any localinfo that have
 * the same slot and is in the method. <p>
 */
public final class SlotSet extends AbstractSet implements Cloneable {
    LocalInfo[] locals;
    int count;

    /**
     * Creates a new empty variable set
     */
    public SlotSet() {
        locals = null;
        count = 0;
    }

    /**
     * Creates a new pre initialized variable set
     */
    public SlotSet(LocalInfo[] locals) {
        count = locals.length;
        this.locals = locals;
    }

    public final void grow(int size) {
        if (locals != null) {
            size += count;
            if (size > locals.length) {
                int nextSize = locals.length * 2;
//              GlobalOptions.err.println("wanted: "+size+" next: "+nextSize);
                LocalInfo[] newLocals = new LocalInfo[nextSize > size ? nextSize : size];
                System.arraycopy(locals, 0, newLocals, 0, count);
                locals = newLocals;
            }
        } else if (size > 0)
            locals = new LocalInfo[size];
    }

    /**
     * Adds a local info to this variable set.
     */
    public boolean add(Object o) {
        LocalInfo li = (LocalInfo) o;
        LocalInfo contained = findSlot(li.getSlot());
        if (contained != null) {
            li.combineWith(contained);
            return false;
        } else {
            grow(1);
            locals[count++] = li;
            return true;
        }
    }

    public final boolean contains(Object o) {
        return containsSlot(((LocalInfo) o).getSlot());
    }

    /**
     * Checks if the variable set contains a local with the given name.
     */
    public final boolean containsSlot(int slot) {
        return findSlot(slot) != null;
    }

    /**
     * Checks if the variable set contains a local with the given slot.
     */
    public LocalInfo findSlot(int slot) {
        for (int i = 0; i < count; i++)
            if (locals[i].getSlot() == slot)
                return locals[i];
        return null;
    }

    /**
     * Removes a slot from this variable set.
     */
    public boolean remove(Object li) {
        int slot = ((LocalInfo) li).getSlot();
        for (int i = 0; i < count; i++) {
            if (locals[i].getSlot() == slot) {
                locals[i] = locals[--count];
                locals[count] = null;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return count;
    }

    public Iterator iterator() {
        return new Iterator() {
            int pos = 0;

            public boolean hasNext() {
                return pos < count;
            }

            public Object next() {
                return locals[pos++];
            }

            public void remove() {
                if (pos < count)
                    System.arraycopy(locals, pos, locals, pos - 1, count - pos);
                count--;
                pos--;
            }
        };
    }

    /**
     * Removes everything from this variable set.
     */
    public void clear() {
        locals = null;
        count = 0;
    }

    public Object clone() {
        try {
            SlotSet other = (SlotSet) super.clone();
            if (count > 0) {
                other.locals = new LocalInfo[count];
                System.arraycopy(locals, 0, other.locals, 0, count);
            }
            return other;
        } catch (CloneNotSupportedException ex) {
            throw new com.ziotic.jode.AssertError("Clone?");
        }
    }

    /**
     * Merges this SlotSet with another.  For all slots occuring
     * in both variable sets, all corresponding LocalInfos are merged.
     * The sets are not changed (use addAll for this).
     *
     * @param vs the other variable set.
     * @return The merged variables.
     */
    public void merge(VariableSet vs) {
        for (int i = 0; i < count; i++) {
            LocalInfo li = locals[i];
            int slot = li.getSlot();
            for (int j = 0; j < vs.count; j++) {
                if (li.getSlot() == vs.locals[j].getSlot())
                    li.combineWith(vs.locals[j]);
            }
        }
    }

    /**
     * Add the slots in kill to the current set, unless there are
     * already in this set.  This differs from addAll, in the fact that it
     * doesn't combine the locals.
     *
     * @param kill The other kill set.
     */
    public void mergeKill(SlotSet kill) {
        grow(kill.size());
        big_loop:
        for (Iterator i = kill.iterator(); i.hasNext(); ) {
            LocalInfo li2 = (LocalInfo) i.next();
            if (!containsSlot(li2.getSlot()))
                add(li2.getLocalInfo());
        }
    }
}
