/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class287 {
    static ha aHa3381;
    static String aString3382 = null;
    private ha_Sub2 aHa_Sub2_3383;
    static int anInt3384;
    static int anInt3385;
    static int[] anIntArray3386 = {1, -1, -1, 1};
    static int anInt3387;
    int anInt3388;

    protected final void finalize() throws Throwable {
        aHa_Sub2_3383.method847(((Class287) this).anInt3388, (byte) -51);
        anInt3385++;
        super.finalize();
    }

    public static void method3077(int i) {
        aHa3381 = null;
        aString3382 = null;
        if (i > -111)
            method3078(-97);
        anIntArray3386 = null;
    }

    static final void method3078(int i) {
        Class34.method275(true);
        if (i == -11017)
            anInt3387++;
    }

    Class287(ha_Sub2 var_ha_Sub2, int i, int i_0_) {
        ((Class287) this).anInt3388 = i_0_;
        aHa_Sub2_3383 = var_ha_Sub2;
    }
}
