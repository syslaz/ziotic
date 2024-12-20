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

public class StoreInstruction extends Operator implements CombineableOperator {

    boolean opAssign = false;

    public StoreInstruction(LValueExpression lvalue) {
        super(Type.tVoid, ASSIGN_OP);
        initOperands(2);
        setSubExpressions(0, (Operator) lvalue);
    }

    public LValueExpression getLValue() {
        return (LValueExpression) subExpressions[0];
    }

    public void makeOpAssign(int operatorIndex) {
        setOperatorIndex(operatorIndex);
        if (subExpressions[1] instanceof NopOperator)
            subExpressions[1].type = Type.tUnknown;
        opAssign = true;
    }

    public boolean isOpAssign() {
        return opAssign;
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

    public int getPriority() {
        return 100;
    }

    public void updateSubTypes() {
        if (!isVoid()) {
            subExpressions[0].setType(type);
            subExpressions[1].setType(Type.tSubType(type));
        }
    }

    public void updateType() {

        Type newType;

        if (!opAssign) {
            /* An opassign (+=, -=, etc.) doesn't merge rvalue type. */
            Type lvalueType = subExpressions[0].getType();
            Type rvalueType = subExpressions[1].getType();
            subExpressions[0].setType(Type.tSuperType(rvalueType));
            subExpressions[1].setType(Type.tSubType(lvalueType));
        }

        if (!isVoid())
            updateParentType(subExpressions[0].getType());
    }

    public Expression simplify() {
        if (subExpressions[1] instanceof ConstOperator) {
            ConstOperator one = (ConstOperator) subExpressions[1];

            if ((getOperatorIndex() == OPASSIGN_OP + ADD_OP || getOperatorIndex() == OPASSIGN_OP + SUB_OP) && one.isOne(subExpressions[0].getType())) {

                int op = (getOperatorIndex() == OPASSIGN_OP + ADD_OP) ? INC_OP : DEC_OP;

                return new PrePostFixOperator(getType(), op, getLValue(), isVoid()).simplify();
            }
        }
        return super.simplify();
    }

    public boolean opEquals(Operator o) {
        return o instanceof StoreInstruction && o.operatorIndex == operatorIndex && o.isVoid() == isVoid();
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        writer.startOp(writer.NO_PAREN, 2);
        subExpressions[0].dumpExpression(writer);
        writer.endOp();
        writer.breakOp();
        writer.print(getOperatorString());
        subExpressions[1].dumpExpression(writer, 100);
    }
}
