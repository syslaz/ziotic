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

import com.ziotic.jode.bytecode.Reference;
import com.ziotic.jode.decompiler.MethodAnalyzer;
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.expr.InvokeOperator;
import com.ziotic.jode.expr.NewOperator;
import com.ziotic.jode.expr.NopOperator;
import com.ziotic.jode.type.Type;

public class CreateNewConstructor {

    public static boolean transform(InstructionContainer ic, StructuredBlock last) {
        return transformNormal(ic, last) || transformJikesString(ic, last);
    }

    static boolean transformJikesString(InstructionContainer ic, StructuredBlock last) {
        /* special Situation for Jikes String +=:
         *
     *   PUSH new StringBuffer()
     *   SWAP
     *   PUSH POP.append(POP)
         *
         * We transform it to the javac String +=:
     *
     *   PUSH new StringBuffer(String.valueOf(POP))
     */
        if (!(last.outer instanceof SequentialBlock) || !(ic.getInstruction() instanceof InvokeOperator))
            return false;

        InvokeOperator appendCall = (InvokeOperator) ic.getInstruction();
        if (!appendCall.getClassType().equals(Type.tStringBuffer) || !appendCall.isFreeOperator(2) || appendCall.isStatic() || !appendCall.getMethodName().equals("append") || appendCall.getMethodType().getParameterTypes().length != 1)
            return false;

        SequentialBlock sequBlock = (SequentialBlock) last.outer;
        if (!(sequBlock.outer instanceof SequentialBlock) || !(sequBlock.subBlocks[0] instanceof SpecialBlock))
            return false;

        SpecialBlock swapBlock = (SpecialBlock) sequBlock.subBlocks[0];
        sequBlock = (SequentialBlock) sequBlock.outer;
        if (swapBlock.type != SpecialBlock.SWAP || !(sequBlock.subBlocks[0] instanceof InstructionBlock) || !(sequBlock.outer instanceof SequentialBlock))
            return false;

        InstructionBlock ib = (InstructionBlock) sequBlock.subBlocks[0];
        sequBlock = (SequentialBlock) sequBlock.outer;
        if (!(ib.getInstruction() instanceof InvokeOperator) || !(sequBlock.subBlocks[0] instanceof InstructionBlock))
            return false;

        InvokeOperator constr = (InvokeOperator) ib.getInstruction();
        ib = (InstructionBlock) sequBlock.subBlocks[0];

        if (!constr.isConstructor() || !constr.getClassType().equals(Type.tStringBuffer) || constr.isVoid() || constr.getMethodType().getParameterTypes().length != 0)
            return false;

        /* Okay everything checked. */
        MethodAnalyzer methodAna = ib.flowBlock.method;
        Expression expr = ib.getInstruction();
        Type appendType = appendCall.getMethodType().getParameterTypes()[0];
        if (!appendType.equals(Type.tString)) {
            InvokeOperator valueOf = new InvokeOperator(methodAna, InvokeOperator.STATIC, Reference.getReference("Ljava/lang/String;", "valueOf", "(" + appendType.getTypeSignature() + ")Ljava/lang/String;"));
            expr = valueOf.addOperand(expr);
        }
        InvokeOperator newConstr = new InvokeOperator(methodAna, InvokeOperator.CONSTRUCTOR, Reference.getReference("Ljava/lang/StringBuffer;", "<init>", "(Ljava/lang/String;)V"));
        newConstr.makeNonVoid();
        newConstr.setSubExpressions(0, constr.getSubExpressions()[0]);
        newConstr.setSubExpressions(1, expr);
        ic.setInstruction(newConstr);
        last.replace(sequBlock);
        return true;
    }

    static boolean transformNormal(InstructionContainer ic, StructuredBlock last) {
        /* Situation (normal):
     *
         *  new <object>
         *  (optional DUP)
     *  (void resolved expressions)
         *  stack_n.<init>(resolved expressions)
         *
         * transform it to
         *
     *  (void resolved expressions)
         *  (optional PUSH) new <object>((optional: stack_n),
     *                               resolved expressions)
     *
     * special situation for string1 += string2:
     *
         *  new <object>
         *  (optional DUP)
     *  (void resolved expressions)
         *  PUSH load_ops
         *  DUP_X2/1  <= 2 if above DUP is present
         *  stack_n.<init>(stack_n, resolved expressions)
         *
         * transform it to
         *
     *  (void resolved expressions)
         *  PUSH load_ops
         *  DUP       <= remove the depth
         *  (optional PUSH) new <object>(stack_n, resolved expressions)
         */

        if (!(last.outer instanceof SequentialBlock))
            return false;
        if (!(ic.getInstruction() instanceof InvokeOperator))
            return false;
        InvokeOperator constrCall = (InvokeOperator) ic.getInstruction();
        if (!constrCall.isConstructor() || !constrCall.isVoid())
            return false;

        /* The rest should probably succeed */

        SpecialBlock optDupX2 = null;
        SequentialBlock sequBlock = (SequentialBlock) last.outer;
        Expression[] subs = constrCall.getSubExpressions();
        int opcount = constrCall.getFreeOperandCount();
        if (subs != null) {
            if (!(subs[0] instanceof NopOperator))
                return false;
            if (constrCall.getFreeOperandCount() > 1) {
                if (!(sequBlock.outer instanceof SequentialBlock) || !(sequBlock.subBlocks[0] instanceof SpecialBlock))
                    return false;
                optDupX2 = (SpecialBlock) sequBlock.subBlocks[0];
                sequBlock = (SequentialBlock) sequBlock.outer;
                if (optDupX2.type != SpecialBlock.DUP || optDupX2.depth == 0)
                    return false;
                int count = optDupX2.count;
                do {
                    if (!(sequBlock.outer instanceof SequentialBlock) || !(sequBlock.subBlocks[0] instanceof InstructionBlock))
                        return false;
                    Expression expr = ((InstructionBlock) sequBlock.subBlocks[0]).getInstruction();
                    sequBlock = (SequentialBlock) sequBlock.outer;

                    if (expr.isVoid())
                        continue;
                    count -= expr.getType().stackSize();
                    opcount--;
                } while (count > 0 && opcount > 1);
                if (count != 0)
                    return false;
            }
        }
        if (opcount != 1)
            return false;

        while (sequBlock.subBlocks[0] instanceof InstructionBlock && sequBlock.outer instanceof SequentialBlock) {
            Expression expr = ((InstructionBlock) sequBlock.subBlocks[0]).getInstruction();
            if (!expr.isVoid() || expr.getFreeOperandCount() > 0)
                break;
            sequBlock = (SequentialBlock) sequBlock.outer;
        }

        SpecialBlock dup = null;
        if (sequBlock.outer instanceof SequentialBlock && sequBlock.subBlocks[0] instanceof SpecialBlock) {

            dup = (SpecialBlock) sequBlock.subBlocks[0];
            if (dup.type != SpecialBlock.DUP || dup.count != 1 || dup.depth != 0)
                return false;
            sequBlock = (SequentialBlock) sequBlock.outer;
            if (optDupX2 != null && optDupX2.depth != 2)
                return false;
        } else if (optDupX2 != null && optDupX2.depth != 1)
            return false;

        if (!(sequBlock.subBlocks[0] instanceof InstructionBlock))
            return false;
        InstructionBlock block = (InstructionBlock) sequBlock.subBlocks[0];
        if (!(block.getInstruction() instanceof NewOperator))
            return false;

        NewOperator op = (NewOperator) block.getInstruction();
        if (constrCall.getClassType() != op.getType())
            return false;

        block.removeBlock();
        if (dup != null)
            dup.removeBlock();
        if (optDupX2 != null)
            optDupX2.depth = 0;

        constrCall.setSubExpressions(0, op);
        if (dup != null)
            constrCall.makeNonVoid();
//  	Expression newExpr = new ConstructorOperator
//  	    (constrCall, dup == null);

//  	if (subs != null) {
//  	    for (int i=subs.length; i-- > 1; )
//  		newExpr = newExpr.addOperand(subs[i]);
//  	}
//  	ic.setInstruction(newExpr);
        return true;
    }
}
