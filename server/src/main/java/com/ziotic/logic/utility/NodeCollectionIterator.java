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
package com.ziotic.logic.utility;

import java.util.Iterator;

import com.ziotic.logic.Node;

/**
 * @author Lazaro
 */
public class NodeCollectionIterator<N extends Node> implements Iterator<N> {
    private Integer[] indexes;
    private NodeCollection<N> nodeCollection;
    private int position = 0;

    public NodeCollectionIterator(NodeCollection<N> nodeList) {
        this.nodeCollection = nodeList;
        //synchronized (nodeList) {
        this.indexes = nodeList.getIndexes().toArray(new Integer[0]);
        //}
    }

    public boolean hasNext() {
        return position != indexes.length;
    }

    @SuppressWarnings("unchecked")
    public N next() {
        while (true) {
            if (position < indexes.length) {
                Node n = nodeCollection.get(indexes[position++]);
                if (n == null) {
                    continue;
                }
                return (N) n;
            }
            return null;
        }
    }

    public void remove() {
        nodeCollection.remove(indexes[position - 1]);
    }
}
