/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class221 {
    static int anInt2530;
    long aLong2531;
    static int anInt2532;
    static Class181 aClass181_2533 = new Class181();
    private ha_Sub2 aHa_Sub2_2534;
    static int anInt2535 = 0;
    static Class381 aClass381_2536;
    static int anInt2537 = 0;

    protected final void finalize() throws Throwable {
        anInt2530++;
        aHa_Sub2_2534.method846(((Class221) this).aLong2531, true);
        super.finalize();
    }

    public static void method1765(boolean bool) {
        aClass181_2533 = null;
        if (bool != true)
            aClass381_2536 = null;
        aClass381_2536 = null;
    }

    static final boolean method1766(int i, byte i_0_) {
        if (i_0_ <= 91)
            anInt2537 = 21;
        anInt2532++;
        if (i != 7 && i != 9)
            return false;
        return true;
    }

    Class221(ha_Sub2 var_ha_Sub2, long l, Class29[] class29s) {
        ((Class221) this).aLong2531 = l;
        aHa_Sub2_2534 = var_ha_Sub2;
    }
}
