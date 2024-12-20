/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class242 {
    static int anInt2694;
    byte[] aByteArray2695;
    short[] aShortArray2696;
    short[] aShortArray2697;
    short[] aShortArray2698;
    static float aFloat2699;
    static int[] anIntArray2700 = new int[4];
    static int anInt2701;
    static int anInt2702;

    static final void method1931(String string, int i, int i_0_) {
        anInt2694++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 3);
        if (i_0_ >= -97)
            method1931(null, -105, 3);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).aString8974 = string;
    }

    public static void method1932(byte i) {
        anIntArray2700 = null;
        if (i >= -82)
            method1932((byte) -61);
    }

    static final int method1933(boolean bool, int i, int i_1_, int i_2_) {
        anInt2701++;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool, i, (byte) -60);
        if (class248_sub33 == null)
            return 0;
        if ((i_1_ ^ 0xffffffff) == 0)
            return 0;
        int i_3_ = 71 / ((-3 - i_2_) / 42);
        int i_4_ = 0;
        for (int i_5_ = 0; ((((Node_Sub33) class248_sub33).anIntArray7204.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
            if (((Node_Sub33) class248_sub33).anIntArray7202[i_5_] == i_1_)
                i_4_ += ((Node_Sub33) class248_sub33).anIntArray7204[i_5_];
        }
        return i_4_;
    }

    static final boolean method1934(int i, int i_6_, int i_7_) {
        if (i_6_ != 0)
            return false;
        anInt2702++;
        if (!(Class346_Sub7_Sub5.method3690(23606, i, i_7_) | (i_7_ & 0x70000) != 0) && !Class52.method412(i_7_, (byte) -35, i))
            return false;
        return true;
    }
}
