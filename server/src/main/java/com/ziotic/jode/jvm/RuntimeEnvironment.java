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
package com.ziotic.jode.jvm;

import java.lang.reflect.InvocationTargetException;

import com.ziotic.jode.bytecode.Reference;

/**
 * This interface is used by the Interpreter to actually modify objects,
 * invoke methods, etc. <br>
 * <p/>
 * The objects used in this runtime environment need not to be of the
 * real type, but can be some other type of your choice.  But some
 * mappings must be preserved, since they are used inside the
 * Interpreter:
 * <ul> <li>boolean, byte, short, char and int are mapped to Integer. </li>
 * <li> float, long, double are mapped to Float, Long, Double resp. </li>
 * <li> array of primitive type is mapped to itself (not array of Integer)</li>
 * <li> array of other types are mapped to array of mapped other type </li>
 * </ul>
 *
 * @author Jochen Hoenicke
 */
public interface RuntimeEnvironment {
    /**
     * Get the value of a field member.
     *
     * @param fieldref the Reference of the field.
     * @param obj      the object of which the field should be taken, null
     *                 if the field is static.
     * @return the field value.  Primitive types are wrapped to
     *         Object.
     * @throws InterpreterException if the field does not exists, the
     *                              object is not supported etc.
     */
    public Object getField(Reference fieldref, Object obj) throws InterpreterException;

    /**
     * Set the value of a field member.
     *
     * @param fieldref the Reference of the field.
     * @param obj      the object of which the field should be taken, null
     *                 if the field is static.
     * @param value    the field value.  Primitive types are wrapped to
     *                 Object.
     * @throws InterpreterException if the field does not exists, the
     *                              object is not supported etc.
     */
    public void putField(Reference fieldref, Object obj, Object value) throws InterpreterException;

    /**
     * Invoke a method.
     *
     * @param methodRef the reference to the method.
     * @param isVirtual true, iff the call is virtual
     * @param cls       the object on which the method should be called, null
     *                  if the method is static.
     * @param params    the params of the method.
     * @return the return value of the method.  Void type is ignored,
     *         may be null.
     * @throws InterpreterException if the field does not exists, the
     *                              object is not supported etc.
     */
    public Object invokeMethod(Reference methodRef, boolean isVirtual, Object cls, Object[] params) throws InterpreterException, InvocationTargetException;

    /**
     * Create a new instance of an object.
     *
     * @param methodRef the reference of the constructor to invoke
     * @param params    the params of the method.
     * @return the new object.
     */
    public Object invokeConstructor(Reference methodRef, Object[] params) throws InterpreterException, InvocationTargetException;

    /**
     * Check if obj is an instance of className
     *
     * @param className the type signature of the class.
     * @return true, if obj is an instance of className, false otherwise.
     */
    public boolean instanceOf(Object obj, String className) throws InterpreterException;

    /**
     * Create a new multidimensional Array.
     *
     * @param type       the type of the elements.
     * @param dimensions the size in every dimension.
     * @return the new array (this must be an array, see class comment).
     */
    public Object newArray(String type, int[] dimensions) throws InterpreterException;

    /**
     * Enter a monitor.
     *
     * @param object the object whose monitor should be taken.
     */
    public void enterMonitor(Object obj) throws InterpreterException;

    /**
     * Exit a monitor.
     *
     * @param object the object whose monitor should be freed.
     */
    public void exitMonitor(Object obj) throws InterpreterException;
}
