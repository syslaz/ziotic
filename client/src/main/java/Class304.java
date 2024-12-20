/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class304 {
    static Class278 aClass278_3529;
    static boolean[] aBooleanArray3530 = new boolean[100];
    static int anInt3531 = 0;
    static int anInt3532;
    static int anInt3533;
    static Class157 aClass157_3534;
    static boolean aBoolean3535;

    static final void method3207(int i, int i_0_, int i_1_, int i_2_, byte i_3_, int i_4_, int i_5_) {
        anInt3533++;
        if (i_3_ == 75) {
            int i_6_ = Class49.method389(aa_Sub3.anInt5270, 76, Class181.anInt2099, i_4_);
            int i_7_ = Class49.method389(aa_Sub3.anInt5270, 37, Class181.anInt2099, i_2_);
            int i_8_ = Class49.method389(Class289.anInt3399, 9, Class302.anInt3500, i_1_);
            int i_9_ = Class49.method389(Class289.anInt3399, 117, Class302.anInt3500, i_0_);
            int i_10_ = Class49.method389(aa_Sub3.anInt5270, 91, Class181.anInt2099, i + i_4_);
            int i_11_ = Class49.method389(aa_Sub3.anInt5270, 29, Class181.anInt2099, -i + i_2_);
            for (int i_12_ = i_6_; (i_10_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++)
                Class149.method1331(i_5_, i_3_ + -164, i_8_, Class156.anIntArrayArray1867[i_12_], i_9_);
            for (int i_13_ = i_7_; i_11_ < i_13_; i_13_--)
                Class149.method1331(i_5_, i_3_ ^ ~0x2b, i_8_, Class156.anIntArrayArray1867[i_13_], i_9_);
            int i_14_ = Class49.method389(Class289.anInt3399, 47, Class302.anInt3500, i_1_ + i);
            int i_15_ = Class49.method389(Class289.anInt3399, 69, Class302.anInt3500, i_0_ - i);
            for (int i_16_ = i_10_; i_16_ <= i_11_; i_16_++) {
                int[] is = Class156.anIntArrayArray1867[i_16_];
                Class149.method1331(i_5_, i_3_ ^ ~0x75, i_8_, is, i_14_);
                Class149.method1331(i_5_, i_3_ ^ ~0xb, i_15_, is, i_9_);
            }
        }
    }

    static final void method3208(int i) {
        anInt3532++;
        Node_Sub30 class248_sub30 = (Node_Sub30) Class225_Sub2.aClass293_8466.method3119(2);
        if (i != 2249)
            method3207(28, -115, 84, -80, (byte) 24, 124, -5);
        for (/**/; class248_sub30 != null; class248_sub30 = (Node_Sub30) Class225_Sub2.aClass293_8466.method3107(i + -2377))
            Node_Sub42_Sub2.method2635(i ^ ~0x8a1, false, class248_sub30);
        for (class248_sub30 = ((Node_Sub30) IOException_Sub1.aClass293_82.method3119(2)); class248_sub30 != null; class248_sub30 = (Node_Sub30) IOException_Sub1.aClass293_82.method3107(i + -2377))
            Node_Sub42_Sub2.method2635(12, true, class248_sub30);
    }

    public static void method3209(int i) {
        aClass157_3534 = null;
        if (i != 100)
            method3207(-53, 48, 101, 24, (byte) -42, -114, 3);
        aClass278_3529 = null;
        aBooleanArray3530 = null;
    }

    static {
        aClass278_3529 = new Class278(30);
        aBoolean3535 = false;
    }
}
