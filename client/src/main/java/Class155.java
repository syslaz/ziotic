/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class155 {
    static int anInt1830 = 0;
    static int anInt1831;
    private ha_Sub2 aHa_Sub2_1832;
    private Class372[][] aClass372ArrayArray1833;
    private s_Sub2 aS_Sub2_1834;
    static int anInt1835;
    private int anInt1836;
    static int anInt1837;
    static int anInt1838;
    int anInt1839;
    static int anInt1840;
    byte[] aByteArray1841;
    private int anInt1842;
    private int anInt1843;
    static int anInt1844;
    private int anInt1845;
    static int anInt1846;

    final void method1366(r var_r, boolean bool, int i, int i_0_) {
        anInt1838++;
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        i_0_ += ((r_Sub1) var_r_Sub1).anInt10264 - -1;
        i += ((r_Sub1) var_r_Sub1).anInt10261 + 1;
        int i_1_ = i_0_ - -(i * ((Class155) this).anInt1839);
        int i_2_ = 0;
        int i_3_ = ((r_Sub1) var_r_Sub1).anInt10258;
        int i_4_ = ((r_Sub1) var_r_Sub1).anInt10263;
        int i_5_ = ((Class155) this).anInt1839 - i_4_;
        if ((i ^ 0xffffffff) >= -1) {
            int i_6_ = 1 + -i;
            i = 1;
            i_3_ -= i_6_;
            i_2_ += i_6_ * i_4_;
            i_1_ += ((Class155) this).anInt1839 * i_6_;
        }
        int i_7_ = 0;
        if (bool != false)
            method1370(3, null, 72, true, 119, 69);
        if ((i + i_3_ ^ 0xffffffff) <= (anInt1842 ^ 0xffffffff)) {
            int i_8_ = i - (-i_3_ - (1 - anInt1842));
            i_3_ -= i_8_;
        }
        if ((i_0_ ^ 0xffffffff) >= -1) {
            int i_9_ = 1 + -i_0_;
            i_5_ += i_9_;
            i_2_ += i_9_;
            i_4_ -= i_9_;
            i_1_ += i_9_;
            i_7_ += i_9_;
            i_0_ = 1;
        }
        if ((((Class155) this).anInt1839 ^ 0xffffffff) >= (i_4_ + i_0_ ^ 0xffffffff)) {
            int i_10_ = i_0_ - -i_4_ + 1 - ((Class155) this).anInt1839;
            i_4_ -= i_10_;
            i_7_ += i_10_;
            i_5_ += i_10_;
        }
        if (i_4_ > 0 && (i_3_ ^ 0xffffffff) < -1) {
            Node_Sub20.method2522(i_3_, ((Class155) this).aByteArray1841, ((r_Sub1) var_r_Sub1).aByteArray10260, i_2_, i_7_, 104, i_1_, i_4_, i_5_);
            method1371(i_3_, bool, i_4_, i, i_0_);
        }
    }

    final boolean method1367(int i, int i_11_, int i_12_, r var_r) {
        anInt1844++;
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        if (i_11_ != -26332)
            method1369(74);
        i += 1 + ((r_Sub1) var_r_Sub1).anInt10264;
        i_12_ += ((r_Sub1) var_r_Sub1).anInt10261 - -1;
        int i_13_ = i + ((Class155) this).anInt1839 * i_12_;
        int i_14_ = ((r_Sub1) var_r_Sub1).anInt10258;
        int i_15_ = ((r_Sub1) var_r_Sub1).anInt10263;
        if (i_12_ <= 0) {
            int i_16_ = 1 + -i_12_;
            i_14_ -= i_16_;
            i_12_ = 1;
            i_13_ += ((Class155) this).anInt1839 * i_16_;
        }
        int i_17_ = -i_15_ + ((Class155) this).anInt1839;
        if (anInt1842 <= i_14_ + i_12_) {
            int i_18_ = i_14_ + (i_12_ + 1 + -anInt1842);
            i_14_ -= i_18_;
        }
        if ((i ^ 0xffffffff) >= -1) {
            int i_19_ = -i + 1;
            i = 1;
            i_13_ += i_19_;
            i_15_ -= i_19_;
            i_17_ += i_19_;
        }
        if (i_15_ + i >= ((Class155) this).anInt1839) {
            int i_20_ = -((Class155) this).anInt1839 + i_15_ + (i - -1);
            i_15_ -= i_20_;
            i_17_ += i_20_;
        }
        if (i_15_ <= 0 || (i_14_ ^ 0xffffffff) >= -1)
            return false;
        int i_21_ = 8;
        i_17_ += ((Class155) this).anInt1839 * (-1 + i_21_);
        return Class177.method1589(119, i_14_, i_21_, i_17_, ((Class155) this).aByteArray1841, i_13_, i_15_);
    }

    final void method1368(r var_r, int i, int i_22_, int i_23_) {
        anInt1831++;
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        i_23_ += i_22_ + ((r_Sub1) var_r_Sub1).anInt10261;
        i += ((r_Sub1) var_r_Sub1).anInt10264 - -1;
        int i_24_ = i - -(i_23_ * ((Class155) this).anInt1839);
        int i_25_ = 0;
        int i_26_ = ((r_Sub1) var_r_Sub1).anInt10258;
        int i_27_ = ((r_Sub1) var_r_Sub1).anInt10263;
        int i_28_ = ((Class155) this).anInt1839 + -i_27_;
        if (i_23_ <= 0) {
            int i_29_ = 1 + -i_23_;
            i_26_ -= i_29_;
            i_23_ = 1;
            i_24_ += i_29_ * ((Class155) this).anInt1839;
            i_25_ += i_29_ * i_27_;
        }
        int i_30_ = 0;
        if (anInt1842 <= i_26_ + i_23_) {
            int i_31_ = i_26_ + (i_23_ + (1 + -anInt1842));
            i_26_ -= i_31_;
        }
        if (i <= 0) {
            int i_32_ = -i + 1;
            i_24_ += i_32_;
            i_28_ += i_32_;
            i = 1;
            i_25_ += i_32_;
            i_27_ -= i_32_;
            i_30_ += i_32_;
        }
        if (((Class155) this).anInt1839 <= i - -i_27_) {
            int i_33_ = i - -i_27_ + (1 - ((Class155) this).anInt1839);
            i_28_ += i_33_;
            i_30_ += i_33_;
            i_27_ -= i_33_;
        }
        if (i_27_ > 0 && (i_26_ ^ 0xffffffff) < -1) {
            Class70.method534(i_24_, ((r_Sub1) var_r_Sub1).aByteArray10260, i_26_, i_25_, i_27_, i_28_, (byte) -108, i_30_, ((Class155) this).aByteArray1841);
            method1371(i_26_, false, i_27_, i_23_, i);
        }
    }

    final void method1369(int i) {
        aClass372ArrayArray1833 = new Class372[anInt1843][anInt1845];
        anInt1840++;
        int i_34_ = 0;
        if (i != 1)
            method1370(-50, null, 122, false, 104, -36);
        for (/**/; (i_34_ ^ 0xffffffff) > (anInt1845 ^ 0xffffffff); i_34_++) {
            for (int i_35_ = 0; i_35_ < anInt1843; i_35_++)
                aClass372ArrayArray1833[i_35_][i_34_] = new Class372(aHa_Sub2_1832, this, aS_Sub2_1834, i_35_, i_34_, anInt1836, 1 + i_35_ * 128, i_34_ * 128 + 1);
        }
    }

    final void method1370(int i, boolean[][] bools, int i_36_, boolean bool, int i_37_, int i_38_) {
        aHa_Sub2_1832.method878(false, -109);
        anInt1846++;
        aHa_Sub2_1832.method870(108, false);
        aHa_Sub2_1832.method882(-2, (byte) -108);
        aHa_Sub2_1832.method881((byte) 123, 1);
        aHa_Sub2_1832.method885(i + i, 1);
        float f = 1.0F / (float) (128 * ((ha_Sub2) aHa_Sub2_1832).anInt5803);
        if (!bool) {
            for (int i_39_ = 0; i_39_ < anInt1845; i_39_++) {
                int i_40_ = i_39_ << anInt1836;
                int i_41_ = i_39_ + 1 << anInt1836;
                for (int i_42_ = 0; anInt1843 > i_42_; i_42_++) {
                    int i_43_ = 0;
                    int i_44_ = i_42_ << anInt1836;
                    int i_45_ = 1 + i_42_ << anInt1836;
                    Node_Sub9_Sub1 class248_sub9_sub1 = ((ha_Sub2) aHa_Sub2_1832).aClass248_Sub9_Sub1_5845;
                    ((ByteStream) class248_sub9_sub1).offset = 0;
                    for (int i_46_ = i_40_; (i_46_ ^ 0xffffffff) > (i_41_ ^ 0xffffffff); i_46_++) {
                        if (-i_37_ + i_46_ >= -i_36_ && ((-i_37_ + i_46_ ^ 0xffffffff) >= (i_36_ ^ 0xffffffff))) {
                            int i_47_ = ((s) aS_Sub2_1834).anInt3468 * i_46_ + i_44_;
                            for (int i_48_ = i_44_; (i_45_ ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++) {
                                if (-i_36_ <= i_48_ + -i_38_ && i_36_ >= -i_38_ + i_48_ && (bools[i_48_ + (-i_38_ + i_36_)][i_46_ + -i_37_ - -i_36_])) {
                                    short[] is = (((s_Sub2) aS_Sub2_1834).aShortArrayArray7954[i_47_]);
                                    if (is != null) {
                                        if (((ha_Sub2) aHa_Sub2_1832).aBoolean5872) {
                                            for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_49_++) {
                                                class248_sub9_sub1.writeShort(1182, 0xffff & is[i_49_]);
                                                i_43_++;
                                            }
                                        } else {
                                            for (int i_50_ = 0; ((i_50_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_50_++) {
                                                class248_sub9_sub1.writeLEShort_(0xffff & is[i_50_], 113);
                                                i_43_++;
                                            }
                                        }
                                    }
                                }
                                i_47_++;
                            }
                        }
                    }
                    if ((i_43_ ^ 0xffffffff) < -1) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(f, f, 1.0F);
                        OpenGL.glTranslatef((float) -i_42_ / f, (float) -i_39_ / f, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        aClass372ArrayArray1833[i_42_][i_39_].method3869((byte) 99, 5123, (((ByteStream) class248_sub9_sub1).buffer), i_43_);
                    }
                }
            }
        } else {
            for (int i_51_ = 0; (anInt1845 ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++) {
                int i_52_ = i_51_ << anInt1836;
                int i_53_ = i_51_ + 1 << anInt1836;
                for (int i_54_ = 0; (anInt1843 ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++) {
                    int i_55_ = i_54_ << anInt1836;
                    int i_56_ = 1 + i_54_ << anInt1836;
                    while_107_:
                    for (int i_57_ = i_55_; (i_56_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++) {
                        if ((-i_38_ + i_57_ ^ 0xffffffff) <= (-i_36_ ^ 0xffffffff) && i_36_ >= i_57_ - i_38_) {
                            for (int i_58_ = i_52_; (i_53_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
                                if (((-i_37_ + i_58_ ^ 0xffffffff) <= (-i_36_ ^ 0xffffffff)) && ((i_58_ - i_37_ ^ 0xffffffff) >= (i_36_ ^ 0xffffffff)) && (bools[i_57_ - (i_38_ + -i_36_)][i_58_ + -i_37_ + i_36_])) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(f, f, 1.0F);
                                    OpenGL.glTranslatef((float) -i_54_ / f, (float) -i_51_ / f, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    aClass372ArrayArray1833[i_54_][i_51_].method3864((byte) 113);
                                    break while_107_;
                                }
                            }
                        }
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    private final void method1371(int i, boolean bool, int i_59_, int i_60_, int i_61_) {
        anInt1835++;
        if (aClass372ArrayArray1833 != null) {
            int i_62_ = i_61_ + -1 >> 487865127;
            int i_63_ = i_61_ + (-1 + i_59_) - 1 >> 383936839;
            int i_64_ = -1 + i_60_ >> 719241767;
            int i_65_ = -1 + (i_60_ + -1 + i) >> -587902489;
            for (int i_66_ = i_62_; (i_66_ ^ 0xffffffff) >= (i_63_ ^ 0xffffffff); i_66_++) {
                Class372[] class372s = aClass372ArrayArray1833[i_66_];
                for (int i_67_ = i_64_; i_67_ <= i_65_; i_67_++)
                    ((Class372) class372s[i_67_]).aBoolean4585 = true;
            }
            if (bool != false)
                anInt1830 = -23;
        }
    }

    Class155(ha_Sub2 var_ha_Sub2, s_Sub2 var_s_Sub2) {
        aS_Sub2_1834 = var_s_Sub2;
        aHa_Sub2_1832 = var_ha_Sub2;
        ((Class155) this).anInt1839 = 2 + (((s) aS_Sub2_1834).anInt3465 * ((s) aS_Sub2_1834).anInt3468 >> ((ha_Sub2) aHa_Sub2_1832).anInt5798);
        anInt1842 = 2 - -(((s) aS_Sub2_1834).anInt3472 * ((s) aS_Sub2_1834).anInt3465 >> ((ha_Sub2) aHa_Sub2_1832).anInt5798);
        ((Class155) this).aByteArray1841 = new byte[anInt1842 * ((Class155) this).anInt1839];
        anInt1836 = 7 + (((ha_Sub2) aHa_Sub2_1832).anInt5798 - ((s) aS_Sub2_1834).anInt3466);
        anInt1843 = ((s) aS_Sub2_1834).anInt3468 >> anInt1836;
        anInt1845 = ((s) aS_Sub2_1834).anInt3472 >> anInt1836;
    }
}
