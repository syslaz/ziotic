/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class244 {
    boolean aBoolean2711 = true;
    int anInt2712;
    int anInt2713;
    boolean aBoolean2714 = false;
    int anInt2715;
    private int anInt2716;
    int anInt2717;
    int anInt2718;
    private Class203 aClass203_2719;
    int[] anIntArray2720 = new int[4096];
    private int[] anIntArray2721;
    private ha_Sub1 aHa_Sub1_2722;
    boolean aBoolean2723 = false;
    private boolean aBoolean2724;
    private boolean aBoolean2725;
    private float[] aFloatArray2726;
    private int anInt2727;
    private boolean aBoolean2728;
    private int anInt2729;
    private int anInt2730;
    private int anInt2731;
    private float aFloat2732;
    private int anInt2733;
    private float aFloat2734;
    private int[] anIntArray2735;
    private int anInt2736;
    private int[] anIntArray2737;
    private int anInt2738;
    private float aFloat2739;
    private int[] anIntArray2740;
    private int anInt2741;
    private int anInt2742;
    private int anInt2743;
    private int anInt2744;

    private final void method1942(int[] is, float[] fs, int i, int i_0_, int i_1_, int i_2_, int i_3_, float f, float f_4_) {
        if (((Class244) this).aBoolean2723) {
            if (i_3_ > ((Class244) this).anInt2713)
                i_3_ = ((Class244) this).anInt2713;
            if (i_2_ < 0)
                i_2_ = 0;
        }
        if (i_2_ < i_3_) {
            i += i_2_ - 1;
            i_1_ = i_3_ - i_2_ >> 2;
            f += f_4_ * (float) i_2_;
            if (((Class203) aClass203_2719).aBoolean2316) {
                if (((Class244) this).anInt2718 == 0) {
                    while (--i_1_ >= 0) {
                        if (f < fs[++i]) {
                            is[i] = i_0_;
                            fs[i] = f;
                        }
                        f += f_4_;
                        if (f < fs[++i]) {
                            is[i] = i_0_;
                            fs[i] = f;
                        }
                        f += f_4_;
                        if (f < fs[++i]) {
                            is[i] = i_0_;
                            fs[i] = f;
                        }
                        f += f_4_;
                        if (f < fs[++i]) {
                            is[i] = i_0_;
                            fs[i] = f;
                        }
                        f += f_4_;
                    }
                    i_1_ = i_3_ - i_2_ & 0x3;
                    while (--i_1_ >= 0) {
                        if (f < fs[++i]) {
                            is[i] = i_0_;
                            fs[i] = f;
                        }
                        f += f_4_;
                    }
                } else if (((Class244) this).anInt2718 == 254) {
                    if (i_2_ != 0 && i_3_ <= ((Class244) this).anInt2713 - 1) {
                        while (--i_1_ >= 0) {
                            if (f < fs[++i])
                                is[i - 1] = is[i];
                            f += f_4_;
                            if (f < fs[++i])
                                is[i - 1] = is[i];
                            f += f_4_;
                            if (f < fs[++i])
                                is[i - 1] = is[i];
                            f += f_4_;
                            if (f < fs[++i])
                                is[i - 1] = is[i];
                            f += f_4_;
                        }
                        i_1_ = i_3_ - i_2_ & 0x3;
                        while (--i_1_ >= 0) {
                            if (f < fs[++i])
                                is[i - 1] = is[i];
                            f += f_4_;
                        }
                    }
                } else {
                    int i_5_ = ((Class244) this).anInt2718;
                    int i_6_ = 256 - ((Class244) this).anInt2718;
                    i_0_ = (((i_0_ & 0xff00ff) * i_6_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_6_ >> 8 & 0xff00));
                    while (--i_1_ >= 0) {
                        if (f < fs[++i]) {
                            int i_7_ = is[i];
                            is[i] = (i_0_ + ((i_7_ & 0xff00ff) * i_5_ >> 8 & 0xff00ff) + ((i_7_ & 0xff00) * i_5_ >> 8 & 0xff00));
                            fs[i] = f;
                        }
                        f += f_4_;
                        if (f < fs[++i]) {
                            int i_8_ = is[i];
                            is[i] = (i_0_ + ((i_8_ & 0xff00ff) * i_5_ >> 8 & 0xff00ff) + ((i_8_ & 0xff00) * i_5_ >> 8 & 0xff00));
                            fs[i] = f;
                        }
                        f += f_4_;
                        if (f < fs[++i]) {
                            int i_9_ = is[i];
                            is[i] = (i_0_ + ((i_9_ & 0xff00ff) * i_5_ >> 8 & 0xff00ff) + ((i_9_ & 0xff00) * i_5_ >> 8 & 0xff00));
                            fs[i] = f;
                        }
                        f += f_4_;
                        if (f < fs[++i]) {
                            int i_10_ = is[i];
                            is[i] = (i_0_ + ((i_10_ & 0xff00ff) * i_5_ >> 8 & 0xff00ff) + ((i_10_ & 0xff00) * i_5_ >> 8 & 0xff00));
                            fs[i] = f;
                        }
                        f += f_4_;
                    }
                    i_1_ = i_3_ - i_2_ & 0x3;
                    while (--i_1_ >= 0) {
                        if (f < fs[++i]) {
                            int i_11_ = is[i];
                            is[i] = (i_0_ + ((i_11_ & 0xff00ff) * i_5_ >> 8 & 0xff00ff) + ((i_11_ & 0xff00) * i_5_ >> 8 & 0xff00));
                            fs[i] = f;
                        }
                        f += f_4_;
                    }
                }
            } else if (((Class244) this).anInt2718 == 0) {
                while (--i_1_ >= 0) {
                    if (f < fs[++i])
                        is[i] = i_0_;
                    f += f_4_;
                    if (f < fs[++i])
                        is[i] = i_0_;
                    f += f_4_;
                    if (f < fs[++i])
                        is[i] = i_0_;
                    f += f_4_;
                    if (f < fs[++i])
                        is[i] = i_0_;
                    f += f_4_;
                }
                i_1_ = i_3_ - i_2_ & 0x3;
                while (--i_1_ >= 0) {
                    if (f < fs[++i])
                        is[i] = i_0_;
                    f += f_4_;
                }
            } else if (((Class244) this).anInt2718 == 254) {
                if (i_2_ != 0 && i_3_ <= ((Class244) this).anInt2713 - 1) {
                    while (--i_1_ >= 0) {
                        if (f < fs[++i])
                            is[i - 1] = is[i];
                        f += f_4_;
                        if (f < fs[++i])
                            is[i - 1] = is[i];
                        f += f_4_;
                        if (f < fs[++i])
                            is[i - 1] = is[i];
                        f += f_4_;
                        if (f < fs[++i])
                            is[i - 1] = is[i];
                        f += f_4_;
                    }
                    i_1_ = i_3_ - i_2_ & 0x3;
                    while (--i_1_ >= 0) {
                        if (f < fs[++i])
                            is[i - 1] = is[i];
                        f += f_4_;
                    }
                }
            } else {
                int i_12_ = ((Class244) this).anInt2718;
                int i_13_ = 256 - ((Class244) this).anInt2718;
                i_0_ = (((i_0_ & 0xff00ff) * i_13_ >> 8 & 0xff00ff) + ((i_0_ & 0xff00) * i_13_ >> 8 & 0xff00));
                while (--i_1_ >= 0) {
                    if (f < fs[++i]) {
                        int i_14_ = is[i];
                        is[i] = (i_0_ + ((i_14_ & 0xff00ff) * i_12_ >> 8 & 0xff00ff) + ((i_14_ & 0xff00) * i_12_ >> 8 & 0xff00));
                    }
                    f += f_4_;
                    if (f < fs[++i]) {
                        int i_15_ = is[i];
                        is[i] = (i_0_ + ((i_15_ & 0xff00ff) * i_12_ >> 8 & 0xff00ff) + ((i_15_ & 0xff00) * i_12_ >> 8 & 0xff00));
                    }
                    f += f_4_;
                    if (f < fs[++i]) {
                        int i_16_ = is[i];
                        is[i] = (i_0_ + ((i_16_ & 0xff00ff) * i_12_ >> 8 & 0xff00ff) + ((i_16_ & 0xff00) * i_12_ >> 8 & 0xff00));
                    }
                    f += f_4_;
                    if (f < fs[++i]) {
                        int i_17_ = is[i];
                        is[i] = (i_0_ + ((i_17_ & 0xff00ff) * i_12_ >> 8 & 0xff00ff) + ((i_17_ & 0xff00) * i_12_ >> 8 & 0xff00));
                    }
                    f += f_4_;
                }
                i_1_ = i_3_ - i_2_ & 0x3;
                while (--i_1_ >= 0) {
                    if (f < fs[++i]) {
                        int i_18_ = is[i];
                        is[i] = (i_0_ + ((i_18_ & 0xff00ff) * i_12_ >> 8 & 0xff00ff) + ((i_18_ & 0xff00) * i_12_ >> 8 & 0xff00));
                    }
                    f += f_4_;
                }
            }
        }
    }

    final void method1943(float f, float f_19_, float f_20_, float f_21_, float f_22_, float f_23_, float f_24_, float f_25_, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_, int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, float f_40_, int i_41_, float f_42_, int i_43_, float f_44_) {
        if (i_39_ != anInt2743) {
            anIntArray2737 = aHa_Sub1_2722.method831(i_39_);
            if (anIntArray2737 == null) {
                method1953((float) (int) f, (float) (int) f_19_, (float) (int) f_20_, (float) (int) f_21_, (float) (int) f_22_, (float) (int) f_23_, (float) (int) f_24_, (float) (int) f_25_, (float) (int) f_26_, Node_Sub11_Sub1.method2254(i, i_35_ | i_36_ << 24, false), Node_Sub11_Sub1.method2254(i_33_, i_35_ | i_37_ << 24, false), Node_Sub11_Sub1.method2254(i_34_, i_35_ | i_38_ << 24, false));
                return;
            }
            anInt2731 = (aHa_Sub1_2722.method823(i_39_) ? 64 : ((ha_Sub1) aHa_Sub1_2722).anInt5577);
            anInt2727 = anInt2731 - 1;
            anInt2733 = aHa_Sub1_2722.method837(i_39_);
        }
        aFloat2732 = f_40_;
        if (i_41_ != anInt2744) {
            anIntArray2735 = aHa_Sub1_2722.method831(i_41_);
            if (anIntArray2735 == null) {
                method1953((float) (int) f, (float) (int) f_19_, (float) (int) f_20_, (float) (int) f_21_, (float) (int) f_22_, (float) (int) f_23_, (float) (int) f_24_, (float) (int) f_25_, (float) (int) f_26_, Node_Sub11_Sub1.method2254(i, i_35_ | i_36_ << 24, false), Node_Sub11_Sub1.method2254(i_33_, i_35_ | i_37_ << 24, false), Node_Sub11_Sub1.method2254(i_34_, i_35_ | i_38_ << 24, false));
                return;
            }
            anInt2738 = (aHa_Sub1_2722.method823(i_41_) ? 64 : ((ha_Sub1) aHa_Sub1_2722).anInt5577);
            anInt2729 = anInt2738 - 1;
        }
        aFloat2734 = f_42_;
        if (i_43_ != anInt2730) {
            anIntArray2740 = aHa_Sub1_2722.method831(i_43_);
            if (anIntArray2740 == null) {
                method1953((float) (int) f, (float) (int) f_19_, (float) (int) f_20_, (float) (int) f_21_, (float) (int) f_22_, (float) (int) f_23_, (float) (int) f_24_, (float) (int) f_25_, (float) (int) f_26_, Node_Sub11_Sub1.method2254(i, i_35_ | i_36_ << 24, false), Node_Sub11_Sub1.method2254(i_33_, i_35_ | i_37_ << 24, false), Node_Sub11_Sub1.method2254(i_34_, i_35_ | i_38_ << 24, false));
                return;
            }
            anInt2742 = (aHa_Sub1_2722.method823(i_43_) ? 64 : ((ha_Sub1) aHa_Sub1_2722).anInt5577);
            anInt2736 = anInt2742 - 1;
        }
        aFloat2739 = f_44_;
        anInt2741 = i_35_;
        float f_45_ = (float) (i >> 24 & 0xff);
        float f_46_ = (float) (i_33_ >> 24 & 0xff);
        float f_47_ = (float) (i_34_ >> 24 & 0xff);
        float f_48_ = (float) (i >> 16 & 0xff);
        float f_49_ = (float) (i_33_ >> 16 & 0xff);
        float f_50_ = (float) (i_34_ >> 16 & 0xff);
        float f_51_ = (float) (i >> 8 & 0xff);
        float f_52_ = (float) (i_33_ >> 8 & 0xff);
        float f_53_ = (float) (i_34_ >> 8 & 0xff);
        float f_54_ = (float) (i & 0xff);
        float f_55_ = (float) (i_33_ & 0xff);
        float f_56_ = (float) (i_34_ & 0xff);
        f_27_ /= f_24_;
        f_28_ /= f_25_;
        f_29_ /= f_26_;
        f_30_ /= f_24_;
        f_31_ /= f_25_;
        f_32_ /= f_26_;
        f_24_ = 1.0F / f_24_;
        f_25_ = 1.0F / f_25_;
        f_26_ = 1.0F / f_26_;
        float f_57_ = 1.0F;
        float f_58_ = 0.0F;
        float f_59_ = 0.0F;
        float f_60_ = 0.0F;
        float f_61_ = 1.0F;
        float f_62_ = 0.0F;
        float f_63_ = 0.0F;
        float f_64_ = 0.0F;
        float f_65_ = 0.0F;
        float f_66_ = 0.0F;
        float f_67_ = 0.0F;
        float f_68_ = 0.0F;
        float f_69_ = 0.0F;
        float f_70_ = 0.0F;
        float f_71_ = 0.0F;
        float f_72_ = 0.0F;
        float f_73_ = 0.0F;
        if (f_19_ != f) {
            float f_74_ = f_19_ - f;
            f_63_ = (f_22_ - f_21_) / f_74_;
            f_64_ = (f_25_ - f_24_) / f_74_;
            f_65_ = (f_28_ - f_27_) / f_74_;
            f_66_ = (f_31_ - f_30_) / f_74_;
            f_67_ = (float) (i_37_ - i_36_) / f_74_;
            f_68_ = (f_46_ - f_45_) / f_74_;
            f_69_ = (f_49_ - f_48_) / f_74_;
            f_70_ = (f_52_ - f_51_) / f_74_;
            f_71_ = (f_55_ - f_54_) / f_74_;
            f_72_ = (f_58_ - f_57_) / f_74_;
            f_73_ = (f_61_ - f_60_) / f_74_;
        }
        float f_75_ = 0.0F;
        float f_76_ = 0.0F;
        float f_77_ = 0.0F;
        float f_78_ = 0.0F;
        float f_79_ = 0.0F;
        float f_80_ = 0.0F;
        float f_81_ = 0.0F;
        float f_82_ = 0.0F;
        float f_83_ = 0.0F;
        float f_84_ = 0.0F;
        float f_85_ = 0.0F;
        if (f_20_ != f_19_) {
            float f_86_ = f_20_ - f_19_;
            f_75_ = (f_23_ - f_22_) / f_86_;
            f_76_ = (f_26_ - f_25_) / f_86_;
            f_77_ = (f_29_ - f_28_) / f_86_;
            f_78_ = (f_32_ - f_31_) / f_86_;
            f_79_ = (float) (i_38_ - i_37_) / f_86_;
            f_80_ = (f_47_ - f_46_) / f_86_;
            f_81_ = (f_50_ - f_49_) / f_86_;
            f_82_ = (f_53_ - f_52_) / f_86_;
            f_83_ = (f_56_ - f_55_) / f_86_;
            f_84_ = (f_59_ - f_58_) / f_86_;
            f_85_ = (f_62_ - f_61_) / f_86_;
        }
        float f_87_ = 0.0F;
        float f_88_ = 0.0F;
        float f_89_ = 0.0F;
        float f_90_ = 0.0F;
        float f_91_ = 0.0F;
        float f_92_ = 0.0F;
        float f_93_ = 0.0F;
        float f_94_ = 0.0F;
        float f_95_ = 0.0F;
        float f_96_ = 0.0F;
        float f_97_ = 0.0F;
        if (f != f_20_) {
            float f_98_ = f - f_20_;
            f_87_ = (f_21_ - f_23_) / f_98_;
            f_88_ = (f_24_ - f_26_) / f_98_;
            f_89_ = (f_27_ - f_29_) / f_98_;
            f_90_ = (f_30_ - f_32_) / f_98_;
            f_91_ = (float) (i_36_ - i_38_) / f_98_;
            f_92_ = (f_45_ - f_47_) / f_98_;
            f_93_ = (f_48_ - f_50_) / f_98_;
            f_94_ = (f_51_ - f_53_) / f_98_;
            f_95_ = (f_54_ - f_56_) / f_98_;
            f_96_ = (f_57_ - f_59_) / f_98_;
            f_97_ = (f_60_ - f_62_) / f_98_;
        }
        if (f <= f_19_ && f <= f_20_) {
            if (!(f >= (float) ((Class244) this).anInt2717)) {
                if (f_19_ > (float) ((Class244) this).anInt2717)
                    f_19_ = (float) ((Class244) this).anInt2717;
                if (f_20_ > (float) ((Class244) this).anInt2717)
                    f_20_ = (float) ((Class244) this).anInt2717;
                if (f_19_ < f_20_) {
                    f_23_ = f_21_;
                    f_26_ = f_24_;
                    f_29_ = f_27_;
                    f_32_ = f_30_;
                    i_38_ = i_36_;
                    f_47_ = f_45_;
                    f_50_ = f_48_;
                    f_53_ = f_51_;
                    f_56_ = f_54_;
                    f_59_ = f_57_;
                    f_62_ = f_60_;
                    if (f < 0.0F) {
                        f_21_ -= f_63_ * f;
                        f_23_ -= f_87_ * f;
                        f_24_ -= f_64_ * f;
                        f_26_ -= f_88_ * f;
                        f_27_ -= f_65_ * f;
                        f_29_ -= f_89_ * f;
                        f_30_ -= f_66_ * f;
                        f_32_ -= f_90_ * f;
                        i_36_ -= f_67_ * f;
                        i_38_ -= f_91_ * f;
                        f_45_ -= f_68_ * f;
                        f_47_ -= f_92_ * f;
                        f_48_ -= f_69_ * f;
                        f_50_ -= f_93_ * f;
                        f_51_ -= f_70_ * f;
                        f_53_ -= f_94_ * f;
                        f_54_ -= f_71_ * f;
                        f_56_ -= f_95_ * f;
                        f_57_ -= f_72_ * f;
                        f_59_ -= f_96_ * f;
                        f_60_ -= f_73_ * f;
                        f_62_ -= f_97_ * f;
                        f = 0.0F;
                    }
                    if (f_19_ < 0.0F) {
                        f_22_ -= f_75_ * f_19_;
                        f_25_ -= f_76_ * f_19_;
                        f_28_ -= f_77_ * f_19_;
                        f_31_ -= f_78_ * f_19_;
                        i_37_ -= f_79_ * f_19_;
                        f_46_ -= f_80_ * f_19_;
                        f_49_ -= f_81_ * f_19_;
                        f_52_ -= f_82_ * f_19_;
                        f_55_ -= f_83_ * f_19_;
                        f_58_ -= f_84_ * f_19_;
                        f_61_ -= f_85_ * f_19_;
                        f_19_ = 0.0F;
                    }
                    if (f != f_19_ && f_87_ < f_63_ || f == f_19_ && f_87_ > f_75_) {
                        f_20_ -= f_19_;
                        f_19_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_19_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_23_, (int) f_21_, f_26_, f_24_, f_29_, f_27_, f_32_, f_30_, (float) i_38_, (float) i_36_, f_47_, f_45_, f_50_, f_48_, f_53_, f_51_, f_56_, f_54_, f_59_, f_57_, f_62_, f_60_);
                            f_21_ += f_63_;
                            f_23_ += f_87_;
                            f_24_ += f_64_;
                            f_26_ += f_88_;
                            f_27_ += f_65_;
                            f_29_ += f_89_;
                            f_30_ += f_66_;
                            f_32_ += f_90_;
                            i_36_ += f_67_;
                            i_38_ += f_91_;
                            f_45_ += f_68_;
                            f_47_ += f_92_;
                            f_48_ += f_69_;
                            f_50_ += f_93_;
                            f_51_ += f_70_;
                            f_53_ += f_94_;
                            f_54_ += f_71_;
                            f_56_ += f_95_;
                            f_57_ += f_72_;
                            f_59_ += f_96_;
                            f_60_ += f_73_;
                            f_62_ += f_73_;
                            f += (float) anInt2716;
                        }
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_23_, (int) f_22_, f_26_, f_25_, f_29_, f_28_, f_32_, f_31_, (float) i_38_, (float) i_37_, f_47_, f_46_, f_50_, f_49_, f_53_, f_52_, f_56_, f_55_, f_59_, f_58_, f_62_, f_61_);
                            f_22_ += f_75_;
                            f_23_ += f_87_;
                            f_25_ += f_76_;
                            f_26_ += f_88_;
                            f_28_ += f_77_;
                            f_29_ += f_89_;
                            f_31_ += f_78_;
                            f_32_ += f_90_;
                            i_37_ += f_79_;
                            i_38_ += f_91_;
                            f_46_ += f_80_;
                            f_47_ += f_92_;
                            f_49_ += f_81_;
                            f_50_ += f_93_;
                            f_52_ += f_82_;
                            f_53_ += f_94_;
                            f_55_ += f_83_;
                            f_56_ += f_95_;
                            f_58_ += f_84_;
                            f_59_ += f_96_;
                            f_61_ += f_85_;
                            f_62_ += f_97_;
                            f += (float) anInt2716;
                        }
                    } else {
                        f_20_ -= f_19_;
                        f_19_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_19_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_21_, (int) f_23_, f_24_, f_26_, f_27_, f_29_, f_30_, f_32_, (float) i_36_, (float) i_38_, f_45_, f_47_, f_48_, f_50_, f_51_, f_53_, f_54_, f_56_, f_57_, f_59_, f_60_, f_62_);
                            f_21_ += f_63_;
                            f_23_ += f_87_;
                            f_24_ += f_64_;
                            f_26_ += f_88_;
                            f_27_ += f_65_;
                            f_29_ += f_89_;
                            f_30_ += f_66_;
                            f_32_ += f_90_;
                            i_36_ += f_67_;
                            i_38_ += f_91_;
                            f_45_ += f_68_;
                            f_47_ += f_92_;
                            f_48_ += f_69_;
                            f_50_ += f_93_;
                            f_51_ += f_70_;
                            f_53_ += f_94_;
                            f_54_ += f_71_;
                            f_56_ += f_95_;
                            f_57_ += f_72_;
                            f_59_ += f_96_;
                            f_60_ += f_73_;
                            f_62_ += f_97_;
                            f += (float) anInt2716;
                        }
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_22_, (int) f_23_, f_25_, f_26_, f_28_, f_29_, f_31_, f_32_, (float) i_37_, (float) i_38_, f_46_, f_47_, f_49_, f_50_, f_52_, f_53_, f_55_, f_56_, f_58_, f_59_, f_61_, f_62_);
                            f_22_ += f_75_;
                            f_23_ += f_87_;
                            f_25_ += f_76_;
                            f_26_ += f_88_;
                            f_28_ += f_77_;
                            f_29_ += f_89_;
                            f_31_ += f_78_;
                            f_32_ += f_90_;
                            i_37_ += f_79_;
                            i_38_ += f_91_;
                            f_46_ += f_80_;
                            f_47_ += f_92_;
                            f_49_ += f_81_;
                            f_50_ += f_93_;
                            f_52_ += f_82_;
                            f_53_ += f_94_;
                            f_55_ += f_83_;
                            f_56_ += f_95_;
                            f_58_ += f_84_;
                            f_59_ += f_96_;
                            f_61_ += f_85_;
                            f_62_ += f_97_;
                            f += (float) anInt2716;
                        }
                    }
                } else {
                    f_22_ = f_21_;
                    f_25_ = f_24_;
                    f_28_ = f_27_;
                    f_31_ = f_30_;
                    i_37_ = i_36_;
                    f_46_ = f_45_;
                    f_49_ = f_48_;
                    f_52_ = f_51_;
                    f_55_ = f_54_;
                    f_58_ = f_57_;
                    f_61_ = f_60_;
                    if (f < 0.0F) {
                        f_21_ -= f_63_ * f;
                        f_22_ -= f_87_ * f;
                        f_24_ -= f_64_ * f;
                        f_25_ -= f_88_ * f;
                        f_27_ -= f_65_ * f;
                        f_28_ -= f_89_ * f;
                        f_30_ -= f_66_ * f;
                        f_31_ -= f_90_ * f;
                        i_36_ -= f_67_ * f;
                        i_37_ -= f_91_ * f;
                        f_45_ -= f_68_ * f;
                        f_46_ -= f_92_ * f;
                        f_48_ -= f_69_ * f;
                        f_49_ -= f_93_ * f;
                        f_51_ -= f_70_ * f;
                        f_52_ -= f_94_ * f;
                        f_54_ -= f_71_ * f;
                        f_55_ -= f_95_ * f;
                        f_57_ -= f_72_ * f;
                        f_58_ -= f_96_ * f;
                        f_60_ -= f_73_ * f;
                        f_61_ -= f_97_ * f;
                        f = 0.0F;
                    }
                    if (f_20_ < 0.0F) {
                        f_23_ -= f_75_ * f_20_;
                        f_26_ -= f_76_ * f_20_;
                        f_29_ -= f_77_ * f_20_;
                        f_32_ -= f_78_ * f_20_;
                        i_38_ -= f_79_ * f_20_;
                        f_47_ -= f_80_ * f_20_;
                        f_50_ -= f_81_ * f_20_;
                        f_53_ -= f_82_ * f_20_;
                        f_56_ -= f_83_ * f_20_;
                        f_59_ -= f_84_ * f_20_;
                        f_62_ -= f_85_ * f_20_;
                        f_20_ = 0.0F;
                    }
                    if (f != f_20_ && f_87_ < f_63_ || f == f_20_ && f_75_ > f_63_) {
                        f_19_ -= f_20_;
                        f_20_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_22_, (int) f_21_, f_25_, f_24_, f_28_, f_27_, f_31_, f_30_, (float) i_37_, (float) i_36_, f_46_, f_45_, f_49_, f_48_, f_52_, f_51_, f_55_, f_54_, f_58_, f_57_, f_61_, f_60_);
                            f_21_ += f_63_;
                            f_22_ += f_87_;
                            f_24_ += f_64_;
                            f_25_ += f_88_;
                            f_27_ += f_65_;
                            f_28_ += f_89_;
                            f_30_ += f_66_;
                            f_31_ += f_90_;
                            i_36_ += f_67_;
                            i_37_ += f_91_;
                            f_45_ += f_68_;
                            f_46_ += f_92_;
                            f_48_ += f_69_;
                            f_49_ += f_93_;
                            f_51_ += f_70_;
                            f_52_ += f_94_;
                            f_54_ += f_71_;
                            f_55_ += f_95_;
                            f_57_ += f_72_;
                            f_58_ += f_96_;
                            f_60_ += f_73_;
                            f_61_ += f_97_;
                            f += (float) anInt2716;
                        }
                        while (--f_19_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_23_, (int) f_21_, f_26_, f_24_, f_29_, f_27_, f_32_, f_30_, (float) i_38_, (float) i_36_, f_47_, f_45_, f_50_, f_48_, f_53_, f_51_, f_56_, f_54_, f_59_, f_57_, f_62_, f_60_);
                            f_23_ += f_75_;
                            f_21_ += f_63_;
                            f_26_ += f_76_;
                            f_24_ += f_64_;
                            f_29_ += f_77_;
                            f_27_ += f_65_;
                            f_32_ += f_78_;
                            f_30_ += f_66_;
                            i_38_ += f_79_;
                            i_36_ += f_67_;
                            f_47_ += f_80_;
                            f_45_ += f_68_;
                            f_50_ += f_81_;
                            f_48_ += f_69_;
                            f_53_ += f_82_;
                            f_51_ += f_70_;
                            f_56_ += f_83_;
                            f_54_ += f_71_;
                            f_59_ += f_84_;
                            f_57_ += f_72_;
                            f_62_ += f_85_;
                            f_60_ += f_73_;
                            f += (float) anInt2716;
                        }
                    } else {
                        f_19_ -= f_20_;
                        f_20_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_21_, (int) f_22_, f_24_, f_25_, f_27_, f_28_, f_30_, f_31_, (float) i_36_, (float) i_37_, f_45_, f_46_, f_48_, f_49_, f_51_, f_52_, f_54_, f_55_, f_57_, f_58_, f_60_, f_61_);
                            f_22_ += f_87_;
                            f_21_ += f_63_;
                            f_25_ += f_88_;
                            f_24_ += f_64_;
                            f_28_ += f_89_;
                            f_27_ += f_65_;
                            f_31_ += f_90_;
                            f_30_ += f_66_;
                            i_37_ += f_91_;
                            i_36_ += f_67_;
                            f_46_ += f_92_;
                            f_45_ += f_68_;
                            f_49_ += f_93_;
                            f_48_ += f_69_;
                            f_52_ += f_94_;
                            f_51_ += f_70_;
                            f_55_ += f_95_;
                            f_54_ += f_71_;
                            f_58_ += f_96_;
                            f_57_ += f_72_;
                            f_61_ += f_97_;
                            f_60_ += f_73_;
                            f += (float) anInt2716;
                        }
                        while (--f_19_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f, (int) f_21_, (int) f_23_, f_24_, f_26_, f_27_, f_29_, f_30_, f_32_, (float) i_36_, (float) i_38_, f_45_, f_47_, f_48_, f_50_, f_51_, f_53_, f_54_, f_56_, f_57_, f_59_, f_60_, f_62_);
                            f_21_ += f_63_;
                            f_23_ += f_75_;
                            f_24_ += f_64_;
                            f_26_ += f_76_;
                            f_27_ += f_65_;
                            f_29_ += f_77_;
                            f_30_ += f_66_;
                            f_32_ += f_78_;
                            i_36_ += f_67_;
                            i_38_ += f_79_;
                            f_45_ += f_68_;
                            f_47_ += f_80_;
                            f_48_ += f_69_;
                            f_50_ += f_81_;
                            f_51_ += f_70_;
                            f_53_ += f_82_;
                            f_54_ += f_71_;
                            f_56_ += f_83_;
                            f_57_ += f_72_;
                            f_59_ += f_84_;
                            f_60_ += f_73_;
                            f_62_ += f_85_;
                            f += (float) anInt2716;
                        }
                    }
                }
            }
        } else if (f_19_ <= f_20_) {
            if (!(f_19_ >= (float) ((Class244) this).anInt2717)) {
                if (f_20_ > (float) ((Class244) this).anInt2717)
                    f_20_ = (float) ((Class244) this).anInt2717;
                if (f > (float) ((Class244) this).anInt2717)
                    f = (float) ((Class244) this).anInt2717;
                if (f_20_ < f) {
                    f_21_ = f_22_;
                    f_24_ = f_25_;
                    f_27_ = f_28_;
                    f_30_ = f_31_;
                    i_36_ = i_37_;
                    f_45_ = f_46_;
                    f_48_ = f_49_;
                    f_51_ = f_52_;
                    f_54_ = f_55_;
                    f_57_ = f_58_;
                    f_60_ = f_61_;
                    if (f_19_ < 0.0F) {
                        f_21_ -= f_63_ * f_19_;
                        f_22_ -= f_75_ * f_19_;
                        f_24_ -= f_64_ * f_19_;
                        f_25_ -= f_76_ * f_19_;
                        f_27_ -= f_65_ * f_19_;
                        f_28_ -= f_77_ * f_19_;
                        f_30_ -= f_66_ * f_19_;
                        f_31_ -= f_78_ * f_19_;
                        i_36_ -= f_67_ * f_19_;
                        i_37_ -= f_79_ * f_19_;
                        f_45_ -= f_68_ * f_19_;
                        f_46_ -= f_80_ * f_19_;
                        f_48_ -= f_69_ * f_19_;
                        f_49_ -= f_81_ * f_19_;
                        f_51_ -= f_70_ * f_19_;
                        f_52_ -= f_82_ * f_19_;
                        f_54_ -= f_71_ * f_19_;
                        f_55_ -= f_83_ * f_19_;
                        f_57_ -= f_72_ * f_19_;
                        f_58_ -= f_84_ * f_19_;
                        f_60_ -= f_73_ * f_19_;
                        f_61_ -= f_85_ * f_19_;
                        f_19_ = 0.0F;
                    }
                    if (f_20_ < 0.0F) {
                        f_23_ -= f_87_ * f_20_;
                        f_26_ -= f_88_ * f_20_;
                        f_29_ -= f_89_ * f_20_;
                        f_32_ -= f_90_ * f_20_;
                        i_38_ -= f_91_ * f_20_;
                        f_47_ -= f_92_ * f_20_;
                        f_50_ -= f_93_ * f_20_;
                        f_53_ -= f_94_ * f_20_;
                        f_56_ -= f_95_ * f_20_;
                        f_59_ -= f_96_ * f_20_;
                        f_62_ -= f_97_ * f_20_;
                        f_20_ = 0.0F;
                    }
                    if (f_19_ != f_20_ && f_63_ < f_75_ || f_19_ == f_20_ && f_63_ > f_87_) {
                        f -= f_20_;
                        f_20_ -= f_19_;
                        f_19_ = (float) (((Class244) this).anIntArray2720[(int) f_19_]);
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_21_, (int) f_22_, f_24_, f_25_, f_27_, f_28_, f_30_, f_31_, (float) i_36_, (float) i_37_, f_45_, f_46_, f_48_, f_49_, f_51_, f_52_, f_54_, f_55_, f_57_, f_58_, f_60_, f_61_);
                            f_21_ += f_63_;
                            f_22_ += f_75_;
                            f_24_ += f_64_;
                            f_25_ += f_76_;
                            f_27_ += f_65_;
                            f_28_ += f_77_;
                            f_30_ += f_66_;
                            f_31_ += f_78_;
                            i_36_ += f_67_;
                            i_37_ += f_79_;
                            f_45_ += f_68_;
                            f_46_ += f_80_;
                            f_48_ += f_69_;
                            f_49_ += f_81_;
                            f_51_ += f_70_;
                            f_52_ += f_82_;
                            f_54_ += f_71_;
                            f_55_ += f_83_;
                            f_57_ += f_72_;
                            f_58_ += f_84_;
                            f_60_ += f_73_;
                            f_61_ += f_85_;
                            f_19_ += (float) anInt2716;
                        }
                        while (--f >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_21_, (int) f_23_, f_24_, f_26_, f_27_, f_29_, f_30_, f_32_, (float) i_36_, (float) i_38_, f_45_, f_47_, f_48_, f_50_, f_51_, f_53_, f_54_, f_56_, f_57_, f_59_, f_60_, f_62_);
                            f_21_ += f_63_;
                            f_23_ += f_87_;
                            f_24_ += f_64_;
                            f_26_ += f_88_;
                            f_27_ += f_65_;
                            f_29_ += f_89_;
                            f_30_ += f_66_;
                            f_32_ += f_90_;
                            i_36_ += f_67_;
                            i_38_ += f_91_;
                            f_45_ += f_68_;
                            f_47_ += f_92_;
                            f_48_ += f_69_;
                            f_50_ += f_93_;
                            f_51_ += f_70_;
                            f_53_ += f_94_;
                            f_54_ += f_71_;
                            f_56_ += f_95_;
                            f_57_ += f_72_;
                            f_59_ += f_96_;
                            f_60_ += f_73_;
                            f_62_ += f_97_;
                            f_19_ += (float) anInt2716;
                        }
                    } else {
                        f -= f_20_;
                        f_20_ -= f_19_;
                        f_19_ = (float) (((Class244) this).anIntArray2720[(int) f_19_]);
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_22_, (int) f_21_, f_25_, f_24_, f_28_, f_27_, f_31_, f_30_, (float) i_37_, (float) i_36_, f_46_, f_45_, f_49_, f_48_, f_52_, f_51_, f_55_, f_54_, f_58_, f_57_, f_61_, f_60_);
                            f_22_ += f_75_;
                            f_21_ += f_63_;
                            f_25_ += f_76_;
                            f_24_ += f_64_;
                            f_28_ += f_77_;
                            f_27_ += f_65_;
                            f_31_ += f_78_;
                            f_30_ += f_66_;
                            i_37_ += f_79_;
                            i_36_ += f_67_;
                            f_46_ += f_80_;
                            f_45_ += f_68_;
                            f_49_ += f_81_;
                            f_48_ += f_69_;
                            f_52_ += f_82_;
                            f_51_ += f_70_;
                            f_55_ += f_83_;
                            f_54_ += f_71_;
                            f_59_ += f_84_;
                            f_57_ += f_72_;
                            f_61_ += f_85_;
                            f_60_ += f_73_;
                            f_19_ += (float) anInt2716;
                        }
                        while (--f >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_23_, (int) f_21_, f_26_, f_24_, f_29_, f_27_, f_32_, f_30_, (float) i_38_, (float) i_36_, f_47_, f_45_, f_50_, f_48_, f_53_, f_51_, f_56_, f_54_, f_59_, f_57_, f_62_, f_60_);
                            f_23_ += f_87_;
                            f_21_ += f_63_;
                            f_26_ += f_88_;
                            f_24_ += f_64_;
                            f_29_ += f_89_;
                            f_27_ += f_65_;
                            f_32_ += f_90_;
                            f_30_ += f_66_;
                            i_38_ += f_91_;
                            i_36_ += f_67_;
                            f_47_ += f_92_;
                            f_45_ += f_68_;
                            f_50_ += f_93_;
                            f_48_ += f_69_;
                            f_53_ += f_94_;
                            f_51_ += f_70_;
                            f_56_ += f_95_;
                            f_54_ += f_71_;
                            f_59_ += f_96_;
                            f_57_ += f_72_;
                            f_62_ += f_97_;
                            f_60_ += f_73_;
                            f_19_ += (float) anInt2716;
                        }
                    }
                } else {
                    f_23_ = f_22_;
                    f_26_ = f_25_;
                    f_29_ = f_28_;
                    f_32_ = f_31_;
                    i_38_ = i_37_;
                    f_47_ = f_46_;
                    f_50_ = f_49_;
                    f_53_ = f_52_;
                    f_56_ = f_55_;
                    f_59_ = f_58_;
                    f_62_ = f_61_;
                    if (f_19_ < 0.0F) {
                        f_23_ -= f_63_ * f_19_;
                        f_22_ -= f_75_ * f_19_;
                        f_26_ -= f_64_ * f_19_;
                        f_25_ -= f_76_ * f_19_;
                        f_29_ -= f_65_ * f_19_;
                        f_28_ -= f_77_ * f_19_;
                        f_32_ -= f_66_ * f_19_;
                        f_31_ -= f_78_ * f_19_;
                        i_38_ -= f_67_ * f_19_;
                        i_37_ -= f_79_ * f_19_;
                        f_47_ -= f_68_ * f_19_;
                        f_46_ -= f_80_ * f_19_;
                        f_50_ -= f_69_ * f_19_;
                        f_49_ -= f_81_ * f_19_;
                        f_53_ -= f_70_ * f_19_;
                        f_52_ -= f_82_ * f_19_;
                        f_56_ -= f_71_ * f_19_;
                        f_55_ -= f_83_ * f_19_;
                        f_59_ -= f_72_ * f_19_;
                        f_58_ -= f_84_ * f_19_;
                        f_62_ -= f_73_ * f_19_;
                        f_61_ -= f_85_ * f_19_;
                        f_19_ = 0.0F;
                    }
                    if (f < 0.0F) {
                        f_21_ -= f_87_ * f;
                        f_24_ -= f_88_ * f;
                        f_27_ -= f_89_ * f;
                        f_30_ -= f_90_ * f;
                        i_36_ -= f_91_ * f;
                        f_45_ -= f_92_ * f;
                        f_48_ -= f_93_ * f;
                        f_51_ -= f_94_ * f;
                        f_54_ -= f_95_ * f;
                        f_57_ -= f_96_ * f;
                        f_60_ -= f_97_ * f;
                        f = 0.0F;
                    }
                    f_20_ -= f;
                    f -= f_19_;
                    f_19_ = (float) (((Class244) this).anIntArray2720[(int) f_19_]);
                    if (f_63_ < f_75_) {
                        while (--f >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_23_, (int) f_22_, f_26_, f_25_, f_29_, f_28_, f_32_, f_31_, (float) i_38_, (float) i_37_, f_47_, f_46_, f_50_, f_49_, f_53_, f_52_, f_56_, f_55_, f_59_, f_58_, f_62_, f_61_);
                            f_23_ += f_63_;
                            f_22_ += f_75_;
                            f_26_ += f_64_;
                            f_25_ += f_76_;
                            f_29_ += f_65_;
                            f_28_ += f_77_;
                            f_32_ += f_66_;
                            f_31_ += f_78_;
                            i_38_ += f_67_;
                            i_37_ += f_79_;
                            f_47_ += f_68_;
                            f_46_ += f_80_;
                            f_50_ += f_69_;
                            f_49_ += f_81_;
                            f_53_ += f_70_;
                            f_52_ += f_82_;
                            f_56_ += f_71_;
                            f_55_ += f_83_;
                            f_59_ += f_72_;
                            f_58_ += f_84_;
                            f_62_ += f_73_;
                            f_61_ += f_85_;
                            f_19_ += (float) anInt2716;
                        }
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_21_, (int) f_22_, f_24_, f_25_, f_27_, f_28_, f_30_, f_31_, (float) i_36_, (float) i_37_, f_45_, f_46_, f_48_, f_49_, f_51_, f_52_, f_54_, f_55_, f_57_, f_58_, f_60_, f_61_);
                            f_21_ += f_87_;
                            f_22_ += f_75_;
                            f_24_ += f_88_;
                            f_25_ += f_76_;
                            f_27_ += f_89_;
                            f_28_ += f_77_;
                            f_30_ += f_90_;
                            f_31_ += f_78_;
                            i_36_ += f_91_;
                            i_37_ += f_79_;
                            f_45_ += f_92_;
                            f_46_ += f_80_;
                            f_48_ += f_93_;
                            f_49_ += f_81_;
                            f_51_ += f_94_;
                            f_52_ += f_82_;
                            f_54_ += f_95_;
                            f_55_ += f_83_;
                            f_57_ += f_96_;
                            f_58_ += f_84_;
                            f_60_ += f_97_;
                            f_61_ += f_85_;
                            f_19_ += (float) anInt2716;
                        }
                    } else {
                        while (--f >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_22_, (int) f_23_, f_25_, f_26_, f_28_, f_29_, f_31_, f_32_, (float) i_37_, (float) i_38_, f_46_, f_47_, f_49_, f_50_, f_52_, f_53_, f_55_, f_56_, f_58_, f_59_, f_61_, f_62_);
                            f_22_ += f_75_;
                            f_23_ += f_63_;
                            f_25_ += f_76_;
                            f_26_ += f_64_;
                            f_28_ += f_77_;
                            f_29_ += f_65_;
                            f_31_ += f_78_;
                            f_32_ += f_66_;
                            i_37_ += f_79_;
                            i_38_ += f_67_;
                            f_46_ += f_80_;
                            f_47_ += f_68_;
                            f_49_ += f_81_;
                            f_50_ += f_69_;
                            f_52_ += f_82_;
                            f_53_ += f_70_;
                            f_55_ += f_83_;
                            f_56_ += f_71_;
                            f_58_ += f_84_;
                            f_59_ += f_72_;
                            f_61_ += f_85_;
                            f_62_ += f_73_;
                            f_19_ += (float) anInt2716;
                        }
                        while (--f_20_ >= 0.0F) {
                            method1945(anIntArray2721, anIntArray2737, (int) f_19_, (int) f_22_, (int) f_21_, f_25_, f_24_, f_28_, f_27_, f_31_, f_30_, (float) i_37_, (float) i_36_, f_46_, f_45_, f_49_, f_48_, f_52_, f_51_, f_55_, f_54_, f_58_, f_57_, f_61_, f_60_);
                            f_22_ += f_75_;
                            f_21_ += f_87_;
                            f_25_ += f_76_;
                            f_24_ += f_88_;
                            f_28_ += f_77_;
                            f_27_ += f_89_;
                            f_31_ += f_78_;
                            f_30_ += f_90_;
                            i_37_ += f_79_;
                            i_36_ += f_91_;
                            f_46_ += f_80_;
                            f_45_ += f_92_;
                            f_49_ += f_81_;
                            f_48_ += f_93_;
                            f_52_ += f_82_;
                            f_51_ += f_94_;
                            f_55_ += f_83_;
                            f_54_ += f_95_;
                            f_58_ += f_84_;
                            f_57_ += f_96_;
                            f_61_ += f_85_;
                            f_60_ += f_97_;
                            f_19_ += (float) anInt2716;
                        }
                    }
                }
            }
        } else if (!(f_20_ >= (float) ((Class244) this).anInt2717)) {
            if (f > (float) ((Class244) this).anInt2717)
                f = (float) ((Class244) this).anInt2717;
            if (f_19_ > (float) ((Class244) this).anInt2717)
                f_19_ = (float) ((Class244) this).anInt2717;
            if (f < f_19_) {
                f_22_ = f_23_;
                f_25_ = f_26_;
                f_28_ = f_29_;
                f_31_ = f_32_;
                i_37_ = i_38_;
                f_46_ = f_47_;
                f_49_ = f_50_;
                f_52_ = f_53_;
                f_55_ = f_56_;
                f_58_ = f_59_;
                f_61_ = f_62_;
                if (f_20_ < 0.0F) {
                    f_23_ -= f_87_ * f_20_;
                    f_22_ -= f_75_ * f_20_;
                    f_26_ -= f_88_ * f_20_;
                    f_25_ -= f_76_ * f_20_;
                    f_29_ -= f_89_ * f_20_;
                    f_28_ -= f_77_ * f_20_;
                    f_32_ -= f_90_ * f_20_;
                    f_31_ -= f_78_ * f_20_;
                    i_38_ -= f_91_ * 3.0F;
                    i_37_ -= f_79_ * f_20_;
                    f_47_ -= f_92_ * f_20_;
                    f_46_ -= f_80_ * f_20_;
                    f_50_ -= f_93_ * f_20_;
                    f_49_ -= f_81_ * f_20_;
                    f_53_ -= f_94_ * f_20_;
                    f_52_ -= f_82_ * f_20_;
                    f_56_ -= f_95_ * f_20_;
                    f_55_ -= f_83_ * f_20_;
                    f_59_ -= f_96_ * f_20_;
                    f_58_ -= f_84_ * f_20_;
                    f_62_ -= f_97_ * f_20_;
                    f_61_ -= f_85_ * f_20_;
                    f_20_ = 0.0F;
                }
                if (f < 0.0F) {
                    f_21_ -= f_63_ * f;
                    f_24_ -= f_64_ * f;
                    f_27_ -= f_65_ * f;
                    f_30_ -= f_66_ * f;
                    i_36_ -= f_67_ * f;
                    f_45_ -= f_68_ * f;
                    f_48_ -= f_69_ * f;
                    f_51_ -= f_70_ * f;
                    f_54_ -= f_71_ * f;
                    f_57_ -= f_72_ * f;
                    f_60_ -= f_73_ * f;
                    f = 0.0F;
                }
                if (f_75_ < f_87_) {
                    f_19_ -= f;
                    f -= f_20_;
                    f_20_ = (float) (((Class244) this).anIntArray2720[(int) f_20_]);
                    while (--f >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_22_, (int) f_23_, f_25_, f_26_, f_28_, f_29_, f_31_, f_32_, (float) i_37_, (float) i_38_, f_46_, f_47_, f_49_, f_50_, f_52_, f_53_, f_55_, f_56_, f_58_, f_59_, f_61_, f_62_);
                        f_22_ += f_75_;
                        f_23_ += f_87_;
                        f_25_ += f_76_;
                        f_26_ += f_88_;
                        f_28_ += f_77_;
                        f_29_ += f_89_;
                        f_31_ += f_78_;
                        f_32_ += f_90_;
                        i_37_ += f_79_;
                        i_38_ += f_91_;
                        f_46_ += f_80_;
                        f_47_ += f_92_;
                        f_49_ += f_81_;
                        f_50_ += f_93_;
                        f_52_ += f_82_;
                        f_53_ += f_94_;
                        f_55_ += f_83_;
                        f_56_ += f_95_;
                        f_58_ += f_84_;
                        f_59_ += f_96_;
                        f_61_ += f_85_;
                        f_62_ += f_97_;
                        f_20_ += (float) anInt2716;
                    }
                    while (--f_19_ >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_22_, (int) f_21_, f_25_, f_24_, f_28_, f_27_, f_31_, f_30_, (float) i_37_, (float) i_36_, f_46_, f_45_, f_49_, f_48_, f_52_, f_51_, f_55_, f_54_, f_58_, f_57_, f_61_, f_60_);
                        f_22_ += f_75_;
                        f_21_ += f_63_;
                        f_25_ += f_76_;
                        f_24_ += f_64_;
                        f_28_ += f_77_;
                        f_27_ += f_65_;
                        f_31_ += f_78_;
                        f_30_ += f_66_;
                        i_37_ += f_79_;
                        i_36_ += f_67_;
                        f_46_ += f_80_;
                        f_45_ += f_68_;
                        f_49_ += f_81_;
                        f_48_ += f_69_;
                        f_52_ += f_82_;
                        f_51_ += f_70_;
                        f_55_ += f_83_;
                        f_54_ += f_71_;
                        f_58_ += f_84_;
                        f_57_ += f_72_;
                        f_61_ += f_85_;
                        f_60_ += f_73_;
                        f_20_ += (float) anInt2716;
                    }
                } else {
                    f_19_ -= f;
                    f -= f_20_;
                    f_20_ = (float) (((Class244) this).anIntArray2720[(int) f_20_]);
                    while (--f >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_23_, (int) f_22_, f_26_, f_25_, f_29_, f_28_, f_32_, f_31_, (float) i_38_, (float) i_37_, f_47_, f_46_, f_50_, f_49_, f_53_, f_52_, f_56_, f_55_, f_59_, f_58_, f_62_, f_61_);
                        f_23_ += f_87_;
                        f_22_ += f_75_;
                        f_26_ += f_88_;
                        f_25_ += f_76_;
                        f_29_ += f_89_;
                        f_28_ += f_77_;
                        f_32_ += f_90_;
                        f_31_ += f_78_;
                        i_38_ += f_91_;
                        i_37_ += f_79_;
                        f_47_ += f_92_;
                        f_46_ += f_80_;
                        f_50_ += f_93_;
                        f_49_ += f_81_;
                        f_53_ += f_94_;
                        f_52_ += f_82_;
                        f_56_ += f_95_;
                        f_55_ += f_83_;
                        f_59_ += f_96_;
                        f_58_ += f_84_;
                        f_62_ += f_97_;
                        f_61_ += f_85_;
                        f_20_ += (float) anInt2716;
                    }
                    while (--f_19_ >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_21_, (int) f_22_, f_24_, f_25_, f_27_, f_28_, f_30_, f_31_, (float) i_36_, (float) i_37_, f_45_, f_46_, f_48_, f_49_, f_51_, f_52_, f_54_, f_55_, f_57_, f_58_, f_60_, f_61_);
                        f_21_ += f_63_;
                        f_22_ += f_75_;
                        f_24_ += f_64_;
                        f_25_ += f_76_;
                        f_27_ += f_65_;
                        f_28_ += f_77_;
                        f_30_ += f_66_;
                        f_31_ += f_78_;
                        i_36_ += f_67_;
                        i_37_ += f_79_;
                        f_45_ += f_68_;
                        f_46_ += f_80_;
                        f_48_ += f_69_;
                        f_49_ += f_81_;
                        f_51_ += f_70_;
                        f_52_ += f_82_;
                        f_54_ += f_71_;
                        f_55_ += f_83_;
                        f_57_ += f_72_;
                        f_58_ += f_84_;
                        f_60_ += f_73_;
                        f_61_ += f_85_;
                        f_20_ += (float) anInt2716;
                    }
                }
            } else {
                f_21_ = f_23_;
                f_24_ = f_26_;
                f_27_ = f_29_;
                f_30_ = f_32_;
                i_36_ = i_38_;
                f_45_ = f_47_;
                f_48_ = f_50_;
                f_51_ = f_53_;
                f_54_ = f_56_;
                f_57_ = f_59_;
                f_60_ = f_62_;
                if (f_20_ < 0.0F) {
                    f_23_ -= f_87_ * f_20_;
                    f_21_ -= f_75_ * f_20_;
                    f_26_ -= f_88_ * f_20_;
                    f_24_ -= f_76_ * f_20_;
                    f_29_ -= f_89_ * f_20_;
                    f_27_ -= f_77_ * f_20_;
                    f_32_ -= f_90_ * f_20_;
                    f_30_ -= f_78_ * f_20_;
                    i_38_ -= f_91_ * 3.0F;
                    i_36_ -= f_79_ * f_20_;
                    f_47_ -= f_92_ * f_20_;
                    f_45_ -= f_80_ * f_20_;
                    f_50_ -= f_93_ * f_20_;
                    f_48_ -= f_81_ * f_20_;
                    f_53_ -= f_94_ * f_20_;
                    f_51_ -= f_82_ * f_20_;
                    f_56_ -= f_95_ * f_20_;
                    f_54_ -= f_83_ * f_20_;
                    f_59_ -= f_96_ * f_20_;
                    f_57_ -= f_84_ * f_20_;
                    f_62_ -= f_97_ * f_20_;
                    f_60_ -= f_85_ * f_20_;
                    f_20_ = 0.0F;
                }
                if (f_19_ < 0.0F) {
                    f_22_ -= f_63_ * f_19_;
                    f_25_ -= f_64_ * f_19_;
                    f_28_ -= f_65_ * f_19_;
                    f_31_ -= f_66_ * f_19_;
                    i_37_ -= f_67_ * f_19_;
                    f_46_ -= f_68_ * f_19_;
                    f_49_ -= f_69_ * f_19_;
                    f_52_ -= f_70_ * f_19_;
                    f_55_ -= f_71_ * f_19_;
                    f_58_ -= f_72_ * f_19_;
                    f_61_ -= f_73_ * f_19_;
                    f_19_ = 0.0F;
                }
                if (f_75_ < f_87_) {
                    f -= f_19_;
                    f_19_ -= f_20_;
                    f_20_ = (float) (((Class244) this).anIntArray2720[(int) f_20_]);
                    while (--f_19_ >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_21_, (int) f_23_, f_24_, f_26_, f_27_, f_29_, f_30_, f_32_, (float) i_36_, (float) i_38_, f_45_, f_47_, f_48_, f_50_, f_51_, f_53_, f_54_, f_56_, f_57_, f_59_, f_60_, f_62_);
                        f_21_ += f_75_;
                        f_23_ += f_87_;
                        f_24_ += f_76_;
                        f_26_ += f_88_;
                        f_27_ += f_77_;
                        f_29_ += f_89_;
                        f_30_ += f_78_;
                        f_32_ += f_90_;
                        i_36_ += f_79_;
                        i_38_ += f_91_;
                        f_45_ += f_80_;
                        f_47_ += f_92_;
                        f_48_ += f_81_;
                        f_50_ += f_93_;
                        f_51_ += f_82_;
                        f_53_ += f_94_;
                        f_54_ += f_83_;
                        f_56_ += f_95_;
                        f_57_ += f_84_;
                        f_59_ += f_96_;
                        f_60_ += f_85_;
                        f_62_ += f_97_;
                        f_20_ += (float) anInt2716;
                    }
                    while (--f >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_22_, (int) f_23_, f_25_, f_26_, f_28_, f_29_, f_31_, f_32_, (float) i_37_, (float) i_38_, f_46_, f_47_, f_49_, f_50_, f_52_, f_53_, f_55_, f_56_, f_58_, f_59_, f_61_, f_62_);
                        f_22_ += f_63_;
                        f_23_ += f_87_;
                        f_25_ += f_64_;
                        f_26_ += f_88_;
                        f_28_ += f_65_;
                        f_29_ += f_89_;
                        f_31_ += f_66_;
                        f_32_ += f_90_;
                        i_37_ += f_67_;
                        i_38_ += f_91_;
                        f_46_ += f_68_;
                        f_47_ += f_92_;
                        f_49_ += f_69_;
                        f_50_ += f_93_;
                        f_52_ += f_70_;
                        f_53_ += f_94_;
                        f_55_ += f_71_;
                        f_56_ += f_95_;
                        f_58_ += f_72_;
                        f_59_ += f_96_;
                        f_61_ += f_73_;
                        f_62_ += f_97_;
                        f_20_ += (float) anInt2716;
                    }
                } else {
                    f -= f_19_;
                    f_19_ -= f_20_;
                    f_20_ = (float) (((Class244) this).anIntArray2720[(int) f_20_]);
                    while (--f_19_ >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_23_, (int) f_21_, f_26_, f_24_, f_29_, f_27_, f_32_, f_30_, (float) i_38_, (float) i_36_, f_47_, f_45_, f_50_, f_48_, f_53_, f_51_, f_56_, f_54_, f_59_, f_57_, f_62_, f_60_);
                        f_23_ += f_87_;
                        f_21_ += f_75_;
                        f_26_ += f_88_;
                        f_24_ += f_76_;
                        f_29_ += f_89_;
                        f_27_ += f_77_;
                        f_32_ += f_90_;
                        f_30_ += f_78_;
                        i_38_ += f_91_;
                        i_36_ += f_79_;
                        f_47_ += f_92_;
                        f_45_ += f_80_;
                        f_50_ += f_93_;
                        f_48_ += f_81_;
                        f_53_ += f_94_;
                        f_51_ += f_82_;
                        f_56_ += f_95_;
                        f_54_ += f_83_;
                        f_59_ += f_96_;
                        f_57_ += f_84_;
                        f_62_ += f_97_;
                        f_60_ += f_85_;
                        f_20_ += (float) anInt2716;
                    }
                    while (--f >= 0.0F) {
                        method1945(anIntArray2721, anIntArray2737, (int) f_20_, (int) f_23_, (int) f_22_, f_26_, f_25_, f_29_, f_28_, f_32_, f_31_, (float) i_38_, (float) i_37_, f_47_, f_46_, f_50_, f_49_, f_53_, f_52_, f_56_, f_55_, f_59_, f_58_, f_62_, f_61_);
                        f_23_ += f_87_;
                        f_22_ += f_63_;
                        f_26_ += f_88_;
                        f_25_ += f_64_;
                        f_29_ += f_89_;
                        f_28_ += f_65_;
                        f_32_ += f_90_;
                        f_31_ += f_66_;
                        i_38_ += f_91_;
                        i_37_ += f_67_;
                        f_47_ += f_92_;
                        f_46_ += f_68_;
                        f_50_ += f_93_;
                        f_49_ += f_69_;
                        f_53_ += f_94_;
                        f_52_ += f_70_;
                        f_56_ += f_95_;
                        f_55_ += f_71_;
                        f_59_ += f_96_;
                        f_58_ += f_72_;
                        f_62_ += f_97_;
                        f_61_ += f_73_;
                        f_20_ += (float) anInt2716;
                    }
                }
            }
        }
    }

    final void method1944(boolean bool) {
        aBoolean2725 = bool;
    }

    private final void method1945(int[] is, int[] is_99_, int i, int i_100_, int i_101_, float f, float f_102_, float f_103_, float f_104_, float f_105_, float f_106_, float f_107_, float f_108_, float f_109_, float f_110_, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_, float f_119_, float f_120_) {
        int i_121_ = i_101_ - i_100_;
        float f_122_ = 1.0F / (float) i_121_;
        float f_123_ = (f_102_ - f) * f_122_;
        float f_124_ = (f_104_ - f_103_) * f_122_;
        float f_125_ = (f_106_ - f_105_) * f_122_;
        float f_126_ = (f_108_ - f_107_) * f_122_;
        float f_127_ = (f_112_ - f_111_) * f_122_;
        float f_128_ = (f_114_ - f_113_) * f_122_;
        float f_129_ = (f_116_ - f_115_) * f_122_;
        float f_130_ = (f_118_ - f_117_) * f_122_;
        float f_131_ = (f_120_ - f_119_) * f_122_;
        if (((Class244) this).aBoolean2723) {
            if (i_101_ > ((Class244) this).anInt2713)
                i_101_ = ((Class244) this).anInt2713;
            if (i_100_ < 0) {
                f -= f_123_ * (float) i_100_;
                f_103_ -= f_124_ * (float) i_100_;
                f_105_ -= f_125_ * (float) i_100_;
                f_107_ -= f_126_ * (float) i_100_;
                f_111_ -= f_127_ * (float) i_100_;
                f_113_ -= f_128_ * (float) i_100_;
                f_115_ -= f_129_ * (float) i_100_;
                f_117_ -= f_130_ * (float) i_100_;
                f_119_ -= f_131_ * (float) i_100_;
                i_100_ = 0;
            }
        }
        if (i_100_ < i_101_) {
            i_121_ = i_101_ - i_100_;
            i += i_100_;
            while (i_121_-- > 0) {
                float f_132_ = 1.0F / f;
                if (f_132_ < aFloatArray2726[i]) {
                    float f_133_ = f_103_ * f_132_;
                    float f_134_ = f_105_ * f_132_;
                    int i_135_ = ((int) (f_133_ * (float) anInt2731 * aFloat2732) & anInt2727);
                    int i_136_ = ((int) (f_134_ * (float) anInt2731 * aFloat2732) & anInt2727);
                    int i_137_ = anIntArray2737[i_136_ * anInt2731 + i_135_];
                    i_135_ = ((int) (f_133_ * (float) anInt2738 * aFloat2734) & anInt2729);
                    i_136_ = ((int) (f_134_ * (float) anInt2738 * aFloat2734) & anInt2729);
                    int i_138_ = anIntArray2735[i_136_ * anInt2738 + i_135_];
                    i_135_ = ((int) (f_133_ * (float) anInt2742 * aFloat2739) & anInt2736);
                    i_136_ = ((int) (f_134_ * (float) anInt2742 * aFloat2739) & anInt2736);
                    int i_139_ = anIntArray2740[i_136_ * anInt2742 + i_135_];
                    float f_140_ = 1.0F - (f_117_ + f_119_);
                    i_137_ = (~0xffffff | ((int) (f_117_ * (float) (i_137_ >> 16 & 0xff)) << 16) | (int) (f_117_ * (float) (i_137_ >> 8 & 0xff)) << 8 | (int) (f_117_ * (float) (i_137_ & 0xff)));
                    i_138_ = (~0xffffff | ((int) (f_119_ * (float) (i_138_ >> 16 & 0xff)) << 16) | (int) (f_119_ * (float) (i_138_ >> 8 & 0xff)) << 8 | (int) (f_119_ * (float) (i_138_ & 0xff)));
                    i_139_ = (~0xffffff | ((int) (f_140_ * (float) (i_139_ >> 16 & 0xff)) << 16) | (int) (f_140_ * (float) (i_139_ >> 8 & 0xff)) << 8 | (int) (f_140_ * (float) (i_139_ & 0xff)));
                    int i_141_ = i_137_ + i_138_ + i_139_;
                    int i_142_ = (~0xffffff | ((int) (f_111_ * (float) (i_141_ >> 16 & 0xff)) << 8) & 0xff0000 | ((int) (f_113_ * (float) (i_141_ >> 8 & 0xff)) & 0xff00) | (int) (f_115_ * (float) (i_141_ & 0xff)) >> 8);
                    if (f_107_ != 0.0F) {
                        int i_143_ = (int) (255.0F - f_107_);
                        int i_144_ = ((((anInt2741 & 0xff00ff) * (int) f_107_ & ~0xff00ff) | ((anInt2741 & 0xff00) * (int) f_107_ & 0xff0000)) >>> 8);
                        i_142_ = (((i_142_ & 0xff00ff) * i_143_ & ~0xff00ff | (i_142_ & 0xff00) * i_143_ & 0xff0000) >>> 8) + i_144_;
                    }
                    is[i] = i_142_;
                    aFloatArray2726[i] = f_132_;
                }
                i++;
                f += f_123_;
                f_103_ += f_124_;
                f_105_ += f_125_;
                f_107_ += f_126_;
                f_111_ += f_127_;
                f_113_ += f_128_;
                f_115_ += f_129_;
                f_117_ += f_130_;
                f_119_ += f_131_;
            }
        }
    }

    private final void method1946(int[] is, float[] fs, int i, int i_145_, int i_146_, int i_147_, int i_148_, float f, float f_149_, float f_150_, float f_151_) {
        if (((Class244) this).aBoolean2723) {
            if (i_148_ > ((Class244) this).anInt2713)
                i_148_ = ((Class244) this).anInt2713;
            if (i_147_ < 0)
                i_147_ = 0;
        }
        if (i_147_ < i_148_) {
            i += i_147_ - 1;
            f += f_149_ * (float) i_147_;
            f_150_ += f_151_ * (float) i_147_;
            if (((Class203) aClass203_2719).aBoolean2316) {
                do {
                    if (((Class244) this).aBoolean2711) {
                        i_146_ = i_148_ - i_147_ >> 2;
                        f_149_ *= 4.0F;
                        if (((Class244) this).anInt2718 == 0) {
                            if (i_146_ > 0) {
                                do {
                                    i_145_ = Node.anIntArray2801[(int) f];
                                    f += f_149_;
                                    if (f_150_ < fs[++i]) {
                                        is[i] = i_145_;
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        is[i] = i_145_;
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        is[i] = i_145_;
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        is[i] = i_145_;
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                } while (--i_146_ > 0);
                            }
                            i_146_ = i_148_ - i_147_ & 0x3;
                            if (i_146_ > 0) {
                                i_145_ = Node.anIntArray2801[(int) f];
                                do {
                                    if (f_150_ < fs[++i]) {
                                        is[i] = i_145_;
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                } while (--i_146_ > 0);
                            }
                        } else {
                            int i_152_ = ((Class244) this).anInt2718;
                            int i_153_ = 256 - ((Class244) this).anInt2718;
                            if (i_146_ > 0) {
                                do {
                                    i_145_ = Node.anIntArray2801[(int) f];
                                    f += f_149_;
                                    i_145_ = (((i_145_ & 0xff00ff) * i_153_ >> 8 & 0xff00ff) + ((i_145_ & 0xff00) * i_153_ >> 8 & 0xff00));
                                    if (f_150_ < fs[++i]) {
                                        int i_154_ = is[i];
                                        is[i] = (i_145_ + (((i_154_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_154_ & 0xff00) * i_152_ >> 8) & 0xff00));
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        int i_155_ = is[i];
                                        is[i] = (i_145_ + (((i_155_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_155_ & 0xff00) * i_152_ >> 8) & 0xff00));
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        int i_156_ = is[i];
                                        is[i] = (i_145_ + (((i_156_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_156_ & 0xff00) * i_152_ >> 8) & 0xff00));
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        int i_157_ = is[i];
                                        is[i] = (i_145_ + (((i_157_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_157_ & 0xff00) * i_152_ >> 8) & 0xff00));
                                        fs[i] = f_150_;
                                    }
                                    f_150_ += f_151_;
                                } while (--i_146_ > 0);
                            }
                            i_146_ = i_148_ - i_147_ & 0x3;
                            if (i_146_ <= 0)
                                break;
                            i_145_ = Node.anIntArray2801[(int) f];
                            i_145_ = (((i_145_ & 0xff00ff) * i_153_ >> 8 & 0xff00ff) + ((i_145_ & 0xff00) * i_153_ >> 8 & 0xff00));
                            do {
                                if (f_150_ < fs[++i]) {
                                    int i_158_ = is[i];
                                    is[i] = (i_145_ + ((i_158_ & 0xff00ff) * i_152_ >> 8 & 0xff00ff) + ((i_158_ & 0xff00) * i_152_ >> 8 & 0xff00));
                                    fs[i] = f_150_;
                                }
                                f_150_ += f_151_;
                            } while (--i_146_ > 0);
                        }
                        break;
                    }
                    i_146_ = i_148_ - i_147_;
                    if (((Class244) this).anInt2718 == 0) {
                        do {
                            if (f_150_ < fs[++i]) {
                                is[i] = Node.anIntArray2801[(int) f];
                                fs[i] = f_150_;
                            }
                            f_150_ += f_151_;
                            f += f_149_;
                        } while (--i_146_ > 0);
                        break;
                    }
                    int i_159_ = ((Class244) this).anInt2718;
                    int i_160_ = 256 - ((Class244) this).anInt2718;
                    do {
                        if (f_150_ < fs[++i]) {
                            i_145_ = Node.anIntArray2801[(int) f];
                            i_145_ = (((i_145_ & 0xff00ff) * i_160_ >> 8 & 0xff00ff) + ((i_145_ & 0xff00) * i_160_ >> 8 & 0xff00));
                            int i_161_ = is[i];
                            is[i] = (i_145_ + ((i_161_ & 0xff00ff) * i_159_ >> 8 & 0xff00ff) + ((i_161_ & 0xff00) * i_159_ >> 8 & 0xff00));
                            fs[i] = f_150_;
                        }
                        f += f_149_;
                        f_150_ += f_151_;
                    } while (--i_146_ > 0);
                } while (false);
            } else {
                do {
                    if (((Class244) this).aBoolean2711) {
                        i_146_ = i_148_ - i_147_ >> 2;
                        f_149_ *= 4.0F;
                        if (((Class244) this).anInt2718 == 0) {
                            if (i_146_ > 0) {
                                do {
                                    i_145_ = Node.anIntArray2801[(int) f];
                                    f += f_149_;
                                    if (f_150_ < fs[++i])
                                        is[i] = i_145_;
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i])
                                        is[i] = i_145_;
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i])
                                        is[i] = i_145_;
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i])
                                        is[i] = i_145_;
                                    f_150_ += f_151_;
                                } while (--i_146_ > 0);
                            }
                            i_146_ = i_148_ - i_147_ & 0x3;
                            if (i_146_ > 0) {
                                i_145_ = Node.anIntArray2801[(int) f];
                                do {
                                    if (f_150_ < fs[++i])
                                        is[i] = i_145_;
                                    f_150_ += f_151_;
                                } while (--i_146_ > 0);
                            }
                        } else {
                            int i_162_ = ((Class244) this).anInt2718;
                            int i_163_ = 256 - ((Class244) this).anInt2718;
                            if (i_146_ > 0) {
                                do {
                                    i_145_ = Node.anIntArray2801[(int) f];
                                    f += f_149_;
                                    i_145_ = (((i_145_ & 0xff00ff) * i_163_ >> 8 & 0xff00ff) + ((i_145_ & 0xff00) * i_163_ >> 8 & 0xff00));
                                    if (f_150_ < fs[++i]) {
                                        int i_164_ = is[i];
                                        is[i] = (i_145_ + (((i_164_ & 0xff00ff) * i_162_ >> 8) & 0xff00ff) + (((i_164_ & 0xff00) * i_162_ >> 8) & 0xff00));
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        int i_165_ = is[i];
                                        is[i] = (i_145_ + (((i_165_ & 0xff00ff) * i_162_ >> 8) & 0xff00ff) + (((i_165_ & 0xff00) * i_162_ >> 8) & 0xff00));
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        int i_166_ = is[i];
                                        is[i] = (i_145_ + (((i_166_ & 0xff00ff) * i_162_ >> 8) & 0xff00ff) + (((i_166_ & 0xff00) * i_162_ >> 8) & 0xff00));
                                    }
                                    f_150_ += f_151_;
                                    if (f_150_ < fs[++i]) {
                                        int i_167_ = is[i];
                                        is[i] = (i_145_ + (((i_167_ & 0xff00ff) * i_162_ >> 8) & 0xff00ff) + (((i_167_ & 0xff00) * i_162_ >> 8) & 0xff00));
                                    }
                                    f_150_ += f_151_;
                                } while (--i_146_ > 0);
                            }
                            i_146_ = i_148_ - i_147_ & 0x3;
                            if (i_146_ <= 0)
                                break;
                            i_145_ = Node.anIntArray2801[(int) f];
                            i_145_ = (((i_145_ & 0xff00ff) * i_163_ >> 8 & 0xff00ff) + ((i_145_ & 0xff00) * i_163_ >> 8 & 0xff00));
                            do {
                                if (f_150_ < fs[++i]) {
                                    int i_168_ = is[i];
                                    is[i] = (i_145_ + ((i_168_ & 0xff00ff) * i_162_ >> 8 & 0xff00ff) + ((i_168_ & 0xff00) * i_162_ >> 8 & 0xff00));
                                }
                                f_150_ += f_151_;
                            } while (--i_146_ > 0);
                        }
                        break;
                    }
                    i_146_ = i_148_ - i_147_;
                    if (((Class244) this).anInt2718 == 0) {
                        do {
                            if (f_150_ < fs[++i])
                                is[i] = Node.anIntArray2801[(int) f];
                            f_150_ += f_151_;
                            f += f_149_;
                        } while (--i_146_ > 0);
                        break;
                    }
                    int i_169_ = ((Class244) this).anInt2718;
                    int i_170_ = 256 - ((Class244) this).anInt2718;
                    do {
                        if (f_150_ < fs[++i]) {
                            i_145_ = Node.anIntArray2801[(int) f];
                            i_145_ = (((i_145_ & 0xff00ff) * i_170_ >> 8 & 0xff00ff) + ((i_145_ & 0xff00) * i_170_ >> 8 & 0xff00));
                            int i_171_ = is[i];
                            is[i] = (i_145_ + ((i_171_ & 0xff00ff) * i_169_ >> 8 & 0xff00ff) + ((i_171_ & 0xff00) * i_169_ >> 8 & 0xff00));
                        }
                        f += f_149_;
                        f_150_ += f_151_;
                    } while (--i_146_ > 0);
                } while (false);
            }
        }
    }

    private final void method1947(int[] is, int[] is_172_, int i, int i_173_, int i_174_, float f, float f_175_, float f_176_, float f_177_, float f_178_, float f_179_, float f_180_, float f_181_, float f_182_, float f_183_, float f_184_, float f_185_, float f_186_, float f_187_, float f_188_, float f_189_) {
        int i_190_ = i_174_ - i_173_;
        float f_191_ = 1.0F / (float) i_190_;
        float f_192_ = (f_175_ - f) * f_191_;
        float f_193_ = (f_177_ - f_176_) * f_191_;
        float f_194_ = (f_179_ - f_178_) * f_191_;
        float f_195_ = (f_181_ - f_180_) * f_191_;
        float f_196_ = (f_183_ - f_182_) * f_191_;
        float f_197_ = (f_185_ - f_184_) * f_191_;
        float f_198_ = (f_187_ - f_186_) * f_191_;
        float f_199_ = (f_189_ - f_188_) * f_191_;
        if (((Class244) this).aBoolean2723) {
            if (i_174_ > ((Class244) this).anInt2713)
                i_174_ = ((Class244) this).anInt2713;
            if (i_173_ < 0) {
                f -= f_192_ * (float) i_173_;
                f_176_ -= f_193_ * (float) i_173_;
                f_178_ -= f_194_ * (float) i_173_;
                f_180_ -= f_195_ * (float) i_173_;
                f_182_ -= f_196_ * (float) i_173_;
                f_184_ -= f_197_ * (float) i_173_;
                f_186_ -= f_198_ * (float) i_173_;
                f_188_ -= f_199_ * (float) i_173_;
                i_173_ = 0;
            }
        }
        if (i_173_ < i_174_) {
            i_190_ = i_174_ - i_173_;
            i += i_173_;
            while (i_190_-- > 0) {
                float f_200_ = 1.0F / f;
                if (f_200_ < aFloatArray2726[i]) {
                    int i_201_ = (int) (f_176_ * f_200_ * (float) anInt2731);
                    if (aBoolean2728)
                        i_201_ &= anInt2727;
                    else if (i_201_ < 0)
                        i_201_ = 0;
                    else if (i_201_ > anInt2727)
                        i_201_ = anInt2727;
                    int i_202_ = (int) (f_178_ * f_200_ * (float) anInt2731);
                    if (aBoolean2728)
                        i_202_ &= anInt2727;
                    else if (i_202_ < 0)
                        i_202_ = 0;
                    else if (i_202_ > anInt2727)
                        i_202_ = anInt2727;
                    int i_203_ = anIntArray2737[i_202_ * anInt2731 + i_201_];
                    int i_204_ = 255;
                    if (anInt2733 == 2)
                        i_204_ = i_203_ >> 24 & 0xff;
                    else if (anInt2733 == 1)
                        i_204_ = i_203_ == 0 ? 0 : 255;
                    else
                        i_204_ = (int) f_182_;
                    if (i_204_ != 0) {
                        if (i_204_ != 255) {
                            int i_205_ = (~0xffffff | ((int) (f_184_ * (float) (i_203_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_186_ * (float) (i_203_ >> 8 & 0xff)) & 0xff00 | ((int) (f_188_ * (float) (i_203_ & 0xff)) >> 8));
                            if (f_180_ != 0.0F) {
                                int i_206_ = (int) (255.0F - f_180_);
                                int i_207_ = ((((anInt2741 & 0xff00ff) * (int) f_180_ & ~0xff00ff) | ((anInt2741 & 0xff00) * (int) f_180_ & 0xff0000)) >>> 8);
                                i_205_ = ((((i_205_ & 0xff00ff) * i_206_ & ~0xff00ff) | ((i_205_ & 0xff00) * i_206_ & 0xff0000)) >>> 8) + i_207_;
                            }
                            int i_208_ = is[i];
                            int i_209_ = 255 - i_204_;
                            i_205_ = ((((i_208_ & 0xff00ff) * i_209_ + (i_205_ & 0xff00ff) * i_204_) & ~0xff00ff) + (((i_208_ & 0xff00) * i_209_ + (i_205_ & 0xff00) * i_204_) & 0xff0000)) >> 8;
                            is[i] = i_205_;
                            aFloatArray2726[i] = f_200_;
                        } else {
                            int i_210_ = (~0xffffff | ((int) (f_184_ * (float) (i_203_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_186_ * (float) (i_203_ >> 8 & 0xff)) & 0xff00 | ((int) (f_188_ * (float) (i_203_ & 0xff)) >> 8));
                            if (f_180_ != 0.0F) {
                                int i_211_ = (int) (255.0F - f_180_);
                                int i_212_ = ((((anInt2741 & 0xff00ff) * (int) f_180_ & ~0xff00ff) | ((anInt2741 & 0xff00) * (int) f_180_ & 0xff0000)) >>> 8);
                                i_210_ = ((((i_210_ & 0xff00ff) * i_211_ & ~0xff00ff) | ((i_210_ & 0xff00) * i_211_ & 0xff0000)) >>> 8) + i_212_;
                            }
                            is[i] = i_210_;
                            aFloatArray2726[i] = f_200_;
                        }
                    }
                }
                i++;
                f += f_192_;
                f_176_ += f_193_;
                f_178_ += f_194_;
                f_180_ += f_195_;
                f_182_ += f_196_;
                f_184_ += f_197_;
                f_186_ += f_198_;
                f_188_ += f_199_;
            }
        }
    }

    final void method1948(float f, float f_213_, float f_214_, float f_215_, float f_216_, float f_217_, float f_218_, float f_219_, float f_220_, float f_221_, float f_222_, float f_223_, float f_224_, float f_225_, float f_226_, int i, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_) {
        if (i_233_ != anInt2743) {
            anIntArray2737 = aHa_Sub1_2722.method834(i_233_);
            if (anIntArray2737 == null) {
                method1953((float) (int) f, (float) (int) f_213_, (float) (int) f_214_, (float) (int) f_215_, (float) (int) f_216_, (float) (int) f_217_, (float) (int) f_218_, (float) (int) f_219_, (float) (int) f_220_, Node_Sub11_Sub1.method2254(i, i_229_ | i_230_ << 24, false), Node_Sub11_Sub1.method2254(i_227_, (i_229_ | i_231_ << 24), false), Node_Sub11_Sub1.method2254(i_228_, (i_229_ | i_232_ << 24), false));
                return;
            }
            anInt2731 = (aHa_Sub1_2722.method823(i_233_) ? 64 : ((ha_Sub1) aHa_Sub1_2722).anInt5577);
            anInt2727 = anInt2731 - 1;
            anInt2733 = aHa_Sub1_2722.method837(i_233_);
            aBoolean2728 = aHa_Sub1_2722.method836(i_233_);
        }
        anInt2741 = i_229_;
        float f_234_ = (float) (i >> 24 & 0xff);
        float f_235_ = (float) (i_227_ >> 24 & 0xff);
        float f_236_ = (float) (i_228_ >> 24 & 0xff);
        float f_237_ = (float) (i >> 16 & 0xff);
        float f_238_ = (float) (i_227_ >> 16 & 0xff);
        float f_239_ = (float) (i_228_ >> 16 & 0xff);
        float f_240_ = (float) (i >> 8 & 0xff);
        float f_241_ = (float) (i_227_ >> 8 & 0xff);
        float f_242_ = (float) (i_228_ >> 8 & 0xff);
        float f_243_ = (float) (i & 0xff);
        float f_244_ = (float) (i_227_ & 0xff);
        float f_245_ = (float) (i_228_ & 0xff);
        f_221_ /= f_218_;
        f_222_ /= f_219_;
        f_223_ /= f_220_;
        f_224_ /= f_218_;
        f_225_ /= f_219_;
        f_226_ /= f_220_;
        f_218_ = 1.0F / f_218_;
        f_219_ = 1.0F / f_219_;
        f_220_ = 1.0F / f_220_;
        float f_246_ = 0.0F;
        float f_247_ = 0.0F;
        float f_248_ = 0.0F;
        float f_249_ = 0.0F;
        float f_250_ = 0.0F;
        float f_251_ = 0.0F;
        float f_252_ = 0.0F;
        float f_253_ = 0.0F;
        float f_254_ = 0.0F;
        if (f_213_ != f) {
            float f_255_ = f_213_ - f;
            f_246_ = (f_216_ - f_215_) / f_255_;
            f_247_ = (f_219_ - f_218_) / f_255_;
            f_248_ = (f_222_ - f_221_) / f_255_;
            f_249_ = (f_225_ - f_224_) / f_255_;
            f_250_ = (float) (i_231_ - i_230_) / f_255_;
            f_251_ = (f_235_ - f_234_) / f_255_;
            f_252_ = (f_238_ - f_237_) / f_255_;
            f_253_ = (f_241_ - f_240_) / f_255_;
            f_254_ = (f_244_ - f_243_) / f_255_;
        }
        float f_256_ = 0.0F;
        float f_257_ = 0.0F;
        float f_258_ = 0.0F;
        float f_259_ = 0.0F;
        float f_260_ = 0.0F;
        float f_261_ = 0.0F;
        float f_262_ = 0.0F;
        float f_263_ = 0.0F;
        float f_264_ = 0.0F;
        if (f_214_ != f_213_) {
            float f_265_ = f_214_ - f_213_;
            f_256_ = (f_217_ - f_216_) / f_265_;
            f_257_ = (f_220_ - f_219_) / f_265_;
            f_258_ = (f_223_ - f_222_) / f_265_;
            f_259_ = (f_226_ - f_225_) / f_265_;
            f_260_ = (float) (i_232_ - i_231_) / f_265_;
            f_261_ = (f_236_ - f_235_) / f_265_;
            f_262_ = (f_239_ - f_238_) / f_265_;
            f_263_ = (f_242_ - f_241_) / f_265_;
            f_264_ = (f_245_ - f_244_) / f_265_;
        }
        float f_266_ = 0.0F;
        float f_267_ = 0.0F;
        float f_268_ = 0.0F;
        float f_269_ = 0.0F;
        float f_270_ = 0.0F;
        float f_271_ = 0.0F;
        float f_272_ = 0.0F;
        float f_273_ = 0.0F;
        float f_274_ = 0.0F;
        if (f != f_214_) {
            float f_275_ = f - f_214_;
            f_266_ = (f_215_ - f_217_) / f_275_;
            f_267_ = (f_218_ - f_220_) / f_275_;
            f_268_ = (f_221_ - f_223_) / f_275_;
            f_269_ = (f_224_ - f_226_) / f_275_;
            f_270_ = (float) (i_230_ - i_232_) / f_275_;
            f_271_ = (f_234_ - f_236_) / f_275_;
            f_272_ = (f_237_ - f_239_) / f_275_;
            f_273_ = (f_240_ - f_242_) / f_275_;
            f_274_ = (f_243_ - f_245_) / f_275_;
        }
        if (f <= f_213_ && f <= f_214_) {
            if (!(f >= (float) ((Class244) this).anInt2717)) {
                if (f_213_ > (float) ((Class244) this).anInt2717)
                    f_213_ = (float) ((Class244) this).anInt2717;
                if (f_214_ > (float) ((Class244) this).anInt2717)
                    f_214_ = (float) ((Class244) this).anInt2717;
                if (f_213_ < f_214_) {
                    f_217_ = f_215_;
                    f_220_ = f_218_;
                    f_223_ = f_221_;
                    f_226_ = f_224_;
                    i_232_ = i_230_;
                    f_236_ = f_234_;
                    f_239_ = f_237_;
                    f_242_ = f_240_;
                    f_245_ = f_243_;
                    if (f < 0.0F) {
                        f_215_ -= f_246_ * f;
                        f_217_ -= f_266_ * f;
                        f_218_ -= f_247_ * f;
                        f_220_ -= f_267_ * f;
                        f_221_ -= f_248_ * f;
                        f_223_ -= f_268_ * f;
                        f_224_ -= f_249_ * f;
                        f_226_ -= f_269_ * f;
                        i_230_ -= f_250_ * f;
                        i_232_ -= f_270_ * f;
                        f_234_ -= f_251_ * f;
                        f_236_ -= f_271_ * f;
                        f_237_ -= f_251_ * f;
                        f_239_ -= f_271_ * f;
                        f_240_ -= f_251_ * f;
                        f_242_ -= f_271_ * f;
                        f_243_ -= f_251_ * f;
                        f_245_ -= f_271_ * f;
                        f = 0.0F;
                    }
                    if (f_213_ < 0.0F) {
                        f_216_ -= f_256_ * f_213_;
                        f_219_ -= f_257_ * f_213_;
                        f_222_ -= f_258_ * f_213_;
                        f_225_ -= f_259_ * f_213_;
                        i_231_ -= f_260_ * f_213_;
                        f_235_ -= f_261_ * f_213_;
                        f_238_ -= f_262_ * f_213_;
                        f_241_ -= f_263_ * f_213_;
                        f_244_ -= f_264_ * f_213_;
                        f_213_ = 0.0F;
                    }
                    if (f != f_213_ && f_266_ < f_246_ || f == f_213_ && f_266_ > f_256_) {
                        f_214_ -= f_213_;
                        f_213_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_213_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_217_, (int) f_215_, f_220_, f_218_, f_223_, f_221_, f_226_, f_224_, (float) i_232_, (float) i_230_, f_236_, f_234_, f_239_, f_237_, f_242_, f_240_, f_245_, f_243_);
                            f_215_ += f_246_;
                            f_217_ += f_266_;
                            f_218_ += f_247_;
                            f_220_ += f_267_;
                            f_221_ += f_248_;
                            f_223_ += f_268_;
                            f_224_ += f_249_;
                            f_226_ += f_269_;
                            i_230_ += f_250_;
                            i_232_ += f_270_;
                            f_234_ += f_251_;
                            f_236_ += f_271_;
                            f_237_ += f_252_;
                            f_239_ += f_272_;
                            f_240_ += f_253_;
                            f_242_ += f_273_;
                            f_243_ += f_254_;
                            f_245_ += f_274_;
                            f += (float) anInt2716;
                        }
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_217_, (int) f_216_, f_220_, f_219_, f_223_, f_222_, f_226_, f_225_, (float) i_232_, (float) i_231_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, f_245_, f_244_);
                            f_216_ += f_256_;
                            f_217_ += f_266_;
                            f_219_ += f_257_;
                            f_220_ += f_267_;
                            f_222_ += f_258_;
                            f_223_ += f_268_;
                            f_225_ += f_259_;
                            f_226_ += f_269_;
                            i_231_ += f_260_;
                            i_232_ += f_270_;
                            f_235_ += f_261_;
                            f_236_ += f_271_;
                            f_238_ += f_262_;
                            f_239_ += f_272_;
                            f_241_ += f_263_;
                            f_242_ += f_273_;
                            f_244_ += f_264_;
                            f_245_ += f_274_;
                            f += (float) anInt2716;
                        }
                    } else {
                        f_214_ -= f_213_;
                        f_213_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_213_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_215_, (int) f_217_, f_218_, f_220_, f_221_, f_223_, f_224_, f_226_, (float) i_230_, (float) i_232_, f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, f_245_);
                            f_215_ += f_246_;
                            f_217_ += f_266_;
                            f_218_ += f_247_;
                            f_220_ += f_267_;
                            f_221_ += f_248_;
                            f_223_ += f_268_;
                            f_224_ += f_249_;
                            f_226_ += f_269_;
                            i_230_ += f_250_;
                            i_232_ += f_270_;
                            f_234_ += f_251_;
                            f_236_ += f_271_;
                            f_237_ += f_252_;
                            f_239_ += f_272_;
                            f_240_ += f_253_;
                            f_242_ += f_273_;
                            f_243_ += f_254_;
                            f_245_ += f_274_;
                            f += (float) anInt2716;
                        }
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_216_, (int) f_217_, f_219_, f_220_, f_222_, f_223_, f_225_, f_226_, (float) i_231_, (float) i_232_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, f_244_, f_245_);
                            f_216_ += f_256_;
                            f_217_ += f_266_;
                            f_219_ += f_257_;
                            f_220_ += f_267_;
                            f_222_ += f_258_;
                            f_223_ += f_268_;
                            f_225_ += f_259_;
                            f_226_ += f_269_;
                            i_231_ += f_260_;
                            i_232_ += f_270_;
                            f_235_ += f_261_;
                            f_236_ += f_271_;
                            f_238_ += f_262_;
                            f_239_ += f_272_;
                            f_241_ += f_263_;
                            f_242_ += f_273_;
                            f_244_ += f_264_;
                            f_245_ += f_274_;
                            f += (float) anInt2716;
                        }
                    }
                } else {
                    f_216_ = f_215_;
                    f_219_ = f_218_;
                    f_222_ = f_221_;
                    f_225_ = f_224_;
                    i_231_ = i_230_;
                    f_235_ = f_234_;
                    f_238_ = f_237_;
                    f_241_ = f_240_;
                    f_244_ = f_243_;
                    if (f < 0.0F) {
                        f_215_ -= f_246_ * f;
                        f_216_ -= f_266_ * f;
                        f_218_ -= f_247_ * f;
                        f_219_ -= f_267_ * f;
                        f_221_ -= f_248_ * f;
                        f_222_ -= f_268_ * f;
                        f_224_ -= f_249_ * f;
                        f_225_ -= f_269_ * f;
                        i_230_ -= f_250_ * f;
                        i_231_ -= f_270_ * f;
                        f_234_ -= f_251_ * f;
                        f_235_ -= f_271_ * f;
                        f_237_ -= f_251_ * f;
                        f_238_ -= f_271_ * f;
                        f_240_ -= f_251_ * f;
                        f_241_ -= f_271_ * f;
                        f_243_ -= f_251_ * f;
                        f_244_ -= f_271_ * f;
                        f = 0.0F;
                    }
                    if (f_214_ < 0.0F) {
                        f_217_ -= f_256_ * f_214_;
                        f_220_ -= f_257_ * f_214_;
                        f_223_ -= f_258_ * f_214_;
                        f_226_ -= f_259_ * f_214_;
                        i_232_ -= f_260_ * f_214_;
                        f_236_ -= f_261_ * f_214_;
                        f_239_ -= f_262_ * f_214_;
                        f_242_ -= f_263_ * f_214_;
                        f_245_ -= f_264_ * f_214_;
                        f_214_ = 0.0F;
                    }
                    if (f != f_214_ && f_266_ < f_246_ || f == f_214_ && f_256_ > f_246_) {
                        f_213_ -= f_214_;
                        f_214_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_216_, (int) f_215_, f_219_, f_218_, f_222_, f_221_, f_225_, f_224_, (float) i_231_, (float) i_230_, f_235_, f_234_, f_238_, f_237_, f_241_, f_240_, f_244_, f_243_);
                            f_215_ += f_246_;
                            f_216_ += f_266_;
                            f_218_ += f_247_;
                            f_219_ += f_267_;
                            f_221_ += f_248_;
                            f_222_ += f_268_;
                            f_224_ += f_249_;
                            f_225_ += f_269_;
                            i_230_ += f_250_;
                            i_231_ += f_270_;
                            f_234_ += f_251_;
                            f_235_ += f_271_;
                            f_237_ += f_252_;
                            f_238_ += f_272_;
                            f_240_ += f_253_;
                            f_241_ += f_273_;
                            f_243_ += f_254_;
                            f_244_ += f_274_;
                            f += (float) anInt2716;
                        }
                        while (--f_213_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_217_, (int) f_215_, f_220_, f_218_, f_223_, f_221_, f_226_, f_224_, (float) i_232_, (float) i_230_, f_236_, f_234_, f_239_, f_237_, f_242_, f_240_, f_245_, f_243_);
                            f_217_ += f_256_;
                            f_215_ += f_246_;
                            f_220_ += f_257_;
                            f_218_ += f_247_;
                            f_223_ += f_258_;
                            f_221_ += f_248_;
                            f_226_ += f_259_;
                            f_224_ += f_249_;
                            i_232_ += f_260_;
                            i_230_ += f_250_;
                            f_236_ += f_261_;
                            f_234_ += f_251_;
                            f_239_ += f_262_;
                            f_237_ += f_252_;
                            f_242_ += f_263_;
                            f_240_ += f_253_;
                            f_245_ += f_264_;
                            f_243_ += f_254_;
                            f += (float) anInt2716;
                        }
                    } else {
                        f_213_ -= f_214_;
                        f_214_ -= f;
                        f = (float) ((Class244) this).anIntArray2720[(int) f];
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_215_, (int) f_216_, f_218_, f_219_, f_221_, f_222_, f_224_, f_225_, (float) i_230_, (float) i_231_, f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, f_244_);
                            f_216_ += f_266_;
                            f_215_ += f_246_;
                            f_219_ += f_267_;
                            f_218_ += f_247_;
                            f_222_ += f_268_;
                            f_221_ += f_248_;
                            f_225_ += f_269_;
                            f_224_ += f_249_;
                            i_231_ += f_270_;
                            i_230_ += f_250_;
                            f_235_ += f_271_;
                            f_234_ += f_251_;
                            f_238_ += f_272_;
                            f_237_ += f_252_;
                            f_241_ += f_273_;
                            f_240_ += f_253_;
                            f_244_ += f_274_;
                            f_243_ += f_254_;
                            f += (float) anInt2716;
                        }
                        while (--f_213_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f, (int) f_215_, (int) f_217_, f_218_, f_220_, f_221_, f_223_, f_224_, f_226_, (float) i_230_, (float) i_232_, f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, f_245_);
                            f_215_ += f_246_;
                            f_217_ += f_256_;
                            f_218_ += f_247_;
                            f_220_ += f_257_;
                            f_221_ += f_248_;
                            f_223_ += f_258_;
                            f_224_ += f_249_;
                            f_226_ += f_259_;
                            i_230_ += f_250_;
                            i_232_ += f_260_;
                            f_234_ += f_251_;
                            f_236_ += f_261_;
                            f_237_ += f_252_;
                            f_239_ += f_262_;
                            f_240_ += f_253_;
                            f_242_ += f_263_;
                            f_243_ += f_254_;
                            f_245_ += f_264_;
                            f += (float) anInt2716;
                        }
                    }
                }
            }
        } else if (f_213_ <= f_214_) {
            if (!(f_213_ >= (float) ((Class244) this).anInt2717)) {
                if (f_214_ > (float) ((Class244) this).anInt2717)
                    f_214_ = (float) ((Class244) this).anInt2717;
                if (f > (float) ((Class244) this).anInt2717)
                    f = (float) ((Class244) this).anInt2717;
                if (f_214_ < f) {
                    f_215_ = f_216_;
                    f_218_ = f_219_;
                    f_221_ = f_222_;
                    f_224_ = f_225_;
                    i_230_ = i_231_;
                    f_234_ = f_235_;
                    f_237_ = f_238_;
                    f_240_ = f_241_;
                    f_243_ = f_244_;
                    if (f_213_ < 0.0F) {
                        f_215_ -= f_246_ * f_213_;
                        f_216_ -= f_256_ * f_213_;
                        f_218_ -= f_247_ * f_213_;
                        f_219_ -= f_257_ * f_213_;
                        f_221_ -= f_248_ * f_213_;
                        f_222_ -= f_258_ * f_213_;
                        f_224_ -= f_249_ * f_213_;
                        f_225_ -= f_259_ * f_213_;
                        i_230_ -= f_250_ * f_213_;
                        i_231_ -= f_260_ * f_213_;
                        f_234_ -= f_251_ * f_213_;
                        f_235_ -= f_261_ * f_213_;
                        f_237_ -= f_252_ * f_213_;
                        f_238_ -= f_262_ * f_213_;
                        f_240_ -= f_253_ * f_213_;
                        f_241_ -= f_263_ * f_213_;
                        f_243_ -= f_254_ * f_213_;
                        f_244_ -= f_264_ * f_213_;
                        f_213_ = 0.0F;
                    }
                    if (f_214_ < 0.0F) {
                        f_217_ -= f_266_ * f_214_;
                        f_220_ -= f_267_ * f_214_;
                        f_223_ -= f_268_ * f_214_;
                        f_226_ -= f_269_ * f_214_;
                        i_232_ -= f_270_ * f_214_;
                        f_236_ -= f_271_ * f_214_;
                        f_239_ -= f_272_ * f_214_;
                        f_242_ -= f_273_ * f_214_;
                        f_245_ -= f_274_ * f_214_;
                        f_214_ = 0.0F;
                    }
                    if (f_213_ != f_214_ && f_246_ < f_256_ || f_213_ == f_214_ && f_246_ > f_266_) {
                        f -= f_214_;
                        f_214_ -= f_213_;
                        f_213_ = (float) (((Class244) this).anIntArray2720[(int) f_213_]);
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_215_, (int) f_216_, f_218_, f_219_, f_221_, f_222_, f_224_, f_225_, (float) i_230_, (float) i_231_, f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, f_244_);
                            f_215_ += f_246_;
                            f_216_ += f_256_;
                            f_218_ += f_247_;
                            f_219_ += f_257_;
                            f_221_ += f_248_;
                            f_222_ += f_258_;
                            f_224_ += f_249_;
                            f_225_ += f_259_;
                            i_230_ += f_250_;
                            i_231_ += f_260_;
                            f_234_ += f_251_;
                            f_235_ += f_261_;
                            f_237_ += f_252_;
                            f_238_ += f_262_;
                            f_240_ += f_253_;
                            f_241_ += f_263_;
                            f_243_ += f_254_;
                            f_244_ += f_264_;
                            f_213_ += (float) anInt2716;
                        }
                        while (--f >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_215_, (int) f_217_, f_218_, f_220_, f_221_, f_223_, f_224_, f_226_, (float) i_230_, (float) i_232_, f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, f_245_);
                            f_215_ += f_246_;
                            f_217_ += f_266_;
                            f_218_ += f_247_;
                            f_220_ += f_267_;
                            f_221_ += f_248_;
                            f_223_ += f_268_;
                            f_224_ += f_249_;
                            f_226_ += f_269_;
                            i_230_ += f_250_;
                            i_232_ += f_270_;
                            f_234_ += f_251_;
                            f_236_ += f_271_;
                            f_237_ += f_252_;
                            f_239_ += f_272_;
                            f_240_ += f_253_;
                            f_242_ += f_273_;
                            f_243_ += f_254_;
                            f_245_ += f_274_;
                            f_213_ += (float) anInt2716;
                        }
                    } else {
                        f -= f_214_;
                        f_214_ -= f_213_;
                        f_213_ = (float) (((Class244) this).anIntArray2720[(int) f_213_]);
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_216_, (int) f_215_, f_219_, f_218_, f_222_, f_221_, f_225_, f_224_, (float) i_231_, (float) i_230_, f_235_, f_234_, f_238_, f_237_, f_241_, f_240_, f_244_, f_243_);
                            f_216_ += f_256_;
                            f_215_ += f_246_;
                            f_219_ += f_257_;
                            f_218_ += f_247_;
                            f_222_ += f_258_;
                            f_221_ += f_248_;
                            f_225_ += f_259_;
                            f_224_ += f_249_;
                            i_231_ += f_260_;
                            i_230_ += f_250_;
                            f_235_ += f_261_;
                            f_234_ += f_251_;
                            f_238_ += f_262_;
                            f_237_ += f_252_;
                            f_241_ += f_263_;
                            f_240_ += f_253_;
                            f_244_ += f_264_;
                            f_243_ += f_254_;
                            f_213_ += (float) anInt2716;
                        }
                        while (--f >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_217_, (int) f_215_, f_220_, f_218_, f_223_, f_221_, f_226_, f_224_, (float) i_232_, (float) i_230_, f_236_, f_234_, f_239_, f_237_, f_242_, f_240_, f_245_, f_243_);
                            f_217_ += f_266_;
                            f_215_ += f_246_;
                            f_220_ += f_267_;
                            f_218_ += f_247_;
                            f_223_ += f_268_;
                            f_221_ += f_248_;
                            f_226_ += f_269_;
                            f_224_ += f_249_;
                            i_232_ += f_270_;
                            i_230_ += f_250_;
                            f_236_ += f_271_;
                            f_234_ += f_251_;
                            f_239_ += f_272_;
                            f_237_ += f_252_;
                            f_242_ += f_273_;
                            f_240_ += f_253_;
                            f_245_ += f_274_;
                            f_243_ += f_254_;
                            f_213_ += (float) anInt2716;
                        }
                    }
                } else {
                    f_217_ = f_216_;
                    f_220_ = f_219_;
                    f_223_ = f_222_;
                    f_226_ = f_225_;
                    i_232_ = i_231_;
                    f_236_ = f_235_;
                    f_239_ = f_238_;
                    f_242_ = f_241_;
                    f_245_ = f_244_;
                    if (f_213_ < 0.0F) {
                        f_217_ -= f_246_ * f_213_;
                        f_216_ -= f_256_ * f_213_;
                        f_220_ -= f_247_ * f_213_;
                        f_219_ -= f_257_ * f_213_;
                        f_223_ -= f_248_ * f_213_;
                        f_222_ -= f_258_ * f_213_;
                        f_226_ -= f_249_ * f_213_;
                        f_225_ -= f_259_ * f_213_;
                        i_232_ -= f_250_ * f_213_;
                        i_231_ -= f_260_ * f_213_;
                        f_236_ -= f_251_ * f_213_;
                        f_235_ -= f_261_ * f_213_;
                        f_239_ -= f_252_ * f_213_;
                        f_238_ -= f_262_ * f_213_;
                        f_242_ -= f_253_ * f_213_;
                        f_241_ -= f_263_ * f_213_;
                        f_245_ -= f_254_ * f_213_;
                        f_244_ -= f_264_ * f_213_;
                        f_213_ = 0.0F;
                    }
                    if (f < 0.0F) {
                        f_215_ -= f_266_ * f;
                        f_218_ -= f_267_ * f;
                        f_221_ -= f_268_ * f;
                        f_224_ -= f_269_ * f;
                        i_230_ -= f_270_ * f;
                        f_234_ -= f_271_ * f;
                        f_237_ -= f_272_ * f;
                        f_240_ -= f_273_ * f;
                        f_243_ -= f_274_ * f;
                        f = 0.0F;
                    }
                    f_214_ -= f;
                    f -= f_213_;
                    f_213_ = (float) (((Class244) this).anIntArray2720[(int) f_213_]);
                    if (f_246_ < f_256_) {
                        while (--f >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_217_, (int) f_216_, f_220_, f_219_, f_223_, f_222_, f_226_, f_225_, (float) i_232_, (float) i_231_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, f_245_, f_244_);
                            f_217_ += f_246_;
                            f_216_ += f_256_;
                            f_220_ += f_247_;
                            f_219_ += f_257_;
                            f_223_ += f_248_;
                            f_222_ += f_258_;
                            f_226_ += f_249_;
                            f_225_ += f_259_;
                            i_232_ += f_250_;
                            i_231_ += f_260_;
                            f_236_ += f_251_;
                            f_235_ += f_261_;
                            f_239_ += f_252_;
                            f_238_ += f_262_;
                            f_242_ += f_253_;
                            f_241_ += f_263_;
                            f_245_ += f_254_;
                            f_244_ += f_264_;
                            f_213_ += (float) anInt2716;
                        }
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_215_, (int) f_216_, f_218_, f_219_, f_221_, f_222_, f_224_, f_225_, (float) i_230_, (float) i_231_, f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, f_244_);
                            f_215_ += f_266_;
                            f_216_ += f_256_;
                            f_218_ += f_267_;
                            f_219_ += f_257_;
                            f_221_ += f_268_;
                            f_222_ += f_258_;
                            f_224_ += f_269_;
                            f_225_ += f_259_;
                            i_230_ += f_270_;
                            i_231_ += f_260_;
                            f_234_ += f_271_;
                            f_235_ += f_261_;
                            f_237_ += f_272_;
                            f_238_ += f_262_;
                            f_240_ += f_273_;
                            f_241_ += f_263_;
                            f_243_ += f_274_;
                            f_244_ += f_264_;
                            f_213_ += (float) anInt2716;
                        }
                    } else {
                        while (--f >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_216_, (int) f_217_, f_219_, f_220_, f_222_, f_223_, f_225_, f_226_, (float) i_231_, (float) i_232_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, f_244_, f_245_);
                            f_216_ += f_256_;
                            f_217_ += f_246_;
                            f_219_ += f_257_;
                            f_220_ += f_247_;
                            f_222_ += f_258_;
                            f_223_ += f_248_;
                            f_225_ += f_259_;
                            f_226_ += f_249_;
                            i_231_ += f_260_;
                            i_232_ += f_250_;
                            f_235_ += f_261_;
                            f_236_ += f_251_;
                            f_238_ += f_262_;
                            f_239_ += f_252_;
                            f_241_ += f_263_;
                            f_242_ += f_253_;
                            f_244_ += f_264_;
                            f_245_ += f_254_;
                            f_213_ += (float) anInt2716;
                        }
                        while (--f_214_ >= 0.0F) {
                            method1947(anIntArray2721, anIntArray2737, (int) f_213_, (int) f_216_, (int) f_215_, f_219_, f_218_, f_222_, f_221_, f_225_, f_224_, (float) i_231_, (float) i_230_, f_235_, f_234_, f_238_, f_237_, f_241_, f_240_, f_244_, f_243_);
                            f_216_ += f_256_;
                            f_215_ += f_266_;
                            f_219_ += f_257_;
                            f_218_ += f_267_;
                            f_222_ += f_258_;
                            f_221_ += f_268_;
                            f_225_ += f_259_;
                            f_224_ += f_269_;
                            i_231_ += f_260_;
                            i_230_ += f_270_;
                            f_235_ += f_261_;
                            f_234_ += f_271_;
                            f_238_ += f_262_;
                            f_237_ += f_272_;
                            f_241_ += f_263_;
                            f_240_ += f_273_;
                            f_244_ += f_264_;
                            f_243_ += f_274_;
                            f_213_ += (float) anInt2716;
                        }
                    }
                }
            }
        } else if (!(f_214_ >= (float) ((Class244) this).anInt2717)) {
            if (f > (float) ((Class244) this).anInt2717)
                f = (float) ((Class244) this).anInt2717;
            if (f_213_ > (float) ((Class244) this).anInt2717)
                f_213_ = (float) ((Class244) this).anInt2717;
            if (f < f_213_) {
                f_216_ = f_217_;
                f_219_ = f_220_;
                f_222_ = f_223_;
                f_225_ = f_226_;
                i_231_ = i_232_;
                f_235_ = f_236_;
                f_238_ = f_239_;
                f_241_ = f_242_;
                f_244_ = f_245_;
                if (f_214_ < 0.0F) {
                    f_217_ -= f_266_ * f_214_;
                    f_216_ -= f_256_ * f_214_;
                    f_220_ -= f_267_ * f_214_;
                    f_219_ -= f_257_ * f_214_;
                    f_223_ -= f_268_ * f_214_;
                    f_222_ -= f_258_ * f_214_;
                    f_226_ -= f_269_ * f_214_;
                    f_225_ -= f_259_ * f_214_;
                    i_232_ -= f_270_ * 3.0F;
                    i_231_ -= f_260_ * f_214_;
                    f_236_ -= f_271_ * f_214_;
                    f_235_ -= f_261_ * f_214_;
                    f_239_ -= f_272_ * f_214_;
                    f_238_ -= f_262_ * f_214_;
                    f_242_ -= f_273_ * f_214_;
                    f_241_ -= f_263_ * f_214_;
                    f_245_ -= f_274_ * f_214_;
                    f_244_ -= f_264_ * f_214_;
                    f_214_ = 0.0F;
                }
                if (f < 0.0F) {
                    f_215_ -= f_246_ * f;
                    f_218_ -= f_247_ * f;
                    f_221_ -= f_248_ * f;
                    f_224_ -= f_249_ * f;
                    i_230_ -= f_250_ * f;
                    f_234_ -= f_251_ * f;
                    f_237_ -= f_252_ * f;
                    f_240_ -= f_253_ * f;
                    f_243_ -= f_254_ * f;
                    f = 0.0F;
                }
                if (f_256_ < f_266_) {
                    f_213_ -= f;
                    f -= f_214_;
                    f_214_ = (float) (((Class244) this).anIntArray2720[(int) f_214_]);
                    while (--f >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_216_, (int) f_217_, f_219_, f_220_, f_222_, f_223_, f_225_, f_226_, (float) i_231_, (float) i_232_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, f_244_, f_245_);
                        f_216_ += f_256_;
                        f_217_ += f_266_;
                        f_219_ += f_257_;
                        f_220_ += f_267_;
                        f_222_ += f_258_;
                        f_223_ += f_268_;
                        f_225_ += f_259_;
                        f_226_ += f_269_;
                        i_231_ += f_260_;
                        i_232_ += f_270_;
                        f_235_ += f_261_;
                        f_236_ += f_271_;
                        f_238_ += f_262_;
                        f_239_ += f_272_;
                        f_241_ += f_263_;
                        f_242_ += f_273_;
                        f_244_ += f_264_;
                        f_245_ += f_274_;
                        f_214_ += (float) anInt2716;
                    }
                    while (--f_213_ >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_216_, (int) f_215_, f_219_, f_218_, f_222_, f_221_, f_225_, f_224_, (float) i_231_, (float) i_230_, f_235_, f_234_, f_238_, f_237_, f_241_, f_240_, f_244_, f_243_);
                        f_216_ += f_256_;
                        f_215_ += f_246_;
                        f_219_ += f_257_;
                        f_218_ += f_247_;
                        f_222_ += f_258_;
                        f_221_ += f_248_;
                        f_225_ += f_259_;
                        f_224_ += f_249_;
                        i_231_ += f_260_;
                        i_230_ += f_250_;
                        f_235_ += f_261_;
                        f_234_ += f_251_;
                        f_238_ += f_262_;
                        f_237_ += f_252_;
                        f_241_ += f_263_;
                        f_240_ += f_253_;
                        f_244_ += f_264_;
                        f_243_ += f_254_;
                        f_214_ += (float) anInt2716;
                    }
                } else {
                    f_213_ -= f;
                    f -= f_214_;
                    f_214_ = (float) (((Class244) this).anIntArray2720[(int) f_214_]);
                    while (--f >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_217_, (int) f_216_, f_220_, f_219_, f_223_, f_222_, f_226_, f_225_, (float) i_232_, (float) i_231_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, f_245_, f_244_);
                        f_217_ += f_266_;
                        f_216_ += f_256_;
                        f_220_ += f_267_;
                        f_219_ += f_257_;
                        f_223_ += f_268_;
                        f_222_ += f_258_;
                        f_226_ += f_269_;
                        f_225_ += f_259_;
                        i_232_ += f_270_;
                        i_231_ += f_260_;
                        f_236_ += f_271_;
                        f_235_ += f_261_;
                        f_239_ += f_272_;
                        f_238_ += f_262_;
                        f_242_ += f_273_;
                        f_241_ += f_263_;
                        f_245_ += f_274_;
                        f_244_ += f_264_;
                        f_214_ += (float) anInt2716;
                    }
                    while (--f_213_ >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_215_, (int) f_216_, f_218_, f_219_, f_221_, f_222_, f_224_, f_225_, (float) i_230_, (float) i_231_, f_234_, f_235_, f_237_, f_238_, f_240_, f_241_, f_243_, f_244_);
                        f_215_ += f_246_;
                        f_216_ += f_256_;
                        f_218_ += f_247_;
                        f_219_ += f_257_;
                        f_221_ += f_248_;
                        f_222_ += f_258_;
                        f_224_ += f_249_;
                        f_225_ += f_259_;
                        i_230_ += f_250_;
                        i_231_ += f_260_;
                        f_234_ += f_251_;
                        f_235_ += f_261_;
                        f_237_ += f_252_;
                        f_238_ += f_262_;
                        f_240_ += f_253_;
                        f_241_ += f_263_;
                        f_243_ += f_254_;
                        f_244_ += f_264_;
                        f_214_ += (float) anInt2716;
                    }
                }
            } else {
                f_215_ = f_217_;
                f_218_ = f_220_;
                f_221_ = f_223_;
                f_224_ = f_226_;
                i_230_ = i_232_;
                f_234_ = f_236_;
                f_237_ = f_239_;
                f_240_ = f_242_;
                f_243_ = f_245_;
                if (f_214_ < 0.0F) {
                    f_217_ -= f_266_ * f_214_;
                    f_215_ -= f_256_ * f_214_;
                    f_220_ -= f_267_ * f_214_;
                    f_218_ -= f_257_ * f_214_;
                    f_223_ -= f_268_ * f_214_;
                    f_221_ -= f_258_ * f_214_;
                    f_226_ -= f_269_ * f_214_;
                    f_224_ -= f_259_ * f_214_;
                    i_232_ -= f_270_ * 3.0F;
                    i_230_ -= f_260_ * f_214_;
                    f_236_ -= f_271_ * f_214_;
                    f_234_ -= f_261_ * f_214_;
                    f_239_ -= f_272_ * f_214_;
                    f_237_ -= f_262_ * f_214_;
                    f_242_ -= f_273_ * f_214_;
                    f_240_ -= f_263_ * f_214_;
                    f_245_ -= f_274_ * f_214_;
                    f_243_ -= f_264_ * f_214_;
                    f_214_ = 0.0F;
                }
                if (f_213_ < 0.0F) {
                    f_216_ -= f_246_ * f_213_;
                    f_219_ -= f_247_ * f_213_;
                    f_222_ -= f_248_ * f_213_;
                    f_225_ -= f_249_ * f_213_;
                    i_231_ -= f_250_ * f_213_;
                    f_235_ -= f_251_ * f_213_;
                    f_238_ -= f_252_ * f_213_;
                    f_241_ -= f_253_ * f_213_;
                    f_244_ -= f_254_ * f_213_;
                    f_213_ = 0.0F;
                }
                if (f_256_ < f_266_) {
                    f -= f_213_;
                    f_213_ -= f_214_;
                    f_214_ = (float) (((Class244) this).anIntArray2720[(int) f_214_]);
                    while (--f_213_ >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_215_, (int) f_217_, f_218_, f_220_, f_221_, f_223_, f_224_, f_226_, (float) i_230_, (float) i_232_, f_234_, f_236_, f_237_, f_239_, f_240_, f_242_, f_243_, f_245_);
                        f_215_ += f_256_;
                        f_217_ += f_266_;
                        f_218_ += f_257_;
                        f_220_ += f_267_;
                        f_221_ += f_258_;
                        f_223_ += f_268_;
                        f_224_ += f_259_;
                        f_226_ += f_269_;
                        i_230_ += f_260_;
                        i_232_ += f_270_;
                        f_234_ += f_261_;
                        f_236_ += f_271_;
                        f_237_ += f_262_;
                        f_239_ += f_272_;
                        f_240_ += f_263_;
                        f_242_ += f_273_;
                        f_243_ += f_264_;
                        f_245_ += f_274_;
                        f_214_ += (float) anInt2716;
                    }
                    while (--f >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_216_, (int) f_217_, f_219_, f_220_, f_222_, f_223_, f_225_, f_226_, (float) i_231_, (float) i_232_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_, f_244_, f_245_);
                        f_216_ += f_246_;
                        f_217_ += f_266_;
                        f_219_ += f_247_;
                        f_220_ += f_267_;
                        f_222_ += f_248_;
                        f_223_ += f_268_;
                        f_225_ += f_249_;
                        f_226_ += f_269_;
                        i_231_ += f_250_;
                        i_232_ += f_270_;
                        f_235_ += f_251_;
                        f_236_ += f_271_;
                        f_238_ += f_252_;
                        f_239_ += f_272_;
                        f_241_ += f_253_;
                        f_242_ += f_273_;
                        f_244_ += f_254_;
                        f_245_ += f_274_;
                        f_214_ += (float) anInt2716;
                    }
                } else {
                    f -= f_213_;
                    f_213_ -= f_214_;
                    f_214_ = (float) (((Class244) this).anIntArray2720[(int) f_214_]);
                    while (--f_213_ >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_217_, (int) f_215_, f_220_, f_218_, f_223_, f_221_, f_226_, f_224_, (float) i_232_, (float) i_230_, f_236_, f_234_, f_239_, f_237_, f_242_, f_240_, f_245_, f_243_);
                        f_217_ += f_266_;
                        f_215_ += f_256_;
                        f_220_ += f_267_;
                        f_218_ += f_257_;
                        f_223_ += f_268_;
                        f_221_ += f_258_;
                        f_226_ += f_269_;
                        f_224_ += f_259_;
                        i_232_ += f_270_;
                        i_230_ += f_260_;
                        f_236_ += f_271_;
                        f_234_ += f_261_;
                        f_239_ += f_272_;
                        f_237_ += f_262_;
                        f_242_ += f_273_;
                        f_240_ += f_263_;
                        f_245_ += f_274_;
                        f_243_ += f_264_;
                        f_214_ += (float) anInt2716;
                    }
                    while (--f >= 0.0F) {
                        method1947(anIntArray2721, anIntArray2737, (int) f_214_, (int) f_217_, (int) f_216_, f_220_, f_219_, f_223_, f_222_, f_226_, f_225_, (float) i_232_, (float) i_231_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_, f_245_, f_244_);
                        f_217_ += f_266_;
                        f_216_ += f_246_;
                        f_220_ += f_267_;
                        f_219_ += f_247_;
                        f_223_ += f_268_;
                        f_222_ += f_248_;
                        f_226_ += f_269_;
                        f_225_ += f_249_;
                        i_232_ += f_270_;
                        i_231_ += f_250_;
                        f_236_ += f_271_;
                        f_235_ += f_251_;
                        f_239_ += f_272_;
                        f_238_ += f_252_;
                        f_242_ += f_273_;
                        f_241_ += f_253_;
                        f_245_ += f_274_;
                        f_244_ += f_254_;
                        f_214_ += (float) anInt2716;
                    }
                }
            }
        }
    }

    final void method1949(float f, float f_276_, float f_277_, float f_278_, float f_279_, float f_280_, float f_281_, float f_282_, float f_283_, int i) {
        if (aBoolean2725) {
            aHa_Sub1_2722.method811((int) f_279_, (int) f_276_, (int) f, i, (byte) 49, (int) f_278_);
            aHa_Sub1_2722.method811((int) f_280_, (int) f_277_, (int) f_276_, i, (byte) 49, (int) f_279_);
            aHa_Sub1_2722.method811((int) f_278_, (int) f, (int) f_277_, i, (byte) 49, (int) f_280_);
        } else {
            float f_284_ = f_279_ - f_278_;
            float f_285_ = f_276_ - f;
            float f_286_ = f_280_ - f_278_;
            float f_287_ = f_277_ - f;
            float f_288_ = f_282_ - f_281_;
            float f_289_ = f_283_ - f_281_;
            float f_290_ = 0.0F;
            if (f_276_ != f)
                f_290_ = (f_279_ - f_278_) / (f_276_ - f);
            float f_291_ = 0.0F;
            if (f_277_ != f_276_)
                f_291_ = (f_280_ - f_279_) / (f_277_ - f_276_);
            float f_292_ = 0.0F;
            if (f_277_ != f)
                f_292_ = (f_278_ - f_280_) / (f - f_277_);
            float f_293_ = f_284_ * f_287_ - f_286_ * f_285_;
            if (f_293_ != 0.0F) {
                float f_294_ = (f_288_ * f_287_ - f_289_ * f_285_) / f_293_;
                float f_295_ = (f_289_ * f_284_ - f_288_ * f_286_) / f_293_;
                if (f <= f_276_ && f <= f_277_) {
                    if (!(f >= (float) ((Class244) this).anInt2717)) {
                        if (f_276_ > (float) ((Class244) this).anInt2717)
                            f_276_ = (float) ((Class244) this).anInt2717;
                        if (f_277_ > (float) ((Class244) this).anInt2717)
                            f_277_ = (float) ((Class244) this).anInt2717;
                        f_281_ = f_281_ - f_294_ * f_278_ + f_294_;
                        if (f_276_ < f_277_) {
                            f_280_ = f_278_;
                            if (f < 0.0F) {
                                f_280_ -= f_292_ * f;
                                f_278_ -= f_290_ * f;
                                f_281_ -= f_295_ * f;
                                f = 0.0F;
                            }
                            if (f_276_ < 0.0F) {
                                f_279_ -= f_291_ * f_276_;
                                f_276_ = 0.0F;
                            }
                            if (f != f_276_ && f_292_ < f_290_ || f == f_276_ && f_292_ > f_291_) {
                                f_277_ -= f_276_;
                                f_276_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_276_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_280_, (int) f_278_, f_281_, f_294_);
                                    f_280_ += f_292_;
                                    f_278_ += f_290_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_280_, (int) f_279_, f_281_, f_294_);
                                    f_280_ += f_292_;
                                    f_279_ += f_291_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                            } else {
                                f_277_ -= f_276_;
                                f_276_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_276_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_278_, (int) f_280_, f_281_, f_294_);
                                    f_280_ += f_292_;
                                    f_278_ += f_290_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_279_, (int) f_280_, f_281_, f_294_);
                                    f_280_ += f_292_;
                                    f_279_ += f_291_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                            }
                        } else {
                            f_279_ = f_278_;
                            if (f < 0.0F) {
                                f_279_ -= f_292_ * f;
                                f_278_ -= f_290_ * f;
                                f_281_ -= f_295_ * f;
                                f = 0.0F;
                            }
                            if (f_277_ < 0.0F) {
                                f_280_ -= f_291_ * f_277_;
                                f_277_ = 0.0F;
                            }
                            if (f != f_277_ && f_292_ < f_290_ || f == f_277_ && f_291_ > f_290_) {
                                f_276_ -= f_277_;
                                f_277_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_279_, (int) f_278_, f_281_, f_294_);
                                    f_279_ += f_292_;
                                    f_278_ += f_290_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                                while (--f_276_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_280_, (int) f_278_, f_281_, f_294_);
                                    f_280_ += f_291_;
                                    f_278_ += f_290_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                            } else {
                                f_276_ -= f_277_;
                                f_277_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_278_, (int) f_279_, f_281_, f_294_);
                                    f_279_ += f_292_;
                                    f_278_ += f_290_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                                while (--f_276_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f, i, 0, (int) f_278_, (int) f_280_, f_281_, f_294_);
                                    f_280_ += f_291_;
                                    f_278_ += f_290_;
                                    f_281_ += f_295_;
                                    f += (float) anInt2716;
                                }
                            }
                        }
                    }
                } else if (f_276_ <= f_277_) {
                    if (!(f_276_ >= (float) ((Class244) this).anInt2717)) {
                        if (f_277_ > (float) ((Class244) this).anInt2717)
                            f_277_ = (float) ((Class244) this).anInt2717;
                        if (f > (float) ((Class244) this).anInt2717)
                            f = (float) ((Class244) this).anInt2717;
                        f_282_ = f_282_ - f_294_ * f_279_ + f_294_;
                        if (f_277_ < f) {
                            f_278_ = f_279_;
                            if (f_276_ < 0.0F) {
                                f_278_ -= f_290_ * f_276_;
                                f_279_ -= f_291_ * f_276_;
                                f_282_ -= f_295_ * f_276_;
                                f_276_ = 0.0F;
                            }
                            if (f_277_ < 0.0F) {
                                f_280_ -= f_292_ * f_277_;
                                f_277_ = 0.0F;
                            }
                            if (f_276_ != f_277_ && f_290_ < f_291_ || f_276_ == f_277_ && f_290_ > f_292_) {
                                f -= f_277_;
                                f_277_ -= f_276_;
                                f_276_ = (float) (((Class244) this).anIntArray2720[(int) f_276_]);
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_278_, (int) f_279_, f_282_, f_294_);
                                    f_278_ += f_290_;
                                    f_279_ += f_291_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                                while (--f >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_278_, (int) f_280_, f_282_, f_294_);
                                    f_278_ += f_290_;
                                    f_280_ += f_292_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                            } else {
                                f -= f_277_;
                                f_277_ -= f_276_;
                                f_276_ = (float) (((Class244) this).anIntArray2720[(int) f_276_]);
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_279_, (int) f_278_, f_282_, f_294_);
                                    f_278_ += f_290_;
                                    f_279_ += f_291_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                                while (--f >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_280_, (int) f_278_, f_282_, f_294_);
                                    f_278_ += f_290_;
                                    f_280_ += f_292_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                            }
                        } else {
                            f_280_ = f_279_;
                            if (f_276_ < 0.0F) {
                                f_280_ -= f_290_ * f_276_;
                                f_279_ -= f_291_ * f_276_;
                                f_282_ -= f_295_ * f_276_;
                                f_276_ = 0.0F;
                            }
                            if (f < 0.0F) {
                                f_278_ -= f_292_ * f;
                                f = 0.0F;
                            }
                            if (f_290_ < f_291_) {
                                f_277_ -= f;
                                f -= f_276_;
                                f_276_ = (float) (((Class244) this).anIntArray2720[(int) f_276_]);
                                while (--f >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_280_, (int) f_279_, f_282_, f_294_);
                                    f_280_ += f_290_;
                                    f_279_ += f_291_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_278_, (int) f_279_, f_282_, f_294_);
                                    f_278_ += f_292_;
                                    f_279_ += f_291_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                            } else {
                                f_277_ -= f;
                                f -= f_276_;
                                f_276_ = (float) (((Class244) this).anIntArray2720[(int) f_276_]);
                                while (--f >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_279_, (int) f_280_, f_282_, f_294_);
                                    f_280_ += f_290_;
                                    f_279_ += f_291_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                                while (--f_277_ >= 0.0F) {
                                    method1942(anIntArray2721, aFloatArray2726, (int) f_276_, i, 0, (int) f_279_, (int) f_278_, f_282_, f_294_);
                                    f_278_ += f_292_;
                                    f_279_ += f_291_;
                                    f_282_ += f_295_;
                                    f_276_ += (float) anInt2716;
                                }
                            }
                        }
                    }
                } else if (!(f_277_ >= (float) ((Class244) this).anInt2717)) {
                    if (f > (float) ((Class244) this).anInt2717)
                        f = (float) ((Class244) this).anInt2717;
                    if (f_276_ > (float) ((Class244) this).anInt2717)
                        f_276_ = (float) ((Class244) this).anInt2717;
                    f_283_ = f_283_ - f_294_ * f_280_ + f_294_;
                    if (f < f_276_) {
                        f_279_ = f_280_;
                        if (f_277_ < 0.0F) {
                            f_279_ -= f_291_ * f_277_;
                            f_280_ -= f_292_ * f_277_;
                            f_283_ -= f_295_ * f_277_;
                            f_277_ = 0.0F;
                        }
                        if (f < 0.0F) {
                            f_278_ -= f_290_ * f;
                            f = 0.0F;
                        }
                        if (f_291_ < f_292_) {
                            f_276_ -= f;
                            f -= f_277_;
                            f_277_ = (float) (((Class244) this).anIntArray2720[(int) f_277_]);
                            while (--f >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_279_, (int) f_280_, f_283_, f_294_);
                                f_279_ += f_291_;
                                f_280_ += f_292_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                            while (--f_276_ >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_279_, (int) f_278_, f_283_, f_294_);
                                f_279_ += f_291_;
                                f_278_ += f_290_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                        } else {
                            f_276_ -= f;
                            f -= f_277_;
                            f_277_ = (float) (((Class244) this).anIntArray2720[(int) f_277_]);
                            while (--f >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_280_, (int) f_279_, f_283_, f_294_);
                                f_279_ += f_291_;
                                f_280_ += f_292_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                            while (--f_276_ >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_278_, (int) f_279_, f_283_, f_294_);
                                f_279_ += f_291_;
                                f_278_ += f_290_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                        }
                    } else {
                        f_278_ = f_280_;
                        if (f_277_ < 0.0F) {
                            f_278_ -= f_291_ * f_277_;
                            f_280_ -= f_292_ * f_277_;
                            f_283_ -= f_295_ * f_277_;
                            f_277_ = 0.0F;
                        }
                        if (f_276_ < 0.0F) {
                            f_279_ -= f_290_ * f_276_;
                            f_276_ = 0.0F;
                        }
                        if (f_291_ < f_292_) {
                            f -= f_276_;
                            f_276_ -= f_277_;
                            f_277_ = (float) (((Class244) this).anIntArray2720[(int) f_277_]);
                            while (--f_276_ >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_278_, (int) f_280_, f_283_, f_294_);
                                f_278_ += f_291_;
                                f_280_ += f_292_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                            while (--f >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_279_, (int) f_280_, f_283_, f_294_);
                                f_279_ += f_290_;
                                f_280_ += f_292_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                        } else {
                            f -= f_276_;
                            f_276_ -= f_277_;
                            f_277_ = (float) (((Class244) this).anIntArray2720[(int) f_277_]);
                            while (--f_276_ >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_280_, (int) f_278_, f_283_, f_294_);
                                f_278_ += f_291_;
                                f_280_ += f_292_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                            while (--f >= 0.0F) {
                                method1942(anIntArray2721, aFloatArray2726, (int) f_277_, i, 0, (int) f_280_, (int) f_279_, f_283_, f_294_);
                                f_279_ += f_290_;
                                f_280_ += f_292_;
                                f_283_ += f_295_;
                                f_277_ += (float) anInt2716;
                            }
                        }
                    }
                }
            }
        }
    }

    final int method1950() {
        return ((Class244) this).anIntArray2720[0] / anInt2716;
    }

    final void method1951(float f, float f_296_, float f_297_, float f_298_, float f_299_, float f_300_, float f_301_, float f_302_, float f_303_, float f_304_, float f_305_, float f_306_) {
        if (aBoolean2725) {
            aHa_Sub1_2722.method811((int) f_299_, (int) f_296_, (int) f, Node.anIntArray2801[(int) f_304_], (byte) 49, (int) f_298_);
            aHa_Sub1_2722.method811((int) f_300_, (int) f_297_, (int) f_296_, Node.anIntArray2801[(int) f_304_], (byte) 49, (int) f_299_);
            aHa_Sub1_2722.method811((int) f_298_, (int) f, (int) f_297_, Node.anIntArray2801[(int) f_304_], (byte) 49, (int) f_300_);
        } else {
            float f_307_ = f_299_ - f_298_;
            float f_308_ = f_296_ - f;
            float f_309_ = f_300_ - f_298_;
            float f_310_ = f_297_ - f;
            float f_311_ = f_305_ - f_304_;
            float f_312_ = f_306_ - f_304_;
            float f_313_ = f_302_ - f_301_;
            float f_314_ = f_303_ - f_301_;
            float f_315_;
            if (f_297_ != f_296_)
                f_315_ = (f_300_ - f_299_) / (f_297_ - f_296_);
            else
                f_315_ = 0.0F;
            float f_316_;
            if (f_296_ != f)
                f_316_ = f_307_ / f_308_;
            else
                f_316_ = 0.0F;
            float f_317_;
            if (f_297_ != f)
                f_317_ = f_309_ / f_310_;
            else
                f_317_ = 0.0F;
            float f_318_ = f_307_ * f_310_ - f_309_ * f_308_;
            if (f_318_ != 0.0F) {
                float f_319_ = (f_311_ * f_310_ - f_312_ * f_308_) / f_318_;
                float f_320_ = (f_312_ * f_307_ - f_311_ * f_309_) / f_318_;
                float f_321_ = (f_313_ * f_310_ - f_314_ * f_308_) / f_318_;
                float f_322_ = (f_314_ * f_307_ - f_313_ * f_309_) / f_318_;
                if (f <= f_296_ && f <= f_297_) {
                    if (!(f >= (float) ((Class244) this).anInt2717)) {
                        if (f_296_ > (float) ((Class244) this).anInt2717)
                            f_296_ = (float) ((Class244) this).anInt2717;
                        if (f_297_ > (float) ((Class244) this).anInt2717)
                            f_297_ = (float) ((Class244) this).anInt2717;
                        f_304_ = f_304_ - f_319_ * f_298_ + f_319_;
                        f_301_ = f_301_ - f_321_ * f_298_ + f_321_;
                        if (f_296_ < f_297_) {
                            f_300_ = f_298_;
                            if (f < 0.0F) {
                                f_300_ -= f_317_ * f;
                                f_298_ -= f_316_ * f;
                                f_304_ -= f_320_ * f;
                                f_301_ -= f_322_ * f;
                                f = 0.0F;
                            }
                            if (f_296_ < 0.0F) {
                                f_299_ -= f_315_ * f_296_;
                                f_296_ = 0.0F;
                            }
                            if (f != f_296_ && f_317_ < f_316_ || f == f_296_ && f_317_ > f_315_) {
                                f_297_ -= f_296_;
                                f_296_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_296_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_300_, (int) f_298_, f_304_, f_319_, f_301_, f_321_);
                                    f_300_ += f_317_;
                                    f_298_ += f_316_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_300_, (int) f_299_, f_304_, f_319_, f_301_, f_321_);
                                    f_300_ += f_317_;
                                    f_299_ += f_315_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                            } else {
                                f_297_ -= f_296_;
                                f_296_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_296_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_298_, (int) f_300_, f_304_, f_319_, f_301_, f_321_);
                                    f_300_ += f_317_;
                                    f_298_ += f_316_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_299_, (int) f_300_, f_304_, f_319_, f_301_, f_321_);
                                    f_300_ += f_317_;
                                    f_299_ += f_315_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                            }
                        } else {
                            f_299_ = f_298_;
                            if (f < 0.0F) {
                                f_299_ -= f_317_ * f;
                                f_298_ -= f_316_ * f;
                                f_304_ -= f_320_ * f;
                                f_301_ -= f_322_ * f;
                                f = 0.0F;
                            }
                            if (f_297_ < 0.0F) {
                                f_300_ -= f_315_ * f_297_;
                                f_297_ = 0.0F;
                            }
                            if (f != f_297_ && f_317_ < f_316_ || f == f_297_ && f_315_ > f_316_) {
                                f_296_ -= f_297_;
                                f_297_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_299_, (int) f_298_, f_304_, f_319_, f_301_, f_321_);
                                    f_299_ += f_317_;
                                    f_298_ += f_316_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                                while (--f_296_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_300_, (int) f_298_, f_304_, f_319_, f_301_, f_321_);
                                    f_300_ += f_315_;
                                    f_298_ += f_316_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                            } else {
                                f_296_ -= f_297_;
                                f_297_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_298_, (int) f_299_, f_304_, f_319_, f_301_, f_321_);
                                    f_299_ += f_317_;
                                    f_298_ += f_316_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                                while (--f_296_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_298_, (int) f_300_, f_304_, f_319_, f_301_, f_321_);
                                    f_300_ += f_315_;
                                    f_298_ += f_316_;
                                    f_304_ += f_320_;
                                    f_301_ += f_322_;
                                    f += (float) anInt2716;
                                }
                            }
                        }
                    }
                } else if (f_296_ <= f_297_) {
                    if (!(f_296_ >= (float) ((Class244) this).anInt2717)) {
                        if (f_297_ > (float) ((Class244) this).anInt2717)
                            f_297_ = (float) ((Class244) this).anInt2717;
                        if (f > (float) ((Class244) this).anInt2717)
                            f = (float) ((Class244) this).anInt2717;
                        f_305_ = f_305_ - f_319_ * f_299_ + f_319_;
                        f_302_ = f_302_ - f_321_ * f_299_ + f_321_;
                        if (f_297_ < f) {
                            f_298_ = f_299_;
                            if (f_296_ < 0.0F) {
                                f_298_ -= f_316_ * f_296_;
                                f_299_ -= f_315_ * f_296_;
                                f_305_ -= f_320_ * f_296_;
                                f_302_ -= f_322_ * f_296_;
                                f_296_ = 0.0F;
                            }
                            if (f_297_ < 0.0F) {
                                f_300_ -= f_317_ * f_297_;
                                f_297_ = 0.0F;
                            }
                            if (f_296_ != f_297_ && f_316_ < f_315_ || f_296_ == f_297_ && f_316_ > f_317_) {
                                f -= f_297_;
                                f_297_ -= f_296_;
                                f_296_ = (float) (((Class244) this).anIntArray2720[(int) f_296_]);
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_298_, (int) f_299_, f_305_, f_319_, f_302_, f_321_);
                                    f_298_ += f_316_;
                                    f_299_ += f_315_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                                while (--f >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_298_, (int) f_300_, f_305_, f_319_, f_302_, f_321_);
                                    f_298_ += f_316_;
                                    f_300_ += f_317_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                            } else {
                                f -= f_297_;
                                f_297_ -= f_296_;
                                f_296_ = (float) (((Class244) this).anIntArray2720[(int) f_296_]);
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_299_, (int) f_298_, f_305_, f_319_, f_302_, f_321_);
                                    f_298_ += f_316_;
                                    f_299_ += f_315_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                                while (--f >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_300_, (int) f_298_, f_305_, f_319_, f_302_, f_321_);
                                    f_298_ += f_316_;
                                    f_300_ += f_317_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                            }
                        } else {
                            f_300_ = f_299_;
                            if (f_296_ < 0.0F) {
                                f_300_ -= f_316_ * f_296_;
                                f_299_ -= f_315_ * f_296_;
                                f_305_ -= f_320_ * f_296_;
                                f_302_ -= f_322_ * f_296_;
                                f_296_ = 0.0F;
                            }
                            if (f < 0.0F) {
                                f_298_ -= f_317_ * f;
                                f = 0.0F;
                            }
                            if (f_316_ < f_315_) {
                                f_297_ -= f;
                                f -= f_296_;
                                f_296_ = (float) (((Class244) this).anIntArray2720[(int) f_296_]);
                                while (--f >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_300_, (int) f_299_, f_305_, f_319_, f_302_, f_321_);
                                    f_300_ += f_316_;
                                    f_299_ += f_315_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_298_, (int) f_299_, f_305_, f_319_, f_302_, f_321_);
                                    f_298_ += f_317_;
                                    f_299_ += f_315_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                            } else {
                                f_297_ -= f;
                                f -= f_296_;
                                f_296_ = (float) (((Class244) this).anIntArray2720[(int) f_296_]);
                                while (--f >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_299_, (int) f_300_, f_305_, f_319_, f_302_, f_321_);
                                    f_300_ += f_316_;
                                    f_299_ += f_315_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                                while (--f_297_ >= 0.0F) {
                                    method1946(anIntArray2721, aFloatArray2726, (int) f_296_, 0, 0, (int) f_299_, (int) f_298_, f_305_, f_319_, f_302_, f_321_);
                                    f_298_ += f_317_;
                                    f_299_ += f_315_;
                                    f_305_ += f_320_;
                                    f_302_ += f_322_;
                                    f_296_ += (float) anInt2716;
                                }
                            }
                        }
                    }
                } else if (!(f_297_ >= (float) ((Class244) this).anInt2717)) {
                    if (f > (float) ((Class244) this).anInt2717)
                        f = (float) ((Class244) this).anInt2717;
                    if (f_296_ > (float) ((Class244) this).anInt2717)
                        f_296_ = (float) ((Class244) this).anInt2717;
                    f_306_ = f_306_ - f_319_ * f_300_ + f_319_;
                    f_303_ = f_303_ - f_321_ * f_300_ + f_321_;
                    if (f < f_296_) {
                        f_299_ = f_300_;
                        if (f_297_ < 0.0F) {
                            f_299_ -= f_315_ * f_297_;
                            f_300_ -= f_317_ * f_297_;
                            f_306_ -= f_320_ * f_297_;
                            f_303_ -= f_322_ * f_297_;
                            f_297_ = 0.0F;
                        }
                        if (f < 0.0F) {
                            f_298_ -= f_316_ * f;
                            f = 0.0F;
                        }
                        if (f_315_ < f_317_) {
                            f_296_ -= f;
                            f -= f_297_;
                            f_297_ = (float) (((Class244) this).anIntArray2720[(int) f_297_]);
                            while (--f >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_299_, (int) f_300_, f_306_, f_319_, f_303_, f_321_);
                                f_299_ += f_315_;
                                f_300_ += f_317_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                            while (--f_296_ >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_299_, (int) f_298_, f_306_, f_319_, f_303_, f_321_);
                                f_299_ += f_315_;
                                f_298_ += f_316_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                        } else {
                            f_296_ -= f;
                            f -= f_297_;
                            f_297_ = (float) (((Class244) this).anIntArray2720[(int) f_297_]);
                            while (--f >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_300_, (int) f_299_, f_306_, f_319_, f_303_, f_321_);
                                f_299_ += f_315_;
                                f_300_ += f_317_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                            while (--f_296_ >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_298_, (int) f_299_, f_306_, f_319_, f_303_, f_321_);
                                f_299_ += f_315_;
                                f_298_ += f_316_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                        }
                    } else {
                        f_298_ = f_300_;
                        if (f_297_ < 0.0F) {
                            f_298_ -= f_315_ * f_297_;
                            f_300_ -= f_317_ * f_297_;
                            f_306_ -= f_320_ * f_297_;
                            f_303_ -= f_322_ * f_297_;
                            f_297_ = 0.0F;
                        }
                        if (f_296_ < 0.0F) {
                            f_299_ -= f_316_ * f_296_;
                            f_296_ = 0.0F;
                        }
                        if (f_315_ < f_317_) {
                            f -= f_296_;
                            f_296_ -= f_297_;
                            f_297_ = (float) (((Class244) this).anIntArray2720[(int) f_297_]);
                            while (--f_296_ >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_298_, (int) f_300_, f_306_, f_319_, f_303_, f_321_);
                                f_298_ += f_315_;
                                f_300_ += f_317_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                            while (--f >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_299_, (int) f_300_, f_306_, f_319_, f_303_, f_321_);
                                f_299_ += f_316_;
                                f_300_ += f_317_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                        } else {
                            f -= f_296_;
                            f_296_ -= f_297_;
                            f_297_ = (float) (((Class244) this).anIntArray2720[(int) f_297_]);
                            while (--f_296_ >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_300_, (int) f_298_, f_306_, f_319_, f_303_, f_321_);
                                f_298_ += f_315_;
                                f_300_ += f_317_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                            while (--f >= 0.0F) {
                                method1946(anIntArray2721, aFloatArray2726, (int) f_297_, 0, 0, (int) f_300_, (int) f_299_, f_306_, f_319_, f_303_, f_321_);
                                f_299_ += f_316_;
                                f_300_ += f_317_;
                                f_306_ += f_320_;
                                f_303_ += f_322_;
                                f_297_ += (float) anInt2716;
                            }
                        }
                    }
                }
            }
        }
    }

    final int method1952() {
        return ((Class244) this).anIntArray2720[0] % anInt2716;
    }

    final void method1953(float f, float f_323_, float f_324_, float f_325_, float f_326_, float f_327_, float f_328_, float f_329_, float f_330_, int i, int i_331_, int i_332_) {
        if (aBoolean2725) {
            aHa_Sub1_2722.method811((int) f_326_, (int) f_323_, (int) f, ~0xffffff | i, (byte) 49, (int) f_325_);
            aHa_Sub1_2722.method811((int) f_327_, (int) f_324_, (int) f_323_, ~0xffffff | i, (byte) 49, (int) f_326_);
            aHa_Sub1_2722.method811((int) f_325_, (int) f, (int) f_324_, ~0xffffff | i, (byte) 49, (int) f_327_);
        } else {
            float f_333_ = f_326_ - f_325_;
            float f_334_ = f_323_ - f;
            float f_335_ = f_327_ - f_325_;
            float f_336_ = f_324_ - f;
            float f_337_ = f_329_ - f_328_;
            float f_338_ = f_330_ - f_328_;
            float f_339_ = (float) ((i_331_ & 0xff0000) - (i & 0xff0000));
            float f_340_ = (float) ((i_332_ & 0xff0000) - (i & 0xff0000));
            float f_341_ = (float) ((i_331_ & 0xff00) - (i & 0xff00));
            float f_342_ = (float) ((i_332_ & 0xff00) - (i & 0xff00));
            float f_343_ = (float) ((i_331_ & 0xff) - (i & 0xff));
            float f_344_ = (float) ((i_332_ & 0xff) - (i & 0xff));
            float f_345_;
            if (f_324_ != f_323_)
                f_345_ = (f_327_ - f_326_) / (f_324_ - f_323_);
            else
                f_345_ = 0.0F;
            float f_346_;
            if (f_323_ != f)
                f_346_ = f_333_ / f_334_;
            else
                f_346_ = 0.0F;
            float f_347_;
            if (f_324_ != f)
                f_347_ = f_335_ / f_336_;
            else
                f_347_ = 0.0F;
            float f_348_ = f_333_ * f_336_ - f_335_ * f_334_;
            if (f_348_ != 0.0F) {
                float f_349_ = (f_337_ * f_336_ - f_338_ * f_334_) / f_348_;
                float f_350_ = (f_338_ * f_333_ - f_337_ * f_335_) / f_348_;
                float f_351_ = (f_339_ * f_336_ - f_340_ * f_334_) / f_348_;
                float f_352_ = (f_340_ * f_333_ - f_339_ * f_335_) / f_348_;
                float f_353_ = (f_341_ * f_336_ - f_342_ * f_334_) / f_348_;
                float f_354_ = (f_342_ * f_333_ - f_341_ * f_335_) / f_348_;
                float f_355_ = (f_343_ * f_336_ - f_344_ * f_334_) / f_348_;
                float f_356_ = (f_344_ * f_333_ - f_343_ * f_335_) / f_348_;
                if (f <= f_323_ && f <= f_324_) {
                    if (!(f >= (float) ((Class244) this).anInt2717)) {
                        if (f_323_ > (float) ((Class244) this).anInt2717)
                            f_323_ = (float) ((Class244) this).anInt2717;
                        if (f_324_ > (float) ((Class244) this).anInt2717)
                            f_324_ = (float) ((Class244) this).anInt2717;
                        f_328_ = f_328_ - f_349_ * f_325_ + f_349_;
                        float f_357_ = ((float) (i & 0xff0000) - f_351_ * f_325_ + f_351_);
                        float f_358_ = (float) (i & 0xff00) - f_353_ * f_325_ + f_353_;
                        float f_359_ = (float) (i & 0xff) - f_355_ * f_325_ + f_355_;
                        if (f_323_ < f_324_) {
                            f_327_ = f_325_;
                            if (f < 0.0F) {
                                f_327_ -= f_347_ * f;
                                f_325_ -= f_346_ * f;
                                f_328_ -= f_350_ * f;
                                f_357_ -= f_352_ * f;
                                f_358_ -= f_354_ * f;
                                f_359_ -= f_356_ * f;
                                f = 0.0F;
                            }
                            if (f_323_ < 0.0F) {
                                f_326_ -= f_345_ * f_323_;
                                f_323_ = 0.0F;
                            }
                            if (f != f_323_ && f_347_ < f_346_ || f == f_323_ && f_347_ > f_345_) {
                                f_324_ -= f_323_;
                                f_323_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_323_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_327_, (int) f_325_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_327_ += f_347_;
                                    f_325_ += f_346_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_327_, (int) f_326_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_327_ += f_347_;
                                    f_326_ += f_345_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                            } else {
                                f_324_ -= f_323_;
                                f_323_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_323_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_325_, (int) f_327_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_327_ += f_347_;
                                    f_325_ += f_346_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_326_, (int) f_327_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_327_ += f_347_;
                                    f_326_ += f_345_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                            }
                        } else {
                            f_326_ = f_325_;
                            if (f < 0.0F) {
                                f_326_ -= f_347_ * f;
                                f_325_ -= f_346_ * f;
                                f_328_ -= f_350_ * f;
                                f_357_ -= f_352_ * f;
                                f_358_ -= f_354_ * f;
                                f_359_ -= f_356_ * f;
                                f = 0.0F;
                            }
                            if (f_324_ < 0.0F) {
                                f_327_ -= f_345_ * f_324_;
                                f_324_ = 0.0F;
                            }
                            if (f != f_324_ && f_347_ < f_346_ || f == f_324_ && f_345_ > f_346_) {
                                f_323_ -= f_324_;
                                f_324_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_326_, (int) f_325_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_326_ += f_347_;
                                    f_325_ += f_346_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                                while (--f_323_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_327_, (int) f_325_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_327_ += f_345_;
                                    f_325_ += f_346_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                            } else {
                                f_323_ -= f_324_;
                                f_324_ -= f;
                                f = (float) (((Class244) this).anIntArray2720[(int) f]);
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_325_, (int) f_326_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_326_ += f_347_;
                                    f_325_ += f_346_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                                while (--f_323_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f, 0, 0, (int) f_325_, (int) f_327_, f_328_, f_349_, f_357_, f_351_, f_358_, f_353_, f_359_, f_355_);
                                    f_327_ += f_345_;
                                    f_325_ += f_346_;
                                    f_328_ += f_350_;
                                    f_357_ += f_352_;
                                    f_358_ += f_354_;
                                    f_359_ += f_356_;
                                    f += (float) anInt2716;
                                }
                            }
                        }
                    }
                } else if (f_323_ <= f_324_) {
                    if (!(f_323_ >= (float) ((Class244) this).anInt2717)) {
                        if (f_324_ > (float) ((Class244) this).anInt2717)
                            f_324_ = (float) ((Class244) this).anInt2717;
                        if (f > (float) ((Class244) this).anInt2717)
                            f = (float) ((Class244) this).anInt2717;
                        f_329_ = f_329_ - f_349_ * f_326_ + f_349_;
                        float f_360_ = ((float) (i_331_ & 0xff0000) - f_351_ * f_326_ + f_351_);
                        float f_361_ = ((float) (i_331_ & 0xff00) - f_353_ * f_326_ + f_353_);
                        float f_362_ = ((float) (i_331_ & 0xff) - f_355_ * f_326_ + f_355_);
                        if (f_324_ < f) {
                            f_325_ = f_326_;
                            if (f_323_ < 0.0F) {
                                f_325_ -= f_346_ * f_323_;
                                f_326_ -= f_345_ * f_323_;
                                f_329_ -= f_350_ * f_323_;
                                f_360_ -= f_352_ * f_323_;
                                f_361_ -= f_354_ * f_323_;
                                f_362_ -= f_356_ * f_323_;
                                f_323_ = 0.0F;
                            }
                            if (f_324_ < 0.0F) {
                                f_327_ -= f_347_ * f_324_;
                                f_324_ = 0.0F;
                            }
                            if (f_323_ != f_324_ && f_346_ < f_345_ || f_323_ == f_324_ && f_346_ > f_347_) {
                                f -= f_324_;
                                f_324_ -= f_323_;
                                f_323_ = (float) (((Class244) this).anIntArray2720[(int) f_323_]);
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_325_, (int) f_326_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_325_ += f_346_;
                                    f_326_ += f_345_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                                while (--f >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_325_, (int) f_327_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_325_ += f_346_;
                                    f_327_ += f_347_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                            } else {
                                f -= f_324_;
                                f_324_ -= f_323_;
                                f_323_ = (float) (((Class244) this).anIntArray2720[(int) f_323_]);
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_326_, (int) f_325_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_325_ += f_346_;
                                    f_326_ += f_345_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                                while (--f >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_327_, (int) f_325_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_325_ += f_346_;
                                    f_327_ += f_347_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                            }
                        } else {
                            f_327_ = f_326_;
                            if (f_323_ < 0.0F) {
                                f_327_ -= f_346_ * f_323_;
                                f_326_ -= f_345_ * f_323_;
                                f_329_ -= f_350_ * f_323_;
                                f_360_ -= f_352_ * f_323_;
                                f_361_ -= f_354_ * f_323_;
                                f_362_ -= f_356_ * f_323_;
                                f_323_ = 0.0F;
                            }
                            if (f < 0.0F) {
                                f_325_ -= f_347_ * f;
                                f = 0.0F;
                            }
                            if (f_346_ < f_345_) {
                                f_324_ -= f;
                                f -= f_323_;
                                f_323_ = (float) (((Class244) this).anIntArray2720[(int) f_323_]);
                                while (--f >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_327_, (int) f_326_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_327_ += f_346_;
                                    f_326_ += f_345_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_325_, (int) f_326_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_325_ += f_347_;
                                    f_326_ += f_345_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                            } else {
                                f_324_ -= f;
                                f -= f_323_;
                                f_323_ = (float) (((Class244) this).anIntArray2720[(int) f_323_]);
                                while (--f >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_326_, (int) f_327_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_327_ += f_346_;
                                    f_326_ += f_345_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                                while (--f_324_ >= 0.0F) {
                                    method1954(anIntArray2721, aFloatArray2726, (int) f_323_, 0, 0, (int) f_326_, (int) f_325_, f_329_, f_349_, f_360_, f_351_, f_361_, f_353_, f_362_, f_355_);
                                    f_325_ += f_347_;
                                    f_326_ += f_345_;
                                    f_329_ += f_350_;
                                    f_360_ += f_352_;
                                    f_361_ += f_354_;
                                    f_362_ += f_356_;
                                    f_323_ += (float) anInt2716;
                                }
                            }
                        }
                    }
                } else if (!(f_324_ >= (float) ((Class244) this).anInt2717)) {
                    if (f > (float) ((Class244) this).anInt2717)
                        f = (float) ((Class244) this).anInt2717;
                    if (f_323_ > (float) ((Class244) this).anInt2717)
                        f_323_ = (float) ((Class244) this).anInt2717;
                    f_330_ = f_330_ - f_349_ * f_327_ + f_349_;
                    float f_363_ = ((float) (i_332_ & 0xff0000) - f_351_ * f_327_ + f_351_);
                    float f_364_ = (float) (i_332_ & 0xff00) - f_353_ * f_327_ + f_353_;
                    float f_365_ = (float) (i_332_ & 0xff) - f_355_ * f_327_ + f_355_;
                    if (f < f_323_) {
                        f_326_ = f_327_;
                        if (f_324_ < 0.0F) {
                            f_326_ -= f_345_ * f_324_;
                            f_327_ -= f_347_ * f_324_;
                            f_330_ -= f_350_ * f_324_;
                            f_363_ -= f_352_ * f_324_;
                            f_364_ -= f_354_ * f_324_;
                            f_365_ -= f_356_ * f_324_;
                            f_324_ = 0.0F;
                        }
                        if (f < 0.0F) {
                            f_325_ -= f_346_ * f;
                            f = 0.0F;
                        }
                        if (f_345_ < f_347_) {
                            f_323_ -= f;
                            f -= f_324_;
                            f_324_ = (float) (((Class244) this).anIntArray2720[(int) f_324_]);
                            while (--f >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_326_, (int) f_327_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_326_ += f_345_;
                                f_327_ += f_347_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                            while (--f_323_ >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_326_, (int) f_325_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_326_ += f_345_;
                                f_325_ += f_346_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                        } else {
                            f_323_ -= f;
                            f -= f_324_;
                            f_324_ = (float) (((Class244) this).anIntArray2720[(int) f_324_]);
                            while (--f >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_327_, (int) f_326_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_326_ += f_345_;
                                f_327_ += f_347_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                            while (--f_323_ >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_325_, (int) f_326_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_326_ += f_345_;
                                f_325_ += f_346_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                        }
                    } else {
                        f_325_ = f_327_;
                        if (f_324_ < 0.0F) {
                            f_325_ -= f_345_ * f_324_;
                            f_327_ -= f_347_ * f_324_;
                            f_330_ -= f_350_ * f_324_;
                            f_363_ -= f_352_ * f_324_;
                            f_364_ -= f_354_ * f_324_;
                            f_365_ -= f_356_ * f_324_;
                            f_324_ = 0.0F;
                        }
                        if (f_323_ < 0.0F) {
                            f_326_ -= f_346_ * f_323_;
                            f_323_ = 0.0F;
                        }
                        if (f_345_ < f_347_) {
                            f -= f_323_;
                            f_323_ -= f_324_;
                            f_324_ = (float) (((Class244) this).anIntArray2720[(int) f_324_]);
                            while (--f_323_ >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_325_, (int) f_327_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_325_ += f_345_;
                                f_327_ += f_347_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                            while (--f >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_326_, (int) f_327_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_326_ += f_346_;
                                f_327_ += f_347_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                        } else {
                            f -= f_323_;
                            f_323_ -= f_324_;
                            f_324_ = (float) (((Class244) this).anIntArray2720[(int) f_324_]);
                            while (--f_323_ >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_327_, (int) f_325_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_325_ += f_345_;
                                f_327_ += f_347_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                            while (--f >= 0.0F) {
                                method1954(anIntArray2721, aFloatArray2726, (int) f_324_, 0, 0, (int) f_327_, (int) f_326_, f_330_, f_349_, f_363_, f_351_, f_364_, f_353_, f_365_, f_355_);
                                f_326_ += f_346_;
                                f_327_ += f_347_;
                                f_330_ += f_350_;
                                f_363_ += f_352_;
                                f_364_ += f_354_;
                                f_365_ += f_356_;
                                f_324_ += (float) anInt2716;
                            }
                        }
                    }
                }
            }
        }
    }

    private final void method1954(int[] is, float[] fs, int i, int i_366_, int i_367_, int i_368_, int i_369_, float f, float f_370_, float f_371_, float f_372_, float f_373_, float f_374_, float f_375_, float f_376_) {
        if (((Class244) this).aBoolean2723) {
            if (i_369_ > ((Class244) this).anInt2713)
                i_369_ = ((Class244) this).anInt2713;
            if (i_368_ < 0)
                i_368_ = 0;
        }
        if (i_368_ < i_369_) {
            if (aBoolean2724) {
                i += i_368_;
                f_371_ += f_372_ * (float) i_368_;
                f_373_ += f_374_ * (float) i_368_;
                f_375_ += f_376_ * (float) i_368_;
                if (((Class244) this).aBoolean2711) {
                    i_367_ = i_369_ - i_368_ >> 2;
                    f_372_ *= 4.0F;
                    f_374_ *= 4.0F;
                    f_376_ *= 4.0F;
                    if (((Class244) this).anInt2718 == 0) {
                        if (i_367_ > 0) {
                            do {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                                is[i++] = i_366_;
                                is[i++] = i_366_;
                                is[i++] = i_366_;
                                is[i++] = i_366_;
                            } while (--i_367_ > 0);
                        }
                        i_367_ = i_369_ - i_368_ & 0x3;
                        if (i_367_ > 0) {
                            i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            do
                                is[i++] = i_366_; while (--i_367_ > 0);
                        }
                    } else if (!((Class244) this).aBoolean2714) {
                        int i_377_ = ((Class244) this).anInt2718;
                        int i_378_ = 256 - ((Class244) this).anInt2718;
                        if (i_367_ > 0) {
                            do {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                                i_366_ = (((i_366_ & 0xff00ff) * i_378_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_378_ >> 8 & 0xff00));
                                int i_379_ = is[i];
                                is[i++] = (i_366_ + ((i_379_ & 0xff00ff) * i_377_ >> 8 & 0xff00ff) + ((i_379_ & 0xff00) * i_377_ >> 8 & 0xff00));
                                i_379_ = is[i];
                                is[i++] = (i_366_ + ((i_379_ & 0xff00ff) * i_377_ >> 8 & 0xff00ff) + ((i_379_ & 0xff00) * i_377_ >> 8 & 0xff00));
                                i_379_ = is[i];
                                is[i++] = (i_366_ + ((i_379_ & 0xff00ff) * i_377_ >> 8 & 0xff00ff) + ((i_379_ & 0xff00) * i_377_ >> 8 & 0xff00));
                                i_379_ = is[i];
                                is[i++] = (i_366_ + ((i_379_ & 0xff00ff) * i_377_ >> 8 & 0xff00ff) + ((i_379_ & 0xff00) * i_377_ >> 8 & 0xff00));
                            } while (--i_367_ > 0);
                        }
                        i_367_ = i_369_ - i_368_ & 0x3;
                        if (i_367_ > 0) {
                            i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            i_366_ = (((i_366_ & 0xff00ff) * i_378_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_378_ >> 8 & 0xff00));
                            do {
                                int i_380_ = is[i];
                                is[i++] = (i_366_ + ((i_380_ & 0xff00ff) * i_377_ >> 8 & 0xff00ff) + ((i_380_ & 0xff00) * i_377_ >> 8 & 0xff00));
                            } while (--i_367_ > 0);
                        }
                    } else {
                        if (i_367_ > 0) {
                            do {
                                i_366_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                                int[] is_381_ = is;
                                int i_382_ = i++;
                                int i_383_ = i_366_;
                                int i_384_ = is_381_[i_382_];
                                int i_385_ = i_383_ + i_384_;
                                int i_386_ = ((i_383_ & 0xff00ff) + (i_384_ & 0xff00ff));
                                i_384_ = (i_386_ & 0x1000100) + (i_385_ - i_386_ & 0x10000);
                                is_381_[i_382_] = (~0xffffff | i_385_ - i_384_ | i_384_ - (i_384_ >>> 8));
                                int[] is_387_ = is;
                                int i_388_ = i++;
                                int i_389_ = i_366_;
                                int i_390_ = is_387_[i_388_];
                                int i_391_ = i_389_ + i_390_;
                                int i_392_ = ((i_389_ & 0xff00ff) + (i_390_ & 0xff00ff));
                                i_390_ = (i_392_ & 0x1000100) + (i_391_ - i_392_ & 0x10000);
                                is_387_[i_388_] = (~0xffffff | i_391_ - i_390_ | i_390_ - (i_390_ >>> 8));
                                int[] is_393_ = is;
                                int i_394_ = i++;
                                int i_395_ = i_366_;
                                int i_396_ = is_393_[i_394_];
                                int i_397_ = i_395_ + i_396_;
                                int i_398_ = ((i_395_ & 0xff00ff) + (i_396_ & 0xff00ff));
                                i_396_ = (i_398_ & 0x1000100) + (i_397_ - i_398_ & 0x10000);
                                is_393_[i_394_] = (~0xffffff | i_397_ - i_396_ | i_396_ - (i_396_ >>> 8));
                                int[] is_399_ = is;
                                int i_400_ = i++;
                                int i_401_ = i_366_;
                                int i_402_ = is_399_[i_400_];
                                int i_403_ = i_401_ + i_402_;
                                int i_404_ = ((i_401_ & 0xff00ff) + (i_402_ & 0xff00ff));
                                i_402_ = (i_404_ & 0x1000100) + (i_403_ - i_404_ & 0x10000);
                                is_399_[i_400_] = (~0xffffff | i_403_ - i_402_ | i_402_ - (i_402_ >>> 8));
                            } while (--i_367_ > 0);
                        }
                        i_367_ = i_369_ - i_368_ & 0x3;
                        if (i_367_ > 0) {
                            i_366_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            do {
                                int[] is_405_ = is;
                                int i_406_ = i++;
                                int i_407_ = i_366_;
                                int i_408_ = is_405_[i_406_];
                                int i_409_ = i_407_ + i_408_;
                                int i_410_ = ((i_407_ & 0xff00ff) + (i_408_ & 0xff00ff));
                                i_408_ = (i_410_ & 0x1000100) + (i_409_ - i_410_ & 0x10000);
                                is_405_[i_406_] = (~0xffffff | i_409_ - i_408_ | i_408_ - (i_408_ >>> 8));
                            } while (--i_367_ > 0);
                        }
                    }
                } else {
                    i_367_ = i_369_ - i_368_;
                    if (((Class244) this).anInt2718 == 0) {
                        do {
                            is[i++] = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            f_371_ += f_372_;
                            f_373_ += f_374_;
                            f_375_ += f_376_;
                        } while (--i_367_ > 0);
                    } else if (!((Class244) this).aBoolean2714) {
                        int i_411_ = ((Class244) this).anInt2718;
                        int i_412_ = 256 - ((Class244) this).anInt2718;
                        do {
                            i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            f_371_ += f_372_;
                            f_373_ += f_374_;
                            f_375_ += f_376_;
                            i_366_ = (((i_366_ & 0xff00ff) * i_412_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_412_ >> 8 & 0xff00));
                            int i_413_ = is[i];
                            is[i++] = (i_366_ + ((i_413_ & 0xff00ff) * i_411_ >> 8 & 0xff00ff) + ((i_413_ & 0xff00) * i_411_ >> 8 & 0xff00));
                        } while (--i_367_ > 0);
                    } else {
                        do {
                            int[] is_414_ = is;
                            int i_415_ = i++;
                            int i_416_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            int i_417_ = is_414_[i_415_];
                            int i_418_ = i_416_ + i_417_;
                            int i_419_ = (i_416_ & 0xff00ff) + (i_417_ & 0xff00ff);
                            i_417_ = (i_419_ & 0x1000100) + (i_418_ - i_419_ & 0x10000);
                            is_414_[i_415_] = (~0xffffff | i_418_ - i_417_ | i_417_ - (i_417_ >>> 8));
                            f_371_ += f_372_;
                            f_373_ += f_374_;
                            f_375_ += f_376_;
                        } while (--i_367_ > 0);
                    }
                }
            } else {
                i += i_368_ - 1;
                f += f_370_ * (float) i_368_;
                f_371_ += f_372_ * (float) i_368_;
                f_373_ += f_374_ * (float) i_368_;
                f_375_ += f_376_ * (float) i_368_;
                if (((Class203) aClass203_2719).aBoolean2316) {
                    if (((Class244) this).aBoolean2711) {
                        i_367_ = i_369_ - i_368_ >> 2;
                        f_372_ *= 4.0F;
                        f_374_ *= 4.0F;
                        f_376_ *= 4.0F;
                        if (((Class244) this).anInt2718 == 0) {
                            if (i_367_ > 0) {
                                do {
                                    i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                    f_371_ += f_372_;
                                    f_373_ += f_374_;
                                    f_375_ += f_376_;
                                    if (f < fs[++i]) {
                                        is[i] = i_366_;
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        is[i] = i_366_;
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        is[i] = i_366_;
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        is[i] = i_366_;
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                } while (--i_367_ > 0);
                            }
                            i_367_ = i_369_ - i_368_ & 0x3;
                            if (i_367_ > 0) {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                do {
                                    if (f < fs[++i]) {
                                        is[i] = i_366_;
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                } while (--i_367_ > 0);
                            }
                        } else if (!((Class244) this).aBoolean2714) {
                            int i_420_ = ((Class244) this).anInt2718;
                            int i_421_ = 256 - ((Class244) this).anInt2718;
                            if (i_367_ > 0) {
                                do {
                                    i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                    f_371_ += f_372_;
                                    f_373_ += f_374_;
                                    f_375_ += f_376_;
                                    i_366_ = (((i_366_ & 0xff00ff) * i_421_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_421_ >> 8 & 0xff00));
                                    if (f < fs[++i]) {
                                        int i_422_ = is[i];
                                        is[i] = (i_366_ + (((i_422_ & 0xff00ff) * i_420_ >> 8) & 0xff00ff) + (((i_422_ & 0xff00) * i_420_ >> 8) & 0xff00));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        int i_423_ = is[i];
                                        is[i] = (i_366_ + (((i_423_ & 0xff00ff) * i_420_ >> 8) & 0xff00ff) + (((i_423_ & 0xff00) * i_420_ >> 8) & 0xff00));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        int i_424_ = is[i];
                                        is[i] = (i_366_ + (((i_424_ & 0xff00ff) * i_420_ >> 8) & 0xff00ff) + (((i_424_ & 0xff00) * i_420_ >> 8) & 0xff00));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        int i_425_ = is[i];
                                        is[i] = (i_366_ + (((i_425_ & 0xff00ff) * i_420_ >> 8) & 0xff00ff) + (((i_425_ & 0xff00) * i_420_ >> 8) & 0xff00));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                } while (--i_367_ > 0);
                            }
                            i_367_ = i_369_ - i_368_ & 0x3;
                            if (i_367_ > 0) {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                i_366_ = (((i_366_ & 0xff00ff) * i_421_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_421_ >> 8 & 0xff00));
                                do {
                                    if (f < fs[++i]) {
                                        int i_426_ = is[i];
                                        is[i] = (i_366_ + (((i_426_ & 0xff00ff) * i_420_ >> 8) & 0xff00ff) + (((i_426_ & 0xff00) * i_420_ >> 8) & 0xff00));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                } while (--i_367_ > 0);
                            }
                        } else {
                            if (i_367_ > 0) {
                                do {
                                    i_366_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                    f_371_ += f_372_;
                                    f_373_ += f_374_;
                                    f_375_ += f_376_;
                                    if (f < fs[++i]) {
                                        int[] is_427_ = is;
                                        int i_428_ = i;
                                        int i_429_ = i_366_;
                                        int i_430_ = is_427_[i_428_];
                                        int i_431_ = i_429_ + i_430_;
                                        int i_432_ = ((i_429_ & 0xff00ff) + (i_430_ & 0xff00ff));
                                        i_430_ = ((i_432_ & 0x1000100) + (i_431_ - i_432_ & 0x10000));
                                        is_427_[i_428_] = (~0xffffff | i_431_ - i_430_ | i_430_ - (i_430_ >>> 8));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        int[] is_433_ = is;
                                        int i_434_ = i;
                                        int i_435_ = i_366_;
                                        int i_436_ = is_433_[i_434_];
                                        int i_437_ = i_435_ + i_436_;
                                        int i_438_ = ((i_435_ & 0xff00ff) + (i_436_ & 0xff00ff));
                                        i_436_ = ((i_438_ & 0x1000100) + (i_437_ - i_438_ & 0x10000));
                                        is_433_[i_434_] = (~0xffffff | i_437_ - i_436_ | i_436_ - (i_436_ >>> 8));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        int[] is_439_ = is;
                                        int i_440_ = i;
                                        int i_441_ = i_366_;
                                        int i_442_ = is_439_[i_440_];
                                        int i_443_ = i_441_ + i_442_;
                                        int i_444_ = ((i_441_ & 0xff00ff) + (i_442_ & 0xff00ff));
                                        i_442_ = ((i_444_ & 0x1000100) + (i_443_ - i_444_ & 0x10000));
                                        is_439_[i_440_] = (~0xffffff | i_443_ - i_442_ | i_442_ - (i_442_ >>> 8));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                    if (f < fs[++i]) {
                                        int[] is_445_ = is;
                                        int i_446_ = i;
                                        int i_447_ = i_366_;
                                        int i_448_ = is_445_[i_446_];
                                        int i_449_ = i_447_ + i_448_;
                                        int i_450_ = ((i_447_ & 0xff00ff) + (i_448_ & 0xff00ff));
                                        i_448_ = ((i_450_ & 0x1000100) + (i_449_ - i_450_ & 0x10000));
                                        is_445_[i_446_] = (~0xffffff | i_449_ - i_448_ | i_448_ - (i_448_ >>> 8));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                } while (--i_367_ > 0);
                            }
                            i_367_ = i_369_ - i_368_ & 0x3;
                            if (i_367_ > 0) {
                                i_366_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                do {
                                    if (f < fs[++i]) {
                                        int[] is_451_ = is;
                                        int i_452_ = i;
                                        int i_453_ = i_366_;
                                        int i_454_ = is_451_[i_452_];
                                        int i_455_ = i_453_ + i_454_;
                                        int i_456_ = ((i_453_ & 0xff00ff) + (i_454_ & 0xff00ff));
                                        i_454_ = ((i_456_ & 0x1000100) + (i_455_ - i_456_ & 0x10000));
                                        is_451_[i_452_] = (~0xffffff | i_455_ - i_454_ | i_454_ - (i_454_ >>> 8));
                                        fs[i] = f;
                                    }
                                    f += f_370_;
                                } while (--i_367_ > 0);
                            }
                        }
                    } else {
                        i_367_ = i_369_ - i_368_;
                        if (((Class244) this).anInt2718 == 0) {
                            do {
                                if (f < fs[++i]) {
                                    is[i] = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                    fs[i] = f;
                                }
                                f += f_370_;
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                            } while (--i_367_ > 0);
                        } else if (!((Class244) this).aBoolean2714) {
                            int i_457_ = ((Class244) this).anInt2718;
                            int i_458_ = 256 - ((Class244) this).anInt2718;
                            do {
                                if (f < fs[++i]) {
                                    i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                    i_366_ = (((i_366_ & 0xff00ff) * i_458_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_458_ >> 8 & 0xff00));
                                    int i_459_ = is[i];
                                    is[i] = (i_366_ + ((i_459_ & 0xff00ff) * i_457_ >> 8 & 0xff00ff) + ((i_459_ & 0xff00) * i_457_ >> 8 & 0xff00));
                                    fs[i] = f;
                                }
                                f += f_370_;
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                            } while (--i_367_ > 0);
                        } else {
                            do {
                                if (f < fs[++i]) {
                                    int[] is_460_ = is;
                                    int i_461_ = i;
                                    int i_462_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                    int i_463_ = is_460_[i_461_];
                                    int i_464_ = i_462_ + i_463_;
                                    int i_465_ = ((i_462_ & 0xff00ff) + (i_463_ & 0xff00ff));
                                    i_463_ = ((i_465_ & 0x1000100) + (i_464_ - i_465_ & 0x10000));
                                    is_460_[i_461_] = (~0xffffff | i_464_ - i_463_ | i_463_ - (i_463_ >>> 8));
                                    fs[i] = f;
                                }
                                f += f_370_;
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                            } while (--i_367_ > 0);
                        }
                    }
                } else if (((Class244) this).aBoolean2711) {
                    i_367_ = i_369_ - i_368_ >> 2;
                    f_372_ *= 4.0F;
                    f_374_ *= 4.0F;
                    f_376_ *= 4.0F;
                    if (((Class244) this).anInt2718 == 0) {
                        if (i_367_ > 0) {
                            do {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                                if (f < fs[++i])
                                    is[i] = i_366_;
                                f += f_370_;
                                if (f < fs[++i])
                                    is[i] = i_366_;
                                f += f_370_;
                                if (f < fs[++i])
                                    is[i] = i_366_;
                                f += f_370_;
                                if (f < fs[++i])
                                    is[i] = i_366_;
                                f += f_370_;
                            } while (--i_367_ > 0);
                        }
                        i_367_ = i_369_ - i_368_ & 0x3;
                        if (i_367_ > 0) {
                            i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            do {
                                if (f < fs[++i])
                                    is[i] = i_366_;
                                f += f_370_;
                            } while (--i_367_ > 0);
                        }
                    } else if (!((Class244) this).aBoolean2714) {
                        int i_466_ = ((Class244) this).anInt2718;
                        int i_467_ = 256 - ((Class244) this).anInt2718;
                        if (i_367_ > 0) {
                            do {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                                i_366_ = (((i_366_ & 0xff00ff) * i_467_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_467_ >> 8 & 0xff00));
                                if (f < fs[++i]) {
                                    int i_468_ = is[i];
                                    is[i] = (i_366_ + ((i_468_ & 0xff00ff) * i_466_ >> 8 & 0xff00ff) + ((i_468_ & 0xff00) * i_466_ >> 8 & 0xff00));
                                }
                                f += f_370_;
                                if (f < fs[++i]) {
                                    int i_469_ = is[i];
                                    is[i] = (i_366_ + ((i_469_ & 0xff00ff) * i_466_ >> 8 & 0xff00ff) + ((i_469_ & 0xff00) * i_466_ >> 8 & 0xff00));
                                }
                                f += f_370_;
                                if (f < fs[++i]) {
                                    int i_470_ = is[i];
                                    is[i] = (i_366_ + ((i_470_ & 0xff00ff) * i_466_ >> 8 & 0xff00ff) + ((i_470_ & 0xff00) * i_466_ >> 8 & 0xff00));
                                }
                                f += f_370_;
                                if (f < fs[++i]) {
                                    int i_471_ = is[i];
                                    is[i] = (i_366_ + ((i_471_ & 0xff00ff) * i_466_ >> 8 & 0xff00ff) + ((i_471_ & 0xff00) * i_466_ >> 8 & 0xff00));
                                }
                                f += f_370_;
                            } while (--i_367_ > 0);
                        }
                        i_367_ = i_369_ - i_368_ & 0x3;
                        if (i_367_ > 0) {
                            i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            i_366_ = (((i_366_ & 0xff00ff) * i_467_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_467_ >> 8 & 0xff00));
                            do {
                                if (f < fs[++i]) {
                                    int i_472_ = is[i];
                                    is[i] = (i_366_ + ((i_472_ & 0xff00ff) * i_466_ >> 8 & 0xff00ff) + ((i_472_ & 0xff00) * i_466_ >> 8 & 0xff00));
                                }
                                f += f_370_;
                            } while (--i_367_ > 0);
                        }
                    } else {
                        if (i_367_ > 0) {
                            do {
                                i_366_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                f_371_ += f_372_;
                                f_373_ += f_374_;
                                f_375_ += f_376_;
                                if (f < fs[++i]) {
                                    int[] is_473_ = is;
                                    int i_474_ = i;
                                    int i_475_ = i_366_;
                                    int i_476_ = is_473_[i_474_];
                                    int i_477_ = i_475_ + i_476_;
                                    int i_478_ = ((i_475_ & 0xff00ff) + (i_476_ & 0xff00ff));
                                    i_476_ = ((i_478_ & 0x1000100) + (i_477_ - i_478_ & 0x10000));
                                    is_473_[i_474_] = (~0xffffff | i_477_ - i_476_ | i_476_ - (i_476_ >>> 8));
                                }
                                f += f_370_;
                                if (f < fs[++i]) {
                                    int[] is_479_ = is;
                                    int i_480_ = i;
                                    int i_481_ = i_366_;
                                    int i_482_ = is_479_[i_480_];
                                    int i_483_ = i_481_ + i_482_;
                                    int i_484_ = ((i_481_ & 0xff00ff) + (i_482_ & 0xff00ff));
                                    i_482_ = ((i_484_ & 0x1000100) + (i_483_ - i_484_ & 0x10000));
                                    is_479_[i_480_] = (~0xffffff | i_483_ - i_482_ | i_482_ - (i_482_ >>> 8));
                                }
                                f += f_370_;
                                if (f < fs[++i]) {
                                    int[] is_485_ = is;
                                    int i_486_ = i;
                                    int i_487_ = i_366_;
                                    int i_488_ = is_485_[i_486_];
                                    int i_489_ = i_487_ + i_488_;
                                    int i_490_ = ((i_487_ & 0xff00ff) + (i_488_ & 0xff00ff));
                                    i_488_ = ((i_490_ & 0x1000100) + (i_489_ - i_490_ & 0x10000));
                                    is_485_[i_486_] = (~0xffffff | i_489_ - i_488_ | i_488_ - (i_488_ >>> 8));
                                }
                                f += f_370_;
                                if (f < fs[++i]) {
                                    int[] is_491_ = is;
                                    int i_492_ = i;
                                    int i_493_ = i_366_;
                                    int i_494_ = is_491_[i_492_];
                                    int i_495_ = i_493_ + i_494_;
                                    int i_496_ = ((i_493_ & 0xff00ff) + (i_494_ & 0xff00ff));
                                    i_494_ = ((i_496_ & 0x1000100) + (i_495_ - i_496_ & 0x10000));
                                    is_491_[i_492_] = (~0xffffff | i_495_ - i_494_ | i_494_ - (i_494_ >>> 8));
                                }
                                f += f_370_;
                            } while (--i_367_ > 0);
                        }
                        i_367_ = i_369_ - i_368_ & 0x3;
                        if (i_367_ > 0) {
                            i_366_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            do {
                                if (f < fs[++i]) {
                                    int[] is_497_ = is;
                                    int i_498_ = i;
                                    int i_499_ = i_366_;
                                    int i_500_ = is_497_[i_498_];
                                    int i_501_ = i_499_ + i_500_;
                                    int i_502_ = ((i_499_ & 0xff00ff) + (i_500_ & 0xff00ff));
                                    i_500_ = ((i_502_ & 0x1000100) + (i_501_ - i_502_ & 0x10000));
                                    is_497_[i_498_] = (~0xffffff | i_501_ - i_500_ | i_500_ - (i_500_ >>> 8));
                                }
                                f += f_370_;
                            } while (--i_367_ > 0);
                        }
                    }
                } else {
                    i_367_ = i_369_ - i_368_;
                    if (((Class244) this).anInt2718 == 0) {
                        do {
                            if (f < fs[++i])
                                is[i] = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                            f += f_370_;
                            f_371_ += f_372_;
                            f_373_ += f_374_;
                            f_375_ += f_376_;
                        } while (--i_367_ > 0);
                    } else if (!((Class244) this).aBoolean2714) {
                        int i_503_ = ((Class244) this).anInt2718;
                        int i_504_ = 256 - ((Class244) this).anInt2718;
                        do {
                            if (f < fs[++i]) {
                                i_366_ = ~0xffffff | ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                i_366_ = (((i_366_ & 0xff00ff) * i_504_ >> 8 & 0xff00ff) + ((i_366_ & 0xff00) * i_504_ >> 8 & 0xff00));
                                int i_505_ = is[i];
                                is[i] = (i_366_ + ((i_505_ & 0xff00ff) * i_503_ >> 8 & 0xff00ff) + ((i_505_ & 0xff00) * i_503_ >> 8 & 0xff00));
                            }
                            f += f_370_;
                            f_371_ += f_372_;
                            f_373_ += f_374_;
                            f_375_ += f_376_;
                        } while (--i_367_ > 0);
                    } else {
                        do {
                            if (f < fs[++i]) {
                                int[] is_506_ = is;
                                int i_507_ = i;
                                int i_508_ = ((int) f_371_ & 0xff0000 | (int) f_373_ & 0xff00 | (int) f_375_ & 0xff);
                                int i_509_ = is_506_[i_507_];
                                int i_510_ = i_508_ + i_509_;
                                int i_511_ = ((i_508_ & 0xff00ff) + (i_509_ & 0xff00ff));
                                i_509_ = (i_511_ & 0x1000100) + (i_510_ - i_511_ & 0x10000);
                                is_506_[i_507_] = (~0xffffff | i_510_ - i_509_ | i_509_ - (i_509_ >>> 8));
                            }
                            f += f_370_;
                            f_371_ += f_372_;
                            f_373_ += f_374_;
                            f_375_ += f_376_;
                        } while (--i_367_ > 0);
                    }
                }
            }
        }
    }

    Class244(ha_Sub1 var_ha_Sub1, Class203 class203) {
        ((Class244) this).anInt2718 = 0;
        aBoolean2725 = false;
        aBoolean2724 = false;
        aFloat2732 = 0.0F;
        anIntArray2737 = null;
        anInt2736 = 0;
        anInt2730 = -1;
        anInt2727 = 0;
        anIntArray2740 = null;
        aFloat2739 = 0.0F;
        anIntArray2735 = null;
        aBoolean2728 = true;
        aFloat2734 = 0.0F;
        anInt2733 = 0;
        anInt2738 = 0;
        anInt2729 = 0;
        anInt2742 = 0;
        anInt2743 = -1;
        anInt2731 = 0;
        anInt2744 = -1;
        aHa_Sub1_2722 = var_ha_Sub1;
        aClass203_2719 = class203;
        anInt2716 = ((ha_Sub1) aHa_Sub1_2722).anInt5567;
        anIntArray2721 = ((ha_Sub1) aHa_Sub1_2722).anIntArray5565;
        aFloatArray2726 = ((ha_Sub1) aHa_Sub1_2722).aFloatArray5556;
    }
}
