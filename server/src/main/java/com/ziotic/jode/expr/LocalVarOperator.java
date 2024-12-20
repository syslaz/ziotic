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

import java.util.Collection;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.Type;

public abstract class LocalVarOperator extends Operator {
    LocalInfo local;

    public LocalVarOperator(Type lvalueType, LocalInfo local) {
        super(lvalueType);
        this.local = local;
        local.setOperator(this);
        initOperands(0);
    }

    public abstract boolean isRead();

    public abstract boolean isWrite();

    public void updateSubTypes() {
        if (parent != null && (GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_TYPES) != 0)
            GlobalOptions.err.println("local type changed in: " + parent);
        local.setType(type);
    }

    public void updateType() {
        updateParentType(local.getType());
    }

    public void fillDeclarables(Collection used) {
        used.add(local);
        super.fillDeclarables(used);
    }

    public LocalInfo getLocalInfo() {
        return local.getLocalInfo();
    }

    public void setLocalInfo(LocalInfo newLocal) {
        local = newLocal;
        updateType();
    }

    public int getPriority() {
        return 1000;
    }

    public void dumpExpression(TabbedPrintWriter writer) {
        writer.print(local.getName());
    }
}
