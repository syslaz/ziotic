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

import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.Type;

/**
 * This is a pseudo operator, which represents the check against null
 * that jikes and javac generates for inner classes:
 * <p/>
 * <pre>
 *   outer.new Inner()
 * </pre>
 * is translated by javac to
 * <pre>
 *   new Outer$Inner(outer ((void) DUP.getClass()));
 * </pre>
 * and by jikes to
 * <pre>
 *   new Outer$Inner(outer (DUP == null ? throw null));
 * </pre>
 */

public class CheckNullOperator extends Operator {
    LocalInfo local;

    public CheckNullOperator(Type type, LocalInfo li) {
        super(type, 0);
        local = li;
        initOperands(1);
    }

    public int getPriority() {
        return 200;
    }

    public void updateSubTypes() {
        local.setType(type);
        subExpressions[0].setType(Type.tSubType(type));
    }

    public void updateType() {
        Type newType = Type.tSuperType(subExpressions[0].getType()).intersection(type);
        local.setType(newType);
        updateParentType(newType);
    }

    public void removeLocal() {
        local.remove();
    }

    public void fillInGenSet(Collection in, Collection gen) {
        if (gen != null)
            gen.add(local);
        super.fillInGenSet(in, gen);
    }

    public void fillDeclarables(Collection used) {
        used.add(local);
        super.fillDeclarables(used);
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print("(" + local.getName() + " = ");
        subExpressions[0].dumpExpression(writer, 0);
        writer.print(").getClass() != null ? " + local.getName() + " : null");
    }

    public boolean opEquals(Operator o) {
        return o instanceof CheckNullOperator;
    }
}
