/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class316 {
    static int[][] anIntArrayArray3660 = {{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
    static double aDouble3661;
    static int anInt3662 = 0;
    static int[] anIntArray3663 = new int[2];
    static int anInt3664;
    static int anInt3665;

    static final boolean method3284(int i, int i_0_, int i_1_) {
        anInt3664++;
        if (i_0_ != 28466)
            anInt3662 = -51;
        if ((i & 0xc580 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public Class316() {
        /* empty */
    }

    static final void method3285(int i, int i_2_, float[] fs, int i_3_, int i_4_, boolean bool, int i_5_) {
        anInt3665++;
        if (i_2_ > 0 && !Class343.method3508(i_2_, -31218))
            throw new IllegalArgumentException("");
        if (bool != true)
            method3284(-100, -12, 11);
        if ((i_3_ ^ 0xffffffff) < -1 && !Class343.method3508(i_3_, -31218))
            throw new IllegalArgumentException("");
        int i_6_ = Class122.method1129(i_5_, (byte) -68);
        int i_7_ = 0;
        int i_8_ = (i_3_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) ? i_3_ : i_2_;
        int i_9_ = i_2_ >> 1979404769;
        int i_10_ = i_3_ >> -480475743;
        float[] fs_11_ = fs;
        float[] fs_12_ = new float[i_10_ * (i_9_ * i_6_)];
        for (; ; ) {
            OpenGL.glTexImage2Df(i, i_7_, i_4_, i_2_, i_3_, 0, i_5_, 5126, fs_11_, 0);
            if ((i_8_ ^ 0xffffffff) >= -2)
                break;
            int i_13_ = i_2_ * i_6_;
            for (int i_14_ = 0; (i_6_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
                int i_15_ = i_14_;
                int i_16_ = i_14_;
                int i_17_ = i_13_ + i_16_;
                for (int i_18_ = 0; (i_10_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
                    for (int i_19_ = 0; i_9_ > i_19_; i_19_++) {
                        float f = fs_11_[i_16_];
                        i_16_ += i_6_;
                        f += fs_11_[i_16_];
                        f += fs_11_[i_17_];
                        i_16_ += i_6_;
                        i_17_ += i_6_;
                        f += fs_11_[i_17_];
                        i_17_ += i_6_;
                        fs_12_[i_15_] = f * 0.25F;
                        i_15_ += i_6_;
                    }
                    i_17_ += i_13_;
                    i_16_ += i_13_;
                }
            }
            float[] fs_20_ = fs_12_;
            fs_12_ = fs_11_;
            i_2_ = i_9_;
            fs_11_ = fs_20_;
            i_3_ = i_10_;
            i_9_ >>= 1;
            i_8_ >>= 1;
            i_7_++;
            i_10_ >>= 1;
        }
    }

    public static void method3286(byte i) {
        anIntArray3663 = null;
        if (i >= -59)
            method3284(-91, -37, 77);
        anIntArrayArray3660 = null;
    }
}
