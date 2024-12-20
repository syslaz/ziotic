/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
    public int a;
    private int b;
    private boolean c = true;
    private NativeHeap d;

    public final long getAddress() {
        return d.getBufferAddress(b);
    }

    private final synchronized boolean a() {
        if (!d.a() || !c)
            return false;
        return true;
    }

    private final synchronized void b() {
        if (a())
            d.deallocateBuffer(b);
        c = false;
    }

    public final synchronized void a(byte[] is, int i, int i_0_, int i_1_) {
        if ((i_0_ ^ 0xffffffff) > -1 | ((i ^ 0xffffffff) > -1 | (is == null | !a()) | (is.length ^ 0xffffffff) > (i - -i_1_ ^ 0xffffffff)) | i_0_ + i_1_ > a)
            throw new RuntimeException();
        d.put(b, is, i, i_0_, i_1_);
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        b();
    }

    public final int getSize() {
        return a;
    }

    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_2_) {
        b = i;
        d = nativeheap;
        a = i_2_;
    }
}
