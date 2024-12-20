/* Class248_Sub15_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub15_Sub5 extends Node_Sub15 {
    static int anInt9708;
    static int anInt9709;
    static int anInt9710;
    static int anInt9711;
    static int anInt9712;
    static int anInt9713;
    private Class293 aClass293_9714 = new Class293();
    static int anInt9715;
    static int anInt9716;
    static int anInt9717;
    static int anInt9718;
    static int anInt9719;
    static boolean aBoolean9720 = false;
    static int anInt9721;
    static int anInt9722;
    private int anInt9723;
    static int anInt9724;
    static int anInt9725;
    static int anInt9726;
    static int anInt9727;
    private boolean aBoolean9728;
    private int anInt9729 = 256;
    private boolean aBoolean9730;
    private int anInt9731 = 256;
    private int anInt9732;
    private int anInt9733 = 0;

    static final void method2495(boolean bool, int i, int i_0_) {
        Class11.method208(i_0_, Class41.aClass41_478.method301(Class191.anInt4822, (byte) -108), (byte) -9, bool);
        anInt9725++;
        int i_1_ = 19 % ((7 - i) / 49);
    }

    static final void method2496(int i) {
        if (i != 18128)
            anInt9719 = -127;
        anInt9711++;
        int i_2_ = 256 + 512 * Class301.anInt4931;
        int i_3_ = 256 + 512 * Class346_Sub5.anInt8283;
        int i_4_ = (Class353.method3753(i_3_, i_2_, -124, Class177.anInt2074) - Class375.anInt4606);
        if ((Class340_Sub2.anInt8112 ^ 0xffffffff) > -101) {
            if ((Class346_Sub7_Sub1.cameraPosX ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
                Class346_Sub7_Sub1.cameraPosX += (((i_2_ - Class346_Sub7_Sub1.cameraPosX) * Class340_Sub2.anInt8112 / 1000) + OutputStream_Sub2.anInt91);
                if ((Class346_Sub7_Sub1.cameraPosX ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
                    Class346_Sub7_Sub1.cameraPosX = i_2_;
            }
            if ((i_2_ ^ 0xffffffff) > (Class346_Sub7_Sub1.cameraPosX ^ 0xffffffff)) {
                Class346_Sub7_Sub1.cameraPosX -= (((Class346_Sub7_Sub1.cameraPosX + -i_2_) * Class340_Sub2.anInt8112 / 1000) + OutputStream_Sub2.anInt91);
                if ((i_2_ ^ 0xffffffff) < (Class346_Sub7_Sub1.cameraPosX ^ 0xffffffff))
                    Class346_Sub7_Sub1.cameraPosX = i_2_;
            }
            if (InputStream_Sub1.cameraPosY < i_4_) {
                InputStream_Sub1.cameraPosY += (((i_4_ + -InputStream_Sub1.cameraPosY) * Class340_Sub2.anInt8112 / 1000) + OutputStream_Sub2.anInt91);
                if ((i_4_ ^ 0xffffffff) > (InputStream_Sub1.cameraPosY ^ 0xffffffff))
                    InputStream_Sub1.cameraPosY = i_4_;
            }
            if ((InputStream_Sub1.cameraPosY ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
                InputStream_Sub1.cameraPosY -= ((Class340_Sub2.anInt8112 * (-i_4_ + InputStream_Sub1.cameraPosY) / 1000) + OutputStream_Sub2.anInt91);
                if (i_4_ > InputStream_Sub1.cameraPosY)
                    InputStream_Sub1.cameraPosY = i_4_;
            }
            if ((Class316_Sub1_Sub2.cameraPosZ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
                Class316_Sub1_Sub2.cameraPosZ += (OutputStream_Sub2.anInt91 - -(Class340_Sub2.anInt8112 * (-Class316_Sub1_Sub2.cameraPosZ + i_3_) / 1000));
                if (i_3_ < Class316_Sub1_Sub2.cameraPosZ)
                    Class316_Sub1_Sub2.cameraPosZ = i_3_;
            }
            if (Class316_Sub1_Sub2.cameraPosZ > i_3_) {
                Class316_Sub1_Sub2.cameraPosZ -= (((Class316_Sub1_Sub2.cameraPosZ + -i_3_) * Class340_Sub2.anInt8112 / 1000) + OutputStream_Sub2.anInt91);
                if ((Class316_Sub1_Sub2.cameraPosZ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
                    Class316_Sub1_Sub2.cameraPosZ = i_3_;
            }
        } else {
            Class346_Sub7_Sub1.cameraPosX = 256 + Class301.anInt4931 * 512;
            Class316_Sub1_Sub2.cameraPosZ = 256 + 512 * Class346_Sub5.anInt8283;
            InputStream_Sub1.cameraPosY = (Class353.method3753(Class316_Sub1_Sub2.cameraPosZ, Class346_Sub7_Sub1.cameraPosX, -105, Class177.anInt2074) + -Class375.anInt4606);
        }
        i_2_ = Class1.cameraXMovement * 512 - -256;
        i_3_ = 256 + 512 * Class281.cameraZMovement;
        i_4_ = (Class353.method3753(i_3_, i_2_, 126, Class177.anInt2074) + -Class84_Sub2.cameraMovementY);
        int i_5_ = -Class346_Sub7_Sub1.cameraPosX + i_2_;
        int i_6_ = i_4_ - InputStream_Sub1.cameraPosY;
        int i_7_ = i_3_ + -Class316_Sub1_Sub2.cameraPosZ;
        int i_8_ = (int) Math.sqrt((double) (i_7_ * i_7_ + i_5_ * i_5_));
        int i_9_ = 0x3fff & (int) (Math.atan2((double) i_6_, (double) i_8_) * 2607.5945876176133);
        if ((i_9_ ^ 0xffffffff) > -1025)
            i_9_ = 1024;
        int i_10_ = ((int) (-2607.5945876176133 * Math.atan2((double) i_5_, (double) i_7_)) & 0x3fff);
        if ((i_9_ ^ 0xffffffff) < -3073)
            i_9_ = 3072;
        if (Class127.cameraPitch < i_9_) {
            Class127.cameraPitch += ((Class84_Sub5.anInt5421 * (i_9_ - Class127.cameraPitch >> -176500509) / 1000) + Class282_Sub6.anInt7653) << 1558122659;
            if ((Class127.cameraPitch ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
                Class127.cameraPitch = i_9_;
        }
        if (i_9_ < Class127.cameraPitch) {
            Class127.cameraPitch -= Class282_Sub6.anInt7653 - -(Class84_Sub5.anInt5421 * (Class127.cameraPitch - i_9_ >> -1180981277) / 1000) << -716227805;
            if (i_9_ > Class127.cameraPitch)
                Class127.cameraPitch = i_9_;
        }
        int i_11_ = i_10_ + -Class301_Sub3_Sub1.cameraYaw;
        if ((i_11_ ^ 0xffffffff) < -8193)
            i_11_ -= 16384;
        if (i_11_ < -8192)
            i_11_ += 16384;
        i_11_ >>= 3;
        if (i_11_ > 0) {
            Class301_Sub3_Sub1.cameraYaw += (Class282_Sub6.anInt7653 + i_11_ * Class84_Sub5.anInt5421 / 1000) << -949816765;
            Class301_Sub3_Sub1.cameraYaw &= 0x3fff;
        }
        if ((i_11_ ^ 0xffffffff) > -1) {
            Class301_Sub3_Sub1.cameraYaw -= Class282_Sub6.anInt7653 - -(-i_11_ * Class84_Sub5.anInt5421 / 1000) << 843955139;
            Class301_Sub3_Sub1.cameraYaw &= 0x3fff;
        }
        int i_12_ = -Class301_Sub3_Sub1.cameraYaw + i_10_;
        if (i_12_ > 8192)
            i_12_ -= 16384;
        if ((i_12_ ^ 0xffffffff) > 8191)
            i_12_ += 16384;
        Class346_Sub5_Sub1.anInt9886 = 0;
        if (i_12_ < 0 && i_11_ > 0 || (i_12_ ^ 0xffffffff) < -1 && (i_11_ ^ 0xffffffff) > -1)
            Class301_Sub3_Sub1.cameraYaw = i_10_;
    }

    final int method2405() {
        anInt9710++;
        return 1;
    }

    final synchronized int method2497(int i) {
        if (i != -101)
            method2495(false, 111, 51);
        anInt9715++;
        return anInt9733;
    }

    final synchronized void method2498(byte i, boolean bool) {
        aBoolean9728 = bool;
        int i_13_ = 3 / ((50 - i) / 57);
        anInt9713++;
    }

    final synchronized double method2499(boolean bool) {
        anInt9712++;
        if (bool != false)
            anInt9731 = -120;
        if (anInt9733 < 1)
            return -1.0;
        Node_Sub8_Sub15 class248_sub8_sub15 = (Node_Sub8_Sub15) aClass293_9714.method3119(2);
        if (class248_sub8_sub15 == null)
            return -1.0;
        return ((double) -((float) (((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047[0]).length / (float) Class54.anInt728) + ((Node_Sub8_Sub15) class248_sub8_sub15).aDouble9046);
    }

    final void method2500(boolean bool, int i) {
        if (bool == false) {
            anInt9731 = i;
            anInt9726++;
            anInt9729 = i;
        }
    }

    private final synchronized void method2501(int i) {
        anInt9718++;
        Node_Sub8_Sub15 class248_sub8_sub15 = method2503(1000);
        if (i != -24222)
            anInt9719 = -44;
        if (class248_sub8_sub15 != null) {
            class248_sub8_sub15.remove(true);
            anInt9733--;
            anInt9732 = 0;
            aa_Sub1.aClass365_5249.method3825(class248_sub8_sub15.method2132((byte) 118), (byte) 106, class248_sub8_sub15);
        }
    }

    static final void method2502(int i, int i_14_, int i_15_) {
        boolean bool = (Class311.aClass137ArrayArrayArray3620[0][i_14_][i_15_] != null && ((Class137) (Class311.aClass137ArrayArrayArray3620[0][i_14_][i_15_])).aClass137_1651 != null);
        for (int i_16_ = i; i_16_ >= 0; i_16_--) {
            if (Class311.aClass137ArrayArrayArray3620[i_16_][i_14_][i_15_] == null) {
                Class137 class137 = (Class311.aClass137ArrayArrayArray3620[i_16_][i_14_][i_15_] = new Class137(i_16_));
                if (bool)
                    ((Class137) class137).aByte1637++;
            }
        }
    }

    private final synchronized Node_Sub8_Sub15 method2503(int i) {
        anInt9724++;
        if (i != 1000)
            return null;
        return (Node_Sub8_Sub15) aClass293_9714.method3119(2);
    }

    final Node_Sub15 method2401() {
        anInt9708++;
        return null;
    }

    final synchronized void method2504(byte i, Node_Sub8_Sub15 class248_sub8_sub15) {
        anInt9717++;
        int i_17_ = -35 / ((-47 - i) / 63);
        for (/**/; (anInt9733 ^ 0xffffffff) <= -101; anInt9733--)
            aClass293_9714.method3108(false);
        aClass293_9714.method3109(class248_sub8_sub15, -99);
        anInt9733++;
    }

    final synchronized void method2400(int[] is, int i, int i_18_) {
        anInt9722++;
        if (!aBoolean9728) {
            if (method2503(1000) == null) {
                if (aBoolean9730) {
                    this.remove(true);
                    aa_Sub1.aClass365_5249.method3827(true);
                }
            } else {
                int i_19_ = i - -i_18_;
                if (Class225_Sub3.aBoolean8472)
                    i_19_ <<= 1;
                int i_20_ = 0;
                int i_21_ = 0;
                if (anInt9723 == 2)
                    i_21_ = 1;
                while (i_19_ > i) {
                    Node_Sub8_Sub15 class248_sub8_sub15 = method2503(1000);
                    if (class248_sub8_sub15 == null)
                        break;
                    short[][] is_22_;
                    for (is_22_ = (((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047); i_19_ > i && is_22_[0].length > anInt9732; anInt9732++) {
                        if (Class225_Sub3.aBoolean8472) {
                            is[i++] = is_22_[i_20_][anInt9732] * anInt9729;
                            is[i++] = anInt9731 * is_22_[i_21_][anInt9732];
                        } else
                            is[i++] += (is_22_[i_20_][anInt9732] * anInt9729 + is_22_[i_21_][anInt9732] * anInt9731);
                    }
                    if ((anInt9732 ^ 0xffffffff) <= (is_22_[0].length ^ 0xffffffff))
                        method2501(-24222);
                }
            }
        }
    }

    final Node_Sub15 method2399() {
        anInt9716++;
        return null;
    }

    final Node_Sub8_Sub15 method2505(int i, double d, byte i_23_) {
        anInt9727++;
        if (i_23_ <= 110)
            aBoolean9728 = false;
        long l = (long) (anInt9723 << -2091075296 | i);
        Node_Sub8_Sub15 class248_sub8_sub15 = (Node_Sub8_Sub15) aa_Sub1.aClass365_5249.method3826(l, -1);
        if (class248_sub8_sub15 == null)
            class248_sub8_sub15 = new Node_Sub8_Sub15(new short[anInt9723][i], d);
        else {
            ((Node_Sub8_Sub15) class248_sub8_sub15).aDouble9046 = d;
            aa_Sub1.aClass365_5249.method3828(l, false);
        }
        return class248_sub8_sub15;
    }

    final synchronized void method2506(byte i) {
        aBoolean9730 = true;
        anInt9721++;
        int i_24_ = -74 / ((i - 60) / 58);
    }

    final synchronized void method2404(int i) {
        anInt9709++;
        if (!aBoolean9728) {
            for (; ; ) {
                Node_Sub8_Sub15 class248_sub8_sub15 = method2503(1000);
                if (class248_sub8_sub15 == null) {
                    if (aBoolean9730) {
                        this.remove(true);
                        aa_Sub1.aClass365_5249.method3827(true);
                    }
                    break;
                }
                if ((i ^ 0xffffffff) > ((((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047[0]).length + -anInt9732 ^ 0xffffffff)) {
                    anInt9732 += i;
                    break;
                }
                i -= -anInt9732 + (((Node_Sub8_Sub15) class248_sub8_sub15).aShortArrayArray9047[0]).length;
                method2501(-24222);
            }
        }
    }

    Node_Sub15_Sub5(int i) {
        anInt9723 = i;
    }
}
