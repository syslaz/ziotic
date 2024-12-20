/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6 {
    private Class278 aClass278_150 = new Class278(64);
    static int anInt151;
    static Class168 aClass168_152;
    static boolean[][] aBooleanArrayArray153 = {new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
    static ha aHa154;
    private Class381 aClass381_155;
    private Class381 aClass381_156;
    static int anInt157;

    public static void method182(int i) {
        aClass168_152 = null;
        if (i > 99) {
            aBooleanArrayArray153 = null;
            aHa154 = null;
        }
    }

    final Node_Sub8_Sub6 method183(int i, int i_0_) {
        anInt151++;
        Node_Sub8_Sub6 class248_sub8_sub6 = (Node_Sub8_Sub6) aClass278_150.method2863(4, (long) i_0_);
        if (class248_sub8_sub6 != null)
            return class248_sub8_sub6;
        byte[] is;
        if (i_0_ < 32768)
            is = aClass381_156.method3922((byte) 127, 0, i_0_);
        else
            is = aClass381_155.method3922((byte) 122, 0, i_0_ & 0x7fff);
        class248_sub8_sub6 = new Node_Sub8_Sub6();
        if (i != 15076)
            return null;
        if (is != null)
            class248_sub8_sub6.method2063(new ByteStream(is), (byte) -1);
        if ((i_0_ ^ 0xffffffff) <= -32769)
            class248_sub8_sub6.method2060((byte) -31);
        aClass278_150.method2867((byte) 0, (long) i_0_, class248_sub8_sub6);
        return class248_sub8_sub6;
    }

    Class6(int i, Class381 class381, Class381 class381_1_) {
        aClass381_155 = class381_1_;
        aClass381_156 = class381;
        if (aClass381_156 != null)
            aClass381_156.method3899(0, 0);
        if (aClass381_155 != null)
            aClass381_155.method3899(0, 0);
    }

    static {
        aClass168_152 = new Class168(15, 0, 1, 0);
        anInt157 = 0;
    }
}
