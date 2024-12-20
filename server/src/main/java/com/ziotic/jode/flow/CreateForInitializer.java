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

public class CreateForInitializer {

    /**
     * This combines an variable initializer into a for statement
     *
     * @param forBlock the for block
     * @param last     the lastModified of the flow block.
     */
    public static boolean transform(LoopBlock forBlock, StructuredBlock last) {

        if (!(last.outer instanceof SequentialBlock))
            return false;

        SequentialBlock sequBlock = (SequentialBlock) last.outer;

        if (!(sequBlock.subBlocks[0] instanceof InstructionBlock))
            return false;

        InstructionBlock init = (InstructionBlock) sequBlock.subBlocks[0];

        if (!init.getInstruction().isVoid() || !(init.getInstruction() instanceof CombineableOperator) || !forBlock.conditionMatches((CombineableOperator) init.getInstruction()))
            return false;

        if (GlobalOptions.verboseLevel > 0)
            GlobalOptions.err.print('f');

        forBlock.setInit((InstructionBlock) sequBlock.subBlocks[0]);
        return true;
    }
}
