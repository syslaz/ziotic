/* Class162_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.OpenGL;

final class Class162_Sub2 extends Class162 {
    private short[] aShortArray6437;
    static int anInt6438;
    private int anInt6439;
    private Class353[] aClass353Array6440;
    static int anInt6441;
    private short[] aShortArray6442;
    static int anInt6443;
    private Class15[] aClass15Array6444;
    private short[] aShortArray6445;
    static int anInt6446;
    static int anInt6447;
    static int anInt6448;
    private int anInt6449;
    private Class140 aClass140_6450;
    private int[] anIntArray6451;
    static int anInt6452;
    static int anInt6453;
    private int anInt6454 = 0;
    private int anInt6455;
    static int anInt6456;
    static int anInt6457;
    private int[] anIntArray6458;
    static int anInt6459;
    static int anInt6460;
    private short aShort6461;
    private short[] aShortArray6462;
    private Class352 aClass352_6463;
    static int anInt6464;
    static int anInt6465;
    private int[] anIntArray6466;
    private short aShort6467;
    private int[] anIntArray6468;
    private float[] aFloatArray6469;
    static int anInt6470;
    static int anInt6471;
    private int anInt6472;
    private byte[] aByteArray6473;
    static int anInt6474;
    private int anInt6475;
    private ha_Sub2 aHa_Sub2_6476;
    private boolean aBoolean6477;
    static int anInt6478;
    private Class40[] aClass40Array6479;
    static int anInt6480;
    private int[][] anIntArrayArray6481;
    private int[][] anIntArrayArray6482;
    static boolean aBoolean6483 = false;
    private boolean aBoolean6484;
    static int anInt6485;
    static int anInt6486;
    static int anInt6487;
    private short aShort6488;
    private Interface6 anInterface6_6489;
    private byte[] aByteArray6490;
    private Class140 aClass140_6491;
    private boolean aBoolean6492;
    static int anInt6493;
    static int anInt6494;
    static int anInt6495;
    private short aShort6496;
    private int anInt6497 = 0;
    static int anInt6498;
    static int anInt6499;
    private byte aByte6500;
    private float[] aFloatArray6501;
    private int[][] anIntArrayArray6502;
    static int anInt6503;
    private Class140 aClass140_6504;
    static int anInt6505;
    static int anInt6506;
    static Class215 aClass215_6507 = new Class215("game3", 2);
    private short aShort6508;
    static int anInt6509;
    private short[] aShortArray6510;
    static int anInt6511;
    static int anInt6512;
    static int anInt6513;
    static int anInt6514;
    private int anInt6515;
    private short[] aShortArray6516;
    private short aShort6517;
    private Class242 aClass242_6518;
    static int anInt6519;
    static int anInt6520;
    private short aShort6521;
    private short aShort6522;
    static int anInt6523;
    private short[] aShortArray6524;
    private short aShort6525;
    static int anInt6526;
    private Class124[] aClass124Array6527;
    static int anInt6528;
    static int anInt6529;
    static int anInt6530;
    private int[] anIntArray6531;
    private short[] aShortArray6532;
    static int anInt6533;
    static int anInt6534;
    private short[] aShortArray6535;
    static String aString6536;
    static int anInt6537;
    static int anInt6538;
    private boolean aBoolean6539;
    static int anInt6540;
    static int anInt6541;
    static int anInt6542;
    private short aShort6543;
    private Class140 aClass140_6544;
    static int anInt6545;
    private Interface1 anInterface1_6546;
    static int anInt6547;
    static int anInt6548;
    static int anInt6549;
    static int anInt6550;
    static int anInt6551;
    static int anInt6552;
    static int anInt6553;
    private short[] aShortArray6554;
    static int anInt6555;
    private short[] aShortArray6556;
    static int anInt6557;
    static int anInt6558;

    private final void method1467(int i) {
        if (aClass353Array6440 != null) {
            Class238_Sub3 class238_sub3 = ((ha_Sub2) aHa_Sub2_6476).aClass238_Sub3_5797;
            aHa_Sub2_6476.method918(0);
            aHa_Sub2_6476.C(!aBoolean6492);
            aHa_Sub2_6476.method878(false, i ^ ~0x782c);
            aHa_Sub2_6476.method843(32886, ((ha_Sub2) aHa_Sub2_6476).aClass140_5918, ((ha_Sub2) aHa_Sub2_6476).aClass140_5898, null, null);
            for (int i_0_ = 0; (anInt6475 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
                Class353 class353 = aClass353Array6440[i_0_];
                Class15 class15 = aClass15Array6444[i_0_];
                if (!((Class353) class353).aBoolean4199 || !aHa_Sub2_6476.q()) {
                    float f = ((float) ((anIntArray6531[((Class353) class353).anInt4195]) + ((anIntArray6531[((Class353) class353).anInt4202]) + (anIntArray6531[((Class353) class353).anInt4194]))) * 0.3333333F);
                    float f_1_ = ((float) ((anIntArray6451[((Class353) class353).anInt4202]) + (anIntArray6451[((Class353) class353).anInt4194]) + (anIntArray6451[((Class353) class353).anInt4195])) * 0.3333333F);
                    float f_2_ = ((float) ((anIntArray6468[((Class353) class353).anInt4195]) + (anIntArray6468[((Class353) class353).anInt4194]) + (anIntArray6468[((Class353) class353).anInt4202])) * 0.3333333F);
                    float f_3_ = (Node_Sub45.aFloat7355 + (f_1_ * Node_Sub8_Sub4.aFloat8378 + Class282_Sub10.aFloat7694 * f + f_2_ * Class226_Sub1.aFloat6660));
                    float f_4_ = (Class379.aFloat4639 * f_2_ + (Class170.aFloat1980 * f + f_1_ * Class327.aFloat3838) + Class15.aFloat278);
                    float f_5_ = (f_2_ * Class346_Sub10.aFloat8348 + (f_1_ * Class84_Sub7.aFloat5470 + Node_Sub45.aFloat7323 * f) + Class137.aFloat1641);
                    float f_6_ = ((float) (1.0 / Math.sqrt((double) (f_5_ * f_5_ + (f_4_ * f_4_ + f_3_ * f_3_)))) * (float) ((Class353) class353).anInt4201);
                    class238_sub3.method1910(false, ((float) ((Class15) class15).anInt272 - f_4_ + f_4_ * f_6_), ((float) ((Class15) class15).anInt271 + f_3_ - f_3_ * f_6_), -f_5_ + f_6_ * f_5_, (((Class15) class15).anInt273 * ((Class353) class353).aShort4191) >> -350727705, ((Class15) class15).anInt279, (((Class15) class15).anInt274 * ((Class353) class353).aShort4203) >> -1007811673);
                    aHa_Sub2_6476.method848(class238_sub3, (byte) 70);
                    int i_7_ = ((Class15) class15).anInt280;
                    OpenGL.glColor4ub((byte) (i_7_ >> 162357840), (byte) (i_7_ >> 1499677192), (byte) i_7_, (byte) (i_7_ >> -920050184));
                    aHa_Sub2_6476.method882(((Class353) class353).aShort4198, (byte) 105);
                    aHa_Sub2_6476.method885(i + -30803, ((Class353) class353).aByte4193);
                    aHa_Sub2_6476.method876(7, 24873, 4, 0);
                }
            }
            aHa_Sub2_6476.C(true);
            aHa_Sub2_6476.method840(true);
        }
        anInt6448++;
        if (i != 30803)
            anInt6449 = 49;
    }

    final void LA(int i) {
        aShort6488 = (short) i;
        if (aClass140_6450 != null)
            ((Class140) aClass140_6450).anInterface6_1662 = null;
        anInt6493++;
        if (aClass140_6491 != null)
            ((Class140) aClass140_6491).anInterface6_1662 = null;
    }

    final void method1427() {
        anInt6548++;
    }

    final void ia(short i, short i_8_) {
        anInt6452++;
        for (int i_9_ = 0; (anInt6454 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
            if (i == aShortArray6535[i_9_])
                aShortArray6535[i_9_] = i_8_;
        }
        if (aClass353Array6440 != null) {
            for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (anInt6475 ^ 0xffffffff); i_10_++) {
                Class353 class353 = aClass353Array6440[i_10_];
                Class15 class15 = aClass15Array6444[i_10_];
                ((Class15) class15).anInt280 = ((0xffffff & (Node_Sub14_Sub39.anIntArray9600[0xffff & (aShortArray6535[((Class353) class353).anInt4197])])) | ~0xffffff & ((Class15) class15).anInt280);
            }
        }
        if (aClass140_6450 != null)
            ((Class140) aClass140_6450).anInterface6_1662 = null;
    }

    final boolean r() {
        anInt6533++;
        return aBoolean6484;
    }

    final void VA(int i) {
        anInt6538++;
        int i_11_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_12_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (anInt6497 ^ 0xffffffff); i_13_++) {
            int i_14_ = (anIntArray6451[i_13_] * i_11_ - -(anIntArray6531[i_13_] * i_12_) >> -518883090);
            anIntArray6451[i_13_] = (-(anIntArray6531[i_13_] * i_11_) + i_12_ * anIntArray6451[i_13_]) >> 1512655982;
            anIntArray6531[i_13_] = i_14_;
        }
        aBoolean6539 = false;
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
    }

    final int na() {
        if (!aBoolean6539)
            method1475(29866);
        anInt6459++;
        return aShort6508;
    }

    private final void method1468(byte i) {
        anInt6540++;
        if (aBoolean6477) {
            aBoolean6477 = false;
            if (aClass40Array6479 == null && aClass124Array6527 == null && aClass353Array6440 == null) {
                if (anIntArray6531 != null && !Class340.method3445(anInt6515, anInt6472, i + 86)) {
                    if (aClass140_6504 != null && (((Class140) aClass140_6504).anInterface6_1662 == null))
                        aBoolean6477 = true;
                    else {
                        if (!aBoolean6539)
                            method1475(29866);
                        anIntArray6531 = null;
                    }
                }
                if (anIntArray6451 != null && !Class64.method493((byte) 109, anInt6472, anInt6515)) {
                    if (aClass140_6504 == null || (((Class140) aClass140_6504).anInterface6_1662 != null)) {
                        if (!aBoolean6539)
                            method1475(i ^ ~0x74e7);
                        anIntArray6451 = null;
                    } else
                        aBoolean6477 = true;
                }
                if (anIntArray6468 != null && !Class316_Sub1.method3292(i + -7035, anInt6472, anInt6515)) {
                    if (aClass140_6504 == null || (((Class140) aClass140_6504).anInterface6_1662 != null)) {
                        if (!aBoolean6539)
                            method1475(29866);
                        anIntArray6468 = null;
                    } else
                        aBoolean6477 = true;
                }
            }
            if (aShortArray6516 != null && anIntArray6531 == null && anIntArray6451 == null && anIntArray6468 == null) {
                anIntArray6458 = null;
                aShortArray6516 = null;
            }
            if (aByteArray6490 != null && !Class107.method751(anInt6515, anInt6472, 65536)) {
                if (aClass140_6491 != null) {
                    if (((Class140) aClass140_6491).anInterface6_1662 == null)
                        aBoolean6477 = true;
                    else {
                        aShortArray6554 = aShortArray6556 = aShortArray6510 = null;
                        aByteArray6490 = null;
                    }
                } else if (aClass140_6450 != null && (((Class140) aClass140_6450).anInterface6_1662 == null))
                    aBoolean6477 = true;
                else {
                    aShortArray6554 = aShortArray6556 = aShortArray6510 = null;
                    aByteArray6490 = null;
                }
            }
            if (aShortArray6535 != null && !Class57.method455(anInt6515, -19107, anInt6472)) {
                if (aClass140_6450 != null && ((Class140) aClass140_6450).anInterface6_1662 == null)
                    aBoolean6477 = true;
                else
                    aShortArray6535 = null;
            }
            if (i != -78)
                method1422();
            if (aByteArray6473 != null && !Class130.method1197(anInt6515, false, anInt6472)) {
                if (aClass140_6450 != null && ((Class140) aClass140_6450).anInterface6_1662 == null)
                    aBoolean6477 = true;
                else
                    aByteArray6473 = null;
            }
            if (aFloatArray6501 != null && !Class282_Sub13.method2971(anInt6472, anInt6515, (byte) -113)) {
                if (aClass140_6544 == null || ((Class140) aClass140_6544).anInterface6_1662 != null)
                    aFloatArray6501 = aFloatArray6469 = null;
                else
                    aBoolean6477 = true;
            }
            if (aShortArray6437 != null && !Class84_Sub7.method624(anInt6472, -27679, anInt6515)) {
                if (aClass140_6450 == null || ((Class140) aClass140_6450).anInterface6_1662 != null)
                    aShortArray6437 = null;
                else
                    aBoolean6477 = true;
            }
            if (aShortArray6462 != null && !Class28.method257(anInt6515, anInt6472, 117)) {
                if ((aClass352_6463 != null && ((Class352) aClass352_6463).anInterface1_4185 == null) || aClass140_6450 != null && (((Class140) aClass140_6450).anInterface6_1662) == null)
                    aBoolean6477 = true;
                else
                    aShortArray6462 = aShortArray6524 = aShortArray6445 = null;
            }
            if (anIntArrayArray6502 != null && !Class316_Sub1_Sub1.method3297(anInt6515, -58, anInt6472)) {
                aShortArray6532 = null;
                anIntArrayArray6502 = null;
            }
            if (anIntArrayArray6481 != null && !Class241.method1927(96, anInt6515, anInt6472)) {
                aShortArray6442 = null;
                anIntArrayArray6481 = null;
            }
            if (anIntArrayArray6482 != null && !Class141.method1286(anInt6472, anInt6515, (byte) -124))
                anIntArrayArray6482 = null;
            if (anIntArray6466 != null && (anInt6515 & 0x800) == 0 && (anInt6515 & 0x40000 ^ 0xffffffff) == -1)
                anIntArray6466 = null;
        }
    }

    public static void method1469(boolean bool) {
        aClass215_6507 = null;
        if (bool != false)
            method1469(true);
        aString6536 = null;
    }

    final void aa(short i, short i_15_) {
        anInt6513++;
        d var_d = ((ha) aHa_Sub2_6476).aD1414;
        for (int i_16_ = 0; i_16_ < anInt6454; i_16_++) {
            if (aShortArray6437[i_16_] == i)
                aShortArray6437[i_16_] = i_15_;
        }
        byte i_17_ = 0;
        byte i_18_ = 0;
        if ((i ^ 0xffffffff) != 0) {
            Class312 class312 = var_d.method25(0xffff & i, (byte) 124);
            i_17_ = ((Class312) class312).aByte3630;
            i_18_ = ((Class312) class312).aByte3625;
        }
        byte i_19_ = 0;
        byte i_20_ = 0;
        if ((i_15_ ^ 0xffffffff) != 0) {
            Class312 class312 = var_d.method25(i_15_ & 0xffff, (byte) 126);
            i_19_ = ((Class312) class312).aByte3630;
            if (((Class312) class312).aByte3643 != 0 || ((Class312) class312).aByte3642 != 0)
                aBoolean6484 = true;
            i_20_ = ((Class312) class312).aByte3625;
        }
        if ((i_19_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff) | i_18_ != i_20_) {
            if (aClass353Array6440 != null) {
                for (int i_21_ = 0; anInt6475 > i_21_; i_21_++) {
                    Class353 class353 = aClass353Array6440[i_21_];
                    Class15 class15 = aClass15Array6444[i_21_];
                    ((Class15) class15).anInt280 = ((0xffffff & (Node_Sub14_Sub39.anIntArray9600[0xffff & (aShortArray6535[((Class353) class353).anInt4197])])) | ((Class15) class15).anInt280 & ~0xffffff);
                }
            }
            if (aClass140_6450 != null)
                ((Class140) aClass140_6450).anInterface6_1662 = null;
        }
    }

    final void method1441(Viewport viewport, Class346_Sub9 class346_sub9, int i, int i_22_) {
        anInt6441++;
        if (anInt6455 != 0) {
            Class238_Sub3 class238_sub3 = ((ha_Sub2) aHa_Sub2_6476).aClass238_Sub3_5832;
            if (!aBoolean6539)
                method1475(29866);
            Class238_Sub3 class238_sub3_23_ = (Class238_Sub3) viewport;
            Class84_Sub7.aFloat5470 = ((((Class238_Sub3) class238_sub3).aFloat6791 * ((Class238_Sub3) class238_sub3_23_).aFloat6772) + (((Class238_Sub3) class238_sub3).aFloat6775 * ((Class238_Sub3) class238_sub3_23_).aFloat6784) + (((Class238_Sub3) class238_sub3_23_).aFloat6791 * ((Class238_Sub3) class238_sub3).aFloat6793));
            Class137.aFloat1641 = (((Class238_Sub3) class238_sub3).aFloat6797 + ((((Class238_Sub3) class238_sub3_23_).aFloat6797 * ((Class238_Sub3) class238_sub3).aFloat6793) + ((((Class238_Sub3) class238_sub3_23_).aFloat6770 * ((Class238_Sub3) class238_sub3).aFloat6791) + (((Class238_Sub3) class238_sub3).aFloat6775 * (((Class238_Sub3) class238_sub3_23_).aFloat6780)))));
            float f = ((float) aShort6521 * Class84_Sub7.aFloat5470 + Class137.aFloat1641);
            float f_24_ = (Class137.aFloat1641 + Class84_Sub7.aFloat5470 * (float) aShort6543);
            float f_25_;
            float f_26_;
            if (!(f > f_24_)) {
                f_26_ = (float) aShort6508 + f_24_;
                f_25_ = (float) -aShort6508 + f;
            } else {
                f_25_ = f_24_ - (float) aShort6508;
                f_26_ = (float) aShort6508 + f;
            }
            if (!(f_25_ >= ((ha_Sub2) aHa_Sub2_6476).aFloat5944) && !((float) ((ha_Sub2) aHa_Sub2_6476).anInt5897 >= f_26_)) {
                Node_Sub45.aFloat7355 = ((((Class238_Sub3) class238_sub3).aFloat6784 * ((Class238_Sub3) class238_sub3_23_).aFloat6770) + (((Class238_Sub3) class238_sub3).aFloat6794 * ((Class238_Sub3) class238_sub3_23_).aFloat6780) + (((Class238_Sub3) class238_sub3).aFloat6785 * ((Class238_Sub3) class238_sub3_23_).aFloat6797) + ((Class238_Sub3) class238_sub3).aFloat6780);
                Node_Sub8_Sub4.aFloat8378 = ((((Class238_Sub3) class238_sub3).aFloat6784 * ((Class238_Sub3) class238_sub3_23_).aFloat6772) + (((Class238_Sub3) class238_sub3).aFloat6794 * ((Class238_Sub3) class238_sub3_23_).aFloat6784) + (((Class238_Sub3) class238_sub3).aFloat6785 * ((Class238_Sub3) class238_sub3_23_).aFloat6791));
                float f_27_ = ((float) aShort6521 * Node_Sub8_Sub4.aFloat8378 + Node_Sub45.aFloat7355);
                float f_28_ = (Node_Sub45.aFloat7355 + Node_Sub8_Sub4.aFloat8378 * (float) aShort6543);
                float f_29_;
                float f_30_;
                if (f_27_ > f_28_) {
                    f_30_ = (((float) aShort6508 + f_27_) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5864);
                    f_29_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5864 * (f_28_ - (float) aShort6508));
                } else {
                    f_29_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5864 * (f_27_ - (float) aShort6508));
                    f_30_ = ((f_28_ + (float) aShort6508) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5864);
                }
                if (!(((ha_Sub2) aHa_Sub2_6476).aFloat5844 <= f_29_ / (float) i) && !(f_30_ / (float) i <= ((ha_Sub2) aHa_Sub2_6476).aFloat5916)) {
                    Class15.aFloat278 = (((Class238_Sub3) class238_sub3).aFloat6770 + ((((Class238_Sub3) class238_sub3).aFloat6772 * (((Class238_Sub3) class238_sub3_23_).aFloat6770)) + (((Class238_Sub3) class238_sub3).aFloat6761 * (((Class238_Sub3) class238_sub3_23_).aFloat6780)) + (((Class238_Sub3) class238_sub3).aFloat6786 * (((Class238_Sub3) class238_sub3_23_).aFloat6797))));
                    Class327.aFloat3838 = ((((Class238_Sub3) class238_sub3_23_).aFloat6772 * ((Class238_Sub3) class238_sub3).aFloat6772) + (((Class238_Sub3) class238_sub3_23_).aFloat6784 * ((Class238_Sub3) class238_sub3).aFloat6761) + (((Class238_Sub3) class238_sub3).aFloat6786 * (((Class238_Sub3) class238_sub3_23_).aFloat6791)));
                    float f_31_ = ((float) aShort6521 * Class327.aFloat3838 + Class15.aFloat278);
                    float f_32_ = ((float) aShort6543 * Class327.aFloat3838 + Class15.aFloat278);
                    float f_33_;
                    float f_34_;
                    if (!(f_32_ < f_31_)) {
                        f_34_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5863 * (f_32_ + (float) aShort6508));
                        f_33_ = (((float) -aShort6508 + f_31_) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5863);
                    } else {
                        f_33_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5863 * ((float) -aShort6508 + f_32_));
                        f_34_ = ((f_31_ + (float) aShort6508) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5863);
                    }
                    if (!(f_33_ / (float) i >= ((ha_Sub2) aHa_Sub2_6476).aFloat5900) && !(((ha_Sub2) aHa_Sub2_6476).aFloat5940 >= f_34_ / (float) i)) {
                        if (class346_sub9 != null || aClass353Array6440 != null) {
                            Class379.aFloat4639 = (((((Class238_Sub3) class238_sub3_23_).aFloat6786) * (((Class238_Sub3) class238_sub3).aFloat6772)) + ((((Class238_Sub3) class238_sub3).aFloat6761) * (((Class238_Sub3) class238_sub3_23_).aFloat6785)) + ((((Class238_Sub3) class238_sub3).aFloat6786) * (((Class238_Sub3) class238_sub3_23_).aFloat6793)));
                            Class282_Sub10.aFloat7694 = (((((Class238_Sub3) class238_sub3_23_).aFloat6794) * (((Class238_Sub3) class238_sub3).aFloat6794)) + ((((Class238_Sub3) class238_sub3).aFloat6784) * (((Class238_Sub3) class238_sub3_23_).aFloat6761)) + ((((Class238_Sub3) class238_sub3).aFloat6785) * (((Class238_Sub3) class238_sub3_23_).aFloat6775)));
                            Class226_Sub1.aFloat6660 = (((((Class238_Sub3) class238_sub3_23_).aFloat6785) * (((Class238_Sub3) class238_sub3).aFloat6794)) + ((((Class238_Sub3) class238_sub3).aFloat6784) * (((Class238_Sub3) class238_sub3_23_).aFloat6786)) + ((((Class238_Sub3) class238_sub3_23_).aFloat6793) * (((Class238_Sub3) class238_sub3).aFloat6785)));
                            Class346_Sub10.aFloat8348 = ((((Class238_Sub3) class238_sub3).aFloat6793 * (((Class238_Sub3) class238_sub3_23_).aFloat6793)) + (((((Class238_Sub3) class238_sub3).aFloat6791) * (((Class238_Sub3) class238_sub3_23_).aFloat6786)) + ((((Class238_Sub3) class238_sub3).aFloat6775) * (((Class238_Sub3) class238_sub3_23_).aFloat6785))));
                            Node_Sub45.aFloat7323 = (((((Class238_Sub3) class238_sub3_23_).aFloat6775) * (((Class238_Sub3) class238_sub3).aFloat6793)) + (((((Class238_Sub3) class238_sub3).aFloat6791) * (((Class238_Sub3) class238_sub3_23_).aFloat6761)) + ((((Class238_Sub3) class238_sub3).aFloat6775) * (((Class238_Sub3) class238_sub3_23_).aFloat6794))));
                            Class170.aFloat1980 = ((((Class238_Sub3) class238_sub3).aFloat6786 * (((Class238_Sub3) class238_sub3_23_).aFloat6775)) + (((((Class238_Sub3) class238_sub3).aFloat6761) * (((Class238_Sub3) class238_sub3_23_).aFloat6794)) + ((((Class238_Sub3) class238_sub3).aFloat6772) * (((Class238_Sub3) class238_sub3_23_).aFloat6761))));
                        }
                        if (class346_sub9 != null) {
                            int i_35_ = aShort6517 - -aShort6461 >> -1985995231;
                            int i_36_ = aShort6525 + aShort6522 >> -1504200191;
                            int i_37_ = (int) ((Class226_Sub1.aFloat6660 * (float) i_36_) + (((float) i_35_ * Class282_Sub10.aFloat7694) + Node_Sub45.aFloat7355 + ((float) aShort6521 * (Node_Sub8_Sub4.aFloat8378))));
                            int i_38_ = (int) (Class15.aFloat278 + (float) i_35_ * Class170.aFloat1980 + (Class327.aFloat3838 * (float) aShort6521) + ((float) i_36_ * Class379.aFloat4639));
                            int i_39_ = (int) (((float) i_36_ * Class346_Sub10.aFloat8348) + (Class137.aFloat1641 + ((float) i_35_ * Node_Sub45.aFloat7323) + ((float) aShort6521 * Class84_Sub7.aFloat5470)));
                            int i_40_ = (int) (((float) i_36_ * Class226_Sub1.aFloat6660) + (Node_Sub45.aFloat7355 + (Class282_Sub10.aFloat7694 * (float) i_35_) + (Node_Sub8_Sub4.aFloat8378 * (float) aShort6543)));
                            int i_41_ = (int) (Class379.aFloat4639 * (float) i_36_ + (Class170.aFloat1980 * (float) i_35_ + Class15.aFloat278 + (Class327.aFloat3838 * (float) aShort6543)));
                            ((Class346_Sub9) class346_sub9).anInt8345 = (((ha_Sub2) aHa_Sub2_6476).anInt5890 - -(i_40_ * ((ha_Sub2) aHa_Sub2_6476).anInt5864 / i));
                            ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub2) aHa_Sub2_6476).anInt5933 + (i_38_ * ((ha_Sub2) aHa_Sub2_6476).anInt5863 / i));
                            ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub2) aHa_Sub2_6476).anInt5890 - -(((ha_Sub2) aHa_Sub2_6476).anInt5864 * i_37_ / i));
                            ((Class346_Sub9) class346_sub9).anInt8343 = (((ha_Sub2) aHa_Sub2_6476).anInt5863 * i_41_ / i) + ((ha_Sub2) aHa_Sub2_6476).anInt5933;
                            int i_42_ = (int) ((Class84_Sub7.aFloat5470 * (float) aShort6543) + ((Node_Sub45.aFloat7323 * (float) i_35_) + Class137.aFloat1641) + ((float) i_36_ * Class346_Sub10.aFloat8348));
                            if (((ha_Sub2) aHa_Sub2_6476).anInt5897 <= i_39_ || (((ha_Sub2) aHa_Sub2_6476).anInt5897 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)) {
                                ((Class346_Sub9) class346_sub9).aBoolean8342 = true;
                                ((Class346_Sub9) class346_sub9).anInt8344 = (((ha_Sub2) aHa_Sub2_6476).anInt5890 + (((ha_Sub2) aHa_Sub2_6476).anInt5864 * (aShort6508 + i_37_) / i) + -(((Class346_Sub9) class346_sub9).anInt8347));
                            }
                        }
                        aHa_Sub2_6476.method867((float) i, false);
                        aHa_Sub2_6476.method854(-105);
                        aHa_Sub2_6476.method845(class238_sub3_23_, 28727);
                        method1474(3227);
                        aHa_Sub2_6476.method840(true);
                        method1467(30803);
                    }
                }
            }
        }
    }

    final int WA() {
        anInt6480++;
        return aShort6496;
    }

    final void P(int i, int i_43_, int i_44_, int i_45_) {
        anInt6541++;
        if ((i ^ 0xffffffff) == -1) {
            Class301_Sub2.anInt8435 = 0;
            Node_Sub14_Sub25.anInt9422 = 0;
            Node_Sub14_Sub29.anInt9468 = 0;
            int i_46_ = 0;
            for (int i_47_ = 0; (anInt6497 ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
                Node_Sub14_Sub29.anInt9468 += anIntArray6531[i_47_];
                Node_Sub14_Sub25.anInt9422 += anIntArray6451[i_47_];
                Class301_Sub2.anInt8435 += anIntArray6468[i_47_];
                i_46_++;
            }
            if (i_46_ <= 0) {
                Node_Sub14_Sub25.anInt9422 = i_44_;
                Node_Sub14_Sub29.anInt9468 = i_43_;
                Class301_Sub2.anInt8435 = i_45_;
            } else {
                Node_Sub14_Sub29.anInt9468 = i_43_ + Node_Sub14_Sub29.anInt9468 / i_46_;
                Node_Sub14_Sub25.anInt9422 = i_44_ + Node_Sub14_Sub25.anInt9422 / i_46_;
                Class301_Sub2.anInt8435 = i_45_ + Class301_Sub2.anInt8435 / i_46_;
            }
        } else if ((i ^ 0xffffffff) == -2) {
            for (int i_48_ = 0; anInt6497 > i_48_; i_48_++) {
                anIntArray6531[i_48_] += i_43_;
                anIntArray6451[i_48_] += i_44_;
                anIntArray6468[i_48_] += i_45_;
            }
        } else if (i == 2) {
            for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > (anInt6497 ^ 0xffffffff); i_49_++) {
                anIntArray6531[i_49_] -= Node_Sub14_Sub29.anInt9468;
                anIntArray6451[i_49_] -= Node_Sub14_Sub25.anInt9422;
                anIntArray6468[i_49_] -= Class301_Sub2.anInt8435;
                if ((i_45_ ^ 0xffffffff) != -1) {
                    int i_50_ = Node_Sub9_Sub1.anIntArray9106[i_45_];
                    int i_51_ = Node_Sub9_Sub1.anIntArray9109[i_45_];
                    int i_52_ = ((anIntArray6531[i_49_] * i_51_ + (anIntArray6451[i_49_] * i_50_ + 16383)) >> -775779090);
                    anIntArray6451[i_49_] = (16383 + (-(anIntArray6531[i_49_] * i_50_) + anIntArray6451[i_49_] * i_51_) >> -1823278226);
                    anIntArray6531[i_49_] = i_52_;
                }
                if ((i_43_ ^ 0xffffffff) != -1) {
                    int i_53_ = Node_Sub9_Sub1.anIntArray9106[i_43_];
                    int i_54_ = Node_Sub9_Sub1.anIntArray9109[i_43_];
                    int i_55_ = ((anIntArray6451[i_49_] * i_54_ - i_53_ * anIntArray6468[i_49_] - -16383) >> -528299474);
                    anIntArray6468[i_49_] = (16383 + (anIntArray6468[i_49_] * i_54_ + anIntArray6451[i_49_] * i_53_) >> -1439915730);
                    anIntArray6451[i_49_] = i_55_;
                }
                if (i_44_ != 0) {
                    int i_56_ = Node_Sub9_Sub1.anIntArray9106[i_44_];
                    int i_57_ = Node_Sub9_Sub1.anIntArray9109[i_44_];
                    int i_58_ = (16383 + (anIntArray6468[i_49_] * i_56_ - -(i_57_ * anIntArray6531[i_49_])) >> 781010446);
                    anIntArray6468[i_49_] = (-(i_56_ * anIntArray6531[i_49_]) + (anIntArray6468[i_49_] * i_57_ - -16383)) >> 414405678;
                    anIntArray6531[i_49_] = i_58_;
                }
                anIntArray6531[i_49_] += Node_Sub14_Sub29.anInt9468;
                anIntArray6451[i_49_] += Node_Sub14_Sub25.anInt9422;
                anIntArray6468[i_49_] += Class301_Sub2.anInt8435;
            }
        } else if (i == 3) {
            for (int i_59_ = 0; i_59_ < anInt6497; i_59_++) {
                anIntArray6531[i_59_] -= Node_Sub14_Sub29.anInt9468;
                anIntArray6451[i_59_] -= Node_Sub14_Sub25.anInt9422;
                anIntArray6468[i_59_] -= Class301_Sub2.anInt8435;
                anIntArray6531[i_59_] = i_43_ * anIntArray6531[i_59_] / 128;
                anIntArray6451[i_59_] = i_44_ * anIntArray6451[i_59_] / 128;
                anIntArray6468[i_59_] = anIntArray6468[i_59_] * i_45_ / 128;
                anIntArray6531[i_59_] += Node_Sub14_Sub29.anInt9468;
                anIntArray6451[i_59_] += Node_Sub14_Sub25.anInt9422;
                anIntArray6468[i_59_] += Class301_Sub2.anInt8435;
            }
        } else if ((i ^ 0xffffffff) == -6) {
            for (int i_60_ = 0; (anInt6454 ^ 0xffffffff) < (i_60_ ^ 0xffffffff); i_60_++) {
                int i_61_ = (aByteArray6473[i_60_] & 0xff) - -(8 * i_43_);
                if ((i_61_ ^ 0xffffffff) <= -1) {
                    if (i_61_ > 255)
                        i_61_ = 255;
                } else
                    i_61_ = 0;
                aByteArray6473[i_60_] = (byte) i_61_;
            }
            if (aClass140_6450 != null)
                ((Class140) aClass140_6450).anInterface6_1662 = null;
            if (aClass353Array6440 != null) {
                for (int i_62_ = 0; anInt6475 > i_62_; i_62_++) {
                    Class353 class353 = aClass353Array6440[i_62_];
                    Class15 class15 = aClass15Array6444[i_62_];
                    ((Class15) class15).anInt280 = (0xffffff & ((Class15) class15).anInt280 | 255 - ((aByteArray6473[((Class353) class353).anInt4197]) & 0xff) << 1555316536);
                }
            }
        } else if ((i ^ 0xffffffff) == -8) {
            for (int i_63_ = 0; (anInt6454 ^ 0xffffffff) < (i_63_ ^ 0xffffffff); i_63_++) {
                int i_64_ = aShortArray6535[i_63_] & 0xffff;
                int i_65_ = (i_64_ & 0xfd56) >> 1137814698;
                int i_66_ = i_64_ >> -1894902265 & 0x7;
                i_66_ += i_44_ / 4;
                i_65_ = 0x3f & i_43_ + i_65_;
                int i_67_ = 0x7f & i_64_;
                if ((i_66_ ^ 0xffffffff) <= -1) {
                    if (i_66_ > 7)
                        i_66_ = 7;
                } else
                    i_66_ = 0;
                i_67_ += i_45_;
                if ((i_67_ ^ 0xffffffff) > -1)
                    i_67_ = 0;
                else if (i_67_ > 127)
                    i_67_ = 127;
                aShortArray6535[i_63_] = (short) (Class358.retrieveLooksSettings(i_67_, Class358.retrieveLooksSettings(i_65_ << -31470838, i_66_ << -1368222809)));
            }
            if (aClass140_6450 != null)
                ((Class140) aClass140_6450).anInterface6_1662 = null;
            if (aClass353Array6440 != null) {
                for (int i_68_ = 0; (i_68_ ^ 0xffffffff) > (anInt6475 ^ 0xffffffff); i_68_++) {
                    Class353 class353 = aClass353Array6440[i_68_];
                    Class15 class15 = aClass15Array6444[i_68_];
                    ((Class15) class15).anInt280 = ((0xffffff & (Node_Sub14_Sub39.anIntArray9600[0xffff & (aShortArray6535[((Class353) class353).anInt4197])])) | ~0xffffff & ((Class15) class15).anInt280);
                }
            }
        } else if ((i ^ 0xffffffff) == -9) {
            for (int i_69_ = 0; i_69_ < anInt6475; i_69_++) {
                Class15 class15 = aClass15Array6444[i_69_];
                ((Class15) class15).anInt271 += i_43_;
                ((Class15) class15).anInt272 += i_44_;
            }
        } else if (i == 10) {
            for (int i_70_ = 0; i_70_ < anInt6475; i_70_++) {
                Class15 class15 = aClass15Array6444[i_70_];
                ((Class15) class15).anInt273 = i_44_ * ((Class15) class15).anInt273 >> -2084883417;
                ((Class15) class15).anInt274 = ((Class15) class15).anInt274 * i_43_ >> -91840761;
            }
        } else if (i == 9) {
            for (int i_71_ = 0; (anInt6475 ^ 0xffffffff) < (i_71_ ^ 0xffffffff); i_71_++) {
                Class15 class15 = aClass15Array6444[i_71_];
                ((Class15) class15).anInt279 = 0x3fff & ((Class15) class15).anInt279 - -i_43_;
            }
        }
    }

    final boolean method1422() {
        anInt6498++;
        if (aShortArray6437 == null)
            return true;
        for (int i = 0; i < aShortArray6437.length; i++) {
            if (aShortArray6437[i] != -1 && !((ha) aHa_Sub2_6476).aD1414.method23(aShortArray6437[i], -32345))
                return false;
        }
        return true;
    }

    final int fa() {
        if (!aBoolean6539)
            method1475(29866);
        anInt6457++;
        return aShort6521;
    }

    final int V() {
        if (!aBoolean6539)
            method1475(29866);
        anInt6456++;
        return aShort6517;
    }

    final void p(int i, int i_72_, s var_s, s var_s_73_, int i_74_, int i_75_, int i_76_) {
        if (!aBoolean6539)
            method1475(29866);
        anInt6465++;
        int i_77_ = aShort6517 + i_74_;
        int i_78_ = aShort6461 + i_74_;
        int i_79_ = i_76_ - -aShort6525;
        int i_80_ = i_76_ - -aShort6522;
        if (((i ^ 0xffffffff) != -2 && (i ^ 0xffffffff) != -3 && (i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -6) || ((i_77_ ^ 0xffffffff) <= -1 && (((s) var_s).anInt3468 > i_78_ - -((s) var_s).anInt3465 >> ((s) var_s).anInt3466) && (i_79_ ^ 0xffffffff) <= -1 && (((s) var_s).anInt3465 + i_80_ >> ((s) var_s).anInt3466 < ((s) var_s).anInt3472))) {
            if (i == 4 || (i ^ 0xffffffff) == -6) {
                if (var_s_73_ == null || ((i_77_ ^ 0xffffffff) > -1 || (((s) var_s_73_).anInt3468 <= (i_78_ + ((s) var_s_73_).anInt3465 >> ((s) var_s_73_).anInt3466)) || (i_79_ ^ 0xffffffff) > -1 || ((i_80_ - -((s) var_s_73_).anInt3465 >> ((s) var_s_73_).anInt3466) >= ((s) var_s_73_).anInt3472)))
                    return;
            } else {
                i_77_ >>= ((s) var_s).anInt3466;
                i_78_ = (i_78_ - (-((s) var_s).anInt3465 + 1) >> ((s) var_s).anInt3466);
                i_79_ >>= ((s) var_s).anInt3466;
                i_80_ = (i_80_ + -1 + ((s) var_s).anInt3465 >> ((s) var_s).anInt3466);
                if (((i_75_ ^ 0xffffffff) == (var_s.method3145(i_77_, 109, i_79_) ^ 0xffffffff)) && ((i_75_ ^ 0xffffffff) == (var_s.method3145(i_78_, 78, i_79_) ^ 0xffffffff)) && ((var_s.method3145(i_77_, 64, i_80_) ^ 0xffffffff) == (i_75_ ^ 0xffffffff)) && var_s.method3145(i_78_, 64, i_80_) == i_75_)
                    return;
            }
            if ((i ^ 0xffffffff) != -2) {
                if (i == 2) {
                    int i_81_ = aShort6521;
                    if (i_81_ == 0)
                        return;
                    for (int i_82_ = 0; i_82_ < anInt6497; i_82_++) {
                        int i_83_ = (anIntArray6451[i_82_] << -477688880) / i_81_;
                        if ((i_83_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff))
                            anIntArray6451[i_82_] = (anIntArray6451[i_82_] + (var_s.method3150((byte) 112, (anIntArray6531[i_82_] - -i_74_), i_76_ + (anIntArray6468[i_82_])) - i_75_) * (i_72_ - i_83_) / i_72_);
                    }
                } else if ((i ^ 0xffffffff) == -4) {
                    int i_84_ = (i_72_ & 0xff) * 4;
                    int i_85_ = (0xff & i_72_ >> 252049896) * 4;
                    int i_86_ = (i_72_ >> 1022791696 & 0xff) << 1289323974;
                    int i_87_ = (0xff & i_72_ >> -565535720) << 1239329830;
                    if ((-(i_84_ >> -968613695) + i_74_ ^ 0xffffffff) > -1 || (((s) var_s).anInt3468 << ((s) var_s).anInt3466 <= ((s) var_s).anInt3465 + ((i_84_ >> 1340438081) + i_74_)) || (-(i_85_ >> 1088390401) + i_76_ ^ 0xffffffff) > -1 || ((i_76_ - (-(i_85_ >> -514706047) + -((s) var_s).anInt3465) ^ 0xffffffff) <= (((s) var_s).anInt3472 << ((s) var_s).anInt3466 ^ 0xffffffff)))
                        return;
                    this.method1429(var_s, i_86_, i_76_, i_74_, i_84_, 0, i_87_, i_75_, i_85_);
                } else if (i != 4) {
                    if ((i ^ 0xffffffff) == -6) {
                        int i_88_ = -aShort6521 + aShort6543;
                        for (int i_89_ = 0; i_89_ < anInt6497; i_89_++) {
                            int i_90_ = i_74_ + anIntArray6531[i_89_];
                            int i_91_ = anIntArray6468[i_89_] - -i_76_;
                            int i_92_ = var_s.method3150((byte) 109, i_90_, i_91_);
                            int i_93_ = var_s_73_.method3150((byte) 105, i_90_, i_91_);
                            int i_94_ = -i_93_ + (i_92_ + -i_72_);
                            anIntArray6451[i_89_] = -i_75_ - -i_92_ + (((anIntArray6451[i_89_] << -993149496) / i_88_ * i_94_) >> 683148680);
                        }
                    }
                } else {
                    int i_95_ = -aShort6521 + aShort6543;
                    for (int i_96_ = 0; (i_96_ ^ 0xffffffff) > (anInt6497 ^ 0xffffffff); i_96_++)
                        anIntArray6451[i_96_] = (anIntArray6451[i_96_] + -i_75_ + var_s_73_.method3150((byte) 100, (anIntArray6531[i_96_] - -i_74_), i_76_ + (anIntArray6468[i_96_])) - -i_95_);
                }
            } else {
                for (int i_97_ = 0; i_97_ < anInt6497; i_97_++)
                    anIntArray6451[i_97_] = -i_75_ + (anIntArray6451[i_97_] - -var_s.method3150((byte) 121, (anIntArray6531[i_97_] + i_74_), (anIntArray6468[i_97_] + i_76_)));
            }
            if (aClass140_6504 != null)
                ((Class140) aClass140_6504).anInterface6_1662 = null;
            aBoolean6539 = false;
        }
    }

    final void method1433(int i, int i_98_, int i_99_, int i_100_) {
        for (int i_101_ = 0; (i_101_ ^ 0xffffffff) > (anInt6454 ^ 0xffffffff); i_101_++) {
            int i_102_ = 0xffff & aShortArray6535[i_101_];
            int i_103_ = i_102_ >> -1725979862 & 0x3f;
            int i_104_ = 0x7 & i_102_ >> 1265471399;
            if (i != -1)
                i_103_ += (-i_103_ + i) * i_100_ >> 1425433063;
            if ((i_98_ ^ 0xffffffff) != 0)
                i_104_ = (i_100_ * (i_98_ - i_104_) >> -882283577) + i_104_;
            int i_105_ = 0x7f & i_102_;
            if (i_99_ != -1)
                i_105_ += i_100_ * (i_99_ + -i_105_) >> 1207969127;
            aShortArray6535[i_101_] = (short) (Class358.retrieveLooksSettings(i_105_, Class358.retrieveLooksSettings(i_104_ << -2138423577, i_103_ << -1684129078)));
        }
        anInt6478++;
        if (aClass353Array6440 != null) {
            for (int i_106_ = 0; anInt6475 > i_106_; i_106_++) {
                Class353 class353 = aClass353Array6440[i_106_];
                Class15 class15 = aClass15Array6444[i_106_];
                ((Class15) class15).anInt280 = (((Class15) class15).anInt280 & ~0xffffff | (0xffffff & (Node_Sub14_Sub39.anIntArray9600[(aShortArray6535[((Class353) class353).anInt4197] & 0xffff)])));
            }
        }
        if (aClass140_6450 != null)
            ((Class140) aClass140_6450).anInterface6_1662 = null;
    }

    final Class124[] method1426() {
        anInt6542++;
        return aClass124Array6527;
    }

    final void H(int i, int i_107_, int i_108_) {
        anInt6474++;
        for (int i_109_ = 0; (i_109_ ^ 0xffffffff) > (anInt6497 ^ 0xffffffff); i_109_++) {
            if (i != 0)
                anIntArray6531[i_109_] += i;
            if ((i_107_ ^ 0xffffffff) != -1)
                anIntArray6451[i_109_] += i_107_;
            if (i_108_ != 0)
                anIntArray6468[i_109_] += i_108_;
        }
        aBoolean6539 = false;
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
    }

    final boolean F() {
        anInt6551++;
        return aBoolean6492;
    }

    final void I(int i, int[] is, int i_110_, int i_111_, int i_112_, boolean bool, int i_113_, int[] is_114_) {
        anInt6512++;
        int i_115_ = is.length;
        if (i == 0) {
            i_112_ <<= 4;
            i_110_ <<= 4;
            i_111_ <<= 4;
            Node_Sub14_Sub29.anInt9468 = 0;
            Class301_Sub2.anInt8435 = 0;
            int i_116_ = 0;
            Node_Sub14_Sub25.anInt9422 = 0;
            for (int i_117_ = 0; (i_115_ ^ 0xffffffff) < (i_117_ ^ 0xffffffff); i_117_++) {
                int i_118_ = is[i_117_];
                if ((anIntArrayArray6481.length ^ 0xffffffff) < (i_118_ ^ 0xffffffff)) {
                    int[] is_119_ = anIntArrayArray6481[i_118_];
                    for (int i_120_ = 0; (i_120_ ^ 0xffffffff) > (is_119_.length ^ 0xffffffff); i_120_++) {
                        int i_121_ = is_119_[i_120_];
                        if (aShortArray6442 == null || (aShortArray6442[i_121_] & i_113_) != 0) {
                            Node_Sub14_Sub29.anInt9468 += anIntArray6531[i_121_];
                            Node_Sub14_Sub25.anInt9422 += anIntArray6451[i_121_];
                            i_116_++;
                            Class301_Sub2.anInt8435 += anIntArray6468[i_121_];
                        }
                    }
                }
            }
            if ((i_116_ ^ 0xffffffff) < -1) {
                Node_Sub14_Sub25.anInt9422 = Node_Sub14_Sub25.anInt9422 / i_116_ + i_111_;
                Node_Sub14_Sub29.anInt9468 = Node_Sub14_Sub29.anInt9468 / i_116_ - -i_110_;
                Class382.aBoolean4704 = true;
                Class301_Sub2.anInt8435 = i_112_ + Class301_Sub2.anInt8435 / i_116_;
            } else {
                Node_Sub14_Sub29.anInt9468 = i_110_;
                Node_Sub14_Sub25.anInt9422 = i_111_;
                Class301_Sub2.anInt8435 = i_112_;
            }
        } else if (i == 1) {
            if (is_114_ != null) {
                int i_122_ = ((is_114_[2] * i_112_ + (is_114_[1] * i_111_ + is_114_[0] * i_110_) + 8192) >> 504220814);
                int i_123_ = (8192 + (i_110_ * is_114_[3] + is_114_[4] * i_111_ - -(is_114_[5] * i_112_)) >> 1841023022);
                int i_124_ = ((i_111_ * is_114_[7] + i_110_ * is_114_[6] + (is_114_[8] * i_112_ - -8192)) >> 1558800174);
                i_112_ = i_124_;
                i_110_ = i_122_;
                i_111_ = i_123_;
            }
            i_111_ <<= 4;
            i_110_ <<= 4;
            i_112_ <<= 4;
            for (int i_125_ = 0; (i_115_ ^ 0xffffffff) < (i_125_ ^ 0xffffffff); i_125_++) {
                int i_126_ = is[i_125_];
                if (i_126_ < anIntArrayArray6481.length) {
                    int[] is_127_ = anIntArrayArray6481[i_126_];
                    for (int i_128_ = 0; (is_127_.length ^ 0xffffffff) < (i_128_ ^ 0xffffffff); i_128_++) {
                        int i_129_ = is_127_[i_128_];
                        if (aShortArray6442 == null || ((aShortArray6442[i_129_] & i_113_ ^ 0xffffffff) != -1)) {
                            anIntArray6531[i_129_] += i_110_;
                            anIntArray6451[i_129_] += i_111_;
                            anIntArray6468[i_129_] += i_112_;
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -3) {
            if (is_114_ == null) {
                for (int i_130_ = 0; (i_130_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff); i_130_++) {
                    int i_131_ = is[i_130_];
                    if ((i_131_ ^ 0xffffffff) > (anIntArrayArray6481.length ^ 0xffffffff)) {
                        int[] is_132_ = anIntArrayArray6481[i_131_];
                        for (int i_133_ = 0; i_133_ < is_132_.length; i_133_++) {
                            int i_134_ = is_132_[i_133_];
                            if (aShortArray6442 == null || (i_113_ & aShortArray6442[i_134_] ^ 0xffffffff) != -1) {
                                anIntArray6531[i_134_] -= Node_Sub14_Sub29.anInt9468;
                                anIntArray6451[i_134_] -= Node_Sub14_Sub25.anInt9422;
                                anIntArray6468[i_134_] -= Class301_Sub2.anInt8435;
                                if ((i_112_ ^ 0xffffffff) != -1) {
                                    int i_135_ = (Node_Sub9_Sub1.anIntArray9106[i_112_]);
                                    int i_136_ = (Node_Sub9_Sub1.anIntArray9109[i_112_]);
                                    int i_137_ = ((i_135_ * anIntArray6451[i_134_] - (-(i_136_ * anIntArray6531[i_134_]) - 16383)) >> -690073810);
                                    anIntArray6451[i_134_] = ((16383 + -(i_135_ * anIntArray6531[i_134_]) + i_136_ * anIntArray6451[i_134_]) >> 1886885934);
                                    anIntArray6531[i_134_] = i_137_;
                                }
                                if (i_110_ != 0) {
                                    int i_138_ = (Node_Sub9_Sub1.anIntArray9106[i_110_]);
                                    int i_139_ = (Node_Sub9_Sub1.anIntArray9109[i_110_]);
                                    int i_140_ = ((-(anIntArray6468[i_134_] * i_138_) + (anIntArray6451[i_134_] * i_139_ - -16383)) >> 1468704942);
                                    anIntArray6468[i_134_] = (16383 + (anIntArray6468[i_134_] * i_139_ + (anIntArray6451[i_134_] * i_138_))) >> 1113979758;
                                    anIntArray6451[i_134_] = i_140_;
                                }
                                if ((i_111_ ^ 0xffffffff) != -1) {
                                    int i_141_ = (Node_Sub9_Sub1.anIntArray9106[i_111_]);
                                    int i_142_ = (Node_Sub9_Sub1.anIntArray9109[i_111_]);
                                    int i_143_ = ((16383 + (i_141_ * anIntArray6468[i_134_] - -(anIntArray6531[i_134_] * i_142_))) >> -1175669554);
                                    anIntArray6468[i_134_] = (16383 + (-(anIntArray6531[i_134_] * i_141_) + i_142_ * (anIntArray6468[i_134_])) >> 774889518);
                                    anIntArray6531[i_134_] = i_143_;
                                }
                                anIntArray6531[i_134_] += Node_Sub14_Sub29.anInt9468;
                                anIntArray6451[i_134_] += Node_Sub14_Sub25.anInt9422;
                                anIntArray6468[i_134_] += Class301_Sub2.anInt8435;
                            }
                        }
                    }
                }
                if (bool) {
                    for (int i_144_ = 0; i_115_ > i_144_; i_144_++) {
                        int i_145_ = is[i_144_];
                        if ((anIntArrayArray6481.length ^ 0xffffffff) < (i_145_ ^ 0xffffffff)) {
                            int[] is_146_ = anIntArrayArray6481[i_145_];
                            for (int i_147_ = 0; ((i_147_ ^ 0xffffffff) > (is_146_.length ^ 0xffffffff)); i_147_++) {
                                int i_148_ = is_146_[i_147_];
                                if (aShortArray6442 == null || ((aShortArray6442[i_148_] & i_113_) != 0)) {
                                    int i_149_ = anIntArray6458[i_148_];
                                    int i_150_ = anIntArray6458[1 + i_148_];
                                    for (int i_151_ = i_149_; i_151_ < i_150_; i_151_++) {
                                        int i_152_ = aShortArray6516[i_151_] + -1;
                                        if (i_152_ == -1)
                                            break;
                                        if (i_112_ != 0) {
                                            int i_153_ = (Node_Sub9_Sub1.anIntArray9106[i_112_]);
                                            int i_154_ = (Node_Sub9_Sub1.anIntArray9109[i_112_]);
                                            int i_155_ = (((i_154_ * aShortArray6554[i_152_]) + ((i_153_ * (aShortArray6556[i_152_])) - -16383)) >> -2101939410);
                                            aShortArray6556[i_152_] = (short) ((16383 + (-((aShortArray6554[i_152_]) * i_153_) + ((aShortArray6556[i_152_]) * i_154_))) >> -2047554130);
                                            aShortArray6554[i_152_] = (short) i_155_;
                                        }
                                        if (i_110_ != 0) {
                                            int i_156_ = (Node_Sub9_Sub1.anIntArray9106[i_110_]);
                                            int i_157_ = (Node_Sub9_Sub1.anIntArray9109[i_110_]);
                                            int i_158_ = (-(aShortArray6510[i_152_] * i_156_) + (i_157_ * (aShortArray6556[i_152_]) + 16383)) >> 1771229710;
                                            aShortArray6510[i_152_] = (short) (((i_156_ * (aShortArray6556[i_152_])) + ((i_157_ * (aShortArray6510[i_152_])) + 16383)) >> -414633394);
                                            aShortArray6556[i_152_] = (short) i_158_;
                                        }
                                        if (i_111_ != 0) {
                                            int i_159_ = (Node_Sub9_Sub1.anIntArray9106[i_111_]);
                                            int i_160_ = (Node_Sub9_Sub1.anIntArray9109[i_111_]);
                                            int i_161_ = (((i_159_ * aShortArray6510[i_152_]) + (aShortArray6554[i_152_] * i_160_) - -16383) >> 352491054);
                                            aShortArray6510[i_152_] = (short) ((16383 + -((aShortArray6554[i_152_]) * i_159_) + (i_160_ * (aShortArray6510[i_152_]))) >> 1264570670);
                                            aShortArray6554[i_152_] = (short) i_161_;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (aClass140_6491 == null && aClass140_6450 != null)
                        ((Class140) aClass140_6450).anInterface6_1662 = null;
                    if (aClass140_6491 != null)
                        ((Class140) aClass140_6491).anInterface6_1662 = null;
                }
            } else {
                int i_162_ = is_114_[9] << 1601825412;
                int i_163_ = is_114_[10] << 313727364;
                int i_164_ = is_114_[11] << 1622297348;
                int i_165_ = is_114_[12] << -1970458140;
                int i_166_ = is_114_[13] << -1391820284;
                int i_167_ = is_114_[14] << -1006418300;
                if (Class382.aBoolean4704) {
                    int i_168_ = ((is_114_[3] * Node_Sub14_Sub25.anInt9422 + (Node_Sub14_Sub29.anInt9468 * is_114_[0] - -(Class301_Sub2.anInt8435 * is_114_[6])) - -8192) >> 1653488206);
                    int i_169_ = (8192 + (is_114_[1] * Node_Sub14_Sub29.anInt9468 - (-(is_114_[4] * Node_Sub14_Sub25.anInt9422) - is_114_[7] * Class301_Sub2.anInt8435)) >> 1291852654);
                    i_168_ += i_165_;
                    i_169_ += i_166_;
                    int i_170_ = ((8192 + Class301_Sub2.anInt8435 * is_114_[8] + is_114_[2] * Node_Sub14_Sub29.anInt9468 - -(is_114_[5] * Node_Sub14_Sub25.anInt9422)) >> 421190510);
                    Node_Sub14_Sub29.anInt9468 = i_168_;
                    i_170_ += i_167_;
                    Node_Sub14_Sub25.anInt9422 = i_169_;
                    Class382.aBoolean4704 = false;
                    Class301_Sub2.anInt8435 = i_170_;
                }
                int[] is_171_ = new int[9];
                int i_172_ = Node_Sub9_Sub1.anIntArray9109[i_110_];
                int i_173_ = Node_Sub9_Sub1.anIntArray9106[i_110_];
                int i_174_ = Node_Sub9_Sub1.anIntArray9109[i_111_];
                int i_175_ = Node_Sub9_Sub1.anIntArray9106[i_111_];
                int i_176_ = Node_Sub9_Sub1.anIntArray9109[i_112_];
                int i_177_ = Node_Sub9_Sub1.anIntArray9106[i_112_];
                int i_178_ = i_176_ * i_173_ - -8192 >> -1114603314;
                int i_179_ = 8192 + i_177_ * i_173_ >> 1651645838;
                is_171_[1] = (i_175_ * i_178_ + (i_177_ * -i_174_ - -8192) >> -1185618450);
                is_171_[6] = i_179_ * i_174_ + i_176_ * -i_175_ + 8192 >> 1349149294;
                is_171_[7] = 8192 + i_174_ * i_178_ + i_175_ * i_177_ >> -846634450;
                is_171_[3] = 8192 + i_177_ * i_172_ >> 1676226990;
                is_171_[5] = -i_173_;
                is_171_[4] = 8192 + i_172_ * i_176_ >> 782880814;
                is_171_[0] = (8192 + (i_174_ * i_176_ - -(i_179_ * i_175_)) >> 1576978606);
                is_171_[8] = i_172_ * i_174_ - -8192 >> 1352963214;
                is_171_[2] = 8192 + i_172_ * i_175_ >> 931850798;
                int i_180_ = ((8192 + is_171_[2] * -Class301_Sub2.anInt8435 + (-Node_Sub14_Sub29.anInt9468 * is_171_[0] - -(is_171_[1] * -Node_Sub14_Sub25.anInt9422))) >> -281882258);
                int i_181_ = ((-Node_Sub14_Sub25.anInt9422 * is_171_[4] + (-Node_Sub14_Sub29.anInt9468 * is_171_[3] - -(-Class301_Sub2.anInt8435 * is_171_[5])) + 8192) >> -724066354);
                int i_182_ = ((-Node_Sub14_Sub29.anInt9468 * is_171_[6] + (-Node_Sub14_Sub25.anInt9422 * is_171_[7] - -(-Class301_Sub2.anInt8435 * is_171_[8]) + 8192)) >> 979233422);
                int i_183_ = Node_Sub14_Sub29.anInt9468 + i_180_;
                int i_184_ = i_181_ - -Node_Sub14_Sub25.anInt9422;
                int i_185_ = Class301_Sub2.anInt8435 + i_182_;
                int[] is_186_ = new int[9];
                for (int i_187_ = 0; i_187_ < 3; i_187_++) {
                    for (int i_188_ = 0; (i_188_ ^ 0xffffffff) > -4; i_188_++) {
                        int i_189_ = 0;
                        for (int i_190_ = 0; i_190_ < 3; i_190_++)
                            i_189_ += (is_171_[3 * i_187_ - -i_190_] * is_114_[i_190_ + 3 * i_188_]);
                        is_186_[i_188_ + 3 * i_187_] = i_189_ - -8192 >> -80998098;
                    }
                }
                int i_191_ = (8192 + is_171_[0] * i_165_ - (-(i_166_ * is_171_[1]) + -(i_167_ * is_171_[2])) >> 420091374);
                int i_192_ = ((is_171_[5] * i_167_ + is_171_[4] * i_166_ + (is_171_[3] * i_165_ - -8192)) >> -424387346);
                i_192_ += i_184_;
                i_191_ += i_183_;
                int i_193_ = ((is_171_[7] * i_166_ + is_171_[6] * i_165_ - (-(is_171_[8] * i_167_) - 8192)) >> 1341541966);
                i_193_ += i_185_;
                int[] is_194_ = new int[9];
                for (int i_195_ = 0; (i_195_ ^ 0xffffffff) > -4; i_195_++) {
                    for (int i_196_ = 0; (i_196_ ^ 0xffffffff) > -4; i_196_++) {
                        int i_197_ = 0;
                        for (int i_198_ = 0; (i_198_ ^ 0xffffffff) > -4; i_198_++)
                            i_197_ += (is_114_[3 * i_195_ + i_198_] * is_186_[i_198_ * 3 + i_196_]);
                        is_194_[i_195_ * 3 - -i_196_] = 8192 + i_197_ >> 682174478;
                    }
                }
                int i_199_ = (is_114_[1] * i_192_ + (i_191_ * is_114_[0] + i_193_ * is_114_[2] + 8192) >> -908564242);
                int i_200_ = (i_193_ * is_114_[5] + (is_114_[3] * i_191_ - -(i_192_ * is_114_[4])) - -8192 >> -792603090);
                i_199_ += i_162_;
                int i_201_ = ((8192 + is_114_[8] * i_193_ + is_114_[7] * i_192_ + i_191_ * is_114_[6]) >> -1148670866);
                i_200_ += i_163_;
                i_201_ += i_164_;
                for (int i_202_ = 0; (i_202_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff); i_202_++) {
                    int i_203_ = is[i_202_];
                    if ((anIntArrayArray6481.length ^ 0xffffffff) < (i_203_ ^ 0xffffffff)) {
                        int[] is_204_ = anIntArrayArray6481[i_203_];
                        for (int i_205_ = 0; ((i_205_ ^ 0xffffffff) > (is_204_.length ^ 0xffffffff)); i_205_++) {
                            int i_206_ = is_204_[i_205_];
                            if (aShortArray6442 == null || (i_113_ & aShortArray6442[i_206_]) != 0) {
                                int i_207_ = ((8192 + is_194_[1] * anIntArray6451[i_206_] + (is_194_[0] * anIntArray6531[i_206_] + (is_194_[2] * anIntArray6468[i_206_]))) >> -1368661042);
                                int i_208_ = ((anIntArray6451[i_206_] * is_194_[4] + (is_194_[3] * anIntArray6531[i_206_] - (-(anIntArray6468[i_206_] * is_194_[5]) + -8192))) >> 634858542);
                                i_208_ += i_200_;
                                i_207_ += i_199_;
                                int i_209_ = ((8192 + is_194_[8] * anIntArray6468[i_206_] + (is_194_[6] * anIntArray6531[i_206_] + (is_194_[7] * anIntArray6451[i_206_]))) >> 1978937390);
                                i_209_ += i_201_;
                                anIntArray6531[i_206_] = i_207_;
                                anIntArray6451[i_206_] = i_208_;
                                anIntArray6468[i_206_] = i_209_;
                            }
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -4) {
            if (is_114_ == null) {
                for (int i_210_ = 0; (i_210_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff); i_210_++) {
                    int i_211_ = is[i_210_];
                    if ((i_211_ ^ 0xffffffff) > (anIntArrayArray6481.length ^ 0xffffffff)) {
                        int[] is_212_ = anIntArrayArray6481[i_211_];
                        for (int i_213_ = 0; ((i_213_ ^ 0xffffffff) > (is_212_.length ^ 0xffffffff)); i_213_++) {
                            int i_214_ = is_212_[i_213_];
                            if (aShortArray6442 == null || (i_113_ & aShortArray6442[i_214_]) != 0) {
                                anIntArray6531[i_214_] -= Node_Sub14_Sub29.anInt9468;
                                anIntArray6451[i_214_] -= Node_Sub14_Sub25.anInt9422;
                                anIntArray6468[i_214_] -= Class301_Sub2.anInt8435;
                                anIntArray6531[i_214_] = (anIntArray6531[i_214_] * i_110_ >> 846480807);
                                anIntArray6451[i_214_] = (anIntArray6451[i_214_] * i_111_ >> -216591481);
                                anIntArray6468[i_214_] = (anIntArray6468[i_214_] * i_112_ >> -2139433465);
                                anIntArray6531[i_214_] += Node_Sub14_Sub29.anInt9468;
                                anIntArray6451[i_214_] += Node_Sub14_Sub25.anInt9422;
                                anIntArray6468[i_214_] += Class301_Sub2.anInt8435;
                            }
                        }
                    }
                }
            } else {
                int i_215_ = is_114_[9] << -1095472380;
                int i_216_ = is_114_[10] << -1607048316;
                int i_217_ = is_114_[11] << -1032527548;
                int i_218_ = is_114_[12] << -1472866108;
                int i_219_ = is_114_[13] << -731285820;
                int i_220_ = is_114_[14] << -126554876;
                if (Class382.aBoolean4704) {
                    int i_221_ = ((Node_Sub14_Sub25.anInt9422 * is_114_[3] + (Node_Sub14_Sub29.anInt9468 * is_114_[0] - (-(Class301_Sub2.anInt8435 * is_114_[6]) - 8192))) >> 1277966638);
                    int i_222_ = ((is_114_[1] * Node_Sub14_Sub29.anInt9468 + (is_114_[4] * Node_Sub14_Sub25.anInt9422 - -(is_114_[7] * Class301_Sub2.anInt8435) - -8192)) >> -1602944210);
                    int i_223_ = ((Class301_Sub2.anInt8435 * is_114_[8] + (Node_Sub14_Sub25.anInt9422 * is_114_[5] + is_114_[2] * Node_Sub14_Sub29.anInt9468) + 8192) >> 858137998);
                    i_221_ += i_218_;
                    i_222_ += i_219_;
                    i_223_ += i_220_;
                    Node_Sub14_Sub29.anInt9468 = i_221_;
                    Node_Sub14_Sub25.anInt9422 = i_222_;
                    Class382.aBoolean4704 = false;
                    Class301_Sub2.anInt8435 = i_223_;
                }
                int i_224_ = i_110_ << 1177686575 >> -76524505;
                int i_225_ = i_111_ << 1762596399 >> 613292711;
                int i_226_ = i_112_ << -130322161 >> 1745389095;
                int i_227_ = (8192 + i_224_ * -Node_Sub14_Sub29.anInt9468 >> 2048900398);
                int i_228_ = (-Node_Sub14_Sub25.anInt9422 * i_225_ + 8192 >> -910912530);
                int i_229_ = 8192 + -Class301_Sub2.anInt8435 * i_226_ >> -701328722;
                int i_230_ = Node_Sub14_Sub29.anInt9468 + i_227_;
                int i_231_ = i_228_ + Node_Sub14_Sub25.anInt9422;
                int i_232_ = i_229_ - -Class301_Sub2.anInt8435;
                int[] is_233_ = new int[9];
                is_233_[1] = 8192 + i_224_ * is_114_[3] >> 403183182;
                is_233_[0] = 8192 + i_224_ * is_114_[0] >> -868550898;
                is_233_[2] = i_224_ * is_114_[6] - -8192 >> 825172558;
                is_233_[6] = 8192 + i_226_ * is_114_[2] >> -2030740498;
                is_233_[5] = i_225_ * is_114_[7] - -8192 >> -1926963826;
                is_233_[4] = is_114_[4] * i_225_ - -8192 >> -1318163506;
                is_233_[3] = is_114_[1] * i_225_ - -8192 >> -905244402;
                is_233_[7] = i_226_ * is_114_[5] - -8192 >> -1119141266;
                is_233_[8] = i_226_ * is_114_[8] - -8192 >> 1252929742;
                int i_234_ = i_224_ * i_218_ - -8192 >> 277330158;
                int i_235_ = 8192 + i_225_ * i_219_ >> -1228032626;
                i_234_ += i_230_;
                i_235_ += i_231_;
                int i_236_ = i_226_ * i_220_ + 8192 >> -1896885586;
                i_236_ += i_232_;
                int[] is_237_ = new int[9];
                for (int i_238_ = 0; i_238_ < 3; i_238_++) {
                    for (int i_239_ = 0; (i_239_ ^ 0xffffffff) > -4; i_239_++) {
                        int i_240_ = 0;
                        for (int i_241_ = 0; i_241_ < 3; i_241_++)
                            i_240_ += (is_233_[i_239_ + i_241_ * 3] * is_114_[i_241_ + i_238_ * 3]);
                        is_237_[i_238_ * 3 - -i_239_] = 8192 + i_240_ >> 1061977422;
                    }
                }
                int i_242_ = ((i_235_ * is_114_[1] + i_234_ * is_114_[0] - -(i_236_ * is_114_[2]) - -8192) >> -927017842);
                int i_243_ = (8192 + (i_234_ * is_114_[3] + is_114_[4] * i_235_ - -(is_114_[5] * i_236_)) >> -1689641714);
                int i_244_ = ((8192 + (is_114_[8] * i_236_ + i_234_ * is_114_[6]) + i_235_ * is_114_[7]) >> 468972526);
                i_242_ += i_215_;
                i_243_ += i_216_;
                i_244_ += i_217_;
                for (int i_245_ = 0; i_115_ > i_245_; i_245_++) {
                    int i_246_ = is[i_245_];
                    if ((anIntArrayArray6481.length ^ 0xffffffff) < (i_246_ ^ 0xffffffff)) {
                        int[] is_247_ = anIntArrayArray6481[i_246_];
                        for (int i_248_ = 0; i_248_ < is_247_.length; i_248_++) {
                            int i_249_ = is_247_[i_248_];
                            if (aShortArray6442 == null || (aShortArray6442[i_249_] & i_113_ ^ 0xffffffff) != -1) {
                                int i_250_ = ((anIntArray6531[i_249_] * is_237_[0] + is_237_[1] * anIntArray6451[i_249_] - (-(is_237_[2] * anIntArray6468[i_249_]) - 8192)) >> -1579489010);
                                int i_251_ = ((8192 + (is_237_[3] * anIntArray6531[i_249_] - (-(is_237_[4] * anIntArray6451[i_249_]) - (anIntArray6468[i_249_] * is_237_[5])))) >> -522130642);
                                int i_252_ = ((anIntArray6531[i_249_] * is_237_[6] + (is_237_[7] * anIntArray6451[i_249_] + ((is_237_[8] * anIntArray6468[i_249_]) + 8192))) >> -50608754);
                                i_251_ += i_243_;
                                i_250_ += i_242_;
                                i_252_ += i_244_;
                                anIntArray6531[i_249_] = i_250_;
                                anIntArray6451[i_249_] = i_251_;
                                anIntArray6468[i_249_] = i_252_;
                            }
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -6) {
            if (anIntArrayArray6502 != null) {
                for (int i_253_ = 0; i_115_ > i_253_; i_253_++) {
                    int i_254_ = is[i_253_];
                    if (i_254_ < anIntArrayArray6502.length) {
                        int[] is_255_ = anIntArrayArray6502[i_254_];
                        for (int i_256_ = 0; is_255_.length > i_256_; i_256_++) {
                            int i_257_ = is_255_[i_256_];
                            if (aShortArray6532 == null || (i_113_ & aShortArray6532[i_257_]) != 0) {
                                int i_258_ = ((aByteArray6473[i_257_] & 0xff) - -(i_110_ * 8));
                                if ((i_258_ ^ 0xffffffff) > -1)
                                    i_258_ = 0;
                                else if ((i_258_ ^ 0xffffffff) < -256)
                                    i_258_ = 255;
                                aByteArray6473[i_257_] = (byte) i_258_;
                                if (aClass140_6450 != null)
                                    ((Class140) aClass140_6450).anInterface6_1662 = null;
                            }
                        }
                    }
                }
                if (aClass353Array6440 != null) {
                    for (int i_259_ = 0; anInt6475 > i_259_; i_259_++) {
                        Class353 class353 = aClass353Array6440[i_259_];
                        Class15 class15 = aClass15Array6444[i_259_];
                        ((Class15) class15).anInt280 = (((Class15) class15).anInt280 & 0xffffff | -((aByteArray6473[((Class353) class353).anInt4197]) & 0xff) + 255 << -1452399720);
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray6502 != null) {
                for (int i_260_ = 0; (i_115_ ^ 0xffffffff) < (i_260_ ^ 0xffffffff); i_260_++) {
                    int i_261_ = is[i_260_];
                    if (anIntArrayArray6502.length > i_261_) {
                        int[] is_262_ = anIntArrayArray6502[i_261_];
                        for (int i_263_ = 0; ((i_263_ ^ 0xffffffff) > (is_262_.length ^ 0xffffffff)); i_263_++) {
                            int i_264_ = is_262_[i_263_];
                            if (aShortArray6532 == null || (aShortArray6532[i_264_] & i_113_) != 0) {
                                int i_265_ = aShortArray6535[i_264_] & 0xffff;
                                int i_266_ = (0xfca2 & i_265_) >> -1199583606;
                                int i_267_ = i_265_ >> -889817 & 0x7;
                                i_266_ = 0x3f & i_266_ - -i_110_;
                                i_267_ += i_111_ / 4;
                                int i_268_ = i_265_ & 0x7f;
                                if (i_267_ >= 0) {
                                    if (i_267_ > 7)
                                        i_267_ = 7;
                                } else
                                    i_267_ = 0;
                                i_268_ += i_112_;
                                if ((i_268_ ^ 0xffffffff) <= -1) {
                                    if (i_268_ > 127)
                                        i_268_ = 127;
                                } else
                                    i_268_ = 0;
                                aShortArray6535[i_264_] = (short) (Class358.retrieveLooksSettings((Class358.retrieveLooksSettings(i_267_ << 481240999, i_266_ << 113057802)), i_268_));
                                if (aClass140_6450 != null)
                                    ((Class140) aClass140_6450).anInterface6_1662 = null;
                            }
                        }
                    }
                }
                if (aClass353Array6440 != null) {
                    for (int i_269_ = 0; i_269_ < anInt6475; i_269_++) {
                        Class353 class353 = aClass353Array6440[i_269_];
                        Class15 class15 = aClass15Array6444[i_269_];
                        ((Class15) class15).anInt280 = ((0xffffff & (Node_Sub14_Sub39.anIntArray9600[aShortArray6535[(((Class353) class353).anInt4197)] & 0xffff])) | ((Class15) class15).anInt280 & ~0xffffff);
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -9) {
            if (anIntArrayArray6482 != null) {
                for (int i_270_ = 0; (i_270_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff); i_270_++) {
                    int i_271_ = is[i_270_];
                    if (i_271_ < anIntArrayArray6482.length) {
                        int[] is_272_ = anIntArrayArray6482[i_271_];
                        for (int i_273_ = 0; ((i_273_ ^ 0xffffffff) > (is_272_.length ^ 0xffffffff)); i_273_++) {
                            Class15 class15 = aClass15Array6444[is_272_[i_273_]];
                            ((Class15) class15).anInt272 += i_111_;
                            ((Class15) class15).anInt271 += i_110_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray6482 != null) {
                for (int i_274_ = 0; (i_274_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff); i_274_++) {
                    int i_275_ = is[i_274_];
                    if (anIntArrayArray6482.length > i_275_) {
                        int[] is_276_ = anIntArrayArray6482[i_275_];
                        for (int i_277_ = 0; ((is_276_.length ^ 0xffffffff) < (i_277_ ^ 0xffffffff)); i_277_++) {
                            Class15 class15 = aClass15Array6444[is_276_[i_277_]];
                            ((Class15) class15).anInt273 = (((Class15) class15).anInt273 * i_111_ >> 1572034471);
                            ((Class15) class15).anInt274 = (i_110_ * ((Class15) class15).anInt274 >> -1741824409);
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -10 && anIntArrayArray6482 != null) {
            for (int i_278_ = 0; i_278_ < i_115_; i_278_++) {
                int i_279_ = is[i_278_];
                if ((i_279_ ^ 0xffffffff) > (anIntArrayArray6482.length ^ 0xffffffff)) {
                    int[] is_280_ = anIntArrayArray6482[i_279_];
                    for (int i_281_ = 0; (is_280_.length ^ 0xffffffff) < (i_281_ ^ 0xffffffff); i_281_++) {
                        Class15 class15 = aClass15Array6444[is_280_[i_281_]];
                        ((Class15) class15).anInt279 = 0x3fff & ((Class15) class15).anInt279 + i_110_;
                    }
                }
            }
        }
    }

    final boolean method1437(int i, int i_282_, Viewport viewport, boolean bool, int i_283_) {
        anInt6486++;
        return method1476(bool, i, 1238578060, i_283_, -1, viewport, i_282_);
    }

    final void k(int i) {
        anInt6443++;
        int i_284_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_285_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_286_ = 0; (anInt6497 ^ 0xffffffff) < (i_286_ ^ 0xffffffff); i_286_++) {
            int i_287_ = ((i_285_ * anIntArray6531[i_286_] + anIntArray6468[i_286_] * i_284_) >> -1548390098);
            anIntArray6468[i_286_] = (i_285_ * anIntArray6468[i_286_] + -(i_284_ * anIntArray6531[i_286_])) >> 1040982926;
            anIntArray6531[i_286_] = i_287_;
        }
        for (int i_288_ = 0; (anInt6455 ^ 0xffffffff) < (i_288_ ^ 0xffffffff); i_288_++) {
            int i_289_ = ((i_285_ * aShortArray6554[i_288_] + aShortArray6510[i_288_] * i_284_) >> 1121832142);
            aShortArray6510[i_288_] = (short) ((aShortArray6510[i_288_] * i_285_ + -(i_284_ * aShortArray6554[i_288_])) >> -1702680818);
            aShortArray6554[i_288_] = (short) i_289_;
        }
        if (aClass140_6491 == null && aClass140_6450 != null)
            ((Class140) aClass140_6450).anInterface6_1662 = null;
        if (aClass140_6491 != null)
            ((Class140) aClass140_6491).anInterface6_1662 = null;
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
        aBoolean6539 = false;
    }

    final int ma() {
        if (!aBoolean6539)
            method1475(29866);
        anInt6511++;
        return aShort6467;
    }

    final boolean method1420(int i, int i_290_, Viewport viewport, boolean bool, int i_291_, int i_292_) {
        anInt6453++;
        return method1476(bool, i, 1238578060, i_291_, i_292_, viewport, i_290_);
    }

    private final boolean method1470(int i, int i_293_, int i_294_, boolean bool, int i_295_, int i_296_, int i_297_, int i_298_, int i_299_) {
        anInt6446++;
        if ((i_295_ ^ 0xffffffff) > (i_296_ ^ 0xffffffff) && i_299_ > i_295_ && i_298_ > i_295_)
            return false;
        if (i_296_ < i_295_ && (i_295_ ^ 0xffffffff) < (i_299_ ^ 0xffffffff) && (i_295_ ^ 0xffffffff) < (i_298_ ^ 0xffffffff))
            return false;
        if ((i_294_ ^ 0xffffffff) < (i_297_ ^ 0xffffffff) && i_297_ < i_293_ && i_297_ < i)
            return false;
        if ((i_297_ ^ 0xffffffff) < (i_294_ ^ 0xffffffff) && (i_297_ ^ 0xffffffff) < (i_293_ ^ 0xffffffff) && i < i_297_)
            return false;
        if (bool != true)
            return false;
        return true;
    }

    final Class162 method1436(byte i, int i_300_, boolean bool) {
        anInt6555++;
        Class162_Sub2 class162_sub2_301_;
        Class162_Sub2 class162_sub2_302_;
        if (i == 1) {
            class162_sub2_302_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5849;
            class162_sub2_301_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5876;
        } else if (i != 2) {
            if ((i ^ 0xffffffff) != -4) {
                if (i != 4) {
                    if (i != 5)
                        class162_sub2_301_ = class162_sub2_302_ = new Class162_Sub2(aHa_Sub2_6476);
                    else {
                        class162_sub2_301_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5905;
                        class162_sub2_302_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5874;
                    }
                } else {
                    class162_sub2_301_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5865;
                    class162_sub2_302_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5908;
                }
            } else {
                class162_sub2_302_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5946;
                class162_sub2_301_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5894;
            }
        } else {
            class162_sub2_302_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5885;
            class162_sub2_301_ = ((ha_Sub2) aHa_Sub2_6476).aClass162_Sub2_5904;
        }
        return method1478(bool, i_300_, class162_sub2_302_, class162_sub2_301_, (i ^ 0xffffffff) != -1, (byte) 116);
    }

    final r ba(r var_r) {
        anInt6503++;
        if ((anInt6455 ^ 0xffffffff) == -1)
            return null;
        if (!aBoolean6539)
            method1475(29866);
        int i;
        int i_303_;
        if ((((ha_Sub2) aHa_Sub2_6476).anInt5862 ^ 0xffffffff) >= -1) {
            i = (-(aShort6521 * ((ha_Sub2) aHa_Sub2_6476).anInt5862 >> 554048552) + aShort6517 >> ((ha_Sub2) aHa_Sub2_6476).anInt5798);
            i_303_ = (aShort6461 + -(((ha_Sub2) aHa_Sub2_6476).anInt5862 * aShort6543 >> 1072384360)) >> ((ha_Sub2) aHa_Sub2_6476).anInt5798;
        } else {
            i = (-(((ha_Sub2) aHa_Sub2_6476).anInt5862 * aShort6543 >> 1090847784) + aShort6517 >> ((ha_Sub2) aHa_Sub2_6476).anInt5798);
            i_303_ = (aShort6461 - (((ha_Sub2) aHa_Sub2_6476).anInt5862 * aShort6521 >> -570439704)) >> ((ha_Sub2) aHa_Sub2_6476).anInt5798;
        }
        int i_304_;
        int i_305_;
        if (((ha_Sub2) aHa_Sub2_6476).anInt5935 > 0) {
            i_304_ = (-(((ha_Sub2) aHa_Sub2_6476).anInt5935 * aShort6543 >> 1955321448) + aShort6525 >> ((ha_Sub2) aHa_Sub2_6476).anInt5798);
            i_305_ = (aShort6522 + -(((ha_Sub2) aHa_Sub2_6476).anInt5935 * aShort6521 >> 1631154376)) >> ((ha_Sub2) aHa_Sub2_6476).anInt5798;
        } else {
            i_304_ = (-(((ha_Sub2) aHa_Sub2_6476).anInt5935 * aShort6521 >> -289659224) + aShort6525 >> ((ha_Sub2) aHa_Sub2_6476).anInt5798);
            i_305_ = (-(aShort6543 * ((ha_Sub2) aHa_Sub2_6476).anInt5935 >> 621759336) + aShort6522 >> ((ha_Sub2) aHa_Sub2_6476).anInt5798);
        }
        int i_306_ = 1 + i_303_ - i;
        int i_307_ = -i_304_ + (i_305_ + 1);
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        r_Sub1 var_r_Sub1_308_;
        if (var_r_Sub1 == null || !var_r_Sub1.method2110(i_307_, -1, i_306_))
            var_r_Sub1_308_ = new r_Sub1(aHa_Sub2_6476, i_306_, i_307_);
        else {
            var_r_Sub1_308_ = var_r_Sub1;
            var_r_Sub1_308_.method2108(true);
        }
        var_r_Sub1_308_.method2109(i_303_, i, -111, i_305_, i_304_);
        method1472(var_r_Sub1_308_, 255);
        return var_r_Sub1_308_;
    }

    final void method1443(Viewport viewport, int i, boolean bool) {
        anInt6552++;
        if (aShortArray6442 != null) {
            int[] is = new int[3];
            for (int i_309_ = 0; (anInt6497 ^ 0xffffffff) < (i_309_ ^ 0xffffffff); i_309_++) {
                if ((i & aShortArray6442[i_309_]) != 0) {
                    if (bool)
                        viewport.method1875(anIntArray6531[i_309_], anIntArray6451[i_309_], anIntArray6468[i_309_], is);
                    else
                        viewport.method1865(anIntArray6531[i_309_], anIntArray6451[i_309_], anIntArray6468[i_309_], is);
                    anIntArray6531[i_309_] = is[0];
                    anIntArray6451[i_309_] = is[1];
                    anIntArray6468[i_309_] = is[2];
                }
            }
        }
    }

    final int ua() {
        anInt6550++;
        return anInt6515;
    }

    final Class40[] method1431() {
        anInt6464++;
        return aClass40Array6479;
    }

    final void method1442(Viewport viewport) {
        anInt6460++;
        Class238_Sub3 class238_sub3 = (Class238_Sub3) viewport;
        if (aClass40Array6479 != null) {
            for (int i = 0; aClass40Array6479.length > i; i++) {
                Class40 class40 = aClass40Array6479[i];
                Class40 class40_310_ = class40;
                if (((Class40) class40).aClass40_448 != null)
                    class40_310_ = ((Class40) class40).aClass40_448;
                ((Class40) class40_310_).anInt447 = (int) (((Class238_Sub3) class238_sub3).aFloat6780 + ((((Class238_Sub3) class238_sub3).aFloat6785 * (float) (anIntArray6468[((Class40) class40).anInt446])) + (((float) (anIntArray6531[((Class40) class40).anInt446]) * (((Class238_Sub3) class238_sub3).aFloat6794)) + ((float) (anIntArray6451[((Class40) class40).anInt446]) * (((Class238_Sub3) class238_sub3).aFloat6784)))));
                ((Class40) class40_310_).anInt458 = (int) (((Class238_Sub3) class238_sub3).aFloat6770 + ((((Class238_Sub3) class238_sub3).aFloat6786 * (float) (anIntArray6468[((Class40) class40).anInt446])) + (((float) (anIntArray6451[((Class40) class40).anInt446]) * (((Class238_Sub3) class238_sub3).aFloat6772)) + ((float) (anIntArray6531[((Class40) class40).anInt446]) * (((Class238_Sub3) class238_sub3).aFloat6761)))));
                ((Class40) class40_310_).anInt457 = (int) (((Class238_Sub3) class238_sub3).aFloat6797 + (((float) (anIntArray6468[((Class40) class40).anInt446]) * ((Class238_Sub3) class238_sub3).aFloat6793) + (((float) (anIntArray6531[((Class40) class40).anInt446]) * (((Class238_Sub3) class238_sub3).aFloat6775)) + ((((Class238_Sub3) class238_sub3).aFloat6791) * (float) (anIntArray6451[(((Class40) class40).anInt446)])))));
                ((Class40) class40_310_).anInt453 = (int) ((((Class238_Sub3) class238_sub3).aFloat6785 * (float) (anIntArray6468[((Class40) class40).anInt451])) + (((float) (anIntArray6531[((Class40) class40).anInt451]) * ((Class238_Sub3) class238_sub3).aFloat6794) + ((float) (anIntArray6451[((Class40) class40).anInt451]) * (((Class238_Sub3) class238_sub3).aFloat6784))) + ((Class238_Sub3) class238_sub3).aFloat6780);
                ((Class40) class40_310_).anInt452 = (int) (((Class238_Sub3) class238_sub3).aFloat6770 + ((((Class238_Sub3) class238_sub3).aFloat6786 * (float) (anIntArray6468[((Class40) class40).anInt451])) + ((((Class238_Sub3) class238_sub3).aFloat6772 * (float) (anIntArray6451[((Class40) class40).anInt451])) + ((((Class238_Sub3) class238_sub3).aFloat6761) * (float) (anIntArray6531[(((Class40) class40).anInt451)])))));
                ((Class40) class40_310_).anInt440 = (int) (((Class238_Sub3) class238_sub3).aFloat6797 + ((((Class238_Sub3) class238_sub3).aFloat6791 * (float) (anIntArray6451[((Class40) class40).anInt451])) + ((float) (anIntArray6531[((Class40) class40).anInt451]) * (((Class238_Sub3) class238_sub3).aFloat6775)) + (((Class238_Sub3) class238_sub3).aFloat6793 * (float) (anIntArray6468[(((Class40) class40).anInt451)]))));
                ((Class40) class40_310_).anInt439 = (int) ((((Class238_Sub3) class238_sub3).aFloat6785 * (float) (anIntArray6468[((Class40) class40).anInt456])) + ((((Class238_Sub3) class238_sub3).aFloat6794 * (float) (anIntArray6531[((Class40) class40).anInt456])) + (((Class238_Sub3) class238_sub3).aFloat6784 * (float) (anIntArray6451[((Class40) class40).anInt456]))) + ((Class238_Sub3) class238_sub3).aFloat6780);
                ((Class40) class40_310_).anInt441 = (int) (((Class238_Sub3) class238_sub3).aFloat6770 + ((((Class238_Sub3) class238_sub3).aFloat6772 * (float) (anIntArray6451[((Class40) class40).anInt456])) + (((Class238_Sub3) class238_sub3).aFloat6761 * (float) (anIntArray6531[((Class40) class40).anInt456])) + (((Class238_Sub3) class238_sub3).aFloat6786 * (float) (anIntArray6468[(((Class40) class40).anInt456)]))));
                ((Class40) class40_310_).anInt455 = (int) (((Class238_Sub3) class238_sub3).aFloat6797 + (((float) (anIntArray6468[((Class40) class40).anInt456]) * ((Class238_Sub3) class238_sub3).aFloat6793) + ((((Class238_Sub3) class238_sub3).aFloat6791 * (float) (anIntArray6451[((Class40) class40).anInt456])) + ((float) (anIntArray6531[((Class40) class40).anInt456]) * (((Class238_Sub3) class238_sub3).aFloat6775)))));
            }
        }
        if (aClass124Array6527 != null) {
            for (int i = 0; (aClass124Array6527.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                Class124 class124 = aClass124Array6527[i];
                Class124 class124_311_ = class124;
                if (((Class124) class124).aClass124_1531 != null)
                    class124_311_ = ((Class124) class124).aClass124_1531;
                if (((Class124) class124).aViewport_1533 != null)
                    ((Class124) class124).aViewport_1533.method1868(class238_sub3);
                else
                    ((Class124) class124).aViewport_1533 = class238_sub3.method1863();
                ((Class124) class124_311_).anInt1536 = (int) (((Class238_Sub3) class238_sub3).aFloat6780 + (((float) (anIntArray6468[((Class124) class124).anInt1529]) * ((Class238_Sub3) class238_sub3).aFloat6785) + (((float) (anIntArray6531[((Class124) class124).anInt1529]) * (((Class238_Sub3) class238_sub3).aFloat6794)) + ((((Class238_Sub3) class238_sub3).aFloat6784) * (float) (anIntArray6451[(((Class124) class124).anInt1529)])))));
                ((Class124) class124_311_).anInt1535 = (int) (((Class238_Sub3) class238_sub3).aFloat6770 + ((((Class238_Sub3) class238_sub3).aFloat6786 * (float) (anIntArray6468[((Class124) class124).anInt1529])) + (((float) (anIntArray6451[((Class124) class124).anInt1529]) * (((Class238_Sub3) class238_sub3).aFloat6772)) + ((((Class238_Sub3) class238_sub3).aFloat6761) * (float) (anIntArray6531[(((Class124) class124).anInt1529)])))));
                ((Class124) class124_311_).anInt1542 = (int) ((((Class238_Sub3) class238_sub3).aFloat6793 * (float) (anIntArray6468[((Class124) class124).anInt1529])) + ((((Class238_Sub3) class238_sub3).aFloat6791 * (float) (anIntArray6451[((Class124) class124).anInt1529])) + ((float) (anIntArray6531[((Class124) class124).anInt1529]) * (((Class238_Sub3) class238_sub3).aFloat6775))) + ((Class238_Sub3) class238_sub3).aFloat6797);
            }
        }
    }

    final int G() {
        anInt6547++;
        if (!aBoolean6539)
            method1475(29866);
        return aShort6522;
    }

    private final short method1471(int i, int i_312_, byte i_313_, float f, Class343 class343, int i_314_, int i_315_, long l, float f_316_, int i_317_) {
        anInt6549++;
        int i_318_ = anIntArray6458[i_315_];
        int i_319_ = anIntArray6458[i_315_ - -1];
        int i_320_ = 0;
        for (int i_321_ = i_318_; i_319_ > i_321_; i_321_++) {
            short i_322_ = aShortArray6516[i_321_];
            if (i_322_ == 0) {
                i_320_ = i_321_;
                break;
            }
            if (Class142.aLongArray1673[i_321_] == l)
                return (short) (i_322_ - 1);
        }
        aShortArray6516[i_320_] = (short) (1 + anInt6455);
        if (i_313_ != 98)
            method1438(-49, null, -123, -74, -97, -16, true);
        Class142.aLongArray1673[i_320_] = l;
        aShortArray6554[anInt6455] = (short) i_317_;
        aShortArray6556[anInt6455] = (short) i_312_;
        aShortArray6510[anInt6455] = (short) i;
        aByteArray6490[anInt6455] = (byte) i_314_;
        aFloatArray6501[anInt6455] = f;
        aFloatArray6469[anInt6455] = f_316_;
        return (short) anInt6455++;
    }

    final void method1425() {
        anInt6485++;
    }

    private final void method1472(r_Sub1 var_r_Sub1, int i) {
        if (anInt6455 > ((ha_Sub2) aHa_Sub2_6476).anIntArray5950.length) {
            ((ha_Sub2) aHa_Sub2_6476).anIntArray5947 = new int[anInt6455];
            ((ha_Sub2) aHa_Sub2_6476).anIntArray5950 = new int[anInt6455];
        }
        anInt6505++;
        int[] is = ((ha_Sub2) aHa_Sub2_6476).anIntArray5950;
        int[] is_323_ = ((ha_Sub2) aHa_Sub2_6476).anIntArray5947;
        for (int i_324_ = 0; (i_324_ ^ 0xffffffff) > (anInt6497 ^ 0xffffffff); i_324_++) {
            int i_325_ = ((-((((ha_Sub2) aHa_Sub2_6476).anInt5862 * anIntArray6451[i_324_]) >> -2139503608) + anIntArray6531[i_324_] >> ((ha_Sub2) aHa_Sub2_6476).anInt5798) - ((r_Sub1) var_r_Sub1).anInt10264);
            int i_326_ = (-((r_Sub1) var_r_Sub1).anInt10261 + ((anIntArray6468[i_324_] + -((anIntArray6451[i_324_] * ((ha_Sub2) aHa_Sub2_6476).anInt5935) >> -1224323320)) >> ((ha_Sub2) aHa_Sub2_6476).anInt5798));
            int i_327_ = anIntArray6458[i_324_];
            int i_328_ = anIntArray6458[i_324_ + 1];
            for (int i_329_ = i_327_; (i_329_ ^ 0xffffffff) > (i_328_ ^ 0xffffffff); i_329_++) {
                int i_330_ = aShortArray6516[i_329_] + -1;
                if ((i_330_ ^ 0xffffffff) == 0)
                    break;
                is[i_330_] = i_325_;
                is_323_[i_330_] = i_326_;
            }
        }
        for (int i_331_ = 0; (anInt6439 ^ 0xffffffff) < (i_331_ ^ 0xffffffff); i_331_++) {
            if (aByteArray6473 == null || aByteArray6473[i_331_] <= 128) {
                short i_332_ = aShortArray6462[i_331_];
                short i_333_ = aShortArray6524[i_331_];
                short i_334_ = aShortArray6445[i_331_];
                int i_335_ = is[i_332_];
                int i_336_ = is[i_333_];
                int i_337_ = is[i_334_];
                int i_338_ = is_323_[i_332_];
                int i_339_ = is_323_[i_333_];
                int i_340_ = is_323_[i_334_];
                if ((-((i_339_ + -i_338_) * (-i_336_ + i_337_)) + (-i_336_ + i_335_) * (-i_340_ + i_339_)) > 0)
                    var_r_Sub1.method2107(i_336_, i_338_, -2745, i_335_, i_340_, i_337_, i_339_);
            }
        }
        if (i != 255)
            aShort6508 = (short) 71;
    }

    private final void method1473(int i, boolean bool) {
        anInt6499++;
        boolean bool_341_ = (aClass140_6450 != null && ((Class140) aClass140_6450).anInterface6_1662 == null);
        boolean bool_342_ = (aClass140_6491 != null && ((Class140) aClass140_6491).anInterface6_1662 == null);
        boolean bool_343_ = (aClass140_6504 != null && ((Class140) aClass140_6504).anInterface6_1662 == null);
        boolean bool_344_ = (aClass140_6544 != null && ((Class140) aClass140_6544).anInterface6_1662 == null);
        if (bool) {
            bool_343_ = bool_343_ & (aByte6500 & 0x1) != 0;
            bool_342_ = bool_342_ & (0x4 & aByte6500) != 0;
            bool_341_ = bool_341_ & (aByte6500 & 0x2 ^ 0xffffffff) != -1;
            bool_344_ = bool_344_ & (aByte6500 & 0x8 ^ 0xffffffff) != -1;
        }
        byte i_345_ = 0;
        byte i_346_ = 0;
        byte i_347_ = 0;
        byte i_348_ = 0;
        byte i_349_ = 0;
        if (bool_343_) {
            i_346_ = i_345_;
            i_345_ += 12;
        }
        if (bool_341_) {
            i_347_ = i_345_;
            i_345_ += 4;
        }
        if (bool_342_) {
            i_348_ = i_345_;
            i_345_ += 12;
        }
        if (bool_344_) {
            i_349_ = i_345_;
            i_345_ += 8;
        }
        if (i_345_ != 0) {
            if ((((ByteStream) ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845).buffer).length >= anInt6455 * i_345_)
                ((ByteStream) ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845).offset = 0;
            else
                ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845 = new Node_Sub9_Sub1((anInt6455 + 100) * i_345_);
            Node_Sub9_Sub1 class248_sub9_sub1 = ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845;
            if (bool_343_) {
                if (((ha_Sub2) aHa_Sub2_6476).aBoolean5872) {
                    for (int i_350_ = 0; i_350_ < anInt6497; i_350_++) {
                        int i_351_ = Stream.floatToRawIntBits((float) anIntArray6531[i_350_]);
                        int i_352_ = Stream.floatToRawIntBits((float) anIntArray6451[i_350_]);
                        int i_353_ = Stream.floatToRawIntBits((float) anIntArray6468[i_350_]);
                        int i_354_ = anIntArray6458[i_350_];
                        int i_355_ = anIntArray6458[1 + i_350_];
                        for (int i_356_ = i_354_; i_356_ < i_355_; i_356_++) {
                            int i_357_ = aShortArray6516[i_356_] - 1;
                            if (i_357_ == -1)
                                break;
                            ((ByteStream) class248_sub9_sub1).offset = i_357_ * i_345_;
                            class248_sub9_sub1.writeInt(27695, i_351_);
                            class248_sub9_sub1.writeInt(27695, i_352_);
                            class248_sub9_sub1.writeInt(27695, i_353_);
                        }
                    }
                } else {
                    for (int i_358_ = 0; (anInt6497 ^ 0xffffffff) < (i_358_ ^ 0xffffffff); i_358_++) {
                        int i_359_ = Stream.floatToRawIntBits((float) anIntArray6531[i_358_]);
                        int i_360_ = Stream.floatToRawIntBits((float) anIntArray6451[i_358_]);
                        int i_361_ = Stream.floatToRawIntBits((float) anIntArray6468[i_358_]);
                        int i_362_ = anIntArray6458[i_358_];
                        int i_363_ = anIntArray6458[1 + i_358_];
                        for (int i_364_ = i_362_; (i_363_ ^ 0xffffffff) < (i_364_ ^ 0xffffffff); i_364_++) {
                            int i_365_ = aShortArray6516[i_364_] + -1;
                            if (i_365_ == -1)
                                break;
                            ((ByteStream) class248_sub9_sub1).offset = i_365_ * i_345_;
                            class248_sub9_sub1.writeLEInt_(i_359_, i + -118);
                            class248_sub9_sub1.writeLEInt_(i_360_, -93);
                            class248_sub9_sub1.writeLEInt_(i_361_, -103);
                        }
                    }
                }
            }
            if (bool_341_) {
                if (aClass140_6491 == null) {
                    short[] is;
                    short[] is_366_;
                    byte[] is_367_;
                    short[] is_368_;
                    if (aClass242_6518 == null) {
                        is_367_ = aByteArray6490;
                        is = aShortArray6554;
                        is_368_ = aShortArray6556;
                        is_366_ = aShortArray6510;
                    } else {
                        is = ((Class242) aClass242_6518).aShortArray2697;
                        is_366_ = ((Class242) aClass242_6518).aShortArray2696;
                        is_367_ = ((Class242) aClass242_6518).aByteArray2695;
                        is_368_ = ((Class242) aClass242_6518).aShortArray2698;
                    }
                    float f = ((ha_Sub2) aHa_Sub2_6476).aFloatArray5838[0];
                    float f_369_ = ((ha_Sub2) aHa_Sub2_6476).aFloatArray5838[1];
                    float f_370_ = ((ha_Sub2) aHa_Sub2_6476).aFloatArray5838[2];
                    float f_371_ = ((ha_Sub2) aHa_Sub2_6476).aFloat5878;
                    float f_372_ = (768.0F * ((ha_Sub2) aHa_Sub2_6476).aFloat5840 / (float) aShort6488);
                    float f_373_ = (((ha_Sub2) aHa_Sub2_6476).aFloat5846 * 768.0F / (float) aShort6488);
                    for (int i_374_ = 0; (anInt6454 ^ 0xffffffff) < (i_374_ ^ 0xffffffff); i_374_++) {
                        int i_375_ = method1479(aShortArray6535[i_374_], aShortArray6437[i_374_], aShort6496, aByteArray6473[i_374_], 6);
                        float f_376_ = ((float) (i_375_ >>> 1709651416) * ((ha_Sub2) aHa_Sub2_6476).aFloat5884);
                        float f_377_ = ((float) ((0xff2f & i_375_) >> -616482552) * ((ha_Sub2) aHa_Sub2_6476).aFloat5893);
                        int i_378_ = aShortArray6462[i_374_];
                        float f_379_ = ((float) (i_375_ >> 1069861360 & 0xff) * ((ha_Sub2) aHa_Sub2_6476).aFloat5867);
                        short i_380_ = (short) is_367_[i_378_];
                        float f_381_;
                        if ((i_380_ ^ 0xffffffff) == -1)
                            f_381_ = ((f_370_ * (float) is_366_[i_378_] + ((float) is_368_[i_378_] * f_369_ + f * (float) is[i_378_])) * 0.0026041667F);
                        else
                            f_381_ = ((f_369_ * (float) is_368_[i_378_] + (float) is[i_378_] * f + (float) is_366_[i_378_] * f_370_) / (float) (256 * i_380_));
                        float f_382_ = (f_381_ * (f_381_ < 0.0F ? f_373_ : f_372_) + f_371_);
                        int i_383_ = (int) (f_382_ * f_376_);
                        int i_384_ = (int) (f_379_ * f_382_);
                        if (i_383_ < 0)
                            i_383_ = 0;
                        else if (i_383_ > 255)
                            i_383_ = 255;
                        int i_385_ = (int) (f_377_ * f_382_);
                        if (i_384_ >= 0) {
                            if ((i_384_ ^ 0xffffffff) < -256)
                                i_384_ = 255;
                        } else
                            i_384_ = 0;
                        if (i_385_ < 0)
                            i_385_ = 0;
                        else if ((i_385_ ^ 0xffffffff) < -256)
                            i_385_ = 255;
                        ((ByteStream) class248_sub9_sub1).offset = i_345_ * i_378_ + i_347_;
                        class248_sub9_sub1.writeByte(-35, i_383_);
                        class248_sub9_sub1.writeByte(-27, i_384_);
                        class248_sub9_sub1.writeByte(-111, i_385_);
                        class248_sub9_sub1.writeByte(-98, -(aByteArray6473[i_374_] & 0xff) + 255);
                        i_378_ = aShortArray6524[i_374_];
                        i_380_ = (short) is_367_[i_378_];
                        if (i_380_ == 0)
                            f_381_ = ((f_369_ * (float) is_368_[i_378_] + (float) is[i_378_] * f + f_370_ * (float) is_366_[i_378_]) * 0.0026041667F);
                        else
                            f_381_ = (((float) is_366_[i_378_] * f_370_ + ((float) is_368_[i_378_] * f_369_ + (float) is[i_378_] * f)) / (float) (256 * i_380_));
                        f_382_ = (f_381_ * (f_381_ < 0.0F ? f_373_ : f_372_) + f_371_);
                        i_383_ = (int) (f_382_ * f_376_);
                        i_384_ = (int) (f_382_ * f_379_);
                        if ((i_383_ ^ 0xffffffff) > -1)
                            i_383_ = 0;
                        else if (i_383_ > 255)
                            i_383_ = 255;
                        i_385_ = (int) (f_382_ * f_377_);
                        if (i_384_ < 0)
                            i_384_ = 0;
                        else if (i_384_ > 255)
                            i_384_ = 255;
                        if ((i_385_ ^ 0xffffffff) > -1)
                            i_385_ = 0;
                        else if (i_385_ > 255)
                            i_385_ = 255;
                        ((ByteStream) class248_sub9_sub1).offset = i_345_ * i_378_ + i_347_;
                        class248_sub9_sub1.writeByte(-95, i_383_);
                        class248_sub9_sub1.writeByte(-54, i_384_);
                        class248_sub9_sub1.writeByte(i ^ ~0x57, i_385_);
                        class248_sub9_sub1.writeByte(-118, -(aByteArray6473[i_374_] & 0xff) + 255);
                        i_378_ = aShortArray6445[i_374_];
                        i_380_ = (short) is_367_[i_378_];
                        if ((i_380_ ^ 0xffffffff) == -1)
                            f_381_ = (0.0026041667F * ((float) is_366_[i_378_] * f_370_ + ((float) is[i_378_] * f + (float) is_368_[i_378_] * f_369_)));
                        else
                            f_381_ = ((f_370_ * (float) is_366_[i_378_] + (f_369_ * (float) is_368_[i_378_] + (float) is[i_378_] * f)) / (float) (256 * i_380_));
                        f_382_ = f_371_ + f_381_ * (f_381_ < 0.0F ? f_373_ : f_372_);
                        i_383_ = (int) (f_382_ * f_376_);
                        if ((i_383_ ^ 0xffffffff) <= -1) {
                            if (i_383_ > 255)
                                i_383_ = 255;
                        } else
                            i_383_ = 0;
                        i_384_ = (int) (f_379_ * f_382_);
                        i_385_ = (int) (f_377_ * f_382_);
                        if ((i_384_ ^ 0xffffffff) > -1)
                            i_384_ = 0;
                        else if (i_384_ > 255)
                            i_384_ = 255;
                        if ((i_385_ ^ 0xffffffff) > -1)
                            i_385_ = 0;
                        else if (i_385_ > 255)
                            i_385_ = 255;
                        ((ByteStream) class248_sub9_sub1).offset = i_347_ - -(i_345_ * i_378_);
                        class248_sub9_sub1.writeByte(-128, i_383_);
                        class248_sub9_sub1.writeByte(-93, i_384_);
                        class248_sub9_sub1.writeByte(i ^ ~0x4f, i_385_);
                        class248_sub9_sub1.writeByte(i ^ ~0x35, -(aByteArray6473[i_374_] & 0xff) + 255);
                    }
                } else {
                    for (int i_386_ = 0; (anInt6454 ^ 0xffffffff) < (i_386_ ^ 0xffffffff); i_386_++) {
                        int i_387_ = method1479(aShortArray6535[i_386_], aShortArray6437[i_386_], aShort6496, aByteArray6473[i_386_], i + 6);
                        ((ByteStream) class248_sub9_sub1).offset = aShortArray6462[i_386_] * i_345_ + i_347_;
                        class248_sub9_sub1.writeInt(27695, i_387_);
                        ((ByteStream) class248_sub9_sub1).offset = i_347_ - -(aShortArray6524[i_386_] * i_345_);
                        class248_sub9_sub1.writeInt(27695, i_387_);
                        ((ByteStream) class248_sub9_sub1).offset = i_347_ + aShortArray6445[i_386_] * i_345_;
                        class248_sub9_sub1.writeInt(27695, i_387_);
                    }
                }
            }
            if (bool_342_) {
                short[] is;
                short[] is_388_;
                short[] is_389_;
                byte[] is_390_;
                if (aClass242_6518 == null) {
                    is = aShortArray6554;
                    is_388_ = aShortArray6556;
                    is_389_ = aShortArray6510;
                    is_390_ = aByteArray6490;
                } else {
                    is = ((Class242) aClass242_6518).aShortArray2697;
                    is_388_ = ((Class242) aClass242_6518).aShortArray2698;
                    is_389_ = ((Class242) aClass242_6518).aShortArray2696;
                    is_390_ = ((Class242) aClass242_6518).aByteArray2695;
                }
                float f = 3.0F / (float) aShort6488;
                float f_391_ = 3.0F / (float) (aShort6488 / 2 + aShort6488);
                ((ByteStream) class248_sub9_sub1).offset = i_348_;
                if (!((ha_Sub2) aHa_Sub2_6476).aBoolean5872) {
                    for (int i_392_ = 0; (i_392_ ^ 0xffffffff) > (anInt6455 ^ 0xffffffff); i_392_++) {
                        int i_393_ = 0xff & is_390_[i_392_];
                        if ((i_393_ ^ 0xffffffff) == -1) {
                            class248_sub9_sub1.method2225(i + 4440, ((float) is[i_392_] * f_391_));
                            class248_sub9_sub1.method2225(4440, ((float) (is_388_[i_392_]) * f_391_));
                            class248_sub9_sub1.method2225(4440, ((float) (is_389_[i_392_]) * f_391_));
                        } else {
                            float f_394_ = f / (float) i_393_;
                            class248_sub9_sub1.method2225(i ^ 0x1158, f_394_ * (float) is[i_392_]);
                            class248_sub9_sub1.method2225(i ^ 0x1158, ((float) (is_388_[i_392_]) * f_394_));
                            class248_sub9_sub1.method2225(4440, ((float) (is_389_[i_392_]) * f_394_));
                        }
                        ((ByteStream) class248_sub9_sub1).offset += i_345_ + -12;
                    }
                } else {
                    for (int i_395_ = 0; (i_395_ ^ 0xffffffff) > (anInt6455 ^ 0xffffffff); i_395_++) {
                        int i_396_ = 0xff & is_390_[i_395_];
                        if (i_396_ != 0) {
                            float f_397_ = f / (float) i_396_;
                            class248_sub9_sub1.method2226(47, f_397_ * (float) is[i_395_]);
                            class248_sub9_sub1.method2226(102, ((float) (is_388_[i_395_]) * f_397_));
                            class248_sub9_sub1.method2226(37, ((float) (is_389_[i_395_]) * f_397_));
                        } else {
                            class248_sub9_sub1.method2226(50, (float) is[i_395_] * f_391_);
                            class248_sub9_sub1.method2226(i ^ 0x7b, ((float) (is_388_[i_395_]) * f_391_));
                            class248_sub9_sub1.method2226(i ^ 0x22, f_391_ * (float) is_389_[i_395_]);
                        }
                        ((ByteStream) class248_sub9_sub1).offset += i_345_ - 12;
                    }
                }
            }
            if (bool_344_) {
                ((ByteStream) class248_sub9_sub1).offset = i_349_;
                if (!((ha_Sub2) aHa_Sub2_6476).aBoolean5872) {
                    for (int i_398_ = 0; anInt6455 > i_398_; i_398_++) {
                        class248_sub9_sub1.method2225(4440, aFloatArray6501[i_398_]);
                        class248_sub9_sub1.method2225(4440, aFloatArray6469[i_398_]);
                        ((ByteStream) class248_sub9_sub1).offset += -8 + i_345_;
                    }
                } else {
                    for (int i_399_ = 0; i_399_ < anInt6455; i_399_++) {
                        class248_sub9_sub1.method2226(92, aFloatArray6501[i_399_]);
                        class248_sub9_sub1.method2226(36, aFloatArray6469[i_399_]);
                        ((ByteStream) class248_sub9_sub1).offset += i_345_ - 8;
                    }
                }
            }
            if (i == 0) {
                ((ByteStream) class248_sub9_sub1).offset = i_345_ * anInt6455;
                Interface6 interface6;
                if (!bool) {
                    interface6 = aHa_Sub2_6476.method869((byte) 107, (((ByteStream) class248_sub9_sub1).offset), false, i_345_, (((ByteStream) class248_sub9_sub1).buffer));
                    aBoolean6477 = true;
                } else {
                    if (anInterface6_6489 != null)
                        anInterface6_6489.method19((byte) 77, ((ByteStream) class248_sub9_sub1).offset, i_345_, (((ByteStream) class248_sub9_sub1).buffer));
                    else
                        anInterface6_6489 = aHa_Sub2_6476.method869((byte) 108, (((ByteStream) class248_sub9_sub1).offset), true, i_345_, (((ByteStream) class248_sub9_sub1).buffer));
                    interface6 = anInterface6_6489;
                    aByte6500 = (byte) 0;
                }
                if (bool_343_) {
                    ((Class140) aClass140_6504).aByte1664 = i_346_;
                    ((Class140) aClass140_6504).anInterface6_1662 = interface6;
                }
                if (bool_344_) {
                    ((Class140) aClass140_6544).anInterface6_1662 = interface6;
                    ((Class140) aClass140_6544).aByte1664 = i_349_;
                }
                if (bool_341_) {
                    ((Class140) aClass140_6450).aByte1664 = i_347_;
                    ((Class140) aClass140_6450).anInterface6_1662 = interface6;
                }
                if (bool_342_) {
                    ((Class140) aClass140_6491).aByte1664 = i_348_;
                    ((Class140) aClass140_6491).anInterface6_1662 = interface6;
                }
            }
        }
    }

    final void C(int i) {
        if (aClass140_6450 != null)
            ((Class140) aClass140_6450).anInterface6_1662 = null;
        anInt6519++;
        aShort6496 = (short) i;
    }

    private final void method1474(int i) {
        anInt6558++;
        if ((anInt6439 ^ 0xffffffff) != -1) {
            if (aByte6500 != 0)
                method1473(0, true);
            method1473(i ^ i, false);
            if (aClass352_6463 != null) {
                if (((Class352) aClass352_6463).anInterface1_4185 == null)
                    method1477(11297, (aByte6500 & 0x10) != 0);
                if (((Class352) aClass352_6463).anInterface1_4185 != null) {
                    aHa_Sub2_6476.method878(aClass140_6491 != null, -119);
                    aHa_Sub2_6476.method843(32886, aClass140_6544, aClass140_6504, aClass140_6491, aClass140_6450);
                    int i_400_ = anIntArray6466.length + -1;
                    for (int i_401_ = 0; (i_400_ ^ 0xffffffff) < (i_401_ ^ 0xffffffff); i_401_++) {
                        int i_402_ = anIntArray6466[i_401_];
                        int i_403_ = anIntArray6466[i_401_ + 1];
                        int i_404_ = 0xffff & aShortArray6437[i_402_];
                        if (i_404_ == 65535)
                            i_404_ = -1;
                        aHa_Sub2_6476.method907(i_404_, aClass140_6491 != null, 37922160);
                        aHa_Sub2_6476.method897((((Class352) aClass352_6463).anInterface1_4185), i_402_ * 3, (byte) -92, 4, (i_403_ + -i_402_) * 3);
                    }
                }
            }
            method1468((byte) -78);
        }
    }

    final void FA(int i) {
        anInt6509++;
        int i_405_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_406_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_407_ = 0; (i_407_ ^ 0xffffffff) > (anInt6497 ^ 0xffffffff); i_407_++) {
            int i_408_ = ((anIntArray6451[i_407_] * i_406_ - anIntArray6468[i_407_] * i_405_) >> -829731282);
            anIntArray6468[i_407_] = (anIntArray6451[i_407_] * i_405_ - -(i_406_ * anIntArray6468[i_407_])) >> -299382418;
            anIntArray6451[i_407_] = i_408_;
        }
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
        aBoolean6539 = false;
    }

    final void O(int i, int i_409_, int i_410_) {
        anInt6514++;
        for (int i_411_ = 0; i_411_ < anInt6497; i_411_++) {
            if (i != 128)
                anIntArray6531[i_411_] = i * anIntArray6531[i_411_] >> -2062836761;
            if ((i_409_ ^ 0xffffffff) != -129)
                anIntArray6451[i_411_] = anIntArray6451[i_411_] * i_409_ >> 1944312295;
            if (i_410_ != 128)
                anIntArray6468[i_411_] = i_410_ * anIntArray6468[i_411_] >> 378149543;
        }
        aBoolean6539 = false;
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
    }

    final boolean NA() {
        anInt6520++;
        if (anIntArrayArray6481 == null)
            return false;
        for (int i = 0; (anInt6449 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
            anIntArray6531[i] <<= 4;
            anIntArray6451[i] <<= 4;
            anIntArray6468[i] <<= 4;
        }
        Node_Sub14_Sub25.anInt9422 = 0;
        Node_Sub14_Sub29.anInt9468 = 0;
        Class301_Sub2.anInt8435 = 0;
        return true;
    }

    final void a(int i) {
        anInt6528++;
        int i_412_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_413_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_414_ = 0; (anInt6497 ^ 0xffffffff) < (i_414_ ^ 0xffffffff); i_414_++) {
            int i_415_ = ((anIntArray6468[i_414_] * i_412_ - -(i_413_ * anIntArray6531[i_414_])) >> 740189518);
            anIntArray6468[i_414_] = (i_413_ * anIntArray6468[i_414_] - i_412_ * anIntArray6531[i_414_]) >> 336611950;
            anIntArray6531[i_414_] = i_415_;
        }
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
        aBoolean6539 = false;
    }

    final void method1438(int i, int[] is, int i_416_, int i_417_, int i_418_, int i_419_, boolean bool) {
        anInt6494++;
        int i_420_ = is.length;
        if ((i ^ 0xffffffff) == -1) {
            i_416_ <<= 4;
            i_418_ <<= 4;
            i_417_ <<= 4;
            Node_Sub14_Sub25.anInt9422 = 0;
            Node_Sub14_Sub29.anInt9468 = 0;
            int i_421_ = 0;
            Class301_Sub2.anInt8435 = 0;
            for (int i_422_ = 0; (i_422_ ^ 0xffffffff) > (i_420_ ^ 0xffffffff); i_422_++) {
                int i_423_ = is[i_422_];
                if (i_423_ < anIntArrayArray6481.length) {
                    int[] is_424_ = anIntArrayArray6481[i_423_];
                    for (int i_425_ = 0; (is_424_.length ^ 0xffffffff) < (i_425_ ^ 0xffffffff); i_425_++) {
                        int i_426_ = is_424_[i_425_];
                        Node_Sub14_Sub29.anInt9468 += anIntArray6531[i_426_];
                        Node_Sub14_Sub25.anInt9422 += anIntArray6451[i_426_];
                        Class301_Sub2.anInt8435 += anIntArray6468[i_426_];
                        i_421_++;
                    }
                }
            }
            if ((i_421_ ^ 0xffffffff) < -1) {
                Class301_Sub2.anInt8435 = Class301_Sub2.anInt8435 / i_421_ + i_418_;
                Node_Sub14_Sub29.anInt9468 = Node_Sub14_Sub29.anInt9468 / i_421_ - -i_416_;
                Node_Sub14_Sub25.anInt9422 = Node_Sub14_Sub25.anInt9422 / i_421_ + i_417_;
            } else {
                Node_Sub14_Sub29.anInt9468 = i_416_;
                Class301_Sub2.anInt8435 = i_418_;
                Node_Sub14_Sub25.anInt9422 = i_417_;
            }
        } else if ((i ^ 0xffffffff) == -2) {
            i_416_ <<= 4;
            i_417_ <<= 4;
            i_418_ <<= 4;
            for (int i_427_ = 0; i_420_ > i_427_; i_427_++) {
                int i_428_ = is[i_427_];
                if (i_428_ < anIntArrayArray6481.length) {
                    int[] is_429_ = anIntArrayArray6481[i_428_];
                    for (int i_430_ = 0; (i_430_ ^ 0xffffffff) > (is_429_.length ^ 0xffffffff); i_430_++) {
                        int i_431_ = is_429_[i_430_];
                        anIntArray6531[i_431_] += i_416_;
                        anIntArray6451[i_431_] += i_417_;
                        anIntArray6468[i_431_] += i_418_;
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -3) {
            for (int i_432_ = 0; (i_420_ ^ 0xffffffff) < (i_432_ ^ 0xffffffff); i_432_++) {
                int i_433_ = is[i_432_];
                if ((i_433_ ^ 0xffffffff) > (anIntArrayArray6481.length ^ 0xffffffff)) {
                    int[] is_434_ = anIntArrayArray6481[i_433_];
                    if ((0x1 & i_419_) != 0) {
                        for (int i_435_ = 0; ((is_434_.length ^ 0xffffffff) < (i_435_ ^ 0xffffffff)); i_435_++) {
                            int i_436_ = is_434_[i_435_];
                            anIntArray6531[i_436_] -= Node_Sub14_Sub29.anInt9468;
                            anIntArray6451[i_436_] -= Node_Sub14_Sub25.anInt9422;
                            anIntArray6468[i_436_] -= Class301_Sub2.anInt8435;
                            if ((i_416_ ^ 0xffffffff) != -1) {
                                int i_437_ = (Node_Sub9_Sub1.anIntArray9106[i_416_]);
                                int i_438_ = (Node_Sub9_Sub1.anIntArray9109[i_416_]);
                                int i_439_ = ((i_438_ * anIntArray6451[i_436_] + -(i_437_ * anIntArray6468[i_436_]) - -16383) >> -633088370);
                                anIntArray6468[i_436_] = 16383 + (anIntArray6468[i_436_] * i_438_ + (anIntArray6451[i_436_] * i_437_)) >> -43707954;
                                anIntArray6451[i_436_] = i_439_;
                            }
                            if ((i_418_ ^ 0xffffffff) != -1) {
                                int i_440_ = (Node_Sub9_Sub1.anIntArray9106[i_418_]);
                                int i_441_ = (Node_Sub9_Sub1.anIntArray9109[i_418_]);
                                int i_442_ = (anIntArray6531[i_436_] * i_441_ + anIntArray6451[i_436_] * i_440_ - -16383) >> -1675049298;
                                anIntArray6451[i_436_] = ((16383 + anIntArray6451[i_436_] * i_441_ + -(i_440_ * anIntArray6531[i_436_])) >> 1570706190);
                                anIntArray6531[i_436_] = i_442_;
                            }
                            if ((i_417_ ^ 0xffffffff) != -1) {
                                int i_443_ = (Node_Sub9_Sub1.anIntArray9106[i_417_]);
                                int i_444_ = (Node_Sub9_Sub1.anIntArray9109[i_417_]);
                                int i_445_ = ((i_443_ * anIntArray6468[i_436_] - -(anIntArray6531[i_436_] * i_444_) + 16383) >> 1132206350);
                                anIntArray6468[i_436_] = (i_444_ * anIntArray6468[i_436_] - (anIntArray6531[i_436_] * i_443_ + -16383)) >> -1525547410;
                                anIntArray6531[i_436_] = i_445_;
                            }
                            anIntArray6531[i_436_] += Node_Sub14_Sub29.anInt9468;
                            anIntArray6451[i_436_] += Node_Sub14_Sub25.anInt9422;
                            anIntArray6468[i_436_] += Class301_Sub2.anInt8435;
                        }
                    } else {
                        for (int i_446_ = 0; ((is_434_.length ^ 0xffffffff) < (i_446_ ^ 0xffffffff)); i_446_++) {
                            int i_447_ = is_434_[i_446_];
                            anIntArray6531[i_447_] -= Node_Sub14_Sub29.anInt9468;
                            anIntArray6451[i_447_] -= Node_Sub14_Sub25.anInt9422;
                            anIntArray6468[i_447_] -= Class301_Sub2.anInt8435;
                            if (i_418_ != 0) {
                                int i_448_ = (Node_Sub9_Sub1.anIntArray9106[i_418_]);
                                int i_449_ = (Node_Sub9_Sub1.anIntArray9109[i_418_]);
                                int i_450_ = ((16383 + (anIntArray6531[i_447_] * i_449_ + i_448_ * anIntArray6451[i_447_])) >> -524021586);
                                anIntArray6451[i_447_] = ((16383 + -(i_448_ * anIntArray6531[i_447_]) + i_449_ * anIntArray6451[i_447_]) >> -1472393330);
                                anIntArray6531[i_447_] = i_450_;
                            }
                            if (i_416_ != 0) {
                                int i_451_ = (Node_Sub9_Sub1.anIntArray9106[i_416_]);
                                int i_452_ = (Node_Sub9_Sub1.anIntArray9109[i_416_]);
                                int i_453_ = ((-(i_451_ * anIntArray6468[i_447_]) + (anIntArray6451[i_447_] * i_452_ - -16383)) >> 221147566);
                                anIntArray6468[i_447_] = 16383 + (i_451_ * anIntArray6451[i_447_] + (anIntArray6468[i_447_] * i_452_)) >> -1306551634;
                                anIntArray6451[i_447_] = i_453_;
                            }
                            if ((i_417_ ^ 0xffffffff) != -1) {
                                int i_454_ = (Node_Sub9_Sub1.anIntArray9106[i_417_]);
                                int i_455_ = (Node_Sub9_Sub1.anIntArray9109[i_417_]);
                                int i_456_ = ((16383 + anIntArray6468[i_447_] * i_454_ - -(anIntArray6531[i_447_] * i_455_)) >> 728508430);
                                anIntArray6468[i_447_] = (-(i_454_ * anIntArray6531[i_447_]) + (i_455_ * anIntArray6468[i_447_] + 16383)) >> -882498546;
                                anIntArray6531[i_447_] = i_456_;
                            }
                            anIntArray6531[i_447_] += Node_Sub14_Sub29.anInt9468;
                            anIntArray6451[i_447_] += Node_Sub14_Sub25.anInt9422;
                            anIntArray6468[i_447_] += Class301_Sub2.anInt8435;
                        }
                    }
                }
            }
            if (bool) {
                for (int i_457_ = 0; i_457_ < i_420_; i_457_++) {
                    int i_458_ = is[i_457_];
                    if ((anIntArrayArray6481.length ^ 0xffffffff) < (i_458_ ^ 0xffffffff)) {
                        int[] is_459_ = anIntArrayArray6481[i_458_];
                        for (int i_460_ = 0; is_459_.length > i_460_; i_460_++) {
                            int i_461_ = is_459_[i_460_];
                            int i_462_ = anIntArray6458[i_461_];
                            int i_463_ = anIntArray6458[i_461_ + 1];
                            for (int i_464_ = i_462_; (i_464_ ^ 0xffffffff) > (i_463_ ^ 0xffffffff); i_464_++) {
                                int i_465_ = -1 + aShortArray6516[i_464_];
                                if ((i_465_ ^ 0xffffffff) == 0)
                                    break;
                                if (i_418_ != 0) {
                                    int i_466_ = (Node_Sub9_Sub1.anIntArray9106[i_418_]);
                                    int i_467_ = (Node_Sub9_Sub1.anIntArray9109[i_418_]);
                                    int i_468_ = ((aShortArray6554[i_465_] * i_467_ + (aShortArray6556[i_465_] * i_466_ + 16383)) >> -1101501074);
                                    aShortArray6556[i_465_] = (short) ((-(aShortArray6554[i_465_] * i_466_) + ((i_467_ * (aShortArray6556[i_465_])) - -16383)) >> -659297938);
                                    aShortArray6554[i_465_] = (short) i_468_;
                                }
                                if ((i_416_ ^ 0xffffffff) != -1) {
                                    int i_469_ = (Node_Sub9_Sub1.anIntArray9106[i_416_]);
                                    int i_470_ = (Node_Sub9_Sub1.anIntArray9109[i_416_]);
                                    int i_471_ = ((-(i_469_ * aShortArray6510[i_465_]) + aShortArray6556[i_465_] * i_470_ - -16383) >> 125979630);
                                    aShortArray6510[i_465_] = (short) (16383 + ((i_470_ * (aShortArray6510[i_465_])) + ((aShortArray6556[i_465_]) * i_469_)) >> -370693586);
                                    aShortArray6556[i_465_] = (short) i_471_;
                                }
                                if ((i_417_ ^ 0xffffffff) != -1) {
                                    int i_472_ = (Node_Sub9_Sub1.anIntArray9106[i_417_]);
                                    int i_473_ = (Node_Sub9_Sub1.anIntArray9109[i_417_]);
                                    int i_474_ = ((16383 + aShortArray6510[i_465_] * i_472_ + aShortArray6554[i_465_] * i_473_) >> 668722382);
                                    aShortArray6510[i_465_] = (short) ((16383 + -(aShortArray6554[i_465_] * i_472_) + (aShortArray6510[i_465_] * i_473_)) >> 1135913678);
                                    aShortArray6554[i_465_] = (short) i_474_;
                                }
                            }
                        }
                    }
                }
                if (aClass140_6491 == null && aClass140_6450 != null)
                    ((Class140) aClass140_6450).anInterface6_1662 = null;
                if (aClass140_6491 != null)
                    ((Class140) aClass140_6491).anInterface6_1662 = null;
            }
        } else if ((i ^ 0xffffffff) == -4) {
            for (int i_475_ = 0; (i_420_ ^ 0xffffffff) < (i_475_ ^ 0xffffffff); i_475_++) {
                int i_476_ = is[i_475_];
                if ((anIntArrayArray6481.length ^ 0xffffffff) < (i_476_ ^ 0xffffffff)) {
                    int[] is_477_ = anIntArrayArray6481[i_476_];
                    for (int i_478_ = 0; i_478_ < is_477_.length; i_478_++) {
                        int i_479_ = is_477_[i_478_];
                        anIntArray6531[i_479_] -= Node_Sub14_Sub29.anInt9468;
                        anIntArray6451[i_479_] -= Node_Sub14_Sub25.anInt9422;
                        anIntArray6468[i_479_] -= Class301_Sub2.anInt8435;
                        anIntArray6531[i_479_] = i_416_ * anIntArray6531[i_479_] >> -759344345;
                        anIntArray6451[i_479_] = anIntArray6451[i_479_] * i_417_ >> 82722983;
                        anIntArray6468[i_479_] = i_418_ * anIntArray6468[i_479_] >> 1326218695;
                        anIntArray6531[i_479_] += Node_Sub14_Sub29.anInt9468;
                        anIntArray6451[i_479_] += Node_Sub14_Sub25.anInt9422;
                        anIntArray6468[i_479_] += Class301_Sub2.anInt8435;
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray6502 != null) {
                for (int i_480_ = 0; (i_480_ ^ 0xffffffff) > (i_420_ ^ 0xffffffff); i_480_++) {
                    int i_481_ = is[i_480_];
                    if (i_481_ < anIntArrayArray6502.length) {
                        int[] is_482_ = anIntArrayArray6502[i_481_];
                        for (int i_483_ = 0; i_483_ < is_482_.length; i_483_++) {
                            int i_484_ = is_482_[i_483_];
                            int i_485_ = (aByteArray6473[i_484_] & 0xff) + i_416_ * 8;
                            if ((i_485_ ^ 0xffffffff) <= -1) {
                                if (i_485_ > 255)
                                    i_485_ = 255;
                            } else
                                i_485_ = 0;
                            aByteArray6473[i_484_] = (byte) i_485_;
                        }
                        if ((is_482_.length ^ 0xffffffff) < -1 && aClass140_6450 != null)
                            ((Class140) aClass140_6450).anInterface6_1662 = null;
                    }
                }
                if (aClass353Array6440 != null) {
                    for (int i_486_ = 0; (i_486_ ^ 0xffffffff) > (anInt6475 ^ 0xffffffff); i_486_++) {
                        Class353 class353 = aClass353Array6440[i_486_];
                        Class15 class15 = aClass15Array6444[i_486_];
                        ((Class15) class15).anInt280 = (((Class15) class15).anInt280 & 0xffffff | (255 - (0xff & (aByteArray6473[((Class353) class353).anInt4197])) << 466181976));
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray6502 != null) {
                for (int i_487_ = 0; i_420_ > i_487_; i_487_++) {
                    int i_488_ = is[i_487_];
                    if (i_488_ < anIntArrayArray6502.length) {
                        int[] is_489_ = anIntArrayArray6502[i_488_];
                        for (int i_490_ = 0; ((i_490_ ^ 0xffffffff) > (is_489_.length ^ 0xffffffff)); i_490_++) {
                            int i_491_ = is_489_[i_490_];
                            int i_492_ = 0xffff & aShortArray6535[i_491_];
                            int i_493_ = i_492_ >> -944595414 & 0x3f;
                            int i_494_ = (0x3da & i_492_) >> -267784473;
                            int i_495_ = 0x7f & i_492_;
                            i_493_ = 0x3f & i_416_ + i_493_;
                            i_494_ += i_417_ / 4;
                            if ((i_494_ ^ 0xffffffff) <= -1) {
                                if ((i_494_ ^ 0xffffffff) < -8)
                                    i_494_ = 7;
                            } else
                                i_494_ = 0;
                            i_495_ += i_418_;
                            if ((i_495_ ^ 0xffffffff) <= -1) {
                                if ((i_495_ ^ 0xffffffff) < -128)
                                    i_495_ = 127;
                            } else
                                i_495_ = 0;
                            aShortArray6535[i_491_] = (short) (Class358.retrieveLooksSettings(i_495_, (Class358.retrieveLooksSettings(i_494_ << -949231929, i_493_ << 1633607146))));
                        }
                        if ((is_489_.length ^ 0xffffffff) < -1 && aClass140_6450 != null)
                            ((Class140) aClass140_6450).anInterface6_1662 = null;
                    }
                }
                if (aClass353Array6440 != null) {
                    for (int i_496_ = 0; i_496_ < anInt6475; i_496_++) {
                        Class353 class353 = aClass353Array6440[i_496_];
                        Class15 class15 = aClass15Array6444[i_496_];
                        ((Class15) class15).anInt280 = (0xffffff & (Node_Sub14_Sub39.anIntArray9600[0xffff & (aShortArray6535[(((Class353) class353).anInt4197)])]) | ~0xffffff & ((Class15) class15).anInt280);
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -9) {
            if (anIntArrayArray6482 != null) {
                for (int i_497_ = 0; i_497_ < i_420_; i_497_++) {
                    int i_498_ = is[i_497_];
                    if (anIntArrayArray6482.length > i_498_) {
                        int[] is_499_ = anIntArrayArray6482[i_498_];
                        for (int i_500_ = 0; i_500_ < is_499_.length; i_500_++) {
                            Class15 class15 = aClass15Array6444[is_499_[i_500_]];
                            ((Class15) class15).anInt271 += i_416_;
                            ((Class15) class15).anInt272 += i_417_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray6482 != null) {
                for (int i_501_ = 0; i_420_ > i_501_; i_501_++) {
                    int i_502_ = is[i_501_];
                    if ((i_502_ ^ 0xffffffff) > (anIntArrayArray6482.length ^ 0xffffffff)) {
                        int[] is_503_ = anIntArrayArray6482[i_502_];
                        for (int i_504_ = 0; is_503_.length > i_504_; i_504_++) {
                            Class15 class15 = aClass15Array6444[is_503_[i_504_]];
                            ((Class15) class15).anInt274 = (i_416_ * ((Class15) class15).anInt274 >> 1428129511);
                            ((Class15) class15).anInt273 = (i_417_ * ((Class15) class15).anInt273 >> -1653466393);
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -10 && anIntArrayArray6482 != null) {
            for (int i_505_ = 0; (i_420_ ^ 0xffffffff) < (i_505_ ^ 0xffffffff); i_505_++) {
                int i_506_ = is[i_505_];
                if ((i_506_ ^ 0xffffffff) > (anIntArrayArray6482.length ^ 0xffffffff)) {
                    int[] is_507_ = anIntArrayArray6482[i_506_];
                    for (int i_508_ = 0; is_507_.length > i_508_; i_508_++) {
                        Class15 class15 = aClass15Array6444[is_507_[i_508_]];
                        ((Class15) class15).anInt279 = 0x3fff & i_416_ + ((Class15) class15).anInt279;
                    }
                }
            }
        }
    }

    private final void method1475(int i) {
        anInt6471++;
        int i_509_ = 32767;
        int i_510_ = 32767;
        int i_511_ = 32767;
        int i_512_ = -32768;
        int i_513_ = -32768;
        int i_514_ = -32768;
        int i_515_ = 0;
        int i_516_ = 0;
        if (i != 29866)
            aString6536 = null;
        for (int i_517_ = 0; anInt6497 > i_517_; i_517_++) {
            int i_518_ = anIntArray6531[i_517_];
            int i_519_ = anIntArray6451[i_517_];
            if ((i_519_ ^ 0xffffffff) > (i_510_ ^ 0xffffffff))
                i_510_ = i_519_;
            if ((i_512_ ^ 0xffffffff) > (i_518_ ^ 0xffffffff))
                i_512_ = i_518_;
            int i_520_ = anIntArray6468[i_517_];
            if (i_519_ > i_513_)
                i_513_ = i_519_;
            if (i_518_ < i_509_)
                i_509_ = i_518_;
            if (i_520_ > i_514_)
                i_514_ = i_520_;
            if (i_511_ > i_520_)
                i_511_ = i_520_;
            int i_521_ = i_518_ * i_518_ + i_520_ * i_520_;
            if (i_521_ > i_515_)
                i_515_ = i_521_;
            i_521_ = i_520_ * i_520_ + (i_518_ * i_518_ + i_519_ * i_519_);
            if (i_521_ > i_516_)
                i_516_ = i_521_;
        }
        aShort6525 = (short) i_511_;
        aShort6517 = (short) i_509_;
        aShort6521 = (short) i_510_;
        aShort6461 = (short) i_512_;
        aShort6522 = (short) i_514_;
        aShort6543 = (short) i_513_;
        aShort6508 = (short) (int) (0.99 + Math.sqrt((double) i_515_));
        aShort6467 = (short) (int) (0.99 + Math.sqrt((double) i_516_));
        aBoolean6539 = true;
    }

    private final boolean method1476(boolean bool, int i, int i_522_, int i_523_, int i_524_, Viewport viewport, int i_525_) {
        anInt6487++;
        Class238_Sub3 class238_sub3 = (Class238_Sub3) viewport;
        Class238_Sub3 class238_sub3_526_ = ((ha_Sub2) aHa_Sub2_6476).aClass238_Sub3_5832;
        float f = (((Class238_Sub3) class238_sub3_526_).aFloat6780 + ((((Class238_Sub3) class238_sub3_526_).aFloat6785 * ((Class238_Sub3) class238_sub3).aFloat6797) + ((((Class238_Sub3) class238_sub3).aFloat6780 * ((Class238_Sub3) class238_sub3_526_).aFloat6794) + (((Class238_Sub3) class238_sub3_526_).aFloat6784 * ((Class238_Sub3) class238_sub3).aFloat6770))));
        float f_527_ = (((Class238_Sub3) class238_sub3_526_).aFloat6770 + ((((Class238_Sub3) class238_sub3_526_).aFloat6786 * ((Class238_Sub3) class238_sub3).aFloat6797) + ((((Class238_Sub3) class238_sub3_526_).aFloat6761 * ((Class238_Sub3) class238_sub3).aFloat6780) + (((Class238_Sub3) class238_sub3).aFloat6770 * ((Class238_Sub3) class238_sub3_526_).aFloat6772))));
        float f_528_ = ((((Class238_Sub3) class238_sub3_526_).aFloat6775 * ((Class238_Sub3) class238_sub3).aFloat6780) + (((Class238_Sub3) class238_sub3).aFloat6770 * ((Class238_Sub3) class238_sub3_526_).aFloat6791) + (((Class238_Sub3) class238_sub3).aFloat6797 * ((Class238_Sub3) class238_sub3_526_).aFloat6793) + ((Class238_Sub3) class238_sub3_526_).aFloat6797);
        Class327.aFloat3838 = ((((Class238_Sub3) class238_sub3).aFloat6791 * ((Class238_Sub3) class238_sub3_526_).aFloat6786) + ((((Class238_Sub3) class238_sub3).aFloat6772 * ((Class238_Sub3) class238_sub3_526_).aFloat6772) + (((Class238_Sub3) class238_sub3).aFloat6784 * ((Class238_Sub3) class238_sub3_526_).aFloat6761)));
        Class170.aFloat1980 = ((((Class238_Sub3) class238_sub3).aFloat6794 * ((Class238_Sub3) class238_sub3_526_).aFloat6761) + (((Class238_Sub3) class238_sub3_526_).aFloat6772 * ((Class238_Sub3) class238_sub3).aFloat6761) + (((Class238_Sub3) class238_sub3).aFloat6775 * ((Class238_Sub3) class238_sub3_526_).aFloat6786));
        Class282_Sub10.aFloat7694 = ((((Class238_Sub3) class238_sub3).aFloat6775 * ((Class238_Sub3) class238_sub3_526_).aFloat6785) + ((((Class238_Sub3) class238_sub3).aFloat6794 * ((Class238_Sub3) class238_sub3_526_).aFloat6794) + (((Class238_Sub3) class238_sub3).aFloat6761 * ((Class238_Sub3) class238_sub3_526_).aFloat6784)));
        Class379.aFloat4639 = ((((Class238_Sub3) class238_sub3_526_).aFloat6772 * ((Class238_Sub3) class238_sub3).aFloat6786) + (((Class238_Sub3) class238_sub3_526_).aFloat6761 * ((Class238_Sub3) class238_sub3).aFloat6785) + (((Class238_Sub3) class238_sub3).aFloat6793 * ((Class238_Sub3) class238_sub3_526_).aFloat6786));
        Class346_Sub10.aFloat8348 = ((((Class238_Sub3) class238_sub3_526_).aFloat6791 * ((Class238_Sub3) class238_sub3).aFloat6786) + (((Class238_Sub3) class238_sub3_526_).aFloat6775 * ((Class238_Sub3) class238_sub3).aFloat6785) + (((Class238_Sub3) class238_sub3_526_).aFloat6793 * ((Class238_Sub3) class238_sub3).aFloat6793));
        Class226_Sub1.aFloat6660 = ((((Class238_Sub3) class238_sub3).aFloat6785 * ((Class238_Sub3) class238_sub3_526_).aFloat6794) + (((Class238_Sub3) class238_sub3).aFloat6786 * ((Class238_Sub3) class238_sub3_526_).aFloat6784) + (((Class238_Sub3) class238_sub3).aFloat6793 * ((Class238_Sub3) class238_sub3_526_).aFloat6785));
        Node_Sub8_Sub4.aFloat8378 = ((((Class238_Sub3) class238_sub3_526_).aFloat6785 * ((Class238_Sub3) class238_sub3).aFloat6791) + ((((Class238_Sub3) class238_sub3_526_).aFloat6784 * ((Class238_Sub3) class238_sub3).aFloat6772) + (((Class238_Sub3) class238_sub3_526_).aFloat6794 * ((Class238_Sub3) class238_sub3).aFloat6784)));
        Node_Sub45.aFloat7323 = ((((Class238_Sub3) class238_sub3_526_).aFloat6791 * ((Class238_Sub3) class238_sub3).aFloat6761) + (((Class238_Sub3) class238_sub3_526_).aFloat6775 * ((Class238_Sub3) class238_sub3).aFloat6794) + (((Class238_Sub3) class238_sub3).aFloat6775 * ((Class238_Sub3) class238_sub3_526_).aFloat6793));
        Class84_Sub7.aFloat5470 = ((((Class238_Sub3) class238_sub3_526_).aFloat6791 * ((Class238_Sub3) class238_sub3).aFloat6772) + (((Class238_Sub3) class238_sub3).aFloat6784 * ((Class238_Sub3) class238_sub3_526_).aFloat6775) + (((Class238_Sub3) class238_sub3_526_).aFloat6793 * ((Class238_Sub3) class238_sub3).aFloat6791));
        boolean bool_529_ = false;
        float f_530_ = 3.4028235E38F;
        float f_531_ = -3.4028235E38F;
        float f_532_ = 3.4028235E38F;
        float f_533_ = -3.4028235E38F;
        int i_534_ = ((ha_Sub2) aHa_Sub2_6476).anInt5864;
        int i_535_ = ((ha_Sub2) aHa_Sub2_6476).anInt5863;
        if (!aBoolean6539)
            method1475(29866);
        int i_536_ = -aShort6517 + aShort6461 >> -839572863;
        int i_537_ = -aShort6521 + aShort6543 >> 2002877089;
        int i_538_ = aShort6522 - aShort6525 >> -609666591;
        if (i_522_ != 1238578060)
            anIntArray6466 = null;
        int i_539_ = aShort6517 - -i_536_;
        int i_540_ = aShort6521 + i_537_;
        int i_541_ = i_538_ + aShort6525;
        int i_542_ = i_539_ - (i_536_ << i_523_);
        int i_543_ = i_540_ - (i_537_ << i_523_);
        int i_544_ = i_541_ - (i_538_ << i_523_);
        int i_545_ = i_539_ + (i_536_ << i_523_);
        int i_546_ = i_540_ + (i_537_ << i_523_);
        int i_547_ = i_541_ - -(i_538_ << i_523_);
        Node_Sub48.anIntArray7417[0] = i_542_;
        Node_Sub14_Sub22.anIntArray9384[0] = i_543_;
        Class285.anIntArray3366[0] = i_544_;
        Node_Sub48.anIntArray7417[1] = i_545_;
        Node_Sub14_Sub22.anIntArray9384[1] = i_543_;
        Class285.anIntArray3366[1] = i_544_;
        Node_Sub48.anIntArray7417[2] = i_542_;
        Node_Sub14_Sub22.anIntArray9384[2] = i_546_;
        Node_Sub48.anIntArray7417[3] = i_545_;
        Class285.anIntArray3366[2] = i_544_;
        Node_Sub14_Sub22.anIntArray9384[3] = i_546_;
        Class285.anIntArray3366[3] = i_544_;
        Node_Sub48.anIntArray7417[4] = i_542_;
        Node_Sub14_Sub22.anIntArray9384[4] = i_543_;
        Class285.anIntArray3366[4] = i_547_;
        Node_Sub48.anIntArray7417[5] = i_545_;
        Node_Sub14_Sub22.anIntArray9384[5] = i_543_;
        Class285.anIntArray3366[5] = i_547_;
        Node_Sub48.anIntArray7417[6] = i_542_;
        Node_Sub14_Sub22.anIntArray9384[6] = i_546_;
        Node_Sub48.anIntArray7417[7] = i_545_;
        Class285.anIntArray3366[6] = i_547_;
        Node_Sub14_Sub22.anIntArray9384[7] = i_546_;
        Class285.anIntArray3366[7] = i_547_;
        for (int i_548_ = 0; (i_548_ ^ 0xffffffff) > -9; i_548_++) {
            float f_549_ = (float) Class285.anIntArray3366[i_548_];
            float f_550_ = (float) Node_Sub14_Sub22.anIntArray9384[i_548_];
            float f_551_ = (float) Node_Sub48.anIntArray7417[i_548_];
            float f_552_ = f + (f_551_ * Class282_Sub10.aFloat7694 + f_550_ * Node_Sub8_Sub4.aFloat8378 + f_549_ * Class226_Sub1.aFloat6660);
            float f_553_ = (f_550_ * Class84_Sub7.aFloat5470 + f_551_ * Node_Sub45.aFloat7323 + f_549_ * Class346_Sub10.aFloat8348 + f_528_);
            float f_554_ = f_527_ + (f_551_ * Class170.aFloat1980 + Class327.aFloat3838 * f_550_ + f_549_ * Class379.aFloat4639);
            if ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5897 <= f_553_) {
                if ((i_524_ ^ 0xffffffff) < -1)
                    f_553_ = (float) i_524_;
                float f_555_ = ((float) i_534_ * f_552_ / f_553_ + (float) ((ha_Sub2) aHa_Sub2_6476).anInt5890);
                float f_556_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5933 + f_554_ * (float) i_535_ / f_553_);
                if (f_555_ > f_531_)
                    f_531_ = f_555_;
                if (f_530_ > f_555_)
                    f_530_ = f_555_;
                if (f_532_ > f_556_)
                    f_532_ = f_556_;
                if (f_533_ < f_556_)
                    f_533_ = f_556_;
                bool_529_ = true;
            }
        }
        if (bool_529_ && (float) i > f_530_ && (float) i < f_531_ && (float) i_525_ > f_532_ && f_533_ > (float) i_525_) {
            if (bool)
                return true;
            if (((ha_Sub2) aHa_Sub2_6476).anIntArray5950.length < anInt6455) {
                ((ha_Sub2) aHa_Sub2_6476).anIntArray5947 = new int[anInt6455];
                ((ha_Sub2) aHa_Sub2_6476).anIntArray5950 = new int[anInt6455];
            }
            int[] is = ((ha_Sub2) aHa_Sub2_6476).anIntArray5950;
            int[] is_557_ = ((ha_Sub2) aHa_Sub2_6476).anIntArray5947;
            for (int i_558_ = 0; i_558_ < anInt6497; i_558_++) {
                float f_559_ = (float) anIntArray6468[i_558_];
                float f_560_ = (float) anIntArray6531[i_558_];
                float f_561_ = (float) anIntArray6451[i_558_];
                float f_562_ = f + (Class226_Sub1.aFloat6660 * f_559_ + (Node_Sub8_Sub4.aFloat8378 * f_561_ + f_560_ * Class282_Sub10.aFloat7694));
                float f_563_ = (f_559_ * Class379.aFloat4639 + (Class327.aFloat3838 * f_561_ + f_560_ * Class170.aFloat1980) + f_527_);
                float f_564_ = (f_559_ * Class346_Sub10.aFloat8348 + (Class84_Sub7.aFloat5470 * f_561_ + Node_Sub45.aFloat7323 * f_560_) + f_528_);
                if (!((float) ((ha_Sub2) aHa_Sub2_6476).anInt5897 <= f_564_)) {
                    int i_565_ = anIntArray6458[i_558_];
                    int i_566_ = anIntArray6458[i_558_ - -1];
                    for (int i_567_ = i_565_; (i_567_ ^ 0xffffffff) > (i_566_ ^ 0xffffffff); i_567_++) {
                        int i_568_ = -1 + aShortArray6516[i_567_];
                        if (i_568_ == -1)
                            break;
                        is[-1 + aShortArray6516[i_567_]] = -999999;
                    }
                } else {
                    if (i_524_ > 0)
                        f_564_ = (float) i_524_;
                    int i_569_ = (int) (f_562_ * (float) i_534_ / f_564_ + (float) (((ha_Sub2) aHa_Sub2_6476).anInt5890));
                    int i_570_ = (int) ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5933 + f_563_ * (float) i_535_ / f_564_);
                    int i_571_ = anIntArray6458[i_558_];
                    int i_572_ = anIntArray6458[i_558_ + 1];
                    for (int i_573_ = i_571_; (i_573_ ^ 0xffffffff) > (i_572_ ^ 0xffffffff); i_573_++) {
                        int i_574_ = aShortArray6516[i_573_] - 1;
                        if (i_574_ == -1)
                            break;
                        is[i_574_] = i_569_;
                        is_557_[i_574_] = i_570_;
                    }
                }
            }
            for (int i_575_ = 0; (anInt6454 ^ 0xffffffff) < (i_575_ ^ 0xffffffff); i_575_++) {
                if ((is[aShortArray6462[i_575_]] ^ 0xffffffff) != 999998 && (is[aShortArray6524[i_575_]] ^ 0xffffffff) != 999998 && is[aShortArray6445[i_575_]] != -999999 && method1470(is[aShortArray6445[i_575_]], is[aShortArray6524[i_575_]], is[aShortArray6462[i_575_]], true, i_525_, is_557_[aShortArray6462[i_575_]], i, is_557_[aShortArray6445[i_575_]], is_557_[aShortArray6524[i_575_]]))
                    return true;
            }
        }
        return false;
    }

    final int RA() {
        if (!aBoolean6539)
            method1475(29866);
        anInt6506++;
        return aShort6461;
    }

    final void wa() {
        anInt6523++;
        for (int i = 0; (i ^ 0xffffffff) > (anInt6449 ^ 0xffffffff); i++) {
            anIntArray6531[i] = anIntArray6531[i] + 7 >> -1778974204;
            anIntArray6451[i] = 7 + anIntArray6451[i] >> 822233572;
            anIntArray6468[i] = 7 + anIntArray6468[i] >> -1542189596;
        }
        aBoolean6539 = false;
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
    }

    final void v() {
        anInt6526++;
        for (int i = 0; anInt6497 > i; i++)
            anIntArray6468[i] = -anIntArray6468[i];
        for (int i = 0; anInt6455 > i; i++)
            aShortArray6510[i] = (short) -aShortArray6510[i];
        for (int i = 0; (i ^ 0xffffffff) > (anInt6454 ^ 0xffffffff); i++) {
            short i_576_ = aShortArray6462[i];
            aShortArray6462[i] = aShortArray6445[i];
            aShortArray6445[i] = i_576_;
        }
        if (aClass140_6491 == null && aClass140_6450 != null)
            ((Class140) aClass140_6450).anInterface6_1662 = null;
        if (aClass140_6491 != null)
            ((Class140) aClass140_6491).anInterface6_1662 = null;
        aBoolean6539 = false;
        if (aClass352_6463 != null)
            ((Class352) aClass352_6463).anInterface1_4185 = null;
        if (aClass140_6504 != null)
            ((Class140) aClass140_6504).anInterface6_1662 = null;
    }

    final int da() {
        anInt6557++;
        return aShort6488;
    }

    final int HA() {
        anInt6553++;
        if (!aBoolean6539)
            method1475(29866);
        return aShort6525;
    }

    private final void method1477(int i, boolean bool) {
        if ((6 * anInt6439 ^ 0xffffffff) < ((((ByteStream) ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845).buffer).length ^ 0xffffffff))
            ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845 = new Node_Sub9_Sub1(anInt6439 * 6 - -600);
        else
            ((ByteStream) ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845).offset = 0;
        if (i == 11297) {
            anInt6534++;
            Node_Sub9_Sub1 class248_sub9_sub1 = ((ha_Sub2) aHa_Sub2_6476).aClass248_Sub9_Sub1_5845;
            if (!((ha_Sub2) aHa_Sub2_6476).aBoolean5872) {
                for (int i_577_ = 0; anInt6439 > i_577_; i_577_++) {
                    class248_sub9_sub1.writeLEShort_(aShortArray6462[i_577_], 44);
                    class248_sub9_sub1.writeLEShort_(aShortArray6524[i_577_], 64);
                    class248_sub9_sub1.writeLEShort_(aShortArray6445[i_577_], i + -11407);
                }
            } else {
                for (int i_578_ = 0; (i_578_ ^ 0xffffffff) > (anInt6439 ^ 0xffffffff); i_578_++) {
                    class248_sub9_sub1.writeShort(1182, aShortArray6462[i_578_]);
                    class248_sub9_sub1.writeShort(i + -10115, aShortArray6524[i_578_]);
                    class248_sub9_sub1.writeShort(1182, aShortArray6445[i_578_]);
                }
            }
            if (((ByteStream) class248_sub9_sub1).offset != 0) {
                if (!bool)
                    ((Class352) aClass352_6463).anInterface1_4185 = aHa_Sub2_6476.method877(5123, (byte) -85, (((ByteStream) class248_sub9_sub1).buffer), (((ByteStream) class248_sub9_sub1).offset), false);
                else {
                    if (anInterface1_6546 == null)
                        anInterface1_6546 = aHa_Sub2_6476.method877(5123, (byte) -85, (((ByteStream) class248_sub9_sub1).buffer), (((ByteStream) class248_sub9_sub1).offset), true);
                    else
                        anInterface1_6546.method7(((ByteStream) class248_sub9_sub1).offset, 20218, 5123, (((ByteStream) class248_sub9_sub1).buffer));
                    ((Class352) aClass352_6463).anInterface1_4185 = anInterface1_6546;
                }
                if (!bool)
                    aBoolean6477 = true;
            }
        }
    }

    final void method1440(Viewport viewport, Class346_Sub9 class346_sub9, int i) {
        anInt6438++;
        if (anInt6455 != 0) {
            Class238_Sub3 class238_sub3 = ((ha_Sub2) aHa_Sub2_6476).aClass238_Sub3_5832;
            if (!aBoolean6539)
                method1475(29866);
            Class238_Sub3 class238_sub3_579_ = (Class238_Sub3) viewport;
            Class137.aFloat1641 = ((((Class238_Sub3) class238_sub3).aFloat6791 * ((Class238_Sub3) class238_sub3_579_).aFloat6770) + (((Class238_Sub3) class238_sub3).aFloat6775 * ((Class238_Sub3) class238_sub3_579_).aFloat6780) + (((Class238_Sub3) class238_sub3_579_).aFloat6797 * ((Class238_Sub3) class238_sub3).aFloat6793) + ((Class238_Sub3) class238_sub3).aFloat6797);
            Class84_Sub7.aFloat5470 = ((((Class238_Sub3) class238_sub3).aFloat6791 * ((Class238_Sub3) class238_sub3_579_).aFloat6772) + (((Class238_Sub3) class238_sub3_579_).aFloat6784 * ((Class238_Sub3) class238_sub3).aFloat6775) + (((Class238_Sub3) class238_sub3).aFloat6793 * ((Class238_Sub3) class238_sub3_579_).aFloat6791));
            float f = (Class137.aFloat1641 + (float) aShort6521 * Class84_Sub7.aFloat5470);
            float f_580_ = (Class137.aFloat1641 + Class84_Sub7.aFloat5470 * (float) aShort6543);
            float f_581_;
            float f_582_;
            if (!(f > f_580_)) {
                f_581_ = (float) aShort6508 + f_580_;
                f_582_ = (float) -aShort6508 + f;
            } else {
                f_581_ = f + (float) aShort6508;
                f_582_ = f_580_ - (float) aShort6508;
            }
            if (!(((ha_Sub2) aHa_Sub2_6476).aFloat5919 <= f_582_) && !(f_581_ <= (float) ((ha_Sub2) aHa_Sub2_6476).anInt5897)) {
                Node_Sub8_Sub4.aFloat8378 = ((((Class238_Sub3) class238_sub3_579_).aFloat6772 * ((Class238_Sub3) class238_sub3).aFloat6784) + (((Class238_Sub3) class238_sub3).aFloat6794 * ((Class238_Sub3) class238_sub3_579_).aFloat6784) + (((Class238_Sub3) class238_sub3).aFloat6785 * ((Class238_Sub3) class238_sub3_579_).aFloat6791));
                Node_Sub45.aFloat7355 = (((Class238_Sub3) class238_sub3).aFloat6780 + ((((Class238_Sub3) class238_sub3).aFloat6785 * ((Class238_Sub3) class238_sub3_579_).aFloat6797) + ((((Class238_Sub3) class238_sub3_579_).aFloat6780 * ((Class238_Sub3) class238_sub3).aFloat6794) + (((Class238_Sub3) class238_sub3_579_).aFloat6770 * (((Class238_Sub3) class238_sub3).aFloat6784)))));
                float f_583_ = (Node_Sub45.aFloat7355 + Node_Sub8_Sub4.aFloat8378 * (float) aShort6521);
                float f_584_ = (Node_Sub45.aFloat7355 + Node_Sub8_Sub4.aFloat8378 * (float) aShort6543);
                float f_585_;
                float f_586_;
                if (!(f_584_ < f_583_)) {
                    f_585_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5864 * (f_584_ + (float) aShort6508));
                    f_586_ = ((f_583_ - (float) aShort6508) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5864);
                } else {
                    f_585_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5864 * (f_583_ + (float) aShort6508));
                    f_586_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5864 * (f_584_ - (float) aShort6508));
                }
                if (!(f_586_ / f_581_ >= ((ha_Sub2) aHa_Sub2_6476).aFloat5844) && !(f_585_ / f_581_ <= ((ha_Sub2) aHa_Sub2_6476).aFloat5916)) {
                    Class327.aFloat3838 = ((((Class238_Sub3) class238_sub3_579_).aFloat6784 * ((Class238_Sub3) class238_sub3).aFloat6761) + (((Class238_Sub3) class238_sub3_579_).aFloat6772 * ((Class238_Sub3) class238_sub3).aFloat6772) + (((Class238_Sub3) class238_sub3_579_).aFloat6791 * ((Class238_Sub3) class238_sub3).aFloat6786));
                    Class15.aFloat278 = ((((Class238_Sub3) class238_sub3).aFloat6786 * ((Class238_Sub3) class238_sub3_579_).aFloat6797) + ((((Class238_Sub3) class238_sub3_579_).aFloat6770 * ((Class238_Sub3) class238_sub3).aFloat6772) + (((Class238_Sub3) class238_sub3).aFloat6761 * (((Class238_Sub3) class238_sub3_579_).aFloat6780))) + ((Class238_Sub3) class238_sub3).aFloat6770);
                    float f_587_ = (Class15.aFloat278 + Class327.aFloat3838 * (float) aShort6521);
                    float f_588_ = (Class327.aFloat3838 * (float) aShort6543 + Class15.aFloat278);
                    float f_589_;
                    float f_590_;
                    if (!(f_588_ < f_587_)) {
                        f_589_ = ((f_587_ - (float) aShort6508) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5863);
                        f_590_ = ((f_588_ + (float) aShort6508) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5863);
                    } else {
                        f_589_ = ((float) ((ha_Sub2) aHa_Sub2_6476).anInt5863 * (f_588_ - (float) aShort6508));
                        f_590_ = (((float) aShort6508 + f_587_) * (float) ((ha_Sub2) aHa_Sub2_6476).anInt5863);
                    }
                    if (!(f_589_ / f_581_ >= ((ha_Sub2) aHa_Sub2_6476).aFloat5900) && !(((ha_Sub2) aHa_Sub2_6476).aFloat5940 >= f_590_ / f_581_)) {
                        if (class346_sub9 != null || aClass353Array6440 != null) {
                            Class379.aFloat4639 = ((((Class238_Sub3) class238_sub3).aFloat6761 * (((Class238_Sub3) class238_sub3_579_).aFloat6785)) + ((((Class238_Sub3) class238_sub3).aFloat6772) * (((Class238_Sub3) class238_sub3_579_).aFloat6786)) + ((((Class238_Sub3) class238_sub3).aFloat6786) * (((Class238_Sub3) class238_sub3_579_).aFloat6793)));
                            Class226_Sub1.aFloat6660 = ((((Class238_Sub3) class238_sub3).aFloat6784 * (((Class238_Sub3) class238_sub3_579_).aFloat6786)) + ((((Class238_Sub3) class238_sub3).aFloat6794) * (((Class238_Sub3) class238_sub3_579_).aFloat6785)) + ((((Class238_Sub3) class238_sub3).aFloat6785) * (((Class238_Sub3) class238_sub3_579_).aFloat6793)));
                            Node_Sub45.aFloat7323 = ((((Class238_Sub3) class238_sub3).aFloat6793 * (((Class238_Sub3) class238_sub3_579_).aFloat6775)) + (((((Class238_Sub3) class238_sub3_579_).aFloat6794) * (((Class238_Sub3) class238_sub3).aFloat6775)) + ((((Class238_Sub3) class238_sub3_579_).aFloat6761) * (((Class238_Sub3) class238_sub3).aFloat6791))));
                            Class170.aFloat1980 = ((((Class238_Sub3) class238_sub3).aFloat6786 * (((Class238_Sub3) class238_sub3_579_).aFloat6775)) + (((((Class238_Sub3) class238_sub3).aFloat6761) * (((Class238_Sub3) class238_sub3_579_).aFloat6794)) + ((((Class238_Sub3) class238_sub3).aFloat6772) * ((Class238_Sub3) class238_sub3_579_).aFloat6761)));
                            Class282_Sub10.aFloat7694 = ((((Class238_Sub3) class238_sub3).aFloat6785 * (((Class238_Sub3) class238_sub3_579_).aFloat6775)) + (((((Class238_Sub3) class238_sub3).aFloat6784) * (((Class238_Sub3) class238_sub3_579_).aFloat6761)) + ((((Class238_Sub3) class238_sub3_579_).aFloat6794) * (((Class238_Sub3) class238_sub3).aFloat6794))));
                            Class346_Sub10.aFloat8348 = ((((Class238_Sub3) class238_sub3).aFloat6793 * (((Class238_Sub3) class238_sub3_579_).aFloat6793)) + (((((Class238_Sub3) class238_sub3).aFloat6791) * (((Class238_Sub3) class238_sub3_579_).aFloat6786)) + ((((Class238_Sub3) class238_sub3).aFloat6775) * ((Class238_Sub3) class238_sub3_579_).aFloat6785)));
                        }
                        if (class346_sub9 != null) {
                            boolean bool = false;
                            boolean bool_591_ = true;
                            int i_592_ = aShort6517 - -aShort6461 >> 458737409;
                            int i_593_ = aShort6522 + aShort6525 >> 1058853665;
                            int i_594_ = (int) ((Class226_Sub1.aFloat6660 * (float) i_593_) + (Node_Sub45.aFloat7355 + (Class282_Sub10.aFloat7694 * (float) i_592_) + (Node_Sub8_Sub4.aFloat8378 * (float) aShort6521)));
                            int i_595_ = (int) (((float) aShort6521 * Class327.aFloat3838) + (Class15.aFloat278 + ((float) i_592_ * Class170.aFloat1980)) + (Class379.aFloat4639 * (float) i_593_));
                            int i_596_ = (int) ((Node_Sub45.aFloat7323 * (float) i_592_) + Class137.aFloat1641 + (Class84_Sub7.aFloat5470 * (float) aShort6521) + ((float) i_593_ * Class346_Sub10.aFloat8348));
                            if (i_596_ < ((ha_Sub2) aHa_Sub2_6476).anInt5897)
                                bool = true;
                            else {
                                ((Class346_Sub9) class346_sub9).anInt8346 = ((((ha_Sub2) aHa_Sub2_6476).anInt5863 * i_595_ / i_596_) + ((ha_Sub2) aHa_Sub2_6476).anInt5933);
                                ((Class346_Sub9) class346_sub9).anInt8347 = ((((ha_Sub2) aHa_Sub2_6476).anInt5864 * i_594_ / i_596_) + ((ha_Sub2) aHa_Sub2_6476).anInt5890);
                            }
                            int i_597_ = (int) (((float) i_593_ * Class226_Sub1.aFloat6660) + ((Class282_Sub10.aFloat7694 * (float) i_592_) + Node_Sub45.aFloat7355 + ((float) aShort6543 * (Node_Sub8_Sub4.aFloat8378))));
                            int i_598_ = (int) ((float) i_592_ * Class170.aFloat1980 + Class15.aFloat278 + (Class327.aFloat3838 * (float) aShort6543) + ((float) i_593_ * Class379.aFloat4639));
                            int i_599_ = (int) ((Node_Sub45.aFloat7323 * (float) i_592_) + Class137.aFloat1641 + ((float) aShort6543 * Class84_Sub7.aFloat5470) + ((float) i_593_ * Class346_Sub10.aFloat8348));
                            if ((((ha_Sub2) aHa_Sub2_6476).anInt5897 ^ 0xffffffff) >= (i_599_ ^ 0xffffffff)) {
                                ((Class346_Sub9) class346_sub9).anInt8345 = ((((ha_Sub2) aHa_Sub2_6476).anInt5864 * i_597_ / i_599_) + ((ha_Sub2) aHa_Sub2_6476).anInt5890);
                                ((Class346_Sub9) class346_sub9).anInt8343 = ((i_598_ * ((ha_Sub2) aHa_Sub2_6476).anInt5863 / i_599_) + ((ha_Sub2) aHa_Sub2_6476).anInt5933);
                            } else
                                bool = true;
                            if (bool) {
                                if ((((ha_Sub2) aHa_Sub2_6476).anInt5897 ^ 0xffffffff) < (i_596_ ^ 0xffffffff) && (((ha_Sub2) aHa_Sub2_6476).anInt5897 ^ 0xffffffff) < (i_599_ ^ 0xffffffff))
                                    bool_591_ = false;
                                else if (((ha_Sub2) aHa_Sub2_6476).anInt5897 <= i_596_) {
                                    if (((ha_Sub2) aHa_Sub2_6476).anInt5897 > i_599_) {
                                        int i_600_ = ((-(((ha_Sub2) aHa_Sub2_6476).anInt5897) + i_596_ << -1250878160) / (i_596_ + -i_599_));
                                        int i_601_ = (i_594_ + (i_600_ * (i_594_ - i_597_) >> -110497872));
                                        int i_602_ = (i_595_ + (i_600_ * (i_595_ - i_598_) >> 1190872432));
                                        ((Class346_Sub9) class346_sub9).anInt8347 = (((((ha_Sub2) aHa_Sub2_6476).anInt5864) * i_601_ / (((ha_Sub2) aHa_Sub2_6476).anInt5897)) + (((ha_Sub2) aHa_Sub2_6476).anInt5890));
                                        ((Class346_Sub9) class346_sub9).anInt8346 = (((((ha_Sub2) aHa_Sub2_6476).anInt5863) * i_602_ / (((ha_Sub2) aHa_Sub2_6476).anInt5897)) + (((ha_Sub2) aHa_Sub2_6476).anInt5933));
                                    }
                                } else {
                                    int i_603_ = ((-(((ha_Sub2) aHa_Sub2_6476).anInt5897) + i_599_ << 858253904) / (i_599_ + -i_596_));
                                    int i_604_ = i_597_ + (i_603_ * (i_597_ + -i_594_) >> 1246818608);
                                    ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub2) aHa_Sub2_6476).anInt5890 - -((((ha_Sub2) aHa_Sub2_6476).anInt5864) * i_604_ / (((ha_Sub2) aHa_Sub2_6476).anInt5897)));
                                    int i_605_ = ((i_603_ * (i_598_ - i_595_) >> 1667701712) + i_598_);
                                    ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub2) aHa_Sub2_6476).anInt5933 - -((((ha_Sub2) aHa_Sub2_6476).anInt5863) * i_605_ / (((ha_Sub2) aHa_Sub2_6476).anInt5897)));
                                }
                            }
                            if (bool_591_) {
                                if (i_599_ >= i_596_)
                                    ((Class346_Sub9) class346_sub9).anInt8344 = (-(((Class346_Sub9) class346_sub9).anInt8345) + ((aShort6508 + i_597_) * (((ha_Sub2) aHa_Sub2_6476).anInt5864) / i_599_) + (((ha_Sub2) aHa_Sub2_6476).anInt5890));
                                else
                                    ((Class346_Sub9) class346_sub9).anInt8344 = (((ha_Sub2) aHa_Sub2_6476).anInt5890 - -((((ha_Sub2) aHa_Sub2_6476).anInt5864) * (aShort6508 + i_594_) / i_596_) - (((Class346_Sub9) class346_sub9).anInt8347));
                                ((Class346_Sub9) class346_sub9).aBoolean8342 = true;
                            }
                        }
                        aHa_Sub2_6476.method863(-1);
                        aHa_Sub2_6476.method845(class238_sub3_579_, 28727);
                        method1474(3227);
                        aHa_Sub2_6476.method840(true);
                        method1467(30803);
                    }
                }
            }
        }
    }

    final void s(int i) {
        anInt6529++;
        anInt6515 = i;
        if (aClass242_6518 != null && (0x10000 & anInt6515 ^ 0xffffffff) == -1) {
            aByteArray6490 = ((Class242) aClass242_6518).aByteArray2695;
            aShortArray6556 = ((Class242) aClass242_6518).aShortArray2698;
            aShortArray6510 = ((Class242) aClass242_6518).aShortArray2696;
            aShortArray6554 = ((Class242) aClass242_6518).aShortArray2697;
            aClass242_6518 = null;
        }
        aBoolean6477 = true;
        method1468((byte) -78);
    }

    final int EA() {
        anInt6447++;
        if (!aBoolean6539)
            method1475(29866);
        return aShort6543;
    }

    private final Class162 method1478(boolean bool, int i, Class162_Sub2 class162_sub2_606_, Class162_Sub2 class162_sub2_607_, boolean bool_608_, byte i_609_) {
        class162_sub2_607_.anInt6475 = anInt6475;
        class162_sub2_607_.anInt6454 = anInt6454;
        if ((i & 0x100 ^ 0xffffffff) != -1)
            class162_sub2_607_.aBoolean6492 = true;
        else
            class162_sub2_607_.aBoolean6492 = aBoolean6492;
        class162_sub2_607_.anInt6472 = anInt6472;
        anInt6495++;
        class162_sub2_607_.aBoolean6484 = aBoolean6484;
        class162_sub2_607_.anInt6455 = anInt6455;
        class162_sub2_607_.aByte6500 = (byte) 0;
        class162_sub2_607_.anInt6449 = anInt6449;
        class162_sub2_607_.anInt6497 = anInt6497;
        class162_sub2_607_.aShort6488 = aShort6488;
        class162_sub2_607_.anInt6515 = i;
        if (i_609_ < 108)
            return null;
        class162_sub2_607_.aShort6496 = aShort6496;
        class162_sub2_607_.anInt6439 = anInt6439;
        boolean bool_610_ = Class346_Sub7_Sub5_Sub2.method3698(i, anInt6472, 33);
        boolean bool_611_ = Class315.method3281(i, anInt6472, 3828);
        boolean bool_612_ = Class193.method1656(anInt6472, i, 123);
        boolean bool_613_ = bool_612_ | (bool_610_ | bool_611_);
        if (!bool_613_) {
            class162_sub2_607_.anIntArray6468 = anIntArray6468;
            class162_sub2_607_.anIntArray6531 = anIntArray6531;
            class162_sub2_607_.anIntArray6451 = anIntArray6451;
        } else {
            if (bool_610_) {
                if (class162_sub2_606_.anIntArray6531 == null || ((anInt6449 ^ 0xffffffff) < (class162_sub2_606_.anIntArray6531.length ^ 0xffffffff)))
                    class162_sub2_607_.anIntArray6531 = class162_sub2_606_.anIntArray6531 = new int[anInt6449];
                else
                    class162_sub2_607_.anIntArray6531 = class162_sub2_606_.anIntArray6531;
            } else
                class162_sub2_607_.anIntArray6531 = anIntArray6531;
            if (!bool_611_)
                class162_sub2_607_.anIntArray6451 = anIntArray6451;
            else if (class162_sub2_606_.anIntArray6451 == null || anInt6449 > class162_sub2_606_.anIntArray6451.length)
                class162_sub2_607_.anIntArray6451 = class162_sub2_606_.anIntArray6451 = new int[anInt6449];
            else
                class162_sub2_607_.anIntArray6451 = class162_sub2_606_.anIntArray6451;
            if (bool_612_) {
                if (class162_sub2_606_.anIntArray6468 == null || anInt6449 > class162_sub2_606_.anIntArray6468.length)
                    class162_sub2_607_.anIntArray6468 = class162_sub2_606_.anIntArray6468 = new int[anInt6449];
                else
                    class162_sub2_607_.anIntArray6468 = class162_sub2_606_.anIntArray6468;
            } else
                class162_sub2_607_.anIntArray6468 = anIntArray6468;
            for (int i_614_ = 0; i_614_ < anInt6449; i_614_++) {
                if (bool_610_)
                    class162_sub2_607_.anIntArray6531[i_614_] = anIntArray6531[i_614_];
                if (bool_611_)
                    class162_sub2_607_.anIntArray6451[i_614_] = anIntArray6451[i_614_];
                if (bool_612_)
                    class162_sub2_607_.anIntArray6468[i_614_] = anIntArray6468[i_614_];
            }
        }
        if (Node_Sub14.method2270(i, anInt6472, (byte) 8)) {
            if (bool_608_)
                class162_sub2_607_.aByte6500 |= 0x1;
            class162_sub2_607_.aClass140_6504 = class162_sub2_606_.aClass140_6504;
            ((Class140) class162_sub2_607_.aClass140_6504).anInterface6_1662 = ((Class140) aClass140_6504).anInterface6_1662;
            ((Class140) class162_sub2_607_.aClass140_6504).aByte1664 = ((Class140) aClass140_6504).aByte1664;
        } else if (aa_Sub2.method162(93, anInt6472, i))
            class162_sub2_607_.aClass140_6504 = aClass140_6504;
        else
            class162_sub2_607_.aClass140_6504 = null;
        if (!Class246.method1961(i, 0, anInt6472))
            class162_sub2_607_.aShortArray6535 = aShortArray6535;
        else {
            if (class162_sub2_606_.aShortArray6535 != null && anInt6454 <= class162_sub2_606_.aShortArray6535.length)
                class162_sub2_607_.aShortArray6535 = class162_sub2_606_.aShortArray6535;
            else
                class162_sub2_607_.aShortArray6535 = class162_sub2_606_.aShortArray6535 = new short[anInt6454];
            for (int i_615_ = 0; (anInt6454 ^ 0xffffffff) < (i_615_ ^ 0xffffffff); i_615_++)
                class162_sub2_607_.aShortArray6535[i_615_] = aShortArray6535[i_615_];
        }
        if (Class84_Sub6.method620(i, 0, anInt6472)) {
            if (class162_sub2_606_.aByteArray6473 == null || ((class162_sub2_606_.aByteArray6473.length ^ 0xffffffff) > (anInt6454 ^ 0xffffffff)))
                class162_sub2_607_.aByteArray6473 = class162_sub2_606_.aByteArray6473 = new byte[anInt6454];
            else
                class162_sub2_607_.aByteArray6473 = class162_sub2_606_.aByteArray6473;
            for (int i_616_ = 0; i_616_ < anInt6454; i_616_++)
                class162_sub2_607_.aByteArray6473[i_616_] = aByteArray6473[i_616_];
        } else
            class162_sub2_607_.aByteArray6473 = aByteArray6473;
        if (Class136_Sub2.method1256(i, 127, anInt6472)) {
            if (bool_608_)
                class162_sub2_607_.aByte6500 |= 0x2;
            class162_sub2_607_.aClass140_6450 = class162_sub2_606_.aClass140_6450;
            ((Class140) class162_sub2_607_.aClass140_6450).aByte1664 = ((Class140) aClass140_6450).aByte1664;
            ((Class140) class162_sub2_607_.aClass140_6450).anInterface6_1662 = ((Class140) aClass140_6450).anInterface6_1662;
        } else if (Class9.method191(anInt6472, i, -17286))
            class162_sub2_607_.aClass140_6450 = aClass140_6450;
        else
            class162_sub2_607_.aClass140_6450 = null;
        if (Class282_Sub11.method2962(112, anInt6472, i)) {
            if (class162_sub2_606_.aShortArray6554 != null && ((class162_sub2_606_.aShortArray6554.length ^ 0xffffffff) <= (anInt6455 ^ 0xffffffff))) {
                class162_sub2_607_.aShortArray6510 = class162_sub2_606_.aShortArray6510;
                class162_sub2_607_.aShortArray6554 = class162_sub2_606_.aShortArray6554;
                class162_sub2_607_.aShortArray6556 = class162_sub2_606_.aShortArray6556;
            } else {
                int i_617_ = anInt6455;
                class162_sub2_607_.aShortArray6510 = class162_sub2_606_.aShortArray6510 = new short[i_617_];
                class162_sub2_607_.aShortArray6554 = class162_sub2_606_.aShortArray6554 = new short[i_617_];
                class162_sub2_607_.aShortArray6556 = class162_sub2_606_.aShortArray6556 = new short[i_617_];
            }
            if (aClass242_6518 == null) {
                for (int i_618_ = 0; (i_618_ ^ 0xffffffff) > (anInt6455 ^ 0xffffffff); i_618_++) {
                    class162_sub2_607_.aShortArray6554[i_618_] = aShortArray6554[i_618_];
                    class162_sub2_607_.aShortArray6556[i_618_] = aShortArray6556[i_618_];
                    class162_sub2_607_.aShortArray6510[i_618_] = aShortArray6510[i_618_];
                }
            } else {
                if (class162_sub2_606_.aClass242_6518 == null)
                    class162_sub2_606_.aClass242_6518 = new Class242();
                Class242 class242 = (class162_sub2_607_.aClass242_6518 = class162_sub2_606_.aClass242_6518);
                if (((Class242) class242).aShortArray2697 == null || ((anInt6455 ^ 0xffffffff) < (((Class242) class242).aShortArray2697.length ^ 0xffffffff))) {
                    int i_619_ = anInt6455;
                    ((Class242) class242).aShortArray2696 = new short[i_619_];
                    ((Class242) class242).aShortArray2697 = new short[i_619_];
                    ((Class242) class242).aByteArray2695 = new byte[i_619_];
                    ((Class242) class242).aShortArray2698 = new short[i_619_];
                }
                for (int i_620_ = 0; (anInt6455 ^ 0xffffffff) < (i_620_ ^ 0xffffffff); i_620_++) {
                    class162_sub2_607_.aShortArray6554[i_620_] = aShortArray6554[i_620_];
                    class162_sub2_607_.aShortArray6556[i_620_] = aShortArray6556[i_620_];
                    class162_sub2_607_.aShortArray6510[i_620_] = aShortArray6510[i_620_];
                    ((Class242) class242).aShortArray2697[i_620_] = ((Class242) aClass242_6518).aShortArray2697[i_620_];
                    ((Class242) class242).aShortArray2698[i_620_] = ((Class242) aClass242_6518).aShortArray2698[i_620_];
                    ((Class242) class242).aShortArray2696[i_620_] = ((Class242) aClass242_6518).aShortArray2696[i_620_];
                    ((Class242) class242).aByteArray2695[i_620_] = ((Class242) aClass242_6518).aByteArray2695[i_620_];
                }
            }
            class162_sub2_607_.aByteArray6490 = aByteArray6490;
        } else {
            class162_sub2_607_.aClass242_6518 = aClass242_6518;
            class162_sub2_607_.aShortArray6554 = aShortArray6554;
            class162_sub2_607_.aByteArray6490 = aByteArray6490;
            class162_sub2_607_.aShortArray6510 = aShortArray6510;
            class162_sub2_607_.aShortArray6556 = aShortArray6556;
        }
        if (!Class219.method1759(anInt6472, i, 0)) {
            if (!Class50.method399(i, anInt6472, false))
                class162_sub2_607_.aClass140_6491 = null;
            else
                class162_sub2_607_.aClass140_6491 = aClass140_6491;
        } else {
            class162_sub2_607_.aClass140_6491 = class162_sub2_606_.aClass140_6491;
            if (bool_608_)
                class162_sub2_607_.aByte6500 |= 0x4;
            ((Class140) class162_sub2_607_.aClass140_6491).aByte1664 = ((Class140) aClass140_6491).aByte1664;
            ((Class140) class162_sub2_607_.aClass140_6491).anInterface6_1662 = ((Class140) aClass140_6491).anInterface6_1662;
        }
        if (!Class355.method3780((byte) -109, anInt6472, i)) {
            class162_sub2_607_.aFloatArray6501 = aFloatArray6501;
            class162_sub2_607_.aFloatArray6469 = aFloatArray6469;
        } else {
            if (class162_sub2_606_.aFloatArray6501 == null || anInt6454 > class162_sub2_606_.aFloatArray6501.length) {
                int i_621_ = anInt6455;
                class162_sub2_607_.aFloatArray6469 = class162_sub2_606_.aFloatArray6469 = new float[i_621_];
                class162_sub2_607_.aFloatArray6501 = class162_sub2_606_.aFloatArray6501 = new float[i_621_];
            } else {
                class162_sub2_607_.aFloatArray6469 = class162_sub2_606_.aFloatArray6469;
                class162_sub2_607_.aFloatArray6501 = class162_sub2_606_.aFloatArray6501;
            }
            for (int i_622_ = 0; i_622_ < anInt6455; i_622_++) {
                class162_sub2_607_.aFloatArray6501[i_622_] = aFloatArray6501[i_622_];
                class162_sub2_607_.aFloatArray6469[i_622_] = aFloatArray6469[i_622_];
            }
        }
        if (!Class212.method1733(anInt6472, 13, i)) {
            if (Canvas_Sub1.method124(i, (byte) 34, anInt6472))
                class162_sub2_607_.aClass140_6544 = aClass140_6544;
            else
                class162_sub2_607_.aClass140_6544 = null;
        } else {
            if (bool_608_)
                class162_sub2_607_.aByte6500 |= 0x8;
            class162_sub2_607_.aClass140_6544 = class162_sub2_606_.aClass140_6544;
            ((Class140) class162_sub2_607_.aClass140_6544).aByte1664 = ((Class140) aClass140_6544).aByte1664;
            ((Class140) class162_sub2_607_.aClass140_6544).anInterface6_1662 = ((Class140) aClass140_6544).anInterface6_1662;
        }
        if (!Class143.method1296(i, -1, anInt6472)) {
            class162_sub2_607_.aShortArray6445 = aShortArray6445;
            class162_sub2_607_.aShortArray6524 = aShortArray6524;
            class162_sub2_607_.aShortArray6462 = aShortArray6462;
        } else {
            if (class162_sub2_606_.aShortArray6462 != null && class162_sub2_606_.aShortArray6462.length >= anInt6454) {
                class162_sub2_607_.aShortArray6445 = class162_sub2_606_.aShortArray6445;
                class162_sub2_607_.aShortArray6524 = class162_sub2_606_.aShortArray6524;
                class162_sub2_607_.aShortArray6462 = class162_sub2_606_.aShortArray6462;
            } else {
                int i_623_ = anInt6454;
                class162_sub2_607_.aShortArray6524 = class162_sub2_606_.aShortArray6524 = new short[i_623_];
                class162_sub2_607_.aShortArray6462 = class162_sub2_606_.aShortArray6462 = new short[i_623_];
                class162_sub2_607_.aShortArray6445 = class162_sub2_606_.aShortArray6445 = new short[i_623_];
            }
            for (int i_624_ = 0; anInt6454 > i_624_; i_624_++) {
                class162_sub2_607_.aShortArray6462[i_624_] = aShortArray6462[i_624_];
                class162_sub2_607_.aShortArray6524[i_624_] = aShortArray6524[i_624_];
                class162_sub2_607_.aShortArray6445[i_624_] = aShortArray6445[i_624_];
            }
        }
        if (Class48.method363(i, -1, anInt6472)) {
            if (bool_608_)
                class162_sub2_607_.aByte6500 |= 0x10;
            class162_sub2_607_.aClass352_6463 = class162_sub2_606_.aClass352_6463;
            ((Class352) class162_sub2_607_.aClass352_6463).anInterface1_4185 = ((Class352) aClass352_6463).anInterface1_4185;
        } else if (!Class283.method3054((byte) 112, anInt6472, i))
            class162_sub2_607_.aClass352_6463 = null;
        else
            class162_sub2_607_.aClass352_6463 = aClass352_6463;
        if (Class282_Sub29.method3045(3, i, anInt6472)) {
            if (class162_sub2_606_.aShortArray6437 == null || ((class162_sub2_606_.aShortArray6437.length ^ 0xffffffff) > (anInt6454 ^ 0xffffffff))) {
                int i_625_ = anInt6454;
                class162_sub2_607_.aShortArray6437 = class162_sub2_606_.aShortArray6437 = new short[i_625_];
            } else
                class162_sub2_607_.aShortArray6437 = class162_sub2_606_.aShortArray6437;
            for (int i_626_ = 0; anInt6454 > i_626_; i_626_++)
                class162_sub2_607_.aShortArray6437[i_626_] = aShortArray6437[i_626_];
        } else
            class162_sub2_607_.aShortArray6437 = aShortArray6437;
        if (!Class168.method1545(i, (byte) -124, anInt6472))
            class162_sub2_607_.aClass15Array6444 = aClass15Array6444;
        else if (class162_sub2_606_.aClass15Array6444 != null && ((anInt6475 ^ 0xffffffff) >= (class162_sub2_606_.aClass15Array6444.length ^ 0xffffffff))) {
            class162_sub2_607_.aClass15Array6444 = class162_sub2_606_.aClass15Array6444;
            for (int i_627_ = 0; anInt6475 > i_627_; i_627_++)
                class162_sub2_607_.aClass15Array6444[i_627_].method217(aClass15Array6444[i_627_], false);
        } else {
            int i_628_ = anInt6475;
            class162_sub2_607_.aClass15Array6444 = class162_sub2_606_.aClass15Array6444 = new Class15[i_628_];
            for (int i_629_ = 0; (anInt6475 ^ 0xffffffff) < (i_629_ ^ 0xffffffff); i_629_++)
                class162_sub2_607_.aClass15Array6444[i_629_] = aClass15Array6444[i_629_].method215(-1);
        }
        class162_sub2_607_.aClass124Array6527 = aClass124Array6527;
        class162_sub2_607_.aClass353Array6440 = aClass353Array6440;
        class162_sub2_607_.aShortArray6516 = aShortArray6516;
        class162_sub2_607_.anIntArrayArray6482 = anIntArrayArray6482;
        class162_sub2_607_.anIntArray6458 = anIntArray6458;
        class162_sub2_607_.anIntArrayArray6481 = anIntArrayArray6481;
        class162_sub2_607_.anIntArray6466 = anIntArray6466;
        if (aBoolean6539) {
            class162_sub2_607_.aBoolean6539 = true;
            class162_sub2_607_.aShort6522 = aShort6522;
            class162_sub2_607_.aShort6461 = aShort6461;
            class162_sub2_607_.aShort6517 = aShort6517;
            class162_sub2_607_.aShort6508 = aShort6508;
            class162_sub2_607_.aShort6467 = aShort6467;
            class162_sub2_607_.aShort6525 = aShort6525;
            class162_sub2_607_.aShort6521 = aShort6521;
            class162_sub2_607_.aShort6543 = aShort6543;
        } else
            class162_sub2_607_.aBoolean6539 = false;
        class162_sub2_607_.aClass40Array6479 = aClass40Array6479;
        class162_sub2_607_.anIntArrayArray6502 = anIntArrayArray6502;
        class162_sub2_607_.aShortArray6532 = aShortArray6532;
        class162_sub2_607_.aShortArray6442 = aShortArray6442;
        return class162_sub2_607_;
    }

    private final int method1479(int i, short i_630_, int i_631_, byte i_632_, int i_633_) {
        anInt6530++;
        if (i_633_ != 6)
            return 119;
        int i_634_ = (Node_Sub14_Sub39.anIntArray9600[Class237.method1852(i_631_, (byte) -124, i)]);
        if ((i_630_ ^ 0xffffffff) != 0) {
            Class312 class312 = ((ha) aHa_Sub2_6476).aD1414.method25(i_630_ & 0xffff, (byte) 126);
            int i_635_ = ((Class312) class312).aByte3630 & 0xff;
            if ((i_635_ ^ 0xffffffff) != -1) {
                int i_636_;
                if ((i_631_ ^ 0xffffffff) <= -1) {
                    if ((i_631_ ^ 0xffffffff) < -128)
                        i_636_ = 16777215;
                    else
                        i_636_ = i_631_ * 131586;
                } else
                    i_636_ = 0;
                if (i_635_ == 256)
                    i_634_ = i_636_;
                else {
                    int i_637_ = i_635_;
                    int i_638_ = -i_635_ + 256;
                    i_634_ = ((((0xff00 & i_634_) * i_638_ + (0xff00 & i_636_) * i_637_) & 0xff0000) + ((i_638_ * (i_634_ & 0xff00ff) + (i_636_ & 0xff00ff) * i_637_) & ~0xff00ff)) >> 1759865320;
                }
            }
            int i_639_ = 0xff & ((Class312) class312).aByte3625;
            if ((i_639_ ^ 0xffffffff) != -1) {
                i_639_ += 256;
                int i_640_ = i_639_ * ((0xff0000 & i_634_) >> -799119440);
                if ((i_640_ ^ 0xffffffff) < -65536)
                    i_640_ = 65535;
                int i_641_ = i_639_ * (0xff & i_634_ >> 1191486088);
                if ((i_641_ ^ 0xffffffff) < -65536)
                    i_641_ = 65535;
                int i_642_ = i_639_ * (i_634_ & 0xff);
                if ((i_642_ ^ 0xffffffff) < -65536)
                    i_642_ = 65535;
                i_634_ = ((0xff0088 & i_640_ << 628206120) + (0xff00 & i_641_) - -(i_642_ >> -1186541944));
            }
        }
        return -(i_632_ & 0xff) + (255 + (i_634_ << -2033673144));
    }

    Class162_Sub2(ha_Sub2 var_ha_Sub2) {
        anInt6439 = 0;
        anInt6455 = 0;
        aBoolean6477 = true;
        aBoolean6539 = false;
        anInt6449 = 0;
        aBoolean6484 = false;
        aBoolean6492 = false;
        aHa_Sub2_6476 = var_ha_Sub2;
        aClass140_6504 = new Class140(null, 5126, 3, 0);
        aClass140_6544 = new Class140(null, 5126, 2, 0);
        aClass140_6491 = new Class140(null, 5126, 3, 0);
        aClass140_6450 = new Class140(null, 5121, 4, 0);
        aClass352_6463 = new Class352();
    }

    final void method1428(Class162 class162, int i, int i_643_, int i_644_, boolean bool) {
        anInt6537++;
        Class162_Sub2 class162_sub2_645_ = (Class162_Sub2) class162;
        if (anInt6454 != 0 && class162_sub2_645_.anInt6454 != 0) {
            int i_646_ = class162_sub2_645_.anInt6497;
            int[] is = class162_sub2_645_.anIntArray6531;
            int[] is_647_ = class162_sub2_645_.anIntArray6451;
            int[] is_648_ = class162_sub2_645_.anIntArray6468;
            short[] is_649_ = class162_sub2_645_.aShortArray6554;
            short[] is_650_ = class162_sub2_645_.aShortArray6556;
            short[] is_651_ = class162_sub2_645_.aShortArray6510;
            byte[] is_652_ = class162_sub2_645_.aByteArray6490;
            short[] is_653_;
            byte[] is_654_;
            short[] is_655_;
            short[] is_656_;
            if (aClass242_6518 != null) {
                is_656_ = ((Class242) aClass242_6518).aShortArray2696;
                is_653_ = ((Class242) aClass242_6518).aShortArray2698;
                is_655_ = ((Class242) aClass242_6518).aShortArray2697;
                is_654_ = ((Class242) aClass242_6518).aByteArray2695;
            } else {
                is_653_ = null;
                is_654_ = null;
                is_655_ = null;
                is_656_ = null;
            }
            short[] is_657_;
            short[] is_658_;
            short[] is_659_;
            byte[] is_660_;
            if (class162_sub2_645_.aClass242_6518 == null) {
                is_657_ = null;
                is_659_ = null;
                is_660_ = null;
                is_658_ = null;
            } else {
                is_657_ = (((Class242) class162_sub2_645_.aClass242_6518).aShortArray2698);
                is_658_ = (((Class242) class162_sub2_645_.aClass242_6518).aShortArray2696);
                is_659_ = (((Class242) class162_sub2_645_.aClass242_6518).aShortArray2697);
                is_660_ = (((Class242) class162_sub2_645_.aClass242_6518).aByteArray2695);
            }
            int[] is_661_ = class162_sub2_645_.anIntArray6458;
            short[] is_662_ = class162_sub2_645_.aShortArray6516;
            if (!class162_sub2_645_.aBoolean6539)
                class162_sub2_645_.method1475(29866);
            int i_663_ = class162_sub2_645_.aShort6521;
            int i_664_ = class162_sub2_645_.aShort6543;
            int i_665_ = class162_sub2_645_.aShort6517;
            int i_666_ = class162_sub2_645_.aShort6461;
            int i_667_ = class162_sub2_645_.aShort6525;
            int i_668_ = class162_sub2_645_.aShort6522;
            for (int i_669_ = 0; (anInt6497 ^ 0xffffffff) < (i_669_ ^ 0xffffffff); i_669_++) {
                int i_670_ = -i_643_ + anIntArray6451[i_669_];
                if ((i_670_ ^ 0xffffffff) <= (i_663_ ^ 0xffffffff) && (i_664_ ^ 0xffffffff) <= (i_670_ ^ 0xffffffff)) {
                    int i_671_ = -i + anIntArray6531[i_669_];
                    if ((i_665_ ^ 0xffffffff) >= (i_671_ ^ 0xffffffff) && i_666_ >= i_671_) {
                        int i_672_ = anIntArray6468[i_669_] - i_644_;
                        if ((i_667_ ^ 0xffffffff) >= (i_672_ ^ 0xffffffff) && i_672_ <= i_668_) {
                            int i_673_ = -1;
                            int i_674_ = anIntArray6458[i_669_];
                            int i_675_ = anIntArray6458[1 + i_669_];
                            for (int i_676_ = i_674_; (i_675_ ^ 0xffffffff) < (i_676_ ^ 0xffffffff); i_676_++) {
                                i_673_ = aShortArray6516[i_676_] + -1;
                                if (i_673_ == -1 || aByteArray6490[i_673_] != 0)
                                    break;
                            }
                            if ((i_673_ ^ 0xffffffff) != 0) {
                                for (int i_677_ = 0; i_677_ < i_646_; i_677_++) {
                                    if (is[i_677_] == i_671_ && ((is_648_[i_677_] ^ 0xffffffff) == (i_672_ ^ 0xffffffff)) && ((i_670_ ^ 0xffffffff) == (is_647_[i_677_] ^ 0xffffffff))) {
                                        i_674_ = is_661_[i_677_];
                                        int i_678_ = -1;
                                        i_675_ = is_661_[i_677_ - -1];
                                        for (int i_679_ = i_674_; i_675_ > i_679_; i_679_++) {
                                            i_678_ = is_662_[i_679_] - 1;
                                            if (i_678_ == -1 || is_652_[i_678_] != 0)
                                                break;
                                        }
                                        if ((i_678_ ^ 0xffffffff) != 0) {
                                            if (is_655_ == null) {
                                                aClass242_6518 = new Class242();
                                                is_655_ = ((Class242) aClass242_6518).aShortArray2697 = (Node_Sub1.method1971((byte) 64, aShortArray6554));
                                                is_653_ = ((Class242) aClass242_6518).aShortArray2698 = (Node_Sub1.method1971((byte) 64, aShortArray6556));
                                                is_656_ = ((Class242) aClass242_6518).aShortArray2696 = (Node_Sub1.method1971((byte) 64, aShortArray6510));
                                                is_654_ = ((Class242) aClass242_6518).aByteArray2695 = (client.method103((byte) 3, aByteArray6490));
                                            }
                                            if (is_659_ == null) {
                                                Class242 class242 = (class162_sub2_645_.aClass242_6518 = new Class242());
                                                is_659_ = ((Class242) class242).aShortArray2697 = (Node_Sub1.method1971((byte) 64, is_649_));
                                                is_657_ = ((Class242) class242).aShortArray2698 = (Node_Sub1.method1971((byte) 64, is_650_));
                                                is_658_ = ((Class242) class242).aShortArray2696 = (Node_Sub1.method1971((byte) 64, is_651_));
                                                is_660_ = ((Class242) class242).aByteArray2695 = (client.method103((byte) 3, is_652_));
                                            }
                                            short i_680_ = aShortArray6554[i_673_];
                                            short i_681_ = aShortArray6556[i_673_];
                                            short i_682_ = aShortArray6510[i_673_];
                                            i_675_ = is_661_[i_677_ + 1];
                                            byte i_683_ = aByteArray6490[i_673_];
                                            i_674_ = is_661_[i_677_];
                                            for (int i_684_ = i_674_; ((i_675_ ^ 0xffffffff) < (i_684_ ^ 0xffffffff)); i_684_++) {
                                                int i_685_ = is_662_[i_684_] - 1;
                                                if (i_685_ == -1)
                                                    break;
                                                if (is_660_[i_685_] != 0) {
                                                    is_659_[i_685_] += i_680_;
                                                    is_657_[i_685_] += i_681_;
                                                    is_658_[i_685_] += i_682_;
                                                    is_660_[i_685_] += i_683_;
                                                }
                                            }
                                            i_680_ = is_649_[i_678_];
                                            i_674_ = anIntArray6458[i_669_];
                                            i_675_ = anIntArray6458[1 + i_669_];
                                            i_682_ = is_651_[i_678_];
                                            i_683_ = is_652_[i_678_];
                                            i_681_ = is_650_[i_678_];
                                            for (int i_686_ = i_674_; i_675_ > i_686_; i_686_++) {
                                                int i_687_ = -1 + (aShortArray6516[i_686_]);
                                                if (i_687_ == -1)
                                                    break;
                                                if (is_654_[i_687_] != 0) {
                                                    is_655_[i_687_] += i_680_;
                                                    is_653_[i_687_] += i_681_;
                                                    is_656_[i_687_] += i_682_;
                                                    is_654_[i_687_] += i_683_;
                                                }
                                            }
                                            if (aClass140_6491 == null && aClass140_6450 != null)
                                                ((Class140) aClass140_6450).anInterface6_1662 = null;
                                            if (aClass140_6491 != null)
                                                ((Class140) aClass140_6491).anInterface6_1662 = null;
                                            if ((class162_sub2_645_.aClass140_6491) == null && (class162_sub2_645_.aClass140_6450) != null)
                                                ((Class140) (class162_sub2_645_.aClass140_6450)).anInterface6_1662 = null;
                                            if ((class162_sub2_645_.aClass140_6491) != null)
                                                ((Class140) (class162_sub2_645_.aClass140_6491)).anInterface6_1662 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    Class162_Sub2(ha_Sub2 var_ha_Sub2, Class343 class343, int i, int i_688_, int i_689_, int i_690_) {
        anInt6439 = 0;
        anInt6455 = 0;
        aBoolean6477 = true;
        aBoolean6539 = false;
        anInt6449 = 0;
        aBoolean6484 = false;
        aBoolean6492 = false;
        anInt6472 = i_690_;
        aHa_Sub2_6476 = var_ha_Sub2;
        anInt6515 = i;
        if (aa_Sub2.method162(104, i_690_, i))
            aClass140_6504 = new Class140(null, 5126, 3, 0);
        if (Canvas_Sub1.method124(i, (byte) 85, i_690_))
            aClass140_6544 = new Class140(null, 5126, 2, 0);
        if (Class50.method399(i, i_690_, false))
            aClass140_6491 = new Class140(null, 5126, 3, 0);
        if (Class9.method191(i_690_, i, -17286))
            aClass140_6450 = new Class140(null, 5121, 4, 0);
        if (Class283.method3054((byte) 78, i_690_, i))
            aClass352_6463 = new Class352();
        d var_d = ((ha) var_ha_Sub2).aD1414;
        int[] is = new int[((Class343) class343).anInt4028];
        anIntArray6458 = new int[((Class343) class343).anInt4075 + 1];
        for (int i_691_ = 0; ((((Class343) class343).anInt4028 ^ 0xffffffff) < (i_691_ ^ 0xffffffff)); i_691_++) {
            if (((Class343) class343).aByteArray4076 == null || ((((Class343) class343).aByteArray4076[i_691_] ^ 0xffffffff) != -3)) {
                if (((Class343) class343).aShortArray4056 != null && ((Class343) class343).aShortArray4056[i_691_] != -1) {
                    Class312 class312 = var_d.method25(0xffff & (((Class343) class343).aShortArray4056[i_691_]), (byte) 127);
                    if (((anInt6472 & 0x40) == 0 || !((Class312) class312).aBoolean3622) && ((Class312) class312).aBoolean3631)
                        continue;
                }
                is[anInt6454++] = i_691_;
                anIntArray6458[(((Class343) class343).aShortArray4046[i_691_])]++;
                anIntArray6458[(((Class343) class343).aShortArray4024[i_691_])]++;
                anIntArray6458[(((Class343) class343).aShortArray4073[i_691_])]++;
            }
        }
        anInt6439 = anInt6454;
        long[] ls = new long[anInt6454];
        boolean bool = (0x100 & anInt6515) != 0;
        for (int i_692_ = 0; anInt6454 > i_692_; i_692_++) {
            int i_693_ = is[i_692_];
            Class312 class312 = null;
            int i_694_ = 0;
            int i_695_ = 0;
            int i_696_ = 0;
            int i_697_ = 0;
            if (((Class343) class343).aClass178Array4048 != null) {
                boolean bool_698_ = false;
                for (int i_699_ = 0; ((((Class343) class343).aClass178Array4048.length ^ 0xffffffff) < (i_699_ ^ 0xffffffff)); i_699_++) {
                    Class178 class178 = ((Class343) class343).aClass178Array4048[i_699_];
                    if (((Class178) class178).anInt2075 == i_693_) {
                        Class236 class236 = Node_Sub42_Sub3.method2637(0, (((Class178) class178).anInt2078));
                        if (((Class236) class236).aBoolean2631)
                            bool_698_ = true;
                        if ((((Class236) class236).anInt2623 ^ 0xffffffff) != 0) {
                            Class312 class312_700_ = var_d.method25((((Class236) class236).anInt2623), (byte) 125);
                            if (((Class312) class312_700_).anInt3629 == 2)
                                aBoolean6492 = true;
                        }
                    }
                }
                if (bool_698_) {
                    ls[i_692_] = 9223372036854775807L;
                    anInt6439--;
                    continue;
                }
            }
            int i_701_ = -1;
            if (((Class343) class343).aShortArray4056 != null) {
                i_701_ = ((Class343) class343).aShortArray4056[i_693_];
                if (i_701_ != -1) {
                    class312 = var_d.method25(0xffff & i_701_, (byte) 125);
                    if ((anInt6472 & 0x40) != 0 && ((Class312) class312).aBoolean3622) {
                        i_701_ = -1;
                        class312 = null;
                    } else {
                        i_697_ = ((Class312) class312).aByte3646;
                        if (((((Class312) class312).aByte3643 ^ 0xffffffff) != -1) || ((Class312) class312).aByte3642 != 0)
                            aBoolean6484 = true;
                        i_696_ = ((Class312) class312).aByte3624;
                    }
                }
            }
            boolean bool_702_ = ((((Class343) class343).aByteArray4061 != null && ((Class343) class343).aByteArray4061[i_693_] != 0) || (class312 != null && ((Class312) class312).anInt3629 != 0));
            if ((bool || bool_702_) && ((Class343) class343).aByteArray4072 != null)
                i_694_ += (((Class343) class343).aByteArray4072[i_693_] << 287006353);
            if (bool_702_)
                i_694_ += 65536;
            i_694_ += (i_696_ & 0xff) << -1908156152;
            i_694_ += i_697_ & 0xff;
            i_695_ += (0xffff & i_701_) << 2120497200;
            i_695_ += 0xffff & i_692_;
            ls[i_692_] = (long) i_695_ + ((long) i_694_ << -153494368);
            aBoolean6492 |= bool_702_;
            Class162_Sub2 class162_sub2_703_ = this;
            class162_sub2_703_.aBoolean6484 = (class162_sub2_703_.aBoolean6484 | (class312 != null && ((((Class312) class312).aByte3643 ^ 0xffffffff) != -1 || ((((Class312) class312).aByte3642 ^ 0xffffffff) != -1))));
        }
        Class346_Sub7_Sub2_Sub2.method3613(ls, is, (byte) -123);
        aShortArray6442 = ((Class343) class343).aShortArray4038;
        anInt6497 = ((Class343) class343).anInt4075;
        anIntArray6531 = ((Class343) class343).anIntArray4027;
        anInt6449 = ((Class343) class343).anInt4063;
        anIntArray6468 = ((Class343) class343).anIntArray4040;
        anIntArray6451 = ((Class343) class343).anIntArray4069;
        aClass40Array6479 = ((Class343) class343).aClass40Array4045;
        Class10[] class10s = new Class10[anInt6497];
        aClass124Array6527 = ((Class343) class343).aClass124Array4060;
        if (((Class343) class343).aClass178Array4048 != null) {
            anInt6475 = ((Class343) class343).aClass178Array4048.length;
            aClass353Array6440 = new Class353[anInt6475];
            aClass15Array6444 = new Class15[anInt6475];
            for (int i_704_ = 0; (i_704_ ^ 0xffffffff) > (anInt6475 ^ 0xffffffff); i_704_++) {
                Class178 class178 = ((Class343) class343).aClass178Array4048[i_704_];
                Class236 class236 = Node_Sub42_Sub3.method2637(0, ((Class178) class178).anInt2078);
                int i_705_ = -1;
                for (int i_706_ = 0; anInt6454 > i_706_; i_706_++) {
                    if (is[i_706_] == ((Class178) class178).anInt2075) {
                        i_705_ = i_706_;
                        break;
                    }
                }
                if ((i_705_ ^ 0xffffffff) == 0)
                    throw new RuntimeException();
                int i_707_ = ((Node_Sub14_Sub39.anIntArray9600[(((Class343) class343).aShortArray4054[((Class178) class178).anInt2075]) & 0xffff]) & 0xffffff);
                i_707_ = (i_707_ | (255 + -(((Class343) class343).aByteArray4061 == null ? (int) 0 : (((Class343) class343).aByteArray4061[((Class178) class178).anInt2075])) << 1637824600));
                aClass353Array6440[i_704_] = new Class353(i_705_, (((Class343) class343).aShortArray4046[((Class178) class178).anInt2075]), (((Class343) class343).aShortArray4024[((Class178) class178).anInt2075]), (((Class343) class343).aShortArray4073[((Class178) class178).anInt2075]), ((Class236) class236).anInt2627, ((Class236) class236).anInt2626, ((Class236) class236).anInt2623, ((Class236) class236).anInt2628, ((Class236) class236).anInt2622, ((Class236) class236).aBoolean2631, ((Class236) class236).aBoolean2624, ((Class178) class178).anInt2077);
                aClass15Array6444[i_704_] = new Class15(i_707_);
            }
        }
        int i_708_ = anInt6454 * 3;
        aShort6496 = (short) i_688_;
        aShortArray6556 = new short[i_708_];
        aShortArray6462 = new short[anInt6454];
        if (((Class343) class343).aShortArray4064 != null)
            aShortArray6532 = new short[anInt6454];
        aFloatArray6469 = new float[i_708_];
        Class142.aLongArray1673 = new long[i_708_];
        aShortArray6535 = new short[anInt6454];
        aShortArray6516 = new short[i_708_];
        aShortArray6524 = new short[anInt6454];
        aShortArray6445 = new short[anInt6454];
        aShortArray6510 = new short[i_708_];
        aShortArray6437 = new short[anInt6454];
        aShortArray6554 = new short[i_708_];
        aByteArray6473 = new byte[anInt6454];
        aFloatArray6501 = new float[i_708_];
        aShort6488 = (short) i_689_;
        aByteArray6490 = new byte[i_708_];
        int i_709_ = 0;
        for (int i_710_ = 0; ((i_710_ ^ 0xffffffff) > (((Class343) class343).anInt4075 ^ 0xffffffff)); i_710_++) {
            int i_711_ = anIntArray6458[i_710_];
            anIntArray6458[i_710_] = i_709_;
            class10s[i_710_] = new Class10();
            i_709_ += i_711_;
        }
        anIntArray6458[((Class343) class343).anInt4075] = i_709_;
        Class75 class75 = Class316_Sub2.method3301(anInt6454, class343, 0, is);
        Class216[] class216s = new Class216[((Class343) class343).anInt4028];
        for (int i_712_ = 0; i_712_ < ((Class343) class343).anInt4028; i_712_++) {
            short i_713_ = ((Class343) class343).aShortArray4046[i_712_];
            short i_714_ = ((Class343) class343).aShortArray4024[i_712_];
            short i_715_ = ((Class343) class343).aShortArray4073[i_712_];
            int i_716_ = anIntArray6531[i_714_] + -anIntArray6531[i_713_];
            int i_717_ = -anIntArray6451[i_713_] + anIntArray6451[i_714_];
            int i_718_ = -anIntArray6468[i_713_] + anIntArray6468[i_714_];
            int i_719_ = -anIntArray6531[i_713_] + anIntArray6531[i_715_];
            int i_720_ = -anIntArray6451[i_713_] + anIntArray6451[i_715_];
            int i_721_ = anIntArray6468[i_715_] + -anIntArray6468[i_713_];
            int i_722_ = i_717_ * i_721_ - i_720_ * i_718_;
            int i_723_ = -(i_716_ * i_721_) + i_719_ * i_718_;
            int i_724_;
            for (i_724_ = -(i_719_ * i_717_) + i_720_ * i_716_; (i_722_ > 8192 || i_723_ > 8192 || (i_724_ ^ 0xffffffff) < -8193 || (i_722_ ^ 0xffffffff) > 8191 || (i_723_ ^ 0xffffffff) > 8191 || i_724_ < -8192); i_723_ >>= 1) {
                i_722_ >>= 1;
                i_724_ >>= 1;
            }
            int i_725_ = (int) Math.sqrt((double) (i_723_ * i_723_ + (i_722_ * i_722_ - -(i_724_ * i_724_))));
            if ((i_725_ ^ 0xffffffff) >= -1)
                i_725_ = 1;
            i_723_ = i_723_ * 256 / i_725_;
            i_722_ = i_722_ * 256 / i_725_;
            i_724_ = i_724_ * 256 / i_725_;
            byte i_726_ = (((Class343) class343).aByteArray4076 != null ? ((Class343) class343).aByteArray4076[i_712_] : (byte) 0);
            if (i_726_ != 0) {
                if ((i_726_ ^ 0xffffffff) == -2) {
                    Class216 class216 = class216s[i_712_] = new Class216();
                    ((Class216) class216).anInt2488 = i_722_;
                    ((Class216) class216).anInt2487 = i_723_;
                    ((Class216) class216).anInt2485 = i_724_;
                }
            } else {
                Class10 class10 = class10s[i_713_];
                ((Class10) class10).anInt228++;
                ((Class10) class10).anInt227 += i_723_;
                ((Class10) class10).anInt234 += i_722_;
                ((Class10) class10).anInt229 += i_724_;
                class10 = class10s[i_714_];
                ((Class10) class10).anInt227 += i_723_;
                ((Class10) class10).anInt229 += i_724_;
                ((Class10) class10).anInt234 += i_722_;
                ((Class10) class10).anInt228++;
                class10 = class10s[i_715_];
                ((Class10) class10).anInt227 += i_723_;
                ((Class10) class10).anInt234 += i_722_;
                ((Class10) class10).anInt228++;
                ((Class10) class10).anInt229 += i_724_;
            }
        }
        for (int i_727_ = 0; i_727_ < anInt6454; i_727_++) {
            int i_728_ = is[i_727_];
            int i_729_ = ((Class343) class343).aShortArray4054[i_728_] & 0xffff;
            int i_730_;
            if (((Class343) class343).aByteArray4026 == null)
                i_730_ = -1;
            else
                i_730_ = ((Class343) class343).aByteArray4026[i_728_];
            int i_731_;
            if (((Class343) class343).aByteArray4061 != null)
                i_731_ = ((Class343) class343).aByteArray4061[i_728_] & 0xff;
            else
                i_731_ = 0;
            short i_732_ = (((Class343) class343).aShortArray4056 != null ? ((Class343) class343).aShortArray4056[i_728_] : (short) -1);
            if ((i_732_ ^ 0xffffffff) != 0 && (0x40 & anInt6472) != 0) {
                Class312 class312 = var_d.method25(0xffff & i_732_, (byte) 127);
                if (((Class312) class312).aBoolean3622)
                    i_732_ = (short) -1;
            }
            float f = 0.0F;
            float f_733_ = 0.0F;
            float f_734_ = 0.0F;
            float f_735_ = 0.0F;
            float f_736_ = 0.0F;
            float f_737_ = 0.0F;
            int i_738_ = 0;
            int i_739_ = 0;
            int i_740_ = 0;
            if (i_732_ != -1) {
                if ((i_730_ ^ 0xffffffff) == 0) {
                    i_739_ = 2;
                    f_735_ = 1.0F;
                    f_733_ = 1.0F;
                    i_738_ = 1;
                    f_736_ = 0.0F;
                    f = 0.0F;
                    f_734_ = 1.0F;
                    f_737_ = 0.0F;
                } else {
                    i_730_ &= 0xff;
                    byte i_741_ = ((Class343) class343).aByteArray4033[i_730_];
                    if (i_741_ == 0) {
                        short i_742_ = ((Class343) class343).aShortArray4046[i_728_];
                        short i_743_ = ((Class343) class343).aShortArray4024[i_728_];
                        short i_744_ = ((Class343) class343).aShortArray4073[i_728_];
                        short i_745_ = ((Class343) class343).aShortArray4047[i_730_];
                        short i_746_ = ((Class343) class343).aShortArray4049[i_730_];
                        short i_747_ = ((Class343) class343).aShortArray4070[i_730_];
                        float f_748_ = (float) (((Class343) class343).anIntArray4027[i_745_]);
                        float f_749_ = (float) (((Class343) class343).anIntArray4069[i_745_]);
                        float f_750_ = (float) (((Class343) class343).anIntArray4040[i_745_]);
                        float f_751_ = -f_748_ + (float) (((Class343) class343).anIntArray4027[i_746_]);
                        float f_752_ = ((float) (((Class343) class343).anIntArray4069[i_746_]) - f_749_);
                        float f_753_ = -f_750_ + (float) (((Class343) class343).anIntArray4040[i_746_]);
                        float f_754_ = -f_748_ + (float) (((Class343) class343).anIntArray4027[i_747_]);
                        float f_755_ = ((float) (((Class343) class343).anIntArray4069[i_747_]) - f_749_);
                        float f_756_ = -f_750_ + (float) (((Class343) class343).anIntArray4040[i_747_]);
                        float f_757_ = -f_748_ + (float) (((Class343) class343).anIntArray4027[i_742_]);
                        float f_758_ = -f_749_ + (float) (((Class343) class343).anIntArray4069[i_742_]);
                        float f_759_ = ((float) (((Class343) class343).anIntArray4040[i_742_]) - f_750_);
                        float f_760_ = ((float) (((Class343) class343).anIntArray4027[i_743_]) - f_748_);
                        float f_761_ = ((float) (((Class343) class343).anIntArray4069[i_743_]) - f_749_);
                        float f_762_ = -f_750_ + (float) (((Class343) class343).anIntArray4040[i_743_]);
                        float f_763_ = ((float) (((Class343) class343).anIntArray4027[i_744_]) - f_748_);
                        float f_764_ = ((float) (((Class343) class343).anIntArray4069[i_744_]) - f_749_);
                        float f_765_ = -f_750_ + (float) (((Class343) class343).anIntArray4040[i_744_]);
                        float f_766_ = f_752_ * f_756_ - f_755_ * f_753_;
                        float f_767_ = f_754_ * f_753_ - f_751_ * f_756_;
                        float f_768_ = -(f_754_ * f_752_) + f_751_ * f_755_;
                        float f_769_ = f_768_ * f_755_ - f_767_ * f_756_;
                        float f_770_ = f_756_ * f_766_ - f_768_ * f_754_;
                        float f_771_ = -(f_755_ * f_766_) + f_754_ * f_767_;
                        float f_772_ = 1.0F / (f_770_ * f_752_ + f_751_ * f_769_ + f_771_ * f_753_);
                        f_736_ = (f_764_ * f_770_ + f_769_ * f_763_ + f_765_ * f_771_) * f_772_;
                        f = f_772_ * (f_757_ * f_769_ + f_758_ * f_770_ + f_759_ * f_771_);
                        f_734_ = f_772_ * (f_762_ * f_771_ + (f_760_ * f_769_ + f_761_ * f_770_));
                        f_770_ = f_753_ * f_766_ - f_751_ * f_768_;
                        f_771_ = -(f_766_ * f_752_) + f_751_ * f_767_;
                        f_769_ = -(f_753_ * f_767_) + f_752_ * f_768_;
                        f_772_ = 1.0F / (f_756_ * f_771_ + (f_754_ * f_769_ + f_770_ * f_755_));
                        f_733_ = (f_759_ * f_771_ + (f_770_ * f_758_ + f_757_ * f_769_)) * f_772_;
                        f_737_ = (f_771_ * f_765_ + (f_770_ * f_764_ + f_763_ * f_769_)) * f_772_;
                        f_735_ = f_772_ * (f_762_ * f_771_ + (f_760_ * f_769_ + f_770_ * f_761_));
                    } else {
                        short i_773_ = ((Class343) class343).aShortArray4046[i_728_];
                        short i_774_ = ((Class343) class343).aShortArray4024[i_728_];
                        short i_775_ = ((Class343) class343).aShortArray4073[i_728_];
                        int i_776_ = ((Class75) class75).anIntArray974[i_730_];
                        int i_777_ = ((Class75) class75).anIntArray973[i_730_];
                        int i_778_ = ((Class75) class75).anIntArray976[i_730_];
                        float[] fs = ((Class75) class75).aFloatArrayArray979[i_730_];
                        byte i_779_ = ((Class343) class343).aByteArray4042[i_730_];
                        float f_780_ = ((float) (((Class343) class343).anIntArray4041[i_730_]) / 256.0F);
                        if (i_741_ == 1) {
                            float f_781_ = ((float) (((Class343) class343).anIntArray4021[i_730_]) / 1024.0F);
                            Class9.method192(-126, ((Class343) class343).anIntArray4040[i_773_], Class275_Sub2.aFloatArray8607, i_779_, ((Class343) class343).anIntArray4027[i_773_], i_777_, f_780_, fs, f_781_, i_776_, ((Class343) class343).anIntArray4069[i_773_], i_778_);
                            f_733_ = Class275_Sub2.aFloatArray8607[1];
                            f = Class275_Sub2.aFloatArray8607[0];
                            Class9.method192(-118, ((Class343) class343).anIntArray4040[i_774_], Class275_Sub2.aFloatArray8607, i_779_, ((Class343) class343).anIntArray4027[i_774_], i_777_, f_780_, fs, f_781_, i_776_, ((Class343) class343).anIntArray4069[i_774_], i_778_);
                            f_735_ = Class275_Sub2.aFloatArray8607[1];
                            f_734_ = Class275_Sub2.aFloatArray8607[0];
                            Class9.method192(-107, ((Class343) class343).anIntArray4040[i_775_], Class275_Sub2.aFloatArray8607, i_779_, ((Class343) class343).anIntArray4027[i_775_], i_777_, f_780_, fs, f_781_, i_776_, ((Class343) class343).anIntArray4069[i_775_], i_778_);
                            f_737_ = Class275_Sub2.aFloatArray8607[1];
                            f_736_ = Class275_Sub2.aFloatArray8607[0];
                            float f_782_ = f_781_ / 2.0F;
                            if ((0x1 & i_779_ ^ 0xffffffff) != -1) {
                                if (f_737_ - f_733_ > f_782_) {
                                    f_737_ -= f_781_;
                                    i_739_ = 1;
                                } else if (f_782_ < -f_737_ + f_733_) {
                                    i_739_ = 2;
                                    f_737_ += f_781_;
                                }
                                if (f_735_ - f_733_ > f_782_) {
                                    i_738_ = 1;
                                    f_735_ -= f_781_;
                                } else if (f_733_ - f_735_ > f_782_) {
                                    f_735_ += f_781_;
                                    i_738_ = 2;
                                }
                            } else {
                                if (!(f_782_ < f_736_ - f)) {
                                    if (-f_736_ + f > f_782_) {
                                        f_736_ += f_781_;
                                        i_739_ = 2;
                                    }
                                } else {
                                    f_736_ -= f_781_;
                                    i_739_ = 1;
                                }
                                if (!(f_734_ - f > f_782_)) {
                                    if (f_782_ < -f_734_ + f) {
                                        f_734_ += f_781_;
                                        i_738_ = 2;
                                    }
                                } else {
                                    i_738_ = 1;
                                    f_734_ -= f_781_;
                                }
                            }
                        } else if ((i_741_ ^ 0xffffffff) == -3) {
                            float f_783_ = ((float) (((Class343) class343).anIntArray4032[i_730_]) / 256.0F);
                            float f_784_ = ((float) (((Class343) class343).anIntArray4034[i_730_]) / 256.0F);
                            int i_785_ = (((Class343) class343).anIntArray4027[i_774_] + -(((Class343) class343).anIntArray4027[i_773_]));
                            int i_786_ = (-(((Class343) class343).anIntArray4069[i_773_]) + (((Class343) class343).anIntArray4069[i_774_]));
                            int i_787_ = (((Class343) class343).anIntArray4040[i_774_] - (((Class343) class343).anIntArray4040[i_773_]));
                            int i_788_ = (-(((Class343) class343).anIntArray4027[i_773_]) + (((Class343) class343).anIntArray4027[i_775_]));
                            int i_789_ = (-(((Class343) class343).anIntArray4069[i_773_]) + (((Class343) class343).anIntArray4069[i_775_]));
                            int i_790_ = (((Class343) class343).anIntArray4040[i_775_] + -(((Class343) class343).anIntArray4040[i_773_]));
                            int i_791_ = -(i_787_ * i_789_) + i_790_ * i_786_;
                            int i_792_ = -(i_785_ * i_790_) + i_788_ * i_787_;
                            int i_793_ = i_785_ * i_789_ + -(i_786_ * i_788_);
                            float f_794_ = 64.0F / (float) (((Class343) class343).anIntArray4058[i_730_]);
                            float f_795_ = 64.0F / (float) (((Class343) class343).anIntArray4029[i_730_]);
                            float f_796_ = 64.0F / (float) (((Class343) class343).anIntArray4021[i_730_]);
                            float f_797_ = ((fs[1] * (float) i_792_ + fs[0] * (float) i_791_ + (float) i_793_ * fs[2]) / f_794_);
                            float f_798_ = (((float) i_793_ * fs[5] + (fs[3] * (float) i_791_ + fs[4] * (float) i_792_)) / f_795_);
                            float f_799_ = (((float) i_792_ * fs[7] + fs[6] * (float) i_791_ + fs[8] * (float) i_793_) / f_796_);
                            i_740_ = Class139.method1280(f_797_, f_798_, f_799_, (byte) 49);
                            Node_Sub8_Sub6.method2061(f_784_, i_776_, ((Class343) class343).anIntArray4040[i_773_], i_778_, f_783_, (byte) 9, i_777_, ((Class343) class343).anIntArray4027[i_773_], ((Class343) class343).anIntArray4069[i_773_], f_780_, i_779_, Class275_Sub2.aFloatArray8607, fs, i_740_);
                            f_733_ = Class275_Sub2.aFloatArray8607[1];
                            f = Class275_Sub2.aFloatArray8607[0];
                            Node_Sub8_Sub6.method2061(f_784_, i_776_, ((Class343) class343).anIntArray4040[i_774_], i_778_, f_783_, (byte) 9, i_777_, ((Class343) class343).anIntArray4027[i_774_], ((Class343) class343).anIntArray4069[i_774_], f_780_, i_779_, Class275_Sub2.aFloatArray8607, fs, i_740_);
                            f_735_ = Class275_Sub2.aFloatArray8607[1];
                            f_734_ = Class275_Sub2.aFloatArray8607[0];
                            Node_Sub8_Sub6.method2061(f_784_, i_776_, ((Class343) class343).anIntArray4040[i_775_], i_778_, f_783_, (byte) 9, i_777_, ((Class343) class343).anIntArray4027[i_775_], ((Class343) class343).anIntArray4069[i_775_], f_780_, i_779_, Class275_Sub2.aFloatArray8607, fs, i_740_);
                            f_736_ = Class275_Sub2.aFloatArray8607[0];
                            f_737_ = Class275_Sub2.aFloatArray8607[1];
                        } else if (i_741_ == 3) {
                            Node_Sub8_Sub11.method2085(i_779_, ((Class343) class343).anIntArray4069[i_773_], Class275_Sub2.aFloatArray8607, 8, f_780_, i_777_, ((Class343) class343).anIntArray4040[i_773_], ((Class343) class343).anIntArray4027[i_773_], i_776_, i_778_, fs);
                            f_733_ = Class275_Sub2.aFloatArray8607[1];
                            f = Class275_Sub2.aFloatArray8607[0];
                            Node_Sub8_Sub11.method2085(i_779_, ((Class343) class343).anIntArray4069[i_774_], Class275_Sub2.aFloatArray8607, 8, f_780_, i_777_, ((Class343) class343).anIntArray4040[i_774_], ((Class343) class343).anIntArray4027[i_774_], i_776_, i_778_, fs);
                            f_734_ = Class275_Sub2.aFloatArray8607[0];
                            f_735_ = Class275_Sub2.aFloatArray8607[1];
                            Node_Sub8_Sub11.method2085(i_779_, ((Class343) class343).anIntArray4069[i_775_], Class275_Sub2.aFloatArray8607, 8, f_780_, i_777_, ((Class343) class343).anIntArray4040[i_775_], ((Class343) class343).anIntArray4027[i_775_], i_776_, i_778_, fs);
                            f_737_ = Class275_Sub2.aFloatArray8607[1];
                            f_736_ = Class275_Sub2.aFloatArray8607[0];
                            if ((i_779_ & 0x1) == 0) {
                                if (!(-f + f_734_ > 0.5F)) {
                                    if (-f_734_ + f > 0.5F) {
                                        i_738_ = 2;
                                        f_734_++;
                                    }
                                } else {
                                    i_738_ = 1;
                                    f_734_--;
                                }
                                if (!(f_736_ - f > 0.5F)) {
                                    if (-f_736_ + f > 0.5F) {
                                        f_736_++;
                                        i_739_ = 2;
                                    }
                                } else {
                                    i_739_ = 1;
                                    f_736_--;
                                }
                            } else {
                                if (-f_733_ + f_737_ > 0.5F) {
                                    f_737_--;
                                    i_739_ = 1;
                                } else if (-f_737_ + f_733_ > 0.5F) {
                                    f_737_++;
                                    i_739_ = 2;
                                }
                                if (f_735_ - f_733_ > 0.5F) {
                                    f_735_--;
                                    i_738_ = 1;
                                } else if (-f_735_ + f_733_ > 0.5F) {
                                    i_738_ = 2;
                                    f_735_++;
                                }
                            }
                        }
                    }
                }
            }
            byte i_800_;
            if (((Class343) class343).aByteArray4076 != null)
                i_800_ = ((Class343) class343).aByteArray4076[i_728_];
            else
                i_800_ = (byte) 0;
            if (i_800_ == 0) {
                long l = ((long) (i_730_ << -1057778366) - -(((long) (i_729_ << 35063912) + ((long) (i_740_ << 310321816) + (long) i_731_)) << 1953247456));
                short i_801_ = ((Class343) class343).aShortArray4046[i_728_];
                short i_802_ = ((Class343) class343).aShortArray4024[i_728_];
                short i_803_ = ((Class343) class343).aShortArray4073[i_728_];
                Class10 class10 = class10s[i_801_];
                aShortArray6462[i_727_] = method1471(((Class10) class10).anInt229, ((Class10) class10).anInt227, (byte) 98, f, class343, ((Class10) class10).anInt228, i_801_, l, f_733_, ((Class10) class10).anInt234);
                class10 = class10s[i_802_];
                aShortArray6524[i_727_] = method1471(((Class10) class10).anInt229, ((Class10) class10).anInt227, (byte) 98, f_734_, class343, ((Class10) class10).anInt228, i_802_, l + (long) i_738_, f_735_, ((Class10) class10).anInt234);
                class10 = class10s[i_803_];
                aShortArray6445[i_727_] = method1471(((Class10) class10).anInt229, ((Class10) class10).anInt227, (byte) 98, f_736_, class343, ((Class10) class10).anInt228, i_803_, l + (long) i_739_, f_737_, ((Class10) class10).anInt234);
            } else if ((i_800_ ^ 0xffffffff) == -2) {
                Class216 class216 = class216s[i_728_];
                long l = ((((long) (i_729_ << 761944008) + ((long) (i_740_ << -1314278696) + (long) i_731_)) << 676794080) + (long) ((((Class216) class216).anInt2485 + 256 << 1371612246) + (256 + ((Class216) class216).anInt2487 << 1238578060) + ((((Class216) class216).anInt2488 <= 0 ? 2048 : 1024) + (i_730_ << -1320250334))));
                aShortArray6462[i_727_] = method1471(((Class216) class216).anInt2485, ((Class216) class216).anInt2487, (byte) 98, f, class343, 0, ((Class343) class343).aShortArray4046[i_728_], l, f_733_, ((Class216) class216).anInt2488);
                aShortArray6524[i_727_] = method1471(((Class216) class216).anInt2485, ((Class216) class216).anInt2487, (byte) 98, f_734_, class343, 0, ((Class343) class343).aShortArray4024[i_728_], l + (long) i_738_, f_735_, ((Class216) class216).anInt2488);
                aShortArray6445[i_727_] = method1471(((Class216) class216).anInt2485, ((Class216) class216).anInt2487, (byte) 98, f_736_, class343, 0, ((Class343) class343).aShortArray4073[i_728_], l + (long) i_739_, f_737_, ((Class216) class216).anInt2488);
            }
            if (((Class343) class343).aByteArray4061 != null)
                aByteArray6473[i_727_] = ((Class343) class343).aByteArray4061[i_728_];
            if (((Class343) class343).aShortArray4064 != null)
                aShortArray6532[i_727_] = ((Class343) class343).aShortArray4064[i_728_];
            aShortArray6535[i_727_] = ((Class343) class343).aShortArray4054[i_728_];
            aShortArray6437[i_727_] = i_732_;
        }
        int i_804_ = 0;
        short i_805_ = -10000;
        for (int i_806_ = 0; (anInt6439 ^ 0xffffffff) < (i_806_ ^ 0xffffffff); i_806_++) {
            short i_807_ = aShortArray6437[i_806_];
            if (i_805_ != i_807_) {
                i_804_++;
                i_805_ = i_807_;
            }
        }
        anIntArray6466 = new int[i_804_ + 1];
        i_805_ = (short) -10000;
        i_804_ = 0;
        for (int i_808_ = 0; i_808_ < anInt6439; i_808_++) {
            short i_809_ = aShortArray6437[i_808_];
            if (i_805_ != i_809_) {
                anIntArray6466[i_804_++] = i_808_;
                i_805_ = i_809_;
            }
        }
        anIntArray6466[i_804_] = anInt6439;
        Class142.aLongArray1673 = null;
        aShortArray6554 = Node_Sub8_Sub10.method2075(aShortArray6554, anInt6455, (byte) 103);
        aShortArray6556 = Node_Sub8_Sub10.method2075(aShortArray6556, anInt6455, (byte) 103);
        aShortArray6510 = Node_Sub8_Sub10.method2075(aShortArray6510, anInt6455, (byte) 103);
        aByteArray6490 = Node_Sub14_Sub16.method2323(anInt6455, aByteArray6490, (byte) 108);
        aFloatArray6501 = Class340_Sub8.method3466(false, aFloatArray6501, anInt6455);
        aFloatArray6469 = Class340_Sub8.method3466(false, aFloatArray6469, anInt6455);
        if (((Class343) class343).anIntArray4057 != null && Class241.method1927(106, i, anInt6472))
            anIntArrayArray6481 = class343.method3504(false, 61);
        if (((Class343) class343).aClass178Array4048 != null && Class141.method1286(anInt6472, i, (byte) -124))
            anIntArrayArray6482 = class343.method3506(-15362);
        if (((Class343) class343).anIntArray4030 != null && Class316_Sub1_Sub1.method3297(i, 126, anInt6472)) {
            int i_810_ = 0;
            int[] is_811_ = new int[256];
            for (int i_812_ = 0; i_812_ < anInt6454; i_812_++) {
                int i_813_ = ((Class343) class343).anIntArray4030[is[i_812_]];
                if (i_813_ >= 0) {
                    if ((i_810_ ^ 0xffffffff) > (i_813_ ^ 0xffffffff))
                        i_810_ = i_813_;
                    is_811_[i_813_]++;
                }
            }
            anIntArrayArray6502 = new int[i_810_ + 1][];
            for (int i_814_ = 0; i_810_ >= i_814_; i_814_++) {
                anIntArrayArray6502[i_814_] = new int[is_811_[i_814_]];
                is_811_[i_814_] = 0;
            }
            for (int i_815_ = 0; i_815_ < anInt6454; i_815_++) {
                int i_816_ = ((Class343) class343).anIntArray4030[is[i_815_]];
                if ((i_816_ ^ 0xffffffff) <= -1)
                    anIntArrayArray6502[i_816_][is_811_[i_816_]++] = i_815_;
            }
        }
    }

    final void method1435() {
        anInt6545++;
        if ((anInt6455 ^ 0xffffffff) < -1 && anInt6439 > 0) {
            method1473(0, false);
            if ((0x10 & aByte6500 ^ 0xffffffff) == -1 && ((Class352) aClass352_6463).anInterface1_4185 == null)
                method1477(11297, false);
            method1468((byte) -78);
        }
    }
}
