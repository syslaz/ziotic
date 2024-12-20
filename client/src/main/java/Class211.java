/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class211 {
    String aString2436;
    String aString2437;
    static boolean aBoolean2438 = false;
    static int anInt2439;
    String aString2440;
    String aString2441;
    static int[] anIntArray2442;
    static int anInt2443;
    byte aByte2444;
    static OutgoingOpcode aOutgoingOpcode_2445 = new OutgoingOpcode(5, 7);
    static long aLong2446;
    int anInt2447;
    static Image anImage2448;
    static float[] aFloatArray2449 = new float[4];

    static final void method1727(Class381 class381, int i) {
        int i_0_ = 121 % ((44 - i) / 61);
        Class293.anInt3438 = class381.method3927((byte) 105, "p11_full");
        anInt2443++;
        Class214.anInt2474 = class381.method3927((byte) 112, "p12_full");
        Class340.anInt3961 = class381.method3927((byte) 61, "b12_full");
    }

    public static void method1728(int i) {
        aOutgoingOpcode_2445 = null;
        aFloatArray2449 = null;
        anIntArray2442 = null;
        anImage2448 = null;
        if (i != -2001)
            aOutgoingOpcode_2445 = null;
    }

    static final boolean method1729(int i) {
        anInt2439++;
        if (Node_Sub14_Sub32.aClass248_Sub8_Sub11_9503 == null)
            return false;
        if ((((Node_Sub8_Sub11) Node_Sub14_Sub32.aClass248_Sub8_Sub11_9503).anInt8999 ^ 0xffffffff) <= -2001)
            ((Node_Sub8_Sub11) Node_Sub14_Sub32.aClass248_Sub8_Sub11_9503).anInt8999 -= 2000;
        if ((((Node_Sub8_Sub11) Node_Sub14_Sub32.aClass248_Sub8_Sub11_9503).anInt8999 ^ 0xffffffff) == -1004)
            return true;
        if (i != -555)
            method1728(52);
        return false;
    }

    public Class211() {
        /* empty */
    }
}
