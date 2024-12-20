/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.uca;

public class IDirect3DVertexBuffer extends IUnknown {
    int b;

    private final native boolean _Update(long l, int i, int i_0_, int i_1_);

    public final native int Unlock();

    IDirect3DVertexBuffer(uca var_uca) {
        super(var_uca);
    }

    protected final long a() {
        b = 0;
        return super.a();
    }

    public final boolean a(Source source, int i, int i_2_, int i_3_, int i_4_) {
        if (source == null || (i ^ 0xffffffff) > -1 || i_3_ > source.getSize() + i)
            throw new iba("");
        if (i_2_ < 0 || i_2_ - -b < i_3_)
            throw new iba("");
        return _Update((long) i + source.getAddress(), i_2_, i_3_, i_4_);
    }

    public final native int Lock(int i, int i_5_, int i_6_, GeometryBuffer geometrybuffer);
}
