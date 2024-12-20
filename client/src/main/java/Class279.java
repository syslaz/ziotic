/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

abstract class Class279 {
    static int anInt3241;
    private short[] aShortArray3242;
    static Node_Sub36[] aClass248_Sub36Array3243 = new Node_Sub36[300];
    static double aDouble3244;
    private int anInt3245;
    int anInt3246 = 4;
    static int anInt3247;
    private int anInt3248;
    static int anInt3249;
    private int anInt3250;
    static boolean[][] aBooleanArrayArray3251;
    static int anInt3252 = 0;
    private int anInt3253;
    static int anInt3254;
    static boolean aBoolean3255 = false;
    static int anInt3256;
    private short[] aShortArray3257;

    private final void method2876(int i) {
        anInt3254++;
        Random random = new Random((long) anInt3245);
        for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -256; i_0_++)
            aShortArray3257[i_0_] = (short) i_0_;
        int i_1_ = 0;
        if (i != 7122)
            method2876(-30);
        for (/**/; (i_1_ ^ 0xffffffff) > -256; i_1_++) {
            int i_2_ = -i_1_ + 255;
            int i_3_ = RSInterface.method2016(i_2_, -1, random);
            short i_4_ = aShortArray3257[i_3_];
            aShortArray3257[i_3_] = aShortArray3257[i_2_];
            aShortArray3257[i_2_] = aShortArray3257[i_2_ + 256] = i_4_;
        }
    }

    static final void method2877(int i, PacketStream class248_sub9_sub2) {
        anInt3241++;
        class248_sub9_sub2.method2234(true);
        int i_5_ = 0;
        for (int i_6_ = i; i_6_ < Class131.anInt1600; i_6_++) {
            int i_7_ = Class271.anIntArray3156[i_6_];
            if ((Class209.aByteArray2423[i_7_] & 0x1) == 0) {
                if (i_5_ > 0) {
                    i_5_--;
                    Class209.aByteArray2423[i_7_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_7_]), 2);
                } else {
                    int i_8_ = class248_sub9_sub2.readBits(2059, 1);
                    if (i_8_ == 0) {
                        i_5_ = Class44_Sub1.method320(class248_sub9_sub2, 41);
                        Class209.aByteArray2423[i_7_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_7_]), 2);
                    } else
                        Class102.method723(i_7_, -2734, class248_sub9_sub2);
                }
            }
        }
        class248_sub9_sub2.method2233(-37);
        if (i_5_ != 0)
            throw new RuntimeException("nsn0");
        class248_sub9_sub2.method2234(true);
        for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (Class131.anInt1600 ^ 0xffffffff); i_9_++) {
            int i_10_ = Class271.anIntArray3156[i_9_];
            if ((Class209.aByteArray2423[i_10_] & 0x1 ^ 0xffffffff) != -1) {
                if ((i_5_ ^ 0xffffffff) < -1) {
                    Class209.aByteArray2423[i_10_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_10_]), 2);
                    i_5_--;
                } else {
                    int i_11_ = class248_sub9_sub2.readBits(2059, 1);
                    if ((i_11_ ^ 0xffffffff) == -1) {
                        i_5_ = Class44_Sub1.method320(class248_sub9_sub2, i + 87);
                        Class209.aByteArray2423[i_10_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_10_]), 2);
                    } else
                        Class102.method723(i_10_, -2734, class248_sub9_sub2);
                }
            }
        }
        class248_sub9_sub2.method2233(-62);
        if (i_5_ != 0)
            throw new RuntimeException("nsn1");
        class248_sub9_sub2.method2234(true);
        for (int i_12_ = 0; Class95.anInt1235 > i_12_; i_12_++) {
            int i_13_ = Node_Sub4.anIntArray6834[i_12_];
            if ((Class209.aByteArray2423[i_13_] & 0x1 ^ 0xffffffff) != -1) {
                if (i_5_ > 0) {
                    Class209.aByteArray2423[i_13_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_13_]), 2);
                    i_5_--;
                } else {
                    int i_14_ = class248_sub9_sub2.readBits(2059, 1);
                    if ((i_14_ ^ 0xffffffff) == -1) {
                        i_5_ = Class44_Sub1.method320(class248_sub9_sub2, 113);
                        Class209.aByteArray2423[i_13_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_13_]), 2);
                    } else if (Node_Sub8_Sub13_Sub1.method2102(2, i_13_, class248_sub9_sub2))
                        Class209.aByteArray2423[i_13_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_13_]), 2);
                }
            }
        }
        class248_sub9_sub2.method2233(-46);
        if ((i_5_ ^ 0xffffffff) != -1)
            throw new RuntimeException("nsn2");
        class248_sub9_sub2.method2234(true);
        for (int i_15_ = 0; Class95.anInt1235 > i_15_; i_15_++) {
            int i_16_ = Node_Sub4.anIntArray6834[i_15_];
            if ((0x1 & Class209.aByteArray2423[i_16_] ^ 0xffffffff) == -1) {
                if ((i_5_ ^ 0xffffffff) < -1) {
                    Class209.aByteArray2423[i_16_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_16_]), 2);
                    i_5_--;
                } else {
                    int i_17_ = class248_sub9_sub2.readBits(i + 2059, 1);
                    if ((i_17_ ^ 0xffffffff) == -1) {
                        i_5_ = Class44_Sub1.method320(class248_sub9_sub2, 74);
                        Class209.aByteArray2423[i_16_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_16_]), 2);
                    } else if (Node_Sub8_Sub13_Sub1.method2102(2, i_16_, class248_sub9_sub2))
                        Class209.aByteArray2423[i_16_] = (byte) Class358.retrieveLooksSettings((Class209.aByteArray2423[i_16_]), 2);
                }
            }
        }
        class248_sub9_sub2.method2233(i ^ ~0x4f);
        if ((i_5_ ^ 0xffffffff) != -1)
            throw new RuntimeException("nsn3");
        Class95.anInt1235 = 0;
        Class131.anInt1600 = 0;
        for (int i_18_ = 1; (i_18_ ^ 0xffffffff) > -2049; i_18_++) {
            Class209.aByteArray2423[i_18_] >>= 1;
            Player player = Node_Sub32.aPlayerArray7197[i_18_];
            if (player != null)
                Class271.anIntArray3156[Class131.anInt1600++] = i_18_;
            else
                Node_Sub4.anIntArray6834[Class95.anInt1235++] = i_18_;
        }
    }

    private final void method2878(byte i) {
        anInt3247++;
        aShortArray3242 = new short[((Class279) this).anInt3246];
        int i_19_ = 0;
        int i_20_ = -68 / ((-7 - i) / 60);
        for (/**/; (((Class279) this).anInt3246 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++)
            aShortArray3242[i_19_] = (short) (int) Math.pow(2.0, (double) i_19_);
    }

    abstract void method2879(int i);

    public static void method2880(int i) {
        aClass248_Sub36Array3243 = null;
        aBooleanArrayArray3251 = null;
        if (i != 1871698636)
            method2880(69);
    }

    static final void method2881() {
        for (int i = 0; i < Node_Sub14_Sub36.anInt9552; i++) {
            Animable animable = Class25.aAnimableArray345[i];
            Class55.method439(animable, true);
            Class25.aAnimableArray345[i] = null;
        }
        Node_Sub14_Sub36.anInt9552 = 0;
    }

    static final boolean method2882(byte i, int i_21_) {
        anInt3249++;
        if (i_21_ >= -19)
            anInt3252 = -104;
        int i_22_ = i & 0xff;
        if ((i_22_ ^ 0xffffffff) == -1)
            return false;
        if ((i_22_ ^ 0xffffffff) <= -129 && (i_22_ ^ 0xffffffff) > -161 && Class357.aCharArray4415[-128 + i_22_] == 0)
            return false;
        return true;
    }

    final void method2883(int i, int i_23_, int i_24_, int i_25_) {
        anInt3256++;
        int[] is = new int[i];
        int[] is_26_ = new int[i_23_];
        int[] is_27_ = new int[i_24_];
        for (int i_28_ = 0; i > i_28_; i_28_++)
            is[i_28_] = (i_28_ << -536177076) / i;
        for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_29_++)
            is_26_[i_29_] = (i_29_ << 967925164) / i_23_;
        for (int i_30_ = i_25_; (i_30_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_30_++)
            is_27_[i_30_] = (i_30_ << -1717062420) / i_24_;
        method2879(104);
        for (int i_31_ = 0; i_31_ < i_24_; i_31_++) {
            for (int i_32_ = 0; i_23_ > i_32_; i_32_++) {
                for (int i_33_ = 0; i_33_ < i; i_33_++) {
                    for (int i_34_ = 0; ((i_34_ ^ 0xffffffff) > (((Class279) this).anInt3246 ^ 0xffffffff)); i_34_++) {
                        int i_35_ = aShortArray3242[i_34_] << 1220818668;
                        int i_36_ = i_35_ * anInt3253 >> -1016607540;
                        int i_37_ = is_27_[i_31_] * i_35_ >> -625413684;
                        int i_38_ = is[i_33_] * i_35_ >> 406502700;
                        int i_39_ = i_35_ * anInt3250 >> 2107055500;
                        int i_40_ = anInt3248 * i_35_ >> 2014261644;
                        int i_41_ = i_35_ * is_26_[i_32_] >> 2021197324;
                        i_38_ *= anInt3253;
                        i_41_ *= anInt3248;
                        i_37_ *= anInt3250;
                        int i_42_ = i_38_ >> 1871698636;
                        int i_43_ = 1 + i_42_;
                        i_42_ &= 0xff;
                        int i_44_ = i_41_ >> 630762828;
                        int i_45_ = 1 + i_44_;
                        int i_46_ = i_37_ >> -1864147892;
                        i_44_ &= 0xff;
                        int i_47_ = i_46_ - -1;
                        if (i_40_ > i_45_)
                            i_45_ &= 0xff;
                        else
                            i_45_ = 0;
                        if ((i_36_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff))
                            i_43_ &= 0xff;
                        else
                            i_43_ = 0;
                        i_41_ &= 0xfff;
                        i_38_ &= 0xfff;
                        if ((i_47_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff))
                            i_47_ &= 0xff;
                        else
                            i_47_ = 0;
                        i_46_ &= 0xff;
                        i_37_ &= 0xfff;
                        int i_48_ = aShortArray3257[i_46_];
                        int i_49_ = Class372.anIntArray4586[i_38_];
                        int i_50_ = i_38_ - 4096;
                        int i_51_ = i_41_ - 4096;
                        int i_52_ = aShortArray3257[i_47_];
                        int i_53_ = i_37_ + -4096;
                        int i_54_ = Class372.anIntArray4586[i_37_];
                        int i_55_ = Class372.anIntArray4586[i_41_];
                        int i_56_ = aShortArray3257[i_48_ + i_44_];
                        int i_57_ = aShortArray3257[i_44_ + i_52_];
                        int i_58_ = aShortArray3257[i_52_ + i_45_];
                        int i_59_ = aShortArray3257[i_45_ - -i_48_];
                        int i_60_ = Class5.method180(aShortArray3257[i_56_ + i_42_], i_38_, i_37_, i_41_, false);
                        int i_61_ = Class5.method180(aShortArray3257[i_56_ + i_43_], i_50_, i_37_, i_41_, false);
                        int i_62_ = (i_49_ * (i_61_ - i_60_) >> -1140890772) + i_60_;
                        i_60_ = Class5.method180(aShortArray3257[i_42_ + i_59_], i_38_, i_37_, i_51_, false);
                        i_61_ = Class5.method180(aShortArray3257[i_59_ + i_43_], i_50_, i_37_, i_51_, false);
                        int i_63_ = i_60_ + (i_49_ * (i_61_ - i_60_) >> 1895711532);
                        i_60_ = Class5.method180(aShortArray3257[i_42_ - -i_57_], i_38_, i_53_, i_41_, false);
                        int i_64_ = i_62_ - -(i_55_ * (-i_62_ + i_63_) >> 2108372556);
                        i_61_ = Class5.method180(aShortArray3257[i_43_ - -i_57_], i_50_, i_53_, i_41_, false);
                        i_62_ = i_60_ - -(i_49_ * (-i_60_ + i_61_) >> 1383689900);
                        i_60_ = Class5.method180(aShortArray3257[i_58_ + i_42_], i_38_, i_53_, i_51_, false);
                        i_61_ = Class5.method180(aShortArray3257[i_58_ + i_43_], i_50_, i_53_, i_51_, false);
                        i_63_ = i_60_ - -(i_49_ * (i_61_ + -i_60_) >> -1154801268);
                        int i_65_ = i_62_ - -(i_55_ * (-i_62_ + i_63_) >> -1959035572);
                        method2885(-256, i_64_ - -(i_54_ * (-i_64_ + i_65_) >> 1921602124), i_34_);
                    }
                    method2884(i_25_ ^ 0x70fe);
                }
            }
        }
    }

    abstract void method2884(int i);

    abstract void method2885(int i, int i_66_, int i_67_);

    Class279(int i, int i_68_, int i_69_, int i_70_, int i_71_) {
        anInt3245 = 0;
        anInt3250 = 4;
        anInt3253 = 4;
        anInt3248 = 4;
        aShortArray3257 = new short[512];
        anInt3245 = i;
        anInt3253 = i_69_;
        anInt3248 = i_70_;
        anInt3250 = i_71_;
        ((Class279) this).anInt3246 = i_68_;
        method2878((byte) 115);
        method2876(7122);
    }
}
