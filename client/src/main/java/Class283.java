/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class283 {
    static int anInt3323;
    static int anInt3324;
    static int anInt3325;
    private int anInt3326;
    private int anInt3327;
    int anInt3328;
    private s_Sub3 aS_Sub3_3329;
    static Node_Sub5 aClass248_Sub5_3330 = new Node_Sub5(0, 0);
    static int anInt3331;
    static int anInt3332;
    static int anInt3333;
    static int anInt3334;
    byte[] aByteArray3335;
    private ha_Sub3 aHa_Sub3_3336;
    private Class173[][] aClass173ArrayArray3337;
    static byte[][][] aByteArrayArrayArray3338;
    static int anInt3339;
    private int anInt3340;
    private int anInt3341;
    static int anInt3342;
    static Class342 aClass342_3343;
    static int anInt3344 = 0;

    final boolean method3051(byte i, int i_0_, r var_r, int i_1_) {
        anInt3332++;
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        i_0_ += ((r_Sub2) var_r_Sub2).anInt10285 + 1;
        i_1_ += 1 + ((r_Sub2) var_r_Sub2).anInt10287;
        if (i != 95)
            ((Class283) this).aByteArray3335 = null;
        int i_2_ = i_0_ * ((Class283) this).anInt3328 + i_1_;
        int i_3_ = ((r_Sub2) var_r_Sub2).anInt10271;
        int i_4_ = ((r_Sub2) var_r_Sub2).anInt10277;
        int i_5_ = -i_4_ + ((Class283) this).anInt3328;
        if ((i_0_ ^ 0xffffffff) >= -1) {
            int i_6_ = 1 + -i_0_;
            i_0_ = 1;
            i_3_ -= i_6_;
            i_2_ += i_6_ * ((Class283) this).anInt3328;
        }
        if (anInt3326 <= i_3_ + i_0_) {
            int i_7_ = 1 + i_0_ + (i_3_ + -anInt3326);
            i_3_ -= i_7_;
        }
        if ((i_1_ ^ 0xffffffff) >= -1) {
            int i_8_ = -i_1_ + 1;
            i_5_ += i_8_;
            i_4_ -= i_8_;
            i_2_ += i_8_;
            i_1_ = 1;
        }
        if ((i_4_ + i_1_ ^ 0xffffffff) <= (((Class283) this).anInt3328 ^ 0xffffffff)) {
            int i_9_ = -((Class283) this).anInt3328 + (1 + i_4_) + i_1_;
            i_4_ -= i_9_;
            i_5_ += i_9_;
        }
        if ((i_4_ ^ 0xffffffff) >= -1 || (i_3_ ^ 0xffffffff) >= -1)
            return false;
        int i_10_ = 8;
        i_5_ += (-1 + i_10_) * ((Class283) this).anInt3328;
        return Class120.method1126(((Class283) this).aByteArray3335, i_2_, i_4_, i_10_, 1, i_5_, i_3_);
    }

    final void method3052(boolean[][] bools, int i, int i_11_, int i_12_, boolean bool, int i_13_) {
        anInt3339++;
        aHa_Sub3_3336.method923(false, -8043);
        aHa_Sub3_3336.method950((byte) 36, false);
        aHa_Sub3_3336.method942(i_12_ + -129, 1);
        aHa_Sub3_3336.method993((byte) 117, 1);
        aHa_Sub3_3336.method962(-2, i_12_ + 105, false, false);
        float f = 1.0F / (float) (((ha_Sub3) aHa_Sub3_3336).anInt6193 * 128);
        if (i_12_ != 0)
            method3056(null, -73, -54, 76, null, false, -34, -14);
        if (!bool) {
            for (int i_14_ = 0; (anInt3341 ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
                int i_15_ = i_14_ << anInt3340;
                int i_16_ = i_14_ - -1 << anInt3340;
                for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (anInt3327 ^ 0xffffffff); i_17_++) {
                    Class173 class173 = aClass173ArrayArray3337[i_17_][i_14_];
                    if (class173 != null) {
                        Interface18_Impl2 interface18_impl2 = aHa_Sub3_3336.method961((byte) -107, (3 * (((Class173) class173).anInt2017)));
                        Buffer buffer = interface18_impl2.method47(i_12_ ^ 0x78bb, true);
                        if (buffer != null) {
                            Stream stream = aHa_Sub3_3336.method926((byte) -20, buffer);
                            int i_18_ = 0;
                            int i_19_ = i_17_ << anInt3340;
                            int i_20_ = i_17_ + 1 << anInt3340;
                            for (int i_21_ = i_15_; (i_16_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
                                if (-i <= i_21_ - i_13_ && ((-i_13_ + i_21_ ^ 0xffffffff) >= (i ^ 0xffffffff))) {
                                    int i_22_ = (((s) aS_Sub3_3329).anInt3468 * i_21_ + i_19_);
                                    for (int i_23_ = i_19_; i_23_ < i_20_; i_23_++) {
                                        if (((-i_11_ + i_23_ ^ 0xffffffff) <= (-i ^ 0xffffffff)) && ((-i_11_ + i_23_ ^ 0xffffffff) >= (i ^ 0xffffffff)) && (bools[i + -i_11_ + i_23_][-i_13_ + (i_21_ - -i)])) {
                                            short[] is = (((s_Sub3) aS_Sub3_3329).aShortArrayArray7990[i_22_]);
                                            if (is != null) {
                                                if (Stream.b()) {
                                                    for (int i_24_ = 0; ((i_24_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_24_++) {
                                                        stream.b(is[i_24_] & 0xffff);
                                                        i_18_++;
                                                    }
                                                } else {
                                                    for (int i_25_ = 0; i_25_ < is.length; i_25_++) {
                                                        i_18_++;
                                                        stream.d(is[i_25_] & 0xffff);
                                                    }
                                                }
                                            }
                                        }
                                        i_22_++;
                                    }
                                }
                            }
                            stream.a();
                            if (interface18_impl2.method50(-17694) && i_18_ > 0) {
                                Class238_Sub2 class238_sub2 = aHa_Sub3_3336.method1022(i_12_);
                                class238_sub2.method1898(f, f, 1.0F, (byte) -49);
                                class238_sub2.method1862(-i_17_, -i_14_, 0);
                                aHa_Sub3_3336.method984(i_12_ + 3, (Node_Sub14_Sub16.aClass34_9338));
                                class173.method1562(interface18_impl2, i_18_ / 3, 0);
                            }
                        }
                    }
                }
            }
        } else {
            for (int i_26_ = 0; i_26_ < anInt3341; i_26_++) {
                int i_27_ = i_26_ << anInt3340;
                int i_28_ = 1 + i_26_ << anInt3340;
                for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (anInt3327 ^ 0xffffffff); i_29_++) {
                    if (aClass173ArrayArray3337[i_29_][i_26_] != null) {
                        int i_30_ = i_29_ << anInt3340;
                        int i_31_ = 1 + i_29_ << anInt3340;
                        while_186_:
                        for (int i_32_ = i_30_; (i_31_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
                            if ((-i ^ 0xffffffff) >= (i_32_ + -i_11_ ^ 0xffffffff) && -i_11_ + i_32_ <= i) {
                                for (int i_33_ = i_27_; i_28_ > i_33_; i_33_++) {
                                    if (((-i_13_ + i_33_ ^ 0xffffffff) <= (-i ^ 0xffffffff)) && ((i_33_ + -i_13_ ^ 0xffffffff) >= (i ^ 0xffffffff)) && (bools[-i_11_ + (i_32_ - -i)][i + -i_13_ + i_33_])) {
                                        Class238_Sub2 class238_sub2 = aHa_Sub3_3336.method1022(i_12_);
                                        class238_sub2.method1898(f, f, 1.0F, (byte) -49);
                                        class238_sub2.method1862(-i_29_, -i_26_, 0);
                                        aHa_Sub3_3336.method984(i_12_ + 3, (Node_Sub14_Sub16.aClass34_9338));
                                        aClass173ArrayArray3337[i_29_][i_26_].method1563((byte) -67);
                                        break while_186_;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        aHa_Sub3_3336.method925(-79);
    }

    final void method3053(int i, r var_r, int i_34_, int i_35_) {
        anInt3331++;
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        i_35_ += i + ((r_Sub2) var_r_Sub2).anInt10285;
        i_34_ += 1 + ((r_Sub2) var_r_Sub2).anInt10287;
        int i_36_ = i_34_ - -(((Class283) this).anInt3328 * i_35_);
        int i_37_ = 0;
        int i_38_ = ((r_Sub2) var_r_Sub2).anInt10271;
        int i_39_ = ((r_Sub2) var_r_Sub2).anInt10277;
        int i_40_ = -i_39_ + ((Class283) this).anInt3328;
        int i_41_ = 0;
        if (i_35_ <= 0) {
            int i_42_ = 1 - i_35_;
            i_37_ += i_39_ * i_42_;
            i_35_ = 1;
            i_36_ += ((Class283) this).anInt3328 * i_42_;
            i_38_ -= i_42_;
        }
        if (anInt3326 <= i_38_ + i_35_) {
            int i_43_ = -anInt3326 + i_35_ + (i_38_ + 1);
            i_38_ -= i_43_;
        }
        if (i_34_ <= 0) {
            int i_44_ = 1 - i_34_;
            i_40_ += i_44_;
            i_34_ = 1;
            i_36_ += i_44_;
            i_41_ += i_44_;
            i_39_ -= i_44_;
            i_37_ += i_44_;
        }
        if (((Class283) this).anInt3328 <= i_39_ + i_34_) {
            int i_45_ = 1 + (i_34_ - -i_39_) + -((Class283) this).anInt3328;
            i_39_ -= i_45_;
            i_41_ += i_45_;
            i_40_ += i_45_;
        }
        if (i_39_ > 0 && (i_38_ ^ 0xffffffff) < -1) {
            Node_Sub14_Sub1.method2278(i_38_, i_40_, i_37_, (((r_Sub2) var_r_Sub2).aByteArray10280), i + 2, i_39_, ((Class283) this).aByteArray3335, i_36_, i_41_);
            method3058(i_39_, 42, i_35_, i_34_, i_38_);
        }
    }

    static final boolean method3054(byte i, int i_46_, int i_47_) {
        anInt3325++;
        int i_48_ = 15 / ((i - 37) / 39);
        if ((i_47_ & 0x800) == 0)
            return false;
        return true;
    }

    public static void method3055(byte i) {
        aClass248_Sub5_3330 = null;
        aByteArrayArrayArray3338 = null;
        aClass342_3343 = null;
        if (i < 20)
            method3054((byte) 82, 68, -58);
    }

    static final void method3056(ha var_ha, int i, int i_49_, int i_50_, String string, boolean bool, int i_51_, int i_52_) {
        if (Class346_Sub2.aClass129_8259 == null || Node_Sub14_Sub12_Sub1.aClass129_10307 == null) {
            if (Class290.aClass381_3417.method3920(Class81.anInt4913, 111) && Class290.aClass381_3417.method3920(Class340_Sub7.anInt8162, 125)) {
                Class346_Sub2.aClass129_8259 = var_ha.a(Class157.method1379(Class290.aClass381_3417, Class81.anInt4913, 0), true);
                Class157 class157 = Class157.method1379(Class290.aClass381_3417, Class340_Sub7.anInt8162, 0);
                Node_Sub14_Sub12_Sub1.aClass129_10307 = var_ha.a(class157, true);
                class157.method1389();
                Class297_Sub1.aClass129_8483 = var_ha.a(class157, true);
            } else
                var_ha.aa(i_50_, i_52_, i_49_, i, (-Class357.anInt4410 + 255 << 195341592 | Node_Sub42_Sub3.anInt9793), 1);
        }
        anInt3324++;
        if (Class346_Sub2.aClass129_8259 != null && Node_Sub14_Sub12_Sub1.aClass129_10307 != null) {
            int i_53_ = ((i_49_ - 2 * Node_Sub14_Sub12_Sub1.aClass129_10307.method1175()) / Class346_Sub2.aClass129_8259.method1175());
            for (int i_54_ = 0; (i_53_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++)
                Class346_Sub2.aClass129_8259.method1168((Node_Sub14_Sub12_Sub1.aClass129_10307.method1175() + (i_50_ - -(Class346_Sub2.aClass129_8259.method1175() * i_54_))), i_52_);
            Node_Sub14_Sub12_Sub1.aClass129_10307.method1168(i_50_, i_52_);
            Class297_Sub1.aClass129_8483.method1168((i_49_ + i_50_ - Class297_Sub1.aClass129_8483.method1175()), i_52_);
        }
        Node_Sub14_Sub27.aClass48_9449.method369(bool, i_50_ + 3, string, i_52_ - -14, -1, (~0xffffff | (Class279_Sub1_Sub1.anInt9818)));
        var_ha.aa(i_50_, i + i_52_, i_49_, -i + i_51_, (Node_Sub42_Sub3.anInt9793 | -Class357.anInt4410 + 255 << 1095659192), 1);
    }

    final void method3057(int i, int i_55_, int i_56_, r var_r) {
        anInt3333++;
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        i += 1 + ((r_Sub2) var_r_Sub2).anInt10285;
        i_55_ += ((r_Sub2) var_r_Sub2).anInt10287 + 1;
        int i_57_ = i_55_ - -(i * ((Class283) this).anInt3328);
        int i_58_ = 0;
        int i_59_ = ((r_Sub2) var_r_Sub2).anInt10271;
        int i_60_ = ((r_Sub2) var_r_Sub2).anInt10277;
        int i_61_ = -i_60_ + ((Class283) this).anInt3328;
        int i_62_ = 0;
        if (i <= 0) {
            int i_63_ = 1 - i;
            i = 1;
            i_58_ += i_63_ * i_60_;
            i_59_ -= i_63_;
            i_57_ += ((Class283) this).anInt3328 * i_63_;
        }
        if ((i - -i_59_ ^ 0xffffffff) <= (anInt3326 ^ 0xffffffff)) {
            int i_64_ = -anInt3326 + (i_59_ + i - -1);
            i_59_ -= i_64_;
        }
        if (i_55_ <= 0) {
            int i_65_ = 1 + -i_55_;
            i_60_ -= i_65_;
            i_57_ += i_65_;
            i_55_ = 1;
            i_62_ += i_65_;
            i_61_ += i_65_;
            i_58_ += i_65_;
        }
        if (i_56_ == -11697) {
            if ((((Class283) this).anInt3328 ^ 0xffffffff) >= (i_55_ - -i_60_ ^ 0xffffffff)) {
                int i_66_ = i_60_ + (i_55_ - -1) + -((Class283) this).anInt3328;
                i_62_ += i_66_;
                i_60_ -= i_66_;
                i_61_ += i_66_;
            }
            if (i_60_ > 0 && i_59_ > 0) {
                Node_Sub8.method2023(i_62_, i_57_, i_60_, i_59_, 13427, ((r_Sub2) var_r_Sub2).aByteArray10280, ((Class283) this).aByteArray3335, i_58_, i_61_);
                method3058(i_60_, i_56_ + 11816, i, i_55_, i_59_);
            }
        }
    }

    private final void method3058(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
        anInt3334++;
        if (aClass173ArrayArray3337 != null && i_67_ >= 32) {
            int i_71_ = -1 + i_69_ >> 1881004807;
            int i_72_ = i + i_69_ - 1 + -1 >> -898270201;
            int i_73_ = -1 + i_68_ >> 1945014631;
            int i_74_ = -1 + (i_68_ + i_70_ + -1) >> 1010381639;
            for (int i_75_ = i_71_; (i_75_ ^ 0xffffffff) >= (i_72_ ^ 0xffffffff); i_75_++) {
                Class173[] class173s = aClass173ArrayArray3337[i_75_];
                for (int i_76_ = i_73_; i_74_ >= i_76_; i_76_++) {
                    if (class173s[i_76_] != null)
                        ((Class173) class173s[i_76_]).aBoolean2006 = true;
                }
            }
        }
    }

    static final void method3059(byte i) {
        anInt3323++;
        if (!Class359.aBoolean4437 && i == 3) {
            Class359.aBoolean4437 = true;
            Class192.aFloat2216 += (24.0F - Class192.aFloat2216) / 2.0F;
            Class207.aBoolean2398 = true;
        }
    }

    final void method3060(byte i) {
        anInt3342++;
        aClass173ArrayArray3337 = new Class173[anInt3327][anInt3341];
        for (int i_77_ = 0; i_77_ < anInt3341; i_77_++) {
            for (int i_78_ = 0; anInt3327 > i_78_; i_78_++) {
                aClass173ArrayArray3337[i_78_][i_77_] = new Class173(aHa_Sub3_3336, this, aS_Sub3_3329, i_78_, i_77_, anInt3340, i_78_ * 128 - -1, 1 + i_77_ * 128);
                if ((((Class173) aClass173ArrayArray3337[i_78_][i_77_]).anInt2017) == 0)
                    aClass173ArrayArray3337[i_78_][i_77_] = null;
            }
        }
        if (i <= 27)
            aClass342_3343 = null;
    }

    Class283(ha_Sub3 var_ha_Sub3, s_Sub3 var_s_Sub3) {
        aHa_Sub3_3336 = var_ha_Sub3;
        aS_Sub3_3329 = var_s_Sub3;
        ((Class283) this).anInt3328 = (((s) aS_Sub3_3329).anInt3468 * ((s) aS_Sub3_3329).anInt3465 >> ((ha_Sub3) aHa_Sub3_3336).anInt6156) + 2;
        anInt3326 = (((s) aS_Sub3_3329).anInt3465 * ((s) aS_Sub3_3329).anInt3472 >> ((ha_Sub3) aHa_Sub3_3336).anInt6156) + 2;
        ((Class283) this).aByteArray3335 = new byte[((Class283) this).anInt3328 * anInt3326];
        anInt3340 = (-((s) aS_Sub3_3329).anInt3466 + (((ha_Sub3) aHa_Sub3_3336).anInt6156 + 7));
        anInt3327 = ((s) aS_Sub3_3329).anInt3468 >> anInt3340;
        anInt3341 = ((s) aS_Sub3_3329).anInt3472 >> anInt3340;
    }
}
