/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class123 {
    private static boolean aBoolean1526;
    private static int anInt1527 = 0;
    private static Class293 aClass293_1528;

    static final synchronized void method1132(boolean bool, int i) {
        if (i <= 47)
            method1134(11);
        aBoolean1526 = bool;
    }

    static final synchronized void method1133(boolean bool) {
        if (bool != false)
            aClass293_1528 = null;
        for (; ; ) {
            Node_Sub16 class248_sub16 = (Node_Sub16) aClass293_1528.method3108(false);
            if (class248_sub16 == null)
                break;
            ((Node_Sub16) class248_sub16).anInterface8_6998.w(true);
            class248_sub16.remove(true);
        }
    }

    static final synchronized void method1134(int i) {
        anInt1527++;
        if (i != -1)
            aBoolean1526 = true;
    }

    static final synchronized void method1135(int i) {
        if (i != -26583)
            anInt1527 = 61;
        anInt1527--;
        if ((anInt1527 ^ 0xffffffff) == -1)
            method1133(false);
    }

    static final synchronized void method1136(Interface8 interface8, byte i) {
        if (!aBoolean1526) {
            if ((anInt1527 ^ 0xffffffff) < -1) {
                Node_Sub16 class248_sub16 = new Node_Sub16();
                ((Node_Sub16) class248_sub16).anInterface8_6998 = interface8;
                aClass293_1528.method3109(class248_sub16, -95);
            } else
                interface8.w(false);
            int i_0_ = -16 / ((-16 - i) / 41);
        }
    }

    static {
        aBoolean1526 = false;
        aClass293_1528 = new Class293();
    }
}
