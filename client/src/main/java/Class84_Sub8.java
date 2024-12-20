/* Class84_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub8 extends Class84 {
    private boolean aBoolean5472 = false;
    static String aString5473;
    static long aLong5474 = -1L;
    static int anInt5475;
    static int anInt5476;
    static int anInt5477;
    static int anInt5478;
    private Class183 aClass183_5479;
    static int anInt5480;
    static int anInt5481;
    private boolean aBoolean5482 = false;
    private Class221 aClass221_5483;
    static int anInt5484;
    static int anInt5485;
    /*synthetic*/ static Class aClass5486;

    final void method597(boolean bool) {
        if (aBoolean5472) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean5472 = false;
        }
        if (bool != false)
            aString5473 = null;
        anInt5484++;
    }

    public static void method626(boolean bool) {
        if (bool != true)
            aString5473 = null;
        aString5473 = null;
    }

    final boolean method600(int i) {
        if (i != -16777216)
            return false;
        anInt5475++;
        return false;
    }

    static final void method627(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        if (Class302.anInt3500 > -i_1_ + i_0_ || Class289.anInt3399 < i_0_ + i_1_ || (i_3_ + -i_1_ ^ 0xffffffff) > (Class181.anInt2099 ^ 0xffffffff) || (i_1_ + i_3_ ^ 0xffffffff) < (aa_Sub3.anInt5270 ^ 0xffffffff))
            Node_Sub14_Sub18.method2330(i_1_, 1, i_3_, i, i_0_);
        else
            Class312.method3270(false, i_1_, i_3_, i, i_0_);
        if (i_2_ != 25187)
            method627(64, -86, 36, 103, 9);
        anInt5476++;
    }

    final void method601(int i, int i_4_, int i_5_) {
        if (aBoolean5472) {
            int i_6_ = 1 << (0x3 & i);
            float f = (float) (1 << (0x7 & i >> 1059753571)) / 32.0F;
            int i_7_ = 0xffff & i_4_;
            float f_8_ = (float) ((i_4_ & 0x3ad95) >> -1335003728) / 8.0F;
            long l = ((Class221) aClass221_5483).aLong2531;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (i_6_ * (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800) % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_7_);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_8_);
        }
        anInt5485++;
        int i_9_ = 54 / ((74 - i_5_) / 36);
    }

    final void method603(byte i, int i_10_, Class136 class136) {
        if (!aBoolean5472) {
            ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
            ((Class84) this).aHa_Sub2_1036.method881((byte) 113, i_10_);
        }
        anInt5477++;
        if (i < 53)
            method601(122, 72, -114);
    }

    final void method599(byte i, boolean bool) {
        if (i >= -123)
            aString5473 = null;
        anInt5480++;
    }

    Class84_Sub8(ha_Sub2 var_ha_Sub2, Class183 class183) {
        super(var_ha_Sub2);
        aClass183_5479 = class183;
        if (((Class183) aClass183_5479).aClass136_Sub2_2139 != null && ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aBoolean5936 && ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aBoolean5930) {
            Class29 class29 = (Class181.method1603(4, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, ((Class84) this).aHa_Sub2_1036));
            Class29 class29_11_ = (Class181.method1603(4, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, ((Class84) this).aHa_Sub2_1036));
            aClass221_5483 = Class301_Sub1.method3189(((Class84) this).aHa_Sub2_1036, new Class29[]{class29, class29_11_}, -114);
            aBoolean5482 = aClass221_5483 != null;
        }
    }

    final void method602(boolean bool, byte i) {
        anInt5478++;
        if (i <= 1)
            aBoolean5482 = false;
        Class136_Sub3 class136_sub3 = ((Class84) this).aHa_Sub2_1036.method875(1);
        if (aBoolean5482 && class136_sub3 != null) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, class136_sub3);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5479).aClass136_Sub2_2139));
            long l = ((Class221) aClass221_5483).aLong2531;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[0]), -(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[1]), -(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[2]));
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5884, ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5867, ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5893, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), 928.0F * Math.abs(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[1]) + 96.0F);
            aBoolean5472 = true;
        }
    }

    static final void method628(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
        if (i != -24938)
            method626(true);
        anInt5481++;
        while_218_:
        do {
            if ((i_15_ ^ 0xffffffff) <= -1 && i_13_ >= 0 && -1 + Node_Sub8_Sub4.anInt8360 > i_15_ && ((-1 + Node_Sub22.anInt7074 ^ 0xffffffff) < (i_13_ ^ 0xffffffff))) {
                if (Class311.aClass137ArrayArrayArray3620 == null)
                    break;
                if (i_12_ != 0) {
                    do {
                        if (i_12_ != 1) {
                            if (i_12_ != 2) {
                                if (i_12_ == 3) {
                                    Interface16 interface16 = ((Interface16) (Class346_Sub7_Sub1.method3584(i_17_, i_15_, i_13_)));
                                    if (interface16 != null) {
                                        if (interface16 instanceof Class346_Sub7_Sub4_Sub2)
                                            ((Class346_Sub7_Sub4_Sub2) (Class346_Sub7_Sub4_Sub2) interface16).aClass150_10158.method1342((byte) 118, i_14_);
                                        else
                                            Class222.method1769(i_16_, i_14_, i_17_, 121, i_12_, interface16.method40((byte) 112), i_15_, i_18_, i_13_);
                                    }
                                }
                            } else {
                                Interface16 interface16 = ((Interface16) (aa.method154(i_17_, i_15_, i_13_, (aClass5486 != null ? aClass5486 : (aClass5486 = method629("Interface16"))))));
                                if (interface16 == null)
                                    break;
                                if ((i_18_ ^ 0xffffffff) == -12)
                                    i_18_ = 10;
                                if (interface16 instanceof Class346_Sub7_Sub2_Sub4)
                                    ((Class346_Sub7_Sub2_Sub4) (Class346_Sub7_Sub2_Sub4) interface16).aClass150_10120.method1342((byte) 100, i_14_);
                                else
                                    Class222.method1769(i_16_, i_14_, i_17_, 126, i_12_, interface16.method40((byte) 97), i_15_, i_18_, i_13_);
                            }
                            break;
                        }
                        Interface16 interface16 = ((Interface16) Node_Sub19.method2517(i_17_, i_15_, i_13_));
                        if (interface16 == null)
                            break while_218_;
                        if (interface16 instanceof Class346_Sub7_Sub1_Sub2) {
                            ((Class346_Sub7_Sub1_Sub2) (Class346_Sub7_Sub1_Sub2) interface16).aClass150_10207.method1342((byte) -24, i_14_);
                            break;
                        }
                        int i_19_ = interface16.method40((byte) 109);
                        if (i_18_ == 4 || i_18_ == 5) {
                            Class222.method1769(i_16_, i_14_, i_17_, 107, i_12_, i_19_, i_15_, 4, i_13_);
                            break;
                        }
                        if ((i_18_ ^ 0xffffffff) != -7) {
                            if ((i_18_ ^ 0xffffffff) == -8) {
                                Class222.method1769((0x3 & 2 + i_16_) - -4, i_14_, i_17_, i ^ ~0x6112, i_12_, i_19_, i_15_, 4, i_13_);
                                break;
                            }
                            if (i_18_ == 8) {
                                Class222.method1769(4 + i_16_, i_14_, i_17_, i ^ 0x6103, i_12_, i_19_, i_15_, 4, i_13_);
                                Class222.method1769((0x3 & 2 + i_16_) + 4, i_14_, i_17_, -84, i_12_, i_19_, i_15_, 4, i_13_);
                                break;
                            }
                        } else
                            Class222.method1769(4 + i_16_, i_14_, i_17_, 100, i_12_, i_19_, i_15_, 4, i_13_);
                    } while (false);
                    break;
                }
                Interface16 interface16 = (Interface16) RSInterface2.method3763(i_17_, i_15_, i_13_);
                Interface16 interface16_20_ = ((Interface16) Node_Sub8_Sub13_Sub1.method2101(i_17_, i_15_, i_13_));
                if (interface16 != null && (i_18_ ^ 0xffffffff) != -3) {
                    if (interface16 instanceof Class346_Sub7_Sub5_Sub2)
                        ((Class346_Sub7_Sub5_Sub2) (Class346_Sub7_Sub5_Sub2) interface16).aClass150_10236.method1342((byte) 118, i_14_);
                    else
                        Class222.method1769(i_16_, i_14_, i_17_, -84, i_12_, interface16.method40((byte) 73), i_15_, i_18_, i_13_);
                }
                if (interface16_20_ != null) {
                    if (!(interface16_20_ instanceof Class346_Sub7_Sub5_Sub2)) {
                        Class222.method1769(i_16_, i_14_, i_17_, i + 24866, i_12_, interface16_20_.method40((byte) 67), i_15_, i_18_, i_13_);
                        break;
                    }
                    ((Class346_Sub7_Sub5_Sub2) (Class346_Sub7_Sub5_Sub2) interface16_20_).aClass150_10236.method1342((byte) -36, i_14_);
                }
            }
        } while (false);
    }

    /*synthetic*/
    static Class method629(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static {
        aString5473 = null;
    }
}
