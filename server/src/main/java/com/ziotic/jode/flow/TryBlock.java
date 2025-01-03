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

import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.expr.InvokeOperator;
import com.ziotic.jode.expr.LocalLoadOperator;
import com.ziotic.jode.type.Type;

/**
 * A TryBlock is created for each exception in the
 * ExceptionHandlers-Attribute. <p>
 * <p/>
 * For each catch block (there may be more than one catch block
 * appending a single try block) and for each finally and each
 * synchronized block such a TryBlock is created.  The
 * finally/synchronized-blocks have a null exception type so that they
 * are easily distinguishable from the catch blocks. <p>
 * <p/>
 * A TryBlock is an intermediate representation that gets
 * converted later to a CatchBlock, a FinallyBlock or a
 * SynchronizedBlock (after the body is parsed).
 *
 * @author Jochen Hoenicke
 * @date 1998/09/16
 * @see CatchBlock
 * @see FinallyBlock
 * @see SynchronizedBlock
 */

public class TryBlock extends StructuredBlock {

    VariableSet gen;
    StructuredBlock[] subBlocks = new StructuredBlock[1];

    public TryBlock(FlowBlock tryFlow) {
        this.gen = (VariableSet) tryFlow.gen.clone();
        this.flowBlock = tryFlow;

        StructuredBlock bodyBlock = tryFlow.block;
        replace(bodyBlock);
        this.subBlocks = new StructuredBlock[]{bodyBlock};
        bodyBlock.outer = this;
        tryFlow.lastModified = this;
        tryFlow.checkConsistent();
    }

    public void addCatchBlock(StructuredBlock catchBlock) {
        StructuredBlock[] newSubBlocks = new StructuredBlock[subBlocks.length + 1];
        System.arraycopy(subBlocks, 0, newSubBlocks, 0, subBlocks.length);
        newSubBlocks[subBlocks.length] = catchBlock;
        subBlocks = newSubBlocks;
        catchBlock.outer = this;
        catchBlock.setFlowBlock(flowBlock);
    }

    /**
     * Replaces the given sub block with a new block.
     *
     * @param oldBlock the old sub block.
     * @param newBlock the new sub block.
     * @return false, if oldBlock wasn't a direct sub block.
     */
    public boolean replaceSubBlock(StructuredBlock oldBlock, StructuredBlock newBlock) {
        for (int i = 0; i < subBlocks.length; i++) {
            if (subBlocks[i] == oldBlock) {
                subBlocks[i] = newBlock;
                return true;
            }
        }
        return false;
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return subBlocks;
    }

    /**
     * This does take the instr into account and modifies stack
     * accordingly.  It then calls super.mapStackToLocal.
     *
     * @param stack the stack before the instruction is called
     * @return stack the stack afterwards.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        // first the try block.
        VariableStack after = subBlocks[0].mapStackToLocal(stack);
        for (int i = 1; i < subBlocks.length; i++) {
            // now merge the catch blocks; they start on empty stack.
            after = VariableStack.merge(after, subBlocks[i].mapStackToLocal(VariableStack.EMPTY));
        }
        if (jump != null) {
            jump.stackMap = after;
            return null;
        }
        return after;
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print("try");
        writer.openBrace();
        writer.tab();
        subBlocks[0].dumpSource(writer);
        writer.untab();
        for (int i = 1; i < subBlocks.length; i++)
            subBlocks[i].dumpSource(writer);
        writer.closeBrace();
    }

    /**
     * Determines if there is a sub block, that flows through to the end
     * of this block.  If this returns true, you know that jump is null.
     *
     * @return true, if the jump may be safely changed.
     */
    public boolean jumpMayBeChanged() {
        for (int i = 0; i < subBlocks.length; i++) {
            if (subBlocks[i].jump == null && !subBlocks[i].jumpMayBeChanged())
                return false;
        }
        return true;
    }

    /**
     * A special transformation for try blocks:
     * jikes generate try/catch-blocks for array clone:
     * <pre>
     * try {
     *     PUSH ARRAY.clone()
     * } catch (CloneNotSupportedException ex) {
     *     throw new InternalError(ex.getMessage());
     * }
     * </pre>
     * which is simply transformed to the content of the try block.
     */
    public boolean checkJikesArrayClone() {

        if (subBlocks.length != 2 || !(subBlocks[0] instanceof InstructionBlock) || !(subBlocks[1] instanceof CatchBlock))
            return false;

        Expression instr = ((InstructionBlock) subBlocks[0]).getInstruction();
        CatchBlock catchBlock = (CatchBlock) subBlocks[1];

        if (instr.isVoid() || instr.getFreeOperandCount() != 0 || !(instr instanceof InvokeOperator) || !(catchBlock.catchBlock instanceof ThrowBlock) || !(catchBlock.exceptionType.equals(Type.tClass("java.lang.CloneNotSupportedException"))))
            return false;

        InvokeOperator arrayClone = (InvokeOperator) instr;
        if (!arrayClone.getMethodName().equals("clone") || arrayClone.isStatic() || !(arrayClone.getMethodType().getTypeSignature().equals("()Ljava/lang/Object;")) || !(arrayClone.getSubExpressions()[0].getType().isOfType(Type.tArray(Type.tUnknown))))
            return false;

        Expression throwExpr = ((ThrowBlock) catchBlock.catchBlock).getInstruction();

        if (throwExpr.getFreeOperandCount() != 0 || !(throwExpr instanceof InvokeOperator))
            return false;

        InvokeOperator throwOp = (InvokeOperator) throwExpr;
        if (!throwOp.isConstructor() || !(throwOp.getClassType().equals(Type.tClass("java.lang.InternalError"))) || throwOp.getMethodType().getParameterTypes().length != 1)
            return false;

        Expression getMethodExpr = throwOp.getSubExpressions()[1];
        if (!(getMethodExpr instanceof InvokeOperator))
            return false;

        InvokeOperator invoke = (InvokeOperator) getMethodExpr;
        if (!invoke.getMethodName().equals("getMessage") || invoke.isStatic() || (invoke.getMethodType().getParameterTypes().length != 0) || (invoke.getMethodType().getReturnType() != Type.tString))
            return false;

        Expression exceptExpr = invoke.getSubExpressions()[0];
        if (!(exceptExpr instanceof LocalLoadOperator) || !(((LocalLoadOperator) exceptExpr).getLocalInfo().equals(catchBlock.exceptionLocal)))
            return false;

        subBlocks[0].replace(this);
        if (flowBlock.lastModified == this)
            flowBlock.lastModified = subBlocks[0];
        return true;
    }

    public boolean doTransformations() {
        return checkJikesArrayClone();
    }
}
