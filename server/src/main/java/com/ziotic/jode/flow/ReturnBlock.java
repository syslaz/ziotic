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

/**
 * This is the structured block for a Return block.
 */
public class ReturnBlock extends InstructionContainer {
    /**
     * The loads that are on the stack before instr is executed.
     */
    VariableStack stack;

    public ReturnBlock() {
        super(null);
    }

    public ReturnBlock(Expression instr) {
        super(instr, new Jump(FlowBlock.END_OF_METHOD));
    }

    /**
     * This does take the instr into account and modifies stack
     * accordingly.  It then calls super.mapStackToLocal.
     *
     * @param stack the stack before the instruction is called
     * @return stack the stack afterwards.
     */
    public VariableStack mapStackToLocal(VariableStack stack) {
        VariableStack newStack = stack;
        if (instr != null) {
            int params = instr.getFreeOperandCount();
            if (params > 0) {
                this.stack = stack.peek(params);
                newStack = stack.pop(params);
            }
        }
        if (jump != null)
            jump.stackMap = newStack;
        return null;
    }

    public void removePush() {
        if (stack != null)
            instr = stack.mergeIntoExpression(instr);
    }

    /**
     * Tells if this block needs braces when used in a if or while block.
     *
     * @return true if this block should be sorrounded by braces.
     */
    public boolean needsBraces() {
        return declare != null && !declare.isEmpty();
    }

    public void dumpInstruction(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print("return");
        if (instr != null) {
            writer.print(" ");
            instr.dumpExpression(writer.IMPL_PAREN, writer);
        }
        writer.println(";");
    }
}
