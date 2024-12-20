/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class230 {
    static int anInt2601;
    static OutgoingOpcode aOutgoingOpcode_2602 = new OutgoingOpcode(63, 0);
    static int anInt2603;
    static int anInt2604 = 0;

    static final boolean method1835(int i, int i_0_, int i_1_) {
        anInt2603++;
        if (i_1_ != 22926)
            method1837(-72L, 3);
        if ((0x800 & i) == 0)
            return false;
        return true;
    }

    public static void method1836(int i) {
        if (i != 0)
            method1837(12L, -5);
        aOutgoingOpcode_2602 = null;
    }

    static final String method1837(long l, int i) {
        anInt2601++;
        if (l <= 0L || l >= 6582952005840035281L)
            return null;
        if (l % 37L == 0L)
            return null;
        int i_2_ = 0;
        long l_3_ = l;
        if (i != 13754)
            method1836(-117);
        for (/**/; l_3_ != 0L; l_3_ /= 37L)
            i_2_++;
        StringBuffer stringbuffer = new StringBuffer(i_2_);
        while ((l ^ 0xffffffffffffffffL) != -1L) {
            long l_4_ = l;
            l /= 37L;
            stringbuffer.append(Class346_Sub7_Sub2_Sub4.aCharArray10094[(int) (l_4_ - 37L * l)]);
        }
        return stringbuffer.reverse().toString();
    }
}
