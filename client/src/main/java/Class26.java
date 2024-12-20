/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Hashtable;

final class Class26 {
    Class346_Sub5 aClass346_Sub5_346 = new Class346_Sub5();
    static int anInt347;
    static int anInt348;
    static int anInt349;
    static int anInt350;
    static boolean aBoolean351 = false;
    static int anInt352;
    static int anInt353;
    static int anInt354;
    static Hashtable aHashtable355 = new Hashtable();
    private Class346_Sub5 aClass346_Sub5_356;
    static int anInt357 = 0;

    final int method245(int i) {
        anInt348++;
        int i_0_ = i;
        Class346_Sub5 class346_sub5 = (((Class346_Sub5) ((Class26) this).aClass346_Sub5_346).aClass346_Sub5_8279);
        while (class346_sub5 != ((Class26) this).aClass346_Sub5_346) {
            class346_sub5 = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279;
            i_0_++;
        }
        return i_0_;
    }

    final Class346_Sub5 method246(byte i) {
        anInt350++;
        Class346_Sub5 class346_sub5 = (((Class346_Sub5) ((Class26) this).aClass346_Sub5_346).aClass346_Sub5_8279);
        if (class346_sub5 == ((Class26) this).aClass346_Sub5_346) {
            aClass346_Sub5_356 = null;
            return null;
        }
        aClass346_Sub5_356 = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279;
        if (i <= 111)
            method251(true);
        return class346_sub5;
    }

    final Class346_Sub5 method247(int i) {
        anInt352++;
        Class346_Sub5 class346_sub5 = aClass346_Sub5_356;
        if (class346_sub5 == ((Class26) this).aClass346_Sub5_346) {
            aClass346_Sub5_356 = null;
            return null;
        }
        aClass346_Sub5_356 = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279;
        if (i > -123)
            ((Class26) this).aClass346_Sub5_346 = null;
        return class346_sub5;
    }

    static final boolean method248(Class56 class56, int i, int i_1_, int i_2_, ha var_ha, Node_Sub35 class248_sub35) {
        anInt353++;
        int i_3_ = 2147483647;
        int i_4_ = -2147483648;
        int i_5_ = 2147483647;
        int i_6_ = -2147483648;
        if (((Class56) class56).anIntArray754 != null) {
            i_4_ = (Class116.anInt1464 + ((Class116.anInt1466 + -Class116.anInt1464) * (((Class56) class56).anInt778 - -((Node_Sub35) class248_sub35).anInt7252 + -Class116.anInt1460) / (Class116.anInt1461 + -Class116.anInt1460)));
            i_5_ = (Class116.anInt1456 + -((((Node_Sub35) class248_sub35).anInt7246 + (((Class56) class56).anInt736 - Class116.anInt1449)) * (-Class116.anInt1470 + Class116.anInt1456) / (Class116.anInt1454 - Class116.anInt1449)));
            i_3_ = (Class116.anInt1464 - -((((Node_Sub35) class248_sub35).anInt7252 + ((Class56) class56).anInt769 + -Class116.anInt1460) * (Class116.anInt1466 - Class116.anInt1464) / (Class116.anInt1461 + -Class116.anInt1460)));
            i_6_ = (Class116.anInt1456 + -((-Class116.anInt1449 + ((Node_Sub35) class248_sub35).anInt7246 + ((Class56) class56).anInt770) * (Class116.anInt1456 - Class116.anInt1470) / (Class116.anInt1454 - Class116.anInt1449)));
        }
        if (i_2_ != -1789756095)
            aBoolean351 = false;
        Class129 class129 = null;
        int i_7_ = 0;
        int i_8_ = 0;
        int i_9_ = 0;
        int i_10_ = 0;
        if ((((Class56) class56).anInt744 ^ 0xffffffff) != 0) {
            if (((Node_Sub35) class248_sub35).aBoolean7242 && ((Class56) class56).anInt757 != -1)
                class129 = class56.method452(true, var_ha, (byte) 72);
            else
                class129 = class56.method452(false, var_ha, (byte) 72);
            if (class129 != null) {
                i_7_ = (((Node_Sub35) class248_sub35).anInt7245 - (class129.method1169() + 1 >> 1382816065));
                i_8_ = (((Node_Sub35) class248_sub35).anInt7245 + (1 + class129.method1169() >> 559590433));
                if ((i_3_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                    i_3_ = i_7_;
                i_9_ = (((Node_Sub35) class248_sub35).anInt7249 + -(class129.method1181() + 1 >> -1985499199));
                if ((i_4_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff))
                    i_4_ = i_8_;
                i_10_ = (((Node_Sub35) class248_sub35).anInt7249 + (class129.method1181() - -1 >> 544296257));
                if (i_9_ < i_5_)
                    i_5_ = i_9_;
                if ((i_10_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
                    i_6_ = i_10_;
            }
        }
        Class243 class243 = null;
        int i_11_ = 0;
        int i_12_ = 0;
        int i_13_ = 0;
        int i_14_ = 0;
        int i_15_ = 0;
        int i_16_ = 0;
        int i_17_ = 0;
        int i_18_ = 0;
        if (((Class56) class56).aString786 != null) {
            class243 = Class282_Sub25.method3027(((Class56) class56).anInt763, 102);
            if (class243 != null) {
                i_11_ = s_Sub2.aClass285_7962.method3073((((Class56) class56).aString786), 174, null, (WorldAddress.aStringArray1196), null);
                i_13_ = (-((Class116.anInt1456 - Class116.anInt1470) * ((Class56) class56).anInt774 / (Class116.anInt1454 + -Class116.anInt1449)) + ((Node_Sub35) class248_sub35).anInt7249);
                i_12_ = (((Node_Sub35) class248_sub35).anInt7245 - -((Class116.anInt1466 + -Class116.anInt1464) * ((Class56) class56).anInt753 / (-Class116.anInt1460 + Class116.anInt1461)));
                if (class129 != null)
                    i_13_ -= ((class129.method1181() >> -445338559) - -(class243.method1936() * i_11_));
                else
                    i_13_ -= i_11_ * class243.method1935() / 2;
                for (int i_19_ = 0; i_11_ > i_19_; i_19_++) {
                    String string = WorldAddress.aStringArray1196[i_19_];
                    if (-1 + i_11_ > i_19_)
                        string = string.substring(0, -4 + string.length());
                    int i_20_ = class243.method1937(string);
                    if ((i_20_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff))
                        i_14_ = i_20_;
                }
                i_15_ = i_1_ + (-(i_14_ / 2) + i_12_);
                if (i_3_ > i_15_)
                    i_3_ = i_15_;
                i_16_ = i_1_ + (i_14_ / 2 + i_12_);
                if (i_4_ < i_16_)
                    i_4_ = i_16_;
                i_17_ = i + i_13_;
                i_18_ = i_11_ * class243.method1936() + i_13_ - -i;
                if ((i_5_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff))
                    i_5_ = i_17_;
                if (i_6_ < i_18_)
                    i_6_ = i_18_;
            }
        }
        if ((Class116.anInt1464 ^ 0xffffffff) < (i_4_ ^ 0xffffffff) || (Class116.anInt1466 ^ 0xffffffff) > (i_3_ ^ 0xffffffff) || (Class116.anInt1470 ^ 0xffffffff) < (i_6_ ^ 0xffffffff) || (i_5_ ^ 0xffffffff) < (Class116.anInt1456 ^ 0xffffffff))
            return true;
        Class116.method1088(var_ha, class248_sub35, class56);
        if (class129 != null) {
            if ((Node_Sub28.anInt7166 ^ 0xffffffff) < -1 && (((Class177.anInt2067 ^ 0xffffffff) != 0 && (((Node_Sub35) class248_sub35).anInt7243 ^ 0xffffffff) == (Class177.anInt2067 ^ 0xffffffff)) || (Class55.anInt733 != -1 && (Class55.anInt733 == ((Class56) class56).anInt751)))) {
                int i_21_;
                if (Class282_Sub1.anInt7595 <= 50)
                    i_21_ = 2 * Class282_Sub1.anInt7595;
                else
                    i_21_ = 200 - 2 * Class282_Sub1.anInt7595;
                int i_22_ = 0xffff00 | i_21_ << -144254536;
                var_ha.method814(i_22_, ((Node_Sub35) class248_sub35).anInt7249, 7 + class129.method1175() / 2, true, ((Node_Sub35) class248_sub35).anInt7245);
                var_ha.method814(i_22_, ((Node_Sub35) class248_sub35).anInt7249, 5 + class129.method1175() / 2, true, ((Node_Sub35) class248_sub35).anInt7245);
                var_ha.method814(i_22_, ((Node_Sub35) class248_sub35).anInt7249, 3 + class129.method1175() / 2, true, ((Node_Sub35) class248_sub35).anInt7245);
                var_ha.method814(i_22_, ((Node_Sub35) class248_sub35).anInt7249, class129.method1175() / 2 - -1, true, ((Node_Sub35) class248_sub35).anInt7245);
                var_ha.method814(i_22_, ((Node_Sub35) class248_sub35).anInt7249, class129.method1175() / 2, true, ((Node_Sub35) class248_sub35).anInt7245);
            }
            class129.method1168((((Node_Sub35) class248_sub35).anInt7245 - (class129.method1169() >> -1789756095)), (((Node_Sub35) class248_sub35).anInt7249 + -(class129.method1181() >> -937097183)));
        }
        if (((Class56) class56).aString786 != null && class243 != null)
            Class96.method700(i_14_, class56, 9997, var_ha, i_12_, class248_sub35, i_13_, i_11_, class243);
        if (((Class56) class56).anInt744 != -1 || ((Class56) class56).aString786 != null) {
            Node_Sub23 class248_sub23 = new Node_Sub23(class248_sub35);
            ((Node_Sub23) class248_sub23).anInt7090 = i_10_;
            ((Node_Sub23) class248_sub23).anInt7094 = i_18_;
            ((Node_Sub23) class248_sub23).anInt7084 = i_9_;
            ((Node_Sub23) class248_sub23).anInt7085 = i_17_;
            ((Node_Sub23) class248_sub23).anInt7092 = i_15_;
            ((Node_Sub23) class248_sub23).anInt7083 = i_7_;
            ((Node_Sub23) class248_sub23).anInt7087 = i_8_;
            ((Node_Sub23) class248_sub23).anInt7091 = i_16_;
            Class102.aClass293_1308.method3109(class248_sub23, -95);
        }
        return false;
    }

    final void method249(int i, Class346_Sub5 class346_sub5) {
        if (((Class346_Sub5) class346_sub5).aClass346_Sub5_8281 != null)
            class346_sub5.method3547(-11364);
        anInt349++;
        ((Class346_Sub5) class346_sub5).aClass346_Sub5_8281 = (((Class346_Sub5) ((Class26) this).aClass346_Sub5_346).aClass346_Sub5_8281);
        ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279 = ((Class26) this).aClass346_Sub5_346;
        int i_23_ = 18 % ((30 - i) / 51);
        ((Class346_Sub5) ((Class346_Sub5) class346_sub5).aClass346_Sub5_8281).aClass346_Sub5_8279 = class346_sub5;
        ((Class346_Sub5) ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279).aClass346_Sub5_8281 = class346_sub5;
    }

    final void method250(int i) {
        anInt347++;
        for (; ; ) {
            Class346_Sub5 class346_sub5 = (((Class346_Sub5) ((Class26) this).aClass346_Sub5_346).aClass346_Sub5_8279);
            if (class346_sub5 == ((Class26) this).aClass346_Sub5_346)
                break;
            class346_sub5.method3547(-11364);
        }
        if (i == -10538)
            aClass346_Sub5_356 = null;
    }

    public static void method251(boolean bool) {
        if (bool == false)
            aHashtable355 = null;
    }

    static final Class147_Sub1 method252(int i) {
        anInt354++;
        if ((Class311.anInt3612 ^ 0xffffffff) > (Class64.aClass147_Sub1Array869.length ^ 0xffffffff))
            return Class64.aClass147_Sub1Array869[Class311.anInt3612++];
        if (i != -144254536)
            aHashtable355 = null;
        return null;
    }

    public Class26() {
        ((Class346_Sub5) ((Class26) this).aClass346_Sub5_346).aClass346_Sub5_8281 = ((Class26) this).aClass346_Sub5_346;
        ((Class346_Sub5) ((Class26) this).aClass346_Sub5_346).aClass346_Sub5_8279 = ((Class26) this).aClass346_Sub5_346;
    }
}
