/* Class185_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class185_Sub1 extends Class185 {
    Class194[] aClass194Array6650;
    static IncommingOpcode aIncommingOpcode_6651;
    static int anInt6652;
    static boolean aBoolean6653 = false;
    static int anInt6654;
    static Class381 aClass381_6655;
    static int anInt6656;

    static final void method1623(int i) {
        if (i != 6)
            aIncommingOpcode_6651 = null;
        synchronized (Class340.aClass278_3953) {
            Class340.aClass278_3953.method2872((byte) -78);
        }
        anInt6656++;
    }

    public static void method1624(byte i) {
        if (i != 62)
            method1624((byte) 125);
        aIncommingOpcode_6651 = null;
        aClass381_6655 = null;
    }

    static final void method1625(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt6652++;
        if ((i_3_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
            for (int i_4_ = i_3_; i_4_ < i; i_4_++)
                Class156.anIntArrayArray1867[i_4_][i_0_] = i_1_;
        } else {
            for (int i_5_ = i; i_5_ < i_3_; i_5_++)
                Class156.anIntArrayArray1867[i_5_][i_0_] = i_1_;
        }
        if (i_2_ != 6)
            anInt6654 = -41;
    }

    Class185_Sub1(Class194[] class194s) {
        ((Class185_Sub1) this).aClass194Array6650 = class194s;
    }

    static {
        aIncommingOpcode_6651 = new IncommingOpcode(7, 6);
    }
}
