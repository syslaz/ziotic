/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class51 {
    private int anInt674;
    static int anInt675;
    static int anInt676;
    static int anInt677;
    static int anInt678;
    private short[] aShortArray679;
    private int anInt680;
    int anInt681;
    boolean aBoolean682;
    private int anInt683;
    private int anInt684;
    private int anInt685;
    static int anInt686;
    private short[] aShortArray687;
    static int anInt688;
    byte aByte689;
    int anInt690 = -1;
    static Class171 aClass171_691 = new Class171();
    static int anInt692;
    private int anInt693;
    static int anInt694;
    static int anInt695;
    private short[] aShortArray696;
    Class151 aClass151_697;
    static IncommingOpcode currentIncommingOpcode = null;
    private int anInt699;
    private short[] aShortArray700;

    static final int method401(int i, boolean bool, int i_0_, int i_1_) {
        anInt675++;
        if (bool != false)
            return -61;
        if ((i ^ 0xffffffff) >= -244) {
            if ((i ^ 0xffffffff) < -218)
                i_1_ >>= 3;
            else if ((i ^ 0xffffffff) >= -193) {
                if (i > 179)
                    i_1_ >>= 1;
            } else
                i_1_ >>= 2;
        } else
            i_1_ >>= 4;
        return ((i_1_ >> 1585784933 << -706060089) + ((i_0_ >> 225637154 & 0x3f) << -764838870) - -(i >> -2145795903));
    }

    static final byte[][][] method402(int i, int i_2_) {
        anInt678++;
        byte[][][] is = new byte[8][4][];
        int i_3_ = i_2_;
        int i_4_ = i_2_;
        byte[] is_5_ = new byte[i_4_ * i_3_];
        int i_6_ = 0;
        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_7_++) {
            for (int i_8_ = 0; (i_3_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
                if (i_8_ <= i_7_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[0][0] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_9_ = i_4_ + -1; (i_9_ ^ 0xffffffff) <= -1; i_9_--) {
            for (int i_10_ = 0; (i_4_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
                if (i_9_ >= i_10_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[0][1] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_4_ * i_3_];
        for (int i_11_ = 0; i_4_ > i_11_; i_11_++) {
            for (int i_12_ = 0; (i_3_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
                if ((i_12_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[0][2] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_13_ = -1 + i_4_; (i_13_ ^ 0xffffffff) <= -1; i_13_--) {
            for (int i_14_ = 0; i_3_ > i_14_; i_14_++) {
                if (i_13_ <= i_14_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[0][3] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_4_ * i_3_];
        for (int i_15_ = i_4_ + -1; i_15_ >= 0; i_15_--) {
            for (int i_16_ = 0; (i_3_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
                if ((i_16_ ^ 0xffffffff) >= (i_15_ >> 1034531873 ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[1][0] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_17_++) {
            for (int i_18_ = 0; i_3_ > i_18_; i_18_++) {
                if (i_6_ < 0 || (i_6_ ^ 0xffffffff) <= (is_5_.length ^ 0xffffffff))
                    i_6_++;
                else {
                    if (i_17_ << -1803345471 <= i_18_)
                        is_5_[i_6_] = (byte) -1;
                    i_6_++;
                }
            }
        }
        is[1][1] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_4_ * i_3_];
        for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_19_++) {
            for (int i_20_ = -1 + i_3_; i_20_ >= 0; i_20_--) {
                if (i_20_ <= i_19_ >> -1965752671)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[1][2] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_21_ = i_4_ - 1; i_21_ >= 0; i_21_--) {
            for (int i_22_ = i_3_ + -1; (i_22_ ^ 0xffffffff) <= -1; i_22_--) {
                if (i_21_ << -1054000639 <= i_22_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[1][3] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_4_ * i_3_];
        for (int i_23_ = i_4_ + -1; (i_23_ ^ 0xffffffff) <= -1; i_23_--) {
            for (int i_24_ = -1 + i_3_; (i_24_ ^ 0xffffffff) <= -1; i_24_--) {
                if (i_24_ <= i_23_ >> 24411265)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[2][0] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_25_ = i_4_ - 1; i_25_ >= 0; i_25_--) {
            for (int i_26_ = 0; i_3_ > i_26_; i_26_++) {
                if (i_25_ << 1874746753 <= i_26_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[2][1] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_27_ = 0; (i_4_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
            for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_28_++) {
                if ((i_27_ >> -673795743 ^ 0xffffffff) <= (i_28_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[2][2] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_29_++) {
            for (int i_30_ = -1 + i_3_; (i_30_ ^ 0xffffffff) <= -1; i_30_--) {
                if (i_29_ << 136958113 <= i_30_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[2][3] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_31_ = i_4_ + -1; (i_31_ ^ 0xffffffff) <= -1; i_31_--) {
            for (int i_32_ = 0; (i_3_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
                if (i_32_ >= i_31_ >> 1564769)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[3][0] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_4_ * i_3_];
        for (int i_33_ = 0; (i_4_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff); i_33_++) {
            for (int i_34_ = 0; (i_3_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
                if ((i_33_ << -1668927839 ^ 0xffffffff) <= (i_34_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[3][1] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_35_ = 0; (i_4_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
            for (int i_36_ = -1 + i_3_; i_36_ >= 0; i_36_--) {
                if (i_36_ >= i_35_ >> -1107120319)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[3][2] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_37_ = -1 + i_4_; (i_37_ ^ 0xffffffff) <= -1; i_37_--) {
            for (int i_38_ = i_3_ - 1; i_38_ >= 0; i_38_--) {
                if ((i_37_ << -1469600287 ^ 0xffffffff) <= (i_38_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[3][3] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_39_ = i_4_ - 1; (i_39_ ^ 0xffffffff) <= -1; i_39_--) {
            for (int i_40_ = -1 + i_3_; i_40_ >= 0; i_40_--) {
                if ((i_40_ ^ 0xffffffff) <= (i_39_ >> -22066303 ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[4][0] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_41_ = i_4_ - 1; i_41_ >= 0; i_41_--) {
            for (int i_42_ = 0; i_3_ > i_42_; i_42_++) {
                if ((i_41_ << -1939342719 ^ 0xffffffff) <= (i_42_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[4][1] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_43_ = 0; i_43_ < i_4_; i_43_++) {
            for (int i_44_ = 0; (i_3_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
                if (i_43_ >> 341645793 <= i_44_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[4][2] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_45_++) {
            for (int i_46_ = i_3_ + -1; (i_46_ ^ 0xffffffff) <= -1; i_46_--) {
                if ((i_46_ ^ 0xffffffff) >= (i_45_ << -312089663 ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[4][3] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_47_++) {
            for (int i_48_ = 0; i_3_ > i_48_; i_48_++) {
                if (i_3_ / 2 >= i_48_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[5][0] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_4_ * i_3_];
        for (int i_49_ = 0; (i_4_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
            for (int i_50_ = 0; i_3_ > i_50_; i_50_++) {
                if ((i_4_ / 2 ^ 0xffffffff) <= (i_49_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[5][1] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_51_ = 0; i_51_ < i_4_; i_51_++) {
            for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_52_++) {
                if (i_3_ / 2 <= i_52_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[5][2] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_53_ = 0; i_53_ < i_4_; i_53_++) {
            for (int i_54_ = 0; i_54_ < i_3_; i_54_++) {
                if ((i_53_ ^ 0xffffffff) <= (i_4_ / 2 ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[5][3] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_55_ = 0; (i_4_ ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++) {
            for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_56_++) {
                if (-(i_4_ / 2) + i_55_ >= i_56_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[6][0] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_57_ = -1 + i_4_; i_57_ >= 0; i_57_--) {
            for (int i_58_ = 0; (i_3_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
                if ((i_57_ - i_4_ / 2 ^ 0xffffffff) <= (i_58_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[6][1] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_59_ = i_4_ + -1; i_59_ >= 0; i_59_--) {
            for (int i_60_ = i_3_ + -1; (i_60_ ^ 0xffffffff) <= -1; i_60_--) {
                if (i_60_ <= -(i_4_ / 2) + i_59_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[6][2] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_61_ = 0; i_61_ < i_4_; i_61_++) {
            for (int i_62_ = -1 + i_3_; (i_62_ ^ 0xffffffff) <= -1; i_62_--) {
                if (i_61_ - i_4_ / 2 >= i_62_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[6][3] = is_5_;
        is_5_ = new byte[i_3_ * i_4_];
        i_6_ = 0;
        for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_63_++) {
            for (int i_64_ = 0; i_64_ < i_3_; i_64_++) {
                if (i_63_ - i_4_ / 2 <= i_64_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[7][0] = is_5_;
        i_6_ = i;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_65_ = -1 + i_4_; i_65_ >= 0; i_65_--) {
            for (int i_66_ = 0; (i_3_ ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
                if (-(i_4_ / 2) + i_65_ <= i_66_)
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[7][1] = is_5_;
        i_6_ = 0;
        is_5_ = new byte[i_3_ * i_4_];
        for (int i_67_ = -1 + i_4_; (i_67_ ^ 0xffffffff) <= -1; i_67_--) {
            for (int i_68_ = i_3_ + -1; i_68_ >= 0; i_68_--) {
                if ((i_67_ + -(i_4_ / 2) ^ 0xffffffff) >= (i_68_ ^ 0xffffffff))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[7][2] = is_5_;
        is_5_ = new byte[i_4_ * i_3_];
        i_6_ = 0;
        for (int i_69_ = 0; i_69_ < i_4_; i_69_++) {
            for (int i_70_ = i_3_ + -1; i_70_ >= 0; i_70_--) {
                if (i_70_ >= i_69_ + -(i_4_ / 2))
                    is_5_[i_6_] = (byte) -1;
                i_6_++;
            }
        }
        is[7][3] = is_5_;
        return is;
    }

    final Class162 method403(int i, ha var_ha, int i_71_, int i_72_, Class356 class356, byte i_73_, byte i_74_, int i_75_) {
        anInt676++;
        if (i_74_ > -19)
            ((Class51) this).aByte689 = (byte) -4;
        return method404(var_ha, 0, 0, i, false, i_71_, (byte) -117, i_72_, 0, class356, null, i_73_, null, i_75_);
    }

    private final Class162 method404(ha var_ha, int i, int i_76_, int i_77_, boolean bool, int i_78_, byte i_79_, int i_80_, int i_81_, Class356 class356, s var_s, byte i_82_, s var_s_83_, int i_84_) {
        anInt688++;
        int i_85_ = -122 / ((59 - i_79_) / 60);
        int i_86_ = i_84_;
        Class182 class182 = (((((Class51) this).anInt690 ^ 0xffffffff) != 0 && (i_77_ ^ 0xffffffff) != 0) ? class356.method3790((byte) -90, ((Class51) this).anInt690) : null);
        bool = bool & ((Class51) this).aByte689 != 0;
        if (class182 != null)
            i_86_ |= class182.method1610((byte) -51, false, i_77_, i_78_);
        if (bool)
            i_86_ = i_86_ | ((((Class51) this).aByte689 ^ 0xffffffff) != -4 ? 2 : 7);
        if (anInt685 != 128)
            i_86_ |= 0x2;
        if (anInt693 != 128 || (anInt684 ^ 0xffffffff) != -1)
            i_86_ |= 0x5;
        Class162 class162;
        synchronized (((Class151) ((Class51) this).aClass151_697).aClass278_1801) {
            class162 = (Class162) (((Class151) ((Class51) this).aClass151_697).aClass278_1801.method2863(4, (long) (((Class51) this).anInt681 |= (((ha) var_ha).anInt1418 << 1340119229))));
        }
        if (class162 == null || var_ha.b(class162.ua(), i_86_) != 0) {
            if (class162 != null)
                i_86_ = var_ha.c(i_86_, class162.ua());
            int i_87_ = i_86_;
            if (aShortArray679 != null)
                i_87_ |= 0x4000;
            if (aShortArray696 != null)
                i_87_ |= 0x8000;
            Class343 class343 = OutgoingOpcode.method1513(0, (((Class151) ((Class51) this).aClass151_697).aClass381_1798), -106, anInt680);
            if (class343 == null)
                return null;
            if (((Class343) class343).anInt4053 < 13)
                class343.method3497((byte) 1, 2);
            class162 = var_ha.a(class343, i_87_, (((Class151) ((Class51) this).aClass151_697).anInt1803), 64 + anInt699, anInt674 - -850);
            if (aShortArray679 != null) {
                for (int i_88_ = 0; aShortArray679.length > i_88_; i_88_++)
                    class162.ia(aShortArray679[i_88_], aShortArray687[i_88_]);
            }
            if (aShortArray696 != null) {
                for (int i_89_ = 0; aShortArray696.length > i_89_; i_89_++)
                    class162.aa(aShortArray696[i_89_], aShortArray700[i_89_]);
            }
            class162.s(i_86_);
            synchronized (((Class151) ((Class51) this).aClass151_697).aClass278_1801) {
                ((Class151) ((Class51) this).aClass151_697).aClass278_1801.method2867((byte) 0, (long) (((Class51) this).anInt681 |= ((ha) var_ha).anInt1418 << -1233753987), class162);
            }
        }
        Class162 class162_90_ = (class182 == null ? class162.method1436(i_82_, i_86_, true) : class182.method1612((byte) -107, i_80_, i_77_, 0, class162, i_86_, i_78_, i_82_));
        if (anInt693 != 128 || (anInt685 ^ 0xffffffff) != -129)
            class162_90_.O(anInt693, anInt685, anInt693);
        if (anInt684 != 0) {
            if ((anInt684 ^ 0xffffffff) == -91)
                class162_90_.a(4096);
            if ((anInt684 ^ 0xffffffff) == -181)
                class162_90_.a(8192);
            if (anInt684 == 270)
                class162_90_.a(12288);
        }
        if (bool)
            class162_90_.p(((Class51) this).aByte689, anInt683, var_s_83_, var_s, i_81_, i_76_, i);
        class162_90_.s(i_84_);
        return class162_90_;
    }

    final Class162 method405(int i, s var_s, int i_91_, Class356 class356, int i_92_, ha var_ha, s var_s_93_, int i_94_, int i_95_, int i_96_, int i_97_, boolean bool, boolean bool_98_) {
        if (bool_98_ != true)
            return null;
        anInt686++;
        return method404(var_ha, i, i_97_, i_92_, bool, i_94_, (byte) 127, i_95_, i_96_, class356, var_s, (byte) 2, var_s_93_, i_91_);
    }

    static final void method406(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_) {
        anInt694++;
        int i_106_ = Class49.method389(aa_Sub3.anInt5270, 86, Class181.anInt2099, i_102_);
        int i_107_ = Class49.method389(aa_Sub3.anInt5270, 90, Class181.anInt2099, i_101_);
        int i_108_ = Class49.method389(Class289.anInt3399, 110, Class302.anInt3500, i_105_);
        int i_109_ = Class49.method389(Class289.anInt3399, 121, Class302.anInt3500, i_100_);
        int i_110_ = Class49.method389(aa_Sub3.anInt5270, 55, Class181.anInt2099, i_103_ + i_102_);
        int i_111_ = Class49.method389(aa_Sub3.anInt5270, 15, Class181.anInt2099, -i_103_ + i_101_);
        int i_112_ = i_106_;
        if (i_104_ != -29036)
            currentIncommingOpcode = null;
        for (/**/; i_110_ > i_112_; i_112_++)
            Class149.method1331(i_99_, -121, i_108_, Class156.anIntArrayArray1867[i_112_], i_109_);
        for (int i_113_ = i_107_; i_111_ < i_113_; i_113_--)
            Class149.method1331(i_99_, -116, i_108_, Class156.anIntArrayArray1867[i_113_], i_109_);
        int i_114_ = Class49.method389(Class289.anInt3399, 14, Class302.anInt3500, i_103_ + i_105_);
        int i_115_ = Class49.method389(Class289.anInt3399, 113, Class302.anInt3500, -i_103_ + i_100_);
        for (int i_116_ = i_110_; (i_116_ ^ 0xffffffff) >= (i_111_ ^ 0xffffffff); i_116_++) {
            int[] is = Class156.anIntArrayArray1867[i_116_];
            Class149.method1331(i_99_, i_104_ + 28930, i_108_, is, i_114_);
            Class149.method1331(i, -74, i_114_, is, i_115_);
            Class149.method1331(i_99_, -50, i_115_, is, i_109_);
        }
    }

    public static void method407(int i) {
        aClass171_691 = null;
        if (i == 179)
            currentIncommingOpcode = null;
    }

    final void method408(int i, ByteStream class248_sub9) {
        for (; ; ) {
            int i_117_ = class248_sub9.readUnsignedByte((byte) -48);
            if (i_117_ == 0)
                break;
            method410((byte) 1, i_117_, class248_sub9);
        }
        anInt695++;
        if (i < 17)
            ((Class51) this).aBoolean682 = false;
    }

    final Class162 method409(ha var_ha, int i, int i_118_, int i_119_, int i_120_, Class356 class356, int i_121_) {
        if (i_118_ != 0)
            method410((byte) -68, 21, null);
        anInt677++;
        return method404(var_ha, 0, 0, i_120_, false, i_121_, (byte) -55, i_119_, 0, class356, null, (byte) 2, null, i);
    }

    private final void method410(byte i, int i_122_, ByteStream class248_sub9) {
        anInt692++;
        if ((i_122_ ^ 0xffffffff) != -2) {
            if ((i_122_ ^ 0xffffffff) == -3)
                ((Class51) this).anInt690 = class248_sub9.readShort(i ^ ~0x1);
            else if (i_122_ == 4)
                anInt693 = class248_sub9.readShort(-1);
            else if ((i_122_ ^ 0xffffffff) != -6) {
                if (i_122_ != 6) {
                    if (i_122_ == 7)
                        anInt699 = class248_sub9.readUnsignedByte((byte) 83);
                    else if (i_122_ != 8) {
                        if ((i_122_ ^ 0xffffffff) != -10) {
                            if (i_122_ != 10) {
                                if ((i_122_ ^ 0xffffffff) != -12) {
                                    if ((i_122_ ^ 0xffffffff) == -13)
                                        ((Class51) this).aByte689 = (byte) 4;
                                    else if (i_122_ == 13)
                                        ((Class51) this).aByte689 = (byte) 5;
                                    else if ((i_122_ ^ 0xffffffff) == -15) {
                                        ((Class51) this).aByte689 = (byte) 2;
                                        anInt683 = (256 * class248_sub9.readUnsignedByte((byte) 108));
                                    } else if (i_122_ != 15) {
                                        if ((i_122_ ^ 0xffffffff) == -17) {
                                            ((Class51) this).aByte689 = (byte) 3;
                                            anInt683 = class248_sub9.readInt(false);
                                        } else if (i_122_ == 40) {
                                            int i_123_ = class248_sub9.readUnsignedByte((byte) 71);
                                            aShortArray679 = new short[i_123_];
                                            aShortArray687 = new short[i_123_];
                                            for (int i_124_ = 0; ((i_123_ ^ 0xffffffff) < (i_124_ ^ 0xffffffff)); i_124_++) {
                                                aShortArray679[i_124_] = (short) (class248_sub9.readShort(-1));
                                                aShortArray687[i_124_] = (short) (class248_sub9.readShort(-1));
                                            }
                                        } else if ((i_122_ ^ 0xffffffff) == -42) {
                                            int i_125_ = class248_sub9.readUnsignedByte((byte) -29);
                                            aShortArray700 = new short[i_125_];
                                            aShortArray696 = new short[i_125_];
                                            for (int i_126_ = 0; i_126_ < i_125_; i_126_++) {
                                                aShortArray696[i_126_] = (short) (class248_sub9.readShort(-1));
                                                aShortArray700[i_126_] = (short) (class248_sub9.readShort(-1));
                                            }
                                        }
                                    } else {
                                        ((Class51) this).aByte689 = (byte) 3;
                                        anInt683 = class248_sub9.readShort(-1);
                                    }
                                } else
                                    ((Class51) this).aByte689 = (byte) 1;
                            } else
                                ((Class51) this).aBoolean682 = true;
                        } else {
                            ((Class51) this).aByte689 = (byte) 3;
                            anInt683 = 8224;
                        }
                    } else
                        anInt674 = class248_sub9.readUnsignedByte((byte) 109);
                } else
                    anInt684 = class248_sub9.readShort(-1);
            } else
                anInt685 = class248_sub9.readShort(-1);
        } else
            anInt680 = class248_sub9.readShort(-1);
        if (i != 1)
            anInt684 = -93;
    }

    public Class51() {
        ((Class51) this).aBoolean682 = false;
        anInt684 = 0;
        anInt685 = 128;
        anInt693 = 128;
        anInt674 = 0;
        anInt683 = -1;
        ((Class51) this).aByte689 = (byte) 0;
        anInt699 = 0;
    }
}
