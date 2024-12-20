/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
    int anInt172;
    static int anInt173;
    int anInt174;
    static int anInt175;
    static IncommingOpcode aIncommingOpcode_176 = new IncommingOpcode(40, -1);
    int anInt177;
    static int anInt178;
    int anInt179;
    static OutgoingOpcode aOutgoingOpcode_180;
    static int[] anIntArray181;
    static String aString182 = null;

    public static void method185(byte i) {
        aOutgoingOpcode_180 = null;
        anIntArray181 = null;
        if (i >= -105)
            method185((byte) -9);
        aString182 = null;
        aIncommingOpcode_176 = null;
    }

    static final boolean method186(int i, byte i_0_) {
        int i_1_ = 9 / ((12 - i_0_) / 63);
        anInt173++;
        if ((i ^ 0xffffffff) != -1 && (i ^ 0xffffffff) != -2 && i != 2)
            return false;
        return true;
    }

    static final Class79 method187(int i, int i_2_) {
        if (i_2_ < 81)
            method186(89, (byte) 77);
        anInt178++;
        Class79[] class79s = Class297.method3134((byte) 114);
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (class79s.length ^ 0xffffffff); i_3_++) {
            Class79 class79 = class79s[i_3_];
            if ((i ^ 0xffffffff) == (((Class79) class79).anInt1006 ^ 0xffffffff))
                return class79;
        }
        return null;
    }

    public Class8() {
        /* empty */
    }

    static {
        anIntArray181 = new int[4096];
        aOutgoingOpcode_180 = new OutgoingOpcode(61, -1);
    }
}
