/* t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class t extends s implements Interface8 {
    long nativeid;
    private oa anOa4869;
    private Class293 aClass293_4870 = new Class293();
    private int anInt4871 = -1;

    final native void ka(int i, int i_0_, int i_1_);

    public final native void w(boolean bool);

    final void method3142(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean[][] bools) {
        anOa4869.C().method136(this, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, bools);
    }

    final native void YA();

    final boolean method3143(r var_r, int i, int i_8_, int i_9_, int i_10_, boolean bool) {
        return true;
    }

    protected final void finalize() {
        if (((t) this).nativeid != 0L)
            Class123.method1136(this, (byte) -63);
    }

    final native void U(int i, int i_11_, int[] is, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int i_19_, int i_20_, int i_21_, boolean bool);

    final native void wa(r var_r, int i, int i_22_, int i_23_, int i_24_, boolean bool);

    final void method3149(int i, int i_25_, int i_26_, boolean[][] bools, boolean bool, int i_27_) {
        anInt4871 = -1;
        int i_28_ = 0;
        float[] fs = new float[aClass293_4870.method3112(0)];
        for (Node_Sub42 class248_sub42 = (Node_Sub42) aClass293_4870.method3119(2); class248_sub42 != null; class248_sub42 = (Node_Sub42) aClass293_4870.method3107(-128))
            fs[i_28_++] = class248_sub42.method2621((byte) 110);
        q(fs);
        for (int i_29_ = 0; i_29_ < i_26_ + i_26_; i_29_++) {
            for (int i_30_ = 0; i_30_ < i_26_ + i_26_; i_30_++) {
                if (bools[i_29_][i_30_]) {
                    int i_31_ = i - i_26_ + i_29_;
                    int i_32_ = i_25_ - i_26_ + i_30_;
                    if (i_31_ >= 0 && i_31_ < ((s) this).anInt3468 && i_32_ >= 0 && i_32_ < ((s) this).anInt3472)
                        method3148(i_31_, i_32_);
                }
            }
        }
    }

    final void method3148(int i, int i_33_) {
        if (anInt4871 < 0)
            anOa4869.C().method143(this, i, i_33_);
        else
            anOa4869.C().method146(this, i, i_33_, anInt4871);
    }

    private final native void q(float[] fs);

    final void method3144(int i, int i_34_, int i_35_, boolean[][] bools, boolean bool, int i_36_, int i_37_) {
        anInt4871 = i_36_;
        int i_38_ = 0;
        float[] fs = new float[aClass293_4870.method3112(0)];
        for (Node_Sub42 class248_sub42 = (Node_Sub42) aClass293_4870.method3119(2); class248_sub42 != null; class248_sub42 = (Node_Sub42) aClass293_4870.method3107(-127))
            fs[i_38_++] = class248_sub42.method2621((byte) 110);
        q(fs);
        for (int i_39_ = 0; i_39_ < i_35_ + i_35_; i_39_++) {
            for (int i_40_ = 0; i_40_ < i_35_ + i_35_; i_40_++) {
                if (bools[i_39_][i_40_]) {
                    int i_41_ = i - i_35_ + i_39_;
                    int i_42_ = i_34_ - i_35_ + i_40_;
                    if (i_41_ >= 0 && i_41_ < ((s) this).anInt3468 && i_42_ >= 0 && i_42_ < ((s) this).anInt3472)
                        method3148(i_41_, i_42_);
                }
            }
        }
    }

    final native void CA(r var_r, int i, int i_43_, int i_44_, int i_45_, boolean bool);

    final void method3141(Node_Sub42 class248_sub42, int[] is) {
        aClass293_4870.method3109(class248_sub42, -94);
        V(class248_sub42.hashCode(), class248_sub42.method2620(97), class248_sub42.method2624(-22096), class248_sub42.method2625((byte) -108), class248_sub42.method2628(-75), class248_sub42.method2626(false), is);
    }

    private final native void ga(oa var_oa, ya var_ya, int i, int i_46_, int[][] is, int[][] is_47_, int i_48_, int i_49_, int i_50_);

    final void method3140(int i, int i_51_, int[] is, int[] is_52_, int[] is_53_, int[] is_54_, int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int[] is_61_, int i_62_, int i_63_, int i_64_, boolean bool) {
        boolean bool_65_ = false;
        if (is_58_ != null) {
            int[] is_66_ = is_58_;
            for (int i_67_ = 0; i_67_ < is_66_.length; i_67_++) {
                int i_68_ = is_66_[i_67_];
                if (i_68_ != -1) {
                    bool_65_ = true;
                    break;
                }
            }
        }
        int i_69_ = is_58_.length;
        int[] is_70_ = new int[i_69_ * 3];
        int[] is_71_ = new int[i_69_ * 3];
        int[] is_72_ = new int[i_69_ * 3];
        int[] is_73_ = new int[i_69_ * 3];
        int[] is_74_ = new int[i_69_ * 3];
        int[] is_75_ = is_59_ != null ? new int[i_69_ * 3] : null;
        int[] is_76_ = is_52_ != null ? new int[i_69_ * 3] : null;
        int[] is_77_ = is_54_ != null ? new int[i_69_ * 3] : null;
        int i_78_ = 0;
        for (int i_79_ = 0; i_79_ < i_69_; i_79_++) {
            int i_80_ = is_55_[i_79_];
            int i_81_ = is_56_[i_79_];
            int i_82_ = is_57_[i_79_];
            is_70_[i_78_] = is[i_80_];
            is_71_[i_78_] = is_53_[i_80_];
            is_72_[i_78_] = is_58_[i_79_];
            is_73_[i_78_] = is_60_[i_79_];
            is_74_[i_78_] = is_61_[i_79_];
            if (is_59_ != null)
                is_75_[i_78_] = is_59_[i_79_];
            if (is_52_ != null)
                is_76_[i_78_] = is_52_[i_80_];
            if (is_54_ != null)
                is_77_[i_78_] = is_54_[i_80_];
            i_78_++;
            is_70_[i_78_] = is[i_81_];
            is_71_[i_78_] = is_53_[i_81_];
            is_72_[i_78_] = is_58_[i_79_];
            is_73_[i_78_] = is_60_[i_79_];
            is_74_[i_78_] = is_61_[i_79_];
            if (is_59_ != null)
                is_75_[i_78_] = is_59_[i_79_];
            if (is_52_ != null)
                is_76_[i_78_] = is_52_[i_81_];
            if (is_54_ != null)
                is_77_[i_78_] = is_54_[i_81_];
            i_78_++;
            is_70_[i_78_] = is[i_82_];
            is_71_[i_78_] = is_53_[i_82_];
            is_72_[i_78_] = is_58_[i_79_];
            is_73_[i_78_] = is_60_[i_79_];
            is_74_[i_78_] = is_61_[i_79_];
            if (is_59_ != null)
                is_75_[i_78_] = is_59_[i_79_];
            if (is_52_ != null)
                is_76_[i_78_] = is_52_[i_82_];
            if (is_54_ != null)
                is_77_[i_78_] = is_54_[i_82_];
            i_78_++;
        }
        if (bool_65_ || is_75_ != null)
            U(i, i_51_, is_70_, is_76_, is_71_, is_77_, is_72_, is_75_, is_73_, is_74_, i_62_, i_63_, i_64_, bool);
    }

    final native r fa(int i, int i_83_, r var_r);

    t(oa var_oa, ya var_ya, int i, int i_84_, int[][] is, int[][] is_85_, int i_86_, int i_87_, int i_88_) {
        super(i, i_84_, i_86_, is);
        anOa4869 = var_oa;
        ga(anOa4869, var_ya, i, i_84_, ((s) this).anIntArrayArray3464, is_85_, i_86_, i_87_, i_88_);
    }

    private final native void V(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int[] is);
}
