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

public class CompareBinaryOperator extends Operator {
    boolean allowsNaN = false;
    Type compareType;

    public CompareBinaryOperator(Type type, int op) {
        super(Type.tBoolean, op);
        compareType = type;
        initOperands(2);
    }

    public CompareBinaryOperator(Type type, int op, boolean allowsNaN) {
        super(Type.tBoolean, op);
        compareType = type;
        this.allowsNaN = allowsNaN;
        initOperands(2);
    }

    public int getPriority() {
        switch (getOperatorIndex()) {
            case 26:
            case 27:
                return 500;
            case 28:
            case 29:
            case 30:
            case 31:
                return 550;
        }
        throw new RuntimeException("Illegal operator");
    }

    public Type getCompareType() {
        return compareType;
    }

    public void updateSubTypes() {
        subExpressions[0].setType(Type.tSubType(compareType));
        subExpressions[1].setType(Type.tSubType(compareType));
    }

    public void updateType() {
        Type leftType = Type.tSuperType(subExpressions[0].getType());
        Type rightType = Type.tSuperType(subExpressions[1].getType());
        compareType = compareType.intersection(leftType).intersection(rightType);
        subExpressions[0].setType(Type.tSubType(rightType));
        subExpressions[1].setType(Type.tSubType(leftType));
        /* propagate hints? XXX */
    }

    public Expression negate() {
        if (!allowsNaN || getOperatorIndex() <= NOTEQUALS_OP) {
            setOperatorIndex(getOperatorIndex() ^ 1);
            return this;
        }
        return super.negate();
    }

    public boolean opEquals(Operator o) {
        return (o instanceof CompareBinaryOperator) && o.operatorIndex == operatorIndex;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        subExpressions[0].dumpExpression(writer, getPriority() + 1);
        writer.breakOp();
        writer.print(getOperatorString());
        subExpressions[1].dumpExpression(writer, getPriority() + 1);
    }
}
