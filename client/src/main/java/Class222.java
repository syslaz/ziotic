/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class222 {
    static int anInt2538;
    static int anInt2539;
    static int anInt2540;

    static final long method1767(int i, String string) {
        anInt2540++;
        int i_0_ = string.length();
        long l = 0L;
        for (int i_1_ = i; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
            l = (long) string.charAt(i_1_) + (l << 1557190021) - l;
        return l;
    }

    static final void method1768(Class174 class174, Frame frame, int i) {
        anInt2538++;
        for (; ; ) {
            Class322 class322 = class174.method1581(1404065264, frame);
            while (class322.anInt3788 == 0)
                Class279_Sub2.method2897((byte) -124, 10L);
            if ((class322.anInt3788 ^ 0xffffffff) == -2)
                break;
            Class279_Sub2.method2897((byte) -124, 100L);
        }
        frame.setVisible(false);
        if (i != -2)
            method1767(80, null);
        frame.dispose();
    }

    static final void method1769(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        int i_10_ = 40 % ((i_4_ - 43) / 56);
        anInt2539++;
        if ((i_7_ ^ 0xffffffff) <= -2 && i_9_ >= 1 && Node_Sub8_Sub4.anInt8360 - 2 >= i_7_ && ((Node_Sub22.anInt7074 + -2 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff))) {
            int i_11_ = i_3_;
            if (i_11_ < 3 && Class209.method1717(-10387, i_7_, i_9_))
                i_11_++;
            if (((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) != -1 || Class107.method752(i_7_, Class84_Sub5.anInt5425, i_9_, 2, i_11_)) && Class311.aClass137ArrayArrayArray3620 != null) {
                Class73.aClass310_Sub1_941.method3256(i_5_, -84, i_3_, i_7_, (Class182.aClass164Array2114[i_3_]), i_9_, Class287.aHa3381);
                if (i_6_ >= 0) {
                    int i_12_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349.method2988(true);
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, 1);
                    Class73.aClass310_Sub1_941.method3254(i_3_, i_6_, i_11_, i_9_, i_2_, i_7_, (byte) -15, i, i_8_, Class287.aHa3381, (Class182.aClass164Array2114[i_3_]));
                    Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, i_12_);
                }
            }
        }
    }
}
