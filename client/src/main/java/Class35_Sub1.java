/* Class35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.raa;

final class Class35_Sub1 extends Class35 implements Interface21_Impl1 {
    private int anInt5274;
    private int anInt5275;
    private IDirect3DVolumeTexture anIDirect3DVolumeTexture5276;
    private int anInt5277;

    public final void method78(int i, Class171 class171) {
        super.method78(i, class171);
    }

    Class35_Sub1(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class264 class264, int i, int i_0_, int i_1_, byte[] is) {
        super(var_ha_Sub3_Sub2, class264, Class228.aClass228_2573, false, i_1_ * i * i_0_);
        anInt5277 = i_1_;
        anInt5275 = i_0_;
        anInt5274 = i;
        anIDirect3DVolumeTexture5276 = (((ha_Sub3_Sub2) ((Class35_Sub1) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(i, i_0_, i_1_, 1, 0, ha_Sub3_Sub2.method1063((byte) 39, ((Class35_Sub1) this).aClass228_399, class264), 1));
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub1) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        int i_2_ = anIDirect3DVolumeTexture5276.LockBox(0, 0, 0, 0, i, i_0_, i_1_, 0, pixelbuffer);
        if (raa.a(i_2_, (byte) 106)) {
            int i_3_ = (((Class264) ((Class35_Sub1) this).aClass264_400).anInt2991 * anInt5274);
            int i_4_ = anInt5275 * i_3_;
            int i_5_ = pixelbuffer.getSlicePitch();
            if (i_4_ == i_5_)
                pixelbuffer.a(is, 0, 0, anInt5277 * (anInt5275 * i_3_));
            else {
                int i_6_ = pixelbuffer.getRowPitch();
                if (i_6_ == i_3_) {
                    for (int i_7_ = 0; i_7_ < anInt5277; i_7_++)
                        pixelbuffer.a(is, i_7_ * i_4_, i_7_ * i_5_, i_4_);
                } else {
                    for (int i_8_ = 0; i_8_ < anInt5277; i_8_++) {
                        for (int i_9_ = 0; (anInt5275 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
                            pixelbuffer.a(is, i_4_ * i_8_ - -(i_3_ * i_9_), i_6_ * i_9_ + i_5_ * i_8_, i_3_);
                    }
                }
            }
            anIDirect3DVolumeTexture5276.UnlockBox(0);
        }
    }

    public final void method79(int i) {
        ((Class35_Sub1) this).aHa_Sub3_Sub2_398.method1066(this, (byte) -76);
        if (i != 32073)
            anInt5277 = 54;
    }

    final IDirect3DBaseTexture method280(int i) {
        if (i > -75)
            anInt5274 = 45;
        return anIDirect3DVolumeTexture5276;
    }
}
