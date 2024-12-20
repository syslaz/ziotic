/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class319 {
    static int anInt3683;
    private boolean[] aBooleanArray3684;
    private int anInt3685;
    private int[][] anIntArrayArray3686;
    static int anInt3687;
    static int anInt3688;
    static int anInt3689;
    private Class381 aClass381_3690;

    final int[] method3315(int i, byte i_0_) {
        anInt3688++;
        if (i < 0 || anIntArrayArray3686.length <= i) {
            if ((anInt3685 ^ 0xffffffff) != 0)
                return new int[]{anInt3685};
            return new int[0];
        }
        if (!aBooleanArray3684[i] || (anIntArrayArray3686[i].length ^ 0xffffffff) >= -2)
            return anIntArrayArray3686[i];
        int i_1_ = anInt3685 != -1 ? 1 : 0;
        Random random = new Random();
        int i_2_ = -84 / ((31 - i_0_) / 58);
        int[] is = new int[anIntArrayArray3686[i].length];
        Class159.method1398(anIntArrayArray3686[i], 0, is, 0, is.length);
        for (int i_3_ = i_1_; i_3_ < is.length; i_3_++) {
            int i_4_ = (RSInterface.method2016(-i_1_ + is.length, -1, random) - -i_1_);
            int i_5_ = is[i_3_];
            is[i_3_] = is[i_4_];
            is[i_4_] = i_5_;
        }
        return is;
    }

    final boolean method3316(byte i) {
        if (i <= 57)
            method3317(102, -102);
        anInt3687++;
        if ((anInt3685 ^ 0xffffffff) == 0)
            return false;
        return true;
    }

    final Class195 method3317(int i, int i_6_) {
        anInt3683++;
        if (i > -106)
            method3317(-27, -110);
        byte[] is = aClass381_3690.method3922((byte) 114, 1, i_6_);
        Class195 class195 = new Class195();
        class195.method1666((byte) -29, new ByteStream(is));
        return class195;
    }

    static final int method3318(int i, char c, String string) {
        anInt3689++;
        int i_7_ = 0;
        int i_8_ = string.length();
        int i_9_ = 0;
        if (i <= 6)
            return 51;
        for (/**/; (i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_9_++) {
            if ((string.charAt(i_9_) ^ 0xffffffff) == (c ^ 0xffffffff))
                i_7_++;
        }
        return i_7_;
    }

    Class319(Class215 class215, int i, Class381 class381) {
        aClass381_3690 = class381;
        aClass381_3690.method3899(1, 0);
        ByteStream class248_sub9 = new ByteStream(aClass381_3690.method3922((byte) 117, 0, 0));
        int i_10_ = class248_sub9.readUnsignedByte((byte) 70);
        if (i_10_ > 3) {
            anIntArrayArray3686 = new int[0][];
            aBooleanArray3684 = new boolean[0];
            anInt3685 = -1;
        } else {
            int i_11_ = class248_sub9.readUnsignedByte((byte) 98);
            Class208[] class208s = Player.method3652(false);
            boolean bool = true;
            if ((class208s.length ^ 0xffffffff) == (i_11_ ^ 0xffffffff)) {
                for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (class208s.length ^ 0xffffffff); i_12_++) {
                    int i_13_ = class248_sub9.readUnsignedByte((byte) -48);
                    if (((Class208) class208s[i_12_]).anInt2402 != i_13_) {
                        bool = false;
                        break;
                    }
                }
            } else
                bool = false;
            if (bool) {
                int i_14_ = class248_sub9.readUnsignedByte((byte) -53);
                int i_15_ = class248_sub9.readUnsignedByte((byte) 79);
                if ((i_10_ ^ 0xffffffff) >= -3)
                    anInt3685 = -1;
                else
                    anInt3685 = class248_sub9.readUnsignedShort((byte) -10);
                anIntArrayArray3686 = new int[1 + i_15_][];
                aBooleanArray3684 = new boolean[i_15_ - -1];
                for (int i_16_ = 0; (i_14_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
                    int i_17_ = class248_sub9.readUnsignedByte((byte) 123);
                    aBooleanArray3684[i_17_] = class248_sub9.readUnsignedByte((byte) -30) == 1;
                    int i_18_ = class248_sub9.readShort(-1);
                    if (anInt3685 != -1) {
                        anIntArrayArray3686[i_17_] = new int[1 + i_18_];
                        anIntArrayArray3686[i_17_][0] = anInt3685;
                        for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
                            anIntArrayArray3686[i_17_][i_19_ - -1] = class248_sub9.readShort(-1);
                    } else {
                        anIntArrayArray3686[i_17_] = new int[i_18_];
                        for (int i_20_ = 0; (i_18_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++)
                            anIntArrayArray3686[i_17_][i_20_] = class248_sub9.readShort(-1);
                    }
                }
                for (int i_21_ = 0; i_15_ - -1 > i_21_; i_21_++) {
                    if (anIntArrayArray3686[i_21_] == null) {
                        if ((anInt3685 ^ 0xffffffff) != 0)
                            anIntArrayArray3686[i_21_] = new int[]{anInt3685};
                        else
                            anIntArrayArray3686[i_21_] = new int[0];
                    }
                }
            } else {
                aBooleanArray3684 = new boolean[0];
                anInt3685 = -1;
                anIntArrayArray3686 = new int[0][];
            }
        }
    }
}
