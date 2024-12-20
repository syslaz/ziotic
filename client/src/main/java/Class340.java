/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class340 {
    static int anInt3950;
    static int anInt3951;
    static int anInt3952;
    static Class278 aClass278_3953;
    ha_Sub3 aHa_Sub3_3954;
    static int anInt3955;
    static int anInt3956;
    static int anInt3957;
    static int anInt3958;
    static int anInt3959 = 0;
    static int anInt3960;
    static int anInt3961;
    static IncommingOpcode aIncommingOpcode_3962;
    static Class156[] aClass156Array3963;
    static boolean aBoolean3964;
    static int[] anIntArray3965;
    static Class346_Sub5_Sub2_Sub1[] aClass346_Sub5_Sub2_Sub1Array3966;
    static float aFloat3967;

    void method3431(int i) {
        if (i == 4095)
            anInt3960++;
    }

    abstract boolean method3432(int i);

    abstract void method3433(int i, int i_0_, int i_1_);

    static final int method3434(int i, int i_2_, int i_3_, int i_4_) {
        i_2_ &= 0x3;
        anInt3958++;
        if (i_2_ == 0)
            return i;
        if (i_3_ != 4095)
            return 40;
        if (i_2_ == 1)
            return 4095 - i_4_;
        if (i_2_ == 2)
            return -i + 4095;
        return i_4_;
    }

    abstract void method3435(boolean bool, int i);

    void method3436(int i) {
        if (i != 3)
            aIncommingOpcode_3962 = null;
        anInt3951++;
    }

    void method3437(boolean bool) {
        anInt3956++;
        if (bool != true)
            method3434(-1, 35, 21, 103);
    }

    void method3438(byte i) {
        if (i <= 115)
            ((Class340) this).aHa_Sub3_3954 = null;
        anInt3957++;
    }

    void method3439(byte i) {
        int i_5_ = -127 / ((i - -46) / 55);
        anInt3950++;
    }

    public static void method3440(int i) {
        aClass278_3953 = null;
        anIntArray3965 = null;
        aClass156Array3963 = null;
        aIncommingOpcode_3962 = null;
        aClass346_Sub5_Sub2_Sub1Array3966 = null;
        if (i != -12296)
            method3434(-93, 52, -107, 120);
    }

    abstract void method3441(boolean bool);

    abstract void method3442(Interface21 interface21, int i, byte i_6_);

    Class340(ha_Sub3 var_ha_Sub3) {
        ((Class340) this).aHa_Sub3_3954 = var_ha_Sub3;
    }

    abstract void method3443(boolean bool, boolean bool_7_);

    void method3444(int i) {
        if (i != 4095)
            aFloat3967 = -0.25924885F;
        anInt3955++;
    }

    static final boolean method3445(int i, int i_8_, int i_9_) {
        if (i_9_ != 8)
            return true;
        anInt3952++;
        if (!(Class346_Sub7_Sub5_Sub2.method3698(i, i_8_, 33) | (i & 0x70000) != 0) && !Node_Sub14.method2270(i, i_8_, (byte) 8))
            return false;
        return true;
    }

    static {
        aClass278_3953 = new Class278(32);
        anIntArray3965 = new int[1000];
        aBoolean3964 = false;
        aIncommingOpcode_3962 = new IncommingOpcode(58, 8);
    }
}
