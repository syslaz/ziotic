/* Class248_Sub8_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub16_Sub1 extends Node_Sub8_Sub16 {
    private Object anObject10297;
    static int anInt10298;
    static int anInt10299;
    static int anInt10300;
    static client aClient10301;
    static IncommingOpcode aIncommingOpcode_10302 = new IncommingOpcode(90, -2);
    static int anInt10303 = 0;

    Node_Sub8_Sub16_Sub1(Object object, int i) {
        super(i);
        anObject10297 = object;
    }

    static final void method2138(int i, int i_0_, int i_1_) {
        anInt10299++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_0_, -874792672, 14);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i;
        if (i_1_ != -2)
            aClient10301 = null;
    }

    public static void method2139(int i) {
        aClient10301 = null;
        if (i <= 67)
            method2139(96);
        aIncommingOpcode_10302 = null;
    }

    final Object method2135(int i) {
        anInt10300++;
        if (i != 75)
            method2135(-114);
        return anObject10297;
    }

    final boolean method2136(byte i) {
        anInt10298++;
        if (i < 7)
            aClient10301 = null;
        return false;
    }
}
