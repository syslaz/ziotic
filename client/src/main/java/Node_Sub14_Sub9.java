/* Class248_Sub14_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Node_Sub14_Sub9 extends Node_Sub14 {
    private int anInt9235;
    private int anInt9236 = 4096;
    static int anInt9237;
    private int anInt9238;
    static int anInt9239;
    private int anInt9240;
    static Class186 aClass186_9241;
    static String[] aStringArray9242 = new String[100];
    private int anInt9243;
    static int anInt9244;
    static Class381 aClass381_9245;

    final int[] method2264(byte i, int i_0_) {
        if (i != -40)
            return null;
        anInt9244++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_1_ = anInt9236 >> 1241199489;
            int[][] is_2_ = ((Node_Sub14) this).aClass227_6993.method1819((byte) 115);
            Random random = new Random((long) anInt9238);
            for (int i_3_ = 0; (anInt9243 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
                int i_4_ = ((anInt9236 ^ 0xffffffff) >= -1 ? anInt9240 : (anInt9240 + -i_1_ + RSInterface.method2016(anInt9236, -1, random)));
                i_4_ = (0xffb & i_4_) >> 1048125092;
                int i_5_ = RSInterface.method2016(Class185.anInt2164, i + 39, random);
                int i_6_ = RSInterface.method2016(Class250.anInt2819, -1, random);
                int i_7_ = i_5_ - -(anInt9235 * Class21.anIntArray317[i_4_] >> -767649012);
                int i_8_ = ((anInt9235 * Class264.anIntArray2992[i_4_] >> -379447988) + i_6_);
                int i_9_ = i_8_ - i_6_;
                int i_10_ = -i_5_ + i_7_;
                if (i_10_ != 0 || (i_9_ ^ 0xffffffff) != -1) {
                    if (i_10_ < 0)
                        i_10_ = -i_10_;
                    if (i_9_ < 0)
                        i_9_ = -i_9_;
                    boolean bool = i_10_ < i_9_;
                    if (bool) {
                        int i_11_ = i_5_;
                        i_5_ = i_6_;
                        int i_12_ = i_7_;
                        i_6_ = i_11_;
                        i_7_ = i_8_;
                        i_8_ = i_12_;
                    }
                    if (i_7_ < i_5_) {
                        int i_13_ = i_5_;
                        int i_14_ = i_6_;
                        i_5_ = i_7_;
                        i_7_ = i_13_;
                        i_6_ = i_8_;
                        i_8_ = i_14_;
                    }
                    int i_15_ = i_6_;
                    int i_16_ = -i_5_ + i_7_;
                    int i_17_ = i_8_ + -i_6_;
                    int i_18_ = -i_16_ / 2;
                    int i_19_ = 2048 / i_16_;
                    int i_20_ = (-(RSInterface.method2016(4096, -1, random) >> 709364578) + 1024);
                    if ((i_17_ ^ 0xffffffff) > -1)
                        i_17_ = -i_17_;
                    int i_21_ = i_6_ >= i_8_ ? -1 : 1;
                    for (int i_22_ = i_5_; (i_22_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_22_++) {
                        int i_23_ = i_20_ - -1024 + (-i_5_ + i_22_) * i_19_;
                        int i_24_ = i_22_ & Class226_Sub2.anInt6664;
                        int i_25_ = i_15_ & za_Sub1.anInt9802;
                        i_18_ += i_17_;
                        if (!bool)
                            is_2_[i_24_][i_25_] = i_23_;
                        else
                            is_2_[i_25_][i_24_] = i_23_;
                        if (i_18_ > 0) {
                            i_18_ = -i_16_ + i_18_;
                            i_15_ = i_21_ + i_15_;
                        }
                    }
                }
            }
        }
        return is;
    }

    final void method2263(int i) {
        s_Sub3.method3164(true);
        if (i != 8351)
            aStringArray9242 = null;
        anInt9239++;
    }

    public static void method2300(byte i) {
        aClass381_9245 = null;
        aClass186_9241 = null;
        aStringArray9242 = null;
        if (i <= 55)
            aClass186_9241 = null;
    }

    public Node_Sub14_Sub9() {
        super(0, true);
        anInt9235 = 16;
        anInt9240 = 0;
        anInt9238 = 0;
        anInt9243 = 2000;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_26_) {
        if (i != -61)
            aStringArray9242 = null;
        anInt9237++;
        int i_27_ = i_26_;
        while_54_:
        do {
            while_53_:
            do {
                while_52_:
                do {
                    do {
                        if (i_27_ != 0) {
                            if (i_27_ != 1) {
                                if (i_27_ != 2) {
                                    if (i_27_ != 3) {
                                        if (i_27_ == 4)
                                            break while_53_;
                                        break while_54_;
                                    }
                                } else
                                    break;
                                break while_52_;
                            }
                        } else {
                            anInt9238 = class248_sub9.readUnsignedByte((byte) -109);
                            return;
                        }
                        anInt9243 = class248_sub9.readShort(-1);
                        return;
                    } while (false);
                    anInt9235 = class248_sub9.readUnsignedByte((byte) 93);
                    return;
                } while (false);
                anInt9240 = class248_sub9.readShort(-1);
                return;
            } while (false);
            anInt9236 = class248_sub9.readShort(-1);
        } while (false);
    }

    static {
        aClass186_9241 = new Class186();
    }
}
