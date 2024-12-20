/* Class282_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub7 extends Class282 {
    static int anInt7654;
    static int anInt7655 = 0;
    static int anInt7656;
    static int anInt7657;
    static short[][] aShortArrayArray7658;
    static int anInt7659;
    private static short[] aShortArray7660 = {967, 20428, -21577, 11219, -10290};
    static float aFloat7661 = 0.0F;
    private static short[] aShortArray7662;
    static int anInt7663;
    private static short[] aShortArray7664 = {962, 20423, -21582, 11214, -10295};
    private static short[] aShortArray7665 = {957, 20418, -21587, 11209, -10300};
    static byte[][] aByteArrayArray7666;
    static int anInt7667;

    public static void method2947(int i) {
        aShortArrayArray7658 = null;
        aByteArrayArray7666 = null;
        aShortArray7662 = null;
        if (i != 20418)
            method2948(-6, null);
        aShortArray7664 = null;
        aShortArray7665 = null;
        aShortArray7660 = null;
    }

    static final void method2948(int i, Node_Sub8_Sub11 class248_sub8_sub11) {
        anInt7656++;
        if (!Class145.aBoolean1721) {
            if (i != 0)
                method2948(-116, null);
            class248_sub8_sub11.remove(true);
            Class379.anInt4638--;
            if (((Node_Sub8_Sub11) class248_sub8_sub11).aBoolean8991) {
                for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method492(i + 896)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
                    if (((Node_Sub8_Sub5) class248_sub8_sub5).aString8934.equals(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001)) {
                        boolean bool = false;
                        for (Node_Sub8_Sub11 class248_sub8_sub11_0_ = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936.method492(896)); class248_sub8_sub11_0_ != null; class248_sub8_sub11_0_ = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936.method490(true))) {
                            if (class248_sub8_sub11 == class248_sub8_sub11_0_) {
                                bool = true;
                                if (class248_sub8_sub5.method2052(class248_sub8_sub11, 0))
                                    Node_Sub14_Sub10.method2302(true, class248_sub8_sub5);
                                break;
                            }
                        }
                        if (bool)
                            break;
                    }
                }
            } else {
                long l = ((Node_Sub8_Sub11) class248_sub8_sub11).aLong8994;
                Node_Sub8_Sub5 class248_sub8_sub5;
                for (class248_sub8_sub5 = ((Node_Sub8_Sub5) Class14.aClass65_267.method501(l, (byte) 31)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class14.aClass65_267.method507((byte) 67))) {
                    if (((Node_Sub8_Sub5) class248_sub8_sub5).aString8934.equals(((Node_Sub8_Sub11) class248_sub8_sub11).aString9001))
                        break;
                }
                if (class248_sub8_sub5 != null && class248_sub8_sub5.method2052(class248_sub8_sub11, 0))
                    Node_Sub14_Sub10.method2302(true, class248_sub8_sub5);
            }
        }
    }

    final void method2918(byte i) {
        if (i != 98)
            aShortArrayArray7658 = null;
        anInt7667++;
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool != true)
            method2948(76, null);
        anInt7657++;
    }

    final int method2917(int i, int i_1_) {
        if (i != 0)
            return -60;
        anInt7663++;
        return 1;
    }

    final int method2919(boolean bool) {
        if (bool != false)
            return -13;
        anInt7659++;
        return 0;
    }

    Class282_Sub7(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2949(boolean bool) {
        if (bool != true)
            aShortArrayArray7658 = null;
        anInt7654++;
        return ((Class282) this).anInt3320;
    }

    Class282_Sub7(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    static {
        aShortArray7662 = new short[]{952, 20413, -21592, 11204, -10305};
        aShortArrayArray7658 = new short[][]{aShortArray7660, aShortArray7664, aShortArray7665, aShortArray7662};
    }
}
