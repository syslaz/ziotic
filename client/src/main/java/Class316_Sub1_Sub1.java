/* Class316_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class316_Sub1_Sub1 extends Class316_Sub1 {
    static int anInt9841;
    private Class136_Sub3 aClass136_Sub3_9842;
    static int anInt9843;
    static int anInt9844;
    static int anInt9845;
    static int anInt9846;
    static int anInt9847;
    private ha_Sub2 aHa_Sub2_9848;

    static final void method3294(int i, int i_0_, byte i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        int i_6_ = 57 % ((i_1_ - 2) / 42);
        anInt9847++;
        if (-i_3_ + i_2_ < Class302.anInt3500 || (Class289.anInt3399 ^ 0xffffffff) > (i_2_ - -i_3_ ^ 0xffffffff) || (Class181.anInt2099 ^ 0xffffffff) < (-i_3_ + i_0_ ^ 0xffffffff) || (i_0_ + i_3_ ^ 0xffffffff) < (aa_Sub3.anInt5270 ^ 0xffffffff))
            Node_Sub24.method2547(i, i_3_, i_0_, 2, i_4_, i_2_, i_5_);
        else
            Node_Sub14_Sub12_Sub1.method2308(i_3_, i_5_, i_2_, i_0_, i_4_, 18177, i);
    }

    final Class136_Sub3 method3293(boolean bool) {
        anInt9844++;
        if (bool != true)
            method3298((byte) 105, 36);
        return aClass136_Sub3_9842;
    }

    final int method3295(int i) {
        anInt9845++;
        if (i != 32395)
            method3293(false);
        return ((Class136_Sub3) aClass136_Sub3_9842).anInt8397;
    }

    final boolean method3296(Class136_Sub3 class136_sub3, Class136_Sub3 class136_sub3_7_, byte i, float f) {
        anInt9843++;
        boolean bool = true;
        Class223 class223 = ((ha_Sub2) aHa_Sub2_9848).aClass223_5895;
        aHa_Sub2_9848.K(Class242.anIntArray2700);
        aHa_Sub2_9848.la();
        aHa_Sub2_9848.method884((byte) -59);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, ((Class136_Sub3) aClass136_Sub3_9842).anInt8397, ((Class136_Sub3) aClass136_Sub3_9842).anInt8397);
        aHa_Sub2_9848.method899(2286, false);
        aHa_Sub2_9848.method878(false, -104);
        aHa_Sub2_9848.method913(false, 0);
        aHa_Sub2_9848.method870(28, false);
        aHa_Sub2_9848.method882(-2, (byte) -118);
        aHa_Sub2_9848.method880(true, 1);
        aHa_Sub2_9848.method910(-14217, 0.0F, 0.0F, 0.0F, f);
        if (i <= 48)
            return true;
        aHa_Sub2_9848.method858(121, 34165, 34165);
        aHa_Sub2_9848.method889(-2, class136_sub3);
        aHa_Sub2_9848.method880(true, 0);
        aHa_Sub2_9848.method881((byte) 116, 1);
        aHa_Sub2_9848.method889(-2, class136_sub3_7_);
        aHa_Sub2_9848.method873(class223, 0);
        for (int i_8_ = 0; i_8_ < 6; i_8_++) {
            int i_9_ = i_8_ + 34069;
            class223.method1779(aClass136_Sub3_9842, i_9_, 0, 0);
            class223.method1784(0, false);
            if (class223.method1770(42)) {
                OpenGL.glBegin(7);
                int i_10_ = i_9_;
                while_62_:
                do {
                    while_61_:
                    do {
                        while_60_:
                        do {
                            while_59_:
                            do {
                                do {
                                    if (i_10_ != 34069) {
                                        if ((i_10_ ^ 0xffffffff) != -34071) {
                                            if (i_10_ != 34071) {
                                                if ((i_10_ ^ 0xffffffff) != -34073) {
                                                    if ((i_10_ ^ 0xffffffff) != -34074) {
                                                        if (i_10_ != 34074)
                                                            break while_62_;
                                                    } else
                                                        break while_60_;
                                                    break while_61_;
                                                }
                                            } else
                                                break;
                                            break while_59_;
                                        }
                                    } else {
                                        OpenGL.glTexCoord3i(65535, 65534, 65534);
                                        OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                                        OpenGL.glVertex2f(0.0F, 0.0F);
                                        OpenGL.glTexCoord3i(65535, 65534, -65534);
                                        OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                                        OpenGL.glVertex2f(1.0F, 0.0F);
                                        OpenGL.glTexCoord3i(65535, -65534, -65534);
                                        OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                                        OpenGL.glVertex2f(1.0F, 1.0F);
                                        OpenGL.glTexCoord3i(65535, -65534, 65534);
                                        OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                                        OpenGL.glVertex2f(0.0F, 1.0F);
                                        break while_62_;
                                    }
                                    OpenGL.glTexCoord3i(-65535, 65534, -65534);
                                    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                                    OpenGL.glVertex2f(0.0F, 0.0F);
                                    OpenGL.glTexCoord3i(-65535, 65534, 65534);
                                    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                                    OpenGL.glVertex2f(1.0F, 0.0F);
                                    OpenGL.glTexCoord3i(-65535, -65534, 65534);
                                    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                                    OpenGL.glVertex2f(1.0F, 1.0F);
                                    OpenGL.glTexCoord3i(-65535, -65534, -65534);
                                    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                                    OpenGL.glVertex2f(0.0F, 1.0F);
                                    break while_62_;
                                } while (false);
                                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                                OpenGL.glVertex2f(0.0F, 0.0F);
                                OpenGL.glTexCoord3i(65534, 65535, -65534);
                                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                                OpenGL.glVertex2f(1.0F, 0.0F);
                                OpenGL.glTexCoord3i(65534, 65535, 65534);
                                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                                OpenGL.glVertex2f(1.0F, 1.0F);
                                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                                OpenGL.glVertex2f(0.0F, 1.0F);
                                break while_62_;
                            } while (false);
                            OpenGL.glTexCoord3i(-65534, -65535, 65534);
                            OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                            OpenGL.glVertex2f(0.0F, 0.0F);
                            OpenGL.glTexCoord3i(65534, -65535, 65534);
                            OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                            OpenGL.glVertex2f(1.0F, 0.0F);
                            OpenGL.glTexCoord3i(65534, -65535, -65534);
                            OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                            OpenGL.glVertex2f(1.0F, 1.0F);
                            OpenGL.glTexCoord3i(-65534, -65535, -65534);
                            OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                            OpenGL.glVertex2f(0.0F, 1.0F);
                            break while_62_;
                        } while (false);
                        OpenGL.glTexCoord3i(-65534, 65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                        OpenGL.glVertex2f(0.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                        OpenGL.glVertex2f(1.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, -65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                        OpenGL.glVertex2f(1.0F, 1.0F);
                        OpenGL.glTexCoord3i(-65534, -65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                        OpenGL.glVertex2f(0.0F, 1.0F);
                        break while_62_;
                    } while (false);
                    OpenGL.glTexCoord3i(65534, 65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(-65534, 65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(-65534, -65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(65534, -65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                } while (false);
                OpenGL.glEnd();
            } else {
                bool = false;
                break;
            }
        }
        class223.method1783(1, 0);
        aHa_Sub2_9848.method887(class223, -122);
        aHa_Sub2_9848.method880(true, 1);
        aHa_Sub2_9848.method889(-2, null);
        aHa_Sub2_9848.method858(-90, 8448, 8448);
        aHa_Sub2_9848.method880(true, 0);
        aHa_Sub2_9848.method889(-2, null);
        OpenGL.glPopAttrib();
        aHa_Sub2_9848.KA(Class242.anIntArray2700[0], Class242.anIntArray2700[1], Class242.anIntArray2700[2], Class242.anIntArray2700[3]);
        if (bool && !((ha_Sub2) aHa_Sub2_9848).aBoolean5877)
            aClass136_Sub3_9842.method1247((byte) -70);
        return bool;
    }

    static final boolean method3297(int i, int i_11_, int i_12_) {
        anInt9841++;
        int i_13_ = -127 / ((44 - i_11_) / 41);
        if ((i & 0x180) == 0)
            return false;
        return true;
    }

    static final int method3298(byte i, int i_14_) {
        anInt9846++;
        if (i < 10)
            return -3;
        return 0x7f & i_14_;
    }

    Class316_Sub1_Sub1(ha_Sub2 var_ha_Sub2, int i) {
        aHa_Sub2_9848 = var_ha_Sub2;
        aClass136_Sub3_9842 = new Class136_Sub3(var_ha_Sub2, 6408, i);
    }
}
