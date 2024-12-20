/* Class129_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129_Sub3_Sub1 extends Class129_Sub3 {
    int[] anIntArray9988;

    Class129_Sub3_Sub1(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_0_) {
        super(var_ha_Sub1, i, i_0_);
        ((Class129_Sub3_Sub1) this).anIntArray9988 = is;
    }

    Class129_Sub3_Sub1(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_1_, int i_2_, int i_3_, boolean bool) {
        super(var_ha_Sub1, i_2_, i_3_);
        if (bool)
            ((Class129_Sub3_Sub1) this).anIntArray9988 = new int[i_2_ * i_3_];
        else
            ((Class129_Sub3_Sub1) this).anIntArray9988 = is;
        i_1_ -= ((Class129_Sub3) this).anInt8548;
        int i_4_ = 0;
        for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
            for (int i_6_ = 0; i_6_ < i_2_; i_6_++) {
                int i_7_ = is[i++];
                if (i_7_ >>> 24 == 255)
                    ((Class129_Sub3_Sub1) this).anIntArray9988[i_4_++] = (i_7_ & 0xffffff) == 0 ? -16777215 : i_7_;
                else
                    ((Class129_Sub3_Sub1) this).anIntArray9988[i_4_++] = 0;
            }
            i += i_1_;
        }
    }

    Class129_Sub3_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_8_) {
        super(var_ha_Sub1, i, i_8_);
        ((Class129_Sub3_Sub1) this).anIntArray9988 = new int[i * i_8_];
    }

    final void method1164(int i, int i_9_, aa var_aa, int i_10_, int i_11_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        i += ((Class129_Sub3) this).anInt8566;
        i_9_ += ((Class129_Sub3) this).anInt8571;
        int i_12_ = 0;
        int i_13_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        int i_14_ = ((Class129_Sub3) this).anInt8548;
        int i_15_ = ((Class129_Sub3) this).anInt8569;
        int i_16_ = i_13_ - i_14_;
        int i_17_ = 0;
        int i_18_ = i + i_9_ * i_13_;
        if (i_9_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
            int i_19_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578 - i_9_);
            i_15_ -= i_19_;
            i_9_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578;
            i_12_ += i_19_ * i_14_;
            i_18_ += i_19_ * i_13_;
        }
        if (i_9_ + i_15_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
            i_15_ -= i_9_ + i_15_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
        if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
            int i_20_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575 - i);
            i_14_ -= i_20_;
            i = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575;
            i_12_ += i_20_;
            i_18_ += i_20_;
            i_17_ += i_20_;
            i_16_ += i_20_;
        }
        if (i + i_14_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
            int i_21_ = i + i_14_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561);
            i_14_ -= i_21_;
            i_17_ += i_21_;
            i_16_ += i_21_;
        }
        if (i_14_ > 0 && i_15_ > 0) {
            aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
            int[] is = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
            int[] is_22_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
            int[] is_23_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            int i_24_ = i_9_;
            if (i_11_ > i_24_) {
                i_24_ = i_11_;
                i_18_ += (i_11_ - i_9_) * i_13_;
                i_12_ += (i_11_ - i_9_) * ((Class129_Sub3) this).anInt8548;
            }
            int i_25_ = (i_11_ + is.length < i_9_ + i_15_ ? i_11_ + is.length : i_9_ + i_15_);
            for (int i_26_ = i_24_; i_26_ < i_25_; i_26_++) {
                int i_27_ = is[i_26_ - i_11_] + i_10_;
                int i_28_ = is_22_[i_26_ - i_11_];
                int i_29_ = i_14_;
                if (i > i_27_) {
                    int i_30_ = i - i_27_;
                    if (i_30_ >= i_28_) {
                        i_12_ += i_14_ + i_17_;
                        i_18_ += i_14_ + i_16_;
                        continue;
                    }
                    i_28_ -= i_30_;
                } else {
                    int i_31_ = i_27_ - i;
                    if (i_31_ >= i_14_) {
                        i_12_ += i_14_ + i_17_;
                        i_18_ += i_14_ + i_16_;
                        continue;
                    }
                    i_12_ += i_31_;
                    i_29_ -= i_31_;
                    i_18_ += i_31_;
                }
                int i_32_ = 0;
                if (i_29_ < i_28_)
                    i_28_ = i_29_;
                else
                    i_32_ = i_29_ - i_28_;
                for (int i_33_ = -i_28_; i_33_ < 0; i_33_++) {
                    int i_34_ = ((Class129_Sub3_Sub1) this).anIntArray9988[i_12_++];
                    if (i_34_ != 0)
                        is_23_[i_18_++] = i_34_;
                    else
                        i_18_++;
                }
                i_12_ += i_32_ + i_17_;
                i_18_ += i_32_ + i_16_;
            }
        }
    }

    final void method1178(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        int i_39_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        i += ((Class129_Sub3) this).anInt8566;
        i_35_ += ((Class129_Sub3) this).anInt8571;
        int i_40_ = i_35_ * i_39_ + i;
        int i_41_ = 0;
        int i_42_ = ((Class129_Sub3) this).anInt8569;
        int i_43_ = ((Class129_Sub3) this).anInt8548;
        int i_44_ = i_39_ - i_43_;
        int i_45_ = 0;
        if (i_35_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
            int i_46_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578 - i_35_);
            i_42_ -= i_46_;
            i_35_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578;
            i_41_ += i_46_ * i_43_;
            i_40_ += i_46_ * i_39_;
        }
        if (i_35_ + i_42_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
            i_42_ -= i_35_ + i_42_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
        if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
            int i_47_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575 - i);
            i_43_ -= i_47_;
            i = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575;
            i_41_ += i_47_;
            i_40_ += i_47_;
            i_45_ += i_47_;
            i_44_ += i_47_;
        }
        if (i + i_43_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
            int i_48_ = i + i_43_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561);
            i_43_ -= i_48_;
            i_45_ += i_48_;
            i_44_ += i_48_;
        }
        if (i_43_ > 0 && i_42_ > 0) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_38_ == 0) {
                if (i_36_ == 1) {
                    for (int i_49_ = -i_42_; i_49_ < 0; i_49_++) {
                        int i_50_ = i_40_ + i_43_ - 3;
                        while (i_40_ < i_50_) {
                            is[i_40_++] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            is[i_40_++] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            is[i_40_++] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            is[i_40_++] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                        }
                        i_50_ += 3;
                        while (i_40_ < i_50_)
                            is[i_40_++] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 0) {
                    int i_51_ = (i_37_ & 0xff0000) >> 16;
                    int i_52_ = (i_37_ & 0xff00) >> 8;
                    int i_53_ = i_37_ & 0xff;
                    for (int i_54_ = -i_42_; i_54_ < 0; i_54_++) {
                        for (int i_55_ = -i_43_; i_55_ < 0; i_55_++) {
                            int i_56_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            int i_57_ = (i_56_ & 0xff0000) * i_51_ & ~0xffffff;
                            int i_58_ = (i_56_ & 0xff00) * i_52_ & 0xff0000;
                            int i_59_ = (i_56_ & 0xff) * i_53_ & 0xff00;
                            is[i_40_++] = (i_57_ | i_58_ | i_59_) >>> 8;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 3) {
                    for (int i_60_ = -i_42_; i_60_ < 0; i_60_++) {
                        for (int i_61_ = -i_43_; i_61_ < 0; i_61_++) {
                            int i_62_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            int i_63_ = i_62_ + i_37_;
                            int i_64_ = (i_62_ & 0xff00ff) + (i_37_ & 0xff00ff);
                            int i_65_ = ((i_64_ & 0x1000100) + (i_63_ - i_64_ & 0x10000));
                            is[i_40_++] = i_63_ - i_65_ | i_65_ - (i_65_ >>> 8);
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 2) {
                    int i_66_ = i_37_ >>> 24;
                    int i_67_ = 256 - i_66_;
                    int i_68_ = (i_37_ & 0xff00ff) * i_67_ & ~0xff00ff;
                    int i_69_ = (i_37_ & 0xff00) * i_67_ & 0xff0000;
                    i_37_ = (i_68_ | i_69_) >>> 8;
                    for (int i_70_ = -i_42_; i_70_ < 0; i_70_++) {
                        for (int i_71_ = -i_43_; i_71_ < 0; i_71_++) {
                            int i_72_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            i_68_ = (i_72_ & 0xff00ff) * i_66_ & ~0xff00ff;
                            i_69_ = (i_72_ & 0xff00) * i_66_ & 0xff0000;
                            is[i_40_++] = ((i_68_ | i_69_) >>> 8) + i_37_;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_38_ == 1) {
                if (i_36_ == 1) {
                    for (int i_73_ = -i_42_; i_73_ < 0; i_73_++) {
                        int i_74_ = i_40_ + i_43_ - 3;
                        while (i_40_ < i_74_) {
                            int i_75_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_75_ != 0)
                                is[i_40_++] = i_75_;
                            else
                                i_40_++;
                            i_75_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_75_ != 0)
                                is[i_40_++] = i_75_;
                            else
                                i_40_++;
                            i_75_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_75_ != 0)
                                is[i_40_++] = i_75_;
                            else
                                i_40_++;
                            i_75_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_75_ != 0)
                                is[i_40_++] = i_75_;
                            else
                                i_40_++;
                        }
                        i_74_ += 3;
                        while (i_40_ < i_74_) {
                            int i_76_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_76_ != 0)
                                is[i_40_++] = i_76_;
                            else
                                i_40_++;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 0) {
                    if ((i_37_ & 0xffffff) == 16777215) {
                        int i_77_ = i_37_ >>> 24;
                        int i_78_ = 256 - i_77_;
                        for (int i_79_ = -i_42_; i_79_ < 0; i_79_++) {
                            for (int i_80_ = -i_43_; i_80_ < 0; i_80_++) {
                                int i_81_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                                if (i_81_ != 0) {
                                    int i_82_ = is[i_40_];
                                    is[i_40_++] = ((((i_81_ & 0xff00ff) * i_77_ + (i_82_ & 0xff00ff) * i_78_) & ~0xff00ff) + (((i_81_ & 0xff00) * i_77_ + (i_82_ & 0xff00) * i_78_) & 0xff0000)) >> 8;
                                } else
                                    i_40_++;
                            }
                            i_40_ += i_44_;
                            i_41_ += i_45_;
                        }
                    } else {
                        int i_83_ = (i_37_ & 0xff0000) >> 16;
                        int i_84_ = (i_37_ & 0xff00) >> 8;
                        int i_85_ = i_37_ & 0xff;
                        int i_86_ = i_37_ >>> 24;
                        int i_87_ = 256 - i_86_;
                        for (int i_88_ = -i_42_; i_88_ < 0; i_88_++) {
                            for (int i_89_ = -i_43_; i_89_ < 0; i_89_++) {
                                int i_90_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                                if (i_90_ != 0) {
                                    if (i_86_ != 255) {
                                        int i_91_ = ((i_90_ & 0xff0000) * i_83_ & ~0xffffff);
                                        int i_92_ = ((i_90_ & 0xff00) * i_84_ & 0xff0000);
                                        int i_93_ = (i_90_ & 0xff) * i_85_ & 0xff00;
                                        i_90_ = (i_91_ | i_92_ | i_93_) >>> 8;
                                        int i_94_ = is[i_40_];
                                        is[i_40_++] = ((((i_90_ & 0xff00ff) * i_86_ + (i_94_ & 0xff00ff) * i_87_) & ~0xff00ff) + (((i_90_ & 0xff00) * i_86_ + (i_94_ & 0xff00) * i_87_) & 0xff0000)) >> 8;
                                    } else {
                                        int i_95_ = ((i_90_ & 0xff0000) * i_83_ & ~0xffffff);
                                        int i_96_ = ((i_90_ & 0xff00) * i_84_ & 0xff0000);
                                        int i_97_ = (i_90_ & 0xff) * i_85_ & 0xff00;
                                        is[i_40_++] = (i_95_ | i_96_ | i_97_) >>> 8;
                                    }
                                } else
                                    i_40_++;
                            }
                            i_40_ += i_44_;
                            i_41_ += i_45_;
                        }
                        return;
                    }
                    return;
                }
                if (i_36_ == 3) {
                    int i_98_ = i_37_ >>> 24;
                    int i_99_ = 256 - i_98_;
                    for (int i_100_ = -i_42_; i_100_ < 0; i_100_++) {
                        for (int i_101_ = -i_43_; i_101_ < 0; i_101_++) {
                            int i_102_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            int i_103_ = i_102_ + i_37_;
                            int i_104_ = (i_102_ & 0xff00ff) + (i_37_ & 0xff00ff);
                            int i_105_ = ((i_104_ & 0x1000100) + (i_103_ - i_104_ & 0x10000));
                            i_105_ = i_103_ - i_105_ | i_105_ - (i_105_ >>> 8);
                            if (i_102_ == 0 && i_98_ != 255) {
                                i_102_ = i_105_;
                                i_105_ = is[i_40_];
                                i_105_ = ((((i_102_ & 0xff00ff) * i_98_ + (i_105_ & 0xff00ff) * i_99_) & ~0xff00ff) + (((i_102_ & 0xff00) * i_98_ + (i_105_ & 0xff00) * i_99_) & 0xff0000)) >> 8;
                            }
                            is[i_40_++] = i_105_;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 2) {
                    int i_106_ = i_37_ >>> 24;
                    int i_107_ = 256 - i_106_;
                    int i_108_ = (i_37_ & 0xff00ff) * i_107_ & ~0xff00ff;
                    int i_109_ = (i_37_ & 0xff00) * i_107_ & 0xff0000;
                    i_37_ = (i_108_ | i_109_) >>> 8;
                    for (int i_110_ = -i_42_; i_110_ < 0; i_110_++) {
                        for (int i_111_ = -i_43_; i_111_ < 0; i_111_++) {
                            int i_112_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_112_ != 0) {
                                i_108_ = (i_112_ & 0xff00ff) * i_106_ & ~0xff00ff;
                                i_109_ = (i_112_ & 0xff00) * i_106_ & 0xff0000;
                                is[i_40_++] = ((i_108_ | i_109_) >>> 8) + i_37_;
                            } else
                                i_40_++;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_38_ == 2) {
                if (i_36_ == 1) {
                    for (int i_113_ = -i_42_; i_113_ < 0; i_113_++) {
                        for (int i_114_ = -i_43_; i_114_ < 0; i_114_++) {
                            int i_115_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_115_ != 0) {
                                int i_116_ = is[i_40_];
                                int i_117_ = i_115_ + i_116_;
                                int i_118_ = ((i_115_ & 0xff00ff) + (i_116_ & 0xff00ff));
                                i_116_ = (i_118_ & 0x1000100) + (i_117_ - i_118_ & 0x10000);
                                is[i_40_++] = i_117_ - i_116_ | i_116_ - (i_116_ >>> 8);
                            } else
                                i_40_++;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 0) {
                    int i_119_ = (i_37_ & 0xff0000) >> 16;
                    int i_120_ = (i_37_ & 0xff00) >> 8;
                    int i_121_ = i_37_ & 0xff;
                    for (int i_122_ = -i_42_; i_122_ < 0; i_122_++) {
                        for (int i_123_ = -i_43_; i_123_ < 0; i_123_++) {
                            int i_124_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_124_ != 0) {
                                int i_125_ = (i_124_ & 0xff0000) * i_119_ & ~0xffffff;
                                int i_126_ = (i_124_ & 0xff00) * i_120_ & 0xff0000;
                                int i_127_ = (i_124_ & 0xff) * i_121_ & 0xff00;
                                i_124_ = (i_125_ | i_126_ | i_127_) >>> 8;
                                int i_128_ = is[i_40_];
                                int i_129_ = i_124_ + i_128_;
                                int i_130_ = ((i_124_ & 0xff00ff) + (i_128_ & 0xff00ff));
                                i_128_ = (i_130_ & 0x1000100) + (i_129_ - i_130_ & 0x10000);
                                is[i_40_++] = i_129_ - i_128_ | i_128_ - (i_128_ >>> 8);
                            } else
                                i_40_++;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 3) {
                    for (int i_131_ = -i_42_; i_131_ < 0; i_131_++) {
                        for (int i_132_ = -i_43_; i_132_ < 0; i_132_++) {
                            int i_133_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            int i_134_ = i_133_ + i_37_;
                            int i_135_ = (i_133_ & 0xff00ff) + (i_37_ & 0xff00ff);
                            int i_136_ = ((i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000));
                            i_133_ = i_134_ - i_136_ | i_136_ - (i_136_ >>> 8);
                            i_136_ = is[i_40_];
                            i_134_ = i_133_ + i_136_;
                            i_135_ = (i_133_ & 0xff00ff) + (i_136_ & 0xff00ff);
                            i_136_ = (i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000);
                            is[i_40_++] = i_134_ - i_136_ | i_136_ - (i_136_ >>> 8);
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                if (i_36_ == 2) {
                    int i_137_ = i_37_ >>> 24;
                    int i_138_ = 256 - i_137_;
                    int i_139_ = (i_37_ & 0xff00ff) * i_138_ & ~0xff00ff;
                    int i_140_ = (i_37_ & 0xff00) * i_138_ & 0xff0000;
                    i_37_ = (i_139_ | i_140_) >>> 8;
                    for (int i_141_ = -i_42_; i_141_ < 0; i_141_++) {
                        for (int i_142_ = -i_43_; i_142_ < 0; i_142_++) {
                            int i_143_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_41_++]);
                            if (i_143_ != 0) {
                                i_139_ = (i_143_ & 0xff00ff) * i_137_ & ~0xff00ff;
                                i_140_ = (i_143_ & 0xff00) * i_137_ & 0xff0000;
                                i_143_ = ((i_139_ | i_140_) >>> 8) + i_37_;
                                int i_144_ = is[i_40_];
                                int i_145_ = i_143_ + i_144_;
                                int i_146_ = ((i_143_ & 0xff00ff) + (i_144_ & 0xff00ff));
                                i_144_ = (i_146_ & 0x1000100) + (i_145_ - i_146_ & 0x10000);
                                is[i_40_++] = i_145_ - i_144_ | i_144_ - (i_144_ >>> 8);
                            } else
                                i_40_++;
                        }
                        i_40_ += i_44_;
                        i_41_ += i_45_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1183(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        if (i_148_ > 0 && i_149_ > 0) {
            int i_154_ = 0;
            int i_155_ = 0;
            int i_156_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
            int i_157_ = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
            int i_158_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
            int i_159_ = (i_157_ << 16) / i_148_;
            int i_160_ = (i_158_ << 16) / i_149_;
            if (((Class129_Sub3) this).anInt8566 > 0) {
                int i_161_ = (((((Class129_Sub3) this).anInt8566 << 16) + i_159_ - 1) / i_159_);
                i += i_161_;
                i_154_ += i_161_ * i_159_ - (((Class129_Sub3) this).anInt8566 << 16);
            }
            if (((Class129_Sub3) this).anInt8571 > 0) {
                int i_162_ = (((((Class129_Sub3) this).anInt8571 << 16) + i_160_ - 1) / i_160_);
                i_147_ += i_162_;
                i_155_ += i_162_ * i_160_ - (((Class129_Sub3) this).anInt8571 << 16);
            }
            if (((Class129_Sub3) this).anInt8548 < i_157_)
                i_148_ = ((((Class129_Sub3) this).anInt8548 << 16) - i_154_ + i_159_ - 1) / i_159_;
            if (((Class129_Sub3) this).anInt8569 < i_158_)
                i_149_ = ((((Class129_Sub3) this).anInt8569 << 16) - i_155_ + i_160_ - 1) / i_160_;
            int i_163_ = i + i_147_ * i_156_;
            int i_164_ = i_156_ - i_148_;
            if (i_147_ + i_149_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
                i_149_ -= (i_147_ + i_149_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582));
            if (i_147_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
                int i_165_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) - i_147_);
                i_149_ -= i_165_;
                i_163_ += i_165_ * i_156_;
                i_155_ += i_160_ * i_165_;
            }
            if (i + i_148_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
                int i_166_ = (i + i_148_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
                i_148_ -= i_166_;
                i_164_ += i_166_;
            }
            if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
                int i_167_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) - i);
                i_148_ -= i_167_;
                i_163_ += i_167_;
                i_154_ += i_159_ * i_167_;
                i_164_ += i_167_;
            }
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_152_ == 0) {
                if (i_150_ == 1) {
                    int i_168_ = i_154_;
                    for (int i_169_ = -i_149_; i_169_ < 0; i_169_++) {
                        int i_170_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_171_ = -i_148_; i_171_ < 0; i_171_++) {
                            is[i_163_++] = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_170_]);
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_168_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 0) {
                    int i_172_ = (i_151_ & 0xff0000) >> 16;
                    int i_173_ = (i_151_ & 0xff00) >> 8;
                    int i_174_ = i_151_ & 0xff;
                    int i_175_ = i_154_;
                    for (int i_176_ = -i_149_; i_176_ < 0; i_176_++) {
                        int i_177_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_178_ = -i_148_; i_178_ < 0; i_178_++) {
                            int i_179_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_177_]);
                            int i_180_ = (i_179_ & 0xff0000) * i_172_ & ~0xffffff;
                            int i_181_ = (i_179_ & 0xff00) * i_173_ & 0xff0000;
                            int i_182_ = (i_179_ & 0xff) * i_174_ & 0xff00;
                            is[i_163_++] = (i_180_ | i_181_ | i_182_) >>> 8;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_175_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 3) {
                    int i_183_ = i_154_;
                    for (int i_184_ = -i_149_; i_184_ < 0; i_184_++) {
                        int i_185_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_186_ = -i_148_; i_186_ < 0; i_186_++) {
                            int i_187_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_185_]);
                            int i_188_ = i_187_ + i_151_;
                            int i_189_ = (i_187_ & 0xff00ff) + (i_151_ & 0xff00ff);
                            int i_190_ = ((i_189_ & 0x1000100) + (i_188_ - i_189_ & 0x10000));
                            is[i_163_++] = i_188_ - i_190_ | i_190_ - (i_190_ >>> 8);
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_183_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 2) {
                    int i_191_ = i_151_ >>> 24;
                    int i_192_ = 256 - i_191_;
                    int i_193_ = (i_151_ & 0xff00ff) * i_192_ & ~0xff00ff;
                    int i_194_ = (i_151_ & 0xff00) * i_192_ & 0xff0000;
                    i_151_ = (i_193_ | i_194_) >>> 8;
                    int i_195_ = i_154_;
                    for (int i_196_ = -i_149_; i_196_ < 0; i_196_++) {
                        int i_197_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_198_ = -i_148_; i_198_ < 0; i_198_++) {
                            int i_199_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_197_]);
                            i_193_ = (i_199_ & 0xff00ff) * i_191_ & ~0xff00ff;
                            i_194_ = (i_199_ & 0xff00) * i_191_ & 0xff0000;
                            is[i_163_++] = ((i_193_ | i_194_) >>> 8) + i_151_;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_195_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_152_ == 1) {
                if (i_150_ == 1) {
                    int i_200_ = i_154_;
                    for (int i_201_ = -i_149_; i_201_ < 0; i_201_++) {
                        int i_202_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_203_ = -i_148_; i_203_ < 0; i_203_++) {
                            int i_204_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_202_]);
                            if (i_204_ != 0)
                                is[i_163_++] = i_204_;
                            else
                                i_163_++;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_200_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 0) {
                    int i_205_ = i_154_;
                    if ((i_151_ & 0xffffff) == 16777215) {
                        int i_206_ = i_151_ >>> 24;
                        int i_207_ = 256 - i_206_;
                        for (int i_208_ = -i_149_; i_208_ < 0; i_208_++) {
                            int i_209_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_210_ = -i_148_; i_210_ < 0; i_210_++) {
                                int i_211_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_209_]);
                                if (i_211_ != 0) {
                                    int i_212_ = is[i_163_];
                                    is[i_163_++] = ((((i_211_ & 0xff00ff) * i_206_ + (i_212_ & 0xff00ff) * i_207_) & ~0xff00ff) + (((i_211_ & 0xff00) * i_206_ + (i_212_ & 0xff00) * i_207_) & 0xff0000)) >> 8;
                                } else
                                    i_163_++;
                                i_154_ += i_159_;
                            }
                            i_155_ += i_160_;
                            i_154_ = i_205_;
                            i_163_ += i_164_;
                        }
                    } else {
                        int i_213_ = (i_151_ & 0xff0000) >> 16;
                        int i_214_ = (i_151_ & 0xff00) >> 8;
                        int i_215_ = i_151_ & 0xff;
                        int i_216_ = i_151_ >>> 24;
                        int i_217_ = 256 - i_216_;
                        for (int i_218_ = -i_149_; i_218_ < 0; i_218_++) {
                            int i_219_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_220_ = -i_148_; i_220_ < 0; i_220_++) {
                                int i_221_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_219_]);
                                if (i_221_ != 0) {
                                    if (i_216_ != 255) {
                                        int i_222_ = ((i_221_ & 0xff0000) * i_213_ & ~0xffffff);
                                        int i_223_ = ((i_221_ & 0xff00) * i_214_ & 0xff0000);
                                        int i_224_ = ((i_221_ & 0xff) * i_215_ & 0xff00);
                                        i_221_ = (i_222_ | i_223_ | i_224_) >>> 8;
                                        int i_225_ = is[i_163_];
                                        is[i_163_++] = ((((i_221_ & 0xff00ff) * i_216_ + ((i_225_ & 0xff00ff) * i_217_)) & ~0xff00ff) + (((i_221_ & 0xff00) * i_216_ + ((i_225_ & 0xff00) * i_217_)) & 0xff0000)) >> 8;
                                    } else {
                                        int i_226_ = ((i_221_ & 0xff0000) * i_213_ & ~0xffffff);
                                        int i_227_ = ((i_221_ & 0xff00) * i_214_ & 0xff0000);
                                        int i_228_ = ((i_221_ & 0xff) * i_215_ & 0xff00);
                                        is[i_163_++] = (i_226_ | i_227_ | i_228_) >>> 8;
                                    }
                                } else
                                    i_163_++;
                                i_154_ += i_159_;
                            }
                            i_155_ += i_160_;
                            i_154_ = i_205_;
                            i_163_ += i_164_;
                        }
                        return;
                    }
                    return;
                }
                if (i_150_ == 3) {
                    int i_229_ = i_154_;
                    int i_230_ = i_151_ >>> 24;
                    int i_231_ = 256 - i_230_;
                    for (int i_232_ = -i_149_; i_232_ < 0; i_232_++) {
                        int i_233_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_234_ = -i_148_; i_234_ < 0; i_234_++) {
                            int i_235_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_233_]);
                            int i_236_ = i_235_ + i_151_;
                            int i_237_ = (i_235_ & 0xff00ff) + (i_151_ & 0xff00ff);
                            int i_238_ = ((i_237_ & 0x1000100) + (i_236_ - i_237_ & 0x10000));
                            i_238_ = i_236_ - i_238_ | i_238_ - (i_238_ >>> 8);
                            if (i_235_ == 0 && i_230_ != 255) {
                                i_235_ = i_238_;
                                i_238_ = is[i_163_];
                                i_238_ = ((((i_235_ & 0xff00ff) * i_230_ + (i_238_ & 0xff00ff) * i_231_) & ~0xff00ff) + (((i_235_ & 0xff00) * i_230_ + (i_238_ & 0xff00) * i_231_) & 0xff0000)) >> 8;
                            }
                            is[i_163_++] = i_238_;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_229_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 2) {
                    int i_239_ = i_151_ >>> 24;
                    int i_240_ = 256 - i_239_;
                    int i_241_ = (i_151_ & 0xff00ff) * i_240_ & ~0xff00ff;
                    int i_242_ = (i_151_ & 0xff00) * i_240_ & 0xff0000;
                    i_151_ = (i_241_ | i_242_) >>> 8;
                    int i_243_ = i_154_;
                    for (int i_244_ = -i_149_; i_244_ < 0; i_244_++) {
                        int i_245_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_246_ = -i_148_; i_246_ < 0; i_246_++) {
                            int i_247_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_245_]);
                            if (i_247_ != 0) {
                                i_241_ = (i_247_ & 0xff00ff) * i_239_ & ~0xff00ff;
                                i_242_ = (i_247_ & 0xff00) * i_239_ & 0xff0000;
                                is[i_163_++] = ((i_241_ | i_242_) >>> 8) + i_151_;
                            } else
                                i_163_++;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_243_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_152_ == 2) {
                if (i_150_ == 1) {
                    int i_248_ = i_154_;
                    for (int i_249_ = -i_149_; i_249_ < 0; i_249_++) {
                        int i_250_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_251_ = -i_148_; i_251_ < 0; i_251_++) {
                            int i_252_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_250_]);
                            if (i_252_ != 0) {
                                int i_253_ = is[i_163_];
                                int i_254_ = i_252_ + i_253_;
                                int i_255_ = ((i_252_ & 0xff00ff) + (i_253_ & 0xff00ff));
                                i_253_ = (i_255_ & 0x1000100) + (i_254_ - i_255_ & 0x10000);
                                is[i_163_++] = i_254_ - i_253_ | i_253_ - (i_253_ >>> 8);
                            } else
                                i_163_++;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_248_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 0) {
                    int i_256_ = i_154_;
                    int i_257_ = (i_151_ & 0xff0000) >> 16;
                    int i_258_ = (i_151_ & 0xff00) >> 8;
                    int i_259_ = i_151_ & 0xff;
                    for (int i_260_ = -i_149_; i_260_ < 0; i_260_++) {
                        int i_261_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_262_ = -i_148_; i_262_ < 0; i_262_++) {
                            int i_263_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_261_]);
                            if (i_263_ != 0) {
                                int i_264_ = (i_263_ & 0xff0000) * i_257_ & ~0xffffff;
                                int i_265_ = (i_263_ & 0xff00) * i_258_ & 0xff0000;
                                int i_266_ = (i_263_ & 0xff) * i_259_ & 0xff00;
                                i_263_ = (i_264_ | i_265_ | i_266_) >>> 8;
                                int i_267_ = is[i_163_];
                                int i_268_ = i_263_ + i_267_;
                                int i_269_ = ((i_263_ & 0xff00ff) + (i_267_ & 0xff00ff));
                                i_267_ = (i_269_ & 0x1000100) + (i_268_ - i_269_ & 0x10000);
                                is[i_163_++] = i_268_ - i_267_ | i_267_ - (i_267_ >>> 8);
                            } else
                                i_163_++;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_256_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 3) {
                    int i_270_ = i_154_;
                    for (int i_271_ = -i_149_; i_271_ < 0; i_271_++) {
                        int i_272_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_273_ = -i_148_; i_273_ < 0; i_273_++) {
                            int i_274_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_272_]);
                            int i_275_ = i_274_ + i_151_;
                            int i_276_ = (i_274_ & 0xff00ff) + (i_151_ & 0xff00ff);
                            int i_277_ = ((i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000));
                            i_274_ = i_275_ - i_277_ | i_277_ - (i_277_ >>> 8);
                            i_277_ = is[i_163_];
                            i_275_ = i_274_ + i_277_;
                            i_276_ = (i_274_ & 0xff00ff) + (i_277_ & 0xff00ff);
                            i_277_ = (i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000);
                            is[i_163_++] = i_275_ - i_277_ | i_277_ - (i_277_ >>> 8);
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_270_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                if (i_150_ == 2) {
                    int i_278_ = i_151_ >>> 24;
                    int i_279_ = 256 - i_278_;
                    int i_280_ = (i_151_ & 0xff00ff) * i_279_ & ~0xff00ff;
                    int i_281_ = (i_151_ & 0xff00) * i_279_ & 0xff0000;
                    i_151_ = (i_280_ | i_281_) >>> 8;
                    int i_282_ = i_154_;
                    for (int i_283_ = -i_149_; i_283_ < 0; i_283_++) {
                        int i_284_ = ((i_155_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_285_ = -i_148_; i_285_ < 0; i_285_++) {
                            int i_286_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_154_ >> 16) + i_284_]);
                            if (i_286_ != 0) {
                                i_280_ = (i_286_ & 0xff00ff) * i_278_ & ~0xff00ff;
                                i_281_ = (i_286_ & 0xff00) * i_278_ & 0xff0000;
                                i_286_ = ((i_280_ | i_281_) >>> 8) + i_151_;
                                int i_287_ = is[i_163_];
                                int i_288_ = i_286_ + i_287_;
                                int i_289_ = ((i_286_ & 0xff00ff) + (i_287_ & 0xff00ff));
                                i_287_ = (i_289_ & 0x1000100) + (i_288_ - i_289_ & 0x10000);
                                is[i_163_++] = i_288_ - i_287_ | i_287_ - (i_287_ >>> 8);
                            } else
                                i_163_++;
                            i_154_ += i_159_;
                        }
                        i_155_ += i_160_;
                        i_154_ = i_282_;
                        i_163_ += i_164_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1184(int i, int i_290_, int i_291_, int i_292_, int i_293_, int i_294_) {
        int[] is = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        for (int i_295_ = 0; i_295_ < i_292_; i_295_++) {
            int i_296_ = (i_290_ + i_295_) * ((Class129_Sub3) this).anInt8548 + i;
            int i_297_ = ((i_294_ + i_295_) * ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5567 + i_293_);
            for (int i_298_ = 0; i_298_ < i_291_; i_298_++)
                ((Class129_Sub3_Sub1) this).anIntArray9988[i_296_ + i_298_] = is[i_297_ + i_298_];
        }
    }

    final void method1195(int i, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_) {
        if (i_301_ > 0 && i_302_ > 0) {
            int i_307_ = 0;
            int i_308_ = 0;
            int i_309_ = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
            int i_310_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
            int i_311_ = (i_309_ << 16) / i_301_;
            int i_312_ = (i_310_ << 16) / i_302_;
            if (((Class129_Sub3) this).anInt8566 > 0) {
                int i_313_ = (((((Class129_Sub3) this).anInt8566 << 16) + i_311_ - 1) / i_311_);
                i += i_313_;
                i_307_ += i_313_ * i_311_ - (((Class129_Sub3) this).anInt8566 << 16);
            }
            if (((Class129_Sub3) this).anInt8571 > 0) {
                int i_314_ = (((((Class129_Sub3) this).anInt8571 << 16) + i_312_ - 1) / i_312_);
                i_299_ += i_314_;
                i_308_ += i_314_ * i_312_ - (((Class129_Sub3) this).anInt8571 << 16);
            }
            if (((Class129_Sub3) this).anInt8548 < i_309_)
                i_301_ = ((((Class129_Sub3) this).anInt8548 << 16) - i_307_ + i_311_ - 1) / i_311_;
            if (((Class129_Sub3) this).anInt8569 < i_310_)
                i_302_ = ((((Class129_Sub3) this).anInt8569 << 16) - i_308_ + i_312_ - 1) / i_312_;
            int i_315_ = i + i_299_ * ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5567;
            int i_316_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567 - i_301_);
            if (i_299_ + i_302_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
                i_302_ -= (i_299_ + i_302_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582));
            if (i_299_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
                int i_317_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) - i_299_);
                i_302_ -= i_317_;
                i_315_ += i_317_ * ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5567;
                i_308_ += i_312_ * i_317_;
            }
            if (i + i_301_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
                int i_318_ = (i + i_301_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
                i_301_ -= i_318_;
                i_316_ += i_318_;
            }
            if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
                int i_319_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) - i);
                i_301_ -= i_319_;
                i_315_ += i_319_;
                i_307_ += i_311_ * i_319_;
                i_316_ += i_319_;
            }
            float[] fs = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).aFloatArray5556);
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_305_ == 0) {
                if (i_303_ == 1) {
                    int i_320_ = i_307_;
                    for (int i_321_ = -i_302_; i_321_ < 0; i_321_++) {
                        int i_322_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_323_ = -i_301_; i_323_ < 0; i_323_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                is[i_315_] = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_322_]);
                                fs[i_315_] = (float) i_300_;
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_320_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 0) {
                    int i_324_ = (i_304_ & 0xff0000) >> 16;
                    int i_325_ = (i_304_ & 0xff00) >> 8;
                    int i_326_ = i_304_ & 0xff;
                    int i_327_ = i_307_;
                    for (int i_328_ = -i_302_; i_328_ < 0; i_328_++) {
                        int i_329_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_330_ = -i_301_; i_330_ < 0; i_330_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_331_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_329_]);
                                int i_332_ = (i_331_ & 0xff0000) * i_324_ & ~0xffffff;
                                int i_333_ = (i_331_ & 0xff00) * i_325_ & 0xff0000;
                                int i_334_ = (i_331_ & 0xff) * i_326_ & 0xff00;
                                is[i_315_] = (i_332_ | i_333_ | i_334_) >>> 8;
                                fs[i_315_] = (float) i_300_;
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_327_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 3) {
                    int i_335_ = i_307_;
                    for (int i_336_ = -i_302_; i_336_ < 0; i_336_++) {
                        int i_337_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_338_ = -i_301_; i_338_ < 0; i_338_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_339_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_337_]);
                                int i_340_ = i_339_ + i_304_;
                                int i_341_ = ((i_339_ & 0xff00ff) + (i_304_ & 0xff00ff));
                                int i_342_ = ((i_341_ & 0x1000100) + (i_340_ - i_341_ & 0x10000));
                                is[i_315_] = i_340_ - i_342_ | i_342_ - (i_342_ >>> 8);
                                fs[i_315_] = (float) i_300_;
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_335_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 2) {
                    int i_343_ = i_304_ >>> 24;
                    int i_344_ = 256 - i_343_;
                    int i_345_ = (i_304_ & 0xff00ff) * i_344_ & ~0xff00ff;
                    int i_346_ = (i_304_ & 0xff00) * i_344_ & 0xff0000;
                    i_304_ = (i_345_ | i_346_) >>> 8;
                    int i_347_ = i_307_;
                    for (int i_348_ = -i_302_; i_348_ < 0; i_348_++) {
                        int i_349_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_350_ = -i_301_; i_350_ < 0; i_350_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_351_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_349_]);
                                i_345_ = (i_351_ & 0xff00ff) * i_343_ & ~0xff00ff;
                                i_346_ = (i_351_ & 0xff00) * i_343_ & 0xff0000;
                                is[i_315_] = ((i_345_ | i_346_) >>> 8) + i_304_;
                                fs[i_315_] = (float) i_300_;
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_347_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_305_ == 1) {
                if (i_303_ == 1) {
                    int i_352_ = i_307_;
                    for (int i_353_ = -i_302_; i_353_ < 0; i_353_++) {
                        int i_354_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_355_ = -i_301_; i_355_ < 0; i_355_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_356_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_354_]);
                                if (i_356_ != 0) {
                                    is[i_315_] = i_356_;
                                    fs[i_315_] = (float) i_300_;
                                }
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_352_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 0) {
                    int i_357_ = i_307_;
                    if ((i_304_ & 0xffffff) == 16777215) {
                        int i_358_ = i_304_ >>> 24;
                        int i_359_ = 256 - i_358_;
                        for (int i_360_ = -i_302_; i_360_ < 0; i_360_++) {
                            int i_361_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_362_ = -i_301_; i_362_ < 0; i_362_++) {
                                if ((float) i_300_ < fs[i_315_]) {
                                    int i_363_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_361_]);
                                    if (i_363_ != 0) {
                                        int i_364_ = is[i_315_];
                                        is[i_315_] = ((((i_363_ & 0xff00ff) * i_358_ + ((i_364_ & 0xff00ff) * i_359_)) & ~0xff00ff) + (((i_363_ & 0xff00) * i_358_ + ((i_364_ & 0xff00) * i_359_)) & 0xff0000)) >> 8;
                                        fs[i_315_] = (float) i_300_;
                                    }
                                }
                                i_307_ += i_311_;
                                i_315_++;
                            }
                            i_308_ += i_312_;
                            i_307_ = i_357_;
                            i_315_ += i_316_;
                        }
                    } else {
                        int i_365_ = (i_304_ & 0xff0000) >> 16;
                        int i_366_ = (i_304_ & 0xff00) >> 8;
                        int i_367_ = i_304_ & 0xff;
                        int i_368_ = i_304_ >>> 24;
                        int i_369_ = 256 - i_368_;
                        for (int i_370_ = -i_302_; i_370_ < 0; i_370_++) {
                            int i_371_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_372_ = -i_301_; i_372_ < 0; i_372_++) {
                                if ((float) i_300_ < fs[i_315_]) {
                                    int i_373_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_371_]);
                                    if (i_373_ != 0) {
                                        if (i_368_ != 255) {
                                            int i_374_ = ((i_373_ & 0xff0000) * i_365_ & ~0xffffff);
                                            int i_375_ = ((i_373_ & 0xff00) * i_366_ & 0xff0000);
                                            int i_376_ = ((i_373_ & 0xff) * i_367_ & 0xff00);
                                            i_373_ = (i_374_ | i_375_ | i_376_) >>> 8;
                                            int i_377_ = is[i_315_];
                                            is[i_315_] = (((((i_373_ & 0xff00ff) * i_368_) + ((i_377_ & 0xff00ff) * i_369_)) & ~0xff00ff) + ((((i_373_ & 0xff00) * i_368_) + ((i_377_ & 0xff00) * i_369_)) & 0xff0000)) >> 8;
                                            fs[i_315_] = (float) i_300_;
                                        } else {
                                            int i_378_ = ((i_373_ & 0xff0000) * i_365_ & ~0xffffff);
                                            int i_379_ = ((i_373_ & 0xff00) * i_366_ & 0xff0000);
                                            int i_380_ = ((i_373_ & 0xff) * i_367_ & 0xff00);
                                            is[i_315_] = (i_378_ | i_379_ | i_380_) >>> 8;
                                            fs[i_315_] = (float) i_300_;
                                        }
                                    }
                                }
                                i_307_ += i_311_;
                                i_315_++;
                            }
                            i_308_ += i_312_;
                            i_307_ = i_357_;
                            i_315_ += i_316_;
                        }
                        return;
                    }
                    return;
                }
                if (i_303_ == 3) {
                    int i_381_ = i_307_;
                    int i_382_ = i_304_ >>> 24;
                    int i_383_ = 256 - i_382_;
                    for (int i_384_ = -i_302_; i_384_ < 0; i_384_++) {
                        int i_385_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_386_ = -i_301_; i_386_ < 0; i_386_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_387_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_385_]);
                                int i_388_ = i_387_ + i_304_;
                                int i_389_ = ((i_387_ & 0xff00ff) + (i_304_ & 0xff00ff));
                                int i_390_ = ((i_389_ & 0x1000100) + (i_388_ - i_389_ & 0x10000));
                                i_390_ = i_388_ - i_390_ | i_390_ - (i_390_ >>> 8);
                                if (i_387_ == 0 && i_382_ != 255) {
                                    i_387_ = i_390_;
                                    i_390_ = is[i_315_];
                                    i_390_ = ((((i_387_ & 0xff00ff) * i_382_ + (i_390_ & 0xff00ff) * i_383_) & ~0xff00ff) + (((i_387_ & 0xff00) * i_382_ + (i_390_ & 0xff00) * i_383_) & 0xff0000)) >> 8;
                                }
                                is[i_315_] = i_390_;
                                fs[i_315_] = (float) i_300_;
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_381_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 2) {
                    int i_391_ = i_304_ >>> 24;
                    int i_392_ = 256 - i_391_;
                    int i_393_ = (i_304_ & 0xff00ff) * i_392_ & ~0xff00ff;
                    int i_394_ = (i_304_ & 0xff00) * i_392_ & 0xff0000;
                    i_304_ = (i_393_ | i_394_) >>> 8;
                    int i_395_ = i_307_;
                    for (int i_396_ = -i_302_; i_396_ < 0; i_396_++) {
                        int i_397_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_398_ = -i_301_; i_398_ < 0; i_398_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_399_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_397_]);
                                if (i_399_ != 0) {
                                    i_393_ = ((i_399_ & 0xff00ff) * i_391_ & ~0xff00ff);
                                    i_394_ = ((i_399_ & 0xff00) * i_391_ & 0xff0000);
                                    is[i_315_] = ((i_393_ | i_394_) >>> 8) + i_304_;
                                    fs[i_315_] = (float) i_300_;
                                }
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_395_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_305_ == 2) {
                if (i_303_ == 1) {
                    int i_400_ = i_307_;
                    for (int i_401_ = -i_302_; i_401_ < 0; i_401_++) {
                        int i_402_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_403_ = -i_301_; i_403_ < 0; i_403_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_404_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_402_]);
                                if (i_404_ != 0) {
                                    int i_405_ = is[i_315_];
                                    int i_406_ = i_404_ + i_405_;
                                    int i_407_ = ((i_404_ & 0xff00ff) + (i_405_ & 0xff00ff));
                                    i_405_ = ((i_407_ & 0x1000100) + (i_406_ - i_407_ & 0x10000));
                                    is[i_315_] = i_406_ - i_405_ | i_405_ - (i_405_ >>> 8);
                                    fs[i_315_] = (float) i_300_;
                                }
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_400_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 0) {
                    int i_408_ = i_307_;
                    int i_409_ = (i_304_ & 0xff0000) >> 16;
                    int i_410_ = (i_304_ & 0xff00) >> 8;
                    int i_411_ = i_304_ & 0xff;
                    for (int i_412_ = -i_302_; i_412_ < 0; i_412_++) {
                        int i_413_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_414_ = -i_301_; i_414_ < 0; i_414_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_415_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_413_]);
                                if (i_415_ != 0) {
                                    int i_416_ = ((i_415_ & 0xff0000) * i_409_ & ~0xffffff);
                                    int i_417_ = ((i_415_ & 0xff00) * i_410_ & 0xff0000);
                                    int i_418_ = (i_415_ & 0xff) * i_411_ & 0xff00;
                                    i_415_ = (i_416_ | i_417_ | i_418_) >>> 8;
                                    int i_419_ = is[i_315_];
                                    int i_420_ = i_415_ + i_419_;
                                    int i_421_ = ((i_415_ & 0xff00ff) + (i_419_ & 0xff00ff));
                                    i_419_ = ((i_421_ & 0x1000100) + (i_420_ - i_421_ & 0x10000));
                                    is[i_315_] = i_420_ - i_419_ | i_419_ - (i_419_ >>> 8);
                                    fs[i_315_] = (float) i_300_;
                                }
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_408_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 3) {
                    int i_422_ = i_307_;
                    for (int i_423_ = -i_302_; i_423_ < 0; i_423_++) {
                        int i_424_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_425_ = -i_301_; i_425_ < 0; i_425_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_426_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_424_]);
                                int i_427_ = i_426_ + i_304_;
                                int i_428_ = ((i_426_ & 0xff00ff) + (i_304_ & 0xff00ff));
                                int i_429_ = ((i_428_ & 0x1000100) + (i_427_ - i_428_ & 0x10000));
                                i_426_ = i_427_ - i_429_ | i_429_ - (i_429_ >>> 8);
                                i_429_ = is[i_315_];
                                i_427_ = i_426_ + i_429_;
                                i_428_ = (i_426_ & 0xff00ff) + (i_429_ & 0xff00ff);
                                i_429_ = (i_428_ & 0x1000100) + (i_427_ - i_428_ & 0x10000);
                                is[i_315_] = i_427_ - i_429_ | i_429_ - (i_429_ >>> 8);
                                fs[i_315_] = (float) i_300_;
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_422_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                if (i_303_ == 2) {
                    int i_430_ = i_304_ >>> 24;
                    int i_431_ = 256 - i_430_;
                    int i_432_ = (i_304_ & 0xff00ff) * i_431_ & ~0xff00ff;
                    int i_433_ = (i_304_ & 0xff00) * i_431_ & 0xff0000;
                    i_304_ = (i_432_ | i_433_) >>> 8;
                    int i_434_ = i_307_;
                    for (int i_435_ = -i_302_; i_435_ < 0; i_435_++) {
                        int i_436_ = ((i_308_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_437_ = -i_301_; i_437_ < 0; i_437_++) {
                            if ((float) i_300_ < fs[i_315_]) {
                                int i_438_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(i_307_ >> 16) + i_436_]);
                                if (i_438_ != 0) {
                                    i_432_ = ((i_438_ & 0xff00ff) * i_430_ & ~0xff00ff);
                                    i_433_ = ((i_438_ & 0xff00) * i_430_ & 0xff0000);
                                    i_438_ = ((i_432_ | i_433_) >>> 8) + i_304_;
                                    int i_439_ = is[i_315_];
                                    int i_440_ = i_438_ + i_439_;
                                    int i_441_ = ((i_438_ & 0xff00ff) + (i_439_ & 0xff00ff));
                                    i_439_ = ((i_441_ & 0x1000100) + (i_440_ - i_441_ & 0x10000));
                                    is[i_315_] = i_440_ - i_439_ | i_439_ - (i_439_ >>> 8);
                                    fs[i_315_] = (float) i_300_;
                                }
                            }
                            i_307_ += i_311_;
                            i_315_++;
                        }
                        i_308_ += i_312_;
                        i_307_ = i_434_;
                        i_315_ += i_316_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1177(int i, int i_442_, int i_443_) {
        throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
    }

    final void method1193(int i, int i_444_) {
        int[] is = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        if (Class129_Sub3.anInt8557 == 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_445_ = Class129_Sub3.anInt8577;
                while (i_445_ < 0) {
                    int i_446_ = Class129_Sub3.anInt8550;
                    int i_447_ = Class129_Sub3.anInt8558;
                    int i_448_ = Class129_Sub3.anInt8561;
                    int i_449_ = Class129_Sub3.anInt8549;
                    if (i_447_ >= 0 && i_448_ >= 0 && (i_447_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) && (i_448_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        for (/**/; i_449_ < 0; i_449_++) {
                            int i_450_ = (((i_448_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_447_ >> 12));
                            int i_451_ = i_446_++;
                            int[] is_452_ = is;
                            int i_453_ = i;
                            int i_454_ = i_444_;
                            if (i_454_ == 0) {
                                if (i_453_ == 1)
                                    is_452_[i_451_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                else if (i_453_ == 0) {
                                    int i_455_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_++]);
                                    int i_456_ = (((i_455_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_457_ = (((i_455_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_458_ = (((i_455_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_452_[i_451_] = (i_456_ | i_457_ | i_458_) >>> 8;
                                } else if (i_453_ == 3) {
                                    int i_459_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_++]);
                                    int i_460_ = Class129_Sub3.anInt8565;
                                    int i_461_ = i_459_ + i_460_;
                                    int i_462_ = ((i_459_ & 0xff00ff) + (i_460_ & 0xff00ff));
                                    int i_463_ = ((i_462_ & 0x1000100) + (i_461_ - i_462_ & 0x10000));
                                    is_452_[i_451_] = i_461_ - i_463_ | i_463_ - (i_463_ >>> 8);
                                } else if (i_453_ == 2) {
                                    int i_464_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    int i_465_ = (((i_464_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_466_ = (((i_464_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_452_[i_451_] = (((i_465_ | i_466_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_454_ == 1) {
                                if (i_453_ == 1) {
                                    int i_467_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    if (i_467_ != 0)
                                        is_452_[i_451_] = i_467_;
                                } else if (i_453_ == 0) {
                                    int i_468_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    if (i_468_ != 0) {
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_469_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_470_ = 256 - i_469_;
                                            int i_471_ = is_452_[i_451_];
                                            is_452_[i_451_] = (((((i_468_ & 0xff00ff) * i_469_) + ((i_471_ & 0xff00ff) * i_470_)) & ~0xff00ff) + ((((i_468_ & 0xff00) * i_469_) + ((i_471_ & 0xff00) * i_470_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_472_ = (((i_468_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_473_ = (((i_468_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_474_ = (((i_468_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_468_ = (i_472_ | i_473_ | i_474_) >>> 8;
                                            int i_475_ = is_452_[i_451_];
                                            is_452_[i_451_] = (((((i_468_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_475_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_468_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_475_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_476_ = (((i_468_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_477_ = (((i_468_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_478_ = (((i_468_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_452_[i_451_] = (i_476_ | i_477_ | i_478_) >>> 8;
                                        }
                                    }
                                } else if (i_453_ == 3) {
                                    int i_479_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    int i_480_ = Class129_Sub3.anInt8565;
                                    int i_481_ = i_479_ + i_480_;
                                    int i_482_ = ((i_479_ & 0xff00ff) + (i_480_ & 0xff00ff));
                                    int i_483_ = ((i_482_ & 0x1000100) + (i_481_ - i_482_ & 0x10000));
                                    i_483_ = i_481_ - i_483_ | i_483_ - (i_483_ >>> 8);
                                    if (i_479_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_479_ = i_483_;
                                        i_483_ = is_452_[i_451_];
                                        i_483_ = (((((i_479_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_483_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_479_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_483_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_452_[i_451_] = i_483_;
                                } else if (i_453_ == 2) {
                                    int i_484_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    if (i_484_ != 0) {
                                        int i_485_ = (((i_484_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_486_ = (((i_484_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_452_[i_451_++] = (((i_485_ | i_486_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_454_ == 2) {
                                if (i_453_ == 1) {
                                    int i_487_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    if (i_487_ != 0) {
                                        int i_488_ = is_452_[i_451_];
                                        int i_489_ = i_487_ + i_488_;
                                        int i_490_ = ((i_487_ & 0xff00ff) + (i_488_ & 0xff00ff));
                                        i_488_ = ((i_490_ & 0x1000100) + (i_489_ - i_490_ & 0x10000));
                                        is_452_[i_451_] = (i_489_ - i_488_ | i_488_ - (i_488_ >>> 8));
                                    }
                                } else if (i_453_ == 0) {
                                    int i_491_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    if (i_491_ != 0) {
                                        int i_492_ = (((i_491_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_493_ = (((i_491_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_494_ = (((i_491_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_491_ = (i_492_ | i_493_ | i_494_) >>> 8;
                                        int i_495_ = is_452_[i_451_];
                                        int i_496_ = i_491_ + i_495_;
                                        int i_497_ = ((i_491_ & 0xff00ff) + (i_495_ & 0xff00ff));
                                        i_495_ = ((i_497_ & 0x1000100) + (i_496_ - i_497_ & 0x10000));
                                        is_452_[i_451_] = (i_496_ - i_495_ | i_495_ - (i_495_ >>> 8));
                                    }
                                } else if (i_453_ == 3) {
                                    int i_498_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    int i_499_ = Class129_Sub3.anInt8565;
                                    int i_500_ = i_498_ + i_499_;
                                    int i_501_ = ((i_498_ & 0xff00ff) + (i_499_ & 0xff00ff));
                                    int i_502_ = ((i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000));
                                    i_498_ = i_500_ - i_502_ | i_502_ - (i_502_ >>> 8);
                                    i_502_ = is_452_[i_451_];
                                    i_500_ = i_498_ + i_502_;
                                    i_501_ = (i_498_ & 0xff00ff) + (i_502_ & 0xff00ff);
                                    i_502_ = ((i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000));
                                    is_452_[i_451_] = i_500_ - i_502_ | i_502_ - (i_502_ >>> 8);
                                } else if (i_453_ == 2) {
                                    int i_503_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_450_]);
                                    if (i_503_ != 0) {
                                        int i_504_ = (((i_503_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_505_ = (((i_503_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_503_ = (((i_504_ | i_505_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_506_ = is_452_[i_451_];
                                        int i_507_ = i_503_ + i_506_;
                                        int i_508_ = ((i_503_ & 0xff00ff) + (i_506_ & 0xff00ff));
                                        i_506_ = ((i_508_ & 0x1000100) + (i_507_ - i_508_ & 0x10000));
                                        is_452_[i_451_] = (i_507_ - i_506_ | i_506_ - (i_506_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    i_445_++;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_509_ = Class129_Sub3.anInt8577;
                while (i_509_ < 0) {
                    int i_510_ = Class129_Sub3.anInt8550;
                    int i_511_ = Class129_Sub3.anInt8558;
                    int i_512_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_513_ = Class129_Sub3.anInt8549;
                    if (i_511_ >= 0 && (i_511_ - (((Class129_Sub3) this).anInt8548 << 12) < 0)) {
                        int i_514_;
                        if ((i_514_ = i_512_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                            i_514_ = ((Class129_Sub3.anInt8564 - i_514_) / Class129_Sub3.anInt8564);
                            i_513_ += i_514_;
                            i_512_ += Class129_Sub3.anInt8564 * i_514_;
                            i_510_ += i_514_;
                        }
                        if ((i_514_ = ((i_512_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_513_)
                            i_513_ = i_514_;
                        for (/**/; i_513_ < 0; i_513_++) {
                            int i_515_ = (((i_512_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_511_ >> 12));
                            int i_516_ = i_510_++;
                            int[] is_517_ = is;
                            int i_518_ = i;
                            int i_519_ = i_444_;
                            if (i_519_ == 0) {
                                if (i_518_ == 1)
                                    is_517_[i_516_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                else if (i_518_ == 0) {
                                    int i_520_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_++]);
                                    int i_521_ = (((i_520_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_522_ = (((i_520_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_523_ = (((i_520_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_517_[i_516_] = (i_521_ | i_522_ | i_523_) >>> 8;
                                } else if (i_518_ == 3) {
                                    int i_524_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_++]);
                                    int i_525_ = Class129_Sub3.anInt8565;
                                    int i_526_ = i_524_ + i_525_;
                                    int i_527_ = ((i_524_ & 0xff00ff) + (i_525_ & 0xff00ff));
                                    int i_528_ = ((i_527_ & 0x1000100) + (i_526_ - i_527_ & 0x10000));
                                    is_517_[i_516_] = i_526_ - i_528_ | i_528_ - (i_528_ >>> 8);
                                } else if (i_518_ == 2) {
                                    int i_529_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    int i_530_ = (((i_529_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_531_ = (((i_529_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_517_[i_516_] = (((i_530_ | i_531_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_519_ == 1) {
                                if (i_518_ == 1) {
                                    int i_532_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    if (i_532_ != 0)
                                        is_517_[i_516_] = i_532_;
                                } else if (i_518_ == 0) {
                                    int i_533_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    if (i_533_ != 0) {
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_534_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_535_ = 256 - i_534_;
                                            int i_536_ = is_517_[i_516_];
                                            is_517_[i_516_] = (((((i_533_ & 0xff00ff) * i_534_) + ((i_536_ & 0xff00ff) * i_535_)) & ~0xff00ff) + ((((i_533_ & 0xff00) * i_534_) + ((i_536_ & 0xff00) * i_535_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_537_ = (((i_533_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_538_ = (((i_533_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_539_ = (((i_533_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_533_ = (i_537_ | i_538_ | i_539_) >>> 8;
                                            int i_540_ = is_517_[i_516_];
                                            is_517_[i_516_] = (((((i_533_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_540_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_533_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_540_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_541_ = (((i_533_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_542_ = (((i_533_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_543_ = (((i_533_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_517_[i_516_] = (i_541_ | i_542_ | i_543_) >>> 8;
                                        }
                                    }
                                } else if (i_518_ == 3) {
                                    int i_544_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    int i_545_ = Class129_Sub3.anInt8565;
                                    int i_546_ = i_544_ + i_545_;
                                    int i_547_ = ((i_544_ & 0xff00ff) + (i_545_ & 0xff00ff));
                                    int i_548_ = ((i_547_ & 0x1000100) + (i_546_ - i_547_ & 0x10000));
                                    i_548_ = i_546_ - i_548_ | i_548_ - (i_548_ >>> 8);
                                    if (i_544_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_544_ = i_548_;
                                        i_548_ = is_517_[i_516_];
                                        i_548_ = (((((i_544_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_548_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_544_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_548_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_517_[i_516_] = i_548_;
                                } else if (i_518_ == 2) {
                                    int i_549_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    if (i_549_ != 0) {
                                        int i_550_ = (((i_549_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_551_ = (((i_549_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_517_[i_516_++] = (((i_550_ | i_551_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_519_ == 2) {
                                if (i_518_ == 1) {
                                    int i_552_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    if (i_552_ != 0) {
                                        int i_553_ = is_517_[i_516_];
                                        int i_554_ = i_552_ + i_553_;
                                        int i_555_ = ((i_552_ & 0xff00ff) + (i_553_ & 0xff00ff));
                                        i_553_ = ((i_555_ & 0x1000100) + (i_554_ - i_555_ & 0x10000));
                                        is_517_[i_516_] = (i_554_ - i_553_ | i_553_ - (i_553_ >>> 8));
                                    }
                                } else if (i_518_ == 0) {
                                    int i_556_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    if (i_556_ != 0) {
                                        int i_557_ = (((i_556_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_558_ = (((i_556_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_559_ = (((i_556_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_556_ = (i_557_ | i_558_ | i_559_) >>> 8;
                                        int i_560_ = is_517_[i_516_];
                                        int i_561_ = i_556_ + i_560_;
                                        int i_562_ = ((i_556_ & 0xff00ff) + (i_560_ & 0xff00ff));
                                        i_560_ = ((i_562_ & 0x1000100) + (i_561_ - i_562_ & 0x10000));
                                        is_517_[i_516_] = (i_561_ - i_560_ | i_560_ - (i_560_ >>> 8));
                                    }
                                } else if (i_518_ == 3) {
                                    int i_563_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    int i_564_ = Class129_Sub3.anInt8565;
                                    int i_565_ = i_563_ + i_564_;
                                    int i_566_ = ((i_563_ & 0xff00ff) + (i_564_ & 0xff00ff));
                                    int i_567_ = ((i_566_ & 0x1000100) + (i_565_ - i_566_ & 0x10000));
                                    i_563_ = i_565_ - i_567_ | i_567_ - (i_567_ >>> 8);
                                    i_567_ = is_517_[i_516_];
                                    i_565_ = i_563_ + i_567_;
                                    i_566_ = (i_563_ & 0xff00ff) + (i_567_ & 0xff00ff);
                                    i_567_ = ((i_566_ & 0x1000100) + (i_565_ - i_566_ & 0x10000));
                                    is_517_[i_516_] = i_565_ - i_567_ | i_567_ - (i_567_ >>> 8);
                                } else if (i_518_ == 2) {
                                    int i_568_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_515_]);
                                    if (i_568_ != 0) {
                                        int i_569_ = (((i_568_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_570_ = (((i_568_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_568_ = (((i_569_ | i_570_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_571_ = is_517_[i_516_];
                                        int i_572_ = i_568_ + i_571_;
                                        int i_573_ = ((i_568_ & 0xff00ff) + (i_571_ & 0xff00ff));
                                        i_571_ = ((i_573_ & 0x1000100) + (i_572_ - i_573_ & 0x10000));
                                        is_517_[i_516_] = (i_572_ - i_571_ | i_571_ - (i_571_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_512_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_509_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_574_ = Class129_Sub3.anInt8577;
                while (i_574_ < 0) {
                    int i_575_ = Class129_Sub3.anInt8550;
                    int i_576_ = Class129_Sub3.anInt8558;
                    int i_577_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_578_ = Class129_Sub3.anInt8549;
                    if (i_576_ >= 0 && (i_576_ - (((Class129_Sub3) this).anInt8548 << 12) < 0)) {
                        if (i_577_ < 0) {
                            int i_579_ = ((Class129_Sub3.anInt8564 - 1 - i_577_) / Class129_Sub3.anInt8564);
                            i_578_ += i_579_;
                            i_577_ += Class129_Sub3.anInt8564 * i_579_;
                            i_575_ += i_579_;
                        }
                        int i_580_;
                        if ((i_580_ = ((1 + i_577_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_578_)
                            i_578_ = i_580_;
                        for (/**/; i_578_ < 0; i_578_++) {
                            int i_581_ = (((i_577_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_576_ >> 12));
                            int i_582_ = i_575_++;
                            int[] is_583_ = is;
                            int i_584_ = i;
                            int i_585_ = i_444_;
                            if (i_585_ == 0) {
                                if (i_584_ == 1)
                                    is_583_[i_582_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                else if (i_584_ == 0) {
                                    int i_586_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_++]);
                                    int i_587_ = (((i_586_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_588_ = (((i_586_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_589_ = (((i_586_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_583_[i_582_] = (i_587_ | i_588_ | i_589_) >>> 8;
                                } else if (i_584_ == 3) {
                                    int i_590_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_++]);
                                    int i_591_ = Class129_Sub3.anInt8565;
                                    int i_592_ = i_590_ + i_591_;
                                    int i_593_ = ((i_590_ & 0xff00ff) + (i_591_ & 0xff00ff));
                                    int i_594_ = ((i_593_ & 0x1000100) + (i_592_ - i_593_ & 0x10000));
                                    is_583_[i_582_] = i_592_ - i_594_ | i_594_ - (i_594_ >>> 8);
                                } else if (i_584_ == 2) {
                                    int i_595_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    int i_596_ = (((i_595_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_597_ = (((i_595_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_583_[i_582_] = (((i_596_ | i_597_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_585_ == 1) {
                                if (i_584_ == 1) {
                                    int i_598_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    if (i_598_ != 0)
                                        is_583_[i_582_] = i_598_;
                                } else if (i_584_ == 0) {
                                    int i_599_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    if (i_599_ != 0) {
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_600_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_601_ = 256 - i_600_;
                                            int i_602_ = is_583_[i_582_];
                                            is_583_[i_582_] = (((((i_599_ & 0xff00ff) * i_600_) + ((i_602_ & 0xff00ff) * i_601_)) & ~0xff00ff) + ((((i_599_ & 0xff00) * i_600_) + ((i_602_ & 0xff00) * i_601_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_603_ = (((i_599_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_604_ = (((i_599_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_605_ = (((i_599_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_599_ = (i_603_ | i_604_ | i_605_) >>> 8;
                                            int i_606_ = is_583_[i_582_];
                                            is_583_[i_582_] = (((((i_599_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_606_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_599_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_606_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_607_ = (((i_599_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_608_ = (((i_599_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_609_ = (((i_599_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_583_[i_582_] = (i_607_ | i_608_ | i_609_) >>> 8;
                                        }
                                    }
                                } else if (i_584_ == 3) {
                                    int i_610_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    int i_611_ = Class129_Sub3.anInt8565;
                                    int i_612_ = i_610_ + i_611_;
                                    int i_613_ = ((i_610_ & 0xff00ff) + (i_611_ & 0xff00ff));
                                    int i_614_ = ((i_613_ & 0x1000100) + (i_612_ - i_613_ & 0x10000));
                                    i_614_ = i_612_ - i_614_ | i_614_ - (i_614_ >>> 8);
                                    if (i_610_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_610_ = i_614_;
                                        i_614_ = is_583_[i_582_];
                                        i_614_ = (((((i_610_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_614_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_610_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_614_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_583_[i_582_] = i_614_;
                                } else if (i_584_ == 2) {
                                    int i_615_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    if (i_615_ != 0) {
                                        int i_616_ = (((i_615_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_617_ = (((i_615_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_583_[i_582_++] = (((i_616_ | i_617_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_585_ == 2) {
                                if (i_584_ == 1) {
                                    int i_618_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    if (i_618_ != 0) {
                                        int i_619_ = is_583_[i_582_];
                                        int i_620_ = i_618_ + i_619_;
                                        int i_621_ = ((i_618_ & 0xff00ff) + (i_619_ & 0xff00ff));
                                        i_619_ = ((i_621_ & 0x1000100) + (i_620_ - i_621_ & 0x10000));
                                        is_583_[i_582_] = (i_620_ - i_619_ | i_619_ - (i_619_ >>> 8));
                                    }
                                } else if (i_584_ == 0) {
                                    int i_622_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    if (i_622_ != 0) {
                                        int i_623_ = (((i_622_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_624_ = (((i_622_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_625_ = (((i_622_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_622_ = (i_623_ | i_624_ | i_625_) >>> 8;
                                        int i_626_ = is_583_[i_582_];
                                        int i_627_ = i_622_ + i_626_;
                                        int i_628_ = ((i_622_ & 0xff00ff) + (i_626_ & 0xff00ff));
                                        i_626_ = ((i_628_ & 0x1000100) + (i_627_ - i_628_ & 0x10000));
                                        is_583_[i_582_] = (i_627_ - i_626_ | i_626_ - (i_626_ >>> 8));
                                    }
                                } else if (i_584_ == 3) {
                                    int i_629_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    int i_630_ = Class129_Sub3.anInt8565;
                                    int i_631_ = i_629_ + i_630_;
                                    int i_632_ = ((i_629_ & 0xff00ff) + (i_630_ & 0xff00ff));
                                    int i_633_ = ((i_632_ & 0x1000100) + (i_631_ - i_632_ & 0x10000));
                                    i_629_ = i_631_ - i_633_ | i_633_ - (i_633_ >>> 8);
                                    i_633_ = is_583_[i_582_];
                                    i_631_ = i_629_ + i_633_;
                                    i_632_ = (i_629_ & 0xff00ff) + (i_633_ & 0xff00ff);
                                    i_633_ = ((i_632_ & 0x1000100) + (i_631_ - i_632_ & 0x10000));
                                    is_583_[i_582_] = i_631_ - i_633_ | i_633_ - (i_633_ >>> 8);
                                } else if (i_584_ == 2) {
                                    int i_634_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_581_]);
                                    if (i_634_ != 0) {
                                        int i_635_ = (((i_634_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_636_ = (((i_634_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_634_ = (((i_635_ | i_636_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_637_ = is_583_[i_582_];
                                        int i_638_ = i_634_ + i_637_;
                                        int i_639_ = ((i_634_ & 0xff00ff) + (i_637_ & 0xff00ff));
                                        i_637_ = ((i_639_ & 0x1000100) + (i_638_ - i_639_ & 0x10000));
                                        is_583_[i_582_] = (i_638_ - i_637_ | i_637_ - (i_637_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_577_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_574_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8557 < 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_640_ = Class129_Sub3.anInt8577;
                while (i_640_ < 0) {
                    int i_641_ = Class129_Sub3.anInt8550;
                    int i_642_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_643_ = Class129_Sub3.anInt8561;
                    int i_644_ = Class129_Sub3.anInt8549;
                    if (i_643_ >= 0 && (i_643_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        int i_645_;
                        if ((i_645_ = i_642_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_645_ = ((Class129_Sub3.anInt8557 - i_645_) / Class129_Sub3.anInt8557);
                            i_644_ += i_645_;
                            i_642_ += Class129_Sub3.anInt8557 * i_645_;
                            i_641_ += i_645_;
                        }
                        if ((i_645_ = ((i_642_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_644_)
                            i_644_ = i_645_;
                        for (/**/; i_644_ < 0; i_644_++) {
                            int i_646_ = (((i_643_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_642_ >> 12));
                            int i_647_ = i_641_++;
                            int[] is_648_ = is;
                            int i_649_ = i;
                            int i_650_ = i_444_;
                            if (i_650_ == 0) {
                                if (i_649_ == 1)
                                    is_648_[i_647_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                else if (i_649_ == 0) {
                                    int i_651_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_++]);
                                    int i_652_ = (((i_651_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_653_ = (((i_651_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_654_ = (((i_651_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_648_[i_647_] = (i_652_ | i_653_ | i_654_) >>> 8;
                                } else if (i_649_ == 3) {
                                    int i_655_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_++]);
                                    int i_656_ = Class129_Sub3.anInt8565;
                                    int i_657_ = i_655_ + i_656_;
                                    int i_658_ = ((i_655_ & 0xff00ff) + (i_656_ & 0xff00ff));
                                    int i_659_ = ((i_658_ & 0x1000100) + (i_657_ - i_658_ & 0x10000));
                                    is_648_[i_647_] = i_657_ - i_659_ | i_659_ - (i_659_ >>> 8);
                                } else if (i_649_ == 2) {
                                    int i_660_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    int i_661_ = (((i_660_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_662_ = (((i_660_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_648_[i_647_] = (((i_661_ | i_662_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_650_ == 1) {
                                if (i_649_ == 1) {
                                    int i_663_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    if (i_663_ != 0)
                                        is_648_[i_647_] = i_663_;
                                } else if (i_649_ == 0) {
                                    int i_664_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    if (i_664_ != 0) {
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_665_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_666_ = 256 - i_665_;
                                            int i_667_ = is_648_[i_647_];
                                            is_648_[i_647_] = (((((i_664_ & 0xff00ff) * i_665_) + ((i_667_ & 0xff00ff) * i_666_)) & ~0xff00ff) + ((((i_664_ & 0xff00) * i_665_) + ((i_667_ & 0xff00) * i_666_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_668_ = (((i_664_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_669_ = (((i_664_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_670_ = (((i_664_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_664_ = (i_668_ | i_669_ | i_670_) >>> 8;
                                            int i_671_ = is_648_[i_647_];
                                            is_648_[i_647_] = (((((i_664_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_671_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_664_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_671_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_672_ = (((i_664_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_673_ = (((i_664_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_674_ = (((i_664_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_648_[i_647_] = (i_672_ | i_673_ | i_674_) >>> 8;
                                        }
                                    }
                                } else if (i_649_ == 3) {
                                    int i_675_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    int i_676_ = Class129_Sub3.anInt8565;
                                    int i_677_ = i_675_ + i_676_;
                                    int i_678_ = ((i_675_ & 0xff00ff) + (i_676_ & 0xff00ff));
                                    int i_679_ = ((i_678_ & 0x1000100) + (i_677_ - i_678_ & 0x10000));
                                    i_679_ = i_677_ - i_679_ | i_679_ - (i_679_ >>> 8);
                                    if (i_675_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_675_ = i_679_;
                                        i_679_ = is_648_[i_647_];
                                        i_679_ = (((((i_675_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_679_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_675_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_679_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_648_[i_647_] = i_679_;
                                } else if (i_649_ == 2) {
                                    int i_680_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    if (i_680_ != 0) {
                                        int i_681_ = (((i_680_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_682_ = (((i_680_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_648_[i_647_++] = (((i_681_ | i_682_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_650_ == 2) {
                                if (i_649_ == 1) {
                                    int i_683_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    if (i_683_ != 0) {
                                        int i_684_ = is_648_[i_647_];
                                        int i_685_ = i_683_ + i_684_;
                                        int i_686_ = ((i_683_ & 0xff00ff) + (i_684_ & 0xff00ff));
                                        i_684_ = ((i_686_ & 0x1000100) + (i_685_ - i_686_ & 0x10000));
                                        is_648_[i_647_] = (i_685_ - i_684_ | i_684_ - (i_684_ >>> 8));
                                    }
                                } else if (i_649_ == 0) {
                                    int i_687_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    if (i_687_ != 0) {
                                        int i_688_ = (((i_687_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_689_ = (((i_687_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_690_ = (((i_687_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_687_ = (i_688_ | i_689_ | i_690_) >>> 8;
                                        int i_691_ = is_648_[i_647_];
                                        int i_692_ = i_687_ + i_691_;
                                        int i_693_ = ((i_687_ & 0xff00ff) + (i_691_ & 0xff00ff));
                                        i_691_ = ((i_693_ & 0x1000100) + (i_692_ - i_693_ & 0x10000));
                                        is_648_[i_647_] = (i_692_ - i_691_ | i_691_ - (i_691_ >>> 8));
                                    }
                                } else if (i_649_ == 3) {
                                    int i_694_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    int i_695_ = Class129_Sub3.anInt8565;
                                    int i_696_ = i_694_ + i_695_;
                                    int i_697_ = ((i_694_ & 0xff00ff) + (i_695_ & 0xff00ff));
                                    int i_698_ = ((i_697_ & 0x1000100) + (i_696_ - i_697_ & 0x10000));
                                    i_694_ = i_696_ - i_698_ | i_698_ - (i_698_ >>> 8);
                                    i_698_ = is_648_[i_647_];
                                    i_696_ = i_694_ + i_698_;
                                    i_697_ = (i_694_ & 0xff00ff) + (i_698_ & 0xff00ff);
                                    i_698_ = ((i_697_ & 0x1000100) + (i_696_ - i_697_ & 0x10000));
                                    is_648_[i_647_] = i_696_ - i_698_ | i_698_ - (i_698_ >>> 8);
                                } else if (i_649_ == 2) {
                                    int i_699_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_646_]);
                                    if (i_699_ != 0) {
                                        int i_700_ = (((i_699_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_701_ = (((i_699_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_699_ = (((i_700_ | i_701_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_702_ = is_648_[i_647_];
                                        int i_703_ = i_699_ + i_702_;
                                        int i_704_ = ((i_699_ & 0xff00ff) + (i_702_ & 0xff00ff));
                                        i_702_ = ((i_704_ & 0x1000100) + (i_703_ - i_704_ & 0x10000));
                                        is_648_[i_647_] = (i_703_ - i_702_ | i_702_ - (i_702_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_642_ += Class129_Sub3.anInt8557;
                        }
                    }
                    i_640_++;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_705_ = Class129_Sub3.anInt8577;
                while (i_705_ < 0) {
                    int i_706_ = Class129_Sub3.anInt8550;
                    int i_707_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_708_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_709_ = Class129_Sub3.anInt8549;
                    int i_710_;
                    if ((i_710_ = i_707_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                        i_710_ = ((Class129_Sub3.anInt8557 - i_710_) / Class129_Sub3.anInt8557);
                        i_709_ += i_710_;
                        i_707_ += Class129_Sub3.anInt8557 * i_710_;
                        i_708_ += Class129_Sub3.anInt8564 * i_710_;
                        i_706_ += i_710_;
                    }
                    if ((i_710_ = ((i_707_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_709_)
                        i_709_ = i_710_;
                    if ((i_710_ = i_708_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                        i_710_ = ((Class129_Sub3.anInt8564 - i_710_) / Class129_Sub3.anInt8564);
                        i_709_ += i_710_;
                        i_707_ += Class129_Sub3.anInt8557 * i_710_;
                        i_708_ += Class129_Sub3.anInt8564 * i_710_;
                        i_706_ += i_710_;
                    }
                    if ((i_710_ = ((i_708_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_709_)
                        i_709_ = i_710_;
                    for (/**/; i_709_ < 0; i_709_++) {
                        int i_711_ = (((i_708_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_707_ >> 12));
                        int i_712_ = i_706_++;
                        int[] is_713_ = is;
                        int i_714_ = i;
                        int i_715_ = i_444_;
                        if (i_715_ == 0) {
                            if (i_714_ == 1)
                                is_713_[i_712_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                            else if (i_714_ == 0) {
                                int i_716_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_++]);
                                int i_717_ = (((i_716_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_718_ = (((i_716_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_719_ = (((i_716_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_713_[i_712_] = (i_717_ | i_718_ | i_719_) >>> 8;
                            } else if (i_714_ == 3) {
                                int i_720_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_++]);
                                int i_721_ = Class129_Sub3.anInt8565;
                                int i_722_ = i_720_ + i_721_;
                                int i_723_ = ((i_720_ & 0xff00ff) + (i_721_ & 0xff00ff));
                                int i_724_ = ((i_723_ & 0x1000100) + (i_722_ - i_723_ & 0x10000));
                                is_713_[i_712_] = i_722_ - i_724_ | i_724_ - (i_724_ >>> 8);
                            } else if (i_714_ == 2) {
                                int i_725_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                int i_726_ = (((i_725_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_727_ = (((i_725_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_713_[i_712_] = (((i_726_ | i_727_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_715_ == 1) {
                            if (i_714_ == 1) {
                                int i_728_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                if (i_728_ != 0)
                                    is_713_[i_712_] = i_728_;
                            } else if (i_714_ == 0) {
                                int i_729_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                if (i_729_ != 0) {
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_730_ = Class129_Sub3.anInt8565 >>> 24;
                                        int i_731_ = 256 - i_730_;
                                        int i_732_ = is_713_[i_712_];
                                        is_713_[i_712_] = ((((i_729_ & 0xff00ff) * i_730_ + ((i_732_ & 0xff00ff) * i_731_)) & ~0xff00ff) + (((i_729_ & 0xff00) * i_730_ + ((i_732_ & 0xff00) * i_731_)) & 0xff0000)) >> 8;
                                    } else if (Class129_Sub3.anInt8567 != 255) {
                                        int i_733_ = (((i_729_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_734_ = (((i_729_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_735_ = (((i_729_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_729_ = (i_733_ | i_734_ | i_735_) >>> 8;
                                        int i_736_ = is_713_[i_712_];
                                        is_713_[i_712_] = (((((i_729_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_736_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_729_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_736_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    } else {
                                        int i_737_ = (((i_729_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_738_ = (((i_729_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_739_ = (((i_729_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_713_[i_712_] = (i_737_ | i_738_ | i_739_) >>> 8;
                                    }
                                }
                            } else if (i_714_ == 3) {
                                int i_740_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                int i_741_ = Class129_Sub3.anInt8565;
                                int i_742_ = i_740_ + i_741_;
                                int i_743_ = ((i_740_ & 0xff00ff) + (i_741_ & 0xff00ff));
                                int i_744_ = ((i_743_ & 0x1000100) + (i_742_ - i_743_ & 0x10000));
                                i_744_ = i_742_ - i_744_ | i_744_ - (i_744_ >>> 8);
                                if (i_740_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_740_ = i_744_;
                                    i_744_ = is_713_[i_712_];
                                    i_744_ = (((((i_740_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_744_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_740_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_744_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_713_[i_712_] = i_744_;
                            } else if (i_714_ == 2) {
                                int i_745_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                if (i_745_ != 0) {
                                    int i_746_ = (((i_745_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_747_ = (((i_745_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_713_[i_712_++] = (((i_746_ | i_747_) >>> 8) + Class129_Sub3.anInt8553);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_715_ == 2) {
                            if (i_714_ == 1) {
                                int i_748_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                if (i_748_ != 0) {
                                    int i_749_ = is_713_[i_712_];
                                    int i_750_ = i_748_ + i_749_;
                                    int i_751_ = ((i_748_ & 0xff00ff) + (i_749_ & 0xff00ff));
                                    i_749_ = ((i_751_ & 0x1000100) + (i_750_ - i_751_ & 0x10000));
                                    is_713_[i_712_] = i_750_ - i_749_ | i_749_ - (i_749_ >>> 8);
                                }
                            } else if (i_714_ == 0) {
                                int i_752_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                if (i_752_ != 0) {
                                    int i_753_ = (((i_752_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_754_ = (((i_752_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_755_ = (((i_752_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_752_ = (i_753_ | i_754_ | i_755_) >>> 8;
                                    int i_756_ = is_713_[i_712_];
                                    int i_757_ = i_752_ + i_756_;
                                    int i_758_ = ((i_752_ & 0xff00ff) + (i_756_ & 0xff00ff));
                                    i_756_ = ((i_758_ & 0x1000100) + (i_757_ - i_758_ & 0x10000));
                                    is_713_[i_712_] = i_757_ - i_756_ | i_756_ - (i_756_ >>> 8);
                                }
                            } else if (i_714_ == 3) {
                                int i_759_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                int i_760_ = Class129_Sub3.anInt8565;
                                int i_761_ = i_759_ + i_760_;
                                int i_762_ = ((i_759_ & 0xff00ff) + (i_760_ & 0xff00ff));
                                int i_763_ = ((i_762_ & 0x1000100) + (i_761_ - i_762_ & 0x10000));
                                i_759_ = i_761_ - i_763_ | i_763_ - (i_763_ >>> 8);
                                i_763_ = is_713_[i_712_];
                                i_761_ = i_759_ + i_763_;
                                i_762_ = (i_759_ & 0xff00ff) + (i_763_ & 0xff00ff);
                                i_763_ = (i_762_ & 0x1000100) + (i_761_ - i_762_ & 0x10000);
                                is_713_[i_712_] = i_761_ - i_763_ | i_763_ - (i_763_ >>> 8);
                            } else if (i_714_ == 2) {
                                int i_764_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_711_]);
                                if (i_764_ != 0) {
                                    int i_765_ = (((i_764_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_766_ = (((i_764_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_764_ = (((i_765_ | i_766_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_767_ = is_713_[i_712_];
                                    int i_768_ = i_764_ + i_767_;
                                    int i_769_ = ((i_764_ & 0xff00ff) + (i_767_ & 0xff00ff));
                                    i_767_ = ((i_769_ & 0x1000100) + (i_768_ - i_769_ & 0x10000));
                                    is_713_[i_712_] = i_768_ - i_767_ | i_767_ - (i_767_ >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_707_ += Class129_Sub3.anInt8557;
                        i_708_ += Class129_Sub3.anInt8564;
                    }
                    i_705_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_770_ = Class129_Sub3.anInt8577;
                while (i_770_ < 0) {
                    int i_771_ = Class129_Sub3.anInt8550;
                    int i_772_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_773_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_774_ = Class129_Sub3.anInt8549;
                    int i_775_;
                    if ((i_775_ = i_772_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                        i_775_ = ((Class129_Sub3.anInt8557 - i_775_) / Class129_Sub3.anInt8557);
                        i_774_ += i_775_;
                        i_772_ += Class129_Sub3.anInt8557 * i_775_;
                        i_773_ += Class129_Sub3.anInt8564 * i_775_;
                        i_771_ += i_775_;
                    }
                    if ((i_775_ = ((i_772_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_774_)
                        i_774_ = i_775_;
                    if (i_773_ < 0) {
                        i_775_ = ((Class129_Sub3.anInt8564 - 1 - i_773_) / Class129_Sub3.anInt8564);
                        i_774_ += i_775_;
                        i_772_ += Class129_Sub3.anInt8557 * i_775_;
                        i_773_ += Class129_Sub3.anInt8564 * i_775_;
                        i_771_ += i_775_;
                    }
                    if ((i_775_ = ((1 + i_773_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_774_)
                        i_774_ = i_775_;
                    for (/**/; i_774_ < 0; i_774_++) {
                        int i_776_ = (((i_773_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_772_ >> 12));
                        int i_777_ = i_771_++;
                        int[] is_778_ = is;
                        int i_779_ = i;
                        int i_780_ = i_444_;
                        if (i_780_ == 0) {
                            if (i_779_ == 1)
                                is_778_[i_777_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                            else if (i_779_ == 0) {
                                int i_781_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_++]);
                                int i_782_ = (((i_781_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_783_ = (((i_781_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_784_ = (((i_781_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_778_[i_777_] = (i_782_ | i_783_ | i_784_) >>> 8;
                            } else if (i_779_ == 3) {
                                int i_785_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_++]);
                                int i_786_ = Class129_Sub3.anInt8565;
                                int i_787_ = i_785_ + i_786_;
                                int i_788_ = ((i_785_ & 0xff00ff) + (i_786_ & 0xff00ff));
                                int i_789_ = ((i_788_ & 0x1000100) + (i_787_ - i_788_ & 0x10000));
                                is_778_[i_777_] = i_787_ - i_789_ | i_789_ - (i_789_ >>> 8);
                            } else if (i_779_ == 2) {
                                int i_790_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                int i_791_ = (((i_790_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_792_ = (((i_790_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_778_[i_777_] = (((i_791_ | i_792_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_780_ == 1) {
                            if (i_779_ == 1) {
                                int i_793_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                if (i_793_ != 0)
                                    is_778_[i_777_] = i_793_;
                            } else if (i_779_ == 0) {
                                int i_794_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                if (i_794_ != 0) {
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_795_ = Class129_Sub3.anInt8565 >>> 24;
                                        int i_796_ = 256 - i_795_;
                                        int i_797_ = is_778_[i_777_];
                                        is_778_[i_777_] = ((((i_794_ & 0xff00ff) * i_795_ + ((i_797_ & 0xff00ff) * i_796_)) & ~0xff00ff) + (((i_794_ & 0xff00) * i_795_ + ((i_797_ & 0xff00) * i_796_)) & 0xff0000)) >> 8;
                                    } else if (Class129_Sub3.anInt8567 != 255) {
                                        int i_798_ = (((i_794_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_799_ = (((i_794_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_800_ = (((i_794_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_794_ = (i_798_ | i_799_ | i_800_) >>> 8;
                                        int i_801_ = is_778_[i_777_];
                                        is_778_[i_777_] = (((((i_794_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_801_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_794_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_801_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    } else {
                                        int i_802_ = (((i_794_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_803_ = (((i_794_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_804_ = (((i_794_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_778_[i_777_] = (i_802_ | i_803_ | i_804_) >>> 8;
                                    }
                                }
                            } else if (i_779_ == 3) {
                                int i_805_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                int i_806_ = Class129_Sub3.anInt8565;
                                int i_807_ = i_805_ + i_806_;
                                int i_808_ = ((i_805_ & 0xff00ff) + (i_806_ & 0xff00ff));
                                int i_809_ = ((i_808_ & 0x1000100) + (i_807_ - i_808_ & 0x10000));
                                i_809_ = i_807_ - i_809_ | i_809_ - (i_809_ >>> 8);
                                if (i_805_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_805_ = i_809_;
                                    i_809_ = is_778_[i_777_];
                                    i_809_ = (((((i_805_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_809_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_805_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_809_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_778_[i_777_] = i_809_;
                            } else if (i_779_ == 2) {
                                int i_810_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                if (i_810_ != 0) {
                                    int i_811_ = (((i_810_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_812_ = (((i_810_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_778_[i_777_++] = (((i_811_ | i_812_) >>> 8) + Class129_Sub3.anInt8553);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_780_ == 2) {
                            if (i_779_ == 1) {
                                int i_813_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                if (i_813_ != 0) {
                                    int i_814_ = is_778_[i_777_];
                                    int i_815_ = i_813_ + i_814_;
                                    int i_816_ = ((i_813_ & 0xff00ff) + (i_814_ & 0xff00ff));
                                    i_814_ = ((i_816_ & 0x1000100) + (i_815_ - i_816_ & 0x10000));
                                    is_778_[i_777_] = i_815_ - i_814_ | i_814_ - (i_814_ >>> 8);
                                }
                            } else if (i_779_ == 0) {
                                int i_817_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                if (i_817_ != 0) {
                                    int i_818_ = (((i_817_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_819_ = (((i_817_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_820_ = (((i_817_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_817_ = (i_818_ | i_819_ | i_820_) >>> 8;
                                    int i_821_ = is_778_[i_777_];
                                    int i_822_ = i_817_ + i_821_;
                                    int i_823_ = ((i_817_ & 0xff00ff) + (i_821_ & 0xff00ff));
                                    i_821_ = ((i_823_ & 0x1000100) + (i_822_ - i_823_ & 0x10000));
                                    is_778_[i_777_] = i_822_ - i_821_ | i_821_ - (i_821_ >>> 8);
                                }
                            } else if (i_779_ == 3) {
                                int i_824_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                int i_825_ = Class129_Sub3.anInt8565;
                                int i_826_ = i_824_ + i_825_;
                                int i_827_ = ((i_824_ & 0xff00ff) + (i_825_ & 0xff00ff));
                                int i_828_ = ((i_827_ & 0x1000100) + (i_826_ - i_827_ & 0x10000));
                                i_824_ = i_826_ - i_828_ | i_828_ - (i_828_ >>> 8);
                                i_828_ = is_778_[i_777_];
                                i_826_ = i_824_ + i_828_;
                                i_827_ = (i_824_ & 0xff00ff) + (i_828_ & 0xff00ff);
                                i_828_ = (i_827_ & 0x1000100) + (i_826_ - i_827_ & 0x10000);
                                is_778_[i_777_] = i_826_ - i_828_ | i_828_ - (i_828_ >>> 8);
                            } else if (i_779_ == 2) {
                                int i_829_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_776_]);
                                if (i_829_ != 0) {
                                    int i_830_ = (((i_829_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_831_ = (((i_829_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_829_ = (((i_830_ | i_831_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_832_ = is_778_[i_777_];
                                    int i_833_ = i_829_ + i_832_;
                                    int i_834_ = ((i_829_ & 0xff00ff) + (i_832_ & 0xff00ff));
                                    i_832_ = ((i_834_ & 0x1000100) + (i_833_ - i_834_ & 0x10000));
                                    is_778_[i_777_] = i_833_ - i_832_ | i_832_ - (i_832_ >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_772_ += Class129_Sub3.anInt8557;
                        i_773_ += Class129_Sub3.anInt8564;
                    }
                    i_770_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8564 == 0) {
            int i_835_ = Class129_Sub3.anInt8577;
            while (i_835_ < 0) {
                int i_836_ = Class129_Sub3.anInt8550;
                int i_837_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_838_ = Class129_Sub3.anInt8561;
                int i_839_ = Class129_Sub3.anInt8549;
                if (i_838_ >= 0 && i_838_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                    if (i_837_ < 0) {
                        int i_840_ = ((Class129_Sub3.anInt8557 - 1 - i_837_) / Class129_Sub3.anInt8557);
                        i_839_ += i_840_;
                        i_837_ += Class129_Sub3.anInt8557 * i_840_;
                        i_836_ += i_840_;
                    }
                    int i_841_;
                    if ((i_841_ = ((1 + i_837_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_839_)
                        i_839_ = i_841_;
                    for (/**/; i_839_ < 0; i_839_++) {
                        int i_842_ = (((i_838_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_837_ >> 12));
                        int i_843_ = i_836_++;
                        int[] is_844_ = is;
                        int i_845_ = i;
                        int i_846_ = i_444_;
                        if (i_846_ == 0) {
                            if (i_845_ == 1)
                                is_844_[i_843_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                            else if (i_845_ == 0) {
                                int i_847_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_++]);
                                int i_848_ = (((i_847_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_849_ = (((i_847_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_850_ = (((i_847_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_844_[i_843_] = (i_848_ | i_849_ | i_850_) >>> 8;
                            } else if (i_845_ == 3) {
                                int i_851_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_++]);
                                int i_852_ = Class129_Sub3.anInt8565;
                                int i_853_ = i_851_ + i_852_;
                                int i_854_ = ((i_851_ & 0xff00ff) + (i_852_ & 0xff00ff));
                                int i_855_ = ((i_854_ & 0x1000100) + (i_853_ - i_854_ & 0x10000));
                                is_844_[i_843_] = i_853_ - i_855_ | i_855_ - (i_855_ >>> 8);
                            } else if (i_845_ == 2) {
                                int i_856_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                int i_857_ = (((i_856_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_858_ = (((i_856_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_844_[i_843_] = (((i_857_ | i_858_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_846_ == 1) {
                            if (i_845_ == 1) {
                                int i_859_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                if (i_859_ != 0)
                                    is_844_[i_843_] = i_859_;
                            } else if (i_845_ == 0) {
                                int i_860_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                if (i_860_ != 0) {
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_861_ = Class129_Sub3.anInt8565 >>> 24;
                                        int i_862_ = 256 - i_861_;
                                        int i_863_ = is_844_[i_843_];
                                        is_844_[i_843_] = ((((i_860_ & 0xff00ff) * i_861_ + ((i_863_ & 0xff00ff) * i_862_)) & ~0xff00ff) + (((i_860_ & 0xff00) * i_861_ + ((i_863_ & 0xff00) * i_862_)) & 0xff0000)) >> 8;
                                    } else if (Class129_Sub3.anInt8567 != 255) {
                                        int i_864_ = (((i_860_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_865_ = (((i_860_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_866_ = (((i_860_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_860_ = (i_864_ | i_865_ | i_866_) >>> 8;
                                        int i_867_ = is_844_[i_843_];
                                        is_844_[i_843_] = (((((i_860_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_867_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_860_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_867_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    } else {
                                        int i_868_ = (((i_860_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_869_ = (((i_860_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_870_ = (((i_860_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_844_[i_843_] = (i_868_ | i_869_ | i_870_) >>> 8;
                                    }
                                }
                            } else if (i_845_ == 3) {
                                int i_871_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                int i_872_ = Class129_Sub3.anInt8565;
                                int i_873_ = i_871_ + i_872_;
                                int i_874_ = ((i_871_ & 0xff00ff) + (i_872_ & 0xff00ff));
                                int i_875_ = ((i_874_ & 0x1000100) + (i_873_ - i_874_ & 0x10000));
                                i_875_ = i_873_ - i_875_ | i_875_ - (i_875_ >>> 8);
                                if (i_871_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_871_ = i_875_;
                                    i_875_ = is_844_[i_843_];
                                    i_875_ = (((((i_871_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_875_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_871_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_875_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_844_[i_843_] = i_875_;
                            } else if (i_845_ == 2) {
                                int i_876_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                if (i_876_ != 0) {
                                    int i_877_ = (((i_876_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_878_ = (((i_876_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_844_[i_843_++] = (((i_877_ | i_878_) >>> 8) + Class129_Sub3.anInt8553);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_846_ == 2) {
                            if (i_845_ == 1) {
                                int i_879_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                if (i_879_ != 0) {
                                    int i_880_ = is_844_[i_843_];
                                    int i_881_ = i_879_ + i_880_;
                                    int i_882_ = ((i_879_ & 0xff00ff) + (i_880_ & 0xff00ff));
                                    i_880_ = ((i_882_ & 0x1000100) + (i_881_ - i_882_ & 0x10000));
                                    is_844_[i_843_] = i_881_ - i_880_ | i_880_ - (i_880_ >>> 8);
                                }
                            } else if (i_845_ == 0) {
                                int i_883_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                if (i_883_ != 0) {
                                    int i_884_ = (((i_883_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_885_ = (((i_883_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_886_ = (((i_883_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_883_ = (i_884_ | i_885_ | i_886_) >>> 8;
                                    int i_887_ = is_844_[i_843_];
                                    int i_888_ = i_883_ + i_887_;
                                    int i_889_ = ((i_883_ & 0xff00ff) + (i_887_ & 0xff00ff));
                                    i_887_ = ((i_889_ & 0x1000100) + (i_888_ - i_889_ & 0x10000));
                                    is_844_[i_843_] = i_888_ - i_887_ | i_887_ - (i_887_ >>> 8);
                                }
                            } else if (i_845_ == 3) {
                                int i_890_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                int i_891_ = Class129_Sub3.anInt8565;
                                int i_892_ = i_890_ + i_891_;
                                int i_893_ = ((i_890_ & 0xff00ff) + (i_891_ & 0xff00ff));
                                int i_894_ = ((i_893_ & 0x1000100) + (i_892_ - i_893_ & 0x10000));
                                i_890_ = i_892_ - i_894_ | i_894_ - (i_894_ >>> 8);
                                i_894_ = is_844_[i_843_];
                                i_892_ = i_890_ + i_894_;
                                i_893_ = (i_890_ & 0xff00ff) + (i_894_ & 0xff00ff);
                                i_894_ = (i_893_ & 0x1000100) + (i_892_ - i_893_ & 0x10000);
                                is_844_[i_843_] = i_892_ - i_894_ | i_894_ - (i_894_ >>> 8);
                            } else if (i_845_ == 2) {
                                int i_895_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_842_]);
                                if (i_895_ != 0) {
                                    int i_896_ = (((i_895_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_897_ = (((i_895_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_895_ = (((i_896_ | i_897_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_898_ = is_844_[i_843_];
                                    int i_899_ = i_895_ + i_898_;
                                    int i_900_ = ((i_895_ & 0xff00ff) + (i_898_ & 0xff00ff));
                                    i_898_ = ((i_900_ & 0x1000100) + (i_899_ - i_900_ & 0x10000));
                                    is_844_[i_843_] = i_899_ - i_898_ | i_898_ - (i_898_ >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_837_ += Class129_Sub3.anInt8557;
                    }
                }
                i_835_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else if (Class129_Sub3.anInt8564 < 0) {
            for (int i_901_ = Class129_Sub3.anInt8577; i_901_ < 0; i_901_++) {
                int i_902_ = Class129_Sub3.anInt8550;
                int i_903_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_904_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                int i_905_ = Class129_Sub3.anInt8549;
                if (i_903_ < 0) {
                    int i_906_ = ((Class129_Sub3.anInt8557 - 1 - i_903_) / Class129_Sub3.anInt8557);
                    i_905_ += i_906_;
                    i_903_ += Class129_Sub3.anInt8557 * i_906_;
                    i_904_ += Class129_Sub3.anInt8564 * i_906_;
                    i_902_ += i_906_;
                }
                int i_907_;
                if ((i_907_ = (1 + i_903_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557) > i_905_)
                    i_905_ = i_907_;
                if ((i_907_ = i_904_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                    i_907_ = ((Class129_Sub3.anInt8564 - i_907_) / Class129_Sub3.anInt8564);
                    i_905_ += i_907_;
                    i_903_ += Class129_Sub3.anInt8557 * i_907_;
                    i_904_ += Class129_Sub3.anInt8564 * i_907_;
                    i_902_ += i_907_;
                }
                if ((i_907_ = ((i_904_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_905_)
                    i_905_ = i_907_;
                for (/**/; i_905_ < 0; i_905_++) {
                    int i_908_ = ((i_904_ >> 12) * ((Class129_Sub3) this).anInt8548 + (i_903_ >> 12));
                    int i_909_ = i_902_++;
                    int[] is_910_ = is;
                    int i_911_ = i;
                    int i_912_ = i_444_;
                    if (i_912_ == 0) {
                        if (i_911_ == 1)
                            is_910_[i_909_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                        else if (i_911_ == 0) {
                            int i_913_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_++]);
                            int i_914_ = (((i_913_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_915_ = ((i_913_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_916_ = ((i_913_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            is_910_[i_909_] = (i_914_ | i_915_ | i_916_) >>> 8;
                        } else if (i_911_ == 3) {
                            int i_917_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_++]);
                            int i_918_ = Class129_Sub3.anInt8565;
                            int i_919_ = i_917_ + i_918_;
                            int i_920_ = (i_917_ & 0xff00ff) + (i_918_ & 0xff00ff);
                            int i_921_ = ((i_920_ & 0x1000100) + (i_919_ - i_920_ & 0x10000));
                            is_910_[i_909_] = i_919_ - i_921_ | i_921_ - (i_921_ >>> 8);
                        } else if (i_911_ == 2) {
                            int i_922_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            int i_923_ = (((i_922_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_924_ = ((i_922_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            is_910_[i_909_] = (((i_923_ | i_924_) >>> 8) + Class129_Sub3.anInt8553);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_912_ == 1) {
                        if (i_911_ == 1) {
                            int i_925_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            if (i_925_ != 0)
                                is_910_[i_909_] = i_925_;
                        } else if (i_911_ == 0) {
                            int i_926_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            if (i_926_ != 0) {
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_927_ = Class129_Sub3.anInt8565 >>> 24;
                                    int i_928_ = 256 - i_927_;
                                    int i_929_ = is_910_[i_909_];
                                    is_910_[i_909_] = ((((i_926_ & 0xff00ff) * i_927_ + (i_929_ & 0xff00ff) * i_928_) & ~0xff00ff) + (((i_926_ & 0xff00) * i_927_ + (i_929_ & 0xff00) * i_928_) & 0xff0000)) >> 8;
                                } else if (Class129_Sub3.anInt8567 != 255) {
                                    int i_930_ = (((i_926_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_931_ = (((i_926_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_932_ = (((i_926_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_926_ = (i_930_ | i_931_ | i_932_) >>> 8;
                                    int i_933_ = is_910_[i_909_];
                                    is_910_[i_909_] = (((((i_926_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_933_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_926_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_933_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                } else {
                                    int i_934_ = (((i_926_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_935_ = (((i_926_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_936_ = (((i_926_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_910_[i_909_] = (i_934_ | i_935_ | i_936_) >>> 8;
                                }
                            }
                        } else if (i_911_ == 3) {
                            int i_937_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            int i_938_ = Class129_Sub3.anInt8565;
                            int i_939_ = i_937_ + i_938_;
                            int i_940_ = (i_937_ & 0xff00ff) + (i_938_ & 0xff00ff);
                            int i_941_ = ((i_940_ & 0x1000100) + (i_939_ - i_940_ & 0x10000));
                            i_941_ = i_939_ - i_941_ | i_941_ - (i_941_ >>> 8);
                            if (i_937_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                i_937_ = i_941_;
                                i_941_ = is_910_[i_909_];
                                i_941_ = (((((i_937_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_941_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_937_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_941_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                            }
                            is_910_[i_909_] = i_941_;
                        } else if (i_911_ == 2) {
                            int i_942_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            if (i_942_ != 0) {
                                int i_943_ = (((i_942_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_944_ = (((i_942_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_910_[i_909_++] = (((i_943_ | i_944_) >>> 8) + Class129_Sub3.anInt8553);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_912_ == 2) {
                        if (i_911_ == 1) {
                            int i_945_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            if (i_945_ != 0) {
                                int i_946_ = is_910_[i_909_];
                                int i_947_ = i_945_ + i_946_;
                                int i_948_ = ((i_945_ & 0xff00ff) + (i_946_ & 0xff00ff));
                                i_946_ = (i_948_ & 0x1000100) + (i_947_ - i_948_ & 0x10000);
                                is_910_[i_909_] = i_947_ - i_946_ | i_946_ - (i_946_ >>> 8);
                            }
                        } else if (i_911_ == 0) {
                            int i_949_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            if (i_949_ != 0) {
                                int i_950_ = (((i_949_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_951_ = (((i_949_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_952_ = (((i_949_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_949_ = (i_950_ | i_951_ | i_952_) >>> 8;
                                int i_953_ = is_910_[i_909_];
                                int i_954_ = i_949_ + i_953_;
                                int i_955_ = ((i_949_ & 0xff00ff) + (i_953_ & 0xff00ff));
                                i_953_ = (i_955_ & 0x1000100) + (i_954_ - i_955_ & 0x10000);
                                is_910_[i_909_] = i_954_ - i_953_ | i_953_ - (i_953_ >>> 8);
                            }
                        } else if (i_911_ == 3) {
                            int i_956_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            int i_957_ = Class129_Sub3.anInt8565;
                            int i_958_ = i_956_ + i_957_;
                            int i_959_ = (i_956_ & 0xff00ff) + (i_957_ & 0xff00ff);
                            int i_960_ = ((i_959_ & 0x1000100) + (i_958_ - i_959_ & 0x10000));
                            i_956_ = i_958_ - i_960_ | i_960_ - (i_960_ >>> 8);
                            i_960_ = is_910_[i_909_];
                            i_958_ = i_956_ + i_960_;
                            i_959_ = (i_956_ & 0xff00ff) + (i_960_ & 0xff00ff);
                            i_960_ = (i_959_ & 0x1000100) + (i_958_ - i_959_ & 0x10000);
                            is_910_[i_909_] = i_958_ - i_960_ | i_960_ - (i_960_ >>> 8);
                        } else if (i_911_ == 2) {
                            int i_961_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_908_]);
                            if (i_961_ != 0) {
                                int i_962_ = (((i_961_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_963_ = (((i_961_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_961_ = (((i_962_ | i_963_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_964_ = is_910_[i_909_];
                                int i_965_ = i_961_ + i_964_;
                                int i_966_ = ((i_961_ & 0xff00ff) + (i_964_ & 0xff00ff));
                                i_964_ = (i_966_ & 0x1000100) + (i_965_ - i_966_ & 0x10000);
                                is_910_[i_909_] = i_965_ - i_964_ | i_964_ - (i_964_ >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_903_ += Class129_Sub3.anInt8557;
                    i_904_ += Class129_Sub3.anInt8564;
                }
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else {
            for (int i_967_ = Class129_Sub3.anInt8577; i_967_ < 0; i_967_++) {
                int i_968_ = Class129_Sub3.anInt8550;
                int i_969_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_970_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                int i_971_ = Class129_Sub3.anInt8549;
                if (i_969_ < 0) {
                    int i_972_ = ((Class129_Sub3.anInt8557 - 1 - i_969_) / Class129_Sub3.anInt8557);
                    i_971_ += i_972_;
                    i_969_ += Class129_Sub3.anInt8557 * i_972_;
                    i_970_ += Class129_Sub3.anInt8564 * i_972_;
                    i_968_ += i_972_;
                }
                int i_973_;
                if ((i_973_ = (1 + i_969_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557) > i_971_)
                    i_971_ = i_973_;
                if (i_970_ < 0) {
                    i_973_ = ((Class129_Sub3.anInt8564 - 1 - i_970_) / Class129_Sub3.anInt8564);
                    i_971_ += i_973_;
                    i_969_ += Class129_Sub3.anInt8557 * i_973_;
                    i_970_ += Class129_Sub3.anInt8564 * i_973_;
                    i_968_ += i_973_;
                }
                if ((i_973_ = (1 + i_970_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564) > i_971_)
                    i_971_ = i_973_;
                for (/**/; i_971_ < 0; i_971_++) {
                    int i_974_ = ((i_970_ >> 12) * ((Class129_Sub3) this).anInt8548 + (i_969_ >> 12));
                    int i_975_ = i_968_++;
                    int[] is_976_ = is;
                    int i_977_ = i;
                    int i_978_ = i_444_;
                    if (i_978_ == 0) {
                        if (i_977_ == 1)
                            is_976_[i_975_] = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                        else if (i_977_ == 0) {
                            int i_979_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_++]);
                            int i_980_ = (((i_979_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_981_ = ((i_979_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_982_ = ((i_979_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            is_976_[i_975_] = (i_980_ | i_981_ | i_982_) >>> 8;
                        } else if (i_977_ == 3) {
                            int i_983_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_++]);
                            int i_984_ = Class129_Sub3.anInt8565;
                            int i_985_ = i_983_ + i_984_;
                            int i_986_ = (i_983_ & 0xff00ff) + (i_984_ & 0xff00ff);
                            int i_987_ = ((i_986_ & 0x1000100) + (i_985_ - i_986_ & 0x10000));
                            is_976_[i_975_] = i_985_ - i_987_ | i_987_ - (i_987_ >>> 8);
                        } else if (i_977_ == 2) {
                            int i_988_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            int i_989_ = (((i_988_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_990_ = ((i_988_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            is_976_[i_975_] = (((i_989_ | i_990_) >>> 8) + Class129_Sub3.anInt8553);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_978_ == 1) {
                        if (i_977_ == 1) {
                            int i_991_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            if (i_991_ != 0)
                                is_976_[i_975_] = i_991_;
                        } else if (i_977_ == 0) {
                            int i_992_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            if (i_992_ != 0) {
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_993_ = Class129_Sub3.anInt8565 >>> 24;
                                    int i_994_ = 256 - i_993_;
                                    int i_995_ = is_976_[i_975_];
                                    is_976_[i_975_] = ((((i_992_ & 0xff00ff) * i_993_ + (i_995_ & 0xff00ff) * i_994_) & ~0xff00ff) + (((i_992_ & 0xff00) * i_993_ + (i_995_ & 0xff00) * i_994_) & 0xff0000)) >> 8;
                                } else if (Class129_Sub3.anInt8567 != 255) {
                                    int i_996_ = (((i_992_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_997_ = (((i_992_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_998_ = (((i_992_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_992_ = (i_996_ | i_997_ | i_998_) >>> 8;
                                    int i_999_ = is_976_[i_975_];
                                    is_976_[i_975_] = (((((i_992_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_999_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_992_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_999_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                } else {
                                    int i_1000_ = (((i_992_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_1001_ = (((i_992_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_1002_ = (((i_992_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_976_[i_975_] = (i_1000_ | i_1001_ | i_1002_) >>> 8;
                                }
                            }
                        } else if (i_977_ == 3) {
                            int i_1003_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            int i_1004_ = Class129_Sub3.anInt8565;
                            int i_1005_ = i_1003_ + i_1004_;
                            int i_1006_ = (i_1003_ & 0xff00ff) + (i_1004_ & 0xff00ff);
                            int i_1007_ = ((i_1006_ & 0x1000100) + (i_1005_ - i_1006_ & 0x10000));
                            i_1007_ = i_1005_ - i_1007_ | i_1007_ - (i_1007_ >>> 8);
                            if (i_1003_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                i_1003_ = i_1007_;
                                i_1007_ = is_976_[i_975_];
                                i_1007_ = (((((i_1003_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1007_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1003_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1007_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                            }
                            is_976_[i_975_] = i_1007_;
                        } else if (i_977_ == 2) {
                            int i_1008_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            if (i_1008_ != 0) {
                                int i_1009_ = (((i_1008_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1010_ = (((i_1008_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_976_[i_975_++] = (((i_1009_ | i_1010_) >>> 8) + Class129_Sub3.anInt8553);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_978_ == 2) {
                        if (i_977_ == 1) {
                            int i_1011_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            if (i_1011_ != 0) {
                                int i_1012_ = is_976_[i_975_];
                                int i_1013_ = i_1011_ + i_1012_;
                                int i_1014_ = ((i_1011_ & 0xff00ff) + (i_1012_ & 0xff00ff));
                                i_1012_ = ((i_1014_ & 0x1000100) + (i_1013_ - i_1014_ & 0x10000));
                                is_976_[i_975_] = i_1013_ - i_1012_ | i_1012_ - (i_1012_ >>> 8);
                            }
                        } else if (i_977_ == 0) {
                            int i_1015_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            if (i_1015_ != 0) {
                                int i_1016_ = (((i_1015_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_1017_ = (((i_1015_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_1018_ = (((i_1015_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_1015_ = (i_1016_ | i_1017_ | i_1018_) >>> 8;
                                int i_1019_ = is_976_[i_975_];
                                int i_1020_ = i_1015_ + i_1019_;
                                int i_1021_ = ((i_1015_ & 0xff00ff) + (i_1019_ & 0xff00ff));
                                i_1019_ = ((i_1021_ & 0x1000100) + (i_1020_ - i_1021_ & 0x10000));
                                is_976_[i_975_] = i_1020_ - i_1019_ | i_1019_ - (i_1019_ >>> 8);
                            }
                        } else if (i_977_ == 3) {
                            int i_1022_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            int i_1023_ = Class129_Sub3.anInt8565;
                            int i_1024_ = i_1022_ + i_1023_;
                            int i_1025_ = (i_1022_ & 0xff00ff) + (i_1023_ & 0xff00ff);
                            int i_1026_ = ((i_1025_ & 0x1000100) + (i_1024_ - i_1025_ & 0x10000));
                            i_1022_ = i_1024_ - i_1026_ | i_1026_ - (i_1026_ >>> 8);
                            i_1026_ = is_976_[i_975_];
                            i_1024_ = i_1022_ + i_1026_;
                            i_1025_ = (i_1022_ & 0xff00ff) + (i_1026_ & 0xff00ff);
                            i_1026_ = (i_1025_ & 0x1000100) + (i_1024_ - i_1025_ & 0x10000);
                            is_976_[i_975_] = i_1024_ - i_1026_ | i_1026_ - (i_1026_ >>> 8);
                        } else if (i_977_ == 2) {
                            int i_1027_ = (((Class129_Sub3_Sub1) this).anIntArray9988[i_974_]);
                            if (i_1027_ != 0) {
                                int i_1028_ = (((i_1027_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1029_ = (((i_1027_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_1027_ = (((i_1028_ | i_1029_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_1030_ = is_976_[i_975_];
                                int i_1031_ = i_1027_ + i_1030_;
                                int i_1032_ = ((i_1027_ & 0xff00ff) + (i_1030_ & 0xff00ff));
                                i_1030_ = ((i_1032_ & 0x1000100) + (i_1031_ - i_1032_ & 0x10000));
                                is_976_[i_975_] = i_1031_ - i_1030_ | i_1030_ - (i_1030_ >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_969_ += Class129_Sub3.anInt8557;
                    i_970_ += Class129_Sub3.anInt8564;
                }
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        }
    }

    final void method1194(int[] is, int[] is_1033_, int i, int i_1034_) {
        int[] is_1035_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        if (Class129_Sub3.anInt8557 == 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_1036_ = Class129_Sub3.anInt8577;
                while (i_1036_ < 0) {
                    int i_1037_ = i_1036_ + i_1034_;
                    if (i_1037_ >= 0) {
                        if (i_1037_ >= is.length)
                            break;
                        int i_1038_ = Class129_Sub3.anInt8550;
                        int i_1039_ = Class129_Sub3.anInt8558;
                        int i_1040_ = Class129_Sub3.anInt8561;
                        int i_1041_ = Class129_Sub3.anInt8549;
                        if (i_1039_ >= 0 && i_1040_ >= 0 && i_1039_ - (((Class129_Sub3) this).anInt8548 << 12) < 0 && i_1040_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                            int i_1042_ = is[i_1037_] - i;
                            int i_1043_ = -is_1033_[i_1037_];
                            int i_1044_ = (i_1042_ - (i_1038_ - Class129_Sub3.anInt8550));
                            if (i_1044_ > 0) {
                                i_1038_ += i_1044_;
                                i_1041_ += i_1044_;
                                i_1039_ += Class129_Sub3.anInt8557 * i_1044_;
                                i_1040_ += Class129_Sub3.anInt8564 * i_1044_;
                            } else
                                i_1043_ -= i_1044_;
                            if (i_1041_ < i_1043_)
                                i_1041_ = i_1043_;
                            for (/**/; i_1041_ < 0; i_1041_++) {
                                int i_1045_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1040_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1039_ >> 12))]);
                                if (i_1045_ != 0)
                                    is_1035_[i_1038_++] = i_1045_;
                                else
                                    i_1038_++;
                            }
                        }
                    }
                    i_1036_++;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_1046_ = Class129_Sub3.anInt8577;
                while (i_1046_ < 0) {
                    int i_1047_ = i_1046_ + i_1034_;
                    if (i_1047_ >= 0) {
                        if (i_1047_ >= is.length)
                            break;
                        int i_1048_ = Class129_Sub3.anInt8550;
                        int i_1049_ = Class129_Sub3.anInt8558;
                        int i_1050_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_1051_ = Class129_Sub3.anInt8549;
                        if (i_1049_ >= 0 && i_1049_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                            int i_1052_;
                            if ((i_1052_ = i_1050_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                                i_1052_ = ((Class129_Sub3.anInt8564 - i_1052_) / Class129_Sub3.anInt8564);
                                i_1051_ += i_1052_;
                                i_1050_ += Class129_Sub3.anInt8564 * i_1052_;
                                i_1048_ += i_1052_;
                            }
                            if ((i_1052_ = ((i_1050_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1051_)
                                i_1051_ = i_1052_;
                            int i_1053_ = is[i_1047_] - i;
                            int i_1054_ = -is_1033_[i_1047_];
                            int i_1055_ = (i_1053_ - (i_1048_ - Class129_Sub3.anInt8550));
                            if (i_1055_ > 0) {
                                i_1048_ += i_1055_;
                                i_1051_ += i_1055_;
                                i_1049_ += Class129_Sub3.anInt8557 * i_1055_;
                                i_1050_ += Class129_Sub3.anInt8564 * i_1055_;
                            } else
                                i_1054_ -= i_1055_;
                            if (i_1051_ < i_1054_)
                                i_1051_ = i_1054_;
                            for (/**/; i_1051_ < 0; i_1051_++) {
                                int i_1056_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1050_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1049_ >> 12))]);
                                if (i_1056_ != 0)
                                    is_1035_[i_1048_++] = i_1056_;
                                else
                                    i_1048_++;
                                i_1050_ += Class129_Sub3.anInt8564;
                            }
                        }
                    }
                    i_1046_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_1057_ = Class129_Sub3.anInt8577;
                while (i_1057_ < 0) {
                    int i_1058_ = i_1057_ + i_1034_;
                    if (i_1058_ >= 0) {
                        if (i_1058_ >= is.length)
                            break;
                        int i_1059_ = Class129_Sub3.anInt8550;
                        int i_1060_ = Class129_Sub3.anInt8558;
                        int i_1061_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_1062_ = Class129_Sub3.anInt8549;
                        if (i_1060_ >= 0 && i_1060_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                            if (i_1061_ < 0) {
                                int i_1063_ = ((Class129_Sub3.anInt8564 - 1 - i_1061_) / Class129_Sub3.anInt8564);
                                i_1062_ += i_1063_;
                                i_1061_ += Class129_Sub3.anInt8564 * i_1063_;
                                i_1059_ += i_1063_;
                            }
                            int i_1064_;
                            if ((i_1064_ = ((1 + i_1061_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1062_)
                                i_1062_ = i_1064_;
                            int i_1065_ = is[i_1058_] - i;
                            int i_1066_ = -is_1033_[i_1058_];
                            int i_1067_ = (i_1065_ - (i_1059_ - Class129_Sub3.anInt8550));
                            if (i_1067_ > 0) {
                                i_1059_ += i_1067_;
                                i_1062_ += i_1067_;
                                i_1060_ += Class129_Sub3.anInt8557 * i_1067_;
                                i_1061_ += Class129_Sub3.anInt8564 * i_1067_;
                            } else
                                i_1066_ -= i_1067_;
                            if (i_1062_ < i_1066_)
                                i_1062_ = i_1066_;
                            for (/**/; i_1062_ < 0; i_1062_++) {
                                int i_1068_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1061_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1060_ >> 12))]);
                                if (i_1068_ != 0)
                                    is_1035_[i_1059_++] = i_1068_;
                                else
                                    i_1059_++;
                                i_1061_ += Class129_Sub3.anInt8564;
                            }
                        }
                    }
                    i_1057_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8557 < 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_1069_ = Class129_Sub3.anInt8577;
                while (i_1069_ < 0) {
                    int i_1070_ = i_1069_ + i_1034_;
                    if (i_1070_ >= 0) {
                        if (i_1070_ >= is.length)
                            break;
                        int i_1071_ = Class129_Sub3.anInt8550;
                        int i_1072_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_1073_ = Class129_Sub3.anInt8561;
                        int i_1074_ = Class129_Sub3.anInt8549;
                        if (i_1073_ >= 0 && i_1073_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                            int i_1075_;
                            if ((i_1075_ = i_1072_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                                i_1075_ = ((Class129_Sub3.anInt8557 - i_1075_) / Class129_Sub3.anInt8557);
                                i_1074_ += i_1075_;
                                i_1072_ += Class129_Sub3.anInt8557 * i_1075_;
                                i_1071_ += i_1075_;
                            }
                            if ((i_1075_ = ((i_1072_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1074_)
                                i_1074_ = i_1075_;
                            int i_1076_ = is[i_1070_] - i;
                            int i_1077_ = -is_1033_[i_1070_];
                            int i_1078_ = (i_1076_ - (i_1071_ - Class129_Sub3.anInt8550));
                            if (i_1078_ > 0) {
                                i_1071_ += i_1078_;
                                i_1074_ += i_1078_;
                                i_1072_ += Class129_Sub3.anInt8557 * i_1078_;
                                i_1073_ += Class129_Sub3.anInt8564 * i_1078_;
                            } else
                                i_1077_ -= i_1078_;
                            if (i_1074_ < i_1077_)
                                i_1074_ = i_1077_;
                            for (/**/; i_1074_ < 0; i_1074_++) {
                                int i_1079_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1073_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1072_ >> 12))]);
                                if (i_1079_ != 0)
                                    is_1035_[i_1071_++] = i_1079_;
                                else
                                    i_1071_++;
                                i_1072_ += Class129_Sub3.anInt8557;
                            }
                        }
                    }
                    i_1069_++;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_1080_ = Class129_Sub3.anInt8577;
                while (i_1080_ < 0) {
                    int i_1081_ = i_1080_ + i_1034_;
                    if (i_1081_ >= 0) {
                        if (i_1081_ >= is.length)
                            break;
                        int i_1082_ = Class129_Sub3.anInt8550;
                        int i_1083_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_1084_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_1085_ = Class129_Sub3.anInt8549;
                        int i_1086_;
                        if ((i_1086_ = i_1083_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_1086_ = ((Class129_Sub3.anInt8557 - i_1086_) / Class129_Sub3.anInt8557);
                            i_1085_ += i_1086_;
                            i_1083_ += Class129_Sub3.anInt8557 * i_1086_;
                            i_1084_ += Class129_Sub3.anInt8564 * i_1086_;
                            i_1082_ += i_1086_;
                        }
                        if ((i_1086_ = ((i_1083_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1085_)
                            i_1085_ = i_1086_;
                        if ((i_1086_ = i_1084_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                            i_1086_ = ((Class129_Sub3.anInt8564 - i_1086_) / Class129_Sub3.anInt8564);
                            i_1085_ += i_1086_;
                            i_1083_ += Class129_Sub3.anInt8557 * i_1086_;
                            i_1084_ += Class129_Sub3.anInt8564 * i_1086_;
                            i_1082_ += i_1086_;
                        }
                        if ((i_1086_ = ((i_1084_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1085_)
                            i_1085_ = i_1086_;
                        int i_1087_ = is[i_1081_] - i;
                        int i_1088_ = -is_1033_[i_1081_];
                        int i_1089_ = i_1087_ - (i_1082_ - Class129_Sub3.anInt8550);
                        if (i_1089_ > 0) {
                            i_1082_ += i_1089_;
                            i_1085_ += i_1089_;
                            i_1083_ += Class129_Sub3.anInt8557 * i_1089_;
                            i_1084_ += Class129_Sub3.anInt8564 * i_1089_;
                        } else
                            i_1088_ -= i_1089_;
                        if (i_1085_ < i_1088_)
                            i_1085_ = i_1088_;
                        for (/**/; i_1085_ < 0; i_1085_++) {
                            int i_1090_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1084_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1083_ >> 12))]);
                            if (i_1090_ != 0)
                                is_1035_[i_1082_++] = i_1090_;
                            else
                                i_1082_++;
                            i_1083_ += Class129_Sub3.anInt8557;
                            i_1084_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_1080_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_1091_ = Class129_Sub3.anInt8577;
                while (i_1091_ < 0) {
                    int i_1092_ = i_1091_ + i_1034_;
                    if (i_1092_ >= 0) {
                        if (i_1092_ >= is.length)
                            break;
                        int i_1093_ = Class129_Sub3.anInt8550;
                        int i_1094_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_1095_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_1096_ = Class129_Sub3.anInt8549;
                        int i_1097_;
                        if ((i_1097_ = i_1094_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_1097_ = ((Class129_Sub3.anInt8557 - i_1097_) / Class129_Sub3.anInt8557);
                            i_1096_ += i_1097_;
                            i_1094_ += Class129_Sub3.anInt8557 * i_1097_;
                            i_1095_ += Class129_Sub3.anInt8564 * i_1097_;
                            i_1093_ += i_1097_;
                        }
                        if ((i_1097_ = ((i_1094_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1096_)
                            i_1096_ = i_1097_;
                        if (i_1095_ < 0) {
                            i_1097_ = ((Class129_Sub3.anInt8564 - 1 - i_1095_) / Class129_Sub3.anInt8564);
                            i_1096_ += i_1097_;
                            i_1094_ += Class129_Sub3.anInt8557 * i_1097_;
                            i_1095_ += Class129_Sub3.anInt8564 * i_1097_;
                            i_1093_ += i_1097_;
                        }
                        if ((i_1097_ = ((1 + i_1095_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1096_)
                            i_1096_ = i_1097_;
                        int i_1098_ = is[i_1092_] - i;
                        int i_1099_ = -is_1033_[i_1092_];
                        int i_1100_ = i_1098_ - (i_1093_ - Class129_Sub3.anInt8550);
                        if (i_1100_ > 0) {
                            i_1093_ += i_1100_;
                            i_1096_ += i_1100_;
                            i_1094_ += Class129_Sub3.anInt8557 * i_1100_;
                            i_1095_ += Class129_Sub3.anInt8564 * i_1100_;
                        } else
                            i_1099_ -= i_1100_;
                        if (i_1096_ < i_1099_)
                            i_1096_ = i_1099_;
                        for (/**/; i_1096_ < 0; i_1096_++) {
                            int i_1101_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1095_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1094_ >> 12))]);
                            if (i_1101_ != 0)
                                is_1035_[i_1093_++] = i_1101_;
                            else
                                i_1093_++;
                            i_1094_ += Class129_Sub3.anInt8557;
                            i_1095_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_1091_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8564 == 0) {
            int i_1102_ = Class129_Sub3.anInt8577;
            while (i_1102_ < 0) {
                int i_1103_ = i_1102_ + i_1034_;
                if (i_1103_ >= 0) {
                    if (i_1103_ >= is.length)
                        break;
                    int i_1104_ = Class129_Sub3.anInt8550;
                    int i_1105_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_1106_ = Class129_Sub3.anInt8561;
                    int i_1107_ = Class129_Sub3.anInt8549;
                    if (i_1106_ >= 0 && (i_1106_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        if (i_1105_ < 0) {
                            int i_1108_ = ((Class129_Sub3.anInt8557 - 1 - i_1105_) / Class129_Sub3.anInt8557);
                            i_1107_ += i_1108_;
                            i_1105_ += Class129_Sub3.anInt8557 * i_1108_;
                            i_1104_ += i_1108_;
                        }
                        int i_1109_;
                        if ((i_1109_ = ((1 + i_1105_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1107_)
                            i_1107_ = i_1109_;
                        int i_1110_ = is[i_1103_] - i;
                        int i_1111_ = -is_1033_[i_1103_];
                        int i_1112_ = i_1110_ - (i_1104_ - Class129_Sub3.anInt8550);
                        if (i_1112_ > 0) {
                            i_1104_ += i_1112_;
                            i_1107_ += i_1112_;
                            i_1105_ += Class129_Sub3.anInt8557 * i_1112_;
                            i_1106_ += Class129_Sub3.anInt8564 * i_1112_;
                        } else
                            i_1111_ -= i_1112_;
                        if (i_1107_ < i_1111_)
                            i_1107_ = i_1111_;
                        for (/**/; i_1107_ < 0; i_1107_++) {
                            int i_1113_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1106_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1105_ >> 12))]);
                            if (i_1113_ != 0)
                                is_1035_[i_1104_++] = i_1113_;
                            else
                                i_1104_++;
                            i_1105_ += Class129_Sub3.anInt8557;
                        }
                    }
                }
                i_1102_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else if (Class129_Sub3.anInt8564 < 0) {
            int i_1114_ = Class129_Sub3.anInt8577;
            while (i_1114_ < 0) {
                int i_1115_ = i_1114_ + i_1034_;
                if (i_1115_ >= 0) {
                    if (i_1115_ >= is.length)
                        break;
                    int i_1116_ = Class129_Sub3.anInt8550;
                    int i_1117_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_1118_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_1119_ = Class129_Sub3.anInt8549;
                    if (i_1117_ < 0) {
                        int i_1120_ = ((Class129_Sub3.anInt8557 - 1 - i_1117_) / Class129_Sub3.anInt8557);
                        i_1119_ += i_1120_;
                        i_1117_ += Class129_Sub3.anInt8557 * i_1120_;
                        i_1118_ += Class129_Sub3.anInt8564 * i_1120_;
                        i_1116_ += i_1120_;
                    }
                    int i_1121_;
                    if ((i_1121_ = ((1 + i_1117_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1119_)
                        i_1119_ = i_1121_;
                    if ((i_1121_ = i_1118_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                        i_1121_ = ((Class129_Sub3.anInt8564 - i_1121_) / Class129_Sub3.anInt8564);
                        i_1119_ += i_1121_;
                        i_1117_ += Class129_Sub3.anInt8557 * i_1121_;
                        i_1118_ += Class129_Sub3.anInt8564 * i_1121_;
                        i_1116_ += i_1121_;
                    }
                    if ((i_1121_ = ((i_1118_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1119_)
                        i_1119_ = i_1121_;
                    int i_1122_ = is[i_1115_] - i;
                    int i_1123_ = -is_1033_[i_1115_];
                    int i_1124_ = i_1122_ - (i_1116_ - Class129_Sub3.anInt8550);
                    if (i_1124_ > 0) {
                        i_1116_ += i_1124_;
                        i_1119_ += i_1124_;
                        i_1117_ += Class129_Sub3.anInt8557 * i_1124_;
                        i_1118_ += Class129_Sub3.anInt8564 * i_1124_;
                    } else
                        i_1123_ -= i_1124_;
                    if (i_1119_ < i_1123_)
                        i_1119_ = i_1123_;
                    for (/**/; i_1119_ < 0; i_1119_++) {
                        int i_1125_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1118_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1117_ >> 12))]);
                        if (i_1125_ != 0)
                            is_1035_[i_1116_++] = i_1125_;
                        else
                            i_1116_++;
                        i_1117_ += Class129_Sub3.anInt8557;
                        i_1118_ += Class129_Sub3.anInt8564;
                    }
                }
                i_1114_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else {
            int i_1126_ = Class129_Sub3.anInt8577;
            while (i_1126_ < 0) {
                int i_1127_ = i_1126_ + i_1034_;
                if (i_1127_ >= 0) {
                    if (i_1127_ >= is.length)
                        break;
                    int i_1128_ = Class129_Sub3.anInt8550;
                    int i_1129_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_1130_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_1131_ = Class129_Sub3.anInt8549;
                    if (i_1129_ < 0) {
                        int i_1132_ = ((Class129_Sub3.anInt8557 - 1 - i_1129_) / Class129_Sub3.anInt8557);
                        i_1131_ += i_1132_;
                        i_1129_ += Class129_Sub3.anInt8557 * i_1132_;
                        i_1130_ += Class129_Sub3.anInt8564 * i_1132_;
                        i_1128_ += i_1132_;
                    }
                    int i_1133_;
                    if ((i_1133_ = ((1 + i_1129_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1131_)
                        i_1131_ = i_1133_;
                    if (i_1130_ < 0) {
                        i_1133_ = ((Class129_Sub3.anInt8564 - 1 - i_1130_) / Class129_Sub3.anInt8564);
                        i_1131_ += i_1133_;
                        i_1129_ += Class129_Sub3.anInt8557 * i_1133_;
                        i_1130_ += Class129_Sub3.anInt8564 * i_1133_;
                        i_1128_ += i_1133_;
                    }
                    if ((i_1133_ = ((1 + i_1130_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1131_)
                        i_1131_ = i_1133_;
                    int i_1134_ = is[i_1127_] - i;
                    int i_1135_ = -is_1033_[i_1127_];
                    int i_1136_ = i_1134_ - (i_1128_ - Class129_Sub3.anInt8550);
                    if (i_1136_ > 0) {
                        i_1128_ += i_1136_;
                        i_1131_ += i_1136_;
                        i_1129_ += Class129_Sub3.anInt8557 * i_1136_;
                        i_1130_ += Class129_Sub3.anInt8564 * i_1136_;
                    } else
                        i_1135_ -= i_1136_;
                    if (i_1131_ < i_1135_)
                        i_1131_ = i_1135_;
                    for (/**/; i_1131_ < 0; i_1131_++) {
                        int i_1137_ = (((Class129_Sub3_Sub1) this).anIntArray9988[(((i_1130_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1129_ >> 12))]);
                        if (i_1137_ != 0)
                            is_1035_[i_1128_++] = i_1137_;
                        else
                            i_1128_++;
                        i_1129_ += Class129_Sub3.anInt8557;
                        i_1130_ += Class129_Sub3.anInt8564;
                    }
                }
                i_1126_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        }
    }
}
