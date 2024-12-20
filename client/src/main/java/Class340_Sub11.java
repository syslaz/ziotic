/* Class340_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;

final class Class340_Sub11 extends Class340 {
    private ha_Sub3_Sub2 aHa_Sub3_Sub2_8228;
    private boolean aBoolean8229;
    private boolean aBoolean8230;
    private static float[] aFloatArray8231 = new float[16];
    private IDirect3DPixelShader anIDirect3DPixelShader8232;
    private IDirect3DVertexShader anIDirect3DVertexShader8233;
    private Class370 aClass370_8234;

    final void method3436(int i) {
        if (i == 3) {
            if (aBoolean8229) {
                IDirect3DDevice idirect3ddevice = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781);
                Class238_Sub2 class238_sub2 = aHa_Sub3_Sub2_8228.method1019((byte) 74);
                idirect3ddevice.a(0, class238_sub2.method1899(-99, aFloatArray8231));
            }
        }
    }

    final void method3443(boolean bool, boolean bool_0_) {
        if (bool != true)
            method3443(true, true);
        Interface21_Impl3 interface21_impl3 = ((Class340_Sub11) this).aHa_Sub3_3954.method974(0);
        if (aBoolean8230 && interface21_impl3 != null) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781;
            aHa_Sub3_Sub2_8228.method1060((byte) 71, anIDirect3DVertexShader8233);
            aHa_Sub3_Sub2_8228.method1067(anIDirect3DPixelShader8232, 23);
            ((Class340_Sub11) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340_Sub11) this).aHa_Sub3_3954.method929(interface21_impl3, -8423);
            ((Class340_Sub11) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            ((Class340_Sub11) this).aHa_Sub3_3954.method929(((Class370) aClass370_8234).anInterface21_Impl1_4550, -8423);
            aBoolean8229 = true;
            method3438((byte) 126);
            method3431(4095);
            method3444(4095);
            method3437(true);
            idirect3ddevice.a(1, -((ha_Sub3) (((Class340_Sub11) this).aHa_Sub3_3954)).aFloatArray6182[0], -((ha_Sub3) (((Class340_Sub11) this).aHa_Sub3_3954)).aFloatArray6182[1], -((ha_Sub3) (((Class340_Sub11) this).aHa_Sub3_3954)).aFloatArray6182[2], 0.0F);
            idirect3ddevice.a(2, ((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aFloat6185, ((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aFloat6224, ((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aFloat6202, 1.0F);
            idirect3ddevice.a(3, Math.abs(((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aFloatArray6182[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    final void method3431(int i) {
        if (i != 4095)
            aFloatArray8231 = null;
        if (aBoolean8229) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781;
            Class238_Sub2 class238_sub2 = ((Class340_Sub11) this).aHa_Sub3_3954.method979((byte) 114);
            idirect3ddevice.SetVertexShaderConstantF(12, class238_sub2.method1882(false, aFloatArray8231), 2);
        }
    }

    final void method3437(boolean bool) {
        if (aBoolean8229) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781;
            if (0 >= ((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).anInt6158)
                idirect3ddevice.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
            else {
                float f = (((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aFloat6190);
                float f_1_ = (((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aFloat6171);
                idirect3ddevice.b(16, f, 1.0F / (-f_1_ + f), 0.0F, 0.0F);
            }
            idirect3ddevice.a(0, (float) ((0xffc2e0 & (((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).anInt6214)) >> 406645648) / 255.0F, (float) ((0xff43 & (((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).anInt6214)) >> 236500168) / 255.0F, (float) (0xff & (((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).anInt6214)) / 255.0F, 0.0F);
        }
        if (bool != true)
            method3444(-116);
    }

    Class340_Sub11(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class381 class381, Class370 class370) {
        super(var_ha_Sub3_Sub2);
        aHa_Sub3_Sub2_8228 = var_ha_Sub3_Sub2;
        aClass370_8234 = class370;
        if (null == class381 || !((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aBoolean6239 || !((ha_Sub3) ((Class340_Sub11) this).aHa_Sub3_3954).aBoolean6233 || -258 < ((((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).aD3DCAPS8794.VertexShaderVersion) & 0xffff ^ 0xffffffff)) {
            anIDirect3DPixelShader8232 = null;
            anIDirect3DVertexShader8233 = null;
            aBoolean8230 = false;
        } else {
            anIDirect3DVertexShader8233 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781.b(class381.method3908("environment_mapped_water_v", "dx", (byte) 106)));
            anIDirect3DPixelShader8232 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781.a(class381.method3908("environment_mapped_water_f", "dx", (byte) 117)));
            aBoolean8230 = (null != anIDirect3DVertexShader8233 && null != anIDirect3DPixelShader8232 && aClass370_8234.method3852(-17546));
        }
    }

    final void method3442(Interface21 interface21, int i, byte i_2_) {
        if (i_2_ <= 68)
            anIDirect3DPixelShader8232 = null;
    }

    final void method3438(byte i) {
        if (aBoolean8229) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781;
            Class238_Sub2 class238_sub2 = aHa_Sub3_Sub2_8228.method973(true);
            Class238_Sub2 class238_sub2_3_ = aHa_Sub3_Sub2_8228.method1019((byte) 34);
            idirect3ddevice.a(0, class238_sub2_3_.method1899(107, aFloatArray8231));
            idirect3ddevice.a(4, class238_sub2.method1877(aFloatArray8231, 26071));
        }
        if (i <= 115)
            aBoolean8229 = false;
    }

    final void method3435(boolean bool, int i) {
        if (i <= 109)
            method3444(110);
    }

    final boolean method3432(int i) {
        if (i != 4095)
            return true;
        return aBoolean8230;
    }

    final void method3433(int i, int i_4_, int i_5_) {
        if (aBoolean8229) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781;
            int i_6_ = 1 << (0x3 & i_4_);
            float f = (float) (1 << (i_4_ >> 930927939 & 0x7)) / 32.0F;
            int i_7_ = i_5_ & 0xffff;
            idirect3ddevice.b(14, (float) (((ha_Sub3) (((Class340_Sub11) this).aHa_Sub3_3954)).anInt6187 * i_6_ % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float f_8_ = (float) ((0x3b787 & i_5_) >> -286573552) / 8.0F;
            idirect3ddevice.b(15, f, 0.0F, 0.0F, 0.0F);
            idirect3ddevice.a(4, (float) i_7_, 0.0F, 0.0F, 0.0F);
            idirect3ddevice.a(5, f_8_, 0.0F, 0.0F, 0.0F);
        }
        if (i != -26427)
            method3431(57);
    }

    final void method3441(boolean bool) {
        if (bool != true)
            method3433(36, 1, 93);
        if (aBoolean8229) {
            aHa_Sub3_Sub2_8228.method1060((byte) 71, null);
            aHa_Sub3_Sub2_8228.method1067(null, 23);
            ((Class340_Sub11) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340_Sub11) this).aHa_Sub3_3954.method929(null, -8423);
            ((Class340_Sub11) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            ((Class340_Sub11) this).aHa_Sub3_3954.method929(null, -8423);
            aBoolean8229 = false;
        }
    }

    final void method3444(int i) {
        if (i == 4095) {
            if (aBoolean8229) {
                IDirect3DDevice idirect3ddevice = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8228).anIDirect3DDevice8781);
                idirect3ddevice.a(8, ((Class340_Sub11) this).aHa_Sub3_3954.method927(true, aFloatArray8231));
            }
        }
    }
}
