/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class228 {
    static int anInt2566;
    static Class228 aClass228_2567 = new Class228(1);
    static int anInt2568;
    static int anInt2569;
    int anInt2570;
    static Class228 aClass228_2571 = new Class228(2);
    static Class228 aClass228_2572 = new Class228(4);
    static Class228 aClass228_2573 = new Class228(1);
    static Class228 aClass228_2574 = new Class228(2);
    static Class228 aClass228_2575 = new Class228(4);
    static Class228 aClass228_2576 = new Class228(2);
    static Class228 aClass228_2577 = new Class228(4);
    static int anInt2578 = 0;

    public static void method1826(int i) {
        aClass228_2577 = null;
        aClass228_2567 = null;
        aClass228_2576 = null;
        aClass228_2575 = null;
        aClass228_2574 = null;
        aClass228_2571 = null;
        aClass228_2573 = null;
        aClass228_2572 = null;
        if (i != 2)
            method1826(-9);
    }

    static final String method1827(int i) {
        int i_0_ = -112 / ((45 - i) / 63);
        anInt2569++;
        if (Class145.aBoolean1721 || Class300.aClass248_Sub8_Sub11_3498 == null)
            return "";
        if (((((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).aString9001) == null || (((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).aString9001.length() ^ 0xffffffff) == -1) && (((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).aString8988) != null && ((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).aString8988.length() > 0)
            return (((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).aString8988);
        return (((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).aString9001);
    }

    static final byte[] method1828(float f, float f_1_, float f_2_, byte i, Class44 class44, int i_3_, float f_4_, int i_5_, int i_6_, int i_7_, float f_8_) {
        anInt2568++;
        byte[] is = new byte[i_3_ * i_7_ * i_5_];
        Class249.method2698(f_8_, i_6_, 0, f, f_1_, i_3_, class44, 0, i_7_, f_4_, i_5_, f_2_, is);
        if (i < 111)
            aClass228_2573 = null;
        return is;
    }

    public final String toString() {
        anInt2566++;
        throw new IllegalStateException();
    }

    private Class228(int i) {
        ((Class228) this).anInt2570 = i;
    }
}
