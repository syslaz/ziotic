/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class160 {
    static IncommingOpcode aIncommingOpcode_1885 = new IncommingOpcode(87, -1);
    static int anInt1886;
    static Class208 aClass208_1887 = new Class208(2, 2);
    static int anInt1888;
    static Class264 aClass264_1889;
    static boolean[] aBooleanArray1890 = new boolean[5];
    static int anInt1891;

    abstract void method1405(byte i);

    abstract long method1406(int i);

    abstract long method1407(int i);

    final int method1408(byte i, long l) {
        anInt1886++;
        long l_0_ = method1407(6407);
        if (l_0_ > 0L)
            Class279_Sub2.method2897((byte) -124, l_0_);
        if (i < 3)
            return -124;
        return method1410(l, -127);
    }

    public Class160() {
        /* empty */
    }

    static final int method1409(int i, int i_1_) {
        anInt1888++;
        if (i_1_ < 18)
            return -3;
        if ((i ^ 0xffffffff) == -6408 || i == 34843 || i == 34837)
            return 6407;
        if ((i ^ 0xffffffff) == -6409 || (i ^ 0xffffffff) == -34843 || i == 34836)
            return 6408;
        if ((i ^ 0xffffffff) == -6407 || (i ^ 0xffffffff) == -34845)
            return 6406;
        if (i == 6409 || (i ^ 0xffffffff) == -34847)
            return 6409;
        if ((i ^ 0xffffffff) == -6411 || i == 34847)
            return 6410;
        if (i == 6402)
            return 6402;
        throw new IllegalArgumentException("");
    }

    abstract int method1410(long l, int i);

    public static void method1411(byte i) {
        if (i != -19)
            aClass264_1889 = null;
        aClass208_1887 = null;
        aBooleanArray1890 = null;
        aClass264_1889 = null;
        aIncommingOpcode_1885 = null;
    }

    static {
        aClass264_1889 = new Class264(1);
    }
}
