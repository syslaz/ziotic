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
import com.ziotic.jode.decompiler.MethodAnalyzer;

public class PutFieldOperator extends FieldOperator implements LValueExpression {

    public PutFieldOperator(MethodAnalyzer methodAnalyzer, boolean staticFlag, Reference ref) {
        super(methodAnalyzer, staticFlag, ref);
    }

    public boolean matches(Operator loadop) {
        return loadop instanceof GetFieldOperator && ((GetFieldOperator) loadop).ref.equals(ref);
    }

    public boolean opEquals(Operator o) {
        return o instanceof PutFieldOperator && ((PutFieldOperator) o).ref.equals(ref);
    }
}
