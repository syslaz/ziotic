/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class164 {
    static int anInt1921;
    static int anInt1922;
    static int anInt1923;
    int anInt1924;
    static int anInt1925;
    static int anInt1926;
    static int anInt1927;
    int anInt1928;
    int anInt1929;
    static int anInt1930;
    static int anInt1931;
    static int anInt1932;
    static int anInt1933;
    static int anInt1934 = 1;
    static int anInt1935;
    static int anInt1936;
    static int anInt1937;
    static int anInt1938;
    static int anInt1939;
    static int anInt1940;
    static int anInt1941;
    static int anInt1942;
    int[][] anIntArrayArray1943;
    int anInt1944;

    final void method1515(int i, int i_0_, int i_1_) {
        if (i_0_ >= -28)
            method1526(-119, 110, -115);
        i_1_ -= ((Class164) this).anInt1944;
        anInt1930++;
        i -= ((Class164) this).anInt1928;
        ((Class164) this).anIntArrayArray1943[i][i_1_] = Class112.method794((((Class164) this).anIntArrayArray1943[i][i_1_]), -2097153);
    }

    final void method1516(boolean bool, int i, boolean bool_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt1927++;
        int i_7_ = 256;
        if (bool)
            i_7_ |= 0x20000;
        if (i_6_ >= -86)
            method1530(-84, null);
        i_3_ -= ((Class164) this).anInt1944;
        if (bool_2_)
            i_7_ |= 0x40000000;
        i_5_ -= ((Class164) this).anInt1928;
        for (int i_8_ = i_5_; i_5_ + i > i_8_; i_8_++) {
            if ((i_8_ ^ 0xffffffff) <= -1 && (i_8_ ^ 0xffffffff) > (((Class164) this).anInt1924 ^ 0xffffffff)) {
                for (int i_9_ = i_3_; i_3_ + i_4_ > i_9_; i_9_++) {
                    if ((i_9_ ^ 0xffffffff) <= -1 && ((Class164) this).anInt1929 > i_9_)
                        method1520(i_9_, i_7_, i_8_, (byte) 82);
                }
            }
        }
    }

    private final void method1517(int i, int i_10_, int i_11_, boolean bool) {
        if (bool == true) {
            ((Class164) this).anIntArrayArray1943[i][i_10_] = Class112.method794((((Class164) this).anIntArrayArray1943[i][i_10_]), i_11_ ^ 0xffffffff);
            anInt1932++;
        }
    }

    final void method1518(byte i) {
        for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (((Class164) this).anInt1924 ^ 0xffffffff); i_12_++) {
            for (int i_13_ = 0; ((((Class164) this).anInt1929 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
                if (i_12_ == 0 || i_13_ == 0 || ((-5 + ((Class164) this).anInt1924 ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)) || ((((Class164) this).anInt1929 + -5 ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)))
                    ((Class164) this).anIntArrayArray1943[i_12_][i_13_] = -1;
                else
                    ((Class164) this).anIntArrayArray1943[i_12_][i_13_] = 2097152;
            }
        }
        if (i != 12)
            ((Class164) this).anInt1929 = -8;
        anInt1942++;
    }

    final void method1519(int i, int i_14_, byte i_15_, int i_16_, boolean bool, int i_17_, boolean bool_18_) {
        i_14_ -= ((Class164) this).anInt1944;
        anInt1922++;
        i_17_ -= ((Class164) this).anInt1928;
        if ((i_16_ ^ 0xffffffff) == -1) {
            if (i == 0) {
                method1517(i_17_, i_14_, 128, true);
                method1517(i_17_ + -1, i_14_, 8, true);
            }
            if (i == 1) {
                method1517(i_17_, i_14_, 2, true);
                method1517(i_17_, i_14_ + 1, 32, true);
            }
            if (i == 2) {
                method1517(i_17_, i_14_, 8, true);
                method1517(i_17_ - -1, i_14_, 128, true);
            }
            if (i == 3) {
                method1517(i_17_, i_14_, 32, true);
                method1517(i_17_, -1 + i_14_, 2, true);
            }
        }
        if (i_16_ == 1 || (i_16_ ^ 0xffffffff) == -4) {
            if ((i ^ 0xffffffff) == -1) {
                method1517(i_17_, i_14_, 1, true);
                method1517(-1 + i_17_, 1 + i_14_, 16, true);
            }
            if (i == 1) {
                method1517(i_17_, i_14_, 4, true);
                method1517(1 + i_17_, 1 + i_14_, 64, true);
            }
            if (i == 2) {
                method1517(i_17_, i_14_, 16, true);
                method1517(1 + i_17_, i_14_ - 1, 1, true);
            }
            if ((i ^ 0xffffffff) == -4) {
                method1517(i_17_, i_14_, 64, true);
                method1517(-1 + i_17_, -1 + i_14_, 4, true);
            }
        }
        if (i_15_ > -95)
            ((Class164) this).anInt1929 = 109;
        if ((i_16_ ^ 0xffffffff) == -3) {
            if ((i ^ 0xffffffff) == -1) {
                method1517(i_17_, i_14_, 130, true);
                method1517(-1 + i_17_, i_14_, 8, true);
                method1517(i_17_, i_14_ + 1, 32, true);
            }
            if ((i ^ 0xffffffff) == -2) {
                method1517(i_17_, i_14_, 10, true);
                method1517(i_17_, 1 + i_14_, 32, true);
                method1517(1 + i_17_, i_14_, 128, true);
            }
            if ((i ^ 0xffffffff) == -3) {
                method1517(i_17_, i_14_, 40, true);
                method1517(1 + i_17_, i_14_, 128, true);
                method1517(i_17_, i_14_ - 1, 2, true);
            }
            if (i == 3) {
                method1517(i_17_, i_14_, 160, true);
                method1517(i_17_, -1 + i_14_, 2, true);
                method1517(-1 + i_17_, i_14_, 8, true);
            }
        }
        if (bool_18_) {
            if ((i_16_ ^ 0xffffffff) == -1) {
                if ((i ^ 0xffffffff) == -1) {
                    method1517(i_17_, i_14_, 65536, true);
                    method1517(i_17_ + -1, i_14_, 4096, true);
                }
                if ((i ^ 0xffffffff) == -2) {
                    method1517(i_17_, i_14_, 1024, true);
                    method1517(i_17_, 1 + i_14_, 16384, true);
                }
                if ((i ^ 0xffffffff) == -3) {
                    method1517(i_17_, i_14_, 4096, true);
                    method1517(1 + i_17_, i_14_, 65536, true);
                }
                if (i == 3) {
                    method1517(i_17_, i_14_, 16384, true);
                    method1517(i_17_, -1 + i_14_, 1024, true);
                }
            }
            if ((i_16_ ^ 0xffffffff) == -2 || i_16_ == 3) {
                if ((i ^ 0xffffffff) == -1) {
                    method1517(i_17_, i_14_, 512, true);
                    method1517(-1 + i_17_, i_14_ - -1, 8192, true);
                }
                if ((i ^ 0xffffffff) == -2) {
                    method1517(i_17_, i_14_, 2048, true);
                    method1517(i_17_ + 1, 1 + i_14_, 32768, true);
                }
                if (i == 2) {
                    method1517(i_17_, i_14_, 8192, true);
                    method1517(i_17_ + 1, i_14_ - 1, 512, true);
                }
                if (i == 3) {
                    method1517(i_17_, i_14_, 32768, true);
                    method1517(-1 + i_17_, -1 + i_14_, 2048, true);
                }
            }
            if ((i_16_ ^ 0xffffffff) == -3) {
                if (i == 0) {
                    method1517(i_17_, i_14_, 66560, true);
                    method1517(i_17_ - 1, i_14_, 4096, true);
                    method1517(i_17_, 1 + i_14_, 16384, true);
                }
                if (i == 1) {
                    method1517(i_17_, i_14_, 5120, true);
                    method1517(i_17_, 1 + i_14_, 16384, true);
                    method1517(1 + i_17_, i_14_, 65536, true);
                }
                if ((i ^ 0xffffffff) == -3) {
                    method1517(i_17_, i_14_, 20480, true);
                    method1517(i_17_ + 1, i_14_, 65536, true);
                    method1517(i_17_, i_14_ - 1, 1024, true);
                }
                if ((i ^ 0xffffffff) == -4) {
                    method1517(i_17_, i_14_, 81920, true);
                    method1517(i_17_, i_14_ - 1, 1024, true);
                    method1517(i_17_ - 1, i_14_, 4096, true);
                }
            }
        }
        if (bool) {
            if (i_16_ == 0) {
                if (i == 0) {
                    method1517(i_17_, i_14_, 536870912, true);
                    method1517(i_17_ + -1, i_14_, 33554432, true);
                }
                if ((i ^ 0xffffffff) == -2) {
                    method1517(i_17_, i_14_, 8388608, true);
                    method1517(i_17_, i_14_ - -1, 134217728, true);
                }
                if ((i ^ 0xffffffff) == -3) {
                    method1517(i_17_, i_14_, 33554432, true);
                    method1517(i_17_ + 1, i_14_, 536870912, true);
                }
                if ((i ^ 0xffffffff) == -4) {
                    method1517(i_17_, i_14_, 134217728, true);
                    method1517(i_17_, -1 + i_14_, 8388608, true);
                }
            }
            if ((i_16_ ^ 0xffffffff) == -2 || i_16_ == 3) {
                if ((i ^ 0xffffffff) == -1) {
                    method1517(i_17_, i_14_, 4194304, true);
                    method1517(-1 + i_17_, 1 + i_14_, 67108864, true);
                }
                if ((i ^ 0xffffffff) == -2) {
                    method1517(i_17_, i_14_, 16777216, true);
                    method1517(i_17_ - -1, 1 + i_14_, 268435456, true);
                }
                if (i == 2) {
                    method1517(i_17_, i_14_, 67108864, true);
                    method1517(1 + i_17_, i_14_ + -1, 4194304, true);
                }
                if (i == 3) {
                    method1517(i_17_, i_14_, 268435456, true);
                    method1517(-1 + i_17_, -1 + i_14_, 16777216, true);
                }
            }
            if (i_16_ == 2) {
                if ((i ^ 0xffffffff) == -1) {
                    method1517(i_17_, i_14_, 545259520, true);
                    method1517(i_17_ - 1, i_14_, 33554432, true);
                    method1517(i_17_, i_14_ - -1, 134217728, true);
                }
                if (i == 1) {
                    method1517(i_17_, i_14_, 41943040, true);
                    method1517(i_17_, 1 + i_14_, 134217728, true);
                    method1517(i_17_ - -1, i_14_, 536870912, true);
                }
                if (i == 2) {
                    method1517(i_17_, i_14_, 167772160, true);
                    method1517(1 + i_17_, i_14_, 536870912, true);
                    method1517(i_17_, -1 + i_14_, 8388608, true);
                }
                if (i == 3) {
                    method1517(i_17_, i_14_, 671088640, true);
                    method1517(i_17_, i_14_ + -1, 8388608, true);
                    method1517(-1 + i_17_, i_14_, 33554432, true);
                }
            }
        }
    }

    private final void method1520(int i, int i_19_, int i_20_, byte i_21_) {
        anInt1941++;
        ((Class164) this).anIntArrayArray1943[i_20_][i] = Class358.retrieveLooksSettings((((Class164) this).anIntArrayArray1943[i_20_][i]), i_19_);
        if (i_21_ != 82)
            method1519(-76, -127, (byte) -73, -49, true, -37, false);
    }

    final void method1521(int i, int i_22_, int i_23_) {
        i_22_ -= ((Class164) this).anInt1928;
        i_23_ -= ((Class164) this).anInt1944;
        anInt1925++;
        ((Class164) this).anIntArrayArray1943[i_22_][i_23_] = Class358.retrieveLooksSettings((((Class164) this).anIntArrayArray1943[i_22_][i_23_]), i);
    }

    static final int method1522(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
        if (i_26_ != 2)
            method1530(118, null);
        anInt1938++;
        if (Class177.aSArray2070 == null)
            return 0;
        if ((i_25_ ^ 0xffffffff) > -4) {
            int i_29_ = i >> -1887629079;
            int i_30_ = i_27_ >> -1084916247;
            if ((i_24_ ^ 0xffffffff) > -1 || i_28_ < 0 || -1 + Node_Sub8_Sub4.anInt8360 < i_24_ || i_28_ > Node_Sub22.anInt7074 + -1)
                return 0;
            if (i_29_ < 1 || i_30_ < 1 || i_29_ > Node_Sub8_Sub4.anInt8360 + -1 || -1 + Node_Sub22.anInt7074 < i_30_)
                return 0;
            boolean bool = (((r.aByteArrayArrayArray9033[1][i >> 348871753][i_27_ >> -171505271]) & 0x2 ^ 0xffffffff) != -1);
            if ((i & 0x1ff) == 0) {
                boolean bool_31_ = (((r.aByteArrayArrayArray9033[1][i_29_ - 1][i_27_ >> 726980681]) & 0x2 ^ 0xffffffff) != -1);
                boolean bool_32_ = ((0x2 & (r.aByteArrayArrayArray9033[1][i_29_][i_27_ >> 951096617]) ^ 0xffffffff) != -1);
                if (!bool_32_ != !bool_31_)
                    bool = (0x2 & r.aByteArrayArrayArray9033[1][i_24_][i_28_] ^ 0xffffffff) != -1;
            }
            if ((i_27_ & 0x1ff ^ 0xffffffff) == -1) {
                boolean bool_33_ = (((r.aByteArrayArrayArray9033[1][i >> 798063561][-1 + i_30_]) & 0x2) != 0);
                boolean bool_34_ = (((r.aByteArrayArrayArray9033[1][i >> 455138089][i_30_] & 0x2) ^ 0xffffffff) != -1);
                if (bool_33_ == !bool_34_)
                    bool = (r.aByteArrayArrayArray9033[1][i_24_][i_28_] & 0x2 ^ 0xffffffff) != -1;
            }
            if (bool)
                i_25_++;
        }
        return Class177.aSArray2070[i_25_].method3150((byte) 100, i, i_27_);
    }

    final boolean method1523(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
        anInt1933++;
        if (i != i_35_) {
            if (i_40_ >= i_38_ && i_40_ <= -1 + i_35_ + i_38_ && i_39_ >= i_39_ && (i_39_ + i_35_ + -1 ^ 0xffffffff) <= (i_39_ ^ 0xffffffff))
                return true;
        } else if ((i_38_ ^ 0xffffffff) == (i_40_ ^ 0xffffffff) && i_39_ == i_41_)
            return true;
        i_38_ -= ((Class164) this).anInt1928;
        i_39_ -= ((Class164) this).anInt1944;
        i_40_ -= ((Class164) this).anInt1928;
        i_41_ -= ((Class164) this).anInt1944;
        if ((i_35_ ^ 0xffffffff) == -2) {
            if (i_37_ == 6 || i_37_ == 7) {
                if (i_37_ == 7)
                    i_36_ = i_36_ + 2 & 0x3;
                if ((i_36_ ^ 0xffffffff) != -1) {
                    if (i_36_ != 1) {
                        if (i_36_ != 2) {
                            if (i_36_ == 3) {
                                if ((1 + i_40_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && i_39_ == i_41_ && (0x80 & (((Class164) this).anIntArrayArray1943[i_38_][i_41_])) == 0)
                                    return true;
                                if ((i_38_ ^ 0xffffffff) == (i_40_ ^ 0xffffffff) && i_41_ == i_39_ + 1 && ((((Class164) this).anIntArrayArray1943[i_38_][i_41_]) & 0x20 ^ 0xffffffff) == -1)
                                    return true;
                            }
                        } else {
                            if (i_38_ == i_40_ - 1 && i_39_ == i_41_ && ((((Class164) this).anIntArrayArray1943[i_38_][i_41_]) & 0x8 ^ 0xffffffff) == -1)
                                return true;
                            if (i_40_ == i_38_ && (i_41_ ^ 0xffffffff) == (1 + i_39_ ^ 0xffffffff) && (0x20 & (((Class164) this).anIntArrayArray1943[i_38_][i_41_]) ^ 0xffffffff) == -1)
                                return true;
                        }
                    } else {
                        if (i_38_ == -1 + i_40_ && (i_39_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_38_][i_41_]) & 0x8) == 0)
                            return true;
                        if ((i_40_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && (-1 + i_39_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (0x2 & (((Class164) this).anIntArrayArray1943[i_38_][i_41_]) ^ 0xffffffff) == -1)
                            return true;
                    }
                } else {
                    if (1 + i_40_ == i_38_ && (i_41_ ^ 0xffffffff) == (i_39_ ^ 0xffffffff) && (0x80 & (((Class164) this).anIntArrayArray1943[i_38_][i_41_])) == 0)
                        return true;
                    if (i_40_ == i_38_ && i_41_ == i_39_ + -1 && (((Class164) this).anIntArrayArray1943[i_38_][i_41_] & 0x2) == 0)
                        return true;
                }
            }
            if (i_37_ == 8) {
                if ((i_40_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && (i_39_ + 1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && ((0x20 & ((Class164) this).anIntArrayArray1943[i_38_][i_41_]) ^ 0xffffffff) == -1)
                    return true;
                if ((i_38_ ^ 0xffffffff) == (i_40_ ^ 0xffffffff) && i_41_ == i_39_ + -1 && (((Class164) this).anIntArrayArray1943[i_38_][i_41_] & 0x2) == 0)
                    return true;
                if (i_40_ - 1 == i_38_ && i_39_ == i_41_ && (((Class164) this).anIntArrayArray1943[i_38_][i_41_] & 0x8) == 0)
                    return true;
                if (i_40_ - -1 == i_38_ && i_39_ == i_41_ && ((0x80 & ((Class164) this).anIntArrayArray1943[i_38_][i_41_]) == 0))
                    return true;
            }
        } else {
            int i_42_ = i_35_ + i_38_ - 1;
            int i_43_ = i_41_ + i_35_ + -1;
            if ((i_37_ ^ 0xffffffff) == -7 || (i_37_ ^ 0xffffffff) == -8) {
                if (i_37_ == 7)
                    i_36_ = i_36_ - -2 & 0x3;
                if (i_36_ == 0) {
                    if ((1 + i_40_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff) && i_39_ <= i_43_ && (((Class164) this).anIntArrayArray1943[i_38_][i_39_] & 0x80) == 0)
                        return true;
                    if ((i_40_ ^ 0xffffffff) <= (i_38_ ^ 0xffffffff) && i_42_ >= i_40_ && i_39_ - i_35_ == i_41_ && ((((Class164) this).anIntArrayArray1943[i_40_][i_43_]) & 0x2 ^ 0xffffffff) == -1)
                        return true;
                } else if (i_36_ == 1) {
                    if (i_38_ == i_40_ - i_35_ && i_39_ >= i_41_ && (i_43_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && (0x8 & (((Class164) this).anIntArrayArray1943[i_42_][i_39_])) == 0)
                        return true;
                    if (i_38_ <= i_40_ && i_40_ <= i_42_ && i_41_ == -i_35_ + i_39_ && ((((Class164) this).anIntArrayArray1943[i_40_][i_43_]) & 0x2 ^ 0xffffffff) == -1)
                        return true;
                } else if (i_36_ != 2) {
                    if (i_36_ == 3) {
                        if (i_38_ == 1 + i_40_ && (i_41_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && (i_43_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_38_][i_39_]) & 0x80 ^ 0xffffffff) == -1)
                            return true;
                        if ((i_40_ ^ 0xffffffff) <= (i_38_ ^ 0xffffffff) && (i_40_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && i_41_ == 1 + i_39_ && ((((Class164) this).anIntArrayArray1943[i_40_][i_41_]) & 0x20 ^ 0xffffffff) == -1)
                            return true;
                    }
                } else {
                    if ((-i_35_ + i_40_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && (i_41_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && i_43_ >= i_39_ && (((Class164) this).anIntArrayArray1943[i_42_][i_39_] & 0x8) == 0)
                        return true;
                    if ((i_38_ ^ 0xffffffff) >= (i_40_ ^ 0xffffffff) && (i_42_ ^ 0xffffffff) <= (i_40_ ^ 0xffffffff) && (1 + i_39_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (0x20 & (((Class164) this).anIntArrayArray1943[i_40_][i_41_]) ^ 0xffffffff) == -1)
                        return true;
                }
            }
            if ((i_37_ ^ 0xffffffff) == -9) {
                if (i_38_ <= i_40_ && (i_42_ ^ 0xffffffff) <= (i_40_ ^ 0xffffffff) && (1 + i_39_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && ((0x20 & ((Class164) this).anIntArrayArray1943[i_40_][i_41_]) == 0))
                    return true;
                if (i_40_ >= i_38_ && (i_42_ ^ 0xffffffff) <= (i_40_ ^ 0xffffffff) && (i_39_ - i_35_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && ((0x2 & ((Class164) this).anIntArrayArray1943[i_40_][i_43_]) ^ 0xffffffff) == -1)
                    return true;
                if (i_38_ == -i_35_ + i_40_ && (i_41_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && i_43_ >= i_39_ && ((0x8 & ((Class164) this).anIntArrayArray1943[i_42_][i_39_]) == 0))
                    return true;
                if ((i_40_ + 1 ^ 0xffffffff) == (i_38_ ^ 0xffffffff) && i_41_ <= i_39_ && (i_39_ ^ 0xffffffff) >= (i_43_ ^ 0xffffffff) && ((0x80 & ((Class164) this).anIntArrayArray1943[i_38_][i_39_]) ^ 0xffffffff) == -1)
                    return true;
            }
        }
        return false;
    }

    final boolean method1524(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_) {
        anInt1931++;
        if ((i_45_ ^ 0xffffffff) < -2) {
            if (Node_Sub33.method2569(i_45_, i_49_, i_48_, i_47_, i_45_, i_44_, i, i_50_, true))
                return true;
            return method1529(i_45_, i_44_, i_49_, i_47_, i_50_, i_46_ + -101, i, i_51_, i_45_, i_48_);
        }
        int i_52_ = i_44_ + i - 1;
        int i_53_ = i_47_ + i_49_ + i_46_;
        if (i <= i_50_ && i_50_ <= i_52_ && i_48_ >= i_47_ && (i_48_ ^ 0xffffffff) >= (i_53_ ^ 0xffffffff))
            return true;
        if ((i + -1 ^ 0xffffffff) == (i_50_ ^ 0xffffffff) && i_47_ <= i_48_ && i_53_ >= i_48_ && (0x8 & (((Class164) this).anIntArrayArray1943[i_50_ - ((Class164) this).anInt1928][-((Class164) this).anInt1944 + i_48_])) == 0 && (0x8 & i_51_) == 0)
            return true;
        if ((1 + i_52_ ^ 0xffffffff) == (i_50_ ^ 0xffffffff) && (i_47_ ^ 0xffffffff) >= (i_48_ ^ 0xffffffff) && (i_53_ ^ 0xffffffff) <= (i_48_ ^ 0xffffffff) && (0x80 & (((Class164) this).anIntArrayArray1943[i_50_ + -((Class164) this).anInt1928][-((Class164) this).anInt1944 + i_48_]) ^ 0xffffffff) == -1 && (0x2 & i_51_) == 0)
            return true;
        if ((-1 + i_47_ ^ 0xffffffff) == (i_48_ ^ 0xffffffff) && (i ^ 0xffffffff) >= (i_50_ ^ 0xffffffff) && i_50_ <= i_52_ && (0x2 & (((Class164) this).anIntArrayArray1943[-((Class164) this).anInt1928 + i_50_][-((Class164) this).anInt1944 + i_48_]) ^ 0xffffffff) == -1 && (0x4 & i_51_ ^ 0xffffffff) == -1)
            return true;
        if (1 + i_53_ == i_48_ && i <= i_50_ && (i_50_ ^ 0xffffffff) >= (i_52_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[-((Class164) this).anInt1928 + i_50_][-((Class164) this).anInt1944 + i_48_]) & 0x20) == 0 && (i_51_ & 0x1 ^ 0xffffffff) == -1)
            return true;
        return false;
    }

    final void method1525(boolean bool, int i, int i_54_) {
        if (bool != true)
            anInt1934 = 32;
        anInt1940++;
        i_54_ -= ((Class164) this).anInt1944;
        i -= ((Class164) this).anInt1928;
        ((Class164) this).anIntArrayArray1943[i][i_54_] = Class358.retrieveLooksSettings((((Class164) this).anIntArrayArray1943[i][i_54_]), 262144);
    }

    final void method1526(int i, int i_55_, int i_56_) {
        i_55_ -= ((Class164) this).anInt1928;
        i_56_ -= ((Class164) this).anInt1944;
        if (i > -47)
            method1526(-92, -70, -124);
        anInt1935++;
        ((Class164) this).anIntArrayArray1943[i_55_][i_56_] = Class112.method794((((Class164) this).anIntArrayArray1943[i_55_][i_56_]), -262145);
    }

    final void method1527(boolean bool, int i, int i_57_, boolean bool_58_, int i_59_, int i_60_, int i_61_) {
        i_57_ -= ((Class164) this).anInt1944;
        i_61_ -= ((Class164) this).anInt1928;
        if (i_59_ == 659456) {
            anInt1936++;
            if (i == 0) {
                if (i_60_ == 0) {
                    method1520(i_57_, 128, i_61_, (byte) 82);
                    method1520(i_57_, 8, -1 + i_61_, (byte) 82);
                }
                if ((i_60_ ^ 0xffffffff) == -2) {
                    method1520(i_57_, 2, i_61_, (byte) 82);
                    method1520(i_57_ + 1, 32, i_61_, (byte) 82);
                }
                if ((i_60_ ^ 0xffffffff) == -3) {
                    method1520(i_57_, 8, i_61_, (byte) 82);
                    method1520(i_57_, 128, i_61_ - -1, (byte) 82);
                }
                if (i_60_ == 3) {
                    method1520(i_57_, 32, i_61_, (byte) 82);
                    method1520(-1 + i_57_, 2, i_61_, (byte) 82);
                }
            }
            if ((i ^ 0xffffffff) == -2 || i == 3) {
                if (i_60_ == 0) {
                    method1520(i_57_, 1, i_61_, (byte) 82);
                    method1520(1 + i_57_, 16, -1 + i_61_, (byte) 82);
                }
                if ((i_60_ ^ 0xffffffff) == -2) {
                    method1520(i_57_, 4, i_61_, (byte) 82);
                    method1520(1 + i_57_, 64, i_61_ - -1, (byte) 82);
                }
                if ((i_60_ ^ 0xffffffff) == -3) {
                    method1520(i_57_, 16, i_61_, (byte) 82);
                    method1520(i_57_ - 1, 1, i_61_ + 1, (byte) 82);
                }
                if (i_60_ == 3) {
                    method1520(i_57_, 64, i_61_, (byte) 82);
                    method1520(-1 + i_57_, 4, -1 + i_61_, (byte) 82);
                }
            }
            if ((i ^ 0xffffffff) == -3) {
                if ((i_60_ ^ 0xffffffff) == -1) {
                    method1520(i_57_, 130, i_61_, (byte) 82);
                    method1520(i_57_, 8, i_61_ - 1, (byte) 82);
                    method1520(1 + i_57_, 32, i_61_, (byte) 82);
                }
                if (i_60_ == 1) {
                    method1520(i_57_, 10, i_61_, (byte) 82);
                    method1520(i_57_ - -1, 32, i_61_, (byte) 82);
                    method1520(i_57_, 128, 1 + i_61_, (byte) 82);
                }
                if (i_60_ == 2) {
                    method1520(i_57_, 40, i_61_, (byte) 82);
                    method1520(i_57_, 128, 1 + i_61_, (byte) 82);
                    method1520(i_57_ + -1, 2, i_61_, (byte) 82);
                }
                if (i_60_ == 3) {
                    method1520(i_57_, 160, i_61_, (byte) 82);
                    method1520(-1 + i_57_, 2, i_61_, (byte) 82);
                    method1520(i_57_, 8, i_61_ + -1, (byte) 82);
                }
            }
            if (bool_58_) {
                if (i == 0) {
                    if ((i_60_ ^ 0xffffffff) == -1) {
                        method1520(i_57_, 65536, i_61_, (byte) 82);
                        method1520(i_57_, 4096, i_61_ - 1, (byte) 82);
                    }
                    if ((i_60_ ^ 0xffffffff) == -2) {
                        method1520(i_57_, 1024, i_61_, (byte) 82);
                        method1520(i_57_ + 1, 16384, i_61_, (byte) 82);
                    }
                    if (i_60_ == 2) {
                        method1520(i_57_, 4096, i_61_, (byte) 82);
                        method1520(i_57_, 65536, 1 + i_61_, (byte) 82);
                    }
                    if (i_60_ == 3) {
                        method1520(i_57_, 16384, i_61_, (byte) 82);
                        method1520(i_57_ + -1, 1024, i_61_, (byte) 82);
                    }
                }
                if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -4) {
                    if ((i_60_ ^ 0xffffffff) == -1) {
                        method1520(i_57_, 512, i_61_, (byte) 82);
                        method1520(i_57_ - -1, 8192, -1 + i_61_, (byte) 82);
                    }
                    if ((i_60_ ^ 0xffffffff) == -2) {
                        method1520(i_57_, 2048, i_61_, (byte) 82);
                        method1520(i_57_ + 1, 32768, i_61_ - -1, (byte) 82);
                    }
                    if (i_60_ == 2) {
                        method1520(i_57_, 8192, i_61_, (byte) 82);
                        method1520(-1 + i_57_, 512, i_61_ + 1, (byte) 82);
                    }
                    if (i_60_ == 3) {
                        method1520(i_57_, 32768, i_61_, (byte) 82);
                        method1520(-1 + i_57_, 2048, -1 + i_61_, (byte) 82);
                    }
                }
                if ((i ^ 0xffffffff) == -3) {
                    if (i_60_ == 0) {
                        method1520(i_57_, 66560, i_61_, (byte) 82);
                        method1520(i_57_, 4096, -1 + i_61_, (byte) 82);
                        method1520(i_57_ - -1, 16384, i_61_, (byte) 82);
                    }
                    if (i_60_ == 1) {
                        method1520(i_57_, 5120, i_61_, (byte) 82);
                        method1520(1 + i_57_, 16384, i_61_, (byte) 82);
                        method1520(i_57_, 65536, 1 + i_61_, (byte) 82);
                    }
                    if (i_60_ == 2) {
                        method1520(i_57_, 20480, i_61_, (byte) 82);
                        method1520(i_57_, 65536, 1 + i_61_, (byte) 82);
                        method1520(i_57_ - 1, 1024, i_61_, (byte) 82);
                    }
                    if (i_60_ == 3) {
                        method1520(i_57_, 81920, i_61_, (byte) 82);
                        method1520(i_57_ - 1, 1024, i_61_, (byte) 82);
                        method1520(i_57_, 4096, -1 + i_61_, (byte) 82);
                    }
                }
            }
            if (bool) {
                if (i == 0) {
                    if (i_60_ == 0) {
                        method1520(i_57_, 536870912, i_61_, (byte) 82);
                        method1520(i_57_, 33554432, -1 + i_61_, (byte) 82);
                    }
                    if ((i_60_ ^ 0xffffffff) == -2) {
                        method1520(i_57_, 8388608, i_61_, (byte) 82);
                        method1520(1 + i_57_, 134217728, i_61_, (byte) 82);
                    }
                    if (i_60_ == 2) {
                        method1520(i_57_, 33554432, i_61_, (byte) 82);
                        method1520(i_57_, 536870912, i_61_ + 1, (byte) 82);
                    }
                    if (i_60_ == 3) {
                        method1520(i_57_, 134217728, i_61_, (byte) 82);
                        method1520(-1 + i_57_, 8388608, i_61_, (byte) 82);
                    }
                }
                if (i == 1 || (i ^ 0xffffffff) == -4) {
                    if ((i_60_ ^ 0xffffffff) == -1) {
                        method1520(i_57_, 4194304, i_61_, (byte) 82);
                        method1520(i_57_ - -1, 67108864, i_61_ - 1, (byte) 82);
                    }
                    if ((i_60_ ^ 0xffffffff) == -2) {
                        method1520(i_57_, 16777216, i_61_, (byte) 82);
                        method1520(1 + i_57_, 268435456, i_61_ - -1, (byte) 82);
                    }
                    if (i_60_ == 2) {
                        method1520(i_57_, 67108864, i_61_, (byte) 82);
                        method1520(i_57_ + -1, 4194304, i_61_ + 1, (byte) 82);
                    }
                    if ((i_60_ ^ 0xffffffff) == -4) {
                        method1520(i_57_, 268435456, i_61_, (byte) 82);
                        method1520(i_57_ - 1, 16777216, -1 + i_61_, (byte) 82);
                    }
                }
                if (i == 2) {
                    if (i_60_ == 0) {
                        method1520(i_57_, 545259520, i_61_, (byte) 82);
                        method1520(i_57_, 33554432, i_61_ + -1, (byte) 82);
                        method1520(i_57_ - -1, 134217728, i_61_, (byte) 82);
                    }
                    if (i_60_ == 1) {
                        method1520(i_57_, 41943040, i_61_, (byte) 82);
                        method1520(i_57_ + 1, 134217728, i_61_, (byte) 82);
                        method1520(i_57_, 536870912, 1 + i_61_, (byte) 82);
                    }
                    if ((i_60_ ^ 0xffffffff) == -3) {
                        method1520(i_57_, 167772160, i_61_, (byte) 82);
                        method1520(i_57_, 536870912, 1 + i_61_, (byte) 82);
                        method1520(i_57_ + -1, 8388608, i_61_, (byte) 82);
                    }
                    if (i_60_ == 3) {
                        method1520(i_57_, 671088640, i_61_, (byte) 82);
                        method1520(i_57_ - 1, 8388608, i_61_, (byte) 82);
                        method1520(i_57_, 33554432, i_61_ - 1, (byte) 82);
                    }
                }
            }
        }
    }

    final void method1528(int i, int i_62_, int i_63_, boolean bool, int i_64_, boolean bool_65_, int i_66_, int i_67_) {
        anInt1939++;
        int i_68_ = 256;
        if (bool)
            i_68_ |= 0x20000;
        if (bool_65_)
            i_68_ |= 0x40000000;
        i_62_ -= ((Class164) this).anInt1944;
        if ((i_63_ ^ 0xffffffff) == -2 || i_63_ == 3) {
            int i_69_ = i_66_;
            i_66_ = i;
            i = i_69_;
        }
        i_64_ -= ((Class164) this).anInt1928;
        if (i_67_ > -89)
            method1522(78, 127, 122, -66, -33, -16);
        for (int i_70_ = i_64_; i_66_ + i_64_ > i_70_; i_70_++) {
            if ((i_70_ ^ 0xffffffff) <= -1 && ((Class164) this).anInt1924 > i_70_) {
                for (int i_71_ = i_62_; i + i_62_ > i_71_; i_71_++) {
                    if (i_71_ >= 0 && (i_71_ ^ 0xffffffff) > (((Class164) this).anInt1929 ^ 0xffffffff))
                        method1517(i_70_, i_71_, i_68_, true);
                }
            }
        }
    }

    final boolean method1529(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
        anInt1921++;
        int i_81_ = -51 / ((-45 - i_76_) / 52);
        int i_82_ = i + i_75_;
        int i_83_ = i_79_ + i_80_;
        int i_84_ = i_72_ + i_77_;
        int i_85_ = i_73_ + i_74_;
        if (i_75_ == i_84_ && (0x2 & i_78_ ^ 0xffffffff) == -1) {
            int i_86_ = i_80_ <= i_74_ ? i_74_ : i_80_;
            for (int i_87_ = i_85_ > i_83_ ? i_83_ : i_85_; i_87_ > i_86_; i_86_++) {
                if ((0x8 & (((Class164) this).anIntArrayArray1943[i_84_ + (-1 - ((Class164) this).anInt1928)][i_86_ + -((Class164) this).anInt1944]) ^ 0xffffffff) == -1)
                    return true;
            }
        } else if (i_82_ == i_77_ && (i_78_ & 0x8 ^ 0xffffffff) == -1) {
            int i_88_ = (i_74_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff) ? i_80_ : i_74_;
            for (int i_89_ = i_85_ > i_83_ ? i_83_ : i_85_; (i_89_ ^ 0xffffffff) < (i_88_ ^ 0xffffffff); i_88_++) {
                if ((0x80 & (((Class164) this).anIntArrayArray1943[i_77_ - ((Class164) this).anInt1928][i_88_ + -((Class164) this).anInt1944]) ^ 0xffffffff) == -1)
                    return true;
            }
        } else if (i_85_ != i_80_ || (0x1 & i_78_ ^ 0xffffffff) != -1) {
            if (i_83_ == i_74_ && (0x4 & i_78_) == 0) {
                int i_90_ = ((i_75_ ^ 0xffffffff) >= (i_77_ ^ 0xffffffff) ? i_77_ : i_75_);
                for (int i_91_ = ((i_84_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff) ? i_84_ : i_82_); i_91_ > i_90_; i_90_++) {
                    if ((0x20 & (((Class164) this).anIntArrayArray1943[-((Class164) this).anInt1928 + i_90_][i_74_ + -((Class164) this).anInt1944])) == 0)
                        return true;
                }
            }
        } else {
            int i_92_ = i_75_ > i_77_ ? i_75_ : i_77_;
            for (int i_93_ = i_84_ > i_82_ ? i_82_ : i_84_; (i_92_ ^ 0xffffffff) > (i_93_ ^ 0xffffffff); i_92_++) {
                if (((((Class164) this).anIntArrayArray1943[i_92_ - ((Class164) this).anInt1928][-((Class164) this).anInt1944 + (-1 + i_85_)]) & 0x2 ^ 0xffffffff) == -1)
                    return true;
            }
        }
        return false;
    }

    static final Class49 method1530(int i, Animable animable) {
        anInt1923++;
        Class49 class49;
        if (Class212.aClass49_2451 != null) {
            class49 = Class212.aClass49_2451;
            Class212.aClass49_2451 = ((Class49) Class212.aClass49_2451).aClass49_660;
            Class382.anInt4702--;
            ((Class49) class49).aClass49_660 = null;
        } else
            class49 = new Class49();
        if (i != 31296)
            method1522(-62, -65, 58, 2, -112, 88);
        ((Class49) class49).aAnimable_656 = animable;
        return class49;
    }

    final boolean method1531(int i, byte i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_) {
        anInt1926++;
        if (i_94_ != -119)
            return false;
        if ((i_97_ ^ 0xffffffff) == -2) {
            if (i_99_ == i_98_ && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff))
                return true;
        } else if (i_98_ >= i_99_ && -1 + i_97_ + i_99_ >= i_98_ && i_100_ <= i_100_ && (i_100_ ^ 0xffffffff) >= (i_100_ - -i_97_ - 1 ^ 0xffffffff))
            return true;
        i_95_ -= ((Class164) this).anInt1944;
        i_98_ -= ((Class164) this).anInt1928;
        i_99_ -= ((Class164) this).anInt1928;
        i_100_ -= ((Class164) this).anInt1944;
        if (i_97_ != 1) {
            int i_101_ = i_99_ + (i_97_ - 1);
            int i_102_ = -1 + (i_95_ + i_97_);
            if (i_96_ == 0) {
                if (i != 0) {
                    if (i != 1) {
                        if ((i ^ 0xffffffff) == -3) {
                            if ((i_99_ ^ 0xffffffff) == (1 + i_98_ ^ 0xffffffff) && i_95_ <= i_100_ && (i_102_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff))
                                return true;
                            if ((i_98_ ^ 0xffffffff) <= (i_99_ ^ 0xffffffff) && i_101_ >= i_98_ && (1 + i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && (0x2c0120 & (((Class164) this).anIntArrayArray1943[i_98_][i_95_]) ^ 0xffffffff) == -1)
                                return true;
                            if ((i_99_ ^ 0xffffffff) >= (i_98_ ^ 0xffffffff) && i_101_ >= i_98_ && i_95_ == i_100_ + -i_97_ && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_98_][i_102_]) ^ 0xffffffff) == -1)
                                return true;
                        } else if (i == 3) {
                            if (i_99_ <= i_98_ && i_101_ >= i_98_ && i_95_ == -i_97_ + i_100_)
                                return true;
                            if (i_98_ + -i_97_ == i_99_ && i_100_ >= i_95_ && i_100_ <= i_102_ && ((((Class164) this).anIntArrayArray1943[i_101_][i_100_]) & 0x2c0108) == 0)
                                return true;
                            if (i_99_ == 1 + i_98_ && (i_100_ ^ 0xffffffff) <= (i_95_ ^ 0xffffffff) && i_102_ >= i_100_ && (0x2c0180 & (((Class164) this).anIntArrayArray1943[i_99_][i_100_])) == 0)
                                return true;
                        }
                    } else {
                        if (i_98_ >= i_99_ && i_101_ >= i_98_ && i_95_ == 1 + i_100_)
                            return true;
                        if (i_99_ == -i_97_ + i_98_ && i_95_ <= i_100_ && (i_100_ ^ 0xffffffff) >= (i_102_ ^ 0xffffffff) && (0x2c0108 & (((Class164) this).anIntArrayArray1943[i_101_][i_100_]) ^ 0xffffffff) == -1)
                            return true;
                        if ((i_99_ ^ 0xffffffff) == (1 + i_98_ ^ 0xffffffff) && i_100_ >= i_95_ && i_102_ >= i_100_ && (0x2c0180 & (((Class164) this).anIntArrayArray1943[i_99_][i_100_])) == 0)
                            return true;
                    }
                } else {
                    if ((i_99_ ^ 0xffffffff) == (-i_97_ + i_98_ ^ 0xffffffff) && i_100_ >= i_95_ && (i_100_ ^ 0xffffffff) >= (i_102_ ^ 0xffffffff))
                        return true;
                    if (i_99_ <= i_98_ && i_98_ <= i_101_ && (1 + i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && (0x2c0120 & (((Class164) this).anIntArrayArray1943[i_98_][i_95_])) == 0)
                        return true;
                    if (i_99_ <= i_98_ && i_101_ >= i_98_ && (-i_97_ + i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_98_][i_102_]) & 0x2c0102) == 0)
                        return true;
                }
            }
            if (i_96_ == 2) {
                if ((i ^ 0xffffffff) == -1) {
                    if ((-i_97_ + i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (i_100_ ^ 0xffffffff) <= (i_95_ ^ 0xffffffff) && (i_102_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff))
                        return true;
                    if (i_98_ >= i_99_ && (i_101_ ^ 0xffffffff) <= (i_98_ ^ 0xffffffff) && (i_95_ ^ 0xffffffff) == (i_100_ + 1 ^ 0xffffffff))
                        return true;
                    if (i_99_ == i_98_ + 1 && (i_100_ ^ 0xffffffff) <= (i_95_ ^ 0xffffffff) && (i_100_ ^ 0xffffffff) >= (i_102_ ^ 0xffffffff) && (0x2c0180 & (((Class164) this).anIntArrayArray1943[i_99_][i_100_])) == 0)
                        return true;
                    if (i_98_ >= i_99_ && i_101_ >= i_98_ && (-i_97_ + i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_98_][i_102_]) ^ 0xffffffff) == -1)
                        return true;
                } else if ((i ^ 0xffffffff) != -2) {
                    if ((i ^ 0xffffffff) != -3) {
                        if ((i ^ 0xffffffff) == -4) {
                            if (i_99_ == -i_97_ + i_98_ && i_100_ >= i_95_ && i_102_ >= i_100_)
                                return true;
                            if ((i_98_ ^ 0xffffffff) <= (i_99_ ^ 0xffffffff) && (i_98_ ^ 0xffffffff) >= (i_101_ ^ 0xffffffff) && 1 + i_100_ == i_95_ && ((((Class164) this).anIntArrayArray1943[i_98_][i_95_]) & 0x2c0120) == 0)
                                return true;
                            if ((i_98_ + 1 ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (i_95_ ^ 0xffffffff) >= (i_100_ ^ 0xffffffff) && (i_102_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_99_][i_100_]) & 0x2c0180) == 0)
                                return true;
                            if ((i_98_ ^ 0xffffffff) <= (i_99_ ^ 0xffffffff) && i_101_ >= i_98_ && (i_95_ ^ 0xffffffff) == (i_100_ + -i_97_ ^ 0xffffffff))
                                return true;
                        }
                    } else {
                        if ((-i_97_ + i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (i_100_ ^ 0xffffffff) <= (i_95_ ^ 0xffffffff) && i_100_ <= i_102_ && ((((Class164) this).anIntArrayArray1943[i_101_][i_100_]) & 0x2c0108 ^ 0xffffffff) == -1)
                            return true;
                        if (i_99_ <= i_98_ && i_98_ <= i_101_ && 1 + i_100_ == i_95_ && (0x2c0120 & (((Class164) this).anIntArrayArray1943[i_98_][i_95_])) == 0)
                            return true;
                        if (i_98_ + 1 == i_99_ && i_100_ >= i_95_ && (i_100_ ^ 0xffffffff) >= (i_102_ ^ 0xffffffff))
                            return true;
                        if (i_98_ >= i_99_ && i_101_ >= i_98_ && i_100_ + -i_97_ == i_95_)
                            return true;
                    }
                } else {
                    if (i_98_ + -i_97_ == i_99_ && i_100_ >= i_95_ && (i_102_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff) && (0x2c0108 & (((Class164) this).anIntArrayArray1943[i_101_][i_100_])) == 0)
                        return true;
                    if ((i_99_ ^ 0xffffffff) >= (i_98_ ^ 0xffffffff) && i_101_ >= i_98_ && i_95_ == i_100_ + 1)
                        return true;
                    if (i_99_ == i_98_ + 1 && i_100_ >= i_95_ && (i_102_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff))
                        return true;
                    if ((i_98_ ^ 0xffffffff) <= (i_99_ ^ 0xffffffff) && (i_98_ ^ 0xffffffff) >= (i_101_ ^ 0xffffffff) && i_95_ == -i_97_ + i_100_ && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_98_][i_102_])) == 0)
                        return true;
                }
            }
            if ((i_96_ ^ 0xffffffff) == -10) {
                if (i_99_ <= i_98_ && (i_101_ ^ 0xffffffff) <= (i_98_ ^ 0xffffffff) && i_100_ - -1 == i_95_ && ((0x2c0120 & ((Class164) this).anIntArrayArray1943[i_98_][i_95_]) == 0))
                    return true;
                if ((i_99_ ^ 0xffffffff) >= (i_98_ ^ 0xffffffff) && i_98_ <= i_101_ && (i_95_ ^ 0xffffffff) == (i_100_ - i_97_ ^ 0xffffffff) && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_98_][i_102_])) == 0)
                    return true;
                if ((-i_97_ + i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_95_ <= i_100_ && (i_100_ ^ 0xffffffff) >= (i_102_ ^ 0xffffffff) && (0x2c0108 & (((Class164) this).anIntArrayArray1943[i_101_][i_100_]) ^ 0xffffffff) == -1)
                    return true;
                if (i_99_ == 1 + i_98_ && i_100_ >= i_95_ && (i_100_ ^ 0xffffffff) >= (i_102_ ^ 0xffffffff) && (((Class164) this).anIntArrayArray1943[i_99_][i_100_] & 0x2c0180) == 0)
                    return true;
            }
        } else {
            if (i_96_ == 0) {
                if ((i ^ 0xffffffff) == -1) {
                    if ((i_98_ + -1 ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff))
                        return true;
                    if (i_99_ == i_98_ && (i_100_ - -1 ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && (0x2c0120 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_]) ^ 0xffffffff) == -1)
                        return true;
                    if (i_98_ == i_99_ && (i_100_ - 1 ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_99_][i_95_]) & 0x2c0102 ^ 0xffffffff) == -1)
                        return true;
                } else if (i != 1) {
                    if (i == 2) {
                        if ((1 + i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (i_95_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff))
                            return true;
                        if ((i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && 1 + i_100_ == i_95_ && ((((Class164) this).anIntArrayArray1943[i_99_][i_95_]) & 0x2c0120) == 0)
                            return true;
                        if ((i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_100_ + -1 == i_95_ && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_])) == 0)
                            return true;
                    } else if ((i ^ 0xffffffff) == -4) {
                        if ((i_99_ ^ 0xffffffff) == (i_98_ ^ 0xffffffff) && i_100_ - 1 == i_95_)
                            return true;
                        if ((i_99_ ^ 0xffffffff) == (i_98_ - 1 ^ 0xffffffff) && (i_95_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_99_][i_95_]) & 0x2c0108 ^ 0xffffffff) == -1)
                            return true;
                        if (i_99_ == 1 + i_98_ && i_100_ == i_95_ && (0x2c0180 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_])) == 0)
                            return true;
                    }
                } else {
                    if (i_99_ == i_98_ && i_95_ == 1 + i_100_)
                        return true;
                    if (-1 + i_98_ == i_99_ && i_95_ == i_100_ && (0x2c0108 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_]) ^ 0xffffffff) == -1)
                        return true;
                    if ((i_98_ + 1 ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_95_ == i_100_ && (0x2c0180 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_])) == 0)
                        return true;
                }
            }
            if ((i_96_ ^ 0xffffffff) == -3) {
                if (i != 0) {
                    if ((i ^ 0xffffffff) == -2) {
                        if (i_98_ - 1 == i_99_ && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_99_][i_95_]) & 0x2c0108) == 0)
                            return true;
                        if (i_98_ == i_99_ && (i_95_ ^ 0xffffffff) == (i_100_ - -1 ^ 0xffffffff))
                            return true;
                        if (i_98_ - -1 == i_99_ && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff))
                            return true;
                        if (i_98_ == i_99_ && -1 + i_100_ == i_95_ && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_])) == 0)
                            return true;
                    } else if ((i ^ 0xffffffff) == -3) {
                        if ((i_98_ - 1 ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_100_ == i_95_ && (0x2c0108 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_]) ^ 0xffffffff) == -1)
                            return true;
                        if (i_98_ == i_99_ && i_100_ + 1 == i_95_ && (0x2c0120 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_])) == 0)
                            return true;
                        if (i_99_ == 1 + i_98_ && i_95_ == i_100_)
                            return true;
                        if (i_99_ == i_98_ && (i_95_ ^ 0xffffffff) == (-1 + i_100_ ^ 0xffffffff))
                            return true;
                    } else if ((i ^ 0xffffffff) == -4) {
                        if ((i_98_ + -1 ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff))
                            return true;
                        if ((i_99_ ^ 0xffffffff) == (i_98_ ^ 0xffffffff) && (i_100_ - -1 ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && (0x2c0120 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_])) == 0)
                            return true;
                        if ((i_99_ ^ 0xffffffff) == (i_98_ - -1 ^ 0xffffffff) && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && ((((Class164) this).anIntArrayArray1943[i_99_][i_95_]) & 0x2c0180 ^ 0xffffffff) == -1)
                            return true;
                        if (i_98_ == i_99_ && (i_100_ - 1 ^ 0xffffffff) == (i_95_ ^ 0xffffffff))
                            return true;
                    }
                } else {
                    if (i_99_ == i_98_ + -1 && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff))
                        return true;
                    if (i_98_ == i_99_ && i_95_ == 1 + i_100_)
                        return true;
                    if ((1 + i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_100_ == i_95_ && (((Class164) this).anIntArrayArray1943[i_99_][i_95_] & 0x2c0180) == 0)
                        return true;
                    if ((i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && (-1 + i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && (0x2c0102 & (((Class164) this).anIntArrayArray1943[i_99_][i_95_]) ^ 0xffffffff) == -1)
                        return true;
                }
            }
            if (i_96_ == 9) {
                if ((i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_100_ + 1 == i_95_ && (((Class164) this).anIntArrayArray1943[i_99_][i_95_] & 0x20) == 0)
                    return true;
                if (i_99_ == i_98_ && i_100_ + -1 == i_95_ && ((0x2 & ((Class164) this).anIntArrayArray1943[i_99_][i_95_]) ^ 0xffffffff) == -1)
                    return true;
                if ((-1 + i_98_ ^ 0xffffffff) == (i_99_ ^ 0xffffffff) && i_95_ == i_100_ && ((0x8 & ((Class164) this).anIntArrayArray1943[i_99_][i_95_]) ^ 0xffffffff) == -1)
                    return true;
                if (1 + i_98_ == i_99_ && (i_100_ ^ 0xffffffff) == (i_95_ ^ 0xffffffff) && ((0x80 & ((Class164) this).anIntArrayArray1943[i_99_][i_95_]) == 0))
                    return true;
            }
        }
        return false;
    }
}
