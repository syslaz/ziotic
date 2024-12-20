/* Class248_Sub14_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub36 extends Node_Sub14 {
    static int anInt9542;
    private int anInt9543 = 4096;
    static int[] anIntArray9544;
    static int anInt9545;
    private int anInt9546 = 409;
    private int[] anIntArray9547 = new int[3];
    static int[] anIntArray9548 = new int[3];
    private int anInt9549;
    private int anInt9550 = 4096;
    static int anInt9551;
    static int anInt9552 = 0;

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        int i_1_ = i_0_;
        while_216_:
        do {
            while_215_:
            do {
                while_214_:
                do {
                    do {
                        if (i_1_ != 0) {
                            if (i_1_ != 1) {
                                if (i_1_ != 2) {
                                    if (i_1_ != 3) {
                                        if (i_1_ == 4)
                                            break while_215_;
                                        break while_216_;
                                    }
                                } else
                                    break;
                                break while_214_;
                            }
                        } else {
                            anInt9546 = class248_sub9.readShort(i + 60);
                            break while_216_;
                        }
                        anInt9543 = class248_sub9.readShort(-1);
                        break while_216_;
                    } while (false);
                    anInt9549 = class248_sub9.readShort(-1);
                    break while_216_;
                } while (false);
                anInt9550 = class248_sub9.readShort(-1);
                break while_216_;
            } while (false);
            int i_2_ = class248_sub9.method2221(255);
            anIntArray9547[2] = Class112.method794(255, i_2_) >> 423624012;
            anIntArray9547[0] = Class112.method794(16711680, i_2_) << 1560757668;
            anIntArray9547[1] = Class112.method794(i_2_, 65280) >> 992305540;
        } while (false);
        anInt9551++;
        if (i != -61)
            method2384((byte) 113);
    }

    public static void method2384(byte i) {
        anIntArray9544 = null;
        if (i == -57)
            anIntArray9548 = null;
    }

    static final void method2385(byte i) {
        anInt9545++;
        int[] is = new int[((Class342) Class283.aClass342_3343).anInt4000];
        int i_3_ = 0;
        if (i != -62)
            anInt9552 = 119;
        for (int i_4_ = 0; i_4_ < ((Class342) Class283.aClass342_3343).anInt4000; i_4_++) {
            Class321 class321 = Class283.aClass342_3343.method3482((byte) 83, i_4_);
            if (((Class321) class321).anInt3713 >= 0 || ((Class321) class321).anInt3725 >= 0)
                is[i_3_++] = i_4_;
        }
        Class269_Sub2.anIntArray7543 = new int[i_3_];
        for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
            Class269_Sub2.anIntArray7543[i_5_] = is[i_5_];
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9542++;
        if (bool != true)
            return null;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[][] is_6_ = this.method2267(i, 0, 65535);
            int[] is_7_ = is_6_[0];
            int[] is_8_ = is_6_[1];
            int[] is_9_ = is_6_[2];
            int[] is_10_ = is[0];
            int[] is_11_ = is[1];
            int[] is_12_ = is[2];
            for (int i_13_ = 0; Class185.anInt2164 > i_13_; i_13_++) {
                int i_14_ = is_7_[i_13_];
                int i_15_ = -anIntArray9547[0] + i_14_;
                if (i_15_ < 0)
                    i_15_ = -i_15_;
                if ((anInt9546 ^ 0xffffffff) > (i_15_ ^ 0xffffffff)) {
                    is_10_[i_13_] = i_14_;
                    is_11_[i_13_] = is_8_[i_13_];
                    is_12_[i_13_] = is_9_[i_13_];
                } else {
                    int i_16_ = is_8_[i_13_];
                    i_15_ = -anIntArray9547[1] + i_16_;
                    if (i_15_ < 0)
                        i_15_ = -i_15_;
                    if ((i_15_ ^ 0xffffffff) < (anInt9546 ^ 0xffffffff)) {
                        is_10_[i_13_] = i_14_;
                        is_11_[i_13_] = i_16_;
                        is_12_[i_13_] = is_9_[i_13_];
                    } else {
                        int i_17_ = is_9_[i_13_];
                        i_15_ = i_17_ - anIntArray9547[2];
                        if (i_15_ < 0)
                            i_15_ = -i_15_;
                        if (anInt9546 < i_15_) {
                            is_10_[i_13_] = i_14_;
                            is_11_[i_13_] = i_16_;
                            is_12_[i_13_] = i_17_;
                        } else {
                            is_10_[i_13_] = anInt9550 * i_14_ >> 1998498732;
                            is_11_[i_13_] = i_16_ * anInt9549 >> -694766324;
                            is_12_[i_13_] = i_17_ * anInt9543 >> -1310387796;
                        }
                    }
                }
            }
        }
        return is;
    }

    public Node_Sub14_Sub36() {
        super(1, false);
        anInt9549 = 4096;
    }
}
