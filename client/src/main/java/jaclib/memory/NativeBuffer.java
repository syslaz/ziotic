/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
    private int a = -1;
    private long b;

    public void a(byte[] is, int i, int i_0_, int i_1_) {
        if ((i_1_ + i_0_ ^ 0xffffffff) < (a ^ 0xffffffff) | (i_0_ < 0 | (is.length < i_1_ + i | ((i ^ 0xffffffff) > -1 | ((b ^ 0xffffffffffffffffL) == -1L | is == null)))))
            throw new RuntimeException();
        put(b, is, i, i_0_, i_1_);
    }

    private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

    public final int getSize() {
        return a;
    }

    protected final void a(long l, int i) {
        b = l;
        a = i;
    }

    private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

    public final long getAddress() {
        return b;
    }
}
