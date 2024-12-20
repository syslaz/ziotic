/* Class248_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Field;

final class Node_Sub45 extends Node {
    static int anInt7312;
    Class282_Sub29 aClass282_Sub29_7313;
    Class282_Sub13 aClass282_Sub13_7314;
    Class282_Sub21 aClass282_Sub21_7315;
    private Class215 aClass215_7316;
    Class282_Sub9 aClass282_Sub9_7317;
    Class282_Sub18 aClass282_Sub18_7318;
    Class282_Sub19 aClass282_Sub19_7319;
    Class282_Sub22 aClass282_Sub22_7320;
    Class282_Sub27 aClass282_Sub27_7321;
    Class282_Sub15 aClass282_Sub15_7322;
    static float aFloat7323;
    Class282_Sub5 aClass282_Sub5_7324;
    Class282_Sub17 aClass282_Sub17_7325;
    static int anInt7326;
    Class282_Sub8 aClass282_Sub8_7327;
    static int anInt7328;
    Class282_Sub28 aClass282_Sub28_7329;
    Class282_Sub12 aClass282_Sub12_7330;
    static int anInt7331;
    Class282_Sub17 aClass282_Sub17_7332;
    Class282_Sub8 aClass282_Sub8_7333;
    Class282_Sub7 aClass282_Sub7_7334;
    Class282_Sub10 aClass282_Sub10_7335;
    Class282_Sub20 aClass282_Sub20_7336;
    Class282_Sub3 aClass282_Sub3_7337;
    Class282_Sub2 aClass282_Sub2_7338;
    Class282_Sub17 aClass282_Sub17_7339;
    Class282_Sub6 aClass282_Sub6_7340;
    static boolean aBoolean7341 = false;
    Class282_Sub14 aClass282_Sub14_7342;
    static int anInt7343;
    Class282_Sub17 aClass282_Sub17_7344;
    Class282_Sub25 aClass282_Sub25_7345;
    Class282_Sub1 aClass282_Sub1_7346;
    Class282_Sub11 aClass282_Sub11_7347;
    Class282_Sub24 aClass282_Sub24_7348;
    Class282_Sub16 aClass282_Sub16_7349;
    private Class108 aClass108_7350;
    static int anInt7351;
    static int anInt7352;
    Class282_Sub10 aClass282_Sub10_7353;
    Class282_Sub1 aClass282_Sub1_7354;
    static float aFloat7355;
    Class282_Sub4 aClass282_Sub4_7356;
    Class282_Sub6 aClass282_Sub6_7357;
    Class282_Sub15 aClass282_Sub15_7358;
    static int[] anIntArray7359 = new int[32];
    Class282_Sub23 aClass282_Sub23_7360;
    static int anInt7361;
    Class282_Sub17 aClass282_Sub17_7362;
    Class282_Sub26 aClass282_Sub26_7363;
    static int anInt7364;
    static int anInt7365;
    static int anInt7366;
    /*synthetic*/ static Class aClass7367;

    static final Class303 method2642(int i, int i_0_) {
        anInt7328++;
        Class303 class303 = ((Class303) Class84_Sub2.aClass278_5381.method2863(4, (long) i_0_));
        if (class303 != null)
            return class303;
        byte[] is = Node_Sub8_Sub5.aClass381_8928.method3922((byte) 115, 1, i_0_);
        class303 = new Class303();
        ((Class303) class303).anInt3526 = i_0_;
        if (is != null)
            class303.method3202(new ByteStream(is), -1);
        class303.method3203(14143);
        if (((Class303) class303).anInt3520 == 2 && (Node_Sub14_Sub16.aClass65_9333.method501((long) i_0_, (byte) 31) == null)) {
            Node_Sub14_Sub16.aClass65_9333.method509(-1, new Node_Sub37(r.anInt9034), (long) i_0_);
            Class111_Sub1.aClass303Array5537[r.anInt9034++] = class303;
        }
        if (i <= 106)
            method2642(74, -30);
        Class84_Sub2.aClass278_5381.method2867((byte) 0, (long) i_0_, class303);
        return class303;
    }

    final Class215 method2643(int i) {
        anInt7351++;
        if (i != 7108)
            method2646((byte) -128);
        return aClass215_7316;
    }

    final boolean method2644(int i) {
        anInt7312++;
        if (i != 0)
            method2643(-118);
        if (!((Node_Sub45) this).aClass282_Sub15_7358.method2979((byte) -122) || (((Node_Sub45) this).aClass282_Sub15_7358.method2984(true) != 0) || aClass108_7350.method758(true) >= 96)
            return false;
        return true;
    }

    public static void method2645(byte i) {
        if (i >= -24)
            aFloat7355 = -1.512151F;
        anIntArray7359 = null;
    }

    final ByteStream method2646(byte i) {
        anInt7352++;
        ByteStream class248_sub9 = new ByteStream(Class282_Sub15.method2981(-98));
        class248_sub9.writeByte(i + 5, 24);
        class248_sub9.writeByte(-55, ((Node_Sub45) this).aClass282_Sub6_7340.method2946(true));
        class248_sub9.writeByte(-83, ((Node_Sub45) this).aClass282_Sub27_7321.method3034(true));
        class248_sub9.writeByte(i ^ 0x33, ((Node_Sub45) this).aClass282_Sub2_7338.method2927(true));
        class248_sub9.writeByte(-89, ((Node_Sub45) this).aClass282_Sub20_7336.method3003(true));
        class248_sub9.writeByte(-80, ((Node_Sub45) this).aClass282_Sub13_7314.method2969(true));
        class248_sub9.writeByte(i ^ 0x4e, ((Node_Sub45) this).aClass282_Sub28_7329.method3040(true));
        class248_sub9.writeByte(i + 27, ((Node_Sub45) this).aClass282_Sub25_7345.method3026(true));
        class248_sub9.writeByte(-55, ((Node_Sub45) this).aClass282_Sub16_7349.method2988(true));
        class248_sub9.writeByte(-33, ((Node_Sub45) this).aClass282_Sub5_7324.method2940(true));
        class248_sub9.writeByte(-25, ((Node_Sub45) this).aClass282_Sub11_7347.method2963(true));
        class248_sub9.writeByte(-109, ((Node_Sub45) this).aClass282_Sub14_7342.method2976(true));
        class248_sub9.writeByte(i + 10, ((Node_Sub45) this).aClass282_Sub21_7315.method3010(true));
        class248_sub9.writeByte(-110, ((Node_Sub45) this).aClass282_Sub4_7356.method2936(true));
        class248_sub9.writeByte(i + 4, ((Node_Sub45) this).aClass282_Sub8_7327.method2952(true));
        class248_sub9.writeByte(i + 33, ((Node_Sub45) this).aClass282_Sub19_7319.method2998(true));
        class248_sub9.writeByte(-44, ((Node_Sub45) this).aClass282_Sub26_7363.method3031(true));
        class248_sub9.writeByte(-83, ((Node_Sub45) this).aClass282_Sub3_7337.method2932(true));
        class248_sub9.writeByte(-41, ((Node_Sub45) this).aClass282_Sub29_7313.method3047(true));
        class248_sub9.writeByte(-102, ((Node_Sub45) this).aClass282_Sub15_7322.method2984(true));
        class248_sub9.writeByte(-22, ((Node_Sub45) this).aClass282_Sub10_7353.method2961(true));
        class248_sub9.writeByte(-103, ((Node_Sub45) this).aClass282_Sub23_7360.method3018(true));
        class248_sub9.writeByte(-66, ((Node_Sub45) this).aClass282_Sub1_7346.method2925(true));
        class248_sub9.writeByte(-21, ((Node_Sub45) this).aClass282_Sub9_7317.method2955(true));
        class248_sub9.writeByte(-115, ((Node_Sub45) this).aClass282_Sub24_7348.method3020(true));
        class248_sub9.writeByte(-68, ((Node_Sub45) this).aClass282_Sub18_7318.method2997(true));
        class248_sub9.writeByte(i ^ 0x2, ((Node_Sub45) this).aClass282_Sub7_7334.method2949(true));
        class248_sub9.writeByte(-96, ((Node_Sub45) this).aClass282_Sub12_7330.method2967(true));
        class248_sub9.writeByte(i + -9, ((Node_Sub45) this).aClass282_Sub17_7332.method2993(true));
        class248_sub9.writeByte(-20, ((Node_Sub45) this).aClass282_Sub17_7325.method2993(true));
        class248_sub9.writeByte(-24, ((Node_Sub45) this).aClass282_Sub17_7339.method2993(true));
        class248_sub9.writeByte(-119, ((Node_Sub45) this).aClass282_Sub17_7344.method2993(true));
        class248_sub9.writeByte(-53, ((Node_Sub45) this).aClass282_Sub17_7362.method2993(true));
        class248_sub9.writeByte(-41, ((Node_Sub45) this).aClass282_Sub22_7320.method3014(true));
        if (i != -112)
            return null;
        return class248_sub9;
    }

    private final void method2647(int i, ByteStream class248_sub9) {
        if (class248_sub9 == null || ((ByteStream) class248_sub9).buffer == null)
            method2648(-112, true);
        else {
            int i_1_ = class248_sub9.readUnsignedByte((byte) 74);
            if ((i_1_ ^ 0xffffffff) <= -24) {
                if (i_1_ <= 24) {
                    ((Node_Sub45) this).aClass282_Sub6_7340 = new Class282_Sub6(class248_sub9.readUnsignedByte((byte) -126), this);
                    ((Node_Sub45) this).aClass282_Sub6_7357 = new Class282_Sub6(((Node_Sub45) this).aClass282_Sub6_7340.method2946(true), this);
                    ((Node_Sub45) this).aClass282_Sub27_7321 = new Class282_Sub27(class248_sub9.readUnsignedByte((byte) 122), this);
                    ((Node_Sub45) this).aClass282_Sub2_7338 = new Class282_Sub2(class248_sub9.readUnsignedByte((byte) 96), this);
                    ((Node_Sub45) this).aClass282_Sub20_7336 = new Class282_Sub20(class248_sub9.readUnsignedByte((byte) -72), this);
                    ((Node_Sub45) this).aClass282_Sub13_7314 = new Class282_Sub13(class248_sub9.readUnsignedByte((byte) -117), this);
                    ((Node_Sub45) this).aClass282_Sub28_7329 = new Class282_Sub28(class248_sub9.readUnsignedByte((byte) -98), this);
                    ((Node_Sub45) this).aClass282_Sub25_7345 = new Class282_Sub25(class248_sub9.readUnsignedByte((byte) 107), this);
                    ((Node_Sub45) this).aClass282_Sub16_7349 = new Class282_Sub16(class248_sub9.readUnsignedByte((byte) -110), this);
                    ((Node_Sub45) this).aClass282_Sub5_7324 = new Class282_Sub5(class248_sub9.readUnsignedByte((byte) -67), this);
                    ((Node_Sub45) this).aClass282_Sub11_7347 = new Class282_Sub11(class248_sub9.readUnsignedByte((byte) -53), this);
                    ((Node_Sub45) this).aClass282_Sub14_7342 = new Class282_Sub14(class248_sub9.readUnsignedByte((byte) 71), this);
                    if (i_1_ >= 24)
                        ((Node_Sub45) this).aClass282_Sub21_7315 = new Class282_Sub21(class248_sub9.readUnsignedByte((byte) 112), this);
                    ((Node_Sub45) this).aClass282_Sub4_7356 = new Class282_Sub4(class248_sub9.readUnsignedByte((byte) -54), this);
                    ((Node_Sub45) this).aClass282_Sub8_7327 = new Class282_Sub8(class248_sub9.readUnsignedByte((byte) -47), this);
                    ((Node_Sub45) this).aClass282_Sub8_7333 = new Class282_Sub8(((Node_Sub45) this).aClass282_Sub8_7327.method2952(true), this);
                    ((Node_Sub45) this).aClass282_Sub19_7319 = new Class282_Sub19(class248_sub9.readUnsignedByte((byte) 111), this);
                    ((Node_Sub45) this).aClass282_Sub26_7363 = new Class282_Sub26(class248_sub9.readUnsignedByte((byte) 113), this);
                    ((Node_Sub45) this).aClass282_Sub3_7337 = new Class282_Sub3(class248_sub9.readUnsignedByte((byte) 88), this);
                    ((Node_Sub45) this).aClass282_Sub29_7313 = new Class282_Sub29(class248_sub9.readUnsignedByte((byte) -126), this);
                    ((Node_Sub45) this).aClass282_Sub15_7322 = new Class282_Sub15(class248_sub9.readUnsignedByte((byte) 81), this);
                    ((Node_Sub45) this).aClass282_Sub15_7358 = new Class282_Sub15(((Node_Sub45) this).aClass282_Sub15_7322.method2984(true), this);
                    ((Node_Sub45) this).aClass282_Sub10_7353 = new Class282_Sub10(class248_sub9.readUnsignedByte((byte) -61), this);
                    ((Node_Sub45) this).aClass282_Sub10_7335 = new Class282_Sub10(((Node_Sub45) this).aClass282_Sub10_7353.method2961(true), this);
                    ((Node_Sub45) this).aClass282_Sub23_7360 = new Class282_Sub23(class248_sub9.readUnsignedByte((byte) 92), this);
                    ((Node_Sub45) this).aClass282_Sub1_7346 = new Class282_Sub1(class248_sub9.readUnsignedByte((byte) 110), this);
                    ((Node_Sub45) this).aClass282_Sub1_7354 = new Class282_Sub1(((Node_Sub45) this).aClass282_Sub1_7346.method2925(true), this);
                    ((Node_Sub45) this).aClass282_Sub9_7317 = new Class282_Sub9(class248_sub9.readUnsignedByte((byte) -35), this);
                    ((Node_Sub45) this).aClass282_Sub24_7348 = new Class282_Sub24(class248_sub9.readUnsignedByte((byte) -39), this);
                    ((Node_Sub45) this).aClass282_Sub18_7318 = new Class282_Sub18(class248_sub9.readUnsignedByte((byte) 125), this);
                    ((Node_Sub45) this).aClass282_Sub7_7334 = new Class282_Sub7(class248_sub9.readUnsignedByte((byte) -71), this);
                    ((Node_Sub45) this).aClass282_Sub12_7330 = new Class282_Sub12(class248_sub9.readUnsignedByte((byte) 79), this);
                    ((Node_Sub45) this).aClass282_Sub17_7332 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) 120), this);
                    ((Node_Sub45) this).aClass282_Sub17_7325 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) -76), this);
                    ((Node_Sub45) this).aClass282_Sub17_7339 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) -117), this);
                    ((Node_Sub45) this).aClass282_Sub17_7344 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) 97), this);
                    ((Node_Sub45) this).aClass282_Sub17_7362 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) -43), this);
                    ((Node_Sub45) this).aClass282_Sub22_7320 = new Class282_Sub22(class248_sub9.readUnsignedByte((byte) -128), this);
                    method2648(-116, false);
                } else
                    method2648(-53, true);
            } else {
                try {
                    method2651(class248_sub9, i_1_, 16);
                } catch (Exception exception) {
                    method2648(-109, true);
                }
                method2648(-68, false);
            }
        }
        anInt7361++;
        method2650((byte) 110);
        if (i <= 1)
            method2652(-78);
    }

    private final void method2648(int i, boolean bool) {
        if (bool || ((Node_Sub45) this).aClass282_Sub6_7340 == null)
            ((Node_Sub45) this).aClass282_Sub6_7340 = new Class282_Sub6(this);
        anInt7366++;
        if (bool || ((Node_Sub45) this).aClass282_Sub6_7357 == null)
            ((Node_Sub45) this).aClass282_Sub6_7357 = new Class282_Sub6(((Node_Sub45) this).aClass282_Sub6_7340.method2946(true), this);
        if (bool || ((Node_Sub45) this).aClass282_Sub27_7321 == null)
            ((Node_Sub45) this).aClass282_Sub27_7321 = new Class282_Sub27(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub2_7338 == null)
            ((Node_Sub45) this).aClass282_Sub2_7338 = new Class282_Sub2(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub20_7336 == null)
            ((Node_Sub45) this).aClass282_Sub20_7336 = new Class282_Sub20(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub13_7314 == null)
            ((Node_Sub45) this).aClass282_Sub13_7314 = new Class282_Sub13(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub28_7329 == null)
            ((Node_Sub45) this).aClass282_Sub28_7329 = new Class282_Sub28(this);
        if (i > -37)
            ((Node_Sub45) this).aClass282_Sub11_7347 = null;
        if (bool || ((Node_Sub45) this).aClass282_Sub25_7345 == null)
            ((Node_Sub45) this).aClass282_Sub25_7345 = new Class282_Sub25(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub16_7349 == null)
            ((Node_Sub45) this).aClass282_Sub16_7349 = new Class282_Sub16(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub5_7324 == null)
            ((Node_Sub45) this).aClass282_Sub5_7324 = new Class282_Sub5(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub11_7347 == null)
            ((Node_Sub45) this).aClass282_Sub11_7347 = new Class282_Sub11(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub14_7342 == null)
            ((Node_Sub45) this).aClass282_Sub14_7342 = new Class282_Sub14(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub21_7315 == null)
            ((Node_Sub45) this).aClass282_Sub21_7315 = new Class282_Sub21(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub4_7356 == null)
            ((Node_Sub45) this).aClass282_Sub4_7356 = new Class282_Sub4(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub8_7327 == null)
            ((Node_Sub45) this).aClass282_Sub8_7327 = new Class282_Sub8(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub8_7333 == null)
            ((Node_Sub45) this).aClass282_Sub8_7333 = new Class282_Sub8(((Node_Sub45) this).aClass282_Sub8_7327.method2952(true), this);
        if (bool || ((Node_Sub45) this).aClass282_Sub19_7319 == null)
            ((Node_Sub45) this).aClass282_Sub19_7319 = new Class282_Sub19(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub26_7363 == null)
            ((Node_Sub45) this).aClass282_Sub26_7363 = new Class282_Sub26(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub3_7337 == null)
            ((Node_Sub45) this).aClass282_Sub3_7337 = new Class282_Sub3(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub29_7313 == null)
            ((Node_Sub45) this).aClass282_Sub29_7313 = new Class282_Sub29(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub15_7322 == null)
            ((Node_Sub45) this).aClass282_Sub15_7322 = new Class282_Sub15(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub15_7358 == null)
            ((Node_Sub45) this).aClass282_Sub15_7358 = new Class282_Sub15(((Node_Sub45) this).aClass282_Sub15_7322.method2984(true), this);
        if (bool || ((Node_Sub45) this).aClass282_Sub10_7353 == null)
            ((Node_Sub45) this).aClass282_Sub10_7353 = new Class282_Sub10(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub10_7335 == null)
            ((Node_Sub45) this).aClass282_Sub10_7335 = new Class282_Sub10(((Node_Sub45) this).aClass282_Sub10_7353.method2961(true), this);
        if (bool || ((Node_Sub45) this).aClass282_Sub23_7360 == null)
            ((Node_Sub45) this).aClass282_Sub23_7360 = new Class282_Sub23(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub1_7346 == null)
            ((Node_Sub45) this).aClass282_Sub1_7346 = new Class282_Sub1(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub1_7354 == null)
            ((Node_Sub45) this).aClass282_Sub1_7354 = new Class282_Sub1(((Node_Sub45) this).aClass282_Sub1_7346.method2925(true), this);
        if (bool || ((Node_Sub45) this).aClass282_Sub9_7317 == null)
            ((Node_Sub45) this).aClass282_Sub9_7317 = new Class282_Sub9(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub24_7348 == null)
            ((Node_Sub45) this).aClass282_Sub24_7348 = new Class282_Sub24(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub18_7318 == null)
            ((Node_Sub45) this).aClass282_Sub18_7318 = new Class282_Sub18(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub7_7334 == null)
            ((Node_Sub45) this).aClass282_Sub7_7334 = new Class282_Sub7(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub12_7330 == null)
            ((Node_Sub45) this).aClass282_Sub12_7330 = new Class282_Sub12(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub17_7332 == null)
            ((Node_Sub45) this).aClass282_Sub17_7332 = new Class282_Sub17(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub17_7325 == null)
            ((Node_Sub45) this).aClass282_Sub17_7325 = new Class282_Sub17(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub17_7339 == null)
            ((Node_Sub45) this).aClass282_Sub17_7339 = new Class282_Sub17(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub17_7344 == null)
            ((Node_Sub45) this).aClass282_Sub17_7344 = new Class282_Sub17(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub17_7362 == null)
            ((Node_Sub45) this).aClass282_Sub17_7362 = new Class282_Sub17(this);
        if (bool || ((Node_Sub45) this).aClass282_Sub22_7320 == null)
            ((Node_Sub45) this).aClass282_Sub22_7320 = new Class282_Sub22(this);
    }

    final void method2649(Class282 class282, byte i, int i_2_) {
        anInt7326++;
        class282.method2921(i_2_, -4);
        if (i != -71)
            method2651(null, -2, 33);
        method2650((byte) 110);
    }

    private final void method2650(byte i) {
        anInt7365++;
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            if (i != 110)
                method2642(41, -67);
            Field[] fields_3_ = fields;
            for (int i_4_ = 0; fields_3_.length > i_4_; i_4_++) {
                Field field = fields_3_[i_4_];
                if ((aClass7367 != null ? aClass7367 : (aClass7367 = method2653("Class282"))).isAssignableFrom(field.getType())) {
                    Class282 class282 = (Class282) field.get(this);
                    class282.method2918((byte) 98);
                }
            }
        } catch (IllegalAccessException illegalaccessexception) {
            /* empty */
        }
    }

    private final void method2651(ByteStream class248_sub9, int i, int i_5_) {
        anInt7331++;
        ((Node_Sub45) this).aClass282_Sub2_7338 = new Class282_Sub2(class248_sub9.readUnsignedByte((byte) 98), this);
        ((Node_Sub45) this).aClass282_Sub10_7353 = new Class282_Sub10(class248_sub9.readUnsignedByte((byte) -69), this);
        ((Node_Sub45) this).aClass282_Sub8_7327 = new Class282_Sub8(class248_sub9.readUnsignedByte((byte) -57) - -1, this);
        ((Node_Sub45) this).aClass282_Sub16_7349 = new Class282_Sub16(class248_sub9.readUnsignedByte((byte) -109), this);
        ((Node_Sub45) this).aClass282_Sub3_7337 = new Class282_Sub3(class248_sub9.readUnsignedByte((byte) 124), this);
        ((Node_Sub45) this).aClass282_Sub5_7324 = new Class282_Sub5(class248_sub9.readUnsignedByte((byte) 124), this);
        ((Node_Sub45) this).aClass282_Sub13_7314 = new Class282_Sub13(class248_sub9.readUnsignedByte((byte) -104), this);
        class248_sub9.readUnsignedByte((byte) 117);
        ((Node_Sub45) this).aClass282_Sub26_7363 = new Class282_Sub26(class248_sub9.readUnsignedByte((byte) -29), this);
        int i_6_ = class248_sub9.readUnsignedByte((byte) 74);
        int i_7_ = 0;
        if (i >= 17)
            i_7_ = class248_sub9.readUnsignedByte((byte) 76);
        ((Node_Sub45) this).aClass282_Sub14_7342 = new Class282_Sub14(((i_6_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff) ? i_7_ : i_6_), this);
        boolean bool = true;
        boolean bool_8_ = true;
        if (i < 2) {
            bool = (class248_sub9.readUnsignedByte((byte) 91) ^ 0xffffffff) == -2;
            class248_sub9.readUnsignedByte((byte) -39);
        } else {
            bool = (class248_sub9.readUnsignedByte((byte) 115) ^ 0xffffffff) == -2;
            if ((i ^ 0xffffffff) <= -18)
                bool_8_ = class248_sub9.readUnsignedByte((byte) 70) == 1;
        }
        ((Node_Sub45) this).aClass282_Sub11_7347 = new Class282_Sub11(!(bool_8_ | bool) ? 0 : 1, this);
        ((Node_Sub45) this).aClass282_Sub23_7360 = new Class282_Sub23(class248_sub9.readUnsignedByte((byte) 117), this);
        ((Node_Sub45) this).aClass282_Sub28_7329 = new Class282_Sub28(class248_sub9.readUnsignedByte((byte) -40), this);
        ((Node_Sub45) this).aClass282_Sub6_7340 = new Class282_Sub6(class248_sub9.readUnsignedByte((byte) -59), this);
        ((Node_Sub45) this).aClass282_Sub22_7320 = new Class282_Sub22(class248_sub9.readUnsignedByte((byte) 79), this);
        ((Node_Sub45) this).aClass282_Sub17_7332 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) -124), this);
        if (i >= 20)
            ((Node_Sub45) this).aClass282_Sub17_7339 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) 92), this);
        else
            ((Node_Sub45) this).aClass282_Sub17_7339 = new Class282_Sub17(((Node_Sub45) this).aClass282_Sub17_7332.method2993(true), this);
        ((Node_Sub45) this).aClass282_Sub17_7344 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) 111), this);
        ((Node_Sub45) this).aClass282_Sub17_7325 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) -48), this);
        if ((i ^ 0xffffffff) <= -22)
            ((Node_Sub45) this).aClass282_Sub17_7362 = new Class282_Sub17(class248_sub9.readUnsignedByte((byte) -104), this);
        else
            ((Node_Sub45) this).aClass282_Sub17_7362 = new Class282_Sub17(((Node_Sub45) this).aClass282_Sub17_7344.method2993(true), this);
        if ((i ^ 0xffffffff) <= -2) {
            class248_sub9.readShort(-1);
            class248_sub9.readShort(-1);
        }
        if (i >= 3 && (i ^ 0xffffffff) > -7)
            class248_sub9.readUnsignedByte((byte) -62);
        if ((i ^ 0xffffffff) <= -5)
            ((Node_Sub45) this).aClass282_Sub4_7356 = new Class282_Sub4(class248_sub9.readUnsignedByte((byte) 122), this);
        class248_sub9.readInt(false);
        if ((i ^ 0xffffffff) <= -7)
            ((Node_Sub45) this).aClass282_Sub1_7346 = new Class282_Sub1(class248_sub9.readUnsignedByte((byte) 75), this);
        if ((i ^ 0xffffffff) <= -8)
            ((Node_Sub45) this).aClass282_Sub12_7330 = new Class282_Sub12(class248_sub9.readUnsignedByte((byte) 96), this);
        if (i >= 8)
            class248_sub9.readUnsignedByte((byte) -105);
        if (i >= 9)
            ((Node_Sub45) this).aClass282_Sub20_7336 = new Class282_Sub20(class248_sub9.readUnsignedByte((byte) 98), this);
        if (i >= 10)
            ((Node_Sub45) this).aClass282_Sub27_7321 = new Class282_Sub27(class248_sub9.readUnsignedByte((byte) -37), this);
        if (i >= 11)
            ((Node_Sub45) this).aClass282_Sub9_7317 = new Class282_Sub9(class248_sub9.readUnsignedByte((byte) -47), this);
        if ((i ^ 0xffffffff) <= -13)
            ((Node_Sub45) this).aClass282_Sub5_7324 = new Class282_Sub5(class248_sub9.readUnsignedByte((byte) -120), this);
        if (i >= 13)
            ((Node_Sub45) this).aClass282_Sub25_7345 = new Class282_Sub25(class248_sub9.readUnsignedByte((byte) -92), this);
        if (i >= 14)
            ((Node_Sub45) this).aClass282_Sub15_7322 = new Class282_Sub15(class248_sub9.readUnsignedByte((byte) 117), this);
        if ((i ^ 0xffffffff) <= -16)
            ((Node_Sub45) this).aClass282_Sub18_7318 = new Class282_Sub18(class248_sub9.readUnsignedByte((byte) -18), this);
        if (i >= i_5_)
            ((Node_Sub45) this).aClass282_Sub29_7313 = new Class282_Sub29(class248_sub9.readUnsignedByte((byte) 126), this);
        if ((i ^ 0xffffffff) <= -19)
            ((Node_Sub45) this).aClass282_Sub24_7348 = new Class282_Sub24(class248_sub9.readUnsignedByte((byte) -69), this);
        if (i >= 19)
            ((Node_Sub45) this).aClass282_Sub19_7319 = new Class282_Sub19(class248_sub9.readUnsignedByte((byte) -42), this);
        if ((i ^ 0xffffffff) <= -23)
            ((Node_Sub45) this).aClass282_Sub7_7334 = new Class282_Sub7(class248_sub9.readUnsignedByte((byte) -56), this);
    }

    final Class108 method2652(int i) {
        if (i != -18640)
            return null;
        anInt7364++;
        return aClass108_7350;
    }

    Node_Sub45(Class215 class215, int i) {
        aClass215_7316 = class215;
        aClass108_7350 = new Class108((((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039), Class75.anInt977, Class121.anInt1513, (Class174.aString2028.toLowerCase().indexOf("arm") ^ 0xffffffff) != 0);
        ((Node_Sub45) this).aClass282_Sub15_7358 = new Class282_Sub15(i, this);
        method2648(-44, true);
    }

    Node_Sub45(ByteStream class248_sub9, Class215 class215, int i) {
        aClass215_7316 = class215;
        aClass108_7350 = new Class108((((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2039), Class75.anInt977, Class121.anInt1513, Class174.aString2028.indexOf("arm") != -1);
        ((Node_Sub45) this).aClass282_Sub15_7358 = new Class282_Sub15(i, this);
        method2647(26, class248_sub9);
    }

    /*synthetic*/
    static Class method2653(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
