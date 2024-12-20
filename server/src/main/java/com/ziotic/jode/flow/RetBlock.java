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
import java.util.Set;

import com.ziotic.jode.decompiler.LocalInfo;

/**
 * This block represents a ret instruction.  A ret instruction is
 * used to call the finally block, or to call the monitorexit block in
 * a synchronized block.
 *
 * @author Jochen Hoenicke
 */
public class RetBlock extends StructuredBlock {
    /**
     * The local containing the return address
     */
    LocalInfo local;

    public RetBlock(LocalInfo local) {
        this.local = local;
    }

    /**
     * Fill all in variables into the given VariableSet.
     *
     * @param in The VariableSet, the in variables should be stored to.
     */
    public void fillInGenSet(Set in, Set gen) {
        in.add(local);
        gen.add(local);
    }

    /**
     * This does take the instr into account and modifies stack
     * accordingly.  It then calls super.mapStackToLocal.
     *
     * @param stack the stack before the instruction is called
     * @return stack the stack afterwards.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        if (!stack.isEmpty())
            throw new IllegalArgumentException("stack is not empty at RET");
        return null;
    }

    public Set getDeclarables() {
        return Collections.singleton(local);
    }

    public void dumpInstruction(com.ziotic.jode.decompiler.TabbedPrintWriter writer) throws java.io.IOException {
        writer.println("RET " + local);
    }
}
