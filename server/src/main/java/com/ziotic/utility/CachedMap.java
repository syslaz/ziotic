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
package com.ziotic.utility;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Lazaro
 */
public class CachedMap<K, V> extends TreeMap<K, V> {
    private static final long serialVersionUID = -972646765794714920L;

    public static final int DEFAULT_MAX_SIZE = 256;

    private int maxSize;

    public CachedMap() {
        this(DEFAULT_MAX_SIZE);
    }

    public CachedMap(int maxSize) {
        this(maxSize, null);
    }

    public CachedMap(int maxSize, Comparator<? super K> comparator) {
        super(comparator);
        this.maxSize = maxSize;
    }

    private void evict() {
        remove(firstKey());
    }

    @Override
    public V put(K key, V value) {
        if (size() >= maxSize) {
            evict();
        }

        return super.put(key, value);
    }
}
