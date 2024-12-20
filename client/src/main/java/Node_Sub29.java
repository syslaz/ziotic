/* Class248_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Node_Sub29 extends Node {
    static int anInt7167;
    static int anInt7168 = 0;
    static int[] anIntArray7169 = new int[8];
    static Thread aThread7170;
    int anInt7171;
    static int anInt7172;
    int anInt7173;
    static int anInt7174;

    static final String method2557(byte i, int i_0_) {
        anInt7174++;
        int i_1_ = -10 % ((40 - i) / 45);
        return (String.valueOf(i_0_ >> 2099936440 & 0xff) + "." + ((0xff446b & i_0_) >> -1821765360) + "." + (i_0_ >> 1104188424 & 0xff) + "." + (0xff & i_0_));
    }

    static final void method2558(byte i, int i_2_) {
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub9_7317.method2955(true) == 0)
            i_2_ = -1;
        anInt7172++;
        if ((Class21.anInt314 ^ 0xffffffff) != (i_2_ ^ 0xffffffff) && i == -108) {
            if ((i_2_ ^ 0xffffffff) != 0) {
                Class237 class237 = Class86_Sub1.aClass85_5509.method634(i_2_, 33);
                Class157 class157 = class237.method1854(false);
                if (class157 == null)
                    i_2_ = -1;
                else {
                    Node_Sub14_Sub15.aClass174_9328.method1583(Class297_Sub1.aCanvas8478, false, class157.method1386(), new Point(((Class237) class237).anInt2636, ((Class237) class237).anInt2645), class157.method1388(), class157.method1380());
                    Class21.anInt314 = i_2_;
                }
            }
            if (i_2_ == -1 && Class21.anInt314 != -1) {
                Node_Sub14_Sub15.aClass174_9328.method1583((Class297_Sub1.aCanvas8478), false, -1, new Point(), -1, null);
                Class21.anInt314 = -1;
            }
        }
    }

    static final void method2559(Interactable interactable, Node_Sub42[] class248_sub42s) {
        if (Node_Sub19.aBoolean7030) {
            int i = interactable.method3566(class248_sub42s, (byte) -58);
            r.aHa9032.a(i, class248_sub42s);
        }
        if (Node_Sub14_Sub12_Sub1.aSArray10306 == Class177.aSArray2070) {
            boolean bool = false;
            boolean bool_3_ = false;
            int i;
            int i_4_;
            if (interactable instanceof Animable) {
                i = (((Animable) (Animable) interactable).x1);
                i_4_ = ((Animable) (Animable) interactable).y1;
            } else {
                i = (((Interactable) interactable).x >> Class96.anInt1249);
                i_4_ = (((Interactable) interactable).y >> Class96.anInt1249);
            }
            r.aHa9032.EA((Node_Sub14_Sub29.aSArray9471[0].method3150((byte) 108, ((Interactable) interactable).x, ((Interactable) interactable).y)), Class346_Sub10.method3722(i, i_4_), Node_Sub3.method2006(i, i_4_), Class342.method3490(i, i_4_));
        }
        Class346_Sub10 class346_sub10 = interactable.method3578(-1, r.aHa9032);
        if (class346_sub10 != null) {
            if (((Interactable) interactable).aBoolean8310) {
                Class346_Sub9[] class346_sub9s = (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353);
                for (int i = 0; i < class346_sub9s.length; i++) {
                    Class346_Sub9 class346_sub9 = class346_sub9s[i];
                    if (((Class346_Sub9) class346_sub9).aBoolean8342)
                        Class210.method1724((((Class346_Sub9) class346_sub9).anInt8345 + ((Class346_Sub9) class346_sub9).anInt8344), (((Class346_Sub9) class346_sub9).anInt8347 - ((Class346_Sub9) class346_sub9).anInt8344), (byte) -87, (((Class346_Sub9) class346_sub9).anInt8343 + ((Class346_Sub9) class346_sub9).anInt8344), (((Class346_Sub9) class346_sub9).anInt8346 - ((Class346_Sub9) class346_sub9).anInt8344));
                }
            }
            if (((Class346_Sub10) class346_sub10).aBoolean8352) {
                ((Class346_Sub10) class346_sub10).aInteractable_8355 = interactable;
                if (Class252.aBoolean2841) {
                    synchronized (Class352.aClass27_4187) {
                        Class352.aClass27_4187.method253(0, class346_sub10);
                    }
                } else
                    Class352.aClass27_4187.method253(0, class346_sub10);
            } else
                Class256.method2749(class346_sub10, (byte) 31);
        }
    }

    public static void method2560(byte i) {
        if (i != 88)
            anInt7168 = -65;
        anIntArray7169 = null;
        aThread7170 = null;
    }

    static final void method2561(byte i) {
        anInt7167++;
        Class136.method1243(-16777216, false);
        Node_Sub43.anInt7307 = 0;
        boolean bool = true;
        for (int i_5_ = 0; i_5_ < Class282_Sub7.aByteArrayArray7666.length; i_5_++) {
            if (Node_Sub39.anIntArray7280[i_5_] != -1 && Class282_Sub7.aByteArrayArray7666[i_5_] == null) {
                Class282_Sub7.aByteArrayArray7666[i_5_] = Class340_Sub6.aClass381_8158.method3922((byte) 122, (Node_Sub39.anIntArray7280[i_5_]), 0);
                if (Class282_Sub7.aByteArrayArray7666[i_5_] == null) {
                    bool = false;
                    Node_Sub43.anInt7307++;
                }
            }
            if ((Class346_Sub7_Sub4.anIntArray9951[i_5_] ^ 0xffffffff) != 0 && Class360.aByteArrayArray4447[i_5_] == null) {
                Class360.aByteArrayArray4447[i_5_] = (Class340_Sub6.aClass381_8158.method3911(Node_Sub8_Sub5.mapXTEAKeys[i_5_], 0, Class346_Sub7_Sub4.anIntArray9951[i_5_], Class316_Sub1.method3291(i, -107)));
                if (Class360.aByteArrayArray4447[i_5_] == null) {
                    bool = false;
                    Node_Sub43.anInt7307++;
                }
            }
            if ((Class14.anIntArray263[i_5_] ^ 0xffffffff) != 0 && InputStream_Sub2.aByteArrayArray79[i_5_] == null) {
                InputStream_Sub2.aByteArrayArray79[i_5_] = Class340_Sub6.aClass381_8158.method3922((byte) 111, (Class14.anIntArray263[i_5_]), 0);
                if (InputStream_Sub2.aByteArrayArray79[i_5_] == null) {
                    Node_Sub43.anInt7307++;
                    bool = false;
                }
            }
            if ((Class192.anIntArray2214[i_5_] ^ 0xffffffff) != 0 && Node_Sub2_Sub3.aByteArrayArray8850[i_5_] == null) {
                Node_Sub2_Sub3.aByteArrayArray8850[i_5_] = Class340_Sub6.aClass381_8158.method3922((byte) 108, (Class192.anIntArray2214[i_5_]), 0);
                if (Node_Sub2_Sub3.aByteArrayArray8850[i_5_] == null) {
                    bool = false;
                    Node_Sub43.anInt7307++;
                }
            }
            if (Node_Sub14_Sub35.anIntArray9529 != null && Class296.aByteArrayArray3456[i_5_] == null && ((Node_Sub14_Sub35.anIntArray9529[i_5_] ^ 0xffffffff) != 0)) {
                Class296.aByteArrayArray3456[i_5_] = (Class340_Sub6.aClass381_8158.method3911(Node_Sub8_Sub5.mapXTEAKeys[i_5_], 0, Node_Sub14_Sub35.anIntArray9529[i_5_], 2));
                if (Class296.aByteArrayArray3456[i_5_] == null) {
                    Node_Sub43.anInt7307++;
                    bool = false;
                }
            }
        }
        if (Class102.aClass380_1309 == null) {
            if (Class333.aClass248_Sub8_Sub1_3897 != null && (Class282_Sub14.aClass381_7724.method3913((((Node_Sub8_Sub1) Class333.aClass248_Sub8_Sub1_3897).aString8905) + "_staticelements", false))) {
                if (Class282_Sub14.aClass381_7724.method3931((((Node_Sub8_Sub1) Class333.aClass248_Sub8_Sub1_3897).aString8905) + "_staticelements", true))
                    Class102.aClass380_1309 = Class72.method539(Class115.aBoolean4950, Class282_Sub14.aClass381_7724, 255, ((((Node_Sub8_Sub1) (Class333.aClass248_Sub8_Sub1_3897)).aString8905) + "_staticelements"));
                else {
                    Node_Sub43.anInt7307++;
                    bool = false;
                }
            } else
                Class102.aClass380_1309 = new Class380(0);
        }
        if (!bool)
            Class128.anInt1570 = 1;
        else {
            Class36.anInt405 = 0;
            bool = true;
            for (int i_6_ = 0; i_6_ < Class282_Sub7.aByteArrayArray7666.length; i_6_++) {
                byte[] is = Class360.aByteArrayArray4447[i_6_];
                if (is != null) {
                    int i_7_ = ((Node_Sub14_Sub36.anIntArray9544[i_6_] >> -200743672) * 64 + -Class67.baseX);
                    int i_8_ = (((0xff & Node_Sub14_Sub36.anIntArray9544[i_6_]) * 64) - Class368.baseY);
                    if (Class270.anInt3134 != 0) {
                        i_7_ = 10;
                        i_8_ = 10;
                    }
                    bool &= Class300.method3181(Node_Sub8_Sub4.anInt8360, i_7_, i_8_, is, 77, Node_Sub22.anInt7074);
                }
                is = Node_Sub2_Sub3.aByteArrayArray8850[i_6_];
                if (is != null) {
                    int i_9_ = (64 * (Node_Sub14_Sub36.anIntArray9544[i_6_] >> -1540987000) + -Class67.baseX);
                    int i_10_ = (-Class368.baseY + 64 * (0xff & (Node_Sub14_Sub36.anIntArray9544[i_6_])));
                    if ((Class270.anInt3134 ^ 0xffffffff) != -1) {
                        i_10_ = 10;
                        i_9_ = 10;
                    }
                    bool &= Class300.method3181(Node_Sub8_Sub4.anInt8360, i_9_, i_10_, is, 120, Node_Sub22.anInt7074);
                }
            }
            if (!bool)
                Class128.anInt1570 = 2;
            else {
                if ((Class128.anInt1570 ^ 0xffffffff) != -1)
                    Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, true, (Class41.aClass41_478.method301(Class191.anInt4822, (byte) -108) + "<br>(100%)"));
                Node_Sub37.method2594(i ^ 0x652d);
                Node_Sub14_Sub35.method2379(true);
                Class303.method3205(20502);
                boolean bool_11_ = false;
                if (Class287.aHa3381.n() && (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360.method3018(true) ^ 0xffffffff) == -3) {
                    for (int i_12_ = 0; Class282_Sub7.aByteArrayArray7666.length > i_12_; i_12_++) {
                        if ((Node_Sub2_Sub3.aByteArrayArray8850[i_12_] != null) || (InputStream_Sub2.aByteArrayArray79[i_12_] != null)) {
                            bool_11_ = true;
                            break;
                        }
                    }
                }
                if (i == -105) {
                    int i_13_;
                    if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329.method3040(true) != 1)
                        i_13_ = Class200.anIntArray2289[Class172.anInt2001];
                    else
                        i_13_ = Class252.anIntArray2844[Class172.anInt2001];
                    if (Class287.aHa3381.f())
                        i_13_++;
                    Class54.method426(Class287.aHa3381, Class175.anInt2055, 9, 4, Node_Sub8_Sub4.anInt8360, Node_Sub22.anInt7074, i_13_, bool_11_, Class287.aHa3381.r() > 0);
                    Node_Sub4.method2008(Class366.anInt4495);
                    if ((Class366.anInt4495 ^ 0xffffffff) == -1)
                        Class261.method2765(null);
                    else
                        Class261.method2765(Class168.aClass48_1968);
                    for (int i_14_ = 0; i_14_ < 4; i_14_++)
                        Class182.aClass164Array2114[i_14_].method1518((byte) 12);
                    Class382.method3939((byte) 8);
                    Class42.method308(false, (byte) -128);
                    aa.method155((byte) 41);
                    Class223.aClass199_5198 = null;
                    Class26.aBoolean351 = false;
                    Node_Sub37.method2594(-25926);
                    System.gc();
                    Class136.method1243(-16777216, true);
                    Node_Sub21.method2528((byte) 102);
                    Class302.anInt3501 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true);
                    Class348.aBoolean4162 = (Class75.anInt977 ^ 0xffffffff) <= -97;
                    ha_Sub3.aBoolean6060 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360.method3018(true) == 2;
                    Class80.aBoolean1009 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347.method2963(true) == 1;
                    client.anInt5245 = (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) != -2 ? Class84_Sub5.anInt5425 : -1;
                    Node_Sub45.aBoolean7341 = ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345.method3026(true) == 1;
                    Class192.aBoolean2211 = (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313.method3047(true) ^ 0xffffffff) == -2;
                    Class73.aClass310_Sub1_941 = new Class310_Sub1(4, Node_Sub8_Sub4.anInt8360, Node_Sub22.anInt7074, false);
                    if (Class270.anInt3134 == 0)
                        Class346_Sub7_Sub2_Sub4.method3625(Class73.aClass310_Sub1_941, Class282_Sub7.aByteArrayArray7666, false);
                    else
                        Class372.method3867(Class73.aClass310_Sub1_941, (byte) 119, Class282_Sub7.aByteArrayArray7666);
                    r_Sub2.method2117(Node_Sub22.anInt7074 >> 1318471588, -112, (Node_Sub8_Sub4.anInt8360 >> 543001380));
                    Class346_Sub7_Sub1_Sub1.method3585(102);
                    if (bool_11_) {
                        Class67.method518(true);
                        Class15.aClass310_Sub1_282 = new Class310_Sub1(1, Node_Sub8_Sub4.anInt8360, Node_Sub22.anInt7074, true);
                        if ((Class270.anInt3134 ^ 0xffffffff) == -1) {
                            Class346_Sub7_Sub2_Sub4.method3625(Class15.aClass310_Sub1_282, InputStream_Sub2.aByteArrayArray79, false);
                            Class136.method1243(-16777216, true);
                        } else {
                            Class372.method3867(Class15.aClass310_Sub1_282, (byte) 65, (InputStream_Sub2.aByteArrayArray79));
                            Class136.method1243(i ^ 0xffff97, true);
                        }
                        Class15.aClass310_Sub1_282.method3247((((Class310) Class73.aClass310_Sub1_941).anIntArrayArrayArray3592[0]), 0, (byte) -125);
                        Class15.aClass310_Sub1_282.method3238(-96, null, Class287.aHa3381, null);
                        Class67.method518(false);
                    }
                    Class73.aClass310_Sub1_941.method3238(-106, (!bool_11_ ? null : (((Class310) Class15.aClass310_Sub1_282).anIntArrayArrayArray3592)), Class287.aHa3381, Class182.aClass164Array2114);
                    if ((Class270.anInt3134 ^ 0xffffffff) != -1) {
                        Class136.method1243(i ^ 0xffff97, true);
                        Class76.method560(Class73.aClass310_Sub1_941, -101, Class360.aByteArrayArray4447);
                    } else {
                        Class136.method1243(-16777216, true);
                        Class55.method440(Class360.aByteArrayArray4447, -110, Class73.aClass310_Sub1_941);
                        if (Class296.aByteArrayArray3456 != null)
                            Node_Sub11.method2244((byte) 112);
                    }
                    Node_Sub14_Sub35.method2379(true);
                    if ((Class75.anInt977 ^ 0xffffffff) > -97)
                        Class233.method1843((byte) 87);
                    Class136.method1243(i ^ 0xffff97, true);
                    Class73.aClass310_Sub1_941.method3248(null, (byte) -13, Class287.aHa3381, (bool_11_ ? Node_Sub14_Sub12_Sub1.aSArray10306[0] : null));
                    Class73.aClass310_Sub1_941.method3252(false, (byte) 75, Class287.aHa3381);
                    Class136.method1243(-16777216, true);
                    if (bool_11_) {
                        Class67.method518(true);
                        Class136.method1243(i ^ 0xffff97, true);
                        if (Class270.anInt3134 == 0)
                            Class55.method440((Node_Sub2_Sub3.aByteArrayArray8850), i + -7, Class15.aClass310_Sub1_282);
                        else
                            Class76.method560(Class15.aClass310_Sub1_282, -105, (Node_Sub2_Sub3.aByteArrayArray8850));
                        Node_Sub14_Sub35.method2379(true);
                        Class136.method1243(i + -16777111, true);
                        Class15.aClass310_Sub1_282.method3248(Node_Sub14_Sub29.aSArray9471[0], (byte) -86, Class287.aHa3381, null);
                        Class15.aClass310_Sub1_282.method3252(true, (byte) 75, Class287.aHa3381);
                        Class136.method1243(-16777216, true);
                        Class67.method518(false);
                    }
                    Class86_Sub1.method660(i ^ ~0x68);
                    int i_15_ = (((Class310_Sub1) Class73.aClass310_Sub1_941).anInt8040);
                    if ((Class177.anInt2074 ^ 0xffffffff) > (i_15_ ^ 0xffffffff))
                        i_15_ = Class177.anInt2074;
                    if (-1 + Class177.anInt2074 > i_15_)
                        i_15_ = -1 + Class177.anInt2074;
                    if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) == -1)
                        Class131.method1208(i_15_);
                    else
                        Class131.method1208(0);
                    for (int i_16_ = 0; i_16_ < 4; i_16_++) {
                        for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff)); i_17_++) {
                            for (int i_18_ = 0; i_18_ < Node_Sub22.anInt7074; i_18_++)
                                Class172.method1557(i_17_, i_16_, i_18_, (byte) 28);
                        }
                    }
                    Class166.method1534(-1);
                    Node_Sub37.method2594(-25926);
                    Node_Sub13.method2261(7951);
                    Node_Sub14_Sub35.method2379(true);
                    Node_Sub14_Sub35.method2383(-1);
                    if (Class300.aFrame3494 != null && Class289.aClass111_3398 != null && Class273.anInt5008 == 11) {
                        Class59.anInt801++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i ^ ~0x69, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class135.aOutgoingOpcode_1632));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(i ^ ~0x6c47, 1057001181);
                        Class226_Sub3.method1814(class248_sub36, i + 105);
                    }
                    if (Class270.anInt3134 == 0) {
                        int i_19_ = ((Class150.anInt1751 + -(Node_Sub8_Sub4.anInt8360 >> 2009813604)) / 8);
                        int i_20_ = (((Node_Sub8_Sub4.anInt8360 >> -1533890524) + Class150.anInt1751) / 8);
                        int i_21_ = ((Node_Sub19.anInt7031 + -(Node_Sub22.anInt7074 >> -1578855772)) / 8);
                        int i_22_ = ((Node_Sub19.anInt7031 + (Node_Sub22.anInt7074 >> -86343708)) / 8);
                        for (int i_23_ = -1 + i_19_; (i_23_ ^ 0xffffffff) >= (1 + i_20_ ^ 0xffffffff); i_23_++) {
                            for (int i_24_ = i_21_ + -1; ((i_22_ + 1 ^ 0xffffffff) <= (i_24_ ^ 0xffffffff)); i_24_++) {
                                if ((i_23_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff) || (i_20_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff) || i_24_ < i_21_ || (i_22_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff)) {
                                    Class340_Sub6.aClass381_8158.method3923("m" + i_23_ + "_" + i_24_, 0);
                                    Class340_Sub6.aClass381_8158.method3923("l" + i_23_ + "_" + i_24_, i + 105);
                                }
                            }
                        }
                    }
                    if (Class273.anInt5008 == 4)
                        Node_Sub14_Sub15.method2318(3, -21035);
                    else if (Class273.anInt5008 != 8) {
                        Node_Sub14_Sub15.method2318(10, i + -20930);
                        if (Class289.aClass111_3398 != null) {
                            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class230.aOutgoingOpcode_2602));
                            Class226_Sub3.method1814(class248_sub36, 0);
                        }
                    } else
                        Node_Sub14_Sub15.method2318(7, -21035);
                    Node_Sub14_Sub5.method2288(true);
                    Node_Sub37.method2594(i + -25821);
                    Class366.method3830(0);
                    Node_Sub30.aBoolean7192 = true;
                    if (Class325.aBoolean3831) {
                        Class106.method750(("Took: " + (-Class226_Sub1_Sub1.aLong8805 + Class118.method1112(116)) + "ms"), (byte) 122);
                        Class325.aBoolean3831 = false;
                    }
                }
            }
        }
    }

    Node_Sub29(int i, int i_25_) {
        ((Node_Sub29) this).anInt7173 = i_25_;
        ((Node_Sub29) this).anInt7171 = i;
    }
}
