/* Class316_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class316_Sub2 extends Class316 {
    static int anInt8051;
    static RSInterface2 aClass354_8052 = null;
    static int anInt8053;

    static final Class49 method3300(int i, int i_0_, int i_1_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_0_][i_1_];
        if (class137 == null)
            return null;
        return ((Class137) class137).aClass49_1649;
    }

    static final Class75 method3301(int i, Class343 class343, int i_2_, int[] is) {
        anInt8051++;
        int[] is_3_ = null;
        int[] is_4_ = null;
        int[] is_5_ = null;
        float[][] fs = null;
        if (((Class343) class343).aByteArray4026 != null) {
            int i_6_ = ((Class343) class343).anInt4039;
            int[] is_7_ = new int[i_6_];
            int[] is_8_ = new int[i_6_];
            int[] is_9_ = new int[i_6_];
            int[] is_10_ = new int[i_6_];
            int[] is_11_ = new int[i_6_];
            int[] is_12_ = new int[i_6_];
            for (int i_13_ = 0; i_13_ < i_6_; i_13_++) {
                is_7_[i_13_] = 2147483647;
                is_8_[i_13_] = -2147483647;
                is_9_[i_13_] = 2147483647;
                is_10_[i_13_] = -2147483647;
                is_11_[i_13_] = 2147483647;
                is_12_[i_13_] = -2147483647;
            }
            is_4_ = new int[i_6_];
            is_5_ = new int[i_6_];
            for (int i_14_ = 0; i_14_ < i; i_14_++) {
                int i_15_ = is[i_14_];
                if ((((Class343) class343).aByteArray4026[i_15_] ^ 0xffffffff) != 0) {
                    int i_16_ = 0xff & ((Class343) class343).aByteArray4026[i_15_];
                    for (int i_17_ = 0; i_17_ < 3; i_17_++) {
                        short i_18_;
                        if (i_17_ != 0) {
                            if (i_17_ != 1)
                                i_18_ = (((Class343) class343).aShortArray4073[i_15_]);
                            else
                                i_18_ = (((Class343) class343).aShortArray4024[i_15_]);
                        } else
                            i_18_ = ((Class343) class343).aShortArray4046[i_15_];
                        int i_19_ = ((Class343) class343).anIntArray4027[i_18_];
                        int i_20_ = ((Class343) class343).anIntArray4069[i_18_];
                        int i_21_ = ((Class343) class343).anIntArray4040[i_18_];
                        if ((is_7_[i_16_] ^ 0xffffffff) < (i_19_ ^ 0xffffffff))
                            is_7_[i_16_] = i_19_;
                        if ((i_19_ ^ 0xffffffff) < (is_8_[i_16_] ^ 0xffffffff))
                            is_8_[i_16_] = i_19_;
                        if (is_9_[i_16_] > i_20_)
                            is_9_[i_16_] = i_20_;
                        if (i_20_ > is_10_[i_16_])
                            is_10_[i_16_] = i_20_;
                        if (is_11_[i_16_] > i_21_)
                            is_11_[i_16_] = i_21_;
                        if ((i_21_ ^ 0xffffffff) < (is_12_[i_16_] ^ 0xffffffff))
                            is_12_[i_16_] = i_21_;
                    }
                }
            }
            fs = new float[i_6_][];
            is_3_ = new int[i_6_];
            for (int i_22_ = 0; i_6_ > i_22_; i_22_++) {
                byte i_23_ = ((Class343) class343).aByteArray4033[i_22_];
                if (i_23_ > 0) {
                    is_3_[i_22_] = (is_7_[i_22_] + is_8_[i_22_]) / 2;
                    is_4_[i_22_] = (is_10_[i_22_] + is_9_[i_22_]) / 2;
                    is_5_[i_22_] = (is_12_[i_22_] + is_11_[i_22_]) / 2;
                    float f;
                    float f_24_;
                    float f_25_;
                    if (i_23_ != 1) {
                        if ((i_23_ ^ 0xffffffff) != -3) {
                            f_25_ = (float) (((Class343) class343).anIntArray4058[i_22_]) / 1024.0F;
                            f = (float) (((Class343) class343).anIntArray4029[i_22_]) / 1024.0F;
                            f_24_ = (float) (((Class343) class343).anIntArray4021[i_22_]) / 1024.0F;
                        } else {
                            f_24_ = 64.0F / (float) (((Class343) class343).anIntArray4021[i_22_]);
                            f = 64.0F / (float) (((Class343) class343).anIntArray4029[i_22_]);
                            f_25_ = 64.0F / (float) (((Class343) class343).anIntArray4058[i_22_]);
                        }
                    } else {
                        int i_26_ = ((Class343) class343).anIntArray4058[i_22_];
                        f = 64.0F / (float) (((Class343) class343).anIntArray4029[i_22_]);
                        if ((i_26_ ^ 0xffffffff) == -1) {
                            f_24_ = 1.0F;
                            f_25_ = 1.0F;
                        } else if (i_26_ > 0) {
                            f_24_ = (float) i_26_ / 1024.0F;
                            f_25_ = 1.0F;
                        } else {
                            f_24_ = 1.0F;
                            f_25_ = (float) -i_26_ / 1024.0F;
                        }
                    }
                    fs[i_22_] = (Class254.method2732(((Class343) class343).aShortArray4047[i_22_], 125, ((Class343) class343).aShortArray4049[i_22_], Class112.method794((((Class343) class343).aByteArray4055[i_22_]), 255), f_25_, f, f_24_, ((Class343) class343).aShortArray4070[i_22_]));
                }
            }
        }
        if (i_2_ != 0)
            return null;
        return new Class75(is_3_, is_4_, is_5_, fs);
    }

    public static void method3302(int i) {
        if (i != 0)
            method3301(-96, null, 61, null);
        aClass354_8052 = null;
    }

    abstract Interface21_Impl3 method3303(byte i);
}
