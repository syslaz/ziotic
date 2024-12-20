/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class240 {
    static Class129[] aClass129Array2676;
    static int anInt2677;
    static int anInt2678;
    static OutgoingOpcode aOutgoingOpcode_2679 = new OutgoingOpcode(73, 7);
    private Class381 aClass381_2680;
    static int anInt2681;
    static boolean aBoolean2682 = false;
    static int anInt2683;
    private Class278 aClass278_2684 = new Class278(64);

    public static void method1921(boolean bool) {
        aOutgoingOpcode_2679 = null;
        if (bool != false)
            method1921(true);
        aClass129Array2676 = null;
    }

    final void method1922(int i, byte i_0_) {
        anInt2683++;
        synchronized (aClass278_2684) {
            aClass278_2684.method2864(i, -15782);
            if (i_0_ != -49)
                method1925((byte) -91);
        }
    }

    final Class210 method1923(int i, int i_1_) {
        if (i != -6119)
            method1923(44, -45);
        anInt2678++;
        Class210 class210;
        synchronized (aClass278_2684) {
            class210 = (Class210) aClass278_2684.method2863(4, (long) i_1_);
        }
        if (class210 != null)
            return class210;
        byte[] is;
        synchronized (aClass381_2680) {
            is = aClass381_2680.method3922((byte) 118, 11, i_1_);
        }
        class210 = new Class210();
        if (is != null)
            class210.method1723(new ByteStream(is), true);
        synchronized (aClass278_2684) {
            aClass278_2684.method2867((byte) 0, (long) i_1_, class210);
        }
        return class210;
    }

    final void method1924(int i) {
        if (i > -12)
            method1921(false);
        synchronized (aClass278_2684) {
            aClass278_2684.method2869(0);
        }
        anInt2677++;
    }

    final void method1925(byte i) {
        synchronized (aClass278_2684) {
            aClass278_2684.method2872((byte) -78);
            if (i != 126)
                aClass129Array2676 = null;
        }
        anInt2681++;
    }

    Class240(Class215 class215, int i, Class381 class381) {
        aClass381_2680 = class381;
        if (aClass381_2680 != null)
            aClass381_2680.method3899(11, 0);
    }
}
