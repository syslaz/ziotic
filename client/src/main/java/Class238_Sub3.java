/* Class238_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class238_Sub3 extends Viewport {
    static int anInt6759;
    static int anInt6760;
    float aFloat6761;
    static int anInt6762;
    static int anInt6763;
    static int anInt6764;
    static int anInt6765;
    static int anInt6766;
    static int anInt6767;
    static int anInt6768;
    static int anInt6769;
    float aFloat6770;
    static int anInt6771;
    float aFloat6772;
    static Class129 aClass129_6773;
    static Class243 aClass243_6774;
    float aFloat6775;
    static int anInt6776;
    static int anInt6777;
    static int anInt6778;
    static int anInt6779;
    float aFloat6780;
    static int anInt6781;
    static int anInt6782 = 1;
    static int anInt6783;
    float aFloat6784;
    float aFloat6785;
    float aFloat6786;
    static int anInt6787;
    static int anInt6788;
    static int anInt6789;
    static int anInt6790;
    float aFloat6791;
    static int anInt6792;
    float aFloat6793;
    float aFloat6794;
    static int anInt6795;
    static int anInt6796;
    float aFloat6797;

    final void method1875(int i, int i_0_, int i_1_, int[] is) {
        i -= ((Class238_Sub3) this).aFloat6780;
        anInt6764++;
        i_1_ -= ((Class238_Sub3) this).aFloat6797;
        i_0_ -= ((Class238_Sub3) this).aFloat6770;
        is[1] = (int) ((float) i * ((Class238_Sub3) this).aFloat6784 + (float) i_0_ * ((Class238_Sub3) this).aFloat6772 + ((Class238_Sub3) this).aFloat6791 * (float) i_1_);
        is[0] = (int) (((Class238_Sub3) this).aFloat6775 * (float) i_1_ + (((Class238_Sub3) this).aFloat6761 * (float) i_0_ + (float) i * ((Class238_Sub3) this).aFloat6794));
        is[2] = (int) ((float) i * ((Class238_Sub3) this).aFloat6785 + (float) i_0_ * ((Class238_Sub3) this).aFloat6786 + (float) i_1_ * ((Class238_Sub3) this).aFloat6793);
    }

    final void method1869(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt6759++;
        float f = Class252.aFloatArray2838[i_4_ & 0x3fff];
        float f_7_ = Class252.aFloatArray2839[i_4_ & 0x3fff];
        float f_8_ = Class252.aFloatArray2838[0x3fff & i_5_];
        float f_9_ = Class252.aFloatArray2839[0x3fff & i_5_];
        float f_10_ = Class252.aFloatArray2838[i_6_ & 0x3fff];
        float f_11_ = Class252.aFloatArray2839[0x3fff & i_6_];
        float f_12_ = f_7_ * f_10_;
        float f_13_ = f_11_ * f_7_;
        ((Class238_Sub3) this).aFloat6784 = f_11_ * f;
        ((Class238_Sub3) this).aFloat6785 = -f_9_ * f_10_ + f_8_ * f_13_;
        ((Class238_Sub3) this).aFloat6794 = f_9_ * f_13_ + f_10_ * f_8_;
        ((Class238_Sub3) this).aFloat6775 = f_9_ * f;
        ((Class238_Sub3) this).aFloat6791 = -f_7_;
        ((Class238_Sub3) this).aFloat6786 = f_11_ * f_9_ + f_12_ * f_8_;
        ((Class238_Sub3) this).aFloat6761 = -f_8_ * f_11_ + f_12_ * f_9_;
        ((Class238_Sub3) this).aFloat6793 = f * f_8_;
        ((Class238_Sub3) this).aFloat6772 = f_10_ * f;
        ((Class238_Sub3) this).aFloat6770 = (-(((Class238_Sub3) this).aFloat6786 * (float) i_3_) + (-(((Class238_Sub3) this).aFloat6772 * (float) i_2_) + (float) -i * ((Class238_Sub3) this).aFloat6761));
        ((Class238_Sub3) this).aFloat6780 = ((float) -i * ((Class238_Sub3) this).aFloat6794 - ((Class238_Sub3) this).aFloat6784 * (float) i_2_ - (float) i_3_ * ((Class238_Sub3) this).aFloat6785);
        ((Class238_Sub3) this).aFloat6797 = (-(((Class238_Sub3) this).aFloat6793 * (float) i_3_) + (((Class238_Sub3) this).aFloat6775 * (float) -i - ((Class238_Sub3) this).aFloat6791 * (float) i_2_));
    }

    public static void method1903(int i) {
        if (i == 0) {
            aClass243_6774 = null;
            aClass129_6773 = null;
        }
    }

    final Viewport method1863() {
        anInt6778++;
        Class238_Sub3 class238_sub3_14_ = new Class238_Sub3();
        ((Class238_Sub3) class238_sub3_14_).aFloat6785 = ((Class238_Sub3) this).aFloat6785;
        ((Class238_Sub3) class238_sub3_14_).aFloat6793 = ((Class238_Sub3) this).aFloat6793;
        ((Class238_Sub3) class238_sub3_14_).aFloat6794 = ((Class238_Sub3) this).aFloat6794;
        ((Class238_Sub3) class238_sub3_14_).aFloat6775 = ((Class238_Sub3) this).aFloat6775;
        ((Class238_Sub3) class238_sub3_14_).aFloat6797 = ((Class238_Sub3) this).aFloat6797;
        ((Class238_Sub3) class238_sub3_14_).aFloat6780 = ((Class238_Sub3) this).aFloat6780;
        ((Class238_Sub3) class238_sub3_14_).aFloat6786 = ((Class238_Sub3) this).aFloat6786;
        ((Class238_Sub3) class238_sub3_14_).aFloat6784 = ((Class238_Sub3) this).aFloat6784;
        ((Class238_Sub3) class238_sub3_14_).aFloat6761 = ((Class238_Sub3) this).aFloat6761;
        ((Class238_Sub3) class238_sub3_14_).aFloat6791 = ((Class238_Sub3) this).aFloat6791;
        ((Class238_Sub3) class238_sub3_14_).aFloat6770 = ((Class238_Sub3) this).aFloat6770;
        ((Class238_Sub3) class238_sub3_14_).aFloat6772 = ((Class238_Sub3) this).aFloat6772;
        return class238_sub3_14_;
    }

    final void method1867(int[] is) {
        anInt6779++;
        float f = -((Class238_Sub3) this).aFloat6780 + (float) is[0];
        float f_15_ = (float) is[1] - ((Class238_Sub3) this).aFloat6770;
        float f_16_ = -((Class238_Sub3) this).aFloat6797 + (float) is[2];
        is[1] = (int) (f_15_ * ((Class238_Sub3) this).aFloat6772 + ((Class238_Sub3) this).aFloat6784 * f + f_16_ * ((Class238_Sub3) this).aFloat6791);
        is[0] = (int) (((Class238_Sub3) this).aFloat6761 * f_15_ + ((Class238_Sub3) this).aFloat6794 * f + ((Class238_Sub3) this).aFloat6775 * f_16_);
        is[2] = (int) (f_15_ * ((Class238_Sub3) this).aFloat6786 + f * ((Class238_Sub3) this).aFloat6785 + f_16_ * ((Class238_Sub3) this).aFloat6793);
    }

    final void method1857(int i) {
        anInt6788++;
        ((Class238_Sub3) this).aFloat6772 = 1.0F;
        ((Class238_Sub3) this).aFloat6794 = ((Class238_Sub3) this).aFloat6793 = Class252.aFloatArray2838[0x3fff & i];
        ((Class238_Sub3) this).aFloat6785 = Class252.aFloatArray2839[i & 0x3fff];
        ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) this).aFloat6780 = ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) this).aFloat6786 = ((Class238_Sub3) this).aFloat6770 = ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6797 = 0.0F;
        ((Class238_Sub3) this).aFloat6775 = -((Class238_Sub3) this).aFloat6785;
    }

    final void method1861(int i) {
        anInt6763++;
        ((Class238_Sub3) this).aFloat6794 = 1.0F;
        ((Class238_Sub3) this).aFloat6772 = ((Class238_Sub3) this).aFloat6793 = Class252.aFloatArray2838[i & 0x3fff];
        ((Class238_Sub3) this).aFloat6791 = Class252.aFloatArray2839[0x3fff & i];
        ((Class238_Sub3) this).aFloat6786 = -((Class238_Sub3) this).aFloat6791;
        ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) this).aFloat6780 = ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) this).aFloat6770 = ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) this).aFloat6797 = 0.0F;
    }

    final void method1859(int i, int i_17_, int i_18_) {
        ((Class238_Sub3) this).aFloat6770 = (float) i_17_;
        ((Class238_Sub3) this).aFloat6794 = ((Class238_Sub3) this).aFloat6772 = ((Class238_Sub3) this).aFloat6793 = 1.0F;
        anInt6766++;
        ((Class238_Sub3) this).aFloat6797 = (float) i_18_;
        ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) this).aFloat6786 = 0.0F;
        ((Class238_Sub3) this).aFloat6780 = (float) i;
    }

    final void method1862(int i, int i_19_, int i_20_) {
        ((Class238_Sub3) this).aFloat6780 += (float) i;
        anInt6789++;
        ((Class238_Sub3) this).aFloat6797 += (float) i_20_;
        ((Class238_Sub3) this).aFloat6770 += (float) i_19_;
    }

    final void method1858(int i) {
        anInt6777++;
        float f = Class252.aFloatArray2838[0x3fff & i];
        float f_21_ = Class252.aFloatArray2839[0x3fff & i];
        float f_22_ = ((Class238_Sub3) this).aFloat6794;
        float f_23_ = ((Class238_Sub3) this).aFloat6784;
        float f_24_ = ((Class238_Sub3) this).aFloat6785;
        ((Class238_Sub3) this).aFloat6794 = f_21_ * ((Class238_Sub3) this).aFloat6775 + f_22_ * f;
        float f_25_ = ((Class238_Sub3) this).aFloat6780;
        ((Class238_Sub3) this).aFloat6784 = f_23_ * f + ((Class238_Sub3) this).aFloat6791 * f_21_;
        ((Class238_Sub3) this).aFloat6775 = -(f_21_ * f_22_) + f * ((Class238_Sub3) this).aFloat6775;
        ((Class238_Sub3) this).aFloat6785 = f_24_ * f + f_21_ * ((Class238_Sub3) this).aFloat6793;
        ((Class238_Sub3) this).aFloat6791 = -(f_23_ * f_21_) + f * ((Class238_Sub3) this).aFloat6791;
        ((Class238_Sub3) this).aFloat6780 = f_21_ * ((Class238_Sub3) this).aFloat6797 + f * f_25_;
        ((Class238_Sub3) this).aFloat6793 = f * ((Class238_Sub3) this).aFloat6793 - f_21_ * f_24_;
        ((Class238_Sub3) this).aFloat6797 = f * ((Class238_Sub3) this).aFloat6797 - f_21_ * f_25_;
    }

    final void method1866() {
        ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) this).aFloat6786 = ((Class238_Sub3) this).aFloat6780 = ((Class238_Sub3) this).aFloat6770 = ((Class238_Sub3) this).aFloat6797 = 0.0F;
        ((Class238_Sub3) this).aFloat6794 = ((Class238_Sub3) this).aFloat6772 = ((Class238_Sub3) this).aFloat6793 = 1.0F;
        anInt6796++;
    }

    final void method1904(byte i, Viewport viewport) {
        anInt6783++;
        Class238_Sub3 class238_sub3_26_ = (Class238_Sub3) viewport;
        ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) class238_sub3_26_).aFloat6775;
        ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) class238_sub3_26_).aFloat6761;
        ((Class238_Sub3) this).aFloat6794 = ((Class238_Sub3) class238_sub3_26_).aFloat6794;
        ((Class238_Sub3) this).aFloat6786 = ((Class238_Sub3) class238_sub3_26_).aFloat6791;
        ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) class238_sub3_26_).aFloat6784;
        ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) class238_sub3_26_).aFloat6785;
        ((Class238_Sub3) this).aFloat6772 = ((Class238_Sub3) class238_sub3_26_).aFloat6772;
        ((Class238_Sub3) this).aFloat6780 = -((((Class238_Sub3) class238_sub3_26_).aFloat6797 * ((Class238_Sub3) this).aFloat6785) + ((((Class238_Sub3) class238_sub3_26_).aFloat6770 * ((Class238_Sub3) this).aFloat6784) + (((Class238_Sub3) class238_sub3_26_).aFloat6780 * ((Class238_Sub3) this).aFloat6794)));
        ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) class238_sub3_26_).aFloat6786;
        ((Class238_Sub3) this).aFloat6793 = ((Class238_Sub3) class238_sub3_26_).aFloat6793;
        ((Class238_Sub3) this).aFloat6770 = -((((Class238_Sub3) this).aFloat6786 * ((Class238_Sub3) class238_sub3_26_).aFloat6797) + ((((Class238_Sub3) this).aFloat6772 * ((Class238_Sub3) class238_sub3_26_).aFloat6770) + (((Class238_Sub3) this).aFloat6761 * ((Class238_Sub3) class238_sub3_26_).aFloat6780)));
        ((Class238_Sub3) this).aFloat6797 = -((((Class238_Sub3) class238_sub3_26_).aFloat6797 * ((Class238_Sub3) this).aFloat6793) + ((((Class238_Sub3) this).aFloat6791 * ((Class238_Sub3) class238_sub3_26_).aFloat6770) + (((Class238_Sub3) this).aFloat6775 * ((Class238_Sub3) class238_sub3_26_).aFloat6780)));
        if (i != 33)
            ((Class238_Sub3) this).aFloat6761 = 1.5872078F;
    }

    final void method1905(int i) {
        ((Class238_Sub3) this).aFloat6791 = -((Class238_Sub3) this).aFloat6791;
        ((Class238_Sub3) this).aFloat6775 = -((Class238_Sub3) this).aFloat6775;
        int i_27_ = 1 % ((-20 - i) / 47);
        ((Class238_Sub3) this).aFloat6786 = -((Class238_Sub3) this).aFloat6786;
        anInt6765++;
        ((Class238_Sub3) this).aFloat6797 = -((Class238_Sub3) this).aFloat6797;
        ((Class238_Sub3) this).aFloat6770 = -((Class238_Sub3) this).aFloat6770;
        ((Class238_Sub3) this).aFloat6793 = -((Class238_Sub3) this).aFloat6793;
        ((Class238_Sub3) this).aFloat6772 = -((Class238_Sub3) this).aFloat6772;
        ((Class238_Sub3) this).aFloat6761 = -((Class238_Sub3) this).aFloat6761;
    }

    final void method1906(float f, float f_28_, float f_29_, int i, float f_30_, float[] fs) {
        anInt6769++;
        fs[0] = (f * ((Class238_Sub3) this).aFloat6785 + (((Class238_Sub3) this).aFloat6794 * f_30_ + ((Class238_Sub3) this).aFloat6784 * f_29_));
        fs[1] = (((Class238_Sub3) this).aFloat6786 * f + (((Class238_Sub3) this).aFloat6772 * f_29_ + f_30_ * ((Class238_Sub3) this).aFloat6761));
        if (i != 15082)
            method1863();
        fs[2] = (f_29_ * ((Class238_Sub3) this).aFloat6791 + f_30_ * ((Class238_Sub3) this).aFloat6775 + f * ((Class238_Sub3) this).aFloat6793);
        float f_31_;
        float f_32_;
        float f_33_;
        if (f_30_ > 0.00390625F || f_30_ < -0.00390625F) {
            float f_34_ = -f_28_ / f_30_;
            f_31_ = (((Class238_Sub3) this).aFloat6775 * f_34_ + ((Class238_Sub3) this).aFloat6797);
            f_33_ = (((Class238_Sub3) this).aFloat6794 * f_34_ + ((Class238_Sub3) this).aFloat6780);
            f_32_ = (((Class238_Sub3) this).aFloat6761 * f_34_ + ((Class238_Sub3) this).aFloat6770);
        } else if (!(f_29_ > 0.00390625F) && !(f_29_ < -0.00390625F)) {
            float f_35_ = -f_28_ / f;
            f_31_ = (((Class238_Sub3) this).aFloat6797 + f_35_ * ((Class238_Sub3) this).aFloat6793);
            f_32_ = (((Class238_Sub3) this).aFloat6786 * f_35_ + ((Class238_Sub3) this).aFloat6770);
            f_33_ = (f_35_ * ((Class238_Sub3) this).aFloat6785 + ((Class238_Sub3) this).aFloat6780);
        } else {
            float f_36_ = -f_28_ / f_29_;
            f_31_ = (((Class238_Sub3) this).aFloat6797 + f_36_ * ((Class238_Sub3) this).aFloat6791);
            f_33_ = (((Class238_Sub3) this).aFloat6780 + ((Class238_Sub3) this).aFloat6784 * f_36_);
            f_32_ = (f_36_ * ((Class238_Sub3) this).aFloat6772 + ((Class238_Sub3) this).aFloat6770);
        }
        fs[3] = -(fs[2] * f_31_ + (fs[0] * f_33_ + fs[1] * f_32_));
    }

    final float[] method1907(byte i) {
        Class133.aFloatArray5044[4] = ((Class238_Sub3) this).aFloat6784;
        Class133.aFloatArray5044[1] = ((Class238_Sub3) this).aFloat6761;
        Class133.aFloatArray5044[14] = ((Class238_Sub3) this).aFloat6797;
        Class133.aFloatArray5044[9] = ((Class238_Sub3) this).aFloat6786;
        Class133.aFloatArray5044[8] = ((Class238_Sub3) this).aFloat6785;
        Class133.aFloatArray5044[5] = ((Class238_Sub3) this).aFloat6772;
        anInt6760++;
        Class133.aFloatArray5044[0] = ((Class238_Sub3) this).aFloat6794;
        Class133.aFloatArray5044[13] = ((Class238_Sub3) this).aFloat6770;
        Class133.aFloatArray5044[12] = ((Class238_Sub3) this).aFloat6780;
        Class133.aFloatArray5044[10] = ((Class238_Sub3) this).aFloat6793;
        Class133.aFloatArray5044[2] = ((Class238_Sub3) this).aFloat6775;
        Class133.aFloatArray5044[6] = ((Class238_Sub3) this).aFloat6791;
        if (i >= -76)
            return null;
        return Class133.aFloatArray5044;
    }

    final void method1872(int i) {
        anInt6768++;
        float f = Class252.aFloatArray2838[0x3fff & i];
        float f_37_ = Class252.aFloatArray2839[i & 0x3fff];
        float f_38_ = ((Class238_Sub3) this).aFloat6794;
        float f_39_ = ((Class238_Sub3) this).aFloat6784;
        float f_40_ = ((Class238_Sub3) this).aFloat6785;
        ((Class238_Sub3) this).aFloat6794 = -(f_37_ * ((Class238_Sub3) this).aFloat6761) + f_38_ * f;
        float f_41_ = ((Class238_Sub3) this).aFloat6780;
        ((Class238_Sub3) this).aFloat6784 = f_39_ * f - f_37_ * ((Class238_Sub3) this).aFloat6772;
        ((Class238_Sub3) this).aFloat6761 = f_37_ * f_38_ + f * ((Class238_Sub3) this).aFloat6761;
        ((Class238_Sub3) this).aFloat6772 = f * ((Class238_Sub3) this).aFloat6772 + f_39_ * f_37_;
        ((Class238_Sub3) this).aFloat6785 = -(((Class238_Sub3) this).aFloat6786 * f_37_) + f * f_40_;
        ((Class238_Sub3) this).aFloat6780 = f * f_41_ - ((Class238_Sub3) this).aFloat6770 * f_37_;
        ((Class238_Sub3) this).aFloat6786 = f_37_ * f_40_ + ((Class238_Sub3) this).aFloat6786 * f;
        ((Class238_Sub3) this).aFloat6770 = ((Class238_Sub3) this).aFloat6770 * f + f_37_ * f_41_;
    }

    final void method1870(int i, int i_42_, int i_43_, int[] is) {
        anInt6790++;
        is[0] = (int) ((float) i_42_ * ((Class238_Sub3) this).aFloat6784 + ((Class238_Sub3) this).aFloat6794 * (float) i + ((Class238_Sub3) this).aFloat6785 * (float) i_43_);
        is[2] = (int) ((float) i * ((Class238_Sub3) this).aFloat6775 + ((Class238_Sub3) this).aFloat6791 * (float) i_42_ + ((Class238_Sub3) this).aFloat6793 * (float) i_43_);
        is[1] = (int) (((Class238_Sub3) this).aFloat6761 * (float) i + (float) i_42_ * ((Class238_Sub3) this).aFloat6772 + ((Class238_Sub3) this).aFloat6786 * (float) i_43_);
    }

    static final boolean method1908(int i, byte i_44_, Class2 class2) {
        anInt6792++;
        Node_Sub48.aViewport_7431.method1865(((Class2) class2).anIntArray124[i], ((Class2) class2).anIntArray122[i], ((Class2) class2).anIntArray117[i], Node_Sub2_Sub4.anIntArray8881);
        int i_45_ = Node_Sub2_Sub4.anIntArray8881[2];
        if ((i_45_ ^ 0xffffffff) > -51)
            return false;
        ((Class2) class2).aShortArray114[i] = (short) ((Node_Sub2_Sub4.anIntArray8881[0] * Class226_Sub2_Sub1.anInt8808 / i_45_) + Class162_Sub2.anInt6470);
        ((Class2) class2).aShortArray128[i] = (short) (Node_Sub14_Sub10.anInt9249 + (Node_Sub2_Sub4.anIntArray8881[1] * Class146.anInt1728 / i_45_));
        if (i_44_ >= -23)
            return false;
        ((Class2) class2).aShortArray119[i] = (short) i_45_;
        return true;
    }

    static final void method1909(int i, int i_46_) {
        anInt6771++;
        if (Class346_Sub7_Sub5_Sub2.method3699(i_46_, (byte) -22))
            Class272.method2836((Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i_46_]), i, (byte) -107);
    }

    final void method1868(Viewport viewport) {
        anInt6767++;
        Class238_Sub3 class238_sub3_47_ = (Class238_Sub3) viewport;
        ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) class238_sub3_47_).aFloat6761;
        ((Class238_Sub3) this).aFloat6794 = ((Class238_Sub3) class238_sub3_47_).aFloat6794;
        ((Class238_Sub3) this).aFloat6772 = ((Class238_Sub3) class238_sub3_47_).aFloat6772;
        ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) class238_sub3_47_).aFloat6784;
        ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) class238_sub3_47_).aFloat6791;
        ((Class238_Sub3) this).aFloat6770 = ((Class238_Sub3) class238_sub3_47_).aFloat6770;
        ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) class238_sub3_47_).aFloat6785;
        ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) class238_sub3_47_).aFloat6775;
        ((Class238_Sub3) this).aFloat6786 = ((Class238_Sub3) class238_sub3_47_).aFloat6786;
        ((Class238_Sub3) this).aFloat6793 = ((Class238_Sub3) class238_sub3_47_).aFloat6793;
        ((Class238_Sub3) this).aFloat6797 = ((Class238_Sub3) class238_sub3_47_).aFloat6797;
        ((Class238_Sub3) this).aFloat6780 = ((Class238_Sub3) class238_sub3_47_).aFloat6780;
    }

    final void method1910(boolean bool, float f, float f_48_, float f_49_, int i, int i_50_, int i_51_) {
        if (i_50_ != 0) {
            float f_52_ = Class252.aFloatArray2838[0x3fff & i_50_];
            float f_53_ = Class252.aFloatArray2839[i_50_ & 0x3fff];
            ((Class238_Sub3) this).aFloat6772 = f_52_ * (float) i;
            ((Class238_Sub3) this).aFloat6761 = f_53_ * (float) i_51_;
            ((Class238_Sub3) this).aFloat6793 = 1.0F;
            ((Class238_Sub3) this).aFloat6784 = -f_53_ * (float) i;
            ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) this).aFloat6786 = 0.0F;
            ((Class238_Sub3) this).aFloat6794 = f_52_ * (float) i_51_;
        } else {
            ((Class238_Sub3) this).aFloat6794 = (float) i_51_;
            ((Class238_Sub3) this).aFloat6793 = 1.0F;
            ((Class238_Sub3) this).aFloat6761 = ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) this).aFloat6784 = ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) this).aFloat6786 = 0.0F;
            ((Class238_Sub3) this).aFloat6772 = (float) i;
        }
        anInt6762++;
        if (bool != false)
            aClass129_6773 = null;
        ((Class238_Sub3) this).aFloat6780 = f_48_;
        ((Class238_Sub3) this).aFloat6770 = f;
        ((Class238_Sub3) this).aFloat6797 = f_49_;
    }

    final void method1865(int i, int i_54_, int i_55_, int[] is) {
        is[2] = (int) (((Class238_Sub3) this).aFloat6797 + (((Class238_Sub3) this).aFloat6775 * (float) i + ((Class238_Sub3) this).aFloat6791 * (float) i_54_ + ((Class238_Sub3) this).aFloat6793 * (float) i_55_));
        anInt6781++;
        is[0] = (int) (((Class238_Sub3) this).aFloat6780 + ((float) i * ((Class238_Sub3) this).aFloat6794 + ((Class238_Sub3) this).aFloat6784 * (float) i_54_ + (float) i_55_ * ((Class238_Sub3) this).aFloat6785));
        is[1] = (int) (((Class238_Sub3) this).aFloat6786 * (float) i_55_ + (((Class238_Sub3) this).aFloat6761 * (float) i + (float) i_54_ * ((Class238_Sub3) this).aFloat6772) + ((Class238_Sub3) this).aFloat6770);
    }

    final void method1864(int i) {
        ((Class238_Sub3) this).aFloat6793 = 1.0F;
        anInt6776++;
        ((Class238_Sub3) this).aFloat6794 = ((Class238_Sub3) this).aFloat6772 = Class252.aFloatArray2838[i & 0x3fff];
        ((Class238_Sub3) this).aFloat6761 = Class252.aFloatArray2839[0x3fff & i];
        ((Class238_Sub3) this).aFloat6784 = -((Class238_Sub3) this).aFloat6761;
        ((Class238_Sub3) this).aFloat6785 = ((Class238_Sub3) this).aFloat6780 = ((Class238_Sub3) this).aFloat6786 = ((Class238_Sub3) this).aFloat6770 = ((Class238_Sub3) this).aFloat6775 = ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6797 = 0.0F;
    }

    final void method1873(int i) {
        anInt6787++;
        float f = Class252.aFloatArray2838[0x3fff & i];
        float f_56_ = Class252.aFloatArray2839[i & 0x3fff];
        float f_57_ = ((Class238_Sub3) this).aFloat6761;
        float f_58_ = ((Class238_Sub3) this).aFloat6772;
        float f_59_ = ((Class238_Sub3) this).aFloat6786;
        float f_60_ = ((Class238_Sub3) this).aFloat6770;
        ((Class238_Sub3) this).aFloat6761 = -(f_56_ * ((Class238_Sub3) this).aFloat6775) + f * f_57_;
        ((Class238_Sub3) this).aFloat6772 = f * f_58_ - ((Class238_Sub3) this).aFloat6791 * f_56_;
        ((Class238_Sub3) this).aFloat6775 = f_57_ * f_56_ + f * ((Class238_Sub3) this).aFloat6775;
        ((Class238_Sub3) this).aFloat6786 = -(((Class238_Sub3) this).aFloat6793 * f_56_) + f * f_59_;
        ((Class238_Sub3) this).aFloat6791 = ((Class238_Sub3) this).aFloat6791 * f + f_56_ * f_58_;
        ((Class238_Sub3) this).aFloat6793 = f_56_ * f_59_ + f * ((Class238_Sub3) this).aFloat6793;
        ((Class238_Sub3) this).aFloat6770 = f * f_60_ - f_56_ * ((Class238_Sub3) this).aFloat6797;
        ((Class238_Sub3) this).aFloat6797 = f * ((Class238_Sub3) this).aFloat6797 + f_56_ * f_60_;
    }

    final float[] method1911(int i) {
        Class133.aFloatArray5044[0] = ((Class238_Sub3) this).aFloat6794;
        Class133.aFloatArray5044[6] = ((Class238_Sub3) this).aFloat6791;
        Class133.aFloatArray5044[13] = 0.0F;
        Class133.aFloatArray5044[5] = ((Class238_Sub3) this).aFloat6772;
        Class133.aFloatArray5044[12] = 0.0F;
        Class133.aFloatArray5044[4] = ((Class238_Sub3) this).aFloat6784;
        Class133.aFloatArray5044[10] = ((Class238_Sub3) this).aFloat6793;
        Class133.aFloatArray5044[14] = 0.0F;
        Class133.aFloatArray5044[1] = ((Class238_Sub3) this).aFloat6761;
        Class133.aFloatArray5044[i] = ((Class238_Sub3) this).aFloat6786;
        anInt6795++;
        Class133.aFloatArray5044[8] = ((Class238_Sub3) this).aFloat6785;
        Class133.aFloatArray5044[2] = ((Class238_Sub3) this).aFloat6775;
        return Class133.aFloatArray5044;
    }

    public Class238_Sub3() {
        method1866();
    }
}
