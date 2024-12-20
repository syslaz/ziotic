/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class328 {
    static OutgoingOpcode aOutgoingOpcode_3839 = new OutgoingOpcode(29, 15);
    static int[] anIntArray3840;
    static int anInt3841;

    public static void method3367(byte i) {
        aOutgoingOpcode_3839 = null;
        if (i != -23)
            aOutgoingOpcode_3839 = null;
        anIntArray3840 = null;
    }

    static final byte[] method3368(int i, int i_0_, File file) {
        anInt3841++;
        try {
            byte[] is = new byte[i_0_];
            Class234.method1844(file, -33, is, i_0_);
            if (i != 9233)
                method3368(-16, -36, null);
            return is;
        } catch (java.io.IOException ioexception) {
            return null;
        }
    }
}
