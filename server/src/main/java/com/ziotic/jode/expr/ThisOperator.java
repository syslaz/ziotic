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
package com.ziotic.jode.expr;

import com.ziotic.jode.bytecode.ClassInfo;
import com.ziotic.jode.decompiler.Scope;
import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.Type;

public class ThisOperator extends NoArgOperator {
    boolean isInnerMost;
    ClassInfo classInfo;

    public ThisOperator(ClassInfo classInfo, boolean isInnerMost) {
        super(Type.tClass(classInfo));
        this.classInfo = classInfo;
        this.isInnerMost = isInnerMost;
    }

    public ThisOperator(ClassInfo classInfo) {
        this(classInfo, false);
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public int getPriority() {
        return 1000;
    }

    public String toString() {
        return classInfo + ".this";
    }

    public boolean opEquals(Operator o) {
        return (o instanceof ThisOperator && ((ThisOperator) o).classInfo.equals(classInfo));
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        if (!isInnerMost) {
            writer.print(writer.getClassString(classInfo, Scope.AMBIGUOUSNAME));
            writer.print(".");
        }
        writer.print("this");
    }
}
