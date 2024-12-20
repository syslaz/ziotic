/* Class225_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class225_Sub2 extends Class225 {
    int anInt8463;
    int anInt8464;
    static int anInt8465;
    static Class293 aClass293_8466 = new Class293();
    static int anInt8467;
    static int anInt8468;
    static int anInt8469;

    static final boolean method1793(Class381 class381, Class381 class381_0_, Node_Sub15_Sub1 class248_sub15_sub1, int i, Class381 class381_1_, Class345 class345) {
        Node_Sub13.aClass381_6967 = class381;
        Class281.aClass345_3273 = class345;
        Class44.aClass381_558 = class381_1_;
        Class162.aClass381_1910 = class381_0_;
        Class161.aClass248_Sub15_Sub1_1895 = class248_sub15_sub1;
        anInt8465++;
        Node_Sub8_Sub3.anIntArray8924 = new int[16];
        if (i != -1)
            return true;
        for (int i_2_ = 0; i_2_ < 16; i_2_++)
            Node_Sub8_Sub3.anIntArray8924[i_2_] = 255;
        return true;
    }

    static final void method1794(int i, int i_3_) {
        anInt8468++;
        if (i_3_ == 16) {
            if ((Class332.anInt3883 ^ 0xffffffff) != -1)
                Node_Sub2_Sub2.anInt8839 = i;
            else
                Class161.aClass248_Sub15_Sub1_1895.method2413(true, i);
        }
    }

    public final Class208 method35(byte i) {
        if (i != 62)
            return null;
        anInt8469++;
        return Class299.aClass208_3492;
    }

    static final void method1795(boolean bool) {
        for (Class346_Sub2 class346_sub2 = ((Class346_Sub2) Node_Sub8_Sub14_Sub1.aClass360_10291.method3814(bool)); class346_sub2 != null; class346_sub2 = ((Class346_Sub2) Node_Sub8_Sub14_Sub1.aClass360_10291.method3814(bool)))
            Class133.method1221(class346_sub2, !bool);
        anInt8467++;
        int i;
        int i_4_;
        if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) ^ 0xffffffff) != -2)
            i = i_4_ = Class84_Sub5.anInt5425;
        else {
            i = 0;
            i_4_ = 3;
        }
        client.method115();
        for (int i_5_ = i; i_4_ >= i_5_; i_5_++) {
            client.method116();
            client.method112(i_5_);
            client.method109(i_5_);
        }
        client.method110();
        client.method105();
    }

    public static void method1796(int i) {
        aClass293_8466 = null;
        if (i != -3706)
            method1793(null, null, null, 10, null, null);
    }

    Class225_Sub2(Class186 class186, Class272 class272, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        super(class186, class272, i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
        ((Class225_Sub2) this).anInt8463 = i_13_;
        ((Class225_Sub2) this).anInt8464 = i_12_;
    }
}
