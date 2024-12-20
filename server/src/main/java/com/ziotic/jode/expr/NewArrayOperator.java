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

public class NewArrayOperator extends Operator {
    String baseTypeString;

    public NewArrayOperator(Type arrayType, int dimensions) {
        super(arrayType, 0);
        initOperands(dimensions);
    }

    public int getDimensions() {
        return subExpressions.length;
    }

    public int getPriority() {
        return 900;
    }

    public void updateSubTypes() {
        for (int i = 0; i < subExpressions.length; i++)
            subExpressions[i].setType(Type.tUInt);
    }

    public void updateType() {
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        Type flat = type.getCanonic();
        int depth = 0;
        while (flat instanceof ArrayType) {
            flat = ((ArrayType) flat).getElementType();
            depth++;
        }
        writer.print("new ");
        writer.printType(flat.getHint());
        for (int i = 0; i < depth; i++) {
            writer.breakOp();
            writer.print("[");
            if (i < subExpressions.length)
                subExpressions[i].dumpExpression(writer, 0);
            writer.print("]");
        }
    }
}
