/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class32 {
    static int anInt382;
    static int anInt383;
    static int anInt384;
    static Class34 aClass34_385;
    static int anInt386;
    static int anInt387 = 0;
    static Class157[] aClass157Array388;

    static final void method270(String string, byte i, String string_0_) {
        Class312.anInt3627 = -1;
        if (i != 26)
            method271(90);
        anInt384++;
        Class154.loginType = 1;
        Class42.method307(false, string_0_, (byte) 16, string);
    }

    public static void method271(int i) {
        aClass34_385 = null;
        aClass157Array388 = null;
        if (i != 0)
            anInt387 = -114;
    }

    static final ha method272(int i, int i_1_, int i_2_, d var_d, Class381 class381, Canvas canvas) {
        anInt383++;
        int i_3_ = i_1_;
        int i_4_ = 0;
        if (canvas != null) {
            Dimension dimension = canvas.getSize();
            i_3_ = dimension.width;
            i_4_ = dimension.height;
        }
        return ha.method810(i_3_, i_4_, i_2_, (byte) -107, var_d, class381, i, canvas);
    }

    static final Class285 method273(int i, int i_5_, int i_6_, Class381 class381) {
        anInt386++;
        if (i_5_ >= -126)
            return null;
        byte[] is = class381.method3922((byte) 116, i_6_, i);
        if (is == null)
            return null;
        return new Class285(is);
    }

    static final void method274(boolean bool) {
        if (bool != true)
            anInt387 = 42;
        anInt382++;
        int i = 0;
        if (Node_Sub14_Sub38.aClass248_Sub45_9584 != null)
            i = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319.method2998(true);
        if (i == 2) {
            int i_7_ = (Class279_Sub1_Sub2.anInt9824 > 800 ? 800 : Class279_Sub1_Sub2.anInt9824);
            int i_8_ = Class223.anInt5196 <= 600 ? Class223.anInt5196 : 600;
            Class146.anInt1724 = i_7_;
            Class323.anInt3791 = (-i_7_ + Class279_Sub1_Sub2.anInt9824) / 2;
            Class346_Sub10.anInt8351 = 0;
            Class282_Sub20.anInt7800 = i_8_;
        } else if ((i ^ 0xffffffff) != -2) {
            Class346_Sub10.anInt8351 = 0;
            Class323.anInt3791 = 0;
            Class146.anInt1724 = Class279_Sub1_Sub2.anInt9824;
            Class282_Sub20.anInt7800 = Class223.anInt5196;
        } else {
            int i_9_ = (Class279_Sub1_Sub2.anInt9824 <= 1024 ? Class279_Sub1_Sub2.anInt9824 : 1024);
            Class323.anInt3791 = (Class279_Sub1_Sub2.anInt9824 + -i_9_) / 2;
            int i_10_ = Class223.anInt5196 > 768 ? 768 : Class223.anInt5196;
            Class146.anInt1724 = i_9_;
            Class346_Sub10.anInt8351 = 0;
            Class282_Sub20.anInt7800 = i_10_;
        }
    }

    static {
        aClass34_385 = new Class34();
    }
}
