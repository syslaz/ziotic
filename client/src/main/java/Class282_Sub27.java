/* Class282_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub27 extends Class282 {
    static int anInt7867;
    static int anInt7868;
    static int anInt7869;
    static int anInt7870;
    static Class181 aClass181_7871 = new Class181();
    static int anInt7872;
    static int anInt7873;
    static int anInt7874;
    static int anInt7875;
    static int anInt7876;
    static int[] anIntArray7877;
    static int anInt7878 = 0;
    static int anInt7879;

    final boolean method3032(int i) {
        anInt7869++;
        if (!Node_Sub8_Sub1.method2025(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), 18107))
            return false;
        if (i != 260)
            aClass181_7871 = null;
        return true;
    }

    Class282_Sub27(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final void method2918(byte i) {
        if (i != 98)
            aClass181_7871 = null;
        if (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub15_7358.method2979((byte) 10) && !Node_Sub8_Sub1.method2025(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), 18107))
            ((Class282) this).anInt3320 = 0;
        anInt7879++;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || ((Class282) this).anInt3320 > 1)
            ((Class282) this).anInt3320 = method2919(false);
    }

    static final boolean method3033(int i, int i_0_, boolean bool) {
        anInt7873++;
        if (bool != false)
            anIntArray7877 = null;
        if ((i & 0x100) == 0)
            return false;
        return true;
    }

    final int method3034(boolean bool) {
        if (bool != true)
            aClass181_7871 = null;
        anInt7875++;
        return ((Class282) this).anInt3320;
    }

    final int method2917(int i, int i_1_) {
        if (i != 0)
            aClass181_7871 = null;
        anInt7870++;
        if (!Node_Sub8_Sub1.method2025(((Node_Sub45) (((Class282) this).aClass248_Sub45_3321)).aClass282_Sub15_7358.method2984(true), 18107))
            return 3;
        return 1;
    }

    static final Class1 method3035(byte i, ByteStream class248_sub9) {
        anInt7874++;
        Class1 class1 = new Class1();
        ((Class1) class1).anInt112 = class248_sub9.readShort(-1);
        if (i != -13)
            return null;
        ((Class1) class1).aClass248_Sub8_Sub20_106 = Class44_Sub1.aClass152_5288.method1356(true, ((Class1) class1).anInt112);
        return class1;
    }

    static final int method3036(int i, int i_2_, byte i_3_) {
        anInt7867++;
        int i_4_;
        if (i <= 20000) {
            if (i <= 10000) {
                if (i <= 5000) {
                    Node.method1968(1, true);
                    i_4_ = 1;
                } else {
                    Class238_Sub2.method1888((byte) -85);
                    i_4_ = 2;
                }
            } else {
                i_4_ = 3;
                Node_Sub14_Sub12_Sub1.method2310(0);
            }
        } else {
            Class311.method3265((byte) -95);
            i_4_ = 4;
        }
        if (i_3_ <= 88)
            anInt7878 = -40;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7358.method2984(true) != i_2_) {
            Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub15_7322), (byte) -71, i_2_);
            Node_Sub15_Sub5.method2495(false, 98, i_2_);
        }
        Class293.method3113(17458);
        return i_4_;
    }

    Class282_Sub27(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    public static void method3037(int i) {
        if (i != 18)
            anIntArray7877 = null;
        anIntArray7877 = null;
        aClass181_7871 = null;
    }

    final int method2919(boolean bool) {
        if (bool != false)
            aClass181_7871 = null;
        anInt7868++;
        return 0;
    }

    final void method2922(boolean bool, int i) {
        if (bool != true)
            anInt7876 = 4;
        anInt7872++;
        ((Class282) this).anInt3320 = i;
    }

    static {
        anIntArray7877 = (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }
}
