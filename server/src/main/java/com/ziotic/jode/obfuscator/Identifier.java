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

import java.util.Iterator;
import java.util.Map;

import com.ziotic.jode.GlobalOptions;

public abstract class Identifier {
    /**
     * This is a doubly list of identifiers, that must have always
     * have the same names, and same preserved settings.
     */
    private Identifier right = null;
    private Identifier left = null;

    private boolean reachable = false;
    private boolean preserved = false;

    private String alias = null;
    private boolean wasAliased = false;

    public Identifier(String alias) {
        this.alias = alias;
    }

    /**
     * Returns true, if this identifier is reachable in some way, false if it
     * is dead and can be removed.
     */
    public final boolean isReachable() {
        return reachable;
    }

    /**
     * true, if this identifier must preserve its name, false if the
     * name may be obfuscated.
     */
    public final boolean isPreserved() {
        return preserved;
    }

    /**
     * Marks this identifier as preserved. This will also make the
     * identifier reachable, if it isn't already.
     * <p/>
     * You shouldn't call this directly, but use setPreserved instead.
     */
    protected void setSinglePreserved() {
    }

    /**
     * Marks this identifier as reachable.
     * <p/>
     * You should override this method for method identifier, which may
     * mark other methods as reachable.
     * <p/>
     * You shouldn't call this directly, but use setReachable instead.
     */
    protected void setSingleReachable() {
        if (getParent() != null)
            getParent().setReachable();
    }

    /**
     * Mark all shadows as reachable.
     */
    public void setReachable() {
        if (!reachable) {
            reachable = true;
            setSingleReachable();
        }
    }

    /**
     * Mark all shadows as preserved.
     */
    public void setPreserved() {
        if (!preserved) {
            preserved = true;
            Identifier ptr = this;
            while (ptr != null) {
                ptr.setSinglePreserved();
                ptr = ptr.left;
            }
            ptr = right;
            while (ptr != null) {
                ptr.setSinglePreserved();
                ptr = ptr.right;
            }
        }
    }

    public Identifier getRepresentative() {
        Identifier ptr = this;
        while (ptr.left != null)
            ptr = ptr.left;
        return ptr;
    }

    public final boolean isRepresentative() {
        return left == null;
    }

    public final boolean wasAliased() {
        return getRepresentative().wasAliased;
    }

    public final void setAlias(String name) {
        if (name != null) {
            Identifier rep = getRepresentative();
            rep.wasAliased = true;
            rep.alias = name;
        }
    }

    public final String getAlias() {
        return getRepresentative().alias;
    }

    /**
     * Mark that this identifier and the given identifier must always have
     * the same name.
     */
    public void addShadow(Identifier orig) {
        if (isPreserved() && !orig.isPreserved())
            orig.setPreserved();
        else if (!isPreserved() && orig.isPreserved())
            setPreserved();

        Identifier ptr = this;
        while (ptr.right != null)
            ptr = ptr.right;

        /* Check if orig is already on the ptr chain */
        Identifier check = orig;
        while (check.right != null)
            check = check.right;
        if (check == ptr)
            return;

        while (orig.left != null)
            orig = orig.left;
        ptr.right = orig;
        orig.left = ptr;
    }

    static int serialnr = 0;

    public void buildTable(Renamer renameRule) {
        if (!isReachable() && (Main.stripping & Main.STRIP_UNREACH) != 0)
            return;

        if (isPreserved()) {
            if (GlobalOptions.verboseLevel > 4)
                GlobalOptions.err.println(toString() + " is preserved");
        } else {
            Identifier rep = getRepresentative();
            if (!rep.wasAliased) {
                rep.wasAliased = true;

                // set alias to empty string, so it won't conflict!
                rep.alias = "";
                Iterator aliases = renameRule.generateNames(this);
                next_alias:
                for (; ; ) {
                    String newAlias = (String) aliases.next();
                    Identifier ptr = rep;
                    while (ptr != null) {
                        if (ptr.conflicting(newAlias))
                            continue next_alias;
                        ptr = ptr.right;
                    }
                    setAlias(newAlias.toString());
                    break;
                }
            }
        }
        for (Iterator i = getChilds(); i.hasNext(); )
            ((Identifier) i.next()).buildTable(renameRule);
    }

    public void writeTable(Map table, boolean reversed) {
        if (!isReachable() && (Main.stripping & Main.STRIP_UNREACH) != 0)
            return;

        if (getAlias().length() != 0) {
            String name = getName();
            Identifier outer = getParent();
            while (outer != null && outer.getAlias().length() == 0) {
                if (outer.getName().length() > 0)
                    name = outer.getName() + "." + name;
                outer = outer.getParent();
            }
            if (reversed)
                table.put(getFullAlias(), name);
            else
                table.put(getFullName(), getAlias());
        }

        for (Iterator i = getChilds(); i.hasNext(); )
            ((Identifier) i.next()).writeTable(table, reversed);
    }

    public void readTable(Map table) {
        Identifier rep = getRepresentative();
        if (!rep.wasAliased) {
            String newAlias = (String) table.get(getFullName());
            if (newAlias != null) {
                rep.wasAliased = true;
                rep.setAlias(newAlias);
            }
        }
        for (Iterator i = getChilds(); i.hasNext(); )
            ((Identifier) i.next()).readTable(table);
    }

    public void applyPreserveRule(IdentifierMatcher preserveRule) {
        if (preserveRule.matches(this)) {
            System.err.println("preserving: " + this);
            setReachable();
            Identifier ident = this;
            while (ident != null) {
                ident.setPreserved();
                ident = ident.getParent();
            }
        }
        for (Iterator i = getChilds(); i.hasNext(); )
            ((Identifier) i.next()).applyPreserveRule(preserveRule);
    }

    public abstract Iterator getChilds();

    public abstract Identifier getParent();

    public abstract String getName();

    public abstract String getType();

    public abstract String getFullName();

    public abstract String getFullAlias();

    public abstract boolean conflicting(String newAlias);

    /**
     * This is called by ClassBundle when it a class is added with
     * ClassBundle.analyzeIdentifier().
     */
    public void analyze() {
    }
}
