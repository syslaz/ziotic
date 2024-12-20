/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class Class153 {
    private IDirect3DSwapChain anIDirect3DSwapChain1818;
    private IDirect3DSurface anIDirect3DSurface1819;
    private IDirect3DSurface anIDirect3DSurface1820;

    final void method1358(int i, IDirect3DSwapChain idirect3dswapchain, IDirect3DSurface idirect3dsurface) {
        anIDirect3DSwapChain1818 = idirect3dswapchain;
        anIDirect3DSurface1819 = idirect3dsurface;
        anIDirect3DSurface1820 = anIDirect3DSwapChain1818.a(0, 0);
        if (i != 14721)
            anIDirect3DSurface1819 = null;
    }

    final int method1359(int i, boolean bool) {
        if (bool != true)
            anIDirect3DSwapChain1818 = null;
        return anIDirect3DSwapChain1818.Present(i);
    }

    final boolean method1360(int i) {
        if (i >= -119)
            anIDirect3DSwapChain1818 = null;
        return anIDirect3DSwapChain1818 != null;
    }

    final void method1361(int i) {
        if (null != anIDirect3DSurface1820) {
            anIDirect3DSurface1820.a((byte) 126);
            anIDirect3DSurface1820 = null;
        }
        if (i == 0) {
            if (null != anIDirect3DSurface1819) {
                anIDirect3DSurface1819.a((byte) -128);
                anIDirect3DSurface1819 = null;
            }
            if (null != anIDirect3DSwapChain1818) {
                anIDirect3DSwapChain1818.a((byte) 87);
                anIDirect3DSwapChain1818 = null;
            }
        }
    }

    Class153(IDirect3DSwapChain idirect3dswapchain, IDirect3DSurface idirect3dsurface) {
        method1358(14721, idirect3dswapchain, idirect3dsurface);
    }
}
