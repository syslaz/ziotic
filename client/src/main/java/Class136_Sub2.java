/* Class136_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class136_Sub2 extends Class136 {
    int anInt8385;
    static int anInt8386;
    static int anInt8387;
    private int anInt8388 = -1;
    static byte[][] aByteArrayArray8389 = new byte[1000][];
    static int anInt8390;
    static int anInt8391;
    int anInt8392;
    private int anInt8393 = -1;
    int anInt8394;
    static float aFloat8395;
    static int anInt8396;

    final void method1255(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt8387++;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glCopyTexSubImage3D(((Class136) this).anInt4770, 0, i_3_, i_0_, i_2_, i, i_5_, i_4_, i_6_);
        if (i_1_ > -20)
            method1256(-23, 85, -53);
        OpenGL.glFlush();
    }

    Class136_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_7_, int i_8_, int i_9_, byte[] is, int i_10_) {
        super(var_ha_Sub2, 32879, i, i_7_ * (i_8_ * i_9_), false);
        ((Class136_Sub2) this).anInt8394 = i_9_;
        ((Class136_Sub2) this).anInt8385 = i_7_;
        ((Class136_Sub2) this).anInt8392 = i_8_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, ((Class136_Sub2) this).anInt8385, ((Class136_Sub2) this).anInt8392, ((Class136_Sub2) this).anInt8394, 0, i_10_, 5121, is, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1246(false, true);
    }

    static final boolean method1256(int i, int i_11_, int i_12_) {
        if (i_11_ < 61)
            method1259(88);
        anInt8391++;
        if (!Class9.method191(i_12_, i, -17286))
            return false;
        if ((i & 0xb000) != 0 | Class246.method1961(i, 0, i_12_) | Class84_Sub6.method620(i, 0, i_12_))
            return true;
        return ((Class282_Sub11.method2962(84, i_12_, i) | Class74.method556(i_12_, true, i)) & (i_12_ & 0x37 ^ 0xffffffff) == -1);
    }

    public final void method18(byte i) {
        OpenGL.glFramebufferTexture3DEXT(anInt8388, anInt8393, ((Class136) this).anInt4770, 0, 0, 0);
        anInt8386++;
        if (i < 106)
            ((Class136_Sub2) this).anInt8392 = 110;
        anInt8388 = -1;
        anInt8393 = -1;
    }

    static final void method1257(int i, int i_13_) {
        int i_14_ = -75 / ((81 - i) / 37);
        anInt8396++;
        if (i_13_ != -1 && Class77.aBooleanArray988[i_13_]) {
            Class346_Sub2.aClass381_8257.method3909(-100, i_13_);
            Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_13_] = null;
            Node_Sub46.aClass354ArrayArray7379[i_13_] = null;
            Class77.aBooleanArray988[i_13_] = false;
        }
    }

    Class136_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_15_, int i_16_, int i_17_) {
        super(var_ha_Sub2, 32879, i, i_16_ * i_15_ * i_17_, false);
        ((Class136_Sub2) this).anInt8392 = i_16_;
        ((Class136_Sub2) this).anInt8394 = i_17_;
        ((Class136_Sub2) this).anInt8385 = i_15_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glTexImage3Dub(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, ((Class136_Sub2) this).anInt8385, ((Class136_Sub2) this).anInt8392, ((Class136_Sub2) this).anInt8394, 0, Class160.method1409(((Class136) this).anInt4785, 47), 5121, null, 0);
        this.method1246(false, true);
    }

    public static void method1258(int i) {
        aByteArrayArray8389 = null;
        if (i != 3520)
            aFloat8395 = -0.8464747F;
    }

    static final Class186[] method1259(int i) {
        anInt8390++;
        if (i != -1)
            aByteArrayArray8389 = null;
        return new Class186[]{Class282_Sub12.aClass186_7712, Node_Sub14_Sub9.aClass186_9241, Class256.aClass186_2933};
    }
}
