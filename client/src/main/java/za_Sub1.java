/* za_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.heap.NativeHeap;

final class za_Sub1 extends za {
    static int anInt9796;
    static Class65 aClass65_9797;
    NativeHeap aNativeHeap9798;
    static boolean aBoolean9799 = false;
    static String[] aStringArray9800;
    static Class322 aClass322_9801;
    static int anInt9802;
    static long aLong9803;

    final void method2689(int i) {
        if (i >= -17)
            aClass65_9797 = null;
        ((za_Sub1) this).aNativeHeap9798.b();
        anInt9796++;
    }

    public static void method2690(int i) {
        aClass322_9801 = null;
        aClass65_9797 = null;
        aStringArray9800 = null;
        if (i != 26162)
            method2690(64);
    }

    za_Sub1(int i) {
        ((za_Sub1) this).aNativeHeap9798 = new NativeHeap(i);
    }

    static {
        aClass65_9797 = new Class65(8);
        aStringArray9800 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        aLong9803 = 0L;
    }
}
