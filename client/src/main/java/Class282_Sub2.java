/* Class282_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub2 extends Class282 {
    static int anInt7599;
    static int anInt7600;
    static int anInt7601;
    static int anInt7602;
    static int anInt7603;
    static int anInt7604;
    static Class280 aClass280_7605 = new Class280();
    static int anInt7606;
    static int anInt7607;
    static Class161 aClass161_7608;
    static int anInt7609 = 0;
    static float aFloat7610;
    static int anInt7611 = 0;
    static String[] aStringArray7612;
    static String aString7613;

    static final void method2926(boolean bool, int i, int i_0_, int i_1_) {
        anInt7599++;
        if (i_0_ != Class225_Sub1.anInt8451 || (Class2.anInt118 ^ 0xffffffff) != (i ^ 0xffffffff) || (i_1_ ^ 0xffffffff) != (s_Sub2.anInt7955 ^ 0xffffffff)) {
            Class2.anInt118 = i;
            s_Sub2.anInt7955 = i_1_;
            Node_Sub30.aBoolean7192 = bool;
            Class225_Sub1.anInt8451 = i_0_;
            double d = -(3.141592653589793 * (double) (2 * i_0_)) / 16384.0;
            double d_2_ = -(3.141592653589793 * (double) (i * 2)) / 16384.0;
            double d_3_ = Math.cos(d_2_);
            double d_4_ = Math.sin(d_2_);
            double d_5_ = Math.cos(d);
            double d_6_ = Math.sin(d);
            Class290.aDouble3418 = d_3_;
            Class69.aDouble914 = d_5_;
            Class321.aDouble3765 = d_6_;
            Class279.aDouble3244 = 0.0;
            Class61.aDouble833 = d_5_ * d_3_;
            Class302.aDouble3499 = d_4_;
            Class316.aDouble3661 = d_5_ * -d_4_;
            Node_Sub8_Sub10.aDouble8982 = d_4_ * d_6_;
            Class331.aDouble3863 = d_6_ * -d_3_;
        }
    }

    final void method2918(byte i) {
        if (i == 98) {
            anInt7607++;
            if (((Class282) this).anInt3320 < 0 || ((Class282) this).anInt3320 > 4)
                ((Class282) this).anInt3320 = method2919(false);
        }
    }

    final int method2917(int i, int i_7_) {
        anInt7603++;
        if (i != 0)
            return 110;
        return 1;
    }

    final void method2922(boolean bool, int i) {
        if (bool == true) {
            ((Class282) this).anInt3320 = i;
            anInt7601++;
        }
    }

    final int method2927(boolean bool) {
        anInt7604++;
        if (bool != true)
            method2930((byte) -14, null, null);
        return ((Class282) this).anInt3320;
    }

    public static void method2928(boolean bool) {
        aString7613 = null;
        if (bool != true)
            aString7613 = null;
        aClass280_7605 = null;
        aClass161_7608 = null;
        aStringArray7612 = null;
    }

    static final void method2929(int i) {
        anInt7600++;
        if ((Class273.anInt5008 ^ 0xffffffff) == -8)
            Class340_Sub5.method3455(52, false);
        else if (i == 16384) {
            Class275_Sub1.aClass111_8592 = Class289.aClass111_3398;
            Class289.aClass111_3398 = null;
            Node_Sub14_Sub15.method2318(13, -21035);
        }
    }

    final int method2919(boolean bool) {
        if (bool != false)
            aClass280_7605 = null;
        anInt7602++;
        return 3;
    }

    static final void method2930(byte i, RSInterface2 class354, RSInterface2 class354_8_) {
        anInt7606++;
        Node_Sub40_Sub1.anInt9767++;
        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, aa_Sub3.aOutgoingOpcode_5268);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(i + 27807, ((RSInterface2) class354).interfaceValues);
        if (i == -112) {
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(((RSInterface2) class354).id, 92);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, ((RSInterface2) class354_8_).interfaceValues);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, ((RSInterface2) class354).index);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, ((RSInterface2) class354_8_).index);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, ((RSInterface2) class354_8_).id);
            Class226_Sub3.method1814(class248_sub36, 0);
        }
    }

    Class282_Sub2(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    Class282_Sub2(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }
}
