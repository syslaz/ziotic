/* Class282_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub17 extends Class282 {
    static int anInt7766;
    static int anInt7767;
    static IncommingOpcode aIncommingOpcode_7768 = new IncommingOpcode(96, 10);
    static int anInt7769 = 0;
    static int anInt7770;
    static int anInt7771;
    static int anInt7772;
    static RSInterface2 aClass354_7773 = null;
    static int anInt7774;

    final int method2993(boolean bool) {
        if (bool != true)
            method2917(-31, 46);
        anInt7770++;
        return ((Class282) this).anInt3320;
    }

    final int method2919(boolean bool) {
        if (bool != false)
            return -128;
        anInt7774++;
        return 127;
    }

    Class282_Sub17(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2918(byte i) {
        if (i != 98)
            method2919(false);
        anInt7766++;
        if (((Class282) this).anInt3320 < 0 && ((Class282) this).anInt3320 > 127)
            ((Class282) this).anInt3320 = method2919(false);
    }

    public static void method2994(int i) {
        if (i < 87)
            aClass354_7773 = null;
        aClass354_7773 = null;
        aIncommingOpcode_7768 = null;
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool != true)
            method2919(false);
        anInt7767++;
    }

    final int method2917(int i, int i_0_) {
        anInt7772++;
        if (i != 0)
            method2917(-21, -47);
        return 1;
    }

    static final void method2995(byte i) {
        Node_Sub8_Sub1.method2026(22050, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub22_7320.method3014(true) == 1, 2, false);
        anInt7771++;
        Node_Sub8_Sub3.aClass345_8922 = Node_Sub8_Sub13.method2094(0, 22050, Class297_Sub1.aCanvas8478, (byte) 27, (Node_Sub14_Sub15.aClass174_9328));
        int i_1_ = -107 % ((i - 34) / 38);
        Class340_Sub2.method3449(true, Class279_Sub2_Sub2.method2906((byte) -123, null), true);
        Class177.aClass345_2069 = Node_Sub8_Sub13.method2094(1, 2048, Class297_Sub1.aCanvas8478, (byte) 27, (Node_Sub14_Sub15.aClass174_9328));
        Class282_Sub15.aClass248_Sub15_Sub3_7751 = new Node_Sub15_Sub3();
        Class177.aClass345_2069.method3530(Class282_Sub15.aClass248_Sub15_Sub3_7751, 98);
        Player.aClass317_10534 = new Class317(22050, Class54.anInt728);
        Class253_Sub1.method2728(false);
    }

    Class282_Sub17(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }
}
