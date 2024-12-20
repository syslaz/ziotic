/* Class349_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class Class349_Sub1 extends Class349 implements Interface6 {
    static int anInt4786;
    private int anInt4787;
    static int anInt4788;
    static long aLong4789;
    static int anInt4790;
    static int anInt4791;
    static int anInt4792;
    static int anInt4793;
    static int anInt4794;

    static final int method3736(int i, int i_0_, int i_1_, boolean bool) {
        i_0_ &= 0x3;
        anInt4793++;
        if ((i_0_ ^ 0xffffffff) == -1)
            return i;
        if (i_0_ == 1)
            return 7 + -i_1_;
        if (i_0_ == 2)
            return -i + 7;
        if (bool != true)
            aLong4789 = -55L;
        return i_1_;
    }

    public final long method22(int i) {
        if (i != 9889)
            anInt4787 = -70;
        anInt4794++;
        return ((Class349) this).aBuffer4165.getAddress();
    }

    static final void method3737(int i, byte i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        if (i_2_ != -121)
            method3738(-2, -105, (byte) -68);
        Class127.aClass2Array1566[Node_Sub41.anInt7287++] = new Class2(i_3_, i, i_5_, i_4_, i_4_, i_5_, i_9_, i_7_, i_7_, i_9_, i_6_, i_6_, i_8_, i_8_);
        anInt4788++;
    }

    public final void method19(byte i, int i_10_, int i_11_, byte[] is) {
        anInt4792++;
        this.method3735(is, i_10_);
        if (i != 77)
            anInt4787 = 55;
        anInt4787 = i_11_;
    }

    public final int method20(byte i) {
        int i_12_ = -41 % ((i - 61) / 42);
        anInt4791++;
        return 0;
    }

    Class349_Sub1(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_13_) {
        super(var_ha_Sub2, is, i_13_);
        anInt4787 = i;
    }

    public final int method21(int i) {
        if (i != 26249)
            return -93;
        anInt4786++;
        return anInt4787;
    }

    static final void method3738(int i, int i_14_, byte i_15_) {
        anInt4790++;
        if (Class12.aClass215_249 == Class359.aClass215_4430) {
            if (Class344.method3520(0, i_14_, 0, 1, -2, 1, false, i, -1))
                return;
            Class344.method3520(0, i_14_, 0, 1, -3, 1, false, i, i_15_ ^ ~0x28);
        } else {
            if (Class344.method3520(0, i_14_, 0, 1, -3, 1, false, i, i_15_ ^ ~0x28))
                return;
            Class344.method3520(0, i_14_, 0, 1, -2, 1, false, i, -1);
        }
        if (i_15_ != 40)
            method3736(-48, -59, -77, true);
    }

    Class349_Sub1(ha_Sub2 var_ha_Sub2, int i, Buffer buffer) {
        super(var_ha_Sub2, buffer);
        anInt4787 = i;
    }
}
