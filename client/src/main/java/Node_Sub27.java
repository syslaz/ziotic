/* Class248_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub27 extends Node {
    static boolean[] aBooleanArray7150 = new boolean[200];
    static int[] anIntArray7151 = new int[64];
    int anInt7152;
    boolean aBoolean7153;
    int anInt7154;
    int anInt7155;
    static int anInt7156;
    int anInt7157;
    static int anInt7158;
    int anInt7159;

    static final void method2553(byte i) {
        if (i != 70)
            method2553((byte) 66);
        anInt7156++;
        Class57.aClass65_790.method504(i ^ ~0x46);
    }

    public static void method2554(int i) {
        if (i == 255) {
            aBooleanArray7150 = null;
            anIntArray7151 = null;
        }
    }

    Node_Sub27(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
        ((Node_Sub27) this).anInt7155 = i_3_;
        ((Node_Sub27) this).anInt7157 = i_0_;
        ((Node_Sub27) this).anInt7159 = i;
        ((Node_Sub27) this).anInt7154 = i_1_;
        ((Node_Sub27) this).anInt7152 = i_2_;
        ((Node_Sub27) this).aBoolean7153 = bool;
    }

    static final void method2555(int i, int i_4_, int i_5_, int i_6_) {
        anInt7158++;
        i_5_ = (i_5_ * ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7344.method2993(true)) >> -1147181240;
        if (i != 64)
            method2554(108);
        if ((i_5_ ^ 0xffffffff) != -1 && (i_4_ ^ 0xffffffff) != 0) {
            if (!ha_Sub3_Sub1.aBoolean8709 && Node_Sub8_Sub3.anInt8927 != -1 && Class310.method3243(-94) && !Class11.method201(-1)) {
                Class280.aClass248_Sub15_Sub1_3261 = Class357.method3793(352);
                Node_Sub15_Sub1 class248_sub15_sub1 = (Class279_Sub2_Sub2.method2906((byte) -98, Class280.aClass248_Sub15_Sub1_3261));
                Class340_Sub2.method3449(true, class248_sub15_sub1, true);
            }
            Class132.method1216(false, 80, i_4_, 0, i_5_, Class221.aClass381_2536);
            Class262.method2767(255, -1, 2);
            ha_Sub3_Sub1.aBoolean8709 = true;
        }
    }
}
