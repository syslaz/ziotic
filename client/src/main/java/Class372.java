/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class372 {
    static int anInt4570;
    static int anInt4571;
    private ha_Sub2 aHa_Sub2_4572;
    private Class136_Sub4 aClass136_Sub4_4573;
    private Interface1 anInterface1_4574;
    static int anInt4575;
    private int anInt4576;
    private int anInt4577 = -1;
    static int anInt4578;
    static int anInt4579;
    static int anInt4580;
    static IncommingOpcode aIncommingOpcode_4581 = new IncommingOpcode(114, 8);
    static int anInt4582;
    private int anInt4583;
    private Class349_Sub2 aClass349_Sub2_4584;
    boolean aBoolean4585 = true;
    static int[] anIntArray4586 = new int[4096];
    private Class155 aClass155_4587;
    private int anInt4588;

    public static void method3862(int i) {
        aIncommingOpcode_4581 = null;
        anIntArray4586 = null;
        if (i >= -113)
            method3865(24);
    }

    private final void method3863(byte i) {
        anInt4570++;
        if (((Class372) this).aBoolean4585) {
            ((Class372) this).aBoolean4585 = false;
            byte[] is = ((Class155) aClass155_4587).aByteArray1841;
            byte[] is_0_ = ((ha_Sub2) aHa_Sub2_4572).aByteArray5951;
            int i_1_ = 0;
            int i_2_ = ((Class155) aClass155_4587).anInt1839;
            int i_3_ = anInt4576 - -(anInt4583 * ((Class155) aClass155_4587).anInt1839);
            for (int i_4_ = -128; (i_4_ ^ 0xffffffff) > -1; i_4_++) {
                i_1_ = -i_1_ + (i_1_ << -1495766008);
                for (int i_5_ = -128; (i_5_ ^ 0xffffffff) > -1; i_5_++) {
                    if ((is[i_3_++] ^ 0xffffffff) != -1)
                        i_1_++;
                }
                i_3_ += -128 + i_2_;
            }
            if (aClass136_Sub4_4573 != null && anInt4577 == i_1_)
                ((Class372) this).aBoolean4585 = false;
            else {
                anInt4577 = i_1_;
                int i_6_ = 0;
                i_3_ = anInt4576 - -(anInt4583 * i_2_);
                for (int i_7_ = -128; (i_7_ ^ 0xffffffff) > -1; i_7_++) {
                    for (int i_8_ = -128; i_8_ < 0; i_8_++) {
                        if (is[i_3_] != 0)
                            is_0_[i_6_++] = (byte) 68;
                        else {
                            int i_9_ = 0;
                            if (is[-1 + i_3_] != 0)
                                i_9_++;
                            if (is[i_3_ - -1] != 0)
                                i_9_++;
                            if (is[-i_2_ + i_3_] != 0)
                                i_9_++;
                            if (is[i_2_ + i_3_] != 0)
                                i_9_++;
                            is_0_[i_6_++] = (byte) (17 * i_9_);
                        }
                        i_3_++;
                    }
                    i_3_ += -128 + ((Class155) aClass155_4587).anInt1839;
                }
                if (i != 17)
                    anInt4577 = -17;
                if (aClass136_Sub4_4573 == null) {
                    aClass136_Sub4_4573 = new Class136_Sub4(aHa_Sub2_4572, 3553, 6406, 128, 128, false, (((ha_Sub2) aHa_Sub2_4572).aByteArray5951), 6406, false);
                    aClass136_Sub4_4573.method1266((byte) -60, false, false);
                    aClass136_Sub4_4573.method1246(false, true);
                } else
                    aClass136_Sub4_4573.method1268((((ha_Sub2) aHa_Sub2_4572).aByteArray5951), 6406, 0, 0, 0, 0, false, 128, 59, 128);
            }
        }
    }

    final void method3864(byte i) {
        if (i != 113)
            anInt4583 = 106;
        method3866((byte) -121, anInt4588, anInterface1_4574);
        anInt4582++;
    }

    static final void method3865(int i) {
        for (int i_10_ = 0; Class282_Sub4.anInt7624 > i_10_; i_10_++) {
            Class42 class42 = Class67.aClass42Array902[i_10_];
            boolean bool = false;
            if (((Class42) class42).aClass248_Sub15_Sub2_550 != null) {
                if (!((Class42) class42).aClass248_Sub15_Sub2_550.hasNext((byte) 78))
                    bool = true;
            } else {
                ((Class42) class42).anInt545--;
                if ((((Class42) class42).anInt545 ^ 0xffffffff) > ((!class42.method306(4236) ? -10 : -1500) ^ 0xffffffff))
                    bool = true;
                else {
                    if (((Class42) class42).aByte541 != 1 || ((Class42) class42).aClass313_537 != null) {
                        if (class42.method306(4236) && (((Class42) class42).aClass248_Sub34_547 == null || (((Class42) class42).aClass248_Sub31_Sub1_539) == null)) {
                            if (((Class42) class42).aClass248_Sub34_547 == null)
                                ((Class42) class42).aClass248_Sub34_547 = (Node_Sub34.method2571(Node_Sub28.aClass381_7160, ((Class42) class42).anInt549));
                            if (((Class42) class42).aClass248_Sub34_547 == null)
                                continue;
                            if (((Class42) class42).aClass248_Sub31_Sub1_539 == null) {
                                ((Class42) class42).aClass248_Sub31_Sub1_539 = ((Class42) class42).aClass248_Sub34_547.method2576(new int[]{22050});
                                if ((((Class42) class42).aClass248_Sub31_Sub1_539) == null)
                                    continue;
                            }
                        }
                    } else {
                        ((Class42) class42).aClass313_537 = Class313.method3272((Node_Sub14_Sub3.aClass381_9183), ((Class42) class42).anInt549, 0);
                        if (((Class42) class42).aClass313_537 == null)
                            continue;
                        ((Class42) class42).anInt545 += ((Class42) class42).aClass313_537.method3274();
                    }
                    if (((Class42) class42).anInt545 < 0) {
                        int i_11_ = 8192;
                        int i_12_;
                        if ((((Class42) class42).anInt551 ^ 0xffffffff) == -1)
                            i_12_ = (((Class42) class42).anInt535 * (((Class42) class42).aByte541 == 3 ? ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub17_7339.method2993(true) : ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub17_7332.method2993(true))) >> -1821502942;
                        else {
                            int i_13_ = 0x3 & (((Class42) class42).anInt551 >> 1236983416);
                            if ((i_13_ ^ 0xffffffff) == ((((Interactable) (Class347.myPlayer)).plane) ^ 0xffffffff)) {
                                int i_14_ = ((0xff & ((Class42) class42).anInt551) << -821787607);
                                int i_15_ = (Class347.myPlayer.method3632(-1) << 72410440);
                                int i_16_ = ((((Class42) class42).anInt551 & 0xff5577) >> 504675664);
                                int i_17_ = ((i_16_ << -612977175) + 256 - ((((Interactable) (Class347.myPlayer)).x) + -i_15_));
                                int i_18_ = ((0xffc7 & ((Class42) class42).anInt551) >> 1430771528);
                                int i_19_ = (256 + ((i_18_ << 86025993) - (((Interactable) (Class347.myPlayer)).y) + i_15_));
                                int i_20_ = Math.abs(i_17_) + Math.abs(i_19_) + -512;
                                if (i_14_ < i_20_) {
                                    ((Class42) class42).anInt545 = -99999;
                                    continue;
                                }
                                if ((i_20_ ^ 0xffffffff) > -1)
                                    i_20_ = 0;
                                i_12_ = (((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub17_7325.method2993(true) * (i_14_ + -i_20_) * ((Class42) class42).anInt535 / i_14_) >> 246644642;
                                if ((((Class42) class42).aInteractable_542 != null) && (((Class42) class42).aInteractable_542 instanceof Animable)) {
                                    Animable animable = ((Animable) (((Class42) class42).aInteractable_542));
                                    short i_21_ = (((Animable) animable).y1);
                                    short i_22_ = (((Animable) animable).x1);
                                }
                                if ((i_17_ ^ 0xffffffff) != -1 || (i_19_ ^ 0xffffffff) != -1) {
                                    int i_23_ = (0x3fff & (-Class301_Sub3_Sub1.cameraYaw - (int) (2607.5945876176133 * (Math.atan2((double) i_17_, (double) i_19_))) + -4096));
                                    if (i_23_ > 8192)
                                        i_23_ = 16384 - i_23_;
                                    int i_24_;
                                    if (i_20_ > 0) {
                                        if ((i_20_ ^ 0xffffffff) > -4097)
                                            i_24_ = 8192 - -((-i_20_ + 8192) / 4096);
                                        else
                                            i_24_ = 16384;
                                    } else
                                        i_24_ = 8192;
                                    i_11_ = (i_24_ * i_23_ / 8192 + (-i_24_ + 16384 >> -834569503));
                                }
                            } else
                                i_12_ = 0;
                        }
                        if ((i_12_ ^ 0xffffffff) < -1) {
                            Node_Sub31_Sub1 class248_sub31_sub1 = null;
                            if (((Class42) class42).aByte541 == 1)
                                class248_sub31_sub1 = (((Class42) class42).aClass313_537.method3273().method2564(Player.aClass317_10534));
                            else if (class42.method306(4236))
                                class248_sub31_sub1 = (((Class42) class42).aClass248_Sub31_Sub1_539);
                            Node_Sub15_Sub2 class248_sub15_sub2 = (((Class42) class42).aClass248_Sub15_Sub2_550 = (Node_Sub15_Sub2.method2452(class248_sub31_sub1, ((Class42) class42).anInt546, i_12_, i_11_)));
                            class248_sub15_sub2.method2463(((Class42) class42).anInt544 + -1);
                            Class282_Sub15.aClass248_Sub15_Sub3_7751.method2485(class248_sub15_sub2);
                        }
                    }
                }
            }
            if (bool) {
                Class282_Sub4.anInt7624--;
                for (int i_25_ = i_10_; Class282_Sub4.anInt7624 > i_25_; i_25_++)
                    Class67.aClass42Array902[i_25_] = Class67.aClass42Array902[1 + i_25_];
                i_10_--;
            }
        }
        anInt4571++;
        if (ha_Sub3_Sub1.aBoolean8709 && !Class310.method3243(-114)) {
            if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344.method2993(true) != 0 && (Node_Sub8_Sub3.anInt8927 ^ 0xffffffff) != 0) {
                if (Class280.aClass248_Sub15_Sub1_3261 != null)
                    Class119.method1116(2, false, 0, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub17_7344.method2993(true), Class280.aClass248_Sub15_Sub1_3261, Class116_Sub1.aClass381_6281, Node_Sub8_Sub3.anInt8927);
                else
                    Class132.method1216(false, 105, Node_Sub8_Sub3.anInt8927, 0, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub17_7344.method2993(true), Class116_Sub1.aClass381_6281);
            }
            Class280.aClass248_Sub15_Sub1_3261 = null;
            ha_Sub3_Sub1.aBoolean8709 = false;
        } else if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344.method2993(true) ^ 0xffffffff) != -1 && (Node_Sub8_Sub3.anInt8927 ^ 0xffffffff) != 0 && !Class310.method3243(-115)) {
            Node_Sub23.anInt7089++;
            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class199.aOutgoingOpcode_2283);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, Node_Sub8_Sub3.anInt8927);
            Class226_Sub3.method1814(class248_sub36, 0);
            Node_Sub8_Sub3.anInt8927 = -1;
        }
        if (i > -31)
            method3862(-102);
    }

    private final void method3866(byte i, int i_26_, Interface1 interface1) {
        anInt4575++;
        if (i_26_ != 0) {
            method3863((byte) 17);
            int i_27_ = 110 % ((i - -11) / 49);
            aHa_Sub2_4572.method889(-2, aClass136_Sub4_4573);
            aHa_Sub2_4572.method897(interface1, 0, (byte) -78, 4, i_26_);
        }
    }

    static final void method3867(Class310_Sub1 class310_sub1, byte i, byte[][] is) {
        anInt4578++;
        int[] is_28_ = {-1, 0, 0, 0, 0};
        for (int i_29_ = 0; ((((Class310) class310_sub1).anInt3608 ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
            Node_Sub37.method2594(-25926);
            for (int i_30_ = 0; Node_Sub8_Sub4.anInt8360 >> 2049532355 > i_30_; i_30_++) {
                for (int i_31_ = 0; Node_Sub22.anInt7074 >> 307595747 > i_31_; i_31_++) {
                    int i_32_ = (Class245.anIntArrayArrayArray2749[i_29_][i_30_][i_31_]);
                    if ((i_32_ ^ 0xffffffff) != 0) {
                        int i_33_ = (0x3d49ee9 & i_32_) >> -629824488;
                        if (!((Class310) class310_sub1).aBoolean3604 || i_33_ == 0) {
                            int i_34_ = i_32_ >> -946160127 & 0x3;
                            int i_35_ = (i_32_ & 0xfff94a) >> 1421399150;
                            int i_36_ = (0x3ffc & i_32_) >> -1786343997;
                            int i_37_ = (i_35_ / 8 << -1644057848) + i_36_ / 8;
                            for (int i_38_ = 0; ((i_38_ ^ 0xffffffff) > (Node_Sub14_Sub36.anIntArray9544.length ^ 0xffffffff)); i_38_++) {
                                if (i_37_ == (Node_Sub14_Sub36.anIntArray9544[i_38_]) && is[i_38_] != null) {
                                    ByteStream class248_sub9 = new ByteStream(is[i_38_]);
                                    class310_sub1.method3242(i_35_, 8 * i_31_, (byte) 2, i_34_, i_33_, Class182.aClass164Array2114, class248_sub9, i_29_, i_36_, 8 * i_30_);
                                    class310_sub1.method3258((byte) -100, i_36_, i_35_, i_33_, 8 * i_31_, 8 * i_30_, class248_sub9, i_34_, Class287.aHa3381, is_28_[0] == -1 ? is_28_ : null, i_29_);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_39_ = 0; ((((Class310) class310_sub1).anInt3608 ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
            Node_Sub37.method2594(-25926);
            for (int i_40_ = 0; ((i_40_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 >> -980461437 ^ 0xffffffff)); i_40_++) {
                for (int i_41_ = 0; i_41_ < Node_Sub22.anInt7074 >> 648722755; i_41_++) {
                    int i_42_ = (Class245.anIntArrayArrayArray2749[i_39_][i_40_][i_41_]);
                    if (i_42_ == -1)
                        class310_sub1.method3240(-1, 8, 8, i_39_, 8 * i_40_, i_41_ * 8);
                }
            }
        }
        if (i < 51)
            aIncommingOpcode_4581 = null;
        if (is_28_[0] != -1) {
            Class223.aClass199_5198 = Class293.aClass102_3436.method728(is_28_[2], is_28_[0], -23470, is_28_[1], is_28_[3], Class371.aClass11_4569);
            Class115.anInt4953 = is_28_[4];
        }
    }

    static final int method3868(int i, byte i_43_, int i_44_) {
        anInt4580++;
        if (i_43_ != -56)
            aIncommingOpcode_4581 = null;
        if (i_44_ == -2)
            return 12345678;
        if ((i_44_ ^ 0xffffffff) == 0) {
            if ((i ^ 0xffffffff) > -3)
                i = 2;
            else if ((i ^ 0xffffffff) < -127)
                i = 126;
            return i;
        }
        i = (i_44_ & 0x7f) * i >> 1281696583;
        if (i < 2)
            i = 2;
        else if (i > 126)
            i = 126;
        return i + (0xff80 & i_44_);
    }

    final void method3869(byte i, int i_45_, byte[] is, int i_46_) {
        aClass349_Sub2_4584.method7(i_46_ * aHa_Sub2_4572.method916(-67, i_45_), 20218, i_45_, is);
        anInt4579++;
        method3866((byte) 40, i_46_, aClass349_Sub2_4584);
        if (i <= 78)
            method3863((byte) -77);
    }

    Class372(ha_Sub2 var_ha_Sub2, Class155 class155, s_Sub2 var_s_Sub2, int i, int i_47_, int i_48_, int i_49_, int i_50_) {
        aHa_Sub2_4572 = var_ha_Sub2;
        anInt4576 = i_49_;
        anInt4583 = i_50_;
        aClass155_4587 = class155;
        int i_51_ = 1 << i_48_;
        int i_52_ = 0;
        int i_53_ = i << i_48_;
        int i_54_ = i_47_ << i_48_;
        for (int i_55_ = 0; (i_51_ ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++) {
            int i_56_ = (i_55_ + i_54_) * ((s) var_s_Sub2).anInt3468 + i_53_;
            for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > (i_51_ ^ 0xffffffff); i_57_++) {
                short[] is = ((s_Sub2) var_s_Sub2).aShortArrayArray7954[i_56_++];
                if (is != null)
                    i_52_ += is.length;
            }
        }
        anInt4588 = i_52_;
        if (i_52_ > 0) {
            ByteStream class248_sub9 = new ByteStream(2 * i_52_);
            if (!((ha_Sub2) aHa_Sub2_4572).aBoolean5872) {
                for (int i_58_ = 0; (i_51_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
                    int i_59_ = ((s) var_s_Sub2).anInt3468 * (i_58_ + i_54_) + i_53_;
                    for (int i_60_ = 0; i_60_ < i_51_; i_60_++) {
                        short[] is = (((s_Sub2) var_s_Sub2).aShortArrayArray7954[i_59_++]);
                        if (is != null) {
                            for (int i_61_ = 0; ((is.length ^ 0xffffffff) < (i_61_ ^ 0xffffffff)); i_61_++)
                                class248_sub9.writeLEShort_(is[i_61_] & 0xffff, 125);
                        }
                    }
                }
            } else {
                for (int i_62_ = 0; (i_51_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
                    int i_63_ = i_53_ + ((s) var_s_Sub2).anInt3468 * (i_54_ + i_62_);
                    for (int i_64_ = 0; i_64_ < i_51_; i_64_++) {
                        short[] is = (((s_Sub2) var_s_Sub2).aShortArrayArray7954[i_63_++]);
                        if (is != null) {
                            for (int i_65_ = 0; ((is.length ^ 0xffffffff) < (i_65_ ^ 0xffffffff)); i_65_++)
                                class248_sub9.writeShort(1182, 0xffff & is[i_65_]);
                        }
                    }
                }
            }
            anInterface1_4574 = aHa_Sub2_4572.method877(5123, (byte) -85, (((ByteStream) class248_sub9).buffer), (((ByteStream) class248_sub9).offset), false);
            aClass349_Sub2_4584 = new Class349_Sub2(aHa_Sub2_4572, 5123, null, 1);
        } else
            aClass136_Sub4_4573 = null;
    }

    static {
        for (int i = 0; i < 4096; i++)
            anIntArray4586[i] = Class340_Sub9.method3471(i, (byte) 99);
    }
}
