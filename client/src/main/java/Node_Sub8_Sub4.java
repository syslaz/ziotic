/* Class248_Sub8_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Node_Sub8_Sub4 extends Node_Sub8 implements Interface5 {
    static int anInt8358;
    private int anInt8359;
    static int anInt8360 = 104;
    private int anInt8361;
    private int anInt8362 = -1;
    static int anInt8363;
    static String aString8364;
    static int anInt8365;
    static int anInt8366;
    private int anInt8367 = -1;
    static int anInt8368;
    private ha_Sub2 aHa_Sub2_8369;
    private int anInt8370;
    static Class128 aClass128_8371;
    static int anInt8372 = 0;
    static int anInt8373;
    int anInt8374;
    int anInt8375;
    static OutgoingOpcode aOutgoingOpcode_8376;
    static int anInt8377;
    static float aFloat8378;

    static final void method2045(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt8365++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i, -874792672, 8);
        class248_sub8_sub10.method2084(614);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976 = i_1_;
        int i_4_ = 88 / ((i_0_ - -28) / 43);
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981 = i_2_;
        ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983 = i_3_;
    }

    public static void method2046(boolean bool) {
        aString8364 = null;
        aOutgoingOpcode_8376 = null;
        if (bool != false)
            anInt8360 = -90;
        aClass128_8371 = null;
    }

    final void method2047(int i) {
        if (anInt8361 > 0) {
            aHa_Sub2_8369.method841(-24474, anInt8370, anInt8361);
            anInt8361 = 0;
        }
        int i_5_ = -72 / ((i - -5) / 58);
        anInt8358++;
    }

    protected final void finalize() throws Throwable {
        method2047(78);
        anInt8366++;
        super.finalize();
    }

    public final void method18(byte i) {
        OpenGL.glFramebufferRenderbufferEXT(anInt8367, anInt8362, 36161, 0);
        anInt8373++;
        if (i <= 106)
            method2047(-128);
        anInt8367 = -1;
        anInt8362 = -1;
    }

    Node_Sub8_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_6_, int i_7_) {
        anInt8359 = i;
        aHa_Sub2_8369 = var_ha_Sub2;
        ((Node_Sub8_Sub4) this).anInt8375 = i_7_;
        ((Node_Sub8_Sub4) this).anInt8374 = i_6_;
        OpenGL.glGenRenderbuffersEXT(1, Node_Sub30.anIntArray7193, 0);
        anInt8361 = Node_Sub30.anIntArray7193[0];
        OpenGL.glBindRenderbufferEXT(36161, anInt8361);
        OpenGL.glRenderbufferStorageEXT(36161, anInt8359, ((Node_Sub8_Sub4) this).anInt8374, ((Node_Sub8_Sub4) this).anInt8375);
        anInt8370 = (((Node_Sub8_Sub4) this).anInt8375 * ((Node_Sub8_Sub4) this).anInt8374 * aHa_Sub2_8369.method898(anInt8359, 6407));
    }

    Node_Sub8_Sub4(ha_Sub2 var_ha_Sub2, int i, int i_8_, int i_9_, int i_10_) {
        ((Node_Sub8_Sub4) this).anInt8375 = i_9_;
        anInt8359 = i;
        aHa_Sub2_8369 = var_ha_Sub2;
        ((Node_Sub8_Sub4) this).anInt8374 = i_8_;
        OpenGL.glGenRenderbuffersEXT(1, Node_Sub30.anIntArray7193, 0);
        anInt8361 = Node_Sub30.anIntArray7193[0];
        OpenGL.glBindRenderbufferEXT(36161, anInt8361);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_10_, anInt8359, (((Node_Sub8_Sub4) this).anInt8374), (((Node_Sub8_Sub4) this).anInt8375));
        anInt8370 = (((Node_Sub8_Sub4) this).anInt8375 * ((Node_Sub8_Sub4) this).anInt8374 * aHa_Sub2_8369.method898(anInt8359, 6407));
    }

    final void method2048(int i, int i_11_, int i_12_) {
        anInt8363++;
        if (i_12_ == -17846) {
            OpenGL.glFramebufferRenderbufferEXT(i, i_11_, 36161, anInt8361);
            anInt8367 = i;
            anInt8362 = i_11_;
        }
    }

    static {
        aString8364 = null;
        aClass128_8371 = new Class128(1, -1);
        anInt8377 = 0;
        aOutgoingOpcode_8376 = new OutgoingOpcode(51, 4);
    }
}
