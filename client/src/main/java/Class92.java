/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
    private int anInt1200;
    private int anInt1201;
    private int anInt1202 = Node_Sub34.method2573(16);
    private int anInt1203 = Node_Sub34.method2573(24);
    private int[] anIntArray1204;
    private int anInt1205;
    private int anInt1206;

    final void method684(float[] fs, int i, boolean bool) {
        for (int i_0_ = 0; i_0_ < i; i_0_++)
            fs[i_0_] = 0.0F;
        if (!bool) {
            int i_1_ = (((Class294) Node_Sub34.aClass294Array7236[anInt1201]).anInt3449);
            int i_2_ = anInt1200 - anInt1203;
            int i_3_ = i_2_ / anInt1205;
            int[] is = new int[i_3_];
            for (int i_4_ = 0; i_4_ < 8; i_4_++) {
                int i_5_ = 0;
                while (i_5_ < i_3_) {
                    if (i_4_ == 0) {
                        int i_6_ = Node_Sub34.aClass294Array7236[anInt1201].method3123();
                        for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
                            if (i_5_ + i_7_ < i_3_)
                                is[i_5_ + i_7_] = i_6_ % anInt1206;
                            i_6_ /= anInt1206;
                        }
                    }
                    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
                        int i_9_ = is[i_5_];
                        int i_10_ = anIntArray1204[i_9_ * 8 + i_4_];
                        if (i_10_ >= 0) {
                            int i_11_ = anInt1203 + i_5_ * anInt1205;
                            Class294 class294 = Node_Sub34.aClass294Array7236[i_10_];
                            if (anInt1202 == 0) {
                                int i_12_ = (anInt1205 / ((Class294) class294).anInt3449);
                                for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
                                    float[] fs_14_ = class294.method3124();
                                    for (int i_15_ = 0; (i_15_ < ((Class294) class294).anInt3449); i_15_++)
                                        fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
                                }
                            } else {
                                int i_16_ = 0;
                                while (i_16_ < anInt1205) {
                                    float[] fs_17_ = class294.method3124();
                                    for (int i_18_ = 0; (i_18_ < ((Class294) class294).anInt3449); i_18_++) {
                                        fs[i_11_ + i_16_] += fs_17_[i_18_];
                                        i_16_++;
                                    }
                                }
                            }
                        }
                        if (++i_5_ >= i_3_)
                            break;
                    }
                }
            }
        }
    }

    Class92() {
        anInt1200 = Node_Sub34.method2573(24);
        anInt1205 = Node_Sub34.method2573(24) + 1;
        anInt1206 = Node_Sub34.method2573(6) + 1;
        anInt1201 = Node_Sub34.method2573(8);
        int[] is = new int[anInt1206];
        for (int i = 0; i < anInt1206; i++) {
            int i_19_ = 0;
            int i_20_ = Node_Sub34.method2573(3);
            boolean bool = Node_Sub34.method2574() != 0;
            if (bool)
                i_19_ = Node_Sub34.method2573(5);
            is[i] = i_19_ << 3 | i_20_;
        }
        anIntArray1204 = new int[anInt1206 * 8];
        for (int i = 0; i < anInt1206 * 8; i++)
            anIntArray1204[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Node_Sub34.method2573(8) : -1);
    }
}
