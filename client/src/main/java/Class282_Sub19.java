/* Class282_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub19 extends Class282 {
    static int anInt7782;
    static boolean aBoolean7783;
    static int anInt7784;
    static int anInt7785 = -2;
    static int anInt7786;
    static int anInt7787;
    static int anInt7788;
    static int anInt7789;
    static int anInt7790;
    static int[] anIntArray7791 = new int[1];
    static int recoveryQuestionsSetDate;
    static float[] aFloatArray7793 = new float[4];
    static int anInt7794;

    Class282_Sub19(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    Class282_Sub19(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2998(boolean bool) {
        anInt7790++;
        if (bool != true)
            aFloatArray7793 = null;
        return ((Class282) this).anInt3320;
    }

    static final void method2999(boolean bool, Class381 class381) {
        anInt7794++;
        if (bool == false)
            Node_Sub8_Sub5.aClass381_8928 = class381;
    }

    final void method2918(byte i) {
        if (((Class282) this).aClass248_Sub45_3321.method2644(i + -98))
            ((Class282) this).anInt3320 = 2;
        if (i != 98)
            aBoolean7783 = true;
        anInt7788++;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || (((Class282) this).anInt3320 ^ 0xffffffff) < -3)
            ((Class282) this).anInt3320 = method2919(false);
    }

    final int method2919(boolean bool) {
        anInt7782++;
        if (bool != false)
            aBoolean7783 = false;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            return 2;
        if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub15_7358.method2979((byte) 121) && Node_Sub14_Sub19.method2336((byte) 117, ((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true)))
            return 1;
        return 0;
    }

    public static void method3000(int i) {
        if (i == 1) {
            anIntArray7791 = null;
            aFloatArray7793 = null;
        }
    }

    final void method2922(boolean bool, int i) {
        anInt7784++;
        if (bool == true)
            ((Class282) this).anInt3320 = i;
    }

    final boolean method3001(int i) {
        anInt7789++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i ^ i))
            return false;
        return true;
    }

    final int method2917(int i, int i_0_) {
        anInt7787++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i))
            return 3;
        return 1;
    }
}
