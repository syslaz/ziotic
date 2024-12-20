/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class194 {
    static int anInt2221;
    private long aLong2222;
    static int anInt2223;
    static int anInt2224;
    static int anInt2225;
    static int anInt2226;
    static int anInt2227;
    static int anInt2228;
    private int anInt2229;

    final int method1659(byte i) {
        anInt2226++;
        if (i != -98)
            anInt2229 = -33;
        return anInt2229;
    }

    static final int method1660(int i, int i_0_, boolean bool) {
        anInt2221++;
        double d = Math.log((double) i) / Math.log(2.0);
        if (bool != true)
            return -10;
        double d_1_ = Math.log((double) i_0_) / Math.log(2.0);
        double d_2_ = (-d_1_ + d) * Math.random() + d_1_;
        return (int) (Math.pow(2.0, d_2_) + 0.5);
    }

    final Class89 method1661(int i, int i_3_) {
        if (i != -24713)
            return null;
        anInt2228++;
        return Class89.method670(method1663(i_3_, (byte) -81), (byte) 83);
    }

    private final void method1662(Class89 class89, byte i) {
        anInt2225++;
        if (i != 70)
            method1662(null, (byte) -48);
        aLong2222 |= (long) (((Class89) class89).anInt1090 << anInt2229++ * Class89.anInt1104);
    }

    private final int method1663(int i, byte i_4_) {
        if (i_4_ != -81)
            aLong2222 = -75L;
        anInt2224++;
        return (int) (aLong2222 >> Class89.anInt1104 * i) & 0xf;
    }

    static final int method1664(boolean bool, byte i, int i_5_, int i_6_) {
        anInt2223++;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool, i_5_, (byte) -60);
        if (class248_sub33 == null)
            return 0;
        int i_7_ = 52 % ((35 - i) / 47);
        if (i_6_ < 0 || ((Node_Sub33) class248_sub33).anIntArray7204.length <= i_6_)
            return 0;
        return ((Node_Sub33) class248_sub33).anIntArray7204[i_6_];
    }

    Class194(Class89 class89) {
        aLong2222 = (long) ((Class89) class89).anInt1090;
        anInt2229 = 1;
    }

    Class194(Class89[] class89s) {
        for (int i = 0; class89s.length > i; i++)
            method1662(class89s[i], (byte) 70);
    }

    static final void method1665(byte i, Node_Sub36 class248_sub36, int i_8_, int i_9_, int i_10_) {
        anInt2227++;
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, i_8_);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_10_, 66);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(i_9_, i + 35);
        if (i == 30) {
            /* empty */
        }
    }
}
