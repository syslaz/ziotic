/* Class238_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class238_Sub1 extends Viewport {
    float aFloat6675;
    static int anInt6676;
    float aFloat6677;
    static int anInt6678;
    static int anInt6679;
    float aFloat6680;
    static int anInt6681;
    static int anInt6682;
    float aFloat6683;
    static int anInt6684;
    static int anInt6685;
    float aFloat6686;
    static int anInt6687;
    float aFloat6688;
    static int anInt6689;
    static int anInt6690;
    static int anInt6691;
    float aFloat6692;
    static int anInt6693;
    float aFloat6694;
    static int anInt6695;
    static int anInt6696;
    float aFloat6697;
    float aFloat6698;
    float aFloat6699;
    static int anInt6700;
    static int anInt6701;
    float aFloat6702;
    static int anInt6703;

    final void method1865(int i, int i_0_, int i_1_, int[] is) {
        is[2] = (int) (((Class238_Sub1) this).aFloat6699 * (float) i_1_ + ((float) i_0_ * ((Class238_Sub1) this).aFloat6692 + (float) i * ((Class238_Sub1) this).aFloat6694) + ((Class238_Sub1) this).aFloat6675);
        anInt6685++;
        is[1] = (int) (((Class238_Sub1) this).aFloat6677 + (((Class238_Sub1) this).aFloat6697 * (float) i_1_ + ((float) i * ((Class238_Sub1) this).aFloat6702 + ((float) i_0_ * ((Class238_Sub1) this).aFloat6698))));
        is[0] = (int) (((Class238_Sub1) this).aFloat6686 + ((float) i_0_ * ((Class238_Sub1) this).aFloat6680 + ((Class238_Sub1) this).aFloat6688 * (float) i + (float) i_1_ * ((Class238_Sub1) this).aFloat6683));
    }

    final void method1862(int i, int i_2_, int i_3_) {
        anInt6684++;
        ((Class238_Sub1) this).aFloat6677 += (float) i_2_;
        ((Class238_Sub1) this).aFloat6675 += (float) i_3_;
        ((Class238_Sub1) this).aFloat6686 += (float) i;
    }

    final void method1869(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt6682++;
        float f = Class86_Sub1.aFloatArray5512[i_6_ & 0x3fff];
        float f_9_ = Class86_Sub1.aFloatArray5514[i_6_ & 0x3fff];
        float f_10_ = Class86_Sub1.aFloatArray5512[i_7_ & 0x3fff];
        float f_11_ = Class86_Sub1.aFloatArray5514[0x3fff & i_7_];
        float f_12_ = Class86_Sub1.aFloatArray5512[0x3fff & i_8_];
        float f_13_ = Class86_Sub1.aFloatArray5514[i_8_ & 0x3fff];
        float f_14_ = f_12_ * f_9_;
        float f_15_ = f_13_ * f_9_;
        ((Class238_Sub1) this).aFloat6698 = f_12_ * f;
        ((Class238_Sub1) this).aFloat6702 = -f_10_ * f_13_ + f_14_ * f_11_;
        ((Class238_Sub1) this).aFloat6683 = -f_11_ * f_12_ + f_10_ * f_15_;
        ((Class238_Sub1) this).aFloat6699 = f * f_10_;
        ((Class238_Sub1) this).aFloat6680 = f * f_13_;
        ((Class238_Sub1) this).aFloat6694 = f * f_11_;
        ((Class238_Sub1) this).aFloat6697 = f_11_ * f_13_ + f_10_ * f_14_;
        ((Class238_Sub1) this).aFloat6688 = f_11_ * f_15_ + f_12_ * f_10_;
        ((Class238_Sub1) this).aFloat6692 = -f_9_;
        ((Class238_Sub1) this).aFloat6677 = (((Class238_Sub1) this).aFloat6702 * (float) -i - ((Class238_Sub1) this).aFloat6698 * (float) i_4_ - ((Class238_Sub1) this).aFloat6697 * (float) i_5_);
        ((Class238_Sub1) this).aFloat6675 = (-((float) i_4_ * ((Class238_Sub1) this).aFloat6692) + (float) -i * ((Class238_Sub1) this).aFloat6694 - (float) i_5_ * ((Class238_Sub1) this).aFloat6699);
        ((Class238_Sub1) this).aFloat6686 = (-(((Class238_Sub1) this).aFloat6683 * (float) i_5_) + (((Class238_Sub1) this).aFloat6688 * (float) -i - (float) i_4_ * ((Class238_Sub1) this).aFloat6680));
    }

    final Viewport method1863() {
        anInt6678++;
        Class238_Sub1 class238_sub1_16_ = new Class238_Sub1();
        ((Class238_Sub1) class238_sub1_16_).aFloat6699 = ((Class238_Sub1) this).aFloat6699;
        ((Class238_Sub1) class238_sub1_16_).aFloat6692 = ((Class238_Sub1) this).aFloat6692;
        ((Class238_Sub1) class238_sub1_16_).aFloat6683 = ((Class238_Sub1) this).aFloat6683;
        ((Class238_Sub1) class238_sub1_16_).aFloat6677 = ((Class238_Sub1) this).aFloat6677;
        ((Class238_Sub1) class238_sub1_16_).aFloat6675 = ((Class238_Sub1) this).aFloat6675;
        ((Class238_Sub1) class238_sub1_16_).aFloat6688 = ((Class238_Sub1) this).aFloat6688;
        ((Class238_Sub1) class238_sub1_16_).aFloat6694 = ((Class238_Sub1) this).aFloat6694;
        ((Class238_Sub1) class238_sub1_16_).aFloat6680 = ((Class238_Sub1) this).aFloat6680;
        ((Class238_Sub1) class238_sub1_16_).aFloat6702 = ((Class238_Sub1) this).aFloat6702;
        ((Class238_Sub1) class238_sub1_16_).aFloat6697 = ((Class238_Sub1) this).aFloat6697;
        ((Class238_Sub1) class238_sub1_16_).aFloat6698 = ((Class238_Sub1) this).aFloat6698;
        ((Class238_Sub1) class238_sub1_16_).aFloat6686 = ((Class238_Sub1) this).aFloat6686;
        return class238_sub1_16_;
    }

    final void method1857(int i) {
        anInt6689++;
        ((Class238_Sub1) this).aFloat6698 = 1.0F;
        ((Class238_Sub1) this).aFloat6688 = ((Class238_Sub1) this).aFloat6699 = Class86_Sub1.aFloatArray5512[0x3fff & i];
        ((Class238_Sub1) this).aFloat6683 = Class86_Sub1.aFloatArray5514[0x3fff & i];
        ((Class238_Sub1) this).aFloat6680 = ((Class238_Sub1) this).aFloat6686 = ((Class238_Sub1) this).aFloat6702 = ((Class238_Sub1) this).aFloat6697 = ((Class238_Sub1) this).aFloat6677 = ((Class238_Sub1) this).aFloat6692 = ((Class238_Sub1) this).aFloat6675 = 0.0F;
        ((Class238_Sub1) this).aFloat6694 = -((Class238_Sub1) this).aFloat6683;
    }

    final void method1873(int i) {
        anInt6691++;
        float f = Class86_Sub1.aFloatArray5512[0x3fff & i];
        float f_17_ = Class86_Sub1.aFloatArray5514[i & 0x3fff];
        float f_18_ = ((Class238_Sub1) this).aFloat6702;
        float f_19_ = ((Class238_Sub1) this).aFloat6698;
        float f_20_ = ((Class238_Sub1) this).aFloat6697;
        float f_21_ = ((Class238_Sub1) this).aFloat6677;
        ((Class238_Sub1) this).aFloat6702 = f_18_ * f - f_17_ * ((Class238_Sub1) this).aFloat6694;
        ((Class238_Sub1) this).aFloat6698 = -(((Class238_Sub1) this).aFloat6692 * f_17_) + f * f_19_;
        ((Class238_Sub1) this).aFloat6694 = f_17_ * f_18_ + ((Class238_Sub1) this).aFloat6694 * f;
        ((Class238_Sub1) this).aFloat6697 = -(((Class238_Sub1) this).aFloat6699 * f_17_) + f_20_ * f;
        ((Class238_Sub1) this).aFloat6692 = f_17_ * f_19_ + f * ((Class238_Sub1) this).aFloat6692;
        ((Class238_Sub1) this).aFloat6677 = f_21_ * f - f_17_ * ((Class238_Sub1) this).aFloat6675;
        ((Class238_Sub1) this).aFloat6699 = f * ((Class238_Sub1) this).aFloat6699 + f_17_ * f_20_;
        ((Class238_Sub1) this).aFloat6675 = f_21_ * f_17_ + f * ((Class238_Sub1) this).aFloat6675;
    }

    static final void method1876(int i) {
        anInt6687++;
        Class225_Sub1_Sub1.method1792(0);
        if (i != -787)
            method1876(-72);
        Node_Sub8_Sub6.aBoolean8949 = false;
    }

    final void method1858(int i) {
        anInt6695++;
        float f = Class86_Sub1.aFloatArray5512[i & 0x3fff];
        float f_22_ = Class86_Sub1.aFloatArray5514[0x3fff & i];
        float f_23_ = ((Class238_Sub1) this).aFloat6688;
        float f_24_ = ((Class238_Sub1) this).aFloat6680;
        float f_25_ = ((Class238_Sub1) this).aFloat6683;
        float f_26_ = ((Class238_Sub1) this).aFloat6686;
        ((Class238_Sub1) this).aFloat6688 = f_22_ * ((Class238_Sub1) this).aFloat6694 + f * f_23_;
        ((Class238_Sub1) this).aFloat6694 = -(f_22_ * f_23_) + ((Class238_Sub1) this).aFloat6694 * f;
        ((Class238_Sub1) this).aFloat6680 = f_24_ * f + f_22_ * ((Class238_Sub1) this).aFloat6692;
        ((Class238_Sub1) this).aFloat6692 = ((Class238_Sub1) this).aFloat6692 * f - f_22_ * f_24_;
        ((Class238_Sub1) this).aFloat6683 = f_22_ * ((Class238_Sub1) this).aFloat6699 + f_25_ * f;
        ((Class238_Sub1) this).aFloat6686 = f * f_26_ + ((Class238_Sub1) this).aFloat6675 * f_22_;
        ((Class238_Sub1) this).aFloat6699 = f * ((Class238_Sub1) this).aFloat6699 - f_22_ * f_25_;
        ((Class238_Sub1) this).aFloat6675 = ((Class238_Sub1) this).aFloat6675 * f - f_26_ * f_22_;
    }

    final void method1859(int i, int i_27_, int i_28_) {
        ((Class238_Sub1) this).aFloat6686 = (float) i;
        ((Class238_Sub1) this).aFloat6702 = ((Class238_Sub1) this).aFloat6694 = ((Class238_Sub1) this).aFloat6680 = ((Class238_Sub1) this).aFloat6692 = ((Class238_Sub1) this).aFloat6683 = ((Class238_Sub1) this).aFloat6697 = 0.0F;
        ((Class238_Sub1) this).aFloat6675 = (float) i_28_;
        anInt6700++;
        ((Class238_Sub1) this).aFloat6688 = ((Class238_Sub1) this).aFloat6698 = ((Class238_Sub1) this).aFloat6699 = 1.0F;
        ((Class238_Sub1) this).aFloat6677 = (float) i_27_;
    }

    final void method1861(int i) {
        anInt6690++;
        ((Class238_Sub1) this).aFloat6688 = 1.0F;
        ((Class238_Sub1) this).aFloat6698 = ((Class238_Sub1) this).aFloat6699 = Class86_Sub1.aFloatArray5512[i & 0x3fff];
        ((Class238_Sub1) this).aFloat6692 = Class86_Sub1.aFloatArray5514[0x3fff & i];
        ((Class238_Sub1) this).aFloat6680 = ((Class238_Sub1) this).aFloat6683 = ((Class238_Sub1) this).aFloat6686 = ((Class238_Sub1) this).aFloat6702 = ((Class238_Sub1) this).aFloat6677 = ((Class238_Sub1) this).aFloat6694 = ((Class238_Sub1) this).aFloat6675 = 0.0F;
        ((Class238_Sub1) this).aFloat6697 = -((Class238_Sub1) this).aFloat6692;
    }

    final void method1870(int i, int i_29_, int i_30_, int[] is) {
        is[1] = (int) ((float) i_30_ * ((Class238_Sub1) this).aFloat6697 + (((Class238_Sub1) this).aFloat6698 * (float) i_29_ + ((Class238_Sub1) this).aFloat6702 * (float) i));
        anInt6696++;
        is[0] = (int) (((Class238_Sub1) this).aFloat6683 * (float) i_30_ + (((Class238_Sub1) this).aFloat6688 * (float) i + ((Class238_Sub1) this).aFloat6680 * (float) i_29_));
        is[2] = (int) ((float) i_29_ * ((Class238_Sub1) this).aFloat6692 + (float) i * ((Class238_Sub1) this).aFloat6694 + (float) i_30_ * ((Class238_Sub1) this).aFloat6699);
    }

    final void method1864(int i) {
        ((Class238_Sub1) this).aFloat6699 = 1.0F;
        anInt6693++;
        ((Class238_Sub1) this).aFloat6688 = ((Class238_Sub1) this).aFloat6698 = Class86_Sub1.aFloatArray5512[0x3fff & i];
        ((Class238_Sub1) this).aFloat6702 = Class86_Sub1.aFloatArray5514[i & 0x3fff];
        ((Class238_Sub1) this).aFloat6683 = ((Class238_Sub1) this).aFloat6686 = ((Class238_Sub1) this).aFloat6697 = ((Class238_Sub1) this).aFloat6677 = ((Class238_Sub1) this).aFloat6694 = ((Class238_Sub1) this).aFloat6692 = ((Class238_Sub1) this).aFloat6675 = 0.0F;
        ((Class238_Sub1) this).aFloat6680 = -((Class238_Sub1) this).aFloat6702;
    }

    final void method1867(int[] is) {
        anInt6701++;
        float f = (float) is[0] - ((Class238_Sub1) this).aFloat6686;
        float f_31_ = -((Class238_Sub1) this).aFloat6677 + (float) is[1];
        float f_32_ = (float) is[2] - ((Class238_Sub1) this).aFloat6675;
        is[0] = (int) (((Class238_Sub1) this).aFloat6688 * f + ((Class238_Sub1) this).aFloat6702 * f_31_ + f_32_ * ((Class238_Sub1) this).aFloat6694);
        is[1] = (int) (((Class238_Sub1) this).aFloat6698 * f_31_ + f * ((Class238_Sub1) this).aFloat6680 + ((Class238_Sub1) this).aFloat6692 * f_32_);
        is[2] = (int) (((Class238_Sub1) this).aFloat6699 * f_32_ + (f_31_ * ((Class238_Sub1) this).aFloat6697 + ((Class238_Sub1) this).aFloat6683 * f));
    }

    final void method1875(int i, int i_33_, int i_34_, int[] is) {
        i -= ((Class238_Sub1) this).aFloat6686;
        i_33_ -= ((Class238_Sub1) this).aFloat6677;
        i_34_ -= ((Class238_Sub1) this).aFloat6675;
        anInt6679++;
        is[2] = (int) ((float) i_33_ * ((Class238_Sub1) this).aFloat6697 + (float) i * ((Class238_Sub1) this).aFloat6683 + (float) i_34_ * ((Class238_Sub1) this).aFloat6699);
        is[0] = (int) ((float) i_33_ * ((Class238_Sub1) this).aFloat6702 + (float) i * ((Class238_Sub1) this).aFloat6688 + (float) i_34_ * ((Class238_Sub1) this).aFloat6694);
        is[1] = (int) (((Class238_Sub1) this).aFloat6680 * (float) i + ((Class238_Sub1) this).aFloat6698 * (float) i_33_ + (float) i_34_ * ((Class238_Sub1) this).aFloat6692);
    }

    final void method1868(Viewport viewport) {
        anInt6703++;
        Class238_Sub1 class238_sub1_35_ = (Class238_Sub1) viewport;
        ((Class238_Sub1) this).aFloat6677 = ((Class238_Sub1) class238_sub1_35_).aFloat6677;
        ((Class238_Sub1) this).aFloat6680 = ((Class238_Sub1) class238_sub1_35_).aFloat6680;
        ((Class238_Sub1) this).aFloat6702 = ((Class238_Sub1) class238_sub1_35_).aFloat6702;
        ((Class238_Sub1) this).aFloat6699 = ((Class238_Sub1) class238_sub1_35_).aFloat6699;
        ((Class238_Sub1) this).aFloat6688 = ((Class238_Sub1) class238_sub1_35_).aFloat6688;
        ((Class238_Sub1) this).aFloat6698 = ((Class238_Sub1) class238_sub1_35_).aFloat6698;
        ((Class238_Sub1) this).aFloat6697 = ((Class238_Sub1) class238_sub1_35_).aFloat6697;
        ((Class238_Sub1) this).aFloat6692 = ((Class238_Sub1) class238_sub1_35_).aFloat6692;
        ((Class238_Sub1) this).aFloat6686 = ((Class238_Sub1) class238_sub1_35_).aFloat6686;
        ((Class238_Sub1) this).aFloat6675 = ((Class238_Sub1) class238_sub1_35_).aFloat6675;
        ((Class238_Sub1) this).aFloat6683 = ((Class238_Sub1) class238_sub1_35_).aFloat6683;
        ((Class238_Sub1) this).aFloat6694 = ((Class238_Sub1) class238_sub1_35_).aFloat6694;
    }

    final void method1866() {
        anInt6676++;
        ((Class238_Sub1) this).aFloat6702 = ((Class238_Sub1) this).aFloat6694 = ((Class238_Sub1) this).aFloat6680 = ((Class238_Sub1) this).aFloat6692 = ((Class238_Sub1) this).aFloat6683 = ((Class238_Sub1) this).aFloat6697 = ((Class238_Sub1) this).aFloat6686 = ((Class238_Sub1) this).aFloat6677 = ((Class238_Sub1) this).aFloat6675 = 0.0F;
        ((Class238_Sub1) this).aFloat6688 = ((Class238_Sub1) this).aFloat6698 = ((Class238_Sub1) this).aFloat6699 = 1.0F;
    }

    final void method1872(int i) {
        anInt6681++;
        float f = Class86_Sub1.aFloatArray5512[0x3fff & i];
        float f_36_ = Class86_Sub1.aFloatArray5514[0x3fff & i];
        float f_37_ = ((Class238_Sub1) this).aFloat6688;
        float f_38_ = ((Class238_Sub1) this).aFloat6680;
        float f_39_ = ((Class238_Sub1) this).aFloat6683;
        float f_40_ = ((Class238_Sub1) this).aFloat6686;
        ((Class238_Sub1) this).aFloat6688 = f * f_37_ - ((Class238_Sub1) this).aFloat6702 * f_36_;
        ((Class238_Sub1) this).aFloat6680 = f * f_38_ - ((Class238_Sub1) this).aFloat6698 * f_36_;
        ((Class238_Sub1) this).aFloat6702 = f_36_ * f_37_ + ((Class238_Sub1) this).aFloat6702 * f;
        ((Class238_Sub1) this).aFloat6698 = ((Class238_Sub1) this).aFloat6698 * f + f_36_ * f_38_;
        ((Class238_Sub1) this).aFloat6683 = f * f_39_ - f_36_ * ((Class238_Sub1) this).aFloat6697;
        ((Class238_Sub1) this).aFloat6697 = f * ((Class238_Sub1) this).aFloat6697 + f_39_ * f_36_;
        ((Class238_Sub1) this).aFloat6686 = f_40_ * f - ((Class238_Sub1) this).aFloat6677 * f_36_;
        ((Class238_Sub1) this).aFloat6677 = f_40_ * f_36_ + f * ((Class238_Sub1) this).aFloat6677;
    }

    public Class238_Sub1() {
        method1866();
    }
}
