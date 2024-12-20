/* Class282_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class282_Sub21 extends Class282 {
    static int anInt7804;
    static int anInt7805;
    static int anInt7806;
    static int anInt7807;
    static int anInt7808;
    static int anInt7809;
    static OutgoingOpcode aOutgoingOpcode_7810 = new OutgoingOpcode(55, -1);
    static int anInt7811;
    static int anInt7812;
    static Class272 aClass272_7813;
    static int anInt7814;
    static int anInt7815;
    static Class168 aClass168_7816;
    static int anInt7817 = 0;
    static int anInt7818;
    static int anInt7819;

    static final void method3006(byte i, int i_0_, int i_1_) {
        anInt7814++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_0_, -874792672, 13);
        class248_sub8_sub10.method2084(614);
        if (i > 7)
            ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_1_;
    }

    final void method2918(byte i) {
        if (i != 98)
            aClass168_7816 = null;
        anInt7805++;
        if (method3008(2)) {
            if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub15_7358.method2979((byte) 76) && !Class318.method3314(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), true))
                ((Class282) this).anInt3320 = 1;
            if ((((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub1_7354.method2925(true) ^ 0xffffffff) == -2)
                ((Class282) this).anInt3320 = 1;
        }
        if ((((Class282) this).anInt3320 ^ 0xffffffff) == -4)
            ((Class282) this).anInt3320 = 2;
        if (((Class282) this).anInt3320 < 0 || (((Class282) this).anInt3320 ^ 0xffffffff) < -4)
            ((Class282) this).anInt3320 = method2919(false);
    }

    final int method2919(boolean bool) {
        if (bool != false)
            method3007(-71);
        anInt7806++;
        return 0;
    }

    final boolean method3007(int i) {
        if (i != 260)
            method3006((byte) -42, 56, 111);
        anInt7819++;
        return true;
    }

    final boolean method3008(int i) {
        anInt7807++;
        if (i != 2)
            return false;
        return Class50.method394(((Class282) this).anInt3320, -120);
    }

    Class282_Sub21(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2917(int i, int i_2_) {
        anInt7808++;
        if (Class50.method394(i_2_, -125)) {
            if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub15_7358.method2979((byte) -122) && !Class318.method3314(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), true))
                return 3;
            if ((((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub1_7354.method2925(true) ^ 0xffffffff) == -2)
                return 3;
        }
        if ((i_2_ ^ 0xffffffff) == -4)
            return 3;
        if (i != 0)
            anInt7817 = -120;
        if (Class50.method394(i_2_, -124))
            return 2;
        return 1;
    }

    static final byte[] method3009(File file, byte i) {
        anInt7818++;
        if (i > -92)
            aClass272_7813 = null;
        return Class328.method3368(9233, (int) file.length(), file);
    }

    final int method3010(boolean bool) {
        anInt7811++;
        if (bool != true)
            anInt7815 = -46;
        return ((Class282) this).anInt3320;
    }

    public static void method3011(int i) {
        aClass272_7813 = null;
        aOutgoingOpcode_7810 = null;
        aClass168_7816 = null;
        int i_3_ = 5 % ((-34 - i) / 59);
    }

    static final int method3012(byte i, String string) {
        anInt7812++;
        if (i >= -107)
            aOutgoingOpcode_7810 = null;
        return Class377.method3885(10, true, 25744, string);
    }

    final void method2922(boolean bool, int i) {
        if (bool != true)
            method3006((byte) 14, -103, -53);
        ((Class282) this).anInt3320 = i;
        anInt7809++;
    }

    Class282_Sub21(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    static final Class346_Sub10 method3013(boolean bool, byte i, int i_4_) {
        anInt7804++;
        if (i <= 111)
            anInt7817 = 119;
        synchronized (Class156.aClass360Array1847) {
            Class346_Sub10 class346_sub10;
            if (((Class156.aClass360Array1847.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) && !Class156.aClass360Array1847[i_4_].method3812(false)) {
                class346_sub10 = (Class346_Sub10) Class156.aClass360Array1847[i_4_].method3810(true);
                class346_sub10.method3538(-127);
                Node_Sub8_Sub15.anIntArray9045[i_4_]--;
            } else {
                class346_sub10 = new Class346_Sub10();
                ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353 = new Class346_Sub9[i_4_];
                for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++)
                    ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[i_5_] = new Class346_Sub9();
            }
            ((Class346_Sub10) class346_sub10).aBoolean8352 = bool;
            return class346_sub10;
        }
    }

    static {
        aClass168_7816 = new Class168(14, 0, 4, 1);
    }
}
