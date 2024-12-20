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

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.decompiler.TabbedPrintWriter;

public class OuterLocalOperator extends Operator {
    LocalInfo local;

    public OuterLocalOperator(LocalInfo local) {
        super(local.getType());
        this.local = local;
        initOperands(0);
    }

    public boolean isConstant() {
        return true;
    }

    public int getPriority() {
        return 1000;
    }

    public LocalInfo getLocalInfo() {
        return local.getLocalInfo();
    }

    public void updateSubTypes() {
        if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_TYPES) != 0)
            GlobalOptions.err.println("setType of " + local.getName() + ": " + local.getType());
        local.setType(type);
    }

    public void updateType() {
    }

    public boolean opEquals(Operator o) {
        return (o instanceof OuterLocalOperator && ((OuterLocalOperator) o).local.getSlot() == local.getSlot());
    }

    public Expression simplify() {
        return super.simplify();
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print(local.getName());
    }
}
