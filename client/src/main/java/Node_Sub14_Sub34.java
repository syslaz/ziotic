/* Class248_Sub14_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Node_Sub14_Sub34 extends Node_Sub14 {
    static int anInt9520;
    static int anInt9521;
    static int anInt9522;
    static int anInt9523;
    static Class381 aClass381_9524;
    static Rectangle[] aRectangleArray9525 = new Rectangle[100];
    static int anInt9526;
    private int anInt9527 = 0;
    private int anInt9528 = 4096;

    static final void method2376(byte i, long l, ha var_ha) {
        if (i < 101)
            method2378(-53, 92);
        Node_Sub46.anInt7393 = Class381.anInt4693;
        Class182.anInt2108 = 0;
        anInt9523++;
        Exception_Sub1.anInt96 = 0;
        Class381.anInt4693 = 0;
        long l_0_ = Class118.method1112(116);
        for (Class346_Sub8 class346_sub8 = ((Class346_Sub8) Node_Sub2_Sub3.aClass360_8861.method3815((byte) 76)); class346_sub8 != null; class346_sub8 = (Class346_Sub8) Node_Sub2_Sub3.aClass360_8861.method3809(-24951)) {
            if (class346_sub8.method3709(var_ha, l))
                Exception_Sub1.anInt96++;
        }
        if (Node_Sub2.aBoolean6824 && (l % 100L ^ 0xffffffffffffffffL) == -1L) {
            System.out.println("Particle system count: " + Node_Sub2_Sub3.aClass360_8861.method3807((byte) 4) + ", running: " + Exception_Sub1.anInt96);
            System.out.println("Emitters: " + Class182.anInt2108 + " Particles: " + Class381.anInt4693 + ". Time taken: " + (Class118.method1112(116) - l_0_) + "ms");
        }
    }

    public Node_Sub14_Sub34() {
        super(1, false);
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9522++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (bool != true)
            return null;
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[][] is_1_ = this.method2267(i, 0, 65535);
            int[] is_2_ = is_1_[0];
            int[] is_3_ = is_1_[1];
            int[] is_4_ = is_1_[2];
            int[] is_5_ = is[0];
            int[] is_6_ = is[1];
            int[] is_7_ = is[2];
            for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_8_++) {
                int i_9_ = is_2_[i_8_];
                int i_10_ = is_3_[i_8_];
                int i_11_ = is_4_[i_8_];
                if (anInt9527 > i_9_)
                    is_5_[i_8_] = anInt9527;
                else if ((anInt9528 ^ 0xffffffff) > (i_9_ ^ 0xffffffff))
                    is_5_[i_8_] = anInt9528;
                else
                    is_5_[i_8_] = i_9_;
                if (i_10_ < anInt9527)
                    is_6_[i_8_] = anInt9527;
                else if ((anInt9528 ^ 0xffffffff) > (i_10_ ^ 0xffffffff))
                    is_6_[i_8_] = anInt9528;
                else
                    is_6_[i_8_] = i_10_;
                if ((i_11_ ^ 0xffffffff) <= (anInt9527 ^ 0xffffffff)) {
                    if (anInt9528 >= i_11_)
                        is_7_[i_8_] = i_11_;
                    else
                        is_7_[i_8_] = anInt9528;
                } else
                    is_7_[i_8_] = anInt9527;
            }
        }
        return is;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_12_) {
        int i_13_ = i_12_;
        while_207_:
        do {
            do {
                if ((i_13_ ^ 0xffffffff) != -1) {
                    if ((i_13_ ^ 0xffffffff) != -2) {
                        if (i_13_ == 2)
                            break;
                        break while_207_;
                    }
                } else {
                    anInt9527 = class248_sub9.readShort(-1);
                    break while_207_;
                }
                anInt9528 = class248_sub9.readShort(-1);
                break while_207_;
            } while (false);
            ((Node_Sub14) this).aBoolean6988 = class248_sub9.readUnsignedByte((byte) -24) == 1;
        } while (false);
        if (i == -61)
            anInt9520++;
    }

    final int[] method2264(byte i, int i_14_) {
        anInt9521++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_14_, true);
        if (i != -40)
            return null;
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_15_ = this.method2265((byte) 64, i_14_, 0);
            for (int i_16_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
                int i_17_ = is_15_[i_16_];
                if (i_17_ < anInt9527)
                    is[i_16_] = anInt9527;
                else if (anInt9528 >= i_17_)
                    is[i_16_] = i_17_;
                else
                    is[i_16_] = anInt9528;
            }
        }
        return is;
    }

    public static void method2377(byte i) {
        aClass381_9524 = null;
        if (i < -95)
            aRectangleArray9525 = null;
    }

    static final Class147_Sub1 method2378(int i, int i_18_) {
        if (i != -3652)
            method2376((byte) -25, -71L, null);
        anInt9526++;
        if (!client.aBoolean5228 || (RSInterface.anInt6848 ^ 0xffffffff) < (i_18_ ^ 0xffffffff) || Class270.anInt3135 < i_18_)
            return null;
        return (Class84_Sub3.aClass147_Sub1Array5399[-RSInterface.anInt6848 + i_18_]);
    }
}
