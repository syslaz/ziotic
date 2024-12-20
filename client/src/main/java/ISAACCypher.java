/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ISAACCypher {
    static int anInt2191;
    private int anInt2192;
    static Class113 aClass113_2193;
    private int anInt2194;
    static int anInt2195;
    private int anInt2196;
    private int[] anIntArray2197;
    static int anInt2198;
    static float aFloat2199;
    private int anInt2200;
    static int anInt2201;
    static int anInt2202;
    private int[] anIntArray2203;

    final int nextInt(byte i) {
        if (i > -117)
            return 19;
        anInt2195++;
        if ((anInt2200 ^ 0xffffffff) == -1) {
            method1643(12423);
            anInt2200 = 256;
        }
        return launch.rs ? anIntArray2197[--anInt2200] : 0;
    }

    final int peekInt(byte i) {
        anInt2201++;
        if ((anInt2200 ^ 0xffffffff) == -1) {
            method1643(12423);
            anInt2200 = 256;
        }
        int i_0_ = 111 % ((55 - i) / 39);
        return launch.rs ? anIntArray2197[anInt2200 - 1] : 0;
    }

    private final void method1643(int i) {
        anInt2191++;
        anInt2192 += ++anInt2196;
        if (i != 12423)
            anInt2196 = 112;
        for (int i_1_ = 0; i_1_ < 256; i_1_++) {
            int i_2_ = anIntArray2203[i_1_];
            if ((0x2 & i_1_ ^ 0xffffffff) != -1) {
                if ((0x1 & i_1_) != 0)
                    anInt2194 ^= anInt2194 >>> 1535673744;
                else
                    anInt2194 ^= anInt2194 << 276349538;
            } else if ((i_1_ & 0x1) == 0)
                anInt2194 ^= anInt2194 << 923557517;
            else
                anInt2194 ^= anInt2194 >>> -1268996954;
            anInt2194 += anIntArray2203[128 + i_1_ & 0xff];
            int i_3_;
            anIntArray2203[i_1_] = i_3_ = (anIntArray2203[Class112.method794(i_2_, 1020) >> 539206178] - -anInt2194 + anInt2192);
            anIntArray2197[i_1_] = anInt2192 = i_2_ + anIntArray2203[(Class112.method794(i_3_, 261152) >> 823089160 >> -124849342)];
        }
    }

    static final String method1644(Node_Sub8_Sub5 class248_sub8_sub5, boolean bool) {
        if (bool != true)
            aClass113_2193 = null;
        anInt2202++;
        return (((Node_Sub8_Sub5) class248_sub8_sub5).aString8934 + " <col=ffffff>>");
    }

    public static void method1645(int i) {
        if (i != -22833)
            aFloat2199 = 1.5757205F;
        aClass113_2193 = null;
    }

    private final void method1646(byte i) {
        anInt2198++;
        int i_4_ = -90 / ((16 - i) / 55);
        int i_6_;
        int i_7_;
        int i_8_;
        int i_9_;
        int i_10_;
        int i_11_;
        int i_12_;
        int i_5_ = i_6_ = i_7_ = i_8_ = i_9_ = i_10_ = i_11_ = i_12_ = -1640531527;
        for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -5; i_13_++) {
            i_5_ ^= i_6_ << -1023121109;
            i_6_ += i_7_;
            i_8_ += i_5_;
            i_6_ ^= i_7_ >>> -81513150;
            i_9_ += i_6_;
            i_7_ += i_8_;
            i_7_ ^= i_8_ << -1193091736;
            i_10_ += i_7_;
            i_8_ += i_9_;
            i_8_ ^= i_9_ >>> 1011458160;
            i_9_ += i_10_;
            i_11_ += i_8_;
            i_9_ ^= i_10_ << 962287530;
            i_10_ += i_11_;
            i_12_ += i_9_;
            i_10_ ^= i_11_ >>> -1076562204;
            i_5_ += i_10_;
            i_11_ += i_12_;
            i_11_ ^= i_12_ << -1627259864;
            i_6_ += i_11_;
            i_12_ += i_5_;
            i_12_ ^= i_5_ >>> 226240041;
            i_7_ += i_12_;
            i_5_ += i_6_;
        }
        for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -257; i_14_ += 8) {
            i_9_ += anIntArray2197[i_14_ + 4];
            i_8_ += anIntArray2197[i_14_ + 3];
            i_7_ += anIntArray2197[2 + i_14_];
            i_11_ += anIntArray2197[6 + i_14_];
            i_12_ += anIntArray2197[i_14_ - -7];
            i_5_ += anIntArray2197[i_14_];
            i_6_ += anIntArray2197[1 + i_14_];
            i_10_ += anIntArray2197[i_14_ - -5];
            i_5_ ^= i_6_ << 296134443;
            i_8_ += i_5_;
            i_6_ += i_7_;
            i_6_ ^= i_7_ >>> 1491952034;
            i_9_ += i_6_;
            i_7_ += i_8_;
            i_7_ ^= i_8_ << 1586550664;
            i_8_ += i_9_;
            i_10_ += i_7_;
            i_8_ ^= i_9_ >>> -261086608;
            i_9_ += i_10_;
            i_11_ += i_8_;
            i_9_ ^= i_10_ << 1665259626;
            i_12_ += i_9_;
            i_10_ += i_11_;
            i_10_ ^= i_11_ >>> 808669828;
            i_11_ += i_12_;
            i_5_ += i_10_;
            i_11_ ^= i_12_ << 712271816;
            i_12_ += i_5_;
            i_6_ += i_11_;
            i_12_ ^= i_5_ >>> -1044384791;
            i_7_ += i_12_;
            i_5_ += i_6_;
            anIntArray2203[i_14_] = i_5_;
            anIntArray2203[i_14_ - -1] = i_6_;
            anIntArray2203[2 + i_14_] = i_7_;
            anIntArray2203[3 + i_14_] = i_8_;
            anIntArray2203[i_14_ + 4] = i_9_;
            anIntArray2203[i_14_ + 5] = i_10_;
            anIntArray2203[i_14_ + 6] = i_11_;
            anIntArray2203[7 + i_14_] = i_12_;
        }
        for (int i_15_ = 0; i_15_ < 256; i_15_ += 8) {
            i_8_ += anIntArray2203[i_15_ - -3];
            i_9_ += anIntArray2203[4 + i_15_];
            i_11_ += anIntArray2203[i_15_ + 6];
            i_5_ += anIntArray2203[i_15_];
            i_10_ += anIntArray2203[i_15_ - -5];
            i_7_ += anIntArray2203[i_15_ - -2];
            i_6_ += anIntArray2203[i_15_ - -1];
            i_12_ += anIntArray2203[7 + i_15_];
            i_5_ ^= i_6_ << 1168782283;
            i_6_ += i_7_;
            i_8_ += i_5_;
            i_6_ ^= i_7_ >>> 1618203554;
            i_9_ += i_6_;
            i_7_ += i_8_;
            i_7_ ^= i_8_ << 500426856;
            i_10_ += i_7_;
            i_8_ += i_9_;
            i_8_ ^= i_9_ >>> 949009328;
            i_11_ += i_8_;
            i_9_ += i_10_;
            i_9_ ^= i_10_ << 1997459082;
            i_12_ += i_9_;
            i_10_ += i_11_;
            i_10_ ^= i_11_ >>> -330016604;
            i_11_ += i_12_;
            i_5_ += i_10_;
            i_11_ ^= i_12_ << -364674168;
            i_12_ += i_5_;
            i_6_ += i_11_;
            i_12_ ^= i_5_ >>> 1064366697;
            i_5_ += i_6_;
            i_7_ += i_12_;
            anIntArray2203[i_15_] = i_5_;
            anIntArray2203[1 + i_15_] = i_6_;
            anIntArray2203[i_15_ + 2] = i_7_;
            anIntArray2203[3 + i_15_] = i_8_;
            anIntArray2203[4 + i_15_] = i_9_;
            anIntArray2203[i_15_ + 5] = i_10_;
            anIntArray2203[6 + i_15_] = i_11_;
            anIntArray2203[i_15_ - -7] = i_12_;
        }
        method1643(12423);
        anInt2200 = 256;
    }

    private ISAACCypher() {
        /* empty */
    }

    ISAACCypher(int[] is) {
        anIntArray2203 = new int[256];
        anIntArray2197 = new int[256];
        for (int i = 0; is.length > i; i++)
            anIntArray2197[i] = is[i];
        method1646((byte) 98);
    }
}
