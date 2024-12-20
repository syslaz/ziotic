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

import com.ziotic.jode.expr.BinaryOperator;
import com.ziotic.jode.expr.CombineableOperator;
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.type.Type;

public class CombineIfGotoExpressions {

    public static boolean transform(ConditionalBlock cb, StructuredBlock last) {
        if (cb.jump == null || !(last.outer instanceof SequentialBlock))
            return false;

        SequentialBlock sequBlock = (SequentialBlock) cb.outer;
        Expression firstCond, secondCond;

        secondCond = cb.getInstruction();
        Expression lastCombined = secondCond;

        while (sequBlock.subBlocks[0] instanceof InstructionBlock) {
            InstructionBlock ib = (InstructionBlock) sequBlock.subBlocks[0];

            if (!(sequBlock.outer instanceof SequentialBlock))
                return false;

            Expression expr = ib.getInstruction();
            if (!(expr instanceof CombineableOperator) || (lastCombined.canCombine((CombineableOperator) expr) + secondCond.canCombine((CombineableOperator) expr) <= 0))
                /* Tricky, the above is true, iff one of the two
                 * Expressions conflict, or both fail.  */
                return false;

            lastCombined = expr;

            sequBlock = (SequentialBlock) sequBlock.outer;
        }

        if (sequBlock.subBlocks[0] instanceof ConditionalBlock) {

            ConditionalBlock cbprev = (ConditionalBlock) sequBlock.subBlocks[0];

            Jump prevJump = cbprev.trueBlock.jump;

            int operator;
            if (prevJump.destination == cb.jump.destination) {
                operator = BinaryOperator.LOG_AND_OP;
                firstCond = cbprev.getInstruction().negate();
            } else if (prevJump.destination == cb.trueBlock.jump.destination) {
                operator = BinaryOperator.LOG_OR_OP;
                firstCond = cbprev.getInstruction();
            } else
                return false;

            /* We have changed some instructions above.  We may never
             * return with a failure now.
             */

            sequBlock = (SequentialBlock) cb.outer;
            while (sequBlock.subBlocks[0] instanceof InstructionBlock) {
                /* Now combine the expression.  Everything should
                 * succeed, because we have checked above.  */
                InstructionBlock ib = (InstructionBlock) sequBlock.subBlocks[0];

                Expression expr = ib.getInstruction();

                secondCond = secondCond.combine((CombineableOperator) expr);
                sequBlock = (SequentialBlock) sequBlock.outer;
            }

            cb.flowBlock.removeSuccessor(prevJump);
            prevJump.prev.removeJump();
            Expression cond = new BinaryOperator(Type.tBoolean, operator).addOperand(secondCond).addOperand(firstCond);
            cb.setInstruction(cond);
            cb.moveDefinitions(sequBlock, last);
            last.replace(sequBlock);
            return true;
        }
        return false;
    }
}
