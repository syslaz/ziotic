/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110 {
    static int anInt1381;
    static int anInt1382;
    static OutgoingOpcode aOutgoingOpcode_1383 = new OutgoingOpcode(4, 1);
    static int anInt1384;
    static int anInt1385;
    static int anInt1386;

    public static void method766(int i) {
        if (i != 13334)
            aOutgoingOpcode_1383 = null;
        aOutgoingOpcode_1383 = null;
    }

    static final byte[] method767(int i, String string) {
        anInt1385++;
        int i_0_ = string.length();
        if ((i_0_ ^ 0xffffffff) == -1)
            return new byte[0];
        int i_1_ = ~0x3 & i_0_ - -3;
        int i_2_ = 3 * (i_1_ / 4);
        if ((i_0_ ^ 0xffffffff) >= (-2 + i_1_ ^ 0xffffffff) || (Class139.method1278(string.charAt(-2 + i_1_), 5041) ^ 0xffffffff) == 0)
            i_2_ -= 2;
        else if (i_0_ <= -1 + i_1_ || Class139.method1278(string.charAt(i_1_ - 1), 5041) == -1)
            i_2_--;
        byte[] is = new byte[i_2_];
        Class282_Sub28.method3038(is, string, 0, i);
        return is;
    }

    static final void method768(byte i) {
        synchronized (Class156.aClass360Array1847) {
            int i_3_ = 0;
            if (i > -69)
                anInt1384 = 113;
            for (/**/; Class156.aClass360Array1847.length > i_3_; i_3_++) {
                Class156.aClass360Array1847[i_3_] = new Class360();
                Node_Sub8_Sub15.anIntArray9045[i_3_] = 0;
            }
        }
        anInt1382++;
    }

    static final boolean method769(Class164 class164, int i, int i_4_, int i_5_, int i_6_, byte i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        anInt1381++;
        if (i_7_ <= 38)
            method768((byte) 42);
        int i_13_ = i_6_;
        int i_14_ = i_8_;
        int i_15_ = 64;
        int i_16_ = 64;
        int i_17_ = i_6_ + -i_15_;
        int i_18_ = i_8_ - i_16_;
        Class301_Sub3_Sub1.anIntArrayArray9976[i_15_][i_16_] = 99;
        Node_Sub12.anIntArrayArray6958[i_15_][i_16_] = 0;
        int i_19_ = 0;
        Class5.anIntArray146[i_19_] = i_13_;
        int i_20_ = 0;
        Class49.anIntArray655[i_19_++] = i_14_;
        int[][] is = ((Class164) class164).anIntArrayArray1943;
        while ((i_19_ ^ 0xffffffff) != (i_20_ ^ 0xffffffff)) {
            i_13_ = Class5.anIntArray146[i_20_];
            i_14_ = Class49.anIntArray655[i_20_];
            i_16_ = i_14_ - i_18_;
            i_15_ = -i_17_ + i_13_;
            i_20_ = 0xfff & i_20_ - -1;
            int i_21_ = -((Class164) class164).anInt1928 + i_13_;
            int i_22_ = i_14_ - ((Class164) class164).anInt1944;
            int i_23_ = i_5_;
            while_80_:
            do {
                while_79_:
                do {
                    while_78_:
                    do {
                        while_77_:
                        do {
                            do {
                                if ((i_23_ ^ 0xffffffff) != 3) {
                                    if ((i_23_ ^ 0xffffffff) != 2) {
                                        if (i_23_ != -2) {
                                            if (i_23_ != -1) {
                                                if ((i_23_ ^ 0xffffffff) == -1 || ((i_23_ ^ 0xffffffff) == -2) || i_23_ == 2 || ((i_23_ ^ 0xffffffff) == -4) || i_23_ == 9)
                                                    break while_78_;
                                                break while_79_;
                                            }
                                        } else
                                            break;
                                        break while_77_;
                                    }
                                } else {
                                    if ((i_4_ ^ 0xffffffff) == (i_13_ ^ 0xffffffff) && i_10_ == i_14_) {
                                        Class15.anInt277 = i_14_;
                                        Node_Sub11.anInt6955 = i_13_;
                                        return true;
                                    }
                                    break while_80_;
                                }
                                if (Node_Sub33.method2569(1, i_11_, i_14_, i_10_, 1, i, i_4_, i_13_, true)) {
                                    Class15.anInt277 = i_14_;
                                    Node_Sub11.anInt6955 = i_13_;
                                    return true;
                                }
                                break while_80_;
                            } while (false);
                            if (class164.method1529(1, i, i_11_, i_10_, i_13_, -104, i_4_, i_12_, 1, i_14_)) {
                                Node_Sub11.anInt6955 = i_13_;
                                Class15.anInt277 = i_14_;
                                return true;
                            }
                            break while_80_;
                        } while (false);
                        if (class164.method1524(i_4_, i, 1, -1, i_10_, i_14_, i_11_, i_13_, i_12_)) {
                            Node_Sub11.anInt6955 = i_13_;
                            Class15.anInt277 = i_14_;
                            return true;
                        }
                        break while_80_;
                    } while (false);
                    if (class164.method1531(i_9_, (byte) -119, i_14_, i_5_, 1, i_4_, i_13_, i_10_)) {
                        Node_Sub11.anInt6955 = i_13_;
                        Class15.anInt277 = i_14_;
                        return true;
                    }
                    break while_80_;
                } while (false);
                if (class164.method1523(1, 1, i_9_, i_5_, i_13_, i_10_, i_4_, i_14_)) {
                    Class15.anInt277 = i_14_;
                    Node_Sub11.anInt6955 = i_13_;
                    return true;
                }
            } while (false);
            i_23_ = Node_Sub12.anIntArrayArray6958[i_15_][i_16_] + 1;
            if (i_15_ > 0 && (Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_15_][i_16_] == 0) && (0x42240000 & is[i_21_ + -1][i_22_]) == 0) {
                Class5.anIntArray146[i_19_] = -1 + i_13_;
                Class49.anIntArray655[i_19_] = i_14_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ - 1][i_16_] = 2;
                i_19_ = i_19_ - -1 & 0xfff;
                Node_Sub12.anIntArrayArray6958[-1 + i_15_][i_16_] = i_23_;
            }
            if (i_15_ < 127 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ - -1][i_16_] == 0) && (is[1 + i_21_][i_22_] & 0x60240000 ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_19_] = 1 + i_13_;
                Class49.anIntArray655[i_19_] = i_14_;
                Class301_Sub3_Sub1.anIntArrayArray9976[1 + i_15_][i_16_] = 8;
                i_19_ = 1 + i_19_ & 0xfff;
                Node_Sub12.anIntArrayArray6958[1 + i_15_][i_16_] = i_23_;
            }
            if ((i_16_ ^ 0xffffffff) < -1 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_15_][-1 + i_16_] == 0) && (is[i_21_][i_22_ - 1] & 0x40a40000 ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_19_] = i_13_;
                Class49.anIntArray655[i_19_] = -1 + i_14_;
                i_19_ = i_19_ - -1 & 0xfff;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_15_][i_16_ - 1] = 1;
                Node_Sub12.anIntArrayArray6958[i_15_][i_16_ - 1] = i_23_;
            }
            if ((i_16_ ^ 0xffffffff) > -128 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_15_][i_16_ - -1] == 0) && (0x48240000 & is[i_21_][1 + i_22_] ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_19_] = i_13_;
                Class49.anIntArray655[i_19_] = 1 + i_14_;
                i_19_ = 0xfff & 1 + i_19_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_15_][1 + i_16_] = 4;
                Node_Sub12.anIntArrayArray6958[i_15_][i_16_ - -1] = i_23_;
            }
            if ((i_15_ ^ 0xffffffff) < -1 && i_16_ > 0 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ + -1][-1 + i_16_]) == 0 && (0x43a40000 & is[i_21_ - 1][i_22_ + -1] ^ 0xffffffff) == -1 && (0x42240000 & is[-1 + i_21_][i_22_] ^ 0xffffffff) == -1 && (0x40a40000 & is[i_21_][-1 + i_22_] ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_19_] = -1 + i_13_;
                Class49.anIntArray655[i_19_] = i_14_ + -1;
                i_19_ = 0xfff & 1 + i_19_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ - 1][i_16_ + -1] = 3;
                Node_Sub12.anIntArrayArray6958[-1 + i_15_][i_16_ - 1] = i_23_;
            }
            if (i_15_ < 127 && (i_16_ ^ 0xffffffff) < -1 && ((Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ - -1][-1 + i_16_]) ^ 0xffffffff) == -1 && (is[1 + i_21_][i_22_ + -1] & 0x60e40000) == 0 && (0x60240000 & is[i_21_ + 1][i_22_] ^ 0xffffffff) == -1 && (0x40a40000 & is[i_21_][i_22_ + -1]) == 0) {
                Class5.anIntArray146[i_19_] = 1 + i_13_;
                Class49.anIntArray655[i_19_] = -1 + i_14_;
                i_19_ = 0xfff & 1 + i_19_;
                Class301_Sub3_Sub1.anIntArrayArray9976[1 + i_15_][i_16_ - 1] = 9;
                Node_Sub12.anIntArrayArray6958[1 + i_15_][i_16_ + -1] = i_23_;
            }
            if (i_15_ > 0 && i_16_ < 127 && (Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_15_][1 + i_16_]) == 0 && (0x4e240000 & is[-1 + i_21_][1 + i_22_]) == 0 && (is[-1 + i_21_][i_22_] & 0x42240000 ^ 0xffffffff) == -1 && (is[i_21_][i_22_ - -1] & 0x48240000) == 0) {
                Class5.anIntArray146[i_19_] = -1 + i_13_;
                Class49.anIntArray655[i_19_] = i_14_ + 1;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ - 1][i_16_ + 1] = 6;
                i_19_ = i_19_ + 1 & 0xfff;
                Node_Sub12.anIntArrayArray6958[-1 + i_15_][1 + i_16_] = i_23_;
            }
            if (i_15_ < 127 && i_16_ < 127 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ + 1][1 + i_16_]) == 0 && (is[1 + i_21_][i_22_ - -1] & 0x78240000 ^ 0xffffffff) == -1 && (is[1 + i_21_][i_22_] & 0x60240000 ^ 0xffffffff) == -1 && (is[i_21_][1 + i_22_] & 0x48240000) == 0) {
                Class5.anIntArray146[i_19_] = 1 + i_13_;
                Class49.anIntArray655[i_19_] = i_14_ - -1;
                i_19_ = 0xfff & 1 + i_19_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_15_ - -1][i_16_ - -1] = 12;
                Node_Sub12.anIntArrayArray6958[1 + i_15_][i_16_ + 1] = i_23_;
            }
        }
        Class15.anInt277 = i_14_;
        Node_Sub11.anInt6955 = i_13_;
        return false;
    }

    static final void method770(boolean bool, int i, boolean bool_24_, int i_25_, byte i_26_) {
        anInt1386++;
        if (i_26_ == 28) {
            Class205.method1694(i_25_, bool, i, 69, bool_24_, -1 + Class64.aClass147_Sub1Array869.length, 0);
            Class374.anInt4597 = 0;
            Node_Sub8_Sub12.aClass248_Sub43_9015 = null;
        }
    }
}
