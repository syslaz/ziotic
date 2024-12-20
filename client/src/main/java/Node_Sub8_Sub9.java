/* Class248_Sub8_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Calendar;
import java.util.TimeZone;

final class Node_Sub8_Sub9 extends Node_Sub8 {
    static int[] anIntArray8966;
    static int anInt8967;
    static Calendar aCalendar8968 = Calendar.getInstance();
    static Calendar aCalendar8969 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    Class346_Sub7_Sub2_Sub2 aClass346_Sub7_Sub2_Sub2_8970;

    public static void method2073(int i) {
        aCalendar8968 = null;
        anIntArray8966 = null;
        if (i != -28431)
            aCalendar8969 = null;
        aCalendar8969 = null;
    }

    static final void method2074(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt8967++;
        if (Class311.aClass137ArrayArrayArray3620 == null)
            Class287.aHa3381.method820(i_3_, 108, i_2_, i, i_0_, -16777216);
        else if ((((Interactable) Class347.myPlayer).x) < 0 || ((((Interactable) Class347.myPlayer).x ^ 0xffffffff) <= (Node_Sub8_Sub4.anInt8360 * 512 ^ 0xffffffff)) || ((Interactable) Class347.myPlayer).y < 0 || (((Interactable) Class347.myPlayer).y >= Node_Sub22.anInt7074 * 512))
            Class287.aHa3381.method820(i_3_, 29, i_2_, i, i_0_, -16777216);
        else {
            Class54.anInt727++;
            if (Class347.myPlayer != null && ((((Interactable) Class347.myPlayer).x - Class347.myPlayer.method3632(-1) * 256 - -256) >> -663994007 ^ 0xffffffff) == (Applet_Sub1.anInt44 ^ 0xffffffff) && ((((Interactable) Class347.myPlayer).y + -(256 * Class347.myPlayer.method3632(-1)) - -256) >> 813668489 ^ 0xffffffff) == (Class72.anInt4876 ^ 0xffffffff)) {
                Applet_Sub1.anInt44 = -1;
                Class72.anInt4876 = -1;
                Class96.method704(false);
            }
            Class225_Sub2.method1795(false);
            if (!bool)
                Class99.method711(0);
            Class119.method1121(96);
            Class106.method748(i_3_, i, i_2_, i_0_, true, (byte) -72);
            i_2_ = Class155.anInt1830;
            i = Class237.anInt2637;
            i_3_ = Class317.anInt3666;
            i_0_ = Class282_Sub17.anInt7769;
            ObjectDefinition.anInt3100 = ObjectDefinition.anInt3041;
            if (Node_Sub45.anInt7343 != 1) {
                if (Node_Sub45.anInt7343 != 4) {
                    if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -6)
                        Class282_Sub29.method3049(i_2_, -128);
                } else {
                    int i_4_ = (int) Node_Sub8_Sub13.aFloat9030;
                    if ((Node_Sub14_Sub6.anInt9213 >> 1165809096 ^ 0xffffffff) < (i_4_ ^ 0xffffffff))
                        i_4_ = Node_Sub14_Sub6.anInt9213 >> 2062906600;
                    if (Class160.aBooleanArray1890[4] && Class19.anIntArray301[4] - -128 > i_4_)
                        i_4_ = Class19.anIntArray301[4] + 128;
                    int i_5_ = (int) Class282_Sub7.aFloat7661 & 0x3fff;
                    Class171.method1550(true, Class189.anInt5066, i_4_, Class82.anInt1027, i_2_, 3 * (i_4_ >> 1393478019) + 600 << 877169570, -200 + Class353.method3753(Node_Sub32.anInt7198, Class61.anInt831, 11, Class177.anInt2074), i_5_);
                }
            } else {
                int i_6_ = (int) Node_Sub8_Sub13.aFloat9030;
                if ((Node_Sub14_Sub6.anInt9213 >> -1348714648 ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
                    i_6_ = Node_Sub14_Sub6.anInt9213 >> 968726792;
                if (Class160.aBooleanArray1890[4] && i_6_ < Class19.anIntArray301[4] + 128)
                    i_6_ = 128 + Class19.anIntArray301[4];
                int i_7_ = ((int) Class282_Sub7.aFloat7661 - -Class86.anInt1066 & 0x3fff);
                Class171.method1550(true, Class189.anInt5066, i_6_, Class82.anInt1027, i_2_, 600 + 3 * (i_6_ >> 1711565219) << -1538927326, (Class353.method3753(((Interactable) Class347.myPlayer).y, ((Interactable) Class347.myPlayer).x, -29, Class177.anInt2074)) - 200, i_7_);
            }
            int i_8_ = Class346_Sub7_Sub1.cameraPosX;
            int i_9_ = InputStream_Sub1.cameraPosY;
            int i_10_ = Class316_Sub1_Sub2.cameraPosZ;
            int i_11_ = Class127.cameraPitch;
            int i_12_ = Class301_Sub3_Sub1.cameraYaw;
            if (i_1_ > -65)
                method2074(6, true, 92, 1, 108, -46);
            for (int i_13_ = 0; i_13_ < 5; i_13_++) {
                if (Class160.aBooleanArray1890[i_13_]) {
                    int i_14_ = (int) ((Math.random() * (double) (1 + (Node_Sub8_Sub11.anIntArray9000[i_13_]) * 2)) - (double) (Node_Sub8_Sub11.anIntArray9000[i_13_]) + ((Math.sin((double) Class23.anIntArray322[i_13_] * ((double) (Class346_Sub7_Sub4_Sub2.anIntArray10187[i_13_]) / 100.0))) * (double) Class19.anIntArray301[i_13_]));
                    if ((i_13_ ^ 0xffffffff) == -2)
                        InputStream_Sub1.cameraPosY += i_14_ << -367083038;
                    if (i_13_ == 2)
                        Class316_Sub1_Sub2.cameraPosZ += i_14_ << 1311776354;
                    if (i_13_ == 0)
                        Class346_Sub7_Sub1.cameraPosX += i_14_ << 1620415778;
                    if ((i_13_ ^ 0xffffffff) == -4)
                        Class301_Sub3_Sub1.cameraYaw = Class301_Sub3_Sub1.cameraYaw - -i_14_ & 0x3fff;
                    if (i_13_ == 4) {
                        Class127.cameraPitch += i_14_;
                        if ((Class127.cameraPitch ^ 0xffffffff) > -1025)
                            Class127.cameraPitch = 1024;
                        else if ((Class127.cameraPitch ^ 0xffffffff) < -3073)
                            Class127.cameraPitch = 3072;
                    }
                }
            }
            if ((Class346_Sub7_Sub1.cameraPosX ^ 0xffffffff) > -1)
                Class346_Sub7_Sub1.cameraPosX = 0;
            if ((Class316_Sub1_Sub2.cameraPosZ ^ 0xffffffff) > -1)
                Class316_Sub1_Sub2.cameraPosZ = 0;
            if ((Class346_Sub7_Sub1.cameraPosX ^ 0xffffffff) < (-1 + (Class225_Sub1.anInt8454 << 558297193) ^ 0xffffffff))
                Class346_Sub7_Sub1.cameraPosX = (Class225_Sub1.anInt8454 << -876074647) - 1;
            if ((Class316_Sub1_Sub2.cameraPosZ ^ 0xffffffff) < ((Class89.anInt1106 << 173928233) - 1 ^ 0xffffffff))
                Class316_Sub1_Sub2.cameraPosZ = (Class89.anInt1106 << 364151529) - 1;
            Class50.method397((byte) 112);
            Class346_Sub7_Sub1_Sub1.method3585(-99);
            Class287.aHa3381.KA(i_0_, i, i_0_ - -i_3_, i + i_2_);
            Class325.method3362(true, (byte) 103);
            if (!Node_Sub8_Sub6.aBoolean8949) {
                Class287.aHa3381.ya();
                int i_15_ = Class224.anInt2545;
                if (Class223.aClass199_5198 != null)
                    Class223.aClass199_5198.method1681(i_15_, i_0_, Class115.anInt4953 << -1270970621, Class287.aHa3381, Class301_Sub3_Sub1.cameraYaw, (byte) -121, Class127.cameraPitch, i_2_, i, i_3_);
                else
                    Class287.aHa3381.GA(i_15_);
            } else {
                Node_Sub14_Sub33.method2375(false, Class224.anInt2545);
                if ((ObjectDefinition.anInt3100 ^ 0xffffffff) != (Node_Sub14_Sub12.anInt9278 ^ 0xffffffff))
                    Node_Sub30.aBoolean7192 = true;
                Node_Sub14_Sub12.anInt9278 = ObjectDefinition.anInt3100;
            }
            Node_Sub37.method2594(-25926);
            Class272.aViewport_3166.method1869(Class346_Sub7_Sub1.cameraPosX, InputStream_Sub1.cameraPosY, Class316_Sub1_Sub2.cameraPosZ, 0x3fff & -Class127.cameraPitch, 0x3fff & -Class301_Sub3_Sub1.cameraYaw, -Class346_Sub5_Sub1.anInt9886 & 0x3fff);
            Class287.aHa3381.a(Class272.aViewport_3166);
            Class287.aHa3381.DA(i_0_ - -(i_3_ / 2), i - -(i_2_ / 2), Class25.anInt337 << 389111713, Class25.anInt337 << -1844142079);
            Class64.method499((byte) 41, i + i_2_ / 2, Class25.anInt337 << -544672255, i_0_ - -(i_3_ / 2), Class25.anInt337 << 1447189665);
            Node_Sub14_Sub22.method2341(0x3fff & -Class301_Sub3_Sub1.cameraYaw, 0x3fff & -Class127.cameraPitch, 1, InputStream_Sub1.cameraPosY, 0x3fff & -Class346_Sub5_Sub1.anInt9886, Class346_Sub7_Sub1.cameraPosX, Class316_Sub1_Sub2.cameraPosZ);
            byte i_16_ = (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333.method2952(true) == 2 ? (byte) Class54.anInt727 : (byte) 1);
            if (Node_Sub8_Sub6.aBoolean8949) {
                Class282_Sub2.method2926(true, (0x3fff & -Class301_Sub3_Sub1.cameraYaw), 0x3fff & -Class127.cameraPitch, (0x3fff & -Class346_Sub5_Sub1.anInt9886));
                Node_Sub8_Sub1.method2032(1 + (((Interactable) Class347.myPlayer).plane), Class208.anIntArray2403, s_Sub3.anIntArray8013, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314.method2969(true) == 0, true, i_16_, (((Interactable) Class347.myPlayer).x >> 1604290281), (((Interactable) Class347.myPlayer).y >> 837229321), Class114.anIntArray1426, Class346_Sub7_Sub3_Sub1.anIntArray10513, InputStream_Sub1.cameraPosY, Node_Sub18.anInt7027, 0, Class316_Sub1_Sub2.cameraPosZ, Class340_Sub7.anIntArray8163, Class346_Sub7_Sub1.cameraPosX, ObjectDefinition.anInt3100, Class283.aByteArrayArrayArray3338);
            } else
                Class223.method1772(Node_Sub18.anInt7027, Class346_Sub7_Sub1.cameraPosX, InputStream_Sub1.cameraPosY, Class316_Sub1_Sub2.cameraPosZ, Class283.aByteArrayArrayArray3338, Class208.anIntArray2403, Class114.anIntArray1426, Class340_Sub7.anIntArray8163, s_Sub3.anIntArray8013, Class346_Sub7_Sub3_Sub1.anIntArray10513, (((Interactable) Class347.myPlayer).plane - -1), i_16_, (((Interactable) Class347.myPlayer).x >> 111854025), (((Interactable) Class347.myPlayer).y >> -1055272183), (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314.method2969(true) ^ 0xffffffff) == -1, true, Class357.aBoolean4416 ? ObjectDefinition.anInt3100 : -1, 0, false);
            Node_Sub37.method2594(-25926);
            if ((Class273.anInt5008 ^ 0xffffffff) == -11) {
                Class330.method3382(256, 768, i_2_, i_3_, i_0_, 256, i);
                Class332.method3403(true, i_3_, i_0_, i_2_, 256, i, 256);
                Class112_Sub1.method798(i_2_, 256, i_0_, i, i_3_, -61, 256);
                Class282_Sub23.method3017(-3267, i, i_2_, i_0_, i_3_);
            }
            Class279.method2881();
            Class316_Sub1_Sub2.cameraPosZ = i_10_;
            Class346_Sub7_Sub1.cameraPosX = i_8_;
            Class301_Sub3_Sub1.cameraYaw = i_12_;
            Class127.cameraPitch = i_11_;
            InputStream_Sub1.cameraPosY = i_9_;
            if (Class296.aBoolean3459 && Class282_Sub5.aClass323_7634.method3353(0) == 0)
                Class296.aBoolean3459 = false;
            if (Class296.aBoolean3459) {
                Class287.aHa3381.method820(i_3_, 11, i_2_, i, i_0_, -16777216);
                Node_Sub19.method2518(Node_Sub14_Sub31.aClass285_9492, Canvas_Sub1.aClass48_71, Class287.aHa3381, (byte) -27, false, Class41.aClass41_478.method301(Class191.anInt4822, (byte) -108));
            }
            Class325.method3362(false, (byte) 121);
        }
    }

    Node_Sub8_Sub9(Class346_Sub7_Sub2_Sub2 class346_sub7_sub2_sub2) {
        ((Node_Sub8_Sub9) this).aClass346_Sub7_Sub2_Sub2_8970 = class346_sub7_sub2_sub2;
    }
}
