/* Class248_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class Node_Sub21 extends Node {
    int anInt7050;
    static int anInt7051;
    static int anInt7052;
    static int anInt7053;
    static int anInt7054;
    int anInt7055 = 0;
    private ha_Sub3 aHa_Sub3_7056;
    private NativeHeapBuffer aNativeHeapBuffer7057;
    static int anInt7058;
    private Stream aStream7059;
    static int anInt7060;
    int anInt7061;
    private int[] anIntArray7062;
    private Interface18_Impl1 anInterface18_Impl1_7063;
    float aFloat7064;
    static int anInt7065;
    static int anInt7066;
    static int anInt7067;
    int anInt7068;
    private s_Sub3 aS_Sub3_7069;
    int anInt7070;

    final void method2526(int i, int i_0_, int i_1_, int i_2_) {
        anIntArray7062[((s) aS_Sub3_7069).anInt3468 * i_0_ + i] = Class358.retrieveLooksSettings((anIntArray7062[((s) aS_Sub3_7069).anInt3468 * i_0_ + i]), 1 << i_2_);
        anInt7052++;
        ((Node_Sub21) this).anInt7055++;
        if (i_1_ != 14278)
            method2533(127, 34);
    }

    static final void method2527(int i) {
        Class161.aClass248_Sub15_Sub1_1895.method2420(2064);
        anInt7053++;
        NPC.aClass381_10591 = null;
        Class341.aClass248_Sub15_Sub1_3980 = null;
        Class332.anInt3883 = i;
    }

    static final void method2528(byte i) {
        if (i != 102)
            method2527(56);
        anInt7065++;
        Class340_Sub5.aBoolean8140 = true;
    }

    final void method2529(int i, byte i_3_, int[] is) {
        anInt7066++;
        Interface18_Impl2 interface18_impl2 = aHa_Sub3_7056.method961((byte) 127, 3 * ((Node_Sub21) this).anInt7055);
        Buffer buffer = interface18_impl2.method47(i_3_ + 30899, true);
        if (buffer != null) {
            Stream stream = aHa_Sub3_7056.method926((byte) -20, buffer);
            int i_4_ = 0;
            int i_5_ = 32767;
            if (i_3_ != 8)
                method2529(13, (byte) -15, null);
            int i_6_ = -32768;
            if (!Stream.b()) {
                for (int i_7_ = 0; i > i_7_; i_7_++) {
                    int i_8_ = is[i_7_];
                    short[] is_9_ = ((s_Sub3) aS_Sub3_7069).aShortArrayArray7990[i_8_];
                    int i_10_ = anIntArray7062[i_8_];
                    if (i_10_ != 0 && is_9_ != null) {
                        int i_11_ = 0;
                        int i_12_ = 0;
                        while ((is_9_.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff)) {
                            if ((i_10_ & 1 << i_11_++ ^ 0xffffffff) == -1)
                                i_12_ += 3;
                            else {
                                for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -4; i_13_++) {
                                    int i_14_ = 0xffff & is_9_[i_12_++];
                                    stream.d(i_14_);
                                    if (i_14_ < i_5_)
                                        i_5_ = i_14_;
                                    if (i_6_ < i_14_)
                                        i_6_ = i_14_;
                                }
                                i_4_++;
                            }
                        }
                    }
                }
            } else {
                for (int i_15_ = 0; (i ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
                    int i_16_ = is[i_15_];
                    int i_17_ = anIntArray7062[i_16_];
                    short[] is_18_ = ((s_Sub3) aS_Sub3_7069).aShortArrayArray7990[i_16_];
                    if ((i_17_ ^ 0xffffffff) != -1 && is_18_ != null) {
                        int i_19_ = 0;
                        int i_20_ = 0;
                        while ((i_20_ ^ 0xffffffff) > (is_18_.length ^ 0xffffffff)) {
                            if ((i_17_ & 1 << i_19_++ ^ 0xffffffff) != -1) {
                                i_4_++;
                                for (int i_21_ = 0; i_21_ < 3; i_21_++) {
                                    int i_22_ = 0xffff & is_18_[i_20_++];
                                    if (i_22_ > i_6_)
                                        i_6_ = i_22_;
                                    stream.b(i_22_);
                                    if (i_5_ > i_22_)
                                        i_5_ = i_22_;
                                }
                            } else
                                i_20_ += 3;
                        }
                    }
                }
            }
            stream.a();
            if (interface18_impl2.method50(-17694) && i_4_ > 0) {
                aHa_Sub3_7056.method962(((Node_Sub21) this).anInt7061, 42, (0x8 & ((s_Sub3) aS_Sub3_7069).anInt8016) != 0, (0x7 & ((s_Sub3) aS_Sub3_7069).anInt8016) != 0);
                if (((ha_Sub3) aHa_Sub3_7056).aBoolean6181)
                    aHa_Sub3_7056.EA(2147483647, ((Node_Sub21) this).anInt7070, ((Node_Sub21) this).anInt7050, ((Node_Sub21) this).anInt7068);
                Class238_Sub2 class238_sub2 = aHa_Sub3_7056.method1022(0);
                class238_sub2.method1898(1.0F / (((Node_Sub21) this).aFloat7064), 1.0F / (((Node_Sub21) this).aFloat7064), 1.0F, (byte) -49);
                aHa_Sub3_7056.method984(i_3_ ^ 0xb, Node_Sub14_Sub16.aClass34_9338);
                aHa_Sub3_7056.method931(1, 8, anInterface18_Impl1_7063);
                aHa_Sub3_7056.method1004((((s_Sub3) aS_Sub3_7069).aClass185_8019), (byte) -15);
                aHa_Sub3_7056.method1006(interface18_impl2, OutputStream_Sub1.aClass14_86, i_4_, 0, -i_5_ + i_6_ - -1, i_5_, -229);
                aHa_Sub3_7056.method925(i_3_ + -114);
            }
        }
    }

    final void method2530(int i, int i_23_, float f, int i_24_, byte i_25_) {
        if (((Node_Sub21) this).anInt7061 != -1) {
            Class312 class312 = ((ha) aHa_Sub3_7056).aD1414.method25(((Node_Sub21) this).anInt7061, (byte) 126);
            int i_26_ = ((Class312) class312).aByte3630 & 0xff;
            if ((i_26_ ^ 0xffffffff) != -1 && (((Class312) class312).aByte3624 ^ 0xffffffff) != -5) {
                int i_27_;
                if ((i_23_ ^ 0xffffffff) > -1)
                    i_27_ = 0;
                else if ((i_23_ ^ 0xffffffff) < -128)
                    i_27_ = 16777215;
                else
                    i_27_ = i_23_ * 131586;
                if (i_26_ != 256) {
                    int i_28_ = i_26_;
                    int i_29_ = -i_26_ + 256;
                    i_24_ = ((0xff0000 & i_28_ * (i_27_ & 0xff00) + i_29_ * (0xff00 & i_24_)) + (i_28_ * (i_27_ & 0xff00ff) - -((i_24_ & 0xff00ff) * i_29_) & ~0xff00ff)) >> -801772888;
                } else
                    i_24_ = i_27_;
            }
            int i_30_ = 0xff & ((Class312) class312).aByte3625;
            if (i_30_ != 0) {
                i_30_ += 256;
                int i_31_ = i_30_ * ((i_24_ & 0xff0000) >> -1227968592);
                if (i_31_ > 65535)
                    i_31_ = 65535;
                int i_32_ = i_30_ * (0xff & i_24_ >> -968551672);
                if ((i_32_ ^ 0xffffffff) < -65536)
                    i_32_ = 65535;
                int i_33_ = (i_24_ & 0xff) * i_30_;
                if ((i_33_ ^ 0xffffffff) < -65536)
                    i_33_ = 65535;
                i_24_ = ((i_31_ << 614795336 & 0xff004a) + ((i_32_ & 0xff00) + (i_33_ >> 138360552)));
            }
        }
        anInt7060++;
        if (f != 1.0F) {
            int i_34_ = (0xff11d6 & i_24_) >> 2115006224;
            int i_35_ = (0xff48 & i_24_) >> 1344347112;
            i_34_ *= f;
            int i_36_ = 0xff & i_24_;
            if ((i_34_ ^ 0xffffffff) > -1)
                i_34_ = 0;
            else if (i_34_ > 255)
                i_34_ = 255;
            i_35_ *= f;
            if ((i_35_ ^ 0xffffffff) > -1)
                i_35_ = 0;
            else if ((i_35_ ^ 0xffffffff) < -256)
                i_35_ = 255;
            i_36_ *= f;
            if ((i_36_ ^ 0xffffffff) <= -1) {
                if (i_36_ > 255)
                    i_36_ = 255;
            } else
                i_36_ = 0;
            i_24_ = i_35_ << 1765230088 | i_34_ << 574643152 | i_36_;
        }
        if (i_25_ != -126)
            ((Node_Sub21) this).anInt7055 = 72;
        aStream7059.e(i * 4);
        if (((ha_Sub3) aHa_Sub3_7056).anInt6251 != 0) {
            aStream7059.f((byte) (i_24_ >> 1379037776));
            aStream7059.f((byte) (i_24_ >> 998958760));
            aStream7059.f((byte) i_24_);
        } else {
            aStream7059.f((byte) i_24_);
            aStream7059.f((byte) (i_24_ >> 507525352));
            aStream7059.f((byte) (i_24_ >> -283155376));
        }
    }

    final void method2531(int i, byte i_37_) {
        anInt7058++;
        aNativeHeapBuffer7057 = aHa_Sub3_7056.method935(4 * i, true, (byte) -35);
        if (i_37_ != 16)
            anInt7054 = -71;
        aStream7059 = new Stream(aNativeHeapBuffer7057, 0, i * 4);
    }

    final void method2532(int i, int i_38_) {
        aStream7059.e(3 + 4 * i);
        anInt7067++;
        if (i_38_ != -19730)
            method2530(-9, -99, 0.21643426F, -50, (byte) -127);
        aStream7059.f(-1);
    }

    final void method2533(int i, int i_39_) {
        anInt7051++;
        aStream7059.a();
        anInterface18_Impl1_7063 = aHa_Sub3_7056.method1010(44, false);
        anInterface18_Impl1_7063.method5(i * i_39_, aNativeHeapBuffer7057, 24689, 4);
        aNativeHeapBuffer7057 = null;
        aStream7059 = null;
    }

    Node_Sub21(s_Sub3 var_s_Sub3, int i, int i_40_, int i_41_, int i_42_, int i_43_) {
        aS_Sub3_7069 = var_s_Sub3;
        anIntArray7062 = new int[(((s) aS_Sub3_7069).anInt3472 * ((s) aS_Sub3_7069).anInt3468)];
        ((Node_Sub21) this).anInt7068 = i_43_;
        ((Node_Sub21) this).aFloat7064 = (float) i_40_;
        ((Node_Sub21) this).anInt7050 = i_42_;
        ((Node_Sub21) this).anInt7061 = i;
        aHa_Sub3_7056 = ((s_Sub3) aS_Sub3_7069).aHa_Sub3_7983;
        ((Node_Sub21) this).anInt7070 = i_41_;
    }
}
