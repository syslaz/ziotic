/* Class48_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class48_Sub1 extends Class48 {
    private ha_Sub2 aHa_Sub2_5293;
    private Class136_Sub4_Sub1 aClass136_Sub4_Sub1_5294;
    private boolean aBoolean5295;
    private Class357 aClass357_5296;

    final void method359(char c, int i, int i_0_, int i_1_, boolean bool, aa var_aa, int i_2_, int i_3_) {
        aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
        Class136_Sub4_Sub1 class136_sub4_sub1 = ((aa_Sub2) var_aa_Sub2).aClass136_Sub4_Sub1_5256;
        aHa_Sub2_5293.method844(17776);
        aHa_Sub2_5293.method889(-2, aClass136_Sub4_Sub1_5294);
        if (aBoolean5295 || bool) {
            aHa_Sub2_5293.method858(123, 8448, 7681);
            aHa_Sub2_5293.method911(768, 34168, 0, (byte) 4);
        } else
            aHa_Sub2_5293.method858(-124, 7681, 7681);
        aHa_Sub2_5293.method880(true, 1);
        aHa_Sub2_5293.method889(-2, class136_sub4_sub1);
        aHa_Sub2_5293.method858(125, 8448, 7681);
        aHa_Sub2_5293.method911(768, 34168, 0, (byte) 4);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float f = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9969 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9964);
        float f_4_ = (((Class136_Sub4_Sub1) class136_sub4_sub1).aFloat9967 / (float) ((Class136_Sub4_Sub1) class136_sub4_sub1).anInt9966);
        OpenGL.glTexGenfv(8192, 9474, new float[]{f, 0.0F, 0.0F, (float) -i_2_ * f}, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, f_4_, 0.0F, (float) -i_3_ * f_4_}, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
        OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
        aClass357_5296.method3795((byte) 104, c);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        aHa_Sub2_5293.method911(768, 5890, 0, (byte) 4);
        aHa_Sub2_5293.method858(-46, 8448, 8448);
        aHa_Sub2_5293.method889(-2, null);
        aHa_Sub2_5293.method880(true, 0);
        if (aBoolean5295 || bool)
            aHa_Sub2_5293.method911(768, 5890, 0, (byte) 4);
    }

    Class48_Sub1(ha_Sub2 var_ha_Sub2, Class285 class285, Class157[] class157s, boolean bool) {
        super(var_ha_Sub2, class285);
        aHa_Sub2_5293 = var_ha_Sub2;
        int i = 0;
        for (int i_5_ = 0; i_5_ < 256; i_5_++) {
            Class157 class157 = class157s[i_5_];
            if (((Class157) class157).anInt1874 > i)
                i = ((Class157) class157).anInt1874;
            if (((Class157) class157).anInt1873 > i)
                i = ((Class157) class157).anInt1873;
        }
        int i_6_ = i * 16;
        if (bool) {
            byte[] is = new byte[i_6_ * i_6_];
            for (int i_7_ = 0; i_7_ < 256; i_7_++) {
                Class157 class157 = class157s[i_7_];
                int i_8_ = ((Class157) class157).anInt1874;
                int i_9_ = ((Class157) class157).anInt1873;
                int i_10_ = i_7_ % 16 * i;
                int i_11_ = i_7_ / 16 * i;
                int i_12_ = i_11_ * i_6_ + i_10_;
                int i_13_ = 0;
                if (((Class157) class157).aByteArray1875 == null) {
                    byte[] is_14_ = ((Class157) class157).aByteArray1868;
                    for (int i_15_ = 0; i_15_ < i_8_; i_15_++) {
                        for (int i_16_ = 0; i_16_ < i_9_; i_16_++)
                            is[i_12_++] = (byte) (is_14_[i_13_++] == 0 ? 0 : -1);
                        i_12_ += i_6_ - i_9_;
                    }
                } else {
                    byte[] is_17_ = ((Class157) class157).aByteArray1875;
                    for (int i_18_ = 0; i_18_ < i_8_; i_18_++) {
                        for (int i_19_ = 0; i_19_ < i_9_; i_19_++)
                            is[i_12_++] = is_17_[i_13_++];
                        i_12_ += i_6_ - i_9_;
                    }
                }
            }
            aClass136_Sub4_Sub1_5294 = Class301_Sub2.method3192(false, is, var_ha_Sub2, 6406, 6406, i_6_, i_6_, -52);
            aBoolean5295 = true;
        } else {
            int[] is = new int[i_6_ * i_6_];
            for (int i_20_ = 0; i_20_ < 256; i_20_++) {
                Class157 class157 = class157s[i_20_];
                int[] is_21_ = ((Class157) class157).anIntArray1872;
                byte[] is_22_ = ((Class157) class157).aByteArray1875;
                byte[] is_23_ = ((Class157) class157).aByteArray1868;
                int i_24_ = ((Class157) class157).anInt1874;
                int i_25_ = ((Class157) class157).anInt1873;
                int i_26_ = i_20_ % 16 * i;
                int i_27_ = i_20_ / 16 * i;
                int i_28_ = i_27_ * i_6_ + i_26_;
                int i_29_ = 0;
                if (is_22_ != null) {
                    for (int i_30_ = 0; i_30_ < i_24_; i_30_++) {
                        for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
                            is[i_28_++] = (is_22_[i_29_] << 24 | is_21_[is_23_[i_29_] & 0xff]);
                            i_29_++;
                        }
                        i_28_ += i_6_ - i_25_;
                    }
                } else {
                    for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
                        for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
                            int i_34_;
                            if ((i_34_ = is_23_[i_29_++]) != 0)
                                is[i_28_++] = ~0xffffff | is_21_[i_34_ & 0xff];
                            else
                                i_28_++;
                        }
                        i_28_ += i_6_ - i_25_;
                    }
                }
            }
            aClass136_Sub4_Sub1_5294 = Class77.method563(i_6_, 0, 98, false, is, 0, i_6_, var_ha_Sub2);
            aBoolean5295 = false;
        }
        aClass136_Sub4_Sub1_5294.method1246(false, false);
        aClass357_5296 = new Class357(var_ha_Sub2, 256);
        float f = (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).aFloat9969 / (float) (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).anInt9964));
        float f_35_ = (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).aFloat9967 / (float) (((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).anInt9966));
        for (int i_36_ = 0; i_36_ < 256; i_36_++) {
            Class157 class157 = class157s[i_36_];
            int i_37_ = ((Class157) class157).anInt1874;
            int i_38_ = ((Class157) class157).anInt1873;
            int i_39_ = ((Class157) class157).anInt1876;
            int i_40_ = ((Class157) class157).anInt1869;
            float f_41_ = (float) (i_36_ % 16 * i);
            float f_42_ = (float) (i_36_ / 16 * i);
            float f_43_ = f_41_ * f;
            float f_44_ = f_42_ * f_35_;
            float f_45_ = (f_41_ + (float) i_38_) * f;
            float f_46_ = (f_42_ + (float) i_37_) * f_35_;
            aClass357_5296.method3794(-99, i_36_);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(f_43_, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).aFloat9967 - f_44_);
            OpenGL.glVertex2i(i_40_, i_39_);
            OpenGL.glTexCoord2f(f_43_, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).aFloat9967 - f_46_);
            OpenGL.glVertex2i(i_40_, i_39_ + i_37_);
            OpenGL.glTexCoord2f(f_45_, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).aFloat9967 - f_46_);
            OpenGL.glVertex2i(i_40_ + i_38_, i_39_ + i_37_);
            OpenGL.glTexCoord2f(f_45_, ((Class136_Sub4_Sub1) aClass136_Sub4_Sub1_5294).aFloat9967 - f_44_);
            OpenGL.glVertex2i(i_40_ + i_38_, i_39_);
            OpenGL.glEnd();
            aClass357_5296.method3797((byte) 26);
        }
    }

    final void fa(char c, int i, int i_47_, int i_48_, boolean bool) {
        aHa_Sub2_5293.method844(17776);
        aHa_Sub2_5293.method889(-2, aClass136_Sub4_Sub1_5294);
        if (aBoolean5295 || bool) {
            aHa_Sub2_5293.method858(122, 8448, 7681);
            aHa_Sub2_5293.method911(768, 34168, 0, (byte) 4);
        } else
            aHa_Sub2_5293.method858(118, 7681, 7681);
        OpenGL.glColor4ub((byte) (i_48_ >> 16), (byte) (i_48_ >> 8), (byte) i_48_, (byte) (i_48_ >> 24));
        OpenGL.glTranslatef((float) i, (float) i_47_, 0.0F);
        aClass357_5296.method3795((byte) 95, c);
        OpenGL.glLoadIdentity();
        if (aBoolean5295 || bool)
            aHa_Sub2_5293.method911(768, 5890, 0, (byte) 4);
    }
}
