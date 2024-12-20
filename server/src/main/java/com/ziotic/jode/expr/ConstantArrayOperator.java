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

public class ConstantArrayOperator extends Operator {
    boolean isInitializer;
    ConstOperator empty;
    Type argType;

    public ConstantArrayOperator(Type type, int size) {
        super(type);
        argType = (type instanceof ArrayType) ? Type.tSubType(((ArrayType) type).getElementType()) : Type.tError;

        Object emptyVal;
        if (argType == type.tError || argType.isOfType(Type.tUObject))
            emptyVal = null;
        else if (argType.isOfType(Type.tBoolUInt))
            emptyVal = new Integer(0);
        else if (argType.isOfType(Type.tLong))
            emptyVal = new Long(0);
        else if (argType.isOfType(Type.tFloat))
            emptyVal = new Float(0);
        else if (argType.isOfType(Type.tDouble))
            emptyVal = new Double(0);
        else
            throw new IllegalArgumentException("Illegal Type: " + argType);

        empty = new ConstOperator(emptyVal);
        empty.setType(argType);
        empty.makeInitializer(argType);
        initOperands(size);
        for (int i = 0; i < subExpressions.length; i++)
            setSubExpressions(i, empty);
    }

    public void updateSubTypes() {
        argType = (type instanceof ArrayType) ? Type.tSubType(((ArrayType) type).getElementType()) : Type.tError;
        for (int i = 0; i < subExpressions.length; i++)
            if (subExpressions[i] != null)
                subExpressions[i].setType(argType);
    }

    public void updateType() {
    }

    public boolean setValue(int index, Expression value) {
        if (index < 0 || index > subExpressions.length || subExpressions[index] != empty)
            return false;
        value.setType(argType);
        setType(Type.tSuperType(Type.tArray(value.getType())));
        subExpressions[index] = value;
        value.parent = this;
        value.makeInitializer(argType);
        return true;
    }

    public int getPriority() {
        return 200;
    }

    public void makeInitializer(Type type) {
        if (type.getHint().isOfType(getType()))
            isInitializer = true;
    }

    public Expression simplify() {
        for (int i = 0; i < subExpressions.length; i++) {
            if (subExpressions[i] != null)
                subExpressions[i] = subExpressions[i].simplify();
        }
        return this;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        if (!isInitializer) {
            writer.print("new ");
            writer.printType(type.getHint());
            writer.breakOp();
            writer.print(" ");
        }
        writer.print("{ ");
        writer.startOp(writer.EXPL_PAREN, 0);
        for (int i = 0; i < subExpressions.length; i++) {
            if (i > 0) {
                writer.print(", ");
                writer.breakOp();
            }
            if (subExpressions[i] != null)
                subExpressions[i].dumpExpression(writer, 0);
            else
                empty.dumpExpression(writer, 0);
        }
        writer.endOp();
        writer.print(" }");
    }
}
