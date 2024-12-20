/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class294 {
    private int[] anIntArray3446;
    private float[][] aFloatArrayArray3447;
    private int[] anIntArray3448;
    int anInt3449;
    private int anInt3450;
    private int[] anIntArray3451;

    final int method3123() {
        int i;
        for (i = 0; anIntArray3451[i] >= 0; i = (Node_Sub34.method2574() != 0 ? anIntArray3451[i] : i + 1)) {
            /* empty */
        }
        return anIntArray3451[i] ^ 0xffffffff;
    }

    final float[] method3124() {
        return aFloatArrayArray3447[method3123()];
    }

    private final void method3125() {
        int[] is = new int[anInt3450];
        int[] is_0_ = new int[33];
        for (int i = 0; i < anInt3450; i++) {
            int i_1_ = anIntArray3448[i];
            if (i_1_ != 0) {
                int i_2_ = 1 << 32 - i_1_;
                int i_3_ = is_0_[i_1_];
                is[i] = i_3_;
                int i_4_;
                if ((i_3_ & i_2_) != 0)
                    i_4_ = is_0_[i_1_ - 1];
                else {
                    i_4_ = i_3_ | i_2_;
                    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
                        int i_6_ = is_0_[i_5_];
                        if (i_6_ != i_3_)
                            break;
                        int i_7_ = 1 << 32 - i_5_;
                        if ((i_6_ & i_7_) != 0) {
                            is_0_[i_5_] = is_0_[i_5_ - 1];
                            break;
                        }
                        is_0_[i_5_] = i_6_ | i_7_;
                    }
                }
                is_0_[i_1_] = i_4_;
                for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
                    int i_9_ = is_0_[i_8_];
                    if (i_9_ == i_3_)
                        is_0_[i_8_] = i_4_;
                }
            }
        }
        anIntArray3451 = new int[8];
        int i = 0;
        for (int i_10_ = 0; i_10_ < anInt3450; i_10_++) {
            int i_11_ = anIntArray3448[i_10_];
            if (i_11_ != 0) {
                int i_12_ = is[i_10_];
                int i_13_ = 0;
                for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
                    int i_15_ = -2147483648 >>> i_14_;
                    if ((i_12_ & i_15_) != 0) {
                        if (anIntArray3451[i_13_] == 0)
                            anIntArray3451[i_13_] = i;
                        i_13_ = anIntArray3451[i_13_];
                    } else
                        i_13_++;
                    if (i_13_ >= anIntArray3451.length) {
                        int[] is_16_ = new int[anIntArray3451.length * 2];
                        for (int i_17_ = 0; i_17_ < anIntArray3451.length; i_17_++)
                            is_16_[i_17_] = anIntArray3451[i_17_];
                        anIntArray3451 = is_16_;
                    }
                    i_15_ >>>= 1;
                }
                anIntArray3451[i_13_] = i_10_ ^ 0xffffffff;
                if (i_13_ >= i)
                    i = i_13_ + 1;
            }
        }
    }

    private static final int method3126(int i, int i_18_) {
        int i_19_;
        for (i_19_ = (int) Math.pow((double) i, 1.0 / (double) i_18_) + 1; Class149.method1332(i_19_, i_18_, (byte) -82) > i; i_19_--) {
            /* empty */
        }
        return i_19_;
    }

    Class294() {
        Node_Sub34.method2573(24);
        ((Class294) this).anInt3449 = Node_Sub34.method2573(16);
        anInt3450 = Node_Sub34.method2573(24);
        anIntArray3448 = new int[anInt3450];
        boolean bool = Node_Sub34.method2574() != 0;
        if (bool) {
            int i = 0;
            int i_20_ = Node_Sub34.method2573(5) + 1;
            while (i < anInt3450) {
                int i_21_ = Node_Sub34.method2573(Class241.method1930(86, anInt3450 - i));
                for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
                    anIntArray3448[i++] = i_20_;
                i_20_++;
            }
        } else {
            boolean bool_23_ = Node_Sub34.method2574() != 0;
            for (int i = 0; i < anInt3450; i++) {
                if (bool_23_ && Node_Sub34.method2574() == 0)
                    anIntArray3448[i] = 0;
                else
                    anIntArray3448[i] = Node_Sub34.method2573(5) + 1;
            }
        }
        method3125();
        int i = Node_Sub34.method2573(4);
        if (i > 0) {
            float f = Node_Sub34.method2572(Node_Sub34.method2573(32));
            float f_24_ = Node_Sub34.method2572(Node_Sub34.method2573(32));
            int i_25_ = Node_Sub34.method2573(4) + 1;
            boolean bool_26_ = Node_Sub34.method2574() != 0;
            int i_27_;
            if (i == 1)
                i_27_ = method3126(anInt3450, ((Class294) this).anInt3449);
            else
                i_27_ = anInt3450 * ((Class294) this).anInt3449;
            anIntArray3446 = new int[i_27_];
            for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
                anIntArray3446[i_28_] = Node_Sub34.method2573(i_25_);
            aFloatArrayArray3447 = new float[anInt3450][((Class294) this).anInt3449];
            if (i == 1) {
                for (int i_29_ = 0; i_29_ < anInt3450; i_29_++) {
                    float f_30_ = 0.0F;
                    int i_31_ = 1;
                    for (int i_32_ = 0; i_32_ < ((Class294) this).anInt3449; i_32_++) {
                        int i_33_ = i_29_ / i_31_ % i_27_;
                        float f_34_ = ((float) anIntArray3446[i_33_] * f_24_ + f + f_30_);
                        aFloatArrayArray3447[i_29_][i_32_] = f_34_;
                        if (bool_26_)
                            f_30_ = f_34_;
                        i_31_ *= i_27_;
                    }
                }
            } else {
                for (int i_35_ = 0; i_35_ < anInt3450; i_35_++) {
                    float f_36_ = 0.0F;
                    int i_37_ = i_35_ * ((Class294) this).anInt3449;
                    for (int i_38_ = 0; i_38_ < ((Class294) this).anInt3449; i_38_++) {
                        float f_39_ = ((float) anIntArray3446[i_37_] * f_24_ + f + f_36_);
                        aFloatArrayArray3447[i_35_][i_38_] = f_39_;
                        if (bool_26_)
                            f_36_ = f_39_;
                        i_37_++;
                    }
                }
            }
        }
    }
}
