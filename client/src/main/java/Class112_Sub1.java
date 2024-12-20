/* Class112_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class112_Sub1 extends Class112 implements Interface21_Impl2 {
    static int anInt8618;
    private int anInt8619;
    static int anInt8620;
    static int anInt8621;
    static int anInt8622;
    static int anInt8623;
    private int anInt8624;
    static int anInt8625;
    static int anInt8626;
    static int anInt8627;
    static int anInt8628;
    static int anInt8629;
    static int anInt8630;
    static int anInt8631;

    Class112_Sub1(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, int i, int i_0_, boolean bool, byte[] is, int i_1_, int i_2_) {
        super(var_ha_Sub3_Sub1, 3553, class264, Class228.aClass228_2573, i * i_0_, bool);
        anInt8624 = i_0_;
        anInt8619 = i;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        if (bool && (i_2_ ^ 0xffffffff) == -1 && (i_1_ ^ 0xffffffff) == -1)
            this.method791(is, (byte) -64, i_0_, ((Class112) this).anInt5216, i);
        else {
            OpenGL.glPixelStorei(3314, i_2_);
            OpenGL.glTexImage2Dub(((Class112) this).anInt5216, 0, this.method790(true), i, i_0_, 0, (Node_Sub42_Sub2.method2633(((Class112) this).aClass264_5224, true)), 5121, is, i_1_);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    final void method797(int i, float[] fs, Class264 class264, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt8622++;
        if (i == 6408) {
            ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
            OpenGL.glPixelStorei(3314, i_8_);
            OpenGL.glTexSubImage2Df(((Class112) this).anInt5216, 0, i_5_, i_4_, i_7_, i_3_, Node_Sub42_Sub2.method2633(class264, true), 5121, fs, i_6_);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    public final void method68(int i, Class264 class264, int i_9_, byte i_10_, int i_11_, int i_12_, int i_13_, int i_14_, byte[] is) {
        anInt8627++;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, i);
        OpenGL.glTexSubImage2Dub(((Class112) this).anInt5216, 0, i_12_, i_14_, i_9_, i_13_, Node_Sub42_Sub2.method2633(class264, true), 5121, is, i_11_);
        if (i_10_ >= -114)
            method69(48, 92, null, -46, -13, -43, 70);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    Class112_Sub1(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, int i, int i_15_, boolean bool, float[] fs, int i_16_, int i_17_) {
        super(var_ha_Sub3_Sub1, 3553, class264, Class228.aClass228_2577, i_15_ * i, bool);
        anInt8624 = i_15_;
        anInt8619 = i;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        if (!bool && i_17_ == 0 && i_16_ == 0)
            this.method795(i_15_, (byte) 72, ((Class112) this).anInt5216, i, fs);
        else {
            OpenGL.glPixelStorei(3314, i_17_);
            OpenGL.glTexImage2Df(((Class112) this).anInt5216, 0, this.method790(true), i, i_15_, 0, (Node_Sub42_Sub2.method2633(((Class112) this).aClass264_5224, true)), 5126, fs, i_16_ * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    Class112_Sub1(ha_Sub3_Sub1 var_ha_Sub3_Sub1, int i, int i_18_, boolean bool, int[] is, int i_19_, int i_20_) {
        super(var_ha_Sub3_Sub1, 3553, Class120.aClass264_1508, Class228.aClass228_2573, i_18_ * i, bool);
        anInt8624 = i_18_;
        anInt8619 = i;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        if (!bool || i_20_ != 0 || i_19_ != 0) {
            OpenGL.glPixelStorei(3314, i_20_);
            OpenGL.glTexImage2Di(((Class112) this).anInt5216, 0, 6408, anInt8619, anInt8624, 0, 32993, (((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anInt8759), is, 4 * i_19_);
            OpenGL.glPixelStorei(3314, 0);
        } else
            this.method796(is, ((Class112) this).anInt5216, i_18_, false, i);
    }

    public final int method66(byte i) {
        anInt8621++;
        if (i != 111)
            method69(74, -57, null, -104, 76, 19, -74);
        return anInt8624;
    }

    public final void method65(int i, int i_21_, int i_22_, int i_23_, int i_24_, int[] is, int i_25_, byte i_26_) {
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        anInt8629++;
        if (i_26_ < 57)
            method797(-59, null, null, -116, 87, -80, 110, 36, -90);
        OpenGL.glPixelStorei(3314, i_21_);
        OpenGL.glTexSubImage2Di(((Class112) this).anInt5216, 0, i_22_, i, i_24_, i_25_, 32993, (((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anInt8759), is, i_23_);
        OpenGL.glPixelStorei(3314, 0);
    }

    public final int method63(byte i) {
        anInt8630++;
        int i_27_ = -9 / ((i - 60) / 54);
        return anInt8619;
    }

    public final float method71(float f, int i) {
        anInt8628++;
        int i_28_ = -90 % ((-25 - i) / 45);
        return f / (float) anInt8624;
    }

    public final void method69(int i, int i_29_, int[] is, int i_30_, int i_31_, int i_32_, int i_33_) {
        anInt8620++;
        int[] is_34_ = new int[anInt8624 * anInt8619];
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        if (i_32_ != 12679)
            anInt8624 = 105;
        OpenGL.glGetTexImagei(((Class112) this).anInt5216, 0, 32993, 5121, is_34_, 0);
        for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_35_++)
            Class159.method1398(is_34_, (-i_35_ + i_30_ - (1 + -i_29_)) * anInt8619, is, i_31_ - -(i_33_ * i_35_), i_33_);
    }

    public final boolean method67(byte i) {
        int i_36_ = -9 % ((48 - i) / 53);
        anInt8618++;
        return true;
    }

    public final void method70(int i, boolean bool, boolean bool_37_) {
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        anInt8631++;
        if (i != 1645)
            anInt8619 = -103;
        OpenGL.glTexParameteri(((Class112) this).anInt5216, 10242, !bool_37_ ? 33071 : 10497);
        OpenGL.glTexParameteri(((Class112) this).anInt5216, 10243, bool ? 10497 : 33071);
    }

    static final void method798(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
        Class7[] class7s = Class225_Sub3.aClass7Array8477;
        for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (class7s.length ^ 0xffffffff); i_44_++) {
            Class7 class7 = class7s[i_44_];
            if (class7 != null && (((Class7) class7).anInt169 ^ 0xffffffff) == -3) {
                Class216.method1742(((Class7) class7).anInt160, i_41_ >> -434408607, i >> -1489769471, i_43_, ((Class7) class7).anInt163, 2 * ((Class7) class7).anInt165, ((Class7) class7).anInt159, i_38_, (byte) -105);
                if ((Class303.anIntArray3527[0] ^ 0xffffffff) < 0 && (Node_Sub18.anInt7027 % 20 ^ 0xffffffff) > -11) {
                    Class129 class129 = (Class366.aClass129Array4497[((Class7) class7).anInt167]);
                    int i_45_ = -12 + Class303.anIntArray3527[0] + i_39_;
                    int i_46_ = i_40_ - -Class303.anIntArray3527[1] + -28;
                    class129.method1168(i_45_, i_46_);
                    Class210.method1724(i_45_ + class129.method1169(), i_45_, (byte) -54, class129.method1181() + i_46_, i_46_);
                }
            }
        }
        if (i_42_ < -5)
            anInt8625++;
    }

    static final String method799(int i, int i_47_, byte[] is, int i_48_) {
        anInt8623++;
        char[] cs = new char[i_47_];
        int i_49_ = 0;
        if (i_48_ > -50)
            return null;
        for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff); i_50_++) {
            int i_51_ = is[i + i_50_] & 0xff;
            if ((i_51_ ^ 0xffffffff) != -1) {
                if (i_51_ >= 128 && (i_51_ ^ 0xffffffff) > -161) {
                    int i_52_ = Class357.aCharArray4415[i_51_ - 128];
                    if (i_52_ == 0)
                        i_52_ = 63;
                    i_51_ = i_52_;
                }
                cs[i_49_++] = (char) i_51_;
            }
        }
        return new String(cs, 0, i_49_);
    }

    Class112_Sub1(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, Class228 class228, int i, int i_53_) {
        super(var_ha_Sub3_Sub1, 3553, class264, class228, i * i_53_, false);
        anInt8619 = i;
        anInt8624 = i_53_;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glTexImage2Dub(((Class112) this).anInt5216, 0, this.method790(true), i, i_53_, 0, Node_Sub42_Sub2.method2633((((Class112) this).aClass264_5224), true), Class355.method3782(5126, (((Class112) this).aClass228_5221)), null, 0);
    }

    public final float method64(int i, float f) {
        if (i != -2092)
            return 1.0554568F;
        anInt8626++;
        return f / (float) anInt8619;
    }
}
