/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class4 {
    static int anInt135;
    Class381 aClass381_136;
    static Class381 aClass381_137;
    private Class381 aClass381_138;
    static int anInt139;
    static int anInt140;
    static int anInt141;
    Class278 aClass278_142 = new Class278(20);
    private Class278 aClass278_143 = new Class278(64);

    final Class70 method174(int i, int i_0_) {
        anInt141++;
        Class70 class70;
        synchronized (aClass278_143) {
            class70 = (Class70) aClass278_143.method2863(4, (long) i_0_);
        }
        if (class70 != null)
            return class70;
        byte[] is;
        synchronized (aClass381_138) {
            is = aClass381_138.method3922((byte) 123, 46, i_0_);
        }
        if (i != 64)
            return null;
        class70 = new Class70();
        ((Class70) class70).aClass4_939 = this;
        if (is != null)
            class70.method527(new ByteStream(is), (byte) 89);
        synchronized (aClass278_143) {
            aClass278_143.method2867((byte) 0, (long) i_0_, class70);
        }
        return class70;
    }

    final void method175(int i, int i_1_) {
        anInt139++;
        synchronized (aClass278_143) {
            aClass278_143.method2864(i, -15782);
        }
        if (i_1_ == 46) {
            synchronized (((Class4) this).aClass278_142) {
                ((Class4) this).aClass278_142.method2864(i, -15782);
            }
        }
    }

    public static void method176(byte i) {
        if (i == -62)
            aClass381_137 = null;
    }

    final void method177(byte i) {
        if (i != -58)
            method176((byte) 67);
        anInt140++;
        synchronized (aClass278_143) {
            aClass278_143.method2872((byte) -78);
        }
        synchronized (((Class4) this).aClass278_142) {
            ((Class4) this).aClass278_142.method2872((byte) -78);
        }
    }

    final void method178(byte i) {
        synchronized (aClass278_143) {
            aClass278_143.method2869(0);
        }
        anInt135++;
        synchronized (((Class4) this).aClass278_142) {
            ((Class4) this).aClass278_142.method2869(0);
            int i_2_ = 24 % ((i - -66) / 39);
        }
    }

    Class4(Class215 class215, int i, Class381 class381, Class381 class381_3_) {
        aClass381_138 = class381;
        ((Class4) this).aClass381_136 = class381_3_;
        aClass381_138.method3899(46, 0);
    }
}
