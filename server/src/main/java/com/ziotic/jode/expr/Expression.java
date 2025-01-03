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

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.Type;

public abstract class Expression {
    protected Type type;

    Operator parent = null;

    public Expression(Type type) {
        this.type = type;
    }

    public void setType(Type otherType) {
        Type newType = otherType.intersection(type);
        if (type.equals(newType))
            return;
        if (newType == Type.tError && otherType != Type.tError) {
            GlobalOptions.err.println("setType: Type error in " + this + ": merging " + type + " and " + otherType);
            if (parent != null)
                GlobalOptions.err.println("\tparent is " + parent);
            if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_TYPES) != 0)
                Thread.dumpStack();
        }
        type = newType;
        if (type != Type.tError)
            updateSubTypes();
    }

    public void updateParentType(Type otherType) {
        setType(otherType);
        if (parent != null)
            parent.updateType();
    }

    /**
     * Tells an expression that an inner expression may have changed and
     * that the type should be recalculated.
     * <p/>
     * This may call setType of the caller again.
     */
    public abstract void updateType();

    /**
     * Tells an expression that an outer expression has changed our type
     * and that the inner types should be recalculated.
     */
    public abstract void updateSubTypes();

    public Type getType() {
        return type;
    }

    public Operator getParent() {
        return parent;
    }

    /**
     * Get priority of the operator.
     * Currently this priorities are known:
     * <ul><li> 1000 constant
     * </li><li> 950 new, .(field access), []
     * </li><li> 900 new[]
     * </li><li> 800 ++,-- (post)
     * </li><li> 700 ++,--(pre), +,-(unary), ~, !, cast
     * </li><li> 650 *,/, %
     * </li><li> 610 +,-
     * </li><li> 600 <<, >>, >>>
     * </li><li> 550 >, <, >=, <=, instanceof
     * </li><li> 500 ==, !=
     * </li><li> 450 &
     * </li><li> 420 ^
     * </li><li> 410 |
     * </li><li> 350 &&
     * </li><li> 310 ||
     * </li><li> 200 ?:
     * </li><li> 100 =, +=, -=, etc.
     * </li></ul>
     */
    public abstract int getPriority();

    /**
     * Get the penalty for splitting up this operator.
     */
    public int getBreakPenalty() {
        return 0;
    }

    /**
     * Get the number of operands.
     *
     * @return The number of stack entries this expression needs.
     */
    public abstract int getFreeOperandCount();

    public abstract Expression addOperand(Expression op);

    public Expression negate() {
        Operator negop = new UnaryOperator(Type.tBoolean, Operator.LOG_NOT_OP);
        negop.addOperand(this);
        return negop;
    }

    /**
     * Checks if the value of the given expression can change, due to
     * side effects in this expression.  If this returns false, the
     * expression can safely be moved behind the current expresion.
     *
     * @param expr the expression that should not change.
     */
    public boolean hasSideEffects(Expression expr) {
        return false;
    }

    /**
     * Checks if the given Expression (which should be a CombineableOperator)
     * can be combined into this expression.
     *
     * @param e The store expression, must be of type void.
     * @return 1, if it can, 0, if no match was found and -1, if a
     *         conflict was found.  You may wish to check for >0.
     */
    public int canCombine(CombineableOperator combOp) {
        return 0;
    }

    /**
     * Checks if this expression contains a load, that matches the
     * given CombineableOperator (which must be an Operator)
     *
     * @param e The store expression.
     * @return if this expression contains a matching load.
     * @throws ClassCastException, if e.getOperator
     *                             is not a CombineableOperator.
     */
    public boolean containsMatchingLoad(CombineableOperator e) {
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
        return false;
    }

    /**
     * Combines the given Expression (which should be a StoreInstruction)
     * into this expression.  You must only call this if
     * canCombine returns the value 1.
     *
     * @param e The store expression,
     *          the operator must be a CombineableOperator.
     * @return The combined expression.
     * @throws ClassCastException, if e.getOperator
     *                             is not a CombineableOperator.
     */
    public Expression combine(CombineableOperator comb) {
        return null;
    }

    /**
     * This method should remove local variables that are only written
     * and read one time directly after another.  <br>
     * <p/>
     * In this case this is a non void LocalStoreOperator, whose local
     * isn't used in other places.
     *
     * @return an expression where the locals are removed.
     */
    public Expression removeOnetimeLocals() {
        return this;
    }

    public Expression simplify() {
        return this;
    }

    public Expression simplifyString() {
        return this;
    }

    public static Expression EMPTYSTRING = new ConstOperator("");

    public Expression simplifyStringBuffer() {
        return null;
    }

    public void makeInitializer(Type type) {
    }

    public boolean isConstant() {
        return true;
    }

    public void fillInGenSet(Collection in, Collection gen) {
    }

    public void fillDeclarables(Collection used) {
    }

    public void makeDeclaration(Set done) {
    }

    public abstract void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException;

    public void dumpExpression(int options, TabbedPrintWriter writer) throws java.io.IOException {
        writer.startOp(options, getBreakPenalty());
        dumpExpression(writer);
        writer.endOp();
    }

    public void dumpExpression(TabbedPrintWriter writer, int minPriority) throws java.io.IOException {
        int options;
        boolean needParen1 = false, needParen2 = false;
        boolean needEndOp1 = false, needEndOp2 = false;

        String typecast = "";

        if (type == Type.tError)
            typecast = "/*TYPE_ERROR*/";
        else if ((GlobalOptions.debuggingFlags & GlobalOptions.DEBUG_TYPES) != 0)
            typecast = "(TYPE " + type + ")";

        if (typecast != "") {
            if (minPriority > 700) {
                needParen1 = true;
                needEndOp1 = true;
                writer.print("(");
                writer.startOp(writer.EXPL_PAREN, 0);
            } else if (minPriority < 700) {
                needEndOp1 = true;
                writer.startOp(writer.IMPL_PAREN, 1);
            }
            writer.print(typecast);
            writer.breakOp();
            writer.print(" ");
            minPriority = 700;
        }

        int priority = getPriority();
        if (priority < minPriority) {
            needParen2 = true;
            needEndOp2 = true;
            writer.print("(");
            writer.startOp(writer.EXPL_PAREN, getBreakPenalty());
        } else if (priority != minPriority) {
            needEndOp2 = true;
            if (getType() == Type.tVoid)
                writer.startOp(writer.NO_PAREN, getBreakPenalty());
            else
                writer.startOp(writer.IMPL_PAREN, 1 + getBreakPenalty());
        }

        try {
            dumpExpression(writer);
        } catch (RuntimeException ex) {
            writer.print("(RUNTIME ERROR IN EXPRESSION)");
            ex.printStackTrace(GlobalOptions.err);
        }

        if (needEndOp2) {
            writer.endOp();
            if (needParen2)
                writer.print(")");
        }
        if (needEndOp1) {
            writer.endOp();
            if (needParen1)
                writer.print(")");
        }
    }

    public String toString() {
        try {
            java.io.StringWriter strw = new java.io.StringWriter();
            TabbedPrintWriter writer = new TabbedPrintWriter(strw);
            dumpExpression(writer);
            return strw.toString();
        } catch (java.io.IOException ex) {
            return "/*IOException*/" + super.toString();
        } catch (RuntimeException ex) {
            return "/*RuntimeException*/" + super.toString();
        }
    }

    public boolean isVoid() {
        return getType() == Type.tVoid;
    }
}
