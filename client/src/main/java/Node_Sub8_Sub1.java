/* Class248_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub1 extends Node_Sub8 {
    static int anInt8884;
    static int anInt8885;
    static int anInt8886;
    int anInt8887;
    int anInt8888 = 0;
    static int anInt8889;
    Class293 aClass293_8890;
    int anInt8891;
    static long aLong8892 = -1L;
    static int anInt8893;
    static int anInt8894;
    int anInt8895;
    static int anInt8896;
    int anInt8897;
    String aString8898;
    static int anInt8899;
    int anInt8900;
    int anInt8901;
    static int anInt8902;
    boolean aBoolean8903;
    static int anInt8904;
    String aString8905;
    int anInt8906;
    static int anInt8907;
    static int anInt8908;

    static final boolean method2025(int i, int i_0_) {
        if (i_0_ != 18107)
            return false;
        anInt8904++;
        if ((i ^ 0xffffffff) != -2 && i != 3 && (i ^ 0xffffffff) != -6)
            return false;
        return true;
    }

    static final void method2026(int i, boolean bool, int i_1_, boolean bool_2_) {
        anInt8902++;
        if (i < 8000 || i > 48000)
            throw new IllegalArgumentException();
        Node_Sub25.anInt5158 = i_1_;
        Class225_Sub3.aBoolean8472 = bool;
        Class54.anInt728 = i;
        if (bool_2_ != false)
            method2030(null, -106, true, null);
    }

    static final void method2027(int i, int i_3_, int i_4_) {
        anInt8899++;
        if (Class301.aHa4933 != null && i == 27424) {
            int i_5_ = Class70.anInt927;
            int i_6_ = Class108.anInt1363;
            Class282_Sub4.method2937(-1, i_3_, i_4_);
            if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) != -1) {
                if (Node_Sub15_Sub4.anInt9694 == 1 && (Class183.anInterface14Array2136 == null || (Class70.anInt927 ^ 0xffffffff) != (i_5_ ^ 0xffffffff) || Class108.anInt1363 != i_6_)) {
                    Class183.anInterface14Array2136 = (new Interface14
                            [Class108.anInt1363 * Class70.anInt927]);
                    for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class183.anInterface14Array2136.length ^ 0xffffffff)); i_7_++)
                        Class183.anInterface14Array2136[i_7_] = (Class301.aHa4933.a(Class301.aHa4933.d(Class81.anInt4905, Class282_Sub26.anInt7860), Class301.aHa4933.a(Class81.anInt4905, Class282_Sub26.anInt7860)));
                    Class341.anIntArray3970 = new int[Class108.anInt1363 * Class70.anInt927];
                    Class346_Sub7_Sub4_Sub1.anInt10092 = 1;
                }
            } else {
                Class316_Sub2_Sub1.anInterface14_9870 = null;
                Class316_Sub2_Sub1.anInterface14_9870 = Class301.aHa4933.a(Class301.aHa4933.d(Class82.anInt1030, (Node_Sub38.anInt7269)), Class301.aHa4933.a(Class82.anInt1030, (Node_Sub38.anInt7269)));
            }
            Node_Sub30.aBoolean7192 = true;
        }
    }

    final void method2028(byte i) {
        ((Node_Sub8_Sub1) this).anInt8888 = 0;
        ((Node_Sub8_Sub1) this).anInt8887 = 12800;
        ((Node_Sub8_Sub1) this).anInt8901 = 0;
        ((Node_Sub8_Sub1) this).anInt8897 = 12800;
        anInt8893++;
        if (i != 56)
            anInt8889 = -61;
        for (Node_Sub47 class248_sub47 = ((Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3119(2)); class248_sub47 != null; class248_sub47 = (Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3107(-127)) {
            if (((Node_Sub8_Sub1) this).anInt8887 > ((Node_Sub47) class248_sub47).anInt7410)
                ((Node_Sub8_Sub1) this).anInt8887 = ((Node_Sub47) class248_sub47).anInt7410;
            if ((((Node_Sub8_Sub1) this).anInt8901 ^ 0xffffffff) > (((Node_Sub47) class248_sub47).anInt7405 ^ 0xffffffff))
                ((Node_Sub8_Sub1) this).anInt8901 = ((Node_Sub47) class248_sub47).anInt7405;
            if (((Node_Sub8_Sub1) this).anInt8897 > ((Node_Sub47) class248_sub47).anInt7397)
                ((Node_Sub8_Sub1) this).anInt8897 = ((Node_Sub47) class248_sub47).anInt7397;
            if (((Node_Sub47) class248_sub47).anInt7401 > ((Node_Sub8_Sub1) this).anInt8888)
                ((Node_Sub8_Sub1) this).anInt8888 = ((Node_Sub47) class248_sub47).anInt7401;
        }
    }

    final boolean method2029(int i, int i_8_, int i_9_) {
        anInt8896++;
        if (i_9_ <= 98)
            method2025(65, 85);
        for (Node_Sub47 class248_sub47 = ((Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3119(2)); class248_sub47 != null; class248_sub47 = (Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3107(-127)) {
            if (class248_sub47.method2662(i_8_, -118, i))
                return true;
        }
        return false;
    }

    static final void method2030(Class2 class2, int i, boolean bool, ha var_ha) {
        anInt8884++;
        if (Class67.anIntArray901 != null && (((Class2) class2).aByte126 ^ 0xffffffff) <= (i ^ 0xffffffff)) {
            for (int i_10_ = 0; Class67.anIntArray901.length > i_10_; i_10_++) {
                if (Class67.anIntArray901[i_10_] != -1000000 && ((Class67.anIntArray901[i_10_] >= ((Class2) class2).anIntArray122[0]) || (Class67.anIntArray901[i_10_] >= ((Class2) class2).anIntArray122[1]) || (((Class2) class2).anIntArray122[2] <= Class67.anIntArray901[i_10_]) || (Class67.anIntArray901[i_10_] >= ((Class2) class2).anIntArray122[3])) && ((((Class2) class2).anIntArray124[0] <= Class76.anIntArray983[i_10_]) || (Class76.anIntArray983[i_10_] >= ((Class2) class2).anIntArray124[1]) || ((Class76.anIntArray983[i_10_] ^ 0xffffffff) <= (((Class2) class2).anIntArray124[2] ^ 0xffffffff)) || (((Class2) class2).anIntArray124[3] <= Class76.anIntArray983[i_10_])) && ((((Class2) class2).anIntArray124[0] >= Class75.anIntArray975[i_10_]) || (((Class2) class2).anIntArray124[1] >= Class75.anIntArray975[i_10_]) || ((Class75.anIntArray975[i_10_] ^ 0xffffffff) >= (((Class2) class2).anIntArray124[2] ^ 0xffffffff)) || ((Class75.anIntArray975[i_10_] ^ 0xffffffff) >= (((Class2) class2).anIntArray124[3] ^ 0xffffffff))) && ((Class112.anIntArray5213[i_10_] >= ((Class2) class2).anIntArray117[0]) || ((Class112.anIntArray5213[i_10_] ^ 0xffffffff) <= (((Class2) class2).anIntArray117[1] ^ 0xffffffff)) || ((Class112.anIntArray5213[i_10_] ^ 0xffffffff) <= (((Class2) class2).anIntArray117[2] ^ 0xffffffff)) || ((((Class2) class2).anIntArray117[3] ^ 0xffffffff) >= (Class112.anIntArray5213[i_10_] ^ 0xffffffff))) && (((Node_Sub14_Sub26.anIntArray9433[i_10_] ^ 0xffffffff) >= (((Class2) class2).anIntArray117[0] ^ 0xffffffff)) || (((Class2) class2).anIntArray117[1] >= Node_Sub14_Sub26.anIntArray9433[i_10_]) || ((((Class2) class2).anIntArray117[2] ^ 0xffffffff) <= (Node_Sub14_Sub26.anIntArray9433[i_10_] ^ 0xffffffff)) || (((Class2) class2).anIntArray117[3] >= Node_Sub14_Sub26.anIntArray9433[i_10_])))
                    return;
            }
        }
        if (bool != true)
            method2027(-114, 90, -73);
        if (((Class2) class2).aByte115 == 1) {
            int i_11_ = (Node_Sub47.anInt7416 + -Class286.anInt3375 + ((Class2) class2).aShort113);
            if ((i_11_ ^ 0xffffffff) <= -1 && ((i_11_ ^ 0xffffffff) >= (Node_Sub47.anInt7416 - -Node_Sub47.anInt7416 ^ 0xffffffff))) {
                int i_12_ = (Node_Sub47.anInt7416 + (-Class152.anInt1808 + ((Class2) class2).aShort125));
                if (i_12_ < 0)
                    i_12_ = 0;
                else if (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 < i_12_)
                    return;
                int i_13_ = (Node_Sub47.anInt7416 + ((Class2) class2).aShort129 + -Class152.anInt1808);
                if (Node_Sub47.anInt7416 - -Node_Sub47.anInt7416 >= i_13_) {
                    if ((i_13_ ^ 0xffffffff) > -1)
                        return;
                } else
                    i_13_ = Node_Sub47.anInt7416 + Node_Sub47.anInt7416;
                boolean bool_14_ = false;
                while (i_12_ <= i_13_) {
                    if (RSInterface2.aBooleanArrayArray4314[i_11_][i_12_++]) {
                        bool_14_ = true;
                        break;
                    }
                }
                if (bool_14_) {
                    float f = (float) (Class227.anInt2565 + -((Class2) class2).anIntArray124[0]);
                    if (f < 0.0F)
                        f *= -1.0F;
                    if (!((float) Class169.anInt1977 > f) && Class238_Sub3.method1908(0, (byte) -126, class2) && Class238_Sub3.method1908(1, (byte) -95, class2) && Class238_Sub3.method1908(2, (byte) -30, class2) && Class238_Sub3.method1908(3, (byte) -75, class2))
                        Node_Sub14_Sub14.aClass2Array9305[Class300.anInt3496++] = class2;
                }
            }
        } else if ((((Class2) class2).aByte115 ^ 0xffffffff) == -3) {
            int i_15_ = (Node_Sub47.anInt7416 + (-Class152.anInt1808 + ((Class2) class2).aShort125));
            if (i_15_ >= 0 && (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) {
                int i_16_ = (((Class2) class2).aShort113 - Class286.anInt3375 + Node_Sub47.anInt7416);
                if ((i_16_ ^ 0xffffffff) > -1)
                    i_16_ = 0;
                else if (i_16_ > Node_Sub47.anInt7416 + Node_Sub47.anInt7416)
                    return;
                int i_17_ = (-Class286.anInt3375 + ((Class2) class2).aShort121 + Node_Sub47.anInt7416);
                if ((i_17_ ^ 0xffffffff) < (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 ^ 0xffffffff))
                    i_17_ = Node_Sub47.anInt7416 + Node_Sub47.anInt7416;
                else if ((i_17_ ^ 0xffffffff) > -1)
                    return;
                boolean bool_18_ = false;
                while (i_17_ >= i_16_) {
                    if (RSInterface2.aBooleanArrayArray4314[i_16_++][i_15_]) {
                        bool_18_ = true;
                        break;
                    }
                }
                if (bool_18_) {
                    float f = (float) (Node_Sub8_Sub18.anInt9079 - ((Class2) class2).anIntArray117[0]);
                    if (f < 0.0F)
                        f *= -1.0F;
                    if (!((float) Class169.anInt1977 > f) && Class238_Sub3.method1908(0, (byte) -51, class2) && Class238_Sub3.method1908(1, (byte) -82, class2) && Class238_Sub3.method1908(2, (byte) -24, class2) && Class238_Sub3.method1908(3, (byte) -45, class2))
                        Node_Sub14_Sub14.aClass2Array9305[Class300.anInt3496++] = class2;
                }
            }
        } else if (((Class2) class2).aByte115 == 16 || ((Class2) class2).aByte115 == 8) {
            int i_19_ = (((Class2) class2).aShort113 - (Class286.anInt3375 + -Node_Sub47.anInt7416));
            if ((i_19_ ^ 0xffffffff) <= -1 && ((i_19_ ^ 0xffffffff) >= (Node_Sub47.anInt7416 - -Node_Sub47.anInt7416 ^ 0xffffffff))) {
                int i_20_ = (Node_Sub47.anInt7416 + -Class152.anInt1808 + ((Class2) class2).aShort125);
                if (i_20_ >= 0 && ((i_20_ ^ 0xffffffff) >= (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 ^ 0xffffffff)) && RSInterface2.aBooleanArrayArray4314[i_19_][i_20_]) {
                    float f = (float) (-((Class2) class2).anIntArray124[0] + Class227.anInt2565);
                    if (f < 0.0F)
                        f *= -1.0F;
                    float f_21_ = (float) (Node_Sub8_Sub18.anInt9079 + -((Class2) class2).anIntArray117[0]);
                    if (f_21_ < 0.0F)
                        f_21_ *= -1.0F;
                    if ((!((float) Class169.anInt1977 > f) || !((float) Class169.anInt1977 > f_21_)) && Class238_Sub3.method1908(0, (byte) -28, class2) && Class238_Sub3.method1908(1, (byte) -104, class2) && Class238_Sub3.method1908(2, (byte) -71, class2) && Class238_Sub3.method1908(3, (byte) -27, class2))
                        Node_Sub14_Sub14.aClass2Array9305[Class300.anInt3496++] = class2;
                }
            }
        } else if (((Class2) class2).aByte115 == 4) {
            float f = (float) (((Class2) class2).anIntArray122[0] - Class208.anInt2407);
            if (!(f <= (float) Class225_Sub1_Sub1.anInt9983)) {
                int i_22_ = (-Class152.anInt1808 + ((Class2) class2).aShort125 - -Node_Sub47.anInt7416);
                if (i_22_ < 0)
                    i_22_ = 0;
                else if (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 < i_22_)
                    return;
                int i_23_ = (Node_Sub47.anInt7416 + (-Class152.anInt1808 + ((Class2) class2).aShort129));
                if (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 < i_23_)
                    i_23_ = Node_Sub47.anInt7416 + Node_Sub47.anInt7416;
                else if ((i_23_ ^ 0xffffffff) > -1)
                    return;
                int i_24_ = -Class286.anInt3375 + (((Class2) class2).aShort113 - -Node_Sub47.anInt7416);
                if ((i_24_ ^ 0xffffffff) <= -1) {
                    if ((i_24_ ^ 0xffffffff) < (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 ^ 0xffffffff))
                        return;
                } else
                    i_24_ = 0;
                int i_25_ = (Node_Sub47.anInt7416 + (-Class286.anInt3375 + ((Class2) class2).aShort121));
                if ((i_25_ ^ 0xffffffff) >= (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 ^ 0xffffffff)) {
                    if ((i_25_ ^ 0xffffffff) > -1)
                        return;
                } else
                    i_25_ = Node_Sub47.anInt7416 + Node_Sub47.anInt7416;
                boolean bool_26_ = false;
                while_7_:
                for (int i_27_ = i_24_; i_27_ <= i_25_; i_27_++) {
                    for (int i_28_ = i_22_; i_23_ >= i_28_; i_28_++) {
                        if (RSInterface2.aBooleanArrayArray4314[i_27_][i_28_]) {
                            bool_26_ = true;
                            break while_7_;
                        }
                    }
                }
                if (bool_26_ && Class238_Sub3.method1908(0, (byte) -113, class2) && Class238_Sub3.method1908(1, (byte) -33, class2) && Class238_Sub3.method1908(2, (byte) -38, class2) && Class238_Sub3.method1908(3, (byte) -45, class2))
                    Node_Sub14_Sub14.aClass2Array9305[Class300.anInt3496++] = class2;
            }
        }
    }

    final boolean method2031(int[] is, int i, int i_29_, int i_30_, int i_31_) {
        anInt8894++;
        if (i_31_ != 0)
            method2026(27, true, 98, false);
        for (Node_Sub47 class248_sub47 = ((Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3119(2)); class248_sub47 != null; class248_sub47 = (Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3107(-128)) {
            if (class248_sub47.method2661(i_29_, i, (byte) -71, i_30_)) {
                class248_sub47.method2659(is, i_29_, i, -128);
                return true;
            }
        }
        return false;
    }

    static final void method2032(int i, int[] is, int[] is_32_, boolean bool, boolean bool_33_, byte i_34_, int i_35_, int i_36_, int[] is_37_, int[] is_38_, int i_39_, int i_40_, int i_41_, int i_42_, int[] is_43_, int i_44_, int i_45_, byte[][][] is_46_) {
        anInt8886++;
        if (i_41_ != (Node_Sub15_Sub4.anInt9694 ^ 0xffffffff)) {
            int[] is_47_ = Class301.aHa4933.Y();
            int i_48_ = is_47_[0];
            int i_49_ = is_47_[1];
            int i_50_ = is_47_[2];
            int i_51_ = is_47_[3];
            int i_52_ = i_50_;
            int i_53_ = i_51_;
            if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -2) {
                i_52_ = (int) ((double) Class325.anInt3828 * (double) i_50_ / (double) Node_Sub38.anInt7269);
                i_53_ = (int) ((double) Class325.anInt3828 * (double) i_51_ / (double) Node_Sub38.anInt7269);
            }
            if (!Node_Sub30.aBoolean7192) {
                if (Node_Sub15_Sub4.anInt9694 == 1)
                    Class80.method584((byte) -112);
                int i_54_ = i_44_ - Class50.anInt672;
                int i_55_ = -Node_Sub14_Sub12_Sub1.anInt10311 + i_39_;
                int i_56_ = -Class361.anInt4452 + i_42_;
                int i_57_ = (int) ((Class302.aDouble3499 * (double) i_56_ + ((double) i_54_ * Class290.aDouble3418 + (double) i_55_ * Class279.aDouble3244)) * (double) i_52_ / (double) i_45_);
                int i_58_ = (int) ((double) i_53_ * (Class331.aDouble3863 * (double) i_56_ + ((Node_Sub8_Sub10.aDouble8982 * (double) i_54_) + (double) i_55_ * Class69.aDouble914)) / (double) i_45_);
                double d = (Class321.aDouble3765 * (double) i_55_ + (double) i_54_ * Class316.aDouble3661 + Class61.aDouble833 * (double) i_56_);
                int i_59_ = i_57_ + (Class296.anInt3461 + -Class198.anInt2265);
                int i_60_ = -Class90.anInt1118 + Class151.anInt1806 - -i_58_;
                int i_61_ = anInt8889 + i_59_;
                int i_62_ = Class325.anInt3828 + i_60_;
                if ((i_59_ >= 0 && (i_60_ ^ 0xffffffff) <= -1 && i_61_ <= Class82.anInt1030 && (i_62_ ^ 0xffffffff) >= (Node_Sub38.anInt7269 ^ 0xffffffff)) || Node_Sub15_Sub4.anInt9694 == 2) {
                    Class185_Sub1.anInt6654 = i_60_;
                    if (Node_Sub15_Sub4.anInt9694 == 2)
                        Class216.aDouble2489 = -d;
                    Class267.anInt4920 = i_59_;
                } else if ((i_61_ ^ 0xffffffff) >= -1 || i_62_ <= 0 || Class82.anInt1030 <= i_59_ || i_60_ >= Node_Sub38.anInt7269)
                    Node_Sub30.aBoolean7192 = true;
                else {
                    int i_63_ = -Class296.anInt3461 + i_59_;
                    int i_64_ = -Class151.anInt1806 + i_60_;
                    int i_65_ = 0;
                    int i_66_ = 0;
                    int i_67_ = 0;
                    int i_68_ = 0;
                    double d_69_ = 0.0;
                    if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -1) {
                        d_69_ = Class216.aDouble2489 + d;
                        i_65_ = i_63_;
                        i_66_ = i_64_;
                    } else if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -2) {
                        i_67_ = i_63_ / Class81.anInt4905;
                        i_68_ = i_64_ / Class282_Sub26.anInt7860;
                        i_66_ = Class282_Sub26.anInt7860 * i_68_;
                        i_65_ = i_67_ * Class81.anInt4905;
                        d_69_ = ((double) (i_66_ * i_64_ + i_63_ * i_65_) * (Class216.aDouble2489 + d) / (double) (i_64_ * i_64_ + i_63_ * i_63_));
                    }
                    d_69_ = -d_69_;
                    int i_70_ = 0;
                    int i_71_ = 0;
                    int i_72_ = 0;
                    int i_73_ = 0;
                    int i_74_ = 0;
                    int i_75_ = 0;
                    int i_76_;
                    int i_77_;
                    int i_78_;
                    int i_79_;
                    if ((i_65_ ^ 0xffffffff) <= -1) {
                        i_77_ = 0;
                        i_78_ = Class82.anInt1030 + -i_65_;
                        i_79_ = i_65_;
                        if (Node_Sub15_Sub4.anInt9694 == 1) {
                            i_72_ = -i_67_ + Class70.anInt927;
                            i_74_ = i_67_;
                        }
                        i_76_ = i_78_;
                    } else {
                        i_76_ = 0;
                        i_77_ = -i_65_;
                        i_78_ = Class82.anInt1030 - -i_65_;
                        if (Node_Sub15_Sub4.anInt9694 == 1) {
                            i_74_ = -i_67_;
                            i_72_ = 0;
                        }
                        i_79_ = i_77_;
                    }
                    int i_80_;
                    int i_81_;
                    int i_82_;
                    int i_83_;
                    int i_84_;
                    int i_85_;
                    if (i_66_ < 0) {
                        i_82_ = 0;
                        i_81_ = -i_66_;
                        i_80_ = i_66_ + Node_Sub38.anInt7269;
                        i_83_ = i_81_;
                        if (Node_Sub15_Sub4.anInt9694 == 1) {
                            i_70_ = 0;
                            i_71_ = -i_68_;
                            i_73_ = i_71_;
                            i_75_ = i_68_ + Class108.anInt1363;
                        }
                        i_85_ = i_80_;
                        i_84_ = i_83_;
                    } else {
                        i_80_ = Node_Sub38.anInt7269 - i_66_;
                        i_81_ = 0;
                        i_82_ = i_80_;
                        if (Node_Sub15_Sub4.anInt9694 == 1) {
                            i_70_ = Class108.anInt1363 + -i_68_;
                            i_71_ = i_68_;
                            i_73_ = 0;
                            i_75_ = i_70_;
                        }
                        i_83_ = i_66_;
                        i_84_ = 0;
                        i_85_ = i_80_;
                    }
                    Class360 class360 = (((Class27) Node_Sub8_Sub7.aClass27_8958).aClass360_358);
                    for (Class346_Sub10 class346_sub10 = ((Class346_Sub10) class360.method3815((byte) 103)); class346_sub10 != null; class346_sub10 = (Class346_Sub10) class360.method3809(-24951)) {
                        Class346_Sub9[] class346_sub9s = (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353);
                        boolean bool_86_ = true;
                        for (int i_87_ = 0; ((i_87_ ^ 0xffffffff) > (class346_sub9s.length ^ 0xffffffff)); i_87_++) {
                            Class346_Sub9 class346_sub9 = class346_sub9s[i_87_];
                            int i_88_ = ((Class346_Sub9) class346_sub9).anInt8347;
                            int i_89_ = ((Class346_Sub9) class346_sub9).anInt8346;
                            int i_90_ = ((Class346_Sub9) class346_sub9).anInt8345;
                            int i_91_ = ((Class346_Sub9) class346_sub9).anInt8343;
                            ((Class346_Sub9) class346_sub9).anInt8345 = i_90_ = -i_65_ + i_90_;
                            ((Class346_Sub9) class346_sub9).anInt8347 = i_88_ = -i_65_ + i_88_;
                            ((Class346_Sub9) class346_sub9).anInt8343 = i_91_ = -i_66_ + i_91_;
                            int i_92_ = ((Class346_Sub9) class346_sub9).anInt8344;
                            ((Class346_Sub9) class346_sub9).anInt8346 = i_89_ = -i_66_ + i_89_;
                            if (bool_86_) {
                                int i_93_ = -i_92_ + (((i_88_ ^ 0xffffffff) > (i_90_ ^ 0xffffffff)) ? i_88_ : i_90_);
                                if (i_93_ <= Class82.anInt1030) {
                                    int i_94_ = -i_92_ + (i_89_ < i_91_ ? i_89_ : i_91_);
                                    if (i_94_ <= Node_Sub38.anInt7269) {
                                        int i_95_ = (i_92_ + (((i_88_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff)) ? i_88_ : i_90_));
                                        if (i_95_ >= 0) {
                                            int i_96_ = ((((i_89_ ^ 0xffffffff) > (i_91_ ^ 0xffffffff)) ? i_91_ : i_89_) - -i_92_);
                                            if (i_96_ >= 0)
                                                bool_86_ = false;
                                        }
                                    }
                                }
                            }
                        }
                        if (bool_86_) {
                            class346_sub10.method3538(i_41_ ^ ~0x7f);
                            Class256.method2749(class346_sub10, (byte) 31);
                        }
                    }
                    if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -1)
                        Class301.aHa4933.a(Class316_Sub2_Sub1.anInterface14_9870);
                    Class301.aHa4933.F(-i_65_, -i_66_);
                    Class301.aHa4933.b(i_77_, i_81_, i_78_, i_80_, d_69_);
                    Node_Sub23.method2538((byte) -125, d_69_ + Class216.aDouble2489);
                    Class237.aDouble2638 = d_69_ + Class216.aDouble2489;
                    if (Node_Sub15_Sub4.anInt9694 != 1) {
                        Class282_Sub21.anInt7815 = i_52_;
                        Node_Sub14_Sub21.anInt9382 = i_49_ - (-Class151.anInt1806 + (Class90.anInt1118 + i_66_));
                        Class127.anInt1564 = -i_65_ + (Class296.anInt3461 + (i_48_ + -Class198.anInt2265));
                        Node_Sub14_Sub35.anInt9541 = i_53_;
                        Class301.aHa4933.DA(Class127.anInt1564, Node_Sub14_Sub21.anInt9382, Class282_Sub21.anInt7815, Node_Sub14_Sub35.anInt9541);
                    } else {
                        Class127.anInt1564 = -i_65_ + -Class198.anInt2265 + i_48_;
                        Node_Sub14_Sub35.anInt9541 = i_53_;
                        Class282_Sub21.anInt7815 = i_52_;
                        Node_Sub14_Sub21.anInt9382 = -Class90.anInt1118 + (i_49_ + -i_66_);
                        Class301.aHa4933.DA(Class127.anInt1564, Node_Sub14_Sub21.anInt9382, Class282_Sub21.anInt7815, Node_Sub14_Sub35.anInt9541);
                    }
                    Class162.method1423(Node_Sub8_Sub7.aClass27_8958);
                    if ((i_83_ ^ 0xffffffff) < -1) {
                        Class301.aHa4933.KA(0, i_82_, Class82.anInt1030, i_82_ - -i_83_);
                        Class301.aHa4933.ya();
                        Class301.aHa4933.GA(Class170.anInt1983);
                        Class223.method1772(i_40_, i_44_, i_39_, i_42_, is_46_, is, is_37_, is_43_, is_32_, is_38_, i, i_34_, i_35_, i_36_, bool, bool_33_, i_45_, 1, false);
                    }
                    if (i_79_ > 0) {
                        Class301.aHa4933.KA(i_76_, i_84_, i_79_ + i_76_, i_84_ + i_85_);
                        Class301.aHa4933.ya();
                        Class301.aHa4933.GA(Class170.anInt1983);
                        Class223.method1772(i_40_, i_44_, i_39_, i_42_, is_46_, is, is_37_, is_43_, is_32_, is_38_, i, i_34_, i_35_, i_36_, bool, bool_33_, i_45_, 1, false);
                    }
                    Class301.aHa4933.la();
                    Node_Sub14_Sub4.method2286();
                    if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -1)
                        Class301.aHa4933.z();
                    Class198.anInt2265 += i_65_;
                    Class90.anInt1118 += i_66_;
                    Class216.aDouble2489 += d_69_;
                    Class267.anInt4920 = i_57_ + Class296.anInt3461 - Class198.anInt2265;
                    Class185_Sub1.anInt6654 = Class151.anInt1806 + (i_58_ - Class90.anInt1118);
                    if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -2) {
                        Class358.anInt4422 += i_67_;
                        Node_Sub14_Sub18.anInt9352 += i_68_;
                        for (int i_97_ = 0; i_97_ < Class108.anInt1363; i_97_++) {
                            int i_98_ = ((Class346_Sub7_Sub1_Sub2.method3594(Class108.anInt1363, -429911713, i_97_ + Node_Sub14_Sub18.anInt9352)) * Class70.anInt927);
                            for (int i_99_ = 0; Class70.anInt927 > i_99_; i_99_++) {
                                int i_100_ = (i_98_ + (Class346_Sub7_Sub1_Sub2.method3594(Class70.anInt927, -429911713, i_99_ + Class358.anInt4422)));
                                boolean bool_101_ = (((i_70_ ^ 0xffffffff) >= (i_97_ ^ 0xffffffff) && i_97_ < i_71_ + i_70_) || (((i_97_ ^ 0xffffffff) <= (i_73_ ^ 0xffffffff)) && i_97_ < i_75_ + i_73_ && ((i_72_ ^ 0xffffffff) >= (i_99_ ^ 0xffffffff)) && ((i_72_ - -i_74_ ^ 0xffffffff) < (i_99_ ^ 0xffffffff))));
                                Class183.anInterface14Array2136[i_100_].method39(Class81.anInt4905 * i_99_, i_97_ * Class282_Sub26.anInt7860, Class81.anInt4905, Class282_Sub26.anInt7860, 0, 0, bool_101_, true);
                            }
                        }
                    }
                }
            }
            if (Node_Sub30.aBoolean7192) {
                Node_Sub14_Sub12_Sub1.anInt10311 = i_39_;
                Class267.anInt4920 = Class296.anInt3461;
                Class361.anInt4452 = i_42_;
                Class185_Sub1.anInt6654 = Class151.anInt1806;
                Class216.aDouble2489 = 0.0;
                Class90.anInt1118 = 0;
                Class198.anInt2265 = 0;
                Class50.anInt672 = i_44_;
                if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -1)
                    Class301.aHa4933.a(Class316_Sub2_Sub1.anInterface14_9870);
                Class301.aHa4933.la();
                Class301.aHa4933.ya();
                Class301.aHa4933.GA(Class170.anInt1983);
                Node_Sub14_Sub30.aViewport_9479.method1869(Class50.anInt672, Node_Sub14_Sub12_Sub1.anInt10311, Class361.anInt4452, Class225_Sub1.anInt8451, Class2.anInt118, s_Sub2.anInt7955);
                Class301.aHa4933.a(Node_Sub14_Sub30.aViewport_9479);
                if (Node_Sub15_Sub4.anInt9694 == 1) {
                    Class127.anInt1564 = i_48_;
                    Node_Sub14_Sub35.anInt9541 = i_53_;
                    Node_Sub14_Sub21.anInt9382 = i_49_;
                    Class282_Sub21.anInt7815 = i_52_;
                    Class301.aHa4933.DA(Class127.anInt1564, Node_Sub14_Sub21.anInt9382, Class282_Sub21.anInt7815, Node_Sub14_Sub35.anInt9541);
                } else {
                    Node_Sub14_Sub35.anInt9541 = i_53_;
                    Class282_Sub21.anInt7815 = i_52_;
                    Node_Sub14_Sub21.anInt9382 = i_49_ - -Class151.anInt1806;
                    Class127.anInt1564 = Class296.anInt3461 + i_48_;
                    Class301.aHa4933.DA(Class127.anInt1564, Node_Sub14_Sub21.anInt9382, Class282_Sub21.anInt7815, Node_Sub14_Sub35.anInt9541);
                }
                Class237.aDouble2638 = 0.0;
                Node_Sub8_Sub7.aClass27_8958.method254(28);
                Class162.method1423(Node_Sub8_Sub7.aClass27_8958);
                Class223.method1772(i_40_, i_44_, i_39_, i_42_, is_46_, is, is_37_, is_43_, is_32_, is_38_, i, i_34_, i_35_, i_36_, bool, bool_33_, i_45_, 1, false);
                Node_Sub14_Sub4.method2286();
                Node_Sub30.aBoolean7192 = false;
                if (Node_Sub15_Sub4.anInt9694 == 0)
                    Class301.aHa4933.z();
                if (Node_Sub15_Sub4.anInt9694 == 1)
                    Class263.method2774(-32);
            }
            if (Node_Sub15_Sub4.anInt9694 == 0)
                Class316_Sub2_Sub1.anInterface14_9870.method38(Class267.anInt4920, Class185_Sub1.anInt6654, anInt8889, Class325.anInt3828, 0, 0, true, true);
            Class346_Sub7_Sub4_Sub1.anInt10092++;
            Node_Sub23.method2538((byte) -118, Class216.aDouble2489);
            Class82.aDouble1028 = Class216.aDouble2489;
            if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) != -1 && (Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) != -3) {
                if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -2) {
                    Class136_Sub1.anInt8383 = -Class198.anInt2265 + i_48_;
                    Class346_Sub10.anInt8357 = i_49_ + -Class90.anInt1118;
                    Class258.anInt2953 = i_52_;
                    Class346_Sub7_Sub5.anInt9960 = i_53_;
                    Class301.aHa4933.DA(Class136_Sub1.anInt8383, Class346_Sub10.anInt8357, Class258.anInt2953, Class346_Sub7_Sub5.anInt9960);
                    Class301.aHa4933.KA(Class267.anInt4920, Class185_Sub1.anInt6654, Class267.anInt4920 - -anInt8889, (Class185_Sub1.anInt6654 - -Class325.anInt3828));
                }
            } else {
                if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == -3) {
                    Class301.aHa4933.GA(Class170.anInt1983);
                    Class301.aHa4933.ya();
                }
                Class346_Sub10.anInt8357 = i_49_ - (-Class151.anInt1806 - (-Class90.anInt1118 - Class185_Sub1.anInt6654));
                Class258.anInt2953 = i_52_;
                Class136_Sub1.anInt8383 = Class296.anInt3461 + i_48_ - (Class198.anInt2265 + Class267.anInt4920);
                Class346_Sub7_Sub5.anInt9960 = i_53_;
                Class301.aHa4933.DA(Class136_Sub1.anInt8383, Class346_Sub10.anInt8357, Class258.anInt2953, Class346_Sub7_Sub5.anInt9960);
            }
            Class223.method1772(i_40_, i_44_, i_39_, i_42_, is_46_, is, is_37_, is_43_, is_32_, is_38_, i, i_34_, i_35_, i_36_, bool, bool_33_, i_45_, Node_Sub15_Sub4.anInt9694 == 2 ? 0 : 2, Node_Sub15_Sub4.anInt9694 == 1);
            Class301.aHa4933.la();
            Class301.aHa4933.DA(i_48_, i_49_, i_50_, i_51_);
        }
    }

    final boolean method2033(int i, int i_102_, int i_103_, int[] is) {
        anInt8885++;
        if (i_103_ > -79)
            return true;
        for (Node_Sub47 class248_sub47 = ((Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3119(2)); class248_sub47 != null; class248_sub47 = (Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3107(-127)) {
            if (class248_sub47.method2663(-31819, i, i_102_)) {
                class248_sub47.method2658(i_102_, i, 2, is);
                return true;
            }
        }
        return false;
    }

    final boolean method2034(int i, int[] is, int i_104_, int i_105_) {
        anInt8907++;
        for (Node_Sub47 class248_sub47 = ((Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3119(2)); class248_sub47 != null; class248_sub47 = (Node_Sub47) ((Node_Sub8_Sub1) this).aClass293_8890.method3107(-128)) {
            if (class248_sub47.method2662(i_104_, -87, i)) {
                class248_sub47.method2659(is, i_104_, i, -119);
                return true;
            }
        }
        if (i_105_ >= -18)
            method2032(120, null, null, false, false, (byte) 106, 59, 54, null, null, -37, -24, 48, 45, null, 103, 95, null);
        return false;
    }

    Node_Sub8_Sub1(int i, String string, String string_106_, int i_107_, int i_108_, boolean bool, int i_109_, int i_110_) {
        ((Node_Sub8_Sub1) this).anInt8887 = 12800;
        ((Node_Sub8_Sub1) this).anInt8901 = 0;
        ((Node_Sub8_Sub1) this).aBoolean8903 = true;
        ((Node_Sub8_Sub1) this).anInt8897 = 12800;
        ((Node_Sub8_Sub1) this).anInt8900 = -1;
        ((Node_Sub8_Sub1) this).anInt8906 = -1;
        ((Node_Sub8_Sub1) this).anInt8906 = i_108_;
        ((Node_Sub8_Sub1) this).aBoolean8903 = bool;
        ((Node_Sub8_Sub1) this).aString8898 = string_106_;
        ((Node_Sub8_Sub1) this).anInt8895 = i;
        ((Node_Sub8_Sub1) this).anInt8891 = i_107_;
        ((Node_Sub8_Sub1) this).anInt8900 = i_109_;
        ((Node_Sub8_Sub1) this).aString8905 = string;
        if (((Node_Sub8_Sub1) this).anInt8900 == 255)
            ((Node_Sub8_Sub1) this).anInt8900 = 0;
        ((Node_Sub8_Sub1) this).aClass293_8890 = new Class293();
    }
}
