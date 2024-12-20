/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154 {
    static int anInt1821;
    static int anInt1822;
    private Class65 aClass65_1823 = new Class65(256);
    static int anInt1824;
    static int loginType;
    static int anInt1826;
    private Class381 aClass381_1827;
    private Class381 aClass381_1828;
    private Class65 aClass65_1829 = new Class65(256);

    final Node_Sub31_Sub1 method1362(int[] is, int i, int i_0_) {
        anInt1824++;
        int i_1_ = 110 % ((-25 - i) / 49);
        if ((aClass381_1827.method3902(0) ^ 0xffffffff) == -2)
            return method1363(0, -82, is, i_0_);
        if ((aClass381_1827.method3899(i_0_, 0) ^ 0xffffffff) == -2)
            return method1363(i_0_, -128, is, 0);
        throw new RuntimeException();
    }

    private final Node_Sub31_Sub1 method1363(int i, int i_2_, int[] is, int i_3_) {
        anInt1821++;
        int i_4_ = ((~0x3ffff000 & i) << -373272060 | i >>> 1541534604) ^ i_3_;
        i_4_ |= i << -476205808;
        if (i_2_ >= -70)
            method1363(-36, 109, null, -102);
        long l = (long) i_4_;
        Node_Sub31_Sub1 class248_sub31_sub1 = (Node_Sub31_Sub1) aClass65_1829.method501(l, (byte) 31);
        if (class248_sub31_sub1 != null)
            return class248_sub31_sub1;
        if (is != null && (is[0] ^ 0xffffffff) >= -1)
            return null;
        Class313 class313 = Class313.method3272(aClass381_1827, i, i_3_);
        if (class313 == null)
            return null;
        class248_sub31_sub1 = class313.method3273();
        aClass65_1829.method509(-1, class248_sub31_sub1, l);
        if (is != null)
            is[0] -= (((Node_Sub31_Sub1) class248_sub31_sub1).aByteArray9734).length;
        return class248_sub31_sub1;
    }

    private final Node_Sub31_Sub1 method1364(int[] is, byte i, int i_5_, int i_6_) {
        anInt1822++;
        int i_7_ = (i_6_ >>> 140226924 | 0xfffd & i_6_ << 337066884) ^ i_5_;
        i_7_ |= i_6_ << -590873232;
        long l = 0x100000000L ^ (long) i_7_;
        Node_Sub31_Sub1 class248_sub31_sub1 = (Node_Sub31_Sub1) aClass65_1829.method501(l, (byte) 31);
        if (class248_sub31_sub1 != null)
            return class248_sub31_sub1;
        if (is != null && is[0] <= 0)
            return null;
        Node_Sub34 class248_sub34 = (Node_Sub34) aClass65_1823.method501(l, (byte) 31);
        if (class248_sub34 == null) {
            class248_sub34 = Node_Sub34.method2579(aClass381_1828, i_6_, i_5_);
            if (class248_sub34 == null)
                return null;
            aClass65_1823.method509(-1, class248_sub34, l);
        }
        class248_sub31_sub1 = class248_sub34.method2576(is);
        if (i < 45)
            method1365(null, (byte) 112, 1);
        if (class248_sub31_sub1 == null)
            return null;
        class248_sub34.remove(true);
        aClass65_1829.method509(-1, class248_sub31_sub1, l);
        return class248_sub31_sub1;
    }

    final Node_Sub31_Sub1 method1365(int[] is, byte i, int i_8_) {
        anInt1826++;
        if (aClass381_1828.method3902(0) == 1)
            return method1364(is, (byte) 88, i_8_, 0);
        if (aClass381_1828.method3899(i_8_, 0) == 1)
            return method1364(is, (byte) 81, 0, i_8_);
        int i_9_ = 39 / ((i - -11) / 41);
        throw new RuntimeException();
    }

    Class154(Class381 class381, Class381 class381_10_) {
        aClass381_1827 = class381;
        aClass381_1828 = class381_10_;
    }
}
