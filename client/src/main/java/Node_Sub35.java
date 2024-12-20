/* Class248_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub35 extends Node {
    boolean aBoolean7242;
    int anInt7243 = -1;
    int anInt7244;
    int anInt7245;
    int anInt7246;
    static Class129[] aClass129Array7247;
    static int anInt7248;
    int anInt7249;
    static int[] anIntArray7250;
    static int anInt7251 = 100;
    int anInt7252;

    static final void method2588(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt7248++;
        if (Class302.anInt3500 <= i && (Class289.anInt3399 ^ 0xffffffff) <= (i_2_ ^ 0xffffffff) && Class181.anInt2099 <= i_3_ && (aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)) {
            if (i_1_ == 1)
                Class109.method762(i, i_4_, i_0_, i_2_, true, i_3_);
            else
                Class109.method765(0, i_4_, i_2_, i_0_, i_3_, i, i_1_);
        } else if ((i_1_ ^ 0xffffffff) == -2)
            OutputStream_Sub1.method129(i_4_, 121, i, i_2_, i_3_, i_0_);
        else
            Class304.method3207(i_1_, i_2_, i, i_0_, (byte) 75, i_3_, i_4_);
        if (i_5_ <= 37)
            aClass129Array7247 = null;
    }

    public static void method2589(byte i) {
        aClass129Array7247 = null;
        anIntArray7250 = null;
        if (i <= 78)
            method2588(83, -13, -101, 109, 71, -68, 65);
    }

    Node_Sub35(int i) {
        ((Node_Sub35) this).aBoolean7242 = false;
        ((Node_Sub35) this).anInt7243 = i;
    }
}
