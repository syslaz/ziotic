/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class327 {
    static long[] aLongArray3833 = new long[256];
    static int anInt3834;
    static String[] aStringArray3835 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static Class381 aClass381_3836;
    static float[] aFloatArray3837;
    static float aFloat3838;

    public static void method3365(boolean bool) {
        aStringArray3835 = null;
        if (bool != false)
            aClass381_3836 = null;
        aLongArray3833 = null;
        aFloatArray3837 = null;
        aClass381_3836 = null;
    }

    static final int method3366(int i, boolean bool, int i_0_, int i_1_) {
        anInt3834++;
        if ((r.aByteArrayArrayArray9033[i][i_1_][i_0_] & 0x8 ^ 0xffffffff) != -1)
            return 0;
        if (bool != false)
            return -96;
        if (i > 0 && (0x2 & r.aByteArrayArrayArray9033[1][i_1_][i_0_] ^ 0xffffffff) != -1)
            return i + -1;
        return i;
    }

    static {
        for (int i = 0; i < 256; i++) {
            long l = (long) i;
            for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -9; i_2_++) {
                if ((0x1L & l ^ 0xffffffffffffffffL) == -2L)
                    l = ~0x3693a86a2878f0bdL ^ l >>> -995456191;
                else
                    l >>>= 1;
            }
            aLongArray3833[i] = l;
        }
        aFloatArray3837 = new float[16];
    }
}
