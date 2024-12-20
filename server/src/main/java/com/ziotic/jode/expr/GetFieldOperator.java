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

import com.ziotic.jode.bytecode.Reference;
import com.ziotic.jode.decompiler.FieldAnalyzer;
import com.ziotic.jode.decompiler.MethodAnalyzer;

public class GetFieldOperator extends FieldOperator {
    public GetFieldOperator(MethodAnalyzer methodAnalyzer, boolean staticFlag, Reference ref) {
        super(methodAnalyzer, staticFlag, ref);
    }

    public Expression simplify() {
        if (!staticFlag) {
            subExpressions[0] = subExpressions[0].simplify();
            subExpressions[0].parent = this;
            if (subExpressions[0] instanceof ThisOperator) {
                FieldAnalyzer field = getField();
                /* This should check for isFinal(), but sadly,
             * sometimes jikes doesn't make a val$ field final.  I
             * don't know when, or why, so I currently ignore
             * isFinal.
             */
                if (field != null && field.isSynthetic()) {
                    Expression constant = field.getConstant();
                    if (constant instanceof ThisOperator || constant instanceof OuterLocalOperator)
                        return constant;
                }
            }
        }
        return this;
    }

    public boolean opEquals(Operator o) {
        return o instanceof GetFieldOperator && ((GetFieldOperator) o).ref.equals(ref);
    }
}
