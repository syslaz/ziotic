/* Class279_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class279_Sub1_Sub2 extends Class279_Sub1 {
    static Class316 aClass316_9819;
    static int anInt9820;
    private byte[] aByteArray9821;
    static int anInt9822;
    static int anInt9823;
    static int anInt9824;
    static boolean aBoolean9825 = false;

    final byte[] method2890(int i, int i_0_, int i_1_, int i_2_) {
        aByteArray9821 = new byte[i_1_ * (i * (i_0_ * 2))];
        anInt9823++;
        this.method2883(i, i_1_, i_0_, 0);
        if (i_2_ != 4096)
            return null;
        return aByteArray9821;
    }

    public static void method2891(boolean bool) {
        if (bool != false)
            anInt9824 = 112;
        aClass316_9819 = null;
    }

    final void method2887(int i, boolean bool, byte i_3_) {
        anInt9820++;
        if (bool == false) {
            i_3_ = (byte) (127 + (i_3_ >> -2016767967 & 0x7f));
            int i_4_ = 2 * i;
            aByteArray9821[i_4_++] = i_3_;
            aByteArray9821[i_4_] = i_3_;
        }
    }

    public Class279_Sub1_Sub2() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    static final int method2892(int i) {
        anInt9822++;
        if (i != 2)
            aBoolean9825 = true;
        return Node_Sub2_Sub2.anInt8840;
    }
}
