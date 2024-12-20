/* Class248_Sub14_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub27 extends Node_Sub14 {
    static Class293 aClass293_9440 = new Class293();
    static int anInt9441;
    static int anInt9442;
    static int anInt9443;
    static int anInt9444;
    static int anInt9445;
    private int anInt9446 = 32768;
    static int anInt9447;
    static int anInt9448;
    static Class48 aClass48_9449;
    static int[] anIntArray9450 = new int[14];
    static int[][][] anIntArrayArrayArray9451;

    public Node_Sub14_Sub27() {
        super(3, false);
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9445++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[] is_0_ = this.method2265((byte) 64, i, 1);
            int[] is_1_ = this.method2265((byte) 64, i, 2);
            int[] is_2_ = is[0];
            int[] is_3_ = is[1];
            int[] is_4_ = is[2];
            for (int i_5_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
                int i_6_ = 0xff & 255 * is_0_[i_5_] >> 1997354380;
                int i_7_ = is_1_[i_5_] * anInt9446 >> -974970484;
                int i_8_ = Class21.anIntArray317[i_6_] * i_7_ >> 1418321548;
                int i_9_ = Class264.anIntArray2992[i_6_] * i_7_ >> -1700516564;
                int i_10_ = Class226_Sub2.anInt6664 & i_5_ + (i_8_ >> -1867032852);
                int i_11_ = za_Sub1.anInt9802 & i - -(i_9_ >> 1245675052);
                int[][] is_12_ = this.method2267(i_11_, 0, 65535);
                is_2_[i_5_] = is_12_[0][i_10_];
                is_3_[i_5_] = is_12_[1][i_10_];
                is_4_[i_5_] = is_12_[2][i_10_];
            }
        }
        if (bool != true)
            aClass293_9440 = null;
        return is;
    }

    final int[] method2264(byte i, int i_13_) {
        anInt9443++;
        if (i != -40)
            method2353(-88, (byte) -69);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_13_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_14_ = this.method2265((byte) 64, i_13_, 1);
            int[] is_15_ = this.method2265((byte) 64, i_13_, 2);
            for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_16_++) {
                int i_17_ = (is_14_[i_16_] & 0xff5) >> 1098458948;
                int i_18_ = anInt9446 * is_15_[i_16_] >> -1987238196;
                int i_19_ = i_18_ * Class21.anIntArray317[i_17_] >> -1629556436;
                int i_20_ = i_18_ * Class264.anIntArray2992[i_17_] >> -1285807124;
                int i_21_ = i_16_ + (i_19_ >> -2143626868) & Class226_Sub2.anInt6664;
                int i_22_ = za_Sub1.anInt9802 & (i_20_ >> 1592751852) + i_13_;
                int[] is_23_ = this.method2265((byte) 64, i_22_, 0);
                is[i_16_] = is_23_[i_21_];
            }
        }
        return is;
    }

    static final void method2353(int i, byte i_24_) {
        Class380.aClass278_4645.method2864(i, -15782);
        anInt9441++;
        if (i_24_ < 116)
            aClass48_9449 = null;
    }

    static final boolean method2354(int i, int i_25_, int i_26_) {
        anInt9442++;
        if (i != -3)
            return false;
        if (!((i_26_ & 0x800 ^ 0xffffffff) != -1 | Class253_Sub1.method2727(i_26_, false, i_25_)) && !Class79.method572(i_25_, 55, i_26_))
            return false;
        return true;
    }

    static final boolean method2355(int i, byte[] is) {
        anInt9447++;
        ByteStream class248_sub9 = new ByteStream(is);
        int i_27_ = class248_sub9.readUnsignedByte((byte) -71);
        if ((i_27_ ^ 0xffffffff) != -3)
            return false;
        if (i > -123)
            return true;
        boolean bool = class248_sub9.readUnsignedByte((byte) -105) == 1;
        if (bool)
            Class301_Sub1.method3188(-1, class248_sub9);
        Class282_Sub25.method3025(class248_sub9, -1);
        return true;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_28_) {
        if (i == -61) {
            int i_29_ = i_28_;
            do {
                if ((i_29_ ^ 0xffffffff) != -1) {
                    if ((i_29_ ^ 0xffffffff) != -2)
                        break;
                } else {
                    anInt9446 = class248_sub9.readShort(-1) << -395905116;
                    break;
                }
                ((Node_Sub14) this).aBoolean6988 = class248_sub9.readUnsignedByte((byte) 84) == 1;
            } while (false);
            anInt9444++;
        }
    }

    public static void method2356(int i) {
        anIntArrayArrayArray9451 = null;
        anIntArray9450 = null;
        aClass48_9449 = null;
        aClass293_9440 = null;
        if (i != 28045)
            anIntArray9450 = null;
    }

    final void method2263(int i) {
        s_Sub3.method3164(true);
        anInt9448++;
        if (i != 8351)
            anIntArray9450 = null;
    }
}
