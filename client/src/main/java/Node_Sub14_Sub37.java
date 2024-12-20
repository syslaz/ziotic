/* Class248_Sub14_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub37 extends Node_Sub14 {
    private int anInt9553;
    private int anInt9554;
    static int anInt9555;
    static int anInt9556;
    private int anInt9557;
    private int anInt9558;
    private int anInt9559;
    private int anInt9560;
    static int anInt9561;
    static int anInt9562 = 0;
    private int anInt9563;
    static int anInt9564;
    private int anInt9565 = 0;
    static int anInt9566;
    private int anInt9567;

    private final void method2386(int i, int i_0_, byte i_1_, int i_2_) {
        anInt9564++;
        int i_3_ = i <= i_0_ ? i_0_ : i;
        int i_4_ = (i_0_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? i_0_ : i;
        i_3_ = (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff) ? i_2_ : i_3_;
        i_4_ = (i_4_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff) ? i_2_ : i_4_;
        anInt9560 = (i_4_ - -i_3_) / 2;
        int i_5_ = -i_4_ + i_3_;
        if (i_1_ >= -84)
            method2387(-67, -28, (byte) 40, -81);
        if ((i_5_ ^ 0xffffffff) >= -1)
            anInt9563 = 0;
        else {
            int i_6_ = (-i + i_3_ << -171082612) / i_5_;
            int i_7_ = (i_3_ - i_0_ << 186678828) / i_5_;
            int i_8_ = (i_3_ + -i_2_ << -1575673268) / i_5_;
            if ((i ^ 0xffffffff) == (i_3_ ^ 0xffffffff))
                anInt9563 = i_4_ != i_0_ ? -i_7_ + 4096 : 20480 + i_8_;
            else if ((i_3_ ^ 0xffffffff) == (i_0_ ^ 0xffffffff))
                anInt9563 = ((i_4_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff) ? 12288 - i_8_ : 4096 - -i_6_);
            else
                anInt9563 = i == i_4_ ? i_7_ + 12288 : -i_6_ + 20480;
            anInt9563 /= 6;
        }
        if ((anInt9560 ^ 0xffffffff) < -1 && anInt9560 < 4096)
            anInt9559 = (i_5_ << 1658773132) / (anInt9560 <= 2048 ? 2 * anInt9560 : -(2 * anInt9560) + 8192);
        else
            anInt9559 = 0;
    }

    private final void method2387(int i, int i_9_, byte i_10_, int i_11_) {
        anInt9566++;
        int i_12_ = ((i ^ 0xffffffff) < -2049 ? -(i * i_9_ >> -869568884) + (i_9_ + i) : i * (4096 - -i_9_) >> 2049628108);
        while_224_:
        do {
            if (i_12_ <= 0)
                anInt9567 = anInt9554 = anInt9553 = i;
            else {
                i_11_ *= 6;
                int i_13_ = -i_12_ + (i - -i);
                int i_14_ = (i_12_ + -i_13_ << 223079596) / i_12_;
                int i_15_ = i_11_ >> 969297612;
                int i_16_ = -(i_15_ << -1381529460) + i_11_;
                int i_17_ = i_12_;
                i_17_ = i_14_ * i_17_ >> 975370668;
                i_17_ = i_17_ * i_16_ >> -31346900;
                int i_18_ = i_17_ + i_13_;
                int i_19_ = i_12_ + -i_17_;
                int i_20_ = i_15_;
                while_223_:
                do {
                    while_222_:
                    do {
                        while_221_:
                        do {
                            do {
                                if (i_20_ != 0) {
                                    if ((i_20_ ^ 0xffffffff) != -2) {
                                        if ((i_20_ ^ 0xffffffff) != -3) {
                                            if ((i_20_ ^ 0xffffffff) != -4) {
                                                if (i_20_ != 4) {
                                                    if ((i_20_ ^ 0xffffffff) != -6)
                                                        break while_224_;
                                                } else
                                                    break while_222_;
                                                break while_223_;
                                            }
                                        } else
                                            break;
                                        break while_221_;
                                    }
                                } else {
                                    anInt9567 = i_12_;
                                    anInt9553 = i_13_;
                                    anInt9554 = i_18_;
                                    break while_224_;
                                }
                                anInt9553 = i_13_;
                                anInt9567 = i_19_;
                                anInt9554 = i_12_;
                                break while_224_;
                            } while (false);
                            anInt9553 = i_18_;
                            anInt9567 = i_13_;
                            anInt9554 = i_12_;
                            break while_224_;
                        } while (false);
                        anInt9553 = i_12_;
                        anInt9554 = i_19_;
                        anInt9567 = i_13_;
                        break while_224_;
                    } while (false);
                    anInt9553 = i_12_;
                    anInt9567 = i_18_;
                    anInt9554 = i_13_;
                    break while_224_;
                } while (false);
                anInt9553 = i_19_;
                anInt9567 = i_12_;
                anInt9554 = i_13_;
            }
        } while (false);
        if (i_10_ != -88)
            method2269(null, (byte) -39, -92);
    }

    public Node_Sub14_Sub37() {
        super(1, false);
        anInt9557 = 0;
        anInt9558 = 0;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_21_) {
        int i_22_ = i_21_;
        while_225_:
        do {
            do {
                if (i_22_ != 0) {
                    if ((i_22_ ^ 0xffffffff) != -2) {
                        if ((i_22_ ^ 0xffffffff) == -3)
                            break;
                        break while_225_;
                    }
                } else {
                    anInt9565 = class248_sub9.readUnsignedShort((byte) -10);
                    break while_225_;
                }
                anInt9557 = (class248_sub9.readByte(86) << -1405219316) / 100;
                break while_225_;
            } while (false);
            anInt9558 = (class248_sub9.readByte(122) << -112386868) / 100;
        } while (false);
        if (i == -61)
            anInt9556++;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9561++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (bool != true)
            method2387(-7, 90, (byte) -34, 36);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[][] is_23_ = this.method2267(i, 0, 65535);
            int[] is_24_ = is_23_[0];
            int[] is_25_ = is_23_[1];
            int[] is_26_ = is_23_[2];
            int[] is_27_ = is[0];
            int[] is_28_ = is[1];
            int[] is_29_ = is[2];
            for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_30_++) {
                method2386(is_24_[i_30_], is_25_[i_30_], (byte) -115, is_26_[i_30_]);
                anInt9563 += anInt9565;
                anInt9559 += anInt9557;
                anInt9560 += anInt9558;
                for (/**/; anInt9563 < 0; anInt9563 += 4096) {
                    /* empty */
                }
                for (/**/; anInt9563 > 4096; anInt9563 -= 4096) {
                    /* empty */
                }
                if ((anInt9559 ^ 0xffffffff) > -1)
                    anInt9559 = 0;
                if ((anInt9559 ^ 0xffffffff) < -4097)
                    anInt9559 = 4096;
                if (anInt9560 < 0)
                    anInt9560 = 0;
                if ((anInt9560 ^ 0xffffffff) < -4097)
                    anInt9560 = 4096;
                method2387(anInt9560, anInt9559, (byte) -88, anInt9563);
                is_27_[i_30_] = anInt9567;
                is_28_[i_30_] = anInt9554;
                is_29_[i_30_] = anInt9553;
            }
        }
        return is;
    }
}
