/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;

public class IDirect3DSwapChain extends IUnknown {
    private uca b;

    public final native int Present(int i);

    IDirect3DSwapChain(uca var_uca) {
        super(var_uca);
        b = var_uca;
    }

    public final IDirect3DSurface a(int i, int i_0_) {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(b);
        int i_1_ = _GetBackBuffer(i, i_0_, idirect3dsurface);
        if (raa.a(i_1_, (int) -102))
            throw new iba(String.valueOf(i_1_));
        return idirect3dsurface;
    }

    private final native int _GetBackBuffer(int i, int i_2_, IDirect3DSurface idirect3dsurface);
}
