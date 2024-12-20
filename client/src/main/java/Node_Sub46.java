/* Class248_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub46 extends Node {
    private Node_Sub42 aClass248_Sub42_7368;
    private ha_Sub2 aHa_Sub2_7369;
    static float[][] aFloatArrayArray7370 = {{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
    private Class65 aClass65_7371;
    private Interface1 anInterface1_7372;
    private int anInt7373;
    static float aFloat7374;
    private int anInt7375;
    static float aFloat7376;
    static int anInt7377;
    private float[][] aFloatArrayArray7378;
    static RSInterface2[][] aClass354ArrayArray7379;
    private Class140 aClass140_7380;
    private Node_Sub9_Sub1 aClass248_Sub9_Sub1_7381;
    private Interface6 anInterface6_7382;
    private s_Sub2 aS_Sub2_7383;
    private Class140 aClass140_7384;
    private int anInt7385;
    static boolean aBoolean7386;
    private int anInt7387;
    static int anInt7388;
    private int anInt7389;
    private float[][] aFloatArrayArray7390;
    private int anInt7391;
    private ByteStream aClass248_Sub9_7392;
    static int anInt7393 = 0;
    private float[][] aFloatArrayArray7394;
    static int anInt7395;

    private final void method2654(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt7395++;
        long l = -1L;
        int i_6_ = (i_2_ << ((s) aS_Sub2_7383).anInt3466) + i;
        int i_7_ = i_5_ + (i_1_ << ((s) aS_Sub2_7383).anInt3466);
        int i_8_ = aS_Sub2_7383.method3150((byte) 105, i_6_, i_7_);
        if ((0x7f & i) == 0 || (i_5_ & 0x7f ^ 0xffffffff) == -1) {
            l = (0xffffL & (long) i_7_) << 1103648208 | (long) i_6_ & 0xffffL;
            Node node = aClass65_7371.method501(l, (byte) 31);
            if (node != null) {
                method2657((((Node_Sub3) (Node_Sub3) node).aShort6828), -117);
                return;
            }
        }
        short i_9_ = (short) anInt7385++;
        if ((l ^ 0xffffffffffffffffL) != 0L)
            aClass65_7371.method509(-1, new Node_Sub3(i_9_), l);
        float f;
        float f_10_;
        float f_11_;
        if ((i ^ 0xffffffff) == -1 && (i_5_ ^ 0xffffffff) == -1) {
            f_10_ = aFloatArrayArray7378[i_3_][i_4_];
            f_11_ = aFloatArrayArray7394[i_3_][i_4_];
            f = aFloatArrayArray7390[i_3_][i_4_];
        } else if (i == ((s) aS_Sub2_7383).anInt3465 && (i_5_ ^ 0xffffffff) == -1) {
            f = aFloatArrayArray7390[i_3_ - -1][i_4_];
            f_10_ = aFloatArrayArray7378[i_3_ + 1][i_4_];
            f_11_ = aFloatArrayArray7394[i_3_ - -1][i_4_];
        } else if (((s) aS_Sub2_7383).anInt3465 != i || ((((s) aS_Sub2_7383).anInt3465 ^ 0xffffffff) != (i_5_ ^ 0xffffffff))) {
            if ((i ^ 0xffffffff) == -1 && (i_5_ ^ 0xffffffff) == (((s) aS_Sub2_7383).anInt3465 ^ 0xffffffff)) {
                f = aFloatArrayArray7390[i_3_][1 + i_4_];
                f_11_ = aFloatArrayArray7394[i_3_][i_4_ - -1];
                f_10_ = aFloatArrayArray7378[i_3_][i_4_ - -1];
            } else {
                float f_12_ = (float) i / (float) ((s) aS_Sub2_7383).anInt3465;
                float f_13_ = (float) i_5_ / (float) ((s) aS_Sub2_7383).anInt3465;
                float f_14_ = aFloatArrayArray7378[i_3_][i_4_];
                float f_15_ = aFloatArrayArray7394[i_3_][i_4_];
                float f_16_ = aFloatArrayArray7390[i_3_][i_4_];
                float f_17_ = aFloatArrayArray7378[1 + i_3_][i_4_];
                float f_18_ = aFloatArrayArray7394[i_3_ + 1][i_4_];
                f_18_ += f_12_ * (aFloatArrayArray7394[i_3_ + 1][1 + i_4_] - f_18_);
                f_15_ += f_12_ * (aFloatArrayArray7394[i_3_][i_4_ - -1] - f_15_);
                f_14_ += f_12_ * (aFloatArrayArray7378[i_3_][1 + i_4_] - f_14_);
                float f_19_ = aFloatArrayArray7390[1 + i_3_][i_4_];
                f_17_ += ((aFloatArrayArray7378[i_3_ + 1][i_4_ + 1] - f_17_) * f_12_);
                f_16_ += f_12_ * (aFloatArrayArray7390[i_3_][i_4_ - -1] - f_16_);
                f_10_ = f_13_ * (f_17_ - f_14_) + f_14_;
                f_11_ = f_15_ + f_13_ * (-f_15_ + f_18_);
                f_19_ += ((aFloatArrayArray7390[i_3_ + 1][1 + i_4_] - f_19_) * f_12_);
                f = f_13_ * (f_19_ - f_16_) + f_16_;
            }
        } else {
            f_11_ = aFloatArrayArray7394[i_3_ - -1][i_4_ + 1];
            f_10_ = aFloatArrayArray7378[i_3_ - -1][1 + i_4_];
            f = aFloatArrayArray7390[1 + i_3_][i_4_ + 1];
        }
        float f_20_ = (float) (-i_6_ + aClass248_Sub42_7368.method2620(109));
        float f_21_ = (float) (aClass248_Sub42_7368.method2624(-22096) - i_8_);
        float f_22_ = (float) (aClass248_Sub42_7368.method2625((byte) -75) + -i_7_);
        float f_23_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_ + f_22_ * f_22_));
        float f_24_ = (float) i_0_ / f_23_;
        f_21_ *= f_24_;
        f_20_ *= f_24_;
        f_22_ *= f_24_;
        float f_25_ = f_23_ / (float) aClass248_Sub42_7368.method2628(-55);
        float f_26_ = 1.0F - f_25_ * f_25_;
        if (f_26_ < 0.0F)
            f_26_ = 0.0F;
        float f_27_ = f_20_ * f_10_ + f_21_ * f_11_ + f_22_ * f;
        if (f_27_ < 0.0F)
            f_27_ = 0.0F;
        float f_28_ = 2.0F * (f_27_ * f_26_);
        if (f_28_ > 1.0F)
            f_28_ = 1.0F;
        int i_29_ = aClass248_Sub42_7368.method2626(false);
        int i_30_ = (int) ((float) ((i_29_ & 0xff047e) >> 1742584080) * f_28_);
        if (i_30_ > 255)
            i_30_ = 255;
        int i_31_ = (int) (f_28_ * (float) ((0xff9e & i_29_) >> -2065211608));
        if ((i_31_ ^ 0xffffffff) < -256)
            i_31_ = 255;
        int i_32_ = (int) (f_28_ * (float) (i_29_ & 0xff));
        if (!((ha_Sub2) aHa_Sub2_7369).aBoolean5872) {
            aClass248_Sub9_Sub1_7381.method2225(4440, (float) i_6_);
            aClass248_Sub9_Sub1_7381.method2225(i_0_ + 4439, (float) i_8_);
            aClass248_Sub9_Sub1_7381.method2225(i_0_ ^ 0x1159, (float) i_7_);
        } else {
            aClass248_Sub9_Sub1_7381.method2226(110, (float) i_6_);
            aClass248_Sub9_Sub1_7381.method2226(112, (float) i_8_);
            aClass248_Sub9_Sub1_7381.method2226(i_0_ ^ 0x62, (float) i_7_);
        }
        if (i_32_ > 255)
            i_32_ = 255;
        aClass248_Sub9_Sub1_7381.writeByte(-20, i_30_);
        aClass248_Sub9_Sub1_7381.writeByte(-45, i_31_);
        aClass248_Sub9_Sub1_7381.writeByte(-124, i_32_);
        aClass248_Sub9_Sub1_7381.writeByte(-94, 255);
        method2657(i_9_, -79);
    }

    public static void method2655(byte i) {
        aClass354ArrayArray7379 = null;
        if (i == 99)
            aFloatArrayArray7370 = null;
    }

    final void method2656(int i, boolean bool, int i_33_, int i_34_, boolean[][] bools) {
        anInt7388++;
        if (bool != true)
            aClass248_Sub42_7368 = null;
        if (anInterface1_7372 != null && i_34_ + i >= anInt7373 && (i_34_ + -i ^ 0xffffffff) >= (anInt7387 ^ 0xffffffff) && (i + i_33_ ^ 0xffffffff) <= (anInt7375 ^ 0xffffffff) && (i_33_ - i ^ 0xffffffff) >= (anInt7389 ^ 0xffffffff)) {
            for (int i_35_ = anInt7375; (i_35_ ^ 0xffffffff) >= (anInt7389 ^ 0xffffffff); i_35_++) {
                for (int i_36_ = anInt7373; (anInt7387 ^ 0xffffffff) <= (i_36_ ^ 0xffffffff); i_36_++) {
                    int i_37_ = i_36_ + -i_34_;
                    int i_38_ = i_35_ + -i_33_;
                    if (i_37_ > -i && i_37_ < i && -i < i_38_ && i > i_38_ && bools[i + i_37_][i + i_38_]) {
                        aHa_Sub2_7369.method901(-76, ((int) (255.0F * aClass248_Sub42_7368.method2621((byte) 110)) << -780475336));
                        aHa_Sub2_7369.method843(32886, null, aClass140_7380, null, aClass140_7384);
                        aHa_Sub2_7369.method897(anInterface1_7372, 0, (byte) -87, 4, anInt7391);
                        return;
                    }
                }
            }
        }
    }

    Node_Sub46(ha_Sub2 var_ha_Sub2, s_Sub2 var_s_Sub2, Node_Sub42 class248_sub42, int[] is) {
        aS_Sub2_7383 = var_s_Sub2;
        aHa_Sub2_7369 = var_ha_Sub2;
        aClass248_Sub42_7368 = class248_sub42;
        int i = (aClass248_Sub42_7368.method2628(-61) - (((s) var_s_Sub2).anInt3465 >> 1357338849));
        anInt7373 = (aClass248_Sub42_7368.method2620(114) + -i >> ((s) var_s_Sub2).anInt3466);
        anInt7387 = (i + aClass248_Sub42_7368.method2620(112) >> ((s) var_s_Sub2).anInt3466);
        anInt7375 = (-i + aClass248_Sub42_7368.method2625((byte) -99) >> ((s) var_s_Sub2).anInt3466);
        anInt7389 = (i + aClass248_Sub42_7368.method2625((byte) -83) >> ((s) var_s_Sub2).anInt3466);
        int i_39_ = -anInt7373 + anInt7387 - -1;
        int i_40_ = 1 + anInt7389 - anInt7375;
        aFloatArrayArray7378 = new float[i_39_ - -1][1 + i_40_];
        aFloatArrayArray7390 = new float[1 + i_39_][1 + i_40_];
        aFloatArrayArray7394 = new float[i_39_ - -1][1 + i_40_];
        for (int i_41_ = 0; (i_41_ ^ 0xffffffff) >= (i_40_ ^ 0xffffffff); i_41_++) {
            int i_42_ = i_41_ + anInt7375;
            if (i_42_ > 0 && -1 + ((s) aS_Sub2_7383).anInt3472 > i_42_) {
                for (int i_43_ = 0; (i_39_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff); i_43_++) {
                    int i_44_ = anInt7373 + i_43_;
                    if (i_44_ > 0 && (((s) aS_Sub2_7383).anInt3468 + -1 ^ 0xffffffff) < (i_44_ ^ 0xffffffff)) {
                        int i_45_ = (var_s_Sub2.method3145(i_44_ + 1, 103, i_42_) + -var_s_Sub2.method3145(-1 + i_44_, 105, i_42_));
                        int i_46_ = (var_s_Sub2.method3145(i_44_, 121, 1 + i_42_) - var_s_Sub2.method3145(i_44_, 88, -1 + i_42_));
                        float f = (float) (1.0 / Math.sqrt((double) (i_46_ * i_46_ + (i_45_ * i_45_ - -65536))));
                        aFloatArrayArray7378[i_43_][i_41_] = f * (float) i_45_;
                        aFloatArrayArray7394[i_43_][i_41_] = -256.0F * f;
                        aFloatArrayArray7390[i_43_][i_41_] = f * (float) i_46_;
                    }
                }
            }
        }
        int i_47_ = 0;
        for (int i_48_ = anInt7375; (i_48_ ^ 0xffffffff) >= (anInt7389 ^ 0xffffffff); i_48_++) {
            if (i_48_ >= 0 && ((s) var_s_Sub2).anInt3472 > i_48_) {
                for (int i_49_ = anInt7373; (anInt7387 ^ 0xffffffff) <= (i_49_ ^ 0xffffffff); i_49_++) {
                    if (i_49_ >= 0 && (i_49_ ^ 0xffffffff) > (((s) var_s_Sub2).anInt3468 ^ 0xffffffff)) {
                        int i_50_ = is[i_47_];
                        int[] is_51_ = (((s_Sub2) var_s_Sub2).anIntArrayArrayArray7945[i_49_][i_48_]);
                        if (is_51_ != null && (i_50_ ^ 0xffffffff) != -1) {
                            if (i_50_ == 1) {
                                int i_52_ = 0;
                                while ((is_51_.length ^ 0xffffffff) < (i_52_ ^ 0xffffffff)) {
                                    if ((is_51_[i_52_++] ^ 0xffffffff) != 0 && is_51_[i_52_++] != -1 && (is_51_[i_52_++] ^ 0xffffffff) != 0)
                                        anInt7391 += 3;
                                }
                            } else
                                anInt7391 += 3;
                        }
                    }
                    i_47_++;
                }
            } else
                i_47_ += anInt7387 + -anInt7373;
        }
        if ((anInt7391 ^ 0xffffffff) < -1) {
            aClass248_Sub9_7392 = new ByteStream(2 * anInt7391);
            aClass248_Sub9_Sub1_7381 = new Node_Sub9_Sub1(anInt7391 * 16);
            aClass65_7371 = new Class65(Class136_Sub4.method1269(anInt7391, (byte) -128));
            int i_53_ = 0;
            i_47_ = 0;
            for (int i_54_ = anInt7375; anInt7389 >= i_54_; i_54_++) {
                if ((i_54_ ^ 0xffffffff) > -1 || ((((s) var_s_Sub2).anInt3472 ^ 0xffffffff) >= (i_54_ ^ 0xffffffff)))
                    i_47_ += -anInt7373 + anInt7387;
                else {
                    int i_55_ = 0;
                    for (int i_56_ = anInt7373; (i_56_ ^ 0xffffffff) >= (anInt7387 ^ 0xffffffff); i_56_++) {
                        if ((i_56_ ^ 0xffffffff) <= -1 && ((s) var_s_Sub2).anInt3468 > i_56_) {
                            int i_57_ = is[i_47_];
                            int[] is_58_ = (((s_Sub2) var_s_Sub2).anIntArrayArrayArray7945[i_56_][i_54_]);
                            if (is_58_ != null && i_57_ != 0) {
                                if (i_57_ == 1) {
                                    int[] is_59_ = (((s_Sub2) var_s_Sub2).anIntArrayArrayArray7939[i_56_][i_54_]);
                                    int[] is_60_ = (((s_Sub2) var_s_Sub2).anIntArrayArrayArray7934[i_56_][i_54_]);
                                    int i_61_ = 0;
                                    while (i_61_ < is_58_.length) {
                                        if (is_58_[i_61_] == -1 || (is_58_[i_61_ + 1] ^ 0xffffffff) == 0 || is_58_[2 + i_61_] == -1)
                                            i_61_ += 3;
                                        else {
                                            method2654(is_59_[i_61_], 1, i_54_, i_56_, i_55_, i_53_, is_60_[i_61_]);
                                            i_61_++;
                                            method2654(is_59_[i_61_], 1, i_54_, i_56_, i_55_, i_53_, is_60_[i_61_]);
                                            i_61_++;
                                            method2654(is_59_[i_61_], 1, i_54_, i_56_, i_55_, i_53_, is_60_[i_61_]);
                                            i_61_++;
                                        }
                                    }
                                } else if (i_57_ != 3) {
                                    if ((i_57_ ^ 0xffffffff) == -3) {
                                        method2654(((s) var_s_Sub2).anInt3465, 1, i_54_, i_56_, i_55_, i_53_, 0);
                                        method2654(((s) var_s_Sub2).anInt3465, 1, i_54_, i_56_, i_55_, i_53_, ((s) var_s_Sub2).anInt3465);
                                        method2654(0, 1, i_54_, i_56_, i_55_, i_53_, 0);
                                    } else if (i_57_ == 5) {
                                        method2654(((s) var_s_Sub2).anInt3465, 1, i_54_, i_56_, i_55_, i_53_, ((s) var_s_Sub2).anInt3465);
                                        method2654(0, 1, i_54_, i_56_, i_55_, i_53_, ((s) var_s_Sub2).anInt3465);
                                        method2654(((s) var_s_Sub2).anInt3465, 1, i_54_, i_56_, i_55_, i_53_, 0);
                                    } else if (i_57_ == 4) {
                                        method2654(0, 1, i_54_, i_56_, i_55_, i_53_, ((s) var_s_Sub2).anInt3465);
                                        method2654(0, 1, i_54_, i_56_, i_55_, i_53_, 0);
                                        method2654(((s) var_s_Sub2).anInt3465, 1, i_54_, i_56_, i_55_, i_53_, ((s) var_s_Sub2).anInt3465);
                                    }
                                } else {
                                    method2654(0, 1, i_54_, i_56_, i_55_, i_53_, 0);
                                    method2654(((s) var_s_Sub2).anInt3465, 1, i_54_, i_56_, i_55_, i_53_, 0);
                                    method2654(0, 1, i_54_, i_56_, i_55_, i_53_, ((s) var_s_Sub2).anInt3465);
                                }
                            }
                        }
                        i_47_++;
                        i_55_++;
                    }
                }
                i_53_++;
            }
            anInterface1_7372 = (aHa_Sub2_7369.method877(5123, (byte) -85, ((ByteStream) aClass248_Sub9_7392).buffer, ((ByteStream) aClass248_Sub9_7392).offset, false));
            anInterface6_7382 = aHa_Sub2_7369.method869((byte) 90, ((ByteStream) aClass248_Sub9_Sub1_7381).offset, false, 16, (((ByteStream) aClass248_Sub9_Sub1_7381).buffer));
            aClass140_7380 = new Class140(anInterface6_7382, 5126, 3, 0);
            aClass140_7384 = new Class140(anInterface6_7382, 5121, 4, 12);
        } else {
            aClass140_7384 = null;
            anInterface6_7382 = null;
            aClass140_7380 = null;
            anInterface1_7372 = null;
        }
        aFloatArrayArray7378 = aFloatArrayArray7394 = aFloatArrayArray7390 = null;
        aClass248_Sub9_Sub1_7381 = null;
        aClass248_Sub9_7392 = null;
        aClass65_7371 = null;
    }

    private final void method2657(short i, int i_62_) {
        if (i_62_ > -36)
            method2657((short) -69, -32);
        if (!((ha_Sub2) aHa_Sub2_7369).aBoolean5872)
            aClass248_Sub9_7392.writeLEShort_(i, 46);
        else
            aClass248_Sub9_7392.writeShort(1182, i);
        anInt7377++;
    }

    static {
        aBoolean7386 = false;
    }
}
