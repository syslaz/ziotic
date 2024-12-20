/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58 implements Interface15 {
    static int anInt5076;
    int anInt5077;
    static int anInt5078;
    static Class14 aClass14_5079 = new Class14();
    static int anInt5080;

    public static void method457(byte i) {
        if (i != 64)
            method459((byte) 20);
        aClass14_5079 = null;
    }

    static final int method458(int i, int i_0_) {
        anInt5080++;
        if ((i ^ 0xffffffff) > -97)
            return 0;
        if (i < 128)
            return 2;
        if (i_0_ <= 100)
            return -108;
        return 3;
    }

    public final String toString() {
        anInt5078++;
        throw new IllegalStateException();
    }

    static final void method459(byte i) {
        anInt5076++;
        Node_Sub51.method2684(i + -1409991394);
        Node_Sub8_Sub1.method2026(22050, ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub22_7320.method3014(true) == 1, 2, false);
        Node_Sub8_Sub3.aClass345_8922 = Node_Sub8_Sub13.method2094(0, 22050, Class297_Sub1.aCanvas8478, (byte) 27, (Node_Sub14_Sub15.aClass174_9328));
        Class340_Sub2.method3449(true, Class279_Sub2_Sub2.method2906((byte) -121, null), true);
        Class177.aClass345_2069 = Node_Sub8_Sub13.method2094(1, 2048, Class297_Sub1.aCanvas8478, (byte) 27, (Node_Sub14_Sub15.aClass174_9328));
        if (i != -117)
            method457((byte) 91);
        Class177.aClass345_2069.method3530(Class282_Sub15.aClass248_Sub15_Sub3_7751, 99);
    }

    Class58(String string, int i) {
        ((Class58) this).anInt5077 = i;
    }
}
