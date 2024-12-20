/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class273 implements Interface11 {
    static int anInt5003;
    static Class381 aClass381_5004;
    static int anInt5005;
    int anInt5006;
    static Interactable[] aInteractableArray5007;
    static int anInt5008 = 0;

    static final int method2839(int i, String string) {
        if (i != 2)
            return -59;
        anInt5003++;
        return 2 + string.length();
    }

    public final Class208 method35(byte i) {
        anInt5005++;
        if (i != 62)
            return null;
        return Class169.aClass208_1973;
    }

    public static void method2840(boolean bool) {
        if (bool != true)
            method2840(false);
        aClass381_5004 = null;
        aInteractableArray5007 = null;
    }

    Class273(int i) {
        ((Class273) this).anInt5006 = i;
    }
}
