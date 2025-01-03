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
package com.ziotic.jode.expr;

import java.util.Collection;
import java.util.Set;

import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.Type;

public abstract class Operator extends Expression {
    /* Don't reorder these constants unless you know what you are doing! */
    public final static int ADD_OP = 1;
    public final static int SUB_OP = 2;
    public final static int SHIFT_OP = 6;
    public final static int AND_OP = 9;
    public final static int ASSIGN_OP = 12;
    public final static int OPASSIGN_OP = 12;
    public final static int INC_OP = 24; /* must be even! */
    public final static int DEC_OP = 25;
    public final static int COMPARE_OP = 26; /* must be even! */
    public final static int EQUALS_OP = 26;
    public final static int NOTEQUALS_OP = 27;
    public final static int LESS_OP = 28;
    public final static int GREATEREQ_OP = 29;
    public final static int GREATER_OP = 30;
    public final static int LESSEQ_OP = 31;
    public final static int LOG_AND_OP = 32; /* must be even! */
    public final static int LOG_OR_OP = 33;
    public final static int LOG_NOT_OP = 34;
    public final static int NEG_OP = 36;
    static String opString[] = {"", " + ", " - ", " * ", " / ", " % ", " << ", " >> ", " >>> ", " & ", " | ", " ^ ", " = ", " += ", " -= ", " *= ", " /= ", " %= ", " <<= ", " >>= ", " >>>= ", " &= ", " |= ", " ^= ", "++", "--", " == ", " != ", " < ", " >= ", " > ", " <= ", " && ", " || ", "!", "~", "-"};

    protected int operatorIndex;
    private int operandcount;

    Expression[] subExpressions;

    public Operator(Type type) {
        this(type, 0);
    }

    public Operator(Type type, int op) {
        super(type);
        this.operatorIndex = op;
        if (type == null)
            throw new com.ziotic.jode.AssertError("type == null");
    }

    public void initOperands(int opcount) {
        operandcount = opcount;
        subExpressions = new Expression[opcount];
        for (int i = 0; i < opcount; i++) {
            subExpressions[i] = new NopOperator(Type.tUnknown);
            subExpressions[i].parent = this;
        }
        updateSubTypes();
    }

    public int getFreeOperandCount() {
        return operandcount;
    }

    /**
     * Tells if this is an operator, that doesn't have any
     * subExpression, yet.
     */
    public boolean isFreeOperator() {
        return subExpressions.length == 0 || subExpressions[subExpressions.length - 1] instanceof NopOperator;
    }

    /**
     * Tells if this is an operator, that doesn't have any
     * subExpression, yet, and that expects opcount operands
     */
    public boolean isFreeOperator(int opcount) {
        return subExpressions.length == opcount && (opcount == 0 || subExpressions[opcount - 1] instanceof NopOperator);
    }

    public Expression addOperand(Expression op) {
        for (int i = subExpressions.length; i-- > 0; ) {
            int opcount = subExpressions[i].getFreeOperandCount();
            if (opcount > 0) {
                subExpressions[i] = subExpressions[i].addOperand(op);
                operandcount += subExpressions[i].getFreeOperandCount() - opcount;
                updateType();
                return this;
            }
        }
        throw new com.ziotic.jode.AssertError("addOperand called, but no operand needed");
    }

    public Operator getOperator() {
        return this;
    }

    public Expression[] getSubExpressions() {
        return subExpressions;
    }

    public void setSubExpressions(int i, Expression expr) {
        int diff = expr.getFreeOperandCount() - subExpressions[i].getFreeOperandCount();
        subExpressions[i] = expr;
        expr.parent = this;
        for (Operator ce = this; ce != null; ce = (Operator) ce.parent)
            ce.operandcount += diff;
        updateType();
    }

    public int getOperatorIndex() {
        return operatorIndex;
    }

    public void setOperatorIndex(int op) {
        operatorIndex = op;
    }

    public String getOperatorString() {
        return opString[operatorIndex];
    }

    public boolean opEquals(Operator o) {
        return this == o;
    }

    public Expression simplify() {
        for (int i = 0; i < subExpressions.length; i++) {
            subExpressions[i] = subExpressions[i].simplify();
            subExpressions[i].parent = this;
        }
        return this;
    }

    public void fillInGenSet(Collection in, Collection gen) {
        if (this instanceof LocalVarOperator) {
            LocalVarOperator varOp = (LocalVarOperator) this;
            if (varOp.isRead() && in != null)
                in.add(varOp.getLocalInfo());
            if (gen != null)
                gen.add(varOp.getLocalInfo());
        }
        for (int i = 0; i < subExpressions.length; i++)
            subExpressions[i].fillInGenSet(in, gen);
    }

    public void fillDeclarables(Collection used) {
        for (int i = 0; i < subExpressions.length; i++)
            subExpressions[i].fillDeclarables(used);
    }

    public void makeDeclaration(Set done) {
        for (int i = 0; i < subExpressions.length; i++)
            subExpressions[i].makeDeclaration(done);
    }

    /**
     * Checks if the value of the given expression can change, due to
     * side effects in this expression.  If this returns false, the
     * expression can safely be moved behind the current expresion.
     *
     * @param expr the expression that should not change.
     */
    public boolean hasSideEffects(Expression expr) {
        if (expr instanceof MatchableOperator && expr.containsConflictingLoad((MatchableOperator) expr))
            return true;
        for (int i = 0; i < subExpressions.length; i++) {
            if (subExpressions[i].hasSideEffects(expr))
                return true;
        }
        return false;
    }

    /**
     * Checks if this expression contains a conflicting load, that
     * matches the given CombineableOperator.  The sub expressions are
     * not checked.
     *
     * @param op The combineable operator.
     * @return if this expression contains a matching load.
     */
    public boolean containsConflictingLoad(MatchableOperator op) {
        if (op.matches(this))
            return true;
        for (int i = 0; i < subExpressions.length; i++) {
            if (subExpressions[i].containsConflictingLoad(op))
                return true;
        }
        return false;
    }

    /**
     * Checks if this expression contains a matching load, that matches the
     * given Expression.
     *
     * @param comb The store expression.
     * @return true, iff this expression contains a matching load.
     * @throws ClassCastException, if e.getOperator
     *                             is not a CombineableOperator.
     */
    public boolean containsMatchingLoad(CombineableOperator comb) {
        Operator combOp = (Operator) comb;
        if (comb.getLValue().matches(this)) {
            if (subsEquals((Operator) comb.getLValue()))
                return true;
        }
        for (int i = 0; i < subExpressions.length; i++) {
            if (subExpressions[i].containsMatchingLoad(comb))
                return true;
        }
        return false;
    }

    /**
     * Checks if the given Expression (which must be a CombineableOperator)
     * can be combined into this expression.
     *
     * @param e The store expression, must be of type void.
     * @return 1, if it can, 0, if no match was found and -1, if a
     *         conflict was found.  You may wish to check for >0.
     * @throws ClassCastException, if e.getOperator
     *                             is not a CombineableOperator.
     */
    public int canCombine(CombineableOperator combOp) {
//  	GlobalOptions.err.println("Try to combine "+e+" into "+this);
        if (combOp.getLValue() instanceof LocalStoreOperator && ((Operator) combOp).getFreeOperandCount() == 0) {
            // Special case for locals created on inlining methods, which may
            // combine everywhere, as long as there are no side effects.

            for (int i = 0; i < subExpressions.length; i++) {
                int result = subExpressions[i].canCombine(combOp);
                if (result != 0)
                    return result;
                if (subExpressions[i].hasSideEffects((Expression) combOp))
                    return -1;
            }
        }

        if (combOp.lvalueMatches(this))
            return subsEquals((Operator) combOp) ? 1 : -1;
        if (subExpressions.length > 0)
            return subExpressions[0].canCombine(combOp);
        return 0;
    }

    /**
     * Combines the given Expression (which should be a StoreInstruction)
     * into this expression.  You must only call this if
     * canCombine returns the value 1.
     *
     * @param e The store expression.
     * @return The combined expression.
     * @throws ClassCastException, if e.getOperator
     *                             is not a CombineableOperator.
     */
    public Expression combine(CombineableOperator comb) {
        Operator combOp = (Operator) comb;
        if (comb.lvalueMatches(this)) {
            /* We already checked in canCombine that subExpressions match */
            comb.makeNonVoid();
            combOp.parent = parent;
            return combOp;
        }
        for (int i = 0; i < subExpressions.length; i++) {
            Expression combined = subExpressions[i].combine(comb);
            if (combined != null) {
                subExpressions[i] = combined;
                updateType();
                return this;
            }
        }
        return null;
    }

    public boolean subsEquals(Operator other) {
        if (this == other)
            return true;
        if (other.subExpressions == null)
            return (subExpressions == null);

        if (subExpressions.length != other.subExpressions.length)
            return false;

        for (int i = 0; i < subExpressions.length; i++) {
            if (!subExpressions[i].equals(other.subExpressions[i]))
                return false;
        }
        return true;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Operator))
            return false;
        Operator other = (Operator) o;
        return opEquals(other) && subsEquals(other);
    }

    public boolean isConstant() {
        for (int i = 0; i < subExpressions.length; i++)
            if (!subExpressions[i].isConstant())
                return false;
        return true;
    }

    public abstract void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException;
}
