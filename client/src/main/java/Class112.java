/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class112 implements Interface21 {
    ha_Sub3_Sub1 aHa_Sub3_Sub1_5200;
    private boolean aBoolean5201;
    static boolean[][] aBooleanArrayArray5202;
    static int[] anIntArray5203 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    static int[] anIntArray5204 = new int[1000];
    static int anInt5205;
    static Class129 aClass129_5206;
    static int anInt5207;
    static int anInt5208;
    private Class171 aClass171_5209 = Class162.aClass171_1904;
    static int anInt5210;
    static int anInt5211;
    private int anInt5212;
    static int[] anIntArray5213;
    static int anInt5214;
    static int anInt5215;
    int anInt5216;
    static int anInt5217;
    static int anInt5218;
    static int anInt5219;
    static int anInt5220;
    Class228 aClass228_5221;
    static int anInt5222;
    private int anInt5223;
    Class264 aClass264_5224;
    static int anInt5225;

    static final boolean method785(byte i) {
        anInt5217++;
        if (i < 36)
            method789((byte) 93, null);
        return Class261.aBoolean2973;
    }

    private final void method786(boolean bool) {
        if (anInt5212 > 0) {
            ((Class112) this).aHa_Sub3_Sub1_5200.method1055(16384, method787(3), anInt5212);
            anInt5212 = 0;
        }
        anInt5211++;
        if (bool != true)
            method790(false);
    }

    protected final void finalize() throws Throwable {
        anInt5210++;
        method786(true);
        super.finalize();
    }

    private final int method787(int i) {
        anInt5205++;
        if (i != 3)
            return -82;
        int i_0_ = (((Class264) ((Class112) this).aClass264_5224).anInt2991 * ((Class228) ((Class112) this).aClass228_5221).anInt2570 * anInt5223);
        if (!aBoolean5201)
            return i_0_;
        return i_0_ * 4 / 3;
    }

    private final void method788(int i, boolean bool) {
        if (bool == false) {
            ((ha_Sub3) ((Class112) this).aHa_Sub3_Sub1_5200).anInt6140 -= i;
            anInt5208++;
            ((ha_Sub3) ((Class112) this).aHa_Sub3_Sub1_5200).anInt6140 += method787(3);
        }
    }

    public final void method79(int i) {
        if (i != 32073)
            anInt5223 = 73;
        anInt5207++;
        int i_1_ = ((Class112) this).aHa_Sub3_Sub1_5200.method963(128);
        int i_2_ = (((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anIntArray8767[i_1_]);
        if ((((Class112) this).anInt5216 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
            if (i_2_ != 0) {
                OpenGL.glBindTexture(i_2_, 0);
                OpenGL.glDisable(i_2_);
            }
            OpenGL.glEnable(((Class112) this).anInt5216);
            ((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anIntArray8767[i_1_] = ((Class112) this).anInt5216;
        }
        OpenGL.glBindTexture(((Class112) this).anInt5216, anInt5212);
    }

    public final void method78(int i, Class171 class171) {
        if (class171 != aClass171_5209) {
            aClass171_5209 = class171;
            method792((byte) 58);
        }
        if (i != -9495)
            aClass129_5206 = null;
        anInt5219++;
    }

    static final int[] method789(byte i, Node_Sub36 class248_sub36) {
        anInt5214++;
        ByteStream class248_sub9 = new ByteStream(518);
        int[] is = new int[4];
        for (int i_3_ = 0; i_3_ < 4; i_3_++)
            is[i_3_] = (int) (9.9999999E7 * Math.random());
        class248_sub9.writeByte(-120, 10);
        class248_sub9.writeInt(27695, is[0]);
        class248_sub9.writeInt(i ^ ~0x6c49, is[1]);
        class248_sub9.writeInt(i ^ ~0x6c49, is[2]);
        class248_sub9.writeInt(27695, is[3]);
        for (int i_4_ = 0; i_4_ < 10; i_4_++)
            class248_sub9.writeInt(27695, (int) (9.9999999E7 * Math.random()));
        class248_sub9.writeShort(1182, (int) (9.9999999E7 * Math.random()));
        class248_sub9.method2194(Class111_Sub1.aBigInteger5527, Node_Sub40_Sub1.aBigInteger9773, 112);
        if (i != -103)
            method793((byte) 8);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2215(0, (byte) -32, ((ByteStream) class248_sub9).buffer, ((ByteStream) class248_sub9).offset);
        return is;
    }

    final int method790(boolean bool) {
        if (bool != true)
            method790(true);
        anInt5220++;
        if (Class228.aClass228_2573 == ((Class112) this).aClass228_5221) {
            if (s.aClass264_3467 == ((Class112) this).aClass264_5224)
                return 6407;
            if (Class120.aClass264_1508 == ((Class112) this).aClass264_5224)
                return 6408;
            if (((Class112) this).aClass264_5224 == Class130.aClass264_1573)
                return 6406;
            if (((Class112) this).aClass264_5224 != Class160.aClass264_1889) {
                if (Class346_Sub7_Sub2_Sub3.aClass264_10395 != ((Class112) this).aClass264_5224) {
                    if (Class282_Sub28.aClass264_7894 == ((Class112) this).aClass264_5224)
                        return 6145;
                } else
                    return 6410;
            } else
                return 6409;
        } else if (Class228.aClass228_2576 == ((Class112) this).aClass228_5221) {
            if (((Class112) this).aClass264_5224 == s.aClass264_3467)
                return 34843;
            if (((Class112) this).aClass264_5224 == Class120.aClass264_1508)
                return 34842;
            if (((Class112) this).aClass264_5224 != Class130.aClass264_1573) {
                if (Class160.aClass264_1889 == ((Class112) this).aClass264_5224)
                    return 34846;
                if (Class346_Sub7_Sub2_Sub3.aClass264_10395 != ((Class112) this).aClass264_5224) {
                    if (((Class112) this).aClass264_5224 == Class282_Sub28.aClass264_7894)
                        return 6145;
                } else
                    return 34847;
            } else
                return 34844;
        } else if (Class228.aClass228_2577 == ((Class112) this).aClass228_5221) {
            if (s.aClass264_3467 == ((Class112) this).aClass264_5224)
                return 34837;
            if (((Class112) this).aClass264_5224 != Class120.aClass264_1508) {
                if (Class130.aClass264_1573 != ((Class112) this).aClass264_5224) {
                    if (Class160.aClass264_1889 == ((Class112) this).aClass264_5224)
                        return 34840;
                    if (Class346_Sub7_Sub2_Sub3.aClass264_10395 != ((Class112) this).aClass264_5224) {
                        if (((Class112) this).aClass264_5224 == Class282_Sub28.aClass264_7894)
                            return 6145;
                    } else
                        return 34841;
                } else
                    return 34838;
            } else
                return 34836;
        }
        throw new IllegalStateException();
    }

    final void method791(byte[] is, byte i, int i_5_, int i_6_, int i_7_) {
        anInt5225++;
        if ((i_7_ ^ 0xffffffff) < -1 && !Class343.method3508(i_7_, -31218))
            throw new IllegalArgumentException("");
        if (i_5_ > 0 && !Class343.method3508(i_5_, i + -31154))
            throw new IllegalArgumentException("");
        int i_8_ = ((Class264) ((Class112) this).aClass264_5224).anInt2991;
        int i_9_ = 0;
        int i_10_ = (i_7_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) ? i_5_ : i_7_;
        int i_11_ = i_7_ >> -1445827231;
        int i_12_ = i_5_ >> 1764107041;
        byte[] is_13_ = is;
        if (i != -64)
            anIntArray5203 = null;
        byte[] is_14_ = new byte[i_8_ * i_11_ * i_12_];
        for (; ; ) {
            OpenGL.glTexImage2Dub(i_6_, i_9_, method790(true), i_7_, i_5_, 0, (Node_Sub42_Sub2.method2633(((Class112) this).aClass264_5224, true)), 5121, is_13_, 0);
            if ((i_10_ ^ 0xffffffff) >= -2)
                break;
            int i_15_ = i_8_ * i_7_;
            for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_16_++) {
                int i_17_ = i_16_;
                int i_18_ = i_16_;
                int i_19_ = i_15_ + i_18_;
                for (int i_20_ = 0; (i_12_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
                    for (int i_21_ = 0; i_11_ > i_21_; i_21_++) {
                        int i_22_ = is_13_[i_18_];
                        i_18_ += i_8_;
                        i_22_ += is_13_[i_18_];
                        i_22_ += is_13_[i_19_];
                        i_18_ += i_8_;
                        i_19_ += i_8_;
                        i_22_ += is_13_[i_19_];
                        is_14_[i_17_] = (byte) (i_22_ >> 1424565602);
                        i_19_ += i_8_;
                        i_17_ += i_8_;
                    }
                    i_19_ += i_15_;
                    i_18_ += i_15_;
                }
            }
            byte[] is_23_ = is_14_;
            is_14_ = is_13_;
            i_7_ = i_11_;
            is_13_ = is_23_;
            i_5_ = i_12_;
            i_12_ >>= 1;
            i_10_ >>= 1;
            i_9_++;
            i_11_ >>= 1;
        }
    }

    private final void method792(byte i) {
        if (i != 58)
            aClass129_5206 = null;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        anInt5215++;
        if (Class162.aClass171_1904 != aClass171_5209) {
            OpenGL.glTexParameteri(((Class112) this).anInt5216, 10241, !aBoolean5201 ? 9728 : 9984);
            OpenGL.glTexParameteri(((Class112) this).anInt5216, 10240, 9728);
        } else {
            OpenGL.glTexParameteri(((Class112) this).anInt5216, 10241, !aBoolean5201 ? 9729 : 9987);
            OpenGL.glTexParameteri(((Class112) this).anInt5216, 10240, 9729);
        }
    }

    public static void method793(byte i) {
        anIntArray5204 = null;
        anIntArray5213 = null;
        if (i >= -75)
            method789((byte) 89, null);
        aClass129_5206 = null;
        aBooleanArrayArray5202 = null;
        anIntArray5203 = null;
    }

    static int method794(int i, int i_24_) {
        return i & i_24_;
    }

    final void method795(int i, byte i_25_, int i_26_, int i_27_, float[] fs) {
        anInt5218++;
        if ((i_27_ ^ 0xffffffff) < -1 && !Class343.method3508(i_27_, -31218))
            throw new IllegalArgumentException("");
        if (i > 0 && !Class343.method3508(i, -31218))
            throw new IllegalArgumentException("");
        int i_28_ = ((Class264) ((Class112) this).aClass264_5224).anInt2991;
        int i_29_ = 0;
        int i_30_ = (i ^ 0xffffffff) >= (i_27_ ^ 0xffffffff) ? i : i_27_;
        int i_31_ = i_27_ >> 685585889;
        if (i_25_ < 35)
            aBoolean5201 = false;
        int i_32_ = i >> 1300791169;
        float[] fs_33_ = fs;
        float[] fs_34_ = new float[i_32_ * (i_31_ * i_28_)];
        for (; ; ) {
            OpenGL.glTexImage2Df(i_26_, i_29_, method790(true), i_27_, i, 0, (Node_Sub42_Sub2.method2633(((Class112) this).aClass264_5224, true)), 5126, fs_33_, 0);
            if ((i_30_ ^ 0xffffffff) >= -2)
                break;
            int i_35_ = i_27_ * i_28_;
            float[] fs_36_ = fs_34_;
            for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_37_++) {
                int i_38_ = i_37_;
                int i_39_ = i_37_;
                int i_40_ = i_35_ + i_39_;
                for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > (i_32_ ^ 0xffffffff); i_41_++) {
                    for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > (i_31_ ^ 0xffffffff); i_42_++) {
                        float f = fs_33_[i_39_];
                        i_39_ += i_28_;
                        f += fs_33_[i_39_];
                        i_39_ += i_28_;
                        f += fs_33_[i_40_];
                        i_40_ += i_28_;
                        f += fs_33_[i_40_];
                        fs_34_[i_38_] = 0.25F * f;
                        i_40_ += i_28_;
                        i_38_ += i_28_;
                    }
                    i_40_ += i_35_;
                    i_39_ += i_35_;
                }
            }
            fs_34_ = fs_33_;
            i_27_ = i_31_;
            fs_33_ = fs_36_;
            i = i_32_;
            i_32_ >>= 1;
            i_31_ >>= 1;
            i_30_ >>= 1;
            i_29_++;
        }
    }

    final void method796(int[] is, int i, int i_43_, boolean bool, int i_44_) {
        anInt5222++;
        if ((i_44_ ^ 0xffffffff) < -1 && !Class343.method3508(i_44_, -31218))
            throw new IllegalArgumentException("");
        if (i_43_ > 0 && !Class343.method3508(i_43_, -31218))
            throw new IllegalArgumentException("");
        if (Class120.aClass264_1508 != ((Class112) this).aClass264_5224)
            throw new IllegalArgumentException("");
        int i_45_ = 0;
        int i_46_ = (i_44_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff) ? i_43_ : i_44_;
        int i_47_ = i_44_ >> 2059460705;
        int i_48_ = i_43_ >> -1686940255;
        if (bool == false) {
            int[] is_49_ = is;
            int[] is_50_ = new int[i_48_ * i_47_];
            for (; ; ) {
                OpenGL.glTexImage2Di(i, i_45_, method790(true), i_44_, i_43_, 0, 32993, (((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anInt8759), is_49_, 0);
                if ((i_46_ ^ 0xffffffff) >= -2)
                    break;
                int i_51_ = 0;
                int i_52_ = 0;
                int i_53_ = i_52_ + i_44_;
                for (int i_54_ = 0; (i_48_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++) {
                    for (int i_55_ = 0; i_47_ > i_55_; i_55_++) {
                        int i_56_ = is_49_[i_52_++];
                        int i_57_ = is_49_[i_53_++];
                        int i_58_ = is_49_[i_52_++];
                        int i_59_ = i_56_ & 0xff;
                        int i_60_ = i_56_ >> 1109279384 & 0xff;
                        int i_61_ = i_56_ >> 1454470824 & 0xff;
                        int i_62_ = is_49_[i_53_++];
                        int i_63_ = 0xff & i_56_ >> -630163248;
                        i_63_ += (i_58_ & 0xff8a2b) >> 1285954160;
                        i_60_ += i_58_ >> 1239740120 & 0xff;
                        i_61_ += i_58_ >> -1245941976 & 0xff;
                        i_59_ += 0xff & i_58_;
                        i_63_ += (i_57_ & 0xff841c) >> -2130924816;
                        i_60_ += i_57_ >> -1163919624 & 0xff;
                        i_61_ += (0xff45 & i_57_) >> 161157448;
                        i_59_ += 0xff & i_57_;
                        i_60_ += i_62_ >> 480726136 & 0xff;
                        i_61_ += i_62_ >> -87485528 & 0xff;
                        i_59_ += 0xff & i_62_;
                        i_63_ += i_62_ >> 254594928 & 0xff;
                        is_50_[i_51_++] = (Class358.retrieveLooksSettings(method794(i_59_, 1020) >> 256366466, (Class358.retrieveLooksSettings(method794(65280, i_61_ << 1855008646), (Class358.retrieveLooksSettings(method794(i_63_ << -1019958930, 16711680), method794(-16777216, i_60_ << 554963798)))))));
                    }
                    i_53_ += i_44_;
                    i_52_ += i_44_;
                }
                int[] is_64_ = is_50_;
                is_50_ = is_49_;
                is_49_ = is_64_;
                i_43_ = i_48_;
                i_44_ = i_47_;
                i_47_ >>= 1;
                i_46_ >>= 1;
                i_45_++;
                i_48_ >>= 1;
            }
        }
    }

    Class112(ha_Sub3_Sub1 var_ha_Sub3_Sub1, int i, Class264 class264, Class228 class228, int i_65_, boolean bool) {
        ((Class112) this).aHa_Sub3_Sub1_5200 = var_ha_Sub3_Sub1;
        ((Class112) this).anInt5216 = i;
        aBoolean5201 = bool;
        ((Class112) this).aClass264_5224 = class264;
        ((Class112) this).aClass228_5221 = class228;
        anInt5223 = i_65_;
        OpenGL.glGenTextures(1, Class22.anIntArray320, 0);
        anInt5212 = Class22.anIntArray320[0];
        method792((byte) 58);
        method788(0, false);
    }
}
