/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256 {
    static Class339 aClass339_2930 = new Class339("WTI", "office", "_wti", 5);
    static int anInt2931;
    static int anInt2932;
    static Class186 aClass186_2933 = new Class186();
    static int anInt2934;

    static final boolean method2747(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt2931++;
        if (!Class346.aBoolean4120 || !WorldAddress.aBoolean1189)
            return false;
        if (Class346_Sub7_Sub4_Sub2.anInt10163 < i_3_)
            return false;
        if (!Class249.method2696((byte) -98, i_1_, i_2_, i))
            return false;
        int i_4_ = i_2_ << Class96.anInt1249;
        int i_5_ = i << Class96.anInt1249;
        if (Class226.method1803(Class241.anInt2692, i_0_, Class177.aSArray2070[i_1_].method3145(i_2_, i_3_ + -4, i), i_5_, i_4_, 25, Class241.anInt2692)) {
            Class69.anInt915++;
            return true;
        }
        return false;
    }

    public static void method2748(byte i) {
        aClass186_2933 = null;
        if (i == 60)
            aClass339_2930 = null;
    }

    static final void method2749(Class346_Sub10 class346_sub10, byte i) {
        ((Class346_Sub10) class346_sub10).aInteractable_8355 = null;
        anInt2934++;
        if (i != 31)
            aClass339_2930 = null;
        int i_6_ = ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353.length;
        for (int i_7_ = 0; i_6_ > i_7_; i_7_++)
            ((Class346_Sub9) (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[i_7_])).aBoolean8342 = false;
        synchronized (Class156.aClass360Array1847) {
            if (((Class156.aClass360Array1847.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) && Node_Sub8_Sub15.anIntArray9045[i_6_] < 200) {
                Class156.aClass360Array1847[i_6_].method3811(class346_sub10, 0);
                Node_Sub8_Sub15.anIntArray9045[i_6_]++;
            }
        }
    }
}
