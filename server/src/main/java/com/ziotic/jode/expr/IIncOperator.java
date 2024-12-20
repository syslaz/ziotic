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

public class IIncOperator extends Operator implements CombineableOperator {
    int value;

    public IIncOperator(LocalStoreOperator localStore, int value, int operator) {
        super(Type.tVoid, operator);
        this.value = value;
        initOperands(1);
        setSubExpressions(0, localStore);
    }

    public LValueExpression getLValue() {
        return (LValueExpression) subExpressions[0];
    }

    public int getValue() {
        return value;
    }

    public int getPriority() {
        return 100;
    }

    public void updateSubTypes() {
        subExpressions[0].setType(type != Type.tVoid ? type : Type.tInt);
    }

    public void updateType() {
        if (type != Type.tVoid)
            updateParentType(subExpressions[0].getType());
    }

    /**
     * Makes a non void expression out of this store instruction.
     */
    public void makeNonVoid() {
        if (type != Type.tVoid)
            throw new com.ziotic.jode.AssertError("already non void");
        type = subExpressions[0].getType();
    }

    public boolean lvalueMatches(Operator loadop) {
        return getLValue().matches(loadop);
    }

    public Expression simplify() {
        if (value == 1) {
            int op = (getOperatorIndex() == OPASSIGN_OP + ADD_OP) ? INC_OP : DEC_OP;
            return new PrePostFixOperator(getType(), op, getLValue(), isVoid()).simplify();
        }
        return super.simplify();
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        writer.startOp(writer.NO_PAREN, 2);
        subExpressions[0].dumpExpression(writer);
        writer.endOp();
        writer.print(getOperatorString() + value);
    }
}
