/* IDirect3DIndexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;

public class IDirect3DIndexBuffer extends IUnknown {
    protected final long a() {
        return super.a();
    }

    private final native boolean _Update(long l, int i, int i_0_);

    public final native int Lock(int i, int i_1_, int i_2_, GeometryBuffer geometrybuffer);

    public final native int Unlock();

    IDirect3DIndexBuffer(uca var_uca) {
        super(var_uca);
    }
}
