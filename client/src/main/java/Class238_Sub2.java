/* Class238_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class238_Sub2 extends Viewport {
    static int anInt6704;
    static int anInt6705;
    float aFloat6706;
    static int anInt6707;
    static int anInt6708;
    static int anInt6709;
    static int anInt6710;
    float aFloat6711;
    static int anInt6712;
    float aFloat6713;
    static int anInt6714;
    float aFloat6715;
    static int anInt6716;
    static int anInt6717;
    static int anInt6718;
    static int anInt6719;
    static int anInt6720;
    static int anInt6721;
    static int anInt6722;
    static int anInt6723;
    float aFloat6724;
    static int anInt6725;
    float aFloat6726;
    static int anInt6727;
    float aFloat6728;
    static int anInt6729;
    static int anInt6730;
    static int anInt6731;
    static Class209 aClass209_6732;
    float aFloat6733;
    static int anInt6734;
    static int anInt6735;
    static int anInt6736;
    float aFloat6737;
    static int anInt6738;
    static int anInt6739;
    static int anInt6740;
    static int anInt6741;
    static int anInt6742;
    static int anInt6743;
    float aFloat6744;
    static int anInt6745;
    static int anInt6746;
    static int anInt6747;
    static int anInt6748;
    static int anInt6749;
    float aFloat6750;
    static int anInt6751;
    static int anInt6752;
    static int anInt6753;
    float aFloat6754;
    static int anInt6755;
    static int anInt6756;
    static int anInt6757;
    static int anInt6758;

    final void method1866() {
        ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6724 = ((Class238_Sub2) this).aFloat6733 = ((Class238_Sub2) this).aFloat6715 = ((Class238_Sub2) this).aFloat6706 = 0.0F;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) this).aFloat6754 = 1.0F;
        anInt6736++;
    }

    final float[] method1877(float[] fs, int i) {
        fs[0] = ((Class238_Sub2) this).aFloat6711;
        fs[3] = 0.0F;
        anInt6710++;
        fs[7] = 0.0F;
        fs[13] = 0.0F;
        fs[1] = ((Class238_Sub2) this).aFloat6750;
        fs[6] = ((Class238_Sub2) this).aFloat6724;
        fs[14] = 0.0F;
        fs[12] = 0.0F;
        fs[11] = 0.0F;
        fs[2] = ((Class238_Sub2) this).aFloat6726;
        fs[8] = ((Class238_Sub2) this).aFloat6728;
        fs[9] = ((Class238_Sub2) this).aFloat6744;
        if (i != 26071)
            method1897(null, -0.85678566F, true, 1.5594711F, -1.9169495F, -2.0669634F);
        fs[15] = 0.0F;
        fs[10] = ((Class238_Sub2) this).aFloat6754;
        fs[4] = ((Class238_Sub2) this).aFloat6713;
        fs[5] = ((Class238_Sub2) this).aFloat6737;
        return fs;
    }

    final void method1872(int i) {
        anInt6753++;
        float f = Class86_Sub1.aFloatArray5512[i & 0x3fff];
        float f_0_ = Class86_Sub1.aFloatArray5514[0x3fff & i];
        float f_1_ = ((Class238_Sub2) this).aFloat6711;
        float f_2_ = ((Class238_Sub2) this).aFloat6750;
        float f_3_ = ((Class238_Sub2) this).aFloat6726;
        float f_4_ = ((Class238_Sub2) this).aFloat6733;
        ((Class238_Sub2) this).aFloat6711 = -(f_0_ * ((Class238_Sub2) this).aFloat6713) + f * f_1_;
        ((Class238_Sub2) this).aFloat6750 = f_2_ * f - f_0_ * ((Class238_Sub2) this).aFloat6737;
        ((Class238_Sub2) this).aFloat6713 = f_1_ * f_0_ + ((Class238_Sub2) this).aFloat6713 * f;
        ((Class238_Sub2) this).aFloat6726 = -(f_0_ * ((Class238_Sub2) this).aFloat6724) + f * f_3_;
        ((Class238_Sub2) this).aFloat6737 = f_2_ * f_0_ + ((Class238_Sub2) this).aFloat6737 * f;
        ((Class238_Sub2) this).aFloat6724 = f_3_ * f_0_ + f * ((Class238_Sub2) this).aFloat6724;
        ((Class238_Sub2) this).aFloat6733 = f_4_ * f - ((Class238_Sub2) this).aFloat6715 * f_0_;
        ((Class238_Sub2) this).aFloat6715 = f_0_ * f_4_ + f * ((Class238_Sub2) this).aFloat6715;
    }

    final float method1878(float f, boolean bool, float f_5_, float f_6_) {
        anInt6721++;
        if (bool != false)
            ((Class238_Sub2) this).aFloat6744 = 0.49704242F;
        return (((Class238_Sub2) this).aFloat6713 * f + f_5_ * ((Class238_Sub2) this).aFloat6737 + ((Class238_Sub2) this).aFloat6724 * f_6_ + ((Class238_Sub2) this).aFloat6715);
    }

    final void method1870(int i, int i_7_, int i_8_, int[] is) {
        is[1] = (int) ((float) i_8_ * ((Class238_Sub2) this).aFloat6724 + ((float) i_7_ * ((Class238_Sub2) this).aFloat6737 + ((Class238_Sub2) this).aFloat6713 * (float) i));
        is[0] = (int) (((Class238_Sub2) this).aFloat6726 * (float) i_8_ + ((float) i_7_ * ((Class238_Sub2) this).aFloat6750 + ((Class238_Sub2) this).aFloat6711 * (float) i));
        anInt6752++;
        is[2] = (int) ((float) i_8_ * ((Class238_Sub2) this).aFloat6754 + ((float) i_7_ * ((Class238_Sub2) this).aFloat6744 + ((Class238_Sub2) this).aFloat6728 * (float) i));
    }

    final void method1879(byte i, float f, float f_9_, float f_10_) {
        ((Class238_Sub2) this).aFloat6706 = f;
        ((Class238_Sub2) this).aFloat6733 = f_9_;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) this).aFloat6754 = 1.0F;
        anInt6758++;
        ((Class238_Sub2) this).aFloat6715 = f_10_;
        ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6724 = 0.0F;
        if (i <= 81)
            ((Class238_Sub2) this).aFloat6737 = -0.8864541F;
    }

    final Viewport method1863() {
        anInt6716++;
        Class238_Sub2 class238_sub2_11_ = new Class238_Sub2();
        ((Class238_Sub2) class238_sub2_11_).aFloat6744 = ((Class238_Sub2) this).aFloat6744;
        ((Class238_Sub2) class238_sub2_11_).aFloat6733 = ((Class238_Sub2) this).aFloat6733;
        ((Class238_Sub2) class238_sub2_11_).aFloat6711 = ((Class238_Sub2) this).aFloat6711;
        ((Class238_Sub2) class238_sub2_11_).aFloat6728 = ((Class238_Sub2) this).aFloat6728;
        ((Class238_Sub2) class238_sub2_11_).aFloat6726 = ((Class238_Sub2) this).aFloat6726;
        ((Class238_Sub2) class238_sub2_11_).aFloat6737 = ((Class238_Sub2) this).aFloat6737;
        ((Class238_Sub2) class238_sub2_11_).aFloat6750 = ((Class238_Sub2) this).aFloat6750;
        ((Class238_Sub2) class238_sub2_11_).aFloat6715 = ((Class238_Sub2) this).aFloat6715;
        ((Class238_Sub2) class238_sub2_11_).aFloat6754 = ((Class238_Sub2) this).aFloat6754;
        ((Class238_Sub2) class238_sub2_11_).aFloat6706 = ((Class238_Sub2) this).aFloat6706;
        ((Class238_Sub2) class238_sub2_11_).aFloat6724 = ((Class238_Sub2) this).aFloat6724;
        ((Class238_Sub2) class238_sub2_11_).aFloat6713 = ((Class238_Sub2) this).aFloat6713;
        return class238_sub2_11_;
    }

    final void method1880(float f, byte i, float f_12_, float f_13_) {
        ((Class238_Sub2) this).aFloat6744 *= f_13_;
        ((Class238_Sub2) this).aFloat6728 *= f_13_;
        ((Class238_Sub2) this).aFloat6715 *= f_12_;
        ((Class238_Sub2) this).aFloat6754 *= f_13_;
        anInt6708++;
        ((Class238_Sub2) this).aFloat6724 *= f_12_;
        ((Class238_Sub2) this).aFloat6726 *= f;
        ((Class238_Sub2) this).aFloat6737 *= f_12_;
        ((Class238_Sub2) this).aFloat6706 *= f_13_;
        if (i <= -101) {
            ((Class238_Sub2) this).aFloat6750 *= f;
            ((Class238_Sub2) this).aFloat6713 *= f_12_;
            ((Class238_Sub2) this).aFloat6711 *= f;
            ((Class238_Sub2) this).aFloat6733 *= f;
        }
    }

    final void method1862(int i, int i_14_, int i_15_) {
        ((Class238_Sub2) this).aFloat6706 += (float) i_15_;
        anInt6748++;
        ((Class238_Sub2) this).aFloat6733 += (float) i;
        ((Class238_Sub2) this).aFloat6715 += (float) i_14_;
    }

    final void method1861(int i) {
        anInt6745++;
        ((Class238_Sub2) this).aFloat6711 = 1.0F;
        ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) this).aFloat6754 = Class86_Sub1.aFloatArray5512[i & 0x3fff];
        ((Class238_Sub2) this).aFloat6744 = Class86_Sub1.aFloatArray5514[i & 0x3fff];
        ((Class238_Sub2) this).aFloat6724 = -((Class238_Sub2) this).aFloat6744;
        ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6733 = ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) this).aFloat6715 = ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6706 = 0.0F;
    }

    public static void method1881(int i) {
        aClass209_6732 = null;
        int i_16_ = 36 / ((27 - i) / 37);
    }

    final float[] method1882(boolean bool, float[] fs) {
        fs[0] = ((Class238_Sub2) this).aFloat6711;
        fs[6] = ((Class238_Sub2) this).aFloat6724;
        fs[4] = ((Class238_Sub2) this).aFloat6713;
        anInt6746++;
        fs[3] = ((Class238_Sub2) this).aFloat6733;
        fs[7] = ((Class238_Sub2) this).aFloat6715;
        fs[1] = ((Class238_Sub2) this).aFloat6750;
        fs[5] = ((Class238_Sub2) this).aFloat6737;
        if (bool != false)
            method1877(null, -38);
        fs[2] = ((Class238_Sub2) this).aFloat6726;
        return fs;
    }

    final void method1864(int i) {
        anInt6755++;
        ((Class238_Sub2) this).aFloat6754 = 1.0F;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) this).aFloat6737 = Class86_Sub1.aFloatArray5512[0x3fff & i];
        ((Class238_Sub2) this).aFloat6713 = Class86_Sub1.aFloatArray5514[0x3fff & i];
        ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6733 = ((Class238_Sub2) this).aFloat6724 = ((Class238_Sub2) this).aFloat6715 = ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6706 = 0.0F;
        ((Class238_Sub2) this).aFloat6750 = -((Class238_Sub2) this).aFloat6713;
    }

    final void method1883(Viewport viewport, byte i) {
        anInt6705++;
        Class238_Sub2 class238_sub2_17_ = (Class238_Sub2) viewport;
        float f = ((Class238_Sub2) this).aFloat6711;
        float f_18_ = ((Class238_Sub2) this).aFloat6713;
        float f_19_ = ((Class238_Sub2) this).aFloat6750;
        float f_20_ = ((Class238_Sub2) this).aFloat6737;
        float f_21_ = ((Class238_Sub2) this).aFloat6726;
        float f_22_ = ((Class238_Sub2) this).aFloat6724;
        float f_23_ = ((Class238_Sub2) this).aFloat6733;
        int i_24_ = 92 % ((i - 43) / 45);
        float f_25_ = ((Class238_Sub2) this).aFloat6715;
        ((Class238_Sub2) this).aFloat6711 = ((((Class238_Sub2) class238_sub2_17_).aFloat6726 * ((Class238_Sub2) this).aFloat6728) + (f_18_ * ((Class238_Sub2) class238_sub2_17_).aFloat6750 + ((Class238_Sub2) class238_sub2_17_).aFloat6711 * f));
        ((Class238_Sub2) this).aFloat6713 = ((((Class238_Sub2) this).aFloat6728 * ((Class238_Sub2) class238_sub2_17_).aFloat6724) + (((Class238_Sub2) class238_sub2_17_).aFloat6737 * f_18_ + f * ((Class238_Sub2) class238_sub2_17_).aFloat6713));
        ((Class238_Sub2) this).aFloat6728 = (f_18_ * ((Class238_Sub2) class238_sub2_17_).aFloat6744 + ((Class238_Sub2) class238_sub2_17_).aFloat6728 * f + (((Class238_Sub2) this).aFloat6728 * ((Class238_Sub2) class238_sub2_17_).aFloat6754));
        ((Class238_Sub2) this).aFloat6750 = ((((Class238_Sub2) this).aFloat6744 * ((Class238_Sub2) class238_sub2_17_).aFloat6726) + (((Class238_Sub2) class238_sub2_17_).aFloat6750 * f_20_ + ((Class238_Sub2) class238_sub2_17_).aFloat6711 * f_19_));
        ((Class238_Sub2) this).aFloat6737 = (((Class238_Sub2) class238_sub2_17_).aFloat6713 * f_19_ + ((Class238_Sub2) class238_sub2_17_).aFloat6737 * f_20_ + (((Class238_Sub2) this).aFloat6744 * ((Class238_Sub2) class238_sub2_17_).aFloat6724));
        ((Class238_Sub2) this).aFloat6726 = (((Class238_Sub2) class238_sub2_17_).aFloat6711 * f_21_ + ((Class238_Sub2) class238_sub2_17_).aFloat6750 * f_22_ + (((Class238_Sub2) this).aFloat6754 * ((Class238_Sub2) class238_sub2_17_).aFloat6726));
        ((Class238_Sub2) this).aFloat6724 = (((Class238_Sub2) class238_sub2_17_).aFloat6713 * f_21_ + f_22_ * ((Class238_Sub2) class238_sub2_17_).aFloat6737 + (((Class238_Sub2) class238_sub2_17_).aFloat6724 * ((Class238_Sub2) this).aFloat6754));
        ((Class238_Sub2) this).aFloat6744 = ((((Class238_Sub2) this).aFloat6744 * ((Class238_Sub2) class238_sub2_17_).aFloat6754) + (f_20_ * ((Class238_Sub2) class238_sub2_17_).aFloat6744 + f_19_ * ((Class238_Sub2) class238_sub2_17_).aFloat6728));
        ((Class238_Sub2) this).aFloat6733 = (((Class238_Sub2) class238_sub2_17_).aFloat6750 * f_25_ + f_23_ * ((Class238_Sub2) class238_sub2_17_).aFloat6711 + (((Class238_Sub2) this).aFloat6706 * ((Class238_Sub2) class238_sub2_17_).aFloat6726) + ((Class238_Sub2) class238_sub2_17_).aFloat6733);
        ((Class238_Sub2) this).aFloat6754 = ((((Class238_Sub2) class238_sub2_17_).aFloat6754 * ((Class238_Sub2) this).aFloat6754) + (f_21_ * ((Class238_Sub2) class238_sub2_17_).aFloat6728 + f_22_ * ((Class238_Sub2) class238_sub2_17_).aFloat6744));
        ((Class238_Sub2) this).aFloat6715 = (((Class238_Sub2) class238_sub2_17_).aFloat6715 + ((((Class238_Sub2) this).aFloat6706 * ((Class238_Sub2) class238_sub2_17_).aFloat6724) + (f_23_ * ((Class238_Sub2) class238_sub2_17_).aFloat6713 + (((Class238_Sub2) class238_sub2_17_).aFloat6737 * f_25_))));
        ((Class238_Sub2) this).aFloat6706 = ((((Class238_Sub2) this).aFloat6706 * ((Class238_Sub2) class238_sub2_17_).aFloat6754) + (f_23_ * ((Class238_Sub2) class238_sub2_17_).aFloat6728 + f_25_ * ((Class238_Sub2) class238_sub2_17_).aFloat6744) + ((Class238_Sub2) class238_sub2_17_).aFloat6706);
    }

    final void method1868(Viewport viewport) {
        anInt6743++;
        Class238_Sub2 class238_sub2_26_ = (Class238_Sub2) viewport;
        ((Class238_Sub2) this).aFloat6706 = ((Class238_Sub2) class238_sub2_26_).aFloat6706;
        ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) class238_sub2_26_).aFloat6750;
        ((Class238_Sub2) this).aFloat6715 = ((Class238_Sub2) class238_sub2_26_).aFloat6715;
        ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) class238_sub2_26_).aFloat6713;
        ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) class238_sub2_26_).aFloat6728;
        ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) class238_sub2_26_).aFloat6744;
        ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) class238_sub2_26_).aFloat6726;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) class238_sub2_26_).aFloat6711;
        ((Class238_Sub2) this).aFloat6733 = ((Class238_Sub2) class238_sub2_26_).aFloat6733;
        ((Class238_Sub2) this).aFloat6754 = ((Class238_Sub2) class238_sub2_26_).aFloat6754;
        ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) class238_sub2_26_).aFloat6737;
        ((Class238_Sub2) this).aFloat6724 = ((Class238_Sub2) class238_sub2_26_).aFloat6724;
    }

    final float method1884(byte i, float f, float f_27_, float f_28_) {
        anInt6730++;
        if (i > -29)
            ((Class238_Sub2) this).aFloat6706 = 0.2872984F;
        return (((Class238_Sub2) this).aFloat6706 + (((Class238_Sub2) this).aFloat6728 * f + f_27_ * ((Class238_Sub2) this).aFloat6744 + f_28_ * ((Class238_Sub2) this).aFloat6754));
    }

    final void method1885(float f, float f_29_, float f_30_, int i) {
        anInt6747++;
        ((Class238_Sub2) this).aFloat6715 += f_30_;
        ((Class238_Sub2) this).aFloat6706 += f_29_;
        if (i == 13)
            ((Class238_Sub2) this).aFloat6733 += f;
    }

    final void method1886(byte i, Viewport viewport) {
        anInt6707++;
        Class238_Sub2 class238_sub2_31_ = (Class238_Sub2) viewport;
        ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) class238_sub2_31_).aFloat6750;
        ((Class238_Sub2) this).aFloat6733 = 0.0F;
        if (i <= 32)
            method1889(-70);
        ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) class238_sub2_31_).aFloat6726;
        ((Class238_Sub2) this).aFloat6754 = ((Class238_Sub2) class238_sub2_31_).aFloat6754;
        ((Class238_Sub2) this).aFloat6724 = ((Class238_Sub2) class238_sub2_31_).aFloat6724;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) class238_sub2_31_).aFloat6711;
        ((Class238_Sub2) this).aFloat6706 = 0.0F;
        ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) class238_sub2_31_).aFloat6744;
        ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) class238_sub2_31_).aFloat6713;
        ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) class238_sub2_31_).aFloat6737;
        ((Class238_Sub2) this).aFloat6715 = 0.0F;
        ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) class238_sub2_31_).aFloat6728;
    }

    final void method1887(float f, float f_32_, float f_33_, int i, int i_34_, int i_35_, int i_36_) {
        anInt6742++;
        if (i == 0) {
            ((Class238_Sub2) this).aFloat6715 = (float) -i_34_ + f;
            ((Class238_Sub2) this).aFloat6711 = (float) (2 * i_35_);
            ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6724 = 0.0F;
            ((Class238_Sub2) this).aFloat6737 = (float) (2 * i_34_);
            ((Class238_Sub2) this).aFloat6754 = 1.0F;
            ((Class238_Sub2) this).aFloat6706 = f_32_;
            ((Class238_Sub2) this).aFloat6733 = (float) -i_35_ + f_33_;
        } else {
            float f_37_ = Class86_Sub1.aFloatArray5512[0x3fff & i];
            float f_38_ = Class86_Sub1.aFloatArray5514[0x3fff & i];
            ((Class238_Sub2) this).aFloat6715 = f + (float) (2 * i_34_) * (f_38_ * -0.5F - f_37_ * 0.5F);
            ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6724 = 0.0F;
            ((Class238_Sub2) this).aFloat6733 = f_33_ + (-(0.5F * f_37_) + 0.5F * f_38_) * (float) (i_35_ * 2);
            ((Class238_Sub2) this).aFloat6737 = (float) i_34_ * (2.0F * f_37_);
            ((Class238_Sub2) this).aFloat6713 = (float) i_35_ * (2.0F * f_38_);
            ((Class238_Sub2) this).aFloat6754 = 1.0F;
            ((Class238_Sub2) this).aFloat6706 = f_32_;
            ((Class238_Sub2) this).aFloat6711 = f_37_ * 2.0F * (float) i_35_;
            ((Class238_Sub2) this).aFloat6750 = (float) i_34_ * (f_38_ * -2.0F);
        }
        if (i_36_ != 2)
            ((Class238_Sub2) this).aFloat6728 = -2.4224682F;
    }

    static final void method1888(byte i) {
        anInt6727++;
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324), (byte) -71, 0);
        if (i >= -66)
            method1893(false, null);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321), (byte) -71, 0);
        Class212.method1732(8583);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319), (byte) -71, 2);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348), (byte) -71, 2);
        Node_Sub20.method2521((byte) 105);
        Class332.method3400(1);
        Class5.aBoolean149 = true;
    }

    final void method1889(int i) {
        ((Class238_Sub2) this).aFloat6724 = -((Class238_Sub2) this).aFloat6724;
        ((Class238_Sub2) this).aFloat6754 = -((Class238_Sub2) this).aFloat6754;
        ((Class238_Sub2) this).aFloat6728 = -((Class238_Sub2) this).aFloat6728;
        ((Class238_Sub2) this).aFloat6715 = -((Class238_Sub2) this).aFloat6715;
        ((Class238_Sub2) this).aFloat6737 = -((Class238_Sub2) this).aFloat6737;
        if (i != 1)
            method1859(-16, 87, -128);
        anInt6709++;
        ((Class238_Sub2) this).aFloat6744 = -((Class238_Sub2) this).aFloat6744;
        ((Class238_Sub2) this).aFloat6713 = -((Class238_Sub2) this).aFloat6713;
        ((Class238_Sub2) this).aFloat6706 = -((Class238_Sub2) this).aFloat6706;
    }

    final void method1865(int i, int i_39_, int i_40_, int[] is) {
        is[0] = (int) (((Class238_Sub2) this).aFloat6733 + (((Class238_Sub2) this).aFloat6726 * (float) i_40_ + (((Class238_Sub2) this).aFloat6711 * (float) i + ((float) i_39_ * ((Class238_Sub2) this).aFloat6750))));
        is[1] = (int) ((float) i_40_ * ((Class238_Sub2) this).aFloat6724 + ((float) i * ((Class238_Sub2) this).aFloat6713 + ((Class238_Sub2) this).aFloat6737 * (float) i_39_) + ((Class238_Sub2) this).aFloat6715);
        is[2] = (int) (((Class238_Sub2) this).aFloat6706 + (((Class238_Sub2) this).aFloat6728 * (float) i + (float) i_39_ * ((Class238_Sub2) this).aFloat6744 + (float) i_40_ * ((Class238_Sub2) this).aFloat6754));
        anInt6731++;
    }

    final void method1867(int[] is) {
        anInt6718++;
        float f = (float) is[0] - ((Class238_Sub2) this).aFloat6733;
        float f_41_ = -((Class238_Sub2) this).aFloat6715 + (float) is[1];
        float f_42_ = (float) is[2] - ((Class238_Sub2) this).aFloat6706;
        is[2] = (int) (((Class238_Sub2) this).aFloat6724 * f_41_ + f * ((Class238_Sub2) this).aFloat6726 + ((Class238_Sub2) this).aFloat6754 * f_42_);
        is[0] = (int) (f * ((Class238_Sub2) this).aFloat6711 + ((Class238_Sub2) this).aFloat6713 * f_41_ + ((Class238_Sub2) this).aFloat6728 * f_42_);
        is[1] = (int) (((Class238_Sub2) this).aFloat6737 * f_41_ + f * ((Class238_Sub2) this).aFloat6750 + f_42_ * ((Class238_Sub2) this).aFloat6744);
    }

    static final Class212 method1890(int i) {
        anInt6741++;
        try {
            if (i != 0)
                return null;
            return (Class212) Class.forName("Class212_Sub1").newInstance();
        } catch (Throwable throwable) {
            return null;
        }
    }

    final void method1891(float f, float f_43_, float f_44_, float f_45_, int i, float f_46_, float f_47_, float f_48_, float f_49_, float f_50_) {
        ((Class238_Sub2) this).aFloat6715 = 0.0F;
        int i_51_ = 112 / ((i - -74) / 42);
        ((Class238_Sub2) this).aFloat6737 = f_48_;
        anInt6719++;
        ((Class238_Sub2) this).aFloat6754 = f_44_;
        ((Class238_Sub2) this).aFloat6724 = f_50_;
        ((Class238_Sub2) this).aFloat6733 = 0.0F;
        ((Class238_Sub2) this).aFloat6728 = f_49_;
        ((Class238_Sub2) this).aFloat6711 = f;
        ((Class238_Sub2) this).aFloat6726 = f_47_;
        ((Class238_Sub2) this).aFloat6713 = f_43_;
        ((Class238_Sub2) this).aFloat6706 = 0.0F;
        ((Class238_Sub2) this).aFloat6750 = f_46_;
        ((Class238_Sub2) this).aFloat6744 = f_45_;
    }

    final void method1892(float[] fs, float f, float f_52_, float f_53_, int i) {
        anInt6722++;
        if (i != -28422)
            ((Class238_Sub2) this).aFloat6713 = 0.49080238F;
        fs[2] = (f_52_ * ((Class238_Sub2) this).aFloat6728 + f_53_ * ((Class238_Sub2) this).aFloat6744 + ((Class238_Sub2) this).aFloat6754 * f);
        fs[0] = (f_52_ * ((Class238_Sub2) this).aFloat6711 + ((Class238_Sub2) this).aFloat6750 * f_53_ + f * ((Class238_Sub2) this).aFloat6726);
        fs[1] = (((Class238_Sub2) this).aFloat6737 * f_53_ + ((Class238_Sub2) this).aFloat6713 * f_52_ + ((Class238_Sub2) this).aFloat6724 * f);
    }

    static final void method1893(boolean bool, Canvas canvas) {
        anInt6714++;
        Dimension dimension = canvas.getSize();
        Node_Sub8_Sub1.method2027(27424, dimension.height, dimension.width);
        if (Node_Sub15_Sub4.anInt9694 != 1)
            Class301.aHa4933.b(canvas, Node_Sub8_Sub1.anInt8889, Class325.anInt3828);
        else
            Class301.aHa4933.b(canvas, Class82.anInt1030, Node_Sub38.anInt7269);
        if (bool != false)
            aClass209_6732 = null;
    }

    final void method1869(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
        anInt6712++;
        float f = Class86_Sub1.aFloatArray5512[i_56_ & 0x3fff];
        float f_59_ = Class86_Sub1.aFloatArray5514[0x3fff & i_56_];
        float f_60_ = Class86_Sub1.aFloatArray5512[0x3fff & i_57_];
        float f_61_ = Class86_Sub1.aFloatArray5514[i_57_ & 0x3fff];
        float f_62_ = Class86_Sub1.aFloatArray5512[i_58_ & 0x3fff];
        float f_63_ = Class86_Sub1.aFloatArray5514[0x3fff & i_58_];
        float f_64_ = f_62_ * f_59_;
        float f_65_ = f_59_ * f_63_;
        ((Class238_Sub2) this).aFloat6744 = -f_59_;
        ((Class238_Sub2) this).aFloat6737 = f * f_62_;
        ((Class238_Sub2) this).aFloat6724 = f_60_ * f_64_ + f_63_ * f_61_;
        ((Class238_Sub2) this).aFloat6713 = f_61_ * f_64_ + f_63_ * -f_60_;
        ((Class238_Sub2) this).aFloat6754 = f_60_ * f;
        ((Class238_Sub2) this).aFloat6726 = f_62_ * -f_61_ + f_60_ * f_65_;
        ((Class238_Sub2) this).aFloat6750 = f * f_63_;
        ((Class238_Sub2) this).aFloat6711 = f_62_ * f_60_ + f_65_ * f_61_;
        ((Class238_Sub2) this).aFloat6728 = f_61_ * f;
        ((Class238_Sub2) this).aFloat6706 = (-((float) i_55_ * ((Class238_Sub2) this).aFloat6754) + (-(((Class238_Sub2) this).aFloat6744 * (float) i_54_) + ((Class238_Sub2) this).aFloat6728 * (float) -i));
        ((Class238_Sub2) this).aFloat6715 = (-(((Class238_Sub2) this).aFloat6724 * (float) i_55_) + (((Class238_Sub2) this).aFloat6713 * (float) -i - (float) i_54_ * ((Class238_Sub2) this).aFloat6737));
        ((Class238_Sub2) this).aFloat6733 = (-((float) i_55_ * ((Class238_Sub2) this).aFloat6726) + (-((float) i_54_ * ((Class238_Sub2) this).aFloat6750) + ((Class238_Sub2) this).aFloat6711 * (float) -i));
    }

    final void method1873(int i) {
        anInt6725++;
        float f = Class86_Sub1.aFloatArray5512[0x3fff & i];
        float f_66_ = Class86_Sub1.aFloatArray5514[i & 0x3fff];
        float f_67_ = ((Class238_Sub2) this).aFloat6713;
        float f_68_ = ((Class238_Sub2) this).aFloat6737;
        float f_69_ = ((Class238_Sub2) this).aFloat6724;
        ((Class238_Sub2) this).aFloat6713 = f * f_67_ - ((Class238_Sub2) this).aFloat6728 * f_66_;
        float f_70_ = ((Class238_Sub2) this).aFloat6715;
        ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6728 * f + f_66_ * f_67_;
        ((Class238_Sub2) this).aFloat6737 = -(f_66_ * ((Class238_Sub2) this).aFloat6744) + f_68_ * f;
        ((Class238_Sub2) this).aFloat6724 = -(((Class238_Sub2) this).aFloat6754 * f_66_) + f_69_ * f;
        ((Class238_Sub2) this).aFloat6744 = f_68_ * f_66_ + f * ((Class238_Sub2) this).aFloat6744;
        ((Class238_Sub2) this).aFloat6715 = -(f_66_ * ((Class238_Sub2) this).aFloat6706) + f * f_70_;
        ((Class238_Sub2) this).aFloat6754 = f * ((Class238_Sub2) this).aFloat6754 + f_66_ * f_69_;
        ((Class238_Sub2) this).aFloat6706 = ((Class238_Sub2) this).aFloat6706 * f + f_66_ * f_70_;
    }

    static final void method1894(boolean bool, int i) {
        anInt6739++;
        Class55.method442(127);
        int i_71_ = (((Class180) Class282_Sub23.aClass378_7835.method3890(i, (byte) -127)).anInt2091);
        if (i_71_ != 0 && bool == false) {
            int i_72_ = ((Class291) Node_Sub43.aClass291_7306).anIntArray4749[i];
            if (i_71_ == 6)
                Class74.anInt954 = i_72_;
            if (i_71_ == 5)
                Class282_Sub27.anInt7878 = i_72_;
        }
    }

    final void method1858(int i) {
        anInt6729++;
        float f = Class86_Sub1.aFloatArray5512[0x3fff & i];
        float f_73_ = Class86_Sub1.aFloatArray5514[0x3fff & i];
        float f_74_ = ((Class238_Sub2) this).aFloat6711;
        float f_75_ = ((Class238_Sub2) this).aFloat6750;
        float f_76_ = ((Class238_Sub2) this).aFloat6726;
        float f_77_ = ((Class238_Sub2) this).aFloat6733;
        ((Class238_Sub2) this).aFloat6711 = f * f_74_ + ((Class238_Sub2) this).aFloat6728 * f_73_;
        ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6744 * f_73_ + f_75_ * f;
        ((Class238_Sub2) this).aFloat6728 = -(f_73_ * f_74_) + ((Class238_Sub2) this).aFloat6728 * f;
        ((Class238_Sub2) this).aFloat6744 = f * ((Class238_Sub2) this).aFloat6744 - f_73_ * f_75_;
        ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6754 * f_73_ + f * f_76_;
        ((Class238_Sub2) this).aFloat6733 = f * f_77_ + f_73_ * ((Class238_Sub2) this).aFloat6706;
        ((Class238_Sub2) this).aFloat6754 = ((Class238_Sub2) this).aFloat6754 * f - f_73_ * f_76_;
        ((Class238_Sub2) this).aFloat6706 = f * ((Class238_Sub2) this).aFloat6706 - f_73_ * f_77_;
    }

    final float method1895(float f, float f_78_, float f_79_, int i) {
        if (i != 15)
            ((Class238_Sub2) this).aFloat6715 = 1.0517861F;
        anInt6738++;
        return (f * ((Class238_Sub2) this).aFloat6726 + (f_78_ * ((Class238_Sub2) this).aFloat6750 + f_79_ * ((Class238_Sub2) this).aFloat6711) + ((Class238_Sub2) this).aFloat6733);
    }

    final void method1896(byte i, Viewport viewport) {
        anInt6749++;
        Class238_Sub2 class238_sub2_80_ = (Class238_Sub2) viewport;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) class238_sub2_80_).aFloat6711;
        ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) class238_sub2_80_).aFloat6728;
        ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) class238_sub2_80_).aFloat6713;
        ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) class238_sub2_80_).aFloat6737;
        ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) class238_sub2_80_).aFloat6726;
        if (i >= 47) {
            ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) class238_sub2_80_).aFloat6750;
            ((Class238_Sub2) this).aFloat6724 = ((Class238_Sub2) class238_sub2_80_).aFloat6744;
            ((Class238_Sub2) this).aFloat6754 = ((Class238_Sub2) class238_sub2_80_).aFloat6754;
            ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) class238_sub2_80_).aFloat6724;
            ((Class238_Sub2) this).aFloat6733 = -((((Class238_Sub2) this).aFloat6750 * ((Class238_Sub2) class238_sub2_80_).aFloat6715) + (((Class238_Sub2) class238_sub2_80_).aFloat6733 * ((Class238_Sub2) this).aFloat6711) + (((Class238_Sub2) this).aFloat6726 * ((Class238_Sub2) class238_sub2_80_).aFloat6706));
            ((Class238_Sub2) this).aFloat6715 = -((((Class238_Sub2) this).aFloat6724 * ((Class238_Sub2) class238_sub2_80_).aFloat6706) + ((((Class238_Sub2) class238_sub2_80_).aFloat6715 * ((Class238_Sub2) this).aFloat6737) + (((Class238_Sub2) this).aFloat6713 * ((Class238_Sub2) class238_sub2_80_).aFloat6733)));
            ((Class238_Sub2) this).aFloat6706 = -((((Class238_Sub2) this).aFloat6754 * ((Class238_Sub2) class238_sub2_80_).aFloat6706) + ((((Class238_Sub2) class238_sub2_80_).aFloat6715 * ((Class238_Sub2) this).aFloat6744) + (((Class238_Sub2) class238_sub2_80_).aFloat6733 * ((Class238_Sub2) this).aFloat6728)));
        }
    }

    final void method1897(float[] fs, float f, boolean bool, float f_81_, float f_82_, float f_83_) {
        if (bool == true) {
            anInt6723++;
            float f_84_;
            float f_85_;
            float f_86_;
            if (f_81_ > 0.00390625F || f_81_ < -0.00390625F) {
                float f_87_ = -f_83_ / f_81_;
                f_86_ = (f_87_ * ((Class238_Sub2) this).aFloat6711 + ((Class238_Sub2) this).aFloat6733);
                f_85_ = (((Class238_Sub2) this).aFloat6715 + f_87_ * ((Class238_Sub2) this).aFloat6713);
                f_84_ = (((Class238_Sub2) this).aFloat6706 + f_87_ * ((Class238_Sub2) this).aFloat6728);
            } else if (f > 0.00390625F || f < -0.00390625F) {
                float f_88_ = -f_83_ / f;
                f_84_ = (((Class238_Sub2) this).aFloat6706 + f_88_ * ((Class238_Sub2) this).aFloat6744);
                f_85_ = (((Class238_Sub2) this).aFloat6737 * f_88_ + ((Class238_Sub2) this).aFloat6715);
                f_86_ = (f_88_ * ((Class238_Sub2) this).aFloat6750 + ((Class238_Sub2) this).aFloat6733);
            } else {
                float f_89_ = -f_83_ / f_82_;
                f_86_ = (((Class238_Sub2) this).aFloat6733 + ((Class238_Sub2) this).aFloat6726 * f_89_);
                f_85_ = (((Class238_Sub2) this).aFloat6715 + f_89_ * ((Class238_Sub2) this).aFloat6724);
                f_84_ = (((Class238_Sub2) this).aFloat6754 * f_89_ + ((Class238_Sub2) this).aFloat6706);
            }
            fs[1] = (f * ((Class238_Sub2) this).aFloat6737 + ((Class238_Sub2) this).aFloat6713 * f_81_ + ((Class238_Sub2) this).aFloat6724 * f_82_);
            fs[2] = (((Class238_Sub2) this).aFloat6754 * f_82_ + (((Class238_Sub2) this).aFloat6744 * f + ((Class238_Sub2) this).aFloat6728 * f_81_));
            fs[0] = (f * ((Class238_Sub2) this).aFloat6750 + ((Class238_Sub2) this).aFloat6711 * f_81_ + f_82_ * ((Class238_Sub2) this).aFloat6726);
            fs[3] = -(f_86_ * fs[0] + f_85_ * fs[1] + fs[2] * f_84_);
        }
    }

    final void method1857(int i) {
        anInt6734++;
        ((Class238_Sub2) this).aFloat6737 = 1.0F;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) this).aFloat6754 = Class86_Sub1.aFloatArray5512[i & 0x3fff];
        ((Class238_Sub2) this).aFloat6726 = Class86_Sub1.aFloatArray5514[0x3fff & i];
        ((Class238_Sub2) this).aFloat6728 = -((Class238_Sub2) this).aFloat6726;
        ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6733 = ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) this).aFloat6724 = ((Class238_Sub2) this).aFloat6715 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6706 = 0.0F;
    }

    final void method1898(float f, float f_90_, float f_91_, byte i) {
        ((Class238_Sub2) this).aFloat6713 = 0.0F;
        if (i != -49)
            ((Class238_Sub2) this).aFloat6724 = -2.0666695F;
        ((Class238_Sub2) this).aFloat6750 = 0.0F;
        ((Class238_Sub2) this).aFloat6706 = 0.0F;
        ((Class238_Sub2) this).aFloat6715 = 0.0F;
        ((Class238_Sub2) this).aFloat6744 = 0.0F;
        ((Class238_Sub2) this).aFloat6711 = f_90_;
        anInt6735++;
        ((Class238_Sub2) this).aFloat6733 = 0.0F;
        ((Class238_Sub2) this).aFloat6737 = f;
        ((Class238_Sub2) this).aFloat6724 = 0.0F;
        ((Class238_Sub2) this).aFloat6754 = f_91_;
        ((Class238_Sub2) this).aFloat6726 = 0.0F;
        ((Class238_Sub2) this).aFloat6728 = 0.0F;
    }

    public Class238_Sub2() {
        method1866();
    }

    final void method1875(int i, int i_92_, int i_93_, int[] is) {
        i_92_ -= ((Class238_Sub2) this).aFloat6715;
        i -= ((Class238_Sub2) this).aFloat6733;
        anInt6704++;
        i_93_ -= ((Class238_Sub2) this).aFloat6706;
        is[1] = (int) (((Class238_Sub2) this).aFloat6737 * (float) i_92_ + (float) i * ((Class238_Sub2) this).aFloat6750 + (float) i_93_ * ((Class238_Sub2) this).aFloat6744);
        is[0] = (int) (((Class238_Sub2) this).aFloat6711 * (float) i + (float) i_92_ * ((Class238_Sub2) this).aFloat6713 + ((Class238_Sub2) this).aFloat6728 * (float) i_93_);
        is[2] = (int) (((Class238_Sub2) this).aFloat6754 * (float) i_93_ + ((float) i_92_ * ((Class238_Sub2) this).aFloat6724 + ((Class238_Sub2) this).aFloat6726 * (float) i));
    }

    final float[] method1899(int i, float[] fs) {
        fs[7] = ((Class238_Sub2) this).aFloat6715;
        fs[1] = ((Class238_Sub2) this).aFloat6750;
        fs[15] = 1.0F;
        fs[5] = ((Class238_Sub2) this).aFloat6737;
        anInt6756++;
        fs[14] = 0.0F;
        fs[10] = ((Class238_Sub2) this).aFloat6754;
        fs[12] = 0.0F;
        fs[11] = ((Class238_Sub2) this).aFloat6706;
        fs[6] = ((Class238_Sub2) this).aFloat6724;
        fs[9] = ((Class238_Sub2) this).aFloat6744;
        fs[2] = ((Class238_Sub2) this).aFloat6726;
        int i_94_ = -35 % ((32 - i) / 50);
        fs[0] = ((Class238_Sub2) this).aFloat6711;
        fs[13] = 0.0F;
        fs[3] = ((Class238_Sub2) this).aFloat6733;
        fs[4] = ((Class238_Sub2) this).aFloat6713;
        fs[8] = ((Class238_Sub2) this).aFloat6728;
        return fs;
    }

    final void method1900(Viewport viewport, Viewport viewport_95_) {
        anInt6720++;
        Class238_Sub2 class238_sub2_96_ = (Class238_Sub2) viewport;
        Class238_Sub2 class238_sub2_97_ = (Class238_Sub2) viewport_95_;
        ((Class238_Sub2) this).aFloat6711 = ((((Class238_Sub2) class238_sub2_96_).aFloat6750 * ((Class238_Sub2) class238_sub2_97_).aFloat6713) + (((Class238_Sub2) class238_sub2_97_).aFloat6711 * ((Class238_Sub2) class238_sub2_96_).aFloat6711) + (((Class238_Sub2) class238_sub2_97_).aFloat6728 * ((Class238_Sub2) class238_sub2_96_).aFloat6726));
        ((Class238_Sub2) this).aFloat6713 = ((((Class238_Sub2) class238_sub2_97_).aFloat6728 * ((Class238_Sub2) class238_sub2_96_).aFloat6724) + ((((Class238_Sub2) class238_sub2_97_).aFloat6711 * ((Class238_Sub2) class238_sub2_96_).aFloat6713) + (((Class238_Sub2) class238_sub2_97_).aFloat6713 * ((Class238_Sub2) class238_sub2_96_).aFloat6737)));
        ((Class238_Sub2) this).aFloat6728 = ((((Class238_Sub2) class238_sub2_96_).aFloat6754 * ((Class238_Sub2) class238_sub2_97_).aFloat6728) + ((((Class238_Sub2) class238_sub2_97_).aFloat6713 * ((Class238_Sub2) class238_sub2_96_).aFloat6744) + (((Class238_Sub2) class238_sub2_97_).aFloat6711 * ((Class238_Sub2) class238_sub2_96_).aFloat6728)));
        ((Class238_Sub2) this).aFloat6750 = ((((Class238_Sub2) class238_sub2_97_).aFloat6744 * ((Class238_Sub2) class238_sub2_96_).aFloat6726) + ((((Class238_Sub2) class238_sub2_96_).aFloat6750 * ((Class238_Sub2) class238_sub2_97_).aFloat6737) + (((Class238_Sub2) class238_sub2_97_).aFloat6750 * ((Class238_Sub2) class238_sub2_96_).aFloat6711)));
        ((Class238_Sub2) this).aFloat6737 = ((((Class238_Sub2) class238_sub2_97_).aFloat6737 * ((Class238_Sub2) class238_sub2_96_).aFloat6737) + (((Class238_Sub2) class238_sub2_96_).aFloat6713 * ((Class238_Sub2) class238_sub2_97_).aFloat6750) + (((Class238_Sub2) class238_sub2_96_).aFloat6724 * ((Class238_Sub2) class238_sub2_97_).aFloat6744));
        ((Class238_Sub2) this).aFloat6726 = ((((Class238_Sub2) class238_sub2_97_).aFloat6726 * ((Class238_Sub2) class238_sub2_96_).aFloat6711) + (((Class238_Sub2) class238_sub2_97_).aFloat6724 * ((Class238_Sub2) class238_sub2_96_).aFloat6750) + (((Class238_Sub2) class238_sub2_97_).aFloat6754 * ((Class238_Sub2) class238_sub2_96_).aFloat6726));
        ((Class238_Sub2) this).aFloat6744 = ((((Class238_Sub2) class238_sub2_97_).aFloat6744 * ((Class238_Sub2) class238_sub2_96_).aFloat6754) + ((((Class238_Sub2) class238_sub2_97_).aFloat6737 * ((Class238_Sub2) class238_sub2_96_).aFloat6744) + (((Class238_Sub2) class238_sub2_97_).aFloat6750 * ((Class238_Sub2) class238_sub2_96_).aFloat6728)));
        ((Class238_Sub2) this).aFloat6724 = ((((Class238_Sub2) class238_sub2_96_).aFloat6737 * ((Class238_Sub2) class238_sub2_97_).aFloat6724) + (((Class238_Sub2) class238_sub2_96_).aFloat6713 * ((Class238_Sub2) class238_sub2_97_).aFloat6726) + (((Class238_Sub2) class238_sub2_96_).aFloat6724 * ((Class238_Sub2) class238_sub2_97_).aFloat6754));
        ((Class238_Sub2) this).aFloat6754 = ((((Class238_Sub2) class238_sub2_97_).aFloat6724 * ((Class238_Sub2) class238_sub2_96_).aFloat6744) + (((Class238_Sub2) class238_sub2_96_).aFloat6728 * ((Class238_Sub2) class238_sub2_97_).aFloat6726) + (((Class238_Sub2) class238_sub2_97_).aFloat6754 * ((Class238_Sub2) class238_sub2_96_).aFloat6754));
        ((Class238_Sub2) this).aFloat6733 = (((Class238_Sub2) class238_sub2_96_).aFloat6733 + ((((Class238_Sub2) class238_sub2_97_).aFloat6733 * ((Class238_Sub2) class238_sub2_96_).aFloat6711) + (((Class238_Sub2) class238_sub2_96_).aFloat6750 * ((Class238_Sub2) class238_sub2_97_).aFloat6715) + (((Class238_Sub2) class238_sub2_97_).aFloat6706 * ((Class238_Sub2) class238_sub2_96_).aFloat6726)));
        ((Class238_Sub2) this).aFloat6715 = ((((Class238_Sub2) class238_sub2_97_).aFloat6715 * ((Class238_Sub2) class238_sub2_96_).aFloat6737) + (((Class238_Sub2) class238_sub2_96_).aFloat6713 * ((Class238_Sub2) class238_sub2_97_).aFloat6733) + (((Class238_Sub2) class238_sub2_96_).aFloat6724 * ((Class238_Sub2) class238_sub2_97_).aFloat6706) + ((Class238_Sub2) class238_sub2_96_).aFloat6715);
        ((Class238_Sub2) this).aFloat6706 = ((((Class238_Sub2) class238_sub2_97_).aFloat6715 * ((Class238_Sub2) class238_sub2_96_).aFloat6744) + (((Class238_Sub2) class238_sub2_97_).aFloat6733 * ((Class238_Sub2) class238_sub2_96_).aFloat6728) + (((Class238_Sub2) class238_sub2_97_).aFloat6706 * ((Class238_Sub2) class238_sub2_96_).aFloat6754) + ((Class238_Sub2) class238_sub2_96_).aFloat6706);
    }

    final float[] method1901(byte i, float[] fs) {
        anInt6751++;
        fs[5] = ((Class238_Sub2) this).aFloat6737;
        fs[4] = ((Class238_Sub2) this).aFloat6750;
        fs[15] = 1.0F;
        fs[14] = ((Class238_Sub2) this).aFloat6706;
        fs[3] = 0.0F;
        fs[13] = ((Class238_Sub2) this).aFloat6715;
        fs[12] = ((Class238_Sub2) this).aFloat6733;
        fs[9] = ((Class238_Sub2) this).aFloat6724;
        fs[2] = ((Class238_Sub2) this).aFloat6728;
        fs[10] = ((Class238_Sub2) this).aFloat6754;
        fs[11] = 0.0F;
        fs[7] = 0.0F;
        fs[0] = ((Class238_Sub2) this).aFloat6711;
        fs[8] = ((Class238_Sub2) this).aFloat6726;
        fs[6] = ((Class238_Sub2) this).aFloat6744;
        fs[1] = ((Class238_Sub2) this).aFloat6713;
        int i_98_ = -82 % ((24 - i) / 57);
        return fs;
    }

    final float[] method1902(int i, float[] fs) {
        fs[12] = 0.0F;
        fs[2] = 0.0F;
        fs[0] = ((Class238_Sub2) this).aFloat6711;
        fs[11] = 0.0F;
        fs[14] = 0.0F;
        fs[7] = (float) i;
        fs[9] = ((Class238_Sub2) this).aFloat6715;
        fs[6] = 0.0F;
        fs[10] = ((Class238_Sub2) this).aFloat6706;
        fs[1] = ((Class238_Sub2) this).aFloat6713;
        fs[4] = ((Class238_Sub2) this).aFloat6750;
        anInt6757++;
        fs[3] = 0.0F;
        fs[15] = 1.0F;
        fs[8] = ((Class238_Sub2) this).aFloat6733;
        fs[5] = ((Class238_Sub2) this).aFloat6737;
        fs[13] = 0.0F;
        return fs;
    }

    final void method1859(int i, int i_99_, int i_100_) {
        anInt6740++;
        ((Class238_Sub2) this).aFloat6711 = ((Class238_Sub2) this).aFloat6737 = ((Class238_Sub2) this).aFloat6754 = 1.0F;
        ((Class238_Sub2) this).aFloat6706 = (float) i_100_;
        ((Class238_Sub2) this).aFloat6713 = ((Class238_Sub2) this).aFloat6728 = ((Class238_Sub2) this).aFloat6750 = ((Class238_Sub2) this).aFloat6744 = ((Class238_Sub2) this).aFloat6726 = ((Class238_Sub2) this).aFloat6724 = 0.0F;
        ((Class238_Sub2) this).aFloat6715 = (float) i_99_;
        ((Class238_Sub2) this).aFloat6733 = (float) i;
    }
}
