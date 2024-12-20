/* za_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.heap.NativeHeap;

final class za_Sub2 extends za {
    static int anInt9804;
    static OutgoingOpcode aOutgoingOpcode_9805 = new OutgoingOpcode(13, 8);
    static int anInt9806;
    static IncommingOpcode aIncommingOpcode_9807;
    static int anInt9808;
    static int anInt9809 = 1339;
    NativeHeap aNativeHeap9810;

    final void method2691(boolean bool) {
        anInt9804++;
        ((za_Sub2) this).aNativeHeap9810.b();
        if (bool != false)
            ((za_Sub2) this).aNativeHeap9810 = null;
    }

    static final void method2692(boolean bool) {
        anInt9808++;
        Class211.anIntArray2442 = Node_Sub14_Sub19.method2334(107, 0.4F, 8, 8, 4, 35, bool, 2048);
    }

    public static void method2693(byte i) {
        aIncommingOpcode_9807 = null;
        if (i <= 4)
            anInt9809 = 80;
        aOutgoingOpcode_9805 = null;
    }

    static final void method2694(byte i) {
        int i_0_ = 23 % ((-45 - i) / 47);
        Class162.aStringArray1909 = new String[500];
        Class128.anInt1567 = (((Class285) Class264.aClass285_2996).anInt3368 + (((Class285) Class264.aClass285_2996).anInt3370 - -2));
        anInt9806++;
        Class83.anInt1031 = (2 + ((Class285) Node_Sub14_Sub31.aClass285_9492).anInt3368 + ((Class285) Node_Sub14_Sub31.aClass285_9492).anInt3370);
        for (int i_1_ = 0; Class162.aStringArray1909.length > i_1_; i_1_++)
            Class162.aStringArray1909[i_1_] = "";
        Class106.method750(Class41.aClass41_466.method301(Class191.anInt4822, (byte) -108), (byte) 126);
    }

    za_Sub2(int i) {
        ((za_Sub2) this).aNativeHeap9810 = new NativeHeap(i);
    }

    static {
        aIncommingOpcode_9807 = new IncommingOpcode(59, 0);
    }
}
