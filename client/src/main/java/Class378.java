/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class378 {
    private Class381 aClass381_4630;
    private Class278 aClass278_4631 = new Class278(64);
    static int anInt4632;
    static int anInt4633;
    static int anInt4634;
    static int anInt4635;
    int anInt4636;
    static int anInt4637;

    final void method3888(int i) {
        synchronized (aClass278_4631) {
            aClass278_4631.method2869(i ^ i);
        }
        anInt4633++;
    }

    final void method3889(byte i, int i_0_) {
        anInt4637++;
        int i_1_ = -117 / ((-21 - i) / 60);
        synchronized (aClass278_4631) {
            aClass278_4631.method2864(i_0_, -15782);
        }
    }

    final Class180 method3890(int i, byte i_2_) {
        anInt4632++;
        Class180 class180;
        synchronized (aClass278_4631) {
            class180 = (Class180) aClass278_4631.method2863(4, (long) i);
        }
        if (class180 != null)
            return class180;
        byte[] is;
        synchronized (aClass381_4630) {
            is = aClass381_4630.method3922((byte) 122, 16, i);
        }
        class180 = new Class180();
        if (is != null)
            class180.method1599((byte) -119, new ByteStream(is));
        synchronized (aClass278_4631) {
            int i_3_ = 88 % ((i_2_ - 73) / 39);
            aClass278_4631.method2867((byte) 0, (long) i, class180);
        }
        return class180;
    }

    Class378(Class215 class215, int i, Class381 class381) {
        aClass381_4630 = class381;
        if (aClass381_4630 != null)
            ((Class378) this).anInt4636 = aClass381_4630.method3899(16, 0);
        else
            ((Class378) this).anInt4636 = 0;
    }

    static final int method3891(int i, int i_4_) {
        anInt4635++;
        if (i != 7600775)
            return -98;
        return i_4_ >>> 7600775;
    }

    final void method3892(int i) {
        synchronized (aClass278_4631) {
            int i_5_ = 27 % ((i - 32) / 32);
            aClass278_4631.method2872((byte) -78);
        }
        anInt4634++;
    }
}
