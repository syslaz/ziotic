/* Class279_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class279_Sub1 extends Class279 {
    static int anInt7559;
    private int[] anIntArray7560 = new int[((Class279) this).anInt3246];
    static int anInt7561 = 0;
    static int anInt7562;
    private byte[] aByteArray7563;
    static int anInt7564;
    private int anInt7565;
    static int anInt7566;
    static int anInt7567;
    private int anInt7568;

    static final void method2886(boolean bool) {
        anInt7562++;
        if (Class276.aClass248_Sub8_Sub5_3209 != null && bool == false) {
            Class276.aClass248_Sub8_Sub5_3209 = null;
            Class54_Sub2.method435(Class155.anInt1837, Class203.anInt2314, -50, Class54_Sub3.anInt5344, Class316_Sub2.anInt8053);
        }
    }

    final void method2884(int i) {
        anInt7565 = Math.abs(anInt7565);
        anInt7559++;
        if (anInt7565 >= 4096)
            anInt7565 = 4095;
        method2887(anInt7568++, false, (byte) (anInt7565 >> -1993632540));
        if (i != 28926)
            method2885(-100, 121, -7);
        anInt7565 = 0;
    }

    final void method2879(int i) {
        anInt7564++;
        int i_0_ = 110 / ((22 - i) / 45);
        anInt7568 = 0;
        anInt7565 = 0;
    }

    final void method2885(int i, int i_1_, int i_2_) {
        anInt7565 += anIntArray7560[i_2_] * i_1_ >> -1148077876;
        anInt7567++;
        if (i != -256)
            aByteArray7563 = null;
    }

    void method2887(int i, boolean bool, byte i_3_) {
        aByteArray7563[anInt7568++] = (byte) (Class112.method794(i_3_ >> 1707421409, 127) + 127);
        if (bool != false)
            method2879(-84);
        anInt7566++;
    }

    Class279_Sub1(int i, int i_4_, int i_5_, int i_6_, int i_7_, float f) {
        super(i, i_4_, i_5_, i_6_, i_7_);
        for (int i_8_ = 0; (((Class279) this).anInt3246 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
            anIntArray7560[i_8_] = (short) (int) (Math.pow((double) f, (double) i_8_) * 4096.0);
    }
}
