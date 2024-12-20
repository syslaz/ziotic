/* Class248_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

abstract class Node_Sub40 extends Node {
    int anInt7281;
    static IncommingOpcode aIncommingOpcode_7282 = new IncommingOpcode(38, 2);
    int[] anIntArray7283;
    int anInt7284;
    static Class239 aClass239_7285;
    static int anInt7286;

    abstract void method2611(Canvas canvas, int i, int i_0_, int i_1_);

    abstract void method2612(int i, boolean bool, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, Graphics graphics);

    static final void method2613(int i, int i_7_, byte i_8_) {
        if (i_8_ == 71) {
            Class262.method2767(i_7_, i, i_8_ + -69);
            anInt7286++;
        }
    }

    public static void method2614(int i) {
        aClass239_7285 = null;
        aIncommingOpcode_7282 = null;
        if (i != 2)
            method2613(-110, 58, (byte) 61);
    }

    public Node_Sub40() {
        /* empty */
    }
}
