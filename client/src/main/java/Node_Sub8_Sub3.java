/* Class248_Sub8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub3 extends Node_Sub8 {
    static int anInt8920;
    static int[] anIntArray8921;
    static Class345 aClass345_8922;
    int anInt8923 = 0;
    static int[] anIntArray8924;
    static int anInt8925;
    static int anInt8926;
    static int anInt8927 = -1;

    private final void method2041(int i, byte i_0_, ByteStream class248_sub9) {
        anInt8920++;
        if (i_0_ == -45) {
            if ((i ^ 0xffffffff) == -3)
                ((Node_Sub8_Sub3) this).anInt8923 = class248_sub9.readShort(-1);
        }
    }

    public static void method2042(int i) {
        aClass345_8922 = null;
        anIntArray8921 = null;
        if (i != -27627)
            method2042(120);
        anIntArray8924 = null;
    }

    static final Class129 method2043(int i, Class381 class381, boolean bool) {
        anInt8925++;
        Class129 class129 = ((Class129) PacketStream.aClass278_9121.method2863(4, (long) i));
        if (class129 == null) {
            if (!Class254.aBoolean5127)
                class129 = Class337.method3419(-76, class381.method3930(-1, i));
            else
                class129 = Class287.aHa3381.a(Class157.method1382(class381, i), true);
            PacketStream.aClass278_9121.method2867((byte) 0, (long) i, class129);
        }
        if (bool != true)
            anInt8927 = -90;
        return class129;
    }

    final void method2044(ByteStream class248_sub9, byte i) {
        for (; ; ) {
            int i_1_ = class248_sub9.readUnsignedByte((byte) -40);
            if (i_1_ == 0)
                break;
            method2041(i_1_, (byte) -45, class248_sub9);
        }
        if (i > 113)
            anInt8926++;
    }

    public Node_Sub8_Sub3() {
        /* empty */
    }
}
