/* Class248_Sub14_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub32 extends Node_Sub14 {
    static int anInt9494;
    static int anInt9495;
    static int anInt9496;
    private int anInt9497;
    static Class128 aClass128_9498 = new Class128(5, 3);
    static int anInt9499;
    private int anInt9500 = 204;
    static int anInt9501;
    static int anInt9502;
    static Node_Sub8_Sub11 aClass248_Sub8_Sub11_9503;
    private int anInt9504;
    static int anInt9505;
    /*synthetic*/ static Class aClass9506;

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        int i_1_ = i_0_;
        while_194_:
        do {
            do {
                if (i_1_ != 0) {
                    if ((i_1_ ^ 0xffffffff) != -2) {
                        if ((i_1_ ^ 0xffffffff) == -3)
                            break;
                        break while_194_;
                    }
                } else {
                    anInt9504 = class248_sub9.readUnsignedByte((byte) -67);
                    break while_194_;
                }
                anInt9497 = class248_sub9.readUnsignedByte((byte) -25);
                break while_194_;
            } while (false);
            anInt9500 = class248_sub9.readShort(-1);
        } while (false);
        if (i != -61)
            aClass128_9498 = null;
        anInt9496++;
    }

    public Node_Sub14_Sub32() {
        super(0, true);
        anInt9497 = 1;
        anInt9504 = 1;
    }

    static final int method2368(int i, int i_2_, int i_3_) {
        anInt9505++;
        int i_4_ = i >>> -7077857;
        if (i_3_ < 98)
            aClass128_9498 = null;
        return (i_4_ + i) / i_2_ + -i_4_;
    }

    static final boolean method2369(ha var_ha, byte i, int i_5_) {
        anInt9502++;
        int i_6_ = (-104 + Node_Sub8_Sub4.anInt8360) / 2;
        int i_7_ = (Node_Sub22.anInt7074 - 104) / 2;
        boolean bool = true;
        for (int i_8_ = i_6_; (i_8_ ^ 0xffffffff) > (104 + i_6_ ^ 0xffffffff); i_8_++) {
            for (int i_9_ = i_7_; (i_9_ ^ 0xffffffff) > (i_7_ - -104 ^ 0xffffffff); i_9_++) {
                for (int i_10_ = i_5_; (i_10_ ^ 0xffffffff) >= -4; i_10_++) {
                    if (Class107.method752(i_8_, i_5_, i_9_, i + 100, i_10_)) {
                        int i_11_ = i_10_;
                        if (Class209.method1717(i + -10289, i_8_, i_9_))
                            i_11_--;
                        if ((i_11_ ^ 0xffffffff) <= -1)
                            bool &= Class346_Sub4.method3543(i_11_, i_9_, i_8_, (byte) 12);
                    }
                }
            }
        }
        if (!bool)
            return false;
        int[] is = new int[262144];
        for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_12_++)
            is[i_12_] = -16777216;
        Class295.aClass129_3452 = var_ha.method813(512, (byte) 99, 512, is, 0, 512);
        Node_Sub18.method2516((byte) 73);
        int i_13_ = ((-10 + (int) (20.0 * Math.random()) + (238 + (-10 + ((int) (20.0 * Math.random()) + 238) << -855612592)) + (228 + (int) (Math.random() * 20.0) << -2082727640)) | ~0xffffff);
        int i_14_ = (~0xffffff | (int) (Math.random() * 20.0) + 238 - 10 << -156104496);
        if (i != -98)
            method2370(76);
        int i_15_ = ((int) (Math.random() * 8.0) << -167575568 | (int) (Math.random() * 8.0) << 1448258952 | (int) (8.0 * Math.random()));
        boolean[][] bools = new boolean[3 + Class14.anInt268][Class14.anInt268 - -1 - -2];
        for (int i_16_ = i_6_; i_16_ < i_6_ + 104; i_16_ += Class14.anInt268) {
            for (int i_17_ = i_7_; (104 + i_7_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_ += Class14.anInt268) {
                int i_18_ = 0;
                int i_19_ = 0;
                int i_20_ = i_16_;
                if ((i_20_ ^ 0xffffffff) < -1) {
                    i_18_ += 4;
                    i_20_--;
                }
                int i_21_ = i_17_;
                if ((i_21_ ^ 0xffffffff) < -1)
                    i_21_--;
                int i_22_ = Class14.anInt268 + i_16_;
                if (i_22_ < 104)
                    i_22_++;
                int i_23_ = Class14.anInt268 + i_17_;
                if (i_23_ < 104) {
                    i_19_ += 4;
                    i_23_++;
                }
                var_ha.KA(0, 0, i_18_ - -(Class14.anInt268 * 4), Class14.anInt268 * 4 + i_19_);
                var_ha.GA(-16777216);
                for (int i_24_ = i_5_; i_24_ <= 3; i_24_++) {
                    for (int i_25_ = 0; i_25_ <= Class14.anInt268; i_25_++) {
                        for (int i_26_ = 0; Class14.anInt268 >= i_26_; i_26_++)
                            bools[i_25_][i_26_] = Class107.method752(i_20_ + i_25_, i_5_, i_26_ + i_21_, 2, i_24_);
                    }
                    Node_Sub14_Sub29.aSArray9471[i_24_].method3142(0, 0, 1024, i_20_, i_21_, i_22_, i_23_, bools);
                    if (!Node_Sub14_Sub29.aBoolean9469) {
                        for (int i_27_ = -4; i_27_ < Class14.anInt268; i_27_++) {
                            for (int i_28_ = -4; ((Class14.anInt268 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
                                int i_29_ = i_16_ - -i_27_;
                                int i_30_ = i_28_ + i_17_;
                                if ((i_29_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff) && (i_30_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff) && Class107.method752(i_29_, i_5_, i_30_, 2, i_24_)) {
                                    int i_31_ = i_24_;
                                    if (Class209.method1717(-10387, i_29_, i_30_))
                                        i_31_--;
                                    if (i_31_ >= 0)
                                        Class226_Sub2_Sub1.method1812(i_31_, 99, i_14_, i_29_, i_30_, i_27_ * 4 + i_18_, i_13_, i_19_ + 4 * (Class14.anInt268 + -i_28_) - 4, var_ha);
                                }
                            }
                        }
                    }
                }
                if (Node_Sub14_Sub29.aBoolean9469) {
                    Class164 class164 = Class182.aClass164Array2114[i_5_];
                    for (int i_32_ = 0; ((Class14.anInt268 ^ 0xffffffff) < (i_32_ ^ 0xffffffff)); i_32_++) {
                        for (int i_33_ = 0; ((Class14.anInt268 ^ 0xffffffff) < (i_33_ ^ 0xffffffff)); i_33_++) {
                            int i_34_ = i_32_ + i_16_;
                            int i_35_ = i_17_ - -i_33_;
                            int i_36_ = (((Class164) class164).anIntArrayArray1943[-((Class164) class164).anInt1928 + i_34_][-((Class164) class164).anInt1944 + i_35_]);
                            if ((i_36_ & 0x40240000) != 0)
                                var_ha.method820(4, 40, 4, ((-i_33_ + Class14.anInt268) * 4) + (i_19_ + -4), i_32_ * 4 + i_18_, -1713569622);
                            else if ((i_36_ & 0x800000) == 0) {
                                if ((i_36_ & 0x2000000) == 0) {
                                    if ((i_36_ & 0x8000000 ^ 0xffffffff) != -1)
                                        var_ha.method817(-112, -1 + (4 * ((Class14.anInt268) - i_33_) + i_19_), 4, 4 * i_32_ + i_18_, -1713569622);
                                    else if ((0x20000000 & i_36_) != 0)
                                        var_ha.method822(-1713569622, 1, 4, -4 + ((-i_33_ + (Class14.anInt268)) * 4) + i_19_, i_32_ * 4 + i_18_);
                                } else
                                    var_ha.method822(-1713569622, i + 99, 4, (i_19_ - (-((-i_33_ + Class14.anInt268) * 4) + 4)), i_18_ + (i_32_ * 4 - -3));
                            } else
                                var_ha.method817(i + 225, (i_19_ - -(4 * (-i_33_ + Class14.anInt268)) - 4), 4, i_18_ - -(4 * i_32_), -1713569622);
                        }
                    }
                }
                var_ha.aa(i_18_, i_19_, Class14.anInt268 * 4, 4 * Class14.anInt268, i_15_, 2);
                Class295.aClass129_3452.method1184(48 - -(4 * (-i_6_ + i_16_)), (-(Class14.anInt268 * 4) + 464 + -(4 * (-i_7_ + i_17_))), Class14.anInt268 * 4, Class14.anInt268 * 4, i_18_, i_19_);
            }
        }
        var_ha.la();
        var_ha.GA(-16777215);
        Class60.method472(i + -3);
        Node_Sub8_Sub14.anInt9037 = 0;
        Node_Sub14_Sub28.aClass293_9459.method3121(10);
        if (!Node_Sub14_Sub29.aBoolean9469) {
            for (int i_37_ = i_6_; i_37_ < i_6_ + 104; i_37_++) {
                for (int i_38_ = i_7_; (104 + i_7_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
                    for (int i_39_ = i_5_; ((i_5_ - -1 ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && i_39_ <= 3); i_39_++) {
                        if (Class107.method752(i_37_, i_5_, i_38_, 2, i_39_)) {
                            Interface16 interface16 = ((Interface16) Class346_Sub7_Sub1.method3584(i_39_, i_37_, i_38_));
                            if (interface16 == null)
                                interface16 = ((Interface16) (aa.method154(i_39_, i_37_, i_38_, (aClass9506 != null ? aClass9506 : (aClass9506 = method2373("Interface16"))))));
                            if (interface16 == null)
                                interface16 = (Interface16) RSInterface2.method3763(i_39_, i_37_, i_38_);
                            if (interface16 == null)
                                interface16 = ((Interface16) Node_Sub19.method2517(i_39_, i_37_, i_38_));
                            if (interface16 != null) {
                                ObjectDefinition class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -115, interface16.method40((byte) 95)));
                                if (!((ObjectDefinition) class266).aBoolean3016 || Class115.aBoolean4950) {
                                    int i_40_ = ((ObjectDefinition) class266).anInt3033;
                                    if (((ObjectDefinition) class266).anIntArray3049 != null) {
                                        for (int i_41_ = 0; i_41_ < (((ObjectDefinition) class266).anIntArray3049).length; i_41_++) {
                                            if (((((ObjectDefinition) class266).anIntArray3049[i_41_]) ^ 0xffffffff) != 0) {
                                                ObjectDefinition class266_42_ = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -93, (((ObjectDefinition) class266).anIntArray3049[i_41_])));
                                                if ((((ObjectDefinition) class266_42_).anInt3033) >= 0)
                                                    i_40_ = (((ObjectDefinition) class266_42_).anInt3033);
                                            }
                                        }
                                    }
                                    if ((i_40_ ^ 0xffffffff) <= -1) {
                                        boolean bool_43_ = false;
                                        if ((i_40_ ^ 0xffffffff) <= -1) {
                                            Class56 class56 = (Node_Sub3.aClass257_6827.method2750((byte) 117, i_40_));
                                            if (class56 != null && (((Class56) class56).aBoolean741))
                                                bool_43_ = true;
                                        }
                                        int i_44_ = i_37_;
                                        int i_45_ = i_38_;
                                        if (bool_43_) {
                                            int[][] is_46_ = (((Class164) (Class182.aClass164Array2114[i_39_])).anIntArrayArray1943);
                                            int i_47_ = ((Class164) (Class182.aClass164Array2114[i_39_])).anInt1928;
                                            int i_48_ = ((Class164) (Class182.aClass164Array2114[i_39_])).anInt1944;
                                            for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -11; i_49_++) {
                                                int i_50_ = (int) (4.0 * Math.random());
                                                if ((i_50_ ^ 0xffffffff) == -1 && i_6_ < i_44_ && i_37_ - 3 < i_44_ && ((0x2c0108 & (is_46_[i_44_ - (1 + i_47_)][-i_48_ + i_45_])) == 0))
                                                    i_44_--;
                                                if ((i_50_ ^ 0xffffffff) == -2 && i_44_ < 104 + (i_6_ + -1) && ((3 + i_37_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff)) && ((is_46_[1 + i_44_ - i_47_][i_45_ + -i_48_]) & 0x2c0180) == 0)
                                                    i_44_++;
                                                if (i_50_ == 2 && i_45_ > i_7_ && i_38_ - 3 < i_45_ && ((0x2c0102 & (is_46_[-i_47_ + i_44_][(-i_48_ + (-1 + i_45_))])) ^ 0xffffffff) == -1)
                                                    i_45_--;
                                                if (i_50_ == 3 && ((i_45_ ^ 0xffffffff) > (i_7_ + 104 - 1 ^ 0xffffffff)) && ((3 + i_38_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff)) && (0x2c0120 & (is_46_[-i_47_ + i_44_][(i_45_ + 1 + -i_48_)])) == 0)
                                                    i_45_++;
                                            }
                                        }
                                        Class340.anIntArray3965[Node_Sub8_Sub14.anInt9037] = ((ObjectDefinition) class266).anInt3043;
                                        za.anIntArray7489[(Node_Sub8_Sub14.anInt9037)] = i_44_;
                                        Class112.anIntArray5204[Node_Sub8_Sub14.anInt9037] = i_45_;
                                        Node_Sub8_Sub14.anInt9037++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (Class102.aClass380_1309 != null) {
                ((Class381) Class237.aClass381_2644).anInt4675 = 1;
                Node_Sub3.aClass257_6827.method2751(1024, (byte) -77, 64);
                for (int i_51_ = 0; i_51_ < ((Class380) Class102.aClass380_1309).anInt4643; i_51_++) {
                    int i_52_ = (((Class380) Class102.aClass380_1309).anIntArray4644[i_51_]);
                    if (i_52_ >> 319091292 == (((Interactable) Class347.myPlayer).plane)) {
                        int i_53_ = (-Class67.baseX + (0x3fff & i_52_ >> 970410126));
                        int i_54_ = -Class368.baseY + (0x3fff & i_52_);
                        if (i_53_ < 0 || Node_Sub8_Sub4.anInt8360 <= i_53_ || i_54_ < 0 || Node_Sub22.anInt7074 <= i_54_) {
                            Class56 class56 = (Node_Sub3.aClass257_6827.method2750((byte) 23, (((Class380) Class102.aClass380_1309).anIntArray4646[i_51_])));
                            if (((Class56) class56).anIntArray754 != null && i_53_ - -((Class56) class56).anInt778 >= 0 && ((Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (i_53_ - -((Class56) class56).anInt769 ^ 0xffffffff)) && (((Class56) class56).anInt736 + i_54_ ^ 0xffffffff) <= -1 && ((Node_Sub22.anInt7074 ^ 0xffffffff) < (((Class56) class56).anInt770 + i_54_ ^ 0xffffffff)))
                                Node_Sub14_Sub28.aClass293_9459.method3109(new Node_Sub37(i_51_), i ^ 0x11);
                        } else
                            Node_Sub14_Sub28.aClass293_9459.method3109(new Node_Sub37(i_51_), i ^ 0x4);
                    }
                }
                Node_Sub3.aClass257_6827.method2751(128, (byte) -100, 64);
                ((Class381) Class237.aClass381_2644).anInt4675 = 2;
                Class237.aClass381_2644.method3912(0);
            }
        }
        return true;
    }

    static final void method2370(int i) {
        if (i <= 0)
            aClass248_Sub8_Sub11_9503 = null;
        for (int i_55_ = 0; i_55_ < Class28.anInt4892; i_55_++) {
            int i_56_ = Class346_Sub7_Sub2_Sub3.anIntArray10381[i_55_];
            Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_56_, (byte) 31));
            if (class248_sub10 != null) {
                NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                Node_Sub14_Sub39.method2398(256, NPC, ((Class255) (((NPC) NPC).aClass255_10614)).size);
            }
        }
        anInt9494++;
    }

    static final void method2371(byte i) {
        int i_57_ = -20 % ((i - 69) / 52);
        if ((Class273.anInt5008 ^ 0xffffffff) == -4)
            Node_Sub14_Sub15.method2318(4, -21035);
        else if ((Class273.anInt5008 ^ 0xffffffff) == -8)
            Node_Sub14_Sub15.method2318(8, -21035);
        else if ((Class273.anInt5008 ^ 0xffffffff) == -11)
            Node_Sub14_Sub15.method2318(11, -21035);
        anInt9501++;
    }

    final int[] method2264(byte i, int i_58_) {
        anInt9499++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_58_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_59_ = 0;
            for (/**/; Class185.anInt2164 > i_59_; i_59_++) {
                int i_60_ = Node_Sub8_Sub3.anIntArray8921[i_59_];
                int i_61_ = Node_Sub14_Sub3.anIntArray9184[i_58_];
                int i_62_ = anInt9504 * i_60_ >> 177557260;
                int i_63_ = anInt9497 * i_61_ >> 1237837676;
                int i_64_ = i_60_ % (4096 / anInt9504) * anInt9504;
                int i_65_ = i_61_ % (4096 / anInt9497) * anInt9497;
                if (anInt9500 > i_65_) {
                    for (i_62_ -= i_63_; (i_62_ ^ 0xffffffff) > -1; i_62_ += 4) {
                        /* empty */
                    }
                    for (/**/; i_62_ > 3; i_62_ -= 4) {
                        /* empty */
                    }
                    if (i_62_ != 1) {
                        is[i_59_] = 0;
                        continue;
                    }
                    if ((i_64_ ^ 0xffffffff) > (anInt9500 ^ 0xffffffff)) {
                        is[i_59_] = 0;
                        continue;
                    }
                }
                if ((i_64_ ^ 0xffffffff) > (anInt9500 ^ 0xffffffff)) {
                    for (i_62_ -= i_63_; (i_62_ ^ 0xffffffff) > -1; i_62_ += 4) {
                        /* empty */
                    }
                    for (/**/; (i_62_ ^ 0xffffffff) < -4; i_62_ -= 4) {
                        /* empty */
                    }
                    if (i_62_ > 0) {
                        is[i_59_] = 0;
                        continue;
                    }
                }
                is[i_59_] = 4096;
            }
        }
        if (i != -40)
            method2269(null, (byte) -114, -118);
        return is;
    }

    public static void method2372(boolean bool) {
        aClass128_9498 = null;
        if (bool != false)
            method2372(true);
        aClass248_Sub8_Sub11_9503 = null;
    }

    /*synthetic*/
    static Class method2373(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
