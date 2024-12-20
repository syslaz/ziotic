/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class12 {
    private Class381 aClass381_248;
    static Class215 aClass215_249 = null;
    static int anInt250;
    private Class308 aClass308_251;
    private Class381 aClass381_252;
    static int anInt253;
    static int anInt254;

    public static void method209(int i) {
        aClass215_249 = null;
        if (i < 102)
            aClass215_249 = null;
    }

    private final Class308 method210(boolean bool) {
        if (aClass308_251 == null)
            aClass308_251 = new Class308();
        anInt254++;
        if (bool != false)
            aClass308_251 = null;
        return aClass308_251;
    }

    final Interface10 method211(Interface11 interface11, byte i) {
        anInt253++;
        if (interface11 == null)
            return null;
        Class208 class208 = interface11.method35((byte) 62);
        if (Class344.aClass208_4082 == class208)
            return new Class376((Class115) interface11);
        if (class208 == Class87.aClass208_1082)
            return new Class28(method210(false), (Class206) interface11);
        if (Class94.aClass208_1224 == class208)
            return new Class81(aClass381_248, (Class297) interface11);
        if (class208 == Class352.aClass208_4189)
            return new Class81_Sub1(aClass381_248, (Class297_Sub1) interface11);
        if (Class299.aClass208_3492 == class208)
            return new Class301_Sub2(aClass381_248, aClass381_252, (Class225_Sub2) interface11);
        if (Class160.aClass208_1887 == class208)
            return new Class301_Sub1(aClass381_248, aClass381_252, (Class225_Sub3) interface11);
        if (i > -28)
            aClass381_252 = null;
        if (Class226_Sub1_Sub1.aClass208_8803 == class208)
            return new Class301_Sub3(aClass381_248, aClass381_252, (Class225_Sub1) interface11);
        if (Class276.aClass208_3207 == class208)
            return new Class33(aClass381_248, aClass381_252, (Class165) interface11);
        if (class208 == Class169.aClass208_1973)
            return new Class267(aClass381_248, (Class273) interface11);
        if (Class377.aClass208_4621 == class208)
            return new Class301_Sub3_Sub1(aClass381_248, aClass381_252, (Class225_Sub1_Sub1) interface11);
        return null;
    }

    Class12(Class381 class381, Class381 class381_0_) {
        aClass381_248 = class381;
        aClass381_252 = class381_0_;
    }
}
