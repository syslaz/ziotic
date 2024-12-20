/* Class346_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub10 extends Class346 {
    static float aFloat8348;
    static int anInt8349;
    static int anInt8350;
    static int anInt8351 = 0;
    boolean aBoolean8352;
    Class346_Sub9[] aClass346_Sub9Array8353;
    static int anInt8354;
    Interactable aInteractable_8355;
    static int anInt8356;
    static int anInt8357;

    final boolean method3719(int i, int i_0_, ha var_ha, int i_1_) {
        anInt8356++;
        int i_2_ = ((Class346_Sub10) this).aInteractable_8355.method3570(-2);
        if (((Class346_Sub10) this).aClass346_Sub9Array8353 != null) {
            for (int i_3_ = 0; ((((Class346_Sub10) this).aClass346_Sub9Array8353.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
                ((Class346_Sub9) (((Class346_Sub10) this).aClass346_Sub9Array8353[i_3_])).anInt8344 <<= i_2_;
                if (((Class346_Sub10) this).aClass346_Sub9Array8353[i_3_].method3718(i_0_, i_1_) && ((Class346_Sub10) this).aInteractable_8355.method3579(var_ha, i_1_, i_0_, (byte) 103)) {
                    ((Class346_Sub9) (((Class346_Sub10) this).aClass346_Sub9Array8353[i_3_])).anInt8344 >>= i_2_;
                    return true;
                }
                ((Class346_Sub9) (((Class346_Sub10) this).aClass346_Sub9Array8353[i_3_])).anInt8344 >>= i_2_;
            }
        }
        if (i > 0)
            method3720(-105, -59, false, -26, null, -4);
        return false;
    }

    static final boolean method3720(int i, int i_4_, boolean bool, int i_5_, Class137[][][] class137s, int i_6_) {
        anInt8349++;
        byte i_7_ = !bool ? (byte) (0xff & Class54.anInt727) : (byte) 1;
        if (Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_5_][i_4_] == i_7_)
            return false;
        if ((r.aByteArrayArrayArray9033[Class177.anInt2074][i_5_][i_4_] & 0x4) == 0)
            return false;
        int i_8_ = 0;
        int i_9_ = i_6_;
        Class8.anIntArray181[i_8_] = i_5_;
        Node_Sub14_Sub21.anIntArray9381[i_8_++] = i_4_;
        Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_5_][i_4_] = i_7_;
        while (i_9_ != i_8_) {
            int i_10_ = 0xffff & Class8.anIntArray181[i_9_];
            int i_11_ = 0xff & Class8.anIntArray181[i_9_] >> -2059875600;
            int i_12_ = Class8.anIntArray181[i_9_] >> 1555027192 & 0xff;
            int i_13_ = Node_Sub14_Sub21.anIntArray9381[i_9_] & 0xffff;
            int i_14_ = (Node_Sub14_Sub21.anIntArray9381[i_9_] >> 1733867088 & 0xff);
            i_9_ = 1 + i_9_ & 0xfff;
            boolean bool_15_ = false;
            if (((r.aByteArrayArrayArray9033[Class177.anInt2074][i_10_][i_13_] & 0x4) ^ 0xffffffff) == -1)
                bool_15_ = true;
            boolean bool_16_ = false;
            if (class137s != null) {
                int i_17_ = Class177.anInt2074 - -1;
                while_237_:
                for (/**/; i_17_ <= 3; i_17_++) {
                    if (class137s[i_17_] != null && (r.aByteArrayArrayArray9033[i_17_][i_10_][i_13_] & 0x8) == 0) {
                        if (bool_15_ && class137s[i_17_][i_10_][i_13_] != null) {
                            if ((((Class137) class137s[i_17_][i_10_][i_13_]).aClass346_Sub7_Sub5_1636) != null) {
                                int i_18_ = Class152.method1357(i_6_ ^ ~0x67, i_11_);
                                if (((i_18_ ^ 0xffffffff) == ((((Class346_Sub7_Sub5) (((Class137) class137s[i_17_][i_10_][i_13_]).aClass346_Sub7_Sub5_1636)).aShort9955) ^ 0xffffffff)) || ((((Class137) class137s[i_17_][i_10_][i_13_]).aClass346_Sub7_Sub5_1646) != null && (((((Class346_Sub7_Sub5) (((Class137) (class137s[i_17_][i_10_][i_13_])).aClass346_Sub7_Sub5_1646)).aShort9955) ^ 0xffffffff) == (i_18_ ^ 0xffffffff))))
                                    continue;
                                if (i_12_ != 0) {
                                    int i_19_ = Class152.method1357(i_6_ + -114, i_12_);
                                    if (i_19_ == (((Class346_Sub7_Sub5) (((Class137) (class137s[i_17_][i_10_][i_13_])).aClass346_Sub7_Sub5_1636)).aShort9955) || ((((Class137) class137s[i_17_][i_10_][i_13_]).aClass346_Sub7_Sub5_1646) != null && ((i_19_ ^ 0xffffffff) == ((((Class346_Sub7_Sub5) (((Class137) (class137s[i_17_][i_10_][i_13_])).aClass346_Sub7_Sub5_1646)).aShort9955) ^ 0xffffffff))))
                                        continue;
                                }
                                if ((i_14_ ^ 0xffffffff) != -1) {
                                    int i_20_ = Class152.method1357(-105, i_14_);
                                    if ((((Class346_Sub7_Sub5) (((Class137) class137s[i_17_][i_10_][i_13_]).aClass346_Sub7_Sub5_1636)).aShort9955) == i_20_ || ((((Class137) class137s[i_17_][i_10_][i_13_]).aClass346_Sub7_Sub5_1646) != null && (((((Class346_Sub7_Sub5) (((Class137) (class137s[i_17_][i_10_][i_13_])).aClass346_Sub7_Sub5_1646)).aShort9955) ^ 0xffffffff) == (i_20_ ^ 0xffffffff))))
                                        continue;
                                }
                            }
                            Class137 class137 = class137s[i_17_][i_10_][i_13_];
                            if (((Class137) class137).aClass49_1649 != null) {
                                for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                                    Animable animable = (((Class49) class49).aAnimable_656);
                                    if (animable instanceof Interface16) {
                                        Interface16 interface16 = (Interface16) animable;
                                        int i_21_ = interface16.method46((byte) 47);
                                        if ((i_21_ ^ 0xffffffff) == -22)
                                            i_21_ = 19;
                                        int i_22_ = interface16.method43((byte) -111);
                                        int i_23_ = i_22_ << 684699078 | i_21_;
                                        if (i_11_ == i_23_ || (i_12_ != 0 && ((i_23_ ^ 0xffffffff) == (i_12_ ^ 0xffffffff))) || i_14_ != 0 && i_14_ == i_23_)
                                            continue while_237_;
                                    }
                                }
                            }
                        }
                        Class137 class137 = class137s[i_17_][i_10_][i_13_];
                        if (class137 != null && ((Class137) class137).aClass49_1649 != null) {
                            for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                                Animable animable = (((Class49) class49).aAnimable_656);
                                if (((((Animable) animable).x1 ^ 0xffffffff) != (((Animable) animable).x2 ^ 0xffffffff)) || ((((Animable) animable).y2 ^ 0xffffffff) != (((Animable) animable).y1 ^ 0xffffffff))) {
                                    for (int i_24_ = (((Animable) animable).x1); ((i_24_ ^ 0xffffffff) >= (((Animable) animable).x2 ^ 0xffffffff)); i_24_++) {
                                        for (int i_25_ = (((Animable) animable).y1); (((Animable) animable).y2 >= i_25_); i_25_++)
                                            Class283.aByteArrayArrayArray3338[i_17_][i_24_][i_25_] = i_7_;
                                    }
                                }
                            }
                        }
                        bool_16_ = true;
                        Class283.aByteArrayArrayArray3338[i_17_][i_10_][i_13_] = i_7_;
                    }
                }
            }
            if (bool_16_) {
                int i_26_ = Class177.aSArray2070[Class177.anInt2074 - -1].method3145(i_10_, 116, i_13_);
                if (Class208.anIntArray2403[i] < i_26_)
                    Class208.anIntArray2403[i] = i_26_;
                int i_27_ = i_10_ << -384511127;
                if ((Class114.anIntArray1426[i] ^ 0xffffffff) < (i_27_ ^ 0xffffffff))
                    Class114.anIntArray1426[i] = i_27_;
                else if (Class340_Sub7.anIntArray8163[i] < i_27_)
                    Class340_Sub7.anIntArray8163[i] = i_27_;
                int i_28_ = i_13_ << 2020527785;
                if (i_28_ < Class346_Sub7_Sub3_Sub1.anIntArray10513[i])
                    Class346_Sub7_Sub3_Sub1.anIntArray10513[i] = i_28_;
                else if ((s_Sub3.anIntArray8013[i] ^ 0xffffffff) > (i_28_ ^ 0xffffffff))
                    s_Sub3.anIntArray8013[i] = i_28_;
            }
            if (!bool_15_) {
                if ((i_10_ ^ 0xffffffff) <= -2 && ((i_7_ ^ 0xffffffff) != ((Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ - 1][i_13_]) ^ 0xffffffff))) {
                    Class8.anIntArray181[i_8_] = Class358.retrieveLooksSettings(Class358.retrieveLooksSettings(i_10_ + -1, 1179648), -754974720);
                    Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(1245184, i_13_);
                    Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ - 1][i_13_] = i_7_;
                    i_8_ = 1 + i_8_ & 0xfff;
                }
                if (Node_Sub22.anInt7074 > ++i_13_) {
                    if ((i_10_ - 1 ^ 0xffffffff) <= -1 && ((i_7_ ^ 0xffffffff) != ((Class283.aByteArrayArrayArray3338[Class177.anInt2074][-1 + i_10_][i_13_]) ^ 0xffffffff)) && ((r.aByteArrayArrayArray9033[Class177.anInt2074][i_10_][i_13_]) & 0x4) == 0 && (0x4 & (r.aByteArrayArrayArray9033[Class177.anInt2074][-1 + i_10_][i_13_ + -1])) == 0) {
                        Class8.anIntArray181[i_8_] = (Class358.retrieveLooksSettings(Class358.retrieveLooksSettings(1179648, -1 + i_10_), 1375731712));
                        Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(i_13_, 1245184);
                        i_8_ = 0xfff & 1 + i_8_;
                        Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ - 1][i_13_] = i_7_;
                    }
                    if (i_7_ != (Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_][i_13_])) {
                        Class8.anIntArray181[i_8_] = Class358.retrieveLooksSettings(Class358.retrieveLooksSettings(i_10_, 5373952), 318767104);
                        Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(5439488, i_13_);
                        Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_][i_13_] = i_7_;
                        i_8_ = i_8_ - -1 & 0xfff;
                    }
                    if (((Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (1 + i_10_ ^ 0xffffffff)) && ((i_7_ ^ 0xffffffff) != ((Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ + 1][i_13_]) ^ 0xffffffff)) && ((r.aByteArrayArrayArray9033[Class177.anInt2074][i_10_][i_13_]) & 0x4 ^ 0xffffffff) == -1 && (0x4 & (r.aByteArrayArrayArray9033[Class177.anInt2074][1 + i_10_][i_13_ - 1]) ^ 0xffffffff) == -1) {
                        Class8.anIntArray181[i_8_] = (Class358.retrieveLooksSettings(Class358.retrieveLooksSettings(1 + i_10_, 5373952), -1845493760));
                        Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(i_13_, 5439488);
                        i_8_ = 0xfff & 1 + i_8_;
                        Class283.aByteArrayArrayArray3338[Class177.anInt2074][1 + i_10_][i_13_] = i_7_;
                    }
                }
                i_13_--;
                if (Node_Sub8_Sub4.anInt8360 > i_10_ + 1 && i_7_ != (Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ - -1][i_13_])) {
                    Class8.anIntArray181[i_8_] = Class358.retrieveLooksSettings(1392508928, Class358.retrieveLooksSettings(9568256, i_10_ - -1));
                    Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(9633792, i_13_);
                    Class283.aByteArrayArrayArray3338[Class177.anInt2074][1 + i_10_][i_13_] = i_7_;
                    i_8_ = i_8_ - -1 & 0xfff;
                }
                if ((--i_13_ ^ 0xffffffff) <= -1) {
                    if ((-1 + i_10_ ^ 0xffffffff) <= -1 && ((Class283.aByteArrayArrayArray3338[Class177.anInt2074][-1 + i_10_][i_13_]) ^ 0xffffffff) != (i_7_ ^ 0xffffffff) && ((r.aByteArrayArrayArray9033[Class177.anInt2074][i_10_][i_13_]) & 0x4 ^ 0xffffffff) == -1 && (0x4 & (r.aByteArrayArrayArray9033[Class177.anInt2074][i_10_ + -1][i_13_ - -1])) == 0) {
                        Class8.anIntArray181[i_8_] = Class358.retrieveLooksSettings(Class358.retrieveLooksSettings(13762560, (i_10_ + -1)), 301989888);
                        Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(13828096, i_13_);
                        i_8_ = 0xfff & i_8_ - -1;
                        Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ + -1][i_13_] = i_7_;
                    }
                    if (i_7_ != (Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_][i_13_])) {
                        Class8.anIntArray181[i_8_] = (Class358.retrieveLooksSettings(-1828716544, Class358.retrieveLooksSettings(i_10_, 13762560)));
                        Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(13828096, i_13_);
                        Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_][i_13_] = i_7_;
                        i_8_ = 0xfff & 1 + i_8_;
                    }
                    if (Node_Sub8_Sub4.anInt8360 > 1 + i_10_ && ((i_7_ ^ 0xffffffff) != ((Class283.aByteArrayArrayArray3338[Class177.anInt2074][i_10_ + 1][i_13_]) ^ 0xffffffff)) && ((r.aByteArrayArrayArray9033[Class177.anInt2074][i_10_][i_13_]) & 0x4) == 0 && ((r.aByteArrayArrayArray9033[Class177.anInt2074][1 + i_10_][i_13_ + 1]) & 0x4 ^ 0xffffffff) == -1) {
                        Class8.anIntArray181[i_8_] = (Class358.retrieveLooksSettings(-771751936, Class358.retrieveLooksSettings(i_10_ - -1, 9568256)));
                        Node_Sub14_Sub21.anIntArray9381[i_8_] = Class358.retrieveLooksSettings(9633792, i_13_);
                        Class283.aByteArrayArrayArray3338[Class177.anInt2074][1 + i_10_][i_13_] = i_7_;
                        i_8_ = i_8_ + 1 & 0xfff;
                    }
                }
            }
        }
        if ((Class208.anIntArray2403[i] ^ 0xffffffff) != 999999) {
            Class208.anIntArray2403[i] += 40;
            Class114.anIntArray1426[i] -= 512;
            Class340_Sub7.anIntArray8163[i] += 512;
            s_Sub3.anIntArray8013[i] += 512;
            Class346_Sub7_Sub3_Sub1.anIntArray10513[i] -= 512;
        }
        return true;
    }

    static final aa_Sub2 method3721(ha_Sub2 var_ha_Sub2, int[] is, int i, int i_29_, int[] is_30_, int i_31_) {
        anInt8350++;
        byte[] is_32_ = new byte[i_29_ * i];
        int i_33_ = 0;
        if (i_31_ != 1179648)
            aFloat8348 = 0.6478928F;
        for (/**/; i_29_ > i_33_; i_33_++) {
            int i_34_ = i_33_ * i + is_30_[i_33_];
            for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (is[i_33_] ^ 0xffffffff); i_35_++)
                is_32_[i_34_++] = (byte) -1;
        }
        return new aa_Sub2(var_ha_Sub2, i, i_29_, is_32_);
    }

    static final int method3722(int i, int i_36_) {
        if (Class340_Sub8.anIntArrayArray8187 != null)
            return Class340_Sub8.anIntArrayArray8187[i][i_36_] & 0xffffff;
        return 0;
    }
}
