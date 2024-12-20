/* Class282_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub23 extends Class282 {
    static int anInt7827;
    static int anInt7828;
    static int anInt7829;
    static int[] anIntArray7830;
    static int anInt7831;
    static int anInt7832;
    static int anInt7833;
    static int anInt7834;
    static Class378 aClass378_7835;

    Class282_Sub23(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    Class282_Sub23(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    public static void method3016(int i) {
        anIntArray7830 = null;
        if (i == 2)
            aClass378_7835 = null;
    }

    static final void method3017(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt7832++;
        int i_4_ = Class151.anInt1799;
        int i_5_ = Node_Sub14_Sub37.anInt9562;
        if (Node_Sub8_Sub6.aBoolean8949) {
            i_4_ += Class337.method3420(-2);
            i_5_ += RSInterface2.method3770((byte) -19);
        }
        if (Class276.anInt3206 == 1) {
            Class129 class129 = Class54.aClass129Array722[Class221.anInt2537 / 100];
            class129.method1168(i_4_ + -8, i_5_ + -8);
            Class210.method1724(class129.method1169() + -8 + i_4_, -8 + i_4_, (byte) -61, class129.method1181() + i_5_ - 8, -8 + i_5_);
        }
        if ((Class276.anInt3206 ^ 0xffffffff) == -3) {
            Class129 class129 = Class54.aClass129Array722[Class221.anInt2537 / 100 + 4];
            class129.method1168(i_4_ - 8, -8 + i_5_);
            Class210.method1724(i_4_ - (8 + -class129.method1169()), -8 + i_4_, (byte) -127, i_5_ - 8 + class129.method1181(), -8 + i_5_);
        }
        Class111.method778((byte) 88);
        if (i != -3267)
            anIntArray7830 = null;
    }

    final int method2919(boolean bool) {
        anInt7828++;
        if (bool != false)
            return 59;
        return 1;
    }

    final void method2922(boolean bool, int i) {
        anInt7831++;
        ((Class282) this).anInt3320 = i;
        if (bool != true)
            aClass378_7835 = null;
    }

    final int method2917(int i, int i_6_) {
        anInt7834++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i))
            return 3;
        if (i_6_ == 0 || (((Node_Sub45) ((Class282) this).aClass248_Sub45_3321).aClass282_Sub25_7345.method3026(true) ^ 0xffffffff) == -2)
            return 1;
        return 2;
    }

    final int method3018(boolean bool) {
        if (bool != true)
            aClass378_7835 = null;
        anInt7833++;
        return ((Class282) this).anInt3320;
    }

    final void method2918(byte i) {
        if (i != 98)
            aClass378_7835 = null;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            ((Class282) this).anInt3320 = 0;
        anInt7827++;
        if (((Class282) this).anInt3320 < 0 && ((Class282) this).anInt3320 > 2)
            ((Class282) this).anInt3320 = method2919(false);
    }

    final boolean method3019(int i) {
        anInt7829++;
        if (i != 260)
            anIntArray7830 = null;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            return false;
        return true;
    }
}
