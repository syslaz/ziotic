/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;

public class IDirect3DSurface extends IUnknown {
    public final native boolean UnlockRect();

    IDirect3DSurface(uca var_uca) {
        super(var_uca);
    }

    public final native int LockRect(int i, int i_0_, int i_1_, int i_2_, int i_3_, PixelBuffer pixelbuffer);
}
