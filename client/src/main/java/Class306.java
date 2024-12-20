/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class306 {
    private static Class246 aClass246_3550 = new Class246();

    private static final void method3213(Class246 class246) {
        ((Class246) class246).anInt2777 = 0;
        for (int i = 0; i < 256; i++) {
            if (((Class246) class246).aBooleanArray2765[i]) {
                ((Class246) class246).aByteArray2783[(((Class246) class246).anInt2777)] = (byte) i;
                ((Class246) class246).anInt2777++;
            }
        }
    }

    private static final void method3214(int[] is, int[] is_0_, int[] is_1_, byte[] is_2_, int i, int i_3_, int i_4_) {
        int i_5_ = 0;
        for (int i_6_ = i; i_6_ <= i_3_; i_6_++) {
            for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
                if (is_2_[i_7_] == i_6_) {
                    is_1_[i_5_] = i_7_;
                    i_5_++;
                }
            }
        }
        for (int i_8_ = 0; i_8_ < 23; i_8_++)
            is_0_[i_8_] = 0;
        for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
            is_0_[is_2_[i_9_] + 1]++;
        for (int i_10_ = 1; i_10_ < 23; i_10_++)
            is_0_[i_10_] += is_0_[i_10_ - 1];
        for (int i_11_ = 0; i_11_ < 23; i_11_++)
            is[i_11_] = 0;
        int i_12_ = 0;
        for (int i_13_ = i; i_13_ <= i_3_; i_13_++) {
            i_12_ += is_0_[i_13_ + 1] - is_0_[i_13_];
            is[i_13_] = i_12_ - 1;
            i_12_ <<= 1;
        }
        for (int i_14_ = i + 1; i_14_ <= i_3_; i_14_++)
            is_0_[i_14_] = (is[i_14_ - 1] + 1 << 1) - is_0_[i_14_];
    }

    private static final byte method3215(Class246 class246) {
        return (byte) method3219(8, class246);
    }

    private static final void method3216(Class246 class246) {
        boolean bool = false;
        boolean bool_15_ = false;
        boolean bool_16_ = false;
        boolean bool_17_ = false;
        boolean bool_18_ = false;
        boolean bool_19_ = false;
        boolean bool_20_ = false;
        boolean bool_21_ = false;
        boolean bool_22_ = false;
        boolean bool_23_ = false;
        boolean bool_24_ = false;
        boolean bool_25_ = false;
        boolean bool_26_ = false;
        boolean bool_27_ = false;
        boolean bool_28_ = false;
        boolean bool_29_ = false;
        boolean bool_30_ = false;
        boolean bool_31_ = false;
        int i = 0;
        int[] is = null;
        int[] is_32_ = null;
        int[] is_33_ = null;
        ((Class246) class246).anInt2770 = 1;
        if (Node_Sub14_Sub25.anIntArray9417 == null)
            Node_Sub14_Sub25.anIntArray9417 = new int[((Class246) class246).anInt2770 * 100000];
        boolean bool_34_ = true;
        while (bool_34_) {
            byte i_35_ = method3215(class246);
            if (i_35_ == 23)
                break;
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3215(class246);
            i_35_ = method3218(class246);
            ((Class246) class246).anInt2756 = 0;
            int i_36_ = method3215(class246);
            ((Class246) class246).anInt2756 = ((Class246) class246).anInt2756 << 8 | i_36_ & 0xff;
            i_36_ = method3215(class246);
            ((Class246) class246).anInt2756 = ((Class246) class246).anInt2756 << 8 | i_36_ & 0xff;
            i_36_ = method3215(class246);
            ((Class246) class246).anInt2756 = ((Class246) class246).anInt2756 << 8 | i_36_ & 0xff;
            for (int i_37_ = 0; i_37_ < 16; i_37_++) {
                i_35_ = method3218(class246);
                if (i_35_ == 1)
                    ((Class246) class246).aBooleanArray2776[i_37_] = true;
                else
                    ((Class246) class246).aBooleanArray2776[i_37_] = false;
            }
            for (int i_38_ = 0; i_38_ < 256; i_38_++)
                ((Class246) class246).aBooleanArray2765[i_38_] = false;
            for (int i_39_ = 0; i_39_ < 16; i_39_++) {
                if (((Class246) class246).aBooleanArray2776[i_39_]) {
                    for (int i_40_ = 0; i_40_ < 16; i_40_++) {
                        i_35_ = method3218(class246);
                        if (i_35_ == 1)
                            ((Class246) class246).aBooleanArray2765[(i_39_ * 16 + i_40_)] = true;
                    }
                }
            }
            method3213(class246);
            int i_41_ = ((Class246) class246).anInt2777 + 2;
            int i_42_ = method3219(3, class246);
            int i_43_ = method3219(15, class246);
            for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
                int i_45_ = 0;
                for (; ; ) {
                    i_35_ = method3218(class246);
                    if (i_35_ == 0)
                        break;
                    i_45_++;
                }
                ((Class246) class246).aByteArray2790[i_44_] = (byte) i_45_;
            }
            byte[] is_46_ = new byte[6];
            for (byte i_47_ = 0; i_47_ < i_42_; i_47_++)
                is_46_[i_47_] = i_47_;
            for (int i_48_ = 0; i_48_ < i_43_; i_48_++) {
                byte i_49_ = ((Class246) class246).aByteArray2790[i_48_];
                byte i_50_ = is_46_[i_49_];
                for (/**/; i_49_ > 0; i_49_--)
                    is_46_[i_49_] = is_46_[i_49_ - 1];
                is_46_[0] = i_50_;
                ((Class246) class246).aByteArray2782[i_48_] = i_50_;
            }
            for (int i_51_ = 0; i_51_ < i_42_; i_51_++) {
                int i_52_ = method3219(5, class246);
                for (int i_53_ = 0; i_53_ < i_41_; i_53_++) {
                    for (; ; ) {
                        i_35_ = method3218(class246);
                        if (i_35_ == 0)
                            break;
                        i_35_ = method3218(class246);
                        if (i_35_ == 0)
                            i_52_++;
                        else
                            i_52_--;
                    }
                    ((Class246) class246).aByteArrayArray2784[i_51_][i_53_] = (byte) i_52_;
                }
            }
            for (int i_54_ = 0; i_54_ < i_42_; i_54_++) {
                int i_55_ = 32;
                byte i_56_ = 0;
                for (int i_57_ = 0; i_57_ < i_41_; i_57_++) {
                    if (((Class246) class246).aByteArrayArray2784[i_54_][i_57_] > i_56_)
                        i_56_ = (((Class246) class246).aByteArrayArray2784[i_54_][i_57_]);
                    if (((Class246) class246).aByteArrayArray2784[i_54_][i_57_] < i_55_)
                        i_55_ = (((Class246) class246).aByteArrayArray2784[i_54_][i_57_]);
                }
                method3214(((Class246) class246).anIntArrayArray2761[i_54_], ((Class246) class246).anIntArrayArray2763[i_54_], ((Class246) class246).anIntArrayArray2764[i_54_], ((Class246) class246).aByteArrayArray2784[i_54_], i_55_, i_56_, i_41_);
                ((Class246) class246).anIntArray2788[i_54_] = i_55_;
            }
            int i_58_ = ((Class246) class246).anInt2777 + 1;
            int i_59_ = -1;
            int i_60_ = 0;
            for (int i_61_ = 0; i_61_ <= 255; i_61_++)
                ((Class246) class246).anIntArray2762[i_61_] = 0;
            int i_62_ = 4095;
            for (int i_63_ = 15; i_63_ >= 0; i_63_--) {
                for (int i_64_ = 15; i_64_ >= 0; i_64_--) {
                    ((Class246) class246).aByteArray2780[i_62_] = (byte) (i_63_ * 16 + i_64_);
                    i_62_--;
                }
                ((Class246) class246).anIntArray2771[i_63_] = i_62_ + 1;
            }
            int i_65_ = 0;
            if (i_60_ == 0) {
                i_59_++;
                i_60_ = 50;
                byte i_66_ = ((Class246) class246).aByteArray2782[i_59_];
                i = ((Class246) class246).anIntArray2788[i_66_];
                is = ((Class246) class246).anIntArrayArray2761[i_66_];
                is_33_ = ((Class246) class246).anIntArrayArray2764[i_66_];
                is_32_ = ((Class246) class246).anIntArrayArray2763[i_66_];
            }
            i_60_--;
            int i_67_ = i;
            int i_68_;
            int i_69_;
            for (i_69_ = method3219(i_67_, class246); i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
                i_67_++;
                i_68_ = method3218(class246);
            }
            int i_70_ = is_33_[i_69_ - is_32_[i_67_]];
            while (i_70_ != i_58_) {
                if (i_70_ == 0 || i_70_ == 1) {
                    int i_71_ = -1;
                    int i_72_ = 1;
                    do {
                        if (i_70_ == 0)
                            i_71_ += i_72_;
                        else if (i_70_ == 1)
                            i_71_ += 2 * i_72_;
                        i_72_ *= 2;
                        if (i_60_ == 0) {
                            i_59_++;
                            i_60_ = 50;
                            byte i_73_ = ((Class246) class246).aByteArray2782[i_59_];
                            i = ((Class246) class246).anIntArray2788[i_73_];
                            is = (((Class246) class246).anIntArrayArray2761[i_73_]);
                            is_33_ = (((Class246) class246).anIntArrayArray2764[i_73_]);
                            is_32_ = (((Class246) class246).anIntArrayArray2763[i_73_]);
                        }
                        i_60_--;
                        i_67_ = i;
                        for (i_69_ = method3219(i_67_, class246); i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
                            i_67_++;
                            i_68_ = method3218(class246);
                        }
                        i_70_ = is_33_[i_69_ - is_32_[i_67_]];
                    } while (i_70_ == 0 || i_70_ == 1);
                    i_71_++;
                    i_36_ = (((Class246) class246).aByteArray2783[((((Class246) class246).aByteArray2780[((Class246) class246).anIntArray2771[0]]) & 0xff)]);
                    ((Class246) class246).anIntArray2762[i_36_ & 0xff] += i_71_;
                    for (/**/; i_71_ > 0; i_71_--) {
                        Node_Sub14_Sub25.anIntArray9417[i_65_] = i_36_ & 0xff;
                        i_65_++;
                    }
                } else {
                    int i_74_ = i_70_ - 1;
                    if (i_74_ < 16) {
                        int i_75_ = ((Class246) class246).anIntArray2771[0];
                        i_35_ = (((Class246) class246).aByteArray2780[i_75_ + i_74_]);
                        for (/**/; i_74_ > 3; i_74_ -= 4) {
                            int i_76_ = i_75_ + i_74_;
                            ((Class246) class246).aByteArray2780[i_76_] = (((Class246) class246).aByteArray2780[i_76_ - 1]);
                            ((Class246) class246).aByteArray2780[i_76_ - 1] = (((Class246) class246).aByteArray2780[i_76_ - 2]);
                            ((Class246) class246).aByteArray2780[i_76_ - 2] = (((Class246) class246).aByteArray2780[i_76_ - 3]);
                            ((Class246) class246).aByteArray2780[i_76_ - 3] = (((Class246) class246).aByteArray2780[i_76_ - 4]);
                        }
                        for (/**/; i_74_ > 0; i_74_--)
                            ((Class246) class246).aByteArray2780[i_75_ + i_74_] = (((Class246) class246).aByteArray2780[i_75_ + i_74_ - 1]);
                        ((Class246) class246).aByteArray2780[i_75_] = i_35_;
                    } else {
                        int i_77_ = i_74_ / 16;
                        int i_78_ = i_74_ % 16;
                        int i_79_ = (((Class246) class246).anIntArray2771[i_77_] + i_78_);
                        i_35_ = ((Class246) class246).aByteArray2780[i_79_];
                        for (/**/; (i_79_ > ((Class246) class246).anIntArray2771[i_77_]); i_79_--)
                            ((Class246) class246).aByteArray2780[i_79_] = (((Class246) class246).aByteArray2780[i_79_ - 1]);
                        ((Class246) class246).anIntArray2771[i_77_]++;
                        for (/**/; i_77_ > 0; i_77_--) {
                            ((Class246) class246).anIntArray2771[i_77_]--;
                            ((Class246) class246).aByteArray2780[((Class246) class246).anIntArray2771[i_77_]] = (((Class246) class246).aByteArray2780[(((Class246) class246).anIntArray2771[i_77_ - 1]) + 16 - 1]);
                        }
                        ((Class246) class246).anIntArray2771[0]--;
                        ((Class246) class246).aByteArray2780[((Class246) class246).anIntArray2771[0]] = i_35_;
                        if (((Class246) class246).anIntArray2771[0] == 0) {
                            int i_80_ = 4095;
                            for (int i_81_ = 15; i_81_ >= 0; i_81_--) {
                                for (int i_82_ = 15; i_82_ >= 0; i_82_--) {
                                    ((Class246) class246).aByteArray2780[i_80_] = (((Class246) class246).aByteArray2780[(((Class246) class246).anIntArray2771[i_81_]) + i_82_]);
                                    i_80_--;
                                }
                                ((Class246) class246).anIntArray2771[i_81_] = i_80_ + 1;
                            }
                        }
                    }
                    ((Class246) class246).anIntArray2762[(((Class246) class246).aByteArray2783[i_35_ & 0xff] & 0xff)]++;
                    Node_Sub14_Sub25.anIntArray9417[i_65_] = (((Class246) class246).aByteArray2783[i_35_ & 0xff] & 0xff);
                    i_65_++;
                    if (i_60_ == 0) {
                        i_59_++;
                        i_60_ = 50;
                        byte i_83_ = ((Class246) class246).aByteArray2782[i_59_];
                        i = ((Class246) class246).anIntArray2788[i_83_];
                        is = ((Class246) class246).anIntArrayArray2761[i_83_];
                        is_33_ = ((Class246) class246).anIntArrayArray2764[i_83_];
                        is_32_ = ((Class246) class246).anIntArrayArray2763[i_83_];
                    }
                    i_60_--;
                    i_67_ = i;
                    for (i_69_ = method3219(i_67_, class246); i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
                        i_67_++;
                        i_68_ = method3218(class246);
                    }
                    i_70_ = is_33_[i_69_ - is_32_[i_67_]];
                }
            }
            ((Class246) class246).anInt2768 = 0;
            ((Class246) class246).aByte2758 = (byte) 0;
            ((Class246) class246).anIntArray2755[0] = 0;
            for (int i_84_ = 1; i_84_ <= 256; i_84_++)
                ((Class246) class246).anIntArray2755[i_84_] = ((Class246) class246).anIntArray2762[i_84_ - 1];
            for (int i_85_ = 1; i_85_ <= 256; i_85_++)
                ((Class246) class246).anIntArray2755[i_85_] += ((Class246) class246).anIntArray2755[i_85_ - 1];
            for (int i_86_ = 0; i_86_ < i_65_; i_86_++) {
                i_36_ = (byte) (Node_Sub14_Sub25.anIntArray9417[i_86_] & 0xff);
                Node_Sub14_Sub25.anIntArray9417[((Class246) class246).anIntArray2755[i_36_ & 0xff]] |= i_86_ << 8;
                ((Class246) class246).anIntArray2755[i_36_ & 0xff]++;
            }
            ((Class246) class246).anInt2759 = (Node_Sub14_Sub25.anIntArray9417[((Class246) class246).anInt2756]) >> 8;
            ((Class246) class246).anInt2781 = 0;
            ((Class246) class246).anInt2759 = (Node_Sub14_Sub25.anIntArray9417[((Class246) class246).anInt2759]);
            ((Class246) class246).anInt2774 = (byte) (((Class246) class246).anInt2759 & 0xff);
            ((Class246) class246).anInt2759 >>= 8;
            ((Class246) class246).anInt2781++;
            ((Class246) class246).anInt2767 = i_65_;
            method3217(class246);
            if ((((Class246) class246).anInt2781 == ((Class246) class246).anInt2767 + 1) && ((Class246) class246).anInt2768 == 0)
                bool_34_ = true;
            else
                bool_34_ = false;
        }
    }

    private static final void method3217(Class246 class246) {
        byte i = ((Class246) class246).aByte2758;
        int i_87_ = ((Class246) class246).anInt2768;
        int i_88_ = ((Class246) class246).anInt2781;
        int i_89_ = ((Class246) class246).anInt2774;
        int[] is = Node_Sub14_Sub25.anIntArray9417;
        int i_90_ = ((Class246) class246).anInt2759;
        byte[] is_91_ = ((Class246) class246).aByteArray2779;
        int i_92_ = ((Class246) class246).anInt2787;
        int i_93_ = ((Class246) class246).anInt2766;
        int i_94_ = i_93_;
        int i_95_ = ((Class246) class246).anInt2767 + 1;
        while_192_:
        for (; ; ) {
            if (i_87_ > 0) {
                for (; ; ) {
                    if (i_93_ == 0)
                        break while_192_;
                    if (i_87_ == 1)
                        break;
                    is_91_[i_92_] = i;
                    i_87_--;
                    i_92_++;
                    i_93_--;
                }
                if (i_93_ == 0) {
                    i_87_ = 1;
                    break;
                }
                is_91_[i_92_] = i;
                i_92_++;
                i_93_--;
            }
            for (; ; ) {
                if (i_88_ == i_95_) {
                    i_87_ = 0;
                    break while_192_;
                }
                i = (byte) i_89_;
                i_90_ = is[i_90_];
                int i_96_ = (byte) i_90_;
                i_90_ >>= 8;
                i_88_++;
                if (i_96_ != i_89_) {
                    i_89_ = i_96_;
                    if (i_93_ == 0) {
                        i_87_ = 1;
                        break while_192_;
                    }
                    is_91_[i_92_] = i;
                    i_92_++;
                    i_93_--;
                } else {
                    if (i_88_ != i_95_)
                        break;
                    if (i_93_ == 0) {
                        i_87_ = 1;
                        break while_192_;
                    }
                    is_91_[i_92_] = i;
                    i_92_++;
                    i_93_--;
                }
            }
            i_87_ = 2;
            i_90_ = is[i_90_];
            int i_97_ = (byte) i_90_;
            i_90_ >>= 8;
            if (++i_88_ != i_95_) {
                if (i_97_ != i_89_)
                    i_89_ = i_97_;
                else {
                    i_87_ = 3;
                    i_90_ = is[i_90_];
                    i_97_ = (byte) i_90_;
                    i_90_ >>= 8;
                    if (++i_88_ != i_95_) {
                        if (i_97_ != i_89_)
                            i_89_ = i_97_;
                        else {
                            i_90_ = is[i_90_];
                            i_97_ = (byte) i_90_;
                            i_90_ >>= 8;
                            i_88_++;
                            i_87_ = (i_97_ & 0xff) + 4;
                            i_90_ = is[i_90_];
                            i_89_ = (byte) i_90_;
                            i_90_ >>= 8;
                            i_88_++;
                        }
                    }
                }
            }
        }
        int i_98_ = ((Class246) class246).anInt2772;
        ((Class246) class246).anInt2772 += i_94_ - i_93_;
        ((Class246) class246).aByte2758 = i;
        ((Class246) class246).anInt2768 = i_87_;
        ((Class246) class246).anInt2781 = i_88_;
        ((Class246) class246).anInt2774 = i_89_;
        Node_Sub14_Sub25.anIntArray9417 = is;
        ((Class246) class246).anInt2759 = i_90_;
        ((Class246) class246).aByteArray2779 = is_91_;
        ((Class246) class246).anInt2787 = i_92_;
        ((Class246) class246).anInt2766 = i_93_;
    }

    private static final byte method3218(Class246 class246) {
        return (byte) method3219(1, class246);
    }

    private static final int method3219(int i, Class246 class246) {
        for (; ; ) {
            if (((Class246) class246).anInt2769 >= i) {
                int i_99_ = ((((Class246) class246).anInt2785 >> ((Class246) class246).anInt2769 - i) & (1 << i) - 1);
                ((Class246) class246).anInt2769 -= i;
                return i_99_;
            }
            ((Class246) class246).anInt2785 = (((Class246) class246).anInt2785 << 8 | (((Class246) class246).aByteArray2789[((Class246) class246).anInt2760]) & 0xff);
            ((Class246) class246).anInt2769 += 8;
            ((Class246) class246).anInt2760++;
            ((Class246) class246).anInt2786++;
        }
    }

    public static void method3220() {
        aClass246_3550 = null;
    }

    static final int method3221(byte[] is, int i, byte[] is_100_, int i_101_, int i_102_) {
        synchronized (aClass246_3550) {
            ((Class246) aClass246_3550).aByteArray2789 = is_100_;
            ((Class246) aClass246_3550).anInt2760 = i_102_;
            ((Class246) aClass246_3550).aByteArray2779 = is;
            ((Class246) aClass246_3550).anInt2787 = 0;
            ((Class246) aClass246_3550).anInt2766 = i;
            ((Class246) aClass246_3550).anInt2769 = 0;
            ((Class246) aClass246_3550).anInt2785 = 0;
            ((Class246) aClass246_3550).anInt2786 = 0;
            ((Class246) aClass246_3550).anInt2772 = 0;
            method3216(aClass246_3550);
            i -= ((Class246) aClass246_3550).anInt2766;
            ((Class246) aClass246_3550).aByteArray2789 = null;
            ((Class246) aClass246_3550).aByteArray2779 = null;
            return i;
        }
    }
}
