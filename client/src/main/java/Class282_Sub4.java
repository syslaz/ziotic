/* Class282_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub4 extends Class282 {
    static int anInt7623;
    static int anInt7624;
    static int anInt7625 = 1400;
    static int anInt7626;
    static int anInt7627;
    static int anInt7628;
    static int anInt7629;
    static int anInt7630;
    static int anInt7631;
    static int anInt7632;
    static int anInt7633;

    final void method2918(byte i) {
        anInt7631++;
        if (i == 98) {
            if (((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(true) < 96)
                ((Class282) this).anInt3320 = 0;
            if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || ((Class282) this).anInt3320 > 2)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }

    static final void method2933(int i, int i_0_) {
        anInt7626++;
        Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method501((long) i_0_, (byte) 31));
        if (class248_sub22 != null) {
            ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method647(16383);
            Class64.method498((byte) -57, ((Node_Sub22) class248_sub22).anInt7080, ((Node_Sub22) class248_sub22).aBoolean7079);
            class248_sub22.remove(true);
        }
        if (i != 8718)
            method2937(58, -37, -33);
    }

    static final byte[] method2934(Object object, int i, int i_1_, int i_2_) {
        if (i <= 22)
            anInt7624 = 45;
        anInt7630++;
        if (object == null)
            return null;
        if (object instanceof byte[]) {
            byte[] is = (byte[]) object;
            return Class82.method594(i_1_, 20569, is, i_2_);
        }
        if (object instanceof Class205) {
            Class205 class205 = (Class205) object;
            return class205.method1693(-93, i_1_, i_2_);
        }
        throw new IllegalArgumentException();
    }

    Class282_Sub4(Node_Sub45 class248_sub45) {
        super(class248_sub45);
        Class374.method3875(((Class282) this).anInt3320, false);
    }

    final boolean method2935(int i) {
        if (i != 260)
            method2937(6, -24, -40);
        anInt7623++;
        if ((((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(true) ^ 0xffffffff) > -97)
            return false;
        return true;
    }

    Class282_Sub4(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
        Class374.method3875(((Class282) this).anInt3320, false);
    }

    final void method2922(boolean bool, int i) {
        ((Class282) this).anInt3320 = i;
        anInt7627++;
        Class374.method3875(((Class282) this).anInt3320, false);
        if (bool != true)
            method2937(46, -3, -53);
    }

    final int method2919(boolean bool) {
        anInt7629++;
        if (((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(!bool) < 96)
            return 0;
        if (bool != false)
            anInt7625 = -74;
        return 2;
    }

    final int method2936(boolean bool) {
        if (bool != true)
            return 94;
        anInt7633++;
        return ((Class282) this).anInt3320;
    }

    static final void method2937(int i, int i_3_, int i_4_) {
        Node_Sub8_Sub1.anInt8889 = i_4_;
        anInt7628++;
        Class325.anInt3828 = i_3_;
        if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == i) {
            Node_Sub38.anInt7269 = Class151.anInt1806 * 2 + Class325.anInt3828;
            Class82.anInt1030 = Node_Sub8_Sub1.anInt8889 - -(Class296.anInt3461 * 2);
        } else if (Node_Sub15_Sub4.anInt9694 == 1) {
            Class108.anInt1363 = (Node_Sub8_Sub1.anInt8908 + Class325.anInt3828 / Class282_Sub26.anInt7860 + 2);
            Class70.anInt927 = (Node_Sub8_Sub1.anInt8889 / Class81.anInt4905 + 2 - -Class86.anInt1064);
            Class82.anInt1030 = Class70.anInt927 * Class81.anInt4905;
            Node_Sub38.anInt7269 = Class282_Sub26.anInt7860 * Class108.anInt1363;
            Class296.anInt3461 = (Class82.anInt1030 + -Node_Sub8_Sub1.anInt8889 >> -1951035903);
            Class151.anInt1806 = Node_Sub38.anInt7269 + -Class325.anInt3828 >> -500536703;
        } else if (Node_Sub15_Sub4.anInt9694 == 2) {
            Class82.anInt1030 = Node_Sub8_Sub1.anInt8889;
            Node_Sub38.anInt7269 = Class325.anInt3828;
        }
    }

    final int method2917(int i, int i_5_) {
        if (i != 0)
            method2937(-49, -114, 49);
        anInt7632++;
        if (((Class282) this).aClass248_Sub45_3321.method2652(-18640).method758(true) < 96)
            return 3;
        return 1;
    }

    static {
        anInt7624 = 0;
    }
}
