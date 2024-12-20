/* Class248_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

final class Node_Sub1 extends Node {
    private s_Sub2 aS_Sub2_6798;
    private NativeHeapBuffer aNativeHeapBuffer6799;
    int anInt6800;
    static int anInt6801;
    private ha_Sub2 aHa_Sub2_6802;
    static int anInt6803;
    static int anInt6804;
    static int anInt6805;
    static int anInt6806;
    private Class140 aClass140_6807;
    int anInt6808;
    private Stream aStream6809;
    private Class349_Sub2 aClass349_Sub2_6810;
    int anInt6811;
    float aFloat6812;
    int anInt6813;
    private int[] anIntArray6814;
    static int anInt6815;
    static int anInt6816;
    static int anInt6817;
    static int anInt6818;
    static OutgoingOpcode aOutgoingOpcode_6819 = new OutgoingOpcode(85, -1);

    final void method1969(int i, int i_0_, int i_1_, boolean bool) {
        anInt6818++;
        anIntArray6814[i * ((s) aS_Sub2_6798).anInt3468 + i_1_] = Class358.retrieveLooksSettings((anIntArray6814[i * ((s) aS_Sub2_6798).anInt3468 + i_1_]), 1 << i_0_);
        if (bool != false)
            method1975(0, 49, 22, 0.35313132F, 80);
    }

    final void method1970(int i, int i_2_, int[] is) {
        anInt6803++;
        int i_3_ = 0;
        Node_Sub9_Sub1 class248_sub9_sub1 = ((ha_Sub2) aHa_Sub2_6802).aClass248_Sub9_Sub1_5845;
        if (i_2_ >= 125) {
            ((ByteStream) class248_sub9_sub1).offset = 0;
            if (((ha_Sub2) aHa_Sub2_6802).aBoolean5872) {
                for (int i_4_ = 0; i_4_ < i; i_4_++) {
                    int i_5_ = is[i_4_];
                    short[] is_6_ = ((s_Sub2) aS_Sub2_6798).aShortArrayArray7954[i_5_];
                    int i_7_ = anIntArray6814[i_5_];
                    if (i_7_ != 0 && is_6_ != null) {
                        int i_8_ = 0;
                        int i_9_ = 0;
                        while ((is_6_.length ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
                            if ((i_7_ & 1 << i_8_++) == 0)
                                i_9_ += 3;
                            else {
                                class248_sub9_sub1.writeShort(1182, 0xffff & is_6_[i_9_++]);
                                i_3_++;
                                class248_sub9_sub1.writeShort(1182, 0xffff & is_6_[i_9_++]);
                                i_3_++;
                                class248_sub9_sub1.writeShort(1182, is_6_[i_9_++] & 0xffff);
                                i_3_++;
                            }
                        }
                    }
                }
            } else {
                for (int i_10_ = 0; i_10_ < i; i_10_++) {
                    int i_11_ = is[i_10_];
                    int i_12_ = anIntArray6814[i_11_];
                    short[] is_13_ = ((s_Sub2) aS_Sub2_6798).aShortArrayArray7954[i_11_];
                    if ((i_12_ ^ 0xffffffff) != -1 && is_13_ != null) {
                        int i_14_ = 0;
                        int i_15_ = 0;
                        while ((i_15_ ^ 0xffffffff) > (is_13_.length ^ 0xffffffff)) {
                            if ((i_12_ & 1 << i_14_++) == 0)
                                i_15_ += 3;
                            else {
                                class248_sub9_sub1.writeLEShort_(is_13_[i_15_++] & 0xffff, 106);
                                i_3_++;
                                i_3_++;
                                class248_sub9_sub1.writeLEShort_((0xffff & (is_13_[i_15_++])), -125);
                                class248_sub9_sub1.writeLEShort_(0xffff & is_13_[i_15_++], 65);
                                i_3_++;
                            }
                        }
                    }
                }
            }
            if (i_3_ > 0) {
                aClass349_Sub2_6810.method7(((ByteStream) class248_sub9_sub1).offset, 20218, 5123, ((ByteStream) class248_sub9_sub1).buffer);
                aHa_Sub2_6802.method843(32886, ((s_Sub2) aS_Sub2_6798).aClass140_7969, ((s_Sub2) aS_Sub2_6798).aClass140_7977, ((s_Sub2) aS_Sub2_6798).aClass140_7968, aClass140_6807);
                aHa_Sub2_6802.method893(((0x8 & ((s_Sub2) aS_Sub2_6798).anInt7963) ^ 0xffffffff) != -1, 0, ((Node_Sub1) this).anInt6813, ((((s_Sub2) aS_Sub2_6798).anInt7963 & 0x7) ^ 0xffffffff) != -1);
                if (((ha_Sub2) aHa_Sub2_6802).aBoolean5914)
                    aHa_Sub2_6802.EA(2147483647, ((Node_Sub1) this).anInt6811, ((Node_Sub1) this).anInt6800, ((Node_Sub1) this).anInt6808);
                OpenGL.glMatrixMode(5890);
                OpenGL.glPushMatrix();
                OpenGL.glScalef(1.0F / ((Node_Sub1) this).aFloat6812, 1.0F / ((Node_Sub1) this).aFloat6812, 1.0F);
                OpenGL.glMatrixMode(5888);
                aHa_Sub2_6802.method843(32886, ((s_Sub2) aS_Sub2_6798).aClass140_7969, ((s_Sub2) aS_Sub2_6798).aClass140_7977, ((s_Sub2) aS_Sub2_6798).aClass140_7968, aClass140_6807);
                aHa_Sub2_6802.method897(aClass349_Sub2_6810, 0, (byte) -108, 4, i_3_);
                OpenGL.glMatrixMode(5890);
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
            }
        }
    }

    static final short[] method1971(byte i, short[] is) {
        anInt6804++;
        if (is == null)
            return null;
        short[] is_16_ = new short[is.length];
        Class159.method1404(is, 0, is_16_, 0, is.length);
        if (i != 64)
            method1971((byte) -68, null);
        return is_16_;
    }

    final void method1972(byte i, int i_17_) {
        anInt6801++;
        aStream6809.a();
        if (i < 103)
            method1971((byte) -107, null);
        Interface6 interface6 = aHa_Sub2_6802.method905(false, 4, -51, aNativeHeapBuffer6799, 4 * i_17_);
        aClass140_6807 = new Class140(interface6, 5121, 4, 0);
        aStream6809 = null;
        aNativeHeapBuffer6799 = null;
    }

    final void method1973(boolean bool, int i) {
        aNativeHeapBuffer6799 = ((ha_Sub2) aHa_Sub2_6802).aNativeHeap5799.a(4 * i, bool);
        anInt6805++;
        aStream6809 = new Stream(aNativeHeapBuffer6799);
    }

    static final void method1974(int i) {
        Class297_Sub1.aClass129_8483 = null;
        Class282_Sub25.aClass129_7852 = null;
        Class346_Sub2.aClass129_8259 = null;
        if (i != 5123)
            method1971((byte) 16, null);
        Node_Sub14_Sub12_Sub1.aClass129_10307 = null;
        Node_Sub14_Sub11.aClass129Array9254 = null;
        Class87.aClass129_1085 = null;
        Class316_Sub1_Sub2.aClass129_9857 = null;
        Class112.aClass129_5206 = null;
        Class282_Sub6.aClass129_7652 = null;
        anInt6816++;
    }

    final void method1975(int i, int i_18_, int i_19_, float f, int i_20_) {
        anInt6815++;
        if (((Node_Sub1) this).anInt6813 != -1) {
            Class312 class312 = ((ha) aHa_Sub2_6802).aD1414.method25(((Node_Sub1) this).anInt6813, (byte) 127);
            int i_21_ = 0xff & ((Class312) class312).aByte3630;
            if ((i_21_ ^ 0xffffffff) != -1 && (((Class312) class312).aByte3624 ^ 0xffffffff) != -5) {
                int i_22_;
                if (i_19_ >= 0) {
                    if ((i_19_ ^ 0xffffffff) >= -128)
                        i_22_ = i_19_ * 131586;
                    else
                        i_22_ = 16777215;
                } else
                    i_22_ = 0;
                if (i_21_ != 256) {
                    int i_23_ = i_21_;
                    int i_24_ = -i_21_ + 256;
                    i_20_ = (((0xff0000 & i_23_ * (i_22_ & 0xff00) - -((i_20_ & 0xff00) * i_24_)) + (~0xff00ff & (i_23_ * (i_22_ & 0xff00ff) - -(i_24_ * (0xff00ff & i_20_))))) >> 1542934824);
                } else
                    i_20_ = i_22_;
            }
            int i_25_ = ((Class312) class312).aByte3625 & 0xff;
            if (i_25_ != 0) {
                i_25_ += 256;
                int i_26_ = (i_20_ >> 580562928 & 0xff) * i_25_;
                if (i_26_ > 65535)
                    i_26_ = 65535;
                int i_27_ = ((0xff00 & i_20_) >> -942353624) * i_25_;
                if ((i_27_ ^ 0xffffffff) < -65536)
                    i_27_ = 65535;
                int i_28_ = i_25_ * (i_20_ & 0xff);
                if (i_28_ > 65535)
                    i_28_ = 65535;
                i_20_ = ((i_27_ & 0xff00) + (0xff00f4 & i_26_ << 1737388360) - -(i_28_ >> 1190232168));
            }
        }
        if (i_18_ <= 42)
            method1971((byte) -85, null);
        if (f != 1.0F) {
            int i_29_ = 0xff & i_20_ >> 1637231920;
            int i_30_ = (0xffa9 & i_20_) >> 1953752008;
            i_29_ *= f;
            int i_31_ = i_20_ & 0xff;
            i_30_ *= f;
            if (i_29_ >= 0) {
                if (i_29_ > 255)
                    i_29_ = 255;
            } else
                i_29_ = 0;
            i_31_ *= f;
            if ((i_30_ ^ 0xffffffff) <= -1) {
                if ((i_30_ ^ 0xffffffff) < -256)
                    i_30_ = 255;
            } else
                i_30_ = 0;
            if ((i_31_ ^ 0xffffffff) <= -1) {
                if ((i_31_ ^ 0xffffffff) < -256)
                    i_31_ = 255;
            } else
                i_31_ = 0;
            i_20_ = i_31_ | (i_29_ << 621528560 | i_30_ << -1821565912);
        }
        aStream6809.e(i * 4);
        aStream6809.f((byte) (i_20_ >> -1578096432));
        aStream6809.f((byte) (i_20_ >> -621259832));
        aStream6809.f((byte) i_20_);
    }

    public static void method1976(int i) {
        if (i != -9111)
            method1976(-24);
        aOutgoingOpcode_6819 = null;
    }

    final void method1977(int i, int i_32_) {
        aStream6809.e(i_32_ + 4 * i);
        anInt6817++;
        aStream6809.f(-1);
    }

    Node_Sub1(s_Sub2 var_s_Sub2, int i, int i_33_, int i_34_, int i_35_, int i_36_) {
        aS_Sub2_6798 = var_s_Sub2;
        ((Node_Sub1) this).anInt6808 = i_36_;
        aHa_Sub2_6802 = ((s_Sub2) aS_Sub2_6798).aHa_Sub2_7960;
        anIntArray6814 = new int[(((s) aS_Sub2_6798).anInt3472 * ((s) aS_Sub2_6798).anInt3468)];
        ((Node_Sub1) this).anInt6813 = i;
        ((Node_Sub1) this).anInt6811 = i_34_;
        ((Node_Sub1) this).anInt6800 = i_35_;
        ((Node_Sub1) this).aFloat6812 = (float) i_33_;
        aClass349_Sub2_6810 = new Class349_Sub2(aHa_Sub2_6802, 5123, null, 1);
    }
}
