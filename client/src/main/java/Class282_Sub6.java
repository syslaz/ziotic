/* Class282_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub6 extends Class282 {
    static int anInt7642;
    static int anInt7643;
    static int anInt7644;
    static int anInt7645;
    static int anInt7646;
    static int anInt7647;
    static int anInt7648;
    static boolean aBoolean7649 = false;
    static IncommingOpcode aIncommingOpcode_7650 = new IncommingOpcode(122, 0);
    static int anInt7651;
    static Class129 aClass129_7652;
    static int anInt7653;

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        if (bool == true)
            anInt7645++;
    }

    Class282_Sub6(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final int method2919(boolean bool) {
        anInt7651++;
        if (bool != false)
            aIncommingOpcode_7650 = null;
        return 0;
    }

    public static void method2942(int i) {
        if (i <= -78) {
            aClass129_7652 = null;
            aIncommingOpcode_7650 = null;
        }
    }

    final boolean method2943(int i) {
        anInt7644++;
        if (i != 260)
            anInt7653 = -121;
        if (!Node_Sub8_Sub1.method2025(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), 18107))
            return false;
        return true;
    }

    static final void method2944(int i, int i_0_, String string) {
        if (i_0_ == 16504) {
            anInt7648++;
            Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 2);
            class248_sub8_sub10.method2084(614);
            ((Node_Sub8_Sub10) class248_sub8_sub10).aString8974 = string;
        }
    }

    static final int method2945(int i, Class5 class5) {
        anInt7643++;
        if (i != 122)
            method2942(-74);
        if (class5 != Class142.aClass5_1669) {
            if (Class60.aClass5_821 == class5)
                return 8448;
            if (class5 != Class316_Sub1_Sub2.aClass5_9850) {
                if (Class346_Sub4.aClass5_8272 != class5) {
                    if (class5 == Class46.aClass5_583)
                        return 34023;
                } else
                    return 260;
            } else
                return 34165;
        } else
            return 7681;
        throw new IllegalArgumentException();
    }

    final void method2918(byte i) {
        if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub15_7358.method2979((byte) 51) && !Node_Sub8_Sub1.method2025(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), 18107))
            ((Class282) this).anInt3320 = 0;
        anInt7642++;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || (((Class282) this).anInt3320 ^ 0xffffffff) < -3)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            aBoolean7649 = true;
    }

    final int method2946(boolean bool) {
        if (bool != true)
            aIncommingOpcode_7650 = null;
        anInt7647++;
        return ((Class282) this).anInt3320;
    }

    Class282_Sub6(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2917(int i, int i_1_) {
        anInt7646++;
        if (i != 0)
            method2922(true, 51);
        if (!Node_Sub8_Sub1.method2025(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), 18107))
            return 3;
        return 1;
    }
}
