/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class27 {
    Class360 aClass360_358 = new Class360();
    static int anInt359;
    static OutgoingOpcode aOutgoingOpcode_360 = new OutgoingOpcode(28, -1);
    static int[][] anIntArrayArray361;
    static int anInt362;
    static int anInt363;
    static byte aByte364;
    static int[] anIntArray365 = new int[6];
    static boolean aBoolean366;
    boolean aBoolean367 = false;

    final void method253(int i, Class346_Sub10 class346_sub10) {
        anInt362++;
        Interactable interactable = ((Class346_Sub10) class346_sub10).aInteractable_8355;
        boolean bool = true;
        Class346_Sub9[] class346_sub9s = ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353;
        for (int i_0_ = i; class346_sub9s.length > i_0_; i_0_++) {
            if (((Class346_Sub9) class346_sub9s[i_0_]).aBoolean8342) {
                bool = false;
                break;
            }
        }
        if (!bool) {
            if (((Class27) this).aBoolean367) {
                for (Class346_Sub10 class346_sub10_1_ = (Class346_Sub10) ((Class27) this).aClass360_358.method3815((byte) 58); class346_sub10_1_ != null; class346_sub10_1_ = (Class346_Sub10) ((Class27) this).aClass360_358.method3809(-24951)) {
                    if ((((Class346_Sub10) class346_sub10_1_).aInteractable_8355) == interactable) {
                        class346_sub10_1_.method3538(-128);
                        Class256.method2749(class346_sub10_1_, (byte) 31);
                    }
                }
            }
            for (Class346_Sub10 class346_sub10_2_ = ((Class346_Sub10) ((Class27) this).aClass360_358.method3815((byte) 125)); class346_sub10_2_ != null; class346_sub10_2_ = ((Class346_Sub10) ((Class27) this).aClass360_358.method3809(-24951))) {
                if ((((Interactable) interactable).anInt8316 ^ 0xffffffff) <= (((Interactable) (((Class346_Sub10) class346_sub10_2_).aInteractable_8355)).anInt8316 ^ 0xffffffff)) {
                    Class79.method576((byte) -117, class346_sub10_2_, class346_sub10);
                    return;
                }
            }
            ((Class27) this).aClass360_358.method3811(class346_sub10, 0);
        }
    }

    final void method254(int i) {
        for (; ; ) {
            Class346_Sub10 class346_sub10 = ((Class346_Sub10) ((Class27) this).aClass360_358.method3814(false));
            if (class346_sub10 == null)
                break;
            class346_sub10.method3538(-128);
            Class256.method2749(class346_sub10, (byte) 31);
        }
        if (i == 28)
            anInt359++;
    }

    static final void method255(boolean bool, byte i) {
        Class206.anInt4988++;
        anInt363++;
        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class116_Sub1.aOutgoingOpcode_6277);
        Class226_Sub3.method1814(class248_sub36, 0);
        int i_3_ = -9 % ((i - -25) / 45);
        for (Node_Sub12 class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method510(true); class248_sub12 != null; class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method512(false)) {
            if (!class248_sub12.hasNext((byte) 78)) {
                class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method510(true);
                if (class248_sub12 == null)
                    break;
            }
            if ((((Node_Sub12) class248_sub12).anInt6960 ^ 0xffffffff) == -1)
                Class106.method749(false, bool, true, class248_sub12);
        }
        if (Class282_Sub17.aClass354_7773 != null) {
            Class376.method3882(Class282_Sub17.aClass354_7773, 2260);
            Class282_Sub17.aClass354_7773 = null;
        }
    }

    public static void method256(int i) {
        anIntArrayArray361 = null;
        anIntArray365 = null;
        if (i < 88)
            anIntArrayArray361 = null;
        aOutgoingOpcode_360 = null;
    }

    Class27(boolean bool) {
        ((Class27) this).aBoolean367 = bool;
    }
}
