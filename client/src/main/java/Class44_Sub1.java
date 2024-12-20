/* Class44_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class44_Sub1 extends Class44 {
    static int anInt5285;
    static OutgoingOpcode aOutgoingOpcode_5286 = new OutgoingOpcode(26, 2);
    static int anInt5287;
    static Class152 aClass152_5288;
    static int anInt5289;
    private int[] anIntArray5290 = new int[512];
    static int anInt5291;
    static boolean aBoolean5292 = false;

    public static void method317(int i) {
        aClass152_5288 = null;
        if (i == 7)
            aOutgoingOpcode_5286 = null;
    }

    static final int method318(int i, int i_0_) {
        anInt5285++;
        if (i != 27690)
            return 70;
        int i_1_ = i_0_ >>> 611264737;
        i_1_ |= i_1_ >>> -1267964543;
        i_1_ |= i_1_ >>> 511886562;
        i_1_ |= i_1_ >>> -1914752316;
        i_1_ |= i_1_ >>> 1238446600;
        i_1_ |= i_1_ >>> 192681680;
        return i_0_ & (i_1_ ^ 0xffffffff);
    }

    static final void method319(int i, int i_2_, ha var_ha, int i_3_, byte[][][] is, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt5287++;
        if ((i_3_ ^ 0xffffffff) != -1 && (i_10_ ^ 0xffffffff) != -1) {
            if ((i_3_ ^ 0xffffffff) == -10) {
                i_4_ = 0x3 & 1 + i_4_;
                i_3_ = 1;
            }
            if (i_5_ != -18954)
                method319(46, -78, null, -29, null, -115, 18, -18, -39, 113, 31, 37, -30);
            if ((i_3_ ^ 0xffffffff) == -11) {
                i_3_ = 1;
                i_4_ = 3 + i_4_ & 0x3;
            }
            if ((i_3_ ^ 0xffffffff) == -12) {
                i_3_ = 8;
                i_4_ = 3 + i_4_ & 0x3;
            }
            var_ha.Q(i_9_, i_6_, i_7_, i_8_, i_11_, i_2_, is[-1 + i_3_][i_4_], i_10_, i);
        }
    }

    static final int method320(PacketStream class248_sub9_sub2, int i) {
        anInt5291++;
        if (i < 32)
            method317(-46);
        int i_12_ = class248_sub9_sub2.readBits(2059, 2);
        int i_13_;
        if ((i_12_ ^ 0xffffffff) == -1)
            i_13_ = 0;
        else if ((i_12_ ^ 0xffffffff) == -2)
            i_13_ = class248_sub9_sub2.readBits(2059, 5);
        else if (i_12_ != 2)
            i_13_ = class248_sub9_sub2.readBits(2059, 11);
        else
            i_13_ = class248_sub9_sub2.readBits(2059, 8);
        return i_13_;
    }

    Class44_Sub1(int i) {
        Random random = new Random((long) i);
        for (int i_14_ = 0; i_14_ < 256; i_14_++)
            anIntArray5290[i_14_] = anIntArray5290[256 + i_14_] = i_14_;
        for (int i_15_ = 0; i_15_ < 256; i_15_++) {
            int i_16_ = 0xff & random.nextInt();
            int i_17_ = anIntArray5290[i_16_];
            anIntArray5290[i_16_] = anIntArray5290[i_16_ - -256] = anIntArray5290[i_15_];
            anIntArray5290[i_15_] = anIntArray5290[i_15_ - -256] = i_17_;
        }
    }

    final void method316(float[] fs, int i, float f, byte i_18_, int i_19_, float f_20_, int i_21_, int i_22_, float f_23_, float f_24_, int i_25_) {
        anInt5289++;
        int i_26_ = (int) ((float) i_21_ * f_20_ - 1.0F);
        i_26_ &= 0xff;
        int i_27_ = (int) (-1.0F + f_23_ * (float) i_19_);
        i_27_ &= 0xff;
        int i_28_ = (int) ((float) i_25_ * f_24_ - 1.0F);
        i_28_ &= 0xff;
        float f_29_ = (float) i * f_24_;
        int i_30_ = (int) f_29_;
        int i_31_ = i_30_ + 1;
        float f_32_ = f_29_ - (float) i_30_;
        float f_33_ = -f_32_ + 1.0F;
        float f_34_ = Node_Sub24.method2542(f_32_, -40);
        i_31_ &= i_28_;
        i_30_ &= i_28_;
        if (i_18_ == -56) {
            int i_35_ = anIntArray5290[i_30_];
            int i_36_ = anIntArray5290[i_31_];
            for (int i_37_ = 0; (i_19_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
                float f_38_ = f_23_ * (float) i_37_;
                int i_39_ = (int) f_38_;
                int i_40_ = i_39_ - -1;
                float f_41_ = (float) -i_39_ + f_38_;
                float f_42_ = -f_41_ + 1.0F;
                i_39_ &= i_27_;
                i_40_ &= i_27_;
                float f_43_ = Node_Sub24.method2542(f_41_, 112);
                int i_44_ = anIntArray5290[i_35_ + i_39_];
                int i_45_ = anIntArray5290[i_35_ + i_40_];
                int i_46_ = anIntArray5290[i_39_ + i_36_];
                int i_47_ = anIntArray5290[i_36_ + i_40_];
                for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_48_++) {
                    float f_49_ = (float) i_48_ * f_20_;
                    int i_50_ = (int) f_49_;
                    int i_51_ = 1 + i_50_;
                    float f_52_ = f_49_ - (float) i_50_;
                    float f_53_ = -f_52_ + 1.0F;
                    i_51_ &= i_26_;
                    float f_54_ = Node_Sub24.method2542(f_52_, i_18_ ^ ~0x63);
                    i_50_ &= i_26_;
                    fs[i_22_++] = (Node_Sub18.method2512((Node_Sub18.method2512((Node_Sub18.method2512((Class89.method668((byte) -52, f_53_, Class112.method794(7, (anIntArray5290[i_44_ + i_50_])), f_42_, f_33_)), (byte) 112, (Class89.method668((byte) -76, f_52_, Class112.method794(7, (anIntArray5290[i_44_ + i_51_])), f_42_, f_33_)), f_54_)), (byte) 116, (Node_Sub18.method2512((Class89.method668((byte) -116, f_53_, Class112.method794(7, (anIntArray5290[i_50_ + i_45_])), f_41_, f_33_)), (byte) -108, (Class89.method668((byte) -84, f_52_, Class112.method794(7, (anIntArray5290[i_45_ + i_51_])), f_41_, f_33_)), f_54_)), f_43_)), (byte) -112, (Node_Sub18.method2512((Node_Sub18.method2512((Class89.method668((byte) -116, f_53_, Class112.method794((anIntArray5290[i_50_ + i_46_]), 7), f_42_, f_32_)), (byte) -115, (Class89.method668((byte) -64, f_52_, Class112.method794(7, (anIntArray5290[i_46_ + i_51_])), f_42_, f_32_)), f_54_)), (byte) -125, (Node_Sub18.method2512((Class89.method668((byte) -63, f_53_, Class112.method794(7, (anIntArray5290[i_50_ - -i_47_])), f_41_, f_32_)), (byte) -115, (Class89.method668((byte) -102, f_52_, Class112.method794((anIntArray5290[i_51_ + i_47_]), 7), f_41_, f_32_)), f_54_)), f_43_)), f_34_)) * f;
                }
            }
        }
    }
}
