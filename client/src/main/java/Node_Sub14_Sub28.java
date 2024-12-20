/* Class248_Sub14_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub28 extends Node_Sub14 {
    static int anInt9452;
    static int anInt9453;
    static int anInt9454;
    private int anInt9455 = 4096;
    static int anInt9456;
    static String aString9457;
    static int anInt9458;
    static Class293 aClass293_9459 = new Class293();
    private int anInt9460;
    private int anInt9461 = 4096;

    public Node_Sub14_Sub28() {
        super(1, false);
        anInt9460 = 4096;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9456++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[][] is_0_ = this.method2267(i, 0, 65535);
            int[] is_1_ = is_0_[0];
            int[] is_2_ = is_0_[1];
            int[] is_3_ = is_0_[2];
            int[] is_4_ = is[0];
            int[] is_5_ = is[1];
            int[] is_6_ = is[2];
            for (int i_7_ = 0; i_7_ < Class185.anInt2164; i_7_++) {
                int i_8_ = is_1_[i_7_];
                int i_9_ = is_3_[i_7_];
                int i_10_ = is_2_[i_7_];
                if (i_9_ == i_8_ && (i_9_ ^ 0xffffffff) == (i_10_ ^ 0xffffffff)) {
                    is_4_[i_7_] = i_8_ * anInt9460 >> 2031209036;
                    is_5_[i_7_] = anInt9455 * i_9_ >> -2095725108;
                    is_6_[i_7_] = i_10_ * anInt9461 >> -249892020;
                } else {
                    is_4_[i_7_] = anInt9460;
                    is_5_[i_7_] = anInt9455;
                    is_6_[i_7_] = anInt9461;
                }
            }
        }
        if (bool != true)
            method2359(-68, -51, false, 105);
        return is;
    }

    public static void method2357(int i) {
        if (i != 4096)
            aClass293_9459 = null;
        aString9457 = null;
        aClass293_9459 = null;
    }

    static final int method2358(int i, int i_11_) {
        int i_12_ = -119 % ((i - 45) / 32);
        anInt9453++;
        return 0xff & i_11_;
    }

    static final int method2359(int i, int i_13_, boolean bool, int i_14_) {
        anInt9452++;
        if ((Node_Sub14_Sub5.anInt9208 ^ 0xffffffff) > -101)
            return -2;
        int i_15_ = -2;
        int i_16_ = 2147483647;
        int i_17_ = -Class116.anInt1468 + i_14_;
        if (bool != true)
            aString9457 = null;
        int i_18_ = i + -Class116.anInt1469;
        for (Node_Sub35 class248_sub35 = (Node_Sub35) Class116.aClass293_1443.method3119(2); class248_sub35 != null; class248_sub35 = (Node_Sub35) Class116.aClass293_1443.method3107(-128)) {
            if ((i_13_ ^ 0xffffffff) == (((Node_Sub35) class248_sub35).anInt7243 ^ 0xffffffff)) {
                int i_19_ = ((Node_Sub35) class248_sub35).anInt7252;
                int i_20_ = ((Node_Sub35) class248_sub35).anInt7246;
                int i_21_ = (Class116.anInt1469 + i_20_ | Class116.anInt1468 + i_19_ << -1234833778);
                int i_22_ = ((i_17_ - i_19_) * (i_17_ + -i_19_) + (i_18_ + -i_20_) * (-i_20_ + i_18_));
                if (i_15_ < 0 || i_16_ > i_22_) {
                    i_15_ = i_21_;
                    i_16_ = i_22_;
                }
            }
        }
        return i_15_;
    }

    static final String method2360(boolean bool, byte[] is) {
        anInt9454++;
        if (bool != true)
            method2358(113, -123);
        return Class112_Sub1.method799(0, is.length, is, -63);
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_23_) {
        anInt9458++;
        int i_24_ = i_23_;
        while_187_:
        do {
            do {
                if ((i_24_ ^ 0xffffffff) != -1) {
                    if (i_24_ != 1) {
                        if ((i_24_ ^ 0xffffffff) == -3)
                            break;
                        break while_187_;
                    }
                } else {
                    anInt9460 = class248_sub9.readShort(-1);
                    break while_187_;
                }
                anInt9455 = class248_sub9.readShort(i + 60);
                break while_187_;
            } while (false);
            anInt9461 = class248_sub9.readShort(-1);
        } while (false);
        if (i != -61)
            method2271(-95, false);
    }
}
