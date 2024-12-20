/* Class282_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub18 extends Class282 {
    static int anInt7775;
    static int anInt7776;
    static int anInt7777;
    static int anInt7778;
    static int anInt7779;
    static int anInt7780;
    static int anInt7781;

    final void method2918(byte i) {
        anInt7778++;
        if (((Class282) this).anInt3320 < 0 && (((Class282) this).anInt3320 ^ 0xffffffff) < -5)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            anInt7780 = -108;
    }

    final int method2917(int i, int i_0_) {
        anInt7776++;
        if (i != 0)
            return 45;
        return 1;
    }

    final void method2922(boolean bool, int i) {
        anInt7775++;
        if (bool == true)
            ((Class282) this).anInt3320 = i;
    }

    Class282_Sub18(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2919(boolean bool) {
        anInt7777++;
        if ((((Class282) this).aClass248_Sub45_3321.method2652(-18640).method755(-47) ^ 0xffffffff) < -2)
            return 4;
        if (bool != false)
            method2997(true);
        return 2;
    }

    Class282_Sub18(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    static final boolean method2996(int i, int i_1_, int i_2_) {
        anInt7781++;
        if (i_1_ != 4)
            method2996(122, 94, -120);
        if ((0x10000 & i_2_ ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final int method2997(boolean bool) {
        if (bool != true)
            method2996(6, 83, -37);
        anInt7779++;
        return ((Class282) this).anInt3320;
    }
}
