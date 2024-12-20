/* Class279_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class279_Sub1_Sub1 extends Class279_Sub1 {
    static int anInt9811;
    static Class168 aClass168_9812 = new Class168(0, 2, 2, 1);
    static int anInt9813;
    static int anInt9814;
    private byte[] aByteArray9815;
    static int anInt9816;
    static int anInt9817 = -1;
    static int anInt9818;

    final byte[] method2888(int i, int i_0_, int i_1_, int i_2_) {
        anInt9811++;
        if (i_2_ != 4096)
            aClass168_9812 = null;
        aByteArray9815 = new byte[i_0_ * i * (i_1_ * 2)];
        this.method2883(i, i_1_, i_0_, 0);
        return aByteArray9815;
    }

    final void method2887(int i, boolean bool, byte i_3_) {
        anInt9814++;
        i_3_ = (byte) ((i_3_ >> 1270164577 & 0x7f) + 127);
        int i_4_ = i * 2;
        if (bool != false)
            anInt9813 = 119;
        aByteArray9815[i_4_++] = i_3_;
        aByteArray9815[i_4_] = i_3_;
    }

    public Class279_Sub1_Sub1() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    public static void method2889(int i) {
        int i_5_ = -1 / ((-74 - i) / 48);
        aClass168_9812 = null;
    }
}
