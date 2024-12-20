/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class231 {
    static int anInt2605;
    static Class128 aClass128_2606;
    static int anInt2607;
    static int anInt2608 = -1;
    static Node_Sub44 aClass248_Sub44_2609;

    public static void method1838(byte i) {
        if (i > 73) {
            aClass248_Sub44_2609 = null;
            aClass128_2606 = null;
        }
    }

    static final Node_Sub40 method1839(int i, int i_0_, int i_1_, Canvas canvas) {
        anInt2605++;
        try {
            Class var_class = Class.forName("Node_Sub40_Sub2");
            if (i != 7)
                return null;
            Node_Sub40 class248_sub40 = (Node_Sub40) var_class.newInstance();
            class248_sub40.method2611(canvas, i_0_, i_1_, i + -5);
            return class248_sub40;
        } catch (Throwable throwable) {
            Node_Sub40_Sub1 class248_sub40_sub1 = new Node_Sub40_Sub1();
            class248_sub40_sub1.method2611(canvas, i_0_, i_1_, 2);
            return class248_sub40_sub1;
        }
    }

    static final void method1840(int i, int i_2_) {
        anInt2607++;
        Class261.anInt2972 = i;
        ha_Sub2.anInt5704 = -1;
        ha_Sub2.anInt5704 = i_2_;
        Class296.method3132((byte) -7);
    }

    static {
        aClass128_2606 = new Class128(7, 7);
    }
}
