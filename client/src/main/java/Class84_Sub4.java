/* Class84_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class84_Sub4 extends Class84 {
    private Class357 aClass357_5403;
    static int anInt5404;
    static IncommingOpcode aIncommingOpcode_5405 = new IncommingOpcode(45, -2);
    private Class183 aClass183_5406;
    static int anInt5407;
    private float aFloat5408;
    static int anInt5409;
    static int anInt5410;
    private int anInt5411;
    static int anInt5412;
    static int anInt5413;
    static int anInt5414;
    static int anInt5415;
    private float[] aFloatArray5416;
    static int anInt5417;
    private Class287 aClass287_5418;
    static int anInt5419 = 0;
    static int anInt5420;

    final void method603(byte i, int i_0_, Class136 class136) {
        ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
        anInt5410++;
        if (i < 53)
            anInt5419 = -75;
        ((Class84) this).aHa_Sub2_1036.method881((byte) 124, i_0_);
    }

    final void method602(boolean bool, byte i) {
        anInt5413++;
        if (aClass357_5403 != null && i >= 1) {
            aClass357_5403.method3795((byte) 45, '\0');
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aClass238_Sub3_5835.method1907((byte) -111), 0);
            OpenGL.glMatrixMode(5888);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            if (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800 != anInt5411) {
                int i_1_ = (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800 % 5000 * 128 / 5000);
                for (int i_2_ = 0; i_2_ < 64; i_2_++) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, i_2_, aFloatArray5416, i_1_);
                    i_1_ += 2;
                }
                if (((Class183) aClass183_5406).aBoolean2144)
                    aFloat5408 = (float) ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800) % 4000) / 4000.0F;
                else
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                anInt5411 = ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800;
            }
        }
    }

    final void method601(int i, int i_3_, int i_4_) {
        anInt5409++;
        int i_5_ = -16 % ((74 - i_4_) / 36);
        if (aClass357_5403 != null) {
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            if ((0x80 & i) == 0) {
                if ((i_3_ & 0x1 ^ 0xffffffff) == -2) {
                    if (((Class183) aClass183_5406).aBoolean2144) {
                        ((Class84) this).aHa_Sub2_1036.method889(-2, ((Class183) aClass183_5406).aClass136_Sub2_2145);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat5408, 0.0F, 0.0F, 1.0F);
                    } else {
                        int i_6_ = 16 * ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5800) % 4000) / 4000;
                        ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5406).aClass136_Sub4Array2146[i_6_]));
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (((Class183) aClass183_5406).aBoolean2144)
                        ((Class84) this).aHa_Sub2_1036.method889(-2, ((Class183) aClass183_5406).aClass136_Sub2_2145);
                    else
                        ((Class84) this).aHa_Sub2_1036.method889(-2, (((Class183) aClass183_5406).aClass136_Sub4Array2146[0]));
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else
                ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            if ((i & 0x40 ^ 0xffffffff) != -1)
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            else {
                Class151.aFloatArray1802[1] = (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5867 * (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5878));
                Class151.aFloatArray1802[0] = (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5884 * (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5878));
                Class151.aFloatArray1802[2] = (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5878 * (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aFloat5893));
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, Class151.aFloatArray1802, 0);
            }
            int i_7_ = 0x3 & i;
            if (i_7_ == 2)
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            else if ((i_7_ ^ 0xffffffff) != -4)
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            else
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
        }
    }

    static final void method609(boolean bool) {
        anInt5407++;
        for (Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method510(bool)); class248_sub22 != null; class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method512(false))) {
            if (!((Node_Sub22) class248_sub22).aBoolean7076)
                Class282_Sub4.method2933(8718, (((Node_Sub22) class248_sub22).anInt7080));
            else
                ((Node_Sub22) class248_sub22).aBoolean7076 = false;
        }
        if (bool != true)
            method613((byte) 1);
    }

    Class84_Sub4(ha_Sub2 var_ha_Sub2, Class183 class183) {
        super(var_ha_Sub2);
        aClass183_5406 = class183;
        if (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aBoolean5871 && (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5888 ^ 0xffffffff) <= -3) {
            aClass287_5418 = (Class56.method443((byte) 85, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", ((Class84) this).aHa_Sub2_1036, 34336));
            if (aClass287_5418 != null) {
                int[][] is = Class346_Sub7_Sub5_Sub2.method3696((byte) -81, 64, 4, false, 0.4F, 4, 3, 256, 0);
                int[][] is_8_ = Class346_Sub7_Sub5_Sub2.method3696((byte) -81, 64, 4, false, 0.4F, 4, 3, 256, 8);
                int i = 0;
                aFloatArray5416 = new float[32768];
                for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -257; i_9_++) {
                    int[] is_10_ = is[i_9_];
                    int[] is_11_ = is_8_[i_9_];
                    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -65; i_12_++) {
                        aFloatArray5416[i++] = (float) is_10_[i_12_] / 4096.0F;
                        aFloatArray5416[i++] = (float) is_11_[i_12_] / 4096.0F;
                    }
                }
                method611(true);
            }
        }
    }

    public static void method610(boolean bool) {
        if (bool != false)
            method613((byte) -76);
        aIncommingOpcode_5405 = null;
    }

    private final void method611(boolean bool) {
        anInt5417++;
        aClass357_5403 = new Class357(((Class84) this).aHa_Sub2_1036, 2);
        aClass357_5403.method3794(-98, 0);
        ((Class84) this).aHa_Sub2_1036.method880(bool, 1);
        ((Class84) this).aHa_Sub2_1036.method901(-62, -16777216);
        ((Class84) this).aHa_Sub2_1036.method858(-38, 7681, 260);
        ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34166);
        ((Class84) this).aHa_Sub2_1036.method880(bool, 0);
        OpenGL.glBindProgramARB(34336, ((Class287) aClass287_5418).anInt3388);
        OpenGL.glEnable(34336);
        aClass357_5403.method3797((byte) 26);
        aClass357_5403.method3794(-112, 1);
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        ((Class84) this).aHa_Sub2_1036.method881((byte) 125, 0);
        ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
        ((Class84) this).aHa_Sub2_1036.method880(bool, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        aClass357_5403.method3797((byte) 26);
    }

    static final Class200[] method612(byte i) {
        if (i != 120)
            aIncommingOpcode_5405 = null;
        anInt5404++;
        return new Class200[]{Class10.aClass200_231, Class342.aClass200_4003, PacketStream.aClass200_9124};
    }

    final boolean method600(int i) {
        if (i != -16777216)
            return false;
        anInt5420++;
        return true;
    }

    final void method599(byte i, boolean bool) {
        if (i < -123)
            anInt5414++;
    }

    static final void method613(byte i) {
        int i_13_ = 0;
        if (i != -89)
            anInt5419 = -124;
        for (/**/; i_13_ < Class282_Sub4.anInt7624; i_13_++) {
            Class42 class42 = Class67.aClass42Array902[i_13_];
            if ((((Class42) class42).aByte541 ^ 0xffffffff) == -4) {
                if (((Class42) class42).aClass248_Sub15_Sub2_550 == null)
                    ((Class42) class42).anInt545 = -2147483648;
                else
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Class42) class42).aClass248_Sub15_Sub2_550);
            }
        }
        anInt5412++;
    }

    final void method597(boolean bool) {
        anInt5415++;
        if (aClass357_5403 != null) {
            aClass357_5403.method3795((byte) 77, '\001');
            ((Class84) this).aHa_Sub2_1036.method880(!bool, 1);
            if (bool != false)
                aFloatArray5416 = null;
            ((Class84) this).aHa_Sub2_1036.method889(-2, null);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
    }
}
