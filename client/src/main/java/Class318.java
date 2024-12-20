/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318 {
    static int anInt3678;
    static int anInt3679;
    static int anInt3680;
    static int anInt3681;
    static Class65 aClass65_3682 = new Class65(512);

    static final int method3310(int i) {
        anInt3679++;
        if (i >= -90)
            method3310(-108);
        return 16;
    }

    static final String method3311(String string, int i) {
        if (i != -1)
            method3311(null, -71);
        anInt3678++;
        String string_0_ = Class34.method279((byte) -104, Class346_Sub7_Sub1_Sub2.method3591(i + -16336, string));
        if (string_0_ == null)
            string_0_ = "";
        return string_0_;
    }

    public static void method3312(int i) {
        aClass65_3682 = null;
        if (i != 16)
            aClass65_3682 = null;
    }

    static final void method3313(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt3681++;
        int i_8_ = 0;
        int i_9_ = i_1_;
        int i_10_ = 0;
        int i_11_ = -i_3_ + i;
        int i_12_ = i_1_ - i_3_;
        int i_13_ = i * i;
        int i_14_ = i_1_ * i_1_;
        int i_15_ = i_11_ * i_11_;
        int i_16_ = i_12_ * i_12_;
        int i_17_ = i_14_ << -131344639;
        int i_18_ = i_13_ << 960053025;
        int i_19_ = i_16_ << 797424321;
        int i_20_ = i_15_ << 843889729;
        int i_21_ = i_1_ << -78482815;
        int i_22_ = i_12_ << -409074175;
        int i_23_ = i_13_ * (1 - i_21_) + i_17_;
        int i_24_ = -((-1 + i_21_) * i_18_) + i_14_;
        int i_25_ = i_19_ + (-i_22_ + 1) * i_15_;
        int i_26_ = i_16_ + -((-1 + i_22_) * i_20_);
        int i_27_ = i_13_ << 1531272834;
        int i_28_ = i_14_ << -1573799326;
        int i_29_ = i_15_ << 692600194;
        int i_30_ = i_16_ << -1223634846;
        int i_31_ = 3 * i_17_;
        int i_32_ = i_18_ * (-3 + i_21_);
        int i_33_ = i_19_ * 3;
        if (i_7_ != -8930)
            aClass65_3682 = null;
        int i_34_ = i_20_ * (i_22_ + -3);
        int i_35_ = i_28_;
        int i_36_ = (i_1_ + -1) * i_27_;
        int i_37_ = i_30_;
        int i_38_ = i_29_ * (i_12_ + -1);
        int[] is = Class156.anIntArrayArray1867[i_6_];
        Class149.method1331(i_2_, -95, -i + i_5_, is, i_5_ + -i_11_);
        Class149.method1331(i_4_, -76, i_5_ - i_11_, is, i_11_ + i_5_);
        Class149.method1331(i_2_, -123, i_11_ + i_5_, is, i + i_5_);
        while ((i_9_ ^ 0xffffffff) < -1) {
            boolean bool = (i_9_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff);
            if (bool) {
                if ((i_25_ ^ 0xffffffff) > -1) {
                    while (i_25_ < 0) {
                        i_26_ += i_37_;
                        i_25_ += i_33_;
                        i_10_++;
                        i_37_ += i_30_;
                        i_33_ += i_30_;
                    }
                }
                if ((i_26_ ^ 0xffffffff) > -1) {
                    i_25_ += i_33_;
                    i_26_ += i_37_;
                    i_37_ += i_30_;
                    i_33_ += i_30_;
                    i_10_++;
                }
                i_25_ += -i_38_;
                i_26_ += -i_34_;
                i_38_ -= i_29_;
                i_34_ -= i_29_;
            }
            if (i_23_ < 0) {
                while ((i_23_ ^ 0xffffffff) > -1) {
                    i_24_ += i_35_;
                    i_23_ += i_31_;
                    i_35_ += i_28_;
                    i_31_ += i_28_;
                    i_8_++;
                }
            }
            if ((i_24_ ^ 0xffffffff) > -1) {
                i_24_ += i_35_;
                i_23_ += i_31_;
                i_8_++;
                i_31_ += i_28_;
                i_35_ += i_28_;
            }
            i_24_ += -i_32_;
            i_23_ += -i_36_;
            i_32_ -= i_27_;
            i_9_--;
            i_36_ -= i_27_;
            int i_39_ = i_6_ + -i_9_;
            int i_40_ = i_9_ + i_6_;
            int i_41_ = i_8_ + i_5_;
            int i_42_ = i_5_ + -i_8_;
            if (bool) {
                int i_43_ = i_5_ - -i_10_;
                int i_44_ = i_5_ + -i_10_;
                Class149.method1331(i_2_, -53, i_42_, Class156.anIntArrayArray1867[i_39_], i_44_);
                Class149.method1331(i_4_, -65, i_44_, Class156.anIntArrayArray1867[i_39_], i_43_);
                Class149.method1331(i_2_, -87, i_43_, Class156.anIntArrayArray1867[i_39_], i_41_);
                Class149.method1331(i_2_, -52, i_42_, Class156.anIntArrayArray1867[i_40_], i_44_);
                Class149.method1331(i_4_, -54, i_44_, Class156.anIntArrayArray1867[i_40_], i_43_);
                Class149.method1331(i_2_, -125, i_43_, Class156.anIntArrayArray1867[i_40_], i_41_);
            } else {
                Class149.method1331(i_2_, i_7_ + 8882, i_42_, Class156.anIntArrayArray1867[i_39_], i_41_);
                Class149.method1331(i_2_, -105, i_42_, Class156.anIntArrayArray1867[i_40_], i_41_);
            }
        }
    }

    static final boolean method3314(int i, boolean bool) {
        if (bool != true)
            aClass65_3682 = null;
        anInt3680++;
        if (i != 0 && i != 2)
            return false;
        return true;
    }
}
