/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
    static int anInt328;
    static int[] anIntArray329 = {8, 11, 4, 6, 9, 7, 10, 0};
    static d aD330;

    public static void method238(byte i) {
        aD330 = null;
        if (i == -50)
            anIntArray329 = null;
    }

    static final void method239(byte i, long l) {
        anInt328++;
        try {
            Thread.sleep(l);
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (i < 52)
            anIntArray329 = null;
    }
}
