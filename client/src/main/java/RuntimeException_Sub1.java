/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class RuntimeException_Sub1 extends RuntimeException {
    static int anInt4706;
    static int anInt4707 = 500;
    Throwable aThrowable4708;
    static int anInt4709;
    String aString4710;

    static final void method3940(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte[] is) {
        anInt4709++;
        if (i_2_ > 0 && !Class343.method3508(i_2_, -31218))
            throw new IllegalArgumentException("");
        if (i != -23712)
            anInt4707 = -98;
        if (i_0_ > 0 && !Class343.method3508(i_0_, i + -7506))
            throw new IllegalArgumentException("");
        int i_5_ = Class122.method1129(i_4_, (byte) -92);
        int i_6_ = 0;
        int i_7_ = i_0_ <= i_2_ ? i_0_ : i_2_;
        int i_8_ = i_2_ >> -1038779359;
        int i_9_ = i_0_ >> -509838399;
        byte[] is_10_ = is;
        byte[] is_11_ = new byte[i_9_ * (i_8_ * i_5_)];
        for (; ; ) {
            OpenGL.glTexImage2Dub(i_3_, i_6_, i_1_, i_2_, i_0_, 0, i_4_, 5121, is_10_, 0);
            if ((i_7_ ^ 0xffffffff) >= -2)
                break;
            int i_12_ = i_2_ * i_5_;
            for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_13_++) {
                int i_14_ = i_13_;
                int i_15_ = i_13_;
                int i_16_ = i_12_ + i_15_;
                for (int i_17_ = 0; i_17_ < i_9_; i_17_++) {
                    for (int i_18_ = 0; i_18_ < i_8_; i_18_++) {
                        int i_19_ = is_10_[i_15_];
                        i_15_ += i_5_;
                        i_19_ += is_10_[i_15_];
                        i_15_ += i_5_;
                        i_19_ += is_10_[i_16_];
                        i_16_ += i_5_;
                        i_19_ += is_10_[i_16_];
                        i_16_ += i_5_;
                        is_11_[i_14_] = (byte) (i_19_ >> 949952578);
                        i_14_ += i_5_;
                    }
                    i_15_ += i_12_;
                    i_16_ += i_12_;
                }
            }
            byte[] is_20_ = is_11_;
            is_11_ = is_10_;
            i_0_ = i_9_;
            is_10_ = is_20_;
            i_2_ = i_8_;
            i_6_++;
            i_7_ >>= 1;
            i_9_ >>= 1;
            i_8_ >>= 1;
        }
    }

    static final int method3941(int i, byte[] is, int i_21_, String string, int i_22_, int i_23_) {
        anInt4706++;
        int i_24_ = -i + i_22_;
        for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
            int i_26_ = string.charAt(i + i_25_);
            if ((i_26_ <= 0 || i_26_ >= 128) && ((i_26_ ^ 0xffffffff) > -161 || i_26_ > 255)) {
                if ((i_26_ ^ 0xffffffff) != -8365) {
                    if (i_26_ != 8218) {
                        if ((i_26_ ^ 0xffffffff) == -403)
                            is[i_23_ + i_25_] = (byte) -125;
                        else if ((i_26_ ^ 0xffffffff) != -8223) {
                            if (i_26_ != 8230) {
                                if (i_26_ != 8224) {
                                    if ((i_26_ ^ 0xffffffff) != -8226) {
                                        if (i_26_ == 710)
                                            is[i_23_ - -i_25_] = (byte) -120;
                                        else if (i_26_ == 8240)
                                            is[i_23_ - -i_25_] = (byte) -119;
                                        else if ((i_26_ ^ 0xffffffff) != -353) {
                                            if (i_26_ != 8249) {
                                                if ((i_26_ ^ 0xffffffff) != -339) {
                                                    if ((i_26_ ^ 0xffffffff) != -382) {
                                                        if ((i_26_ ^ 0xffffffff) == -8217)
                                                            is[i_25_ + i_23_] = (byte) -111;
                                                        else if ((i_26_ ^ 0xffffffff) != -8218) {
                                                            if ((i_26_ ^ 0xffffffff) != -8221) {
                                                                if (i_26_ != 8221) {
                                                                    if ((i_26_ ^ 0xffffffff) != -8227) {
                                                                        if (i_26_ == 8211)
                                                                            is[i_25_ + i_23_] = (byte) -106;
                                                                        else if (i_26_ == 8212)
                                                                            is[i_25_ + i_23_] = (byte) -105;
                                                                        else if (i_26_ != 732) {
                                                                            if (i_26_ != 8482) {
                                                                                if ((i_26_ ^ 0xffffffff) == -354)
                                                                                    is[i_23_ - -i_25_] = (byte) -102;
                                                                                else if ((i_26_ ^ 0xffffffff) == -8251)
                                                                                    is[i_25_ + i_23_] = (byte) -101;
                                                                                else if (i_26_ == 339)
                                                                                    is[i_23_ - -i_25_] = (byte) -100;
                                                                                else if (i_26_ == 382)
                                                                                    is[i_25_ + i_23_] = (byte) -98;
                                                                                else if ((i_26_ ^ 0xffffffff) == -377)
                                                                                    is[i_25_ + i_23_] = (byte) -97;
                                                                                else
                                                                                    is[i_23_ + i_25_] = (byte) 63;
                                                                            } else
                                                                                is[i_25_ + i_23_] = (byte) -103;
                                                                        } else
                                                                            is[i_23_ - -i_25_] = (byte) -104;
                                                                    } else
                                                                        is[(i_25_ + i_23_)] = (byte) -107;
                                                                } else
                                                                    is[(i_25_ + i_23_)] = (byte) -108;
                                                            } else
                                                                is[(i_23_ - -i_25_)] = (byte) -109;
                                                        } else
                                                            is[i_23_ + i_25_] = (byte) -110;
                                                    } else
                                                        is[i_23_ - -i_25_] = (byte) -114;
                                                } else
                                                    is[i_23_ - -i_25_] = (byte) -116;
                                            } else
                                                is[i_23_ + i_25_] = (byte) -117;
                                        } else
                                            is[i_23_ - -i_25_] = (byte) -118;
                                    } else
                                        is[i_23_ + i_25_] = (byte) -121;
                                } else
                                    is[i_25_ + i_23_] = (byte) -122;
                            } else
                                is[i_23_ + i_25_] = (byte) -123;
                        } else
                            is[i_23_ + i_25_] = (byte) -124;
                    } else
                        is[i_25_ + i_23_] = (byte) -126;
                } else
                    is[i_25_ + i_23_] = (byte) -128;
            } else
                is[i_25_ + i_23_] = (byte) i_26_;
        }
        int i_27_ = -19 / ((i_21_ - 20) / 63);
        return i_24_;
    }

    RuntimeException_Sub1(Throwable throwable, String string) {
        ((RuntimeException_Sub1) this).aString4710 = string;
        ((RuntimeException_Sub1) this).aThrowable4708 = throwable;
    }
}
