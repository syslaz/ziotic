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

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.expr.*;

public class CreateConstantArray {

    public static boolean transform(InstructionContainer ic, StructuredBlock last) {
        /* Situation:
         *  PUSH new Array[]      // or a constant array operator.
         *  DUP                   // duplicate array reference
         *  POP[index] = value
         *  ...
         */
        if (last.outer instanceof SequentialBlock) {

            SequentialBlock sequBlock = (SequentialBlock) last.outer;

            if (!(ic.getInstruction() instanceof StoreInstruction) || ic.getInstruction().getFreeOperandCount() != 1 || !(sequBlock.subBlocks[0] instanceof SpecialBlock) || !(sequBlock.outer instanceof SequentialBlock))
                return false;

            StoreInstruction store = (StoreInstruction) ic.getInstruction();

            if (!(store.getLValue() instanceof ArrayStoreOperator))
                return false;

            ArrayStoreOperator lvalue = (ArrayStoreOperator) store.getLValue();

            if (!(lvalue.getSubExpressions()[0] instanceof NopOperator) || !(lvalue.getSubExpressions()[1] instanceof ConstOperator))
                return false;

            Expression expr = store.getSubExpressions()[1];
            ConstOperator indexOp = (ConstOperator) lvalue.getSubExpressions()[1];
            SpecialBlock dup = (SpecialBlock) sequBlock.subBlocks[0];
            sequBlock = (SequentialBlock) sequBlock.outer;

            if (dup.type != SpecialBlock.DUP || dup.depth != 0 || dup.count != 1 || !(indexOp.getValue() instanceof Integer) || !(sequBlock.subBlocks[0] instanceof InstructionBlock))
                return false;

            int index = ((Integer) indexOp.getValue()).intValue();
            InstructionBlock ib = (InstructionBlock) sequBlock.subBlocks[0];

            if (ib.getInstruction() instanceof NewArrayOperator) {
                /* This is the first element */
                NewArrayOperator newArray = (NewArrayOperator) ib.getInstruction();
                if (newArray.getDimensions() != 1 || !(newArray.getSubExpressions()[0] instanceof ConstOperator))
                    return false;

                ConstOperator countop = (ConstOperator) newArray.getSubExpressions()[0];
                if (!(countop.getValue() instanceof Integer))
                    return false;

                int arraylength = ((Integer) countop.getValue()).intValue();
                if (arraylength <= index)
                    return false;

                if (GlobalOptions.verboseLevel > 0)
                    GlobalOptions.err.print('a');

                ConstantArrayOperator cao = new ConstantArrayOperator(newArray.getType(), arraylength);
                cao.setValue(index, expr);
                ic.setInstruction(cao);
                ic.moveDefinitions(sequBlock, last);
                last.replace(sequBlock);
                return true;
            } else if (ib.getInstruction() instanceof ConstantArrayOperator) {
                ConstantArrayOperator cao = (ConstantArrayOperator) ib.getInstruction();
                if (cao.setValue(index, expr)) {
                    /* adding Element succeeded */
                    ic.setInstruction(cao);
                    ic.moveDefinitions(sequBlock, last);
                    last.replace(sequBlock);
                    return true;
                }
            }
        }
        return false;
    }
}
