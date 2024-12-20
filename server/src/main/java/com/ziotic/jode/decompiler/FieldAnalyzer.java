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

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Set;

import com.ziotic.jode.bytecode.FieldInfo;
import com.ziotic.jode.expr.ConstOperator;
import com.ziotic.jode.expr.Expression;
import com.ziotic.jode.expr.OuterLocalOperator;
import com.ziotic.jode.type.Type;

public class FieldAnalyzer implements Analyzer {
    ClassAnalyzer clazz;
    ImportHandler imports;
    int modifiers;
    Type type;
    String fieldName;
    Expression constant;
    boolean isSynthetic;
    boolean isDeprecated;
    boolean analyzedSynthetic = false;

    public FieldAnalyzer(ClassAnalyzer cla, FieldInfo fd, ImportHandler i) {
        clazz = cla;
        imports = i;

        modifiers = fd.getModifiers();
        type = Type.tType(fd.getType());
        fieldName = fd.getName();
        constant = null;
        this.isSynthetic = fd.isSynthetic();
        this.isDeprecated = fd.isDeprecated();
        if (fd.getConstant() != null) {
            constant = new ConstOperator(fd.getConstant());
            constant.setType(type);
            constant.makeInitializer(type);
        }
    }

    public String getName() {
        return fieldName;
    }

    public Type getType() {
        return type;
    }

    public ClassAnalyzer getClassAnalyzer() {
        return clazz;
    }

    public Expression getConstant() {
        return constant;
    }

    public boolean isSynthetic() {
        return isSynthetic;
    }

    public boolean isFinal() {
        return Modifier.isFinal(modifiers);
    }

    public void analyzedSynthetic() {
        analyzedSynthetic = true;
    }

    public boolean setInitializer(Expression expr) {
        if (constant != null)
            return constant.equals(expr);

        /* This should check for isFinal(), but sadly, sometimes jikes
       * doesn't make a val$ field final.  I don't know when, or why,
       * so I currently ignore isFinal.
       */
        if (isSynthetic && (fieldName.startsWith("this$") || fieldName.startsWith("val$"))) {
            if (fieldName.startsWith("val$") && fieldName.length() > 4 && expr instanceof OuterLocalOperator) {
                LocalInfo li = ((OuterLocalOperator) expr).getLocalInfo();
                li.addHint(fieldName.substring(4), type);
            }
            analyzedSynthetic();
        } else
            expr.makeInitializer(type);

        constant = expr;
        return true;
    }

    public boolean setClassConstant(String clazzName) {
        if (constant != null)
            return false;
        if (clazzName.charAt(0) == '[') {
            if (clazzName.charAt(clazzName.length() - 1) == ';')
                clazzName = clazzName.substring(0, clazzName.length() - 1);

            if (fieldName.equals("array" + (clazzName.replace('[', '$').replace('.', '$')))) {
                analyzedSynthetic();
                return true;
            }
        } else {
            if (fieldName.equals("class$" + clazzName.replace('.', '$')) || fieldName.equals("class$L" + clazzName.replace('.', '$'))) {
                analyzedSynthetic();
                return true;
            }
        }
        return false;
    }

    public void analyze() {
        imports.useType(type);
    }

    public void makeDeclaration(Set done) {
        if (constant != null) {
            constant.makeDeclaration(done);
            constant = constant.simplify();
        }
    }

    public boolean skipWriting() {
        return analyzedSynthetic;
    }

    public void dumpSource(TabbedPrintWriter writer) throws IOException {
        if (isDeprecated) {
            writer.println("/**");
            writer.println(" * @deprecated");
            writer.println(" */");
        }
        if (isSynthetic)
            writer.print("/*synthetic*/ ");
        int modifiedModifiers = modifiers;
        /*
       * JLS-1.0, section 9.3:
       *
       * Every field declaration in the body of an interface is
       * implicitly public, static, and final. It is permitted, but
       * strongly discouraged as a matter of style, to redundantly
       * specify any or all of these modifiers for such fields.
       *
       * But I personally don't like this style..., move the
       * comment mark if you think different.

       if (clazz.getClazz().isInterface())
           modifiedModifiers &= ~(Modifier.PUBLIC
                      | Modifier.STATIC
                      | Modifier.FINAL);
       */
        writer.startOp(writer.NO_PAREN, 0);
        String modif = Modifier.toString(modifiedModifiers);
        if (modif.length() > 0)
            writer.print(modif + " ");

        writer.printType(type);
        writer.print(" " + fieldName);
        if (constant != null) {
            writer.breakOp();
            writer.print(" = ");
            constant.dumpExpression(writer.IMPL_PAREN, writer);
        }
        writer.endOp();
        writer.println(";");
    }

    public String toString() {
        return getClass().getName() + "[" + clazz.getClazz() + "." + getName() + "]";
    }
}
