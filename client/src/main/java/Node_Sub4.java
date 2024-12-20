/* Class248_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub4 extends Node {
    long aLong6831;
    static OutgoingOpcode aOutgoingOpcode_6832 = new OutgoingOpcode(76, -1);
    static int anInt6833 = -2;
    static int[] anIntArray6834;
    static int anInt6835;
    static String aString6836 = null;

    static final void method2008(int i) {
        Class21.anInt311 = i;
    }

    public static void method2009(byte i) {
        anIntArray6834 = null;
        aOutgoingOpcode_6832 = null;
        int i_0_ = -63 % ((i - 50) / 42);
        aString6836 = null;
    }

    static final void method2010(String string, String string_1_, String string_2_, int i, int i_3_, int i_4_, String string_5_, String string_6_, int i_7_) {
        anInt6835++;
        Class94 class94 = Class13.aClass94Array259[99];
        for (int i_8_ = 99; i_8_ > 0; i_8_--)
            Class13.aClass94Array259[i_8_] = Class13.aClass94Array259[i_8_ + -1];
        if (i_3_ <= 61)
            method2008(41);
        if (class94 != null)
            class94.method690(string, i_7_, i, i_4_, string_2_, 1350, string_1_, string_6_, string_5_);
        else
            class94 = new Class94(i_4_, i, string_6_, string_5_, string_2_, string, i_7_, string_1_);
        Class111_Sub1.anInt5529 = Class164.anInt1934;
        Class39.anInt427++;
        Class13.aClass94Array259[0] = class94;
    }

    public Node_Sub4() {
        /* empty */
    }

    Node_Sub4(long l) {
        ((Node_Sub4) this).aLong6831 = l;
    }

    static {
        anIntArray6834 = new int[2048];
    }
}
