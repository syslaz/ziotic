/* Class275_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

import java.awt.*;

final class Class275_Sub2 extends Class275 implements Interface18_Impl2 {
    static int anInt8601;
    static Class187[] aClass187Array8602 = new Class187[6];
    static Font aFont8603;
    private Class228 aClass228_8604;
    static int anInt8605;
    static int anInt8606;
    static float[] aFloatArray8607 = new float[2];
    static int anInt8608;
    static int anInt8609;
    static int anInt8610;

    public final void method3(boolean bool) {
        anInt8601++;
        super.method3(bool);
    }

    public final void method48(int i, byte i_0_) {
        super.method48(((Class228) aClass228_8604).anInt2570 * i, i_0_);
        anInt8608++;
    }

    public static void method2852(int i) {
        aFloatArray8607 = null;
        aFont8603 = null;
        if (i != 34963)
            method2852(36);
        aClass187Array8602 = null;
    }

    public final boolean method50(int i) {
        anInt8609++;
        if (i != -17694)
            aClass228_8604 = null;
        return super.method2841(-66, (((ha_Sub3_Sub1) ((Class275) this).aHa_Sub3_Sub1_5150).aMapBuffer8750));
    }

    Class275_Sub2(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class228 class228, boolean bool) {
        super(var_ha_Sub3_Sub1, 34963, bool);
        aClass228_8604 = class228;
    }

    public final Buffer method47(int i, boolean bool) {
        if (i != 30907)
            aFloatArray8607 = null;
        anInt8610++;
        return super.method2843((((ha_Sub3_Sub1) ((Class275) this).aHa_Sub3_Sub1_5150).aMapBuffer8750), (byte) -67, bool);
    }

    public final Class228 method49(byte i) {
        anInt8606++;
        if (i != 81)
            return null;
        return aClass228_8604;
    }

    public final int method57(int i) {
        if (i != -1)
            return 52;
        anInt8605++;
        return super.method57(-1);
    }
}
