/* Class340_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class340_Sub8 extends Class340 {
    static int anInt8183;
    static int anInt8184;
    static int anInt8185;
    private Class370 aClass370_8186;
    static int[][] anIntArrayArray8187;
    static int anInt8188;
    private boolean aBoolean8189;
    static OutgoingOpcode aOutgoingOpcode_8190 = new OutgoingOpcode(19, 3);
    static int anInt8191;
    private boolean aBoolean8192;
    static int anInt8193 = -1;
    static int anInt8194;
    private Class169 aClass169_8195;
    static Class243 aClass243_8196;
    static int anInt8197;

    final void method3441(boolean bool) {
        anInt8184++;
        if (aBoolean8192) {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean8192 = false;
        }
        if (bool != true)
            anIntArrayArray8187 = null;
    }

    static final float[] method3466(boolean bool, float[] fs, int i) {
        if (bool != false)
            return null;
        anInt8188++;
        float[] fs_0_ = new float[i];
        Class159.method1400(fs, 0, fs_0_, 0, i);
        return fs_0_;
    }

    Class340_Sub8(ha_Sub3_Sub1 var_ha_Sub3_Sub1, Class381 class381, Class370 class370) {
        super(var_ha_Sub3_Sub1);
        aClass370_8186 = class370;
        if (class381 != null && ((ha_Sub3_Sub1) var_ha_Sub3_Sub1).aBoolean8764 && ((ha_Sub3_Sub1) var_ha_Sub3_Sub1).aBoolean8761) {
            Class188 class188 = (Class214.method1735(77, var_ha_Sub3_Sub1, class381.method3908("environment_mapped_water_v", "gl", (byte) 81), 35633));
            Class188 class188_1_ = (Class214.method1735(35, var_ha_Sub3_Sub1, class381.method3908("environment_mapped_water_f", "gl", (byte) 123), 35632));
            aClass169_8195 = Class56.method451((byte) 37, var_ha_Sub3_Sub1, new Class188[]{class188, class188_1_});
            aBoolean8189 = aClass169_8195 != null && aClass370_8186.method3852(-17546);
        } else
            aBoolean8189 = false;
    }

    final void method3435(boolean bool, int i) {
        if (i < 109)
            method3442(null, -44, (byte) -95);
        anInt8197++;
    }

    final void method3442(Interface21 interface21, int i, byte i_2_) {
        if (i_2_ < 68)
            method3443(false, false);
        anInt8194++;
        if (!aBoolean8192) {
            ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
            ((Class340) this).aHa_Sub3_3954.method993((byte) 125, i);
        }
    }

    final void method3443(boolean bool, boolean bool_3_) {
        anInt8185++;
        Interface21_Impl3 interface21_impl3 = ((Class340) this).aHa_Sub3_3954.method974(0);
        if (aBoolean8189 && interface21_impl3 != null) {
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(interface21_impl3, -8423);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
            ((Class340) this).aHa_Sub3_3954.method929(((Class370) aClass370_8186).anInterface21_Impl1_4550, -8423);
            long l = ((Class169) aClass169_8195).aLong1978;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloatArray6182[0]), -(((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloatArray6182[1]), -(((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloatArray6182[2]));
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), ((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloat6185, ((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloat6224, ((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloat6202, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), 96.0F + 928.0F * Math.abs(((ha_Sub3) ((Class340) this).aHa_Sub3_3954).aFloatArray6182[1]));
            aBoolean8192 = true;
        }
        if (bool != true)
            method3432(41);
    }

    final void method3433(int i, int i_4_, int i_5_) {
        if (aBoolean8192) {
            int i_6_ = 1 << (i_4_ & 0x3);
            float f = (float) (1 << (0x7 & i_4_ >> -1736494173)) / 32.0F;
            int i_7_ = i_5_ & 0xffff;
            float f_8_ = (float) (i_5_ >> 938306800 & 0x3) / 8.0F;
            long l = ((Class169) aClass169_8195).aLong1978;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) ((((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInt6187) * i_6_ % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_7_);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_8_);
        }
        if (i == -26427)
            anInt8191++;
    }

    final boolean method3432(int i) {
        if (i != 4095)
            return true;
        anInt8183++;
        return aBoolean8189;
    }

    public static void method3467(byte i) {
        int i_9_ = -51 / ((-20 - i) / 47);
        aOutgoingOpcode_8190 = null;
        anIntArrayArray8187 = null;
        aClass243_8196 = null;
    }
}
