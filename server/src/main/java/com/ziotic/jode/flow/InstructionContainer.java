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

import java.util.Set;

import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.expr.InvokeOperator;
import com.ziotic.jode.util.SimpleSet;

/**
 * This is a method for block containing a single instruction.
 */
public abstract class InstructionContainer extends StructuredBlock {
    /**
     * The instruction.
     */
    Expression instr;

    public InstructionContainer(Expression instr) {
        this.instr = instr;
    }

    public InstructionContainer(Expression instr, Jump jump) {
        this(instr);
        setJump(jump);
    }

    /**
     * Make the declarations, i.e. initialize the declare variable
     * to correct values.  This will declare every variable that
     * is marked as used, but not done.<br>
     * <p/>
     * This will now also combine locals, that use the same slot, have
     * compatible types and are declared in the same block. <br>
     *
     * @param done The set of the already declare variables.
     */
    public void makeDeclaration(Set done) {
        if (instr != null)
            instr.makeDeclaration(done);
        super.makeDeclaration(done);
    }

    /**
     * This method should remove local variables that are only written
     * and read one time directly after another.  <br>
     * <p/>
     * This is especially important for stack locals, that are created
     * when there are unusual swap or dup instructions, but also makes
     * inlined functions more pretty (but not that close to the
     * bytecode).
     */
    public void removeOnetimeLocals() {
        if (instr != null)
            instr = instr.removeOnetimeLocals();
        super.removeOnetimeLocals();
    }

    /**
     * Fill all in variables into the given VariableSet.
     *
     * @param in The VariableSet, the in variables should be stored to.
     */
    public void fillInGenSet(Set in, Set gen) {
        if (instr != null)
            instr.fillInGenSet(in, gen);
    }

    public Set getDeclarables() {
        Set used = new SimpleSet();
        if (instr != null)
            instr.fillDeclarables(used);
        return used;
    }

    public boolean doTransformations() {
        if (instr == null)
            return false;
        /* Do on the fly access$ transformation, since some further
       * operations need this.
       */
        if (instr instanceof InvokeOperator) {
            Expression expr = ((InvokeOperator) instr).simplifyAccess();
            if (expr != null)
                instr = expr;
        }
        StructuredBlock last = flowBlock.lastModified;
        return CreateNewConstructor.transform(this, last) || CreateAssignExpression.transform(this, last) || CreateExpression.transform(this, last) || CreatePrePostIncExpression.transform(this, last) || CreateIfThenElseOperator.create(this, last) || CreateConstantArray.transform(this, last) || CreateCheckNull.transformJavac(this, last);
    }

    /**
     * Get the contained instruction.
     *
     * @return the contained instruction.
     */
    public final Expression getInstruction() {
        return instr;
    }

    public void simplify() {
        if (instr != null)
            instr = instr.simplify();
        super.simplify();
    }

    /**
     * Set the contained instruction.
     *
     * @param instr the new instruction.
     */
    public final void setInstruction(Expression instr) {
        this.instr = instr;
    }
}
