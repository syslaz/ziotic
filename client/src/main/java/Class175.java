/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class175 {
    static Class58 aClass58_2053 = new Class58("", 18);
    static int anInt2054;
    static int anInt2055 = 1;
    static IncommingOpcode aIncommingOpcode_2056 = new IncommingOpcode(20, 4);
    static int anInt2057;

    public static void method1585(int i) {
        aIncommingOpcode_2056 = null;
        if (i != 3)
            anInt2055 = 38;
        aClass58_2053 = null;
    }

    static final void method1586(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt2057++;
        if (i_2_ < i) {
            i_3_ = i - i_2_ >> 1673044002;
            i_0_ += i_2_;
            if (i_1_ == 11567) {
                while (--i_3_ >= 0) {
                    is[i_0_++] = (byte) 1;
                    is[i_0_++] = (byte) 1;
                    is[i_0_++] = (byte) 1;
                    is[i_0_++] = (byte) 1;
                }
                i_3_ = 0x3 & i + -i_2_;
                while ((--i_3_ ^ 0xffffffff) <= -1)
                    is[i_0_++] = (byte) 1;
            }
        }
    }

    static final void method1587(int i, int i_4_, int i_5_) {
        anInt2054++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, i_5_ ^ ~0x342446cf, i_5_);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_4_;
    }
}
