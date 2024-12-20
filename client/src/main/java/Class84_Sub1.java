/* Class84_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub1 extends Class84 {
    static int anInt5369;
    static int anInt5370;
    static int anInt5371;
    private boolean aBoolean5372 = false;
    static int anInt5373;
    static int anInt5374;
    static int anInt5375;
    static int anInt5376;
    private Class136_Sub3[] aClass136_Sub3Array5377;
    static int anInt5378;
    private Class357 aClass357_5379;
    private boolean aBoolean5380;

    static long method604(long l, long l_0_) {
        return l ^ l_0_;
    }

    static final void method605(int i, byte i_1_) {
        if ((Class154.loginType ^ 0xffffffff) != -2) {
            if (Class154.loginType == 2)
                Class282_Sub19.anInt7785 = i;
        } else
            Class254.anInt5124 = i;
        anInt5375++;
        if (i_1_ == -111) {
            /* empty */
        }
    }

    Class84_Sub1(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
        if (((ha_Sub2) var_ha_Sub2).aBoolean5883) {
            aBoolean5380 = ((ha_Sub2) var_ha_Sub2).anInt5888 < 3;
            int i = aBoolean5380 ? 48 : 127;
            byte[][] is = new byte[6][4096];
            byte[][] is_2_ = new byte[6][4096];
            byte[][] is_3_ = new byte[6][4096];
            int i_4_ = 0;
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -65; i_5_++) {
                for (int i_6_ = 0; i_6_ < 64; i_6_++) {
                    float f = 2.0F * (float) i_5_ / 64.0F - 1.0F;
                    float f_7_ = -1.0F + 2.0F * (float) i_6_ / 64.0F;
                    float f_8_ = (float) (1.0 / Math.sqrt((double) (1.0F + f_7_ * f_7_ + f * f)));
                    f *= f_8_;
                    f_7_ *= f_8_;
                    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -7; i_9_++) {
                        float f_10_;
                        if ((i_9_ ^ 0xffffffff) == -1)
                            f_10_ = -f_7_;
                        else if ((i_9_ ^ 0xffffffff) != -2) {
                            if (i_9_ == 2)
                                f_10_ = f;
                            else if ((i_9_ ^ 0xffffffff) == -4)
                                f_10_ = -f;
                            else if ((i_9_ ^ 0xffffffff) != -5)
                                f_10_ = -f_8_;
                            else
                                f_10_ = f_8_;
                        } else
                            f_10_ = f_7_;
                        int i_11_;
                        int i_12_;
                        int i_13_;
                        if (f_10_ > 0.0F) {
                            i_11_ = (int) ((double) i * Math.pow((double) f_10_, 96.0));
                            i_12_ = (int) (Math.pow((double) f_10_, 36.0) * (double) i);
                            i_13_ = (int) (Math.pow((double) f_10_, 12.0) * (double) i);
                        } else
                            i_11_ = i_12_ = i_13_ = 0;
                        is_2_[i_9_][i_4_] = (byte) i_11_;
                        is_3_[i_9_][i_4_] = (byte) i_12_;
                        is[i_9_][i_4_] = (byte) i_13_;
                    }
                    i_4_++;
                }
            }
            aClass136_Sub3Array5377 = new Class136_Sub3[3];
            aClass136_Sub3Array5377[0] = new Class136_Sub3(((Class84) this).aHa_Sub2_1036, 6406, 64, false, is_2_, 6406);
            aClass136_Sub3Array5377[1] = new Class136_Sub3(((Class84) this).aHa_Sub2_1036, 6406, 64, false, is_3_, 6406);
            aClass136_Sub3Array5377[2] = new Class136_Sub3(((Class84) this).aHa_Sub2_1036, 6406, 64, false, is, 6406);
            method606(1);
        }
    }

    final void method603(byte i, int i_14_, Class136 class136) {
        ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
        anInt5370++;
        ((Class84) this).aHa_Sub2_1036.method881((byte) 127, i_14_);
        if (i <= 53)
            aBoolean5372 = false;
    }

    final void method601(int i, int i_15_, int i_16_) {
        if (aBoolean5372) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, aClass136_Sub3Array5377[i - 1]);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
        anInt5376++;
        int i_17_ = -86 / ((i_16_ - 74) / 36);
    }

    final boolean method600(int i) {
        anInt5369++;
        if (i != -16777216)
            method599((byte) 122, false);
        return true;
    }

    final void method599(byte i, boolean bool) {
        ((Class84) this).aHa_Sub2_1036.method858(-49, 7681, 8448);
        if (i > -123)
            method600(54);
        anInt5373++;
    }

    final void method597(boolean bool) {
        anInt5371++;
        if (!aBoolean5372)
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
        else {
            if (!aBoolean5380) {
                ((Class84) this).aHa_Sub2_1036.method880(true, 2);
                ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            }
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method880(!bool, 0);
            aClass357_5379.method3795((byte) 113, '\001');
            aBoolean5372 = false;
        }
        if (bool != false)
            aClass136_Sub3Array5377 = null;
        ((Class84) this).aHa_Sub2_1036.method858(-5, 8448, 8448);
    }

    final void method602(boolean bool, byte i) {
        if (aClass357_5379 == null || !bool)
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34168);
        else {
            if (!aBoolean5380) {
                ((Class84) this).aHa_Sub2_1036.method880(true, 2);
                ((Class84) this).aHa_Sub2_1036.method889(-2, (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aClass136_Sub4_5889));
                ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            }
            aClass357_5379.method3795((byte) 56, '\0');
            aBoolean5372 = true;
        }
        if (i >= 1)
            anInt5374++;
    }

    private final void method606(int i) {
        aClass357_5379 = new Class357(((Class84) this).aHa_Sub2_1036, 2);
        anInt5378++;
        aClass357_5379.method3794(i ^ ~0x7c, 0);
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (aBoolean5380) {
            ((Class84) this).aHa_Sub2_1036.method858(i ^ 0x7c, 7681, 260);
            ((Class84) this).aHa_Sub2_1036.method911(770, 5890, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34167);
        } else {
            ((Class84) this).aHa_Sub2_1036.method858(-38, 8448, 7681);
            ((Class84) this).aHa_Sub2_1036.method911(768, 34168, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method880(true, 2);
            ((Class84) this).aHa_Sub2_1036.method858(-66, 7681, 260);
            ((Class84) this).aHa_Sub2_1036.method911(768, 34168, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method911(770, 34168, 1, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34167);
        }
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        aClass357_5379.method3797((byte) 26);
        aClass357_5379.method3794(i ^ ~0x72, (char) i);
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!aBoolean5380) {
            ((Class84) this).aHa_Sub2_1036.method858(-77, 8448, 8448);
            ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method880(true, 2);
            ((Class84) this).aHa_Sub2_1036.method858(124, 8448, 8448);
            ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method911(768, 34168, 1, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
        } else {
            ((Class84) this).aHa_Sub2_1036.method858(-73, 8448, 8448);
            ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
        }
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        aClass357_5379.method3797((byte) 26);
    }
}
