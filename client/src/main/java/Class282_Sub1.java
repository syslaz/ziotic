/* Class282_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class282_Sub1 extends Class282 {
    static int anInt7590;
    static int anInt7591;
    static int anInt7592;
    static int anInt7593;
    static int anInt7594 = 1;
    static int anInt7595;
    static int anInt7596;
    static int anInt7597;
    static int anInt7598;

    final int method2917(int i, int i_0_) {
        if (i != 0)
            return -34;
        anInt7597++;
        return 1;
    }

    static final Node_Sub45 method2923(int i) {
        anInt7592++;
        Class45 class45 = null;
        Node_Sub45 class248_sub45 = new Node_Sub45(Class12.aClass215_249, 0);
        try {
            Class322 class322 = Node_Sub14_Sub15.aClass174_9328.method1574(true, i, "");
            while (class322.anInt3788 == 0)
                Class279_Sub2.method2897((byte) -124, 1L);
            if ((class322.anInt3788 ^ 0xffffffff) == -2) {
                class45 = (Class45) class322.anObject3787;
                byte[] is = new byte[(int) class45.method321(0)];
                int i_1_;
                for (int i_2_ = 0; is.length > i_2_; i_2_ += i_1_) {
                    i_1_ = class45.method322(i_2_, -i_2_ + is.length, (byte) 125, is);
                    if ((i_1_ ^ 0xffffffff) == 0)
                        throw new IOException("EOF");
                }
                class248_sub45 = new Node_Sub45(new ByteStream(is), Class12.aClass215_249, 0);
            }
        } catch (Exception exception) {
            /* empty */
        }
        try {
            if (class45 != null)
                class45.method323(-122);
        } catch (Exception exception) {
            /* empty */
        }
        return class248_sub45;
    }

    static final String method2924(String string, int i) {
        if (i <= 11)
            method2924(null, -41);
        anInt7591++;
        String string_3_ = null;
        int i_4_ = string.indexOf("--> ");
        if ((i_4_ ^ 0xffffffff) <= -1) {
            string_3_ = string.substring(0, 4 + i_4_);
            string = string.substring(4 + i_4_);
        }
        if (string.startsWith("directlogin ")) {
            int i_5_ = string.indexOf(" ", "directlogin ".length());
            if (i_5_ >= 0) {
                int i_6_ = string.length();
                string = string.substring(0, i_5_) + " ";
                for (int i_7_ = i_5_ - -1; i_7_ < i_6_; i_7_++)
                    string += "*";
            }
        }
        if (string_3_ == null)
            return string;
        return string_3_ + string;
    }

    final void method2918(byte i) {
        if (((Class282) this).anInt3320 < 1 || (((Class282) this).anInt3320 ^ 0xffffffff) < -4)
            ((Class282) this).anInt3320 = method2919(false);
        if (i == 98)
            anInt7593++;
    }

    Class282_Sub1(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2919(boolean bool) {
        anInt7590++;
        if (bool != false)
            method2917(117, -18);
        if (!((Class282) this).aClass248_Sub45_3321.method2652(-18640).method757(31029))
            return 2;
        return 3;
    }

    final int method2925(boolean bool) {
        anInt7598++;
        if (bool != true)
            method2919(true);
        return ((Class282) this).anInt3320;
    }

    Class282_Sub1(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        anInt7596++;
        if (bool != true)
            anInt7595 = -115;
    }
}
