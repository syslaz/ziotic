/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

abstract class Class48 {
    static int anInt628;
    static int anInt629;
    static int anInt630;
    static int anInt631;
    static int anInt632;
    static int anInt633;
    static int anInt634;
    static int anInt635;
    static int anInt636;
    private ha aHa637;
    static int anInt638;
    static int anInt639;
    static int anInt640;
    static int anInt641;
    static int anInt642;
    static int anInt643;
    static int anInt644;
    static OutgoingOpcode aOutgoingOpcode_645 = new OutgoingOpcode(56, -1);
    static int anInt646;
    static int anInt647;
    static int anInt648;
    private Class285 aClass285_649;
    static int anInt650;
    static int anInt651;
    static IncommingOpcode aIncommingOpcode_652 = new IncommingOpcode(22, -2);

    final void method354(int i, int i_0_, String string, int i_1_, int i_2_, int i_3_) {
        anInt636++;
        if (string != null) {
            method365(i_2_, i_3_, 115);
            method367(i_1_, true, 0, 0, string, -(aClass285_649.method3068(-1, string) / 2) + i, null, null, null);
            int i_4_ = 63 % ((-45 - i_0_) / 43);
        }
    }

    abstract void fa(char c, int i, int i_5_, int i_6_, boolean bool);

    final void method355(int i, int i_7_, String string, boolean bool, int i_8_, int i_9_, int i_10_) {
        anInt640++;
        if (string != null && bool == false) {
            method365(i_10_, i_8_, 27);
            int i_11_ = string.length();
            int[] is = new int[i_11_];
            for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_12_++)
                is[i_12_] = (int) (Math.sin((double) i_12_ / 2.0 + (double) i / 5.0) * 5.0);
            method358(-(aClass285_649.method3068(-1, string) / 2) + i_7_, is, i_9_, null, string, 19792, null, null);
        }
    }

    final int method356(int[] is, int i, Class129[] class129s, String string, int i_13_, int i_14_, int i_15_, byte i_16_, Random random, int i_17_) {
        anInt651++;
        if (string == null)
            return 0;
        random.setSeed((long) i_15_);
        if (i_16_ != -115)
            return 101;
        int i_18_ = (random.nextInt() & 0x1f) + 192;
        method365(0xffffff & i_13_ | i_18_ << 1092763544, i_18_ << 2069397816 | i_17_ & 0xffffff, 69);
        int i_19_ = string.length();
        int[] is_20_ = new int[i_19_];
        int i_21_ = 0;
        for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_22_++) {
            is_20_[i_22_] = i_21_;
            if ((random.nextInt() & 0x3) == 0)
                i_21_++;
        }
        method358(i, null, i_14_, is, string, 19792, class129s, is_20_);
        return i_21_;
    }

    final int method357(int[] is, Random random, int i, Class129[] class129s, int[] is_23_, int i_24_, int i_25_, int i_26_, int i_27_, String string, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
        anInt648++;
        if (string == null)
            return 0;
        random.setSeed((long) i_26_);
        int i_33_ = (0x1f & random.nextInt()) + 192;
        method365(i_25_ & 0xffffff | i_33_ << -1818596616, 0xffffff & i_31_ | i_33_ << 575107544, 124);
        int i_34_ = string.length();
        int[] is_35_ = new int[i_34_];
        int i_36_ = 0;
        for (int i_37_ = 0; i_37_ < i_34_; i_37_++) {
            is_35_[i_37_] = i_36_;
            if ((0x3 & random.nextInt() ^ 0xffffffff) == -1)
                i_36_++;
        }
        int i_38_ = i;
        int i_39_ = i_28_ + ((Class285) aClass285_649).anInt3370;
        if (i_27_ == 1)
            i_39_ += (-((Class285) aClass285_649).anInt3368 + (-((Class285) aClass285_649).anInt3370 + i_24_)) / 2;
        else if ((i_27_ ^ 0xffffffff) == -3)
            i_39_ = -((Class285) aClass285_649).anInt3368 + (i_24_ + i_28_);
        int i_40_ = -1;
        if (i_32_ == 1) {
            i_40_ = aClass285_649.method3068(-1, string) + i_36_;
            i_38_ += (i_30_ + -i_40_) / 2;
        } else if (i_32_ == 2) {
            i_40_ = aClass285_649.method3068(i_29_ + -31521, string) + i_36_;
            i_38_ += i_30_ - i_40_;
        }
        method358(i_38_, null, i_39_, is, string, i_29_ + -11728, class129s, is_35_);
        if (is_23_ != null) {
            if (i_40_ == -1)
                i_40_ = (aClass285_649.method3068(i_29_ ^ ~0x7b20, string) + i_36_);
            is_23_[0] = i_38_;
            is_23_[2] = i_40_;
            is_23_[1] = -((Class285) aClass285_649).anInt3370 + i_39_;
            is_23_[3] = (((Class285) aClass285_649).anInt3368 + ((Class285) aClass285_649).anInt3370);
        }
        if (i_29_ != 31520)
            return 48;
        return i_36_;
    }

    private final void method358(int i, int[] is, int i_41_, int[] is_42_, String string, int i_43_, Class129[] class129s, int[] is_44_) {
        anInt650++;
        i_41_ -= ((Class285) aClass285_649).anInt3365;
        int i_45_ = -1;
        int i_46_ = -1;
        if (i_43_ != 19792)
            aHa637 = null;
        int i_47_ = 0;
        int i_48_ = string.length();
        for (int i_49_ = 0; (i_48_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
            char c = (char) (Class297_Sub1.method3137(122, string.charAt(i_49_)) & 0xff);
            if (c == 60)
                i_45_ = i_49_;
            else {
                if (c == 62 && (i_45_ ^ 0xffffffff) != 0) {
                    String string_50_ = string.substring(1 + i_45_, i_49_);
                    i_45_ = -1;
                    if (!string_50_.equals("lt")) {
                        if (!string_50_.equals("gt")) {
                            if (string_50_.equals("nbsp"))
                                c = '\u00a0';
                            else if (string_50_.equals("shy"))
                                c = '\u00ad';
                            else if (string_50_.equals("times"))
                                c = '\u00d7';
                            else if (!string_50_.equals("euro")) {
                                if (!string_50_.equals("copy")) {
                                    if (!string_50_.equals("reg")) {
                                        if (string_50_.startsWith("img=")) {
                                            try {
                                                int i_51_;
                                                if (is_44_ == null)
                                                    i_51_ = 0;
                                                else
                                                    i_51_ = is_44_[i_47_];
                                                int i_52_;
                                                if (is == null)
                                                    i_52_ = 0;
                                                else
                                                    i_52_ = is[i_47_];
                                                i_47_++;
                                                int i_53_ = (Class282_Sub21.method3012((byte) -123, string_50_.substring(4)));
                                                Class129 class129 = class129s[i_53_];
                                                int i_54_ = (is_42_ != null ? is_42_[i_53_] : class129.method1181());
                                                class129.method1178(i - -i_51_, (-i_54_ + (i_41_ + ((((Class285) aClass285_649).anInt3365) + i_52_))), 1, 0, 1);
                                                i += class129s[i_53_].method1169();
                                                i_46_ = -1;
                                            } catch (Exception exception) {
                                                /* empty */
                                            }
                                        } else
                                            method373(string_50_, 5);
                                        continue;
                                    }
                                    c = '\u00ae';
                                } else
                                    c = '\u00a9';
                            } else
                                c = '\u20ac';
                        } else
                            c = '>';
                    } else
                        c = '<';
                }
                if ((i_45_ ^ 0xffffffff) == 0) {
                    if (i_46_ != -1)
                        i += aClass285_649.method3067(i_46_, 0, c);
                    int i_55_;
                    if (is_44_ == null)
                        i_55_ = 0;
                    else
                        i_55_ = is_44_[i_47_];
                    int i_56_;
                    if (is == null)
                        i_56_ = 0;
                    else
                        i_56_ = is[i_47_];
                    i_47_++;
                    if (c != 32) {
                        if ((~0xffffff & Class293.anInt3445 ^ 0xffffffff) != -1)
                            fa(c, i_55_ + 1 + i, i_56_ + (1 + i_41_), Class293.anInt3445, true);
                        fa(c, i_55_ + i, i_56_ + i_41_, Class282_Sub16.anInt7756, false);
                    } else if ((Class84_Sub4.anInt5419 ^ 0xffffffff) < -1) {
                        Class85.anInt1048 += Class84_Sub4.anInt5419;
                        i += Class85.anInt1048 >> -1702567448;
                        Class85.anInt1048 &= 0xff;
                    }
                    int i_57_ = aClass285_649.method3075(-100, c);
                    if ((Class376.anInt4944 ^ 0xffffffff) != 0)
                        aHa637.method817(70, (int) ((double) (((Class285) aClass285_649).anInt3365) * 0.7) + i_41_, i_57_, i, Class376.anInt4944);
                    if (aa_Sub2.anInt5259 != -1)
                        aHa637.method817(-115, (((Class285) aClass285_649).anInt3365 + i_41_), i_57_, i, aa_Sub2.anInt5259);
                    i += i_57_;
                    i_46_ = c;
                }
            }
        }
    }

    abstract void method359(char c, int i, int i_58_, int i_59_, boolean bool, aa var_aa, int i_60_, int i_61_);

    final int method360(int i, Class129[] class129s, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int[] is, int i_68_, int i_69_, aa var_aa, int i_70_, int i_71_, int i_72_, int i_73_, String string) {
        anInt638++;
        if (string == null)
            return 0;
        method365(i_71_, i_65_, 114);
        if ((i_73_ ^ 0xffffffff) == -1)
            i_73_ = ((Class285) aClass285_649).anInt3365;
        int[] is_74_;
        if (i_67_ >= (((Class285) aClass285_649).anInt3370 + (((Class285) aClass285_649).anInt3368 - -i_73_)) || i_73_ - -i_73_ <= i_67_)
            is_74_ = new int[]{i_68_};
        else
            is_74_ = null;
        if (i == -1) {
            i = i_67_ / i_73_;
            if ((i ^ 0xffffffff) >= -1)
                i = 1;
        }
        int i_75_ = aClass285_649.method3073(string, 174, is_74_, Class10.aStringArray235, class129s);
        if (i > 0 && i_75_ >= i) {
            i_75_ = i;
            Class10.aStringArray235[-1 + i] = aClass285_649.method3072(class129s, Class10.aStringArray235[-1 + i], 0, i_68_);
        }
        if ((i_62_ ^ 0xffffffff) == -4 && i_75_ == 1)
            i_62_ = 1;
        int i_76_;
        if ((i_62_ ^ 0xffffffff) == -1)
            i_76_ = i_64_ - -((Class285) aClass285_649).anInt3370;
        else if ((i_62_ ^ 0xffffffff) == -2)
            i_76_ = (i_64_ - -((Class285) aClass285_649).anInt3370 - -((-((Class285) aClass285_649).anInt3368 + -((Class285) aClass285_649).anInt3370 + (i_67_ - i_73_ * (i_75_ + -1))) / 2));
        else if (i_62_ != 2) {
            int i_77_ = ((-((-1 + i_75_) * i_73_) + i_67_ + (-((Class285) aClass285_649).anInt3370 - ((Class285) aClass285_649).anInt3368)) / (1 + i_75_));
            if (i_77_ < 0)
                i_77_ = 0;
            i_76_ = i_64_ + ((Class285) aClass285_649).anInt3370 + i_77_;
            i_73_ += i_77_;
        } else
            i_76_ = (-(i_73_ * (-1 + i_75_)) + (-((Class285) aClass285_649).anInt3368 + i_64_) - -i_67_);
        int i_78_ = 64 % ((i_72_ - -58) / 33);
        for (int i_79_ = 0; (i_75_ ^ 0xffffffff) < (i_79_ ^ 0xffffffff); i_79_++) {
            if (i_63_ != 0) {
                if ((i_63_ ^ 0xffffffff) == -2)
                    method367(i_76_, true, i_70_, i_69_, Class10.aStringArray235[i_79_], (i_66_ + (-aClass285_649.method3068(-1, (Class10.aStringArray235[i_79_])) + i_68_) / 2), class129s, is, var_aa);
                else if (i_63_ != 2) {
                    if ((i_79_ ^ 0xffffffff) == (-1 + i_75_ ^ 0xffffffff))
                        method367(i_76_, true, i_70_, i_69_, Class10.aStringArray235[i_79_], i_66_, class129s, is, var_aa);
                    else {
                        method364(i_68_, (byte) 126, Class10.aStringArray235[i_79_]);
                        method367(i_76_, true, i_70_, i_69_, Class10.aStringArray235[i_79_], i_66_, class129s, is, var_aa);
                        Class84_Sub4.anInt5419 = 0;
                    }
                } else
                    method367(i_76_, true, i_70_, i_69_, Class10.aStringArray235[i_79_], (i_66_ - (-i_68_ + aClass285_649.method3068(-1, (Class10.aStringArray235[i_79_])))), class129s, is, var_aa);
            } else
                method367(i_76_, true, i_70_, i_69_, Class10.aStringArray235[i_79_], i_66_, class129s, is, var_aa);
            i_76_ += i_73_;
        }
        return i_75_;
    }

    static final void method361(boolean bool, boolean bool_80_, boolean bool_81_) {
        if (bool) {
            Class241.anInt2686++;
            Class311.method3264(true);
        }
        anInt643++;
        if (bool_80_) {
            Class283.anInt3344++;
            Class346_Sub7_Sub5.method3691(-6747);
        }
        if (bool_81_ != true)
            aOutgoingOpcode_645 = null;
    }

    final void method362(int i, int i_82_, String string, int i_83_, int i_84_, int i_85_, int i_86_) {
        anInt628++;
        if (string != null) {
            method365(i_84_, i_82_, 41);
            int i_87_ = string.length();
            if (i_86_ != -1750)
                method365(-5, 47, 4);
            int[] is = new int[i_87_];
            int[] is_88_ = new int[i_87_];
            for (int i_89_ = 0; i_89_ < i_87_; i_89_++) {
                is[i_89_] = (int) (Math.sin((double) i_89_ / 5.0 + (double) i_85_ / 5.0) * 5.0);
                is_88_[i_89_] = (int) (Math.sin((double) i_89_ / 3.0 + (double) i_85_ / 5.0) * 5.0);
            }
            method358(i_83_ - aClass285_649.method3068(-1, string) / 2, is_88_, i, null, string, 19792, null, is);
        }
    }

    static final boolean method363(int i, int i_90_, int i_91_) {
        if (i_90_ != -1)
            return true;
        anInt644++;
        return (Class143.method1296(i, i_90_, i_91_) & Class283.method3054((byte) -105, i_91_, i));
    }

    private final void method364(int i, byte i_92_, String string) {
        anInt647++;
        int i_93_ = 0;
        int i_94_ = 33 / ((i_92_ - 30) / 45);
        boolean bool = false;
        for (int i_95_ = 0; i_95_ < string.length(); i_95_++) {
            int i_96_ = string.charAt(i_95_);
            if ((i_96_ ^ 0xffffffff) != -61) {
                if ((i_96_ ^ 0xffffffff) != -63) {
                    if (!bool && (i_96_ ^ 0xffffffff) == -33)
                        i_93_++;
                } else
                    bool = false;
            } else
                bool = true;
        }
        if (i_93_ > 0)
            Class84_Sub4.anInt5419 = (i + -aClass285_649.method3068(-1, string) << -640363800) / i_93_;
    }

    private final void method365(int i, int i_97_, int i_98_) {
        if (i_98_ < 25)
            aIncommingOpcode_652 = null;
        anInt635++;
        aa_Sub2.anInt5259 = -1;
        Class85.anInt1048 = 0;
        Class282_Sub16.anInt7756 = Node_Sub32.anInt7196 = i;
        if ((i_97_ ^ 0xffffffff) == 0)
            i_97_ = 0;
        Class376.anInt4944 = -1;
        Class84_Sub4.anInt5419 = 0;
        Class293.anInt3445 = Node_Sub8_Sub12.anInt9016 = i_97_;
    }

    static final void method366(int i) {
        Class67.aClass42Array902 = new Class42[50];
        if (i <= -93) {
            Class282_Sub4.anInt7624 = 0;
            anInt629++;
        }
    }

    private final void method367(int i, boolean bool, int i_99_, int i_100_, String string, int i_101_, Class129[] class129s, int[] is, aa var_aa) {
        anInt630++;
        i -= ((Class285) aClass285_649).anInt3365;
        int i_102_ = -1;
        int i_103_ = -1;
        int i_104_ = string.length();
        if (bool != true)
            method358(-41, null, -125, null, null, 80, null, null);
        for (int i_105_ = 0; i_104_ > i_105_; i_105_++) {
            char c = (char) (Class297_Sub1.method3137(107, string.charAt(i_105_)) & 0xff);
            if (c == 60)
                i_102_ = i_105_;
            else {
                if ((c ^ 0xffffffff) == -63 && (i_102_ ^ 0xffffffff) != 0) {
                    String string_106_ = string.substring(i_102_ - -1, i_105_);
                    i_102_ = -1;
                    if (string_106_.equals("lt"))
                        c = '<';
                    else if (string_106_.equals("gt"))
                        c = '>';
                    else if (string_106_.equals("nbsp"))
                        c = '\u00a0';
                    else if (!string_106_.equals("shy")) {
                        if (!string_106_.equals("times")) {
                            if (string_106_.equals("euro"))
                                c = '\u20ac';
                            else if (!string_106_.equals("copy")) {
                                if (!string_106_.equals("reg")) {
                                    if (string_106_.startsWith("img=")) {
                                        try {
                                            int i_107_ = (Class282_Sub21.method3012((byte) -110, string_106_.substring(4)));
                                            Class129 class129 = class129s[i_107_];
                                            int i_108_ = (is == null ? class129.method1181() : is[i_107_]);
                                            if ((Class282_Sub16.anInt7756 & ~0xffffff) == -16777216)
                                                class129.method1178(i_101_, (-i_108_ + (i + (((Class285) aClass285_649).anInt3365))), 1, 0, 1);
                                            else
                                                class129.method1178(i_101_, (((Class285) aClass285_649).anInt3365 + i - i_108_), 0, (Class282_Sub16.anInt7756 & ~0xffffff) | 0xffffff, 1);
                                            i_101_ += class129s[i_107_].method1169();
                                            i_103_ = -1;
                                        } catch (Exception exception) {
                                            /* empty */
                                        }
                                    } else
                                        method373(string_106_, 5);
                                    continue;
                                }
                                c = '\u00ae';
                            } else
                                c = '\u00a9';
                        } else
                            c = '\u00d7';
                    } else
                        c = '\u00ad';
                }
                if ((i_102_ ^ 0xffffffff) == 0) {
                    if (i_103_ != -1)
                        i_101_ += aClass285_649.method3067(i_103_, 0, c);
                    if ((c ^ 0xffffffff) == -33) {
                        if ((Class84_Sub4.anInt5419 ^ 0xffffffff) < -1) {
                            Class85.anInt1048 += Class84_Sub4.anInt5419;
                            i_101_ += Class85.anInt1048 >> -571380632;
                            Class85.anInt1048 &= 0xff;
                        }
                    } else if (var_aa != null) {
                        if ((~0xffffff & Class293.anInt3445 ^ 0xffffffff) != -1)
                            method359(c, i_101_ - -1, 1 + i, Class293.anInt3445, true, var_aa, i_99_, i_100_);
                        method359(c, i_101_, i, Class282_Sub16.anInt7756, false, var_aa, i_99_, i_100_);
                    } else {
                        if ((~0xffffff & Class293.anInt3445) != 0)
                            fa(c, i_101_ - -1, i - -1, Class293.anInt3445, true);
                        fa(c, i_101_, i, Class282_Sub16.anInt7756, false);
                    }
                    int i_109_ = aClass285_649.method3075(-116, c);
                    if (Class376.anInt4944 != -1)
                        aHa637.method817(121, i + (int) ((double) (((Class285) aClass285_649).anInt3365) * 0.7), i_109_, i_101_, Class376.anInt4944);
                    if ((aa_Sub2.anInt5259 ^ 0xffffffff) != 0)
                        aHa637.method817(-80, 1 + ((((Class285) aClass285_649).anInt3365) + i), i_109_, i_101_, aa_Sub2.anInt5259);
                    i_103_ = c;
                    i_101_ += i_109_;
                }
            }
        }
    }

    static final void method368(byte i) {
        anInt642++;
        if (i <= 45)
            aOutgoingOpcode_645 = null;
        for (Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method510(true)); class248_sub22 != null; class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method512(false))) {
            if (((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method640(0))
                Class282_Sub4.method2933(8718, (((Node_Sub22) class248_sub22).anInt7080));
            else {
                ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method659(24719);
                try {
                    ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method655((byte) 126);
                } catch (Exception exception) {
                    Class282_Sub14.method2975("TV: " + (((Node_Sub22) class248_sub22).anInt7080), exception, 1);
                    Class282_Sub4.method2933(8718, (((Node_Sub22) class248_sub22).anInt7080));
                }
                if (!((Node_Sub22) class248_sub22).aBoolean7075 && !((Node_Sub22) class248_sub22).aBoolean7078) {
                    Node_Sub2_Sub4 class248_sub2_sub4 = ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method653(-127);
                    if (class248_sub2_sub4 != null) {
                        Node_Sub15_Sub5 class248_sub15_sub5 = class248_sub2_sub4.method2003((byte) 81);
                        if (class248_sub15_sub5 != null) {
                            class248_sub15_sub5.method2500(false, (((Node_Sub22) class248_sub22).anInt7071));
                            Class282_Sub15.aClass248_Sub15_Sub3_7751.method2485(class248_sub15_sub5);
                            ((Node_Sub22) class248_sub22).aBoolean7075 = true;
                        }
                    }
                }
            }
        }
    }

    final void method369(boolean bool, int i, String string, int i_110_, int i_111_, int i_112_) {
        anInt646++;
        if (string != null) {
            method365(i_112_, i_111_, 120);
            method367(i_110_, bool, 0, 0, string, i, null, null, null);
        }
    }

    final int method370(int i, int i_113_, aa var_aa, String string, int i_114_, int[] is, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, Class129[] class129s, int i_121_, int i_122_, int i_123_) {
        anInt641++;
        if (i_119_ != 0)
            method375(-109, 121, -74, 47, 70, 124, null, (byte) -10);
        return method360(0, class129s, i_113_, i_122_, i, i_118_, i_116_, i_117_, is, i_123_, i_114_, var_aa, i_121_, i_115_, -102, i_120_, string);
    }

    public static void method371(int i) {
        aIncommingOpcode_652 = null;
        aOutgoingOpcode_645 = null;
        if (i <= 10)
            method363(-100, 102, -82);
    }

    static final void method372(boolean bool, boolean bool_124_, byte i) {
        if (i != 119)
            method363(-37, 46, 74);
        if (bool) {
            Class241.anInt2686--;
            if ((Class241.anInt2686 ^ 0xffffffff) == -1)
                Node.anIntArray2801 = null;
        }
        if (bool_124_) {
            Class283.anInt3344--;
            if ((Class283.anInt3344 ^ 0xffffffff) == -1)
                Node_Sub14_Sub39.anIntArray9600 = null;
        }
        anInt631++;
    }

    private final void method373(String string, int i) {
        anInt633++;
        try {
            if (!string.startsWith("col=")) {
                if (string.equals("/col"))
                    Class282_Sub16.anInt7756 = (Node_Sub32.anInt7196 & 0xffffff | ~0xffffff & Class282_Sub16.anInt7756);
            } else
                Class282_Sub16.anInt7756 = (~0xffffff & Class282_Sub16.anInt7756 | (Class130.method1201(95, string.substring(4), 16) & 0xffffff));
            if (i != 5)
                aHa637 = null;
            if (!string.startsWith("argb=")) {
                if (string.equals("/argb"))
                    Class282_Sub16.anInt7756 = Node_Sub32.anInt7196;
                else if (!string.startsWith("str=")) {
                    if (string.equals("str"))
                        Class376.anInt4944 = ~0xffffff & Class282_Sub16.anInt7756 | 0x800000;
                    else if (string.equals("/str"))
                        Class376.anInt4944 = -1;
                    else if (!string.startsWith("u=")) {
                        if (!string.equals("u")) {
                            if (!string.equals("/u")) {
                                if (!string.equalsIgnoreCase("shad=-1")) {
                                    if (!string.startsWith("shad=")) {
                                        if (!string.equals("shad")) {
                                            if (string.equals("/shad"))
                                                Class293.anInt3445 = (Node_Sub8_Sub12.anInt9016);
                                            else if (string.equals("br"))
                                                method365((Node_Sub32.anInt7196), (Node_Sub8_Sub12.anInt9016), 95);
                                        } else
                                            Class293.anInt3445 = (~0xffffff & Class282_Sub16.anInt7756);
                                    } else
                                        Class293.anInt3445 = ((~0xffffff & Class282_Sub16.anInt7756) | (Class130.method1201(121, string.substring(5), 16)));
                                } else
                                    Class293.anInt3445 = 0;
                            } else
                                aa_Sub2.anInt5259 = -1;
                        } else
                            aa_Sub2.anInt5259 = ~0xffffff & Class282_Sub16.anInt7756;
                    } else
                        aa_Sub2.anInt5259 = (~0xffffff & Class282_Sub16.anInt7756 | Class130.method1201(i ^ 0x5f, string.substring(2), 16));
                } else
                    Class376.anInt4944 = (~0xffffff & Class282_Sub16.anInt7756 | Class130.method1201(112, string.substring(4), 16));
            } else
                Class282_Sub16.anInt7756 = Class130.method1201(101, string.substring(5), 16);
        } catch (Exception exception) {
            /* empty */
        }
    }

    Class48(ha var_ha, Class285 class285) {
        aClass285_649 = class285;
        aHa637 = var_ha;
    }

    final void method374(int[] is, int i, boolean bool, String string, int i_125_, int i_126_, int i_127_, Class129[] class129s) {
        anInt632++;
        if (string != null && bool == false) {
            method365(i, i_125_, 124);
            method367(i_127_, !bool, 0, 0, string, i_126_, class129s, is, null);
        }
    }

    final void method375(int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, String string, byte i_133_) {
        anInt639++;
        if (string != null) {
            method365(i_128_, i_130_, 27);
            double d = -((double) i_131_ / 8.0) + 7.0;
            if (d < 0.0)
                d = 0.0;
            int i_134_ = string.length();
            int[] is = new int[i_134_];
            if (i_133_ != -40)
                aOutgoingOpcode_645 = null;
            for (int i_135_ = 0; i_134_ > i_135_; i_135_++)
                is[i_135_] = (int) (d * Math.sin((double) i_129_ + (double) i_135_ / 1.5));
            method358(-(aClass285_649.method3068(-1, string) / 2) + i, is, i_132_, null, string, 19792, null, null);
        }
    }

    final void method376(int i, int i_136_, int i_137_, byte i_138_, int i_139_, String string) {
        anInt634++;
        if (i_138_ != -108)
            aClass285_649 = null;
        if (string != null) {
            method365(i, i_137_, 101);
            method367(i_139_, true, 0, 0, string, i_136_ + -aClass285_649.method3068(i_138_ + 107, string), null, null, null);
        }
    }
}
