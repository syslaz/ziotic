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
package com.ziotic.jode.util;
///#ifdef JDK12

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.*;

///#endif

public class UnifyHash extends AbstractCollection {
    /**
     * the default capacity
     */
    private static final int DEFAULT_CAPACITY = 11;

    /**
     * the default load factor of a HashMap
     */
    private static final float DEFAULT_LOAD_FACTOR = 0.75F;

    ///#ifdef JDK12
    private ReferenceQueue queue = new ReferenceQueue();
///#endif

    static class Bucket
///#ifdef JDK12
            extends WeakReference
///#endif
    {
        ///#ifdef JDK12
        public Bucket(Object o, ReferenceQueue q) {
            super(o, q);
        }
///#else
///	public Bucket(Object o) {
///	    this.obj = o;
///	}
///
///	Object obj;
///
///	public Object get() {
///	    return obj;
///	}
///#endif

        int hash;
        Bucket next;
    }

    private Bucket[] buckets;
    int modCount = 0;
    int size = 0;
    int threshold;
    float loadFactor;

    public UnifyHash(int initialCapacity, float loadFactor) {
        this.loadFactor = loadFactor;
        buckets = new Bucket[initialCapacity];
        threshold = (int) (loadFactor * initialCapacity);
    }

    public UnifyHash(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public UnifyHash() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    private void grow() {
        Bucket[] oldBuckets = buckets;
        int newCap = buckets.length * 2 + 1;
        threshold = (int) (loadFactor * newCap);
        buckets = new Bucket[newCap];
        for (int i = 0; i < oldBuckets.length; i++) {
            Bucket nextBucket;
            for (Bucket b = oldBuckets[i]; b != null; b = nextBucket) {
                if (i != Math.abs(b.hash % oldBuckets.length))
                    throw new RuntimeException("" + i + ", hash: " + b.hash + ", oldlength: " + oldBuckets.length);
                int newSlot = Math.abs(b.hash % newCap);
                nextBucket = b.next;
                b.next = buckets[newSlot];
                buckets[newSlot] = b;
            }
        }
    }

    ///#ifdef JDK12
    public final void cleanUp() {
        Bucket died;
        while ((died = (Bucket) queue.poll()) != null) {
            int diedSlot = Math.abs(died.hash % buckets.length);
            if (buckets[diedSlot] == died)
                buckets[diedSlot] = died.next;
            else {
                Bucket b = buckets[diedSlot];
                while (b.next != died)
                    b = b.next;
                b.next = died.next;
            }
            size--;
        }
    }
///#endif

    public int size() {
        return size;
    }

    public Iterator iterator() {
///#ifdef JDK12
        cleanUp();
///#endif

        return new Iterator() {
            private int bucket = 0;
            private int known = modCount;
            private Bucket nextBucket;
            private Object nextVal;

            {
                internalNext();
            }

            private void internalNext() {
                while (true) {
                    while (nextBucket == null) {
                        if (bucket == buckets.length)
                            return;
                        nextBucket = buckets[bucket++];
                    }

                    nextVal = nextBucket.get();
                    if (nextVal != null)
                        return;

                    nextBucket = nextBucket.next;
                }
            }

            public boolean hasNext() {
                return nextBucket != null;
            }

            public Object next() {
                if (known != modCount)
                    throw new ConcurrentModificationException();
                if (nextBucket == null)
                    throw new NoSuchElementException();
                Object result = nextVal;
                nextBucket = nextBucket.next;
                internalNext();
                return result;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterator iterateHashCode(final int hash) {
///#ifdef JDK12
        cleanUp();
///#endif
        return new Iterator() {
            private int known = modCount;
            private Bucket nextBucket = buckets[Math.abs(hash % buckets.length)];
            private Object nextVal;

            {
                internalNext();
            }

            private void internalNext() {
                while (nextBucket != null) {
                    if (nextBucket.hash == hash) {
                        nextVal = nextBucket.get();
                        if (nextVal != null)
                            return;
                    }

                    nextBucket = nextBucket.next;
                }
            }

            public boolean hasNext() {
                return nextBucket != null;
            }

            public Object next() {
                if (known != modCount)
                    throw new ConcurrentModificationException();
                if (nextBucket == null)
                    throw new NoSuchElementException();
                Object result = nextVal;
                nextBucket = nextBucket.next;
                internalNext();
                return result;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public void put(int hash, Object o) {
        if (size++ > threshold)
            grow();
        modCount++;

        int slot = Math.abs(hash % buckets.length);
///#ifdef JDK12
        Bucket b = new Bucket(o, queue);
///#else
///	Bucket b = new Bucket(o);
///#endif
        b.hash = hash;
        b.next = buckets[slot];
        buckets[slot] = b;
    }

    public Object unify(Object o, int hash, Comparator comparator) {
///#ifdef JDK12
        cleanUp();
///#endif
        int slot = Math.abs(hash % buckets.length);
        for (Bucket b = buckets[slot]; b != null; b = b.next) {
            Object old = b.get();
            if (old != null && comparator.compare(o, old) == 0)
                return old;
        }

        put(hash, o);
        return o;
    }
}
