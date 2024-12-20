/* Class248_Sub14_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub11 extends Node_Sub14 {
    static Class129[] aClass129Array9254;
    private int[] anIntArray9255;
    private int anInt9256;
    static int anInt9257;
    private int anInt9258 = 0;
    private int anInt9259 = 10;
    static int anInt9260;
    static int anInt9261;
    private int[] anIntArray9262;
    static int anInt9263;

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        anInt9261++;
        int i_1_ = i_0_;
        while_68_:
        do {
            do {
                if (i_1_ != 0) {
                    if (i_1_ != 1) {
                        if ((i_1_ ^ 0xffffffff) == -3)
                            break;
                        break while_68_;
                    }
                } else {
                    anInt9259 = class248_sub9.readUnsignedByte((byte) -88);
                    break while_68_;
                }
                anInt9256 = class248_sub9.readShort(-1);
                break while_68_;
            } while (false);
            anInt9258 = class248_sub9.readUnsignedByte((byte) 127);
        } while (false);
        if (i != -61)
            method2303(-93);
    }

    final void method2263(int i) {
        method2304(4096);
        anInt9257++;
        if (i != 8351)
            method2269(null, (byte) -55, -79);
    }

    public static void method2303(int i) {
        aClass129Array9254 = null;
        if (i != 2048)
            aClass129Array9254 = null;
    }

    private final void method2304(int i) {
        anInt9260++;
        anIntArray9255 = new int[anInt9259 - -1];
        anIntArray9262 = new int[anInt9259 - -1];
        int i_2_ = 0;
        int i_3_ = i / anInt9259;
        int i_4_ = i_3_ * anInt9256 >> -2066083412;
        for (int i_5_ = 0; anInt9259 > i_5_; i_5_++) {
            anIntArray9255[i_5_] = i_2_;
            anIntArray9262[i_5_] = i_4_ + i_2_;
            i_2_ += i_3_;
        }
        anIntArray9255[anInt9259] = 4096;
        anIntArray9262[anInt9259] = anIntArray9262[0] + 4096;
    }

    public Node_Sub14_Sub11() {
        super(0, true);
        anInt9256 = 2048;
    }

    final int[] method2264(byte i, int i_6_) {
        anInt9263++;
        if (i != -40)
            method2263(31);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_6_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_7_ = Node_Sub14_Sub3.anIntArray9184[i_6_];
            if (anInt9258 == 0) {
                int i_8_ = 0;
                for (int i_9_ = 0; i_9_ < anInt9259; i_9_++) {
                    if (i_7_ >= anIntArray9255[i_9_] && ((anIntArray9255[1 + i_9_] ^ 0xffffffff) < (i_7_ ^ 0xffffffff))) {
                        if ((anIntArray9262[i_9_] ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
                            i_8_ = 4096;
                        break;
                    }
                }
                Class159.method1403(is, 0, Class185.anInt2164, i_8_);
            } else {
                for (int i_10_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
                    int i_11_ = 0;
                    int i_12_ = 0;
                    int i_13_ = Node_Sub8_Sub3.anIntArray8921[i_10_];
                    int i_14_ = anInt9258;
                    while_69_:
                    do {
                        do {
                            if ((i_14_ ^ 0xffffffff) != -2) {
                                if (i_14_ != 2) {
                                    if (i_14_ == 3)
                                        break;
                                    break while_69_;
                                }
                            } else {
                                i_11_ = i_13_;
                                break while_69_;
                            }
                            i_11_ = (i_13_ - -i_7_ - 4096 >> -551480959) + 2048;
                            break while_69_;
                        } while (false);
                        i_11_ = 2048 + (-i_7_ + i_13_ >> 725609825);
                    } while (false);
                    for (i_14_ = 0; anInt9259 > i_14_; i_14_++) {
                        if (i_11_ >= anIntArray9255[i_14_] && anIntArray9255[1 + i_14_] > i_11_) {
                            if (i_11_ < anIntArray9262[i_14_])
                                i_12_ = 4096;
                            break;
                        }
                    }
                    is[i_10_] = i_12_;
                }
            }
        }
        return is;
    }
}
