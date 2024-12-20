/* Class248_Sub14_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub6 extends Node_Sub14 {
    static int anInt9210;
    static int anInt9211;
    private int anInt9212 = 4096;
    static int anInt9213 = 0;
    static Class58 aClass58_9214 = new Class58("", 14);
    static int anInt9215;

    public Node_Sub14_Sub6() {
        this(4096);
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_0_) {
        anInt9211++;
        int i_1_ = i_0_;
        if ((i_1_ ^ 0xffffffff) == -1)
            anInt9212 = (class248_sub9.readUnsignedByte((byte) -88) << -617498804) / 255;
        if (i != -61)
            aClass58_9214 = null;
    }

    Node_Sub14_Sub6(int i) {
        super(0, true);
        anInt9212 = i;
    }

    public static void method2291(int i) {
        if (i < 4)
            aClass58_9214 = null;
        aClass58_9214 = null;
    }

    final int[] method2264(byte i, int i_2_) {
        if (i != -40)
            anInt9215 = 23;
        anInt9210++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_2_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564)
            Class159.method1403(is, 0, Class185.anInt2164, anInt9212);
        return is;
    }
}
