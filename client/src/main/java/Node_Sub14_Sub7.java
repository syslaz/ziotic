/* Class248_Sub14_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Node_Sub14_Sub7 extends Node_Sub14 {
    static int anInt9216;
    static int anInt9217;
    static boolean aBoolean9218 = false;
    static int anInt9219;
    static int anInt9220;
    static int anInt9221;
    static int anInt9222;
    static Class293 aClass293_9223 = new Class293();
    static int[] anIntArray9224 = {1, 0, -1, 0};

    public static void method2292(byte i) {
        anIntArray9224 = null;
        aClass293_9223 = null;
        if (i != -67)
            method2294(-109, -4, -3, 0, -22, 73, 57, -90, (byte) 69, 124);
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        if (i != -61)
            anIntArray9224 = null;
        if ((i_0_ ^ 0xffffffff) == -1)
            ((Node_Sub14) this).aBoolean6988 = class248_sub9.readUnsignedByte((byte) 94) == 1;
        anInt9216++;
    }

    static final void method2293(int i, Canvas canvas) {
        anInt9221++;
        Dimension dimension = canvas.getSize();
        Node_Sub8_Sub1.method2027(27424, dimension.height, dimension.width);
        if (Node_Sub15_Sub4.anInt9694 != i)
            Class301.aHa4933.a(canvas, Node_Sub8_Sub1.anInt8889, Class325.anInt3828);
        else
            Class301.aHa4933.a(canvas, Class82.anInt1030, Node_Sub38.anInt7269);
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9217++;
        if (bool != true)
            method2269(null, (byte) 88, 101);
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[] is_1_ = this.method2265((byte) 64, i, 2);
            int[][] is_2_ = this.method2267(i, 0, 65535);
            int[][] is_3_ = this.method2267(i, 1, 65535);
            int[] is_4_ = is[0];
            int[] is_5_ = is[1];
            int[] is_6_ = is[2];
            int[] is_7_ = is_2_[0];
            int[] is_8_ = is_2_[1];
            int[] is_9_ = is_2_[2];
            int[] is_10_ = is_3_[0];
            int[] is_11_ = is_3_[1];
            int[] is_12_ = is_3_[2];
            for (int i_13_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
                int i_14_ = is_1_[i_13_];
                if ((i_14_ ^ 0xffffffff) == -4097) {
                    is_4_[i_13_] = is_7_[i_13_];
                    is_5_[i_13_] = is_8_[i_13_];
                    is_6_[i_13_] = is_9_[i_13_];
                } else if ((i_14_ ^ 0xffffffff) == -1) {
                    is_4_[i_13_] = is_10_[i_13_];
                    is_5_[i_13_] = is_11_[i_13_];
                    is_6_[i_13_] = is_12_[i_13_];
                } else {
                    int i_15_ = -i_14_ + 4096;
                    is_4_[i_13_] = (is_10_[i_13_] * i_15_ + is_7_[i_13_] * i_14_ >> -1887046228);
                    is_5_[i_13_] = (i_15_ * is_11_[i_13_] + i_14_ * is_8_[i_13_] >> -1341406996);
                    is_6_[i_13_] = (i_14_ * is_9_[i_13_] + is_12_[i_13_] * i_15_ >> 2092213100);
                }
            }
        }
        return is;
    }

    static final void method2294(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, byte i_23_, int i_24_) {
        if ((i_22_ ^ 0xffffffff) == (i_19_ ^ 0xffffffff) && i_17_ == i_16_ && i_18_ == i_21_ && (i_24_ ^ 0xffffffff) == (i ^ 0xffffffff))
            aa_Sub2.method161(i_21_, i_20_, i_17_, (byte) 64, i, i_22_);
        else {
            int i_25_ = i_22_;
            int i_26_ = i_17_;
            int i_27_ = i_22_ * 3;
            int i_28_ = i_17_ * 3;
            int i_29_ = 3 * i_19_;
            int i_30_ = i_16_ * 3;
            int i_31_ = i_18_ * 3;
            int i_32_ = i_24_ * 3;
            int i_33_ = -i_22_ + i_21_ - (i_31_ + -i_29_);
            int i_34_ = -i_17_ + (i_30_ + (i + -i_32_));
            int i_35_ = -i_29_ + (-i_29_ + i_31_) + i_27_;
            int i_36_ = i_28_ + i_32_ - (i_30_ + i_30_);
            int i_37_ = -i_27_ + i_29_;
            int i_38_ = -i_28_ + i_30_;
            for (int i_39_ = 128; i_39_ <= 4096; i_39_ += 128) {
                int i_40_ = i_39_ * i_39_ >> 1016212652;
                int i_41_ = i_40_ * i_39_ >> 1791948908;
                int i_42_ = i_33_ * i_41_;
                int i_43_ = i_41_ * i_34_;
                int i_44_ = i_40_ * i_35_;
                int i_45_ = i_40_ * i_36_;
                int i_46_ = i_39_ * i_37_;
                int i_47_ = i_38_ * i_39_;
                int i_48_ = i_22_ - -(i_46_ + (i_44_ + i_42_) >> 1988368556);
                int i_49_ = i_17_ - -(i_47_ + (i_45_ + i_43_) >> -1985843956);
                aa_Sub2.method161(i_48_, i_20_, i_26_, (byte) 95, i_49_, i_25_);
                i_25_ = i_48_;
                i_26_ = i_49_;
            }
        }
        if (i_23_ == 100)
            anInt9219++;
    }

    final int[] method2264(byte i, int i_50_) {
        anInt9222++;
        if (i != -40)
            method2271(73, true);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_50_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_51_ = this.method2265((byte) 64, i_50_, 0);
            int[] is_52_ = this.method2265((byte) 64, i_50_, 1);
            int[] is_53_ = this.method2265((byte) 64, i_50_, 2);
            for (int i_54_ = 0; (i_54_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_54_++) {
                int i_55_ = is_53_[i_54_];
                if (i_55_ != 4096) {
                    if ((i_55_ ^ 0xffffffff) == -1)
                        is[i_54_] = is_52_[i_54_];
                    else
                        is[i_54_] = ((4096 + -i_55_) * is_52_[i_54_] + i_55_ * is_51_[i_54_]) >> -281380308;
                } else
                    is[i_54_] = is_51_[i_54_];
            }
        }
        return is;
    }

    static final Node_Sub14 method2295(int i, int i_56_) {
        anInt9220++;
        if (i != 128)
            return null;
        int i_57_ = i_56_;
        while_51_:
        do {
            while_50_:
            do {
                while_49_:
                do {
                    while_48_:
                    do {
                        while_47_:
                        do {
                            while_46_:
                            do {
                                while_45_:
                                do {
                                    while_44_:
                                    do {
                                        while_43_:
                                        do {
                                            while_42_:
                                            do {
                                                while_41_:
                                                do {
                                                    while_40_:
                                                    do {
                                                        while_39_:
                                                        do {
                                                            while_38_:
                                                            do {
                                                                while_37_:
                                                                do {
                                                                    while_36_:
                                                                    do {
                                                                        while_35_:
                                                                        do {
                                                                            while_34_:
                                                                            do {
                                                                                while_33_:
                                                                                do {
                                                                                    while_32_:
                                                                                    do {
                                                                                        while_31_:
                                                                                        do {
                                                                                            while_30_:
                                                                                            do {
                                                                                                while_29_:
                                                                                                do {
                                                                                                    while_28_:
                                                                                                    do {
                                                                                                        while_27_:
                                                                                                        do {
                                                                                                            while_26_:
                                                                                                            do {
                                                                                                                while_25_:
                                                                                                                do {
                                                                                                                    while_24_:
                                                                                                                    do {
                                                                                                                        while_23_:
                                                                                                                        do
                                                                                                                        {
                                                                                                                            while_22_:
                                                                                                                            do
                                                                                                                            {
                                                                                                                                while_21_:
                                                                                                                                do
                                                                                                                                {
                                                                                                                                    while_20_:
                                                                                                                                    do
                                                                                                                                    {
                                                                                                                                        while_19_:
                                                                                                                                        do
                                                                                                                                        {
                                                                                                                                            while_18_:
                                                                                                                                            do
                                                                                                                                            {
                                                                                                                                                while_17_:
                                                                                                                                                do
                                                                                                                                                {
                                                                                                                                                    while_16_:
                                                                                                                                                    do
                                                                                                                                                    {
                                                                                                                                                        while_15_:
                                                                                                                                                        do
                                                                                                                                                        {
                                                                                                                                                            while_14_:
                                                                                                                                                            do
                                                                                                                                                            {
                                                                                                                                                                do
                                                                                                                                                                {
                                                                                                                                                                    if (i_57_ != 0) {
                                                                                                                                                                        if (i_57_ != 1) {
                                                                                                                                                                            if (i_57_ != 2) {
                                                                                                                                                                                if ((i_57_ ^ 0xffffffff) != -4) {
                                                                                                                                                                                    if ((i_57_ ^ 0xffffffff) != -5) {
                                                                                                                                                                                        if (i_57_ != 5) {
                                                                                                                                                                                            if ((i_57_ ^ 0xffffffff) != -7) {
                                                                                                                                                                                                if (i_57_ != 7) {
                                                                                                                                                                                                    if ((i_57_ ^ 0xffffffff) != -9) {
                                                                                                                                                                                                        if (i_57_ != 9) {
                                                                                                                                                                                                            if ((i_57_ ^ 0xffffffff) != -11) {
                                                                                                                                                                                                                if (i_57_ != 11) {
                                                                                                                                                                                                                    if (i_57_ != 12) {
                                                                                                                                                                                                                        if ((i_57_ ^ 0xffffffff) != -14) {
                                                                                                                                                                                                                            if ((i_57_ ^ 0xffffffff) != -15) {
                                                                                                                                                                                                                                if (i_57_ != 15) {
                                                                                                                                                                                                                                    if (i_57_ != 16) {
                                                                                                                                                                                                                                        if ((i_57_ ^ 0xffffffff) != -18) {
                                                                                                                                                                                                                                            if (i_57_ != 18) {
                                                                                                                                                                                                                                                if ((i_57_ ^ 0xffffffff) != -20) {
                                                                                                                                                                                                                                                    if (i_57_ != 20) {
                                                                                                                                                                                                                                                        if (i_57_ != 21) {
                                                                                                                                                                                                                                                            if (i_57_ != 22) {
                                                                                                                                                                                                                                                                if (i_57_ != 23) {
                                                                                                                                                                                                                                                                    if (i_57_ != 24) {
                                                                                                                                                                                                                                                                        if (i_57_ != 25) {
                                                                                                                                                                                                                                                                            if (i_57_ != 26) {
                                                                                                                                                                                                                                                                                if (i_57_ != 27) {
                                                                                                                                                                                                                                                                                    if (i_57_ != 28) {
                                                                                                                                                                                                                                                                                        if (i_57_ != 29) {
                                                                                                                                                                                                                                                                                            if (i_57_ != 30) {
                                                                                                                                                                                                                                                                                                if ((i_57_ ^ 0xffffffff) != -32) {
                                                                                                                                                                                                                                                                                                    if ((i_57_ ^ 0xffffffff) != -33) {
                                                                                                                                                                                                                                                                                                        if (i_57_ != 33) {
                                                                                                                                                                                                                                                                                                            if (i_57_ != 34) {
                                                                                                                                                                                                                                                                                                                if (i_57_ != 35) {
                                                                                                                                                                                                                                                                                                                    if (i_57_ != 36) {
                                                                                                                                                                                                                                                                                                                        if ((i_57_ ^ 0xffffffff) != -38) {
                                                                                                                                                                                                                                                                                                                            if (i_57_ != 38) {
                                                                                                                                                                                                                                                                                                                                if (i_57_ != 39)
                                                                                                                                                                                                                                                                                                                                    break while_51_;
                                                                                                                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                                                                                                                break while_49_;
                                                                                                                                                                                                                                                                                                                            break while_50_;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                                                                                                                        break while_47_;
                                                                                                                                                                                                                                                                                                                    break while_48_;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                                                                                                break while_45_;
                                                                                                                                                                                                                                                                                                            break while_46_;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                                                                                                        break while_43_;
                                                                                                                                                                                                                                                                                                    break while_44_;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                                                                                break while_41_;
                                                                                                                                                                                                                                                                                            break while_42_;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                                                                                        break while_39_;
                                                                                                                                                                                                                                                                                    break while_40_;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                                                                break while_37_;
                                                                                                                                                                                                                                                                            break while_38_;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                                                                        break while_35_;
                                                                                                                                                                                                                                                                    break while_36_;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                                                break while_33_;
                                                                                                                                                                                                                                                            break while_34_;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                                                        break while_31_;
                                                                                                                                                                                                                                                    break while_32_;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                                break while_29_;
                                                                                                                                                                                                                                            break while_30_;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                                        break while_27_;
                                                                                                                                                                                                                                    break while_28_;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else
                                                                                                                                                                                                                                break while_25_;
                                                                                                                                                                                                                            break while_26_;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                        break while_23_;
                                                                                                                                                                                                                    break while_24_;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else
                                                                                                                                                                                                                break while_21_;
                                                                                                                                                                                                            break while_22_;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else
                                                                                                                                                                                                        break while_19_;
                                                                                                                                                                                                    break while_20_;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else
                                                                                                                                                                                                break while_17_;
                                                                                                                                                                                            break while_18_;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else
                                                                                                                                                                                        break while_15_;
                                                                                                                                                                                    break while_16_;
                                                                                                                                                                                }
                                                                                                                                                                            } else
                                                                                                                                                                                break;
                                                                                                                                                                            break while_14_;
                                                                                                                                                                        }
                                                                                                                                                                    } else
                                                                                                                                                                        return new Node_Sub14_Sub6();
                                                                                                                                                                    return new Node_Sub14_Sub8();
                                                                                                                                                                }
                                                                                                                                                                while (false);
                                                                                                                                                                return new Node_Sub14_Sub14();
                                                                                                                                                            }
                                                                                                                                                            while (false);
                                                                                                                                                            return new Node_Sub14_Sub23();
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        return new Node_Sub14_Sub13();
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    return new Node_Sub14_Sub19();
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                                return new Node_Sub14_Sub34();
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            return new Node_Sub14_Sub20();
                                                                                                                                        }
                                                                                                                                        while (false);
                                                                                                                                        return new Node_Sub14_Sub38();
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    return new Node_Sub14_Sub25();
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                return new Node_Sub14_Sub26();
                                                                                                                            }
                                                                                                                            while (false);
                                                                                                                            return new Node_Sub14_Sub28();
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        return new Node_Sub14_Sub22();
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    return new Node_Sub14_Sub30();
                                                                                                                }
                                                                                                                while (false);
                                                                                                                return new Node_Sub14_Sub21();
                                                                                                            }
                                                                                                            while (false);
                                                                                                            return new Node_Sub14_Sub15();
                                                                                                        } while (false);
                                                                                                        return new Node_Sub14_Sub32();
                                                                                                    } while (false);
                                                                                                    return new Node_Sub14_Sub37();
                                                                                                } while (false);
                                                                                                return new Node_Sub14_Sub12_Sub1();
                                                                                            } while (false);
                                                                                            return new Node_Sub14_Sub27();
                                                                                        } while (false);
                                                                                        return new Node_Sub14_Sub10();
                                                                                    } while (false);
                                                                                    return new Node_Sub14_Sub7();
                                                                                } while (false);
                                                                                return new Node_Sub14_Sub35();
                                                                            } while (false);
                                                                            return new Node_Sub14_Sub18();
                                                                        } while (false);
                                                                        return new Node_Sub14_Sub2();
                                                                    } while (false);
                                                                    return (new Node_Sub14_Sub36());
                                                                } while (false);
                                                                return (new Node_Sub14_Sub3());
                                                            } while (false);
                                                            return (new Node_Sub14_Sub11());
                                                        } while (false);
                                                        return (new Node_Sub14_Sub24());
                                                    } while (false);
                                                    return (new Node_Sub14_Sub16());
                                                } while (false);
                                                return (new Node_Sub14_Sub31());
                                            } while (false);
                                            return new Node_Sub14_Sub29();
                                        } while (false);
                                        return new Node_Sub14_Sub4();
                                    } while (false);
                                    return new Node_Sub14_Sub17();
                                } while (false);
                                return new Node_Sub14_Sub1();
                            } while (false);
                            return new Node_Sub14_Sub5();
                        } while (false);
                        return new Node_Sub14_Sub33();
                    } while (false);
                    return new Node_Sub14_Sub39();
                } while (false);
                return new Node_Sub14_Sub9();
            } while (false);
            return new Node_Sub14_Sub12();
        } while (false);
        return null;
    }

    public Node_Sub14_Sub7() {
        super(3, false);
    }
}
