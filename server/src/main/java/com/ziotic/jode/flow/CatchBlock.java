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

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import com.ziotic.jode.decompiler.Declarable;
import com.ziotic.jode.decompiler.LocalInfo;
import com.ziotic.jode.expr.*;
import com.ziotic.jode.type.Type;

/**
 * @author Jochen Hoenicke
 */
public class CatchBlock extends StructuredBlock {

    /**
     * The catch block.
     */
    StructuredBlock catchBlock;

    /**
     * The type of the exception.
     */
    Type exceptionType;

    /**
     * The local containing the exception. May be null.
     */
    LocalInfo exceptionLocal;

    public CatchBlock(Type type) {
        exceptionType = type;
    }

    public Type getExceptionType() {
        return exceptionType;
    }

    public LocalInfo getLocal() {
        return exceptionLocal;
    }

    /**
     * Sets the catch block.
     *
     * @param catchBlock the catch block.
     */
    public void setCatchBlock(StructuredBlock catchBlock) {
        this.catchBlock = catchBlock;
        catchBlock.outer = this;
        catchBlock.setFlowBlock(flowBlock);
        if (exceptionLocal == null)
            combineLocal();
    }

    /* The implementation of getNext[Flow]Block is the standard
     * implementation */

    /**
     * Replaces the given sub block with a new block.
     *
     * @param oldBlock the old sub block.
     * @param newBlock the new sub block.
     * @return false, if oldBlock wasn't a direct sub block.
     */
    public boolean replaceSubBlock(StructuredBlock oldBlock, StructuredBlock newBlock) {
        if (catchBlock == oldBlock)
            catchBlock = newBlock;
        else
            return false;
        return true;
    }

    /**
     * Returns all sub block of this structured block.
     */
    public StructuredBlock[] getSubBlocks() {
        return new StructuredBlock[]{catchBlock};
    }

    LocalInfo pushedLocal;

    /**
     * A catch block pushes the exception on the stack, iff a local
     * doesn't exists.
     *
     * @param stack the stack before the instruction is called
     * @return stack the stack afterwards.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        VariableStack newStack;
        if (exceptionLocal == null) {
            pushedLocal = new LocalInfo();
            pushedLocal.setType(exceptionType);
            newStack = stack.push(pushedLocal);
        } else
            newStack = stack;
        return super.mapStackToLocal(newStack);
    }

    public void removePush() {
        if (pushedLocal != null)
            exceptionLocal = pushedLocal;
        super.removePush();
    }

    public Set getDeclarables() {
        if (exceptionLocal != null)
            return Collections.singleton(exceptionLocal);
        return Collections.EMPTY_SET;
    }

    /**
     * Make the declarations, i.e. initialize the declare variable
     * to correct values.  This will declare every variable that
     * is marked as used, but not done.
     *
     * @param done The set of the already declare variables.
     */
    public void makeDeclaration(Set done) {
        super.makeDeclaration(done);
        /* Normally we have to declare our exceptionLocal.  This
       * is automatically done in dumpSource.
       *
       * If we are unlucky the exceptionLocal is used outside of
       * this block.  In that case we do a transformation.
       */
        if (exceptionLocal != null) {
            if (declare.contains(exceptionLocal))
                declare.remove(exceptionLocal);
            else {
                LocalInfo dummyLocal = new LocalInfo();
                Expression store = new StoreInstruction(new LocalStoreOperator(exceptionLocal.getType(), exceptionLocal)).addOperand(new LocalLoadOperator(dummyLocal.getType(), null, dummyLocal));
                InstructionBlock ib = new InstructionBlock(store);
                ib.setFlowBlock(flowBlock);
                ib.appendBlock(catchBlock);
                catchBlock = ib;
                exceptionLocal = dummyLocal;
                String localName = dummyLocal.guessName();
                Iterator doneIter = done.iterator();
                while (doneIter.hasNext()) {
                    Declarable previous = (Declarable) doneIter.next();
                    if (localName.equals(previous.getName())) {
                        /* A name conflict happened. */
                        dummyLocal.makeNameUnique();
                        break;
                    }
                }
            }
        }
    }

    public void dumpInstruction(com.ziotic.jode.decompiler.TabbedPrintWriter writer) throws java.io.IOException {
        writer.closeBraceContinue();
        writer.print("catch (");
        writer.printType(exceptionType);
        writer.print(" " + (exceptionLocal != null ? exceptionLocal.getName() : "PUSH") + ")");
        writer.openBrace();
        writer.tab();
        catchBlock.dumpSource(writer);
        writer.untab();
    }

    /**
     * Determines if there is a sub block, that flows through to the end
     * of this block.  If this returns true, you know that jump is null.
     *
     * @return true, if the jump may be safely changed.
     */
    public boolean jumpMayBeChanged() {
        return (catchBlock.jump != null || catchBlock.jumpMayBeChanged());
    }

    /**
     * Check if this is an local store instruction to a not yet declared
     * variable.  In that case mark this as declaration and return the
     * variable.
     */
    public boolean combineLocal() {
        StructuredBlock firstInstr = (catchBlock instanceof SequentialBlock) ? catchBlock.getSubBlocks()[0] : catchBlock;

        if (firstInstr instanceof SpecialBlock && ((SpecialBlock) firstInstr).type == SpecialBlock.POP && ((SpecialBlock) firstInstr).count == 1) {
            /* The exception is ignored.  Create a dummy local for it */
            exceptionLocal = new LocalInfo();
            exceptionLocal.setType(exceptionType);
            firstInstr.removeBlock();
            return true;
        } else if (firstInstr instanceof InstructionBlock) {
            Expression instr = ((InstructionBlock) firstInstr).getInstruction();
            if (instr instanceof StoreInstruction) {
                StoreInstruction store = (StoreInstruction) instr;
                if (store.getOperatorIndex() == store.OPASSIGN_OP && store.getSubExpressions()[1] instanceof NopOperator && store.getLValue() instanceof LocalStoreOperator) {
                    /* The exception is stored in a local variable */
                    exceptionLocal = ((LocalStoreOperator) store.getLValue()).getLocalInfo();
                    exceptionLocal.setType(exceptionType);
                    firstInstr.removeBlock();
                    return true;
                }
            }
        }
        return false;
    }
}
