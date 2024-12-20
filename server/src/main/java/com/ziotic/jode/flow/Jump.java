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

/**
 * This class represents an unconditional jump.
 */
public class Jump {
    /**
     * The structured block that precedes this jump.
     */
    StructuredBlock prev;
    /**
     * The destination block of this jump, null if not known, or illegal.
     */
    FlowBlock destination;

    /**
     * The jumps in a flow block, that have the same destination, are
     * in a link list.  This field points to the next jump in this link.
     */
    Jump next;

    /**
     * The stack map.  This tells how many objects are on stack at
     * begin of the flow block, and to what locals they are maped.
     *
     * @see FlowBlock.mapStackToLocal
     */
    VariableStack stackMap;

    public Jump(FlowBlock dest) {
        this.destination = dest;
    }

    public Jump(Jump jump) {
        destination = jump.destination;
        next = jump.next;
        jump.next = this;
    }

    /**
     * Print the source code for this structured block.  This handles
     * everything that is unique for all structured blocks and calls
     * dumpInstruction afterwards.
     *
     * @param writer The tabbed print writer, where we print to.
     */
    public void dumpSource(com.ziotic.jode.decompiler.TabbedPrintWriter writer) throws java.io.IOException {
        if (destination == null)
            writer.println("GOTO null-ptr!!!!!");
        else
            writer.println("GOTO " + destination.getLabel());
    }
}
