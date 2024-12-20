/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class19 {
    static int anInt297;
    static Class4 aClass4_298;
    static Class251 aClass251_299 = new Class251();
    static int[] anIntArray300 = {-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
    static int[] anIntArray301;
    static Class39 aClass39_302;
    static int anInt303;
    static int[][] anIntArrayArray304 = {{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
    static short[] aShortArray305;
    static int[][] anIntArrayArray306 = {{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};

    static final int method228(long l, int i) {
        anInt303++;
        if (i < 57)
            method230(98, null, 17, -27);
        return (int) (l / 86400000L) + -11745;
    }

    public static void method229(boolean bool) {
        anIntArray301 = null;
        anIntArray300 = null;
        aClass4_298 = null;
        aClass39_302 = null;
        aClass251_299 = null;
        anIntArrayArray304 = null;
        aShortArray305 = null;
        if (bool != true)
            aClass39_302 = null;
        anIntArrayArray306 = null;
    }

    static final byte[] method230(int i, byte[] is, int i_0_, int i_1_) {
        anInt297++;
        byte[] is_2_;
        if ((i_1_ ^ 0xffffffff) < -1) {
            is_2_ = new byte[i_0_];
            for (int i_3_ = 0; (i_0_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
                is_2_[i_3_] = is[i_3_ + i_1_];
        } else
            is_2_ = is;
        Class143 class143 = new Class143();
        class143.method1297(-126);
        class143.method1292(is_2_, (long) (8 * i_0_), -126);
        byte[] is_4_ = new byte[64];
        class143.method1293(is_4_, i, 32);
        return is_4_;
    }

    static {
        anIntArray301 = new int[5];
    }
}
