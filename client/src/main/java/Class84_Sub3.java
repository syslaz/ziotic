/* Class84_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub3 extends Class84 {
    static int anInt5391;
    static int anInt5392;
    static int anInt5393;
    static int anInt5394;
    private boolean aBoolean5395 = false;
    private boolean aBoolean5396 = false;
    static int anInt5397;
    static int anInt5398;
    static Class147_Sub1[] aClass147_Sub1Array5399;
    private Class221 aClass221_5400;
    static int anInt5401 = 0;
    private Class183 aClass183_5402;

    final void method603(byte i, int i_0_, Class136 class136) {
        if (!aBoolean5395) {
            ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
            ((Class84) this).aHa_Sub2_1036.method881((byte) 115, i_0_);
        }
        anInt5392++;
        if (i < 53)
            method608(-74);
    }

    Class84_Sub3(ha_Sub2 var_ha_Sub2, Class183 class183) {
        super(var_ha_Sub2);
        aClass183_5402 = class183;
        if (((Class183) aClass183_5402).aClass136_Sub2_2139 != null && ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aBoolean5936 && ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aBoolean5930) {
            Class29 class29 = (Class181.method1603(4, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, ((Class84) this).aHa_Sub2_1036));
            Class29 class29_1_ = (Class181.method1603(4, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, ((Class84) this).aHa_Sub2_1036));
            aClass221_5400 = Class301_Sub1.method3189(((Class84) this).aHa_Sub2_1036, new Class29[]{class29, class29_1_}, -91);
            aBoolean5396 = aClass221_5400 != null;
        }
    }

    final void method599(byte i, boolean bool) {
        if (i >= -123)
            aClass147_Sub1Array5399 = null;
        anInt5398++;
    }

    final void method602(boolean bool, byte i) {
        anInt5397++;
        Class136_Sub3 class136_sub3 = ((Class84) this).aHa_Sub2_1036.method875(1);
        if (aBoolean5396 && class136_sub3 != null) {
            float f = (2.0F * (-Math.abs(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[1]) + 1.0F) + 1.0F);
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, class136_sub3);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5402).aClass136_Sub2_2139));
            long l = ((Class221) aClass221_5400).aLong2531;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[0]), -(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[1]), -(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[2]));
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), f * ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5884, f * ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5867, ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5893 * f, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), 928.0F * Math.abs(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloatArray5838[1]) + 64.0F);
            aBoolean5395 = true;
        }
        if (i <= 1)
            method601(-119, -124, -61);
    }

    final boolean method600(int i) {
        if (i != -16777216)
            return true;
        anInt5393++;
        return aBoolean5396;
    }

    public static void method608(int i) {
        aClass147_Sub1Array5399 = null;
        if (i != 3344)
            method608(-11);
    }

    final void method601(int i, int i_2_, int i_3_) {
        anInt5391++;
        int i_4_ = 68 / ((i_3_ - 74) / 36);
        if (aBoolean5395) {
            int i_5_ = 1 << (i & 0x3);
            float f = (float) (1 << ((i & 0x3b) >> -1725690621)) / 32.0F;
            int i_6_ = 0xffff & i_2_;
            float f_7_ = (float) (i_2_ >> -1545582384 & 0x3) / 8.0F;
            float f_8_ = (float) (0xf & i_2_ >> -1033039309) / 16.0F;
            float f_9_ = (float) (i_2_ >> 2143434871 & 0xf) / 16.0F;
            int i_10_ = (i_2_ & 0x7a9afbc6) >> 562736283;
            long l = ((Class221) aClass221_5400).aLong2531;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800) * i_5_ % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_6_);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_7_);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(l, "waveIntensity"), f_9_, f_8_);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "waveExponent"), (float) i_10_);
        }
    }

    final void method597(boolean bool) {
        if (bool != false)
            method597(true);
        anInt5394++;
        if (aBoolean5395) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean5395 = false;
        }
    }
}
