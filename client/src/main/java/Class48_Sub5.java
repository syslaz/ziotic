/* Class48_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48_Sub5 extends Class48 {
    private int[] anIntArray5314;
    private int[] anIntArray5315;
    private ha_Sub1 aHa_Sub1_5316;
    private byte[][] aByteArrayArray5317;
    private int[] anIntArray5318;
    private int[] anIntArray5319;

    final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
        i += anIntArray5315[c];
        i_0_ += anIntArray5319[c];
        int i_2_ = anIntArray5318[c];
        int i_3_ = anIntArray5314[c];
        int i_4_ = ((ha_Sub1) aHa_Sub1_5316).anInt5567;
        int i_5_ = i + i_0_ * i_4_;
        int i_6_ = i_4_ - i_2_;
        int i_7_ = 0;
        int i_8_ = 0;
        if (i_0_ < ((ha_Sub1) aHa_Sub1_5316).anInt5578) {
            int i_9_ = ((ha_Sub1) aHa_Sub1_5316).anInt5578 - i_0_;
            i_3_ -= i_9_;
            i_0_ = ((ha_Sub1) aHa_Sub1_5316).anInt5578;
            i_8_ += i_9_ * i_2_;
            i_5_ += i_9_ * i_4_;
        }
        if (i_0_ + i_3_ > ((ha_Sub1) aHa_Sub1_5316).anInt5582)
            i_3_ -= i_0_ + i_3_ - ((ha_Sub1) aHa_Sub1_5316).anInt5582;
        if (i < ((ha_Sub1) aHa_Sub1_5316).anInt5575) {
            int i_10_ = ((ha_Sub1) aHa_Sub1_5316).anInt5575 - i;
            i_2_ -= i_10_;
            i = ((ha_Sub1) aHa_Sub1_5316).anInt5575;
            i_8_ += i_10_;
            i_5_ += i_10_;
            i_7_ += i_10_;
            i_6_ += i_10_;
        }
        if (i + i_2_ > ((ha_Sub1) aHa_Sub1_5316).anInt5561) {
            int i_11_ = i + i_2_ - ((ha_Sub1) aHa_Sub1_5316).anInt5561;
            i_2_ -= i_11_;
            i_7_ += i_11_;
            i_6_ += i_11_;
        }
        if (i_2_ > 0 && i_3_ > 0)
            method385(aByteArrayArray5317[c], ((ha_Sub1) aHa_Sub1_5316).anIntArray5565, i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
    }

    Class48_Sub5(ha_Sub1 var_ha_Sub1, Class285 class285, Class157[] class157s, int[] is, int[] is_12_) {
        super(var_ha_Sub1, class285);
        aHa_Sub1_5316 = var_ha_Sub1;
        aHa_Sub1_5316 = var_ha_Sub1;
        anIntArray5318 = is;
        anIntArray5314 = is_12_;
        aByteArrayArray5317 = new byte[class157s.length][];
        anIntArray5319 = new int[class157s.length];
        anIntArray5315 = new int[class157s.length];
        for (int i = 0; i < class157s.length; i++) {
            Class157 class157 = class157s[i];
            if (((Class157) class157).aByteArray1875 != null)
                aByteArrayArray5317[i] = ((Class157) class157).aByteArray1875;
            else {
                byte[] is_13_ = ((Class157) class157).aByteArray1868;
                byte[] is_14_ = aByteArrayArray5317[i] = new byte[is_13_.length];
                for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
                    is_14_[i_15_] = (byte) (is_13_[i_15_] == 0 ? 0 : -1);
            }
            anIntArray5319[i] = ((Class157) class157).anInt1876;
            anIntArray5315[i] = ((Class157) class157).anInt1869;
        }
    }

    final void method359(char c, int i, int i_16_, int i_17_, boolean bool, aa var_aa, int i_18_, int i_19_) {
        if (var_aa == null)
            fa(c, i, i_16_, i_17_, bool);
        else {
            i += anIntArray5315[c];
            i_16_ += anIntArray5319[c];
            int i_20_ = anIntArray5318[c];
            int i_21_ = anIntArray5314[c];
            int i_22_ = ((ha_Sub1) aHa_Sub1_5316).anInt5567;
            int i_23_ = i + i_16_ * i_22_;
            int i_24_ = i_22_ - i_20_;
            int i_25_ = 0;
            int i_26_ = 0;
            if (i_16_ < ((ha_Sub1) aHa_Sub1_5316).anInt5578) {
                int i_27_ = ((ha_Sub1) aHa_Sub1_5316).anInt5578 - i_16_;
                i_21_ -= i_27_;
                i_16_ = ((ha_Sub1) aHa_Sub1_5316).anInt5578;
                i_26_ += i_27_ * i_20_;
                i_23_ += i_27_ * i_22_;
            }
            if (i_16_ + i_21_ > ((ha_Sub1) aHa_Sub1_5316).anInt5582)
                i_21_ -= i_16_ + i_21_ - ((ha_Sub1) aHa_Sub1_5316).anInt5582;
            if (i < ((ha_Sub1) aHa_Sub1_5316).anInt5575) {
                int i_28_ = ((ha_Sub1) aHa_Sub1_5316).anInt5575 - i;
                i_20_ -= i_28_;
                i = ((ha_Sub1) aHa_Sub1_5316).anInt5575;
                i_26_ += i_28_;
                i_23_ += i_28_;
                i_25_ += i_28_;
                i_24_ += i_28_;
            }
            if (i + i_20_ > ((ha_Sub1) aHa_Sub1_5316).anInt5561) {
                int i_29_ = i + i_20_ - ((ha_Sub1) aHa_Sub1_5316).anInt5561;
                i_20_ -= i_29_;
                i_25_ += i_29_;
                i_24_ += i_29_;
            }
            if (i_20_ > 0 && i_21_ > 0)
                method386(aByteArrayArray5317[c], ((ha_Sub1) aHa_Sub1_5316).anIntArray5565, i_17_, i_26_, i_23_, i_20_, i_21_, i_24_, i_25_, i, i_16_, anIntArray5318[c], var_aa, i_18_, i_19_);
        }
    }

    private final void method385(byte[] is, int[] is_30_, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
        for (int i_37_ = -i_34_; i_37_ < 0; i_37_++) {
            for (int i_38_ = -i_33_; i_38_ < 0; i_38_++) {
                int i_39_ = is[i_31_++] & 0xff;
                if (i_39_ != 0) {
                    int i_40_ = ((((i & 0xff00ff) * i_39_ & ~0xff00ff) + ((i & 0xff00) * i_39_ & 0xff0000)) >> 8);
                    i_39_ = 256 - i_39_;
                    int i_41_ = is_30_[i_32_];
                    is_30_[i_32_++] = ((((i_41_ & 0xff00ff) * i_39_ & ~0xff00ff) + ((i_41_ & 0xff00) * i_39_ & 0xff0000)) >> 8) + i_40_;
                } else
                    i_32_++;
            }
            i_32_ += i_35_;
            i_31_ += i_36_;
        }
    }

    private final void method386(byte[] is, int[] is_42_, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, aa var_aa, int i_52_, int i_53_) {
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        int[] is_54_ = ((aa_Sub1) var_aa_Sub1).anIntArray5252;
        int[] is_55_ = ((aa_Sub1) var_aa_Sub1).anIntArray5253;
        int i_56_ = i_49_ - ((ha_Sub1) aHa_Sub1_5316).anInt5575;
        int i_57_ = i_50_;
        if (i_53_ > i_57_) {
            i_57_ = i_53_;
            i_44_ += (i_53_ - i_50_) * ((ha_Sub1) aHa_Sub1_5316).anInt5567;
            i_43_ += (i_53_ - i_50_) * i_51_;
        }
        int i_58_ = (i_53_ + is_54_.length < i_50_ + i_46_ ? i_53_ + is_54_.length : i_50_ + i_46_);
        for (int i_59_ = i_57_; i_59_ < i_58_; i_59_++) {
            int i_60_ = is_54_[i_59_ - i_53_] + i_52_;
            int i_61_ = is_55_[i_59_ - i_53_];
            int i_62_ = i_45_;
            if (i_56_ > i_60_) {
                int i_63_ = i_56_ - i_60_;
                if (i_63_ >= i_61_) {
                    i_43_ += i_45_ + i_48_;
                    i_44_ += i_45_ + i_47_;
                    continue;
                }
                i_61_ -= i_63_;
            } else {
                int i_64_ = i_60_ - i_56_;
                if (i_64_ >= i_45_) {
                    i_43_ += i_45_ + i_48_;
                    i_44_ += i_45_ + i_47_;
                    continue;
                }
                i_43_ += i_64_;
                i_62_ -= i_64_;
                i_44_ += i_64_;
            }
            int i_65_ = 0;
            if (i_62_ < i_61_)
                i_61_ = i_62_;
            else
                i_65_ = i_62_ - i_61_;
            for (int i_66_ = -i_61_; i_66_ < 0; i_66_++) {
                int i_67_ = is[i_43_++] & 0xff;
                if (i_67_ != 0) {
                    int i_68_ = ((((i & 0xff00ff) * i_67_ & ~0xff00ff) + ((i & 0xff00) * i_67_ & 0xff0000)) >> 8);
                    i_67_ = 256 - i_67_;
                    int i_69_ = is_42_[i_44_];
                    is_42_[i_44_++] = ((((i_69_ & 0xff00ff) * i_67_ & ~0xff00ff) + ((i_69_ & 0xff00) * i_67_ & 0xff0000)) >> 8) + i_68_;
                } else
                    i_44_++;
            }
            i_43_ += i_65_ + i_48_;
            i_44_ += i_65_ + i_47_;
        }
    }
}
