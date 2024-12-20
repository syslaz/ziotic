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
import com.ziotic.jode.expr.CombineableOperator;
import com.ziotic.jode.expr.Expression;

/**
 * This transformation creates expressions.  It transforms
 * <pre>
 *  Sequ[expr_1, Sequ[expr_2, ..., Sequ[expr_n, op] ...]]
 * </pre>
 * to
 * <pre>
 *  expr(op, [ expr_1, ..., expr_n ])
 * </pre>
 */
public class CreateExpression {

    /**
     * This does the transformation.
     *
     * @param FlowBlock the flow block to transform.
     * @return true if flow block was simplified.
     */
    public static boolean transform(InstructionContainer ic, StructuredBlock last) {
        int params = ic.getInstruction().getFreeOperandCount();
        if (params == 0)
            return false;

        if (!(last.outer instanceof SequentialBlock))
            return false;
        SequentialBlock sequBlock = (SequentialBlock) last.outer;

        /* First check if Expression can be created, but do nothing yet.
         */
        Expression lastExpression = ic.getInstruction();
        while (true) {
            if (!(sequBlock.subBlocks[0] instanceof InstructionBlock))
                return false;

            Expression expr = ((InstructionBlock) sequBlock.subBlocks[0]).getInstruction();

            if (!expr.isVoid())
                break;

            if (expr.getFreeOperandCount() > 0 || !(expr instanceof CombineableOperator) || lastExpression.canCombine((CombineableOperator) expr) <= 0)
                return false;

            /* Hmm, we should really set lastExpression to
            * lastExpression.combine(expr), but that may change the
            * expressions :-(  XXX
            *
            * We do a conservative approach and check if there are
            * no possible side effects with the skipped expressions.
            * Theoretically we would only have to check expressions,
            * that are combined at an earlier point.
            */
            SequentialBlock block = sequBlock;
            while (block != last.outer) {
                block = (SequentialBlock) block.subBlocks[1];
                if (((InstructionBlock) block.subBlocks[0]).getInstruction().hasSideEffects(expr))
                    return false;
            }

            if (!(sequBlock.outer instanceof SequentialBlock))
                return false;
            sequBlock = (SequentialBlock) sequBlock.outer;
        }

        /* Now, do the combination. Everything must succeed now.
        */
        sequBlock = (SequentialBlock) last.outer;
        lastExpression = ic.getInstruction();
        while (true) {

            Expression expr = ((InstructionBlock) sequBlock.subBlocks[0]).getInstruction();

            if (!expr.isVoid()) {
                lastExpression = lastExpression.addOperand(expr);
                break;
            }

            lastExpression = lastExpression.combine((CombineableOperator) expr);
            sequBlock = (SequentialBlock) sequBlock.outer;
        }

        if (GlobalOptions.verboseLevel > 0 && lastExpression.getFreeOperandCount() == 0)
            GlobalOptions.err.print('x');

        ic.setInstruction(lastExpression);
        ic.moveDefinitions(sequBlock, last);
        last.replace(sequBlock);
        return true;
    }
}
