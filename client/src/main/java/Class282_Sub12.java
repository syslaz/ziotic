/* Class282_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class282_Sub12 extends Class282 {
    static int anInt7707;
    static int anInt7708;
    static int anInt7709;
    static int anInt7710;
    static int anInt7711;
    static Class186 aClass186_7712 = new Class186();
    static int anInt7713;
    static Class281 aClass281_7714 = new Class281();
    static int anInt7715 = 0;

    Class282_Sub12(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    final void method2922(boolean bool, int i) {
        if (bool == true) {
            ((Class282) this).anInt3320 = i;
            anInt7707++;
        }
    }

    static final void method2966(byte i) {
        anInt7711++;
        if (!Class162_Sub2.aBoolean6483 && i == -90) {
            Class325.aFloat3829 += (12.0F - Class325.aFloat3829) / 2.0F;
            Class207.aBoolean2398 = true;
            Class162_Sub2.aBoolean6483 = true;
        }
    }

    final int method2919(boolean bool) {
        if (bool != false)
            aClass281_7714 = null;
        anInt7713++;
        return 0;
    }

    final int method2917(int i, int i_0_) {
        anInt7709++;
        if (i != 0)
            aClass281_7714 = null;
        return 1;
    }

    final void method2918(byte i) {
        if (((Class282) this).anInt3320 != 1 && (((Class282) this).anInt3320 ^ 0xffffffff) != -1)
            ((Class282) this).anInt3320 = method2919(false);
        if (i != 98)
            aClass281_7714 = null;
        anInt7710++;
    }

    final int method2967(boolean bool) {
        anInt7708++;
        if (bool != true)
            anInt7715 = -68;
        return ((Class282) this).anInt3320;
    }

    Class282_Sub12(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    public static void method2968(int i) {
        aClass281_7714 = null;
        aClass186_7712 = null;
        if (i < 119)
            aClass186_7712 = null;
    }
}
