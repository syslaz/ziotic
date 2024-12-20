/* Class160_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

final class Class160_Sub2 extends Class160 {
    private long aLong6295 = 0L;
    private long aLong6296 = 0L;
    private long[] aLongArray6297;
    private int anInt6298;
    private int anInt6299 = 0;
    private long aLong6300;

    final int method1410(long l, int i) {
        if (i > -123)
            method1410(-34L, 24);
        if ((aLong6295 ^ 0xffffffffffffffffL) < (aLong6296 ^ 0xffffffffffffffffL)) {
            aLong6300 += -aLong6296 + aLong6295;
            aLong6296 += -aLong6296 + aLong6295;
            aLong6295 += l;
            return 1;
        }
        int i_0_ = 0;
        do
            aLong6295 += l; while (++i_0_ < 10 && aLong6295 < aLong6296);
        if ((aLong6296 ^ 0xffffffffffffffffL) < (aLong6295 ^ 0xffffffffffffffffL))
            aLong6295 = aLong6296;
        return i_0_;
    }

    final long method1406(int i) {
        if (i != -21571)
            anInt6299 = -77;
        return aLong6296;
    }

    private final long method1413(int i) {
        long l = jagmisc.nanoTime();
        long l_1_ = -aLong6300 + l;
        int i_2_ = -60 / ((i - 22) / 56);
        aLong6300 = l;
        if ((l_1_ ^ 0xffffffffffffffffL) < 4999999999L && (l_1_ ^ 0xffffffffffffffffL) > -5000000001L) {
            aLongArray6297[anInt6299] = l_1_;
            if (anInt6298 < 1)
                anInt6298++;
            anInt6299 = (1 + anInt6299) % 10;
        }
        long l_3_ = 0L;
        for (int i_4_ = 1; (i_4_ ^ 0xffffffff) >= (anInt6298 ^ 0xffffffff); i_4_++)
            l_3_ += aLongArray6297[(anInt6299 - i_4_ + 10) % 10];
        return l_3_ / (long) anInt6298;
    }

    final long method1407(int i) {
        if (i != 6407)
            method1407(-3);
        aLong6296 += method1413(-99);
        if ((aLong6296 ^ 0xffffffffffffffffL) > (aLong6295 ^ 0xffffffffffffffffL))
            return (-aLong6296 + aLong6295) / 1000000L;
        return 0L;
    }

    final void method1405(byte i) {
        aLong6300 = 0L;
        if ((aLong6295 ^ 0xffffffffffffffffL) < (aLong6296 ^ 0xffffffffffffffffL))
            aLong6296 += -aLong6296 + aLong6295;
        int i_5_ = -58 / ((21 - i) / 57);
    }

    Class160_Sub2() {
        anInt6298 = 1;
        aLongArray6297 = new long[10];
        aLong6300 = 0L;
        aLong6295 = aLong6296 = jagmisc.nanoTime();
        if ((aLong6296 ^ 0xffffffffffffffffL) == -1L)
            throw new RuntimeException();
    }
}
