/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class305 {
    int anInt3536;
    int anInt3537 = -1;
    int anInt3538;
    int anInt3539;
    int anInt3540;
    int anInt3541;
    int anInt3542;
    static int anInt3543;
    int anInt3544;
    int anInt3545;
    static int anInt3546;
    static int anInt3547;
    static long aLong3548;
    static boolean aBoolean3549 = false;

    static final int method3210(int i, int i_0_, byte i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt3543++;
        if ((i_4_ & 0x1) == 1) {
            int i_6_ = i_5_;
            i_5_ = i_0_;
            i_0_ = i_6_;
        }
        i_3_ &= 0x3;
        if (i_1_ != 54)
            aBoolean3549 = true;
        if (i_3_ == 0)
            return i_2_;
        if (i_3_ == 1)
            return i;
        if ((i_3_ ^ 0xffffffff) == -3)
            return -i_5_ - (-1 - -i_2_ - 7);
        return -i_0_ + (1 + (-i + 7));
    }

    static final int method3211(int i, int i_7_) {
        anInt3546++;
        if (i <= 59)
            method3212(-12, 41, 50);
        return i_7_ >>> -729810681;
    }

    static final boolean method3212(int i, int i_8_, int i_9_) {
        if (i != 1)
            aLong3548 = -41L;
        anInt3547++;
        boolean bool = ((i_8_ & 0x37 ^ 0xffffffff) != -1 ? Class229.method1832(i_8_, i_9_, (byte) 63) : Class79.method572(i_8_, 55, i_9_));
        return (RSInterface2.method3766(i + -78, i_9_, i_8_) | (i_9_ & 0x10000 ^ 0xffffffff) != -1 | bool);
    }

    Class305(Entity entity) {
        ((Class305) this).anInt3536 = -1;
        ((Class305) this).anInt3544 = -1;
    }
}
