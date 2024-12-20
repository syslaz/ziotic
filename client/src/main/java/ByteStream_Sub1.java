/* Class248_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;

final class Node_Sub9_Sub1 extends ByteStream {
    static Class17 aClass17_9105 = new Class17();
    static int[] anIntArray9106 = new int[16384];
    static int anInt9107;
    static int anInt9108;
    static int[] anIntArray9109 = new int[16384];

    Node_Sub9_Sub1(int i) {
        super(i);
    }

    public static void method2224(int i) {
        if (i == 25819) {
            aClass17_9105 = null;
            anIntArray9106 = null;
            anIntArray9109 = null;
        }
    }

    final void method2225(int i, float f) {
        anInt9107++;
        int i_0_ = Stream.floatToRawIntBits(f);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_0_;
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_0_ >> -743380408);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_0_ >> 1737095984);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_0_ >> -1806161288);
        if (i != 4440)
            method2226(123, 1.4405893F);
    }

    final void method2226(int i, float f) {
        anInt9108++;
        int i_1_ = Stream.floatToRawIntBits(f);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_1_ >> 1118921656);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_1_ >> 1986328112);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) (i_1_ >> -1451137496);
        ((ByteStream) this).buffer[((ByteStream) this).offset++] = (byte) i_1_;
        if (i <= 23)
            method2226(-116, -1.2237406F);
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            anIntArray9106[i] = (int) (16384.0 * Math.sin(d * (double) i));
            anIntArray9109[i] = (int) (16384.0 * Math.cos((double) i * d));
        }
    }
}
