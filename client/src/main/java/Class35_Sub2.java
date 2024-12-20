/* Class35_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.raa;

final class Class35_Sub2 extends Class35 implements Interface21_Impl3 {
    private int anInt5278;
    private IDirect3DCubeTexture anIDirect3DCubeTexture5279;

    public final void method79(int i) {
        ((Class35_Sub2) this).aHa_Sub3_Sub2_398.method1072(this, false);
        if (i != 32073)
            method280(-40);
    }

    public final void method78(int i, Class171 class171) {
        super.method78(i, class171);
    }

    final IDirect3DBaseTexture method280(int i) {
        if (i >= -75)
            anInt5278 = -13;
        return anIDirect3DCubeTexture5279;
    }

    Class35_Sub2(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, boolean bool, int[][] is) {
        super(var_ha_Sub3_Sub2, Class120.aClass264_1508, Class228.aClass228_2573, bool && ((ha_Sub3_Sub2) var_ha_Sub3_Sub2).aBoolean8782, i * (i * 6));
        anInt5278 = i;
        if (((Class35_Sub2) this).aBoolean397)
            anIDirect3DCubeTexture5279 = ((ha_Sub3_Sub2) ((Class35_Sub2) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(anInt5278, 0, 1024, 21, 1);
        else
            anIDirect3DCubeTexture5279 = ((ha_Sub3_Sub2) ((Class35_Sub2) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(anInt5278, 1, 0, 21, 1);
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub2) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        for (int i_0_ = 0; 6 > i_0_; i_0_++) {
            int i_1_ = anIDirect3DCubeTexture5279.LockRect(i_0_, 0, 0, 0, anInt5278, anInt5278, 0, pixelbuffer);
            if (raa.a(i_1_, (byte) 125)) {
                int i_2_ = pixelbuffer.getRowPitch();
                if (i_2_ == 4 * anInt5278)
                    pixelbuffer.a(is[i_0_], 0, 0, anInt5278 * anInt5278);
                else {
                    for (int i_3_ = 0; i_3_ < anInt5278; i_3_++)
                        pixelbuffer.a(is[i_0_], anInt5278 * i_3_, i_2_ * i_3_, anInt5278);
                }
                anIDirect3DCubeTexture5279.UnlockRect(i_0_, 0);
            }
        }
    }
}
