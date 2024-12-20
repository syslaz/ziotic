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
package com.ziotic.jode.decompiler;

import com.ziotic.jode.bytecode.ClassInfo;

/**
 * This is the interface for objects, that a method can declare
 */
public interface ClassDeclarer {
    /**
     * Get the parent of this ClassDeclarer.
     *
     * @return null if this is the outermost instance.
     */
    public ClassDeclarer getParent();

    /**
     * Get the class analyzer for the given anonymous class info.  It
     * will search it in the classes we declare and in the parent
     * class declarer.
     *
     * @return null if the class analyzer doesn't yet exists.
     */
    public ClassAnalyzer getClassAnalyzer(ClassInfo ci);

    public void addClassAnalyzer(ClassAnalyzer classAna);
}
