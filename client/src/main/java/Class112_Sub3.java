/* Class112_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class112_Sub3 extends Class112 implements Interface21_Impl3 {
    static int anInt8639;
    static int anInt8640;
    static Class229 aClass229_8641;
    static int anInt8642;

    public static void method802(boolean bool) {
        aClass229_8641 = null;
        if (bool != true)
            aClass229_8641 = null;
    }

    Class112_Sub3(ha_Sub3_Sub1 var_ha_Sub3_Sub1, int i, boolean bool, int[][] is) {
        super(var_ha_Sub3_Sub1, 34067, Class120.aClass264_1508, Class228.aClass228_2573, 6 * (i * i), bool);
        ((Class112) this).aHa_Sub3_Sub1_5200.method929(this, -8423);
        if (!bool) {
            for (int i_0_ = 0; i_0_ < 6; i_0_++)
                OpenGL.glTexImage2Di(34069 + i_0_, 0, this.method790(true), i, i, 0, Node_Sub42_Sub2.method2633(((Class112) this).aClass264_5224, true), (((ha_Sub3_Sub1) ((Class112) this).aHa_Sub3_Sub1_5200).anInt8759), is[i_0_], 0);
        } else {
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7; i_1_++)
                this.method796(is[i_1_], i_1_ + 34069, i, false, i);
        }
    }

    static final void method803(String string, String string_2_, int i, int i_3_) {
        if (i <= 101)
            method803(null, null, -6, 32);
        Class312.anInt3627 = i_3_;
        anInt8639++;
        Class154.loginType = 2;
        Class42.method307(false, string_2_, (byte) 16, string);
    }
}
