/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.pr;
import jaclib.peer.uca;

public class GeometryBuffer extends pr implements Buffer {
    public GeometryBuffer(uca var_uca) {
        super(var_uca);
        init();
    }

    private final native void putub(byte[] is, int i, int i_0_, int i_1_);

    private final native void getub(byte[] is, int i, int i_2_, int i_3_);

    private final native void init();

    public final native int getSize();

    public final void a(byte[] is, int i, int i_4_, int i_5_) {
        if (((is.length ^ 0xffffffff) > (i - -i_5_ ^ 0xffffffff) | (null == is | (i ^ 0xffffffff) > -1) | i_4_ < 0) || getSize() < i_5_ + i_4_)
            throw new iba();
        putub(is, i, i_4_, i_5_);
    }

    public final native long getAddress();
}
