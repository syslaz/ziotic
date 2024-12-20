/* Class160_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class160_Sub1 extends Class160 {
    private long aLong6289 = 0L;
    private long aLong6290 = 0L;
    private long[] aLongArray6291;
    private int anInt6292;
    private long aLong6293 = 0L;
    private int anInt6294;

    final void method1405(byte i) {
        int i_0_ = -40 / ((21 - i) / 57);
        aLong6293 = 0L;
        if ((aLong6289 ^ 0xffffffffffffffffL) < (aLong6290 ^ 0xffffffffffffffffL))
            aLong6290 += -aLong6290 + aLong6289;
    }

    final int method1410(long l, int i) {
        if (i >= -123)
            method1412((byte) -24);
        if (aLong6290 >= aLong6289) {
            int i_1_ = 0;
            do {
                i_1_++;
                aLong6289 += l;
            } while ((i_1_ ^ 0xffffffff) > -11 && aLong6290 > aLong6289);
            if (aLong6289 < aLong6290)
                aLong6289 = aLong6290;
            return i_1_;
        }
        aLong6293 += -aLong6290 + aLong6289;
        aLong6290 += aLong6289 + -aLong6290;
        aLong6289 += l;
        return 1;
    }

    final long method1407(int i) {
        if (i != 6407)
            aLongArray6291 = null;
        aLong6290 += method1412((byte) -22);
        if ((aLong6290 ^ 0xffffffffffffffffL) > (aLong6289 ^ 0xffffffffffffffffL))
            return (-aLong6290 + aLong6289) / 1000000L;
        return 0L;
    }

    Class160_Sub1() {
        anInt6292 = 1;
        aLongArray6291 = new long[10];
        anInt6294 = 0;
        aLong6290 = System.nanoTime();
        aLong6289 = System.nanoTime();
    }

    private final long method1412(byte i) {
        long l = System.nanoTime();
        long l_2_ = l + -aLong6293;
        if (i != -22)
            aLong6289 = 41L;
        aLong6293 = l;
        if (4999999999L > (l_2_ ^ 0xffffffffffffffffL) && -5000000001L < (l_2_ ^ 0xffffffffffffffffL)) {
            aLongArray6291[anInt6294] = l_2_;
            anInt6294 = (anInt6294 + 1) % 10;
            if (-2 < (anInt6292 ^ 0xffffffff))
                anInt6292++;
        }
        long l_3_ = 0L;
        for (int i_4_ = 1; (anInt6292 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff); i_4_++)
            l_3_ += aLongArray6291[(anInt6294 + -i_4_ - -10) % 10];
        return l_3_ / (long) anInt6292;
    }

    final long method1406(int i) {
        if (i != -21571)
            method1412((byte) 115);
        return aLong6290;
    }
}
