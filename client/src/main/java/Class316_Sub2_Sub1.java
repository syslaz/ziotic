/* Class316_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class316_Sub2_Sub1 extends Class316_Sub2 {
    private int anInt9866;
    private int anInt9867;
    private Interface21_Impl3 anInterface21_Impl3_9868;
    static long aLong9869 = 0L;
    static Interface14 anInterface14_9870;
    private int anInt9871;
    private int anInt9872;
    private int anInt9873;
    static float[] aFloatArray9874 = new float[4];
    private ha_Sub3 aHa_Sub3_9875;
    static IncommingOpcode aIncommingOpcode_9876 = new IncommingOpcode(53, -2);
    private int anInt9877;
    static int anInt9878;

    final Interface21_Impl3 method3303(byte i) {
        anInt9878++;
        if (anInterface21_Impl3_9868 == null) {
            d var_d = ((ha) aHa_Sub3_9875).aD1414;
            Class226_Sub2.anIntArray6666[4] = anInt9873;
            Class226_Sub2.anIntArray6666[3] = anInt9872;
            Class226_Sub2.anIntArray6666[1] = anInt9866;
            Class226_Sub2.anIntArray6666[5] = anInt9877;
            Class226_Sub2.anIntArray6666[2] = anInt9867;
            Class226_Sub2.anIntArray6666[0] = anInt9871;
            boolean bool = false;
            int i_0_ = 0;
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7; i_1_++) {
                if (!var_d.method23(Class226_Sub2.anIntArray6666[i_1_], -32345))
                    return null;
                Class312 class312 = var_d.method25(Class226_Sub2.anIntArray6666[i_1_], (byte) 125);
                int i_2_ = ((Class312) class312).aBoolean3636 ? 64 : 128;
                if ((i_0_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
                    i_0_ = i_2_;
                if ((((Class312) class312).aByte3623 ^ 0xffffffff) < -1)
                    bool = true;
            }
            for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -7; i_3_++)
                Node_Sub14_Sub24.anIntArrayArray9397[i_3_] = var_d.method24(-126, i_0_, 1.0F, false, Class226_Sub2.anIntArray6666[i_3_], i_0_);
            anInterface21_Impl3_9868 = aHa_Sub3_9875.method938((byte) -125, bool, (Node_Sub14_Sub24.anIntArrayArray9397), i_0_);
        }
        if (i >= -66)
            method3304(-56);
        return anInterface21_Impl3_9868;
    }

    public static void method3304(int i) {
        if (i != 4)
            aIncommingOpcode_9876 = null;
        anInterface14_9870 = null;
        aIncommingOpcode_9876 = null;
        aFloatArray9874 = null;
    }

    Class316_Sub2_Sub1(ha_Sub3 var_ha_Sub3, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt9873 = i_7_;
        anInt9866 = i_4_;
        anInt9867 = i_5_;
        anInt9877 = i_8_;
        anInt9872 = i_6_;
        aHa_Sub3_9875 = var_ha_Sub3;
        anInt9871 = i;
    }
}
