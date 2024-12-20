/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class186 {
    static int anInt2165;
    static long aLong2166;
    static int anInt2167;
    static int[] anIntArray2168 = {3, 7, 15};
    static int anInt2169;

    static final String method1626(int i, int i_0_) {
        anInt2169++;
        String string = Integer.toString(i);
        for (int i_1_ = -3 + string.length(); i_1_ > 0; i_1_ -= 3)
            string = string.substring(0, i_1_) + "," + string.substring(i_1_);
        if ((string.length() ^ 0xffffffff) < -10)
            return (" <col=00ff80>" + string.substring(0, -8 + string.length()) + Class41.aClass41_499.method301(Class191.anInt4822, (byte) -108) + " (" + string + ")</col>");
        if (i_0_ != 3)
            aLong2166 = -43L;
        if ((string.length() ^ 0xffffffff) < -7)
            return (" <col=ffffff>" + string.substring(0, -4 + string.length()) + Class41.aClass41_501.method301(Class191.anInt4822, (byte) -108) + " (" + string + ")</col>");
        return " <col=ffff00>" + string + "</col>";
    }

    public Class186() {
        /* empty */
    }

    public static void method1627(int i) {
        if (i != 0)
            anIntArray2168 = null;
        anIntArray2168 = null;
    }

    final int method1628(int i, int i_2_, int i_3_) {
        anInt2167++;
        int i_4_ = ((i_3_ ^ 0xffffffff) <= (Class146.anInt1724 ^ 0xffffffff) ? i_3_ : Class146.anInt1724);
        if (i_2_ != 0)
            return 63;
        if (this == Class282_Sub12.aClass186_7712)
            return 0;
        if (Class256.aClass186_2933 == this)
            return -i + i_4_;
        if (Node_Sub14_Sub9.aClass186_9241 == this)
            return (-i + i_4_) / 2;
        return 0;
    }

    public final String toString() {
        anInt2165++;
        throw new IllegalStateException();
    }
}
