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
package com.ziotic.jode.flow;

import com.ziotic.jode.expr.*;
import com.ziotic.jode.type.Type;

public class CreateClassField {

    public static boolean transform(IfThenElseBlock ifBlock, StructuredBlock last) {
        // convert
        //   if (class$classname == null)
        //       class$classname = class$("java.lang.Object");
        // to
        //   if (classname.class == null) {
        //   }
        if (!(ifBlock.cond instanceof CompareUnaryOperator) || !(((Operator) ifBlock.cond).getOperatorIndex() == Operator.EQUALS_OP) || !(ifBlock.thenBlock instanceof InstructionBlock) || ifBlock.elseBlock != null)
            return false;

        if (ifBlock.thenBlock.jump != null && (ifBlock.jump == null || (ifBlock.jump.destination != ifBlock.thenBlock.jump.destination)))
            return false;

        CompareUnaryOperator cmp = (CompareUnaryOperator) ifBlock.cond;
        Expression instr = ((InstructionBlock) ifBlock.thenBlock).getInstruction();
        if (!(cmp.getSubExpressions()[0] instanceof GetFieldOperator) || !(instr instanceof StoreInstruction))
            return false;

        StoreInstruction store = (StoreInstruction) instr;
        if (!(store.getLValue() instanceof PutFieldOperator))
            return false;
        PutFieldOperator put = (PutFieldOperator) store.getLValue();
        if (put.getField() == null || !put.matches((GetFieldOperator) cmp.getSubExpressions()[0]) || !(store.getSubExpressions()[1] instanceof InvokeOperator))
            return false;

        InvokeOperator invoke = (InvokeOperator) store.getSubExpressions()[1];
        if (!invoke.isGetClass())
            return false;

        Expression param = invoke.getSubExpressions()[0];

        if (param instanceof ConstOperator && ((ConstOperator) param).getValue() instanceof String) {
            String clazz = (String) ((ConstOperator) param).getValue();
            if (put.getField().setClassConstant(clazz)) {
                cmp.setSubExpressions(0, new ClassFieldOperator(clazz.charAt(0) == '[' ? Type.tType(clazz) : Type.tClass(clazz)));
                EmptyBlock empty = new EmptyBlock();
                empty.moveJump(ifBlock.thenBlock.jump);
                ifBlock.setThenBlock(empty);
                return true;
            }
        }
        return false;
    }
}
