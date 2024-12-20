/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151 {
    static int anInt1791;
    static int anInt1792;
    static IncommingOpcode aIncommingOpcode_1793;
    static int anInt1794;
    static int anInt1795;
    static int anInt1796;
    private Class278 aClass278_1797 = new Class278(64);
    Class381 aClass381_1798;
    static int anInt1799 = 0;
    private Class381 aClass381_1800;
    Class278 aClass278_1801 = new Class278(60);
    static float[] aFloatArray1802;
    int anInt1803;
    static int anInt1804;
    static boolean aBoolean1805;
    static int anInt1806;

    final void method1349(boolean bool) {
        synchronized (aClass278_1797) {
            if (bool != false)
                ((Class151) this).anInt1803 = 57;
            aClass278_1797.method2869(0);
        }
        anInt1796++;
        synchronized (((Class151) this).aClass278_1801) {
            ((Class151) this).aClass278_1801.method2869(0);
        }
    }

    final void method1350(int i) {
        anInt1792++;
        synchronized (aClass278_1797) {
            aClass278_1797.method2872((byte) -78);
        }
        synchronized (((Class151) this).aClass278_1801) {
            ((Class151) this).aClass278_1801.method2872((byte) -78);
            if (i >= -27)
                anInt1806 = -70;
        }
    }

    public static void method1351(byte i) {
        aIncommingOpcode_1793 = null;
        if (i == -50)
            aFloatArray1802 = null;
    }

    final void method1352(int i, int i_0_) {
        anInt1794++;
        ((Class151) this).anInt1803 = i;
        synchronized (((Class151) this).aClass278_1801) {
            ((Class151) this).aClass278_1801.method2872((byte) -78);
        }
        if (i_0_ != -1)
            ((Class151) this).anInt1803 = -66;
    }

    final Class51 method1353(int i, int i_1_) {
        anInt1795++;
        Class51 class51;
        synchronized (aClass278_1797) {
            class51 = (Class51) aClass278_1797.method2863(4, (long) i);
        }
        if (class51 != null)
            return class51;
        byte[] is;
        synchronized (aClass381_1800) {
            is = aClass381_1800.method3922((byte) 119, RSInterface2.method3761((byte) 122, i), RSInterface2.method3779((byte) -103, i));
        }
        if (i_1_ != -1)
            method1353(61, 63);
        class51 = new Class51();
        ((Class51) class51).anInt681 = i;
        ((Class51) class51).aClass151_697 = this;
        if (is != null)
            class51.method408(i_1_ ^ ~0x46, new ByteStream(is));
        synchronized (aClass278_1797) {
            aClass278_1797.method2867((byte) 0, (long) i, class51);
        }
        return class51;
    }

    final void method1354(int i, boolean bool) {
        anInt1791++;
        if (bool != false)
            method1352(-100, -94);
        synchronized (aClass278_1797) {
            aClass278_1797.method2864(i, -15782);
        }
        synchronized (((Class151) this).aClass278_1801) {
            ((Class151) this).aClass278_1801.method2864(i, -15782);
        }
    }

    Class151(Class215 class215, int i, Class381 class381, Class381 class381_2_) {
        ((Class151) this).aClass381_1798 = class381_2_;
        aClass381_1800 = class381;
        int i_3_ = -1 + aClass381_1800.method3902(0);
        aClass381_1800.method3899(i_3_, 0);
    }

    static {
        aIncommingOpcode_1793 = new IncommingOpcode(19, 0);
        anInt1804 = -1;
        aFloatArray1802 = new float[4];
        aBoolean1805 = false;
    }
}
