/* Class248_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub15_Sub2 extends Node_Sub15 {
    private int anInt9675;
    private int anInt9676;
    private int anInt9677;
    private int anInt9678;
    private int anInt9679;
    private boolean aBoolean9680;
    private int anInt9681;
    private int anInt9682;
    private int anInt9683;
    private int anInt9684;
    private int anInt9685;
    private int anInt9686;
    private int anInt9687;
    private int anInt9688;
    private int anInt9689;

    private static final int method2443(int i, byte[] is, int[] is_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i_1_ >>= 8;
        i_7_ >>= 8;
        i_3_ <<= 2;
        i_4_ <<= 2;
        if ((i_5_ = i_2_ + i_7_ - i_1_) > i_6_)
            i_5_ = i_6_;
        i_2_ <<= 1;
        i_5_ <<= 1;
        i_5_ -= 6;
        while (i_2_ < i_5_) {
            i = is[i_1_++];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
            i = is[i_1_++];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
            i = is[i_1_++];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
            i = is[i_1_++];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
        }
        i_5_ += 6;
        while (i_2_ < i_5_) {
            i = is[i_1_++];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
        }
        class248_sub15_sub2.anInt9675 = i_1_ << 8;
        return i_2_ >> 1;
    }

    private static final int method2444(int i, byte[] is, int[] is_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i_9_ >>= 8;
        i_17_ >>= 8;
        i_11_ <<= 2;
        i_12_ <<= 2;
        i_13_ <<= 2;
        i_14_ <<= 2;
        if ((i_15_ = i_10_ + i_17_ - i_9_) > i_16_)
            i_15_ = i_16_;
        class248_sub15_sub2.anInt9688 += class248_sub15_sub2.anInt9681 * (i_15_ - i_10_);
        i_10_ <<= 1;
        i_15_ <<= 1;
        i_15_ -= 6;
        while (i_10_ < i_15_) {
            i = is[i_9_++];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
            i = is[i_9_++];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
            i = is[i_9_++];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
            i = is[i_9_++];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
        }
        i_15_ += 6;
        while (i_10_ < i_15_) {
            i = is[i_9_++];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
        }
        class248_sub15_sub2.anInt9687 = i_11_ >> 2;
        class248_sub15_sub2.anInt9682 = i_12_ >> 2;
        class248_sub15_sub2.anInt9675 = i_9_ << 8;
        return i_10_ >> 1;
    }

    final synchronized void method2445(int i) {
        method2455(method2475(), i);
    }

    final synchronized void method2446(int i) {
        method2455(i << 6, method2456());
    }

    final Node_Sub15 method2401() {
        return null;
    }

    private static final int method2447(byte[] is, int[] is_18_, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i >>= 8;
        i_24_ >>= 8;
        i_20_ <<= 2;
        i_21_ <<= 2;
        if ((i_22_ = i_19_ + i_24_ - i) > i_23_)
            i_22_ = i_23_;
        class248_sub15_sub2.anInt9687 += class248_sub15_sub2.anInt9678 * (i_22_ - i_19_);
        class248_sub15_sub2.anInt9682 += class248_sub15_sub2.anInt9686 * (i_22_ - i_19_);
        i_22_ -= 3;
        while (i_19_ < i_22_) {
            is_18_[i_19_++] += is[i++] * i_20_;
            i_20_ += i_21_;
            is_18_[i_19_++] += is[i++] * i_20_;
            i_20_ += i_21_;
            is_18_[i_19_++] += is[i++] * i_20_;
            i_20_ += i_21_;
            is_18_[i_19_++] += is[i++] * i_20_;
            i_20_ += i_21_;
        }
        i_22_ += 3;
        while (i_19_ < i_22_) {
            is_18_[i_19_++] += is[i++] * i_20_;
            i_20_ += i_21_;
        }
        class248_sub15_sub2.anInt9688 = i_20_ >> 2;
        class248_sub15_sub2.anInt9675 = i << 8;
        return i_19_;
    }

    private static final int method2448(int i, int i_25_, byte[] is, int[] is_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, Node_Sub15_Sub2 class248_sub15_sub2, int i_34_, int i_35_) {
        if (i_34_ == 0 || (i_31_ = i_28_ + (i_33_ - i_27_ + i_34_ - 257) / i_34_) > i_32_)
            i_31_ = i_32_;
        i_28_ <<= 1;
        i_31_ <<= 1;
        while (i_28_ < i_31_) {
            i_25_ = i_27_ >> 8;
            i = is[i_25_];
            i = (i << 8) + (is[i_25_ + 1] - i) * (i_27_ & 0xff);
            is_26_[i_28_++] += i * i_29_ >> 6;
            is_26_[i_28_++] += i * i_30_ >> 6;
            i_27_ += i_34_;
        }
        if (i_34_ == 0 || ((i_31_ = (i_28_ >> 1) + (i_33_ - i_27_ + i_34_ - 1) / i_34_) > i_32_))
            i_31_ = i_32_;
        i_31_ <<= 1;
        i_25_ = i_35_;
        while (i_28_ < i_31_) {
            i = is[i_27_ >> 8];
            i = (i << 8) + (i_25_ - i) * (i_27_ & 0xff);
            is_26_[i_28_++] += i * i_29_ >> 6;
            is_26_[i_28_++] += i * i_30_ >> 6;
            i_27_ += i_34_;
        }
        class248_sub15_sub2.anInt9675 = i_27_;
        return i_28_ >> 1;
    }

    private static final int method2449(int i, int i_36_, byte[] is, int[] is_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, Node_Sub15_Sub2 class248_sub15_sub2, int i_45_, int i_46_) {
        class248_sub15_sub2.anInt9687 -= class248_sub15_sub2.anInt9678 * i_39_;
        class248_sub15_sub2.anInt9682 -= class248_sub15_sub2.anInt9686 * i_39_;
        if (i_45_ == 0 || (i_42_ = i_39_ + (i_44_ + 256 - i_38_ + i_45_) / i_45_) > i_43_)
            i_42_ = i_43_;
        while (i_39_ < i_42_) {
            i_36_ = i_38_ >> 8;
            i = is[i_36_ - 1];
            is_37_[i_39_++] += ((i << 8) + (is[i_36_] - i) * (i_38_ & 0xff)) * i_40_ >> 6;
            i_40_ += i_41_;
            i_38_ += i_45_;
        }
        if (i_45_ == 0 || (i_42_ = i_39_ + (i_44_ - i_38_ + i_45_) / i_45_) > i_43_)
            i_42_ = i_43_;
        i = i_46_;
        i_36_ = i_45_;
        while (i_39_ < i_42_) {
            is_37_[i_39_++] += (((i << 8) + (is[i_38_ >> 8] - i) * (i_38_ & 0xff)) * i_40_ >> 6);
            i_40_ += i_41_;
            i_38_ += i_36_;
        }
        class248_sub15_sub2.anInt9687 += class248_sub15_sub2.anInt9678 * i_39_;
        class248_sub15_sub2.anInt9682 += class248_sub15_sub2.anInt9686 * i_39_;
        class248_sub15_sub2.anInt9688 = i_40_;
        class248_sub15_sub2.anInt9675 = i_38_;
        return i_39_;
    }

    final synchronized void method2450(int i, int i_47_) {
        method2461(i, i_47_, method2456());
    }

    private final int method2451(int[] is, int i, int i_48_, int i_49_, int i_50_) {
        while (anInt9685 > 0) {
            int i_51_ = i + anInt9685;
            if (i_51_ > i_49_)
                i_51_ = i_49_;
            anInt9685 += i;
            if (anInt9677 == 256 && (anInt9675 & 0xff) == 0) {
                if (Class225_Sub3.aBoolean8472)
                    i = method2444(0, ((Node_Sub31_Sub1) (Node_Sub31_Sub1) (((Node_Sub15) this).aClass248_Sub31_6996)).aByteArray9734, is, anInt9675, i, anInt9687, anInt9682, anInt9678, anInt9686, 0, i_51_, i_48_, this);
                else
                    i = method2447(((Node_Sub31_Sub1) (Node_Sub31_Sub1) (((Node_Sub15) this).aClass248_Sub31_6996)).aByteArray9734, is, anInt9675, i, anInt9688, anInt9681, 0, i_51_, i_48_, this);
            } else if (Class225_Sub3.aBoolean8472)
                i = method2474(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9687, anInt9682, anInt9678, anInt9686, 0, i_51_, i_48_, this, anInt9677, i_50_);
            else
                i = method2457(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9688, anInt9681, 0, i_51_, i_48_, this, anInt9677, i_50_);
            anInt9685 -= i;
            if (anInt9685 != 0)
                return i;
            if (method2478())
                return i_49_;
        }
        if (anInt9677 == 256 && (anInt9675 & 0xff) == 0) {
            if (Class225_Sub3.aBoolean8472)
                return method2443(0, ((Node_Sub31_Sub1) (Node_Sub31_Sub1) (((Node_Sub15) this).aClass248_Sub31_6996)).aByteArray9734, is, anInt9675, i, anInt9687, anInt9682, 0, i_49_, i_48_, this);
            return method2473((((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9688, 0, i_49_, i_48_, this);
        }
        if (Class225_Sub3.aBoolean8472)
            return method2448(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9687, anInt9682, 0, i_49_, i_48_, this, anInt9677, i_50_);
        return method2466(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9688, 0, i_49_, i_48_, this, anInt9677, i_50_);
    }

    static final Node_Sub15_Sub2 method2452(Node_Sub31_Sub1 class248_sub31_sub1, int i, int i_52_, int i_53_) {
        if (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734 == null || (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734).length == 0)
            return null;
        return new Node_Sub15_Sub2(class248_sub31_sub1, i, i_52_, i_53_);
    }

    final synchronized void method2453(int i) {
        int i_54_ = ((((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734).length << 8);
        if (i < -1)
            i = -1;
        if (i > i_54_)
            i = i_54_;
        anInt9675 = i;
    }

    final synchronized void method2454(int i) {
        if (anInt9677 < 0)
            anInt9677 = -i;
        else
            anInt9677 = i;
    }

    final Node_Sub15 method2399() {
        return null;
    }

    private final synchronized void method2455(int i, int i_55_) {
        anInt9684 = i;
        anInt9676 = i_55_;
        anInt9685 = 0;
        method2468();
    }

    final synchronized int method2456() {
        if (anInt9676 < 0)
            return -1;
        return anInt9676;
    }

    private static final int method2457(int i, int i_56_, byte[] is, int[] is_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, Node_Sub15_Sub2 class248_sub15_sub2, int i_65_, int i_66_) {
        class248_sub15_sub2.anInt9687 -= class248_sub15_sub2.anInt9678 * i_59_;
        class248_sub15_sub2.anInt9682 -= class248_sub15_sub2.anInt9686 * i_59_;
        if (i_65_ == 0 || (i_62_ = i_59_ + (i_64_ - i_58_ + i_65_ - 257) / i_65_) > i_63_)
            i_62_ = i_63_;
        while (i_59_ < i_62_) {
            i_56_ = i_58_ >> 8;
            i = is[i_56_];
            is_57_[i_59_++] += (((i << 8) + (is[i_56_ + 1] - i) * (i_58_ & 0xff)) * i_60_ >> 6);
            i_60_ += i_61_;
            i_58_ += i_65_;
        }
        if (i_65_ == 0 || (i_62_ = i_59_ + (i_64_ - i_58_ + i_65_ - 1) / i_65_) > i_63_)
            i_62_ = i_63_;
        i_56_ = i_66_;
        while (i_59_ < i_62_) {
            i = is[i_58_ >> 8];
            is_57_[i_59_++] += ((i << 8) + (i_56_ - i) * (i_58_ & 0xff)) * i_60_ >> 6;
            i_60_ += i_61_;
            i_58_ += i_65_;
        }
        class248_sub15_sub2.anInt9687 += class248_sub15_sub2.anInt9678 * i_59_;
        class248_sub15_sub2.anInt9682 += class248_sub15_sub2.anInt9686 * i_59_;
        class248_sub15_sub2.anInt9688 = i_60_;
        class248_sub15_sub2.anInt9675 = i_58_;
        return i_59_;
    }

    private static final int method2458(int i, byte[] is, int[] is_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i_68_ >>= 8;
        i_76_ >>= 8;
        i_70_ <<= 2;
        i_71_ <<= 2;
        i_72_ <<= 2;
        i_73_ <<= 2;
        if ((i_74_ = i_69_ + i_68_ - (i_76_ - 1)) > i_75_)
            i_74_ = i_75_;
        class248_sub15_sub2.anInt9688 += class248_sub15_sub2.anInt9681 * (i_74_ - i_69_);
        i_69_ <<= 1;
        i_74_ <<= 1;
        i_74_ -= 6;
        while (i_69_ < i_74_) {
            i = is[i_68_--];
            is_67_[i_69_++] += i * i_70_;
            i_70_ += i_72_;
            is_67_[i_69_++] += i * i_71_;
            i_71_ += i_73_;
            i = is[i_68_--];
            is_67_[i_69_++] += i * i_70_;
            i_70_ += i_72_;
            is_67_[i_69_++] += i * i_71_;
            i_71_ += i_73_;
            i = is[i_68_--];
            is_67_[i_69_++] += i * i_70_;
            i_70_ += i_72_;
            is_67_[i_69_++] += i * i_71_;
            i_71_ += i_73_;
            i = is[i_68_--];
            is_67_[i_69_++] += i * i_70_;
            i_70_ += i_72_;
            is_67_[i_69_++] += i * i_71_;
            i_71_ += i_73_;
        }
        i_74_ += 6;
        while (i_69_ < i_74_) {
            i = is[i_68_--];
            is_67_[i_69_++] += i * i_70_;
            i_70_ += i_72_;
            is_67_[i_69_++] += i * i_71_;
            i_71_ += i_73_;
        }
        class248_sub15_sub2.anInt9687 = i_70_ >> 2;
        class248_sub15_sub2.anInt9682 = i_71_ >> 2;
        class248_sub15_sub2.anInt9675 = i_68_ << 8;
        return i_69_ >> 1;
    }

    private static final int method2459(int i, byte[] is, int[] is_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i_78_ >>= 8;
        i_84_ >>= 8;
        i_80_ <<= 2;
        i_81_ <<= 2;
        if ((i_82_ = i_79_ + i_78_ - (i_84_ - 1)) > i_83_)
            i_82_ = i_83_;
        i_79_ <<= 1;
        i_82_ <<= 1;
        i_82_ -= 6;
        while (i_79_ < i_82_) {
            i = is[i_78_--];
            is_77_[i_79_++] += i * i_80_;
            is_77_[i_79_++] += i * i_81_;
            i = is[i_78_--];
            is_77_[i_79_++] += i * i_80_;
            is_77_[i_79_++] += i * i_81_;
            i = is[i_78_--];
            is_77_[i_79_++] += i * i_80_;
            is_77_[i_79_++] += i * i_81_;
            i = is[i_78_--];
            is_77_[i_79_++] += i * i_80_;
            is_77_[i_79_++] += i * i_81_;
        }
        i_82_ += 6;
        while (i_79_ < i_82_) {
            i = is[i_78_--];
            is_77_[i_79_++] += i * i_80_;
            is_77_[i_79_++] += i * i_81_;
        }
        class248_sub15_sub2.anInt9675 = i_78_ << 8;
        return i_79_ >> 1;
    }

    private static final int method2460(byte[] is, int[] is_85_, int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i >>= 8;
        i_90_ >>= 8;
        i_87_ <<= 2;
        if ((i_88_ = i_86_ + i - (i_90_ - 1)) > i_89_)
            i_88_ = i_89_;
        i_88_ -= 3;
        while (i_86_ < i_88_) {
            is_85_[i_86_++] += is[i--] * i_87_;
            is_85_[i_86_++] += is[i--] * i_87_;
            is_85_[i_86_++] += is[i--] * i_87_;
            is_85_[i_86_++] += is[i--] * i_87_;
        }
        i_88_ += 3;
        while (i_86_ < i_88_)
            is_85_[i_86_++] += is[i--] * i_87_;
        class248_sub15_sub2.anInt9675 = i << 8;
        return i_86_;
    }

    final synchronized void method2461(int i, int i_91_, int i_92_) {
        if (i == 0)
            method2455(i_91_, i_92_);
        else {
            int i_93_ = method2476(i_91_, i_92_);
            int i_94_ = method2482(i_91_, i_92_);
            if (anInt9687 == i_93_ && anInt9682 == i_94_)
                anInt9685 = 0;
            else {
                int i_95_ = i_91_ - anInt9688;
                if (anInt9688 - i_91_ > i_95_)
                    i_95_ = anInt9688 - i_91_;
                if (i_93_ - anInt9687 > i_95_)
                    i_95_ = i_93_ - anInt9687;
                if (anInt9687 - i_93_ > i_95_)
                    i_95_ = anInt9687 - i_93_;
                if (i_94_ - anInt9682 > i_95_)
                    i_95_ = i_94_ - anInt9682;
                if (anInt9682 - i_94_ > i_95_)
                    i_95_ = anInt9682 - i_94_;
                if (i > i_95_)
                    i = i_95_;
                anInt9685 = i;
                anInt9684 = i_91_;
                anInt9676 = i_92_;
                anInt9681 = (i_91_ - anInt9688) / i;
                anInt9678 = (i_93_ - anInt9687) / i;
                anInt9686 = (i_94_ - anInt9682) / i;
            }
        }
    }

    final int method2402() {
        int i = anInt9688 * 3 >> 6;
        i = (i ^ i >> 31) + (i >>> 31);
        if (anInt9679 == 0)
            i -= (i * anInt9675 / ((((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734).length << 8));
        else if (anInt9679 >= 0)
            i -= (i * anInt9683 / (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734).length);
        if (i > 255)
            return 255;
        return i;
    }

    final synchronized void method2404(int i) {
        if (anInt9685 > 0) {
            if (i >= anInt9685) {
                if (anInt9684 == -2147483648) {
                    anInt9684 = 0;
                    anInt9688 = anInt9687 = anInt9682 = 0;
                    this.remove(true);
                    i = anInt9685;
                }
                anInt9685 = 0;
                method2468();
            } else {
                anInt9688 += anInt9681 * i;
                anInt9687 += anInt9678 * i;
                anInt9682 += anInt9686 * i;
                anInt9685 -= i;
            }
        }
        Node_Sub31_Sub1 class248_sub31_sub1 = ((Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996);
        int i_96_ = anInt9683 << 8;
        int i_97_ = anInt9689 << 8;
        int i_98_ = ((((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734).length << 8);
        int i_99_ = i_97_ - i_96_;
        if (i_99_ <= 0)
            anInt9679 = 0;
        if (anInt9675 < 0) {
            if (anInt9677 > 0)
                anInt9675 = 0;
            else {
                method2469();
                this.remove(true);
                return;
            }
        }
        if (anInt9675 >= i_98_) {
            if (anInt9677 < 0)
                anInt9675 = i_98_ - 1;
            else {
                method2469();
                this.remove(true);
                return;
            }
        }
        anInt9675 += anInt9677 * i;
        if (anInt9679 < 0) {
            if (aBoolean9680) {
                if (anInt9677 < 0) {
                    if (anInt9675 >= i_96_)
                        return;
                    anInt9675 = i_96_ + i_96_ - 1 - anInt9675;
                    anInt9677 = -anInt9677;
                }
                while (anInt9675 >= i_97_) {
                    anInt9675 = i_97_ + i_97_ - 1 - anInt9675;
                    anInt9677 = -anInt9677;
                    if (anInt9675 >= i_96_)
                        break;
                    anInt9675 = i_96_ + i_96_ - 1 - anInt9675;
                    anInt9677 = -anInt9677;
                }
            } else if (anInt9677 < 0) {
                if (anInt9675 < i_96_)
                    anInt9675 = i_97_ - 1 - (i_97_ - 1 - anInt9675) % i_99_;
            } else if (anInt9675 >= i_97_)
                anInt9675 = i_96_ + (anInt9675 - i_96_) % i_99_;
        } else {
            do {
                if (anInt9679 > 0) {
                    if (aBoolean9680) {
                        if (anInt9677 < 0) {
                            if (anInt9675 >= i_96_)
                                return;
                            anInt9675 = i_96_ + i_96_ - 1 - anInt9675;
                            anInt9677 = -anInt9677;
                            if (--anInt9679 == 0)
                                break;
                        }
                        do {
                            if (anInt9675 < i_97_)
                                return;
                            anInt9675 = i_97_ + i_97_ - 1 - anInt9675;
                            anInt9677 = -anInt9677;
                            if (--anInt9679 == 0)
                                break;
                            if (anInt9675 >= i_96_)
                                return;
                            anInt9675 = i_96_ + i_96_ - 1 - anInt9675;
                            anInt9677 = -anInt9677;
                        } while (--anInt9679 != 0);
                    } else if (anInt9677 < 0) {
                        if (anInt9675 >= i_96_)
                            return;
                        int i_100_ = (i_97_ - 1 - anInt9675) / i_99_;
                        if (i_100_ >= anInt9679) {
                            anInt9675 += i_99_ * anInt9679;
                            anInt9679 = 0;
                        } else {
                            anInt9675 += i_99_ * i_100_;
                            anInt9679 -= i_100_;
                            return;
                        }
                    } else {
                        if (anInt9675 < i_97_)
                            return;
                        int i_101_ = (anInt9675 - i_96_) / i_99_;
                        if (i_101_ >= anInt9679) {
                            anInt9675 -= i_99_ * anInt9679;
                            anInt9679 = 0;
                        } else {
                            anInt9675 -= i_99_ * i_101_;
                            anInt9679 -= i_101_;
                            return;
                        }
                    }
                }
            } while (false);
            if (anInt9677 < 0) {
                if (anInt9675 < 0) {
                    anInt9675 = -1;
                    method2469();
                    this.remove(true);
                }
            } else if (anInt9675 >= i_98_) {
                anInt9675 = i_98_;
                method2469();
                this.remove(true);
            }
        }
    }

    private static final int method2462(int i, int i_102_, byte[] is, int[] is_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, Node_Sub15_Sub2 class248_sub15_sub2, int i_113_, int i_114_) {
        class248_sub15_sub2.anInt9688 -= class248_sub15_sub2.anInt9681 * i_105_;
        if (i_113_ == 0 || ((i_110_ = i_105_ + (i_112_ + 256 - i_104_ + i_113_) / i_113_) > i_111_))
            i_110_ = i_111_;
        i_105_ <<= 1;
        i_110_ <<= 1;
        while (i_105_ < i_110_) {
            i_102_ = i_104_ >> 8;
            i = is[i_102_ - 1];
            i = (i << 8) + (is[i_102_] - i) * (i_104_ & 0xff);
            is_103_[i_105_++] += i * i_106_ >> 6;
            i_106_ += i_108_;
            is_103_[i_105_++] += i * i_107_ >> 6;
            i_107_ += i_109_;
            i_104_ += i_113_;
        }
        if (i_113_ == 0 || ((i_110_ = (i_105_ >> 1) + (i_112_ - i_104_ + i_113_) / i_113_) > i_111_))
            i_110_ = i_111_;
        i_110_ <<= 1;
        i_102_ = i_114_;
        while (i_105_ < i_110_) {
            i = (i_102_ << 8) + (is[i_104_ >> 8] - i_102_) * (i_104_ & 0xff);
            is_103_[i_105_++] += i * i_106_ >> 6;
            i_106_ += i_108_;
            is_103_[i_105_++] += i * i_107_ >> 6;
            i_107_ += i_109_;
            i_104_ += i_113_;
        }
        i_105_ >>= 1;
        class248_sub15_sub2.anInt9688 += class248_sub15_sub2.anInt9681 * i_105_;
        class248_sub15_sub2.anInt9687 = i_106_;
        class248_sub15_sub2.anInt9682 = i_107_;
        class248_sub15_sub2.anInt9675 = i_104_;
        return i_105_;
    }

    final synchronized void method2463(int i) {
        anInt9679 = i;
    }

    final boolean method2464() {
        if (anInt9685 == 0)
            return false;
        return true;
    }

    final synchronized void method2465(boolean bool) {
        anInt9677 = (anInt9677 ^ anInt9677 >> 31) + (anInt9677 >>> 31);
        if (bool)
            anInt9677 = -anInt9677;
    }

    private static final int method2466(int i, int i_115_, byte[] is, int[] is_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, Node_Sub15_Sub2 class248_sub15_sub2, int i_123_, int i_124_) {
        if (i_123_ == 0 || ((i_120_ = i_118_ + (i_122_ - i_117_ + i_123_ - 257) / i_123_) > i_121_))
            i_120_ = i_121_;
        while (i_118_ < i_120_) {
            i_115_ = i_117_ >> 8;
            i = is[i_115_];
            is_116_[i_118_++] += (((i << 8) + (is[i_115_ + 1] - i) * (i_117_ & 0xff)) * i_119_) >> 6;
            i_117_ += i_123_;
        }
        if (i_123_ == 0 || ((i_120_ = i_118_ + (i_122_ - i_117_ + i_123_ - 1) / i_123_) > i_121_))
            i_120_ = i_121_;
        i_115_ = i_124_;
        while (i_118_ < i_120_) {
            i = is[i_117_ >> 8];
            is_116_[i_118_++] += ((i << 8) + (i_115_ - i) * (i_117_ & 0xff)) * i_119_ >> 6;
            i_117_ += i_123_;
        }
        class248_sub15_sub2.anInt9675 = i_117_;
        return i_118_;
    }

    final boolean method2467() {
        if (anInt9675 >= 0 && anInt9675 < (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734).length << 8)
            return false;
        return true;
    }

    private final void method2468() {
        anInt9688 = anInt9684;
        anInt9687 = method2476(anInt9684, anInt9676);
        anInt9682 = method2482(anInt9684, anInt9676);
    }

    private final void method2469() {
        if (anInt9685 != 0) {
            if (anInt9684 == -2147483648)
                anInt9684 = 0;
            anInt9685 = 0;
            method2468();
        }
    }

    final synchronized int method2470() {
        if (anInt9677 < 0)
            return -anInt9677;
        return anInt9677;
    }

    private final int method2471(int[] is, int i, int i_125_, int i_126_, int i_127_) {
        while (anInt9685 > 0) {
            int i_128_ = i + anInt9685;
            if (i_128_ > i_126_)
                i_128_ = i_126_;
            anInt9685 += i;
            if (anInt9677 == -256 && (anInt9675 & 0xff) == 0) {
                if (Class225_Sub3.aBoolean8472)
                    i = method2458(0, ((Node_Sub31_Sub1) (Node_Sub31_Sub1) (((Node_Sub15) this).aClass248_Sub31_6996)).aByteArray9734, is, anInt9675, i, anInt9687, anInt9682, anInt9678, anInt9686, 0, i_128_, i_125_, this);
                else
                    i = method2481(((Node_Sub31_Sub1) (Node_Sub31_Sub1) (((Node_Sub15) this).aClass248_Sub31_6996)).aByteArray9734, is, anInt9675, i, anInt9688, anInt9681, 0, i_128_, i_125_, this);
            } else if (Class225_Sub3.aBoolean8472)
                i = method2462(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9687, anInt9682, anInt9678, anInt9686, 0, i_128_, i_125_, this, anInt9677, i_127_);
            else
                i = method2449(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9688, anInt9681, 0, i_128_, i_125_, this, anInt9677, i_127_);
            anInt9685 -= i;
            if (anInt9685 != 0)
                return i;
            if (method2478())
                return i_126_;
        }
        if (anInt9677 == -256 && (anInt9675 & 0xff) == 0) {
            if (Class225_Sub3.aBoolean8472)
                return method2459(0, ((Node_Sub31_Sub1) (Node_Sub31_Sub1) (((Node_Sub15) this).aClass248_Sub31_6996)).aByteArray9734, is, anInt9675, i, anInt9687, anInt9682, 0, i_126_, i_125_, this);
            return method2460((((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9688, 0, i_126_, i_125_, this);
        }
        if (Class225_Sub3.aBoolean8472)
            return method2477(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9687, anInt9682, 0, i_126_, i_125_, this, anInt9677, i_127_);
        return method2472(0, 0, (((Node_Sub31_Sub1) (Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996).aByteArray9734), is, anInt9675, i, anInt9688, 0, i_126_, i_125_, this, anInt9677, i_127_);
    }

    private static final int method2472(int i, int i_129_, byte[] is, int[] is_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, Node_Sub15_Sub2 class248_sub15_sub2, int i_137_, int i_138_) {
        if (i_137_ == 0 || ((i_134_ = i_132_ + (i_136_ + 256 - i_131_ + i_137_) / i_137_) > i_135_))
            i_134_ = i_135_;
        while (i_132_ < i_134_) {
            i_129_ = i_131_ >> 8;
            i = is[i_129_ - 1];
            is_130_[i_132_++] += (((i << 8) + (is[i_129_] - i) * (i_131_ & 0xff)) * i_133_ >> 6);
            i_131_ += i_137_;
        }
        if (i_137_ == 0 || ((i_134_ = i_132_ + (i_136_ - i_131_ + i_137_) / i_137_) > i_135_))
            i_134_ = i_135_;
        i = i_138_;
        i_129_ = i_137_;
        while (i_132_ < i_134_) {
            is_130_[i_132_++] += (((i << 8) + (is[i_131_ >> 8] - i) * (i_131_ & 0xff)) * i_133_) >> 6;
            i_131_ += i_129_;
        }
        class248_sub15_sub2.anInt9675 = i_131_;
        return i_132_;
    }

    private static final int method2473(byte[] is, int[] is_139_, int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i >>= 8;
        i_144_ >>= 8;
        i_141_ <<= 2;
        if ((i_142_ = i_140_ + i_144_ - i) > i_143_)
            i_142_ = i_143_;
        i_142_ -= 3;
        while (i_140_ < i_142_) {
            is_139_[i_140_++] += is[i++] * i_141_;
            is_139_[i_140_++] += is[i++] * i_141_;
            is_139_[i_140_++] += is[i++] * i_141_;
            is_139_[i_140_++] += is[i++] * i_141_;
        }
        i_142_ += 3;
        while (i_140_ < i_142_)
            is_139_[i_140_++] += is[i++] * i_141_;
        class248_sub15_sub2.anInt9675 = i << 8;
        return i_140_;
    }

    private static final int method2474(int i, int i_145_, byte[] is, int[] is_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, Node_Sub15_Sub2 class248_sub15_sub2, int i_156_, int i_157_) {
        class248_sub15_sub2.anInt9688 -= class248_sub15_sub2.anInt9681 * i_148_;
        if (i_156_ == 0 || ((i_153_ = i_148_ + (i_155_ - i_147_ + i_156_ - 257) / i_156_) > i_154_))
            i_153_ = i_154_;
        i_148_ <<= 1;
        i_153_ <<= 1;
        while (i_148_ < i_153_) {
            i_145_ = i_147_ >> 8;
            i = is[i_145_];
            i = (i << 8) + (is[i_145_ + 1] - i) * (i_147_ & 0xff);
            is_146_[i_148_++] += i * i_149_ >> 6;
            i_149_ += i_151_;
            is_146_[i_148_++] += i * i_150_ >> 6;
            i_150_ += i_152_;
            i_147_ += i_156_;
        }
        if (i_156_ == 0 || (i_153_ = (i_148_ >> 1) + (i_155_ - i_147_ + i_156_ - 1) / i_156_) > i_154_)
            i_153_ = i_154_;
        i_153_ <<= 1;
        i_145_ = i_157_;
        while (i_148_ < i_153_) {
            i = is[i_147_ >> 8];
            i = (i << 8) + (i_145_ - i) * (i_147_ & 0xff);
            is_146_[i_148_++] += i * i_149_ >> 6;
            i_149_ += i_151_;
            is_146_[i_148_++] += i * i_150_ >> 6;
            i_150_ += i_152_;
            i_147_ += i_156_;
        }
        i_148_ >>= 1;
        class248_sub15_sub2.anInt9688 += class248_sub15_sub2.anInt9681 * i_148_;
        class248_sub15_sub2.anInt9687 = i_149_;
        class248_sub15_sub2.anInt9682 = i_150_;
        class248_sub15_sub2.anInt9675 = i_147_;
        return i_148_;
    }

    final synchronized int method2475() {
        if (anInt9684 == -2147483648)
            return 0;
        return anInt9684;
    }

    private static final int method2476(int i, int i_158_) {
        if (i_158_ < 0)
            return i;
        return (int) (((double) i * Math.sqrt((double) (16384 - i_158_) * 1.220703125E-4)) + 0.5);
    }

    private static final int method2477(int i, int i_159_, byte[] is, int[] is_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, Node_Sub15_Sub2 class248_sub15_sub2, int i_168_, int i_169_) {
        if (i_168_ == 0 || ((i_165_ = i_162_ + (i_167_ + 256 - i_161_ + i_168_) / i_168_) > i_166_))
            i_165_ = i_166_;
        i_162_ <<= 1;
        i_165_ <<= 1;
        while (i_162_ < i_165_) {
            i_159_ = i_161_ >> 8;
            i = is[i_159_ - 1];
            i = (i << 8) + (is[i_159_] - i) * (i_161_ & 0xff);
            is_160_[i_162_++] += i * i_163_ >> 6;
            is_160_[i_162_++] += i * i_164_ >> 6;
            i_161_ += i_168_;
        }
        if (i_168_ == 0 || ((i_165_ = (i_162_ >> 1) + (i_167_ - i_161_ + i_168_) / i_168_) > i_166_))
            i_165_ = i_166_;
        i_165_ <<= 1;
        i_159_ = i_169_;
        while (i_162_ < i_165_) {
            i = (i_159_ << 8) + (is[i_161_ >> 8] - i_159_) * (i_161_ & 0xff);
            is_160_[i_162_++] += i * i_163_ >> 6;
            is_160_[i_162_++] += i * i_164_ >> 6;
            i_161_ += i_168_;
        }
        class248_sub15_sub2.anInt9675 = i_161_;
        return i_162_ >> 1;
    }

    final int method2405() {
        if (anInt9684 == 0 && anInt9685 == 0)
            return 0;
        return 1;
    }

    private final boolean method2478() {
        int i = anInt9684;
        int i_170_;
        int i_171_;
        if (i == -2147483648)
            i = i_170_ = i_171_ = 0;
        else {
            i_170_ = method2476(i, anInt9676);
            i_171_ = method2482(i, anInt9676);
        }
        if (anInt9688 != i || anInt9687 != i_170_ || anInt9682 != i_171_) {
            if (anInt9688 < i) {
                anInt9681 = 1;
                anInt9685 = i - anInt9688;
            } else if (anInt9688 > i) {
                anInt9681 = -1;
                anInt9685 = anInt9688 - i;
            } else
                anInt9681 = 0;
            if (anInt9687 < i_170_) {
                anInt9678 = 1;
                if (anInt9685 == 0 || anInt9685 > i_170_ - anInt9687)
                    anInt9685 = i_170_ - anInt9687;
            } else if (anInt9687 > i_170_) {
                anInt9678 = -1;
                if (anInt9685 == 0 || anInt9685 > anInt9687 - i_170_)
                    anInt9685 = anInt9687 - i_170_;
            } else
                anInt9678 = 0;
            if (anInt9682 < i_171_) {
                anInt9686 = 1;
                if (anInt9685 == 0 || anInt9685 > i_171_ - anInt9682)
                    anInt9685 = i_171_ - anInt9682;
            } else if (anInt9682 > i_171_) {
                anInt9686 = -1;
                if (anInt9685 == 0 || anInt9685 > anInt9682 - i_171_)
                    anInt9685 = anInt9682 - i_171_;
            } else
                anInt9686 = 0;
            return false;
        }
        if (anInt9684 == -2147483648) {
            anInt9684 = 0;
            anInt9688 = anInt9687 = anInt9682 = 0;
            this.remove(true);
            return true;
        }
        method2468();
        return false;
    }

    private final synchronized void method2479(int i) {
        method2455(i, method2456());
    }

    final synchronized void method2480(int i) {
        if (i == 0) {
            method2479(0);
            this.remove(true);
        } else if (anInt9687 == 0 && anInt9682 == 0) {
            anInt9685 = 0;
            anInt9684 = 0;
            anInt9688 = 0;
            this.remove(true);
        } else {
            int i_172_ = -anInt9688;
            if (anInt9688 > i_172_)
                i_172_ = anInt9688;
            if (-anInt9687 > i_172_)
                i_172_ = -anInt9687;
            if (anInt9687 > i_172_)
                i_172_ = anInt9687;
            if (-anInt9682 > i_172_)
                i_172_ = -anInt9682;
            if (anInt9682 > i_172_)
                i_172_ = anInt9682;
            if (i > i_172_)
                i = i_172_;
            anInt9685 = i;
            anInt9684 = -2147483648;
            anInt9681 = -anInt9688 / i;
            anInt9678 = -anInt9687 / i;
            anInt9686 = -anInt9682 / i;
        }
    }

    final synchronized void method2400(int[] is, int i, int i_173_) {
        if (anInt9684 == 0 && anInt9685 == 0)
            method2404(i_173_);
        else {
            Node_Sub31_Sub1 class248_sub31_sub1 = ((Node_Sub31_Sub1) ((Node_Sub15) this).aClass248_Sub31_6996);
            int i_174_ = anInt9683 << 8;
            int i_175_ = anInt9689 << 8;
            int i_176_ = ((((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734).length << 8);
            int i_177_ = i_175_ - i_174_;
            if (i_177_ <= 0)
                anInt9679 = 0;
            int i_178_ = i;
            i_173_ += i;
            if (anInt9675 < 0) {
                if (anInt9677 > 0)
                    anInt9675 = 0;
                else {
                    method2469();
                    this.remove(true);
                    return;
                }
            }
            if (anInt9675 >= i_176_) {
                if (anInt9677 < 0)
                    anInt9675 = i_176_ - 1;
                else {
                    method2469();
                    this.remove(true);
                    return;
                }
            }
            if (anInt9679 < 0) {
                if (aBoolean9680) {
                    if (anInt9677 < 0) {
                        i_178_ = method2471(is, i_178_, i_174_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9683]));
                        if (anInt9675 >= i_174_)
                            return;
                        anInt9675 = i_174_ + i_174_ - 1 - anInt9675;
                        anInt9677 = -anInt9677;
                    }
                    for (; ; ) {
                        i_178_ = method2451(is, i_178_, i_175_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9689 - 1]));
                        if (anInt9675 < i_175_)
                            break;
                        anInt9675 = i_175_ + i_175_ - 1 - anInt9675;
                        anInt9677 = -anInt9677;
                        i_178_ = method2471(is, i_178_, i_174_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9683]));
                        if (anInt9675 >= i_174_)
                            break;
                        anInt9675 = i_174_ + i_174_ - 1 - anInt9675;
                        anInt9677 = -anInt9677;
                    }
                } else if (anInt9677 < 0) {
                    for (; ; ) {
                        i_178_ = method2471(is, i_178_, i_174_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9689 - 1]));
                        if (anInt9675 >= i_174_)
                            break;
                        anInt9675 = i_175_ - 1 - (i_175_ - 1 - anInt9675) % i_177_;
                    }
                } else {
                    for (; ; ) {
                        i_178_ = method2451(is, i_178_, i_175_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9683]));
                        if (anInt9675 < i_175_)
                            break;
                        anInt9675 = i_174_ + (anInt9675 - i_174_) % i_177_;
                    }
                }
            } else {
                do {
                    if (anInt9679 > 0) {
                        if (aBoolean9680) {
                            if (anInt9677 < 0) {
                                i_178_ = method2471(is, i_178_, i_174_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9683]));
                                if (anInt9675 >= i_174_)
                                    return;
                                anInt9675 = i_174_ + i_174_ - 1 - anInt9675;
                                anInt9677 = -anInt9677;
                                if (--anInt9679 == 0)
                                    break;
                            }
                            do {
                                i_178_ = method2451(is, i_178_, i_175_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9689 - 1]));
                                if (anInt9675 < i_175_)
                                    return;
                                anInt9675 = i_175_ + i_175_ - 1 - anInt9675;
                                anInt9677 = -anInt9677;
                                if (--anInt9679 == 0)
                                    break;
                                i_178_ = method2471(is, i_178_, i_174_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9683]));
                                if (anInt9675 >= i_174_)
                                    return;
                                anInt9675 = i_174_ + i_174_ - 1 - anInt9675;
                                anInt9677 = -anInt9677;
                            } while (--anInt9679 != 0);
                        } else if (anInt9677 < 0) {
                            for (; ; ) {
                                i_178_ = method2471(is, i_178_, i_174_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9689 - 1]));
                                if (anInt9675 >= i_174_)
                                    return;
                                int i_179_ = (i_175_ - 1 - anInt9675) / i_177_;
                                if (i_179_ >= anInt9679) {
                                    anInt9675 += i_177_ * anInt9679;
                                    anInt9679 = 0;
                                    break;
                                }
                                anInt9675 += i_177_ * i_179_;
                                anInt9679 -= i_179_;
                            }
                        } else {
                            for (; ; ) {
                                i_178_ = method2451(is, i_178_, i_175_, i_173_, (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734[anInt9683]));
                                if (anInt9675 < i_175_)
                                    return;
                                int i_180_ = (anInt9675 - i_174_) / i_177_;
                                if (i_180_ >= anInt9679) {
                                    anInt9675 -= i_177_ * anInt9679;
                                    anInt9679 = 0;
                                    break;
                                }
                                anInt9675 -= i_177_ * i_180_;
                                anInt9679 -= i_180_;
                            }
                        }
                    }
                } while (false);
                if (anInt9677 < 0) {
                    method2471(is, i_178_, 0, i_173_, 0);
                    if (anInt9675 < 0) {
                        anInt9675 = -1;
                        method2469();
                        this.remove(true);
                    }
                } else {
                    method2451(is, i_178_, i_176_, i_173_, 0);
                    if (anInt9675 >= i_176_) {
                        anInt9675 = i_176_;
                        method2469();
                        this.remove(true);
                    }
                }
            }
        }
    }

    private static final int method2481(byte[] is, int[] is_181_, int i, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, Node_Sub15_Sub2 class248_sub15_sub2) {
        i >>= 8;
        i_187_ >>= 8;
        i_183_ <<= 2;
        i_184_ <<= 2;
        if ((i_185_ = i_182_ + i - (i_187_ - 1)) > i_186_)
            i_185_ = i_186_;
        class248_sub15_sub2.anInt9687 += class248_sub15_sub2.anInt9678 * (i_185_ - i_182_);
        class248_sub15_sub2.anInt9682 += class248_sub15_sub2.anInt9686 * (i_185_ - i_182_);
        i_185_ -= 3;
        while (i_182_ < i_185_) {
            is_181_[i_182_++] += is[i--] * i_183_;
            i_183_ += i_184_;
            is_181_[i_182_++] += is[i--] * i_183_;
            i_183_ += i_184_;
            is_181_[i_182_++] += is[i--] * i_183_;
            i_183_ += i_184_;
            is_181_[i_182_++] += is[i--] * i_183_;
            i_183_ += i_184_;
        }
        i_185_ += 3;
        while (i_182_ < i_185_) {
            is_181_[i_182_++] += is[i--] * i_183_;
            i_183_ += i_184_;
        }
        class248_sub15_sub2.anInt9688 = i_183_ >> 2;
        class248_sub15_sub2.anInt9675 = i << 8;
        return i_182_;
    }

    private Node_Sub15_Sub2(Node_Sub31_Sub1 class248_sub31_sub1, int i, int i_188_, int i_189_) {
        ((Node_Sub15) this).aClass248_Sub31_6996 = class248_sub31_sub1;
        anInt9683 = ((Node_Sub31_Sub1) class248_sub31_sub1).anInt9738;
        anInt9689 = ((Node_Sub31_Sub1) class248_sub31_sub1).anInt9737;
        aBoolean9680 = ((Node_Sub31_Sub1) class248_sub31_sub1).aBoolean9735;
        anInt9677 = i;
        anInt9684 = i_188_;
        anInt9676 = i_189_;
        anInt9675 = 0;
        method2468();
    }

    private static final int method2482(int i, int i_190_) {
        if (i_190_ < 0)
            return -i;
        return (int) ((double) i * Math.sqrt((double) i_190_ * 1.220703125E-4) + 0.5);
    }
}
