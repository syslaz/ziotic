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
import com.ziotic.jode.expr.CompareUnaryOperator;
import com.ziotic.jode.expr.ConstOperator;
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.expr.IfThenElseOperator;
import com.ziotic.jode.type.Type;

public class CreateIfThenElseOperator {

    /**
     * This handles the body of createFunny. There are three cases:
     * <p/>
     * <pre>
     * --------
     *  IF (c2)
     *    GOTO trueDest            ->   PUSH c2
     *  PUSH false
     * --------
     *  PUSH bool                  ->   PUSH bool
     * --------
     *  if (c2)
     *    (handled recursively)    ->   PUSH (c2 ? expr1 : expr2)
     *  else
     *    (handled recursively)
     * --------
     * </pre>
     */
    private static boolean createFunnyHelper(FlowBlock trueDest, FlowBlock falseDest, StructuredBlock block) {

        if (block instanceof InstructionBlock && !((InstructionBlock) block).getInstruction().isVoid())
            return true;

        if (block instanceof IfThenElseBlock) {
            IfThenElseBlock ifBlock = (IfThenElseBlock) block;
            Expression expr1, expr2;
            if (ifBlock.elseBlock == null)
                return false;

            /* Next is a non-shortcut "or": simplify both blocks! */
            if (!createFunnyHelper(trueDest, falseDest, ifBlock.thenBlock) | !createFunnyHelper(trueDest, falseDest, ifBlock.elseBlock))
                return false;

            if (GlobalOptions.verboseLevel > 0)
                GlobalOptions.err.print('?');

            Expression iteo = new IfThenElseOperator(Type.tBoolean).addOperand(((InstructionBlock) ifBlock.elseBlock).getInstruction()).addOperand(((InstructionBlock) ifBlock.thenBlock).getInstruction()).addOperand(ifBlock.cond);
            ((InstructionBlock) ifBlock.thenBlock).setInstruction(iteo);

            ifBlock.thenBlock.moveDefinitions(ifBlock, null);
            ifBlock.thenBlock.replace(ifBlock);
            return true;
        }

        if (block instanceof SequentialBlock && block.getSubBlocks()[0] instanceof ConditionalBlock && block.getSubBlocks()[1] instanceof InstructionBlock) {

            ConditionalBlock condBlock = (ConditionalBlock) block.getSubBlocks()[0];
            InstructionBlock pushBlock = (InstructionBlock) block.getSubBlocks()[1];

            if (!(pushBlock.getInstruction() instanceof ConstOperator))
                return false;

            ConstOperator constOp = (ConstOperator) pushBlock.getInstruction();

            if (condBlock.trueBlock.jump.destination == trueDest && constOp.getValue().equals(new Integer(0))) {

                Expression cond = condBlock.getInstruction();
                condBlock.flowBlock.removeSuccessor(condBlock.trueBlock.jump);
                condBlock.trueBlock.removeJump();

                pushBlock.setInstruction(cond);
                pushBlock.moveDefinitions(block, null);
                pushBlock.replace(block);
                return true;
            }
        }
        return false;
    }

    /**
     * This handles the more complicated form of the ?-:-operator used
     * in a conditional block.  The simplest case is:
     * <pre>
     *   if (cond)
     *       PUSH e1
     *   else {
     *       IF (c2)
     *           GOTO flow_2_
     *       PUSH false
     *   }
     * -&gt;IF (stack_0 == 0)
     *     GOTO flow_1_
     *   GOTO flow_2_
     * </pre>
     * is transformed to
     * <pre>
     *   push cond ? e1 : c2
     * -&gt;IF (stack_0 == 0)
     *     GOTO flow_1_
     *   GOTO flow_2_
     * </pre>
     * <p/>
     * The <code>-&gt;</code> points to the lastModified block.  Note
     * that both the if and the then part may contain this
     * condition+push0-block.  There may be even stack if-then-else-blocks
     * for very complicated nested ?-:-Operators. <p>
     * <p/>
     * Also note that the produced code is suboptimal:  The push-0 could
     * sometimes be better replaced with a correct jump.
     *
     * @param flow The FlowBlock that is transformed
     */
    public static boolean createFunny(ConditionalBlock cb, StructuredBlock last) {

        if (cb.jump == null || !(cb.getInstruction() instanceof CompareUnaryOperator) || !(last.outer instanceof SequentialBlock) || !(last.outer.getSubBlocks()[0] instanceof IfThenElseBlock))
            return false;

        CompareUnaryOperator compare = (CompareUnaryOperator) cb.getInstruction();

        FlowBlock trueDestination;
        FlowBlock falseDestination;
        if (compare.getOperatorIndex() == compare.EQUALS_OP) {
            trueDestination = cb.jump.destination;
            falseDestination = cb.trueBlock.jump.destination;
        } else if (compare.getOperatorIndex() == compare.NOTEQUALS_OP) {
            falseDestination = cb.jump.destination;
            trueDestination = cb.trueBlock.jump.destination;
        } else
            return false;

        Expression[] e = new Expression[3];
        IfThenElseBlock ifBlock;

        SequentialBlock sequBlock = (SequentialBlock) last.outer;
        return createFunnyHelper(trueDestination, falseDestination, sequBlock.subBlocks[0]);
    }

    /**
     * This handles the normal form of the ?-:-operator:
     * <pre>
     *   if (cond)
     *       push e1
     *       GOTO flow_1_
     * -&gt;push e2
     *   GOTO flow_2
     * </pre>
     * is transformed to
     * <pre>
     * -&gt;push cond ? e1 : e2
     * </pre>
     * The <code>-&gt;</code> points to the lastModified block.
     *
     * @param flow The FlowBlock that is transformed
     */
    public static boolean create(InstructionContainer ic, StructuredBlock last) {
        Expression cond, thenExpr, elseExpr;
        InstructionBlock thenBlock;
        if (ic.jump == null || !(last.outer instanceof SequentialBlock))
            return false;
        SequentialBlock sequBlock = (SequentialBlock) last.outer;
        if (!(sequBlock.subBlocks[0] instanceof IfThenElseBlock))
            return false;

        IfThenElseBlock ifBlock = (IfThenElseBlock) sequBlock.subBlocks[0];
        if (!(ifBlock.thenBlock instanceof InstructionBlock) || ifBlock.thenBlock.jump == null || ifBlock.thenBlock.jump.destination != ic.jump.destination || ifBlock.elseBlock != null)
            return false;

        thenBlock = (InstructionBlock) ifBlock.thenBlock;

        thenExpr = thenBlock.getInstruction();
        if (thenExpr.isVoid() || thenExpr.getFreeOperandCount() > 0)
            return false;
        elseExpr = ic.getInstruction();
        if (elseExpr.isVoid() || elseExpr.getFreeOperandCount() > 0)
            return false;
        cond = ifBlock.cond;

        if (GlobalOptions.verboseLevel > 0)
            GlobalOptions.err.print('?');

        thenBlock.flowBlock.removeSuccessor(thenBlock.jump);
        thenBlock.removeJump();

        IfThenElseOperator iteo = new IfThenElseOperator(Type.tSuperType(thenExpr.getType()).intersection(Type.tSuperType(elseExpr.getType())));
        iteo.addOperand(elseExpr);
        iteo.addOperand(thenExpr);
        iteo.addOperand(cond);
        ic.setInstruction(iteo);
        ic.moveDefinitions(last.outer, last);
        last.replace(last.outer);
        return true;
    }
}
