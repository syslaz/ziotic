/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.InputStream;

final class InputStream_Sub2 extends InputStream {
    static int anInt76;
    static int anInt77;
    static Node_Sub24 aClass248_Sub24_78;
    static byte[][] aByteArrayArray79;
    static int[][] anIntArrayArray80 = {{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
    static int anInt81;

    public final int read() {
        anInt77++;
        Class279_Sub2.method2897((byte) -124, 30000L);
        return -1;
    }

    public static void method125(boolean bool) {
        aClass248_Sub24_78 = null;
        aByteArrayArray79 = null;
        if (bool == false)
            anIntArrayArray80 = null;
    }

    static final byte[] method126(boolean bool, String string) {
        if (bool != true)
            anInt76 = -81;
        anInt81++;
        int i = string.length();
        byte[] is = new byte[i];
        for (int i_0_ = 0; i_0_ < i; i_0_++) {
            int i_1_ = string.charAt(i_0_);
            if (((i_1_ ^ 0xffffffff) >= -1 || i_1_ >= 128) && ((i_1_ ^ 0xffffffff) > -161 || (i_1_ ^ 0xffffffff) < -256)) {
                if ((i_1_ ^ 0xffffffff) == -8365)
                    is[i_0_] = (byte) -128;
                else if ((i_1_ ^ 0xffffffff) != -8219) {
                    if ((i_1_ ^ 0xffffffff) == -403)
                        is[i_0_] = (byte) -125;
                    else if ((i_1_ ^ 0xffffffff) == -8223)
                        is[i_0_] = (byte) -124;
                    else if ((i_1_ ^ 0xffffffff) != -8231) {
                        if (i_1_ == 8224)
                            is[i_0_] = (byte) -122;
                        else if ((i_1_ ^ 0xffffffff) == -8226)
                            is[i_0_] = (byte) -121;
                        else if (i_1_ == 710)
                            is[i_0_] = (byte) -120;
                        else if ((i_1_ ^ 0xffffffff) != -8241) {
                            if (i_1_ != 352) {
                                if ((i_1_ ^ 0xffffffff) == -8250)
                                    is[i_0_] = (byte) -117;
                                else if ((i_1_ ^ 0xffffffff) == -339)
                                    is[i_0_] = (byte) -116;
                                else if (i_1_ != 381) {
                                    if (i_1_ != 8216) {
                                        if ((i_1_ ^ 0xffffffff) != -8218) {
                                            if ((i_1_ ^ 0xffffffff) == -8221)
                                                is[i_0_] = (byte) -109;
                                            else if (i_1_ == 8221)
                                                is[i_0_] = (byte) -108;
                                            else if ((i_1_ ^ 0xffffffff) == -8227)
                                                is[i_0_] = (byte) -107;
                                            else if ((i_1_ ^ 0xffffffff) == -8212)
                                                is[i_0_] = (byte) -106;
                                            else if ((i_1_ ^ 0xffffffff) != -8213) {
                                                if (i_1_ != 732) {
                                                    if (i_1_ != 8482) {
                                                        if ((i_1_ ^ 0xffffffff) != -354) {
                                                            if (i_1_ != 8250) {
                                                                if ((i_1_ ^ 0xffffffff) == -340)
                                                                    is[i_0_] = (byte) -100;
                                                                else if (i_1_ != 382) {
                                                                    if (i_1_ == 376)
                                                                        is[i_0_] = (byte) -97;
                                                                    else
                                                                        is[i_0_] = (byte) 63;
                                                                } else
                                                                    is[i_0_] = (byte) -98;
                                                            } else
                                                                is[i_0_] = (byte) -101;
                                                        } else
                                                            is[i_0_] = (byte) -102;
                                                    } else
                                                        is[i_0_] = (byte) -103;
                                                } else
                                                    is[i_0_] = (byte) -104;
                                            } else
                                                is[i_0_] = (byte) -105;
                                        } else
                                            is[i_0_] = (byte) -110;
                                    } else
                                        is[i_0_] = (byte) -111;
                                } else
                                    is[i_0_] = (byte) -114;
                            } else
                                is[i_0_] = (byte) -118;
                        } else
                            is[i_0_] = (byte) -119;
                    } else
                        is[i_0_] = (byte) -123;
                } else
                    is[i_0_] = (byte) -126;
            } else
                is[i_0_] = (byte) i_1_;
        }
        return is;
    }

    static {
        anInt76 = -1;
    }
}
