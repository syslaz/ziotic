/* IDirect3DTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.uca;

public class IDirect3DTexture extends IDirect3DBaseTexture {
    public final native boolean UnlockRect(int i);

    IDirect3DTexture(uca var_uca) {
        super(var_uca);
    }

    public final native int LockRect(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, PixelBuffer pixelbuffer);
}
