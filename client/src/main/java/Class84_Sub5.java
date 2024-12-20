/* Class84_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub5 extends Class84 {
    static int anInt5421;
    static int anInt5422;
    static int anInt5423;
    static int anInt5424;
    static int anInt5425 = 0;
    static int anInt5426;
    private Class183 aClass183_5427;
    static int anInt5428;
    static int anInt5429;
    static int anInt5430 = 0;
    static int anInt5431;
    private Class357 aClass357_5432;
    static int anInt5433;
    private Class136_Sub1 aClass136_Sub1_5434;

    final void method602(boolean bool, byte i) {
        if ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5921 ^ 0xffffffff) < -1) {
            float f = -0.5F / (float) (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5921);
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            Class282_Sub19.aFloatArray7793[2] = f;
            Class282_Sub19.aFloatArray7793[0] = 0.0F;
            Class282_Sub19.aFloatArray7793[1] = 0.0F;
            Class282_Sub19.aFloatArray7793[3] = (f * ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5868 + 0.25F);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, Class282_Sub19.aFloatArray7793, 0);
            OpenGL.glPopMatrix();
            ((Class84) this).aHa_Sub2_1036.method851(0.5F, -1026034392, (float) ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5921);
            ((Class84) this).aHa_Sub2_1036.method889(-2, aClass136_Sub1_5434);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
        anInt5424++;
        aClass357_5432.method3795((byte) 59, '\0');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (i > 1) {
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    final boolean method600(int i) {
        if (i != -16777216)
            aClass136_Sub1_5434 = null;
        anInt5431++;
        return true;
    }

    private final void method614(boolean bool) {
        aClass357_5432 = new Class357(((Class84) this).aHa_Sub2_1036, 2);
        anInt5423++;
        aClass357_5432.method3794(-115, 0);
        ((Class84) this).aHa_Sub2_1036.method880(bool, 1);
        ((Class84) this).aHa_Sub2_1036.method858(124, 260, 7681);
        ((Class84) this).aHa_Sub2_1036.method911(768, 34168, 0, (byte) 4);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (((Class183) aClass183_5427).aBoolean2144) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        aClass357_5432.method3797((byte) 26);
        aClass357_5432.method3794(-102, 1);
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        ((Class84) this).aHa_Sub2_1036.method858(-110, 8448, 8448);
        ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
        OpenGL.glDisable(3168);
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (((Class183) aClass183_5427).aBoolean2144) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        aClass357_5432.method3797((byte) 26);
        if (bool != true)
            anInt5425 = -28;
    }

    final void method597(boolean bool) {
        anInt5428++;
        aClass357_5432.method3795((byte) 71, '\001');
        if (bool != false)
            method615(58, 124);
        if (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5921 > 0) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method851(1.0F, -1026034392, 0.0F);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
        ((Class84) this).aHa_Sub2_1036.method858(120, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    Class84_Sub5(ha_Sub2 var_ha_Sub2, Class183 class183) {
        super(var_ha_Sub2);
        aClass183_5427 = class183;
        method614(true);
        aClass136_Sub1_5434 = new Class136_Sub1(((Class84) this).aHa_Sub2_1036, 6406, 2, new byte[]{0, -1}, 6406);
        aClass136_Sub1_5434.method1252(-11983, false);
    }

    static final void method615(int i, int i_0_) {
        anInt5426++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_0_, -874792672, 17);
        class248_sub8_sub10.method2076(-114);
        if (i > -112)
            anInt5425 = 82;
    }

    final void method601(int i, int i_1_, int i_2_) {
        anInt5422++;
        int i_3_ = -27 / ((i_2_ - 74) / 36);
        if ((0x1 & i ^ 0xffffffff) == -2) {
            if (((Class183) aClass183_5427).aBoolean2144) {
                ((Class84) this).aHa_Sub2_1036.method889(-2, ((Class183) aClass183_5427).aClass136_Sub2_2145);
                Class282_Sub19.aFloatArray7793[3] = (float) ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800) % 4000) / 4000.0F;
                Class282_Sub19.aFloatArray7793[2] = 0.0F;
                Class282_Sub19.aFloatArray7793[1] = 0.0F;
                Class282_Sub19.aFloatArray7793[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, Class282_Sub19.aFloatArray7793, 0);
            } else {
                int i_4_ = (16 * (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800 % 4000) / 4000);
                ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5427).aClass136_Sub4Array2146[i_4_]));
            }
        } else if (!((Class183) aClass183_5427).aBoolean2144)
            ((Class84) this).aHa_Sub2_1036.method889(-2, ((Class183) aClass183_5427).aClass136_Sub4Array2146[0]);
        else {
            ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5427).aClass136_Sub2_2145));
            Class282_Sub19.aFloatArray7793[1] = 0.0F;
            Class282_Sub19.aFloatArray7793[3] = 0.0F;
            Class282_Sub19.aFloatArray7793[0] = 0.0F;
            Class282_Sub19.aFloatArray7793[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, Class282_Sub19.aFloatArray7793, 0);
        }
    }

    final void method603(byte i, int i_5_, Class136 class136) {
        anInt5429++;
        if (i < 53)
            method600(75);
    }

    final void method599(byte i, boolean bool) {
        if (i <= -123) {
            ((Class84) this).aHa_Sub2_1036.method858(120, 8448, 260);
            anInt5433++;
        }
    }
}
