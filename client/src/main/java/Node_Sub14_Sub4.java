/* Class248_Sub14_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub4 extends Node_Sub14 {
    private int anInt9187 = 3216;
    static int[][] anIntArrayArray9188;
    static int anInt9189;
    static int[] anIntArray9190 = new int[1];
    private int anInt9191 = 4096;
    static int anInt9192;
    static int anInt9193;
    static boolean aBoolean9194;
    static Class381 aClass381_9195;
    static int anInt9196;
    private int anInt9197 = 3216;
    private int[] anIntArray9198 = new int[3];

    private final void method2285(byte i) {
        anInt9192++;
        double d = Math.cos((double) ((float) anInt9187 / 4096.0F));
        anIntArray9198[0] = (int) (4096.0 * (Math.sin((double) ((float) anInt9197 / 4096.0F)) * d));
        anIntArray9198[1] = (int) (Math.cos((double) ((float) anInt9197 / 4096.0F)) * d * 4096.0);
        if (i == 88) {
            anIntArray9198[2] = (int) (4096.0 * Math.sin((double) ((float) anInt9187 / 4096.0F)));
            int i_0_ = anIntArray9198[0] * anIntArray9198[0] >> 194789004;
            int i_1_ = anIntArray9198[1] * anIntArray9198[1] >> 633361996;
            int i_2_ = anIntArray9198[2] * anIntArray9198[2] >> 2066540;
            int i_3_ = (int) (4096.0 * Math.sqrt((double) (i_2_ + (i_0_ + i_1_) >> -676273972)));
            if ((i_3_ ^ 0xffffffff) != -1) {
                anIntArray9198[2] = (anIntArray9198[2] << 1720362572) / i_3_;
                anIntArray9198[1] = (anIntArray9198[1] << -1155775668) / i_3_;
                anIntArray9198[0] = (anIntArray9198[0] << -1766690132) / i_3_;
            }
        }
    }

    final int[] method2264(byte i, int i_4_) {
        anInt9193++;
        if (i != -40)
            anIntArray9190 = null;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_4_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_5_ = anInt9191 * Class334.anInt3906 >> -1834962100;
            int[] is_6_ = this.method2265((byte) 64, za_Sub1.anInt9802 & i_4_ + -1, 0);
            int[] is_7_ = this.method2265((byte) 64, i_4_, 0);
            int[] is_8_ = this.method2265((byte) 64, i_4_ - -1 & za_Sub1.anInt9802, 0);
            for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_9_++) {
                int i_10_ = (is_8_[i_9_] + -is_6_[i_9_]) * i_5_ >> 751943340;
                int i_11_ = (i_5_ * (is_7_[-1 + i_9_ & Class226_Sub2.anInt6664] + -is_7_[Class226_Sub2.anInt6664 & 1 + i_9_]) >> -993182068);
                int i_12_ = i_11_ >> 2012854404;
                int i_13_ = i_10_ >> -147747484;
                if ((i_12_ ^ 0xffffffff) > -1)
                    i_12_ = -i_12_;
                if (i_13_ < 0)
                    i_13_ = -i_13_;
                if (i_12_ > 255)
                    i_12_ = 255;
                if ((i_13_ ^ 0xffffffff) < -256)
                    i_13_ = 255;
                int i_14_ = ((Node_Sub14_Sub1.aByteArray9158[i_12_ - -((i_13_ + 1) * i_13_ >> -1835717983)]) & 0xff);
                int i_15_ = i_11_ * i_14_ >> 1793007656;
                int i_16_ = i_14_ * i_10_ >> 884014312;
                int i_17_ = 4096 * i_14_ >> -694781208;
                i_16_ = i_16_ * anIntArray9198[1] >> 860933868;
                i_15_ = anIntArray9198[0] * i_15_ >> 493847724;
                i_17_ = i_17_ * anIntArray9198[2] >> 1412712524;
                is[i_9_] = i_17_ + (i_15_ - -i_16_);
            }
        }
        return is;
    }

    static final void method2286() {
        Class352.aClass27_4187 = Class352.aClass27_4186;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_18_) {
        int i_19_ = i_18_;
        while_8_:
        do {
            do {
                if ((i_19_ ^ 0xffffffff) != -1) {
                    if ((i_19_ ^ 0xffffffff) != -2) {
                        if ((i_19_ ^ 0xffffffff) == -3)
                            break;
                        break while_8_;
                    }
                } else {
                    anInt9191 = class248_sub9.readShort(-1);
                    break while_8_;
                }
                anInt9197 = class248_sub9.readShort(-1);
                break while_8_;
            } while (false);
            anInt9187 = class248_sub9.readShort(i ^ 0x3c);
        } while (false);
        if (i != -61)
            anIntArrayArray9188 = null;
        anInt9189++;
    }

    public static void method2287(int i) {
        aClass381_9195 = null;
        anIntArray9190 = null;
        if (i != 5)
            aBoolean9194 = true;
        anIntArrayArray9188 = null;
    }

    final void method2263(int i) {
        anInt9196++;
        method2285((byte) 88);
        if (i != 8351)
            anInt9187 = -64;
    }

    public Node_Sub14_Sub4() {
        super(1, true);
    }

    static {
        anIntArrayArray9188 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
        aBoolean9194 = false;
    }
}
