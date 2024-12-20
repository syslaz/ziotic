/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33 implements Interface10 {
    static int anInt4896;
    private Class381 aClass381_4897;
    static int anInt4898;
    private Class48 aClass48_4899;
    private Class381 aClass381_4900;
    private Class165 aClass165_4901;
    static int anInt4902;

    public final void method32(boolean bool, byte i) {
        if (i > -60)
            method32(true, (byte) -52);
        if (bool) {
            int i_0_ = ((((Class165) aClass165_4901).aClass186_4967.method1628(((Class165) aClass165_4901).anInt4961, 0, Class226_Sub1.anInt6661)) - -((Class165) aClass165_4901).anInt4965);
            int i_1_ = ((((Class165) aClass165_4901).aClass272_4962.method2838((byte) 116, s_Sub2.anInt7946, ((Class165) aClass165_4901).anInt4964)) - -((Class165) aClass165_4901).anInt4970);
            aClass48_4899.method370(i_1_, ((Class165) aClass165_4901).anInt4968, null, ((Class165) aClass165_4901).aString4957, 0, null, ((Class165) aClass165_4901).anInt4960, i_0_, ((Class165) aClass165_4901).anInt4964, ((Class165) aClass165_4901).anInt4959, 0, ((Class165) aClass165_4901).anInt4971, null, 0, ((Class165) aClass165_4901).anInt4963, ((Class165) aClass165_4901).anInt4961);
        }
        anInt4902++;
    }

    public final void method34(byte i) {
        if (i <= 34)
            aClass381_4900 = null;
        anInt4898++;
        Class285 class285 = Class116_Sub1.method1102(aClass381_4900, 13580, ((Class165) aClass165_4901).anInt4972);
        aClass48_4899 = Class287.aHa3381.a(class285, Class157.method1391(aClass381_4897, (((Class165) aClass165_4901).anInt4972)), true);
    }

    public final boolean method33(int i) {
        anInt4896++;
        boolean bool = true;
        if (!aClass381_4897.method3920(((Class165) aClass165_4901).anInt4972, -118))
            bool = false;
        if (!aClass381_4900.method3920(((Class165) aClass165_4901).anInt4972, -107))
            bool = false;
        if (i != 5618)
            method33(-51);
        return bool;
    }

    Class33(Class381 class381, Class381 class381_2_, Class165 class165) {
        aClass165_4901 = class165;
        aClass381_4900 = class381_2_;
        aClass381_4897 = class381;
    }
}
