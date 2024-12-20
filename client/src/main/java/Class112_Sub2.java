/* Class112_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class112_Sub2 extends Class112 implements Interface21_Impl1 {
    static OutgoingOpcode aOutgoingOpcode_8632 = new OutgoingOpcode(46, 3);
    private int anInt8633;
    private int anInt8634;
    static OutgoingOpcode aOutgoingOpcode_8635 = new OutgoingOpcode(7, 3);
    private int anInt8636;
    static int anInt8637;
    static WorldAddress demoAddress;

    Class112_Sub2(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class264 class264, int i, int i_0_, int i_1_, byte[] is) {
        super(var_ha_Sub3_Sub1, 32879, class264, Class228.aClass228_2573, i_1_ * i * i_0_, false);
        anInt8634 = i_0_;
        anInt8636 = i;
        anInt8633 = i_1_;
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(((Class112) this).anInt5216, 0, this.method790(true), anInt8636, anInt8634, anInt8633, 0, Node_Sub42_Sub2.method2633((((Class112) this).aClass264_5224), true), 5121, is, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    static final boolean method800(boolean bool, int i, int i_2_) {
        if (bool != true)
            demoAddress = null;
        anInt8637++;
        if ((i_2_ & 0x800 ^ 0xffffffff) == -1 || (0x37 & i) == 0)
            return false;
        return true;
    }

    public static void method801(int i) {
        aOutgoingOpcode_8635 = null;
        if (i != 3317)
            method800(false, 100, 127);
        demoAddress = null;
        aOutgoingOpcode_8632 = null;
    }
}
