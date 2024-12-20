/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class80 {
    static int anInt1008;
    static boolean aBoolean1009 = false;
    int anInt1010;
    static Class58 aClass58_1011 = new Class58("", 10);
    int anInt1012 = 2048;
    static int anInt1013;
    static int anInt1014;
    static int anInt1015;
    int anInt1016 = 2048;
    int anInt1017 = 0;
    static int anInt1018;

    public static void method579(boolean bool) {
        if (bool != true)
            aClass58_1011 = null;
        aClass58_1011 = null;
    }

    final void method580(ByteStream class248_sub9, boolean bool) {
        for (; ; ) {
            int i = class248_sub9.readUnsignedByte((byte) -124);
            if ((i ^ 0xffffffff) == -1)
                break;
            method582(i, -5, class248_sub9);
        }
        anInt1015++;
        if (bool != true)
            aClass58_1011 = null;
    }

    static final int method581(int i, boolean bool, int i_0_) {
        anInt1013++;
        int i_1_ = (Class210.method1722(-1 + i_0_, -1 + i, -15800) + Class210.method1722(-1 + i_0_, i - -1, -15800) + (Class210.method1722(1 + i_0_, -1 + i, -15800) - -Class210.method1722(1 + i_0_, 1 + i, -15800)));
        if (bool != true)
            aClass58_1011 = null;
        int i_2_ = (Class210.method1722(i_0_, -1 + i, -15800) - (-Class210.method1722(i_0_, i - -1, -15800) + -Class210.method1722(-1 + i_0_, i, -15800)) - -Class210.method1722(i_0_ + 1, i, -15800));
        int i_3_ = Class210.method1722(i_0_, i, -15800);
        return i_3_ / 4 + i_1_ / 16 + i_2_ / 8;
    }

    private final void method582(int i, int i_4_, ByteStream class248_sub9) {
        if ((i ^ 0xffffffff) != -2) {
            if ((i ^ 0xffffffff) != -3) {
                if (i != 3) {
                    if ((i ^ 0xffffffff) == -5)
                        ((Class80) this).anInt1010 = class248_sub9.readUnsignedShort((byte) -10);
                } else
                    ((Class80) this).anInt1012 = class248_sub9.readShort(-1);
            } else
                ((Class80) this).anInt1016 = class248_sub9.readShort(-1);
        } else
            ((Class80) this).anInt1017 = class248_sub9.readUnsignedByte((byte) -75);
        anInt1014++;
        if (i_4_ != -5)
            method580(null, true);
    }

    static final String[] method583(int i, String string, char c) {
        anInt1008++;
        int i_5_ = Class319.method3318(33, c, string);
        String[] strings = new String[1 + i_5_];
        int i_6_ = 0;
        int i_7_ = 0;
        for (int i_8_ = 0; (i_5_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
            int i_9_;
            for (i_9_ = i_7_; c != string.charAt(i_9_); i_9_++) {
                /* empty */
            }
            strings[i_6_++] = string.substring(i_7_, i_9_);
            i_7_ = 1 + i_9_;
        }
        int i_10_ = -104 % ((i - -46) / 41);
        strings[i_5_] = string.substring(i_7_);
        return strings;
    }

    static final void method584(byte i) {
        if (i < -111) {
            for (int i_11_ = 0; Class108.anInt1363 > i_11_; i_11_++) {
                int i_12_ = (Class346_Sub7_Sub1_Sub2.method3594(Class108.anInt1363, -429911713, (Node_Sub14_Sub18.anInt9352) + i_11_) * Class70.anInt927);
                for (int i_13_ = 0; (Class70.anInt927 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
                    int i_14_ = i_12_ + (Class346_Sub7_Sub1_Sub2.method3594(Class70.anInt927, -429911713, Class358.anInt4422 + i_13_));
                    if ((Class346_Sub7_Sub4_Sub1.anInt10092 ^ 0xffffffff) == (Class341.anIntArray3970[i_14_] ^ 0xffffffff))
                        Class183.anInterface14Array2136[i_14_].method38(0, 0, Class81.anInt4905, Class282_Sub26.anInt7860, Class81.anInt4905 * i_13_, i_11_ * Class282_Sub26.anInt7860, true, true);
                }
            }
            anInt1018++;
        }
    }

    public Class80() {
        ((Class80) this).anInt1010 = 0;
    }
}
