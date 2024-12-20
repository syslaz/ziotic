/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class129 implements Interface13 {
    final void method1161(float f, float f_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
        method1172(f, f_0_, (float) method1169() / 2.0F, (float) method1181() / 2.0F, i, i_1_, i_2_, i_3_, i_4_);
    }

    final void method1162(float f, float f_5_, int i, int i_6_) {
        method1172(f, f_5_, (float) method1169() / 2.0F, (float) method1181() / 2.0F, i, i_6_, 1, 0, 1);
    }

    final void method1163(float f, float f_7_, float f_8_, float f_9_, int i, int i_10_, aa var_aa, int i_11_, int i_12_) {
        if (i != 0) {
            double d = (double) (i_10_ & 0xffff) * 9.587379924285257E-5;
            float f_13_ = (float) Math.sin(d) * (float) i;
            float f_14_ = (float) Math.cos(d) * (float) i;
            float f_15_ = (-f_8_ * f_14_ + -f_9_ * f_13_) / 4096.0F + f;
            float f_16_ = (f_8_ * f_13_ + -f_9_ * f_14_) / 4096.0F + f_7_;
            float f_17_ = ((((float) method1169() - f_8_) * f_14_ + -f_9_ * f_13_) / 4096.0F + f);
            float f_18_ = ((-((float) method1169() - f_8_) * f_13_ + -f_9_ * f_14_) / 4096.0F + f_7_);
            float f_19_ = ((-f_8_ * f_14_ + ((float) method1181() - f_9_) * f_13_) / 4096.0F + f);
            float f_20_ = ((f_8_ * f_13_ + ((float) method1181() - f_9_) * f_14_) / 4096.0F + f_7_);
            method1171(f_15_, f_16_, f_17_, f_18_, f_19_, f_20_, var_aa, i_11_, i_12_);
        }
    }

    abstract void method1164(int i, int i_21_, aa var_aa, int i_22_, int i_23_);

    abstract void method1165(int i, int i_24_, int i_25_, int i_26_);

    final void method1166(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
        method1183(i, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, 1);
    }

    abstract void method1167(float f, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_, int i, int i_38_, int i_39_, int i_40_);

    final void method1168(int i, int i_41_) {
        method1178(i, i_41_, 1, 0, 1);
    }

    public Class129() {
        /* empty */
    }

    abstract int method1169();

    final void method1170(float f, float f_42_, int i, int i_43_, aa var_aa, int i_44_, int i_45_) {
        method1163(f, f_42_, (float) method1169() / 2.0F, (float) method1181() / 2.0F, i, i_43_, var_aa, i_44_, i_45_);
    }

    private final void method1171(float f, float f_46_, float f_47_, float f_48_, float f_49_, float f_50_, aa var_aa, int i, int i_51_) {
        method1174(f, f_46_, f_47_, f_48_, f_49_, f_50_, 1, var_aa, i, i_51_);
    }

    private final void method1172(float f, float f_52_, float f_53_, float f_54_, int i, int i_55_, int i_56_, int i_57_, int i_58_) {
        if (i != 0) {
            double d = (double) (i_55_ & 0xffff) * 9.587379924285257E-5;
            float f_59_ = (float) Math.sin(d) * (float) i;
            float f_60_ = (float) Math.cos(d) * (float) i;
            float f_61_ = (-f_53_ * f_60_ + -f_54_ * f_59_) / 4096.0F + f;
            float f_62_ = (f_53_ * f_59_ + -f_54_ * f_60_) / 4096.0F + f_52_;
            float f_63_ = ((((float) method1169() - f_53_) * f_60_ + -f_54_ * f_59_) / 4096.0F + f);
            float f_64_ = ((-((float) method1169() - f_53_) * f_59_ + -f_54_ * f_60_) / 4096.0F + f_52_);
            float f_65_ = ((-f_53_ * f_60_ + ((float) method1181() - f_54_) * f_59_) / 4096.0F + f);
            float f_66_ = ((f_53_ * f_59_ + ((float) method1181() - f_54_) * f_60_) / 4096.0F + f_52_);
            method1173(f_61_, f_62_, f_63_, f_64_, f_65_, f_66_, i_56_, i_57_, i_58_);
        }
    }

    private final void method1173(float f, float f_67_, float f_68_, float f_69_, float f_70_, float f_71_, int i, int i_72_, int i_73_) {
        method1167(f, f_67_, f_68_, f_69_, f_70_, f_71_, i, i_72_, i_73_, 1);
    }

    abstract void method1174(float f, float f_74_, float f_75_, float f_76_, float f_77_, float f_78_, int i, aa var_aa, int i_79_, int i_80_);

    abstract int method1175();

    abstract int method1176();

    abstract void method1177(int i, int i_81_, int i_82_);

    abstract void method1178(int i, int i_83_, int i_84_, int i_85_, int i_86_);

    abstract void method1179(int[] is);

    abstract void method1180(int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_);

    abstract int method1181();

    final void method1182(int i, int i_93_, int i_94_, int i_95_) {
        method1180(i, i_93_, i_94_, i_95_, 1, 0, 1);
    }

    abstract void method1183(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_);

    abstract void method1184(int i, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_);

    final void method1185(int i, int i_108_, int i_109_, int i_110_) {
        method1183(i, i_108_, i_109_, i_110_, 1, 0, 1, 1);
    }
}
