/* s_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class s_Sub1 extends s {
    private float aFloat7907;
    private float aFloat7908;
    private Class336[][] aClass336ArrayArray7909;
    private Class213[][] aClass213ArrayArray7910;
    private float aFloat7911;
    private int anInt7912;
    private float aFloat7913;
    private float aFloat7914;
    private float aFloat7915;
    private Class201[][] aClass201ArrayArray7916;
    private Class350[][] aClass350ArrayArray7917;
    private byte[][] aByteArrayArray7918;
    private float aFloat7919;
    private float aFloat7920;
    private float aFloat7921;
    private float aFloat7922;
    private int anInt7923 = -1;
    private float aFloat7924;
    private byte[][] aByteArrayArray7925;
    private float aFloat7926;
    private Class62[][] aClass62ArrayArray7927;
    private ha_Sub1 aHa_Sub1_7928;

    final void method3148(int i, int i_0_) {
        method3151(i, i_0_, 0);
    }

    private final void method3151(int i, int i_1_, int i_2_) {
        Class203 class203 = aHa_Sub1_7928.method832(Thread.currentThread());
        ((Class244) ((Class203) class203).aClass244_2345).anInt2718 = 0;
        if (aClass350ArrayArray7917 != null)
            method3157(i, i_1_, ((Class203) class203).aBoolean2310, class203, ((Class203) class203).aClass244_2345, ((Class203) class203).anIntArray2334, ((Class203) class203).anIntArray2324, ((Class203) class203).anIntArray2336, ((Class203) class203).anIntArray2328, i_2_);
        else if (aClass201ArrayArray7916 != null)
            method3155(i, i_1_, ((Class203) class203).aClass244_2345, ((Class203) class203).anIntArray2334, ((Class203) class203).anIntArray2324, ((Class203) class203).anIntArray2336, ((Class203) class203).anIntArray2328, i_2_);
        else if (aClass213ArrayArray7910 != null)
            method3152(i, i_1_, ((Class203) class203).aBoolean2310, class203, ((Class203) class203).aClass244_2345, ((Class203) class203).anIntArray2334, ((Class203) class203).anIntArray2324, ((Class203) class203).anIntArray2336, ((Class203) class203).anIntArray2328, i_2_);
    }

    private final void method3152(int i, int i_3_, boolean bool, Class203 class203, Class244 class244, int[] is, int[] is_4_, int[] is_5_, int[] is_6_, int i_7_) {
        Class213 class213 = aClass213ArrayArray7910[i][i_3_];
        if (i_7_ == 0 || (i_7_ & 0x2) == 0) {
            if (class213 != null) {
                if (anInt7923 == -1) {
                    for (int i_8_ = 0; i_8_ < ((Class213) class213).aShort2463; i_8_++) {
                        int i_9_ = (((Class213) class213).aShortArray2467[i_8_] + (i << ((s) this).anInt3466));
                        int i_10_ = ((Class213) class213).aShortArray2461[i_8_];
                        int i_11_ = (((Class213) class213).aShortArray2466[i_8_] + (i_3_ << ((s) this).anInt3466));
                        float f = aFloat7921 + (aFloat7914 * (float) i_9_ + aFloat7922 * (float) i_10_ + aFloat7920 * (float) i_11_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        is_6_[i_8_] = 0;
                        if (bool) {
                            int i_12_ = (int) (f - (float) (((Class203) class203).anInt2312));
                            if (i_12_ > 255)
                                i_12_ = 255;
                            if (i_12_ > 0) {
                                is_6_[i_8_] = i_12_;
                                int i_13_ = ((((Class213) class213).aShortArray2465[i_8_]) * i_12_ / 255);
                                if (i_13_ > 0)
                                    i_10_ -= i_13_;
                            }
                        } else if (((Class203) class203).aBoolean2315) {
                            int i_14_ = (int) (f - (float) (((Class203) class203).anInt2312));
                            if (i_14_ > 0) {
                                is_6_[i_8_] = i_14_;
                                if (is_6_[i_8_] > 255)
                                    is_6_[i_8_] = 255;
                            }
                        }
                        float f_15_ = aFloat7907 + (aFloat7919 * (float) i_9_ + aFloat7913 * (float) i_10_ + aFloat7926 * (float) i_11_);
                        float f_16_ = aFloat7915 + (aFloat7908 * (float) i_9_ + aFloat7924 * (float) i_10_ + aFloat7911 * (float) i_11_);
                        is[i_8_] = (((Class244) class244).anInt2712 + (int) (f_15_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        is_4_[i_8_] = (((Class244) class244).anInt2715 + (int) (f_16_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        is_5_[i_8_] = (int) f;
                    }
                } else {
                    for (int i_17_ = 0; i_17_ < ((Class213) class213).aShort2463; i_17_++) {
                        int i_18_ = (((Class213) class213).aShortArray2467[i_17_] + (i << ((s) this).anInt3466));
                        int i_19_ = ((Class213) class213).aShortArray2461[i_17_];
                        int i_20_ = (((Class213) class213).aShortArray2466[i_17_] + (i_3_ << ((s) this).anInt3466));
                        float f = aFloat7921 + (aFloat7914 * (float) i_18_ + aFloat7922 * (float) i_19_ + aFloat7920 * (float) i_20_);
                        is_6_[i_17_] = 0;
                        if (bool) {
                            int i_21_ = anInt7923 - ((Class203) class203).anInt2312;
                            if (i_21_ > 255)
                                i_21_ = 255;
                            if (i_21_ > 0) {
                                is_6_[i_17_] = i_21_;
                                int i_22_ = ((((Class213) class213).aShortArray2465[i_17_]) * i_21_ / 255);
                                if (i_22_ > 0)
                                    i_19_ -= i_22_;
                            }
                        } else if (((Class203) class203).aBoolean2315) {
                            int i_23_ = anInt7923 - ((Class203) class203).anInt2312;
                            if (i_23_ > 0) {
                                is_6_[i_17_] = i_23_;
                                if (is_6_[i_17_] > 255)
                                    is_6_[i_17_] = 255;
                            }
                        }
                        float f_24_ = aFloat7907 + (aFloat7919 * (float) i_18_ + aFloat7913 * (float) i_19_ + aFloat7926 * (float) i_20_);
                        float f_25_ = aFloat7915 + (aFloat7908 * (float) i_18_ + aFloat7924 * (float) i_19_ + aFloat7911 * (float) i_20_);
                        is[i_17_] = (((Class244) class244).anInt2712 + (int) (f_24_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        is_4_[i_17_] = (((Class244) class244).anInt2715 + (int) (f_25_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        is_5_[i_17_] = (int) f;
                    }
                }
                float f = (float) ((s) this).anInt3465;
                for (int i_26_ = 0; i_26_ < ((Class213) class213).aShort2462; i_26_++) {
                    int i_27_ = i_26_ * 3;
                    int i_28_ = i_27_ + 1;
                    int i_29_ = i_28_ + 1;
                    int i_30_ = is[i_27_];
                    int i_31_ = is[i_28_];
                    int i_32_ = is[i_29_];
                    int i_33_ = is_4_[i_27_];
                    int i_34_ = is_4_[i_28_];
                    int i_35_ = is_4_[i_29_];
                    if (((i_30_ - i_31_) * (i_35_ - i_34_) - (i_33_ - i_34_) * (i_32_ - i_31_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_30_ < 0 || i_31_ < 0 || i_32_ < 0 || i_30_ > ((Class244) class244).anInt2713 || i_31_ > ((Class244) class244).anInt2713 || i_32_ > ((Class244) class244).anInt2713);
                        if (is_6_[i_27_] + is_6_[i_28_] + is_6_[i_29_] < 765) {
                            int i_36_ = i << ((s) this).anInt3466;
                            int i_37_ = i_3_ << ((s) this).anInt3466;
                            if ((((Class213) class213).anIntArray2459[i_27_] & 0xffffff) != 0) {
                                if (((((Class213) class213).aShortArray2458[i_27_]) == (((Class213) class213).aShortArray2458[i_28_])) && ((((Class213) class213).aShortArray2458[i_27_]) == (((Class213) class213).aShortArray2458[i_29_])) && ((((Class213) class213).aShortArray2464[i_27_]) == (((Class213) class213).aShortArray2464[i_28_])) && ((((Class213) class213).aShortArray2464[i_27_]) == (((Class213) class213).aShortArray2464[i_29_])))
                                    class244.method1948((float) i_33_, (float) i_34_, (float) i_35_, (float) i_30_, (float) i_31_, (float) i_32_, (float) is_5_[i_27_], (float) is_5_[i_28_], (float) is_5_[i_29_], ((float) (i_36_ + (((Class213) class213).aShortArray2467[i_27_])) / (float) (((Class213) class213).aShortArray2464[i_27_])), ((float) (i_36_ + (((Class213) class213).aShortArray2467[i_28_])) / (float) (((Class213) class213).aShortArray2464[i_28_])), ((float) (i_36_ + (((Class213) class213).aShortArray2467[i_29_])) / (float) (((Class213) class213).aShortArray2464[i_29_])), ((float) (i_37_ + (((Class213) class213).aShortArray2466[i_27_])) / (float) (((Class213) class213).aShortArray2464[i_27_])), ((float) (i_37_ + (((Class213) class213).aShortArray2466[i_28_])) / (float) (((Class213) class213).aShortArray2464[i_28_])), ((float) (i_37_ + (((Class213) class213).aShortArray2466[i_29_])) / (float) (((Class213) class213).aShortArray2464[i_29_])), (((Class213) class213).anIntArray2459[i_27_]), (((Class213) class213).anIntArray2459[i_28_]), (((Class213) class213).anIntArray2459[i_29_]), ((Class203) class203).anInt2303, is_6_[i_27_], is_6_[i_28_], is_6_[i_29_], (((Class213) class213).aShortArray2458[i_27_]));
                                else
                                    class244.method1943((float) i_33_, (float) i_34_, (float) i_35_, (float) i_30_, (float) i_31_, (float) i_32_, (float) is_5_[i_27_], (float) is_5_[i_28_], (float) is_5_[i_29_], ((float) (i_36_ + (((Class213) class213).aShortArray2467[i_27_])) / f), ((float) (i_36_ + (((Class213) class213).aShortArray2467[i_28_])) / f), ((float) (i_36_ + (((Class213) class213).aShortArray2467[i_29_])) / f), ((float) (i_37_ + (((Class213) class213).aShortArray2466[i_27_])) / f), ((float) (i_37_ + (((Class213) class213).aShortArray2466[i_28_])) / f), ((float) (i_37_ + (((Class213) class213).aShortArray2466[i_29_])) / f), (((Class213) class213).anIntArray2459[i_27_]), (((Class213) class213).anIntArray2459[i_28_]), (((Class213) class213).anIntArray2459[i_29_]), ((Class203) class203).anInt2303, is_6_[i_27_], is_6_[i_28_], is_6_[i_29_], (((Class213) class213).aShortArray2458[i_27_]), f / (float) (((Class213) class213).aShortArray2464[i_27_]), (((Class213) class213).aShortArray2458[i_28_]), f / (float) (((Class213) class213).aShortArray2464[i_28_]), (((Class213) class213).aShortArray2458[i_29_]), f / (float) (((Class213) class213).aShortArray2464[i_29_]));
                            }
                        } else
                            class244.method1949((float) i_33_, (float) i_34_, (float) i_35_, (float) i_30_, (float) i_31_, (float) i_32_, (float) is_5_[i_27_], (float) is_5_[i_28_], (float) is_5_[i_29_], (((Class203) class203).anInt2303));
                    }
                }
            }
        }
    }

    final r fa(int i, int i_38_, r var_r) {
        return null;
    }

    private final boolean method3153(int i) {
        if ((anInt7912 & 0x8) == 0)
            return false;
        if (i == 4)
            return true;
        if (i == 8)
            return true;
        if (i == 9)
            return true;
        return false;
    }

    final void CA(r var_r, int i, int i_39_, int i_40_, int i_41_, boolean bool) {
        /* empty */
    }

    private static final int method3154(int i, int i_42_) {
        int i_43_ = (i & 0xff0000) * i_42_ >> 23;
        if (i_43_ < 2)
            i_43_ = 2;
        else if (i_43_ > 253)
            i_43_ = 253;
        int i_44_ = (i & 0xff00) * i_42_ >> 15;
        if (i_44_ < 2)
            i_44_ = 2;
        else if (i_44_ > 253)
            i_44_ = 253;
        int i_45_ = (i & 0xff) * i_42_ >> 7;
        if (i_45_ < 2)
            i_45_ = 2;
        else if (i_45_ > 253)
            i_45_ = 253;
        return i_43_ << 16 | i_44_ << 8 | i_45_;
    }

    private final void method3155(int i, int i_46_, Class244 class244, int[] is, int[] is_47_, int[] is_48_, int[] is_49_, int i_50_) {
        Class201 class201 = aClass201ArrayArray7916[i][i_46_];
        if (class201 != null) {
            if ((((Class201) class201).aByte2297 & 0x2) == 0) {
                if (i_50_ != 0) {
                    if ((((Class201) class201).aByte2297 & 0x4) != 0) {
                        if ((i_50_ & 0x1) != 0)
                            return;
                    } else if ((i_50_ & 0x2) != 0)
                        return;
                }
                int i_51_ = i * ((s) this).anInt3465;
                int i_52_ = i_51_ + ((s) this).anInt3465;
                int i_53_ = i_46_ * ((s) this).anInt3465;
                int i_54_ = i_53_ + ((s) this).anInt3465;
                float f;
                float f_55_;
                float f_56_;
                float f_57_;
                int i_58_;
                int i_59_;
                int i_60_;
                int i_61_;
                int i_62_;
                int i_63_;
                int i_64_;
                int i_65_;
                if ((((Class201) class201).aByte2297 & 0x1) != 0) {
                    int i_66_ = ((s) this).anIntArrayArray3464[i][i_46_];
                    float f_67_ = aFloat7922 * (float) i_66_;
                    if (anInt7923 == -1) {
                        f = aFloat7921 + (aFloat7914 * (float) i_51_ + f_67_ + aFloat7920 * (float) i_53_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_55_ = aFloat7921 + (aFloat7914 * (float) i_52_ + f_67_ + aFloat7920 * (float) i_53_);
                        if (f_55_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_56_ = aFloat7921 + (aFloat7914 * (float) i_52_ + f_67_ + aFloat7920 * (float) i_54_);
                        if (f_56_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_57_ = aFloat7921 + (aFloat7914 * (float) i_51_ + f_67_ + aFloat7920 * (float) i_54_);
                        if (f_57_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                    } else {
                        f = aFloat7921 + (aFloat7914 * (float) i_51_ + f_67_ + aFloat7920 * (float) i_53_);
                        f_55_ = aFloat7921 + (aFloat7914 * (float) i_52_ + f_67_ + aFloat7920 * (float) i_53_);
                        f_56_ = aFloat7921 + (aFloat7914 * (float) i_52_ + f_67_ + aFloat7920 * (float) i_54_);
                        f_57_ = aFloat7921 + (aFloat7914 * (float) i_51_ + f_67_ + aFloat7920 * (float) i_54_);
                    }
                    float f_68_ = aFloat7913 * (float) i_66_;
                    float f_69_ = aFloat7924 * (float) i_66_;
                    if (anInt7923 == -1) {
                        float f_70_ = aFloat7907 + (aFloat7919 * (float) i_51_ + f_68_ + aFloat7926 * (float) i_53_);
                        i_58_ = (((Class244) class244).anInt2712 + (int) (f_70_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        float f_71_ = aFloat7915 + (aFloat7908 * (float) i_51_ + f_69_ + aFloat7911 * (float) i_53_);
                        i_59_ = (((Class244) class244).anInt2715 + (int) (f_71_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        float f_72_ = aFloat7907 + (aFloat7919 * (float) i_52_ + f_68_ + aFloat7926 * (float) i_53_);
                        i_60_ = (((Class244) class244).anInt2712 + (int) (f_72_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_55_));
                        float f_73_ = aFloat7915 + (aFloat7908 * (float) i_52_ + f_69_ + aFloat7911 * (float) i_53_);
                        i_61_ = (((Class244) class244).anInt2715 + (int) (f_73_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_55_));
                        float f_74_ = aFloat7907 + (aFloat7919 * (float) i_52_ + f_68_ + aFloat7926 * (float) i_54_);
                        i_62_ = (((Class244) class244).anInt2712 + (int) (f_74_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_56_));
                        float f_75_ = aFloat7915 + (aFloat7908 * (float) i_52_ + f_69_ + aFloat7911 * (float) i_54_);
                        i_63_ = (((Class244) class244).anInt2715 + (int) (f_75_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_56_));
                        float f_76_ = aFloat7907 + (aFloat7919 * (float) i_51_ + f_68_ + aFloat7926 * (float) i_54_);
                        i_64_ = (((Class244) class244).anInt2712 + (int) (f_76_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_57_));
                        float f_77_ = aFloat7915 + (aFloat7908 * (float) i_51_ + f_69_ + aFloat7911 * (float) i_54_);
                        i_65_ = (((Class244) class244).anInt2715 + (int) (f_77_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_57_));
                    } else {
                        float f_78_ = aFloat7907 + (aFloat7919 * (float) i_51_ + f_68_ + aFloat7926 * (float) i_53_);
                        i_58_ = (((Class244) class244).anInt2712 + (int) (f_78_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_79_ = aFloat7915 + (aFloat7908 * (float) i_51_ + f_69_ + aFloat7911 * (float) i_53_);
                        i_59_ = (((Class244) class244).anInt2715 + (int) (f_79_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_80_ = aFloat7907 + (aFloat7919 * (float) i_52_ + f_68_ + aFloat7926 * (float) i_53_);
                        i_60_ = (((Class244) class244).anInt2712 + (int) (f_80_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_81_ = aFloat7915 + (aFloat7908 * (float) i_52_ + f_69_ + aFloat7911 * (float) i_53_);
                        i_61_ = (((Class244) class244).anInt2715 + (int) (f_81_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_82_ = aFloat7907 + (aFloat7919 * (float) i_52_ + f_68_ + aFloat7926 * (float) i_54_);
                        i_62_ = (((Class244) class244).anInt2712 + (int) (f_82_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_83_ = aFloat7915 + (aFloat7908 * (float) i_52_ + f_69_ + aFloat7911 * (float) i_54_);
                        i_63_ = (((Class244) class244).anInt2715 + (int) (f_83_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_84_ = aFloat7907 + (aFloat7919 * (float) i_51_ + f_68_ + aFloat7926 * (float) i_54_);
                        i_64_ = (((Class244) class244).anInt2712 + (int) (f_84_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_85_ = aFloat7915 + (aFloat7908 * (float) i_51_ + f_69_ + aFloat7911 * (float) i_54_);
                        i_65_ = (((Class244) class244).anInt2715 + (int) (f_85_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                    }
                } else {
                    int i_86_ = ((s) this).anIntArrayArray3464[i][i_46_];
                    int i_87_ = ((s) this).anIntArrayArray3464[i + 1][i_46_];
                    int i_88_ = ((s) this).anIntArrayArray3464[i + 1][i_46_ + 1];
                    int i_89_ = ((s) this).anIntArrayArray3464[i][i_46_ + 1];
                    if (anInt7923 == -1) {
                        f = aFloat7921 + (aFloat7914 * (float) i_51_ + aFloat7922 * (float) i_86_ + aFloat7920 * (float) i_53_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_55_ = aFloat7921 + (aFloat7914 * (float) i_52_ + aFloat7922 * (float) i_87_ + aFloat7920 * (float) i_53_);
                        if (f_55_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_56_ = aFloat7921 + (aFloat7914 * (float) i_52_ + aFloat7922 * (float) i_88_ + aFloat7920 * (float) i_54_);
                        if (f_56_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_57_ = aFloat7921 + (aFloat7914 * (float) i_51_ + aFloat7922 * (float) i_89_ + aFloat7920 * (float) i_54_);
                        if (f_57_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        float f_90_ = aFloat7907 + (aFloat7919 * (float) i_51_ + aFloat7913 * (float) i_86_ + aFloat7926 * (float) i_53_);
                        i_58_ = (((Class244) class244).anInt2712 + (int) (f_90_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        float f_91_ = aFloat7915 + (aFloat7908 * (float) i_51_ + aFloat7924 * (float) i_86_ + aFloat7911 * (float) i_53_);
                        i_59_ = (((Class244) class244).anInt2715 + (int) (f_91_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        float f_92_ = aFloat7907 + (aFloat7919 * (float) i_52_ + aFloat7913 * (float) i_87_ + aFloat7926 * (float) i_53_);
                        i_60_ = (((Class244) class244).anInt2712 + (int) (f_92_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_55_));
                        float f_93_ = aFloat7915 + (aFloat7908 * (float) i_52_ + aFloat7924 * (float) i_87_ + aFloat7911 * (float) i_53_);
                        i_61_ = (((Class244) class244).anInt2715 + (int) (f_93_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_55_));
                        float f_94_ = aFloat7907 + (aFloat7919 * (float) i_52_ + aFloat7913 * (float) i_88_ + aFloat7926 * (float) i_54_);
                        i_62_ = (((Class244) class244).anInt2712 + (int) (f_94_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_56_));
                        float f_95_ = aFloat7915 + (aFloat7908 * (float) i_52_ + aFloat7924 * (float) i_88_ + aFloat7911 * (float) i_54_);
                        i_63_ = (((Class244) class244).anInt2715 + (int) (f_95_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_56_));
                        float f_96_ = aFloat7907 + (aFloat7919 * (float) i_51_ + aFloat7913 * (float) i_89_ + aFloat7926 * (float) i_54_);
                        i_64_ = (((Class244) class244).anInt2712 + (int) (f_96_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_57_));
                        float f_97_ = aFloat7915 + (aFloat7908 * (float) i_51_ + aFloat7924 * (float) i_89_ + aFloat7911 * (float) i_54_);
                        i_65_ = (((Class244) class244).anInt2715 + (int) (f_97_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_57_));
                    } else {
                        f = aFloat7921 + (aFloat7914 * (float) i_51_ + aFloat7922 * (float) i_86_ + aFloat7920 * (float) i_53_);
                        f_55_ = aFloat7921 + (aFloat7914 * (float) i_52_ + aFloat7922 * (float) i_87_ + aFloat7920 * (float) i_53_);
                        f_56_ = aFloat7921 + (aFloat7914 * (float) i_52_ + aFloat7922 * (float) i_88_ + aFloat7920 * (float) i_54_);
                        f_57_ = aFloat7921 + (aFloat7914 * (float) i_51_ + aFloat7922 * (float) i_89_ + aFloat7920 * (float) i_54_);
                        float f_98_ = aFloat7907 + (aFloat7919 * (float) i_51_ + aFloat7913 * (float) i_86_ + aFloat7926 * (float) i_53_);
                        i_58_ = (((Class244) class244).anInt2712 + (int) (f_98_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_99_ = aFloat7915 + (aFloat7908 * (float) i_51_ + aFloat7924 * (float) i_86_ + aFloat7911 * (float) i_53_);
                        i_59_ = (((Class244) class244).anInt2715 + (int) (f_99_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_100_ = aFloat7907 + (aFloat7919 * (float) i_52_ + aFloat7913 * (float) i_87_ + aFloat7926 * (float) i_53_);
                        i_60_ = (((Class244) class244).anInt2712 + (int) (f_100_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_101_ = aFloat7915 + (aFloat7908 * (float) i_52_ + aFloat7924 * (float) i_87_ + aFloat7911 * (float) i_53_);
                        i_61_ = (((Class244) class244).anInt2715 + (int) (f_101_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_102_ = aFloat7907 + (aFloat7919 * (float) i_52_ + aFloat7913 * (float) i_88_ + aFloat7926 * (float) i_54_);
                        i_62_ = (((Class244) class244).anInt2712 + (int) (f_102_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_103_ = aFloat7915 + (aFloat7908 * (float) i_52_ + aFloat7924 * (float) i_88_ + aFloat7911 * (float) i_54_);
                        i_63_ = (((Class244) class244).anInt2715 + (int) (f_103_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_104_ = aFloat7907 + (aFloat7919 * (float) i_51_ + aFloat7913 * (float) i_89_ + aFloat7926 * (float) i_54_);
                        i_64_ = (((Class244) class244).anInt2712 + (int) (f_104_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_105_ = aFloat7915 + (aFloat7908 * (float) i_51_ + aFloat7924 * (float) i_89_ + aFloat7911 * (float) i_54_);
                        i_65_ = (((Class244) class244).anInt2715 + (int) (f_105_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                    }
                }
                if (anInt7923 == -1) {
                    if (((i_62_ - i_64_) * (i_61_ - i_65_) - (i_63_ - i_65_) * (i_60_ - i_64_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_62_ < 0 || i_64_ < 0 || i_60_ < 0 || i_62_ > ((Class244) class244).anInt2713 || i_64_ > ((Class244) class244).anInt2713 || i_60_ > ((Class244) class244).anInt2713);
                        if (((Class201) class201).aShort2296 >= 0)
                            class244.method1948((float) i_63_, (float) i_65_, (float) i_61_, (float) i_62_, (float) i_64_, (float) i_60_, f_56_, f_57_, f_55_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2298 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2294 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2295 & 0xffff)]) & 0xffffff), 0, 0, 0, 0, ((Class201) class201).aShort2296);
                        else
                            class244.method1951((float) i_63_, (float) i_65_, (float) i_61_, (float) i_62_, (float) i_64_, (float) i_60_, (float) (int) f_56_, (float) (int) f_57_, (float) (int) f_55_, (float) (((Class201) class201).aShort2298 & 0xffff), (float) (((Class201) class201).aShort2294 & 0xffff), (float) (((Class201) class201).aShort2295 & 0xffff));
                    }
                    if (((i_58_ - i_60_) * (i_65_ - i_61_) - (i_59_ - i_61_) * (i_64_ - i_60_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_58_ < 0 || i_60_ < 0 || i_64_ < 0 || i_58_ > ((Class244) class244).anInt2713 || i_60_ > ((Class244) class244).anInt2713 || i_64_ > ((Class244) class244).anInt2713);
                        if (((Class201) class201).aShort2296 >= 0)
                            class244.method1948((float) i_59_, (float) i_61_, (float) i_65_, (float) i_58_, (float) i_60_, (float) i_64_, f, f_55_, f_57_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2293 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2295 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2294 & 0xffff)]) & 0xffffff), 0, 0, 0, 0, ((Class201) class201).aShort2296);
                        else
                            class244.method1951((float) i_59_, (float) i_61_, (float) i_65_, (float) i_58_, (float) i_60_, (float) i_64_, (float) (int) f, (float) (int) f_55_, (float) (int) f_57_, (float) (((Class201) class201).aShort2293 & 0xffff), (float) (((Class201) class201).aShort2295 & 0xffff), (float) (((Class201) class201).aShort2294 & 0xffff));
                    }
                } else {
                    if (((i_62_ - i_64_) * (i_61_ - i_65_) - (i_63_ - i_65_) * (i_60_ - i_64_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_62_ < 0 || i_64_ < 0 || i_60_ < 0 || i_62_ > ((Class244) class244).anInt2713 || i_64_ > ((Class244) class244).anInt2713 || i_60_ > ((Class244) class244).anInt2713);
                        if (((Class201) class201).aShort2296 >= 0)
                            class244.method1948((float) i_63_, (float) i_65_, (float) i_61_, (float) i_62_, (float) i_64_, (float) i_60_, f_56_, f_57_, f_55_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2298 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2294 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2295 & 0xffff)]) & 0xffffff), 0, 0, 0, 0, ((Class201) class201).aShort2296);
                        else
                            class244.method1951((float) i_63_, (float) i_65_, (float) i_61_, (float) i_62_, (float) i_64_, (float) i_60_, (float) (int) f_56_, (float) (int) f_57_, (float) (int) f_55_, (float) (((Class201) class201).aShort2298 & 0xffff), (float) (((Class201) class201).aShort2294 & 0xffff), (float) (((Class201) class201).aShort2295 & 0xffff));
                    }
                    if (((i_58_ - i_60_) * (i_65_ - i_61_) - (i_59_ - i_61_) * (i_64_ - i_60_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_58_ < 0 || i_60_ < 0 || i_64_ < 0 || i_58_ > ((Class244) class244).anInt2713 || i_60_ > ((Class244) class244).anInt2713 || i_64_ > ((Class244) class244).anInt2713);
                        if (((Class201) class201).aShort2296 >= 0)
                            class244.method1948((float) i_59_, (float) i_61_, (float) i_65_, (float) i_58_, (float) i_60_, (float) i_64_, f, f_55_, f_57_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2293 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2295 & 0xffff)]) & 0xffffff), (~0xffffff | (Node.anIntArray2801[(((Class201) class201).aShort2294 & 0xffff)]) & 0xffffff), 0, 0, 0, 0, ((Class201) class201).aShort2296);
                        else
                            class244.method1951((float) i_59_, (float) i_61_, (float) i_65_, (float) i_58_, (float) i_60_, (float) i_64_, (float) (int) f, (float) (int) f_55_, (float) (int) f_57_, (float) (((Class201) class201).aShort2293 & 0xffff), (float) (((Class201) class201).aShort2295 & 0xffff), (float) (((Class201) class201).aShort2294 & 0xffff));
                    }
                }
            }
        } else {
            Class336 class336 = aClass336ArrayArray7909[i][i_46_];
            if (class336 != null) {
                if (i_50_ != 0) {
                    if ((((Class336) class336).aByte3917 & 0x4) != 0) {
                        if ((i_50_ & 0x1) != 0)
                            return;
                    } else if ((i_50_ & 0x2) != 0)
                        return;
                }
                if (anInt7923 == -1) {
                    for (int i_106_ = 0; i_106_ < ((Class336) class336).aShort3912; i_106_++) {
                        int i_107_ = (((Class336) class336).aShortArray3920[i_106_] + (i << ((s) this).anInt3466));
                        short i_108_ = ((Class336) class336).aShortArray3923[i_106_];
                        int i_109_ = (((Class336) class336).aShortArray3921[i_106_] + (i_46_ << ((s) this).anInt3466));
                        float f = aFloat7921 + (aFloat7914 * (float) i_107_ + aFloat7922 * (float) i_108_ + aFloat7920 * (float) i_109_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        float f_110_ = aFloat7907 + (aFloat7919 * (float) i_107_ + aFloat7913 * (float) i_108_ + aFloat7926 * (float) i_109_);
                        float f_111_ = aFloat7915 + (aFloat7908 * (float) i_107_ + aFloat7924 * (float) i_108_ + aFloat7911 * (float) i_109_);
                        is[i_106_] = (((Class244) class244).anInt2712 + (int) (f_110_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        is_47_[i_106_] = (((Class244) class244).anInt2715 + (int) (f_111_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        is_48_[i_106_] = (int) f;
                    }
                } else {
                    for (int i_112_ = 0; i_112_ < ((Class336) class336).aShort3912; i_112_++) {
                        int i_113_ = (((Class336) class336).aShortArray3920[i_112_] + (i << ((s) this).anInt3466));
                        short i_114_ = ((Class336) class336).aShortArray3923[i_112_];
                        int i_115_ = (((Class336) class336).aShortArray3921[i_112_] + (i_46_ << ((s) this).anInt3466));
                        float f = aFloat7921 + (aFloat7914 * (float) i_113_ + aFloat7922 * (float) i_114_ + aFloat7920 * (float) i_115_);
                        float f_116_ = aFloat7907 + (aFloat7919 * (float) i_113_ + aFloat7913 * (float) i_114_ + aFloat7926 * (float) i_115_);
                        float f_117_ = aFloat7915 + (aFloat7908 * (float) i_113_ + aFloat7924 * (float) i_114_ + aFloat7911 * (float) i_115_);
                        is[i_112_] = (((Class244) class244).anInt2712 + (int) (f_116_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        is_47_[i_112_] = (((Class244) class244).anInt2715 + (int) (f_117_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        is_48_[i_112_] = (int) f;
                    }
                }
                if (((Class336) class336).aShortArray3919 != null) {
                    if (anInt7923 == -1) {
                        for (int i_118_ = 0; i_118_ < ((Class336) class336).aShort3915; i_118_++) {
                            short i_119_ = (((Class336) class336).aShortArray3913[i_118_]);
                            short i_120_ = (((Class336) class336).aShortArray3922[i_118_]);
                            short i_121_ = (((Class336) class336).aShortArray3911[i_118_]);
                            int i_122_ = is[i_119_];
                            int i_123_ = is[i_120_];
                            int i_124_ = is[i_121_];
                            int i_125_ = is_47_[i_119_];
                            int i_126_ = is_47_[i_120_];
                            int i_127_ = is_47_[i_121_];
                            if (((i_122_ - i_123_) * (i_127_ - i_126_) - (i_125_ - i_126_) * (i_124_ - i_123_)) > 0) {
                                ((Class244) class244).aBoolean2723 = (i_122_ < 0 || i_123_ < 0 || i_124_ < 0 || (i_122_ > ((Class244) class244).anInt2713) || (i_123_ > ((Class244) class244).anInt2713) || (i_124_ > ((Class244) class244).anInt2713));
                                short i_128_ = (((Class336) class336).aShortArray3919[i_118_]);
                                if (i_128_ != -1)
                                    class244.method1948((float) i_125_, (float) i_126_, (float) i_127_, (float) i_122_, (float) i_123_, (float) i_124_, (float) is_48_[i_119_], (float) is_48_[i_120_], (float) is_48_[i_121_], ((float) (((Class336) class336).aShortArray3920[i_119_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3920[i_120_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3920[i_121_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3921[i_119_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3921[i_120_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3921[i_121_]) / (float) ((s) this).anInt3465), ~0xffffff | ((Node.anIntArray2801[(((Class336) class336).aShortArray3914[i_119_]) & 0xffff]) & 0xffffff), ~0xffffff | ((Node.anIntArray2801[(((Class336) class336).aShortArray3914[i_120_]) & 0xffff]) & 0xffffff), ~0xffffff | ((Node.anIntArray2801[(((Class336) class336).aShortArray3914[i_121_]) & 0xffff]) & 0xffffff), 0, 0, 0, 0, i_128_);
                                else {
                                    int i_129_ = (((Class336) class336).anIntArray3918[i_118_]);
                                    if (i_129_ != -1)
                                        class244.method1951((float) i_125_, (float) i_126_, (float) i_127_, (float) i_122_, (float) i_123_, (float) i_124_, (float) is_48_[i_119_], (float) is_48_[i_120_], (float) is_48_[i_121_], (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_119_]), i_129_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_120_]), i_129_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_121_]), i_129_, (byte) 80)));
                                }
                            }
                        }
                    } else {
                        for (int i_130_ = 0; i_130_ < ((Class336) class336).aShort3915; i_130_++) {
                            short i_131_ = (((Class336) class336).aShortArray3913[i_130_]);
                            short i_132_ = (((Class336) class336).aShortArray3922[i_130_]);
                            short i_133_ = (((Class336) class336).aShortArray3911[i_130_]);
                            int i_134_ = is[i_131_];
                            int i_135_ = is[i_132_];
                            int i_136_ = is[i_133_];
                            int i_137_ = is_47_[i_131_];
                            int i_138_ = is_47_[i_132_];
                            int i_139_ = is_47_[i_133_];
                            if (((i_134_ - i_135_) * (i_139_ - i_138_) - (i_137_ - i_138_) * (i_136_ - i_135_)) > 0) {
                                ((Class244) class244).aBoolean2723 = (i_134_ < 0 || i_135_ < 0 || i_136_ < 0 || (i_134_ > ((Class244) class244).anInt2713) || (i_135_ > ((Class244) class244).anInt2713) || (i_136_ > ((Class244) class244).anInt2713));
                                short i_140_ = (((Class336) class336).aShortArray3919[i_130_]);
                                if (i_140_ != -1)
                                    class244.method1948((float) i_137_, (float) i_138_, (float) i_139_, (float) i_134_, (float) i_135_, (float) i_136_, (float) is_48_[i_131_], (float) is_48_[i_132_], (float) is_48_[i_133_], ((float) (((Class336) class336).aShortArray3920[i_131_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3920[i_132_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3920[i_133_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3921[i_131_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3921[i_132_]) / (float) ((s) this).anInt3465), ((float) (((Class336) class336).aShortArray3921[i_133_]) / (float) ((s) this).anInt3465), ~0xffffff | ((Node.anIntArray2801[(((Class336) class336).aShortArray3914[i_131_]) & 0xffff]) & 0xffffff), ~0xffffff | ((Node.anIntArray2801[(((Class336) class336).aShortArray3914[i_132_]) & 0xffff]) & 0xffffff), ~0xffffff | ((Node.anIntArray2801[(((Class336) class336).aShortArray3914[i_133_]) & 0xffff]) & 0xffffff), 0, 0, 0, 0, i_140_);
                                else {
                                    int i_141_ = (((Class336) class336).anIntArray3918[i_130_]);
                                    if (i_141_ != -1)
                                        class244.method1951((float) i_137_, (float) i_138_, (float) i_139_, (float) i_134_, (float) i_135_, (float) i_136_, (float) is_48_[i_131_], (float) is_48_[i_132_], (float) is_48_[i_133_], (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_131_]), i_141_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_132_]), i_141_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_133_]), i_141_, (byte) 80)));
                                }
                            }
                        }
                    }
                } else {
                    for (int i_142_ = 0; i_142_ < ((Class336) class336).aShort3915; i_142_++) {
                        short i_143_ = ((Class336) class336).aShortArray3913[i_142_];
                        short i_144_ = ((Class336) class336).aShortArray3922[i_142_];
                        short i_145_ = ((Class336) class336).aShortArray3911[i_142_];
                        int i_146_ = is[i_143_];
                        int i_147_ = is[i_144_];
                        int i_148_ = is[i_145_];
                        int i_149_ = is_47_[i_143_];
                        int i_150_ = is_47_[i_144_];
                        int i_151_ = is_47_[i_145_];
                        if (((i_146_ - i_147_) * (i_151_ - i_150_) - (i_149_ - i_150_) * (i_148_ - i_147_)) > 0) {
                            int i_152_ = ((Class336) class336).anIntArray3918[i_142_];
                            if (i_152_ != -1) {
                                ((Class244) class244).aBoolean2723 = (i_146_ < 0 || i_147_ < 0 || i_148_ < 0 || (i_146_ > ((Class244) class244).anInt2713) || (i_147_ > ((Class244) class244).anInt2713) || (i_148_ > ((Class244) class244).anInt2713));
                                class244.method1951((float) i_149_, (float) i_150_, (float) i_151_, (float) i_146_, (float) i_147_, (float) i_148_, (float) is_48_[i_143_], (float) is_48_[i_144_], (float) is_48_[i_145_], (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_143_]), i_152_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_144_]), i_152_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_145_]), i_152_, (byte) 80)));
                            }
                        }
                    }
                }
            }
        }
    }

    final void method3142(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, boolean[][] bools) {
        Class203 class203 = aHa_Sub1_7928.method832(Thread.currentThread());
        Class244 class244 = ((Class203) class203).aClass244_2345;
        ((Class244) class244).anInt2718 = 0;
        ((Class244) class244).aBoolean2723 = true;
        aHa_Sub1_7928.ya();
        if (aClass350ArrayArray7917 != null || aClass213ArrayArray7910 != null)
            method3156(i, i_153_, i_154_, i_155_, i_156_, i_157_, i_158_, bools, class203, class244, ((Class203) class203).anIntArray2334, ((Class203) class203).anIntArray2324);
        else if (aClass201ArrayArray7916 != null)
            method3158(i, i_153_, i_154_, i_155_, i_156_, i_157_, i_158_, bools, class203, class244, ((Class203) class203).anIntArray2334, ((Class203) class203).anIntArray2324);
    }

    final boolean method3143(r var_r, int i, int i_159_, int i_160_, int i_161_, boolean bool) {
        return false;
    }

    final void method3141(Node_Sub42 class248_sub42, int[] is) {
        /* empty */
    }

    final void method3140(int i, int i_162_, int[] is, int[] is_163_, int[] is_164_, int[] is_165_, int[] is_166_, int[] is_167_, int[] is_168_, int[] is_169_, int[] is_170_, int[] is_171_, int[] is_172_, int i_173_, int i_174_, int i_175_, boolean bool) {
        if (aClass201ArrayArray7916 == null) {
            aClass201ArrayArray7916 = new Class201[((s) this).anInt3468][((s) this).anInt3472];
            aClass336ArrayArray7909 = new Class336[((s) this).anInt3468][((s) this).anInt3472];
        } else if (aClass350ArrayArray7917 != null || aClass213ArrayArray7910 != null)
            throw new IllegalStateException();
        boolean bool_176_ = false;
        if (is_169_.length == 2 && is_166_.length == 2 && (is_169_[0] == is_169_[1] || is_171_[0] != -1 && is_171_[0] == is_171_[1])) {
            bool_176_ = true;
            for (int i_177_ = 1; i_177_ < 2; i_177_++) {
                int i_178_ = is[is_166_[i_177_]];
                int i_179_ = is_164_[is_166_[i_177_]];
                if (i_178_ != 0 && i_178_ != ((s) this).anInt3465 || i_179_ != 0 && i_179_ != ((s) this).anInt3465) {
                    bool_176_ = false;
                    break;
                }
            }
        }
        if (!bool_176_) {
            Class336 class336 = new Class336();
            short i_180_ = (short) is.length;
            int i_181_ = (short) is_169_.length;
            ((Class336) class336).aShort3912 = i_180_;
            ((Class336) class336).aShortArray3914 = new short[i_180_];
            ((Class336) class336).aShortArray3920 = new short[i_180_];
            ((Class336) class336).aShortArray3923 = new short[i_180_];
            ((Class336) class336).aShortArray3921 = new short[i_180_];
            for (int i_182_ = 0; i_182_ < i_180_; i_182_++) {
                int i_183_ = is[i_182_];
                int i_184_ = is_164_[i_182_];
                if (i_183_ == 0 && i_184_ == 0)
                    ((Class336) class336).aShortArray3914[i_182_] = (short) (aByteArrayArray7925[i][i_162_] - aByteArrayArray7918[i][i_162_]);
                else if (i_183_ == 0 && i_184_ == ((s) this).anInt3465)
                    ((Class336) class336).aShortArray3914[i_182_] = (short) (aByteArrayArray7925[i][i_162_ + 1] - aByteArrayArray7918[i][i_162_ + 1]);
                else if (i_183_ == ((s) this).anInt3465 && i_184_ == ((s) this).anInt3465)
                    ((Class336) class336).aShortArray3914[i_182_] = (short) (aByteArrayArray7925[i + 1][i_162_ + 1] - aByteArrayArray7918[i + 1][i_162_ + 1]);
                else if (i_183_ == ((s) this).anInt3465 && i_184_ == 0)
                    ((Class336) class336).aShortArray3914[i_182_] = (short) (aByteArrayArray7925[i + 1][i_162_] - aByteArrayArray7918[i + 1][i_162_]);
                else {
                    int i_185_ = (((aByteArrayArray7925[i][i_162_] - aByteArrayArray7918[i][i_162_]) * (((s) this).anInt3465 - i_183_)) + (aByteArrayArray7925[i + 1][i_162_] - aByteArrayArray7918[i + 1][i_162_]) * i_183_);
                    int i_186_ = (((aByteArrayArray7925[i][i_162_ + 1] - aByteArrayArray7918[i][i_162_ + 1]) * (((s) this).anInt3465 - i_183_)) + ((aByteArrayArray7925[i + 1][i_162_ + 1] - aByteArrayArray7918[i + 1][i_162_ + 1]) * i_183_));
                    ((Class336) class336).aShortArray3914[i_182_] = (short) ((i_185_ * (((s) this).anInt3465 - i_184_) + i_186_ * i_184_) >> 2 * ((s) this).anInt3466);
                }
                int i_187_ = (i << ((s) this).anInt3466) + i_183_;
                int i_188_ = (i_162_ << ((s) this).anInt3466) + i_184_;
                ((Class336) class336).aShortArray3920[i_182_] = (short) i_183_;
                ((Class336) class336).aShortArray3921[i_182_] = (short) i_184_;
                ((Class336) class336).aShortArray3923[i_182_] = (short) (this.method3150((byte) 101, i_187_, i_188_) + (is_163_ != null ? is_163_[i_182_] : 0));
                if (((Class336) class336).aShortArray3914[i_182_] < 2)
                    ((Class336) class336).aShortArray3914[i_182_] = (short) 2;
            }
            boolean bool_189_ = false;
            int i_190_ = 0;
            for (int i_191_ = 0; i_191_ < i_181_; i_191_++) {
                if (is_169_[i_191_] >= 0 || is_170_ != null && is_170_[i_191_] >= 0)
                    i_190_++;
                int i_192_ = is_171_[i_191_];
                if (i_192_ != -1) {
                    Class312 class312 = ((ha) aHa_Sub1_7928).aD1414.method25(i_192_, (byte) 126);
                    if (!((Class312) class312).aBoolean3622) {
                        bool_189_ = true;
                        if (method3153(((Class312) class312).aByte3624) || ((Class312) class312).aByte3643 != 0 || ((Class312) class312).aByte3642 != 0)
                            ((Class336) class336).aByte3917 |= 0x4;
                    }
                }
            }
            ((Class336) class336).anIntArray3918 = new int[i_190_];
            if (is_170_ != null)
                ((Class336) class336).anIntArray3916 = new int[i_190_];
            ((Class336) class336).aShortArray3913 = new short[i_190_];
            ((Class336) class336).aShortArray3922 = new short[i_190_];
            ((Class336) class336).aShortArray3911 = new short[i_190_];
            if (bool_189_) {
                ((Class336) class336).aShortArray3919 = new short[i_190_];
                ((Class336) class336).aShortArray3910 = new short[i_190_];
            }
            for (int i_193_ = 0; i_193_ < i_181_; i_193_++) {
                if (is_169_[i_193_] >= 0 || is_170_ != null && is_170_[i_193_] >= 0) {
                    if (is_169_[i_193_] >= 0)
                        ((Class336) class336).anIntArray3918[((Class336) class336).aShort3915] = Class183.method1615((byte) -125, is_169_[i_193_]);
                    else
                        ((Class336) class336).anIntArray3918[((Class336) class336).aShort3915] = -1;
                    if (is_170_ != null) {
                        if (is_170_[i_193_] != -1)
                            ((Class336) class336).anIntArray3916[((Class336) class336).aShort3915] = Class183.method1615((byte) -118, is_170_[i_193_]);
                        else
                            ((Class336) class336).anIntArray3916[((Class336) class336).aShort3915] = -1;
                    }
                    ((Class336) class336).aShortArray3913[((Class336) class336).aShort3915] = (short) is_166_[i_193_];
                    ((Class336) class336).aShortArray3922[((Class336) class336).aShort3915] = (short) is_167_[i_193_];
                    ((Class336) class336).aShortArray3911[((Class336) class336).aShort3915] = (short) is_168_[i_193_];
                    if (bool_189_) {
                        if (is_171_[i_193_] != -1 && !(((Class312) ((ha) aHa_Sub1_7928).aD1414.method25(is_171_[i_193_], (byte) 124)).aBoolean3622)) {
                            ((Class336) class336).aShortArray3919[((Class336) class336).aShort3915] = (short) is_171_[i_193_];
                            ((Class336) class336).aShortArray3910[((Class336) class336).aShort3915] = (short) is_172_[i_193_];
                        } else
                            ((Class336) class336).aShortArray3919[((Class336) class336).aShort3915] = (short) -1;
                    }
                    ((Class336) class336).aShort3915++;
                }
            }
            aClass336ArrayArray7909[i][i_162_] = class336;
        } else if (is_169_[0] >= 0 || is_170_ != null && is_170_[0] >= 0) {
            Class201 class201 = new Class201();
            int i_194_ = is_169_[0];
            int i_195_ = is_171_[0];
            if (is_170_ != null) {
                ((Class201) class201).anInt2292 = (Class226_Sub1_Sub1.method1808((aByteArrayArray7925[i][i_162_] - aByteArrayArray7918[i][i_162_]), Class183.method1615((byte) -120, is_170_[0]), (byte) 80));
                if (i_194_ == -1)
                    ((Class201) class201).aByte2297 |= 0x2;
            }
            if ((((s) this).anIntArrayArray3464[i][i_162_] == ((s) this).anIntArrayArray3464[i + 1][i_162_]) && (((s) this).anIntArrayArray3464[i][i_162_] == ((s) this).anIntArrayArray3464[i + 1][i_162_ + 1]) && (((s) this).anIntArrayArray3464[i][i_162_] == ((s) this).anIntArrayArray3464[i][i_162_ + 1]))
                ((Class201) class201).aByte2297 |= 0x1;
            Class312 class312 = null;
            if (i_195_ != -1)
                class312 = ((ha) aHa_Sub1_7928).aD1414.method25(i_195_, (byte) 127);
            if (class312 != null && (((Class201) class201).aByte2297 & 0x2) == 0 && !((Class312) class312).aBoolean3622) {
                ((Class201) class201).aShort2293 = (short) (aByteArrayArray7925[i][i_162_] - aByteArrayArray7918[i][i_162_]);
                ((Class201) class201).aShort2295 = (short) (aByteArrayArray7925[i + 1][i_162_] - aByteArrayArray7918[i + 1][i_162_]);
                ((Class201) class201).aShort2298 = (short) (aByteArrayArray7925[i + 1][i_162_ + 1] - aByteArrayArray7918[i + 1][i_162_ + 1]);
                ((Class201) class201).aShort2294 = (short) (aByteArrayArray7925[i][i_162_ + 1] - aByteArrayArray7918[i][i_162_ + 1]);
                ((Class201) class201).aShort2296 = (short) i_195_;
                if (method3153(((Class312) class312).aByte3624) || ((Class312) class312).aByte3643 != 0 || ((Class312) class312).aByte3642 != 0)
                    ((Class201) class201).aByte2297 |= 0x4;
            } else {
                short i_196_ = Class183.method1615((byte) -113, i_194_);
                ((Class201) class201).aShort2293 = (short) (Class226_Sub1_Sub1.method1808((aByteArrayArray7925[i][i_162_] - aByteArrayArray7918[i][i_162_]), i_196_, (byte) 80));
                ((Class201) class201).aShort2295 = (short) (Class226_Sub1_Sub1.method1808((aByteArrayArray7925[i + 1][i_162_] - aByteArrayArray7918[i + 1][i_162_]), i_196_, (byte) 80));
                ((Class201) class201).aShort2298 = (short) (Class226_Sub1_Sub1.method1808((aByteArrayArray7925[i + 1][i_162_ + 1] - aByteArrayArray7918[i + 1][i_162_ + 1]), i_196_, (byte) 80));
                ((Class201) class201).aShort2294 = (short) (Class226_Sub1_Sub1.method1808((aByteArrayArray7925[i][i_162_ + 1] - aByteArrayArray7918[i][i_162_ + 1]), i_196_, (byte) 80));
                ((Class201) class201).aShort2296 = (short) -1;
            }
            aClass201ArrayArray7916[i][i_162_] = class201;
        }
    }

    final void YA() {
        aByteArrayArray7925 = null;
        aByteArrayArray7918 = null;
    }

    final void ka(int i, int i_197_, int i_198_) {
        if (aByteArrayArray7918[i][i_197_] < i_198_)
            aByteArrayArray7918[i][i_197_] = (byte) i_198_;
    }

    private final void method3156(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, boolean[][] bools, Class203 class203, Class244 class244, int[] is, int[] is_205_) {
        int i_206_ = (i_204_ - i_202_) * i_200_ / 256;
        int i_207_ = i_200_ >> 8;
        boolean bool = ((Class203) class203).aBoolean2316;
        aHa_Sub1_7928.C(false);
        ((Class244) class244).aBoolean2711 = false;
        ((Class244) class244).aBoolean2714 = false;
        int i_208_ = i;
        int i_209_ = i_199_ + i_206_;
        for (int i_210_ = i_201_; i_210_ < i_203_; i_210_++) {
            for (int i_211_ = i_202_; i_211_ < i_204_; i_211_++) {
                if (bools[i_210_ - i_201_][i_211_ - i_202_]) {
                    if (aClass350ArrayArray7917 != null) {
                        if (aClass350ArrayArray7917[i_210_][i_211_] != null) {
                            Class350 class350 = aClass350ArrayArray7917[i_210_][i_211_];
                            if (((Class350) class350).aShort4171 != -1 && (((Class350) class350).aByte4174 & 0x2) == 0 && ((Class350) class350).anInt4166 == 0) {
                                int i_212_ = aHa_Sub1_7928.method830(((Class350) class350).aShort4171);
                                class244.method1951((float) (i_209_ - i_207_), (float) (i_209_ - i_207_), (float) i_209_, (float) (i_208_ + i_207_), (float) i_208_, (float) (i_208_ + i_207_), 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808(((Class350) class350).anInt4167, i_212_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808(((Class350) class350).anInt4176, i_212_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808(((Class350) class350).anInt4168, i_212_, (byte) 80)));
                                class244.method1951((float) i_209_, (float) i_209_, (float) (i_209_ - i_207_), (float) i_208_, (float) (i_208_ + i_207_), (float) i_208_, 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808(((Class350) class350).anInt4172, i_212_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808(((Class350) class350).anInt4168, i_212_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808(((Class350) class350).anInt4176, i_212_, (byte) 80)));
                            } else if (((Class350) class350).anInt4166 == 0) {
                                class244.method1953((float) (i_209_ - i_207_), (float) (i_209_ - i_207_), (float) i_209_, (float) (i_208_ + i_207_), (float) i_208_, (float) (i_208_ + i_207_), 100.0F, 100.0F, 100.0F, ((Class350) class350).anInt4167, ((Class350) class350).anInt4176, ((Class350) class350).anInt4168);
                                class244.method1953((float) i_209_, (float) i_209_, (float) (i_209_ - i_207_), (float) i_208_, (float) (i_208_ + i_207_), (float) i_208_, 100.0F, 100.0F, 100.0F, ((Class350) class350).anInt4172, ((Class350) class350).anInt4168, ((Class350) class350).anInt4176);
                            } else {
                                int i_213_ = ((Class350) class350).anInt4166;
                                class244.method1953((float) (i_209_ - i_207_), (float) (i_209_ - i_207_), (float) i_209_, (float) (i_208_ + i_207_), (float) i_208_, (float) (i_208_ + i_207_), 100.0F, 100.0F, 100.0F, (Node_Sub11_Sub1.method2254(i_213_, (((Class350) class350).anInt4167 & ~0xffffff), false)), (Node_Sub11_Sub1.method2254(i_213_, (((Class350) class350).anInt4176 & ~0xffffff), false)), (Node_Sub11_Sub1.method2254(i_213_, (((Class350) class350).anInt4168 & ~0xffffff), false)));
                                class244.method1953((float) i_209_, (float) i_209_, (float) (i_209_ - i_207_), (float) i_208_, (float) (i_208_ + i_207_), (float) i_208_, 100.0F, 100.0F, 100.0F, (Node_Sub11_Sub1.method2254(i_213_, (((Class350) class350).anInt4172 & ~0xffffff), false)), (Node_Sub11_Sub1.method2254(i_213_, (((Class350) class350).anInt4168 & ~0xffffff), false)), (Node_Sub11_Sub1.method2254(i_213_, (((Class350) class350).anInt4176 & ~0xffffff), false)));
                            }
                        } else if (aClass62ArrayArray7927[i_210_][i_211_] != null) {
                            Class62 class62 = aClass62ArrayArray7927[i_210_][i_211_];
                            for (int i_214_ = 0; i_214_ < ((Class62) class62).aShort842; i_214_++) {
                                is[i_214_] = i_208_ + ((((Class62) class62).aShortArray845[i_214_]) * i_207_ / ((s) this).anInt3465);
                                is_205_[i_214_] = i_209_ - ((((Class62) class62).aShortArray840[i_214_]) * i_207_ / ((s) this).anInt3465);
                            }
                            for (int i_215_ = 0; i_215_ < ((Class62) class62).aShort838; i_215_++) {
                                int i_216_ = i_215_ * 3;
                                int i_217_ = i_216_ + 1;
                                int i_218_ = i_217_ + 1;
                                int i_219_ = is[i_216_];
                                int i_220_ = is[i_217_];
                                int i_221_ = is[i_218_];
                                int i_222_ = is_205_[i_216_];
                                int i_223_ = is_205_[i_217_];
                                int i_224_ = is_205_[i_218_];
                                if (((Class62) class62).anIntArray843 != null && (((Class62) class62).anIntArray843[i_215_]) != 0 && ((((Class62) class62).aShortArray841 == null) || ((((Class62) class62).aShortArray841 != null) && ((((Class62) class62).aShortArray841[i_215_]) == -1)))) {
                                    int i_225_ = (((Class62) class62).anIntArray843[i_215_]);
                                    class244.method1953((float) i_222_, (float) i_223_, (float) i_224_, (float) i_219_, (float) i_220_, (float) i_221_, 100.0F, 100.0F, 100.0F, (Node_Sub11_Sub1.method2254(i_225_, -16777216 - ((((Class62) class62).anIntArray847[i_216_]) & ~0xffffff), false)), (Node_Sub11_Sub1.method2254(i_225_, -16777216 - ((((Class62) class62).anIntArray847[i_217_]) & ~0xffffff), false)), (Node_Sub11_Sub1.method2254(i_225_, -16777216 - ((((Class62) class62).anIntArray847[i_218_]) & ~0xffffff), false)));
                                } else if ((((Class62) class62).aShortArray841 != null) && ((((Class62) class62).aShortArray841[i_215_]) != -1)) {
                                    int i_226_ = (aHa_Sub1_7928.method830(((Class62) class62).aShortArray841[i_215_]));
                                    class244.method1951((float) i_222_, (float) i_223_, (float) i_224_, (float) i_219_, (float) i_220_, (float) i_221_, 100.0F, 100.0F, 100.0F, (float) i_226_, (float) i_226_, (float) i_226_);
                                } else
                                    class244.method1953((float) i_222_, (float) i_223_, (float) i_224_, (float) i_219_, (float) i_220_, (float) i_221_, 100.0F, 100.0F, 100.0F, (((Class62) class62).anIntArray847[i_216_]), (((Class62) class62).anIntArray847[i_217_]), (((Class62) class62).anIntArray847[i_218_]));
                            }
                        }
                    } else if (aClass213ArrayArray7910[i_210_][i_211_] != null) {
                        Class213 class213 = aClass213ArrayArray7910[i_210_][i_211_];
                        for (int i_227_ = 0; i_227_ < ((Class213) class213).aShort2463; i_227_++) {
                            is[i_227_] = i_208_ + ((((Class213) class213).aShortArray2467[i_227_]) * i_207_ / ((s) this).anInt3465);
                            is_205_[i_227_] = i_209_ - ((((Class213) class213).aShortArray2466[i_227_]) * i_207_ / ((s) this).anInt3465);
                        }
                        for (int i_228_ = 0; i_228_ < ((Class213) class213).aShort2462; i_228_++) {
                            int i_229_ = i_228_ * 3;
                            int i_230_ = i_229_ + 1;
                            int i_231_ = i_230_ + 1;
                            int i_232_ = is[i_229_];
                            int i_233_ = is[i_230_];
                            int i_234_ = is[i_231_];
                            int i_235_ = is_205_[i_229_];
                            int i_236_ = is_205_[i_230_];
                            int i_237_ = is_205_[i_231_];
                            if (((Class213) class213).anIntArray2460 != null && (((Class213) class213).anIntArray2460[i_228_]) != 0) {
                                int i_238_ = (((Class213) class213).anIntArray2460[i_228_]);
                                class244.method1953((float) i_235_, (float) i_236_, (float) i_237_, (float) i_232_, (float) i_233_, (float) i_234_, 100.0F, 100.0F, 100.0F, i_238_, i_238_, i_238_);
                            } else
                                class244.method1953((float) i_235_, (float) i_236_, (float) i_237_, (float) i_232_, (float) i_233_, (float) i_234_, 100.0F, 100.0F, 100.0F, (((Class213) class213).anIntArray2459[i_229_]), (((Class213) class213).anIntArray2459[i_230_]), (((Class213) class213).anIntArray2459[i_231_]));
                        }
                    }
                }
                i_209_ -= i_207_;
            }
            i_209_ = i_199_ + i_206_;
            i_208_ += i_207_;
        }
        ((Class244) class244).aBoolean2711 = true;
        aHa_Sub1_7928.C(bool);
    }

    private final void method3157(int i, int i_239_, boolean bool, Class203 class203, Class244 class244, int[] is, int[] is_240_, int[] is_241_, int[] is_242_, int i_243_) {
        Class350 class350 = aClass350ArrayArray7917[i][i_239_];
        if (class350 != null) {
            if ((((Class350) class350).aByte4174 & 0x2) == 0) {
                if (i_243_ != 0) {
                    if ((((Class350) class350).aByte4174 & 0x4) != 0) {
                        if ((i_243_ & 0x1) != 0)
                            return;
                    } else if ((i_243_ & 0x2) != 0)
                        return;
                }
                int i_244_ = i * ((s) this).anInt3465;
                int i_245_ = i_244_ + ((s) this).anInt3465;
                int i_246_ = i_239_ * ((s) this).anInt3465;
                int i_247_ = i_246_ + ((s) this).anInt3465;
                int i_248_ = 0;
                int i_249_ = 0;
                int i_250_ = 0;
                int i_251_ = 0;
                float f;
                float f_252_;
                float f_253_;
                float f_254_;
                int i_255_;
                int i_256_;
                int i_257_;
                int i_258_;
                int i_259_;
                int i_260_;
                int i_261_;
                int i_262_;
                if ((((Class350) class350).aByte4174 & 0x1) != 0 && !bool) {
                    int i_263_ = ((s) this).anIntArrayArray3464[i][i_239_];
                    float f_264_ = aFloat7922 * (float) i_263_;
                    if (anInt7923 == -1) {
                        f = aFloat7921 + (aFloat7914 * (float) i_244_ + f_264_ + aFloat7920 * (float) i_246_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_252_ = aFloat7921 + (aFloat7914 * (float) i_245_ + f_264_ + aFloat7920 * (float) i_246_);
                        if (f_252_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_253_ = aFloat7921 + (aFloat7914 * (float) i_245_ + f_264_ + aFloat7920 * (float) i_247_);
                        if (f_253_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_254_ = aFloat7921 + (aFloat7914 * (float) i_244_ + f_264_ + aFloat7920 * (float) i_247_);
                        if (f_254_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                    } else {
                        f = aFloat7921 + (aFloat7914 * (float) i_244_ + f_264_ + aFloat7920 * (float) i_246_);
                        f_252_ = aFloat7921 + (aFloat7914 * (float) i_245_ + f_264_ + aFloat7920 * (float) i_246_);
                        f_253_ = aFloat7921 + (aFloat7914 * (float) i_245_ + f_264_ + aFloat7920 * (float) i_247_);
                        f_254_ = aFloat7921 + (aFloat7914 * (float) i_244_ + f_264_ + aFloat7920 * (float) i_247_);
                    }
                    if (((Class203) class203).aBoolean2315) {
                        int i_265_ = (int) (f - (float) (((Class203) class203).anInt2312));
                        if (i_265_ > 0) {
                            i_248_ = i_265_;
                            if (i_248_ > 255)
                                i_248_ = 255;
                        }
                        i_265_ = (int) (f_252_ - (float) (((Class203) class203).anInt2312));
                        if (i_265_ > 0) {
                            i_249_ = i_265_;
                            if (i_249_ > 255)
                                i_249_ = 255;
                        }
                        i_265_ = (int) (f_253_ - (float) (((Class203) class203).anInt2312));
                        if (i_265_ > 0) {
                            i_250_ = i_265_;
                            if (i_250_ > 255)
                                i_250_ = 255;
                        }
                        i_265_ = (int) (f_254_ - (float) (((Class203) class203).anInt2312));
                        if (i_265_ > 0) {
                            i_251_ = i_265_;
                            if (i_251_ > 255)
                                i_251_ = 255;
                        }
                    }
                    float f_266_ = aFloat7913 * (float) i_263_;
                    float f_267_ = aFloat7924 * (float) i_263_;
                    if (anInt7923 == -1) {
                        float f_268_ = (aFloat7907 + (aFloat7919 * (float) i_244_ + f_266_ + aFloat7926 * (float) i_246_));
                        i_255_ = (((Class244) class244).anInt2712 + (int) (f_268_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        float f_269_ = (aFloat7915 + (aFloat7908 * (float) i_244_ + f_267_ + aFloat7911 * (float) i_246_));
                        i_256_ = (((Class244) class244).anInt2715 + (int) (f_269_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        float f_270_ = (aFloat7907 + (aFloat7919 * (float) i_245_ + f_266_ + aFloat7926 * (float) i_246_));
                        i_257_ = (((Class244) class244).anInt2712 + (int) (f_270_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_252_));
                        float f_271_ = (aFloat7915 + (aFloat7908 * (float) i_245_ + f_267_ + aFloat7911 * (float) i_246_));
                        i_258_ = (((Class244) class244).anInt2715 + (int) (f_271_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_252_));
                        float f_272_ = (aFloat7907 + (aFloat7919 * (float) i_245_ + f_266_ + aFloat7926 * (float) i_247_));
                        i_259_ = (((Class244) class244).anInt2712 + (int) (f_272_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_253_));
                        float f_273_ = (aFloat7915 + (aFloat7908 * (float) i_245_ + f_267_ + aFloat7911 * (float) i_247_));
                        i_260_ = (((Class244) class244).anInt2715 + (int) (f_273_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_253_));
                        float f_274_ = (aFloat7907 + (aFloat7919 * (float) i_244_ + f_266_ + aFloat7926 * (float) i_247_));
                        i_261_ = (((Class244) class244).anInt2712 + (int) (f_274_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_254_));
                        float f_275_ = (aFloat7915 + (aFloat7908 * (float) i_244_ + f_267_ + aFloat7911 * (float) i_247_));
                        i_262_ = (((Class244) class244).anInt2715 + (int) (f_275_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_254_));
                    } else {
                        float f_276_ = (aFloat7907 + (aFloat7919 * (float) i_244_ + f_266_ + aFloat7926 * (float) i_246_));
                        i_255_ = (((Class244) class244).anInt2712 + (int) (f_276_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_277_ = (aFloat7915 + (aFloat7908 * (float) i_244_ + f_267_ + aFloat7911 * (float) i_246_));
                        i_256_ = (((Class244) class244).anInt2715 + (int) (f_277_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_278_ = (aFloat7907 + (aFloat7919 * (float) i_245_ + f_266_ + aFloat7926 * (float) i_246_));
                        i_257_ = (((Class244) class244).anInt2712 + (int) (f_278_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_279_ = (aFloat7915 + (aFloat7908 * (float) i_245_ + f_267_ + aFloat7911 * (float) i_246_));
                        i_258_ = (((Class244) class244).anInt2715 + (int) (f_279_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_280_ = (aFloat7907 + (aFloat7919 * (float) i_245_ + f_266_ + aFloat7926 * (float) i_247_));
                        i_259_ = (((Class244) class244).anInt2712 + (int) (f_280_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_281_ = (aFloat7915 + (aFloat7908 * (float) i_245_ + f_267_ + aFloat7911 * (float) i_247_));
                        i_260_ = (((Class244) class244).anInt2715 + (int) (f_281_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_282_ = (aFloat7907 + (aFloat7919 * (float) i_244_ + f_266_ + aFloat7926 * (float) i_247_));
                        i_261_ = (((Class244) class244).anInt2712 + (int) (f_282_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_283_ = (aFloat7915 + (aFloat7908 * (float) i_244_ + f_267_ + aFloat7911 * (float) i_247_));
                        i_262_ = (((Class244) class244).anInt2715 + (int) (f_283_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                    }
                } else {
                    int i_284_ = ((s) this).anIntArrayArray3464[i][i_239_];
                    int i_285_ = ((s) this).anIntArrayArray3464[i + 1][i_239_];
                    int i_286_ = ((s) this).anIntArrayArray3464[i + 1][i_239_ + 1];
                    int i_287_ = ((s) this).anIntArrayArray3464[i][i_239_ + 1];
                    if (anInt7923 == -1) {
                        f = aFloat7921 + (aFloat7914 * (float) i_244_ + aFloat7922 * (float) i_284_ + aFloat7920 * (float) i_246_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_252_ = aFloat7921 + (aFloat7914 * (float) i_245_ + aFloat7922 * (float) i_285_ + aFloat7920 * (float) i_246_);
                        if (f_252_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_253_ = aFloat7921 + (aFloat7914 * (float) i_245_ + aFloat7922 * (float) i_286_ + aFloat7920 * (float) i_247_);
                        if (f_253_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        f_254_ = aFloat7921 + (aFloat7914 * (float) i_244_ + aFloat7922 * (float) i_287_ + aFloat7920 * (float) i_247_);
                        if (f_254_ <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                    } else {
                        f = aFloat7921 + (aFloat7914 * (float) i_244_ + aFloat7922 * (float) i_284_ + aFloat7920 * (float) i_246_);
                        f_252_ = aFloat7921 + (aFloat7914 * (float) i_245_ + aFloat7922 * (float) i_285_ + aFloat7920 * (float) i_246_);
                        f_253_ = aFloat7921 + (aFloat7914 * (float) i_245_ + aFloat7922 * (float) i_286_ + aFloat7920 * (float) i_247_);
                        f_254_ = aFloat7921 + (aFloat7914 * (float) i_244_ + aFloat7922 * (float) i_287_ + aFloat7920 * (float) i_247_);
                    }
                    if (bool) {
                        int i_288_ = (int) (f - (float) (((Class203) class203).anInt2312));
                        if (i_288_ > 255)
                            i_288_ = 255;
                        if (i_288_ > 0) {
                            i_248_ = i_288_;
                            int i_289_ = (((Class350) class350).aShort4175 * i_288_ / 255);
                            if (i_289_ > 0)
                                i_284_ -= i_289_;
                        }
                        i_288_ = (int) (f_252_ - (float) (((Class203) class203).anInt2312));
                        if (i_288_ > 255)
                            i_288_ = 255;
                        if (i_288_ > 0) {
                            i_249_ = i_288_;
                            int i_290_ = (((Class350) class350).aShort4173 * i_288_ / 255);
                            if (i_290_ > 0)
                                i_285_ -= i_290_;
                        }
                        i_288_ = (int) (f_253_ - (float) (((Class203) class203).anInt2312));
                        if (i_288_ > 255)
                            i_288_ = 255;
                        if (i_288_ > 0) {
                            i_250_ = i_288_;
                            int i_291_ = (((Class350) class350).aShort4169 * i_288_ / 255);
                            if (i_291_ > 0)
                                i_286_ -= i_291_;
                        }
                        i_288_ = (int) (f_254_ - (float) (((Class203) class203).anInt2312));
                        if (i_288_ > 255)
                            i_288_ = 255;
                        if (i_288_ > 0) {
                            i_251_ = i_288_;
                            int i_292_ = (((Class350) class350).aShort4170 * i_288_ / 255);
                            if (i_292_ > 0)
                                i_287_ -= i_292_;
                        }
                    } else if (((Class203) class203).aBoolean2315) {
                        int i_293_ = (int) (f - (float) (((Class203) class203).anInt2312));
                        if (i_293_ > 0) {
                            i_248_ = i_293_;
                            if (i_248_ > 255)
                                i_248_ = 255;
                        }
                        i_293_ = (int) (f_252_ - (float) (((Class203) class203).anInt2312));
                        if (i_293_ > 0) {
                            i_249_ = i_293_;
                            if (i_249_ > 255)
                                i_249_ = 255;
                        }
                        i_293_ = (int) (f_253_ - (float) (((Class203) class203).anInt2312));
                        if (i_293_ > 0) {
                            i_250_ = i_293_;
                            if (i_250_ > 255)
                                i_250_ = 255;
                        }
                        i_293_ = (int) (f_254_ - (float) (((Class203) class203).anInt2312));
                        if (i_293_ > 0) {
                            i_251_ = i_293_;
                            if (i_251_ > 255)
                                i_251_ = 255;
                        }
                    }
                    if (anInt7923 == -1) {
                        float f_294_ = aFloat7907 + (aFloat7919 * (float) i_244_ + aFloat7913 * (float) i_284_ + aFloat7926 * (float) i_246_);
                        i_255_ = (((Class244) class244).anInt2712 + (int) (f_294_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        float f_295_ = aFloat7915 + (aFloat7908 * (float) i_244_ + aFloat7924 * (float) i_284_ + aFloat7911 * (float) i_246_);
                        i_256_ = (((Class244) class244).anInt2715 + (int) (f_295_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        float f_296_ = aFloat7907 + (aFloat7919 * (float) i_245_ + aFloat7913 * (float) i_285_ + aFloat7926 * (float) i_246_);
                        i_257_ = (((Class244) class244).anInt2712 + (int) (f_296_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_252_));
                        float f_297_ = aFloat7915 + (aFloat7908 * (float) i_245_ + aFloat7924 * (float) i_285_ + aFloat7911 * (float) i_246_);
                        i_258_ = (((Class244) class244).anInt2715 + (int) (f_297_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_252_));
                        float f_298_ = aFloat7907 + (aFloat7919 * (float) i_245_ + aFloat7913 * (float) i_286_ + aFloat7926 * (float) i_247_);
                        i_259_ = (((Class244) class244).anInt2712 + (int) (f_298_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_253_));
                        float f_299_ = aFloat7915 + (aFloat7908 * (float) i_245_ + aFloat7924 * (float) i_286_ + aFloat7911 * (float) i_247_);
                        i_260_ = (((Class244) class244).anInt2715 + (int) (f_299_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_253_));
                        float f_300_ = aFloat7907 + (aFloat7919 * (float) i_244_ + aFloat7913 * (float) i_287_ + aFloat7926 * (float) i_247_);
                        i_261_ = (((Class244) class244).anInt2712 + (int) (f_300_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f_254_));
                        float f_301_ = aFloat7915 + (aFloat7908 * (float) i_244_ + aFloat7924 * (float) i_287_ + aFloat7911 * (float) i_247_);
                        i_262_ = (((Class244) class244).anInt2715 + (int) (f_301_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f_254_));
                    } else {
                        float f_302_ = aFloat7907 + (aFloat7919 * (float) i_244_ + aFloat7913 * (float) i_284_ + aFloat7926 * (float) i_246_);
                        i_255_ = (((Class244) class244).anInt2712 + (int) (f_302_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_303_ = aFloat7915 + (aFloat7908 * (float) i_244_ + aFloat7924 * (float) i_284_ + aFloat7911 * (float) i_246_);
                        i_256_ = (((Class244) class244).anInt2715 + (int) (f_303_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_304_ = aFloat7907 + (aFloat7919 * (float) i_245_ + aFloat7913 * (float) i_285_ + aFloat7926 * (float) i_246_);
                        i_257_ = (((Class244) class244).anInt2712 + (int) (f_304_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_305_ = aFloat7915 + (aFloat7908 * (float) i_245_ + aFloat7924 * (float) i_285_ + aFloat7911 * (float) i_246_);
                        i_258_ = (((Class244) class244).anInt2715 + (int) (f_305_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_306_ = aFloat7907 + (aFloat7919 * (float) i_245_ + aFloat7913 * (float) i_286_ + aFloat7926 * (float) i_247_);
                        i_259_ = (((Class244) class244).anInt2712 + (int) (f_306_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_307_ = aFloat7915 + (aFloat7908 * (float) i_245_ + aFloat7924 * (float) i_286_ + aFloat7911 * (float) i_247_);
                        i_260_ = (((Class244) class244).anInt2715 + (int) (f_307_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        float f_308_ = aFloat7907 + (aFloat7919 * (float) i_244_ + aFloat7913 * (float) i_287_ + aFloat7926 * (float) i_247_);
                        i_261_ = (((Class244) class244).anInt2712 + (int) (f_308_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        float f_309_ = aFloat7915 + (aFloat7908 * (float) i_244_ + aFloat7924 * (float) i_287_ + aFloat7911 * (float) i_247_);
                        i_262_ = (((Class244) class244).anInt2715 + (int) (f_309_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                    }
                }
                boolean bool_310_ = (((Class350) class350).aShort4171 != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(((Class350) class350).aShort4171, (byte) 125))).aByte3624));
                if (anInt7923 == -1) {
                    int i_311_ = i_249_ + i_250_ + i_251_;
                    if (((i_259_ - i_261_) * (i_258_ - i_262_) - (i_260_ - i_262_) * (i_257_ - i_261_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_259_ < 0 || i_261_ < 0 || i_257_ < 0 || i_259_ > ((Class244) class244).anInt2713 || i_261_ > ((Class244) class244).anInt2713 || i_257_ > ((Class244) class244).anInt2713);
                        if (i_311_ < 765) {
                            if (i_311_ > 0) {
                                if (((Class350) class350).aShort4171 >= 0) {
                                    int i_312_ = -16777216;
                                    if (bool_310_)
                                        i_312_ = -1694498816;
                                    class244.method1948((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, f_253_, f_254_, f_252_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_312_ | (((Class350) class350).anInt4167) & 0xffffff, i_312_ | (((Class350) class350).anInt4176) & 0xffffff, i_312_ | (((Class350) class350).anInt4168) & 0xffffff, ((Class203) class203).anInt2303, i_250_, i_251_, i_249_, ((Class350) class350).aShort4171);
                                } else {
                                    if (bool_310_)
                                        ((Class244) class244).anInt2718 = 100;
                                    class244.method1953((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, (float) (int) f_253_, (float) (int) f_254_, (float) (int) f_252_, (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4167, (i_250_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4176, (i_251_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4168, (i_249_ << 24 | ((Class203) class203).anInt2303), false)));
                                    ((Class244) class244).anInt2718 = 0;
                                }
                            } else if (((Class350) class350).aShort4171 >= 0) {
                                int i_313_ = -16777216;
                                if (bool_310_)
                                    i_313_ = -1694498816;
                                class244.method1948((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, f_253_, f_254_, f_252_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_313_ | (((Class350) class350).anInt4167 & 0xffffff), i_313_ | (((Class350) class350).anInt4176 & 0xffffff), i_313_ | (((Class350) class350).anInt4168 & 0xffffff), 0, 0, 0, 0, ((Class350) class350).aShort4171);
                            } else {
                                if (bool_310_)
                                    ((Class244) class244).anInt2718 = 100;
                                class244.method1953((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, (float) (int) f_253_, (float) (int) f_254_, (float) (int) f_252_, ((Class350) class350).anInt4167, ((Class350) class350).anInt4176, ((Class350) class350).anInt4168);
                                ((Class244) class244).anInt2718 = 0;
                            }
                        } else
                            class244.method1949((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, (float) (int) f_253_, (float) (int) f_254_, (float) (int) f_252_, (((Class203) class203).anInt2303));
                    }
                    i_311_ = i_248_ + i_249_ + i_251_;
                    if (((i_255_ - i_257_) * (i_262_ - i_258_) - (i_256_ - i_258_) * (i_261_ - i_257_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_255_ < 0 || i_257_ < 0 || i_261_ < 0 || i_255_ > ((Class244) class244).anInt2713 || i_257_ > ((Class244) class244).anInt2713 || i_261_ > ((Class244) class244).anInt2713);
                        if (i_311_ < 765) {
                            if (bool_310_)
                                ((Class244) class244).anInt2718 = -1694498816;
                            if (i_311_ > 0) {
                                if (((Class350) class350).aShort4171 >= 0) {
                                    int i_314_ = -16777216;
                                    if (bool_310_)
                                        i_314_ = -1694498816;
                                    class244.method1948((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, f, f_252_, f_254_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_314_ | (((Class350) class350).anInt4172) & 0xffffff, i_314_ | (((Class350) class350).anInt4168) & 0xffffff, i_314_ | (((Class350) class350).anInt4176) & 0xffffff, ((Class203) class203).anInt2303, i_248_, i_249_, i_251_, ((Class350) class350).aShort4171);
                                } else {
                                    if (bool_310_)
                                        ((Class244) class244).anInt2718 = 100;
                                    class244.method1953((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, (float) (int) f, (float) (int) f_252_, (float) (int) f_254_, (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4172, (i_248_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4168, (i_249_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4176, (i_251_ << 24 | ((Class203) class203).anInt2303), false)));
                                    ((Class244) class244).anInt2718 = 0;
                                }
                            } else if (((Class350) class350).aShort4171 >= 0) {
                                int i_315_ = -16777216;
                                if (bool_310_)
                                    i_315_ = -1694498816;
                                class244.method1948((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, f, f_252_, f_254_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_315_ | (((Class350) class350).anInt4172 & 0xffffff), i_315_ | (((Class350) class350).anInt4168 & 0xffffff), i_315_ | (((Class350) class350).anInt4176 & 0xffffff), 0, 0, 0, 0, ((Class350) class350).aShort4171);
                            } else {
                                if (bool_310_)
                                    ((Class244) class244).anInt2718 = 100;
                                class244.method1953((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, (float) (int) f, (float) (int) f_252_, (float) (int) f_254_, ((Class350) class350).anInt4172, ((Class350) class350).anInt4168, ((Class350) class350).anInt4176);
                                ((Class244) class244).anInt2718 = 0;
                            }
                        } else
                            class244.method1949((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, (float) (int) f, (float) (int) f_252_, (float) (int) f_254_, (((Class203) class203).anInt2303));
                    }
                } else {
                    int i_316_ = i_249_ + i_250_ + i_251_;
                    if (((i_259_ - i_261_) * (i_258_ - i_262_) - (i_260_ - i_262_) * (i_257_ - i_261_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_259_ < 0 || i_261_ < 0 || i_257_ < 0 || i_259_ > ((Class244) class244).anInt2713 || i_261_ > ((Class244) class244).anInt2713 || i_257_ > ((Class244) class244).anInt2713);
                        if (i_316_ < 765) {
                            if (bool_310_)
                                ((Class244) class244).anInt2718 = -1694498816;
                            if (i_316_ > 0) {
                                if (((Class350) class350).aShort4171 >= 0) {
                                    int i_317_ = -16777216;
                                    if (bool_310_)
                                        i_317_ = -1694498816;
                                    class244.method1948((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, f_253_, f_254_, f_252_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_317_ | (((Class350) class350).anInt4167) & 0xffffff, i_317_ | (((Class350) class350).anInt4176) & 0xffffff, i_317_ | (((Class350) class350).anInt4168) & 0xffffff, ((Class203) class203).anInt2303, i_250_, i_251_, i_249_, ((Class350) class350).aShort4171);
                                } else {
                                    if (bool_310_)
                                        ((Class244) class244).anInt2718 = 100;
                                    class244.method1953((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, (float) (int) f_253_, (float) (int) f_254_, (float) (int) f_252_, (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4167, (i_250_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4176, (i_251_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4168, (i_249_ << 24 | ((Class203) class203).anInt2303), false)));
                                    ((Class244) class244).anInt2718 = 0;
                                }
                            } else if (((Class350) class350).aShort4171 >= 0) {
                                int i_318_ = -16777216;
                                if (bool_310_)
                                    i_318_ = -1694498816;
                                class244.method1948((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, f_253_, f_254_, f_252_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_318_ | (((Class350) class350).anInt4167 & 0xffffff), i_318_ | (((Class350) class350).anInt4176 & 0xffffff), i_318_ | (((Class350) class350).anInt4168 & 0xffffff), 0, 0, 0, 0, ((Class350) class350).aShort4171);
                            } else {
                                if (bool_310_)
                                    ((Class244) class244).anInt2718 = 100;
                                class244.method1953((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, (float) (int) f_253_, (float) (int) f_254_, (float) (int) f_252_, ((Class350) class350).anInt4167, ((Class350) class350).anInt4176, ((Class350) class350).anInt4168);
                                ((Class244) class244).anInt2718 = 0;
                            }
                        } else
                            class244.method1949((float) i_260_, (float) i_262_, (float) i_258_, (float) i_259_, (float) i_261_, (float) i_257_, (float) (int) f_253_, (float) (int) f_254_, (float) (int) f_252_, (((Class203) class203).anInt2303));
                    }
                    i_316_ = i_248_ + i_249_ + i_251_;
                    if (((i_255_ - i_257_) * (i_262_ - i_258_) - (i_256_ - i_258_) * (i_261_ - i_257_)) > 0) {
                        ((Class244) class244).aBoolean2723 = (i_255_ < 0 || i_257_ < 0 || i_261_ < 0 || i_255_ > ((Class244) class244).anInt2713 || i_257_ > ((Class244) class244).anInt2713 || i_261_ > ((Class244) class244).anInt2713);
                        if (i_316_ < 765) {
                            if (bool_310_)
                                ((Class244) class244).anInt2718 = -1694498816;
                            if (i_316_ > 0) {
                                if (((Class350) class350).aShort4171 >= 0) {
                                    int i_319_ = -16777216;
                                    if (bool_310_)
                                        i_319_ = -1694498816;
                                    class244.method1948((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, f, f_252_, f_254_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_319_ | (((Class350) class350).anInt4172) & 0xffffff, i_319_ | (((Class350) class350).anInt4168) & 0xffffff, i_319_ | (((Class350) class350).anInt4176) & 0xffffff, ((Class203) class203).anInt2303, i_248_, i_249_, i_251_, ((Class350) class350).aShort4171);
                                } else {
                                    if (bool_310_)
                                        ((Class244) class244).anInt2718 = 100;
                                    class244.method1953((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, (float) (int) f, (float) (int) f_252_, (float) (int) f_254_, (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4172, (i_248_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4168, (i_249_ << 24 | ((Class203) class203).anInt2303), false)), (Node_Sub11_Sub1.method2254(((Class350) class350).anInt4176, (i_251_ << 24 | ((Class203) class203).anInt2303), false)));
                                    ((Class244) class244).anInt2718 = 0;
                                }
                            } else if (((Class350) class350).aShort4171 >= 0) {
                                int i_320_ = -16777216;
                                if (bool_310_)
                                    i_320_ = -1694498816;
                                class244.method1948((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, f, f_252_, f_254_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_320_ | (((Class350) class350).anInt4172 & 0xffffff), i_320_ | (((Class350) class350).anInt4168 & 0xffffff), i_320_ | (((Class350) class350).anInt4176 & 0xffffff), 0, 0, 0, 0, ((Class350) class350).aShort4171);
                            } else {
                                if (bool_310_)
                                    ((Class244) class244).anInt2718 = 100;
                                class244.method1953((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, (float) (int) f, (float) (int) f_252_, (float) (int) f_254_, ((Class350) class350).anInt4172, ((Class350) class350).anInt4168, ((Class350) class350).anInt4176);
                                ((Class244) class244).anInt2718 = 0;
                            }
                        } else
                            class244.method1949((float) i_256_, (float) i_258_, (float) i_262_, (float) i_255_, (float) i_257_, (float) i_261_, (float) (int) f, (float) (int) f_252_, (float) (int) f_254_, (((Class203) class203).anInt2303));
                    }
                }
            }
        } else {
            Class62 class62 = aClass62ArrayArray7927[i][i_239_];
            if (class62 != null) {
                if (i_243_ != 0) {
                    if ((((Class62) class62).aByte846 & 0x4) != 0) {
                        if ((i_243_ & 0x1) != 0)
                            return;
                    } else if ((i_243_ & 0x2) != 0)
                        return;
                }
                if (anInt7923 == -1) {
                    for (int i_321_ = 0; i_321_ < ((Class62) class62).aShort842; i_321_++) {
                        int i_322_ = (((Class62) class62).aShortArray845[i_321_] + (i << ((s) this).anInt3466));
                        int i_323_ = ((Class62) class62).aShortArray839[i_321_];
                        int i_324_ = (((Class62) class62).aShortArray840[i_321_] + (i_239_ << ((s) this).anInt3466));
                        float f = aFloat7921 + (aFloat7914 * (float) i_322_ + aFloat7922 * (float) i_323_ + aFloat7920 * (float) i_324_);
                        if (f <= (float) ((ha_Sub1) aHa_Sub1_7928).anInt5568)
                            return;
                        is_242_[i_321_] = 0;
                        if (bool) {
                            int i_325_ = (int) (f - (float) (((Class203) class203).anInt2312));
                            if (i_325_ > 255)
                                i_325_ = 255;
                            if (i_325_ > 0) {
                                is_242_[i_321_] = i_325_;
                                int i_326_ = ((((Class62) class62).aShortArray844[i_321_]) * i_325_ / 255);
                                if (i_326_ > 0)
                                    i_323_ -= i_326_;
                            }
                        } else if (((Class203) class203).aBoolean2315) {
                            int i_327_ = (int) (f - (float) (((Class203) class203).anInt2312));
                            if (i_327_ > 0) {
                                is_242_[i_321_] = i_327_;
                                if (is_242_[i_321_] > 255)
                                    is_242_[i_321_] = 255;
                            }
                        }
                        float f_328_ = aFloat7907 + (aFloat7919 * (float) i_322_ + aFloat7913 * (float) i_323_ + aFloat7926 * (float) i_324_);
                        float f_329_ = aFloat7915 + (aFloat7908 * (float) i_322_ + aFloat7924 * (float) i_323_ + aFloat7911 * (float) i_324_);
                        is[i_321_] = (((Class244) class244).anInt2712 + (int) (f_328_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / f));
                        is_240_[i_321_] = (((Class244) class244).anInt2715 + (int) (f_329_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / f));
                        is_241_[i_321_] = (int) f;
                    }
                } else {
                    for (int i_330_ = 0; i_330_ < ((Class62) class62).aShort842; i_330_++) {
                        int i_331_ = (((Class62) class62).aShortArray845[i_330_] + (i << ((s) this).anInt3466));
                        int i_332_ = ((Class62) class62).aShortArray839[i_330_];
                        int i_333_ = (((Class62) class62).aShortArray840[i_330_] + (i_239_ << ((s) this).anInt3466));
                        float f = aFloat7921 + (aFloat7914 * (float) i_331_ + aFloat7922 * (float) i_332_ + aFloat7920 * (float) i_333_);
                        is_242_[i_330_] = 0;
                        if (bool) {
                            int i_334_ = anInt7923 - ((Class203) class203).anInt2312;
                            if (i_334_ > 255)
                                i_334_ = 255;
                            if (i_334_ > 0) {
                                is_242_[i_330_] = i_334_;
                                int i_335_ = ((((Class62) class62).aShortArray844[i_330_]) * i_334_ / 255);
                                if (i_335_ > 0)
                                    i_332_ -= i_335_;
                            }
                        } else if (((Class203) class203).aBoolean2315) {
                            int i_336_ = anInt7923 - ((Class203) class203).anInt2312;
                            if (i_336_ > 0) {
                                is_242_[i_330_] = i_336_;
                                if (is_242_[i_330_] > 255)
                                    is_242_[i_330_] = 255;
                            }
                        }
                        float f_337_ = aFloat7907 + (aFloat7919 * (float) i_331_ + aFloat7913 * (float) i_332_ + aFloat7926 * (float) i_333_);
                        float f_338_ = aFloat7915 + (aFloat7908 * (float) i_331_ + aFloat7924 * (float) i_332_ + aFloat7911 * (float) i_333_);
                        is[i_330_] = (((Class244) class244).anInt2712 + (int) (f_337_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5550) / (float) anInt7923));
                        is_240_[i_330_] = (((Class244) class244).anInt2715 + (int) (f_338_ * (float) (((ha_Sub1) aHa_Sub1_7928).anInt5574) / (float) anInt7923));
                        is_241_[i_330_] = (int) f;
                    }
                }
                if (((Class62) class62).aShortArray841 != null) {
                    if (anInt7923 == -1) {
                        for (int i_339_ = 0; i_339_ < ((Class62) class62).aShort838; i_339_++) {
                            int i_340_ = i_339_ * 3;
                            int i_341_ = i_340_ + 1;
                            int i_342_ = i_341_ + 1;
                            int i_343_ = is[i_340_];
                            int i_344_ = is[i_341_];
                            int i_345_ = is[i_342_];
                            int i_346_ = is_240_[i_340_];
                            int i_347_ = is_240_[i_341_];
                            int i_348_ = is_240_[i_342_];
                            int i_349_ = (is_242_[i_340_] + is_242_[i_341_] + is_242_[i_342_]);
                            if (((i_343_ - i_344_) * (i_348_ - i_347_) - (i_346_ - i_347_) * (i_345_ - i_344_)) > 0) {
                                ((Class244) class244).aBoolean2723 = (i_343_ < 0 || i_344_ < 0 || i_345_ < 0 || (i_343_ > ((Class244) class244).anInt2713) || (i_344_ > ((Class244) class244).anInt2713) || (i_345_ > ((Class244) class244).anInt2713));
                                short i_350_ = (((Class62) class62).aShortArray841[i_339_]);
                                if (i_349_ < 765) {
                                    if (i_349_ > 0) {
                                        if (i_350_ != -1) {
                                            int i_351_ = -16777216;
                                            if (i_350_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_350_, (byte) 125))).aByte3624))
                                                i_351_ = -1694498816;
                                            class244.method1948((float) i_346_, (float) i_347_, (float) i_348_, (float) i_343_, (float) i_344_, (float) i_345_, (float) is_241_[i_340_], (float) is_241_[i_341_], (float) is_241_[i_342_], ((float) (((Class62) class62).aShortArray845[i_340_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray845[i_341_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray845[i_342_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray840[i_340_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray840[i_341_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray840[i_342_]) / (float) (((s) this).anInt3465)), i_351_ | ((((Class62) class62).anIntArray847[i_340_]) & 0xffffff), i_351_ | ((((Class62) class62).anIntArray847[i_341_]) & 0xffffff), i_351_ | ((((Class62) class62).anIntArray847[i_342_]) & 0xffffff), (((Class203) class203).anInt2303), is_242_[i_340_], is_242_[i_341_], is_242_[i_342_], i_350_);
                                        } else if (((((Class62) class62).anIntArray847[i_340_]) & 0xffffff) != 0) {
                                            if (i_350_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_350_, (byte) 124))).aByte3624))
                                                ((Class244) class244).anInt2718 = -1694498816;
                                            class244.method1953((float) i_346_, (float) i_347_, (float) i_348_, (float) i_343_, (float) i_344_, (float) i_345_, (float) is_241_[i_340_], (float) is_241_[i_341_], (float) is_241_[i_342_], (Node_Sub11_Sub1.method2254((((Class62) class62).anIntArray847[i_340_]), (is_242_[i_340_] << 24 | (((Class203) class203).anInt2303)), false)), (Node_Sub11_Sub1.method2254((((Class62) class62).anIntArray847[i_341_]), (is_242_[i_341_] << 24 | (((Class203) class203).anInt2303)), false)), (Node_Sub11_Sub1.method2254((((Class62) class62).anIntArray847[i_342_]), (is_242_[i_342_] << 24 | (((Class203) class203).anInt2303)), false)));
                                            ((Class244) class244).anInt2718 = 0;
                                        }
                                    } else if (i_350_ != -1) {
                                        int i_352_ = -16777216;
                                        if (i_350_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_350_, (byte) 126))).aByte3624))
                                            i_352_ = -1694498816;
                                        class244.method1948((float) i_346_, (float) i_347_, (float) i_348_, (float) i_343_, (float) i_344_, (float) i_345_, (float) is_241_[i_340_], (float) is_241_[i_341_], (float) is_241_[i_342_], ((float) (((Class62) class62).aShortArray845[i_340_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray845[i_341_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray845[i_342_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray840[i_340_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray840[i_341_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray840[i_342_]) / (float) ((s) this).anInt3465), i_352_ | ((((Class62) class62).anIntArray847[i_340_]) & 0xffffff), i_352_ | ((((Class62) class62).anIntArray847[i_341_]) & 0xffffff), i_352_ | ((((Class62) class62).anIntArray847[i_342_]) & 0xffffff), 0, 0, 0, 0, i_350_);
                                    } else if (((((Class62) class62).anIntArray847[i_340_]) & 0xffffff) != 0) {
                                        if (i_350_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_350_, (byte) 124))).aByte3624))
                                            ((Class244) class244).anInt2718 = -1694498816;
                                        class244.method1953((float) i_346_, (float) i_347_, (float) i_348_, (float) i_343_, (float) i_344_, (float) i_345_, (float) is_241_[i_340_], (float) is_241_[i_341_], (float) is_241_[i_342_], (((Class62) class62).anIntArray847[i_340_]), (((Class62) class62).anIntArray847[i_341_]), (((Class62) class62).anIntArray847[i_342_]));
                                        ((Class244) class244).anInt2718 = 0;
                                    }
                                } else
                                    class244.method1949((float) i_346_, (float) i_347_, (float) i_348_, (float) i_343_, (float) i_344_, (float) i_345_, (float) is_241_[i_340_], (float) is_241_[i_341_], (float) is_241_[i_342_], ((Class203) class203).anInt2303);
                            }
                        }
                    } else {
                        for (int i_353_ = 0; i_353_ < ((Class62) class62).aShort838; i_353_++) {
                            int i_354_ = i_353_ * 3;
                            int i_355_ = i_354_ + 1;
                            int i_356_ = i_355_ + 1;
                            int i_357_ = is[i_354_];
                            int i_358_ = is[i_355_];
                            int i_359_ = is[i_356_];
                            int i_360_ = is_240_[i_354_];
                            int i_361_ = is_240_[i_355_];
                            int i_362_ = is_240_[i_356_];
                            int i_363_ = (is_242_[i_354_] + is_242_[i_355_] + is_242_[i_356_]);
                            if (((i_357_ - i_358_) * (i_362_ - i_361_) - (i_360_ - i_361_) * (i_359_ - i_358_)) > 0) {
                                ((Class244) class244).aBoolean2723 = (i_357_ < 0 || i_358_ < 0 || i_359_ < 0 || (i_357_ > ((Class244) class244).anInt2713) || (i_358_ > ((Class244) class244).anInt2713) || (i_359_ > ((Class244) class244).anInt2713));
                                short i_364_ = (((Class62) class62).aShortArray841[i_353_]);
                                if (i_363_ < 765) {
                                    if (i_364_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_364_, (byte) 124))).aByte3624))
                                        ((Class244) class244).anInt2718 = -1694498816;
                                    if (i_363_ > 0) {
                                        if (i_364_ != -1) {
                                            int i_365_ = -16777216;
                                            if (i_364_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_364_, (byte) 126))).aByte3624))
                                                i_365_ = -1694498816;
                                            class244.method1948((float) i_360_, (float) i_361_, (float) i_362_, (float) i_357_, (float) i_358_, (float) i_359_, (float) is_241_[i_354_], (float) is_241_[i_355_], (float) is_241_[i_356_], ((float) (((Class62) class62).aShortArray845[i_354_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray845[i_355_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray845[i_356_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray840[i_354_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray840[i_355_]) / (float) (((s) this).anInt3465)), ((float) (((Class62) class62).aShortArray840[i_356_]) / (float) (((s) this).anInt3465)), i_365_ | ((((Class62) class62).anIntArray847[i_354_]) & 0xffffff), i_365_ | ((((Class62) class62).anIntArray847[i_355_]) & 0xffffff), i_365_ | ((((Class62) class62).anIntArray847[i_356_]) & 0xffffff), (((Class203) class203).anInt2303), is_242_[i_354_], is_242_[i_355_], is_242_[i_356_], i_364_);
                                        } else if (((((Class62) class62).anIntArray847[i_354_]) & 0xffffff) != 0) {
                                            if (i_364_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_364_, (byte) 126))).aByte3624))
                                                ((Class244) class244).anInt2718 = -1694498816;
                                            class244.method1953((float) i_360_, (float) i_361_, (float) i_362_, (float) i_357_, (float) i_358_, (float) i_359_, (float) is_241_[i_354_], (float) is_241_[i_355_], (float) is_241_[i_356_], (Node_Sub11_Sub1.method2254((((Class62) class62).anIntArray847[i_354_]), (is_242_[i_354_] << 24 | (((Class203) class203).anInt2303)), false)), (Node_Sub11_Sub1.method2254((((Class62) class62).anIntArray847[i_355_]), (is_242_[i_355_] << 24 | (((Class203) class203).anInt2303)), false)), (Node_Sub11_Sub1.method2254((((Class62) class62).anIntArray847[i_356_]), (is_242_[i_356_] << 24 | (((Class203) class203).anInt2303)), false)));
                                            ((Class244) class244).anInt2718 = 0;
                                        }
                                    } else if (i_364_ != -1) {
                                        int i_366_ = -16777216;
                                        if (i_364_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_364_, (byte) 126))).aByte3624))
                                            i_366_ = -1694498816;
                                        class244.method1948((float) i_360_, (float) i_361_, (float) i_362_, (float) i_357_, (float) i_358_, (float) i_359_, (float) is_241_[i_354_], (float) is_241_[i_355_], (float) is_241_[i_356_], ((float) (((Class62) class62).aShortArray845[i_354_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray845[i_355_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray845[i_356_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray840[i_354_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray840[i_355_]) / (float) ((s) this).anInt3465), ((float) (((Class62) class62).aShortArray840[i_356_]) / (float) ((s) this).anInt3465), i_366_ | ((((Class62) class62).anIntArray847[i_354_]) & 0xffffff), i_366_ | ((((Class62) class62).anIntArray847[i_355_]) & 0xffffff), i_366_ | ((((Class62) class62).anIntArray847[i_356_]) & 0xffffff), 0, 0, 0, 0, i_364_);
                                    } else if (((((Class62) class62).anIntArray847[i_354_]) & 0xffffff) != 0) {
                                        if (i_364_ != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_364_, (byte) 126))).aByte3624))
                                            ((Class244) class244).anInt2718 = -1694498816;
                                        class244.method1953((float) i_360_, (float) i_361_, (float) i_362_, (float) i_357_, (float) i_358_, (float) i_359_, (float) is_241_[i_354_], (float) is_241_[i_355_], (float) is_241_[i_356_], (((Class62) class62).anIntArray847[i_354_]), (((Class62) class62).anIntArray847[i_355_]), (((Class62) class62).anIntArray847[i_356_]));
                                        ((Class244) class244).anInt2718 = 0;
                                    }
                                    ((Class244) class244).anInt2718 = 0;
                                } else
                                    class244.method1949((float) i_360_, (float) i_361_, (float) i_362_, (float) i_357_, (float) i_358_, (float) i_359_, (float) is_241_[i_354_], (float) is_241_[i_355_], (float) is_241_[i_356_], ((Class203) class203).anInt2303);
                            }
                        }
                    }
                } else {
                    for (int i_367_ = 0; i_367_ < ((Class62) class62).aShort838; i_367_++) {
                        int i_368_ = i_367_ * 3;
                        int i_369_ = i_368_ + 1;
                        int i_370_ = i_369_ + 1;
                        int i_371_ = is[i_368_];
                        int i_372_ = is[i_369_];
                        int i_373_ = is[i_370_];
                        int i_374_ = is_240_[i_368_];
                        int i_375_ = is_240_[i_369_];
                        int i_376_ = is_240_[i_370_];
                        int i_377_ = (is_242_[i_368_] + is_242_[i_369_] + is_242_[i_370_]);
                        if (((i_371_ - i_372_) * (i_376_ - i_375_) - (i_374_ - i_375_) * (i_373_ - i_372_)) > 0) {
                            ((Class244) class244).aBoolean2723 = (i_371_ < 0 || i_372_ < 0 || i_373_ < 0 || i_371_ > ((Class244) class244).anInt2713 || i_372_ > ((Class244) class244).anInt2713 || (i_373_ > ((Class244) class244).anInt2713));
                            if (i_377_ < 765) {
                                if (i_377_ > 0) {
                                    if (((((Class62) class62).anIntArray847[i_368_]) & 0xffffff) != 0)
                                        class244.method1953((float) i_374_, (float) i_375_, (float) i_376_, (float) i_371_, (float) i_372_, (float) i_373_, (float) is_241_[i_368_], (float) is_241_[i_369_], (float) is_241_[i_370_], (Class282_Sub5.method2938((((Class62) class62).anIntArray847[i_368_]), is_242_[i_368_], (byte) 117, (((Class203) class203).anInt2303))), (Class282_Sub5.method2938((((Class62) class62).anIntArray847[i_369_]), is_242_[i_369_], (byte) 77, (((Class203) class203).anInt2303))), (Class282_Sub5.method2938((((Class62) class62).anIntArray847[i_370_]), is_242_[i_370_], (byte) 83, (((Class203) class203).anInt2303))));
                                } else if (((((Class62) class62).anIntArray847[i_368_]) & 0xffffff) != 0)
                                    class244.method1953((float) i_374_, (float) i_375_, (float) i_376_, (float) i_371_, (float) i_372_, (float) i_373_, (float) is_241_[i_368_], (float) is_241_[i_369_], (float) is_241_[i_370_], (((Class62) class62).anIntArray847[i_368_]), (((Class62) class62).anIntArray847[i_369_]), (((Class62) class62).anIntArray847[i_370_]));
                            } else
                                class244.method1949((float) i_374_, (float) i_375_, (float) i_376_, (float) i_371_, (float) i_372_, (float) i_373_, (float) is_241_[i_368_], (float) is_241_[i_369_], (float) is_241_[i_370_], (((Class203) class203).anInt2303));
                        }
                    }
                }
            }
        }
    }

    final void wa(r var_r, int i, int i_378_, int i_379_, int i_380_, boolean bool) {
        /* empty */
    }

    final void method3144(int i, int i_381_, int i_382_, boolean[][] bools, boolean bool, int i_383_, int i_384_) {
        Class238_Sub1 class238_sub1 = ((ha_Sub1) aHa_Sub1_7928).aClass238_Sub1_5559;
        anInt7923 = i_383_;
        aFloat7919 = ((Class238_Sub1) class238_sub1).aFloat6688;
        aFloat7913 = ((Class238_Sub1) class238_sub1).aFloat6680;
        aFloat7926 = ((Class238_Sub1) class238_sub1).aFloat6683;
        aFloat7907 = ((Class238_Sub1) class238_sub1).aFloat6686;
        aFloat7908 = ((Class238_Sub1) class238_sub1).aFloat6702;
        aFloat7924 = ((Class238_Sub1) class238_sub1).aFloat6698;
        aFloat7911 = ((Class238_Sub1) class238_sub1).aFloat6697;
        aFloat7915 = ((Class238_Sub1) class238_sub1).aFloat6677;
        aFloat7914 = ((Class238_Sub1) class238_sub1).aFloat6694;
        aFloat7922 = ((Class238_Sub1) class238_sub1).aFloat6692;
        aFloat7920 = ((Class238_Sub1) class238_sub1).aFloat6699;
        aFloat7921 = ((Class238_Sub1) class238_sub1).aFloat6675;
        for (int i_385_ = 0; i_385_ < i_382_ + i_382_; i_385_++) {
            for (int i_386_ = 0; i_386_ < i_382_ + i_382_; i_386_++) {
                if (bools[i_385_][i_386_]) {
                    int i_387_ = i - i_382_ + i_385_;
                    int i_388_ = i_381_ - i_382_ + i_386_;
                    if (i_387_ >= 0 && i_387_ < ((s) this).anInt3468 && i_388_ >= 0 && i_388_ < ((s) this).anInt3472)
                        method3151(i_387_, i_388_, i_384_);
                }
            }
        }
    }

    s_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_389_, int i_390_, int i_391_, int[][] is, int[][] is_392_, int i_393_) {
        super(i_390_, i_391_, i_393_, is);
        aHa_Sub1_7928 = var_ha_Sub1;
        anInt7912 = i_389_;
        aByteArrayArray7925 = new byte[i_390_ + 1][i_391_ + 1];
        int i_394_ = ((ha_Sub1) aHa_Sub1_7928).anInt5583 >> 9;
        for (int i_395_ = 1; i_395_ < i_391_; i_395_++) {
            for (int i_396_ = 1; i_396_ < i_390_; i_396_++) {
                int i_397_ = i_394_;
                int i_398_ = (is_392_[i_396_ + 1][i_395_] - is_392_[i_396_ - 1][i_395_]);
                int i_399_ = (is_392_[i_396_][i_395_ + 1] - is_392_[i_396_][i_395_ - 1]);
                int i_400_ = (int) Math.sqrt((double) (i_398_ * i_398_ + 512 * i_393_ + i_399_ * i_399_));
                int i_401_ = (i_398_ << 8) / i_400_;
                int i_402_ = -512 * i_393_ / i_400_;
                int i_403_ = (i_399_ << 8) / i_400_;
                i_397_ += (((ha_Sub1) aHa_Sub1_7928).anInt5569 * i_401_ + ((ha_Sub1) aHa_Sub1_7928).anInt5555 * i_402_ + ((ha_Sub1) aHa_Sub1_7928).anInt5566 * i_403_) >> 17;
                i_397_ >>= 1;
                if (i_397_ < 2)
                    i_397_ = 2;
                else if (i_397_ > 126)
                    i_397_ = 126;
                aByteArrayArray7925[i_396_][i_395_] = (byte) i_397_;
            }
        }
        aByteArrayArray7918 = new byte[i_390_ + 1][i_391_ + 1];
    }

    final void U(int i, int i_404_, int[] is, int[] is_405_, int[] is_406_, int[] is_407_, int[] is_408_, int[] is_409_, int[] is_410_, int[] is_411_, int i_412_, int i_413_, int i_414_, boolean bool) {
        boolean bool_415_ = (anInt7912 & 0x20) == 0;
        if (aClass350ArrayArray7917 == null && !bool_415_) {
            aClass350ArrayArray7917 = new Class350[((s) this).anInt3468][((s) this).anInt3472];
            aClass62ArrayArray7927 = new Class62[((s) this).anInt3468][((s) this).anInt3472];
        } else if (aClass213ArrayArray7910 == null && bool_415_)
            aClass213ArrayArray7910 = new Class213[((s) this).anInt3468][((s) this).anInt3472];
        else if (aClass201ArrayArray7916 != null)
            throw new IllegalStateException();
        if (is != null && is.length != 0) {
            for (int i_416_ = 0; i_416_ < is_408_.length; i_416_++) {
                if (is_408_[i_416_] == -1)
                    is_408_[i_416_] = 0;
                else
                    is_408_[i_416_] = (Node.anIntArray2801[(Class183.method1615((byte) -113, is_408_[i_416_]) & 0xffff)]) << 8 | 0xff;
            }
            if (is_409_ != null) {
                for (int i_417_ = 0; i_417_ < is_409_.length; i_417_++) {
                    if (is_409_[i_417_] == -1)
                        is_409_[i_417_] = 0;
                    else
                        is_409_[i_417_] = (Node.anIntArray2801[(Class183.method1615((byte) -107, is_409_[i_417_]) & 0xffff)]) << 8 | 0xff;
                }
            }
            if (bool_415_) {
                Class213 class213 = new Class213();
                ((Class213) class213).aShort2463 = (short) is.length;
                ((Class213) class213).aShort2462 = (short) (is.length / 3);
                ((Class213) class213).aShortArray2467 = new short[((Class213) class213).aShort2463];
                ((Class213) class213).aShortArray2461 = new short[((Class213) class213).aShort2463];
                ((Class213) class213).aShortArray2466 = new short[((Class213) class213).aShort2463];
                ((Class213) class213).anIntArray2459 = new int[((Class213) class213).aShort2463];
                ((Class213) class213).aShortArray2458 = new short[((Class213) class213).aShort2463];
                ((Class213) class213).aShortArray2464 = new short[((Class213) class213).aShort2463];
                ((Class213) class213).aByteArray2468 = new byte[((Class213) class213).aShort2463];
                if (is_407_ != null)
                    ((Class213) class213).aShortArray2465 = new short[((Class213) class213).aShort2463];
                for (int i_418_ = 0; i_418_ < ((Class213) class213).aShort2463; i_418_++) {
                    int i_419_ = is[i_418_];
                    int i_420_ = is_406_[i_418_];
                    boolean bool_421_ = false;
                    int i_422_;
                    if (i_419_ == 0 && i_420_ == 0)
                        i_422_ = (aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_]);
                    else if (i_419_ == 0 && i_420_ == ((s) this).anInt3465)
                        i_422_ = (aByteArrayArray7925[i][i_404_ + 1] - aByteArrayArray7918[i][i_404_ + 1]);
                    else if (i_419_ == ((s) this).anInt3465 && i_420_ == ((s) this).anInt3465)
                        i_422_ = (aByteArrayArray7925[i + 1][i_404_ + 1] - aByteArrayArray7918[i + 1][i_404_ + 1]);
                    else if (i_419_ == ((s) this).anInt3465 && i_420_ == 0)
                        i_422_ = (aByteArrayArray7925[i + 1][i_404_] - aByteArrayArray7918[i + 1][i_404_]);
                    else {
                        int i_423_ = (((aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_]) * (((s) this).anInt3465 - i_419_)) + ((aByteArrayArray7925[i + 1][i_404_] - aByteArrayArray7918[i + 1][i_404_]) * i_419_));
                        int i_424_ = (((aByteArrayArray7925[i][i_404_ + 1] - aByteArrayArray7918[i][i_404_ + 1]) * (((s) this).anInt3465 - i_419_)) + ((aByteArrayArray7925[i + 1][i_404_ + 1] - aByteArrayArray7918[i + 1][i_404_ + 1]) * i_419_));
                        i_422_ = (i_423_ * (((s) this).anInt3465 - i_420_) + i_424_ * i_420_) >> 2 * ((s) this).anInt3466;
                    }
                    int i_425_ = (i << ((s) this).anInt3466) + i_419_;
                    int i_426_ = (i_404_ << ((s) this).anInt3466) + i_420_;
                    ((Class213) class213).aShortArray2467[i_418_] = (short) i_419_;
                    ((Class213) class213).aShortArray2466[i_418_] = (short) i_420_;
                    ((Class213) class213).aShortArray2461[i_418_] = (short) (this.method3150((byte) 103, i_425_, i_426_) + (is_405_ != null ? is_405_[i_418_] : 0));
                    if (i_422_ < 0)
                        i_422_ = 0;
                    if (is_408_[i_418_] == 0) {
                        ((Class213) class213).anIntArray2459[i_418_] = 0;
                        if (is_409_ != null)
                            ((Class213) class213).aByteArray2468[i_418_] = (byte) i_422_;
                    } else {
                        int i_427_ = 0;
                        if (is_407_ != null) {
                            int i_428_ = (((Class213) class213).aShortArray2465[i_418_] = (short) is_407_[i_418_]);
                            if (i_413_ != 0) {
                                i_427_ = 255 * i_428_ / i_413_;
                                if (i_427_ < 0)
                                    i_427_ = 0;
                                else if (i_427_ > 255)
                                    i_427_ = 255;
                            }
                        }
                        int i_429_ = -16777216;
                        if (is_410_[i_418_] != -1 && method3153(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(is_410_[i_418_], (byte) 126))).aByte3624))
                            i_429_ = -1694498816;
                        ((Class213) class213).anIntArray2459[i_418_] = i_429_ | (Class282_Sub5.method2938(method3154(is_408_[i_418_] >> 8, i_422_), i_427_, (byte) 123, i_412_));
                        if (is_409_ != null)
                            ((Class213) class213).aByteArray2468[i_418_] = (byte) i_422_;
                    }
                    ((Class213) class213).aShortArray2458[i_418_] = (short) is_410_[i_418_];
                    ((Class213) class213).aShortArray2464[i_418_] = (short) is_411_[i_418_];
                }
                if (is_409_ != null)
                    ((Class213) class213).anIntArray2460 = new int[((Class213) class213).aShort2462];
                for (int i_430_ = 0; i_430_ < ((Class213) class213).aShort2462; i_430_++) {
                    int i_431_ = i_430_ * 3;
                    if (is_409_ != null && is_409_[i_431_] != 0)
                        ((Class213) class213).anIntArray2460[i_430_] = ~0xffffff | is_409_[i_431_] >> 8;
                }
                aClass213ArrayArray7910[i][i_404_] = class213;
            } else {
                boolean bool_432_ = true;
                int i_433_ = -1;
                int i_434_ = -1;
                int i_435_ = -1;
                int i_436_ = -1;
                if (is.length == 6) {
                    for (int i_437_ = 0; i_437_ < 6; i_437_++) {
                        if (is[i_437_] == 0 && is_406_[i_437_] == 0) {
                            if (i_433_ != -1 && is_408_[i_433_] != is_408_[i_437_]) {
                                bool_432_ = false;
                                break;
                            }
                            i_433_ = i_437_;
                        } else if (is[i_437_] == ((s) this).anInt3465 && is_406_[i_437_] == 0) {
                            if (i_434_ != -1 && is_408_[i_434_] != is_408_[i_437_]) {
                                bool_432_ = false;
                                break;
                            }
                            i_434_ = i_437_;
                        } else if (is[i_437_] == ((s) this).anInt3465 && (is_406_[i_437_] == ((s) this).anInt3465)) {
                            if (i_435_ != -1 && is_408_[i_435_] != is_408_[i_437_]) {
                                bool_432_ = false;
                                break;
                            }
                            i_435_ = i_437_;
                        } else if (is[i_437_] == 0 && (is_406_[i_437_] == ((s) this).anInt3465)) {
                            if (i_436_ != -1 && is_408_[i_436_] != is_408_[i_437_]) {
                                bool_432_ = false;
                                break;
                            }
                            i_436_ = i_437_;
                        }
                    }
                    if (i_433_ == -1 || i_434_ == -1 || i_435_ == -1 || i_436_ == -1)
                        bool_432_ = false;
                    if (bool_432_) {
                        if (is_405_ != null) {
                            for (int i_438_ = 0; i_438_ < 4; i_438_++) {
                                if (is_405_[i_438_] != 0) {
                                    bool_432_ = false;
                                    break;
                                }
                            }
                        }
                        if (bool_432_) {
                            for (int i_439_ = 1; i_439_ < 4; i_439_++) {
                                if (is[i_439_] != is[0] && (is[i_439_] != is[0] + ((s) this).anInt3465) && (is[i_439_] != is[0] - ((s) this).anInt3465)) {
                                    bool_432_ = false;
                                    break;
                                }
                                if (is_406_[i_439_] != is_406_[0] && (is_406_[i_439_] != is_406_[0] + ((s) this).anInt3465) && (is_406_[i_439_] != (is_406_[0] - ((s) this).anInt3465))) {
                                    bool_432_ = false;
                                    break;
                                }
                            }
                        }
                    }
                } else
                    bool_432_ = false;
                if (bool_432_) {
                    Class350 class350 = new Class350();
                    int i_440_ = is_408_[0];
                    int i_441_ = is_410_[0];
                    if (is_409_ != null) {
                        ((Class350) class350).anInt4166 = is_409_[0] >> 8;
                        if (i_440_ == 0)
                            ((Class350) class350).aByte4174 |= 0x2;
                    } else if (i_440_ == 0)
                        return;
                    if ((((s) this).anIntArrayArray3464[i][i_404_] == ((s) this).anIntArrayArray3464[i + 1][i_404_]) && (((s) this).anIntArrayArray3464[i][i_404_] == (((s) this).anIntArrayArray3464[i + 1][i_404_ + 1])) && (((s) this).anIntArrayArray3464[i][i_404_] == ((s) this).anIntArrayArray3464[i][i_404_ + 1]))
                        ((Class350) class350).aByte4174 |= 0x1;
                    if (i_441_ != -1 && (((Class350) class350).aByte4174 & 0x2) == 0 && !(((Class312) ((ha) aHa_Sub1_7928).aD1414.method25(i_441_, (byte) 124)).aBoolean3622)) {
                        int i_442_;
                        if (is_407_ != null && i_413_ != 0) {
                            i_442_ = 255 * is_407_[i_433_] / i_413_;
                            if (i_442_ < 0)
                                i_442_ = 0;
                            else if (i_442_ > 255)
                                i_442_ = 255;
                        } else
                            i_442_ = 0;
                        ((Class350) class350).anInt4172 = (Class282_Sub5.method2938(method3154(is_408_[i_433_] >> 8, (aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_])), i_442_, (byte) 98, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4172 |= (255 - (aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_]) << 25);
                        if (is_407_ != null && i_413_ != 0) {
                            i_442_ = 255 * is_407_[i_434_] / i_413_;
                            if (i_442_ < 0)
                                i_442_ = 0;
                            else if (i_442_ > 255)
                                i_442_ = 255;
                        } else
                            i_442_ = 0;
                        ((Class350) class350).anInt4168 = (Class282_Sub5.method2938(method3154(is_408_[i_434_] >> 8, (aByteArrayArray7925[i + 1][i_404_] - (aByteArrayArray7918[i + 1][i_404_]))), i_442_, (byte) 63, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4168 |= 255 - (aByteArrayArray7925[i + 1][i_404_] - (aByteArrayArray7918[i + 1][i_404_])) << 25;
                        if (is_407_ != null && i_413_ != 0) {
                            i_442_ = 255 * is_407_[i_435_] / i_413_;
                            if (i_442_ < 0)
                                i_442_ = 0;
                            else if (i_442_ > 255)
                                i_442_ = 255;
                        } else
                            i_442_ = 0;
                        ((Class350) class350).anInt4167 = (Class282_Sub5.method2938(method3154(is_408_[i_435_] >> 8, ((aByteArrayArray7925[i + 1][i_404_ + 1]) - (aByteArrayArray7918[i + 1][i_404_ + 1]))), i_442_, (byte) 101, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4167 |= (255 - (aByteArrayArray7925[i + 1][i_404_ + 1] - (aByteArrayArray7918[i + 1][i_404_ + 1]))) << 25;
                        if (is_407_ != null && i_413_ != 0) {
                            i_442_ = 255 * is_407_[i_436_] / i_413_;
                            if (i_442_ < 0)
                                i_442_ = 0;
                            else if (i_442_ > 255)
                                i_442_ = 255;
                        } else
                            i_442_ = 0;
                        ((Class350) class350).anInt4176 = (Class282_Sub5.method2938(method3154(is_408_[i_436_] >> 8, (aByteArrayArray7925[i][i_404_ + 1] - (aByteArrayArray7918[i][i_404_ + 1]))), i_442_, (byte) 95, i_412_));
                        ((Class350) class350).aShort4171 = (short) i_441_;
                    } else {
                        int i_443_;
                        if (is_407_ != null && i_413_ != 0) {
                            i_443_ = 255 * is_407_[i_433_] / i_413_;
                            if (i_443_ < 0)
                                i_443_ = 0;
                            else if (i_443_ > 255)
                                i_443_ = 255;
                        } else
                            i_443_ = 0;
                        ((Class350) class350).anInt4172 = (Class282_Sub5.method2938(method3154(is_408_[i_433_] >> 8, (aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_])), i_443_, (byte) 57, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4172 |= (255 - (aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_]) << 25);
                        if (is_407_ != null && i_413_ != 0) {
                            i_443_ = 255 * is_407_[i_434_] / i_413_;
                            if (i_443_ < 0)
                                i_443_ = 0;
                            else if (i_443_ > 255)
                                i_443_ = 255;
                        } else
                            i_443_ = 0;
                        ((Class350) class350).anInt4168 = (Class282_Sub5.method2938(method3154(is_408_[i_434_] >> 8, (aByteArrayArray7925[i + 1][i_404_] - (aByteArrayArray7918[i + 1][i_404_]))), i_443_, (byte) 123, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4168 |= 255 - (aByteArrayArray7925[i + 1][i_404_] - (aByteArrayArray7918[i + 1][i_404_])) << 25;
                        if (is_407_ != null && i_413_ != 0) {
                            i_443_ = 255 * is_407_[i_435_] / i_413_;
                            if (i_443_ < 0)
                                i_443_ = 0;
                            else if (i_443_ > 255)
                                i_443_ = 255;
                        } else
                            i_443_ = 0;
                        ((Class350) class350).anInt4167 = (Class282_Sub5.method2938(method3154(is_408_[i_435_] >> 8, ((aByteArrayArray7925[i + 1][i_404_ + 1]) - (aByteArrayArray7918[i + 1][i_404_ + 1]))), i_443_, (byte) 97, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4167 |= (255 - (aByteArrayArray7925[i + 1][i_404_ + 1] - (aByteArrayArray7918[i + 1][i_404_ + 1]))) << 25;
                        if (is_407_ != null && i_413_ != 0) {
                            i_443_ = 255 * is_407_[i_436_] / i_413_;
                            if (i_443_ < 0)
                                i_443_ = 0;
                            else if (i_443_ > 255)
                                i_443_ = 255;
                        } else
                            i_443_ = 0;
                        ((Class350) class350).anInt4176 = (Class282_Sub5.method2938(method3154(is_408_[i_436_] >> 8, (aByteArrayArray7925[i][i_404_ + 1] - (aByteArrayArray7918[i][i_404_ + 1]))), i_443_, (byte) 109, i_412_));
                        if (((Class350) class350).anInt4166 != 0)
                            ((Class350) class350).anInt4176 |= 255 - (aByteArrayArray7925[i][i_404_ + 1] - (aByteArrayArray7918[i][i_404_ + 1])) << 25;
                        ((Class350) class350).aShort4171 = (short) -1;
                    }
                    if (is_407_ != null) {
                        ((Class350) class350).aShort4169 = (short) is_407_[i_435_];
                        ((Class350) class350).aShort4170 = (short) is_407_[i_436_];
                        ((Class350) class350).aShort4173 = (short) is_407_[i_434_];
                        ((Class350) class350).aShort4175 = (short) is_407_[i_433_];
                    }
                    aClass350ArrayArray7917[i][i_404_] = class350;
                } else {
                    Class62 class62 = new Class62();
                    ((Class62) class62).aShort842 = (short) is.length;
                    ((Class62) class62).aShort838 = (short) (is.length / 3);
                    ((Class62) class62).aShortArray845 = new short[((Class62) class62).aShort842];
                    ((Class62) class62).aShortArray839 = new short[((Class62) class62).aShort842];
                    ((Class62) class62).aShortArray840 = new short[((Class62) class62).aShort842];
                    ((Class62) class62).anIntArray847 = new int[((Class62) class62).aShort842];
                    if (is_407_ != null)
                        ((Class62) class62).aShortArray844 = new short[((Class62) class62).aShort842];
                    for (int i_444_ = 0; i_444_ < ((Class62) class62).aShort842; i_444_++) {
                        int i_445_ = is[i_444_];
                        int i_446_ = is_406_[i_444_];
                        boolean bool_447_ = false;
                        int i_448_;
                        if (i_445_ == 0 && i_446_ == 0)
                            i_448_ = (aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_]);
                        else if (i_445_ == 0 && i_446_ == ((s) this).anInt3465)
                            i_448_ = (aByteArrayArray7925[i][i_404_ + 1] - aByteArrayArray7918[i][i_404_ + 1]);
                        else if (i_445_ == ((s) this).anInt3465 && i_446_ == ((s) this).anInt3465)
                            i_448_ = (aByteArrayArray7925[i + 1][i_404_ + 1] - aByteArrayArray7918[i + 1][i_404_ + 1]);
                        else if (i_445_ == ((s) this).anInt3465 && i_446_ == 0)
                            i_448_ = (aByteArrayArray7925[i + 1][i_404_] - aByteArrayArray7918[i + 1][i_404_]);
                        else {
                            int i_449_ = (((aByteArrayArray7925[i][i_404_] - aByteArrayArray7918[i][i_404_]) * (((s) this).anInt3465 - i_445_)) + ((aByteArrayArray7925[i + 1][i_404_] - aByteArrayArray7918[i + 1][i_404_]) * i_445_));
                            int i_450_ = (((aByteArrayArray7925[i][i_404_ + 1] - aByteArrayArray7918[i][i_404_ + 1]) * (((s) this).anInt3465 - i_445_)) + (aByteArrayArray7925[i + 1][i_404_ + 1] - (aByteArrayArray7918[i + 1][i_404_ + 1])) * i_445_);
                            i_448_ = ((i_449_ * (((s) this).anInt3465 - i_446_) + i_450_ * i_446_) >> 2 * ((s) this).anInt3466);
                        }
                        int i_451_ = (i << ((s) this).anInt3466) + i_445_;
                        int i_452_ = (i_404_ << ((s) this).anInt3466) + i_446_;
                        ((Class62) class62).aShortArray845[i_444_] = (short) i_445_;
                        ((Class62) class62).aShortArray840[i_444_] = (short) i_446_;
                        ((Class62) class62).aShortArray839[i_444_] = (short) (this.method3150((byte) 110, i_451_, i_452_) + (is_405_ != null ? is_405_[i_444_] : 0));
                        if (i_448_ < 0)
                            i_448_ = 0;
                        if (is_408_[i_444_] == 0) {
                            if (is_409_ != null)
                                ((Class62) class62).anIntArray847[i_444_] = i_448_ << 25;
                            else
                                ((Class62) class62).anIntArray847[i_444_] = 0;
                        } else {
                            int i_453_ = 0;
                            if (is_407_ != null) {
                                int i_454_ = (((Class62) class62).aShortArray844[i_444_] = (short) is_407_[i_444_]);
                                if (i_413_ != 0) {
                                    i_453_ = 255 * i_454_ / i_413_;
                                    if (i_453_ < 0)
                                        i_453_ = 0;
                                    else if (i_453_ > 255)
                                        i_453_ = 255;
                                }
                            }
                            ((Class62) class62).anIntArray847[i_444_] = (Class282_Sub5.method2938(method3154(is_408_[i_444_] >> 8, i_448_), i_453_, (byte) 80, i_412_));
                            if (is_409_ != null)
                                ((Class62) class62).anIntArray847[i_444_] |= i_448_ << 25;
                        }
                    }
                    boolean bool_455_ = false;
                    for (int i_456_ = 0; i_456_ < ((Class62) class62).aShort838; i_456_++) {
                        if (is_410_[i_456_ * 3] != -1 && !((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(is_410_[i_456_ * 3], (byte) 127))).aBoolean3622)
                            bool_455_ = true;
                    }
                    if (is_409_ != null)
                        ((Class62) class62).anIntArray843 = new int[((Class62) class62).aShort838];
                    if (bool_455_) {
                        ((Class62) class62).aShortArray841 = new short[((Class62) class62).aShort838];
                        ((Class62) class62).aShortArray837 = new short[((Class62) class62).aShort838];
                    }
                    for (int i_457_ = 0; i_457_ < ((Class62) class62).aShort838; i_457_++) {
                        int i_458_ = i_457_ * 3;
                        if (is_409_ != null && is_409_[i_458_] != 0)
                            ((Class62) class62).anIntArray843[i_457_] = is_409_[i_458_] >> 8;
                        if (bool_455_) {
                            int i_459_ = i_458_ + 1;
                            int i_460_ = i_459_ + 1;
                            boolean bool_461_ = false;
                            boolean bool_462_ = true;
                            int i_463_ = is_410_[i_458_];
                            if (i_463_ == -1 || (((Class312) ((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 124)).aBoolean3622))
                                bool_462_ = false;
                            else
                                bool_461_ = true;
                            i_463_ = is_410_[i_459_];
                            if (i_463_ == -1 || (((Class312) ((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 125)).aBoolean3622))
                                bool_462_ = false;
                            else
                                bool_461_ = true;
                            i_463_ = is_410_[i_460_];
                            if (i_463_ == -1 || (((Class312) ((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 127)).aBoolean3622))
                                bool_462_ = false;
                            else
                                bool_461_ = true;
                            if (bool_462_) {
                                ((Class62) class62).aShortArray841[i_457_] = (short) i_463_;
                                ((Class62) class62).aShortArray837[i_457_] = (short) is_411_[i_458_];
                            } else {
                                if (bool_461_) {
                                    i_463_ = is_410_[i_458_];
                                    if (i_463_ != -1 && !(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 126))).aBoolean3622))
                                        ((Class62) class62).anIntArray847[i_458_] = (Node.anIntArray2801[((Class183.method1615((byte) -128, (((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 127))).aShort3634) & 0xffff)) & 0xffff)]);
                                    i_463_ = is_410_[i_459_];
                                    if (i_463_ != -1 && !(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 125))).aBoolean3622))
                                        ((Class62) class62).anIntArray847[i_459_] = (Node.anIntArray2801[((Class183.method1615((byte) -118, (((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 126))).aShort3634) & 0xffff)) & 0xffff)]);
                                    i_463_ = is_410_[i_460_];
                                    if (i_463_ != -1 && !(((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 125))).aBoolean3622))
                                        ((Class62) class62).anIntArray847[i_460_] = (Node.anIntArray2801[((Class183.method1615((byte) -127, (((Class312) (((ha) aHa_Sub1_7928).aD1414.method25(i_463_, (byte) 126))).aShort3634) & 0xffff)) & 0xffff)]);
                                }
                                ((Class62) class62).aShortArray841[i_457_] = (short) -1;
                            }
                        }
                    }
                    aClass62ArrayArray7927[i][i_404_] = class62;
                }
            }
        }
    }

    private final void method3158(int i, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_, int i_469_, boolean[][] bools, Class203 class203, Class244 class244, int[] is, int[] is_470_) {
        int i_471_ = (i_469_ - i_467_) * i_465_ / 256;
        int i_472_ = i_465_ >> 8;
        boolean bool = ((Class203) class203).aBoolean2316;
        aHa_Sub1_7928.C(false);
        ((Class244) class244).aBoolean2711 = false;
        ((Class244) class244).aBoolean2714 = false;
        int i_473_ = i;
        int i_474_ = i_464_ + i_471_;
        for (int i_475_ = i_466_; i_475_ < i_468_; i_475_++) {
            for (int i_476_ = i_467_; i_476_ < i_469_; i_476_++) {
                if (bools[i_475_ - i_466_][i_476_ - i_467_]) {
                    if (aClass201ArrayArray7916[i_475_][i_476_] != null) {
                        Class201 class201 = aClass201ArrayArray7916[i_475_][i_476_];
                        if (((Class201) class201).aShort2296 != -1 && (((Class201) class201).aByte2297 & 0x2) == 0 && ((Class201) class201).anInt2292 == -1) {
                            int i_477_ = aHa_Sub1_7928.method830(((Class201) class201).aShort2296);
                            class244.method1951((float) (i_474_ - i_472_), (float) (i_474_ - i_472_), (float) i_474_, (float) (i_473_ + i_472_), (float) i_473_, (float) (i_473_ + i_472_), 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808((((Class201) class201).aShort2298 & 0xffff), i_477_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class201) class201).aShort2294 & 0xffff), i_477_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class201) class201).aShort2295 & 0xffff), i_477_, (byte) 80)));
                            class244.method1951((float) i_474_, (float) i_474_, (float) (i_474_ - i_472_), (float) i_473_, (float) (i_473_ + i_472_), (float) i_473_, 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808((((Class201) class201).aShort2293 & 0xffff), i_477_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class201) class201).aShort2295 & 0xffff), i_477_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class201) class201).aShort2294 & 0xffff), i_477_, (byte) 80)));
                        } else if (((Class201) class201).anInt2292 == -1) {
                            class244.method1951((float) (i_474_ - i_472_), (float) (i_474_ - i_472_), (float) i_474_, (float) (i_473_ + i_472_), (float) i_473_, (float) (i_473_ + i_472_), 100.0F, 100.0F, 100.0F, (float) (((Class201) class201).aShort2298 & 0xffff), (float) (((Class201) class201).aShort2294 & 0xffff), (float) (((Class201) class201).aShort2295 & 0xffff));
                            class244.method1951((float) i_474_, (float) i_474_, (float) (i_474_ - i_472_), (float) i_473_, (float) (i_473_ + i_472_), (float) i_473_, 100.0F, 100.0F, 100.0F, (float) (((Class201) class201).aShort2293 & 0xffff), (float) (((Class201) class201).aShort2295 & 0xffff), (float) (((Class201) class201).aShort2294 & 0xffff));
                        } else {
                            int i_478_ = ((Class201) class201).anInt2292;
                            class244.method1951((float) (i_474_ - i_472_), (float) (i_474_ - i_472_), (float) i_474_, (float) (i_473_ + i_472_), (float) i_473_, (float) (i_473_ + i_472_), 100.0F, 100.0F, 100.0F, (float) i_478_, (float) i_478_, (float) i_478_);
                            class244.method1951((float) i_474_, (float) i_474_, (float) (i_474_ - i_472_), (float) i_473_, (float) (i_473_ + i_472_), (float) i_473_, 100.0F, 100.0F, 100.0F, (float) i_478_, (float) i_478_, (float) i_478_);
                        }
                    } else if (aClass336ArrayArray7909[i_475_][i_476_] != null) {
                        Class336 class336 = aClass336ArrayArray7909[i_475_][i_476_];
                        for (int i_479_ = 0; i_479_ < ((Class336) class336).aShort3912; i_479_++) {
                            is[i_479_] = i_473_ + ((((Class336) class336).aShortArray3920[i_479_]) * i_472_ / ((s) this).anInt3465);
                            is_470_[i_479_] = i_474_ - ((((Class336) class336).aShortArray3921[i_479_]) * i_472_ / ((s) this).anInt3465);
                        }
                        for (int i_480_ = 0; i_480_ < ((Class336) class336).aShort3915; i_480_++) {
                            short i_481_ = (((Class336) class336).aShortArray3913[i_480_]);
                            short i_482_ = (((Class336) class336).aShortArray3922[i_480_]);
                            short i_483_ = (((Class336) class336).aShortArray3911[i_480_]);
                            int i_484_ = is[i_481_];
                            int i_485_ = is[i_482_];
                            int i_486_ = is[i_483_];
                            int i_487_ = is_470_[i_481_];
                            int i_488_ = is_470_[i_482_];
                            int i_489_ = is_470_[i_483_];
                            if (((Class336) class336).anIntArray3916 != null && (((Class336) class336).anIntArray3916[i_480_]) != -1) {
                                int i_490_ = (((Class336) class336).anIntArray3916[i_480_]);
                                class244.method1951((float) i_487_, (float) i_488_, (float) i_489_, (float) i_484_, (float) i_485_, (float) i_486_, 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_481_]), i_490_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_482_]), i_490_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_483_]), i_490_, (byte) 80)));
                            } else if ((((Class336) class336).aShortArray3919 != null) && (((Class336) class336).aShortArray3919[i_480_]) != -1) {
                                int i_491_ = aHa_Sub1_7928.method830(((Class336) class336).aShortArray3919[i_480_]);
                                class244.method1951((float) i_487_, (float) i_488_, (float) i_489_, (float) i_484_, (float) i_485_, (float) i_486_, 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_481_]), i_491_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_482_]), i_491_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_483_]), i_491_, (byte) 80)));
                            } else {
                                int i_492_ = (((Class336) class336).anIntArray3918[i_480_]);
                                class244.method1951((float) i_487_, (float) i_488_, (float) i_489_, (float) i_484_, (float) i_485_, (float) i_486_, 100.0F, 100.0F, 100.0F, (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_481_]), i_492_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_482_]), i_492_, (byte) 80)), (float) (Class226_Sub1_Sub1.method1808((((Class336) class336).aShortArray3914[i_483_]), i_492_, (byte) 80)));
                            }
                        }
                    }
                }
                i_474_ -= i_472_;
            }
            i_474_ = i_464_ + i_471_;
            i_473_ += i_472_;
        }
        ((Class244) class244).aBoolean2711 = true;
        aHa_Sub1_7928.C(bool);
    }

    final void method3149(int i, int i_493_, int i_494_, boolean[][] bools, boolean bool, int i_495_) {
        Class238_Sub1 class238_sub1 = ((ha_Sub1) aHa_Sub1_7928).aClass238_Sub1_5559;
        anInt7923 = -1;
        aFloat7919 = ((Class238_Sub1) class238_sub1).aFloat6688;
        aFloat7913 = ((Class238_Sub1) class238_sub1).aFloat6680;
        aFloat7926 = ((Class238_Sub1) class238_sub1).aFloat6683;
        aFloat7907 = ((Class238_Sub1) class238_sub1).aFloat6686;
        aFloat7908 = ((Class238_Sub1) class238_sub1).aFloat6702;
        aFloat7924 = ((Class238_Sub1) class238_sub1).aFloat6698;
        aFloat7911 = ((Class238_Sub1) class238_sub1).aFloat6697;
        aFloat7915 = ((Class238_Sub1) class238_sub1).aFloat6677;
        aFloat7914 = ((Class238_Sub1) class238_sub1).aFloat6694;
        aFloat7922 = ((Class238_Sub1) class238_sub1).aFloat6692;
        aFloat7920 = ((Class238_Sub1) class238_sub1).aFloat6699;
        aFloat7921 = ((Class238_Sub1) class238_sub1).aFloat6675;
        for (int i_496_ = 0; i_496_ < i_494_ + i_494_; i_496_++) {
            for (int i_497_ = 0; i_497_ < i_494_ + i_494_; i_497_++) {
                if (bools[i_496_][i_497_]) {
                    int i_498_ = i - i_494_ + i_496_;
                    int i_499_ = i_493_ - i_494_ + i_497_;
                    if (i_498_ >= 0 && i_498_ < ((s) this).anInt3468 && i_499_ >= 0 && i_499_ < ((s) this).anInt3472)
                        method3151(i_498_, i_499_, i_495_);
                }
            }
        }
    }
}
