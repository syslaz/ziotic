/* Class248_Sub50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub50 extends Node {
    static OutgoingOpcode aOutgoingOpcode_7439 = new OutgoingOpcode(78, -1);
    static int anInt7440;
    static int anInt7441;
    static int anInt7442;
    static int anInt7443;
    static byte[][] aByteArrayArray7444;
    Class341[] aClass341Array7445;
    short[] aShortArray7446;
    private int[] anIntArray7447;
    int anInt7448;
    Node_Sub31_Sub1[] aClass248_Sub31_Sub1Array7449;
    byte[] aByteArray7450;
    byte[] aByteArray7451;
    byte[] aByteArray7452;

    public static void method2678(boolean bool) {
        aOutgoingOpcode_7439 = null;
        if (bool != false)
            method2680(49, 70, -65, -5, -13, null, -89, 98, 102, (byte) 53, -84);
        aByteArrayArray7444 = null;
    }

    final void method2679(int i) {
        if (i == 1) {
            anInt7442++;
            anIntArray7447 = null;
        }
    }

    static final boolean method2680(int i, int i_0_, int i_1_, int i_2_, int i_3_, Class164 class164, int i_4_, int i_5_, int i_6_, byte i_7_, int i_8_) {
        anInt7441++;
        int i_9_ = i_6_;
        if (i_7_ >= -40)
            method2680(13, 54, -69, -51, -22, null, -63, -103, -77, (byte) -90, -88);
        int i_10_ = i_3_;
        int i_11_ = 64;
        int i_12_ = 64;
        int i_13_ = i_6_ + -i_11_;
        int i_14_ = i_3_ - i_12_;
        Class301_Sub3_Sub1.anIntArrayArray9976[i_11_][i_12_] = 99;
        Node_Sub12.anIntArrayArray6958[i_11_][i_12_] = 0;
        int i_15_ = 0;
        Class5.anIntArray146[i_15_] = i_9_;
        int i_16_ = 0;
        Class49.anIntArray655[i_15_++] = i_10_;
        int[][] is = ((Class164) class164).anIntArrayArray1943;
        while (i_16_ != i_15_) {
            i_10_ = Class49.anIntArray655[i_16_];
            i_9_ = Class5.anIntArray146[i_16_];
            i_11_ = -i_13_ + i_9_;
            i_12_ = -i_14_ + i_10_;
            i_16_ = 0xfff & 1 + i_16_;
            int i_17_ = -((Class164) class164).anInt1928 + i_9_;
            int i_18_ = i_10_ - ((Class164) class164).anInt1944;
            int i_19_ = i;
            while_230_:
            do {
                while_229_:
                do {
                    while_228_:
                    do {
                        while_227_:
                        do {
                            do {
                                if ((i_19_ ^ 0xffffffff) != 3) {
                                    if ((i_19_ ^ 0xffffffff) != 2) {
                                        if (i_19_ != -2) {
                                            if ((i_19_ ^ 0xffffffff) != 0) {
                                                if (i_19_ == 0 || ((i_19_ ^ 0xffffffff) == -2) || ((i_19_ ^ 0xffffffff) == -3) || i_19_ == 3 || ((i_19_ ^ 0xffffffff) == -10))
                                                    break while_228_;
                                                break while_229_;
                                            }
                                        } else
                                            break;
                                        break while_227_;
                                    }
                                } else {
                                    if ((i_0_ ^ 0xffffffff) == (i_9_ ^ 0xffffffff) && i_5_ == i_10_) {
                                        Class15.anInt277 = i_10_;
                                        Node_Sub11.anInt6955 = i_9_;
                                        return true;
                                    }
                                    break while_230_;
                                }
                                if (Node_Sub33.method2569(2, i_2_, i_10_, i_5_, 2, i_1_, i_0_, i_9_, true)) {
                                    Class15.anInt277 = i_10_;
                                    Node_Sub11.anInt6955 = i_9_;
                                    return true;
                                }
                                break while_230_;
                            } while (false);
                            if (class164.method1529(2, i_1_, i_2_, i_5_, i_9_, 70, i_0_, i_8_, 2, i_10_)) {
                                Class15.anInt277 = i_10_;
                                Node_Sub11.anInt6955 = i_9_;
                                return true;
                            }
                            break while_230_;
                        } while (false);
                        if (class164.method1524(i_0_, i_1_, 2, -1, i_5_, i_10_, i_2_, i_9_, i_8_)) {
                            Node_Sub11.anInt6955 = i_9_;
                            Class15.anInt277 = i_10_;
                            return true;
                        }
                        break while_230_;
                    } while (false);
                    if (class164.method1531(i_4_, (byte) -119, i_10_, i, 2, i_0_, i_9_, i_5_)) {
                        Node_Sub11.anInt6955 = i_9_;
                        Class15.anInt277 = i_10_;
                        return true;
                    }
                    break while_230_;
                } while (false);
                if (class164.method1523(1, 2, i_4_, i, i_9_, i_5_, i_0_, i_10_)) {
                    Class15.anInt277 = i_10_;
                    Node_Sub11.anInt6955 = i_9_;
                    return true;
                }
            } while (false);
            i_19_ = Node_Sub12.anIntArrayArray6958[i_11_][i_12_] - -1;
            if ((i_11_ ^ 0xffffffff) < -1 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_11_ + -1][i_12_] ^ 0xffffffff) == -1 && (0x43a40000 & is[i_17_ + -1][i_18_]) == 0 && (0x4e240000 & is[-1 + i_17_][i_18_ - -1]) == 0) {
                Class5.anIntArray146[i_15_] = i_9_ + -1;
                Class49.anIntArray655[i_15_] = i_10_;
                Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_11_][i_12_] = 2;
                i_15_ = 0xfff & i_15_ - -1;
                Node_Sub12.anIntArrayArray6958[i_11_ - 1][i_12_] = i_19_;
            }
            if (i_11_ < 126 && (Class301_Sub3_Sub1.anIntArrayArray9976[1 + i_11_][i_12_] == 0) && (is[2 + i_17_][i_18_] & 0x60e40000) == 0 && ((0x78240000 & is[2 + i_17_][1 + i_18_] ^ 0xffffffff) == -1)) {
                Class5.anIntArray146[i_15_] = i_9_ - -1;
                Class49.anIntArray655[i_15_] = i_10_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_11_ - -1][i_12_] = 8;
                i_15_ = 0xfff & 1 + i_15_;
                Node_Sub12.anIntArrayArray6958[i_11_ - -1][i_12_] = i_19_;
            }
            if ((i_12_ ^ 0xffffffff) < -1 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_11_][-1 + i_12_] ^ 0xffffffff) == -1 && (0x43a40000 & is[i_17_][-1 + i_18_] ^ 0xffffffff) == -1 && ((0x60e40000 & is[1 + i_17_][i_18_ + -1] ^ 0xffffffff) == -1)) {
                Class5.anIntArray146[i_15_] = i_9_;
                Class49.anIntArray655[i_15_] = i_10_ + -1;
                i_15_ = 0xfff & i_15_ - -1;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_11_][-1 + i_12_] = 1;
                Node_Sub12.anIntArrayArray6958[i_11_][-1 + i_12_] = i_19_;
            }
            if ((i_12_ ^ 0xffffffff) > -127 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_11_][i_12_ + 1] == 0) && (0x4e240000 & is[i_17_][2 + i_18_]) == 0 && (is[i_17_ + 1][2 + i_18_] & 0x78240000) == 0) {
                Class5.anIntArray146[i_15_] = i_9_;
                Class49.anIntArray655[i_15_] = i_10_ - -1;
                i_15_ = 1 + i_15_ & 0xfff;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_11_][1 + i_12_] = 4;
                Node_Sub12.anIntArrayArray6958[i_11_][i_12_ - -1] = i_19_;
            }
            if (i_11_ > 0 && i_12_ > 0 && (Class301_Sub3_Sub1.anIntArrayArray9976[i_11_ + -1][i_12_ - 1]) == 0 && (is[-1 + i_17_][i_18_] & 0x4fa40000) == 0 && (0x43a40000 & is[-1 + i_17_][-1 + i_18_] ^ 0xffffffff) == -1 && (0x63e40000 & is[i_17_][i_18_ + -1] ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_15_] = i_9_ + -1;
                Class49.anIntArray655[i_15_] = i_10_ - 1;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_11_ - 1][i_12_ + -1] = 3;
                i_15_ = i_15_ + 1 & 0xfff;
                Node_Sub12.anIntArrayArray6958[-1 + i_11_][i_12_ + -1] = i_19_;
            }
            if ((i_11_ ^ 0xffffffff) > -127 && (i_12_ ^ 0xffffffff) < -1 && ((Class301_Sub3_Sub1.anIntArrayArray9976[1 + i_11_][i_12_ - 1]) ^ 0xffffffff) == -1 && (0x63e40000 & is[i_17_ - -1][i_18_ - 1] ^ 0xffffffff) == -1 && (is[i_17_ - -2][i_18_ - 1] & 0x60e40000 ^ 0xffffffff) == -1 && (is[i_17_ - -2][i_18_] & 0x78e40000 ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_15_] = 1 + i_9_;
                Class49.anIntArray655[i_15_] = -1 + i_10_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_11_ - -1][i_12_ - 1] = 9;
                i_15_ = 1 + i_15_ & 0xfff;
                Node_Sub12.anIntArrayArray6958[1 + i_11_][-1 + i_12_] = i_19_;
            }
            if (i_11_ > 0 && (i_12_ ^ 0xffffffff) > -127 && (Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_11_][1 + i_12_]) == 0 && (is[-1 + i_17_][1 + i_18_] & 0x4fa40000 ^ 0xffffffff) == -1 && (is[-1 + i_17_][i_18_ + 2] & 0x4e240000) == 0 && (is[i_17_][i_18_ + 2] & 0x7e240000 ^ 0xffffffff) == -1) {
                Class5.anIntArray146[i_15_] = -1 + i_9_;
                Class49.anIntArray655[i_15_] = 1 + i_10_;
                Class301_Sub3_Sub1.anIntArrayArray9976[-1 + i_11_][i_12_ + 1] = 6;
                i_15_ = 0xfff & i_15_ + 1;
                Node_Sub12.anIntArrayArray6958[i_11_ - 1][i_12_ - -1] = i_19_;
            }
            if ((i_11_ ^ 0xffffffff) > -127 && i_12_ < 126 && (Class301_Sub3_Sub1.anIntArrayArray9976[1 + i_11_][i_12_ + 1]) == 0 && (is[i_17_ + 1][i_18_ - -2] & 0x7e240000) == 0 && (0x78240000 & is[2 + i_17_][i_18_ + 2] ^ 0xffffffff) == -1 && ((is[i_17_ - -2][1 + i_18_] & 0x78e40000 ^ 0xffffffff) == -1)) {
                Class5.anIntArray146[i_15_] = i_9_ + 1;
                Class49.anIntArray655[i_15_] = 1 + i_10_;
                Class301_Sub3_Sub1.anIntArrayArray9976[i_11_ + 1][i_12_ + 1] = 12;
                i_15_ = 0xfff & i_15_ - -1;
                Node_Sub12.anIntArrayArray6958[1 + i_11_][i_12_ + 1] = i_19_;
            }
        }
        Class15.anInt277 = i_10_;
        Node_Sub11.anInt6955 = i_9_;
        return false;
    }

    final boolean method2681(int[] is, byte[] is_20_, boolean bool, Class154 class154) {
        anInt7443++;
        boolean bool_21_ = bool;
        int i = 0;
        Node_Sub31_Sub1 class248_sub31_sub1 = null;
        for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -129; i_22_++) {
            if (is_20_ == null || (is_20_[i_22_] ^ 0xffffffff) != -1) {
                int i_23_ = anIntArray7447[i_22_];
                if ((i_23_ ^ 0xffffffff) != -1) {
                    if ((i_23_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
                        i = i_23_;
                        if ((--i_23_ & 0x1) == 0)
                            class248_sub31_sub1 = class154.method1362(is, 119, i_23_ >> -1986889086);
                        else
                            class248_sub31_sub1 = class154.method1365(is, (byte) -65, i_23_ >> -91341182);
                        if (class248_sub31_sub1 == null)
                            bool_21_ = false;
                    }
                    if (class248_sub31_sub1 != null) {
                        ((Node_Sub50) this).aClass248_Sub31_Sub1Array7449[i_22_] = class248_sub31_sub1;
                        anIntArray7447[i_22_] = 0;
                    }
                }
            }
        }
        return bool_21_;
    }

    public Node_Sub50() {
        /* empty */
    }

    Node_Sub50(byte[] is) {
        ((Node_Sub50) this).aClass248_Sub31_Sub1Array7449 = new Node_Sub31_Sub1[128];
        ((Node_Sub50) this).aByteArray7450 = new byte[128];
        ((Node_Sub50) this).aShortArray7446 = new short[128];
        ((Node_Sub50) this).aByteArray7451 = new byte[128];
        anIntArray7447 = new int[128];
        ((Node_Sub50) this).aClass341Array7445 = new Class341[128];
        ((Node_Sub50) this).aByteArray7452 = new byte[128];
        ByteStream class248_sub9 = new ByteStream(is);
        int i;
        for (i = 0; ((((ByteStream) class248_sub9).buffer[((ByteStream) class248_sub9).offset - -i]) != 0); i++) {
            /* empty */
        }
        byte[] is_24_ = new byte[i];
        for (int i_25_ = 0; (i ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++)
            is_24_[i_25_] = class248_sub9.readByte(121);
        i++;
        ((ByteStream) class248_sub9).offset++;
        int i_26_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i;
        int i_27_;
        for (i_27_ = 0; (((((ByteStream) class248_sub9).buffer[i_27_ + ((ByteStream) class248_sub9).offset]) ^ 0xffffffff) != -1); i_27_++) {
            /* empty */
        }
        byte[] is_28_ = new byte[i_27_];
        for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_27_ ^ 0xffffffff); i_29_++)
            is_28_[i_29_] = class248_sub9.readByte(125);
        ((ByteStream) class248_sub9).offset++;
        i_27_++;
        int i_30_ = ((ByteStream) class248_sub9).offset;
        ((ByteStream) class248_sub9).offset += i_27_;
        int i_31_;
        for (i_31_ = 0; ((((ByteStream) class248_sub9).buffer[i_31_ + ((ByteStream) class248_sub9).offset]) != 0); i_31_++) {
            /* empty */
        }
        byte[] is_32_ = new byte[i_31_];
        for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (i_31_ ^ 0xffffffff); i_33_++)
            is_32_[i_33_] = class248_sub9.readByte(65);
        i_31_++;
        ((ByteStream) class248_sub9).offset++;
        byte[] is_34_ = new byte[i_31_];
        int i_35_;
        if (i_31_ > 1) {
            is_34_[1] = (byte) 1;
            i_35_ = 2;
            int i_36_ = 1;
            for (int i_37_ = 2; (i_31_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
                int i_38_ = class248_sub9.readUnsignedByte((byte) 87);
                if ((i_38_ ^ 0xffffffff) != -1) {
                    if (i_38_ <= i_36_)
                        i_38_--;
                    i_36_ = i_38_;
                } else
                    i_36_ = i_35_++;
                is_34_[i_37_] = (byte) i_36_;
            }
        } else
            i_35_ = i_31_;
        Class341[] class341s = new Class341[i_35_];
        for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (class341s.length ^ 0xffffffff); i_39_++) {
            Class341 class341 = class341s[i_39_] = new Class341();
            int i_40_ = class248_sub9.readUnsignedByte((byte) -92);
            if ((i_40_ ^ 0xffffffff) < -1)
                ((Class341) class341).aByteArray3977 = new byte[i_40_ * 2];
            i_40_ = class248_sub9.readUnsignedByte((byte) -111);
            if ((i_40_ ^ 0xffffffff) < -1) {
                ((Class341) class341).aByteArray3969 = new byte[2 * i_40_ - -2];
                ((Class341) class341).aByteArray3969[1] = (byte) 64;
            }
        }
        int i_41_ = class248_sub9.readUnsignedByte((byte) 105);
        byte[] is_42_ = (i_41_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_41_];
        i_41_ = class248_sub9.readUnsignedByte((byte) 119);
        byte[] is_43_ = (i_41_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_41_];
        int i_44_;
        for (i_44_ = 0; (((((ByteStream) class248_sub9).buffer[((ByteStream) class248_sub9).offset + i_44_]) ^ 0xffffffff) != -1); i_44_++) {
            /* empty */
        }
        byte[] is_45_ = new byte[i_44_];
        for (int i_46_ = 0; i_44_ > i_46_; i_46_++)
            is_45_[i_46_] = class248_sub9.readByte(115);
        i_44_++;
        ((ByteStream) class248_sub9).offset++;
        int i_47_ = 0;
        for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > -129; i_48_++) {
            i_47_ += class248_sub9.readUnsignedByte((byte) 121);
            ((Node_Sub50) this).aShortArray7446[i_48_] = (short) i_47_;
        }
        i_47_ = 0;
        for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -129; i_49_++) {
            i_47_ += class248_sub9.readUnsignedByte((byte) -106);
            ((Node_Sub50) this).aShortArray7446[i_49_] += i_47_ << 1312061992;
        }
        int i_50_ = 0;
        int i_51_ = 0;
        int i_52_ = 0;
        for (int i_53_ = 0; i_53_ < 128; i_53_++) {
            if (i_50_ == 0) {
                if (is_45_.length <= i_51_)
                    i_50_ = -1;
                else
                    i_50_ = is_45_[i_51_++];
                i_52_ = class248_sub9.method2164(-125749561);
            }
            ((Node_Sub50) this).aShortArray7446[i_53_] += Class112.method794(i_52_ + -1, 2) << 1394879182;
            anIntArray7447[i_53_] = i_52_;
            i_50_--;
        }
        i_50_ = 0;
        i_51_ = 0;
        int i_54_ = 0;
        for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > -129; i_55_++) {
            if ((anIntArray7447[i_55_] ^ 0xffffffff) != -1) {
                if (i_50_ == 0) {
                    if (is_24_.length <= i_51_)
                        i_50_ = -1;
                    else
                        i_50_ = is_24_[i_51_++];
                    i_54_ = -1 + (((ByteStream) class248_sub9).buffer[i_26_++]);
                }
                i_50_--;
                ((Node_Sub50) this).aByteArray7450[i_55_] = (byte) i_54_;
            }
        }
        i_51_ = 0;
        i_50_ = 0;
        int i_56_ = 0;
        for (int i_57_ = 0; i_57_ < 128; i_57_++) {
            if ((anIntArray7447[i_57_] ^ 0xffffffff) != -1) {
                if ((i_50_ ^ 0xffffffff) == -1) {
                    i_56_ = (((ByteStream) class248_sub9).buffer[i_30_++]) - -16 << -1183419102;
                    if (is_28_.length > i_51_)
                        i_50_ = is_28_[i_51_++];
                    else
                        i_50_ = -1;
                }
                i_50_--;
                ((Node_Sub50) this).aByteArray7451[i_57_] = (byte) i_56_;
            }
        }
        i_51_ = 0;
        i_50_ = 0;
        Class341 class341 = null;
        for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > -129; i_58_++) {
            if ((anIntArray7447[i_58_] ^ 0xffffffff) != -1) {
                if ((i_50_ ^ 0xffffffff) == -1) {
                    class341 = class341s[is_34_[i_51_]];
                    if (i_51_ < is_32_.length)
                        i_50_ = is_32_[i_51_++];
                    else
                        i_50_ = -1;
                }
                ((Node_Sub50) this).aClass341Array7445[i_58_] = class341;
                i_50_--;
            }
        }
        i_50_ = 0;
        i_51_ = 0;
        int i_59_ = 0;
        for (int i_60_ = 0; i_60_ < 128; i_60_++) {
            if (i_50_ == 0) {
                if ((is_45_.length ^ 0xffffffff) >= (i_51_ ^ 0xffffffff))
                    i_50_ = -1;
                else
                    i_50_ = is_45_[i_51_++];
                if ((anIntArray7447[i_60_] ^ 0xffffffff) < -1)
                    i_59_ = 1 + class248_sub9.readUnsignedByte((byte) 79);
            }
            i_50_--;
            ((Node_Sub50) this).aByteArray7452[i_60_] = (byte) i_59_;
        }
        ((Node_Sub50) this).anInt7448 = class248_sub9.readUnsignedByte((byte) 112) - -1;
        for (int i_61_ = 0; i_61_ < i_35_; i_61_++) {
            Class341 class341_62_ = class341s[i_61_];
            if (((Class341) class341_62_).aByteArray3977 != null) {
                for (int i_63_ = 1; ((((Class341) class341_62_).aByteArray3977.length ^ 0xffffffff) < (i_63_ ^ 0xffffffff)); i_63_ += 2)
                    ((Class341) class341_62_).aByteArray3977[i_63_] = class248_sub9.readByte(58);
            }
            if (((Class341) class341_62_).aByteArray3969 != null) {
                for (int i_64_ = 3; ((i_64_ ^ 0xffffffff) > (-2 + ((Class341) class341_62_).aByteArray3969.length ^ 0xffffffff)); i_64_ += 2)
                    ((Class341) class341_62_).aByteArray3969[i_64_] = class248_sub9.readByte(56);
            }
        }
        if (is_42_ != null) {
            for (int i_65_ = 1; i_65_ < is_42_.length; i_65_ += 2)
                is_42_[i_65_] = class248_sub9.readByte(101);
        }
        if (is_43_ != null) {
            for (int i_66_ = 1; (is_43_.length ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_ += 2)
                is_43_[i_66_] = class248_sub9.readByte(113);
        }
        for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_67_++) {
            Class341 class341_68_ = class341s[i_67_];
            if (((Class341) class341_68_).aByteArray3969 != null) {
                i_47_ = 0;
                for (int i_69_ = 2; ((i_69_ ^ 0xffffffff) > (((Class341) class341_68_).aByteArray3969.length ^ 0xffffffff)); i_69_ += 2) {
                    i_47_ = 1 + i_47_ - -class248_sub9.readUnsignedByte((byte) -51);
                    ((Class341) class341_68_).aByteArray3969[i_69_] = (byte) i_47_;
                }
            }
        }
        for (int i_70_ = 0; (i_35_ ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_++) {
            Class341 class341_71_ = class341s[i_70_];
            if (((Class341) class341_71_).aByteArray3977 != null) {
                i_47_ = 0;
                for (int i_72_ = 2; ((Class341) class341_71_).aByteArray3977.length > i_72_; i_72_ += 2) {
                    i_47_ = 1 + (i_47_ + class248_sub9.readUnsignedByte((byte) -46));
                    ((Class341) class341_71_).aByteArray3977[i_72_] = (byte) i_47_;
                }
            }
        }
        if (is_42_ != null) {
            i_47_ = class248_sub9.readUnsignedByte((byte) 119);
            is_42_[0] = (byte) i_47_;
            for (int i_73_ = 2; (is_42_.length ^ 0xffffffff) < (i_73_ ^ 0xffffffff); i_73_ += 2) {
                i_47_ = class248_sub9.readUnsignedByte((byte) -81) + (i_47_ + 1);
                is_42_[i_73_] = (byte) i_47_;
            }
            int i_74_ = is_42_[0];
            int i_75_ = is_42_[1];
            for (int i_76_ = 0; i_76_ < i_74_; i_76_++)
                ((Node_Sub50) this).aByteArray7452[i_76_] = (byte) (i_75_ * (((Node_Sub50) this).aByteArray7452[i_76_]) + 32 >> 1540404614);
            for (int i_77_ = 2; i_77_ < is_42_.length; i_77_ += 2) {
                int i_78_ = is_42_[i_77_];
                int i_79_ = is_42_[i_77_ + 1];
                int i_80_ = (i_78_ - i_74_) * i_75_ - -((-i_74_ + i_78_) / 2);
                for (int i_81_ = i_74_; (i_78_ ^ 0xffffffff) < (i_81_ ^ 0xffffffff); i_81_++) {
                    int i_82_ = Node_Sub14_Sub32.method2368(i_80_, i_78_ - i_74_, 113);
                    i_80_ += -i_75_ + i_79_;
                    ((Node_Sub50) this).aByteArray7452[i_81_] = (byte) (32 + (((Node_Sub50) this).aByteArray7452[i_81_]) * i_82_ >> -363590682);
                }
                i_74_ = i_78_;
                i_75_ = i_79_;
            }
            Object object = null;
            for (int i_83_ = i_74_; (i_83_ ^ 0xffffffff) > -129; i_83_++)
                ((Node_Sub50) this).aByteArray7452[i_83_] = (byte) (32 + (((Node_Sub50) this).aByteArray7452[i_83_]) * i_75_ >> -1366300154);
        }
        if (is_43_ != null) {
            i_47_ = class248_sub9.readUnsignedByte((byte) 113);
            is_43_[0] = (byte) i_47_;
            for (int i_84_ = 2; i_84_ < is_43_.length; i_84_ += 2) {
                i_47_ = class248_sub9.readUnsignedByte((byte) 71) + (1 + i_47_);
                is_43_[i_84_] = (byte) i_47_;
            }
            int i_85_ = is_43_[0];
            int i_86_ = is_43_[1] << -277778047;
            for (int i_87_ = 0; (i_85_ ^ 0xffffffff) < (i_87_ ^ 0xffffffff); i_87_++) {
                int i_88_ = ((0xff & ((Node_Sub50) this).aByteArray7451[i_87_]) - -i_86_);
                if (i_88_ < 0)
                    i_88_ = 0;
                if ((i_88_ ^ 0xffffffff) < -129)
                    i_88_ = 128;
                ((Node_Sub50) this).aByteArray7451[i_87_] = (byte) i_88_;
            }
            int i_89_ = 2;
            while (i_89_ < is_43_.length) {
                int i_90_ = is_43_[i_89_];
                int i_91_ = is_43_[1 + i_89_] << -547776831;
                int i_92_ = (-i_85_ + i_90_) / 2 + i_86_ * (-i_85_ + i_90_);
                for (int i_93_ = i_85_; i_90_ > i_93_; i_93_++) {
                    int i_94_ = Node_Sub14_Sub32.method2368(i_92_, -i_85_ + i_90_, 102);
                    int i_95_ = (i_94_ + (((Node_Sub50) this).aByteArray7451[i_93_] & 0xff));
                    if ((i_95_ ^ 0xffffffff) > -1)
                        i_95_ = 0;
                    if (i_95_ > 128)
                        i_95_ = 128;
                    i_92_ += i_91_ + -i_86_;
                    ((Node_Sub50) this).aByteArray7451[i_93_] = (byte) i_95_;
                }
                i_89_ += 2;
                i_85_ = i_90_;
                i_86_ = i_91_;
            }
            for (int i_96_ = i_85_; (i_96_ ^ 0xffffffff) > -129; i_96_++) {
                int i_97_ = ((((Node_Sub50) this).aByteArray7451[i_96_] & 0xff) + i_86_);
                if (i_97_ < 0)
                    i_97_ = 0;
                if (i_97_ > 128)
                    i_97_ = 128;
                ((Node_Sub50) this).aByteArray7451[i_96_] = (byte) i_97_;
            }
            Object object = null;
        }
        for (int i_98_ = 0; i_35_ > i_98_; i_98_++)
            ((Class341) class341s[i_98_]).anInt3976 = class248_sub9.readUnsignedByte((byte) 93);
        for (int i_99_ = 0; (i_35_ ^ 0xffffffff) < (i_99_ ^ 0xffffffff); i_99_++) {
            Class341 class341_100_ = class341s[i_99_];
            if (((Class341) class341_100_).aByteArray3977 != null)
                ((Class341) class341_100_).anInt3982 = class248_sub9.readUnsignedByte((byte) -109);
            if (((Class341) class341_100_).aByteArray3969 != null)
                ((Class341) class341_100_).anInt3981 = class248_sub9.readUnsignedByte((byte) 108);
            if (((Class341) class341_100_).anInt3976 > 0)
                ((Class341) class341_100_).anInt3972 = class248_sub9.readUnsignedByte((byte) 78);
        }
        for (int i_101_ = 0; i_35_ > i_101_; i_101_++)
            ((Class341) class341s[i_101_]).anInt3974 = class248_sub9.readUnsignedByte((byte) -75);
        for (int i_102_ = 0; i_102_ < i_35_; i_102_++) {
            Class341 class341_103_ = class341s[i_102_];
            if ((((Class341) class341_103_).anInt3974 ^ 0xffffffff) < -1)
                ((Class341) class341_103_).anInt3979 = class248_sub9.readUnsignedByte((byte) -73);
        }
        for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_104_++) {
            Class341 class341_105_ = class341s[i_104_];
            if ((((Class341) class341_105_).anInt3979 ^ 0xffffffff) < -1)
                ((Class341) class341_105_).anInt3975 = class248_sub9.readUnsignedByte((byte) -104);
        }
    }
}
