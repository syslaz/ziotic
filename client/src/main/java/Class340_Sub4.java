/* Class340_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class340_Sub4 extends Class340 {
    private static float[] aFloatArray8122 = new float[16];
    private IDirect3DVertexShader anIDirect3DVertexShader8123;
    private Class370 aClass370_8124;
    private ha_Sub3_Sub2 aHa_Sub3_Sub2_8125;

    Class340_Sub4(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class381 class381, Class370 class370) {
        super(var_ha_Sub3_Sub2);
        aHa_Sub3_Sub2_8125 = var_ha_Sub3_Sub2;
        aClass370_8124 = class370;
        if (class381 == null || !aClass370_8124.method3856((byte) -42) || (0xffff & (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).aD3DCAPS8794.VertexShaderVersion) ^ 0xffffffff) > -258)
            anIDirect3DVertexShader8123 = null;
        else
            anIDirect3DVertexShader8123 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781.b(class381.method3908("transparent_water", "dx", (byte) 95)));
    }

    final void method3444(int i) {
        if (i == 4095) {
            if (anIDirect3DVertexShader8123 != null) {
                IDirect3DDevice idirect3ddevice = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781);
                idirect3ddevice.a(4, ((Class340_Sub4) this).aHa_Sub3_3954.method927(true, aFloatArray8122));
            }
        }
    }

    final void method3436(int i) {
        if (i != 3)
            method3437(false);
        if (null != anIDirect3DVertexShader8123) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781;
            Class238_Sub2 class238_sub2 = aHa_Sub3_Sub2_8125.method1019((byte) 112);
            idirect3ddevice.a(0, class238_sub2.method1899(95, aFloatArray8122));
        }
    }

    final void method3437(boolean bool) {
        if (anIDirect3DVertexShader8123 != null) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781;
            if (0 < ((ha_Sub3) ((Class340_Sub4) this).aHa_Sub3_3954).anInt6158) {
                float f = (((ha_Sub3) ((Class340_Sub4) this).aHa_Sub3_3954).aFloat6190);
                float f_0_ = (((ha_Sub3) ((Class340_Sub4) this).aHa_Sub3_3954).aFloat6171);
                float f_1_ = -512.0F + f_0_;
                idirect3ddevice.b(10, f_1_, 1.0F / (f_0_ - f_1_), f_0_, 1.0F / (-f_0_ + f));
            } else
                idirect3ddevice.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
            ((Class340_Sub4) this).aHa_Sub3_3954.method976(((ha_Sub3) ((Class340_Sub4) this).aHa_Sub3_3954).anInt6214, false);
        }
        if (bool != true)
            method3435(false, -91);
    }

    final void method3435(boolean bool, int i) {
        if (i >= 109)
            ((Class340_Sub4) this).aHa_Sub3_3954.method955((byte) 46, (Class346_Sub4.aClass5_8272), (Class316_Sub1_Sub2.aClass5_9850));
    }

    final void method3442(Interface21 interface21, int i, byte i_2_) {
        if (i_2_ < 68)
            aFloatArray8122 = null;
    }

    final boolean method3432(int i) {
        if (i != 4095)
            method3444(124);
        return null != anIDirect3DVertexShader8123;
    }

    final void method3433(int i, int i_3_, int i_4_) {
        IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781;
        if (((Class370) aClass370_8124).aBoolean4544) {
            float f = ((float) ((((ha_Sub3) ((Class340_Sub4) this).aHa_Sub3_3954).anInt6187) % 4000) / 4000.0F);
            ((Class340_Sub4) this).aHa_Sub3_3954.method929(((Class370) aClass370_8124).anInterface21_Impl1_4554, -8423);
            idirect3ddevice.b(11, f, 0.0F, 0.0F, 0.0F);
        } else {
            int i_5_ = 16 * ((((ha_Sub3) ((Class340_Sub4) this).aHa_Sub3_3954).anInt6187) % 4000) / 4000;
            ((Class340_Sub4) this).aHa_Sub3_3954.method929((((Class370) aClass370_8124).anInterface21_Impl2Array4545[i_5_]), -8423);
            idirect3ddevice.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (i != -26427)
            method3441(false);
    }

    final void method3431(int i) {
        if (null != anIDirect3DVertexShader8123) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781;
            Class238_Sub2 class238_sub2 = ((Class340_Sub4) this).aHa_Sub3_3954.method979((byte) 114);
            class238_sub2.method1882(false, aFloatArray8122);
            aFloatArray8122[5] *= 0.25F;
            aFloatArray8122[0] *= 0.25F;
            aFloatArray8122[3] *= 0.25F;
            aFloatArray8122[1] *= 0.25F;
            aFloatArray8122[6] *= 0.25F;
            aFloatArray8122[7] *= 0.25F;
            aFloatArray8122[4] *= 0.25F;
            aFloatArray8122[2] *= 0.25F;
            idirect3ddevice.SetVertexShaderConstantF(8, aFloatArray8122, 2);
        }
        if (i != 4095)
            method3437(false);
    }

    final void method3443(boolean bool, boolean bool_6_) {
        ((Class340_Sub4) this).aHa_Sub3_3954.method946(0, -121, Class147.aClass280_1738);
        ((Class340_Sub4) this).aHa_Sub3_3954.method946(1, -88, Class380.aClass280_4649);
        ((Class340_Sub4) this).aHa_Sub3_3954.method1017(-8980, 2, Class282_Sub2.aClass280_7605, true, false);
        ((Class340_Sub4) this).aHa_Sub3_3954.method1014((byte) -88, false);
        aHa_Sub3_Sub2_8125.method1060((byte) 71, anIDirect3DVertexShader8123);
        method3436(3);
        method3431(4095);
        method3444(4095);
        method3437(bool);
    }

    final void method3441(boolean bool) {
        aHa_Sub3_Sub2_8125.method1060((byte) 71, null);
        ((Class340_Sub4) this).aHa_Sub3_3954.method946(0, -82, Class147.aClass280_1738);
        ((Class340_Sub4) this).aHa_Sub3_3954.method946(1, 80, Class282_Sub2.aClass280_7605);
        ((Class340_Sub4) this).aHa_Sub3_3954.method946(2, -64, Class380.aClass280_4649);
        ((Class340_Sub4) this).aHa_Sub3_3954.method1014((byte) 85, bool);
    }

    final void method3438(byte i) {
        if (i > 115) {
            if (null != anIDirect3DVertexShader8123) {
                IDirect3DDevice idirect3ddevice = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8125).anIDirect3DDevice8781);
                Class238_Sub2 class238_sub2 = aHa_Sub3_Sub2_8125.method1019((byte) 66);
                idirect3ddevice.a(0, class238_sub2.method1899(-119, aFloatArray8122));
            }
        }
    }
}
