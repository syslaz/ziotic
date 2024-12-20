/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.pr;
import jaclib.peer.uca;

public class PixelBuffer extends pr implements Buffer {
    public final native int getRowPitch();

    private final native void init();

    public final long getAddress() {
        return 0L;
    }

    private final native void geti(int[] is, int i, int i_0_, int i_1_);

    private final native void putub(byte[] is, int i, int i_2_, int i_3_);

    private final native void getub(byte[] is, int i, int i_4_, int i_5_);

    public final native int getSize();

    public final native int getSlicePitch();

    public final void a(byte[] is, int i, int i_6_, int i_7_) {
        if (((i_7_ + i ^ 0xffffffff) < (is.length ^ 0xffffffff) | (null == is | (i ^ 0xffffffff) > -1) | i_6_ < 0) || getSize() < i_6_ + i_7_)
            throw new iba();
        putub(is, i, i_6_, i_7_);
    }

    public PixelBuffer(uca var_uca) {
        super(var_uca);
        init();
    }

    public final void a(int[] is, int i, int i_8_, int i_9_) {
        if (((is.length ^ 0xffffffff) > (i - -i_9_ ^ 0xffffffff) | (-1 < (i ^ 0xffffffff) | null == is) | -1 < (i_8_ ^ 0xffffffff)) || getSize() < i_9_ * 4 + i_8_)
            throw new iba();
        puti(is, i, i_8_, i_9_);
    }

    public final void b(int[] is, int i, int i_10_, int i_11_) {
        if (is.length < i_11_ + i | (0 > i | null == is) | i_10_ < 0 || i_10_ + i_11_ * 4 > getSize())
            throw new iba();
        geti(is, i, i_10_, i_11_);
    }

    private final native void puti(int[] is, int i, int i_12_, int i_13_);
}
