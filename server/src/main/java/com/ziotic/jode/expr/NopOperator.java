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

/**
 * A NopOperator takes one arguments and returns it again.  It is used
 * as placeholder when the real operator is not yet known (e.g. in
 * SwitchBlock, but also in every other Operator).
 * <p/>
 * A Nop operator doesn't have subExpressions; getSubExpressions() simply
 * returns zero.
 *
 * @author Jochen Hoenicke
 */
public class NopOperator extends Expression {
    public NopOperator(Type type) {
        super(type);
    }

    public int getFreeOperandCount() {
        return 1;
    }

    public int getPriority() {
        return 1000;
    }

    public void updateSubTypes() {
    }

    public void updateType() {
    }

    public Expression addOperand(Expression op) {
        op.setType(type);
        op.parent = parent;
        return op;
    }

    public boolean isConstant() {
        return false;
    }

    public boolean equals(Object o) {
        return (o instanceof NopOperator);
    }

    public Expression simplify() {
        return this;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print("POP");
    }
}
