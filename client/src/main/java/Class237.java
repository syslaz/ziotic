/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class237 {
    static int anInt2633;
    static int anInt2634;
    static Class146 aClass146_2635;
    int anInt2636;
    static int anInt2637 = 0;
    static double aDouble2638;
    private int anInt2639;
    Class85 aClass85_2640;
    static int[] anIntArray2641 = new int[3];
    static int anInt2642;
    static int anInt2643;
    static Class381 aClass381_2644;
    int anInt2645;

    static final int method1852(int i, byte i_0_, int i_1_) {
        i = (0x7f & i_1_) * i >> -274497593;
        anInt2642++;
        if (i_0_ != -124)
            aClass146_2635 = null;
        if (i < 2)
            i = 2;
        else if (i > 126)
            i = 126;
        return i + (i_1_ & 0xff80);
    }

    private final void method1853(byte i, int i_2_, ByteStream class248_sub9) {
        anInt2633++;
        int i_3_ = 3 % ((i - 56) / 60);
        if (i_2_ == 1)
            anInt2639 = class248_sub9.readShort(-1);
        else if (i_2_ == 2) {
            ((Class237) this).anInt2636 = class248_sub9.readUnsignedByte((byte) -67);
            ((Class237) this).anInt2645 = class248_sub9.readUnsignedByte((byte) 75);
        }
    }

    final synchronized Class157 method1854(boolean bool) {
        anInt2634++;
        Class157 class157 = (Class157) ((Class85) ((Class237) this).aClass85_2640).aClass278_1049.method2863(4, (long) anInt2639);
        if (bool != false)
            method1854(true);
        if (class157 != null)
            return class157;
        class157 = Class157.method1379((((Class85) ((Class237) this).aClass85_2640).aClass381_1045), anInt2639, 0);
        if (class157 != null)
            ((Class85) ((Class237) this).aClass85_2640).aClass278_1049.method2867((byte) 0, (long) anInt2639, class157);
        return class157;
    }

    final void method1855(byte i, ByteStream class248_sub9) {
        if (i <= 71)
            method1853((byte) -77, -108, null);
        anInt2643++;
        for (; ; ) {
            int i_4_ = class248_sub9.readUnsignedByte((byte) -46);
            if ((i_4_ ^ 0xffffffff) == -1)
                break;
            method1853((byte) 119, i_4_, class248_sub9);
        }
    }

    public Class237() {
        /* empty */
    }

    public static void method1856(byte i) {
        if (i != -58)
            method1856((byte) 93);
        aClass381_2644 = null;
        aClass146_2635 = null;
        anIntArray2641 = null;
    }
}
