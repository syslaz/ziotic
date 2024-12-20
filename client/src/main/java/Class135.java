/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class135 {
    static OutgoingOpcode aOutgoingOpcode_1632;
    static int anInt1633;
    static Class2[] aClass2Array1634;
    static short aShort1635 = 32767;

    static final void method1238(int i, int i_0_, int i_1_, int i_2_, byte i_3_, int[] is, int i_4_, int i_5_) {
        anInt1633++;
        if ((i ^ 0xffffffff) < -1 && !Class343.method3508(i, -31218))
            throw new IllegalArgumentException("");
        if ((i_1_ ^ 0xffffffff) < -1 && !Class343.method3508(i_1_, -31218))
            throw new IllegalArgumentException("");
        int i_6_ = -51 % ((i_3_ - -13) / 42);
        if ((i_4_ ^ 0xffffffff) != -32994)
            throw new IllegalArgumentException("");
        int i_7_ = 0;
        int i_8_ = i >= i_1_ ? i_1_ : i;
        int i_9_ = i >> -1852026271;
        int i_10_ = i_1_ >> 1776703937;
        int[] is_11_ = is;
        int[] is_12_ = new int[i_10_ * i_9_];
        for (; ; ) {
            OpenGL.glTexImage2Di(i_0_, i_7_, i_2_, i, i_1_, 0, i_4_, i_5_, is_11_, 0);
            if ((i_8_ ^ 0xffffffff) >= -2)
                break;
            int i_13_ = 0;
            int i_14_ = 0;
            int i_15_ = i_14_ - -i;
            int[] is_16_ = is_12_;
            for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_17_++) {
                for (int i_18_ = 0; (i_9_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
                    int i_19_ = is_11_[i_14_++];
                    int i_20_ = is_11_[i_15_++];
                    int i_21_ = is_11_[i_14_++];
                    int i_22_ = is_11_[i_15_++];
                    int i_23_ = i_19_ >> 1950539864 & 0xff;
                    int i_24_ = (i_19_ & 0xffae) >> 256682984;
                    int i_25_ = (i_19_ & 0xff08cd) >> -616911376;
                    int i_26_ = 0xff & i_19_;
                    i_23_ += 0xff & i_21_ >> -692444552;
                    i_26_ += i_21_ & 0xff;
                    i_24_ += (0xff32 & i_21_) >> -138754712;
                    i_25_ += 0xff & i_21_ >> -299513904;
                    i_24_ += (0xffa2 & i_20_) >> 328291176;
                    i_26_ += i_20_ & 0xff;
                    i_25_ += (0xff2d35 & i_20_) >> 1003617680;
                    i_23_ += i_20_ >> 1270396056 & 0xff;
                    i_25_ += 0xff & i_22_ >> 883845008;
                    i_23_ += 0xff & i_22_ >> 1085741112;
                    i_24_ += 0xff & i_22_ >> 578570632;
                    i_26_ += 0xff & i_22_;
                    is_12_[i_13_++] = (Class358.retrieveLooksSettings((Class358.retrieveLooksSettings(Class112.method794(i_24_ << 2049441094, 65280), (Class358.retrieveLooksSettings(Class112.method794(i_25_ << 725230030, 16711680), (Class112.method794(i_23_, 1020) << 444202582))))), Class112.method794(i_26_, 1020) >> 168249762));
                }
                i_14_ += i;
                i_15_ += i;
            }
            is_12_ = is_11_;
            i = i_9_;
            i_1_ = i_10_;
            is_11_ = is_16_;
            i_10_ >>= 1;
            i_7_++;
            i_8_ >>= 1;
            i_9_ >>= 1;
        }
    }

    public static void method1239(byte i) {
        if (i <= 4)
            method1238(-76, -110, 71, -4, (byte) -7, null, 78, -110);
        aClass2Array1634 = null;
        aOutgoingOpcode_1632 = null;
    }

    static {
        aOutgoingOpcode_1632 = new OutgoingOpcode(58, 4);
    }
}
