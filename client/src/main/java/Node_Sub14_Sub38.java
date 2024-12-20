/* Class248_Sub14_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub38 extends Node_Sub14 {
    private int[][] anIntArrayArray9568;
    static int anInt9569;
    static int anInt9570;
    static IncommingOpcode aIncommingOpcode_9571 = new IncommingOpcode(117, -2);
    private int[] anIntArray9572;
    private short[] aShortArray9573 = new short[257];
    static int anInt9574;
    static int anInt9575;
    static int anInt9576;
    static int anInt9577;
    private int anInt9578 = 0;
    static int anInt9579;
    private int[] anIntArray9580;
    static IncommingOpcode aIncommingOpcode_9581 = new IncommingOpcode(63, 3);
    static Class174 aClass174_9582;
    static Object anObject9583;
    static Node_Sub45 aClass248_Sub45_9584;

    public Node_Sub14_Sub38() {
        super(1, true);
    }

    private final int[] method2388(int i, int i_0_) {
        if (i_0_ > -68)
            method2269(null, (byte) 28, 48);
        anInt9579++;
        if (i < 0)
            return anIntArray9580;
        if ((i ^ 0xffffffff) <= (anIntArrayArray9568.length ^ 0xffffffff))
            return anIntArray9572;
        return anIntArrayArray9568[i];
    }

    final int[] method2264(byte i, int i_1_) {
        anInt9570++;
        if (i != -40)
            aIncommingOpcode_9581 = null;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_1_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_2_ = this.method2265((byte) 64, i_1_, 0);
            for (int i_3_ = 0; Class185.anInt2164 > i_3_; i_3_++) {
                int i_4_ = is_2_[i_3_] >> 1999112676;
                if ((i_4_ ^ 0xffffffff) > -1)
                    i_4_ = 0;
                if (i_4_ > 256)
                    i_4_ = 256;
                is[i_3_] = aShortArray9573[i_4_];
            }
        }
        return is;
    }

    final void method2263(int i) {
        if (anIntArrayArray9568 == null)
            anIntArrayArray9568 = new int[][]{new int[2], {4096, 4096}};
        anInt9575++;
        if ((anIntArrayArray9568.length ^ 0xffffffff) > -3)
            throw new RuntimeException("Curve operation requires at least two markers");
        if (anInt9578 == 2)
            method2389(true);
        s_Sub3.method3164(true);
        if (i != 8351)
            aShortArray9573 = null;
        method2390((byte) 41);
    }

    private final void method2389(boolean bool) {
        anInt9574++;
        int[] is = anIntArrayArray9568[0];
        int[] is_5_ = anIntArrayArray9568[1];
        if (bool != true)
            method2390((byte) -21);
        int[] is_6_ = anIntArrayArray9568[-2 + anIntArrayArray9568.length];
        int[] is_7_ = anIntArrayArray9568[anIntArrayArray9568.length - 1];
        anIntArray9572 = new int[]{is_6_[0] + -is_7_[0] + is_6_[0], is_6_[1] + is_6_[1] - is_7_[1]};
        anIntArray9580 = new int[]{is[0] + -is_5_[0] + is[0], is[1] - (is_5_[1] - is[1])};
    }

    private final void method2390(byte i) {
        if (i > 0) {
            int i_8_ = anInt9578;
            while_226_:
            do {
                do {
                    if (i_8_ != 2) {
                        if ((i_8_ ^ 0xffffffff) != -2)
                            break;
                    } else {
                        for (i_8_ = 0; i_8_ < 257; i_8_++) {
                            int i_9_ = i_8_ << 1559929700;
                            int i_10_;
                            for (i_10_ = 1; i_10_ < -1 + anIntArrayArray9568.length; i_10_++) {
                                if (anIntArrayArray9568[i_10_][0] > i_9_)
                                    break;
                            }
                            int[] is = anIntArrayArray9568[-1 + i_10_];
                            int[] is_11_ = anIntArrayArray9568[i_10_];
                            int i_12_ = method2388(i_10_ - 2, -89)[1];
                            int i_13_ = is[1];
                            int i_14_ = is_11_[1];
                            int i_15_ = method2388(i_10_ - -1, -97)[1];
                            int i_16_ = ((-is[0] + i_9_ << -312967124) / (is_11_[0] + -is[0]));
                            int i_17_ = i_16_ * i_16_ >> 1951892972;
                            int i_18_ = i_13_ + (-i_12_ + i_15_ - i_14_);
                            int i_19_ = i_12_ + -i_13_ + -i_18_;
                            int i_20_ = i_14_ + -i_12_;
                            int i_21_ = i_13_;
                            int i_22_ = ((i_18_ * i_16_ >> 793925772) * i_17_ >> 562537964);
                            int i_23_ = i_17_ * i_19_ >> -1385887764;
                            int i_24_ = i_16_ * i_20_ >> 949108268;
                            int i_25_ = i_21_ + i_24_ + i_22_ + i_23_;
                            if (i_25_ <= -32768)
                                i_25_ = -32767;
                            if ((i_25_ ^ 0xffffffff) <= -32769)
                                i_25_ = 32767;
                            aShortArray9573[i_8_] = (short) i_25_;
                        }
                        break while_226_;
                    }
                    for (i_8_ = 0; (i_8_ ^ 0xffffffff) > -258; i_8_++) {
                        int i_26_ = i_8_ << -66363644;
                        int i_27_;
                        for (i_27_ = 1; -1 + anIntArrayArray9568.length > i_27_; i_27_++) {
                            if ((anIntArrayArray9568[i_27_][0] ^ 0xffffffff) < (i_26_ ^ 0xffffffff))
                                break;
                        }
                        int[] is = anIntArrayArray9568[i_27_ - 1];
                        int[] is_28_ = anIntArrayArray9568[i_27_];
                        int i_29_ = ((-is[0] + i_26_ << 1828735500) / (-is[0] + is_28_[0]));
                        int i_30_ = (4096 - (Class21.anIntArray317[i_29_ >> 1411694437 & 0xff]) >> 1019991105);
                        int i_31_ = 4096 + -i_30_;
                        int i_32_ = is_28_[1] * i_30_ + i_31_ * is[1] >> -450001364;
                        if ((i_32_ ^ 0xffffffff) >= 32767)
                            i_32_ = -32767;
                        if ((i_32_ ^ 0xffffffff) <= -32769)
                            i_32_ = 32767;
                        aShortArray9573[i_8_] = (short) i_32_;
                    }
                    break while_226_;
                } while (false);
                for (i_8_ = 0; (i_8_ ^ 0xffffffff) > -258; i_8_++) {
                    int i_33_ = i_8_ << -1485697788;
                    int i_34_;
                    for (i_34_ = 1; ((-1 + anIntArrayArray9568.length ^ 0xffffffff) < (i_34_ ^ 0xffffffff)); i_34_++) {
                        if ((anIntArrayArray9568[i_34_][0] ^ 0xffffffff) < (i_33_ ^ 0xffffffff))
                            break;
                    }
                    int[] is = anIntArrayArray9568[i_34_ + -1];
                    int[] is_35_ = anIntArrayArray9568[i_34_];
                    int i_36_ = ((-is[0] + i_33_ << 1176346412) / (is_35_[0] + -is[0]));
                    int i_37_ = 4096 + -i_36_;
                    int i_38_ = i_37_ * is[1] - -(is_35_[1] * i_36_) >> 267275724;
                    if (i_38_ <= -32768)
                        i_38_ = -32767;
                    if (i_38_ >= 32768)
                        i_38_ = 32767;
                    aShortArray9573[i_8_] = (short) i_38_;
                }
            } while (false);
            anInt9577++;
        }
    }

    public static void method2391(boolean bool) {
        aClass248_Sub45_9584 = null;
        anObject9583 = null;
        aClass174_9582 = null;
        aIncommingOpcode_9581 = null;
        aIncommingOpcode_9571 = null;
        if (bool != true)
            aClass248_Sub45_9584 = null;
    }

    static final void method2392(boolean bool, int i) {
        Animable.method3601(32280, Class179.anInt2084, Class146.anInt1724, Class282_Sub20.anInt7800, bool);
        if (i >= -32)
            method2391(false);
        anInt9569++;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_39_) {
        if (i_39_ == 0) {
            anInt9578 = class248_sub9.readUnsignedByte((byte) -88);
            anIntArrayArray9568 = new int[class248_sub9.readUnsignedByte((byte) 70)][2];
            for (int i_40_ = 0; anIntArrayArray9568.length > i_40_; i_40_++) {
                anIntArrayArray9568[i_40_][0] = class248_sub9.readShort(i + 60);
                anIntArrayArray9568[i_40_][1] = class248_sub9.readShort(i + 60);
            }
        }
        if (i != -61)
            aClass174_9582 = null;
        anInt9576++;
    }
}
