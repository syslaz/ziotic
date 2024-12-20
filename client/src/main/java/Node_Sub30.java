/* Class248_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub30 extends Node {
    static int anInt7175;
    int anInt7176;
    int anInt7177;
    static int anInt7178;
    int anInt7179;
    boolean aBoolean7180 = true;
    int anInt7181;
    static Node_Sub10[] aClass248_Sub10Array7182 = new Node_Sub10[1024];
    Class21 aClass21_7183;
    int anInt7184;
    int anInt7185;
    int anInt7186;
    int anInt7187;
    int anInt7188;
    boolean aBoolean7189 = false;
    int anInt7190;
    static Class34 aClass34_7191 = new Class34();
    static boolean aBoolean7192 = true;
    static int[] anIntArray7193 = new int[1];

    public static void method2562(int i) {
        if (i != 0)
            method2562(91);
        anIntArray7193 = null;
        aClass34_7191 = null;
        aClass248_Sub10Array7182 = null;
    }

    static final Class168 method2563(int i, int i_0_) {
        anInt7178++;
        Class168[] class168s = Class198.method1672(-25801);
        int i_1_ = -21 % ((i - -43) / 39);
        for (int i_2_ = 0; (class168s.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
            if (((Class168) class168s[i_2_]).anInt1967 == i_0_)
                return class168s[i_2_];
        }
        return null;
    }

    public Node_Sub30() {
        /* empty */
    }
}
