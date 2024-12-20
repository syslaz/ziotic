/* Class340_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class340_Sub1 extends Class340 {
    private ha_Sub3_Sub2 aHa_Sub3_Sub2_8087;
    private static float[] aFloatArray8088 = new float[4];
    private Interface21_Impl2 anInterface21_Impl2_8089;
    private IDirect3DVertexShader anIDirect3DVertexShader8090;
    private boolean aBoolean8091 = false;
    private boolean aBoolean8092;
    private IDirect3DVertexShader anIDirect3DVertexShader8093;
    private IDirect3DVertexShader anIDirect3DVertexShader8094;
    private IDirect3DVertexShader anIDirect3DVertexShader8095;
    private IDirect3DVertexShader anIDirect3DVertexShader8096;
    private static float[] aFloatArray8097 = new float[16];
    private boolean aBoolean8098;

    final void method3433(int i, int i_0_, int i_1_) {
        if (i != -26427)
            anIDirect3DVertexShader8095 = null;
    }

    final void method3438(byte i) {
        if (null != anIDirect3DVertexShader8090) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781;
            Class238_Sub2 class238_sub2 = aHa_Sub3_Sub2_8087.method1019((byte) 120);
            idirect3ddevice.a(0, class238_sub2.method1899(99, aFloatArray8097));
        }
        if (i < 115)
            method3442(null, -51, (byte) 10);
    }

    private final void method3446(int i) {
        if (anIDirect3DVertexShader8090 != null && aBoolean8092) {
            Class238_Sub2 class238_sub2 = ((Class340_Sub1) this).aHa_Sub3_3954.method958(63);
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781;
            idirect3ddevice.b(13, (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6185 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6170)), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6170 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6224)), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6202 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6170)), 1.0F);
            idirect3ddevice.b(14, (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6185 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6244)), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6244 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6224)), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6202 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6244)), 1.0F);
            idirect3ddevice.b(16, (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6249 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6185)), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6249 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6224)), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6202 * (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6249)), 1.0F);
            class238_sub2.method1892(aFloatArray8088, (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloatArray6182[2]), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloatArray6182[0]), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloatArray6182[1]), -28422);
            idirect3ddevice.SetVertexShaderConstantF(15, aFloatArray8088, 1);
            class238_sub2.method1892(aFloatArray8088, (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloatArray6195[2]), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloatArray6195[0]), (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloatArray6195[1]), -28422);
            idirect3ddevice.SetVertexShaderConstantF(17, aFloatArray8088, 1);
        }
        if (i < 95)
            aBoolean8098 = false;
    }

    final void method3431(int i) {
        if (i == 4095) {
            if (null != anIDirect3DVertexShader8090) {
                IDirect3DDevice idirect3ddevice = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781);
                Class238_Sub2 class238_sub2 = ((Class340_Sub1) this).aHa_Sub3_3954.method979((byte) 114);
                idirect3ddevice.SetVertexShaderConstantF(8, class238_sub2.method1882(false, aFloatArray8097), 2);
            }
        }
    }

    final void method3443(boolean bool, boolean bool_2_) {
        aBoolean8092 = bool_2_;
        ((Class340_Sub1) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        ((Class340_Sub1) this).aHa_Sub3_3954.method929(anInterface21_Impl2_8089, -8423);
        ((Class340_Sub1) this).aHa_Sub3_3954.method955((byte) 101, Class142.aClass5_1669, (Class316_Sub1_Sub2.aClass5_9850));
        ((Class340_Sub1) this).aHa_Sub3_3954.method946(0, -71, Class380.aClass280_4649);
        ((Class340_Sub1) this).aHa_Sub3_3954.method1017(-8980, 2, Class147.aClass280_1738, false, bool);
        ((Class340_Sub1) this).aHa_Sub3_3954.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 119, 0);
        ((Class340_Sub1) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        method3439((byte) 9);
    }

    final void method3444(int i) {
        if (anIDirect3DVertexShader8090 != null) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781;
            idirect3ddevice.a(4, ((Class340_Sub1) this).aHa_Sub3_3954.method927(true, aFloatArray8097));
        }
        if (i != 4095)
            method3439((byte) -84);
    }

    final void method3442(Interface21 interface21, int i, byte i_3_) {
        if (interface21 == null) {
            if (!aBoolean8091) {
                ((Class340_Sub1) this).aHa_Sub3_3954.method929((((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).anInterface21_6237), -8423);
                ((Class340_Sub1) this).aHa_Sub3_3954.method993((byte) 107, 1);
                ((Class340_Sub1) this).aHa_Sub3_3954.method946(0, -102, Class346_Sub7_Sub3_Sub1.aClass280_10511);
                ((Class340_Sub1) this).aHa_Sub3_3954.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 99, 0);
                aBoolean8091 = true;
            }
        } else {
            if (aBoolean8091) {
                ((Class340_Sub1) this).aHa_Sub3_3954.method946(0, -113, Class147.aClass280_1738);
                ((Class340_Sub1) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 85, 0);
                aBoolean8091 = false;
            }
            ((Class340_Sub1) this).aHa_Sub3_3954.method929(interface21, -8423);
            ((Class340_Sub1) this).aHa_Sub3_3954.method993((byte) 120, i);
        }
        if (i_3_ <= 68)
            anInterface21_Impl2_8089 = null;
    }

    final void method3435(boolean bool, int i) {
        if (i < 109)
            method3446(31);
    }

    final void method3436(int i) {
        if (i != 3)
            aFloatArray8097 = null;
        if (null != anIDirect3DVertexShader8090) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781;
            Class238_Sub2 class238_sub2 = aHa_Sub3_Sub2_8087.method1019((byte) 93);
            idirect3ddevice.a(0, class238_sub2.method1899(i ^ ~0x18, aFloatArray8097));
        }
    }

    final void method3437(boolean bool) {
        if (bool != true)
            anIDirect3DVertexShader8095 = null;
        if (anIDirect3DVertexShader8090 != null) {
            IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781;
            int i = ((Class340_Sub1) this).aHa_Sub3_3954.XA();
            int i_4_ = ((Class340_Sub1) this).aHa_Sub3_3954.i();
            float f = (float) i - (float) (i - i_4_) * 0.125F;
            float f_5_ = -(0.25F * (float) (i + -i_4_)) + (float) i;
            idirect3ddevice.b(10, f_5_, 1.0F / (-f_5_ + f), f, 1.0F / (-f + (float) i));
            idirect3ddevice.b(11, 1.0F / (float) ((Class340_Sub1) this).aHa_Sub3_3954.method1035(-104), (float) ((Class340_Sub1) this).aHa_Sub3_3954.method978(-31039) / 255.0F, ((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6190, 1.0F / (-(((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6171) + (((ha_Sub3) ((Class340_Sub1) this).aHa_Sub3_3954).aFloat6190)));
            ((Class340_Sub1) this).aHa_Sub3_3954.method976(((Class340_Sub1) this).aHa_Sub3_3954.method1002(58), false);
        }
    }

    final boolean method3432(int i) {
        if (i != 4095)
            anIDirect3DVertexShader8090 = null;
        return aBoolean8098;
    }

    final void method3441(boolean bool) {
        ((Class340_Sub1) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        ((Class340_Sub1) this).aHa_Sub3_3954.method929(null, -8423);
        ((Class340_Sub1) this).aHa_Sub3_3954.method955((byte) 94, Class60.aClass5_821, Class60.aClass5_821);
        ((Class340_Sub1) this).aHa_Sub3_3954.method946(0, 107, Class147.aClass280_1738);
        ((Class340_Sub1) this).aHa_Sub3_3954.method946(2, 70, Class380.aClass280_4649);
        ((Class340_Sub1) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 126, 0);
        if (bool != true)
            method3439((byte) 123);
        ((Class340_Sub1) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        if (aBoolean8091) {
            ((Class340_Sub1) this).aHa_Sub3_3954.method946(0, 46, Class147.aClass280_1738);
            ((Class340_Sub1) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 120, 0);
            aBoolean8091 = false;
        }
        if (null != anIDirect3DVertexShader8090) {
            aHa_Sub3_Sub2_8087.method1060((byte) 71, null);
            anIDirect3DVertexShader8090 = null;
        }
    }

    Class340_Sub1(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class381 class381) {
        super(var_ha_Sub3_Sub2);
        aHa_Sub3_Sub2_8087 = var_ha_Sub3_Sub2;
        if (null != class381 && (0xffff & (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).aD3DCAPS8794.VertexShaderVersion) ^ 0xffffffff) <= -258) {
            anIDirect3DVertexShader8096 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781.b(class381.method3908("uw_ground_unlit", "dx", (byte) 92)));
            anIDirect3DVertexShader8093 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781.b(class381.method3908("uw_ground_lit", "dx", (byte) 120)));
            anIDirect3DVertexShader8094 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781.b(class381.method3908("uw_model_unlit", "dx", (byte) 105)));
            anIDirect3DVertexShader8095 = (((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781.b(class381.method3908("uw_model_lit", "dx", (byte) 100)));
            if (!(anIDirect3DVertexShader8095 != null & (anIDirect3DVertexShader8096 != null & anIDirect3DVertexShader8093 != null & null != anIDirect3DVertexShader8094)))
                aBoolean8098 = false;
            else {
                anInterface21_Impl2_8089 = (((Class340_Sub1) this).aHa_Sub3_3954.method1033(2, new int[]{0, -1}, (byte) -53, false, 1));
                anInterface21_Impl2_8089.method70(1645, false, false);
                aBoolean8098 = true;
            }
        } else
            aBoolean8098 = false;
    }

    final void method3439(byte i) {
        int i_6_ = -25 / ((-46 - i) / 55);
        IDirect3DDevice idirect3ddevice = ((ha_Sub3_Sub2) aHa_Sub3_Sub2_8087).anIDirect3DDevice8781;
        int i_7_ = ((Class340_Sub1) this).aHa_Sub3_3954.method1053(-8);
        Class238_Sub2 class238_sub2 = ((Class340_Sub1) this).aHa_Sub3_3954.method973(true);
        IDirect3DVertexShader idirect3dvertexshader;
        if (!aBoolean8092)
            idirect3dvertexshader = (i_7_ == 2147483647 ? anIDirect3DVertexShader8096 : anIDirect3DVertexShader8094);
        else
            idirect3dvertexshader = (i_7_ != 2147483647 ? anIDirect3DVertexShader8095 : anIDirect3DVertexShader8093);
        if (idirect3dvertexshader != anIDirect3DVertexShader8090) {
            anIDirect3DVertexShader8090 = idirect3dvertexshader;
            aHa_Sub3_Sub2_8087.method1060((byte) 71, idirect3dvertexshader);
            method3446(104);
            method3444(4095);
            method3431(4095);
            method3436(3);
            method3438((byte) 117);
            method3437(true);
        }
        class238_sub2.method1897(aFloatArray8088, -1.0F, true, 0.0F, 0.0F, (float) i_7_);
        idirect3ddevice.a(12, aFloatArray8088);
    }
}
