/* Class129_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129_Sub3_Sub3 extends Class129_Sub3 {
    private byte[] aByteArray9990;
    private int[] anIntArray9991;

    final void method1177(int i, int i_0_, int i_1_) {
        throw new IllegalStateException();
    }

    final void method1195(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        if (i_4_ > 0 && i_5_ > 0) {
            int i_10_ = 0;
            int i_11_ = 0;
            int i_12_ = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
            int i_13_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
            int i_14_ = (i_12_ << 16) / i_4_;
            int i_15_ = (i_13_ << 16) / i_5_;
            if (((Class129_Sub3) this).anInt8566 > 0) {
                int i_16_ = (((((Class129_Sub3) this).anInt8566 << 16) + i_14_ - 1) / i_14_);
                i += i_16_;
                i_10_ += i_16_ * i_14_ - (((Class129_Sub3) this).anInt8566 << 16);
            }
            if (((Class129_Sub3) this).anInt8571 > 0) {
                int i_17_ = (((((Class129_Sub3) this).anInt8571 << 16) + i_15_ - 1) / i_15_);
                i_2_ += i_17_;
                i_11_ += i_17_ * i_15_ - (((Class129_Sub3) this).anInt8571 << 16);
            }
            if (((Class129_Sub3) this).anInt8548 < i_12_)
                i_4_ = ((((Class129_Sub3) this).anInt8548 << 16) - i_10_ + i_14_ - 1) / i_14_;
            if (((Class129_Sub3) this).anInt8569 < i_13_)
                i_5_ = ((((Class129_Sub3) this).anInt8569 << 16) - i_11_ + i_15_ - 1) / i_15_;
            int i_18_ = i + i_2_ * (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567);
            int i_19_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567 - i_4_);
            if (i_2_ + i_5_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
                i_5_ -= i_2_ + i_5_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
            if (i_2_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
                int i_20_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) - i_2_);
                i_5_ -= i_20_;
                i_18_ += i_20_ * ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5567;
                i_11_ += i_15_ * i_20_;
            }
            if (i + i_4_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
                int i_21_ = i + i_4_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5561;
                i_4_ -= i_21_;
                i_19_ += i_21_;
            }
            if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
                int i_22_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) - i);
                i_4_ -= i_22_;
                i_18_ += i_22_;
                i_10_ += i_14_ * i_22_;
                i_19_ += i_22_;
            }
            float[] fs = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).aFloatArray5556);
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_8_ == 0) {
                if (i_6_ == 1) {
                    int i_23_ = i_10_;
                    for (int i_24_ = -i_5_; i_24_ < 0; i_24_++) {
                        int i_25_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_26_ = -i_4_; i_26_ < 0; i_26_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                is[i_18_] = (anIntArray9991[(aByteArray9990[(i_10_ >> 16) + i_25_] & 0xff)]);
                                fs[i_18_] = (float) i_3_;
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_23_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 0) {
                    int i_27_ = (i_7_ & 0xff0000) >> 16;
                    int i_28_ = (i_7_ & 0xff00) >> 8;
                    int i_29_ = i_7_ & 0xff;
                    int i_30_ = i_10_;
                    for (int i_31_ = -i_5_; i_31_ < 0; i_31_++) {
                        int i_32_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_33_ = -i_4_; i_33_ < 0; i_33_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_34_ = (anIntArray9991[(aByteArray9990[(i_10_ >> 16) + i_32_] & 0xff)]);
                                int i_35_ = (i_34_ & 0xff0000) * i_27_ & ~0xffffff;
                                int i_36_ = (i_34_ & 0xff00) * i_28_ & 0xff0000;
                                int i_37_ = (i_34_ & 0xff) * i_29_ & 0xff00;
                                is[i_18_] = (i_35_ | i_36_ | i_37_) >>> 8;
                                fs[i_18_] = (float) i_3_;
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_30_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 3) {
                    int i_38_ = i_10_;
                    for (int i_39_ = -i_5_; i_39_ < 0; i_39_++) {
                        int i_40_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_41_ = -i_4_; i_41_ < 0; i_41_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                byte i_42_ = aByteArray9990[(i_10_ >> 16) + i_40_];
                                int i_43_ = i_42_ > 0 ? anIntArray9991[i_42_] : 0;
                                int i_44_ = i_43_ + i_7_;
                                int i_45_ = (i_43_ & 0xff00ff) + (i_7_ & 0xff00ff);
                                int i_46_ = ((i_45_ & 0x1000100) + (i_44_ - i_45_ & 0x10000));
                                is[i_18_] = i_44_ - i_46_ | i_46_ - (i_46_ >>> 8);
                                fs[i_18_] = (float) i_3_;
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_38_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 2) {
                    int i_47_ = i_7_ >>> 24;
                    int i_48_ = 256 - i_47_;
                    int i_49_ = (i_7_ & 0xff00ff) * i_48_ & ~0xff00ff;
                    int i_50_ = (i_7_ & 0xff00) * i_48_ & 0xff0000;
                    i_7_ = (i_49_ | i_50_) >>> 8;
                    int i_51_ = i_10_;
                    for (int i_52_ = -i_5_; i_52_ < 0; i_52_++) {
                        int i_53_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_54_ = -i_4_; i_54_ < 0; i_54_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_55_ = (anIntArray9991[(aByteArray9990[(i_10_ >> 16) + i_53_] & 0xff)]);
                                i_49_ = (i_55_ & 0xff00ff) * i_47_ & ~0xff00ff;
                                i_50_ = (i_55_ & 0xff00) * i_47_ & 0xff0000;
                                is[i_18_] = ((i_49_ | i_50_) >>> 8) + i_7_;
                                fs[i_18_] = (float) i_3_;
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_51_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_8_ == 1) {
                if (i_6_ == 1) {
                    int i_56_ = i_10_;
                    for (int i_57_ = -i_5_; i_57_ < 0; i_57_++) {
                        int i_58_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_59_ = -i_4_; i_59_ < 0; i_59_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_60_ = aByteArray9990[(i_10_ >> 16) + i_58_];
                                if (i_60_ != 0) {
                                    is[i_18_] = anIntArray9991[i_60_ & 0xff];
                                    fs[i_18_] = (float) i_3_;
                                }
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_56_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 0) {
                    int i_61_ = i_10_;
                    if ((i_7_ & 0xffffff) == 16777215) {
                        int i_62_ = i_7_ >>> 24;
                        int i_63_ = 256 - i_62_;
                        for (int i_64_ = -i_5_; i_64_ < 0; i_64_++) {
                            int i_65_ = ((i_11_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_66_ = -i_4_; i_66_ < 0; i_66_++) {
                                if ((float) i_3_ < fs[i_18_]) {
                                    int i_67_ = (aByteArray9990[(i_10_ >> 16) + i_65_]);
                                    if (i_67_ != 0) {
                                        int i_68_ = anIntArray9991[i_67_ & 0xff];
                                        int i_69_ = is[i_18_];
                                        is[i_18_] = ((((i_68_ & 0xff00ff) * i_62_ + (i_69_ & 0xff00ff) * i_63_) & ~0xff00ff) + (((i_68_ & 0xff00) * i_62_ + (i_69_ & 0xff00) * i_63_) & 0xff0000)) >> 8;
                                        fs[i_18_] = (float) i_3_;
                                    }
                                }
                                i_10_ += i_14_;
                                i_18_++;
                            }
                            i_11_ += i_15_;
                            i_10_ = i_61_;
                            i_18_ += i_19_;
                        }
                    } else {
                        int i_70_ = (i_7_ & 0xff0000) >> 16;
                        int i_71_ = (i_7_ & 0xff00) >> 8;
                        int i_72_ = i_7_ & 0xff;
                        int i_73_ = i_7_ >>> 24;
                        int i_74_ = 256 - i_73_;
                        for (int i_75_ = -i_5_; i_75_ < 0; i_75_++) {
                            int i_76_ = ((i_11_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_77_ = -i_4_; i_77_ < 0; i_77_++) {
                                if ((float) i_3_ < fs[i_18_]) {
                                    int i_78_ = (aByteArray9990[(i_10_ >> 16) + i_76_]);
                                    if (i_78_ != 0) {
                                        int i_79_ = anIntArray9991[i_78_ & 0xff];
                                        if (i_73_ != 255) {
                                            int i_80_ = ((i_79_ & 0xff0000) * i_70_ & ~0xffffff);
                                            int i_81_ = ((i_79_ & 0xff00) * i_71_ & 0xff0000);
                                            int i_82_ = ((i_79_ & 0xff) * i_72_ & 0xff00);
                                            i_79_ = ((i_80_ | i_81_ | i_82_) >>> 8);
                                            int i_83_ = is[i_18_];
                                            is[i_18_] = ((((i_79_ & 0xff00ff) * i_73_ + ((i_83_ & 0xff00ff) * i_74_)) & ~0xff00ff) + (((i_79_ & 0xff00) * i_73_ + ((i_83_ & 0xff00) * i_74_)) & 0xff0000)) >> 8;
                                            fs[i_18_] = (float) i_3_;
                                        } else {
                                            int i_84_ = ((i_79_ & 0xff0000) * i_70_ & ~0xffffff);
                                            int i_85_ = ((i_79_ & 0xff00) * i_71_ & 0xff0000);
                                            int i_86_ = ((i_79_ & 0xff) * i_72_ & 0xff00);
                                            is[i_18_] = (i_84_ | i_85_ | i_86_) >>> 8;
                                            fs[i_18_] = (float) i_3_;
                                        }
                                    }
                                }
                                i_10_ += i_14_;
                                i_18_++;
                            }
                            i_11_ += i_15_;
                            i_10_ = i_61_;
                            i_18_ += i_19_;
                        }
                        return;
                    }
                    return;
                }
                if (i_6_ == 3) {
                    int i_87_ = i_10_;
                    int i_88_ = i_7_ >>> 24;
                    int i_89_ = 256 - i_88_;
                    for (int i_90_ = -i_5_; i_90_ < 0; i_90_++) {
                        int i_91_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_92_ = -i_4_; i_92_ < 0; i_92_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                byte i_93_ = aByteArray9990[(i_10_ >> 16) + i_91_];
                                int i_94_ = i_93_ > 0 ? anIntArray9991[i_93_] : 0;
                                int i_95_ = i_94_ + i_7_;
                                int i_96_ = (i_94_ & 0xff00ff) + (i_7_ & 0xff00ff);
                                int i_97_ = ((i_96_ & 0x1000100) + (i_95_ - i_96_ & 0x10000));
                                i_97_ = i_95_ - i_97_ | i_97_ - (i_97_ >>> 8);
                                if (i_94_ == 0 && i_88_ != 255) {
                                    i_94_ = i_97_;
                                    i_97_ = is[i_18_];
                                    i_97_ = ((((i_94_ & 0xff00ff) * i_88_ + (i_97_ & 0xff00ff) * i_89_) & ~0xff00ff) + (((i_94_ & 0xff00) * i_88_ + (i_97_ & 0xff00) * i_89_) & 0xff0000)) >> 8;
                                }
                                is[i_18_] = i_97_;
                                fs[i_18_] = (float) i_3_;
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_87_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 2) {
                    int i_98_ = i_7_ >>> 24;
                    int i_99_ = 256 - i_98_;
                    int i_100_ = (i_7_ & 0xff00ff) * i_99_ & ~0xff00ff;
                    int i_101_ = (i_7_ & 0xff00) * i_99_ & 0xff0000;
                    i_7_ = (i_100_ | i_101_) >>> 8;
                    int i_102_ = i_10_;
                    for (int i_103_ = -i_5_; i_103_ < 0; i_103_++) {
                        int i_104_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_105_ = -i_4_; i_105_ < 0; i_105_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_106_ = aByteArray9990[(i_10_ >> 16) + i_104_];
                                if (i_106_ != 0) {
                                    int i_107_ = anIntArray9991[i_106_ & 0xff];
                                    i_100_ = ((i_107_ & 0xff00ff) * i_98_ & ~0xff00ff);
                                    i_101_ = (i_107_ & 0xff00) * i_98_ & 0xff0000;
                                    is[i_18_] = ((i_100_ | i_101_) >>> 8) + i_7_;
                                    fs[i_18_] = (float) i_3_;
                                }
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_102_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_8_ == 2) {
                if (i_6_ == 1) {
                    int i_108_ = i_10_;
                    for (int i_109_ = -i_5_; i_109_ < 0; i_109_++) {
                        int i_110_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_111_ = -i_4_; i_111_ < 0; i_111_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_112_ = aByteArray9990[(i_10_ >> 16) + i_110_];
                                if (i_112_ != 0) {
                                    int i_113_ = anIntArray9991[i_112_ & 0xff];
                                    int i_114_ = is[i_18_];
                                    int i_115_ = i_113_ + i_114_;
                                    int i_116_ = ((i_113_ & 0xff00ff) + (i_114_ & 0xff00ff));
                                    i_114_ = ((i_116_ & 0x1000100) + (i_115_ - i_116_ & 0x10000));
                                    is[i_18_] = i_115_ - i_114_ | i_114_ - (i_114_ >>> 8);
                                    fs[i_18_] = (float) i_3_;
                                }
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_108_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 0) {
                    int i_117_ = i_10_;
                    int i_118_ = (i_7_ & 0xff0000) >> 16;
                    int i_119_ = (i_7_ & 0xff00) >> 8;
                    int i_120_ = i_7_ & 0xff;
                    for (int i_121_ = -i_5_; i_121_ < 0; i_121_++) {
                        int i_122_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_123_ = -i_4_; i_123_ < 0; i_123_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_124_ = aByteArray9990[(i_10_ >> 16) + i_122_];
                                if (i_124_ != 0) {
                                    int i_125_ = anIntArray9991[i_124_ & 0xff];
                                    int i_126_ = ((i_125_ & 0xff0000) * i_118_ & ~0xffffff);
                                    int i_127_ = ((i_125_ & 0xff00) * i_119_ & 0xff0000);
                                    int i_128_ = (i_125_ & 0xff) * i_120_ & 0xff00;
                                    i_125_ = (i_126_ | i_127_ | i_128_) >>> 8;
                                    int i_129_ = is[i_18_];
                                    int i_130_ = i_125_ + i_129_;
                                    int i_131_ = ((i_125_ & 0xff00ff) + (i_129_ & 0xff00ff));
                                    i_129_ = ((i_131_ & 0x1000100) + (i_130_ - i_131_ & 0x10000));
                                    is[i_18_] = i_130_ - i_129_ | i_129_ - (i_129_ >>> 8);
                                    fs[i_18_] = (float) i_3_;
                                }
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_117_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 3) {
                    int i_132_ = i_10_;
                    for (int i_133_ = -i_5_; i_133_ < 0; i_133_++) {
                        int i_134_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_135_ = -i_4_; i_135_ < 0; i_135_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                byte i_136_ = aByteArray9990[(i_10_ >> 16) + i_134_];
                                int i_137_ = i_136_ > 0 ? anIntArray9991[i_136_] : 0;
                                int i_138_ = i_137_ + i_7_;
                                int i_139_ = (i_137_ & 0xff00ff) + (i_7_ & 0xff00ff);
                                int i_140_ = ((i_139_ & 0x1000100) + (i_138_ - i_139_ & 0x10000));
                                i_137_ = i_138_ - i_140_ | i_140_ - (i_140_ >>> 8);
                                i_140_ = is[i_18_];
                                i_138_ = i_137_ + i_140_;
                                i_139_ = (i_137_ & 0xff00ff) + (i_140_ & 0xff00ff);
                                i_140_ = (i_139_ & 0x1000100) + (i_138_ - i_139_ & 0x10000);
                                is[i_18_] = i_138_ - i_140_ | i_140_ - (i_140_ >>> 8);
                                fs[i_18_] = (float) i_3_;
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_132_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                if (i_6_ == 2) {
                    int i_141_ = i_7_ >>> 24;
                    int i_142_ = 256 - i_141_;
                    int i_143_ = (i_7_ & 0xff00ff) * i_142_ & ~0xff00ff;
                    int i_144_ = (i_7_ & 0xff00) * i_142_ & 0xff0000;
                    i_7_ = (i_143_ | i_144_) >>> 8;
                    int i_145_ = i_10_;
                    for (int i_146_ = -i_5_; i_146_ < 0; i_146_++) {
                        int i_147_ = (i_11_ >> 16) * ((Class129_Sub3) this).anInt8548;
                        for (int i_148_ = -i_4_; i_148_ < 0; i_148_++) {
                            if ((float) i_3_ < fs[i_18_]) {
                                int i_149_ = aByteArray9990[(i_10_ >> 16) + i_147_];
                                if (i_149_ != 0) {
                                    int i_150_ = anIntArray9991[i_149_ & 0xff];
                                    i_143_ = ((i_150_ & 0xff00ff) * i_141_ & ~0xff00ff);
                                    i_144_ = ((i_150_ & 0xff00) * i_141_ & 0xff0000);
                                    i_150_ = ((i_143_ | i_144_) >>> 8) + i_7_;
                                    int i_151_ = is[i_18_];
                                    int i_152_ = i_150_ + i_151_;
                                    int i_153_ = ((i_150_ & 0xff00ff) + (i_151_ & 0xff00ff));
                                    i_151_ = ((i_153_ & 0x1000100) + (i_152_ - i_153_ & 0x10000));
                                    is[i_18_] = i_152_ - i_151_ | i_151_ - (i_151_ >>> 8);
                                    fs[i_18_] = (float) i_3_;
                                }
                            }
                            i_10_ += i_14_;
                            i_18_++;
                        }
                        i_11_ += i_15_;
                        i_10_ = i_145_;
                        i_18_ += i_19_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    Class129_Sub3_Sub3(ha_Sub1 var_ha_Sub1, byte[] is, int[] is_154_, int i, int i_155_) {
        super(var_ha_Sub1, i, i_155_);
        aByteArray9990 = is;
        anIntArray9991 = is_154_;
    }

    final void method1183(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        if (i_157_ > 0 && i_158_ > 0) {
            int i_163_ = 0;
            int i_164_ = 0;
            int i_165_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
            int i_166_ = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
            int i_167_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
            int i_168_ = (i_166_ << 16) / i_157_;
            int i_169_ = (i_167_ << 16) / i_158_;
            if (((Class129_Sub3) this).anInt8566 > 0) {
                int i_170_ = (((((Class129_Sub3) this).anInt8566 << 16) + i_168_ - 1) / i_168_);
                i += i_170_;
                i_163_ += i_170_ * i_168_ - (((Class129_Sub3) this).anInt8566 << 16);
            }
            if (((Class129_Sub3) this).anInt8571 > 0) {
                int i_171_ = (((((Class129_Sub3) this).anInt8571 << 16) + i_169_ - 1) / i_169_);
                i_156_ += i_171_;
                i_164_ += i_171_ * i_169_ - (((Class129_Sub3) this).anInt8571 << 16);
            }
            if (((Class129_Sub3) this).anInt8548 < i_166_)
                i_157_ = ((((Class129_Sub3) this).anInt8548 << 16) - i_163_ + i_168_ - 1) / i_168_;
            if (((Class129_Sub3) this).anInt8569 < i_167_)
                i_158_ = ((((Class129_Sub3) this).anInt8569 << 16) - i_164_ + i_169_ - 1) / i_169_;
            int i_172_ = i + i_156_ * i_165_;
            int i_173_ = i_165_ - i_157_;
            if (i_156_ + i_158_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
                i_158_ -= (i_156_ + i_158_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582));
            if (i_156_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
                int i_174_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) - i_156_);
                i_158_ -= i_174_;
                i_172_ += i_174_ * i_165_;
                i_164_ += i_169_ * i_174_;
            }
            if (i + i_157_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
                int i_175_ = (i + i_157_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
                i_157_ -= i_175_;
                i_173_ += i_175_;
            }
            if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
                int i_176_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) - i);
                i_157_ -= i_176_;
                i_172_ += i_176_;
                i_163_ += i_168_ * i_176_;
                i_173_ += i_176_;
            }
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_161_ == 0) {
                if (i_159_ == 1) {
                    int i_177_ = i_163_;
                    for (int i_178_ = -i_158_; i_178_ < 0; i_178_++) {
                        int i_179_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_180_ = -i_157_; i_180_ < 0; i_180_++) {
                            is[i_172_++] = (anIntArray9991[(aByteArray9990[(i_163_ >> 16) + i_179_] & 0xff)]);
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_177_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 0) {
                    int i_181_ = (i_160_ & 0xff0000) >> 16;
                    int i_182_ = (i_160_ & 0xff00) >> 8;
                    int i_183_ = i_160_ & 0xff;
                    int i_184_ = i_163_;
                    for (int i_185_ = -i_158_; i_185_ < 0; i_185_++) {
                        int i_186_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_187_ = -i_157_; i_187_ < 0; i_187_++) {
                            int i_188_ = (anIntArray9991[(aByteArray9990[(i_163_ >> 16) + i_186_] & 0xff)]);
                            int i_189_ = (i_188_ & 0xff0000) * i_181_ & ~0xffffff;
                            int i_190_ = (i_188_ & 0xff00) * i_182_ & 0xff0000;
                            int i_191_ = (i_188_ & 0xff) * i_183_ & 0xff00;
                            is[i_172_++] = (i_189_ | i_190_ | i_191_) >>> 8;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_184_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 3) {
                    int i_192_ = i_163_;
                    for (int i_193_ = -i_158_; i_193_ < 0; i_193_++) {
                        int i_194_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_195_ = -i_157_; i_195_ < 0; i_195_++) {
                            byte i_196_ = aByteArray9990[(i_163_ >> 16) + i_194_];
                            int i_197_ = i_196_ > 0 ? anIntArray9991[i_196_] : 0;
                            int i_198_ = i_197_ + i_160_;
                            int i_199_ = (i_197_ & 0xff00ff) + (i_160_ & 0xff00ff);
                            int i_200_ = ((i_199_ & 0x1000100) + (i_198_ - i_199_ & 0x10000));
                            is[i_172_++] = i_198_ - i_200_ | i_200_ - (i_200_ >>> 8);
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_192_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 2) {
                    int i_201_ = i_160_ >>> 24;
                    int i_202_ = 256 - i_201_;
                    int i_203_ = (i_160_ & 0xff00ff) * i_202_ & ~0xff00ff;
                    int i_204_ = (i_160_ & 0xff00) * i_202_ & 0xff0000;
                    i_160_ = (i_203_ | i_204_) >>> 8;
                    int i_205_ = i_163_;
                    for (int i_206_ = -i_158_; i_206_ < 0; i_206_++) {
                        int i_207_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_208_ = -i_157_; i_208_ < 0; i_208_++) {
                            int i_209_ = (anIntArray9991[(aByteArray9990[(i_163_ >> 16) + i_207_] & 0xff)]);
                            i_203_ = (i_209_ & 0xff00ff) * i_201_ & ~0xff00ff;
                            i_204_ = (i_209_ & 0xff00) * i_201_ & 0xff0000;
                            is[i_172_++] = ((i_203_ | i_204_) >>> 8) + i_160_;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_205_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_161_ == 1) {
                if (i_159_ == 1) {
                    int i_210_ = i_163_;
                    for (int i_211_ = -i_158_; i_211_ < 0; i_211_++) {
                        int i_212_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_213_ = -i_157_; i_213_ < 0; i_213_++) {
                            int i_214_ = aByteArray9990[(i_163_ >> 16) + i_212_];
                            if (i_214_ != 0)
                                is[i_172_++] = anIntArray9991[i_214_ & 0xff];
                            else
                                i_172_++;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_210_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 0) {
                    int i_215_ = i_163_;
                    if ((i_160_ & 0xffffff) == 16777215) {
                        int i_216_ = i_160_ >>> 24;
                        int i_217_ = 256 - i_216_;
                        for (int i_218_ = -i_158_; i_218_ < 0; i_218_++) {
                            int i_219_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_220_ = -i_157_; i_220_ < 0; i_220_++) {
                                int i_221_ = aByteArray9990[(i_163_ >> 16) + i_219_];
                                if (i_221_ != 0) {
                                    int i_222_ = anIntArray9991[i_221_ & 0xff];
                                    int i_223_ = is[i_172_];
                                    is[i_172_++] = ((((i_222_ & 0xff00ff) * i_216_ + (i_223_ & 0xff00ff) * i_217_) & ~0xff00ff) + (((i_222_ & 0xff00) * i_216_ + (i_223_ & 0xff00) * i_217_) & 0xff0000)) >> 8;
                                } else
                                    i_172_++;
                                i_163_ += i_168_;
                            }
                            i_164_ += i_169_;
                            i_163_ = i_215_;
                            i_172_ += i_173_;
                        }
                    } else {
                        int i_224_ = (i_160_ & 0xff0000) >> 16;
                        int i_225_ = (i_160_ & 0xff00) >> 8;
                        int i_226_ = i_160_ & 0xff;
                        int i_227_ = i_160_ >>> 24;
                        int i_228_ = 256 - i_227_;
                        for (int i_229_ = -i_158_; i_229_ < 0; i_229_++) {
                            int i_230_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_231_ = -i_157_; i_231_ < 0; i_231_++) {
                                int i_232_ = aByteArray9990[(i_163_ >> 16) + i_230_];
                                if (i_232_ != 0) {
                                    int i_233_ = anIntArray9991[i_232_ & 0xff];
                                    if (i_227_ != 255) {
                                        int i_234_ = ((i_233_ & 0xff0000) * i_224_ & ~0xffffff);
                                        int i_235_ = ((i_233_ & 0xff00) * i_225_ & 0xff0000);
                                        int i_236_ = ((i_233_ & 0xff) * i_226_ & 0xff00);
                                        i_233_ = (i_234_ | i_235_ | i_236_) >>> 8;
                                        int i_237_ = is[i_172_];
                                        is[i_172_++] = ((((i_233_ & 0xff00ff) * i_227_ + ((i_237_ & 0xff00ff) * i_228_)) & ~0xff00ff) + (((i_233_ & 0xff00) * i_227_ + ((i_237_ & 0xff00) * i_228_)) & 0xff0000)) >> 8;
                                    } else {
                                        int i_238_ = ((i_233_ & 0xff0000) * i_224_ & ~0xffffff);
                                        int i_239_ = ((i_233_ & 0xff00) * i_225_ & 0xff0000);
                                        int i_240_ = ((i_233_ & 0xff) * i_226_ & 0xff00);
                                        is[i_172_++] = (i_238_ | i_239_ | i_240_) >>> 8;
                                    }
                                } else
                                    i_172_++;
                                i_163_ += i_168_;
                            }
                            i_164_ += i_169_;
                            i_163_ = i_215_;
                            i_172_ += i_173_;
                        }
                        return;
                    }
                    return;
                }
                if (i_159_ == 3) {
                    int i_241_ = i_163_;
                    int i_242_ = i_160_ >>> 24;
                    int i_243_ = 256 - i_242_;
                    for (int i_244_ = -i_158_; i_244_ < 0; i_244_++) {
                        int i_245_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_246_ = -i_157_; i_246_ < 0; i_246_++) {
                            byte i_247_ = aByteArray9990[(i_163_ >> 16) + i_245_];
                            int i_248_ = i_247_ > 0 ? anIntArray9991[i_247_] : 0;
                            int i_249_ = i_248_ + i_160_;
                            int i_250_ = (i_248_ & 0xff00ff) + (i_160_ & 0xff00ff);
                            int i_251_ = ((i_250_ & 0x1000100) + (i_249_ - i_250_ & 0x10000));
                            i_251_ = i_249_ - i_251_ | i_251_ - (i_251_ >>> 8);
                            if (i_248_ == 0 && i_242_ != 255) {
                                i_248_ = i_251_;
                                i_251_ = is[i_172_];
                                i_251_ = ((((i_248_ & 0xff00ff) * i_242_ + (i_251_ & 0xff00ff) * i_243_) & ~0xff00ff) + (((i_248_ & 0xff00) * i_242_ + (i_251_ & 0xff00) * i_243_) & 0xff0000)) >> 8;
                            }
                            is[i_172_++] = i_251_;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_241_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 2) {
                    int i_252_ = i_160_ >>> 24;
                    int i_253_ = 256 - i_252_;
                    int i_254_ = (i_160_ & 0xff00ff) * i_253_ & ~0xff00ff;
                    int i_255_ = (i_160_ & 0xff00) * i_253_ & 0xff0000;
                    i_160_ = (i_254_ | i_255_) >>> 8;
                    int i_256_ = i_163_;
                    for (int i_257_ = -i_158_; i_257_ < 0; i_257_++) {
                        int i_258_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_259_ = -i_157_; i_259_ < 0; i_259_++) {
                            int i_260_ = aByteArray9990[(i_163_ >> 16) + i_258_];
                            if (i_260_ != 0) {
                                int i_261_ = anIntArray9991[i_260_ & 0xff];
                                i_254_ = (i_261_ & 0xff00ff) * i_252_ & ~0xff00ff;
                                i_255_ = (i_261_ & 0xff00) * i_252_ & 0xff0000;
                                is[i_172_++] = ((i_254_ | i_255_) >>> 8) + i_160_;
                            } else
                                i_172_++;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_256_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_161_ == 2) {
                if (i_159_ == 1) {
                    int i_262_ = i_163_;
                    for (int i_263_ = -i_158_; i_263_ < 0; i_263_++) {
                        int i_264_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_265_ = -i_157_; i_265_ < 0; i_265_++) {
                            int i_266_ = aByteArray9990[(i_163_ >> 16) + i_264_];
                            if (i_266_ != 0) {
                                int i_267_ = anIntArray9991[i_266_ & 0xff];
                                int i_268_ = is[i_172_];
                                int i_269_ = i_267_ + i_268_;
                                int i_270_ = ((i_267_ & 0xff00ff) + (i_268_ & 0xff00ff));
                                i_268_ = (i_270_ & 0x1000100) + (i_269_ - i_270_ & 0x10000);
                                is[i_172_++] = i_269_ - i_268_ | i_268_ - (i_268_ >>> 8);
                            } else
                                i_172_++;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_262_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 0) {
                    int i_271_ = i_163_;
                    int i_272_ = (i_160_ & 0xff0000) >> 16;
                    int i_273_ = (i_160_ & 0xff00) >> 8;
                    int i_274_ = i_160_ & 0xff;
                    for (int i_275_ = -i_158_; i_275_ < 0; i_275_++) {
                        int i_276_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_277_ = -i_157_; i_277_ < 0; i_277_++) {
                            int i_278_ = aByteArray9990[(i_163_ >> 16) + i_276_];
                            if (i_278_ != 0) {
                                int i_279_ = anIntArray9991[i_278_ & 0xff];
                                int i_280_ = (i_279_ & 0xff0000) * i_272_ & ~0xffffff;
                                int i_281_ = (i_279_ & 0xff00) * i_273_ & 0xff0000;
                                int i_282_ = (i_279_ & 0xff) * i_274_ & 0xff00;
                                i_279_ = (i_280_ | i_281_ | i_282_) >>> 8;
                                int i_283_ = is[i_172_];
                                int i_284_ = i_279_ + i_283_;
                                int i_285_ = ((i_279_ & 0xff00ff) + (i_283_ & 0xff00ff));
                                i_283_ = (i_285_ & 0x1000100) + (i_284_ - i_285_ & 0x10000);
                                is[i_172_++] = i_284_ - i_283_ | i_283_ - (i_283_ >>> 8);
                            } else
                                i_172_++;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_271_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 3) {
                    int i_286_ = i_163_;
                    for (int i_287_ = -i_158_; i_287_ < 0; i_287_++) {
                        int i_288_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_289_ = -i_157_; i_289_ < 0; i_289_++) {
                            byte i_290_ = aByteArray9990[(i_163_ >> 16) + i_288_];
                            int i_291_ = i_290_ > 0 ? anIntArray9991[i_290_] : 0;
                            int i_292_ = i_291_ + i_160_;
                            int i_293_ = (i_291_ & 0xff00ff) + (i_160_ & 0xff00ff);
                            int i_294_ = ((i_293_ & 0x1000100) + (i_292_ - i_293_ & 0x10000));
                            i_291_ = i_292_ - i_294_ | i_294_ - (i_294_ >>> 8);
                            i_294_ = is[i_172_];
                            i_292_ = i_291_ + i_294_;
                            i_293_ = (i_291_ & 0xff00ff) + (i_294_ & 0xff00ff);
                            i_294_ = (i_293_ & 0x1000100) + (i_292_ - i_293_ & 0x10000);
                            is[i_172_++] = i_292_ - i_294_ | i_294_ - (i_294_ >>> 8);
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_286_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                if (i_159_ == 2) {
                    int i_295_ = i_160_ >>> 24;
                    int i_296_ = 256 - i_295_;
                    int i_297_ = (i_160_ & 0xff00ff) * i_296_ & ~0xff00ff;
                    int i_298_ = (i_160_ & 0xff00) * i_296_ & 0xff0000;
                    i_160_ = (i_297_ | i_298_) >>> 8;
                    int i_299_ = i_163_;
                    for (int i_300_ = -i_158_; i_300_ < 0; i_300_++) {
                        int i_301_ = ((i_164_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_302_ = -i_157_; i_302_ < 0; i_302_++) {
                            int i_303_ = aByteArray9990[(i_163_ >> 16) + i_301_];
                            if (i_303_ != 0) {
                                int i_304_ = anIntArray9991[i_303_ & 0xff];
                                i_297_ = (i_304_ & 0xff00ff) * i_295_ & ~0xff00ff;
                                i_298_ = (i_304_ & 0xff00) * i_295_ & 0xff0000;
                                i_304_ = ((i_297_ | i_298_) >>> 8) + i_160_;
                                int i_305_ = is[i_172_];
                                int i_306_ = i_304_ + i_305_;
                                int i_307_ = ((i_304_ & 0xff00ff) + (i_305_ & 0xff00ff));
                                i_305_ = (i_307_ & 0x1000100) + (i_306_ - i_307_ & 0x10000);
                                is[i_172_++] = i_306_ - i_305_ | i_305_ - (i_305_ >>> 8);
                            } else
                                i_172_++;
                            i_163_ += i_168_;
                        }
                        i_164_ += i_169_;
                        i_163_ = i_299_;
                        i_172_ += i_173_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1178(int i, int i_308_, int i_309_, int i_310_, int i_311_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        int i_312_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        i += ((Class129_Sub3) this).anInt8566;
        i_308_ += ((Class129_Sub3) this).anInt8571;
        int i_313_ = i_308_ * i_312_ + i;
        int i_314_ = 0;
        int i_315_ = ((Class129_Sub3) this).anInt8569;
        int i_316_ = ((Class129_Sub3) this).anInt8548;
        int i_317_ = i_312_ - i_316_;
        int i_318_ = 0;
        if (i_308_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
            int i_319_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578 - i_308_);
            i_315_ -= i_319_;
            i_308_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578;
            i_314_ += i_319_ * i_316_;
            i_313_ += i_319_ * i_312_;
        }
        if (i_308_ + i_315_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
            i_315_ -= i_308_ + i_315_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
        if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
            int i_320_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575 - i);
            i_316_ -= i_320_;
            i = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575;
            i_314_ += i_320_;
            i_313_ += i_320_;
            i_318_ += i_320_;
            i_317_ += i_320_;
        }
        if (i + i_316_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
            int i_321_ = (i + i_316_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
            i_316_ -= i_321_;
            i_318_ += i_321_;
            i_317_ += i_321_;
        }
        if (i_316_ > 0 && i_315_ > 0) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_311_ == 0) {
                if (i_309_ == 1) {
                    for (int i_322_ = -i_315_; i_322_ < 0; i_322_++) {
                        int i_323_ = i_313_ + i_316_ - 3;
                        while (i_313_ < i_323_) {
                            is[i_313_++] = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                            is[i_313_++] = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                            is[i_313_++] = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                            is[i_313_++] = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                        }
                        i_323_ += 3;
                        while (i_313_ < i_323_)
                            is[i_313_++] = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 0) {
                    int i_324_ = (i_310_ & 0xff0000) >> 16;
                    int i_325_ = (i_310_ & 0xff00) >> 8;
                    int i_326_ = i_310_ & 0xff;
                    for (int i_327_ = -i_315_; i_327_ < 0; i_327_++) {
                        for (int i_328_ = -i_316_; i_328_ < 0; i_328_++) {
                            int i_329_ = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                            int i_330_ = (i_329_ & 0xff0000) * i_324_ & ~0xffffff;
                            int i_331_ = (i_329_ & 0xff00) * i_325_ & 0xff0000;
                            int i_332_ = (i_329_ & 0xff) * i_326_ & 0xff00;
                            is[i_313_++] = (i_330_ | i_331_ | i_332_) >>> 8;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 3) {
                    for (int i_333_ = -i_315_; i_333_ < 0; i_333_++) {
                        for (int i_334_ = -i_316_; i_334_ < 0; i_334_++) {
                            int i_335_ = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                            int i_336_ = i_335_ + i_310_;
                            int i_337_ = (i_335_ & 0xff00ff) + (i_310_ & 0xff00ff);
                            int i_338_ = ((i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000));
                            is[i_313_++] = i_336_ - i_338_ | i_338_ - (i_338_ >>> 8);
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 2) {
                    int i_339_ = i_310_ >>> 24;
                    int i_340_ = 256 - i_339_;
                    int i_341_ = (i_310_ & 0xff00ff) * i_340_ & ~0xff00ff;
                    int i_342_ = (i_310_ & 0xff00) * i_340_ & 0xff0000;
                    i_310_ = (i_341_ | i_342_) >>> 8;
                    for (int i_343_ = -i_315_; i_343_ < 0; i_343_++) {
                        for (int i_344_ = -i_316_; i_344_ < 0; i_344_++) {
                            int i_345_ = (anIntArray9991[aByteArray9990[i_314_++] & 0xff]);
                            i_341_ = (i_345_ & 0xff00ff) * i_339_ & ~0xff00ff;
                            i_342_ = (i_345_ & 0xff00) * i_339_ & 0xff0000;
                            is[i_313_++] = ((i_341_ | i_342_) >>> 8) + i_310_;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_311_ == 1) {
                if (i_309_ == 1) {
                    for (int i_346_ = -i_315_; i_346_ < 0; i_346_++) {
                        for (int i_347_ = -i_316_; i_347_ < 0; i_347_++) {
                            int i_348_ = aByteArray9990[i_314_++];
                            if (i_348_ != 0) {
                                int i_349_ = (anIntArray9991[i_348_ & 0xff] | ~0xffffff);
                                int i_350_ = 255;
                                int i_351_ = 0;
                                int i_352_ = is[i_313_];
                                is[i_313_++] = (((((i_349_ & 0xff00ff) * i_350_ + (i_352_ & 0xff00ff) * i_351_) & ~0xff00ff) >> 8) + (((((i_349_ & ~0xff00ff) >>> 8) * i_350_) + (((i_352_ & ~0xff00ff) >>> 8) * i_351_)) & ~0xff00ff));
                            } else
                                i_313_++;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 0) {
                    if ((i_310_ & 0xffffff) == 16777215) {
                        int i_353_ = i_310_ >>> 24;
                        int i_354_ = 256 - i_353_;
                        for (int i_355_ = -i_315_; i_355_ < 0; i_355_++) {
                            for (int i_356_ = -i_316_; i_356_ < 0; i_356_++) {
                                int i_357_ = aByteArray9990[i_314_++];
                                if (i_357_ != 0) {
                                    int i_358_ = anIntArray9991[i_357_ & 0xff];
                                    int i_359_ = is[i_313_];
                                    is[i_313_++] = ((((i_358_ & 0xff00ff) * i_353_ + (i_359_ & 0xff00ff) * i_354_) & ~0xff00ff) + (((i_358_ & 0xff00) * i_353_ + (i_359_ & 0xff00) * i_354_) & 0xff0000)) >> 8;
                                } else
                                    i_313_++;
                            }
                            i_313_ += i_317_;
                            i_314_ += i_318_;
                        }
                    } else {
                        int i_360_ = (i_310_ & 0xff0000) >> 16;
                        int i_361_ = (i_310_ & 0xff00) >> 8;
                        int i_362_ = i_310_ & 0xff;
                        int i_363_ = i_310_ >>> 24;
                        int i_364_ = 256 - i_363_;
                        for (int i_365_ = -i_315_; i_365_ < 0; i_365_++) {
                            for (int i_366_ = -i_316_; i_366_ < 0; i_366_++) {
                                int i_367_ = aByteArray9990[i_314_++];
                                if (i_367_ != 0) {
                                    int i_368_ = anIntArray9991[i_367_ & 0xff];
                                    if (i_363_ != 255) {
                                        int i_369_ = ((i_368_ & 0xff0000) * i_360_ & ~0xffffff);
                                        int i_370_ = ((i_368_ & 0xff00) * i_361_ & 0xff0000);
                                        int i_371_ = ((i_368_ & 0xff) * i_362_ & 0xff00);
                                        i_368_ = (i_369_ | i_370_ | i_371_) >>> 8;
                                        int i_372_ = is[i_313_];
                                        is[i_313_++] = ((((i_368_ & 0xff00ff) * i_363_ + ((i_372_ & 0xff00ff) * i_364_)) & ~0xff00ff) + (((i_368_ & 0xff00) * i_363_ + ((i_372_ & 0xff00) * i_364_)) & 0xff0000)) >> 8;
                                    } else {
                                        int i_373_ = ((i_368_ & 0xff0000) * i_360_ & ~0xffffff);
                                        int i_374_ = ((i_368_ & 0xff00) * i_361_ & 0xff0000);
                                        int i_375_ = ((i_368_ & 0xff) * i_362_ & 0xff00);
                                        is[i_313_++] = (i_373_ | i_374_ | i_375_) >>> 8;
                                    }
                                } else
                                    i_313_++;
                            }
                            i_313_ += i_317_;
                            i_314_ += i_318_;
                        }
                        return;
                    }
                    return;
                }
                if (i_309_ == 3) {
                    int i_376_ = i_310_ >>> 24;
                    int i_377_ = 256 - i_376_;
                    for (int i_378_ = -i_315_; i_378_ < 0; i_378_++) {
                        for (int i_379_ = -i_316_; i_379_ < 0; i_379_++) {
                            byte i_380_ = aByteArray9990[i_314_++];
                            int i_381_ = i_380_ > 0 ? anIntArray9991[i_380_] : 0;
                            int i_382_ = i_381_ + i_310_;
                            int i_383_ = (i_381_ & 0xff00ff) + (i_310_ & 0xff00ff);
                            int i_384_ = ((i_383_ & 0x1000100) + (i_382_ - i_383_ & 0x10000));
                            i_384_ = i_382_ - i_384_ | i_384_ - (i_384_ >>> 8);
                            if (i_381_ == 0 && i_376_ != 255) {
                                i_381_ = i_384_;
                                i_384_ = is[i_313_];
                                i_384_ = ((((i_381_ & 0xff00ff) * i_376_ + (i_384_ & 0xff00ff) * i_377_) & ~0xff00ff) + (((i_381_ & 0xff00) * i_376_ + (i_384_ & 0xff00) * i_377_) & 0xff0000)) >> 8;
                            }
                            is[i_313_++] = i_384_;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 2) {
                    int i_385_ = i_310_ >>> 24;
                    int i_386_ = 256 - i_385_;
                    int i_387_ = (i_310_ & 0xff00ff) * i_386_ & ~0xff00ff;
                    int i_388_ = (i_310_ & 0xff00) * i_386_ & 0xff0000;
                    i_310_ = (i_387_ | i_388_) >>> 8;
                    for (int i_389_ = -i_315_; i_389_ < 0; i_389_++) {
                        for (int i_390_ = -i_316_; i_390_ < 0; i_390_++) {
                            int i_391_ = aByteArray9990[i_314_++];
                            if (i_391_ != 0) {
                                int i_392_ = anIntArray9991[i_391_ & 0xff];
                                i_387_ = (i_392_ & 0xff00ff) * i_385_ & ~0xff00ff;
                                i_388_ = (i_392_ & 0xff00) * i_385_ & 0xff0000;
                                is[i_313_++] = ((i_387_ | i_388_) >>> 8) + i_310_;
                            } else
                                i_313_++;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_311_ == 2) {
                if (i_309_ == 1) {
                    for (int i_393_ = -i_315_; i_393_ < 0; i_393_++) {
                        for (int i_394_ = -i_316_; i_394_ < 0; i_394_++) {
                            int i_395_ = aByteArray9990[i_314_++];
                            if (i_395_ != 0) {
                                int i_396_ = anIntArray9991[i_395_ & 0xff];
                                int i_397_ = is[i_313_];
                                int i_398_ = i_396_ + i_397_;
                                int i_399_ = ((i_396_ & 0xff00ff) + (i_397_ & 0xff00ff));
                                i_397_ = (i_399_ & 0x1000100) + (i_398_ - i_399_ & 0x10000);
                                is[i_313_++] = i_398_ - i_397_ | i_397_ - (i_397_ >>> 8);
                            } else
                                i_313_++;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 0) {
                    int i_400_ = (i_310_ & 0xff0000) >> 16;
                    int i_401_ = (i_310_ & 0xff00) >> 8;
                    int i_402_ = i_310_ & 0xff;
                    for (int i_403_ = -i_315_; i_403_ < 0; i_403_++) {
                        for (int i_404_ = -i_316_; i_404_ < 0; i_404_++) {
                            int i_405_ = aByteArray9990[i_314_++];
                            if (i_405_ != 0) {
                                int i_406_ = anIntArray9991[i_405_ & 0xff];
                                int i_407_ = (i_406_ & 0xff0000) * i_400_ & ~0xffffff;
                                int i_408_ = (i_406_ & 0xff00) * i_401_ & 0xff0000;
                                int i_409_ = (i_406_ & 0xff) * i_402_ & 0xff00;
                                i_406_ = (i_407_ | i_408_ | i_409_) >>> 8;
                                int i_410_ = is[i_313_];
                                int i_411_ = i_406_ + i_410_;
                                int i_412_ = ((i_406_ & 0xff00ff) + (i_410_ & 0xff00ff));
                                i_410_ = (i_412_ & 0x1000100) + (i_411_ - i_412_ & 0x10000);
                                is[i_313_++] = i_411_ - i_410_ | i_410_ - (i_410_ >>> 8);
                            } else
                                i_313_++;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 3) {
                    for (int i_413_ = -i_315_; i_413_ < 0; i_413_++) {
                        for (int i_414_ = -i_316_; i_414_ < 0; i_414_++) {
                            byte i_415_ = aByteArray9990[i_314_++];
                            int i_416_ = i_415_ > 0 ? anIntArray9991[i_415_] : 0;
                            int i_417_ = i_416_ + i_310_;
                            int i_418_ = (i_416_ & 0xff00ff) + (i_310_ & 0xff00ff);
                            int i_419_ = ((i_418_ & 0x1000100) + (i_417_ - i_418_ & 0x10000));
                            i_416_ = i_417_ - i_419_ | i_419_ - (i_419_ >>> 8);
                            i_419_ = is[i_313_];
                            i_417_ = i_416_ + i_419_;
                            i_418_ = (i_416_ & 0xff00ff) + (i_419_ & 0xff00ff);
                            i_419_ = (i_418_ & 0x1000100) + (i_417_ - i_418_ & 0x10000);
                            is[i_313_++] = i_417_ - i_419_ | i_419_ - (i_419_ >>> 8);
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                if (i_309_ == 2) {
                    int i_420_ = i_310_ >>> 24;
                    int i_421_ = 256 - i_420_;
                    int i_422_ = (i_310_ & 0xff00ff) * i_421_ & ~0xff00ff;
                    int i_423_ = (i_310_ & 0xff00) * i_421_ & 0xff0000;
                    i_310_ = (i_422_ | i_423_) >>> 8;
                    for (int i_424_ = -i_315_; i_424_ < 0; i_424_++) {
                        for (int i_425_ = -i_316_; i_425_ < 0; i_425_++) {
                            int i_426_ = aByteArray9990[i_314_++];
                            if (i_426_ != 0) {
                                int i_427_ = anIntArray9991[i_426_ & 0xff];
                                i_422_ = (i_427_ & 0xff00ff) * i_420_ & ~0xff00ff;
                                i_423_ = (i_427_ & 0xff00) * i_420_ & 0xff0000;
                                i_427_ = ((i_422_ | i_423_) >>> 8) + i_310_;
                                int i_428_ = is[i_313_];
                                int i_429_ = i_427_ + i_428_;
                                int i_430_ = ((i_427_ & 0xff00ff) + (i_428_ & 0xff00ff));
                                i_428_ = (i_430_ & 0x1000100) + (i_429_ - i_430_ & 0x10000);
                                is[i_313_++] = i_429_ - i_428_ | i_428_ - (i_428_ >>> 8);
                            } else
                                i_313_++;
                        }
                        i_313_ += i_317_;
                        i_314_ += i_318_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1184(int i, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_) {
        throw new IllegalStateException();
    }

    final void method1194(int[] is, int[] is_436_, int i, int i_437_) {
        int[] is_438_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        if (Class129_Sub3.anInt8557 == 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_439_ = Class129_Sub3.anInt8577;
                while (i_439_ < 0) {
                    int i_440_ = i_439_ + i_437_;
                    if (i_440_ >= 0) {
                        if (i_440_ >= is.length)
                            break;
                        int i_441_ = Class129_Sub3.anInt8550;
                        int i_442_ = Class129_Sub3.anInt8558;
                        int i_443_ = Class129_Sub3.anInt8561;
                        int i_444_ = Class129_Sub3.anInt8549;
                        if (i_442_ >= 0 && i_443_ >= 0 && i_442_ - (((Class129_Sub3) this).anInt8548 << 12) < 0 && i_443_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                            int i_445_ = is[i_440_] - i;
                            int i_446_ = -is_436_[i_440_];
                            int i_447_ = i_445_ - (i_441_ - Class129_Sub3.anInt8550);
                            if (i_447_ > 0) {
                                i_441_ += i_447_;
                                i_444_ += i_447_;
                                i_442_ += Class129_Sub3.anInt8557 * i_447_;
                                i_443_ += Class129_Sub3.anInt8564 * i_447_;
                            } else
                                i_446_ -= i_447_;
                            if (i_444_ < i_446_)
                                i_444_ = i_446_;
                            for (/**/; i_444_ < 0; i_444_++) {
                                int i_448_ = (aByteArray9990[(((i_443_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_442_ >> 12))]);
                                if (i_448_ != 0)
                                    is_438_[i_441_++] = anIntArray9991[i_448_ & 0xff];
                                else
                                    i_441_++;
                            }
                        }
                    }
                    i_439_++;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_449_ = Class129_Sub3.anInt8577;
                while (i_449_ < 0) {
                    int i_450_ = i_449_ + i_437_;
                    if (i_450_ >= 0) {
                        if (i_450_ >= is.length)
                            break;
                        int i_451_ = Class129_Sub3.anInt8550;
                        int i_452_ = Class129_Sub3.anInt8558;
                        int i_453_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_454_ = Class129_Sub3.anInt8549;
                        if (i_452_ >= 0 && i_452_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                            int i_455_;
                            if ((i_455_ = i_453_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                                i_455_ = ((Class129_Sub3.anInt8564 - i_455_) / Class129_Sub3.anInt8564);
                                i_454_ += i_455_;
                                i_453_ += Class129_Sub3.anInt8564 * i_455_;
                                i_451_ += i_455_;
                            }
                            if ((i_455_ = ((i_453_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_454_)
                                i_454_ = i_455_;
                            int i_456_ = is[i_450_] - i;
                            int i_457_ = -is_436_[i_450_];
                            int i_458_ = i_456_ - (i_451_ - Class129_Sub3.anInt8550);
                            if (i_458_ > 0) {
                                i_451_ += i_458_;
                                i_454_ += i_458_;
                                i_452_ += Class129_Sub3.anInt8557 * i_458_;
                                i_453_ += Class129_Sub3.anInt8564 * i_458_;
                            } else
                                i_457_ -= i_458_;
                            if (i_454_ < i_457_)
                                i_454_ = i_457_;
                            for (/**/; i_454_ < 0; i_454_++) {
                                int i_459_ = (aByteArray9990[(((i_453_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_452_ >> 12))]);
                                if (i_459_ != 0)
                                    is_438_[i_451_++] = anIntArray9991[i_459_ & 0xff];
                                else
                                    i_451_++;
                                i_453_ += Class129_Sub3.anInt8564;
                            }
                        }
                    }
                    i_449_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_460_ = Class129_Sub3.anInt8577;
                while (i_460_ < 0) {
                    int i_461_ = i_460_ + i_437_;
                    if (i_461_ >= 0) {
                        if (i_461_ >= is.length)
                            break;
                        int i_462_ = Class129_Sub3.anInt8550;
                        int i_463_ = Class129_Sub3.anInt8558;
                        int i_464_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_465_ = Class129_Sub3.anInt8549;
                        if (i_463_ >= 0 && i_463_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                            if (i_464_ < 0) {
                                int i_466_ = ((Class129_Sub3.anInt8564 - 1 - i_464_) / Class129_Sub3.anInt8564);
                                i_465_ += i_466_;
                                i_464_ += Class129_Sub3.anInt8564 * i_466_;
                                i_462_ += i_466_;
                            }
                            int i_467_;
                            if ((i_467_ = ((1 + i_464_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_465_)
                                i_465_ = i_467_;
                            int i_468_ = is[i_461_] - i;
                            int i_469_ = -is_436_[i_461_];
                            int i_470_ = i_468_ - (i_462_ - Class129_Sub3.anInt8550);
                            if (i_470_ > 0) {
                                i_462_ += i_470_;
                                i_465_ += i_470_;
                                i_463_ += Class129_Sub3.anInt8557 * i_470_;
                                i_464_ += Class129_Sub3.anInt8564 * i_470_;
                            } else
                                i_469_ -= i_470_;
                            if (i_465_ < i_469_)
                                i_465_ = i_469_;
                            for (/**/; i_465_ < 0; i_465_++) {
                                int i_471_ = (aByteArray9990[(((i_464_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_463_ >> 12))]);
                                if (i_471_ != 0)
                                    is_438_[i_462_++] = anIntArray9991[i_471_ & 0xff];
                                else
                                    i_462_++;
                                i_464_ += Class129_Sub3.anInt8564;
                            }
                        }
                    }
                    i_460_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8557 < 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_472_ = Class129_Sub3.anInt8577;
                while (i_472_ < 0) {
                    int i_473_ = i_472_ + i_437_;
                    if (i_473_ >= 0) {
                        if (i_473_ >= is.length)
                            break;
                        int i_474_ = Class129_Sub3.anInt8550;
                        int i_475_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_476_ = Class129_Sub3.anInt8561;
                        int i_477_ = Class129_Sub3.anInt8549;
                        if (i_476_ >= 0 && i_476_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                            int i_478_;
                            if ((i_478_ = i_475_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                                i_478_ = ((Class129_Sub3.anInt8557 - i_478_) / Class129_Sub3.anInt8557);
                                i_477_ += i_478_;
                                i_475_ += Class129_Sub3.anInt8557 * i_478_;
                                i_474_ += i_478_;
                            }
                            if ((i_478_ = ((i_475_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_477_)
                                i_477_ = i_478_;
                            int i_479_ = is[i_473_] - i;
                            int i_480_ = -is_436_[i_473_];
                            int i_481_ = i_479_ - (i_474_ - Class129_Sub3.anInt8550);
                            if (i_481_ > 0) {
                                i_474_ += i_481_;
                                i_477_ += i_481_;
                                i_475_ += Class129_Sub3.anInt8557 * i_481_;
                                i_476_ += Class129_Sub3.anInt8564 * i_481_;
                            } else
                                i_480_ -= i_481_;
                            if (i_477_ < i_480_)
                                i_477_ = i_480_;
                            for (/**/; i_477_ < 0; i_477_++) {
                                int i_482_ = (aByteArray9990[(((i_476_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_475_ >> 12))]);
                                if (i_482_ != 0)
                                    is_438_[i_474_++] = anIntArray9991[i_482_ & 0xff];
                                else
                                    i_474_++;
                                i_475_ += Class129_Sub3.anInt8557;
                            }
                        }
                    }
                    i_472_++;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_483_ = Class129_Sub3.anInt8577;
                while (i_483_ < 0) {
                    int i_484_ = i_483_ + i_437_;
                    if (i_484_ >= 0) {
                        if (i_484_ >= is.length)
                            break;
                        int i_485_ = Class129_Sub3.anInt8550;
                        int i_486_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_487_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_488_ = Class129_Sub3.anInt8549;
                        int i_489_;
                        if ((i_489_ = i_486_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_489_ = ((Class129_Sub3.anInt8557 - i_489_) / Class129_Sub3.anInt8557);
                            i_488_ += i_489_;
                            i_486_ += Class129_Sub3.anInt8557 * i_489_;
                            i_487_ += Class129_Sub3.anInt8564 * i_489_;
                            i_485_ += i_489_;
                        }
                        if ((i_489_ = ((i_486_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_488_)
                            i_488_ = i_489_;
                        if ((i_489_ = i_487_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                            i_489_ = ((Class129_Sub3.anInt8564 - i_489_) / Class129_Sub3.anInt8564);
                            i_488_ += i_489_;
                            i_486_ += Class129_Sub3.anInt8557 * i_489_;
                            i_487_ += Class129_Sub3.anInt8564 * i_489_;
                            i_485_ += i_489_;
                        }
                        if ((i_489_ = ((i_487_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_488_)
                            i_488_ = i_489_;
                        int i_490_ = is[i_484_] - i;
                        int i_491_ = -is_436_[i_484_];
                        int i_492_ = i_490_ - (i_485_ - Class129_Sub3.anInt8550);
                        if (i_492_ > 0) {
                            i_485_ += i_492_;
                            i_488_ += i_492_;
                            i_486_ += Class129_Sub3.anInt8557 * i_492_;
                            i_487_ += Class129_Sub3.anInt8564 * i_492_;
                        } else
                            i_491_ -= i_492_;
                        if (i_488_ < i_491_)
                            i_488_ = i_491_;
                        for (/**/; i_488_ < 0; i_488_++) {
                            int i_493_ = (aByteArray9990[(((i_487_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_486_ >> 12))]);
                            if (i_493_ != 0)
                                is_438_[i_485_++] = anIntArray9991[i_493_ & 0xff];
                            else
                                i_485_++;
                            i_486_ += Class129_Sub3.anInt8557;
                            i_487_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_483_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_494_ = Class129_Sub3.anInt8577;
                while (i_494_ < 0) {
                    int i_495_ = i_494_ + i_437_;
                    if (i_495_ >= 0) {
                        if (i_495_ >= is.length)
                            break;
                        int i_496_ = Class129_Sub3.anInt8550;
                        int i_497_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_498_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_499_ = Class129_Sub3.anInt8549;
                        int i_500_;
                        if ((i_500_ = i_497_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_500_ = ((Class129_Sub3.anInt8557 - i_500_) / Class129_Sub3.anInt8557);
                            i_499_ += i_500_;
                            i_497_ += Class129_Sub3.anInt8557 * i_500_;
                            i_498_ += Class129_Sub3.anInt8564 * i_500_;
                            i_496_ += i_500_;
                        }
                        if ((i_500_ = ((i_497_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_499_)
                            i_499_ = i_500_;
                        if (i_498_ < 0) {
                            i_500_ = ((Class129_Sub3.anInt8564 - 1 - i_498_) / Class129_Sub3.anInt8564);
                            i_499_ += i_500_;
                            i_497_ += Class129_Sub3.anInt8557 * i_500_;
                            i_498_ += Class129_Sub3.anInt8564 * i_500_;
                            i_496_ += i_500_;
                        }
                        if ((i_500_ = ((1 + i_498_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_499_)
                            i_499_ = i_500_;
                        int i_501_ = is[i_495_] - i;
                        int i_502_ = -is_436_[i_495_];
                        int i_503_ = i_501_ - (i_496_ - Class129_Sub3.anInt8550);
                        if (i_503_ > 0) {
                            i_496_ += i_503_;
                            i_499_ += i_503_;
                            i_497_ += Class129_Sub3.anInt8557 * i_503_;
                            i_498_ += Class129_Sub3.anInt8564 * i_503_;
                        } else
                            i_502_ -= i_503_;
                        if (i_499_ < i_502_)
                            i_499_ = i_502_;
                        for (/**/; i_499_ < 0; i_499_++) {
                            int i_504_ = (aByteArray9990[(((i_498_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_497_ >> 12))]);
                            if (i_504_ != 0)
                                is_438_[i_496_++] = anIntArray9991[i_504_ & 0xff];
                            else
                                i_496_++;
                            i_497_ += Class129_Sub3.anInt8557;
                            i_498_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_494_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8564 == 0) {
            int i_505_ = Class129_Sub3.anInt8577;
            while (i_505_ < 0) {
                int i_506_ = i_505_ + i_437_;
                if (i_506_ >= 0) {
                    if (i_506_ >= is.length)
                        break;
                    int i_507_ = Class129_Sub3.anInt8550;
                    int i_508_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_509_ = Class129_Sub3.anInt8561;
                    int i_510_ = Class129_Sub3.anInt8549;
                    if (i_509_ >= 0 && (i_509_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        if (i_508_ < 0) {
                            int i_511_ = ((Class129_Sub3.anInt8557 - 1 - i_508_) / Class129_Sub3.anInt8557);
                            i_510_ += i_511_;
                            i_508_ += Class129_Sub3.anInt8557 * i_511_;
                            i_507_ += i_511_;
                        }
                        int i_512_;
                        if ((i_512_ = ((1 + i_508_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_510_)
                            i_510_ = i_512_;
                        int i_513_ = is[i_506_] - i;
                        int i_514_ = -is_436_[i_506_];
                        int i_515_ = i_513_ - (i_507_ - Class129_Sub3.anInt8550);
                        if (i_515_ > 0) {
                            i_507_ += i_515_;
                            i_510_ += i_515_;
                            i_508_ += Class129_Sub3.anInt8557 * i_515_;
                            i_509_ += Class129_Sub3.anInt8564 * i_515_;
                        } else
                            i_514_ -= i_515_;
                        if (i_510_ < i_514_)
                            i_510_ = i_514_;
                        for (/**/; i_510_ < 0; i_510_++) {
                            int i_516_ = (aByteArray9990[(((i_509_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_508_ >> 12))]);
                            if (i_516_ != 0)
                                is_438_[i_507_++] = anIntArray9991[i_516_ & 0xff];
                            else
                                i_507_++;
                            i_508_ += Class129_Sub3.anInt8557;
                        }
                    }
                }
                i_505_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else if (Class129_Sub3.anInt8564 < 0) {
            int i_517_ = Class129_Sub3.anInt8577;
            while (i_517_ < 0) {
                int i_518_ = i_517_ + i_437_;
                if (i_518_ >= 0) {
                    if (i_518_ >= is.length)
                        break;
                    int i_519_ = Class129_Sub3.anInt8550;
                    int i_520_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_521_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_522_ = Class129_Sub3.anInt8549;
                    if (i_520_ < 0) {
                        int i_523_ = ((Class129_Sub3.anInt8557 - 1 - i_520_) / Class129_Sub3.anInt8557);
                        i_522_ += i_523_;
                        i_520_ += Class129_Sub3.anInt8557 * i_523_;
                        i_521_ += Class129_Sub3.anInt8564 * i_523_;
                        i_519_ += i_523_;
                    }
                    int i_524_;
                    if ((i_524_ = ((1 + i_520_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_522_)
                        i_522_ = i_524_;
                    if ((i_524_ = i_521_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                        i_524_ = ((Class129_Sub3.anInt8564 - i_524_) / Class129_Sub3.anInt8564);
                        i_522_ += i_524_;
                        i_520_ += Class129_Sub3.anInt8557 * i_524_;
                        i_521_ += Class129_Sub3.anInt8564 * i_524_;
                        i_519_ += i_524_;
                    }
                    if ((i_524_ = ((i_521_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_522_)
                        i_522_ = i_524_;
                    int i_525_ = is[i_518_] - i;
                    int i_526_ = -is_436_[i_518_];
                    int i_527_ = i_525_ - (i_519_ - Class129_Sub3.anInt8550);
                    if (i_527_ > 0) {
                        i_519_ += i_527_;
                        i_522_ += i_527_;
                        i_520_ += Class129_Sub3.anInt8557 * i_527_;
                        i_521_ += Class129_Sub3.anInt8564 * i_527_;
                    } else
                        i_526_ -= i_527_;
                    if (i_522_ < i_526_)
                        i_522_ = i_526_;
                    for (/**/; i_522_ < 0; i_522_++) {
                        int i_528_ = (aByteArray9990[(((i_521_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_520_ >> 12))]);
                        if (i_528_ != 0)
                            is_438_[i_519_++] = anIntArray9991[i_528_ & 0xff];
                        else
                            i_519_++;
                        i_520_ += Class129_Sub3.anInt8557;
                        i_521_ += Class129_Sub3.anInt8564;
                    }
                }
                i_517_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else {
            int i_529_ = Class129_Sub3.anInt8577;
            while (i_529_ < 0) {
                int i_530_ = i_529_ + i_437_;
                if (i_530_ >= 0) {
                    if (i_530_ >= is.length)
                        break;
                    int i_531_ = Class129_Sub3.anInt8550;
                    int i_532_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_533_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_534_ = Class129_Sub3.anInt8549;
                    if (i_532_ < 0) {
                        int i_535_ = ((Class129_Sub3.anInt8557 - 1 - i_532_) / Class129_Sub3.anInt8557);
                        i_534_ += i_535_;
                        i_532_ += Class129_Sub3.anInt8557 * i_535_;
                        i_533_ += Class129_Sub3.anInt8564 * i_535_;
                        i_531_ += i_535_;
                    }
                    int i_536_;
                    if ((i_536_ = ((1 + i_532_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_534_)
                        i_534_ = i_536_;
                    if (i_533_ < 0) {
                        i_536_ = ((Class129_Sub3.anInt8564 - 1 - i_533_) / Class129_Sub3.anInt8564);
                        i_534_ += i_536_;
                        i_532_ += Class129_Sub3.anInt8557 * i_536_;
                        i_533_ += Class129_Sub3.anInt8564 * i_536_;
                        i_531_ += i_536_;
                    }
                    if ((i_536_ = ((1 + i_533_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_534_)
                        i_534_ = i_536_;
                    int i_537_ = is[i_530_] - i;
                    int i_538_ = -is_436_[i_530_];
                    int i_539_ = i_537_ - (i_531_ - Class129_Sub3.anInt8550);
                    if (i_539_ > 0) {
                        i_531_ += i_539_;
                        i_534_ += i_539_;
                        i_532_ += Class129_Sub3.anInt8557 * i_539_;
                        i_533_ += Class129_Sub3.anInt8564 * i_539_;
                    } else
                        i_538_ -= i_539_;
                    if (i_534_ < i_538_)
                        i_534_ = i_538_;
                    for (/**/; i_534_ < 0; i_534_++) {
                        int i_540_ = (aByteArray9990[(((i_533_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_532_ >> 12))]);
                        if (i_540_ != 0)
                            is_438_[i_531_++] = anIntArray9991[i_540_ & 0xff];
                        else
                            i_531_++;
                        i_532_ += Class129_Sub3.anInt8557;
                        i_533_ += Class129_Sub3.anInt8564;
                    }
                }
                i_529_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        }
    }

    final void method1164(int i, int i_541_, aa var_aa, int i_542_, int i_543_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        i += ((Class129_Sub3) this).anInt8566;
        i_541_ += ((Class129_Sub3) this).anInt8571;
        int i_544_ = 0;
        int i_545_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        int i_546_ = ((Class129_Sub3) this).anInt8548;
        int i_547_ = ((Class129_Sub3) this).anInt8569;
        int i_548_ = i_545_ - i_546_;
        int i_549_ = 0;
        int i_550_ = i + i_541_ * i_545_;
        if (i_541_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
            int i_551_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578 - i_541_);
            i_547_ -= i_551_;
            i_541_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578;
            i_544_ += i_551_ * i_546_;
            i_550_ += i_551_ * i_545_;
        }
        if (i_541_ + i_547_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
            i_547_ -= i_541_ + i_547_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
        if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
            int i_552_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575 - i);
            i_546_ -= i_552_;
            i = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575;
            i_544_ += i_552_;
            i_550_ += i_552_;
            i_549_ += i_552_;
            i_548_ += i_552_;
        }
        if (i + i_546_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
            int i_553_ = (i + i_546_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
            i_546_ -= i_553_;
            i_549_ += i_553_;
            i_548_ += i_553_;
        }
        if (i_546_ > 0 && i_547_ > 0) {
            aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
            int[] is = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
            int[] is_554_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
            int[] is_555_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            int i_556_ = i_541_;
            if (i_543_ > i_556_) {
                i_556_ = i_543_;
                i_550_ += (i_543_ - i_541_) * i_545_;
                i_544_ += (i_543_ - i_541_) * ((Class129_Sub3) this).anInt8548;
            }
            int i_557_ = (i_543_ + is.length < i_541_ + i_547_ ? i_543_ + is.length : i_541_ + i_547_);
            for (int i_558_ = i_556_; i_558_ < i_557_; i_558_++) {
                int i_559_ = is[i_558_ - i_543_] + i_542_;
                int i_560_ = is_554_[i_558_ - i_543_];
                int i_561_ = i_546_;
                if (i > i_559_) {
                    int i_562_ = i - i_559_;
                    if (i_562_ >= i_560_) {
                        i_544_ += i_546_ + i_549_;
                        i_550_ += i_546_ + i_548_;
                        continue;
                    }
                    i_560_ -= i_562_;
                } else {
                    int i_563_ = i_559_ - i;
                    if (i_563_ >= i_546_) {
                        i_544_ += i_546_ + i_549_;
                        i_550_ += i_546_ + i_548_;
                        continue;
                    }
                    i_544_ += i_563_;
                    i_561_ -= i_563_;
                    i_550_ += i_563_;
                }
                int i_564_ = 0;
                if (i_561_ < i_560_)
                    i_560_ = i_561_;
                else
                    i_564_ = i_561_ - i_560_;
                for (int i_565_ = -i_560_; i_565_ < 0; i_565_++) {
                    int i_566_ = aByteArray9990[i_544_++];
                    if (i_566_ != 0)
                        is_555_[i_550_++] = anIntArray9991[i_566_ & 0xff];
                    else
                        i_550_++;
                }
                i_544_ += i_564_ + i_549_;
                i_550_ += i_564_ + i_548_;
            }
        }
    }

    final void method1193(int i, int i_567_) {
        int[] is = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        if (Class129_Sub3.anInt8557 == 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_568_ = Class129_Sub3.anInt8577;
                while (i_568_ < 0) {
                    int i_569_ = Class129_Sub3.anInt8550;
                    int i_570_ = Class129_Sub3.anInt8558;
                    int i_571_ = Class129_Sub3.anInt8561;
                    int i_572_ = Class129_Sub3.anInt8549;
                    if (i_570_ >= 0 && i_571_ >= 0 && (i_570_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) && (i_571_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        for (/**/; i_572_ < 0; i_572_++) {
                            int i_573_ = (((i_571_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_570_ >> 12));
                            int i_574_ = i_569_++;
                            int[] is_575_ = is;
                            int i_576_ = i;
                            int i_577_ = i_567_;
                            if (i_577_ == 0) {
                                if (i_576_ == 1)
                                    is_575_[i_574_] = (anIntArray9991[aByteArray9990[i_573_] & 0xff]);
                                else if (i_576_ == 0) {
                                    int i_578_ = (anIntArray9991[aByteArray9990[i_573_] & 0xff]);
                                    int i_579_ = (((i_578_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_580_ = (((i_578_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_581_ = (((i_578_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_575_[i_574_] = (i_579_ | i_580_ | i_581_) >>> 8;
                                } else if (i_576_ == 3) {
                                    int i_582_ = (anIntArray9991[aByteArray9990[i_573_] & 0xff]);
                                    int i_583_ = Class129_Sub3.anInt8565;
                                    int i_584_ = i_582_ + i_583_;
                                    int i_585_ = ((i_582_ & 0xff00ff) + (i_583_ & 0xff00ff));
                                    int i_586_ = ((i_585_ & 0x1000100) + (i_584_ - i_585_ & 0x10000));
                                    is_575_[i_574_] = i_584_ - i_586_ | i_586_ - (i_586_ >>> 8);
                                } else if (i_576_ == 2) {
                                    int i_587_ = (anIntArray9991[aByteArray9990[i_573_] & 0xff]);
                                    int i_588_ = (((i_587_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_589_ = (((i_587_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_575_[i_574_] = (((i_588_ | i_589_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_577_ == 1) {
                                if (i_576_ == 1) {
                                    int i_590_ = aByteArray9990[i_573_];
                                    if (i_590_ != 0)
                                        is_575_[i_574_] = anIntArray9991[i_590_ & 0xff];
                                } else if (i_576_ == 0) {
                                    int i_591_ = aByteArray9990[i_573_];
                                    if (i_591_ != 0) {
                                        int i_592_ = anIntArray9991[i_591_ & 0xff];
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_593_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_594_ = 256 - i_593_;
                                            int i_595_ = is_575_[i_574_];
                                            is_575_[i_574_] = (((((i_592_ & 0xff00ff) * i_593_) + ((i_595_ & 0xff00ff) * i_594_)) & ~0xff00ff) + ((((i_592_ & 0xff00) * i_593_) + ((i_595_ & 0xff00) * i_594_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_596_ = (((i_592_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_597_ = (((i_592_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_598_ = (((i_592_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_592_ = (i_596_ | i_597_ | i_598_) >>> 8;
                                            int i_599_ = is_575_[i_574_];
                                            is_575_[i_574_] = (((((i_592_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_599_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_592_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_599_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_600_ = (((i_592_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_601_ = (((i_592_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_602_ = (((i_592_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_575_[i_574_] = (i_600_ | i_601_ | i_602_) >>> 8;
                                        }
                                    }
                                } else if (i_576_ == 3) {
                                    byte i_603_ = aByteArray9990[i_573_];
                                    int i_604_ = (i_603_ > 0 ? anIntArray9991[i_603_] : 0);
                                    int i_605_ = Class129_Sub3.anInt8565;
                                    int i_606_ = i_604_ + i_605_;
                                    int i_607_ = ((i_604_ & 0xff00ff) + (i_605_ & 0xff00ff));
                                    int i_608_ = ((i_607_ & 0x1000100) + (i_606_ - i_607_ & 0x10000));
                                    i_608_ = i_606_ - i_608_ | i_608_ - (i_608_ >>> 8);
                                    if (i_604_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_604_ = i_608_;
                                        i_608_ = is_575_[i_574_];
                                        i_608_ = (((((i_604_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_608_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_604_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_608_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_575_[i_574_] = i_608_;
                                } else if (i_576_ == 2) {
                                    int i_609_ = aByteArray9990[i_573_];
                                    if (i_609_ != 0) {
                                        int i_610_ = anIntArray9991[i_609_ & 0xff];
                                        int i_611_ = (((i_610_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_612_ = (((i_610_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_575_[i_574_++] = (((i_611_ | i_612_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_577_ == 2) {
                                if (i_576_ == 1) {
                                    int i_613_ = aByteArray9990[i_573_];
                                    if (i_613_ != 0) {
                                        int i_614_ = anIntArray9991[i_613_ & 0xff];
                                        int i_615_ = is_575_[i_574_];
                                        int i_616_ = i_614_ + i_615_;
                                        int i_617_ = ((i_614_ & 0xff00ff) + (i_615_ & 0xff00ff));
                                        i_615_ = ((i_617_ & 0x1000100) + (i_616_ - i_617_ & 0x10000));
                                        is_575_[i_574_] = (i_616_ - i_615_ | i_615_ - (i_615_ >>> 8));
                                    }
                                } else if (i_576_ == 0) {
                                    int i_618_ = aByteArray9990[i_573_];
                                    if (i_618_ != 0) {
                                        int i_619_ = anIntArray9991[i_618_ & 0xff];
                                        int i_620_ = (((i_619_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_621_ = (((i_619_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_622_ = (((i_619_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_619_ = (i_620_ | i_621_ | i_622_) >>> 8;
                                        int i_623_ = is_575_[i_574_];
                                        int i_624_ = i_619_ + i_623_;
                                        int i_625_ = ((i_619_ & 0xff00ff) + (i_623_ & 0xff00ff));
                                        i_623_ = ((i_625_ & 0x1000100) + (i_624_ - i_625_ & 0x10000));
                                        is_575_[i_574_] = (i_624_ - i_623_ | i_623_ - (i_623_ >>> 8));
                                    }
                                } else if (i_576_ == 3) {
                                    byte i_626_ = aByteArray9990[i_573_];
                                    int i_627_ = (i_626_ > 0 ? anIntArray9991[i_626_] : 0);
                                    int i_628_ = Class129_Sub3.anInt8565;
                                    int i_629_ = i_627_ + i_628_;
                                    int i_630_ = ((i_627_ & 0xff00ff) + (i_628_ & 0xff00ff));
                                    int i_631_ = ((i_630_ & 0x1000100) + (i_629_ - i_630_ & 0x10000));
                                    i_631_ = i_629_ - i_631_ | i_631_ - (i_631_ >>> 8);
                                    if (i_627_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_627_ = i_631_;
                                        i_631_ = is_575_[i_574_];
                                        i_631_ = (((((i_627_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_631_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_627_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_631_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_575_[i_574_] = i_631_;
                                } else if (i_576_ == 2) {
                                    int i_632_ = aByteArray9990[i_573_];
                                    if (i_632_ != 0) {
                                        int i_633_ = anIntArray9991[i_632_ & 0xff];
                                        int i_634_ = (((i_633_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_635_ = (((i_633_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_633_ = (((i_634_ | i_635_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_636_ = is_575_[i_574_];
                                        int i_637_ = i_633_ + i_636_;
                                        int i_638_ = ((i_633_ & 0xff00ff) + (i_636_ & 0xff00ff));
                                        i_636_ = ((i_638_ & 0x1000100) + (i_637_ - i_638_ & 0x10000));
                                        is_575_[i_574_] = (i_637_ - i_636_ | i_636_ - (i_636_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    i_568_++;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_639_ = Class129_Sub3.anInt8577;
                while (i_639_ < 0) {
                    int i_640_ = Class129_Sub3.anInt8550;
                    int i_641_ = Class129_Sub3.anInt8558;
                    int i_642_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_643_ = Class129_Sub3.anInt8549;
                    if (i_641_ >= 0 && (i_641_ - (((Class129_Sub3) this).anInt8548 << 12) < 0)) {
                        int i_644_;
                        if ((i_644_ = i_642_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                            i_644_ = ((Class129_Sub3.anInt8564 - i_644_) / Class129_Sub3.anInt8564);
                            i_643_ += i_644_;
                            i_642_ += Class129_Sub3.anInt8564 * i_644_;
                            i_640_ += i_644_;
                        }
                        if ((i_644_ = ((i_642_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_643_)
                            i_643_ = i_644_;
                        for (/**/; i_643_ < 0; i_643_++) {
                            int i_645_ = (((i_642_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_641_ >> 12));
                            int i_646_ = i_640_++;
                            int[] is_647_ = is;
                            int i_648_ = i;
                            int i_649_ = i_567_;
                            if (i_649_ == 0) {
                                if (i_648_ == 1)
                                    is_647_[i_646_] = (anIntArray9991[aByteArray9990[i_645_] & 0xff]);
                                else if (i_648_ == 0) {
                                    int i_650_ = (anIntArray9991[aByteArray9990[i_645_] & 0xff]);
                                    int i_651_ = (((i_650_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_652_ = (((i_650_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_653_ = (((i_650_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_647_[i_646_] = (i_651_ | i_652_ | i_653_) >>> 8;
                                } else if (i_648_ == 3) {
                                    int i_654_ = (anIntArray9991[aByteArray9990[i_645_] & 0xff]);
                                    int i_655_ = Class129_Sub3.anInt8565;
                                    int i_656_ = i_654_ + i_655_;
                                    int i_657_ = ((i_654_ & 0xff00ff) + (i_655_ & 0xff00ff));
                                    int i_658_ = ((i_657_ & 0x1000100) + (i_656_ - i_657_ & 0x10000));
                                    is_647_[i_646_] = i_656_ - i_658_ | i_658_ - (i_658_ >>> 8);
                                } else if (i_648_ == 2) {
                                    int i_659_ = (anIntArray9991[aByteArray9990[i_645_] & 0xff]);
                                    int i_660_ = (((i_659_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_661_ = (((i_659_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_647_[i_646_] = (((i_660_ | i_661_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_649_ == 1) {
                                if (i_648_ == 1) {
                                    int i_662_ = aByteArray9990[i_645_];
                                    if (i_662_ != 0)
                                        is_647_[i_646_] = anIntArray9991[i_662_ & 0xff];
                                } else if (i_648_ == 0) {
                                    int i_663_ = aByteArray9990[i_645_];
                                    if (i_663_ != 0) {
                                        int i_664_ = anIntArray9991[i_663_ & 0xff];
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_665_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_666_ = 256 - i_665_;
                                            int i_667_ = is_647_[i_646_];
                                            is_647_[i_646_] = (((((i_664_ & 0xff00ff) * i_665_) + ((i_667_ & 0xff00ff) * i_666_)) & ~0xff00ff) + ((((i_664_ & 0xff00) * i_665_) + ((i_667_ & 0xff00) * i_666_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_668_ = (((i_664_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_669_ = (((i_664_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_670_ = (((i_664_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_664_ = (i_668_ | i_669_ | i_670_) >>> 8;
                                            int i_671_ = is_647_[i_646_];
                                            is_647_[i_646_] = (((((i_664_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_671_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_664_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_671_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_672_ = (((i_664_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_673_ = (((i_664_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_674_ = (((i_664_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_647_[i_646_] = (i_672_ | i_673_ | i_674_) >>> 8;
                                        }
                                    }
                                } else if (i_648_ == 3) {
                                    byte i_675_ = aByteArray9990[i_645_];
                                    int i_676_ = (i_675_ > 0 ? anIntArray9991[i_675_] : 0);
                                    int i_677_ = Class129_Sub3.anInt8565;
                                    int i_678_ = i_676_ + i_677_;
                                    int i_679_ = ((i_676_ & 0xff00ff) + (i_677_ & 0xff00ff));
                                    int i_680_ = ((i_679_ & 0x1000100) + (i_678_ - i_679_ & 0x10000));
                                    i_680_ = i_678_ - i_680_ | i_680_ - (i_680_ >>> 8);
                                    if (i_676_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_676_ = i_680_;
                                        i_680_ = is_647_[i_646_];
                                        i_680_ = (((((i_676_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_680_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_676_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_680_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_647_[i_646_] = i_680_;
                                } else if (i_648_ == 2) {
                                    int i_681_ = aByteArray9990[i_645_];
                                    if (i_681_ != 0) {
                                        int i_682_ = anIntArray9991[i_681_ & 0xff];
                                        int i_683_ = (((i_682_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_684_ = (((i_682_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_647_[i_646_++] = (((i_683_ | i_684_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_649_ == 2) {
                                if (i_648_ == 1) {
                                    int i_685_ = aByteArray9990[i_645_];
                                    if (i_685_ != 0) {
                                        int i_686_ = anIntArray9991[i_685_ & 0xff];
                                        int i_687_ = is_647_[i_646_];
                                        int i_688_ = i_686_ + i_687_;
                                        int i_689_ = ((i_686_ & 0xff00ff) + (i_687_ & 0xff00ff));
                                        i_687_ = ((i_689_ & 0x1000100) + (i_688_ - i_689_ & 0x10000));
                                        is_647_[i_646_] = (i_688_ - i_687_ | i_687_ - (i_687_ >>> 8));
                                    }
                                } else if (i_648_ == 0) {
                                    int i_690_ = aByteArray9990[i_645_];
                                    if (i_690_ != 0) {
                                        int i_691_ = anIntArray9991[i_690_ & 0xff];
                                        int i_692_ = (((i_691_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_693_ = (((i_691_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_694_ = (((i_691_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_691_ = (i_692_ | i_693_ | i_694_) >>> 8;
                                        int i_695_ = is_647_[i_646_];
                                        int i_696_ = i_691_ + i_695_;
                                        int i_697_ = ((i_691_ & 0xff00ff) + (i_695_ & 0xff00ff));
                                        i_695_ = ((i_697_ & 0x1000100) + (i_696_ - i_697_ & 0x10000));
                                        is_647_[i_646_] = (i_696_ - i_695_ | i_695_ - (i_695_ >>> 8));
                                    }
                                } else if (i_648_ == 3) {
                                    byte i_698_ = aByteArray9990[i_645_];
                                    int i_699_ = (i_698_ > 0 ? anIntArray9991[i_698_] : 0);
                                    int i_700_ = Class129_Sub3.anInt8565;
                                    int i_701_ = i_699_ + i_700_;
                                    int i_702_ = ((i_699_ & 0xff00ff) + (i_700_ & 0xff00ff));
                                    int i_703_ = ((i_702_ & 0x1000100) + (i_701_ - i_702_ & 0x10000));
                                    i_703_ = i_701_ - i_703_ | i_703_ - (i_703_ >>> 8);
                                    if (i_699_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_699_ = i_703_;
                                        i_703_ = is_647_[i_646_];
                                        i_703_ = (((((i_699_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_703_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_699_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_703_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_647_[i_646_] = i_703_;
                                } else if (i_648_ == 2) {
                                    int i_704_ = aByteArray9990[i_645_];
                                    if (i_704_ != 0) {
                                        int i_705_ = anIntArray9991[i_704_ & 0xff];
                                        int i_706_ = (((i_705_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_707_ = (((i_705_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_705_ = (((i_706_ | i_707_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_708_ = is_647_[i_646_];
                                        int i_709_ = i_705_ + i_708_;
                                        int i_710_ = ((i_705_ & 0xff00ff) + (i_708_ & 0xff00ff));
                                        i_708_ = ((i_710_ & 0x1000100) + (i_709_ - i_710_ & 0x10000));
                                        is_647_[i_646_] = (i_709_ - i_708_ | i_708_ - (i_708_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_642_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_639_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_711_ = Class129_Sub3.anInt8577;
                while (i_711_ < 0) {
                    int i_712_ = Class129_Sub3.anInt8550;
                    int i_713_ = Class129_Sub3.anInt8558;
                    int i_714_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_715_ = Class129_Sub3.anInt8549;
                    if (i_713_ >= 0 && (i_713_ - (((Class129_Sub3) this).anInt8548 << 12) < 0)) {
                        if (i_714_ < 0) {
                            int i_716_ = ((Class129_Sub3.anInt8564 - 1 - i_714_) / Class129_Sub3.anInt8564);
                            i_715_ += i_716_;
                            i_714_ += Class129_Sub3.anInt8564 * i_716_;
                            i_712_ += i_716_;
                        }
                        int i_717_;
                        if ((i_717_ = ((1 + i_714_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_715_)
                            i_715_ = i_717_;
                        for (/**/; i_715_ < 0; i_715_++) {
                            int i_718_ = (((i_714_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_713_ >> 12));
                            int i_719_ = i_712_++;
                            int[] is_720_ = is;
                            int i_721_ = i;
                            int i_722_ = i_567_;
                            if (i_722_ == 0) {
                                if (i_721_ == 1)
                                    is_720_[i_719_] = (anIntArray9991[aByteArray9990[i_718_] & 0xff]);
                                else if (i_721_ == 0) {
                                    int i_723_ = (anIntArray9991[aByteArray9990[i_718_] & 0xff]);
                                    int i_724_ = (((i_723_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_725_ = (((i_723_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_726_ = (((i_723_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_720_[i_719_] = (i_724_ | i_725_ | i_726_) >>> 8;
                                } else if (i_721_ == 3) {
                                    int i_727_ = (anIntArray9991[aByteArray9990[i_718_] & 0xff]);
                                    int i_728_ = Class129_Sub3.anInt8565;
                                    int i_729_ = i_727_ + i_728_;
                                    int i_730_ = ((i_727_ & 0xff00ff) + (i_728_ & 0xff00ff));
                                    int i_731_ = ((i_730_ & 0x1000100) + (i_729_ - i_730_ & 0x10000));
                                    is_720_[i_719_] = i_729_ - i_731_ | i_731_ - (i_731_ >>> 8);
                                } else if (i_721_ == 2) {
                                    int i_732_ = (anIntArray9991[aByteArray9990[i_718_] & 0xff]);
                                    int i_733_ = (((i_732_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_734_ = (((i_732_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_720_[i_719_] = (((i_733_ | i_734_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_722_ == 1) {
                                if (i_721_ == 1) {
                                    int i_735_ = aByteArray9990[i_718_];
                                    if (i_735_ != 0)
                                        is_720_[i_719_] = anIntArray9991[i_735_ & 0xff];
                                } else if (i_721_ == 0) {
                                    int i_736_ = aByteArray9990[i_718_];
                                    if (i_736_ != 0) {
                                        int i_737_ = anIntArray9991[i_736_ & 0xff];
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_738_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_739_ = 256 - i_738_;
                                            int i_740_ = is_720_[i_719_];
                                            is_720_[i_719_] = (((((i_737_ & 0xff00ff) * i_738_) + ((i_740_ & 0xff00ff) * i_739_)) & ~0xff00ff) + ((((i_737_ & 0xff00) * i_738_) + ((i_740_ & 0xff00) * i_739_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_741_ = (((i_737_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_742_ = (((i_737_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_743_ = (((i_737_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_737_ = (i_741_ | i_742_ | i_743_) >>> 8;
                                            int i_744_ = is_720_[i_719_];
                                            is_720_[i_719_] = (((((i_737_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_744_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_737_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_744_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_745_ = (((i_737_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_746_ = (((i_737_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_747_ = (((i_737_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_720_[i_719_] = (i_745_ | i_746_ | i_747_) >>> 8;
                                        }
                                    }
                                } else if (i_721_ == 3) {
                                    byte i_748_ = aByteArray9990[i_718_];
                                    int i_749_ = (i_748_ > 0 ? anIntArray9991[i_748_] : 0);
                                    int i_750_ = Class129_Sub3.anInt8565;
                                    int i_751_ = i_749_ + i_750_;
                                    int i_752_ = ((i_749_ & 0xff00ff) + (i_750_ & 0xff00ff));
                                    int i_753_ = ((i_752_ & 0x1000100) + (i_751_ - i_752_ & 0x10000));
                                    i_753_ = i_751_ - i_753_ | i_753_ - (i_753_ >>> 8);
                                    if (i_749_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_749_ = i_753_;
                                        i_753_ = is_720_[i_719_];
                                        i_753_ = (((((i_749_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_753_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_749_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_753_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_720_[i_719_] = i_753_;
                                } else if (i_721_ == 2) {
                                    int i_754_ = aByteArray9990[i_718_];
                                    if (i_754_ != 0) {
                                        int i_755_ = anIntArray9991[i_754_ & 0xff];
                                        int i_756_ = (((i_755_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_757_ = (((i_755_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_720_[i_719_++] = (((i_756_ | i_757_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_722_ == 2) {
                                if (i_721_ == 1) {
                                    int i_758_ = aByteArray9990[i_718_];
                                    if (i_758_ != 0) {
                                        int i_759_ = anIntArray9991[i_758_ & 0xff];
                                        int i_760_ = is_720_[i_719_];
                                        int i_761_ = i_759_ + i_760_;
                                        int i_762_ = ((i_759_ & 0xff00ff) + (i_760_ & 0xff00ff));
                                        i_760_ = ((i_762_ & 0x1000100) + (i_761_ - i_762_ & 0x10000));
                                        is_720_[i_719_] = (i_761_ - i_760_ | i_760_ - (i_760_ >>> 8));
                                    }
                                } else if (i_721_ == 0) {
                                    int i_763_ = aByteArray9990[i_718_];
                                    if (i_763_ != 0) {
                                        int i_764_ = anIntArray9991[i_763_ & 0xff];
                                        int i_765_ = (((i_764_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_766_ = (((i_764_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_767_ = (((i_764_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_764_ = (i_765_ | i_766_ | i_767_) >>> 8;
                                        int i_768_ = is_720_[i_719_];
                                        int i_769_ = i_764_ + i_768_;
                                        int i_770_ = ((i_764_ & 0xff00ff) + (i_768_ & 0xff00ff));
                                        i_768_ = ((i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000));
                                        is_720_[i_719_] = (i_769_ - i_768_ | i_768_ - (i_768_ >>> 8));
                                    }
                                } else if (i_721_ == 3) {
                                    byte i_771_ = aByteArray9990[i_718_];
                                    int i_772_ = (i_771_ > 0 ? anIntArray9991[i_771_] : 0);
                                    int i_773_ = Class129_Sub3.anInt8565;
                                    int i_774_ = i_772_ + i_773_;
                                    int i_775_ = ((i_772_ & 0xff00ff) + (i_773_ & 0xff00ff));
                                    int i_776_ = ((i_775_ & 0x1000100) + (i_774_ - i_775_ & 0x10000));
                                    i_776_ = i_774_ - i_776_ | i_776_ - (i_776_ >>> 8);
                                    if (i_772_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_772_ = i_776_;
                                        i_776_ = is_720_[i_719_];
                                        i_776_ = (((((i_772_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_776_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_772_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_776_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_720_[i_719_] = i_776_;
                                } else if (i_721_ == 2) {
                                    int i_777_ = aByteArray9990[i_718_];
                                    if (i_777_ != 0) {
                                        int i_778_ = anIntArray9991[i_777_ & 0xff];
                                        int i_779_ = (((i_778_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_780_ = (((i_778_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_778_ = (((i_779_ | i_780_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_781_ = is_720_[i_719_];
                                        int i_782_ = i_778_ + i_781_;
                                        int i_783_ = ((i_778_ & 0xff00ff) + (i_781_ & 0xff00ff));
                                        i_781_ = ((i_783_ & 0x1000100) + (i_782_ - i_783_ & 0x10000));
                                        is_720_[i_719_] = (i_782_ - i_781_ | i_781_ - (i_781_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_714_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_711_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8557 < 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_784_ = Class129_Sub3.anInt8577;
                while (i_784_ < 0) {
                    int i_785_ = Class129_Sub3.anInt8550;
                    int i_786_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_787_ = Class129_Sub3.anInt8561;
                    int i_788_ = Class129_Sub3.anInt8549;
                    if (i_787_ >= 0 && (i_787_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        int i_789_;
                        if ((i_789_ = i_786_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_789_ = ((Class129_Sub3.anInt8557 - i_789_) / Class129_Sub3.anInt8557);
                            i_788_ += i_789_;
                            i_786_ += Class129_Sub3.anInt8557 * i_789_;
                            i_785_ += i_789_;
                        }
                        if ((i_789_ = ((i_786_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_788_)
                            i_788_ = i_789_;
                        for (/**/; i_788_ < 0; i_788_++) {
                            int i_790_ = (((i_787_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_786_ >> 12));
                            int i_791_ = i_785_++;
                            int[] is_792_ = is;
                            int i_793_ = i;
                            int i_794_ = i_567_;
                            if (i_794_ == 0) {
                                if (i_793_ == 1)
                                    is_792_[i_791_] = (anIntArray9991[aByteArray9990[i_790_] & 0xff]);
                                else if (i_793_ == 0) {
                                    int i_795_ = (anIntArray9991[aByteArray9990[i_790_] & 0xff]);
                                    int i_796_ = (((i_795_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_797_ = (((i_795_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_798_ = (((i_795_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_792_[i_791_] = (i_796_ | i_797_ | i_798_) >>> 8;
                                } else if (i_793_ == 3) {
                                    int i_799_ = (anIntArray9991[aByteArray9990[i_790_] & 0xff]);
                                    int i_800_ = Class129_Sub3.anInt8565;
                                    int i_801_ = i_799_ + i_800_;
                                    int i_802_ = ((i_799_ & 0xff00ff) + (i_800_ & 0xff00ff));
                                    int i_803_ = ((i_802_ & 0x1000100) + (i_801_ - i_802_ & 0x10000));
                                    is_792_[i_791_] = i_801_ - i_803_ | i_803_ - (i_803_ >>> 8);
                                } else if (i_793_ == 2) {
                                    int i_804_ = (anIntArray9991[aByteArray9990[i_790_] & 0xff]);
                                    int i_805_ = (((i_804_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_806_ = (((i_804_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_792_[i_791_] = (((i_805_ | i_806_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_794_ == 1) {
                                if (i_793_ == 1) {
                                    int i_807_ = aByteArray9990[i_790_];
                                    if (i_807_ != 0)
                                        is_792_[i_791_] = anIntArray9991[i_807_ & 0xff];
                                } else if (i_793_ == 0) {
                                    int i_808_ = aByteArray9990[i_790_];
                                    if (i_808_ != 0) {
                                        int i_809_ = anIntArray9991[i_808_ & 0xff];
                                        if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                            int i_810_ = (Class129_Sub3.anInt8565 >>> 24);
                                            int i_811_ = 256 - i_810_;
                                            int i_812_ = is_792_[i_791_];
                                            is_792_[i_791_] = (((((i_809_ & 0xff00ff) * i_810_) + ((i_812_ & 0xff00ff) * i_811_)) & ~0xff00ff) + ((((i_809_ & 0xff00) * i_810_) + ((i_812_ & 0xff00) * i_811_)) & 0xff0000)) >> 8;
                                        } else if (Class129_Sub3.anInt8567 != 255) {
                                            int i_813_ = (((i_809_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_814_ = (((i_809_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_815_ = (((i_809_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            i_809_ = (i_813_ | i_814_ | i_815_) >>> 8;
                                            int i_816_ = is_792_[i_791_];
                                            is_792_[i_791_] = (((((i_809_ & 0xff00ff) * (Class129_Sub3.anInt8567)) + ((i_816_ & 0xff00ff) * (Class129_Sub3.anInt8573))) & ~0xff00ff) + ((((i_809_ & 0xff00) * (Class129_Sub3.anInt8567)) + ((i_816_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                        } else {
                                            int i_817_ = (((i_809_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                            int i_818_ = (((i_809_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                            int i_819_ = (((i_809_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                            is_792_[i_791_] = (i_817_ | i_818_ | i_819_) >>> 8;
                                        }
                                    }
                                } else if (i_793_ == 3) {
                                    byte i_820_ = aByteArray9990[i_790_];
                                    int i_821_ = (i_820_ > 0 ? anIntArray9991[i_820_] : 0);
                                    int i_822_ = Class129_Sub3.anInt8565;
                                    int i_823_ = i_821_ + i_822_;
                                    int i_824_ = ((i_821_ & 0xff00ff) + (i_822_ & 0xff00ff));
                                    int i_825_ = ((i_824_ & 0x1000100) + (i_823_ - i_824_ & 0x10000));
                                    i_825_ = i_823_ - i_825_ | i_825_ - (i_825_ >>> 8);
                                    if (i_821_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_821_ = i_825_;
                                        i_825_ = is_792_[i_791_];
                                        i_825_ = (((((i_821_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_825_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_821_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_825_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_792_[i_791_] = i_825_;
                                } else if (i_793_ == 2) {
                                    int i_826_ = aByteArray9990[i_790_];
                                    if (i_826_ != 0) {
                                        int i_827_ = anIntArray9991[i_826_ & 0xff];
                                        int i_828_ = (((i_827_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_829_ = (((i_827_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        is_792_[i_791_++] = (((i_828_ | i_829_) >>> 8) + Class129_Sub3.anInt8553);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_794_ == 2) {
                                if (i_793_ == 1) {
                                    int i_830_ = aByteArray9990[i_790_];
                                    if (i_830_ != 0) {
                                        int i_831_ = anIntArray9991[i_830_ & 0xff];
                                        int i_832_ = is_792_[i_791_];
                                        int i_833_ = i_831_ + i_832_;
                                        int i_834_ = ((i_831_ & 0xff00ff) + (i_832_ & 0xff00ff));
                                        i_832_ = ((i_834_ & 0x1000100) + (i_833_ - i_834_ & 0x10000));
                                        is_792_[i_791_] = (i_833_ - i_832_ | i_832_ - (i_832_ >>> 8));
                                    }
                                } else if (i_793_ == 0) {
                                    int i_835_ = aByteArray9990[i_790_];
                                    if (i_835_ != 0) {
                                        int i_836_ = anIntArray9991[i_835_ & 0xff];
                                        int i_837_ = (((i_836_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_838_ = (((i_836_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_839_ = (((i_836_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_836_ = (i_837_ | i_838_ | i_839_) >>> 8;
                                        int i_840_ = is_792_[i_791_];
                                        int i_841_ = i_836_ + i_840_;
                                        int i_842_ = ((i_836_ & 0xff00ff) + (i_840_ & 0xff00ff));
                                        i_840_ = ((i_842_ & 0x1000100) + (i_841_ - i_842_ & 0x10000));
                                        is_792_[i_791_] = (i_841_ - i_840_ | i_840_ - (i_840_ >>> 8));
                                    }
                                } else if (i_793_ == 3) {
                                    byte i_843_ = aByteArray9990[i_790_];
                                    int i_844_ = (i_843_ > 0 ? anIntArray9991[i_843_] : 0);
                                    int i_845_ = Class129_Sub3.anInt8565;
                                    int i_846_ = i_844_ + i_845_;
                                    int i_847_ = ((i_844_ & 0xff00ff) + (i_845_ & 0xff00ff));
                                    int i_848_ = ((i_847_ & 0x1000100) + (i_846_ - i_847_ & 0x10000));
                                    i_848_ = i_846_ - i_848_ | i_848_ - (i_848_ >>> 8);
                                    if (i_844_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                        i_844_ = i_848_;
                                        i_848_ = is_792_[i_791_];
                                        i_848_ = (((((i_844_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_848_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_844_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_848_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    }
                                    is_792_[i_791_] = i_848_;
                                } else if (i_793_ == 2) {
                                    int i_849_ = aByteArray9990[i_790_];
                                    if (i_849_ != 0) {
                                        int i_850_ = anIntArray9991[i_849_ & 0xff];
                                        int i_851_ = (((i_850_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                        int i_852_ = (((i_850_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                        i_850_ = (((i_851_ | i_852_) >>> 8) + Class129_Sub3.anInt8553);
                                        int i_853_ = is_792_[i_791_];
                                        int i_854_ = i_850_ + i_853_;
                                        int i_855_ = ((i_850_ & 0xff00ff) + (i_853_ & 0xff00ff));
                                        i_853_ = ((i_855_ & 0x1000100) + (i_854_ - i_855_ & 0x10000));
                                        is_792_[i_791_] = (i_854_ - i_853_ | i_853_ - (i_853_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_786_ += Class129_Sub3.anInt8557;
                        }
                    }
                    i_784_++;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_856_ = Class129_Sub3.anInt8577;
                while (i_856_ < 0) {
                    int i_857_ = Class129_Sub3.anInt8550;
                    int i_858_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_859_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_860_ = Class129_Sub3.anInt8549;
                    int i_861_;
                    if ((i_861_ = i_858_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                        i_861_ = ((Class129_Sub3.anInt8557 - i_861_) / Class129_Sub3.anInt8557);
                        i_860_ += i_861_;
                        i_858_ += Class129_Sub3.anInt8557 * i_861_;
                        i_859_ += Class129_Sub3.anInt8564 * i_861_;
                        i_857_ += i_861_;
                    }
                    if ((i_861_ = ((i_858_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_860_)
                        i_860_ = i_861_;
                    if ((i_861_ = i_859_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                        i_861_ = ((Class129_Sub3.anInt8564 - i_861_) / Class129_Sub3.anInt8564);
                        i_860_ += i_861_;
                        i_858_ += Class129_Sub3.anInt8557 * i_861_;
                        i_859_ += Class129_Sub3.anInt8564 * i_861_;
                        i_857_ += i_861_;
                    }
                    if ((i_861_ = ((i_859_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_860_)
                        i_860_ = i_861_;
                    for (/**/; i_860_ < 0; i_860_++) {
                        int i_862_ = (((i_859_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_858_ >> 12));
                        int i_863_ = i_857_++;
                        int[] is_864_ = is;
                        int i_865_ = i;
                        int i_866_ = i_567_;
                        if (i_866_ == 0) {
                            if (i_865_ == 1)
                                is_864_[i_863_] = (anIntArray9991[aByteArray9990[i_862_] & 0xff]);
                            else if (i_865_ == 0) {
                                int i_867_ = (anIntArray9991[aByteArray9990[i_862_] & 0xff]);
                                int i_868_ = (((i_867_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_869_ = (((i_867_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_870_ = (((i_867_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_864_[i_863_] = (i_868_ | i_869_ | i_870_) >>> 8;
                            } else if (i_865_ == 3) {
                                int i_871_ = (anIntArray9991[aByteArray9990[i_862_] & 0xff]);
                                int i_872_ = Class129_Sub3.anInt8565;
                                int i_873_ = i_871_ + i_872_;
                                int i_874_ = ((i_871_ & 0xff00ff) + (i_872_ & 0xff00ff));
                                int i_875_ = ((i_874_ & 0x1000100) + (i_873_ - i_874_ & 0x10000));
                                is_864_[i_863_] = i_873_ - i_875_ | i_875_ - (i_875_ >>> 8);
                            } else if (i_865_ == 2) {
                                int i_876_ = (anIntArray9991[aByteArray9990[i_862_] & 0xff]);
                                int i_877_ = (((i_876_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_878_ = (((i_876_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_864_[i_863_] = (((i_877_ | i_878_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_866_ == 1) {
                            if (i_865_ == 1) {
                                int i_879_ = aByteArray9990[i_862_];
                                if (i_879_ != 0)
                                    is_864_[i_863_] = anIntArray9991[i_879_ & 0xff];
                            } else if (i_865_ == 0) {
                                int i_880_ = aByteArray9990[i_862_];
                                if (i_880_ != 0) {
                                    int i_881_ = anIntArray9991[i_880_ & 0xff];
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_882_ = Class129_Sub3.anInt8565 >>> 24;
                                        int i_883_ = 256 - i_882_;
                                        int i_884_ = is_864_[i_863_];
                                        is_864_[i_863_] = ((((i_881_ & 0xff00ff) * i_882_ + ((i_884_ & 0xff00ff) * i_883_)) & ~0xff00ff) + (((i_881_ & 0xff00) * i_882_ + ((i_884_ & 0xff00) * i_883_)) & 0xff0000)) >> 8;
                                    } else if (Class129_Sub3.anInt8567 != 255) {
                                        int i_885_ = (((i_881_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_886_ = (((i_881_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_887_ = (((i_881_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_881_ = (i_885_ | i_886_ | i_887_) >>> 8;
                                        int i_888_ = is_864_[i_863_];
                                        is_864_[i_863_] = (((((i_881_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_888_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_881_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_888_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    } else {
                                        int i_889_ = (((i_881_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_890_ = (((i_881_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_891_ = (((i_881_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_864_[i_863_] = (i_889_ | i_890_ | i_891_) >>> 8;
                                    }
                                }
                            } else if (i_865_ == 3) {
                                byte i_892_ = aByteArray9990[i_862_];
                                int i_893_ = i_892_ > 0 ? anIntArray9991[i_892_] : 0;
                                int i_894_ = Class129_Sub3.anInt8565;
                                int i_895_ = i_893_ + i_894_;
                                int i_896_ = ((i_893_ & 0xff00ff) + (i_894_ & 0xff00ff));
                                int i_897_ = ((i_896_ & 0x1000100) + (i_895_ - i_896_ & 0x10000));
                                i_897_ = i_895_ - i_897_ | i_897_ - (i_897_ >>> 8);
                                if (i_893_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_893_ = i_897_;
                                    i_897_ = is_864_[i_863_];
                                    i_897_ = (((((i_893_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_897_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_893_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_897_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_864_[i_863_] = i_897_;
                            } else if (i_865_ == 2) {
                                int i_898_ = aByteArray9990[i_862_];
                                if (i_898_ != 0) {
                                    int i_899_ = anIntArray9991[i_898_ & 0xff];
                                    int i_900_ = (((i_899_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_901_ = (((i_899_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_864_[i_863_++] = (((i_900_ | i_901_) >>> 8) + Class129_Sub3.anInt8553);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_866_ == 2) {
                            if (i_865_ == 1) {
                                int i_902_ = aByteArray9990[i_862_];
                                if (i_902_ != 0) {
                                    int i_903_ = anIntArray9991[i_902_ & 0xff];
                                    int i_904_ = is_864_[i_863_];
                                    int i_905_ = i_903_ + i_904_;
                                    int i_906_ = ((i_903_ & 0xff00ff) + (i_904_ & 0xff00ff));
                                    i_904_ = ((i_906_ & 0x1000100) + (i_905_ - i_906_ & 0x10000));
                                    is_864_[i_863_] = i_905_ - i_904_ | i_904_ - (i_904_ >>> 8);
                                }
                            } else if (i_865_ == 0) {
                                int i_907_ = aByteArray9990[i_862_];
                                if (i_907_ != 0) {
                                    int i_908_ = anIntArray9991[i_907_ & 0xff];
                                    int i_909_ = (((i_908_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_910_ = (((i_908_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_911_ = (((i_908_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_908_ = (i_909_ | i_910_ | i_911_) >>> 8;
                                    int i_912_ = is_864_[i_863_];
                                    int i_913_ = i_908_ + i_912_;
                                    int i_914_ = ((i_908_ & 0xff00ff) + (i_912_ & 0xff00ff));
                                    i_912_ = ((i_914_ & 0x1000100) + (i_913_ - i_914_ & 0x10000));
                                    is_864_[i_863_] = i_913_ - i_912_ | i_912_ - (i_912_ >>> 8);
                                }
                            } else if (i_865_ == 3) {
                                byte i_915_ = aByteArray9990[i_862_];
                                int i_916_ = i_915_ > 0 ? anIntArray9991[i_915_] : 0;
                                int i_917_ = Class129_Sub3.anInt8565;
                                int i_918_ = i_916_ + i_917_;
                                int i_919_ = ((i_916_ & 0xff00ff) + (i_917_ & 0xff00ff));
                                int i_920_ = ((i_919_ & 0x1000100) + (i_918_ - i_919_ & 0x10000));
                                i_920_ = i_918_ - i_920_ | i_920_ - (i_920_ >>> 8);
                                if (i_916_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_916_ = i_920_;
                                    i_920_ = is_864_[i_863_];
                                    i_920_ = (((((i_916_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_920_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_916_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_920_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_864_[i_863_] = i_920_;
                            } else if (i_865_ == 2) {
                                int i_921_ = aByteArray9990[i_862_];
                                if (i_921_ != 0) {
                                    int i_922_ = anIntArray9991[i_921_ & 0xff];
                                    int i_923_ = (((i_922_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_924_ = (((i_922_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_922_ = (((i_923_ | i_924_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_925_ = is_864_[i_863_];
                                    int i_926_ = i_922_ + i_925_;
                                    int i_927_ = ((i_922_ & 0xff00ff) + (i_925_ & 0xff00ff));
                                    i_925_ = ((i_927_ & 0x1000100) + (i_926_ - i_927_ & 0x10000));
                                    is_864_[i_863_] = i_926_ - i_925_ | i_925_ - (i_925_ >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_858_ += Class129_Sub3.anInt8557;
                        i_859_ += Class129_Sub3.anInt8564;
                    }
                    i_856_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_928_ = Class129_Sub3.anInt8577;
                while (i_928_ < 0) {
                    int i_929_ = Class129_Sub3.anInt8550;
                    int i_930_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_931_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_932_ = Class129_Sub3.anInt8549;
                    int i_933_;
                    if ((i_933_ = i_930_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                        i_933_ = ((Class129_Sub3.anInt8557 - i_933_) / Class129_Sub3.anInt8557);
                        i_932_ += i_933_;
                        i_930_ += Class129_Sub3.anInt8557 * i_933_;
                        i_931_ += Class129_Sub3.anInt8564 * i_933_;
                        i_929_ += i_933_;
                    }
                    if ((i_933_ = ((i_930_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_932_)
                        i_932_ = i_933_;
                    if (i_931_ < 0) {
                        i_933_ = ((Class129_Sub3.anInt8564 - 1 - i_931_) / Class129_Sub3.anInt8564);
                        i_932_ += i_933_;
                        i_930_ += Class129_Sub3.anInt8557 * i_933_;
                        i_931_ += Class129_Sub3.anInt8564 * i_933_;
                        i_929_ += i_933_;
                    }
                    if ((i_933_ = ((1 + i_931_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_932_)
                        i_932_ = i_933_;
                    for (/**/; i_932_ < 0; i_932_++) {
                        int i_934_ = (((i_931_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_930_ >> 12));
                        int i_935_ = i_929_++;
                        int[] is_936_ = is;
                        int i_937_ = i;
                        int i_938_ = i_567_;
                        if (i_938_ == 0) {
                            if (i_937_ == 1)
                                is_936_[i_935_] = (anIntArray9991[aByteArray9990[i_934_] & 0xff]);
                            else if (i_937_ == 0) {
                                int i_939_ = (anIntArray9991[aByteArray9990[i_934_] & 0xff]);
                                int i_940_ = (((i_939_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_941_ = (((i_939_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_942_ = (((i_939_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_936_[i_935_] = (i_940_ | i_941_ | i_942_) >>> 8;
                            } else if (i_937_ == 3) {
                                int i_943_ = (anIntArray9991[aByteArray9990[i_934_] & 0xff]);
                                int i_944_ = Class129_Sub3.anInt8565;
                                int i_945_ = i_943_ + i_944_;
                                int i_946_ = ((i_943_ & 0xff00ff) + (i_944_ & 0xff00ff));
                                int i_947_ = ((i_946_ & 0x1000100) + (i_945_ - i_946_ & 0x10000));
                                is_936_[i_935_] = i_945_ - i_947_ | i_947_ - (i_947_ >>> 8);
                            } else if (i_937_ == 2) {
                                int i_948_ = (anIntArray9991[aByteArray9990[i_934_] & 0xff]);
                                int i_949_ = (((i_948_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_950_ = (((i_948_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_936_[i_935_] = (((i_949_ | i_950_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_938_ == 1) {
                            if (i_937_ == 1) {
                                int i_951_ = aByteArray9990[i_934_];
                                if (i_951_ != 0)
                                    is_936_[i_935_] = anIntArray9991[i_951_ & 0xff];
                            } else if (i_937_ == 0) {
                                int i_952_ = aByteArray9990[i_934_];
                                if (i_952_ != 0) {
                                    int i_953_ = anIntArray9991[i_952_ & 0xff];
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_954_ = Class129_Sub3.anInt8565 >>> 24;
                                        int i_955_ = 256 - i_954_;
                                        int i_956_ = is_936_[i_935_];
                                        is_936_[i_935_] = ((((i_953_ & 0xff00ff) * i_954_ + ((i_956_ & 0xff00ff) * i_955_)) & ~0xff00ff) + (((i_953_ & 0xff00) * i_954_ + ((i_956_ & 0xff00) * i_955_)) & 0xff0000)) >> 8;
                                    } else if (Class129_Sub3.anInt8567 != 255) {
                                        int i_957_ = (((i_953_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_958_ = (((i_953_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_959_ = (((i_953_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_953_ = (i_957_ | i_958_ | i_959_) >>> 8;
                                        int i_960_ = is_936_[i_935_];
                                        is_936_[i_935_] = (((((i_953_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_960_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_953_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_960_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    } else {
                                        int i_961_ = (((i_953_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_962_ = (((i_953_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_963_ = (((i_953_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_936_[i_935_] = (i_961_ | i_962_ | i_963_) >>> 8;
                                    }
                                }
                            } else if (i_937_ == 3) {
                                byte i_964_ = aByteArray9990[i_934_];
                                int i_965_ = i_964_ > 0 ? anIntArray9991[i_964_] : 0;
                                int i_966_ = Class129_Sub3.anInt8565;
                                int i_967_ = i_965_ + i_966_;
                                int i_968_ = ((i_965_ & 0xff00ff) + (i_966_ & 0xff00ff));
                                int i_969_ = ((i_968_ & 0x1000100) + (i_967_ - i_968_ & 0x10000));
                                i_969_ = i_967_ - i_969_ | i_969_ - (i_969_ >>> 8);
                                if (i_965_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_965_ = i_969_;
                                    i_969_ = is_936_[i_935_];
                                    i_969_ = (((((i_965_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_969_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_965_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_969_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_936_[i_935_] = i_969_;
                            } else if (i_937_ == 2) {
                                int i_970_ = aByteArray9990[i_934_];
                                if (i_970_ != 0) {
                                    int i_971_ = anIntArray9991[i_970_ & 0xff];
                                    int i_972_ = (((i_971_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_973_ = (((i_971_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_936_[i_935_++] = (((i_972_ | i_973_) >>> 8) + Class129_Sub3.anInt8553);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_938_ == 2) {
                            if (i_937_ == 1) {
                                int i_974_ = aByteArray9990[i_934_];
                                if (i_974_ != 0) {
                                    int i_975_ = anIntArray9991[i_974_ & 0xff];
                                    int i_976_ = is_936_[i_935_];
                                    int i_977_ = i_975_ + i_976_;
                                    int i_978_ = ((i_975_ & 0xff00ff) + (i_976_ & 0xff00ff));
                                    i_976_ = ((i_978_ & 0x1000100) + (i_977_ - i_978_ & 0x10000));
                                    is_936_[i_935_] = i_977_ - i_976_ | i_976_ - (i_976_ >>> 8);
                                }
                            } else if (i_937_ == 0) {
                                int i_979_ = aByteArray9990[i_934_];
                                if (i_979_ != 0) {
                                    int i_980_ = anIntArray9991[i_979_ & 0xff];
                                    int i_981_ = (((i_980_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_982_ = (((i_980_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_983_ = (((i_980_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_980_ = (i_981_ | i_982_ | i_983_) >>> 8;
                                    int i_984_ = is_936_[i_935_];
                                    int i_985_ = i_980_ + i_984_;
                                    int i_986_ = ((i_980_ & 0xff00ff) + (i_984_ & 0xff00ff));
                                    i_984_ = ((i_986_ & 0x1000100) + (i_985_ - i_986_ & 0x10000));
                                    is_936_[i_935_] = i_985_ - i_984_ | i_984_ - (i_984_ >>> 8);
                                }
                            } else if (i_937_ == 3) {
                                byte i_987_ = aByteArray9990[i_934_];
                                int i_988_ = i_987_ > 0 ? anIntArray9991[i_987_] : 0;
                                int i_989_ = Class129_Sub3.anInt8565;
                                int i_990_ = i_988_ + i_989_;
                                int i_991_ = ((i_988_ & 0xff00ff) + (i_989_ & 0xff00ff));
                                int i_992_ = ((i_991_ & 0x1000100) + (i_990_ - i_991_ & 0x10000));
                                i_992_ = i_990_ - i_992_ | i_992_ - (i_992_ >>> 8);
                                if (i_988_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_988_ = i_992_;
                                    i_992_ = is_936_[i_935_];
                                    i_992_ = (((((i_988_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_992_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_988_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_992_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_936_[i_935_] = i_992_;
                            } else if (i_937_ == 2) {
                                int i_993_ = aByteArray9990[i_934_];
                                if (i_993_ != 0) {
                                    int i_994_ = anIntArray9991[i_993_ & 0xff];
                                    int i_995_ = (((i_994_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_996_ = (((i_994_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_994_ = (((i_995_ | i_996_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_997_ = is_936_[i_935_];
                                    int i_998_ = i_994_ + i_997_;
                                    int i_999_ = ((i_994_ & 0xff00ff) + (i_997_ & 0xff00ff));
                                    i_997_ = ((i_999_ & 0x1000100) + (i_998_ - i_999_ & 0x10000));
                                    is_936_[i_935_] = i_998_ - i_997_ | i_997_ - (i_997_ >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_930_ += Class129_Sub3.anInt8557;
                        i_931_ += Class129_Sub3.anInt8564;
                    }
                    i_928_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8564 == 0) {
            int i_1000_ = Class129_Sub3.anInt8577;
            while (i_1000_ < 0) {
                int i_1001_ = Class129_Sub3.anInt8550;
                int i_1002_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_1003_ = Class129_Sub3.anInt8561;
                int i_1004_ = Class129_Sub3.anInt8549;
                if (i_1003_ >= 0 && i_1003_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                    if (i_1002_ < 0) {
                        int i_1005_ = ((Class129_Sub3.anInt8557 - 1 - i_1002_) / Class129_Sub3.anInt8557);
                        i_1004_ += i_1005_;
                        i_1002_ += Class129_Sub3.anInt8557 * i_1005_;
                        i_1001_ += i_1005_;
                    }
                    int i_1006_;
                    if ((i_1006_ = ((1 + i_1002_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1004_)
                        i_1004_ = i_1006_;
                    for (/**/; i_1004_ < 0; i_1004_++) {
                        int i_1007_ = (((i_1003_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1002_ >> 12));
                        int i_1008_ = i_1001_++;
                        int[] is_1009_ = is;
                        int i_1010_ = i;
                        int i_1011_ = i_567_;
                        if (i_1011_ == 0) {
                            if (i_1010_ == 1)
                                is_1009_[i_1008_] = (anIntArray9991[aByteArray9990[i_1007_] & 0xff]);
                            else if (i_1010_ == 0) {
                                int i_1012_ = (anIntArray9991[aByteArray9990[i_1007_] & 0xff]);
                                int i_1013_ = (((i_1012_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_1014_ = (((i_1012_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_1015_ = (((i_1012_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_1009_[i_1008_] = (i_1013_ | i_1014_ | i_1015_) >>> 8;
                            } else if (i_1010_ == 3) {
                                int i_1016_ = (anIntArray9991[aByteArray9990[i_1007_] & 0xff]);
                                int i_1017_ = Class129_Sub3.anInt8565;
                                int i_1018_ = i_1016_ + i_1017_;
                                int i_1019_ = ((i_1016_ & 0xff00ff) + (i_1017_ & 0xff00ff));
                                int i_1020_ = ((i_1019_ & 0x1000100) + (i_1018_ - i_1019_ & 0x10000));
                                is_1009_[i_1008_] = i_1018_ - i_1020_ | i_1020_ - (i_1020_ >>> 8);
                            } else if (i_1010_ == 2) {
                                int i_1021_ = (anIntArray9991[aByteArray9990[i_1007_] & 0xff]);
                                int i_1022_ = (((i_1021_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1023_ = (((i_1021_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_1009_[i_1008_] = (((i_1022_ | i_1023_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_1011_ == 1) {
                            if (i_1010_ == 1) {
                                int i_1024_ = aByteArray9990[i_1007_];
                                if (i_1024_ != 0)
                                    is_1009_[i_1008_] = anIntArray9991[i_1024_ & 0xff];
                            } else if (i_1010_ == 0) {
                                int i_1025_ = aByteArray9990[i_1007_];
                                if (i_1025_ != 0) {
                                    int i_1026_ = anIntArray9991[i_1025_ & 0xff];
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_1027_ = Class129_Sub3.anInt8565 >>> 24;
                                        int i_1028_ = 256 - i_1027_;
                                        int i_1029_ = is_1009_[i_1008_];
                                        is_1009_[i_1008_] = ((((i_1026_ & 0xff00ff) * i_1027_ + ((i_1029_ & 0xff00ff) * i_1028_)) & ~0xff00ff) + (((i_1026_ & 0xff00) * i_1027_ + ((i_1029_ & 0xff00) * i_1028_)) & 0xff0000)) >> 8;
                                    } else if (Class129_Sub3.anInt8567 != 255) {
                                        int i_1030_ = (((i_1026_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_1031_ = (((i_1026_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_1032_ = (((i_1026_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_1026_ = (i_1030_ | i_1031_ | i_1032_) >>> 8;
                                        int i_1033_ = is_1009_[i_1008_];
                                        is_1009_[i_1008_] = (((((i_1026_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1033_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1026_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1033_ & 0xff00) * (Class129_Sub3.anInt8573))) & 0xff0000)) >> 8;
                                    } else {
                                        int i_1034_ = (((i_1026_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_1035_ = (((i_1026_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_1036_ = (((i_1026_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_1009_[i_1008_] = (i_1034_ | i_1035_ | i_1036_) >>> 8;
                                    }
                                }
                            } else if (i_1010_ == 3) {
                                byte i_1037_ = aByteArray9990[i_1007_];
                                int i_1038_ = (i_1037_ > 0 ? anIntArray9991[i_1037_] : 0);
                                int i_1039_ = Class129_Sub3.anInt8565;
                                int i_1040_ = i_1038_ + i_1039_;
                                int i_1041_ = ((i_1038_ & 0xff00ff) + (i_1039_ & 0xff00ff));
                                int i_1042_ = ((i_1041_ & 0x1000100) + (i_1040_ - i_1041_ & 0x10000));
                                i_1042_ = i_1040_ - i_1042_ | i_1042_ - (i_1042_ >>> 8);
                                if (i_1038_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_1038_ = i_1042_;
                                    i_1042_ = is_1009_[i_1008_];
                                    i_1042_ = (((((i_1038_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1042_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1038_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1042_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_1009_[i_1008_] = i_1042_;
                            } else if (i_1010_ == 2) {
                                int i_1043_ = aByteArray9990[i_1007_];
                                if (i_1043_ != 0) {
                                    int i_1044_ = anIntArray9991[i_1043_ & 0xff];
                                    int i_1045_ = (((i_1044_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_1046_ = (((i_1044_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_1009_[i_1008_++] = (((i_1045_ | i_1046_) >>> 8) + Class129_Sub3.anInt8553);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_1011_ == 2) {
                            if (i_1010_ == 1) {
                                int i_1047_ = aByteArray9990[i_1007_];
                                if (i_1047_ != 0) {
                                    int i_1048_ = anIntArray9991[i_1047_ & 0xff];
                                    int i_1049_ = is_1009_[i_1008_];
                                    int i_1050_ = i_1048_ + i_1049_;
                                    int i_1051_ = ((i_1048_ & 0xff00ff) + (i_1049_ & 0xff00ff));
                                    i_1049_ = ((i_1051_ & 0x1000100) + (i_1050_ - i_1051_ & 0x10000));
                                    is_1009_[i_1008_] = (i_1050_ - i_1049_ | i_1049_ - (i_1049_ >>> 8));
                                }
                            } else if (i_1010_ == 0) {
                                int i_1052_ = aByteArray9990[i_1007_];
                                if (i_1052_ != 0) {
                                    int i_1053_ = anIntArray9991[i_1052_ & 0xff];
                                    int i_1054_ = (((i_1053_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_1055_ = (((i_1053_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_1056_ = (((i_1053_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_1053_ = (i_1054_ | i_1055_ | i_1056_) >>> 8;
                                    int i_1057_ = is_1009_[i_1008_];
                                    int i_1058_ = i_1053_ + i_1057_;
                                    int i_1059_ = ((i_1053_ & 0xff00ff) + (i_1057_ & 0xff00ff));
                                    i_1057_ = ((i_1059_ & 0x1000100) + (i_1058_ - i_1059_ & 0x10000));
                                    is_1009_[i_1008_] = (i_1058_ - i_1057_ | i_1057_ - (i_1057_ >>> 8));
                                }
                            } else if (i_1010_ == 3) {
                                byte i_1060_ = aByteArray9990[i_1007_];
                                int i_1061_ = (i_1060_ > 0 ? anIntArray9991[i_1060_] : 0);
                                int i_1062_ = Class129_Sub3.anInt8565;
                                int i_1063_ = i_1061_ + i_1062_;
                                int i_1064_ = ((i_1061_ & 0xff00ff) + (i_1062_ & 0xff00ff));
                                int i_1065_ = ((i_1064_ & 0x1000100) + (i_1063_ - i_1064_ & 0x10000));
                                i_1065_ = i_1063_ - i_1065_ | i_1065_ - (i_1065_ >>> 8);
                                if (i_1061_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                    i_1061_ = i_1065_;
                                    i_1065_ = is_1009_[i_1008_];
                                    i_1065_ = (((((i_1061_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1065_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1061_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1065_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                }
                                is_1009_[i_1008_] = i_1065_;
                            } else if (i_1010_ == 2) {
                                int i_1066_ = aByteArray9990[i_1007_];
                                if (i_1066_ != 0) {
                                    int i_1067_ = anIntArray9991[i_1066_ & 0xff];
                                    int i_1068_ = (((i_1067_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_1069_ = (((i_1067_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_1067_ = (((i_1068_ | i_1069_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_1070_ = is_1009_[i_1008_];
                                    int i_1071_ = i_1067_ + i_1070_;
                                    int i_1072_ = ((i_1067_ & 0xff00ff) + (i_1070_ & 0xff00ff));
                                    i_1070_ = ((i_1072_ & 0x1000100) + (i_1071_ - i_1072_ & 0x10000));
                                    is_1009_[i_1008_] = (i_1071_ - i_1070_ | i_1070_ - (i_1070_ >>> 8));
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_1002_ += Class129_Sub3.anInt8557;
                    }
                }
                i_1000_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else if (Class129_Sub3.anInt8564 < 0) {
            for (int i_1073_ = Class129_Sub3.anInt8577; i_1073_ < 0; i_1073_++) {
                int i_1074_ = Class129_Sub3.anInt8550;
                int i_1075_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_1076_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                int i_1077_ = Class129_Sub3.anInt8549;
                if (i_1075_ < 0) {
                    int i_1078_ = ((Class129_Sub3.anInt8557 - 1 - i_1075_) / Class129_Sub3.anInt8557);
                    i_1077_ += i_1078_;
                    i_1075_ += Class129_Sub3.anInt8557 * i_1078_;
                    i_1076_ += Class129_Sub3.anInt8564 * i_1078_;
                    i_1074_ += i_1078_;
                }
                int i_1079_;
                if ((i_1079_ = (1 + i_1075_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557) > i_1077_)
                    i_1077_ = i_1079_;
                if ((i_1079_ = i_1076_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                    i_1079_ = ((Class129_Sub3.anInt8564 - i_1079_) / Class129_Sub3.anInt8564);
                    i_1077_ += i_1079_;
                    i_1075_ += Class129_Sub3.anInt8557 * i_1079_;
                    i_1076_ += Class129_Sub3.anInt8564 * i_1079_;
                    i_1074_ += i_1079_;
                }
                if ((i_1079_ = ((i_1076_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1077_)
                    i_1077_ = i_1079_;
                for (/**/; i_1077_ < 0; i_1077_++) {
                    int i_1080_ = ((i_1076_ >> 12) * ((Class129_Sub3) this).anInt8548 + (i_1075_ >> 12));
                    int i_1081_ = i_1074_++;
                    int[] is_1082_ = is;
                    int i_1083_ = i;
                    int i_1084_ = i_567_;
                    if (i_1084_ == 0) {
                        if (i_1083_ == 1)
                            is_1082_[i_1081_] = (anIntArray9991[aByteArray9990[i_1080_] & 0xff]);
                        else if (i_1083_ == 0) {
                            int i_1085_ = (anIntArray9991[aByteArray9990[i_1080_] & 0xff]);
                            int i_1086_ = (((i_1085_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_1087_ = ((i_1085_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_1088_ = ((i_1085_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            is_1082_[i_1081_] = (i_1086_ | i_1087_ | i_1088_) >>> 8;
                        } else if (i_1083_ == 3) {
                            int i_1089_ = (anIntArray9991[aByteArray9990[i_1080_] & 0xff]);
                            int i_1090_ = Class129_Sub3.anInt8565;
                            int i_1091_ = i_1089_ + i_1090_;
                            int i_1092_ = (i_1089_ & 0xff00ff) + (i_1090_ & 0xff00ff);
                            int i_1093_ = ((i_1092_ & 0x1000100) + (i_1091_ - i_1092_ & 0x10000));
                            is_1082_[i_1081_] = i_1091_ - i_1093_ | i_1093_ - (i_1093_ >>> 8);
                        } else if (i_1083_ == 2) {
                            int i_1094_ = (anIntArray9991[aByteArray9990[i_1080_] & 0xff]);
                            int i_1095_ = (((i_1094_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_1096_ = ((i_1094_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            is_1082_[i_1081_] = (((i_1095_ | i_1096_) >>> 8) + Class129_Sub3.anInt8553);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1084_ == 1) {
                        if (i_1083_ == 1) {
                            int i_1097_ = aByteArray9990[i_1080_];
                            if (i_1097_ != 0)
                                is_1082_[i_1081_] = anIntArray9991[i_1097_ & 0xff];
                        } else if (i_1083_ == 0) {
                            int i_1098_ = aByteArray9990[i_1080_];
                            if (i_1098_ != 0) {
                                int i_1099_ = anIntArray9991[i_1098_ & 0xff];
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_1100_ = Class129_Sub3.anInt8565 >>> 24;
                                    int i_1101_ = 256 - i_1100_;
                                    int i_1102_ = is_1082_[i_1081_];
                                    is_1082_[i_1081_] = ((((i_1099_ & 0xff00ff) * i_1100_ + (i_1102_ & 0xff00ff) * i_1101_) & ~0xff00ff) + (((i_1099_ & 0xff00) * i_1100_ + (i_1102_ & 0xff00) * i_1101_) & 0xff0000)) >> 8;
                                } else if (Class129_Sub3.anInt8567 != 255) {
                                    int i_1103_ = (((i_1099_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_1104_ = (((i_1099_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_1105_ = (((i_1099_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_1099_ = (i_1103_ | i_1104_ | i_1105_) >>> 8;
                                    int i_1106_ = is_1082_[i_1081_];
                                    is_1082_[i_1081_] = (((((i_1099_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1106_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1099_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1106_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                } else {
                                    int i_1107_ = (((i_1099_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_1108_ = (((i_1099_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_1109_ = (((i_1099_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_1082_[i_1081_] = (i_1107_ | i_1108_ | i_1109_) >>> 8;
                                }
                            }
                        } else if (i_1083_ == 3) {
                            byte i_1110_ = aByteArray9990[i_1080_];
                            int i_1111_ = i_1110_ > 0 ? anIntArray9991[i_1110_] : 0;
                            int i_1112_ = Class129_Sub3.anInt8565;
                            int i_1113_ = i_1111_ + i_1112_;
                            int i_1114_ = (i_1111_ & 0xff00ff) + (i_1112_ & 0xff00ff);
                            int i_1115_ = ((i_1114_ & 0x1000100) + (i_1113_ - i_1114_ & 0x10000));
                            i_1115_ = i_1113_ - i_1115_ | i_1115_ - (i_1115_ >>> 8);
                            if (i_1111_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                i_1111_ = i_1115_;
                                i_1115_ = is_1082_[i_1081_];
                                i_1115_ = (((((i_1111_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1115_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1111_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1115_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                            }
                            is_1082_[i_1081_] = i_1115_;
                        } else if (i_1083_ == 2) {
                            int i_1116_ = aByteArray9990[i_1080_];
                            if (i_1116_ != 0) {
                                int i_1117_ = anIntArray9991[i_1116_ & 0xff];
                                int i_1118_ = (((i_1117_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1119_ = (((i_1117_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_1082_[i_1081_++] = (((i_1118_ | i_1119_) >>> 8) + Class129_Sub3.anInt8553);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1084_ == 2) {
                        if (i_1083_ == 1) {
                            int i_1120_ = aByteArray9990[i_1080_];
                            if (i_1120_ != 0) {
                                int i_1121_ = anIntArray9991[i_1120_ & 0xff];
                                int i_1122_ = is_1082_[i_1081_];
                                int i_1123_ = i_1121_ + i_1122_;
                                int i_1124_ = ((i_1121_ & 0xff00ff) + (i_1122_ & 0xff00ff));
                                i_1122_ = ((i_1124_ & 0x1000100) + (i_1123_ - i_1124_ & 0x10000));
                                is_1082_[i_1081_] = i_1123_ - i_1122_ | i_1122_ - (i_1122_ >>> 8);
                            }
                        } else if (i_1083_ == 0) {
                            int i_1125_ = aByteArray9990[i_1080_];
                            if (i_1125_ != 0) {
                                int i_1126_ = anIntArray9991[i_1125_ & 0xff];
                                int i_1127_ = (((i_1126_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_1128_ = (((i_1126_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_1129_ = (((i_1126_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_1126_ = (i_1127_ | i_1128_ | i_1129_) >>> 8;
                                int i_1130_ = is_1082_[i_1081_];
                                int i_1131_ = i_1126_ + i_1130_;
                                int i_1132_ = ((i_1126_ & 0xff00ff) + (i_1130_ & 0xff00ff));
                                i_1130_ = ((i_1132_ & 0x1000100) + (i_1131_ - i_1132_ & 0x10000));
                                is_1082_[i_1081_] = i_1131_ - i_1130_ | i_1130_ - (i_1130_ >>> 8);
                            }
                        } else if (i_1083_ == 3) {
                            byte i_1133_ = aByteArray9990[i_1080_];
                            int i_1134_ = i_1133_ > 0 ? anIntArray9991[i_1133_] : 0;
                            int i_1135_ = Class129_Sub3.anInt8565;
                            int i_1136_ = i_1134_ + i_1135_;
                            int i_1137_ = (i_1134_ & 0xff00ff) + (i_1135_ & 0xff00ff);
                            int i_1138_ = ((i_1137_ & 0x1000100) + (i_1136_ - i_1137_ & 0x10000));
                            i_1138_ = i_1136_ - i_1138_ | i_1138_ - (i_1138_ >>> 8);
                            if (i_1134_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                i_1134_ = i_1138_;
                                i_1138_ = is_1082_[i_1081_];
                                i_1138_ = (((((i_1134_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1138_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1134_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1138_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                            }
                            is_1082_[i_1081_] = i_1138_;
                        } else if (i_1083_ == 2) {
                            int i_1139_ = aByteArray9990[i_1080_];
                            if (i_1139_ != 0) {
                                int i_1140_ = anIntArray9991[i_1139_ & 0xff];
                                int i_1141_ = (((i_1140_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1142_ = (((i_1140_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_1140_ = (((i_1141_ | i_1142_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_1143_ = is_1082_[i_1081_];
                                int i_1144_ = i_1140_ + i_1143_;
                                int i_1145_ = ((i_1140_ & 0xff00ff) + (i_1143_ & 0xff00ff));
                                i_1143_ = ((i_1145_ & 0x1000100) + (i_1144_ - i_1145_ & 0x10000));
                                is_1082_[i_1081_] = i_1144_ - i_1143_ | i_1143_ - (i_1143_ >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_1075_ += Class129_Sub3.anInt8557;
                    i_1076_ += Class129_Sub3.anInt8564;
                }
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else {
            for (int i_1146_ = Class129_Sub3.anInt8577; i_1146_ < 0; i_1146_++) {
                int i_1147_ = Class129_Sub3.anInt8550;
                int i_1148_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_1149_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                int i_1150_ = Class129_Sub3.anInt8549;
                if (i_1148_ < 0) {
                    int i_1151_ = ((Class129_Sub3.anInt8557 - 1 - i_1148_) / Class129_Sub3.anInt8557);
                    i_1150_ += i_1151_;
                    i_1148_ += Class129_Sub3.anInt8557 * i_1151_;
                    i_1149_ += Class129_Sub3.anInt8564 * i_1151_;
                    i_1147_ += i_1151_;
                }
                int i_1152_;
                if ((i_1152_ = (1 + i_1148_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557) > i_1150_)
                    i_1150_ = i_1152_;
                if (i_1149_ < 0) {
                    i_1152_ = ((Class129_Sub3.anInt8564 - 1 - i_1149_) / Class129_Sub3.anInt8564);
                    i_1150_ += i_1152_;
                    i_1148_ += Class129_Sub3.anInt8557 * i_1152_;
                    i_1149_ += Class129_Sub3.anInt8564 * i_1152_;
                    i_1147_ += i_1152_;
                }
                if ((i_1152_ = (1 + i_1149_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564) > i_1150_)
                    i_1150_ = i_1152_;
                for (/**/; i_1150_ < 0; i_1150_++) {
                    int i_1153_ = ((i_1149_ >> 12) * ((Class129_Sub3) this).anInt8548 + (i_1148_ >> 12));
                    int i_1154_ = i_1147_++;
                    int[] is_1155_ = is;
                    int i_1156_ = i;
                    int i_1157_ = i_567_;
                    if (i_1157_ == 0) {
                        if (i_1156_ == 1)
                            is_1155_[i_1154_] = (anIntArray9991[aByteArray9990[i_1153_] & 0xff]);
                        else if (i_1156_ == 0) {
                            int i_1158_ = (anIntArray9991[aByteArray9990[i_1153_] & 0xff]);
                            int i_1159_ = (((i_1158_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_1160_ = ((i_1158_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_1161_ = ((i_1158_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            is_1155_[i_1154_] = (i_1159_ | i_1160_ | i_1161_) >>> 8;
                        } else if (i_1156_ == 3) {
                            int i_1162_ = (anIntArray9991[aByteArray9990[i_1153_] & 0xff]);
                            int i_1163_ = Class129_Sub3.anInt8565;
                            int i_1164_ = i_1162_ + i_1163_;
                            int i_1165_ = (i_1162_ & 0xff00ff) + (i_1163_ & 0xff00ff);
                            int i_1166_ = ((i_1165_ & 0x1000100) + (i_1164_ - i_1165_ & 0x10000));
                            is_1155_[i_1154_] = i_1164_ - i_1166_ | i_1166_ - (i_1166_ >>> 8);
                        } else if (i_1156_ == 2) {
                            int i_1167_ = (anIntArray9991[aByteArray9990[i_1153_] & 0xff]);
                            int i_1168_ = (((i_1167_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_1169_ = ((i_1167_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            is_1155_[i_1154_] = (((i_1168_ | i_1169_) >>> 8) + Class129_Sub3.anInt8553);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1157_ == 1) {
                        if (i_1156_ == 1) {
                            int i_1170_ = aByteArray9990[i_1153_];
                            if (i_1170_ != 0)
                                is_1155_[i_1154_] = anIntArray9991[i_1170_ & 0xff];
                        } else if (i_1156_ == 0) {
                            int i_1171_ = aByteArray9990[i_1153_];
                            if (i_1171_ != 0) {
                                int i_1172_ = anIntArray9991[i_1171_ & 0xff];
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_1173_ = Class129_Sub3.anInt8565 >>> 24;
                                    int i_1174_ = 256 - i_1173_;
                                    int i_1175_ = is_1155_[i_1154_];
                                    is_1155_[i_1154_] = ((((i_1172_ & 0xff00ff) * i_1173_ + (i_1175_ & 0xff00ff) * i_1174_) & ~0xff00ff) + (((i_1172_ & 0xff00) * i_1173_ + (i_1175_ & 0xff00) * i_1174_) & 0xff0000)) >> 8;
                                } else if (Class129_Sub3.anInt8567 != 255) {
                                    int i_1176_ = (((i_1172_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_1177_ = (((i_1172_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_1178_ = (((i_1172_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_1172_ = (i_1176_ | i_1177_ | i_1178_) >>> 8;
                                    int i_1179_ = is_1155_[i_1154_];
                                    is_1155_[i_1154_] = (((((i_1172_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1179_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1172_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1179_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                                } else {
                                    int i_1180_ = (((i_1172_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_1181_ = (((i_1172_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_1182_ = (((i_1172_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_1155_[i_1154_] = (i_1180_ | i_1181_ | i_1182_) >>> 8;
                                }
                            }
                        } else if (i_1156_ == 3) {
                            byte i_1183_ = aByteArray9990[i_1153_];
                            int i_1184_ = i_1183_ > 0 ? anIntArray9991[i_1183_] : 0;
                            int i_1185_ = Class129_Sub3.anInt8565;
                            int i_1186_ = i_1184_ + i_1185_;
                            int i_1187_ = (i_1184_ & 0xff00ff) + (i_1185_ & 0xff00ff);
                            int i_1188_ = ((i_1187_ & 0x1000100) + (i_1186_ - i_1187_ & 0x10000));
                            i_1188_ = i_1186_ - i_1188_ | i_1188_ - (i_1188_ >>> 8);
                            if (i_1184_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                i_1184_ = i_1188_;
                                i_1188_ = is_1155_[i_1154_];
                                i_1188_ = (((((i_1184_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1188_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1184_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1188_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                            }
                            is_1155_[i_1154_] = i_1188_;
                        } else if (i_1156_ == 2) {
                            int i_1189_ = aByteArray9990[i_1153_];
                            if (i_1189_ != 0) {
                                int i_1190_ = anIntArray9991[i_1189_ & 0xff];
                                int i_1191_ = (((i_1190_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1192_ = (((i_1190_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_1155_[i_1154_++] = (((i_1191_ | i_1192_) >>> 8) + Class129_Sub3.anInt8553);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1157_ == 2) {
                        if (i_1156_ == 1) {
                            int i_1193_ = aByteArray9990[i_1153_];
                            if (i_1193_ != 0) {
                                int i_1194_ = anIntArray9991[i_1193_ & 0xff];
                                int i_1195_ = is_1155_[i_1154_];
                                int i_1196_ = i_1194_ + i_1195_;
                                int i_1197_ = ((i_1194_ & 0xff00ff) + (i_1195_ & 0xff00ff));
                                i_1195_ = ((i_1197_ & 0x1000100) + (i_1196_ - i_1197_ & 0x10000));
                                is_1155_[i_1154_] = i_1196_ - i_1195_ | i_1195_ - (i_1195_ >>> 8);
                            }
                        } else if (i_1156_ == 0) {
                            int i_1198_ = aByteArray9990[i_1153_];
                            if (i_1198_ != 0) {
                                int i_1199_ = anIntArray9991[i_1198_ & 0xff];
                                int i_1200_ = (((i_1199_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_1201_ = (((i_1199_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_1202_ = (((i_1199_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_1199_ = (i_1200_ | i_1201_ | i_1202_) >>> 8;
                                int i_1203_ = is_1155_[i_1154_];
                                int i_1204_ = i_1199_ + i_1203_;
                                int i_1205_ = ((i_1199_ & 0xff00ff) + (i_1203_ & 0xff00ff));
                                i_1203_ = ((i_1205_ & 0x1000100) + (i_1204_ - i_1205_ & 0x10000));
                                is_1155_[i_1154_] = i_1204_ - i_1203_ | i_1203_ - (i_1203_ >>> 8);
                            }
                        } else if (i_1156_ == 3) {
                            byte i_1206_ = aByteArray9990[i_1153_];
                            int i_1207_ = i_1206_ > 0 ? anIntArray9991[i_1206_] : 0;
                            int i_1208_ = Class129_Sub3.anInt8565;
                            int i_1209_ = i_1207_ + i_1208_;
                            int i_1210_ = (i_1207_ & 0xff00ff) + (i_1208_ & 0xff00ff);
                            int i_1211_ = ((i_1210_ & 0x1000100) + (i_1209_ - i_1210_ & 0x10000));
                            i_1211_ = i_1209_ - i_1211_ | i_1211_ - (i_1211_ >>> 8);
                            if (i_1207_ == 0 && Class129_Sub3.anInt8567 != 255) {
                                i_1207_ = i_1211_;
                                i_1211_ = is_1155_[i_1154_];
                                i_1211_ = (((((i_1207_ & 0xff00ff) * Class129_Sub3.anInt8567) + ((i_1211_ & 0xff00ff) * Class129_Sub3.anInt8573)) & ~0xff00ff) + ((((i_1207_ & 0xff00) * Class129_Sub3.anInt8567) + ((i_1211_ & 0xff00) * Class129_Sub3.anInt8573)) & 0xff0000)) >> 8;
                            }
                            is_1155_[i_1154_] = i_1211_;
                        } else if (i_1156_ == 2) {
                            int i_1212_ = aByteArray9990[i_1153_];
                            if (i_1212_ != 0) {
                                int i_1213_ = anIntArray9991[i_1212_ & 0xff];
                                int i_1214_ = (((i_1213_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_1215_ = (((i_1213_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_1213_ = (((i_1214_ | i_1215_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_1216_ = is_1155_[i_1154_];
                                int i_1217_ = i_1213_ + i_1216_;
                                int i_1218_ = ((i_1213_ & 0xff00ff) + (i_1216_ & 0xff00ff));
                                i_1216_ = ((i_1218_ & 0x1000100) + (i_1217_ - i_1218_ & 0x10000));
                                is_1155_[i_1154_] = i_1217_ - i_1216_ | i_1216_ - (i_1216_ >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_1148_ += Class129_Sub3.anInt8557;
                    i_1149_ += Class129_Sub3.anInt8564;
                }
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        }
    }
}
