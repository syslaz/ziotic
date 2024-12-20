/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class331 {
    private Class278 aClass278_3857 = new Class278(64);
    static int anInt3858;
    static int anInt3859;
    private Class381 aClass381_3860;
    static int anInt3861;
    static int anInt3862;
    static double aDouble3863;
    static int anInt3864;

    final void method3392(byte i) {
        synchronized (aClass278_3857) {
            int i_0_ = 91 / ((i - 62) / 34);
            aClass278_3857.method2869(0);
        }
        anInt3858++;
    }

    final void method3393(int i) {
        synchronized (aClass278_3857) {
            aClass278_3857.method2872((byte) -78);
        }
        anInt3859++;
        if (i != 21185)
            aClass381_3860 = null;
    }

    final Class250 method3394(int i, int i_1_) {
        anInt3861++;
        Class250 class250;
        synchronized (aClass278_3857) {
            if (i >= -87)
                return null;
            class250 = (Class250) aClass278_3857.method2863(4, (long) i_1_);
        }
        if (class250 != null)
            return class250;
        byte[] is;
        synchronized (aClass381_3860) {
            is = aClass381_3860.method3922((byte) 108, Class282_Sub14.method2973(-106, i_1_), Class50.method393((byte) -124, i_1_));
        }
        class250 = new Class250();
        if (is != null)
            class250.method2707(38, new ByteStream(is));
        synchronized (aClass278_3857) {
            aClass278_3857.method2867((byte) 0, (long) i_1_, class250);
        }
        return class250;
    }

    final void method3395(int i, boolean bool) {
        anInt3862++;
        synchronized (aClass278_3857) {
            aClass278_3857.method2864(i, -15782);
            if (bool != false)
                method3392((byte) 34);
        }
    }

    final void method3396(int i, int i_2_) {
        if (i_2_ != -886)
            method3396(-84, 106);
        synchronized (aClass278_3857) {
            aClass278_3857.method2872((byte) -78);
            aClass278_3857 = new Class278(i);
        }
        anInt3864++;
    }

    Class331(Class215 class215, int i, Class381 class381) {
        aClass381_3860 = class381;
        if (aClass381_3860 != null) {
            int i_3_ = aClass381_3860.method3902(0) - 1;
            aClass381_3860.method3899(i_3_, 0);
        }
    }
}
