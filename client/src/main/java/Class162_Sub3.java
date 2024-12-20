/* Class162_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class162_Sub3 extends Class162 {
    private short aShort6559;
    private short aShort6560;
    private int anInt6561 = 0;
    private Class244 aClass244_6562;
    private int[] anIntArray6563;
    private int anInt6564;
    private Class162_Sub3 aClass162_Sub3_6565;
    private Class40[] aClass40Array6566;
    private int anInt6567;
    private Class203 aClass203_6568;
    private int[] anIntArray6569;
    private short aShort6570;
    private Class220[] aClass220Array6571;
    private Class124[] aClass124Array6572;
    private int[] anIntArray6573;
    private short[] aShortArray6574;
    private short aShort6575;
    private boolean aBoolean6576;
    private int[] anIntArray6577;
    private int[] anIntArray6578;
    private short[] aShortArray6579;
    private boolean aBoolean6580 = false;
    private Class162_Sub3 aClass162_Sub3_6581;
    private int[] anIntArray6582;
    private short aShort6583;
    private float[][] aFloatArrayArray6584;
    private short[] aShortArray6585;
    private int anInt6586;
    private int[] anIntArray6587;
    private int[] anIntArray6588;
    private byte[] aByteArray6589;
    private short[] aShortArray6590;
    private Class162_Sub3 aClass162_Sub3_6591;
    private boolean aBoolean6592 = false;
    private int[] anIntArray6593;
    private short aShort6594;
    private int[] anIntArray6595;
    private ha_Sub1 aHa_Sub1_6596;
    private short[] aShortArray6597;
    private int[] anIntArray6598;
    private short[] aShortArray6599;
    private int anInt6600;
    private boolean aBoolean6601;
    private Class274[] aClass274Array6602;
    private Class220[] aClass220Array6603;
    private float[][] aFloatArrayArray6604;
    private byte[] aByteArray6605;
    private byte[] aByteArray6606;
    private Class162_Sub3 aClass162_Sub3_6607;
    private int anInt6608;
    private Class203 aClass203_6609;
    private int anInt6610;
    private Class238_Sub1 aClass238_Sub1_6611;
    private int[] anIntArray6612;
    private short aShort6613;
    private Class162_Sub3 aClass162_Sub3_6614;
    private Class162_Sub3 aClass162_Sub3_6615;
    private int[] anIntArray6616;
    static int anInt6617;
    private Class375[] aClass375Array6618;
    private int anInt6619 = 0;
    static int anInt6620 = 4096;
    private int[][] anIntArrayArray6621;
    private Class162_Sub3 aClass162_Sub3_6622;
    private Class162_Sub3 aClass162_Sub3_6623;
    private boolean aBoolean6624;
    private int[] anIntArray6625;
    private static int anInt6626;
    private int anInt6627;
    private int anInt6628;
    private short[] aShortArray6629;
    private int[] anIntArray6630;
    private short[] aShortArray6631;
    private int[] anIntArray6632;
    private int[] anIntArray6633;
    private short aShort6634;
    private int[][] anIntArrayArray6635;
    private int[] anIntArray6636;
    private Class162_Sub3 aClass162_Sub3_6637;
    private int[] anIntArray6638;
    private boolean aBoolean6639;
    private int[] anIntArray6640;
    private int[][] anIntArrayArray6641;
    private int[] anIntArray6642;
    private int[] anIntArray6643;
    private int anInt6644;
    private int[] anIntArray6645;
    private boolean aBoolean6646;
    private Class268[] aClass268Array6647;
    private Class162_Sub3 aClass162_Sub3_6648;

    final void FA(int i) {
        if ((anInt6600 & 0x6) != 6)
            throw new IllegalStateException();
        int i_0_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_1_ = Node_Sub9_Sub1.anIntArray9109[i];
        synchronized (this) {
            for (int i_2_ = 0; i_2_ < anInt6644; i_2_++) {
                int i_3_ = ((anIntArray6645[i_2_] * i_1_ - anIntArray6612[i_2_] * i_0_) >> 14);
                anIntArray6612[i_2_] = (anIntArray6645[i_2_] * i_0_ + anIntArray6612[i_2_] * i_1_) >> 14;
                anIntArray6645[i_2_] = i_3_;
            }
            method1503();
        }
    }

    final void method1438(int i, int[] is, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool) {
        int i_8_ = is.length;
        if (i == 0) {
            i_4_ <<= 4;
            i_5_ <<= 4;
            i_6_ <<= 4;
            if (!aBoolean6624) {
                for (int i_9_ = 0; i_9_ < anInt6644; i_9_++) {
                    anIntArray6593[i_9_] <<= 4;
                    anIntArray6645[i_9_] <<= 4;
                    anIntArray6612[i_9_] <<= 4;
                }
                aBoolean6624 = true;
            }
            int i_10_ = 0;
            anInt6608 = 0;
            anInt6586 = 0;
            anInt6627 = 0;
            for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
                int i_12_ = is[i_11_];
                if (i_12_ < anIntArrayArray6621.length) {
                    int[] is_13_ = anIntArrayArray6621[i_12_];
                    for (int i_14_ = 0; i_14_ < is_13_.length; i_14_++) {
                        int i_15_ = is_13_[i_14_];
                        anInt6608 += anIntArray6593[i_15_];
                        anInt6586 += anIntArray6645[i_15_];
                        anInt6627 += anIntArray6612[i_15_];
                        i_10_++;
                    }
                }
            }
            if (i_10_ > 0) {
                anInt6608 = anInt6608 / i_10_ + i_4_;
                anInt6586 = anInt6586 / i_10_ + i_5_;
                anInt6627 = anInt6627 / i_10_ + i_6_;
            } else {
                anInt6608 = i_4_;
                anInt6586 = i_5_;
                anInt6627 = i_6_;
            }
        } else if (i == 1) {
            i_4_ <<= 4;
            i_5_ <<= 4;
            i_6_ <<= 4;
            if (!aBoolean6624) {
                for (int i_16_ = 0; i_16_ < anInt6644; i_16_++) {
                    anIntArray6593[i_16_] <<= 4;
                    anIntArray6645[i_16_] <<= 4;
                    anIntArray6612[i_16_] <<= 4;
                }
                aBoolean6624 = true;
            }
            for (int i_17_ = 0; i_17_ < i_8_; i_17_++) {
                int i_18_ = is[i_17_];
                if (i_18_ < anIntArrayArray6621.length) {
                    int[] is_19_ = anIntArrayArray6621[i_18_];
                    for (int i_20_ = 0; i_20_ < is_19_.length; i_20_++) {
                        int i_21_ = is_19_[i_20_];
                        anIntArray6593[i_21_] += i_4_;
                        anIntArray6645[i_21_] += i_5_;
                        anIntArray6612[i_21_] += i_6_;
                    }
                }
            }
        } else if (i == 2) {
            for (int i_22_ = 0; i_22_ < i_8_; i_22_++) {
                int i_23_ = is[i_22_];
                if (i_23_ < anIntArrayArray6621.length) {
                    int[] is_24_ = anIntArrayArray6621[i_23_];
                    if ((i_7_ & 0x1) == 0) {
                        for (int i_25_ = 0; i_25_ < is_24_.length; i_25_++) {
                            int i_26_ = is_24_[i_25_];
                            anIntArray6593[i_26_] -= anInt6608;
                            anIntArray6645[i_26_] -= anInt6586;
                            anIntArray6612[i_26_] -= anInt6627;
                            if (i_6_ != 0) {
                                int i_27_ = Node_Sub9_Sub1.anIntArray9106[i_6_];
                                int i_28_ = Node_Sub9_Sub1.anIntArray9109[i_6_];
                                int i_29_ = ((anIntArray6645[i_26_] * i_27_ + anIntArray6593[i_26_] * i_28_ + 16383) >> 14);
                                anIntArray6645[i_26_] = (anIntArray6645[i_26_] * i_28_ - anIntArray6593[i_26_] * i_27_ + 16383) >> 14;
                                anIntArray6593[i_26_] = i_29_;
                            }
                            if (i_4_ != 0) {
                                int i_30_ = Node_Sub9_Sub1.anIntArray9106[i_4_];
                                int i_31_ = Node_Sub9_Sub1.anIntArray9109[i_4_];
                                int i_32_ = ((anIntArray6645[i_26_] * i_31_ - anIntArray6612[i_26_] * i_30_ + 16383) >> 14);
                                anIntArray6612[i_26_] = (anIntArray6645[i_26_] * i_30_ + anIntArray6612[i_26_] * i_31_ + 16383) >> 14;
                                anIntArray6645[i_26_] = i_32_;
                            }
                            if (i_5_ != 0) {
                                int i_33_ = Node_Sub9_Sub1.anIntArray9106[i_5_];
                                int i_34_ = Node_Sub9_Sub1.anIntArray9109[i_5_];
                                int i_35_ = ((anIntArray6612[i_26_] * i_33_ + anIntArray6593[i_26_] * i_34_ + 16383) >> 14);
                                anIntArray6612[i_26_] = (anIntArray6612[i_26_] * i_34_ - anIntArray6593[i_26_] * i_33_ + 16383) >> 14;
                                anIntArray6593[i_26_] = i_35_;
                            }
                            anIntArray6593[i_26_] += anInt6608;
                            anIntArray6645[i_26_] += anInt6586;
                            anIntArray6612[i_26_] += anInt6627;
                        }
                    } else {
                        for (int i_36_ = 0; i_36_ < is_24_.length; i_36_++) {
                            int i_37_ = is_24_[i_36_];
                            anIntArray6593[i_37_] -= anInt6608;
                            anIntArray6645[i_37_] -= anInt6586;
                            anIntArray6612[i_37_] -= anInt6627;
                            if (i_4_ != 0) {
                                int i_38_ = Node_Sub9_Sub1.anIntArray9106[i_4_];
                                int i_39_ = Node_Sub9_Sub1.anIntArray9109[i_4_];
                                int i_40_ = ((anIntArray6645[i_37_] * i_39_ - anIntArray6612[i_37_] * i_38_ + 16383) >> 14);
                                anIntArray6612[i_37_] = (anIntArray6645[i_37_] * i_38_ + anIntArray6612[i_37_] * i_39_ + 16383) >> 14;
                                anIntArray6645[i_37_] = i_40_;
                            }
                            if (i_6_ != 0) {
                                int i_41_ = Node_Sub9_Sub1.anIntArray9106[i_6_];
                                int i_42_ = Node_Sub9_Sub1.anIntArray9109[i_6_];
                                int i_43_ = ((anIntArray6645[i_37_] * i_41_ + anIntArray6593[i_37_] * i_42_ + 16383) >> 14);
                                anIntArray6645[i_37_] = (anIntArray6645[i_37_] * i_42_ - anIntArray6593[i_37_] * i_41_ + 16383) >> 14;
                                anIntArray6593[i_37_] = i_43_;
                            }
                            if (i_5_ != 0) {
                                int i_44_ = Node_Sub9_Sub1.anIntArray9106[i_5_];
                                int i_45_ = Node_Sub9_Sub1.anIntArray9109[i_5_];
                                int i_46_ = ((anIntArray6612[i_37_] * i_44_ + anIntArray6593[i_37_] * i_45_ + 16383) >> 14);
                                anIntArray6612[i_37_] = (anIntArray6612[i_37_] * i_45_ - anIntArray6593[i_37_] * i_44_ + 16383) >> 14;
                                anIntArray6593[i_37_] = i_46_;
                            }
                            anIntArray6593[i_37_] += anInt6608;
                            anIntArray6645[i_37_] += anInt6586;
                            anIntArray6612[i_37_] += anInt6627;
                        }
                    }
                }
            }
        } else if (i == 3) {
            for (int i_47_ = 0; i_47_ < i_8_; i_47_++) {
                int i_48_ = is[i_47_];
                if (i_48_ < anIntArrayArray6621.length) {
                    int[] is_49_ = anIntArrayArray6621[i_48_];
                    for (int i_50_ = 0; i_50_ < is_49_.length; i_50_++) {
                        int i_51_ = is_49_[i_50_];
                        anIntArray6593[i_51_] -= anInt6608;
                        anIntArray6645[i_51_] -= anInt6586;
                        anIntArray6612[i_51_] -= anInt6627;
                        anIntArray6593[i_51_] = anIntArray6593[i_51_] * i_4_ / 128;
                        anIntArray6645[i_51_] = anIntArray6645[i_51_] * i_5_ / 128;
                        anIntArray6612[i_51_] = anIntArray6612[i_51_] * i_6_ / 128;
                        anIntArray6593[i_51_] += anInt6608;
                        anIntArray6645[i_51_] += anInt6586;
                        anIntArray6612[i_51_] += anInt6627;
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray6635 != null && aByteArray6606 != null) {
                for (int i_52_ = 0; i_52_ < i_8_; i_52_++) {
                    int i_53_ = is[i_52_];
                    if (i_53_ < anIntArrayArray6635.length) {
                        int[] is_54_ = anIntArrayArray6635[i_53_];
                        for (int i_55_ = 0; i_55_ < is_54_.length; i_55_++) {
                            int i_56_ = is_54_[i_55_];
                            int i_57_ = (aByteArray6606[i_56_] & 0xff) + i_4_ * 8;
                            if (i_57_ < 0)
                                i_57_ = 0;
                            else if (i_57_ > 255)
                                i_57_ = 255;
                            aByteArray6606[i_56_] = (byte) i_57_;
                        }
                    }
                }
                if (aClass268Array6647 != null) {
                    for (int i_58_ = 0; i_58_ < anInt6567; i_58_++) {
                        Class268 class268 = aClass268Array6647[i_58_];
                        Class375 class375 = aClass375Array6618[i_58_];
                        ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & 0xffffff | 255 - ((aByteArray6606[((Class268) class268).anInt3117]) & 0xff) << 24);
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray6635 != null) {
                for (int i_59_ = 0; i_59_ < i_8_; i_59_++) {
                    int i_60_ = is[i_59_];
                    if (i_60_ < anIntArrayArray6635.length) {
                        int[] is_61_ = anIntArrayArray6635[i_60_];
                        for (int i_62_ = 0; i_62_ < is_61_.length; i_62_++) {
                            int i_63_ = is_61_[i_62_];
                            int i_64_ = aShortArray6585[i_63_] & 0xffff;
                            int i_65_ = i_64_ >> 10 & 0x3f;
                            int i_66_ = i_64_ >> 7 & 0x7;
                            int i_67_ = i_64_ & 0x7f;
                            i_65_ = i_65_ + i_4_ & 0x3f;
                            i_66_ += i_5_;
                            if (i_66_ < 0)
                                i_66_ = 0;
                            else if (i_66_ > 7)
                                i_66_ = 7;
                            i_67_ += i_6_;
                            if (i_67_ < 0)
                                i_67_ = 0;
                            else if (i_67_ > 127)
                                i_67_ = 127;
                            aShortArray6585[i_63_] = (short) (i_65_ << 10 | i_66_ << 7 | i_67_);
                        }
                        aBoolean6576 = true;
                    }
                }
                if (aClass268Array6647 != null) {
                    for (int i_68_ = 0; i_68_ < anInt6567; i_68_++) {
                        Class268 class268 = aClass268Array6647[i_68_];
                        Class375 class375 = aClass375Array6618[i_68_];
                        ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & ~0xffffff | ((Node.anIntArray2801[Class183.method1615((byte) -104, ((aShortArray6585[(((Class268) class268).anInt3117)]) & 0xffff)) & 0xffff]) & 0xffffff));
                    }
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray6641 != null) {
                for (int i_69_ = 0; i_69_ < i_8_; i_69_++) {
                    int i_70_ = is[i_69_];
                    if (i_70_ < anIntArrayArray6641.length) {
                        int[] is_71_ = anIntArrayArray6641[i_70_];
                        for (int i_72_ = 0; i_72_ < is_71_.length; i_72_++) {
                            Class375 class375 = aClass375Array6618[is_71_[i_72_]];
                            ((Class375) class375).anInt4616 += i_4_;
                            ((Class375) class375).anInt4613 += i_5_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray6641 != null) {
                for (int i_73_ = 0; i_73_ < i_8_; i_73_++) {
                    int i_74_ = is[i_73_];
                    if (i_74_ < anIntArrayArray6641.length) {
                        int[] is_75_ = anIntArrayArray6641[i_74_];
                        for (int i_76_ = 0; i_76_ < is_75_.length; i_76_++) {
                            Class375 class375 = aClass375Array6618[is_75_[i_76_]];
                            ((Class375) class375).anInt4614 = ((Class375) class375).anInt4614 * i_4_ >> 7;
                            ((Class375) class375).anInt4608 = ((Class375) class375).anInt4608 * i_5_ >> 7;
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray6641 != null) {
            for (int i_77_ = 0; i_77_ < i_8_; i_77_++) {
                int i_78_ = is[i_77_];
                if (i_78_ < anIntArrayArray6641.length) {
                    int[] is_79_ = anIntArrayArray6641[i_78_];
                    for (int i_80_ = 0; i_80_ < is_79_.length; i_80_++) {
                        Class375 class375 = aClass375Array6618[is_79_[i_80_]];
                        ((Class375) class375).anInt4610 = ((Class375) class375).anInt4610 + i_4_ & 0x3fff;
                    }
                }
            }
        }
    }

    final boolean NA() {
        if (anIntArrayArray6621 == null)
            return false;
        anInt6608 = 0;
        anInt6586 = 0;
        anInt6627 = 0;
        return true;
    }

    final void a(int i) {
        if ((anInt6600 & 0x5) != 5)
            throw new IllegalStateException();
        if (i == 4096)
            method1509();
        else if (i == 8192)
            method1484();
        else if (i == 12288)
            method1507();
        else {
            int i_81_ = Node_Sub9_Sub1.anIntArray9106[i];
            int i_82_ = Node_Sub9_Sub1.anIntArray9109[i];
            synchronized (this) {
                for (int i_83_ = 0; i_83_ < anInt6644; i_83_++) {
                    int i_84_ = ((anIntArray6612[i_83_] * i_81_ + anIntArray6593[i_83_] * i_82_) >> 14);
                    anIntArray6612[i_83_] = (anIntArray6612[i_83_] * i_82_ - anIntArray6593[i_83_] * i_81_) >> 14;
                    anIntArray6593[i_83_] = i_84_;
                }
                method1503();
            }
        }
    }

    private final void method1480(Thread thread) {
        Class203 class203 = aHa_Sub1_6596.method832(thread);
        if (class203 != aClass203_6609) {
            aClass203_6609 = class203;
            aClass162_Sub3_6607 = ((Class203) aClass203_6609).aClass162_Sub3_2354;
            aClass162_Sub3_6637 = ((Class203) aClass203_6609).aClass162_Sub3_2333;
            aClass162_Sub3_6623 = ((Class203) aClass203_6609).aClass162_Sub3_2319;
            aClass162_Sub3_6614 = ((Class203) aClass203_6609).aClass162_Sub3_2320;
            aClass162_Sub3_6581 = ((Class203) aClass203_6609).aClass162_Sub3_2325;
            aClass162_Sub3_6591 = ((Class203) aClass203_6609).aClass162_Sub3_2353;
            aClass162_Sub3_6648 = ((Class203) aClass203_6609).aClass162_Sub3_2339;
            aClass162_Sub3_6615 = ((Class203) aClass203_6609).aClass162_Sub3_2344;
            aClass162_Sub3_6565 = ((Class203) aClass203_6609).aClass162_Sub3_2332;
            aClass162_Sub3_6622 = ((Class203) aClass203_6609).aClass162_Sub3_2338;
        }
    }

    final int EA() {
        if (!aBoolean6601)
            method1483();
        return aShort6634;
    }

    private final void method1481(int i) {
        short i_85_ = aShortArray6631[i];
        short i_86_ = aShortArray6597[i];
        short i_87_ = aShortArray6590[i];
        if (aShortArray6629 == null || aShortArray6629[i] == -1) {
            if (aByteArray6606 == null)
                ((Class244) aClass244_6562).anInt2718 = 0;
            else
                ((Class244) aClass244_6562).anInt2718 = aByteArray6606[i] & 0xff;
            if (anIntArray6587[i] == -1)
                aClass244_6562.method1949((float) anIntArray6578[i_85_], (float) anIntArray6578[i_86_], (float) anIntArray6578[i_87_], (float) anIntArray6616[i_85_], (float) anIntArray6616[i_86_], (float) anIntArray6616[i_87_], (float) anIntArray6582[i_85_], (float) anIntArray6582[i_86_], (float) anIntArray6582[i_87_], (Node.anIntArray2801[anIntArray6598[i] & 0xffff]));
            else
                aClass244_6562.method1951((float) anIntArray6578[i_85_], (float) anIntArray6578[i_86_], (float) anIntArray6578[i_87_], (float) anIntArray6616[i_85_], (float) anIntArray6616[i_86_], (float) anIntArray6616[i_87_], (float) anIntArray6582[i_85_], (float) anIntArray6582[i_86_], (float) anIntArray6582[i_87_], (float) (anIntArray6598[i] & 0xffff), (float) (anIntArray6630[i] & 0xffff), (float) (anIntArray6587[i] & 0xffff));
        } else {
            int i_88_ = -16777216;
            if (aByteArray6606 != null)
                i_88_ = 255 - (aByteArray6606[i] & 0xff) << 24;
            if (anIntArray6587[i] == -1) {
                int i_89_ = i_88_ | anIntArray6598[i] & 0xffffff;
                aClass244_6562.method1948((float) anIntArray6578[i_85_], (float) anIntArray6578[i_86_], (float) anIntArray6578[i_87_], (float) anIntArray6616[i_85_], (float) anIntArray6616[i_86_], (float) anIntArray6616[i_87_], (float) anIntArray6582[i_85_], (float) anIntArray6582[i_86_], (float) anIntArray6582[i_87_], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_89_, i_89_, i_89_, ((Class203) aClass203_6568).anInt2303, 0, 0, 0, aShortArray6629[i]);
            } else
                aClass244_6562.method1948((float) anIntArray6578[i_85_], (float) anIntArray6578[i_86_], (float) anIntArray6578[i_87_], (float) anIntArray6616[i_85_], (float) anIntArray6616[i_86_], (float) anIntArray6616[i_87_], (float) anIntArray6582[i_85_], (float) anIntArray6582[i_86_], (float) anIntArray6582[i_87_], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_88_ | anIntArray6598[i] & 0xffffff, i_88_ | anIntArray6630[i] & 0xffffff, i_88_ | anIntArray6587[i] & 0xffffff, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
        }
    }

    final Class40[] method1431() {
        return aClass40Array6566;
    }

    private final boolean method1482(int i, int i_90_, Viewport viewport, boolean bool, int i_91_, int i_92_) {
        aClass238_Sub1_6611 = (Class238_Sub1) viewport;
        Class238_Sub1 class238_sub1 = ((ha_Sub1) aHa_Sub1_6596).aClass238_Sub1_5559;
        float f = (((Class238_Sub1) class238_sub1).aFloat6686 + ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6686) + (((Class238_Sub1) class238_sub1).aFloat6680 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + (((Class238_Sub1) class238_sub1).aFloat6683 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6675)));
        float f_93_ = (((Class238_Sub1) class238_sub1).aFloat6677 + ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6686) + (((Class238_Sub1) class238_sub1).aFloat6698 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + (((Class238_Sub1) class238_sub1).aFloat6697 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6675)));
        float f_94_ = (((Class238_Sub1) class238_sub1).aFloat6675 + ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6686) + (((Class238_Sub1) class238_sub1).aFloat6692 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + (((Class238_Sub1) class238_sub1).aFloat6699 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6675)));
        float f_95_ = ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6688) + (((Class238_Sub1) class238_sub1).aFloat6680 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6702) + (((Class238_Sub1) class238_sub1).aFloat6683 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6694));
        float f_96_ = ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680) + (((Class238_Sub1) class238_sub1).aFloat6680 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6698) + (((Class238_Sub1) class238_sub1).aFloat6683 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6692));
        float f_97_ = ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683) + (((Class238_Sub1) class238_sub1).aFloat6680 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6697) + (((Class238_Sub1) class238_sub1).aFloat6683 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6699));
        float f_98_ = ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6688) + (((Class238_Sub1) class238_sub1).aFloat6698 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6702) + (((Class238_Sub1) class238_sub1).aFloat6697 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6694));
        float f_99_ = ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680) + (((Class238_Sub1) class238_sub1).aFloat6698 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6698) + (((Class238_Sub1) class238_sub1).aFloat6697 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6692));
        float f_100_ = ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683) + (((Class238_Sub1) class238_sub1).aFloat6698 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6697) + (((Class238_Sub1) class238_sub1).aFloat6697 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6699));
        float f_101_ = ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6688) + (((Class238_Sub1) class238_sub1).aFloat6692 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6702) + (((Class238_Sub1) class238_sub1).aFloat6699 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6694));
        float f_102_ = ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680) + (((Class238_Sub1) class238_sub1).aFloat6692 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6698) + (((Class238_Sub1) class238_sub1).aFloat6699 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6692));
        float f_103_ = ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683) + (((Class238_Sub1) class238_sub1).aFloat6692 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6697) + (((Class238_Sub1) class238_sub1).aFloat6699 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6699));
        boolean bool_104_ = false;
        int i_105_ = ((ha_Sub1) aHa_Sub1_6596).anInt5579;
        int i_106_ = ((ha_Sub1) aHa_Sub1_6596).anInt5560;
        int i_107_ = ((ha_Sub1) aHa_Sub1_6596).anInt5550;
        int i_108_ = ((ha_Sub1) aHa_Sub1_6596).anInt5574;
        int i_109_ = 2147483647;
        int i_110_ = -2147483648;
        int i_111_ = 2147483647;
        int i_112_ = -2147483648;
        method1498(Thread.currentThread());
        if (!aBoolean6601)
            method1483();
        int i_113_ = aShort6560 - aShort6613 >> 1;
        int i_114_ = aShort6634 - aShort6575 >> 1;
        int i_115_ = aShort6559 - aShort6594 >> 1;
        int i_116_ = aShort6613 + i_113_;
        int i_117_ = aShort6575 + i_114_;
        int i_118_ = aShort6594 + i_115_;
        int i_119_ = i_116_ - (i_113_ << i_91_);
        int i_120_ = i_117_ - (i_114_ << i_91_);
        int i_121_ = i_118_ - (i_115_ << i_91_);
        int i_122_ = i_116_ + (i_113_ << i_91_);
        int i_123_ = i_117_ + (i_114_ << i_91_);
        int i_124_ = i_118_ + (i_115_ << i_91_);
        anIntArray6643[0] = i_119_;
        anIntArray6595[0] = i_120_;
        anIntArray6642[0] = i_121_;
        anIntArray6643[1] = i_122_;
        anIntArray6595[1] = i_120_;
        anIntArray6642[1] = i_121_;
        anIntArray6643[2] = i_119_;
        anIntArray6595[2] = i_123_;
        anIntArray6642[2] = i_121_;
        anIntArray6643[3] = i_122_;
        anIntArray6595[3] = i_123_;
        anIntArray6642[3] = i_121_;
        anIntArray6643[4] = i_119_;
        anIntArray6595[4] = i_120_;
        anIntArray6642[4] = i_124_;
        anIntArray6643[5] = i_122_;
        anIntArray6595[5] = i_120_;
        anIntArray6642[5] = i_124_;
        anIntArray6643[6] = i_119_;
        anIntArray6595[6] = i_123_;
        anIntArray6642[6] = i_124_;
        anIntArray6643[7] = i_122_;
        anIntArray6595[7] = i_123_;
        anIntArray6642[7] = i_124_;
        for (int i_125_ = 0; i_125_ < 8; i_125_++) {
            int i_126_ = anIntArray6643[i_125_];
            int i_127_ = anIntArray6595[i_125_];
            int i_128_ = anIntArray6642[i_125_];
            float f_129_ = f + (f_95_ * (float) i_126_ + f_96_ * (float) i_127_ + f_97_ * (float) i_128_);
            float f_130_ = f_93_ + (f_98_ * (float) i_126_ + f_99_ * (float) i_127_ + f_100_ * (float) i_128_);
            float f_131_ = f_94_ + (f_101_ * (float) i_126_ + f_102_ * (float) i_127_ + f_103_ * (float) i_128_);
            if (f_131_ >= (float) ((ha_Sub1) aHa_Sub1_6596).anInt5568) {
                if (i_92_ > 0)
                    f_131_ = (float) i_92_;
                int i_132_ = i_105_ + (int) (f_129_ * (float) i_107_ / f_131_);
                int i_133_ = i_106_ + (int) (f_130_ * (float) i_108_ / f_131_);
                if (i_132_ < i_109_)
                    i_109_ = i_132_;
                if (i_132_ > i_110_)
                    i_110_ = i_132_;
                if (i_133_ < i_111_)
                    i_111_ = i_133_;
                if (i_133_ > i_112_)
                    i_112_ = i_133_;
                bool_104_ = true;
            }
        }
        if (bool_104_ && i > i_109_ && i < i_110_ && i_90_ > i_111_ && i_90_ < i_112_) {
            if (bool)
                return true;
            for (int i_134_ = 0; i_134_ < anInt6644; i_134_++) {
                int i_135_ = anIntArray6593[i_134_];
                int i_136_ = anIntArray6645[i_134_];
                int i_137_ = anIntArray6612[i_134_];
                float f_138_ = f + (f_95_ * (float) i_135_ + f_96_ * (float) i_136_ + f_97_ * (float) i_137_);
                float f_139_ = f_93_ + (f_98_ * (float) i_135_ + f_99_ * (float) i_136_ + f_100_ * (float) i_137_);
                float f_140_ = f_94_ + (f_101_ * (float) i_135_ + f_102_ * (float) i_136_ + f_103_ * (float) i_137_);
                if (f_140_ >= (float) ((ha_Sub1) aHa_Sub1_6596).anInt5568) {
                    if (i_92_ > 0)
                        f_140_ = (float) i_92_;
                    anIntArray6616[i_134_] = i_105_ + (int) (f_138_ * (float) i_107_ / f_140_);
                    anIntArray6578[i_134_] = i_106_ + (int) (f_139_ * (float) i_108_ / f_140_);
                } else
                    anIntArray6616[i_134_] = -999999;
            }
            for (int i_141_ = 0; i_141_ < anInt6610; i_141_++) {
                if (anIntArray6616[aShortArray6631[i_141_]] != -999999 && anIntArray6616[aShortArray6597[i_141_]] != -999999 && anIntArray6616[aShortArray6590[i_141_]] != -999999 && method1494(i, i_90_, anIntArray6578[aShortArray6631[i_141_]], anIntArray6578[aShortArray6597[i_141_]], anIntArray6578[aShortArray6590[i_141_]], anIntArray6616[aShortArray6631[i_141_]], anIntArray6616[aShortArray6597[i_141_]], anIntArray6616[aShortArray6590[i_141_]]))
                    return true;
            }
        }
        return false;
    }

    final void aa(short i, short i_142_) {
        if (aShortArray6629 != null) {
            if (!aBoolean6580 && i_142_ >= 0) {
                Class312 class312 = ((ha) aHa_Sub1_6596).aD1414.method25(i_142_ & 0xffff, (byte) 125);
                if (((Class312) class312).aByte3643 != 0 || ((Class312) class312).aByte3642 != 0)
                    aBoolean6580 = true;
            }
            for (int i_143_ = 0; i_143_ < anInt6610; i_143_++) {
                if (aShortArray6629[i_143_] == i)
                    aShortArray6629[i_143_] = i_142_;
            }
        }
    }

    private final void method1483() {
        if (!aBoolean6601) {
            int i = 0;
            int i_144_ = 0;
            int i_145_ = 32767;
            int i_146_ = 32767;
            int i_147_ = 32767;
            int i_148_ = -32768;
            int i_149_ = -32768;
            int i_150_ = -32768;
            for (int i_151_ = 0; i_151_ < anInt6619; i_151_++) {
                int i_152_ = anIntArray6593[i_151_];
                int i_153_ = anIntArray6645[i_151_];
                int i_154_ = anIntArray6612[i_151_];
                if (i_152_ < i_145_)
                    i_145_ = i_152_;
                if (i_152_ > i_148_)
                    i_148_ = i_152_;
                if (i_153_ < i_146_)
                    i_146_ = i_153_;
                if (i_153_ > i_149_)
                    i_149_ = i_153_;
                if (i_154_ < i_147_)
                    i_147_ = i_154_;
                if (i_154_ > i_150_)
                    i_150_ = i_154_;
                int i_155_ = i_152_ * i_152_ + i_154_ * i_154_;
                if (i_155_ > i)
                    i = i_155_;
                i_155_ += i_153_ * i_153_;
                if (i_155_ > i_144_)
                    i_144_ = i_155_;
            }
            aShort6613 = (short) i_145_;
            aShort6560 = (short) i_148_;
            aShort6575 = (short) i_146_;
            aShort6634 = (short) i_149_;
            aShort6594 = (short) i_147_;
            aShort6559 = (short) i_150_;
            aShort6583 = (short) (int) (Math.sqrt((double) i) + 0.99);
            aShort6570 = (short) (int) (Math.sqrt((double) i_144_) + 0.99);
            aBoolean6601 = true;
        }
    }

    final r ba(r var_r) {
        return null;
    }

    final void method1440(Viewport viewport, Class346_Sub9 class346_sub9, int i) {
        method1485(viewport, class346_sub9, -1, i);
    }

    final void LA(int i) {
        if ((anInt6600 & 0x2000) != 8192)
            throw new IllegalStateException();
        anInt6628 = i;
        anInt6561 = 0;
    }

    final void method1425() {
        if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
            synchronized (this) {
                ((Class162) this).aBoolean1907 = false;
                this.notifyAll();
            }
        }
    }

    final boolean method1437(int i, int i_156_, Viewport viewport, boolean bool, int i_157_) {
        return method1482(i, i_156_, viewport, bool, i_157_, -1);
    }

    final boolean F() {
        return aBoolean6592;
    }

    final void method1441(Viewport viewport, Class346_Sub9 class346_sub9, int i, int i_158_) {
        method1485(viewport, class346_sub9, i, i_158_);
    }

    private final void method1484() {
        synchronized (this) {
            for (int i = 0; i < anInt6644; i++) {
                anIntArray6593[i] = -anIntArray6593[i];
                anIntArray6612[i] = -anIntArray6612[i];
            }
            method1503();
        }
    }

    private final void method1485(Viewport viewport, Class346_Sub9 class346_sub9, int i, int i_159_) {
        if (anInt6619 >= 1) {
            aClass238_Sub1_6611 = (Class238_Sub1) viewport;
            Class238_Sub1 class238_sub1 = ((ha_Sub1) aHa_Sub1_6596).aClass238_Sub1_5559;
            if (!aBoolean6601)
                method1483();
            boolean bool = false;
            if (((Class238_Sub1) aClass238_Sub1_6611).aFloat6688 == 16384.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680 == 0.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683 == 0.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6702 == 0.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6698 == 16384.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6697 == 0.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6694 == 0.0F && ((Class238_Sub1) aClass238_Sub1_6611).aFloat6692 == 0.0F && (((Class238_Sub1) aClass238_Sub1_6611).aFloat6699 == 16384.0F))
                bool = true;
            float f = (((Class238_Sub1) class238_sub1).aFloat6675 + (((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6686) + (((Class238_Sub1) class238_sub1).aFloat6692 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + (((Class238_Sub1) class238_sub1).aFloat6699 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6675));
            float f_160_ = (bool ? ((Class238_Sub1) class238_sub1).aFloat6692 : ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680) + (((Class238_Sub1) class238_sub1).aFloat6692 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6698) + (((Class238_Sub1) class238_sub1).aFloat6699 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6692)));
            int i_161_ = (int) (f + (float) aShort6575 * f_160_);
            int i_162_ = (int) (f + (float) aShort6634 * f_160_);
            int i_163_;
            int i_164_;
            if (i_161_ > i_162_) {
                i_163_ = i_162_ - aShort6583;
                i_164_ = i_161_ + aShort6583;
            } else {
                i_163_ = i_161_ - aShort6583;
                i_164_ = i_162_ + aShort6583;
            }
            if (i_163_ < ((ha_Sub1) aHa_Sub1_6596).anInt5547 && i_164_ > ((ha_Sub1) aHa_Sub1_6596).anInt5568) {
                float f_165_ = (((Class238_Sub1) class238_sub1).aFloat6686 + (((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6686) + (((Class238_Sub1) class238_sub1).aFloat6680 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + (((Class238_Sub1) class238_sub1).aFloat6683 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6675));
                float f_166_ = (bool ? ((Class238_Sub1) class238_sub1).aFloat6680 : ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680) + (((Class238_Sub1) class238_sub1).aFloat6680 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6698)) + (((Class238_Sub1) class238_sub1).aFloat6683 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6692))));
                int i_167_ = (int) (f_165_ + (float) aShort6575 * f_166_);
                int i_168_ = (int) (f_165_ + (float) aShort6634 * f_166_);
                int i_169_;
                int i_170_;
                if (i_167_ > i_168_) {
                    i_169_ = ((i_168_ - aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5550);
                    i_170_ = ((i_167_ + aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5550);
                } else {
                    i_169_ = ((i_167_ - aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5550);
                    i_170_ = ((i_168_ + aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5550);
                }
                if (i == -1) {
                    if (i_169_ / i_164_ >= ((ha_Sub1) aHa_Sub1_6596).anInt5573 || (i_170_ / i_164_ <= ((ha_Sub1) aHa_Sub1_6596).anInt5557))
                        return;
                } else if (i_169_ / i >= ((ha_Sub1) aHa_Sub1_6596).anInt5573 || (i_170_ / i <= ((ha_Sub1) aHa_Sub1_6596).anInt5557))
                    return;
                float f_171_ = (((Class238_Sub1) class238_sub1).aFloat6677 + (((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6686) + (((Class238_Sub1) class238_sub1).aFloat6698 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + (((Class238_Sub1) class238_sub1).aFloat6697 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6675));
                float f_172_ = (bool ? ((Class238_Sub1) class238_sub1).aFloat6698 : ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6680) + (((Class238_Sub1) class238_sub1).aFloat6698 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6698)) + (((Class238_Sub1) class238_sub1).aFloat6697 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6692))));
                int i_173_ = (int) (f_171_ + (float) aShort6575 * f_172_);
                int i_174_ = (int) (f_171_ + (float) aShort6634 * f_172_);
                int i_175_;
                int i_176_;
                if (i_173_ > i_174_) {
                    i_175_ = ((i_174_ - aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5574);
                    i_176_ = ((i_173_ + aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5574);
                } else {
                    i_175_ = ((i_173_ - aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5574);
                    i_176_ = ((i_174_ + aShort6583) * ((ha_Sub1) aHa_Sub1_6596).anInt5574);
                }
                if (i == -1) {
                    if (i_175_ / i_164_ >= ((ha_Sub1) aHa_Sub1_6596).anInt5580 || (i_176_ / i_164_ <= ((ha_Sub1) aHa_Sub1_6596).anInt5570))
                        return;
                } else if (i_175_ / i >= ((ha_Sub1) aHa_Sub1_6596).anInt5580 || (i_176_ / i <= ((ha_Sub1) aHa_Sub1_6596).anInt5570))
                    return;
                float f_177_;
                float f_178_;
                float f_179_;
                float f_180_;
                float f_181_;
                float f_182_;
                if (bool) {
                    f_177_ = ((Class238_Sub1) class238_sub1).aFloat6688;
                    f_178_ = ((Class238_Sub1) class238_sub1).aFloat6702;
                    f_179_ = ((Class238_Sub1) class238_sub1).aFloat6694;
                    f_180_ = ((Class238_Sub1) class238_sub1).aFloat6683;
                    f_181_ = ((Class238_Sub1) class238_sub1).aFloat6697;
                    f_182_ = ((Class238_Sub1) class238_sub1).aFloat6699;
                } else {
                    f_177_ = ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6688) + (((Class238_Sub1) class238_sub1).aFloat6680 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6702)) + (((Class238_Sub1) class238_sub1).aFloat6683 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6694)));
                    f_178_ = ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6688) + (((Class238_Sub1) class238_sub1).aFloat6698 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6702)) + (((Class238_Sub1) class238_sub1).aFloat6697 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6694)));
                    f_179_ = ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6688) + (((Class238_Sub1) class238_sub1).aFloat6692 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6702)) + (((Class238_Sub1) class238_sub1).aFloat6699 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6694)));
                    f_180_ = ((((Class238_Sub1) class238_sub1).aFloat6688 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683) + (((Class238_Sub1) class238_sub1).aFloat6680 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6697)) + (((Class238_Sub1) class238_sub1).aFloat6683 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6699)));
                    f_181_ = ((((Class238_Sub1) class238_sub1).aFloat6702 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683) + (((Class238_Sub1) class238_sub1).aFloat6698 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6697)) + (((Class238_Sub1) class238_sub1).aFloat6697 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6699)));
                    f_182_ = ((((Class238_Sub1) class238_sub1).aFloat6694 * ((Class238_Sub1) aClass238_Sub1_6611).aFloat6683) + (((Class238_Sub1) class238_sub1).aFloat6692 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6697)) + (((Class238_Sub1) class238_sub1).aFloat6699 * (((Class238_Sub1) aClass238_Sub1_6611).aFloat6699)));
                }
                if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
                    synchronized (this) {
                        while (aBoolean6639) {
                            try {
                                this.wait();
                            } catch (InterruptedException interruptedexception) {
                                /* empty */
                            }
                        }
                        aBoolean6639 = true;
                    }
                }
                method1498(Thread.currentThread());
                if ((i_159_ & 0x2) != 0)
                    aClass244_6562.method1944(true);
                else
                    aClass244_6562.method1944(false);
                boolean bool_183_ = false;
                boolean bool_184_ = i_163_ <= ((ha_Sub1) aHa_Sub1_6596).anInt5568;
                boolean bool_185_ = (bool_184_ || aClass40Array6566 != null || aClass124Array6572 != null);
                ((Class203) aClass203_6568).anInt2323 = ((Class244) aClass244_6562).anInt2713;
                ((Class203) aClass203_6568).anInt2347 = ((Class244) aClass244_6562).anInt2712;
                ((Class203) aClass203_6568).anInt2346 = ((Class244) aClass244_6562).anInt2715;
                int i_186_ = ((ha_Sub1) aHa_Sub1_6596).anInt5550;
                int i_187_ = ((ha_Sub1) aHa_Sub1_6596).anInt5574;
                int i_188_ = ((ha_Sub1) aHa_Sub1_6596).anInt5568;
                if (i == -1) {
                    for (int i_189_ = 0; i_189_ < anInt6644; i_189_++) {
                        int i_190_ = anIntArray6593[i_189_];
                        int i_191_ = anIntArray6645[i_189_];
                        int i_192_ = anIntArray6612[i_189_];
                        float f_193_ = (f_165_ + f_177_ * (float) i_190_ + f_166_ * (float) i_191_ + f_180_ * (float) i_192_);
                        float f_194_ = (f_171_ + f_178_ * (float) i_190_ + f_172_ * (float) i_191_ + f_181_ * (float) i_192_);
                        float f_195_ = (f + f_179_ * (float) i_190_ + f_160_ * (float) i_191_ + f_182_ * (float) i_192_);
                        anIntArray6582[i_189_] = (int) f_195_;
                        if (f_195_ >= (float) i_188_) {
                            anIntArray6616[i_189_] = (((Class203) aClass203_6568).anInt2347 + (int) (f_193_ * (float) i_186_ / f_195_));
                            anIntArray6578[i_189_] = (((Class203) aClass203_6568).anInt2346 + (int) (f_194_ * (float) i_187_ / f_195_));
                        } else {
                            anIntArray6616[i_189_] = -5000;
                            bool_183_ = true;
                        }
                        if (bool_185_) {
                            anIntArray6633[i_189_] = (int) f_193_;
                            anIntArray6632[i_189_] = (int) f_194_;
                            anIntArray6625[i_189_] = (int) f_195_;
                        }
                        if (((Class203) aClass203_6568).aBoolean2310)
                            anIntArray6563[i_189_] = (int) ((((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + ((((Class238_Sub1) aClass238_Sub1_6611).aFloat6702 * (float) i_190_) + (((Class238_Sub1) aClass238_Sub1_6611).aFloat6698 * (float) i_191_) + (((Class238_Sub1) aClass238_Sub1_6611).aFloat6697 * (float) i_192_)));
                    }
                    if (aClass268Array6647 != null) {
                        for (int i_196_ = 0; i_196_ < anInt6567; i_196_++) {
                            Class268 class268 = aClass268Array6647[i_196_];
                            Class375 class375 = aClass375Array6618[i_196_];
                            short i_197_ = (aShortArray6631[((Class268) class268).anInt3117]);
                            short i_198_ = (aShortArray6597[((Class268) class268).anInt3117]);
                            short i_199_ = (aShortArray6590[((Class268) class268).anInt3117]);
                            int i_200_ = ((anIntArray6593[i_197_] + anIntArray6593[i_198_] + anIntArray6593[i_199_]) / 3);
                            int i_201_ = ((anIntArray6645[i_197_] + anIntArray6645[i_198_] + anIntArray6645[i_199_]) / 3);
                            int i_202_ = ((anIntArray6612[i_197_] + anIntArray6612[i_198_] + anIntArray6612[i_199_]) / 3);
                            float f_203_ = ((float) ((Class375) class375).anInt4616 + (f_165_ + f_177_ * (float) i_200_ + f_166_ * (float) i_201_ + f_180_ * (float) i_202_));
                            float f_204_ = ((float) ((Class375) class375).anInt4613 + (f_171_ + f_178_ * (float) i_200_ + f_172_ * (float) i_201_ + f_181_ * (float) i_202_));
                            float f_205_ = (f + f_179_ * (float) i_200_ + f_160_ * (float) i_201_ + f_182_ * (float) i_202_);
                            if (f_205_ > (float) (((ha_Sub1) aHa_Sub1_6596).anInt5568)) {
                                ((Class375) class375).anInt4611 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + (int) (f_203_ * (float) i_186_ / f_205_));
                                ((Class375) class375).anInt4599 = (((ha_Sub1) aHa_Sub1_6596).anInt5560 + (int) (f_204_ * (float) i_187_ / f_205_));
                                ((Class375) class375).anInt4598 = ((int) f_205_ - ((Class268) class268).anInt3118);
                                ((Class375) class375).anInt4602 = (int) ((float) ((((Class375) class375).anInt4614) * (((Class268) class268).aShort3125) * i_186_) / (f_205_ * 128.0F));
                                ((Class375) class375).anInt4609 = (int) ((float) ((((Class375) class375).anInt4608) * (((Class268) class268).aShort3123) * i_187_) / (f_205_ * 128.0F));
                            } else
                                ((Class375) class375).anInt4602 = ((Class375) class375).anInt4609 = 0;
                        }
                    }
                } else {
                    for (int i_206_ = 0; i_206_ < anInt6644; i_206_++) {
                        int i_207_ = anIntArray6593[i_206_];
                        int i_208_ = anIntArray6645[i_206_];
                        int i_209_ = anIntArray6612[i_206_];
                        float f_210_ = (f_165_ + f_177_ * (float) i_207_ + f_166_ * (float) i_208_ + f_180_ * (float) i_209_);
                        float f_211_ = (f_171_ + f_178_ * (float) i_207_ + f_172_ * (float) i_208_ + f_181_ * (float) i_209_);
                        float f_212_ = (f + f_179_ * (float) i_207_ + f_160_ * (float) i_208_ + f_182_ * (float) i_209_);
                        anIntArray6582[i_206_] = (int) f_212_;
                        anIntArray6616[i_206_] = (((Class203) aClass203_6568).anInt2347 + (int) (f_210_ * (float) i_186_ / (float) i));
                        anIntArray6578[i_206_] = (((Class203) aClass203_6568).anInt2346 + (int) (f_211_ * (float) i_187_ / (float) i));
                        if (bool_185_) {
                            anIntArray6633[i_206_] = (int) f_210_;
                            anIntArray6632[i_206_] = (int) f_211_;
                            anIntArray6625[i_206_] = i;
                        }
                        if (((Class203) aClass203_6568).aBoolean2310)
                            anIntArray6563[i_206_] = (int) ((((Class238_Sub1) aClass238_Sub1_6611).aFloat6677) + ((((Class238_Sub1) aClass238_Sub1_6611).aFloat6702 * (float) i_207_) + (((Class238_Sub1) aClass238_Sub1_6611).aFloat6698 * (float) i_208_) + (((Class238_Sub1) aClass238_Sub1_6611).aFloat6697 * (float) i_209_)));
                    }
                    if (aClass268Array6647 != null) {
                        for (int i_213_ = 0; i_213_ < anInt6567; i_213_++) {
                            Class268 class268 = aClass268Array6647[i_213_];
                            Class375 class375 = aClass375Array6618[i_213_];
                            short i_214_ = (aShortArray6631[((Class268) class268).anInt3117]);
                            short i_215_ = (aShortArray6597[((Class268) class268).anInt3117]);
                            short i_216_ = (aShortArray6590[((Class268) class268).anInt3117]);
                            int i_217_ = ((anIntArray6593[i_214_] + anIntArray6593[i_215_] + anIntArray6593[i_216_]) / 3);
                            int i_218_ = ((anIntArray6645[i_214_] + anIntArray6645[i_215_] + anIntArray6645[i_216_]) / 3);
                            int i_219_ = ((anIntArray6612[i_214_] + anIntArray6612[i_215_] + anIntArray6612[i_216_]) / 3);
                            float f_220_ = (f_165_ + f_177_ * (float) i_217_ + f_166_ * (float) i_218_ + f_180_ * (float) i_219_);
                            float f_221_ = (f_171_ + f_178_ * (float) i_217_ + f_172_ * (float) i_218_ + f_181_ * (float) i_219_);
                            float f_222_ = (f + f_179_ * (float) i_217_ + f_160_ * (float) i_218_ + f_182_ * (float) i_219_);
                            ((Class375) class375).anInt4611 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + (int) (f_220_ * (float) i_186_ / (float) i));
                            ((Class375) class375).anInt4599 = (((ha_Sub1) aHa_Sub1_6596).anInt5560 + (int) (f_221_ * (float) i_187_ / (float) i));
                            ((Class375) class375).anInt4598 = i - ((Class268) class268).anInt3118;
                            ((Class375) class375).anInt4602 = (((Class375) class375).anInt4614 * ((Class268) class268).aShort3125 * i_186_ / (i << 7));
                            ((Class375) class375).anInt4609 = (((Class375) class375).anInt4608 * ((Class268) class268).aShort3123 * i_187_ / (i << 7));
                        }
                    }
                }
                if (class346_sub9 != null) {
                    boolean bool_223_ = false;
                    boolean bool_224_ = true;
                    int i_225_ = aShort6613 + aShort6560 >> 1;
                    int i_226_ = aShort6594 + aShort6559 >> 1;
                    int i_227_ = i_225_;
                    short i_228_ = aShort6575;
                    int i_229_ = i_226_;
                    float f_230_ = (f_165_ + f_177_ * (float) i_227_ + f_166_ * (float) i_228_ + f_180_ * (float) i_229_);
                    float f_231_ = (f_171_ + f_178_ * (float) i_227_ + f_172_ * (float) i_228_ + f_181_ * (float) i_229_);
                    float f_232_ = (f + f_179_ * (float) i_227_ + f_160_ * (float) i_228_ + f_182_ * (float) i_229_);
                    if (f_232_ >= (float) i_188_) {
                        int i_233_ = (int) f_232_;
                        if (i != -1)
                            i_233_ = i;
                        ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + (int) (f_230_ * (float) i_186_ / (float) i_233_));
                        ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub1) aHa_Sub1_6596).anInt5560 + (int) (f_231_ * (float) i_187_ / (float) i_233_));
                    } else
                        bool_223_ = true;
                    i_227_ = i_225_;
                    i_228_ = aShort6634;
                    i_229_ = i_226_;
                    float f_234_ = (f_165_ + f_177_ * (float) i_227_ + f_166_ * (float) i_228_ + f_180_ * (float) i_229_);
                    float f_235_ = (f_171_ + f_178_ * (float) i_227_ + f_172_ * (float) i_228_ + f_181_ * (float) i_229_);
                    float f_236_ = (f + f_179_ * (float) i_227_ + f_160_ * (float) i_228_ + f_182_ * (float) i_229_);
                    if (f_236_ >= (float) i_188_) {
                        int i_237_ = (int) f_236_;
                        if (i != -1)
                            i_237_ = i;
                        ((Class346_Sub9) class346_sub9).anInt8345 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + (int) (f_234_ * (float) i_186_ / (float) i_237_));
                        ((Class346_Sub9) class346_sub9).anInt8343 = (((ha_Sub1) aHa_Sub1_6596).anInt5560 + (int) (f_235_ * (float) i_187_ / (float) i_237_));
                    } else
                        bool_223_ = true;
                    if (bool_223_) {
                        if (f_232_ < (float) i_188_ && f_236_ < (float) i_188_)
                            bool_224_ = false;
                        else if (f_232_ < (float) i_188_) {
                            float f_238_ = ((f_236_ - (float) (((ha_Sub1) aHa_Sub1_6596).anInt5568)) / (f_236_ - f_232_));
                            int i_239_ = (int) (f_234_ + (f_234_ - f_230_) * f_238_);
                            int i_240_ = (int) (f_235_ + (f_235_ - f_231_) * f_238_);
                            int i_241_ = i_188_;
                            if (i != -1)
                                i_241_ = i;
                            ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + i_239_ * i_186_ / i_241_);
                            ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub1) aHa_Sub1_6596).anInt5560 + i_240_ * i_187_ / i_241_);
                        } else if (f_236_ < (float) i_188_) {
                            float f_242_ = ((f_232_ - (float) i_188_) / (f_232_ - f_236_));
                            int i_243_ = (int) (f_230_ + (f_230_ - f_234_) * f_242_);
                            int i_244_ = (int) (f_231_ + (f_231_ - f_235_) * f_242_);
                            int i_245_ = i_188_;
                            if (i != -1)
                                i_245_ = i;
                            ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + i_243_ * i_186_ / i_245_);
                            ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub1) aHa_Sub1_6596).anInt5560 + i_244_ * i_187_ / i_245_);
                        }
                    }
                    if (bool_224_) {
                        if (f_232_ > f_236_) {
                            int i_246_ = (int) f_232_;
                            if (i != -1)
                                i_246_ = i;
                            ((Class346_Sub9) class346_sub9).anInt8344 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + (int) ((f_230_ + (float) aShort6583) * (float) i_186_ / (float) i_246_) - (((Class346_Sub9) class346_sub9).anInt8347));
                        } else {
                            int i_247_ = (int) f_236_;
                            if (i != -1)
                                i_247_ = i;
                            ((Class346_Sub9) class346_sub9).anInt8344 = (((ha_Sub1) aHa_Sub1_6596).anInt5579 + (int) ((f_234_ + (float) aShort6583) * (float) i_186_ / (float) i_247_) - (((Class346_Sub9) class346_sub9).anInt8345));
                        }
                        ((Class346_Sub9) class346_sub9).aBoolean8342 = true;
                    }
                }
                method1504(true);
                ((Class244) aClass244_6562).aBoolean2711 = (i_159_ & 0x1) == 0;
                ((Class244) aClass244_6562).aBoolean2714 = false;
                try {
                    method1506(bool_183_, ((((Class203) aClass203_6568).aBoolean2315 && (i_164_ > ((Class203) aClass203_6568).anInt2312)) || ((Class203) aClass203_6568).aBoolean2310), i_163_, i_164_ - i_163_);
                } catch (Exception exception) {
                    /* empty */
                }
                if (aClass268Array6647 != null) {
                    for (int i_248_ = 0; i_248_ < anInt6610; i_248_++)
                        anIntArray6638[i_248_] = -1;
                }
                aClass244_6562 = null;
                if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
                    synchronized (this) {
                        aBoolean6639 = false;
                        this.notifyAll();
                    }
                }
            }
        }
    }

    final int da() {
        return anInt6628;
    }

    private final void method1486() {
        synchronized (this) {
            for (int i = 0; i < anInt6619; i++) {
                int i_249_ = anIntArray6612[i];
                anIntArray6612[i] = anIntArray6593[i];
                anIntArray6593[i] = -i_249_;
                if (aClass220Array6603[i] != null) {
                    i_249_ = ((Class220) aClass220Array6603[i]).anInt2527;
                    ((Class220) aClass220Array6603[i]).anInt2527 = ((Class220) aClass220Array6603[i]).anInt2529;
                    ((Class220) aClass220Array6603[i]).anInt2529 = -i_249_;
                }
            }
            if (aClass274Array6602 != null) {
                for (int i = 0; i < anInt6610; i++) {
                    if (aClass274Array6602[i] != null) {
                        int i_250_ = ((Class274) aClass274Array6602[i]).anInt3171;
                        ((Class274) aClass274Array6602[i]).anInt3171 = ((Class274) aClass274Array6602[i]).anInt3172;
                        ((Class274) aClass274Array6602[i]).anInt3172 = -i_250_;
                    }
                }
            }
            for (int i = anInt6619; i < anInt6644; i++) {
                int i_251_ = anIntArray6612[i];
                anIntArray6612[i] = anIntArray6593[i];
                anIntArray6593[i] = -i_251_;
            }
            anInt6561 = 0;
            aBoolean6601 = false;
        }
    }

    final void I(int i, int[] is, int i_252_, int i_253_, int i_254_, boolean bool, int i_255_, int[] is_256_) {
        int i_257_ = is.length;
        if (i == 0) {
            i_252_ <<= 4;
            i_253_ <<= 4;
            i_254_ <<= 4;
            if (!aBoolean6624) {
                for (int i_258_ = 0; i_258_ < anInt6644; i_258_++) {
                    anIntArray6593[i_258_] <<= 4;
                    anIntArray6645[i_258_] <<= 4;
                    anIntArray6612[i_258_] <<= 4;
                }
                aBoolean6624 = true;
            }
            int i_259_ = 0;
            anInt6608 = 0;
            anInt6586 = 0;
            anInt6627 = 0;
            for (int i_260_ = 0; i_260_ < i_257_; i_260_++) {
                int i_261_ = is[i_260_];
                if (i_261_ < anIntArrayArray6621.length) {
                    int[] is_262_ = anIntArrayArray6621[i_261_];
                    for (int i_263_ = 0; i_263_ < is_262_.length; i_263_++) {
                        int i_264_ = is_262_[i_263_];
                        if (aShortArray6579 == null || (i_255_ & aShortArray6579[i_264_]) != 0) {
                            anInt6608 += anIntArray6593[i_264_];
                            anInt6586 += anIntArray6645[i_264_];
                            anInt6627 += anIntArray6612[i_264_];
                            i_259_++;
                        }
                    }
                }
            }
            if (i_259_ > 0) {
                anInt6608 = anInt6608 / i_259_ + i_252_;
                anInt6586 = anInt6586 / i_259_ + i_253_;
                anInt6627 = anInt6627 / i_259_ + i_254_;
                aBoolean6646 = true;
            } else {
                anInt6608 = i_252_;
                anInt6586 = i_253_;
                anInt6627 = i_254_;
            }
        } else if (i == 1) {
            if (is_256_ != null) {
                int i_265_ = ((is_256_[0] * i_252_ + is_256_[1] * i_253_ + is_256_[2] * i_254_ + 8192) >> 14);
                int i_266_ = ((is_256_[3] * i_252_ + is_256_[4] * i_253_ + is_256_[5] * i_254_ + 8192) >> 14);
                int i_267_ = ((is_256_[6] * i_252_ + is_256_[7] * i_253_ + is_256_[8] * i_254_ + 8192) >> 14);
                i_252_ = i_265_;
                i_253_ = i_266_;
                i_254_ = i_267_;
            }
            i_252_ <<= 4;
            i_253_ <<= 4;
            i_254_ <<= 4;
            if (!aBoolean6624) {
                for (int i_268_ = 0; i_268_ < anInt6644; i_268_++) {
                    anIntArray6593[i_268_] <<= 4;
                    anIntArray6645[i_268_] <<= 4;
                    anIntArray6612[i_268_] <<= 4;
                }
                aBoolean6624 = true;
            }
            for (int i_269_ = 0; i_269_ < i_257_; i_269_++) {
                int i_270_ = is[i_269_];
                if (i_270_ < anIntArrayArray6621.length) {
                    int[] is_271_ = anIntArrayArray6621[i_270_];
                    for (int i_272_ = 0; i_272_ < is_271_.length; i_272_++) {
                        int i_273_ = is_271_[i_272_];
                        if (aShortArray6579 == null || (i_255_ & aShortArray6579[i_273_]) != 0) {
                            anIntArray6593[i_273_] += i_252_;
                            anIntArray6645[i_273_] += i_253_;
                            anIntArray6612[i_273_] += i_254_;
                        }
                    }
                }
            }
        } else if (i == 2) {
            if (is_256_ != null) {
                if (!aBoolean6624) {
                    for (int i_274_ = 0; i_274_ < anInt6644; i_274_++) {
                        anIntArray6593[i_274_] <<= 4;
                        anIntArray6645[i_274_] <<= 4;
                        anIntArray6612[i_274_] <<= 4;
                    }
                    aBoolean6624 = true;
                }
                int i_275_ = is_256_[9] << 4;
                int i_276_ = is_256_[10] << 4;
                int i_277_ = is_256_[11] << 4;
                int i_278_ = is_256_[12] << 4;
                int i_279_ = is_256_[13] << 4;
                int i_280_ = is_256_[14] << 4;
                if (aBoolean6646) {
                    int i_281_ = ((is_256_[0] * anInt6608 + is_256_[3] * anInt6586 + is_256_[6] * anInt6627 + 8192) >> 14);
                    int i_282_ = ((is_256_[1] * anInt6608 + is_256_[4] * anInt6586 + is_256_[7] * anInt6627 + 8192) >> 14);
                    int i_283_ = ((is_256_[2] * anInt6608 + is_256_[5] * anInt6586 + is_256_[8] * anInt6627 + 8192) >> 14);
                    i_281_ += i_278_;
                    i_282_ += i_279_;
                    i_283_ += i_280_;
                    anInt6608 = i_281_;
                    anInt6586 = i_282_;
                    anInt6627 = i_283_;
                    aBoolean6646 = false;
                }
                int[] is_284_ = new int[9];
                int i_285_ = Node_Sub9_Sub1.anIntArray9109[i_252_];
                int i_286_ = Node_Sub9_Sub1.anIntArray9106[i_252_];
                int i_287_ = Node_Sub9_Sub1.anIntArray9109[i_253_];
                int i_288_ = Node_Sub9_Sub1.anIntArray9106[i_253_];
                int i_289_ = Node_Sub9_Sub1.anIntArray9109[i_254_];
                int i_290_ = Node_Sub9_Sub1.anIntArray9106[i_254_];
                int i_291_ = i_286_ * i_289_ + 8192 >> 14;
                int i_292_ = i_286_ * i_290_ + 8192 >> 14;
                is_284_[0] = i_287_ * i_289_ + i_288_ * i_292_ + 8192 >> 14;
                is_284_[1] = -i_287_ * i_290_ + i_288_ * i_291_ + 8192 >> 14;
                is_284_[2] = i_288_ * i_285_ + 8192 >> 14;
                is_284_[3] = i_285_ * i_290_ + 8192 >> 14;
                is_284_[4] = i_285_ * i_289_ + 8192 >> 14;
                is_284_[5] = -i_286_;
                is_284_[6] = -i_288_ * i_289_ + i_287_ * i_292_ + 8192 >> 14;
                is_284_[7] = i_288_ * i_290_ + i_287_ * i_291_ + 8192 >> 14;
                is_284_[8] = i_287_ * i_285_ + 8192 >> 14;
                int i_293_ = (is_284_[0] * -anInt6608 + is_284_[1] * -anInt6586 + is_284_[2] * -anInt6627 + 8192) >> 14;
                int i_294_ = (is_284_[3] * -anInt6608 + is_284_[4] * -anInt6586 + is_284_[5] * -anInt6627 + 8192) >> 14;
                int i_295_ = (is_284_[6] * -anInt6608 + is_284_[7] * -anInt6586 + is_284_[8] * -anInt6627 + 8192) >> 14;
                int i_296_ = i_293_ + anInt6608;
                int i_297_ = i_294_ + anInt6586;
                int i_298_ = i_295_ + anInt6627;
                int[] is_299_ = new int[9];
                for (int i_300_ = 0; i_300_ < 3; i_300_++) {
                    for (int i_301_ = 0; i_301_ < 3; i_301_++) {
                        int i_302_ = 0;
                        for (int i_303_ = 0; i_303_ < 3; i_303_++)
                            i_302_ += (is_284_[i_300_ * 3 + i_303_] * is_256_[i_301_ * 3 + i_303_]);
                        is_299_[i_300_ * 3 + i_301_] = i_302_ + 8192 >> 14;
                    }
                }
                int i_304_ = ((is_284_[0] * i_278_ + is_284_[1] * i_279_ + is_284_[2] * i_280_ + 8192) >> 14);
                int i_305_ = ((is_284_[3] * i_278_ + is_284_[4] * i_279_ + is_284_[5] * i_280_ + 8192) >> 14);
                int i_306_ = ((is_284_[6] * i_278_ + is_284_[7] * i_279_ + is_284_[8] * i_280_ + 8192) >> 14);
                i_304_ += i_296_;
                i_305_ += i_297_;
                i_306_ += i_298_;
                int[] is_307_ = new int[9];
                for (int i_308_ = 0; i_308_ < 3; i_308_++) {
                    for (int i_309_ = 0; i_309_ < 3; i_309_++) {
                        int i_310_ = 0;
                        for (int i_311_ = 0; i_311_ < 3; i_311_++)
                            i_310_ += (is_256_[i_308_ * 3 + i_311_] * is_299_[i_309_ + i_311_ * 3]);
                        is_307_[i_308_ * 3 + i_309_] = i_310_ + 8192 >> 14;
                    }
                }
                int i_312_ = ((is_256_[0] * i_304_ + is_256_[1] * i_305_ + is_256_[2] * i_306_ + 8192) >> 14);
                int i_313_ = ((is_256_[3] * i_304_ + is_256_[4] * i_305_ + is_256_[5] * i_306_ + 8192) >> 14);
                int i_314_ = ((is_256_[6] * i_304_ + is_256_[7] * i_305_ + is_256_[8] * i_306_ + 8192) >> 14);
                i_312_ += i_275_;
                i_313_ += i_276_;
                i_314_ += i_277_;
                for (int i_315_ = 0; i_315_ < i_257_; i_315_++) {
                    int i_316_ = is[i_315_];
                    if (i_316_ < anIntArrayArray6621.length) {
                        int[] is_317_ = anIntArrayArray6621[i_316_];
                        for (int i_318_ = 0; i_318_ < is_317_.length; i_318_++) {
                            int i_319_ = is_317_[i_318_];
                            if (aShortArray6579 == null || (i_255_ & aShortArray6579[i_319_]) != 0) {
                                int i_320_ = ((is_307_[0] * anIntArray6593[i_319_] + is_307_[1] * anIntArray6645[i_319_] + is_307_[2] * anIntArray6612[i_319_] + 8192) >> 14);
                                int i_321_ = ((is_307_[3] * anIntArray6593[i_319_] + is_307_[4] * anIntArray6645[i_319_] + is_307_[5] * anIntArray6612[i_319_] + 8192) >> 14);
                                int i_322_ = ((is_307_[6] * anIntArray6593[i_319_] + is_307_[7] * anIntArray6645[i_319_] + is_307_[8] * anIntArray6612[i_319_] + 8192) >> 14);
                                i_320_ += i_312_;
                                i_321_ += i_313_;
                                i_322_ += i_314_;
                                anIntArray6593[i_319_] = i_320_;
                                anIntArray6645[i_319_] = i_321_;
                                anIntArray6612[i_319_] = i_322_;
                            }
                        }
                    }
                }
            } else {
                for (int i_323_ = 0; i_323_ < i_257_; i_323_++) {
                    int i_324_ = is[i_323_];
                    if (i_324_ < anIntArrayArray6621.length) {
                        int[] is_325_ = anIntArrayArray6621[i_324_];
                        for (int i_326_ = 0; i_326_ < is_325_.length; i_326_++) {
                            int i_327_ = is_325_[i_326_];
                            if (aShortArray6579 == null || (i_255_ & aShortArray6579[i_327_]) != 0) {
                                anIntArray6593[i_327_] -= anInt6608;
                                anIntArray6645[i_327_] -= anInt6586;
                                anIntArray6612[i_327_] -= anInt6627;
                                if (i_254_ != 0) {
                                    int i_328_ = (Node_Sub9_Sub1.anIntArray9106[i_254_]);
                                    int i_329_ = (Node_Sub9_Sub1.anIntArray9109[i_254_]);
                                    int i_330_ = ((anIntArray6645[i_327_] * i_328_ + anIntArray6593[i_327_] * i_329_ + 16383) >> 14);
                                    anIntArray6645[i_327_] = (anIntArray6645[i_327_] * i_329_ - anIntArray6593[i_327_] * i_328_ + 16383) >> 14;
                                    anIntArray6593[i_327_] = i_330_;
                                }
                                if (i_252_ != 0) {
                                    int i_331_ = (Node_Sub9_Sub1.anIntArray9106[i_252_]);
                                    int i_332_ = (Node_Sub9_Sub1.anIntArray9109[i_252_]);
                                    int i_333_ = ((anIntArray6645[i_327_] * i_332_ - anIntArray6612[i_327_] * i_331_ + 16383) >> 14);
                                    anIntArray6612[i_327_] = (anIntArray6645[i_327_] * i_331_ + anIntArray6612[i_327_] * i_332_ + 16383) >> 14;
                                    anIntArray6645[i_327_] = i_333_;
                                }
                                if (i_253_ != 0) {
                                    int i_334_ = (Node_Sub9_Sub1.anIntArray9106[i_253_]);
                                    int i_335_ = (Node_Sub9_Sub1.anIntArray9109[i_253_]);
                                    int i_336_ = ((anIntArray6612[i_327_] * i_334_ + anIntArray6593[i_327_] * i_335_ + 16383) >> 14);
                                    anIntArray6612[i_327_] = (anIntArray6612[i_327_] * i_335_ - anIntArray6593[i_327_] * i_334_ + 16383) >> 14;
                                    anIntArray6593[i_327_] = i_336_;
                                }
                                anIntArray6593[i_327_] += anInt6608;
                                anIntArray6645[i_327_] += anInt6586;
                                anIntArray6612[i_327_] += anInt6627;
                            }
                        }
                    }
                }
            }
        } else if (i == 3) {
            if (is_256_ != null) {
                if (!aBoolean6624) {
                    for (int i_337_ = 0; i_337_ < anInt6644; i_337_++) {
                        anIntArray6593[i_337_] <<= 4;
                        anIntArray6645[i_337_] <<= 4;
                        anIntArray6612[i_337_] <<= 4;
                    }
                    aBoolean6624 = true;
                }
                int i_338_ = is_256_[9] << 4;
                int i_339_ = is_256_[10] << 4;
                int i_340_ = is_256_[11] << 4;
                int i_341_ = is_256_[12] << 4;
                int i_342_ = is_256_[13] << 4;
                int i_343_ = is_256_[14] << 4;
                if (aBoolean6646) {
                    int i_344_ = ((is_256_[0] * anInt6608 + is_256_[3] * anInt6586 + is_256_[6] * anInt6627 + 8192) >> 14);
                    int i_345_ = ((is_256_[1] * anInt6608 + is_256_[4] * anInt6586 + is_256_[7] * anInt6627 + 8192) >> 14);
                    int i_346_ = ((is_256_[2] * anInt6608 + is_256_[5] * anInt6586 + is_256_[8] * anInt6627 + 8192) >> 14);
                    i_344_ += i_341_;
                    i_345_ += i_342_;
                    i_346_ += i_343_;
                    anInt6608 = i_344_;
                    anInt6586 = i_345_;
                    anInt6627 = i_346_;
                    aBoolean6646 = false;
                }
                int i_347_ = i_252_ << 15 >> 7;
                int i_348_ = i_253_ << 15 >> 7;
                int i_349_ = i_254_ << 15 >> 7;
                int i_350_ = i_347_ * -anInt6608 + 8192 >> 14;
                int i_351_ = i_348_ * -anInt6586 + 8192 >> 14;
                int i_352_ = i_349_ * -anInt6627 + 8192 >> 14;
                int i_353_ = i_350_ + anInt6608;
                int i_354_ = i_351_ + anInt6586;
                int i_355_ = i_352_ + anInt6627;
                int[] is_356_ = new int[9];
                is_356_[0] = i_347_ * is_256_[0] + 8192 >> 14;
                is_356_[1] = i_347_ * is_256_[3] + 8192 >> 14;
                is_356_[2] = i_347_ * is_256_[6] + 8192 >> 14;
                is_356_[3] = i_348_ * is_256_[1] + 8192 >> 14;
                is_356_[4] = i_348_ * is_256_[4] + 8192 >> 14;
                is_356_[5] = i_348_ * is_256_[7] + 8192 >> 14;
                is_356_[6] = i_349_ * is_256_[2] + 8192 >> 14;
                is_356_[7] = i_349_ * is_256_[5] + 8192 >> 14;
                is_356_[8] = i_349_ * is_256_[8] + 8192 >> 14;
                int i_357_ = i_347_ * i_341_ + 8192 >> 14;
                int i_358_ = i_348_ * i_342_ + 8192 >> 14;
                int i_359_ = i_349_ * i_343_ + 8192 >> 14;
                i_357_ += i_353_;
                i_358_ += i_354_;
                i_359_ += i_355_;
                int[] is_360_ = new int[9];
                for (int i_361_ = 0; i_361_ < 3; i_361_++) {
                    for (int i_362_ = 0; i_362_ < 3; i_362_++) {
                        int i_363_ = 0;
                        for (int i_364_ = 0; i_364_ < 3; i_364_++)
                            i_363_ += (is_256_[i_361_ * 3 + i_364_] * is_356_[i_362_ + i_364_ * 3]);
                        is_360_[i_361_ * 3 + i_362_] = i_363_ + 8192 >> 14;
                    }
                }
                int i_365_ = ((is_256_[0] * i_357_ + is_256_[1] * i_358_ + is_256_[2] * i_359_ + 8192) >> 14);
                int i_366_ = ((is_256_[3] * i_357_ + is_256_[4] * i_358_ + is_256_[5] * i_359_ + 8192) >> 14);
                int i_367_ = ((is_256_[6] * i_357_ + is_256_[7] * i_358_ + is_256_[8] * i_359_ + 8192) >> 14);
                i_365_ += i_338_;
                i_366_ += i_339_;
                i_367_ += i_340_;
                for (int i_368_ = 0; i_368_ < i_257_; i_368_++) {
                    int i_369_ = is[i_368_];
                    if (i_369_ < anIntArrayArray6621.length) {
                        int[] is_370_ = anIntArrayArray6621[i_369_];
                        for (int i_371_ = 0; i_371_ < is_370_.length; i_371_++) {
                            int i_372_ = is_370_[i_371_];
                            if (aShortArray6579 == null || (i_255_ & aShortArray6579[i_372_]) != 0) {
                                int i_373_ = ((is_360_[0] * anIntArray6593[i_372_] + is_360_[1] * anIntArray6645[i_372_] + is_360_[2] * anIntArray6612[i_372_] + 8192) >> 14);
                                int i_374_ = ((is_360_[3] * anIntArray6593[i_372_] + is_360_[4] * anIntArray6645[i_372_] + is_360_[5] * anIntArray6612[i_372_] + 8192) >> 14);
                                int i_375_ = ((is_360_[6] * anIntArray6593[i_372_] + is_360_[7] * anIntArray6645[i_372_] + is_360_[8] * anIntArray6612[i_372_] + 8192) >> 14);
                                i_373_ += i_365_;
                                i_374_ += i_366_;
                                i_375_ += i_367_;
                                anIntArray6593[i_372_] = i_373_;
                                anIntArray6645[i_372_] = i_374_;
                                anIntArray6612[i_372_] = i_375_;
                            }
                        }
                    }
                }
            } else {
                for (int i_376_ = 0; i_376_ < i_257_; i_376_++) {
                    int i_377_ = is[i_376_];
                    if (i_377_ < anIntArrayArray6621.length) {
                        int[] is_378_ = anIntArrayArray6621[i_377_];
                        for (int i_379_ = 0; i_379_ < is_378_.length; i_379_++) {
                            int i_380_ = is_378_[i_379_];
                            if (aShortArray6579 == null || (i_255_ & aShortArray6579[i_380_]) != 0) {
                                anIntArray6593[i_380_] -= anInt6608;
                                anIntArray6645[i_380_] -= anInt6586;
                                anIntArray6612[i_380_] -= anInt6627;
                                anIntArray6593[i_380_] = anIntArray6593[i_380_] * i_252_ / 128;
                                anIntArray6645[i_380_] = anIntArray6645[i_380_] * i_253_ / 128;
                                anIntArray6612[i_380_] = anIntArray6612[i_380_] * i_254_ / 128;
                                anIntArray6593[i_380_] += anInt6608;
                                anIntArray6645[i_380_] += anInt6586;
                                anIntArray6612[i_380_] += anInt6627;
                            }
                        }
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray6635 != null && aByteArray6606 != null) {
                for (int i_381_ = 0; i_381_ < i_257_; i_381_++) {
                    int i_382_ = is[i_381_];
                    if (i_382_ < anIntArrayArray6635.length) {
                        int[] is_383_ = anIntArrayArray6635[i_382_];
                        for (int i_384_ = 0; i_384_ < is_383_.length; i_384_++) {
                            int i_385_ = is_383_[i_384_];
                            if (aShortArray6574 == null || (i_255_ & aShortArray6574[i_385_]) != 0) {
                                int i_386_ = ((aByteArray6606[i_385_] & 0xff) + i_252_ * 8);
                                if (i_386_ < 0)
                                    i_386_ = 0;
                                else if (i_386_ > 255)
                                    i_386_ = 255;
                                aByteArray6606[i_385_] = (byte) i_386_;
                            }
                        }
                    }
                }
                if (aClass268Array6647 != null) {
                    for (int i_387_ = 0; i_387_ < anInt6567; i_387_++) {
                        Class268 class268 = aClass268Array6647[i_387_];
                        Class375 class375 = aClass375Array6618[i_387_];
                        ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & 0xffffff | 255 - ((aByteArray6606[((Class268) class268).anInt3117]) & 0xff) << 24);
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray6635 != null) {
                for (int i_388_ = 0; i_388_ < i_257_; i_388_++) {
                    int i_389_ = is[i_388_];
                    if (i_389_ < anIntArrayArray6635.length) {
                        int[] is_390_ = anIntArrayArray6635[i_389_];
                        for (int i_391_ = 0; i_391_ < is_390_.length; i_391_++) {
                            int i_392_ = is_390_[i_391_];
                            if (aShortArray6574 == null || (i_255_ & aShortArray6574[i_392_]) != 0) {
                                int i_393_ = aShortArray6585[i_392_] & 0xffff;
                                int i_394_ = i_393_ >> 10 & 0x3f;
                                int i_395_ = i_393_ >> 7 & 0x7;
                                int i_396_ = i_393_ & 0x7f;
                                i_394_ = i_394_ + i_252_ & 0x3f;
                                i_395_ += i_253_;
                                if (i_395_ < 0)
                                    i_395_ = 0;
                                else if (i_395_ > 7)
                                    i_395_ = 7;
                                i_396_ += i_254_;
                                if (i_396_ < 0)
                                    i_396_ = 0;
                                else if (i_396_ > 127)
                                    i_396_ = 127;
                                aShortArray6585[i_392_] = (short) (i_394_ << 10 | i_395_ << 7 | i_396_);
                            }
                        }
                        aBoolean6576 = true;
                    }
                }
                if (aClass268Array6647 != null) {
                    for (int i_397_ = 0; i_397_ < anInt6567; i_397_++) {
                        Class268 class268 = aClass268Array6647[i_397_];
                        Class375 class375 = aClass375Array6618[i_397_];
                        ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & ~0xffffff | ((Node.anIntArray2801[Class183.method1615((byte) -106, ((aShortArray6585[(((Class268) class268).anInt3117)]) & 0xffff)) & 0xffff]) & 0xffffff));
                    }
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray6641 != null) {
                for (int i_398_ = 0; i_398_ < i_257_; i_398_++) {
                    int i_399_ = is[i_398_];
                    if (i_399_ < anIntArrayArray6641.length) {
                        int[] is_400_ = anIntArrayArray6641[i_399_];
                        for (int i_401_ = 0; i_401_ < is_400_.length; i_401_++) {
                            Class375 class375 = aClass375Array6618[is_400_[i_401_]];
                            ((Class375) class375).anInt4616 += i_252_;
                            ((Class375) class375).anInt4613 += i_253_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray6641 != null) {
                for (int i_402_ = 0; i_402_ < i_257_; i_402_++) {
                    int i_403_ = is[i_402_];
                    if (i_403_ < anIntArrayArray6641.length) {
                        int[] is_404_ = anIntArrayArray6641[i_403_];
                        for (int i_405_ = 0; i_405_ < is_404_.length; i_405_++) {
                            Class375 class375 = aClass375Array6618[is_404_[i_405_]];
                            ((Class375) class375).anInt4614 = (((Class375) class375).anInt4614 * i_252_ >> 7);
                            ((Class375) class375).anInt4608 = (((Class375) class375).anInt4608 * i_253_ >> 7);
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray6641 != null) {
            for (int i_406_ = 0; i_406_ < i_257_; i_406_++) {
                int i_407_ = is[i_406_];
                if (i_407_ < anIntArrayArray6641.length) {
                    int[] is_408_ = anIntArrayArray6641[i_407_];
                    for (int i_409_ = 0; i_409_ < is_408_.length; i_409_++) {
                        Class375 class375 = aClass375Array6618[is_408_[i_409_]];
                        ((Class375) class375).anInt4610 = (((Class375) class375).anInt4610 + i_252_ & 0x3fff);
                    }
                }
            }
        }
    }

    private final void method1487(int i, boolean bool, boolean bool_410_) {
        if (anIntArray6587[i] != -2) {
            short i_411_ = aShortArray6631[i];
            short i_412_ = aShortArray6597[i];
            short i_413_ = aShortArray6590[i];
            int i_414_ = anIntArray6616[i_411_];
            int i_415_ = anIntArray6616[i_412_];
            int i_416_ = anIntArray6616[i_413_];
            if (bool && (i_414_ == -5000 || i_415_ == -5000 || i_416_ == -5000)) {
                int i_417_ = anIntArray6633[i_411_];
                int i_418_ = anIntArray6633[i_412_];
                int i_419_ = anIntArray6633[i_413_];
                int i_420_ = anIntArray6632[i_411_];
                int i_421_ = anIntArray6632[i_412_];
                int i_422_ = anIntArray6632[i_413_];
                int i_423_ = anIntArray6625[i_411_];
                int i_424_ = anIntArray6625[i_412_];
                int i_425_ = anIntArray6625[i_413_];
                i_417_ -= i_418_;
                i_419_ -= i_418_;
                i_420_ -= i_421_;
                i_422_ -= i_421_;
                i_423_ -= i_424_;
                i_425_ -= i_424_;
                int i_426_ = i_420_ * i_425_ - i_423_ * i_422_;
                int i_427_ = i_423_ * i_419_ - i_417_ * i_425_;
                int i_428_ = i_417_ * i_422_ - i_420_ * i_419_;
                if (i_418_ * i_426_ + i_421_ * i_427_ + i_424_ * i_428_ > 0)
                    method1500(i);
            } else if (anIntArray6638[i] != -1 || ((i_414_ - i_415_) * (anIntArray6578[i_413_] - anIntArray6578[i_412_]) - ((anIntArray6578[i_411_] - anIntArray6578[i_412_]) * (i_416_ - i_415_))) > 0) {
                if (i_414_ < 0 || i_415_ < 0 || i_416_ < 0 || i_414_ > ((Class203) aClass203_6568).anInt2323 || i_415_ > ((Class203) aClass203_6568).anInt2323 || i_416_ > ((Class203) aClass203_6568).anInt2323)
                    ((Class244) aClass244_6562).aBoolean2723 = true;
                else
                    ((Class244) aClass244_6562).aBoolean2723 = false;
                if (bool_410_) {
                    int i_429_ = anIntArray6638[i];
                    if (i_429_ == -1 || !(((Class268) aClass268Array6647[i_429_]).aBoolean3119))
                        method1489(i);
                } else {
                    int i_430_ = anIntArray6638[i];
                    if (i_430_ != -1) {
                        Class268 class268 = aClass268Array6647[i_430_];
                        Class375 class375 = aClass375Array6618[i_430_];
                        if (!((Class268) class268).aBoolean3119)
                            method1481(i);
                        aHa_Sub1_6596.method835(((Class375) class375).anInt4611, ((Class375) class375).anInt4599, ((Class375) class375).anInt4598, ((Class375) class375).anInt4602, ((Class375) class375).anInt4609, ((Class375) class375).anInt4610, ((Class268) class268).aShort3116 & 0xffff, ((Class375) class375).anInt4600, ((Class268) class268).aByte3124, ((Class268) class268).aByte3122);
                    } else
                        method1481(i);
                }
            }
        }
    }

    final int ma() {
        if (!aBoolean6601)
            method1483();
        return aShort6570;
    }

    private final boolean method1488(int i) {
        if (anIntArray6638 == null)
            return false;
        if (anIntArray6638[i] == -1)
            return false;
        return true;
    }

    private final void method1489(int i) {
        if (!((Class203) aClass203_6568).aBoolean2310) {
            short i_431_ = aShortArray6631[i];
            short i_432_ = aShortArray6597[i];
            short i_433_ = aShortArray6590[i];
            int i_434_ = (anIntArray6582[i_431_] - ((Class203) aClass203_6568).anInt2312);
            if (i_434_ > 255)
                i_434_ = 255;
            else if (i_434_ < 0)
                i_434_ = 0;
            int i_435_ = (anIntArray6582[i_432_] - ((Class203) aClass203_6568).anInt2312);
            if (i_435_ > 255)
                i_435_ = 255;
            else if (i_435_ < 0)
                i_435_ = 0;
            int i_436_ = (anIntArray6582[i_433_] - ((Class203) aClass203_6568).anInt2312);
            if (i_436_ > 255)
                i_436_ = 255;
            else if (i_436_ < 0)
                i_436_ = 0;
            int i_437_ = i_434_ + i_435_ + i_436_;
            if (i_437_ != 765) {
                if (i_437_ == 0)
                    method1481(i);
                else {
                    if (aByteArray6606 == null)
                        ((Class244) aClass244_6562).anInt2718 = 0;
                    else
                        ((Class244) aClass244_6562).anInt2718 = aByteArray6606[i] & 0xff;
                    if (aShortArray6629 == null || aShortArray6629[i] == -1) {
                        if (anIntArray6587[i] == -1)
                            aClass244_6562.method1953((float) anIntArray6578[i_431_], (float) anIntArray6578[i_432_], (float) anIntArray6578[i_433_], (float) anIntArray6616[i_431_], (float) anIntArray6616[i_432_], (float) anIntArray6616[i_433_], (float) anIntArray6582[i_431_], (float) anIntArray6582[i_432_], (float) anIntArray6582[i_433_], (Node_Sub11_Sub1.method2254((Node.anIntArray2801[anIntArray6598[i] & 0xffff]), (i_434_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254((Node.anIntArray2801[anIntArray6598[i] & 0xffff]), (i_435_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254((Node.anIntArray2801[anIntArray6598[i] & 0xffff]), (i_436_ << 24 | ((Class203) aClass203_6568).anInt2303), false)));
                        else
                            aClass244_6562.method1953((float) anIntArray6578[i_431_], (float) anIntArray6578[i_432_], (float) anIntArray6578[i_433_], (float) anIntArray6616[i_431_], (float) anIntArray6616[i_432_], (float) anIntArray6616[i_433_], (float) anIntArray6582[i_431_], (float) anIntArray6582[i_432_], (float) anIntArray6582[i_433_], (Node_Sub11_Sub1.method2254((Node.anIntArray2801[anIntArray6598[i] & 0xffff]), (i_434_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254((Node.anIntArray2801[anIntArray6630[i] & 0xffff]), (i_435_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254((Node.anIntArray2801[anIntArray6587[i] & 0xffff]), (i_436_ << 24 | ((Class203) aClass203_6568).anInt2303), false)));
                    } else {
                        int i_438_ = -16777216;
                        if (aByteArray6606 != null)
                            i_438_ = 255 - (aByteArray6606[i] & 0xff) << 24;
                        if (anIntArray6587[i] == -1) {
                            int i_439_ = i_438_ | anIntArray6598[i] & 0xffffff;
                            aClass244_6562.method1948((float) anIntArray6578[i_431_], (float) anIntArray6578[i_432_], (float) anIntArray6578[i_433_], (float) anIntArray6616[i_431_], (float) anIntArray6616[i_432_], (float) anIntArray6616[i_433_], (float) anIntArray6582[i_431_], (float) anIntArray6582[i_432_], (float) anIntArray6582[i_433_], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_439_, i_439_, i_439_, ((Class203) aClass203_6568).anInt2303, i_434_, i_435_, i_436_, aShortArray6629[i]);
                        } else
                            aClass244_6562.method1948((float) anIntArray6578[i_431_], (float) anIntArray6578[i_432_], (float) anIntArray6578[i_433_], (float) anIntArray6616[i_431_], (float) anIntArray6616[i_432_], (float) anIntArray6616[i_433_], (float) anIntArray6582[i_431_], (float) anIntArray6582[i_432_], (float) anIntArray6582[i_433_], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_438_ | anIntArray6598[i] & 0xffffff, i_438_ | anIntArray6630[i] & 0xffffff, i_438_ | anIntArray6587[i] & 0xffffff, ((Class203) aClass203_6568).anInt2303, i_434_, i_435_, i_436_, aShortArray6629[i]);
                    }
                }
            }
        } else {
            short i_440_ = aShortArray6631[i];
            short i_441_ = aShortArray6597[i];
            short i_442_ = aShortArray6590[i];
            int i_443_ = 0;
            int i_444_ = 0;
            int i_445_ = 0;
            if (anIntArray6563[i_440_] > ((Class203) aClass203_6568).anInt2305)
                i_443_ = 255;
            else if (anIntArray6563[i_440_] > ((Class203) aClass203_6568).anInt2311)
                i_443_ = ((((Class203) aClass203_6568).anInt2311 - anIntArray6563[i_440_]) * 255 / (((Class203) aClass203_6568).anInt2311 - ((Class203) aClass203_6568).anInt2305));
            if (anIntArray6563[i_441_] > ((Class203) aClass203_6568).anInt2305)
                i_444_ = 255;
            else if (anIntArray6563[i_441_] > ((Class203) aClass203_6568).anInt2311)
                i_444_ = ((((Class203) aClass203_6568).anInt2311 - anIntArray6563[i_441_]) * 255 / (((Class203) aClass203_6568).anInt2311 - ((Class203) aClass203_6568).anInt2305));
            if (anIntArray6563[i_442_] > ((Class203) aClass203_6568).anInt2305)
                i_445_ = 255;
            else if (anIntArray6563[i_442_] > ((Class203) aClass203_6568).anInt2311)
                i_445_ = ((((Class203) aClass203_6568).anInt2311 - anIntArray6563[i_442_]) * 255 / (((Class203) aClass203_6568).anInt2311 - ((Class203) aClass203_6568).anInt2305));
            if (aByteArray6606 == null)
                ((Class244) aClass244_6562).anInt2718 = 0;
            else
                ((Class244) aClass244_6562).anInt2718 = aByteArray6606[i] & 0xff;
            if (aShortArray6629 == null || aShortArray6629[i] == -1) {
                if (anIntArray6587[i] == -1)
                    aClass244_6562.method1953((float) anIntArray6578[i_440_], (float) anIntArray6578[i_441_], (float) anIntArray6578[i_442_], (float) anIntArray6616[i_440_], (float) anIntArray6616[i_441_], (float) anIntArray6616[i_442_], (float) anIntArray6582[i_440_], (float) anIntArray6582[i_441_], (float) anIntArray6582[i_442_], (Node_Sub11_Sub1.method2254(Node.anIntArray2801[anIntArray6598[i] & 0xffff], (i_443_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254(Node.anIntArray2801[anIntArray6598[i] & 0xffff], (i_444_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254(Node.anIntArray2801[anIntArray6598[i] & 0xffff], (i_445_ << 24 | ((Class203) aClass203_6568).anInt2303), false)));
                else
                    aClass244_6562.method1953((float) anIntArray6578[i_440_], (float) anIntArray6578[i_441_], (float) anIntArray6578[i_442_], (float) anIntArray6616[i_440_], (float) anIntArray6616[i_441_], (float) anIntArray6616[i_442_], (float) anIntArray6582[i_440_], (float) anIntArray6582[i_441_], (float) anIntArray6582[i_442_], (Node_Sub11_Sub1.method2254(Node.anIntArray2801[anIntArray6598[i] & 0xffff], (i_443_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254(Node.anIntArray2801[anIntArray6630[i] & 0xffff], (i_444_ << 24 | ((Class203) aClass203_6568).anInt2303), false)), (Node_Sub11_Sub1.method2254(Node.anIntArray2801[anIntArray6587[i] & 0xffff], (i_445_ << 24 | ((Class203) aClass203_6568).anInt2303), false)));
            } else {
                int i_446_ = -16777216;
                if (aByteArray6606 != null)
                    i_446_ = 255 - (aByteArray6606[i] & 0xff) << 24;
                if (anIntArray6587[i] == -1) {
                    int i_447_ = i_446_ | anIntArray6598[i] & 0xffffff;
                    aClass244_6562.method1948((float) anIntArray6578[i_440_], (float) anIntArray6578[i_441_], (float) anIntArray6578[i_442_], (float) anIntArray6616[i_440_], (float) anIntArray6616[i_441_], (float) anIntArray6616[i_442_], (float) anIntArray6582[i_440_], (float) anIntArray6582[i_441_], (float) anIntArray6582[i_442_], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_447_, i_447_, i_447_, (((Class203) aClass203_6568).anInt2303), i_443_, i_444_, i_445_, aShortArray6629[i]);
                } else
                    aClass244_6562.method1948((float) anIntArray6578[i_440_], (float) anIntArray6578[i_441_], (float) anIntArray6578[i_442_], (float) anIntArray6616[i_440_], (float) anIntArray6616[i_441_], (float) anIntArray6616[i_442_], (float) anIntArray6582[i_440_], (float) anIntArray6582[i_441_], (float) anIntArray6582[i_442_], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_446_ | anIntArray6598[i] & 0xffffff, i_446_ | anIntArray6630[i] & 0xffffff, i_446_ | anIntArray6587[i] & 0xffffff, ((Class203) aClass203_6568).anInt2303, i_443_, i_444_, i_445_, aShortArray6629[i]);
            }
        }
    }

    final void method1428(Class162 class162, int i, int i_448_, int i_449_, boolean bool) {
        Class162_Sub3 class162_sub3_450_ = (Class162_Sub3) class162;
        if ((anInt6600 & 0x10000) != 65536)
            throw new IllegalStateException("");
        if ((class162_sub3_450_.anInt6600 & 0x10000) != 65536)
            throw new IllegalStateException("");
        method1498(Thread.currentThread());
        method1483();
        method1502();
        class162_sub3_450_.method1483();
        class162_sub3_450_.method1502();
        anInt6626++;
        int i_451_ = 0;
        int[] is = class162_sub3_450_.anIntArray6593;
        int i_452_ = class162_sub3_450_.anInt6619;
        for (int i_453_ = 0; i_453_ < anInt6619; i_453_++) {
            Class220 class220 = aClass220Array6603[i_453_];
            if (((Class220) class220).anInt2528 != 0) {
                int i_454_ = anIntArray6645[i_453_] - i_448_;
                if (i_454_ >= class162_sub3_450_.aShort6575 && i_454_ <= class162_sub3_450_.aShort6634) {
                    int i_455_ = anIntArray6593[i_453_] - i;
                    if (i_455_ >= class162_sub3_450_.aShort6613 && i_455_ <= class162_sub3_450_.aShort6560) {
                        int i_456_ = anIntArray6612[i_453_] - i_449_;
                        if (i_456_ >= class162_sub3_450_.aShort6594 && i_456_ <= class162_sub3_450_.aShort6559) {
                            for (int i_457_ = 0; i_457_ < i_452_; i_457_++) {
                                Class220 class220_458_ = (class162_sub3_450_.aClass220Array6603[i_457_]);
                                if (i_455_ == is[i_457_] && i_456_ == (class162_sub3_450_.anIntArray6612[i_457_]) && i_454_ == (class162_sub3_450_.anIntArray6645[i_457_]) && (((Class220) class220_458_).anInt2528 != 0)) {
                                    if (aClass220Array6571 == null)
                                        aClass220Array6571 = new Class220[anInt6619];
                                    if (class162_sub3_450_.aClass220Array6571 == null)
                                        class162_sub3_450_.aClass220Array6571 = new Class220[i_452_];
                                    Class220 class220_459_ = aClass220Array6571[i_453_];
                                    if (class220_459_ == null)
                                        class220_459_ = aClass220Array6571[i_453_] = new Class220(class220);
                                    Class220 class220_460_ = (class162_sub3_450_.aClass220Array6571[i_457_]);
                                    if (class220_460_ == null)
                                        class220_460_ = class162_sub3_450_.aClass220Array6571[i_457_] = new Class220(class220_458_);
                                    ((Class220) class220_459_).anInt2529 += (((Class220) class220_458_).anInt2529);
                                    ((Class220) class220_459_).anInt2526 += (((Class220) class220_458_).anInt2526);
                                    ((Class220) class220_459_).anInt2527 += (((Class220) class220_458_).anInt2527);
                                    ((Class220) class220_459_).anInt2528 += (((Class220) class220_458_).anInt2528);
                                    ((Class220) class220_460_).anInt2529 += ((Class220) class220).anInt2529;
                                    ((Class220) class220_460_).anInt2526 += ((Class220) class220).anInt2526;
                                    ((Class220) class220_460_).anInt2527 += ((Class220) class220).anInt2527;
                                    ((Class220) class220_460_).anInt2528 += ((Class220) class220).anInt2528;
                                    i_451_++;
                                    anIntArray6588[i_453_] = anInt6626;
                                    anIntArray6640[i_457_] = anInt6626;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i_451_ >= 3 && bool) {
            for (int i_461_ = 0; i_461_ < anInt6610; i_461_++) {
                if (anIntArray6588[aShortArray6631[i_461_]] == anInt6626 && anIntArray6588[aShortArray6597[i_461_]] == anInt6626 && anIntArray6588[aShortArray6590[i_461_]] == anInt6626) {
                    if (aByteArray6589 == null)
                        aByteArray6589 = new byte[anInt6610];
                    aByteArray6589[i_461_] = (byte) 2;
                }
            }
            for (int i_462_ = 0; i_462_ < class162_sub3_450_.anInt6610; i_462_++) {
                if ((anIntArray6640[class162_sub3_450_.aShortArray6631[i_462_]] == anInt6626) && anIntArray6640[(class162_sub3_450_.aShortArray6597[i_462_])] == anInt6626 && anIntArray6640[(class162_sub3_450_.aShortArray6590[i_462_])] == anInt6626) {
                    if (class162_sub3_450_.aByteArray6589 == null)
                        class162_sub3_450_.aByteArray6589 = new byte[class162_sub3_450_.anInt6610];
                    class162_sub3_450_.aByteArray6589[i_462_] = (byte) 2;
                }
            }
        }
    }

    final Class162 method1436(byte i, int i_463_, boolean bool) {
        method1480(Thread.currentThread());
        Class162_Sub3 class162_sub3_464_;
        Class162_Sub3 class162_sub3_465_;
        if (i == 1) {
            class162_sub3_464_ = aClass162_Sub3_6591;
            class162_sub3_465_ = aClass162_Sub3_6607;
        } else if (i == 2) {
            class162_sub3_464_ = aClass162_Sub3_6648;
            class162_sub3_465_ = aClass162_Sub3_6637;
        } else if (i == 3) {
            class162_sub3_464_ = aClass162_Sub3_6615;
            class162_sub3_465_ = aClass162_Sub3_6623;
        } else if (i == 4) {
            class162_sub3_464_ = aClass162_Sub3_6565;
            class162_sub3_465_ = aClass162_Sub3_6614;
        } else if (i == 5) {
            class162_sub3_464_ = aClass162_Sub3_6622;
            class162_sub3_465_ = aClass162_Sub3_6581;
        } else
            class162_sub3_465_ = class162_sub3_464_ = new Class162_Sub3(aHa_Sub1_6596);
        return method1505(class162_sub3_465_, class162_sub3_464_, i_463_, i != 0, bool);
    }

    final boolean method1422() {
        if (aShortArray6629 == null)
            return true;
        for (int i = 0; i < aShortArray6629.length; i++) {
            if (aShortArray6629[i] != -1 && !aHa_Sub1_6596.method827(aShortArray6629[i]))
                return false;
        }
        return true;
    }

    private final void method1490() {
        synchronized (this) {
            for (int i = 0; i < anInt6619; i++) {
                int i_466_ = anIntArray6593[i];
                anIntArray6593[i] = anIntArray6612[i];
                anIntArray6612[i] = -i_466_;
                if (aClass220Array6603[i] != null) {
                    i_466_ = ((Class220) aClass220Array6603[i]).anInt2529;
                    ((Class220) aClass220Array6603[i]).anInt2529 = ((Class220) aClass220Array6603[i]).anInt2527;
                    ((Class220) aClass220Array6603[i]).anInt2527 = -i_466_;
                }
            }
            if (aClass274Array6602 != null) {
                for (int i = 0; i < anInt6610; i++) {
                    if (aClass274Array6602[i] != null) {
                        int i_467_ = ((Class274) aClass274Array6602[i]).anInt3172;
                        ((Class274) aClass274Array6602[i]).anInt3172 = ((Class274) aClass274Array6602[i]).anInt3171;
                        ((Class274) aClass274Array6602[i]).anInt3171 = -i_467_;
                    }
                }
            }
            for (int i = anInt6619; i < anInt6644; i++) {
                int i_468_ = anIntArray6593[i];
                anIntArray6593[i] = anIntArray6612[i];
                anIntArray6612[i] = -i_468_;
            }
            anInt6561 = 0;
            aBoolean6601 = false;
        }
    }

    private final boolean method1491(int i) {
        if (aByteArray6606 == null)
            return false;
        if (aByteArray6606[i] == 0)
            return false;
        return true;
    }

    final int RA() {
        if (!aBoolean6601)
            method1483();
        return aShort6560;
    }

    private final void method1492() {
        if (anInt6561 == 0)
            method1504(false);
        else if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
            synchronized (this) {
                method1508();
            }
        } else
            method1508();
    }

    private final int method1493(int i, int i_469_) {
        i_469_ = i_469_ * (i & 0x7f) >> 7;
        if (i_469_ < 2)
            i_469_ = 2;
        else if (i_469_ > 126)
            i_469_ = 126;
        return (i & 0xff80) + i_469_;
    }

    final void wa() {
        if (aBoolean6624) {
            for (int i = 0; i < anInt6644; i++) {
                anIntArray6593[i] = anIntArray6593[i] + 7 >> 4;
                anIntArray6645[i] = anIntArray6645[i] + 7 >> 4;
                anIntArray6612[i] = anIntArray6612[i] + 7 >> 4;
            }
            aBoolean6624 = false;
        }
        if (aBoolean6576) {
            method1492();
            aBoolean6576 = false;
        }
        aBoolean6601 = false;
    }

    final void P(int i, int i_470_, int i_471_, int i_472_) {
        if (i == 0) {
            int i_473_ = 0;
            anInt6608 = 0;
            anInt6586 = 0;
            anInt6627 = 0;
            for (int i_474_ = 0; i_474_ < anInt6644; i_474_++) {
                anInt6608 += anIntArray6593[i_474_];
                anInt6586 += anIntArray6645[i_474_];
                anInt6627 += anIntArray6612[i_474_];
                i_473_++;
            }
            if (i_473_ > 0) {
                anInt6608 = anInt6608 / i_473_ + i_470_;
                anInt6586 = anInt6586 / i_473_ + i_471_;
                anInt6627 = anInt6627 / i_473_ + i_472_;
            } else {
                anInt6608 = i_470_;
                anInt6586 = i_471_;
                anInt6627 = i_472_;
            }
        } else if (i == 1) {
            for (int i_475_ = 0; i_475_ < anInt6644; i_475_++) {
                anIntArray6593[i_475_] += i_470_;
                anIntArray6645[i_475_] += i_471_;
                anIntArray6612[i_475_] += i_472_;
            }
        } else if (i == 2) {
            for (int i_476_ = 0; i_476_ < anInt6644; i_476_++) {
                anIntArray6593[i_476_] -= anInt6608;
                anIntArray6645[i_476_] -= anInt6586;
                anIntArray6612[i_476_] -= anInt6627;
                if (i_472_ != 0) {
                    int i_477_ = Node_Sub9_Sub1.anIntArray9106[i_472_];
                    int i_478_ = Node_Sub9_Sub1.anIntArray9109[i_472_];
                    int i_479_ = ((anIntArray6645[i_476_] * i_477_ + anIntArray6593[i_476_] * i_478_ + 16383) >> 14);
                    anIntArray6645[i_476_] = (anIntArray6645[i_476_] * i_478_ - anIntArray6593[i_476_] * i_477_ + 16383) >> 14;
                    anIntArray6593[i_476_] = i_479_;
                }
                if (i_470_ != 0) {
                    int i_480_ = Node_Sub9_Sub1.anIntArray9106[i_470_];
                    int i_481_ = Node_Sub9_Sub1.anIntArray9109[i_470_];
                    int i_482_ = ((anIntArray6645[i_476_] * i_481_ - anIntArray6612[i_476_] * i_480_ + 16383) >> 14);
                    anIntArray6612[i_476_] = (anIntArray6645[i_476_] * i_480_ + anIntArray6612[i_476_] * i_481_ + 16383) >> 14;
                    anIntArray6645[i_476_] = i_482_;
                }
                if (i_471_ != 0) {
                    int i_483_ = Node_Sub9_Sub1.anIntArray9106[i_471_];
                    int i_484_ = Node_Sub9_Sub1.anIntArray9109[i_471_];
                    int i_485_ = ((anIntArray6612[i_476_] * i_483_ + anIntArray6593[i_476_] * i_484_ + 16383) >> 14);
                    anIntArray6612[i_476_] = (anIntArray6612[i_476_] * i_484_ - anIntArray6593[i_476_] * i_483_ + 16383) >> 14;
                    anIntArray6593[i_476_] = i_485_;
                }
                anIntArray6593[i_476_] += anInt6608;
                anIntArray6645[i_476_] += anInt6586;
                anIntArray6612[i_476_] += anInt6627;
            }
        } else if (i == 3) {
            for (int i_486_ = 0; i_486_ < anInt6644; i_486_++) {
                anIntArray6593[i_486_] -= anInt6608;
                anIntArray6645[i_486_] -= anInt6586;
                anIntArray6612[i_486_] -= anInt6627;
                anIntArray6593[i_486_] = anIntArray6593[i_486_] * i_470_ / 128;
                anIntArray6645[i_486_] = anIntArray6645[i_486_] * i_471_ / 128;
                anIntArray6612[i_486_] = anIntArray6612[i_486_] * i_472_ / 128;
                anIntArray6593[i_486_] += anInt6608;
                anIntArray6645[i_486_] += anInt6586;
                anIntArray6612[i_486_] += anInt6627;
            }
        } else if (i == 5) {
            for (int i_487_ = 0; i_487_ < anInt6610; i_487_++) {
                int i_488_ = (aByteArray6606[i_487_] & 0xff) + i_470_ * 8;
                if (i_488_ < 0)
                    i_488_ = 0;
                else if (i_488_ > 255)
                    i_488_ = 255;
                aByteArray6606[i_487_] = (byte) i_488_;
            }
            if (aClass268Array6647 != null) {
                for (int i_489_ = 0; i_489_ < anInt6567; i_489_++) {
                    Class268 class268 = aClass268Array6647[i_489_];
                    Class375 class375 = aClass375Array6618[i_489_];
                    ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & 0xffffff | 255 - ((aByteArray6606[((Class268) class268).anInt3117]) & 0xff) << 24);
                }
            }
        } else if (i == 7) {
            for (int i_490_ = 0; i_490_ < anInt6610; i_490_++) {
                int i_491_ = aShortArray6585[i_490_] & 0xffff;
                int i_492_ = i_491_ >> 10 & 0x3f;
                int i_493_ = i_491_ >> 7 & 0x7;
                int i_494_ = i_491_ & 0x7f;
                i_492_ = i_492_ + i_470_ & 0x3f;
                i_493_ += i_471_;
                if (i_493_ < 0)
                    i_493_ = 0;
                else if (i_493_ > 7)
                    i_493_ = 7;
                i_494_ += i_472_;
                if (i_494_ < 0)
                    i_494_ = 0;
                else if (i_494_ > 127)
                    i_494_ = 127;
                aShortArray6585[i_490_] = (short) (i_492_ << 10 | i_493_ << 7 | i_494_);
            }
            aBoolean6576 = true;
            if (aClass268Array6647 != null) {
                for (int i_495_ = 0; i_495_ < anInt6567; i_495_++) {
                    Class268 class268 = aClass268Array6647[i_495_];
                    Class375 class375 = aClass375Array6618[i_495_];
                    ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & ~0xffffff | (Node.anIntArray2801[(Class183.method1615((byte) -125, (aShortArray6585[(((Class268) class268).anInt3117)]) & 0xffff) & 0xffff)]) & 0xffffff);
                }
            }
        } else if (i == 8) {
            for (int i_496_ = 0; i_496_ < anInt6567; i_496_++) {
                Class375 class375 = aClass375Array6618[i_496_];
                ((Class375) class375).anInt4616 += i_470_;
                ((Class375) class375).anInt4613 += i_471_;
            }
        } else if (i == 10) {
            for (int i_497_ = 0; i_497_ < anInt6567; i_497_++) {
                Class375 class375 = aClass375Array6618[i_497_];
                ((Class375) class375).anInt4614 = ((Class375) class375).anInt4614 * i_470_ >> 7;
                ((Class375) class375).anInt4608 = ((Class375) class375).anInt4608 * i_471_ >> 7;
            }
        } else if (i == 9) {
            for (int i_498_ = 0; i_498_ < anInt6567; i_498_++) {
                Class375 class375 = aClass375Array6618[i_498_];
                ((Class375) class375).anInt4610 = ((Class375) class375).anInt4610 + i_470_ & 0x3fff;
            }
        }
    }

    final int fa() {
        if (!aBoolean6601)
            method1483();
        return aShort6575;
    }

    final void method1435() {
        /* empty */
    }

    private final boolean method1494(int i, int i_499_, int i_500_, int i_501_, int i_502_, int i_503_, int i_504_, int i_505_) {
        if (i_499_ < i_500_ && i_499_ < i_501_ && i_499_ < i_502_)
            return false;
        if (i_499_ > i_500_ && i_499_ > i_501_ && i_499_ > i_502_)
            return false;
        if (i < i_503_ && i < i_504_ && i < i_505_)
            return false;
        if (i > i_503_ && i > i_504_ && i > i_505_)
            return false;
        return true;
    }

    final void O(int i, int i_506_, int i_507_) {
        if (i != 128 && (anInt6600 & 0x1) != 1)
            throw new IllegalStateException();
        if (i_506_ != 128 && (anInt6600 & 0x2) != 2)
            throw new IllegalStateException();
        if (i_507_ != 128 && (anInt6600 & 0x4) != 4)
            throw new IllegalStateException();
        synchronized (this) {
            for (int i_508_ = 0; i_508_ < anInt6644; i_508_++) {
                anIntArray6593[i_508_] = anIntArray6593[i_508_] * i >> 7;
                anIntArray6645[i_508_] = anIntArray6645[i_508_] * i_506_ >> 7;
                anIntArray6612[i_508_] = anIntArray6612[i_508_] * i_507_ >> 7;
            }
            aBoolean6601 = false;
        }
    }

    private final int method1495(int i) {
        if (i < 2)
            i = 2;
        else if (i > 126)
            i = 126;
        return i;
    }

    final void C(int i) {
        if ((anInt6600 & 0x1000) != 4096)
            throw new IllegalStateException();
        anInt6564 = i;
        anInt6561 = 0;
    }

    private final void method1496() {
        aClass220Array6603 = new Class220[anInt6619];
        for (int i = 0; i < anInt6619; i++)
            aClass220Array6603[i] = new Class220();
        for (int i = 0; i < anInt6610; i++) {
            short i_509_ = aShortArray6631[i];
            short i_510_ = aShortArray6597[i];
            short i_511_ = aShortArray6590[i];
            int i_512_ = anIntArray6593[i_510_] - anIntArray6593[i_509_];
            int i_513_ = anIntArray6645[i_510_] - anIntArray6645[i_509_];
            int i_514_ = anIntArray6612[i_510_] - anIntArray6612[i_509_];
            int i_515_ = anIntArray6593[i_511_] - anIntArray6593[i_509_];
            int i_516_ = anIntArray6645[i_511_] - anIntArray6645[i_509_];
            int i_517_ = anIntArray6612[i_511_] - anIntArray6612[i_509_];
            int i_518_ = i_513_ * i_517_ - i_516_ * i_514_;
            int i_519_ = i_514_ * i_515_ - i_517_ * i_512_;
            int i_520_;
            for (i_520_ = i_512_ * i_516_ - i_515_ * i_513_; (i_518_ > 8192 || i_519_ > 8192 || i_520_ > 8192 || i_518_ < -8192 || i_519_ < -8192 || i_520_ < -8192); i_520_ >>= 1) {
                i_518_ >>= 1;
                i_519_ >>= 1;
            }
            int i_521_ = (int) Math.sqrt((double) (i_518_ * i_518_ + i_519_ * i_519_ + i_520_ * i_520_));
            if (i_521_ <= 0)
                i_521_ = 1;
            i_518_ = i_518_ * 256 / i_521_;
            i_519_ = i_519_ * 256 / i_521_;
            i_520_ = i_520_ * 256 / i_521_;
            byte i_522_;
            if (aByteArray6589 == null)
                i_522_ = (byte) 0;
            else
                i_522_ = aByteArray6589[i];
            if (i_522_ == 0) {
                Class220 class220 = aClass220Array6603[i_509_];
                ((Class220) class220).anInt2529 += i_518_;
                ((Class220) class220).anInt2526 += i_519_;
                ((Class220) class220).anInt2527 += i_520_;
                ((Class220) class220).anInt2528++;
                class220 = aClass220Array6603[i_510_];
                ((Class220) class220).anInt2529 += i_518_;
                ((Class220) class220).anInt2526 += i_519_;
                ((Class220) class220).anInt2527 += i_520_;
                ((Class220) class220).anInt2528++;
                class220 = aClass220Array6603[i_511_];
                ((Class220) class220).anInt2529 += i_518_;
                ((Class220) class220).anInt2526 += i_519_;
                ((Class220) class220).anInt2527 += i_520_;
                ((Class220) class220).anInt2528++;
            } else if (i_522_ == 1) {
                if (aClass274Array6602 == null)
                    aClass274Array6602 = new Class274[anInt6610];
                Class274 class274 = aClass274Array6602[i] = new Class274();
                ((Class274) class274).anInt3172 = i_518_;
                ((Class274) class274).anInt3173 = i_519_;
                ((Class274) class274).anInt3171 = i_520_;
            }
        }
    }

    final void method1427() {
        if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
            synchronized (this) {
                while (((Class162) this).aBoolean1907) {
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
                ((Class162) this).aBoolean1907 = true;
            }
        }
    }

    final void H(int i, int i_523_, int i_524_) {
        if (i != 0 && (anInt6600 & 0x1) != 1)
            throw new IllegalStateException();
        if (i_523_ != 0 && (anInt6600 & 0x2) != 2)
            throw new IllegalStateException();
        if (i_524_ != 0 && (anInt6600 & 0x4) != 4)
            throw new IllegalStateException();
        synchronized (this) {
            for (int i_525_ = 0; i_525_ < anInt6644; i_525_++) {
                anIntArray6593[i_525_] += i;
                anIntArray6645[i_525_] += i_523_;
                anIntArray6612[i_525_] += i_524_;
            }
        }
    }

    private final void method1497(boolean bool) {
        if (anInt6561 == 1)
            method1492();
        else if (anInt6561 == 2) {
            if ((anInt6600 & 0x97098) == 0 && aFloatArrayArray6584 == null)
                aShortArray6585 = null;
            if (bool)
                aByteArray6589 = null;
        } else {
            method1502();
            int i = ((ha_Sub1) aHa_Sub1_6596).anInt5569;
            int i_526_ = ((ha_Sub1) aHa_Sub1_6596).anInt5555;
            int i_527_ = ((ha_Sub1) aHa_Sub1_6596).anInt5566;
            int i_528_ = ((ha_Sub1) aHa_Sub1_6596).anInt5583 >> 8;
            int i_529_ = ((ha_Sub1) aHa_Sub1_6596).anInt5546 * 768 / anInt6628;
            int i_530_ = ((ha_Sub1) aHa_Sub1_6596).anInt5581 * 768 / anInt6628;
            if (anIntArray6598 == null) {
                anIntArray6598 = new int[anInt6610];
                anIntArray6630 = new int[anInt6610];
                anIntArray6587 = new int[anInt6610];
            }
            for (int i_531_ = 0; i_531_ < anInt6610; i_531_++) {
                byte i_532_;
                if (aByteArray6589 == null)
                    i_532_ = (byte) 0;
                else
                    i_532_ = aByteArray6589[i_531_];
                byte i_533_;
                if (aByteArray6606 == null)
                    i_533_ = (byte) 0;
                else
                    i_533_ = aByteArray6606[i_531_];
                short i_534_;
                if (aShortArray6629 == null)
                    i_534_ = (short) -1;
                else
                    i_534_ = aShortArray6629[i_531_];
                if (i_533_ == -2)
                    i_532_ = (byte) 3;
                if (i_533_ == -1)
                    i_532_ = (byte) 2;
                if (i_534_ == -1) {
                    if (i_532_ == 0) {
                        int i_535_ = aShortArray6585[i_531_] & 0xffff;
                        int i_536_ = (i_535_ & 0x7f) * anInt6564 >> 7;
                        short i_537_ = Class183.method1615((byte) -125, i_535_ & ~0x7f | i_536_);
                        Class220 class220;
                        if (aClass220Array6571 != null && (aClass220Array6571[aShortArray6631[i_531_]] != null))
                            class220 = aClass220Array6571[aShortArray6631[i_531_]];
                        else
                            class220 = aClass220Array6603[aShortArray6631[i_531_]];
                        int i_538_ = (((i * ((Class220) class220).anInt2529 + i_526_ * ((Class220) class220).anInt2526 + i_527_ * ((Class220) class220).anInt2527) / ((Class220) class220).anInt2528) >> 16);
                        int i_539_ = i_538_ > 256 ? i_529_ : i_530_;
                        int i_540_ = (i_528_ >> 1) + (i_539_ * i_538_ >> 17);
                        anIntArray6598[i_531_] = (i_540_ << 17 | Class226_Sub1_Sub1.method1808(i_540_, i_537_, (byte) 80));
                        if (aClass220Array6571 != null && (aClass220Array6571[aShortArray6597[i_531_]] != null))
                            class220 = aClass220Array6571[aShortArray6597[i_531_]];
                        else
                            class220 = aClass220Array6603[aShortArray6597[i_531_]];
                        i_538_ = ((i * ((Class220) class220).anInt2529 + i_526_ * ((Class220) class220).anInt2526 + i_527_ * ((Class220) class220).anInt2527) / ((Class220) class220).anInt2528) >> 16;
                        i_539_ = i_538_ > 256 ? i_529_ : i_530_;
                        i_540_ = (i_528_ >> 1) + (i_539_ * i_538_ >> 17);
                        anIntArray6630[i_531_] = (i_540_ << 17 | Class226_Sub1_Sub1.method1808(i_540_, i_537_, (byte) 80));
                        if (aClass220Array6571 != null && (aClass220Array6571[aShortArray6590[i_531_]] != null))
                            class220 = aClass220Array6571[aShortArray6590[i_531_]];
                        else
                            class220 = aClass220Array6603[aShortArray6590[i_531_]];
                        i_538_ = ((i * ((Class220) class220).anInt2529 + i_526_ * ((Class220) class220).anInt2526 + i_527_ * ((Class220) class220).anInt2527) / ((Class220) class220).anInt2528) >> 16;
                        i_539_ = i_538_ > 256 ? i_529_ : i_530_;
                        i_540_ = (i_528_ >> 1) + (i_539_ * i_538_ >> 17);
                        anIntArray6587[i_531_] = (i_540_ << 17 | Class226_Sub1_Sub1.method1808(i_540_, i_537_, (byte) 80));
                    } else if (i_532_ == 1) {
                        int i_541_ = aShortArray6585[i_531_] & 0xffff;
                        int i_542_ = (i_541_ & 0x7f) * anInt6564 >> 7;
                        short i_543_ = Class183.method1615((byte) -121, i_541_ & ~0x7f | i_542_);
                        Class274 class274 = aClass274Array6602[i_531_];
                        int i_544_ = ((i * ((Class274) class274).anInt3172 + i_526_ * ((Class274) class274).anInt3173 + i_527_ * ((Class274) class274).anInt3171) >> 16);
                        int i_545_ = i_544_ > 256 ? i_529_ : i_530_;
                        int i_546_ = (i_528_ >> 1) + (i_545_ * i_544_ >> 17);
                        anIntArray6598[i_531_] = (i_546_ << 17 | Class226_Sub1_Sub1.method1808(i_546_, i_543_, (byte) 80));
                        anIntArray6587[i_531_] = -1;
                    } else if (i_532_ == 3) {
                        anIntArray6598[i_531_] = 128;
                        anIntArray6587[i_531_] = -1;
                    } else
                        anIntArray6587[i_531_] = -2;
                } else {
                    int i_547_ = aShortArray6585[i_531_] & 0xffff;
                    if (i_532_ == 0) {
                        Class220 class220;
                        if (aClass220Array6571 != null && (aClass220Array6571[aShortArray6631[i_531_]] != null))
                            class220 = aClass220Array6571[aShortArray6631[i_531_]];
                        else
                            class220 = aClass220Array6603[aShortArray6631[i_531_]];
                        int i_548_ = (((i * ((Class220) class220).anInt2529 + i_526_ * ((Class220) class220).anInt2526 + i_527_ * ((Class220) class220).anInt2527) / ((Class220) class220).anInt2528) >> 16);
                        int i_549_ = i_548_ > 256 ? i_529_ : i_530_;
                        int i_550_ = method1495((i_528_ >> 2) + (i_549_ * i_548_ >> 18));
                        anIntArray6598[i_531_] = i_550_ << 24 | method1501(i_547_, i_534_, i_550_);
                        if (aClass220Array6571 != null && (aClass220Array6571[aShortArray6597[i_531_]] != null))
                            class220 = aClass220Array6571[aShortArray6597[i_531_]];
                        else
                            class220 = aClass220Array6603[aShortArray6597[i_531_]];
                        i_548_ = ((i * ((Class220) class220).anInt2529 + i_526_ * ((Class220) class220).anInt2526 + i_527_ * ((Class220) class220).anInt2527) / ((Class220) class220).anInt2528) >> 16;
                        i_549_ = i_548_ > 256 ? i_529_ : i_530_;
                        i_550_ = method1495((i_528_ >> 2) + (i_549_ * i_548_ >> 18));
                        anIntArray6630[i_531_] = i_550_ << 24 | method1501(i_547_, i_534_, i_550_);
                        if (aClass220Array6571 != null && (aClass220Array6571[aShortArray6590[i_531_]] != null))
                            class220 = aClass220Array6571[aShortArray6590[i_531_]];
                        else
                            class220 = aClass220Array6603[aShortArray6590[i_531_]];
                        i_548_ = ((i * ((Class220) class220).anInt2529 + i_526_ * ((Class220) class220).anInt2526 + i_527_ * ((Class220) class220).anInt2527) / ((Class220) class220).anInt2528) >> 16;
                        i_549_ = i_548_ > 256 ? i_529_ : i_530_;
                        i_550_ = method1495((i_528_ >> 2) + (i_549_ * i_548_ >> 18));
                        anIntArray6587[i_531_] = i_550_ << 24 | method1501(i_547_, i_534_, i_550_);
                    } else if (i_532_ == 1) {
                        Class274 class274 = aClass274Array6602[i_531_];
                        int i_551_ = ((i * ((Class274) class274).anInt3172 + i_526_ * ((Class274) class274).anInt3173 + i_527_ * ((Class274) class274).anInt3171) >> 16);
                        int i_552_ = i_551_ > 256 ? i_529_ : i_530_;
                        int i_553_ = method1495((i_528_ >> 2) + (i_552_ * i_551_ >> 18));
                        anIntArray6598[i_531_] = i_553_ << 24 | method1501(i_547_, i_534_, i_553_);
                        anIntArray6587[i_531_] = -1;
                    } else
                        anIntArray6587[i_531_] = -2;
                }
            }
            aClass220Array6603 = null;
            aClass220Array6571 = null;
            aClass274Array6602 = null;
            if ((anInt6600 & 0x97098) == 0 && aFloatArrayArray6584 == null)
                aShortArray6585 = null;
            if (bool)
                aByteArray6589 = null;
            anInt6561 = 2;
        }
    }

    final void s(int i) {
        if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
            synchronized (this) {
                if ((anInt6600 & 0x10000) == 65536 && (i & 0x10000) == 0)
                    method1504(true);
                anInt6600 = i;
            }
        } else {
            if ((anInt6600 & 0x10000) == 65536 && (i & 0x10000) == 0)
                method1504(true);
            anInt6600 = i;
        }
    }

    final void method1443(Viewport viewport, int i, boolean bool) {
        if (aShortArray6579 != null) {
            int[] is = new int[3];
            for (int i_554_ = 0; i_554_ < anInt6619; i_554_++) {
                if ((i & aShortArray6579[i_554_]) != 0) {
                    if (bool)
                        viewport.method1875(anIntArray6593[i_554_], anIntArray6645[i_554_], anIntArray6612[i_554_], is);
                    else
                        viewport.method1865(anIntArray6593[i_554_], anIntArray6645[i_554_], anIntArray6612[i_554_], is);
                    anIntArray6593[i_554_] = is[0];
                    anIntArray6645[i_554_] = is[1];
                    anIntArray6612[i_554_] = is[2];
                }
            }
        }
    }

    final boolean r() {
        return aBoolean6580;
    }

    private final void method1498(Thread thread) {
        Class203 class203 = aHa_Sub1_6596.method832(thread);
        aClass244_6562 = ((Class203) class203).aClass244_2345;
        if (class203 != aClass203_6568) {
            aClass203_6568 = class203;
            anIntArray6563 = ((Class203) aClass203_6568).anIntArray2348;
            anIntArray6633 = ((Class203) aClass203_6568).anIntArray2355;
            anIntArray6632 = ((Class203) aClass203_6568).anIntArray2321;
            anIntArray6625 = ((Class203) aClass203_6568).anIntArray2343;
            anIntArray6616 = ((Class203) aClass203_6568).anIntArray2329;
            anIntArray6578 = ((Class203) aClass203_6568).anIntArray2327;
            anIntArray6582 = ((Class203) aClass203_6568).anIntArray2341;
            anIntArray6643 = ((Class203) aClass203_6568).anIntArray2337;
            anIntArray6595 = ((Class203) aClass203_6568).anIntArray2340;
            anIntArray6642 = ((Class203) aClass203_6568).anIntArray2331;
            anIntArray6577 = ((Class203) aClass203_6568).anIntArray2326;
            anIntArray6573 = ((Class203) aClass203_6568).anIntArray2350;
            anIntArray6569 = ((Class203) aClass203_6568).anIntArray2351;
            anIntArray6636 = ((Class203) aClass203_6568).anIntArray2349;
            anIntArray6588 = ((Class203) aClass203_6568).anIntArray2342;
            anIntArray6640 = ((Class203) aClass203_6568).anIntArray2335;
            anIntArray6638 = ((Class203) aClass203_6568).anIntArray2322;
        }
    }

    final void k(int i) {
        if ((anInt6600 & 0xd) != 13)
            throw new IllegalStateException();
        if (aClass220Array6603 != null) {
            if (i == 4096)
                method1490();
            else if (i == 8192)
                method1499();
            else if (i == 12288)
                method1486();
            else {
                int i_555_ = Node_Sub9_Sub1.anIntArray9106[i];
                int i_556_ = Node_Sub9_Sub1.anIntArray9109[i];
                synchronized (this) {
                    for (int i_557_ = 0; i_557_ < anInt6619; i_557_++) {
                        int i_558_ = ((anIntArray6612[i_557_] * i_555_ + anIntArray6593[i_557_] * i_556_) >> 14);
                        anIntArray6612[i_557_] = (anIntArray6612[i_557_] * i_556_ - anIntArray6593[i_557_] * i_555_) >> 14;
                        anIntArray6593[i_557_] = i_558_;
                        if (aClass220Array6603[i_557_] != null) {
                            i_558_ = ((((Class220) aClass220Array6603[i_557_]).anInt2527) * i_555_ + (((Class220) aClass220Array6603[i_557_]).anInt2529) * i_556_) >> 14;
                            ((Class220) aClass220Array6603[i_557_]).anInt2527 = ((((Class220) aClass220Array6603[i_557_]).anInt2527) * i_556_ - (((Class220) aClass220Array6603[i_557_]).anInt2529) * i_555_) >> 14;
                            ((Class220) aClass220Array6603[i_557_]).anInt2529 = i_558_;
                        }
                    }
                    if (aClass274Array6602 != null) {
                        for (int i_559_ = 0; i_559_ < anInt6610; i_559_++) {
                            if (aClass274Array6602[i_559_] != null) {
                                int i_560_ = ((((Class274) aClass274Array6602[i_559_]).anInt3171) * i_555_ + (((Class274) (aClass274Array6602[i_559_])).anInt3172 * i_556_)) >> 14;
                                ((Class274) aClass274Array6602[i_559_]).anInt3171 = ((((Class274) aClass274Array6602[i_559_]).anInt3171) * i_556_ - (((Class274) (aClass274Array6602[i_559_])).anInt3172 * i_555_)) >> 14;
                                ((Class274) aClass274Array6602[i_559_]).anInt3172 = i_560_;
                            }
                        }
                    }
                    for (int i_561_ = anInt6619; i_561_ < anInt6644; i_561_++) {
                        int i_562_ = ((anIntArray6612[i_561_] * i_555_ + anIntArray6593[i_561_] * i_556_) >> 14);
                        anIntArray6612[i_561_] = (anIntArray6612[i_561_] * i_556_ - anIntArray6593[i_561_] * i_555_) >> 14;
                        anIntArray6593[i_561_] = i_562_;
                    }
                    anInt6561 = 0;
                    aBoolean6601 = false;
                }
            }
        } else
            a(i);
    }

    final Class124[] method1426() {
        return aClass124Array6572;
    }

    private final void method1499() {
        synchronized (this) {
            for (int i = 0; i < anInt6619; i++) {
                anIntArray6593[i] = -anIntArray6593[i];
                anIntArray6612[i] = -anIntArray6612[i];
                if (aClass220Array6603[i] != null) {
                    ((Class220) aClass220Array6603[i]).anInt2529 = -((Class220) aClass220Array6603[i]).anInt2529;
                    ((Class220) aClass220Array6603[i]).anInt2527 = -((Class220) aClass220Array6603[i]).anInt2527;
                }
            }
            if (aClass274Array6602 != null) {
                for (int i = 0; i < anInt6610; i++) {
                    if (aClass274Array6602[i] != null) {
                        ((Class274) aClass274Array6602[i]).anInt3172 = -((Class274) aClass274Array6602[i]).anInt3172;
                        ((Class274) aClass274Array6602[i]).anInt3171 = -((Class274) aClass274Array6602[i]).anInt3171;
                    }
                }
            }
            for (int i = anInt6619; i < anInt6644; i++) {
                anIntArray6593[i] = -anIntArray6593[i];
                anIntArray6612[i] = -anIntArray6612[i];
            }
            anInt6561 = 0;
            aBoolean6601 = false;
        }
    }

    private final void method1500(int i) {
        int i_563_ = 0;
        int i_564_ = ((ha_Sub1) aHa_Sub1_6596).anInt5568;
        short i_565_ = aShortArray6631[i];
        short i_566_ = aShortArray6597[i];
        short i_567_ = aShortArray6590[i];
        int i_568_ = anIntArray6625[i_565_];
        int i_569_ = anIntArray6625[i_566_];
        int i_570_ = anIntArray6625[i_567_];
        if (aByteArray6606 == null)
            ((Class244) aClass244_6562).anInt2718 = 0;
        else
            ((Class244) aClass244_6562).anInt2718 = aByteArray6606[i] & 0xff;
        if (i_568_ >= i_564_) {
            anIntArray6577[i_563_] = anIntArray6616[i_565_];
            anIntArray6573[i_563_] = anIntArray6578[i_565_];
            anIntArray6569[i_563_] = anIntArray6582[i_565_];
            anIntArray6636[i_563_++] = anIntArray6598[i] & 0xffff;
        } else {
            int i_571_ = anIntArray6633[i_565_];
            int i_572_ = anIntArray6632[i_565_];
            int i_573_ = anIntArray6598[i] & 0xffff;
            if (i_570_ >= i_564_) {
                int i_574_ = (i_564_ - i_568_) * (65536 / (i_570_ - i_568_));
                anIntArray6577[i_563_] = (((Class203) aClass203_6568).anInt2347 + ((i_571_ + ((anIntArray6633[i_567_] - i_571_) * i_574_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5550 / i_564_));
                anIntArray6573[i_563_] = (((Class203) aClass203_6568).anInt2346 + ((i_572_ + ((anIntArray6632[i_567_] - i_572_) * i_574_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5574 / i_564_));
                anIntArray6569[i_563_] = i_564_;
                anIntArray6636[i_563_++] = (i_573_ + (((anIntArray6587[i] & 0xffff) - i_573_) * i_574_ >> 16));
            }
            if (i_569_ >= i_564_) {
                int i_575_ = (i_564_ - i_568_) * (65536 / (i_569_ - i_568_));
                anIntArray6577[i_563_] = (((Class203) aClass203_6568).anInt2347 + ((i_571_ + ((anIntArray6633[i_566_] - i_571_) * i_575_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5550 / i_564_));
                anIntArray6573[i_563_] = (((Class203) aClass203_6568).anInt2346 + ((i_572_ + ((anIntArray6632[i_566_] - i_572_) * i_575_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5574 / i_564_));
                anIntArray6569[i_563_] = i_564_;
                anIntArray6636[i_563_++] = (i_573_ + (((anIntArray6630[i] & 0xffff) - i_573_) * i_575_ >> 16));
            }
        }
        if (i_569_ >= i_564_) {
            anIntArray6577[i_563_] = anIntArray6616[i_566_];
            anIntArray6573[i_563_] = anIntArray6578[i_566_];
            anIntArray6569[i_563_] = anIntArray6582[i_566_];
            anIntArray6636[i_563_++] = anIntArray6630[i] & 0xffff;
        } else {
            int i_576_ = anIntArray6633[i_566_];
            int i_577_ = anIntArray6632[i_566_];
            int i_578_ = anIntArray6630[i] & 0xffff;
            if (i_568_ >= i_564_) {
                int i_579_ = (i_564_ - i_569_) * (65536 / (i_568_ - i_569_));
                anIntArray6577[i_563_] = (((Class203) aClass203_6568).anInt2347 + ((i_576_ + ((anIntArray6633[i_565_] - i_576_) * i_579_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5550 / i_564_));
                anIntArray6573[i_563_] = (((Class203) aClass203_6568).anInt2346 + ((i_577_ + ((anIntArray6632[i_565_] - i_577_) * i_579_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5574 / i_564_));
                anIntArray6569[i_563_] = i_564_;
                anIntArray6636[i_563_++] = (i_578_ + (((anIntArray6598[i] & 0xffff) - i_578_) * i_579_ >> 16));
            }
            if (i_570_ >= i_564_) {
                int i_580_ = (i_564_ - i_569_) * (65536 / (i_570_ - i_569_));
                anIntArray6577[i_563_] = (((Class203) aClass203_6568).anInt2347 + ((i_576_ + ((anIntArray6633[i_567_] - i_576_) * i_580_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5550 / i_564_));
                anIntArray6573[i_563_] = (((Class203) aClass203_6568).anInt2346 + ((i_577_ + ((anIntArray6632[i_567_] - i_577_) * i_580_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5574 / i_564_));
                anIntArray6569[i_563_] = i_564_;
                anIntArray6636[i_563_++] = (i_578_ + (((anIntArray6587[i] & 0xffff) - i_578_) * i_580_ >> 16));
            }
        }
        if (i_570_ >= i_564_) {
            anIntArray6577[i_563_] = anIntArray6616[i_567_];
            anIntArray6573[i_563_] = anIntArray6578[i_567_];
            anIntArray6569[i_563_] = anIntArray6582[i_567_];
            anIntArray6636[i_563_++] = anIntArray6587[i] & 0xffff;
        } else {
            int i_581_ = anIntArray6633[i_567_];
            int i_582_ = anIntArray6632[i_567_];
            int i_583_ = anIntArray6587[i] & 0xffff;
            if (i_569_ >= i_564_) {
                int i_584_ = (i_564_ - i_570_) * (65536 / (i_569_ - i_570_));
                anIntArray6577[i_563_] = (((Class203) aClass203_6568).anInt2347 + ((i_581_ + ((anIntArray6633[i_566_] - i_581_) * i_584_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5550 / i_564_));
                anIntArray6573[i_563_] = (((Class203) aClass203_6568).anInt2346 + ((i_582_ + ((anIntArray6632[i_566_] - i_582_) * i_584_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5574 / i_564_));
                anIntArray6569[i_563_] = i_564_;
                anIntArray6636[i_563_++] = (i_583_ + (((anIntArray6630[i] & 0xffff) - i_583_) * i_584_ >> 16));
            }
            if (i_568_ >= i_564_) {
                int i_585_ = (i_564_ - i_570_) * (65536 / (i_568_ - i_570_));
                anIntArray6577[i_563_] = (((Class203) aClass203_6568).anInt2347 + ((i_581_ + ((anIntArray6633[i_565_] - i_581_) * i_585_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5550 / i_564_));
                anIntArray6573[i_563_] = (((Class203) aClass203_6568).anInt2346 + ((i_582_ + ((anIntArray6632[i_565_] - i_582_) * i_585_ >> 16)) * ((ha_Sub1) aHa_Sub1_6596).anInt5574 / i_564_));
                anIntArray6569[i_563_] = i_564_;
                anIntArray6636[i_563_++] = (i_583_ + (((anIntArray6598[i] & 0xffff) - i_583_) * i_585_ >> 16));
            }
        }
        int i_586_ = anIntArray6577[0];
        int i_587_ = anIntArray6577[1];
        int i_588_ = anIntArray6577[2];
        int i_589_ = anIntArray6573[0];
        int i_590_ = anIntArray6573[1];
        int i_591_ = anIntArray6573[2];
        i_568_ = anIntArray6569[0];
        i_569_ = anIntArray6569[1];
        i_570_ = anIntArray6569[2];
        ((Class244) aClass244_6562).aBoolean2723 = false;
        if (i_563_ == 3) {
            if (i_586_ < 0 || i_587_ < 0 || i_588_ < 0 || i_586_ > ((Class203) aClass203_6568).anInt2323 || i_587_ > ((Class203) aClass203_6568).anInt2323 || i_588_ > ((Class203) aClass203_6568).anInt2323)
                ((Class244) aClass244_6562).aBoolean2723 = true;
            if (aShortArray6629 == null || aShortArray6629[i] == -1) {
                if (anIntArray6587[i] == -1)
                    aClass244_6562.method1949((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, (Node.anIntArray2801[anIntArray6598[i] & 0xffff]));
                else
                    aClass244_6562.method1951((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, (float) anIntArray6636[0], (float) anIntArray6636[1], (float) anIntArray6636[2]);
            } else {
                int i_592_ = -16777216;
                if (aByteArray6606 != null)
                    i_592_ = 255 - (aByteArray6606[i] & 0xff) << 24;
                int i_593_ = i_592_ | anIntArray6598[i] & 0xffffff;
                if (anIntArray6587[i] == -1)
                    aClass244_6562.method1948((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_593_, i_593_, i_593_, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
                else
                    aClass244_6562.method1948((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_593_, i_593_, i_593_, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
            }
        }
        if (i_563_ == 4) {
            if (i_586_ < 0 || i_587_ < 0 || i_588_ < 0 || i_586_ > ((Class203) aClass203_6568).anInt2323 || i_587_ > ((Class203) aClass203_6568).anInt2323 || i_588_ > ((Class203) aClass203_6568).anInt2323 || anIntArray6577[3] < 0 || anIntArray6577[3] > ((Class203) aClass203_6568).anInt2323)
                ((Class244) aClass244_6562).aBoolean2723 = true;
            if (aShortArray6629 == null || aShortArray6629[i] == -1) {
                if (anIntArray6587[i] == -1) {
                    int i_594_ = Node.anIntArray2801[anIntArray6598[i] & 0xffff];
                    aClass244_6562.method1949((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, i_594_);
                    aClass244_6562.method1949((float) i_589_, (float) i_591_, (float) anIntArray6573[3], (float) i_586_, (float) i_588_, (float) anIntArray6577[3], (float) i_568_, (float) i_569_, (float) anIntArray6569[3], i_594_);
                } else {
                    aClass244_6562.method1951((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, (float) anIntArray6636[0], (float) anIntArray6636[1], (float) anIntArray6636[2]);
                    aClass244_6562.method1951((float) i_589_, (float) i_591_, (float) anIntArray6573[3], (float) i_586_, (float) i_588_, (float) anIntArray6577[3], (float) i_568_, (float) i_569_, (float) anIntArray6569[3], (float) anIntArray6636[0], (float) anIntArray6636[2], (float) anIntArray6636[3]);
                }
            } else {
                int i_595_ = -16777216;
                if (aByteArray6606 != null)
                    i_595_ = 255 - (aByteArray6606[i] & 0xff) << 24;
                int i_596_ = i_595_ | anIntArray6598[i] & 0xffffff;
                if (anIntArray6587[i] == -1) {
                    aClass244_6562.method1948((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_596_, i_596_, i_596_, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
                    aClass244_6562.method1948((float) i_589_, (float) i_591_, (float) anIntArray6573[3], (float) i_586_, (float) i_588_, (float) anIntArray6577[3], (float) i_568_, (float) i_570_, (float) anIntArray6569[3], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_596_, i_596_, i_596_, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
                } else {
                    aClass244_6562.method1948((float) i_589_, (float) i_590_, (float) i_591_, (float) i_586_, (float) i_587_, (float) i_588_, (float) i_568_, (float) i_569_, (float) i_570_, aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_596_, i_596_, i_596_, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
                    aClass244_6562.method1948((float) i_589_, (float) i_591_, (float) anIntArray6573[3], (float) i_586_, (float) i_588_, (float) anIntArray6577[3], (float) i_568_, (float) i_570_, (float) anIntArray6569[3], aFloatArrayArray6584[i][0], aFloatArrayArray6584[i][1], aFloatArrayArray6584[i][2], aFloatArrayArray6604[i][0], aFloatArrayArray6604[i][1], aFloatArrayArray6604[i][2], i_596_, i_596_, i_596_, (((Class203) aClass203_6568).anInt2303), 0, 0, 0, aShortArray6629[i]);
                }
            }
        }
    }

    private final int method1501(int i, short i_597_, int i_598_) {
        int i_599_ = Node_Sub14_Sub39.anIntArray9600[method1493(i, i_598_)];
        Class312 class312 = ((ha) aHa_Sub1_6596).aD1414.method25(i_597_ & 0xffff, (byte) 125);
        int i_600_ = ((Class312) class312).aByte3630 & 0xff;
        if (i_600_ != 0) {
            int i_601_ = 131586 * i_598_;
            if (i_600_ == 256)
                i_599_ = i_601_;
            else {
                int i_602_ = i_600_;
                int i_603_ = 256 - i_600_;
                i_599_ = ((((i_601_ & 0xff00ff) * i_602_ + (i_599_ & 0xff00ff) * i_603_) & ~0xff00ff) + (((i_601_ & 0xff00) * i_602_ + (i_599_ & 0xff00) * i_603_) & 0xff0000)) >> 8;
            }
        }
        int i_604_ = ((Class312) class312).aByte3625 & 0xff;
        if (i_604_ != 0) {
            i_604_ += 256;
            int i_605_ = ((i_599_ & 0xff0000) >> 16) * i_604_;
            if (i_605_ > 65535)
                i_605_ = 65535;
            int i_606_ = ((i_599_ & 0xff00) >> 8) * i_604_;
            if (i_606_ > 65535)
                i_606_ = 65535;
            int i_607_ = (i_599_ & 0xff) * i_604_;
            if (i_607_ > 65535)
                i_607_ = 65535;
            i_599_ = (i_605_ << 8 & 0xff0000) + (i_606_ & 0xff00) + (i_607_ >> 8);
        }
        return i_599_;
    }

    final void method1433(int i, int i_608_, int i_609_, int i_610_) {
        if ((anInt6600 & 0x80000) != 524288)
            throw new IllegalStateException("FMT");
        for (int i_611_ = 0; i_611_ < anInt6610; i_611_++) {
            int i_612_ = aShortArray6585[i_611_] & 0xffff;
            int i_613_ = i_612_ >> 10 & 0x3f;
            int i_614_ = i_612_ >> 7 & 0x7;
            int i_615_ = i_612_ & 0x7f;
            if (i != -1)
                i_613_ += (i - i_613_) * i_610_ >> 7;
            if (i_608_ != -1)
                i_614_ += (i_608_ - i_614_) * i_610_ >> 7;
            if (i_609_ != -1)
                i_615_ += (i_609_ - i_615_) * i_610_ >> 7;
            aShortArray6585[i_611_] = (short) (i_613_ << 10 | i_614_ << 7 | i_615_);
        }
        if (aClass268Array6647 != null) {
            for (int i_616_ = 0; i_616_ < anInt6567; i_616_++) {
                Class268 class268 = aClass268Array6647[i_616_];
                Class375 class375 = aClass375Array6618[i_616_];
                ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & ~0xffffff | ((Node.anIntArray2801[Class183.method1615((byte) -117, (aShortArray6585[(((Class268) class268).anInt3117)]) & 0xffff)]) & 0xffffff));
            }
        }
        if (anInt6561 == 2)
            anInt6561 = 1;
    }

    final void method1442(Viewport viewport) {
        Class238_Sub1 class238_sub1 = (Class238_Sub1) viewport;
        if (aClass40Array6566 != null) {
            for (int i = 0; i < aClass40Array6566.length; i++) {
                Class40 class40 = aClass40Array6566[i];
                Class40 class40_617_ = class40;
                if (((Class40) class40).aClass40_448 != null)
                    class40_617_ = ((Class40) class40).aClass40_448;
                ((Class40) class40_617_).anInt447 = (int) (((Class238_Sub1) class238_sub1).aFloat6686 + ((((Class238_Sub1) class238_sub1).aFloat6688 * (float) (anIntArray6593[((Class40) class40).anInt446])) + (((Class238_Sub1) class238_sub1).aFloat6680 * (float) (anIntArray6645[((Class40) class40).anInt446])) + (((Class238_Sub1) class238_sub1).aFloat6683 * (float) (anIntArray6612[(((Class40) class40).anInt446)]))));
                ((Class40) class40_617_).anInt458 = (int) (((Class238_Sub1) class238_sub1).aFloat6677 + ((((Class238_Sub1) class238_sub1).aFloat6702 * (float) (anIntArray6593[((Class40) class40).anInt446])) + (((Class238_Sub1) class238_sub1).aFloat6698 * (float) (anIntArray6645[((Class40) class40).anInt446])) + (((Class238_Sub1) class238_sub1).aFloat6697 * (float) (anIntArray6612[(((Class40) class40).anInt446)]))));
                ((Class40) class40_617_).anInt457 = (int) (((Class238_Sub1) class238_sub1).aFloat6675 + ((((Class238_Sub1) class238_sub1).aFloat6694 * (float) (anIntArray6593[((Class40) class40).anInt446])) + (((Class238_Sub1) class238_sub1).aFloat6692 * (float) (anIntArray6645[((Class40) class40).anInt446])) + (((Class238_Sub1) class238_sub1).aFloat6699 * (float) (anIntArray6612[(((Class40) class40).anInt446)]))));
                ((Class40) class40_617_).anInt453 = (int) (((Class238_Sub1) class238_sub1).aFloat6686 + ((((Class238_Sub1) class238_sub1).aFloat6688 * (float) (anIntArray6593[((Class40) class40).anInt451])) + (((Class238_Sub1) class238_sub1).aFloat6680 * (float) (anIntArray6645[((Class40) class40).anInt451])) + (((Class238_Sub1) class238_sub1).aFloat6683 * (float) (anIntArray6612[(((Class40) class40).anInt451)]))));
                ((Class40) class40_617_).anInt452 = (int) (((Class238_Sub1) class238_sub1).aFloat6677 + ((((Class238_Sub1) class238_sub1).aFloat6702 * (float) (anIntArray6593[((Class40) class40).anInt451])) + (((Class238_Sub1) class238_sub1).aFloat6698 * (float) (anIntArray6645[((Class40) class40).anInt451])) + (((Class238_Sub1) class238_sub1).aFloat6697 * (float) (anIntArray6612[(((Class40) class40).anInt451)]))));
                ((Class40) class40_617_).anInt440 = (int) (((Class238_Sub1) class238_sub1).aFloat6675 + ((((Class238_Sub1) class238_sub1).aFloat6694 * (float) (anIntArray6593[((Class40) class40).anInt451])) + (((Class238_Sub1) class238_sub1).aFloat6692 * (float) (anIntArray6645[((Class40) class40).anInt451])) + (((Class238_Sub1) class238_sub1).aFloat6699 * (float) (anIntArray6612[(((Class40) class40).anInt451)]))));
                ((Class40) class40_617_).anInt439 = (int) (((Class238_Sub1) class238_sub1).aFloat6686 + ((((Class238_Sub1) class238_sub1).aFloat6688 * (float) (anIntArray6593[((Class40) class40).anInt456])) + (((Class238_Sub1) class238_sub1).aFloat6680 * (float) (anIntArray6645[((Class40) class40).anInt456])) + (((Class238_Sub1) class238_sub1).aFloat6683 * (float) (anIntArray6612[(((Class40) class40).anInt456)]))));
                ((Class40) class40_617_).anInt441 = (int) (((Class238_Sub1) class238_sub1).aFloat6677 + ((((Class238_Sub1) class238_sub1).aFloat6702 * (float) (anIntArray6593[((Class40) class40).anInt456])) + (((Class238_Sub1) class238_sub1).aFloat6698 * (float) (anIntArray6645[((Class40) class40).anInt456])) + (((Class238_Sub1) class238_sub1).aFloat6697 * (float) (anIntArray6612[(((Class40) class40).anInt456)]))));
                ((Class40) class40_617_).anInt455 = (int) (((Class238_Sub1) class238_sub1).aFloat6675 + ((((Class238_Sub1) class238_sub1).aFloat6694 * (float) (anIntArray6593[((Class40) class40).anInt456])) + (((Class238_Sub1) class238_sub1).aFloat6692 * (float) (anIntArray6645[((Class40) class40).anInt456])) + (((Class238_Sub1) class238_sub1).aFloat6699 * (float) (anIntArray6612[(((Class40) class40).anInt456)]))));
            }
        }
        if (aClass124Array6572 != null) {
            for (int i = 0; i < aClass124Array6572.length; i++) {
                Class124 class124 = aClass124Array6572[i];
                Class124 class124_618_ = class124;
                if (((Class124) class124).aClass124_1531 != null)
                    class124_618_ = ((Class124) class124).aClass124_1531;
                if (((Class124) class124).aViewport_1533 != null)
                    ((Class124) class124).aViewport_1533.method1868(class238_sub1);
                else
                    ((Class124) class124).aViewport_1533 = class238_sub1.method1863();
                ((Class124) class124_618_).anInt1536 = (int) (((Class238_Sub1) class238_sub1).aFloat6686 + ((((Class238_Sub1) class238_sub1).aFloat6688 * (float) (anIntArray6593[((Class124) class124).anInt1529])) + (((Class238_Sub1) class238_sub1).aFloat6680 * (float) (anIntArray6645[(((Class124) class124).anInt1529)])) + (((Class238_Sub1) class238_sub1).aFloat6683 * (float) (anIntArray6612[(((Class124) class124).anInt1529)]))));
                ((Class124) class124_618_).anInt1535 = (int) (((Class238_Sub1) class238_sub1).aFloat6677 + ((((Class238_Sub1) class238_sub1).aFloat6702 * (float) (anIntArray6593[((Class124) class124).anInt1529])) + (((Class238_Sub1) class238_sub1).aFloat6698 * (float) (anIntArray6645[(((Class124) class124).anInt1529)])) + (((Class238_Sub1) class238_sub1).aFloat6697 * (float) (anIntArray6612[(((Class124) class124).anInt1529)]))));
                ((Class124) class124_618_).anInt1542 = (int) (((Class238_Sub1) class238_sub1).aFloat6675 + ((((Class238_Sub1) class238_sub1).aFloat6694 * (float) (anIntArray6593[((Class124) class124).anInt1529])) + (((Class238_Sub1) class238_sub1).aFloat6692 * (float) (anIntArray6645[(((Class124) class124).anInt1529)])) + (((Class238_Sub1) class238_sub1).aFloat6699 * (float) (anIntArray6612[(((Class124) class124).anInt1529)]))));
            }
        }
    }

    private final void method1502() {
        if (anInt6561 == 0 && aClass220Array6603 == null) {
            if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
                synchronized (this) {
                    method1496();
                }
            } else
                method1496();
        }
    }

    final void v() {
        if ((anInt6600 & 0x10) != 16)
            throw new IllegalStateException();
        synchronized (this) {
            for (int i = 0; i < anInt6644; i++)
                anIntArray6612[i] = -anIntArray6612[i];
            if (aClass220Array6603 != null) {
                for (int i = 0; i < anInt6619; i++) {
                    if (aClass220Array6603[i] != null)
                        ((Class220) aClass220Array6603[i]).anInt2527 = -((Class220) aClass220Array6603[i]).anInt2527;
                }
            }
            if (aClass220Array6571 != null) {
                for (int i = 0; i < anInt6619; i++) {
                    if (aClass220Array6571[i] != null)
                        ((Class220) aClass220Array6571[i]).anInt2527 = -((Class220) aClass220Array6571[i]).anInt2527;
                }
            }
            if (aClass274Array6602 != null) {
                for (int i = 0; i < anInt6610; i++) {
                    if (aClass274Array6602[i] != null)
                        ((Class274) aClass274Array6602[i]).anInt3171 = -((Class274) aClass274Array6602[i]).anInt3171;
                }
            }
            short[] is = aShortArray6631;
            aShortArray6631 = aShortArray6590;
            aShortArray6590 = is;
            if (aFloatArrayArray6584 != null) {
                for (int i = 0; i < anInt6610; i++) {
                    if (aFloatArrayArray6584[i] != null) {
                        float f = aFloatArrayArray6584[i][0];
                        aFloatArrayArray6584[i][0] = aFloatArrayArray6584[i][2];
                        aFloatArrayArray6584[i][2] = f;
                    }
                    if (aFloatArrayArray6604[i] != null) {
                        float f = aFloatArrayArray6604[i][0];
                        aFloatArrayArray6604[i][0] = aFloatArrayArray6604[i][2];
                        aFloatArrayArray6604[i][2] = f;
                    }
                }
            }
            aBoolean6601 = false;
            anInt6561 = 0;
        }
    }

    final boolean method1420(int i, int i_619_, Viewport viewport, boolean bool, int i_620_, int i_621_) {
        return method1482(i, i_619_, viewport, bool, i_620_, i_621_);
    }

    private final void method1503() {
        aClass220Array6603 = null;
        aClass220Array6571 = null;
        aClass274Array6602 = null;
        aBoolean6601 = false;
    }

    final int G() {
        if (!aBoolean6601)
            method1483();
        return aShort6559;
    }

    final void ia(short i, short i_622_) {
        for (int i_623_ = 0; i_623_ < anInt6610; i_623_++) {
            if (aShortArray6585[i_623_] == i)
                aShortArray6585[i_623_] = i_622_;
        }
        if (aClass268Array6647 != null) {
            for (int i_624_ = 0; i_624_ < anInt6567; i_624_++) {
                Class268 class268 = aClass268Array6647[i_624_];
                Class375 class375 = aClass375Array6618[i_624_];
                ((Class375) class375).anInt4600 = (((Class375) class375).anInt4600 & ~0xffffff | ((Node.anIntArray2801[Class183.method1615((byte) -128, (aShortArray6585[(((Class268) class268).anInt3117)])) & 0xffff]) & 0xffffff));
            }
        }
        if (anInt6561 == 2)
            anInt6561 = 1;
    }

    final void p(int i, int i_625_, s var_s, s var_s_626_, int i_627_, int i_628_, int i_629_) {
        if (i == 3) {
            if ((anInt6600 & 0x7) != 7)
                throw new IllegalStateException();
        } else if ((anInt6600 & 0x2) != 2)
            throw new IllegalStateException();
        if (!aBoolean6601)
            method1483();
        int i_630_ = i_627_ + aShort6613;
        int i_631_ = i_627_ + aShort6560;
        int i_632_ = i_629_ + aShort6594;
        int i_633_ = i_629_ + aShort6559;
        if (i == 4 || (i_630_ >= 0 && (i_631_ + ((s) var_s).anInt3465 >> ((s) var_s).anInt3466 < ((s) var_s).anInt3468) && i_632_ >= 0 && (i_633_ + ((s) var_s).anInt3465 >> ((s) var_s).anInt3466 < ((s) var_s).anInt3472))) {
            int[][] is = ((s) (s_Sub1) var_s).anIntArrayArray3464;
            int[][] is_634_ = null;
            if (var_s_626_ != null)
                is_634_ = ((s) (s_Sub1) var_s_626_).anIntArrayArray3464;
            if (i == 4 || i == 5) {
                if (var_s_626_ == null || (i_630_ < 0 || ((i_631_ + ((s) var_s_626_).anInt3465 >> ((s) var_s_626_).anInt3466) >= ((s) var_s_626_).anInt3468) || i_632_ < 0 || ((i_633_ + ((s) var_s_626_).anInt3465 >> ((s) var_s_626_).anInt3466) >= ((s) var_s_626_).anInt3472)))
                    return;
            } else {
                i_630_ >>= ((s) var_s).anInt3466;
                i_631_ = (i_631_ + (((s) var_s).anInt3465 - 1) >> ((s) var_s).anInt3466);
                i_632_ >>= ((s) var_s).anInt3466;
                i_633_ = (i_633_ + (((s) var_s).anInt3465 - 1) >> ((s) var_s).anInt3466);
                if (is[i_630_][i_632_] == i_628_ && is[i_631_][i_632_] == i_628_ && is[i_630_][i_633_] == i_628_ && is[i_631_][i_633_] == i_628_)
                    return;
            }
            synchronized (this) {
                if (i == 1) {
                    int i_635_ = ((s) var_s).anInt3465 - 1;
                    for (int i_636_ = 0; i_636_ < anInt6619; i_636_++) {
                        int i_637_ = anIntArray6593[i_636_] + i_627_;
                        int i_638_ = anIntArray6612[i_636_] + i_629_;
                        int i_639_ = i_637_ & i_635_;
                        int i_640_ = i_638_ & i_635_;
                        int i_641_ = i_637_ >> ((s) var_s).anInt3466;
                        int i_642_ = i_638_ >> ((s) var_s).anInt3466;
                        int i_643_ = ((is[i_641_][i_642_] * (((s) var_s).anInt3465 - i_639_) + is[i_641_ + 1][i_642_] * i_639_) >> ((s) var_s).anInt3466);
                        int i_644_ = ((is[i_641_][i_642_ + 1] * (((s) var_s).anInt3465 - i_639_) + is[i_641_ + 1][i_642_ + 1] * i_639_) >> ((s) var_s).anInt3466);
                        int i_645_ = (i_643_ * (((s) var_s).anInt3465 - i_640_) + i_644_ * i_640_ >> ((s) var_s).anInt3466);
                        anIntArray6645[i_636_] = anIntArray6645[i_636_] + i_645_ - i_628_;
                    }
                    for (int i_646_ = anInt6619; i_646_ < anInt6644; i_646_++) {
                        int i_647_ = anIntArray6593[i_646_] + i_627_;
                        int i_648_ = anIntArray6612[i_646_] + i_629_;
                        int i_649_ = i_647_ & i_635_;
                        int i_650_ = i_648_ & i_635_;
                        int i_651_ = i_647_ >> ((s) var_s).anInt3466;
                        int i_652_ = i_648_ >> ((s) var_s).anInt3466;
                        if (i_651_ >= 0 && i_651_ < is.length - 1 && i_652_ >= 0 && i_652_ < is[0].length - 1) {
                            int i_653_ = ((is[i_651_][i_652_] * (((s) var_s).anInt3465 - i_649_) + is[i_651_ + 1][i_652_] * i_649_) >> ((s) var_s).anInt3466);
                            int i_654_ = (((is[i_651_][i_652_ + 1] * (((s) var_s).anInt3465 - i_649_)) + is[i_651_ + 1][i_652_ + 1] * i_649_) >> ((s) var_s).anInt3466);
                            int i_655_ = (i_653_ * (((s) var_s).anInt3465 - i_650_) + i_654_ * i_650_ >> ((s) var_s).anInt3466);
                            anIntArray6645[i_646_] = anIntArray6645[i_646_] + i_655_ - i_628_;
                        }
                    }
                } else if (i == 2) {
                    int i_656_ = ((s) var_s).anInt3465 - 1;
                    for (int i_657_ = 0; i_657_ < anInt6619; i_657_++) {
                        int i_658_ = (anIntArray6645[i_657_] << 16) / aShort6575;
                        if (i_658_ < i_625_) {
                            int i_659_ = anIntArray6593[i_657_] + i_627_;
                            int i_660_ = anIntArray6612[i_657_] + i_629_;
                            int i_661_ = i_659_ & i_656_;
                            int i_662_ = i_660_ & i_656_;
                            int i_663_ = i_659_ >> ((s) var_s).anInt3466;
                            int i_664_ = i_660_ >> ((s) var_s).anInt3466;
                            int i_665_ = ((is[i_663_][i_664_] * (((s) var_s).anInt3465 - i_661_) + is[i_663_ + 1][i_664_] * i_661_) >> ((s) var_s).anInt3466);
                            int i_666_ = (((is[i_663_][i_664_ + 1] * (((s) var_s).anInt3465 - i_661_)) + is[i_663_ + 1][i_664_ + 1] * i_661_) >> ((s) var_s).anInt3466);
                            int i_667_ = (i_665_ * (((s) var_s).anInt3465 - i_662_) + i_666_ * i_662_ >> ((s) var_s).anInt3466);
                            anIntArray6645[i_657_] = anIntArray6645[i_657_] + ((i_667_ - i_628_) * (i_625_ - i_658_) / i_625_);
                        } else
                            anIntArray6645[i_657_] = anIntArray6645[i_657_];
                    }
                    for (int i_668_ = anInt6619; i_668_ < anInt6644; i_668_++) {
                        int i_669_ = (anIntArray6645[i_668_] << 16) / aShort6575;
                        if (i_669_ < i_625_) {
                            int i_670_ = anIntArray6593[i_668_] + i_627_;
                            int i_671_ = anIntArray6612[i_668_] + i_629_;
                            int i_672_ = i_670_ & i_656_;
                            int i_673_ = i_671_ & i_656_;
                            int i_674_ = i_670_ >> ((s) var_s).anInt3466;
                            int i_675_ = i_671_ >> ((s) var_s).anInt3466;
                            if (i_674_ >= 0 && i_674_ < ((s) var_s).anInt3468 - 1 && i_675_ >= 0 && i_675_ < ((s) var_s).anInt3472 - 1) {
                                int i_676_ = (((is[i_674_][i_675_] * (((s) var_s).anInt3465 - i_672_)) + is[i_674_ + 1][i_675_] * i_672_) >> ((s) var_s).anInt3466);
                                int i_677_ = (((is[i_674_][i_675_ + 1] * (((s) var_s).anInt3465 - i_672_)) + is[i_674_ + 1][i_675_ + 1] * i_672_) >> ((s) var_s).anInt3466);
                                int i_678_ = (i_676_ * (((s) var_s).anInt3465 - i_673_) + i_677_ * i_673_ >> ((s) var_s).anInt3466);
                                anIntArray6645[i_668_] = (anIntArray6645[i_668_] + ((i_678_ - i_628_) * (i_625_ - i_669_) / i_625_));
                            }
                        } else
                            anIntArray6645[i_668_] = anIntArray6645[i_668_];
                    }
                } else if (i == 3) {
                    int i_679_ = (i_625_ & 0xff) * 4;
                    int i_680_ = (i_625_ >> 8 & 0xff) * 4;
                    int i_681_ = (i_625_ >> 16 & 0xff) << 6;
                    int i_682_ = (i_625_ >> 24 & 0xff) << 6;
                    if (i_627_ - (i_679_ >> 1) < 0 || (i_627_ + (i_679_ >> 1) + ((s) var_s).anInt3465 >= ((s) var_s).anInt3468 << ((s) var_s).anInt3466) || i_629_ - (i_680_ >> 1) < 0 || (i_629_ + (i_680_ >> 1) + ((s) var_s).anInt3465 >= ((s) var_s).anInt3472 << ((s) var_s).anInt3466))
                        return;
                    this.method1429(var_s, i_681_, i_629_, i_627_, i_679_, 0, i_682_, i_628_, i_680_);
                } else if (i == 4) {
                    int i_683_ = ((s) var_s_626_).anInt3465 - 1;
                    int i_684_ = aShort6634 - aShort6575;
                    for (int i_685_ = 0; i_685_ < anInt6619; i_685_++) {
                        int i_686_ = anIntArray6593[i_685_] + i_627_;
                        int i_687_ = anIntArray6612[i_685_] + i_629_;
                        int i_688_ = i_686_ & i_683_;
                        int i_689_ = i_687_ & i_683_;
                        int i_690_ = i_686_ >> ((s) var_s_626_).anInt3466;
                        int i_691_ = i_687_ >> ((s) var_s_626_).anInt3466;
                        int i_692_ = (((is_634_[i_690_][i_691_] * (((s) var_s_626_).anInt3465 - i_688_)) + is_634_[i_690_ + 1][i_691_] * i_688_) >> ((s) var_s_626_).anInt3466);
                        int i_693_ = (((is_634_[i_690_][i_691_ + 1] * (((s) var_s_626_).anInt3465 - i_688_)) + is_634_[i_690_ + 1][i_691_ + 1] * i_688_) >> ((s) var_s_626_).anInt3466);
                        int i_694_ = (i_692_ * (((s) var_s_626_).anInt3465 - i_689_) + i_693_ * i_689_ >> ((s) var_s_626_).anInt3466);
                        anIntArray6645[i_685_] = (anIntArray6645[i_685_] + (i_694_ - i_628_) + i_684_);
                    }
                    for (int i_695_ = anInt6619; i_695_ < anInt6644; i_695_++) {
                        int i_696_ = anIntArray6593[i_695_] + i_627_;
                        int i_697_ = anIntArray6612[i_695_] + i_629_;
                        int i_698_ = i_696_ & i_683_;
                        int i_699_ = i_697_ & i_683_;
                        int i_700_ = i_696_ >> ((s) var_s_626_).anInt3466;
                        int i_701_ = i_697_ >> ((s) var_s_626_).anInt3466;
                        if (i_700_ >= 0 && i_700_ < ((s) var_s_626_).anInt3468 - 1 && i_701_ >= 0 && i_701_ < ((s) var_s_626_).anInt3472 - 1) {
                            int i_702_ = (((is_634_[i_700_][i_701_] * (((s) var_s_626_).anInt3465 - i_698_)) + is_634_[i_700_ + 1][i_701_] * i_698_) >> ((s) var_s_626_).anInt3466);
                            int i_703_ = (((is_634_[i_700_][i_701_ + 1] * (((s) var_s_626_).anInt3465 - i_698_)) + is_634_[i_700_ + 1][i_701_ + 1] * i_698_) >> ((s) var_s_626_).anInt3466);
                            int i_704_ = (i_702_ * (((s) var_s_626_).anInt3465 - i_699_) + i_703_ * i_699_ >> ((s) var_s_626_).anInt3466);
                            anIntArray6645[i_695_] = (anIntArray6645[i_695_] + (i_704_ - i_628_) + i_684_);
                        }
                    }
                } else if (i == 5) {
                    int i_705_ = ((s) var_s_626_).anInt3465 - 1;
                    int i_706_ = aShort6634 - aShort6575;
                    for (int i_707_ = 0; i_707_ < anInt6619; i_707_++) {
                        int i_708_ = anIntArray6593[i_707_] + i_627_;
                        int i_709_ = anIntArray6612[i_707_] + i_629_;
                        int i_710_ = i_708_ & i_705_;
                        int i_711_ = i_709_ & i_705_;
                        int i_712_ = i_708_ >> ((s) var_s).anInt3466;
                        int i_713_ = i_709_ >> ((s) var_s).anInt3466;
                        int i_714_ = ((is[i_712_][i_713_] * (((s) var_s).anInt3465 - i_710_) + is[i_712_ + 1][i_713_] * i_710_) >> ((s) var_s).anInt3466);
                        int i_715_ = ((is[i_712_][i_713_ + 1] * (((s) var_s).anInt3465 - i_710_) + is[i_712_ + 1][i_713_ + 1] * i_710_) >> ((s) var_s).anInt3466);
                        int i_716_ = (i_714_ * (((s) var_s).anInt3465 - i_711_) + i_715_ * i_711_ >> ((s) var_s).anInt3466);
                        i_714_ = (((is_634_[i_712_][i_713_] * (((s) var_s_626_).anInt3465 - i_710_)) + is_634_[i_712_ + 1][i_713_] * i_710_) >> ((s) var_s_626_).anInt3466);
                        i_715_ = (((is_634_[i_712_][i_713_ + 1] * (((s) var_s_626_).anInt3465 - i_710_)) + is_634_[i_712_ + 1][i_713_ + 1] * i_710_) >> ((s) var_s_626_).anInt3466);
                        int i_717_ = (i_714_ * (((s) var_s_626_).anInt3465 - i_711_) + i_715_ * i_711_ >> ((s) var_s_626_).anInt3466);
                        int i_718_ = i_716_ - i_717_ - i_625_;
                        anIntArray6645[i_707_] = ((anIntArray6645[i_707_] << 8) / i_706_ * i_718_ >> 8) - (i_628_ - i_716_);
                    }
                    for (int i_719_ = anInt6619; i_719_ < anInt6644; i_719_++) {
                        int i_720_ = anIntArray6593[i_719_] + i_627_;
                        int i_721_ = anIntArray6612[i_719_] + i_629_;
                        int i_722_ = i_720_ & i_705_;
                        int i_723_ = i_721_ & i_705_;
                        int i_724_ = i_720_ >> ((s) var_s).anInt3466;
                        int i_725_ = i_721_ >> ((s) var_s).anInt3466;
                        if (i_724_ >= 0 && i_724_ < ((s) var_s).anInt3468 - 1 && i_724_ < ((s) var_s_626_).anInt3468 - 1 && i_725_ >= 0 && i_725_ < ((s) var_s).anInt3472 - 1 && i_725_ < ((s) var_s_626_).anInt3472 - 1) {
                            int i_726_ = ((is[i_724_][i_725_] * (((s) var_s).anInt3465 - i_722_) + is[i_724_ + 1][i_725_] * i_722_) >> ((s) var_s).anInt3466);
                            int i_727_ = (((is[i_724_][i_725_ + 1] * (((s) var_s).anInt3465 - i_722_)) + is[i_724_ + 1][i_725_ + 1] * i_722_) >> ((s) var_s).anInt3466);
                            int i_728_ = (i_726_ * (((s) var_s).anInt3465 - i_723_) + i_727_ * i_723_ >> ((s) var_s).anInt3466);
                            i_726_ = (((is_634_[i_724_][i_725_] * (((s) var_s_626_).anInt3465 - i_722_)) + is_634_[i_724_ + 1][i_725_] * i_722_) >> ((s) var_s_626_).anInt3466);
                            i_727_ = (((is_634_[i_724_][i_725_ + 1] * (((s) var_s_626_).anInt3465 - i_722_)) + is_634_[i_724_ + 1][i_725_ + 1] * i_722_) >> ((s) var_s_626_).anInt3466);
                            int i_729_ = (i_726_ * (((s) var_s_626_).anInt3465 - i_723_) + i_727_ * i_723_ >> ((s) var_s_626_).anInt3466);
                            int i_730_ = i_728_ - i_729_ - i_625_;
                            anIntArray6645[i_719_] = (((anIntArray6645[i_719_] << 8) / i_706_ * i_730_) >> 8) - (i_628_ - i_728_);
                        }
                    }
                }
                aBoolean6601 = false;
            }
        }
    }

    private final void method1504(boolean bool) {
        if (((ha_Sub1) aHa_Sub1_6596).anInt5558 > 1) {
            synchronized (this) {
                method1497(bool);
            }
        } else
            method1497(bool);
    }

    final int na() {
        if (!aBoolean6601)
            method1483();
        return aShort6583;
    }

    final void VA(int i) {
        if ((anInt6600 & 0x3) != 3)
            throw new IllegalStateException();
        int i_731_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_732_ = Node_Sub9_Sub1.anIntArray9109[i];
        synchronized (this) {
            for (int i_733_ = 0; i_733_ < anInt6644; i_733_++) {
                int i_734_ = ((anIntArray6645[i_733_] * i_731_ + anIntArray6593[i_733_] * i_732_) >> 14);
                anIntArray6645[i_733_] = (anIntArray6645[i_733_] * i_732_ - anIntArray6593[i_733_] * i_731_) >> 14;
                anIntArray6593[i_733_] = i_734_;
            }
            method1503();
        }
    }

    final int V() {
        if (!aBoolean6601)
            method1483();
        return aShort6613;
    }

    private final Class162 method1505(Class162_Sub3 class162_sub3_735_, Class162_Sub3 class162_sub3_736_, int i, boolean bool, boolean bool_737_) {
        class162_sub3_735_.aBoolean6601 = aBoolean6601;
        if (aBoolean6601) {
            class162_sub3_735_.aShort6560 = aShort6560;
            class162_sub3_735_.aShort6634 = aShort6634;
            class162_sub3_735_.aShort6559 = aShort6559;
            class162_sub3_735_.aShort6613 = aShort6613;
            class162_sub3_735_.aShort6575 = aShort6575;
            class162_sub3_735_.aShort6594 = aShort6594;
            class162_sub3_735_.aShort6583 = aShort6583;
            class162_sub3_735_.aShort6570 = aShort6570;
        }
        class162_sub3_735_.anInt6564 = anInt6564;
        class162_sub3_735_.anInt6628 = anInt6628;
        class162_sub3_735_.anInt6644 = anInt6644;
        class162_sub3_735_.anInt6619 = anInt6619;
        class162_sub3_735_.anInt6610 = anInt6610;
        class162_sub3_735_.anInt6567 = anInt6567;
        if ((i & 0x100) != 0)
            class162_sub3_735_.aBoolean6592 = true;
        else
            class162_sub3_735_.aBoolean6592 = aBoolean6592;
        class162_sub3_735_.aBoolean6580 = aBoolean6580;
        boolean bool_738_ = (i & 0x7) == 7 | (i & 0x20) != 0;
        boolean bool_739_ = bool_738_ || (i & 0x1) != 0;
        boolean bool_740_ = bool_738_ || (i & 0x2) != 0;
        boolean bool_741_ = bool_738_ || (i & 0x4) != 0 || (i & 0x10) != 0;
        if (bool_739_ || bool_740_ || bool_741_) {
            if (bool_739_) {
                if (class162_sub3_736_.anIntArray6593 == null || class162_sub3_736_.anIntArray6593.length < anInt6644)
                    class162_sub3_735_.anIntArray6593 = class162_sub3_736_.anIntArray6593 = new int[anInt6644];
                else
                    class162_sub3_735_.anIntArray6593 = class162_sub3_736_.anIntArray6593;
                for (int i_742_ = 0; i_742_ < anInt6644; i_742_++)
                    class162_sub3_735_.anIntArray6593[i_742_] = anIntArray6593[i_742_];
            } else
                class162_sub3_735_.anIntArray6593 = anIntArray6593;
            if (bool_740_) {
                if (class162_sub3_736_.anIntArray6645 == null || class162_sub3_736_.anIntArray6645.length < anInt6644)
                    class162_sub3_735_.anIntArray6645 = class162_sub3_736_.anIntArray6645 = new int[anInt6644];
                else
                    class162_sub3_735_.anIntArray6645 = class162_sub3_736_.anIntArray6645;
                for (int i_743_ = 0; i_743_ < anInt6644; i_743_++)
                    class162_sub3_735_.anIntArray6645[i_743_] = anIntArray6645[i_743_];
            } else
                class162_sub3_735_.anIntArray6645 = anIntArray6645;
            if (bool_741_) {
                if (class162_sub3_736_.anIntArray6612 == null || class162_sub3_736_.anIntArray6612.length < anInt6644)
                    class162_sub3_735_.anIntArray6612 = class162_sub3_736_.anIntArray6612 = new int[anInt6644];
                else
                    class162_sub3_735_.anIntArray6612 = class162_sub3_736_.anIntArray6612;
                for (int i_744_ = 0; i_744_ < anInt6644; i_744_++)
                    class162_sub3_735_.anIntArray6612[i_744_] = anIntArray6612[i_744_];
            } else
                class162_sub3_735_.anIntArray6612 = anIntArray6612;
        } else {
            class162_sub3_735_.anIntArray6593 = anIntArray6593;
            class162_sub3_735_.anIntArray6645 = anIntArray6645;
            class162_sub3_735_.anIntArray6612 = anIntArray6612;
        }
        if ((i & 0x84080) != 0) {
            if (class162_sub3_736_.aShortArray6585 == null || class162_sub3_736_.aShortArray6585.length < anInt6610) {
                int i_745_ = anInt6610;
                class162_sub3_735_.aShortArray6585 = class162_sub3_736_.aShortArray6585 = new short[i_745_];
            } else
                class162_sub3_735_.aShortArray6585 = class162_sub3_736_.aShortArray6585;
            for (int i_746_ = 0; i_746_ < anInt6610; i_746_++)
                class162_sub3_735_.aShortArray6585[i_746_] = aShortArray6585[i_746_];
        } else
            class162_sub3_735_.aShortArray6585 = aShortArray6585;
        if ((i & 0x97018) != 0) {
            class162_sub3_735_.anInt6561 = 0;
            class162_sub3_735_.anIntArray6598 = class162_sub3_735_.anIntArray6630 = class162_sub3_735_.anIntArray6587 = null;
        } else if ((i & 0x80) != 0) {
            if (bool_737_)
                method1504(false);
            if (anIntArray6598 != null) {
                if (class162_sub3_736_.anIntArray6598 == null || class162_sub3_736_.anIntArray6598.length < anInt6610) {
                    int i_747_ = anInt6610;
                    class162_sub3_735_.anIntArray6598 = class162_sub3_736_.anIntArray6598 = new int[i_747_];
                    class162_sub3_735_.anIntArray6630 = class162_sub3_736_.anIntArray6630 = new int[i_747_];
                    class162_sub3_735_.anIntArray6587 = class162_sub3_736_.anIntArray6587 = new int[i_747_];
                } else {
                    class162_sub3_735_.anIntArray6598 = class162_sub3_736_.anIntArray6598;
                    class162_sub3_735_.anIntArray6630 = class162_sub3_736_.anIntArray6630;
                    class162_sub3_735_.anIntArray6587 = class162_sub3_736_.anIntArray6587;
                }
                for (int i_748_ = 0; i_748_ < anInt6610; i_748_++) {
                    class162_sub3_735_.anIntArray6598[i_748_] = anIntArray6598[i_748_];
                    class162_sub3_735_.anIntArray6630[i_748_] = anIntArray6630[i_748_];
                    class162_sub3_735_.anIntArray6587[i_748_] = anIntArray6587[i_748_];
                }
            }
            class162_sub3_735_.anInt6561 = anInt6561;
        } else {
            if (bool_737_)
                method1504(false);
            class162_sub3_735_.anIntArray6598 = anIntArray6598;
            class162_sub3_735_.anIntArray6630 = anIntArray6630;
            class162_sub3_735_.anIntArray6587 = anIntArray6587;
            class162_sub3_735_.anInt6561 = anInt6561;
        }
        if ((i & 0x100) != 0) {
            if (class162_sub3_736_.aByteArray6606 == null || class162_sub3_736_.aByteArray6606.length < anInt6610) {
                int i_749_ = anInt6610;
                class162_sub3_735_.aByteArray6606 = class162_sub3_736_.aByteArray6606 = new byte[i_749_];
            } else
                class162_sub3_735_.aByteArray6606 = class162_sub3_736_.aByteArray6606;
            if (aByteArray6606 != null) {
                for (int i_750_ = 0; i_750_ < anInt6610; i_750_++)
                    class162_sub3_735_.aByteArray6606[i_750_] = aByteArray6606[i_750_];
            } else {
                for (int i_751_ = 0; i_751_ < anInt6610; i_751_++)
                    class162_sub3_735_.aByteArray6606[i_751_] = (byte) 0;
            }
        } else
            class162_sub3_735_.aByteArray6606 = aByteArray6606;
        if ((i & 0x8) != 0 || (i & 0x10) != 0) {
            if (class162_sub3_736_.aClass220Array6603 == null || class162_sub3_736_.aClass220Array6603.length < anInt6619) {
                int i_752_ = anInt6619;
                class162_sub3_735_.aClass220Array6603 = class162_sub3_736_.aClass220Array6603 = new Class220[i_752_];
            } else
                class162_sub3_735_.aClass220Array6603 = class162_sub3_736_.aClass220Array6603;
            if (aClass220Array6603 != null) {
                for (int i_753_ = 0; i_753_ < anInt6619; i_753_++)
                    class162_sub3_735_.aClass220Array6603[i_753_] = new Class220(aClass220Array6603[i_753_]);
            } else
                class162_sub3_735_.aClass220Array6603 = null;
            if (aClass274Array6602 != null) {
                if (class162_sub3_736_.aClass274Array6602 == null || (class162_sub3_736_.aClass274Array6602.length < anInt6610)) {
                    int i_754_ = anInt6610;
                    class162_sub3_735_.aClass274Array6602 = class162_sub3_736_.aClass274Array6602 = new Class274[i_754_];
                } else
                    class162_sub3_735_.aClass274Array6602 = class162_sub3_736_.aClass274Array6602;
                for (int i_755_ = 0; i_755_ < anInt6610; i_755_++)
                    class162_sub3_735_.aClass274Array6602[i_755_] = (aClass274Array6602[i_755_] != null ? new Class274(aClass274Array6602[i_755_]) : null);
            } else
                class162_sub3_735_.aClass274Array6602 = null;
        } else {
            if (bool_737_)
                method1502();
            class162_sub3_735_.aClass220Array6603 = aClass220Array6603;
            class162_sub3_735_.aClass274Array6602 = aClass274Array6602;
        }
        if ((i & 0x8000) != 0) {
            if (aShortArray6629 == null)
                class162_sub3_735_.aShortArray6629 = null;
            else {
                if (class162_sub3_736_.aShortArray6629 == null || class162_sub3_736_.aShortArray6629.length < anInt6610) {
                    int i_756_ = anInt6610;
                    class162_sub3_735_.aShortArray6629 = class162_sub3_736_.aShortArray6629 = new short[i_756_];
                } else
                    class162_sub3_735_.aShortArray6629 = class162_sub3_736_.aShortArray6629;
                for (int i_757_ = 0; i_757_ < anInt6610; i_757_++)
                    class162_sub3_735_.aShortArray6629[i_757_] = aShortArray6629[i_757_];
            }
        } else
            class162_sub3_735_.aShortArray6629 = aShortArray6629;
        if ((i & 0x10000) != 0) {
            if (aByteArray6589 == null)
                class162_sub3_735_.aByteArray6589 = null;
            else {
                if (class162_sub3_736_.aByteArray6589 == null || class162_sub3_736_.aByteArray6589.length < anInt6610) {
                    int i_758_ = bool ? anInt6610 + 100 : anInt6610;
                    class162_sub3_735_.aByteArray6589 = class162_sub3_736_.aByteArray6589 = new byte[i_758_];
                } else
                    class162_sub3_735_.aByteArray6589 = class162_sub3_736_.aByteArray6589;
                for (int i_759_ = 0; i_759_ < anInt6610; i_759_++)
                    class162_sub3_735_.aByteArray6589[i_759_] = aByteArray6589[i_759_];
            }
        } else
            class162_sub3_735_.aByteArray6589 = aByteArray6589;
        if ((i & 0xc580) != 0) {
            if (class162_sub3_736_.aClass375Array6618 == null || class162_sub3_736_.aClass375Array6618.length < anInt6567) {
                int i_760_ = anInt6567;
                class162_sub3_735_.aClass375Array6618 = class162_sub3_736_.aClass375Array6618 = new Class375[i_760_];
                for (int i_761_ = 0; i_761_ < anInt6567; i_761_++)
                    class162_sub3_735_.aClass375Array6618[i_761_] = aClass375Array6618[i_761_].method3880((byte) -23);
            } else {
                class162_sub3_735_.aClass375Array6618 = class162_sub3_736_.aClass375Array6618;
                for (int i_762_ = 0; i_762_ < anInt6567; i_762_++)
                    class162_sub3_735_.aClass375Array6618[i_762_].method3881(113, aClass375Array6618[i_762_]);
            }
        } else
            class162_sub3_735_.aClass375Array6618 = aClass375Array6618;
        if (aFloatArrayArray6584 != null && (i & 0x10) != 0) {
            if (class162_sub3_736_.aFloatArrayArray6584 == null || (class162_sub3_736_.aFloatArrayArray6584.length < anInt6610)) {
                int i_763_ = bool ? anInt6610 + 100 : anInt6610;
                class162_sub3_735_.aFloatArrayArray6584 = class162_sub3_736_.aFloatArrayArray6584 = new float[i_763_][3];
            } else
                class162_sub3_735_.aFloatArrayArray6584 = class162_sub3_736_.aFloatArrayArray6584;
            for (int i_764_ = 0; i_764_ < anInt6610; i_764_++) {
                if (aFloatArrayArray6584[i_764_] != null) {
                    class162_sub3_735_.aFloatArrayArray6584[i_764_][0] = aFloatArrayArray6584[i_764_][0];
                    class162_sub3_735_.aFloatArrayArray6584[i_764_][1] = aFloatArrayArray6584[i_764_][1];
                    class162_sub3_735_.aFloatArrayArray6584[i_764_][2] = aFloatArrayArray6584[i_764_][2];
                }
            }
            if (class162_sub3_736_.aFloatArrayArray6604 == null || (class162_sub3_736_.aFloatArrayArray6604.length < anInt6610)) {
                int i_765_ = bool ? anInt6610 + 100 : anInt6610;
                class162_sub3_735_.aFloatArrayArray6604 = class162_sub3_736_.aFloatArrayArray6604 = new float[i_765_][3];
            } else
                class162_sub3_735_.aFloatArrayArray6604 = class162_sub3_736_.aFloatArrayArray6604;
            for (int i_766_ = 0; i_766_ < anInt6610; i_766_++) {
                if (aFloatArrayArray6604[i_766_] != null) {
                    class162_sub3_735_.aFloatArrayArray6604[i_766_][0] = aFloatArrayArray6604[i_766_][0];
                    class162_sub3_735_.aFloatArrayArray6604[i_766_][1] = aFloatArrayArray6604[i_766_][1];
                    class162_sub3_735_.aFloatArrayArray6604[i_766_][2] = aFloatArrayArray6604[i_766_][2];
                }
            }
        } else {
            class162_sub3_735_.aFloatArrayArray6584 = aFloatArrayArray6584;
            class162_sub3_735_.aFloatArrayArray6604 = aFloatArrayArray6604;
        }
        class162_sub3_735_.anIntArrayArray6621 = anIntArrayArray6621;
        class162_sub3_735_.anIntArrayArray6635 = anIntArrayArray6635;
        class162_sub3_735_.anIntArrayArray6641 = anIntArrayArray6641;
        class162_sub3_735_.aShortArray6579 = aShortArray6579;
        class162_sub3_735_.aShortArray6574 = aShortArray6574;
        class162_sub3_735_.aByteArray6605 = aByteArray6605;
        class162_sub3_735_.aShortArray6631 = aShortArray6631;
        class162_sub3_735_.aShortArray6597 = aShortArray6597;
        class162_sub3_735_.aShortArray6590 = aShortArray6590;
        class162_sub3_735_.aClass40Array6566 = aClass40Array6566;
        class162_sub3_735_.aClass124Array6572 = aClass124Array6572;
        class162_sub3_735_.aClass268Array6647 = aClass268Array6647;
        class162_sub3_735_.aShortArray6599 = aShortArray6599;
        class162_sub3_735_.anInt6600 = i;
        return class162_sub3_735_;
    }

    final int WA() {
        return anInt6564;
    }

    final int ua() {
        return anInt6600;
    }

    private final void method1506(boolean bool, boolean bool_767_, int i, int i_768_) {
        if (aClass268Array6647 != null) {
            for (int i_769_ = 0; i_769_ < anInt6567; i_769_++) {
                Class268 class268 = aClass268Array6647[i_769_];
                anIntArray6638[((Class268) class268).anInt3117] = i_769_;
            }
        }
        if (aBoolean6592 || aClass268Array6647 != null) {
            if ((anInt6600 & 0x100) == 0 && aShortArray6599 != null) {
                for (int i_770_ = 0; i_770_ < anInt6610; i_770_++) {
                    short i_771_ = aShortArray6599[i_770_];
                    method1487(i_771_, bool, bool_767_);
                }
            } else {
                for (int i_772_ = 0; i_772_ < anInt6610; i_772_++) {
                    if (!method1491(i_772_) && !method1488(i_772_))
                        method1487(i_772_, bool, bool_767_);
                }
                if (aByteArray6605 == null) {
                    for (int i_773_ = 0; i_773_ < anInt6610; i_773_++) {
                        if (method1491(i_773_) || method1488(i_773_))
                            method1487(i_773_, bool, bool_767_);
                    }
                } else {
                    for (int i_774_ = 0; i_774_ < 12; i_774_++) {
                        for (int i_775_ = 0; i_775_ < anInt6610; i_775_++) {
                            if (aByteArray6605[i_775_] == i_774_ && (method1491(i_775_) || method1488(i_775_)))
                                method1487(i_775_, bool, bool_767_);
                        }
                    }
                }
            }
        } else {
            for (int i_776_ = 0; i_776_ < anInt6610; i_776_++)
                method1487(i_776_, bool, bool_767_);
        }
    }

    private final void method1507() {
        synchronized (this) {
            for (int i = 0; i < anInt6644; i++) {
                int i_777_ = anIntArray6612[i];
                anIntArray6612[i] = anIntArray6593[i];
                anIntArray6593[i] = -i_777_;
            }
            method1503();
        }
    }

    final int HA() {
        if (!aBoolean6601)
            method1483();
        return aShort6594;
    }

    private final void method1508() {
        for (int i = 0; i < anInt6610; i++) {
            short i_778_ = aShortArray6629 != null ? aShortArray6629[i] : (short) -1;
            if (i_778_ == -1) {
                int i_779_ = aShortArray6585[i] & 0xffff;
                int i_780_ = (i_779_ & 0x7f) * anInt6564 >> 7;
                short i_781_ = Class183.method1615((byte) -110, i_779_ & ~0x7f | i_780_);
                if (anIntArray6587[i] == -1) {
                    int i_782_ = anIntArray6598[i] & ~0x1ffff;
                    anIntArray6598[i] = i_782_ | Class226_Sub1_Sub1.method1808(i_782_ >> 17, i_781_, (byte) 80);
                } else if (anIntArray6587[i] != -2) {
                    int i_783_ = anIntArray6598[i] & ~0x1ffff;
                    anIntArray6598[i] = i_783_ | Class226_Sub1_Sub1.method1808(i_783_ >> 17, i_781_, (byte) 80);
                    i_783_ = anIntArray6630[i] & ~0x1ffff;
                    anIntArray6630[i] = i_783_ | Class226_Sub1_Sub1.method1808(i_783_ >> 17, i_781_, (byte) 80);
                    i_783_ = anIntArray6587[i] & ~0x1ffff;
                    anIntArray6587[i] = i_783_ | Class226_Sub1_Sub1.method1808(i_783_ >> 17, i_781_, (byte) 80);
                }
            }
        }
        anInt6561 = 2;
    }

    private final void method1509() {
        synchronized (this) {
            for (int i = 0; i < anInt6644; i++) {
                int i_784_ = anIntArray6593[i];
                anIntArray6593[i] = anIntArray6612[i];
                anIntArray6612[i] = -i_784_;
            }
            method1503();
        }
    }

    Class162_Sub3(ha_Sub1 var_ha_Sub1) {
        anInt6610 = 0;
        aBoolean6639 = false;
        aBoolean6601 = false;
        aBoolean6624 = false;
        aBoolean6646 = false;
        anInt6644 = 0;
        aHa_Sub1_6596 = var_ha_Sub1;
    }

    Class162_Sub3(ha_Sub1 var_ha_Sub1, Class343 class343, int i, int i_785_, int i_786_, int i_787_) {
        anInt6610 = 0;
        aBoolean6639 = false;
        aBoolean6601 = false;
        aBoolean6624 = false;
        aBoolean6646 = false;
        anInt6644 = 0;
        aHa_Sub1_6596 = var_ha_Sub1;
        anInt6600 = i;
        anInt6564 = i_785_;
        anInt6628 = i_786_;
        d var_d = ((ha) aHa_Sub1_6596).aD1414;
        anInt6644 = ((Class343) class343).anInt4063;
        anInt6619 = ((Class343) class343).anInt4075;
        anIntArray6593 = ((Class343) class343).anIntArray4027;
        anIntArray6645 = ((Class343) class343).anIntArray4069;
        anIntArray6612 = ((Class343) class343).anIntArray4040;
        anInt6610 = ((Class343) class343).anInt4028;
        aShortArray6631 = ((Class343) class343).aShortArray4046;
        aShortArray6597 = ((Class343) class343).aShortArray4024;
        aShortArray6590 = ((Class343) class343).aShortArray4073;
        aByteArray6605 = ((Class343) class343).aByteArray4072;
        aShortArray6585 = ((Class343) class343).aShortArray4054;
        aByteArray6606 = ((Class343) class343).aByteArray4061;
        aShortArray6574 = ((Class343) class343).aShortArray4064;
        aByteArray6589 = ((Class343) class343).aByteArray4076;
        aClass40Array6566 = ((Class343) class343).aClass40Array4045;
        aClass124Array6572 = ((Class343) class343).aClass124Array4060;
        aShortArray6579 = ((Class343) class343).aShortArray4038;
        int[] is = new int[anInt6610];
        for (int i_788_ = 0; i_788_ < anInt6610; i_788_++)
            is[i_788_] = i_788_;
        long[] ls = new long[anInt6610];
        boolean bool = (anInt6600 & 0x100) != 0;
        for (int i_789_ = 0; i_789_ < anInt6610; i_789_++) {
            int i_790_ = is[i_789_];
            Class312 class312 = null;
            int i_791_ = 0;
            int i_792_ = 0;
            int i_793_ = 0;
            int i_794_ = 0;
            if (((Class343) class343).aClass178Array4048 != null) {
                boolean bool_795_ = false;
                for (int i_796_ = 0; i_796_ < ((Class343) class343).aClass178Array4048.length; i_796_++) {
                    Class178 class178 = ((Class343) class343).aClass178Array4048[i_796_];
                    if (i_790_ == ((Class178) class178).anInt2075) {
                        Class236 class236 = Node_Sub42_Sub3.method2637(0, (((Class178) class178).anInt2078));
                        if (((Class236) class236).aBoolean2631)
                            bool_795_ = true;
                        if (((Class236) class236).anInt2623 != -1) {
                            Class312 class312_797_ = var_d.method25((((Class236) class236).anInt2623), (byte) 125);
                            if (((Class312) class312_797_).anInt3629 == 2)
                                aBoolean6592 = true;
                        }
                    }
                }
                if (bool_795_)
                    ls[i_789_] = 9223372036854775807L;
            }
            int i_798_ = -1;
            if (((Class343) class343).aShortArray4056 != null) {
                i_798_ = ((Class343) class343).aShortArray4056[i_790_];
                if (i_798_ != -1) {
                    class312 = var_d.method25(i_798_ & 0xffff, (byte) 127);
                    if ((i_787_ & 0x40) == 0 || !((Class312) class312).aBoolean3622) {
                        i_793_ = ((Class312) class312).aByte3624;
                        i_794_ = ((Class312) class312).aByte3646;
                    } else
                        i_798_ = -1;
                }
            }
            boolean bool_799_ = (aByteArray6606 != null && aByteArray6606[i_790_] != 0 || (class312 != null && ((Class312) class312).anInt3629 == 2));
            if ((bool || bool_799_) && aByteArray6605 != null)
                i_791_ += aByteArray6605[i_790_] << 17;
            if (bool_799_)
                i_791_ += 65536;
            i_791_ += (i_793_ & 0xff) << 8;
            i_791_ += i_794_ & 0xff;
            i_792_ += (i_798_ & 0xffff) << 16;
            i_792_ += i_789_ & 0xffff;
            ls[i_789_] = ((long) i_791_ << 32) + (long) i_792_;
            aBoolean6592 |= bool_799_;
        }
        Class346_Sub7_Sub2_Sub2.method3613(ls, is, (byte) -123);
        if (((Class343) class343).aClass178Array4048 != null) {
            anInt6567 = ((Class343) class343).aClass178Array4048.length;
            aClass268Array6647 = new Class268[anInt6567];
            aClass375Array6618 = new Class375[anInt6567];
            for (int i_800_ = 0; i_800_ < ((Class343) class343).aClass178Array4048.length; i_800_++) {
                Class178 class178 = ((Class343) class343).aClass178Array4048[i_800_];
                Class236 class236 = Node_Sub42_Sub3.method2637(0, ((Class178) class178).anInt2078);
                int i_801_ = ((Node.anIntArray2801[(((Class343) class343).aShortArray4054[((Class178) class178).anInt2075]) & 0xffff]) & 0xffffff);
                i_801_ = (i_801_ | 255 - (((Class343) class343).aByteArray4061 != null ? (((Class343) class343).aByteArray4061[((Class178) class178).anInt2075]) & 0xff : 0) << 24);
                aClass268Array6647[i_800_] = new Class268(((Class178) class178).anInt2075, (((Class343) class343).aShortArray4046[((Class178) class178).anInt2075]), (((Class343) class343).aShortArray4024[((Class178) class178).anInt2075]), (((Class343) class343).aShortArray4073[((Class178) class178).anInt2075]), ((Class236) class236).anInt2627, ((Class236) class236).anInt2626, ((Class236) class236).anInt2623, ((Class236) class236).anInt2628, ((Class236) class236).anInt2622, ((Class236) class236).aBoolean2631, ((Class178) class178).anInt2077);
                aClass375Array6618[i_800_] = new Class375(i_801_);
            }
        }
        aFloatArrayArray6584 = new float[anInt6610][];
        aFloatArrayArray6604 = new float[anInt6610][];
        Class75 class75 = Class316_Sub2.method3301(anInt6610, class343, 0, is);
        Class203 class203 = aHa_Sub1_6596.method832(Thread.currentThread());
        float[] fs = ((Class203) class203).aFloatArray2330;
        boolean bool_802_ = false;
        for (int i_803_ = 0; i_803_ < anInt6610; i_803_++) {
            int i_804_ = is[i_803_];
            int i_805_;
            if (((Class343) class343).aByteArray4026 == null)
                i_805_ = -1;
            else
                i_805_ = ((Class343) class343).aByteArray4026[i_804_];
            int i_806_ = (((Class343) class343).aShortArray4056 == null ? (int) -1 : ((Class343) class343).aShortArray4056[i_804_]);
            if (i_806_ != -1 && (i_787_ & 0x40) != 0) {
                Class312 class312 = var_d.method25(i_806_ & 0xffff, (byte) 125);
                if (((Class312) class312).aBoolean3622)
                    i_806_ = -1;
            }
            if (i_806_ != -1) {
                bool_802_ = true;
                float[] fs_807_ = aFloatArrayArray6584[i_804_] = new float[3];
                float[] fs_808_ = aFloatArrayArray6604[i_804_] = new float[3];
                boolean bool_809_ = false;
                if (i_805_ == -1) {
                    fs_807_[0] = 0.0F;
                    fs_808_[0] = 1.0F;
                    fs_807_[1] = 1.0F;
                    fs_808_[1] = 1.0F;
                    fs_807_[2] = 0.0F;
                    fs_808_[2] = 0.0F;
                } else {
                    i_805_ &= 0xff;
                    byte i_810_ = ((Class343) class343).aByteArray4033[i_805_];
                    if (i_810_ == 0) {
                        short i_811_ = aShortArray6631[i_804_];
                        short i_812_ = aShortArray6597[i_804_];
                        short i_813_ = aShortArray6590[i_804_];
                        short i_814_ = ((Class343) class343).aShortArray4047[i_805_];
                        short i_815_ = ((Class343) class343).aShortArray4049[i_805_];
                        short i_816_ = ((Class343) class343).aShortArray4070[i_805_];
                        float f = (float) anIntArray6593[i_814_];
                        float f_817_ = (float) anIntArray6645[i_814_];
                        float f_818_ = (float) anIntArray6612[i_814_];
                        float f_819_ = (float) anIntArray6593[i_815_] - f;
                        float f_820_ = (float) anIntArray6645[i_815_] - f_817_;
                        float f_821_ = (float) anIntArray6612[i_815_] - f_818_;
                        float f_822_ = (float) anIntArray6593[i_816_] - f;
                        float f_823_ = (float) anIntArray6645[i_816_] - f_817_;
                        float f_824_ = (float) anIntArray6612[i_816_] - f_818_;
                        float f_825_ = (float) anIntArray6593[i_811_] - f;
                        float f_826_ = (float) anIntArray6645[i_811_] - f_817_;
                        float f_827_ = (float) anIntArray6612[i_811_] - f_818_;
                        float f_828_ = (float) anIntArray6593[i_812_] - f;
                        float f_829_ = (float) anIntArray6645[i_812_] - f_817_;
                        float f_830_ = (float) anIntArray6612[i_812_] - f_818_;
                        float f_831_ = (float) anIntArray6593[i_813_] - f;
                        float f_832_ = (float) anIntArray6645[i_813_] - f_817_;
                        float f_833_ = (float) anIntArray6612[i_813_] - f_818_;
                        float f_834_ = f_820_ * f_824_ - f_821_ * f_823_;
                        float f_835_ = f_821_ * f_822_ - f_819_ * f_824_;
                        float f_836_ = f_819_ * f_823_ - f_820_ * f_822_;
                        float f_837_ = f_823_ * f_836_ - f_824_ * f_835_;
                        float f_838_ = f_824_ * f_834_ - f_822_ * f_836_;
                        float f_839_ = f_822_ * f_835_ - f_823_ * f_834_;
                        float f_840_ = 1.0F / (f_837_ * f_819_ + f_838_ * f_820_ + f_839_ * f_821_);
                        fs_807_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_ * f_827_) * f_840_;
                        fs_807_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_ * f_830_) * f_840_;
                        fs_807_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_ * f_833_) * f_840_;
                        f_837_ = f_820_ * f_836_ - f_821_ * f_835_;
                        f_838_ = f_821_ * f_834_ - f_819_ * f_836_;
                        f_839_ = f_819_ * f_835_ - f_820_ * f_834_;
                        f_840_ = 1.0F / (f_837_ * f_822_ + f_838_ * f_823_ + f_839_ * f_824_);
                        fs_808_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_ * f_827_) * f_840_;
                        fs_808_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_ * f_830_) * f_840_;
                        fs_808_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_ * f_833_) * f_840_;
                    } else {
                        short i_841_ = aShortArray6631[i_804_];
                        short i_842_ = aShortArray6597[i_804_];
                        short i_843_ = aShortArray6590[i_804_];
                        int i_844_ = ((Class75) class75).anIntArray974[i_805_];
                        int i_845_ = ((Class75) class75).anIntArray973[i_805_];
                        int i_846_ = ((Class75) class75).anIntArray976[i_805_];
                        float[] fs_847_ = ((Class75) class75).aFloatArrayArray979[i_805_];
                        byte i_848_ = ((Class343) class343).aByteArray4042[i_805_];
                        float f = ((float) (((Class343) class343).anIntArray4041[i_805_]) / 256.0F);
                        if (i_810_ == 1) {
                            float f_849_ = ((float) (((Class343) class343).anIntArray4021[i_805_]) / 1024.0F);
                            Class9.method192(-107, anIntArray6612[i_841_], fs, i_848_, anIntArray6593[i_841_], i_845_, f, fs_847_, f_849_, i_844_, anIntArray6645[i_841_], i_846_);
                            fs_807_[0] = fs[0];
                            fs_808_[0] = fs[1];
                            Class9.method192(-122, anIntArray6612[i_842_], fs, i_848_, anIntArray6593[i_842_], i_845_, f, fs_847_, f_849_, i_844_, anIntArray6645[i_842_], i_846_);
                            fs_807_[1] = fs[0];
                            fs_808_[1] = fs[1];
                            Class9.method192(-107, anIntArray6612[i_843_], fs, i_848_, anIntArray6593[i_843_], i_845_, f, fs_847_, f_849_, i_844_, anIntArray6645[i_843_], i_846_);
                            fs_807_[2] = fs[0];
                            fs_808_[2] = fs[1];
                            float f_850_ = f_849_ / 2.0F;
                            if ((i_848_ & 0x1) == 0) {
                                if (fs_807_[1] - fs_807_[0] > f_850_)
                                    fs_807_[1] -= f_849_;
                                else if (fs_807_[0] - fs_807_[1] > f_850_)
                                    fs_807_[1] += f_849_;
                                if (fs_807_[2] - fs_807_[0] > f_850_)
                                    fs_807_[2] -= f_849_;
                                else if (fs_807_[0] - fs_807_[2] > f_850_)
                                    fs_807_[2] += f_849_;
                            } else {
                                if (fs_808_[1] - fs_808_[0] > f_850_)
                                    fs_808_[1] -= f_849_;
                                else if (fs_808_[0] - fs_808_[1] > f_850_)
                                    fs_808_[1] += f_849_;
                                if (fs_808_[2] - fs_808_[0] > f_850_)
                                    fs_808_[2] -= f_849_;
                                else if (fs_808_[0] - fs_808_[2] > f_850_)
                                    fs_808_[2] += f_849_;
                            }
                        } else if (i_810_ == 2) {
                            float f_851_ = ((float) (((Class343) class343).anIntArray4032[i_805_]) / 256.0F);
                            float f_852_ = ((float) (((Class343) class343).anIntArray4034[i_805_]) / 256.0F);
                            int i_853_ = (anIntArray6593[i_842_] - anIntArray6593[i_841_]);
                            int i_854_ = (anIntArray6645[i_842_] - anIntArray6645[i_841_]);
                            int i_855_ = (anIntArray6612[i_842_] - anIntArray6612[i_841_]);
                            int i_856_ = (anIntArray6593[i_843_] - anIntArray6593[i_841_]);
                            int i_857_ = (anIntArray6645[i_843_] - anIntArray6645[i_841_]);
                            int i_858_ = (anIntArray6612[i_843_] - anIntArray6612[i_841_]);
                            int i_859_ = i_854_ * i_858_ - i_857_ * i_855_;
                            int i_860_ = i_855_ * i_856_ - i_858_ * i_853_;
                            int i_861_ = i_853_ * i_857_ - i_856_ * i_854_;
                            float f_862_ = 64.0F / (float) (((Class343) class343).anIntArray4058[i_805_]);
                            float f_863_ = 64.0F / (float) (((Class343) class343).anIntArray4029[i_805_]);
                            float f_864_ = 64.0F / (float) (((Class343) class343).anIntArray4021[i_805_]);
                            float f_865_ = (((float) i_859_ * fs_847_[0] + (float) i_860_ * fs_847_[1] + (float) i_861_ * fs_847_[2]) / f_862_);
                            float f_866_ = (((float) i_859_ * fs_847_[3] + (float) i_860_ * fs_847_[4] + (float) i_861_ * fs_847_[5]) / f_863_);
                            float f_867_ = (((float) i_859_ * fs_847_[6] + (float) i_860_ * fs_847_[7] + (float) i_861_ * fs_847_[8]) / f_864_);
                            int i_868_ = Class139.method1280(f_865_, f_866_, f_867_, (byte) 49);
                            Node_Sub8_Sub6.method2061(f_852_, i_844_, anIntArray6612[i_841_], i_846_, f_851_, (byte) 9, i_845_, anIntArray6593[i_841_], anIntArray6645[i_841_], f, i_848_, fs, fs_847_, i_868_);
                            fs_807_[0] = fs[0];
                            fs_808_[0] = fs[1];
                            Node_Sub8_Sub6.method2061(f_852_, i_844_, anIntArray6612[i_842_], i_846_, f_851_, (byte) 9, i_845_, anIntArray6593[i_842_], anIntArray6645[i_842_], f, i_848_, fs, fs_847_, i_868_);
                            fs_807_[1] = fs[0];
                            fs_808_[1] = fs[1];
                            Node_Sub8_Sub6.method2061(f_852_, i_844_, anIntArray6612[i_843_], i_846_, f_851_, (byte) 9, i_845_, anIntArray6593[i_843_], anIntArray6645[i_843_], f, i_848_, fs, fs_847_, i_868_);
                            fs_807_[2] = fs[0];
                            fs_808_[2] = fs[1];
                        } else if (i_810_ == 3) {
                            Node_Sub8_Sub11.method2085(i_848_, anIntArray6645[i_841_], fs, 8, f, i_845_, anIntArray6612[i_841_], anIntArray6593[i_841_], i_844_, i_846_, fs_847_);
                            fs_807_[0] = fs[0];
                            fs_808_[0] = fs[1];
                            Node_Sub8_Sub11.method2085(i_848_, anIntArray6645[i_842_], fs, 8, f, i_845_, anIntArray6612[i_842_], anIntArray6593[i_842_], i_844_, i_846_, fs_847_);
                            fs_807_[1] = fs[0];
                            fs_808_[1] = fs[1];
                            Node_Sub8_Sub11.method2085(i_848_, anIntArray6645[i_843_], fs, 8, f, i_845_, anIntArray6612[i_843_], anIntArray6593[i_843_], i_844_, i_846_, fs_847_);
                            fs_807_[2] = fs[0];
                            fs_808_[2] = fs[1];
                            if ((i_848_ & 0x1) == 0) {
                                if (fs_807_[1] - fs_807_[0] > 0.5F)
                                    fs_807_[1]--;
                                else if (fs_807_[0] - fs_807_[1] > 0.5F)
                                    fs_807_[1]++;
                                if (fs_807_[2] - fs_807_[0] > 0.5F)
                                    fs_807_[2]--;
                                else if (fs_807_[0] - fs_807_[2] > 0.5F)
                                    fs_807_[2]++;
                            } else {
                                if (fs_808_[1] - fs_808_[0] > 0.5F)
                                    fs_808_[1]--;
                                else if (fs_808_[0] - fs_808_[1] > 0.5F)
                                    fs_808_[1]++;
                                if (fs_808_[2] - fs_808_[0] > 0.5F)
                                    fs_808_[2]--;
                                else if (fs_808_[0] - fs_808_[2] > 0.5F)
                                    fs_808_[2]++;
                            }
                        }
                    }
                }
            }
        }
        if (!bool_802_)
            aFloatArrayArray6584 = aFloatArrayArray6604 = null;
        if (((Class343) class343).anIntArray4057 != null && (anInt6600 & 0x20) != 0)
            anIntArrayArray6621 = class343.method3504(true, 67);
        if (((Class343) class343).anIntArray4030 != null && (anInt6600 & 0x180) != 0)
            anIntArrayArray6635 = class343.method3502(true);
        if (((Class343) class343).aClass178Array4048 != null && (anInt6600 & 0x400) != 0)
            anIntArrayArray6641 = class343.method3506(-15362);
        if (((Class343) class343).aShortArray4056 != null) {
            aShortArray6629 = new short[anInt6610];
            boolean bool_869_ = false;
            for (int i_870_ = 0; i_870_ < anInt6610; i_870_++) {
                short i_871_ = ((Class343) class343).aShortArray4056[i_870_];
                if (i_871_ != -1) {
                    Class312 class312 = ((ha) aHa_Sub1_6596).aD1414.method25(i_871_, (byte) 127);
                    if ((i_787_ & 0x40) == 0 || !((Class312) class312).aBoolean3622) {
                        aShortArray6629[i_870_] = i_871_;
                        bool_869_ = true;
                        if (((Class312) class312).anInt3629 == 2)
                            aBoolean6592 = true;
                        if (((Class312) class312).aByte3643 != 0 || ((Class312) class312).aByte3642 != 0)
                            aBoolean6580 = true;
                    } else
                        aShortArray6629[i_870_] = (short) -1;
                } else
                    aShortArray6629[i_870_] = (short) -1;
            }
            if (!bool_869_)
                aShortArray6629 = null;
        } else
            aShortArray6629 = null;
        if (aBoolean6592 || aClass268Array6647 != null) {
            aShortArray6599 = new short[anInt6610];
            for (int i_872_ = 0; i_872_ < anInt6610; i_872_++)
                aShortArray6599[i_872_] = (short) is[i_872_];
        }
    }

    static {
        anInt6617 = 4096;
        anInt6626 = 0;
    }
}
