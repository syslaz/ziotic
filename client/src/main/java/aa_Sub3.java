/* aa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub3 extends aa {
    Interface21_Impl2 anInterface21_Impl2_5263;
    static int anInt5264;
    static int[] anIntArray5265 = {1, 2, 4, 8};
    static int anInt5266;
    static int anInt5267;
    static OutgoingOpcode aOutgoingOpcode_5268 = new OutgoingOpcode(72, 16);
    static int[] anIntArray5269 = {0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
    static int anInt5270 = 100;

    static final void method165(Class129[] class129s, int i) {
        anInt5266++;
        Class46.anInt599 = class129s.length;
        Node_Sub14_Sub21.anIntArray9380 = new int[Class46.anInt599 + 10];
        Node_Sub14_Sub11.aClass129Array9254 = new Class129[10 + Class46.anInt599];
        Class159.method1399(class129s, 0, Node_Sub14_Sub11.aClass129Array9254, 0, Class46.anInt599);
        for (int i_0_ = 0; i_0_ < Class46.anInt599; i_0_++)
            Node_Sub14_Sub21.anIntArray9380[i_0_] = Node_Sub14_Sub11.aClass129Array9254[i_0_].method1181();
        int i_1_ = -100 / ((i - -43) / 57);
        for (int i_2_ = Class46.anInt599; Node_Sub14_Sub11.aClass129Array9254.length > i_2_; i_2_++)
            Node_Sub14_Sub21.anIntArray9380[i_2_] = 12;
    }

    public static void method166(byte i) {
        if (i != -38)
            method165(null, -73);
        anIntArray5269 = null;
        aOutgoingOpcode_5268 = null;
        anIntArray5265 = null;
    }

    static final void method167(int i, ha var_ha, int i_3_, int i_4_, int i_5_, byte i_6_) {
        Class301.aHa4933 = var_ha;
        int i_7_ = -45 % ((i_6_ - 14) / 59);
        anInt5264++;
        Node_Sub14_Sub30.aViewport_9479 = Class301.aHa4933.e();
        Class333.aViewport_3895 = Class301.aHa4933.e();
        Node_Sub11.aViewport_6952 = Class301.aHa4933.e();
        Class151.anInt1806 = i_4_;
        Node_Sub15_Sub4.anInt9694 = 0;
        Class341.anIntArray3970 = null;
        Class183.anInterface14Array2136 = null;
        Class296.anInt3461 = i;
        Node_Sub8_Sub1.method2027(27424, i_3_, i_5_);
        Class2.anInt118 = -1;
        s_Sub2.anInt7955 = -1;
        Class225_Sub1.anInt8451 = -1;
    }

    aa_Sub3(ha_Sub3 var_ha_Sub3, int i, int i_8_, byte[] is) {
        ((aa_Sub3) this).anInterface21_Impl2_5263 = var_ha_Sub3.method972(is, 0, i, Class130.aClass264_1573, i_8_, false);
        ((aa_Sub3) this).anInterface21_Impl2_5263.method70(1645, false, false);
    }

    aa_Sub3(ha_Sub3 var_ha_Sub3, int i, int i_9_, int[] is) {
        ((aa_Sub3) this).anInterface21_Impl2_5263 = var_ha_Sub3.method1033(i, is, (byte) -78, false, i_9_);
        ((aa_Sub3) this).anInterface21_Impl2_5263.method70(1645, false, false);
    }
}
