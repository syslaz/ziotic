/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68 {
    static int[] anIntArray904;
    static int[] anIntArray905 = new int[1];
    static int anInt906;

    static final void method521(int i, boolean bool, int i_0_) {
        if (Class185.anInt2164 != i_0_) {
            Node_Sub8_Sub3.anIntArray8921 = new int[i_0_];
            for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
                Node_Sub8_Sub3.anIntArray8921[i_1_] = (i_1_ << 47536396) / i_0_;
            Class226_Sub2.anInt6664 = -1 + i_0_;
            Class185.anInt2164 = i_0_;
            Class334.anInt3906 = i_0_ * 32;
        }
        anInt906++;
        if ((i ^ 0xffffffff) != (Class250.anInt2819 ^ 0xffffffff)) {
            if (i == Class185.anInt2164)
                Node_Sub14_Sub3.anIntArray9184 = Node_Sub8_Sub3.anIntArray8921;
            else {
                Node_Sub14_Sub3.anIntArray9184 = new int[i];
                for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++)
                    Node_Sub14_Sub3.anIntArray9184[i_2_] = (i_2_ << -1866009172) / i;
            }
            Class250.anInt2819 = i;
            za_Sub1.anInt9802 = -1 + i;
        }
        if (bool != false)
            method521(-43, true, 103);
    }

    public static void method522(int i) {
        anIntArray905 = null;
        if (i != 128)
            method521(19, true, 57);
        anIntArray904 = null;
    }

    static {
        anIntArray904 = new int[]{16, 32, 64, 128};
    }
}
