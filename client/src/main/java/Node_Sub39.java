/* Class248_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub39 extends Node {
    static int anInt7276;
    static int anInt7277;
    static Class381 aClass381_7278;
    static int[] anIntArray7279 = new int[32];
    static int[] anIntArray7280;

    abstract int method2599(int i);

    abstract long method2600(int i);

    abstract int method2601(byte i);

    static final void method2602(int i) {
        if (i != -4)
            aClass381_7278 = null;
        if (Class346_Sub1.anInterface17Array8250 != null) {
            Interface17[] interface17s = Class346_Sub1.anInterface17Array8250;
            for (int i_0_ = 0; interface17s.length > i_0_; i_0_++) {
                Interface17 interface17 = interface17s[i_0_];
                interface17.method51((byte) -2);
            }
        }
        anInt7277++;
    }

    static final void method2603(int i, ha var_ha) {
        Class268.aClass177Array3120 = new Class177[Class346_Sub7_Sub4_Sub1.anIntArray10091.length];
        anInt7276++;
        for (int i_1_ = i; ((i_1_ ^ 0xffffffff) > (Class346_Sub7_Sub4_Sub1.anIntArray10091.length ^ 0xffffffff)); i_1_++) {
            int i_2_ = Class346_Sub7_Sub4_Sub1.anIntArray10091[i_1_];
            Class285 class285 = Class116_Sub1.method1102(Node_Sub14_Sub34.aClass381_9524, 13580, i_2_);
            Class48 class48 = var_ha.a(class285, Class157.method1391(Class41.aClass381_531, i_2_), true);
            Class268.aClass177Array3120[i_1_] = new Class177(class48, class285);
        }
    }

    abstract int method2604(int i);

    public Node_Sub39() {
        /* empty */
    }

    public static void method2605(byte i) {
        anIntArray7279 = null;
        aClass381_7278 = null;
        if (i != 120)
            anIntArray7279 = null;
        anIntArray7280 = null;
    }

    abstract int method2606(int i);
}
