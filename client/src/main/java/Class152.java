/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class152 {
    static float aFloat1807;
    static int anInt1808;
    private Class381 aClass381_1809;
    static int anInt1810;
    static int anInt1811;
    private Class278 aClass278_1812;
    int anInt1813 = 0;
    private Class381 aClass381_1814;
    static int anInt1815;
    int anInt1816 = 0;
    private Interface7 anInterface7_1817;

    final String method1355(Class168 class168, long l, byte i, int[] is) {
        anInt1810++;
        if (anInterface7_1817 != null) {
            String string = anInterface7_1817.method29(is, l, -7751, class168);
            if (string != null)
                return string;
        }
        if (i >= -56)
            ((Class152) this).anInt1816 = 65;
        return Long.toString(l);
    }

    final Node_Sub8_Sub20 method1356(boolean bool, int i) {
        anInt1815++;
        Node_Sub8_Sub20 class248_sub8_sub20 = (Node_Sub8_Sub20) aClass278_1812.method2863(4, (long) i);
        if (class248_sub8_sub20 != null)
            return class248_sub8_sub20;
        byte[] is;
        if ((i ^ 0xffffffff) > -32769)
            is = aClass381_1809.method3922((byte) 126, 1, i);
        else
            is = aClass381_1814.method3922((byte) 121, 1, 0x7fff & i);
        class248_sub8_sub20 = new Node_Sub8_Sub20();
        ((Node_Sub8_Sub20) class248_sub8_sub20).aClass152_9101 = this;
        if (is != null)
            class248_sub8_sub20.method2149(new ByteStream(is), (byte) 108);
        if (i >= 32768)
            class248_sub8_sub20.method2148((byte) -109);
        if (bool != true)
            return null;
        aClass278_1812.method2867((byte) 0, (long) i, class248_sub8_sub20);
        return class248_sub8_sub20;
    }

    static final int method1357(int i, int i_0_) {
        anInt1811++;
        int i_1_ = i_0_ & 0x3f;
        int i_2_ = (0xf4 & i_0_) >> -1087816378;
        if (i_1_ != 18) {
            if ((i_1_ ^ 0xffffffff) == -20 || i_1_ == 21) {
                if (i_2_ == 0)
                    return 16;
                if ((i_2_ ^ 0xffffffff) == -2)
                    return 32;
                if ((i_2_ ^ 0xffffffff) == -3)
                    return 64;
                if ((i_2_ ^ 0xffffffff) == -4)
                    return 128;
            }
        } else {
            if ((i_2_ ^ 0xffffffff) == -1)
                return 1;
            if (i_2_ == 1)
                return 2;
            if (i_2_ == 2)
                return 4;
            if ((i_2_ ^ 0xffffffff) == -4)
                return 8;
        }
        if (i > -62)
            method1357(-127, -77);
        return 0;
    }

    Class152(int i, Class381 class381, Class381 class381_3_, Interface7 interface7) {
        aClass278_1812 = new Class278(64);
        anInterface7_1817 = null;
        anInterface7_1817 = interface7;
        aClass381_1809 = class381;
        aClass381_1814 = class381_3_;
        if (aClass381_1809 != null)
            ((Class152) this).anInt1816 = aClass381_1809.method3899(1, 0);
        if (aClass381_1814 != null)
            ((Class152) this).anInt1813 = aClass381_1814.method3899(1, 0);
    }
}
