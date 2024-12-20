/* Class248_Sub8_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub15 extends Node_Sub8 {
    static int anInt9043;
    static int anInt9044;
    static int[] anIntArray9045 = new int[5];
    double aDouble9046;
    short[][] aShortArrayArray9047;
    static int anInt9048;
    static int anInt9049;

    static final void method2130(byte i) {
        if (i != -114)
            anIntArray9045 = null;
        Class225_Sub1_Sub1.method1792(0);
        anInt9049++;
        int i_0_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3010(true);
        do {
            if ((i_0_ ^ 0xffffffff) != -3) {
                if (i_0_ != 3)
                    break;
            } else {
                aa_Sub3.method167(100, Class287.aHa3381, Class282_Sub20.anInt7800, 100, Class146.anInt1724, (byte) -115);
                break;
            }
            Node_Sub40_Sub1.method2615(2, Class120.anInt1512, 117, Class287.aHa3381, Class146.anInt1724, 2, Class282_Sub20.anInt7800, Node_Sub35.anInt7251);
        } while (false);
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3008(2))
            Class238_Sub2.method1893(false, Class297_Sub1.aCanvas8478);
        if (Class287.aHa3381 != null)
            Node_Sub14_Sub35.method2380((byte) -115);
        Class357.aBoolean4416 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3010(true) != 0;
        Node_Sub8_Sub6.aBoolean8949 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub21_7315.method3008(2);
    }

    public static void method2131(byte i) {
        anIntArray9045 = null;
        if (i <= 122)
            method2134(false);
    }

    final long method2132(byte i) {
        if (i <= 49)
            return -98L;
        anInt9043++;
        return (long) ((((Node_Sub8_Sub15) this).aShortArrayArray9047[0]).length | (((Node_Sub8_Sub15) this).aShortArrayArray9047).length << -827133344);
    }

    static final String method2133(int i, RSInterface2 class354) {
        anInt9044++;
        if (i != -1)
            anIntArray9045 = null;
        if (client.method113(class354).method2673(2) == 0)
            return null;
        if (((RSInterface2) class354).aString4283 == null || (((RSInterface2) class354).aString4283.trim().length() ^ 0xffffffff) == -1) {
            if (Class332.aBoolean3874)
                return "Hidden-use";
            return null;
        }
        return ((RSInterface2) class354).aString4283;
    }

    Node_Sub8_Sub15(short[][] is, double d) {
        ((Node_Sub8_Sub15) this).aShortArrayArray9047 = is;
        ((Node_Sub8_Sub15) this).aDouble9046 = d;
    }

    static final void method2134(boolean bool) {
        if (bool != false)
            method2133(82, null);
        anInt9048++;
        PacketStream.aClass278_9121.method2872((byte) -78);
    }
}
