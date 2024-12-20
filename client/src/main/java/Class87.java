/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class87 {
    static Class208 aClass208_1082 = new Class208(4, 1);
    static int anInt1083;
    static Class168 aClass168_1084 = new Class168(7, 0, 1, 1);
    static Class129 aClass129_1085;

    static final void method661(byte i, boolean bool) {
        anInt1083++;
        if (bool) {
            if (Class179.anInt2084 != -1)
                Class136_Sub2.method1257(122, Class179.anInt2084);
            for (Node_Sub12 class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method510(true); class248_sub12 != null; class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method512(false))) {
                if (!class248_sub12.hasNext((byte) 78)) {
                    class248_sub12 = ((Node_Sub12) Class109.aClass65_1375.method510(true));
                    if (class248_sub12 == null)
                        break;
                }
                Class106.method749(false, false, true, class248_sub12);
            }
            Class179.anInt2084 = -1;
            Class109.aClass65_1375 = new Class65(8);
            Class172.method1559((byte) 123);
            Class179.anInt2084 = Class160.anInt1891;
            Node_Sub14_Sub38.method2392(false, -68);
            Class60.method472(-101);
            Class47.method344(Class179.anInt2084);
        }
        Class337.aBoolean3934 = true;
        if (i <= 76)
            aClass168_1084 = null;
    }

    public static void method662(byte i) {
        aClass208_1082 = null;
        aClass129_1085 = null;
        aClass168_1084 = null;
        if (i != -23)
            method661((byte) 78, false);
    }
}
