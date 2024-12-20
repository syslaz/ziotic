/* Class84_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.*;

final class Class84_Sub6 extends Class84 {
    private boolean aBoolean5435;
    static int anInt5436;
    private boolean aBoolean5437;
    static int anInt5438;
    static int anInt5439;
    private Class287 aClass287_5440;
    private Class287 aClass287_5441;
    private Class287 aClass287_5442;
    private Class136_Sub4 aClass136_Sub4_5443;
    static int anInt5444;
    private Class287 aClass287_5445;
    static int anInt5446;
    static IncommingOpcode aIncommingOpcode_5447 = new IncommingOpcode(3, -1);
    static int anInt5448;
    static int anInt5449;
    static int anInt5450;
    static int anInt5451;
    static int anInt5452;
    static int anInt5453;
    private boolean aBoolean5454 = false;
    static int anInt5455;
    private boolean aBoolean5456;

    final void method616(byte i) {
        if (aBoolean5435) {
            int i_0_ = ((Class84) this).aHa_Sub2_1036.XA();
            int i_1_ = ((Class84) this).aHa_Sub2_1036.i();
            float f = (float) i_0_ - (float) (-i_1_ + i_0_) * 0.125F;
            float f_2_ = (float) i_0_ - (float) (-i_1_ + i_0_) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, f_2_, f, 1.0F / (float) (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5854), ((float) ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5880 / 255.0F));
            ((Class84) this).aHa_Sub2_1036.method880(true, 1);
            ((Class84) this).aHa_Sub2_1036.method901(-50, ((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5856);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        }
        if (i > -9)
            aIncommingOpcode_5447 = null;
        anInt5439++;
    }

    static final boolean method617(Class56 class56, int i) {
        anInt5450++;
        if (class56 == null)
            return false;
        if (!((Class56) class56).aBoolean767)
            return false;
        int i_3_ = 91 / ((62 - i) / 40);
        if (!class56.method449((byte) -14, Class116.anInterface3_1438))
            return false;
        if (za_Sub1.aClass65_9797.method501((long) ((Class56) class56).anInt758, (byte) 31) != null)
            return false;
        if (Node_Sub12.aClass65_6963.method501((long) ((Class56) class56).anInt751, (byte) 31) != null)
            return false;
        return true;
    }

    final void method618(byte i) {
        if (i < -85) {
            anInt5436++;
            Class238_Sub3 class238_sub3 = (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aClass238_Sub3_5834);
            if (!aBoolean5456)
                OpenGL.glBindProgramARB(34336, ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5922 != 2147483647) ? ((Class287) aClass287_5441).anInt3388 : ((Class287) aClass287_5442).anInt3388));
            else
                OpenGL.glBindProgramARB(34336, ((((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5922 != 2147483647) ? ((Class287) aClass287_5445).anInt3388 : ((Class287) aClass287_5440).anInt3388));
            class238_sub3.method1906(0.0F, (float) (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).anInt5922), -1.0F, 15082, 0.0F, Class17.aFloatArray290);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, Class17.aFloatArray290[0], Class17.aFloatArray290[1], Class17.aFloatArray290[2], Class17.aFloatArray290[3]);
            OpenGL.glEnable(34336);
            aBoolean5435 = true;
            method616((byte) -86);
        }
    }

    final void method599(byte i, boolean bool) {
        if (i > -123)
            aBoolean5456 = true;
        anInt5451++;
    }

    public static void method619(byte i) {
        aIncommingOpcode_5447 = null;
        if (i >= -95)
            method620(-76, 33, -11);
    }

    static final boolean method620(int i, int i_4_, int i_5_) {
        if (i_4_ != 0)
            aIncommingOpcode_5447 = null;
        anInt5438++;
        if ((i & 0x100100) == 0)
            return false;
        return true;
    }

    final void method597(boolean bool) {
        anInt5455++;
        if (aBoolean5435) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            aBoolean5435 = false;
        }
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        ((Class84) this).aHa_Sub2_1036.method889(-2, null);
        ((Class84) this).aHa_Sub2_1036.method858(-63, 8448, 8448);
        ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
        ((Class84) this).aHa_Sub2_1036.method911(770, 34166, 2, (byte) 4);
        ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
        ((Class84) this).aHa_Sub2_1036.method880(true, 0);
        if (bool == false) {
            if (aBoolean5454) {
                ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
                ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
                aBoolean5454 = false;
            }
        }
    }

    final boolean method600(int i) {
        if (i != -16777216)
            return false;
        anInt5446++;
        return aBoolean5437;
    }

    static final ha method621(byte i, int i_6_, d var_d, int i_7_, Canvas canvas) {
        anInt5444++;
        int i_8_ = -73 / ((i - 12) / 60);
        return new ha_Sub1(canvas, var_d, i_6_, i_7_);
    }

    static final void method622(byte i) {
        for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -101; i_9_++)
            Class13.aClass94Array259[i_9_] = null;
        if (i < 7)
            method619((byte) 5);
        anInt5449++;
        Class39.anInt427 = 0;
    }

    Class84_Sub6(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
        if (!((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aBoolean5871)
            aBoolean5437 = false;
        else {
            aClass287_5442 = (Class56.method443((byte) 121, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", ((Class84) this).aHa_Sub2_1036, 34336));
            aClass287_5440 = (Class56.method443((byte) 93, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", ((Class84) this).aHa_Sub2_1036, 34336));
            aClass287_5441 = (Class56.method443((byte) 84, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", ((Class84) this).aHa_Sub2_1036, 34336));
            aClass287_5445 = (Class56.method443((byte) 122, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", ((Class84) this).aHa_Sub2_1036, 34336));
            if (!(aClass287_5445 != null & (aClass287_5441 != null & (aClass287_5442 != null & aClass287_5440 != null))))
                aBoolean5437 = false;
            else {
                aClass136_Sub4_5443 = new Class136_Sub4(var_ha_Sub2, 3553, 6406, 2, 1, false, new byte[]{0, -1}, 6406, false);
                aClass136_Sub4_5443.method1266((byte) -60, false, false);
                aBoolean5437 = true;
            }
        }
    }

    final void method603(byte i, int i_10_, Class136 class136) {
        anInt5453++;
        if (class136 == null) {
            if (!aBoolean5454) {
                ((Class84) this).aHa_Sub2_1036.method889(-2, (((ha_Sub2) ((Class84) this).aHa_Sub2_1036).aClass136_Sub4_5889));
                ((Class84) this).aHa_Sub2_1036.method881((byte) 126, 1);
                ((Class84) this).aHa_Sub2_1036.method911(768, 34168, 0, (byte) 4);
                ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34168);
                aBoolean5454 = true;
            }
        } else {
            if (aBoolean5454) {
                ((Class84) this).aHa_Sub2_1036.method911(768, 5890, 0, (byte) 4);
                ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 5890);
                aBoolean5454 = false;
            }
            ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
            ((Class84) this).aHa_Sub2_1036.method881((byte) 120, i_10_);
        }
        if (i < 53)
            method602(true, (byte) -75);
    }

    final void method601(int i, int i_11_, int i_12_) {
        anInt5448++;
        int i_13_ = 77 / ((i_12_ - 74) / 36);
    }

    final void method602(boolean bool, byte i) {
        anInt5452++;
        aBoolean5456 = bool;
        ((Class84) this).aHa_Sub2_1036.method880(true, 1);
        if (i > 1) {
            ((Class84) this).aHa_Sub2_1036.method889(-2, aClass136_Sub4_5443);
            ((Class84) this).aHa_Sub2_1036.method858(-54, 7681, 34165);
            ((Class84) this).aHa_Sub2_1036.method911(768, 34166, 0, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method911(770, 5890, 2, (byte) 4);
            ((Class84) this).aHa_Sub2_1036.method849(0, 770, (byte) 37, 34168);
            ((Class84) this).aHa_Sub2_1036.method880(true, 0);
            method618((byte) -91);
        }
    }
}
