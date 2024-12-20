/* Class48_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48_Sub4 extends Class48 {
    private byte[][] aByteArrayArray5308;
    private int[] anIntArray5309;
    private ha_Sub1 aHa_Sub1_5310;
    private int[] anIntArray5311;
    private int[] anIntArray5312;
    private int[] anIntArray5313;

    private final void method381(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, aa var_aa, int i_10_, int i_11_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is_12_ = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_13_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_14_ = i_8_;
        if (i_11_ > i_14_) {
            i_14_ = i_11_;
            i_2_ += (i_11_ - i_8_) * ((ha_Sub1) aHa_Sub1_5310).anInt5567;
            i_1_ += (i_11_ - i_8_) * i_9_;
        }
        int i_15_ = (i_11_ + is_12_.length < i_8_ + i_4_ ? i_11_ + is_12_.length : i_8_ + i_4_);
        for (int i_16_ = i_14_; i_16_ < i_15_; i_16_++) {
            int i_17_ = i_10_ + is_12_[i_16_ - i_11_];
            int i_18_ = is_13_[i_16_ - i_11_];
            int i_19_ = i_3_;
            if (i_7_ > i_17_) {
                int i_20_ = i_7_ - i_17_;
                if (i_20_ >= i_18_) {
                    i_1_ += i_3_ + i_6_;
                    i_2_ += i_3_ + i_5_;
                    continue;
                }
                i_18_ -= i_20_;
            } else {
                int i_21_ = i_17_ - i_7_;
                if (i_21_ >= i_3_) {
                    i_1_ += i_3_ + i_6_;
                    i_2_ += i_3_ + i_5_;
                    continue;
                }
                i_1_ += i_21_;
                i_19_ -= i_21_;
                i_2_ += i_21_;
            }
            int i_22_ = 0;
            if (i_19_ < i_18_)
                i_18_ = i_19_;
            else
                i_22_ = i_19_ - i_18_;
            for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
                if (is[i_1_++] != 0)
                    is_0_[i_2_++] = i;
                else
                    i_2_++;
            }
            i_1_ += i_22_ + i_6_;
            i_2_ += i_22_ + i_5_;
        }
    }

    final void fa(char c, int i, int i_24_, int i_25_, boolean bool) {
        i += anIntArray5309[c];
        i_24_ += anIntArray5313[c];
        int i_26_ = anIntArray5311[c];
        int i_27_ = anIntArray5312[c];
        int i_28_ = ((ha_Sub1) aHa_Sub1_5310).anInt5567;
        int i_29_ = i + i_24_ * i_28_;
        int i_30_ = i_28_ - i_26_;
        int i_31_ = 0;
        int i_32_ = 0;
        if (i_24_ < ((ha_Sub1) aHa_Sub1_5310).anInt5578) {
            int i_33_ = ((ha_Sub1) aHa_Sub1_5310).anInt5578 - i_24_;
            i_27_ -= i_33_;
            i_24_ = ((ha_Sub1) aHa_Sub1_5310).anInt5578;
            i_32_ += i_33_ * i_26_;
            i_29_ += i_33_ * i_28_;
        }
        if (i_24_ + i_27_ > ((ha_Sub1) aHa_Sub1_5310).anInt5582)
            i_27_ -= i_24_ + i_27_ - ((ha_Sub1) aHa_Sub1_5310).anInt5582;
        if (i < ((ha_Sub1) aHa_Sub1_5310).anInt5575) {
            int i_34_ = ((ha_Sub1) aHa_Sub1_5310).anInt5575 - i;
            i_26_ -= i_34_;
            i = ((ha_Sub1) aHa_Sub1_5310).anInt5575;
            i_32_ += i_34_;
            i_29_ += i_34_;
            i_31_ += i_34_;
            i_30_ += i_34_;
        }
        if (i + i_26_ > ((ha_Sub1) aHa_Sub1_5310).anInt5561) {
            int i_35_ = i + i_26_ - ((ha_Sub1) aHa_Sub1_5310).anInt5561;
            i_26_ -= i_35_;
            i_31_ += i_35_;
            i_30_ += i_35_;
        }
        if (i_26_ > 0 && i_27_ > 0) {
            if ((i_25_ & ~0xffffff) == -16777216)
                method382(aByteArrayArray5308[c], ((ha_Sub1) aHa_Sub1_5310).anIntArray5565, i_25_, i_32_, i_29_, i_26_, i_27_, i_30_, i_31_);
            else if ((i_25_ & ~0xffffff) != 0)
                method383(aByteArrayArray5308[c], ((ha_Sub1) aHa_Sub1_5310).anIntArray5565, i_25_, i_32_, i_29_, i_26_, i_27_, i_30_, i_31_);
        }
    }

    private final void method382(byte[] is, int[] is_36_, int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
        int i_43_ = -(i_39_ >> 2);
        i_39_ = -(i_39_ & 0x3);
        for (int i_44_ = -i_40_; i_44_ < 0; i_44_++) {
            for (int i_45_ = i_43_; i_45_ < 0; i_45_++) {
                if (is[i_37_++] != 0)
                    is_36_[i_38_++] = i;
                else
                    i_38_++;
                if (is[i_37_++] != 0)
                    is_36_[i_38_++] = i;
                else
                    i_38_++;
                if (is[i_37_++] != 0)
                    is_36_[i_38_++] = i;
                else
                    i_38_++;
                if (is[i_37_++] != 0)
                    is_36_[i_38_++] = i;
                else
                    i_38_++;
            }
            for (int i_46_ = i_39_; i_46_ < 0; i_46_++) {
                if (is[i_37_++] != 0)
                    is_36_[i_38_++] = i;
                else
                    i_38_++;
            }
            i_38_ += i_41_;
            i_37_ += i_42_;
        }
    }

    private final void method383(byte[] is, int[] is_47_, int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
        int i_54_ = i >>> 24;
        int i_55_ = 255 - i_54_;
        for (int i_56_ = -i_51_; i_56_ < 0; i_56_++) {
            for (int i_57_ = -i_50_; i_57_ < 0; i_57_++) {
                if (is[i_48_++] != 0) {
                    int i_58_ = ((((i & 0xff00ff) * i_54_ & ~0xff00ff) + ((i & 0xff00) * i_54_ & 0xff0000)) >> 8);
                    int i_59_ = is_47_[i_49_];
                    is_47_[i_49_++] = ((((i_59_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_59_ & 0xff00) * i_55_ & 0xff0000)) >> 8) + i_58_;
                } else
                    i_49_++;
            }
            i_49_ += i_52_;
            i_48_ += i_53_;
        }
    }

    final void method359(char c, int i, int i_60_, int i_61_, boolean bool, aa var_aa, int i_62_, int i_63_) {
        if (var_aa == null)
            fa(c, i, i_60_, i_61_, bool);
        else {
            i += anIntArray5309[c];
            i_60_ += anIntArray5313[c];
            int i_64_ = anIntArray5311[c];
            int i_65_ = anIntArray5312[c];
            int i_66_ = ((ha_Sub1) aHa_Sub1_5310).anInt5567;
            int i_67_ = i + i_60_ * i_66_;
            int i_68_ = i_66_ - i_64_;
            int i_69_ = 0;
            int i_70_ = 0;
            if (i_60_ < ((ha_Sub1) aHa_Sub1_5310).anInt5578) {
                int i_71_ = ((ha_Sub1) aHa_Sub1_5310).anInt5578 - i_60_;
                i_65_ -= i_71_;
                i_60_ = ((ha_Sub1) aHa_Sub1_5310).anInt5578;
                i_70_ += i_71_ * i_64_;
                i_67_ += i_71_ * i_66_;
            }
            if (i_60_ + i_65_ > ((ha_Sub1) aHa_Sub1_5310).anInt5582)
                i_65_ -= i_60_ + i_65_ - ((ha_Sub1) aHa_Sub1_5310).anInt5582;
            if (i < ((ha_Sub1) aHa_Sub1_5310).anInt5575) {
                int i_72_ = ((ha_Sub1) aHa_Sub1_5310).anInt5575 - i;
                i_64_ -= i_72_;
                i = ((ha_Sub1) aHa_Sub1_5310).anInt5575;
                i_70_ += i_72_;
                i_67_ += i_72_;
                i_69_ += i_72_;
                i_68_ += i_72_;
            }
            if (i + i_64_ > ((ha_Sub1) aHa_Sub1_5310).anInt5561) {
                int i_73_ = i + i_64_ - ((ha_Sub1) aHa_Sub1_5310).anInt5561;
                i_64_ -= i_73_;
                i_69_ += i_73_;
                i_68_ += i_73_;
            }
            if (i_64_ > 0 && i_65_ > 0) {
                if ((i_61_ & ~0xffffff) == -16777216)
                    method381(aByteArrayArray5308[c], ((ha_Sub1) aHa_Sub1_5310).anIntArray5565, i_61_, i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i, i_60_, anIntArray5311[c], var_aa, i_62_, i_63_);
                else
                    method384(aByteArrayArray5308[c], ((ha_Sub1) aHa_Sub1_5310).anIntArray5565, i_61_, i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i, i_60_, anIntArray5311[c], var_aa, i_62_, i_63_);
            }
        }
    }

    Class48_Sub4(ha_Sub1 var_ha_Sub1, Class285 class285, Class157[] class157s, int[] is, int[] is_74_) {
        super(var_ha_Sub1, class285);
        aHa_Sub1_5310 = var_ha_Sub1;
        anIntArray5311 = is;
        anIntArray5312 = is_74_;
        aByteArrayArray5308 = new byte[class157s.length][];
        anIntArray5313 = new int[class157s.length];
        anIntArray5309 = new int[class157s.length];
        for (int i = 0; i < class157s.length; i++) {
            aByteArrayArray5308[i] = ((Class157) class157s[i]).aByteArray1868;
            anIntArray5313[i] = ((Class157) class157s[i]).anInt1876;
            anIntArray5309[i] = ((Class157) class157s[i]).anInt1869;
        }
    }

    private final void method384(byte[] is, int[] is_75_, int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, aa var_aa, int i_85_, int i_86_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is_87_ = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_88_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_89_ = i_82_ - ((ha_Sub1) aHa_Sub1_5310).anInt5575;
        int i_90_ = i_83_;
        if (i_86_ > i_90_) {
            i_90_ = i_86_;
            i_77_ += (i_86_ - i_83_) * ((ha_Sub1) aHa_Sub1_5310).anInt5567;
            i_76_ += (i_86_ - i_83_) * i_84_;
        }
        int i_91_ = (i_86_ + is_87_.length < i_83_ + i_79_ ? i_86_ + is_87_.length : i_83_ + i_79_);
        int i_92_ = i >>> 24;
        int i_93_ = 255 - i_92_;
        for (int i_94_ = i_90_; i_94_ < i_91_; i_94_++) {
            int i_95_ = is_87_[i_94_ - i_86_] + i_85_;
            int i_96_ = is_88_[i_94_ - i_86_];
            int i_97_ = i_78_;
            if (i_89_ > i_95_) {
                int i_98_ = i_89_ - i_95_;
                if (i_98_ >= i_96_) {
                    i_76_ += i_78_ + i_81_;
                    i_77_ += i_78_ + i_80_;
                    continue;
                }
                i_96_ -= i_98_;
            } else {
                int i_99_ = i_95_ - i_89_;
                if (i_99_ >= i_78_) {
                    i_76_ += i_78_ + i_81_;
                    i_77_ += i_78_ + i_80_;
                    continue;
                }
                i_76_ += i_99_;
                i_97_ -= i_99_;
                i_77_ += i_99_;
            }
            int i_100_ = 0;
            if (i_97_ < i_96_)
                i_96_ = i_97_;
            else
                i_100_ = i_97_ - i_96_;
            for (int i_101_ = -i_96_; i_101_ < 0; i_101_++) {
                if (is[i_76_++] != 0) {
                    int i_102_ = ((((i & 0xff00ff) * i_92_ & ~0xff00ff) + ((i & 0xff00) * i_92_ & 0xff0000)) >> 8);
                    int i_103_ = is_75_[i_77_];
                    is_75_[i_77_++] = ((((i_103_ & 0xff00ff) * i_93_ & ~0xff00ff) + ((i_103_ & 0xff00) * i_93_ & 0xff0000)) >> 8) + i_102_;
                } else
                    i_77_++;
            }
            i_76_ += i_100_ + i_81_;
            i_77_ += i_100_ + i_80_;
        }
    }
}
