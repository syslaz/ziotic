/* Class129_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129_Sub3_Sub2 extends Class129_Sub3 {
    int[] anIntArray9989;

    final void method1193(int i, int i_0_) {
        int[] is = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        if (Class129_Sub3.anInt8557 == 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_1_ = Class129_Sub3.anInt8577;
                while (i_1_ < 0) {
                    int i_2_ = Class129_Sub3.anInt8550;
                    int i_3_ = Class129_Sub3.anInt8558;
                    int i_4_ = Class129_Sub3.anInt8561;
                    int i_5_ = Class129_Sub3.anInt8549;
                    if (i_3_ >= 0 && i_4_ >= 0 && i_3_ - (((Class129_Sub3) this).anInt8548 << 12) < 0 && (i_4_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        for (/**/; i_5_ < 0; i_5_++) {
                            int i_6_ = (((i_4_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_3_ >> 12));
                            int i_7_ = i_2_++;
                            int[] is_8_ = is;
                            int i_9_ = i;
                            int i_10_ = i_0_;
                            if (i_10_ == 0) {
                                if (i_9_ == 1)
                                    is_8_[i_7_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                else if (i_9_ == 0) {
                                    int i_11_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_++]);
                                    int i_12_ = (((i_11_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_13_ = (((i_11_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_14_ = (((i_11_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_8_[i_7_] = (i_12_ | i_13_ | i_14_) >>> 8;
                                } else if (i_9_ == 3) {
                                    int i_15_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_++]);
                                    int i_16_ = Class129_Sub3.anInt8565;
                                    int i_17_ = i_15_ + i_16_;
                                    int i_18_ = ((i_15_ & 0xff00ff) + (i_16_ & 0xff00ff));
                                    int i_19_ = ((i_18_ & 0x1000100) + (i_17_ - i_18_ & 0x10000));
                                    is_8_[i_7_] = i_17_ - i_19_ | i_19_ - (i_19_ >>> 8);
                                } else if (i_9_ == 2) {
                                    int i_20_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_21_ = (((i_20_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_22_ = (((i_20_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_8_[i_7_] = (((i_21_ | i_22_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_10_ == 1) {
                                if (i_9_ == 1) {
                                    int i_23_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_24_ = i_23_ >>> 24;
                                    int i_25_ = 256 - i_24_;
                                    int i_26_ = is_8_[i_7_];
                                    is_8_[i_7_] = ((((i_23_ & 0xff00ff) * i_24_ + (i_26_ & 0xff00ff) * i_25_) & ~0xff00ff) + (((i_23_ & 0xff00) * i_24_ + (i_26_ & 0xff00) * i_25_) & 0xff0000)) >> 8;
                                } else if (i_9_ == 0) {
                                    int i_27_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_28_ = (((i_27_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_29_ = 256 - i_28_;
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_30_ = is_8_[i_7_];
                                        is_8_[i_7_] = ((((i_27_ & 0xff00ff) * i_28_ + (i_30_ & 0xff00ff) * i_29_) & ~0xff00ff) + (((i_27_ & 0xff00) * i_28_ + (i_30_ & 0xff00) * i_29_) & 0xff0000)) >> 8;
                                    } else if (i_28_ != 255) {
                                        int i_31_ = (((i_27_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_32_ = (((i_27_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_33_ = (((i_27_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_27_ = (i_31_ | i_32_ | i_33_) >>> 8;
                                        int i_34_ = is_8_[i_7_];
                                        is_8_[i_7_] = ((((i_27_ & 0xff00ff) * i_28_ + (i_34_ & 0xff00ff) * i_29_) & ~0xff00ff) + (((i_27_ & 0xff00) * i_28_ + (i_34_ & 0xff00) * i_29_) & 0xff0000)) >> 8;
                                    } else {
                                        int i_35_ = (((i_27_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_36_ = (((i_27_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_37_ = (((i_27_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_8_[i_7_] = (i_35_ | i_36_ | i_37_) >>> 8;
                                    }
                                } else if (i_9_ == 3) {
                                    int i_38_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_39_ = Class129_Sub3.anInt8565;
                                    int i_40_ = i_38_ + i_39_;
                                    int i_41_ = ((i_38_ & 0xff00ff) + (i_39_ & 0xff00ff));
                                    int i_42_ = ((i_41_ & 0x1000100) + (i_40_ - i_41_ & 0x10000));
                                    i_42_ = i_40_ - i_42_ | i_42_ - (i_42_ >>> 8);
                                    int i_43_ = (((i_38_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_44_ = 256 - i_43_;
                                    if (i_43_ != 255) {
                                        i_38_ = i_42_;
                                        i_42_ = is_8_[i_7_];
                                        i_42_ = ((((i_38_ & 0xff00ff) * i_43_ + (i_42_ & 0xff00ff) * i_44_) & ~0xff00ff) + (((i_38_ & 0xff00) * i_43_ + (i_42_ & 0xff00) * i_44_) & 0xff0000)) >> 8;
                                    }
                                    is_8_[i_7_] = i_42_;
                                } else if (i_9_ == 2) {
                                    int i_45_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_46_ = i_45_ >>> 24;
                                    int i_47_ = 256 - i_46_;
                                    int i_48_ = (((i_45_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_49_ = (((i_45_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_45_ = (((i_48_ | i_49_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_50_ = is_8_[i_7_];
                                    is_8_[i_7_] = ((((i_45_ & 0xff00ff) * i_46_ + (i_50_ & 0xff00ff) * i_47_) & ~0xff00ff) + (((i_45_ & 0xff00) * i_46_ + (i_50_ & 0xff00) * i_47_) & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_10_ == 2) {
                                if (i_9_ == 1) {
                                    int i_51_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_52_ = is_8_[i_7_];
                                    int i_53_ = i_51_ + i_52_;
                                    int i_54_ = ((i_51_ & 0xff00ff) + (i_52_ & 0xff00ff));
                                    i_52_ = (i_54_ & 0x1000100) + (i_53_ - i_54_ & 0x10000);
                                    is_8_[i_7_] = i_53_ - i_52_ | i_52_ - (i_52_ >>> 8);
                                } else if (i_9_ == 0) {
                                    int i_55_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_56_ = (((i_55_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_57_ = (((i_55_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_58_ = (((i_55_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_55_ = (i_56_ | i_57_ | i_58_) >>> 8;
                                    int i_59_ = is_8_[i_7_];
                                    int i_60_ = i_55_ + i_59_;
                                    int i_61_ = ((i_55_ & 0xff00ff) + (i_59_ & 0xff00ff));
                                    i_59_ = (i_61_ & 0x1000100) + (i_60_ - i_61_ & 0x10000);
                                    is_8_[i_7_] = i_60_ - i_59_ | i_59_ - (i_59_ >>> 8);
                                } else if (i_9_ == 3) {
                                    int i_62_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_63_ = Class129_Sub3.anInt8565;
                                    int i_64_ = i_62_ + i_63_;
                                    int i_65_ = ((i_62_ & 0xff00ff) + (i_63_ & 0xff00ff));
                                    int i_66_ = ((i_65_ & 0x1000100) + (i_64_ - i_65_ & 0x10000));
                                    i_62_ = i_64_ - i_66_ | i_66_ - (i_66_ >>> 8);
                                    i_66_ = is_8_[i_7_];
                                    i_64_ = i_62_ + i_66_;
                                    i_65_ = (i_62_ & 0xff00ff) + (i_66_ & 0xff00ff);
                                    i_66_ = (i_65_ & 0x1000100) + (i_64_ - i_65_ & 0x10000);
                                    is_8_[i_7_] = i_64_ - i_66_ | i_66_ - (i_66_ >>> 8);
                                } else if (i_9_ == 2) {
                                    int i_67_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_6_]);
                                    int i_68_ = (((i_67_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_69_ = (((i_67_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_67_ = (((i_68_ | i_69_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_70_ = is_8_[i_7_];
                                    int i_71_ = i_67_ + i_70_;
                                    int i_72_ = ((i_67_ & 0xff00ff) + (i_70_ & 0xff00ff));
                                    i_70_ = (i_72_ & 0x1000100) + (i_71_ - i_72_ & 0x10000);
                                    is_8_[i_7_] = i_71_ - i_70_ | i_70_ - (i_70_ >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    i_1_++;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_73_ = Class129_Sub3.anInt8577;
                while (i_73_ < 0) {
                    int i_74_ = Class129_Sub3.anInt8550;
                    int i_75_ = Class129_Sub3.anInt8558;
                    int i_76_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_77_ = Class129_Sub3.anInt8549;
                    if (i_75_ >= 0 && i_75_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                        int i_78_;
                        if ((i_78_ = i_76_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                            i_78_ = ((Class129_Sub3.anInt8564 - i_78_) / Class129_Sub3.anInt8564);
                            i_77_ += i_78_;
                            i_76_ += Class129_Sub3.anInt8564 * i_78_;
                            i_74_ += i_78_;
                        }
                        if ((i_78_ = ((i_76_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_77_)
                            i_77_ = i_78_;
                        for (/**/; i_77_ < 0; i_77_++) {
                            int i_79_ = (((i_76_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_75_ >> 12));
                            int i_80_ = i_74_++;
                            int[] is_81_ = is;
                            int i_82_ = i;
                            int i_83_ = i_0_;
                            if (i_83_ == 0) {
                                if (i_82_ == 1)
                                    is_81_[i_80_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                else if (i_82_ == 0) {
                                    int i_84_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_++]);
                                    int i_85_ = (((i_84_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_86_ = (((i_84_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_87_ = (((i_84_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_81_[i_80_] = (i_85_ | i_86_ | i_87_) >>> 8;
                                } else if (i_82_ == 3) {
                                    int i_88_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_++]);
                                    int i_89_ = Class129_Sub3.anInt8565;
                                    int i_90_ = i_88_ + i_89_;
                                    int i_91_ = ((i_88_ & 0xff00ff) + (i_89_ & 0xff00ff));
                                    int i_92_ = ((i_91_ & 0x1000100) + (i_90_ - i_91_ & 0x10000));
                                    is_81_[i_80_] = i_90_ - i_92_ | i_92_ - (i_92_ >>> 8);
                                } else if (i_82_ == 2) {
                                    int i_93_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_94_ = (((i_93_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_95_ = (((i_93_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_81_[i_80_] = (((i_94_ | i_95_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_83_ == 1) {
                                if (i_82_ == 1) {
                                    int i_96_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_97_ = i_96_ >>> 24;
                                    int i_98_ = 256 - i_97_;
                                    int i_99_ = is_81_[i_80_];
                                    is_81_[i_80_] = ((((i_96_ & 0xff00ff) * i_97_ + (i_99_ & 0xff00ff) * i_98_) & ~0xff00ff) + (((i_96_ & 0xff00) * i_97_ + (i_99_ & 0xff00) * i_98_) & 0xff0000)) >> 8;
                                } else if (i_82_ == 0) {
                                    int i_100_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_101_ = (((i_100_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_102_ = 256 - i_101_;
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_103_ = is_81_[i_80_];
                                        is_81_[i_80_] = ((((i_100_ & 0xff00ff) * i_101_ + ((i_103_ & 0xff00ff) * i_102_)) & ~0xff00ff) + (((i_100_ & 0xff00) * i_101_ + ((i_103_ & 0xff00) * i_102_)) & 0xff0000)) >> 8;
                                    } else if (i_101_ != 255) {
                                        int i_104_ = (((i_100_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_105_ = (((i_100_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_106_ = (((i_100_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_100_ = (i_104_ | i_105_ | i_106_) >>> 8;
                                        int i_107_ = is_81_[i_80_];
                                        is_81_[i_80_] = ((((i_100_ & 0xff00ff) * i_101_ + ((i_107_ & 0xff00ff) * i_102_)) & ~0xff00ff) + (((i_100_ & 0xff00) * i_101_ + ((i_107_ & 0xff00) * i_102_)) & 0xff0000)) >> 8;
                                    } else {
                                        int i_108_ = (((i_100_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_109_ = (((i_100_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_110_ = (((i_100_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_81_[i_80_] = (i_108_ | i_109_ | i_110_) >>> 8;
                                    }
                                } else if (i_82_ == 3) {
                                    int i_111_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_112_ = Class129_Sub3.anInt8565;
                                    int i_113_ = i_111_ + i_112_;
                                    int i_114_ = ((i_111_ & 0xff00ff) + (i_112_ & 0xff00ff));
                                    int i_115_ = ((i_114_ & 0x1000100) + (i_113_ - i_114_ & 0x10000));
                                    i_115_ = i_113_ - i_115_ | i_115_ - (i_115_ >>> 8);
                                    int i_116_ = (((i_111_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_117_ = 256 - i_116_;
                                    if (i_116_ != 255) {
                                        i_111_ = i_115_;
                                        i_115_ = is_81_[i_80_];
                                        i_115_ = ((((i_111_ & 0xff00ff) * i_116_ + ((i_115_ & 0xff00ff) * i_117_)) & ~0xff00ff) + (((i_111_ & 0xff00) * i_116_ + ((i_115_ & 0xff00) * i_117_)) & 0xff0000)) >> 8;
                                    }
                                    is_81_[i_80_] = i_115_;
                                } else if (i_82_ == 2) {
                                    int i_118_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_119_ = i_118_ >>> 24;
                                    int i_120_ = 256 - i_119_;
                                    int i_121_ = (((i_118_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_122_ = (((i_118_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_118_ = (((i_121_ | i_122_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_123_ = is_81_[i_80_];
                                    is_81_[i_80_] = ((((i_118_ & 0xff00ff) * i_119_ + (i_123_ & 0xff00ff) * i_120_) & ~0xff00ff) + (((i_118_ & 0xff00) * i_119_ + (i_123_ & 0xff00) * i_120_) & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_83_ == 2) {
                                if (i_82_ == 1) {
                                    int i_124_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_125_ = is_81_[i_80_];
                                    int i_126_ = i_124_ + i_125_;
                                    int i_127_ = ((i_124_ & 0xff00ff) + (i_125_ & 0xff00ff));
                                    i_125_ = ((i_127_ & 0x1000100) + (i_126_ - i_127_ & 0x10000));
                                    is_81_[i_80_] = i_126_ - i_125_ | i_125_ - (i_125_ >>> 8);
                                } else if (i_82_ == 0) {
                                    int i_128_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_129_ = (((i_128_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_130_ = (((i_128_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_131_ = (((i_128_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_128_ = (i_129_ | i_130_ | i_131_) >>> 8;
                                    int i_132_ = is_81_[i_80_];
                                    int i_133_ = i_128_ + i_132_;
                                    int i_134_ = ((i_128_ & 0xff00ff) + (i_132_ & 0xff00ff));
                                    i_132_ = ((i_134_ & 0x1000100) + (i_133_ - i_134_ & 0x10000));
                                    is_81_[i_80_] = i_133_ - i_132_ | i_132_ - (i_132_ >>> 8);
                                } else if (i_82_ == 3) {
                                    int i_135_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_136_ = Class129_Sub3.anInt8565;
                                    int i_137_ = i_135_ + i_136_;
                                    int i_138_ = ((i_135_ & 0xff00ff) + (i_136_ & 0xff00ff));
                                    int i_139_ = ((i_138_ & 0x1000100) + (i_137_ - i_138_ & 0x10000));
                                    i_135_ = i_137_ - i_139_ | i_139_ - (i_139_ >>> 8);
                                    i_139_ = is_81_[i_80_];
                                    i_137_ = i_135_ + i_139_;
                                    i_138_ = (i_135_ & 0xff00ff) + (i_139_ & 0xff00ff);
                                    i_139_ = ((i_138_ & 0x1000100) + (i_137_ - i_138_ & 0x10000));
                                    is_81_[i_80_] = i_137_ - i_139_ | i_139_ - (i_139_ >>> 8);
                                } else if (i_82_ == 2) {
                                    int i_140_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_79_]);
                                    int i_141_ = (((i_140_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_142_ = (((i_140_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_140_ = (((i_141_ | i_142_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_143_ = is_81_[i_80_];
                                    int i_144_ = i_140_ + i_143_;
                                    int i_145_ = ((i_140_ & 0xff00ff) + (i_143_ & 0xff00ff));
                                    i_143_ = ((i_145_ & 0x1000100) + (i_144_ - i_145_ & 0x10000));
                                    is_81_[i_80_] = i_144_ - i_143_ | i_143_ - (i_143_ >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_76_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_73_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_146_ = Class129_Sub3.anInt8577;
                while (i_146_ < 0) {
                    int i_147_ = Class129_Sub3.anInt8550;
                    int i_148_ = Class129_Sub3.anInt8558;
                    int i_149_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_150_ = Class129_Sub3.anInt8549;
                    if (i_148_ >= 0 && (i_148_ - (((Class129_Sub3) this).anInt8548 << 12) < 0)) {
                        if (i_149_ < 0) {
                            int i_151_ = ((Class129_Sub3.anInt8564 - 1 - i_149_) / Class129_Sub3.anInt8564);
                            i_150_ += i_151_;
                            i_149_ += Class129_Sub3.anInt8564 * i_151_;
                            i_147_ += i_151_;
                        }
                        int i_152_;
                        if ((i_152_ = ((1 + i_149_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_150_)
                            i_150_ = i_152_;
                        for (/**/; i_150_ < 0; i_150_++) {
                            int i_153_ = (((i_149_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_148_ >> 12));
                            int i_154_ = i_147_++;
                            int[] is_155_ = is;
                            int i_156_ = i;
                            int i_157_ = i_0_;
                            if (i_157_ == 0) {
                                if (i_156_ == 1)
                                    is_155_[i_154_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                else if (i_156_ == 0) {
                                    int i_158_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_++]);
                                    int i_159_ = (((i_158_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_160_ = (((i_158_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_161_ = (((i_158_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_155_[i_154_] = (i_159_ | i_160_ | i_161_) >>> 8;
                                } else if (i_156_ == 3) {
                                    int i_162_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_++]);
                                    int i_163_ = Class129_Sub3.anInt8565;
                                    int i_164_ = i_162_ + i_163_;
                                    int i_165_ = ((i_162_ & 0xff00ff) + (i_163_ & 0xff00ff));
                                    int i_166_ = ((i_165_ & 0x1000100) + (i_164_ - i_165_ & 0x10000));
                                    is_155_[i_154_] = i_164_ - i_166_ | i_166_ - (i_166_ >>> 8);
                                } else if (i_156_ == 2) {
                                    int i_167_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_168_ = (((i_167_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_169_ = (((i_167_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_155_[i_154_] = (((i_168_ | i_169_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_157_ == 1) {
                                if (i_156_ == 1) {
                                    int i_170_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_171_ = i_170_ >>> 24;
                                    int i_172_ = 256 - i_171_;
                                    int i_173_ = is_155_[i_154_];
                                    is_155_[i_154_] = ((((i_170_ & 0xff00ff) * i_171_ + (i_173_ & 0xff00ff) * i_172_) & ~0xff00ff) + (((i_170_ & 0xff00) * i_171_ + (i_173_ & 0xff00) * i_172_) & 0xff0000)) >> 8;
                                } else if (i_156_ == 0) {
                                    int i_174_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_175_ = (((i_174_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_176_ = 256 - i_175_;
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_177_ = is_155_[i_154_];
                                        is_155_[i_154_] = ((((i_174_ & 0xff00ff) * i_175_ + ((i_177_ & 0xff00ff) * i_176_)) & ~0xff00ff) + (((i_174_ & 0xff00) * i_175_ + ((i_177_ & 0xff00) * i_176_)) & 0xff0000)) >> 8;
                                    } else if (i_175_ != 255) {
                                        int i_178_ = (((i_174_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_179_ = (((i_174_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_180_ = (((i_174_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_174_ = (i_178_ | i_179_ | i_180_) >>> 8;
                                        int i_181_ = is_155_[i_154_];
                                        is_155_[i_154_] = ((((i_174_ & 0xff00ff) * i_175_ + ((i_181_ & 0xff00ff) * i_176_)) & ~0xff00ff) + (((i_174_ & 0xff00) * i_175_ + ((i_181_ & 0xff00) * i_176_)) & 0xff0000)) >> 8;
                                    } else {
                                        int i_182_ = (((i_174_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_183_ = (((i_174_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_184_ = (((i_174_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_155_[i_154_] = (i_182_ | i_183_ | i_184_) >>> 8;
                                    }
                                } else if (i_156_ == 3) {
                                    int i_185_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_186_ = Class129_Sub3.anInt8565;
                                    int i_187_ = i_185_ + i_186_;
                                    int i_188_ = ((i_185_ & 0xff00ff) + (i_186_ & 0xff00ff));
                                    int i_189_ = ((i_188_ & 0x1000100) + (i_187_ - i_188_ & 0x10000));
                                    i_189_ = i_187_ - i_189_ | i_189_ - (i_189_ >>> 8);
                                    int i_190_ = (((i_185_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_191_ = 256 - i_190_;
                                    if (i_190_ != 255) {
                                        i_185_ = i_189_;
                                        i_189_ = is_155_[i_154_];
                                        i_189_ = ((((i_185_ & 0xff00ff) * i_190_ + ((i_189_ & 0xff00ff) * i_191_)) & ~0xff00ff) + (((i_185_ & 0xff00) * i_190_ + ((i_189_ & 0xff00) * i_191_)) & 0xff0000)) >> 8;
                                    }
                                    is_155_[i_154_] = i_189_;
                                } else if (i_156_ == 2) {
                                    int i_192_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_193_ = i_192_ >>> 24;
                                    int i_194_ = 256 - i_193_;
                                    int i_195_ = (((i_192_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_196_ = (((i_192_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_192_ = (((i_195_ | i_196_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_197_ = is_155_[i_154_];
                                    is_155_[i_154_] = ((((i_192_ & 0xff00ff) * i_193_ + (i_197_ & 0xff00ff) * i_194_) & ~0xff00ff) + (((i_192_ & 0xff00) * i_193_ + (i_197_ & 0xff00) * i_194_) & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_157_ == 2) {
                                if (i_156_ == 1) {
                                    int i_198_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_199_ = is_155_[i_154_];
                                    int i_200_ = i_198_ + i_199_;
                                    int i_201_ = ((i_198_ & 0xff00ff) + (i_199_ & 0xff00ff));
                                    i_199_ = ((i_201_ & 0x1000100) + (i_200_ - i_201_ & 0x10000));
                                    is_155_[i_154_] = i_200_ - i_199_ | i_199_ - (i_199_ >>> 8);
                                } else if (i_156_ == 0) {
                                    int i_202_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_203_ = (((i_202_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_204_ = (((i_202_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_205_ = (((i_202_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_202_ = (i_203_ | i_204_ | i_205_) >>> 8;
                                    int i_206_ = is_155_[i_154_];
                                    int i_207_ = i_202_ + i_206_;
                                    int i_208_ = ((i_202_ & 0xff00ff) + (i_206_ & 0xff00ff));
                                    i_206_ = ((i_208_ & 0x1000100) + (i_207_ - i_208_ & 0x10000));
                                    is_155_[i_154_] = i_207_ - i_206_ | i_206_ - (i_206_ >>> 8);
                                } else if (i_156_ == 3) {
                                    int i_209_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_210_ = Class129_Sub3.anInt8565;
                                    int i_211_ = i_209_ + i_210_;
                                    int i_212_ = ((i_209_ & 0xff00ff) + (i_210_ & 0xff00ff));
                                    int i_213_ = ((i_212_ & 0x1000100) + (i_211_ - i_212_ & 0x10000));
                                    i_209_ = i_211_ - i_213_ | i_213_ - (i_213_ >>> 8);
                                    i_213_ = is_155_[i_154_];
                                    i_211_ = i_209_ + i_213_;
                                    i_212_ = (i_209_ & 0xff00ff) + (i_213_ & 0xff00ff);
                                    i_213_ = ((i_212_ & 0x1000100) + (i_211_ - i_212_ & 0x10000));
                                    is_155_[i_154_] = i_211_ - i_213_ | i_213_ - (i_213_ >>> 8);
                                } else if (i_156_ == 2) {
                                    int i_214_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_153_]);
                                    int i_215_ = (((i_214_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_216_ = (((i_214_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_214_ = (((i_215_ | i_216_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_217_ = is_155_[i_154_];
                                    int i_218_ = i_214_ + i_217_;
                                    int i_219_ = ((i_214_ & 0xff00ff) + (i_217_ & 0xff00ff));
                                    i_217_ = ((i_219_ & 0x1000100) + (i_218_ - i_219_ & 0x10000));
                                    is_155_[i_154_] = i_218_ - i_217_ | i_217_ - (i_217_ >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_149_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_146_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8557 < 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_220_ = Class129_Sub3.anInt8577;
                while (i_220_ < 0) {
                    int i_221_ = Class129_Sub3.anInt8550;
                    int i_222_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_223_ = Class129_Sub3.anInt8561;
                    int i_224_ = Class129_Sub3.anInt8549;
                    if (i_223_ >= 0 && (i_223_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        int i_225_;
                        if ((i_225_ = i_222_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_225_ = ((Class129_Sub3.anInt8557 - i_225_) / Class129_Sub3.anInt8557);
                            i_224_ += i_225_;
                            i_222_ += Class129_Sub3.anInt8557 * i_225_;
                            i_221_ += i_225_;
                        }
                        if ((i_225_ = ((i_222_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_224_)
                            i_224_ = i_225_;
                        for (/**/; i_224_ < 0; i_224_++) {
                            int i_226_ = (((i_223_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_222_ >> 12));
                            int i_227_ = i_221_++;
                            int[] is_228_ = is;
                            int i_229_ = i;
                            int i_230_ = i_0_;
                            if (i_230_ == 0) {
                                if (i_229_ == 1)
                                    is_228_[i_227_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                else if (i_229_ == 0) {
                                    int i_231_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_++]);
                                    int i_232_ = (((i_231_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_233_ = (((i_231_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_234_ = (((i_231_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_228_[i_227_] = (i_232_ | i_233_ | i_234_) >>> 8;
                                } else if (i_229_ == 3) {
                                    int i_235_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_++]);
                                    int i_236_ = Class129_Sub3.anInt8565;
                                    int i_237_ = i_235_ + i_236_;
                                    int i_238_ = ((i_235_ & 0xff00ff) + (i_236_ & 0xff00ff));
                                    int i_239_ = ((i_238_ & 0x1000100) + (i_237_ - i_238_ & 0x10000));
                                    is_228_[i_227_] = i_237_ - i_239_ | i_239_ - (i_239_ >>> 8);
                                } else if (i_229_ == 2) {
                                    int i_240_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_241_ = (((i_240_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_242_ = (((i_240_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    is_228_[i_227_] = (((i_241_ | i_242_) >>> 8) + Class129_Sub3.anInt8553);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_230_ == 1) {
                                if (i_229_ == 1) {
                                    int i_243_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_244_ = i_243_ >>> 24;
                                    int i_245_ = 256 - i_244_;
                                    int i_246_ = is_228_[i_227_];
                                    is_228_[i_227_] = ((((i_243_ & 0xff00ff) * i_244_ + (i_246_ & 0xff00ff) * i_245_) & ~0xff00ff) + (((i_243_ & 0xff00) * i_244_ + (i_246_ & 0xff00) * i_245_) & 0xff0000)) >> 8;
                                } else if (i_229_ == 0) {
                                    int i_247_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_248_ = (((i_247_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_249_ = 256 - i_248_;
                                    if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                        int i_250_ = is_228_[i_227_];
                                        is_228_[i_227_] = ((((i_247_ & 0xff00ff) * i_248_ + ((i_250_ & 0xff00ff) * i_249_)) & ~0xff00ff) + (((i_247_ & 0xff00) * i_248_ + ((i_250_ & 0xff00) * i_249_)) & 0xff0000)) >> 8;
                                    } else if (i_248_ != 255) {
                                        int i_251_ = (((i_247_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_252_ = (((i_247_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_253_ = (((i_247_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        i_247_ = (i_251_ | i_252_ | i_253_) >>> 8;
                                        int i_254_ = is_228_[i_227_];
                                        is_228_[i_227_] = ((((i_247_ & 0xff00ff) * i_248_ + ((i_254_ & 0xff00ff) * i_249_)) & ~0xff00ff) + (((i_247_ & 0xff00) * i_248_ + ((i_254_ & 0xff00) * i_249_)) & 0xff0000)) >> 8;
                                    } else {
                                        int i_255_ = (((i_247_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                        int i_256_ = (((i_247_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                        int i_257_ = (((i_247_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                        is_228_[i_227_] = (i_255_ | i_256_ | i_257_) >>> 8;
                                    }
                                } else if (i_229_ == 3) {
                                    int i_258_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_259_ = Class129_Sub3.anInt8565;
                                    int i_260_ = i_258_ + i_259_;
                                    int i_261_ = ((i_258_ & 0xff00ff) + (i_259_ & 0xff00ff));
                                    int i_262_ = ((i_261_ & 0x1000100) + (i_260_ - i_261_ & 0x10000));
                                    i_262_ = i_260_ - i_262_ | i_262_ - (i_262_ >>> 8);
                                    int i_263_ = (((i_258_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                    int i_264_ = 256 - i_263_;
                                    if (i_263_ != 255) {
                                        i_258_ = i_262_;
                                        i_262_ = is_228_[i_227_];
                                        i_262_ = ((((i_258_ & 0xff00ff) * i_263_ + ((i_262_ & 0xff00ff) * i_264_)) & ~0xff00ff) + (((i_258_ & 0xff00) * i_263_ + ((i_262_ & 0xff00) * i_264_)) & 0xff0000)) >> 8;
                                    }
                                    is_228_[i_227_] = i_262_;
                                } else if (i_229_ == 2) {
                                    int i_265_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_266_ = i_265_ >>> 24;
                                    int i_267_ = 256 - i_266_;
                                    int i_268_ = (((i_265_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_269_ = (((i_265_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_265_ = (((i_268_ | i_269_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_270_ = is_228_[i_227_];
                                    is_228_[i_227_] = ((((i_265_ & 0xff00ff) * i_266_ + (i_270_ & 0xff00ff) * i_267_) & ~0xff00ff) + (((i_265_ & 0xff00) * i_266_ + (i_270_ & 0xff00) * i_267_) & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_230_ == 2) {
                                if (i_229_ == 1) {
                                    int i_271_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_272_ = is_228_[i_227_];
                                    int i_273_ = i_271_ + i_272_;
                                    int i_274_ = ((i_271_ & 0xff00ff) + (i_272_ & 0xff00ff));
                                    i_272_ = ((i_274_ & 0x1000100) + (i_273_ - i_274_ & 0x10000));
                                    is_228_[i_227_] = i_273_ - i_272_ | i_272_ - (i_272_ >>> 8);
                                } else if (i_229_ == 0) {
                                    int i_275_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_276_ = (((i_275_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_277_ = (((i_275_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_278_ = (((i_275_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_275_ = (i_276_ | i_277_ | i_278_) >>> 8;
                                    int i_279_ = is_228_[i_227_];
                                    int i_280_ = i_275_ + i_279_;
                                    int i_281_ = ((i_275_ & 0xff00ff) + (i_279_ & 0xff00ff));
                                    i_279_ = ((i_281_ & 0x1000100) + (i_280_ - i_281_ & 0x10000));
                                    is_228_[i_227_] = i_280_ - i_279_ | i_279_ - (i_279_ >>> 8);
                                } else if (i_229_ == 3) {
                                    int i_282_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_283_ = Class129_Sub3.anInt8565;
                                    int i_284_ = i_282_ + i_283_;
                                    int i_285_ = ((i_282_ & 0xff00ff) + (i_283_ & 0xff00ff));
                                    int i_286_ = ((i_285_ & 0x1000100) + (i_284_ - i_285_ & 0x10000));
                                    i_282_ = i_284_ - i_286_ | i_286_ - (i_286_ >>> 8);
                                    i_286_ = is_228_[i_227_];
                                    i_284_ = i_282_ + i_286_;
                                    i_285_ = (i_282_ & 0xff00ff) + (i_286_ & 0xff00ff);
                                    i_286_ = ((i_285_ & 0x1000100) + (i_284_ - i_285_ & 0x10000));
                                    is_228_[i_227_] = i_284_ - i_286_ | i_286_ - (i_286_ >>> 8);
                                } else if (i_229_ == 2) {
                                    int i_287_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_226_]);
                                    int i_288_ = (((i_287_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                    int i_289_ = (((i_287_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                    i_287_ = (((i_288_ | i_289_) >>> 8) + Class129_Sub3.anInt8553);
                                    int i_290_ = is_228_[i_227_];
                                    int i_291_ = i_287_ + i_290_;
                                    int i_292_ = ((i_287_ & 0xff00ff) + (i_290_ & 0xff00ff));
                                    i_290_ = ((i_292_ & 0x1000100) + (i_291_ - i_292_ & 0x10000));
                                    is_228_[i_227_] = i_291_ - i_290_ | i_290_ - (i_290_ >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_222_ += Class129_Sub3.anInt8557;
                        }
                    }
                    i_220_++;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_293_ = Class129_Sub3.anInt8577;
                while (i_293_ < 0) {
                    int i_294_ = Class129_Sub3.anInt8550;
                    int i_295_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_296_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_297_ = Class129_Sub3.anInt8549;
                    int i_298_;
                    if ((i_298_ = i_295_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                        i_298_ = ((Class129_Sub3.anInt8557 - i_298_) / Class129_Sub3.anInt8557);
                        i_297_ += i_298_;
                        i_295_ += Class129_Sub3.anInt8557 * i_298_;
                        i_296_ += Class129_Sub3.anInt8564 * i_298_;
                        i_294_ += i_298_;
                    }
                    if ((i_298_ = ((i_295_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_297_)
                        i_297_ = i_298_;
                    if ((i_298_ = i_296_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                        i_298_ = ((Class129_Sub3.anInt8564 - i_298_) / Class129_Sub3.anInt8564);
                        i_297_ += i_298_;
                        i_295_ += Class129_Sub3.anInt8557 * i_298_;
                        i_296_ += Class129_Sub3.anInt8564 * i_298_;
                        i_294_ += i_298_;
                    }
                    if ((i_298_ = ((i_296_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_297_)
                        i_297_ = i_298_;
                    for (/**/; i_297_ < 0; i_297_++) {
                        int i_299_ = (((i_296_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_295_ >> 12));
                        int i_300_ = i_294_++;
                        int[] is_301_ = is;
                        int i_302_ = i;
                        int i_303_ = i_0_;
                        if (i_303_ == 0) {
                            if (i_302_ == 1)
                                is_301_[i_300_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                            else if (i_302_ == 0) {
                                int i_304_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_++]);
                                int i_305_ = (((i_304_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_306_ = (((i_304_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_307_ = (((i_304_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_301_[i_300_] = (i_305_ | i_306_ | i_307_) >>> 8;
                            } else if (i_302_ == 3) {
                                int i_308_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_++]);
                                int i_309_ = Class129_Sub3.anInt8565;
                                int i_310_ = i_308_ + i_309_;
                                int i_311_ = ((i_308_ & 0xff00ff) + (i_309_ & 0xff00ff));
                                int i_312_ = ((i_311_ & 0x1000100) + (i_310_ - i_311_ & 0x10000));
                                is_301_[i_300_] = i_310_ - i_312_ | i_312_ - (i_312_ >>> 8);
                            } else if (i_302_ == 2) {
                                int i_313_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_314_ = (((i_313_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_315_ = (((i_313_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_301_[i_300_] = (((i_314_ | i_315_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_303_ == 1) {
                            if (i_302_ == 1) {
                                int i_316_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_317_ = i_316_ >>> 24;
                                int i_318_ = 256 - i_317_;
                                int i_319_ = is_301_[i_300_];
                                is_301_[i_300_] = ((((i_316_ & 0xff00ff) * i_317_ + (i_319_ & 0xff00ff) * i_318_) & ~0xff00ff) + (((i_316_ & 0xff00) * i_317_ + (i_319_ & 0xff00) * i_318_) & 0xff0000)) >> 8;
                            } else if (i_302_ == 0) {
                                int i_320_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_321_ = (((i_320_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                int i_322_ = 256 - i_321_;
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_323_ = is_301_[i_300_];
                                    is_301_[i_300_] = ((((i_320_ & 0xff00ff) * i_321_ + (i_323_ & 0xff00ff) * i_322_) & ~0xff00ff) + (((i_320_ & 0xff00) * i_321_ + (i_323_ & 0xff00) * i_322_) & 0xff0000)) >> 8;
                                } else if (i_321_ != 255) {
                                    int i_324_ = (((i_320_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_325_ = (((i_320_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_326_ = (((i_320_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_320_ = (i_324_ | i_325_ | i_326_) >>> 8;
                                    int i_327_ = is_301_[i_300_];
                                    is_301_[i_300_] = ((((i_320_ & 0xff00ff) * i_321_ + (i_327_ & 0xff00ff) * i_322_) & ~0xff00ff) + (((i_320_ & 0xff00) * i_321_ + (i_327_ & 0xff00) * i_322_) & 0xff0000)) >> 8;
                                } else {
                                    int i_328_ = (((i_320_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_329_ = (((i_320_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_330_ = (((i_320_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_301_[i_300_] = (i_328_ | i_329_ | i_330_) >>> 8;
                                }
                            } else if (i_302_ == 3) {
                                int i_331_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_332_ = Class129_Sub3.anInt8565;
                                int i_333_ = i_331_ + i_332_;
                                int i_334_ = ((i_331_ & 0xff00ff) + (i_332_ & 0xff00ff));
                                int i_335_ = ((i_334_ & 0x1000100) + (i_333_ - i_334_ & 0x10000));
                                i_335_ = i_333_ - i_335_ | i_335_ - (i_335_ >>> 8);
                                int i_336_ = (((i_331_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                int i_337_ = 256 - i_336_;
                                if (i_336_ != 255) {
                                    i_331_ = i_335_;
                                    i_335_ = is_301_[i_300_];
                                    i_335_ = ((((i_331_ & 0xff00ff) * i_336_ + (i_335_ & 0xff00ff) * i_337_) & ~0xff00ff) + (((i_331_ & 0xff00) * i_336_ + (i_335_ & 0xff00) * i_337_) & 0xff0000)) >> 8;
                                }
                                is_301_[i_300_] = i_335_;
                            } else if (i_302_ == 2) {
                                int i_338_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_339_ = i_338_ >>> 24;
                                int i_340_ = 256 - i_339_;
                                int i_341_ = (((i_338_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_342_ = (((i_338_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_338_ = (((i_341_ | i_342_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_343_ = is_301_[i_300_];
                                is_301_[i_300_] = ((((i_338_ & 0xff00ff) * i_339_ + (i_343_ & 0xff00ff) * i_340_) & ~0xff00ff) + (((i_338_ & 0xff00) * i_339_ + (i_343_ & 0xff00) * i_340_) & 0xff0000)) >> 8;
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_303_ == 2) {
                            if (i_302_ == 1) {
                                int i_344_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_345_ = is_301_[i_300_];
                                int i_346_ = i_344_ + i_345_;
                                int i_347_ = ((i_344_ & 0xff00ff) + (i_345_ & 0xff00ff));
                                i_345_ = (i_347_ & 0x1000100) + (i_346_ - i_347_ & 0x10000);
                                is_301_[i_300_] = i_346_ - i_345_ | i_345_ - (i_345_ >>> 8);
                            } else if (i_302_ == 0) {
                                int i_348_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_349_ = (((i_348_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_350_ = (((i_348_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_351_ = (((i_348_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_348_ = (i_349_ | i_350_ | i_351_) >>> 8;
                                int i_352_ = is_301_[i_300_];
                                int i_353_ = i_348_ + i_352_;
                                int i_354_ = ((i_348_ & 0xff00ff) + (i_352_ & 0xff00ff));
                                i_352_ = (i_354_ & 0x1000100) + (i_353_ - i_354_ & 0x10000);
                                is_301_[i_300_] = i_353_ - i_352_ | i_352_ - (i_352_ >>> 8);
                            } else if (i_302_ == 3) {
                                int i_355_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_356_ = Class129_Sub3.anInt8565;
                                int i_357_ = i_355_ + i_356_;
                                int i_358_ = ((i_355_ & 0xff00ff) + (i_356_ & 0xff00ff));
                                int i_359_ = ((i_358_ & 0x1000100) + (i_357_ - i_358_ & 0x10000));
                                i_355_ = i_357_ - i_359_ | i_359_ - (i_359_ >>> 8);
                                i_359_ = is_301_[i_300_];
                                i_357_ = i_355_ + i_359_;
                                i_358_ = (i_355_ & 0xff00ff) + (i_359_ & 0xff00ff);
                                i_359_ = (i_358_ & 0x1000100) + (i_357_ - i_358_ & 0x10000);
                                is_301_[i_300_] = i_357_ - i_359_ | i_359_ - (i_359_ >>> 8);
                            } else if (i_302_ == 2) {
                                int i_360_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_299_]);
                                int i_361_ = (((i_360_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_362_ = (((i_360_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_360_ = (((i_361_ | i_362_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_363_ = is_301_[i_300_];
                                int i_364_ = i_360_ + i_363_;
                                int i_365_ = ((i_360_ & 0xff00ff) + (i_363_ & 0xff00ff));
                                i_363_ = (i_365_ & 0x1000100) + (i_364_ - i_365_ & 0x10000);
                                is_301_[i_300_] = i_364_ - i_363_ | i_363_ - (i_363_ >>> 8);
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_295_ += Class129_Sub3.anInt8557;
                        i_296_ += Class129_Sub3.anInt8564;
                    }
                    i_293_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_366_ = Class129_Sub3.anInt8577;
                while (i_366_ < 0) {
                    int i_367_ = Class129_Sub3.anInt8550;
                    int i_368_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_369_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_370_ = Class129_Sub3.anInt8549;
                    int i_371_;
                    if ((i_371_ = i_368_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                        i_371_ = ((Class129_Sub3.anInt8557 - i_371_) / Class129_Sub3.anInt8557);
                        i_370_ += i_371_;
                        i_368_ += Class129_Sub3.anInt8557 * i_371_;
                        i_369_ += Class129_Sub3.anInt8564 * i_371_;
                        i_367_ += i_371_;
                    }
                    if ((i_371_ = ((i_368_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_370_)
                        i_370_ = i_371_;
                    if (i_369_ < 0) {
                        i_371_ = ((Class129_Sub3.anInt8564 - 1 - i_369_) / Class129_Sub3.anInt8564);
                        i_370_ += i_371_;
                        i_368_ += Class129_Sub3.anInt8557 * i_371_;
                        i_369_ += Class129_Sub3.anInt8564 * i_371_;
                        i_367_ += i_371_;
                    }
                    if ((i_371_ = ((1 + i_369_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_370_)
                        i_370_ = i_371_;
                    for (/**/; i_370_ < 0; i_370_++) {
                        int i_372_ = (((i_369_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_368_ >> 12));
                        int i_373_ = i_367_++;
                        int[] is_374_ = is;
                        int i_375_ = i;
                        int i_376_ = i_0_;
                        if (i_376_ == 0) {
                            if (i_375_ == 1)
                                is_374_[i_373_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                            else if (i_375_ == 0) {
                                int i_377_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_++]);
                                int i_378_ = (((i_377_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_379_ = (((i_377_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_380_ = (((i_377_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_374_[i_373_] = (i_378_ | i_379_ | i_380_) >>> 8;
                            } else if (i_375_ == 3) {
                                int i_381_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_++]);
                                int i_382_ = Class129_Sub3.anInt8565;
                                int i_383_ = i_381_ + i_382_;
                                int i_384_ = ((i_381_ & 0xff00ff) + (i_382_ & 0xff00ff));
                                int i_385_ = ((i_384_ & 0x1000100) + (i_383_ - i_384_ & 0x10000));
                                is_374_[i_373_] = i_383_ - i_385_ | i_385_ - (i_385_ >>> 8);
                            } else if (i_375_ == 2) {
                                int i_386_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_387_ = (((i_386_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_388_ = (((i_386_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_374_[i_373_] = (((i_387_ | i_388_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_376_ == 1) {
                            if (i_375_ == 1) {
                                int i_389_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_390_ = i_389_ >>> 24;
                                int i_391_ = 256 - i_390_;
                                int i_392_ = is_374_[i_373_];
                                is_374_[i_373_] = ((((i_389_ & 0xff00ff) * i_390_ + (i_392_ & 0xff00ff) * i_391_) & ~0xff00ff) + (((i_389_ & 0xff00) * i_390_ + (i_392_ & 0xff00) * i_391_) & 0xff0000)) >> 8;
                            } else if (i_375_ == 0) {
                                int i_393_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_394_ = (((i_393_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                int i_395_ = 256 - i_394_;
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_396_ = is_374_[i_373_];
                                    is_374_[i_373_] = ((((i_393_ & 0xff00ff) * i_394_ + (i_396_ & 0xff00ff) * i_395_) & ~0xff00ff) + (((i_393_ & 0xff00) * i_394_ + (i_396_ & 0xff00) * i_395_) & 0xff0000)) >> 8;
                                } else if (i_394_ != 255) {
                                    int i_397_ = (((i_393_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_398_ = (((i_393_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_399_ = (((i_393_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_393_ = (i_397_ | i_398_ | i_399_) >>> 8;
                                    int i_400_ = is_374_[i_373_];
                                    is_374_[i_373_] = ((((i_393_ & 0xff00ff) * i_394_ + (i_400_ & 0xff00ff) * i_395_) & ~0xff00ff) + (((i_393_ & 0xff00) * i_394_ + (i_400_ & 0xff00) * i_395_) & 0xff0000)) >> 8;
                                } else {
                                    int i_401_ = (((i_393_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_402_ = (((i_393_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_403_ = (((i_393_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_374_[i_373_] = (i_401_ | i_402_ | i_403_) >>> 8;
                                }
                            } else if (i_375_ == 3) {
                                int i_404_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_405_ = Class129_Sub3.anInt8565;
                                int i_406_ = i_404_ + i_405_;
                                int i_407_ = ((i_404_ & 0xff00ff) + (i_405_ & 0xff00ff));
                                int i_408_ = ((i_407_ & 0x1000100) + (i_406_ - i_407_ & 0x10000));
                                i_408_ = i_406_ - i_408_ | i_408_ - (i_408_ >>> 8);
                                int i_409_ = (((i_404_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                int i_410_ = 256 - i_409_;
                                if (i_409_ != 255) {
                                    i_404_ = i_408_;
                                    i_408_ = is_374_[i_373_];
                                    i_408_ = ((((i_404_ & 0xff00ff) * i_409_ + (i_408_ & 0xff00ff) * i_410_) & ~0xff00ff) + (((i_404_ & 0xff00) * i_409_ + (i_408_ & 0xff00) * i_410_) & 0xff0000)) >> 8;
                                }
                                is_374_[i_373_] = i_408_;
                            } else if (i_375_ == 2) {
                                int i_411_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_412_ = i_411_ >>> 24;
                                int i_413_ = 256 - i_412_;
                                int i_414_ = (((i_411_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_415_ = (((i_411_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_411_ = (((i_414_ | i_415_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_416_ = is_374_[i_373_];
                                is_374_[i_373_] = ((((i_411_ & 0xff00ff) * i_412_ + (i_416_ & 0xff00ff) * i_413_) & ~0xff00ff) + (((i_411_ & 0xff00) * i_412_ + (i_416_ & 0xff00) * i_413_) & 0xff0000)) >> 8;
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_376_ == 2) {
                            if (i_375_ == 1) {
                                int i_417_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_418_ = is_374_[i_373_];
                                int i_419_ = i_417_ + i_418_;
                                int i_420_ = ((i_417_ & 0xff00ff) + (i_418_ & 0xff00ff));
                                i_418_ = (i_420_ & 0x1000100) + (i_419_ - i_420_ & 0x10000);
                                is_374_[i_373_] = i_419_ - i_418_ | i_418_ - (i_418_ >>> 8);
                            } else if (i_375_ == 0) {
                                int i_421_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_422_ = (((i_421_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_423_ = (((i_421_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_424_ = (((i_421_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_421_ = (i_422_ | i_423_ | i_424_) >>> 8;
                                int i_425_ = is_374_[i_373_];
                                int i_426_ = i_421_ + i_425_;
                                int i_427_ = ((i_421_ & 0xff00ff) + (i_425_ & 0xff00ff));
                                i_425_ = (i_427_ & 0x1000100) + (i_426_ - i_427_ & 0x10000);
                                is_374_[i_373_] = i_426_ - i_425_ | i_425_ - (i_425_ >>> 8);
                            } else if (i_375_ == 3) {
                                int i_428_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_429_ = Class129_Sub3.anInt8565;
                                int i_430_ = i_428_ + i_429_;
                                int i_431_ = ((i_428_ & 0xff00ff) + (i_429_ & 0xff00ff));
                                int i_432_ = ((i_431_ & 0x1000100) + (i_430_ - i_431_ & 0x10000));
                                i_428_ = i_430_ - i_432_ | i_432_ - (i_432_ >>> 8);
                                i_432_ = is_374_[i_373_];
                                i_430_ = i_428_ + i_432_;
                                i_431_ = (i_428_ & 0xff00ff) + (i_432_ & 0xff00ff);
                                i_432_ = (i_431_ & 0x1000100) + (i_430_ - i_431_ & 0x10000);
                                is_374_[i_373_] = i_430_ - i_432_ | i_432_ - (i_432_ >>> 8);
                            } else if (i_375_ == 2) {
                                int i_433_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_372_]);
                                int i_434_ = (((i_433_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_435_ = (((i_433_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_433_ = (((i_434_ | i_435_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_436_ = is_374_[i_373_];
                                int i_437_ = i_433_ + i_436_;
                                int i_438_ = ((i_433_ & 0xff00ff) + (i_436_ & 0xff00ff));
                                i_436_ = (i_438_ & 0x1000100) + (i_437_ - i_438_ & 0x10000);
                                is_374_[i_373_] = i_437_ - i_436_ | i_436_ - (i_436_ >>> 8);
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_368_ += Class129_Sub3.anInt8557;
                        i_369_ += Class129_Sub3.anInt8564;
                    }
                    i_366_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8564 == 0) {
            int i_439_ = Class129_Sub3.anInt8577;
            while (i_439_ < 0) {
                int i_440_ = Class129_Sub3.anInt8550;
                int i_441_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_442_ = Class129_Sub3.anInt8561;
                int i_443_ = Class129_Sub3.anInt8549;
                if (i_442_ >= 0 && i_442_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                    if (i_441_ < 0) {
                        int i_444_ = ((Class129_Sub3.anInt8557 - 1 - i_441_) / Class129_Sub3.anInt8557);
                        i_443_ += i_444_;
                        i_441_ += Class129_Sub3.anInt8557 * i_444_;
                        i_440_ += i_444_;
                    }
                    int i_445_;
                    if ((i_445_ = ((1 + i_441_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_443_)
                        i_443_ = i_445_;
                    for (/**/; i_443_ < 0; i_443_++) {
                        int i_446_ = (((i_442_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_441_ >> 12));
                        int i_447_ = i_440_++;
                        int[] is_448_ = is;
                        int i_449_ = i;
                        int i_450_ = i_0_;
                        if (i_450_ == 0) {
                            if (i_449_ == 1)
                                is_448_[i_447_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                            else if (i_449_ == 0) {
                                int i_451_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_++]);
                                int i_452_ = (((i_451_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_453_ = (((i_451_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_454_ = (((i_451_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_448_[i_447_] = (i_452_ | i_453_ | i_454_) >>> 8;
                            } else if (i_449_ == 3) {
                                int i_455_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_++]);
                                int i_456_ = Class129_Sub3.anInt8565;
                                int i_457_ = i_455_ + i_456_;
                                int i_458_ = ((i_455_ & 0xff00ff) + (i_456_ & 0xff00ff));
                                int i_459_ = ((i_458_ & 0x1000100) + (i_457_ - i_458_ & 0x10000));
                                is_448_[i_447_] = i_457_ - i_459_ | i_459_ - (i_459_ >>> 8);
                            } else if (i_449_ == 2) {
                                int i_460_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_461_ = (((i_460_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_462_ = (((i_460_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                is_448_[i_447_] = (((i_461_ | i_462_) >>> 8) + Class129_Sub3.anInt8553);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_450_ == 1) {
                            if (i_449_ == 1) {
                                int i_463_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_464_ = i_463_ >>> 24;
                                int i_465_ = 256 - i_464_;
                                int i_466_ = is_448_[i_447_];
                                is_448_[i_447_] = ((((i_463_ & 0xff00ff) * i_464_ + (i_466_ & 0xff00ff) * i_465_) & ~0xff00ff) + (((i_463_ & 0xff00) * i_464_ + (i_466_ & 0xff00) * i_465_) & 0xff0000)) >> 8;
                            } else if (i_449_ == 0) {
                                int i_467_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_468_ = (((i_467_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                int i_469_ = 256 - i_468_;
                                if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                    int i_470_ = is_448_[i_447_];
                                    is_448_[i_447_] = ((((i_467_ & 0xff00ff) * i_468_ + (i_470_ & 0xff00ff) * i_469_) & ~0xff00ff) + (((i_467_ & 0xff00) * i_468_ + (i_470_ & 0xff00) * i_469_) & 0xff0000)) >> 8;
                                } else if (i_468_ != 255) {
                                    int i_471_ = (((i_467_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_472_ = (((i_467_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_473_ = (((i_467_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    i_467_ = (i_471_ | i_472_ | i_473_) >>> 8;
                                    int i_474_ = is_448_[i_447_];
                                    is_448_[i_447_] = ((((i_467_ & 0xff00ff) * i_468_ + (i_474_ & 0xff00ff) * i_469_) & ~0xff00ff) + (((i_467_ & 0xff00) * i_468_ + (i_474_ & 0xff00) * i_469_) & 0xff0000)) >> 8;
                                } else {
                                    int i_475_ = (((i_467_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                    int i_476_ = (((i_467_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                    int i_477_ = (((i_467_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                    is_448_[i_447_] = (i_475_ | i_476_ | i_477_) >>> 8;
                                }
                            } else if (i_449_ == 3) {
                                int i_478_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_479_ = Class129_Sub3.anInt8565;
                                int i_480_ = i_478_ + i_479_;
                                int i_481_ = ((i_478_ & 0xff00ff) + (i_479_ & 0xff00ff));
                                int i_482_ = ((i_481_ & 0x1000100) + (i_480_ - i_481_ & 0x10000));
                                i_482_ = i_480_ - i_482_ | i_482_ - (i_482_ >>> 8);
                                int i_483_ = (((i_478_ >>> 24) * Class129_Sub3.anInt8567) >> 8);
                                int i_484_ = 256 - i_483_;
                                if (i_483_ != 255) {
                                    i_478_ = i_482_;
                                    i_482_ = is_448_[i_447_];
                                    i_482_ = ((((i_478_ & 0xff00ff) * i_483_ + (i_482_ & 0xff00ff) * i_484_) & ~0xff00ff) + (((i_478_ & 0xff00) * i_483_ + (i_482_ & 0xff00) * i_484_) & 0xff0000)) >> 8;
                                }
                                is_448_[i_447_] = i_482_;
                            } else if (i_449_ == 2) {
                                int i_485_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_486_ = i_485_ >>> 24;
                                int i_487_ = 256 - i_486_;
                                int i_488_ = (((i_485_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_489_ = (((i_485_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_485_ = (((i_488_ | i_489_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_490_ = is_448_[i_447_];
                                is_448_[i_447_] = ((((i_485_ & 0xff00ff) * i_486_ + (i_490_ & 0xff00ff) * i_487_) & ~0xff00ff) + (((i_485_ & 0xff00) * i_486_ + (i_490_ & 0xff00) * i_487_) & 0xff0000)) >> 8;
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_450_ == 2) {
                            if (i_449_ == 1) {
                                int i_491_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_492_ = is_448_[i_447_];
                                int i_493_ = i_491_ + i_492_;
                                int i_494_ = ((i_491_ & 0xff00ff) + (i_492_ & 0xff00ff));
                                i_492_ = (i_494_ & 0x1000100) + (i_493_ - i_494_ & 0x10000);
                                is_448_[i_447_] = i_493_ - i_492_ | i_492_ - (i_492_ >>> 8);
                            } else if (i_449_ == 0) {
                                int i_495_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_496_ = (((i_495_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_497_ = (((i_495_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_498_ = (((i_495_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_495_ = (i_496_ | i_497_ | i_498_) >>> 8;
                                int i_499_ = is_448_[i_447_];
                                int i_500_ = i_495_ + i_499_;
                                int i_501_ = ((i_495_ & 0xff00ff) + (i_499_ & 0xff00ff));
                                i_499_ = (i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000);
                                is_448_[i_447_] = i_500_ - i_499_ | i_499_ - (i_499_ >>> 8);
                            } else if (i_449_ == 3) {
                                int i_502_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_503_ = Class129_Sub3.anInt8565;
                                int i_504_ = i_502_ + i_503_;
                                int i_505_ = ((i_502_ & 0xff00ff) + (i_503_ & 0xff00ff));
                                int i_506_ = ((i_505_ & 0x1000100) + (i_504_ - i_505_ & 0x10000));
                                i_502_ = i_504_ - i_506_ | i_506_ - (i_506_ >>> 8);
                                i_506_ = is_448_[i_447_];
                                i_504_ = i_502_ + i_506_;
                                i_505_ = (i_502_ & 0xff00ff) + (i_506_ & 0xff00ff);
                                i_506_ = (i_505_ & 0x1000100) + (i_504_ - i_505_ & 0x10000);
                                is_448_[i_447_] = i_504_ - i_506_ | i_506_ - (i_506_ >>> 8);
                            } else if (i_449_ == 2) {
                                int i_507_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_446_]);
                                int i_508_ = (((i_507_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                                int i_509_ = (((i_507_ & 0xff00) * Class129_Sub3.anInt8567) & 0xff0000);
                                i_507_ = (((i_508_ | i_509_) >>> 8) + Class129_Sub3.anInt8553);
                                int i_510_ = is_448_[i_447_];
                                int i_511_ = i_507_ + i_510_;
                                int i_512_ = ((i_507_ & 0xff00ff) + (i_510_ & 0xff00ff));
                                i_510_ = (i_512_ & 0x1000100) + (i_511_ - i_512_ & 0x10000);
                                is_448_[i_447_] = i_511_ - i_510_ | i_510_ - (i_510_ >>> 8);
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_441_ += Class129_Sub3.anInt8557;
                    }
                }
                i_439_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else if (Class129_Sub3.anInt8564 < 0) {
            for (int i_513_ = Class129_Sub3.anInt8577; i_513_ < 0; i_513_++) {
                int i_514_ = Class129_Sub3.anInt8550;
                int i_515_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_516_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                int i_517_ = Class129_Sub3.anInt8549;
                if (i_515_ < 0) {
                    int i_518_ = ((Class129_Sub3.anInt8557 - 1 - i_515_) / Class129_Sub3.anInt8557);
                    i_517_ += i_518_;
                    i_515_ += Class129_Sub3.anInt8557 * i_518_;
                    i_516_ += Class129_Sub3.anInt8564 * i_518_;
                    i_514_ += i_518_;
                }
                int i_519_;
                if ((i_519_ = (1 + i_515_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557) > i_517_)
                    i_517_ = i_519_;
                if ((i_519_ = i_516_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                    i_519_ = ((Class129_Sub3.anInt8564 - i_519_) / Class129_Sub3.anInt8564);
                    i_517_ += i_519_;
                    i_515_ += Class129_Sub3.anInt8557 * i_519_;
                    i_516_ += Class129_Sub3.anInt8564 * i_519_;
                    i_514_ += i_519_;
                }
                if ((i_519_ = ((i_516_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_517_)
                    i_517_ = i_519_;
                for (/**/; i_517_ < 0; i_517_++) {
                    int i_520_ = ((i_516_ >> 12) * ((Class129_Sub3) this).anInt8548 + (i_515_ >> 12));
                    int i_521_ = i_514_++;
                    int[] is_522_ = is;
                    int i_523_ = i;
                    int i_524_ = i_0_;
                    if (i_524_ == 0) {
                        if (i_523_ == 1)
                            is_522_[i_521_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                        else if (i_523_ == 0) {
                            int i_525_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_++]);
                            int i_526_ = (((i_525_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_527_ = ((i_525_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_528_ = ((i_525_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            is_522_[i_521_] = (i_526_ | i_527_ | i_528_) >>> 8;
                        } else if (i_523_ == 3) {
                            int i_529_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_++]);
                            int i_530_ = Class129_Sub3.anInt8565;
                            int i_531_ = i_529_ + i_530_;
                            int i_532_ = (i_529_ & 0xff00ff) + (i_530_ & 0xff00ff);
                            int i_533_ = ((i_532_ & 0x1000100) + (i_531_ - i_532_ & 0x10000));
                            is_522_[i_521_] = i_531_ - i_533_ | i_533_ - (i_533_ >>> 8);
                        } else if (i_523_ == 2) {
                            int i_534_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_535_ = (((i_534_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_536_ = ((i_534_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            is_522_[i_521_] = (((i_535_ | i_536_) >>> 8) + Class129_Sub3.anInt8553);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_524_ == 1) {
                        if (i_523_ == 1) {
                            int i_537_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_538_ = i_537_ >>> 24;
                            int i_539_ = 256 - i_538_;
                            int i_540_ = is_522_[i_521_];
                            is_522_[i_521_] = ((((i_537_ & 0xff00ff) * i_538_ + (i_540_ & 0xff00ff) * i_539_) & ~0xff00ff) + (((i_537_ & 0xff00) * i_538_ + (i_540_ & 0xff00) * i_539_) & 0xff0000)) >> 8;
                        } else if (i_523_ == 0) {
                            int i_541_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_542_ = ((i_541_ >>> 24) * Class129_Sub3.anInt8567 >> 8);
                            int i_543_ = 256 - i_542_;
                            if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                int i_544_ = is_522_[i_521_];
                                is_522_[i_521_] = ((((i_541_ & 0xff00ff) * i_542_ + (i_544_ & 0xff00ff) * i_543_) & ~0xff00ff) + (((i_541_ & 0xff00) * i_542_ + (i_544_ & 0xff00) * i_543_) & 0xff0000)) >> 8;
                            } else if (i_542_ != 255) {
                                int i_545_ = (((i_541_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_546_ = (((i_541_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_547_ = (((i_541_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_541_ = (i_545_ | i_546_ | i_547_) >>> 8;
                                int i_548_ = is_522_[i_521_];
                                is_522_[i_521_] = ((((i_541_ & 0xff00ff) * i_542_ + (i_548_ & 0xff00ff) * i_543_) & ~0xff00ff) + (((i_541_ & 0xff00) * i_542_ + (i_548_ & 0xff00) * i_543_) & 0xff0000)) >> 8;
                            } else {
                                int i_549_ = (((i_541_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_550_ = (((i_541_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_551_ = (((i_541_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_522_[i_521_] = (i_549_ | i_550_ | i_551_) >>> 8;
                            }
                        } else if (i_523_ == 3) {
                            int i_552_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_553_ = Class129_Sub3.anInt8565;
                            int i_554_ = i_552_ + i_553_;
                            int i_555_ = (i_552_ & 0xff00ff) + (i_553_ & 0xff00ff);
                            int i_556_ = ((i_555_ & 0x1000100) + (i_554_ - i_555_ & 0x10000));
                            i_556_ = i_554_ - i_556_ | i_556_ - (i_556_ >>> 8);
                            int i_557_ = ((i_552_ >>> 24) * Class129_Sub3.anInt8567 >> 8);
                            int i_558_ = 256 - i_557_;
                            if (i_557_ != 255) {
                                i_552_ = i_556_;
                                i_556_ = is_522_[i_521_];
                                i_556_ = ((((i_552_ & 0xff00ff) * i_557_ + (i_556_ & 0xff00ff) * i_558_) & ~0xff00ff) + (((i_552_ & 0xff00) * i_557_ + (i_556_ & 0xff00) * i_558_) & 0xff0000)) >> 8;
                            }
                            is_522_[i_521_] = i_556_;
                        } else if (i_523_ == 2) {
                            int i_559_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_560_ = i_559_ >>> 24;
                            int i_561_ = 256 - i_560_;
                            int i_562_ = (((i_559_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_563_ = ((i_559_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            i_559_ = (((i_562_ | i_563_) >>> 8) + Class129_Sub3.anInt8553);
                            int i_564_ = is_522_[i_521_];
                            is_522_[i_521_] = ((((i_559_ & 0xff00ff) * i_560_ + (i_564_ & 0xff00ff) * i_561_) & ~0xff00ff) + (((i_559_ & 0xff00) * i_560_ + (i_564_ & 0xff00) * i_561_) & 0xff0000)) >> 8;
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_524_ == 2) {
                        if (i_523_ == 1) {
                            int i_565_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_566_ = is_522_[i_521_];
                            int i_567_ = i_565_ + i_566_;
                            int i_568_ = (i_565_ & 0xff00ff) + (i_566_ & 0xff00ff);
                            i_566_ = (i_568_ & 0x1000100) + (i_567_ - i_568_ & 0x10000);
                            is_522_[i_521_] = i_567_ - i_566_ | i_566_ - (i_566_ >>> 8);
                        } else if (i_523_ == 0) {
                            int i_569_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_570_ = (((i_569_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_571_ = ((i_569_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_572_ = ((i_569_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            i_569_ = (i_570_ | i_571_ | i_572_) >>> 8;
                            int i_573_ = is_522_[i_521_];
                            int i_574_ = i_569_ + i_573_;
                            int i_575_ = (i_569_ & 0xff00ff) + (i_573_ & 0xff00ff);
                            i_573_ = (i_575_ & 0x1000100) + (i_574_ - i_575_ & 0x10000);
                            is_522_[i_521_] = i_574_ - i_573_ | i_573_ - (i_573_ >>> 8);
                        } else if (i_523_ == 3) {
                            int i_576_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_577_ = Class129_Sub3.anInt8565;
                            int i_578_ = i_576_ + i_577_;
                            int i_579_ = (i_576_ & 0xff00ff) + (i_577_ & 0xff00ff);
                            int i_580_ = ((i_579_ & 0x1000100) + (i_578_ - i_579_ & 0x10000));
                            i_576_ = i_578_ - i_580_ | i_580_ - (i_580_ >>> 8);
                            i_580_ = is_522_[i_521_];
                            i_578_ = i_576_ + i_580_;
                            i_579_ = (i_576_ & 0xff00ff) + (i_580_ & 0xff00ff);
                            i_580_ = (i_579_ & 0x1000100) + (i_578_ - i_579_ & 0x10000);
                            is_522_[i_521_] = i_578_ - i_580_ | i_580_ - (i_580_ >>> 8);
                        } else if (i_523_ == 2) {
                            int i_581_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_520_]);
                            int i_582_ = (((i_581_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_583_ = ((i_581_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            i_581_ = (((i_582_ | i_583_) >>> 8) + Class129_Sub3.anInt8553);
                            int i_584_ = is_522_[i_521_];
                            int i_585_ = i_581_ + i_584_;
                            int i_586_ = (i_581_ & 0xff00ff) + (i_584_ & 0xff00ff);
                            i_584_ = (i_586_ & 0x1000100) + (i_585_ - i_586_ & 0x10000);
                            is_522_[i_521_] = i_585_ - i_584_ | i_584_ - (i_584_ >>> 8);
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_515_ += Class129_Sub3.anInt8557;
                    i_516_ += Class129_Sub3.anInt8564;
                }
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else {
            for (int i_587_ = Class129_Sub3.anInt8577; i_587_ < 0; i_587_++) {
                int i_588_ = Class129_Sub3.anInt8550;
                int i_589_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                int i_590_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                int i_591_ = Class129_Sub3.anInt8549;
                if (i_589_ < 0) {
                    int i_592_ = ((Class129_Sub3.anInt8557 - 1 - i_589_) / Class129_Sub3.anInt8557);
                    i_591_ += i_592_;
                    i_589_ += Class129_Sub3.anInt8557 * i_592_;
                    i_590_ += Class129_Sub3.anInt8564 * i_592_;
                    i_588_ += i_592_;
                }
                int i_593_;
                if ((i_593_ = (1 + i_589_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557) > i_591_)
                    i_591_ = i_593_;
                if (i_590_ < 0) {
                    i_593_ = ((Class129_Sub3.anInt8564 - 1 - i_590_) / Class129_Sub3.anInt8564);
                    i_591_ += i_593_;
                    i_589_ += Class129_Sub3.anInt8557 * i_593_;
                    i_590_ += Class129_Sub3.anInt8564 * i_593_;
                    i_588_ += i_593_;
                }
                if ((i_593_ = (1 + i_590_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564) > i_591_)
                    i_591_ = i_593_;
                for (/**/; i_591_ < 0; i_591_++) {
                    int i_594_ = ((i_590_ >> 12) * ((Class129_Sub3) this).anInt8548 + (i_589_ >> 12));
                    int i_595_ = i_588_++;
                    int[] is_596_ = is;
                    int i_597_ = i;
                    int i_598_ = i_0_;
                    if (i_598_ == 0) {
                        if (i_597_ == 1)
                            is_596_[i_595_] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                        else if (i_597_ == 0) {
                            int i_599_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_++]);
                            int i_600_ = (((i_599_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_601_ = ((i_599_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_602_ = ((i_599_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            is_596_[i_595_] = (i_600_ | i_601_ | i_602_) >>> 8;
                        } else if (i_597_ == 3) {
                            int i_603_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_++]);
                            int i_604_ = Class129_Sub3.anInt8565;
                            int i_605_ = i_603_ + i_604_;
                            int i_606_ = (i_603_ & 0xff00ff) + (i_604_ & 0xff00ff);
                            int i_607_ = ((i_606_ & 0x1000100) + (i_605_ - i_606_ & 0x10000));
                            is_596_[i_595_] = i_605_ - i_607_ | i_607_ - (i_607_ >>> 8);
                        } else if (i_597_ == 2) {
                            int i_608_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_609_ = (((i_608_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_610_ = ((i_608_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            is_596_[i_595_] = (((i_609_ | i_610_) >>> 8) + Class129_Sub3.anInt8553);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_598_ == 1) {
                        if (i_597_ == 1) {
                            int i_611_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_612_ = i_611_ >>> 24;
                            int i_613_ = 256 - i_612_;
                            int i_614_ = is_596_[i_595_];
                            is_596_[i_595_] = ((((i_611_ & 0xff00ff) * i_612_ + (i_614_ & 0xff00ff) * i_613_) & ~0xff00ff) + (((i_611_ & 0xff00) * i_612_ + (i_614_ & 0xff00) * i_613_) & 0xff0000)) >> 8;
                        } else if (i_597_ == 0) {
                            int i_615_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_616_ = ((i_615_ >>> 24) * Class129_Sub3.anInt8567 >> 8);
                            int i_617_ = 256 - i_616_;
                            if ((Class129_Sub3.anInt8565 & 0xffffff) == 16777215) {
                                int i_618_ = is_596_[i_595_];
                                is_596_[i_595_] = ((((i_615_ & 0xff00ff) * i_616_ + (i_618_ & 0xff00ff) * i_617_) & ~0xff00ff) + (((i_615_ & 0xff00) * i_616_ + (i_618_ & 0xff00) * i_617_) & 0xff0000)) >> 8;
                            } else if (i_616_ != 255) {
                                int i_619_ = (((i_615_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_620_ = (((i_615_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_621_ = (((i_615_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                i_615_ = (i_619_ | i_620_ | i_621_) >>> 8;
                                int i_622_ = is_596_[i_595_];
                                is_596_[i_595_] = ((((i_615_ & 0xff00ff) * i_616_ + (i_622_ & 0xff00ff) * i_617_) & ~0xff00ff) + (((i_615_ & 0xff00) * i_616_ + (i_622_ & 0xff00) * i_617_) & 0xff0000)) >> 8;
                            } else {
                                int i_623_ = (((i_615_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                                int i_624_ = (((i_615_ & 0xff00) * Class129_Sub3.anInt8560) & 0xff0000);
                                int i_625_ = (((i_615_ & 0xff) * Class129_Sub3.anInt8559) & 0xff00);
                                is_596_[i_595_] = (i_623_ | i_624_ | i_625_) >>> 8;
                            }
                        } else if (i_597_ == 3) {
                            int i_626_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_627_ = Class129_Sub3.anInt8565;
                            int i_628_ = i_626_ + i_627_;
                            int i_629_ = (i_626_ & 0xff00ff) + (i_627_ & 0xff00ff);
                            int i_630_ = ((i_629_ & 0x1000100) + (i_628_ - i_629_ & 0x10000));
                            i_630_ = i_628_ - i_630_ | i_630_ - (i_630_ >>> 8);
                            int i_631_ = ((i_626_ >>> 24) * Class129_Sub3.anInt8567 >> 8);
                            int i_632_ = 256 - i_631_;
                            if (i_631_ != 255) {
                                i_626_ = i_630_;
                                i_630_ = is_596_[i_595_];
                                i_630_ = ((((i_626_ & 0xff00ff) * i_631_ + (i_630_ & 0xff00ff) * i_632_) & ~0xff00ff) + (((i_626_ & 0xff00) * i_631_ + (i_630_ & 0xff00) * i_632_) & 0xff0000)) >> 8;
                            }
                            is_596_[i_595_] = i_630_;
                        } else if (i_597_ == 2) {
                            int i_633_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_634_ = i_633_ >>> 24;
                            int i_635_ = 256 - i_634_;
                            int i_636_ = (((i_633_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_637_ = ((i_633_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            i_633_ = (((i_636_ | i_637_) >>> 8) + Class129_Sub3.anInt8553);
                            int i_638_ = is_596_[i_595_];
                            is_596_[i_595_] = ((((i_633_ & 0xff00ff) * i_634_ + (i_638_ & 0xff00ff) * i_635_) & ~0xff00ff) + (((i_633_ & 0xff00) * i_634_ + (i_638_ & 0xff00) * i_635_) & 0xff0000)) >> 8;
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_598_ == 2) {
                        if (i_597_ == 1) {
                            int i_639_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_640_ = is_596_[i_595_];
                            int i_641_ = i_639_ + i_640_;
                            int i_642_ = (i_639_ & 0xff00ff) + (i_640_ & 0xff00ff);
                            i_640_ = (i_642_ & 0x1000100) + (i_641_ - i_642_ & 0x10000);
                            is_596_[i_595_] = i_641_ - i_640_ | i_640_ - (i_640_ >>> 8);
                        } else if (i_597_ == 0) {
                            int i_643_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_644_ = (((i_643_ & 0xff0000) * Class129_Sub3.anInt8551) & ~0xffffff);
                            int i_645_ = ((i_643_ & 0xff00) * Class129_Sub3.anInt8560 & 0xff0000);
                            int i_646_ = ((i_643_ & 0xff) * Class129_Sub3.anInt8559 & 0xff00);
                            i_643_ = (i_644_ | i_645_ | i_646_) >>> 8;
                            int i_647_ = is_596_[i_595_];
                            int i_648_ = i_643_ + i_647_;
                            int i_649_ = (i_643_ & 0xff00ff) + (i_647_ & 0xff00ff);
                            i_647_ = (i_649_ & 0x1000100) + (i_648_ - i_649_ & 0x10000);
                            is_596_[i_595_] = i_648_ - i_647_ | i_647_ - (i_647_ >>> 8);
                        } else if (i_597_ == 3) {
                            int i_650_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_651_ = Class129_Sub3.anInt8565;
                            int i_652_ = i_650_ + i_651_;
                            int i_653_ = (i_650_ & 0xff00ff) + (i_651_ & 0xff00ff);
                            int i_654_ = ((i_653_ & 0x1000100) + (i_652_ - i_653_ & 0x10000));
                            i_650_ = i_652_ - i_654_ | i_654_ - (i_654_ >>> 8);
                            i_654_ = is_596_[i_595_];
                            i_652_ = i_650_ + i_654_;
                            i_653_ = (i_650_ & 0xff00ff) + (i_654_ & 0xff00ff);
                            i_654_ = (i_653_ & 0x1000100) + (i_652_ - i_653_ & 0x10000);
                            is_596_[i_595_] = i_652_ - i_654_ | i_654_ - (i_654_ >>> 8);
                        } else if (i_597_ == 2) {
                            int i_655_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_594_]);
                            int i_656_ = (((i_655_ & 0xff00ff) * Class129_Sub3.anInt8567) & ~0xff00ff);
                            int i_657_ = ((i_655_ & 0xff00) * Class129_Sub3.anInt8567 & 0xff0000);
                            i_655_ = (((i_656_ | i_657_) >>> 8) + Class129_Sub3.anInt8553);
                            int i_658_ = is_596_[i_595_];
                            int i_659_ = i_655_ + i_658_;
                            int i_660_ = (i_655_ & 0xff00ff) + (i_658_ & 0xff00ff);
                            i_658_ = (i_660_ & 0x1000100) + (i_659_ - i_660_ & 0x10000);
                            is_596_[i_595_] = i_659_ - i_658_ | i_658_ - (i_658_ >>> 8);
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_589_ += Class129_Sub3.anInt8557;
                    i_590_ += Class129_Sub3.anInt8564;
                }
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        }
    }

    final void method1177(int i, int i_661_, int i_662_) {
        if (i_662_ == 0) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            for (int i_663_ = 0; i_663_ < ((Class129_Sub3) this).anInt8569; i_663_++) {
                int i_664_ = i_663_ * ((Class129_Sub3) this).anInt8548;
                int i_665_ = (((i_661_ + i_663_) * (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567)) + i);
                for (int i_666_ = 0; i_666_ < ((Class129_Sub3) this).anInt8548; i_666_++)
                    ((Class129_Sub3_Sub2) this).anIntArray9989[i_664_ + i_666_] = ((((Class129_Sub3_Sub2) this).anIntArray9989[i_664_ + i_666_]) & 0xffffff | is[i_665_ + i_666_] << 8 & ~0xffffff);
            }
        } else if (i_662_ == 1) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            for (int i_667_ = 0; i_667_ < ((Class129_Sub3) this).anInt8569; i_667_++) {
                int i_668_ = i_667_ * ((Class129_Sub3) this).anInt8548;
                int i_669_ = (((i_661_ + i_667_) * (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567)) + i);
                for (int i_670_ = 0; i_670_ < ((Class129_Sub3) this).anInt8548; i_670_++)
                    ((Class129_Sub3_Sub2) this).anIntArray9989[i_668_ + i_670_] = ((((Class129_Sub3_Sub2) this).anIntArray9989[i_668_ + i_670_]) & 0xffffff | is[i_669_ + i_670_] << 16 & ~0xffffff);
            }
        } else if (i_662_ == 2) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            for (int i_671_ = 0; i_671_ < ((Class129_Sub3) this).anInt8569; i_671_++) {
                int i_672_ = i_671_ * ((Class129_Sub3) this).anInt8548;
                int i_673_ = (((i_661_ + i_671_) * (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567)) + i);
                for (int i_674_ = 0; i_674_ < ((Class129_Sub3) this).anInt8548; i_674_++)
                    ((Class129_Sub3_Sub2) this).anIntArray9989[i_672_ + i_674_] = ((((Class129_Sub3_Sub2) this).anIntArray9989[i_672_ + i_674_]) & 0xffffff | is[i_673_ + i_674_] << 24 & ~0xffffff);
            }
        } else if (i_662_ == 3) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            for (int i_675_ = 0; i_675_ < ((Class129_Sub3) this).anInt8569; i_675_++) {
                int i_676_ = i_675_ * ((Class129_Sub3) this).anInt8548;
                int i_677_ = (((i_661_ + i_675_) * (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567)) + i);
                for (int i_678_ = 0; i_678_ < ((Class129_Sub3) this).anInt8548; i_678_++)
                    ((Class129_Sub3_Sub2) this).anIntArray9989[i_676_ + i_678_] = ((((Class129_Sub3_Sub2) this).anIntArray9989[i_676_ + i_678_]) & 0xffffff | (is[i_677_ + i_678_] != 0 ? -16777216 : 0));
            }
        }
    }

    Class129_Sub3_Sub2(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_679_, int i_680_, int i_681_, boolean bool) {
        super(var_ha_Sub1, i_680_, i_681_);
        if (bool)
            ((Class129_Sub3_Sub2) this).anIntArray9989 = new int[i_680_ * i_681_];
        else
            ((Class129_Sub3_Sub2) this).anIntArray9989 = is;
        i_679_ -= ((Class129_Sub3) this).anInt8548;
        int i_682_ = 0;
        for (int i_683_ = 0; i_683_ < i_681_; i_683_++) {
            for (int i_684_ = 0; i_684_ < i_680_; i_684_++)
                ((Class129_Sub3_Sub2) this).anIntArray9989[i_682_++] = is[i++];
            i += i_679_;
        }
    }

    final void method1178(int i, int i_685_, int i_686_, int i_687_, int i_688_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        int i_689_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        i += ((Class129_Sub3) this).anInt8566;
        i_685_ += ((Class129_Sub3) this).anInt8571;
        int i_690_ = i_685_ * i_689_ + i;
        int i_691_ = 0;
        int i_692_ = ((Class129_Sub3) this).anInt8569;
        int i_693_ = ((Class129_Sub3) this).anInt8548;
        int i_694_ = i_689_ - i_693_;
        int i_695_ = 0;
        if (i_685_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
            int i_696_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578 - i_685_);
            i_692_ -= i_696_;
            i_685_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578;
            i_691_ += i_696_ * i_693_;
            i_690_ += i_696_ * i_689_;
        }
        if (i_685_ + i_692_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
            i_692_ -= i_685_ + i_692_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
        if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
            int i_697_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575 - i);
            i_693_ -= i_697_;
            i = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575;
            i_691_ += i_697_;
            i_690_ += i_697_;
            i_695_ += i_697_;
            i_694_ += i_697_;
        }
        if (i + i_693_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
            int i_698_ = (i + i_693_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
            i_693_ -= i_698_;
            i_695_ += i_698_;
            i_694_ += i_698_;
        }
        if (i_693_ > 0 && i_692_ > 0) {
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_688_ == 0) {
                if (i_686_ == 1) {
                    for (int i_699_ = -i_692_; i_699_ < 0; i_699_++) {
                        int i_700_ = i_690_ + i_693_ - 3;
                        while (i_690_ < i_700_) {
                            is[i_690_++] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            is[i_690_++] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            is[i_690_++] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            is[i_690_++] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                        }
                        i_700_ += 3;
                        while (i_690_ < i_700_)
                            is[i_690_++] = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 0) {
                    int i_701_ = (i_687_ & 0xff0000) >> 16;
                    int i_702_ = (i_687_ & 0xff00) >> 8;
                    int i_703_ = i_687_ & 0xff;
                    for (int i_704_ = -i_692_; i_704_ < 0; i_704_++) {
                        for (int i_705_ = -i_693_; i_705_ < 0; i_705_++) {
                            int i_706_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            int i_707_ = (i_706_ & 0xff0000) * i_701_ & ~0xffffff;
                            int i_708_ = (i_706_ & 0xff00) * i_702_ & 0xff0000;
                            int i_709_ = (i_706_ & 0xff) * i_703_ & 0xff00;
                            is[i_690_++] = (i_707_ | i_708_ | i_709_) >>> 8;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 3) {
                    for (int i_710_ = -i_692_; i_710_ < 0; i_710_++) {
                        for (int i_711_ = -i_693_; i_711_ < 0; i_711_++) {
                            int i_712_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            int i_713_ = i_712_ + i_687_;
                            int i_714_ = (i_712_ & 0xff00ff) + (i_687_ & 0xff00ff);
                            int i_715_ = ((i_714_ & 0x1000100) + (i_713_ - i_714_ & 0x10000));
                            is[i_690_++] = i_713_ - i_715_ | i_715_ - (i_715_ >>> 8);
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 2) {
                    int i_716_ = i_687_ >>> 24;
                    int i_717_ = 256 - i_716_;
                    int i_718_ = (i_687_ & 0xff00ff) * i_717_ & ~0xff00ff;
                    int i_719_ = (i_687_ & 0xff00) * i_717_ & 0xff0000;
                    i_687_ = (i_718_ | i_719_) >>> 8;
                    for (int i_720_ = -i_692_; i_720_ < 0; i_720_++) {
                        for (int i_721_ = -i_693_; i_721_ < 0; i_721_++) {
                            int i_722_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            i_718_ = (i_722_ & 0xff00ff) * i_716_ & ~0xff00ff;
                            i_719_ = (i_722_ & 0xff00) * i_716_ & 0xff0000;
                            is[i_690_++] = ((i_718_ | i_719_) >>> 8) + i_687_;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_688_ == 1) {
                if (i_686_ == 1) {
                    for (int i_723_ = -i_692_; i_723_ < 0; i_723_++) {
                        for (int i_724_ = -i_693_; i_724_ < 0; i_724_++) {
                            int i_725_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            int i_726_ = i_725_ >>> 24;
                            int i_727_ = 256 - i_726_;
                            int i_728_ = is[i_690_];
                            is[i_690_++] = (((((i_725_ & 0xff00ff) * i_726_ + (i_728_ & 0xff00ff) * i_727_) & ~0xff00ff) >> 8) + ((((i_725_ & ~0xff00ff) >>> 8) * i_726_ + ((i_728_ & ~0xff00ff) >>> 8) * i_727_) & ~0xff00ff));
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 0) {
                    if ((i_687_ & 0xffffff) == 16777215) {
                        for (int i_729_ = -i_692_; i_729_ < 0; i_729_++) {
                            for (int i_730_ = -i_693_; i_730_ < 0; i_730_++) {
                                int i_731_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                                int i_732_ = (i_731_ >>> 24) * (i_687_ >>> 24) >> 8;
                                int i_733_ = 256 - i_732_;
                                int i_734_ = is[i_690_];
                                is[i_690_++] = ((((i_731_ & 0xff00ff) * i_732_ + (i_734_ & 0xff00ff) * i_733_) & ~0xff00ff) + (((i_731_ & 0xff00) * i_732_ + (i_734_ & 0xff00) * i_733_) & 0xff0000)) >> 8;
                            }
                            i_690_ += i_694_;
                            i_691_ += i_695_;
                        }
                    } else {
                        int i_735_ = (i_687_ & 0xff0000) >> 16;
                        int i_736_ = (i_687_ & 0xff00) >> 8;
                        int i_737_ = i_687_ & 0xff;
                        for (int i_738_ = -i_692_; i_738_ < 0; i_738_++) {
                            for (int i_739_ = -i_693_; i_739_ < 0; i_739_++) {
                                int i_740_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                                int i_741_ = (i_740_ >>> 24) * (i_687_ >>> 24) >> 8;
                                int i_742_ = 256 - i_741_;
                                if (i_741_ != 255) {
                                    int i_743_ = ((i_740_ & 0xff0000) * i_735_ & ~0xffffff);
                                    int i_744_ = ((i_740_ & 0xff00) * i_736_ & 0xff0000);
                                    int i_745_ = (i_740_ & 0xff) * i_737_ & 0xff00;
                                    i_740_ = (i_743_ | i_744_ | i_745_) >>> 8;
                                    int i_746_ = is[i_690_];
                                    is[i_690_++] = ((((i_740_ & 0xff00ff) * i_741_ + (i_746_ & 0xff00ff) * i_742_) & ~0xff00ff) + (((i_740_ & 0xff00) * i_741_ + (i_746_ & 0xff00) * i_742_) & 0xff0000)) >> 8;
                                } else {
                                    int i_747_ = ((i_740_ & 0xff0000) * i_735_ & ~0xffffff);
                                    int i_748_ = ((i_740_ & 0xff00) * i_736_ & 0xff0000);
                                    int i_749_ = (i_740_ & 0xff) * i_737_ & 0xff00;
                                    is[i_690_++] = (i_747_ | i_748_ | i_749_) >>> 8;
                                }
                            }
                            i_690_ += i_694_;
                            i_691_ += i_695_;
                        }
                        return;
                    }
                    return;
                }
                if (i_686_ == 3) {
                    for (int i_750_ = -i_692_; i_750_ < 0; i_750_++) {
                        for (int i_751_ = -i_693_; i_751_ < 0; i_751_++) {
                            int i_752_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            int i_753_ = i_752_ + i_687_;
                            int i_754_ = (i_752_ & 0xff00ff) + (i_687_ & 0xff00ff);
                            int i_755_ = ((i_754_ & 0x1000100) + (i_753_ - i_754_ & 0x10000));
                            i_755_ = i_753_ - i_755_ | i_755_ - (i_755_ >>> 8);
                            int i_756_ = (i_755_ >>> 24) * (i_687_ >>> 24) >> 8;
                            int i_757_ = 256 - i_756_;
                            if (i_756_ != 255) {
                                i_752_ = i_755_;
                                i_755_ = is[i_690_];
                                i_755_ = ((((i_752_ & 0xff00ff) * i_756_ + (i_755_ & 0xff00ff) * i_757_) & ~0xff00ff) + (((i_752_ & 0xff00) * i_756_ + (i_755_ & 0xff00) * i_757_) & 0xff0000)) >> 8;
                            }
                            is[i_690_++] = i_755_;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 2) {
                    int i_758_ = i_687_ >>> 24;
                    int i_759_ = 256 - i_758_;
                    int i_760_ = (i_687_ & 0xff00ff) * i_759_ & ~0xff00ff;
                    int i_761_ = (i_687_ & 0xff00) * i_759_ & 0xff0000;
                    i_687_ = (i_760_ | i_761_) >>> 8;
                    for (int i_762_ = -i_692_; i_762_ < 0; i_762_++) {
                        for (int i_763_ = -i_693_; i_763_ < 0; i_763_++) {
                            int i_764_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            int i_765_ = i_764_ >>> 24;
                            int i_766_ = 256 - i_765_;
                            i_760_ = (i_764_ & 0xff00ff) * i_758_ & ~0xff00ff;
                            i_761_ = (i_764_ & 0xff00) * i_758_ & 0xff0000;
                            i_764_ = ((i_760_ | i_761_) >>> 8) + i_687_;
                            int i_767_ = is[i_690_];
                            is[i_690_++] = ((((i_764_ & 0xff00ff) * i_765_ + (i_767_ & 0xff00ff) * i_766_) & ~0xff00ff) + (((i_764_ & 0xff00) * i_765_ + (i_767_ & 0xff00) * i_766_) & 0xff0000)) >> 8;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_688_ == 2) {
                if (i_686_ == 1) {
                    for (int i_768_ = -i_692_; i_768_ < 0; i_768_++) {
                        for (int i_769_ = -i_693_; i_769_ < 0; i_769_++) {
                            int i_770_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            if (i_770_ != 0) {
                                int i_771_ = is[i_690_];
                                int i_772_ = i_770_ + i_771_;
                                int i_773_ = ((i_770_ & 0xff00ff) + (i_771_ & 0xff00ff));
                                i_771_ = (i_773_ & 0x1000100) + (i_772_ - i_773_ & 0x10000);
                                is[i_690_++] = i_772_ - i_771_ | i_771_ - (i_771_ >>> 8);
                            } else
                                i_690_++;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 0) {
                    int i_774_ = (i_687_ & 0xff0000) >> 16;
                    int i_775_ = (i_687_ & 0xff00) >> 8;
                    int i_776_ = i_687_ & 0xff;
                    for (int i_777_ = -i_692_; i_777_ < 0; i_777_++) {
                        for (int i_778_ = -i_693_; i_778_ < 0; i_778_++) {
                            int i_779_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            if (i_779_ != 0) {
                                int i_780_ = (i_779_ & 0xff0000) * i_774_ & ~0xffffff;
                                int i_781_ = (i_779_ & 0xff00) * i_775_ & 0xff0000;
                                int i_782_ = (i_779_ & 0xff) * i_776_ & 0xff00;
                                i_779_ = (i_780_ | i_781_ | i_782_) >>> 8;
                                int i_783_ = is[i_690_];
                                int i_784_ = i_779_ + i_783_;
                                int i_785_ = ((i_779_ & 0xff00ff) + (i_783_ & 0xff00ff));
                                i_783_ = (i_785_ & 0x1000100) + (i_784_ - i_785_ & 0x10000);
                                is[i_690_++] = i_784_ - i_783_ | i_783_ - (i_783_ >>> 8);
                            } else
                                i_690_++;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 3) {
                    for (int i_786_ = -i_692_; i_786_ < 0; i_786_++) {
                        for (int i_787_ = -i_693_; i_787_ < 0; i_787_++) {
                            int i_788_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            int i_789_ = i_788_ + i_687_;
                            int i_790_ = (i_788_ & 0xff00ff) + (i_687_ & 0xff00ff);
                            int i_791_ = ((i_790_ & 0x1000100) + (i_789_ - i_790_ & 0x10000));
                            i_788_ = i_789_ - i_791_ | i_791_ - (i_791_ >>> 8);
                            i_791_ = is[i_690_];
                            i_789_ = i_788_ + i_791_;
                            i_790_ = (i_788_ & 0xff00ff) + (i_791_ & 0xff00ff);
                            i_791_ = (i_790_ & 0x1000100) + (i_789_ - i_790_ & 0x10000);
                            is[i_690_++] = i_789_ - i_791_ | i_791_ - (i_791_ >>> 8);
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                if (i_686_ == 2) {
                    int i_792_ = i_687_ >>> 24;
                    int i_793_ = 256 - i_792_;
                    int i_794_ = (i_687_ & 0xff00ff) * i_793_ & ~0xff00ff;
                    int i_795_ = (i_687_ & 0xff00) * i_793_ & 0xff0000;
                    i_687_ = (i_794_ | i_795_) >>> 8;
                    for (int i_796_ = -i_692_; i_796_ < 0; i_796_++) {
                        for (int i_797_ = -i_693_; i_797_ < 0; i_797_++) {
                            int i_798_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_691_++]);
                            if (i_798_ != 0) {
                                i_794_ = (i_798_ & 0xff00ff) * i_792_ & ~0xff00ff;
                                i_795_ = (i_798_ & 0xff00) * i_792_ & 0xff0000;
                                i_798_ = ((i_794_ | i_795_) >>> 8) + i_687_;
                                int i_799_ = is[i_690_];
                                int i_800_ = i_798_ + i_799_;
                                int i_801_ = ((i_798_ & 0xff00ff) + (i_799_ & 0xff00ff));
                                i_799_ = (i_801_ & 0x1000100) + (i_800_ - i_801_ & 0x10000);
                                is[i_690_++] = i_800_ - i_799_ | i_799_ - (i_799_ >>> 8);
                            } else
                                i_690_++;
                        }
                        i_690_ += i_694_;
                        i_691_ += i_695_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    Class129_Sub3_Sub2(ha_Sub1 var_ha_Sub1, int i, int i_802_) {
        super(var_ha_Sub1, i, i_802_);
        ((Class129_Sub3_Sub2) this).anIntArray9989 = new int[i * i_802_];
    }

    Class129_Sub3_Sub2(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_803_) {
        super(var_ha_Sub1, i, i_803_);
        ((Class129_Sub3_Sub2) this).anIntArray9989 = is;
    }

    final void method1183(int i, int i_804_, int i_805_, int i_806_, int i_807_, int i_808_, int i_809_, int i_810_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        if (i_805_ > 0 && i_806_ > 0) {
            int i_811_ = 0;
            int i_812_ = 0;
            int i_813_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
            int i_814_ = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
            int i_815_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
            int i_816_ = (i_814_ << 16) / i_805_;
            int i_817_ = (i_815_ << 16) / i_806_;
            if (((Class129_Sub3) this).anInt8566 > 0) {
                int i_818_ = (((((Class129_Sub3) this).anInt8566 << 16) + i_816_ - 1) / i_816_);
                i += i_818_;
                i_811_ += i_818_ * i_816_ - (((Class129_Sub3) this).anInt8566 << 16);
            }
            if (((Class129_Sub3) this).anInt8571 > 0) {
                int i_819_ = (((((Class129_Sub3) this).anInt8571 << 16) + i_817_ - 1) / i_817_);
                i_804_ += i_819_;
                i_812_ += i_819_ * i_817_ - (((Class129_Sub3) this).anInt8571 << 16);
            }
            if (((Class129_Sub3) this).anInt8548 < i_814_)
                i_805_ = ((((Class129_Sub3) this).anInt8548 << 16) - i_811_ + i_816_ - 1) / i_816_;
            if (((Class129_Sub3) this).anInt8569 < i_815_)
                i_806_ = ((((Class129_Sub3) this).anInt8569 << 16) - i_812_ + i_817_ - 1) / i_817_;
            int i_820_ = i + i_804_ * i_813_;
            int i_821_ = i_813_ - i_805_;
            if (i_804_ + i_806_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
                i_806_ -= (i_804_ + i_806_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582));
            if (i_804_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
                int i_822_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) - i_804_);
                i_806_ -= i_822_;
                i_820_ += i_822_ * i_813_;
                i_812_ += i_817_ * i_822_;
            }
            if (i + i_805_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
                int i_823_ = (i + i_805_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
                i_805_ -= i_823_;
                i_821_ += i_823_;
            }
            if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
                int i_824_ = ((((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) - i);
                i_805_ -= i_824_;
                i_820_ += i_824_;
                i_811_ += i_816_ * i_824_;
                i_821_ += i_824_;
            }
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_809_ == 0) {
                if (i_807_ == 1) {
                    int i_825_ = i_811_;
                    for (int i_826_ = -i_806_; i_826_ < 0; i_826_++) {
                        int i_827_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_828_ = -i_805_; i_828_ < 0; i_828_++) {
                            is[i_820_++] = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_827_]);
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_825_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 0) {
                    int i_829_ = (i_808_ & 0xff0000) >> 16;
                    int i_830_ = (i_808_ & 0xff00) >> 8;
                    int i_831_ = i_808_ & 0xff;
                    int i_832_ = i_811_;
                    for (int i_833_ = -i_806_; i_833_ < 0; i_833_++) {
                        int i_834_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_835_ = -i_805_; i_835_ < 0; i_835_++) {
                            int i_836_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_834_]);
                            int i_837_ = (i_836_ & 0xff0000) * i_829_ & ~0xffffff;
                            int i_838_ = (i_836_ & 0xff00) * i_830_ & 0xff0000;
                            int i_839_ = (i_836_ & 0xff) * i_831_ & 0xff00;
                            is[i_820_++] = (i_837_ | i_838_ | i_839_) >>> 8;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_832_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 3) {
                    int i_840_ = i_811_;
                    for (int i_841_ = -i_806_; i_841_ < 0; i_841_++) {
                        int i_842_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_843_ = -i_805_; i_843_ < 0; i_843_++) {
                            int i_844_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_842_]);
                            int i_845_ = i_844_ + i_808_;
                            int i_846_ = (i_844_ & 0xff00ff) + (i_808_ & 0xff00ff);
                            int i_847_ = ((i_846_ & 0x1000100) + (i_845_ - i_846_ & 0x10000));
                            is[i_820_++] = i_845_ - i_847_ | i_847_ - (i_847_ >>> 8);
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_840_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 2) {
                    int i_848_ = i_808_ >>> 24;
                    int i_849_ = 256 - i_848_;
                    int i_850_ = (i_808_ & 0xff00ff) * i_849_ & ~0xff00ff;
                    int i_851_ = (i_808_ & 0xff00) * i_849_ & 0xff0000;
                    i_808_ = (i_850_ | i_851_) >>> 8;
                    int i_852_ = i_811_;
                    for (int i_853_ = -i_806_; i_853_ < 0; i_853_++) {
                        int i_854_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_855_ = -i_805_; i_855_ < 0; i_855_++) {
                            int i_856_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_854_]);
                            i_850_ = (i_856_ & 0xff00ff) * i_848_ & ~0xff00ff;
                            i_851_ = (i_856_ & 0xff00) * i_848_ & 0xff0000;
                            is[i_820_++] = ((i_850_ | i_851_) >>> 8) + i_808_;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_852_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_809_ == 1) {
                if (i_807_ == 1) {
                    int i_857_ = i_811_;
                    for (int i_858_ = -i_806_; i_858_ < 0; i_858_++) {
                        int i_859_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_860_ = -i_805_; i_860_ < 0; i_860_++) {
                            int i_861_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_859_]);
                            int i_862_ = i_861_ >>> 24;
                            int i_863_ = 256 - i_862_;
                            int i_864_ = is[i_820_];
                            is[i_820_++] = (((((i_861_ & 0xff00ff) * i_862_ + (i_864_ & 0xff00ff) * i_863_) & ~0xff00ff) >> 8) + ((((i_861_ & ~0xff00ff) >>> 8) * i_862_ + ((i_864_ & ~0xff00ff) >>> 8) * i_863_) & ~0xff00ff));
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_857_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 0) {
                    int i_865_ = i_811_;
                    if ((i_808_ & 0xffffff) == 16777215) {
                        for (int i_866_ = -i_806_; i_866_ < 0; i_866_++) {
                            int i_867_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_868_ = -i_805_; i_868_ < 0; i_868_++) {
                                int i_869_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_867_]);
                                int i_870_ = (i_869_ >>> 24) * (i_808_ >>> 24) >> 8;
                                int i_871_ = 256 - i_870_;
                                int i_872_ = is[i_820_];
                                is[i_820_++] = ((((i_869_ & 0xff00ff) * i_870_ + (i_872_ & 0xff00ff) * i_871_) & ~0xff00ff) + (((i_869_ & 0xff00) * i_870_ + (i_872_ & 0xff00) * i_871_) & 0xff0000)) >> 8;
                                i_811_ += i_816_;
                            }
                            i_812_ += i_817_;
                            i_811_ = i_865_;
                            i_820_ += i_821_;
                        }
                    } else {
                        int i_873_ = (i_808_ & 0xff0000) >> 16;
                        int i_874_ = (i_808_ & 0xff00) >> 8;
                        int i_875_ = i_808_ & 0xff;
                        for (int i_876_ = -i_806_; i_876_ < 0; i_876_++) {
                            int i_877_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_878_ = -i_805_; i_878_ < 0; i_878_++) {
                                int i_879_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_877_]);
                                int i_880_ = (i_879_ >>> 24) * (i_808_ >>> 24) >> 8;
                                int i_881_ = 256 - i_880_;
                                if (i_880_ != 255) {
                                    int i_882_ = ((i_879_ & 0xff0000) * i_873_ & ~0xffffff);
                                    int i_883_ = ((i_879_ & 0xff00) * i_874_ & 0xff0000);
                                    int i_884_ = (i_879_ & 0xff) * i_875_ & 0xff00;
                                    i_879_ = (i_882_ | i_883_ | i_884_) >>> 8;
                                    int i_885_ = is[i_820_];
                                    is[i_820_++] = ((((i_879_ & 0xff00ff) * i_880_ + (i_885_ & 0xff00ff) * i_881_) & ~0xff00ff) + (((i_879_ & 0xff00) * i_880_ + (i_885_ & 0xff00) * i_881_) & 0xff0000)) >> 8;
                                } else {
                                    int i_886_ = ((i_879_ & 0xff0000) * i_873_ & ~0xffffff);
                                    int i_887_ = ((i_879_ & 0xff00) * i_874_ & 0xff0000);
                                    int i_888_ = (i_879_ & 0xff) * i_875_ & 0xff00;
                                    is[i_820_++] = (i_886_ | i_887_ | i_888_) >>> 8;
                                }
                                i_811_ += i_816_;
                            }
                            i_812_ += i_817_;
                            i_811_ = i_865_;
                            i_820_ += i_821_;
                        }
                        return;
                    }
                    return;
                }
                if (i_807_ == 3) {
                    int i_889_ = i_811_;
                    for (int i_890_ = -i_806_; i_890_ < 0; i_890_++) {
                        int i_891_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_892_ = -i_805_; i_892_ < 0; i_892_++) {
                            int i_893_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_891_]);
                            int i_894_ = i_893_ + i_808_;
                            int i_895_ = (i_893_ & 0xff00ff) + (i_808_ & 0xff00ff);
                            int i_896_ = ((i_895_ & 0x1000100) + (i_894_ - i_895_ & 0x10000));
                            i_896_ = i_894_ - i_896_ | i_896_ - (i_896_ >>> 8);
                            int i_897_ = (i_896_ >>> 24) * (i_808_ >>> 24) >> 8;
                            int i_898_ = 256 - i_897_;
                            if (i_897_ != 255) {
                                i_893_ = i_896_;
                                i_896_ = is[i_820_];
                                i_896_ = ((((i_893_ & 0xff00ff) * i_897_ + (i_896_ & 0xff00ff) * i_898_) & ~0xff00ff) + (((i_893_ & 0xff00) * i_897_ + (i_896_ & 0xff00) * i_898_) & 0xff0000)) >> 8;
                            }
                            is[i_820_++] = i_896_;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_889_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 2) {
                    int i_899_ = i_808_ >>> 24;
                    int i_900_ = 256 - i_899_;
                    int i_901_ = (i_808_ & 0xff00ff) * i_900_ & ~0xff00ff;
                    int i_902_ = (i_808_ & 0xff00) * i_900_ & 0xff0000;
                    i_808_ = (i_901_ | i_902_) >>> 8;
                    int i_903_ = i_811_;
                    for (int i_904_ = -i_806_; i_904_ < 0; i_904_++) {
                        int i_905_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_906_ = -i_805_; i_906_ < 0; i_906_++) {
                            int i_907_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_905_]);
                            int i_908_ = i_907_ >>> 24;
                            int i_909_ = 256 - i_908_;
                            i_901_ = (i_907_ & 0xff00ff) * i_899_ & ~0xff00ff;
                            i_902_ = (i_907_ & 0xff00) * i_899_ & 0xff0000;
                            i_907_ = ((i_901_ | i_902_) >>> 8) + i_808_;
                            int i_910_ = is[i_820_];
                            is[i_820_++] = ((((i_907_ & 0xff00ff) * i_908_ + (i_910_ & 0xff00ff) * i_909_) & ~0xff00ff) + (((i_907_ & 0xff00) * i_908_ + (i_910_ & 0xff00) * i_909_) & 0xff0000)) >> 8;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_903_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_809_ == 2) {
                if (i_807_ == 1) {
                    int i_911_ = i_811_;
                    for (int i_912_ = -i_806_; i_912_ < 0; i_912_++) {
                        int i_913_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_914_ = -i_805_; i_914_ < 0; i_914_++) {
                            int i_915_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_913_]);
                            if (i_915_ != 0) {
                                int i_916_ = is[i_820_];
                                int i_917_ = i_915_ + i_916_;
                                int i_918_ = ((i_915_ & 0xff00ff) + (i_916_ & 0xff00ff));
                                i_916_ = (i_918_ & 0x1000100) + (i_917_ - i_918_ & 0x10000);
                                is[i_820_++] = i_917_ - i_916_ | i_916_ - (i_916_ >>> 8);
                            } else
                                i_820_++;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_911_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 0) {
                    int i_919_ = i_811_;
                    int i_920_ = (i_808_ & 0xff0000) >> 16;
                    int i_921_ = (i_808_ & 0xff00) >> 8;
                    int i_922_ = i_808_ & 0xff;
                    for (int i_923_ = -i_806_; i_923_ < 0; i_923_++) {
                        int i_924_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_925_ = -i_805_; i_925_ < 0; i_925_++) {
                            int i_926_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_924_]);
                            if (i_926_ != 0) {
                                int i_927_ = (i_926_ & 0xff0000) * i_920_ & ~0xffffff;
                                int i_928_ = (i_926_ & 0xff00) * i_921_ & 0xff0000;
                                int i_929_ = (i_926_ & 0xff) * i_922_ & 0xff00;
                                i_926_ = (i_927_ | i_928_ | i_929_) >>> 8;
                                int i_930_ = is[i_820_];
                                int i_931_ = i_926_ + i_930_;
                                int i_932_ = ((i_926_ & 0xff00ff) + (i_930_ & 0xff00ff));
                                i_930_ = (i_932_ & 0x1000100) + (i_931_ - i_932_ & 0x10000);
                                is[i_820_++] = i_931_ - i_930_ | i_930_ - (i_930_ >>> 8);
                            } else
                                i_820_++;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_919_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 3) {
                    int i_933_ = i_811_;
                    for (int i_934_ = -i_806_; i_934_ < 0; i_934_++) {
                        int i_935_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_936_ = -i_805_; i_936_ < 0; i_936_++) {
                            int i_937_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_935_]);
                            int i_938_ = i_937_ + i_808_;
                            int i_939_ = (i_937_ & 0xff00ff) + (i_808_ & 0xff00ff);
                            int i_940_ = ((i_939_ & 0x1000100) + (i_938_ - i_939_ & 0x10000));
                            i_937_ = i_938_ - i_940_ | i_940_ - (i_940_ >>> 8);
                            i_940_ = is[i_820_];
                            i_938_ = i_937_ + i_940_;
                            i_939_ = (i_937_ & 0xff00ff) + (i_940_ & 0xff00ff);
                            i_940_ = (i_939_ & 0x1000100) + (i_938_ - i_939_ & 0x10000);
                            is[i_820_++] = i_938_ - i_940_ | i_940_ - (i_940_ >>> 8);
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_933_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                if (i_807_ == 2) {
                    int i_941_ = i_808_ >>> 24;
                    int i_942_ = 256 - i_941_;
                    int i_943_ = (i_808_ & 0xff00ff) * i_942_ & ~0xff00ff;
                    int i_944_ = (i_808_ & 0xff00) * i_942_ & 0xff0000;
                    i_808_ = (i_943_ | i_944_) >>> 8;
                    int i_945_ = i_811_;
                    for (int i_946_ = -i_806_; i_946_ < 0; i_946_++) {
                        int i_947_ = ((i_812_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_948_ = -i_805_; i_948_ < 0; i_948_++) {
                            int i_949_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_811_ >> 16) + i_947_]);
                            if (i_949_ != 0) {
                                i_943_ = (i_949_ & 0xff00ff) * i_941_ & ~0xff00ff;
                                i_944_ = (i_949_ & 0xff00) * i_941_ & 0xff0000;
                                i_949_ = ((i_943_ | i_944_) >>> 8) + i_808_;
                                int i_950_ = is[i_820_];
                                int i_951_ = i_949_ + i_950_;
                                int i_952_ = ((i_949_ & 0xff00ff) + (i_950_ & 0xff00ff));
                                i_950_ = (i_952_ & 0x1000100) + (i_951_ - i_952_ & 0x10000);
                                is[i_820_++] = i_951_ - i_950_ | i_950_ - (i_950_ >>> 8);
                            } else
                                i_820_++;
                            i_811_ += i_816_;
                        }
                        i_812_ += i_817_;
                        i_811_ = i_945_;
                        i_820_ += i_821_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1194(int[] is, int[] is_953_, int i, int i_954_) {
        int[] is_955_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        if (Class129_Sub3.anInt8557 == 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_956_ = Class129_Sub3.anInt8577;
                while (i_956_ < 0) {
                    int i_957_ = i_956_ + i_954_;
                    if (i_957_ >= 0) {
                        if (i_957_ >= is.length)
                            break;
                        int i_958_ = Class129_Sub3.anInt8550;
                        int i_959_ = Class129_Sub3.anInt8558;
                        int i_960_ = Class129_Sub3.anInt8561;
                        int i_961_ = Class129_Sub3.anInt8549;
                        if (i_959_ >= 0 && i_960_ >= 0 && i_959_ - (((Class129_Sub3) this).anInt8548 << 12) < 0 && i_960_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                            int i_962_ = is[i_957_] - i;
                            int i_963_ = -is_953_[i_957_];
                            int i_964_ = i_962_ - (i_958_ - Class129_Sub3.anInt8550);
                            if (i_964_ > 0) {
                                i_958_ += i_964_;
                                i_961_ += i_964_;
                                i_959_ += Class129_Sub3.anInt8557 * i_964_;
                                i_960_ += Class129_Sub3.anInt8564 * i_964_;
                            } else
                                i_963_ -= i_964_;
                            if (i_961_ < i_963_)
                                i_961_ = i_963_;
                            for (/**/; i_961_ < 0; i_961_++) {
                                int i_965_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_960_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_959_ >> 12))]);
                                int i_966_ = i_965_ >>> 24;
                                int i_967_ = 256 - i_966_;
                                int i_968_ = is_955_[i_958_];
                                is_955_[i_958_++] = ((((i_965_ & 0xff00ff) * i_966_ + (i_968_ & 0xff00ff) * i_967_) & ~0xff00ff) + (((i_965_ & 0xff00) * i_966_ + (i_968_ & 0xff00) * i_967_) & 0xff0000)) >> 8;
                            }
                        }
                    }
                    i_956_++;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_969_ = Class129_Sub3.anInt8577;
                while (i_969_ < 0) {
                    int i_970_ = i_969_ + i_954_;
                    if (i_970_ >= 0) {
                        if (i_970_ >= is.length)
                            break;
                        int i_971_ = Class129_Sub3.anInt8550;
                        int i_972_ = Class129_Sub3.anInt8558;
                        int i_973_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_974_ = Class129_Sub3.anInt8549;
                        if (i_972_ >= 0 && i_972_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                            int i_975_;
                            if ((i_975_ = i_973_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                                i_975_ = ((Class129_Sub3.anInt8564 - i_975_) / Class129_Sub3.anInt8564);
                                i_974_ += i_975_;
                                i_973_ += Class129_Sub3.anInt8564 * i_975_;
                                i_971_ += i_975_;
                            }
                            if ((i_975_ = ((i_973_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_974_)
                                i_974_ = i_975_;
                            int i_976_ = is[i_970_] - i;
                            int i_977_ = -is_953_[i_970_];
                            int i_978_ = i_976_ - (i_971_ - Class129_Sub3.anInt8550);
                            if (i_978_ > 0) {
                                i_971_ += i_978_;
                                i_974_ += i_978_;
                                i_972_ += Class129_Sub3.anInt8557 * i_978_;
                                i_973_ += Class129_Sub3.anInt8564 * i_978_;
                            } else
                                i_977_ -= i_978_;
                            if (i_974_ < i_977_)
                                i_974_ = i_977_;
                            for (/**/; i_974_ < 0; i_974_++) {
                                int i_979_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_973_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_972_ >> 12))]);
                                int i_980_ = i_979_ >>> 24;
                                int i_981_ = 256 - i_980_;
                                int i_982_ = is_955_[i_971_];
                                is_955_[i_971_++] = ((((i_979_ & 0xff00ff) * i_980_ + (i_982_ & 0xff00ff) * i_981_) & ~0xff00ff) + (((i_979_ & 0xff00) * i_980_ + (i_982_ & 0xff00) * i_981_) & 0xff0000)) >> 8;
                                i_973_ += Class129_Sub3.anInt8564;
                            }
                        }
                    }
                    i_969_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_983_ = Class129_Sub3.anInt8577;
                while (i_983_ < 0) {
                    int i_984_ = i_983_ + i_954_;
                    if (i_984_ >= 0) {
                        if (i_984_ >= is.length)
                            break;
                        int i_985_ = Class129_Sub3.anInt8550;
                        int i_986_ = Class129_Sub3.anInt8558;
                        int i_987_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_988_ = Class129_Sub3.anInt8549;
                        if (i_986_ >= 0 && i_986_ - (((Class129_Sub3) this).anInt8548 << 12) < 0) {
                            if (i_987_ < 0) {
                                int i_989_ = ((Class129_Sub3.anInt8564 - 1 - i_987_) / Class129_Sub3.anInt8564);
                                i_988_ += i_989_;
                                i_987_ += Class129_Sub3.anInt8564 * i_989_;
                                i_985_ += i_989_;
                            }
                            int i_990_;
                            if ((i_990_ = ((1 + i_987_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_988_)
                                i_988_ = i_990_;
                            int i_991_ = is[i_984_] - i;
                            int i_992_ = -is_953_[i_984_];
                            int i_993_ = i_991_ - (i_985_ - Class129_Sub3.anInt8550);
                            if (i_993_ > 0) {
                                i_985_ += i_993_;
                                i_988_ += i_993_;
                                i_986_ += Class129_Sub3.anInt8557 * i_993_;
                                i_987_ += Class129_Sub3.anInt8564 * i_993_;
                            } else
                                i_992_ -= i_993_;
                            if (i_988_ < i_992_)
                                i_988_ = i_992_;
                            for (/**/; i_988_ < 0; i_988_++) {
                                int i_994_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_987_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_986_ >> 12))]);
                                int i_995_ = i_994_ >>> 24;
                                int i_996_ = 256 - i_995_;
                                int i_997_ = is_955_[i_985_];
                                is_955_[i_985_++] = ((((i_994_ & 0xff00ff) * i_995_ + (i_997_ & 0xff00ff) * i_996_) & ~0xff00ff) + (((i_994_ & 0xff00) * i_995_ + (i_997_ & 0xff00) * i_996_) & 0xff0000)) >> 8;
                                i_987_ += Class129_Sub3.anInt8564;
                            }
                        }
                    }
                    i_983_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8557 < 0) {
            if (Class129_Sub3.anInt8564 == 0) {
                int i_998_ = Class129_Sub3.anInt8577;
                while (i_998_ < 0) {
                    int i_999_ = i_998_ + i_954_;
                    if (i_999_ >= 0) {
                        if (i_999_ >= is.length)
                            break;
                        int i_1000_ = Class129_Sub3.anInt8550;
                        int i_1001_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_1002_ = Class129_Sub3.anInt8561;
                        int i_1003_ = Class129_Sub3.anInt8549;
                        if (i_1002_ >= 0 && i_1002_ - (((Class129_Sub3) this).anInt8569 << 12) < 0) {
                            int i_1004_;
                            if ((i_1004_ = i_1001_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                                i_1004_ = ((Class129_Sub3.anInt8557 - i_1004_) / Class129_Sub3.anInt8557);
                                i_1003_ += i_1004_;
                                i_1001_ += Class129_Sub3.anInt8557 * i_1004_;
                                i_1000_ += i_1004_;
                            }
                            if ((i_1004_ = ((i_1001_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1003_)
                                i_1003_ = i_1004_;
                            int i_1005_ = is[i_999_] - i;
                            int i_1006_ = -is_953_[i_999_];
                            int i_1007_ = (i_1005_ - (i_1000_ - Class129_Sub3.anInt8550));
                            if (i_1007_ > 0) {
                                i_1000_ += i_1007_;
                                i_1003_ += i_1007_;
                                i_1001_ += Class129_Sub3.anInt8557 * i_1007_;
                                i_1002_ += Class129_Sub3.anInt8564 * i_1007_;
                            } else
                                i_1006_ -= i_1007_;
                            if (i_1003_ < i_1006_)
                                i_1003_ = i_1006_;
                            for (/**/; i_1003_ < 0; i_1003_++) {
                                int i_1008_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_1002_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1001_ >> 12))]);
                                int i_1009_ = i_1008_ >>> 24;
                                int i_1010_ = 256 - i_1009_;
                                int i_1011_ = is_955_[i_1000_];
                                is_955_[i_1000_++] = ((((i_1008_ & 0xff00ff) * i_1009_ + (i_1011_ & 0xff00ff) * i_1010_) & ~0xff00ff) + (((i_1008_ & 0xff00) * i_1009_ + (i_1011_ & 0xff00) * i_1010_) & 0xff0000)) >> 8;
                                i_1001_ += Class129_Sub3.anInt8557;
                            }
                        }
                    }
                    i_998_++;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else if (Class129_Sub3.anInt8564 < 0) {
                int i_1012_ = Class129_Sub3.anInt8577;
                while (i_1012_ < 0) {
                    int i_1013_ = i_1012_ + i_954_;
                    if (i_1013_ >= 0) {
                        if (i_1013_ >= is.length)
                            break;
                        int i_1014_ = Class129_Sub3.anInt8550;
                        int i_1015_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_1016_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_1017_ = Class129_Sub3.anInt8549;
                        int i_1018_;
                        if ((i_1018_ = i_1015_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_1018_ = ((Class129_Sub3.anInt8557 - i_1018_) / Class129_Sub3.anInt8557);
                            i_1017_ += i_1018_;
                            i_1015_ += Class129_Sub3.anInt8557 * i_1018_;
                            i_1016_ += Class129_Sub3.anInt8564 * i_1018_;
                            i_1014_ += i_1018_;
                        }
                        if ((i_1018_ = ((i_1015_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1017_)
                            i_1017_ = i_1018_;
                        if ((i_1018_ = i_1016_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                            i_1018_ = ((Class129_Sub3.anInt8564 - i_1018_) / Class129_Sub3.anInt8564);
                            i_1017_ += i_1018_;
                            i_1015_ += Class129_Sub3.anInt8557 * i_1018_;
                            i_1016_ += Class129_Sub3.anInt8564 * i_1018_;
                            i_1014_ += i_1018_;
                        }
                        if ((i_1018_ = ((i_1016_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1017_)
                            i_1017_ = i_1018_;
                        int i_1019_ = is[i_1013_] - i;
                        int i_1020_ = -is_953_[i_1013_];
                        int i_1021_ = i_1019_ - (i_1014_ - Class129_Sub3.anInt8550);
                        if (i_1021_ > 0) {
                            i_1014_ += i_1021_;
                            i_1017_ += i_1021_;
                            i_1015_ += Class129_Sub3.anInt8557 * i_1021_;
                            i_1016_ += Class129_Sub3.anInt8564 * i_1021_;
                        } else
                            i_1020_ -= i_1021_;
                        if (i_1017_ < i_1020_)
                            i_1017_ = i_1020_;
                        for (/**/; i_1017_ < 0; i_1017_++) {
                            int i_1022_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_1016_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1015_ >> 12))]);
                            int i_1023_ = i_1022_ >>> 24;
                            int i_1024_ = 256 - i_1023_;
                            int i_1025_ = is_955_[i_1014_];
                            is_955_[i_1014_++] = ((((i_1022_ & 0xff00ff) * i_1023_ + (i_1025_ & 0xff00ff) * i_1024_) & ~0xff00ff) + (((i_1022_ & 0xff00) * i_1023_ + (i_1025_ & 0xff00) * i_1024_) & 0xff0000)) >> 8;
                            i_1015_ += Class129_Sub3.anInt8557;
                            i_1016_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_1012_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            } else {
                int i_1026_ = Class129_Sub3.anInt8577;
                while (i_1026_ < 0) {
                    int i_1027_ = i_1026_ + i_954_;
                    if (i_1027_ >= 0) {
                        if (i_1027_ >= is.length)
                            break;
                        int i_1028_ = Class129_Sub3.anInt8550;
                        int i_1029_ = (Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554);
                        int i_1030_ = (Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562);
                        int i_1031_ = Class129_Sub3.anInt8549;
                        int i_1032_;
                        if ((i_1032_ = i_1029_ - (((Class129_Sub3) this).anInt8548 << 12)) >= 0) {
                            i_1032_ = ((Class129_Sub3.anInt8557 - i_1032_) / Class129_Sub3.anInt8557);
                            i_1031_ += i_1032_;
                            i_1029_ += Class129_Sub3.anInt8557 * i_1032_;
                            i_1030_ += Class129_Sub3.anInt8564 * i_1032_;
                            i_1028_ += i_1032_;
                        }
                        if ((i_1032_ = ((i_1029_ - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1031_)
                            i_1031_ = i_1032_;
                        if (i_1030_ < 0) {
                            i_1032_ = ((Class129_Sub3.anInt8564 - 1 - i_1030_) / Class129_Sub3.anInt8564);
                            i_1031_ += i_1032_;
                            i_1029_ += Class129_Sub3.anInt8557 * i_1032_;
                            i_1030_ += Class129_Sub3.anInt8564 * i_1032_;
                            i_1028_ += i_1032_;
                        }
                        if ((i_1032_ = ((1 + i_1030_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1031_)
                            i_1031_ = i_1032_;
                        int i_1033_ = is[i_1027_] - i;
                        int i_1034_ = -is_953_[i_1027_];
                        int i_1035_ = i_1033_ - (i_1028_ - Class129_Sub3.anInt8550);
                        if (i_1035_ > 0) {
                            i_1028_ += i_1035_;
                            i_1031_ += i_1035_;
                            i_1029_ += Class129_Sub3.anInt8557 * i_1035_;
                            i_1030_ += Class129_Sub3.anInt8564 * i_1035_;
                        } else
                            i_1034_ -= i_1035_;
                        if (i_1031_ < i_1034_)
                            i_1031_ = i_1034_;
                        for (/**/; i_1031_ < 0; i_1031_++) {
                            int i_1036_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_1030_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1029_ >> 12))]);
                            int i_1037_ = i_1036_ >>> 24;
                            int i_1038_ = 256 - i_1037_;
                            int i_1039_ = is_955_[i_1028_];
                            is_955_[i_1028_++] = ((((i_1036_ & 0xff00ff) * i_1037_ + (i_1039_ & 0xff00ff) * i_1038_) & ~0xff00ff) + (((i_1036_ & 0xff00) * i_1037_ + (i_1039_ & 0xff00) * i_1038_) & 0xff0000)) >> 8;
                            i_1029_ += Class129_Sub3.anInt8557;
                            i_1030_ += Class129_Sub3.anInt8564;
                        }
                    }
                    i_1026_++;
                    Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                    Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                    Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
                }
            }
        } else if (Class129_Sub3.anInt8564 == 0) {
            int i_1040_ = Class129_Sub3.anInt8577;
            while (i_1040_ < 0) {
                int i_1041_ = i_1040_ + i_954_;
                if (i_1041_ >= 0) {
                    if (i_1041_ >= is.length)
                        break;
                    int i_1042_ = Class129_Sub3.anInt8550;
                    int i_1043_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_1044_ = Class129_Sub3.anInt8561;
                    int i_1045_ = Class129_Sub3.anInt8549;
                    if (i_1044_ >= 0 && (i_1044_ - (((Class129_Sub3) this).anInt8569 << 12) < 0)) {
                        if (i_1043_ < 0) {
                            int i_1046_ = ((Class129_Sub3.anInt8557 - 1 - i_1043_) / Class129_Sub3.anInt8557);
                            i_1045_ += i_1046_;
                            i_1043_ += Class129_Sub3.anInt8557 * i_1046_;
                            i_1042_ += i_1046_;
                        }
                        int i_1047_;
                        if ((i_1047_ = ((1 + i_1043_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1045_)
                            i_1045_ = i_1047_;
                        int i_1048_ = is[i_1041_] - i;
                        int i_1049_ = -is_953_[i_1041_];
                        int i_1050_ = i_1048_ - (i_1042_ - Class129_Sub3.anInt8550);
                        if (i_1050_ > 0) {
                            i_1042_ += i_1050_;
                            i_1045_ += i_1050_;
                            i_1043_ += Class129_Sub3.anInt8557 * i_1050_;
                            i_1044_ += Class129_Sub3.anInt8564 * i_1050_;
                        } else
                            i_1049_ -= i_1050_;
                        if (i_1045_ < i_1049_)
                            i_1045_ = i_1049_;
                        for (/**/; i_1045_ < 0; i_1045_++) {
                            int i_1051_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_1044_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1043_ >> 12))]);
                            int i_1052_ = i_1051_ >>> 24;
                            int i_1053_ = 256 - i_1052_;
                            int i_1054_ = is_955_[i_1042_];
                            is_955_[i_1042_++] = ((((i_1051_ & 0xff00ff) * i_1052_ + (i_1054_ & 0xff00ff) * i_1053_) & ~0xff00ff) + (((i_1051_ & 0xff00) * i_1052_ + (i_1054_ & 0xff00) * i_1053_) & 0xff0000)) >> 8;
                            i_1043_ += Class129_Sub3.anInt8557;
                        }
                    }
                }
                i_1040_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else if (Class129_Sub3.anInt8564 < 0) {
            int i_1055_ = Class129_Sub3.anInt8577;
            while (i_1055_ < 0) {
                int i_1056_ = i_1055_ + i_954_;
                if (i_1056_ >= 0) {
                    if (i_1056_ >= is.length)
                        break;
                    int i_1057_ = Class129_Sub3.anInt8550;
                    int i_1058_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_1059_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_1060_ = Class129_Sub3.anInt8549;
                    if (i_1058_ < 0) {
                        int i_1061_ = ((Class129_Sub3.anInt8557 - 1 - i_1058_) / Class129_Sub3.anInt8557);
                        i_1060_ += i_1061_;
                        i_1058_ += Class129_Sub3.anInt8557 * i_1061_;
                        i_1059_ += Class129_Sub3.anInt8564 * i_1061_;
                        i_1057_ += i_1061_;
                    }
                    int i_1062_;
                    if ((i_1062_ = ((1 + i_1058_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1060_)
                        i_1060_ = i_1062_;
                    if ((i_1062_ = i_1059_ - (((Class129_Sub3) this).anInt8569 << 12)) >= 0) {
                        i_1062_ = ((Class129_Sub3.anInt8564 - i_1062_) / Class129_Sub3.anInt8564);
                        i_1060_ += i_1062_;
                        i_1058_ += Class129_Sub3.anInt8557 * i_1062_;
                        i_1059_ += Class129_Sub3.anInt8564 * i_1062_;
                        i_1057_ += i_1062_;
                    }
                    if ((i_1062_ = ((i_1059_ - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1060_)
                        i_1060_ = i_1062_;
                    int i_1063_ = is[i_1056_] - i;
                    int i_1064_ = -is_953_[i_1056_];
                    int i_1065_ = i_1063_ - (i_1057_ - Class129_Sub3.anInt8550);
                    if (i_1065_ > 0) {
                        i_1057_ += i_1065_;
                        i_1060_ += i_1065_;
                        i_1058_ += Class129_Sub3.anInt8557 * i_1065_;
                        i_1059_ += Class129_Sub3.anInt8564 * i_1065_;
                    } else
                        i_1064_ -= i_1065_;
                    if (i_1060_ < i_1064_)
                        i_1060_ = i_1064_;
                    for (/**/; i_1060_ < 0; i_1060_++) {
                        int i_1066_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_1059_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1058_ >> 12))]);
                        int i_1067_ = i_1066_ >>> 24;
                        int i_1068_ = 256 - i_1067_;
                        int i_1069_ = is_955_[i_1057_];
                        is_955_[i_1057_++] = ((((i_1066_ & 0xff00ff) * i_1067_ + (i_1069_ & 0xff00ff) * i_1068_) & ~0xff00ff) + (((i_1066_ & 0xff00) * i_1067_ + (i_1069_ & 0xff00) * i_1068_) & 0xff0000)) >> 8;
                        i_1058_ += Class129_Sub3.anInt8557;
                        i_1059_ += Class129_Sub3.anInt8564;
                    }
                }
                i_1055_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        } else {
            int i_1070_ = Class129_Sub3.anInt8577;
            while (i_1070_ < 0) {
                int i_1071_ = i_1070_ + i_954_;
                if (i_1071_ >= 0) {
                    if (i_1071_ >= is.length)
                        break;
                    int i_1072_ = Class129_Sub3.anInt8550;
                    int i_1073_ = Class129_Sub3.anInt8558 + Class129_Sub3.anInt8554;
                    int i_1074_ = Class129_Sub3.anInt8561 + Class129_Sub3.anInt8562;
                    int i_1075_ = Class129_Sub3.anInt8549;
                    if (i_1073_ < 0) {
                        int i_1076_ = ((Class129_Sub3.anInt8557 - 1 - i_1073_) / Class129_Sub3.anInt8557);
                        i_1075_ += i_1076_;
                        i_1073_ += Class129_Sub3.anInt8557 * i_1076_;
                        i_1074_ += Class129_Sub3.anInt8564 * i_1076_;
                        i_1072_ += i_1076_;
                    }
                    int i_1077_;
                    if ((i_1077_ = ((1 + i_1073_ - (((Class129_Sub3) this).anInt8548 << 12) - Class129_Sub3.anInt8557) / Class129_Sub3.anInt8557)) > i_1075_)
                        i_1075_ = i_1077_;
                    if (i_1074_ < 0) {
                        i_1077_ = ((Class129_Sub3.anInt8564 - 1 - i_1074_) / Class129_Sub3.anInt8564);
                        i_1075_ += i_1077_;
                        i_1073_ += Class129_Sub3.anInt8557 * i_1077_;
                        i_1074_ += Class129_Sub3.anInt8564 * i_1077_;
                        i_1072_ += i_1077_;
                    }
                    if ((i_1077_ = ((1 + i_1074_ - (((Class129_Sub3) this).anInt8569 << 12) - Class129_Sub3.anInt8564) / Class129_Sub3.anInt8564)) > i_1075_)
                        i_1075_ = i_1077_;
                    int i_1078_ = is[i_1071_] - i;
                    int i_1079_ = -is_953_[i_1071_];
                    int i_1080_ = i_1078_ - (i_1072_ - Class129_Sub3.anInt8550);
                    if (i_1080_ > 0) {
                        i_1072_ += i_1080_;
                        i_1075_ += i_1080_;
                        i_1073_ += Class129_Sub3.anInt8557 * i_1080_;
                        i_1074_ += Class129_Sub3.anInt8564 * i_1080_;
                    } else
                        i_1079_ -= i_1080_;
                    if (i_1075_ < i_1079_)
                        i_1075_ = i_1079_;
                    for (/**/; i_1075_ < 0; i_1075_++) {
                        int i_1081_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(((i_1074_ >> 12) * ((Class129_Sub3) this).anInt8548) + (i_1073_ >> 12))]);
                        int i_1082_ = i_1081_ >>> 24;
                        int i_1083_ = 256 - i_1082_;
                        int i_1084_ = is_955_[i_1072_];
                        is_955_[i_1072_++] = ((((i_1081_ & 0xff00ff) * i_1082_ + (i_1084_ & 0xff00ff) * i_1083_) & ~0xff00ff) + (((i_1081_ & 0xff00) * i_1082_ + (i_1084_ & 0xff00) * i_1083_) & 0xff0000)) >> 8;
                        i_1073_ += Class129_Sub3.anInt8557;
                        i_1074_ += Class129_Sub3.anInt8564;
                    }
                }
                i_1070_++;
                Class129_Sub3.anInt8558 += Class129_Sub3.anInt8576;
                Class129_Sub3.anInt8561 += Class129_Sub3.anInt8555;
                Class129_Sub3.anInt8550 += Class129_Sub3.anInt8552;
            }
        }
    }

    final void method1164(int i, int i_1085_, aa var_aa, int i_1086_, int i_1087_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        i += ((Class129_Sub3) this).anInt8566;
        i_1085_ += ((Class129_Sub3) this).anInt8571;
        int i_1088_ = 0;
        int i_1089_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        int i_1090_ = ((Class129_Sub3) this).anInt8548;
        int i_1091_ = ((Class129_Sub3) this).anInt8569;
        int i_1092_ = i_1089_ - i_1090_;
        int i_1093_ = 0;
        int i_1094_ = i + i_1085_ * i_1089_;
        if (i_1085_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
            int i_1095_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578 - i_1085_);
            i_1091_ -= i_1095_;
            i_1085_ = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578;
            i_1088_ += i_1095_ * i_1090_;
            i_1094_ += i_1095_ * i_1089_;
        }
        if (i_1085_ + i_1091_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
            i_1091_ -= i_1085_ + i_1091_ - ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5582;
        if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
            int i_1096_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575 - i);
            i_1090_ -= i_1096_;
            i = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575;
            i_1088_ += i_1096_;
            i_1094_ += i_1096_;
            i_1093_ += i_1096_;
            i_1092_ += i_1096_;
        }
        if (i + i_1090_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
            int i_1097_ = (i + i_1090_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
            i_1090_ -= i_1097_;
            i_1093_ += i_1097_;
            i_1092_ += i_1097_;
        }
        if (i_1090_ > 0 && i_1091_ > 0) {
            aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
            int[] is = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
            int[] is_1098_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
            int[] is_1099_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            int i_1100_ = i_1085_;
            if (i_1087_ > i_1100_) {
                i_1100_ = i_1087_;
                i_1094_ += (i_1087_ - i_1085_) * i_1089_;
                i_1088_ += (i_1087_ - i_1085_) * ((Class129_Sub3) this).anInt8548;
            }
            int i_1101_ = (i_1087_ + is.length < i_1085_ + i_1091_ ? i_1087_ + is.length : i_1085_ + i_1091_);
            for (int i_1102_ = i_1100_; i_1102_ < i_1101_; i_1102_++) {
                int i_1103_ = is[i_1102_ - i_1087_] + i_1086_;
                int i_1104_ = is_1098_[i_1102_ - i_1087_];
                int i_1105_ = i_1090_;
                if (i > i_1103_) {
                    int i_1106_ = i - i_1103_;
                    if (i_1106_ >= i_1104_) {
                        i_1088_ += i_1090_ + i_1093_;
                        i_1094_ += i_1090_ + i_1092_;
                        continue;
                    }
                    i_1104_ -= i_1106_;
                } else {
                    int i_1107_ = i_1103_ - i;
                    if (i_1107_ >= i_1090_) {
                        i_1088_ += i_1090_ + i_1093_;
                        i_1094_ += i_1090_ + i_1092_;
                        continue;
                    }
                    i_1088_ += i_1107_;
                    i_1105_ -= i_1107_;
                    i_1094_ += i_1107_;
                }
                int i_1108_ = 0;
                if (i_1105_ < i_1104_)
                    i_1104_ = i_1105_;
                else
                    i_1108_ = i_1105_ - i_1104_;
                for (int i_1109_ = -i_1104_; i_1109_ < 0; i_1109_++) {
                    int i_1110_ = (((Class129_Sub3_Sub2) this).anIntArray9989[i_1088_++]);
                    int i_1111_ = i_1110_ >>> 24;
                    int i_1112_ = 256 - i_1111_;
                    int i_1113_ = is_1099_[i_1094_];
                    is_1099_[i_1094_++] = ((((i_1110_ & 0xff00ff) * i_1111_ + (i_1113_ & 0xff00ff) * i_1112_) & ~0xff00ff) + (((i_1110_ & 0xff00) * i_1111_ + (i_1113_ & 0xff00) * i_1112_) & 0xff0000)) >> 8;
                }
                i_1088_ += i_1108_ + i_1093_;
                i_1094_ += i_1108_ + i_1092_;
            }
        }
    }

    final void method1195(int i, int i_1114_, int i_1115_, int i_1116_, int i_1117_, int i_1118_, int i_1119_, int i_1120_, int i_1121_) {
        if (i_1116_ > 0 && i_1117_ > 0) {
            int i_1122_ = 0;
            int i_1123_ = 0;
            int i_1124_ = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
            int i_1125_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
            int i_1126_ = (i_1124_ << 16) / i_1116_;
            int i_1127_ = (i_1125_ << 16) / i_1117_;
            if (((Class129_Sub3) this).anInt8566 > 0) {
                int i_1128_ = (((((Class129_Sub3) this).anInt8566 << 16) + i_1126_ - 1) / i_1126_);
                i += i_1128_;
                i_1122_ += i_1128_ * i_1126_ - (((Class129_Sub3) this).anInt8566 << 16);
            }
            if (((Class129_Sub3) this).anInt8571 > 0) {
                int i_1129_ = (((((Class129_Sub3) this).anInt8571 << 16) + i_1127_ - 1) / i_1127_);
                i_1114_ += i_1129_;
                i_1123_ += i_1129_ * i_1127_ - (((Class129_Sub3) this).anInt8571 << 16);
            }
            if (((Class129_Sub3) this).anInt8548 < i_1124_)
                i_1116_ = ((((Class129_Sub3) this).anInt8548 << 16) - i_1122_ + i_1126_ - 1) / i_1126_;
            if (((Class129_Sub3) this).anInt8569 < i_1125_)
                i_1117_ = ((((Class129_Sub3) this).anInt8569 << 16) - i_1123_ + i_1127_ - 1) / i_1127_;
            int i_1130_ = i + i_1114_ * ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5567;
            int i_1131_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567 - i_1116_);
            if (i_1114_ + i_1117_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582)
                i_1117_ -= (i_1114_ + i_1117_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582));
            if (i_1114_ < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) {
                int i_1132_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578) - i_1114_;
                i_1117_ -= i_1132_;
                i_1130_ += i_1132_ * ((ha_Sub1) (((Class129_Sub3) this).aHa_Sub1_8556)).anInt5567;
                i_1123_ += i_1127_ * i_1132_;
            }
            if (i + i_1116_ > ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561) {
                int i_1133_ = (i + i_1116_ - (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561));
                i_1116_ -= i_1133_;
                i_1131_ += i_1133_;
            }
            if (i < ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) {
                int i_1134_ = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575) - i;
                i_1116_ -= i_1134_;
                i_1130_ += i_1134_;
                i_1122_ += i_1126_ * i_1134_;
                i_1131_ += i_1134_;
            }
            float[] fs = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).aFloatArray5556);
            int[] is = (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565);
            if (i_1120_ == 0) {
                if (i_1118_ == 1) {
                    int i_1135_ = i_1122_;
                    for (int i_1136_ = -i_1117_; i_1136_ < 0; i_1136_++) {
                        int i_1137_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1138_ = -i_1116_; i_1138_ < 0; i_1138_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                is[i_1130_] = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1137_]);
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1135_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 0) {
                    int i_1139_ = (i_1119_ & 0xff0000) >> 16;
                    int i_1140_ = (i_1119_ & 0xff00) >> 8;
                    int i_1141_ = i_1119_ & 0xff;
                    int i_1142_ = i_1122_;
                    for (int i_1143_ = -i_1117_; i_1143_ < 0; i_1143_++) {
                        int i_1144_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1145_ = -i_1116_; i_1145_ < 0; i_1145_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1146_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1144_]);
                                int i_1147_ = ((i_1146_ & 0xff0000) * i_1139_ & ~0xffffff);
                                int i_1148_ = (i_1146_ & 0xff00) * i_1140_ & 0xff0000;
                                int i_1149_ = (i_1146_ & 0xff) * i_1141_ & 0xff00;
                                is[i_1130_] = (i_1147_ | i_1148_ | i_1149_) >>> 8;
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1142_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 3) {
                    int i_1150_ = i_1122_;
                    for (int i_1151_ = -i_1117_; i_1151_ < 0; i_1151_++) {
                        int i_1152_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1153_ = -i_1116_; i_1153_ < 0; i_1153_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1154_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1152_]);
                                int i_1155_ = i_1154_ + i_1119_;
                                int i_1156_ = ((i_1154_ & 0xff00ff) + (i_1119_ & 0xff00ff));
                                int i_1157_ = ((i_1156_ & 0x1000100) + (i_1155_ - i_1156_ & 0x10000));
                                is[i_1130_] = i_1155_ - i_1157_ | i_1157_ - (i_1157_ >>> 8);
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1150_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 2) {
                    int i_1158_ = i_1119_ >>> 24;
                    int i_1159_ = 256 - i_1158_;
                    int i_1160_ = (i_1119_ & 0xff00ff) * i_1159_ & ~0xff00ff;
                    int i_1161_ = (i_1119_ & 0xff00) * i_1159_ & 0xff0000;
                    i_1119_ = (i_1160_ | i_1161_) >>> 8;
                    int i_1162_ = i_1122_;
                    for (int i_1163_ = -i_1117_; i_1163_ < 0; i_1163_++) {
                        int i_1164_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1165_ = -i_1116_; i_1165_ < 0; i_1165_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1166_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1164_]);
                                i_1160_ = ((i_1166_ & 0xff00ff) * i_1158_ & ~0xff00ff);
                                i_1161_ = (i_1166_ & 0xff00) * i_1158_ & 0xff0000;
                                is[i_1130_] = ((i_1160_ | i_1161_) >>> 8) + i_1119_;
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1162_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_1120_ == 1) {
                if (i_1118_ == 1) {
                    int i_1167_ = i_1122_;
                    for (int i_1168_ = -i_1117_; i_1168_ < 0; i_1168_++) {
                        int i_1169_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1170_ = -i_1116_; i_1170_ < 0; i_1170_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1171_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1169_]);
                                int i_1172_ = i_1171_ >>> 24;
                                int i_1173_ = 256 - i_1172_;
                                int i_1174_ = is[i_1130_];
                                is[i_1130_] = (((((i_1171_ & 0xff00ff) * i_1172_ + (i_1174_ & 0xff00ff) * i_1173_) & ~0xff00ff) >> 8) + (((((i_1171_ & ~0xff00ff) >>> 8) * i_1172_) + (((i_1174_ & ~0xff00ff) >>> 8) * i_1173_)) & ~0xff00ff));
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1167_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 0) {
                    int i_1175_ = i_1122_;
                    if ((i_1119_ & 0xffffff) == 16777215) {
                        for (int i_1176_ = -i_1117_; i_1176_ < 0; i_1176_++) {
                            int i_1177_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_1178_ = -i_1116_; i_1178_ < 0; i_1178_++) {
                                if ((float) i_1115_ < fs[i_1130_]) {
                                    int i_1179_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1177_]);
                                    int i_1180_ = ((i_1179_ >>> 24) * (i_1119_ >>> 24) >> 8);
                                    int i_1181_ = 256 - i_1180_;
                                    int i_1182_ = is[i_1130_];
                                    is[i_1130_] = ((((i_1179_ & 0xff00ff) * i_1180_ + (i_1182_ & 0xff00ff) * i_1181_) & ~0xff00ff) + (((i_1179_ & 0xff00) * i_1180_ + (i_1182_ & 0xff00) * i_1181_) & 0xff0000)) >> 8;
                                    fs[i_1130_] = (float) i_1115_;
                                }
                                i_1122_ += i_1126_;
                                i_1130_++;
                            }
                            i_1123_ += i_1127_;
                            i_1122_ = i_1175_;
                            i_1130_ += i_1131_;
                        }
                    } else {
                        int i_1183_ = (i_1119_ & 0xff0000) >> 16;
                        int i_1184_ = (i_1119_ & 0xff00) >> 8;
                        int i_1185_ = i_1119_ & 0xff;
                        for (int i_1186_ = -i_1117_; i_1186_ < 0; i_1186_++) {
                            int i_1187_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                            for (int i_1188_ = -i_1116_; i_1188_ < 0; i_1188_++) {
                                if ((float) i_1115_ < fs[i_1130_]) {
                                    int i_1189_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1187_]);
                                    int i_1190_ = ((i_1189_ >>> 24) * (i_1119_ >>> 24) >> 8);
                                    int i_1191_ = 256 - i_1190_;
                                    if (i_1190_ != 255) {
                                        int i_1192_ = ((i_1189_ & 0xff0000) * i_1183_ & ~0xffffff);
                                        int i_1193_ = ((i_1189_ & 0xff00) * i_1184_ & 0xff0000);
                                        int i_1194_ = ((i_1189_ & 0xff) * i_1185_ & 0xff00);
                                        i_1189_ = (i_1192_ | i_1193_ | i_1194_) >>> 8;
                                        int i_1195_ = is[i_1130_];
                                        is[i_1130_] = ((((i_1189_ & 0xff00ff) * i_1190_ + ((i_1195_ & 0xff00ff) * i_1191_)) & ~0xff00ff) + (((i_1189_ & 0xff00) * i_1190_ + ((i_1195_ & 0xff00) * i_1191_)) & 0xff0000)) >> 8;
                                        fs[i_1130_] = (float) i_1115_;
                                    } else {
                                        int i_1196_ = ((i_1189_ & 0xff0000) * i_1183_ & ~0xffffff);
                                        int i_1197_ = ((i_1189_ & 0xff00) * i_1184_ & 0xff0000);
                                        int i_1198_ = ((i_1189_ & 0xff) * i_1185_ & 0xff00);
                                        is[i_1130_] = (i_1196_ | i_1197_ | i_1198_) >>> 8;
                                        fs[i_1130_] = (float) i_1115_;
                                    }
                                }
                                i_1122_ += i_1126_;
                                i_1130_++;
                            }
                            i_1123_ += i_1127_;
                            i_1122_ = i_1175_;
                            i_1130_ += i_1131_;
                        }
                        return;
                    }
                    return;
                }
                if (i_1118_ == 3) {
                    int i_1199_ = i_1122_;
                    for (int i_1200_ = -i_1117_; i_1200_ < 0; i_1200_++) {
                        int i_1201_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1202_ = -i_1116_; i_1202_ < 0; i_1202_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1203_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1201_]);
                                int i_1204_ = i_1203_ + i_1119_;
                                int i_1205_ = ((i_1203_ & 0xff00ff) + (i_1119_ & 0xff00ff));
                                int i_1206_ = ((i_1205_ & 0x1000100) + (i_1204_ - i_1205_ & 0x10000));
                                i_1206_ = i_1204_ - i_1206_ | i_1206_ - (i_1206_ >>> 8);
                                int i_1207_ = (i_1206_ >>> 24) * (i_1119_ >>> 24) >> 8;
                                int i_1208_ = 256 - i_1207_;
                                if (i_1207_ != 255) {
                                    i_1203_ = i_1206_;
                                    i_1206_ = is[i_1130_];
                                    i_1206_ = ((((i_1203_ & 0xff00ff) * i_1207_ + (i_1206_ & 0xff00ff) * i_1208_) & ~0xff00ff) + (((i_1203_ & 0xff00) * i_1207_ + (i_1206_ & 0xff00) * i_1208_) & 0xff0000)) >> 8;
                                }
                                is[i_1130_] = i_1206_;
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1199_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 2) {
                    int i_1209_ = i_1119_ >>> 24;
                    int i_1210_ = 256 - i_1209_;
                    int i_1211_ = (i_1119_ & 0xff00ff) * i_1210_ & ~0xff00ff;
                    int i_1212_ = (i_1119_ & 0xff00) * i_1210_ & 0xff0000;
                    i_1119_ = (i_1211_ | i_1212_) >>> 8;
                    int i_1213_ = i_1122_;
                    for (int i_1214_ = -i_1117_; i_1214_ < 0; i_1214_++) {
                        int i_1215_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1216_ = -i_1116_; i_1216_ < 0; i_1216_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1217_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1215_]);
                                int i_1218_ = i_1217_ >>> 24;
                                int i_1219_ = 256 - i_1218_;
                                i_1211_ = ((i_1217_ & 0xff00ff) * i_1209_ & ~0xff00ff);
                                i_1212_ = (i_1217_ & 0xff00) * i_1209_ & 0xff0000;
                                i_1217_ = ((i_1211_ | i_1212_) >>> 8) + i_1119_;
                                int i_1220_ = is[i_1130_];
                                is[i_1130_] = ((((i_1217_ & 0xff00ff) * i_1218_ + (i_1220_ & 0xff00ff) * i_1219_) & ~0xff00ff) + (((i_1217_ & 0xff00) * i_1218_ + (i_1220_ & 0xff00) * i_1219_) & 0xff0000)) >> 8;
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1213_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_1120_ == 2) {
                if (i_1118_ == 1) {
                    int i_1221_ = i_1122_;
                    for (int i_1222_ = -i_1117_; i_1222_ < 0; i_1222_++) {
                        int i_1223_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1224_ = -i_1116_; i_1224_ < 0; i_1224_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1225_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1223_]);
                                if (i_1225_ != 0) {
                                    int i_1226_ = is[i_1130_];
                                    int i_1227_ = i_1225_ + i_1226_;
                                    int i_1228_ = ((i_1225_ & 0xff00ff) + (i_1226_ & 0xff00ff));
                                    i_1226_ = ((i_1228_ & 0x1000100) + (i_1227_ - i_1228_ & 0x10000));
                                    is[i_1130_] = (i_1227_ - i_1226_ | i_1226_ - (i_1226_ >>> 8));
                                    fs[i_1130_] = (float) i_1115_;
                                }
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1221_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 0) {
                    int i_1229_ = i_1122_;
                    int i_1230_ = (i_1119_ & 0xff0000) >> 16;
                    int i_1231_ = (i_1119_ & 0xff00) >> 8;
                    int i_1232_ = i_1119_ & 0xff;
                    for (int i_1233_ = -i_1117_; i_1233_ < 0; i_1233_++) {
                        int i_1234_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1235_ = -i_1116_; i_1235_ < 0; i_1235_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1236_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1234_]);
                                if (i_1236_ != 0) {
                                    int i_1237_ = ((i_1236_ & 0xff0000) * i_1230_ & ~0xffffff);
                                    int i_1238_ = ((i_1236_ & 0xff00) * i_1231_ & 0xff0000);
                                    int i_1239_ = (i_1236_ & 0xff) * i_1232_ & 0xff00;
                                    i_1236_ = (i_1237_ | i_1238_ | i_1239_) >>> 8;
                                    int i_1240_ = is[i_1130_];
                                    int i_1241_ = i_1236_ + i_1240_;
                                    int i_1242_ = ((i_1236_ & 0xff00ff) + (i_1240_ & 0xff00ff));
                                    i_1240_ = ((i_1242_ & 0x1000100) + (i_1241_ - i_1242_ & 0x10000));
                                    is[i_1130_] = (i_1241_ - i_1240_ | i_1240_ - (i_1240_ >>> 8));
                                    fs[i_1130_] = (float) i_1115_;
                                }
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1229_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 3) {
                    int i_1243_ = i_1122_;
                    for (int i_1244_ = -i_1117_; i_1244_ < 0; i_1244_++) {
                        int i_1245_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1246_ = -i_1116_; i_1246_ < 0; i_1246_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1247_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1245_]);
                                int i_1248_ = i_1247_ + i_1119_;
                                int i_1249_ = ((i_1247_ & 0xff00ff) + (i_1119_ & 0xff00ff));
                                int i_1250_ = ((i_1249_ & 0x1000100) + (i_1248_ - i_1249_ & 0x10000));
                                i_1247_ = i_1248_ - i_1250_ | i_1250_ - (i_1250_ >>> 8);
                                i_1250_ = is[i_1130_];
                                i_1248_ = i_1247_ + i_1250_;
                                i_1249_ = (i_1247_ & 0xff00ff) + (i_1250_ & 0xff00ff);
                                i_1250_ = ((i_1249_ & 0x1000100) + (i_1248_ - i_1249_ & 0x10000));
                                is[i_1130_] = i_1248_ - i_1250_ | i_1250_ - (i_1250_ >>> 8);
                                fs[i_1130_] = (float) i_1115_;
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1243_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                if (i_1118_ == 2) {
                    int i_1251_ = i_1119_ >>> 24;
                    int i_1252_ = 256 - i_1251_;
                    int i_1253_ = (i_1119_ & 0xff00ff) * i_1252_ & ~0xff00ff;
                    int i_1254_ = (i_1119_ & 0xff00) * i_1252_ & 0xff0000;
                    i_1119_ = (i_1253_ | i_1254_) >>> 8;
                    int i_1255_ = i_1122_;
                    for (int i_1256_ = -i_1117_; i_1256_ < 0; i_1256_++) {
                        int i_1257_ = ((i_1123_ >> 16) * ((Class129_Sub3) this).anInt8548);
                        for (int i_1258_ = -i_1116_; i_1258_ < 0; i_1258_++) {
                            if ((float) i_1115_ < fs[i_1130_]) {
                                int i_1259_ = (((Class129_Sub3_Sub2) this).anIntArray9989[(i_1122_ >> 16) + i_1257_]);
                                if (i_1259_ != 0) {
                                    i_1253_ = ((i_1259_ & 0xff00ff) * i_1251_ & ~0xff00ff);
                                    i_1254_ = ((i_1259_ & 0xff00) * i_1251_ & 0xff0000);
                                    i_1259_ = (((i_1253_ | i_1254_) >>> 8) + i_1119_);
                                    int i_1260_ = is[i_1130_];
                                    int i_1261_ = i_1259_ + i_1260_;
                                    int i_1262_ = ((i_1259_ & 0xff00ff) + (i_1260_ & 0xff00ff));
                                    i_1260_ = ((i_1262_ & 0x1000100) + (i_1261_ - i_1262_ & 0x10000));
                                    is[i_1130_] = (i_1261_ - i_1260_ | i_1260_ - (i_1260_ >>> 8));
                                    fs[i_1130_] = (float) i_1115_;
                                }
                            }
                            i_1122_ += i_1126_;
                            i_1130_++;
                        }
                        i_1123_ += i_1127_;
                        i_1122_ = i_1255_;
                        i_1130_ += i_1131_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method1184(int i, int i_1263_, int i_1264_, int i_1265_, int i_1266_, int i_1267_) {
        int[] is = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anIntArray5565;
        for (int i_1268_ = 0; i_1268_ < i_1265_; i_1268_++) {
            int i_1269_ = (i_1263_ + i_1268_) * i_1264_ + i;
            int i_1270_ = (i_1267_ + i_1268_) * i_1264_ + i_1266_;
            for (int i_1271_ = 0; i_1271_ < i_1264_; i_1271_++)
                ((Class129_Sub3_Sub2) this).anIntArray9989[i_1269_ + i_1271_] = is[i_1270_ + i_1271_] & 0xffffff;
        }
    }
}
