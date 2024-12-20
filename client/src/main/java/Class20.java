/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class20 {
    static int anInt307;
    static Class360 aClass360_308 = new Class360();
    static int anInt309 = 0;

    static final boolean method231(int i, String string) {
        anInt307++;
        int i_0_ = -42 / ((71 - i) / 49);
        if (string == null)
            return false;
        for (int i_1_ = 0; Node_Sub2_Sub3.anInt8854 > i_1_; i_1_++) {
            if (string.equalsIgnoreCase(Class54_Sub2.aStringArray5334[i_1_]))
                return true;
            if (string.equalsIgnoreCase(Class54_Sub4.aStringArray5360[i_1_]))
                return true;
        }
        return false;
    }

    public static void method232(byte i) {
        if (i >= 92)
            aClass360_308 = null;
    }
}
