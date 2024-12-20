/* Class282_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub20 extends Class282 {
    static Class129[] aClass129Array7795;
    static int anInt7796;
    static int anInt7797;
    static int anInt7798;
    static int anInt7799;
    static int anInt7800;
    static int anInt7801;
    static int anInt7802;
    static int anInt7803;

    final void method2918(byte i) {
        anInt7797++;
        int i_0_ = ((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(true);
        if ((i_0_ ^ 0xffffffff) > -97)
            ((Class282) this).anInt3320 = 0;
        if (((Class282) this).anInt3320 > 1 && i_0_ < 128)
            ((Class282) this).anInt3320 = 1;
        if (((Class282) this).anInt3320 > 2 && i_0_ < 192)
            ((Class282) this).anInt3320 = 2;
        if (((Class282) this).anInt3320 < 0 || (((Class282) this).anInt3320 ^ 0xffffffff) < -4)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            aClass129Array7795 = null;
    }

    final boolean method3002(int i) {
        anInt7803++;
        int i_1_ = ((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(true);
        if (i != 260)
            method2917(99, 127);
        if ((i_1_ ^ 0xffffffff) > -97)
            return false;
        return true;
    }

    final int method3003(boolean bool) {
        if (bool != true)
            return 12;
        anInt7801++;
        return ((Class282) this).anInt3320;
    }

    final int method2917(int i, int i_2_) {
        anInt7796++;
        int i_3_ = ((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(true);
        if (i != 0)
            aClass129Array7795 = null;
        if (i_3_ < 96)
            return 3;
        if (i_2_ > 1 && i_3_ < 128)
            return 3;
        if ((i_2_ ^ 0xffffffff) < -4 && (i_3_ ^ 0xffffffff) > -193)
            return 3;
        return 1;
    }

    Class282_Sub20(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    public static void method3004(int i) {
        aClass129Array7795 = null;
        if (i != -30504)
            method3005(-111, 12, 119);
    }

    final int method2919(boolean bool) {
        anInt7798++;
        if (bool != false)
            method3003(false);
        return 0;
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool != true)
            anInt7800 = 68;
        anInt7799++;
    }

    Class282_Sub20(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    static final boolean method3005(int i, int i_4_, int i_5_) {
        if (i_4_ != 192)
            anInt7800 = 35;
        anInt7802++;
        return (Class36.method282(5, i_5_, i) & Class249_Sub2.method2703(i_5_, i, i_4_ + -192));
    }
}
