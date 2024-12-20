/* Class248_Sub14_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub33 extends Node_Sub14 {
    private int anInt9507 = -1;
    static int anInt9508;
    static int anInt9509;
    static int anInt9510 = 13156520;
    static int anInt9511;
    static int anInt9512;
    private int[] anIntArray9513;
    static int anInt9514;
    static int anInt9515;
    static long aLong9516;
    private int anInt9517;
    private int anInt9518;
    static int anInt9519;

    final int method2272(int i) {
        anInt9508++;
        if (i <= 85)
            anInt9518 = -57;
        return anInt9507;
    }

    static final boolean method2374(int i, int i_0_) {
        anInt9519++;
        if (i_0_ < 72)
            anInt9510 = 75;
        if (i != 0 && i != 1 && i != 2)
            return false;
        return true;
    }

    final void method2268(int i, byte i_1_, int i_2_) {
        anInt9511++;
        int i_3_ = 105 % ((i_1_ - 47) / 38);
        super.method2268(i, (byte) -117, i_2_);
        if ((anInt9507 ^ 0xffffffff) <= -1 && Class24.aD330 != null) {
            int i_4_ = (!(((Class312) Class24.aD330.method25(anInt9507, (byte) 127)).aBoolean3636) ? 128 : 64);
            anIntArray9513 = Class24.aD330.method24(-125, i_4_, 1.0F, false, anInt9507, i_4_);
            anInt9517 = i_4_;
            anInt9518 = i_4_;
        }
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9515++;
        if (bool != true)
            anIntArray9513 = null;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int i_5_ = ((Class250.anInt2819 != anInt9518 ? anInt9518 * i / Class250.anInt2819 : i) * anInt9517);
            int[] is_6_ = is[0];
            int[] is_7_ = is[1];
            int[] is_8_ = is[2];
            if ((anInt9517 ^ 0xffffffff) != (Class185.anInt2164 ^ 0xffffffff)) {
                for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_9_++) {
                    int i_10_ = i_9_ * anInt9517 / Class185.anInt2164;
                    int i_11_ = anIntArray9513[i_5_ - -i_10_];
                    is_8_[i_9_] = Class112.method794(i_11_ << -1816005916, 4080);
                    is_7_[i_9_] = Class112.method794(4080, i_11_ >> -1740263612);
                    is_6_[i_9_] = Class112.method794(4080, i_11_ >> 2145115532);
                }
            } else {
                for (int i_12_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
                    int i_13_ = anIntArray9513[i_5_++];
                    is_8_[i_12_] = Class112.method794(i_13_ << -263344220, 4080);
                    is_7_[i_12_] = Class112.method794(i_13_ >> -1299613852, 4080);
                    is_6_[i_12_] = Class112.method794(4080, i_13_ >> -168661620);
                }
            }
        }
        return is;
    }

    static final void method2375(boolean bool, int i) {
        anInt9509++;
        if (bool != false)
            method2374(116, 71);
        Class170.anInt1983 = i;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_14_) {
        if ((i_14_ ^ 0xffffffff) == -1)
            anInt9507 = class248_sub9.readShort(-1);
        anInt9514++;
        if (i != -61)
            anIntArray9513 = null;
    }

    public Node_Sub14_Sub33() {
        super(0, false);
    }

    final void method2273(boolean bool) {
        super.method2273(bool);
        anInt9512++;
        if (bool != true)
            anInt9510 = -97;
        anIntArray9513 = null;
    }
}
