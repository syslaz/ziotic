/* Class54_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54_Sub4 extends Class54 {
    static RSInterface2 aClass354_5357;
    private int anInt5358;
    private int anInt5359;
    static String[] aStringArray5360 = new String[100];
    private int anInt5361;
    static int anInt5362;
    private int anInt5363;
    static int anInt5364;
    static int anInt5365;
    static IncommingOpcode aIncommingOpcode_5366;
    static int anInt5367;
    static int[] lookIndices;

    final void method427(int i, int i_0_, int i_1_) {
        if (i_0_ == 2)
            anInt5367++;
    }

    static final void method436(int i, int i_2_) {
        if (i != 15)
            method436(81, 60);
        anInt5364++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_2_, -874792672, 7);
        class248_sub8_sub10.method2076(-117);
    }

    final void method425(int i, int i_3_, int i_4_) {
        anInt5365++;
        int i_5_ = -108 % ((i - -71) / 53);
        int i_6_ = anInt5358 * i_4_ >> -1399008820;
        int i_7_ = anInt5359 * i_4_ >> -1168615412;
        int i_8_ = anInt5361 * i_3_ >> 21406572;
        int i_9_ = i_3_ * anInt5363 >> 454309324;
        aa_Sub2.method161(i_7_, ((Class54) this).anInt723, i_8_, (byte) 120, i_9_, i_6_);
    }

    public static void method437(byte i) {
        lookIndices = null;
        int i_10_ = 63 / ((i - 50) / 52);
        aIncommingOpcode_5366 = null;
        aStringArray5360 = null;
        aClass354_5357 = null;
    }

    final void method429(int i, byte i_11_, int i_12_) {
        if (i_11_ != -72)
            anInt5359 = -124;
        anInt5362++;
    }

    Class54_Sub4(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
        super(-1, i_16_, i_17_);
        anInt5361 = i_13_;
        anInt5363 = i_15_;
        anInt5359 = i_14_;
        anInt5358 = i;
    }

    static {
        aClass354_5357 = null;
        aIncommingOpcode_5366 = new IncommingOpcode(123, 6);
        lookIndices = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
    }
}
