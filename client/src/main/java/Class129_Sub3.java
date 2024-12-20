/* Class129_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class129_Sub3 extends Class129 {
    private static int anInt8547;
    int anInt8548;
    static int anInt8549;
    static int anInt8550;
    static int anInt8551 = 0;
    static int anInt8552;
    static int anInt8553;
    static int anInt8554;
    static int anInt8555;
    ha_Sub1 aHa_Sub1_8556;
    static int anInt8557;
    static int anInt8558;
    static int anInt8559 = 0;
    static int anInt8560 = 0;
    static int anInt8561;
    static int anInt8562;
    int anInt8563;
    static int anInt8564;
    static int anInt8565;
    int anInt8566;
    static int anInt8567;
    int anInt8568;
    int anInt8569;
    private static int anInt8570;
    int anInt8571;
    private static int anInt8572;
    static int anInt8573;
    private static int anInt8574;
    private static int anInt8575;
    static int anInt8576;
    static int anInt8577;
    private int[] anIntArray8578;
    private static int anInt8579;

    abstract void method1193(int i, int i_0_);

    final void method1165(int i, int i_1_, int i_2_, int i_3_) {
        ((Class129_Sub3) this).anInt8566 = i;
        ((Class129_Sub3) this).anInt8571 = i_1_;
        ((Class129_Sub3) this).anInt8568 = i_2_;
        ((Class129_Sub3) this).anInt8563 = i_3_;
    }

    final void method1167(float f, float f_4_, float f_5_, float f_6_, float f_7_, float f_8_, int i, int i_9_, int i_10_, int i_11_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        if (method1196(f, f_4_, f_5_, f_6_, f_7_, f_8_)) {
            anInt8565 = i_9_;
            if (i != 1) {
                anInt8567 = i_9_ >>> 24;
                anInt8573 = 256 - anInt8567;
                if (i == 0) {
                    anInt8551 = (i_9_ & 0xff0000) >> 16;
                    anInt8560 = (i_9_ & 0xff00) >> 8;
                    anInt8559 = i_9_ & 0xff;
                } else if (i == 2) {
                    anInt8574 = i_9_ >>> 24;
                    anInt8579 = 256 - anInt8574;
                    int i_12_ = (i_9_ & 0xff00ff) * anInt8579 & ~0xff00ff;
                    int i_13_ = (i_9_ & 0xff00) * anInt8579 & 0xff0000;
                    anInt8553 = (i_12_ | i_13_) >>> 8;
                }
            }
            if (i == 1) {
                if (i_10_ == 0)
                    method1193(1, 0);
                else if (i_10_ == 1)
                    method1193(1, 1);
                else if (i_10_ == 2)
                    method1193(1, 2);
            } else if (i == 0) {
                if (i_10_ == 0)
                    method1193(0, 0);
                else if (i_10_ == 1)
                    method1193(0, 1);
                else if (i_10_ == 2)
                    method1193(0, 2);
            } else if (i == 3) {
                if (i_10_ == 0)
                    method1193(3, 0);
                else if (i_10_ == 1)
                    method1193(3, 1);
                else if (i_10_ == 2)
                    method1193(3, 2);
            } else if (i == 2) {
                if (i_10_ == 0)
                    method1193(2, 0);
                else if (i_10_ == 1)
                    method1193(2, 1);
                else if (i_10_ == 2)
                    method1193(2, 2);
            }
        }
    }

    final void method1174(float f, float f_14_, float f_15_, float f_16_, float f_17_, float f_18_, int i, aa var_aa, int i_19_, int i_20_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        if (method1196(f, f_14_, f_15_, f_16_, f_17_, f_18_)) {
            aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
            method1194(((aa_Sub1) var_aa_Sub1).anIntArray5252, ((aa_Sub1) var_aa_Sub1).anIntArray5253, anInt8575 - i_19_, -i_20_ - (anInt8577 - anInt8547));
        }
    }

    abstract void method1178(int i, int i_21_, int i_22_, int i_23_, int i_24_);

    final void method1180(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
        if (((Class129_Sub3) this).aHa_Sub1_8556.method825())
            throw new IllegalStateException();
        if (anIntArray8578 == null)
            anIntArray8578 = new int[4];
        ((Class129_Sub3) this).aHa_Sub1_8556.K(anIntArray8578);
        ((Class129_Sub3) this).aHa_Sub1_8556.T(((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575, ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578, i + i_26_, i_25_ + i_27_);
        int i_31_ = method1169();
        int i_32_ = method1181();
        int i_33_ = (i_26_ + i_31_ - 1) / i_31_;
        int i_34_ = (i_27_ + i_32_ - 1) / i_32_;
        for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
            int i_36_ = i_35_ * i_32_;
            for (int i_37_ = 0; i_37_ < i_33_; i_37_++)
                method1178(i + i_37_ * i_31_, i_25_ + i_36_, i_28_, i_29_, i_30_);
        }
        ((Class129_Sub3) this).aHa_Sub1_8556.KA(anIntArray8578[0], anIntArray8578[1], anIntArray8578[2], anIntArray8578[3]);
    }

    abstract void method1194(int[] is, int[] is_38_, int i, int i_39_);

    final int method1181() {
        return (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
    }

    abstract void method1195(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_);

    abstract void method1164(int i, int i_48_, aa var_aa, int i_49_, int i_50_);

    private final boolean method1196(float f, float f_51_, float f_52_, float f_53_, float f_54_, float f_55_) {
        int i = (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
        int i_56_ = (((Class129_Sub3) this).anInt8571 + ((Class129_Sub3) this).anInt8569 + ((Class129_Sub3) this).anInt8563);
        if (i != ((Class129_Sub3) this).anInt8548 || i_56_ != ((Class129_Sub3) this).anInt8569) {
            float f_57_ = (f_52_ - f) / (float) i;
            float f_58_ = (f_53_ - f_51_) / (float) i;
            float f_59_ = (f_54_ - f) / (float) i_56_;
            float f_60_ = (f_55_ - f_51_) / (float) i_56_;
            float f_61_ = f_59_ * (float) ((Class129_Sub3) this).anInt8571;
            float f_62_ = f_60_ * (float) ((Class129_Sub3) this).anInt8571;
            float f_63_ = f_57_ * (float) ((Class129_Sub3) this).anInt8566;
            float f_64_ = f_58_ * (float) ((Class129_Sub3) this).anInt8566;
            float f_65_ = -f_57_ * (float) ((Class129_Sub3) this).anInt8568;
            float f_66_ = -f_58_ * (float) ((Class129_Sub3) this).anInt8568;
            float f_67_ = -f_59_ * (float) ((Class129_Sub3) this).anInt8563;
            float f_68_ = -f_60_ * (float) ((Class129_Sub3) this).anInt8563;
            f += f_63_ + f_61_;
            f_51_ += f_64_ + f_62_;
            f_52_ += f_65_ + f_61_;
            f_53_ += f_66_ + f_62_;
            f_54_ += f_63_ + f_67_;
            f_55_ += f_64_ + f_68_;
        }
        float f_69_ = f_54_ + (f_52_ - f);
        float f_70_ = f_53_ + (f_55_ - f_51_);
        float f_71_;
        float f_72_;
        if (f < f_52_) {
            f_71_ = f;
            f_72_ = f_52_;
        } else {
            f_71_ = f_52_;
            f_72_ = f;
        }
        if (f_54_ < f_71_)
            f_71_ = f_54_;
        if (f_69_ < f_71_)
            f_71_ = f_69_;
        if (f_54_ > f_72_)
            f_72_ = f_54_;
        if (f_69_ > f_72_)
            f_72_ = f_69_;
        float f_73_;
        float f_74_;
        if (f_51_ < f_53_) {
            f_73_ = f_51_;
            f_74_ = f_53_;
        } else {
            f_73_ = f_53_;
            f_74_ = f_51_;
        }
        if (f_55_ < f_73_)
            f_73_ = f_55_;
        if (f_70_ < f_73_)
            f_73_ = f_70_;
        if (f_55_ > f_74_)
            f_74_ = f_55_;
        if (f_70_ > f_74_)
            f_74_ = f_70_;
        if (f_71_ < (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575))
            f_71_ = (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5575);
        if (f_72_ > (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561))
            f_72_ = (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5561);
        if (f_73_ < (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578))
            f_73_ = (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5578);
        if (f_74_ > (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582))
            f_74_ = (float) (((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5582);
        f_72_ = f_71_ - f_72_;
        if (f_72_ >= 0.0F)
            return false;
        f_74_ = f_73_ - f_74_;
        if (f_74_ >= 0.0F)
            return false;
        anInt8552 = ((ha_Sub1) ((Class129_Sub3) this).aHa_Sub1_8556).anInt5567;
        anInt8550 = (int) ((float) ((int) f_73_ * anInt8552) + f_71_);
        float f_75_ = (f_52_ - f) * (f_55_ - f_51_) - (f_53_ - f_51_) * (f_54_ - f);
        float f_76_ = (f_54_ - f) * (f_53_ - f_51_) - (f_55_ - f_51_) * (f_52_ - f);
        anInt8557 = (int) ((f_55_ - f_51_) * 4096.0F * (float) ((Class129_Sub3) this).anInt8548 / f_75_);
        anInt8564 = (int) ((f_53_ - f_51_) * 4096.0F * (float) ((Class129_Sub3) this).anInt8569 / f_76_);
        anInt8576 = (int) ((f_54_ - f) * 4096.0F * (float) ((Class129_Sub3) this).anInt8548 / f_76_);
        anInt8555 = (int) ((f_52_ - f) * 4096.0F * (float) ((Class129_Sub3) this).anInt8569 / f_75_);
        anInt8572 = (int) (f_71_ * 16.0F + 8.0F - (f + f_52_ + f_54_ + f_69_) / 4.0F * 16.0F);
        anInt8570 = (int) (f_73_ * 16.0F + 8.0F - (f_51_ + f_53_ + f_55_ + f_70_) / 4.0F * 16.0F);
        anInt8558 = ((((Class129_Sub3) this).anInt8548 >> 1 << 12) + (anInt8570 * anInt8576 >> 4));
        anInt8561 = ((((Class129_Sub3) this).anInt8569 >> 1 << 12) + (anInt8570 * anInt8555 >> 4));
        anInt8554 = anInt8572 * anInt8557 >> 4;
        anInt8562 = anInt8572 * anInt8564 >> 4;
        anInt8575 = (int) f_71_;
        anInt8549 = (int) f_72_;
        anInt8547 = (int) f_73_;
        anInt8577 = (int) f_74_;
        return true;
    }

    final void method1179(int[] is) {
        is[0] = ((Class129_Sub3) this).anInt8566;
        is[1] = ((Class129_Sub3) this).anInt8571;
        is[2] = ((Class129_Sub3) this).anInt8568;
        is[3] = ((Class129_Sub3) this).anInt8563;
    }

    abstract void method1183(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_);

    final int method1175() {
        return ((Class129_Sub3) this).anInt8548;
    }

    final int method1169() {
        return (((Class129_Sub3) this).anInt8566 + ((Class129_Sub3) this).anInt8548 + ((Class129_Sub3) this).anInt8568);
    }

    final int method1176() {
        return ((Class129_Sub3) this).anInt8569;
    }

    Class129_Sub3(ha_Sub1 var_ha_Sub1, int i, int i_84_) {
        ((Class129_Sub3) this).aHa_Sub1_8556 = var_ha_Sub1;
        ((Class129_Sub3) this).anInt8548 = i;
        ((Class129_Sub3) this).anInt8569 = i_84_;
    }

    static {
        anInt8553 = 0;
        anInt8573 = 0;
        anInt8574 = 0;
        anInt8567 = 0;
        anInt8579 = 0;
    }
}
