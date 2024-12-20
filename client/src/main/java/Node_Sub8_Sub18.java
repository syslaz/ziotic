/* Class248_Sub8_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8_Sub18 extends Node_Sub8 {
    int anInt9066;
    String aString9067;
    int[] anIntArray9068;
    Class65[] aClass65Array9069;
    String[] aStringArray9070;
    int[] opcodes;
    int integerInstructionsAmount;
    static short aShort9073 = 32767;
    static int anInt9074;
    static OutgoingOpcode aOutgoingOpcode_9075 = new OutgoingOpcode(57, 3);
    Class58 aClass58_9076;
    int stringInstructionsAmount;
    int anInt9078;
    static int anInt9079;

    static final void method2143(Interactable[] interactables, int i, int i_0_) {
        if (i < i_0_) {
            int i_1_ = (i + i_0_) / 2;
            int i_2_ = i;
            Interactable interactable = interactables[i_1_];
            interactables[i_1_] = interactables[i_0_];
            interactables[i_0_] = interactable;
            int i_3_ = ((Interactable) interactable).anInt8316;
            for (int i_4_ = i; i_4_ < i_0_; i_4_++) {
                if (((Interactable) interactables[i_4_]).anInt8316 > i_3_ + (i_4_ & 0x1)) {
                    Interactable interactable_5_ = interactables[i_4_];
                    interactables[i_4_] = interactables[i_2_];
                    interactables[i_2_++] = interactable_5_;
                }
            }
            interactables[i_0_] = interactables[i_2_];
            interactables[i_2_] = interactable;
            method2143(interactables, i, i_2_ - 1);
            method2143(interactables, i_2_ + 1, i_0_);
        }
    }

    static final int method2144(int i, int i_6_, Class164 class164, int i_7_, int i_8_, int[] is, boolean bool, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int[] is_14_, int i_15_, int i_16_) {
        anInt9074++;
        for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -129; i_17_++) {
            for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -129; i_18_++) {
                Class301_Sub3_Sub1.anIntArrayArray9976[i_17_][i_18_] = 0;
                Node_Sub12.anIntArrayArray6958[i_17_][i_18_] = 99999999;
            }
        }
        if (i_11_ != 28002)
            return -61;
        boolean bool_19_;
        if ((i_8_ ^ 0xffffffff) == -2)
            bool_19_ = Class110.method769(class164, i, i_15_, i_16_, i_6_, (byte) 77, i_7_, i_13_, i_12_, i_9_, i_10_);
        else if (i_8_ != 2)
            bool_19_ = Class311.method3267(i_8_, i, i_16_, i_12_, i_7_, class164, i_13_, i_10_, i_9_, -19272, i_6_, i_15_);
        else
            bool_19_ = Node_Sub50.method2680(i_16_, i_15_, i, i_9_, i_7_, class164, i_13_, i_12_, i_6_, (byte) -93, i_10_);
        int i_20_ = -64 + i_6_;
        int i_21_ = i_7_ + -64;
        int i_22_ = Node_Sub11.anInt6955;
        int i_23_ = Class15.anInt277;
        if (!bool_19_) {
            if (bool) {
                int i_24_ = 2147483647;
                int i_25_ = 2147483647;
                int i_26_ = 10;
                for (int i_27_ = -i_26_ + i_15_; (i_27_ ^ 0xffffffff) >= (i_15_ + i_26_ ^ 0xffffffff); i_27_++) {
                    for (int i_28_ = i_12_ - i_26_; i_28_ <= i_12_ - -i_26_; i_28_++) {
                        int i_29_ = -i_20_ + i_27_;
                        int i_30_ = i_28_ + -i_21_;
                        if (i_29_ >= 0 && i_30_ >= 0 && i_29_ < 128 && (i_30_ ^ 0xffffffff) > -129 && (Node_Sub12.anIntArrayArray6958[i_29_][i_30_]) < 100) {
                            int i_31_ = 0;
                            if ((i_27_ ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) {
                                if ((i + (i_15_ + -1) ^ 0xffffffff) > (i_27_ ^ 0xffffffff))
                                    i_31_ = -i - i_15_ - (-1 - i_27_);
                            } else
                                i_31_ = i_15_ - i_27_;
                            int i_32_ = 0;
                            if ((i_28_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
                                i_32_ = i_12_ + -i_28_;
                            else if (i_9_ + i_12_ + -1 < i_28_)
                                i_32_ = i_28_ - (i_12_ + i_9_ - 1);
                            int i_33_ = i_32_ * i_32_ + i_31_ * i_31_;
                            if (i_24_ > i_33_ || (i_24_ == i_33_ && (Node_Sub12.anIntArrayArray6958[i_29_][i_30_]) < i_25_)) {
                                i_23_ = i_28_;
                                i_24_ = i_33_;
                                i_22_ = i_27_;
                                i_25_ = (Node_Sub12.anIntArrayArray6958[i_29_][i_30_]);
                            }
                        }
                    }
                }
                if ((i_24_ ^ 0xffffffff) == -2147483648)
                    return -1;
            } else
                return -1;
        }
        if ((i_22_ ^ 0xffffffff) == (i_6_ ^ 0xffffffff) && i_23_ == i_7_)
            return 0;
        int i_34_ = 0;
        Class5.anIntArray146[i_34_] = i_22_;
        Class49.anIntArray655[i_34_++] = i_23_;
        int i_36_;
        int i_35_ = i_36_ = (Class301_Sub3_Sub1.anIntArrayArray9976[i_22_ - i_20_][-i_21_ + i_23_]);
        while (i_6_ != i_22_ || (i_23_ ^ 0xffffffff) != (i_7_ ^ 0xffffffff)) {
            if (i_36_ != i_35_) {
                i_36_ = i_35_;
                Class5.anIntArray146[i_34_] = i_22_;
                Class49.anIntArray655[i_34_++] = i_23_;
            }
            if ((i_35_ & 0x1 ^ 0xffffffff) == -1) {
                if ((0x4 & i_35_ ^ 0xffffffff) != -1)
                    i_23_--;
            } else
                i_23_++;
            if ((i_35_ & 0x2) == 0) {
                if ((i_35_ & 0x8 ^ 0xffffffff) != -1)
                    i_22_--;
            } else
                i_22_++;
            i_35_ = (Class301_Sub3_Sub1.anIntArrayArray9976[i_22_ - i_20_][i_23_ - i_21_]);
        }
        int i_37_ = 0;
        while ((i_34_-- ^ 0xffffffff) < -1) {
            is[i_37_] = Class5.anIntArray146[i_34_];
            is_14_[i_37_++] = Class49.anIntArray655[i_34_];
            if (is.length <= i_37_)
                break;
        }
        return i_37_;
    }

    public static void method2145(int i) {
        if (i == 1)
            aOutgoingOpcode_9075 = null;
    }

    public Node_Sub8_Sub18() {
        /* empty */
    }
}
