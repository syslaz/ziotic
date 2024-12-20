/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class215 {
    int anInt2475;
    static int anInt2476 = 0;
    static boolean[] aBooleanArray2477;
    String aString2478;
    static int anInt2479;
    static int anInt2480;
    static Class381 aClass381_2481;
    static int anInt2482;

    static final String method1737(int i, int i_0_) {
        anInt2482++;
        if (i_0_ != -1)
            method1738(null, 50, -69, -20, -71, -37);
        Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method501((long) i, (byte) 31));
        if (class248_sub22 != null) {
            Node_Sub2_Sub3 class248_sub2_sub3 = ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method642((byte) 6);
            if (class248_sub2_sub3 != null) {
                double d = ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method654(false);
                if ((double) class248_sub2_sub3.method1997((byte) 111) <= d && (double) class248_sub2_sub3.method1995(0) >= d)
                    return class248_sub2_sub3.method1994((byte) -51);
            }
        }
        return null;
    }

    public final String toString() {
        anInt2479++;
        throw new IllegalStateException();
    }

    static final void method1738(Node_Sub51 class248_sub51, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt2480++;
        if ((((Node_Sub51) class248_sub51).anInt7462 ^ 0xffffffff) != 0 || ((Node_Sub51) class248_sub51).anIntArray7472 != null) {
            int i_5_ = 0;
            int i_6_ = ((((Node_Sub51) class248_sub51).anInt7480 * ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7325.method2993(true)) >> 1046415496);
            if ((i ^ 0xffffffff) < (((Node_Sub51) class248_sub51).anInt7475 ^ 0xffffffff))
                i_5_ += -((Node_Sub51) class248_sub51).anInt7475 + i;
            else if (((Node_Sub51) class248_sub51).anInt7466 > i)
                i_5_ += ((Node_Sub51) class248_sub51).anInt7466 - i;
            if (((Node_Sub51) class248_sub51).anInt7474 >= i_4_) {
                if (((Node_Sub51) class248_sub51).anInt7461 > i_4_)
                    i_5_ += ((Node_Sub51) class248_sub51).anInt7461 + -i_4_;
            } else
                i_5_ += i_4_ + -((Node_Sub51) class248_sub51).anInt7474;
            if (((((Node_Sub51) class248_sub51).anInt7464 ^ 0xffffffff) == -1) || ((i_5_ - 256 ^ 0xffffffff) < (((Node_Sub51) class248_sub51).anInt7464 ^ 0xffffffff)) || ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7325.method2993(true) == 0 || ((Node_Sub51) class248_sub51).anInt7479 != i_3_) {
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                    ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483 = null;
                    ((Node_Sub51) class248_sub51).aClass248_Sub34_7482 = null;
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                }
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 = null;
                    ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7455 = null;
                    ((Node_Sub51) class248_sub51).aClass248_Sub34_7477 = null;
                }
            } else {
                i_5_ -= 256;
                if ((i_5_ ^ 0xffffffff) > -1)
                    i_5_ = 0;
                int i_7_ = (-((Node_Sub51) class248_sub51).anInt7465 + ((Node_Sub51) class248_sub51).anInt7464);
                if (i_7_ < 0)
                    i_7_ = ((Node_Sub51) class248_sub51).anInt7464;
                int i_8_ = i_6_;
                int i_9_ = i_5_ + -((Node_Sub51) class248_sub51).anInt7465;
                if (i_9_ > 0 && (i_7_ ^ 0xffffffff) < -1)
                    i_8_ = i_6_ * (i_7_ + -i_9_) / i_7_;
                Class347.myPlayer.method3632(i_2_);
                int i_10_ = 8192;
                int i_11_ = (-i + (((Node_Sub51) class248_sub51).anInt7475 - -((Node_Sub51) class248_sub51).anInt7466) / 2);
                int i_12_ = ((((Node_Sub51) class248_sub51).anInt7461 + ((Node_Sub51) class248_sub51).anInt7474) / 2 + -i_4_);
                if (i_11_ != 0 || i_12_ != 0) {
                    int i_13_ = ((-Class301_Sub3_Sub1.cameraYaw + (-(int) (2607.5945876176133 * Math.atan2((double) i_11_, (double) i_12_)) + -4096)) & 0x3fff);
                    if (i_13_ > 8192)
                        i_13_ = -i_13_ + 16384;
                    int i_14_;
                    if ((i_5_ ^ 0xffffffff) < -1) {
                        if ((i_5_ ^ 0xffffffff) <= -4097)
                            i_14_ = 16384;
                        else
                            i_14_ = 8192 - -(i_5_ * 8192 / 4096);
                    } else
                        i_14_ = 8192;
                    i_10_ = i_14_ * i_13_ / 8192 - -(-i_14_ + 16384 >> 1813297633);
                }
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 == null) {
                    if ((((Node_Sub51) class248_sub51).anInt7462 ^ 0xffffffff) <= -1) {
                        int i_15_ = (((((Node_Sub51) class248_sub51).anInt7473 == 256) && (((Node_Sub51) class248_sub51).anInt7478 == 256)) ? 256 : (Class194.method1660(((Node_Sub51) class248_sub51).anInt7473, ((Node_Sub51) class248_sub51).anInt7478, true)));
                        if (!((Node_Sub51) class248_sub51).aBoolean7481) {
                            Class313 class313 = Class313.method3272((Node_Sub14_Sub3.aClass381_9183), (((Node_Sub51) class248_sub51).anInt7462), 0);
                            if (class313 != null) {
                                Node_Sub31_Sub1 class248_sub31_sub1 = (class313.method3273().method2564(Player.aClass317_10534));
                                Node_Sub15_Sub2 class248_sub15_sub2 = (Node_Sub15_Sub2.method2452(class248_sub31_sub1, i_15_, i_8_ << -239178810, i_10_));
                                class248_sub15_sub2.method2463(-1);
                                Class282_Sub15.aClass248_Sub15_Sub3_7751.method2485(class248_sub15_sub2);
                                ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = class248_sub15_sub2;
                            }
                        } else {
                            if ((((Node_Sub51) class248_sub51).aClass248_Sub34_7482) == null)
                                ((Node_Sub51) class248_sub51).aClass248_Sub34_7482 = (Node_Sub34.method2571(Node_Sub28.aClass381_7160, (((Node_Sub51) class248_sub51).anInt7462)));
                            if ((((Node_Sub51) class248_sub51).aClass248_Sub34_7482) != null) {
                                if ((((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483) == null)
                                    ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483 = ((Node_Sub51) class248_sub51).aClass248_Sub34_7482.method2576(new int[]{22050});
                                if ((((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483) != null) {
                                    Node_Sub15_Sub2 class248_sub15_sub2 = (Node_Sub15_Sub2.method2452((((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7483), i_15_, i_8_ << 531273222, i_10_));
                                    class248_sub15_sub2.method2463(-1);
                                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2485(class248_sub15_sub2);
                                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = class248_sub15_sub2;
                                }
                            }
                        }
                    }
                } else {
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460.method2446(i_8_);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460.method2445(i_10_);
                }
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 != null) {
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454.method2446(i_8_);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454.method2445(i_10_);
                    if (!((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454.hasNext((byte) 78)) {
                        ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 = null;
                        ((Node_Sub51) class248_sub51).aClass248_Sub34_7477 = null;
                        ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7455 = null;
                    }
                } else if ((((Node_Sub51) class248_sub51).anIntArray7472 != null) && ((((Node_Sub51) class248_sub51).anInt7469 -= i_1_) ^ 0xffffffff) >= -1) {
                    int i_16_ = ((((Node_Sub51) class248_sub51).anInt7473 != 256 || (((Node_Sub51) class248_sub51).anInt7478 ^ 0xffffffff) != -257) ? (((Node_Sub51) class248_sub51).anInt7478 + (int) (Math.random() * (double) (((Node_Sub51) class248_sub51).anInt7473 - (((Node_Sub51) class248_sub51).anInt7478)))) : 256);
                    if (((Node_Sub51) class248_sub51).aBoolean7453) {
                        if ((((Node_Sub51) class248_sub51).aClass248_Sub34_7477) == null) {
                            int i_17_ = (int) ((double) (((Node_Sub51) class248_sub51).anIntArray7472).length * Math.random());
                            ((Node_Sub51) class248_sub51).aClass248_Sub34_7477 = Node_Sub34.method2571((Node_Sub28.aClass381_7160), (((Node_Sub51) class248_sub51).anIntArray7472[i_17_]));
                        }
                        if ((((Node_Sub51) class248_sub51).aClass248_Sub34_7477) != null) {
                            if ((((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7455) == null)
                                ((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7455 = ((Node_Sub51) class248_sub51).aClass248_Sub34_7477.method2576(new int[]{22050});
                            if ((((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7455) != null) {
                                Node_Sub15_Sub2 class248_sub15_sub2 = (Node_Sub15_Sub2.method2452((((Node_Sub51) class248_sub51).aClass248_Sub31_Sub1_7455), i_16_, i_8_ << -410955770, i_10_));
                                class248_sub15_sub2.method2463(0);
                                Class282_Sub15.aClass248_Sub15_Sub3_7751.method2485(class248_sub15_sub2);
                                ((Node_Sub51) class248_sub51).anInt7469 = ((int) ((double) ((((Node_Sub51) class248_sub51).anInt7470) + -(((Node_Sub51) class248_sub51).anInt7476)) * Math.random()) + (((Node_Sub51) class248_sub51).anInt7476));
                                ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 = class248_sub15_sub2;
                            }
                        }
                    } else {
                        int i_18_ = (int) (Math.random() * (double) (((Node_Sub51) class248_sub51).anIntArray7472).length);
                        Class313 class313 = Class313.method3272((Node_Sub14_Sub3.aClass381_9183), (((Node_Sub51) class248_sub51).anIntArray7472[i_18_]), 0);
                        if (class313 != null) {
                            Node_Sub31_Sub1 class248_sub31_sub1 = (class313.method3273().method2564(Player.aClass317_10534));
                            Node_Sub15_Sub2 class248_sub15_sub2 = (Node_Sub15_Sub2.method2452(class248_sub31_sub1, i_16_, i_8_ << -538549082, i_10_));
                            class248_sub15_sub2.method2463(0);
                            Class282_Sub15.aClass248_Sub15_Sub3_7751.method2485(class248_sub15_sub2);
                            ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 = class248_sub15_sub2;
                            ((Node_Sub51) class248_sub51).anInt7469 = ((int) ((double) (-((Node_Sub51) class248_sub51).anInt7476 + (((Node_Sub51) class248_sub51).anInt7470)) * Math.random()) + (((Node_Sub51) class248_sub51).anInt7476));
                        }
                    }
                }
            }
        }
    }

    public static void method1739(int i) {
        aClass381_2481 = null;
        if (i != 0)
            aClass381_2481 = null;
        aBooleanArray2477 = null;
    }

    Class215(String string, int i) {
        ((Class215) this).anInt2475 = i;
        ((Class215) this).aString2478 = string;
    }
}
