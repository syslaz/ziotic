/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class40 {
    int anInt439;
    int anInt440;
    int anInt441;
    static int[][] anIntArrayArray442;
    static int anInt443;
    static int anInt444;
    static int anInt445;
    int anInt446;
    int anInt447;
    Class40 aClass40_448;
    static int anInt449;
    static int anInt450 = 0;
    int anInt451;
    int anInt452;
    int anInt453;
    private int anInt454;
    int anInt455;
    int anInt456;
    int anInt457;
    int anInt458;
    static int[] anIntArray459;
    byte aByte460;

    final Class90 method296(boolean bool) {
        if (bool != false)
            return null;
        anInt444++;
        return Class352.method3749(anInt454, -11836);
    }

    public static void method297(byte i) {
        anIntArrayArray442 = null;
        if (i != 49)
            anInt450 = -37;
        anIntArray459 = null;
    }

    static final boolean method298(int i, int i_0_, int i_1_) {
        anInt449++;
        if (i_1_ <= 121)
            anIntArrayArray442 = null;
        if ((0x800 & i ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    static final short[] method299(short[] is, int i, boolean bool) {
        anInt445++;
        short[] is_2_ = new short[i];
        if (bool != true)
            method298(-90, -96, -88);
        Class159.method1404(is, 0, is_2_, 0, i);
        return is_2_;
    }

    final Class40 method300(int i, int i_3_, int i_4_, int i_5_) {
        anInt443++;
        if (i != 1)
            method300(85, -12, 8, -96);
        return new Class40(anInt454, i_5_, i_3_, i_4_, ((Class40) this).aByte460);
    }

    Class40(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
        ((Class40) this).anInt456 = i_8_;
        ((Class40) this).anInt451 = i_7_;
        anInt454 = i;
        ((Class40) this).anInt446 = i_6_;
        ((Class40) this).aByte460 = i_9_;
    }

    static {
        anIntArrayArray442 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
        anIntArray459 = new int[256];
    }
}
