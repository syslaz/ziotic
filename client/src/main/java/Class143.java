/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class143 {
    private long[] aLongArray1676;
    private long[] aLongArray1677 = new long[8];
    static boolean[] aBooleanArray1678 = new boolean[100];
    static int anInt1679;
    static int anInt1680;
    private long[] aLongArray1681;
    private int anInt1682;
    static int anInt1683;
    private byte[] aByteArray1684;
    private int anInt1685;
    private long[] aLongArray1686;
    static int anInt1687;
    private byte[] aByteArray1688;
    private long[] aLongArray1689;
    static int anInt1690;

    final void method1292(byte[] is, long l, int i) {
        anInt1680++;
        int i_0_ = 0;
        int i_1_ = 8 - (0x7 & (int) l) & 0x7;
        int i_2_ = 0x7 & anInt1685;
        if (i > -123)
            method1294(true);
        long l_3_ = l;
        int i_4_ = 31;
        int i_5_ = 0;
        for (/**/; i_4_ >= 0; i_4_--) {
            i_5_ += (0xff & aByteArray1684[i_4_]) + (0xff & (int) l_3_);
            aByteArray1684[i_4_] = (byte) i_5_;
            l_3_ >>>= 8;
            i_5_ >>>= 8;
        }
        while ((l ^ 0xffffffffffffffffL) < -9L) {
            int i_6_ = (0xff & is[i_0_] << i_1_ | (is[1 + i_0_] & 0xff) >>> -i_1_ + 8);
            if (i_6_ < 0 || i_6_ >= 256)
                throw new RuntimeException("LOGIC ERROR");
            aByteArray1688[anInt1682] = (byte) Class358.retrieveLooksSettings(aByteArray1688[anInt1682], i_6_ >>> i_2_);
            anInt1682++;
            anInt1685 += 8 - i_2_;
            if ((anInt1685 ^ 0xffffffff) == -513) {
                method1295((byte) -79);
                anInt1685 = anInt1682 = 0;
            }
            aByteArray1688[anInt1682] = (byte) Class112.method794(i_6_ << 8 + -i_2_, 255);
            anInt1685 += i_2_;
            l -= 8L;
            i_0_++;
        }
        int i_7_;
        if (l > 0L) {
            i_7_ = is[i_0_] << i_1_ & 0xff;
            aByteArray1688[anInt1682] = (byte) Class358.retrieveLooksSettings(aByteArray1688[anInt1682], i_7_ >>> i_2_);
        } else
            i_7_ = 0;
        if (((long) i_2_ - -l ^ 0xffffffffffffffffL) <= -9L) {
            anInt1685 += -i_2_ + 8;
            anInt1682++;
            l -= (long) (-i_2_ + 8);
            if ((anInt1685 ^ 0xffffffff) == -513) {
                method1295((byte) -116);
                anInt1685 = anInt1682 = 0;
            }
            aByteArray1688[anInt1682] = (byte) Class112.method794(i_7_ << -i_2_ + 8, 255);
            anInt1685 += (int) l;
        } else
            anInt1685 += l;
    }

    final void method1293(byte[] is, int i, int i_8_) {
        anInt1679++;
        aByteArray1688[anInt1682] = (byte) Class358.retrieveLooksSettings(aByteArray1688[anInt1682], 128 >>> Class112.method794(7, anInt1685));
        anInt1682++;
        if (anInt1682 > 32) {
            while ((anInt1682 ^ 0xffffffff) > -65)
                aByteArray1688[anInt1682++] = (byte) 0;
            method1295((byte) -113);
            anInt1682 = 0;
        }
        while ((anInt1682 ^ 0xffffffff) > -33)
            aByteArray1688[anInt1682++] = (byte) 0;
        Class159.method1402(aByteArray1684, 0, aByteArray1688, i_8_, 32);
        method1295((byte) -91);
        int i_9_ = 0;
        int i_10_ = i;
        while (i_9_ < 8) {
            long l = aLongArray1686[i_9_];
            is[i_10_] = (byte) (int) (l >>> 1449932728);
            is[1 + i_10_] = (byte) (int) (l >>> -872387984);
            is[2 + i_10_] = (byte) (int) (l >>> -925870104);
            is[i_10_ - -3] = (byte) (int) (l >>> 1569952992);
            is[4 + i_10_] = (byte) (int) (l >>> -316416232);
            is[i_10_ + 5] = (byte) (int) (l >>> -1695788400);
            is[i_10_ - -6] = (byte) (int) (l >>> 1336954824);
            is[i_10_ + 7] = (byte) (int) l;
            i_9_++;
            i_10_ += 8;
        }
    }

    public static void method1294(boolean bool) {
        aBooleanArray1678 = null;
        if (bool != true)
            aBooleanArray1678 = null;
    }

    private final void method1295(byte i) {
        int i_11_ = 0;
        int i_12_ = 0;
        if (i > -49)
            method1294(false);
        while (i_11_ < 8) {
            aLongArray1681[i_11_] = (Class84_Sub1.method604((Class84_Sub1.method604(Class310.method3236((long) aByteArray1688[6 + i_12_], 255L) << 866787784, (Class84_Sub1.method604(Class310.method3236((long) aByteArray1688[5 + i_12_], 255L) << 992628048, (Class84_Sub1.method604((Class84_Sub1.method604((Class84_Sub1.method604((Class310.method3236(255L, (long) (aByteArray1688[i_12_ + 2])) << -984608536), (Class84_Sub1.method604((long) aByteArray1688[i_12_] << -1032884616, Class310.method3236((long) (aByteArray1688[i_12_ - -1]), 255L) << 952547632)))), Class310.method3236(255L << -238671072, ((long) (aByteArray1688[3 + i_12_]) << -319576992)))), Class310.method3236((long) aByteArray1688[i_12_ + 4], 255L) << -308513832)))))), Class310.method3236(255L, (long) aByteArray1688[i_12_ + 7])));
            i_11_++;
            i_12_ += 8;
        }
        anInt1683++;
        for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -9; i_13_++)
            aLongArray1676[i_13_] = Class84_Sub1.method604(aLongArray1681[i_13_], (aLongArray1677[i_13_] = aLongArray1686[i_13_]));
        for (int i_14_ = 1; (i_14_ ^ 0xffffffff) >= -11; i_14_++) {
            for (int i_15_ = 0; i_15_ < 8; i_15_++) {
                aLongArray1689[i_15_] = 0L;
                int i_16_ = 0;
                int i_17_ = 56;
                while (i_16_ < 8) {
                    aLongArray1689[i_15_] = (Class84_Sub1.method604(aLongArray1689[i_15_], (Node_Sub14_Sub12.aLongArrayArray9267[i_16_][(Class112.method794((int) ((aLongArray1677[Class112.method794(7, i_15_ + -i_16_)]) >>> i_17_), 255))])));
                    i_16_++;
                    i_17_ -= 8;
                }
            }
            for (int i_18_ = 0; i_18_ < 8; i_18_++)
                aLongArray1677[i_18_] = aLongArray1689[i_18_];
            aLongArray1677[0] = Class84_Sub1.method604(aLongArray1677[0], (Node_Sub14_Sub12.aLongArray9276[i_14_]));
            for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -9; i_19_++) {
                aLongArray1689[i_19_] = aLongArray1677[i_19_];
                int i_20_ = 0;
                int i_21_ = 56;
                while ((i_20_ ^ 0xffffffff) > -9) {
                    aLongArray1689[i_19_] = (Class84_Sub1.method604(aLongArray1689[i_19_], (Node_Sub14_Sub12.aLongArrayArray9267[i_20_][(Class112.method794(255, (int) ((aLongArray1676[Class112.method794(7, i_19_ - i_20_)]) >>> i_21_)))])));
                    i_20_++;
                    i_21_ -= 8;
                }
            }
            for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -9; i_22_++)
                aLongArray1676[i_22_] = aLongArray1689[i_22_];
        }
        for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -9; i_23_++)
            aLongArray1686[i_23_] = Class84_Sub1.method604(aLongArray1686[i_23_], Class84_Sub1.method604((aLongArray1676[i_23_]), (aLongArray1681[i_23_])));
    }

    static final boolean method1296(int i, int i_24_, int i_25_) {
        anInt1687++;
        if (i_24_ != -1)
            method1296(29, 31, -14);
        if ((i & 0x10 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final void method1297(int i) {
        anInt1690++;
        int i_26_ = 0;
        if (i < -18) {
            for (/**/; i_26_ < 32; i_26_++)
                aByteArray1684[i_26_] = (byte) 0;
            aByteArray1688[0] = (byte) 0;
            anInt1685 = anInt1682 = 0;
            for (int i_27_ = 0; i_27_ < 8; i_27_++)
                aLongArray1686[i_27_] = 0L;
        }
    }

    public Class143() {
        aLongArray1676 = new long[8];
        anInt1682 = 0;
        aByteArray1684 = new byte[32];
        aLongArray1686 = new long[8];
        aByteArray1688 = new byte[64];
        aLongArray1681 = new long[8];
        anInt1685 = 0;
        aLongArray1689 = new long[8];
    }
}
