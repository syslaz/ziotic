/* Class282_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.net.URL;

final class Class282_Sub14 extends Class282 {
    static int emailStatus;
    static Class381 aClass381_7724;
    static int[] anIntArray7725 = new int[32];
    static int anInt7726;
    static int anInt7727;
    static int anInt7728;
    static int anInt7729;
    static int anInt7730;
    static int anInt7731;
    static int anInt7732;
    static int anInt7733;
    static int anInt7734;
    static int anInt7735;

    public static void method2972(byte i) {
        anIntArray7725 = null;
        aClass381_7724 = null;
        if (i < 103)
            method2975(null, null, -24);
    }

    final int method2919(boolean bool) {
        anInt7727++;
        if (bool != false)
            return 59;
        return 2;
    }

    final void method2922(boolean bool, int i) {
        anInt7734++;
        if (bool != true)
            aClass381_7724 = null;
        ((Class282) this).anInt3320 = i;
    }

    static final int method2973(int i, int i_0_) {
        anInt7731++;
        int i_1_ = -67 % ((34 - i) / 37);
        return i_0_ >>> -1378969174;
    }

    Class282_Sub14(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    static final void method2974(int i, int i_2_, boolean bool) {
        anInt7729++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_2_, -874792672, 17);
        if (bool != true)
            aClass381_7724 = null;
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i;
    }

    static final void method2975(String string, Throwable throwable, int i) {
        if (i != 1)
            aClass381_7724 = null;
        anInt7726++;
        do {
            try {
                String string_3_ = "";
                if (throwable != null)
                    string_3_ = Class129_Sub1.method1187(-28017, throwable);
                if (string != null) {
                    if (throwable != null)
                        string_3_ += " | ";
                    string_3_ += (String) string;
                }
                Class167.method1539(string_3_, true);
                string_3_ = Class45.method325(string_3_, "%3a", ":", 44);
                string_3_ = Class45.method325(string_3_, "%40", "@", i + 99);
                string_3_ = Class45.method325(string_3_, "%26", "&", 53);
                string_3_ = Class45.method325(string_3_, "%23", "#", 61);
                if (Viewport.anApplet2646 != null) {
                    Class322 class322 = (Class226_Sub3.aClass174_6670.method1579(new URL(Viewport.anApplet2646.getCodeBase(), ("clienterror.ws?c=" + s_Sub2.anInt7944 + "&u=" + ((Node_Sub14_Sub14.aString9306 == null) ? String.valueOf(Class316_Sub1.aLong8050) : Node_Sub14_Sub14.aString9306) + "&v1=" + Class174.aString2046 + "&v2=" + Class174.aString2026 + "&e=" + string_3_)), (byte) 67));
                    while ((class322.anInt3788 ^ 0xffffffff) == -1)
                        Class279_Sub2.method2897((byte) -124, 1L);
                    if ((class322.anInt3788 ^ 0xffffffff) != -2)
                        break;
                    DataInputStream datainputstream = (DataInputStream) class322.anObject3787;
                    datainputstream.read();
                    datainputstream.close();
                }
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    Class282_Sub14(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2917(int i, int i_4_) {
        anInt7735++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i))
            return 3;
        if ((((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub29_7313.method3047(true) ^ 0xffffffff) == -1)
            return 3;
        return 1;
    }

    final int method2976(boolean bool) {
        anInt7733++;
        if (bool != true)
            method2973(-106, -38);
        return ((Class282) this).anInt3320;
    }

    static final Class377[] method2977(boolean bool) {
        if (bool != false)
            emailStatus = 1;
        if (Class199.aClass377Array2282 == null) {
            Class377[] class377s = Node_Sub39_Sub2.method2607(-342433470, (Node_Sub14_Sub15.aClass174_9328));
            Class377[] class377s_5_ = new Class377[class377s.length];
            int i = 0;
            int i_6_ = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319.method2998(true);
            while_126_:
            for (int i_7_ = 0; class377s.length > i_7_; i_7_++) {
                Class377 class377 = class377s[i_7_];
                if ((((Class377) class377).anInt4626 <= 0 || (((Class377) class377).anInt4626 ^ 0xffffffff) <= -25) && (((Class377) class377).anInt4620 ^ 0xffffffff) <= -801 && ((Class377) class377).anInt4619 >= 600 && ((i_6_ ^ 0xffffffff) != -3 || (((Class377) class377).anInt4620 <= 800 && ((((Class377) class377).anInt4619 ^ 0xffffffff) >= -601))) && ((i_6_ ^ 0xffffffff) != -2 || (((((Class377) class377).anInt4620 ^ 0xffffffff) >= -1025) && ((Class377) class377).anInt4619 <= 768))) {
                    for (int i_8_ = 0; i > i_8_; i_8_++) {
                        Class377 class377_9_ = class377s_5_[i_8_];
                        if ((((Class377) class377_9_).anInt4620 == ((Class377) class377).anInt4620) && (((Class377) class377_9_).anInt4619 == ((Class377) class377).anInt4619)) {
                            if ((((Class377) class377_9_).anInt4626 ^ 0xffffffff) > (((Class377) class377).anInt4626 ^ 0xffffffff))
                                class377s_5_[i_8_] = class377;
                            continue while_126_;
                        }
                    }
                    class377s_5_[i] = class377;
                    i++;
                }
            }
            Class199.aClass377Array2282 = new Class377[i];
            Class159.method1399(class377s_5_, 0, Class199.aClass377Array2282, 0, i);
            int[] is = new int[Class199.aClass377Array2282.length];
            for (int i_10_ = 0; ((Class199.aClass377Array2282.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
                Class377 class377 = Class199.aClass377Array2282[i_10_];
                is[i_10_] = (((Class377) class377).anInt4620 * ((Class377) class377).anInt4619);
            }
            Class36.method281(is, Class199.aClass377Array2282, 125);
        }
        anInt7730++;
        return Class199.aClass377Array2282;
    }

    final boolean method2978(int i) {
        anInt7728++;
        if (i != 260)
            aClass381_7724 = null;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i + -260))
            return false;
        if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub29_7313.method3047(true) == 0)
            return false;
        return true;
    }

    final void method2918(byte i) {
        anInt7732++;
        if (i == 98) {
            if (((Class282) this).aClass248_Sub45_3321.method2644(0))
                ((Class282) this).anInt3320 = 0;
            if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub29_7313.method3047(true) == 0)
                ((Class282) this).anInt3320 = 0;
            if (((Class282) this).anInt3320 < 0 || ((Class282) this).anInt3320 > 2)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }
}
