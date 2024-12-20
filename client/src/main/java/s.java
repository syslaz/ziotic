/* s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

abstract class s {
    static int anInt3462;
    static int anInt3463;
    int[][] anIntArrayArray3464;
    int anInt3465;
    int anInt3466;
    static Class264 aClass264_3467 = new Class264(3);
    int anInt3468;
    static int anInt3469;
    static int anInt3470;
    static Class48 aClass48_3471;
    int anInt3472;

    abstract void method3140(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int i_11_, int i_12_, int i_13_, boolean bool);

    abstract void U(int i, int i_14_, int[] is, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int i_22_, int i_23_, int i_24_, boolean bool);

    abstract void method3141(Node_Sub42 class248_sub42, int[] is);

    abstract void YA();

    abstract void method3142(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, boolean[][] bools);

    abstract void CA(r var_r, int i, int i_31_, int i_32_, int i_33_, boolean bool);

    abstract boolean method3143(r var_r, int i, int i_34_, int i_35_, int i_36_, boolean bool);

    abstract void method3144(int i, int i_37_, int i_38_, boolean[][] bools, boolean bool, int i_39_, int i_40_);

    final int method3145(int i, int i_41_, int i_42_) {
        anInt3462++;
        if (i_41_ < 39)
            return 20;
        return ((s) this).anIntArrayArray3464[i][i_42_];
    }

    static final ha method3146(int i, int i_43_, Canvas canvas, byte i_44_, d var_d) {
        if (i_44_ > -7)
            return null;
        anInt3469++;
        return new oa(canvas, var_d, i, i_43_);
    }

    abstract void ka(int i, int i_45_, int i_46_);

    public static void method3147(int i) {
        aClass264_3467 = null;
        if (i != -1)
            aClass264_3467 = null;
        aClass48_3471 = null;
    }

    abstract r fa(int i, int i_47_, r var_r);

    abstract void method3148(int i, int i_48_);

    abstract void wa(r var_r, int i, int i_49_, int i_50_, int i_51_, boolean bool);

    abstract void method3149(int i, int i_52_, int i_53_, boolean[][] bools, boolean bool, int i_54_);

    final int method3150(byte i, int i_55_, int i_56_) {
        anInt3463++;
        int i_57_ = i_55_ >> ((s) this).anInt3466;
        int i_58_ = i_56_ >> ((s) this).anInt3466;
        if ((i_57_ ^ 0xffffffff) > -1 || i_58_ < 0 || (-1 + ((s) this).anInt3468 ^ 0xffffffff) > (i_57_ ^ 0xffffffff) || (i_58_ ^ 0xffffffff) < (((s) this).anInt3472 - 1 ^ 0xffffffff))
            return 0;
        int i_59_ = i_55_ & -1 + ((s) this).anInt3465;
        if (i <= 94)
            return 42;
        int i_60_ = i_56_ & -1 + ((s) this).anInt3465;
        int i_61_ = ((i_59_ * ((s) this).anIntArrayArray3464[1 + i_57_][i_58_] + (((s) this).anIntArrayArray3464[i_57_][i_58_] * (-i_59_ + ((s) this).anInt3465))) >> ((s) this).anInt3466);
        int i_62_ = ((((s) this).anIntArrayArray3464[i_57_ + 1][i_58_ + 1] * i_59_ + (((s) this).anIntArrayArray3464[i_57_][i_58_ - -1] * (((s) this).anInt3465 - i_59_))) >> ((s) this).anInt3466);
        return ((((s) this).anInt3465 + -i_60_) * i_61_ - -(i_62_ * i_60_) >> ((s) this).anInt3466);
    }

    s(int i, int i_63_, int i_64_, int[][] is) {
        ((s) this).anInt3468 = i;
        ((s) this).anInt3472 = i_63_;
        int i_65_ = 0;
        while (i_64_ > 1) {
            i_64_ >>= 1;
            i_65_++;
        }
        ((s) this).anInt3465 = 1 << i_65_;
        ((s) this).anInt3466 = i_65_;
        ((s) this).anIntArrayArray3464 = is;
    }
}
