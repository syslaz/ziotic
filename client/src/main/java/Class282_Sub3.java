/* Class282_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub3 extends Class282 {
    static int anInt7614;
    static int anInt7615;
    static IncommingOpcode aIncommingOpcode_7616 = new IncommingOpcode(37, 7);
    static int anInt7617;
    static int anInt7618;
    static int anInt7619;
    static int anInt7620;
    static OutgoingOpcode aOutgoingOpcode_7621 = new OutgoingOpcode(31, -1);
    static int[] anIntArray7622 = new int[3];

    Class282_Sub3(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2922(boolean bool, int i) {
        if (bool == true) {
            anInt7617++;
            ((Class282) this).anInt3320 = i;
        }
    }

    public static void method2931(boolean bool) {
        aOutgoingOpcode_7621 = null;
        anIntArray7622 = null;
        aIncommingOpcode_7616 = null;
        if (bool != false)
            aOutgoingOpcode_7621 = null;
    }

    final int method2917(int i, int i_0_) {
        anInt7620++;
        if (i != 0)
            method2931(false);
        return 3;
    }

    Class282_Sub3(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2919(boolean bool) {
        if (bool != false)
            method2932(true);
        anInt7618++;
        if (!((Class282) this).aClass248_Sub45_3321.method2644(0))
            return 0;
        return 1;
    }

    final int method2932(boolean bool) {
        anInt7619++;
        if (bool != true)
            method2922(true, 14);
        return ((Class282) this).anInt3320;
    }

    final void method2918(byte i) {
        ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            anIntArray7622 = null;
        anInt7614++;
    }
}
