/* s_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.OpenGL;

final class s_Sub2 extends s {
    static int anInt7929;
    static int anInt7930;
    static int anInt7931;
    private int anInt7932;
    static int anInt7933;
    int[][][] anIntArrayArrayArray7934;
    static int anInt7935;
    static int anInt7936;
    private Node_Sub1[][][] aClass248_Sub1ArrayArrayArray7937;
    static int anInt7938;
    int[][][] anIntArrayArrayArray7939;
    static int anInt7940;
    private byte[][] aByteArrayArray7941;
    static int anInt7942;
    static int anInt7943;
    static int anInt7944;
    int[][][] anIntArrayArrayArray7945;
    static int anInt7946 = 503;
    static int anInt7947;
    static int anInt7948;
    static int anInt7949;
    private int[][][] anIntArrayArrayArray7950;
    static Class339 aClass339_7951;
    private Class293 aClass293_7952 = new Class293();
    private int[][][] anIntArrayArrayArray7953;
    short[][] aShortArrayArray7954;
    static int anInt7955 = -1;
    static int anInt7956;
    private int anInt7957;
    static int anInt7958;
    static int anInt7959;
    ha_Sub2 aHa_Sub2_7960;
    private int anInt7961;
    static Class285 aClass285_7962;
    int anInt7963;
    private Class155 aClass155_7964;
    private int[][][] anIntArrayArrayArray7965;
    private int anInt7966;
    private int anInt7967;
    Class140 aClass140_7968;
    Class140 aClass140_7969;
    private int anInt7970;
    private Class140 aClass140_7971;
    private byte[][] aByteArrayArray7972;
    private Interface6 anInterface6_7973;
    private float[][] aFloatArrayArray7974;
    private float[][] aFloatArrayArray7975;
    private Class65 aClass65_7976;
    Class140 aClass140_7977;
    private float[][] aFloatArrayArray7978;
    private Node_Sub1[] aClass248_Sub1Array7979;

    final void YA() {
        if (anInt7970 <= 0)
            aClass155_7964 = null;
        else {
            byte[][] is = (new byte[((s) this).anInt3468 - -1]
                    [1 + ((s) this).anInt3472]);
            for (int i = 1; (((s) this).anInt3468 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                for (int i_0_ = 1; (((s) this).anInt3472 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++)
                    is[i][i_0_] = (byte) ((aByteArrayArray7972[i][i_0_ + -1] >> 1373829282) + ((aByteArrayArray7972[i - -1][i_0_] >> 1431185283) + (aByteArrayArray7972[-1 + i][i_0_] >> 573600962)) + ((aByteArrayArray7972[i][1 + i_0_] >> 994033475) + (aByteArrayArray7972[i][i_0_] >> -740403167)));
            }
            aClass248_Sub1Array7979 = new Node_Sub1[aClass65_7976.method513((byte) 32)];
            aClass65_7976.method508(aClass248_Sub1Array7979, true);
            for (int i = 0; aClass248_Sub1Array7979.length > i; i++)
                aClass248_Sub1Array7979[i].method1973(true, anInt7970);
            int i = 24;
            if (anIntArrayArrayArray7950 != null)
                i += 4;
            if ((((s_Sub2) this).anInt7963 & 0x7 ^ 0xffffffff) != -1)
                i += 12;
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aNativeHeap5799.a(anInt7970 * i, false);
            Stream stream = new Stream(nativeheapbuffer);
            Node_Sub1[] class248_sub1s = new Node_Sub1[anInt7970];
            int i_1_ = Class44_Sub1.method318(27690, anInt7970 / 4);
            if (i_1_ < 1)
                i_1_ = 1;
            Class65 class65 = new Class65(i_1_);
            Node_Sub1[] class248_sub1s_2_ = new Node_Sub1[anInt7967];
            for (int i_3_ = 0; (((s) this).anInt3468 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
                for (int i_4_ = 0; ((s) this).anInt3472 > i_4_; i_4_++) {
                    if (((s_Sub2) this).anIntArrayArrayArray7945[i_3_][i_4_] != null) {
                        Node_Sub1[] class248_sub1s_5_ = aClass248_Sub1ArrayArrayArray7937[i_3_][i_4_];
                        int[] is_6_ = (((s_Sub2) this).anIntArrayArrayArray7939[i_3_][i_4_]);
                        int[] is_7_ = (((s_Sub2) this).anIntArrayArrayArray7934[i_3_][i_4_]);
                        int[] is_8_ = anIntArrayArrayArray7965[i_3_][i_4_];
                        int[] is_9_ = (((s_Sub2) this).anIntArrayArrayArray7945[i_3_][i_4_]);
                        int[] is_10_ = (anIntArrayArrayArray7953 == null ? null : anIntArrayArrayArray7953[i_3_][i_4_]);
                        if (is_8_ == null)
                            is_8_ = is_9_;
                        int[] is_11_ = (anIntArrayArrayArray7950 != null ? anIntArrayArrayArray7950[i_3_][i_4_] : null);
                        float f = aFloatArrayArray7975[i_3_][i_4_];
                        float f_12_ = aFloatArrayArray7974[i_3_][i_4_];
                        float f_13_ = aFloatArrayArray7978[i_3_][i_4_];
                        float f_14_ = aFloatArrayArray7975[i_3_][i_4_ - -1];
                        float f_15_ = aFloatArrayArray7974[i_3_][i_4_ + 1];
                        float f_16_ = aFloatArrayArray7978[i_3_][i_4_ + 1];
                        float f_17_ = aFloatArrayArray7975[i_3_ + 1][i_4_ + 1];
                        float f_18_ = aFloatArrayArray7974[i_3_ - -1][i_4_ + 1];
                        float f_19_ = aFloatArrayArray7978[1 + i_3_][i_4_ + 1];
                        float f_20_ = aFloatArrayArray7975[i_3_ - -1][i_4_];
                        float f_21_ = aFloatArrayArray7974[i_3_ + 1][i_4_];
                        float f_22_ = aFloatArrayArray7978[i_3_ + 1][i_4_];
                        int i_23_ = is[i_3_][i_4_] & 0xff;
                        int i_24_ = is[i_3_][i_4_ - -1] & 0xff;
                        int i_25_ = is[i_3_ + 1][i_4_ + 1] & 0xff;
                        int i_26_ = is[i_3_ + 1][i_4_] & 0xff;
                        int i_27_ = 0;
                        while_145_:
                        for (int i_28_ = 0; i_28_ < is_9_.length; i_28_++) {
                            Node_Sub1 class248_sub1 = class248_sub1s_5_[i_28_];
                            for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
                                if (class248_sub1 == class248_sub1s_2_[i_29_])
                                    continue while_145_;
                            }
                            class248_sub1s_2_[i_27_++] = class248_sub1;
                        }
                        short[] is_30_ = (((s_Sub2) this).aShortArrayArray7954[i_3_ + ((s) this).anInt3468 * i_4_] = new short[is_9_.length]);
                        for (int i_31_ = 0; ((i_31_ ^ 0xffffffff) > (is_9_.length ^ 0xffffffff)); i_31_++) {
                            int i_32_ = ((i_3_ << ((s) this).anInt3466) + is_6_[i_31_]);
                            int i_33_ = ((i_4_ << ((s) this).anInt3466) - -is_7_[i_31_]);
                            int i_34_ = i_32_ >> anInt7932;
                            int i_35_ = i_33_ >> anInt7932;
                            int i_36_ = is_9_[i_31_];
                            int i_37_ = is_8_[i_31_];
                            int i_38_ = is_10_ == null ? 0 : is_10_[i_31_];
                            long l = ((long) (i_34_ << 944428784) | ((long) i_36_ << -1218802848 | (long) i_37_ << 180679664) | (long) i_35_);
                            int i_39_ = is_6_[i_31_];
                            int i_40_ = is_7_[i_31_];
                            int i_41_ = 74;
                            int i_42_ = 0;
                            float f_43_;
                            float f_44_;
                            float f_45_;
                            if (i_39_ == 0 && i_40_ == 0) {
                                i_41_ -= i_23_;
                                f_44_ = f;
                                f_43_ = f_12_;
                                f_45_ = f_13_;
                            } else if ((i_39_ ^ 0xffffffff) == -1 && ((s) this).anInt3465 == i_40_) {
                                f_43_ = f_15_;
                                i_41_ -= i_24_;
                                f_44_ = f_14_;
                                f_45_ = f_16_;
                            } else if (i_39_ == ((s) this).anInt3465 && i_40_ == ((s) this).anInt3465) {
                                f_43_ = f_18_;
                                f_45_ = f_19_;
                                i_41_ -= i_25_;
                                f_44_ = f_17_;
                            } else if (i_39_ == ((s) this).anInt3465 && (i_40_ ^ 0xffffffff) == -1) {
                                f_43_ = f_21_;
                                f_44_ = f_20_;
                                i_41_ -= i_26_;
                                f_45_ = f_22_;
                            } else {
                                float f_46_ = ((float) i_39_ / (float) ((s) this).anInt3465);
                                float f_47_ = ((float) i_40_ / (float) ((s) this).anInt3465);
                                float f_48_ = (f_20_ - f) * f_46_ + f;
                                float f_49_ = f_12_ + (f_21_ - f_12_) * f_46_;
                                float f_50_ = (f_22_ - f_13_) * f_46_ + f_13_;
                                float f_51_ = f_14_ + f_46_ * (-f_14_ + f_17_);
                                float f_52_ = f_46_ * (f_18_ - f_15_) + f_15_;
                                f_44_ = f_48_ + (f_51_ - f_48_) * f_47_;
                                f_43_ = f_49_ + f_47_ * (f_52_ - f_49_);
                                float f_53_ = f_16_ + f_46_ * (-f_16_ + f_19_);
                                f_45_ = f_50_ + f_47_ * (-f_50_ + f_53_);
                                int i_54_ = i_23_ - -(i_39_ * (i_26_ + -i_23_) >> ((s) this).anInt3466);
                                int i_55_ = i_24_ + (i_39_ * (i_25_ + -i_24_) >> ((s) this).anInt3466);
                                i_41_ -= (i_40_ * (i_55_ - i_54_) >> ((s) this).anInt3466) + i_54_;
                            }
                            float f_56_ = 1.0F;
                            if ((i_36_ ^ 0xffffffff) != 0) {
                                int i_57_ = i_41_ * (0x7f & i_36_) >> 1505805895;
                                if ((i_57_ ^ 0xffffffff) > -3)
                                    i_57_ = 2;
                                else if (i_57_ > 126)
                                    i_57_ = 126;
                                i_42_ = (Node_Sub14_Sub39.anIntArray9600[0xff80 & i_36_ | i_57_]);
                                if ((0x7 & ((s_Sub2) this).anInt7963) == 0) {
                                    f_56_ = ((f_45_ * (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloatArray5838[2])) + ((((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloatArray5838[0]) * f_44_ + f_43_ * (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloatArray5838[1])));
                                    f_56_ = ((!(f_56_ > 0.0F) ? (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloat5846) : (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloat5840)) * f_56_ + (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aFloat5878));
                                }
                            }
                            Node node = null;
                            if ((anInt7966 + -1 & i_32_) == 0 && (i_33_ & -1 + anInt7966) == 0)
                                node = class65.method501(l, (byte) 31);
                            int i_58_;
                            if (node == null) {
                                int i_59_;
                                if ((i_37_ ^ 0xffffffff) != (i_36_ ^ 0xffffffff)) {
                                    int i_60_ = (i_41_ * (0x7f & i_37_) >> -1974603385);
                                    if (i_60_ >= 2) {
                                        if (i_60_ > 126)
                                            i_60_ = 126;
                                    } else
                                        i_60_ = 2;
                                    i_59_ = (Node_Sub14_Sub39.anIntArray9600[i_60_ | 0xff80 & i_37_]);
                                    if ((0x7 & ((s_Sub2) this).anInt7963 ^ 0xffffffff) == -1) {
                                        float f_61_ = ((((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aFloatArray5838[0]) * f_44_ + f_43_ * (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloatArray5838[1]) + ((((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloatArray5838[2]) * f_45_));
                                        f_61_ = ((f_56_ > 0.0F ? (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloat5840) : (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloat5846)) * f_56_ + (((ha_Sub2) (((s_Sub2) this).aHa_Sub2_7960)).aFloat5878));
                                        int i_62_ = i_59_ >> 159437584 & 0xff;
                                        int i_63_ = (0xff1f & i_59_) >> 1635091624;
                                        int i_64_ = 0xff & i_59_;
                                        i_62_ *= f_61_;
                                        if (i_62_ >= 0) {
                                            if ((i_62_ ^ 0xffffffff) < -256)
                                                i_62_ = 255;
                                        } else
                                            i_62_ = 0;
                                        i_63_ *= f_61_;
                                        i_64_ *= f_61_;
                                        if ((i_63_ ^ 0xffffffff) > -1)
                                            i_63_ = 0;
                                        else if (i_63_ > 255)
                                            i_63_ = 255;
                                        if ((i_64_ ^ 0xffffffff) <= -1) {
                                            if (i_64_ > 255)
                                                i_64_ = 255;
                                        } else
                                            i_64_ = 0;
                                        i_59_ = i_64_ | (i_63_ << -1962023288 | i_62_ << 1599878000);
                                    }
                                } else
                                    i_59_ = i_42_;
                                if (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aBoolean5872) {
                                    stream.a((float) i_32_);
                                    stream.a((float) (this.method3150((byte) 121, i_32_, i_33_) - -i_38_));
                                    stream.a((float) i_33_);
                                    stream.f((byte) (i_59_ >> 325874448));
                                    stream.f((byte) (i_59_ >> 214801608));
                                    stream.f((byte) i_59_);
                                    stream.f(-1);
                                    stream.a((float) i_32_);
                                    stream.a((float) i_33_);
                                    if (anIntArrayArrayArray7950 != null)
                                        stream.a((float) (is_11_ != null ? -1 + is_11_[i_31_] : 0));
                                    if ((0x7 & ((s_Sub2) this).anInt7963 ^ 0xffffffff) != -1) {
                                        stream.a(f_44_);
                                        stream.a(f_43_);
                                        stream.a(f_45_);
                                    }
                                } else {
                                    stream.b((float) i_32_);
                                    stream.b((float) (i_38_ + this.method3150((byte) 108, i_32_, i_33_)));
                                    stream.b((float) i_33_);
                                    stream.f((byte) (i_59_ >> -1081525104));
                                    stream.f((byte) (i_59_ >> -1549242264));
                                    stream.f((byte) i_59_);
                                    stream.f(-1);
                                    stream.b((float) i_32_);
                                    stream.b((float) i_33_);
                                    if (anIntArrayArrayArray7950 != null)
                                        stream.b((float) (is_11_ != null ? -1 + is_11_[i_31_] : 0));
                                    if ((0x7 & ((s_Sub2) this).anInt7963 ^ 0xffffffff) != -1) {
                                        stream.b(f_44_);
                                        stream.b(f_43_);
                                        stream.b(f_45_);
                                    }
                                }
                                i_58_ = anInt7957++;
                                is_30_[i_31_] = (short) i_58_;
                                if ((i_36_ ^ 0xffffffff) != 0)
                                    class248_sub1s[i_58_] = class248_sub1s_5_[i_31_];
                                class65.method509(-1, new Node_Sub3(is_30_[i_31_]), l);
                            } else {
                                is_30_[i_31_] = ((Node_Sub3) (Node_Sub3) node).aShort6828;
                                i_58_ = is_30_[i_31_] & 0xffff;
                                if (i_36_ != -1 && ((((Node) class248_sub1s_5_[i_31_]).id) < (((Node) class248_sub1s[i_58_]).id)))
                                    class248_sub1s[i_58_] = class248_sub1s_5_[i_31_];
                            }
                            for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (i_27_ ^ 0xffffffff); i_65_++)
                                class248_sub1s_2_[i_65_].method1975(i_58_, 57, i_41_, f_56_, i_42_);
                            anInt7961++;
                        }
                    }
                }
            }
            for (int i_66_ = 0; i_66_ < anInt7957; i_66_++) {
                Node_Sub1 class248_sub1 = class248_sub1s[i_66_];
                if (class248_sub1 != null)
                    class248_sub1.method1977(i_66_, 3);
            }
            for (int i_67_ = 0; (((s) this).anInt3468 ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
                for (int i_68_ = 0; ((i_68_ ^ 0xffffffff) > (((s) this).anInt3472 ^ 0xffffffff)); i_68_++) {
                    short[] is_69_ = (((s_Sub2) this).aShortArrayArray7954[i_67_ + ((s) this).anInt3468 * i_68_]);
                    if (is_69_ != null) {
                        int i_70_ = 0;
                        int i_71_ = 0;
                        while (is_69_.length > i_71_) {
                            int i_72_ = 0xffff & is_69_[i_71_++];
                            int i_73_ = is_69_[i_71_++] & 0xffff;
                            int i_74_ = is_69_[i_71_++] & 0xffff;
                            Node_Sub1 class248_sub1 = class248_sub1s[i_72_];
                            Node_Sub1 class248_sub1_75_ = class248_sub1s[i_73_];
                            Node_Sub1 class248_sub1_76_ = class248_sub1s[i_74_];
                            Node_Sub1 class248_sub1_77_ = null;
                            if (class248_sub1 != null) {
                                class248_sub1_77_ = class248_sub1;
                                class248_sub1.method1969(i_68_, i_70_, i_67_, false);
                            }
                            if (class248_sub1_75_ != null) {
                                class248_sub1_75_.method1969(i_68_, i_70_, i_67_, false);
                                if (class248_sub1_77_ == null || ((((Node) class248_sub1_77_).id) > (((Node) class248_sub1_75_).id)))
                                    class248_sub1_77_ = class248_sub1_75_;
                            }
                            if (class248_sub1_76_ != null) {
                                class248_sub1_76_.method1969(i_68_, i_70_, i_67_, false);
                                if (class248_sub1_77_ == null || ((((Node) class248_sub1_77_).id) > (((Node) class248_sub1_76_).id)))
                                    class248_sub1_77_ = class248_sub1_76_;
                            }
                            if (class248_sub1_77_ != null) {
                                if (class248_sub1 != null)
                                    class248_sub1_77_.method1977(i_72_, 3);
                                if (class248_sub1_75_ != null)
                                    class248_sub1_77_.method1977(i_73_, 3);
                                if (class248_sub1_76_ != null)
                                    class248_sub1_77_.method1977(i_74_, 3);
                                class248_sub1_77_.method1969(i_68_, i_70_, i_67_, false);
                            }
                            i_70_++;
                        }
                    }
                }
            }
            stream.a();
            anInterface6_7973 = ((s_Sub2) this).aHa_Sub2_7960.method905(false, i, -82, nativeheapbuffer, stream.c());
            ((s_Sub2) this).aClass140_7977 = new Class140(anInterface6_7973, 5126, 3, 0);
            aClass140_7971 = new Class140(anInterface6_7973, 5121, 4, 12);
            int i_78_;
            if (anIntArrayArrayArray7950 != null) {
                ((s_Sub2) this).aClass140_7969 = new Class140(anInterface6_7973, 5126, 3, 16);
                i_78_ = 28;
            } else {
                i_78_ = 24;
                ((s_Sub2) this).aClass140_7969 = new Class140(anInterface6_7973, 5126, 2, 16);
            }
            if ((((s_Sub2) this).anInt7963 & 0x7) != 0)
                ((s_Sub2) this).aClass140_7968 = new Class140(anInterface6_7973, 5126, 3, i_78_);
            long[] ls = new long[aClass248_Sub1Array7979.length];
            for (int i_79_ = 0; ((aClass248_Sub1Array7979.length ^ 0xffffffff) < (i_79_ ^ 0xffffffff)); i_79_++) {
                Node_Sub1 class248_sub1 = aClass248_Sub1Array7979[i_79_];
                ls[i_79_] = ((Node) class248_sub1).id;
                class248_sub1.method1972((byte) 112, anInt7957);
            }
            Class347.method3723(ls, aClass248_Sub1Array7979, false);
            if (aClass155_7964 != null)
                aClass155_7964.method1369(1);
        }
        anInt7931++;
        anIntArrayArrayArray7953 = null;
        ((s_Sub2) this).anIntArrayArrayArray7939 = ((s_Sub2) this).anIntArrayArrayArray7934 = null;
        aFloatArrayArray7975 = aFloatArrayArray7974 = aFloatArrayArray7978 = null;
        aClass248_Sub1ArrayArrayArray7937 = null;
        anIntArrayArrayArray7950 = null;
        anIntArrayArrayArray7965 = null;
        aByteArrayArray7972 = null;
        ((s_Sub2) this).anIntArrayArrayArray7945 = null;
        aClass65_7976 = null;
    }

    final void method3142(int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, boolean[][] bools) {
        anInt7940++;
        if ((anInt7970 ^ 0xffffffff) < -1) {
            ((s_Sub2) this).aHa_Sub2_7960.method884((byte) -14);
            ((s_Sub2) this).aHa_Sub2_7960.method899(2286, false);
            ((s_Sub2) this).aHa_Sub2_7960.method878(false, -100);
            ((s_Sub2) this).aHa_Sub2_7960.method913(false, 0);
            ((s_Sub2) this).aHa_Sub2_7960.method870(34, false);
            ((s_Sub2) this).aHa_Sub2_7960.method885(0, 0);
            ((s_Sub2) this).aHa_Sub2_7960.method882(-2, (byte) 114);
            ((s_Sub2) this).aHa_Sub2_7960.method889(-2, null);
            Class323.aFloatArray3808[13] = 1.0F - (((float) (i_81_ * i_85_) / 128.0F + (float) (i_80_ * 2)) / (float) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5597));
            Class323.aFloatArray3808[2] = 0.0F;
            Class323.aFloatArray3808[0] = ((float) i_81_ / ((float) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5696) * (128.0F * (float) ((s) this).anInt3465)));
            Class323.aFloatArray3808[1] = 0.0F;
            Class323.aFloatArray3808[15] = 1.0F;
            Class323.aFloatArray3808[7] = 0.0F;
            Class323.aFloatArray3808[12] = -1.0F - (((float) (i_82_ * i_81_) / 128.0F - (float) (2 * i)) / (float) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5696));
            Class323.aFloatArray3808[8] = 0.0F;
            Class323.aFloatArray3808[9] = 0.0F;
            Class323.aFloatArray3808[4] = 0.0F;
            Class323.aFloatArray3808[14] = 0.0F;
            Class323.aFloatArray3808[11] = 0.0F;
            Class323.aFloatArray3808[10] = 0.0F;
            Class323.aFloatArray3808[6] = 0.0F;
            Class323.aFloatArray3808[5] = ((float) i_81_ / ((float) ((s) this).anInt3465 * 128.0F * (float) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5597)));
            Class323.aFloatArray3808[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(Class323.aFloatArray3808, 0);
            Class323.aFloatArray3808[13] = 0.0F;
            Class323.aFloatArray3808[14] = 0.0F;
            Class323.aFloatArray3808[7] = 0.0F;
            Class323.aFloatArray3808[8] = 0.0F;
            Class323.aFloatArray3808[9] = 1.0F;
            Class323.aFloatArray3808[12] = 0.0F;
            Class323.aFloatArray3808[6] = 1.0F;
            Class323.aFloatArray3808[3] = 0.0F;
            Class323.aFloatArray3808[0] = 1.0F;
            Class323.aFloatArray3808[2] = 0.0F;
            Class323.aFloatArray3808[11] = 0.0F;
            Class323.aFloatArray3808[10] = 0.0F;
            Class323.aFloatArray3808[15] = 1.0F;
            Class323.aFloatArray3808[4] = 0.0F;
            Class323.aFloatArray3808[1] = 0.0F;
            Class323.aFloatArray3808[5] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(Class323.aFloatArray3808, 0);
            if ((((s_Sub2) this).anInt7963 & 0x7) != 0) {
                ((s_Sub2) this).aHa_Sub2_7960.method878(true, -109);
                ((s_Sub2) this).aHa_Sub2_7960.method855(0);
            } else
                ((s_Sub2) this).aHa_Sub2_7960.method878(false, -113);
            ((s_Sub2) this).aHa_Sub2_7960.method843(32886, ((s_Sub2) this).aClass140_7969, ((s_Sub2) this).aClass140_7977, ((s_Sub2) this).aClass140_7968, aClass140_7971);
            if ((2 * anInt7961 ^ 0xffffffff) >= (((ByteStream) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass248_Sub9_Sub1_5845)).buffer.length ^ 0xffffffff))
                ((ByteStream) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass248_Sub9_Sub1_5845)).offset = 0;
            else
                ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass248_Sub9_Sub1_5845 = new Node_Sub9_Sub1(2 * anInt7961);
            int i_86_ = 0;
            Node_Sub9_Sub1 class248_sub9_sub1 = (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass248_Sub9_Sub1_5845);
            if (!((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aBoolean5872) {
                for (int i_87_ = i_83_; (i_85_ ^ 0xffffffff) < (i_87_ ^ 0xffffffff); i_87_++) {
                    int i_88_ = ((s) this).anInt3468 * i_87_ - -i_82_;
                    for (int i_89_ = i_82_; (i_89_ ^ 0xffffffff) > (i_84_ ^ 0xffffffff); i_89_++) {
                        if (bools[-i_82_ + i_89_][-i_83_ + i_87_]) {
                            short[] is = ((s_Sub2) this).aShortArrayArray7954[i_88_];
                            if (is != null) {
                                for (int i_90_ = 0; is.length > i_90_; i_90_++) {
                                    class248_sub9_sub1.writeLEShort_(0xffff & is[i_90_], 17);
                                    i_86_++;
                                }
                            }
                        }
                        i_88_++;
                    }
                }
            } else {
                for (int i_91_ = i_83_; i_85_ > i_91_; i_91_++) {
                    int i_92_ = i_82_ + i_91_ * ((s) this).anInt3468;
                    for (int i_93_ = i_82_; (i_84_ ^ 0xffffffff) < (i_93_ ^ 0xffffffff); i_93_++) {
                        if (bools[-i_82_ + i_93_][i_91_ + -i_83_]) {
                            short[] is = ((s_Sub2) this).aShortArrayArray7954[i_92_];
                            if (is != null) {
                                for (int i_94_ = 0; is.length > i_94_; i_94_++) {
                                    i_86_++;
                                    class248_sub9_sub1.writeShort(1182, is[i_94_] & 0xffff);
                                }
                            }
                        }
                        i_92_++;
                    }
                }
            }
            if ((i_86_ ^ 0xffffffff) < -1) {
                Class349_Sub2 class349_sub2 = new Class349_Sub2(((s_Sub2) this).aHa_Sub2_7960, 5123, (((ByteStream) class248_sub9_sub1).buffer), (((ByteStream) class248_sub9_sub1).offset));
                ((s_Sub2) this).aHa_Sub2_7960.method897(class349_sub2, 0, (byte) -88, 4, i_86_);
            }
        }
    }

    public static void method3159(byte i) {
        aClass285_7962 = null;
        int i_95_ = 59 % ((-33 - i) / 61);
        aClass339_7951 = null;
    }

    static final void method3160(boolean bool) {
        anInt7935++;
        if (Class312.aBoolean3640) {
            if (bool != false)
                method3160(true);
            while ((Class64.aClass147_Sub1Array869.length ^ 0xffffffff) < (Class374.anInt4597 ^ 0xffffffff)) {
                Class147_Sub1 class147_sub1 = Class64.aClass147_Sub1Array869[Class374.anInt4597];
                if (class147_sub1 == null || (((Class147_Sub1) class147_sub1).anInt6288 ^ 0xffffffff) != 0)
                    Class374.anInt4597++;
                else {
                    if (Node_Sub8_Sub12.aClass248_Sub43_9015 == null)
                        Node_Sub8_Sub12.aClass248_Sub43_9015 = (Class346_Sub7_Sub4_Sub2.aClass333_10174.method3412(((Class147_Sub1) class147_sub1).aString6284, -23210));
                    int i = (((Node_Sub43) Node_Sub8_Sub12.aClass248_Sub43_9015).anInt7305);
                    if (i == -1)
                        break;
                    Node_Sub8_Sub12.aClass248_Sub43_9015 = null;
                    Class374.anInt4597++;
                    ((Class147_Sub1) class147_sub1).anInt6288 = i;
                }
            }
        }
    }

    final r fa(int i, int i_96_, r var_r) {
        anInt7956++;
        if ((0x1 & aByteArrayArray7941[i][i_96_]) == 0)
            return null;
        int i_97_ = (((s) this).anInt3465 >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        r_Sub1 var_r_Sub1_98_;
        if (var_r_Sub1 != null && var_r_Sub1.method2110(i_97_, -1, i_97_)) {
            var_r_Sub1_98_ = var_r_Sub1;
            var_r_Sub1_98_.method2108(true);
        } else
            var_r_Sub1_98_ = new r_Sub1(((s_Sub2) this).aHa_Sub2_7960, i_97_, i_97_);
        var_r_Sub1_98_.method2109(i_97_, 0, -121, i_97_, 0);
        method3162(var_r_Sub1_98_, i_96_, -123, i);
        return var_r_Sub1_98_;
    }

    final void method3141(Node_Sub42 class248_sub42, int[] is) {
        anInt7949++;
        aClass293_7952.method3109(new Node_Sub46((((s_Sub2) this).aHa_Sub2_7960), this, class248_sub42, is), -97);
    }

    private final void method3161(boolean bool, boolean bool_99_, int i, int i_100_, boolean[][] bools, int i_101_, int i_102_, int i_103_) {
        if (bool_99_ == true) {
            if (aClass248_Sub1Array7979 != null) {
                int i_104_ = i_101_ - -i_101_ + 1;
                i_104_ *= i_104_;
                if (((((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5948).length ^ 0xffffffff) > (i_104_ ^ 0xffffffff))
                    ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5948 = new int[i_104_];
                if ((((ByteStream) (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass248_Sub9_Sub1_5845)).buffer.length ^ 0xffffffff) > (2 * anInt7961 ^ 0xffffffff))
                    ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass248_Sub9_Sub1_5845 = new Node_Sub9_Sub1(2 * anInt7961);
                int i_105_ = i_103_ - i_101_;
                int i_106_ = i_105_;
                if ((i_105_ ^ 0xffffffff) > -1)
                    i_105_ = 0;
                int i_107_ = -i_101_ + i_100_;
                int i_108_ = i_107_;
                if (i_107_ < 0)
                    i_107_ = 0;
                int i_109_ = i_101_ + i_103_;
                if ((i_109_ ^ 0xffffffff) < (((s) this).anInt3468 + -1 ^ 0xffffffff))
                    i_109_ = -1 + ((s) this).anInt3468;
                int i_110_ = i_100_ - -i_101_;
                if (i_110_ > ((s) this).anInt3472 + -1)
                    i_110_ = -1 + ((s) this).anInt3472;
                int i_111_ = 0;
                int[] is = ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5948;
                for (int i_112_ = i_105_; i_109_ >= i_112_; i_112_++) {
                    boolean[] bools_113_ = bools[i_112_ - i_106_];
                    for (int i_114_ = i_107_; (i_110_ ^ 0xffffffff) <= (i_114_ ^ 0xffffffff); i_114_++) {
                        if (bools_113_[i_114_ - i_108_])
                            is[i_111_++] = i_112_ + i_114_ * ((s) this).anInt3468;
                    }
                }
                if (i == -1)
                    ((s_Sub2) this).aHa_Sub2_7960.method863(-1);
                else {
                    ((s_Sub2) this).aHa_Sub2_7960.method867((float) i, false);
                    ((s_Sub2) this).aHa_Sub2_7960.method854(-112);
                }
                ((s_Sub2) this).aHa_Sub2_7960.method878((((s_Sub2) this).anInt7963 & 0x7) != 0, -127);
                for (int i_115_ = 0; ((i_115_ ^ 0xffffffff) > (aClass248_Sub1Array7979.length ^ 0xffffffff)); i_115_++)
                    aClass248_Sub1Array7979[i_115_].method1970(i_111_, 126, is);
                if (!aClass293_7952.method3115(false)) {
                    int i_116_ = ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5879;
                    int i_117_ = ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5921;
                    ((s_Sub2) this).aHa_Sub2_7960.L(0, i_117_, ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5882);
                    ((s_Sub2) this).aHa_Sub2_7960.method878(false, -112);
                    ((s_Sub2) this).aHa_Sub2_7960.method870(107, false);
                    ((s_Sub2) this).aHa_Sub2_7960.method885(0, 128);
                    ((s_Sub2) this).aHa_Sub2_7960.method882(-2, (byte) 98);
                    ((s_Sub2) this).aHa_Sub2_7960.method889(-2, (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).aClass136_Sub4_5889));
                    ((s_Sub2) this).aHa_Sub2_7960.method858(11, 7681, 8448);
                    ((s_Sub2) this).aHa_Sub2_7960.method911(770, 34166, 0, (byte) 4);
                    ((s_Sub2) this).aHa_Sub2_7960.method849(0, 770, (byte) 37, 34167);
                    for (Node node = aClass293_7952.method3119(2); node != null; node = aClass293_7952.method3107(-128)) {
                        Node_Sub46 class248_sub46 = (Node_Sub46) node;
                        class248_sub46.method2656(i_101_, true, i_100_, i_103_, bools);
                    }
                    ((s_Sub2) this).aHa_Sub2_7960.method911(768, 5890, 0, (byte) 4);
                    ((s_Sub2) this).aHa_Sub2_7960.method849(0, 770, (byte) 37, 5890);
                    ((s_Sub2) this).aHa_Sub2_7960.method889(-2, null);
                    ((s_Sub2) this).aHa_Sub2_7960.L(i_116_, i_117_, ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5882);
                }
                if (aClass155_7964 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    ((s_Sub2) this).aHa_Sub2_7960.method843(32886, ((s_Sub2) this).aClass140_7969, ((s_Sub2) this).aClass140_7977, null, null);
                    aClass155_7964.method1370(0, bools, i_101_, bool, i_100_, i_103_);
                    OpenGL.glPopMatrix();
                }
            }
            anInt7958++;
        }
    }

    final void ka(int i, int i_118_, int i_119_) {
        anInt7947++;
        if ((aByteArrayArray7972[i][i_118_] & 0xff) < i_119_)
            aByteArrayArray7972[i][i_118_] = (byte) i_119_;
    }

    final boolean method3143(r var_r, int i, int i_120_, int i_121_, int i_122_, boolean bool) {
        anInt7929++;
        if (aClass155_7964 == null || var_r == null)
            return false;
        int i_123_ = (-(i_120_ * ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5862 >> 1568558312) + i >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
        int i_124_ = (-(i_120_ * ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5935 >> -964382296) + i_121_ >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
        return aClass155_7964.method1367(i_123_, -26332, i_124_, var_r);
    }

    final void method3148(int i, int i_125_) {
        anInt7942++;
    }

    final void U(int i, int i_126_, int[] is, int[] is_127_, int[] is_128_, int[] is_129_, int[] is_130_, int[] is_131_, int[] is_132_, int[] is_133_, int i_134_, int i_135_, int i_136_, boolean bool) {
        anInt7930++;
        d var_d = ((ha) ((s_Sub2) this).aHa_Sub2_7960).aD1414;
        if (is_127_ != null && anIntArrayArrayArray7953 == null)
            anIntArrayArrayArray7953 = new int[((s) this).anInt3468][((s) this).anInt3472][];
        if (is_129_ != null && anIntArrayArrayArray7950 == null)
            anIntArrayArrayArray7950 = new int[((s) this).anInt3468][((s) this).anInt3472][];
        ((s_Sub2) this).anIntArrayArrayArray7939[i][i_126_] = is;
        ((s_Sub2) this).anIntArrayArrayArray7934[i][i_126_] = is_128_;
        ((s_Sub2) this).anIntArrayArrayArray7945[i][i_126_] = is_130_;
        anIntArrayArrayArray7965[i][i_126_] = is_131_;
        if (anIntArrayArrayArray7950 != null)
            anIntArrayArrayArray7950[i][i_126_] = is_129_;
        if (anIntArrayArrayArray7953 != null)
            anIntArrayArrayArray7953[i][i_126_] = is_127_;
        Node_Sub1[] class248_sub1s = (aClass248_Sub1ArrayArrayArray7937[i][i_126_] = new Node_Sub1[is_130_.length]);
        for (int i_137_ = 0; (is_130_.length ^ 0xffffffff) < (i_137_ ^ 0xffffffff); i_137_++) {
            int i_138_ = is_132_[i_137_];
            int i_139_ = is_133_[i_137_];
            if ((0x20 & ((s_Sub2) this).anInt7963 ^ 0xffffffff) != -1 && (i_138_ ^ 0xffffffff) != 0 && (((Class312) var_d.method25(i_138_, (byte) 124)).aBoolean3622)) {
                i_139_ = 128;
                i_138_ = -1;
            }
            long l = ((long) (i_139_ << 1614685422) | ((long) i_134_ << -781632292 | ((long) i_136_ << -1290465040 | (long) i_135_ << -623217494)) | (long) i_138_);
            Node node;
            for (node = aClass65_7976.method501(l, (byte) 31); node != null; node = aClass65_7976.method507((byte) 76)) {
                Node_Sub1 class248_sub1 = (Node_Sub1) node;
                if (((((Node_Sub1) class248_sub1).anInt6813 ^ 0xffffffff) == (i_138_ ^ 0xffffffff)) && (((Node_Sub1) class248_sub1).aFloat6812 == (float) i_139_) && ((i_134_ ^ 0xffffffff) == (((Node_Sub1) class248_sub1).anInt6811 ^ 0xffffffff)) && ((Node_Sub1) class248_sub1).anInt6800 == i_135_ && (((Node_Sub1) class248_sub1).anInt6808 ^ 0xffffffff) == (i_136_ ^ 0xffffffff))
                    break;
            }
            if (node != null)
                class248_sub1s[i_137_] = (Node_Sub1) node;
            else {
                class248_sub1s[i_137_] = new Node_Sub1(this, i_138_, i_139_, i_134_, i_135_, i_136_);
                aClass65_7976.method509(-1, class248_sub1s[i_137_], l);
            }
        }
        if (bool)
            aByteArrayArray7941[i][i_126_] = (byte) Class358.retrieveLooksSettings(aByteArrayArray7941[i][i_126_], 1);
        if ((is_130_.length ^ 0xffffffff) < (anInt7967 ^ 0xffffffff))
            anInt7967 = is_130_.length;
        anInt7970 += is_130_.length;
    }

    s_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_140_, int i_141_, int i_142_, int[][] is, int[][] is_143_, int i_144_) {
        super(i_141_, i_142_, i_144_, is);
        ((s_Sub2) this).aHa_Sub2_7960 = var_ha_Sub2;
        anInt7932 = ((s) this).anInt3466 + -2;
        anIntArrayArrayArray7953 = new int[i_141_][i_142_][];
        anInt7966 = 1 << anInt7932;
        ((s_Sub2) this).aShortArrayArray7954 = new short[i_141_ * i_142_][];
        anIntArrayArrayArray7965 = new int[i_141_][i_142_][];
        ((s_Sub2) this).anIntArrayArrayArray7945 = new int[i_141_][i_142_][];
        ((s_Sub2) this).anInt7963 = i_140_;
        aFloatArrayArray7978 = new float[((s) this).anInt3468 - -1][((s) this).anInt3472 + 1];
        aByteArrayArray7941 = new byte[i_141_][i_142_];
        aByteArrayArray7972 = new byte[i_141_ - -1][1 + i_142_];
        ((s_Sub2) this).anIntArrayArrayArray7934 = new int[i_141_][i_142_][];
        ((s_Sub2) this).anIntArrayArrayArray7939 = new int[i_141_][i_142_][];
        aClass248_Sub1ArrayArrayArray7937 = new Node_Sub1[i_141_][i_142_][];
        aFloatArrayArray7974 = new float[1 + ((s) this).anInt3468][((s) this).anInt3472 + 1];
        aFloatArrayArray7975 = new float[1 + ((s) this).anInt3468][((s) this).anInt3472 + 1];
        for (int i_145_ = 1; (i_145_ ^ 0xffffffff) > (((s) this).anInt3472 ^ 0xffffffff); i_145_++) {
            for (int i_146_ = 1; ((s) this).anInt3468 > i_146_; i_146_++) {
                int i_147_ = (-is_143_[i_146_ + -1][i_145_] + is_143_[1 + i_146_][i_145_]);
                int i_148_ = (is_143_[i_146_][1 + i_145_] + -is_143_[i_146_][i_145_ + -1]);
                float f = (float) (1.0 / Math.sqrt((double) (i_144_ * (i_144_ * 4) + i_147_ * i_147_ + i_148_ * i_148_)));
                aFloatArrayArray7975[i_146_][i_145_] = f * (float) i_147_;
                aFloatArrayArray7974[i_146_][i_145_] = f * (float) (2 * -i_144_);
                aFloatArrayArray7978[i_146_][i_145_] = f * (float) i_148_;
            }
        }
        aClass65_7976 = new Class65(128);
        if ((0x10 & ((s_Sub2) this).anInt7963) != 0)
            aClass155_7964 = new Class155(((s_Sub2) this).aHa_Sub2_7960, this);
    }

    final void CA(r var_r, int i, int i_149_, int i_150_, int i_151_, boolean bool) {
        anInt7948++;
        if (aClass155_7964 != null && var_r != null) {
            int i_152_ = (-((i_149_ * ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5862) >> 1376769768) + i >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
            int i_153_ = (-((i_149_ * ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5935) >> 1610851304) + i_150_ >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
            aClass155_7964.method1368(var_r, i_152_, 1, i_153_);
        }
    }

    final void method3149(int i, int i_154_, int i_155_, boolean[][] bools, boolean bool, int i_156_) {
        method3161(bool, true, -1, i_154_, bools, i_155_, i_156_, i);
        anInt7936++;
    }

    final void wa(r var_r, int i, int i_157_, int i_158_, int i_159_, boolean bool) {
        anInt7959++;
        if (aClass155_7964 != null && var_r != null) {
            int i_160_ = (i + -(i_157_ * (((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5862) >> -2131365144) >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
            int i_161_ = (-((i_157_ * ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5935) >> -49922712) + i_158_ >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
            aClass155_7964.method1366(var_r, false, i_161_, i_160_);
        }
    }

    private final void method3162(r_Sub1 var_r_Sub1, int i, int i_162_, int i_163_) {
        anInt7933++;
        int[] is = ((s_Sub2) this).anIntArrayArrayArray7939[i_163_][i];
        int[] is_164_ = ((s_Sub2) this).anIntArrayArrayArray7934[i_163_][i];
        int i_165_ = is.length;
        if ((((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5950.length ^ 0xffffffff) > (i_165_ ^ 0xffffffff)) {
            ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5947 = new int[i_165_];
            ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5950 = new int[i_165_];
        }
        int[] is_166_ = ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5950;
        int[] is_167_ = ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anIntArray5947;
        if (i_162_ > -109)
            method3140(-118, -32, null, null, null, null, null, null, null, null, null, null, null, 112, 71, -5, true);
        for (int i_168_ = 0; (i_168_ ^ 0xffffffff) > (i_165_ ^ 0xffffffff); i_168_++) {
            is_166_[i_168_] = (is[i_168_] >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
            is_167_[i_168_] = (is_164_[i_168_] >> ((ha_Sub2) ((s_Sub2) this).aHa_Sub2_7960).anInt5798);
        }
        int i_169_ = 0;
        while ((i_165_ ^ 0xffffffff) < (i_169_ ^ 0xffffffff)) {
            int i_170_ = is_166_[i_169_];
            int i_171_ = is_167_[i_169_++];
            int i_172_ = is_166_[i_169_];
            int i_173_ = is_167_[i_169_++];
            int i_174_ = is_166_[i_169_];
            int i_175_ = is_167_[i_169_++];
            if (((-i_172_ + i_170_) * (-i_175_ + i_173_) + -((-i_171_ + i_173_) * (i_174_ - i_172_))) > 0)
                var_r_Sub1.method2107(i_172_, i_171_, -2745, i_170_, i_175_, i_174_, i_173_);
        }
    }

    final void method3140(int i, int i_176_, int[] is, int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_, int[] is_183_, int[] is_184_, int[] is_185_, int[] is_186_, int i_187_, int i_188_, int i_189_, boolean bool) {
        anInt7943++;
        int i_190_ = is_183_.length;
        int[] is_191_ = new int[i_190_ * 3];
        int[] is_192_ = new int[i_190_ * 3];
        int[] is_193_ = new int[i_190_ * 3];
        int[] is_194_ = new int[3 * i_190_];
        int[] is_195_ = new int[3 * i_190_];
        int[] is_196_ = new int[i_190_ * 3];
        int[] is_197_ = is_177_ == null ? null : new int[i_190_ * 3];
        int[] is_198_ = is_179_ != null ? new int[i_190_ * 3] : null;
        int i_199_ = 0;
        for (int i_200_ = 0; (i_200_ ^ 0xffffffff) > (i_190_ ^ 0xffffffff); i_200_++) {
            int i_201_ = is_180_[i_200_];
            int i_202_ = is_181_[i_200_];
            int i_203_ = is_182_[i_200_];
            is_191_[i_199_] = is[i_201_];
            is_192_[i_199_] = is_178_[i_201_];
            is_193_[i_199_] = is_183_[i_200_];
            is_195_[i_199_] = is_185_[i_200_];
            is_196_[i_199_] = is_186_[i_200_];
            is_194_[i_199_] = is_184_ != null ? is_184_[i_200_] : is_183_[i_200_];
            if (is_177_ != null)
                is_197_[i_199_] = is_177_[i_201_];
            if (is_179_ != null)
                is_198_[i_199_] = is_179_[i_201_];
            i_199_++;
            is_191_[i_199_] = is[i_202_];
            is_192_[i_199_] = is_178_[i_202_];
            is_193_[i_199_] = is_183_[i_200_];
            is_195_[i_199_] = is_185_[i_200_];
            is_196_[i_199_] = is_186_[i_200_];
            is_194_[i_199_] = is_184_ == null ? is_183_[i_200_] : is_184_[i_200_];
            if (is_177_ != null)
                is_197_[i_199_] = is_177_[i_202_];
            if (is_179_ != null)
                is_198_[i_199_] = is_179_[i_202_];
            i_199_++;
            is_191_[i_199_] = is[i_203_];
            is_192_[i_199_] = is_178_[i_203_];
            is_193_[i_199_] = is_183_[i_200_];
            is_195_[i_199_] = is_185_[i_200_];
            is_196_[i_199_] = is_186_[i_200_];
            is_194_[i_199_] = is_184_ != null ? is_184_[i_200_] : is_183_[i_200_];
            if (is_177_ != null)
                is_197_[i_199_] = is_177_[i_203_];
            if (is_179_ != null)
                is_198_[i_199_] = is_179_[i_203_];
            i_199_++;
        }
        U(i, i_176_, is_191_, is_197_, is_192_, is_198_, is_193_, is_194_, is_195_, is_196_, i_187_, i_188_, i_189_, bool);
    }

    final void method3144(int i, int i_204_, int i_205_, boolean[][] bools, boolean bool, int i_206_, int i_207_) {
        anInt7938++;
        method3161(bool, true, i_206_, i_204_, bools, i_205_, i_207_, i);
    }

    static {
        aClass339_7951 = new Class339("LIVE", "", "", 0);
    }
}
