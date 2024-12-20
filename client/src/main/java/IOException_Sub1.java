/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.util.Hashtable;

final class IOException_Sub1 extends IOException {
    static Class293 aClass293_82 = new Class293();
    static int anInt83;
    static Hashtable aHashtable84 = new Hashtable();
    static int anInt85;

    IOException_Sub1(String string) {
        super(string);
    }

    static final Node_Sub33 method127(boolean bool, int i, byte i_0_) {
        if (i_0_ != -60)
            return null;
        anInt83++;
        long l = (long) ((bool ? -2147483648 : 0) | i);
        return (Node_Sub33) Class57.aClass65_790.method501(l, (byte) 31);
    }

    public static void method128(int i) {
        if (i == 0) {
            aHashtable84 = null;
            aClass293_82 = null;
        }
    }
}
