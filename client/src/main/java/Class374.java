/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class374 {
    static int anInt4593;
    static int anInt4594;
    static Class381 aClass381_4595;
    static int anInt4596;
    static int anInt4597 = 0;

    public static void method3873(byte i) {
        if (i <= -58)
            aClass381_4595 = null;
    }

    static final Node_Sub8_Sub18 method3874(int i, int i_0_) {
        anInt4596++;
        Node_Sub8_Sub18 class248_sub8_sub18 = ((Node_Sub8_Sub18) Class340_Sub7.aClass365_8165.method3826((long) i, i_0_ + 7549));
        if (i_0_ != -7550)
            aClass381_4595 = null;
        if (class248_sub8_sub18 != null)
            return class248_sub8_sub18;
        byte[] is = Class246.aClass381_2778.method3922((byte) 123, i, 0);
        if (is == null || is.length <= 1)
            return null;
        try {
            class248_sub8_sub18 = Class241.method1926((byte) -43, is);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage() + " S: " + i);
        }
        Class340_Sub7.aClass365_8165.method3825((long) i, (byte) 88, class248_sub8_sub18);
        return class248_sub8_sub18;
    }

    static final void method3875(int i, boolean bool) {
        anInt4594++;
        if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -3)
            i = 0;
        if (bool != false)
            method3874(55, -84);
        Node_Sub2_Sub2.anInt8840 = i;
        Class158.aClass346_Sub8Array1877 = (new Class346_Sub8
                [Class186.anIntArray2168[Node_Sub2_Sub2.anInt8840] + 1]);
        Node_Sub29.anInt7168 = 0;
        Node_Sub14_Sub15.anInt9323 = 0;
    }

    static final void method3876(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
        if (i != 0)
            anInt4597 = 60;
        if (Class181.anInt2099 <= i_2_ && (aa_Sub3.anInt5270 ^ 0xffffffff) <= (i_2_ ^ 0xffffffff)) {
            i_1_ = Class49.method389(Class289.anInt3399, 49, Class302.anInt3500, i_1_);
            i_4_ = Class49.method389(Class289.anInt3399, 80, Class302.anInt3500, i_4_);
            Class156.method1375(i_2_, i_4_, i_1_, i_3_, (byte) -47);
        }
        anInt4593++;
    }
}
