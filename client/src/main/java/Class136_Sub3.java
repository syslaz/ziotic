/* Class136_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class136_Sub3 extends Class136 {
    int anInt8397;
    static int anInt8398;
    static int anInt8399;
    static int anInt8400;
    static float aFloat8401;
    private int anInt8402;
    private int anInt8403 = -1;

    Class136_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_0_, boolean bool, byte[][] is, int i_1_) {
        super(var_ha_Sub2, 34067, i, 6 * i_0_ * i_0_, bool);
        anInt8402 = -1;
        ((Class136_Sub3) this).anInt8397 = i_0_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        for (int i_2_ = 0; i_2_ < 6; i_2_++)
            OpenGL.glTexImage2Dub(i_2_ + 34069, 0, ((Class136) this).anInt4785, i_0_, i_0_, 0, i_1_, 5121, is[i_2_], 0);
        this.method1246(false, true);
    }

    Class136_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_3_, boolean bool, int[][] is) {
        super(var_ha_Sub2, 34067, i, i_3_ * (i_3_ * 6), bool);
        anInt8402 = -1;
        ((Class136_Sub3) this).anInt8397 = i_3_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        if (!bool) {
            for (int i_4_ = 0; i_4_ < 6; i_4_++)
                OpenGL.glTexImage2Di(i_4_ + 34069, 0, ((Class136) this).anInt4785, i_3_, i_3_, 0, 32993, ((ha_Sub2) (((Class136) this).aHa_Sub2_4779)).anInt5934, is[i_4_], 0);
        } else {
            for (int i_5_ = 0; i_5_ < 6; i_5_++)
                Class135.method1238(i_3_, 34069 + i_5_, i_3_, ((Class136) this).anInt4785, (byte) 34, is[i_5_], 32993, ((ha_Sub2) (((Class136) this).aHa_Sub2_4779)).anInt5934);
        }
        this.method1246(false, true);
    }

    static final int method1260(int i, Class181 class181) {
        anInt8399++;
        if (class181 == Class81.aClass181_4907)
            return 9216;
        if (Class251.aClass181_2829 != class181) {
            if (Class282_Sub27.aClass181_7871 == class181)
                return 34066;
        } else
            return 34065;
        int i_6_ = -10 / ((7 - i) / 52);
        throw new IllegalArgumentException();
    }

    public final void method18(byte i) {
        OpenGL.glFramebufferTexture2DEXT(anInt8402, anInt8403, 3553, 0, 0);
        if (i < 106)
            method1261(53, 96, -102, -103, true);
        anInt8400++;
        anInt8402 = -1;
        anInt8403 = -1;
    }

    Class136_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_7_) {
        super(var_ha_Sub2, 34067, i, 6 * (i_7_ * i_7_), false);
        anInt8402 = -1;
        ((Class136_Sub3) this).anInt8397 = i_7_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        for (int i_8_ = 0; i_8_ < 6; i_8_++)
            OpenGL.glTexImage2Dub(34069 + i_8_, 0, ((Class136) this).anInt4785, i_7_, i_7_, 0, Class160.method1409((((Class136) this).anInt4785), 42), 5121, null, 0);
        this.method1246(false, true);
    }

    final void method1261(int i, int i_9_, int i_10_, int i_11_, boolean bool) {
        OpenGL.glFramebufferTexture2DEXT(i, i_11_, i_9_, ((Class136) this).anInt4781, i_10_);
        if (bool != false)
            ((Class136_Sub3) this).anInt8397 = -18;
        anInt8398++;
        anInt8402 = i;
        anInt8403 = i_11_;
    }
}
