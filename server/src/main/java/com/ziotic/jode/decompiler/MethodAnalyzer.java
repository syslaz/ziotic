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
import java.util.*;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.bytecode.*;
import com.ziotic.jode.expr.*;
import com.ziotic.jode.flow.FlowBlock;
import com.ziotic.jode.flow.Jump;
import com.ziotic.jode.flow.StructuredBlock;
import com.ziotic.jode.flow.TransformExceptionHandlers;
import com.ziotic.jode.jvm.CodeVerifier;
import com.ziotic.jode.jvm.SyntheticAnalyzer;
import com.ziotic.jode.jvm.VerifyException;
import com.ziotic.jode.type.MethodType;
import com.ziotic.jode.type.Type;

/**
 * A method analyzer is the main class for analyzation of methods.
 * There is exactly one MethodAnalyzer object for each method (even
 * for abstract methods), that should be decompiled.
 * <p/>
 * Method analyzation is done in three passes:
 * <dl>
 * <dt><code>analyze()</code></dt>
 * <dd>the main analyzation, decompiles the code of the method</dd>
 * <dt><code>analyzeInners()</code></dt>
 * <dd>This will analyze method scopes classes by calling their
 * <code>analyze()</code> and <code>analyzeInners()</code>
 * methods.</dd>
 * <dt><code>makeDeclaration()</code></dt>
 * <dd>This will determine when to declare variables. For constructors
 * it will do special transformations like field initialization.</dd>
 */
public class MethodAnalyzer implements Scope, ClassDeclarer {
    /**
     * The minimal visible complexity.
     */
    private static double STEP_COMPLEXITY = 0.01;
    /**
     * The value of the strictfp modifier.
     * JDK1.1 doesn't define it.
     */
    private static int STRICTFP = 0x800;
    /**
     * The import handler where we should register our types.
     */
    ImportHandler imports;
    /**
     * The class analyzer of the class that contains this method.
     */
    ClassAnalyzer classAnalyzer;
    /**
     * The method info structure for this method.
     */
    MethodInfo minfo;
    /**
     * This is the bytecode info structure, or null if this method has
     * no code (abstract or native).
     */
    BytecodeInfo code;

    /**
     * The method name.
     */
    String methodName;
    /**
     * The type of this method (parameter types + return type).
     */
    MethodType methodType;
    /**
     * True, iff this method is a constructor, i.e. methodName == <(cl)?init>
     */
    boolean isConstructor;

    /**
     * The exceptions this method may throw.
     */
    Type[] exceptions;

    /**
     * If the method is synthetic (access$, class$, etc.), this is the
     * synthetic analyzer describing the function of this method, otherwise
     * this is null.
     */
    SyntheticAnalyzer synth;

    /**
     * This is the first flow block of the method code.  If this
     * method has no code, this is null.  This is initialized at the
     * end of the <code>analyze()</code> phase.
     */
    FlowBlock methodHeader;
    /**
     * A list of all locals contained in this method.
     */
    Vector allLocals = new Vector();

    /**
     * This array contains the locals in the parameter list, including
     * the implicit <i>this</i> parameter for nonstatic methods.
     */
    LocalInfo[] param;
    /**
     * The local variable table containing info about names and types of
     * locals.
     */
    LocalVariableTable lvt;

    /**
     * If this method is the special constructor, that is generated
     * by jikes (constructor$xx), this points to the real constructor.
     * If this is the real constructor and calls a constructor$xx, it
     * points to this. Otherwise this is null.
     */
    MethodAnalyzer jikesConstructor;
    /**
     * True, iff this method is the special constructor, and its first
     * parameter is a reference to the outer class.
     */
    boolean hasJikesOuterValue;
    /**
     * True, iff this method is an anonymous constructor, that is
     * omitted even if it has parameters.
     */
    boolean isAnonymousConstructor;
    /**
     * True, if this method is the special block$ method generated by jikes
     * to initialize field members.
     */
    boolean isJikesBlockInitializer;

    /**
     * This list contains the InvokeOperator objects in the code of
     * this method, that create method scoped classes.
     */
    Vector anonConstructors = new Vector();

    /**
     * This list contains the class analyzers of all method scoped
     * classes that should be declared in this method or in a class
     * that is declared in this method.
     */
    Vector innerAnalyzers;
    /**
     * This list contains the class analyzers of all method scoped
     * classes that are used in this method.
     */
    Collection usedAnalyzers;

    /**
     * This is the default constructor.
     *
     * @param cla     the ClassAnalyzer of the class that contains this method.
     * @param minfo   the method info structure for this method.
     * @param imports the import handler that should be informed about types.
     */
    public MethodAnalyzer(ClassAnalyzer cla, MethodInfo minfo, ImportHandler imports) {
        this.classAnalyzer = cla;
        this.imports = imports;
        this.minfo = minfo;
        this.methodName = minfo.getName();
        this.methodType = Type.tMethod(minfo.getType());
        this.isConstructor = methodName.equals("<init>") || methodName.equals("<clinit>");

        if (minfo.getBytecode() != null) {
            code = minfo.getBytecode();
        }
        String[] excattr = minfo.getExceptions();
        if (excattr == null) {
            exceptions = new Type[0];
        } else {
            int excCount = excattr.length;
            this.exceptions = new Type[excCount];
            for (int i = 0; i < excCount; i++)
                exceptions[i] = Type.tClass(excattr[i]);
        }
        if (minfo.isSynthetic() || methodName.indexOf('$') != -1)
            synth = new SyntheticAnalyzer(minfo, true);
    }

    /**
     * Returns the name of this method.
     */
    public String getName() {
        return methodName;
    }

    /**
     * Returns the type of this method.
     *
     * @return the type of this method.
     */
    public MethodType getType() {
        return methodType;
    }

    /**
     * Returns the first flow block of the code.
     *
     * @return the first flow block of the code.
     */
    public FlowBlock getMethodHeader() {
        return methodHeader;
    }

    /**
     * Returns the bytecode info for this method.
     *
     * @return the bytecode info for this method, or null if it is
     *         abstract or native.
     */
    public final BytecodeInfo getBytecodeInfo() {
        return code;
    }

    /**
     * Returns the import handler. The import handler should be informed
     * about all types we (or an expression in this method) use, so that
     * the corresponding class can be imported.
     *
     * @return the import handler.
     */
    public final ImportHandler getImportHandler() {
        return imports;
    }

    /**
     * Registers a type at the import handler.  This should be called
     * if an expression needs to print the type name to the code.  The
     * corresponding class will be imported in that case (if used
     * often enough).
     *
     * @param type the type that should be registered.
     */
    public final void useType(Type type) {
        imports.useType(type);
    }

    /**
     * Inserts a structured block to the beginning of the method.
     * This is called by transform constructors, to move the super
     * call from the real constructor to the constructor$xx method
     * (the jikes constructor).
     *
     * @param insertBlock the structured block that should be inserted.
     */
    public void insertStructuredBlock(StructuredBlock insertBlock) {
        if (methodHeader != null) {
            insertBlock.setJump(new Jump(FlowBlock.NEXT_BY_ADDR));
            FlowBlock insertFlowBlock = new FlowBlock(this, 0);
            insertFlowBlock.appendBlock(insertBlock, 0);
            insertFlowBlock.setNextByAddr(methodHeader);
            insertFlowBlock.doT2(methodHeader);
            methodHeader = insertFlowBlock;
        } else {
            throw new IllegalStateException();
        }
    }

    /**
     * Checks if this method is a constructor, i.e. getName() returns
     * "<init>" or "<clinit>".
     *
     * @return true, iff this method is a real constructor.
     */
    public final boolean isConstructor() {
        return isConstructor;
    }

    /**
     * Checks if this method is static.
     *
     * @return true, iff this method is static.
     */
    public final boolean isStatic() {
        return minfo.isStatic();
    }

    /**
     * Checks if this method is synthetic, i.e. a synthetic attribute is
     * present.
     *
     * @return true, iff this method is synthetic.
     */
    public final boolean isSynthetic() {
        return minfo.isSynthetic();
    }

    /**
     * Checks if this method is strictfp
     *
     * @return true, iff this method is synthetic.
     */
    public final boolean isStrictFP() {
        return (minfo.getModifiers() & STRICTFP) != 0;
    }

    /**
     * Tells if this method is the constructor$xx method generated by jikes.
     *
     * @param value true, iff this method is the jikes constructor.
     */
    public final void setJikesConstructor(MethodAnalyzer realConstr) {
        jikesConstructor = realConstr;
    }

    /**
     * Tells if this method is the block$xx method generated by jikes.
     *
     * @param value true, iff this method is the jikes block initializer.
     */
    public final void setJikesBlockInitializer(boolean value) {
        isJikesBlockInitializer = value;
    }

    /**
     * Tells if this (constructor$xx) method has as first (implicit)
     * parameter the instance of the outer class.
     *
     * @param value true, this method has the implicit parameter.
     */
    public final void setHasOuterValue(boolean value) {
        hasJikesOuterValue = value;
    }

    /**
     * Tells if this constructor can be omited, since it is implicit.
     *
     * @param value true, this method is the implicit constructor.
     */
    public final void setAnonymousConstructor(boolean value) {
        isAnonymousConstructor = value;
    }

    /**
     * Checks if this constructor can be omited, since it is implicit.
     *
     * @return true, this method is the implicit constructor.
     */
    public final boolean isAnonymousConstructor() {
        return isAnonymousConstructor;
    }

    /**
     * Get the synthetic analyzer for this method.
     *
     * @return the synthetic analyzer, or null if this method isn't
     *         synthetic.
     */
    public final SyntheticAnalyzer getSynthetic() {
        return synth;
    }

    /**
     * Get the return type of this method.
     */
    public Type getReturnType() {
        return methodType.getReturnType();
    }

    /**
     * Get the class analyzer for the class containing this method.
     */
    public ClassAnalyzer getClassAnalyzer() {
        return classAnalyzer;
    }

    /**
     * Get the class info for the class containing this method.
     */
    public ClassInfo getClazz() {
        return classAnalyzer.clazz;
    }

    /**
     * Get the local info for a parameter.  This call is valid after
     * the analyze pass.
     *
     * @param nr the index of the parameter (start by zero and
     *           count the implicit this param for nonstatic method).
     * @return the local info for the specified parameter.
     * @see #getLocalInfo
     */
    public final LocalInfo getParamInfo(int nr) {
        return param[nr];
    }

    /**
     * Return the number of parameters for this method. This call is
     * valid after the analyze pass.
     */
    public final int getParamCount() {
        return param.length;
    }

    /**
     * Create a local info for a local variable located at an
     * instruction with the given address.
     *
     * @param addr the address of the instruction using this local.
     *             the address of the next instruction for stores.
     * @param slot the slot, the local variable uses.
     * @return a new local info representing that local.
     */
    public LocalInfo getLocalInfo(int addr, int slot) {
        LocalInfo li = new LocalInfo(this, slot);
        if (lvt != null) {
            LocalVarEntry entry = lvt.getLocal(slot, addr);
            if (entry != null)
                li.addHint(entry.getName(), entry.getType());
        }
        allLocals.addElement(li);
        return li;
    }

    /**
     * Gets the complexity of this class.  Must be called after it has
     * been initialized.  This is used for a nice progress bar.
     */
    public double getComplexity() {
        if (code == null)
            return 0.0;
        else
            return code.getInstructions().size();
    }

    /**
     * Analyzes the code of this method.  This creates the
     * flow blocks (including methodHeader) and analyzes them.
     */
    private void analyzeCode(ProgressListener pl, double done, double scale) {
        int instrsPerStep = Integer.MAX_VALUE;
        if (GlobalOptions.verboseLevel > 0)
            GlobalOptions.err.print(methodName + ": ");

        if (pl != null) {
            instrsPerStep = (int) ((code.getInstructions().size() * STEP_COMPLEXITY) / (scale * 0.9));
        }

        /* The adjacent analyzation relies on this */
        DeadCodeAnalysis.removeDeadCode(code);
        Handler[] handlers = code.getExceptionHandlers();
        int returnCount;
        TransformExceptionHandlers excHandlers;
        {
            /* First create a FlowBlock for every block that has a
            * predecessor other than the previous instruction.
            */
            for (Iterator i = code.getInstructions().iterator(); i.hasNext(); ) {
                Instruction instr = (Instruction) i.next();
                if (instr.getPrevByAddr() == null || instr.getPrevByAddr().doesAlwaysJump() || instr.getPreds() != null)
                    instr.setTmpInfo(new FlowBlock(this, instr.getAddr()));
            }

            for (int i = 0; i < handlers.length; i++) {
                Instruction instr = handlers[i].start;
                if (instr.getTmpInfo() == null)
                    instr.setTmpInfo(new FlowBlock(this, instr.getAddr()));
                /* end doesn't have a predecessor, but we must prevent
             * it from being merged with the previous instructions.
             */
                instr = handlers[i].end.getNextByAddr();
                if (instr.getTmpInfo() == null)
                    instr.setTmpInfo(new FlowBlock(this, instr.getAddr()));
                instr = handlers[i].catcher;
                if (instr.getTmpInfo() == null)
                    instr.setTmpInfo(new FlowBlock(this, instr.getAddr()));
            }

            /* While we read the opcodes into FlowBlocks
             * we try to combine sequential blocks, as soon as we
             * find two sequential instructions in a row, where the
             * second has no predecessors.
             */
            int mark = 1000;
            int count = 0;
            FlowBlock lastBlock = null;
            boolean lastSequential = false;
            for (Iterator i = code.getInstructions().iterator(); i.hasNext(); ) {
                Instruction instr = (Instruction) i.next();

                com.ziotic.jode.flow.StructuredBlock block = Opcodes.readOpcode(instr, this);

                if (GlobalOptions.verboseLevel > 0 && instr.getAddr() > mark) {
                    GlobalOptions.err.print('.');
                    mark += 1000;
                }
                if (++count >= instrsPerStep) {
                    done += count * scale / code.getInstructions().size();
                    pl.updateProgress(done, methodName);
                    count = 0;
                }

                if (lastSequential && instr.getTmpInfo() == null
                        /* Only merge with previous block, if this is sequential,
                   * too.
                   * Why?  appendBlock only handles sequential blocks.
                   */ && !instr.doesAlwaysJump() && instr.getSuccs() == null) {

                    lastBlock.appendBlock(block, instr.getLength());
                } else {

                    if (instr.getTmpInfo() == null)
                        instr.setTmpInfo(new FlowBlock(this, instr.getAddr()));
                    FlowBlock flowBlock = (FlowBlock) instr.getTmpInfo();
                    flowBlock.appendBlock(block, instr.getLength());

                    if (lastBlock != null)
                        lastBlock.setNextByAddr(flowBlock);

                    instr.setTmpInfo(lastBlock = flowBlock);
                    lastSequential = !instr.doesAlwaysJump() && instr.getSuccs() == null;
                }
            }

            methodHeader = (FlowBlock) ((Instruction) code.getInstructions().get(0)).getTmpInfo();
            excHandlers = new TransformExceptionHandlers();
            for (int i = 0; i < handlers.length; i++) {
                Type type = null;
                FlowBlock start = (FlowBlock) handlers[i].start.getTmpInfo();
                int endAddr = handlers[i].end.getNextByAddr().getAddr();
                FlowBlock handler = (FlowBlock) handlers[i].catcher.getTmpInfo();
                if (handlers[i].type != null)
                    type = Type.tClass(handlers[i].type);

                excHandlers.addHandler(start, endAddr, handler, type);
            }
        }
        for (Iterator i = code.getInstructions().iterator(); i.hasNext(); ) {
            Instruction instr = (Instruction) i.next();
            instr.setTmpInfo(null);
        }

        if (GlobalOptions.verboseLevel > 0)
            GlobalOptions.err.print('-');

        excHandlers.analyze();
        methodHeader.analyze();

        if ((Options.options & Options.OPTION_PUSH) == 0 && methodHeader.mapStackToLocal())
            methodHeader.removePush();
        if ((Options.options & Options.OPTION_ONETIME) != 0)
            methodHeader.removeOnetimeLocals();

        methodHeader.mergeParams(param);

        if (GlobalOptions.verboseLevel > 0)
            GlobalOptions.err.println("");
        if (pl != null) {
            done += 0.1 * scale;
            pl.updateProgress(done, methodName);
        }
    }

    /**
     * This is the first pass of the analyzation.  It will analyze the
     * code of this method, but not the method scoped classes.
     */
    public void analyze(ProgressListener pl, double done, double scale) throws ClassFormatError {
        if (pl != null)
            pl.updateProgress(done, methodName);
        if (code != null) {
            if ((Options.options & Options.OPTION_VERIFY) != 0) {
                CodeVerifier verifier = new CodeVerifier(getClazz(), minfo, code);
                try {
                    verifier.verify();
                } catch (VerifyException ex) {
                    ex.printStackTrace(GlobalOptions.err);
                    throw new com.ziotic.jode.AssertError("Verification error");
                }
            }

            if ((Options.options & Options.OPTION_LVT) != 0) {
                LocalVariableInfo[] localvars = code.getLocalVariableTable();
                if (localvars != null)
                    lvt = new LocalVariableTable(code.getMaxLocals(), localvars);
            }
        }

        Type[] paramTypes = getType().getParameterTypes();
        int paramCount = (isStatic() ? 0 : 1) + paramTypes.length;
        param = new LocalInfo[paramCount];

        int offset = 0;
        int slot = 0;
        if (!isStatic()) {
            ClassInfo classInfo = classAnalyzer.getClazz();
            LocalInfo thisLocal = getLocalInfo(0, slot++);
            thisLocal.setExpression(new ThisOperator(classInfo, true));
            param[offset++] = thisLocal;
        }

        for (int i = 0; i < paramTypes.length; i++) {
            param[offset] = getLocalInfo(0, slot);
            param[offset].setType(paramTypes[i]);
            slot += paramTypes[i].stackSize();
            offset++;
        }

        for (int i = 0; i < exceptions.length; i++)
            imports.useType(exceptions[i]);

        if (!isConstructor)
            imports.useType(methodType.getReturnType());

        if (code != null)
            analyzeCode(pl, done, scale);
    }

    /**
     * This is the second pass of the analyzation.  It will analyze
     * the method scoped classes.
     */
    public void analyzeInnerClasses() throws ClassFormatError {
        int serialnr = 0;
        Enumeration elts = anonConstructors.elements();
        while (elts.hasMoreElements()) {
            InvokeOperator cop = (InvokeOperator) elts.nextElement();
            analyzeInvokeOperator(cop);
        }
    }

    /**
     * This is the third and last pass of the analyzation.  It will analyze
     * the types and names of the local variables and where to declare them.
     * It will also determine where to declare method scoped local variables.
     */
    public void makeDeclaration(Set done) {
        if (innerAnalyzers != null) {
            for (Enumeration enum_ = innerAnalyzers.elements(); enum_.hasMoreElements(); ) {
                ClassAnalyzer classAna = (ClassAnalyzer) enum_.nextElement();
                if (classAna.getParent() == this) {
                    OuterValues innerOV = classAna.getOuterValues();
                    for (int i = 0; i < innerOV.getCount(); i++) {
                        Expression value = innerOV.getValue(i);
                        if (value instanceof OuterLocalOperator) {
                            LocalInfo li = ((OuterLocalOperator) value).getLocalInfo();
                            if (li.getMethodAnalyzer() == this)
                                li.markFinal();
                        }
                    }
                }
            }
        }

        for (Enumeration enum_ = allLocals.elements(); enum_.hasMoreElements(); ) {
            LocalInfo li = (LocalInfo) enum_.nextElement();
            if (!li.isShadow())
                imports.useType(li.getType());
        }
        for (int i = 0; i < param.length; i++) {
            param[i].guessName();
            Iterator doneIter = done.iterator();
            while (doneIter.hasNext()) {
                Declarable previous = (Declarable) doneIter.next();
                if (param[i].getName().equals(previous.getName())) {
                    /* A name conflict happened. */
                    param[i].makeNameUnique();
                    break;
                }
            }
            done.add(param[i]);
        }

        if (code != null) {
            methodHeader.makeDeclaration(done);
            methodHeader.simplify();
        }
        for (int i = 0; i < param.length; i++) {
            done.remove(param[i]);
            // remove the parameters, since we leave the scope
        }
    }

    /**
     * Tells if this method is synthetic or implicit or something else, so
     * that it doesn't have to be written to the source code.
     *
     * @return true, iff it shouldn't be written to the source code.
     */
    public boolean skipWriting() {
        if (synth != null) {
            // We don't need this class anymore (hopefully?)
            if (synth.getKind() == synth.GETCLASS)
                return true;
            if (synth.getKind() >= synth.ACCESSGETFIELD && synth.getKind() <= synth.ACCESSDUPPUTSTATIC && (Options.options & Options.OPTION_INNER) != 0 && (Options.options & Options.OPTION_ANON) != 0)
                return true;
        }

        if (jikesConstructor == this) {
            // This is the first empty part of a jikes constructor
            return true;
        }

        boolean declareAsConstructor = isConstructor;
        int skipParams = 0;
        if (isConstructor() && !isStatic() && classAnalyzer.outerValues != null)
            skipParams = classAnalyzer.outerValues.getCount();

        if (jikesConstructor != null) {
            // This is the real part of a jikes constructor
            declareAsConstructor = true;
            skipParams = hasJikesOuterValue && classAnalyzer.outerValues.getCount() > 0 ? 1 : 0;
        }

        if (isJikesBlockInitializer)
            return true;

        /* The default constructor must be empty
       * and mustn't throw exceptions */
        if (getMethodHeader() == null || !(getMethodHeader().getBlock() instanceof com.ziotic.jode.flow.EmptyBlock) || !getMethodHeader().hasNoJumps() || exceptions.length > 0)
            return false;

        if (declareAsConstructor
                /* The access rights of default constructor should
             * be public, iff the class is public, otherwise package.
             * But this rule doesn't necessarily apply for anonymous
             * classes...
             */ && ((minfo.getModifiers() & (Modifier.PROTECTED | Modifier.PUBLIC | Modifier.PRIVATE | Modifier.SYNCHRONIZED | Modifier.STATIC | Modifier.ABSTRACT | Modifier.NATIVE)) == (getClassAnalyzer().getModifiers() & (Modifier.PROTECTED | Modifier.PUBLIC)) || classAnalyzer.getName() == null) && classAnalyzer.constructors.length == 1) {

            // If the constructor doesn't take parameters (except outerValues)
            // or if it is the anonymous constructor it can be removed.
            if (methodType.getParameterTypes().length == skipParams || isAnonymousConstructor)
                return true;
        }

        if (isConstructor() && isStatic())
            return true;

        return false;
    }

    /**
     * Dumps the source code for this method to the specified writer.
     *
     * @param writer the tabbed print writer the code should be written to.
     * @throws IOException, if writer throws an exception.
     */
    public void dumpSource(TabbedPrintWriter writer) throws IOException {
        boolean declareAsConstructor = isConstructor;
        int skipParams = 0;
        int modifiedModifiers = minfo.getModifiers();

        if (isConstructor() && !isStatic() && (Options.options & Options.OPTION_CONTRAFO) != 0 && classAnalyzer.outerValues != null)
            skipParams = classAnalyzer.outerValues.getCount();

        if (jikesConstructor != null) {
            // This is the real part of a jikes constructor
            declareAsConstructor = true;
            skipParams = hasJikesOuterValue && classAnalyzer.outerValues.getCount() > 0 ? 1 : 0;
            // get the modifiers of the real constructor
            modifiedModifiers = jikesConstructor.minfo.getModifiers();
        }

        if (minfo.isDeprecated()) {
            writer.println("/**");
            writer.println(" * @deprecated");
            writer.println(" */");
        }

        writer.pushScope(this);

        /*
       * JLS-1.0, section 9.4:
       *
       * For compatibility with older versions of Java, it is
       * permitted but discouraged, as a matter of style, to
       * redundantly specify the abstract modifier for methods
       * declared in interfaces.
       *
       * Every method declaration in the body of an interface is
       * implicitly public. It is permitted, but strongly
       * discouraged as a matter of style, to redundantly specify
       * the public modifier for interface methods.  We don't
       * follow this second rule and mark this method explicitly
       * as public.
       */
        if (classAnalyzer.getClazz().isInterface())
            modifiedModifiers &= ~Modifier.ABSTRACT;

        /* Don't ask me why, but jikes declares the static constructor
       * as final.  Another compiler or obfuscator seems to declare
       * it as public.  I remove every fancy modifier, now.
       */
        if (isConstructor() && isStatic())
            modifiedModifiers &= ~(Modifier.FINAL | Modifier.PUBLIC | Modifier.PROTECTED | Modifier.PRIVATE);
        modifiedModifiers &= ~STRICTFP;

        writer.startOp(writer.NO_PAREN, 1);
        String delim = "";
        if (minfo.isSynthetic()) {
            writer.print("/*synthetic*/");
            delim = " ";
        }

        String modif = Modifier.toString(modifiedModifiers);
        if (modif.length() > 0) {
            writer.print(delim + modif);
            delim = " ";
        }
        if (isStrictFP()) {
            /* The STRICTFP modifier is set.
            * We handle it, since java.lang.reflect.Modifier is too dumb.
            */

            /* If STRICTFP is already set for class don't set it for method.
            * And don't set STRICTFP for native methods or constructors.
            */
            if (!classAnalyzer.isStrictFP() && !isConstructor() && (modifiedModifiers & Modifier.NATIVE) == 0) {
                writer.print(delim + "strictfp");
                delim = " ";
            }
        }

        if (isConstructor && (isStatic() || (classAnalyzer.getName() == null && skipParams == methodType.getParameterTypes().length))) {
            /* static block or unnamed constructor */
        } else {
            writer.print(delim);
            if (declareAsConstructor)
                writer.print(classAnalyzer.getName());
            else {
                writer.printType(getReturnType());
                writer.print(" " + methodName);
            }
            writer.breakOp();
            if ((Options.outputStyle & Options.GNU_SPACING) != 0)
                writer.print(" ");
            writer.print("(");
            writer.startOp(writer.EXPL_PAREN, 0);
            int offset = skipParams + (isStatic() ? 0 : 1);
            for (int i = offset; i < param.length; i++) {
                if (i > offset) {
                    writer.print(", ");
                    writer.breakOp();
                }
                param[i].dumpDeclaration(writer);
            }
            writer.endOp();
            writer.print(")");
        }
        if (exceptions.length > 0) {
            writer.breakOp();
            writer.print(" throws ");
            writer.startOp(writer.EXPL_PAREN, 2);
            for (int i = 0; i < exceptions.length; i++) {
                if (i > 0) {
                    writer.print(",");
                    writer.breakOp();
                    writer.print(" ");
                }
                writer.printType(exceptions[i]);
            }
            writer.endOp();
        }
        writer.endOp();
        if (code != null) {
            writer.openBraceNoIndent();
            writer.tab();
            methodHeader.dumpSource(writer);
            writer.untab();
            writer.closeBraceNoIndent();
        } else
            writer.println(";");
        writer.popScope();
    }

    /**
     * Checks if the variable set contains a local with the given name.
     *
     * @return the local info the has the given name, or null if it doesn't
     *         exists.
     */
    public LocalInfo findLocal(String name) {
        Enumeration enum_ = allLocals.elements();
        while (enum_.hasMoreElements()) {
            LocalInfo li = (LocalInfo) enum_.nextElement();
            if (li.getName().equals(name))
                return li;
        }
        return null;
    }

    /**
     * Checks if a method scoped class with the given name exists in this
     * method (not in a parent method).
     *
     * @return the class analyzer with the given name, or null if it
     *         doesn' exists.
     */
    public ClassAnalyzer findAnonClass(String name) {
        if (innerAnalyzers != null) {
            Enumeration enum_ = innerAnalyzers.elements();
            while (enum_.hasMoreElements()) {
                ClassAnalyzer classAna = (ClassAnalyzer) enum_.nextElement();
                if (classAna.getParent() == this && classAna.getName() != null && classAna.getName().equals(name)) {
                    return classAna;
                }
            }
        }
        return null;
    }

    /**
     * Checks if the specified object lies in this scope.
     *
     * @param obj       the object.
     * @param scopeType the type of this object.
     */
    public boolean isScopeOf(Object obj, int scopeType) {
        if (scopeType == METHODSCOPE && obj instanceof ClassInfo) {
            ClassAnalyzer ana = getClassAnalyzer((ClassInfo) obj);
            if (ana != null)
                return ana.getParent() == this;
        }
        return false;
    }

    /**
     * Checks if the specified name conflicts with an object in this scope.
     *
     * @param name      the name to check.
     * @param scopeType the usage type of this name, AMBIGUOUSNAME if it is
     *                  ambiguous.
     */
    public boolean conflicts(String name, int usageType) {
        if (usageType == AMBIGUOUSNAME || usageType == LOCALNAME)
            return findLocal(name) != null;
        if (usageType == AMBIGUOUSNAME || usageType == CLASSNAME)
            return findAnonClass(name) != null;
        return false;
    }

    /**
     * Gets the parent scope, i.e. the class analyzer for the class containing
     * this method.
     *
     * @XXX needed?
     */
    public ClassDeclarer getParent() {
        return getClassAnalyzer();
    }

    /**
     * Registers an anonymous constructor invokation.  This should be called
     * in the analyze or analyzeInner pass by invoke subexpressions.
     *
     * @param cop the constructor invokation, that creates the method scoped
     *            class.
     */
    public void addAnonymousConstructor(InvokeOperator cop) {
        anonConstructors.addElement(cop);
    }

    public void analyzeInvokeOperator(InvokeOperator cop) {
        ClassInfo clazz = (ClassInfo) cop.getClassInfo();
        ClassAnalyzer anonAnalyzer = getParent().getClassAnalyzer(clazz);

        if (anonAnalyzer == null) {
            /* Create a new outerValues array corresponding to the
            * first constructor invocation.
            */
            Expression[] outerValueArray;
            Expression[] subExprs = cop.getSubExpressions();
            outerValueArray = new Expression[subExprs.length - 1];

            for (int j = 0; j < outerValueArray.length; j++) {
                Expression expr = subExprs[j + 1].simplify();
                if (expr instanceof CheckNullOperator)
                    expr = ((CheckNullOperator) expr).getSubExpressions()[0];
                if (expr instanceof ThisOperator) {
                    outerValueArray[j] = new ThisOperator(((ThisOperator) expr).getClassInfo());
                    continue;
                }
                LocalInfo li = null;
                if (expr instanceof LocalLoadOperator) {
                    li = ((LocalLoadOperator) expr).getLocalInfo();
                    if (!li.isConstant())
                        li = null;
                }
                if (expr instanceof OuterLocalOperator)
                    li = ((OuterLocalOperator) expr).getLocalInfo();

                if (li != null) {
                    outerValueArray[j] = new OuterLocalOperator(li);
                    continue;
                }

                Expression[] newOuter = new Expression[j];
                System.arraycopy(outerValueArray, 0, newOuter, 0, j);
                outerValueArray = newOuter;
                break;
            }
            anonAnalyzer = new ClassAnalyzer(this, clazz, imports, outerValueArray);
            addClassAnalyzer(anonAnalyzer);
            anonAnalyzer.initialize();
            anonAnalyzer.analyze(null, 0.0, 0.0);
            anonAnalyzer.analyzeInnerClasses(null, 0.0, 0.0);
        } else {
            /*
            * Get the previously created outerValues and
            * its length.
            */
            OuterValues outerValues = anonAnalyzer.getOuterValues();
            /*
            * Merge the other constructor invocation and
            * possibly shrink outerValues array.
            */
            Expression[] subExprs = cop.getSubExpressions();
            for (int j = 0; j < outerValues.getCount(); j++) {
                if (j + 1 < subExprs.length) {
                    Expression expr = subExprs[j + 1].simplify();
                    if (expr instanceof CheckNullOperator)
                        expr = ((CheckNullOperator) expr).getSubExpressions()[0];

                    if (outerValues.unifyOuterValues(j, expr))
                        continue;
                }
                outerValues.setCount(j);
                break;
            }
        }

        if (usedAnalyzers == null)
            usedAnalyzers = new ArrayList();
        usedAnalyzers.add(anonAnalyzer);
    }

    /**
     * Get the class analyzer for the given class info.  This searches
     * the method scoped/anonymous classes in this method and all
     * outer methods and the outer classes for the class analyzer.
     *
     * @param cinfo the classinfo for which the analyzer is searched.
     * @return the class analyzer, or null if there is not an outer
     *         class that equals cinfo, and not a method scope/inner class in
     *         an outer method.
     */
    public ClassAnalyzer getClassAnalyzer(ClassInfo cinfo) {
        if (innerAnalyzers != null) {
            Enumeration enum_ = innerAnalyzers.elements();
            while (enum_.hasMoreElements()) {
                ClassAnalyzer classAna = (ClassAnalyzer) enum_.nextElement();
                if (classAna.getClazz().equals(cinfo)) {
                    if (classAna.getParent() != this) {
                        ClassDeclarer declarer = classAna.getParent();
                        while (declarer != this) {
                            if (declarer instanceof MethodAnalyzer)
                                ((MethodAnalyzer) declarer).innerAnalyzers.removeElement(classAna);
                            declarer = declarer.getParent();
                        }
                        classAna.setParent(this);
                    }
                    return classAna;
                }
            }
        }
        return getParent().getClassAnalyzer(cinfo);
    }

    public void addClassAnalyzer(ClassAnalyzer clazzAna) {
        if (innerAnalyzers == null)
            innerAnalyzers = new Vector();
        innerAnalyzers.addElement(clazzAna);
        getParent().addClassAnalyzer(clazzAna);
    }

    /**
     * We add the named method scoped classes to the declarables.
     */
    public void fillDeclarables(Collection used) {
        if (usedAnalyzers != null)
            used.addAll(usedAnalyzers);
        if (innerAnalyzers != null) {
            Enumeration enum_ = innerAnalyzers.elements();
            while (enum_.hasMoreElements()) {
                ClassAnalyzer classAna = (ClassAnalyzer) enum_.nextElement();
                if (classAna.getParent() == this)
                    classAna.fillDeclarables(used);
            }
        }
    }

    public boolean isMoreOuterThan(ClassDeclarer declarer) {
        ClassDeclarer ancestor = declarer;
        while (ancestor != null) {
            if (ancestor == this)
                return true;
            ancestor = ancestor.getParent();
        }
        return false;
    }

    public String toString() {
        return getClass().getName() + "[" + getClazz() + "." + getName() + "]";
    }
}
