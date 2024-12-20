/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class59 {
    private Class185 aClass185_792;
    private int[] anIntArray793 = new int[1600];
    static int anInt794;
    private int[] anIntArray795 = new int[8191];
    static int anInt796;
    static int anInt797;
    private Interface18_Impl1 anInterface18_Impl1_798;
    private Interface18_Impl1 anInterface18_Impl1_799;
    static int anInt800;
    static int anInt801;
    static int anInt802;
    static IncommingOpcode aIncommingOpcode_803 = new IncommingOpcode(98, -1);
    private Interface18_Impl2 anInterface18_Impl2_804;
    private int[] anIntArray805;
    private Class346_Sub5_Sub2[][] aClass346_Sub5_Sub2ArrayArray806 = new Class346_Sub5_Sub2[1600][64];
    static int anInt807;
    static int[][][] anIntArrayArrayArray808;
    private int anInt809 = 0;
    static int anInt810;
    static String[] aStringArray811 = new String[100];
    static int anInt812;
    static int anInt813;
    static int[] anIntArray814 = new int[14];
    static int anInt815;
    static int anInt816;
    private Class346_Sub5_Sub2[][] aClass346_Sub5_Sub2ArrayArray817;
    static int anInt818;

    public static void method460(int i) {
        aIncommingOpcode_803 = null;
        if (i != -16766)
            method460(48);
        aStringArray811 = null;
        anIntArrayArrayArray808 = null;
        anIntArray814 = null;
    }

    final void method461(ha_Sub3 var_ha_Sub3, Class338 class338, int i, int i_0_) {
        anInt802++;
        if (((ha_Sub3) var_ha_Sub3).aClass238_Sub2_6147 != null) {
            if ((i ^ 0xffffffff) > -1)
                method467(var_ha_Sub3, true);
            else
                method465(var_ha_Sub3, -1, i);
            float f = (((Class238_Sub2) ((ha_Sub3) var_ha_Sub3).aClass238_Sub2_6147).aFloat6728);
            float f_1_ = (((Class238_Sub2) ((ha_Sub3) var_ha_Sub3).aClass238_Sub2_6147).aFloat6744);
            float f_2_ = (((Class238_Sub2) ((ha_Sub3) var_ha_Sub3).aClass238_Sub2_6147).aFloat6754);
            float f_3_ = (((Class238_Sub2) ((ha_Sub3) var_ha_Sub3).aClass238_Sub2_6147).aFloat6706);
            try {
                int i_4_ = 0;
                int i_5_ = 2147483647;
                int i_6_ = i_0_;
                Class346_Sub5 class346_sub5 = (((Class26) ((Class338) class338).aClass26_3941).aClass346_Sub5_346);
                for (Class346_Sub5 class346_sub5_7_ = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279; class346_sub5 != class346_sub5_7_; class346_sub5_7_ = (((Class346_Sub5) class346_sub5_7_).aClass346_Sub5_8279)) {
                    Class346_Sub5_Sub2 class346_sub5_sub2 = (Class346_Sub5_Sub2) class346_sub5_7_;
                    int i_8_ = (int) ((float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1174648212) * f_2_ + (f_1_ * (float) ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891) >> 1307993772) + (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 244535372) * f) + f_3_);
                    anIntArray795[i_4_++] = i_8_;
                    if (i_5_ > i_8_)
                        i_5_ = i_8_;
                    if ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
                        i_6_ = i_8_;
                }
                int i_9_ = i_6_ - i_5_;
                int i_10_;
                if (i_9_ + 2 <= 1600) {
                    i_9_ += 2;
                    i_10_ = 0;
                } else {
                    i_10_ = 1 + (Class241.method1930(125, i_9_) - Class346_Sub1.anInt8245);
                    i_9_ = (i_9_ >> i_10_) + 2;
                }
                i_4_ = 0;
                Class346_Sub5 class346_sub5_11_ = ((Class346_Sub5) class346_sub5).aClass346_Sub5_8279;
                int i_12_ = -2;
                boolean bool = true;
                boolean bool_13_ = true;
                while (class346_sub5 != class346_sub5_11_) {
                    anInt809 = 0;
                    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_14_++)
                        anIntArray793[i_14_] = 0;
                    for (int i_15_ = 0; i_15_ < 64; i_15_++)
                        anIntArray805[i_15_] = 0;
                    for (/**/; class346_sub5_11_ != class346_sub5; class346_sub5_11_ = (((Class346_Sub5) class346_sub5_11_).aClass346_Sub5_8279)) {
                        Class346_Sub5_Sub2 class346_sub5_sub2 = (Class346_Sub5_Sub2) class346_sub5_11_;
                        if (bool_13_) {
                            i_12_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9899);
                            bool_13_ = false;
                            bool = (((Class346_Sub5_Sub2) class346_sub5_sub2).aBoolean9898);
                        }
                        if (i_4_ > 0 && ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9899) != i_12_ || !(((Class346_Sub5_Sub2) class346_sub5_sub2).aBoolean9898) == bool)) {
                            bool_13_ = true;
                            break;
                        }
                        int i_16_ = -i_5_ + anIntArray795[i_4_++] >> i_10_;
                        if ((i_16_ ^ 0xffffffff) > -1601) {
                            if ((anIntArray793[i_16_] ^ 0xffffffff) <= -65) {
                                if (anIntArray793[i_16_] == 64) {
                                    if ((anInt809 ^ 0xffffffff) == -65)
                                        continue;
                                    anIntArray793[i_16_] += anInt809++ + 1;
                                }
                                aClass346_Sub5_Sub2ArrayArray817[-64 + (anIntArray793[i_16_] - 1)][anIntArray805[-1 + (anIntArray793[i_16_] + -64)]++] = class346_sub5_sub2;
                            } else
                                aClass346_Sub5_Sub2ArrayArray806[i_16_][anIntArray793[i_16_]++] = class346_sub5_sub2;
                        }
                    }
                    var_ha_Sub3.method962(((i_12_ ^ 0xffffffff) <= -1 ? i_12_ : -1), 51, false, false);
                    if (bool && (((ha_Sub3) var_ha_Sub3).aFloat6170 != Class152.aFloat1807))
                        var_ha_Sub3.xa(Class152.aFloat1807);
                    else if (((ha_Sub3) var_ha_Sub3).aFloat6170 != 1.0F)
                        var_ha_Sub3.xa(1.0F);
                    method466(var_ha_Sub3, 0, i_9_);
                }
            } catch (Exception exception) {
                /* empty */
            }
            method464(7160, var_ha_Sub3);
        }
    }

    final void method462(int i, ha_Sub3 var_ha_Sub3) {
        anInterface18_Impl1_799.method2(24, -30987, 786336);
        anInt812++;
        if (i <= 90)
            method467(null, false);
    }

    static final void method463(byte i, Entity entity) {
        anInt816++;
        int i_17_ = 15 % ((-68 - i) / 43);
        boolean bool = false;
        if (((Node_Sub18.anInt7027 ^ 0xffffffff) == (((Entity) entity).forceMovementSpeed2 ^ 0xffffffff)) || (((Entity) entity).anInt10444 ^ 0xffffffff) == 0 || (((Entity) entity).anInt10424 != 0))
            bool = true;
        else {
            Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, (((Entity) entity).anInt10444)));
            if (((Class182) class182).aBoolean2115 || (1 + (((Entity) entity).anInt10466) > (((Class182) class182).anIntArray2113[(((Entity) entity).anInt10420)])))
                bool = true;
        }
        if (bool) {
            int i_18_ = ((((Entity) entity).forceMovementSpeed2) - (((Entity) entity).forceMovementSpeed1));
            int i_19_ = (Node_Sub18.anInt7027 + -(((Entity) entity).forceMovementSpeed1));
            int i_20_ = ((((Entity) entity).forceMovementX1) * 512 + 256 * entity.method3632(-1));
            int i_21_ = (512 * (((Entity) entity).forceMovementY1) - -(256 * entity.method3632(-1)));
            int i_22_ = ((((Entity) entity).forceMovementX2) * 512 + 256 * entity.method3632(-1));
            int i_23_ = ((((Entity) entity).forceMovementY2) * 512 + 256 * entity.method3632(-1));
            ((Interactable) entity).x = (i_22_ * i_19_ + (-i_19_ + i_18_) * i_20_) / i_18_;
            ((Interactable) entity).y = ((i_18_ + -i_19_) * i_21_ - -(i_19_ * i_23_)) / i_18_;
        }
        ((Entity) entity).anInt10500 = 0;
        if ((((Entity) entity).forceMovementDirection ^ 0xffffffff) == -1)
            entity.method3644((byte) -17, 8192, false);
        if ((((Entity) entity).forceMovementDirection ^ 0xffffffff) == -2)
            entity.method3644((byte) -17, 12288, false);
        if ((((Entity) entity).forceMovementDirection ^ 0xffffffff) == -3)
            entity.method3644((byte) -17, 0, false);
        if ((((Entity) entity).forceMovementDirection ^ 0xffffffff) == -4)
            entity.method3644((byte) -17, 4096, false);
    }

    private final void method464(int i, ha_Sub3 var_ha_Sub3) {
        anInt796++;
        var_ha_Sub3.method950((byte) 36, true);
        if (i == 7160) {
            var_ha_Sub3.method1024((byte) 123, true);
            if (Class152.aFloat1807 != ((ha_Sub3) var_ha_Sub3).aFloat6170)
                var_ha_Sub3.xa(Class152.aFloat1807);
        }
    }

    private final void method465(ha_Sub3 var_ha_Sub3, int i, int i_24_) {
        anInt797++;
        Class152.aFloat1807 = ((ha_Sub3) var_ha_Sub3).aFloat6170;
        var_ha_Sub3.method977((float) i_24_, -106);
        if (i == -1) {
            var_ha_Sub3.method1052((byte) -53);
            var_ha_Sub3.method1024((byte) 70, false);
            var_ha_Sub3.method950((byte) 36, false);
            var_ha_Sub3.method1003(i ^ ~0x5817);
        }
    }

    private final void method466(ha_Sub3 var_ha_Sub3, int i, int i_25_) {
        anInt813++;
        int i_26_ = i;
        Class238_Sub2 class238_sub2 = var_ha_Sub3.method1019((byte) 17);
        float f = ((Class238_Sub2) class238_sub2).aFloat6711;
        float f_27_ = ((Class238_Sub2) class238_sub2).aFloat6750;
        float f_28_ = ((Class238_Sub2) class238_sub2).aFloat6726;
        float f_29_ = ((Class238_Sub2) class238_sub2).aFloat6713;
        float f_30_ = ((Class238_Sub2) class238_sub2).aFloat6737;
        float f_31_ = ((Class238_Sub2) class238_sub2).aFloat6724;
        float f_32_ = f_29_ + f;
        float f_33_ = f_27_ + f_30_;
        float f_34_ = f_28_ + f_31_;
        float f_35_ = f - f_29_;
        float f_36_ = -f_30_ + f_27_;
        float f_37_ = f_28_ - f_31_;
        float f_38_ = f_29_ - f;
        float f_39_ = f_30_ - f_27_;
        float f_40_ = -f_28_ + f_31_;
        Buffer buffer = anInterface18_Impl1_799.method1(-4448, true);
        if (buffer != null) {
            Stream stream = var_ha_Sub3.method926((byte) -20, buffer);
            if (!Stream.b()) {
                for (int i_41_ = i_25_ - 1; (i_41_ ^ 0xffffffff) <= -1; i_41_--) {
                    int i_42_ = ((anIntArray793[i_41_] ^ 0xffffffff) < -65 ? 64 : anIntArray793[i_41_]);
                    if ((i_42_ ^ 0xffffffff) < -1) {
                        for (int i_43_ = i_42_ + -1; (i_43_ ^ 0xffffffff) <= -1; i_43_--) {
                            Class346_Sub5_Sub2 class346_sub5_sub2 = (aClass346_Sub5_Sub2ArrayArray806[i_41_][i_43_]);
                            int i_44_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                            byte i_45_ = (byte) (i_44_ >> 1362124304);
                            byte i_46_ = (byte) (i_44_ >> -865218200);
                            byte i_47_ = (byte) i_44_;
                            byte i_48_ = (byte) (i_44_ >>> 1411721656);
                            float f_49_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> -1076614100);
                            float f_50_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> -2145212500);
                            float f_51_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1367361620);
                            int i_52_ = ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) >> 430151948);
                            stream.b(f_32_ * (float) -i_52_ + f_49_);
                            stream.b((float) -i_52_ * f_33_ + f_50_);
                            stream.b((float) -i_52_ * f_34_ + f_51_);
                            if (((ha_Sub3) var_ha_Sub3).anInt6251 != 0)
                                stream.a(i_45_, i_46_, i_47_, i_48_);
                            else
                                stream.b(i_45_, i_46_, i_47_, i_48_);
                            stream.b(0.0F);
                            stream.b(0.0F);
                            stream.b((float) i_52_ * f_35_ + f_49_);
                            stream.b(f_50_ + f_36_ * (float) i_52_);
                            stream.b(f_37_ * (float) i_52_ + f_51_);
                            if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) != -1)
                                stream.a(i_45_, i_46_, i_47_, i_48_);
                            else
                                stream.b(i_45_, i_46_, i_47_, i_48_);
                            stream.b(1.0F);
                            stream.b(0.0F);
                            stream.b(f_49_ + f_32_ * (float) i_52_);
                            stream.b(f_33_ * (float) i_52_ + f_50_);
                            stream.b(f_34_ * (float) i_52_ + f_51_);
                            if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) != -1)
                                stream.a(i_45_, i_46_, i_47_, i_48_);
                            else
                                stream.b(i_45_, i_46_, i_47_, i_48_);
                            stream.b(1.0F);
                            stream.b(1.0F);
                            stream.b(f_49_ + (float) i_52_ * f_38_);
                            stream.b(f_50_ + f_39_ * (float) i_52_);
                            stream.b((float) i_52_ * f_40_ + f_51_);
                            if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) != -1)
                                stream.a(i_45_, i_46_, i_47_, i_48_);
                            else
                                stream.b(i_45_, i_46_, i_47_, i_48_);
                            stream.b(0.0F);
                            i_26_++;
                            stream.b(1.0F);
                        }
                        if (anIntArray793[i_41_] > 64) {
                            int i_53_ = -1 + (anIntArray793[i_41_] + -64);
                            for (int i_54_ = anIntArray805[i_53_] - 1; i_54_ >= 0; i_54_--) {
                                Class346_Sub5_Sub2 class346_sub5_sub2 = (aClass346_Sub5_Sub2ArrayArray817[i_53_][i_54_]);
                                int i_55_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                                byte i_56_ = (byte) (i_55_ >> 681421456);
                                byte i_57_ = (byte) (i_55_ >> 2115676776);
                                byte i_58_ = (byte) i_55_;
                                byte i_59_ = (byte) (i_55_ >>> -892657256);
                                float f_60_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> -143447540);
                                float f_61_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 94498572);
                                float f_62_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> 1661111564);
                                int i_63_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896 >> 1230960140);
                                stream.b(f_60_ + (float) -i_63_ * f_32_);
                                stream.b(f_61_ + f_33_ * (float) -i_63_);
                                stream.b((float) -i_63_ * f_34_ + f_62_);
                                if (((ha_Sub3) var_ha_Sub3).anInt6251 == 0)
                                    stream.b(i_56_, i_57_, i_58_, i_59_);
                                else
                                    stream.a(i_56_, i_57_, i_58_, i_59_);
                                stream.b(0.0F);
                                stream.b(0.0F);
                                stream.b(f_35_ * (float) i_63_ + f_60_);
                                stream.b((float) i_63_ * f_36_ + f_61_);
                                stream.b((float) i_63_ * f_37_ + f_62_);
                                if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) != -1)
                                    stream.a(i_56_, i_57_, i_58_, i_59_);
                                else
                                    stream.b(i_56_, i_57_, i_58_, i_59_);
                                stream.b(1.0F);
                                stream.b(0.0F);
                                stream.b(f_32_ * (float) i_63_ + f_60_);
                                stream.b(f_61_ + (float) i_63_ * f_33_);
                                stream.b(f_34_ * (float) i_63_ + f_62_);
                                if (((ha_Sub3) var_ha_Sub3).anInt6251 == 0)
                                    stream.b(i_56_, i_57_, i_58_, i_59_);
                                else
                                    stream.a(i_56_, i_57_, i_58_, i_59_);
                                stream.b(1.0F);
                                stream.b(1.0F);
                                stream.b(f_38_ * (float) i_63_ + f_60_);
                                stream.b((float) i_63_ * f_39_ + f_61_);
                                stream.b(f_62_ + f_40_ * (float) i_63_);
                                if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) == -1)
                                    stream.b(i_56_, i_57_, i_58_, i_59_);
                                else
                                    stream.a(i_56_, i_57_, i_58_, i_59_);
                                stream.b(0.0F);
                                i_26_++;
                                stream.b(1.0F);
                            }
                        }
                    }
                }
            } else {
                for (int i_64_ = -1 + i_25_; i_64_ >= 0; i_64_--) {
                    int i_65_ = (anIntArray793[i_64_] <= 64 ? anIntArray793[i_64_] : 64);
                    if ((i_65_ ^ 0xffffffff) < -1) {
                        for (int i_66_ = i_65_ - 1; (i_66_ ^ 0xffffffff) <= -1; i_66_--) {
                            Class346_Sub5_Sub2 class346_sub5_sub2 = (aClass346_Sub5_Sub2ArrayArray806[i_64_][i_66_]);
                            int i_67_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                            byte i_68_ = (byte) (i_67_ >> -372519376);
                            byte i_69_ = (byte) (i_67_ >> 1529343880);
                            byte i_70_ = (byte) i_67_;
                            byte i_71_ = (byte) (i_67_ >>> 1482515768);
                            float f_72_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> -2007284244);
                            float f_73_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 1799586220);
                            float f_74_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -347863636);
                            int i_75_ = ((((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896) >> 40103596);
                            stream.a(f_72_ + (float) -i_75_ * f_32_);
                            stream.a(f_73_ + f_33_ * (float) -i_75_);
                            stream.a(f_34_ * (float) -i_75_ + f_74_);
                            if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) == -1)
                                stream.b(i_68_, i_69_, i_70_, i_71_);
                            else
                                stream.a(i_68_, i_69_, i_70_, i_71_);
                            stream.a(0.0F);
                            stream.a(0.0F);
                            stream.a(f_72_ + (float) i_75_ * f_35_);
                            stream.a((float) i_75_ * f_36_ + f_73_);
                            stream.a(f_74_ + f_37_ * (float) i_75_);
                            if (((ha_Sub3) var_ha_Sub3).anInt6251 == 0)
                                stream.b(i_68_, i_69_, i_70_, i_71_);
                            else
                                stream.a(i_68_, i_69_, i_70_, i_71_);
                            stream.a(1.0F);
                            stream.a(0.0F);
                            stream.a(f_72_ + (float) i_75_ * f_32_);
                            stream.a((float) i_75_ * f_33_ + f_73_);
                            stream.a(f_74_ + f_34_ * (float) i_75_);
                            if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) == -1)
                                stream.b(i_68_, i_69_, i_70_, i_71_);
                            else
                                stream.a(i_68_, i_69_, i_70_, i_71_);
                            stream.a(1.0F);
                            stream.a(1.0F);
                            stream.a(f_38_ * (float) i_75_ + f_72_);
                            stream.a(f_73_ + (float) i_75_ * f_39_);
                            stream.a(f_74_ + (float) i_75_ * f_40_);
                            if (((ha_Sub3) var_ha_Sub3).anInt6251 != 0)
                                stream.a(i_68_, i_69_, i_70_, i_71_);
                            else
                                stream.b(i_68_, i_69_, i_70_, i_71_);
                            stream.a(0.0F);
                            i_26_++;
                            stream.a(1.0F);
                        }
                        if ((anIntArray793[i_64_] ^ 0xffffffff) < -65) {
                            int i_76_ = -65 + anIntArray793[i_64_];
                            for (int i_77_ = anIntArray805[i_76_] - 1; (i_77_ ^ 0xffffffff) <= -1; i_77_--) {
                                Class346_Sub5_Sub2 class346_sub5_sub2 = (aClass346_Sub5_Sub2ArrayArray817[i_76_][i_77_]);
                                int i_78_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9897);
                                byte i_79_ = (byte) (i_78_ >> -1469758704);
                                byte i_80_ = (byte) (i_78_ >> 489709928);
                                byte i_81_ = (byte) i_78_;
                                byte i_82_ = (byte) (i_78_ >>> -1068447816);
                                float f_83_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9894 >> 674010892);
                                float f_84_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9891 >> 1788466508);
                                float f_85_ = (float) (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9895 >> -1336848916);
                                int i_86_ = (((Class346_Sub5_Sub2) class346_sub5_sub2).anInt9896 >> 1681956588);
                                stream.a((float) -i_86_ * f_32_ + f_83_);
                                stream.a((float) -i_86_ * f_33_ + f_84_);
                                stream.a((float) -i_86_ * f_34_ + f_85_);
                                if (((ha_Sub3) var_ha_Sub3).anInt6251 == 0)
                                    stream.b(i_79_, i_80_, i_81_, i_82_);
                                else
                                    stream.a(i_79_, i_80_, i_81_, i_82_);
                                stream.a(0.0F);
                                stream.a(0.0F);
                                stream.a((float) i_86_ * f_35_ + f_83_);
                                stream.a(f_84_ + f_36_ * (float) i_86_);
                                stream.a(f_85_ + f_37_ * (float) i_86_);
                                if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) != -1)
                                    stream.a(i_79_, i_80_, i_81_, i_82_);
                                else
                                    stream.b(i_79_, i_80_, i_81_, i_82_);
                                stream.a(1.0F);
                                stream.a(0.0F);
                                stream.a(f_83_ + f_32_ * (float) i_86_);
                                stream.a(f_84_ + (float) i_86_ * f_33_);
                                stream.a((float) i_86_ * f_34_ + f_85_);
                                if (((ha_Sub3) var_ha_Sub3).anInt6251 != 0)
                                    stream.a(i_79_, i_80_, i_81_, i_82_);
                                else
                                    stream.b(i_79_, i_80_, i_81_, i_82_);
                                stream.a(1.0F);
                                stream.a(1.0F);
                                stream.a((float) i_86_ * f_38_ + f_83_);
                                stream.a(f_39_ * (float) i_86_ + f_84_);
                                stream.a(f_85_ + (float) i_86_ * f_40_);
                                if ((((ha_Sub3) var_ha_Sub3).anInt6251 ^ 0xffffffff) != -1)
                                    stream.a(i_79_, i_80_, i_81_, i_82_);
                                else
                                    stream.b(i_79_, i_80_, i_81_, i_82_);
                                stream.a(0.0F);
                                i_26_++;
                                stream.a(1.0F);
                            }
                        }
                    }
                }
            }
            stream.a();
            if (anInterface18_Impl1_799.method4(-13472)) {
                var_ha_Sub3.method931(0, 8, anInterface18_Impl1_799);
                var_ha_Sub3.method931(1, 8, anInterface18_Impl1_798);
                var_ha_Sub3.method1004(aClass185_792, (byte) -15);
                var_ha_Sub3.method1006(anInterface18_Impl2_804, OutputStream_Sub1.aClass14_86, 2 * i_26_, 0, i_26_ * 4, 0, -229);
            }
        }
    }

    private final void method467(ha_Sub3 var_ha_Sub3, boolean bool) {
        anInt794++;
        Class152.aFloat1807 = ((ha_Sub3) var_ha_Sub3).aFloat6170;
        var_ha_Sub3.method1050((byte) -77);
        var_ha_Sub3.method1024((byte) 112, false);
        var_ha_Sub3.method950((byte) 36, false);
        var_ha_Sub3.method1003(22551);
        if (bool != true)
            anIntArray805 = null;
    }

    final void method468(byte i) {
        anInt807++;
        if (i > -53)
            aClass346_Sub5_Sub2ArrayArray817 = null;
        anInterface18_Impl1_799.method3(false);
    }

    Class59(ha_Sub3 var_ha_Sub3) {
        anIntArray805 = new int[64];
        aClass346_Sub5_Sub2ArrayArray817 = new Class346_Sub5_Sub2[64][768];
        aClass185_792 = var_ha_Sub3.method1005((byte) -120, (new Class194[]{new Class194(new Class89[]{Class89.aClass89_1097, Class89.aClass89_1099, (Class89.aClass89_1101)}), new Class194(Class89.aClass89_1098)}));
        anInterface18_Impl1_799 = var_ha_Sub3.method1010(33, true);
        anInterface18_Impl1_798 = var_ha_Sub3.method1010(43, false);
        anInterface18_Impl1_798.method2(12, -30987, 393168);
        anInterface18_Impl2_804 = var_ha_Sub3.method924(-23469, false);
        anInterface18_Impl2_804.method48(49146, (byte) 102);
        Buffer buffer = anInterface18_Impl2_804.method47(30907, true);
        if (buffer != null) {
            Stream stream = var_ha_Sub3.method926((byte) -20, buffer);
            if (Stream.b()) {
                for (int i = 0; i < 8191; i++) {
                    int i_87_ = 4 * i;
                    stream.b(i_87_);
                    stream.b(1 + i_87_);
                    stream.b(i_87_ - -2);
                    stream.b(2 + i_87_);
                    stream.b(3 + i_87_);
                    stream.b(i_87_);
                }
            } else {
                for (int i = 0; (i ^ 0xffffffff) > -8192; i++) {
                    int i_88_ = 4 * i;
                    stream.d(i_88_);
                    stream.d(1 + i_88_);
                    stream.d(2 + i_88_);
                    stream.d(i_88_ - -2);
                    stream.d(i_88_ - -3);
                    stream.d(i_88_);
                }
            }
            stream.a();
            anInterface18_Impl2_804.method50(-17694);
        }
        Buffer buffer_89_ = anInterface18_Impl1_798.method1(-4448, true);
        if (buffer_89_ != null) {
            Stream stream = var_ha_Sub3.method926((byte) -20, buffer_89_);
            if (Stream.b()) {
                for (int i = 0; i < 8191; i++) {
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                }
            } else {
                for (int i = 0; i < 8191; i++) {
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                }
            }
            stream.a();
            anInterface18_Impl1_798.method4(-13472);
        }
    }

    static {
        anInt810 = -1;
        anIntArrayArrayArray808 = new int[2][][];
        anInt815 = 0;
    }
}
