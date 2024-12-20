/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class226 {
    static String[] aStringArray2546;
    static int anInt2547;
    static int anInt2548;
    static int anInt2549;

    public static void method1801(byte i) {
        if (i >= -101)
            method1802((byte) 77, (byte) 49);
        aStringArray2546 = null;
    }

    static final char method1802(byte i, byte i_0_) {
        anInt2547++;
        int i_1_ = 0xff & i_0_;
        if (i != -71)
            anInt2549 = 98;
        if (i_1_ == 0)
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(i_1_, 16) + " provided");
        if (i_1_ >= 128 && (i_1_ ^ 0xffffffff) > -161) {
            int i_2_ = Class357.aCharArray4415[i_1_ + -128];
            if ((i_2_ ^ 0xffffffff) == -1)
                i_2_ = 63;
            i_1_ = i_2_;
        }
        return (char) i_1_;
    }

    static final boolean method1803(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt2548++;
        int i_9_ = i + i_6_;
        int i_10_ = i_3_ + i_4_;
        if (i_7_ <= 9)
            return false;
        int i_11_ = i_8_ + i_5_;
        if (!Class161.method1417(false, i_6_, i_9_, i_10_, i_6_, i_10_, i_11_, i_10_, i_11_, i_5_))
            return false;
        if (!Class161.method1417(false, i_6_, i_9_, i_10_, i_9_, i_10_, i_11_, i_10_, i_5_, i_5_))
            return false;
        if (Class227.anInt2565 > i_6_) {
            if (!Class161.method1417(false, i_6_, i_6_, i_4_, i_6_, i_10_, i_11_, i_10_, i_5_, i_11_))
                return false;
            if (!Class161.method1417(false, i_6_, i_6_, i_4_, i_6_, i_10_, i_5_, i_4_, i_5_, i_11_))
                return false;
        } else {
            if (!Class161.method1417(false, i_9_, i_9_, i_4_, i_9_, i_10_, i_11_, i_10_, i_5_, i_11_))
                return false;
            if (!Class161.method1417(false, i_9_, i_9_, i_4_, i_9_, i_10_, i_5_, i_4_, i_5_, i_11_))
                return false;
        }
        if ((Node_Sub8_Sub18.anInt9079 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
            if (!Class161.method1417(false, i_6_, i_9_, i_4_, i_6_, i_10_, i_5_, i_10_, i_5_, i_5_))
                return false;
            if (!Class161.method1417(false, i_6_, i_9_, i_4_, i_9_, i_10_, i_5_, i_4_, i_5_, i_5_))
                return false;
        } else {
            if (!Class161.method1417(false, i_6_, i_9_, i_4_, i_6_, i_10_, i_11_, i_10_, i_11_, i_11_))
                return false;
            if (!Class161.method1417(false, i_6_, i_9_, i_4_, i_9_, i_10_, i_11_, i_4_, i_11_, i_11_))
                return false;
        }
        return true;
    }
}
