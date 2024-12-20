/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class142 {
    static Class5 aClass5_1669 = new Class5();
    static int anInt1670;
    static Class128 aClass128_1671 = new Class128(3, 19);
    static int anInt1672;
    static long[] aLongArray1673;
    static int anInt1674;
    static Class278 aClass278_1675 = new Class278(8);

    public static void method1289(int i) {
        aLongArray1673 = null;
        aClass5_1669 = null;
        aClass128_1671 = null;
        aClass278_1675 = null;
        if (i != 128)
            aLongArray1673 = null;
    }

    static final void method1290(int i) {
        anInt1670++;
        aa.aClass278_101.method2872((byte) -78);
        if (i != 1235398604)
            aClass278_1675 = null;
    }

    static final String method1291(byte[] is, int i, int i_0_, int i_1_) {
        anInt1672++;
        char[] cs = new char[i];
        int i_2_ = 0;
        int i_3_ = i_0_;
        int i_4_ = i_0_ - -i;
        if (i_1_ < 101)
            method1289(1);
        while (i_3_ < i_4_) {
            int i_5_ = is[i_3_++] & 0xff;
            int i_6_;
            if (i_5_ < 128) {
                if (i_5_ != 0)
                    i_6_ = i_5_;
                else
                    i_6_ = 65533;
            } else if (i_5_ < 192)
                i_6_ = 65533;
            else if (i_5_ >= 224) {
                if (i_5_ < 240) {
                    if ((i_3_ - -1 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff) || (is[i_3_] & 0xc0 ^ 0xffffffff) != -129 || (is[i_3_ - -1] & 0xc0) != 128)
                        i_6_ = 65533;
                    else {
                        i_6_ = ((0xf & i_5_) << 1235398604 | is[i_3_++] << 855914406 & 0xfc0 | 0x3f & is[i_3_++]);
                        if (i_6_ < 2048)
                            i_6_ = 65533;
                    }
                } else if ((i_5_ ^ 0xffffffff) > -249) {
                    if (2 + i_3_ >= i_4_ || (0xc0 & is[i_3_]) != 128 || (0xc0 & is[i_3_ + 1] ^ 0xffffffff) != -129 || (is[i_3_ + 2] & 0xc0) != 128)
                        i_6_ = 65533;
                    else {
                        i_6_ = (0x3f000 & is[i_3_++] << 2134042380 | 0x1c0000 & i_5_ << -1233416974 | 0xfc0 & is[i_3_++] << 1653899686 | 0x3f & is[i_3_++]);
                        if (i_6_ < 65536 || (i_6_ ^ 0xffffffff) < -1114112)
                            i_6_ = 65533;
                        else
                            i_6_ = 65533;
                    }
                } else
                    i_6_ = 65533;
            } else if ((i_3_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff) && (0xc0 & is[i_3_]) == 128) {
                i_6_ = 0x3f & is[i_3_++] | 0x7c0 & i_5_ << -1752640826;
                if (i_6_ < 128)
                    i_6_ = 65533;
            } else
                i_6_ = 65533;
            cs[i_2_++] = (char) i_6_;
        }
        return new String(cs, 0, i_2_);
    }
}
