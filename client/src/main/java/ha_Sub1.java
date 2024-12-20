/* ha_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class ha_Sub1 extends ha {
    private int anInt5538;
    private Canvas aCanvas5539;
    private boolean aBoolean5540 = false;
    private int anInt5541;
    private int anInt5542;
    private boolean aBoolean5543 = false;
    Node_Sub40 aClass248_Sub40_5544;
    private Class65 aClass65_5545 = new Class65(4);
    int anInt5546 = 45823;
    int anInt5547 = 3500;
    private Class278 aClass278_5548;
    private int anInt5549;
    int anInt5550;
    private boolean aBoolean5551;
    private Class278 aClass278_5552;
    private int anInt5553;
    private int anInt5554;
    int anInt5555;
    float[] aFloatArray5556;
    int anInt5557;
    int anInt5558;
    Class238_Sub1 aClass238_Sub1_5559;
    int anInt5560;
    int anInt5561 = 0;
    private Class189 aClass189_5562;
    private int anInt5563;
    private int anInt5564 = 0;
    int[] anIntArray5565;
    int anInt5566;
    int anInt5567;
    int anInt5568;
    int anInt5569;
    int anInt5570;
    private Class203[] aClass203Array5571;
    private int anInt5572;
    int anInt5573;
    int anInt5574;
    int anInt5575;
    private int anInt5576;
    int anInt5577;
    int anInt5578;
    int anInt5579;
    int anInt5580;
    int anInt5581;
    int anInt5582;
    int anInt5583;
    float[] aFloatArray5584;
    private int anInt5585;
    private Class129 aClass129_5586;

    final void a(boolean bool) {
        /* empty */
    }

    final boolean method823(int i) {
        if (aBoolean5551 || (((Class312) ((ha) this).aD1414.method25(i, (byte) 126)).aBoolean3636))
            return true;
        return false;
    }

    final void a(Interface14 interface14) {
        Class189 class189 = (Class189) interface14;
        ((ha_Sub1) this).anInt5567 = ((Class189) class189).anInt5070;
        anInt5572 = ((Class189) class189).anInt5065;
        ((ha_Sub1) this).anIntArray5565 = ((Class189) class189).anIntArray5067;
        aClass189_5562 = class189;
        anInt5554 = ((Class189) class189).anInt5070;
        anInt5563 = ((Class189) class189).anInt5065;
        ((ha_Sub1) this).aFloatArray5556 = ((Class189) class189).aFloatArray5062;
        method833();
    }

    final int[] na(int i, int i_0_, int i_1_, int i_2_) {
        int[] is = new int[i_1_ * i_2_];
        int i_3_ = 0;
        for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
            int i_5_ = (i_0_ + i_4_) * ((ha_Sub1) this).anInt5567 + i;
            for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
                is[i_3_++] = ((ha_Sub1) this).anIntArray5565[i_5_ + i_6_];
        }
        return is;
    }

    final int I() {
        int i = anInt5564;
        anInt5564 = 0;
        return i;
    }

    final void a(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, aa var_aa, int i_12_, int i_13_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_14_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_15_ = (((ha_Sub1) this).anInt5578 > i_13_ ? ((ha_Sub1) this).anInt5578 : i_13_);
        int i_16_ = (((ha_Sub1) this).anInt5582 < i_13_ + is.length ? ((ha_Sub1) this).anInt5582 : i_13_ + is.length);
        i_8_ -= i;
        i_9_ -= i_7_;
        if (i_8_ + i_9_ < 0) {
            i += i_8_;
            i_8_ = -i_8_;
            i_7_ += i_9_;
            i_9_ = -i_9_;
        }
        if (i_8_ > i_9_) {
            i_7_ <<= 16;
            i_7_ += 32768;
            i_9_ <<= 16;
            int i_17_ = (int) Math.floor((double) i_9_ / (double) i_8_ + 0.5);
            i_8_ += i;
            if (i < ((ha_Sub1) this).anInt5575) {
                i_7_ += i_17_ * (((ha_Sub1) this).anInt5575 - i);
                i = ((ha_Sub1) this).anInt5575;
            }
            if (i_8_ >= ((ha_Sub1) this).anInt5561)
                i_8_ = ((ha_Sub1) this).anInt5561 - 1;
            int i_18_ = i_10_ >>> 24;
            if (i_11_ == 0 || i_11_ == 1 && i_18_ == 255) {
                for (/**/; i <= i_8_; i++) {
                    int i_19_ = i_7_ >> 16;
                    int i_20_ = i_19_ - i_13_;
                    if (i_19_ >= i_15_ && i_19_ < i_16_) {
                        int i_21_ = i_12_ + is[i_20_];
                        if (i >= i_21_ && i < i_21_ + is_14_[i_20_])
                            ((ha_Sub1) this).anIntArray5565[i + i_19_ * ((ha_Sub1) this).anInt5567] = i_10_;
                    }
                    i_7_ += i_17_;
                }
                return;
            }
            if (i_11_ == 1) {
                i_10_ = (((i_10_ & 0xff00ff) * i_18_ >> 8 & 0xff00ff) + ((i_10_ & 0xff00) * i_18_ >> 8 & 0xff00) + (i_18_ << 24));
                int i_22_ = 256 - i_18_;
                for (/**/; i <= i_8_; i++) {
                    int i_23_ = i_7_ >> 16;
                    int i_24_ = i_23_ - i_13_;
                    if (i_23_ >= i_15_ && i_23_ < i_16_) {
                        int i_25_ = i_12_ + is[i_24_];
                        if (i >= i_25_ && i < i_25_ + is_14_[i_24_]) {
                            int i_26_ = i + i_23_ * ((ha_Sub1) this).anInt5567;
                            int i_27_ = ((ha_Sub1) this).anIntArray5565[i_26_];
                            i_27_ = (((i_27_ & 0xff00ff) * i_22_ >> 8 & 0xff00ff) + ((i_27_ & 0xff00) * i_22_ >> 8 & 0xff00));
                            ((ha_Sub1) this).anIntArray5565[i_26_] = i_10_ + i_27_;
                        }
                    }
                    i_7_ += i_17_;
                }
                return;
            }
            if (i_11_ == 2) {
                for (/**/; i <= i_8_; i++) {
                    int i_28_ = i_7_ >> 16;
                    int i_29_ = i_28_ - i_13_;
                    if (i_28_ >= i_15_ && i_28_ < i_16_) {
                        int i_30_ = i_12_ + is[i_29_];
                        if (i >= i_30_ && i < i_30_ + is_14_[i_29_]) {
                            int i_31_ = i + i_28_ * ((ha_Sub1) this).anInt5567;
                            int i_32_ = ((ha_Sub1) this).anIntArray5565[i_31_];
                            int i_33_ = i_10_ + i_32_;
                            int i_34_ = (i_10_ & 0xff00ff) + (i_32_ & 0xff00ff);
                            i_32_ = (i_34_ & 0x1000100) + (i_33_ - i_34_ & 0x10000);
                            ((ha_Sub1) this).anIntArray5565[i_31_] = i_33_ - i_32_ | i_32_ - (i_32_ >>> 8);
                        }
                    }
                    i_7_ += i_17_;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        i <<= 16;
        i += 32768;
        i_8_ <<= 16;
        int i_35_ = (int) Math.floor((double) i_8_ / (double) i_9_ + 0.5);
        i_9_ += i_7_;
        if (i_7_ < i_15_) {
            i += i_35_ * (i_15_ - i_7_);
            i_7_ = i_15_;
        }
        if (i_9_ >= i_16_)
            i_9_ = i_16_ - 1;
        int i_36_ = i_10_ >>> 24;
        if (i_11_ == 0 || i_11_ == 1 && i_36_ == 255) {
            for (/**/; i_7_ <= i_9_; i_7_++) {
                int i_37_ = i >> 16;
                int i_38_ = i_7_ - i_13_;
                int i_39_ = i_12_ + is[i_38_];
                if (i_37_ >= ((ha_Sub1) this).anInt5575 && i_37_ < ((ha_Sub1) this).anInt5561 && i_37_ >= i_39_ && i_37_ < i_39_ + is_14_[i_38_])
                    ((ha_Sub1) this).anIntArray5565[i_37_ + i_7_ * ((ha_Sub1) this).anInt5567] = i_10_;
                i += i_35_;
            }
        } else if (i_11_ == 1) {
            i_10_ = (((i_10_ & 0xff00ff) * i_36_ >> 8 & 0xff00ff) + ((i_10_ & 0xff00) * i_36_ >> 8 & 0xff00) + (i_36_ << 24));
            int i_40_ = 256 - i_36_;
            for (/**/; i_7_ <= i_9_; i_7_++) {
                int i_41_ = i >> 16;
                int i_42_ = i_7_ - i_13_;
                int i_43_ = i_12_ + is[i_42_];
                if (i_41_ >= ((ha_Sub1) this).anInt5575 && i_41_ < ((ha_Sub1) this).anInt5561 && i_41_ >= i_43_ && i_41_ < i_43_ + is_14_[i_42_]) {
                    int i_44_ = i_41_ + i_7_ * ((ha_Sub1) this).anInt5567;
                    int i_45_ = ((ha_Sub1) this).anIntArray5565[i_44_];
                    i_45_ = (((i_45_ & 0xff00ff) * i_40_ >> 8 & 0xff00ff) + ((i_45_ & 0xff00) * i_40_ >> 8 & 0xff00));
                    ((ha_Sub1) this).anIntArray5565[i_41_ + i_7_ * ((ha_Sub1) this).anInt5567] = i_10_ + i_45_;
                }
                i += i_35_;
            }
        } else if (i_11_ == 2) {
            for (/**/; i_7_ <= i_9_; i_7_++) {
                int i_46_ = i >> 16;
                int i_47_ = i_7_ - i_13_;
                int i_48_ = i_12_ + is[i_47_];
                if (i_46_ >= ((ha_Sub1) this).anInt5575 && i_46_ < ((ha_Sub1) this).anInt5561 && i_46_ >= i_48_ && i_46_ < i_48_ + is_14_[i_47_]) {
                    int i_49_ = i_46_ + i_7_ * ((ha_Sub1) this).anInt5567;
                    int i_50_ = ((ha_Sub1) this).anIntArray5565[i_49_];
                    int i_51_ = i_10_ + i_50_;
                    int i_52_ = (i_10_ & 0xff00ff) + (i_50_ & 0xff00ff);
                    i_50_ = (i_52_ & 0x1000100) + (i_51_ - i_52_ & 0x10000);
                    ((ha_Sub1) this).anIntArray5565[i_49_] = i_51_ - i_50_ | i_50_ - (i_50_ >>> 8);
                }
                i += i_35_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final void a(Canvas canvas, int i, int i_53_) {
        Node_Sub40 class248_sub40 = ((Node_Sub40) aClass65_5545.method501((long) canvas.hashCode(), (byte) 31));
        if (class248_sub40 == null) {
            class248_sub40 = Class231.method1839(7, i_53_, i, canvas);
            aClass65_5545.method509(-1, class248_sub40, (long) canvas.hashCode());
        } else if (((Node_Sub40) class248_sub40).anInt7281 != i || ((Node_Sub40) class248_sub40).anInt7284 != i_53_)
            b(canvas, i, i_53_);
    }

    private final void method824(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
        if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561) {
            int i_61_ = i + i_54_ * ((ha_Sub1) this).anInt5567;
            int i_62_ = i_56_ >>> 24;
            int i_63_ = i_58_ + i_59_;
            int i_64_ = i_60_ % i_63_;
            if (i_57_ == 0 || i_57_ == 1 && i_62_ == 255) {
                int i_65_ = 0;
                while (i_65_ < i_55_) {
                    if (i_54_ + i_65_ >= ((ha_Sub1) this).anInt5578 && i_54_ + i_65_ < ((ha_Sub1) this).anInt5582 && i_64_ < i_58_)
                        ((ha_Sub1) this).anIntArray5565[i_61_ + i_65_ * ((ha_Sub1) this).anInt5567] = i_56_;
                    i_65_++;
                    i_64_ = ++i_64_ % i_63_;
                }
            } else if (i_57_ == 1) {
                i_56_ = (((i_56_ & 0xff00ff) * i_62_ >> 8 & 0xff00ff) + ((i_56_ & 0xff00) * i_62_ >> 8 & 0xff00) + (i_62_ << 24));
                int i_66_ = 256 - i_62_;
                int i_67_ = 0;
                while (i_67_ < i_55_) {
                    if (i_54_ + i_67_ >= ((ha_Sub1) this).anInt5578 && i_54_ + i_67_ < ((ha_Sub1) this).anInt5582 && i_64_ < i_58_) {
                        int i_68_ = i_61_ + i_67_ * ((ha_Sub1) this).anInt5567;
                        int i_69_ = ((ha_Sub1) this).anIntArray5565[i_68_];
                        i_69_ = (((i_69_ & 0xff00ff) * i_66_ >> 8 & 0xff00ff) + ((i_69_ & 0xff00) * i_66_ >> 8 & 0xff00));
                        ((ha_Sub1) this).anIntArray5565[i_68_] = i_56_ + i_69_;
                    }
                    i_67_++;
                    i_64_ = ++i_64_ % i_63_;
                }
            } else if (i_57_ == 2) {
                int i_70_ = 0;
                while (i_70_ < i_55_) {
                    if (i_54_ + i_70_ >= ((ha_Sub1) this).anInt5578 && i_54_ + i_70_ < ((ha_Sub1) this).anInt5582 && i_64_ < i_58_) {
                        int i_71_ = i_61_ + i_70_ * ((ha_Sub1) this).anInt5567;
                        int i_72_ = ((ha_Sub1) this).anIntArray5565[i_71_];
                        int i_73_ = i_56_ + i_72_;
                        int i_74_ = (i_56_ & 0xff00ff) + (i_72_ & 0xff00ff);
                        i_72_ = (i_74_ & 0x1000100) + (i_73_ - i_74_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_71_] = i_73_ - i_72_ | i_72_ - (i_72_ >>> 8);
                    }
                    i_70_++;
                    i_64_ = ++i_64_ % i_63_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final Interface13 d(int i, int i_75_) {
        return a(i, i_75_, false);
    }

    final int r() {
        return 0;
    }

    final boolean b() {
        return false;
    }

    final void b(int i, int i_76_, int i_77_, int i_78_, double d) {
        int i_79_ = anInt5554 - i_77_;
        int i_80_ = i_76_ * anInt5554 + i;
        float[] fs = ((ha_Sub1) this).aFloatArray5556;
        int i_81_ = 0;
        while (i_81_ < i_78_) {
            int i_82_ = 0;
            while (i_82_ < i_77_) {
                float f = fs[i_80_];
                if (f != 2.14748365E9F)
                    fs[i_80_] = (float) ((double) f + d);
                i_82_++;
                i_80_++;
            }
            i_81_++;
            i_80_ += i_79_;
        }
    }

    ha_Sub1(Canvas canvas, d var_d, int i, int i_83_) {
        this(var_d);
        try {
            a(canvas, i, i_83_);
            a(canvas);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method819(57);
            throw new RuntimeException("");
        }
    }

    final void aa(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
        if (i < ((ha_Sub1) this).anInt5575) {
            i_85_ -= ((ha_Sub1) this).anInt5575 - i;
            i = ((ha_Sub1) this).anInt5575;
        }
        if (i_84_ < ((ha_Sub1) this).anInt5578) {
            i_86_ -= ((ha_Sub1) this).anInt5578 - i_84_;
            i_84_ = ((ha_Sub1) this).anInt5578;
        }
        if (i + i_85_ > ((ha_Sub1) this).anInt5561)
            i_85_ = ((ha_Sub1) this).anInt5561 - i;
        if (i_84_ + i_86_ > ((ha_Sub1) this).anInt5582)
            i_86_ = ((ha_Sub1) this).anInt5582 - i_84_;
        if (i_85_ > 0 && i_86_ > 0 && i <= ((ha_Sub1) this).anInt5561 && i_84_ <= ((ha_Sub1) this).anInt5582) {
            int i_89_ = ((ha_Sub1) this).anInt5567 - i_85_;
            int i_90_ = i + i_84_ * ((ha_Sub1) this).anInt5567;
            int i_91_ = i_87_ >>> 24;
            if (i_88_ == 0 || i_88_ == 1 && i_91_ == 255) {
                int i_92_ = i_85_ >> 3;
                int i_93_ = i_85_ & 0x7;
                i_85_ = i_90_ - 1;
                for (int i_94_ = -i_86_; i_94_ < 0; i_94_++) {
                    if (i_92_ > 0) {
                        i = i_92_;
                        do {
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_;
                        } while (--i > 0);
                    }
                    if (i_93_ > 0) {
                        i = i_93_;
                        do
                            ((ha_Sub1) this).anIntArray5565[++i_85_] = i_87_; while (--i > 0);
                    }
                    i_85_ += i_89_;
                }
            } else if (i_88_ == 1) {
                i_87_ = (((i_87_ & 0xff00ff) * i_91_ >> 8 & 0xff00ff) + (((i_87_ & ~0xff00ff) >>> 8) * i_91_ & ~0xff00ff));
                int i_95_ = 256 - i_91_;
                for (int i_96_ = 0; i_96_ < i_86_; i_96_++) {
                    for (int i_97_ = -i_85_; i_97_ < 0; i_97_++) {
                        int i_98_ = ((ha_Sub1) this).anIntArray5565[i_90_];
                        i_98_ = (((i_98_ & 0xff00ff) * i_95_ >> 8 & 0xff00ff) + (((i_98_ & ~0xff00ff) >>> 8) * i_95_ & ~0xff00ff));
                        ((ha_Sub1) this).anIntArray5565[i_90_++] = i_87_ + i_98_;
                    }
                    i_90_ += i_89_;
                }
            } else if (i_88_ == 2) {
                for (int i_99_ = 0; i_99_ < i_86_; i_99_++) {
                    for (int i_100_ = -i_85_; i_100_ < 0; i_100_++) {
                        int i_101_ = ((ha_Sub1) this).anIntArray5565[i_90_];
                        int i_102_ = i_87_ + i_101_;
                        int i_103_ = (i_87_ & 0xff00ff) + (i_101_ & 0xff00ff);
                        i_101_ = (i_103_ & 0x1000100) + (i_102_ - i_103_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_90_++] = i_102_ - i_101_ | i_101_ - (i_101_ >>> 8);
                    }
                    i_90_ += i_89_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void xa(float f) {
        ((ha_Sub1) this).anInt5583 = (int) (f * 65535.0F);
    }

    final int E() {
        return 0;
    }

    final void w() {
        /* empty */
    }

    final Class129 a(Class157 class157, boolean bool) {
        int[] is = ((Class157) class157).anIntArray1872;
        byte[] is_104_ = ((Class157) class157).aByteArray1868;
        int i = ((Class157) class157).anInt1873;
        int i_105_ = ((Class157) class157).anInt1874;
        Class129_Sub3 class129_sub3;
        if (bool && ((Class157) class157).aByteArray1875 == null) {
            int[] is_106_ = new int[is.length];
            byte[] is_107_ = new byte[i * i_105_];
            for (int i_108_ = 0; i_108_ < i_105_; i_108_++) {
                int i_109_ = i_108_ * i;
                for (int i_110_ = 0; i_110_ < i; i_110_++)
                    is_107_[i_109_ + i_110_] = is_104_[i_109_ + i_110_];
            }
            for (int i_111_ = 0; i_111_ < is.length; i_111_++)
                is_106_[i_111_] = is[i_111_];
            class129_sub3 = new Class129_Sub3_Sub3(this, is_107_, is_106_, i, i_105_);
        } else {
            int[] is_112_ = new int[i * i_105_];
            byte[] is_113_ = ((Class157) class157).aByteArray1875;
            if (is_113_ != null) {
                for (int i_114_ = 0; i_114_ < i_105_; i_114_++) {
                    int i_115_ = i_114_ * i;
                    for (int i_116_ = 0; i_116_ < i; i_116_++)
                        is_112_[i_115_ + i_116_] = (is[is_104_[i_115_ + i_116_] & 0xff] | is_113_[i_115_ + i_116_] << 24);
                }
                class129_sub3 = new Class129_Sub3_Sub2(this, is_112_, i, i_105_);
            } else {
                for (int i_117_ = 0; i_117_ < i_105_; i_117_++) {
                    int i_118_ = i_117_ * i;
                    for (int i_119_ = 0; i_119_ < i; i_119_++) {
                        int i_120_ = is[is_104_[i_118_ + i_119_] & 0xff];
                        is_112_[i_118_ + i_119_] = i_120_ != 0 ? ~0xffffff | i_120_ : 0;
                    }
                }
                class129_sub3 = new Class129_Sub3_Sub1(this, is_112_, i, i_105_);
            }
        }
        class129_sub3.method1165(((Class157) class157).anInt1869, ((Class157) class157).anInt1876, ((Class157) class157).anInt1871, ((Class157) class157).anInt1870);
        return class129_sub3;
    }

    final boolean method825() {
        return aBoolean5543;
    }

    final Viewport e() {
        return new Class238_Sub1();
    }

    final int b(int i, int i_121_) {
        i |= 0x20800;
        return i & i_121_ ^ i_121_;
    }

    final void u() {
        /* empty */
    }

    final void b(Canvas canvas) {
        if (aCanvas5539 == canvas)
            a((Canvas) null);
        Node_Sub40 class248_sub40 = ((Node_Sub40) aClass65_5545.method501((long) canvas.hashCode(), (byte) 31));
        if (class248_sub40 != null)
            class248_sub40.remove(true);
    }

    final boolean l() {
        return false;
    }

    final void H(int i, int i_122_, int i_123_, int[] is) {
        float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_122_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_123_));
        if (f == 0.0F)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_124_ = (int) ((float) ((ha_Sub1) this).anInt5550 * (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686 + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680) * (float) i_122_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683) * (float) i_123_)) / f);
            int i_125_ = (int) ((float) ((ha_Sub1) this).anInt5574 * (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677 + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698) * (float) i_122_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697) * (float) i_123_)) / f);
            is[0] = i_124_ - ((ha_Sub1) this).anInt5557;
            is[1] = i_125_ - ((ha_Sub1) this).anInt5570;
            is[2] = (int) f;
        }
    }

    final void P(int i, int i_126_, int i_127_, int i_128_, int i_129_) {
        if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561) {
            if (i_126_ < ((ha_Sub1) this).anInt5578) {
                i_127_ -= ((ha_Sub1) this).anInt5578 - i_126_;
                i_126_ = ((ha_Sub1) this).anInt5578;
            }
            if (i_126_ + i_127_ > ((ha_Sub1) this).anInt5582)
                i_127_ = ((ha_Sub1) this).anInt5582 - i_126_;
            int i_130_ = i + i_126_ * ((ha_Sub1) this).anInt5567;
            int i_131_ = i_128_ >>> 24;
            if (i_129_ == 0 || i_129_ == 1 && i_131_ == 255) {
                for (int i_132_ = 0; i_132_ < i_127_; i_132_++)
                    ((ha_Sub1) this).anIntArray5565[i_130_ + i_132_ * ((ha_Sub1) this).anInt5567] = i_128_;
            } else if (i_129_ == 1) {
                i_128_ = (((i_128_ & 0xff00ff) * i_131_ >> 8 & 0xff00ff) + ((i_128_ & 0xff00) * i_131_ >> 8 & 0xff00) + (i_131_ << 24));
                int i_133_ = 256 - i_131_;
                for (int i_134_ = 0; i_134_ < i_127_; i_134_++) {
                    int i_135_ = i_130_ + i_134_ * ((ha_Sub1) this).anInt5567;
                    int i_136_ = ((ha_Sub1) this).anIntArray5565[i_135_];
                    i_136_ = (((i_136_ & 0xff00ff) * i_133_ >> 8 & 0xff00ff) + ((i_136_ & 0xff00) * i_133_ >> 8 & 0xff00));
                    ((ha_Sub1) this).anIntArray5565[i_135_] = i_128_ + i_136_;
                }
            } else if (i_129_ == 2) {
                for (int i_137_ = 0; i_137_ < i_127_; i_137_++) {
                    int i_138_ = i_130_ + i_137_ * ((ha_Sub1) this).anInt5567;
                    int i_139_ = ((ha_Sub1) this).anIntArray5565[i_138_];
                    int i_140_ = i_128_ + i_139_;
                    int i_141_ = (i_128_ & 0xff00ff) + (i_139_ & 0xff00ff);
                    i_139_ = (i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000);
                    ((ha_Sub1) this).anIntArray5565[i_138_] = i_140_ - i_139_ | i_139_ - (i_139_ >>> 8);
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final Class129 a(int i, int i_142_, boolean bool) {
        if (bool)
            return new Class129_Sub3_Sub2(this, i, i_142_);
        return new Class129_Sub3_Sub1(this, i, i_142_);
    }

    final void Q(int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, byte[] is, int i_148_, int i_149_) {
        if (i_144_ > 0 && i_145_ > 0) {
            int i_150_ = 0;
            int i_151_ = 0;
            int i_152_ = (i_148_ << 16) / i_144_;
            int i_153_ = (is.length / i_148_ << 16) / i_145_;
            int i_154_ = i + i_143_ * ((ha_Sub1) this).anInt5567;
            int i_155_ = ((ha_Sub1) this).anInt5567 - i_144_;
            if (i_143_ + i_145_ > ((ha_Sub1) this).anInt5582)
                i_145_ -= i_143_ + i_145_ - ((ha_Sub1) this).anInt5582;
            if (i_143_ < ((ha_Sub1) this).anInt5578) {
                int i_156_ = ((ha_Sub1) this).anInt5578 - i_143_;
                i_145_ -= i_156_;
                i_154_ += i_156_ * ((ha_Sub1) this).anInt5567;
                i_151_ += i_153_ * i_156_;
            }
            if (i + i_144_ > ((ha_Sub1) this).anInt5561) {
                int i_157_ = i + i_144_ - ((ha_Sub1) this).anInt5561;
                i_144_ -= i_157_;
                i_155_ += i_157_;
            }
            if (i < ((ha_Sub1) this).anInt5575) {
                int i_158_ = ((ha_Sub1) this).anInt5575 - i;
                i_144_ -= i_158_;
                i_154_ += i_158_;
                i_150_ += i_152_ * i_158_;
                i_155_ += i_158_;
            }
            int i_159_ = i_146_ >>> 24;
            int i_160_ = i_147_ >>> 24;
            if (i_149_ == 0 || i_149_ == 1 && i_159_ == 255 && i_160_ == 255) {
                int i_161_ = i_150_;
                for (int i_162_ = -i_145_; i_162_ < 0; i_162_++) {
                    int i_163_ = (i_151_ >> 16) * i_148_;
                    for (int i_164_ = -i_144_; i_164_ < 0; i_164_++) {
                        if (is[(i_150_ >> 16) + i_163_] != 0)
                            ((ha_Sub1) this).anIntArray5565[i_154_++] = i_147_;
                        else
                            ((ha_Sub1) this).anIntArray5565[i_154_++] = i_146_;
                        i_150_ += i_152_;
                    }
                    i_151_ += i_153_;
                    i_150_ = i_161_;
                    i_154_ += i_155_;
                }
            } else if (i_149_ == 1) {
                int i_165_ = i_150_;
                for (int i_166_ = -i_145_; i_166_ < 0; i_166_++) {
                    int i_167_ = (i_151_ >> 16) * i_148_;
                    for (int i_168_ = -i_144_; i_168_ < 0; i_168_++) {
                        int i_169_ = i_146_;
                        if (is[(i_150_ >> 16) + i_167_] != 0)
                            i_169_ = i_147_;
                        int i_170_ = i_169_ >>> 24;
                        int i_171_ = 255 - i_170_;
                        int i_172_ = ((ha_Sub1) this).anIntArray5565[i_154_];
                        ((ha_Sub1) this).anIntArray5565[i_154_++] = ((((i_169_ & 0xff00ff) * i_170_ + (i_172_ & 0xff00ff) * i_171_) & ~0xff00ff) + (((i_169_ & 0xff00) * i_170_ + (i_172_ & 0xff00) * i_171_) & 0xff0000)) >> 8;
                        i_150_ += i_152_;
                    }
                    i_151_ += i_153_;
                    i_150_ = i_165_;
                    i_154_ += i_155_;
                }
            } else if (i_149_ == 2) {
                int i_173_ = i_150_;
                for (int i_174_ = -i_145_; i_174_ < 0; i_174_++) {
                    int i_175_ = (i_151_ >> 16) * i_148_;
                    for (int i_176_ = -i_144_; i_176_ < 0; i_176_++) {
                        int i_177_ = i_146_;
                        if (is[(i_150_ >> 16) + i_175_] != 0)
                            i_177_ = i_147_;
                        if (i_177_ != 0) {
                            int i_178_ = ((ha_Sub1) this).anIntArray5565[i_154_];
                            int i_179_ = i_177_ + i_178_;
                            int i_180_ = (i_177_ & 0xff00ff) + (i_178_ & 0xff00ff);
                            i_178_ = (i_180_ & 0x1000100) + (i_179_ - i_180_ & 0x10000);
                            ((ha_Sub1) this).anIntArray5565[i_154_++] = i_179_ - i_178_ | i_178_ - (i_178_ >>> 8);
                        } else
                            i_154_++;
                        i_150_ += i_152_;
                    }
                    i_151_ += i_153_;
                    i_150_ = i_173_;
                    i_154_ += i_155_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void a(Class316 class316) {
        /* empty */
    }

    final void DA(int i, int i_181_, int i_182_, int i_183_) {
        ((ha_Sub1) this).anInt5579 = i;
        ((ha_Sub1) this).anInt5560 = i_181_;
        ((ha_Sub1) this).anInt5550 = i_182_;
        ((ha_Sub1) this).anInt5574 = i_183_;
        method838();
    }

    private final void method826(int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_) {
        if (i_184_ >= ((ha_Sub1) this).anInt5578 && i_184_ < ((ha_Sub1) this).anInt5582) {
            int i_191_ = i + i_184_ * ((ha_Sub1) this).anInt5567;
            int i_192_ = i_186_ >>> 24;
            int i_193_ = i_188_ + i_189_;
            int i_194_ = i_190_ % i_193_;
            if (i_187_ == 0 || i_187_ == 1 && i_192_ == 255) {
                int i_195_ = 0;
                while (i_195_ < i_185_) {
                    if (i + i_195_ >= ((ha_Sub1) this).anInt5575 && i + i_195_ < ((ha_Sub1) this).anInt5561 && i_194_ < i_188_)
                        ((ha_Sub1) this).anIntArray5565[i_191_ + i_195_] = i_186_;
                    i_195_++;
                    i_194_ = ++i_194_ % i_193_;
                }
            } else if (i_187_ == 1) {
                i_186_ = (((i_186_ & 0xff00ff) * i_192_ >> 8 & 0xff00ff) + ((i_186_ & 0xff00) * i_192_ >> 8 & 0xff00) + (i_192_ << 24));
                int i_196_ = 256 - i_192_;
                int i_197_ = 0;
                while (i_197_ < i_185_) {
                    if (i + i_197_ >= ((ha_Sub1) this).anInt5575 && i + i_197_ < ((ha_Sub1) this).anInt5561 && i_194_ < i_188_) {
                        int i_198_ = ((ha_Sub1) this).anIntArray5565[i_191_ + i_197_];
                        i_198_ = (((i_198_ & 0xff00ff) * i_196_ >> 8 & 0xff00ff) + ((i_198_ & 0xff00) * i_196_ >> 8 & 0xff00));
                        ((ha_Sub1) this).anIntArray5565[i_191_ + i_197_] = i_186_ + i_198_;
                    }
                    i_197_++;
                    i_194_ = ++i_194_ % i_193_;
                }
            } else if (i_187_ == 2) {
                int i_199_ = 0;
                while (i_199_ < i_185_) {
                    if (i + i_199_ >= ((ha_Sub1) this).anInt5575 && i + i_199_ < ((ha_Sub1) this).anInt5561 && i_194_ < i_188_) {
                        int i_200_ = ((ha_Sub1) this).anIntArray5565[i_191_ + i_199_];
                        int i_201_ = i_186_ + i_200_;
                        int i_202_ = (i_186_ & 0xff00ff) + (i_200_ & 0xff00ff);
                        i_200_ = (i_202_ & 0x1000100) + (i_201_ - i_202_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_191_ + i_199_] = i_201_ - i_200_ | i_200_ - (i_200_ >>> 8);
                    }
                    i_199_++;
                    i_194_ = ++i_194_ % i_193_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void L(int i, int i_203_, int i_204_) {
        for (int i_205_ = 0; i_205_ < aClass203Array5571.length; i_205_++) {
            Class203 class203 = aClass203Array5571[i_205_];
            ((Class203) class203).anInt2303 = i & 0xffffff;
            int i_206_ = ((Class203) class203).anInt2303 >>> 16 & 0xff;
            if (i_206_ < 2)
                i_206_ = 2;
            int i_207_ = ((Class203) class203).anInt2303 >> 8 & 0xff;
            if (i_207_ < 2)
                i_207_ = 2;
            int i_208_ = ((Class203) class203).anInt2303 & 0xff;
            if (i_208_ < 2)
                i_208_ = 2;
            ((Class203) class203).anInt2303 = i_206_ << 16 | i_207_ << 8 | i_208_;
            if (i_203_ < 0)
                ((Class203) class203).aBoolean2315 = false;
            else
                ((Class203) class203).aBoolean2315 = true;
        }
    }

    final void F(int i, int i_209_) {
        int i_210_ = i_209_ * ((ha_Sub1) this).anInt5567 + i;
        int i_211_ = i_209_ * anInt5554 + i;
        if (i_210_ != 0 || i_211_ != 0) {
            int[] is = ((ha_Sub1) this).anIntArray5565;
            float[] fs = ((ha_Sub1) this).aFloatArray5556;
            if (i_210_ < 0) {
                int i_212_ = is.length + i_210_;
                Class159.method1398(is, -i_210_, is, 0, i_212_);
            } else if (i_210_ > 0) {
                int i_213_ = is.length - i_210_;
                Class159.method1398(is, 0, is, i_210_, i_213_);
            }
            if (i_211_ < 0) {
                int i_214_ = fs.length + i_211_;
                Class159.method1400(fs, -i_211_, fs, 0, i_214_);
            } else if (i_211_ > 0) {
                int i_215_ = fs.length - i_211_;
                Class159.method1400(fs, 0, fs, i_211_, i_215_);
            }
        }
    }

    final void h() {
        /* empty */
    }

    final void b(Canvas canvas, int i, int i_216_) {
        Node_Sub40 class248_sub40 = ((Node_Sub40) aClass65_5545.method501((long) canvas.hashCode(), (byte) 31));
        if (class248_sub40 != null) {
            class248_sub40.remove(true);
            class248_sub40 = Class231.method1839(7, i_216_, i, canvas);
            aClass65_5545.method509(-1, class248_sub40, (long) canvas.hashCode());
            if (aCanvas5539 == canvas && aClass189_5562 == null) {
                Dimension dimension = canvas.getSize();
                anInt5542 = dimension.width;
                anInt5538 = dimension.height;
                ((ha_Sub1) this).aClass248_Sub40_5544 = class248_sub40;
                ((ha_Sub1) this).anIntArray5565 = ((Node_Sub40) class248_sub40).anIntArray7283;
                ((ha_Sub1) this).anInt5567 = ((Node_Sub40) class248_sub40).anInt7281;
                anInt5572 = ((Node_Sub40) class248_sub40).anInt7284;
                if (((ha_Sub1) this).anInt5567 != anInt5554 || anInt5572 != anInt5563) {
                    anInt5576 = anInt5554 = ((ha_Sub1) this).anInt5567;
                    anInt5553 = anInt5563 = anInt5572;
                    ((ha_Sub1) this).aFloatArray5584 = ((ha_Sub1) this).aFloatArray5556 = new float[anInt5554 * anInt5563];
                }
                method833();
            }
        }
    }

    final boolean method827(int i) {
        return ((ha) this).aD1414.method23(i, -32345);
    }

    final Class129 a(int i, int i_217_, int i_218_, int i_219_, boolean bool) {
        int[] is = new int[i_218_ * i_219_];
        int i_220_ = i_217_ * ((ha_Sub1) this).anInt5567 + i;
        int i_221_ = ((ha_Sub1) this).anInt5567 - i_218_;
        for (int i_222_ = 0; i_222_ < i_219_; i_222_++) {
            int i_223_ = i_222_ * i_218_;
            for (int i_224_ = 0; i_224_ < i_218_; i_224_++)
                is[i_223_ + i_224_] = ((ha_Sub1) this).anIntArray5565[i_220_++];
            i_220_ += i_221_;
        }
        if (bool)
            return new Class129_Sub3_Sub2(this, is, i_218_, i_219_);
        return new Class129_Sub3_Sub1(this, is, i_218_, i_219_);
    }

    private final void method828(Class346_Sub5_Sub2 class346_sub5_sub2, int i, int i_225_, int i_226_, int i_227_) {
        int i_228_ = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9899;
        int i_229_ = i_227_;
        i_227_ <<= 1;
        if (i_228_ == -1)
            method829(i, i_225_, i_226_, i_229_, ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897, 1);
        else {
            if (anInt5585 != i_228_) {
                Class129 class129 = (Class129) aClass278_5548.method2863(4, (long) i_228_);
                if (class129 == null) {
                    int[] is = method834(i_228_);
                    if (is != null) {
                        int i_230_ = (method823(i_228_) ? 64 : ((ha_Sub1) this).anInt5577);
                        class129 = this.method813(i_230_, (byte) 99, i_230_, is, 0, i_230_);
                        aClass278_5548.method2867((byte) 0, (long) i_228_, class129);
                    } else
                        return;
                }
                anInt5585 = i_228_;
                aClass129_5586 = class129;
            }
            i_227_++;
            ((Class129_Sub3) aClass129_5586).method1195(i - i_229_, i_225_ - i_229_, i_226_, i_227_, i_227_, 0, ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897, 1, 1);
        }
    }

    final void f(int i, int i_231_) {
        Class203 class203 = method832(Thread.currentThread());
        ((ha_Sub1) this).anInt5568 = i;
        ((ha_Sub1) this).anInt5547 = i_231_;
        ((Class203) class203).anInt2312 = ((ha_Sub1) this).anInt5547 - 255;
    }

    private ha_Sub1(d var_d) {
        super(var_d);
        aBoolean5551 = false;
        ((ha_Sub1) this).anInt5550 = 512;
        ((ha_Sub1) this).anInt5574 = 512;
        anInt5549 = 0;
        ((ha_Sub1) this).anInt5568 = 50;
        ((ha_Sub1) this).anInt5575 = 0;
        ((ha_Sub1) this).anInt5577 = 128;
        ((ha_Sub1) this).anInt5578 = 0;
        ((ha_Sub1) this).anInt5581 = 78642;
        ((ha_Sub1) this).anInt5583 = 75518;
        ((ha_Sub1) this).anInt5582 = 0;
        aClass278_5548 = new Class278(16);
        anInt5585 = -1;
        try {
            aClass278_5552 = new Class278(256);
            ((ha_Sub1) this).aClass238_Sub1_5559 = new Class238_Sub1();
            c(1);
            h(0);
            Class48.method361(true, true, true);
            aBoolean5540 = true;
            anInt5541 = (int) Class118.method1112(116);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method819(121);
            throw new RuntimeException("");
        }
    }

    final void a(int i, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_) {
        i_233_ -= i;
        i_234_ -= i_232_;
        if (i_234_ == 0) {
            if (i_233_ >= 0)
                U(i, i_232_, i_233_ + 1, i_235_, i_236_);
            else
                U(i + i_233_, i_232_, -i_233_ + 1, i_235_, i_236_);
        } else if (i_233_ == 0) {
            if (i_234_ >= 0)
                P(i, i_232_, i_234_ + 1, i_235_, i_236_);
            else
                P(i, i_232_ + i_234_, -i_234_ + 1, i_235_, i_236_);
        } else {
            if (i_233_ + i_234_ < 0) {
                i += i_233_;
                i_233_ = -i_233_;
                i_232_ += i_234_;
                i_234_ = -i_234_;
            }
            if (i_233_ > i_234_) {
                i_232_ <<= 16;
                i_232_ += 32768;
                i_234_ <<= 16;
                int i_237_ = (int) Math.floor((double) i_234_ / (double) i_233_ + 0.5);
                i_233_ += i;
                if (i < ((ha_Sub1) this).anInt5575) {
                    i_232_ += i_237_ * (((ha_Sub1) this).anInt5575 - i);
                    i = ((ha_Sub1) this).anInt5575;
                }
                if (i_233_ >= ((ha_Sub1) this).anInt5561)
                    i_233_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_238_ = i_235_ >>> 24;
                if (i_236_ == 0 || i_236_ == 1 && i_238_ == 255) {
                    for (/**/; i <= i_233_; i++) {
                        int i_239_ = i_232_ >> 16;
                        if (i_239_ >= ((ha_Sub1) this).anInt5578 && i_239_ < ((ha_Sub1) this).anInt5582)
                            ((ha_Sub1) this).anIntArray5565[i + i_239_ * ((ha_Sub1) this).anInt5567] = i_235_;
                        i_232_ += i_237_;
                    }
                    return;
                }
                if (i_236_ == 1) {
                    i_235_ = (((i_235_ & 0xff00ff) * i_238_ >> 8 & 0xff00ff) + ((i_235_ & 0xff00) * i_238_ >> 8 & 0xff00) + (i_238_ << 24));
                    int i_240_ = 256 - i_238_;
                    for (/**/; i <= i_233_; i++) {
                        int i_241_ = i_232_ >> 16;
                        if (i_241_ >= ((ha_Sub1) this).anInt5578 && i_241_ < ((ha_Sub1) this).anInt5582) {
                            int i_242_ = i + i_241_ * ((ha_Sub1) this).anInt5567;
                            int i_243_ = ((ha_Sub1) this).anIntArray5565[i_242_];
                            i_243_ = (((i_243_ & 0xff00ff) * i_240_ >> 8 & 0xff00ff) + ((i_243_ & 0xff00) * i_240_ >> 8 & 0xff00));
                            ((ha_Sub1) this).anIntArray5565[i_242_] = i_235_ + i_243_;
                        }
                        i_232_ += i_237_;
                    }
                    return;
                }
                if (i_236_ == 2) {
                    for (/**/; i <= i_233_; i++) {
                        int i_244_ = i_232_ >> 16;
                        if (i_244_ >= ((ha_Sub1) this).anInt5578 && i_244_ < ((ha_Sub1) this).anInt5582) {
                            int i_245_ = i + i_244_ * ((ha_Sub1) this).anInt5567;
                            int i_246_ = ((ha_Sub1) this).anIntArray5565[i_245_];
                            int i_247_ = i_235_ + i_246_;
                            int i_248_ = (i_235_ & 0xff00ff) + (i_246_ & 0xff00ff);
                            i_246_ = (i_248_ & 0x1000100) + (i_247_ - i_248_ & 0x10000);
                            ((ha_Sub1) this).anIntArray5565[i_245_] = i_247_ - i_246_ | i_246_ - (i_246_ >>> 8);
                        }
                        i_232_ += i_237_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            i <<= 16;
            i += 32768;
            i_233_ <<= 16;
            int i_249_ = (int) Math.floor((double) i_233_ / (double) i_234_ + 0.5);
            i_234_ += i_232_;
            if (i_232_ < ((ha_Sub1) this).anInt5578) {
                i += i_249_ * (((ha_Sub1) this).anInt5578 - i_232_);
                i_232_ = ((ha_Sub1) this).anInt5578;
            }
            if (i_234_ >= ((ha_Sub1) this).anInt5582)
                i_234_ = ((ha_Sub1) this).anInt5582 - 1;
            int i_250_ = i_235_ >>> 24;
            if (i_236_ == 0 || i_236_ == 1 && i_250_ == 255) {
                for (/**/; i_232_ <= i_234_; i_232_++) {
                    int i_251_ = i >> 16;
                    if (i_251_ >= ((ha_Sub1) this).anInt5575 && i_251_ < ((ha_Sub1) this).anInt5561)
                        ((ha_Sub1) this).anIntArray5565[i_251_ + i_232_ * ((ha_Sub1) this).anInt5567] = i_235_;
                    i += i_249_;
                }
            } else if (i_236_ == 1) {
                i_235_ = (((i_235_ & 0xff00ff) * i_250_ >> 8 & 0xff00ff) + ((i_235_ & 0xff00) * i_250_ >> 8 & 0xff00) + (i_250_ << 24));
                int i_252_ = 256 - i_250_;
                for (/**/; i_232_ <= i_234_; i_232_++) {
                    int i_253_ = i >> 16;
                    if (i_253_ >= ((ha_Sub1) this).anInt5575 && i_253_ < ((ha_Sub1) this).anInt5561) {
                        int i_254_ = i_253_ + i_232_ * ((ha_Sub1) this).anInt5567;
                        int i_255_ = ((ha_Sub1) this).anIntArray5565[i_254_];
                        i_255_ = (((i_255_ & 0xff00ff) * i_252_ >> 8 & 0xff00ff) + ((i_255_ & 0xff00) * i_252_ >> 8 & 0xff00));
                        ((ha_Sub1) this).anIntArray5565[i_253_ + i_232_ * ((ha_Sub1) this).anInt5567] = i_235_ + i_255_;
                    }
                    i += i_249_;
                }
            } else if (i_236_ == 2) {
                for (/**/; i_232_ <= i_234_; i_232_++) {
                    int i_256_ = i >> 16;
                    if (i_256_ >= ((ha_Sub1) this).anInt5575 && i_256_ < ((ha_Sub1) this).anInt5561) {
                        int i_257_ = i_256_ + i_232_ * ((ha_Sub1) this).anInt5567;
                        int i_258_ = ((ha_Sub1) this).anIntArray5565[i_257_];
                        int i_259_ = i_235_ + i_258_;
                        int i_260_ = (i_235_ & 0xff00ff) + (i_258_ & 0xff00ff);
                        i_258_ = (i_260_ & 0x1000100) + (i_259_ - i_260_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_257_] = i_259_ - i_258_ | i_258_ - (i_258_ >>> 8);
                    }
                    i += i_249_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void X(int i) {
        /* empty */
    }

    final s a(int i, int i_261_, int[][] is, int[][] is_262_, int i_263_, int i_264_, int i_265_) {
        return new s_Sub1(this, i_264_, i_265_, i, i_261_, is, is_262_, i_263_);
    }

    final boolean n() {
        return true;
    }

    private final void method829(int i, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_) {
        if (i_268_ < 0)
            i_268_ = -i_268_;
        int i_271_ = i_266_ - i_268_;
        if (i_271_ < ((ha_Sub1) this).anInt5578)
            i_271_ = ((ha_Sub1) this).anInt5578;
        int i_272_ = i_266_ + i_268_ + 1;
        if (i_272_ > ((ha_Sub1) this).anInt5582)
            i_272_ = ((ha_Sub1) this).anInt5582;
        int i_273_ = i_271_;
        int i_274_ = i_268_ * i_268_;
        int i_275_ = 0;
        int i_276_ = i_266_ - i_273_;
        int i_277_ = i_276_ * i_276_;
        int i_278_ = i_277_ - i_276_;
        if (i_266_ > i_272_)
            i_266_ = i_272_;
        int i_279_ = i_269_ >>> 24;
        if (i_270_ == 0 || i_270_ == 1 && i_279_ == 255) {
            while (i_273_ < i_266_) {
                for (/**/; i_278_ <= i_274_ || i_277_ <= i_274_; i_278_ += i_275_++ + i_275_)
                    i_277_ += i_275_ + i_275_;
                int i_280_ = i - i_275_ + 1;
                if (i_280_ < ((ha_Sub1) this).anInt5575)
                    i_280_ = ((ha_Sub1) this).anInt5575;
                int i_281_ = i + i_275_;
                if (i_281_ > ((ha_Sub1) this).anInt5561)
                    i_281_ = ((ha_Sub1) this).anInt5561;
                int i_282_ = i_280_ + i_273_ * ((ha_Sub1) this).anInt5567;
                for (int i_283_ = i_280_; i_283_ < i_281_; i_283_++) {
                    if ((float) i_267_ < ((ha_Sub1) this).aFloatArray5556[i_282_])
                        ((ha_Sub1) this).anIntArray5565[i_282_] = i_269_;
                    i_282_++;
                }
                i_273_++;
                i_277_ -= i_276_-- + i_276_;
                i_278_ -= i_276_ + i_276_;
            }
            i_275_ = i_268_;
            i_276_ = i_273_ - i_266_;
            i_278_ = i_276_ * i_276_ + i_274_;
            i_277_ = i_278_ - i_275_;
            i_278_ -= i_276_;
            while (i_273_ < i_272_) {
                for (/**/; i_278_ > i_274_ && i_277_ > i_274_; i_277_ -= i_275_ + i_275_)
                    i_278_ -= i_275_-- + i_275_;
                int i_284_ = i - i_275_;
                if (i_284_ < ((ha_Sub1) this).anInt5575)
                    i_284_ = ((ha_Sub1) this).anInt5575;
                int i_285_ = i + i_275_;
                if (i_285_ > ((ha_Sub1) this).anInt5561 - 1)
                    i_285_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_286_ = i_284_ + i_273_ * ((ha_Sub1) this).anInt5567;
                for (int i_287_ = i_284_; i_287_ <= i_285_; i_287_++) {
                    if ((float) i_267_ < ((ha_Sub1) this).aFloatArray5556[i_286_])
                        ((ha_Sub1) this).anIntArray5565[i_286_] = i_269_;
                    i_286_++;
                }
                i_273_++;
                i_278_ += i_276_ + i_276_;
                i_277_ += i_276_++ + i_276_;
            }
        } else if (i_270_ == 1) {
            i_269_ = (((i_269_ & 0xff00ff) * i_279_ >> 8 & 0xff00ff) + ((i_269_ & 0xff00) * i_279_ >> 8 & 0xff00) + (i_279_ << 24));
            int i_288_ = 256 - i_279_;
            while (i_273_ < i_266_) {
                for (/**/; i_278_ <= i_274_ || i_277_ <= i_274_; i_278_ += i_275_++ + i_275_)
                    i_277_ += i_275_ + i_275_;
                int i_289_ = i - i_275_ + 1;
                if (i_289_ < ((ha_Sub1) this).anInt5575)
                    i_289_ = ((ha_Sub1) this).anInt5575;
                int i_290_ = i + i_275_;
                if (i_290_ > ((ha_Sub1) this).anInt5561)
                    i_290_ = ((ha_Sub1) this).anInt5561;
                int i_291_ = i_289_ + i_273_ * ((ha_Sub1) this).anInt5567;
                for (int i_292_ = i_289_; i_292_ < i_290_; i_292_++) {
                    if ((float) i_267_ < ((ha_Sub1) this).aFloatArray5556[i_291_]) {
                        int i_293_ = ((ha_Sub1) this).anIntArray5565[i_291_];
                        i_293_ = (((i_293_ & 0xff00ff) * i_288_ >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_288_ >> 8 & 0xff00));
                        ((ha_Sub1) this).anIntArray5565[i_291_] = i_269_ + i_293_;
                    }
                    i_291_++;
                }
                i_273_++;
                i_277_ -= i_276_-- + i_276_;
                i_278_ -= i_276_ + i_276_;
            }
            i_275_ = i_268_;
            i_276_ = -i_276_;
            i_278_ = i_276_ * i_276_ + i_274_;
            i_277_ = i_278_ - i_275_;
            i_278_ -= i_276_;
            while (i_273_ < i_272_) {
                for (/**/; i_278_ > i_274_ && i_277_ > i_274_; i_277_ -= i_275_ + i_275_)
                    i_278_ -= i_275_-- + i_275_;
                int i_294_ = i - i_275_;
                if (i_294_ < ((ha_Sub1) this).anInt5575)
                    i_294_ = ((ha_Sub1) this).anInt5575;
                int i_295_ = i + i_275_;
                if (i_295_ > ((ha_Sub1) this).anInt5561 - 1)
                    i_295_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_296_ = i_294_ + i_273_ * ((ha_Sub1) this).anInt5567;
                for (int i_297_ = i_294_; i_297_ <= i_295_; i_297_++) {
                    if ((float) i_267_ < ((ha_Sub1) this).aFloatArray5556[i_296_]) {
                        int i_298_ = ((ha_Sub1) this).anIntArray5565[i_296_];
                        i_298_ = (((i_298_ & 0xff00ff) * i_288_ >> 8 & 0xff00ff) + ((i_298_ & 0xff00) * i_288_ >> 8 & 0xff00));
                        ((ha_Sub1) this).anIntArray5565[i_296_] = i_269_ + i_298_;
                    }
                    i_296_++;
                }
                i_273_++;
                i_278_ += i_276_ + i_276_;
                i_277_ += i_276_++ + i_276_;
            }
        } else if (i_270_ == 2) {
            while (i_273_ < i_266_) {
                for (/**/; i_278_ <= i_274_ || i_277_ <= i_274_; i_278_ += i_275_++ + i_275_)
                    i_277_ += i_275_ + i_275_;
                int i_299_ = i - i_275_ + 1;
                if (i_299_ < ((ha_Sub1) this).anInt5575)
                    i_299_ = ((ha_Sub1) this).anInt5575;
                int i_300_ = i + i_275_;
                if (i_300_ > ((ha_Sub1) this).anInt5561)
                    i_300_ = ((ha_Sub1) this).anInt5561;
                int i_301_ = i_299_ + i_273_ * ((ha_Sub1) this).anInt5567;
                for (int i_302_ = i_299_; i_302_ < i_300_; i_302_++) {
                    if ((float) i_267_ < ((ha_Sub1) this).aFloatArray5556[i_301_]) {
                        int i_303_ = ((ha_Sub1) this).anIntArray5565[i_301_];
                        int i_304_ = i_269_ + i_303_;
                        int i_305_ = (i_269_ & 0xff00ff) + (i_303_ & 0xff00ff);
                        i_303_ = (i_305_ & 0x1000100) + (i_304_ - i_305_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_301_] = i_304_ - i_303_ | i_303_ - (i_303_ >>> 8);
                    }
                    i_301_++;
                }
                i_273_++;
                i_277_ -= i_276_-- + i_276_;
                i_278_ -= i_276_ + i_276_;
            }
            i_275_ = i_268_;
            i_276_ = -i_276_;
            i_278_ = i_276_ * i_276_ + i_274_;
            i_277_ = i_278_ - i_275_;
            i_278_ -= i_276_;
            while (i_273_ < i_272_) {
                for (/**/; i_278_ > i_274_ && i_277_ > i_274_; i_277_ -= i_275_ + i_275_)
                    i_278_ -= i_275_-- + i_275_;
                int i_306_ = i - i_275_;
                if (i_306_ < ((ha_Sub1) this).anInt5575)
                    i_306_ = ((ha_Sub1) this).anInt5575;
                int i_307_ = i + i_275_;
                if (i_307_ > ((ha_Sub1) this).anInt5561 - 1)
                    i_307_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_308_ = i_306_ + i_273_ * ((ha_Sub1) this).anInt5567;
                for (int i_309_ = i_306_; i_309_ <= i_307_; i_309_++) {
                    if ((float) i_267_ < ((ha_Sub1) this).aFloatArray5556[i_308_]) {
                        int i_310_ = ((ha_Sub1) this).anIntArray5565[i_308_];
                        int i_311_ = i_269_ + i_310_;
                        int i_312_ = (i_269_ & 0xff00ff) + (i_310_ & 0xff00ff);
                        i_310_ = (i_312_ & 0x1000100) + (i_311_ - i_312_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_308_] = i_311_ - i_310_ | i_310_ - (i_310_ >>> 8);
                    }
                    i_308_++;
                }
                i_273_++;
                i_278_ += i_276_ + i_276_;
                i_277_ += i_276_++ + i_276_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final boolean j() {
        return true;
    }

    final void ZA(int i, float f, float f_313_, float f_314_, float f_315_, float f_316_) {
        ((ha_Sub1) this).anInt5546 = (int) (f * 65535.0F);
        ((ha_Sub1) this).anInt5581 = (int) (f_313_ * 65535.0F);
        float f_317_ = (float) Math.sqrt((double) (f_314_ * f_314_ + f_315_ * f_315_ + f_316_ * f_316_));
        ((ha_Sub1) this).anInt5569 = (int) (f_314_ * 65535.0F / f_317_);
        ((ha_Sub1) this).anInt5555 = (int) (f_315_ * 65535.0F / f_317_);
        ((ha_Sub1) this).anInt5566 = (int) (f_316_ * 65535.0F / f_317_);
    }

    final void EA(int i, int i_318_, int i_319_, int i_320_) {
        Class203 class203 = method832(Thread.currentThread());
        ((Class203) class203).anInt2311 = i;
        ((Class203) class203).anInt2303 = i_318_;
        ((Class203) class203).anInt2305 = i_319_;
    }

    final void b(int i) {
        ((ha_Sub1) this).anInt5577 = i;
        aClass278_5552.method2872((byte) -78);
    }

    final Node_Sub42 a(int i, int i_321_, int i_322_, int i_323_, int i_324_, float f) {
        return null;
    }

    final void x() {
        aClass278_5552.method2872((byte) -78);
        aClass278_5548.method2872((byte) -78);
    }

    final void ra(int i, int i_325_, int i_326_, int i_327_) {
        for (int i_328_ = 0; i_328_ < aClass203Array5571.length; i_328_++) {
            ((Class203) aClass203Array5571[i_328_]).anInt2306 = ((Class203) aClass203Array5571[i_328_]).anInt2303;
            ((Class203) aClass203Array5571[i_328_]).anInt2311 = i;
            ((Class203) aClass203Array5571[i_328_]).anInt2303 = i_325_;
            ((Class203) aClass203Array5571[i_328_]).anInt2305 = i_326_;
            ((Class203) aClass203Array5571[i_328_]).aBoolean2310 = true;
        }
    }

    final void h(int i) {
        aClass203Array5571[i].method1688(8, Thread.currentThread());
    }

    final Viewport t() {
        return ((ha_Sub1) this).aClass238_Sub1_5559;
    }

    final void za(int i, int i_329_, int i_330_, int i_331_, int i_332_) {
        if (i_330_ < 0)
            i_330_ = -i_330_;
        int i_333_ = i_329_ - i_330_;
        if (i_333_ < ((ha_Sub1) this).anInt5578)
            i_333_ = ((ha_Sub1) this).anInt5578;
        int i_334_ = i_329_ + i_330_ + 1;
        if (i_334_ > ((ha_Sub1) this).anInt5582)
            i_334_ = ((ha_Sub1) this).anInt5582;
        int i_335_ = i_333_;
        int i_336_ = i_330_ * i_330_;
        int i_337_ = 0;
        int i_338_ = i_329_ - i_335_;
        int i_339_ = i_338_ * i_338_;
        int i_340_ = i_339_ - i_338_;
        if (i_329_ > i_334_)
            i_329_ = i_334_;
        int i_341_ = i_331_ >>> 24;
        if (i_332_ == 0 || i_332_ == 1 && i_341_ == 255) {
            while (i_335_ < i_329_) {
                for (/**/; i_340_ <= i_336_ || i_339_ <= i_336_; i_340_ += i_337_++ + i_337_)
                    i_339_ += i_337_ + i_337_;
                int i_342_ = i - i_337_ + 1;
                if (i_342_ < ((ha_Sub1) this).anInt5575)
                    i_342_ = ((ha_Sub1) this).anInt5575;
                int i_343_ = i + i_337_;
                if (i_343_ > ((ha_Sub1) this).anInt5561)
                    i_343_ = ((ha_Sub1) this).anInt5561;
                int i_344_ = i_342_ + i_335_ * ((ha_Sub1) this).anInt5567;
                for (int i_345_ = i_342_; i_345_ < i_343_; i_345_++)
                    ((ha_Sub1) this).anIntArray5565[i_344_++] = i_331_;
                i_335_++;
                i_339_ -= i_338_-- + i_338_;
                i_340_ -= i_338_ + i_338_;
            }
            i_337_ = i_330_;
            i_338_ = i_335_ - i_329_;
            i_340_ = i_338_ * i_338_ + i_336_;
            i_339_ = i_340_ - i_337_;
            i_340_ -= i_338_;
            while (i_335_ < i_334_) {
                for (/**/; i_340_ > i_336_ && i_339_ > i_336_; i_339_ -= i_337_ + i_337_)
                    i_340_ -= i_337_-- + i_337_;
                int i_346_ = i - i_337_;
                if (i_346_ < ((ha_Sub1) this).anInt5575)
                    i_346_ = ((ha_Sub1) this).anInt5575;
                int i_347_ = i + i_337_;
                if (i_347_ > ((ha_Sub1) this).anInt5561 - 1)
                    i_347_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_348_ = i_346_ + i_335_ * ((ha_Sub1) this).anInt5567;
                for (int i_349_ = i_346_; i_349_ <= i_347_; i_349_++)
                    ((ha_Sub1) this).anIntArray5565[i_348_++] = i_331_;
                i_335_++;
                i_340_ += i_338_ + i_338_;
                i_339_ += i_338_++ + i_338_;
            }
        } else if (i_332_ == 1) {
            i_331_ = (((i_331_ & 0xff00ff) * i_341_ >> 8 & 0xff00ff) + ((i_331_ & 0xff00) * i_341_ >> 8 & 0xff00) + (i_341_ << 24));
            int i_350_ = 256 - i_341_;
            while (i_335_ < i_329_) {
                for (/**/; i_340_ <= i_336_ || i_339_ <= i_336_; i_340_ += i_337_++ + i_337_)
                    i_339_ += i_337_ + i_337_;
                int i_351_ = i - i_337_ + 1;
                if (i_351_ < ((ha_Sub1) this).anInt5575)
                    i_351_ = ((ha_Sub1) this).anInt5575;
                int i_352_ = i + i_337_;
                if (i_352_ > ((ha_Sub1) this).anInt5561)
                    i_352_ = ((ha_Sub1) this).anInt5561;
                int i_353_ = i_351_ + i_335_ * ((ha_Sub1) this).anInt5567;
                for (int i_354_ = i_351_; i_354_ < i_352_; i_354_++) {
                    int i_355_ = ((ha_Sub1) this).anIntArray5565[i_353_];
                    i_355_ = (((i_355_ & 0xff00ff) * i_350_ >> 8 & 0xff00ff) + ((i_355_ & 0xff00) * i_350_ >> 8 & 0xff00));
                    ((ha_Sub1) this).anIntArray5565[i_353_++] = i_331_ + i_355_;
                }
                i_335_++;
                i_339_ -= i_338_-- + i_338_;
                i_340_ -= i_338_ + i_338_;
            }
            i_337_ = i_330_;
            i_338_ = -i_338_;
            i_340_ = i_338_ * i_338_ + i_336_;
            i_339_ = i_340_ - i_337_;
            i_340_ -= i_338_;
            while (i_335_ < i_334_) {
                for (/**/; i_340_ > i_336_ && i_339_ > i_336_; i_339_ -= i_337_ + i_337_)
                    i_340_ -= i_337_-- + i_337_;
                int i_356_ = i - i_337_;
                if (i_356_ < ((ha_Sub1) this).anInt5575)
                    i_356_ = ((ha_Sub1) this).anInt5575;
                int i_357_ = i + i_337_;
                if (i_357_ > ((ha_Sub1) this).anInt5561 - 1)
                    i_357_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_358_ = i_356_ + i_335_ * ((ha_Sub1) this).anInt5567;
                for (int i_359_ = i_356_; i_359_ <= i_357_; i_359_++) {
                    int i_360_ = ((ha_Sub1) this).anIntArray5565[i_358_];
                    i_360_ = (((i_360_ & 0xff00ff) * i_350_ >> 8 & 0xff00ff) + ((i_360_ & 0xff00) * i_350_ >> 8 & 0xff00));
                    ((ha_Sub1) this).anIntArray5565[i_358_++] = i_331_ + i_360_;
                }
                i_335_++;
                i_340_ += i_338_ + i_338_;
                i_339_ += i_338_++ + i_338_;
            }
        } else if (i_332_ == 2) {
            while (i_335_ < i_329_) {
                for (/**/; i_340_ <= i_336_ || i_339_ <= i_336_; i_340_ += i_337_++ + i_337_)
                    i_339_ += i_337_ + i_337_;
                int i_361_ = i - i_337_ + 1;
                if (i_361_ < ((ha_Sub1) this).anInt5575)
                    i_361_ = ((ha_Sub1) this).anInt5575;
                int i_362_ = i + i_337_;
                if (i_362_ > ((ha_Sub1) this).anInt5561)
                    i_362_ = ((ha_Sub1) this).anInt5561;
                int i_363_ = i_361_ + i_335_ * ((ha_Sub1) this).anInt5567;
                for (int i_364_ = i_361_; i_364_ < i_362_; i_364_++) {
                    int i_365_ = ((ha_Sub1) this).anIntArray5565[i_363_];
                    int i_366_ = i_331_ + i_365_;
                    int i_367_ = (i_331_ & 0xff00ff) + (i_365_ & 0xff00ff);
                    i_365_ = (i_367_ & 0x1000100) + (i_366_ - i_367_ & 0x10000);
                    ((ha_Sub1) this).anIntArray5565[i_363_++] = i_366_ - i_365_ | i_365_ - (i_365_ >>> 8);
                }
                i_335_++;
                i_339_ -= i_338_-- + i_338_;
                i_340_ -= i_338_ + i_338_;
            }
            i_337_ = i_330_;
            i_338_ = -i_338_;
            i_340_ = i_338_ * i_338_ + i_336_;
            i_339_ = i_340_ - i_337_;
            i_340_ -= i_338_;
            while (i_335_ < i_334_) {
                for (/**/; i_340_ > i_336_ && i_339_ > i_336_; i_339_ -= i_337_ + i_337_)
                    i_340_ -= i_337_-- + i_337_;
                int i_368_ = i - i_337_;
                if (i_368_ < ((ha_Sub1) this).anInt5575)
                    i_368_ = ((ha_Sub1) this).anInt5575;
                int i_369_ = i + i_337_;
                if (i_369_ > ((ha_Sub1) this).anInt5561 - 1)
                    i_369_ = ((ha_Sub1) this).anInt5561 - 1;
                int i_370_ = i_368_ + i_335_ * ((ha_Sub1) this).anInt5567;
                for (int i_371_ = i_368_; i_371_ <= i_369_; i_371_++) {
                    int i_372_ = ((ha_Sub1) this).anIntArray5565[i_370_];
                    int i_373_ = i_331_ + i_372_;
                    int i_374_ = (i_331_ & 0xff00ff) + (i_372_ & 0xff00ff);
                    i_372_ = (i_374_ & 0x1000100) + (i_373_ - i_374_ & 0x10000);
                    ((ha_Sub1) this).anIntArray5565[i_370_++] = i_373_ - i_372_ | i_372_ - (i_372_ >>> 8);
                }
                i_335_++;
                i_340_ += i_338_ + i_338_;
                i_339_ += i_338_++ + i_338_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final int M() {
        int i = anInt5549;
        anInt5549 = 0;
        return i;
    }

    final void da(int i, int i_375_, int i_376_, int[] is) {
        float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_375_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_376_));
        if (f < (float) ((ha_Sub1) this).anInt5568 || f > (float) ((ha_Sub1) this).anInt5547)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_377_ = (int) ((float) ((ha_Sub1) this).anInt5550 * (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686 + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680) * (float) i_375_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683) * (float) i_376_)) / f);
            int i_378_ = (int) ((float) ((ha_Sub1) this).anInt5574 * (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677 + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698) * (float) i_375_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697) * (float) i_376_)) / f);
            if (i_377_ >= ((ha_Sub1) this).anInt5557 && i_377_ <= ((ha_Sub1) this).anInt5573 && i_378_ >= ((ha_Sub1) this).anInt5570 && i_378_ <= ((ha_Sub1) this).anInt5580) {
                is[0] = i_377_ - ((ha_Sub1) this).anInt5557;
                is[1] = i_378_ - ((ha_Sub1) this).anInt5570;
                is[2] = (int) f;
            } else
                is[0] = is[1] = is[2] = -1;
        }
    }

    final void U(int i, int i_379_, int i_380_, int i_381_, int i_382_) {
        if (i_379_ >= ((ha_Sub1) this).anInt5578 && i_379_ < ((ha_Sub1) this).anInt5582) {
            if (i < ((ha_Sub1) this).anInt5575) {
                i_380_ -= ((ha_Sub1) this).anInt5575 - i;
                i = ((ha_Sub1) this).anInt5575;
            }
            if (i + i_380_ > ((ha_Sub1) this).anInt5561)
                i_380_ = ((ha_Sub1) this).anInt5561 - i;
            int i_383_ = i + i_379_ * ((ha_Sub1) this).anInt5567;
            int i_384_ = i_381_ >>> 24;
            if (i_382_ == 0 || i_382_ == 1 && i_384_ == 255) {
                for (int i_385_ = 0; i_385_ < i_380_; i_385_++)
                    ((ha_Sub1) this).anIntArray5565[i_383_ + i_385_] = i_381_;
            } else if (i_382_ == 1) {
                i_381_ = (((i_381_ & 0xff00ff) * i_384_ >> 8 & 0xff00ff) + ((i_381_ & 0xff00) * i_384_ >> 8 & 0xff00) + (i_384_ << 24));
                int i_386_ = 256 - i_384_;
                for (int i_387_ = 0; i_387_ < i_380_; i_387_++) {
                    int i_388_ = ((ha_Sub1) this).anIntArray5565[i_383_ + i_387_];
                    i_388_ = (((i_388_ & 0xff00ff) * i_386_ >> 8 & 0xff00ff) + ((i_388_ & 0xff00) * i_386_ >> 8 & 0xff00));
                    ((ha_Sub1) this).anIntArray5565[i_383_ + i_387_] = i_381_ + i_388_;
                }
            } else if (i_382_ == 2) {
                for (int i_389_ = 0; i_389_ < i_380_; i_389_++) {
                    int i_390_ = ((ha_Sub1) this).anIntArray5565[i_383_ + i_389_];
                    int i_391_ = i_381_ + i_390_;
                    int i_392_ = (i_381_ & 0xff00ff) + (i_390_ & 0xff00ff);
                    i_390_ = (i_392_ & 0x1000100) + (i_391_ - i_392_ & 0x10000);
                    ((ha_Sub1) this).anIntArray5565[i_383_ + i_389_] = i_391_ - i_390_ | i_390_ - (i_390_ >>> 8);
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final int i() {
        return ((ha_Sub1) this).anInt5568;
    }

    final void j(int i) {
        int i_393_ = i - anInt5541;
        for (Object object = aClass278_5552.method2865(3); object != null; object = aClass278_5552.method2862(4)) {
            Node_Sub49 class248_sub49 = (Node_Sub49) object;
            if (((Node_Sub49) class248_sub49).aBoolean7434) {
                ((Node_Sub49) class248_sub49).anInt7436 += i_393_;
                int i_394_ = ((Node_Sub49) class248_sub49).anInt7436 / 20;
                if (i_394_ > 0) {
                    Class312 class312 = ((ha) this).aD1414.method25((((Node_Sub49) class248_sub49).anInt7437), (byte) 127);
                    class248_sub49.method2677((((Class312) class312).aByte3643 * i_393_ * 50 / 1000), (((Class312) class312).aByte3642 * i_393_ * 50 / 1000));
                    ((Node_Sub49) class248_sub49).anInt7436 -= i_394_ * 20;
                }
                ((Node_Sub49) class248_sub49).aBoolean7434 = false;
            }
        }
        anInt5541 = i;
        aClass278_5548.method2864(5, -15782);
        aClass278_5552.method2864(5, -15782);
    }

    final void a(za var_za) {
        /* empty */
    }

    final int c(int i, int i_395_) {
        return i | i_395_;
    }

    final int method830(int i) {
        return ((((Class312) ((ha) this).aD1414.method25(i, (byte) 124)).aShort3634) & 0xffff);
    }

    final void ya() {
        if (((ha_Sub1) this).anInt5575 == 0 && ((ha_Sub1) this).anInt5561 == ((ha_Sub1) this).anInt5567 && ((ha_Sub1) this).anInt5578 == 0 && ((ha_Sub1) this).anInt5582 == anInt5572) {
            int i = ((ha_Sub1) this).aFloatArray5556.length;
            int i_396_ = i - (i & 0x7);
            int i_397_ = 0;
            while (i_397_ < i_396_) {
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
            }
            while (i_397_ < i)
                ((ha_Sub1) this).aFloatArray5556[i_397_++] = 2.14748365E9F;
        } else {
            int i = ((ha_Sub1) this).anInt5561 - ((ha_Sub1) this).anInt5575;
            int i_398_ = ((ha_Sub1) this).anInt5582 - ((ha_Sub1) this).anInt5578;
            int i_399_ = ((ha_Sub1) this).anInt5567 - i;
            int i_400_ = (((ha_Sub1) this).anInt5575 + ((ha_Sub1) this).anInt5578 * ((ha_Sub1) this).anInt5567);
            int i_401_ = i >> 3;
            int i_402_ = i & 0x7;
            i = i_400_ - 1;
            for (int i_403_ = -i_398_; i_403_ < 0; i_403_++) {
                if (i_401_ > 0) {
                    int i_404_ = i_401_;
                    do {
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F;
                    } while (--i_404_ > 0);
                }
                if (i_402_ > 0) {
                    int i_405_ = i_402_;
                    do
                        ((ha_Sub1) this).aFloatArray5556[++i] = 2.14748365E9F; while (--i_405_ > 0);
                }
                i += i_399_;
            }
        }
    }

    final int JA(int i, int i_406_, int i_407_, int i_408_, int i_409_, int i_410_) {
        int i_411_ = 0;
        float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_406_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_407_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675));
        if (f < 1.0F)
            f = 1.0F;
        float f_412_ = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i_408_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_409_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_410_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675));
        if (f_412_ < 1.0F)
            f_412_ = 1.0F;
        if (f < (float) ((ha_Sub1) this).anInt5568 && f_412_ < (float) ((ha_Sub1) this).anInt5568)
            i_411_ |= 0x10;
        else if (f > (float) ((ha_Sub1) this).anInt5547 && f_412_ > (float) ((ha_Sub1) this).anInt5547)
            i_411_ |= 0x20;
        int i_413_ = (int) ((float) ((ha_Sub1) this).anInt5550 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680 * (float) i_406_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683 * (float) i_407_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686) / f);
        int i_414_ = (int) ((float) ((ha_Sub1) this).anInt5550 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i_408_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680 * (float) i_409_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683 * (float) i_410_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686) / f_412_);
        if (i_413_ < ((ha_Sub1) this).anInt5557 && i_414_ < ((ha_Sub1) this).anInt5557)
            i_411_ |= 0x1;
        else if (i_413_ > ((ha_Sub1) this).anInt5573 && i_414_ > ((ha_Sub1) this).anInt5573)
            i_411_ |= 0x2;
        int i_415_ = (int) ((float) ((ha_Sub1) this).anInt5574 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698 * (float) i_406_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697 * (float) i_407_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677) / f);
        int i_416_ = (int) ((float) ((ha_Sub1) this).anInt5574 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i_408_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698 * (float) i_409_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697 * (float) i_410_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677) / f_412_);
        if (i_415_ < ((ha_Sub1) this).anInt5570 && i_416_ < ((ha_Sub1) this).anInt5570)
            i_411_ |= 0x4;
        else if (i_415_ > ((ha_Sub1) this).anInt5580 && i_416_ > ((ha_Sub1) this).anInt5580)
            i_411_ |= 0x8;
        return i_411_;
    }

    final int[] method831(int i) {
        Node_Sub49 class248_sub49;
        synchronized (aClass278_5552) {
            class248_sub49 = (Node_Sub49) aClass278_5552.method2863(4, (long) i);
            if (class248_sub49 == null) {
                if (!((ha) this).aD1414.method23(i, -32345))
                    return null;
                Class312 class312 = ((ha) this).aD1414.method25(i, (byte) 124);
                int i_417_ = (((Class312) class312).aBoolean3636 || aBoolean5551 ? 64 : ((ha_Sub1) this).anInt5577);
                class248_sub49 = new Node_Sub49(i, i_417_, ((ha) this).aD1414.method24(-118, i_417_, 0.7F, true, i, i_417_), ((Class312) class312).anInt3629 != 1);
                aClass278_5552.method2867((byte) 0, (long) i, class248_sub49);
            }
        }
        ((Node_Sub49) class248_sub49).aBoolean7434 = true;
        return class248_sub49.method2676();
    }

    final void c(int i, int i_418_, int i_419_, int i_420_, int i_421_, int i_422_) {
        U(i, i_418_, i_419_, i_421_, i_422_);
        U(i, i_418_ + i_420_ - 1, i_419_, i_421_, i_422_);
        P(i, i_418_ + 1, i_420_ - 2, i_421_, i_422_);
        P(i + i_419_ - 1, i_418_ + 1, i_420_ - 2, i_421_, i_422_);
    }

    final Class316 d(int i, int i_423_, int i_424_, int i_425_, int i_426_, int i_427_) {
        return null;
    }

    final Class203 method832(Runnable runnable) {
        for (int i = 0; i < ((ha_Sub1) this).anInt5558; i++) {
            if (((Class203) aClass203Array5571[i]).aRunnable2309 == runnable)
                return aClass203Array5571[i];
        }
        return null;
    }

    final void a(int i, int i_428_, int i_429_, int i_430_, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_) {
        Class203 class203 = method832(Thread.currentThread());
        Class244 class244 = ((Class203) class203).aClass244_2345;
        ((Class244) class244).aBoolean2711 = false;
        i -= ((ha_Sub1) this).anInt5557;
        i_430_ -= ((ha_Sub1) this).anInt5557;
        i_433_ -= ((ha_Sub1) this).anInt5557;
        i_428_ -= ((ha_Sub1) this).anInt5570;
        i_431_ -= ((ha_Sub1) this).anInt5570;
        i_434_ -= ((ha_Sub1) this).anInt5570;
        ((Class244) class244).aBoolean2723 = (i < 0 || i > ((Class244) class244).anInt2713 || i_430_ < 0 || i_430_ > ((Class244) class244).anInt2713 || i_433_ < 0 || i_433_ > ((Class244) class244).anInt2713);
        int i_440_ = i_436_ >>> 24;
        if (i_439_ == 0 || i_439_ == 1 && i_440_ == 255) {
            ((Class244) class244).anInt2718 = 0;
            ((Class244) class244).aBoolean2714 = false;
            class244.method1953((float) i_428_, (float) i_431_, (float) i_434_, (float) i, (float) i_430_, (float) i_433_, (float) i_429_, (float) i_432_, (float) i_435_, i_436_, i_437_, i_438_);
        } else if (i_439_ == 1) {
            ((Class244) class244).anInt2718 = 255 - i_440_;
            ((Class244) class244).aBoolean2714 = false;
            class244.method1953((float) i_428_, (float) i_431_, (float) i_434_, (float) i, (float) i_430_, (float) i_433_, (float) i_429_, (float) i_432_, (float) i_435_, i_436_, i_437_, i_438_);
        } else if (i_439_ == 2) {
            ((Class244) class244).anInt2718 = 128;
            ((Class244) class244).aBoolean2714 = true;
            class244.method1953((float) i_428_, (float) i_431_, (float) i_434_, (float) i, (float) i_430_, (float) i_433_, (float) i_429_, (float) i_432_, (float) i_435_, i_436_, i_437_, i_438_);
        } else
            throw new IllegalArgumentException();
        ((Class244) class244).aBoolean2711 = true;
    }

    final void a(int[] is) {
        is[0] = ((ha_Sub1) this).anInt5567;
        is[1] = anInt5572;
    }

    private final void method833() {
        for (int i = 0; i < ((ha_Sub1) this).anInt5558; i++)
            aClass203Array5571[i].method1687(0);
        la();
    }

    final void g(int i) {
        Class162_Sub3.anInt6620 = Class162_Sub3.anInt6617 = i;
        if (((ha_Sub1) this).anInt5558 > 1)
            throw new IllegalStateException("No MT");
        c(((ha_Sub1) this).anInt5558);
        h(0);
    }

    final void a(float f, float f_441_, float f_442_) {
        /* empty */
    }

    final int[] method834(int i) {
        Node_Sub49 class248_sub49;
        synchronized (aClass278_5552) {
            class248_sub49 = ((Node_Sub49) aClass278_5552.method2863(4, (long) i | ~0x7fffffffffffffffL));
            if (class248_sub49 == null) {
                if (!((ha) this).aD1414.method23(i, -32345))
                    return null;
                Class312 class312 = ((ha) this).aD1414.method25(i, (byte) 127);
                int i_443_ = (((Class312) class312).aBoolean3636 || aBoolean5551 ? 64 : ((ha_Sub1) this).anInt5577);
                class248_sub49 = new Node_Sub49(i, i_443_, ((ha) this).aD1414.method27(true, (byte) 92, i_443_, i_443_, 0.7F, i), ((Class312) class312).anInt3629 != 1);
                aClass278_5552.method2867((byte) 0, (long) i | ~0x7fffffffffffffffL, class248_sub49);
            }
        }
        ((Node_Sub49) class248_sub49).aBoolean7434 = true;
        return class248_sub49.method2676();
    }

    final void e(int i, int i_444_) throws Exception_Sub1 {
        if (aCanvas5539 == null || ((ha_Sub1) this).aClass248_Sub40_5544 == null)
            throw new IllegalStateException("off");
        try {
            Graphics graphics = aCanvas5539.getGraphics();
            ((ha_Sub1) this).aClass248_Sub40_5544.method2612(anInt5538, false, i, 0, 0, anInt5542, i_444_, graphics);
        } catch (Exception exception) {
            aCanvas5539.repaint();
        }
    }

    final Viewport o() {
        Class203 class203 = method832(Thread.currentThread());
        return ((Class203) class203).aClass238_Sub1_2318;
    }

    final void pa() {
        for (int i = 0; i < aClass203Array5571.length; i++) {
            ((Class203) aClass203Array5571[i]).anInt2303 = ((Class203) aClass203Array5571[i]).anInt2306;
            ((Class203) aClass203Array5571[i]).aBoolean2310 = false;
        }
    }

    final Class167 c() {
        return new Class167(0, "Pure Java", 1, "CPU", 0L);
    }

    final void method835(int i, int i_445_, int i_446_, int i_447_, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_) {
        if (i_447_ != 0 && i_448_ != 0) {
            if (i_450_ != 65535 && !(((Class312) ((ha) this).aD1414.method25(i_450_, (byte) 126)).aBoolean3622)) {
                if (anInt5585 != i_450_) {
                    Class129 class129 = ((Class129) aClass278_5548.method2863(4, (long) i_450_));
                    if (class129 == null) {
                        int[] is = method834(i_450_);
                        if (is == null)
                            return;
                        int i_454_ = (method823(i_450_) ? 64 : ((ha_Sub1) this).anInt5577);
                        class129 = this.method813(i_454_, (byte) 99, i_454_, is, 0, i_454_);
                        aClass278_5548.method2867((byte) 0, (long) i_450_, class129);
                    }
                    anInt5585 = i_450_;
                    aClass129_5586 = class129;
                }
                ((Class129_Sub3) aClass129_5586).method1195(i - i_447_, i_445_ - i_448_, i_446_, i_447_ << 1, i_448_ << 1, i_452_, i_451_, i_453_, 1);
            } else
                method829(i, i_445_, i_446_, i_447_, i_451_, i_453_);
        }
    }

    final boolean a() {
        return false;
    }

    final void A(int i, aa var_aa, int i_455_, int i_456_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_457_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_458_;
        if (((ha_Sub1) this).anInt5582 < i_456_ + is.length)
            i_458_ = ((ha_Sub1) this).anInt5582 - i_456_;
        else
            i_458_ = is.length;
        int i_459_;
        if (((ha_Sub1) this).anInt5578 > i_456_) {
            i_459_ = ((ha_Sub1) this).anInt5578 - i_456_;
            i_456_ = ((ha_Sub1) this).anInt5578;
        } else
            i_459_ = 0;
        if (i_458_ - i_459_ > 0) {
            int i_460_ = i_456_ * ((ha_Sub1) this).anInt5567;
            for (int i_461_ = i_459_; i_461_ < i_458_; i_461_++) {
                int i_462_ = i_455_ + is[i_461_];
                int i_463_ = is_457_[i_461_];
                if (((ha_Sub1) this).anInt5575 > i_462_) {
                    i_463_ -= ((ha_Sub1) this).anInt5575 - i_462_;
                    i_462_ = ((ha_Sub1) this).anInt5575;
                }
                if (((ha_Sub1) this).anInt5561 < i_462_ + i_463_)
                    i_463_ = ((ha_Sub1) this).anInt5561 - i_462_;
                i_462_ += i_460_;
                for (int i_464_ = -i_463_; i_464_ < 0; i_464_++)
                    ((ha_Sub1) this).anIntArray5565[i_462_++] = i;
                i_460_ += ((ha_Sub1) this).anInt5567;
            }
        }
    }

    final aa a(int i, int i_465_, int[] is, int[] is_466_) {
        return new aa_Sub1(i, i_465_, is, is_466_);
    }

    final boolean v() {
        return true;
    }

    final void a(Viewport viewport) {
        ((ha_Sub1) this).aClass238_Sub1_5559 = (Class238_Sub1) viewport;
    }

    final void a(Canvas canvas) {
        if (canvas != null) {
            Node_Sub40 class248_sub40 = ((Node_Sub40) aClass65_5545.method501((long) canvas.hashCode(), (byte) 31));
            if (class248_sub40 != null) {
                aCanvas5539 = canvas;
                Dimension dimension = canvas.getSize();
                anInt5542 = dimension.width;
                anInt5538 = dimension.height;
                ((ha_Sub1) this).aClass248_Sub40_5544 = class248_sub40;
                if (aClass189_5562 == null) {
                    ((ha_Sub1) this).anIntArray5565 = ((Node_Sub40) class248_sub40).anIntArray7283;
                    ((ha_Sub1) this).anInt5567 = ((Node_Sub40) class248_sub40).anInt7281;
                    anInt5572 = ((Node_Sub40) class248_sub40).anInt7284;
                    if (((ha_Sub1) this).anInt5567 != anInt5554 || anInt5572 != anInt5563) {
                        anInt5576 = anInt5554 = ((ha_Sub1) this).anInt5567;
                        anInt5553 = anInt5563 = anInt5572;
                        ((ha_Sub1) this).aFloatArray5584 = ((ha_Sub1) this).aFloatArray5556 = new float[anInt5554 * anInt5563];
                    }
                    method833();
                }
            }
        } else {
            aCanvas5539 = null;
            ((ha_Sub1) this).aClass248_Sub40_5544 = null;
            if (aClass189_5562 == null) {
                ((ha_Sub1) this).anIntArray5565 = null;
                ((ha_Sub1) this).anInt5567 = anInt5572 = 1;
                anInt5554 = anInt5563 = 1;
                method833();
            }
        }
    }

    final Class48 a(Class285 class285, Class157[] class157s, boolean bool) {
        int[] is = new int[class157s.length];
        int[] is_467_ = new int[class157s.length];
        boolean bool_468_ = false;
        for (int i = 0; i < class157s.length; i++) {
            is[i] = ((Class157) class157s[i]).anInt1873;
            is_467_[i] = ((Class157) class157s[i]).anInt1874;
            if (((Class157) class157s[i]).aByteArray1875 != null)
                bool_468_ = true;
        }
        if (bool) {
            if (bool_468_)
                return new Class48_Sub5(this, class285, class157s, is, is_467_);
            return new Class48_Sub4(this, class285, class157s, is, is_467_);
        }
        if (bool_468_)
            throw new IllegalArgumentException("");
        return new Class48_Sub3(this, class285, class157s, is, is_467_);
    }

    final void a(Rectangle[] rectangles, int i, int i_469_, int i_470_) throws Exception_Sub1 {
        if (aCanvas5539 == null || ((ha_Sub1) this).aClass248_Sub40_5544 == null)
            throw new IllegalStateException("off");
        try {
            Graphics graphics = aCanvas5539.getGraphics();
            for (int i_471_ = 0; i_471_ < i; i_471_++) {
                Rectangle rectangle = rectangles[i_471_];
                if (rectangle.x + i_469_ <= ((ha_Sub1) this).anInt5567 && rectangle.y + i_470_ <= anInt5572 && rectangle.x + i_469_ + rectangle.width > 0 && rectangle.y + i_470_ + rectangle.height > 0)
                    ((ha_Sub1) this).aClass248_Sub40_5544.method2612(rectangle.height, false, rectangle.x + i_469_, rectangle.y, rectangle.x, rectangle.width, rectangle.y + i_470_, graphics);
            }
        } catch (Exception exception) {
            aCanvas5539.repaint();
        }
    }

    final boolean y() {
        return false;
    }

    final void a(Class338 class338, int i) {
        Class203 class203 = method832(Thread.currentThread());
        Class346_Sub5 class346_sub5 = (((Class26) ((Class338) class338).aClass26_3941).aClass346_Sub5_346);
        for (Class346_Sub5 class346_sub5_472_ = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279; class346_sub5_472_ != class346_sub5; class346_sub5_472_ = ((Class346_Sub5) class346_sub5_472_).aClass346_Sub5_8279) {
            Class346_Sub5_Sub2 class346_sub5_sub2 = (Class346_Sub5_Sub2) class346_sub5_472_;
            int i_473_ = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 12;
            int i_474_ = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 12;
            int i_475_ = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> 12;
            float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i_473_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_474_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_475_));
            if (!(f < (float) ((ha_Sub1) this).anInt5568) && !(f > (float) ((Class203) class203).anInt2312)) {
                int i_476_ = (((ha_Sub1) this).anInt5579 + (int) ((float) ((ha_Sub1) this).anInt5550 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i_473_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680) * (float) i_474_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683) * (float) i_475_)) / (float) i));
                int i_477_ = (((ha_Sub1) this).anInt5560 + (int) ((float) ((ha_Sub1) this).anInt5574 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i_473_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698) * (float) i_474_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697) * (float) i_475_)) / (float) i));
                if (i_476_ >= ((ha_Sub1) this).anInt5575 && i_476_ <= ((ha_Sub1) this).anInt5561 && i_477_ >= ((ha_Sub1) this).anInt5578 && i_477_ <= ((ha_Sub1) this).anInt5582) {
                    if (f == 0.0F)
                        f = 1.0F;
                    method828(class346_sub5_sub2, i_476_, i_477_, (int) f, ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) * ((ha_Sub1) this).anInt5550 >> 12) / i);
                }
            }
        }
    }

    final Class316 a(Class316 class316, Class316 class316_478_, float f, Class316 class316_479_) {
        return null;
    }

    final void K(int[] is) {
        is[0] = ((ha_Sub1) this).anInt5575;
        is[1] = ((ha_Sub1) this).anInt5578;
        is[2] = ((ha_Sub1) this).anInt5561;
        is[3] = ((ha_Sub1) this).anInt5582;
    }

    final za a(int i) {
        return null;
    }

    final void a(int i, int i_480_, int i_481_, int i_482_, int i_483_, int i_484_, int i_485_, int i_486_, int i_487_) {
        i_481_ -= i;
        i_482_ -= i_480_;
        if (i_482_ == 0) {
            if (i_481_ >= 0)
                method826(i, i_480_, i_481_ + 1, i_483_, i_484_, i_485_, i_486_, i_487_);
            else {
                int i_488_ = i_485_ + i_486_;
                i_487_ %= i_488_;
                i_487_ = i_488_ + i_485_ - i_487_ - (-i_481_ + 1) % i_488_;
                i_487_ %= i_488_;
                if (i_487_ < 0)
                    i_487_ += i_488_;
                method826(i + i_481_, i_480_, -i_481_ + 1, i_483_, i_484_, i_485_, i_486_, i_487_);
            }
        } else if (i_481_ == 0) {
            if (i_482_ >= 0)
                method824(i, i_480_, i_482_ + 1, i_483_, i_484_, i_485_, i_486_, i_487_);
            else {
                int i_489_ = i_485_ + i_486_;
                i_487_ %= i_489_;
                i_487_ = i_489_ + i_485_ - i_487_ - (-i_482_ + 1) % i_489_;
                i_487_ %= i_489_;
                if (i_487_ < 0)
                    i_487_ += i_489_;
                method824(i, i_480_ + i_482_, -i_482_ + 1, i_483_, i_484_, i_485_, i_486_, i_487_);
            }
        } else {
            i_487_ <<= 8;
            i_485_ <<= 8;
            i_486_ <<= 8;
            int i_490_ = i_485_ + i_486_;
            i_487_ %= i_490_;
            if (i_481_ + i_482_ < 0) {
                int i_491_ = (int) (Math.sqrt((double) (i_481_ * i_481_ + i_482_ * i_482_)) * 256.0);
                int i_492_ = i_491_ % i_490_;
                i_487_ = i_490_ + i_485_ - i_487_ - i_492_;
                i_487_ %= i_490_;
                if (i_487_ < 0)
                    i_487_ += i_490_;
                i += i_481_;
                i_481_ = -i_481_;
                i_480_ += i_482_;
                i_482_ = -i_482_;
            }
            if (i_481_ > i_482_) {
                i_480_ <<= 16;
                i_480_ += 32768;
                i_482_ <<= 16;
                int i_493_ = (int) Math.floor((double) i_482_ / (double) i_481_ + 0.5);
                i_481_ += i;
                int i_494_ = i_483_ >>> 24;
                int i_495_ = (int) Math.sqrt((double) (65536 + (i_493_ >> 8) * (i_493_ >> 8)));
                if (i_484_ == 0 || i_484_ == 1 && i_494_ == 255) {
                    while (i <= i_481_) {
                        int i_496_ = i_480_ >> 16;
                        if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561 && i_496_ >= ((ha_Sub1) this).anInt5578 && i_496_ < ((ha_Sub1) this).anInt5582 && i_487_ < i_485_)
                            ((ha_Sub1) this).anIntArray5565[i + i_496_ * ((ha_Sub1) this).anInt5567] = i_483_;
                        i_480_ += i_493_;
                        i++;
                        i_487_ += i_495_;
                        i_487_ %= i_490_;
                    }
                    return;
                }
                if (i_484_ == 1) {
                    i_483_ = (((i_483_ & 0xff00ff) * i_494_ >> 8 & 0xff00ff) + ((i_483_ & 0xff00) * i_494_ >> 8 & 0xff00) + (i_494_ << 24));
                    int i_497_ = 256 - i_494_;
                    while (i <= i_481_) {
                        int i_498_ = i_480_ >> 16;
                        if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561 && i_498_ >= ((ha_Sub1) this).anInt5578 && i_498_ < ((ha_Sub1) this).anInt5582 && i_487_ < i_485_) {
                            int i_499_ = i + i_498_ * ((ha_Sub1) this).anInt5567;
                            int i_500_ = ((ha_Sub1) this).anIntArray5565[i_499_];
                            i_500_ = (((i_500_ & 0xff00ff) * i_497_ >> 8 & 0xff00ff) + ((i_500_ & 0xff00) * i_497_ >> 8 & 0xff00));
                            ((ha_Sub1) this).anIntArray5565[i_499_] = i_483_ + i_500_;
                        }
                        i_480_ += i_493_;
                        i++;
                        i_487_ += i_495_;
                        i_487_ %= i_490_;
                    }
                    return;
                }
                if (i_484_ == 2) {
                    while (i <= i_481_) {
                        int i_501_ = i_480_ >> 16;
                        if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561 && i_501_ >= ((ha_Sub1) this).anInt5578 && i_501_ < ((ha_Sub1) this).anInt5582 && i_487_ < i_485_) {
                            int i_502_ = i + i_501_ * ((ha_Sub1) this).anInt5567;
                            int i_503_ = ((ha_Sub1) this).anIntArray5565[i_502_];
                            int i_504_ = i_483_ + i_503_;
                            int i_505_ = (i_483_ & 0xff00ff) + (i_503_ & 0xff00ff);
                            i_503_ = (i_505_ & 0x1000100) + (i_504_ - i_505_ & 0x10000);
                            ((ha_Sub1) this).anIntArray5565[i_502_] = i_504_ - i_503_ | i_503_ - (i_503_ >>> 8);
                        }
                        i_480_ += i_493_;
                        i++;
                        i_487_ += i_495_;
                        i_487_ %= i_490_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            i <<= 16;
            i += 32768;
            i_481_ <<= 16;
            int i_506_ = (int) Math.floor((double) i_481_ / (double) i_482_ + 0.5);
            i_482_ += i_480_;
            int i_507_ = i_483_ >>> 24;
            int i_508_ = (int) Math.sqrt((double) (65536 + (i_506_ >> 8) * (i_506_ >> 8)));
            if (i_484_ == 0 || i_484_ == 1 && i_507_ == 255) {
                while (i_480_ <= i_482_) {
                    int i_509_ = i >> 16;
                    if (i_480_ >= ((ha_Sub1) this).anInt5578 && i_480_ < ((ha_Sub1) this).anInt5582 && i_509_ >= ((ha_Sub1) this).anInt5575 && i_509_ < ((ha_Sub1) this).anInt5561 && i_487_ < i_485_)
                        ((ha_Sub1) this).anIntArray5565[i_509_ + i_480_ * ((ha_Sub1) this).anInt5567] = i_483_;
                    i += i_506_;
                    i_480_++;
                    i_487_ += i_508_;
                    i_487_ %= i_490_;
                }
            } else if (i_484_ == 1) {
                i_483_ = (((i_483_ & 0xff00ff) * i_507_ >> 8 & 0xff00ff) + ((i_483_ & 0xff00) * i_507_ >> 8 & 0xff00) + (i_507_ << 24));
                int i_510_ = 256 - i_507_;
                while (i_480_ <= i_482_) {
                    int i_511_ = i >> 16;
                    if (i_480_ >= ((ha_Sub1) this).anInt5578 && i_480_ < ((ha_Sub1) this).anInt5582 && i_511_ >= ((ha_Sub1) this).anInt5575 && i_511_ < ((ha_Sub1) this).anInt5561 && i_487_ < i_485_) {
                        int i_512_ = i_511_ + i_480_ * ((ha_Sub1) this).anInt5567;
                        int i_513_ = ((ha_Sub1) this).anIntArray5565[i_512_];
                        i_513_ = (((i_513_ & 0xff00ff) * i_510_ >> 8 & 0xff00ff) + ((i_513_ & 0xff00) * i_510_ >> 8 & 0xff00));
                        ((ha_Sub1) this).anIntArray5565[i_511_ + i_480_ * ((ha_Sub1) this).anInt5567] = i_483_ + i_513_;
                    }
                    i += i_506_;
                    i_480_++;
                    i_487_ += i_508_;
                    i_487_ %= i_490_;
                }
            } else if (i_484_ == 2) {
                while (i_480_ <= i_482_) {
                    int i_514_ = i >> 16;
                    if (i_480_ >= ((ha_Sub1) this).anInt5578 && i_480_ < ((ha_Sub1) this).anInt5582 && i_514_ >= ((ha_Sub1) this).anInt5575 && i_514_ < ((ha_Sub1) this).anInt5561 && i_487_ < i_485_) {
                        int i_515_ = i_514_ + i_480_ * ((ha_Sub1) this).anInt5567;
                        int i_516_ = ((ha_Sub1) this).anIntArray5565[i_515_];
                        int i_517_ = i_483_ + i_516_;
                        int i_518_ = (i_483_ & 0xff00ff) + (i_516_ & 0xff00ff);
                        i_516_ = (i_518_ & 0x1000100) + (i_517_ - i_518_ & 0x10000);
                        ((ha_Sub1) this).anIntArray5565[i_515_] = i_517_ - i_516_ | i_516_ - (i_516_ >>> 8);
                    }
                    i += i_506_;
                    i_480_++;
                    i_487_ += i_508_;
                    i_487_ %= i_490_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void a(int i, Node_Sub42[] class248_sub42s) {
        /* empty */
    }

    final Interface14 a(Interface13 interface13, Interface2 interface2) {
        return new Class189(this, (Class129) interface13, (Class351) interface2);
    }

    final void a(int i, int i_519_, int i_520_, int i_521_, int i_522_, int i_523_, aa var_aa, int i_524_, int i_525_, int i_526_, int i_527_, int i_528_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_529_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_530_ = (((ha_Sub1) this).anInt5578 > i_525_ ? ((ha_Sub1) this).anInt5578 : i_525_);
        int i_531_ = (((ha_Sub1) this).anInt5582 < i_525_ + is.length ? ((ha_Sub1) this).anInt5582 : i_525_ + is.length);
        i_528_ <<= 8;
        i_526_ <<= 8;
        i_527_ <<= 8;
        int i_532_ = i_526_ + i_527_;
        i_528_ %= i_532_;
        i_520_ -= i;
        i_521_ -= i_519_;
        if (i_520_ + i_521_ < 0) {
            int i_533_ = (int) (Math.sqrt((double) (i_520_ * i_520_ + i_521_ * i_521_)) * 256.0);
            int i_534_ = i_533_ % i_532_;
            i_528_ = i_532_ + i_526_ - i_528_ - i_534_;
            i_528_ %= i_532_;
            if (i_528_ < 0)
                i_528_ += i_532_;
            i += i_520_;
            i_520_ = -i_520_;
            i_519_ += i_521_;
            i_521_ = -i_521_;
        }
        if (i_520_ > i_521_) {
            i_519_ <<= 16;
            i_519_ += 32768;
            i_521_ <<= 16;
            int i_535_ = (int) Math.floor((double) i_521_ / (double) i_520_ + 0.5);
            i_520_ += i;
            int i_536_ = i_522_ >>> 24;
            int i_537_ = (int) Math.sqrt((double) (65536 + (i_535_ >> 8) * (i_535_ >> 8)));
            if (i_523_ == 0 || i_523_ == 1 && i_536_ == 255) {
                while (i <= i_520_) {
                    int i_538_ = i_519_ >> 16;
                    int i_539_ = i_538_ - i_525_;
                    if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561 && i_538_ >= i_530_ && i_538_ < i_531_ && i_528_ < i_526_) {
                        int i_540_ = i_524_ + is[i_539_];
                        if (i >= i_540_ && i < i_540_ + is_529_[i_539_])
                            ((ha_Sub1) this).anIntArray5565[i + i_538_ * ((ha_Sub1) this).anInt5567] = i_522_;
                    }
                    i_519_ += i_535_;
                    i++;
                    i_528_ += i_537_;
                    i_528_ %= i_532_;
                }
                return;
            }
            if (i_523_ == 1) {
                i_522_ = (((i_522_ & 0xff00ff) * i_536_ >> 8 & 0xff00ff) + ((i_522_ & 0xff00) * i_536_ >> 8 & 0xff00) + (i_536_ << 24));
                int i_541_ = 256 - i_536_;
                while (i <= i_520_) {
                    int i_542_ = i_519_ >> 16;
                    int i_543_ = i_542_ - i_525_;
                    if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561 && i_542_ >= i_530_ && i_542_ < i_531_ && i_528_ < i_526_) {
                        int i_544_ = i_524_ + is[i_543_];
                        if (i >= i_544_ && i < i_544_ + is_529_[i_543_]) {
                            int i_545_ = i + i_542_ * ((ha_Sub1) this).anInt5567;
                            int i_546_ = ((ha_Sub1) this).anIntArray5565[i_545_];
                            i_546_ = (((i_546_ & 0xff00ff) * i_541_ >> 8 & 0xff00ff) + ((i_546_ & 0xff00) * i_541_ >> 8 & 0xff00));
                            ((ha_Sub1) this).anIntArray5565[i_545_] = i_522_ + i_546_;
                        }
                    }
                    i_519_ += i_535_;
                    i++;
                    i_528_ += i_537_;
                    i_528_ %= i_532_;
                }
                return;
            }
            if (i_523_ == 2) {
                while (i <= i_520_) {
                    int i_547_ = i_519_ >> 16;
                    int i_548_ = i_547_ - i_525_;
                    if (i >= ((ha_Sub1) this).anInt5575 && i < ((ha_Sub1) this).anInt5561 && i_547_ >= i_530_ && i_547_ < i_531_ && i_528_ < i_526_) {
                        int i_549_ = i_524_ + is[i_548_];
                        if (i >= i_549_ && i < i_549_ + is_529_[i_548_]) {
                            int i_550_ = i + i_547_ * ((ha_Sub1) this).anInt5567;
                            int i_551_ = ((ha_Sub1) this).anIntArray5565[i_550_];
                            int i_552_ = i_522_ + i_551_;
                            int i_553_ = (i_522_ & 0xff00ff) + (i_551_ & 0xff00ff);
                            i_551_ = (i_553_ & 0x1000100) + (i_552_ - i_553_ & 0x10000);
                            ((ha_Sub1) this).anIntArray5565[i_550_] = i_552_ - i_551_ | i_551_ - (i_551_ >>> 8);
                        }
                    }
                    i_519_ += i_535_;
                    i++;
                    i_528_ += i_537_;
                    i_528_ %= i_532_;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        i <<= 16;
        i += 32768;
        i_520_ <<= 16;
        int i_554_ = (int) Math.floor((double) i_520_ / (double) i_521_ + 0.5);
        int i_555_ = (int) Math.sqrt((double) (65536 + (i_554_ >> 8) * (i_554_ >> 8)));
        i_521_ += i_519_;
        int i_556_ = i_522_ >>> 24;
        if (i_523_ == 0 || i_523_ == 1 && i_556_ == 255) {
            while (i_519_ <= i_521_) {
                int i_557_ = i >> 16;
                int i_558_ = i_519_ - i_525_;
                if (i_519_ >= i_530_ && i_519_ < i_531_ && i_557_ >= ((ha_Sub1) this).anInt5575 && i_557_ < ((ha_Sub1) this).anInt5561 && i_528_ < i_526_ && i_557_ >= i_524_ + is[i_558_] && i_557_ < i_524_ + is[i_558_] + is_529_[i_558_])
                    ((ha_Sub1) this).anIntArray5565[i_557_ + i_519_ * ((ha_Sub1) this).anInt5567] = i_522_;
                i += i_554_;
                i_519_++;
                i_528_ += i_555_;
                i_528_ %= i_532_;
            }
        } else if (i_523_ == 1) {
            i_522_ = (((i_522_ & 0xff00ff) * i_556_ >> 8 & 0xff00ff) + ((i_522_ & 0xff00) * i_556_ >> 8 & 0xff00) + (i_556_ << 24));
            int i_559_ = 256 - i_556_;
            while (i_519_ <= i_521_) {
                int i_560_ = i >> 16;
                int i_561_ = i_519_ - i_525_;
                if (i_519_ >= i_530_ && i_519_ < i_531_ && i_560_ >= ((ha_Sub1) this).anInt5575 && i_560_ < ((ha_Sub1) this).anInt5561 && i_528_ < i_526_ && i_560_ >= i_524_ + is[i_561_] && i_560_ < i_524_ + is[i_561_] + is_529_[i_561_]) {
                    int i_562_ = i_560_ + i_519_ * ((ha_Sub1) this).anInt5567;
                    int i_563_ = ((ha_Sub1) this).anIntArray5565[i_562_];
                    i_563_ = (((i_563_ & 0xff00ff) * i_559_ >> 8 & 0xff00ff) + ((i_563_ & 0xff00) * i_559_ >> 8 & 0xff00));
                    ((ha_Sub1) this).anIntArray5565[i_560_ + i_519_ * ((ha_Sub1) this).anInt5567] = i_522_ + i_563_;
                }
                i += i_554_;
                i_519_++;
                i_528_ += i_555_;
                i_528_ %= i_532_;
            }
        } else if (i_523_ == 2) {
            while (i_519_ <= i_521_) {
                int i_564_ = i >> 16;
                int i_565_ = i_519_ - i_525_;
                if (i_519_ >= i_530_ && i_519_ < i_531_ && i_564_ >= ((ha_Sub1) this).anInt5575 && i_564_ < ((ha_Sub1) this).anInt5561 && i_528_ < i_526_ && i_564_ >= i_524_ + is[i_565_] && i_564_ < i_524_ + is[i_565_] + is_529_[i_565_]) {
                    int i_566_ = i_564_ + i_519_ * ((ha_Sub1) this).anInt5567;
                    int i_567_ = ((ha_Sub1) this).anIntArray5565[i_566_];
                    int i_568_ = i_522_ + i_567_;
                    int i_569_ = (i_522_ & 0xff00ff) + (i_567_ & 0xff00ff);
                    i_567_ = (i_569_ & 0x1000100) + (i_568_ - i_569_ & 0x10000);
                    ((ha_Sub1) this).anIntArray5565[i_566_] = i_568_ - i_567_ | i_567_ - (i_567_ >>> 8);
                }
                i += i_554_;
                i_519_++;
                i_528_ += i_555_;
                i_528_ %= i_532_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final Class162 a(Class343 class343, int i, int i_570_, int i_571_, int i_572_) {
        return new Class162_Sub3(this, class343, i, i_571_, i_572_, i_570_);
    }

    final void a(int i, int i_573_, int i_574_, int i_575_) {
        /* empty */
    }

    final void p() {
        if (aBoolean5540) {
            Class48.method372(true, false, (byte) 119);
            aBoolean5540 = false;
        }
        ((ha_Sub1) this).aClass248_Sub40_5544 = null;
        aCanvas5539 = null;
        anInt5542 = 0;
        anInt5538 = 0;
        aClass65_5545 = null;
        aBoolean5543 = true;
    }

    final boolean A() {
        return false;
    }

    final void k() {
        /* empty */
    }

    final boolean method836(int i) {
        if (!(((Class312) ((ha) this).aD1414.method25(i, (byte) 127)).aBoolean3632) && !(((Class312) ((ha) this).aD1414.method25(i, (byte) 127)).aBoolean3639))
            return false;
        return true;
    }

    final boolean s() {
        return false;
    }

    final void HA(int i, int i_576_, int i_577_, int i_578_, int[] is) {
        float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_576_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_577_));
        if (f < (float) ((ha_Sub1) this).anInt5568 || f > (float) ((ha_Sub1) this).anInt5547)
            is[0] = is[1] = is[2] = -1;
        else {
            int i_579_ = (int) ((float) ((ha_Sub1) this).anInt5550 * (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686 + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680) * (float) i_576_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683) * (float) i_577_)) / (float) i_578_);
            int i_580_ = (int) ((float) ((ha_Sub1) this).anInt5574 * (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677 + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698) * (float) i_576_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697) * (float) i_577_)) / (float) i_578_);
            if (i_579_ >= ((ha_Sub1) this).anInt5557 && i_579_ <= ((ha_Sub1) this).anInt5573 && i_580_ >= ((ha_Sub1) this).anInt5570 && i_580_ <= ((ha_Sub1) this).anInt5580) {
                is[0] = i_579_ - ((ha_Sub1) this).anInt5557;
                is[1] = i_580_ - ((ha_Sub1) this).anInt5570;
                is[2] = (int) f;
            } else
                is[0] = is[1] = is[2] = -1;
        }
    }

    final void c(int i) {
        ((ha_Sub1) this).anInt5558 = i;
        aClass203Array5571 = new Class203[((ha_Sub1) this).anInt5558];
        for (int i_581_ = 0; i_581_ < ((ha_Sub1) this).anInt5558; i_581_++)
            aClass203Array5571[i_581_] = new Class203(this);
    }

    final void e(int i) {
        aClass203Array5571[i].method1688(8, null);
    }

    final void C(boolean bool) {
        Class203 class203 = method832(Thread.currentThread());
        ((Class203) class203).aBoolean2316 = bool;
    }

    final void a(Class338 class338) {
        Class203 class203 = method832(Thread.currentThread());
        Class346_Sub5 class346_sub5 = (((Class26) ((Class338) class338).aClass26_3941).aClass346_Sub5_346);
        for (Class346_Sub5 class346_sub5_582_ = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279; class346_sub5_582_ != class346_sub5; class346_sub5_582_ = ((Class346_Sub5) class346_sub5_582_).aClass346_Sub5_8279) {
            Class346_Sub5_Sub2 class346_sub5_sub2 = (Class346_Sub5_Sub2) class346_sub5_582_;
            int i = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 12;
            int i_583_ = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 12;
            int i_584_ = ((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> 12;
            float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_583_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_584_));
            if (!(f < (float) ((ha_Sub1) this).anInt5568) && !(f > (float) ((Class203) class203).anInt2312)) {
                int i_585_ = (((ha_Sub1) this).anInt5579 + (int) ((float) ((ha_Sub1) this).anInt5550 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680) * (float) i_583_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683) * (float) i_584_)) / f));
                int i_586_ = (((ha_Sub1) this).anInt5560 + (int) ((float) ((ha_Sub1) this).anInt5574 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677) + ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698) * (float) i_583_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697) * (float) i_584_)) / f));
                if (i_585_ >= ((ha_Sub1) this).anInt5575 && i_585_ <= ((ha_Sub1) this).anInt5561 && i_586_ >= ((ha_Sub1) this).anInt5578 && i_586_ <= ((ha_Sub1) this).anInt5582) {
                    if (f == 0.0F)
                        f = 1.0F;
                    method828(class346_sub5_sub2, i_585_, i_586_, (int) f, (int) ((float) ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896 * ((ha_Sub1) this).anInt5550) >> 12) / f));
                }
            }
        }
    }

    final void GA(int i) {
        aa(0, 0, ((ha_Sub1) this).anInt5567, anInt5572, i, 0);
    }

    final boolean f() {
        return false;
    }

    final int XA() {
        return ((ha_Sub1) this).anInt5547;
    }

    final void la() {
        ((ha_Sub1) this).anInt5575 = 0;
        ((ha_Sub1) this).anInt5578 = 0;
        ((ha_Sub1) this).anInt5561 = ((ha_Sub1) this).anInt5567;
        ((ha_Sub1) this).anInt5582 = anInt5572;
        method838();
    }

    final void T(int i, int i_587_, int i_588_, int i_589_) {
        if (((ha_Sub1) this).anInt5575 < i)
            ((ha_Sub1) this).anInt5575 = i;
        if (((ha_Sub1) this).anInt5578 < i_587_)
            ((ha_Sub1) this).anInt5578 = i_587_;
        if (((ha_Sub1) this).anInt5561 > i_588_)
            ((ha_Sub1) this).anInt5561 = i_588_;
        if (((ha_Sub1) this).anInt5582 > i_589_)
            ((ha_Sub1) this).anInt5582 = i_589_;
        method838();
    }

    final int method837(int i) {
        return (((Class312) ((ha) this).aD1414.method25(i, (byte) 126)).anInt3629);
    }

    final void KA(int i, int i_590_, int i_591_, int i_592_) {
        if (i < 0)
            i = 0;
        if (i_590_ < 0)
            i_590_ = 0;
        if (i_591_ > ((ha_Sub1) this).anInt5567)
            i_591_ = ((ha_Sub1) this).anInt5567;
        if (i_592_ > anInt5572)
            i_592_ = anInt5572;
        ((ha_Sub1) this).anInt5575 = i;
        ((ha_Sub1) this).anInt5561 = i_591_;
        ((ha_Sub1) this).anInt5578 = i_590_;
        ((ha_Sub1) this).anInt5582 = i_592_;
        method838();
    }

    private final void method838() {
        ((ha_Sub1) this).anInt5557 = ((ha_Sub1) this).anInt5575 - ((ha_Sub1) this).anInt5579;
        ((ha_Sub1) this).anInt5573 = ((ha_Sub1) this).anInt5561 - ((ha_Sub1) this).anInt5579;
        ((ha_Sub1) this).anInt5570 = ((ha_Sub1) this).anInt5578 - ((ha_Sub1) this).anInt5560;
        ((ha_Sub1) this).anInt5580 = ((ha_Sub1) this).anInt5582 - ((ha_Sub1) this).anInt5560;
        for (int i = 0; i < ((ha_Sub1) this).anInt5558; i++) {
            Class244 class244 = ((Class203) aClass203Array5571[i]).aClass244_2345;
            ((Class244) class244).anInt2712 = ((ha_Sub1) this).anInt5579 - ((ha_Sub1) this).anInt5575;
            ((Class244) class244).anInt2715 = ((ha_Sub1) this).anInt5560 - ((ha_Sub1) this).anInt5578;
            ((Class244) class244).anInt2713 = ((ha_Sub1) this).anInt5561 - ((ha_Sub1) this).anInt5575;
            ((Class244) class244).anInt2717 = ((ha_Sub1) this).anInt5582 - ((ha_Sub1) this).anInt5578;
        }
        int i = (((ha_Sub1) this).anInt5578 * ((ha_Sub1) this).anInt5567 + ((ha_Sub1) this).anInt5575);
        for (int i_593_ = ((ha_Sub1) this).anInt5578; i_593_ < ((ha_Sub1) this).anInt5582; i_593_++) {
            for (int i_594_ = 0; i_594_ < ((ha_Sub1) this).anInt5558; i_594_++)
                ((Class244) ((Class203) aClass203Array5571[i_594_]).aClass244_2345).anIntArray2720[i_593_ - ((ha_Sub1) this).anInt5578] = i;
            i += ((ha_Sub1) this).anInt5567;
        }
    }

    final void a(int i, int i_595_, int i_596_, int i_597_, int i_598_, int i_599_, int i_600_) {
        Class203 class203 = method832(Thread.currentThread());
        Class244 class244 = ((Class203) class203).aClass244_2345;
        int i_601_ = i_596_ - i;
        int i_602_ = i_597_ - i_595_;
        int i_603_ = i_601_ >= 0 ? i_601_ : -i_601_;
        int i_604_ = i_602_ >= 0 ? i_602_ : -i_602_;
        int i_605_ = i_603_;
        if (i_605_ < i_604_)
            i_605_ = i_604_;
        if (i_605_ != 0) {
            int i_606_ = (i_601_ << 16) / i_605_;
            int i_607_ = (i_602_ << 16) / i_605_;
            i_601_ += i_606_ >> 16;
            i_602_ += i_607_ >> 16;
            if (i_607_ <= i_606_)
                i_606_ = -i_606_;
            else
                i_607_ = -i_607_;
            int i_608_ = i_599_ * i_607_ >> 17;
            int i_609_ = i_599_ * i_607_ + 1 >> 17;
            int i_610_ = i_599_ * i_606_ >> 17;
            int i_611_ = i_599_ * i_606_ + 1 >> 17;
            i -= class244.method1952();
            i_595_ -= class244.method1950();
            int i_612_ = i + i_608_;
            int i_613_ = i - i_609_;
            int i_614_ = i + i_601_ - i_609_;
            int i_615_ = i + i_601_ + i_608_;
            int i_616_ = i_595_ + i_610_;
            int i_617_ = i_595_ - i_611_;
            int i_618_ = i_595_ + i_602_ - i_611_;
            int i_619_ = i_595_ + i_602_ + i_610_;
            if (i_600_ == 0)
                ((Class244) class244).anInt2718 = 0;
            else if (i_600_ == 1)
                ((Class244) class244).anInt2718 = 255 - (i_598_ >>> 24);
            else
                throw new IllegalArgumentException();
            C(false);
            ((Class244) class244).aBoolean2723 = (i_612_ < 0 || i_612_ > ((Class244) class244).anInt2713 || i_613_ < 0 || i_613_ > ((Class244) class244).anInt2713 || i_614_ < 0 || i_614_ > ((Class244) class244).anInt2713);
            class244.method1949((float) i_616_, (float) i_617_, (float) i_618_, (float) i_612_, (float) i_613_, (float) i_614_, 100.0F, 100.0F, 100.0F, i_598_);
            ((Class244) class244).aBoolean2723 = (i_612_ < 0 || i_612_ > ((Class244) class244).anInt2713 || i_614_ < 0 || i_614_ > ((Class244) class244).anInt2713 || i_615_ < 0 || i_615_ > ((Class244) class244).anInt2713);
            class244.method1949((float) i_616_, (float) i_618_, (float) i_619_, (float) i_612_, (float) i_614_, (float) i_615_, 100.0F, 100.0F, 100.0F, i_598_);
            C(true);
        }
    }

    final boolean d() {
        return false;
    }

    final boolean q() {
        return false;
    }

    final Class129 a(int[] is, int i, int i_620_, int i_621_, int i_622_, boolean bool) {
        boolean bool_623_ = false;
        int i_624_ = i;
        while_70_:
        for (int i_625_ = 0; i_625_ < i_622_; i_625_++) {
            for (int i_626_ = 0; i_626_ < i_621_; i_626_++) {
                int i_627_ = is[i_624_++] >>> 24;
                if (i_627_ != 0 && i_627_ != 255) {
                    bool_623_ = true;
                    break while_70_;
                }
            }
        }
        if (bool_623_)
            return new Class129_Sub3_Sub2(this, is, i, i_620_, i_621_, i_622_, bool);
        return new Class129_Sub3_Sub1(this, is, i, i_620_, i_621_, i_622_, bool);
    }

    final boolean m() {
        return true;
    }

    final void b(boolean bool) {
        aBoolean5551 = bool;
        aClass278_5552.method2872((byte) -78);
    }

    final void z() {
        if (aCanvas5539 != null) {
            ((ha_Sub1) this).anIntArray5565 = (((Node_Sub40) ((ha_Sub1) this).aClass248_Sub40_5544).anIntArray7283);
            ((ha_Sub1) this).anInt5567 = (((Node_Sub40) ((ha_Sub1) this).aClass248_Sub40_5544).anInt7281);
            anInt5572 = (((Node_Sub40) ((ha_Sub1) this).aClass248_Sub40_5544).anInt7284);
            ((ha_Sub1) this).aFloatArray5556 = ((ha_Sub1) this).aFloatArray5584;
            anInt5554 = anInt5576;
            anInt5563 = anInt5553;
        } else {
            ((ha_Sub1) this).anInt5567 = 1;
            anInt5572 = 1;
            ((ha_Sub1) this).anIntArray5565 = null;
            anInt5554 = 1;
            anInt5563 = 1;
            ((ha_Sub1) this).aFloatArray5556 = null;
        }
        aClass189_5562 = null;
        method833();
    }

    final Interface2 a(int i, int i_628_) {
        return new Class351(i, i_628_);
    }

    final int r(int i, int i_629_, int i_630_, int i_631_, int i_632_, int i_633_, int i_634_) {
        float f = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_629_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_630_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675));
        float f_635_ = ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6694) * (float) i_631_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6692) * (float) i_632_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6699) * (float) i_633_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6675));
        int i_636_ = 0;
        if (f < (float) ((ha_Sub1) this).anInt5568 && f_635_ < (float) ((ha_Sub1) this).anInt5568)
            i_636_ |= 0x10;
        else if (f > (float) ((ha_Sub1) this).anInt5547 && f_635_ > (float) ((ha_Sub1) this).anInt5547)
            i_636_ |= 0x20;
        int i_637_ = (int) ((float) ((ha_Sub1) this).anInt5550 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680 * (float) i_629_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683 * (float) i_630_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686) / (float) i_634_);
        int i_638_ = (int) ((float) ((ha_Sub1) this).anInt5550 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6688) * (float) i_631_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6680 * (float) i_632_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6683 * (float) i_633_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6686) / (float) i_634_);
        if (i_637_ < ((ha_Sub1) this).anInt5557 && i_638_ < ((ha_Sub1) this).anInt5557)
            i_636_ |= 0x1;
        else if (i_637_ > ((ha_Sub1) this).anInt5573 && i_638_ > ((ha_Sub1) this).anInt5573)
            i_636_ |= 0x2;
        int i_639_ = (int) ((float) ((ha_Sub1) this).anInt5574 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698 * (float) i_629_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697 * (float) i_630_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677) / (float) i_634_);
        int i_640_ = (int) ((float) ((ha_Sub1) this).anInt5574 * ((((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6702) * (float) i_631_ + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6698 * (float) i_632_) + (((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6697 * (float) i_633_) + ((Class238_Sub1) ((ha_Sub1) this).aClass238_Sub1_5559).aFloat6677) / (float) i_634_);
        if (i_639_ < ((ha_Sub1) this).anInt5570 && i_640_ < ((ha_Sub1) this).anInt5570)
            i_636_ |= 0x4;
        else if (i_639_ > ((ha_Sub1) this).anInt5580 && i_640_ > ((ha_Sub1) this).anInt5580)
            i_636_ |= 0x8;
        return i_636_;
    }

    final int[] Y() {
        return (new int[]{((ha_Sub1) this).anInt5579, ((ha_Sub1) this).anInt5560, ((ha_Sub1) this).anInt5550, ((ha_Sub1) this).anInt5574});
    }
}
