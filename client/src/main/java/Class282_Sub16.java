/* Class282_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub16 extends Class282 {
    static int anInt7756 = 0;
    static int anInt7757;
    static int anInt7758;
    static int anInt7759;
    static int anInt7760;
    static int anInt7761;
    static int anInt7762;
    static int anInt7763;
    static int anInt7764;
    static int anInt7765;

    Class282_Sub16(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final int method2917(int i, int i_0_) {
        anInt7765++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(i))
            return 3;
        if (((Class282) this).aClass248_Sub45_3321.method2643(i ^ 0x1bc4) == Class346_Sub7_Sub2_Sub3.aClass215_10385)
            return 1;
        return 3;
    }

    final int method2988(boolean bool) {
        anInt7757++;
        if (bool != true)
            return 77;
        return ((Class282) this).anInt3320;
    }

    static final void method2989(int i, int i_1_, Player player, byte i_2_) {
        anInt7759++;
        int[] is = new int[4];
        Class159.method1403(is, 0, is.length, i);
        Class257.method2752(i_1_, player, (byte) 62, is);
        if (i_2_ != -83)
            anInt7756 = 9;
    }

    final void method2922(boolean bool, int i) {
        if (bool != true)
            method2919(true);
        ((Class282) this).anInt3320 = i;
        anInt7763++;
    }

    static final void method2990(byte i) {
        anInt7758++;
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -6; i_3_++)
            Class160.aBooleanArray1890[i_3_] = false;
        if (i != 77)
            method2989(99, 126, null, (byte) -37);
        Class133.anInt5045 = -1;
        Class271.anInt3142 = -1;
        Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
        Node_Sub45.anInt7343 = 1;
        Class282_Sub6.anInt7653 = 0;
        Class84_Sub5.anInt5421 = 0;
    }

    final void method2918(byte i) {
        anInt7764++;
        if (((Class282) this).aClass248_Sub45_3321.method2643(7108) != Class346_Sub7_Sub2_Sub3.aClass215_10385)
            ((Class282) this).anInt3320 = 1;
        else if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            ((Class282) this).anInt3320 = 0;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) != -1 && (((Class282) this).anInt3320 ^ 0xffffffff) != -2)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            method2989(-39, -51, null, (byte) 89);
    }

    final boolean method2991(int i) {
        anInt7761++;
        if (((Class282) this).aClass248_Sub45_3321.method2644(0))
            return false;
        if (((Class282) this).aClass248_Sub45_3321.method2643(7108) == Class346_Sub7_Sub2_Sub3.aClass215_10385)
            return true;
        if (i != 260)
            anInt7756 = 105;
        return false;
    }

    final int method2919(boolean bool) {
        if (bool != false)
            anInt7756 = -77;
        anInt7760++;
        return 1;
    }

    static final Node_Sub8_Sub1 method2992(Class381 class381, boolean bool, int i, int i_4_) {
        anInt7762++;
        ByteStream class248_sub9 = new ByteStream(class381.method3922((byte) 114, i_4_, i));
        Node_Sub8_Sub1 class248_sub8_sub1 = new Node_Sub8_Sub1(i, class248_sub9.readString(15598), class248_sub9.readString(15598), class248_sub9.readInt(false), class248_sub9.readInt(bool), class248_sub9.readUnsignedByte((byte) 105) == 1, class248_sub9.readUnsignedByte((byte) -86), class248_sub9.readUnsignedByte((byte) -82));
        int i_5_ = class248_sub9.readUnsignedByte((byte) 79);
        for (int i_6_ = 0; i_5_ > i_6_; i_6_++)
            ((Node_Sub8_Sub1) class248_sub8_sub1).aClass293_8890.method3109(new Node_Sub47(class248_sub9.readUnsignedByte((byte) -56), class248_sub9.readShort(-1), class248_sub9.readShort(-1), class248_sub9.readShort(-1), class248_sub9.readShort(-1), class248_sub9.readShort(-1), class248_sub9.readShort(-1), class248_sub9.readShort(-1), class248_sub9.readShort(-1)), -105);
        class248_sub8_sub1.method2028((byte) 56);
        return class248_sub8_sub1;
    }

    Class282_Sub16(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }
}
