/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

import java.awt.*;

final class Class173 {
    static int anInt2003;
    private int anInt2004;
    private Class283 aClass283_2005;
    boolean aBoolean2006 = true;
    private int anInt2007;
    private Interface21_Impl2 anInterface21_Impl2_2008;
    private int anInt2009;
    private int anInt2010;
    private ha_Sub3 aHa_Sub3_2011;
    static Color[] aColorArray2012 = {new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
    static int anInt2013;
    static int anInt2014 = 0;
    static int anInt2015;
    static int anInt2016;
    int anInt2017;
    private int anInt2018 = -1;
    static Interactable[] aInteractableArray2019;
    private Interface18_Impl2 anInterface18_Impl2_2020;

    private final void method1560(int i) {
        anInt2003++;
        if (((Class173) this).aBoolean2006) {
            ((Class173) this).aBoolean2006 = false;
            byte[] is = ((Class283) aClass283_2005).aByteArray3335;
            int i_0_ = i;
            int i_1_ = ((Class283) aClass283_2005).anInt3328;
            int i_2_ = (anInt2007 + ((Class283) aClass283_2005).anInt3328 * anInt2010);
            for (int i_3_ = -128; (i_3_ ^ 0xffffffff) > -1; i_3_++) {
                i_0_ = -i_0_ + (i_0_ << 895429704);
                for (int i_4_ = -128; i_4_ < 0; i_4_++) {
                    if ((is[i_2_++] ^ 0xffffffff) != -1)
                        i_0_++;
                }
                i_2_ += -128 + i_1_;
            }
            if (anInterface21_Impl2_2008 != null && (i_0_ ^ 0xffffffff) == (anInt2018 ^ 0xffffffff))
                ((Class173) this).aBoolean2006 = false;
            else {
                anInt2018 = i_0_;
                int i_5_ = 0;
                i_2_ = i_1_ * anInt2010 + anInt2007;
                if (aHa_Sub3_2011.method933(i + -3119, Class228.aClass228_2573, Class130.aClass264_1573)) {
                    if (Class162_Sub1.aByteArray6398 == null)
                        Class162_Sub1.aByteArray6398 = new byte[16384];
                    byte[] is_6_ = Class162_Sub1.aByteArray6398;
                    for (int i_7_ = -128; (i_7_ ^ 0xffffffff) > -1; i_7_++) {
                        for (int i_8_ = -128; i_8_ < 0; i_8_++) {
                            if (is[i_2_] != 0)
                                is_6_[i_5_++] = (byte) 68;
                            else {
                                int i_9_ = 0;
                                if ((is[-1 + i_2_] ^ 0xffffffff) != -1)
                                    i_9_++;
                                if ((is[i_2_ - -1] ^ 0xffffffff) != -1)
                                    i_9_++;
                                if (is[i_2_ + -i_1_] != 0)
                                    i_9_++;
                                if (is[i_2_ + i_1_] != 0)
                                    i_9_++;
                                is_6_[i_5_++] = (byte) (i_9_ * 17);
                            }
                            i_2_++;
                        }
                        i_2_ += ((Class283) aClass283_2005).anInt3328 - 128;
                    }
                    if (anInterface21_Impl2_2008 != null)
                        anInterface21_Impl2_2008.method68(128, Class130.aClass264_1573, 128, (byte) -125, 0, 0, 128, 0, Class162_Sub1.aByteArray6398);
                    else {
                        anInterface21_Impl2_2008 = aHa_Sub3_2011.method972((Class162_Sub1.aByteArray6398), 0, 128, Class130.aClass264_1573, 128, false);
                        anInterface21_Impl2_2008.method70(i + 1645, false, false);
                    }
                } else {
                    if (Class249_Sub2.anIntArray4805 == null)
                        Class249_Sub2.anIntArray4805 = new int[16384];
                    int[] is_10_ = Class249_Sub2.anIntArray4805;
                    for (int i_11_ = -128; i_11_ < 0; i_11_++) {
                        for (int i_12_ = -128; i_12_ < 0; i_12_++) {
                            if (is[i_2_] != 0)
                                is_10_[i_5_++] = 1140850688;
                            else {
                                int i_13_ = 0;
                                if ((is[i_2_ - 1] ^ 0xffffffff) != -1)
                                    i_13_++;
                                if ((is[1 + i_2_] ^ 0xffffffff) != -1)
                                    i_13_++;
                                if ((is[-i_1_ + i_2_] ^ 0xffffffff) != -1)
                                    i_13_++;
                                if ((is[i_2_ + i_1_] ^ 0xffffffff) != -1)
                                    i_13_++;
                                is_10_[i_5_++] = i_13_ * 17 << 1423750360;
                            }
                            i_2_++;
                        }
                        i_2_ += ((Class283) aClass283_2005).anInt3328 - 128;
                    }
                    if (anInterface21_Impl2_2008 != null)
                        anInterface21_Impl2_2008.method65(0, 128, 0, 0, 128, (Class249_Sub2.anIntArray4805), 128, (byte) 81);
                    else {
                        anInterface21_Impl2_2008 = aHa_Sub3_2011.method1033(128, (Class249_Sub2.anIntArray4805), (byte) -34, false, 128);
                        anInterface21_Impl2_2008.method70(1645, false, false);
                    }
                }
            }
        }
    }

    public static void method1561(byte i) {
        aInteractableArray2019 = null;
        aColorArray2012 = null;
        int i_14_ = -40 / ((i - 63) / 62);
    }

    final void method1562(Interface18_Impl2 interface18_impl2, int i, int i_15_) {
        if (i > i_15_) {
            method1560(0);
            aHa_Sub3_2011.method929(anInterface21_Impl2_2008, -8423);
            aHa_Sub3_2011.method1006(interface18_impl2, OutputStream_Sub1.aClass14_86, i, 0, 1 + -anInt2004 + anInt2009, anInt2004, i_15_ ^ ~0xe4);
        }
        anInt2013++;
    }

    final void method1563(byte i) {
        int i_16_ = -60 / ((i - 10) / 41);
        method1562(anInterface18_Impl2_2020, ((Class173) this).anInt2017, 0);
        anInt2016++;
    }

    Class173(ha_Sub3 var_ha_Sub3, Class283 class283, s_Sub3 var_s_Sub3, int i, int i_17_, int i_18_, int i_19_, int i_20_) {
        anInt2007 = i_19_;
        anInt2010 = i_20_;
        aClass283_2005 = class283;
        aHa_Sub3_2011 = var_ha_Sub3;
        int i_21_ = 1 << i_18_;
        int i_22_ = 0;
        int i_23_ = i << i_18_;
        int i_24_ = i_17_ << i_18_;
        for (int i_25_ = 0; i_25_ < i_21_; i_25_++) {
            int i_26_ = ((s) var_s_Sub3).anInt3468 * (i_25_ + i_24_) - -i_23_;
            for (int i_27_ = 0; i_21_ > i_27_; i_27_++) {
                short[] is = ((s_Sub3) var_s_Sub3).aShortArrayArray7990[i_26_++];
                if (is != null)
                    i_22_ += is.length;
            }
        }
        if ((i_22_ ^ 0xffffffff) < -1) {
            anInt2004 = 2147483647;
            anInt2009 = -2147483648;
            anInterface18_Impl2_2020 = aHa_Sub3_2011.method924(-23469, false);
            anInterface18_Impl2_2020.method48(i_22_, (byte) 102);
            for (int i_28_ = 0; i_28_ < 4; i_28_++) {
                Buffer buffer = anInterface18_Impl2_2020.method47(30907, true);
                if (buffer != null) {
                    Stream stream = aHa_Sub3_2011.method926((byte) -20, buffer);
                    if (!Stream.b()) {
                        for (int i_29_ = 0; i_21_ > i_29_; i_29_++) {
                            int i_30_ = (((s) var_s_Sub3).anInt3468 * (i_24_ - -i_29_) + i_23_);
                            for (int i_31_ = 0; (i_21_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
                                short[] is = (((s_Sub3) var_s_Sub3).aShortArrayArray7990[i_30_++]);
                                if (is != null) {
                                    for (int i_32_ = 0; i_32_ < is.length; i_32_++) {
                                        int i_33_ = 0xffff & is[i_32_];
                                        if (i_33_ < anInt2004)
                                            anInt2004 = i_33_;
                                        if ((anInt2009 ^ 0xffffffff) > (i_33_ ^ 0xffffffff))
                                            anInt2009 = i_33_;
                                        stream.d(i_33_);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int i_34_ = 0; i_34_ < i_21_; i_34_++) {
                            int i_35_ = i_23_ + ((i_24_ + i_34_) * ((s) var_s_Sub3).anInt3468);
                            for (int i_36_ = 0; i_21_ > i_36_; i_36_++) {
                                short[] is = (((s_Sub3) var_s_Sub3).aShortArrayArray7990[i_35_++]);
                                if (is != null) {
                                    for (int i_37_ = 0; ((is.length ^ 0xffffffff) < (i_37_ ^ 0xffffffff)); i_37_++) {
                                        int i_38_ = is[i_37_] & 0xffff;
                                        if ((i_38_ ^ 0xffffffff) < (anInt2009 ^ 0xffffffff))
                                            anInt2009 = i_38_;
                                        if (anInt2004 > i_38_)
                                            anInt2004 = i_38_;
                                        stream.b(i_38_);
                                    }
                                }
                            }
                        }
                    }
                    stream.a();
                    if (anInterface18_Impl2_2020.method50(-17694))
                        break;
                }
            }
            ((Class173) this).anInt2017 = i_22_ / 3;
        } else {
            anInterface21_Impl2_2008 = null;
            ((Class173) this).anInt2017 = 0;
        }
    }
}
