/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class369 {
    private static float aFloat4536;
    private int[][][] anIntArrayArrayArray4537 = new int[2][2][4];
    int[] anIntArray4538;
    private int[] anIntArray4539 = new int[2];
    static int[][] anIntArrayArray4540;
    private int[][][] anIntArrayArrayArray4541 = new int[2][2][4];
    private static float[][] aFloatArrayArray4542 = new float[2][8];
    static int anInt4543;

    private static final float method3846(float f) {
        float f_0_ = 32.703197F * (float) Math.pow(2.0, (double) f);
        return f_0_ * 3.1415927F / 11025.0F;
    }

    private final float method3847(int i, int i_1_, float f) {
        float f_2_ = ((float) anIntArrayArrayArray4537[i][0][i_1_] + f * (float) (anIntArrayArrayArray4537[i][1][i_1_] - anIntArrayArrayArray4537[i][0][i_1_]));
        f_2_ *= 1.2207031E-4F;
        return method3846(f_2_);
    }

    final int method3848(int i, float f) {
        if (i == 0) {
            float f_3_ = ((float) anIntArray4539[0] + (float) (anIntArray4539[1] - anIntArray4539[0]) * f);
            f_3_ *= 0.0030517578F;
            aFloat4536 = (float) Math.pow(0.1, (double) (f_3_ / 20.0F));
            anInt4543 = (int) (aFloat4536 * 65536.0F);
        }
        if (((Class369) this).anIntArray4538[i] == 0)
            return 0;
        float f_4_ = method3851(i, 0, f);
        aFloatArrayArray4542[i][0] = -2.0F * f_4_ * (float) Math.cos((double) method3847(i, 0, f));
        aFloatArrayArray4542[i][1] = f_4_ * f_4_;
        for (int i_5_ = 1; i_5_ < ((Class369) this).anIntArray4538[i]; i_5_++) {
            f_4_ = method3851(i, i_5_, f);
            float f_6_ = (-2.0F * f_4_ * (float) Math.cos((double) method3847(i, i_5_, f)));
            float f_7_ = f_4_ * f_4_;
            aFloatArrayArray4542[i][i_5_ * 2 + 1] = aFloatArrayArray4542[i][i_5_ * 2 - 1] * f_7_;
            aFloatArrayArray4542[i][i_5_ * 2] = (aFloatArrayArray4542[i][i_5_ * 2 - 1] * f_6_ + aFloatArrayArray4542[i][i_5_ * 2 - 2] * f_7_);
            for (int i_8_ = i_5_ * 2 - 1; i_8_ >= 2; i_8_--)
                aFloatArrayArray4542[i][i_8_] += (aFloatArrayArray4542[i][i_8_ - 1] * f_6_ + aFloatArrayArray4542[i][i_8_ - 2] * f_7_);
            aFloatArrayArray4542[i][1] += aFloatArrayArray4542[i][0] * f_6_ + f_7_;
            aFloatArrayArray4542[i][0] += f_6_;
        }
        if (i == 0) {
            for (int i_9_ = 0; i_9_ < ((Class369) this).anIntArray4538[0] * 2; i_9_++)
                aFloatArrayArray4542[0][i_9_] *= aFloat4536;
        }
        for (int i_10_ = 0; i_10_ < ((Class369) this).anIntArray4538[i] * 2; i_10_++)
            anIntArrayArray4540[i][i_10_] = (int) (aFloatArrayArray4542[i][i_10_] * 65536.0F);
        return ((Class369) this).anIntArray4538[i] * 2;
    }

    public static void method3849() {
        aFloatArrayArray4542 = null;
        anIntArrayArray4540 = null;
    }

    final void method3850(ByteStream class248_sub9, Class277 class277) {
        int i = class248_sub9.readUnsignedByte((byte) -44);
        ((Class369) this).anIntArray4538[0] = i >> 4;
        ((Class369) this).anIntArray4538[1] = i & 0xf;
        if (i != 0) {
            anIntArray4539[0] = class248_sub9.readShort(-1);
            anIntArray4539[1] = class248_sub9.readShort(-1);
            int i_11_ = class248_sub9.readUnsignedByte((byte) -61);
            for (int i_12_ = 0; i_12_ < 2; i_12_++) {
                for (int i_13_ = 0; i_13_ < ((Class369) this).anIntArray4538[i_12_]; i_13_++) {
                    anIntArrayArrayArray4537[i_12_][0][i_13_] = class248_sub9.readShort(-1);
                    anIntArrayArrayArray4541[i_12_][0][i_13_] = class248_sub9.readShort(-1);
                }
            }
            for (int i_14_ = 0; i_14_ < 2; i_14_++) {
                for (int i_15_ = 0; i_15_ < ((Class369) this).anIntArray4538[i_14_]; i_15_++) {
                    if ((i_11_ & 1 << i_14_ * 4 << i_15_) != 0) {
                        anIntArrayArrayArray4537[i_14_][1][i_15_] = class248_sub9.readShort(-1);
                        anIntArrayArrayArray4541[i_14_][1][i_15_] = class248_sub9.readShort(-1);
                    } else {
                        anIntArrayArrayArray4537[i_14_][1][i_15_] = anIntArrayArrayArray4537[i_14_][0][i_15_];
                        anIntArrayArrayArray4541[i_14_][1][i_15_] = anIntArrayArrayArray4541[i_14_][0][i_15_];
                    }
                }
            }
            if (i_11_ != 0 || anIntArray4539[1] != anIntArray4539[0])
                class277.method2857(class248_sub9);
        } else
            anIntArray4539[0] = anIntArray4539[1] = 0;
    }

    public Class369() {
        ((Class369) this).anIntArray4538 = new int[2];
    }

    private final float method3851(int i, int i_16_, float f) {
        float f_17_ = ((float) anIntArrayArrayArray4541[i][0][i_16_] + f * (float) (anIntArrayArrayArray4541[i][1][i_16_] - anIntArrayArrayArray4541[i][0][i_16_]));
        f_17_ *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0, (double) (-f_17_ / 20.0F));
    }

    static {
        anIntArrayArray4540 = new int[2][8];
    }
}
