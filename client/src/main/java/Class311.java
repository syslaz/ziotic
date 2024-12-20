/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class311 {
    String aString3610;
    static int anInt3611;
    static int anInt3612 = 999999;
    String aString3613;
    static OutgoingOpcode aOutgoingOpcode_3614 = new OutgoingOpcode(69, 5);
    static int anInt3615;
    static int anInt3616;
    static int anInt3617;
    static int anInt3618;
    String aString3619;
    static Class137[][][] aClass137ArrayArrayArray3620;
    static int[] anIntArray3621 = new int[32];

    static final void method3264(boolean bool) {
        anInt3618++;
        if (Node.anIntArray2801 == null)
            Node.anIntArray2801 = new int[65536];
        else
            return;
        double d = -0.015 + Math.random() * 0.03 + 0.7;
        int i = 0;
        if (bool != true)
            aClass137ArrayArrayArray3620 = null;
        for (int i_0_ = 0; i_0_ < 512; i_0_++) {
            float f = (((float) (i_0_ >> -2073740765) / 64.0F + 0.0078125F) * 360.0F);
            float f_1_ = (float) (i_0_ & 0x7) / 8.0F + 0.0625F;
            for (int i_2_ = 0; i_2_ < 128; i_2_++) {
                float f_3_ = (float) i_2_ / 128.0F;
                float f_4_ = 0.0F;
                float f_5_ = 0.0F;
                float f_6_ = 0.0F;
                float f_7_ = f / 60.0F;
                int i_8_ = (int) f_7_;
                int i_9_ = i_8_ % 6;
                float f_10_ = f_7_ - (float) i_8_;
                float f_11_ = (1.0F - f_1_) * f_3_;
                float f_12_ = (1.0F - f_10_ * f_1_) * f_3_;
                float f_13_ = f_3_ * (1.0F - f_1_ * (-f_10_ + 1.0F));
                if ((i_9_ ^ 0xffffffff) == -1) {
                    f_6_ = f_11_;
                    f_4_ = f_3_;
                    f_5_ = f_13_;
                } else if (i_9_ == 1) {
                    f_4_ = f_12_;
                    f_6_ = f_11_;
                    f_5_ = f_3_;
                } else if (i_9_ == 2) {
                    f_6_ = f_13_;
                    f_4_ = f_11_;
                    f_5_ = f_3_;
                } else if ((i_9_ ^ 0xffffffff) != -4) {
                    if ((i_9_ ^ 0xffffffff) == -5) {
                        f_4_ = f_13_;
                        f_6_ = f_3_;
                        f_5_ = f_11_;
                    } else if ((i_9_ ^ 0xffffffff) == -6) {
                        f_4_ = f_3_;
                        f_6_ = f_12_;
                        f_5_ = f_11_;
                    }
                } else {
                    f_6_ = f_3_;
                    f_5_ = f_12_;
                    f_4_ = f_11_;
                }
                f_4_ = (float) Math.pow((double) f_4_, d);
                f_5_ = (float) Math.pow((double) f_5_, d);
                f_6_ = (float) Math.pow((double) f_6_, d);
                int i_14_ = (int) (256.0F * f_4_);
                int i_15_ = (int) (f_5_ * 256.0F);
                int i_16_ = (int) (f_6_ * 256.0F);
                int i_17_ = -16777216 + ((i_14_ << 25891408) + (i_15_ << 1475886568) - -i_16_);
                Node.anIntArray2801[i++] = i_17_;
            }
        }
    }

    static final void method3265(byte i) {
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353), (byte) -71, 1);
        anInt3611++;
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327), (byte) -71, 2);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, 2);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324), (byte) -71, 1);
        if (i == -95) {
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314), (byte) -71, 1);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363), (byte) -71, 1);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313), (byte) -71, 1);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342), (byte) -71, 2);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347), (byte) -71, 1);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360), (byte) -71, 2);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329), (byte) -71, 1);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340), (byte) -71, 0);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357), (byte) -71, 0);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356), (byte) -71, 2);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336), (byte) -71, 0);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321), (byte) -71, 0);
            Class212.method1732(8583);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319), (byte) -71, 0);
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348), (byte) -71, 4);
            Node_Sub20.method2521((byte) 120);
            Class332.method3400(i + 96);
            Class5.aBoolean149 = true;
        }
    }

    public static void method3266(int i) {
        aClass137ArrayArrayArray3620 = null;
        anIntArray3621 = null;
        if (i != -32636)
            method3267(-120, 8, 125, 48, -21, null, -93, 2, 102, -126, -77, 100);
        aOutgoingOpcode_3614 = null;
    }

    static final boolean method3267(int i, int i_18_, int i_19_, int i_20_, int i_21_, Class164 class164, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        anInt3615++;
        int i_28_ = i_26_;
        int i_29_ = i_21_;
        int i_30_ = 64;
        int i_31_ = 64;
        int i_32_ = -i_30_ + i_26_;
        int i_33_ = -i_31_ + i_21_;
        Class301_Sub3_Sub1.anIntArrayArray9976[i_30_][i_31_] = 99;
        Node_Sub12.anIntArrayArray6958[i_30_][i_31_] = 0;
        int i_34_ = 0;
        int i_35_ = 0;
        Class5.anIntArray146[i_34_] = i_28_;
        Class49.anIntArray655[i_34_++] = i_29_;
        if (i_25_ != -19272)
            anIntArray3621 = null;
        int[][] is = ((Class164) class164).anIntArrayArray1943;
        while_206_:
        while ((i_34_ ^ 0xffffffff) != (i_35_ ^ 0xffffffff)) {
            i_28_ = Class5.anIntArray146[i_35_];
            i_29_ = Class49.anIntArray655[i_35_];
            i_30_ = i_28_ + -i_32_;
            i_35_ = 0xfff & i_35_ + 1;
            i_31_ = -i_33_ + i_29_;
            int i_36_ = i_28_ + -((Class164) class164).anInt1928;
            int i_37_ = i_29_ - ((Class164) class164).anInt1944;
            int i_38_ = i_19_;
            while_198_:
            do {
                while_197_:
                do {
                    while_196_:
                    do {
                        while_195_:
                        do {
                            do {
                                if (i_38_ != -4) {
                                    if (i_38_ != -3) {
                                        if ((i_38_ ^ 0xffffffff) != 1) {
                                            if ((i_38_ ^ 0xffffffff) != 0) {
                                                if (i_38_ == 0 || i_38_ == 1 || i_38_ == 2 || ((i_38_ ^ 0xffffffff) == -4) || ((i_38_ ^ 0xffffffff) == -10))
                                                    break while_196_;
                                                break while_197_;
                                            }
                                        } else
                                            break;
                                        break while_195_;
                                    }
                                } else {
                                    if (i_27_ == i_28_ && ((i_29_ ^ 0xffffffff) == (i_20_ ^ 0xffffffff))) {
                                        Node_Sub11.anInt6955 = i_28_;
                                        Class15.anInt277 = i_29_;
                                        return true;
                                    }
                                    break while_198_;
                                }
                                if (Node_Sub33.method2569(i, i_24_, i_29_, i_20_, i, i_18_, i_27_, i_28_, true)) {
                                    Node_Sub11.anInt6955 = i_28_;
                                    Class15.anInt277 = i_29_;
                                    return true;
                                }
                                break while_198_;
                            } while (false);
                            if (class164.method1529(i, i_18_, i_24_, i_20_, i_28_, -101, i_27_, i_23_, i, i_29_)) {
                                Class15.anInt277 = i_29_;
                                Node_Sub11.anInt6955 = i_28_;
                                return true;
                            }
                            break while_198_;
                        } while (false);
                        if (class164.method1524(i_27_, i_18_, i, i_25_ ^ 0x4b47, i_20_, i_29_, i_24_, i_28_, i_23_)) {
                            Node_Sub11.anInt6955 = i_28_;
                            Class15.anInt277 = i_29_;
                            return true;
                        }
                        break while_198_;
                    } while (false);
                    if (class164.method1531(i_22_, (byte) -119, i_29_, i_19_, i, i_27_, i_28_, i_20_)) {
                        Class15.anInt277 = i_29_;
                        Node_Sub11.anInt6955 = i_28_;
                        return true;
                    }
                    break while_198_;
                } while (false);
                if (class164.method1523(i_25_ ^ ~0x4b46, i, i_22_, i_19_, i_28_, i_20_, i_27_, i_29_)) {
                    Node_Sub11.anInt6955 = i_28_;
                    Class15.anInt277 = i_29_;
                    return true;
                }
            } while (false);
            i_38_ = Node_Sub12.anIntArrayArray6958[i_30_][i_31_] + 1;
            while_199_:
            do {
                if ((i_30_ ^ 0xffffffff) < -1 && ((Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ - 1][i_31_]) ^ 0xffffffff) == -1 && (is[-1 + i_36_][i_37_] & 0x43a40000) == 0 && (0x4e240000 & is[i_36_ + -1][-1 + i + i_37_] ^ 0xffffffff) == -1) {
                    for (int i_39_ = 1; (i + -1 ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
                        if ((0x4fa40000 & is[-1 + i_36_][i_39_ + i_37_] ^ 0xffffffff) != -1)
                            break while_199_;
                    }
                    Class5.anIntArray146[i_34_] = i_28_ - 1;
                    Class49.anIntArray655[i_34_] = i_29_;
                    Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ - 1][i_31_] = 2;
                    i_34_ = 0xfff & 1 + i_34_;
                    Node_Sub12.anIntArrayArray6958[-1 + i_30_][i_31_] = i_38_;
                }
            } while (false);
            while_200_:
            do {
                if ((-i + 128 ^ 0xffffffff) < (i_30_ ^ 0xffffffff) && (Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ - -1][i_31_]) == 0 && (0x60e40000 & is[i_36_ - -i][i_37_]) == 0 && (is[i_36_ + i][-1 + (i_37_ - -i)] & 0x78240000) == 0) {
                    for (int i_40_ = 1; (i - 1 ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
                        if ((0x78e40000 & is[i_36_ - -i][i_40_ + i_37_] ^ 0xffffffff) != -1)
                            break while_200_;
                    }
                    Class5.anIntArray146[i_34_] = i_28_ + 1;
                    Class49.anIntArray655[i_34_] = i_29_;
                    Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ - -1][i_31_] = 8;
                    i_34_ = 0xfff & 1 + i_34_;
                    Node_Sub12.anIntArrayArray6958[1 + i_30_][i_31_] = i_38_;
                }
            } while (false);
            while_201_:
            do {
                if (i_31_ > 0 && ((Class301_Sub3_Sub1.anIntArrayArray9976[i_30_][i_31_ - 1]) ^ 0xffffffff) == -1 && (is[i_36_][-1 + i_37_] & 0x43a40000) == 0 && (is[i_36_ - -i - 1][-1 + i_37_] & 0x60e40000 ^ 0xffffffff) == -1) {
                    for (int i_41_ = 1; (i_41_ ^ 0xffffffff) > (i - 1 ^ 0xffffffff); i_41_++) {
                        if ((0x63e40000 & is[i_36_ - -i_41_][i_37_ - 1] ^ 0xffffffff) != -1)
                            break while_201_;
                    }
                    Class5.anIntArray146[i_34_] = i_28_;
                    Class49.anIntArray655[i_34_] = i_29_ - 1;
                    i_34_ = 0xfff & 1 + i_34_;
                    Class301_Sub3_Sub1.anIntArrayArray9976[i_30_][-1 + i_31_] = 1;
                    Node_Sub12.anIntArrayArray6958[i_30_][i_31_ + -1] = i_38_;
                }
            } while (false);
            while_202_:
            do {
                if ((i_31_ ^ 0xffffffff) > (128 - i ^ 0xffffffff) && ((Class301_Sub3_Sub1.anIntArrayArray9976[i_30_][i_31_ - -1]) ^ 0xffffffff) == -1 && (0x4e240000 & is[i_36_][i_37_ + i]) == 0 && (is[i + i_36_ + -1][i_37_ - -i] & 0x78240000) == 0) {
                    for (int i_42_ = 1; (i_42_ ^ 0xffffffff) > (i + -1 ^ 0xffffffff); i_42_++) {
                        if ((is[i_36_ - -i_42_][i_37_ + i] & 0x7e240000 ^ 0xffffffff) != -1)
                            break while_202_;
                    }
                    Class5.anIntArray146[i_34_] = i_28_;
                    Class49.anIntArray655[i_34_] = i_29_ + 1;
                    Class301_Sub3_Sub1.anIntArrayArray9976[i_30_][1 + i_31_] = 4;
                    i_34_ = 0xfff & 1 + i_34_;
                    Node_Sub12.anIntArrayArray6958[i_30_][1 + i_31_] = i_38_;
                }
            } while (false);
            while_203_:
            do {
                if (i_30_ > 0 && (i_31_ ^ 0xffffffff) < -1 && (Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_30_][-1 + i_31_]) == 0 && ((is[-1 + i_36_][-1 + i_37_] & 0x43a40000 ^ 0xffffffff) == -1)) {
                    for (int i_43_ = 1; i > i_43_; i_43_++) {
                        if ((is[i_36_ - 1][-1 + (i_37_ - -i_43_)] & 0x4fa40000 ^ 0xffffffff) != -1 || (0x63e40000 & is[i_36_ + (-1 - -i_43_)][i_37_ - 1]) != 0)
                            break while_203_;
                    }
                    Class5.anIntArray146[i_34_] = -1 + i_28_;
                    Class49.anIntArray655[i_34_] = i_29_ - 1;
                    i_34_ = i_34_ + 1 & 0xfff;
                    Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_30_][(i_31_ + -1)] = 3;
                    Node_Sub12.anIntArrayArray6958[-1 + i_30_][i_31_ - 1] = i_38_;
                }
            } while (false);
            while_204_:
            do {
                if ((-i + 128 ^ 0xffffffff) < (i_30_ ^ 0xffffffff) && i_31_ > 0 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ + 1][-1 + i_31_]) == 0 && (0x60e40000 & is[i + i_36_][-1 + i_37_]) == 0) {
                    for (int i_44_ = 1; i > i_44_; i_44_++) {
                        if ((0x78e40000 & is[i + i_36_][i_44_ + (-1 + i_37_)] ^ 0xffffffff) != -1 || ((is[i_44_ + i_36_][i_37_ - 1] & 0x63e40000) != 0))
                            break while_204_;
                    }
                    Class5.anIntArray146[i_34_] = 1 + i_28_;
                    Class49.anIntArray655[i_34_] = -1 + i_29_;
                    Class301_Sub3_Sub1.anIntArrayArray9976[1 + i_30_][(i_31_ + -1)] = 9;
                    i_34_ = 0xfff & 1 + i_34_;
                    Node_Sub12.anIntArrayArray6958[1 + i_30_][i_31_ + -1] = i_38_;
                }
            } while (false);
            while_205_:
            do {
                if (i_30_ > 0 && -i + 128 > i_31_ && (Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_30_][1 + i_31_]) == 0 && ((is[i_36_ + -1][i + i_37_] & 0x4e240000 ^ 0xffffffff) == -1)) {
                    for (int i_45_ = 1; i_45_ < i; i_45_++) {
                        if ((0x4fa40000 & is[-1 + i_36_][i_37_ + i_45_]) != 0 || (is[-1 + (i_36_ - -i_45_)][i_37_ - -i] & 0x7e240000) != 0)
                            break while_205_;
                    }
                    Class5.anIntArray146[i_34_] = -1 + i_28_;
                    Class49.anIntArray655[i_34_] = 1 + i_29_;
                    Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_30_][1 + i_31_] = 6;
                    i_34_ = 0xfff & 1 + i_34_;
                    Node_Sub12.anIntArrayArray6958[-1 + i_30_][1 + i_31_] = i_38_;
                }
            } while (false);
            if ((i_30_ ^ 0xffffffff) > (128 - i ^ 0xffffffff) && (i_31_ ^ 0xffffffff) > (128 - i ^ 0xffffffff) && (Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ - -1][i_31_ - -1]) == 0 && ((0x78240000 & is[i + i_36_][i_37_ + i] ^ 0xffffffff) == -1)) {
                for (int i_46_ = 1; (i_46_ ^ 0xffffffff) > (i ^ 0xffffffff); i_46_++) {
                    if ((0x7e240000 & is[i_36_ + i_46_][i + i_37_]) != 0 || (is[i + i_36_][i_46_ + i_37_] & 0x78e40000 ^ 0xffffffff) != -1)
                        continue while_206_;
                }
                Class5.anIntArray146[i_34_] = 1 + i_28_;
                Class49.anIntArray655[i_34_] = i_29_ + 1;
                i_34_ = 1 + i_34_ & 0xfff;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_30_ + 1][i_31_ - -1] = 12;
                Node_Sub12.anIntArrayArray6958[i_30_ + 1][i_31_ + 1] = i_38_;
            }
        }
        Class15.anInt277 = i_29_;
        Node_Sub11.anInt6955 = i_28_;
        return false;
    }

    static final void method3268(int i, byte i_47_, int i_48_) {
        anInt3616++;
        if (i_47_ > -71)
            aOutgoingOpcode_3614 = null;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_48_, -874792672, 1);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i;
    }

    Class311(String string, String string_49_, String string_50_) {
        ((Class311) this).aString3619 = string_49_;
        ((Class311) this).aString3613 = string_50_;
        ((Class311) this).aString3610 = string;
    }

    static final Class136_Sub4_Sub1 method3269(ha_Sub2 var_ha_Sub2, int i, int i_51_, byte i_52_, int i_53_, int i_54_) {
        if (i_52_ != -54)
            method3269(null, 109, -122, (byte) -89, 73, 120);
        anInt3617++;
        if (!((ha_Sub2) var_ha_Sub2).aBoolean5913 && (!Class343.method3508(i_51_, -31218) || !Class343.method3508(i_53_, -31218))) {
            if (((ha_Sub2) var_ha_Sub2).aBoolean5837)
                return new Class136_Sub4_Sub1(var_ha_Sub2, 34037, i, i_54_, i_51_, i_53_, true);
            return new Class136_Sub4_Sub1(var_ha_Sub2, i, i_54_, i_51_, i_53_, Class136_Sub4.method1269(i_51_, (byte) -128), Class136_Sub4.method1269(i_53_, (byte) -128), true);
        }
        return new Class136_Sub4_Sub1(var_ha_Sub2, 3553, i, i_54_, i_51_, i_53_, true);
    }
}
