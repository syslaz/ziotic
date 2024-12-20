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

import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.expr.*;
import com.ziotic.jode.type.Type;

public class CreateCheckNull {

    /* Situation:
     *
     * javac:
     *  DUP
     *  POP.getClass();
     *
     * jikes:
     *  DUP
     *  if (POP == null)
     *    throw null;
     */

    /**
     * Transforms the code
     * <pre>
     *   DUP
     *   POP.getClass()
     * </pre>
     * to a CheckNullOperator.  This is what javac generates when it
     * calls ".new" on an operand.
     */
    public static boolean transformJavac(InstructionContainer ic, StructuredBlock last) {
        if (!(last.outer instanceof SequentialBlock) || !(ic.getInstruction() instanceof Operator) || !(last.outer.getSubBlocks()[0] instanceof SpecialBlock))
            return false;

        SpecialBlock dup = (SpecialBlock) last.outer.getSubBlocks()[0];
        if (dup.type != SpecialBlock.DUP || dup.count != 1 || dup.depth != 0)
            return false;

        Operator ce = (Operator) ic.getInstruction();

        if (!(ce.getOperator() instanceof PopOperator) || !(ce.getSubExpressions()[0] instanceof InvokeOperator))
            return false;

        InvokeOperator getClassCall = (InvokeOperator) ce.getSubExpressions()[0];
        if (!getClassCall.getMethodName().equals("getClass") || !(getClassCall.getMethodType().toString().equals("()Ljava/lang/Class;")))
            return false;

        LocalInfo li = new LocalInfo();
        ic.setInstruction(new CheckNullOperator(Type.tUObject, li));
        last.replace(last.outer);
        return true;
    }

    /**
     * Transforms the code
     * <pre>
     *   DUP
     *   if (POP == null) {
     *       throw null
     *       GOTO END_OF_METHOD  // not checked
     *   }
     * </pre>
     * to a CheckNullOperator.  This is what jikes generates when it
     * calls ".new" on an operand.
     */
    public static boolean transformJikes(IfThenElseBlock ifBlock, StructuredBlock last) {
        if (!(last.outer instanceof SequentialBlock) || !(last.outer.getSubBlocks()[0] instanceof SpecialBlock) || ifBlock.elseBlock != null || !(ifBlock.thenBlock instanceof ThrowBlock))
            return false;

        SpecialBlock dup = (SpecialBlock) last.outer.getSubBlocks()[0];
        if (dup.type != SpecialBlock.DUP || dup.count != 1 || dup.depth != 0)
            return false;

        if (!(ifBlock.cond instanceof CompareUnaryOperator))
            return false;
        CompareUnaryOperator cmpOp = (CompareUnaryOperator) ifBlock.cond;
        if (cmpOp.getOperatorIndex() != Operator.EQUALS_OP || !(cmpOp.getCompareType().isOfType(Type.tUObject)))
            return false;

        LocalInfo li = new LocalInfo();
        InstructionContainer ic = new InstructionBlock(new CheckNullOperator(Type.tUObject, li));
        ifBlock.flowBlock.removeSuccessor(ifBlock.thenBlock.jump);
        ic.moveJump(ifBlock.jump);
        if (last == ifBlock) {
            ic.replace(last.outer);
            last = ic;
        } else {
            ic.replace(ifBlock);
            last.replace(last.outer);
        }
        return true;
    }
}
