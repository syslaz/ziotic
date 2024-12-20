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
import com.ziotic.jode.type.ArrayType;
import com.ziotic.jode.type.Type;

public class ArrayStoreOperator extends ArrayLoadOperator implements LValueExpression {

    public ArrayStoreOperator(Type type) {
        super(type);
    }

    public boolean matches(Operator loadop) {
        return loadop instanceof ArrayLoadOperator;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        Type arrType = subExpressions[0].getType().getHint();
        if (arrType instanceof ArrayType) {
            Type elemType = ((ArrayType) arrType).getElementType();
            if (!elemType.isOfType(getType())) {
                /* We need an explicit widening cast */
                writer.print("(");
                writer.startOp(writer.EXPL_PAREN, 1);
                writer.print("(");
                writer.printType(Type.tArray(getType().getHint()));
                writer.print(") ");
                writer.breakOp();
                subExpressions[0].dumpExpression(writer, 700);
                writer.print(")");
                writer.breakOp();
                writer.print("[");
                subExpressions[1].dumpExpression(writer, 0);
                writer.print("]");
                return;
            }
        }
        super.dumpExpression(writer);
    }
}
