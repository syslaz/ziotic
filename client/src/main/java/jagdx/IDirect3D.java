/* IDirect3D - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;

import java.awt.*;

public class IDirect3D extends IUnknown {
    private uca b;

    private static final native int _Direct3DCreate(int i, IDirect3D idirect3d);

    private final native int _CreateDevice(int i, int i_0_, Canvas canvas, int i_1_, D3DPRESENT_PARAMETERS d3dpresent_parameters, IDirect3DDevice idirect3ddevice);

    public final native int CheckDeviceFormat(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_);

    private final native int _GetDeviceCaps(int i, int i_7_, D3DCAPS d3dcaps);

    public final native int CheckDepthStencilMatch(int i, int i_8_, int i_9_, int i_10_, int i_11_);

    public final D3DCAPS a(int i, int i_12_) {
        D3DCAPS d3dcaps = new D3DCAPS();
        int i_13_ = _GetDeviceCaps(i, i_12_, d3dcaps);
        if (raa.a(i_13_, (int) -116))
            throw new iba(String.valueOf(i_13_));
        return d3dcaps;
    }

    public final int a(int i, D3DDISPLAYMODE d3ddisplaymode) {
        return _GetAdapterDisplayMode(i, d3ddisplaymode);
    }

    private final native int _GetAdapterIdentifier(int i, int i_14_, D3DADAPTER_IDENTIFIER d3dadapter_identifier);

    public final IDirect3DDevice a(int i, int i_15_, Canvas canvas, int i_16_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
        IDirect3DDevice idirect3ddevice = new IDirect3DDevice(b);
        int i_17_ = _CreateDevice(i, i_15_, canvas, i_16_, d3dpresent_parameters, idirect3ddevice);
        if (raa.a(i_17_, (int) -95))
            throw new iba(String.valueOf(i_17_));
        return idirect3ddevice;
    }

    public final native int CheckDeviceType(int i, int i_18_, int i_19_, int i_20_, boolean bool);

    public static final IDirect3D a(int i, uca var_uca) {
        IDirect3D idirect3d = new IDirect3D(var_uca);
        int i_21_ = _Direct3DCreate(i, idirect3d);
        if (raa.a(i_21_, (int) -55))
            throw new iba(String.valueOf(i_21_));
        return idirect3d;
    }

    private IDirect3D(uca var_uca) {
        super(var_uca);
        b = var_uca;
    }

    public final D3DADAPTER_IDENTIFIER b(int i, int i_22_) {
        D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
        int i_23_ = _GetAdapterIdentifier(i, i_22_, d3dadapter_identifier);
        if (raa.a(i_23_, (int) -42))
            throw new iba(String.valueOf(i_23_));
        return d3dadapter_identifier;
    }

    private final native int _GetAdapterDisplayMode(int i, D3DDISPLAYMODE d3ddisplaymode);

    public final native int CheckDeviceMultiSampleType(int i, int i_24_, int i_25_, boolean bool, int i_26_);
}
