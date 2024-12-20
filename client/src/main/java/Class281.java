/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class281 {
    int anInt3262 = -1;
    int anInt3263;
    int anInt3264;
    int anInt3265;
    int anInt3266;
    int anInt3267 = -1;
    static int anInt3268;
    int anInt3269;
    int anInt3270;
    static int anInt3271;
    int anInt3272;
    static Class345 aClass345_3273;
    int anInt3274;
    int anInt3275;
    int anInt3276;
    int[] anIntArray3277;
    int anInt3278;
    int anInt3279;
    int anInt3280;
    int anInt3281;
    int anInt3282;
    static int cameraZMovement;
    int anInt3284;
    private int anInt3285;
    static int anInt3286;
    int anInt3287;
    int anInt3288;
    int[] anIntArray3289;
    int anInt3290;
    int[][] anIntArrayArray3291;
    static int anInt3292;
    int anInt3293;
    int anInt3294;
    private int anInt3295;
    int anInt3296;
    int anInt3297;
    int[] anIntArray3298;
    static int anInt3299;
    int anInt3300;
    int anInt3301;
    static int anInt3302;
    int anInt3303;
    static int anInt3304;
    int anInt3305;
    int[] anIntArray3306;
    int anInt3307;
    int[][] anIntArrayArray3308;
    int anInt3309;
    int anInt3310;
    boolean aBoolean3311;
    int anInt3312;
    int anInt3313;
    int anInt3314;
    private Viewport[] aViewportArray3315;
    int anInt3316;
    int anInt3317;

    final boolean method2909(int i, int i_0_) {
        anInt3292++;
        if (i == -1)
            return false;
        if ((((Class281) this).anInt3301 ^ 0xffffffff) == (i ^ 0xffffffff))
            return true;
        if (((Class281) this).anIntArray3289 != null) {
            for (int i_1_ = 0; ((Class281) this).anIntArray3289.length > i_1_; i_1_++) {
                if (i == ((Class281) this).anIntArray3289[i_1_])
                    return true;
            }
        }
        if (i_0_ != -29592)
            method2914(58, 12);
        return false;
    }

    final int method2910(boolean bool) {
        anInt3304++;
        if (((Class281) this).anInt3301 != -1)
            return ((Class281) this).anInt3301;
        if (((Class281) this).anIntArray3289 != null) {
            int i = (int) (Math.random() * (double) anInt3285);
            int i_2_;
            for (i_2_ = 0; i >= ((Class281) this).anIntArray3298[i_2_]; i_2_++)
                i -= ((Class281) this).anIntArray3298[i_2_];
            return ((Class281) this).anIntArray3289[i_2_];
        }
        if (bool != false)
            return -21;
        return -1;
    }

    public static void method2911(int i) {
        if (i == -13)
            aClass345_3273 = null;
    }

    final Viewport[] method2912(ha var_ha, byte i) {
        anInt3271++;
        if (aViewportArray3315 != null && ((ha) var_ha).anInt1418 == anInt3295)
            return aViewportArray3315;
        if (((Class281) this).anIntArrayArray3291 == null)
            return null;
        aViewportArray3315 = new Viewport[((Class281) this).anIntArrayArray3291.length];
        for (int i_3_ = 0; ((((Class281) this).anIntArrayArray3291.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
            int i_4_ = 0;
            int i_5_ = 0;
            int i_6_ = 0;
            int i_7_ = 0;
            int i_8_ = 0;
            int i_9_ = 0;
            if (((Class281) this).anIntArrayArray3291[i_3_] != null) {
                i_7_ = (((Class281) this).anIntArrayArray3291[i_3_][3] << -676984413);
                i_5_ = ((Class281) this).anIntArrayArray3291[i_3_][1];
                i_6_ = ((Class281) this).anIntArrayArray3291[i_3_][2];
                i_4_ = ((Class281) this).anIntArrayArray3291[i_3_][0];
                i_9_ = (((Class281) this).anIntArrayArray3291[i_3_][5] << -1431503901);
                i_8_ = (((Class281) this).anIntArrayArray3291[i_3_][4] << -429032733);
            }
            if (i_4_ != 0 || (i_5_ ^ 0xffffffff) != -1 || i_6_ != 0 || (i_7_ ^ 0xffffffff) != -1 || i_8_ != 0 || (i_9_ ^ 0xffffffff) != -1) {
                Viewport viewport = aViewportArray3315[i_3_] = var_ha.e();
                if ((i_9_ ^ 0xffffffff) != -1)
                    viewport.method1872(i_9_);
                if (i_7_ != 0)
                    viewport.method1873(i_7_);
                if ((i_8_ ^ 0xffffffff) != -1)
                    viewport.method1858(i_8_);
                viewport.method1862(i_4_, i_5_, i_6_);
            }
        }
        if (i > -31)
            method2916((byte) 100, null, 16);
        return aViewportArray3315;
    }

    final void method2913(ByteStream class248_sub9, byte i) {
        if (i >= -17)
            ((Class281) this).anInt3280 = -43;
        anInt3286++;
        for (; ; ) {
            int i_10_ = class248_sub9.readUnsignedByte((byte) -87);
            if ((i_10_ ^ 0xffffffff) == -1)
                break;
            method2916((byte) 78, class248_sub9, i_10_);
        }
    }

    static final Class207 method2914(int i, int i_11_) {
        int i_12_ = 80 / ((i - -71) / 36);
        anInt3268++;
        Class207 class207 = new Class207(i_11_, false);
        return class207;
    }

    static final void method2915(byte i) {
        Class329.changeRegionSize(((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336.method3003(true), true);
        anInt3299++;
        int i_13_ = ((Class346_Sub7_Sub1.cameraPosX >> 939382380) - -(Class67.baseX >> -891750173));
        int i_14_ = ((Class316_Sub1_Sub2.cameraPosZ >> -1793189940) + (Class368.baseY >> -1450583517));
        Class177.anInt2074 = ((Interactable) Class347.myPlayer).plane = (byte) 0;
        Class347.myPlayer.method3653(8, 8, (byte) -107);
        int i_15_ = 18;
        Class296.aByteArrayArray3456 = new byte[i_15_][];
        InputStream_Sub2.aByteArrayArray79 = new byte[i_15_][];
        Class360.aByteArrayArray4447 = new byte[i_15_][];
        Node_Sub2_Sub3.aByteArrayArray8850 = new byte[i_15_][];
        Class282_Sub7.aByteArrayArray7666 = new byte[i_15_][];
        Node_Sub39.anIntArray7280 = new int[i_15_];
        Node_Sub14_Sub36.anIntArray9544 = new int[i_15_];
        Class346_Sub7_Sub4.anIntArray9951 = new int[i_15_];
        Class14.anIntArray263 = new int[i_15_];
        Node_Sub14_Sub35.anIntArray9529 = new int[i_15_];
        Class192.anIntArray2214 = new int[i_15_];
        Node_Sub8_Sub5.mapXTEAKeys = new int[i_15_][4];
        i_15_ = 0;
        for (int i_16_ = (i_13_ + -(Node_Sub8_Sub4.anInt8360 >> 709863780)) / 8; (((Node_Sub8_Sub4.anInt8360 >> 474638564) + i_13_) / 8 >= i_16_); i_16_++) {
            for (int i_17_ = (-(Node_Sub22.anInt7074 >> -367962108) + i_14_) / 8; (((Node_Sub22.anInt7074 >> -596874428) + i_14_) / 8 >= i_17_); i_17_++) {
                int i_18_ = (i_16_ << 2097760040) - -i_17_;
                Node_Sub14_Sub36.anIntArray9544[i_15_] = i_18_;
                Node_Sub39.anIntArray7280[i_15_] = Class340_Sub6.aClass381_8158.method3927((byte) 50, "m" + i_16_ + "_" + i_17_);
                Class346_Sub7_Sub4.anIntArray9951[i_15_] = Class340_Sub6.aClass381_8158.method3927((byte) 78, "l" + i_16_ + "_" + i_17_);
                Node_Sub14_Sub35.anIntArray9529[i_15_] = Class340_Sub6.aClass381_8158.method3927((byte) 51, "n" + i_16_ + "_" + i_17_);
                Class14.anIntArray263[i_15_] = Class340_Sub6.aClass381_8158.method3927((byte) 79, "um" + i_16_ + "_" + i_17_);
                Class192.anIntArray2214[i_15_] = Class340_Sub6.aClass381_8158.method3927((byte) 102, "ul" + i_16_ + "_" + i_17_);
                if (Node_Sub14_Sub35.anIntArray9529[i_15_] == -1) {
                    Node_Sub39.anIntArray7280[i_15_] = -1;
                    Class346_Sub7_Sub4.anIntArray9951[i_15_] = -1;
                    Class14.anIntArray263[i_15_] = -1;
                    Class192.anIntArray2214[i_15_] = -1;
                }
                i_15_++;
            }
        }
        if (i != -73)
            method2911(70);
        for (int i_19_ = i_15_; ((i_19_ ^ 0xffffffff) > (Node_Sub14_Sub35.anIntArray9529.length ^ 0xffffffff)); i_19_++) {
            Node_Sub14_Sub35.anIntArray9529[i_19_] = -1;
            Node_Sub39.anIntArray7280[i_19_] = -1;
            Class346_Sub7_Sub4.anIntArray9951[i_19_] = -1;
            Class14.anIntArray263[i_19_] = -1;
            Class192.anIntArray2214[i_19_] = -1;
        }
        int i_20_;
        if ((Class273.anInt5008 ^ 0xffffffff) == -4)
            i_20_ = 4;
        else
            i_20_ = 8;
        Class207.method1707(i_13_, false, i_20_, i_14_, i + 73);
    }

    private final void method2916(byte i, ByteStream class248_sub9, int i_21_) {
        int i_22_ = 75 % ((-13 - i) / 59);
        if ((i_21_ ^ 0xffffffff) == -2) {
            ((Class281) this).anInt3301 = class248_sub9.readShort(-1);
            ((Class281) this).anInt3275 = class248_sub9.readShort(-1);
            if (((Class281) this).anInt3275 == 65535)
                ((Class281) this).anInt3275 = -1;
            if (((Class281) this).anInt3301 == 65535)
                ((Class281) this).anInt3301 = -1;
        } else if ((i_21_ ^ 0xffffffff) == -3)
            ((Class281) this).anInt3276 = class248_sub9.readShort(-1);
        else if ((i_21_ ^ 0xffffffff) != -4) {
            if ((i_21_ ^ 0xffffffff) == -5)
                ((Class281) this).anInt3264 = class248_sub9.readShort(-1);
            else if (i_21_ == 5)
                ((Class281) this).anInt3310 = class248_sub9.readShort(-1);
            else if (i_21_ != 6) {
                if ((i_21_ ^ 0xffffffff) != -8) {
                    if (i_21_ == 8)
                        ((Class281) this).anInt3278 = class248_sub9.readShort(-1);
                    else if (i_21_ == 9)
                        ((Class281) this).anInt3294 = class248_sub9.readShort(-1);
                    else if (i_21_ == 26) {
                        ((Class281) this).anInt3290 = (short) (class248_sub9.readUnsignedByte((byte) -85) * 4);
                        ((Class281) this).anInt3279 = (short) (class248_sub9.readUnsignedByte((byte) 110) * 4);
                    } else if ((i_21_ ^ 0xffffffff) == -28) {
                        if (((Class281) this).anIntArrayArray3291 == null)
                            ((Class281) this).anIntArrayArray3291 = new int[12][];
                        int i_23_ = class248_sub9.readUnsignedByte((byte) 71);
                        ((Class281) this).anIntArrayArray3291[i_23_] = new int[6];
                        for (int i_24_ = 0; i_24_ < 6; i_24_++)
                            ((Class281) this).anIntArrayArray3291[i_23_][i_24_] = class248_sub9.readUnsignedShort((byte) -10);
                    } else if ((i_21_ ^ 0xffffffff) != -29) {
                        if ((i_21_ ^ 0xffffffff) == -30)
                            ((Class281) this).anInt3307 = class248_sub9.readUnsignedByte((byte) 96);
                        else if (i_21_ != 30) {
                            if (i_21_ != 31) {
                                if ((i_21_ ^ 0xffffffff) == -33)
                                    ((Class281) this).anInt3288 = class248_sub9.readShort(-1);
                                else if ((i_21_ ^ 0xffffffff) != -34) {
                                    if (i_21_ == 34)
                                        ((Class281) this).anInt3297 = class248_sub9.readUnsignedByte((byte) -24);
                                    else if ((i_21_ ^ 0xffffffff) == -36)
                                        ((Class281) this).anInt3287 = class248_sub9.readShort(-1);
                                    else if (i_21_ != 36) {
                                        if (i_21_ != 37) {
                                            if ((i_21_ ^ 0xffffffff) == -39)
                                                ((Class281) this).anInt3272 = class248_sub9.readShort(-1);
                                            else if (i_21_ != 39) {
                                                if (i_21_ != 40) {
                                                    if (i_21_ == 41)
                                                        ((Class281) this).anInt3270 = (class248_sub9.readShort(-1));
                                                    else if ((i_21_ ^ 0xffffffff) != -43) {
                                                        if ((i_21_ ^ 0xffffffff) == -44)
                                                            ((Class281) this).anInt3269 = (class248_sub9.readShort(-1));
                                                        else if (i_21_ == 44)
                                                            ((Class281) this).anInt3312 = (class248_sub9.readShort(-1));
                                                        else if (i_21_ == 45)
                                                            ((Class281) this).anInt3309 = (class248_sub9.readShort(-1));
                                                        else if ((i_21_ ^ 0xffffffff) == -47)
                                                            ((Class281) this).anInt3267 = (class248_sub9.readShort(-1));
                                                        else if ((i_21_ ^ 0xffffffff) == -48)
                                                            ((Class281) this).anInt3281 = (class248_sub9.readShort(-1));
                                                        else if (i_21_ == 48)
                                                            ((Class281) this).anInt3296 = (class248_sub9.readShort(-1));
                                                        else if ((i_21_ ^ 0xffffffff) != -50) {
                                                            if (i_21_ != 50) {
                                                                if ((i_21_ ^ 0xffffffff) != -52) {
                                                                    if ((i_21_ ^ 0xffffffff) != -53) {
                                                                        if ((i_21_ ^ 0xffffffff) == -54)
                                                                            ((Class281) this).aBoolean3311 = false;
                                                                        else if ((i_21_ ^ 0xffffffff) != -55) {
                                                                            if (i_21_ != 55) {
                                                                                if (i_21_ == 56) {
                                                                                    if (((Class281) this).anIntArrayArray3308 == null)
                                                                                        ((Class281) this).anIntArrayArray3308 = new int[12][];
                                                                                    int i_25_ = class248_sub9.readUnsignedByte((byte) -75);
                                                                                    ((Class281) this).anIntArrayArray3308[i_25_] = new int[3];
                                                                                    for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -4; i_26_++)
                                                                                        ((Class281) this).anIntArrayArray3308[i_25_][i_26_] = class248_sub9.readUnsignedShort((byte) -10);
                                                                                }
                                                                            } else {
                                                                                if (((Class281) this).anIntArray3306 == null)
                                                                                    ((Class281) this).anIntArray3306 = new int[12];
                                                                                int i_27_ = class248_sub9.readUnsignedByte((byte) -19);
                                                                                ((Class281) this).anIntArray3306[i_27_] = class248_sub9.readShort(-1);
                                                                            }
                                                                        } else {
                                                                            ((Class281) this).anInt3314 = class248_sub9.readUnsignedByte((byte) 101) << -1744044122;
                                                                            ((Class281) this).anInt3305 = class248_sub9.readUnsignedByte((byte) -37) << 588508198;
                                                                        }
                                                                    } else {
                                                                        int i_28_ = class248_sub9.readUnsignedByte((byte) 72);
                                                                        ((Class281) this).anIntArray3298 = new int[i_28_];
                                                                        ((Class281) this).anIntArray3289 = new int[i_28_];
                                                                        for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_29_++) {
                                                                            ((Class281) this).anIntArray3289[i_29_] = class248_sub9.readShort(-1);
                                                                            int i_30_ = class248_sub9.readUnsignedByte((byte) -95);
                                                                            ((Class281) this).anIntArray3298[i_29_] = i_30_;
                                                                            anInt3285 += i_30_;
                                                                        }
                                                                    }
                                                                } else
                                                                    ((Class281) this).anInt3317 = (class248_sub9.readShort(-1));
                                                            } else
                                                                ((Class281) this).anInt3263 = (class248_sub9.readShort(-1));
                                                        } else
                                                            ((Class281) this).anInt3274 = (class248_sub9.readShort(-1));
                                                    } else
                                                        ((Class281) this).anInt3313 = (class248_sub9.readShort(-1));
                                                } else
                                                    ((Class281) this).anInt3300 = class248_sub9.readShort(-1);
                                            } else
                                                ((Class281) this).anInt3266 = class248_sub9.readShort(-1);
                                        } else
                                            ((Class281) this).anInt3282 = class248_sub9.readUnsignedByte((byte) 100);
                                    } else
                                        ((Class281) this).anInt3303 = class248_sub9.readUnsignedShort((byte) -10);
                                } else
                                    ((Class281) this).anInt3293 = class248_sub9.readUnsignedShort((byte) -10);
                            } else
                                ((Class281) this).anInt3284 = class248_sub9.readUnsignedByte((byte) -38);
                        } else
                            ((Class281) this).anInt3280 = class248_sub9.readShort(-1);
                    } else {
                        ((Class281) this).anIntArray3277 = new int[12];
                        for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -13; i_31_++) {
                            ((Class281) this).anIntArray3277[i_31_] = class248_sub9.readUnsignedByte((byte) -84);
                            if ((((Class281) this).anIntArray3277[i_31_] ^ 0xffffffff) == -256)
                                ((Class281) this).anIntArray3277[i_31_] = -1;
                        }
                    }
                } else
                    ((Class281) this).anInt3265 = class248_sub9.readShort(-1);
            } else
                ((Class281) this).anInt3262 = class248_sub9.readShort(-1);
        } else
            ((Class281) this).anInt3316 = class248_sub9.readShort(-1);
        anInt3302++;
    }

    public Class281() {
        ((Class281) this).anInt3265 = -1;
        ((Class281) this).anInt3275 = -1;
        ((Class281) this).anInt3264 = -1;
        ((Class281) this).anInt3266 = -1;
        ((Class281) this).anInt3287 = 0;
        ((Class281) this).anInt3263 = -1;
        ((Class281) this).anInt3278 = -1;
        ((Class281) this).anInt3279 = 0;
        ((Class281) this).anInt3274 = -1;
        ((Class281) this).anInt3276 = -1;
        ((Class281) this).anInt3282 = -1;
        ((Class281) this).anInt3290 = 0;
        ((Class281) this).anInt3270 = -1;
        ((Class281) this).anInt3296 = -1;
        anInt3295 = -1;
        ((Class281) this).anInt3293 = 0;
        ((Class281) this).anInt3281 = -1;
        ((Class281) this).anInt3300 = -1;
        ((Class281) this).anInt3307 = 0;
        anInt3285 = 0;
        ((Class281) this).anInt3305 = 0;
        ((Class281) this).anInt3284 = 0;
        ((Class281) this).anIntArray3289 = null;
        ((Class281) this).anInt3297 = 0;
        ((Class281) this).anIntArray3298 = null;
        ((Class281) this).anInt3269 = -1;
        ((Class281) this).aBoolean3311 = true;
        ((Class281) this).anInt3294 = -1;
        ((Class281) this).anInt3312 = -1;
        ((Class281) this).anInt3288 = 0;
        ((Class281) this).anInt3314 = 0;
        ((Class281) this).anInt3272 = -1;
        ((Class281) this).anInt3303 = 0;
        ((Class281) this).anInt3280 = 0;
        ((Class281) this).anInt3316 = -1;
        ((Class281) this).anInt3310 = -1;
        ((Class281) this).anInt3309 = -1;
        ((Class281) this).anInt3301 = -1;
        ((Class281) this).anInt3313 = -1;
        ((Class281) this).anInt3317 = -1;
    }
}
