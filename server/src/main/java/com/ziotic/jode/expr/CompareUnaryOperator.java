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

public class CompareUnaryOperator extends Operator {
    boolean objectType;
    Type compareType;

    public CompareUnaryOperator(Type type, int op) {
        super(Type.tBoolean, op);
        compareType = type;
        objectType = (type.isOfType(Type.tUObject));
        initOperands(1);
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
    }

    public void updateType() {
    }

    public Expression simplify() {
        if (subExpressions[0] instanceof CompareToIntOperator) {

            CompareToIntOperator cmpOp = (CompareToIntOperator) subExpressions[0];

            boolean negated = false;
            int opIndex = getOperatorIndex();
            if (cmpOp.allowsNaN && getOperatorIndex() > NOTEQUALS_OP) {
                if (cmpOp.greaterOnNaN == (opIndex == GREATEREQ_OP || opIndex == GREATER_OP)) {
                    negated = true;
                    opIndex ^= 1;
                }
            }
            Expression newOp = new CompareBinaryOperator(cmpOp.compareType, opIndex, cmpOp.allowsNaN).addOperand(cmpOp.subExpressions[1]).addOperand(cmpOp.subExpressions[0]);

            if (negated)
                return newOp.negate().simplify();
            return newOp.simplify();
        }
        if (subExpressions[0].getType().isOfType(Type.tBoolean)) {
            /* xx == false */
            if (getOperatorIndex() == EQUALS_OP)
                return subExpressions[0].negate().simplify();
            /* xx != false */
            if (getOperatorIndex() == NOTEQUALS_OP)
                return subExpressions[0].simplify();
        }
        return super.simplify();
    }

    public Expression negate() {
        if ((getType() != Type.tFloat && getType() != Type.tDouble) || getOperatorIndex() <= NOTEQUALS_OP) {
            setOperatorIndex(getOperatorIndex() ^ 1);
            return this;
        }
        return super.negate();
    }

    public boolean opEquals(Operator o) {
        return (o instanceof CompareUnaryOperator) && o.getOperatorIndex() == getOperatorIndex();
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        subExpressions[0].dumpExpression(writer, getPriority() + 1);
        writer.breakOp();
        writer.print(getOperatorString());
        writer.print(objectType ? "null" : "0");
    }
}
