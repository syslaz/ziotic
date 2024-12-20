/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376 implements Interface10 {
    static float aFloat4940;
    static int anInt4941;
    static int anInt4942;
    private Class115 aClass115_4943;
    static int anInt4944 = -1;
    static int anInt4945;
    static int anInt4946;
    static int anInt4947;
    static int anInt4948;

    public final void method32(boolean bool, byte i) {
        if (bool)
            Class287.aHa3381.aa(0, 0, Class146.anInt1724, Class282_Sub20.anInt7800, ((Class115) aClass115_4943).anInt4956, 0);
        anInt4946++;
        if (i > -60)
            anInt4942 = -118;
    }

    public final void method34(byte i) {
        anInt4947++;
        if (i < 34)
            anInt4942 = 61;
    }

    static final void method3882(RSInterface2 class354, int i) {
        if (i == 2260) {
            if ((((RSInterface2) class354).anInt4366 ^ 0xffffffff) == (Class144.anInt1691 ^ 0xffffffff))
                Class359.aBooleanArray4435[((RSInterface2) class354).anInt4339] = true;
            anInt4941++;
        }
    }

    public final boolean method33(int i) {
        if (i != 5618)
            anInt4942 = 68;
        anInt4945++;
        return true;
    }

    Class376(Class115 class115) {
        aClass115_4943 = class115;
    }

    static {
        anInt4942 = 0;
    }
}
