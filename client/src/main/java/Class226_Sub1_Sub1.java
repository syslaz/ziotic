/* Class226_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class226_Sub1_Sub1 extends Class226_Sub1 {
    static int anInt8799;
    static int currentZ;
    static int anInt8801 = 0;
    static int anInt8802;
    static Class208 aClass208_8803 = new Class208(3, 2);
    static int[] anIntArray8804 = new int[3];
    static long aLong8805;

    public static void method1806(boolean bool) {
        anIntArray8804 = null;
        aClass208_8803 = null;
        if (bool != true)
            aLong8805 = 73L;
    }

    static final void method1807(int i, s var_s) {
        Class177.aSArray2070[i] = var_s;
    }

    static final int method1808(int i, int i_0_, byte i_1_) {
        anInt8799++;
        if (i_1_ != 80)
            method1808(26, -80, (byte) 11);
        i = i * (i_0_ & 0x7f) >> 1377973959;
        if (i >= 2) {
            if (i > 126)
                i = 126;
        } else
            i = 2;
        return (0xff80 & i_0_) - -i;
    }
}
