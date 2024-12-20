/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class329 {
    static OutgoingOpcode aOutgoingOpcode_3842 = new OutgoingOpcode(49, 6);
    private Class278 aClass278_3843 = new Class278(64);
    static int anInt3844;
    static int anInt3845;
    static int anInt3846;
    private Class381 aClass381_3847;
    static int anInt3848;
    static int anInt3849;
    static int[] anIntArray3850 = new int[14];
    static int anInt3851 = 0;

    final void method3369(int i, byte i_0_) {
        anInt3845++;
        if (i_0_ > -70)
            method3370(-40, 61);
        synchronized (aClass278_3843) {
            aClass278_3843.method2864(i, -15782);
        }
    }

    final Class80 method3370(int i, int i_1_) {
        anInt3849++;
        if (i <= 59)
            anInt3851 = -17;
        Class80 class80;
        synchronized (aClass278_3843) {
            class80 = (Class80) aClass278_3843.method2863(4, (long) i_1_);
        }
        if (class80 != null)
            return class80;
        byte[] is;
        synchronized (aClass381_3847) {
            is = aClass381_3847.method3922((byte) 125, 31, i_1_);
        }
        class80 = new Class80();
        if (is != null)
            class80.method580(new ByteStream(is), true);
        synchronized (aClass278_3843) {
            aClass278_3843.method2867((byte) 0, (long) i_1_, class80);
        }
        return class80;
    }

    final void method3371(byte i) {
        synchronized (aClass278_3843) {
            aClass278_3843.method2872((byte) -78);
            int i_2_ = -24 % ((34 - i) / 48);
        }
        anInt3844++;
    }

    public static void method3372(int i) {
        anIntArray3850 = null;
        aOutgoingOpcode_3842 = null;
        if (i < 24)
            changeRegionSize(123, true);
    }

    final void method3373(byte i) {
        int i_3_ = -104 / ((i - -21) / 47);
        synchronized (aClass278_3843) {
            aClass278_3843.method2869(0);
        }
        anInt3848++;
    }

    Class329(Class215 class215, int i, Class381 class381) {
        aClass381_3847 = class381;
        aClass381_3847.method3899(31, 0);
    }

    static final void changeRegionSize(int i, boolean bool) {
        anInt3846++;
        if (Class172.anInt2001 != i) {
            Node_Sub8_Sub4.anInt8360 = Node_Sub22.anInt7074 = Class128.anIntArray1569[i];
            Node_Sub14_Sub35.method2380((byte) -118);
            Class27.anIntArrayArray361 = (new int[Node_Sub8_Sub4.anInt8360]
                    [Node_Sub22.anInt7074]);
            Class245.anIntArrayArrayArray2749 = (new int[4][Node_Sub8_Sub4.anInt8360 >> -1366684189]
                    [Node_Sub22.anInt7074 >> 1710377315]);
            Class334.anIntArrayArray3903 = (new int[Node_Sub8_Sub4.anInt8360]
                    [Node_Sub22.anInt7074]);
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++)
                Class182.aClass164Array2114[i_4_] = Class290.method3090(Node_Sub8_Sub4.anInt8360, Node_Sub22.anInt7074, 0);
            Class283.aByteArrayArrayArray3338 = (new byte[4][Node_Sub8_Sub4.anInt8360]
                    [Node_Sub22.anInt7074]);
            Class346_Sub7_Sub2_Sub3.method3622(Node_Sub8_Sub4.anInt8360, Node_Sub22.anInt7074, 4, (byte) 50);
            if (bool != true)
                anInt3851 = -4;
            Class177.method1590(Node_Sub22.anInt7074 >> 1568761827, Class287.aHa3381, 5, Node_Sub8_Sub4.anInt8360 >> -1990127421);
            Class172.anInt2001 = i;
        }
    }
}
