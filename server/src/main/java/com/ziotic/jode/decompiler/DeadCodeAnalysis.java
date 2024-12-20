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
package com.ziotic.jode.decompiler;

import java.util.Iterator;

import com.ziotic.jode.bytecode.BytecodeInfo;
import com.ziotic.jode.bytecode.Handler;
import com.ziotic.jode.bytecode.Instruction;

public class DeadCodeAnalysis {

    private final static String REACHABLE = "R";
    private final static String REACHCHANGED = "C";

    private static void propagateReachability(BytecodeInfo code) {
        boolean changed;
        do {
            changed = false;
            for (Iterator iter = code.getInstructions().iterator(); iter.hasNext(); ) {
                Instruction instr = (Instruction) iter.next();
                if (instr.getTmpInfo() == REACHCHANGED) {
                    changed = true;
                    instr.setTmpInfo(REACHABLE);
                    Instruction[] succs = instr.getSuccs();
                    if (succs != null)
                        for (int i = 0; i < succs.length; i++)
                            if (succs[i].getTmpInfo() == null)
                                succs[i].setTmpInfo(REACHCHANGED);
                    if (!instr.doesAlwaysJump() && instr.getNextByAddr() != null)
                        if (instr.getNextByAddr().getTmpInfo() == null)
                            instr.getNextByAddr().setTmpInfo(REACHCHANGED);
                    /*XXX code after jsr reachable iff ret is reachable...*/
                    if (instr.getOpcode() == Opcodes.opc_jsr)
                        if (instr.getNextByAddr().getTmpInfo() == null)
                            instr.getNextByAddr().setTmpInfo(REACHCHANGED);
                }
            }
        } while (changed);
    }

    public static void removeDeadCode(BytecodeInfo code) {
        ((Instruction) code.getInstructions().get(0)).setTmpInfo(REACHCHANGED);
        propagateReachability(code);
        Handler[] handlers = code.getExceptionHandlers();
        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < handlers.length; i++) {
                if (handlers[i].catcher.getTmpInfo() == null) {
                    /* check if the try block is somewhere reachable
                  * and mark the catcher as reachable then.
                  */
                    for (Instruction instr = handlers[i].start; instr != null; instr = instr.getNextByAddr()) {
                        if (instr.getTmpInfo() != null) {
                            handlers[i].catcher.setTmpInfo(REACHCHANGED);
                            propagateReachability(code);
                            changed = true;
                            break;
                        }
                        if (instr == handlers[i].end)
                            break;
                    }
                }
            }
        } while (changed);

        for (int i = 0; i < handlers.length; i++) {
            /* A handler is not reachable iff the catcher is not reachable */
            if (handlers[i].catcher.getTmpInfo() == null) {
                /* This is very seldom, so we can make it slow */
                Handler[] newHandlers = new Handler[handlers.length - 1];
                System.arraycopy(handlers, 0, newHandlers, 0, i);
                System.arraycopy(handlers, i + 1, newHandlers, i, handlers.length - (i + 1));
                handlers = newHandlers;
                code.setExceptionHandlers(newHandlers);
                i--;
            } else {
                /* This works! */
                while (handlers[i].start.getTmpInfo() == null)
                    handlers[i].start = handlers[i].start.getNextByAddr();
                while (handlers[i].end.getTmpInfo() == null)
                    handlers[i].end = handlers[i].end.getPrevByAddr();
            }
        }

        /* Now remove the dead code and clean up tmpInfo */
        for (Iterator i = code.getInstructions().iterator(); i.hasNext(); ) {
            Instruction instr = (Instruction) i.next();
            if (instr.getTmpInfo() != null)
                instr.setTmpInfo(null);
            else
                i.remove();
        }
    }
}
