/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class188 {
    static int anInt2181;
    private ha_Sub3_Sub1 aHa_Sub3_Sub1_2182;
    static int anInt2183;
    static int anInt2184;
    static int anInt2185;
    static OutgoingOpcode aOutgoingOpcode_2186 = new OutgoingOpcode(62, 8);
    long aLong2187;
    static volatile Object anObject2188 = null;
    static int[] anIntArray2189 = null;
    static String[] aStringArray2190;

    static final boolean method1633(byte i, int i_0_) {
        if (i != -14)
            return false;
        anInt2183++;
        if ((i_0_ ^ 0xffffffff) != -8 && i_0_ != 8 && (i_0_ ^ 0xffffffff) != -10)
            return false;
        return true;
    }

    protected final void finalize() throws Throwable {
        anInt2181++;
        aHa_Sub3_Sub1_2182.method1058((byte) -100, ((Class188) this).aLong2187);
        super.finalize();
    }

    static final void method1634(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool) {
        if (bool != true)
            method1635(2, -30, -72);
        anInt2185++;
        if ((i_1_ ^ 0xffffffff) != -9 && (i_1_ ^ 0xffffffff) != -17) {
            Class137 class137 = Class311.aClass137ArrayArrayArray3620[i_5_][i_2_][i_3_];
            if (class137 == null)
                class137 = new Class137(i_5_);
            if (i_1_ == 1) {
                ((Class137) class137).aShort1650 = (short) i;
                ((Class137) class137).aShort1638 = (short) i_4_;
            } else if (i_1_ == 2) {
                ((Class137) class137).aShort1639 = (short) i_4_;
                ((Class137) class137).aShort1640 = (short) i;
            }
            if (Node_Sub8_Sub2.aBoolean8914)
                Class34.method275(true);
        } else if ((i_1_ ^ 0xffffffff) == -9) {
            int i_6_ = i_2_ << Class96.anInt1249;
            int i_7_ = Class241.anInt2692 + i_6_;
            int i_8_ = i_3_ << Class96.anInt1249;
            int i_9_ = i_8_ - -Class241.anInt2692;
            int i_10_ = Node_Sub14_Sub29.aSArray9471[i_5_].method3145(i_2_, 103, i_3_);
            int i_11_ = Node_Sub14_Sub29.aSArray9471[i_5_].method3145(i_2_ + 1, 110, i_3_ + 1);
            Class135.aClass2Array1634[Player.anInt10584++] = new Class2(i_1_, i_5_, i_6_, i_7_, i_7_, i_6_, i_10_, i_11_, -i_4_ + i_11_, i_10_ + -i_4_, i_8_, i_9_, i_9_, i_8_);
        } else {
            int i_12_ = Class241.anInt2692 + (i_2_ << Class96.anInt1249);
            int i_13_ = -Class241.anInt2692 + i_12_;
            int i_14_ = i_3_ << Class96.anInt1249;
            int i_15_ = i_14_ - -Class241.anInt2692;
            int i_16_ = Node_Sub14_Sub29.aSArray9471[i_5_].method3145(i_2_ - -1, 48, i_3_);
            int i_17_ = Node_Sub14_Sub29.aSArray9471[i_5_].method3145(i_2_, 50, 1 + i_3_);
            Class135.aClass2Array1634[Player.anInt10584++] = new Class2(i_1_, i_5_, i_12_, i_13_, i_13_, i_12_, i_16_, i_17_, -i_4_ + i_17_, i_16_ + -i_4_, i_14_, i_15_, i_15_, i_14_);
        }
    }

    static final RSInterface2 method1635(int i, int i_18_, int i_19_) {
        anInt2184++;
        RSInterface2 class354 = Class276.method2853(65535, i);
        if (i_19_ == (i_18_ ^ 0xffffffff))
            return class354;
        if (class354 == null || ((RSInterface2) class354).aClass354Array4285 == null || ((((RSInterface2) class354).aClass354Array4285.length ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)))
            return null;
        return ((RSInterface2) class354).aClass354Array4285[i_18_];
    }

    public static void method1636(boolean bool) {
        anObject2188 = null;
        aOutgoingOpcode_2186 = null;
        if (bool == true) {
            anIntArray2189 = null;
            aStringArray2190 = null;
        }
    }

    Class188(ha_Sub3_Sub1 var_ha_Sub3_Sub1, long l, int i) {
        ((Class188) this).aLong2187 = l;
        aHa_Sub3_Sub1_2182 = var_ha_Sub3_Sub1;
    }
}
