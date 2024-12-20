/* Class346_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.math.BigInteger;

final class Class346_Sub5_Sub1 extends Class346_Sub5 {
    int anInt9879 = (int) (Class118.method1112(116) / 1000L);
    static OutgoingOpcode aOutgoingOpcode_9880 = new OutgoingOpcode(82, 3);
    static int anInt9881;
    String aString9882;
    short aShort9883;
    static OutgoingOpcode aOutgoingOpcode_9884 = new OutgoingOpcode(22, 7);
    static BigInteger aBigInteger9885 = (new BigInteger("a95bee1fdce5febeee57b1f1ca72319164191fec5223dde2db33a4f8526f5d7b77ba7964409689a064d0f2318f33b6c8ec48e8d1fbd0b10d3c6299791b2bfe21654b19c3146e13b77819363116031cef43f2b8c49874056befd4cc02c2c589760a1b836d2f40636a9a265b13a41f0d8ae22bc54893f791ddca9420efe557986ae594e717b026a4dc435b5e14bc9ae5ed7da61ac1d5da61d32493a5121ab21cfae9d7b75d42dbad28e951ccfe428328879564472b8e8f7d9f177d248ec5b2c0ebcf7a6da8c39cb69c89ebcc52636c742bcffb58e1c4fa4258e6e437b4e6744cea279bcc5f3c79f70d4eb946b3b6e9a43edb7864bd8ac298b6b21a2a4fc5d7625843dd8161a64122fe7987d79f860ca73cfa3f6a9be9945d2576bb7fbadf820d33d229ec021562c63d2bc0edd5adbdc322d0eacf1484f0d95de58fbf91e9c52ef47cb929fd1ebb2d70de6fabef5270a83c17013e811e90ff27806652cb8e1656cce20215fcc3494414c13fa5566ea0c5e30fa71d5c4eaac0372c6cbc611aab92331fd49205b64bbcbc4a195471aafd30cd243c676d17659a916f8196e56c4d59f6f997b064e34eb4ac07fb22a311f386ac8821f8d787919526a39c67a3a1e2516c7dea4626b5ef17b72fb4f1afb3d8b44801862ef4a6e86cd88b95f5ddc904df8826627d640fecc78204fff6968bf56ff5c0f260b56f0e3b9bda4753d2c238ba17", 16));
    static int anInt9886;

    Class346_Sub5_Sub1(String string, int i) {
        ((Class346_Sub5_Sub1) this).aString9882 = string;
        ((Class346_Sub5_Sub1) this).aShort9883 = (short) i;
    }

    static final Class346_Sub7_Sub3 method3548(int i, int i_0_, int i_1_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_0_][i_1_];
        if (class137 == null)
            return null;
        Class346_Sub7_Sub3 class346_sub7_sub3 = ((Class137) class137).aClass346_Sub7_Sub3_1647;
        ((Class137) class137).aClass346_Sub7_Sub3_1647 = null;
        aa_Sub2.method164(class346_sub7_sub3);
        return class346_sub7_sub3;
    }

    public static void method3549(byte i) {
        aOutgoingOpcode_9880 = null;
        aBigInteger9885 = null;
        aOutgoingOpcode_9884 = null;
        if (i != -100)
            method3549((byte) -112);
    }

    static final Frame method3550(int i, int i_2_, int i_3_, int i_4_, Class174 class174, int i_5_) {
        anInt9881++;
        if (!class174.method1567(31625))
            return null;
        if (i_2_ == (i_3_ ^ 0xffffffff)) {
            Class377[] class377s = Node_Sub39_Sub2.method2607(-342433470, class174);
            if (class377s == null)
                return null;
            boolean bool = false;
            for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (class377s.length ^ 0xffffffff); i_6_++) {
                if ((i ^ 0xffffffff) == (((Class377) class377s[i_6_]).anInt4620 ^ 0xffffffff) && i_5_ == ((Class377) class377s[i_6_]).anInt4619 && ((i_4_ ^ 0xffffffff) == -1 || (((Class377) class377s[i_6_]).anInt4618 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)) && (!bool || i_3_ < ((Class377) class377s[i_6_]).anInt4626)) {
                    bool = true;
                    i_3_ = ((Class377) class377s[i_6_]).anInt4626;
                }
            }
            if (!bool)
                return null;
        }
        Class322 class322 = class174.method1578(i, i_5_, i_3_, i_4_, 209715200);
        while ((class322.anInt3788 ^ 0xffffffff) == -1)
            Class279_Sub2.method2897((byte) -124, 10L);
        Frame frame = (Frame) class322.anObject3787;
        if (frame == null)
            return null;
        if (class322.anInt3788 == 2) {
            Class222.method1768(class174, frame, -2);
            return null;
        }
        return frame;
    }
}
