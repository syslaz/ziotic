/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class96 {
    private float[] aFloatArray1237 = new float[16];
    static int anInt1238;
    static int anInt1239;
    static int anInt1240;
    static int anInt1241;
    static Class46[] aClass46Array1242 = new Class46[37];
    static int anInt1243;
    static int anInt1244;
    static int anInt1245;
    static int anInt1246;
    static int anInt1247;
    private Node_Sub9_Sub1 aClass248_Sub9_Sub1_1248 = new Node_Sub9_Sub1(786336);
    static int anInt1249;
    private Class140 aClass140_1250;
    private Class140 aClass140_1251;
    private int anInt1252 = Class241.method1930(112, 1600);
    private Interface6 anInterface6_1253;
    private Class140 aClass140_1254;
    private int anInt1255 = 0;
    private Class346_Sub5_Sub2[][] aClass346_Sub5_Sub2ArrayArray1256;
    private int[] anIntArray1257 = new int[8191];
    private int[] anIntArray1258;
    private Class346_Sub5_Sub2[][] aClass346_Sub5_Sub2ArrayArray1259;
    private int[] anIntArray1260;

    private final void method697(ha_Sub2 var_ha_Sub2, int i, byte i_0_) {
        anInt1243++;
        OpenGL.glGetFloatv(2982, aFloatArray1237, 0);
        if (i_0_ > -39)
            method705(27);
        float f = aFloatArray1237[0];
        float f_1_ = aFloatArray1237[4];
        float f_2_ = aFloatArray1237[8];
        float f_3_ = aFloatArray1237[1];
        float f_4_ = aFloatArray1237[5];
        float f_5_ = aFloatArray1237[9];
        float f_6_ = f_3_ + f;
        float f_7_ = f_1_ + f_4_;
        float f_8_ = f_5_ + f_2_;
        float f_9_ = -f_3_ + f;
        float f_10_ = -f_4_ + f_1_;
        float f_11_ = f_2_ - f_5_;
        float f_12_ = -f + f_3_;
        float f_13_ = -f_1_ + f_4_;
        ((ByteStream) aClass248_Sub9_Sub1_1248).offset = 0;
        float f_14_ = f_5_ - f_2_;
        if (((ha_Sub2) var_ha_Sub2).aBoolean5872) {
            for (int i_15_ = -1 + i; i_15_ >= 0; i_15_--) {
                int i_16_ = anIntArray1258[i_15_] <= 64 ? anIntArray1258[i_15_] : 64;
                if ((i_16_ ^ 0xffffffff) < -1) {
                    for (int i_17_ = -1 + i_16_; (i_17_ ^ 0xffffffff) <= -1; i_17_--) {
                        Class346_Sub5_Sub2 class346_sub5_sub2 = aClass346_Sub5_Sub2ArrayArray1259[i_15_][i_17_];
                        int i_18_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                        byte i_19_ = (byte) (i_18_ >> -1322470608);
                        byte i_20_ = (byte) (i_18_ >> -1379687768);
                        byte i_21_ = (byte) i_18_;
                        byte i_22_ = (byte) (i_18_ >>> 469323448);
                        float f_23_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> -1940674996);
                        float f_24_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> -771519668);
                        float f_25_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> 1397878604);
                        int i_26_ = ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) >> 1615915500);
                        aClass248_Sub9_Sub1_1248.method2226(115, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2226(92, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2226(32, f_23_ + (float) -i_26_ * f_6_);
                        aClass248_Sub9_Sub1_1248.method2226(57, f_7_ * (float) -i_26_ + f_24_);
                        aClass248_Sub9_Sub1_1248.method2226(48, f_25_ + (float) -i_26_ * f_8_);
                        aClass248_Sub9_Sub1_1248.writeByte(-61, i_19_);
                        aClass248_Sub9_Sub1_1248.writeByte(-128, i_20_);
                        aClass248_Sub9_Sub1_1248.writeByte(-68, i_21_);
                        aClass248_Sub9_Sub1_1248.writeByte(-32, i_22_);
                        aClass248_Sub9_Sub1_1248.method2226(25, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2226(91, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2226(89, f_9_ * (float) i_26_ + f_23_);
                        aClass248_Sub9_Sub1_1248.method2226(58, f_10_ * (float) i_26_ + f_24_);
                        aClass248_Sub9_Sub1_1248.method2226(116, f_11_ * (float) i_26_ + f_25_);
                        aClass248_Sub9_Sub1_1248.writeByte(-56, i_19_);
                        aClass248_Sub9_Sub1_1248.writeByte(-58, i_20_);
                        aClass248_Sub9_Sub1_1248.writeByte(-97, i_21_);
                        aClass248_Sub9_Sub1_1248.writeByte(-111, i_22_);
                        aClass248_Sub9_Sub1_1248.method2226(124, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2226(84, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2226(75, (float) i_26_ * f_6_ + f_23_);
                        aClass248_Sub9_Sub1_1248.method2226(37, (float) i_26_ * f_7_ + f_24_);
                        aClass248_Sub9_Sub1_1248.method2226(72, (float) i_26_ * f_8_ + f_25_);
                        aClass248_Sub9_Sub1_1248.writeByte(-106, i_19_);
                        aClass248_Sub9_Sub1_1248.writeByte(-49, i_20_);
                        aClass248_Sub9_Sub1_1248.writeByte(-80, i_21_);
                        aClass248_Sub9_Sub1_1248.writeByte(-100, i_22_);
                        aClass248_Sub9_Sub1_1248.method2226(98, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2226(107, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2226(122, f_23_ + f_12_ * (float) i_26_);
                        aClass248_Sub9_Sub1_1248.method2226(115, (float) i_26_ * f_13_ + f_24_);
                        aClass248_Sub9_Sub1_1248.method2226(30, f_14_ * (float) i_26_ + f_25_);
                        aClass248_Sub9_Sub1_1248.writeByte(-35, i_19_);
                        aClass248_Sub9_Sub1_1248.writeByte(-51, i_20_);
                        aClass248_Sub9_Sub1_1248.writeByte(-97, i_21_);
                        aClass248_Sub9_Sub1_1248.writeByte(-51, i_22_);
                    }
                    if ((anIntArray1258[i_15_] ^ 0xffffffff) < -65) {
                        int i_27_ = -64 + (anIntArray1258[i_15_] + -1);
                        for (int i_28_ = -1 + anIntArray1260[i_27_]; i_28_ >= 0; i_28_--) {
                            Class346_Sub5_Sub2 class346_sub5_sub2 = (aClass346_Sub5_Sub2ArrayArray1256[i_27_][i_28_]);
                            int i_29_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                            byte i_30_ = (byte) (i_29_ >> -1283187568);
                            byte i_31_ = (byte) (i_29_ >> -507096728);
                            byte i_32_ = (byte) i_29_;
                            byte i_33_ = (byte) (i_29_ >>> 1897810520);
                            float f_34_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 379432876);
                            float f_35_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> -906339572);
                            float f_36_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1071508180);
                            int i_37_ = ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) >> -1321056500);
                            aClass248_Sub9_Sub1_1248.method2226(126, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2226(77, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2226(61, f_6_ * (float) -i_37_ + f_34_);
                            aClass248_Sub9_Sub1_1248.method2226(124, f_35_ + (float) -i_37_ * f_7_);
                            aClass248_Sub9_Sub1_1248.method2226(54, f_36_ + f_8_ * (float) -i_37_);
                            aClass248_Sub9_Sub1_1248.writeByte(-107, i_30_);
                            aClass248_Sub9_Sub1_1248.writeByte(-25, i_31_);
                            aClass248_Sub9_Sub1_1248.writeByte(-101, i_32_);
                            aClass248_Sub9_Sub1_1248.writeByte(-39, i_33_);
                            aClass248_Sub9_Sub1_1248.method2226(101, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2226(32, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2226(33, f_34_ + f_9_ * (float) i_37_);
                            aClass248_Sub9_Sub1_1248.method2226(47, (float) i_37_ * f_10_ + f_35_);
                            aClass248_Sub9_Sub1_1248.method2226(52, f_11_ * (float) i_37_ + f_36_);
                            aClass248_Sub9_Sub1_1248.writeByte(-95, i_30_);
                            aClass248_Sub9_Sub1_1248.writeByte(-41, i_31_);
                            aClass248_Sub9_Sub1_1248.writeByte(-122, i_32_);
                            aClass248_Sub9_Sub1_1248.writeByte(-50, i_33_);
                            aClass248_Sub9_Sub1_1248.method2226(72, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2226(52, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2226(56, f_34_ + f_6_ * (float) i_37_);
                            aClass248_Sub9_Sub1_1248.method2226(25, (float) i_37_ * f_7_ + f_35_);
                            aClass248_Sub9_Sub1_1248.method2226(88, f_36_ + (float) i_37_ * f_8_);
                            aClass248_Sub9_Sub1_1248.writeByte(-117, i_30_);
                            aClass248_Sub9_Sub1_1248.writeByte(-95, i_31_);
                            aClass248_Sub9_Sub1_1248.writeByte(-47, i_32_);
                            aClass248_Sub9_Sub1_1248.writeByte(-121, i_33_);
                            aClass248_Sub9_Sub1_1248.method2226(91, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2226(97, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2226(127, f_34_ + (float) i_37_ * f_12_);
                            aClass248_Sub9_Sub1_1248.method2226(41, f_35_ + (float) i_37_ * f_13_);
                            aClass248_Sub9_Sub1_1248.method2226(127, (((float) i_37_ * f_14_) + f_36_));
                            aClass248_Sub9_Sub1_1248.writeByte(-58, i_30_);
                            aClass248_Sub9_Sub1_1248.writeByte(-40, i_31_);
                            aClass248_Sub9_Sub1_1248.writeByte(-28, i_32_);
                            aClass248_Sub9_Sub1_1248.writeByte(-84, i_33_);
                        }
                    }
                }
            }
        } else {
            for (int i_38_ = i - 1; (i_38_ ^ 0xffffffff) <= -1; i_38_--) {
                int i_39_ = anIntArray1258[i_38_] > 64 ? 64 : anIntArray1258[i_38_];
                if ((i_39_ ^ 0xffffffff) < -1) {
                    for (int i_40_ = i_39_ - 1; (i_40_ ^ 0xffffffff) <= -1; i_40_--) {
                        Class346_Sub5_Sub2 class346_sub5_sub2 = aClass346_Sub5_Sub2ArrayArray1259[i_38_][i_40_];
                        int i_41_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                        byte i_42_ = (byte) (i_41_ >> -1940937200);
                        byte i_43_ = (byte) (i_41_ >> 862444584);
                        byte i_44_ = (byte) i_41_;
                        byte i_45_ = (byte) (i_41_ >>> 2026547928);
                        float f_46_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 620093196);
                        float f_47_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> -2007395444);
                        float f_48_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1741153332);
                        int i_49_ = ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) >> -1732251572);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_6_ * (float) -i_49_ + f_46_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, (float) -i_49_ * f_7_ + f_47_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_48_ + f_8_ * (float) -i_49_);
                        aClass248_Sub9_Sub1_1248.writeByte(-58, i_42_);
                        aClass248_Sub9_Sub1_1248.writeByte(-71, i_43_);
                        aClass248_Sub9_Sub1_1248.writeByte(-20, i_44_);
                        aClass248_Sub9_Sub1_1248.writeByte(-40, i_45_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_46_ + (float) i_49_ * f_9_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_47_ + (float) i_49_ * f_10_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_48_ + f_11_ * (float) i_49_);
                        aClass248_Sub9_Sub1_1248.writeByte(-21, i_42_);
                        aClass248_Sub9_Sub1_1248.writeByte(-125, i_43_);
                        aClass248_Sub9_Sub1_1248.writeByte(-97, i_44_);
                        aClass248_Sub9_Sub1_1248.writeByte(-41, i_45_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_46_ + (float) i_49_ * f_6_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_7_ * (float) i_49_ + f_47_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_48_ + (float) i_49_ * f_8_);
                        aClass248_Sub9_Sub1_1248.writeByte(-127, i_42_);
                        aClass248_Sub9_Sub1_1248.writeByte(-119, i_43_);
                        aClass248_Sub9_Sub1_1248.writeByte(-67, i_44_);
                        aClass248_Sub9_Sub1_1248.writeByte(-81, i_45_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                        aClass248_Sub9_Sub1_1248.method2225(4440, (float) i_49_ * f_12_ + f_46_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_47_ + (float) i_49_ * f_13_);
                        aClass248_Sub9_Sub1_1248.method2225(4440, f_48_ + (float) i_49_ * f_14_);
                        aClass248_Sub9_Sub1_1248.writeByte(-46, i_42_);
                        aClass248_Sub9_Sub1_1248.writeByte(-117, i_43_);
                        aClass248_Sub9_Sub1_1248.writeByte(-28, i_44_);
                        aClass248_Sub9_Sub1_1248.writeByte(-68, i_45_);
                    }
                    if ((anIntArray1258[i_38_] ^ 0xffffffff) < -65) {
                        int i_50_ = -65 + anIntArray1258[i_38_];
                        for (int i_51_ = -1 + anIntArray1260[i_50_]; (i_51_ ^ 0xffffffff) <= -1; i_51_--) {
                            Class346_Sub5_Sub2 class346_sub5_sub2 = (aClass346_Sub5_Sub2ArrayArray1256[i_50_][i_51_]);
                            int i_52_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                            byte i_53_ = (byte) (i_52_ >> -1723004560);
                            byte i_54_ = (byte) (i_52_ >> -1909392120);
                            byte i_55_ = (byte) i_52_;
                            byte i_56_ = (byte) (i_52_ >>> -1364915400);
                            float f_57_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 1225265868);
                            float f_58_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 2140318828);
                            float f_59_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1407753492);
                            int i_60_ = ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) >> 42981804);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_57_ + f_6_ * (float) -i_60_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_7_ * (float) -i_60_ + f_58_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_59_ + f_8_ * (float) -i_60_);
                            aClass248_Sub9_Sub1_1248.writeByte(-64, i_53_);
                            aClass248_Sub9_Sub1_1248.writeByte(-107, i_54_);
                            aClass248_Sub9_Sub1_1248.writeByte(-50, i_55_);
                            aClass248_Sub9_Sub1_1248.writeByte(-81, i_56_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, (((float) i_60_ * f_9_) + f_57_));
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_10_ * (float) i_60_ + f_58_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_59_ + (float) i_60_ * f_11_);
                            aClass248_Sub9_Sub1_1248.writeByte(-41, i_53_);
                            aClass248_Sub9_Sub1_1248.writeByte(-24, i_54_);
                            aClass248_Sub9_Sub1_1248.writeByte(-52, i_55_);
                            aClass248_Sub9_Sub1_1248.writeByte(-79, i_56_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_57_ + (float) i_60_ * f_6_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_7_ * (float) i_60_ + f_58_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, (((float) i_60_ * f_8_) + f_59_));
                            aClass248_Sub9_Sub1_1248.writeByte(-42, i_53_);
                            aClass248_Sub9_Sub1_1248.writeByte(-85, i_54_);
                            aClass248_Sub9_Sub1_1248.writeByte(-119, i_55_);
                            aClass248_Sub9_Sub1_1248.writeByte(-79, i_56_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 0.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, 1.0F);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_12_ * (float) i_60_ + f_57_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, f_58_ + (float) i_60_ * f_13_);
                            aClass248_Sub9_Sub1_1248.method2225(4440, (((float) i_60_ * f_14_) + f_59_));
                            aClass248_Sub9_Sub1_1248.writeByte(-110, i_53_);
                            aClass248_Sub9_Sub1_1248.writeByte(-88, i_54_);
                            aClass248_Sub9_Sub1_1248.writeByte(-112, i_55_);
                            aClass248_Sub9_Sub1_1248.writeByte(-93, i_56_);
                        }
                    }
                }
            }
        }
        if ((((ByteStream) aClass248_Sub9_Sub1_1248).offset ^ 0xffffffff) != -1) {
            anInterface6_1253.method19((byte) 77, ((ByteStream) aClass248_Sub9_Sub1_1248).offset, 24, ((ByteStream) aClass248_Sub9_Sub1_1248).buffer);
            var_ha_Sub2.method843(32886, aClass140_1251, aClass140_1250, null, aClass140_1254);
            var_ha_Sub2.method876(7, 24873, (((ByteStream) aClass248_Sub9_Sub1_1248).offset) / 24, 0);
        }
    }

    static final void method698(int i, int i_61_, int i_62_, int i_63_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_61_][i_62_];
        if (class137 != null) {
            Class346_Sub7_Sub1 class346_sub7_sub1 = ((Class137) class137).aClass346_Sub7_Sub1_1644;
            Class346_Sub7_Sub1 class346_sub7_sub1_64_ = ((Class137) class137).aClass346_Sub7_Sub1_1642;
            if (class346_sub7_sub1 != null) {
                ((Class346_Sub7_Sub1) class346_sub7_sub1).aShort9910 = (short) ((((Class346_Sub7_Sub1) class346_sub7_sub1).aShort9910) * i_63_ / (16 << anInt1249 - 7));
                ((Class346_Sub7_Sub1) class346_sub7_sub1).aShort9901 = (short) ((((Class346_Sub7_Sub1) class346_sub7_sub1).aShort9901) * i_63_ / (16 << anInt1249 - 7));
            }
            if (class346_sub7_sub1_64_ != null) {
                ((Class346_Sub7_Sub1) class346_sub7_sub1_64_).aShort9910 = (short) ((((Class346_Sub7_Sub1) class346_sub7_sub1_64_).aShort9910) * i_63_ / (16 << anInt1249 - 7));
                ((Class346_Sub7_Sub1) class346_sub7_sub1_64_).aShort9901 = (short) ((((Class346_Sub7_Sub1) class346_sub7_sub1_64_).aShort9901) * i_63_ / (16 << anInt1249 - 7));
            }
        }
    }

    private final void method699(ha_Sub2 var_ha_Sub2, int i) {
        var_ha_Sub2.method870(i + 28985, true);
        anInt1244++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (i != -28936)
            aFloatArray1237 = null;
        if (((ha_Sub2) var_ha_Sub2).aFloat5878 != Node_Sub46.aFloat7376)
            var_ha_Sub2.xa(Node_Sub46.aFloat7376);
    }

    static final void method700(int i, Class56 class56, int i_65_, ha var_ha, int i_66_, Node_Sub35 class248_sub35, int i_67_, int i_68_, Class243 class243) {
        anInt1245++;
        int i_69_ = -5 + -(i / 2) + i_66_;
        int i_70_ = i_67_ + 2;
        if ((((Class56) class56).anInt746 ^ 0xffffffff) != -1)
            var_ha.method820(i + 10, 19, (-i_70_ + i_67_ - -(i_68_ * class243.method1936()) - -1), i_70_, i_69_, ((Class56) class56).anInt746);
        if ((((Class56) class56).anInt762 ^ 0xffffffff) != -1)
            var_ha.method812(i_67_ - (-(i_68_ * class243.method1936()) + i_70_ - 1), ((Class56) class56).anInt762, i - -10, 110, i_70_, i_69_);
        int i_71_ = ((Class56) class56).anInt779;
        if (((Node_Sub35) class248_sub35).aBoolean7242 && (((Class56) class56).anInt752 ^ 0xffffffff) != 0)
            i_71_ = ((Class56) class56).anInt752;
        if (i_65_ != 9997)
            method704(false);
        for (int i_72_ = 0; i_72_ < i_68_; i_72_++) {
            String string = WorldAddress.aStringArray1196[i_72_];
            if ((i_68_ - 1 ^ 0xffffffff) < (i_72_ ^ 0xffffffff))
                string = string.substring(0, string.length() - 4);
            class243.method1939(var_ha, string, i_66_, i_67_, i_71_, true);
            i_67_ += class243.method1936();
        }
    }

    private final void method701(ha_Sub2 var_ha_Sub2, int i) {
        Node_Sub46.aFloat7376 = ((ha_Sub2) var_ha_Sub2).aFloat5878;
        anInt1247++;
        var_ha_Sub2.method863(-1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(i);
        var_ha_Sub2.method870(40, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    static final void method702(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, byte i_79_) {
        anInt1246++;
        if (i_79_ != -47)
            method702(-57, 101, -21, -124, 89, 42, 38, (byte) -120);
        if ((Class302.anInt3500 ^ 0xffffffff) < (i_74_ ^ 0xffffffff) || (Class289.anInt3399 ^ 0xffffffff) > (i ^ 0xffffffff) || Class181.anInt2099 > i_77_ || i_75_ > aa_Sub3.anInt5270)
            Class51.method406(i_78_, i_76_, i, i_75_, i_77_, i_73_, i_79_ ^ 0x7145, i_74_);
        else
            aa_Sub1.method156(i_74_, i_78_, i_73_, i_75_, i, -123, i_76_, i_77_);
    }

    final void method703(ha_Sub2 var_ha_Sub2, int i) {
        anInt1239++;
        anInterface6_1253 = var_ha_Sub2.method869((byte) -41, 196584, true, 24, null);
        aClass140_1251 = new Class140(anInterface6_1253, 5126, 2, 0);
        aClass140_1250 = new Class140(anInterface6_1253, 5126, 3, 8);
        if (i <= 88)
            method703(null, -74);
        aClass140_1254 = new Class140(anInterface6_1253, 5121, 4, 20);
    }

    static final void method704(boolean bool) {
        anInt1240++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(0, -874792672, 15);
        if (bool == false)
            class248_sub8_sub10.method2076(-89);
    }

    public static void method705(int i) {
        aClass46Array1242 = null;
        if (i != 1751)
            method700(-83, null, -2, null, 121, null, 32, -120, null);
    }

    final void method706(Class338 class338, boolean bool, ha_Sub2 var_ha_Sub2, int i) {
        anInt1241++;
        if (((ha_Sub2) var_ha_Sub2).aClass238_Sub3_5832 != null) {
            if ((i ^ 0xffffffff) > -1)
                method701(var_ha_Sub2, 16385);
            else
                method707(var_ha_Sub2, (byte) 126, i);
            float f = (((Class238_Sub3) ((ha_Sub2) var_ha_Sub2).aClass238_Sub3_5832).aFloat6775);
            float f_80_ = (((Class238_Sub3) ((ha_Sub2) var_ha_Sub2).aClass238_Sub3_5832).aFloat6791);
            float f_81_ = (((Class238_Sub3) ((ha_Sub2) var_ha_Sub2).aClass238_Sub3_5832).aFloat6793);
            float f_82_ = (((Class238_Sub3) ((ha_Sub2) var_ha_Sub2).aClass238_Sub3_5832).aFloat6797);
            try {
                int i_83_ = 0;
                int i_84_ = 2147483647;
                int i_85_ = 0;
                Class346_Sub5 class346_sub5 = (((Class26) ((Class338) class338).aClass26_3941).aClass346_Sub5_346);
                for (Class346_Sub5 class346_sub5_86_ = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279; class346_sub5_86_ != class346_sub5; class346_sub5_86_ = (((Class346_Sub5) class346_sub5_86_).aClass346_Sub5_8279)) {
                    Class346_Sub5_Sub2 class346_sub5_sub2 = (Class346_Sub5_Sub2) class346_sub5_86_;
                    int i_87_ = (int) (f_82_ + ((float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1923951636) * f_81_ + ((float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 1936368332) * f_80_ + f * (float) ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894) >> -39817812))));
                    if (i_87_ > i_85_)
                        i_85_ = i_87_;
                    if ((i_84_ ^ 0xffffffff) < (i_87_ ^ 0xffffffff))
                        i_84_ = i_87_;
                    anIntArray1257[i_83_++] = i_87_;
                }
                int i_88_ = -i_84_ + i_85_;
                int i_89_;
                if (2 + i_88_ > 1600) {
                    i_89_ = 1 - -Class241.method1930(93, i_88_) - anInt1252;
                    i_88_ = 2 + (i_88_ >> i_89_);
                } else {
                    i_88_ += 2;
                    i_89_ = 0;
                }
                i_83_ = 0;
                Class346_Sub5 class346_sub5_90_ = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279;
                int i_91_ = -2;
                boolean bool_92_ = bool;
                boolean bool_93_ = true;
                while (class346_sub5_90_ != class346_sub5) {
                    anInt1255 = 0;
                    for (int i_94_ = 0; (i_94_ ^ 0xffffffff) > (i_88_ ^ 0xffffffff); i_94_++)
                        anIntArray1258[i_94_] = 0;
                    for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > -65; i_95_++)
                        anIntArray1260[i_95_] = 0;
                    for (/**/; class346_sub5_90_ != class346_sub5; class346_sub5_90_ = (((Class346_Sub5) class346_sub5_90_).aClass346_Sub5_8279)) {
                        Class346_Sub5_Sub2 class346_sub5_sub2 = (Class346_Sub5_Sub2) class346_sub5_90_;
                        if (bool_93_) {
                            bool_93_ = false;
                            bool_92_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).aBoolean9898);
                            i_91_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9899);
                        }
                        if ((i_83_ ^ 0xffffffff) < -1 && (((i_91_ ^ 0xffffffff) != ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9899) ^ 0xffffffff)) || (((Class346_Sub5_Sub2) class346_sub5_sub2).aBoolean9898) == !bool_92_)) {
                            bool_93_ = true;
                            break;
                        }
                        int i_96_ = anIntArray1257[i_83_++] - i_84_ >> i_89_;
                        if ((i_96_ ^ 0xffffffff) > -1601) {
                            if ((anIntArray1258[i_96_] ^ 0xffffffff) > -65)
                                aClass346_Sub5_Sub2ArrayArray1259[i_96_][anIntArray1258[i_96_]++] = class346_sub5_sub2;
                            else {
                                if (anIntArray1258[i_96_] == 64) {
                                    if (anInt1255 == 64)
                                        continue;
                                    anIntArray1258[i_96_] += anInt1255++ + 1;
                                }
                                aClass346_Sub5_Sub2ArrayArray1256[anIntArray1258[i_96_] + -65][anIntArray1260[(anIntArray1258[i_96_] + -65)]++] = class346_sub5_sub2;
                            }
                        }
                    }
                    if ((i_91_ ^ 0xffffffff) > -1)
                        var_ha_Sub2.method882(-1, (byte) -108);
                    else
                        var_ha_Sub2.method882(i_91_, (byte) -63);
                    if (!bool_92_ || (Node_Sub46.aFloat7376 == ((ha_Sub2) var_ha_Sub2).aFloat5878)) {
                        if (((ha_Sub2) var_ha_Sub2).aFloat5878 != 1.0F)
                            var_ha_Sub2.xa(1.0F);
                    } else
                        var_ha_Sub2.xa(Node_Sub46.aFloat7376);
                    method697(var_ha_Sub2, i_88_, (byte) -96);
                }
            } catch (Exception exception) {
                /* empty */
            }
            method699(var_ha_Sub2, -28936);
        }
    }

    private final void method707(ha_Sub2 var_ha_Sub2, byte i, int i_97_) {
        anInt1238++;
        Node_Sub46.aFloat7376 = ((ha_Sub2) var_ha_Sub2).aFloat5878;
        var_ha_Sub2.method867((float) i_97_, false);
        var_ha_Sub2.method854(-125);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        var_ha_Sub2.method870(i + -38, false);
        if (i != 126)
            method698(-128, 115, -37, -128);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    Class96() {
        aClass346_Sub5_Sub2ArrayArray1256 = new Class346_Sub5_Sub2[64][768];
        aClass346_Sub5_Sub2ArrayArray1259 = new Class346_Sub5_Sub2[1600][64];
        anIntArray1260 = new int[64];
        anIntArray1258 = new int[1600];
    }
}
