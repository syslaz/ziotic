/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120 {
    short[] aShortArray1505;
    byte[] aByteArray1506;
    short[] aShortArray1507;
    static Class264 aClass264_1508 = new Class264(4);
    short[] aShortArray1509;
    static int anInt1510;
    static int anInt1511 = 0;
    static int anInt1512 = 100;

    public static void method1125(int i) {
        if (i == 23132)
            aClass264_1508 = null;
    }

    static final boolean method1126(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        if (i_2_ != 1)
            method1126(null, 107, -11, 44, -64, 125, 80);
        anInt1510++;
        int i_5_ = i_0_ % i_1_;
        int i_6_;
        if (i_5_ == 0)
            i_6_ = 0;
        else
            i_6_ = -i_5_ + i_1_;
        int i_7_ = -((-1 + i_1_ + i_4_) / i_1_);
        int i_8_ = -((-1 + i_1_ + i_0_) / i_1_);
        for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
            for (int i_10_ = i_8_; i_10_ < 0; i_10_++) {
                if ((is[i] ^ 0xffffffff) == -1)
                    return true;
                i += i_1_;
            }
            i -= i_6_;
            if ((is[i - 1] ^ 0xffffffff) == -1)
                return true;
            i += i_3_;
        }
        return false;
    }
}
