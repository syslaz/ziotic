/* r - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class r extends Node_Sub8 {
    static boolean aBoolean9031 = false;
    static ha aHa9032;
    static byte[][][] aByteArrayArrayArray9033;
    static int anInt9034 = 0;
    static int anInt9035;

    static final boolean method2105(byte i, int i_0_, int[] is, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt9035++;
        if ((i_3_ ^ 0xffffffff) > -1)
            i_3_ = 0;
        if ((Class312.anInt3644 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
            i_0_ = Class312.anInt3644;
        if (i_0_ <= i_3_)
            return true;
        int i_6_ = -118 / ((-37 - i) / 45);
        i_1_ = -i_3_ + i_0_ >> 288627042;
        i_5_ += -1 + i_3_;
        i_2_ += i_4_ * i_3_;
        if ((Class180.anInt2093 ^ 0xffffffff) != -2) {
            i_2_ -= 38400;
            while ((--i_1_ ^ 0xffffffff) <= -1) {
                if (i_2_ < is[++i_5_])
                    return false;
                i_2_ += i_4_;
                if ((i_2_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
                    return false;
                i_2_ += i_4_;
                if (i_2_ < is[++i_5_])
                    return false;
                i_2_ += i_4_;
                if (is[++i_5_] > i_2_)
                    return false;
                i_2_ += i_4_;
            }
            i_1_ = -i_3_ + i_0_ & 0x3;
            while ((--i_1_ ^ 0xffffffff) <= -1) {
                if ((is[++i_5_] ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
                    return false;
                i_2_ += i_4_;
            }
        } else {
            Class346_Sub7_Sub4_Sub2.anInt10163 += i_1_;
            while ((--i_1_ ^ 0xffffffff) <= -1) {
                if ((i_2_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
                    is[i_5_] = i_2_;
                i_2_ += i_4_;
                if ((i_2_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
                    is[i_5_] = i_2_;
                i_2_ += i_4_;
                if (is[++i_5_] > i_2_)
                    is[i_5_] = i_2_;
                i_2_ += i_4_;
                if (i_2_ < is[++i_5_])
                    is[i_5_] = i_2_;
                i_2_ += i_4_;
            }
            i_1_ = i_0_ - i_3_ & 0x3;
            while (--i_1_ >= 0) {
                if ((is[++i_5_] ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
                    is[i_5_] = i_2_;
                i_2_ += i_4_;
            }
        }
        return true;
    }

    public static void method2106(int i) {
        aByteArrayArrayArray9033 = null;
        if (i == -1)
            aHa9032 = null;
    }

    public r() {
        /* empty */
    }
}
