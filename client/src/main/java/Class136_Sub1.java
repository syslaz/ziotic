/* Class136_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class136_Sub1 extends Class136 {
    static int anInt8379;
    static int anInt8380;
    static OutgoingOpcode aOutgoingOpcode_8381 = new OutgoingOpcode(53, 4);
    static int anInt8382;
    static int anInt8383;
    private int anInt8384;

    static long method1251(long l, long l_0_) {
        return l | l_0_;
    }

    final void method1252(int i, boolean bool) {
        ((Class136) this).aHa_Sub2_4779.method889(i + 11981, this);
        anInt8382++;
        if (i != -11983)
            method18((byte) 95);
        OpenGL.glTexParameteri(((Class136) this).anInt4770, 10242, bool ? 10497 : 33071);
    }

    public final void method18(byte i) {
        anInt8379++;
        if (i <= 106)
            aOutgoingOpcode_8381 = null;
    }

    static final int method1253(int i, byte[] is, int[] is_1_, byte i_2_, int i_3_, byte[][] is_4_, byte[][] is_5_, int[] is_6_) {
        anInt8380++;
        int i_7_ = is_1_[i_3_];
        int i_8_ = is_6_[i_3_] + i_7_;
        int i_9_ = is_1_[i];
        int i_10_ = i_9_ + is_6_[i];
        int i_11_ = i_7_;
        if ((i_9_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
            i_11_ = i_9_;
        int i_12_ = i_8_;
        if ((i_10_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff))
            i_12_ = i_10_;
        int i_13_ = is[i_3_] & 0xff;
        int i_14_ = 118 / ((i_2_ - -60) / 44);
        if ((0xff & is[i] ^ 0xffffffff) > (i_13_ ^ 0xffffffff))
            i_13_ = 0xff & is[i];
        byte[] is_15_ = is_5_[i_3_];
        byte[] is_16_ = is_4_[i];
        int i_17_ = i_11_ + -i_7_;
        int i_18_ = i_11_ + -i_9_;
        for (int i_19_ = i_11_; (i_12_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
            int i_20_ = is_15_[i_17_++] - -is_16_[i_18_++];
            if ((i_20_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff))
                i_13_ = i_20_;
        }
        return -i_13_;
    }

    public static void method1254(boolean bool) {
        aOutgoingOpcode_8381 = null;
        if (bool != false)
            anInt8383 = -114;
    }

    Class136_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_21_, byte[] is, int i_22_) {
        super(var_ha_Sub2, 3552, i, i_21_, false);
        anInt8384 = i_21_;
        ((Class136) this).aHa_Sub2_4779.method889(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(((Class136) this).anInt4770, 0, ((Class136) this).anInt4785, anInt8384, 0, i_22_, 5121, is, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1246(false, true);
    }
}
