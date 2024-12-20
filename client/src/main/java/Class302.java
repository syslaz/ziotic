/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class302 {
    static double aDouble3499;
    static int anInt3500;
    static int anInt3501 = 0;
    private Class381 aClass381_3502;
    static int anInt3503;
    static byte[] aByteArray3504;
    private Class278 aClass278_3505 = new Class278(64);
    int anInt3506;
    static int anInt3507;

    static final void method3198(int i) {
        anInt3507++;
        Class52.aClass179_709 = new Class179(8);
        Class101.anInt1292 = 0;
        for (Class346_Sub8 class346_sub8 = ((Class346_Sub8) Node_Sub2_Sub3.aClass360_8861.method3815((byte) 107)); class346_sub8 != null; class346_sub8 = (Class346_Sub8) Node_Sub2_Sub3.aClass360_8861.method3809(-24951))
            class346_sub8.method3715();
        int i_0_ = -58 / ((5 - i) / 62);
    }

    final Class69 method3199(int i, byte i_1_) {
        anInt3503++;
        Class69 class69;
        synchronized (aClass278_3505) {
            class69 = (Class69) aClass278_3505.method2863(4, (long) i);
        }
        if (class69 != null)
            return class69;
        byte[] is;
        synchronized (aClass381_3502) {
            is = aClass381_3502.method3922((byte) 110, 19, i);
        }
        if (i_1_ >= -70)
            return null;
        class69 = new Class69();
        if (is != null)
            class69.method524(new ByteStream(is), (byte) 49);
        synchronized (aClass278_3505) {
            aClass278_3505.method2867((byte) 0, (long) i, class69);
        }
        return class69;
    }

    public static void method3200(boolean bool) {
        aByteArray3504 = null;
        if (bool != true)
            anInt3500 = -117;
    }

    Class302(Class215 class215, int i, Class381 class381) {
        aClass381_3502 = class381;
        ((Class302) this).anInt3506 = aClass381_3502.method3899(19, 0);
    }

    static {
        anInt3500 = 0;
        aByteArray3504 = new byte[2048];
    }
}
