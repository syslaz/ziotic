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

public class BinaryOperator extends Operator {

    public BinaryOperator(Type type, int op) {
        super(type, op);
        initOperands(2);
    }

    public int getPriority() {
        switch (operatorIndex) {
            case 1:
            case 2:
                return 610;
            case 3:
            case 4:
            case 5:
                return 650;
            case 6:
            case 7:
            case 8:
                return 600;
            case 9:
                return 450;
            case 10:
                return 410;
            case 11:
                return 420;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return 100;
            case LOG_OR_OP:
                return 310;
            case LOG_AND_OP:
                return 350;
        }
        throw new RuntimeException("Illegal operator");
    }

    public void updateSubTypes() {
        subExpressions[0].setType(Type.tSubType(type));
        subExpressions[1].setType(Type.tSubType(type));
    }

    public void updateType() {
        Type leftType = Type.tSuperType(subExpressions[0].getType());
        Type rightType = Type.tSuperType(subExpressions[1].getType());
        subExpressions[0].setType(Type.tSubType(rightType));
        subExpressions[1].setType(Type.tSubType(leftType));
        updateParentType(leftType.intersection(rightType));
    }

    public Expression negate() {
        if (getOperatorIndex() == LOG_AND_OP || getOperatorIndex() == LOG_OR_OP) {
            setOperatorIndex(getOperatorIndex() ^ 1);
            for (int i = 0; i < 2; i++) {
                subExpressions[i] = subExpressions[i].negate();
                subExpressions[i].parent = this;
            }
            return this;
        }
        return super.negate();
    }

    public boolean opEquals(Operator o) {
        return (o instanceof BinaryOperator) && o.operatorIndex == operatorIndex;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        subExpressions[0].dumpExpression(writer, getPriority());
        writer.breakOp();
        writer.print(getOperatorString());
        subExpressions[1].dumpExpression(writer, getPriority() + 1);
    }
}
