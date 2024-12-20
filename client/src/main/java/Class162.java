/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class162 {
    static int anInt1896;
    static int anInt1897;
    static int anInt1898;
    static int anInt1899;
    static int anInt1900;
    static int[] anIntArray1901 = new int[32];
    static int anInt1902;
    static int anInt1903;
    static Class171 aClass171_1904 = new Class171();
    static int anInt1905;
    static int[] anIntArray1906;
    boolean aBoolean1907 = false;
    static int anInt1908;
    static String[] aStringArray1909;
    static Class381 aClass381_1910;

    final void method1418(Node_Sub8_Sub2 class248_sub8_sub2, Node_Sub8_Sub2 class248_sub8_sub2_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, Node_Sub8_Sub2 class248_sub8_sub2_5_, int i_6_, byte i_7_, boolean[] bools, Node_Sub8_Sub2 class248_sub8_sub2_8_, int i_9_, int i_10_) {
        anInt1908++;
        if ((i ^ 0xffffffff) != 0) {
            if (bools == null || i_6_ == -1)
                method1421(-41, class248_sub8_sub2_8_, bool, i_2_, i_10_, i, 0, i_3_, class248_sub8_sub2_5_);
            else {
                method1427();
                if (!NA())
                    method1425();
                else {
                    Class362 class362 = (((Node_Sub8_Sub2) class248_sub8_sub2_8_).aClass362Array8919[i]);
                    Node_Sub19 class248_sub19 = ((Class362) class362).aClass248_Sub19_4471;
                    Class362 class362_11_ = null;
                    if (class248_sub8_sub2_5_ != null) {
                        class362_11_ = (((Node_Sub8_Sub2) class248_sub8_sub2_5_).aClass362Array8919[i_2_]);
                        if (((Class362) class362_11_).aClass248_Sub19_4471 != class248_sub19)
                            class362_11_ = null;
                    }
                    method1444(class248_sub19, bool, 0, class362, 65535, i_10_, bools, class362_11_, false, null, (byte) 114, i_3_);
                    if (i_7_ < 90)
                        VA(111);
                    Class362 class362_12_ = (((Node_Sub8_Sub2) class248_sub8_sub2_0_).aClass362Array8919[i_6_]);
                    Class362 class362_13_ = null;
                    if (class248_sub8_sub2 != null) {
                        class362_13_ = (((Node_Sub8_Sub2) class248_sub8_sub2).aClass362Array8919[i_4_]);
                        if (class248_sub19 != ((Class362) class362_13_).aClass248_Sub19_4471)
                            class362_13_ = null;
                    }
                    method1438(0, new int[0], 0, 0, 0, 0, bool);
                    method1444(((Class362) class362_12_).aClass248_Sub19_4471, bool, 0, class362_12_, 65535, i_1_, bools, class362_13_, true, null, (byte) 119, i_9_);
                    wa();
                    method1425();
                }
            }
        }
    }

    abstract void FA(int i);

    abstract boolean F();

    final void method1419(Node_Sub8_Sub2 class248_sub8_sub2, byte i, int i_14_) {
        anInt1899++;
        if (i_14_ != -1) {
            method1427();
            if (!NA())
                method1425();
            else {
                Class362 class362 = (((Node_Sub8_Sub2) class248_sub8_sub2).aClass362Array8919[i_14_]);
                Node_Sub19 class248_sub19 = ((Class362) class362).aClass248_Sub19_4471;
                int i_15_ = 3 % ((-53 - i) / 57);
                for (int i_16_ = 0; i_16_ < ((Class362) class362).anInt4460; i_16_++) {
                    short i_17_ = ((Class362) class362).aShortArray4457[i_16_];
                    if (((Node_Sub19) class248_sub19).aBooleanArray7033[i_17_]) {
                        if ((((Class362) class362).aShortArray4462[i_16_] ^ 0xffffffff) != 0)
                            P(0, 0, 0, 0);
                        P((((Node_Sub19) class248_sub19).anIntArray7043[i_17_]), ((Class362) class362).aShortArray4472[i_16_], ((Class362) class362).aShortArray4467[i_16_], ((Class362) class362).aShortArray4466[i_16_]);
                    }
                }
                wa();
                method1425();
            }
        }
    }

    abstract boolean method1420(int i, int i_18_, Viewport viewport, boolean bool, int i_19_, int i_20_);

    abstract void a(int i);

    abstract int EA();

    final void method1421(int i, Node_Sub8_Sub2 class248_sub8_sub2, boolean bool, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, Node_Sub8_Sub2 class248_sub8_sub2_26_) {
        anInt1900++;
        if (i_23_ != -1) {
            method1427();
            if (!NA())
                method1425();
            else {
                Class362 class362 = (((Node_Sub8_Sub2) class248_sub8_sub2).aClass362Array8919[i_23_]);
                Node_Sub19 class248_sub19 = ((Class362) class362).aClass248_Sub19_4471;
                Class362 class362_27_ = null;
                if (class248_sub8_sub2_26_ != null) {
                    class362_27_ = (((Node_Sub8_Sub2) class248_sub8_sub2_26_).aClass362Array8919[i_21_]);
                    if (((Class362) class362_27_).aClass248_Sub19_4471 != class248_sub19)
                        class362_27_ = null;
                }
                method1444(class248_sub19, bool, i_24_, class362, 65535, i_22_, null, class362_27_, false, null, (byte) 122, i_25_);
                if (i > -24)
                    na();
                wa();
                method1425();
            }
        }
    }

    abstract int da();

    abstract boolean method1422();

    abstract int ma();

    static final void method1423(Class27 class27) {
        Class352.aClass27_4187 = class27;
    }

    abstract void s(int i);

    final void method1424(int i, int i_28_, int i_29_, int i_30_, boolean bool, int i_31_, int i_32_, int i_33_, int[] is, Node_Sub8_Sub2 class248_sub8_sub2, Node_Sub8_Sub2 class248_sub8_sub2_34_) {
        anInt1903++;
        if (i_33_ != (i_31_ ^ 0xffffffff)) {
            method1427();
            if (!NA())
                method1425();
            else {
                Class362 class362 = (((Node_Sub8_Sub2) class248_sub8_sub2_34_).aClass362Array8919[i_31_]);
                Node_Sub19 class248_sub19 = ((Class362) class362).aClass248_Sub19_4471;
                Class362 class362_35_ = null;
                if (class248_sub8_sub2 != null) {
                    class362_35_ = (((Node_Sub8_Sub2) class248_sub8_sub2).aClass362Array8919[i_30_]);
                    if (((Class362) class362_35_).aClass248_Sub19_4471 != class248_sub19)
                        class362_35_ = null;
                }
                method1444(class248_sub19, bool, i, class362, i_32_, i_29_, null, class362_35_, false, is, (byte) 117, i_28_);
                wa();
                method1425();
            }
        }
    }

    abstract void C(int i);

    abstract void method1425();

    abstract void ia(short i, short i_36_);

    abstract void wa();

    abstract Class124[] method1426();

    abstract boolean r();

    abstract void VA(int i);

    abstract void method1427();

    abstract void method1428(Class162 class162_37_, int i, int i_38_, int i_39_, boolean bool);

    final void method1429(s var_s, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
        anInt1896++;
        boolean bool = false;
        boolean bool_47_ = false;
        boolean bool_48_ = false;
        int i_49_ = -i_42_ / 2;
        int i_50_ = -i_46_ / 2;
        int i_51_ = var_s.method3150((byte) 123, i_41_ + i_49_, i_50_ + i_40_);
        int i_52_ = i_42_ / 2;
        int i_53_ = -i_46_ / 2;
        int i_54_ = var_s.method3150((byte) 117, i_52_ + i_41_, i_40_ - -i_53_);
        int i_55_ = -i_42_ / 2;
        int i_56_ = i_46_ / 2;
        int i_57_ = var_s.method3150((byte) 120, i_55_ + i_41_, i_56_ + i_40_);
        int i_58_ = i_42_ / 2;
        int i_59_ = i_46_ / 2;
        int i_60_ = var_s.method3150((byte) 124, i_58_ + i_41_, i_40_ + i_59_);
        int i_61_ = i_54_ <= i_51_ ? i_54_ : i_51_;
        int i_62_ = (i_57_ ^ 0xffffffff) > (i_60_ ^ 0xffffffff) ? i_57_ : i_60_;
        int i_63_ = i_54_ >= i_60_ ? i_60_ : i_54_;
        if ((i_46_ ^ 0xffffffff) != -1) {
            int i_64_ = ((int) (2607.5945876176133 * Math.atan2((double) (i_61_ + -i_62_), (double) i_46_)) & 0x3fff);
            if ((i_64_ ^ 0xffffffff) != -1) {
                if (i != 0) {
                    if (i_64_ <= 8192) {
                        if (i < i_64_)
                            i_64_ = i;
                    } else {
                        int i_65_ = -i + 16384;
                        if (i_64_ < i_65_)
                            i_64_ = i_65_;
                    }
                }
                FA(i_64_);
            }
        }
        int i_66_ = (i_51_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) ? i_57_ : i_51_;
        if (i_42_ != 0) {
            int i_67_ = ((int) (2607.5945876176133 * Math.atan2((double) (-i_63_ + i_66_), (double) i_42_)) & 0x3fff);
            if (i_67_ != 0) {
                if (i_44_ != 0) {
                    if ((i_67_ ^ 0xffffffff) < -8193) {
                        int i_68_ = -i_44_ + 16384;
                        if (i_67_ < i_68_)
                            i_67_ = i_68_;
                    } else if ((i_44_ ^ 0xffffffff) > (i_67_ ^ 0xffffffff))
                        i_67_ = i_44_;
                }
                VA(i_67_);
            }
        }
        int i_69_ = i_60_ + i_51_;
        if ((i_69_ ^ 0xffffffff) < (i_54_ - -i_57_ ^ 0xffffffff))
            i_69_ = i_57_ + i_54_;
        i_69_ = -i_45_ + (i_69_ >> -1749178847);
        if (i_43_ != i_69_)
            H(0, i_69_, 0);
    }

    private final void method1430(int i, int i_70_, int i_71_, boolean bool, int i_72_, byte i_73_, int[] is, int[] is_74_, int i_75_, int i_76_) {
        if ((i_76_ ^ 0xffffffff) != -2) {
            if (i_76_ == 2) {
                if (i != 0 && (i ^ 0xffffffff) != -2) {
                    if ((i ^ 0xffffffff) == -3) {
                        i_70_ = -i_70_ & 0x3fff;
                        i_71_ = 0x3fff & -i_71_;
                    }
                } else {
                    i_70_ = -i_70_;
                    i_71_ = -i_71_;
                }
            } else if ((i_76_ ^ 0xffffffff) == -4) {
                if ((i ^ 0xffffffff) == -1 || (i ^ 0xffffffff) == -2) {
                    int i_77_ = i_70_;
                    i_70_ = -i_71_;
                    i_71_ = i_77_;
                } else if (i == 3) {
                    int i_78_ = i_70_;
                    i_70_ = i_71_;
                    i_71_ = i_78_;
                } else if ((i ^ 0xffffffff) == -3) {
                    int i_79_ = i_70_;
                    i_70_ = i_71_ & 0x3fff;
                    i_71_ = 0x3fff & -i_79_;
                }
            }
        } else if (i != 0 && i != 1) {
            if (i != 3) {
                if (i == 2) {
                    int i_80_ = i_70_;
                    i_70_ = -i_71_ & 0x3fff;
                    i_71_ = i_80_ & 0x3fff;
                }
            } else {
                int i_81_ = i_70_;
                i_70_ = i_71_;
                i_71_ = i_81_;
            }
        } else {
            int i_82_ = -i_70_;
            i_70_ = i_71_;
            i_71_ = i_82_;
        }
        anInt1905++;
        int i_83_ = 2 / ((i_73_ - -82) / 41);
        if (i_72_ == 65535)
            method1438(i, is_74_, i_70_, i_75_, i_71_, i_76_, bool);
        else
            I(i, is_74_, i_70_, i_75_, i_71_, bool, i_72_, is);
    }

    abstract Class40[] method1431();

    abstract int fa();

    abstract void LA(int i);

    abstract int WA();

    public static void method1432(byte i) {
        aClass171_1904 = null;
        anIntArray1906 = null;
        aClass381_1910 = null;
        if (i <= -52) {
            anIntArray1901 = null;
            aStringArray1909 = null;
        }
    }

    abstract int G();

    abstract int V();

    abstract void method1433(int i, int i_84_, int i_85_, int i_86_);

    abstract boolean NA();

    abstract int na();

    static final boolean method1434(String string, int i, boolean bool, int i_87_) {
        anInt1902++;
        if ((i_87_ ^ 0xffffffff) > -3 || (i_87_ ^ 0xffffffff) < -37)
            throw new IllegalArgumentException("Invalid radix:" + i_87_);
        if (i != 48)
            method1423(null);
        boolean bool_88_ = false;
        boolean bool_89_ = false;
        int i_90_ = 0;
        int i_91_ = string.length();
        for (int i_92_ = 0; (i_92_ ^ 0xffffffff) > (i_91_ ^ 0xffffffff); i_92_++) {
            int i_93_ = string.charAt(i_92_);
            if (i_92_ == 0) {
                if ((i_93_ ^ 0xffffffff) == -46) {
                    bool_88_ = true;
                    continue;
                }
                if (i_93_ == 43 && bool)
                    continue;
            }
            if (i_93_ >= 48 && (i_93_ ^ 0xffffffff) >= -58)
                i_93_ -= 48;
            else if (i_93_ >= 65 && (i_93_ ^ 0xffffffff) >= -91)
                i_93_ -= 55;
            else if ((i_93_ ^ 0xffffffff) <= -98 && (i_93_ ^ 0xffffffff) >= -123)
                i_93_ -= 87;
            else
                return false;
            if ((i_93_ ^ 0xffffffff) <= (i_87_ ^ 0xffffffff))
                return false;
            if (bool_88_)
                i_93_ = -i_93_;
            int i_94_ = i_87_ * i_90_ + i_93_;
            if ((i_94_ / i_87_ ^ 0xffffffff) != (i_90_ ^ 0xffffffff))
                return false;
            bool_89_ = true;
            i_90_ = i_94_;
        }
        return bool_89_;
    }

    abstract int ua();

    abstract void method1435();

    abstract Class162 method1436(byte i, int i_95_, boolean bool);

    abstract void H(int i, int i_96_, int i_97_);

    abstract void aa(short i, short i_98_);

    abstract boolean method1437(int i, int i_99_, Viewport viewport, boolean bool, int i_100_);

    abstract void v();

    abstract void O(int i, int i_101_, int i_102_);

    abstract void k(int i);

    abstract void P(int i, int i_103_, int i_104_, int i_105_);

    abstract void method1438(int i, int[] is, int i_106_, int i_107_, int i_108_, int i_109_, boolean bool);

    abstract void p(int i, int i_110_, s var_s, s var_s_111_, int i_112_, int i_113_, int i_114_);

    static final void method1439(Entity entity, int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_) {
        anInt1897++;
        Node_Sub14_Sub31.method2366(i, i_117_, i_116_, ((Interactable) entity).plane, i_119_, ((Interactable) entity).x, ((Interactable) entity).y, i_115_, i_118_, 0);
    }

    abstract void method1440(Viewport viewport, Class346_Sub9 class346_sub9, int i);

    abstract void I(int i, int[] is, int i_120_, int i_121_, int i_122_, boolean bool, int i_123_, int[] is_124_);

    abstract r ba(r var_r);

    abstract void method1441(Viewport viewport, Class346_Sub9 class346_sub9, int i, int i_125_);

    abstract int HA();

    public Class162() {
        /* empty */
    }

    abstract void method1442(Viewport viewport);

    abstract void method1443(Viewport viewport, int i, boolean bool);

    abstract int RA();

    private final void method1444(Node_Sub19 class248_sub19, boolean bool, int i, Class362 class362, int i_126_, int i_127_, boolean[] bools, Class362 class362_128_, boolean bool_129_, int[] is, byte i_130_, int i_131_) {
        anInt1898++;
        if (class362_128_ == null || i_131_ == 0) {
            for (int i_132_ = 0; ((i_132_ ^ 0xffffffff) > (((Class362) class362).anInt4460 ^ 0xffffffff)); i_132_++) {
                short i_133_ = ((Class362) class362).aShortArray4457[i_132_];
                if (bools == null || !bools[i_133_] == !bool_129_ || ((((Node_Sub19) class248_sub19).anIntArray7043[i_133_]) ^ 0xffffffff) == -1) {
                    short i_134_ = ((Class362) class362).aShortArray4462[i_132_];
                    if (i_134_ != -1)
                        method1430(0, 0, 0, bool, (((Node_Sub19) class248_sub19).anIntArray7041[i_134_]) & i_126_, (byte) 126, is, (((Node_Sub19) class248_sub19).anIntArrayArray7035[i_134_]), 0, i);
                    method1430((((Node_Sub19) class248_sub19).anIntArray7043[i_133_]), ((Class362) class362).aShortArray4472[i_132_], ((Class362) class362).aShortArray4466[i_132_], bool, (((Node_Sub19) class248_sub19).anIntArray7041[i_133_]) & i_126_, (byte) -125, is, (((Node_Sub19) class248_sub19).anIntArrayArray7035[i_133_]), ((Class362) class362).aShortArray4467[i_132_], i);
                }
            }
        } else {
            int i_135_ = 0;
            int i_136_ = 0;
            if (i_130_ < 112)
                V();
            for (int i_137_ = 0; ((Node_Sub19) class248_sub19).anInt7034 > i_137_; i_137_++) {
                boolean bool_138_ = false;
                if (i_135_ < ((Class362) class362).anInt4460 && ((Class362) class362).aShortArray4457[i_135_] == i_137_)
                    bool_138_ = true;
                boolean bool_139_ = false;
                if (((Class362) class362_128_).anInt4460 > i_136_ && (((Class362) class362_128_).aShortArray4457[i_136_] == i_137_))
                    bool_139_ = true;
                if (bool_138_ || bool_139_) {
                    if (bools != null && !bool_129_ == bools[i_137_] && ((((Node_Sub19) class248_sub19).anIntArray7043[i_137_]) ^ 0xffffffff) != -1) {
                        if (bool_139_)
                            i_136_++;
                        if (bool_138_)
                            i_135_++;
                    } else {
                        int i_140_ = 0;
                        int i_141_ = (((Node_Sub19) class248_sub19).anIntArray7043[i_137_]);
                        if (i_141_ == 3 || i_141_ == 10)
                            i_140_ = 128;
                        int i_142_;
                        int i_143_;
                        short i_144_;
                        int i_145_;
                        byte i_146_;
                        if (bool_138_) {
                            i_144_ = (((Class362) class362).aShortArray4462[i_135_]);
                            i_145_ = (((Class362) class362).aShortArray4467[i_135_]);
                            i_146_ = ((Class362) class362).aByteArray4470[i_135_];
                            i_143_ = (((Class362) class362).aShortArray4472[i_135_]);
                            i_142_ = (((Class362) class362).aShortArray4466[i_135_]);
                            i_135_++;
                        } else {
                            i_142_ = i_140_;
                            i_143_ = i_140_;
                            i_144_ = (short) -1;
                            i_145_ = i_140_;
                            i_146_ = (byte) 0;
                        }
                        byte i_147_;
                        short i_148_;
                        int i_149_;
                        int i_150_;
                        int i_151_;
                        if (!bool_139_) {
                            i_149_ = i_140_;
                            i_151_ = i_140_;
                            i_150_ = i_140_;
                            i_148_ = (short) -1;
                            i_147_ = (byte) 0;
                        } else {
                            i_147_ = (((Class362) class362_128_).aByteArray4470[i_136_]);
                            i_148_ = (((Class362) class362_128_).aShortArray4462[i_136_]);
                            i_149_ = (((Class362) class362_128_).aShortArray4467[i_136_]);
                            i_150_ = (((Class362) class362_128_).aShortArray4472[i_136_]);
                            i_151_ = (((Class362) class362_128_).aShortArray4466[i_136_]);
                            i_136_++;
                        }
                        int i_152_;
                        int i_153_;
                        int i_154_;
                        if ((i_146_ & 0x2) == 0 && (i_147_ & 0x1) == 0) {
                            if ((i_141_ ^ 0xffffffff) == -3) {
                                int i_155_ = i_150_ + -i_143_ & 0x3fff;
                                int i_156_ = 0x3fff & i_149_ - i_145_;
                                if ((i_155_ ^ 0xffffffff) <= -8193)
                                    i_155_ -= 16384;
                                int i_157_ = i_151_ + -i_142_ & 0x3fff;
                                if ((i_156_ ^ 0xffffffff) <= -8193)
                                    i_156_ -= 16384;
                                i_154_ = 0x3fff & i_145_ - -(i_156_ * i_131_ / i_127_);
                                if ((i_157_ ^ 0xffffffff) <= -8193)
                                    i_157_ -= 16384;
                                i_153_ = (0x3fff & i_155_ * i_131_ / i_127_ + i_143_);
                                i_152_ = (i_157_ * i_131_ / i_127_ + i_142_ & 0x3fff);
                            } else if (i_141_ == 9) {
                                int i_158_ = i_150_ - i_143_ & 0x3fff;
                                if (i_158_ >= 8192)
                                    i_158_ -= 16384;
                                i_154_ = i_152_ = 0;
                                i_153_ = 0x3fff & i_143_ - -(i_158_ * i_131_ / i_127_);
                            } else if ((i_141_ ^ 0xffffffff) != -8) {
                                i_153_ = i_143_ + (i_131_ * (-i_143_ + i_150_) / i_127_);
                                i_152_ = i_142_ - -(i_131_ * (i_151_ - i_142_) / i_127_);
                                i_154_ = i_145_ - -((-i_145_ + i_149_) * i_131_ / i_127_);
                            } else {
                                int i_159_ = i_150_ + -i_143_ & 0x3f;
                                if (i_159_ >= 32)
                                    i_159_ -= 64;
                                i_154_ = i_145_ - -(i_131_ * (i_149_ - i_145_) / i_127_);
                                i_153_ = 0x3f & i_143_ + i_159_ * i_131_ / i_127_;
                                i_152_ = i_142_ + ((-i_142_ + i_151_) * i_131_ / i_127_);
                            }
                        } else {
                            i_152_ = i_142_;
                            i_153_ = i_143_;
                            i_154_ = i_145_;
                        }
                        if (i_144_ == -1) {
                            if (i_148_ != -1)
                                method1430(0, 0, 0, bool, (((Node_Sub19) class248_sub19).anIntArray7041[i_148_]) & i_126_, (byte) -126, is, (((Node_Sub19) class248_sub19).anIntArrayArray7035[i_148_]), 0, i);
                        } else
                            method1430(0, 0, 0, bool, (((Node_Sub19) class248_sub19).anIntArray7041[i_144_]) & i_126_, (byte) 94, is, (((Node_Sub19) class248_sub19).anIntArrayArray7035[i_144_]), 0, i);
                        method1430(i_141_, i_153_, i_152_, bool, (((Node_Sub19) class248_sub19).anIntArray7041[i_137_]) & i_126_, (byte) 84, is, (((Node_Sub19) class248_sub19).anIntArrayArray7035[i_137_]), i_154_, i);
                    }
                }
            }
        }
    }
}
