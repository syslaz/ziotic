/* Class112_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class112_Sub4 extends Class112 implements Interface21_Impl2 {
    static int anInt8643;
    static int anInt8644;
    static int anInt8645;
    static int anInt8646;
    private int anInt8647;
    static int anInt8648;
    static int anInt8649;
    private int anInt8650;
    static int anInt8651;
    static int anInt8652;
    static int anInt8653;

    Class112_Sub4(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, Class228 class228, int i, int i_0_) {
        super(var_ha_Sub3_Sub1, 34037, class264, class228, i_0_ * i, false);
        anInt8650 = i_0_;
        anInt8647 = i;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glTexImage2Dub(((Class112) this).anInt5216, 0, this.method790(true), i, i_0_, 0, Node_Sub42_Sub2.method2633((((Class112) this).aClass264_5224), true), Class355.method3782(5126, (((Class112) this).aClass228_5221)), null, 0);
    }

    public final void method70(int i, boolean bool, boolean bool_1_) {
        if (i != 1645)
            anInt8647 = 45;
        anInt8649++;
    }

    public final int method66(byte i) {
        anInt8643++;
        if (i != 111)
            anInt8650 = -107;
        return anInt8650;
    }

    public final void method65(int i, int i_2_, int i_3_, int i_4_, int i_5_, int[] is, int i_6_, byte i_7_) {
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        anInt8646++;
        if ((i_2_ ^ 0xffffffff) == -1)
            i_2_ = i_5_;
        if ((i_5_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff))
            OpenGL.glPixelStorei(3314, i_2_);
        OpenGL.glTexSubImage2Di(((Class112) this).anInt5216, 0, i_3_, i, i_5_, i_6_, 32993, (((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anInt8759), is, i_4_);
        if (i_7_ < 57)
            anInt8647 = 0;
        if (i_2_ != i_5_)
            OpenGL.glPixelStorei(3314, 0);
    }

    public final void method69(int i, int i_8_, int[] is, int i_9_, int i_10_, int i_11_, int i_12_) {
        if (i_11_ != 12679)
            anInt8650 = 122;
        anInt8645++;
        int[] is_13_ = new int[anInt8650 * anInt8647];
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glGetTexImagei(((Class112) this).anInt5216, 0, 32993, 5121, is_13_, 0);
        for (int i_14_ = 0; i_8_ > i_14_; i_14_++)
            Class159.method1398(is_13_, anInt8647 * (-i_14_ + (i_9_ - -i_8_ - 1)), is, i_10_ - -(i_12_ * i_14_), i_12_);
    }

    public final void method68(int i, Class264 class264, int i_15_, byte i_16_, int i_17_, int i_18_, int i_19_, int i_20_, byte[] is) {
        if ((i ^ 0xffffffff) == -1)
            i = i_15_;
        anInt8648++;
        if (i_16_ >= -114)
            anInt8647 = 35;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        if ((i_15_ ^ 0xffffffff) != (i ^ 0xffffffff))
            OpenGL.glPixelStorei(3314, i);
        OpenGL.glTexSubImage2Dub(((Class112) this).anInt5216, 0, i_18_, i_20_, i_15_, i_19_, Node_Sub42_Sub2.method2633(class264, true), 5121, is, i_17_);
        if (i_15_ != i)
            OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    Class112_Sub4(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, int i, int i_21_, byte[] is, int i_22_, int i_23_) {
        super(var_ha_Sub3_Sub1, 34037, class264, Class228.aClass228_2573, i * i_21_, false);
        anInt8647 = i;
        anInt8650 = i_21_;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, i_23_);
        OpenGL.glTexImage2Dub(((Class112) this).anInt5216, 0, this.method790(true), i, i_21_, 0, Node_Sub42_Sub2.method2633((((Class112) this).aClass264_5224), true), 5121, is, i_22_);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    public final float method64(int i, float f) {
        anInt8652++;
        if (i != -2092)
            anInt8650 = -86;
        return f;
    }

    public final boolean method67(byte i) {
        anInt8653++;
        int i_24_ = 36 % ((48 - i) / 53);
        return false;
    }

    Class112_Sub4(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, int i, int i_25_, float[] fs, int i_26_, int i_27_) {
        super(var_ha_Sub3_Sub1, 34037, class264, Class228.aClass228_2577, i * i_25_, false);
        anInt8647 = i;
        anInt8650 = i_25_;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3314, i_27_);
        OpenGL.glTexImage2Df(((Class112) this).anInt5216, 0, this.method790(true), i, i_25_, 0, Node_Sub42_Sub2.method2633((((Class112) this).aClass264_5224), true), 5126, fs, i_26_ * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    public final int method63(byte i) {
        int i_28_ = 15 % ((60 - i) / 54);
        anInt8651++;
        return anInt8647;
    }

    public final float method71(float f, int i) {
        anInt8644++;
        int i_29_ = 97 / ((i - -25) / 45);
        return f;
    }

    Class112_Sub4(ha_Sub3_Sub1 var_ha_Sub3_Sub1, int i, int i_30_, int[] is, int i_31_, int i_32_) {
        super(var_ha_Sub3_Sub1, 34037, Class120.aClass264_1508, Class228.aClass228_2573, i * i_30_, false);
        anInt8650 = i_30_;
        anInt8647 = i;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3314, i_32_);
        OpenGL.glTexImage2Di(((Class112) this).anInt5216, 0, 6408, anInt8647, anInt8650, 0, 32993, ((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anInt8759, is, i_31_ * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
