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
package com.ziotic.logic.map;

import java.util.Iterator;

/**
 * @author Lazaro
 */
public class PathBuffer implements Iterable<Tile> {
    private class PathQueueIterator implements Iterator<Tile> {
        private PathBuffer buffer;
        private int position = 0;

        public PathQueueIterator(PathBuffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public boolean hasNext() {
            return position < buffer.size;
        }

        @Override
        public Tile next() {
            return buffer.path[position++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Can't remove a specific tile from a path buffer!");
        }
    }

    public static final int MAX_SIZE = 128;

    private Tile[] path = new Tile[MAX_SIZE];
    private int addPos = 0;
    public int getPos = 0;
    public int size = 0;

    private int markedPosition = 0;

    public void mark() {
        markedPosition = addPos;
    }

    public void reset() {
        size -= addPos - markedPosition;
        addPos = markedPosition;
        getPos = 0;
    }

    public void clear() {
        addPos = getPos = size = markedPosition = 0;
        for (int i = 0; i < path.length; i++) {
            path[i] = null;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public boolean isMarked() {
        return markedPosition != 0;
    }

    public boolean add(Tile tile) {
        if (size >= MAX_SIZE) {
            return false;
        }
        for (int i = addPos - 1; i >= markedPosition; i--) {
            Tile t = path[i];
            if (t == null) {
                continue;
            } else if (t.equals(tile)) {
                size -= addPos - i;
                addPos = i;
            }
        }
        path[addPos++] = tile;
        size++;
        return true;
    }

    public Tile getFirst() {
        return path[0];
    }

    public Tile getLast() {
        if (size <= 0) {
            return null;
        }
        return path[size - 1];
    }

    public Tile peek() {
        return path[getPos];
    }

    public Tile next() {
        return path[getPos++];
    }

    public int remaining() {
        return size - getPos;
    }

    @Override
    public Iterator<Tile> iterator() {
        return new PathQueueIterator(this);
    }
}
