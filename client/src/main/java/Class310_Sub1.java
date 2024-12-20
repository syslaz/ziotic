/* Class310_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class310_Sub1 extends Class310 {
    static int anInt8031;
    static int anInt8032;
    static int anInt8033;
    static int anInt8034;
    static int anInt8035;
    static int anInt8036;
    static int anInt8037;
    static int anInt8038;
    static float[] aFloatArray8039 = new float[4];
    int anInt8040 = 99;
    static int anInt8041;
    static int anInt8042;
    /*synthetic*/ static Class aClass8043;

    final void method3252(boolean bool, byte i, ha var_ha) {
        Class227.method1823();
        anInt8041++;
        if (i == 75) {
            if (!bool) {
                if ((((Class310) this).anInt3608 ^ 0xffffffff) < -2) {
                    for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff)); i_0_++) {
                        for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)); i_1_++) {
                            if ((r.aByteArrayArrayArray9033[1][i_0_][i_1_] & 0x2) == 2)
                                Class147_Sub1.method1321(i_0_, i_1_);
                        }
                    }
                }
                for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (((Class310) this).anInt3608 ^ 0xffffffff)); i_2_++) {
                    for (int i_3_ = 0; ((((Class310) this).anInt3580 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)); i_3_++) {
                        for (int i_4_ = 0; ((((Class310) this).anInt3597 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff)); i_4_++) {
                            if ((0x4 & (((Class310) this).aByteArrayArrayArray3582[i_2_][i_4_][i_3_]) ^ 0xffffffff) != -1) {
                                int i_5_ = i_4_;
                                int i_6_ = i_4_;
                                int i_7_ = i_3_;
                                int i_8_ = i_3_;
                                for (/**/; ((i_7_ ^ 0xffffffff) < -1 && (0x4 & (((Class310) this).aByteArrayArrayArray3582[i_2_][i_4_][i_7_ - 1]) ^ 0xffffffff) != -1); i_7_--) {
                                    if (i_8_ + -i_7_ >= 10)
                                        break;
                                }
                                for (/**/; (((i_8_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)) && (0x4 & (((Class310) this).aByteArrayArrayArray3582[i_2_][i_4_][i_8_ - -1]) ^ 0xffffffff) != -1); i_8_++) {
                                    if ((-i_7_ + i_8_ ^ 0xffffffff) <= -11)
                                        break;
                                }
                                while_5_:
                                for (/**/; i_5_ > 0; i_5_--) {
                                    if (i_6_ - i_5_ >= 10)
                                        break;
                                    for (int i_9_ = i_7_; ((i_8_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff)); i_9_++) {
                                        if (((((Class310) this).aByteArrayArrayArray3582[i_2_][i_5_ - 1][i_9_]) & 0x4) == 0)
                                            break while_5_;
                                    }
                                }
                                while_6_:
                                for (/**/; (((Class310) this).anInt3597 > i_6_ && i_6_ + -i_5_ < 10); i_6_++) {
                                    for (int i_10_ = i_7_; ((i_10_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)); i_10_++) {
                                        if (((((Class310) this).aByteArrayArrayArray3582[i_2_][1 + i_6_][i_10_]) & 0x4 ^ 0xffffffff) == -1)
                                            break while_6_;
                                    }
                                }
                                if (((i_6_ - (i_5_ + -1)) * (i_8_ + (-i_7_ - -1)) ^ 0xffffffff) <= -5) {
                                    int i_11_ = (((Class310) this).anIntArrayArrayArray3592[i_2_][i_5_][i_7_]);
                                    Class349_Sub1.method3737(i_2_, (byte) -121, 4, 512 + (i_6_ << -1008150583), i_5_ << -540805719, i_7_ << -1009152759, i_11_, (i_8_ << 2021409833) - -512, i_11_);
                                    for (int i_12_ = i_5_; ((i_6_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)); i_12_++) {
                                        for (int i_13_ = i_7_; i_13_ <= i_8_; i_13_++)
                                            ((Class310) this).aByteArrayArrayArray3582[i_2_][i_12_][i_13_] = (byte) (Class112.method794((((Class310) this).aByteArrayArrayArray3582[i_2_][i_12_][i_13_]), -5));
                                    }
                                }
                            }
                        }
                    }
                }
                Class287.method3078(-11017);
            }
            ((Class310) this).aByteArrayArrayArray3582 = null;
        }
    }

    public static void method3253(int i) {
        aFloatArray8039 = null;
        if (i > -8)
            method3253(-40);
    }

    final void method3254(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, byte i_19_, int i_20_, int i_21_, ha var_ha, Class164 class164) {
        anInt8037++;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) != 0 || Class107.method752(i_18_, Class84_Sub5.anInt5425, i_16_, 2, i_15_)) {
            if ((i ^ 0xffffffff) > (((Class310_Sub1) this).anInt8040 ^ 0xffffffff))
                ((Class310_Sub1) this).anInt8040 = i;
            ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -128, i_14_);
            if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method3047(true) ^ 0xffffffff) != -1 || !((ObjectDefinition) class266).aBoolean3076) {
                int i_22_;
                int i_23_;
                if (i_20_ == 1 || (i_20_ ^ 0xffffffff) == -4) {
                    i_22_ = ((ObjectDefinition) class266).anInt3097;
                    i_23_ = ((ObjectDefinition) class266).anInt3065;
                } else {
                    i_22_ = ((ObjectDefinition) class266).anInt3065;
                    i_23_ = ((ObjectDefinition) class266).anInt3097;
                }
                int i_24_;
                int i_25_;
                if ((i_18_ + i_23_ ^ 0xffffffff) >= (((Class310) this).anInt3597 ^ 0xffffffff)) {
                    i_25_ = (1 + i_23_ >> 502805793) + i_18_;
                    i_24_ = i_18_ - -(i_23_ >> -1420198079);
                } else {
                    i_24_ = i_18_;
                    i_25_ = 1 + i_18_;
                }
                int i_26_;
                int i_27_;
                if (((Class310) this).anInt3580 >= i_16_ + i_22_) {
                    i_27_ = i_16_ + (1 + i_22_ >> -613227327);
                    i_26_ = i_16_ + (i_22_ >> -952661439);
                } else {
                    i_26_ = i_16_;
                    i_27_ = i_16_ + 1;
                }
                s var_s = Class177.aSArray2070[i_15_];
                if (i_19_ == -15) {
                    int i_28_ = ((var_s.method3145(i_24_, 98, i_26_) - -var_s.method3145(i_25_, i_19_ + 123, i_26_) - (-var_s.method3145(i_24_, 103, i_27_) + -var_s.method3145(i_25_, i_19_ + 110, i_27_))) >> 1893005218);
                    int i_29_ = (i_18_ << -1906035767) - -(i_23_ << -1237922936);
                    int i_30_ = (i_22_ << -535078552) + (i_16_ << -194324215);
                    boolean bool = (Class340_Sub5.aBoolean8140 && !((Class310) this).aBoolean3604 && ((ObjectDefinition) class266).aBoolean3106);
                    if (class266.method2792(i_19_ ^ 0xe))
                        Class353.method3755(null, i_20_, i_18_, class266, i, i_16_, -652104791, null);
                    boolean bool_31_ = ((i_17_ ^ 0xffffffff) == 0 && ((((ObjectDefinition) class266).anInt3023 ^ 0xffffffff) == 0) && ((ObjectDefinition) class266).anIntArray3096 == null && ((ObjectDefinition) class266).anIntArray3049 == null && !((ObjectDefinition) class266).aBoolean3026 && !((ObjectDefinition) class266).aBoolean3088);
                    if (!Class185_Sub1.aBoolean6653 || ((!Class225_Sub3.method1797((byte) 63, i_21_) || ((ObjectDefinition) class266).anInt3068 == 1) && (!Class225_Sub1.method1789(false, i_21_) || (((ObjectDefinition) class266).anInt3068 ^ 0xffffffff) != -1))) {
                        if ((i_21_ ^ 0xffffffff) == -23) {
                            if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349.method2988(true) != 0 || ((ObjectDefinition) class266).anInt3105 != 0 || ((ObjectDefinition) class266).anInt3093 == 1 || ((ObjectDefinition) class266).aBoolean3091) {
                                Class346_Sub7_Sub4 class346_sub7_sub4;
                                if (bool_31_) {
                                    Class346_Sub7_Sub4_Sub1 class346_sub7_sub4_sub1 = (new Class346_Sub7_Sub4_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_20_, bool));
                                    class346_sub7_sub4 = class346_sub7_sub4_sub1;
                                    if (class346_sub7_sub4_sub1.method45(-28823))
                                        class346_sub7_sub4_sub1.method42(true, var_ha);
                                } else
                                    class346_sub7_sub4 = (new Class346_Sub7_Sub4_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_20_, i_17_));
                                Class125.method1148(i, i_18_, i_16_, class346_sub7_sub4);
                                if (((ObjectDefinition) class266).anInt3093 == 1 && class164 != null)
                                    class164.method1525(true, i_18_, i_16_);
                            }
                        } else if ((i_21_ ^ 0xffffffff) == -11 || i_21_ == 11) {
                            Class346_Sub7_Sub2_Sub1 class346_sub7_sub2_sub1 = null;
                            Animable animable;
                            int i_32_;
                            if (!bool_31_) {
                                i_32_ = 15;
                                animable = (new Class346_Sub7_Sub2_Sub4(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_18_, i_23_ + i_18_ - 1, i_16_, i_22_ + (i_16_ - 1), i_21_, i_20_, i_17_));
                            } else {
                                Class346_Sub7_Sub2_Sub1 class346_sub7_sub2_sub1_33_ = (new Class346_Sub7_Sub2_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_18_, i_23_ + (i_18_ + -1), i_16_, -1 + (i_22_ + i_16_), i_21_, i_20_, bool));
                                animable = class346_sub7_sub2_sub1_33_;
                                class346_sub7_sub2_sub1 = class346_sub7_sub2_sub1_33_;
                                i_32_ = class346_sub7_sub2_sub1_33_.method3605(-13876);
                            }
                            if (Class299.method3175(animable, false)) {
                                if (class346_sub7_sub2_sub1 != null && class346_sub7_sub2_sub1.method45(-28823))
                                    class346_sub7_sub2_sub1.method42(true, var_ha);
                                if (((ObjectDefinition) class266).aBoolean3062 && Class340_Sub5.aBoolean8140) {
                                    if ((i_32_ ^ 0xffffffff) < -31)
                                        i_32_ = 30;
                                    for (int i_34_ = 0; i_34_ <= i_23_; i_34_++) {
                                        for (int i_35_ = 0; i_35_ <= i_22_; i_35_++)
                                            var_s.ka(i_34_ + i_18_, i_35_ + i_16_, i_32_);
                                    }
                                }
                            }
                            if (((((ObjectDefinition) class266).anInt3093 ^ 0xffffffff) != -1) && class164 != null)
                                class164.method1516((((ObjectDefinition) class266).aBoolean3111), i_23_, !(((ObjectDefinition) class266).aBoolean3082), i_16_, i_22_, i_18_, -120);
                        } else if (i_21_ >= 12 && i_21_ <= 17 || (i_21_ >= 18 && (i_21_ ^ 0xffffffff) >= -22)) {
                            Animable animable;
                            if (!bool_31_)
                                animable = (new Class346_Sub7_Sub2_Sub4(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_18_, -1 + (i_18_ + i_23_), i_16_, -1 + i_16_ + i_22_, i_21_, i_20_, i_17_));
                            else {
                                Class346_Sub7_Sub2_Sub1 class346_sub7_sub2_sub1 = (new Class346_Sub7_Sub2_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_18_, i_18_ + (i_23_ - 1), i_16_, i_16_ + i_22_ + -1, i_21_, i_20_, bool));
                                animable = class346_sub7_sub2_sub1;
                                if (class346_sub7_sub2_sub1.method45(-28823))
                                    class346_sub7_sub2_sub1.method42(true, var_ha);
                            }
                            Class299.method3175(animable, false);
                            if (Class340_Sub5.aBoolean8140 && !((Class310) this).aBoolean3604 && (i_21_ ^ 0xffffffff) <= -13 && i_21_ <= 17 && i_21_ != 13 && i > 0 && ((ObjectDefinition) class266).anInt3068 != 0)
                                ((Class310) this).aByteArrayArrayArray3582[i][i_18_][i_16_] = (byte) (Class358.retrieveLooksSettings((((Class310) this).aByteArrayArrayArray3582[i][i_18_][i_16_]), 4));
                            if (((((ObjectDefinition) class266).anInt3093 ^ 0xffffffff) != -1) && class164 != null)
                                class164.method1516((((ObjectDefinition) class266).aBoolean3111), i_23_, !(((ObjectDefinition) class266).aBoolean3082), i_16_, i_22_, i_18_, -115);
                        } else if ((i_21_ ^ 0xffffffff) == -1) {
                            int i_36_ = ((ObjectDefinition) class266).anInt3068;
                            if (Class293.aBoolean3443 && (((ObjectDefinition) class266).anInt3068 ^ 0xffffffff) == 0)
                                i_36_ = 1;
                            Class346_Sub7_Sub5 class346_sub7_sub5;
                            if (!bool_31_)
                                class346_sub7_sub5 = (new Class346_Sub7_Sub5_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_, i_17_));
                            else {
                                Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1 = (new Class346_Sub7_Sub5_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_, bool));
                                if (class346_sub7_sub5_sub1.method45(-28823))
                                    class346_sub7_sub5_sub1.method42(true, var_ha);
                                class346_sub7_sub5 = class346_sub7_sub5_sub1;
                            }
                            Class234.method1845(i, i_18_, i_16_, class346_sub7_sub5, null);
                            if (i_20_ != 0) {
                                if ((i_20_ ^ 0xffffffff) == -2) {
                                    if (Class340_Sub5.aBoolean8140 && (((ObjectDefinition) class266).aBoolean3062)) {
                                        var_s.ka(i_18_, i_16_ + 1, 50);
                                        var_s.ka(i_18_ + 1, 1 + i_16_, 50);
                                    }
                                    if (i_36_ == 1 && !((Class310) this).aBoolean3604)
                                        Class188.method1634(-((ObjectDefinition) class266).anInt3080, 2, i_18_, 1 + i_16_, ((ObjectDefinition) class266).anInt3051, i, true);
                                } else if (i_20_ == 2) {
                                    if (Class340_Sub5.aBoolean8140 && (((ObjectDefinition) class266).aBoolean3062)) {
                                        var_s.ka(i_18_ + 1, i_16_, 50);
                                        var_s.ka(1 + i_18_, 1 + i_16_, 50);
                                    }
                                    if (i_36_ == 1 && !((Class310) this).aBoolean3604)
                                        Class188.method1634(-((ObjectDefinition) class266).anInt3080, 1, i_18_ + 1, i_16_, ((ObjectDefinition) class266).anInt3051, i, true);
                                } else if ((i_20_ ^ 0xffffffff) == -4) {
                                    if (Class340_Sub5.aBoolean8140 && (((ObjectDefinition) class266).aBoolean3062)) {
                                        var_s.ka(i_18_, i_16_, 50);
                                        var_s.ka(1 + i_18_, i_16_, 50);
                                    }
                                    if (i_36_ == 1 && !((Class310) this).aBoolean3604)
                                        Class188.method1634(((ObjectDefinition) class266).anInt3080, 2, i_18_, i_16_, ((ObjectDefinition) class266).anInt3051, i, true);
                                }
                            } else {
                                if (Class340_Sub5.aBoolean8140 && ((ObjectDefinition) class266).aBoolean3062) {
                                    var_s.ka(i_18_, i_16_, 50);
                                    var_s.ka(i_18_, 1 + i_16_, 50);
                                }
                                if ((i_36_ ^ 0xffffffff) == -2 && !((Class310) this).aBoolean3604)
                                    Class188.method1634((((ObjectDefinition) class266).anInt3080), 1, i_18_, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                            }
                            if (((ObjectDefinition) class266).anInt3093 != 0 && class164 != null)
                                class164.method1527(!(((ObjectDefinition) class266).aBoolean3082), i_21_, i_16_, (((ObjectDefinition) class266).aBoolean3111), i_19_ + 659471, i_20_, i_18_);
                            if (((ObjectDefinition) class266).anInt3042 != 64)
                                Class96.method698(i, i_18_, i_16_, (((ObjectDefinition) class266).anInt3042));
                        } else if ((i_21_ ^ 0xffffffff) == -2) {
                            Class346_Sub7_Sub5 class346_sub7_sub5;
                            if (bool_31_) {
                                Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1 = (new Class346_Sub7_Sub5_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_, bool));
                                if (class346_sub7_sub5_sub1.method45(i_19_ ^ 0x7098))
                                    class346_sub7_sub5_sub1.method42(true, var_ha);
                                class346_sub7_sub5 = class346_sub7_sub5_sub1;
                            } else
                                class346_sub7_sub5 = (new Class346_Sub7_Sub5_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_, i_17_));
                            Class234.method1845(i, i_18_, i_16_, class346_sub7_sub5, null);
                            if (((ObjectDefinition) class266).aBoolean3062 && Class340_Sub5.aBoolean8140) {
                                if ((i_20_ ^ 0xffffffff) == -1)
                                    var_s.ka(i_18_, i_16_ - -1, 50);
                                else if ((i_20_ ^ 0xffffffff) == -2)
                                    var_s.ka(i_18_ - -1, 1 + i_16_, 50);
                                else if ((i_20_ ^ 0xffffffff) == -3)
                                    var_s.ka(i_18_ - -1, i_16_, 50);
                                else if ((i_20_ ^ 0xffffffff) == -4)
                                    var_s.ka(i_18_, i_16_, 50);
                            }
                            if (((ObjectDefinition) class266).anInt3093 != 0 && class164 != null)
                                class164.method1527(!(((ObjectDefinition) class266).aBoolean3082), i_21_, i_16_, (((ObjectDefinition) class266).aBoolean3111), 659456, i_20_, i_18_);
                        } else if (i_21_ == 2) {
                            int i_37_ = 1 + i_20_ & 0x3;
                            Class346_Sub7_Sub5 class346_sub7_sub5;
                            Class346_Sub7_Sub5 class346_sub7_sub5_38_;
                            if (!bool_31_) {
                                class346_sub7_sub5_38_ = (new Class346_Sub7_Sub5_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_ - -4, i_17_));
                                class346_sub7_sub5 = (new Class346_Sub7_Sub5_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_37_, i_17_));
                            } else {
                                Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1 = (new Class346_Sub7_Sub5_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, 4 + i_20_, bool));
                                Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1_39_ = (new Class346_Sub7_Sub5_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_37_, bool));
                                if (class346_sub7_sub5_sub1.method45(-28823))
                                    class346_sub7_sub5_sub1.method42(true, var_ha);
                                class346_sub7_sub5 = class346_sub7_sub5_sub1_39_;
                                class346_sub7_sub5_38_ = class346_sub7_sub5_sub1;
                                if (class346_sub7_sub5_sub1_39_.method45(-28823))
                                    class346_sub7_sub5_sub1_39_.method42(true, var_ha);
                            }
                            Class234.method1845(i, i_18_, i_16_, class346_sub7_sub5_38_, class346_sub7_sub5);
                            if (((((ObjectDefinition) class266).anInt3068 ^ 0xffffffff) == -2 || (Class293.aBoolean3443 && ((ObjectDefinition) class266).anInt3068 == -1)) && !((Class310) this).aBoolean3604) {
                                if ((i_20_ ^ 0xffffffff) != -1) {
                                    if ((i_20_ ^ 0xffffffff) != -2) {
                                        if ((i_20_ ^ 0xffffffff) != -3) {
                                            if (i_20_ == 3) {
                                                Class188.method1634((((ObjectDefinition) class266).anInt3080), 1, i_18_, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                                                Class188.method1634((((ObjectDefinition) class266).anInt3080), 2, i_18_, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                                            }
                                        } else {
                                            Class188.method1634((((ObjectDefinition) class266).anInt3080), 1, i_18_ + 1, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                                            Class188.method1634((((ObjectDefinition) class266).anInt3080), 2, i_18_, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                                        }
                                    } else {
                                        Class188.method1634(((ObjectDefinition) class266).anInt3080, 1, 1 + i_18_, i_16_, ((ObjectDefinition) class266).anInt3051, i, true);
                                        Class188.method1634(((ObjectDefinition) class266).anInt3080, 2, i_18_, i_16_ - -1, ((ObjectDefinition) class266).anInt3051, i, true);
                                    }
                                } else {
                                    Class188.method1634((((ObjectDefinition) class266).anInt3080), 1, i_18_, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                                    Class188.method1634((((ObjectDefinition) class266).anInt3080), 2, i_18_, i_16_ + 1, (((ObjectDefinition) class266).anInt3051), i, true);
                                }
                            }
                            if (((((ObjectDefinition) class266).anInt3093 ^ 0xffffffff) != -1) && class164 != null)
                                class164.method1527(!(((ObjectDefinition) class266).aBoolean3082), i_21_, i_16_, (((ObjectDefinition) class266).aBoolean3111), 659456, i_20_, i_18_);
                            if ((((ObjectDefinition) class266).anInt3042 ^ 0xffffffff) != -65)
                                Class96.method698(i, i_18_, i_16_, (((ObjectDefinition) class266).anInt3042));
                        } else if ((i_21_ ^ 0xffffffff) == -4) {
                            Class346_Sub7_Sub5 class346_sub7_sub5;
                            if (bool_31_) {
                                Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1 = (new Class346_Sub7_Sub5_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_, bool));
                                if (class346_sub7_sub5_sub1.method45(-28823))
                                    class346_sub7_sub5_sub1.method42(true, var_ha);
                                class346_sub7_sub5 = class346_sub7_sub5_sub1;
                            } else
                                class346_sub7_sub5 = (new Class346_Sub7_Sub5_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_21_, i_20_, i_17_));
                            Class234.method1845(i, i_18_, i_16_, class346_sub7_sub5, null);
                            if (((ObjectDefinition) class266).aBoolean3062 && Class340_Sub5.aBoolean8140) {
                                if ((i_20_ ^ 0xffffffff) == -1)
                                    var_s.ka(i_18_, i_16_ - -1, 50);
                                else if (i_20_ != 1) {
                                    if (i_20_ == 2)
                                        var_s.ka(1 + i_18_, i_16_, 50);
                                    else if (i_20_ == 3)
                                        var_s.ka(i_18_, i_16_, 50);
                                } else
                                    var_s.ka(1 + i_18_, 1 + i_16_, 50);
                            }
                            if (((ObjectDefinition) class266).anInt3093 != 0 && class164 != null)
                                class164.method1527(!(((ObjectDefinition) class266).aBoolean3082), i_21_, i_16_, (((ObjectDefinition) class266).aBoolean3111), 659456, i_20_, i_18_);
                        } else if ((i_21_ ^ 0xffffffff) == -10) {
                            Animable animable;
                            if (!bool_31_)
                                animable = (new Class346_Sub7_Sub2_Sub4(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_18_, i_23_ + i_18_ + -1, i_16_, i_22_ + (i_16_ - 1), i_21_, i_20_, i_17_));
                            else {
                                Class346_Sub7_Sub2_Sub1 class346_sub7_sub2_sub1 = (new Class346_Sub7_Sub2_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_18_, i_18_, i_16_, i_16_, i_21_, i_20_, bool));
                                if (class346_sub7_sub2_sub1.method45(i_19_ + -28808))
                                    class346_sub7_sub2_sub1.method42(true, var_ha);
                                animable = class346_sub7_sub2_sub1;
                            }
                            Class299.method3175(animable, false);
                            if (((((ObjectDefinition) class266).anInt3068 ^ 0xffffffff) == -2) && !((Class310) this).aBoolean3604) {
                                int i_40_;
                                if ((i_20_ & 0x1) == 0)
                                    i_40_ = 8;
                                else
                                    i_40_ = 16;
                                Class188.method1634(0, i_40_, i_18_, i_16_, (((ObjectDefinition) class266).anInt3051), i, true);
                            }
                            if (((((ObjectDefinition) class266).anInt3093 ^ 0xffffffff) != -1) && class164 != null)
                                class164.method1516((((ObjectDefinition) class266).aBoolean3111), i_23_, !(((ObjectDefinition) class266).aBoolean3082), i_16_, i_22_, i_18_, -92);
                            if (((ObjectDefinition) class266).anInt3042 != 64)
                                Class96.method698(i, i_18_, i_16_, (((ObjectDefinition) class266).anInt3042));
                        } else if (i_21_ == 4) {
                            Class346_Sub7_Sub1 class346_sub7_sub1;
                            if (!bool_31_)
                                class346_sub7_sub1 = (new Class346_Sub7_Sub1_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, 0, 0, i_21_, i_20_, i_17_));
                            else {
                                Class346_Sub7_Sub1_Sub1 class346_sub7_sub1_sub1 = (new Class346_Sub7_Sub1_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, 0, 0, i_21_, i_20_));
                                class346_sub7_sub1 = class346_sub7_sub1_sub1;
                                if (class346_sub7_sub1_sub1.method45(i_19_ + -28808))
                                    class346_sub7_sub1_sub1.method42(true, var_ha);
                            }
                            Class180.method1601(i, i_18_, i_16_, class346_sub7_sub1, null);
                        } else if (i_21_ == 5) {
                            int i_41_ = 65;
                            Interface16 interface16 = ((Interface16) RSInterface2.method3763(i, i_18_, i_16_));
                            if (interface16 != null)
                                i_41_ = (((ObjectDefinition) (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -120, interface16.method40((byte) 95)))).anInt3042) + 1;
                            Class346_Sub7_Sub1 class346_sub7_sub1;
                            if (bool_31_) {
                                Class346_Sub7_Sub1_Sub1 class346_sub7_sub1_sub1 = (new Class346_Sub7_Sub1_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_41_ * (Node_Sub14_Sub7.anIntArray9224[i_20_]), i_41_ * Class55.anIntArray730[i_20_], i_21_, i_20_));
                                class346_sub7_sub1 = class346_sub7_sub1_sub1;
                                if (class346_sub7_sub1_sub1.method45(-28823))
                                    class346_sub7_sub1_sub1.method42(true, var_ha);
                            } else
                                class346_sub7_sub1 = (new Class346_Sub7_Sub1_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_41_ * (Node_Sub14_Sub7.anIntArray9224[i_20_]), Class55.anIntArray730[i_20_] * i_41_, i_21_, i_20_, i_17_));
                            Class180.method1601(i, i_18_, i_16_, class346_sub7_sub1, null);
                        } else if ((i_21_ ^ 0xffffffff) == -7) {
                            int i_42_ = 33;
                            Interface16 interface16 = ((Interface16) RSInterface2.method3763(i, i_18_, i_16_));
                            if (interface16 != null)
                                i_42_ = (((ObjectDefinition) (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -12, interface16.method40((byte) 80)))).anInt3042) / 2 - -1;
                            Class346_Sub7_Sub1 class346_sub7_sub1;
                            if (!bool_31_)
                                class346_sub7_sub1 = (new Class346_Sub7_Sub1_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, Class287.anIntArray3386[i_20_] * i_42_, i_42_ * Class324.anIntArray3822[i_20_], i_21_, i_20_ - -4, i_17_));
                            else {
                                Class346_Sub7_Sub1_Sub1 class346_sub7_sub1_sub1 = (new Class346_Sub7_Sub1_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, (Node_Sub14_Sub7.anIntArray9224[i_20_]) * i_42_, i_42_ * Class55.anIntArray730[i_20_], i_21_, i_20_ - -4));
                                class346_sub7_sub1 = class346_sub7_sub1_sub1;
                                if (class346_sub7_sub1_sub1.method45(-28823))
                                    class346_sub7_sub1_sub1.method42(true, var_ha);
                            }
                            Class180.method1601(i, i_18_, i_16_, class346_sub7_sub1, null);
                        } else if (i_21_ == 7) {
                            int i_43_ = 0x3 & i_20_ + 2;
                            Class346_Sub7_Sub1 class346_sub7_sub1;
                            if (bool_31_) {
                                Class346_Sub7_Sub1_Sub1 class346_sub7_sub1_sub1 = (new Class346_Sub7_Sub1_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, 0, 0, i_21_, i_43_ - -4));
                                class346_sub7_sub1 = class346_sub7_sub1_sub1;
                                if (class346_sub7_sub1_sub1.method45(-28823))
                                    class346_sub7_sub1_sub1.method42(true, var_ha);
                            } else
                                class346_sub7_sub1 = (new Class346_Sub7_Sub1_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, 0, 0, i_21_, 4 + i_43_, i_17_));
                            Class180.method1601(i, i_18_, i_16_, class346_sub7_sub1, null);
                        } else if (i_21_ == 8) {
                            int i_44_ = 2 + i_20_ & 0x3;
                            int i_45_ = 33;
                            Interface16 interface16 = ((Interface16) RSInterface2.method3763(i, i_18_, i_16_));
                            if (interface16 != null)
                                i_45_ = 1 + (((ObjectDefinition) (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -23, interface16.method40((byte) 95)))).anInt3042) / 2;
                            Class346_Sub7_Sub1 class346_sub7_sub1;
                            Class346_Sub7_Sub1 class346_sub7_sub1_46_;
                            if (bool_31_) {
                                Class346_Sub7_Sub1_Sub1 class346_sub7_sub1_sub1 = (new Class346_Sub7_Sub1_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, i_45_ * Class287.anIntArray3386[i_20_], i_45_ * Class324.anIntArray3822[i_20_], i_21_, 4 + i_20_));
                                Class346_Sub7_Sub1_Sub1 class346_sub7_sub1_sub1_47_ = (new Class346_Sub7_Sub1_Sub1(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, 0, 0, i_21_, 4 + i_44_));
                                if (class346_sub7_sub1_sub1.method45(-28823))
                                    class346_sub7_sub1_sub1.method42(true, var_ha);
                                if (class346_sub7_sub1_sub1_47_.method45(i_19_ + -28808))
                                    class346_sub7_sub1_sub1_47_.method42(true, var_ha);
                                class346_sub7_sub1 = class346_sub7_sub1_sub1;
                                class346_sub7_sub1_46_ = class346_sub7_sub1_sub1_47_;
                            } else {
                                Class346_Sub7_Sub1_Sub2 class346_sub7_sub1_sub2 = (new Class346_Sub7_Sub1_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, Class287.anIntArray3386[i_20_] * i_45_, i_45_ * Class324.anIntArray3822[i_20_], i_21_, 4 + i_20_, i_17_));
                                class346_sub7_sub1 = class346_sub7_sub1_sub2;
                                Class346_Sub7_Sub1_Sub2 class346_sub7_sub1_sub2_48_ = (new Class346_Sub7_Sub1_Sub2(var_ha, class266, i, i_15_, i_29_, i_28_, i_30_, ((Class310) this).aBoolean3604, 0, 0, i_21_, 4 + i_44_, i_17_));
                                class346_sub7_sub1_46_ = class346_sub7_sub1_sub2_48_;
                            }
                            Class180.method1601(i, i_18_, i_16_, class346_sub7_sub1, class346_sub7_sub1_46_);
                        }
                    }
                }
            }
        }
    }

    final void method3255(int i, int i_49_, ByteStream class248_sub9, int[] is, byte i_50_, ha var_ha) {
        anInt8035++;
        if (!((Class310) this).aBoolean3604) {
            if (i_50_ != -95)
                aFloatArray8039 = null;
            boolean bool = false;
            Class229 class229 = null;
            if (is != null)
                is[0] = -1;
            while ((((ByteStream) class248_sub9).offset ^ 0xffffffff) > (((ByteStream) class248_sub9).buffer.length ^ 0xffffffff)) {
                int i_51_ = class248_sub9.readUnsignedByte((byte) -115);
                if ((i_51_ ^ 0xffffffff) == -1)
                    class229 = new Class229(class248_sub9);
                else if ((i_51_ ^ 0xffffffff) == -2) {
                    int i_52_ = class248_sub9.readUnsignedByte((byte) 121);
                    if ((i_52_ ^ 0xffffffff) < -1) {
                        for (int i_53_ = 0; (i_52_ ^ 0xffffffff) < (i_53_ ^ 0xffffffff); i_53_++) {
                            Class156 class156 = new Class156(var_ha, class248_sub9, 2);
                            if ((((Class156) class156).anInt1852 ^ 0xffffffff) == -32) {
                                Class80 class80 = (Class343.aClass329_4031.method3370(109, class248_sub9.readShort(i_50_ ^ 0x5e)));
                                class156.method1374(((Class80) class80).anInt1017, (byte) -127, ((Class80) class80).anInt1010, ((Class80) class80).anInt1016, ((Class80) class80).anInt1012);
                            }
                            if (var_ha.r() > 0) {
                                Node_Sub42 class248_sub42 = (((Class156) class156).aClass248_Sub42_1853);
                                int i_54_ = (class248_sub42.method2620(113) - -(i << 2049901929));
                                int i_55_ = (class248_sub42.method2625((byte) -88) + (i_49_ << -349583575));
                                int i_56_ = i_54_ >> 1456468297;
                                int i_57_ = i_55_ >> 445579945;
                                if (i_56_ >= 0 && i_57_ >= 0 && i_56_ < ((Class310) this).anInt3597 && ((i_57_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff))) {
                                    class248_sub42.method2622(((((Class310) this).anIntArrayArrayArray3592[((Class156) class156).anInt1864][i_56_][i_57_]) + -class248_sub42.method2624(-22096)), i_55_, i_54_, -13470);
                                    Node_Sub14_Sub18.method2328(class156);
                                }
                            }
                        }
                    }
                } else if (i_51_ == 2) {
                    if (class229 == null)
                        class229 = new Class229();
                    class229.method1833(class248_sub9, (byte) -94);
                } else if (i_51_ != 128) {
                    if ((i_51_ ^ 0xffffffff) == -130) {
                        if (((Class310) this).aByteArrayArrayArray3590 == null)
                            ((Class310) this).aByteArrayArrayArray3590 = new byte[4][][];
                        bool = true;
                        for (int i_58_ = 0; i_58_ < 4; i_58_++) {
                            byte i_59_ = class248_sub9.readByte(111);
                            if (i_59_ != 0 || (((Class310) this).aByteArrayArrayArray3590[i_58_]) == null) {
                                if ((i_59_ ^ 0xffffffff) != -2) {
                                    if ((i_59_ ^ 0xffffffff) == -3) {
                                        if ((((Class310) this).aByteArrayArrayArray3590[i_58_]) == null)
                                            ((Class310) this).aByteArrayArrayArray3590[i_58_] = (new byte
                                                    [1 + (((Class310) this).anInt3597)]
                                                    [(((Class310) this).anInt3580) - -1]);
                                        if ((i_58_ ^ 0xffffffff) < -1) {
                                            int i_60_ = i;
                                            int i_61_ = i + 64;
                                            int i_62_ = i_49_;
                                            if (i_62_ < 0)
                                                i_62_ = 0;
                                            else if ((((Class310) this).anInt3580) <= i_62_)
                                                i_62_ = (((Class310) this).anInt3580);
                                            int i_63_ = 64 + i_49_;
                                            if (i_61_ >= 0) {
                                                if (((Class310) this).anInt3597 <= i_61_)
                                                    i_61_ = (((Class310) this).anInt3597);
                                            } else
                                                i_61_ = 0;
                                            if (i_60_ < 0)
                                                i_60_ = 0;
                                            else if (((((Class310) this).anInt3597) ^ 0xffffffff) >= (i_60_ ^ 0xffffffff))
                                                i_60_ = (((Class310) this).anInt3597);
                                            if (i_63_ >= 0) {
                                                if (((((Class310) this).anInt3580) ^ 0xffffffff) >= (i_63_ ^ 0xffffffff))
                                                    i_63_ = (((Class310) this).anInt3580);
                                            } else
                                                i_63_ = 0;
                                            for (/**/; ((i_61_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff)); i_60_++) {
                                                for (/**/; ((i_62_ ^ 0xffffffff) > (i_63_ ^ 0xffffffff)); i_62_++)
                                                    ((Class310) this).aByteArrayArrayArray3590[i_58_][i_60_][i_62_] = (((Class310) this).aByteArrayArrayArray3590[-1 + i_58_][i_60_][i_62_]);
                                            }
                                        }
                                    }
                                } else {
                                    if ((((Class310) this).aByteArrayArrayArray3590[i_58_]) == null)
                                        ((Class310) this).aByteArrayArrayArray3590[i_58_] = (new byte
                                                [(((Class310) this).anInt3597 - -1)]
                                                [(((Class310) this).anInt3580 + 1)]);
                                    for (int i_64_ = 0; i_64_ < 64; i_64_ += 4) {
                                        for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > -65; i_65_ += 4) {
                                            byte i_66_ = class248_sub9.readByte(104);
                                            for (int i_67_ = i_64_ - -i; ((i_67_ ^ 0xffffffff) > (4 + i + i_64_ ^ 0xffffffff)); i_67_++) {
                                                for (int i_68_ = i_49_ + i_65_; (i_68_ < i_49_ + (i_65_ - -4)); i_68_++) {
                                                    if (i_67_ >= 0 && (((Class310) this).anInt3597) > i_67_ && (i_68_ ^ 0xffffffff) <= -1 && ((i_68_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)))
                                                        ((Class310) this).aByteArrayArrayArray3590[i_58_][i_67_][i_68_] = i_66_;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int i_69_ = i;
                                int i_70_ = i - -64;
                                int i_71_ = i_49_;
                                if ((i_71_ ^ 0xffffffff) > -1)
                                    i_71_ = 0;
                                else if ((i_71_ ^ 0xffffffff) <= (((Class310) this).anInt3580 ^ 0xffffffff))
                                    i_71_ = ((Class310) this).anInt3580;
                                int i_72_ = 64 + i_49_;
                                if ((i_70_ ^ 0xffffffff) > -1)
                                    i_70_ = 0;
                                else if ((i_70_ ^ 0xffffffff) <= (((Class310) this).anInt3597 ^ 0xffffffff))
                                    i_70_ = ((Class310) this).anInt3597;
                                if ((i_69_ ^ 0xffffffff) <= -1) {
                                    if ((((Class310) this).anInt3597 ^ 0xffffffff) >= (i_69_ ^ 0xffffffff))
                                        i_69_ = ((Class310) this).anInt3597;
                                } else
                                    i_69_ = 0;
                                if (i_72_ >= 0) {
                                    if (((Class310) this).anInt3580 <= i_72_)
                                        i_72_ = ((Class310) this).anInt3580;
                                } else
                                    i_72_ = 0;
                                for (/**/; ((i_69_ ^ 0xffffffff) > (i_70_ ^ 0xffffffff)); i_69_++) {
                                    for (/**/; ((i_71_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff)); i_71_++)
                                        ((Class310) this).aByteArrayArrayArray3590[i_58_][i_69_][i_71_] = (byte) 0;
                                }
                            }
                        }
                    } else
                        throw new IllegalStateException("");
                } else if (is != null) {
                    is[0] = class248_sub9.readShort(-1);
                    is[1] = class248_sub9.readUnsignedShort((byte) -10);
                    is[2] = class248_sub9.readUnsignedShort((byte) -10);
                    is[3] = class248_sub9.readUnsignedShort((byte) -10);
                    is[4] = class248_sub9.readShort(-1);
                } else
                    ((ByteStream) class248_sub9).offset += 10;
            }
            if (class229 != null) {
                for (int i_73_ = 0; i_73_ < 8; i_73_++) {
                    for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > -9; i_74_++) {
                        int i_75_ = i_73_ + (i >> -285853693);
                        int i_76_ = (i_49_ >> 1309541539) - -i_74_;
                        if (i_75_ >= 0 && (((Class310) this).anInt3597 >> -815385661 > i_75_) && i_76_ >= 0 && ((i_76_ ^ 0xffffffff) > (((Class310) this).anInt3580 >> 1249521123 ^ 0xffffffff)))
                            Class81_Sub1.method588(i_75_, class229, 4, i_76_);
                    }
                }
            }
            if (!bool && ((Class310) this).aByteArrayArrayArray3590 != null) {
                for (int i_77_ = 0; (i_77_ ^ 0xffffffff) > -5; i_77_++) {
                    if (((Class310) this).aByteArrayArrayArray3590[i_77_] != null) {
                        for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > -17; i_78_++) {
                            for (int i_79_ = 0; i_79_ < 16; i_79_++) {
                                int i_80_ = i_78_ + (i >> 5868706);
                                int i_81_ = i_79_ + (i_49_ >> 586807458);
                                if (i_80_ >= 0 && i_80_ < 26 && i_81_ >= 0 && (i_81_ ^ 0xffffffff) > -27)
                                    ((Class310) this).aByteArrayArrayArray3590[i_77_][i_80_][i_81_] = (byte) 0;
                            }
                        }
                    }
                }
            }
        }
    }

    final void method3256(int i, int i_82_, int i_83_, int i_84_, Class164 class164, int i_85_, ha var_ha) {
        if (i_82_ <= -15) {
            anInt8032++;
            Interface16 interface16 = method3259(false, i_84_, i_85_, i, i_83_);
            do {
                if (interface16 != null) {
                    ObjectDefinition class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -45, interface16.method40((byte) 75)));
                    int i_86_ = interface16.method46((byte) -117);
                    int i_87_ = interface16.method43((byte) -111);
                    if (class266.method2792(-1))
                        Class25.method240(class266, i_83_, i_85_, i_84_, 24);
                    if (interface16.method45(-28823))
                        interface16.method41(6120, var_ha);
                    if ((i ^ 0xffffffff) != -1) {
                        if (i == 1)
                            Node_Sub8_Sub7.method2068(i_83_, i_84_, i_85_);
                        else {
                            if (i != 2) {
                                if ((i ^ 0xffffffff) == -4) {
                                    Class351.method3745(i_83_, i_84_, i_85_);
                                    if ((((ObjectDefinition) class266).anInt3093 ^ 0xffffffff) == -2)
                                        class164.method1526(-110, i_84_, i_85_);
                                }
                            } else {
                                Node_Sub8_Sub6.method2055(i_83_, i_84_, i_85_, (aClass8043 != null ? aClass8043 : (aClass8043 = method3263("Interface16"))));
                                if (((ObjectDefinition) class266).anInt3093 != 0 && (((((ObjectDefinition) class266).anInt3097 + i_84_) ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff)) && (((i_85_ - -((ObjectDefinition) class266).anInt3097) ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)) && ((((Class310) this).anInt3597 ^ 0xffffffff) < ((((ObjectDefinition) class266).anInt3065 + i_84_) ^ 0xffffffff)) && (((((ObjectDefinition) class266).anInt3065 + i_85_) ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)))
                                    class164.method1528(((ObjectDefinition) class266).anInt3065, i_85_, i_87_, ((ObjectDefinition) class266).aBoolean3111, i_84_, !((ObjectDefinition) class266).aBoolean3082, ((ObjectDefinition) class266).anInt3097, -127);
                                if (i_86_ != 9)
                                    break;
                                if ((i_87_ & 0x1) == 0)
                                    Node_Sub8_Sub12.method2091(i_83_, i_85_, (byte) 124, i_84_, 8);
                                else
                                    Node_Sub8_Sub12.method2091(i_83_, i_85_, (byte) 58, i_84_, 16);
                            }
                            break;
                        }
                        break;
                    }
                    Class183.method1613(i_83_, i_84_, i_85_);
                    if ((((ObjectDefinition) class266).anInt3093 ^ 0xffffffff) != -1)
                        class164.method1519(i_87_, i_85_, (byte) -117, i_86_, !(((ObjectDefinition) class266).aBoolean3082), i_84_, (((ObjectDefinition) class266).aBoolean3111));
                    if (((ObjectDefinition) class266).anInt3068 == 1) {
                        if ((i_87_ ^ 0xffffffff) == -1) {
                            Node_Sub8_Sub12.method2091(i_83_, i_85_, (byte) 97, i_84_, 1);
                            break;
                        }
                        if (i_87_ == 1) {
                            Node_Sub8_Sub12.method2091(i_83_, i_85_ - -1, (byte) 100, i_84_, 2);
                            break;
                        }
                        if ((i_87_ ^ 0xffffffff) == -3) {
                            Node_Sub8_Sub12.method2091(i_83_, i_85_, (byte) 55, i_84_ + 1, 1);
                            break;
                        }
                        if ((i_87_ ^ 0xffffffff) == -4)
                            Node_Sub8_Sub12.method2091(i_83_, i_85_, (byte) 121, i_84_, 2);
                    }
                }
            } while (false);
        }
    }

    static final void method3257(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
        anInt8031++;
        if (!Class346_Sub7_Sub5_Sub2.method3699(i_88_, (byte) -22)) {
            if ((i_94_ ^ 0xffffffff) == 0) {
                for (int i_96_ = 0; (i_96_ ^ 0xffffffff) > -101; i_96_++)
                    Class359.aBooleanArray4435[i_96_] = true;
            } else
                Class359.aBooleanArray4435[i_94_] = true;
        } else {
            int i_97_ = 0;
            int i_98_ = 0;
            int i_99_ = 0;
            if (i_90_ != 50)
                method3253(58);
            int i_100_ = 0;
            int i_101_ = 0;
            if (Node_Sub8_Sub6.aBoolean8949) {
                i_98_ = Node_Sub15_Sub5.anInt9719;
                i_99_ = s_Sub3.anInt8006;
                i_101_ = Class229.anInt2590;
                i_97_ = Class173.anInt2015;
                i_100_ = Class346_Sub5_Sub2.anInt9893;
                Class229.anInt2590 = 1;
            }
            if (Node_Sub46.aClass354ArrayArray7379[i_88_] == null)
                Class225.method1787(i_95_, i, i_89_, i_91_, i_94_ < 0, (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_88_]), 126, -1, i_93_, i_94_, i_92_);
            else
                Class225.method1787(i_95_, i, i_89_, i_91_, (i_94_ ^ 0xffffffff) > -1, (Node_Sub46.aClass354ArrayArray7379[i_88_]), 126, -1, i_93_, i_94_, i_92_);
            if (Node_Sub8_Sub6.aBoolean8949) {
                if (i_94_ >= 0 && Class229.anInt2590 == 2)
                    Class210.method1724(s_Sub3.anInt8006, Class173.anInt2015, (byte) -100, Class346_Sub5_Sub2.anInt9893, Node_Sub15_Sub5.anInt9719);
                Node_Sub15_Sub5.anInt9719 = i_98_;
                Class346_Sub5_Sub2.anInt9893 = i_100_;
                Class173.anInt2015 = i_97_;
                Class229.anInt2590 = i_101_;
                s_Sub3.anInt8006 = i_99_;
            }
        }
    }

    Class310_Sub1(int i, int i_102_, int i_103_, boolean bool) {
        super(i, i_102_, i_103_, bool, Class226_Sub1.aClass144_6662, Class129_Sub1.aClass192_8517);
    }

    final void method3258(byte i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, ByteStream class248_sub9, int i_109_, ha var_ha, int[] is, int i_110_) {
        anInt8033++;
        if (!((Class310) this).aBoolean3604) {
            if (i > -84)
                aFloatArray8039 = null;
            boolean bool = false;
            Class229 class229 = null;
            if (is != null)
                is[0] = -1;
            int i_111_ = (i_105_ & 0x7) * 8;
            int i_112_ = (i_104_ & 0x7) * 8;
            while (((ByteStream) class248_sub9).offset < ((ByteStream) class248_sub9).buffer.length) {
                int i_113_ = class248_sub9.readUnsignedByte((byte) -96);
                if (i_113_ != 0) {
                    if ((i_113_ ^ 0xffffffff) == -2) {
                        int i_114_ = class248_sub9.readUnsignedByte((byte) -26);
                        if ((i_114_ ^ 0xffffffff) < -1) {
                            for (int i_115_ = 0; i_115_ < i_114_; i_115_++) {
                                Class156 class156 = new Class156(var_ha, class248_sub9, 2);
                                if ((((Class156) class156).anInt1852 ^ 0xffffffff) == -32) {
                                    Class80 class80 = (Class343.aClass329_4031.method3370(88, class248_sub9.readShort(-1)));
                                    class156.method1374(((Class80) class80).anInt1017, (byte) -127, ((Class80) class80).anInt1010, ((Class80) class80).anInt1016, ((Class80) class80).anInt1012);
                                }
                                if (var_ha.r() > 0) {
                                    Node_Sub42 class248_sub42 = (((Class156) class156).aClass248_Sub42_1853);
                                    int i_116_ = (class248_sub42.method2620(116) >> -2066346039);
                                    int i_117_ = (class248_sub42.method2625((byte) -79) >> 474797641);
                                    if ((((Class156) class156).anInt1864 ^ 0xffffffff) == (i_106_ ^ 0xffffffff) && ((i_116_ ^ 0xffffffff) <= (i_111_ ^ 0xffffffff)) && ((i_111_ + 8 ^ 0xffffffff) < (i_116_ ^ 0xffffffff)) && i_112_ <= i_117_ && i_112_ - -8 > i_117_) {
                                        int i_118_ = ((i_108_ << -1208096023) + (Class245.method1955((class248_sub42.method2625((byte) -70) & 0xfff), (class248_sub42.method2620(104) & 0xfff), i_109_, (byte) 123)));
                                        i_116_ = i_118_ >> -443668567;
                                        int i_119_ = ((i_107_ << 640352009) - -(Class340.method3434(0xfff & (class248_sub42.method2625((byte) -72)), i_109_, 4095, (class248_sub42.method2620(122) & 0xfff))));
                                        i_117_ = i_119_ >> 697634793;
                                        if ((i_116_ ^ 0xffffffff) <= -1 && (i_117_ ^ 0xffffffff) <= -1 && (((Class310) this).anInt3597 > i_116_) && i_117_ < (((Class310) this).anInt3580)) {
                                            class248_sub42.method2622(((((Class310) this).anIntArrayArrayArray3592[i_106_][i_116_][i_117_]) + -class248_sub42.method2624(-22096)), i_119_, i_118_, -13470);
                                            Node_Sub14_Sub18.method2328(class156);
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i_113_ ^ 0xffffffff) == -3) {
                        if (class229 == null)
                            class229 = new Class229();
                        class229.method1833(class248_sub9, (byte) -56);
                    } else if (i_113_ == 128) {
                        if (is == null)
                            ((ByteStream) class248_sub9).offset += 10;
                        else {
                            is[0] = class248_sub9.readShort(-1);
                            is[1] = class248_sub9.readUnsignedShort((byte) -10);
                            is[2] = class248_sub9.readUnsignedShort((byte) -10);
                            is[3] = class248_sub9.readUnsignedShort((byte) -10);
                            is[4] = class248_sub9.readShort(-1);
                        }
                    } else if ((i_113_ ^ 0xffffffff) == -130) {
                        if (((Class310) this).aByteArrayArrayArray3590 == null)
                            ((Class310) this).aByteArrayArrayArray3590 = new byte[4][][];
                        for (int i_120_ = 0; i_120_ < 4; i_120_++) {
                            byte i_121_ = class248_sub9.readByte(104);
                            if ((i_121_ ^ 0xffffffff) == -1 && (((Class310) this).aByteArrayArrayArray3590[i_110_]) != null) {
                                if (i_106_ >= i_120_) {
                                    int i_122_ = i_108_;
                                    int i_123_ = 7 + i_108_;
                                    int i_124_ = i_107_;
                                    int i_125_ = 7 + i_107_;
                                    if (i_124_ >= 0) {
                                        if ((i_124_ ^ 0xffffffff) <= (((Class310) this).anInt3580 ^ 0xffffffff))
                                            i_124_ = ((Class310) this).anInt3580;
                                    } else
                                        i_124_ = 0;
                                    if ((i_122_ ^ 0xffffffff) > -1)
                                        i_122_ = 0;
                                    else if ((((Class310) this).anInt3597 ^ 0xffffffff) >= (i_122_ ^ 0xffffffff))
                                        i_122_ = ((Class310) this).anInt3597;
                                    if (i_123_ >= 0) {
                                        if (((Class310) this).anInt3597 <= i_123_)
                                            i_123_ = ((Class310) this).anInt3597;
                                    } else
                                        i_123_ = 0;
                                    if (i_125_ < 0)
                                        i_125_ = 0;
                                    else if ((i_125_ ^ 0xffffffff) <= (((Class310) this).anInt3580 ^ 0xffffffff))
                                        i_125_ = ((Class310) this).anInt3580;
                                    for (/**/; ((i_123_ ^ 0xffffffff) < (i_122_ ^ 0xffffffff)); i_122_++) {
                                        for (/**/; ((i_124_ ^ 0xffffffff) > (i_125_ ^ 0xffffffff)); i_124_++)
                                            ((Class310) this).aByteArrayArrayArray3590[i_110_][i_122_][i_124_] = (byte) 0;
                                    }
                                }
                            } else if (i_121_ == 1) {
                                if ((((Class310) this).aByteArrayArrayArray3590[i_110_]) == null)
                                    ((Class310) this).aByteArrayArrayArray3590[i_110_] = (new byte
                                            [((Class310) this).anInt3597 + 1]
                                            [1 + ((Class310) this).anInt3580]);
                                for (int i_126_ = 0; i_126_ < 64; i_126_ += 4) {
                                    for (int i_127_ = 0; i_127_ < 64; i_127_ += 4) {
                                        byte i_128_ = class248_sub9.readByte(78);
                                        if (i_120_ <= i_106_) {
                                            for (int i_129_ = i_126_; ((i_126_ - -4 ^ 0xffffffff) < (i_129_ ^ 0xffffffff)); i_129_++) {
                                                for (int i_130_ = i_127_; ((4 + i_127_ ^ 0xffffffff) < (i_130_ ^ 0xffffffff)); i_130_++) {
                                                    if (i_129_ >= i_111_ && ((8 + i_111_ ^ 0xffffffff) < (i_129_ ^ 0xffffffff)) && i_130_ >= i_112_ && (i_112_ < i_112_ + 8)) {
                                                        int i_131_ = (i_108_ - -(Node_Sub14_Sub8.method2296(i_109_, (0x7 & i_130_), (0x7 & i_129_), 30141)));
                                                        int i_132_ = (i_107_ - -(Class349_Sub1.method3736((0x7 & i_130_), i_109_, (i_129_ & 0x7), true)));
                                                        if (i_131_ >= 0 && (i_131_ < (((Class310) this).anInt3597)) && i_132_ >= 0 && ((((Class310) this).anInt3580) > i_132_))
                                                            ((Class310) this).aByteArrayArrayArray3590[i_110_][i_131_][i_132_] = i_128_;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else
                        throw new IllegalStateException("");
                } else
                    class229 = new Class229(class248_sub9);
            }
            if (class229 != null)
                Class81_Sub1.method588(i_108_ >> -1635066173, class229, 4, i_107_ >> 1135270371);
            if (!bool && ((Class310) this).aByteArrayArrayArray3590 != null && (((Class310) this).aByteArrayArrayArray3590[i_110_] != null)) {
                int i_133_ = i_108_ - -7;
                int i_134_ = 7 + i_107_;
                for (int i_135_ = i_108_; (i_135_ ^ 0xffffffff) > (i_133_ ^ 0xffffffff); i_135_++) {
                    for (int i_136_ = i_107_; i_134_ > i_136_; i_136_++)
                        ((Class310) this).aByteArrayArrayArray3590[i_110_][i_135_][i_136_] = (byte) 0;
                }
            }
        }
    }

    final Interface16 method3259(boolean bool, int i, int i_137_, int i_138_, int i_139_) {
        anInt8042++;
        Interface16 interface16 = null;
        if ((i_138_ ^ 0xffffffff) == -1)
            interface16 = (Interface16) RSInterface2.method3763(i_139_, i, i_137_);
        if ((i_138_ ^ 0xffffffff) == -2)
            interface16 = (Interface16) Node_Sub19.method2517(i_139_, i, i_137_);
        if (bool != false)
            aFloatArray8039 = null;
        if ((i_138_ ^ 0xffffffff) == -3)
            interface16 = ((Interface16) aa.method154(i_139_, i, i_137_, (aClass8043 != null ? aClass8043 : (aClass8043 = method3263("Interface16")))));
        if (i_138_ == 3)
            interface16 = (Interface16) Class346_Sub7_Sub1.method3584(i_139_, i, i_137_);
        return interface16;
    }

    final void method3260(ha var_ha, int i, int i_140_, byte[] is, int i_141_, Class164[] class164s, int i_142_, int i_143_, byte i_144_, int i_145_, int i_146_) {
        anInt8034++;
        ByteStream class248_sub9 = new ByteStream(is);
        if (i_144_ > -104)
            method3262(null, null, -65, null, -38, -24);
        int i_147_ = -1;
        for (; ; ) {
            int i_148_ = class248_sub9.method2191(-121);
            if ((i_148_ ^ 0xffffffff) == -1)
                break;
            i_147_ += i_148_;
            int i_149_ = 0;
            for (; ; ) {
                int i_150_ = class248_sub9.readSmart((byte) 22);
                if (i_150_ == 0)
                    break;
                i_149_ += i_150_ + -1;
                int i_151_ = i_149_ & 0x3f;
                int i_152_ = (i_149_ & 0xff3) >> -434008378;
                int i_153_ = i_149_ >> 734428652;
                int i_154_ = class248_sub9.readUnsignedByte((byte) -53);
                int i_155_ = i_154_ >> 1501864930;
                int i_156_ = 0x3 & i_154_;
                if ((i_153_ ^ 0xffffffff) == (i ^ 0xffffffff) && i_152_ >= i_143_ && i_152_ < i_143_ + 8 && i_151_ >= i_140_ && (i_151_ ^ 0xffffffff) > (i_140_ + 8 ^ 0xffffffff)) {
                    ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -16, i_147_);
                    int i_157_ = (Class305.method3210(i_151_ & 0x7, ((ObjectDefinition) class266).anInt3065, (byte) 54, i_152_ & 0x7, i_145_, i_156_, ((ObjectDefinition) class266).anInt3097) + i_141_);
                    int i_158_ = (r_Sub1.method2112(((ObjectDefinition) class266).anInt3097, i_145_, i_156_, 0x7 & i_151_, ((ObjectDefinition) class266).anInt3065, -2, 0x7 & i_152_) + i_142_);
                    if ((i_157_ ^ 0xffffffff) < -1 && i_158_ > 0 && ((i_157_ ^ 0xffffffff) > (((Class310) this).anInt3597 - 1 ^ 0xffffffff)) && i_158_ < ((Class310) this).anInt3580 + -1) {
                        Class164 class164 = null;
                        if (!((Class310) this).aBoolean3604) {
                            int i_159_ = i_146_;
                            if ((r.aByteArrayArrayArray9033[1][i_157_][i_158_] & 0x2) == 2)
                                i_159_--;
                            if (i_159_ >= 0)
                                class164 = class164s[i_159_];
                        }
                        method3254(i_146_, i_147_, i_146_, i_158_, -1, i_157_, (byte) -15, i_156_ - -i_145_ & 0x3, i_155_, var_ha, class164);
                    }
                }
            }
        }
    }

    static final boolean method3261(String string, int i) {
        anInt8036++;
        if (string == null)
            return false;
        if (i < 113)
            method3253(-91);
        for (int i_160_ = 0; i_160_ < client.anInt5226; i_160_++) {
            if (string.equalsIgnoreCase(Class282_Sub11.aStringArray7703[i_160_]))
                return true;
        }
        if (string.equalsIgnoreCase(((Player) (Class347.myPlayer)).aString10550))
            return true;
        return false;
    }

    final void method3262(Class164[] class164s, ha var_ha, int i, byte[] is, int i_161_, int i_162_) {
        anInt8038++;
        if (i > 36) {
            ByteStream class248_sub9 = new ByteStream(is);
            int i_163_ = -1;
            for (; ; ) {
                int i_164_ = class248_sub9.method2191(12);
                if (i_164_ == 0)
                    break;
                i_163_ += i_164_;
                int i_165_ = 0;
                for (; ; ) {
                    int i_166_ = class248_sub9.readSmart((byte) 22);
                    if (i_166_ == 0)
                        break;
                    i_165_ += i_166_ + -1;
                    int i_167_ = 0x3f & i_165_;
                    int i_168_ = (i_165_ & 0xfc9) >> -260672058;
                    int i_169_ = i_165_ >> -1472027956;
                    int i_170_ = class248_sub9.readUnsignedByte((byte) 83);
                    int i_171_ = i_170_ >> -2124779294;
                    int i_172_ = i_170_ & 0x3;
                    int i_173_ = i_168_ + i_162_;
                    int i_174_ = i_161_ + i_167_;
                    if (i_173_ > 0 && (i_174_ ^ 0xffffffff) < -1 && ((Class310) this).anInt3597 - 1 > i_173_ && ((((Class310) this).anInt3580 + -1 ^ 0xffffffff) < (i_174_ ^ 0xffffffff))) {
                        Class164 class164 = null;
                        if (!((Class310) this).aBoolean3604) {
                            int i_175_ = i_169_;
                            if ((0x2 & (r.aByteArrayArrayArray9033[1][i_173_][i_174_])) == 2)
                                i_175_--;
                            if ((i_175_ ^ 0xffffffff) <= -1)
                                class164 = class164s[i_175_];
                        }
                        method3254(i_169_, i_163_, i_169_, i_174_, -1, i_173_, (byte) -15, i_172_, i_171_, var_ha, class164);
                    }
                }
            }
        }
    }

    /*synthetic*/
    static Class method3263(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
