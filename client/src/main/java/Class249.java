/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaggl.OpenGL;

abstract class Class249 {
    int anInt2804;
    static int anInt2805;
    static int anInt2806;
    static int anInt2807;
    private boolean aBoolean2808;
    static int anInt2809 = 1337;
    static int anInt2810;
    private int anInt2811;
    static int anInt2812;
    private int anInt2813;
    static int anInt2814;
    static int anInt2815;
    ha_Sub2 aHa_Sub2_2816;

    abstract void method2695(byte i);

    static final boolean method2696(byte i, int i_0_, int i_1_, int i_2_) {
        anInt2805++;
        if (!Class346.aBoolean4120 || !WorldAddress.aBoolean1189)
            return false;
        if (Class346_Sub7_Sub4_Sub2.anInt10163 < 100)
            return false;
        int i_3_ = Node_Sub14_Sub27.anIntArrayArrayArray9451[i_0_][i_1_][i_2_];
        if ((-za.anInt7490 ^ 0xffffffff) == (i_3_ ^ 0xffffffff))
            return false;
        if ((za.anInt7490 ^ 0xffffffff) == (i_3_ ^ 0xffffffff))
            return true;
        if (Node_Sub14_Sub12_Sub1.aSArray10306 == Class177.aSArray2070)
            return false;
        if (i >= -92)
            return true;
        int i_4_ = i_1_ << Class96.anInt1249;
        int i_5_ = i_2_ << Class96.anInt1249;
        if ((Class161.method1417(false, i_4_ + 1, -1 + i_4_ + Class241.anInt2692, Class177.aSArray2070[i_0_].method3145(i_1_, 86, i_2_), 1 + i_4_, Class177.aSArray2070[i_0_].method3145(i_1_, 49, 1 + i_2_), -1 + i_5_ + Class241.anInt2692, Class177.aSArray2070[i_0_].method3145(1 + i_1_, 101, i_2_ - -1), Class241.anInt2692 + i_5_ + -1, i_5_ + 1)) && Class161.method1417(false, i_4_ - -1, -1 + (i_4_ + Class241.anInt2692), Class177.aSArray2070[i_0_].method3145(i_1_, 79, i_2_), i_4_ + (Class241.anInt2692 + -1), Class177.aSArray2070[i_0_].method3145(i_1_ + 1, 76, i_2_ - -1), i_5_ - -Class241.anInt2692 - 1, Class177.aSArray2070[i_0_].method3145(i_1_ + 1, 45, i_2_), 1 + i_5_, 1 + i_5_)) {
            Class346_Sub5.anInt8278++;
            Node_Sub14_Sub27.anIntArrayArrayArray9451[i_0_][i_1_][i_2_] = za.anInt7490;
            return true;
        }
        Node_Sub14_Sub27.anIntArrayArrayArray9451[i_0_][i_1_][i_2_] = -za.anInt7490;
        return false;
    }

    protected final void finalize() throws Throwable {
        anInt2807++;
        ((Class249) this).aHa_Sub2_2816.method866(((Class249) this).anInt2804, -5, anInt2813);
        super.finalize();
    }

    final void method2697(int i, byte[] is, int i_6_) {
        if (i_6_ != 0)
            method2698(-0.676658F, -81, -115, 1.3576148F, 1.9671094F, -4, null, -69, -91, -0.8109105F, 126, -0.4044189F, null);
        method2695((byte) 74);
        anInt2810++;
        if ((anInt2813 ^ 0xffffffff) <= (i ^ 0xffffffff))
            OpenGL.glBufferSubDataARBub(anInt2811, 0, i, is, 0);
        else {
            OpenGL.glBufferDataARBub(anInt2811, i, is, 0, !aBoolean2808 ? 35044 : 35040);
            ((ha_Sub2) ((Class249) this).aHa_Sub2_2816).anInt5815 += i - anInt2813;
            anInt2813 = i;
        }
    }

    static final void method2698(float f, int i, int i_7_, float f_8_, float f_9_, int i_10_, Class44 class44, int i_11_, int i_12_, float f_13_, int i_14_, float f_15_, byte[] is) {
        for (int i_16_ = i_7_; (i_16_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_16_++) {
            Class333.method3413(i_14_, is, f_15_, i_10_, f, (byte) -67, f_8_, f_9_, f_13_, i_12_, i, i_16_, i_11_, class44);
            i_11_ += i_12_ * i_10_;
        }
        anInt2815++;
    }

    static final boolean method2699(byte i) {
        anInt2814++;
        boolean bool = true;
        if (Class352.aClass157_4181 == null) {
            if (!Class290.aClass381_3417.method3920(ha_Sub2.anInt5606, -101))
                bool = false;
            else
                Class352.aClass157_4181 = Class157.method1382(Class290.aClass381_3417, ha_Sub2.anInt5606);
        }
        if (Class317.aClass157_3668 == null) {
            if (Class290.aClass381_3417.method3920(Class278.anInt3234, -120))
                Class317.aClass157_3668 = Class157.method1382(Class290.aClass381_3417, Class278.anInt3234);
            else
                bool = false;
        }
        if (i != -54)
            return false;
        if (Class304.aClass157_3534 == null) {
            if (!Class290.aClass381_3417.method3920(Class361.anInt4455, -54))
                bool = false;
            else
                Class304.aClass157_3534 = Class157.method1382(Class290.aClass381_3417, Class361.anInt4455);
        }
        if (Class13.aClass285_260 == null) {
            if (Class168.aClass381_1972.method3920(Class136_Sub4_Sub1.anInt9970, 70))
                Class13.aClass285_260 = Class116_Sub1.method1102(Class168.aClass381_1972, 13580, Class136_Sub4_Sub1.anInt9970);
            else
                bool = false;
        }
        if (Class32.aClass157Array388 == null) {
            if (!Class290.aClass381_3417.method3920(Class136_Sub4_Sub1.anInt9970, -98))
                bool = false;
            else
                Class32.aClass157Array388 = Class157.method1391(Class290.aClass381_3417, Class136_Sub4_Sub1.anInt9970);
        }
        return bool;
    }

    Class249(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_17_, boolean bool) {
        aBoolean2808 = bool;
        anInt2813 = i_17_;
        ((Class249) this).aHa_Sub2_2816 = var_ha_Sub2;
        anInt2811 = i;
        OpenGL.glGenBuffersARB(1, Class68.anIntArray905, 0);
        ((Class249) this).anInt2804 = Class68.anIntArray905[0];
        method2695((byte) -113);
        OpenGL.glBufferDataARBub(i, anInt2813, is, 0, aBoolean2808 ? 35040 : 35044);
        ((ha_Sub2) ((Class249) this).aHa_Sub2_2816).anInt5815 += anInt2813;
    }

    Class249(ha_Sub2 var_ha_Sub2, int i, Buffer buffer, int i_18_, boolean bool) {
        ((Class249) this).aHa_Sub2_2816 = var_ha_Sub2;
        anInt2811 = i;
        aBoolean2808 = bool;
        anInt2813 = i_18_;
        OpenGL.glGenBuffersARB(1, Class68.anIntArray905, 0);
        ((Class249) this).anInt2804 = Class68.anIntArray905[0];
        method2695((byte) -112);
        OpenGL.glBufferDataARBa(i, anInt2813, buffer.getAddress(), !aBoolean2808 ? 35044 : 35040);
        ((ha_Sub2) ((Class249) this).aHa_Sub2_2816).anInt5815 += anInt2813;
    }
}
