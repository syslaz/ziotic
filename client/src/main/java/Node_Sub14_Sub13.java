/* Class248_Sub14_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Node_Sub14_Sub13 extends Node_Sub14 {
    static int anInt9280;
    static int anInt9281;
    private int anInt9282;
    private int anInt9283;
    private int anInt9284;
    private int anInt9285;
    static int anInt9286 = 0;
    private int anInt9287;
    private int[][] anIntArrayArray9288;
    static int anInt9289;
    static Class129[] aClass129Array9290;
    private int[][] anIntArrayArray9291;
    private int anInt9292 = 204;
    private int anInt9293;
    private int[] anIntArray9294;
    static int anInt9295;
    static int anInt9296;
    private int anInt9297;
    static int anInt9298;
    static OutgoingOpcode aOutgoingOpcode_9299 = new OutgoingOpcode(35, 6);
    private int anInt9300;
    private int anInt9301;
    private int anInt9302;

    final int[] method2264(byte i, int i_0_) {
        anInt9298++;
        if (i != -40)
            return null;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_1_ = 0;
            int i_2_;
            for (i_2_ = Node_Sub14_Sub3.anIntArray9184[i_0_] - -anInt9284; i_2_ < 0; i_2_ += 4096) {
                /* empty */
            }
            for (/**/; (i_2_ ^ 0xffffffff) < -4097; i_2_ -= 4096) {
                /* empty */
            }
            for (/**/; i_1_ < anInt9283; i_1_++) {
                if ((i_2_ ^ 0xffffffff) > (anIntArray9294[i_1_] ^ 0xffffffff))
                    break;
            }
            int i_3_ = -1 + i_1_;
            boolean bool = (i_1_ & 0x1) == 0;
            int i_4_ = anIntArray9294[i_1_];
            int i_5_ = anIntArray9294[-1 + i_1_];
            if (i_2_ > i_5_ + anInt9287 && (i_4_ + -anInt9287 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
                for (int i_6_ = 0; Class185.anInt2164 > i_6_; i_6_++) {
                    int i_7_ = bool ? anInt9302 : -anInt9302;
                    int i_8_ = 0;
                    int i_9_;
                    for (i_9_ = (Node_Sub8_Sub3.anIntArray8921[i_6_] - -(i_7_ * anInt9282 >> -68952628)); i_9_ < 0; i_9_ += 4096) {
                        /* empty */
                    }
                    for (/**/; i_9_ > 4096; i_9_ -= 4096) {
                        /* empty */
                    }
                    for (/**/; (i_8_ ^ 0xffffffff) > (anInt9301 ^ 0xffffffff); i_8_++) {
                        if ((i_9_ ^ 0xffffffff) > (anIntArrayArray9288[i_3_][i_8_] ^ 0xffffffff))
                            break;
                    }
                    int i_10_ = -1 + i_8_;
                    int i_11_ = anIntArrayArray9288[i_3_][i_8_];
                    int i_12_ = anIntArrayArray9288[i_3_][i_10_];
                    if ((i_12_ + anInt9287 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff) || (i_9_ ^ 0xffffffff) <= (-anInt9287 + i_11_ ^ 0xffffffff))
                        is[i_6_] = 0;
                    else
                        is[i_6_] = anIntArrayArray9291[i_3_][i_10_];
                }
            } else
                Class159.method1403(is, 0, Class185.anInt2164, 0);
        }
        return is;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_13_) {
        int i_14_ = i_13_;
        while_76_:
        do {
            while_75_:
            do {
                while_74_:
                do {
                    while_73_:
                    do {
                        while_72_:
                        do {
                            while_71_:
                            do {
                                do {
                                    if (i_14_ != 0) {
                                        if (i_14_ != 1) {
                                            if ((i_14_ ^ 0xffffffff) != -3) {
                                                if (i_14_ != 3) {
                                                    if (i_14_ != 4) {
                                                        if ((i_14_ ^ 0xffffffff) != -6) {
                                                            if (i_14_ != 6) {
                                                                if (i_14_ != 7)
                                                                    break while_76_;
                                                            } else
                                                                break while_74_;
                                                            break while_75_;
                                                        }
                                                    } else
                                                        break while_72_;
                                                    break while_73_;
                                                }
                                            } else
                                                break;
                                            break while_71_;
                                        }
                                    } else {
                                        anInt9301 = class248_sub9.readUnsignedByte((byte) 115);
                                        break while_76_;
                                    }
                                    anInt9283 = class248_sub9.readUnsignedByte((byte) 95);
                                    break while_76_;
                                } while (false);
                                anInt9285 = class248_sub9.readShort(i ^ 0x3c);
                                break while_76_;
                            } while (false);
                            anInt9292 = class248_sub9.readShort(i + 60);
                            break while_76_;
                        } while (false);
                        anInt9302 = class248_sub9.readShort(i + 60);
                        break while_76_;
                    } while (false);
                    anInt9284 = class248_sub9.readShort(-1);
                    break while_76_;
                } while (false);
                anInt9297 = class248_sub9.readShort(-1);
                break while_76_;
            } while (false);
            anInt9300 = class248_sub9.readShort(i ^ 0x3c);
        } while (false);
        anInt9280++;
        if (i != -61)
            method2269(null, (byte) -35, -126);
    }

    private final void method2311(int i) {
        anInt9289++;
        Random random = new Random((long) anInt9283);
        anInt9287 = anInt9297 / 2;
        anInt9293 = 4096 / anInt9283;
        anInt9282 = 4096 / anInt9301;
        int i_15_ = anInt9282 / 2;
        anIntArrayArray9291 = new int[anInt9283][anInt9301];
        anIntArray9294 = new int[anInt9283 + 1];
        anIntArrayArray9288 = new int[anInt9283][anInt9301 - -1];
        int i_16_ = anInt9293 / 2;
        if (i > -51)
            method2314(-18, 32, 34, 63);
        anIntArray9294[0] = 0;
        for (int i_17_ = 0; (anInt9283 ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
            if (i_17_ > 0) {
                int i_18_ = anInt9293;
                int i_19_ = ((RSInterface.method2016(4096, -1, random) + -2048) * anInt9292 >> -1014447764);
                i_18_ += i_19_ * i_16_ >> 1139343244;
                anIntArray9294[i_17_] = anIntArray9294[-1 + i_17_] + i_18_;
            }
            anIntArrayArray9288[i_17_][0] = 0;
            for (int i_20_ = 0; i_20_ < anInt9301; i_20_++) {
                if ((i_20_ ^ 0xffffffff) < -1) {
                    int i_21_ = anInt9282;
                    int i_22_ = ((-2048 + RSInterface.method2016(4096, -1, random)) * anInt9285) >> -898248276;
                    i_21_ += i_15_ * i_22_ >> 1225166988;
                    anIntArrayArray9288[i_17_][i_20_] = i_21_ + anIntArrayArray9288[i_17_][i_20_ + -1];
                }
                anIntArrayArray9291[i_17_][i_20_] = ((anInt9300 ^ 0xffffffff) < -1 ? (-RSInterface.method2016(anInt9300, -1, random) + 4096) : 4096);
            }
            anIntArrayArray9288[i_17_][anInt9301] = 4096;
        }
        anIntArray9294[anInt9283] = 4096;
    }

    static final void method2312(int i, int i_23_, RSInterface2 class354, int i_24_) {
        anInt9296++;
        if (class354 != null) {
            if (((RSInterface2) class354).anObjectArray4333 != null) {
                RSInterface class248_sub6 = new RSInterface();
                ((RSInterface) class248_sub6).rsInter = class354;
                ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) class354).anObjectArray4333;
                Class47.executeScript(class248_sub6);
            }
            Class346_Sub7_Sub5.anInt9963 = ((RSInterface2) class354).interfaceValues;
            InputStream_Sub2.anInt76 = ((RSInterface2) class354).index;
            Class292.anInt3423 = ((RSInterface2) class354).anInt4276;
            Class115.aBoolean4952 = true;
            aa_Sub2.anInt5262 = i;
            Class168.anInt1963 = ((RSInterface2) class354).id;
            Class136_Sub4.anInt8413 = ((RSInterface2) class354).anInt4278;
            Class346_Sub2.anInt8264 = i_24_;
            if (i_23_ != 1)
                method2312(41, 4, null, 82);
            Class376.method3882(class354, 2260);
        }
    }

    final void method2263(int i) {
        method2311(-88);
        anInt9295++;
        if (i != 8351)
            method2269(null, (byte) -112, 81);
    }

    public static void method2313(byte i) {
        aClass129Array9290 = null;
        aOutgoingOpcode_9299 = null;
        if (i != 32)
            method2313((byte) 125);
    }

    static final void method2314(int i, int i_25_, int i_26_, int i_27_) {
        int i_28_ = 29 % ((i - 18) / 37);
        if (i_25_ == 1006)
            Class47.method351(Class80.aClass58_1011, i_26_, i_27_);
        else if (i_25_ == 1004)
            Class47.method351(Interactable.aClass58_8324, i_26_, i_27_);
        else if ((i_25_ ^ 0xffffffff) != -1008) {
            if ((i_25_ ^ 0xffffffff) == -1002)
                Class47.method351(Class298.aClass58_3481, i_26_, i_27_);
            else if (i_25_ == 1012)
                Class47.method351(Node_Sub14_Sub6.aClass58_9214, i_26_, i_27_);
        } else
            Class47.method351(Class361.aClass58_4454, i_26_, i_27_);
        anInt9281++;
    }

    public Node_Sub14_Sub13() {
        super(0, true);
        anInt9283 = 8;
        anInt9297 = 81;
        anInt9285 = 409;
        anInt9284 = 0;
        anInt9300 = 1024;
        anInt9301 = 4;
        anInt9302 = 1024;
    }
}
