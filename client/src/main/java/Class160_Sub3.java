/* Class160_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class160_Sub3 extends Class160 {
    private int anInt6301;
    private long aLong6302 = 0L;
    private long[] aLongArray6303;
    private int anInt6304;
    private long aLong6305;
    private long aLong6306;

    final int method1410(long l, int i) {
        if (i > -123)
            method1410(20L, 44);
        if (aLong6302 >= aLong6305) {
            int i_0_ = 0;
            do {
                i_0_++;
                aLong6305 += l;
            } while ((i_0_ ^ 0xffffffff) > -11 && aLong6302 > aLong6305);
            if (aLong6305 < aLong6302)
                aLong6305 = aLong6302;
            return i_0_;
        }
        aLong6306 += -aLong6302 + aLong6305;
        aLong6302 += -aLong6302 + aLong6305;
        aLong6305 += l;
        return 1;
    }

    final long method1407(int i) {
        aLong6302 += method1414(0);
        if (aLong6302 < aLong6305)
            return (-aLong6302 + aLong6305) / 1000000L;
        if (i != 6407)
            return 67L;
        return 0L;
    }

    final void method1405(byte i) {
        if (aLong6302 < aLong6305)
            aLong6302 += aLong6305 + -aLong6302;
        int i_1_ = -80 / ((i - 21) / 57);
        aLong6306 = 0L;
    }

    final long method1406(int i) {
        if (i != -21571)
            method1414(-54);
        return aLong6302;
    }

    private final long method1414(int i) {
        long l = 1000000L * Class118.method1112(i + 116);
        long l_2_ = l - aLong6306;
        aLong6306 = l;
        if ((l_2_ ^ 0xffffffffffffffffL) < 4999999999L && l_2_ < 5000000000L) {
            aLongArray6303[anInt6301] = l_2_;
            if ((anInt6304 ^ 0xffffffff) > -11)
                anInt6304++;
            anInt6301 = (anInt6301 - -1) % 10;
        }
        long l_3_ = (long) i;
        for (int i_4_ = 1; anInt6304 >= i_4_; i_4_++)
            l_3_ += aLongArray6303[(10 + (-i_4_ + anInt6301)) % 10];
        return l_3_ / (long) anInt6304;
    }

    Class160_Sub3() {
        anInt6301 = 0;
        aLong6305 = 0L;
        anInt6304 = 1;
        aLongArray6303 = new long[10];
        aLong6306 = 0L;
    }
}
