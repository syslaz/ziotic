/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class298 {
    static int anInt3473;
    static Class298 aClass298_3474 = new Class298();
    static int anInt3475;
    static int anInt3476;
    static Class298 aClass298_3477 = new Class298();
    static Class298 aClass298_3478 = new Class298();
    static Class298 aClass298_3479 = new Class298();
    private static char[] aCharArray3480 = new char[64];
    static Class58 aClass58_3481;

    static final Class54_Sub3 method3168(ByteStream class248_sub9, int i) {
        anInt3475++;
        int i_0_ = 50 / ((i - -88) / 32);
        return new Class54_Sub3(class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.method2221(255), class248_sub9.readUnsignedByte((byte) 72));
    }

    public final String toString() {
        anInt3476++;
        throw new IllegalStateException();
    }

    public Class298() {
        /* empty */
    }

    public static void method3169(byte i) {
        aClass298_3474 = null;
        aClass298_3477 = null;
        aCharArray3480 = null;
        aClass58_3481 = null;
        if (i == 4) {
            aClass298_3479 = null;
            aClass298_3478 = null;
        }
    }

    static final void method3170(long[] ls, int i, int i_1_, int[] is, int i_2_) {
        anInt3473++;
        if (i_1_ != -25186)
            method3168(null, -61);
        if (i > i_2_) {
            int i_3_ = (i_2_ + i) / 2;
            int i_4_ = i_2_;
            long l = ls[i_3_];
            ls[i_3_] = ls[i];
            ls[i] = l;
            int i_5_ = is[i_3_];
            is[i_3_] = is[i];
            is[i] = i_5_;
            int i_6_ = (l ^ 0xffffffffffffffffL) == -9223372036854775808L ? 0 : 1;
            for (int i_7_ = i_2_; (i ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
                if (ls[i_7_] < (long) (i_7_ & i_6_) + l) {
                    long l_8_ = ls[i_7_];
                    ls[i_7_] = ls[i_4_];
                    ls[i_4_] = l_8_;
                    int i_9_ = is[i_7_];
                    is[i_7_] = is[i_4_];
                    is[i_4_++] = i_9_;
                }
            }
            ls[i] = ls[i_4_];
            ls[i_4_] = l;
            is[i] = is[i_4_];
            is[i_4_] = i_5_;
            method3170(ls, -1 + i_4_, -25186, is, i_2_);
            method3170(ls, i, -25186, is, 1 + i_4_);
        }
    }

    static {
        for (int i = 0; (i ^ 0xffffffff) > -27; i++)
            aCharArray3480[i] = (char) (i + 65);
        for (int i = 26; i < 52; i++)
            aCharArray3480[i] = (char) (-26 + i + 97);
        for (int i = 52; (i ^ 0xffffffff) > -63; i++)
            aCharArray3480[i] = (char) (48 + (i - 52));
        aCharArray3480[63] = '-';
        aCharArray3480[62] = '*';
        aClass58_3481 = new Class58("", 13);
    }
}
