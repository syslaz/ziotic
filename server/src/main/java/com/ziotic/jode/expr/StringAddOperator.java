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

public class StringAddOperator extends Operator {
    protected Type operandType;

    public StringAddOperator() {
        super(Type.tString, ADD_OP);
        initOperands(2);
    }

    public int getPriority() {
        return 610;
    }

    public boolean opEquals(Operator o) {
        return (o instanceof StringAddOperator);
    }

    public void updateSubTypes() {
        /* A string add allows everything */
    }

    public void updateType() {
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {

        if (!subExpressions[0].getType().isOfType(Type.tString) && !subExpressions[1].getType().isOfType(Type.tString)) {
            writer.print("\"\"");
            writer.breakOp();
            writer.print(getOperatorString());
        }

        subExpressions[0].dumpExpression(writer, 610);
        writer.breakOp();
        writer.print(getOperatorString());
        subExpressions[1].dumpExpression(writer, 611);
    }
}
