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

public class PopOperator extends Operator {

    Type popType;

    public PopOperator(Type argtype) {
        super(Type.tVoid, 0);
        popType = argtype;
        initOperands(1);
    }

    public int getPriority() {
        return 0;
    }

    public void updateSubTypes() {
        subExpressions[0].setType(Type.tSubType(popType));
    }

    public void updateType() {
    }

    public int getBreakPenalty() {
        if (subExpressions[0] instanceof Operator)
            return ((Operator) subExpressions[0]).getBreakPenalty();
        return 0;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        /* Don't give a priority; we can't allow parens around
       * a statement.
       */
        subExpressions[0].dumpExpression(writer);
    }
}
