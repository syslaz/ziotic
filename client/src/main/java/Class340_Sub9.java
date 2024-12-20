/* Class340_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.math.BigInteger;

final class Class340_Sub9 extends Class340 {
    static int anInt8198;
    static BigInteger aBigInteger8199 = new BigInteger("10001", 16);
    static int anInt8200;
    static int anInt8201;
    static int anInt8202;
    private ha_Sub3_Sub1 aHa_Sub3_Sub1_8203;
    private Class370 aClass370_8204;
    static int anInt8205;
    static int anInt8206;
    static int anInt8207;
    static int anInt8208;
    static int anInt8209;
    static int anInt8210;
    static int anInt8211;
    static int anInt8212;
    static IncommingOpcode aIncommingOpcode_8213 = new IncommingOpcode(33, -1);
    private Class247 aClass247_8214;
    static int anInt8215;

    public static void method3468(byte i) {
        aBigInteger8199 = null;
        aIncommingOpcode_8213 = null;
        if (i != 16)
            method3468((byte) -58);
    }

    Class340_Sub9(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class381 class381, Class370 class370) {
        super(var_ha_Sub3_Sub1);
        aClass370_8204 = class370;
        aHa_Sub3_Sub1_8203 = var_ha_Sub3_Sub1;
        if (class381 == null || !aClass370_8204.method3856((byte) -42) || !((ha_Sub3_Sub1) aHa_Sub3_Sub1_8203).aBoolean8762)
            aClass247_8214 = null;
        else
            aClass247_8214 = (Class282_Sub8.method2950(34336, class381.method3908("transparent_water", "gl", (byte) 78), aHa_Sub3_Sub1_8203, (byte) -118));
    }

    static final void method3469(String[] strings, short[] is, int i) {
        anInt8210++;
        if (i >= -79)
            aIncommingOpcode_8213 = null;
        Node_Sub14_Sub30.method2365(strings, -1 + strings.length, -40, 0, is);
    }

    final void method3442(Interface21 interface21, int i, byte i_0_) {
        anInt8198++;
        if (i_0_ <= 68)
            aHa_Sub3_Sub1_8203 = null;
    }

    final boolean method3432(int i) {
        anInt8202++;
        if (i != 4095)
            return false;
        if (aClass247_8214 == null)
            return false;
        return true;
    }

    final void method3441(boolean bool) {
        anInt8207++;
        if (bool != true)
            aClass370_8204 = null;
        ((Class340) this).aHa_Sub3_3954.method946(0, 60, Class147.aClass280_1738);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    static final int method3470(int i, int i_1_) {
        anInt8208++;
        if (i > -61)
            method3468((byte) 66);
        return 0x7f & i_1_;
    }

    static final int method3471(int i, byte i_2_) {
        if (i_2_ != 99)
            method3471(-29, (byte) 67);
        anInt8200++;
        int i_3_ = i * (i * i >> 314002476) >> 1008290540;
        int i_4_ = 6 * i + -61440;
        int i_5_ = 40960 + (i * i_4_ >> 34392140);
        return i_3_ * i_5_ >> 766242124;
    }

    static final void method3472(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
        if (i_9_ > 93) {
            anInt8215++;
            int i_10_ = Class229.anInt2590;
            while_176_:
            do {
                do {
                    if ((i_10_ ^ 0xffffffff) != -1) {
                        if ((i_10_ ^ 0xffffffff) != -2) {
                            if (i_10_ == 2)
                                break;
                            break while_176_;
                        }
                    } else
                        return;
                    s_Sub3.anInt8006 = i_7_;
                    Class229.anInt2590 = 2;
                    Class346_Sub5_Sub2.anInt9893 = i_6_;
                    Class173.anInt2015 = i;
                    Node_Sub15_Sub5.anInt9719 = i_8_;
                    return;
                } while (false);
                if ((i ^ 0xffffffff) > (Class173.anInt2015 ^ 0xffffffff))
                    Class173.anInt2015 = i;
                if (i_8_ < Node_Sub15_Sub5.anInt9719)
                    Node_Sub15_Sub5.anInt9719 = i_8_;
                if ((i_6_ ^ 0xffffffff) < (Class346_Sub5_Sub2.anInt9893 ^ 0xffffffff))
                    Class346_Sub5_Sub2.anInt9893 = i_6_;
                if ((i_7_ ^ 0xffffffff) < (s_Sub3.anInt8006 ^ 0xffffffff))
                    s_Sub3.anInt8006 = i_7_;
            } while (false);
        }
    }

    static final void method3473(int i, byte i_11_) {
        anInt8206++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, i_11_ ^ ~0x342446aa, 4);
        class248_sub8_sub10.method2076(i_11_ + -182);
        if (i_11_ != 117)
            aBigInteger8199 = null;
    }

    final void method3435(boolean bool, int i) {
        if (i > 109) {
            anInt8209++;
            ((Class340) this).aHa_Sub3_3954.method955((byte) 77, (Class346_Sub4.aClass5_8272), Class142.aClass5_1669);
        }
    }

    final void method3443(boolean bool, boolean bool_12_) {
        OpenGL.glBindProgramARB(34336, ((Class247) aClass247_8214).anInt2791);
        anInt8212++;
        OpenGL.glEnable(34336);
        if (bool != true)
            method3432(-118);
        ((Class340) this).aHa_Sub3_3954.method946(0, -97, Class346_Sub7_Sub3_Sub1.aClass280_10511);
    }

    final void method3433(int i, int i_13_, int i_14_) {
        anInt8201++;
        if (i == -26427) {
            if (!((Class370) aClass370_8204).aBoolean4544) {
                int i_15_ = (16 * (((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInt6187 % 4000) / 4000);
                ((Class340) this).aHa_Sub3_3954.method929((((Class370) aClass370_8204).anInterface21_Impl2Array4545[i_15_]), -8423);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float f = (float) ((((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInt6187) % 4000) / 4000.0F;
                ((Class340) this).aHa_Sub3_3954.method929(((Class370) aClass370_8204).anInterface21_Impl1_4554, -8423);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    static final int method3474(int i) {
        if (i != -16632)
            return -72;
        anInt8205++;
        return Class282_Sub11.aClass74_7702.method546(0);
    }

    static final void method3475(int i, byte i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
        anInt8211++;
        if (i_16_ < 73)
            method3473(109, (byte) 45);
        if (i_20_ == i_18_)
            Class84_Sub8.method627(i_19_, i_17_, i_18_, 25187, i);
        else if ((Class302.anInt3500 ^ 0xffffffff) < (-i_18_ + i_17_ ^ 0xffffffff) || i_17_ + i_18_ > Class289.anInt3399 || -i_20_ + i < Class181.anInt2099 || i_20_ + i > aa_Sub3.anInt5270)
            Class226_Sub3.method1815(i_19_, (byte) 0, i, i_17_, i_18_, i_20_);
        else
            Class346_Sub7_Sub2_Sub1.method3604(i_20_, i, i_19_, -124, i_17_, i_18_);
    }
}
