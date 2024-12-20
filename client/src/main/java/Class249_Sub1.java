/* Class249_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class249_Sub1 extends Class249 implements Interface1 {
    static int anInt4711;
    static int anInt4712;
    static int anInt4713;
    static int anInt4714;
    static int anInt4715;
    static int anInt4716;
    static int anInt4717;
    private int anInt4718;
    static int anInt4719;

    public final void method7(int i, int i_0_, int i_1_, byte[] is) {
        this.method2697(i, is, 0);
        anInt4719++;
        anInt4718 = i_1_;
        if (i_0_ != 20218)
            method2695((byte) -49);
    }

    public final long method6(int i) {
        anInt4714++;
        if (i != -4468)
            anInt4718 = -58;
        return 0L;
    }

    final void method2695(byte i) {
        anInt4712++;
        int i_2_ = -35 / ((-2 - i) / 59);
        ((Class249) this).aHa_Sub2_2816.method904((byte) 82, this);
    }

    static final boolean method2700(int i) {
        anInt4715++;
        Node_Sub38 class248_sub38 = ((Node_Sub38) Node_Sub8_Sub2.aClass293_8915.method3119(i ^ 0x2));
        if (class248_sub38 == null)
            return false;
        for (int i_3_ = i; i_3_ < ((Node_Sub38) class248_sub38).anInt7272; i_3_++) {
            if ((((Node_Sub38) class248_sub38).aClass322Array7267[i_3_] != null) && (((Node_Sub38) class248_sub38).aClass322Array7267[i_3_].anInt3788) == 0)
                return false;
            if ((((Node_Sub38) class248_sub38).aClass322Array7268[i_3_] != null) && (((Node_Sub38) class248_sub38).aClass322Array7268[i_3_].anInt3788) == 0)
                return false;
        }
        return true;
    }

    public final int method8(byte i) {
        if (i <= 13)
            method6(-10);
        anInt4711++;
        return anInt4718;
    }

    Class249_Sub1(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_4_, boolean bool) {
        super(var_ha_Sub2, 34963, is, i_4_, bool);
        anInt4718 = i;
    }

    public final int method9(boolean bool) {
        if (bool != false)
            return -1;
        anInt4716++;
        return ((Class249) this).anInt2804;
    }

    static final String method2701(RSInterface2 class354, byte i, int i_5_) {
        if (i != 94)
            return null;
        anInt4713++;
        if (!client.method113(class354).method2670(i_5_, 3) && ((RSInterface2) class354).onButton_Parameters == null)
            return null;
        if (((RSInterface2) class354).aStringArray4375 == null || ((i_5_ ^ 0xffffffff) <= (((RSInterface2) class354).aStringArray4375.length ^ 0xffffffff)) || ((RSInterface2) class354).aStringArray4375[i_5_] == null || (((RSInterface2) class354).aStringArray4375[i_5_].trim().length() == 0)) {
            if (Class332.aBoolean3874)
                return "Hidden-" + i_5_;
            return null;
        }
        return ((RSInterface2) class354).aStringArray4375[i_5_];
    }
}
