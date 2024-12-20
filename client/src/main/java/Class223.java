/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.lang.reflect.Method;

final class Class223 implements Interface20 {
    private int anInt5168;
    static Class168 aClass168_5169 = new Class168(10, 2, 2, 0);
    static int anInt5170;
    private int anInt5171;
    private int anInt5172;
    private Interface5[] anInterface5Array5173;
    static int anInt5174;
    static int anInt5175;
    static int anInt5176;
    static int anInt5177;
    static int anInt5178;
    static int anInt5179;
    static int anInt5180;
    static int anInt5181;
    static int anInt5182;
    private int anInt5183 = -1;
    static int anInt5184;
    static int anInt5185;
    static int anInt5186;
    static int anInt5187;
    static int anInt5188;
    static int anInt5189;
    static int anInt5190;
    private ha_Sub2 aHa_Sub2_5191;
    static int anInt5192;
    private int anInt5193;
    static int anInt5194;
    private int anInt5195;
    static int anInt5196;
    static int anInt5197;
    static Class199 aClass199_5198;
    /*synthetic*/ static Class aClass5199;

    final boolean method1770(int i) {
        anInt5177++;
        int i_0_ = -49 % ((-24 - i) / 62);
        int i_1_ = OpenGL.glCheckFramebufferStatusEXT(anInt5183);
        if ((i_1_ ^ 0xffffffff) != -36054)
            return false;
        return true;
    }

    public final void method74(int i) {
        anInt5178++;
        int i_2_ = 95 % ((i - 66) / 42);
        OpenGL.glBindFramebufferEXT(36008, 0);
        anInt5193 &= ~0x1;
        anInt5183 = method1780((byte) 49);
    }

    private final void method1771(Class136_Sub4 class136_sub4, int i, int i_3_, int i_4_) {
        anInt5194++;
        if (anInt5183 == -1)
            throw new RuntimeException();
        int i_5_ = 1 << i;
        if (i_4_ == ((i_5_ ^ 0xffffffff) & anInt5195)) {
            anInt5168 = ((Class136_Sub4) class136_sub4).anInt8416;
            anInt5171 = ((Class136_Sub4) class136_sub4).anInt8412;
        } else if (((anInt5168 ^ 0xffffffff) != (((Class136_Sub4) class136_sub4).anInt8416 ^ 0xffffffff)) || ((Class136_Sub4) class136_sub4).anInt8412 != anInt5171)
            throw new RuntimeException();
        class136_sub4.method1263(anInt5183, i_3_, (byte) 85, Class28.anIntArray4894[i]);
        anInterface5Array5173[i] = class136_sub4;
        anInt5195 |= i_5_;
    }

    public final void method77(boolean bool) {
        if (bool != true)
            anInterface5Array5173 = null;
        OpenGL.glBindFramebufferEXT(36160, 0);
        anInt5174++;
        anInt5193 &= ~0x4;
        anInt5183 = method1780((byte) 74);
    }

    static final void method1772(int i, int i_6_, int i_7_, int i_8_, byte[][][] is, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int i_14_, byte i_15_, int i_16_, int i_17_, boolean bool, boolean bool_18_, int i_19_, int i_20_, boolean bool_21_) {
        WorldAddress.aBoolean1189 = true;
        Node_Sub19.aBoolean7030 = r.aHa9032.r() > 0;
        Node_Sub8_Sub20.aBoolean9094 = bool_18_;
        Class286.anInt3375 = i_6_ >> Class96.anInt1249;
        Class152.anInt1808 = i_8_ >> Class96.anInt1249;
        Class227.anInt2565 = i_6_;
        Node_Sub8_Sub18.anInt9079 = i_8_;
        Class208.anInt2407 = i_7_;
        Node_Sub14.anInt6982 = Class286.anInt3375 - Node_Sub47.anInt7416;
        if (Node_Sub14.anInt6982 < 0) {
            Class367.anInt4513 = -Node_Sub14.anInt6982;
            Node_Sub14.anInt6982 = 0;
        } else
            Class367.anInt4513 = 0;
        Animable.anInt9925 = Class152.anInt1808 - Node_Sub47.anInt7416;
        if (Animable.anInt9925 < 0) {
            Node_Sub14_Sub37.anInt9555 = -Animable.anInt9925;
            Animable.anInt9925 = 0;
        } else
            Node_Sub14_Sub37.anInt9555 = 0;
        Class269.anInt3133 = Class286.anInt3375 + Node_Sub47.anInt7416;
        if (Class269.anInt3133 > Class225_Sub1.anInt8454)
            Class269.anInt3133 = Class225_Sub1.anInt8454;
        Class57.anInt791 = Class152.anInt1808 + Node_Sub47.anInt7416;
        if (Class57.anInt791 > Class89.anInt1106)
            Class57.anInt791 = Class89.anInt1106;
        boolean[][] bools = RSInterface2.aBooleanArrayArray4314;
        boolean[][] bools_22_ = Class112.aBooleanArrayArray5202;
        if (Node_Sub8_Sub20.aBoolean9094) {
            for (int i_23_ = 0; (i_23_ < Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 2); i_23_++) {
                int i_24_ = 0;
                int i_25_ = 0;
                for (int i_26_ = 0; i_26_ < (Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 2); i_26_++) {
                    if (i_26_ > 1)
                        Class375.anIntArray4615[i_26_ - 2] = i_24_;
                    i_24_ = i_25_;
                    int i_27_ = (Class286.anInt3375 - Node_Sub47.anInt7416 + i_23_);
                    int i_28_ = (Class152.anInt1808 - Node_Sub47.anInt7416 + i_26_);
                    if (i_27_ >= 0 && i_28_ >= 0 && i_27_ < Class225_Sub1.anInt8454 && i_28_ < Class89.anInt1106) {
                        int i_29_ = i_27_ << Class96.anInt1249;
                        int i_30_ = i_28_ << Class96.anInt1249;
                        int i_31_ = (Node_Sub14_Sub29.aSArray9471[(Node_Sub14_Sub29.aSArray9471.length - 1)].method3145(i_27_, 71, i_28_) - (1000 << Class96.anInt1249 - 7));
                        int i_32_ = (Node_Sub14_Sub12_Sub1.aSArray10306 != null ? (Node_Sub14_Sub12_Sub1.aSArray10306[0].method3145(i_27_, 40, i_28_) + Class241.anInt2692) : (Node_Sub14_Sub29.aSArray9471[0].method3145(i_27_, 115, i_28_) + Class241.anInt2692));
                        i_25_ = (i_19_ >= 0 ? r.aHa9032.r(i_29_, i_31_, i_30_, i_29_, i_32_, i_30_, i_19_) : r.aHa9032.JA(i_29_, i_31_, i_30_, i_29_, i_32_, i_30_));
                        Class112.aBooleanArrayArray5202[i_23_][i_26_] = i_25_ == 0;
                    } else {
                        i_25_ = -1;
                        Class112.aBooleanArrayArray5202[i_23_][i_26_] = false;
                    }
                    if (i_23_ > 0 && i_26_ > 0) {
                        int i_33_ = (Class375.anIntArray4615[i_26_ - 1] & Class375.anIntArray4615[i_26_] & i_24_ & i_25_);
                        RSInterface2.aBooleanArrayArray4314[i_23_ - 1][i_26_ - 1] = i_33_ == 0;
                    }
                }
                Class375.anIntArray4615[(Node_Sub47.anInt7416 + Node_Sub47.anInt7416)] = i_24_;
                Class375.anIntArray4615[(Node_Sub47.anInt7416 + Node_Sub47.anInt7416 + 1)] = i_25_;
            }
            if (i_19_ >= 0)
                WorldAddress.aBoolean1189 = false;
            else {
                Class67.anIntArray901 = is_9_;
                Class75.anIntArray975 = is_10_;
                Class76.anIntArray983 = is_11_;
                Class112.anIntArray5213 = is_12_;
                Node_Sub14_Sub26.anIntArray9433 = is_13_;
                IncommingOpcode.method1109(r.aHa9032, i_14_, 0);
            }
        } else {
            if (Class279.aBooleanArrayArray3251 == null)
                Class279.aBooleanArrayArray3251 = (new boolean
                        [Class225_Sub1.anInt8454 + Class225_Sub1.anInt8454 + 1]
                        [Class89.anInt1106 + Class225_Sub1.anInt8454 + 1]);
            for (int i_34_ = 0; i_34_ < Class279.aBooleanArrayArray3251.length; i_34_++) {
                for (int i_35_ = 0; i_35_ < Class279.aBooleanArrayArray3251[0].length; i_35_++)
                    Class279.aBooleanArrayArray3251[i_34_][i_35_] = true;
            }
            Class112.aBooleanArrayArray5202 = Class279.aBooleanArrayArray3251;
            RSInterface2.aBooleanArrayArray4314 = Class279.aBooleanArrayArray3251;
            Node_Sub14.anInt6982 = 0;
            Animable.anInt9925 = 0;
            Class269.anInt3133 = Class225_Sub1.anInt8454;
            Class57.anInt791 = Class89.anInt1106;
            WorldAddress.aBoolean1189 = false;
        }
        Class124.method1144(-22, r.aHa9032);
        if (!((Class27) Class352.aClass27_4187).aBoolean367) {
            Class360 class360 = ((Class27) Class352.aClass27_4187).aClass360_358;
            for (Class346_Sub10 class346_sub10 = (Class346_Sub10) class360.method3815((byte) 23); class346_sub10 != null; class346_sub10 = (Class346_Sub10) class360.method3809(-24951)) {
                class346_sub10.method3538(-127);
                Class256.method2749(class346_sub10, (byte) 31);
            }
        }
        if (Node_Sub19.aBoolean7030) {
            for (int i_36_ = 0; i_36_ < Class297_Sub1.anInt8481; i_36_++)
                Class340.aClass156Array3963[i_36_].method1373(-12091, i, bool);
        }
        if (Class252.aBoolean2841) {
            Class121.anIntArray1514 = r.aHa9032.Y();
            r.aHa9032.K(Node_Sub8_Sub10.anIntArray8975);
            int i_37_ = ((Node_Sub8_Sub10.anIntArray8975[2] - Node_Sub8_Sub10.anIntArray8975[0]) / Viewport.anInt2651);
            for (int i_38_ = 0; i_38_ < Viewport.anInt2651 - 1; i_38_++)
                Class270.anIntArray3138[i_38_] = (i_37_ * (i_38_ + 1) + Class349_Sub2.anIntArray4721[i_38_]);
            for (int i_39_ = 0; i_39_ < Class183.aClass288Array2143.length; i_39_++)
                Class183.aClass288Array2143[i_39_].method3085();
        }
        if (Class333.aClass137ArrayArrayArray3898 != null) {
            if (Class252.aBoolean2841)
                Class181.method1604(0);
            Class67.method518(true);
            r.aHa9032.ra(-1, 1583160, 40, 127);
            Node_Sub8_Sub10.method2078(true, is, i_14_, i_15_, i_19_, i_20_, bool_21_);
            if (Class252.aBoolean2841)
                Node_Sub8.method2020();
            r.aHa9032.pa();
            Class67.method518(false);
        }
        Node_Sub8_Sub10.method2078(false, is, i_14_, i_15_, i_19_, i_20_, bool_21_);
        if (Class252.aBoolean2841) {
            for (int i_40_ = 0; i_40_ < Class111_Sub1.anInt5531; i_40_++)
                Class105.aBooleanArrayArrayArray1343[i_40_] = Class84_Sub7.aBooleanArrayArrayArray5461[i_40_];
            Class181.method1604(0);
            for (int i_41_ = 0; i_41_ < Class183.aClass288Array2143.length; i_41_++)
                Class183.aClass288Array2143[i_41_].method3085();
        }
        if (Class252.aBoolean2841) {
            Node_Sub8.method2020();
            for (int i_42_ = 0; i_42_ < Class111_Sub1.anInt5531; i_42_++)
                Class84_Sub7.aBooleanArrayArrayArray5461[i_42_] = Class105.aBooleanArrayArrayArray1343[i_42_];
            if (Node_Sub3.anInt6830 == 2) {
                if (WorldAddress.aLongArray1184[0] < WorldAddress.aLongArray1184[1]) {
                    if ((Class270.anIntArray3138[0] + Class349_Sub2.anIntArray4721[0]) > Node_Sub8_Sub10.anIntArray8975[0])
                        Class349_Sub2.anIntArray4721[0]++;
                } else if ((WorldAddress.aLongArray1184[0] > WorldAddress.aLongArray1184[1]) && ((Class270.anIntArray3138[0] + Class349_Sub2.anIntArray4721[0]) < Node_Sub8_Sub10.anIntArray8975[2]))
                    Class349_Sub2.anIntArray4721[0]--;
            }
        }
        if (!Node_Sub8_Sub20.aBoolean9094) {
            RSInterface2.aBooleanArrayArray4314 = bools;
            Class112.aBooleanArrayArray5202 = bools_22_;
        }
        Class116_Sub1.method1103();
    }

    static final void method1773(int i) {
        Class368.anInt4527++;
        anInt5192++;
        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class377.aOutgoingOpcode_4627);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, Class69.anInt910);
        Class226_Sub3.method1814(class248_sub36, i + i);
    }

    static final void method1774(boolean bool) {
        try {
            if (bool != true)
                method1773(-62);
            Method method = (aClass5199 != null ? aClass5199 : (aClass5199 = method1785("java.lang.Runtime"))).getMethod("availableProcessors", new Class[0]);
            if (method != null) {
                try {
                    Runtime runtime = Runtime.getRuntime();
                    Integer integer = (Integer) method.invoke(runtime, null);
                    Class121.anInt1513 = integer.intValue();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
        } catch (Exception exception) {
            /* empty */
        }
        anInt5185++;
    }

    final void method1775(int i, int i_43_) {
        anInt5186++;
        if (i_43_ < 2)
            method1770(88);
        if (anInt5183 == -1)
            throw new RuntimeException();
        OpenGL.glReadBuffer(Class28.anIntArray4894[i]);
    }

    public static void method1776(byte i) {
        aClass199_5198 = null;
        aClass168_5169 = null;
        if (i != 19)
            method1782(3, 117, null, -77, 76);
    }

    protected final void finalize() throws Throwable {
        anInt5182++;
        aHa_Sub2_5191.method874(anInt5172, -15493);
        super.finalize();
    }

    public final void method72(int i) {
        OpenGL.glBindFramebufferEXT(36160, anInt5172);
        anInt5180++;
        anInt5193 |= 0x4;
        if (i != -1358)
            anInt5171 = -68;
        anInt5183 = method1780((byte) 76);
    }

    final void method1777(Node_Sub8_Sub4 class248_sub8_sub4, int i, int i_44_) {
        anInt5187++;
        if ((anInt5183 ^ 0xffffffff) == 0)
            throw new RuntimeException();
        if (i != 15061)
            method74(-57);
        int i_45_ = 1 << i_44_;
        if ((anInt5195 & (i_45_ ^ 0xffffffff) ^ 0xffffffff) != -1) {
            if ((((Node_Sub8_Sub4) class248_sub8_sub4).anInt8374 != anInt5168) || (((Node_Sub8_Sub4) class248_sub8_sub4).anInt8375 != anInt5171))
                throw new RuntimeException();
        } else {
            anInt5171 = ((Node_Sub8_Sub4) class248_sub8_sub4).anInt8375;
            anInt5168 = ((Node_Sub8_Sub4) class248_sub8_sub4).anInt8374;
        }
        class248_sub8_sub4.method2048(anInt5183, Class28.anIntArray4894[i_44_], i ^ ~0x7f60);
        anInterface5Array5173[i_44_] = class248_sub8_sub4;
        anInt5195 |= i_45_;
    }

    final void method1778(int i, int i_46_, Class136_Sub4 class136_sub4) {
        anInt5170++;
        method1771(class136_sub4, i_46_, 0, 0);
        if (i != -22433)
            method1770(105);
    }

    final void method1779(Class136_Sub3 class136_sub3, int i, int i_47_, int i_48_) {
        method1781(class136_sub3, i, i_48_, 1, i_47_);
        anInt5181++;
    }

    private final int method1780(byte i) {
        if (i <= 39)
            anInterface5Array5173 = null;
        anInt5197++;
        if ((anInt5193 & 0x4) != 0)
            return 36160;
        if ((0x2 & anInt5193 ^ 0xffffffff) != -1)
            return 36009;
        if ((0x1 & anInt5193 ^ 0xffffffff) != -1)
            return 36008;
        return -1;
    }

    private final void method1781(Class136_Sub3 class136_sub3, int i, int i_49_, int i_50_, int i_51_) {
        anInt5190++;
        if (anInt5183 == -1)
            throw new RuntimeException();
        int i_52_ = i_50_ << i_51_;
        if ((anInt5195 & (i_52_ ^ 0xffffffff) ^ 0xffffffff) != -1) {
            if (((((Class136_Sub3) class136_sub3).anInt8397 ^ 0xffffffff) != (anInt5168 ^ 0xffffffff)) || ((Class136_Sub3) class136_sub3).anInt8397 != anInt5171)
                throw new RuntimeException();
        } else {
            anInt5168 = ((Class136_Sub3) class136_sub3).anInt8397;
            anInt5171 = ((Class136_Sub3) class136_sub3).anInt8397;
        }
        class136_sub3.method1261(anInt5183, i, i_49_, Class28.anIntArray4894[i_51_], false);
        anInterface5Array5173[i_51_] = class136_sub3;
        anInt5195 |= i_52_;
    }

    public final void method75(boolean bool) {
        anInt5179++;
        OpenGL.glBindFramebufferEXT(36009, anInt5172);
        anInt5193 |= 0x2;
        anInt5183 = method1780((byte) 96);
        if (bool != true)
            method76((byte) -44);
    }

    static final void method1782(int i, int i_53_, Node_Sub28 class248_sub28, int i_54_, int i_55_) {
        anInt5188++;
        long l = (long) (i_55_ | (i_54_ << -1870160580 | i << -347698642));
        Node_Sub13 class248_sub13 = ((Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method501(l, (byte) 31));
        if (i_53_ == 0) {
            if (class248_sub13 == null) {
                class248_sub13 = new Node_Sub13();
                Class346_Sub7_Sub5.aClass65_9959.method509(i_53_ + -1, class248_sub13, l);
                ((Node_Sub13) class248_sub13).aClass293_6966.method3109(class248_sub28, i_53_ ^ ~0x63);
            } else {
                Class321 class321 = Class283.aClass342_3343.method3482((byte) 95, (((Node_Sub28) class248_sub28).anInt7164));
                int i_56_ = ((Class321) class321).anInt3753;
                if ((((Class321) class321).anInt3771 ^ 0xffffffff) == -2)
                    i_56_ *= ((Node_Sub28) class248_sub28).anInt7161 + 1;
                for (Node_Sub28 class248_sub28_57_ = (Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3119(2); class248_sub28_57_ != null; class248_sub28_57_ = (Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3107(-127)) {
                    class321 = (Class283.aClass342_3343.method3482((byte) 73, ((Node_Sub28) class248_sub28_57_).anInt7164));
                    int i_58_ = ((Class321) class321).anInt3753;
                    if (((Class321) class321).anInt3771 == 1)
                        i_58_ *= (((Node_Sub28) class248_sub28_57_).anInt7161 + 1);
                    if ((i_56_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff)) {
                        Class346.method3537(class248_sub28_57_, (byte) 109, class248_sub28);
                        return;
                    }
                }
                ((Node_Sub13) class248_sub13).aClass293_6966.method3109(class248_sub28, -119);
            }
        }
    }

    public final void method76(byte i) {
        if (i != -67)
            method1780((byte) 30);
        anInt5189++;
        OpenGL.glBindFramebufferEXT(36008, anInt5172);
        anInt5193 |= 0x1;
        anInt5183 = method1780((byte) 58);
    }

    final void method1783(int i, int i_59_) {
        anInt5184++;
        if (anInterface5Array5173[i_59_] != null)
            anInterface5Array5173[i_59_].method18((byte) 111);
        anInt5195 &= i << i_59_ ^ 0xffffffff;
        anInterface5Array5173[i_59_] = null;
    }

    Class223(ha_Sub2 var_ha_Sub2) {
        anInterface5Array5173 = new Interface5[9];
        anInt5193 = 0;
        if (!((ha_Sub2) var_ha_Sub2).aBoolean5836)
            throw new IllegalStateException("");
        aHa_Sub2_5191 = var_ha_Sub2;
        OpenGL.glGenFramebuffersEXT(1, Class196.anIntArray2236, 0);
        anInt5172 = Class196.anIntArray2236[0];
    }

    final void method1784(int i, boolean bool) {
        anInt5175++;
        if (bool == false) {
            if (anInt5183 == -1)
                throw new RuntimeException();
            OpenGL.glDrawBuffer(Class28.anIntArray4894[i]);
        }
    }

    public final void method73(int i) {
        if (i != -19346)
            anInt5193 = -80;
        anInt5176++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        anInt5193 &= ~0x2;
        anInt5183 = method1780((byte) 44);
    }

    /*synthetic*/
    static Class method1785(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
