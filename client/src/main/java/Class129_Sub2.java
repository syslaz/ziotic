/* Class129_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129_Sub2 extends Class129 {
    static int anInt8518;
    static Class128 aClass128_8519 = new Class128(9, 7);
    static int anInt8520;
    static int anInt8521;
    private int anInt8522 = 0;
    static int anInt8523;
    private Interface21_Impl2 anInterface21_Impl2_8524;
    static int anInt8525;
    private boolean aBoolean8526;
    static int anInt8527;
    private int anInt8528;
    private int anInt8529 = 0;
    static int anInt8530;
    private int anInt8531 = 0;
    static int anInt8532;
    private boolean aBoolean8533;
    private int anInt8534;
    static int anInt8535;
    private boolean aBoolean8536;
    static int anInt8537;
    private boolean aBoolean8538;
    private int anInt8539;
    static int anInt8540;
    static int anInt8541;
    static int anInt8542;
    private boolean aBoolean8543;
    static int anInt8544;
    private ha_Sub3 aHa_Sub3_8545;
    static int anInt8546;

    final void method1179(int[] is) {
        is[3] = anInt8531;
        is[0] = anInt8529;
        anInt8541++;
        is[1] = anInt8522;
        is[2] = anInt8528;
    }

    final int method1181() {
        anInt8540++;
        return anInt8531 + (anInt8522 + anInt8539);
    }

    final void method1180(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt8518++;
        Class238_Sub2 class238_sub2 = aHa_Sub3_8545.method952(-24720);
        Class238_Sub2 class238_sub2_6_ = aHa_Sub3_8545.method1022(0);
        anInterface21_Impl2_8524.method78(-9495, Class51.aClass171_691);
        aHa_Sub3_8545.method1031(true);
        aHa_Sub3_8545.method929(anInterface21_Impl2_8524, -8423);
        aHa_Sub3_8545.method942(-129, i_5_);
        aHa_Sub3_8545.method993((byte) 123, i_3_);
        aHa_Sub3_8545.method946(1, -118, Class380.aClass280_4649);
        aHa_Sub3_8545.method951(Class380.aClass280_4649, (byte) 117, 1);
        aHa_Sub3_8545.method976(i_4_, false);
        boolean bool = aBoolean8543 && (anInt8522 ^ 0xffffffff) == -1 && anInt8531 == 0;
        boolean bool_7_ = aBoolean8526 && (anInt8529 ^ 0xffffffff) == -1 && anInt8528 == 0;
        if (!(bool & bool_7_)) {
            if (bool_7_) {
                int i_8_ = i_0_ - -i_2_;
                int i_9_ = method1181();
                class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, -122), anInterface21_Impl2_8524.method64(-2092, (float) i_1_), 1.0F, (byte) -49);
                aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                int i_10_ = i_0_ + anInt8522;
                int i_11_ = anInt8539 + i_10_;
                while (i_11_ <= i_8_) {
                    class238_sub2.method1898((float) anInt8539, (float) i_1_, 0.0F, (byte) -49);
                    class238_sub2.method1862(i, i_10_, 0);
                    aHa_Sub3_8545.method948(81);
                    i_11_ += i_9_;
                    aHa_Sub3_8545.method986(-118);
                    i_10_ += i_9_;
                }
                if ((i_10_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
                    int i_12_ = i_8_ + -i_10_;
                    class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) i_12_, -70), anInterface21_Impl2_8524.method64(-2092, (float) i_1_), 1.0F, (byte) -49);
                    aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                    class238_sub2.method1898((float) i_12_, (float) i_1_, 0.0F, (byte) -49);
                    class238_sub2.method1862(i, i_10_, 0);
                    aHa_Sub3_8545.method948(105);
                    aHa_Sub3_8545.method986(-123);
                }
            } else if (bool) {
                int i_13_ = i - -i_1_;
                int i_14_ = method1169();
                class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) i_2_, -85), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
                aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                int i_15_ = anInt8529 + i;
                int i_16_ = anInt8534 + i_15_;
                while ((i_16_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)) {
                    class238_sub2.method1898((float) i_2_, (float) anInt8534, 0.0F, (byte) -49);
                    class238_sub2.method1862(i_15_, i_0_, 0);
                    aHa_Sub3_8545.method948(40);
                    i_15_ += i_14_;
                    i_16_ += i_14_;
                    aHa_Sub3_8545.method986(-17);
                }
                if ((i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
                    int i_17_ = i_13_ + -i_15_;
                    class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) i_2_, -76), anInterface21_Impl2_8524.method64(-2092, (float) i_17_), 1.0F, (byte) -49);
                    aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                    class238_sub2.method1898((float) i_2_, (float) i_17_, 0.0F, (byte) -49);
                    class238_sub2.method1862(i_15_, i_0_, 0);
                    aHa_Sub3_8545.method948(53);
                    aHa_Sub3_8545.method986(-119);
                }
            } else {
                int i_18_ = i_2_ + i_0_;
                int i_19_ = i_1_ + i;
                int i_20_ = method1169();
                int i_21_ = method1181();
                int i_22_ = anInt8522 + i_0_;
                int i_23_ = anInt8539 + i_22_;
                while (i_23_ <= i_18_) {
                    class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, 117), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
                    aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                    int i_24_ = i + anInt8529;
                    int i_25_ = anInt8534 + i_24_;
                    while (i_25_ <= i_19_) {
                        class238_sub2.method1898((float) anInt8539, (float) anInt8534, 0.0F, (byte) -49);
                        class238_sub2.method1862(i_24_, i_22_, 0);
                        aHa_Sub3_8545.method948(72);
                        i_24_ += i_20_;
                        i_25_ += i_20_;
                        aHa_Sub3_8545.method986(-21);
                    }
                    if ((i_19_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff)) {
                        int i_26_ = i_19_ - i_24_;
                        class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, 79), anInterface21_Impl2_8524.method64(-2092, (float) i_26_), 1.0F, (byte) -49);
                        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                        class238_sub2.method1898((float) anInt8539, (float) i_26_, 0.0F, (byte) -49);
                        class238_sub2.method1862(i_24_, i_22_, 0);
                        aHa_Sub3_8545.method948(117);
                        aHa_Sub3_8545.method986(-125);
                    }
                    i_23_ += i_21_;
                    i_22_ += i_21_;
                }
                if ((i_22_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff)) {
                    int i_27_ = i_18_ + -i_22_;
                    class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) i_27_, 102), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
                    aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                    int i_28_ = anInt8529 + i;
                    int i_29_ = i_28_ - -anInt8534;
                    while ((i_29_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff)) {
                        class238_sub2.method1898((float) i_27_, (float) anInt8534, 0.0F, (byte) -49);
                        class238_sub2.method1862(i_28_, i_22_, 0);
                        aHa_Sub3_8545.method948(62);
                        aHa_Sub3_8545.method986(-116);
                        i_29_ += i_20_;
                        i_28_ += i_20_;
                    }
                    if ((i_28_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
                        int i_30_ = i_19_ + -i_28_;
                        class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) i_27_, 66), anInterface21_Impl2_8524.method64(-2092, (float) i_30_), 1.0F, (byte) -49);
                        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
                        class238_sub2.method1898((float) i_27_, (float) i_30_, 0.0F, (byte) -49);
                        class238_sub2.method1862(i_28_, i_22_, 0);
                        aHa_Sub3_8545.method948(113);
                        aHa_Sub3_8545.method986(6);
                    }
                }
            }
        } else {
            class238_sub2_6_.method1898(anInterface21_Impl2_8524.method71((float) i_2_, -108), anInterface21_Impl2_8524.method64(-2092, (float) i_1_), 1.0F, (byte) -49);
            class238_sub2.method1898((float) i_2_, (float) i_1_, 0.0F, (byte) -49);
            class238_sub2.method1862(i, i_0_, 0);
            aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
            aHa_Sub3_8545.method948(92);
            aHa_Sub3_8545.method986(-119);
        }
        aHa_Sub3_8545.method925(-106);
        aHa_Sub3_8545.method946(1, -89, Class346_Sub7_Sub3_Sub1.aClass280_10511);
        aHa_Sub3_8545.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 93, 1);
    }

    final void method1177(int i, int i_31_, int i_32_) {
        anInt8535++;
        int[] is = aHa_Sub3_8545.na(i, i_31_, anInt8534, anInt8539);
        int[] is_33_ = new int[anInt8534 * anInt8539];
        anInterface21_Impl2_8524.method69(0, anInt8539, is_33_, 0, 0, 12679, anInt8534);
        if (i_32_ == 0) {
            for (int i_34_ = 0; i_34_ < anInt8539; i_34_++) {
                int i_35_ = i_34_ * anInt8534;
                for (int i_36_ = 0; anInt8534 > i_36_; i_36_++)
                    is_33_[i_35_ + i_36_] = (Class358.retrieveLooksSettings(Class112.method794(is_33_[i_35_ + i_36_], 16777215), (Class112.method794(is[i_36_ + i_35_], 1711210496) << -1549015928)));
            }
        } else if ((i_32_ ^ 0xffffffff) == -2) {
            for (int i_37_ = 0; anInt8539 > i_37_; i_37_++) {
                int i_38_ = anInt8534 * i_37_;
                for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (anInt8534 ^ 0xffffffff); i_39_++)
                    is_33_[i_38_ - -i_39_] = (Class358.retrieveLooksSettings(Class112.method794(is_33_[i_39_ + i_38_], 16777215), Class112.method794(-16762621, (is[i_38_ + i_39_] << 516011600))));
            }
        } else if ((i_32_ ^ 0xffffffff) != -3) {
            if ((i_32_ ^ 0xffffffff) == -4) {
                for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (anInt8539 ^ 0xffffffff); i_40_++) {
                    int i_41_ = i_40_ * anInt8534;
                    for (int i_42_ = 0; anInt8534 > i_42_; i_42_++)
                        is_33_[i_42_ + i_41_] = (Class358.retrieveLooksSettings(Class112.method794(is_33_[i_42_ + i_41_], 16777215), is[i_42_ + i_41_] == 0 ? 0 : -16777216));
                }
            }
        } else {
            for (int i_43_ = 0; (anInt8539 ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++) {
                int i_44_ = i_43_ * anInt8534;
                for (int i_45_ = 0; (anInt8534 ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++)
                    is_33_[i_45_ + i_44_] = (Class358.retrieveLooksSettings((Class112.method794(is[i_45_ + i_44_], -958299649) << -558761896), Class112.method794(16777215, is_33_[i_45_ + i_44_])));
            }
        }
        method1192(0, 0, anInt8534, anInt8539, is_33_, 0, anInt8534);
    }

    final void method1164(int i, int i_46_, aa var_aa, int i_47_, int i_48_) {
        anInt8542++;
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        i += anInt8529;
        Interface21_Impl2 interface21_impl2 = ((aa_Sub3) var_aa_Sub3).anInterface21_Impl2_5263;
        i_46_ += anInt8522;
        anInterface21_Impl2_8524.method78(-9495, Class51.aClass171_691);
        aHa_Sub3_8545.method1031(true);
        aHa_Sub3_8545.method929(anInterface21_Impl2_8524, -8423);
        aHa_Sub3_8545.method942(-129, 1);
        aHa_Sub3_8545.method993((byte) 124, 1);
        Class238_Sub2 class238_sub2 = aHa_Sub3_8545.method952(-24720);
        class238_sub2.method1898((float) anInt8539, (float) anInt8534, 0.0F, (byte) -49);
        class238_sub2.method1862(i, i_46_, 0);
        aHa_Sub3_8545.method948(68);
        Class238_Sub2 class238_sub2_49_ = aHa_Sub3_8545.method1022(0);
        class238_sub2_49_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, 62), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method1040(1, (byte) -65);
        aHa_Sub3_8545.method929(interface21_impl2, -8423);
        aHa_Sub3_8545.method955((byte) 58, Class60.aClass5_821, Class142.aClass5_1669);
        aHa_Sub3_8545.method946(0, -67, Class346_Sub7_Sub3_Sub1.aClass280_10511);
        Class238_Sub2 class238_sub2_50_ = aHa_Sub3_8545.method1022(0);
        class238_sub2_50_.method1898(interface21_impl2.method71((float) anInt8539, -75), interface21_impl2.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
        class238_sub2_50_.method1885(interface21_impl2.method64(-2092, (float) (-i_47_ + i)), 0.0F, interface21_impl2.method71((float) (-i_48_ + i_46_), -77), 13);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method986(-128);
        aHa_Sub3_8545.method925(-104);
        aHa_Sub3_8545.method946(0, -94, Class147.aClass280_1738);
        aHa_Sub3_8545.method955((byte) 60, Class60.aClass5_821, Class60.aClass5_821);
        aHa_Sub3_8545.method929(null, -8423);
        aHa_Sub3_8545.method1040(0, (byte) -65);
        aHa_Sub3_8545.method925(-119);
    }

    final int method1169() {
        anInt8546++;
        return anInt8528 + anInt8529 + anInt8534;
    }

    final void method1178(int i, int i_51_, int i_52_, int i_53_, int i_54_) {
        anInt8523++;
        Class238_Sub2 class238_sub2 = aHa_Sub3_8545.method952(-24720);
        Class238_Sub2 class238_sub2_55_ = aHa_Sub3_8545.method1022(0);
        i_51_ += anInt8522;
        i += anInt8529;
        anInterface21_Impl2_8524.method78(-9495, Class51.aClass171_691);
        aHa_Sub3_8545.method1031(true);
        aHa_Sub3_8545.method929(anInterface21_Impl2_8524, -8423);
        aHa_Sub3_8545.method942(-129, i_54_);
        aHa_Sub3_8545.method993((byte) 123, i_52_);
        aHa_Sub3_8545.method946(1, 40, Class380.aClass280_4649);
        aHa_Sub3_8545.method951(Class380.aClass280_4649, (byte) 117, 1);
        aHa_Sub3_8545.method976(i_53_, false);
        class238_sub2.method1898((float) anInt8539, (float) anInt8534, 0.0F, (byte) -49);
        class238_sub2.method1862(i, i_51_, 0);
        class238_sub2_55_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, 79), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method948(65);
        aHa_Sub3_8545.method986(46);
        aHa_Sub3_8545.method925(-88);
        aHa_Sub3_8545.method946(1, 38, Class346_Sub7_Sub3_Sub1.aClass280_10511);
        aHa_Sub3_8545.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 121, 1);
    }

    final int method1176() {
        anInt8520++;
        return anInt8539;
    }

    final void method1184(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
        anInt8530++;
        int[] is = aHa_Sub3_8545.na(i_59_, i_60_, i_57_, i_58_);
        if (is != null) {
            for (int i_61_ = 0; i_61_ < is.length; i_61_++)
                is[i_61_] = Class358.retrieveLooksSettings(is[i_61_], -16777216);
            method1192(i, i_56_, i_57_, i_58_, is, 0, i_57_);
        }
    }

    final void method1165(int i, int i_62_, int i_63_, int i_64_) {
        anInt8522 = i_62_;
        anInt8529 = i;
        anInt8525++;
        anInt8528 = i_63_;
        anInt8531 = i_64_;
        aBoolean8538 = ((anInt8529 ^ 0xffffffff) != -1 || (anInt8522 ^ 0xffffffff) != -1 || anInt8528 != 0 || (anInt8531 ^ 0xffffffff) != -1);
    }

    final void method1174(float f, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_, int i, aa var_aa, int i_70_, int i_71_) {
        anInt8521++;
        Class238_Sub2 class238_sub2 = aHa_Sub3_8545.method952(-24720);
        Class238_Sub2 class238_sub2_72_ = aHa_Sub3_8545.method1022(0);
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        Interface21_Impl2 interface21_impl2 = ((aa_Sub3) var_aa_Sub3).anInterface21_Impl2_5263;
        anInterface21_Impl2_8524.method78(-9495, ((!aBoolean8533 && !aBoolean8536 && (0x1 & i) != 0) ? Class162.aClass171_1904 : Class51.aClass171_691));
        aHa_Sub3_8545.method1031(true);
        aHa_Sub3_8545.method929(anInterface21_Impl2_8524, -8423);
        aHa_Sub3_8545.method942(-129, 1);
        aHa_Sub3_8545.method993((byte) 112, 1);
        if (aBoolean8538) {
            float f_73_ = (float) anInt8534 / (float) method1169();
            float f_74_ = (float) anInt8539 / (float) method1181();
            class238_sub2.method1891(f_73_ * (f_66_ - f), f_73_ * (f_67_ - f_65_), 1.0F, 0.0F, -126, (-f + f_68_) * f_74_, 0.0F, f_74_ * (f_69_ - f_65_), 0.0F, 0.0F);
            class238_sub2.method1885(f_73_ * ((float) anInt8529 + f), 0.0F, ((float) anInt8522 + f_65_) * f_74_, 13);
        } else {
            class238_sub2.method1891(f_66_ - f, -f_65_ + f_67_, 1.0F, 0.0F, 22, f_68_ - f, 0.0F, -f_65_ + f_69_, 0.0F, 0.0F);
            class238_sub2.method1885(f, 0.0F, f_65_, 13);
        }
        class238_sub2_72_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, -118), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method1040(1, (byte) -65);
        aHa_Sub3_8545.method929(interface21_impl2, -8423);
        aHa_Sub3_8545.method955((byte) 59, Class60.aClass5_821, Class142.aClass5_1669);
        aHa_Sub3_8545.method946(0, -88, Class346_Sub7_Sub3_Sub1.aClass280_10511);
        Class238_Sub2 class238_sub2_75_ = aHa_Sub3_8545.method1022(0);
        class238_sub2_75_.method1868(class238_sub2);
        class238_sub2_75_.method1862(-i_70_, -i_71_, 0);
        class238_sub2_75_.method1880(interface21_impl2.method64(-2092, 1.0F), (byte) -121, interface21_impl2.method71(1.0F, 35), 1.0F);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method948(118);
        aHa_Sub3_8545.method986(58);
        aHa_Sub3_8545.method925(-108);
        aHa_Sub3_8545.method946(0, -99, Class147.aClass280_1738);
        aHa_Sub3_8545.method955((byte) 96, Class60.aClass5_821, Class60.aClass5_821);
        aHa_Sub3_8545.method929(null, -8423);
        aHa_Sub3_8545.method1040(0, (byte) -65);
        aHa_Sub3_8545.method925(-119);
    }

    final void method1183(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_) {
        anInt8537++;
        Class238_Sub2 class238_sub2 = aHa_Sub3_8545.method952(-24720);
        Class238_Sub2 class238_sub2_83_ = aHa_Sub3_8545.method1022(0);
        anInterface21_Impl2_8524.method78(-9495, ((!aBoolean8533 && !aBoolean8536 && (i_82_ & 0x1) != 0) ? Class162.aClass171_1904 : Class51.aClass171_691));
        aHa_Sub3_8545.method1031(true);
        aHa_Sub3_8545.method929(anInterface21_Impl2_8524, -8423);
        aHa_Sub3_8545.method942(-129, i_81_);
        aHa_Sub3_8545.method993((byte) 123, i_79_);
        aHa_Sub3_8545.method946(1, 23, Class380.aClass280_4649);
        aHa_Sub3_8545.method951(Class380.aClass280_4649, (byte) 115, 1);
        aHa_Sub3_8545.method976(i_80_, false);
        class238_sub2_83_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, 85), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
        if (aBoolean8538) {
            i_77_ = anInt8534 * i_77_ / method1169();
            i_78_ = i_78_ * anInt8539 / method1181();
            i += i_77_ * anInt8529 / anInt8534;
            i_76_ += i_78_ * anInt8522 / anInt8539;
        }
        class238_sub2.method1898((float) i_78_, (float) i_77_, 0.0F, (byte) -49);
        class238_sub2.method1862(i, i_76_, 0);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method948(104);
        aHa_Sub3_8545.method986(-118);
        aHa_Sub3_8545.method925(-102);
        aHa_Sub3_8545.method946(1, 72, Class346_Sub7_Sub3_Sub1.aClass280_10511);
        aHa_Sub3_8545.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 91, 1);
    }

    public static void method1191(int i) {
        aClass128_8519 = null;
        if (i != -4)
            method1191(88);
    }

    final int method1175() {
        anInt8544++;
        return anInt8534;
    }

    private final void method1192(int i, int i_84_, int i_85_, int i_86_, int[] is, int i_87_, int i_88_) {
        anInterface21_Impl2_8524.method65(i_84_, i_88_, i, i_87_, i_85_, is, i_86_, (byte) 89);
        anInt8527++;
    }

    final void method1167(float f, float f_89_, float f_90_, float f_91_, float f_92_, float f_93_, int i, int i_94_, int i_95_, int i_96_) {
        anInt8532++;
        Class238_Sub2 class238_sub2 = aHa_Sub3_8545.method952(-24720);
        Class238_Sub2 class238_sub2_97_ = aHa_Sub3_8545.method1022(0);
        anInterface21_Impl2_8524.method78(-9495, ((aBoolean8533 || aBoolean8536 || (i_96_ & 0x1 ^ 0xffffffff) == -1) ? Class51.aClass171_691 : Class162.aClass171_1904));
        aHa_Sub3_8545.method1031(true);
        aHa_Sub3_8545.method929(anInterface21_Impl2_8524, -8423);
        aHa_Sub3_8545.method942(-129, i_95_);
        aHa_Sub3_8545.method993((byte) 104, i);
        aHa_Sub3_8545.method946(1, 83, Class380.aClass280_4649);
        aHa_Sub3_8545.method951(Class380.aClass280_4649, (byte) 84, 1);
        aHa_Sub3_8545.method976(i_94_, false);
        if (aBoolean8538) {
            float f_98_ = (float) method1169();
            float f_99_ = (float) method1181();
            float f_100_ = (-f + f_90_) / f_98_;
            float f_101_ = (f_91_ - f_89_) / f_98_;
            float f_102_ = (f_92_ - f) / f_99_;
            float f_103_ = (f_93_ - f_89_) / f_99_;
            float f_104_ = f_102_ * (float) anInt8522;
            float f_105_ = (float) anInt8522 * f_103_;
            float f_106_ = (float) anInt8529 * f_100_;
            float f_107_ = f_101_ * (float) anInt8529;
            float f_108_ = (float) anInt8528 * -f_100_;
            float f_109_ = -f_101_ * (float) anInt8528;
            float f_110_ = -f_102_ * (float) anInt8531;
            f_91_ = f_91_ + f_109_ + f_105_;
            f_90_ = f_104_ + (f_90_ + f_108_);
            f = f_104_ + (f_106_ + f);
            float f_111_ = -f_103_ * (float) anInt8531;
            f_92_ = f_106_ + f_92_ + f_110_;
            f_89_ = f_89_ + f_107_ + f_105_;
            f_93_ = f_93_ + f_107_ + f_111_;
        }
        class238_sub2.method1891(f_90_ - f, -f_89_ + f_91_, 1.0F, 0.0F, -124, -f + f_92_, 0.0F, -f_89_ + f_93_, 0.0F, 0.0F);
        class238_sub2.method1885(f, 0.0F, f_89_, 13);
        class238_sub2_97_.method1898(anInterface21_Impl2_8524.method71((float) anInt8539, 123), anInterface21_Impl2_8524.method64(-2092, (float) anInt8534), 1.0F, (byte) -49);
        aHa_Sub3_8545.method984(3, Node_Sub14_Sub16.aClass34_9338);
        aHa_Sub3_8545.method948(122);
        aHa_Sub3_8545.method986(-127);
        aHa_Sub3_8545.method925(-110);
        aHa_Sub3_8545.method946(1, -51, Class346_Sub7_Sub3_Sub1.aClass280_10511);
        aHa_Sub3_8545.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 108, 1);
    }

    Class129_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_112_, boolean bool) {
        anInt8528 = 0;
        aBoolean8538 = false;
        anInt8534 = i;
        aHa_Sub3_8545 = var_ha_Sub3;
        anInt8539 = i_112_;
        anInterface21_Impl2_8524 = var_ha_Sub3.method967(i_112_, (bool ? Class120.aClass264_1508 : s.aClass264_3467), -121, i, Class228.aClass228_2573);
        anInterface21_Impl2_8524.method70(1645, true, true);
        aBoolean8533 = anInterface21_Impl2_8524.method63((byte) -32) != i;
        aBoolean8536 = (anInterface21_Impl2_8524.method66((byte) 111) ^ 0xffffffff) != (i_112_ ^ 0xffffffff);
        aBoolean8526 = !aBoolean8533 && anInterface21_Impl2_8524.method67((byte) 110);
        aBoolean8543 = !aBoolean8536 && anInterface21_Impl2_8524.method67((byte) 101);
    }

    Class129_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_113_, int[] is, int i_114_, int i_115_) {
        anInt8528 = 0;
        aBoolean8538 = false;
        aHa_Sub3_8545 = var_ha_Sub3;
        anInt8534 = i;
        anInt8539 = i_113_;
        anInterface21_Impl2_8524 = var_ha_Sub3.method956(i_114_, is, i, false, i_115_, i_113_, -86);
        anInterface21_Impl2_8524.method70(1645, true, true);
        aBoolean8533 = anInterface21_Impl2_8524.method63((byte) -118) != i;
        aBoolean8536 = i_113_ != anInterface21_Impl2_8524.method66((byte) 111);
        aBoolean8526 = !aBoolean8533 && anInterface21_Impl2_8524.method67((byte) -116);
        aBoolean8543 = !aBoolean8536 && anInterface21_Impl2_8524.method67((byte) 124);
    }
}
