/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class255 {
    boolean aBoolean2850;
    boolean aBoolean2851;
    private Class65 aClass65_2852;
    private short[] aShortArray2853;
    boolean aBoolean2854 = true;
    private int anInt2855;
    static int anInt2856;
    boolean aBoolean2857 = false;
    int anInt2858;
    static int anInt2859;
    private byte aByte2860;
    int anInt2861;
    int anInt2862;
    static int anInt2863;
    int[] anIntArray2864;
    int anInt2865;
    int anInt2866;
    byte aByte2867;
    int anInt2868;
    int anInt2869;
    int anInt2870;
    static int anInt2871;
    int anInt2872;
    static int anInt2873;
    int anInt2874;
    private int anInt2875;
    private byte[] aByteArray2876;
    int anInt2877;
    int anInt2878;
    byte aByte2879;
    int anInt2880;
    private int anInt2881;
    boolean aBoolean2882;
    byte aByte2883;
    int anInt2884;
    private byte aByte2885;
    static int anInt2886;
    int anInt2887;
    static int anInt2888;
    boolean aBoolean2889;
    int anInt2890;
    int anInt2891;
    int size;
    private byte aByte2893;
    int[] anIntArray2894;
    String[] aStringArray2895;
    short aShort2896;
    private int[][] anIntArrayArray2897;
    short[] aShortArray2898;
    int anInt2899;
    byte aByte2900;
    int anInt2901;
    byte aByte2902;
    private int anInt2903;
    short[] aShortArray2904;
    int[] anIntArray2905;
    static int anInt2906;
    private byte aByte2907;
    static int anInt2908;
    static int anInt2909;
    int anInt2910;
    boolean aBoolean2911;
    int anInt2912;
    int anInt2913;
    int anInt2914;
    String aString2915;
    int anInt2916;
    private int anInt2917;
    static int[] anIntArray2918 = new int[120];
    static int anInt2919;
    static int anInt2920;
    boolean aBoolean2921;
    private int anInt2922;
    int[] anIntArray2923;
    Class119 aClass119_2924;
    static int anInt2925;
    int anInt2926;
    private short[] aShortArray2927;
    short aShort2928;
    int anInt2929;

    public static void method2734(boolean bool) {
        anIntArray2918 = null;
        if (bool != false)
            method2742(true, null, (byte) 78);
    }

    final boolean method2735(int i, Interface3 interface3) {
        anInt2863++;
        if (((Class255) this).anIntArray2923 == null)
            return true;
        int i_0_ = i;
        if (anInt2881 != -1)
            i_0_ = interface3.method10(anInt2881, (byte) -102);
        else if (anInt2875 != -1)
            i_0_ = interface3.method11(anInt2875, (byte) 112);
        if ((i_0_ ^ 0xffffffff) > -1 || ((-1 + ((Class255) this).anIntArray2923.length ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) || (((Class255) this).anIntArray2923[i_0_] ^ 0xffffffff) == 0) {
            int i_1_ = (((Class255) this).anIntArray2923[-1 + ((Class255) this).anIntArray2923.length]);
            if ((i_1_ ^ 0xffffffff) == 0)
                return false;
            return true;
        }
        return true;
    }

    final void method2736(ByteStream class248_sub9, byte i) {
        anInt2873++;
        for (; ; ) {
            int i_2_ = class248_sub9.readUnsignedByte((byte) -101);
            if ((i_2_ ^ 0xffffffff) == -1)
                break;
            method2746(i_2_, 1, class248_sub9);
        }
        if (i != -54)
            aByteArray2876 = null;
    }

    final Class255 method2737(byte i, Interface3 interface3) {
        anInt2886++;
        int i_3_ = -1;
        if ((anInt2881 ^ 0xffffffff) == 0) {
            if ((anInt2875 ^ 0xffffffff) != 0)
                i_3_ = interface3.method11(anInt2875, (byte) 100);
        } else
            i_3_ = interface3.method10(anInt2881, (byte) -123);
        if (i <= 44)
            ((Class255) this).anInt2913 = -95;
        if ((i_3_ ^ 0xffffffff) > -1 || i_3_ >= ((Class255) this).anIntArray2923.length + -1 || ((Class255) this).anIntArray2923[i_3_] == -1) {
            int i_4_ = (((Class255) this).anIntArray2923[-1 + ((Class255) this).anIntArray2923.length]);
            if ((i_4_ ^ 0xffffffff) != 0)
                return ((Class255) this).aClass119_2924.method1123(i_4_, 8881);
            return null;
        }
        return ((Class255) this).aClass119_2924.method1123(((Class255) this).anIntArray2923[i_3_], 8881);
    }

    final Class162 method2738(int[] is, Class182 class182, int i, Class122 class122, int i_5_, Class131 class131, Class182 class182_6_, int i_7_, int i_8_, int i_9_, Interface3 interface3, int i_10_, int i_11_, ha var_ha, int i_12_, int i_13_, Class286[] class286s, Class356 class356) {
        anInt2888++;
        if (((Class255) this).anIntArray2923 != null) {
            Class255 class255_14_ = method2737((byte) 78, interface3);
            if (class255_14_ == null)
                return null;
            return class255_14_.method2738(is, class182, 32, class122, i_5_, class131, class182_6_, i_7_, i_8_, i_9_, interface3, i_10_, i_11_, var_ha, i_12_, i_13_, class286s, class356);
        }
        int i_15_ = i_5_;
        if (anInt2917 != 128)
            i_15_ |= 0x2;
        if ((anInt2922 ^ 0xffffffff) != -129)
            i_15_ |= 0x5;
        boolean bool = class182 != null || class182_6_ != null;
        boolean bool_16_ = false;
        boolean bool_17_ = false;
        boolean bool_18_ = false;
        boolean bool_19_ = false;
        int i_20_ = class286s == null ? 0 : class286s.length;
        for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
            Node_Sub18.aClass248_Sub8_Sub2Array7028[i_21_] = null;
            if (class286s[i_21_] != null) {
                Class182 class182_22_ = class356.method3790((byte) -90, (((Class286) class286s[i_21_]).anInt3379));
                if (((Class182) class182_22_).anIntArray2117 != null) {
                    bool = true;
                    Class249_Sub2.aClass182Array4800[i_21_] = class182_22_;
                    int i_23_ = ((Class286) class286s[i_21_]).anInt3374;
                    int i_24_ = ((Class286) class286s[i_21_]).anInt3378;
                    int i_25_ = ((Class182) class182_22_).anIntArray2117[i_23_];
                    Node_Sub18.aClass248_Sub8_Sub2Array7028[i_21_] = class356.method3788(Class316_Sub1.method3291(i, -57), i_25_ >>> 901830320);
                    i_25_ &= 0xffff;
                    Class28.anIntArray4889[i_21_] = i_25_;
                    if (Node_Sub18.aClass248_Sub8_Sub2Array7028[i_21_] != null) {
                        bool_17_ |= Node_Sub18.aClass248_Sub8_Sub2Array7028[i_21_].method2035(i_25_, i + -151);
                        bool_16_ |= Node_Sub18.aClass248_Sub8_Sub2Array7028[i_21_].method2040(1, i_25_);
                        bool_19_ |= Node_Sub18.aClass248_Sub8_Sub2Array7028[i_21_].method2037(i ^ 0x21, i_25_);
                        bool_18_ |= ((Class182) class182_22_).aBoolean2116;
                    }
                    if ((((Class182) class182_22_).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_24_ != -1 && ((i_24_ ^ 0xffffffff) > (((Class182) class182_22_).anIntArray2117.length ^ 0xffffffff))) {
                        Node_Sub8_Sub6.anIntArray8948[i_21_] = ((Class182) class182_22_).anIntArray2113[i_23_];
                        Class301_Sub3_Sub1.anIntArray9973[i_21_] = ((Class286) class286s[i_21_]).anInt3373;
                        int i_26_ = ((Class182) class182_22_).anIntArray2117[i_24_];
                        Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_21_] = class356.method3788(-119, i_26_ >>> 1223689840);
                        i_26_ &= 0xffff;
                        Class329.anIntArray3850[i_21_] = i_26_;
                        if (Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_21_] != null) {
                            bool_17_ |= Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_21_].method2035(i_26_, -15);
                            bool_16_ |= Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_21_].method2040(1, i_26_);
                            bool_19_ |= Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_21_].method2037(i + -31, i_26_);
                        }
                    } else {
                        Node_Sub8_Sub6.anIntArray8948[i_21_] = 0;
                        Class301_Sub3_Sub1.anIntArray9973[i_21_] = 0;
                        Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_21_] = null;
                        Class329.anIntArray3850[i_21_] = -1;
                    }
                }
            }
        }
        int i_27_ = -1;
        int i_28_ = -1;
        int i_29_ = 0;
        Node_Sub8_Sub2 class248_sub8_sub2 = null;
        Node_Sub8_Sub2 class248_sub8_sub2_30_ = null;
        if (i != 32)
            return null;
        int i_31_ = -1;
        int i_32_ = -1;
        int i_33_ = 0;
        Node_Sub8_Sub2 class248_sub8_sub2_34_ = null;
        Node_Sub8_Sub2 class248_sub8_sub2_35_ = null;
        if (bool) {
            if (class182 != null) {
                i_27_ = ((Class182) class182).anIntArray2117[i_7_];
                int i_36_ = i_27_ >>> 974133872;
                class248_sub8_sub2 = class356.method3788(-62, i_36_);
                i_27_ &= 0xffff;
                if (class248_sub8_sub2 != null) {
                    bool_17_ |= class248_sub8_sub2.method2035(i_27_, i ^ ~0x64);
                    bool_16_ |= class248_sub8_sub2.method2040(1, i_27_);
                    bool_19_ |= class248_sub8_sub2.method2037(i ^ 0x21, i_27_);
                    bool_18_ |= ((Class182) class182).aBoolean2116;
                }
                if ((((Class182) class182).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_8_ ^ 0xffffffff) != 0 && ((Class182) class182).anIntArray2117.length > i_8_) {
                    i_28_ = ((Class182) class182).anIntArray2117[i_8_];
                    i_29_ = ((Class182) class182).anIntArray2113[i_7_];
                    int i_37_ = i_28_ >>> 1022931152;
                    if (i_37_ != i_36_)
                        class248_sub8_sub2_30_ = class356.method3788(-38, i_37_);
                    else
                        class248_sub8_sub2_30_ = class248_sub8_sub2;
                    i_28_ &= 0xffff;
                    if (class248_sub8_sub2_30_ != null) {
                        bool_17_ |= class248_sub8_sub2_30_.method2035(i_28_, i ^ ~0x2);
                        bool_16_ |= class248_sub8_sub2_30_.method2040(1, i_28_);
                        bool_19_ |= class248_sub8_sub2_30_.method2037(1, i_28_);
                    }
                }
            }
            i_15_ |= 0x20;
            if (class182_6_ != null) {
                i_31_ = ((Class182) class182_6_).anIntArray2117[i_10_];
                int i_38_ = i_31_ >>> 110864816;
                i_31_ &= 0xffff;
                class248_sub8_sub2_34_ = class356.method3788(-22, i_38_);
                if (class248_sub8_sub2_34_ != null) {
                    bool_17_ |= class248_sub8_sub2_34_.method2035(i_31_, -16);
                    bool_16_ |= class248_sub8_sub2_34_.method2040(1, i_31_);
                    bool_19_ |= class248_sub8_sub2_34_.method2037(1, i_31_);
                    bool_18_ |= ((Class182) class182_6_).aBoolean2116;
                }
                if ((((Class182) class182_6_).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_11_ != -1 && (i_11_ < ((Class182) class182_6_).anIntArray2117.length)) {
                    i_32_ = ((Class182) class182_6_).anIntArray2117[i_11_];
                    i_33_ = ((Class182) class182_6_).anIntArray2113[i_10_];
                    int i_39_ = i_32_ >>> -270525520;
                    if (i_38_ != i_39_)
                        class248_sub8_sub2_35_ = class356.method3788(-121, i_39_);
                    else
                        class248_sub8_sub2_35_ = class248_sub8_sub2_34_;
                    i_32_ &= 0xffff;
                    if (class248_sub8_sub2_35_ != null) {
                        bool_17_ |= class248_sub8_sub2_35_.method2035(i_32_, -98);
                        bool_16_ |= class248_sub8_sub2_35_.method2040(1, i_32_);
                        bool_19_ |= class248_sub8_sub2_35_.method2037(1, i_32_);
                    }
                }
            }
            if (bool_17_)
                i_15_ |= 0x80;
            if (bool_16_)
                i_15_ |= 0x100;
            if (bool_18_)
                i_15_ |= 0x200;
            if (bool_19_)
                i_15_ |= 0x400;
        }
        long l = (long) (((ha) var_ha).anInt1418 << -425067472 | ((Class255) this).anInt2914);
        if (class122 != null)
            l |= ((Class122) class122).aLong1525 << -1071857896;
        Class162 class162;
        synchronized (((Class119) ((Class255) this).aClass119_2924).aClass278_1502) {
            class162 = (Class162) ((Class119) ((Class255) this).aClass119_2924).aClass278_1502.method2863(4, l);
        }
        Class281 class281 = null;
        if (((Class255) this).anInt2861 != -1)
            class281 = class131.method1213(-20408, ((Class255) this).anInt2861);
        if (class162 == null || i_15_ != (i_15_ & class162.ua())) {
            if (class162 != null)
                i_15_ |= class162.ua();
            int i_40_ = i_15_;
            int[] is_41_ = ((class122 == null || ((Class122) class122).anIntArray1516 == null) ? ((Class255) this).anIntArray2864 : ((Class122) class122).anIntArray1516);
            boolean bool_42_ = false;
            synchronized (((Class119) ((Class255) this).aClass119_2924).aClass381_1501) {
                for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (is_41_.length ^ 0xffffffff); i_43_++) {
                    if ((is_41_[i_43_] ^ 0xffffffff) != 0 && !((Class119) ((Class255) this).aClass119_2924).aClass381_1501.method3915(65, 0, is_41_[i_43_]))
                        bool_42_ = true;
                }
            }
            if (bool_42_)
                return null;
            Class343[] class343s = new Class343[is_41_.length];
            for (int i_44_ = 0; (is_41_.length ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
                if ((is_41_[i_44_] ^ 0xffffffff) != 0) {
                    synchronized (((Class119) ((Class255) this).aClass119_2924).aClass381_1501) {
                        class343s[i_44_] = OutgoingOpcode.method1513(0, (((Class119) (((Class255) this).aClass119_2924)).aClass381_1501), -106, is_41_[i_44_]);
                    }
                    if (class343s[i_44_] != null) {
                        if (((Class343) class343s[i_44_]).anInt4053 < 13)
                            class343s[i_44_].method3497((byte) 1, 2);
                        if (anIntArrayArray2897 != null && anIntArrayArray2897[i_44_] != null)
                            class343s[i_44_].method3496(anIntArrayArray2897[i_44_][0], anIntArrayArray2897[i_44_][1], i + -32, anIntArrayArray2897[i_44_][2]);
                    }
                }
            }
            if (class281 != null && ((Class281) class281).anIntArrayArray3291 != null) {
                for (int i_45_ = 0; ((Class281) class281).anIntArrayArray3291.length > i_45_; i_45_++) {
                    if ((class343s.length ^ 0xffffffff) < (i_45_ ^ 0xffffffff) && class343s[i_45_] != null) {
                        int i_46_ = 0;
                        int i_47_ = 0;
                        int i_48_ = 0;
                        int i_49_ = 0;
                        int i_50_ = 0;
                        int i_51_ = 0;
                        if (((Class281) class281).anIntArrayArray3291[i_45_] != null) {
                            i_47_ = (((Class281) class281).anIntArrayArray3291[i_45_][1]);
                            i_51_ = (((Class281) class281).anIntArrayArray3291[i_45_][5]) << 1483980867;
                            i_49_ = (((Class281) class281).anIntArrayArray3291[i_45_][3]) << 917674563;
                            i_50_ = (((Class281) class281).anIntArrayArray3291[i_45_][4]) << -2045623517;
                            i_48_ = (((Class281) class281).anIntArrayArray3291[i_45_][2]);
                            i_46_ = (((Class281) class281).anIntArrayArray3291[i_45_][0]);
                        }
                        if ((i_49_ ^ 0xffffffff) != -1 || i_50_ != 0 || (i_51_ ^ 0xffffffff) != -1)
                            class343s[i_45_].method3505(12, i_51_, i_50_, i_49_);
                        if ((i_46_ ^ 0xffffffff) != -1 || (i_47_ ^ 0xffffffff) != -1 || i_48_ != 0)
                            class343s[i_45_].method3496(i_46_, i_47_, 0, i_48_);
                    }
                }
            }
            Class343 class343;
            if ((class343s.length ^ 0xffffffff) != -2)
                class343 = new Class343(class343s, class343s.length);
            else
                class343 = class343s[0];
            if (aShortArray2853 != null)
                i_40_ |= 0x4000;
            if (aShortArray2927 != null)
                i_40_ |= 0x8000;
            if (aByte2885 != 0)
                i_40_ |= 0x80000;
            class162 = var_ha.a(class343, i_40_, (((Class119) ((Class255) this).aClass119_2924).anInt1504), 64 + anInt2903, anInt2855 + 850);
            if (aShortArray2853 != null) {
                short[] is_52_;
                if (class122 == null || ((Class122) class122).aShortArray1518 == null)
                    is_52_ = ((Class255) this).aShortArray2904;
                else
                    is_52_ = ((Class122) class122).aShortArray1518;
                for (int i_53_ = 0; ((aShortArray2853.length ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++) {
                    if (aByteArray2876 != null && ((aByteArray2876.length ^ 0xffffffff) < (i_53_ ^ 0xffffffff)))
                        class162.ia(aShortArray2853[i_53_], (Node_Sub14.aShortArray6985[0xff & aByteArray2876[i_53_]]));
                    else
                        class162.ia(aShortArray2853[i_53_], is_52_[i_53_]);
                }
            }
            if (aShortArray2927 != null) {
                short[] is_54_;
                if (class122 == null || ((Class122) class122).aShortArray1520 == null)
                    is_54_ = ((Class255) this).aShortArray2898;
                else
                    is_54_ = ((Class122) class122).aShortArray1520;
                for (int i_55_ = 0; ((aShortArray2927.length ^ 0xffffffff) < (i_55_ ^ 0xffffffff)); i_55_++)
                    class162.aa(aShortArray2927[i_55_], is_54_[i_55_]);
            }
            if (aByte2885 != 0)
                class162.method1433(aByte2907, aByte2893, aByte2860, aByte2885 & 0xff);
            class162.s(i_15_);
            synchronized (((Class119) ((Class255) this).aClass119_2924).aClass278_1502) {
                ((Class119) ((Class255) this).aClass119_2924).aClass278_1502.method2867((byte) 0, l, class162);
            }
        }
        Class162 class162_56_ = class162.method1436((byte) 4, i_15_, true);
        boolean bool_57_ = false;
        if (is != null) {
            for (int i_58_ = 0; i_58_ < 12; i_58_++) {
                if ((is[i_58_] ^ 0xffffffff) != 0)
                    bool_57_ = true;
            }
        }
        if (!bool && !bool_57_)
            return class162_56_;
        Viewport[] viewports = null;
        if (class281 != null)
            viewports = class281.method2912(var_ha, (byte) -71);
        if (bool_57_ && viewports != null) {
            for (int i_59_ = 0; (i_59_ ^ 0xffffffff) > -13; i_59_++) {
                if (viewports[i_59_] != null)
                    class162_56_.method1443(viewports[i_59_], 1 << i_59_, true);
            }
        }
        int i_60_ = 0;
        int i_61_ = 1;
        while (i_20_ > i_60_) {
            if (Node_Sub18.aClass248_Sub8_Sub2Array7028[i_60_] != null)
                class162_56_.method1424(0, -1 + Class301_Sub3_Sub1.anIntArray9973[i_60_], Node_Sub8_Sub6.anIntArray8948[i_60_], Class329.anIntArray3850[i_60_], (((Class182) Class249_Sub2.aClass182Array4800[i_60_]).aBoolean2116), Class28.anIntArray4889[i_60_], i_61_, 0, null, Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_60_], Node_Sub18.aClass248_Sub8_Sub2Array7028[i_60_]);
            i_60_++;
            i_61_ <<= 1;
        }
        if (bool_57_) {
            for (int i_62_ = 0; i_62_ < 12; i_62_++) {
                if (is[i_62_] != -1) {
                    int i_63_ = -i_13_ + is[i_62_];
                    i_63_ &= 0x3fff;
                    Viewport viewport = var_ha.e();
                    viewport.method1857(i_63_);
                    class162_56_.method1443(viewport, 1 << i_62_, false);
                }
            }
        }
        if (bool_57_ && viewports != null) {
            for (int i_64_ = 0; (i_64_ ^ 0xffffffff) > -13; i_64_++) {
                if (viewports[i_64_] != null)
                    class162_56_.method1443(viewports[i_64_], 1 << i_64_, false);
            }
        }
        if (class248_sub8_sub2 == null || class248_sub8_sub2_34_ == null) {
            if (class248_sub8_sub2 != null)
                class162_56_.method1421(-37, class248_sub8_sub2, ((Class182) class182).aBoolean2116, i_28_, i_29_, i_27_, 0, -1 + i_9_, class248_sub8_sub2_30_);
            else if (class248_sub8_sub2_34_ != null)
                class162_56_.method1421(-62, class248_sub8_sub2_34_, ((Class182) class182_6_).aBoolean2116, i_32_, i_33_, i_31_, 0, -1 + i_12_, class248_sub8_sub2_35_);
        } else
            class162_56_.method1418(class248_sub8_sub2_35_, class248_sub8_sub2_34_, i_27_, i_33_, i_28_, i_9_ - 1, i_32_, (((Class182) class182_6_).aBoolean2116 | ((Class182) class182).aBoolean2116), class248_sub8_sub2_30_, i_31_, (byte) 104, ((Class182) class182).aBooleanArray2133, class248_sub8_sub2, i_12_ - 1, i_29_);
        for (int i_65_ = 0; i_65_ < i_20_; i_65_++) {
            Node_Sub18.aClass248_Sub8_Sub2Array7028[i_65_] = null;
            Class279_Sub2.aClass248_Sub8_Sub2Array7572[i_65_] = null;
            Class249_Sub2.aClass182Array4800[i_65_] = null;
        }
        if ((anInt2922 ^ 0xffffffff) != -129 || anInt2917 != 128)
            class162_56_.O(anInt2922, anInt2917, anInt2922);
        class162_56_.s(i_5_);
        return class162_56_;
    }

    final String method2739(int i, int i_66_, String string) {
        if (i_66_ != 0)
            method2734(false);
        anInt2859++;
        if (aClass65_2852 == null)
            return string;
        Node_Sub32 class248_sub32 = (Node_Sub32) aClass65_2852.method501((long) i, (byte) 31);
        if (class248_sub32 == null)
            return string;
        return ((Node_Sub32) class248_sub32).aString7195;
    }

    final boolean method2740(byte i) {
        anInt2871++;
        if (((Class255) this).anIntArray2923 == null) {
            if (((Class255) this).anInt2877 == -1 && ((Class255) this).anInt2880 == -1 && ((Class255) this).anInt2916 == -1)
                return false;
            return true;
        }
        if (i >= -61)
            return false;
        for (int i_67_ = 0; ((Class255) this).anIntArray2923.length > i_67_; i_67_++) {
            if ((((Class255) this).anIntArray2923[i_67_] ^ 0xffffffff) != 0) {
                Class255 class255_68_ = (((Class255) this).aClass119_2924.method1123(((Class255) this).anIntArray2923[i_67_], 8881));
                if (((Class255) class255_68_).anInt2877 != -1 || (((Class255) class255_68_).anInt2880 ^ 0xffffffff) != 0 || (((Class255) class255_68_).anInt2916 ^ 0xffffffff) != 0)
                    return true;
            }
        }
        return false;
    }

    static final void method2741(byte i, Class381 class381) {
        Class84_Sub9.anInt5504 = class381.method3927((byte) 110, "hitmarks");
        anInt2906++;
        Class324.anInt3823 = class381.method3927((byte) 75, "hitbar_default");
        if (i <= 76)
            anIntArray2918 = null;
        Class2.anInt123 = class381.method3927((byte) 108, "timerbar_default");
        Class86.anInt1053 = class381.method3927((byte) 65, "headicons_pk");
        Class253.anInt2845 = class381.method3927((byte) 121, "headicons_prayer");
        Node_Sub14_Sub23.anInt9395 = class381.method3927((byte) 56, "hint_headicons");
        Class346_Sub7_Sub4_Sub1.anInt10076 = class381.method3927((byte) 120, "hint_mapmarkers");
        Class82.anInt1029 = class381.method3927((byte) 89, "mapflag");
        Class249_Sub2.anInt4804 = class381.method3927((byte) 127, "cross");
        Class297.anInt5019 = class381.method3927((byte) 75, "mapdots");
        Class245.anInt2753 = class381.method3927((byte) 72, "scrollbar");
        Class89.anInt1107 = class381.method3927((byte) 123, "name_icons");
        s.anInt3470 = class381.method3927((byte) 85, "floorshadows");
        Class297.anInt5010 = class381.method3927((byte) 66, "compass");
        Class233.anInt2614 = class381.method3927((byte) 112, "otherlevel");
        Class326.anInt4807 = class381.method3927((byte) 94, "hint_mapedge");
    }

    static final Object method2742(boolean bool, byte[] is, byte i) {
        anInt2908++;
        if (i < 54)
            anIntArray2918 = null;
        if (is == null)
            return null;
        if (is.length > 136 && !Class10.aBoolean226) {
            try {
                Class205 class205 = (Class205) Class.forName("Class205_Sub1").newInstance();
                class205.method1698((byte) -76, is);
                return class205;
            } catch (Throwable throwable) {
                Class10.aBoolean226 = true;
            }
        }
        if (bool)
            return Class111.method777(-123, is);
        return is;
    }

    final void method2743(int i) {
        anInt2909++;
        if (((Class255) this).anIntArray2864 == null)
            ((Class255) this).anIntArray2864 = new int[0];
        if ((((Class255) this).aByte2902 ^ 0xffffffff) == 0) {
            if (Class346_Sub7_Sub2_Sub3.aClass215_10385 != (((Class119) ((Class255) this).aClass119_2924).aClass215_1489))
                ((Class255) this).aByte2902 = (byte) 0;
            else
                ((Class255) this).aByte2902 = (byte) 1;
        }
        if (i != -65536)
            method2745(null, -113, (byte) -114, null, null, null, -126, -84, null, -7);
    }

    final int method2744(int i, int i_69_, int i_70_) {
        anInt2919++;
        if (aClass65_2852 == null)
            return i_69_;
        if (i != -156)
            return 45;
        Node_Sub37 class248_sub37 = ((Node_Sub37) aClass65_2852.method501((long) i_70_, (byte) 31));
        if (class248_sub37 == null)
            return i_69_;
        return ((Node_Sub37) class248_sub37).anInt7261;
    }

    final Class162 method2745(ha var_ha, int i, byte i_71_, Interface3 interface3, Class122 class122, Class356 class356, int i_72_, int i_73_, Class182 class182, int i_74_) {
        anInt2920++;
        if (((Class255) this).anIntArray2923 != null) {
            Class255 class255_75_ = method2737((byte) 126, interface3);
            if (class255_75_ == null)
                return null;
            return class255_75_.method2745(var_ha, i, (byte) -68, interface3, class122, class356, i_72_, i_73_, class182, i_74_);
        }
        if (((Class255) this).anIntArray2894 == null && (class122 == null || ((Class122) class122).anIntArray1516 == null))
            return null;
        int i_76_ = i;
        if (class182 != null && i_73_ != -1)
            i_76_ |= class182.method1610((byte) -85, true, i_73_, i_72_);
        long l = (long) (((ha) var_ha).anInt1418 << 891846800 | ((Class255) this).anInt2914);
        if (class122 != null)
            l |= ((Class122) class122).aLong1525 << -370583528;
        Class162 class162;
        synchronized (((Class119) ((Class255) this).aClass119_2924).aClass278_1503) {
            int i_77_ = 4 % ((i_71_ - -7) / 55);
            class162 = (Class162) ((Class119) ((Class255) this).aClass119_2924).aClass278_1503.method2863(4, l);
        }
        if (class162 == null || (i_76_ & class162.ua() ^ 0xffffffff) != (i_76_ ^ 0xffffffff)) {
            if (class162 != null)
                i_76_ |= class162.ua();
            int i_78_ = i_76_;
            int[] is = ((class122 != null && ((Class122) class122).anIntArray1516 != null) ? ((Class122) class122).anIntArray1516 : ((Class255) this).anIntArray2894);
            boolean bool = false;
            synchronized (((Class119) ((Class255) this).aClass119_2924).aClass381_1501) {
                for (int i_79_ = 0; (i_79_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_79_++) {
                    if (!((Class119) ((Class255) this).aClass119_2924).aClass381_1501.method3915(59, 0, is[i_79_]))
                        bool = true;
                }
            }
            if (bool)
                return null;
            Class343[] class343s = new Class343[is.length];
            synchronized (((Class119) ((Class255) this).aClass119_2924).aClass381_1501) {
                for (int i_80_ = 0; is.length > i_80_; i_80_++)
                    class343s[i_80_] = OutgoingOpcode.method1513(0, (((Class119) (((Class255) this).aClass119_2924)).aClass381_1501), -106, is[i_80_]);
            }
            for (int i_81_ = 0; (i_81_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_81_++) {
                if (class343s[i_81_] != null && ((Class343) class343s[i_81_]).anInt4053 < 13)
                    class343s[i_81_].method3497((byte) 1, 2);
            }
            Class343 class343;
            if ((class343s.length ^ 0xffffffff) == -2)
                class343 = class343s[0];
            else
                class343 = new Class343(class343s, class343s.length);
            if (aShortArray2853 != null)
                i_78_ |= 0x4000;
            if (aShortArray2927 != null)
                i_78_ |= 0x8000;
            if (aByte2885 != 0)
                i_78_ |= 0x80000;
            class162 = var_ha.a(class343, i_78_, (((Class119) ((Class255) this).aClass119_2924).anInt1504), 64, 768);
            if (aShortArray2853 != null) {
                short[] is_82_;
                if (class122 == null || ((Class122) class122).aShortArray1518 == null)
                    is_82_ = ((Class255) this).aShortArray2904;
                else
                    is_82_ = ((Class122) class122).aShortArray1518;
                for (int i_83_ = 0; aShortArray2853.length > i_83_; i_83_++) {
                    if (aByteArray2876 != null && i_83_ < aByteArray2876.length)
                        class162.ia(aShortArray2853[i_83_], (Node_Sub14.aShortArray6985[0xff & aByteArray2876[i_83_]]));
                    else
                        class162.ia(aShortArray2853[i_83_], is_82_[i_83_]);
                }
            }
            if (aShortArray2927 != null) {
                short[] is_84_;
                if (class122 == null || ((Class122) class122).aShortArray1520 == null)
                    is_84_ = ((Class255) this).aShortArray2898;
                else
                    is_84_ = ((Class122) class122).aShortArray1520;
                for (int i_85_ = 0; ((aShortArray2927.length ^ 0xffffffff) < (i_85_ ^ 0xffffffff)); i_85_++)
                    class162.aa(aShortArray2927[i_85_], is_84_[i_85_]);
            }
            if ((aByte2885 ^ 0xffffffff) != -1)
                class162.method1433(aByte2907, aByte2893, aByte2860, aByte2885 & 0xff);
            class162.s(i_76_);
            synchronized (((Class119) ((Class255) this).aClass119_2924).aClass278_1503) {
                ((Class119) ((Class255) this).aClass119_2924).aClass278_1503.method2867((byte) 0, l, class162);
            }
        }
        if (class182 != null && (i_73_ ^ 0xffffffff) != 0)
            class162 = class182.method1605(i_76_, i_74_, i_73_, class162, false, i_72_);
        class162.s(i);
        return class162;
    }

    private final void method2746(int i, int i_86_, ByteStream class248_sub9) {
        anInt2856++;
        if (i != i_86_) {
            if (i == 2)
                ((Class255) this).aString2915 = class248_sub9.readString(15598);
            else if ((i ^ 0xffffffff) != -13) {
                if ((i ^ 0xffffffff) > -31 || (i ^ 0xffffffff) <= -36) {
                    if (i != 40) {
                        if (i != 41) {
                            if ((i ^ 0xffffffff) != -43) {
                                if ((i ^ 0xffffffff) != -61) {
                                    if ((i ^ 0xffffffff) != -94) {
                                        if (i == 95)
                                            ((Class255) this).anInt2858 = class248_sub9.readShort(i_86_ + -2);
                                        else if (i != 97) {
                                            if ((i ^ 0xffffffff) != -99) {
                                                if ((i ^ 0xffffffff) != -100) {
                                                    if ((i ^ 0xffffffff) == -101)
                                                        anInt2903 = (class248_sub9.readByte(35));
                                                    else if (i == 101)
                                                        anInt2855 = (class248_sub9.readByte(45)) * 5;
                                                    else if ((i ^ 0xffffffff) == -103)
                                                        ((Class255) this).anInt2890 = (class248_sub9.readShort(-1));
                                                    else if (i != 103) {
                                                        if (((i ^ 0xffffffff) != -107) && i != 118) {
                                                            if ((i ^ 0xffffffff) != -108) {
                                                                if ((i ^ 0xffffffff) != -110) {
                                                                    if ((i ^ 0xffffffff) == -112)
                                                                        ((Class255) this).aBoolean2854 = false;
                                                                    else if ((i ^ 0xffffffff) != -114) {
                                                                        if ((i ^ 0xffffffff) != -115) {
                                                                            if (i != 119) {
                                                                                if (i != 121) {
                                                                                    if (i != 122) {
                                                                                        if (i != 123) {
                                                                                            if ((i ^ 0xffffffff) == -126)
                                                                                                ((Class255) this).aByte2883 = class248_sub9.readByte(75);
                                                                                            else if (i != 127) {
                                                                                                if ((i ^ 0xffffffff) == -129)
                                                                                                    class248_sub9.readUnsignedByte((byte) 92);
                                                                                                else if (i != 134) {
                                                                                                    if (i == 135) {
                                                                                                        ((Class255) this).anInt2872 = class248_sub9.readUnsignedByte((byte) -107);
                                                                                                        ((Class255) this).anInt2887 = class248_sub9.readShort(i_86_ + -2);
                                                                                                    } else if (i != 136) {
                                                                                                        if (i != 137) {
                                                                                                            if ((i ^ 0xffffffff) != -139) {
                                                                                                                if (i != 139) {
                                                                                                                    if (i == 140)
                                                                                                                        ((Class255) this).anInt2862 = class248_sub9.readUnsignedByte((byte) -66);
                                                                                                                    else if (i == 141)
                                                                                                                        ((Class255) this).aBoolean2851 = true;
                                                                                                                    else if ((i ^ 0xffffffff) != -143) {
                                                                                                                        if (i == 143)
                                                                                                                            ((Class255) this).aBoolean2889 = true;
                                                                                                                        else if (i >= 150 && i < 155) {
                                                                                                                            ((Class255) this).aStringArray2895[i + -150] = class248_sub9.readString(15598);
                                                                                                                            if (!((Class119) ((Class255) this).aClass119_2924).aBoolean1485)
                                                                                                                                ((Class255) this).aStringArray2895[i + -150] = null;
                                                                                                                        } else if ((i ^ 0xffffffff) != -156) {
                                                                                                                            if (i == 158)
                                                                                                                                ((Class255) this).aByte2902 = (byte) 1;
                                                                                                                            else if ((i ^ 0xffffffff) == -160)
                                                                                                                                ((Class255) this).aByte2902 = (byte) 0;
                                                                                                                            else if ((i ^ 0xffffffff) != -161) {
                                                                                                                                if (i == 162)
                                                                                                                                    ((Class255) this).aBoolean2882 = true;
                                                                                                                                else if ((i ^ 0xffffffff) == -164)
                                                                                                                                    ((Class255) this).anInt2865 = class248_sub9.readUnsignedByte((byte) -83);
                                                                                                                                else if (i != 164) {
                                                                                                                                    if ((i ^ 0xffffffff) == -166)
                                                                                                                                        ((Class255) this).anInt2870 = class248_sub9.readUnsignedByte((byte) 70);
                                                                                                                                    else if ((i ^ 0xffffffff) != -169) {
                                                                                                                                        if (i == 249) {
                                                                                                                                            int i_87_ = class248_sub9.readUnsignedByte((byte) -64);
                                                                                                                                            if (aClass65_2852 == null) {
                                                                                                                                                int i_88_ = Class136_Sub4.method1269(i_87_, (byte) -128);
                                                                                                                                                aClass65_2852 = new Class65(i_88_);
                                                                                                                                            }
                                                                                                                                            for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > (i_87_ ^ 0xffffffff); i_89_++) {
                                                                                                                                                boolean bool = class248_sub9.readUnsignedByte((byte) 97) == 1;
                                                                                                                                                int i_90_ = class248_sub9.method2221(i_86_ ^ 0xfe);
                                                                                                                                                Node node;
                                                                                                                                                if (!bool)
                                                                                                                                                    node = new Node_Sub37(class248_sub9.readInt(false));
                                                                                                                                                else
                                                                                                                                                    node = new Node_Sub32(class248_sub9.readString(15598));
                                                                                                                                                aClass65_2852.method509(i_86_ + -2, node, (long) i_90_);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else
                                                                                                                                        ((Class255) this).anInt2874 = class248_sub9.readUnsignedByte((byte) 80);
                                                                                                                                } else {
                                                                                                                                    ((Class255) this).anInt2884 = class248_sub9.readShort(i_86_ ^ ~0x1);
                                                                                                                                    ((Class255) this).anInt2901 = class248_sub9.readShort(-1);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                int i_91_ = class248_sub9.readUnsignedByte((byte) 109);
                                                                                                                                ((Class255) this).anIntArray2905 = new int[i_91_];
                                                                                                                                for (int i_92_ = 0; i_91_ > i_92_; i_92_++)
                                                                                                                                    ((Class255) this).anIntArray2905[i_92_] = class248_sub9.readShort(-1);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            aByte2907 = class248_sub9.readByte(86);
                                                                                                                            aByte2893 = class248_sub9.readByte(96);
                                                                                                                            aByte2860 = class248_sub9.readByte(99);
                                                                                                                            aByte2885 = class248_sub9.readByte(i_86_ ^ 0x42);
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        ((Class255) this).anInt2868 = class248_sub9.readShort(-1);
                                                                                                                } else
                                                                                                                    ((Class255) this).anInt2929 = class248_sub9.readShort(-1);
                                                                                                            } else
                                                                                                                ((Class255) this).anInt2869 = class248_sub9.readShort(-1);
                                                                                                        } else
                                                                                                            ((Class255) this).anInt2913 = class248_sub9.readShort(-1);
                                                                                                    } else {
                                                                                                        ((Class255) this).anInt2912 = class248_sub9.readUnsignedByte((byte) -54);
                                                                                                        ((Class255) this).anInt2866 = class248_sub9.readShort(-1);
                                                                                                    }
                                                                                                } else {
                                                                                                    ((Class255) this).anInt2877 = class248_sub9.readShort(i_86_ + -2);
                                                                                                    if ((((Class255) this).anInt2877 ^ 0xffffffff) == -65536)
                                                                                                        ((Class255) this).anInt2877 = -1;
                                                                                                    ((Class255) this).anInt2926 = class248_sub9.readShort(i_86_ + -2);
                                                                                                    if ((((Class255) this).anInt2926 ^ 0xffffffff) == -65536)
                                                                                                        ((Class255) this).anInt2926 = -1;
                                                                                                    ((Class255) this).anInt2880 = class248_sub9.readShort(i_86_ ^ ~0x1);
                                                                                                    if ((((Class255) this).anInt2880 ^ 0xffffffff) == -65536)
                                                                                                        ((Class255) this).anInt2880 = -1;
                                                                                                    ((Class255) this).anInt2916 = class248_sub9.readShort(i_86_ ^ ~0x1);
                                                                                                    if (((Class255) this).anInt2916 == 65535)
                                                                                                        ((Class255) this).anInt2916 = -1;
                                                                                                    ((Class255) this).anInt2891 = class248_sub9.readUnsignedByte((byte) -81);
                                                                                                }
                                                                                            } else
                                                                                                ((Class255) this).anInt2861 = class248_sub9.readShort(-1);
                                                                                        } else
                                                                                            ((Class255) this).anInt2878 = class248_sub9.readShort(-1);
                                                                                    } else
                                                                                        ((Class255) this).anInt2899 = class248_sub9.readShort(-1);
                                                                                } else {
                                                                                    anIntArrayArray2897 = new int[((Class255) this).anIntArray2864.length][];
                                                                                    int i_93_ = class248_sub9.readUnsignedByte((byte) -25);
                                                                                    for (int i_94_ = 0; (i_94_ ^ 0xffffffff) > (i_93_ ^ 0xffffffff); i_94_++) {
                                                                                        int i_95_ = class248_sub9.readUnsignedByte((byte) -21);
                                                                                        int[] is = anIntArrayArray2897[i_95_] = new int[3];
                                                                                        is[0] = class248_sub9.readByte(i_86_ + 66);
                                                                                        is[1] = class248_sub9.readByte(44);
                                                                                        is[2] = class248_sub9.readByte(124);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                ((Class255) this).aByte2867 = class248_sub9.readByte(37);
                                                                        } else {
                                                                            ((Class255) this).aByte2900 = class248_sub9.readByte(42);
                                                                            ((Class255) this).aByte2879 = class248_sub9.readByte(73);
                                                                        }
                                                                    } else {
                                                                        ((Class255) this).aShort2896 = (short) class248_sub9.readShort(-1);
                                                                        ((Class255) this).aShort2928 = (short) class248_sub9.readShort(-1);
                                                                    }
                                                                } else
                                                                    ((Class255) this).aBoolean2850 = false;
                                                            } else
                                                                ((Class255) this).aBoolean2911 = false;
                                                        } else {
                                                            anInt2881 = (class248_sub9.readShort(-1));
                                                            if (anInt2881 == 65535)
                                                                anInt2881 = -1;
                                                            anInt2875 = (class248_sub9.readShort(-1));
                                                            if (anInt2875 == 65535)
                                                                anInt2875 = -1;
                                                            int i_96_ = -1;
                                                            if ((i ^ 0xffffffff) == -119) {
                                                                i_96_ = (class248_sub9.readShort(-1));
                                                                if (i_96_ == 65535)
                                                                    i_96_ = -1;
                                                            }
                                                            int i_97_ = (class248_sub9.readUnsignedByte((byte) -116));
                                                            ((Class255) this).anIntArray2923 = (new int
                                                                    [2 + i_97_]);
                                                            for (int i_98_ = 0; (i_98_ <= i_97_); i_98_++) {
                                                                ((Class255) this).anIntArray2923[i_98_] = (class248_sub9.readShort(-1));
                                                                if (((((Class255) this).anIntArray2923[i_98_]) ^ 0xffffffff) == -65536)
                                                                    ((Class255) this).anIntArray2923[i_98_] = -1;
                                                            }
                                                            ((Class255) this).anIntArray2923[i_97_ - -1] = i_96_;
                                                        }
                                                    } else
                                                        ((Class255) this).anInt2910 = (class248_sub9.readShort(-1));
                                                } else
                                                    ((Class255) this).aBoolean2857 = true;
                                            } else
                                                anInt2917 = (class248_sub9.readShort(i_86_ ^ ~0x1));
                                        } else
                                            anInt2922 = class248_sub9.readShort(-1);
                                    } else
                                        ((Class255) this).aBoolean2921 = false;
                                } else {
                                    int i_99_ = class248_sub9.readUnsignedByte((byte) -53);
                                    ((Class255) this).anIntArray2894 = new int[i_99_];
                                    for (int i_100_ = 0; i_100_ < i_99_; i_100_++)
                                        ((Class255) this).anIntArray2894[i_100_] = class248_sub9.readShort(-1);
                                }
                            } else {
                                int i_101_ = class248_sub9.readUnsignedByte((byte) 75);
                                aByteArray2876 = new byte[i_101_];
                                for (int i_102_ = 0; ((i_101_ ^ 0xffffffff) < (i_102_ ^ 0xffffffff)); i_102_++)
                                    aByteArray2876[i_102_] = class248_sub9.readByte(55);
                            }
                        } else {
                            int i_103_ = class248_sub9.readUnsignedByte((byte) 117);
                            ((Class255) this).aShortArray2898 = new short[i_103_];
                            aShortArray2927 = new short[i_103_];
                            for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > (i_103_ ^ 0xffffffff); i_104_++) {
                                aShortArray2927[i_104_] = (short) class248_sub9.readShort(-1);
                                ((Class255) this).aShortArray2898[i_104_] = (short) class248_sub9.readShort(i_86_ + -2);
                            }
                        }
                    } else {
                        int i_105_ = class248_sub9.readUnsignedByte((byte) -78);
                        aShortArray2853 = new short[i_105_];
                        ((Class255) this).aShortArray2904 = new short[i_105_];
                        for (int i_106_ = 0; i_105_ > i_106_; i_106_++) {
                            aShortArray2853[i_106_] = (short) class248_sub9.readShort(-1);
                            ((Class255) this).aShortArray2904[i_106_] = (short) class248_sub9.readShort(-1);
                        }
                    }
                } else
                    ((Class255) this).aStringArray2895[i - 30] = class248_sub9.readString(15598);
            } else
                ((Class255) this).size = class248_sub9.readUnsignedByte((byte) -34);
        } else {
            int i_107_ = class248_sub9.readUnsignedByte((byte) -49);
            ((Class255) this).anIntArray2864 = new int[i_107_];
            for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
                ((Class255) this).anIntArray2864[i_108_] = class248_sub9.readShort(-1);
                if ((((Class255) this).anIntArray2864[i_108_] ^ 0xffffffff) == -65536)
                    ((Class255) this).anIntArray2864[i_108_] = -1;
            }
        }
    }

    public Class255() {
        ((Class255) this).aBoolean2850 = true;
        ((Class255) this).anInt2858 = -1;
        ((Class255) this).anInt2865 = -1;
        ((Class255) this).anInt2862 = 255;
        ((Class255) this).anInt2874 = 0;
        ((Class255) this).anInt2880 = -1;
        ((Class255) this).anInt2861 = -1;
        ((Class255) this).anInt2878 = -1;
        ((Class255) this).anInt2884 = 256;
        anInt2855 = 0;
        anInt2881 = -1;
        ((Class255) this).anInt2872 = -1;
        ((Class255) this).anInt2866 = -1;
        ((Class255) this).size = 1;
        ((Class255) this).aByte2879 = (byte) -16;
        ((Class255) this).anInt2891 = 0;
        ((Class255) this).anInt2869 = -1;
        anInt2875 = -1;
        ((Class255) this).anInt2912 = -1;
        ((Class255) this).aBoolean2911 = true;
        aByte2885 = (byte) 0;
        ((Class255) this).aString2915 = "null";
        ((Class255) this).anInt2868 = -1;
        anInt2903 = 0;
        ((Class255) this).aBoolean2851 = false;
        ((Class255) this).anInt2913 = -1;
        ((Class255) this).aByte2867 = (byte) 0;
        ((Class255) this).anInt2901 = 256;
        ((Class255) this).aByte2902 = (byte) -1;
        ((Class255) this).aShort2896 = (short) 0;
        ((Class255) this).aBoolean2889 = false;
        anInt2917 = 128;
        ((Class255) this).anInt2916 = -1;
        ((Class255) this).anInt2899 = -1;
        ((Class255) this).anInt2887 = -1;
        ((Class255) this).aByte2900 = (byte) -96;
        ((Class255) this).anInt2890 = -1;
        ((Class255) this).anInt2926 = -1;
        ((Class255) this).anInt2910 = 32;
        ((Class255) this).aBoolean2921 = true;
        ((Class255) this).aStringArray2895 = new String[5];
        anInt2922 = 128;
        ((Class255) this).anInt2870 = 0;
        ((Class255) this).aByte2883 = (byte) 4;
        ((Class255) this).anInt2877 = -1;
        ((Class255) this).aShort2928 = (short) 0;
        ((Class255) this).anInt2929 = -1;
    }

    static {
        int i = 0;
        for (int i_109_ = 0; i_109_ < 120; i_109_++) {
            int i_110_ = 1 + i_109_;
            int i_111_ = (int) ((double) i_110_ + Math.pow(2.0, (double) i_110_ / 7.0) * 300.0);
            i += i_111_;
            anIntArray2918[i_109_] = i / 4;
        }
    }
}
