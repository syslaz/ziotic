/* r_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub2 extends r {
    int anInt10271;
    static int anInt10272;
    static int anInt10273;
    static int[][] anIntArrayArray10274 = {{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
    static Class315 aClass315_10275;
    static int anInt10276 = 0;
    int anInt10277;
    static int anInt10278;
    static int anInt10279;
    byte[] aByteArray10280;
    static int anInt10281;
    static int anInt10282;
    static int[] anIntArray10283 = new int[2];
    static int anInt10284;
    int anInt10285;
    static int[] anIntArray10286 = new int[25];
    int anInt10287;
    static int anInt10288;

    final boolean method2113(int i, int i_0_, int i_1_) {
        if (i_0_ >= -117)
            ((r_Sub2) this).anInt10287 = 43;
        anInt10272++;
        if (((r_Sub2) this).aByteArray10280.length < i * i_1_)
            return false;
        return true;
    }

    static final Class296 method2114(int i) {
        anInt10278++;
        if (i != 16966)
            return null;
        try {
            return (Class296) Class.forName("Class296_Sub1").newInstance();
        } catch (Throwable throwable) {
            return null;
        }
    }

    static final void method2115(int i, int i_2_) {
        anInt10273++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 11);
        int i_3_ = 71 % ((i_2_ - 10) / 61);
        class248_sub8_sub10.method2076(-118);
    }

    public static void method2116(byte i) {
        anIntArrayArray10274 = null;
        anIntArray10283 = null;
        if (i > -78)
            method2115(-108, -2);
        aClass315_10275 = null;
        anIntArray10286 = null;
    }

    static final void method2117(int i, int i_4_, int i_5_) {
        anInt10288++;
        if (i_4_ > -75)
            aClass315_10275 = null;
        Class229 class229 = Class122.aClass229ArrayArray1524[i_5_][i];
        if (class229 != null) {
            ha_Sub3.anInt6131 = ((Class229) class229).anInt2587;
            Class282_Sub28.anInt7895 = ((Class229) class229).anInt2600;
            Node_Sub11.anInt6956 = ((Class229) class229).anInt2595;
        }
        Class310.method3246(107);
    }

    final void method2118(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt10284++;
        int i_12_ = 0;
        if (i_7_ == 4) {
            if ((i_8_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff))
                i_12_ = (i_6_ - i << 1548306192) / (i_8_ - i_10_);
            int i_13_ = 0;
            if ((i_8_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff))
                i_13_ = (-i_6_ + i_11_ << 637280304) / (-i_8_ + i_9_);
            int i_14_ = 0;
            if (i_9_ != i_10_)
                i_14_ = (-i_11_ + i << -462095088) / (-i_9_ + i_10_);
            if ((i_10_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff) && i_9_ >= i_10_) {
                if ((i_8_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff)) {
                    i_6_ = i <<= -1108657648;
                    if ((i_10_ ^ 0xffffffff) > -1) {
                        i -= i_12_ * i_10_;
                        i_6_ -= i_10_ * i_14_;
                        i_10_ = 0;
                    }
                    i_11_ <<= -1378261008;
                    if ((i_9_ ^ 0xffffffff) > -1) {
                        i_11_ -= i_13_ * i_9_;
                        i_9_ = 0;
                    }
                    if (((i_9_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff) && i_12_ > i_14_) || ((i_10_ ^ 0xffffffff) == (i_9_ ^ 0xffffffff) && i_12_ < i_13_)) {
                        i_8_ -= i_9_;
                        i_9_ -= i_10_;
                        i_10_ = ((r_Sub2) this).anInt10277 * i_10_;
                        while (--i_9_ >= 0) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i >> -667373840, i_10_, 11567, i_6_ >> -285016464, 0);
                            i_6_ += i_14_;
                            i_10_ += ((r_Sub2) this).anInt10277;
                            i += i_12_;
                        }
                        while ((--i_8_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i >> 1791877104, i_10_, i_7_ + 11563, i_11_ >> -2019565520, 0);
                            i_10_ += ((r_Sub2) this).anInt10277;
                            i += i_12_;
                            i_11_ += i_13_;
                        }
                    } else {
                        i_8_ -= i_9_;
                        i_9_ -= i_10_;
                        i_10_ *= ((r_Sub2) this).anInt10277;
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_6_ >> -1918369840, i_10_, 11567, i >> 109518640, 0);
                            i += i_12_;
                            i_10_ += ((r_Sub2) this).anInt10277;
                            i_6_ += i_14_;
                        }
                        while ((--i_8_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_11_ >> 2049636464, i_10_, 11567, i >> 2068565712, 0);
                            i_10_ += ((r_Sub2) this).anInt10277;
                            i_11_ += i_13_;
                            i += i_12_;
                        }
                    }
                } else {
                    i_11_ = i <<= 715013872;
                    i_6_ <<= -1701591568;
                    if (i_10_ < 0) {
                        i -= i_12_ * i_10_;
                        i_11_ -= i_10_ * i_14_;
                        i_10_ = 0;
                    }
                    if (i_8_ < 0) {
                        i_6_ -= i_13_ * i_8_;
                        i_8_ = 0;
                    }
                    if ((i_10_ == i_8_ || (i_14_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)) && ((i_8_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff) || (i_14_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff))) {
                        i_9_ -= i_8_;
                        i_8_ -= i_10_;
                        i_10_ = ((r_Sub2) this).anInt10277 * i_10_;
                        while (--i_8_ >= 0) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_11_ >> 66524272, i_10_, 11567, i >> -1995555024, 0);
                            i_11_ += i_14_;
                            i += i_12_;
                            i_10_ += ((r_Sub2) this).anInt10277;
                        }
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_11_ >> -1291206896, i_10_, i_7_ + 11563, i_6_ >> -1785371632, 0);
                            i_11_ += i_14_;
                            i_6_ += i_13_;
                            i_10_ += ((r_Sub2) this).anInt10277;
                        }
                    } else {
                        i_9_ -= i_8_;
                        i_8_ -= i_10_;
                        i_10_ = ((r_Sub2) this).anInt10277 * i_10_;
                        while (--i_8_ >= 0) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i >> -815314544, i_10_, 11567, i_11_ >> -351181264, 0);
                            i_11_ += i_14_;
                            i += i_12_;
                            i_10_ += ((r_Sub2) this).anInt10277;
                        }
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_6_ >> 742692112, i_10_, i_7_ ^ 0x2d2b, i_11_ >> -2079763792, 0);
                            i_10_ += ((r_Sub2) this).anInt10277;
                            i_6_ += i_13_;
                            i_11_ += i_14_;
                        }
                    }
                }
            } else if (i_9_ >= i_8_) {
                if (i_10_ > i_9_) {
                    i = i_6_ <<= -743161392;
                    if ((i_8_ ^ 0xffffffff) > -1) {
                        i_6_ -= i_13_ * i_8_;
                        i -= i_12_ * i_8_;
                        i_8_ = 0;
                    }
                    i_11_ <<= 224556752;
                    if (i_9_ < 0) {
                        i_11_ -= i_9_ * i_14_;
                        i_9_ = 0;
                    }
                    if ((i_8_ == i_9_ || (i_12_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)) && ((i_8_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff) || (i_12_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff))) {
                        i_10_ -= i_9_;
                        i_9_ -= i_8_;
                        i_8_ = ((r_Sub2) this).anInt10277 * i_8_;
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i >> 1563697648, i_8_, 11567, i_6_ >> 960154800, 0);
                            i_6_ += i_13_;
                            i_8_ += ((r_Sub2) this).anInt10277;
                            i += i_12_;
                        }
                        while (--i_10_ >= 0) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i >> 869616560, i_8_, 11567, i_11_ >> 1109850256, 0);
                            i_11_ += i_14_;
                            i += i_12_;
                            i_8_ += ((r_Sub2) this).anInt10277;
                        }
                    } else {
                        i_10_ -= i_9_;
                        i_9_ -= i_8_;
                        i_8_ *= ((r_Sub2) this).anInt10277;
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_6_ >> -160653136, i_8_, 11567, i >> -1417822576, 0);
                            i_8_ += ((r_Sub2) this).anInt10277;
                            i_6_ += i_13_;
                            i += i_12_;
                        }
                        while (--i_10_ >= 0) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_11_ >> -1701650480, i_8_, 11567, i >> 468466480, 0);
                            i_8_ += ((r_Sub2) this).anInt10277;
                            i += i_12_;
                            i_11_ += i_14_;
                        }
                    }
                } else {
                    i_11_ = i_6_ <<= -1652958640;
                    i <<= 955077008;
                    if (i_8_ < 0) {
                        i_11_ -= i_12_ * i_8_;
                        i_6_ -= i_8_ * i_13_;
                        i_8_ = 0;
                    }
                    if ((i_10_ ^ 0xffffffff) > -1) {
                        i -= i_14_ * i_10_;
                        i_10_ = 0;
                    }
                    if (i_13_ > i_12_) {
                        i_9_ -= i_10_;
                        i_10_ -= i_8_;
                        i_8_ = ((r_Sub2) this).anInt10277 * i_8_;
                        while ((--i_10_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_6_ >> -156688720, i_8_, 11567, i_11_ >> -277949648, 0);
                            i_11_ += i_12_;
                            i_6_ += i_13_;
                            i_8_ += ((r_Sub2) this).anInt10277;
                        }
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_6_ >> 1563320432, i_8_, 11567, i >> -1158917264, 0);
                            i_8_ += ((r_Sub2) this).anInt10277;
                            i += i_14_;
                            i_6_ += i_13_;
                        }
                    } else {
                        i_9_ -= i_10_;
                        i_10_ -= i_8_;
                        i_8_ = ((r_Sub2) this).anInt10277 * i_8_;
                        while (--i_10_ >= 0) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i_11_ >> -440419856, i_8_, 11567, i_6_ >> 1473793296, 0);
                            i_8_ += ((r_Sub2) this).anInt10277;
                            i_6_ += i_13_;
                            i_11_ += i_12_;
                        }
                        while ((--i_9_ ^ 0xffffffff) <= -1) {
                            Class175.method1586((((r_Sub2) this).aByteArray10280), i >> -1492767280, i_8_, 11567, i_6_ >> -1094747344, 0);
                            i += i_14_;
                            i_8_ += ((r_Sub2) this).anInt10277;
                            i_6_ += i_13_;
                        }
                    }
                }
            } else if ((i_8_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
                i = i_11_ <<= 1893921904;
                i_6_ <<= 130199280;
                if (i_9_ < 0) {
                    i -= i_9_ * i_13_;
                    i_11_ -= i_9_ * i_14_;
                    i_9_ = 0;
                }
                if (i_8_ < 0) {
                    i_6_ -= i_12_ * i_8_;
                    i_8_ = 0;
                }
                if ((i_14_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
                    i_10_ -= i_8_;
                    i_8_ -= i_9_;
                    i_9_ *= ((r_Sub2) this).anInt10277;
                    while (--i_8_ >= 0) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i_11_ >> -1946671440, i_9_, 11567, i >> -1177808432, 0);
                        i_9_ += ((r_Sub2) this).anInt10277;
                        i_11_ += i_14_;
                        i += i_13_;
                    }
                    while (--i_10_ >= 0) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i_11_ >> 44007312, i_9_, 11567, i_6_ >> 1108428656, 0);
                        i_9_ += ((r_Sub2) this).anInt10277;
                        i_6_ += i_12_;
                        i_11_ += i_14_;
                    }
                } else {
                    i_10_ -= i_8_;
                    i_8_ -= i_9_;
                    i_9_ = ((r_Sub2) this).anInt10277 * i_9_;
                    while ((--i_8_ ^ 0xffffffff) <= -1) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i >> -549254128, i_9_, 11567, i_11_ >> -1088378832, 0);
                        i += i_13_;
                        i_9_ += ((r_Sub2) this).anInt10277;
                        i_11_ += i_14_;
                    }
                    while ((--i_10_ ^ 0xffffffff) <= -1) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i_6_ >> 1780052688, i_9_, i_7_ ^ 0x2d2b, i_11_ >> -121685552, 0);
                        i_11_ += i_14_;
                        i_9_ += ((r_Sub2) this).anInt10277;
                        i_6_ += i_12_;
                    }
                }
            } else {
                i_6_ = i_11_ <<= -325470160;
                if ((i_9_ ^ 0xffffffff) > -1) {
                    i_11_ -= i_9_ * i_14_;
                    i_6_ -= i_13_ * i_9_;
                    i_9_ = 0;
                }
                i <<= 2086835280;
                if ((i_10_ ^ 0xffffffff) > -1) {
                    i -= i_10_ * i_12_;
                    i_10_ = 0;
                }
                if (i_14_ > i_13_) {
                    i_8_ -= i_10_;
                    i_10_ -= i_9_;
                    i_9_ *= ((r_Sub2) this).anInt10277;
                    while (--i_10_ >= 0) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i_11_ >> -1305039888, i_9_, 11567, i_6_ >> -1081272976, 0);
                        i_6_ += i_13_;
                        i_9_ += ((r_Sub2) this).anInt10277;
                        i_11_ += i_14_;
                    }
                    while ((--i_8_ ^ 0xffffffff) <= -1) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i >> -190038832, i_9_, i_7_ + 11563, i_6_ >> 1615239824, 0);
                        i_6_ += i_13_;
                        i += i_12_;
                        i_9_ += ((r_Sub2) this).anInt10277;
                    }
                } else {
                    i_8_ -= i_10_;
                    i_10_ -= i_9_;
                    i_9_ *= ((r_Sub2) this).anInt10277;
                    while ((--i_10_ ^ 0xffffffff) <= -1) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i_6_ >> 1566495952, i_9_, 11567, i_11_ >> -1075036240, 0);
                        i_6_ += i_13_;
                        i_11_ += i_14_;
                        i_9_ += ((r_Sub2) this).anInt10277;
                    }
                    while (--i_8_ >= 0) {
                        Class175.method1586(((r_Sub2) this).aByteArray10280, i_6_ >> 1537224656, i_9_, 11567, i >> -1543294384, 0);
                        i_9_ += ((r_Sub2) this).anInt10277;
                        i += i_12_;
                        i_6_ += i_13_;
                    }
                }
            }
        }
    }

    final void method2119(int i) {
        anInt10282++;
        if (i > 112) {
            int i_15_ = -1;
            int i_16_ = -8 + ((r_Sub2) this).aByteArray10280.length;
            while (i_15_ < i_16_) {
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
            }
            while (-1 + ((r_Sub2) this).aByteArray10280.length > i_15_)
                ((r_Sub2) this).aByteArray10280[++i_15_] = (byte) 0;
        }
    }

    r_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_17_) {
        ((r_Sub2) this).aByteArray10280 = new byte[i_17_ * i];
    }

    static final void method2120(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool, ha var_ha) {
        var_ha.method820(i_18_, 99, i_21_, i, i_22_, i_20_);
        anInt10279++;
        if (bool == false) {
            var_ha.method820(i_18_ - 2, 60, 16, 1 + i, i_22_ + 1, i_19_);
            var_ha.method812(-19 + i_21_, i_19_, -2 + i_18_, 111, i + 18, 1 + i_22_);
        }
    }

    final void method2121(int i, int i_23_, int i_24_, int i_25_, int i_26_) {
        ((r_Sub2) this).anInt10287 = i_26_;
        ((r_Sub2) this).anInt10271 = -i_23_ + i;
        anInt10281++;
        ((r_Sub2) this).anInt10285 = i_23_;
        if (i_24_ != -18573)
            method2120(124, -10, 85, -126, 23, 48, false, null);
        ((r_Sub2) this).anInt10277 = i_25_ + -i_26_;
    }
}
