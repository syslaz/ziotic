/* Class340_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class340_Sub7 extends Class340 {
    static int anInt8160;
    private Class247 aClass247_8161;
    static int anInt8162;
    static int[] anIntArray8163 = new int[2];
    private boolean aBoolean8164 = false;
    static Class365 aClass365_8165;
    static int anInt8166;
    static int anInt8167;
    static int anInt8168;
    private Class247 aClass247_8169;
    static int anInt8170;
    private boolean aBoolean8171;
    private float[] aFloatArray8172 = new float[4];
    private boolean aBoolean8173;
    private boolean aBoolean8174;
    private Class247 aClass247_8175;
    private Interface21_Impl2 anInterface21_Impl2_8176;
    static int anInt8177;
    static int anInt8178;
    private Class247 aClass247_8179;
    static int anInt8180;
    static String[] aStringArray8181 = new String[100];
    static int anInt8182;

    final void method3437(boolean bool) {
        anInt8167++;
        if (aBoolean8174) {
            int i = ((Class340) this).aHa_Sub3_3954.XA();
            int i_0_ = ((Class340) this).aHa_Sub3_3954.i();
            float f = -((float) (-i_0_ + i) * 0.125F) + (float) i;
            float f_1_ = (float) i - (float) (i - i_0_) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, f_1_, f, (1.0F / (float) ((Class340) this).aHa_Sub3_3954.method1035(-118)), ((float) ((Class340) this).aHa_Sub3_3954.method978(-31039) / 255.0F));
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method976(((Class340) this).aHa_Sub3_3954.method1002(78), false);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        }
        if (bool != true)
            method3443(false, false);
    }

    final void method3439(byte i) {
        anInt8180++;
        int i_2_ = ((Class340) this).aHa_Sub3_3954.method1053(-8);
        int i_3_ = -122 % ((-46 - i) / 55);
        Class238_Sub2 class238_sub2 = ((Class340) this).aHa_Sub3_3954.method973(true);
        if (!aBoolean8171)
            OpenGL.glBindProgramARB(34336, (i_2_ == 2147483647 ? ((Class247) aClass247_8169).anInt2791 : ((Class247) aClass247_8161).anInt2791));
        else
            OpenGL.glBindProgramARB(34336, (i_2_ != 2147483647 ? ((Class247) aClass247_8179).anInt2791 : ((Class247) aClass247_8175).anInt2791));
        OpenGL.glEnable(34336);
        aBoolean8174 = true;
        class238_sub2.method1897(aFloatArray8172, -1.0F, true, 0.0F, 0.0F, (float) i_2_);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8172[0], aFloatArray8172[1], aFloatArray8172[2], aFloatArray8172[3]);
        method3437(true);
    }

    final void method3441(boolean bool) {
        if (bool != true)
            aClass247_8175 = null;
        ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        anInt8160++;
        ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
        ((Class340) this).aHa_Sub3_3954.method955((byte) 107, Class60.aClass5_821, Class60.aClass5_821);
        ((Class340) this).aHa_Sub3_3954.method946(0, -56, Class147.aClass280_1738);
        ((Class340) this).aHa_Sub3_3954.method946(2, 52, Class380.aClass280_4649);
        ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 108, 0);
        ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        if (aBoolean8164) {
            ((Class340) this).aHa_Sub3_3954.method946(0, 112, Class147.aClass280_1738);
            ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 109, 0);
            aBoolean8164 = false;
        }
        if (aBoolean8174) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            aBoolean8174 = false;
        }
    }

    public static void method3465(int i) {
        anIntArray8163 = null;
        if (i == -25050) {
            aClass365_8165 = null;
            aStringArray8181 = null;
        }
    }

    final void method3435(boolean bool, int i) {
        anInt8178++;
        if (i <= 109)
            anInt8182 = -100;
    }

    Class340_Sub7(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class381 class381) {
        super(var_ha_Sub3_Sub1);
        if (class381 != null && ((ha_Sub3_Sub1) var_ha_Sub3_Sub1).aBoolean8762) {
            aClass247_8169 = (Class282_Sub8.method2950(34336, class381.method3908("uw_ground_unlit", "gl", (byte) 83), var_ha_Sub3_Sub1, (byte) -94));
            aClass247_8175 = Class282_Sub8.method2950(34336, class381.method3908("uw_ground_lit", "gl", (byte) 68), var_ha_Sub3_Sub1, (byte) -117);
            aClass247_8161 = (Class282_Sub8.method2950(34336, class381.method3908("uw_model_unlit", "gl", (byte) 110), var_ha_Sub3_Sub1, (byte) -84));
            aClass247_8179 = Class282_Sub8.method2950(34336, class381.method3908("uw_model_lit", "gl", (byte) 119), var_ha_Sub3_Sub1, (byte) -106);
            if (!(aClass247_8179 != null & (aClass247_8161 != null & (aClass247_8175 != null & aClass247_8169 != null))))
                aBoolean8173 = false;
            else {
                anInterface21_Impl2_8176 = ((Class340) this).aHa_Sub3_3954.method1033(2, (new int[]{0, -1}), (byte) -36, false, 1);
                anInterface21_Impl2_8176.method70(1645, false, false);
                aBoolean8173 = true;
            }
        } else
            aBoolean8173 = false;
    }

    final void method3443(boolean bool, boolean bool_4_) {
        aBoolean8171 = bool_4_;
        anInt8168++;
        ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        ((Class340) this).aHa_Sub3_3954.method929(anInterface21_Impl2_8176, -8423);
        ((Class340) this).aHa_Sub3_3954.method955((byte) 109, Class142.aClass5_1669, (Class316_Sub1_Sub2.aClass5_9850));
        ((Class340) this).aHa_Sub3_3954.method946(0, -102, Class380.aClass280_4649);
        ((Class340) this).aHa_Sub3_3954.method1017(-8980, 2, Class147.aClass280_1738, false, bool);
        ((Class340) this).aHa_Sub3_3954.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 124, 0);
        ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        method3439((byte) 35);
    }

    final boolean method3432(int i) {
        anInt8166++;
        if (i != 4095)
            return false;
        return aBoolean8173;
    }

    final void method3433(int i, int i_5_, int i_6_) {
        if (i == -26427)
            anInt8177++;
    }

    final void method3442(Interface21 interface21, int i, byte i_7_) {
        if (interface21 == null) {
            if (!aBoolean8164) {
                ((Class340) this).aHa_Sub3_3954.method929((((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInterface21_6237), -8423);
                ((Class340) this).aHa_Sub3_3954.method993((byte) 106, 1);
                ((Class340) this).aHa_Sub3_3954.method946(0, -75, Class346_Sub7_Sub3_Sub1.aClass280_10511);
                ((Class340) this).aHa_Sub3_3954.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 93, 0);
                aBoolean8164 = true;
            }
        } else {
            if (aBoolean8164) {
                ((Class340) this).aHa_Sub3_3954.method946(0, -77, Class147.aClass280_1738);
                ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 110, 0);
                aBoolean8164 = false;
            }
            ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
            ((Class340) this).aHa_Sub3_3954.method993((byte) 113, i);
        }
        anInt8170++;
        if (i_7_ <= 68)
            aBoolean8174 = false;
    }

    static {
        aClass365_8165 = new Class365(128);
        anInt8182 = -1;
    }
}
