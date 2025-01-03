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

import com.ziotic.jode.decompiler.TabbedPrintWriter;
import com.ziotic.jode.type.IntegerType;
import com.ziotic.jode.type.Type;

public class ConstOperator extends NoArgOperator {
    Object value;
    boolean isInitializer = false;

    private static final Type tBoolConstInt = new IntegerType(IntegerType.IT_I | IntegerType.IT_C | IntegerType.IT_Z | IntegerType.IT_S | IntegerType.IT_B);

    public ConstOperator(Object constant) {
        super(Type.tUnknown);
        if (constant instanceof Boolean) {
            updateParentType(Type.tBoolean);
            constant = new Integer(((Boolean) constant).booleanValue() ? 1 : 0);
        } else if (constant instanceof Integer) {
            int intVal = ((Integer) constant).intValue();
            updateParentType((intVal == 0 || intVal == 1) ? tBoolConstInt : (intVal < Short.MIN_VALUE || intVal > Character.MAX_VALUE) ? Type.tInt : new IntegerType((intVal < Byte.MIN_VALUE) ? IntegerType.IT_S | IntegerType.IT_I : (intVal < 0) ? IntegerType.IT_S | IntegerType.IT_B | IntegerType.IT_I : (intVal <= Byte.MAX_VALUE) ? (IntegerType.IT_S | IntegerType.IT_B | IntegerType.IT_C | IntegerType.IT_I) : (intVal <= Short.MAX_VALUE) ? IntegerType.IT_S | IntegerType.IT_C | IntegerType.IT_I : IntegerType.IT_C | IntegerType.IT_I));
        } else if (constant instanceof Long)
            updateParentType(Type.tLong);
        else if (constant instanceof Float)
            updateParentType(Type.tFloat);
        else if (constant instanceof Double)
            updateParentType(Type.tDouble);
        else if (constant instanceof String)
            updateParentType(Type.tString);
        else if (constant == null)
            updateParentType(Type.tUObject);
        else
            throw new IllegalArgumentException("Illegal constant type: " + constant.getClass());
        value = constant;
    }

    public Object getValue() {
        return value;
    }

    /**
     * Return true, if this value is a one of the given type.
     * This is used for ++ and -- instructions.
     *
     * @param type the type for which this must be a one.  This may
     *             be different from the type this value actually is.
     */
    public boolean isOne(Type type) {
        if (type instanceof IntegerType) {
            return (value instanceof Integer && ((Integer) value).intValue() == 1);
        } else if (type == Type.tLong) {
            return (value instanceof Long && ((Long) value).longValue() == 1L);
        } else if (type == Type.tFloat) {
            return (value instanceof Float && ((Float) value).floatValue() == 1.0f);
        } else if (type == Type.tDouble) {
            return (value instanceof Double && ((Double) value).doubleValue() == 1.0);
        }
        return false;
    }

    public int getPriority() {
        return 1000;
    }

    public boolean opEquals(Operator o) {
        if (o instanceof ConstOperator) {
            Object otherValue = ((ConstOperator) o).value;
            return value == null ? otherValue == null : value.equals(otherValue);
        }
        return false;
    }

    public void makeInitializer(Type type) {
        isInitializer = true;
    }

    private static String quoted(String str) {
        StringBuffer result = new StringBuffer("\"");
        for (int i = 0; i < str.length(); i++) {
            char c;
            switch (c = str.charAt(i)) {
                case '\0':
                    result.append("\\0");
                    break;
                case '\t':
                    result.append("\\t");
                    break;
                case '\n':
                    result.append("\\n");
                    break;
                case '\r':
                    result.append("\\r");
                    break;
                case '\\':
                    result.append("\\\\");
                    break;
                case '\"':
                    result.append("\\\"");
                    break;
                default:
                    if (c < 32) {
                        String oct = Integer.toOctalString(c);
                        result.append("\\000".substring(0, 4 - oct.length())).append(oct);
                    } else if (c >= 32 && c < 127)
                        result.append(str.charAt(i));
                    else {
                        String hex = Integer.toHexString(c);
                        result.append("\\u0000".substring(0, 6 - hex.length())).append(hex);
                    }
            }
        }
        return result.append("\"").toString();
    }

    public String toString() {
        String strVal = String.valueOf(value);
        if (type.isOfType(Type.tBoolean)) {
            int intVal = ((Integer) value).intValue();
            if (intVal == 0)
                return "false";
            else if (intVal == 1)
                return "true";
            else
                throw new com.ziotic.jode.AssertError("boolean is neither false nor true");
        }
        if (type.getHint().equals(Type.tChar)) {
            char c = (char) ((Integer) value).intValue();
            switch (c) {
                case '\0':
                    return "\'\\0\'";
                case '\t':
                    return "\'\\t\'";
                case '\n':
                    return "\'\\n\'";
                case '\r':
                    return "\'\\r\'";
                case '\\':
                    return "\'\\\\\'";
                case '\"':
                    return "\'\\\"\'";
                case '\'':
                    return "\'\\\'\'";
            }
            if (c < 32) {
                String oct = Integer.toOctalString(c);
                return "\'\\000".substring(0, 5 - oct.length()) + oct + "\'";
            }
            if (c >= 32 && c < 127)
                return "\'" + c + "\'";
            else {
                String hex = Integer.toHexString(c);
                return "\'\\u0000".substring(0, 7 - hex.length()) + hex + "\'";
            }
        } else if (type.equals(Type.tString)) {
            return quoted(strVal);
        } else if (parent != null) {
            int opindex = parent.getOperatorIndex();
            if (opindex >= OPASSIGN_OP + ADD_OP && opindex < OPASSIGN_OP + ASSIGN_OP)
                opindex -= OPASSIGN_OP;

            if (opindex >= AND_OP && opindex < AND_OP + 3) {
                /* For bit wise and/or/xor change representation.
                 */
                if (type.isOfType(Type.tUInt)) {
                    int i = ((Integer) value).intValue();
                    if (i < -1)
                        strVal = "~0x" + Integer.toHexString(-i - 1);
                    else
                        strVal = "0x" + Integer.toHexString(i);
                } else if (type.equals(Type.tLong)) {
                    long l = ((Long) value).longValue();
                    if (l < -1)
                        strVal = "~0x" + Long.toHexString(-l - 1);
                    else
                        strVal = "0x" + Long.toHexString(l);
                }
            }
        }
        if (type.isOfType(Type.tLong))
            return strVal + "L";
        if (type.isOfType(Type.tFloat)) {
            if (strVal.equals("NaN"))
                return "Float.NaN";
            if (strVal.equals("-Infinity"))
                return "Float.NEGATIVE_INFINITY";
            if (strVal.equals("Infinity"))
                return "Float.POSITIVE_INFINITY";
            return strVal + "F";
        }
        if (type.isOfType(Type.tDouble)) {
            if (strVal.equals("NaN"))
                return "Double.NaN";
            if (strVal.equals("-Infinity"))
                return "Double.NEGATIVE_INFINITY";
            if (strVal.equals("Infinity"))
                return "Double.POSITIVE_INFINITY";
            return strVal;
        }
        if (!type.isOfType(Type.tInt) && (type.getHint().equals(Type.tByte) || type.getHint().equals(Type.tShort)) && !isInitializer && !(parent instanceof StoreInstruction && parent.getOperatorIndex() != ASSIGN_OP && parent.subExpressions[1] == this)) {
            /* One of the strange things in java.  All constants
             * are int and must be explicitly casted to byte,...,short.
             * But in assignments and initializers this cast is unnecessary.
         * See JLS section 5.2
             */
            return "(" + type.getHint() + ") " + strVal;
        }

        return strVal;
    }

    public void dumpExpression(TabbedPrintWriter writer) throws java.io.IOException {
        writer.print(toString());
    }
}
