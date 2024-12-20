/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class60 {
    static int anInt819;
    static int anInt820;
    static Class5 aClass5_821 = new Class5();
    static int anInt822;

    public static void method469(int i) {
        if (i == -30352)
            aClass5_821 = null;
    }

    static final aa_Sub3 method470(int[] is, int i, ha_Sub3 var_ha_Sub3, int i_0_, int[] is_1_, int i_2_) {
        if (i != 0)
            aClass5_821 = null;
        anInt822++;
        if (var_ha_Sub3.method933(i ^ ~0xc2e, Class228.aClass228_2573, Class130.aClass264_1573)) {
            byte[] is_3_ = new byte[i_2_ * i_0_];
            for (int i_4_ = 0; (i_2_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                int i_5_ = i_0_ * i_4_ - -is[i_4_];
                for (int i_6_ = 0; is_1_[i_4_] > i_6_; i_6_++)
                    is_3_[i_5_++] = (byte) -1;
            }
            return new aa_Sub3(var_ha_Sub3, i_0_, i_2_, is_3_);
        }
        int[] is_7_ = new int[i_2_ * i_0_];
        for (int i_8_ = 0; i_2_ > i_8_; i_8_++) {
            int i_9_ = is[i_8_] + i_8_ * i_0_;
            for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (is_1_[i_8_] ^ 0xffffffff); i_10_++)
                is_7_[i_9_++] = -16777216;
        }
        return new aa_Sub3(var_ha_Sub3, i_0_, i_2_, is_7_);
    }

    static final void method471(boolean bool, byte i, RSInterface2 class354) {
        anInt819++;
        int i_11_ = ((((RSInterface2) class354).anInt4374 ^ 0xffffffff) == -1 ? ((RSInterface2) class354).anInt4332 : ((RSInterface2) class354).anInt4374);
        int i_12_ = (((RSInterface2) class354).anInt4345 == 0 ? ((RSInterface2) class354).anInt4223 : ((RSInterface2) class354).anInt4345);
        if (i != 100)
            aClass5_821 = null;
        Class289.method3087(((RSInterface2) class354).interfaceValues, (Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[((RSInterface2) class354).interfaceValues >> -700376624]), bool, i_11_, (byte) 90, i_12_);
        if (((RSInterface2) class354).aClass354Array4285 != null)
            Class289.method3087(((RSInterface2) class354).interfaceValues, ((RSInterface2) class354).aClass354Array4285, bool, i_11_, (byte) 90, i_12_);
        Node_Sub12 class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method501((long) (((RSInterface2) class354).interfaceValues), (byte) 31));
        if (class248_sub12 != null)
            Animable.method3601(32280, (((Node_Sub12) class248_sub12).anInt6964), i_11_, i_12_, bool);
    }

    static final void method472(int i) {
        anInt820++;
        for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -101; i_13_++)
            Class359.aBooleanArray4435[i_13_] = true;
        if (i != -101)
            method472(-28);
    }
}
