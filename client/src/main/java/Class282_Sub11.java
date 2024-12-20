/* Class282_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub11 extends Class282 {
    static int anInt7697;
    static int anInt7698;
    static int anInt7699;
    static int anInt7700;
    static int anInt7701;
    static Class74 aClass74_7702;
    static String[] aStringArray7703 = new String[200];
    static int anInt7704;
    static int anInt7705;
    static int anInt7706;

    static final boolean method2962(int i, int i_0_, int i_1_) {
        anInt7700++;
        if (i <= 83)
            aStringArray7703 = null;
        return (0x18 & i_1_) != 0 | (i_1_ & 0x220) == 544;
    }

    Class282_Sub11(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2918(byte i) {
        if (((Class282) this).anInt3320 != 1 && ((Class282) this).anInt3320 != 0)
            ((Class282) this).anInt3320 = method2919(false);
        anInt7699++;
        if (i != 98)
            aStringArray7703 = null;
    }

    final int method2919(boolean bool) {
        anInt7698++;
        if (bool != false)
            method2918((byte) -36);
        return 1;
    }

    final int method2963(boolean bool) {
        anInt7704++;
        if (bool != true)
            aClass74_7702 = null;
        return ((Class282) this).anInt3320;
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        anInt7705++;
        if (bool != true)
            method2918((byte) 49);
    }

    Class282_Sub11(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    public static void method2964(byte i) {
        aClass74_7702 = null;
        if (i == 105)
            aStringArray7703 = null;
    }

    static final Class38 method2965(int i, int i_2_, int i_3_, int i_4_, Class162 class162) {
        if (i_4_ != 544)
            method2962(20, -105, -116);
        anInt7697++;
        if (class162 == null)
            return null;
        Class38 class38 = new Class38(i_2_, i_3_, i, class162.na(), class162.V(), class162.RA(), class162.fa(), class162.EA(), class162.HA(), class162.G());
        return class38;
    }

    final int method2917(int i, int i_5_) {
        anInt7701++;
        if (i != 0)
            aClass74_7702 = null;
        return 1;
    }
}
