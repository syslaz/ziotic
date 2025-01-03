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

public class CreatePrePostIncExpression {

    public static boolean transform(InstructionContainer ic, StructuredBlock last) {
        return (createLocalPrePostInc(ic, last) || createPostInc(ic, last));
    }

    public static boolean createLocalPrePostInc(InstructionContainer ic, StructuredBlock last) {
        /* Situations:
         *
         *   PUSH local_x        ->  PUSH local_x++
     *   IINC local_x, +/-1
     *
     *   IINC local_x, +/-1
         *   PUSH local_x        ->  PUSH ++local_x
         */

        if (!(last.outer instanceof SequentialBlock) || !(last.outer.getSubBlocks()[0] instanceof InstructionBlock))
            return false;

        Expression instr1 = ((InstructionBlock) last.outer.getSubBlocks()[0]).getInstruction();
        Expression instr2 = ic.getInstruction();

        IIncOperator iinc;
        LocalLoadOperator load;
        boolean isPost;
        if (instr1 instanceof IIncOperator && instr2 instanceof LocalLoadOperator) {
            iinc = (IIncOperator) instr1;
            load = (LocalLoadOperator) instr2;
            isPost = false;
        } else if (instr1 instanceof LocalLoadOperator && instr2 instanceof IIncOperator) {
            load = (LocalLoadOperator) instr1;
            iinc = (IIncOperator) instr2;
            isPost = true;
        } else
            return false;

        int op;
        if (iinc.getOperatorIndex() == iinc.ADD_OP + iinc.OPASSIGN_OP)
            op = Operator.INC_OP;
        else if (iinc.getOperatorIndex() == iinc.SUB_OP + iinc.OPASSIGN_OP)
            op = Operator.DEC_OP;
        else
            return false;

        if (iinc.getValue() == -1)
            op ^= 1;
        else if (iinc.getValue() != 1)
            return false;

        if (!iinc.lvalueMatches(load))
            return false;

        Type type = load.getType().intersection(Type.tUInt);
        iinc.makeNonVoid();
        Operator ppop = new PrePostFixOperator(type, op, iinc.getLValue(), isPost);

        ic.setInstruction(ppop);
        ic.moveDefinitions(last.outer, last);
        last.replace(last.outer);
        return true;
    }

    public static boolean createPostInc(InstructionContainer ic, StructuredBlock last) {

        /* Situation:
         *
         *   PUSH load/storeOps (optional/
     *                       not checked)  PUSH load/storeOps
         *   DUP  load/storeOps (optional)     PUSH store++/--
         *   PUSH load(stack)
         *   DUP_X(storeOps count)          ->
         *   store(stack) = stack_0 +/- 1
         */

        if (!(ic.getInstruction() instanceof StoreInstruction))
            return false;

        StoreInstruction store = (StoreInstruction) ic.getInstruction();

        /* Make sure that the lvalue part of the store is
       * not yet resolved (and note that the rvalue part
       * should also have 1 remaining operand)
       */
        Expression lvalue = store.getSubExpressions()[0];
        int lvalueCount = lvalue.getFreeOperandCount();
        if (!((Operator) lvalue).isFreeOperator() || !store.isVoid() || !(store.getSubExpressions()[1] instanceof BinaryOperator))
            return false;

        BinaryOperator binOp = (BinaryOperator) store.getSubExpressions()[1];
        if (binOp.getSubExpressions() == null || !(binOp.getSubExpressions()[0] instanceof NopOperator) || !(binOp.getSubExpressions()[1] instanceof ConstOperator))
            return false;

        ConstOperator constOp = (ConstOperator) binOp.getSubExpressions()[1];
        int op;
        if (binOp.getOperatorIndex() == store.ADD_OP)
            op = Operator.INC_OP;
        else if (binOp.getOperatorIndex() == store.SUB_OP)
            op = Operator.DEC_OP;
        else
            return false;

        if (!constOp.isOne(lvalue.getType()))
            return false;

        if (!(last.outer instanceof SequentialBlock))
            return false;
        SequentialBlock sb = (SequentialBlock) last.outer;
        if (!(sb.subBlocks[0] instanceof SpecialBlock))
            return false;

        SpecialBlock dup = (SpecialBlock) sb.subBlocks[0];
        if (dup.type != SpecialBlock.DUP || dup.count != lvalue.getType().stackSize() || dup.depth != lvalueCount)
            return false;

        if (!(sb.outer instanceof SequentialBlock))
            return false;
        sb = (SequentialBlock) sb.outer;
        if (!(sb.subBlocks[0] instanceof InstructionBlock))
            return false;
        InstructionBlock ib = (InstructionBlock) sb.subBlocks[0];

        if (!(ib.getInstruction() instanceof Operator) || !store.lvalueMatches((Operator) ib.getInstruction()))
            return false;

        if (lvalueCount > 0) {
            if (!(sb.outer instanceof SequentialBlock))
                return false;
            sb = (SequentialBlock) sb.outer;
            if (!(sb.subBlocks[0] instanceof SpecialBlock))
                return false;
            SpecialBlock dup2 = (SpecialBlock) sb.subBlocks[0];
            if (dup2.type != SpecialBlock.DUP || dup2.count != lvalueCount || dup2.depth != 0)
                return false;
        }
        ic.setInstruction(new PrePostFixOperator(lvalue.getType(), op, store.getLValue(), true));
        ic.moveDefinitions(sb, last);
        last.replace(sb);
        return true;
    }
}
