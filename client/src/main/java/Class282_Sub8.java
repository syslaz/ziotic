/* Class282_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class282_Sub8 extends Class282 {
    static int anInt7668;
    static int anInt7669;
    static Class381 aClass381_7670;
    static int anInt7671;
    static int anInt7672;
    static int anInt7673;
    static int anInt7674;

    Class282_Sub8(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    static final Class247 method2950(int i, byte[] is, ha_Sub3_Sub1 var_ha_Sub3_Sub1, byte i_0_) {
        if (i_0_ > -63)
            return null;
        anInt7673++;
        if (is == null)
            return null;
        int i_1_ = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(i, i_1_);
        OpenGL.glProgramRawARB(i, 34933, is);
        OpenGL.glGetIntegerv(34379, Class185.anIntArray2160, 0);
        if ((Class185.anIntArray2160[0] ^ 0xffffffff) != 0) {
            OpenGL.glBindProgramARB(i, 0);
            return null;
        }
        OpenGL.glBindProgramARB(i, 0);
        return new Class247(var_ha_Sub3_Sub1, i, i_1_);
    }

    final void method2922(boolean bool, int i) {
        if (bool != true)
            aClass381_7670 = null;
        anInt7669++;
        ((Class282) this).anInt3320 = i;
    }

    final int method2919(boolean bool) {
        anInt7672++;
        if (bool != false)
            return 69;
        return 2;
    }

    final void method2918(byte i) {
        if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub21_7315.method3008(2) && (((Class282) this).anInt3320 ^ 0xffffffff) == -3)
            ((Class282) this).anInt3320 = 1;
        if (i == 98) {
            anInt7668++;
            if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || (((Class282) this).anInt3320 ^ 0xffffffff) < -3)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }

    public static void method2951(int i) {
        aClass381_7670 = null;
        if (i != 0)
            aClass381_7670 = null;
    }

    final int method2952(boolean bool) {
        if (bool != true)
            return -124;
        anInt7674++;
        return ((Class282) this).anInt3320;
    }

    final int method2917(int i, int i_2_) {
        if (i != 0)
            return -11;
        anInt7671++;
        return 1;
    }

    Class282_Sub8(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }
}
