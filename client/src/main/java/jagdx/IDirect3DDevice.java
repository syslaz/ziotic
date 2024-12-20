/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;

public final class IDirect3DDevice extends IUnknown {
    private static float[] b = new float[4];
    private uca c;

    public final native int SetVertexDeclaration(IDirect3DVertexDeclaration idirect3dvertexdeclaration);

    private final native int _GetDepthStencilSurface(IDirect3DSurface idirect3dsurface);

    public final native int _CreateVolumeTexture(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, IDirect3DVolumeTexture idirect3dvolumetexture);

    public final native int SetRenderState(int i, int i_6_);

    public final native int SetVertexShaderConstantF(int i, float[] fs, int i_7_);

    public final native int Clear(int i, int i_8_, float f, int i_9_);

    public final int a(int i, float f) {
        return SetRenderStatef(i, f);
    }

    public final native int _CreateVertexShader(byte[] is, IDirect3DVertexShader idirect3dvertexshader);

    public final IDirect3DSurface b() {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(c);
        int i = _GetDepthStencilSurface(idirect3dsurface);
        if (raa.a(i, (int) -43))
            throw new iba(String.valueOf(i));
        return idirect3dsurface;
    }

    public final native int SetStreamSource(int i, IDirect3DVertexBuffer idirect3dvertexbuffer, int i_10_, int i_11_);

    public final native boolean LightEnable(int i, boolean bool);

    private final native int _CreateOffscreenPlainSurface(int i, int i_12_, int i_13_, int i_14_, IDirect3DSurface idirect3dsurface);

    public final native int SetTransform(int i, float[] fs);

    public final native int SetFVF(int i);

    private final native int _CreateEventQuery(IDirect3DEventQuery idirect3deventquery);

    public final native int SetTextureStageState(int i, int i_15_, int i_16_);

    public final native int SetIndices(IDirect3DIndexBuffer idirect3dindexbuffer);

    public final IDirect3DTexture a(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
        IDirect3DTexture idirect3dtexture = new IDirect3DTexture(c);
        int i_22_ = _CreateTexture(i, i_17_, i_18_, i_19_, i_20_, i_21_, idirect3dtexture);
        if (raa.a(i_22_, (int) -73))
            throw new iba(String.valueOf(i_22_));
        return idirect3dtexture;
    }

    public final IDirect3DIndexBuffer a(int i, int i_23_, int i_24_, int i_25_, IDirect3DIndexBuffer idirect3dindexbuffer) {
        if (null != idirect3dindexbuffer)
            idirect3dindexbuffer.a((byte) -41);
        else
            idirect3dindexbuffer = new IDirect3DIndexBuffer(c);
        int i_26_ = _CreateIndexBuffer(i, i_23_, i_24_, i_25_, idirect3dindexbuffer);
        if (raa.a(i_26_, (int) -118))
            throw new iba(String.valueOf(i_26_));
        return idirect3dindexbuffer;
    }

    private final native int _CreateIndexBuffer(int i, int i_27_, int i_28_, int i_29_, IDirect3DIndexBuffer idirect3dindexbuffer);

    IDirect3DDevice(uca var_uca) {
        super(var_uca);
        c = var_uca;
    }

    public final native int SetPixelShaderConstantF(int i, float[] fs, int i_30_);

    public final native int _CreateCubeTexture(int i, int i_31_, int i_32_, int i_33_, int i_34_, IDirect3DCubeTexture idirect3dcubetexture);

    public final IDirect3DVertexDeclaration a(VertexElementCollection vertexelementcollection, IDirect3DVertexDeclaration idirect3dvertexdeclaration) {
        if (null == idirect3dvertexdeclaration)
            idirect3dvertexdeclaration = new IDirect3DVertexDeclaration(c);
        else
            idirect3dvertexdeclaration.a((byte) -86);
        int i = _CreateVertexDeclaration(vertexelementcollection, idirect3dvertexdeclaration);
        if (raa.a(i, (int) -90))
            throw new iba(String.valueOf(i));
        return idirect3dvertexdeclaration;
    }

    public final IDirect3DPixelShader a(byte[] is) {
        if (is == null)
            return null;
        IDirect3DPixelShader idirect3dpixelshader = new IDirect3DPixelShader(c);
        int i = _CreatePixelShader(is, idirect3dpixelshader);
        if (raa.a(i, (int) -121))
            throw new iba(String.valueOf(i));
        return idirect3dpixelshader;
    }

    private final native int SetRenderStateb(int i, boolean bool);

    public final IDirect3DCubeTexture a(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
        IDirect3DCubeTexture idirect3dcubetexture = new IDirect3DCubeTexture(c);
        int i_39_ = _CreateCubeTexture(i, i_35_, i_36_, i_37_, i_38_, idirect3dcubetexture);
        if (raa.a(i_39_, (int) -33))
            throw new iba(String.valueOf(i_39_));
        return idirect3dcubetexture;
    }

    public final IDirect3DEventQuery c() {
        IDirect3DEventQuery idirect3deventquery = new IDirect3DEventQuery(c);
        if (raa.a(_CreateEventQuery(idirect3deventquery), (byte) 109))
            return (!idirect3deventquery.a((int) -118) ? null : idirect3deventquery);
        return null;
    }

    private final native int SetRenderStatef(int i, float f);

    public final IDirect3DVolumeTexture a(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
        IDirect3DVolumeTexture idirect3dvolumetexture = new IDirect3DVolumeTexture(c);
        int i_46_ = _CreateVolumeTexture(i, i_40_, i_41_, i_42_, i_43_, i_44_, i_45_, idirect3dvolumetexture);
        if (raa.a(i_46_, (int) -107))
            throw new iba(String.valueOf(i_46_));
        return idirect3dvolumetexture;
    }

    public final native int SetSamplerState(int i, int i_47_, int i_48_);

    public final native int SetViewport(int i, int i_49_, int i_50_, int i_51_, float f, float f_52_);

    public final int a(int i, float f, float f_53_, float f_54_, float f_55_) {
        b[1] = f_53_;
        b[3] = f_55_;
        b[2] = f_54_;
        b[0] = f;
        return SetPixelShaderConstantF(i, b, 1);
    }

    public final native int BeginScene();

    public final native int SetTexture(int i, IDirect3DBaseTexture idirect3dbasetexture);

    public final native int DrawPrimitive(int i, int i_56_, int i_57_);

    private final native int _CreateVertexBuffer(int i, int i_58_, int i_59_, int i_60_, IDirect3DVertexBuffer idirect3dvertexbuffer);

    private final native int _GetBackBuffer(int i, int i_61_, int i_62_, IDirect3DSurface idirect3dsurface);

    private final native int _GetSwapChain(int i, IDirect3DSwapChain idirect3dswapchain);

    public final native int SetVertexShader(IDirect3DVertexShader idirect3dvertexshader);

    private final native int _CreateRenderTarget(int i, int i_63_, int i_64_, int i_65_, int i_66_, boolean bool, IDirect3DSurface idirect3dsurface);

    public final IDirect3DVertexBuffer a(int i, int i_67_, int i_68_, int i_69_, IDirect3DVertexBuffer idirect3dvertexbuffer) {
        if (idirect3dvertexbuffer == null)
            idirect3dvertexbuffer = new IDirect3DVertexBuffer(c);
        else
            idirect3dvertexbuffer.a((byte) -101);
        int i_70_ = _CreateVertexBuffer(i, i_67_, i_68_, i_69_, idirect3dvertexbuffer);
        if (raa.a(i_70_, (int) -124))
            throw new iba(String.valueOf(i_70_));
        idirect3dvertexbuffer.b = i;
        return idirect3dvertexbuffer;
    }

    public final native int Reset(D3DPRESENT_PARAMETERS d3dpresent_parameters);

    public final int a(int i, float[] fs) {
        return SetVertexShaderConstantF(i, fs, fs.length / 4);
    }

    private final native int _GetRenderTarget(int i, IDirect3DSurface idirect3dsurface);

    public final IDirect3DSurface a(int i, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool) {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(c);
        int i_75_ = _CreateRenderTarget(i, i_71_, i_72_, i_73_, i_74_, bool, idirect3dsurface);
        if (raa.a(i_75_, (int) -59))
            throw new iba(String.valueOf(i_75_));
        return idirect3dsurface;
    }

    public final native int TestCooperativeLevel();

    public final native int EndScene();

    public final IDirect3DVertexShader b(byte[] is) {
        if (is == null)
            return null;
        IDirect3DVertexShader idirect3dvertexshader = new IDirect3DVertexShader(c);
        int i = _CreateVertexShader(is, idirect3dvertexshader);
        if (raa.a(i, (int) -72))
            throw new iba(String.valueOf(i));
        return idirect3dvertexshader;
    }

    public final native int SetPixelShader(IDirect3DPixelShader idirect3dpixelshader);

    public final IDirect3DSwapChain b(int i) {
        IDirect3DSwapChain idirect3dswapchain = new IDirect3DSwapChain(c);
        int i_76_ = _GetSwapChain(i, idirect3dswapchain);
        if (raa.a(i_76_, (int) -90))
            throw new iba(String.valueOf(i_76_));
        return idirect3dswapchain;
    }

    public final native int SetScissorRect(int i, int i_77_, int i_78_, int i_79_);

    public final IDirect3DSurface c(int i) {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(c);
        int i_80_ = _GetRenderTarget(i, idirect3dsurface);
        if (raa.a(i_80_, (int) -54))
            throw new iba(String.valueOf(i_80_));
        return idirect3dsurface;
    }

    public final native int DrawIndexedPrimitive(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_);

    private final native int _CreateDepthStencilSurface(int i, int i_86_, int i_87_, int i_88_, int i_89_, boolean bool, IDirect3DSurface idirect3dsurface);

    public final native int _CreatePixelShader(byte[] is, IDirect3DPixelShader idirect3dpixelshader);

    public final int b(int i, float f, float f_90_, float f_91_, float f_92_) {
        b[3] = f_92_;
        b[1] = f_90_;
        b[2] = f_91_;
        b[0] = f;
        return SetVertexShaderConstantF(i, b, 1);
    }

    public final native int _CreateTexture(int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, IDirect3DTexture idirect3dtexture);

    public final native int SetLight(int i, D3DLIGHT d3dlight);

    public final native int StretchRect(IDirect3DSurface idirect3dsurface, int i, int i_98_, int i_99_, int i_100_, IDirect3DSurface idirect3dsurface_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_);

    private final native int _CreateVertexDeclaration(VertexElementCollection vertexelementcollection, IDirect3DVertexDeclaration idirect3dvertexdeclaration);

    public final int a(int i, boolean bool) {
        return SetRenderStateb(i, bool);
    }
}
