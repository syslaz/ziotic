/* Class35_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.raa;

final class Class35_Sub3 extends Class35 implements Interface21_Impl2 {
    private IDirect3DTexture anIDirect3DTexture5280;
    boolean aBoolean5281;
    private int anInt5282;
    boolean aBoolean5283;
    private int anInt5284;

    public final float method64(int i, float f) {
        if (i != -2092)
            return -0.25645807F;
        return f / (float) anInt5284;
    }

    public final int method63(byte i) {
        int i_0_ = -126 % ((60 - i) / 54);
        return anInt5284;
    }

    Class35_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class264 class264, int i, int i_1_, boolean bool, byte[] is, int i_2_, int i_3_) {
        super(var_ha_Sub3_Sub2, class264, Class228.aClass228_2573, bool && ((ha_Sub3_Sub2) var_ha_Sub3_Sub2).aBoolean8789, i_1_ * i);
        if (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aBoolean8777) {
            anInt5282 = i_1_;
            anInt5284 = i;
        } else {
            anInt5284 = Class136_Sub4.method1269(i, (byte) -128);
            anInt5282 = Class136_Sub4.method1269(i_1_, (byte) -128);
        }
        if (!bool)
            anIDirect3DTexture5280 = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(anInt5284, anInt5282, 1, 0, ha_Sub3_Sub2.method1063((byte) 24, Class228.aClass228_2573, (((Class35_Sub3) this).aClass264_400)), 1));
        else
            anIDirect3DTexture5280 = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(anInt5284, anInt5282, 0, 1024, ha_Sub3_Sub2.method1063((byte) 19, Class228.aClass228_2573, (((Class35_Sub3) this).aClass264_400)), 1));
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        int i_4_ = anIDirect3DTexture5280.LockRect(0, 0, 0, i, i_1_, 0, pixelbuffer);
        if (raa.a(i_4_, (byte) 123)) {
            if ((i_3_ ^ 0xffffffff) == -1)
                i_3_ = i;
            i *= ((Class264) ((Class35_Sub3) this).aClass264_400).anInt2991;
            i_3_ *= ((Class264) ((Class35_Sub3) this).aClass264_400).anInt2991;
            int i_5_ = pixelbuffer.getRowPitch();
            if ((i ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && i == i_3_)
                pixelbuffer.a(is, i_2_, 0, i_1_ * i);
            else {
                for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
                    pixelbuffer.a(is, i_3_ * i_6_ + i_2_, i_5_ * i_6_, i);
            }
            anIDirect3DTexture5280.UnlockRect(0);
        }
    }

    public final void method68(int i, Class264 class264, int i_7_, byte i_8_, int i_9_, int i_10_, int i_11_, int i_12_, byte[] is) {
        if (class264 != ((Class35_Sub3) this).aClass264_400 || Class228.aClass228_2573 != ((Class35_Sub3) this).aClass228_399)
            throw new RuntimeException();
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        if (i_8_ > -114)
            method69(69, 88, null, 3, -125, -34, -32);
        int i_13_ = anIDirect3DTexture5280.LockRect(0, i_10_, i_12_, i_7_, i_11_, 0, pixelbuffer);
        if (raa.a(i_13_, (byte) 127)) {
            i *= ((Class264) ((Class35_Sub3) this).aClass264_400).anInt2991;
            i_7_ *= ((Class264) ((Class35_Sub3) this).aClass264_400).anInt2991;
            int i_14_ = pixelbuffer.getRowPitch();
            if ((i_7_ ^ 0xffffffff) == (i_14_ ^ 0xffffffff) && i == i_7_)
                pixelbuffer.a(is, i_9_, 0, i_11_ * i_7_);
            else {
                for (int i_15_ = 0; i_15_ < i_11_; i_15_++)
                    pixelbuffer.a(is, i_9_ - -(i * i_15_), i_15_ * i_14_, i_7_);
            }
            anIDirect3DTexture5280.UnlockRect(0);
        }
    }

    public final void method69(int i, int i_16_, int[] is, int i_17_, int i_18_, int i_19_, int i_20_) {
        if (Class120.aClass264_1508 != ((Class35_Sub3) this).aClass264_400 || Class228.aClass228_2573 != ((Class35_Sub3) this).aClass228_399)
            throw new RuntimeException();
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        if (i_19_ != 12679)
            method71(-1.4435686F, -36);
        int i_21_ = anIDirect3DTexture5280.LockRect(0, i, i_17_, i_20_, i_16_, 16, pixelbuffer);
        if (raa.a(i_21_, (byte) 110)) {
            int i_22_ = pixelbuffer.getRowPitch();
            if (4 * i_20_ == i_22_)
                pixelbuffer.b(is, i_18_, 0, is.length);
            else {
                for (int i_23_ = 0; (i_16_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++)
                    pixelbuffer.b(is, i_18_ - -(i_23_ * i_20_), i_22_ * i_23_, i_20_);
            }
            anIDirect3DTexture5280.UnlockRect(0);
        }
    }

    public final void method70(int i, boolean bool, boolean bool_24_) {
        ((Class35_Sub3) this).aBoolean5283 = bool_24_;
        if (i != 1645)
            anIDirect3DTexture5280 = null;
        ((Class35_Sub3) this).aBoolean5281 = bool;
    }

    final IDirect3DBaseTexture method280(int i) {
        if (i > -75)
            method69(25, -1, null, 117, 125, -109, 50);
        return anIDirect3DTexture5280;
    }

    Class35_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, Class264 class264, Class228 class228, int i, int i_25_) {
        super(var_ha_Sub3_Sub2, class264, class228, false, i * i_25_);
        if (!((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aBoolean8777) {
            anInt5284 = Class136_Sub4.method1269(i, (byte) -128);
            anInt5282 = Class136_Sub4.method1269(i_25_, (byte) -128);
        } else {
            anInt5282 = i_25_;
            anInt5284 = i;
        }
        anIDirect3DTexture5280 = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(i, i_25_, 1, 0, ha_Sub3_Sub2.method1063((byte) 80, ((Class35_Sub3) this).aClass228_399, ((Class35_Sub3) this).aClass264_400), 1));
    }

    public final void method65(int i, int i_26_, int i_27_, int i_28_, int i_29_, int[] is, int i_30_, byte i_31_) {
        if (((Class35_Sub3) this).aClass264_400 != Class120.aClass264_1508 || ((Class35_Sub3) this).aClass228_399 != Class228.aClass228_2573)
            throw new RuntimeException();
        if (i_31_ < 57)
            method280(55);
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        int i_32_ = anIDirect3DTexture5280.LockRect(0, i_27_, i, i_29_, i_30_, 0, pixelbuffer);
        if (raa.a(i_32_, (byte) 116)) {
            int i_33_ = pixelbuffer.getRowPitch();
            if (4 * i_29_ != i_33_ || (i_29_ ^ 0xffffffff) != (i_26_ ^ 0xffffffff)) {
                for (int i_34_ = 0; i_30_ > i_34_; i_34_++)
                    pixelbuffer.a(is, i_28_ - -(i_34_ * i_26_), i_33_ * i_34_, i_29_);
            } else
                pixelbuffer.a(is, i_28_, 0, i_29_ * i_30_);
            anIDirect3DTexture5280.UnlockRect(0);
        }
    }

    Class35_Sub3(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i, int i_35_, boolean bool, int[] is, int i_36_, int i_37_) {
        super(var_ha_Sub3_Sub2, Class120.aClass264_1508, Class228.aClass228_2573, bool && ((ha_Sub3_Sub2) var_ha_Sub3_Sub2).aBoolean8789, i * i_35_);
        if (!((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aBoolean8777) {
            anInt5284 = Class136_Sub4.method1269(i, (byte) -128);
            anInt5282 = Class136_Sub4.method1269(i_35_, (byte) -128);
        } else {
            anInt5282 = i_35_;
            anInt5284 = i;
        }
        if (!bool)
            anIDirect3DTexture5280 = ((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(anInt5284, anInt5282, 1, 0, 21, 1);
        else
            anIDirect3DTexture5280 = ((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).anIDirect3DDevice8781.a(anInt5284, anInt5282, 0, 1024, 21, 1);
        PixelBuffer pixelbuffer = (((ha_Sub3_Sub2) ((Class35_Sub3) this).aHa_Sub3_Sub2_398).aPixelBuffer8773);
        int i_38_ = anIDirect3DTexture5280.LockRect(0, 0, 0, i, i_35_, 0, pixelbuffer);
        if (raa.a(i_38_, (byte) 117)) {
            if (0 == i_37_)
                i_37_ = i;
            int i_39_ = pixelbuffer.getRowPitch();
            if ((i_39_ ^ 0xffffffff) == (4 * i ^ 0xffffffff) && (i_37_ ^ 0xffffffff) == (i ^ 0xffffffff))
                pixelbuffer.a(is, i_36_, 0, i * i_35_);
            else {
                for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_40_++)
                    pixelbuffer.a(is, i_37_ * i_40_ + i_36_, i_40_ * i_39_, i);
            }
            anIDirect3DTexture5280.UnlockRect(0);
        }
    }

    public final float method71(float f, int i) {
        int i_41_ = -83 % ((i - -25) / 45);
        return f / (float) anInt5282;
    }

    public final void method79(int i) {
        ((Class35_Sub3) this).aHa_Sub3_Sub2_398.method1068(this, (byte) 84);
        if (i != 32073)
            anIDirect3DTexture5280 = null;
    }

    public final void method78(int i, Class171 class171) {
        super.method78(i, class171);
    }

    public final int method66(byte i) {
        if (i != 111)
            ((Class35_Sub3) this).aBoolean5283 = true;
        return anInt5282;
    }

    public final boolean method67(byte i) {
        int i_42_ = 29 / ((48 - i) / 53);
        return true;
    }
}
