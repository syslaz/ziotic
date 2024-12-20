/* Class282_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub13 extends Class282 {
    static int anInt7716;
    static int anInt7717;
    static int anInt7718;
    static IncommingOpcode aIncommingOpcode_7719 = new IncommingOpcode(15, 12);
    static int anInt7720;
    static int anInt7721;
    static int anInt7722;

    Class282_Sub13(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2918(byte i) {
        if (((Class282) this).anInt3320 != 1 && ((Class282) this).anInt3320 != 0)
            ((Class282) this).anInt3320 = method2919(false);
        if (i == 98)
            anInt7718++;
    }

    final int method2919(boolean bool) {
        if (bool != false)
            method2922(false, 41);
        anInt7716++;
        return 1;
    }

    final int method2969(boolean bool) {
        anInt7717++;
        if (bool != true)
            method2969(true);
        return ((Class282) this).anInt3320;
    }

    public static void method2970(byte i) {
        if (i != 36)
            aIncommingOpcode_7719 = null;
        aIncommingOpcode_7719 = null;
    }

    static final boolean method2971(int i, int i_0_, byte i_1_) {
        if (i_1_ >= -108)
            return false;
        anInt7722++;
        if (!Class355.method3780((byte) -125, i, i_0_) && !Class212.method1733(i, 13, i_0_))
            return false;
        return true;
    }

    final void method2922(boolean bool, int i) {
        if (bool != true)
            method2917(97, -11);
        anInt7721++;
        ((Class282) this).anInt3320 = i;
    }

    final int method2917(int i, int i_2_) {
        if (i != 0)
            aIncommingOpcode_7719 = null;
        anInt7720++;
        return 1;
    }

    Class282_Sub13(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }
}
