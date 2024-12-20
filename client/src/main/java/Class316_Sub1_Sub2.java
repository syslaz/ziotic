/* Class316_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class316_Sub1_Sub2 extends Class316_Sub1 {
    private int anInt9849;
    static Class5 aClass5_9850;
    private int anInt9851;
    static int anInt9852;
    private Class136_Sub3 aClass136_Sub3_9853;
    private ha_Sub2 aHa_Sub2_9854;
    static int anInt9855;
    private int anInt9856;
    static Class129 aClass129_9857;
    private int anInt9858;
    static int cameraPosZ;
    static String aString9860 = null;
    static int[] anIntArray9861 = new int[1000];
    static OutgoingOpcode aOutgoingOpcode_9862;
    private int anInt9863;
    static boolean aBoolean9864;
    private int anInt9865;

    public static void method3299(int i) {
        aOutgoingOpcode_9862 = null;
        aClass129_9857 = null;
        anIntArray9861 = null;
        aString9860 = null;
        aClass5_9850 = null;
        if (i <= 100)
            method3299(61);
    }

    final Class136_Sub3 method3293(boolean bool) {
        anInt9852++;
        if (aClass136_Sub3_9853 == null) {
            Class27.anIntArray365[5] = anInt9849;
            Class27.anIntArray365[1] = anInt9863;
            Class27.anIntArray365[2] = anInt9865;
            Class27.anIntArray365[4] = anInt9858;
            d var_d = ((ha) aHa_Sub2_9854).aD1414;
            Class27.anIntArray365[3] = anInt9856;
            Class27.anIntArray365[0] = anInt9851;
            boolean bool_0_ = false;
            int i = 0;
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7; i_1_++) {
                if (!var_d.method23(Class27.anIntArray365[i_1_], -32345))
                    return null;
                Class312 class312 = var_d.method25(Class27.anIntArray365[i_1_], (byte) 125);
                int i_2_ = ((Class312) class312).aBoolean3636 ? 64 : 128;
                if ((((Class312) class312).aByte3623 ^ 0xffffffff) < -1)
                    bool_0_ = true;
                if (i_2_ > i)
                    i = i_2_;
            }
            for (int i_3_ = 0; i_3_ < 6; i_3_++)
                Class171.anIntArrayArray1988[i_3_] = var_d.method24(-127, i, 1.0F, false, Class27.anIntArray365[i_3_], i);
            aClass136_Sub3_9853 = new Class136_Sub3(aHa_Sub2_9854, 6407, i, bool_0_, Class171.anIntArrayArray1988);
        }
        if (bool != true)
            return null;
        return aClass136_Sub3_9853;
    }

    Class316_Sub1_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt9856 = i_6_;
        anInt9858 = i_7_;
        anInt9849 = i_8_;
        anInt9851 = i;
        aHa_Sub2_9854 = var_ha_Sub2;
        anInt9865 = i_5_;
        anInt9863 = i_4_;
    }

    static {
        aClass5_9850 = new Class5();
        aBoolean9864 = false;
        aOutgoingOpcode_9862 = new OutgoingOpcode(80, 7);
    }
}
