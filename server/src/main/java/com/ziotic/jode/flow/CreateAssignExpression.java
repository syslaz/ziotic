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

public class CreateAssignExpression {

    public static boolean transform(InstructionContainer ic, StructuredBlock last) {
        if (!(last.outer instanceof SequentialBlock) || !(ic.getInstruction() instanceof StoreInstruction) || !(ic.getInstruction().isVoid()))
            return false;

        return (createAssignOp(ic, last) || createAssignExpression(ic, last));
    }

    public static boolean createAssignOp(InstructionContainer ic, StructuredBlock last) {

        /* Situation:
         *
         *   (push loadstoreOps)  <- not checked
         * sequBlock:
         *   dup (may be missing for static / local variables)
         * opBlock:
         *   PUSH (optional narrow)((optional wide) load(stack) * RHS)
         *   (optional dup_x)
         *   store(POP)
         *
         * We transform it to:
         *   (push loadstoreOps)
         *   rightHandSide
     *   (optional dup_x)
         *   store(stack) *= (stack)
         *
         * If the optional dup is present the store*= becomes non void.  */

        SequentialBlock opBlock = (SequentialBlock) last.outer;
        StoreInstruction store = (StoreInstruction) ic.getInstruction();
        if (!store.isFreeOperator() || store.isOpAssign())
            return false;
        Expression lvalue = store.getSubExpressions()[0];
        int lvalueCount = lvalue.getFreeOperandCount();

        boolean isAssignOp = false;
        if (opBlock.subBlocks[0] instanceof SpecialBlock) {
            SpecialBlock dup = (SpecialBlock) opBlock.subBlocks[0];
            if (dup.type != SpecialBlock.DUP || dup.depth != lvalueCount || dup.count != lvalue.getType().stackSize() || !(opBlock.outer instanceof SequentialBlock))
                return false;
            opBlock = (SequentialBlock) opBlock.outer;
            isAssignOp = true;
        }

        if (!(opBlock.subBlocks[0] instanceof InstructionBlock))
            return false;

        InstructionBlock ib = (InstructionBlock) opBlock.subBlocks[0];
        if (!(ib.getInstruction() instanceof Operator))
            return false;
        Operator expr = (Operator) ib.getInstruction();
        if (expr.getFreeOperandCount() != lvalueCount)
            return false;
        Type rvalueType = expr.getType();

        SpecialBlock dup = null;

        if (lvalueCount > 0) {
            if (!(opBlock.outer instanceof SequentialBlock) || !(opBlock.outer.getSubBlocks()[0] instanceof SpecialBlock))
                return false;

            SequentialBlock sequBlock = (SequentialBlock) opBlock.outer;
            dup = (SpecialBlock) sequBlock.subBlocks[0];

            if (dup.type != SpecialBlock.DUP || dup.depth != 0 || dup.count != lvalueCount)
                return false;
        }
        int opIndex;
        Expression rightHandSide;

        if (expr instanceof ConvertOperator && expr.getSubExpressions()[0] instanceof Operator && expr.getType().isOfType(lvalue.getType())) {

            /* This gets tricky.  We need to allow something like
            *  s = (short) (int) ((double) s / 0.1);
            */
            expr = (Operator) expr.getSubExpressions()[0];
            while (expr instanceof ConvertOperator && expr.getSubExpressions()[0] instanceof Operator)
                expr = (Operator) expr.getSubExpressions()[0];
        }
        if (expr instanceof BinaryOperator) {
            opIndex = expr.getOperatorIndex();
            if (opIndex < expr.ADD_OP || opIndex >= expr.ASSIGN_OP)
                return false;

            if (!(expr.getSubExpressions()[0] instanceof Operator))
                return false;

            Operator loadExpr = (Operator) expr.getSubExpressions()[0];
            while (loadExpr instanceof ConvertOperator && loadExpr.getSubExpressions()[0] instanceof Operator)
                loadExpr = (Operator) loadExpr.getSubExpressions()[0];

            if (!store.lvalueMatches((Operator) loadExpr) || !(loadExpr.isFreeOperator(lvalueCount)))
                return false;

            if (lvalue instanceof LocalStoreOperator)
                ((LocalLoadOperator) loadExpr).getLocalInfo().combineWith(((LocalStoreOperator) lvalue).getLocalInfo());

            rightHandSide = expr.getSubExpressions()[1];
        } else {
            /* For String += the situation is more complex.
            * what is marked as load(stack) * rightHandSide above is
            * really (after simplification):
            *
            *   PUSH ((load(stack) + right) + Hand) + Side
            */
            Expression simple = expr.simplifyString();
            rightHandSide = simple;
            /* Now search for the leftmost operand ... */
            Operator lastExpr = null;
            Operator parent = null;
            while (simple instanceof StringAddOperator) {
                parent = lastExpr;
                lastExpr = (Operator) simple;
                simple = lastExpr.getSubExpressions()[0];
            }

            /* ... check it ... */
            if (lastExpr == null || !(simple instanceof Operator) || !store.lvalueMatches((Operator) simple) || !(((Operator) simple).isFreeOperator(lvalueCount)))
                return false;

            if (lvalue instanceof LocalStoreOperator)
                ((LocalLoadOperator) simple).getLocalInfo().combineWith(((LocalStoreOperator) lvalue).getLocalInfo());

            /* ... and remove it. */
            if (parent != null) {
                parent.setSubExpressions(0, lastExpr.getSubExpressions()[1]);
            } else {
                rightHandSide = lastExpr.getSubExpressions()[1];
            }

            opIndex = Operator.ADD_OP;
        }

        if (dup != null)
            dup.removeBlock();
        ib.setInstruction(rightHandSide);

        lvalue.setType(rvalueType);
        store.makeOpAssign(store.OPASSIGN_OP + opIndex);

        if (isAssignOp)
            store.makeNonVoid();
        last.replace(opBlock.subBlocks[1]);
        return true;
    }

    public static boolean createAssignExpression(InstructionContainer ic, StructuredBlock last) {
        /* Situation:
         * sequBlock:
         *   dup_X(lvalue_count)
         *   store(POP) = POP
         */
        SequentialBlock sequBlock = (SequentialBlock) last.outer;
        StoreInstruction store = (StoreInstruction) ic.getInstruction();

        if (sequBlock.subBlocks[0] instanceof SpecialBlock && store.isFreeOperator()) {

            Expression lvalue = store.getSubExpressions()[0];
            SpecialBlock dup = (SpecialBlock) sequBlock.subBlocks[0];
            if (dup.type != SpecialBlock.DUP || dup.depth != lvalue.getFreeOperandCount() || dup.count != lvalue.getType().stackSize())
                return false;

            dup.removeBlock();
            store.makeNonVoid();
            return true;
        }
        return false;
    }
}
