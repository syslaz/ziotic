/* Class340_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class340_Sub6 extends Class340 {
    static int anInt8144;
    private boolean aBoolean8145 = false;
    static boolean aBoolean8146 = true;
    private Interface21_Impl3[] anInterface21_Impl3Array8147;
    private boolean aBoolean8148;
    static int anInt8149;
    static int anInt8150;
    static int anInt8151;
    static int anInt8152;
    static int anInt8153;
    static int anInt8154;
    static Class296 aClass296_8155 = r_Sub2.method2114(16966);
    static int anInt8156;
    static int anInt8157;
    static Class381 aClass381_8158;
    static int anInt8159;

    static final void method3459(int i) {
        anInt8151++;
        if (Class127.aClass2Array1566 != null) {
            for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (Node_Sub41.anInt7287 ^ 0xffffffff); i_0_++)
                Class127.aClass2Array1566[i_0_] = null;
            Class127.aClass2Array1566 = null;
        }
        if (Class183.aClass2Array2137 != null) {
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (Class164.anInt1937 ^ 0xffffffff); i_1_++)
                Class183.aClass2Array2137[i_1_] = null;
            Class183.aClass2Array2137 = null;
        }
        if (Class135.aClass2Array1634 != null) {
            for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (Player.anInt10584 ^ 0xffffffff)); i_2_++)
                Class135.aClass2Array1634[i_2_] = null;
            Class135.aClass2Array1634 = null;
        }
        Node_Sub14_Sub14.aClass2Array9305 = null;
        Class103.anIntArray1317 = null;
        if (i != 16711680)
            aClass296_8155 = null;
        Node_Sub14_Sub27.anIntArrayArrayArray9451 = null;
        Class312.anInt3644 = Class64.anInt868 = -1;
    }

    static final boolean method3460(r var_r, int i, int i_3_, int i_4_, boolean[] bools) {
        boolean bool = false;
        if (Class177.aSArray2070 != Node_Sub14_Sub12_Sub1.aSArray10306) {
            int i_5_ = Node_Sub14_Sub29.aSArray9471[i].method3150((byte) 115, i_3_, i_4_);
            int i_6_ = 0;
            for (/**/; i_6_ <= i; i_6_++) {
                s var_s = Node_Sub14_Sub29.aSArray9471[i_6_];
                if (var_s != null) {
                    int i_7_ = i_5_ - var_s.method3150((byte) 118, i_3_, i_4_);
                    if (bools != null) {
                        bools[i_6_] = var_s.method3143(var_r, i_3_, i_7_, i_4_, 0, false);
                        if (!bools[i_6_])
                            continue;
                    }
                    var_s.CA(var_r, i_3_, i_7_, i_4_, 0, false);
                    bool = true;
                }
            }
        }
        return bool;
    }

    static final short[][] method3461(byte i, float[][] fs, short[][] is) {
        if (i != -110)
            aBoolean8146 = true;
        for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (fs.length ^ 0xffffffff); i_8_++) {
            for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (is[i_8_].length ^ 0xffffffff); i_9_++)
                is[i_8_][i_9_] = (short) (int) (16383.0F * fs[i_8_][i_9_]);
        }
        anInt8154++;
        return is;
    }

    final void method3433(int i, int i_10_, int i_11_) {
        if (aBoolean8145) {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(anInterface21_Impl3Array8147[-1 + i_10_], -8423);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        }
        anInt8153++;
        if (i != -26427)
            method3464(-63);
    }

    final boolean method3432(int i) {
        if (i != 4095)
            method3442(null, -111, (byte) 35);
        anInt8157++;
        return true;
    }

    final void method3443(boolean bool, boolean bool_12_) {
        anInt8152++;
        if (anInterface21_Impl3Array8147 != null && bool_12_) {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method999(124, Class251.aClass181_2829);
            Class238_Sub2 class238_sub2 = ((Class340) this).aHa_Sub3_3954.method1022(0);
            class238_sub2.method1861(1024);
            ((Class340) this).aHa_Sub3_3954.method984(3, Node_Sub14_Sub31.aClass34_9493);
            if (aBoolean8148) {
                ((Class340) this).aHa_Sub3_3954.method955((byte) 112, (Class142.aClass5_1669), (Class346_Sub4.aClass5_8272));
                ((Class340) this).aHa_Sub3_3954.method1017(-8980, 0, (Class147.aClass280_1738), false, true);
                ((Class340) this).aHa_Sub3_3954.method951(Class282_Sub2.aClass280_7605, (byte) 92, 0);
            } else {
                ((Class340) this).aHa_Sub3_3954.method955((byte) 103, Class60.aClass5_821, (Class142.aClass5_1669));
                ((Class340) this).aHa_Sub3_3954.method946(0, -127, Class346_Sub7_Sub3_Sub1.aClass280_10511);
                ((Class340) this).aHa_Sub3_3954.method1040(2, (byte) -65);
                ((Class340) this).aHa_Sub3_3954.method955((byte) 69, (Class142.aClass5_1669), (Class346_Sub4.aClass5_8272));
                ((Class340) this).aHa_Sub3_3954.method946(0, 85, Class346_Sub7_Sub3_Sub1.aClass280_10511);
                ((Class340) this).aHa_Sub3_3954.method1017(-8980, 1, Class346_Sub7_Sub3_Sub1.aClass280_10511, false, true);
                ((Class340) this).aHa_Sub3_3954.method951(Class282_Sub2.aClass280_7605, (byte) 123, 0);
                ((Class340) this).aHa_Sub3_3954.method929((((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInterface21_6237), -8423);
            }
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            aBoolean8145 = true;
        } else
            ((Class340) this).aHa_Sub3_3954.method951(Class282_Sub2.aClass280_7605, (byte) 108, 0);
        if (bool != true)
            method3443(true, false);
    }

    Class340_Sub6(ha_Sub3 var_ha_Sub3) {
        super(var_ha_Sub3);
        if (((ha_Sub3) var_ha_Sub3).aBoolean6239) {
            aBoolean8148 = (((ha_Sub3) var_ha_Sub3).anInt6236 ^ 0xffffffff) > -4;
            int i = aBoolean8148 ? 48 : 127;
            int[][] is = new int[6][4096];
            int[][] is_13_ = new int[6][4096];
            int[][] is_14_ = new int[6][4096];
            int i_15_ = 0;
            for (int i_16_ = 0; i_16_ < 64; i_16_++) {
                for (int i_17_ = 0; i_17_ < 64; i_17_++) {
                    float f = -1.0F + 2.0F * (float) i_17_ / 64.0F;
                    float f_18_ = 2.0F * (float) i_16_ / 64.0F - 1.0F;
                    float f_19_ = (float) (1.0 / Math.sqrt((double) (f_18_ * f_18_ + (1.0F + f * f))));
                    f_18_ *= f_19_;
                    f *= f_19_;
                    for (int i_20_ = 0; i_20_ < 6; i_20_++) {
                        float f_21_;
                        if ((i_20_ ^ 0xffffffff) == -1)
                            f_21_ = -f;
                        else if (i_20_ == 1)
                            f_21_ = f;
                        else if ((i_20_ ^ 0xffffffff) == -3)
                            f_21_ = f_18_;
                        else if ((i_20_ ^ 0xffffffff) != -4) {
                            if (i_20_ != 4)
                                f_21_ = -f_19_;
                            else
                                f_21_ = f_19_;
                        } else
                            f_21_ = -f_18_;
                        int i_22_;
                        int i_23_;
                        int i_24_;
                        if (f_21_ > 0.0F) {
                            i_22_ = (int) (Math.pow((double) f_21_, 96.0) * (double) i);
                            i_23_ = (int) (Math.pow((double) f_21_, 36.0) * (double) i);
                            i_24_ = (int) ((double) i * Math.pow((double) f_21_, 12.0));
                        } else
                            i_22_ = i_23_ = i_24_ = 0;
                        is_13_[i_20_][i_15_] = i_22_ << 1361906360;
                        is_14_[i_20_][i_15_] = i_23_ << -433814984;
                        is[i_20_][i_15_] = i_24_ << 1727919960;
                    }
                    i_15_++;
                }
            }
            anInterface21_Impl3Array8147 = new Interface21_Impl3[3];
            anInterface21_Impl3Array8147[0] = ((Class340) this).aHa_Sub3_3954.method938((byte) -127, false, is_13_, 64);
            anInterface21_Impl3Array8147[1] = ((Class340) this).aHa_Sub3_3954.method938((byte) -100, false, is_14_, 64);
            anInterface21_Impl3Array8147[2] = ((Class340) this).aHa_Sub3_3954.method938((byte) -105, false, is, 64);
        }
    }

    public static void method3462(byte i) {
        aClass381_8158 = null;
        if (i != 64)
            method3462((byte) -100);
        aClass296_8155 = null;
    }

    static final void method3463(boolean bool) {
        if (bool != true)
            method3460(null, 92, 82, 66, null);
        if ((Class151.anInt1804 ^ 0xffffffff) <= -1) {
            long l = Class118.method1112(116);
            Class151.anInt1804 -= l + -Class260.aLong2966;
            if ((Class151.anInt1804 ^ 0xffffffff) < -1) {
                int i = (Class151.anInt1804 << 1077396296) / Class340.anInt3959;
                int i_25_ = 255 - i;
                float f = (float) i / 255.0F;
                float f_26_ = 1.0F - f;
                Node_Sub13.anInt6973 = (((((0xff00 & Class307.anInt3557) * i - -(((((Class229) Class112_Sub3.aClass229_8641).anInt2583) & 0xff00) * i_25_)) & 0xff0000) + (~0xff00ff & (i_25_ * (((Class229) Class112_Sub3.aClass229_8641).anInt2583 & 0xff00ff) + (Class307.anInt3557 & 0xff00ff) * i))) >>> 1923631496);
                Node_Sub46.aFloat7374 = (f_26_ * (((Class229) Class112_Sub3.aClass229_8641).aFloat2589 - Class109.aFloat1380)) + Class109.aFloat1380;
                Class365.aFloat4480 = ((-Class282_Sub15.aFloat7750 + ((Class229) Class112_Sub3.aClass229_8641).aFloat2586) * f_26_) + Class282_Sub15.aFloat7750;
                Class376.aFloat4940 = (Node_Sub14_Sub20.aFloat9373 + (-Node_Sub14_Sub20.aFloat9373 + (((Class229) Class112_Sub3.aClass229_8641).aFloat2588)) * f_26_);
                Class224.anInt2545 = (((i * (0xff00 & Class23.anInt325) + (0xff00 & (((Class229) Class112_Sub3.aClass229_8641).anInt2598)) * i_25_) & 0xff0000) + (((0xff00ff & (((Class229) Class112_Sub3.aClass229_8641).anInt2598)) * i_25_ + i * (0xff00ff & Class23.anInt325)) & ~0xff00ff)) >>> -885290136;
                Class282_Sub24.aFloat7839 = (((Class229) Class112_Sub3.aClass229_8641).aFloat2597 - Class214.aFloat2472) * f_26_ + Class214.aFloat2472;
                aa_Sub1.anInt5255 = (i * Interactable.anInt8325 - -(((Class229) Class112_Sub3.aClass229_8641).anInt2581 * i_25_)) >> -118348856;
                Class136_Sub3.aFloat8401 = (f_26_ * (((Class229) Class112_Sub3.aClass229_8641).aFloat2579 - ISAACCypher.aFloat2199)) + ISAACCypher.aFloat2199;
                Class346_Sub7_Sub2_Sub1.aFloat10024 = (Class84_Sub7.aFloat5468 + f_26_ * (-Class84_Sub7.aFloat5468 + (((Class229) Class112_Sub3.aClass229_8641).aFloat2593)));
                if (Node_Sub14_Sub5.aClass316_9209 != (((Class229) Class112_Sub3.aClass229_8641).aClass316_2584))
                    Node_Sub8_Sub12.aClass316_9013 = (Class282_Sub25.aHa7855.a(Node_Sub14_Sub5.aClass316_9209, (((Class229) Class112_Sub3.aClass229_8641).aClass316_2584), f_26_, Node_Sub8_Sub12.aClass316_9013));
            } else {
                Class151.anInt1804 = -1;
                Class224.anInt2545 = ((Class229) Class112_Sub3.aClass229_8641).anInt2598;
                Class346_Sub7_Sub2_Sub1.aFloat10024 = ((Class229) Class112_Sub3.aClass229_8641).aFloat2593;
                Node_Sub8_Sub12.aClass316_9013 = ((Class229) Class112_Sub3.aClass229_8641).aClass316_2584;
                Class376.aFloat4940 = ((Class229) Class112_Sub3.aClass229_8641).aFloat2588;
                aa_Sub1.anInt5255 = ((Class229) Class112_Sub3.aClass229_8641).anInt2581;
                Node_Sub46.aFloat7374 = ((Class229) Class112_Sub3.aClass229_8641).aFloat2589;
                Class136_Sub3.aFloat8401 = ((Class229) Class112_Sub3.aClass229_8641).aFloat2579;
                Class365.aFloat4480 = ((Class229) Class112_Sub3.aClass229_8641).aFloat2586;
                Class282_Sub24.aFloat7839 = ((Class229) Class112_Sub3.aClass229_8641).aFloat2597;
                Node_Sub13.anInt6973 = ((Class229) Class112_Sub3.aClass229_8641).anInt2583;
            }
            Class260.aLong2966 = l;
        }
        anInt8159++;
    }

    final void method3435(boolean bool, int i) {
        if (i <= 109)
            method3433(-70, -66, 87);
        ((Class340) this).aHa_Sub3_3954.method955((byte) 90, Class142.aClass5_1669, Class60.aClass5_821);
        anInt8149++;
    }

    final void method3441(boolean bool) {
        if (bool != true)
            anInterface21_Impl3Array8147 = null;
        if (!aBoolean8145)
            ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 118, 0);
        else {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
            ((Class340) this).aHa_Sub3_3954.method999(125, Class221.aClass181_2533);
            ((Class340) this).aHa_Sub3_3954.method925(-108);
            if (aBoolean8148) {
                ((Class340) this).aHa_Sub3_3954.method955((byte) 121, Class60.aClass5_821, Class60.aClass5_821);
                ((Class340) this).aHa_Sub3_3954.method946(0, -69, Class147.aClass280_1738);
                ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 118, 0);
            } else {
                ((Class340) this).aHa_Sub3_3954.method955((byte) 61, Class60.aClass5_821, Class60.aClass5_821);
                ((Class340) this).aHa_Sub3_3954.method946(0, 83, Class147.aClass280_1738);
                ((Class340) this).aHa_Sub3_3954.method1040(2, (byte) -65);
                ((Class340) this).aHa_Sub3_3954.method955((byte) 88, Class60.aClass5_821, Class60.aClass5_821);
                ((Class340) this).aHa_Sub3_3954.method946(0, 55, Class147.aClass280_1738);
                ((Class340) this).aHa_Sub3_3954.method946(1, 52, Class346_Sub7_Sub3_Sub1.aClass280_10511);
                ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 94, 0);
                ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
            }
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            aBoolean8145 = false;
        }
        anInt8150++;
        ((Class340) this).aHa_Sub3_3954.method955((byte) 117, Class60.aClass5_821, Class60.aClass5_821);
    }

    static final void method3464(int i) {
        anInt8144++;
        for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -6; i_27_++)
            Class160.aBooleanArray1890[i_27_] = false;
        Class133.anInt5045 = i;
        Class263.anInt2984 = Class127.cameraPitch;
        Class271.anInt3142 = -1;
        Class282_Sub2.anInt7609 = Node_Sub18.anInt7027;
        Class84_Sub5.anInt5421 = 0;
        Class28.anInt4895 = InputStream_Sub1.cameraPosY;
        Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
        Class226_Sub1_Sub1.anInt8802 = Class346_Sub7_Sub1.cameraPosX;
        Node_Sub45.anInt7343 = 5;
        s_Sub3.anInt8018 = Class301_Sub3_Sub1.cameraYaw;
        Class282_Sub6.anInt7653 = 0;
        Class170.anInt1982 = Class316_Sub1_Sub2.cameraPosZ;
    }

    final void method3442(Interface21 interface21, int i, byte i_28_) {
        anInt8156++;
        ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
        ((Class340) this).aHa_Sub3_3954.method993((byte) 123, i);
        if (i_28_ < 68)
            anInterface21_Impl3Array8147 = null;
    }
}
