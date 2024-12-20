/* Class248_Sub8_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub12 extends Node_Sub8 {
    static int anInt9007;
    static int anInt9008;
    static int anInt9009;
    private Node_Sub14 aClass248_Sub14_9010;
    static int anInt9011;
    private int[] anIntArray9012;
    static Class316 aClass316_9013;
    private Node_Sub14 aClass248_Sub14_9014;
    static Node_Sub43 aClass248_Sub43_9015 = null;
    static int anInt9016 = 0;
    private Node_Sub14[] aClass248_Sub14Array9017;
    static int anInt9018;
    static int anInt9019;
    static int anInt9020;
    static Class381 aClass381_9021;
    private int[] anIntArray9022;
    private Node_Sub14 aClass248_Sub14_9023;

    final int[] method2088(byte i, d var_d, int i_0_, Class381 class381, double d, int i_1_, boolean bool) {
        anInt9011++;
        Class273.aClass381_5004 = class381;
        Class24.aD330 = var_d;
        for (int i_2_ = 0; i_2_ < aClass248_Sub14Array9017.length; i_2_++)
            aClass248_Sub14Array9017[i_2_].method2268(i_0_, (byte) 124, i_1_);
        if (i <= 20)
            return null;
        Class299.method3171(d, false);
        Class68.method521(i_1_, false, i_0_);
        int[] is = new int[i_1_ * i_0_];
        int i_3_ = 0;
        for (int i_4_ = 0; i_1_ > i_4_; i_4_++) {
            int[] is_5_;
            int[] is_6_;
            int[] is_7_;
            if (!((Node_Sub14) aClass248_Sub14_9023).aBoolean6988) {
                int[][] is_8_ = aClass248_Sub14_9023.method2271(i_4_, true);
                is_6_ = is_8_[1];
                is_5_ = is_8_[2];
                is_7_ = is_8_[0];
            } else {
                int[] is_9_ = aClass248_Sub14_9023.method2264((byte) -40, i_4_);
                is_5_ = is_9_;
                is_6_ = is_9_;
                is_7_ = is_9_;
            }
            int[] is_10_;
            if (((Node_Sub14) aClass248_Sub14_9010).aBoolean6988)
                is_10_ = aClass248_Sub14_9010.method2264((byte) -40, i_4_);
            else
                is_10_ = aClass248_Sub14_9010.method2271(i_4_, true)[0];
            if (bool)
                i_3_ = i_4_;
            for (int i_11_ = -1 + i_0_; i_11_ >= 0; i_11_--) {
                int i_12_ = is_7_[i_11_] >> -1617955548;
                if ((i_12_ ^ 0xffffffff) < -256)
                    i_12_ = 255;
                if (i_12_ < 0)
                    i_12_ = 0;
                int i_13_ = is_6_[i_11_] >> 277554820;
                if ((i_13_ ^ 0xffffffff) < -256)
                    i_13_ = 255;
                if ((i_13_ ^ 0xffffffff) > -1)
                    i_13_ = 0;
                int i_14_ = is_5_[i_11_] >> 526897412;
                if (i_14_ > 255)
                    i_14_ = 255;
                i_13_ = Class40.anIntArray459[i_13_];
                i_12_ = Class40.anIntArray459[i_12_];
                if (i_14_ < 0)
                    i_14_ = 0;
                i_14_ = Class40.anIntArray459[i_14_];
                int i_15_;
                if (i_12_ == 0 && (i_13_ ^ 0xffffffff) == -1 && i_14_ == 0)
                    i_15_ = 0;
                else {
                    i_15_ = is_10_[i_11_] >> -1613172220;
                    if (i_15_ > 255)
                        i_15_ = 255;
                    if ((i_15_ ^ 0xffffffff) > -1)
                        i_15_ = 0;
                }
                is[i_3_++] = (i_13_ << 898264552) + ((i_15_ << -137325576) - (-(i_12_ << -1190749968) - i_14_));
                if (bool)
                    i_3_ += i_0_ + -1;
            }
        }
        for (int i_16_ = 0; aClass248_Sub14Array9017.length > i_16_; i_16_++)
            aClass248_Sub14Array9017[i_16_].method2273(true);
        return is;
    }

    final float[] method2089(boolean bool, byte i, int i_17_, d var_d, Class381 class381, int i_18_) {
        Class24.aD330 = var_d;
        if (i > -72)
            aClass316_9013 = null;
        Class273.aClass381_5004 = class381;
        anInt9009++;
        for (int i_19_ = 0; i_19_ < aClass248_Sub14Array9017.length; i_19_++)
            aClass248_Sub14Array9017[i_19_].method2268(i_18_, (byte) -80, i_17_);
        Class68.method521(i_17_, false, i_18_);
        float[] fs = new float[i_18_ * (i_17_ * 4)];
        int i_20_ = 0;
        for (int i_21_ = 0; i_17_ > i_21_; i_21_++) {
            int[] is;
            int[] is_22_;
            int[] is_23_;
            if (((Node_Sub14) aClass248_Sub14_9023).aBoolean6988) {
                int[] is_24_ = aClass248_Sub14_9023.method2264((byte) -40, i_21_);
                is = is_24_;
                is_23_ = is_24_;
                is_22_ = is_24_;
            } else {
                int[][] is_25_ = aClass248_Sub14_9023.method2271(i_21_, true);
                is = is_25_[0];
                is_22_ = is_25_[2];
                is_23_ = is_25_[1];
            }
            int[] is_26_;
            if (!((Node_Sub14) aClass248_Sub14_9010).aBoolean6988)
                is_26_ = aClass248_Sub14_9010.method2271(i_21_, true)[0];
            else
                is_26_ = aClass248_Sub14_9010.method2264((byte) -40, i_21_);
            if (bool)
                i_20_ = i_21_ << -1330842558;
            int[] is_27_;
            if (!((Node_Sub14) aClass248_Sub14_9014).aBoolean6988)
                is_27_ = aClass248_Sub14_9014.method2271(i_21_, true)[0];
            else
                is_27_ = aClass248_Sub14_9014.method2264((byte) -40, i_21_);
            for (int i_28_ = -1 + i_18_; i_28_ >= 0; i_28_--) {
                float f = (float) is_26_[i_28_] / 4096.0F;
                if (f < 0.0F)
                    f = 0.0F;
                else if (f > 1.0F)
                    f = 1.0F;
                float f_29_ = ((1.0F + (float) is_27_[i_28_] * 31.0F / 4096.0F) / 4096.0F);
                fs[i_20_++] = f_29_ * (float) is[i_28_];
                fs[i_20_++] = f_29_ * (float) is_23_[i_28_];
                fs[i_20_++] = f_29_ * (float) is_22_[i_28_];
                fs[i_20_++] = f;
                if (bool)
                    i_20_ += -4 + (i_18_ << -802705182);
            }
        }
        for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (aClass248_Sub14Array9017.length ^ 0xffffffff)); i_30_++)
            aClass248_Sub14Array9017[i_30_].method2273(true);
        return fs;
    }

    final boolean method2090(d var_d, Class381 class381, boolean bool) {
        anInt9018++;
        if ((Class65.anInt878 ^ 0xffffffff) > -1) {
            for (int i = 0; (anIntArray9012.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                if (!class381.method3920(anIntArray9012[i], -55))
                    return false;
            }
        } else {
            for (int i = 0; (i ^ 0xffffffff) > (anIntArray9012.length ^ 0xffffffff); i++) {
                if (!class381.method3915(44, anIntArray9012[i], Class65.anInt878))
                    return false;
            }
        }
        if (bool != true)
            aClass248_Sub14Array9017 = null;
        for (int i = 0; i < anIntArray9022.length; i++) {
            if (!var_d.method23(anIntArray9022[i], -32345))
                return false;
        }
        return true;
    }

    static final void method2091(int i, int i_31_, byte i_32_, int i_33_, int i_34_) {
        anInt9020++;
        if ((i_34_ ^ 0xffffffff) != -9 && i_34_ != 16) {
            Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_33_][i_31_];
            if (class137 != null) {
                if ((i_34_ ^ 0xffffffff) == -2)
                    ((Class137) class137).aShort1638 = (short) 0;
                else if (i_34_ == 2)
                    ((Class137) class137).aShort1639 = (short) 0;
            }
            Class34.method275(true);
        } else {
            for (int i_35_ = 0; ((Player.anInt10584 ^ 0xffffffff) < (i_35_ ^ 0xffffffff)); i_35_++) {
                Class2 class2 = Class135.aClass2Array1634[i_35_];
                if ((i_34_ == ((Class2) class2).aByte115 && ((((Class2) class2).aShort113 ^ 0xffffffff) == (i_33_ ^ 0xffffffff)) && i_31_ == ((Class2) class2).aShort125) || ((i_33_ ^ 0xffffffff) == (((Class2) class2).aShort121 ^ 0xffffffff) && ((((Class2) class2).aShort125 ^ 0xffffffff) == (i_31_ ^ 0xffffffff)))) {
                    if ((Player.anInt10584 ^ 0xffffffff) != (i_35_ ^ 0xffffffff))
                        Class159.method1399(Class135.aClass2Array1634, 1 + i_35_, Class135.aClass2Array1634, i_35_, (Class135.aClass2Array1634.length + -i_35_ - 1));
                    Player.anInt10584--;
                    return;
                }
            }
        }
        if (i_32_ < 32)
            aClass316_9013 = null;
    }

    final int[] method2092(int i, byte i_36_, boolean bool, double d, Class381 class381, d var_d, int i_37_, boolean bool_38_) {
        anInt9019++;
        Class273.aClass381_5004 = class381;
        Class24.aD330 = var_d;
        for (int i_39_ = 0; ((aClass248_Sub14Array9017.length ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++)
            aClass248_Sub14Array9017[i_39_].method2268(i_37_, (byte) 88, i);
        if (i_36_ != -107)
            aClass248_Sub14_9014 = null;
        Class299.method3171(d, false);
        Class68.method521(i, false, i_37_);
        int[] is = new int[i * i_37_];
        int i_40_;
        int i_41_;
        int i_42_;
        if (bool) {
            i_41_ = -1;
            i_40_ = i_37_ - 1;
            i_42_ = -1;
        } else {
            i_40_ = 0;
            i_41_ = i_37_;
            i_42_ = 1;
        }
        int i_43_ = 0;
        for (int i_44_ = 0; i_44_ < i; i_44_++) {
            if (bool_38_)
                i_43_ = i_44_;
            int[] is_45_;
            int[] is_46_;
            int[] is_47_;
            if (((Node_Sub14) aClass248_Sub14_9023).aBoolean6988) {
                int[] is_48_ = aClass248_Sub14_9023.method2264((byte) -40, i_44_);
                is_47_ = is_48_;
                is_45_ = is_48_;
                is_46_ = is_48_;
            } else {
                int[][] is_49_ = aClass248_Sub14_9023.method2271(i_44_, true);
                is_45_ = is_49_[1];
                is_46_ = is_49_[2];
                is_47_ = is_49_[0];
            }
            for (int i_50_ = i_40_; (i_41_ ^ 0xffffffff) != (i_50_ ^ 0xffffffff); i_50_ += i_42_) {
                int i_51_ = is_47_[i_50_] >> 501488068;
                if ((i_51_ ^ 0xffffffff) < -256)
                    i_51_ = 255;
                if ((i_51_ ^ 0xffffffff) > -1)
                    i_51_ = 0;
                int i_52_ = is_45_[i_50_] >> -828126364;
                if (i_52_ > 255)
                    i_52_ = 255;
                if (i_52_ < 0)
                    i_52_ = 0;
                int i_53_ = is_46_[i_50_] >> -345222940;
                if ((i_53_ ^ 0xffffffff) < -256)
                    i_53_ = 255;
                i_52_ = Class40.anIntArray459[i_52_];
                if ((i_53_ ^ 0xffffffff) > -1)
                    i_53_ = 0;
                i_51_ = Class40.anIntArray459[i_51_];
                i_53_ = Class40.anIntArray459[i_53_];
                int i_54_ = i_53_ + ((i_51_ << 1734382576) + (i_52_ << -1323008664));
                if (i_54_ != 0)
                    i_54_ |= ~0xffffff;
                is[i_43_++] = i_54_;
                if (bool_38_)
                    i_43_ += i_37_ + -1;
            }
        }
        for (int i_55_ = 0; ((aClass248_Sub14Array9017.length ^ 0xffffffff) < (i_55_ ^ 0xffffffff)); i_55_++)
            aClass248_Sub14Array9017[i_55_].method2273(true);
        return is;
    }

    public static void method2093(int i) {
        aClass381_9021 = null;
        if (i == -879071864) {
            aClass316_9013 = null;
            aClass248_Sub43_9015 = null;
        }
    }

    public Node_Sub8_Sub12() {
        anIntArray9022 = new int[0];
        anIntArray9012 = new int[0];
        aClass248_Sub14_9014 = new Node_Sub14_Sub6(0);
        ((Node_Sub14) aClass248_Sub14_9014).anInt6989 = 1;
        aClass248_Sub14_9023 = new Node_Sub14_Sub6();
        ((Node_Sub14) aClass248_Sub14_9023).anInt6989 = 1;
        aClass248_Sub14_9010 = new Node_Sub14_Sub6();
        ((Node_Sub14) aClass248_Sub14_9010).anInt6989 = 1;
        aClass248_Sub14Array9017 = new Node_Sub14[]{aClass248_Sub14_9023, aClass248_Sub14_9010, aClass248_Sub14_9014};
    }

    Node_Sub8_Sub12(ByteStream class248_sub9) {
        int i = class248_sub9.readUnsignedByte((byte) -86);
        int i_56_ = 0;
        int i_57_ = 0;
        int[][] is = new int[i][];
        aClass248_Sub14Array9017 = new Node_Sub14[i];
        for (int i_58_ = 0; i > i_58_; i_58_++) {
            Node_Sub14 class248_sub14 = Node_Sub14_Sub14.method2315((byte) 114, class248_sub9);
            if ((class248_sub14.method2274(-1) ^ 0xffffffff) <= -1)
                i_56_++;
            if (class248_sub14.method2272(99) >= 0)
                i_57_++;
            int i_59_ = (((Node_Sub14) class248_sub14).aClass248_Sub14Array6984).length;
            is[i_58_] = new int[i_59_];
            for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_59_ ^ 0xffffffff); i_60_++)
                is[i_58_][i_60_] = class248_sub9.readUnsignedByte((byte) 99);
            aClass248_Sub14Array9017[i_58_] = class248_sub14;
        }
        anIntArray9012 = new int[i_56_];
        anIntArray9022 = new int[i_57_];
        i_56_ = 0;
        i_57_ = 0;
        for (int i_61_ = 0; i > i_61_; i_61_++) {
            Node_Sub14 class248_sub14 = aClass248_Sub14Array9017[i_61_];
            int i_62_ = (((Node_Sub14) class248_sub14).aClass248_Sub14Array6984).length;
            for (int i_63_ = 0; i_62_ > i_63_; i_63_++)
                ((Node_Sub14) class248_sub14).aClass248_Sub14Array6984[i_63_] = aClass248_Sub14Array9017[is[i_61_][i_63_]];
            int i_64_ = class248_sub14.method2274(-1);
            int i_65_ = class248_sub14.method2272(94);
            if ((i_64_ ^ 0xffffffff) < -1)
                anIntArray9012[i_56_++] = i_64_;
            if (i_65_ > 0)
                anIntArray9022[i_57_++] = i_65_;
            is[i_61_] = null;
        }
        aClass248_Sub14_9023 = aClass248_Sub14Array9017[class248_sub9.readUnsignedByte((byte) -75)];
        aClass248_Sub14_9010 = aClass248_Sub14Array9017[class248_sub9.readUnsignedByte((byte) -40)];
        Object object = null;
        aClass248_Sub14_9014 = aClass248_Sub14Array9017[class248_sub9.readUnsignedByte((byte) -34)];
    }
}
