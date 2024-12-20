/* Class248_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class RSInterface extends Node {
    RSInterface2 rsInter;
    int anInt6842;
    int anInt6843;
    int anInt6844;
    Object[] interfaceOpcodes;
    static int anInt6846;
    static int anInt6847;
    static int anInt6848;
    int anInt6849;
    RSInterface2 aClass354_6850;
    String aString6851;
    boolean aBoolean6852;
    static int anInt6853;
    int anInt6854;
    int anInt6855;
    static int anInt6856;
    static int[] anIntArray6857 = new int[1];

    public static void method2012(int i) {
        if (i != -1333244320)
            anIntArray6857 = null;
        anIntArray6857 = null;
    }

    static final Class30 method2013(int i, int i_0_, String string) {
        anInt6853++;
        if (i_0_ != 17509)
            return null;
        Class30 class30;
        try {
            class30 = (Class30) Class.forName("Class30_Sub2").newInstance();
        } catch (Throwable throwable) {
            class30 = new Class30_Sub1();
        }
        ((Class30) class30).anInt373 = i;
        ((Class30) class30).aString374 = string;
        return class30;
    }

    static final void method2014(int i, Class381 class381) {
        Class122.aClass381_1519 = class381;
        anInt6846++;
        if (i < 99)
            method2016(-55, 19, null);
    }

    static final void method2015(boolean bool) {
        if (bool != false)
            method2013(-62, -31, null);
        anInt6856++;
        if (Node_Sub8_Sub13.method2095(-108)) {
            if (Class162.aStringArray1909 == null)
                za_Sub2.method2694((byte) -107);
            Class65.anInt894 = 0;
            Class261.aBoolean2973 = true;
        }
    }

    public RSInterface() {
        /* empty */
    }

    static final int method2016(int i, int i_1_, Random random) {
        anInt6847++;
        if ((i ^ 0xffffffff) >= i_1_)
            throw new IllegalArgumentException();
        if (Class343.method3508(i, -31218))
            return (int) ((long) i * (0xffffffffL & (long) random.nextInt()) >> -1333244320);
        int i_2_ = -2147483648 - (int) (4294967296L % (long) i);
        int i_3_;
        do
            i_3_ = random.nextInt(); while ((i_3_ ^ 0xffffffff) <= (i_2_ ^ 0xffffffff));
        return Class346_Sub7_Sub1_Sub2.method3594(i, -429911713, i_3_);
    }
}
