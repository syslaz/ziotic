/* Class248_Sub42_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub42_Sub2 extends Node_Sub42 {
    static OutgoingOpcode aOutgoingOpcode_9784 = new OutgoingOpcode(2, 6);
    static int anInt9785;
    static int anInt9786;
    static int anInt9787;
    static int anInt9788;
    static int anInt9789;

    public static void method2632(byte i) {
        if (i <= -85)
            aOutgoingOpcode_9784 = null;
    }

    static final int method2633(Class264 class264, boolean bool) {
        anInt9787++;
        if (s.aClass264_3467 != class264) {
            if (class264 == Class120.aClass264_1508)
                return 6408;
            if (class264 != Class130.aClass264_1573) {
                if (class264 == Class160.aClass264_1889)
                    return 6409;
                if (class264 == Class346_Sub7_Sub2_Sub3.aClass264_10395)
                    return 6410;
                if (Class282_Sub28.aClass264_7894 == class264)
                    return 6145;
            } else
                return 6406;
        } else
            return 6407;
        if (bool != true)
            aOutgoingOpcode_9784 = null;
        throw new IllegalStateException();
    }

    final void method2622(int i, int i_0_, int i_1_, int i_2_) {
        ((Node_Sub42) this).anInt7296 = i_1_;
        if (i_2_ != -13470)
            method2632((byte) -31);
        ((Node_Sub42) this).anInt7291 = i_0_;
        anInt9789++;
        ((Node_Sub42) this).anInt7298 = i;
    }

    Node_Sub42_Sub2(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
        super(i, i_3_, i_4_, i_5_, i_6_, f);
    }

    static final void method2634(int i, int i_7_) {
        anInt9785++;
        Node_Sub28.anInt7166 = 3;
        Class177.anInt2067 = i_7_;
        Class55.anInt733 = -1;
        Class282_Sub1.anInt7595 = 100;
        if (i != 6408)
            aOutgoingOpcode_9784 = null;
    }

    final void method2627(float f, int i) {
        anInt9786++;
        if (i == 2683)
            ((Node_Sub42) this).aFloat7300 = f;
    }

    static final void method2635(int i, boolean bool, Node_Sub30 class248_sub30) {
        if (!((Node_Sub30) class248_sub30).aBoolean7189) {
            if (((Node_Sub30) class248_sub30).aBoolean7180 && ((((Node_Sub30) class248_sub30).anInt7187 ^ 0xffffffff) <= -2) && ((((Node_Sub30) class248_sub30).anInt7190 ^ 0xffffffff) <= -2) && (Node_Sub8_Sub4.anInt8360 + -2 >= ((Node_Sub30) class248_sub30).anInt7187) && (((Node_Sub30) class248_sub30).anInt7190 <= -2 + Node_Sub22.anInt7074) && (((((Node_Sub30) class248_sub30).anInt7181 ^ 0xffffffff) > -1) || Class347.method3727((((Node_Sub30) class248_sub30).anInt7176), (byte) -111, (((Node_Sub30) class248_sub30).anInt7181)))) {
                if (!bool)
                    Class222.method1769(((Node_Sub30) class248_sub30).anInt7186, -1, ((Node_Sub30) class248_sub30).anInt7184, -23, ((Node_Sub30) class248_sub30).anInt7185, ((Node_Sub30) class248_sub30).anInt7181, ((Node_Sub30) class248_sub30).anInt7187, ((Node_Sub30) class248_sub30).anInt7176, ((Node_Sub30) class248_sub30).anInt7190);
                else
                    Class279_Sub2_Sub2.method2904(((Node_Sub30) class248_sub30).anInt7187, ((Node_Sub30) class248_sub30).aClass21_7183, (byte) 48, ((Node_Sub30) class248_sub30).anInt7184, ((Node_Sub30) class248_sub30).anInt7185, ((Node_Sub30) class248_sub30).anInt7190);
                ((Node_Sub30) class248_sub30).aBoolean7180 = false;
                if (!bool && (((Node_Sub30) class248_sub30).anInt7181 == ((Node_Sub30) class248_sub30).anInt7188) && ((Node_Sub30) class248_sub30).anInt7188 == -1)
                    class248_sub30.remove(true);
                else if (!bool && ((((Node_Sub30) class248_sub30).anInt7181 ^ 0xffffffff) == (((Node_Sub30) class248_sub30).anInt7188 ^ 0xffffffff)) && ((((Node_Sub30) class248_sub30).anInt7186 ^ 0xffffffff) == (((Node_Sub30) class248_sub30).anInt7179 ^ 0xffffffff)) && ((((Node_Sub30) class248_sub30).anInt7176 ^ 0xffffffff) == (((Node_Sub30) class248_sub30).anInt7177 ^ 0xffffffff)))
                    class248_sub30.remove(true);
            }
        } else if (((((Node_Sub30) class248_sub30).anInt7188 ^ 0xffffffff) > -1) || Class347.method3727((((Node_Sub30) class248_sub30).anInt7177), (byte) -111, (((Node_Sub30) class248_sub30).anInt7188))) {
            if (!bool)
                Class222.method1769(((Node_Sub30) class248_sub30).anInt7179, -1, ((Node_Sub30) class248_sub30).anInt7184, 109, ((Node_Sub30) class248_sub30).anInt7185, ((Node_Sub30) class248_sub30).anInt7188, ((Node_Sub30) class248_sub30).anInt7187, ((Node_Sub30) class248_sub30).anInt7177, ((Node_Sub30) class248_sub30).anInt7190);
            else
                Class279_Sub2_Sub2.method2904(((Node_Sub30) class248_sub30).anInt7187, null, (byte) 48, ((Node_Sub30) class248_sub30).anInt7184, ((Node_Sub30) class248_sub30).anInt7185, ((Node_Sub30) class248_sub30).anInt7190);
            class248_sub30.remove(true);
        }
        int i_8_ = 88 / ((-64 - i) / 32);
        anInt9788++;
    }
}
