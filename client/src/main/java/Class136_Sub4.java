/* Class136_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.util.Random;

class Class136_Sub4 extends Class136 {
    static int anInt8404;
    static int anInt8405;
    static int anInt8406;
    private int anInt8407 = -1;
    static int anInt8408;
    static int anInt8409;
    static int anInt8410;
    private int anInt8411 = -1;
    int anInt8412;
    static int anInt8413 = -1;
    static int anInt8414;
    static int anInt8415;
    int anInt8416;
    static int anInt8417;
    static int anInt8418;

    final void method1262(byte i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int[] is, int i_4_, int i_5_) {
        if ((i_4_ ^ 0xffffffff) == -1)
            i_4_ = i_0_;
        anInt8414++;
        if (bool) {
            int[] is_6_ = new int[i_0_ * i_2_];
            for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
                int i_8_ = i_7_ * i_0_;
                int i_9_ = i_1_ + i_4_ * (-1 + i_2_ + -i_7_);
                for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_10_++)
                    is_6_[i_8_++] = is[i_9_++];
            }
            is = is_6_;
        }
        int i_11_ = 66 % ((i - 45) / 60);
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        if ((i_0_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff))
            OpenGL.glPixelStorei(3314, i_4_);
        OpenGL.glTexSubImage2Di(((Class136) this).anInt4770, 0, i_5_, ((Class136_Sub4) this).anInt8412 - (i_3_ + i_2_), i_0_, i_2_, 32993, (((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5934), is, i_1_);
        if (i_0_ != i_4_)
            OpenGL.glPixelStorei(3314, 0);
    }

    final void method1263(int i, int i_12_, byte i_13_, int i_14_) {
        anInt8410++;
        OpenGL.glFramebufferTexture2DEXT(i, i_14_, ((Class136) this).anInt4770, ((Class136) this).anInt4781, i_12_);
        anInt8411 = i;
        if (i_13_ != 85)
            method1267(null, null);
        anInt8407 = i_14_;
    }

    final void method1264(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
        anInt8417++;
        int i_21_ = (((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5597 + -i_16_ + -i);
        if (i_18_ != 34037)
            method18((byte) 84);
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glCopyTexSubImage2D(((Class136) this).anInt4770, 0, i_20_, -i_17_ + (-i_16_ + (((Class136_Sub4) this).anInt8412)), i_19_, i_21_, i_15_, i_16_);
        OpenGL.glFlush();
    }

    public final void method18(byte i) {
        if (i > 106) {
            anInt8415++;
            OpenGL.glFramebufferTexture2DEXT(anInt8411, anInt8407, ((Class136) this).anInt4770, 0, 0);
            anInt8407 = -1;
            anInt8411 = -1;
        }
    }

    static final byte[] method1265(int i, int i_22_) {
        if (i_22_ <= 74)
            method1265(52, 7);
        anInt8418++;
        Node_Sub8_Sub19 class248_sub8_sub19 = ((Node_Sub8_Sub19) Class320.aClass365_3691.method3826((long) i, -1));
        if (class248_sub8_sub19 == null) {
            byte[] is = new byte[512];
            Random random = new Random((long) i);
            for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -256; i_23_++)
                is[i_23_] = (byte) i_23_;
            for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -256; i_24_++) {
                int i_25_ = -i_24_ + 255;
                int i_26_ = RSInterface.method2016(i_25_, -1, random);
                byte i_27_ = is[i_26_];
                is[i_26_] = is[i_25_];
                is[i_25_] = is[-i_24_ + 511] = i_27_;
            }
            class248_sub8_sub19 = new Node_Sub8_Sub19(is);
            Class320.aClass365_3691.method3825((long) i, (byte) 98, class248_sub8_sub19);
        }
        return ((Node_Sub8_Sub19) class248_sub8_sub19).aByteArray9083;
    }

    final void method1266(byte i, boolean bool, boolean bool_28_) {
        anInt8404++;
        if (i != -60)
            method1265(-101, 116);
        if (((Class136) this).anInt4770 == 3553) {
            ((Class136) this).aHa_Sub2_4779.method889(-2, this);
            OpenGL.glTexParameteri(((Class136) this).anInt4770, 10242, bool_28_ ? 10497 : 33071);
            OpenGL.glTexParameteri(((Class136) this).anInt4770, 10243, !bool ? 33071 : 10497);
        }
    }

    static final RuntimeException_Sub1 method1267(Throwable throwable, String string) {
        anInt8409++;
        RuntimeException_Sub1 runtimeexception_sub1;
        if (throwable instanceof RuntimeException_Sub1) {
            runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
            ((RuntimeException_Sub1) runtimeexception_sub1).aString4710 += ' ' + (String) string;
        } else
            runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
        return runtimeexception_sub1;
    }

    Class136_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_29_, int i_30_, int i_31_) {
        super(var_ha_Sub2, i, i_29_, i_30_ * i_31_, false);
        ((Class136_Sub4) this).anInt8412 = i_31_;
        ((Class136_Sub4) this).anInt8416 = i_30_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glTexImage2Dub(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, i_30_, i_31_, 0, Class160.method1409(((Class136) this).anInt4785, 121), 5121, null, 0);
        this.method1246(false, true);
    }

    final void method1268(byte[] is, int i, int i_32_, int i_33_, int i_34_, int i_35_, boolean bool, int i_36_, int i_37_, int i_38_) {
        anInt8408++;
        if ((i_33_ ^ 0xffffffff) == -1)
            i_33_ = i_38_;
        if (bool) {
            int i_39_ = Class122.method1129(i, (byte) -117);
            int i_40_ = i_39_ * i_38_;
            int i_41_ = i_39_ * i_33_;
            byte[] is_42_ = new byte[i_36_ * i_40_];
            for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_43_++) {
                int i_44_ = i_43_ * i_40_;
                int i_45_ = (-1 + (i_36_ + -i_43_)) * i_41_ - -i_34_;
                for (int i_46_ = 0; (i_40_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++)
                    is_42_[i_44_++] = is[i_45_++];
            }
            is = is_42_;
        }
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (i_38_ != i_33_)
            OpenGL.glPixelStorei(3314, i_33_);
        OpenGL.glTexSubImage2Dub(((Class136) this).anInt4770, 0, i_35_, i_32_, i_38_, i_36_, i, 5121, is, i_34_);
        if ((i_33_ ^ 0xffffffff) != (i_38_ ^ 0xffffffff))
            OpenGL.glPixelStorei(3314, 0);
        int i_47_ = -72 % ((-5 - i_37_) / 57);
        OpenGL.glPixelStorei(3317, 4);
    }

    Class136_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_48_, int i_49_, int i_50_, int i_51_) {
        super(var_ha_Sub2, i, 6407, i_50_ * i_51_, false);
        ((Class136_Sub4) this).anInt8416 = i_50_;
        ((Class136_Sub4) this).anInt8412 = i_51_;
        int i_52_ = (((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5597 + -i_49_ - i_51_);
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glCopyTexImage2D(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, i_48_, i_52_, i_50_, i_51_, 0);
        this.method1246(false, true);
    }

    Class136_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_53_, int i_54_, int i_55_, boolean bool, int[] is, int i_56_, int i_57_, boolean bool_58_) {
        super(var_ha_Sub2, i, i_53_, i_55_ * i_54_, bool);
        ((Class136_Sub4) this).anInt8416 = i_54_;
        ((Class136_Sub4) this).anInt8412 = i_55_;
        if (bool_58_) {
            int[] is_59_ = new int[is.length];
            for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_55_ ^ 0xffffffff); i_60_++) {
                int i_61_ = i_54_ * i_60_;
                int i_62_ = (-1 + (-i_60_ + i_55_)) * i_54_;
                for (int i_63_ = 0; (i_54_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff); i_63_++)
                    is_59_[i_61_++] = is[i_62_++];
            }
            is = is_59_;
        }
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        if (((Class136) this).anInt4770 == 34037 || !bool || i_56_ != 0 || i_57_ != 0) {
            OpenGL.glPixelStorei(3314, i_56_);
            OpenGL.glTexImage2Di(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, ((Class136_Sub4) this).anInt8416, ((Class136_Sub4) this).anInt8412, 0, 32993, (((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5934), is, i_57_ * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1245(false, 31005);
        } else {
            Class135.method1238(((Class136_Sub4) this).anInt8416, ((Class136) this).anInt4770, ((Class136_Sub4) this).anInt8412, ((Class136) this).anInt4785, (byte) 87, is, 32993, (((ha_Sub2) ((Class136) this).aHa_Sub2_4779).anInt5934));
            this.method1245(true, 31005);
        }
        this.method1246(false, true);
    }

    Class136_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_64_, int i_65_, int i_66_, boolean bool, byte[] is, int i_67_, boolean bool_68_) {
        super(var_ha_Sub2, i, i_64_, i_65_ * i_66_, bool);
        ((Class136_Sub4) this).anInt8412 = i_66_;
        ((Class136_Sub4) this).anInt8416 = i_65_;
        if (bool_68_) {
            byte[] is_69_ = new byte[is.length];
            for (int i_70_ = 0; i_70_ < i_66_; i_70_++) {
                int i_71_ = i_65_ * i_70_;
                int i_72_ = (-1 + i_66_ - i_70_) * i_65_;
                for (int i_73_ = 0; i_65_ > i_73_; i_73_++)
                    is_69_[i_71_++] = is[i_72_++];
            }
            is = is_69_;
        }
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (!bool || (((Class136) this).anInt4770 ^ 0xffffffff) == -34038) {
            OpenGL.glTexImage2Dub(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, ((Class136_Sub4) this).anInt8416, ((Class136_Sub4) this).anInt8412, 0, i_67_, 5121, is, 0);
            this.method1245(false, 31005);
        } else {
            RuntimeException_Sub1.method3940(-23712, i_66_, i_64_, i_65_, i, i_67_, is);
            this.method1245(true, 31005);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1246(false, true);
    }

    Class136_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_74_, int i_75_, int i_76_, boolean bool, float[] fs, int i_77_) {
        super(var_ha_Sub2, i, i_74_, i_76_ * i_75_, bool);
        ((Class136_Sub4) this).anInt8416 = i_75_;
        ((Class136_Sub4) this).anInt8412 = i_76_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        if (bool && ((Class136) this).anInt4770 != 34037) {
            Class316.method3285(i, i_75_, fs, i_76_, i_74_, true, i_77_);
            this.method1245(true, 31005);
        } else {
            OpenGL.glTexImage2Df(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, ((Class136_Sub4) this).anInt8416, ((Class136_Sub4) this).anInt8412, 0, i_77_, 5126, fs, 0);
            this.method1245(false, 31005);
        }
        this.method1246(false, true);
    }

    static final int method1269(int i, byte i_78_) {
        anInt8405++;
        i = --i | i >>> -1905068095;
        i |= i >>> 528124322;
        i |= i >>> 83291524;
        i |= i >>> -283431864;
        i |= i >>> -181442544;
        if (i_78_ >= -127)
            method1265(119, -100);
        return 1 + i;
    }

    static final boolean method1270(char c, byte i) {
        anInt8406++;
        if (i > -76)
            return true;
        if (c < 48 || (c ^ 0xffffffff) < -58)
            return false;
        return true;
    }
}
