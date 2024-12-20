/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class370 {
    boolean aBoolean4544;
    Interface21_Impl2[] anInterface21_Impl2Array4545 = null;
    static int anInt4546;
    static int anInt4547;
    static int anInt4548;
    static int anInt4549;
    Interface21_Impl1 anInterface21_Impl1_4550;
    private Interface21_Impl2[] anInterface21_Impl2Array4551 = null;
    private ha_Sub3 aHa_Sub3_4552;
    static OutgoingOpcode aOutgoingOpcode_4553 = new OutgoingOpcode(75, 3);
    Interface21_Impl1 anInterface21_Impl1_4554;
    static int anInt4555 = 0;

    final boolean method3852(int i) {
        anInt4548++;
        if (i != -17546)
            anInt4555 = 86;
        if (((Class370) this).anInterface21_Impl1_4550 == null) {
            if (Node_Sub14_Sub38.anObject9583 == null) {
                byte[] is = Class228.method1828(4.0F, 0.6F, 4.0F, (byte) 127, new Class44_Sub1(419684), 128, 16.0F, 16, 8, 128, 0.5F);
                Node_Sub14_Sub38.anObject9583 = Class255.method2742(false, is, (byte) 77);
            }
            byte[] is = Class346_Sub7_Sub1_Sub1.method3587((Node_Sub14_Sub38.anObject9583), false, -30711);
            byte[] is_0_ = new byte[4 * is.length];
            int i_1_ = 0;
            for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -17; i_2_++) {
                int i_3_ = 128 * (128 * i_2_);
                int i_4_ = i_3_;
                for (int i_5_ = 0; i_5_ < 128; i_5_++) {
                    int i_6_ = i_4_ - -(i_5_ * 128);
                    int i_7_ = 128 * (i_5_ - 1 & 0x7f) + i_4_;
                    int i_8_ = 128 * (1 + i_5_ & 0x7f) + i_4_;
                    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -129; i_9_++) {
                        float f = (float) (-(is[i_9_ + i_8_] & 0xff) + (is[i_9_ + i_7_] & 0xff));
                        float f_10_ = (float) ((is[i_6_ + (0x7f & -1 + i_9_)] & 0xff) - (is[(0x7f & 1 + i_9_) + i_6_] & 0xff));
                        float f_11_ = (float) (128.0 / Math.sqrt((double) (16384.0F + f_10_ * f_10_ + f * f)));
                        is_0_[i_1_++] = (byte) (int) (f_11_ * f_10_ + 127.0F);
                        is_0_[i_1_++] = (byte) (int) (f_11_ * 128.0F + 127.0F);
                        is_0_[i_1_++] = (byte) (int) (127.0F + f * f_11_);
                        is_0_[i_1_++] = is[i_3_++];
                    }
                }
            }
            ((Class370) this).anInterface21_Impl1_4550 = aHa_Sub3_4552.method1011(22302, 16, is_0_, Class120.aClass264_1508, 128, 128);
        }
        if (((Class370) this).anInterface21_Impl1_4550 == null)
            return false;
        return true;
    }

    static final Class177 method3853(int i, ha var_ha, boolean bool, int i_12_) {
        anInt4546++;
        if (i_12_ == -1)
            return null;
        if (Class346_Sub7_Sub4_Sub1.anIntArray10091 != null) {
            for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > (Class346_Sub7_Sub4_Sub1.anIntArray10091.length ^ 0xffffffff)); i_13_++) {
                if (i_12_ == Class346_Sub7_Sub4_Sub1.anIntArray10091[i_13_])
                    return Class268.aClass177Array3120[i_13_];
            }
        }
        Class177 class177 = (Class177) Class241.aClass278_2688.method2863(4, (long) i_12_);
        if (class177 != null) {
            if (bool && ((Class177) class177).aClass285_2071 == null) {
                Class285 class285 = Class116_Sub1.method1102((Node_Sub14_Sub34.aClass381_9524), 13580, i_12_);
                if (class285 == null)
                    return null;
                ((Class177) class177).aClass285_2071 = class285;
            }
            return class177;
        }
        if (i >= -104)
            method3854(-93);
        Class157[] class157s = Class157.method1391(Class41.aClass381_531, i_12_);
        if (class157s == null)
            return null;
        Class285 class285 = Class116_Sub1.method1102(Node_Sub14_Sub34.aClass381_9524, 13580, i_12_);
        if (class285 == null)
            return null;
        if (!bool)
            class177 = new Class177(var_ha.a(class285, class157s, true));
        else
            class177 = new Class177(var_ha.a(class285, class157s, true), class285);
        Class241.aClass278_2688.method2867((byte) 0, (long) i_12_, class177);
        return class177;
    }

    static final int method3854(int i) {
        anInt4547++;
        if ((Node_Sub15_Sub4.anInt9694 ^ 0xffffffff) == i)
            return Class82.anInt1030;
        return Node_Sub8_Sub1.anInt8889;
    }

    public static void method3855(int i) {
        if (i != 0)
            method3853(-128, null, true, 73);
        aOutgoingOpcode_4553 = null;
    }

    final boolean method3856(byte i) {
        if (i != -42)
            return false;
        anInt4549++;
        if (((Class370) this).aBoolean4544) {
            if (((Class370) this).anInterface21_Impl1_4554 == null)
                return false;
            return true;
        }
        if (((Class370) this).anInterface21_Impl2Array4545 == null)
            return false;
        return true;
    }

    Class370(ha_Sub3 var_ha_Sub3) {
        ((Class370) this).anInterface21_Impl1_4550 = null;
        ((Class370) this).anInterface21_Impl1_4554 = null;
        aHa_Sub3_4552 = var_ha_Sub3;
        ((Class370) this).aBoolean4544 = ((ha_Sub3) aHa_Sub3_4552).aBoolean6233;
        if (((Class370) this).aBoolean4544 && !aHa_Sub3_4552.method1044(Class228.aClass228_2573, (Class346_Sub7_Sub2_Sub3.aClass264_10395), 14))
            ((Class370) this).aBoolean4544 = false;
        if (((Class370) this).aBoolean4544 || aHa_Sub3_4552.method933(-3119, Class228.aClass228_2573, (Class346_Sub7_Sub2_Sub3.aClass264_10395))) {
            Class115.method1076(117);
            if (((Class370) this).aBoolean4544) {
                byte[] is = Class346_Sub7_Sub1_Sub1.method3587(Class165.anObject4966, false, -30711);
                ((Class370) this).anInterface21_Impl1_4554 = aHa_Sub3_4552.method1011(22302, 16, is, (Class346_Sub7_Sub2_Sub3.aClass264_10395), 128, 128);
                is = Class346_Sub7_Sub1_Sub1.method3587(Class317.anObject3676, false, -30711);
                aHa_Sub3_4552.method1011(22302, 16, is, (Class346_Sub7_Sub2_Sub3.aClass264_10395), 128, 128);
            } else {
                ((Class370) this).anInterface21_Impl2Array4545 = new Interface21_Impl2[16];
                for (int i = 0; i < 16; i++) {
                    byte[] is = Class282_Sub4.method2934(Class165.anObject4966, 41, 32768, 128 * i * 256);
                    ((Class370) this).anInterface21_Impl2Array4545[i] = aHa_Sub3_4552.method972(is, 0, 128, (Class346_Sub7_Sub2_Sub3.aClass264_10395), 128, true);
                }
                anInterface21_Impl2Array4551 = new Interface21_Impl2[16];
                for (int i = 0; i < 16; i++) {
                    byte[] is = Class282_Sub4.method2934(Class317.anObject3676, 48, 32768, 2 * (128 * (128 * i)));
                    anInterface21_Impl2Array4551[i] = aHa_Sub3_4552.method972(is, 0, 128, (Class346_Sub7_Sub2_Sub3.aClass264_10395), 128, true);
                }
            }
        }
    }
}
