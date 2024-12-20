/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class147 {
    static int anInt1732;
    int anInt1733;
    static short[] aShortArray1734 = new short[256];
    static int anInt1735;
    static int anInt1736;
    int anInt1737;
    static Class280 aClass280_1738 = new Class280();
    static int anInt1739;
    static OutgoingOpcode aOutgoingOpcode_1740 = new OutgoingOpcode(48, 3);
    static int anInt1741;
    int anInt1742;

    public static void method1312(int i) {
        aShortArray1734 = null;
        aOutgoingOpcode_1740 = null;
        aClass280_1738 = null;
        if (i != 0)
            aClass280_1738 = null;
    }

    static final void method1313(int i) {
        Class282_Sub25.aHa7855.a(Class365.aFloat4480, Class282_Sub24.aFloat7839, Class136_Sub3.aFloat8401);
        int i_0_ = 10 / ((i - 50) / 60);
        anInt1735++;
    }

    final boolean method1314(boolean bool) {
        anInt1739++;
        if (bool != true)
            return true;
        if ((((Class147) this).anInt1733 & 0x4) == 0)
            return false;
        return true;
    }

    final boolean method1315(int i) {
        if (i != 0)
            ((Class147) this).anInt1733 = -50;
        anInt1741++;
        if ((((Class147) this).anInt1733 & 0x2) == 0)
            return false;
        return true;
    }

    final boolean method1316(int i) {
        anInt1732++;
        if (i <= 13)
            method1313(76);
        if ((((Class147) this).anInt1733 & 0x8) == 0)
            return false;
        return true;
    }

    final boolean method1317(int i) {
        anInt1736++;
        if (i != 1)
            aShortArray1734 = null;
        if ((0x1 & ((Class147) this).anInt1733 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public Class147() {
        /* empty */
    }
}
