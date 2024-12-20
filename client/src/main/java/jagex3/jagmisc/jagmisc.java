/* jagmisc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.jagmisc;

public class jagmisc {
    public static int ping(byte i, byte i_0_, byte i_1_, byte i_2_, long l) throws Throwable {
        int i_3_ = ping0(i, i_0_, i_1_, i_2_, l);
        if (i_3_ < 0)
            throw new Exception(String.valueOf(i_3_));
        return i_3_;
    }

    private static native int ping0(byte i, byte i_4_, byte i_5_, byte i_6_, long l);

    public static void quit() {
        Quit0();
    }

    private static native void Quit0();

    public static native long nanoTime();

    public static native long getTotalPhysicalMemory();

    public static native boolean init();

    public static native long getAvailablePhysicalMemory();
}
