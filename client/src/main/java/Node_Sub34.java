/* Class248_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub34 extends Node {
    private static float[] aFloatArray7208;
    private static float[] aFloatArray7209;
    private static int anInt7210;
    private boolean aBoolean7211;
    private static Class92[] aClass92Array7212;
    private static int[] anIntArray7213;
    private static float[] aFloatArray7214;
    private static float[] aFloatArray7215;
    private int anInt7216;
    private int anInt7217;
    private static Class202[] aClass202Array7218;
    private int anInt7219;
    private int anInt7220;
    private static float[] aFloatArray7221;
    private static float[] aFloatArray7222;
    private int anInt7223;
    private static int[] anIntArray7224;
    private static int[] anIntArray7225;
    private static int anInt7226;
    private static int anInt7227;
    private boolean aBoolean7228;
    private int anInt7229;
    private static int anInt7230;
    private static float[] aFloatArray7231;
    private static byte[] aByteArray7232;
    private static boolean[] aBooleanArray7233;
    private static Class53[] aClass53Array7234;
    private static boolean aBoolean7235 = false;
    static Class294[] aClass294Array7236;
    private byte[][] aByteArrayArray7237;
    private float[] aFloatArray7238;
    private byte[] aByteArray7239;
    private int anInt7240;
    private int anInt7241;

    static final Node_Sub34 method2571(Class381 class381, int i) {
        if (!method2577(class381)) {
            class381.method3920(i, 122);
            return null;
        }
        byte[] is = class381.method3930(-1, i);
        if (is == null)
            return null;
        return new Node_Sub34(is);
    }

    static final float method2572(int i) {
        int i_0_ = i & 0x1fffff;
        int i_1_ = i & ~0x7fffffff;
        int i_2_ = (i & 0x7fe00000) >> 21;
        if (i_1_ != 0)
            i_0_ = -i_0_;
        return (float) ((double) i_0_ * Math.pow(2.0, (double) (i_2_ - 788)));
    }

    static final int method2573(int i) {
        int i_3_ = 0;
        int i_4_ = 0;
        int i_5_;
        for (/**/; i >= 8 - anInt7230; i -= i_5_) {
            i_5_ = 8 - anInt7230;
            int i_6_ = (1 << i_5_) - 1;
            i_3_ += (aByteArray7232[anInt7210] >> anInt7230 & i_6_) << i_4_;
            anInt7230 = 0;
            anInt7210++;
            i_4_ += i_5_;
        }
        if (i > 0) {
            i_5_ = (1 << i) - 1;
            i_3_ += (aByteArray7232[anInt7210] >> anInt7230 & i_5_) << i_4_;
            anInt7230 += i;
        }
        return i_3_;
    }

    static final int method2574() {
        int i = aByteArray7232[anInt7210] >> anInt7230 & 0x1;
        anInt7230++;
        anInt7210 += anInt7230 >> 3;
        anInt7230 &= 0x7;
        return i;
    }

    private final void method2575(byte[] is) {
        ByteStream class248_sub9 = new ByteStream(is);
        anInt7216 = class248_sub9.readInt(false);
        anInt7219 = class248_sub9.readInt(false);
        anInt7229 = class248_sub9.readInt(false);
        anInt7217 = class248_sub9.readInt(false);
        if (anInt7217 < 0) {
            anInt7217 = anInt7217 ^ 0xffffffff;
            aBoolean7228 = true;
        }
        int i = class248_sub9.readInt(false);
        aByteArrayArray7237 = new byte[i][];
        for (int i_7_ = 0; i_7_ < i; i_7_++) {
            int i_8_ = 0;
            int i_9_;
            do {
                i_9_ = class248_sub9.readUnsignedByte((byte) 124);
                i_8_ += i_9_;
            } while (i_9_ >= 255);
            byte[] is_10_ = new byte[i_8_];
            class248_sub9.method2189(is_10_, 0, i_8_, 95);
            aByteArrayArray7237[i_7_] = is_10_;
        }
    }

    final Node_Sub31_Sub1 method2576(int[] is) {
        if (is != null && is[0] <= 0)
            return null;
        if (aByteArray7239 == null) {
            anInt7220 = 0;
            aFloatArray7238 = new float[anInt7227];
            aByteArray7239 = new byte[anInt7219];
            anInt7241 = 0;
            anInt7240 = 0;
        }
        for (/**/; anInt7240 < aByteArrayArray7237.length; anInt7240++) {
            if (is != null && is[0] <= 0)
                return null;
            float[] fs = method2578(anInt7240);
            if (fs != null) {
                int i = anInt7241;
                int i_11_ = fs.length;
                if (i_11_ > anInt7219 - i)
                    i_11_ = anInt7219 - i;
                for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
                    int i_13_ = (int) (128.0F + fs[i_12_] * 128.0F);
                    if ((i_13_ & ~0xff) != 0)
                        i_13_ = (i_13_ ^ 0xffffffff) >> 31;
                    aByteArray7239[i++] = (byte) (i_13_ - 128);
                }
                if (is != null)
                    is[0] -= i - anInt7241;
                anInt7241 = i;
            }
        }
        aFloatArray7238 = null;
        byte[] is_14_ = aByteArray7239;
        aByteArray7239 = null;
        return new Node_Sub31_Sub1(anInt7216, is_14_, anInt7229, anInt7217, aBoolean7228);
    }

    private static final boolean method2577(Class381 class381) {
        if (!aBoolean7235) {
            byte[] is = class381.method3922((byte) 121, 0, 0);
            if (is == null)
                return false;
            method2581(is);
        }
        return true;
    }

    private final float[] method2578(int i) {
        method2580(aByteArrayArray7237[i], 0);
        method2574();
        int i_15_ = method2573(Class241.method1930(89, anIntArray7225.length - 1));
        boolean bool = aBooleanArray7233[i_15_];
        int i_16_ = bool ? anInt7227 : anInt7226;
        boolean bool_17_ = false;
        boolean bool_18_ = false;
        if (bool) {
            bool_17_ = method2574() != 0;
            bool_18_ = method2574() != 0;
        }
        int i_19_ = i_16_ >> 1;
        int i_20_;
        int i_21_;
        int i_22_;
        if (bool && !bool_17_) {
            i_20_ = (i_16_ >> 2) - (anInt7226 >> 2);
            i_21_ = (i_16_ >> 2) + (anInt7226 >> 2);
            i_22_ = anInt7226 >> 1;
        } else {
            i_20_ = 0;
            i_21_ = i_19_;
            i_22_ = i_16_ >> 1;
        }
        int i_23_;
        int i_24_;
        int i_25_;
        if (bool && !bool_18_) {
            i_23_ = i_16_ - (i_16_ >> 2) - (anInt7226 >> 2);
            i_24_ = i_16_ - (i_16_ >> 2) + (anInt7226 >> 2);
            i_25_ = anInt7226 >> 1;
        } else {
            i_23_ = i_19_;
            i_24_ = i_16_;
            i_25_ = i_16_ >> 1;
        }
        Class202 class202 = aClass202Array7218[anIntArray7225[i_15_]];
        int i_26_ = ((Class202) class202).anInt2302;
        int i_27_ = ((Class202) class202).anIntArray2301[i_26_];
        boolean bool_28_ = !aClass53Array7234[i_27_].method422();
        boolean bool_29_ = bool_28_;
        for (int i_30_ = 0; i_30_ < ((Class202) class202).anInt2300; i_30_++) {
            Class92 class92 = (aClass92Array7212[((Class202) class202).anIntArray2299[i_30_]]);
            float[] fs = aFloatArray7221;
            class92.method684(fs, i_16_ >> 1, bool_29_);
        }
        if (!bool_28_) {
            int i_31_ = ((Class202) class202).anInt2302;
            int i_32_ = ((Class202) class202).anIntArray2301[i_31_];
            aClass53Array7234[i_32_].method417(aFloatArray7221, i_16_ >> 1);
        }
        if (bool_28_) {
            for (int i_33_ = i_16_ >> 1; i_33_ < i_16_; i_33_++)
                aFloatArray7221[i_33_] = 0.0F;
        } else {
            int i_34_ = i_16_ >> 1;
            int i_35_ = i_16_ >> 2;
            int i_36_ = i_16_ >> 3;
            float[] fs = aFloatArray7221;
            for (int i_37_ = 0; i_37_ < i_34_; i_37_++)
                fs[i_37_] *= 0.5F;
            for (int i_38_ = i_34_; i_38_ < i_16_; i_38_++)
                fs[i_38_] = -fs[i_16_ - i_38_ - 1];
            float[] fs_39_ = bool ? aFloatArray7222 : aFloatArray7208;
            float[] fs_40_ = bool ? aFloatArray7231 : aFloatArray7215;
            float[] fs_41_ = bool ? aFloatArray7209 : aFloatArray7214;
            int[] is = bool ? anIntArray7213 : anIntArray7224;
            for (int i_42_ = 0; i_42_ < i_35_; i_42_++) {
                float f = fs[4 * i_42_] - fs[i_16_ - 4 * i_42_ - 1];
                float f_43_ = fs[4 * i_42_ + 2] - fs[i_16_ - 4 * i_42_ - 3];
                float f_44_ = fs_39_[2 * i_42_];
                float f_45_ = fs_39_[2 * i_42_ + 1];
                fs[i_16_ - 4 * i_42_ - 1] = f * f_44_ - f_43_ * f_45_;
                fs[i_16_ - 4 * i_42_ - 3] = f * f_45_ + f_43_ * f_44_;
            }
            for (int i_46_ = 0; i_46_ < i_36_; i_46_++) {
                float f = fs[i_34_ + 3 + 4 * i_46_];
                float f_47_ = fs[i_34_ + 1 + 4 * i_46_];
                float f_48_ = fs[4 * i_46_ + 3];
                float f_49_ = fs[4 * i_46_ + 1];
                fs[i_34_ + 3 + 4 * i_46_] = f + f_48_;
                fs[i_34_ + 1 + 4 * i_46_] = f_47_ + f_49_;
                float f_50_ = fs_39_[i_34_ - 4 - 4 * i_46_];
                float f_51_ = fs_39_[i_34_ - 3 - 4 * i_46_];
                fs[4 * i_46_ + 3] = (f - f_48_) * f_50_ - (f_47_ - f_49_) * f_51_;
                fs[4 * i_46_ + 1] = (f_47_ - f_49_) * f_50_ + (f - f_48_) * f_51_;
            }
            int i_52_ = Class241.method1930(115, i_16_ - 1);
            for (int i_53_ = 0; i_53_ < i_52_ - 3; i_53_++) {
                int i_54_ = i_16_ >> i_53_ + 2;
                int i_55_ = 8 << i_53_;
                for (int i_56_ = 0; i_56_ < 2 << i_53_; i_56_++) {
                    int i_57_ = i_16_ - i_54_ * 2 * i_56_;
                    int i_58_ = i_16_ - i_54_ * (2 * i_56_ + 1);
                    for (int i_59_ = 0; i_59_ < i_16_ >> i_53_ + 4; i_59_++) {
                        int i_60_ = 4 * i_59_;
                        float f = fs[i_57_ - 1 - i_60_];
                        float f_61_ = fs[i_57_ - 3 - i_60_];
                        float f_62_ = fs[i_58_ - 1 - i_60_];
                        float f_63_ = fs[i_58_ - 3 - i_60_];
                        fs[i_57_ - 1 - i_60_] = f + f_62_;
                        fs[i_57_ - 3 - i_60_] = f_61_ + f_63_;
                        float f_64_ = fs_39_[i_59_ * i_55_];
                        float f_65_ = fs_39_[i_59_ * i_55_ + 1];
                        fs[i_58_ - 1 - i_60_] = (f - f_62_) * f_64_ - (f_61_ - f_63_) * f_65_;
                        fs[i_58_ - 3 - i_60_] = (f_61_ - f_63_) * f_64_ + (f - f_62_) * f_65_;
                    }
                }
            }
            for (int i_66_ = 1; i_66_ < i_36_ - 1; i_66_++) {
                int i_67_ = is[i_66_];
                if (i_66_ < i_67_) {
                    int i_68_ = 8 * i_66_;
                    int i_69_ = 8 * i_67_;
                    float f = fs[i_68_ + 1];
                    fs[i_68_ + 1] = fs[i_69_ + 1];
                    fs[i_69_ + 1] = f;
                    f = fs[i_68_ + 3];
                    fs[i_68_ + 3] = fs[i_69_ + 3];
                    fs[i_69_ + 3] = f;
                    f = fs[i_68_ + 5];
                    fs[i_68_ + 5] = fs[i_69_ + 5];
                    fs[i_69_ + 5] = f;
                    f = fs[i_68_ + 7];
                    fs[i_68_ + 7] = fs[i_69_ + 7];
                    fs[i_69_ + 7] = f;
                }
            }
            for (int i_70_ = 0; i_70_ < i_34_; i_70_++)
                fs[i_70_] = fs[2 * i_70_ + 1];
            for (int i_71_ = 0; i_71_ < i_36_; i_71_++) {
                fs[i_16_ - 1 - 2 * i_71_] = fs[4 * i_71_];
                fs[i_16_ - 2 - 2 * i_71_] = fs[4 * i_71_ + 1];
                fs[i_16_ - i_35_ - 1 - 2 * i_71_] = fs[4 * i_71_ + 2];
                fs[i_16_ - i_35_ - 2 - 2 * i_71_] = fs[4 * i_71_ + 3];
            }
            for (int i_72_ = 0; i_72_ < i_36_; i_72_++) {
                float f = fs_41_[2 * i_72_];
                float f_73_ = fs_41_[2 * i_72_ + 1];
                float f_74_ = fs[i_34_ + 2 * i_72_];
                float f_75_ = fs[i_34_ + 2 * i_72_ + 1];
                float f_76_ = fs[i_16_ - 2 - 2 * i_72_];
                float f_77_ = fs[i_16_ - 1 - 2 * i_72_];
                float f_78_ = f_73_ * (f_74_ - f_76_) + f * (f_75_ + f_77_);
                fs[i_34_ + 2 * i_72_] = (f_74_ + f_76_ + f_78_) * 0.5F;
                fs[i_16_ - 2 - 2 * i_72_] = (f_74_ + f_76_ - f_78_) * 0.5F;
                f_78_ = f_73_ * (f_75_ + f_77_) - f * (f_74_ - f_76_);
                fs[i_34_ + 2 * i_72_ + 1] = (f_75_ - f_77_ + f_78_) * 0.5F;
                fs[i_16_ - 1 - 2 * i_72_] = (-f_75_ + f_77_ + f_78_) * 0.5F;
            }
            for (int i_79_ = 0; i_79_ < i_35_; i_79_++) {
                fs[i_79_] = (fs[2 * i_79_ + i_34_] * fs_40_[2 * i_79_] + fs[2 * i_79_ + 1 + i_34_] * fs_40_[2 * i_79_ + 1]);
                fs[i_34_ - 1 - i_79_] = (fs[2 * i_79_ + i_34_] * fs_40_[2 * i_79_ + 1] - fs[2 * i_79_ + 1 + i_34_] * fs_40_[2 * i_79_]);
            }
            for (int i_80_ = 0; i_80_ < i_35_; i_80_++)
                fs[i_16_ - i_35_ + i_80_] = -fs[i_80_];
            for (int i_81_ = 0; i_81_ < i_35_; i_81_++)
                fs[i_81_] = fs[i_35_ + i_81_];
            for (int i_82_ = 0; i_82_ < i_35_; i_82_++)
                fs[i_35_ + i_82_] = -fs[i_35_ - i_82_ - 1];
            for (int i_83_ = 0; i_83_ < i_35_; i_83_++)
                fs[i_34_ + i_83_] = fs[i_16_ - i_83_ - 1];
            for (int i_84_ = i_20_; i_84_ < i_21_; i_84_++) {
                float f = (float) Math.sin(((double) (i_84_ - i_20_) + 0.5) / (double) i_22_ * 0.5 * 3.141592653589793);
                aFloatArray7221[i_84_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
            }
            for (int i_85_ = i_23_; i_85_ < i_24_; i_85_++) {
                float f = (float) Math.sin((((double) (i_85_ - i_23_) + 0.5) / (double) i_25_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
                aFloatArray7221[i_85_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
            }
        }
        float[] fs = null;
        if (anInt7220 > 0) {
            int i_86_ = anInt7220 + i_16_ >> 2;
            fs = new float[i_86_];
            if (!aBoolean7211) {
                for (int i_87_ = 0; i_87_ < anInt7223; i_87_++) {
                    int i_88_ = (anInt7220 >> 1) + i_87_;
                    fs[i_87_] += aFloatArray7238[i_88_];
                }
            }
            if (!bool_28_) {
                for (int i_89_ = i_20_; i_89_ < i_16_ >> 1; i_89_++) {
                    int i_90_ = fs.length - (i_16_ >> 1) + i_89_;
                    fs[i_90_] += aFloatArray7221[i_89_];
                }
            }
        }
        float[] fs_91_ = aFloatArray7238;
        aFloatArray7238 = aFloatArray7221;
        aFloatArray7221 = fs_91_;
        anInt7220 = i_16_;
        anInt7223 = i_24_ - (i_16_ >> 1);
        aBoolean7211 = bool_28_;
        return fs;
    }

    static final Node_Sub34 method2579(Class381 class381, int i, int i_92_) {
        if (!method2577(class381)) {
            class381.method3915(93, i_92_, i);
            return null;
        }
        byte[] is = class381.method3922((byte) 124, i, i_92_);
        if (is == null)
            return null;
        return new Node_Sub34(is);
    }

    private static final void method2580(byte[] is, int i) {
        aByteArray7232 = is;
        anInt7210 = i;
        anInt7230 = 0;
    }

    private static final void method2581(byte[] is) {
        method2580(is, 0);
        anInt7226 = 1 << method2573(4);
        anInt7227 = 1 << method2573(4);
        aFloatArray7221 = new float[anInt7227];
        for (int i = 0; i < 2; i++) {
            int i_93_ = i != 0 ? anInt7227 : anInt7226;
            int i_94_ = i_93_ >> 1;
            int i_95_ = i_93_ >> 2;
            int i_96_ = i_93_ >> 3;
            float[] fs = new float[i_94_];
            for (int i_97_ = 0; i_97_ < i_95_; i_97_++) {
                fs[2 * i_97_] = (float) Math.cos((double) (4 * i_97_) * 3.141592653589793 / (double) i_93_);
                fs[2 * i_97_ + 1] = -(float) Math.sin((double) (4 * i_97_) * 3.141592653589793 / (double) i_93_);
            }
            float[] fs_98_ = new float[i_94_];
            for (int i_99_ = 0; i_99_ < i_95_; i_99_++) {
                fs_98_[2 * i_99_] = (float) Math.cos((double) (2 * i_99_ + 1) * 3.141592653589793 / (double) (2 * i_93_));
                fs_98_[2 * i_99_ + 1] = (float) Math.sin((double) (2 * i_99_ + 1) * 3.141592653589793 / (double) (2 * i_93_));
            }
            float[] fs_100_ = new float[i_95_];
            for (int i_101_ = 0; i_101_ < i_96_; i_101_++) {
                fs_100_[2 * i_101_] = (float) Math.cos((double) (4 * i_101_ + 2) * 3.141592653589793 / (double) i_93_);
                fs_100_[2 * i_101_ + 1] = -(float) Math.sin((double) (4 * i_101_ + 2) * 3.141592653589793 / (double) i_93_);
            }
            int[] is_102_ = new int[i_96_];
            int i_103_ = Class241.method1930(110, i_96_ - 1);
            for (int i_104_ = 0; i_104_ < i_96_; i_104_++)
                is_102_[i_104_] = Animable.method3598(i_104_, i_103_, 85);
            if (i != 0) {
                aFloatArray7222 = fs;
                aFloatArray7231 = fs_98_;
                aFloatArray7209 = fs_100_;
                anIntArray7213 = is_102_;
            } else {
                aFloatArray7208 = fs;
                aFloatArray7215 = fs_98_;
                aFloatArray7214 = fs_100_;
                anIntArray7224 = is_102_;
            }
        }
        int i = method2573(8) + 1;
        aClass294Array7236 = new Class294[i];
        for (int i_105_ = 0; i_105_ < i; i_105_++)
            aClass294Array7236[i_105_] = new Class294();
        int i_106_ = method2573(6) + 1;
        for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
            method2573(16);
        int i_108_ = method2573(6) + 1;
        aClass53Array7234 = new Class53[i_108_];
        for (int i_109_ = 0; i_109_ < i_108_; i_109_++)
            aClass53Array7234[i_109_] = new Class53();
        int i_110_ = method2573(6) + 1;
        aClass92Array7212 = new Class92[i_110_];
        for (int i_111_ = 0; i_111_ < i_110_; i_111_++)
            aClass92Array7212[i_111_] = new Class92();
        int i_112_ = method2573(6) + 1;
        aClass202Array7218 = new Class202[i_112_];
        for (int i_113_ = 0; i_113_ < i_112_; i_113_++)
            aClass202Array7218[i_113_] = new Class202();
        int i_114_ = method2573(6) + 1;
        aBooleanArray7233 = new boolean[i_114_];
        anIntArray7225 = new int[i_114_];
        for (int i_115_ = 0; i_115_ < i_114_; i_115_++) {
            aBooleanArray7233[i_115_] = method2574() != 0;
            method2573(16);
            method2573(16);
            anIntArray7225[i_115_] = method2573(8);
        }
        aBoolean7235 = true;
    }

    public static void method2582() {
        aByteArray7232 = null;
        aClass294Array7236 = null;
        aClass53Array7234 = null;
        aClass92Array7212 = null;
        aClass202Array7218 = null;
        aBooleanArray7233 = null;
        anIntArray7225 = null;
        aFloatArray7221 = null;
        aFloatArray7208 = null;
        aFloatArray7215 = null;
        aFloatArray7214 = null;
        aFloatArray7222 = null;
        aFloatArray7231 = null;
        aFloatArray7209 = null;
        anIntArray7224 = null;
        anIntArray7213 = null;
    }

    private Node_Sub34(byte[] is) {
        method2575(is);
    }
}
