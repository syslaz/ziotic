/* Class248_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

import java.awt.event.ActionEvent;

final class Node_Sub18 extends Node {
    private Interface18_Impl2 anInterface18_Impl2_7000;
    private int anInt7001;
    static OutgoingOpcode aOutgoingOpcode_7002;
    private int anInt7003;
    private ha_Sub3 aHa_Sub3_7004;
    static int anInt7005;
    private Class65 aClass65_7006;
    static int anInt7007;
    static int anInt7008;
    private int anInt7009;
    private Stream aStream7010;
    private int anInt7011;
    static int anInt7012;
    private s_Sub3 aS_Sub3_7013;
    private int anInt7014;
    private float[][] aFloatArrayArray7015;
    static Class229 aClass229_7016;
    private Interface18_Impl1 anInterface18_Impl1_7017;
    static int[] anIntArray7018 = new int[14];
    static int anInt7019;
    private int anInt7020;
    static int anInt7021;
    static int anInt7022;
    private Node_Sub42 aClass248_Sub42_7023;
    private float[][] aFloatArrayArray7024;
    private Stream aStream7025;
    private float[][] aFloatArrayArray7026;
    public static int anInt7027;
    static Node_Sub8_Sub2[] aClass248_Sub8_Sub2Array7028;
    static int anInt7029;

    private final void method2509(boolean bool, short i) {
        if (bool != true)
            method2514(-40, null, -47, 7, 108);
        anInt7021++;
        if (Stream.b())
            aStream7010.b(i);
        else
            aStream7010.d(i);
    }

    private final void method2510(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt7012++;
        long l = -1L;
        int i_6_ = i_2_ - -(i_3_ << ((s) aS_Sub3_7013).anInt3466);
        int i_7_ = i_1_ + (i_4_ << ((s) aS_Sub3_7013).anInt3466);
        int i_8_ = aS_Sub3_7013.method3150((byte) 124, i_6_, i_7_);
        if ((i_2_ & 0x7f ^ 0xffffffff) == -1 || (0x7f & i_1_) == 0) {
            l = (0xffffL & (long) i_6_ | 65535L << -806688816 & (long) i_7_ << 836434128);
            Node node = aClass65_7006.method501(l, (byte) 31);
            if (node != null) {
                method2509(true, (((Node_Sub3) (Node_Sub3) node).aShort6828));
                return;
            }
        }
        short i_9_ = (short) anInt7014++;
        if (l != (long) i_5_)
            aClass65_7006.method509(-1, new Node_Sub3(i_9_), l);
        float f;
        float f_10_;
        float f_11_;
        if (i_2_ == 0 && (i_1_ ^ 0xffffffff) == -1) {
            f_11_ = aFloatArrayArray7024[i_0_][i];
            f_10_ = aFloatArrayArray7015[i_0_][i];
            f = aFloatArrayArray7026[i_0_][i];
        } else if (i_2_ != ((s) aS_Sub3_7013).anInt3465 || (i_1_ ^ 0xffffffff) != -1) {
            if ((i_2_ ^ 0xffffffff) == (((s) aS_Sub3_7013).anInt3465 ^ 0xffffffff) && (i_1_ ^ 0xffffffff) == (((s) aS_Sub3_7013).anInt3465 ^ 0xffffffff)) {
                f = aFloatArrayArray7026[i_0_ - -1][i + 1];
                f_10_ = aFloatArrayArray7015[i_0_ + 1][i + 1];
                f_11_ = aFloatArrayArray7024[1 + i_0_][i - -1];
            } else if (i_2_ != 0 || i_1_ != ((s) aS_Sub3_7013).anInt3465) {
                float f_12_ = (float) i_2_ / (float) ((s) aS_Sub3_7013).anInt3465;
                float f_13_ = (float) i_1_ / (float) ((s) aS_Sub3_7013).anInt3465;
                float f_14_ = aFloatArrayArray7026[i_0_][i];
                float f_15_ = aFloatArrayArray7024[i_0_][i];
                float f_16_ = aFloatArrayArray7015[i_0_][i];
                float f_17_ = aFloatArrayArray7026[i_0_ - -1][i];
                float f_18_ = aFloatArrayArray7024[1 + i_0_][i];
                f_16_ += f_12_ * (aFloatArrayArray7015[i_0_][i - -1] - f_16_);
                f_14_ += f_12_ * (aFloatArrayArray7026[i_0_][1 + i] - f_14_);
                f_17_ += f_12_ * (aFloatArrayArray7026[1 + i_0_][i + 1] - f_17_);
                f_18_ += f_12_ * (aFloatArrayArray7024[1 + i_0_][1 + i] - f_18_);
                f_15_ += f_12_ * (-f_15_ + aFloatArrayArray7024[i_0_][i + 1]);
                float f_19_ = aFloatArrayArray7015[i_0_ - -1][i];
                f_11_ = f_13_ * (-f_15_ + f_18_) + f_15_;
                f_19_ += (aFloatArrayArray7015[i_0_ + 1][1 + i] - f_19_) * f_12_;
                f = f_13_ * (f_17_ - f_14_) + f_14_;
                f_10_ = (f_19_ - f_16_) * f_13_ + f_16_;
            } else {
                f_11_ = aFloatArrayArray7024[i_0_][1 + i];
                f_10_ = aFloatArrayArray7015[i_0_][1 + i];
                f = aFloatArrayArray7026[i_0_][1 + i];
            }
        } else {
            f = aFloatArrayArray7026[1 + i_0_][i];
            f_11_ = aFloatArrayArray7024[i_0_ - -1][i];
            f_10_ = aFloatArrayArray7015[1 + i_0_][i];
        }
        float f_20_ = (float) (aClass248_Sub42_7023.method2620(127) - i_6_);
        float f_21_ = (float) (aClass248_Sub42_7023.method2624(-22096) + -i_8_);
        float f_22_ = (float) (aClass248_Sub42_7023.method2625((byte) -84) - i_7_);
        float f_23_ = (float) Math.sqrt((double) (f_21_ * f_21_ + f_20_ * f_20_ + f_22_ * f_22_));
        float f_24_ = 1.0F / f_23_;
        f_21_ *= f_24_;
        f_22_ *= f_24_;
        f_20_ *= f_24_;
        float f_25_ = f_23_ / (float) aClass248_Sub42_7023.method2628(-9);
        float f_26_ = -(f_25_ * f_25_) + 1.0F;
        if (f_26_ < 0.0F)
            f_26_ = 0.0F;
        float f_27_ = f_10_ * f_22_ + (f * f_20_ + f_21_ * f_11_);
        if (f_27_ < 0.0F)
            f_27_ = 0.0F;
        float f_28_ = f_27_ * f_26_ * 2.0F;
        if (f_28_ > 1.0F)
            f_28_ = 1.0F;
        int i_29_ = aClass248_Sub42_7023.method2626(false);
        int i_30_ = (int) ((float) ((0xff5d16 & i_29_) >> -1133226576) * f_28_);
        if (i_30_ > 255)
            i_30_ = 255;
        int i_31_ = (int) (f_28_ * (float) ((0xff3b & i_29_) >> 2093517672));
        if (i_31_ > 255)
            i_31_ = 255;
        int i_32_ = (int) (f_28_ * (float) (0xff & i_29_));
        if (Stream.b()) {
            aStream7025.a((float) i_6_);
            aStream7025.a((float) i_8_);
            aStream7025.a((float) i_7_);
        } else {
            aStream7025.b((float) i_6_);
            aStream7025.b((float) i_8_);
            aStream7025.b((float) i_7_);
        }
        if (i_32_ > 255)
            i_32_ = 255;
        if ((((ha_Sub3) aHa_Sub3_7004).anInt6251 ^ 0xffffffff) != -1) {
            aStream7025.f(i_30_);
            aStream7025.f(i_31_);
            aStream7025.f(i_32_);
        } else {
            aStream7025.f(i_32_);
            aStream7025.f(i_31_);
            aStream7025.f(i_30_);
        }
        aStream7025.f(255);
        method2509(true, i_9_);
    }

    static final void method2511(Class174 class174, int i, Object object) {
        anInt7022++;
        if (((Class174) class174).anEventQueue2027 != null) {
            for (int i_33_ = i; (i_33_ < 50 && (((Class174) class174).anEventQueue2027.peekEvent() != null)); i_33_++)
                Class279_Sub2.method2897((byte) -124, 1L);
            do {
                try {
                    if (object == null)
                        break;
                    ((Class174) class174).anEventQueue2027.postEvent(new ActionEvent(object, 1001, "dummy"));
                } catch (Exception exception) {
                    break;
                }
                break;
            } while (false);
        }
    }

    static final float method2512(float f, byte i, float f_34_, float f_35_) {
        anInt7008++;
        int i_36_ = 13 / ((-45 - i) / 50);
        return f + (f_34_ - f) * f_35_;
    }

    public static void method2513(int i) {
        if (i == -491) {
            aClass229_7016 = null;
            aClass248_Sub8_Sub2Array7028 = null;
            anIntArray7018 = null;
            aOutgoingOpcode_7002 = null;
        }
    }

    final void method2514(int i, boolean[][] bools, int i_37_, int i_38_, int i_39_) {
        anInt7005++;
        int i_40_ = -59 / ((39 - i_38_) / 57);
        if (anInterface18_Impl2_7000 != null && (i - -i_39_ ^ 0xffffffff) <= (anInt7001 ^ 0xffffffff) && (anInt7011 ^ 0xffffffff) <= (-i_39_ + i ^ 0xffffffff) && (i_39_ + i_37_ ^ 0xffffffff) <= (anInt7003 ^ 0xffffffff) && i_37_ - i_39_ <= anInt7020) {
            for (int i_41_ = anInt7003; (i_41_ ^ 0xffffffff) >= (anInt7020 ^ 0xffffffff); i_41_++) {
                for (int i_42_ = anInt7001; (i_42_ ^ 0xffffffff) >= (anInt7011 ^ 0xffffffff); i_42_++) {
                    int i_43_ = i_42_ - i;
                    int i_44_ = -i_37_ + i_41_;
                    if (i_43_ > -i_39_ && i_39_ > i_43_ && i_44_ > -i_39_ && i_44_ < i_39_ && bools[i_43_ + i_39_][i_39_ + i_44_]) {
                        aHa_Sub3_7004.method995((byte) 116, (byte) (int) (aClass248_Sub42_7023.method2621((byte) 110) * 255.0F));
                        aHa_Sub3_7004.method931(0, 8, anInterface18_Impl1_7017);
                        aHa_Sub3_7004.method1004((((ha_Sub3) aHa_Sub3_7004).aClass185_6263), (byte) -15);
                        aHa_Sub3_7004.method1006(anInterface18_Impl2_7000, OutputStream_Sub1.aClass14_86, anInt7009 / 3, 0, anInt7014, 0, -229);
                        return;
                    }
                }
            }
        }
    }

    static final void method2515(byte i, int i_45_) {
        Class59.anInt810 = -1;
        ha_Sub2.anInt5704 = -1;
        Node_Sub14_Sub30.anInt9478 = i_45_;
        anInt7019++;
        if (i > -38)
            aClass229_7016 = null;
        Class296.method3132((byte) -7);
    }

    static final void method2516(byte i) {
        Class282_Sub25.aHa7855.xa(1.1523438F * ((float) ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub2_7338.method2927(true) * 0.1F + 0.7F));
        if (i == 73) {
            anInt7007++;
            Class282_Sub25.aHa7855.ZA(Class83.anInt1033, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            Class282_Sub25.aHa7855.L(Node_Sub14_Sub33.anInt9510, -1, 0);
            Class282_Sub25.aHa7855.a(Class279_Sub1_Sub2.aClass316_9819);
        }
    }

    Node_Sub18(ha_Sub3 var_ha_Sub3, s_Sub3 var_s_Sub3, Node_Sub42 class248_sub42, int[] is) {
        aClass248_Sub42_7023 = class248_sub42;
        aHa_Sub3_7004 = var_ha_Sub3;
        aS_Sub3_7013 = var_s_Sub3;
        int i = (aClass248_Sub42_7023.method2628(-49) + -(((s) var_s_Sub3).anInt3465 >> 2146407265));
        anInt7001 = (-i + aClass248_Sub42_7023.method2620(108) >> ((s) var_s_Sub3).anInt3466);
        anInt7011 = (i + aClass248_Sub42_7023.method2620(114) >> ((s) var_s_Sub3).anInt3466);
        anInt7003 = (aClass248_Sub42_7023.method2625((byte) -87) - i >> ((s) var_s_Sub3).anInt3466);
        anInt7020 = (i + aClass248_Sub42_7023.method2625((byte) -98) >> ((s) var_s_Sub3).anInt3466);
        int i_46_ = anInt7011 + (-anInt7001 + 1);
        int i_47_ = -anInt7003 + anInt7020 + 1;
        aFloatArrayArray7024 = new float[i_46_ + 1][i_47_ - -1];
        aFloatArrayArray7015 = new float[i_46_ + 1][1 + i_47_];
        aFloatArrayArray7026 = new float[1 + i_46_][i_47_ - -1];
        for (int i_48_ = 0; i_48_ <= i_47_; i_48_++) {
            int i_49_ = i_48_ + anInt7003;
            if (i_49_ > 0 && i_49_ < -1 + ((s) aS_Sub3_7013).anInt3472) {
                for (int i_50_ = 0; (i_50_ ^ 0xffffffff) >= (i_46_ ^ 0xffffffff); i_50_++) {
                    int i_51_ = anInt7001 + i_50_;
                    if ((i_51_ ^ 0xffffffff) < -1 && ((-1 + ((s) aS_Sub3_7013).anInt3468 ^ 0xffffffff) < (i_51_ ^ 0xffffffff))) {
                        int i_52_ = (var_s_Sub3.method3145(1 + i_51_, 57, i_49_) - var_s_Sub3.method3145(-1 + i_51_, 108, i_49_));
                        int i_53_ = (var_s_Sub3.method3145(i_51_, 60, 1 + i_49_) + -var_s_Sub3.method3145(i_51_, 46, i_49_ - 1));
                        float f = (float) (1.0 / Math.sqrt((double) (i_53_ * i_53_ + (i_52_ * i_52_ + 65536))));
                        aFloatArrayArray7026[i_50_][i_48_] = (float) i_52_ * f;
                        aFloatArrayArray7024[i_50_][i_48_] = -256.0F * f;
                        aFloatArrayArray7015[i_50_][i_48_] = (float) i_53_ * f;
                    }
                }
            }
        }
        int i_54_ = 0;
        for (int i_55_ = anInt7003; (anInt7020 ^ 0xffffffff) <= (i_55_ ^ 0xffffffff); i_55_++) {
            if (i_55_ >= 0 && ((s) var_s_Sub3).anInt3472 > i_55_) {
                for (int i_56_ = anInt7001; i_56_ <= anInt7011; i_56_++) {
                    if (i_56_ >= 0 && ((s) var_s_Sub3).anInt3468 > i_56_) {
                        int i_57_ = is[i_54_];
                        int[] is_58_ = (((s_Sub3) var_s_Sub3).anIntArrayArrayArray8005[i_56_][i_55_]);
                        if (is_58_ != null && i_57_ != 0) {
                            if ((i_57_ ^ 0xffffffff) != -2)
                                anInt7009 += 3;
                            else {
                                int i_59_ = 0;
                                while ((is_58_.length ^ 0xffffffff) < (i_59_ ^ 0xffffffff)) {
                                    if ((is_58_[i_59_++] ^ 0xffffffff) != 0 && (is_58_[i_59_++] ^ 0xffffffff) != 0 && (is_58_[i_59_++] ^ 0xffffffff) != 0)
                                        anInt7009 += 3;
                                }
                            }
                        }
                    }
                    i_54_++;
                }
            } else
                i_54_ += -anInt7001 + anInt7011;
        }
        if ((anInt7009 ^ 0xffffffff) < -1) {
            aClass65_7006 = new Class65(Class136_Sub4.method1269(anInt7009, (byte) -128));
            anInterface18_Impl2_7000 = aHa_Sub3_7004.method924(-23469, false);
            anInterface18_Impl2_7000.method48(anInt7009, (byte) 102);
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = aHa_Sub3_7004.method935(anInt7009 * 16, false, (byte) -35);
            aStream7025 = new Stream(nativeheapbuffer);
            for (; ; ) {
                Buffer buffer = anInterface18_Impl2_7000.method47(30907, true);
                if (buffer != null) {
                    aStream7010 = new Stream(buffer);
                    int i_60_ = 0;
                    i_54_ = 0;
                    for (int i_61_ = anInt7003; (anInt7020 ^ 0xffffffff) <= (i_61_ ^ 0xffffffff); i_61_++) {
                        if ((i_61_ ^ 0xffffffff) > -1 || i_61_ >= ((s) var_s_Sub3).anInt3472)
                            i_54_ += anInt7011 + -anInt7001;
                        else {
                            int i_62_ = 0;
                            for (int i_63_ = anInt7001; i_63_ <= anInt7011; i_63_++) {
                                if ((i_63_ ^ 0xffffffff) <= -1 && i_63_ < ((s) var_s_Sub3).anInt3468) {
                                    int i_64_ = is[i_54_];
                                    int[] is_65_ = (((s_Sub3) var_s_Sub3).anIntArrayArrayArray8005[i_63_][i_61_]);
                                    if (is_65_ != null && (i_64_ ^ 0xffffffff) != -1) {
                                        if (i_64_ == 1) {
                                            int[] is_66_ = (((s_Sub3) var_s_Sub3).anIntArrayArrayArray7994[i_63_][i_61_]);
                                            int[] is_67_ = (((s_Sub3) var_s_Sub3).anIntArrayArrayArray8003[i_63_][i_61_]);
                                            int i_68_ = 0;
                                            while (is_65_.length > i_68_) {
                                                if (is_65_[i_68_] == -1 || (is_65_[i_68_ - -1] ^ 0xffffffff) == 0 || (is_65_[i_68_ - -2] ^ 0xffffffff) == 0)
                                                    i_68_ += 3;
                                                else {
                                                    method2510(i_60_, i_62_, is_67_[i_68_], is_66_[i_68_], i_63_, i_61_, -1);
                                                    i_68_++;
                                                    method2510(i_60_, i_62_, is_67_[i_68_], is_66_[i_68_], i_63_, i_61_, -1);
                                                    i_68_++;
                                                    method2510(i_60_, i_62_, is_67_[i_68_], is_66_[i_68_], i_63_, i_61_, -1);
                                                    i_68_++;
                                                }
                                            }
                                        } else if ((i_64_ ^ 0xffffffff) != -4) {
                                            if ((i_64_ ^ 0xffffffff) == -3) {
                                                method2510(i_60_, i_62_, 0, (((s) var_s_Sub3).anInt3465), i_63_, i_61_, -1);
                                                method2510(i_60_, i_62_, (((s) var_s_Sub3).anInt3465), (((s) var_s_Sub3).anInt3465), i_63_, i_61_, -1);
                                                method2510(i_60_, i_62_, 0, 0, i_63_, i_61_, -1);
                                            } else if ((i_64_ ^ 0xffffffff) != -6) {
                                                if (i_64_ == 4) {
                                                    method2510(i_60_, i_62_, (((s) var_s_Sub3).anInt3465), 0, i_63_, i_61_, -1);
                                                    method2510(i_60_, i_62_, 0, 0, i_63_, i_61_, -1);
                                                    method2510(i_60_, i_62_, (((s) var_s_Sub3).anInt3465), (((s) var_s_Sub3).anInt3465), i_63_, i_61_, -1);
                                                }
                                            } else {
                                                method2510(i_60_, i_62_, (((s) var_s_Sub3).anInt3465), (((s) var_s_Sub3).anInt3465), i_63_, i_61_, -1);
                                                method2510(i_60_, i_62_, (((s) var_s_Sub3).anInt3465), 0, i_63_, i_61_, -1);
                                                method2510(i_60_, i_62_, 0, (((s) var_s_Sub3).anInt3465), i_63_, i_61_, -1);
                                            }
                                        } else {
                                            method2510(i_60_, i_62_, 0, 0, i_63_, i_61_, -1);
                                            method2510(i_60_, i_62_, 0, (((s) var_s_Sub3).anInt3465), i_63_, i_61_, -1);
                                            method2510(i_60_, i_62_, (((s) var_s_Sub3).anInt3465), 0, i_63_, i_61_, -1);
                                        }
                                    }
                                }
                                i_62_++;
                                i_54_++;
                            }
                        }
                        i_60_++;
                    }
                    aStream7010.a();
                    if (anInterface18_Impl2_7000.method50(-17694))
                        break;
                    aStream7025.e(0);
                    aClass65_7006.method504(-1);
                }
            }
            aStream7025.a();
            anInterface18_Impl1_7017 = aHa_Sub3_7004.method1010(38, false);
            anInterface18_Impl1_7017.method5(16 * anInt7014, nativeheapbuffer, 24689, 16);
        } else {
            anInterface18_Impl2_7000 = null;
            anInterface18_Impl1_7017 = null;
        }
        aFloatArrayArray7026 = aFloatArrayArray7024 = aFloatArrayArray7015 = null;
        aStream7010 = null;
        aStream7025 = null;
        aClass65_7006 = null;
    }

    static {
        aOutgoingOpcode_7002 = new OutgoingOpcode(43, 8);
        aClass248_Sub8_Sub2Array7028 = new Node_Sub8_Sub2[14];
        anInt7027 = 0;
    }
}
