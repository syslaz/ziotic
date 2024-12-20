/* Class248_Sub14_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Node_Sub14_Sub24 extends Node_Sub14 {
    static int[][] anIntArrayArray9397 = new int[6][];
    private int anInt9398 = 1024;
    private int anInt9399 = 1024;
    private int anInt9400;
    static int anInt9401;
    private int anInt9402;
    private int anInt9403 = 1024;
    private int anInt9404;
    static int anInt9405;
    static int anInt9406;
    private int anInt9407 = 1024;
    private int anInt9408;
    private int anInt9409;
    static Class278 aClass278_9410 = new Class278(50);
    private int anInt9411;
    static int anInt9412;
    static int anInt9413;

    public static void method2346(int i) {
        aClass278_9410 = null;
        anIntArrayArray9397 = null;
        if (i != 2)
            method2347((byte) -50);
    }

    static final void method2347(byte i) {
        if (i >= 27) {
            anInt9413++;
            Node_Sub5.aClass293_6838.method3121(10);
            Class26.anInt357 = 0;
        }
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        anInt9412++;
        if (i != -61)
            anInt9409 = -85;
        int i_1_ = i_0_;
        while_174_:
        do {
            while_173_:
            do {
                while_172_:
                do {
                    while_171_:
                    do {
                        while_170_:
                        do {
                            while_169_:
                            do {
                                while_168_:
                                do {
                                    do {
                                        if ((i_1_ ^ 0xffffffff) != -1) {
                                            if (i_1_ != 1) {
                                                if ((i_1_ ^ 0xffffffff) != -3) {
                                                    if (i_1_ != 3) {
                                                        if (i_1_ != 4) {
                                                            if (i_1_ != 5) {
                                                                if ((i_1_ ^ 0xffffffff) != -7) {
                                                                    if (i_1_ != 7) {
                                                                        if ((i_1_ ^ 0xffffffff) == -9)
                                                                            break while_173_;
                                                                        break while_174_;
                                                                    }
                                                                } else
                                                                    break while_171_;
                                                                break while_172_;
                                                            }
                                                        } else
                                                            break while_169_;
                                                        break while_170_;
                                                    }
                                                } else
                                                    break;
                                                break while_168_;
                                            }
                                        } else {
                                            anInt9409 = class248_sub9.readUnsignedByte((byte) 90);
                                            return;
                                        }
                                        anInt9398 = class248_sub9.readShort(-1);
                                        return;
                                    } while (false);
                                    anInt9402 = class248_sub9.readShort(-1);
                                    return;
                                } while (false);
                                anInt9400 = class248_sub9.readShort(i ^ 0x3c);
                                return;
                            } while (false);
                            anInt9408 = class248_sub9.readShort(-1);
                            return;
                        } while (false);
                        anInt9407 = class248_sub9.readShort(-1);
                        return;
                    } while (false);
                    anInt9404 = class248_sub9.readUnsignedByte((byte) 79);
                    return;
                } while (false);
                anInt9403 = class248_sub9.readShort(i ^ 0x3c);
                return;
            } while (false);
            anInt9399 = class248_sub9.readShort(-1);
        } while (false);
    }

    final int[] method2264(byte i, int i_2_) {
        anInt9405++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_2_, true);
        if (i != -40)
            return null;
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[][] is_3_ = ((Node_Sub14) this).aClass227_6993.method1819((byte) -64);
            int i_4_ = 0;
            int i_5_ = 0;
            int i_6_ = 0;
            int i_7_ = 0;
            int i_8_ = 0;
            boolean bool = true;
            boolean bool_9_ = true;
            int i_10_ = 0;
            int i_11_ = 0;
            int i_12_ = Class185.anInt2164 * anInt9398 >> 73347148;
            int i_13_ = anInt9402 * Class185.anInt2164 >> -934576820;
            int i_14_ = anInt9400 * Class250.anInt2819 >> -1114392340;
            int i_15_ = anInt9408 * Class250.anInt2819 >> 1873225932;
            if ((i_15_ ^ 0xffffffff) >= -2)
                return is_3_[i_2_];
            anInt9411 = Class185.anInt2164 / 8 * anInt9407 >> 850039692;
            int i_16_ = 1 + Class185.anInt2164 / i_12_;
            int[][] is_17_ = new int[i_16_][3];
            int[][] is_18_ = new int[i_16_][3];
            Random random = new Random((long) anInt9409);
            for (; ; ) {
                int i_19_ = i_12_ + RSInterface.method2016(i_13_ - i_12_, i + 39, random);
                int i_20_ = i_14_ - -RSInterface.method2016(i_15_ + -i_14_, -1, random);
                int i_21_ = i_7_ + i_19_;
                if ((i_21_ ^ 0xffffffff) < (Class185.anInt2164 ^ 0xffffffff)) {
                    i_19_ = -i_7_ + Class185.anInt2164;
                    i_21_ = Class185.anInt2164;
                }
                int i_22_;
                if (!bool_9_) {
                    int i_23_ = i_8_;
                    int[] is_24_ = is_18_[i_8_];
                    int i_25_ = 0;
                    int i_26_ = i_4_ + i_21_;
                    if (i_26_ < 0)
                        i_26_ += Class185.anInt2164;
                    if ((i_26_ ^ 0xffffffff) < (Class185.anInt2164 ^ 0xffffffff))
                        i_26_ -= Class185.anInt2164;
                    for (; ; ) {
                        int[] is_27_ = is_18_[i_23_];
                        if (i_26_ >= is_27_[0] && (i_26_ ^ 0xffffffff) >= (is_27_[1] ^ 0xffffffff))
                            break;
                        if ((++i_23_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff))
                            i_23_ = 0;
                        i_25_++;
                    }
                    i_22_ = is_24_[2];
                    if ((i_8_ ^ 0xffffffff) != (i_23_ ^ 0xffffffff)) {
                        int i_28_ = i_4_ + i_7_;
                        if (i_28_ < 0)
                            i_28_ += Class185.anInt2164;
                        if ((Class185.anInt2164 ^ 0xffffffff) > (i_28_ ^ 0xffffffff))
                            i_28_ -= Class185.anInt2164;
                        for (int i_29_ = 1; (i_29_ ^ 0xffffffff) >= (i_25_ ^ 0xffffffff); i_29_++) {
                            int[] is_30_ = is_18_[(i_29_ + i_8_) % i_10_];
                            i_22_ = Math.max(i_22_, is_30_[2]);
                        }
                        for (int i_31_ = 0; i_25_ >= i_31_; i_31_++) {
                            int[] is_32_ = is_18_[(i_31_ + i_8_) % i_10_];
                            int i_33_ = is_32_[2];
                            if ((i_22_ ^ 0xffffffff) != (i_33_ ^ 0xffffffff)) {
                                int i_34_ = is_32_[0];
                                int i_35_ = is_32_[1];
                                int i_36_;
                                int i_37_;
                                if ((i_26_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff)) {
                                    i_36_ = Math.max(i_28_, i_34_);
                                    i_37_ = Math.min(i_26_, i_35_);
                                } else if (i_34_ != 0) {
                                    i_36_ = Math.max(i_28_, i_34_);
                                    i_37_ = Class185.anInt2164;
                                } else {
                                    i_36_ = 0;
                                    i_37_ = Math.min(i_26_, i_35_);
                                }
                                method2348(is_3_, i_36_ + i_6_, i_33_, -i_36_ + i_37_, random, i_22_ + -i_33_, 7239);
                            }
                        }
                    }
                    i_8_ = i_23_;
                } else
                    i_22_ = 0;
                if ((Class250.anInt2819 ^ 0xffffffff) > (i_20_ + i_22_ ^ 0xffffffff))
                    i_20_ = Class250.anInt2819 + -i_22_;
                else
                    bool = false;
                if ((i_21_ ^ 0xffffffff) != (Class185.anInt2164 ^ 0xffffffff)) {
                    int[] is_38_ = is_17_[i_11_++];
                    is_38_[0] = i_7_;
                    is_38_[1] = i_21_;
                    is_38_[2] = i_20_ + i_22_;
                    method2348(is_3_, i_7_ - -i_5_, i_22_, i_19_, random, i_20_, 7239);
                    i_7_ = i_21_;
                } else {
                    method2348(is_3_, i_7_ - -i_5_, i_22_, i_19_, random, i_20_, 7239);
                    if (bool)
                        break;
                    bool = true;
                    int[] is_39_ = is_17_[i_11_++];
                    is_39_[2] = i_22_ - -i_20_;
                    is_39_[1] = i_21_;
                    is_39_[0] = i_7_;
                    int[][] is_40_ = is_18_;
                    is_18_ = is_17_;
                    i_10_ = i_11_;
                    is_17_ = is_40_;
                    i_11_ = 0;
                    i_6_ = i_5_;
                    i_5_ = RSInterface.method2016(Class185.anInt2164, -1, random);
                    i_4_ = i_5_ + -i_6_;
                    i_7_ = 0;
                    int i_41_ = i_4_;
                    if ((i_41_ ^ 0xffffffff) > -1)
                        i_41_ += Class185.anInt2164;
                    if ((i_41_ ^ 0xffffffff) < (Class185.anInt2164 ^ 0xffffffff))
                        i_41_ -= Class185.anInt2164;
                    i_8_ = 0;
                    for (; ; ) {
                        int[] is_42_ = is_18_[i_8_];
                        if (i_41_ >= is_42_[0] && (i_41_ ^ 0xffffffff) >= (is_42_[1] ^ 0xffffffff))
                            break;
                        if ((++i_8_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff))
                            i_8_ = 0;
                    }
                    bool_9_ = false;
                }
            }
        }
        return is;
    }

    final void method2263(int i) {
        anInt9406++;
        if (i != 8351)
            anInt9408 = -34;
    }

    private final void method2348(int[][] is, int i, int i_43_, int i_44_, Random random, int i_45_, int i_46_) {
        anInt9401++;
        int i_47_ = (anInt9399 <= 0 ? 4096 : -RSInterface.method2016(anInt9399, -1, random) + 4096);
        int i_48_ = anInt9411 * anInt9403 >> 312707148;
        if (i_46_ != 7239)
            anIntArrayArray9397 = null;
        int i_49_ = anInt9411 + -((i_48_ ^ 0xffffffff) < -1 ? RSInterface.method2016(i_48_, -1, random) : 0);
        if ((i ^ 0xffffffff) <= (Class185.anInt2164 ^ 0xffffffff))
            i -= Class185.anInt2164;
        if ((i_49_ ^ 0xffffffff) < -1) {
            if (i_45_ > 0 && i_44_ > 0) {
                int i_50_ = i_44_ / 2;
                int i_51_ = i_45_ / 2;
                int i_52_ = ((i_50_ ^ 0xffffffff) > (i_49_ ^ 0xffffffff) ? i_50_ : i_49_);
                int i_53_ = ((i_49_ ^ 0xffffffff) < (i_51_ ^ 0xffffffff) ? i_51_ : i_49_);
                int i_54_ = i - -i_52_;
                int i_55_ = -(i_52_ * 2) + i_44_;
                for (int i_56_ = 0; (i_45_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
                    int[] is_57_ = is[i_43_ + i_56_];
                    if ((i_56_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff)) {
                        int i_58_ = i_47_ * i_56_ / i_53_;
                        if ((anInt9404 ^ 0xffffffff) != -1) {
                            for (int i_59_ = 0; i_52_ > i_59_; i_59_++) {
                                int i_60_ = i_59_ * i_47_ / i_52_;
                                is_57_[Class112.method794((Class226_Sub2.anInt6664), i_59_ + i)] = is_57_[(Class112.method794(Class226_Sub2.anInt6664, -1 + i_44_ + (i + -i_59_)))] = ((i_60_ ^ 0xffffffff) <= (i_58_ ^ 0xffffffff) ? i_58_ : i_60_);
                            }
                        } else {
                            for (int i_61_ = 0; (i_52_ ^ 0xffffffff) < (i_61_ ^ 0xffffffff); i_61_++) {
                                int i_62_ = i_61_ * i_47_ / i_52_;
                                is_57_[Class112.method794(i_61_ + i, (Class226_Sub2.anInt6664))] = is_57_[Class112.method794((-1 + i + i_44_ + -i_61_), (Class226_Sub2.anInt6664))] = i_62_ * i_58_ >> -665068564;
                            }
                        }
                        if ((Class185.anInt2164 ^ 0xffffffff) > (i_55_ + i_54_ ^ 0xffffffff)) {
                            int i_63_ = Class185.anInt2164 + -i_54_;
                            Class159.method1403(is_57_, i_54_, i_63_, i_58_);
                            Class159.method1403(is_57_, 0, i_55_ + -i_63_, i_58_);
                        } else
                            Class159.method1403(is_57_, i_54_, i_55_, i_58_);
                    } else {
                        int i_64_ = -1 + (i_45_ + -i_56_);
                        if (i_53_ > i_64_) {
                            int i_65_ = i_64_ * i_47_ / i_53_;
                            if ((anInt9404 ^ 0xffffffff) == -1) {
                                for (int i_66_ = 0; i_52_ > i_66_; i_66_++) {
                                    int i_67_ = i_47_ * i_66_ / i_52_;
                                    is_57_[Class112.method794(i_66_ + i, (Class226_Sub2.anInt6664))] = is_57_[(Class112.method794(Class226_Sub2.anInt6664, i_44_ + i + (-i_66_ - 1)))] = i_65_ * i_67_ >> 526561836;
                                }
                            } else {
                                for (int i_68_ = 0; ((i_52_ ^ 0xffffffff) < (i_68_ ^ 0xffffffff)); i_68_++) {
                                    int i_69_ = i_47_ * i_68_ / i_52_;
                                    is_57_[Class112.method794(i_68_ + i, (Class226_Sub2.anInt6664))] = is_57_[(Class112.method794(Class226_Sub2.anInt6664, i_44_ + i + (-i_68_ - 1)))] = i_69_ < i_65_ ? i_69_ : i_65_;
                                }
                            }
                            if ((Class185.anInt2164 ^ 0xffffffff) > (i_55_ + i_54_ ^ 0xffffffff)) {
                                int i_70_ = Class185.anInt2164 + -i_54_;
                                Class159.method1403(is_57_, i_54_, i_70_, i_65_);
                                Class159.method1403(is_57_, 0, -i_70_ + i_55_, i_65_);
                            } else
                                Class159.method1403(is_57_, i_54_, i_55_, i_65_);
                        } else {
                            for (int i_71_ = 0; (i_71_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff); i_71_++)
                                is_57_[Class112.method794((Class226_Sub2.anInt6664), i_71_ + i)] = is_57_[Class112.method794((Class226_Sub2.anInt6664), (-i_71_ + i_44_ + i + -1))] = i_71_ * i_47_ / i_52_;
                            if (Class185.anInt2164 < i_55_ + i_54_) {
                                int i_72_ = -i_54_ + Class185.anInt2164;
                                Class159.method1403(is_57_, i_54_, i_72_, i_47_);
                                Class159.method1403(is_57_, 0, -i_72_ + i_55_, i_47_);
                            } else
                                Class159.method1403(is_57_, i_54_, i_55_, i_47_);
                        }
                    }
                }
            }
        } else if ((Class185.anInt2164 ^ 0xffffffff) <= (i + i_44_ ^ 0xffffffff)) {
            for (int i_73_ = 0; i_73_ < i_45_; i_73_++)
                Class159.method1403(is[i_73_ + i_43_], i, i_44_, i_47_);
        } else {
            int i_74_ = Class185.anInt2164 - i;
            for (int i_75_ = 0; (i_75_ ^ 0xffffffff) > (i_45_ ^ 0xffffffff); i_75_++) {
                int[] is_76_ = is[i_43_ + i_75_];
                Class159.method1403(is_76_, i, i_74_, i_47_);
                Class159.method1403(is_76_, 0, i_44_ + -i_74_, i_47_);
            }
        }
    }

    public Node_Sub14_Sub24() {
        super(0, true);
        anInt9402 = 2048;
        anInt9400 = 409;
        anInt9408 = 819;
        anInt9409 = 0;
        anInt9404 = 0;
    }
}
