/* r_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub1 extends r {
    int anInt10258;
    static int anInt10259;
    byte[] aByteArray10260;
    int anInt10261;
    static int anInt10262;
    int anInt10263;
    int anInt10264;
    static int anInt10265;
    static int anInt10266;
    static int anInt10267;
    static Class360 aClass360_10268;
    static int[] anIntArray10269 = new int[13];
    static int anInt10270;

    final void method2107(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt10262++;
        int i_6_ = 0;
        if ((i_5_ ^ 0xffffffff) != (i_0_ ^ 0xffffffff))
            i_6_ = (i + -i_2_ << 2113827760) / (i_5_ - i_0_);
        int i_7_ = 0;
        if (i_3_ != i_5_)
            i_7_ = (i_4_ - i << -538515408) / (-i_5_ + i_3_);
        int i_8_ = 0;
        if (i_1_ != -2745)
            ((r_Sub1) this).anInt10263 = -50;
        if ((i_0_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff))
            i_8_ = (i_2_ - i_4_ << 311007376) / (i_0_ - i_3_);
        if ((i_0_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff) && (i_3_ ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)) {
            if ((i_5_ ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)) {
                i = i_2_ <<= 633957552;
                if ((i_0_ ^ 0xffffffff) > -1) {
                    i -= i_0_ * i_8_;
                    i_2_ -= i_6_ * i_0_;
                    i_0_ = 0;
                }
                i_4_ <<= 818795664;
                if ((i_3_ ^ 0xffffffff) > -1) {
                    i_4_ -= i_7_ * i_3_;
                    i_3_ = 0;
                }
                if (((i_3_ ^ 0xffffffff) == (i_0_ ^ 0xffffffff) || (i_6_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) && (i_0_ != i_3_ || (i_7_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff))) {
                    i_5_ -= i_3_;
                    i_3_ -= i_0_;
                    i_0_ = ((r_Sub1) this).anInt10263 * i_0_;
                    while (--i_3_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -663786320, i_0_, 0, 14286, i >> -1542868912);
                        i_2_ += i_6_;
                        i += i_8_;
                        i_0_ += ((r_Sub1) this).anInt10263;
                    }
                    while (--i_5_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -1166475888, i_0_, 0, i_1_ ^ ~0x3d76, i_4_ >> 32200560);
                        i_4_ += i_7_;
                        i_2_ += i_6_;
                        i_0_ += ((r_Sub1) this).anInt10263;
                    }
                } else {
                    i_5_ -= i_3_;
                    i_3_ -= i_0_;
                    i_0_ *= ((r_Sub1) this).anInt10263;
                    while ((--i_3_ ^ 0xffffffff) <= -1) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -107290480, i_0_, 0, 14286, i_2_ >> -1733828240);
                        i += i_8_;
                        i_0_ += ((r_Sub1) this).anInt10263;
                        i_2_ += i_6_;
                    }
                    while ((--i_5_ ^ 0xffffffff) <= -1) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> 873011152, i_0_, 0, 14286, i_2_ >> -778658672);
                        i_0_ += ((r_Sub1) this).anInt10263;
                        i_2_ += i_6_;
                        i_4_ += i_7_;
                    }
                }
            } else {
                i_4_ = i_2_ <<= -1069787792;
                if ((i_0_ ^ 0xffffffff) > -1) {
                    i_2_ -= i_6_ * i_0_;
                    i_4_ -= i_8_ * i_0_;
                    i_0_ = 0;
                }
                i <<= -1384771536;
                if ((i_5_ ^ 0xffffffff) > -1) {
                    i -= i_5_ * i_7_;
                    i_5_ = 0;
                }
                if (((i_0_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) || i_8_ >= i_6_) && (i_0_ != i_5_ || (i_8_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))) {
                    i_3_ -= i_5_;
                    i_5_ -= i_0_;
                    i_0_ = ((r_Sub1) this).anInt10263 * i_0_;
                    while (--i_5_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -1311108592, i_0_, 0, 14286, i_4_ >> -1736332912);
                        i_4_ += i_8_;
                        i_2_ += i_6_;
                        i_0_ += ((r_Sub1) this).anInt10263;
                    }
                    while (--i_3_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -1903149520, i_0_, 0, 14286, i_4_ >> 300075056);
                        i_0_ += ((r_Sub1) this).anInt10263;
                        i += i_7_;
                        i_4_ += i_8_;
                    }
                } else {
                    i_3_ -= i_5_;
                    i_5_ -= i_0_;
                    i_0_ = ((r_Sub1) this).anInt10263 * i_0_;
                    while ((--i_5_ ^ 0xffffffff) <= -1) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> 1636300336, i_0_, 0, 14286, i_2_ >> 1237236016);
                        i_2_ += i_6_;
                        i_4_ += i_8_;
                        i_0_ += ((r_Sub1) this).anInt10263;
                    }
                    while ((--i_3_ ^ 0xffffffff) <= -1) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> -1083988880, i_0_, 0, 14286, i >> 1127143536);
                        i_4_ += i_8_;
                        i_0_ += ((r_Sub1) this).anInt10263;
                        i += i_7_;
                    }
                }
            }
        } else if (i_5_ > i_3_) {
            if (i_0_ >= i_5_) {
                i_2_ = i_4_ <<= -1991643248;
                i <<= 1896208432;
                if ((i_3_ ^ 0xffffffff) > -1) {
                    i_2_ -= i_7_ * i_3_;
                    i_4_ -= i_8_ * i_3_;
                    i_3_ = 0;
                }
                if ((i_5_ ^ 0xffffffff) > -1) {
                    i -= i_5_ * i_6_;
                    i_5_ = 0;
                }
                if ((i_7_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)) {
                    i_0_ -= i_5_;
                    i_5_ -= i_3_;
                    i_3_ = ((r_Sub1) this).anInt10263 * i_3_;
                    while ((--i_5_ ^ 0xffffffff) <= -1) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> -920159280, i_3_, 0, 14286, i_2_ >> 144204240);
                        i_4_ += i_8_;
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i_2_ += i_7_;
                    }
                    while (--i_0_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> 1772478928, i_3_, 0, 14286, i >> 1027220080);
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i_4_ += i_8_;
                        i += i_6_;
                    }
                } else {
                    i_0_ -= i_5_;
                    i_5_ -= i_3_;
                    i_3_ *= ((r_Sub1) this).anInt10263;
                    while (--i_5_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -730544304, i_3_, 0, i_1_ + 17031, i_4_ >> -1101756528);
                        i_2_ += i_7_;
                        i_4_ += i_8_;
                        i_3_ += ((r_Sub1) this).anInt10263;
                    }
                    while (--i_0_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -1812823888, i_3_, 0, i_1_ ^ ~0x3d76, i_4_ >> -1189842608);
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i += i_6_;
                        i_4_ += i_8_;
                    }
                }
            } else {
                i = i_4_ <<= -2004117360;
                if (i_3_ < 0) {
                    i -= i_3_ * i_7_;
                    i_4_ -= i_3_ * i_8_;
                    i_3_ = 0;
                }
                i_2_ <<= -1449864272;
                if ((i_0_ ^ 0xffffffff) > -1) {
                    i_2_ -= i_0_ * i_6_;
                    i_0_ = 0;
                }
                if (i_8_ <= i_7_) {
                    i_5_ -= i_0_;
                    i_0_ -= i_3_;
                    i_3_ = ((r_Sub1) this).anInt10263 * i_3_;
                    while (--i_0_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> 785354704, i_3_, 0, 14286, i >> -1790511728);
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i_4_ += i_8_;
                        i += i_7_;
                    }
                    while (--i_5_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> 615222160, i_3_, 0, 14286, i >> -1270111888);
                        i += i_7_;
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i_2_ += i_6_;
                    }
                } else {
                    i_5_ -= i_0_;
                    i_0_ -= i_3_;
                    i_3_ = ((r_Sub1) this).anInt10263 * i_3_;
                    while ((--i_0_ ^ 0xffffffff) <= -1) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -266562480, i_3_, 0, 14286, i_4_ >> -1472090256);
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i_4_ += i_8_;
                        i += i_7_;
                    }
                    while (--i_5_ >= 0) {
                        Class126.method1149(((r_Sub1) this).aByteArray10260, i >> 817335376, i_3_, 0, 14286, i_2_ >> 197739504);
                        i += i_7_;
                        i_3_ += ((r_Sub1) this).anInt10263;
                        i_2_ += i_6_;
                    }
                }
            }
        } else if (i_0_ <= i_3_) {
            i_4_ = i <<= -1872748432;
            i_2_ <<= -396468400;
            if (i_5_ < 0) {
                i -= i_5_ * i_7_;
                i_4_ -= i_5_ * i_6_;
                i_5_ = 0;
            }
            if ((i_0_ ^ 0xffffffff) > -1) {
                i_2_ -= i_8_ * i_0_;
                i_0_ = 0;
            }
            if (i_6_ < i_7_) {
                i_3_ -= i_0_;
                i_0_ -= i_5_;
                i_5_ *= ((r_Sub1) this).anInt10263;
                while (--i_0_ >= 0) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> 1529667568, i_5_, 0, 14286, i >> -842633168);
                    i_5_ += ((r_Sub1) this).anInt10263;
                    i += i_7_;
                    i_4_ += i_6_;
                }
                while ((--i_3_ ^ 0xffffffff) <= -1) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -2118247824, i_5_, 0, 14286, i >> -208925936);
                    i_2_ += i_8_;
                    i += i_7_;
                    i_5_ += ((r_Sub1) this).anInt10263;
                }
            } else {
                i_3_ -= i_0_;
                i_0_ -= i_5_;
                i_5_ *= ((r_Sub1) this).anInt10263;
                while ((--i_0_ ^ 0xffffffff) <= -1) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -959128816, i_5_, 0, 14286, i_4_ >> 767855792);
                    i += i_7_;
                    i_5_ += ((r_Sub1) this).anInt10263;
                    i_4_ += i_6_;
                }
                while (--i_3_ >= 0) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -719108368, i_5_, 0, i_1_ ^ ~0x3d76, i_2_ >> 1676049648);
                    i += i_7_;
                    i_5_ += ((r_Sub1) this).anInt10263;
                    i_2_ += i_8_;
                }
            }
        } else {
            i_2_ = i <<= -1711632688;
            if ((i_5_ ^ 0xffffffff) > -1) {
                i_2_ -= i_5_ * i_6_;
                i -= i_7_ * i_5_;
                i_5_ = 0;
            }
            i_4_ <<= 1846527152;
            if ((i_3_ ^ 0xffffffff) > -1) {
                i_4_ -= i_3_ * i_8_;
                i_3_ = 0;
            }
            if (((i_5_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff) || (i_6_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)) && ((i_5_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff) || i_8_ >= i_6_)) {
                i_0_ -= i_3_;
                i_3_ -= i_5_;
                i_5_ *= ((r_Sub1) this).anInt10263;
                while ((--i_3_ ^ 0xffffffff) <= -1) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i >> -1331355088, i_5_, 0, 14286, i_2_ >> 512669840);
                    i_5_ += ((r_Sub1) this).anInt10263;
                    i += i_7_;
                    i_2_ += i_6_;
                }
                while ((--i_0_ ^ 0xffffffff) <= -1) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i_4_ >> 1502510288, i_5_, 0, 14286, i_2_ >> 573183536);
                    i_2_ += i_6_;
                    i_4_ += i_8_;
                    i_5_ += ((r_Sub1) this).anInt10263;
                }
            } else {
                i_0_ -= i_3_;
                i_3_ -= i_5_;
                i_5_ = ((r_Sub1) this).anInt10263 * i_5_;
                while ((--i_3_ ^ 0xffffffff) <= -1) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -1222696848, i_5_, 0, 14286, i >> 1649122256);
                    i_2_ += i_6_;
                    i += i_7_;
                    i_5_ += ((r_Sub1) this).anInt10263;
                }
                while ((--i_0_ ^ 0xffffffff) <= -1) {
                    Class126.method1149(((r_Sub1) this).aByteArray10260, i_2_ >> -1516164080, i_5_, 0, 14286, i_4_ >> -608800176);
                    i_2_ += i_6_;
                    i_4_ += i_8_;
                    i_5_ += ((r_Sub1) this).anInt10263;
                }
            }
        }
    }

    final void method2108(boolean bool) {
        anInt10259++;
        if (bool != true)
            aClass360_10268 = null;
        int i = -1;
        int i_9_ = ((r_Sub1) this).aByteArray10260.length - 8;
        while ((i_9_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
        }
        while ((-1 + ((r_Sub1) this).aByteArray10260.length ^ 0xffffffff) < (i ^ 0xffffffff))
            ((r_Sub1) this).aByteArray10260[++i] = (byte) 0;
    }

    final void method2109(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
        ((r_Sub1) this).anInt10264 = i_10_;
        anInt10266++;
        if (i_11_ > -109)
            method2109(44, 68, -83, -40, 26);
        ((r_Sub1) this).anInt10261 = i_13_;
        ((r_Sub1) this).anInt10263 = i + -i_10_;
        ((r_Sub1) this).anInt10258 = i_12_ - i_13_;
    }

    final boolean method2110(int i, int i_14_, int i_15_) {
        anInt10265++;
        if (i_14_ != -1)
            method2111(-35);
        if (i * i_15_ > ((r_Sub1) this).aByteArray10260.length)
            return false;
        return true;
    }

    public static void method2111(int i) {
        if (i == -1) {
            anIntArray10269 = null;
            aClass360_10268 = null;
        }
    }

    static final int method2112(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
        i_16_ &= 0x3;
        if ((0x1 & i_17_) == 1) {
            int i_22_ = i;
            i = i_19_;
            i_19_ = i_22_;
        }
        anInt10270++;
        if (i_16_ == 0)
            return i_18_;
        if ((i_16_ ^ 0xffffffff) == i_20_)
            return 1 - (i - -i_21_) + 7;
        if (i_16_ == 2)
            return -i_19_ - (-1 - (7 - i_18_));
        return i_21_;
    }

    r_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_23_) {
        ((r_Sub1) this).aByteArray10260 = new byte[i_23_ * i];
    }

    static {
        aClass360_10268 = new Class360();
    }
}
