/* Class248_Sub14_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub20 extends Node_Sub14 {
    static IncommingOpcode aIncommingOpcode_9365;
    static int anInt9366;
    static int anInt9367;
    static int anInt9368;
    static int anInt9369;
    static int[] anIntArray9370 = new int[500];
    private int anInt9371 = 6;
    static int anInt9372;
    static float aFloat9373;
    static OutgoingOpcode aOutgoingOpcode_9374;
    static boolean aBoolean9375;

    static final Class161 method2337(boolean bool) {
        anInt9369++;
        try {
            if (bool != false)
                method2339(2);
            return (Class161) Class.forName("Class161_Sub2").newInstance();
        } catch (Throwable throwable) {
            return new Class161_Sub1();
        }
    }

    final int[] method2264(byte i, int i_0_) {
        anInt9366++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (i != -40)
            aFloat9373 = -0.18052602F;
        while_155_:
        do {
            if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
                int[] is_1_ = this.method2265((byte) 64, i_0_, 0);
                int[] is_2_ = this.method2265((byte) 64, i_0_, 1);
                int i_3_ = anInt9371;
                while_154_:
                do {
                    while_153_:
                    do {
                        while_152_:
                        do {
                            while_151_:
                            do {
                                while_150_:
                                do {
                                    while_149_:
                                    do {
                                        while_148_:
                                        do {
                                            while_147_:
                                            do {
                                                while_146_:
                                                do {
                                                    do {
                                                        if (i_3_ != 1) {
                                                            if (i_3_ != 2) {
                                                                if ((i_3_ ^ 0xffffffff) != -4) {
                                                                    if ((i_3_ ^ 0xffffffff) != -5) {
                                                                        if ((i_3_ ^ 0xffffffff) != -6) {
                                                                            if (i_3_ != 6) {
                                                                                if (i_3_ != 7) {
                                                                                    if ((i_3_ ^ 0xffffffff) != -9) {
                                                                                        if (i_3_ != 9) {
                                                                                            if ((i_3_ ^ 0xffffffff) != -11) {
                                                                                                if ((i_3_ ^ 0xffffffff) != -12) {
                                                                                                    if (i_3_ != 12)
                                                                                                        break while_155_;
                                                                                                } else
                                                                                                    break while_153_;
                                                                                                break while_154_;
                                                                                            }
                                                                                        } else
                                                                                            break while_151_;
                                                                                        break while_152_;
                                                                                    }
                                                                                } else
                                                                                    break while_149_;
                                                                                break while_150_;
                                                                            }
                                                                        } else
                                                                            break while_147_;
                                                                        break while_148_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_146_;
                                                            }
                                                        } else {
                                                            for (i_3_ = 0; (i_3_ < (Class185.anInt2164)); i_3_++)
                                                                is[i_3_] = ((is_2_[i_3_]) + (is_1_[i_3_]));
                                                            break while_155_;
                                                        }
                                                        for (i_3_ = 0; (i_3_ < (Class185.anInt2164)); i_3_++)
                                                            is[i_3_] = (-is_2_[i_3_] + (is_1_[i_3_]));
                                                        break while_155_;
                                                    } while (false);
                                                    for (i_3_ = 0; (Class185.anInt2164 > i_3_); i_3_++)
                                                        is[i_3_] = ((is_1_[i_3_] * is_2_[i_3_]) >> -1566763060);
                                                    break while_155_;
                                                } while (false);
                                                for (i_3_ = 0; ((Class185.anInt2164 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
                                                    int i_4_ = is_2_[i_3_];
                                                    is[i_3_] = (i_4_ != 0 ? ((is_1_[i_3_] << -1381018228) / i_4_) : 4096);
                                                }
                                                break while_155_;
                                            } while (false);
                                            for (i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff)); i_3_++)
                                                is[i_3_] = 4096 + -(((-is_2_[i_3_] + 4096) * (-is_1_[i_3_] + 4096)) >> -1880444660);
                                            break while_155_;
                                        } while (false);
                                        for (i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff)); i_3_++) {
                                            int i_5_ = is_2_[i_3_];
                                            is[i_3_] = (i_5_ < 2048 ? (is_1_[i_3_] * i_5_ >> -819805077) : (4096 + -(((4096 - is_1_[i_3_]) * (-i_5_ + 4096)) >> 240875947)));
                                        }
                                        break while_155_;
                                    } while (false);
                                    for (i_3_ = 0; Class185.anInt2164 > i_3_; i_3_++) {
                                        int i_6_ = is_1_[i_3_];
                                        is[i_3_] = ((i_6_ ^ 0xffffffff) == -4097 ? 4096 : ((is_2_[i_3_] << -158024596) / (-i_6_ + 4096)));
                                    }
                                    break while_155_;
                                } while (false);
                                for (i_3_ = 0; ((Class185.anInt2164 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
                                    int i_7_ = is_1_[i_3_];
                                    is[i_3_] = ((i_7_ ^ 0xffffffff) != -1 ? 4096 - (4096 + -is_2_[i_3_] << -1825987764) / i_7_ : 0);
                                }
                                break while_155_;
                            } while (false);
                            for (i_3_ = 0; Class185.anInt2164 > i_3_; i_3_++) {
                                int i_8_ = is_1_[i_3_];
                                int i_9_ = is_2_[i_3_];
                                is[i_3_] = ((i_9_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff) ? i_8_ : i_9_);
                            }
                            break while_155_;
                        } while (false);
                        for (i_3_ = 0; i_3_ < Class185.anInt2164; i_3_++) {
                            int i_10_ = is_2_[i_3_];
                            int i_11_ = is_1_[i_3_];
                            is[i_3_] = ((i_11_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff) ? i_10_ : i_11_);
                        }
                        break while_155_;
                    } while (false);
                    for (i_3_ = 0; i_3_ < Class185.anInt2164; i_3_++) {
                        int i_12_ = is_1_[i_3_];
                        int i_13_ = is_2_[i_3_];
                        is[i_3_] = i_13_ >= i_12_ ? -i_12_ + i_13_ : -i_13_ + i_12_;
                    }
                    break while_155_;
                } while (false);
                for (i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_3_++) {
                    int i_14_ = is_2_[i_3_];
                    int i_15_ = is_1_[i_3_];
                    is[i_3_] = i_14_ + i_15_ - (i_14_ * i_15_ >> -1524599253);
                }
            }
        } while (false);
        return is;
    }

    public Node_Sub14_Sub20() {
        super(2, false);
    }

    static final void method2338(byte i) {
        anInt9367++;
        if (!Class162_Sub2.aBoolean6483) {
            Class325.aFloat3829 += (-12.0F - Class325.aFloat3829) / 2.0F;
            Class162_Sub2.aBoolean6483 = true;
            int i_16_ = -76 / ((i - 73) / 35);
            Class207.aBoolean2398 = true;
        }
    }

    public static void method2339(int i) {
        if (i == 4096) {
            aOutgoingOpcode_9374 = null;
            anIntArray9370 = null;
            aIncommingOpcode_9365 = null;
        }
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9368++;
        if (bool != true)
            aOutgoingOpcode_9374 = null;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        while_165_:
        do {
            if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
                int[][] is_17_ = this.method2267(i, 0, 65535);
                int[][] is_18_ = this.method2267(i, 1, 65535);
                int[] is_19_ = is[0];
                int[] is_20_ = is[1];
                int[] is_21_ = is[2];
                int[] is_22_ = is_17_[0];
                int[] is_23_ = is_17_[1];
                int[] is_24_ = is_17_[2];
                int[] is_25_ = is_18_[0];
                int[] is_26_ = is_18_[1];
                int[] is_27_ = is_18_[2];
                int i_28_ = anInt9371;
                while_164_:
                do {
                    while_163_:
                    do {
                        while_162_:
                        do {
                            while_161_:
                            do {
                                while_160_:
                                do {
                                    while_159_:
                                    do {
                                        while_158_:
                                        do {
                                            while_157_:
                                            do {
                                                while_156_:
                                                do {
                                                    do {
                                                        if ((i_28_ ^ 0xffffffff) != -2) {
                                                            if (i_28_ != 2) {
                                                                if ((i_28_ ^ 0xffffffff) != -4) {
                                                                    if ((i_28_ ^ 0xffffffff) != -5) {
                                                                        if ((i_28_ ^ 0xffffffff) != -6) {
                                                                            if (i_28_ != 6) {
                                                                                if ((i_28_ ^ 0xffffffff) != -8) {
                                                                                    if (i_28_ != 8) {
                                                                                        if ((i_28_ ^ 0xffffffff) != -10) {
                                                                                            if ((i_28_ ^ 0xffffffff) != -11) {
                                                                                                if (i_28_ != 11) {
                                                                                                    if ((i_28_ ^ 0xffffffff) != -13)
                                                                                                        break while_165_;
                                                                                                } else
                                                                                                    break while_163_;
                                                                                                break while_164_;
                                                                                            }
                                                                                        } else
                                                                                            break while_161_;
                                                                                        break while_162_;
                                                                                    }
                                                                                } else
                                                                                    break while_159_;
                                                                                break while_160_;
                                                                            }
                                                                        } else
                                                                            break while_157_;
                                                                        break while_158_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_156_;
                                                            }
                                                        } else {
                                                            for (i_28_ = 0; ((Class185.anInt2164) > i_28_); i_28_++) {
                                                                is_19_[i_28_] = ((is_25_[i_28_]) + (is_22_[i_28_]));
                                                                is_20_[i_28_] = ((is_23_[i_28_]) - -(is_26_[i_28_]));
                                                                is_21_[i_28_] = ((is_24_[i_28_]) + (is_27_[i_28_]));
                                                            }
                                                            break while_165_;
                                                        }
                                                        for (i_28_ = 0; ((i_28_ ^ 0xffffffff) > ((Class185.anInt2164) ^ 0xffffffff)); i_28_++) {
                                                            is_19_[i_28_] = (-(is_25_[i_28_]) + (is_22_[i_28_]));
                                                            is_20_[i_28_] = (-(is_26_[i_28_]) + (is_23_[i_28_]));
                                                            is_21_[i_28_] = (-(is_27_[i_28_]) + (is_24_[i_28_]));
                                                        }
                                                        break while_165_;
                                                    } while (false);
                                                    for (i_28_ = 0; i_28_ < (Class185.anInt2164); i_28_++) {
                                                        is_19_[i_28_] = ((is_22_[i_28_] * (is_25_[i_28_])) >> -876067732);
                                                        is_20_[i_28_] = ((is_26_[i_28_] * (is_23_[i_28_])) >> 995207436);
                                                        is_21_[i_28_] = ((is_24_[i_28_] * (is_27_[i_28_])) >> -1800679028);
                                                    }
                                                    break while_165_;
                                                } while (false);
                                                for (i_28_ = 0; (Class185.anInt2164 > i_28_); i_28_++) {
                                                    int i_29_ = is_26_[i_28_];
                                                    int i_30_ = is_25_[i_28_];
                                                    int i_31_ = is_27_[i_28_];
                                                    is_19_[i_28_] = ((i_30_ ^ 0xffffffff) != -1 ? ((is_22_[i_28_] << 1132296492) / i_30_) : 4096);
                                                    is_20_[i_28_] = ((i_29_ ^ 0xffffffff) == -1 ? 4096 : ((is_23_[i_28_] << -15878644) / i_29_));
                                                    is_21_[i_28_] = (i_31_ == 0 ? 4096 : ((is_24_[i_28_] << 1433871724) / i_31_));
                                                }
                                                break while_165_;
                                            } while (false);
                                            for (i_28_ = 0; ((Class185.anInt2164 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
                                                is_19_[i_28_] = -(((4096 - is_25_[i_28_]) * (-is_22_[i_28_] + 4096)) >> 1852717196) + 4096;
                                                is_20_[i_28_] = (4096 + -(((-is_26_[i_28_] + 4096) * (-is_23_[i_28_] + 4096)) >> -1959314900));
                                                is_21_[i_28_] = -(((4096 - is_24_[i_28_]) * (-is_27_[i_28_] + 4096)) >> -1312726068) + 4096;
                                            }
                                            break while_165_;
                                        } while (false);
                                        for (i_28_ = 0; Class185.anInt2164 > i_28_; i_28_++) {
                                            int i_32_ = is_25_[i_28_];
                                            int i_33_ = is_26_[i_28_];
                                            int i_34_ = is_27_[i_28_];
                                            is_19_[i_28_] = ((i_32_ ^ 0xffffffff) > -2049 ? (is_22_[i_28_] * i_32_ >> 333705003) : 4096 + -(((-is_22_[i_28_] + 4096) * (4096 - i_32_)) >> -400697909));
                                            is_20_[i_28_] = ((i_33_ ^ 0xffffffff) > -2049 ? (i_33_ * is_23_[i_28_] >> -1653727637) : (4096 + -(((4096 - is_23_[i_28_]) * (-i_33_ + 4096)) >> 1435129419)));
                                            is_21_[i_28_] = ((i_34_ ^ 0xffffffff) > -2049 ? (is_24_[i_28_] * i_34_ >> -1935531989) : -(((-i_34_ + 4096) * (-is_24_[i_28_] + 4096)) >> 2071633323) + 4096);
                                        }
                                        break while_165_;
                                    } while (false);
                                    for (i_28_ = 0; i_28_ < Class185.anInt2164; i_28_++) {
                                        int i_35_ = is_24_[i_28_];
                                        int i_36_ = is_23_[i_28_];
                                        int i_37_ = is_22_[i_28_];
                                        is_19_[i_28_] = (i_37_ == 4096 ? 4096 : ((is_25_[i_28_] << -1125698580) / (4096 - i_37_)));
                                        is_20_[i_28_] = (i_36_ != 4096 ? ((is_26_[i_28_] << -237884916) / (4096 + -i_36_)) : 4096);
                                        is_21_[i_28_] = ((i_35_ ^ 0xffffffff) != -4097 ? ((is_27_[i_28_] << -238375188) / (4096 - i_35_)) : 4096);
                                    }
                                    break while_165_;
                                } while (false);
                                for (i_28_ = 0; i_28_ < Class185.anInt2164; i_28_++) {
                                    int i_38_ = is_23_[i_28_];
                                    int i_39_ = is_24_[i_28_];
                                    int i_40_ = is_22_[i_28_];
                                    is_19_[i_28_] = (i_40_ == 0 ? 0 : 4096 + -((4096 - is_25_[i_28_] << -1630045428) / i_40_));
                                    is_20_[i_28_] = ((i_38_ ^ 0xffffffff) != -1 ? -((4096 - is_26_[i_28_] << 1730447276) / i_38_) + 4096 : 0);
                                    is_21_[i_28_] = (i_39_ == 0 ? 0 : 4096 + -((4096 + -is_27_[i_28_] << -1965423764) / i_39_));
                                }
                                break while_165_;
                            } while (false);
                            for (i_28_ = 0; ((i_28_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff)); i_28_++) {
                                int i_41_ = is_23_[i_28_];
                                int i_42_ = is_27_[i_28_];
                                int i_43_ = is_26_[i_28_];
                                int i_44_ = is_24_[i_28_];
                                int i_45_ = is_25_[i_28_];
                                int i_46_ = is_22_[i_28_];
                                is_19_[i_28_] = ((i_46_ ^ 0xffffffff) > (i_45_ ^ 0xffffffff) ? i_46_ : i_45_);
                                is_20_[i_28_] = i_41_ >= i_43_ ? i_43_ : i_41_;
                                is_21_[i_28_] = i_44_ >= i_42_ ? i_42_ : i_44_;
                            }
                            break while_165_;
                        } while (false);
                        for (i_28_ = 0; i_28_ < Class185.anInt2164; i_28_++) {
                            int i_47_ = is_27_[i_28_];
                            int i_48_ = is_26_[i_28_];
                            int i_49_ = is_25_[i_28_];
                            int i_50_ = is_23_[i_28_];
                            int i_51_ = is_22_[i_28_];
                            int i_52_ = is_24_[i_28_];
                            is_19_[i_28_] = ((i_51_ ^ 0xffffffff) >= (i_49_ ^ 0xffffffff) ? i_49_ : i_51_);
                            is_20_[i_28_] = i_48_ >= i_50_ ? i_48_ : i_50_;
                            is_21_[i_28_] = i_47_ < i_52_ ? i_52_ : i_47_;
                        }
                        break while_165_;
                    } while (false);
                    for (i_28_ = 0; ((Class185.anInt2164 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
                        int i_53_ = is_24_[i_28_];
                        int i_54_ = is_23_[i_28_];
                        int i_55_ = is_27_[i_28_];
                        int i_56_ = is_25_[i_28_];
                        int i_57_ = is_22_[i_28_];
                        int i_58_ = is_26_[i_28_];
                        is_19_[i_28_] = ((i_56_ ^ 0xffffffff) > (i_57_ ^ 0xffffffff) ? -i_56_ + i_57_ : i_56_ + -i_57_);
                        is_20_[i_28_] = ((i_58_ ^ 0xffffffff) > (i_54_ ^ 0xffffffff) ? i_54_ - i_58_ : i_58_ + -i_54_);
                        is_21_[i_28_] = i_55_ >= i_53_ ? -i_53_ + i_55_ : i_53_ - i_55_;
                    }
                    break while_165_;
                } while (false);
                for (i_28_ = 0; Class185.anInt2164 > i_28_; i_28_++) {
                    int i_59_ = is_22_[i_28_];
                    int i_60_ = is_23_[i_28_];
                    int i_61_ = is_24_[i_28_];
                    int i_62_ = is_26_[i_28_];
                    int i_63_ = is_25_[i_28_];
                    int i_64_ = is_27_[i_28_];
                    is_19_[i_28_] = i_59_ + i_63_ - (i_63_ * i_59_ >> -1039259381);
                    is_20_[i_28_] = i_60_ - -i_62_ - (i_62_ * i_60_ >> 834982283);
                    is_21_[i_28_] = i_61_ - (-i_64_ - -(i_61_ * i_64_ >> 863946603));
                }
            }
        } while (false);
        return is;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_65_) {
        if (i != -61)
            aFloat9373 = 0.19108169F;
        anInt9372++;
        int i_66_ = i_65_;
        do {
            if ((i_66_ ^ 0xffffffff) != -1) {
                if (i_66_ != 1)
                    break;
            } else {
                anInt9371 = class248_sub9.readUnsignedByte((byte) 105);
                break;
            }
            ((Node_Sub14) this).aBoolean6988 = (class248_sub9.readUnsignedByte((byte) -107) ^ 0xffffffff) == -2;
        } while (false);
    }

    static {
        aIncommingOpcode_9365 = new IncommingOpcode(115, 2);
        aOutgoingOpcode_9374 = new OutgoingOpcode(27, 8);
    }
}
