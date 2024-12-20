/* Class248_Sub14_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub21 extends Node_Sub14 {
    private int anInt9376 = 585;
    static int anInt9377;
    static int anInt9378 = 0;
    static int anInt9379;
    static int[] anIntArray9380;
    static int[] anIntArray9381 = new int[4096];
    static int anInt9382;
    static int anInt9383;

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        anInt9377++;
        if (i != -61)
            method2264((byte) -34, 78);
        int i_1_ = i_0_;
        if ((i_1_ ^ 0xffffffff) == -1)
            anInt9376 = class248_sub9.readShort(-1);
    }

    public static void method2340(byte i) {
        anIntArray9381 = null;
        if (i != -69)
            anIntArray9381 = null;
        anIntArray9380 = null;
    }

    public Node_Sub14_Sub21() {
        super(0, true);
    }

    final int[] method2264(byte i, int i_2_) {
        anInt9383++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_2_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_3_ = Node_Sub14_Sub3.anIntArray9184[i_2_];
            for (int i_4_ = 0; i_4_ < Class185.anInt2164; i_4_++) {
                int i_5_ = Node_Sub8_Sub3.anIntArray8921[i_4_];
                if (i_5_ > anInt9376 && i_5_ < -anInt9376 + 4096 && i_3_ > -anInt9376 + 2048 && i_3_ < 2048 + anInt9376) {
                    int i_6_ = -i_5_ + 2048;
                    i_6_ = (i_6_ ^ 0xffffffff) > -1 ? -i_6_ : i_6_;
                    i_6_ <<= 12;
                    i_6_ /= 2048 - anInt9376;
                    is[i_4_] = -i_6_ + 4096;
                } else if (2048 - anInt9376 < i_5_ && i_5_ < anInt9376 + 2048) {
                    int i_7_ = i_3_ + -2048;
                    i_7_ = (i_7_ ^ 0xffffffff) <= -1 ? i_7_ : -i_7_;
                    i_7_ -= anInt9376;
                    i_7_ <<= 12;
                    is[i_4_] = i_7_ / (-anInt9376 + 2048);
                } else if ((anInt9376 ^ 0xffffffff) < (i_3_ ^ 0xffffffff) || (i_3_ ^ 0xffffffff) < (-anInt9376 + 4096 ^ 0xffffffff)) {
                    int i_8_ = -2048 + i_5_;
                    i_8_ = i_8_ < 0 ? -i_8_ : i_8_;
                    i_8_ -= anInt9376;
                    i_8_ <<= 12;
                    is[i_4_] = i_8_ / (-anInt9376 + 2048);
                } else if (i_5_ < anInt9376 || (i_5_ ^ 0xffffffff) < (-anInt9376 + 4096 ^ 0xffffffff)) {
                    int i_9_ = 2048 + -i_3_;
                    i_9_ = (i_9_ ^ 0xffffffff) <= -1 ? i_9_ : -i_9_;
                    i_9_ <<= 12;
                    i_9_ /= -anInt9376 + 2048;
                    is[i_4_] = 4096 - i_9_;
                } else
                    is[i_4_] = 0;
            }
        }
        if (i != -40)
            anInt9379 = -14;
        return is;
    }
}
