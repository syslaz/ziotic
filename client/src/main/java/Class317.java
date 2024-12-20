/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class317 {
    static int anInt3666 = 0;
    static int anInt3667;
    static Class157 aClass157_3668;
    static int anInt3669;
    private int anInt3670;
    static long[] aLongArray3671 = new long[32];
    static int anInt3672;
    static int anInt3673;
    private int anInt3674;
    private int[][] anIntArrayArray3675;
    static Object anObject3676;
    static int anInt3677;

    final short[] method3305(short[] is, int i) {
        if (anIntArrayArray3675 != null) {
            int i_0_ = 14 + (int) ((long) is.length * (long) anInt3670 / (long) anInt3674);
            int[] is_1_ = new int[i_0_];
            int i_2_ = 0;
            int i_3_ = 0;
            for (int i_4_ = 0; (is.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                int i_5_ = is[i_4_];
                int[] is_6_ = anIntArrayArray3675[i_3_];
                for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -15; i_7_++)
                    is_1_[i_7_ + i_2_] += i_5_ * is_6_[i_7_] >> 1834479522;
                i_3_ += anInt3670;
                int i_8_ = i_3_ / anInt3674;
                i_2_ += i_8_;
                i_3_ -= anInt3674 * i_8_;
            }
            is = new short[i_0_];
            for (int i_9_ = 0; i_0_ > i_9_; i_9_++) {
                int i_10_ = 8192 + is_1_[i_9_] >> 362446734;
                if ((i_10_ ^ 0xffffffff) > 32767)
                    is[i_9_] = (short) -32768;
                else if (i_10_ <= 32767)
                    is[i_9_] = (short) i_10_;
                else
                    is[i_9_] = (short) 32767;
            }
        }
        anInt3672++;
        int i_11_ = 47 % ((i - -44) / 61);
        return is;
    }

    final int method3306(byte i, int i_12_) {
        anInt3673++;
        if (i != 91)
            method3308(null, 69);
        if (anIntArrayArray3675 != null)
            i_12_ = (int) ((long) anInt3670 * (long) i_12_ / (long) anInt3674);
        return i_12_;
    }

    final int method3307(int i, int i_13_) {
        anInt3667++;
        if (i_13_ != 6909)
            anIntArrayArray3675 = null;
        if (anIntArrayArray3675 != null)
            i = (int) ((long) anInt3670 * (long) i / (long) anInt3674) + 6;
        return i;
    }

    final byte[] method3308(byte[] is, int i) {
        int i_14_ = 6 % ((63 - i) / 60);
        if (anIntArrayArray3675 != null) {
            int i_15_ = 14 + (int) ((long) is.length * (long) anInt3670 / (long) anInt3674);
            int[] is_16_ = new int[i_15_];
            int i_17_ = 0;
            int i_18_ = 0;
            for (int i_19_ = 0; is.length > i_19_; i_19_++) {
                int i_20_ = is[i_19_];
                int[] is_21_ = anIntArrayArray3675[i_18_];
                for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -15; i_22_++)
                    is_16_[i_17_ + i_22_] += is_21_[i_22_] * i_20_;
                i_18_ += anInt3670;
                int i_23_ = i_18_ / anInt3674;
                i_17_ += i_23_;
                i_18_ -= i_23_ * anInt3674;
            }
            is = new byte[i_15_];
            for (int i_24_ = 0; (i_15_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
                int i_25_ = 32768 + is_16_[i_24_] >> -2031443568;
                if (i_25_ < -128)
                    is[i_24_] = (byte) -128;
                else if ((i_25_ ^ 0xffffffff) >= -128)
                    is[i_24_] = (byte) i_25_;
                else
                    is[i_24_] = (byte) 127;
            }
        }
        anInt3669++;
        return is;
    }

    Class317(int i, int i_26_) {
        if (i != i_26_) {
            int i_27_ = Node_Sub13.method2260(27908, i, i_26_);
            i /= i_27_;
            i_26_ /= i_27_;
            anInt3674 = i;
            anInt3670 = i_26_;
            anIntArrayArray3675 = new int[i][14];
            for (int i_28_ = 0; (i ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
                int[] is = anIntArrayArray3675[i_28_];
                double d = 6.0 + (double) i_28_ / (double) i;
                int i_29_ = (int) Math.floor(d - 7.0 + 1.0);
                if (i_29_ < 0)
                    i_29_ = 0;
                int i_30_ = (int) Math.ceil(7.0 + d);
                if (i_30_ > 14)
                    i_30_ = 14;
                double d_31_ = (double) i_26_ / (double) i;
                for (/**/; (i_29_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff); i_29_++) {
                    double d_32_ = (-d + (double) i_29_) * 3.141592653589793;
                    double d_33_ = d_31_;
                    if (d_32_ < -1.0E-4 || d_32_ > 1.0E-4)
                        d_33_ *= Math.sin(d_32_) / d_32_;
                    d_33_ *= 0.46 * Math.cos((-d + (double) i_29_) * 0.2243994752564138) + 0.54;
                    is[i_29_] = (int) Math.floor(65536.0 * d_33_ + 0.5);
                }
            }
        }
    }

    public static void method3309(byte i) {
        if (i > -84)
            anObject3676 = null;
        aClass157_3668 = null;
        aLongArray3671 = null;
        anObject3676 = null;
    }
}
