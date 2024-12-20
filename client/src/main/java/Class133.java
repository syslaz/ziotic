/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class133 implements Interface12 {
    static int anInt5034;
    static long aLong5035;
    static int anInt5036;
    static Class322 aClass322_5037;
    static int anInt5038;
    static Color[] aColorArray5039 = {new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
    private String aString5040;
    static IncommingOpcode aIncommingOpcode_5041 = new IncommingOpcode(36, 6);
    static int anInt5042;
    private Class381 aClass381_5043;
    static float[] aFloatArray5044 = {1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
    static int anInt5045 = -1;
    static int anInt5046;

    public static void method1219(boolean bool) {
        aColorArray5039 = null;
        aIncommingOpcode_5041 = null;
        aFloatArray5044 = null;
        if (bool != false)
            aClass322_5037 = null;
        aClass322_5037 = null;
    }

    public final Class298 method37(byte i) {
        if (i >= -120)
            aClass381_5043 = null;
        anInt5042++;
        return Class298.aClass298_3477;
    }

    public final int method36(int i) {
        anInt5034++;
        if (i != -20701)
            return -85;
        if (aClass381_5043.method3929(aString5040, i ^ 0x50dc))
            return 100;
        return 0;
    }

    static final boolean method1220(int i, boolean bool) {
        anInt5046++;
        if (bool != true)
            return false;
        if ((i ^ 0xffffffff) > -5 || (i ^ 0xffffffff) < -9)
            return false;
        return true;
    }

    static final void method1221(Class346_Sub2 class346_sub2, boolean bool) {
        anInt5036++;
        if (bool != true)
            aClass322_5037 = null;
        ((Class346_Sub2) class346_sub2).aEntity_8258 = null;
        if (OutputStream_Sub2.anInt93 < 20) {
            r_Sub1.aClass360_10268.method3811(class346_sub2, 0);
            OutputStream_Sub2.anInt93++;
        }
    }

    Class133(Class381 class381, String string) {
        aString5040 = string;
        aClass381_5043 = class381;
    }
}
