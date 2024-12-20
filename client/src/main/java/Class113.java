/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class113 {
    static int anInt1393;
    private Class278 aClass278_1394 = new Class278(256);
    static int anInt1395;
    private Class381 aClass381_1396;
    static int anInt1397;
    static int anInt1398;
    static int anInt1399;
    static boolean aBoolean1400;
    static Class128 aClass128_1401;
    static int anInt1402 = 0;

    final void method804(int i) {
        synchronized (aClass278_1394) {
            aClass278_1394.method2869(0);
        }
        if (i >= -19)
            aClass128_1401 = null;
        anInt1398++;
    }

    final void method805(int i) {
        synchronized (aClass278_1394) {
            aClass278_1394.method2872((byte) -78);
        }
        if (i != 16)
            method808(76, -94);
        anInt1397++;
    }

    public static void method806(int i) {
        if (i < 84)
            aClass128_1401 = null;
        aClass128_1401 = null;
    }

    final Node_Sub8_Sub7 method807(int i, byte i_0_) {
        anInt1395++;
        Node_Sub8_Sub7 class248_sub8_sub7;
        synchronized (aClass278_1394) {
            int i_1_ = -70 % ((20 - i_0_) / 33);
            class248_sub8_sub7 = (Node_Sub8_Sub7) aClass278_1394.method2863(4, (long) i);
        }
        if (class248_sub8_sub7 != null)
            return class248_sub8_sub7;
        byte[] is;
        synchronized (aClass381_1396) {
            is = aClass381_1396.method3922((byte) 116, 26, i);
        }
        class248_sub8_sub7 = new Node_Sub8_Sub7();
        if (is != null)
            class248_sub8_sub7.method2064(-2, new ByteStream(is));
        synchronized (aClass278_1394) {
            aClass278_1394.method2867((byte) 0, (long) i, class248_sub8_sub7);
        }
        return class248_sub8_sub7;
    }

    final void method808(int i, int i_2_) {
        if (i == 26) {
            anInt1393++;
            synchronized (aClass278_1394) {
                aClass278_1394.method2864(i_2_, -15782);
            }
        }
    }

    Class113(Class215 class215, int i, Class381 class381) {
        aClass381_1396 = class381;
        aClass381_1396.method3899(26, 0);
    }

    static {
        aBoolean1400 = false;
        aClass128_1401 = new Class128(2, 16);
    }
}
