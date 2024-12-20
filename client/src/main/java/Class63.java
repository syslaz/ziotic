/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class63 {
    private static int anInt848;
    private static int anInt849;
    private static int[] anIntArray850;
    private static int anInt851;
    private static int anInt852;
    private static int anInt853;
    private static int anInt854;
    private static int anInt855;

    private static final void method479(int i, int i_0_) {
        if (i_0_ > i + 4) {
            int i_1_ = i;
            int i_2_ = anIntArray850[i_1_];
            int i_3_ = anIntArray850[i_1_ + 1];
            int i_4_ = anIntArray850[i_1_ + 2];
            int i_5_ = anIntArray850[i_1_ + 3];
            for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
                int i_7_ = anIntArray850[i_6_ + 1];
                if (i_7_ < i_3_) {
                    anIntArray850[i_1_] = anIntArray850[i_6_];
                    anIntArray850[i_1_ + 1] = i_7_;
                    anIntArray850[i_1_ + 2] = anIntArray850[i_6_ + 2];
                    anIntArray850[i_1_ + 3] = anIntArray850[i_6_ + 3];
                    i_1_ += 4;
                    anIntArray850[i_6_] = anIntArray850[i_1_];
                    anIntArray850[i_6_ + 1] = anIntArray850[i_1_ + 1];
                    anIntArray850[i_6_ + 2] = anIntArray850[i_1_ + 2];
                    anIntArray850[i_6_ + 3] = anIntArray850[i_1_ + 3];
                }
            }
            anIntArray850[i_1_] = i_2_;
            anIntArray850[i_1_ + 1] = i_3_;
            anIntArray850[i_1_ + 2] = i_4_;
            anIntArray850[i_1_ + 3] = i_5_;
            method479(i, i_1_);
            method479(i_1_ + 4, i_0_);
        }
    }

    private static final void method480() {
        anInt852 = 0;
    }

    private static final void method481(int i, int i_8_) {
        for (/**/; i_8_ >= i + 8; i_8_ -= 4) {
            boolean bool = true;
            for (int i_9_ = i + 4; i_9_ < i_8_; i_9_ += 4) {
                int i_10_ = anIntArray850[i_9_ - 4];
                int i_11_ = anIntArray850[i_9_];
                if (i_10_ > i_11_) {
                    bool = false;
                    anIntArray850[i_9_ - 4] = i_11_;
                    anIntArray850[i_9_] = i_10_;
                    i_10_ = anIntArray850[i_9_ - 2];
                    anIntArray850[i_9_ - 2] = anIntArray850[i_9_ + 2];
                    anIntArray850[i_9_ + 2] = i_10_;
                    i_10_ = anIntArray850[i_9_ - 1];
                    anIntArray850[i_9_ - 1] = anIntArray850[i_9_ + 3];
                    anIntArray850[i_9_ + 3] = i_10_;
                }
            }
            if (bool)
                break;
        }
    }

    static final void method482(ha var_ha, int[] is, int i) {
        method484(var_ha, is, 0, is.length, i, null, null);
    }

    static final void method483(ha var_ha, int[] is, int i, int[] is_12_, int[] is_13_) {
        method484(var_ha, is, 0, is.length, i, is_12_, is_13_);
    }

    private static final void method484(ha var_ha, int[] is, int i, int i_14_, int i_15_, int[] is_16_, int[] is_17_) {
        int[] is_18_ = new int[4];
        var_ha.K(is_18_);
        if (is_16_ != null && is_18_[3] - is_18_[1] != is_16_.length)
            throw new IllegalStateException();
        method480();
        method486(is, i, i_14_);
        method488(is_18_[1]);
        while (method487(is_18_[3])) {
            int i_19_ = anInt855;
            int i_20_ = anInt849;
            int i_21_ = anInt851;
            if (is_16_ != null) {
                int i_22_ = i_21_ - is_18_[1];
                if (i_19_ < is_16_[i_22_] + is_18_[0])
                    i_19_ = is_16_[i_22_] + is_18_[0];
                if (i_20_ > is_16_[i_22_] + is_17_[i_22_] + is_18_[0])
                    i_20_ = is_16_[i_22_] + is_17_[i_22_] + is_18_[0];
                if (i_20_ - i_19_ <= 0)
                    continue;
            }
            var_ha.U(i_19_, i_21_, i_20_ - i_19_, i_15_, 1);
        }
    }

    public static void method485() {
        anIntArray850 = null;
    }

    private static final void method486(int[] is, int i, int i_23_) {
        int i_24_ = anInt852 + (i_23_ << 1);
        if (anIntArray850 == null || anIntArray850.length < i_24_) {
            int[] is_25_ = new int[i_24_];
            for (int i_26_ = 0; i_26_ < anInt852; i_26_++)
                is_25_[i_26_] = anIntArray850[i_26_];
            anIntArray850 = is_25_;
        }
        i_23_ += i;
        int i_27_ = i_23_ - 2;
        for (int i_28_ = i; i_28_ < i_23_; i_28_ += 2) {
            int i_29_ = is[i_27_ + 1];
            int i_30_ = is[i_28_ + 1];
            if (i_29_ < i_30_) {
                anIntArray850[anInt852++] = is[i_27_];
                anIntArray850[anInt852++] = i_29_;
                anIntArray850[anInt852++] = is[i_28_];
                anIntArray850[anInt852++] = i_30_;
            } else if (i_30_ < i_29_) {
                anIntArray850[anInt852++] = is[i_28_];
                anIntArray850[anInt852++] = i_30_;
                anIntArray850[anInt852++] = is[i_27_];
                anIntArray850[anInt852++] = i_29_;
            }
            i_27_ = i_28_;
        }
    }

    private static final boolean method487(int i) {
        int i_31_ = anInt853;
        int i_32_ = anInt854;
        int i_33_ = anInt851;
        int i_34_;
        for (/**/; i_32_ >= i_31_; i_32_ = i_34_) {
            anInt851 = ++i_33_;
            if (i_33_ >= i)
                return false;
            i_34_ = anInt848;
            for (/**/; i_31_ < anInt852; i_31_ += 4) {
                int i_35_ = anIntArray850[i_31_ + 1];
                if (i_33_ < i_35_)
                    break;
                int i_36_ = anIntArray850[i_31_];
                int i_37_ = anIntArray850[i_31_ + 2];
                int i_38_ = anIntArray850[i_31_ + 3];
                int i_39_ = (i_37_ - i_36_ << 16) / (i_38_ - i_35_);
                int i_40_ = (i_36_ << 16) + 32768;
                anIntArray850[i_31_] = i_40_;
                anIntArray850[i_31_ + 2] = i_39_;
            }
            for (int i_41_ = i_34_; i_41_ < i_31_; i_41_ += 4) {
                int i_42_ = anIntArray850[i_41_ + 3];
                if (i_33_ >= i_42_) {
                    anIntArray850[i_41_] = anIntArray850[i_34_];
                    anIntArray850[i_41_ + 1] = anIntArray850[i_34_ + 1];
                    anIntArray850[i_41_ + 2] = anIntArray850[i_34_ + 2];
                    anIntArray850[i_41_ + 3] = anIntArray850[i_34_ + 3];
                    i_34_ += 4;
                }
            }
            if (i_34_ == anInt852) {
                anInt852 = 0;
                return false;
            }
            method481(i_34_, i_31_);
            anInt848 = i_34_;
            anInt853 = i_31_;
        }
        anInt855 = anIntArray850[i_32_] >> 16;
        anInt849 = anIntArray850[i_32_ + 4] >> 16;
        anIntArray850[i_32_] += anIntArray850[i_32_ + 2];
        anIntArray850[i_32_ + 4] += anIntArray850[i_32_ + 6];
        i_32_ += 8;
        anInt854 = i_32_;
        return true;
    }

    private static final void method488(int i) {
        if (anInt852 < 0) {
            anInt848 = anInt853 = anInt854 = 0;
            anInt851 = 2147483646;
        } else {
            method479(0, anInt852);
            int i_43_ = anIntArray850[1];
            if (i_43_ < i)
                i_43_ = i;
            int i_44_ = 0;
            int i_45_;
            for (i_45_ = 0; i_45_ < anInt852; i_45_ += 4) {
                int i_46_ = anIntArray850[i_45_ + 1];
                if (i_43_ < i_46_)
                    break;
                int i_47_ = anIntArray850[i_45_];
                int i_48_ = anIntArray850[i_45_ + 2];
                int i_49_ = anIntArray850[i_45_ + 3];
                int i_50_ = (i_48_ - i_47_ << 16) / (i_49_ - i_46_);
                int i_51_ = (i_47_ << 16) + 32768;
                anIntArray850[i_45_] = i_51_ + (i_43_ - i_46_) * i_50_;
                anIntArray850[i_45_ + 2] = i_50_;
            }
            anInt848 = i_44_;
            anInt853 = i_45_;
            anInt854 = i_45_;
            anInt851 = i_43_ - 1;
        }
    }
}
