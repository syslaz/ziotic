/* Class297_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class297_Sub1 extends Class297 {
    static Canvas aCanvas8478;
    int anInt8479;
    static int anInt8480;
    static int anInt8481;
    static int anInt8482 = 0;
    static Class129 aClass129_8483;
    static int anInt8484;
    static int anInt8485;

    static final byte method3137(int i, char c) {
        if (i < 6)
            aCanvas8478 = null;
        anInt8485++;
        byte i_0_;
        if ((c <= 0 || c >= 128) && ((c ^ 0xffffffff) > -161 || (c ^ 0xffffffff) < -256)) {
            if (c == 8364)
                i_0_ = (byte) -128;
            else if ((c ^ 0xffffffff) == -8219)
                i_0_ = (byte) -126;
            else if ((c ^ 0xffffffff) == -403)
                i_0_ = (byte) -125;
            else if ((c ^ 0xffffffff) == -8223)
                i_0_ = (byte) -124;
            else if ((c ^ 0xffffffff) != -8231) {
                if (c == 8224)
                    i_0_ = (byte) -122;
                else if (c != 8225) {
                    if (c != 710) {
                        if ((c ^ 0xffffffff) != -8241) {
                            if (c != 352) {
                                if ((c ^ 0xffffffff) == -8250)
                                    i_0_ = (byte) -117;
                                else if (c != 338) {
                                    if ((c ^ 0xffffffff) == -382)
                                        i_0_ = (byte) -114;
                                    else if ((c ^ 0xffffffff) != -8217) {
                                        if ((c ^ 0xffffffff) == -8218)
                                            i_0_ = (byte) -110;
                                        else if ((c ^ 0xffffffff) == -8221)
                                            i_0_ = (byte) -109;
                                        else if ((c ^ 0xffffffff) == -8222)
                                            i_0_ = (byte) -108;
                                        else if ((c ^ 0xffffffff) != -8227) {
                                            if (c != 8211) {
                                                if (c == 8212)
                                                    i_0_ = (byte) -105;
                                                else if (c == 732)
                                                    i_0_ = (byte) -104;
                                                else if (c != 8482) {
                                                    if ((c ^ 0xffffffff) != -354) {
                                                        if (c != 8250) {
                                                            if ((c ^ 0xffffffff) == -340)
                                                                i_0_ = (byte) -100;
                                                            else if (c == 382)
                                                                i_0_ = (byte) -98;
                                                            else if ((c ^ 0xffffffff) == -377)
                                                                i_0_ = (byte) -97;
                                                            else
                                                                i_0_ = (byte) 63;
                                                        } else
                                                            i_0_ = (byte) -101;
                                                    } else
                                                        i_0_ = (byte) -102;
                                                } else
                                                    i_0_ = (byte) -103;
                                            } else
                                                i_0_ = (byte) -106;
                                        } else
                                            i_0_ = (byte) -107;
                                    } else
                                        i_0_ = (byte) -111;
                                } else
                                    i_0_ = (byte) -116;
                            } else
                                i_0_ = (byte) -118;
                        } else
                            i_0_ = (byte) -119;
                    } else
                        i_0_ = (byte) -120;
                } else
                    i_0_ = (byte) -121;
            } else
                i_0_ = (byte) -123;
        } else
            i_0_ = (byte) c;
        return i_0_;
    }

    public static void method3138(byte i) {
        aCanvas8478 = null;
        int i_1_ = 101 / ((i - 30) / 58);
        aClass129_8483 = null;
    }

    Class297_Sub1(int i, Class186 class186, Class272 class272, int i_2_, int i_3_, int i_4_) {
        super(i, class186, class272, i_2_, i_3_);
        ((Class297_Sub1) this).anInt8479 = i_4_;
    }

    public final Class208 method35(byte i) {
        if (i != 62)
            anInt8482 = 94;
        anInt8484++;
        return Class352.aClass208_4189;
    }

    static final void method3139(byte i, Class25 class25) {
        if (i <= 118)
            aCanvas8478 = null;
        anInt8480++;
        Class335.aClass25_3909 = class25;
    }
}
