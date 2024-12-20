/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class382 {
    private ha_Sub2 aHa_Sub2_4696;
    static Class278 aClass278_4697 = new Class278(4);
    static int anInt4698;
    private Class221 aClass221_4699;
    static int anInt4700;
    static OutgoingOpcode aOutgoingOpcode_4701 = new OutgoingOpcode(18, -1);
    static int anInt4702 = 0;
    static int anInt4703;
    static boolean aBoolean4704;
    static int anInt4705;

    static final void method3935(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_) {
        anInt4698++;
        if ((i_5_ != (bool ? ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7339.method2993(true) : ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub17_7332.method2993(true))) && i != 0 && (Class282_Sub4.anInt7624 ^ 0xffffffff) > -51 && i_0_ != -1)
            Class67.aClass42Array902[Class282_Sub4.anInt7624++] = new Class42(bool ? (byte) 3 : (byte) 2, i_0_, i, i_4_, i_2_, i_1_, i_3_, null);
    }

    public static void method3936(boolean bool) {
        if (bool != false)
            method3935(-94, -68, -78, -3, 22, -23, false, -61);
        aOutgoingOpcode_4701 = null;
        aClass278_4697 = null;
    }

    final boolean method3937(Class136_Sub2 class136_sub2, float f, byte i, Class136_Sub2 class136_sub2_6_) {
        anInt4705++;
        if (!method3938(35632))
            return false;
        Class223 class223 = ((ha_Sub2) aHa_Sub2_4696).aClass223_5895;
        Node_Sub8_Sub4 class248_sub8_sub4 = new Node_Sub8_Sub4(aHa_Sub2_4696, 6408, ((Class136_Sub2) class136_sub2).anInt8385, (((Class136_Sub2) class136_sub2).anInt8392));
        if (i < 102)
            method3937(null, -0.32176483F, (byte) -104, null);
        boolean bool = false;
        aHa_Sub2_4696.method873(class223, 0);
        class223.method1777(class248_sub8_sub4, 15061, 0);
        if (class223.method1770(-88)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, ((Class136_Sub2) class136_sub2).anInt8385, ((Class136_Sub2) class136_sub2).anInt8392);
            OpenGL.glUseProgramObjectARB(((Class221) aClass221_4699).aLong2531);
            OpenGL.glUniform1iARB((OpenGL.glGetUniformLocationARB(((Class221) aClass221_4699).aLong2531, "heightMap")), 0);
            OpenGL.glUniform1fARB((OpenGL.glGetUniformLocationARB(((Class221) aClass221_4699).aLong2531, "rcpRelief")), 1.0F / f);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB((((Class221) aClass221_4699).aLong2531), "sampleSize"), 1.0F / (float) ((Class136_Sub2) class136_sub2_6_).anInt8385, 1.0F / (float) ((Class136_Sub2) class136_sub2_6_).anInt8392);
            for (int i_7_ = 0; ((Class136_Sub2) class136_sub2).anInt8394 > i_7_; i_7_++) {
                float f_8_ = ((float) i_7_ / (float) ((Class136_Sub2) class136_sub2).anInt8394);
                aHa_Sub2_4696.method889(-2, class136_sub2_6_);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, f_8_);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, f_8_);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, f_8_);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, f_8_);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                class136_sub2.method1255(0, 0, -118, i_7_, 0, (((Class136_Sub2) class136_sub2).anInt8385), 0, (((Class136_Sub2) class136_sub2).anInt8392));
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            bool = true;
            OpenGL.glPopMatrix();
        }
        class223.method1783(1, 0);
        aHa_Sub2_4696.method887(class223, -116);
        return bool;
    }

    final boolean method3938(int i) {
        anInt4703++;
        if (i != 35632)
            method3935(-14, 22, 55, 119, -38, -92, false, -111);
        if (((ha_Sub2) aHa_Sub2_4696).aBoolean5836 && ((ha_Sub2) aHa_Sub2_4696).aBoolean5930 && aClass221_4699 == null) {
            Class29 class29 = (Class181.method1603(i + -35628, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, aHa_Sub2_4696));
            if (class29 != null)
                aClass221_4699 = Class301_Sub1.method3189(aHa_Sub2_4696, new Class29[]{class29}, -81);
        }
        if (aClass221_4699 == null)
            return false;
        return true;
    }

    static final void method3939(byte i) {
        if (i <= 6)
            anInt4702 = -43;
        for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (r.aByteArrayArrayArray9033.length ^ 0xffffffff)); i_9_++) {
            for (int i_10_ = 0; ((r.aByteArrayArrayArray9033[0].length ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
                for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (r.aByteArrayArrayArray9033[0][0].length ^ 0xffffffff)); i_11_++)
                    r.aByteArrayArrayArray9033[i_9_][i_10_][i_11_] = (byte) 0;
            }
        }
        anInt4700++;
    }

    Class382(ha_Sub2 var_ha_Sub2) {
        aHa_Sub2_4696 = var_ha_Sub2;
    }
}
