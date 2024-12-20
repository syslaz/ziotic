/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class71 implements Interface12 {
    static int anInt5029;
    static int anInt5030;
    static int anInt5031;
    static Class293 aClass293_5032 = new Class293();
    private Class381 aClass381_5033;

    public final Class298 method37(byte i) {
        if (i > -120)
            aClass293_5032 = null;
        anInt5031++;
        return Class298.aClass298_3474;
    }

    public static void method537(byte i) {
        aClass293_5032 = null;
        if (i > -56)
            aClass293_5032 = null;
    }

    public final int method36(int i) {
        anInt5029++;
        if (i != -20701)
            method37((byte) 20);
        if (aClass381_5033.method3914(23094821))
            return 100;
        return aClass381_5033.method3933((byte) -122);
    }

    Class71(Class381 class381) {
        aClass381_5033 = class381;
    }

    static final void method538(boolean bool, String string) {
        anInt5030++;
        if (!string.equals("")) {
            Node_Sub14_Sub26.anInt9430++;
            if (bool == false) {
                Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class382.aOutgoingOpcode_4701);
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-97, Class208.method1710(true, string));
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -77);
                Class226_Sub3.method1814(class248_sub36, 0);
            }
        }
    }
}
