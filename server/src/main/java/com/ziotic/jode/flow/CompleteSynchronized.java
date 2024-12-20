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

public class CompleteSynchronized {

    /**
     * This combines the monitorenter into a synchronized statement
     *
     * @param flow The FlowBlock that is transformed
     */
    public static boolean enter(SynchronizedBlock synBlock, StructuredBlock last) {

        if (!(last.outer instanceof SequentialBlock))
            return false;

        /* If the program is well formed, the following succeed */
        SequentialBlock sequBlock = (SequentialBlock) synBlock.outer;
        if (!(sequBlock.subBlocks[0] instanceof InstructionBlock))
            return false;

        Expression monenter = ((InstructionBlock) sequBlock.subBlocks[0]).getInstruction();

        if (!(monenter instanceof MonitorEnterOperator))
            return false;

        Expression loadOp = ((MonitorEnterOperator) monenter).getSubExpressions()[0];

        if (!(loadOp instanceof LocalLoadOperator) || (((LocalLoadOperator) loadOp).getLocalInfo() != synBlock.local.getLocalInfo()))
            return false;

        if (GlobalOptions.verboseLevel > 0)
            GlobalOptions.err.print('s');

        synBlock.isEntered = true;
        synBlock.moveDefinitions(last.outer, last);
        last.replace(last.outer);
        return true;
    }

    /**
     * This combines the initial expression describing the object
     * into a synchronized statement
     *
     * @param flow The FlowBlock that is transformed
     */
    public static boolean combineObject(SynchronizedBlock synBlock, StructuredBlock last) {

        /* Is there another expression? */
        if (!(last.outer instanceof SequentialBlock))
            return false;
        SequentialBlock sequBlock = (SequentialBlock) last.outer;

        if (!(sequBlock.subBlocks[0] instanceof InstructionBlock))
            return false;
        InstructionBlock ib = (InstructionBlock) sequBlock.subBlocks[0];

        if (!(ib.getInstruction() instanceof StoreInstruction))
            return false;
        StoreInstruction assign = (StoreInstruction) ib.getInstruction();

        if (!(assign.getLValue() instanceof LocalStoreOperator))
            return false;
        LocalStoreOperator lvalue = (LocalStoreOperator) assign.getLValue();

        if (lvalue.getLocalInfo() != synBlock.local.getLocalInfo() || assign.getSubExpressions()[1] == null)
            return false;

        synBlock.object = assign.getSubExpressions()[1];
        synBlock.moveDefinitions(last.outer, last);
        last.replace(last.outer);
        return true;
    }
}
