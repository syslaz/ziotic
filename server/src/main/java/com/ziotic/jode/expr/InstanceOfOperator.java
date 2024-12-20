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

import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.Type;

public class InstanceOfOperator extends Operator {

    Type instanceType;

    public InstanceOfOperator(Type type) {
        super(Type.tBoolean, 0);
        this.instanceType = type;
        initOperands(1);
    }

    public int getPriority() {
        return 550;
    }

    public void updateSubTypes() {
        subExpressions[0].setType(Type.tUObject);
    }

    public void updateType() {
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        /* There are special cases where a cast isn't allowed.  We
       * must cast to the common super type before.  In these cases
       * instanceof always return false, but we want to decompile
       * even bad programs.  */
        Type superType = instanceType.getCastHelper(subExpressions[0].getType());
        if (superType != null) {
            writer.startOp(writer.IMPL_PAREN, 2);
            writer.print("(");
            writer.printType(superType);
            writer.print(") ");
            writer.breakOp();
            subExpressions[0].dumpExpression(writer, 700);
            writer.endOp();
        } else
            subExpressions[0].dumpExpression(writer, 550);
        writer.breakOp();
        writer.print(" instanceof ");
        writer.printType(instanceType);
    }
}
