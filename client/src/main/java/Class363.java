/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class363 {
    static int anInt4473;
    static int anInt4474;
    static Class65 aClass65_4475;
    static int anInt4476;
    static byte[] aByteArray4477 = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
    static Class64 aClass64_4478;

    static final void method3820(byte i, int i_0_) {
        if (i != 0)
            method3820((byte) -87, 87);
        anInt4473++;
        if (Class11.anIntArray247 == null || (i_0_ ^ 0xffffffff) < (Class11.anIntArray247.length ^ 0xffffffff))
            Class11.anIntArray247 = new int[i_0_];
    }

    static final void method3821(int i, ha_Sub2 var_ha_Sub2) {
        if (Node_Sub36.anObject7258 == null) {
            Class279_Sub2_Sub1 class279_sub2_sub1 = new Class279_Sub2_Sub1();
            byte[] is = class279_sub2_sub1.method2900(128, (byte) 114, 16, 128);
            Node_Sub36.anObject7258 = Class255.method2742(false, is, (byte) 127);
        }
        anInt4474++;
        if (Class108.anObject1367 == null) {
            Class279_Sub1_Sub1 class279_sub1_sub1 = new Class279_Sub1_Sub1();
            byte[] is = class279_sub1_sub1.method2888(128, 16, 128, 4096);
            Class108.anObject1367 = Class255.method2742(false, is, (byte) 62);
        }
        Class382 class382 = ((ha_Sub2) var_ha_Sub2).aClass382_5801;
        if (class382.method3938(35632) && Canvas_Sub1.anObject72 == null) {
            byte[] is = Class228.method1828(4.0F, 0.6F, 4.0F, (byte) 113, new Class44_Sub1(419684), 128, 16.0F, 16, 8, 128, 0.5F);
            Canvas_Sub1.anObject72 = Class255.method2742(false, is, (byte) 115);
        }
        if (i > -100)
            method3820((byte) 41, 110);
    }

    public static void method3822(byte i) {
        aClass65_4475 = null;
        aByteArray4477 = null;
        if (i != 43)
            aClass64_4478 = null;
        aClass64_4478 = null;
    }

    static final int method3823(int i, byte i_1_) {
        anInt4476++;
        double d = (double) ((i & 0xfff27a) >> -1853126256) / 256.0;
        double d_2_ = (double) ((0xffe1 & i) >> -345722936) / 256.0;
        double d_3_ = (double) (0xff & i) / 256.0;
        double d_4_ = d;
        if (d_2_ < d_4_)
            d_4_ = d_2_;
        if (d_3_ < d_4_)
            d_4_ = d_3_;
        double d_5_ = d;
        if (d_5_ < d_2_)
            d_5_ = d_2_;
        if (d_5_ < d_3_)
            d_5_ = d_3_;
        double d_6_ = 0.0;
        double d_7_ = 0.0;
        double d_8_ = (d_5_ + d_4_) / 2.0;
        if (d_5_ != d_4_) {
            if (d_8_ < 0.5)
                d_7_ = (d_5_ - d_4_) / (d_5_ + d_4_);
            if (d_5_ != d) {
                if (d_5_ == d_2_)
                    d_6_ = 2.0 + (-d + d_3_) / (-d_4_ + d_5_);
                else if (d_5_ == d_3_)
                    d_6_ = 4.0 + (d - d_2_) / (d_5_ - d_4_);
            } else
                d_6_ = (-d_3_ + d_2_) / (d_5_ - d_4_);
            if (d_8_ >= 0.5)
                d_7_ = (d_5_ - d_4_) / (2.0 - d_5_ - d_4_);
        }
        d_6_ /= 6.0;
        int i_9_ = (int) (d_6_ * 256.0);
        int i_10_ = (int) (d_7_ * 256.0);
        if ((i_10_ ^ 0xffffffff) > -1)
            i_10_ = 0;
        else if ((i_10_ ^ 0xffffffff) < -256)
            i_10_ = 255;
        int i_11_ = (int) (256.0 * d_8_);
        if (i_11_ < 0)
            i_11_ = 0;
        else if (i_11_ > 255)
            i_11_ = 255;
        if (i_11_ <= 243) {
            if ((i_11_ ^ 0xffffffff) < -218)
                i_10_ >>= 3;
            else if ((i_11_ ^ 0xffffffff) < -193)
                i_10_ >>= 2;
            else if ((i_11_ ^ 0xffffffff) < -180)
                i_10_ >>= 1;
        } else
            i_10_ >>= 4;
        if (i_1_ < 102)
            aClass64_4478 = null;
        return ((i_10_ >> 1667728741 << 857178823) + ((i_9_ & 0xff) >> -501748766 << 677720618) + (i_11_ >> 1037846945));
    }

    static {
        aClass65_4475 = new Class65(16);
        aClass64_4478 = new Class64();
    }
}
