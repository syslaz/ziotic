/* Class248_Sub8_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub6 extends Node_Sub8 {
    static int anInt8938;
    static int anInt8939;
    static int anInt8940;
    static int anInt8941;
    String aString8942;
    static int anInt8943;
    char[] aCharArray8944;
    int[] anIntArray8945;
    int[] anIntArray8946;
    static int anInt8947;
    static int[] anIntArray8948;
    static boolean aBoolean8949 = false;
    char[] aCharArray8950;
    static int anInt8951;
    static int anInt8952;
    static int anInt8953;

    private final void method2054(int i, int i_0_, ByteStream class248_sub9) {
        anInt8941++;
        if (i == 1)
            ((Node_Sub8_Sub6) this).aString8942 = class248_sub9.readString(15598);
        else if (i != 2) {
            if ((i ^ 0xffffffff) == -4) {
                int i_1_ = class248_sub9.readUnsignedByte((byte) 82);
                ((Node_Sub8_Sub6) this).aCharArray8944 = new char[i_1_];
                ((Node_Sub8_Sub6) this).anIntArray8945 = new int[i_1_];
                for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++) {
                    ((Node_Sub8_Sub6) this).anIntArray8945[i_2_] = class248_sub9.readShort(Class316_Sub1.method3291(i_0_, -3));
                    byte i_3_ = class248_sub9.readByte(78);
                    ((Node_Sub8_Sub6) this).aCharArray8944[i_2_] = (i_3_ != 0 ? Class226.method1802((byte) -71, i_3_) : '\0');
                }
            }
        } else {
            int i_4_ = class248_sub9.readUnsignedByte((byte) 108);
            ((Node_Sub8_Sub6) this).anIntArray8946 = new int[i_4_];
            ((Node_Sub8_Sub6) this).aCharArray8950 = new char[i_4_];
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
                ((Node_Sub8_Sub6) this).anIntArray8946[i_5_] = class248_sub9.readShort(-1);
                byte i_6_ = class248_sub9.readByte(42);
                ((Node_Sub8_Sub6) this).aCharArray8950[i_5_] = ((i_6_ ^ 0xffffffff) == -1 ? '\0' : Class226.method1802((byte) -71, i_6_));
            }
        }
        if (i_0_ != 2)
            method2062(-8, -37, null, 63);
    }

    static final void method2055(int i, int i_7_, int i_8_, Class var_class) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_7_][i_8_];
        if (class137 != null) {
            for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                Animable animable = ((Class49) class49).aAnimable_656;
                if (var_class.isAssignableFrom(animable.getClass()) && (((Animable) animable).x1 == i_7_) && (((Animable) animable).y1 == i_8_)) {
                    Class55.method439(animable, false);
                    break;
                }
            }
        }
    }

    final int method2056(char c, int i) {
        anInt8940++;
        if (((Node_Sub8_Sub6) this).anIntArray8946 == null)
            return -1;
        for (int i_9_ = 0; i_9_ < ((Node_Sub8_Sub6) this).anIntArray8946.length; i_9_++) {
            if (((Node_Sub8_Sub6) this).aCharArray8950[i_9_] == c)
                return ((Node_Sub8_Sub6) this).anIntArray8946[i_9_];
        }
        if (i != 4137)
            method2061(-0.030454393F, -6, -116, 12, 1.1089808F, (byte) 14, -121, -49, 99, -1.393981F, 117, null, null, 70);
        return -1;
    }

    static final int method2057(byte i, int i_10_, int i_11_, int i_12_, int i_13_) {
        anInt8939++;
        int i_14_ = (65536 - Node_Sub9_Sub1.anIntArray9109[8192 * i_12_ / i_10_] >> -874406975);
        if (i >= -80)
            anInt8951 = -26;
        return (((65536 - i_14_) * i_13_ >> 814745456) - -(i_14_ * i_11_ >> 668821904));
    }

    public static void method2058(byte i) {
        anIntArray8948 = null;
        if (i != 113)
            method2057((byte) -1, 12, 19, -70, -55);
    }

    final int method2059(byte i, char c) {
        anInt8952++;
        if (((Node_Sub8_Sub6) this).anIntArray8945 == null)
            return -1;
        if (i <= 85)
            method2055(116, -104, -89, null);
        for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (((Node_Sub8_Sub6) this).anIntArray8945.length ^ 0xffffffff)); i_15_++) {
            if ((((Node_Sub8_Sub6) this).aCharArray8944[i_15_] ^ 0xffffffff) == (c ^ 0xffffffff))
                return ((Node_Sub8_Sub6) this).anIntArray8945[i_15_];
        }
        return -1;
    }

    final void method2060(byte i) {
        if (((Node_Sub8_Sub6) this).anIntArray8945 != null) {
            for (int i_16_ = 0; i_16_ < ((Node_Sub8_Sub6) this).anIntArray8945.length; i_16_++)
                ((Node_Sub8_Sub6) this).anIntArray8945[i_16_] = Class358.retrieveLooksSettings((((Node_Sub8_Sub6) this).anIntArray8945[i_16_]), 32768);
        }
        anInt8938++;
        if (((Node_Sub8_Sub6) this).anIntArray8946 != null) {
            for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (((Node_Sub8_Sub6) this).anIntArray8946.length ^ 0xffffffff)); i_17_++)
                ((Node_Sub8_Sub6) this).anIntArray8946[i_17_] = Class358.retrieveLooksSettings((((Node_Sub8_Sub6) this).anIntArray8946[i_17_]), 32768);
        }
        if (i != -31)
            method2054(70, -3, null);
    }

    static final void method2061(float f, int i, int i_18_, int i_19_, float f_20_, byte i_21_, int i_22_, int i_23_, int i_24_, float f_25_, int i_26_, float[] fs, float[] fs_27_, int i_28_) {
        if (i_21_ != 9)
            method2062(99, -32, null, -75);
        i_18_ -= i_19_;
        i_23_ -= i;
        anInt8947++;
        i_24_ -= i_22_;
        float f_29_ = (fs_27_[2] * (float) i_18_ + (fs_27_[1] * (float) i_24_ + fs_27_[0] * (float) i_23_));
        float f_30_ = ((float) i_23_ * fs_27_[3] + (float) i_24_ * fs_27_[4] + (float) i_18_ * fs_27_[5]);
        float f_31_ = ((float) i_23_ * fs_27_[6] + fs_27_[7] * (float) i_24_ + (float) i_18_ * fs_27_[8]);
        float f_32_;
        float f_33_;
        if (i_28_ == 0) {
            f_33_ = 0.5F + (f_29_ + f_25_);
            f_32_ = -f_31_ + f + 0.5F;
        } else if ((i_28_ ^ 0xffffffff) == -2) {
            f_32_ = 0.5F + (f + f_31_);
            f_33_ = f_25_ + f_29_ + 0.5F;
        } else if (i_28_ == 2) {
            f_32_ = 0.5F + (f_20_ + -f_30_);
            f_33_ = 0.5F + (f_25_ + -f_29_);
        } else if ((i_28_ ^ 0xffffffff) == -4) {
            f_33_ = f_29_ + f_25_ + 0.5F;
            f_32_ = 0.5F + (f_20_ + -f_30_);
        } else if (i_28_ != 4) {
            f_32_ = 0.5F + (f_20_ + -f_30_);
            f_33_ = 0.5F + (-f_31_ + f);
        } else {
            f_33_ = 0.5F + (f + f_31_);
            f_32_ = 0.5F + (-f_30_ + f_20_);
        }
        if (i_26_ != 1) {
            if ((i_26_ ^ 0xffffffff) == -3) {
                f_32_ = -f_32_;
                f_33_ = -f_33_;
            } else if ((i_26_ ^ 0xffffffff) == -4) {
                float f_34_ = f_33_;
                f_33_ = f_32_;
                f_32_ = -f_34_;
            }
        } else {
            float f_35_ = f_33_;
            f_33_ = -f_32_;
            f_32_ = f_35_;
        }
        fs[1] = f_32_;
        fs[0] = f_33_;
    }

    static final void method2062(int i, int i_36_, RSInterface2 class354, int i_37_) {
        anInt8953++;
        aa var_aa = class354.method3768(Class287.aHa3381, i ^ i);
        if (var_aa != null) {
            Class287.aHa3381.KA(i_36_, i_37_, ((RSInterface2) class354).anInt4332 + i_36_, i_37_ + ((RSInterface2) class354).anInt4223);
            if ((Class346_Sub7_Sub1.anInt9907 ^ 0xffffffff) <= -4)
                Class287.aHa3381.A(-16777216, var_aa, i_36_, i_37_);
            else
                Class73.aClass129_943.method1170(((float) ((RSInterface2) class354).anInt4332 / 2.0F + (float) i_36_), ((float) ((RSInterface2) class354).anInt4223 / 2.0F + (float) i_37_), 4096, ((int) -Class282_Sub7.aFloat7661 & 0x3fff) << 1898390946, var_aa, i_36_, i_37_);
        }
    }

    final void method2063(ByteStream class248_sub9, byte i) {
        anInt8943++;
        for (; ; ) {
            int i_38_ = class248_sub9.readUnsignedByte((byte) 114);
            if (i_38_ == 0)
                break;
            method2054(i_38_, i ^ ~0x2, class248_sub9);
        }
        if (i != -1)
            method2060((byte) 40);
    }

    public Node_Sub8_Sub6() {
        /* empty */
    }

    static {
        anIntArray8948 = new int[14];
    }
}
