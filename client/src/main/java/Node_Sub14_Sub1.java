/* Class248_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub1 extends Node_Sub14 {
    static int anInt9153;
    static int anInt9154;
    static int anInt9155;
    static int anInt9156;
    private byte[] aByteArray9157;
    static byte[] aByteArray9158 = new byte[32896];
    boolean aBoolean9159 = true;
    static int anInt9160;
    static int anInt9161;
    int anInt9162;
    int anInt9163;
    static int anInt9164;
    int anInt9165 = 1638;
    static int anInt9166;
    private short[] aShortArray9167;
    private short[] aShortArray9168;
    static long aLong9169;
    int anInt9170;
    int anInt9171;
    static int anInt9172;
    static int[] anIntArray9173;

    final int[] method2264(byte i, int i_0_) {
        anInt9154++;
        if (i != -40)
            aShortArray9167 = null;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564)
            method2275((byte) 111, i_0_, is);
        return is;
    }

    final void method2275(byte i, int i_1_, int[] is) {
        if (i <= 75)
            method2264((byte) -86, -65);
        anInt9153++;
        int i_2_ = (((Node_Sub14_Sub1) this).anInt9162 * Node_Sub14_Sub3.anIntArray9184[i_1_]);
        if (((Node_Sub14_Sub1) this).anInt9163 == 1) {
            int i_3_ = aShortArray9167[0];
            int i_4_ = aShortArray9168[0] << -152509812;
            int i_5_ = ((Node_Sub14_Sub1) this).anInt9171 * i_4_ >> -1450528820;
            int i_6_ = ((Node_Sub14_Sub1) this).anInt9162 * i_4_ >> -305932980;
            int i_7_ = i_2_ * i_4_ >> 931332332;
            int i_8_ = i_7_ >> -1458837076;
            int i_9_ = 1 + i_8_;
            i_7_ &= 0xfff;
            if ((i_6_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff))
                i_9_ = 0;
            int i_10_ = aByteArray9157[0xff & i_9_] & 0xff;
            int i_11_ = Class372.anIntArray4586[i_7_];
            int i_12_ = aByteArray9157[i_8_ & 0xff] & 0xff;
            if (!((Node_Sub14_Sub1) this).aBoolean9159) {
                for (int i_13_ = 0; i_13_ < Class185.anInt2164; i_13_++) {
                    int i_14_ = (((Node_Sub14_Sub1) this).anInt9171 * Node_Sub8_Sub3.anIntArray8921[i_13_]);
                    int i_15_ = method2277(i_11_, i_10_, i_4_ * i_14_ >> 609317516, -23034, i_5_, i_12_, i_7_);
                    is[i_13_] = i_15_ * i_3_ >> -997880308;
                }
            } else {
                for (int i_16_ = 0; Class185.anInt2164 > i_16_; i_16_++) {
                    int i_17_ = (Node_Sub8_Sub3.anIntArray8921[i_16_] * ((Node_Sub14_Sub1) this).anInt9171);
                    int i_18_ = method2277(i_11_, i_10_, i_17_ * i_4_ >> 1373983276, -23034, i_5_, i_12_, i_7_);
                    i_18_ = i_18_ * i_3_ >> -1359667380;
                    is[i_16_] = 2048 + (i_18_ >> 1505341153);
                }
            }
        } else {
            int i_19_ = aShortArray9167[0];
            if ((i_19_ ^ 0xffffffff) < -9 || i_19_ < -8) {
                int i_20_ = aShortArray9168[0] << -203735860;
                int i_21_ = (((Node_Sub14_Sub1) this).anInt9162 * i_20_ >> -1592886964);
                int i_22_ = (((Node_Sub14_Sub1) this).anInt9171 * i_20_ >> -460331636);
                int i_23_ = i_2_ * i_20_ >> 1417317772;
                int i_24_ = i_23_ >> -142856852;
                int i_25_ = 1 + i_24_;
                i_23_ &= 0xfff;
                if (i_21_ <= i_25_)
                    i_25_ = 0;
                int i_26_ = 0xff & aByteArray9157[0xff & i_25_];
                int i_27_ = aByteArray9157[0xff & i_24_] & 0xff;
                int i_28_ = Class372.anIntArray4586[i_23_];
                for (int i_29_ = 0; i_29_ < Class185.anInt2164; i_29_++) {
                    int i_30_ = (Node_Sub8_Sub3.anIntArray8921[i_29_] * ((Node_Sub14_Sub1) this).anInt9171);
                    int i_31_ = method2277(i_28_, i_26_, i_20_ * i_30_ >> 1726796172, -23034, i_22_, i_27_, i_23_);
                    is[i_29_] = i_31_ * i_19_ >> -1717546996;
                }
            }
            for (int i_32_ = 1; i_32_ < ((Node_Sub14_Sub1) this).anInt9163; i_32_++) {
                i_19_ = aShortArray9167[i_32_];
                if (i_19_ > 8 || (i_19_ ^ 0xffffffff) > 7) {
                    int i_33_ = aShortArray9168[i_32_] << -589287796;
                    int i_34_ = i_2_ * i_33_ >> 1455497100;
                    int i_35_ = (i_33_ * ((Node_Sub14_Sub1) this).anInt9171 >> -380155060);
                    int i_36_ = (((Node_Sub14_Sub1) this).anInt9162 * i_33_ >> 256883916);
                    int i_37_ = i_34_ >> 1340066412;
                    int i_38_ = 1 + i_37_;
                    if (i_36_ <= i_38_)
                        i_38_ = 0;
                    i_34_ &= 0xfff;
                    int i_39_ = aByteArray9157[i_37_ & 0xff] & 0xff;
                    int i_40_ = 0xff & aByteArray9157[0xff & i_38_];
                    int i_41_ = Class372.anIntArray4586[i_34_];
                    if (((Node_Sub14_Sub1) this).aBoolean9159 && ((i_32_ ^ 0xffffffff) == (((Node_Sub14_Sub1) this).anInt9163 + -1 ^ 0xffffffff))) {
                        for (int i_42_ = 0; ((i_42_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff)); i_42_++) {
                            int i_43_ = (Node_Sub8_Sub3.anIntArray8921[i_42_] * ((Node_Sub14_Sub1) this).anInt9171);
                            int i_44_ = method2277(i_41_, i_40_, i_33_ * i_43_ >> -321616564, -23034, i_35_, i_39_, i_34_);
                            i_44_ = (i_19_ * i_44_ >> -705339636) + is[i_42_];
                            is[i_42_] = (i_44_ >> 1667118625) + 2048;
                        }
                    } else {
                        for (int i_45_ = 0; Class185.anInt2164 > i_45_; i_45_++) {
                            int i_46_ = (Node_Sub8_Sub3.anIntArray8921[i_45_] * ((Node_Sub14_Sub1) this).anInt9171);
                            int i_47_ = method2277(i_41_, i_40_, i_33_ * i_46_ >> -1902426676, -23034, i_35_, i_39_, i_34_);
                            is[i_45_] += i_19_ * i_47_ >> -1653920692;
                        }
                    }
                }
            }
        }
    }

    public static void method2276(int i) {
        aByteArray9158 = null;
        anIntArray9173 = null;
        if (i <= 63)
            method2279(false, -110, -97);
    }

    final void method2263(int i) {
        anInt9160++;
        if (i == 8351) {
            aByteArray9157 = Class136_Sub4.method1265((((Node_Sub14_Sub1) this).anInt9170), i + -8237);
            method2281(i + -8469);
            for (int i_48_ = ((Node_Sub14_Sub1) this).anInt9163 - 1; i_48_ >= 1; i_48_--) {
                short i_49_ = aShortArray9167[i_48_];
                if (i_49_ > 8)
                    break;
                if ((i_49_ ^ 0xffffffff) > 7)
                    break;
                ((Node_Sub14_Sub1) this).anInt9163--;
            }
        }
    }

    private final int method2277(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
        anInt9161++;
        if (i_52_ != -23034)
            method2277(-118, 78, 0, -60, -106, 98, 112);
        int i_56_ = i_51_ >> -1904489844;
        int i_57_ = 1 + i_56_;
        i_56_ &= 0xff;
        i_51_ &= 0xfff;
        if ((i_53_ ^ 0xffffffff) >= (i_57_ ^ 0xffffffff))
            i_57_ = 0;
        i_57_ &= 0xff;
        int i_58_ = i_51_ + -4096;
        int i_59_ = -4096 + i_55_;
        int i_60_ = aByteArray9157[i_56_ + i_54_] & 0x3;
        int i_61_ = Class372.anIntArray4586[i_51_];
        int i_62_;
        if (i_60_ > 1)
            i_62_ = i_60_ == 2 ? i_51_ - i_55_ : -i_51_ - i_55_;
        else
            i_62_ = i_60_ != 0 ? i_55_ + -i_51_ : i_51_ - -i_55_;
        i_60_ = 0x3 & aByteArray9157[i_57_ + i_54_];
        int i_63_;
        if (i_60_ > 1)
            i_63_ = i_60_ == 2 ? i_58_ + -i_55_ : -i_55_ + -i_58_;
        else
            i_63_ = i_60_ == 0 ? i_55_ + i_58_ : -i_58_ + i_55_;
        int i_64_ = (i_61_ * (i_63_ + -i_62_) >> 398577772) + i_62_;
        i_60_ = 0x3 & aByteArray9157[i_50_ + i_56_];
        if ((i_60_ ^ 0xffffffff) < -2)
            i_62_ = (i_60_ ^ 0xffffffff) != -3 ? -i_51_ - i_59_ : i_51_ + -i_59_;
        else
            i_62_ = i_60_ == 0 ? i_51_ + i_59_ : -i_51_ + i_59_;
        i_60_ = 0x3 & aByteArray9157[i_50_ + i_57_];
        if (i_60_ > 1)
            i_63_ = i_60_ == 2 ? -i_59_ + i_58_ : -i_59_ + -i_58_;
        else
            i_63_ = (i_60_ ^ 0xffffffff) == -1 ? i_59_ + i_58_ : i_59_ - i_58_;
        int i_65_ = ((-i_62_ + i_63_) * i_61_ >> -531656820) + i_62_;
        return i_64_ + (i * (i_65_ - i_64_) >> 1676088268);
    }

    static final void method2278(int i, int i_66_, int i_67_, byte[] is, int i_68_, int i_69_, byte[] is_70_, int i_71_, int i_72_) {
        anInt9164++;
        int i_73_ = -(i_69_ >> 2072872706);
        i_69_ = -(i_68_ & i_69_);
        for (int i_74_ = -i; (i_74_ ^ 0xffffffff) > -1; i_74_++) {
            for (int i_75_ = i_73_; (i_75_ ^ 0xffffffff) > -1; i_75_++) {
                is_70_[i_71_++] += -is[i_67_++];
                is_70_[i_71_++] += -is[i_67_++];
                is_70_[i_71_++] += -is[i_67_++];
                is_70_[i_71_++] += -is[i_67_++];
            }
            for (int i_76_ = i_69_; (i_76_ ^ 0xffffffff) > -1; i_76_++)
                is_70_[i_71_++] += -is[i_67_++];
            i_71_ += i_66_;
            i_67_ += i_72_;
        }
    }

    static final void method2279(boolean bool, int i, int i_77_) {
        anInt9166++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_77_, -874792672, 6);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i;
        if (bool != false)
            aLong9169 = 77L;
    }

    static final String method2280(int i, boolean bool, byte i_78_) {
        int i_79_ = 35 / ((i_78_ - 32) / 59);
        anInt9156++;
        if (!bool || i < 0)
            return Integer.toString(i);
        return Node_Sub8_Sub13.method2098(256, 10, bool, i);
    }

    public Node_Sub14_Sub1() {
        super(0, true);
        aByteArray9157 = new byte[512];
        ((Node_Sub14_Sub1) this).anInt9162 = 4;
        ((Node_Sub14_Sub1) this).anInt9163 = 4;
        ((Node_Sub14_Sub1) this).anInt9170 = 0;
        ((Node_Sub14_Sub1) this).anInt9171 = 4;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_80_) {
        int i_81_ = i_80_;
        while_4_:
        do {
            while_3_:
            do {
                while_2_:
                do {
                    while_1_:
                    do {
                        while_0_:
                        do {
                            do {
                                if (i_81_ != 0) {
                                    if ((i_81_ ^ 0xffffffff) != -2) {
                                        if (i_81_ != 2) {
                                            if (i_81_ != 3) {
                                                if (i_81_ != 4) {
                                                    if (i_81_ != 5) {
                                                        if (i_81_ == 6)
                                                            break while_3_;
                                                        break while_4_;
                                                    }
                                                } else
                                                    break while_1_;
                                                break while_2_;
                                            }
                                        } else
                                            break;
                                        break while_0_;
                                    }
                                } else {
                                    ((Node_Sub14_Sub1) this).aBoolean9159 = (class248_sub9.readUnsignedByte((byte) 98) == 1);
                                    break while_4_;
                                }
                                ((Node_Sub14_Sub1) this).anInt9163 = class248_sub9.readUnsignedByte((byte) -92);
                                break while_4_;
                            } while (false);
                            ((Node_Sub14_Sub1) this).anInt9165 = class248_sub9.readUnsignedShort((byte) -10);
                            if (((Node_Sub14_Sub1) this).anInt9165 < 0) {
                                aShortArray9167 = new short[(((Node_Sub14_Sub1) this).anInt9163)];
                                for (i_81_ = 0; ((((Node_Sub14_Sub1) this).anInt9163 ^ 0xffffffff) < (i_81_ ^ 0xffffffff)); i_81_++)
                                    aShortArray9167[i_81_] = (short) class248_sub9.readUnsignedShort((byte) -10);
                            }
                            break while_4_;
                        } while (false);
                        ((Node_Sub14_Sub1) this).anInt9171 = ((Node_Sub14_Sub1) this).anInt9162 = class248_sub9.readUnsignedByte((byte) 94);
                        break while_4_;
                    } while (false);
                    ((Node_Sub14_Sub1) this).anInt9170 = class248_sub9.readUnsignedByte((byte) 70);
                    break while_4_;
                } while (false);
                ((Node_Sub14_Sub1) this).anInt9171 = class248_sub9.readUnsignedByte((byte) -48);
                break while_4_;
            } while (false);
            ((Node_Sub14_Sub1) this).anInt9162 = class248_sub9.readUnsignedByte((byte) 96);
        } while (false);
        if (i != -61)
            method2263(-68);
        anInt9172++;
    }

    private final void method2281(int i) {
        if (((Node_Sub14_Sub1) this).anInt9165 > 0) {
            aShortArray9168 = new short[((Node_Sub14_Sub1) this).anInt9163];
            aShortArray9167 = new short[((Node_Sub14_Sub1) this).anInt9163];
            for (int i_82_ = 0; ((i_82_ ^ 0xffffffff) > (((Node_Sub14_Sub1) this).anInt9163 ^ 0xffffffff)); i_82_++) {
                aShortArray9167[i_82_] = (short) (int) ((Math.pow((double) ((float) ((Node_Sub14_Sub1) this).anInt9165 / 4096.0F), (double) i_82_)) * 4096.0);
                aShortArray9168[i_82_] = (short) (int) Math.pow(2.0, (double) i_82_);
            }
        } else if (aShortArray9167 != null && ((((Node_Sub14_Sub1) this).anInt9163 ^ 0xffffffff) == (aShortArray9167.length ^ 0xffffffff))) {
            aShortArray9168 = new short[((Node_Sub14_Sub1) this).anInt9163];
            for (int i_83_ = 0; ((((Node_Sub14_Sub1) this).anInt9163 ^ 0xffffffff) < (i_83_ ^ 0xffffffff)); i_83_++)
                aShortArray9168[i_83_] = (short) (int) Math.pow(2.0, (double) i_83_);
        }
        anInt9155++;
        if (i >= -115)
            aByteArray9157 = null;
    }

    static {
        int i = 0;
        for (int i_84_ = 0; (i_84_ ^ 0xffffffff) > -257; i_84_++) {
            for (int i_85_ = 0; i_85_ <= i_84_; i_85_++)
                aByteArray9158[i++] = (byte) (int) (255.0 / Math.sqrt((double) ((float) (65535 + (i_84_ * i_84_) + (i_85_ * i_85_)) / 65535.0F)));
        }
        anIntArray9173 = new int[4];
    }
}
