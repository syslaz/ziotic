/* aa_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub1 extends aa {
    static int anInt5248;
    static Class365 aClass365_5249 = new Class365(64);
    static int anInt5250;
    static int anInt5251;
    int[] anIntArray5252;
    int[] anIntArray5253;
    static Class58 aClass58_5254 = new Class58("", 17);
    static int anInt5255;

    static final void method156(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt5248++;
        int i_7_ = i_1_ + i_6_;
        int i_8_ = i_2_ + -i_1_;
        if (i_4_ > -56)
            anInt5255 = -56;
        for (int i_9_ = i_6_; i_9_ < i_7_; i_9_++)
            Class149.method1331(i_5_, -81, i, Class156.anIntArrayArray1867[i_9_], i_3_);
        for (int i_10_ = i_2_; i_8_ < i_10_; i_10_--)
            Class149.method1331(i_5_, -107, i, Class156.anIntArrayArray1867[i_10_], i_3_);
        int i_11_ = i_3_ - i_1_;
        int i_12_ = i_1_ + i;
        for (int i_13_ = i_7_; (i_13_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff); i_13_++) {
            int[] is = Class156.anIntArrayArray1867[i_13_];
            Class149.method1331(i_5_, -104, i, is, i_12_);
            Class149.method1331(i_0_, -126, i_12_, is, i_11_);
            Class149.method1331(i_5_, -106, i_11_, is, i_3_);
        }
    }

    static final void method157(Class182 class182, boolean bool, int i) {
        anInt5250++;
        if (Class282_Sub4.anInt7624 < 50 && (class182 != null && ((Class182) class182).anIntArrayArray2131 != null && ((i ^ 0xffffffff) > (((Class182) class182).anIntArrayArray2131.length ^ 0xffffffff)) && ((Class182) class182).anIntArrayArray2131[i] != null) && bool == false) {
            int i_14_ = ((Class182) class182).anIntArrayArray2131[i][0];
            int i_15_ = i_14_ >> -1941688344;
            if ((((Class182) class182).anIntArrayArray2131[i].length ^ 0xffffffff) < -2) {
                int i_16_ = (int) (Math.random() * (double) (((Class182) class182).anIntArrayArray2131[i]).length);
                if (i_16_ > 0)
                    i_15_ = ((Class182) class182).anIntArrayArray2131[i][i_16_];
            }
            int i_17_ = 0x7 & i_14_ >> 62967685;
            int i_18_ = 256;
            if (((Class182) class182).anIntArray2109 != null && ((Class182) class182).anIntArray2118 != null)
                i_18_ = Class194.method1660((((Class182) class182).anIntArray2118[i]), (((Class182) class182).anIntArray2109[i]), true);
            if (((Class182) class182).aBoolean2135)
                Node_Sub39_Sub2.method2609(bool, 255, i_17_, i_15_, i_18_, false, 0);
            else
                Node_Sub42_Sub1.method2630(i_18_, (byte) 78, i_15_, 0, 255, i_17_);
        }
    }

    public static void method158(byte i) {
        aClass58_5254 = null;
        aClass365_5249 = null;
        if (i < 61)
            method159(-53, -33, -27, -34, -88, 94, 70, -32, -83, -97);
    }

    static final boolean method159(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        anInt5251++;
        if ((i_22_ ^ 0xffffffff) < -2001 || i_19_ > 2000 || i_23_ > 2000 || (i_20_ ^ 0xffffffff) < -2001 || i_25_ > 2000 || i_24_ > 2000)
            return false;
        if ((i_22_ ^ 0xffffffff) > 1999 || i_19_ < -2000 || (i_23_ ^ 0xffffffff) > 1999 || i_20_ < -2000 || (i_25_ ^ 0xffffffff) > 1999 || i_24_ < -2000)
            return false;
        if (Class180.anInt2093 == 2) {
            int i_28_ = i_20_ + Class312.anInt3644 * i_22_;
            if (i_28_ >= 0 && i_28_ < Class103.anIntArray1317.length && Class103.anIntArray1317[i_28_] > -38400 + (i_26_ << 1169206312))
                return false;
            i_28_ = i_25_ + Class312.anInt3644 * i_19_;
            if (i_28_ >= 0 && i_28_ < Class103.anIntArray1317.length && (i << -1090033208) - 38400 < Class103.anIntArray1317[i_28_])
                return false;
            i_28_ = i_23_ * Class312.anInt3644 + i_24_;
            if ((i_28_ ^ 0xffffffff) <= -1 && i_28_ < Class103.anIntArray1317.length && ((i_27_ << -778377336) - 38400 < Class103.anIntArray1317[i_28_]))
                return false;
        }
        int i_29_ = i_25_ - i_20_;
        int i_30_ = i_19_ - i_22_;
        int i_31_ = i_24_ + -i_20_;
        int i_32_ = -i_22_ + i_23_;
        int i_33_ = -i_26_ + i;
        int i_34_ = i_27_ - i_26_;
        if (i_19_ > i_22_ && i_23_ > i_23_) {
            if ((i_19_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff))
                i_23_++;
            else
                i_19_++;
            i_22_--;
        } else if (i_19_ >= i_23_) {
            if ((i_22_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff))
                i_22_++;
            else
                i_19_++;
            i_23_--;
        } else {
            i_19_--;
            if (i_22_ <= i_23_)
                i_23_++;
            else
                i_22_++;
        }
        int i_35_ = 0;
        if ((i_19_ ^ 0xffffffff) != (i_22_ ^ 0xffffffff))
            i_35_ = (i_25_ - i_20_ << 1581819020) / (-i_22_ + i_19_);
        int i_36_ = 0;
        if (i_19_ != i_23_)
            i_36_ = (-i_25_ + i_24_ << -1041525364) / (-i_19_ + i_23_);
        int i_37_ = 0;
        if ((i_23_ ^ 0xffffffff) != (i_22_ ^ 0xffffffff))
            i_37_ = (-i_24_ + i_20_ << -552983156) / (i_22_ + -i_23_);
        int i_38_ = -(i_30_ * i_31_) + i_32_ * i_29_;
        if (i_21_ != -13221)
            aClass365_5249 = null;
        if (i_38_ == 0)
            return false;
        int i_39_ = (-(i_30_ * i_34_) + i_32_ * i_33_ << 1090132136) / i_38_;
        int i_40_ = (i_29_ * i_34_ - i_31_ * i_33_ << -1557386936) / i_38_;
        if (i_19_ < i_22_ || (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
            if (i_19_ > i_23_) {
                if (i_23_ >= Class64.anInt868)
                    return true;
                if (i_22_ > Class64.anInt868)
                    i_22_ = Class64.anInt868;
                i_27_ = (i_27_ << -60081592) + -(i_24_ * i_39_) - -i_39_;
                if ((i_19_ ^ 0xffffffff) < (Class64.anInt868 ^ 0xffffffff))
                    i_19_ = Class64.anInt868;
                if ((i_19_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)) {
                    i_20_ = i_24_ <<= 326934412;
                    i_25_ <<= 303843276;
                    if (i_23_ < 0) {
                        i_27_ -= i_40_ * i_23_;
                        i_20_ -= i_36_ * i_23_;
                        i_24_ -= i_37_ * i_23_;
                        i_23_ = 0;
                    }
                    if (i_19_ < 0) {
                        i_25_ -= i_35_ * i_19_;
                        i_19_ = 0;
                    }
                    if (i_37_ > i_36_) {
                        i_22_ -= i_19_;
                        i_19_ -= i_23_;
                        i_23_ *= Class312.anInt3644;
                        while ((--i_19_ ^ 0xffffffff) <= -1) {
                            if (!r.method2105((byte) -88, (i_24_ >> 1796565804) + 1, Class103.anIntArray1317, 0, i_27_, -1 + (i_20_ >> 1213189932), i_39_, i_23_))
                                return false;
                            i_24_ += i_37_;
                            i_23_ += Class312.anInt3644;
                            i_27_ += i_40_;
                            i_20_ += i_36_;
                        }
                        while ((--i_22_ ^ 0xffffffff) <= -1) {
                            if (!r.method2105((byte) -92, (i_24_ >> 753649068) + 1, Class103.anIntArray1317, 0, i_27_, (i_25_ >> 379837388) - 1, i_39_, i_23_))
                                return false;
                            i_27_ += i_40_;
                            i_24_ += i_37_;
                            i_25_ += i_35_;
                            i_23_ += Class312.anInt3644;
                        }
                        return true;
                    }
                    i_22_ -= i_19_;
                    i_19_ -= i_23_;
                    i_23_ = Class312.anInt3644 * i_23_;
                    while ((--i_19_ ^ 0xffffffff) <= -1) {
                        if (!r.method2105((byte) 115, 1 + (i_20_ >> 91933324), Class103.anIntArray1317, 0, i_27_, -1 + (i_24_ >> 1225372076), i_39_, i_23_))
                            return false;
                        i_27_ += i_40_;
                        i_20_ += i_36_;
                        i_23_ += Class312.anInt3644;
                        i_24_ += i_37_;
                    }
                    while (--i_22_ >= 0) {
                        if (!r.method2105((byte) -93, 1 + (i_25_ >> 804282092), Class103.anIntArray1317, 0, i_27_, -1 + (i_24_ >> 2064820140), i_39_, i_23_))
                            return false;
                        i_24_ += i_37_;
                        i_25_ += i_35_;
                        i_27_ += i_40_;
                        i_23_ += Class312.anInt3644;
                    }
                    return true;
                }
                i_25_ = i_24_ <<= 1676256204;
                if ((i_23_ ^ 0xffffffff) > -1) {
                    i_25_ -= i_23_ * i_36_;
                    i_24_ -= i_23_ * i_37_;
                    i_27_ -= i_40_ * i_23_;
                    i_23_ = 0;
                }
                i_20_ <<= -1371813428;
                if (i_22_ < 0) {
                    i_20_ -= i_22_ * i_35_;
                    i_22_ = 0;
                }
                if ((i_36_ ^ 0xffffffff) <= (i_37_ ^ 0xffffffff)) {
                    i_19_ -= i_22_;
                    i_22_ -= i_23_;
                    i_23_ = Class312.anInt3644 * i_23_;
                    while (--i_22_ >= 0) {
                        if (!r.method2105((byte) 90, (i_25_ >> -1475488884) + 1, Class103.anIntArray1317, 0, i_27_, (i_24_ >> 931037068) - 1, i_39_, i_23_))
                            return false;
                        i_27_ += i_40_;
                        i_24_ += i_37_;
                        i_23_ += Class312.anInt3644;
                        i_25_ += i_36_;
                    }
                    while (--i_19_ >= 0) {
                        if (!r.method2105((byte) 104, 1 + (i_25_ >> -1610194516), Class103.anIntArray1317, 0, i_27_, (i_20_ >> -623570836) + -1, i_39_, i_23_))
                            return false;
                        i_20_ += i_35_;
                        i_27_ += i_40_;
                        i_25_ += i_36_;
                        i_23_ += Class312.anInt3644;
                    }
                    return true;
                }
                i_19_ -= i_22_;
                i_22_ -= i_23_;
                i_23_ = Class312.anInt3644 * i_23_;
                while ((--i_22_ ^ 0xffffffff) <= -1) {
                    if (!r.method2105((byte) -117, 1 + (i_24_ >> -869422452), Class103.anIntArray1317, 0, i_27_, -1 + (i_25_ >> -242993972), i_39_, i_23_))
                        return false;
                    i_25_ += i_36_;
                    i_23_ += Class312.anInt3644;
                    i_24_ += i_37_;
                    i_27_ += i_40_;
                }
                while ((--i_19_ ^ 0xffffffff) <= -1) {
                    if (!r.method2105((byte) -122, (i_20_ >> 2120771244) + 1, Class103.anIntArray1317, 0, i_27_, (i_25_ >> -1015656948) - 1, i_39_, i_23_))
                        return false;
                    i_27_ += i_40_;
                    i_23_ += Class312.anInt3644;
                    i_25_ += i_36_;
                    i_20_ += i_35_;
                }
                return true;
            }
            if ((i_19_ ^ 0xffffffff) <= (Class64.anInt868 ^ 0xffffffff))
                return true;
            if ((Class64.anInt868 ^ 0xffffffff) > (i_23_ ^ 0xffffffff))
                i_23_ = Class64.anInt868;
            i = i_39_ + (i << -1478930520) - i_39_ * i_25_;
            if ((i_22_ ^ 0xffffffff) < (Class64.anInt868 ^ 0xffffffff))
                i_22_ = Class64.anInt868;
            if ((i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
                i_20_ = i_25_ <<= -1990311508;
                if (i_19_ < 0) {
                    i -= i_40_ * i_19_;
                    i_20_ -= i_35_ * i_19_;
                    i_25_ -= i_19_ * i_36_;
                    i_19_ = 0;
                }
                i_24_ <<= -996624532;
                if (i_23_ < 0) {
                    i_24_ -= i_23_ * i_37_;
                    i_23_ = 0;
                }
                if (i_19_ != i_23_ && (i_36_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff) || ((i_23_ ^ 0xffffffff) == (i_19_ ^ 0xffffffff) && i_35_ > i_37_)) {
                    i_22_ -= i_23_;
                    i_23_ -= i_19_;
                    i_19_ = Class312.anInt3644 * i_19_;
                    while (--i_23_ >= 0) {
                        if (!r.method2105((byte) 59, 1 + (i_25_ >> 1761661132), Class103.anIntArray1317, 0, i, -1 + (i_20_ >> -842939668), i_39_, i_19_))
                            return false;
                        i += i_40_;
                        i_20_ += i_35_;
                        i_19_ += Class312.anInt3644;
                        i_25_ += i_36_;
                    }
                    while ((--i_22_ ^ 0xffffffff) <= -1) {
                        if (!r.method2105((byte) -105, (i_24_ >> 1663966828) + 1, Class103.anIntArray1317, 0, i, -1 + (i_20_ >> 1010932908), i_39_, i_19_))
                            return false;
                        i_24_ += i_37_;
                        i_19_ += Class312.anInt3644;
                        i_20_ += i_35_;
                        i += i_40_;
                    }
                    return true;
                }
                i_22_ -= i_23_;
                i_23_ -= i_19_;
                i_19_ *= Class312.anInt3644;
                while ((--i_23_ ^ 0xffffffff) <= -1) {
                    if (!r.method2105((byte) -128, 1 + (i_20_ >> -1253170900), Class103.anIntArray1317, 0, i, -1 + (i_25_ >> 915339180), i_39_, i_19_))
                        return false;
                    i_19_ += Class312.anInt3644;
                    i_20_ += i_35_;
                    i_25_ += i_36_;
                    i += i_40_;
                }
                while ((--i_22_ ^ 0xffffffff) <= -1) {
                    if (!r.method2105((byte) -105, 1 + (i_20_ >> 1720193868), Class103.anIntArray1317, 0, i, -1 + (i_24_ >> 1785497164), i_39_, i_19_))
                        return false;
                    i += i_40_;
                    i_20_ += i_35_;
                    i_24_ += i_37_;
                    i_19_ += Class312.anInt3644;
                }
                return true;
            }
            i_24_ = i_25_ <<= 165153868;
            i_20_ <<= 1847842252;
            if ((i_19_ ^ 0xffffffff) > -1) {
                i -= i_19_ * i_40_;
                i_25_ -= i_19_ * i_36_;
                i_24_ -= i_35_ * i_19_;
                i_19_ = 0;
            }
            if ((i_22_ ^ 0xffffffff) > -1) {
                i_20_ -= i_37_ * i_22_;
                i_22_ = 0;
            }
            if ((i_35_ ^ 0xffffffff) <= (i_36_ ^ 0xffffffff)) {
                i_23_ -= i_22_;
                i_22_ -= i_19_;
                i_19_ = Class312.anInt3644 * i_19_;
                while ((--i_22_ ^ 0xffffffff) <= -1) {
                    if (!r.method2105((byte) -115, 1 + (i_24_ >> 1996860236), Class103.anIntArray1317, 0, i, -1 + (i_25_ >> -1368012212), i_39_, i_19_))
                        return false;
                    i_24_ += i_35_;
                    i_19_ += Class312.anInt3644;
                    i_25_ += i_36_;
                    i += i_40_;
                }
                while (--i_23_ >= 0) {
                    if (!r.method2105((byte) 36, 1 + (i_20_ >> 586974028), Class103.anIntArray1317, 0, i, -1 + (i_25_ >> 1099645580), i_39_, i_19_))
                        return false;
                    i += i_40_;
                    i_25_ += i_36_;
                    i_19_ += Class312.anInt3644;
                    i_20_ += i_37_;
                }
                return true;
            }
            i_23_ -= i_22_;
            i_22_ -= i_19_;
            i_19_ = Class312.anInt3644 * i_19_;
            while (--i_22_ >= 0) {
                if (!r.method2105((byte) 64, (i_25_ >> 1320415148) + 1, Class103.anIntArray1317, 0, i, (i_24_ >> 319907724) + -1, i_39_, i_19_))
                    return false;
                i_25_ += i_36_;
                i_19_ += Class312.anInt3644;
                i += i_40_;
                i_24_ += i_35_;
            }
            while (--i_23_ >= 0) {
                if (!r.method2105((byte) 13, 1 + (i_25_ >> 1869176044), Class103.anIntArray1317, 0, i, (i_20_ >> -1451666836) - 1, i_39_, i_19_))
                    return false;
                i_25_ += i_36_;
                i_20_ += i_37_;
                i += i_40_;
                i_19_ += Class312.anInt3644;
            }
            return true;
        }
        if ((i_22_ ^ 0xffffffff) <= (Class64.anInt868 ^ 0xffffffff))
            return true;
        i_26_ = -(i_20_ * i_39_) + (i_26_ << -2091447896) + i_39_;
        if ((Class64.anInt868 ^ 0xffffffff) > (i_19_ ^ 0xffffffff))
            i_19_ = Class64.anInt868;
        if ((i_23_ ^ 0xffffffff) < (Class64.anInt868 ^ 0xffffffff))
            i_23_ = Class64.anInt868;
        if ((i_23_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff)) {
            i_25_ = i_20_ <<= -1045370068;
            i_24_ <<= 233950796;
            if (i_22_ < 0) {
                i_25_ -= i_22_ * i_37_;
                i_26_ -= i_40_ * i_22_;
                i_20_ -= i_35_ * i_22_;
                i_22_ = 0;
            }
            if (i_23_ < 0) {
                i_24_ -= i_36_ * i_23_;
                i_23_ = 0;
            }
            if (((i_23_ ^ 0xffffffff) == (i_22_ ^ 0xffffffff) || (i_35_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)) && ((i_22_ ^ 0xffffffff) != (i_23_ ^ 0xffffffff) || (i_36_ ^ 0xffffffff) >= (i_35_ ^ 0xffffffff))) {
                i_19_ -= i_23_;
                i_23_ -= i_22_;
                i_22_ = Class312.anInt3644 * i_22_;
                while (--i_23_ >= 0) {
                    if (!r.method2105((byte) 19, 1 + (i_25_ >> 511404108), Class103.anIntArray1317, 0, i_26_, (i_20_ >> 1500853772) - 1, i_39_, i_22_))
                        return false;
                    i_25_ += i_37_;
                    i_22_ += Class312.anInt3644;
                    i_26_ += i_40_;
                    i_20_ += i_35_;
                }
                while (--i_19_ >= 0) {
                    if (!r.method2105((byte) -118, (i_24_ >> -565505108) + 1, Class103.anIntArray1317, 0, i_26_, -1 + (i_20_ >> -1748179668), i_39_, i_22_))
                        return false;
                    i_20_ += i_35_;
                    i_26_ += i_40_;
                    i_24_ += i_36_;
                    i_22_ += Class312.anInt3644;
                }
                return true;
            }
            i_19_ -= i_23_;
            i_23_ -= i_22_;
            i_22_ = Class312.anInt3644 * i_22_;
            while (--i_23_ >= 0) {
                if (!r.method2105((byte) 85, (i_20_ >> 1410634412) + 1, Class103.anIntArray1317, 0, i_26_, -1 + (i_25_ >> 520980844), i_39_, i_22_))
                    return false;
                i_20_ += i_35_;
                i_26_ += i_40_;
                i_25_ += i_37_;
                i_22_ += Class312.anInt3644;
            }
            while (--i_19_ >= 0) {
                if (!r.method2105((byte) -84, 1 + (i_20_ >> -18159700), Class103.anIntArray1317, 0, i_26_, (i_24_ >> 726451308) + -1, i_39_, i_22_))
                    return false;
                i_24_ += i_36_;
                i_20_ += i_35_;
                i_22_ += Class312.anInt3644;
                i_26_ += i_40_;
            }
            return true;
        }
        i_24_ = i_20_ <<= -229545204;
        i_25_ <<= 1472137036;
        if ((i_22_ ^ 0xffffffff) > -1) {
            i_26_ -= i_22_ * i_40_;
            i_24_ -= i_37_ * i_22_;
            i_20_ -= i_22_ * i_35_;
            i_22_ = 0;
        }
        if (i_19_ < 0) {
            i_25_ -= i_19_ * i_36_;
            i_19_ = 0;
        }
        if (((i_19_ ^ 0xffffffff) == (i_22_ ^ 0xffffffff) || (i_35_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)) && (i_19_ != i_22_ || (i_36_ ^ 0xffffffff) <= (i_37_ ^ 0xffffffff))) {
            i_23_ -= i_19_;
            i_19_ -= i_22_;
            i_22_ *= Class312.anInt3644;
            while ((--i_19_ ^ 0xffffffff) <= -1) {
                if (!r.method2105((byte) -108, 1 + (i_24_ >> 2080377196), Class103.anIntArray1317, 0, i_26_, -1 + (i_20_ >> -773675188), i_39_, i_22_))
                    return false;
                i_22_ += Class312.anInt3644;
                i_26_ += i_40_;
                i_24_ += i_37_;
                i_20_ += i_35_;
            }
            while (--i_23_ >= 0) {
                if (!r.method2105((byte) 8, 1 + (i_24_ >> -1882663636), Class103.anIntArray1317, 0, i_26_, (i_25_ >> -1302304788) - 1, i_39_, i_22_))
                    return false;
                i_22_ += Class312.anInt3644;
                i_24_ += i_37_;
                i_26_ += i_40_;
                i_25_ += i_36_;
            }
            return true;
        }
        i_23_ -= i_19_;
        i_19_ -= i_22_;
        i_22_ = Class312.anInt3644 * i_22_;
        while (--i_19_ >= 0) {
            if (!r.method2105((byte) -121, 1 + (i_20_ >> -326218612), Class103.anIntArray1317, 0, i_26_, -1 + (i_24_ >> -1860522804), i_39_, i_22_))
                return false;
            i_20_ += i_35_;
            i_24_ += i_37_;
            i_26_ += i_40_;
            i_22_ += Class312.anInt3644;
        }
        while (--i_23_ >= 0) {
            if (!r.method2105((byte) -115, 1 + (i_25_ >> 2064562284), Class103.anIntArray1317, 0, i_26_, (i_24_ >> 1935405164) + -1, i_39_, i_22_))
                return false;
            i_24_ += i_37_;
            i_25_ += i_36_;
            i_22_ += Class312.anInt3644;
            i_26_ += i_40_;
        }
        return true;
    }

    aa_Sub1(int i, int i_41_, int[] is, int[] is_42_) {
        ((aa_Sub1) this).anIntArray5253 = is_42_;
        ((aa_Sub1) this).anIntArray5252 = is;
    }
}
