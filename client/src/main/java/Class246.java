/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246 {
    int[] anIntArray2755 = new int[257];
    int anInt2756;
    static Class79 aClass79_2757 = new Class79("RC", 1);
    byte aByte2758;
    int anInt2759;
    int anInt2760;
    int[][] anIntArrayArray2761 = new int[6][258];
    int[] anIntArray2762;
    int[][] anIntArrayArray2763 = new int[6][258];
    int[][] anIntArrayArray2764;
    boolean[] aBooleanArray2765 = new boolean[256];
    int anInt2766;
    int anInt2767;
    int anInt2768;
    int anInt2769;
    int anInt2770;
    int[] anIntArray2771;
    int anInt2772;
    static int anInt2773;
    int anInt2774;
    static int anInt2775;
    boolean[] aBooleanArray2776;
    int anInt2777;
    static Class381 aClass381_2778;
    byte[] aByteArray2779;
    byte[] aByteArray2780;
    int anInt2781;
    byte[] aByteArray2782;
    byte[] aByteArray2783;
    byte[][] aByteArrayArray2784;
    int anInt2785;
    int anInt2786;
    int anInt2787;
    int[] anIntArray2788;
    byte[] aByteArray2789;
    byte[] aByteArray2790;

    static final void method1960(int i) {
        if (Class252.aFileOutputStream2840 != null) {
            try {
                Class252.aFileOutputStream2840.close();
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        anInt2775++;
        Class252.aFileOutputStream2840 = null;
        if (i != -28975)
            aClass79_2757 = null;
    }

    static final boolean method1961(int i, int i_0_, int i_1_) {
        if (i_0_ != 0)
            method1962(-2);
        anInt2773++;
        if ((i & 0x84080) == 0)
            return false;
        return true;
    }

    public static void method1962(int i) {
        if (i <= 39)
            method1960(111);
        aClass79_2757 = null;
        aClass381_2778 = null;
    }

    Class246() {
        ((Class246) this).anIntArray2762 = new int[256];
        ((Class246) this).anIntArrayArray2764 = new int[6][258];
        ((Class246) this).aBooleanArray2776 = new boolean[16];
        ((Class246) this).anInt2760 = 0;
        ((Class246) this).aByteArray2782 = new byte[18002];
        ((Class246) this).aByteArrayArray2784 = new byte[6][258];
        ((Class246) this).aByteArray2780 = new byte[4096];
        ((Class246) this).anInt2787 = 0;
        ((Class246) this).anIntArray2771 = new int[16];
        ((Class246) this).anIntArray2788 = new int[6];
        ((Class246) this).aByteArray2783 = new byte[256];
        ((Class246) this).aByteArray2790 = new byte[18002];
    }
}
