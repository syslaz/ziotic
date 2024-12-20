/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class66 implements Interface12 {
    private String aString5021;
    static IncommingOpcode aIncommingOpcode_5022 = new IncommingOpcode(77, -1);
    private boolean aBoolean5023;
    static int anInt5024;
    static int anInt5025;
    static int anInt5026;
    static int anInt5027;
    static Class129[] aClass129Array5028;

    final boolean method515(int i) {
        if (i > -17)
            return false;
        anInt5027++;
        return aBoolean5023;
    }

    public final Class298 method37(byte i) {
        anInt5024++;
        if (i >= -120)
            method37((byte) -9);
        return Class298.aClass298_3479;
    }

    public static void method516(byte i) {
        aIncommingOpcode_5022 = null;
        aClass129Array5028 = null;
        int i_0_ = -85 / ((i - 1) / 48);
    }

    Class66(String string) {
        aString5021 = string;
    }

    static final void method517(int i) {
        anInt5026++;
        synchronized (Node_Sub8_Sub16_Sub1.aClient10301) {
            if (Node_Sub48.aFrame7432 != null) {
                /* empty */
            } else {
                java.awt.Container container;
                if (Class300.aFrame3494 != null)
                    container = Class300.aFrame3494;
                else if (Class158.anApplet1881 != null)
                    container = Class158.anApplet1881;
                else
                    container = Class54_Sub1.anApplet_Sub1_5332;
                Class279_Sub1_Sub2.anInt9824 = container.getSize().width;
                Class223.anInt5196 = container.getSize().height;
                if (container == Class300.aFrame3494) {
                    Insets insets = Class300.aFrame3494.getInsets();
                    Class279_Sub1_Sub2.anInt9824 -= insets.left + insets.right;
                    Class223.anInt5196 -= insets.top - -insets.bottom;
                }
                if ((Class346_Sub7_Sub3.method3672((byte) -112) ^ 0xffffffff) != i)
                    Class32.method274(true);
                else {
                    Class323.anInt3791 = (Class279_Sub1_Sub2.anInt9824 + -Class226_Sub1.anInt6661) / 2;
                    Class346_Sub10.anInt8351 = 0;
                    Class282_Sub20.anInt7800 = s_Sub2.anInt7946;
                    Class146.anInt1724 = Class226_Sub1.anInt6661;
                }
                if (Class18.aClass339_295 != s_Sub2.aClass339_7951) {
                    if (Class146.anInt1724 < 1024 && Class282_Sub20.anInt7800 < 768) {
                        /* empty */
                    }
                }
                Class297_Sub1.aCanvas8478.setSize(Class146.anInt1724, Class282_Sub20.anInt7800);
                if (Class287.aHa3381 != null) {
                    if (!Node_Sub8_Sub6.aBoolean8949)
                        Class287.aHa3381.b(Class297_Sub1.aCanvas8478, Class146.anInt1724, Class282_Sub20.anInt7800);
                    else
                        Class238_Sub2.method1893(false, Class297_Sub1.aCanvas8478);
                }
                if (Class300.aFrame3494 != container)
                    Class297_Sub1.aCanvas8478.setLocation(Class323.anInt3791, (Class346_Sub10.anInt8351));
                else {
                    Insets insets = Class300.aFrame3494.getInsets();
                    Class297_Sub1.aCanvas8478.setLocation(insets.left + Class323.anInt3791, Class346_Sub10.anInt8351 + insets.top);
                }
                if (Class179.anInt2084 != -1)
                    Node_Sub14_Sub38.method2392(true, -105);
                Class377.method3884(false);
            }
        }
    }

    public final int method36(int i) {
        anInt5025++;
        if (i != -20701)
            method36(73);
        int i_1_ = Node_Sub8_Sub14.method2123(56, aString5021);
        if ((i_1_ ^ 0xffffffff) <= -1 && (i_1_ ^ 0xffffffff) >= -101)
            return i_1_;
        aBoolean5023 = true;
        return 100;
    }
}
