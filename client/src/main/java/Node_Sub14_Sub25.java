/* Class248_Sub14_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub25 extends Node_Sub14 {
    static int anInt9414;
    private boolean aBoolean9415 = true;
    private static short[][] aShortArrayArray9416 = {new short[0], new short[0], new short[0], new short[0], new short[0]};
    static int[] anIntArray9417;
    static int anInt9418;
    static short[][][] aShortArrayArrayArray9419;
    static int anInt9420;
    static int anInt9421;
    static int anInt9422;
    private static short[][] aShortArrayArray9423 = {new short[0], new short[0], new short[0], new short[0], new short[0]};
    static int anInt9424 = 0;
    static int anInt9425;
    private static short[][] aShortArrayArray9426 = {{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}};
    static int anInt9427;
    private boolean aBoolean9428 = true;

    final int[] method2264(byte i, int i_0_) {
        anInt9421++;
        if (i != -40)
            method2349((byte) -75);
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_0_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_1_ = this.method2265((byte) 64, (aBoolean9415 ? -i_0_ + za_Sub1.anInt9802 : i_0_), 0);
            if (aBoolean9428) {
                for (int i_2_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++)
                    is[i_2_] = is_1_[-i_2_ + Class226_Sub2.anInt6664];
            } else
                Class159.method1398(is_1_, 0, is, 0, Class185.anInt2164);
        }
        return is;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_3_) {
        int i_4_ = i_3_;
        while_175_:
        do {
            do {
                if (i_4_ != 0) {
                    if ((i_4_ ^ 0xffffffff) != -2) {
                        if ((i_4_ ^ 0xffffffff) == -3)
                            break;
                        break while_175_;
                    }
                } else {
                    aBoolean9428 = (class248_sub9.readUnsignedByte((byte) 111) ^ 0xffffffff) == -2;
                    break while_175_;
                }
                aBoolean9415 = (class248_sub9.readUnsignedByte((byte) 92) ^ 0xffffffff) == -2;
                break while_175_;
            } while (false);
            ((Node_Sub14) this).aBoolean6988 = (class248_sub9.readUnsignedByte((byte) -106) ^ 0xffffffff) == -2;
        } while (false);
        if (i != -61)
            aShortArrayArray9426 = null;
        anInt9425++;
    }

    public Node_Sub14_Sub25() {
        super(1, false);
    }

    public static void method2349(byte i) {
        anIntArray9417 = null;
        if (i >= -93)
            aShortArrayArray9416 = null;
        aShortArrayArray9423 = null;
        aShortArrayArray9416 = null;
        aShortArrayArrayArray9419 = null;
        aShortArrayArray9426 = null;
    }

    final int[][] method2271(int i, boolean bool) {
        if (bool != true)
            return null;
        anInt9420++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[][] is_5_ = this.method2267(!aBoolean9415 ? i : -i + za_Sub1.anInt9802, 0, 65535);
            int[] is_6_ = is_5_[0];
            int[] is_7_ = is_5_[1];
            int[] is_8_ = is_5_[2];
            int[] is_9_ = is[0];
            int[] is_10_ = is[1];
            int[] is_11_ = is[2];
            if (!aBoolean9428) {
                for (int i_12_ = 0; i_12_ < Class185.anInt2164; i_12_++) {
                    is_9_[i_12_] = is_6_[i_12_];
                    is_10_[i_12_] = is_7_[i_12_];
                    is_11_[i_12_] = is_8_[i_12_];
                }
            } else {
                for (int i_13_ = 0; i_13_ < Class185.anInt2164; i_13_++) {
                    is_9_[i_13_] = is_6_[-i_13_ + Class226_Sub2.anInt6664];
                    is_10_[i_13_] = is_7_[-i_13_ + Class226_Sub2.anInt6664];
                    is_11_[i_13_] = is_8_[-i_13_ + Class226_Sub2.anInt6664];
                }
            }
        }
        return is;
    }

    static {
        aShortArrayArrayArray9419 = new short[][][]{aShortArrayArray9426, aShortArrayArray9416, aShortArrayArray9423};
    }
}
