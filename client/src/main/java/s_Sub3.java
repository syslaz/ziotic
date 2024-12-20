/* s_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class s_Sub3 extends s {
    private int[][][] anIntArrayArrayArray7980;
    static int anInt7981;
    private int anInt7982;
    ha_Sub3 aHa_Sub3_7983;
    private Class293 aClass293_7984;
    private int anInt7985;
    private int anInt7986;
    static int anInt7987;
    static int anInt7988;
    static int anInt7989;
    short[][] aShortArrayArray7990;
    private int[][][] anIntArrayArrayArray7991;
    private float aFloat7992;
    static int anInt7993;
    int[][][] anIntArrayArrayArray7994;
    private float aFloat7995 = -3.4028235E38F;
    private int[][][] anIntArrayArrayArray7996;
    static int anInt7997;
    static int anInt7998;
    static int anInt7999;
    static int anInt8000;
    static int anInt8001;
    private int anInt8002;
    int[][][] anIntArrayArrayArray8003;
    static int anInt8004;
    int[][][] anIntArrayArrayArray8005;
    static int anInt8006;
    static int anInt8007;
    static int anInt8008;
    static int anInt8009;
    static int anInt8010;
    private byte[][] aByteArrayArray8011;
    static int anInt8012;
    static int[] anIntArray8013 = new int[2];
    static int anInt8014;
    private Class283 aClass283_8015;
    int anInt8016;
    private Node_Sub21[][][] aClass248_Sub21ArrayArrayArray8017;
    static int anInt8018;
    Class185 aClass185_8019;
    private Interface18_Impl1 anInterface18_Impl1_8020;
    private Node_Sub21[] aClass248_Sub21Array8021;
    private float[][] aFloatArrayArray8022;
    private float[][] aFloatArrayArray8023;
    private float[][] aFloatArrayArray8024;
    private int anInt8025;
    private Class65 aClass65_8026;
    static int anInt8027;
    private Interface18_Impl1 anInterface18_Impl1_8028;
    private byte[][] aByteArrayArray8029;
    private int anInt8030;

    static final void method3163(int i) {
        if (i >= -6)
            method3167(42);
        Class84_Sub2.aClass278_5381.method2872((byte) -78);
        anInt8009++;
    }

    final void method3144(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_, int i_3_) {
        method3166(i_2_, i_1_, i, i_0_, bool, bools, 21933, i_3_);
        anInt7987++;
    }

    final void method3148(int i, int i_4_) {
        anInt8001++;
    }

    final void wa(r var_r, int i, int i_5_, int i_6_, int i_7_, boolean bool) {
        anInt7998++;
        if (aClass283_8015 != null && var_r != null) {
            int i_8_ = (-(((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6210 * i_5_ >> 50730472) + i >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
            int i_9_ = (-(i_5_ * ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6176 >> 1371091016) + i_6_ >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
            aClass283_8015.method3053(1, var_r, i_8_, i_9_);
        }
    }

    final void method3141(Node_Sub42 class248_sub42, int[] is) {
        aClass293_7984.method3109(new Node_Sub18((((s_Sub3) this).aHa_Sub3_7983), this, class248_sub42, is), -106);
        anInt8012++;
    }

    final void YA() {
        anInt7988++;
        if ((anInt8025 ^ 0xffffffff) >= -1)
            aClass283_8015 = null;
        else {
            byte[][] is = new byte[1 + ((s) this).anInt3468][((s) this).anInt3472 + 1];
            for (int i = 1; (((s) this).anInt3468 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                for (int i_10_ = 1; i_10_ < ((s) this).anInt3472; i_10_++)
                    is[i][i_10_] = (byte) ((aByteArrayArray8029[i][1 + i_10_] >> -1020679773) + ((aByteArrayArray8029[i][-1 + i_10_] >> 1245703970) + (aByteArrayArray8029[-1 + i][i_10_] >> -1922703454) + ((aByteArrayArray8029[1 + i][i_10_] >> 1147721283) + (aByteArrayArray8029[i][i_10_] >> -516824607))));
            }
            Node_Sub21[] class248_sub21s = new Node_Sub21[aClass65_8026.method513((byte) 32)];
            aClass65_8026.method508(class248_sub21s, true);
            for (int i = 0; (i ^ 0xffffffff) > (class248_sub21s.length ^ 0xffffffff); i++)
                class248_sub21s[i].method2531(anInt8025, (byte) 16);
            int i = 20;
            if (anIntArrayArrayArray7996 != null)
                i += 4;
            if ((((s_Sub3) this).anInt8016 & 0x7) != 0)
                i += 12;
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).aNativeHeap6059.a(4 * anInt8025, false);
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_11_ = ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).aNativeHeap6059.a(i * anInt8025, false);
            Stream stream = new Stream(nativeheapbuffer_11_);
            Stream stream_12_ = new Stream(nativeheapbuffer);
            Node_Sub21[] class248_sub21s_13_ = new Node_Sub21[anInt8025];
            int i_14_ = Class44_Sub1.method318(27690, anInt8025 / 4);
            if ((i_14_ ^ 0xffffffff) > -2)
                i_14_ = 1;
            Class65 class65 = new Class65(i_14_);
            Node_Sub21[] class248_sub21s_15_ = new Node_Sub21[anInt8030];
            for (int i_16_ = 0; (((s) this).anInt3468 ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
                for (int i_17_ = 0; ((s) this).anInt3472 > i_17_; i_17_++) {
                    if (((s_Sub3) this).anIntArrayArrayArray8005[i_16_][i_17_] != null) {
                        Node_Sub21[] class248_sub21s_18_ = aClass248_Sub21ArrayArrayArray8017[i_16_][i_17_];
                        int[] is_19_ = (((s_Sub3) this).anIntArrayArrayArray7994[i_16_][i_17_]);
                        int[] is_20_ = (((s_Sub3) this).anIntArrayArrayArray8003[i_16_][i_17_]);
                        int[] is_21_ = anIntArrayArrayArray7980[i_16_][i_17_];
                        int[] is_22_ = (((s_Sub3) this).anIntArrayArrayArray8005[i_16_][i_17_]);
                        int[] is_23_ = (anIntArrayArrayArray7991 == null ? null : anIntArrayArrayArray7991[i_16_][i_17_]);
                        int[] is_24_ = (anIntArrayArrayArray7996 != null ? anIntArrayArrayArray7996[i_16_][i_17_] : null);
                        if (is_21_ == null)
                            is_21_ = is_22_;
                        float f = aFloatArrayArray8022[i_16_][i_17_];
                        float f_25_ = aFloatArrayArray8023[i_16_][i_17_];
                        float f_26_ = aFloatArrayArray8024[i_16_][i_17_];
                        float f_27_ = aFloatArrayArray8022[i_16_][1 + i_17_];
                        float f_28_ = aFloatArrayArray8023[i_16_][1 + i_17_];
                        float f_29_ = aFloatArrayArray8024[i_16_][1 + i_17_];
                        float f_30_ = aFloatArrayArray8022[i_16_ - -1][1 + i_17_];
                        float f_31_ = aFloatArrayArray8023[1 + i_16_][1 + i_17_];
                        float f_32_ = aFloatArrayArray8024[1 + i_16_][i_17_ + 1];
                        float f_33_ = aFloatArrayArray8022[1 + i_16_][i_17_];
                        float f_34_ = aFloatArrayArray8023[1 + i_16_][i_17_];
                        float f_35_ = aFloatArrayArray8024[i_16_ - -1][i_17_];
                        int i_36_ = 0xff & is[i_16_][i_17_];
                        int i_37_ = 0xff & is[i_16_][1 + i_17_];
                        int i_38_ = is[1 + i_16_][i_17_ - -1] & 0xff;
                        int i_39_ = 0xff & is[1 + i_16_][i_17_];
                        int i_40_ = 0;
                        while_220_:
                        for (int i_41_ = 0; ((is_22_.length ^ 0xffffffff) < (i_41_ ^ 0xffffffff)); i_41_++) {
                            Node_Sub21 class248_sub21 = class248_sub21s_18_[i_41_];
                            for (int i_42_ = 0; (i_40_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++) {
                                if (class248_sub21 == class248_sub21s_15_[i_42_])
                                    continue while_220_;
                            }
                            class248_sub21s_15_[i_40_++] = class248_sub21;
                        }
                        short[] is_43_ = (((s_Sub3) this).aShortArrayArray7990[i_16_ + ((s) this).anInt3468 * i_17_] = new short[is_22_.length]);
                        for (int i_44_ = 0; ((is_22_.length ^ 0xffffffff) < (i_44_ ^ 0xffffffff)); i_44_++) {
                            int i_45_ = ((i_16_ << ((s) this).anInt3466) - -is_19_[i_44_]);
                            int i_46_ = ((i_17_ << ((s) this).anInt3466) - -is_20_[i_44_]);
                            int i_47_ = i_45_ >> anInt7982;
                            int i_48_ = i_46_ >> anInt7982;
                            int i_49_ = is_22_[i_44_];
                            int i_50_ = is_21_[i_44_];
                            int i_51_ = is_23_ != null ? is_23_[i_44_] : 0;
                            long l = ((long) (i_47_ << 1018103248) | ((long) i_49_ << -1115057184 | (long) i_50_ << -926371728) | (long) i_48_);
                            int i_52_ = is_19_[i_44_];
                            int i_53_ = is_20_[i_44_];
                            int i_54_ = 74;
                            int i_55_ = 0;
                            float f_56_;
                            float f_57_;
                            float f_58_;
                            if (i_52_ == 0 && i_53_ == 0) {
                                f_57_ = f_26_;
                                i_54_ -= i_36_;
                                f_58_ = f_25_;
                                f_56_ = f;
                            } else if (i_52_ != 0 || ((s) this).anInt3465 != i_53_) {
                                if (((((s) this).anInt3465 ^ 0xffffffff) == (i_52_ ^ 0xffffffff)) && ((((s) this).anInt3465 ^ 0xffffffff) == (i_53_ ^ 0xffffffff))) {
                                    i_54_ -= i_38_;
                                    f_56_ = f_30_;
                                    f_57_ = f_32_;
                                    f_58_ = f_31_;
                                } else if (((s) this).anInt3465 == i_52_ && (i_53_ ^ 0xffffffff) == -1) {
                                    f_57_ = f_35_;
                                    f_58_ = f_34_;
                                    f_56_ = f_33_;
                                    i_54_ -= i_39_;
                                } else {
                                    float f_59_ = ((float) i_52_ / (float) ((s) this).anInt3465);
                                    float f_60_ = ((float) i_53_ / (float) ((s) this).anInt3465);
                                    float f_61_ = f + (f_33_ - f) * f_59_;
                                    float f_62_ = f_25_ + (-f_25_ + f_34_) * f_59_;
                                    float f_63_ = (f_35_ - f_26_) * f_59_ + f_26_;
                                    float f_64_ = (-f_27_ + f_30_) * f_59_ + f_27_;
                                    float f_65_ = f_59_ * (f_31_ - f_28_) + f_28_;
                                    f_56_ = f_60_ * (f_64_ - f_61_) + f_61_;
                                    f_58_ = f_60_ * (-f_62_ + f_65_) + f_62_;
                                    float f_66_ = (f_32_ - f_29_) * f_59_ + f_29_;
                                    f_57_ = f_63_ + (-f_63_ + f_66_) * f_60_;
                                    int i_67_ = (((-i_36_ + i_39_) * i_52_ >> ((s) this).anInt3466) + i_36_);
                                    int i_68_ = ((i_52_ * (-i_37_ + i_38_) >> ((s) this).anInt3466) + i_37_);
                                    i_54_ -= ((i_68_ - i_67_) * i_53_ >> ((s) this).anInt3466) + i_67_;
                                }
                            } else {
                                f_56_ = f_27_;
                                i_54_ -= i_37_;
                                f_57_ = f_29_;
                                f_58_ = f_28_;
                            }
                            float f_69_ = 1.0F;
                            if ((i_49_ ^ 0xffffffff) != 0) {
                                int i_70_ = i_54_ * (i_49_ & 0x7f) >> 844289639;
                                if ((i_70_ ^ 0xffffffff) <= -3) {
                                    if ((i_70_ ^ 0xffffffff) < -127)
                                        i_70_ = 126;
                                } else
                                    i_70_ = 2;
                                i_55_ = (Node_Sub14_Sub39.anIntArray9600[i_49_ & 0xff80 | i_70_]);
                                if ((((s_Sub3) this).anInt8016 & 0x7 ^ 0xffffffff) == -1) {
                                    f_69_ = ((f_58_ * (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloatArray6182[1])) + (f_56_ * (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloatArray6182[0])) + (f_57_ * (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloatArray6182[2])));
                                    f_69_ = ((((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).aFloat6170) + (f_69_ > 0.0F ? (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloat6244) : (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloat6249)) * f_69_);
                                }
                            }
                            Node node = null;
                            if ((i_45_ & -1 + anInt8002) == 0 && (i_46_ & anInt8002 + -1 ^ 0xffffffff) == -1)
                                node = class65.method501(l, (byte) 31);
                            int i_71_;
                            if (node == null) {
                                int i_72_;
                                if ((i_49_ ^ 0xffffffff) == (i_50_ ^ 0xffffffff))
                                    i_72_ = i_55_;
                                else {
                                    int i_73_ = i_54_ * (i_50_ & 0x7f) >> 619087655;
                                    if (i_73_ < 2)
                                        i_73_ = 2;
                                    else if ((i_73_ ^ 0xffffffff) < -127)
                                        i_73_ = 126;
                                    i_72_ = (Node_Sub14_Sub39.anIntArray9600[i_73_ | i_50_ & 0xff80]);
                                    if ((0x7 & ((s_Sub3) this).anInt8016) == 0) {
                                        float f_74_ = ((f_57_ * (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloatArray6182[2])) + ((((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloatArray6182[0]) * f_56_ + f_58_ * (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloatArray6182[1])));
                                        f_74_ = ((((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).aFloat6170) + f_69_ * (!(f_69_ > 0.0F) ? (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloat6249) : (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).aFloat6244)));
                                        int i_75_ = 0xff & i_72_ >> -1535856176;
                                        int i_76_ = 0xff & i_72_ >> -569237592;
                                        i_75_ *= f_74_;
                                        int i_77_ = i_72_ & 0xff;
                                        i_76_ *= f_74_;
                                        if ((i_75_ ^ 0xffffffff) > -1)
                                            i_75_ = 0;
                                        else if (i_75_ > 255)
                                            i_75_ = 255;
                                        if (i_76_ >= 0) {
                                            if (i_76_ > 255)
                                                i_76_ = 255;
                                        } else
                                            i_76_ = 0;
                                        i_77_ *= f_74_;
                                        if ((i_77_ ^ 0xffffffff) <= -1) {
                                            if ((i_77_ ^ 0xffffffff) < -256)
                                                i_77_ = 255;
                                        } else
                                            i_77_ = 0;
                                        i_72_ = (i_75_ << 817354128 | i_76_ << 326208456 | i_77_);
                                    }
                                }
                                if (!Stream.b()) {
                                    stream.b((float) i_45_);
                                    stream.b((float) (i_51_ + this.method3150((byte) 97, i_45_, i_46_)));
                                    stream.b((float) i_46_);
                                    stream.b((float) i_45_);
                                    stream.b((float) i_46_);
                                    if (anIntArrayArrayArray7996 != null)
                                        stream.b((float) (is_24_ == null ? 0 : (is_24_[i_44_] + -1)));
                                    if ((((s_Sub3) this).anInt8016 & 0x7 ^ 0xffffffff) != -1) {
                                        stream.b(f_56_);
                                        stream.b(f_58_);
                                        stream.b(f_57_);
                                    }
                                } else {
                                    stream.a((float) i_45_);
                                    stream.a((float) (i_51_ + this.method3150((byte) 110, i_45_, i_46_)));
                                    stream.a((float) i_46_);
                                    stream.a((float) i_45_);
                                    stream.a((float) i_46_);
                                    if (anIntArrayArrayArray7996 != null)
                                        stream.a((float) (is_24_ != null ? -1 + is_24_[i_44_] : 0));
                                    if ((0x7 & ((s_Sub3) this).anInt8016) != 0) {
                                        stream.a(f_56_);
                                        stream.a(f_58_);
                                        stream.a(f_57_);
                                    }
                                }
                                if ((((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6251) != 0)
                                    stream_12_.c(i_72_ | ~0xffffff);
                                else
                                    stream_12_.a(~0xffffff | i_72_);
                                i_71_ = anInt7985++;
                                is_43_[i_44_] = (short) i_71_;
                                if ((i_49_ ^ 0xffffffff) != 0)
                                    class248_sub21s_13_[i_71_] = class248_sub21s_18_[i_44_];
                                class65.method509(-1, new Node_Sub3(is_43_[i_44_]), l);
                            } else {
                                is_43_[i_44_] = ((Node_Sub3) (Node_Sub3) node).aShort6828;
                                i_71_ = 0xffff & is_43_[i_44_];
                                if (i_49_ != -1 && ((((Node) class248_sub21s_13_[i_71_]).id ^ 0xffffffffffffffffL) < (((Node) (class248_sub21s_18_[i_44_])).id ^ 0xffffffffffffffffL)))
                                    class248_sub21s_13_[i_71_] = class248_sub21s_18_[i_44_];
                            }
                            for (int i_78_ = 0; i_40_ > i_78_; i_78_++)
                                class248_sub21s_15_[i_78_].method2530(i_71_, i_54_, f_69_, i_55_, (byte) -126);
                            anInt7986++;
                        }
                    }
                }
            }
            for (int i_79_ = 0; anInt7985 > i_79_; i_79_++) {
                Node_Sub21 class248_sub21 = class248_sub21s_13_[i_79_];
                if (class248_sub21 != null)
                    class248_sub21.method2532(i_79_, -19730);
            }
            for (int i_80_ = 0; (((s) this).anInt3468 ^ 0xffffffff) < (i_80_ ^ 0xffffffff); i_80_++) {
                for (int i_81_ = 0; ((s) this).anInt3472 > i_81_; i_81_++) {
                    short[] is_82_ = (((s_Sub3) this).aShortArrayArray7990[i_81_ * ((s) this).anInt3468 + i_80_]);
                    if (is_82_ != null) {
                        int i_83_ = 0;
                        int i_84_ = 0;
                        while ((is_82_.length ^ 0xffffffff) < (i_84_ ^ 0xffffffff)) {
                            int i_85_ = 0xffff & is_82_[i_84_++];
                            int i_86_ = is_82_[i_84_++] & 0xffff;
                            int i_87_ = is_82_[i_84_++] & 0xffff;
                            Node_Sub21 class248_sub21 = class248_sub21s_13_[i_85_];
                            Node_Sub21 class248_sub21_88_ = class248_sub21s_13_[i_86_];
                            Node_Sub21 class248_sub21_89_ = class248_sub21s_13_[i_87_];
                            Node_Sub21 class248_sub21_90_ = null;
                            if (class248_sub21 != null) {
                                class248_sub21.method2526(i_80_, i_81_, 14278, i_83_);
                                class248_sub21_90_ = class248_sub21;
                            }
                            if (class248_sub21_88_ != null) {
                                class248_sub21_88_.method2526(i_80_, i_81_, 14278, i_83_);
                                if (class248_sub21_90_ == null || ((((Node) class248_sub21_88_).id) < (((Node) class248_sub21_90_).id)))
                                    class248_sub21_90_ = class248_sub21_88_;
                            }
                            if (class248_sub21_89_ != null) {
                                class248_sub21_89_.method2526(i_80_, i_81_, 14278, i_83_);
                                if (class248_sub21_90_ == null || ((((Node) class248_sub21_90_).id) > (((Node) class248_sub21_89_).id)))
                                    class248_sub21_90_ = class248_sub21_89_;
                            }
                            if (class248_sub21_90_ != null) {
                                if (class248_sub21 != null)
                                    class248_sub21_90_.method2532(i_85_, -19730);
                                if (class248_sub21_88_ != null)
                                    class248_sub21_90_.method2532(i_86_, -19730);
                                if (class248_sub21_89_ != null)
                                    class248_sub21_90_.method2532(i_87_, -19730);
                                class248_sub21_90_.method2526(i_80_, i_81_, 14278, i_83_);
                            }
                            i_83_++;
                        }
                    }
                }
            }
            stream.a();
            stream_12_.a();
            anInterface18_Impl1_8028 = ((s_Sub3) this).aHa_Sub3_7983.method1010(101, false);
            anInterface18_Impl1_8028.method5(anInt7985 * 4, nativeheapbuffer, 24689, 4);
            anInterface18_Impl1_8020 = ((s_Sub3) this).aHa_Sub3_7983.method1010(41, false);
            anInterface18_Impl1_8020.method5(anInt7985 * i, nativeheapbuffer_11_, 24689, i);
            if ((((s_Sub3) this).anInt8016 & 0x7) == 0) {
                if (anIntArrayArrayArray7996 == null)
                    ((s_Sub3) this).aClass185_8019 = (((s_Sub3) this).aHa_Sub3_7983.method1005((byte) 30, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1101}), new Class194(Class89.aClass89_1099)})));
                else
                    ((s_Sub3) this).aClass185_8019 = (((s_Sub3) this).aHa_Sub3_7983.method1005((byte) -121, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1101, Class89.aClass89_1100}), new Class194(Class89.aClass89_1099)})));
            } else if (anIntArrayArrayArray7996 != null)
                ((s_Sub3) this).aClass185_8019 = (((s_Sub3) this).aHa_Sub3_7983.method1005((byte) 64, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1101, Class89.aClass89_1100, Class89.aClass89_1098}), new Class194(Class89.aClass89_1099)})));
            else
                ((s_Sub3) this).aClass185_8019 = (((s_Sub3) this).aHa_Sub3_7983.method1005((byte) -6, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1101, Class89.aClass89_1098}), new Class194(Class89.aClass89_1099)})));
            int i_91_ = 0;
            for (int i_92_ = 0; class248_sub21s.length > i_92_; i_92_++) {
                if (((Node_Sub21) class248_sub21s[i_92_]).anInt7055 > 0)
                    class248_sub21s[i_91_++] = class248_sub21s[i_92_];
            }
            aClass248_Sub21Array8021 = new Node_Sub21[i_91_];
            long[] ls = new long[i_91_];
            for (int i_93_ = 0; i_91_ > i_93_; i_93_++) {
                Node_Sub21 class248_sub21 = class248_sub21s[i_93_];
                ls[i_93_] = ((Node) class248_sub21).id;
                aClass248_Sub21Array8021[i_93_] = class248_sub21;
                class248_sub21.method2533(anInt7985, 4);
            }
            Class347.method3723(ls, aClass248_Sub21Array8021, false);
            if (aClass283_8015 != null)
                aClass283_8015.method3060((byte) 96);
        }
        aClass248_Sub21ArrayArrayArray8017 = null;
        anIntArrayArrayArray7996 = null;
        aFloatArrayArray8022 = aFloatArrayArray8023 = aFloatArrayArray8024 = null;
        aByteArrayArray8029 = null;
        anIntArrayArrayArray7980 = null;
        ((s_Sub3) this).anIntArrayArrayArray7994 = ((s_Sub3) this).anIntArrayArrayArray8003 = null;
        ((s_Sub3) this).anIntArrayArrayArray8005 = null;
        anIntArrayArrayArray7991 = null;
        aClass65_8026 = null;
    }

    final r fa(int i, int i_94_, r var_r) {
        anInt8014++;
        if ((aByteArrayArray8011[i][i_94_] & 0x1) == 0)
            return null;
        int i_95_ = (((s) this).anInt3465 >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        r_Sub2 var_r_Sub2_96_;
        if (var_r_Sub2 != null && var_r_Sub2.method2113(i_95_, -126, i_95_)) {
            var_r_Sub2_96_ = var_r_Sub2;
            var_r_Sub2_96_.method2119(125);
        } else
            var_r_Sub2_96_ = new r_Sub2(((s_Sub3) this).aHa_Sub3_7983, i_95_, i_95_);
        var_r_Sub2_96_.method2121(i_95_, 0, -18573, i_95_, 0);
        method3165(i, (byte) -18, i_94_, var_r_Sub2_96_);
        return var_r_Sub2_96_;
    }

    static final void method3164(boolean bool) {
        if (bool != true)
            method3167(-11);
        if (Class264.anIntArray2992 == null || Class21.anIntArray317 == null) {
            Class264.anIntArray2992 = new int[256];
            Class21.anIntArray317 = new int[256];
            for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
                double d = (double) i / 255.0 * 6.283185307179586;
                Class264.anIntArray2992[i] = (int) (4096.0 * Math.sin(d));
                Class21.anIntArray317[i] = (int) (Math.cos(d) * 4096.0);
            }
        }
        anInt7989++;
    }

    final void method3142(int i, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, boolean[][] bools) {
        anInt8004++;
        if (anInt8025 > 0) {
            Interface18_Impl2 interface18_impl2 = ((s_Sub3) this).aHa_Sub3_7983.method961((byte) -105, anInt7986);
            int i_103_ = 0;
            int i_104_ = 32767;
            int i_105_ = -32768;
            for (int i_106_ = 0; i_106_ < 4; i_106_++) {
                i_103_ = 0;
                Buffer buffer = interface18_impl2.method47(30907, true);
                if (buffer != null) {
                    Stream stream = ((s_Sub3) this).aHa_Sub3_7983.method926((byte) -20, buffer);
                    if (Stream.b()) {
                        for (int i_107_ = i_100_; i_102_ > i_107_; i_107_++) {
                            int i_108_ = i_99_ + i_107_ * ((s) this).anInt3468;
                            for (int i_109_ = i_99_; i_101_ > i_109_; i_109_++) {
                                if (bools[-i_99_ + i_109_][-i_100_ + i_107_]) {
                                    short[] is = (((s_Sub3) this).aShortArrayArray7990[i_108_]);
                                    if (is != null) {
                                        for (int i_110_ = 0; i_110_ < is.length; i_110_++) {
                                            int i_111_ = 0xffff & is[i_110_];
                                            i_103_++;
                                            if (i_104_ > i_111_)
                                                i_104_ = i_111_;
                                            if (i_105_ < i_111_)
                                                i_105_ = i_111_;
                                            stream.b(i_111_);
                                        }
                                    }
                                }
                                i_108_++;
                            }
                        }
                    } else {
                        for (int i_112_ = i_100_; i_112_ < i_102_; i_112_++) {
                            int i_113_ = i_99_ + i_112_ * ((s) this).anInt3468;
                            for (int i_114_ = i_99_; i_114_ < i_101_; i_114_++) {
                                if (bools[-i_99_ + i_114_][-i_100_ + i_112_]) {
                                    short[] is = (((s_Sub3) this).aShortArrayArray7990[i_113_]);
                                    if (is != null) {
                                        for (int i_115_ = 0; ((i_115_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_115_++) {
                                            int i_116_ = 0xffff & is[i_115_];
                                            if ((i_105_ ^ 0xffffffff) > (i_116_ ^ 0xffffffff))
                                                i_105_ = i_116_;
                                            if ((i_104_ ^ 0xffffffff) < (i_116_ ^ 0xffffffff))
                                                i_104_ = i_116_;
                                            stream.d(i_116_);
                                            i_103_++;
                                        }
                                    }
                                }
                                i_113_++;
                            }
                        }
                    }
                    stream.a();
                    if (interface18_impl2.method50(-17694))
                        break;
                }
            }
            if (i_103_ > 0) {
                ((s_Sub3) this).aHa_Sub3_7983.method998(-23496);
                ((s_Sub3) this).aHa_Sub3_7983.method994(11073, false);
                ((s_Sub3) this).aHa_Sub3_7983.method923(false, -8043);
                ((s_Sub3) this).aHa_Sub3_7983.method1029(false, 23394);
                ((s_Sub3) this).aHa_Sub3_7983.method950((byte) 36, false);
                ((s_Sub3) this).aHa_Sub3_7983.method942(-129, 0);
                ((s_Sub3) this).aHa_Sub3_7983.method962(-2, 4, false, false);
                ((s_Sub3) this).aHa_Sub3_7983.method929(null, -8423);
                Class238_Sub2 class238_sub2 = ((s_Sub3) this).aHa_Sub3_7983.method952(-24720);
                float[] fs = ((s_Sub3) this).aHa_Sub3_7983.method1009(118);
                fs[5] = ((float) i_98_ / ((float) (((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt5955) * ((float) ((s) this).anInt3465 * 128.0F)));
                fs[2] = 0.0F;
                fs[1] = 0.0F;
                fs[10] = 1.0F / (-aFloat7992 + aFloat7995);
                fs[0] = ((float) i_98_ / ((float) ((s) this).anInt3465 * 128.0F * (float) (((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt5986)));
                fs[15] = 1.0F;
                fs[11] = 0.0F;
                fs[6] = 0.0F;
                fs[4] = 0.0F;
                fs[8] = 0.0F;
                fs[9] = 0.0F;
                fs[7] = 0.0F;
                fs[3] = 0.0F;
                fs[12] = (-1.0F - (((float) (i_99_ * i_98_) / 128.0F - (float) (i * 2)) / (float) (((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt5986)));
                fs[14] = -aFloat7992 / (aFloat7995 - aFloat7992);
                fs[13] = -(((float) (i_102_ * i_98_) / 128.0F + (float) (2 * i_97_)) / (float) (((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt5955)) + 1.0F;
                class238_sub2.method1891(1.0F, 0.0F, 0.0F, 1.0F, -120, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                ((s_Sub3) this).aHa_Sub3_7983.method1025(6);
                ((s_Sub3) this).aHa_Sub3_7983.method948(121);
                if ((((s_Sub3) this).anInt8016 & 0x7 ^ 0xffffffff) != -1) {
                    ((s_Sub3) this).aHa_Sub3_7983.method923(true, -8043);
                    ((s_Sub3) this).aHa_Sub3_7983.method965((byte) -124);
                } else
                    ((s_Sub3) this).aHa_Sub3_7983.method923(false, -8043);
                ((s_Sub3) this).aHa_Sub3_7983.method1000(false, -122);
                ((s_Sub3) this).aHa_Sub3_7983.method931(0, 8, anInterface18_Impl1_8020);
                ((s_Sub3) this).aHa_Sub3_7983.method931(1, 8, anInterface18_Impl1_8028);
                ((s_Sub3) this).aHa_Sub3_7983.method1004(((s_Sub3) this).aClass185_8019, (byte) -15);
                ((s_Sub3) this).aHa_Sub3_7983.method1006(interface18_impl2, OutputStream_Sub1.aClass14_86, i_103_ / 3, 0, i_105_ - (i_104_ + -1), i_104_, -229);
                ((s_Sub3) this).aHa_Sub3_7983.method1000(true, -128);
            }
        }
    }

    final boolean method3143(r var_r, int i, int i_117_, int i_118_, int i_119_, boolean bool) {
        anInt8027++;
        if (aClass283_8015 == null || var_r == null)
            return false;
        int i_120_ = (-(((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6210 * i_117_ >> -1291298552) + i >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
        int i_121_ = (i_118_ + -(i_117_ * (((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6176) >> 1365006600) >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
        return aClass283_8015.method3051((byte) 95, i_121_, var_r, i_120_);
    }

    private final void method3165(int i, byte i_122_, int i_123_, r_Sub2 var_r_Sub2) {
        anInt7999++;
        int[] is = ((s_Sub3) this).anIntArrayArrayArray7994[i][i_123_];
        int[] is_124_ = ((s_Sub3) this).anIntArrayArrayArray8003[i][i_123_];
        int i_125_ = is.length;
        if (i_125_ > RSInterface.anIntArray6857.length) {
            RSInterface.anIntArray6857 = new int[i_125_];
            Class212.anIntArray2450 = new int[i_125_];
        }
        if (i_122_ > -5)
            anInt7982 = 68;
        for (int i_126_ = 0; (i_125_ ^ 0xffffffff) < (i_126_ ^ 0xffffffff); i_126_++) {
            RSInterface.anIntArray6857[i_126_] = (is[i_126_] >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
            Class212.anIntArray2450[i_126_] = (is_124_[i_126_] >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
        }
        int i_127_ = 0;
        while (i_127_ < i_125_) {
            int i_128_ = RSInterface.anIntArray6857[i_127_];
            int i_129_ = Class212.anIntArray2450[i_127_++];
            int i_130_ = RSInterface.anIntArray6857[i_127_];
            int i_131_ = Class212.anIntArray2450[i_127_++];
            int i_132_ = RSInterface.anIntArray6857[i_127_];
            int i_133_ = Class212.anIntArray2450[i_127_++];
            if (((-((i_131_ + -i_129_) * (i_132_ - i_130_)) + (-i_133_ + i_131_) * (i_128_ + -i_130_)) ^ 0xffffffff) < -1)
                var_r_Sub2.method2118(i_128_, i_130_, 4, i_131_, i_133_, i_129_, i_132_);
        }
    }

    final void method3140(int i, int i_134_, int[] is, int[] is_135_, int[] is_136_, int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_, int[] is_141_, int[] is_142_, int[] is_143_, int[] is_144_, int i_145_, int i_146_, int i_147_, boolean bool) {
        anInt7981++;
        int i_148_ = is_141_.length;
        int[] is_149_ = new int[3 * i_148_];
        int[] is_150_ = new int[3 * i_148_];
        int[] is_151_ = new int[3 * i_148_];
        int[] is_152_ = new int[i_148_ * 3];
        int[] is_153_ = new int[i_148_ * 3];
        int[] is_154_ = new int[3 * i_148_];
        int[] is_155_ = is_135_ == null ? null : new int[3 * i_148_];
        int[] is_156_ = is_137_ != null ? new int[i_148_ * 3] : null;
        int i_157_ = 0;
        for (int i_158_ = 0; (i_158_ ^ 0xffffffff) > (i_148_ ^ 0xffffffff); i_158_++) {
            int i_159_ = is_138_[i_158_];
            int i_160_ = is_139_[i_158_];
            int i_161_ = is_140_[i_158_];
            is_149_[i_157_] = is[i_159_];
            is_150_[i_157_] = is_136_[i_159_];
            is_151_[i_157_] = is_141_[i_158_];
            is_153_[i_157_] = is_143_[i_158_];
            is_154_[i_157_] = is_144_[i_158_];
            is_152_[i_157_] = is_142_ != null ? is_142_[i_158_] : is_141_[i_158_];
            if (is_135_ != null)
                is_155_[i_157_] = is_135_[i_159_];
            if (is_137_ != null)
                is_156_[i_157_] = is_137_[i_159_];
            i_157_++;
            is_149_[i_157_] = is[i_160_];
            is_150_[i_157_] = is_136_[i_160_];
            is_151_[i_157_] = is_141_[i_158_];
            is_153_[i_157_] = is_143_[i_158_];
            is_154_[i_157_] = is_144_[i_158_];
            is_152_[i_157_] = is_142_ != null ? is_142_[i_158_] : is_141_[i_158_];
            if (is_135_ != null)
                is_155_[i_157_] = is_135_[i_160_];
            if (is_137_ != null)
                is_156_[i_157_] = is_137_[i_160_];
            i_157_++;
            is_149_[i_157_] = is[i_161_];
            is_150_[i_157_] = is_136_[i_161_];
            is_151_[i_157_] = is_141_[i_158_];
            is_153_[i_157_] = is_143_[i_158_];
            is_154_[i_157_] = is_144_[i_158_];
            is_152_[i_157_] = is_142_ == null ? is_141_[i_158_] : is_142_[i_158_];
            if (is_135_ != null)
                is_155_[i_157_] = is_135_[i_161_];
            if (is_137_ != null)
                is_156_[i_157_] = is_137_[i_161_];
            i_157_++;
        }
        U(i, i_134_, is_149_, is_155_, is_150_, is_156_, is_151_, is_152_, is_153_, is_154_, i_145_, i_146_, i_147_, bool);
    }

    final void method3149(int i, int i_162_, int i_163_, boolean[][] bools, boolean bool, int i_164_) {
        method3166(-1, i_163_, i, i_162_, bool, bools, 21933, i_164_);
        anInt8010++;
    }

    final void U(int i, int i_165_, int[] is, int[] is_166_, int[] is_167_, int[] is_168_, int[] is_169_, int[] is_170_, int[] is_171_, int[] is_172_, int i_173_, int i_174_, int i_175_, boolean bool) {
        anInt8007++;
        if (is_166_ != null && anIntArrayArrayArray7991 == null)
            anIntArrayArrayArray7991 = new int[((s) this).anInt3468][((s) this).anInt3472][];
        d var_d = ((ha) ((s_Sub3) this).aHa_Sub3_7983).aD1414;
        if (is_168_ != null && anIntArrayArrayArray7996 == null)
            anIntArrayArrayArray7996 = new int[((s) this).anInt3468][((s) this).anInt3472][];
        ((s_Sub3) this).anIntArrayArrayArray7994[i][i_165_] = is;
        ((s_Sub3) this).anIntArrayArrayArray8003[i][i_165_] = is_167_;
        ((s_Sub3) this).anIntArrayArrayArray8005[i][i_165_] = is_169_;
        anIntArrayArrayArray7980[i][i_165_] = is_170_;
        if (anIntArrayArrayArray7996 != null)
            anIntArrayArrayArray7996[i][i_165_] = is_168_;
        if (anIntArrayArrayArray7991 != null)
            anIntArrayArrayArray7991[i][i_165_] = is_166_;
        Node_Sub21[] class248_sub21s = (aClass248_Sub21ArrayArrayArray8017[i][i_165_] = new Node_Sub21[is_169_.length]);
        for (int i_176_ = 0; (i_176_ ^ 0xffffffff) > (is_169_.length ^ 0xffffffff); i_176_++) {
            int i_177_ = is_171_[i_176_];
            int i_178_ = is_172_[i_176_];
            if ((((s_Sub3) this).anInt8016 & 0x20 ^ 0xffffffff) != -1 && (i_177_ ^ 0xffffffff) != 0 && (((Class312) var_d.method25(i_177_, (byte) 125)).aBoolean3622)) {
                i_178_ = 128;
                i_177_ = -1;
            }
            long l = ((long) i_174_ << -1250998934 | (long) i_175_ << -1908603920 | (long) i_173_ << -352672292 | (long) (i_178_ << 706558670) | (long) i_177_);
            Node node;
            for (node = aClass65_8026.method501(l, (byte) 31); node != null; node = aClass65_8026.method507((byte) -126)) {
                Node_Sub21 class248_sub21 = (Node_Sub21) node;
                if (((((Node_Sub21) class248_sub21).anInt7061 ^ 0xffffffff) == (i_177_ ^ 0xffffffff)) && (((Node_Sub21) class248_sub21).aFloat7064 == (float) i_178_) && i_173_ == ((Node_Sub21) class248_sub21).anInt7070 && (((Node_Sub21) class248_sub21).anInt7050 ^ 0xffffffff) == (i_174_ ^ 0xffffffff) && ((Node_Sub21) class248_sub21).anInt7068 == i_175_)
                    break;
            }
            if (node != null)
                class248_sub21s[i_176_] = (Node_Sub21) node;
            else {
                class248_sub21s[i_176_] = new Node_Sub21(this, i_177_, i_178_, i_173_, i_174_, i_175_);
                aClass65_8026.method509(-1, class248_sub21s[i_176_], l);
            }
        }
        if (bool)
            aByteArrayArray8011[i][i_165_] = (byte) Class358.retrieveLooksSettings(aByteArrayArray8011[i][i_165_], 1);
        if (is_169_.length > anInt8030)
            anInt8030 = is_169_.length;
        anInt8025 += is_169_.length;
    }

    private final void method3166(int i, int i_179_, int i_180_, int i_181_, boolean bool, boolean[][] bools, int i_182_, int i_183_) {
        if (aClass248_Sub21Array8021 != null) {
            int i_184_ = 1 + (i_179_ - -i_179_);
            i_184_ *= i_184_;
            if ((Node_Sub14_Sub4.anIntArray9190.length ^ 0xffffffff) > (i_184_ ^ 0xffffffff))
                Node_Sub14_Sub4.anIntArray9190 = new int[i_184_];
            int i_185_ = -i_179_ + i_180_;
            int i_186_ = i_185_;
            if ((i_185_ ^ 0xffffffff) > -1)
                i_185_ = 0;
            int i_187_ = -i_179_ + i_181_;
            int i_188_ = i_187_;
            if ((i_187_ ^ 0xffffffff) > -1)
                i_187_ = 0;
            int i_189_ = i_179_ + i_180_;
            if (i_189_ > -1 + ((s) this).anInt3468)
                i_189_ = -1 + ((s) this).anInt3468;
            int i_190_ = i_181_ + i_179_;
            if (i_190_ > -1 + ((s) this).anInt3472)
                i_190_ = ((s) this).anInt3472 - 1;
            Player.anInt10557 = 0;
            for (int i_191_ = i_185_; i_189_ >= i_191_; i_191_++) {
                boolean[] bools_192_ = bools[-i_186_ + i_191_];
                for (int i_193_ = i_187_; i_190_ >= i_193_; i_193_++) {
                    if (bools_192_[i_193_ - i_188_])
                        Node_Sub14_Sub4.anIntArray9190[Player.anInt10557++] = i_193_ * ((s) this).anInt3468 + i_191_;
                }
            }
            if (i != -1) {
                ((s_Sub3) this).aHa_Sub3_7983.method977((float) i, -93);
                ((s_Sub3) this).aHa_Sub3_7983.method1052((byte) -80);
            } else
                ((s_Sub3) this).aHa_Sub3_7983.method1050((byte) -77);
            ((s_Sub3) this).aHa_Sub3_7983.method1003(22551);
            ((s_Sub3) this).aHa_Sub3_7983.method923((0x7 & ((s_Sub3) this).anInt8016) != 0, -8043);
            ((s_Sub3) this).aHa_Sub3_7983.method962(-1, 118, false, false);
            ((s_Sub3) this).aHa_Sub3_7983.method931(0, 8, anInterface18_Impl1_8020);
            for (int i_194_ = 0; ((aClass248_Sub21Array8021.length ^ 0xffffffff) < (i_194_ ^ 0xffffffff)); i_194_++)
                aClass248_Sub21Array8021[i_194_].method2529(Player.anInt10557, (byte) 8, Node_Sub14_Sub4.anIntArray9190);
            Class238_Sub2 class238_sub2 = ((s_Sub3) this).aHa_Sub3_7983.method952(-24720);
            class238_sub2.method1859(0, -1, 0);
            ((s_Sub3) this).aHa_Sub3_7983.method948(124);
            if (!aClass293_7984.method3115(false)) {
                int i_195_ = ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6214;
                int i_196_ = ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6158;
                ((s_Sub3) this).aHa_Sub3_7983.L(0, i_196_, (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).anInt6223));
                ((s_Sub3) this).aHa_Sub3_7983.method923(false, -8043);
                ((s_Sub3) this).aHa_Sub3_7983.method950((byte) 36, false);
                ((s_Sub3) this).aHa_Sub3_7983.method942(-129, 128);
                ((s_Sub3) this).aHa_Sub3_7983.method962(-2, 95, false, false);
                ((s_Sub3) this).aHa_Sub3_7983.method929((((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).anInterface21_6237), -8423);
                ((s_Sub3) this).aHa_Sub3_7983.method955((byte) 122, Class142.aClass5_1669, Class60.aClass5_821);
                ((s_Sub3) this).aHa_Sub3_7983.method946(0, -79, Class380.aClass280_4649);
                ((s_Sub3) this).aHa_Sub3_7983.method951(Class282_Sub2.aClass280_7605, (byte) 97, 0);
                for (Node node = aClass293_7984.method3119(2); node != null; node = aClass293_7984.method3107(i_182_ ^ ~0x55d2)) {
                    Node_Sub18 class248_sub18 = (Node_Sub18) node;
                    class248_sub18.method2514(i_180_, bools, i_181_, i_182_ ^ ~0x55de, i_179_);
                }
                ((s_Sub3) this).aHa_Sub3_7983.method946(0, -104, Class147.aClass280_1738);
                ((s_Sub3) this).aHa_Sub3_7983.method951(Class147.aClass280_1738, (byte) 87, 0);
                ((s_Sub3) this).aHa_Sub3_7983.method929(null, -8423);
                ((s_Sub3) this).aHa_Sub3_7983.L(i_195_, i_196_, (((ha_Sub3) (((s_Sub3) this).aHa_Sub3_7983)).anInt6223));
            }
            if (aClass283_8015 != null) {
                ((s_Sub3) this).aHa_Sub3_7983.method931(0, 8, anInterface18_Impl1_8020);
                ((s_Sub3) this).aHa_Sub3_7983.method931(1, i_182_ + -21925, anInterface18_Impl1_8028);
                ((s_Sub3) this).aHa_Sub3_7983.method1004(((s_Sub3) this).aClass185_8019, (byte) -15);
                aClass283_8015.method3052(bools, i_179_, i_180_, 0, bool, i_181_);
            }
        }
        if (i_182_ != 21933)
            anInt8006 = -54;
        anInt7997++;
    }

    s_Sub3(ha_Sub3 var_ha_Sub3, int i, int i_197_, int i_198_, int i_199_, int[][] is, int[][] is_200_, int i_201_) {
        super(i_198_, i_199_, i_201_, is);
        aFloat7992 = 3.4028235E38F;
        aClass293_7984 = new Class293();
        anInt7982 = ((s) this).anInt3466 - 2;
        ((s_Sub3) this).aHa_Sub3_7983 = var_ha_Sub3;
        anInt8002 = 1 << anInt7982;
        ((s_Sub3) this).anIntArrayArrayArray7994 = new int[i_198_][i_199_][];
        ((s_Sub3) this).aShortArrayArray7990 = new short[i_198_ * i_199_][];
        aClass248_Sub21ArrayArrayArray8017 = new Node_Sub21[i_198_][i_199_][];
        aFloatArrayArray8022 = new float[((s) this).anInt3468 - -1][((s) this).anInt3472 - -1];
        aByteArrayArray8011 = new byte[i_198_][i_199_];
        ((s_Sub3) this).anIntArrayArrayArray8003 = new int[i_198_][i_199_][];
        anIntArrayArrayArray7991 = new int[i_198_][i_199_][];
        aByteArrayArray8029 = new byte[i_198_ + 1][1 + i_199_];
        ((s_Sub3) this).anInt8016 = i_197_;
        aFloatArrayArray8023 = new float[1 + ((s) this).anInt3468][((s) this).anInt3472 + 1];
        ((s_Sub3) this).anIntArrayArrayArray8005 = new int[i_198_][i_199_][];
        aFloatArrayArray8024 = new float[((s) this).anInt3468 + 1][1 + ((s) this).anInt3472];
        anIntArrayArrayArray7980 = new int[i_198_][i_199_][];
        for (int i_202_ = 0; ((s) this).anInt3472 >= i_202_; i_202_++) {
            for (int i_203_ = 0; (i_203_ ^ 0xffffffff) >= (((s) this).anInt3468 ^ 0xffffffff); i_203_++) {
                int i_204_ = ((s) this).anIntArrayArray3464[i_203_][i_202_];
                if (aFloat7992 > (float) i_204_)
                    aFloat7992 = (float) i_204_;
                if (aFloat7995 < (float) i_204_)
                    aFloat7995 = (float) i_204_;
                if (i_203_ > 0 && i_202_ > 0 && (((s) this).anInt3468 ^ 0xffffffff) < (i_203_ ^ 0xffffffff) && (((s) this).anInt3472 ^ 0xffffffff) < (i_202_ ^ 0xffffffff)) {
                    int i_205_ = (is_200_[i_203_ + 1][i_202_] + -is_200_[-1 + i_203_][i_202_]);
                    int i_206_ = (is_200_[i_203_][1 + i_202_] - is_200_[i_203_][i_202_ + -1]);
                    float f = (float) (1.0 / Math.sqrt((double) (i_206_ * i_206_ + (i_201_ * (4 * i_201_) + (i_205_ * i_205_)))));
                    aFloatArrayArray8022[i_203_][i_202_] = f * (float) i_205_;
                    aFloatArrayArray8023[i_203_][i_202_] = f * (float) (-i_201_ * 2);
                    aFloatArrayArray8024[i_203_][i_202_] = (float) i_206_ * f;
                }
            }
        }
        aFloat7995++;
        aFloat7992--;
        aClass65_8026 = new Class65(128);
        if ((0x10 & ((s_Sub3) this).anInt8016) != 0)
            aClass283_8015 = new Class283(((s_Sub3) this).aHa_Sub3_7983, this);
    }

    final void ka(int i, int i_207_, int i_208_) {
        if ((i_208_ ^ 0xffffffff) < (aByteArrayArray8029[i][i_207_] & 0xff ^ 0xffffffff))
            aByteArrayArray8029[i][i_207_] = (byte) i_208_;
        anInt7993++;
    }

    final void CA(r var_r, int i, int i_209_, int i_210_, int i_211_, boolean bool) {
        anInt8008++;
        if (aClass283_8015 != null && var_r != null) {
            int i_212_ = (i + -((((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6210 * i_209_) >> -1318881688) >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
            int i_213_ = (-((((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6176 * i_209_) >> -1440608440) + i_210_ >> ((ha_Sub3) ((s_Sub3) this).aHa_Sub3_7983).anInt6156);
            aClass283_8015.method3057(i_213_, i_212_, -11697, var_r);
        }
    }

    public static void method3167(int i) {
        if (i != 0)
            anInt8006 = 1;
        anIntArray8013 = null;
    }
}
