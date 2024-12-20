/* ha_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.peer.uca;
import jagdx.*;

import java.awt.*;

public final class ha_Sub3_Sub2 extends ha_Sub3 {
    uca anUca8771;
    private IDirect3D anIDirect3D8772;
    PixelBuffer aPixelBuffer8773;
    private int anInt8774;
    private boolean[] aBooleanArray8775;
    private boolean[] aBooleanArray8776;
    boolean aBoolean8777;
    GeometryBuffer aGeometryBuffer8778;
    private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS8779;
    private D3DLIGHT aD3DLIGHT8780;
    IDirect3DDevice anIDirect3DDevice8781;
    boolean aBoolean8782;
    private Class171[] aClass171Array8783;
    private boolean aBoolean8784 = false;
    private static int[] anIntArray8785 = {22, 23};
    private int anInt8786;
    private D3DLIGHT aD3DLIGHT8787;
    private boolean[] aBooleanArray8788;
    boolean aBoolean8789;
    private D3DLIGHT aD3DLIGHT8790;
    private int anInt8791;
    private static float[] aFloatArray8792 = new float[16];
    private Class153 aClass153_8793;
    D3DCAPS aD3DCAPS8794;
    private IDirect3DVertexShader anIDirect3DVertexShader8795;
    private boolean[] aBooleanArray8796;
    private static int[] anIntArray8797 = {77, 80};
    private int[] anIntArray8798;

    final void z() {
        /* empty */
    }

    final void b(int i, int i_0_, int i_1_, int i_2_, double d) {
        /* empty */
    }

    final void method1006(Interface18_Impl2 interface18_impl2, Class14 class14, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetIndices(((Class217) (Class217) interface18_impl2).anIDirect3DIndexBuffer8614);
        if (i_6_ != -229)
            aD3DLIGHT8790 = null;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.DrawIndexedPrimitive(method1070(class14, (byte) 54), 0, i_5_, i_4_, i_3_, i);
    }

    final void method1060(byte i, IDirect3DVertexShader idirect3dvertexshader) {
        anIDirect3DVertexShader8795 = idirect3dvertexshader;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetVertexShader(idirect3dvertexshader);
        if (i != 71)
            a((Interface13) null, null);
        method982(-126);
    }

    final void method947(boolean bool) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(27, ((ha_Sub3_Sub2) this).aBoolean6198);
        if (bool != true)
            aD3DLIGHT8780 = null;
    }

    final void e(int i, int i_7_) throws Exception_Sub1 {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.EndScene();
        if (aClass153_8793.method1360(-128)) {
            anInt8774 = 0;
            if (raa.a(aClass153_8793.method1359(0, true), (int) -94))
                method1064(-11588);
        } else {
            if (++anInt8774 > 50)
                throw new Exception_Sub1();
            method1064(-11588);
        }
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.BeginScene();
    }

    final void method1001(Canvas canvas, byte i, Object object) {
        if (i <= 33)
            method1065(null, -41);
    }

    final Interface21_Impl2 method967(int i, Class264 class264, int i_8_, int i_9_, Class228 class228) {
        if (i_8_ >= -60)
            anIntArray8785 = null;
        return new Class35_Sub3(this, class264, class228, i_9_, i);
    }

    private static final boolean method1061(int i, int l, D3DPRESENT_PARAMETERS d3dpresent_parameters, int i1, IDirect3D idirect3d, int j1) {
        try {
            int k1;
            int l1;
            int i2;
            k1 = 0;
            l1 = 0;
            i2 = 0;
            D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
            if (raa.a(idirect3d.a(j1, d3ddisplaymode), -115))
                return false;
            label0:
            for (; ~i <= -1; i--) {
                if (-2 == ~i)
                    continue;
                i2 = i + 0;
                label1:
                for (int j2 = 0; anIntArray8785.length > j2; j2++) {
                    if (idirect3d.CheckDeviceType(j1, l, d3ddisplaymode.Format, anIntArray8785[j2], true) != 0 || ~idirect3d.CheckDeviceFormat(j1, l, d3ddisplaymode.Format, 1, 1, anIntArray8785[j2]) != -1 || i != 0 && -1 != ~idirect3d.CheckDeviceMultiSampleType(j1, l, anIntArray8785[j2], true, i2))
                        continue;
                    int k2 = 0;
                    do {
                        if (anIntArray8797.length <= k2)
                            continue label1;
                        if (idirect3d.CheckDeviceFormat(j1, l, d3ddisplaymode.Format, 2, 1, anIntArray8797[k2]) == 0 && ~idirect3d.CheckDepthStencilMatch(j1, l, d3ddisplaymode.Format, anIntArray8785[j2], anIntArray8797[k2]) == -1 && (-1 == ~i || 0 == idirect3d.CheckDeviceMultiSampleType(j1, l, anIntArray8797[j2], true, i2))) {
                            k1 = anIntArray8797[k2];
                            l1 = anIntArray8785[j2];
                            break label0;
                        }
                        k2++;
                    } while (true);
                }
            }

            if (i1 <= 14)
                return false;
            if (0 > i || l1 == 0 || 0 == k1)
                return false;
            d3dpresent_parameters.AutoDepthStencilFormat = k1;
            d3dpresent_parameters.BackBufferFormat = l1;
            d3dpresent_parameters.MultiSampleQuality = 0;
            d3dpresent_parameters.MultiSampleType = i2;
            return true;
        } catch (Throwable throwable) {
        }
        return false;
    }

    final void method971(byte i) {
        if (i <= 102)
            aD3DLIGHT8790 = null;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(137, (((ha_Sub3_Sub2) this).aBoolean6252 && !((ha_Sub3_Sub2) this).aBoolean6222));
    }

    private static final int method1062(byte i, Class34 class34) {
        int i_23_ = 121 % ((i - 56) / 44);
        if (class34 != Node_Sub30.aClass34_7191) {
            if (Node_Sub14_Sub16.aClass34_9338 == class34)
                return 2;
            if (class34 != Node_Sub14_Sub31.aClass34_9493) {
                if (Class32.aClass34_385 != class34) {
                    if (class34 == Class340_Sub3.aClass34_8113)
                        return 256;
                } else
                    return 4;
            } else
                return 3;
        } else
            return 1;
        return 0;
    }

    static final int method1063(byte i, Class228 class228, Class264 class264) {
        if (i < 4)
            anIntArray8785 = null;
        if (Class228.aClass228_2573 == class228) {
            if (class264 == s.aClass264_3467)
                return 22;
            if (Class120.aClass264_1508 != class264) {
                if (Class130.aClass264_1573 == class264)
                    return 28;
                if (Class160.aClass264_1889 == class264)
                    return 50;
                if (Class346_Sub7_Sub2_Sub3.aClass264_10395 == class264)
                    return 51;
                if (class264 == Class282_Sub28.aClass264_7894)
                    return 77;
            } else
                return 21;
        }
        throw new IllegalArgumentException("");
    }

    final void method1021(byte i, int i_24_) {
        if (i != -109)
            anIDirect3D8772 = null;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, 11, i_24_);
    }

    final Interface21_Impl1 method1011(int i, int i_25_, byte[] is, Class264 class264, int i_26_, int i_27_) {
        if (i != 22302)
            a((Interface14) null);
        return new Class35_Sub1(this, class264, i_26_, i_27_, i_25_, is);
    }

    final boolean q() {
        return false;
    }

    final Interface13 d(int i, int i_28_) {
        return null;
    }

    final void h() {
        /* empty */
    }

    final void method937(byte i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTransform(3, ((ha_Sub3_Sub2) this).aFloatArray6229);
        if (i < 104)
            aClass171Array8783 = null;
    }

    static final ha createToolkit(Canvas canvas, d var_d, Class381 class381, Integer integer) {
        Object object = null;
        int i = 0;
        int i_29_ = 1;
        uca var_uca = new uca();
        IDirect3D idirect3d = IDirect3D.a(-2147483616, var_uca);
        D3DCAPS d3dcaps = idirect3d.a(i, i_29_);
        if ((d3dcaps.RasterCaps & 0x1000000 ^ 0xffffffff) == -1)
            throw new RuntimeException("");
        if (d3dcaps.MaxSimultaneousTextures < 2)
            throw new RuntimeException("");
        if (0 == (d3dcaps.TextureOpCaps & 0x2))
            throw new RuntimeException("");
        if ((0x8 & d3dcaps.TextureOpCaps ^ 0xffffffff) == -1)
            throw new RuntimeException("");
        if ((0x40 & d3dcaps.TextureOpCaps ^ 0xffffffff) == -1)
            throw new RuntimeException("");
        if ((0x200 & d3dcaps.TextureOpCaps ^ 0xffffffff) == -1)
            throw new RuntimeException("");
        if (0 == (d3dcaps.TextureOpCaps & 0x2000000))
            throw new RuntimeException("");
        if (-1 == (0x10 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps) ^ 0xffffffff))
            throw new RuntimeException("");
        if (0 == (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps & 0x20))
            throw new RuntimeException("");
        if ((0x2 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps)) == 0)
            throw new RuntimeException("");
        if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
            throw new RuntimeException("");
        if (d3dcaps.MaxStreams < 5)
            throw new RuntimeException("");
        D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
        if (!method1061(integer.intValue(), i_29_, d3dpresent_parameters, 99, idirect3d, i))
            throw new RuntimeException("");
        d3dpresent_parameters.Windowed = true;
        d3dpresent_parameters.PresentationInterval = -2147483648;
        d3dpresent_parameters.EnableAutoDepthStencil = true;
        int i_30_ = 2;
        if (0 != (d3dcaps.DevCaps & 0x100000))
            i_30_ |= 0x10;
        Object object_31_ = null;
        IDirect3DDevice idirect3ddevice;
        try {
            idirect3ddevice = idirect3d.a(i, i_29_, canvas, 0x40 | i_30_, d3dpresent_parameters);
        } catch (iba var_iba) {
            idirect3ddevice = idirect3d.a(i, i_29_, canvas, i_30_ | 0x20, d3dpresent_parameters);
        }
        Class153 class153 = new Class153(idirect3ddevice.b(0), idirect3ddevice.b());
        ha_Sub3_Sub2 var_ha_Sub3_Sub2 = new ha_Sub3_Sub2(i, i_29_, canvas, var_uca, idirect3d, idirect3ddevice, class153, d3dpresent_parameters, d3dcaps, var_d, class381, integer.intValue());
        var_ha_Sub3_Sub2.method988(false);
        return var_ha_Sub3_Sub2;
    }

    final void method1048(boolean bool) {
        if (bool != true)
            method1072(null, false);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetScissorRect(((ha_Sub3_Sub2) this).anInt6208 + ((ha_Sub3_Sub2) this).anInt6225, ((ha_Sub3_Sub2) this).anInt6217 + ((ha_Sub3_Sub2) this).anInt6250, ((ha_Sub3_Sub2) this).anInt6167, ((ha_Sub3_Sub2) this).anInt6154);
    }

    final float method959(int i) {
        if (i > -37)
            ((ha_Sub3_Sub2) this).aD3DCAPS8794 = null;
        return -0.5F;
    }

    final void method1000(boolean bool, int i) {
        if (i >= -115)
            method1044(null, null, -91);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(161, bool);
    }

    final void method1017(int i, int i_32_, Class280 class280, boolean bool, boolean bool_33_) {
        int i_34_ = i_32_;
        int i_35_;
        while_140_:
        do {
            do {
                if ((i_34_ ^ 0xffffffff) != -2) {
                    if (i_34_ != 2)
                        break;
                } else {
                    i_35_ = 3;
                    break while_140_;
                }
                i_35_ = 26;
                break while_140_;
            } while (false);
            i_35_ = 2;
        } while (false);
        int i_36_ = 0;
        if (bool_33_)
            i_36_ |= 0x20;
        if (i == -8980) {
            if (bool)
                i_36_ |= 0x10;
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, i_35_, method1069(class280, 0) | i_36_);
        }
    }

    final void method1030(int i) {
        int i_37_ = 46 / ((35 - i) / 36);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(15, ((ha_Sub3_Sub2) this).aBoolean6226);
    }

    final void method940(byte i) {
        method997((byte) -103);
        method1045((byte) -51);
        int i_38_ = -69 / ((i - 40) / 63);
    }

    final void method999(int i, Class181 class181) {
        int i_39_ = 0;
        if (Class251.aClass181_2829 == class181)
            i_39_ = 65536;
        else if (class181 == Class81.aClass181_4907)
            i_39_ = 131072;
        else if (class181 == Class282_Sub27.aClass181_7871)
            i_39_ = 196608;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, 11, i_39_ | ((ha_Sub3_Sub2) this).anInt6207);
        if (i < 107)
            k();
    }

    final void u() {
        /* empty */
    }

    final Class340 method941(int i, int i_40_) {
        if (i_40_ != 6)
            method975(25);
        int i_41_ = i;
        while_141_:
        do {
            do {
                if (3 != i_41_) {
                    if (-5 != (i_41_ ^ 0xffffffff)) {
                        if (-9 == (i_41_ ^ 0xffffffff))
                            break;
                        break while_141_;
                    }
                } else
                    return new Class340_Sub1(this, (((ha_Sub3_Sub2) this).aClass381_6108));
                return new Class340_Sub4(this, ((ha_Sub3_Sub2) this).aClass381_6108, ((ha_Sub3_Sub2) this).aClass370_6127);
            } while (false);
            return new Class340_Sub11(this, ((ha_Sub3_Sub2) this).aClass381_6108, ((ha_Sub3_Sub2) this).aClass370_6127);
        } while (false);
        return super.method941(i, 6);
    }

    private final boolean method1064(int i) {
        int i_42_ = ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.TestCooperativeLevel();
        if (i != -11588)
            method969(91);
        if ((i_42_ ^ 0xffffffff) == -1 || 2005530518 == (i_42_ ^ 0xffffffff)) {
            Class153 class153 = (Class153) ((ha_Sub3_Sub2) this).anObject6004;
            method1027(i ^ ~0x2d05);
            class153.method1361(0);
            aD3DPRESENT_PARAMETERS8779.BackBufferHeight = 0;
            aD3DPRESENT_PARAMETERS8779.BackBufferWidth = 0;
            if (method1061(((ha_Sub3_Sub2) this).anInt6206, anInt8791, aD3DPRESENT_PARAMETERS8779, 34, anIDirect3D8772, anInt8786)) {
                int i_43_ = ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.Reset(aD3DPRESENT_PARAMETERS8779);
                if (raa.a(i_43_, (byte) 100)) {
                    class153.method1358(14721, ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.b(0), ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.b());
                    method1054(-46);
                    method1013(95);
                    return true;
                }
            }
        }
        return false;
    }

    final void method1032(int i) {
        if (i > 91) {
            if (aBooleanArray8796[((ha_Sub3_Sub2) this).anInt6207]) {
                aBooleanArray8796[((ha_Sub3_Sub2) this).anInt6207] = false;
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTexture(((ha_Sub3_Sub2) this).anInt6207, null);
                method1051((byte) 116);
                method1037(false);
            }
        }
    }

    final void method1007(Object object, Canvas canvas, int i) {
        int i_44_ = 40 % ((i - 57) / 58);
        if (canvas == ((ha_Sub3_Sub2) this).aCanvas5993) {
            Dimension dimension = canvas.getSize();
            if (-1 > (dimension.width ^ 0xffffffff) && -1 > (dimension.height ^ 0xffffffff)) {
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.EndScene();
                method1064(-11588);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.BeginScene();
            }
        }
    }

    final Interface21_Impl2 method996(int i, boolean bool, int i_45_, int i_46_, byte[] is, Class264 class264, int i_47_, int i_48_) {
        if (i_48_ >= -91)
            method1071(77, null);
        return new Class35_Sub3(this, class264, i_45_, i_47_, bool, is, i_46_, i);
    }

    final void method1039(byte i) {
        if (i != -13)
            p();
    }

    final void F(int i, int i_49_) {
        /* empty */
    }

    final void method1051(byte i) {
        if (i <= 113)
            ((ha_Sub3_Sub2) this).aD3DCAPS8794 = null;
        int i_50_ = (aBooleanArray8796[((ha_Sub3_Sub2) this).anInt6207] ? method1071(9406, (((ha_Sub3_Sub2) this).aClass5Array6248[((ha_Sub3_Sub2) this).anInt6207])) : 1);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, 4, i_50_);
    }

    private static final int method1065(Class171 class171, int i) {
        if (class171 == Class162.aClass171_1904)
            return 2;
        if (Class51.aClass171_691 == class171)
            return 1;
        if (i != 29895)
            method1061(-10, 57, null, 127, null, -10);
        throw new IllegalArgumentException();
    }

    final void method939(int i) {
        int i_51_;
        for (i_51_ = 0; (i_51_ ^ 0xffffffff) > (((ha_Sub3_Sub2) this).anInt6189 ^ 0xffffffff); i_51_++) {
            Node_Sub42 class248_sub42 = ((ha_Sub3_Sub2) this).aClass248_Sub42Array6165[i_51_];
            int i_52_ = 2 + i_51_;
            int i_53_ = class248_sub42.method2626(false);
            float f = class248_sub42.method2621((byte) 110) / 255.0F;
            aD3DLIGHT8787.SetPosition((float) class248_sub42.method2620(109), (float) class248_sub42.method2624(-22096), (float) class248_sub42.method2625((byte) -119));
            aD3DLIGHT8787.SetDiffuse(f * (float) ((0xff0906 & i_53_) >> -2097663152), ((float) ((0xff88 & i_53_) >> 647465000) * f), f * (float) (0xff & i_53_), 0.0F);
            aD3DLIGHT8787.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (class248_sub42.method2628(i + -75) * class248_sub42.method2628(-71)));
            aD3DLIGHT8787.SetRange((float) class248_sub42.method2628(-70));
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetLight(i_52_, aD3DLIGHT8787);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.LightEnable(i_52_, true);
        }
        for (/**/; ((i_51_ ^ 0xffffffff) > (((ha_Sub3_Sub2) this).anInt6227 ^ 0xffffffff)); i_51_++)
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.LightEnable(i_51_ + 2, false);
        super.method939(i);
    }

    final int I() {
        return 0;
    }

    final Class316 a(Class316 class316, Class316 class316_54_, float f, Class316 class316_55_) {
        return 0.5F > f ? class316 : class316_54_;
    }

    final void method1066(Class35_Sub1 class35_sub1, byte i) {
        if (i >= -66)
            anInt8791 = 95;
        method1072(class35_sub1, false);
        if (!aBooleanArray8775[((ha_Sub3_Sub2) this).anInt6207]) {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 1, 1);
            aBooleanArray8775[((ha_Sub3_Sub2) this).anInt6207] = true;
        }
        if (!aBooleanArray8776[((ha_Sub3_Sub2) this).anInt6207]) {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 2, 1);
            aBooleanArray8776[((ha_Sub3_Sub2) this).anInt6207] = true;
        }
    }

    final void method1037(boolean bool) {
        int i = (!aBooleanArray8796[((ha_Sub3_Sub2) this).anInt6207] ? 1 : method1071(9406, (((ha_Sub3_Sub2) this).aClass5Array6179[((ha_Sub3_Sub2) this).anInt6207])));
        if (bool)
            a(-103, -1);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, 1, i);
    }

    final void method969(int i) {
        if (i == 26588)
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetViewport(((ha_Sub3_Sub2) this).anInt6225, ((ha_Sub3_Sub2) this).anInt6250, ((ha_Sub3_Sub2) this).anInt5986, ((ha_Sub3_Sub2) this).anInt5955, 0.0F, 1.0F);
    }

    final Interface21_Impl2 method956(int i, int[] is, int i_56_, boolean bool, int i_57_, int i_58_, int i_59_) {
        if (i_59_ >= -29)
            anIDirect3DVertexShader8795 = null;
        return new Class35_Sub3(this, i_56_, i_58_, bool, is, i, i_57_);
    }

    final void method1015(byte i) {
        if (!((ha_Sub3_Sub2) this).aClass31_6234.method268((byte) 0)) {
            aFloatArray8792[2] = 0.0F;
            aFloatArray8792[9] = 0.0F;
            aFloatArray8792[0] = 1.0F;
            aFloatArray8792[14] = 0.0F;
            aFloatArray8792[11] = 0.0F;
            aFloatArray8792[13] = 0.0F;
            aFloatArray8792[6] = 0.0F;
            aFloatArray8792[4] = 0.0F;
            aFloatArray8792[10] = 1.0F;
            aFloatArray8792[5] = 1.0F;
            aFloatArray8792[8] = 0.0F;
            aFloatArray8792[12] = 0.0F;
            aFloatArray8792[3] = 0.0F;
            aFloatArray8792[1] = 0.0F;
            aFloatArray8792[15] = 1.0F;
            aFloatArray8792[7] = 0.0F;
        } else
            ((ha_Sub3_Sub2) this).aClass238_Sub2_6149.method1901((byte) 81, aFloatArray8792);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTransform(2, aFloatArray8792);
        if (i != 107)
            method996(121, true, -81, -40, null, null, -78, 101);
    }

    final void method1045(byte i) {
        if (i <= -15) {
            if (!aBoolean8784) {
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.LightEnable(0, false);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.LightEnable(1, false);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetLight(0, aD3DLIGHT8790);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetLight(1, aD3DLIGHT8780);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.LightEnable(0, true);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.LightEnable(1, true);
                aBoolean8784 = true;
            }
        }
    }

    final synchronized void j(int i) {
        ((ha_Sub3_Sub2) this).anUca8771.a((int) 84);
        super.j(i);
    }

    final void ya() {
        method950((byte) 36, true);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.Clear(2, 0, 1.0F, 0);
    }

    final int[] na(int i, int i_60_, int i_61_, int i_62_) {
        int[] is = null;
        IDirect3DSurface idirect3dsurface = ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.c(0);
        IDirect3DSurface idirect3dsurface_63_ = ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(i_61_, i_62_, 21, 0, 0, true);
        if (raa.a((((ha_Sub3_Sub2) this).anIDirect3DDevice8781.StretchRect(idirect3dsurface, i, i_60_, i_61_, i_62_, idirect3dsurface_63_, 0, 0, i_61_, i_62_, 0)), (byte) 124) && raa.a(idirect3dsurface_63_.LockRect(0, 0, i_61_, i_62_, 16, (((ha_Sub3_Sub2) this).aPixelBuffer8773)), (byte) 115)) {
            is = new int[i_61_ * i_62_];
            int i_64_ = ((ha_Sub3_Sub2) this).aPixelBuffer8773.getRowPitch();
            if ((4 * i_61_ ^ 0xffffffff) != (i_64_ ^ 0xffffffff)) {
                for (int i_65_ = 0; i_65_ < i_62_; i_65_++)
                    ((ha_Sub3_Sub2) this).aPixelBuffer8773.b(is, i_61_ * i_65_, i_64_ * i_65_, i_61_);
            } else
                ((ha_Sub3_Sub2) this).aPixelBuffer8773.b(is, 0, 0, i_62_ * i_61_);
            idirect3dsurface_63_.UnlockRect();
        }
        idirect3dsurface.a((byte) -113);
        idirect3dsurface_63_.a((byte) -80);
        return is;
    }

    final void method931(int i, int i_66_, Interface18_Impl1 interface18_impl1) {
        if (i_66_ != 8)
            method1010(6, true);
        Class314 class314 = (Class314) interface18_impl1;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetStreamSource(i, ((Class314) class314).anIDirect3DVertexBuffer8595, 0, class314.method3276((byte) -65));
    }

    final boolean y() {
        return false;
    }

    final void method965(byte i) {
        aD3DLIGHT8790.SetDirection(-((ha_Sub3_Sub2) this).aFloatArray6182[0], -((ha_Sub3_Sub2) this).aFloatArray6182[1], -((ha_Sub3_Sub2) this).aFloatArray6182[2]);
        if (i == -124) {
            aD3DLIGHT8780.SetDirection(-((ha_Sub3_Sub2) this).aFloatArray6195[0], -((ha_Sub3_Sub2) this).aFloatArray6195[1], -((ha_Sub3_Sub2) this).aFloatArray6195[2]);
            aBoolean8784 = false;
        }
    }

    final void method982(int i) {
        if (anIDirect3DVertexShader8795 == null && (((ha_Sub3_Sub2) this).aClass34Array6216[((ha_Sub3_Sub2) this).anInt6207]) != Class341.aClass34_3971) {
            if (Node_Sub14_Sub16.aClass34_9338 != (((ha_Sub3_Sub2) this).aClass34Array6216[((ha_Sub3_Sub2) this).anInt6207]))
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTransform(16 - -((ha_Sub3_Sub2) this).anInt6207, ((ha_Sub3_Sub2) this).aClass238_Sub2Array6169[((ha_Sub3_Sub2) this).anInt6207].method1901((byte) -53, aFloatArray8792));
            else
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTransform(16 + ((ha_Sub3_Sub2) this).anInt6207, ((ha_Sub3_Sub2) this).aClass238_Sub2Array6169[((ha_Sub3_Sub2) this).anInt6207].method1902(0, aFloatArray8792));
            int i_67_ = method1062((byte) 125, (((ha_Sub3_Sub2) this).aClass34Array6216[((ha_Sub3_Sub2) this).anInt6207]));
            if (anIntArray8798[((ha_Sub3_Sub2) this).anInt6207] != i_67_) {
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, 24, i_67_);
                anIntArray8798[((ha_Sub3_Sub2) this).anInt6207] = i_67_;
            }
        } else {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, 24, 0);
            anIntArray8798[((ha_Sub3_Sub2) this).anInt6207] = 0;
        }
        int i_68_ = -92 % ((-35 - i) / 49);
    }

    final void method930(boolean bool, int i, int i_69_, Class280 class280) {
        int i_70_ = i_69_;
        int i_71_ = i;
        int i_72_;
        while_142_:
        do {
            do {
                if (1 != i_71_) {
                    if (i_71_ != 2)
                        break;
                } else {
                    i_72_ = 6;
                    break while_142_;
                }
                i_72_ = 27;
                break while_142_;
            } while (false);
            i_72_ = 5;
        } while (false);
        if (bool)
            i_70_ |= 0x10;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(((ha_Sub3_Sub2) this).anInt6207, i_72_, method1069(class280, 0) | i_70_);
    }

    final Interface18_Impl1 method1010(int i, boolean bool) {
        if (i < 32)
            anIntArray8798 = null;
        return new Class314(this, bool);
    }

    final void method934(Class14 class14, int i, int i_73_, int i_74_) {
        if (i_74_ == 0)
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.DrawPrimitive(method1070(class14, (byte) 54), i_73_, i);
    }

    final void method1041(int i) {
        ((ha_Sub3_Sub2) this).aFloat6190 = (float) (-((ha_Sub3_Sub2) this).anInt6223 + ((ha_Sub3_Sub2) this).anInt6164);
        ((ha_Sub3_Sub2) this).aFloat6171 = ((float) -((ha_Sub3_Sub2) this).anInt6158 + ((ha_Sub3_Sub2) this).aFloat6190);
        if (i != 16)
            method1071(34, null);
        if (((ha_Sub3_Sub2) this).aFloat6171 < (float) ((ha_Sub3_Sub2) this).anInt6173)
            ((ha_Sub3_Sub2) this).aFloat6171 = (float) ((ha_Sub3_Sub2) this).anInt6173;
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(36, ((ha_Sub3_Sub2) this).aFloat6171);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(37, ((ha_Sub3_Sub2) this).aFloat6190);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(34, ((ha_Sub3_Sub2) this).anInt6214);
    }

    final void method997(byte i) {
        if (i <= -92) {
            float f = (!((ha_Sub3_Sub2) this).aBoolean6186 ? 0.0F : ((ha_Sub3_Sub2) this).aFloat6244);
            float f_75_ = (((ha_Sub3_Sub2) this).aBoolean6186 ? -((ha_Sub3_Sub2) this).aFloat6249 : 0.0F);
            aD3DLIGHT8790.SetDiffuse(((ha_Sub3_Sub2) this).aFloat6185 * f, f * ((ha_Sub3_Sub2) this).aFloat6224, ((ha_Sub3_Sub2) this).aFloat6202 * f, 0.0F);
            aD3DLIGHT8780.SetDiffuse(f_75_ * ((ha_Sub3_Sub2) this).aFloat6185, ((ha_Sub3_Sub2) this).aFloat6224 * f_75_, f_75_ * ((ha_Sub3_Sub2) this).aFloat6202, 0.0F);
            aBoolean8784 = false;
        }
    }

    final void p() {
        ((ha_Sub3_Sub2) this).anUca8771.b(-13759);
        super.p();
    }

    final void k() {
        /* empty */
    }

    final void method954(byte i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(60, ((ha_Sub3_Sub2) this).anInt6204);
        if (i > -91)
            aClass171Array8783 = null;
    }

    final Interface18_Impl2 method924(int i, boolean bool) {
        if (i != -23469)
            ((ha_Sub3_Sub2) this).aGeometryBuffer8778 = null;
        return new Class217(this, Class228.aClass228_2574, bool);
    }

    final void w() {
        IDirect3DEventQuery idirect3deventquery = ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.c();
        if (raa.a(idirect3deventquery.Issue(), (byte) 119)) {
            for (; ; ) {
                int i = idirect3deventquery.IsSignaled();
                if (-2 != (i ^ 0xffffffff))
                    break;
                Thread.yield();
            }
        }
        idirect3deventquery.a((byte) -81);
    }

    final void method960(boolean bool) {
        aD3DLIGHT8790.SetAmbient((((ha_Sub3_Sub2) this).aFloat6185 * ((ha_Sub3_Sub2) this).aFloat6170), (((ha_Sub3_Sub2) this).aFloat6224 * ((ha_Sub3_Sub2) this).aFloat6170), (((ha_Sub3_Sub2) this).aFloat6202 * ((ha_Sub3_Sub2) this).aFloat6170), 0.0F);
        aBoolean8784 = false;
        if (bool != true)
            aBooleanArray8788 = null;
    }

    final void method1049(boolean bool) {
        if (((ha_Sub3_Sub2) this).aBoolean6138) {
            aFloatArray8792[8] = 0.0F;
            aFloatArray8792[4] = 0.0F;
            aFloatArray8792[2] = 0.0F;
            aFloatArray8792[5] = 1.0F;
            aFloatArray8792[13] = 0.0F;
            aFloatArray8792[6] = 0.0F;
            aFloatArray8792[1] = 0.0F;
            aFloatArray8792[7] = 0.0F;
            aFloatArray8792[9] = 0.0F;
            aFloatArray8792[15] = 1.0F;
            aFloatArray8792[0] = 1.0F;
            aFloatArray8792[3] = 0.0F;
            aFloatArray8792[10] = 1.0F;
            aFloatArray8792[14] = 0.0F;
            aFloatArray8792[12] = 0.0F;
            aFloatArray8792[11] = 0.0F;
        } else
            ((ha_Sub3_Sub2) this).aClass238_Sub2_6141.method1901((byte) 105, aFloatArray8792);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTransform(256, aFloatArray8792);
        if (bool != true)
            aBooleanArray8776 = null;
    }

    final void method1067(IDirect3DPixelShader idirect3dpixelshader, int i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetPixelShader(idirect3dpixelshader);
        if (i != 23)
            u();
    }

    private ha_Sub3_Sub2(int i, int i_76_, Canvas canvas, uca var_uca, IDirect3D idirect3d, IDirect3DDevice idirect3ddevice, Class153 class153, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, d var_d, Class381 class381, int i_77_) {
        super(canvas, class153, var_d, class381, i_77_, 0);
        anInt8774 = 0;
        try {
            anIDirect3D8772 = idirect3d;
            anInt8786 = i;
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781 = idirect3ddevice;
            aClass153_8793 = class153;
            aD3DPRESENT_PARAMETERS8779 = d3dpresent_parameters;
            ((ha_Sub3_Sub2) this).anUca8771 = var_uca;
            ((ha_Sub3_Sub2) this).aD3DCAPS8794 = d3dcaps;
            anInt8791 = i_76_;
            aD3DLIGHT8790 = new D3DLIGHT(((ha_Sub3_Sub2) this).anUca8771);
            aD3DLIGHT8780 = new D3DLIGHT(((ha_Sub3_Sub2) this).anUca8771);
            aD3DLIGHT8787 = new D3DLIGHT(((ha_Sub3_Sub2) this).anUca8771);
            ((ha_Sub3_Sub2) this).aPixelBuffer8773 = new PixelBuffer(((ha_Sub3_Sub2) this).anUca8771);
            ((ha_Sub3_Sub2) this).aGeometryBuffer8778 = new GeometryBuffer(((ha_Sub3_Sub2) this).anUca8771);
            new GeometryBuffer(((ha_Sub3_Sub2) this).anUca8771);
            ((ha_Sub3_Sub2) this).aBoolean6239 = -1 != (((ha_Sub3_Sub2) this).aD3DCAPS8794.TextureCaps & 0x800 ^ 0xffffffff);
            ((ha_Sub3_Sub2) this).aBoolean6233 = ((0x2000 & ((ha_Sub3_Sub2) this).aD3DCAPS8794.TextureCaps) != 0);
            ((ha_Sub3_Sub2) this).aBoolean8777 = -1 == (0x2 & ((ha_Sub3_Sub2) this).aD3DCAPS8794.TextureCaps ^ 0xffffffff);
            ((ha_Sub3_Sub2) this).anInt6192 = (-1 > (((ha_Sub3_Sub2) this).aD3DCAPS8794.MaxActiveLights ^ 0xffffffff) ? ((ha_Sub3_Sub2) this).aD3DCAPS8794.MaxActiveLights : 8);
            ((ha_Sub3_Sub2) this).aBoolean8782 = (-1 != (((ha_Sub3_Sub2) this).aD3DCAPS8794.TextureCaps & 0x10000 ^ 0xffffffff));
            ((ha_Sub3_Sub2) this).aBoolean8789 = ((((ha_Sub3_Sub2) this).aD3DCAPS8794.TextureCaps & 0x4000) != 0);
            ((ha_Sub3_Sub2) this).anInt6236 = ((ha_Sub3_Sub2) this).aD3DCAPS8794.MaxSimultaneousTextures;
            ((ha_Sub3_Sub2) this).aBoolean6177 = (-1 > (((ha_Sub3_Sub2) this).anInt6206 ^ 0xffffffff) || ((anIDirect3D8772.CheckDeviceMultiSampleType(anInt8786, anInt8791, aD3DPRESENT_PARAMETERS8779.BackBufferFormat, true, 2)) ^ 0xffffffff) == -1);
            aBooleanArray8788 = new boolean[((ha_Sub3_Sub2) this).anInt6236];
            aBooleanArray8776 = new boolean[((ha_Sub3_Sub2) this).anInt6236];
            anIntArray8798 = new int[((ha_Sub3_Sub2) this).anInt6236];
            aBooleanArray8796 = new boolean[((ha_Sub3_Sub2) this).anInt6236];
            aClass171Array8783 = new Class171[((ha_Sub3_Sub2) this).anInt6236];
            aBooleanArray8775 = new boolean[((ha_Sub3_Sub2) this).anInt6236];
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.BeginScene();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            method819(119);
            throw new RuntimeException("");
        }
    }

    final void method1026(int i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(174, ((ha_Sub3_Sub2) this).aBoolean6276);
        int i_78_ = 56 / ((i - -51) / 62);
    }

    final void method1013(int i) {
        for (int i_79_ = 0; ((ha_Sub3_Sub2) this).anInt6236 > i_79_; i_79_++) {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(i_79_, 7, 0);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(i_79_, 6, 2);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(i_79_, 5, 2);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(i_79_, 1, 1);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(i_79_, 2, 1);
            aClass171Array8783[i_79_] = Class162.aClass171_1904;
            aBooleanArray8775[i_79_] = aBooleanArray8776[i_79_] = true;
            aBooleanArray8788[i_79_] = false;
            anIntArray8798[i_79_] = 0;
        }
        if (i < 77)
            method944(-60, -111, true, null, -66, 16, (byte) -57, null);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTextureStageState(0, 6, 1);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(9, 2);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(23, 4);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(25, 5);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(24, 0);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(22, 2);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(147, 1);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(145, 1);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(38, 0.95F);
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(140, 3);
        aD3DLIGHT8790.SetType(3);
        aD3DLIGHT8780.SetType(3);
        aD3DLIGHT8787.SetType(1);
        aBoolean8784 = false;
        super.method1013(110);
    }

    final void method1068(Class35_Sub3 class35_sub3, byte i) {
        method1072(class35_sub3, false);
        if (i != 84)
            method1067(null, 32);
        if (aBooleanArray8775[((ha_Sub3_Sub2) this).anInt6207] != ((Class35_Sub3) class35_sub3).aBoolean5283) {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 1, !((Class35_Sub3) class35_sub3).aBoolean5283 ? 3 : 1);
            aBooleanArray8775[((ha_Sub3_Sub2) this).anInt6207] = ((Class35_Sub3) class35_sub3).aBoolean5283;
        }
        if (!((Class35_Sub3) class35_sub3).aBoolean5281 == aBooleanArray8776[((ha_Sub3_Sub2) this).anInt6207]) {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 2, ((Class35_Sub3) class35_sub3).aBoolean5281 ? 1 : 3);
            aBooleanArray8776[((ha_Sub3_Sub2) this).anInt6207] = ((Class35_Sub3) class35_sub3).aBoolean5281;
        }
    }

    final void a(float f, float f_80_, float f_81_) {
        /* empty */
    }

    final void a(Interface14 interface14) {
        /* empty */
    }

    final void method975(int i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(14, (((ha_Sub3_Sub2) this).aBoolean6188 && ((ha_Sub3_Sub2) this).aBoolean6219));
        if (i >= -57)
            ((ha_Sub3_Sub2) this).aD3DCAPS8794 = null;
    }

    final void GA(int i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.Clear(1, i, 0.0F, 0);
    }

    final boolean method933(int i, Class228 class228, Class264 class264) {
        if (i != -3119)
            ((ha_Sub3_Sub2) this).aPixelBuffer8773 = null;
        D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
        return (raa.a(anIDirect3D8772.a(anInt8786, d3ddisplaymode), (byte) 100) && raa.a((anIDirect3D8772.CheckDeviceFormat(anInt8786, anInt8791, d3ddisplaymode.Format, 0, 3, method1063((byte) 43, class228, class264))), (byte) 96));
    }

    final Class167 c() {
        D3DADAPTER_IDENTIFIER d3dadapter_identifier = anIDirect3D8772.b(anInt8786, 0);
        return new Class167(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
    }

    final Interface14 a(Interface13 interface13, Interface2 interface2) {
        return null;
    }

    private static final int method1069(Class280 class280, int i) {
        if (i != 0)
            method1071(-78, null);
        if (class280 != Class147.aClass280_1738) {
            if (class280 != Class282_Sub2.aClass280_7605) {
                if (class280 == Class346_Sub7_Sub3_Sub1.aClass280_10511)
                    return 1;
                if (Class380.aClass280_4649 == class280)
                    return 3;
            } else
                return 0;
        } else
            return 2;
        throw new IllegalArgumentException();
    }

    final void method921(boolean bool) {
        if (bool == true)
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(28, (((ha_Sub3_Sub2) this).aBoolean6209 && ((ha_Sub3_Sub2) this).aBoolean6235 && 0 <= ((ha_Sub3_Sub2) this).anInt6158));
    }

    final Object method1023(byte i, Canvas canvas) {
        if (i != 3)
            aClass171Array8783 = null;
        return null;
    }

    final void method1038(boolean bool) {
        if (bool)
            aD3DLIGHT8780 = null;
        if (Class337.aClass17_3932 != ((ha_Sub3_Sub2) this).aClass17_6194) {
            if (((ha_Sub3_Sub2) this).aClass17_6194 != Class330.aClass17_3854) {
                if (Node_Sub9_Sub1.aClass17_9105 == ((ha_Sub3_Sub2) this).aClass17_6194) {
                    ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(19, 9);
                    ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(20, 2);
                }
            } else {
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(19, 2);
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(20, 2);
            }
        } else {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(19, 5);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetRenderState(20, 6);
        }
    }

    final void a(int i, int i_82_, int i_83_, int i_84_) {
        /* empty */
    }

    final void a(boolean bool) {
        /* empty */
    }

    final void method928(Canvas canvas, int i, Object object) {
        if (i != -1)
            anInt8791 = -126;
        aClass153_8793 = (Class153) object;
    }

    final Interface2 a(int i, int i_85_) {
        return null;
    }

    final void method1004(Class185 class185, byte i) {
        if (i == -15) {
            dxVertexLayout var_dxVertexLayout = (dxVertexLayout) class185;
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetVertexDeclaration(((dxVertexLayout) var_dxVertexLayout).anIDirect3DVertexDeclaration6649);
        }
    }

    private static final int method1070(Class14 class14, byte i) {
        if (Class107.aClass14_1355 != class14) {
            if (Class214.aClass14_2470 != class14) {
                if (class14 != Class316_Sub1.aClass14_8045) {
                    if (class14 == OutputStream_Sub1.aClass14_86)
                        return 4;
                    if (Class14.aClass14_264 == class14)
                        return 6;
                    if (Class58.aClass14_5079 == class14)
                        return 5;
                } else
                    return 1;
            } else
                return 3;
        } else
            return 2;
        if (i != 54)
            return 117;
        throw new IllegalArgumentException("");
    }

    final Interface21_Impl2 method944(int i, int i_86_, boolean bool, Class264 class264, int i_87_, int i_88_, byte i_89_, float[] fs) {
        int i_90_ = -67 % ((i_89_ - -41) / 52);
        return null;
    }

    final Class185 method1005(byte i, Class194[] class194s) {
        int i_91_ = -4 / ((i - -66) / 53);
        return new dxVertexLayout(this, class194s);
    }

    final boolean method1044(Class228 class228, Class264 class264, int i) {
        if (i != 14)
            anIntArray8785 = null;
        D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
        return (raa.a(anIDirect3D8772.a(anInt8786, d3ddisplaymode), (byte) 105) && raa.a((anIDirect3D8772.CheckDeviceFormat(anInt8786, anInt8791, d3ddisplaymode.Format, 0, 4, method1063((byte) 27, class228, class264))), (byte) 124));
    }

    final void method943(int i) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.a(7, ((ha_Sub3_Sub2) this).aBoolean6211);
        if (i != 5481)
            aD3DLIGHT8780 = null;
    }

    private static final int method1071(int i, Class5 class5) {
        if (i != 9406)
            return 123;
        if (Class142.aClass5_1669 == class5)
            return 2;
        if (class5 != Class60.aClass5_821) {
            if (Class316_Sub1_Sub2.aClass5_9850 == class5)
                return 26;
            if (class5 == Class346_Sub4.aClass5_8272)
                return 7;
            if (Class46.aClass5_583 == class5)
                return 10;
        } else
            return 4;
        throw new IllegalArgumentException();
    }

    final Interface21_Impl3 method938(byte i, boolean bool, int[][] is, int i_92_) {
        if (i >= -97)
            method931(-49, -104, null);
        return new Class35_Sub2(this, i_92_, bool, is);
    }

    final void a(Rectangle[] rectangles, int i, int i_93_, int i_94_) throws Exception_Sub1 {
        e(i_93_, i_94_);
    }

    final void method1072(Class35 class35, boolean bool) {
        ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetTexture(((ha_Sub3_Sub2) this).anInt6207, class35.method280(-100));
        if (aClass171Array8783[((ha_Sub3_Sub2) this).anInt6207] != ((Class35) class35).aClass171_396) {
            int i = method1065(((Class35) class35).aClass171_396, 29895);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 6, i);
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 5, i);
            aClass171Array8783[((ha_Sub3_Sub2) this).anInt6207] = ((Class35) class35).aClass171_396;
            if (aBooleanArray8788[((ha_Sub3_Sub2) this).anInt6207] == !((Class35) class35).aBoolean397) {
                ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 7, (((Class35) class35).aBoolean397 ? method1065(((Class35) class35).aClass171_396, 29895) : 0));
                aBooleanArray8788[((ha_Sub3_Sub2) this).anInt6207] = ((Class35) class35).aBoolean397;
            }
        } else if (((Class35) class35).aBoolean397 != aBooleanArray8788[((ha_Sub3_Sub2) this).anInt6207]) {
            ((ha_Sub3_Sub2) this).anIDirect3DDevice8781.SetSamplerState(((ha_Sub3_Sub2) this).anInt6207, 7, (((Class35) class35).aBoolean397 ? method1065(((Class35) class35).aClass171_396, 29895) : 0));
            aBooleanArray8788[((ha_Sub3_Sub2) this).anInt6207] = ((Class35) class35).aBoolean397;
        }
        if (bool)
            aBooleanArray8776 = null;
        if (!aBooleanArray8796[((ha_Sub3_Sub2) this).anInt6207]) {
            aBooleanArray8796[((ha_Sub3_Sub2) this).anInt6207] = true;
            method1051((byte) 118);
            method1037(false);
        }
    }
}
