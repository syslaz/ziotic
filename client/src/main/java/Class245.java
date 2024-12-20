/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245 {
    static int anInt2745;
    static int anInt2746;
    static OutgoingOpcode aOutgoingOpcode_2747 = new OutgoingOpcode(39, -1);
    static int anInt2748;
    static int[][][] anIntArrayArrayArray2749;
    static int anInt2750;
    static int anInt2751;
    static Class182[] aClass182Array2752 = new Class182[14];
    static int anInt2753;
    static int anInt2754;

    static final int method1955(int i, int i_0_, int i_1_, byte i_2_) {
        anInt2748++;
        i_1_ &= 0x3;
        if (i_1_ == 0)
            return i_0_;
        if ((i_1_ ^ 0xffffffff) == -2)
            return i;
        if ((i_1_ ^ 0xffffffff) == -3)
            return 4095 - i_0_;
        if (i_2_ < 122)
            aClass182Array2752 = null;
        return 4095 + -i;
    }

    static final void method1956(ByteStream class248_sub9, int i) {
        if (i != -19613)
            method1958('\uff9e', 91);
        anInt2754++;
        if ((-((ByteStream) class248_sub9).offset + ((ByteStream) class248_sub9).buffer.length) >= 1) {
            int i_3_ = class248_sub9.readUnsignedByte((byte) -95);
            if (i_3_ >= 0 && i_3_ <= 1 && ((-((ByteStream) class248_sub9).offset + ((ByteStream) class248_sub9).buffer.length) >= 2)) {
                int i_4_ = class248_sub9.readShort(-1);
                if ((-((ByteStream) class248_sub9).offset + ((ByteStream) class248_sub9).buffer.length) >= 6 * i_4_) {
                    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
                        int i_6_ = class248_sub9.readShort(-1);
                        int i_7_ = class248_sub9.readInt(false);
                        if (Class357.anIntArray4417.length > i_6_ && Class215.aBooleanArray2477[i_6_] && ((((Class69) Class86_Sub1.aClass302_5517.method3199(i_6_, (byte) -118)).aChar908 ^ 0xffffffff) != -50 || i_7_ >= -1 && i_7_ <= 1))
                            Class357.anIntArray4417[i_6_] = i_7_;
                    }
                }
            }
        }
    }

    static final boolean method1957(int i) {
        if (i != -12062)
            aOutgoingOpcode_2747 = null;
        Class113.aBoolean1400 = true;
        anInt2746++;
        Class69.anInt910++;
        return true;
    }

    static final boolean method1958(char c, int i) {
        anInt2751++;
        if ((c ^ 0xffffffff) <= -33 && (c ^ 0xffffffff) >= -127)
            return true;
        if ((c ^ 0xffffffff) <= i && (c ^ 0xffffffff) >= -256)
            return true;
        if (c == 8364 || (c ^ 0xffffffff) == -339 || (c ^ 0xffffffff) == -8213 || c == 339 || c == 376)
            return true;
        return false;
    }

    public static void method1959(int i) {
        if (i != 4095)
            method1959(-63);
        anIntArrayArrayArray2749 = null;
        aClass182Array2752 = null;
        aOutgoingOpcode_2747 = null;
    }
}
