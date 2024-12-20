/* Class248_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Node_Sub11_Sub1 extends Node_Sub11 {
    static int anInt9127;
    static int anInt9128;
    private Class223 aClass223_9129;
    static int anInt9130;
    private int anInt9131;
    static int anInt9132;
    private Class221 aClass221_9133;
    private int anInt9134;
    static int anInt9135;
    private Class136_Sub4 aClass136_Sub4_9136;
    static int anInt9137;
    static int anInt9138;
    private Class221 aClass221_9139;
    private Class221 aClass221_9140;
    private Class223 aClass223_9141;
    static int anInt9142;
    static int anInt9143;
    private Class221 aClass221_9144;
    static int anInt9145;
    private Class136_Sub4 aClass136_Sub4_9146;
    static int anInt9147;
    private Class136_Sub4[] aClass136_Sub4Array9148;
    static int anInt9149;
    private int anInt9150;
    static int anInt9151;
    private int anInt9152;

    static final String method2251(int i, String string) {
        if (i != 256)
            method2252(58, -83, -23, null, 70, false, -81L);
        anInt9138++;
        StringBuffer stringbuffer = new StringBuffer();
        int i_0_ = string.length();
        for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
            char c = string.charAt(i_1_);
            if ((c ^ 0xffffffff) == -38 && 2 + i_1_ < i_0_) {
                int i_2_ = string.charAt(i_1_ - -1);
                boolean bool = false;
                int i_3_;
                if ((i_2_ ^ 0xffffffff) <= -49 && i_2_ <= 57)
                    i_3_ = -48 + i_2_;
                else if (i_2_ >= 97 && (i_2_ ^ 0xffffffff) >= -103)
                    i_3_ = -97 + (10 - -i_2_);
                else if ((i_2_ ^ 0xffffffff) <= -66 && (i_2_ ^ 0xffffffff) >= -71)
                    i_3_ = 10 + (i_2_ - 65);
                else {
                    stringbuffer.append('%');
                    continue;
                }
                i_2_ = string.charAt(i_1_ + 2);
                i_3_ *= 16;
                if (i_2_ >= 48 && (i_2_ ^ 0xffffffff) >= -58)
                    i_3_ += i_2_ + -48;
                else if ((i_2_ ^ 0xffffffff) <= -98 && i_2_ <= 102)
                    i_3_ += -97 + (i_2_ + 10);
                else if ((i_2_ ^ 0xffffffff) <= -66 && i_2_ <= 70)
                    i_3_ += 10 + (i_2_ + -65);
                else {
                    stringbuffer.append('%');
                    continue;
                }
                if ((i_3_ ^ 0xffffffff) != -1 && Class279.method2882((byte) i_3_, i ^ ~0x159))
                    stringbuffer.append(Class226.method1802((byte) -71, (byte) i_3_));
                i_1_ += 2;
            } else if (c != 43)
                stringbuffer.append(c);
            else
                stringbuffer.append(' ');
        }
        return stringbuffer.toString();
    }

    final void method2241(Class136_Sub4 class136_sub4, Class136_Sub4 class136_sub4_4_, int i, int i_5_) {
        OpenGL.glPushAttrib(2048);
        anInt9145++;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        if (aClass136_Sub4Array9148 != null) {
            ((Node_Sub11) this).aHa_Sub2_6953.method873(aClass223_9141, i + 12103);
            int i_6_ = Class44_Sub1.method318(27690, anInt9134);
            int i_7_ = Class44_Sub1.method318(27690, anInt9150);
            int i_8_ = 0;
            while (i_6_ > 256 || (i_7_ ^ 0xffffffff) < -257) {
                OpenGL.glViewport(0, 0, i_6_, i_7_);
                aClass223_9141.method1778(-22433, 0, aClass136_Sub4Array9148[i_8_]);
                if (i_6_ > 256)
                    i_6_ >>= 1;
                if (i_8_ != 0) {
                    ((Node_Sub11) this).aHa_Sub2_6953.method889(i ^ 0x2f47, aClass136_Sub4Array9148[-1 + i_8_]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, class136_sub4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) anInt9134, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) anInt9134, (float) anInt9150);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) anInt9150);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if ((i_7_ ^ 0xffffffff) < -257)
                    i_7_ >>= 1;
                i_8_++;
            }
            ((Node_Sub11) this).aHa_Sub2_6953.method887(aClass223_9141, -128);
            ((Node_Sub11) this).aHa_Sub2_6953.method889(i + 12101, aClass136_Sub4Array9148[i_8_ - 1]);
            ((Node_Sub11) this).aHa_Sub2_6953.method873(aClass223_9129, 0);
            aClass223_9129.method1784(0, false);
            OpenGL.glViewport(0, 0, 256, 256);
            long l = ((Class221) aClass221_9133).aLong2531;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"), Class141.aFloat5058, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, class136_sub4);
            ((Node_Sub11) this).aHa_Sub2_6953.method873(aClass223_9129, 0);
            aClass223_9129.method1784(0, false);
            OpenGL.glViewport(0, 0, 256, 256);
            long l = ((Class221) aClass221_9140).aLong2531;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"), Class141.aFloat5058, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) anInt9134, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) anInt9134, (float) anInt9150);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) anInt9150);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        aClass223_9129.method1784(1, false);
        ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, aClass136_Sub4_9146);
        long l = ((Class221) aClass221_9144).aLong2531;
        OpenGL.glUseProgramObjectARB(l);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        if (i != -12103)
            aClass223_9141 = null;
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        aClass223_9129.method1784(0, false);
        ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, aClass136_Sub4_9136);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        ((Node_Sub11) this).aHa_Sub2_6953.method887(aClass223_9129, 49);
        long l_9_ = ((Class221) aClass221_9139).aLong2531;
        OpenGL.glUseProgramObjectARB(l_9_);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_9_, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_9_, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l_9_, "params"), Class258.aFloat2955, Class224.aFloat2541, 0.0F);
        ((Node_Sub11) this).aHa_Sub2_6953.method880(true, 1);
        ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, aClass136_Sub4_9146);
        ((Node_Sub11) this).aHa_Sub2_6953.method880(true, 0);
        ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, class136_sub4);
    }

    static final void method2252(int i, int i_10_, int i_11_, Class381 class381, int i_12_, boolean bool, long l) {
        anInt9127++;
        Class42.method305(i_10_, i_12_, i_11_, l, bool, class381, 0, 0);
        if (i < 72)
            method2253((byte) -106);
    }

    Node_Sub11_Sub1(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
    }

    final boolean method2242(boolean bool) {
        anInt9149++;
        if (bool != true)
            aClass136_Sub4_9136 = null;
        if (aClass223_9129 == null)
            return false;
        return true;
    }

    final int method2246(byte i) {
        if (i != 30)
            method2241(null, null, -27, 9);
        anInt9147++;
        return 1;
    }

    final boolean method2240(int i) {
        if (i != 1)
            method2251(13, null);
        anInt9151++;
        if (((ha_Sub2) ((Node_Sub11) this).aHa_Sub2_6953).aBoolean5836 && ((ha_Sub2) ((Node_Sub11) this).aHa_Sub2_6953).aBoolean5930 && (((ha_Sub2) ((Node_Sub11) this).aHa_Sub2_6953).aBoolean5907)) {
            aClass223_9129 = new Class223(((Node_Sub11) this).aHa_Sub2_6953);
            aClass136_Sub4_9146 = new Class136_Sub4(((Node_Sub11) this).aHa_Sub2_6953, 3553, 34842, 256, 256);
            aClass136_Sub4_9146.method1266((byte) -60, false, false);
            aClass136_Sub4_9136 = new Class136_Sub4(((Node_Sub11) this).aHa_Sub2_6953, 3553, 34842, 256, 256);
            aClass136_Sub4_9136.method1266((byte) -60, false, false);
            ((Node_Sub11) this).aHa_Sub2_6953.method873(aClass223_9129, i + -1);
            aClass223_9129.method1778(-22433, 0, aClass136_Sub4_9146);
            aClass223_9129.method1778(-22433, 1, aClass136_Sub4_9136);
            aClass223_9129.method1784(0, false);
            if (!aClass223_9129.method1770(69)) {
                ((Node_Sub11) this).aHa_Sub2_6953.method887(aClass223_9129, -99);
                return false;
            }
            ((Node_Sub11) this).aHa_Sub2_6953.method887(aClass223_9129, i + -118);
            aClass221_9140 = (Class301_Sub1.method3189(((Node_Sub11) this).aHa_Sub2_6953, (new Class29[]{Class181.method1603(4, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, ((Node_Sub11) this).aHa_Sub2_6953)}), -96));
            aClass221_9133 = (Class301_Sub1.method3189(((Node_Sub11) this).aHa_Sub2_6953, (new Class29[]{Class181.method1603(4, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, ((Node_Sub11) this).aHa_Sub2_6953)}), -94));
            aClass221_9139 = (Class301_Sub1.method3189(((Node_Sub11) this).aHa_Sub2_6953, (new Class29[]{Class181.method1603(4, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, ((Node_Sub11) this).aHa_Sub2_6953)}), -81));
            aClass221_9144 = (Class301_Sub1.method3189(((Node_Sub11) this).aHa_Sub2_6953, (new Class29[]{Class181.method1603(4, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, ((Node_Sub11) this).aHa_Sub2_6953)}), -87));
            if (aClass221_9133 == null || aClass221_9140 == null || aClass221_9139 == null || aClass221_9144 == null)
                return false;
            return true;
        }
        return false;
    }

    final void method2250(int i, int i_13_, int i_14_) {
        anInt9132++;
        anInt9150 = i;
        if (i_14_ == 2048) {
            anInt9134 = i_13_;
            int i_15_ = Class44_Sub1.method318(27690, anInt9134);
            int i_16_ = Class44_Sub1.method318(i_14_ ^ 0x642a, anInt9150);
            if (i_15_ != anInt9152 || i_16_ != anInt9131) {
                if (aClass136_Sub4Array9148 != null) {
                    for (int i_17_ = 0; i_17_ < aClass136_Sub4Array9148.length; i_17_++)
                        aClass136_Sub4Array9148[i_17_].method1249(79);
                    aClass136_Sub4Array9148 = null;
                }
                if ((i_15_ ^ 0xffffffff) < -257 || (i_16_ ^ 0xffffffff) < -257) {
                    int i_18_ = i_15_;
                    int i_19_ = i_16_;
                    int i_20_ = 0;
                    while ((i_18_ ^ 0xffffffff) < -257 || i_19_ > 256) {
                        if ((i_19_ ^ 0xffffffff) < -257)
                            i_19_ >>= 1;
                        if (i_18_ > 256)
                            i_18_ >>= 1;
                        i_20_++;
                    }
                    if (aClass223_9141 == null)
                        aClass223_9141 = new Class223(((Node_Sub11) this).aHa_Sub2_6953);
                    i_18_ = i_15_;
                    aClass136_Sub4Array9148 = new Class136_Sub4[i_20_];
                    i_19_ = i_16_;
                    i_20_ = 0;
                    while ((i_18_ ^ 0xffffffff) < -257 || i_19_ > 256) {
                        aClass136_Sub4Array9148[i_20_++] = new Class136_Sub4((((Node_Sub11) this).aHa_Sub2_6953), 3553, 34842, i_18_, i_19_);
                        if ((i_19_ ^ 0xffffffff) < -257)
                            i_19_ >>= 1;
                        if (i_18_ > 256)
                            i_18_ >>= 1;
                    }
                } else
                    aClass223_9141 = null;
                anInt9131 = i_16_;
                anInt9152 = i_15_;
            }
        }
    }

    final void method2249(int i, boolean bool) {
        anInt9143++;
        OpenGL.glUseProgramObjectARB(0L);
        ((Node_Sub11) this).aHa_Sub2_6953.method880(bool, 1);
        ((Node_Sub11) this).aHa_Sub2_6953.method889(-2, null);
        ((Node_Sub11) this).aHa_Sub2_6953.method880(true, 0);
    }

    static final void method2253(byte i) {
        anInt9130++;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335.method2961(true) == 0 && Class84_Sub5.anInt5425 != Class177.anInt2074)
            Class207.method1707(Class150.anInt1751, false, 11, Node_Sub19.anInt7031, 0);
        else {
            Class346_Sub7_Sub2_Sub2.method3611(Class287.aHa3381, -1445596343);
            if ((Class177.anInt2074 ^ 0xffffffff) != (Class10.anInt236 ^ 0xffffffff))
                Class166.method1534(-1);
            if (i != 34)
                anInt9135 = -105;
        }
    }

    final void method2245(boolean bool) {
        aClass136_Sub4_9136 = null;
        if (bool != false)
            method2242(true);
        aClass221_9133 = null;
        aClass223_9129 = null;
        aClass136_Sub4_9146 = null;
        anInt9137++;
        aClass221_9140 = null;
        aClass221_9139 = null;
        aClass223_9141 = null;
        aClass221_9144 = null;
        aClass136_Sub4Array9148 = null;
    }

    static final int method2254(int i, int i_21_, boolean bool) {
        if (bool != false)
            method2251(-26, null);
        anInt9128++;
        int i_22_ = i_21_ >>> 652890712;
        i_21_ = (~0xff00ff & i_22_ * (0xff00ff & i_21_) | (i_21_ & 0xff00) * i_22_ & 0xff0000) >>> -1698276632;
        int i_23_ = -i_22_ + 255;
        return i_21_ + ((0xff0000 & (0xff00 & i) * i_23_ | ~0xff00ff & i_23_ * (0xff00ff & i)) >>> 217525800);
    }

    final boolean method2255(int i) {
        if (i != 0)
            method2249(-79, false);
        anInt9142++;
        if (!((ha_Sub2) ((Node_Sub11) this).aHa_Sub2_6953).aBoolean5836 || !((ha_Sub2) ((Node_Sub11) this).aHa_Sub2_6953).aBoolean5930 || !((ha_Sub2) ((Node_Sub11) this).aHa_Sub2_6953).aBoolean5907)
            return false;
        return true;
    }
}
