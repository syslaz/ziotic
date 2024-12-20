/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class214 {
    static int anInt2469;
    static Class14 aClass14_2470 = new Class14();
    static int anInt2471;
    static float aFloat2472;
    static int anInt2473 = 1406;
    static int anInt2474;

    public static void method1734(int i) {
        aClass14_2470 = null;
        if (i != 3507)
            method1736(-125, -120, -96, -8, null, null, 102, 55, 60, -6, (byte) 116, 113);
    }

    static final Class188 method1735(int i, ha_Sub3_Sub1 var_ha_Sub3_Sub1, byte[] is, int i_0_) {
        anInt2469++;
        if (is == null || is.length == 0)
            return null;
        if (i < 18)
            return null;
        long l = OpenGL.glCreateShaderObjectARB(i_0_);
        OpenGL.glShaderSourceRawARB(l, is);
        OpenGL.glCompileShaderARB(l);
        OpenGL.glGetObjectParameterivARB(l, 35713, Class316.anIntArray3663, 0);
        if (Class316.anIntArray3663[0] == 0) {
            if (Class316.anIntArray3663[0] == 0)
                System.out.println("Shader compile failed:");
            OpenGL.glGetObjectParameterivARB(l, 35716, Class316.anIntArray3663, 1);
            if ((Class316.anIntArray3663[1] ^ 0xffffffff) < -2) {
                byte[] is_1_ = new byte[Class316.anIntArray3663[1]];
                OpenGL.glGetInfoLogARB(l, Class316.anIntArray3663[1], Class316.anIntArray3663, 0, is_1_, 0);
                System.out.println(new String(is_1_));
            }
            if ((Class316.anIntArray3663[0] ^ 0xffffffff) == -1) {
                OpenGL.glDeleteObjectARB(l);
                return null;
            }
        }
        return new Class188(var_ha_Sub3_Sub1, l, i_0_);
    }

    static final void method1736(int i, int i_2_, int i_3_, int i_4_, Class186 class186, Class272 class272, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_, int i_10_) {
        Node_Sub14_Sub12.anInt9264 = i_7_;
        Class136_Sub4_Sub1.anInt9970 = i_5_;
        Class282_Sub21.aClass272_7813 = class272;
        Class317.aClass157_3668 = null;
        Class352.aClass157_4181 = null;
        Class361.anInt4455 = i;
        Class278.anInt3234 = i_10_;
        Class346_Sub7_Sub2_Sub2.aClass186_10353 = class186;
        Class182.anInt2106 = i_3_;
        anInt2471++;
        int i_11_ = -123 % ((5 - i_9_) / 45);
        Node_Sub8_Sub16.anInt9051 = i_6_;
        Class77.anInt985 = i_4_;
        ha_Sub2.anInt5606 = i_8_;
        Class245.anInt2750 = i_2_;
        Class304.aClass157_3534 = null;
        Class249.method2699((byte) -54);
        Class27.aBoolean366 = true;
    }
}
