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
package com.ziotic.asm.tree;

import com.ziotic.asm.ClassVisitor;

/**
 * A node that represents an inner class.
 *
 * @author Eric Bruneton
 */
public class InnerClassNode {

    /**
     * The internal name of an inner class (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     */
    public String name;

    /**
     * The internal name of the class to which the inner class belongs (see
     * {@link com.ziotic.asm.Type#getInternalName() getInternalName}). May
     * be <tt>null</tt>.
     */
    public String outerName;

    /**
     * The (simple) name of the inner class inside its enclosing class. May be
     * <tt>null</tt> for anonymous inner classes.
     */
    public String innerName;

    /**
     * The access flags of the inner class as originally declared in the
     * enclosing class.
     */
    public int access;

    /**
     * Constructs a new {@link InnerClassNode}.
     *
     * @param name      the internal name of an inner class (see
     *                  {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     * @param outerName the internal name of the class to which the inner class
     *                  belongs (see
     *                  {@link com.ziotic.asm.Type#getInternalName() getInternalName}).
     *                  May be <tt>null</tt>.
     * @param innerName the (simple) name of the inner class inside its
     *                  enclosing class. May be <tt>null</tt> for anonymous inner
     *                  classes.
     * @param access    the access flags of the inner class as originally declared
     *                  in the enclosing class.
     */
    public InnerClassNode(final String name, final String outerName, final String innerName, final int access) {
        this.name = name;
        this.outerName = outerName;
        this.innerName = innerName;
        this.access = access;
    }

    /**
     * Makes the given class visitor visit this inner class.
     *
     * @param cv a class visitor.
     */
    public void accept(final ClassVisitor cv) {
        cv.visitInnerClass(name, outerName, innerName, access);
    }
}
