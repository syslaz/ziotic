/* Class48_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48_Sub3 extends Class48 {
    private ha_Sub1 aHa_Sub1_5301;
    private byte[][] aByteArrayArray5302;
    private int[] anIntArray5303;
    private int[] anIntArray5304;
    private int[] anIntArray5305;
    private int[] anIntArray5306;
    private int[] anIntArray5307;

    private final void method377(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        int i_7_ = -(i_3_ >> 2);
        i_3_ = -(i_3_ & 0x3);
        for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
            for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
                if (is[i_1_++] != 0)
                    is_0_[i_2_++] = i;
                else
                    i_2_++;
                if (is[i_1_++] != 0)
                    is_0_[i_2_++] = i;
                else
                    i_2_++;
                if (is[i_1_++] != 0)
                    is_0_[i_2_++] = i;
                else
                    i_2_++;
                if (is[i_1_++] != 0)
                    is_0_[i_2_++] = i;
                else
                    i_2_++;
            }
            for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
                if (is[i_1_++] != 0)
                    is_0_[i_2_++] = i;
                else
                    i_2_++;
            }
            i_2_ += i_5_;
            i_1_ += i_6_;
        }
    }

    final void fa(char c, int i, int i_11_, int i_12_, boolean bool) {
        i += anIntArray5305[c];
        i_11_ += anIntArray5303[c];
        int i_13_ = anIntArray5306[c];
        int i_14_ = anIntArray5307[c];
        int i_15_ = ((ha_Sub1) aHa_Sub1_5301).anInt5567;
        int i_16_ = i + i_11_ * i_15_;
        int i_17_ = i_15_ - i_13_;
        int i_18_ = 0;
        int i_19_ = 0;
        if (i_11_ < ((ha_Sub1) aHa_Sub1_5301).anInt5578) {
            int i_20_ = ((ha_Sub1) aHa_Sub1_5301).anInt5578 - i_11_;
            i_14_ -= i_20_;
            i_11_ = ((ha_Sub1) aHa_Sub1_5301).anInt5578;
            i_19_ += i_20_ * i_13_;
            i_16_ += i_20_ * i_15_;
        }
        if (i_11_ + i_14_ > ((ha_Sub1) aHa_Sub1_5301).anInt5582)
            i_14_ -= i_11_ + i_14_ - ((ha_Sub1) aHa_Sub1_5301).anInt5582;
        if (i < ((ha_Sub1) aHa_Sub1_5301).anInt5575) {
            int i_21_ = ((ha_Sub1) aHa_Sub1_5301).anInt5575 - i;
            i_13_ -= i_21_;
            i = ((ha_Sub1) aHa_Sub1_5301).anInt5575;
            i_19_ += i_21_;
            i_16_ += i_21_;
            i_18_ += i_21_;
            i_17_ += i_21_;
        }
        if (i + i_13_ > ((ha_Sub1) aHa_Sub1_5301).anInt5561) {
            int i_22_ = i + i_13_ - ((ha_Sub1) aHa_Sub1_5301).anInt5561;
            i_13_ -= i_22_;
            i_18_ += i_22_;
            i_17_ += i_22_;
        }
        if (i_13_ > 0 && i_14_ > 0) {
            if (bool)
                method377(aByteArrayArray5302[c], ((ha_Sub1) aHa_Sub1_5301).anIntArray5565, i_12_, i_19_, i_16_, i_13_, i_14_, i_17_, i_18_);
            else
                method378(aByteArrayArray5302[c], ((ha_Sub1) aHa_Sub1_5301).anIntArray5565, anIntArray5304, i_19_, i_16_, i_13_, i_14_, i_17_, i_18_);
        }
    }

    private final void method378(byte[] is, int[] is_23_, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
        int i_30_ = -(i_26_ >> 2);
        i_26_ = -(i_26_ & 0x3);
        boolean bool = false;
        for (int i_31_ = -i_27_; i_31_ < 0; i_31_++) {
            for (int i_32_ = i_30_; i_32_ < 0; i_32_++) {
                int i_33_;
                if ((i_33_ = is[i++]) != 0)
                    is_23_[i_25_++] = is_24_[i_33_ & 0xff];
                else
                    i_25_++;
                if ((i_33_ = is[i++]) != 0)
                    is_23_[i_25_++] = is_24_[i_33_ & 0xff];
                else
                    i_25_++;
                if ((i_33_ = is[i++]) != 0)
                    is_23_[i_25_++] = is_24_[i_33_ & 0xff];
                else
                    i_25_++;
                if ((i_33_ = is[i++]) != 0)
                    is_23_[i_25_++] = is_24_[i_33_ & 0xff];
                else
                    i_25_++;
            }
            for (int i_34_ = i_26_; i_34_ < 0; i_34_++) {
                int i_35_;
                if ((i_35_ = is[i++]) != 0)
                    is_23_[i_25_++] = is_24_[i_35_ & 0xff];
                else
                    i_25_++;
            }
            i_25_ += i_28_;
            i += i_29_;
        }
    }

    Class48_Sub3(ha_Sub1 var_ha_Sub1, Class285 class285, Class157[] class157s, int[] is, int[] is_36_) {
        super(var_ha_Sub1, class285);
        aHa_Sub1_5301 = var_ha_Sub1;
        aHa_Sub1_5301 = var_ha_Sub1;
        anIntArray5306 = is;
        anIntArray5307 = is_36_;
        aByteArrayArray5302 = new byte[class157s.length][];
        anIntArray5303 = new int[class157s.length];
        anIntArray5305 = new int[class157s.length];
        for (int i = 0; i < class157s.length; i++) {
            aByteArrayArray5302[i] = ((Class157) class157s[i]).aByteArray1868;
            anIntArray5303[i] = ((Class157) class157s[i]).anInt1876;
            anIntArray5305[i] = ((Class157) class157s[i]).anInt1869;
        }
        anIntArray5304 = ((Class157) class157s[0]).anIntArray1872;
    }

    private final void method379(byte[] is, int[] is_37_, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, aa var_aa, int i_47_, int i_48_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is_49_ = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_50_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_51_ = i_44_ - ((ha_Sub1) aHa_Sub1_5301).anInt5575;
        int i_52_ = i_45_;
        if (i_48_ > i_52_) {
            i_52_ = i_48_;
            i_39_ += (i_48_ - i_45_) * ((ha_Sub1) aHa_Sub1_5301).anInt5567;
            i_38_ += (i_48_ - i_45_) * i_46_;
        }
        int i_53_ = (i_48_ + is_49_.length < i_45_ + i_41_ ? i_48_ + is_49_.length : i_45_ + i_41_);
        for (int i_54_ = i_52_; i_54_ < i_53_; i_54_++) {
            int i_55_ = is_49_[i_54_ - i_48_] + i_47_;
            int i_56_ = is_50_[i_54_ - i_48_];
            int i_57_ = i_40_;
            if (i_51_ > i_55_) {
                int i_58_ = i_51_ - i_55_;
                if (i_58_ >= i_56_) {
                    i_38_ += i_40_ + i_43_;
                    i_39_ += i_40_ + i_42_;
                    continue;
                }
                i_56_ -= i_58_;
            } else {
                int i_59_ = i_55_ - i_51_;
                if (i_59_ >= i_40_) {
                    i_38_ += i_40_ + i_43_;
                    i_39_ += i_40_ + i_42_;
                    continue;
                }
                i_38_ += i_59_;
                i_57_ -= i_59_;
                i_39_ += i_59_;
            }
            int i_60_ = 0;
            if (i_57_ < i_56_)
                i_56_ = i_57_;
            else
                i_60_ = i_57_ - i_56_;
            for (int i_61_ = -i_56_; i_61_ < 0; i_61_++) {
                if (is[i_38_++] != 0)
                    is_37_[i_39_++] = i;
                else
                    i_39_++;
            }
            i_38_ += i_60_ + i_38_;
            i_39_ += i_60_ + i_42_;
        }
    }

    private final void method380(byte[] is, int[] is_62_, int[] is_63_, int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, aa var_aa, int i_73_, int i_74_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is_75_ = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_76_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_77_ = i_70_ - ((ha_Sub1) aHa_Sub1_5301).anInt5575;
        int i_78_ = i_71_;
        if (i_74_ > i_78_) {
            i_78_ = i_74_;
            i_65_ += (i_74_ - i_71_) * ((ha_Sub1) aHa_Sub1_5301).anInt5567;
            i_64_ += (i_74_ - i_71_) * i_72_;
        }
        int i_79_ = (i_74_ + is_75_.length < i_71_ + i_67_ ? i_74_ + is_75_.length : i_71_ + i_67_);
        boolean bool = false;
        for (int i_80_ = i_78_; i_80_ < i_79_; i_80_++) {
            int i_81_ = is_75_[i_80_ - i_74_] + i_73_;
            int i_82_ = is_76_[i_80_ - i_74_];
            int i_83_ = i_66_;
            if (i_77_ > i_81_) {
                int i_84_ = i_77_ - i_81_;
                if (i_84_ >= i_82_) {
                    i_64_ += i_66_ + i_69_;
                    i_65_ += i_66_ + i_68_;
                    continue;
                }
                i_82_ -= i_84_;
            } else {
                int i_85_ = i_81_ - i_77_;
                if (i_85_ >= i_66_) {
                    i_64_ += i_66_ + i_69_;
                    i_65_ += i_66_ + i_68_;
                    continue;
                }
                i_64_ += i_85_;
                i_83_ -= i_85_;
                i_65_ += i_85_;
            }
            int i_86_ = 0;
            if (i_83_ < i_82_)
                i_82_ = i_83_;
            else
                i_86_ = i_83_ - i_82_;
            for (int i_87_ = -i_82_; i_87_ < 0; i_87_++) {
                int i_88_;
                if ((i_88_ = is[i_64_++]) != 0)
                    is_62_[i_65_++] = is_63_[i_88_ & 0xff];
                else
                    i_65_++;
            }
            i_64_ += i_86_ + i_69_;
            i_65_ += i_86_ + i_68_;
        }
    }

    final void method359(char c, int i, int i_89_, int i_90_, boolean bool, aa var_aa, int i_91_, int i_92_) {
        if (var_aa == null)
            fa(c, i, i_89_, i_90_, bool);
        else {
            i += anIntArray5305[c];
            i_89_ += anIntArray5303[c];
            int i_93_ = anIntArray5306[c];
            int i_94_ = anIntArray5307[c];
            int i_95_ = ((ha_Sub1) aHa_Sub1_5301).anInt5567;
            int i_96_ = i + i_89_ * i_95_;
            int i_97_ = i_95_ - i_93_;
            int i_98_ = 0;
            int i_99_ = 0;
            if (i_89_ < ((ha_Sub1) aHa_Sub1_5301).anInt5578) {
                int i_100_ = ((ha_Sub1) aHa_Sub1_5301).anInt5578 - i_89_;
                i_94_ -= i_100_;
                i_89_ = ((ha_Sub1) aHa_Sub1_5301).anInt5578;
                i_99_ += i_100_ * i_93_;
                i_96_ += i_100_ * i_95_;
            }
            if (i_89_ + i_94_ > ((ha_Sub1) aHa_Sub1_5301).anInt5582)
                i_94_ -= i_89_ + i_94_ - ((ha_Sub1) aHa_Sub1_5301).anInt5582;
            if (i < ((ha_Sub1) aHa_Sub1_5301).anInt5575) {
                int i_101_ = ((ha_Sub1) aHa_Sub1_5301).anInt5575 - i;
                i_93_ -= i_101_;
                i = ((ha_Sub1) aHa_Sub1_5301).anInt5575;
                i_99_ += i_101_;
                i_96_ += i_101_;
                i_98_ += i_101_;
                i_97_ += i_101_;
            }
            if (i + i_93_ > ((ha_Sub1) aHa_Sub1_5301).anInt5561) {
                int i_102_ = i + i_93_ - ((ha_Sub1) aHa_Sub1_5301).anInt5561;
                i_93_ -= i_102_;
                i_98_ += i_102_;
                i_97_ += i_102_;
            }
            if (i_93_ > 0 && i_94_ > 0) {
                if (bool)
                    method379(aByteArrayArray5302[c], ((ha_Sub1) aHa_Sub1_5301).anIntArray5565, i_90_, i_99_, i_96_, i_93_, i_94_, i_97_, i_98_, i, i_89_, anIntArray5306[c], var_aa, i_91_, i_92_);
                else
                    method380(aByteArrayArray5302[c], ((ha_Sub1) aHa_Sub1_5301).anIntArray5565, anIntArray5304, i_90_, i_99_, i_96_, i_93_, i_94_, i_97_, i_98_, i, i_89_, anIntArray5306[c], var_aa, i_91_, i_92_);
            }
        }
    }
}
