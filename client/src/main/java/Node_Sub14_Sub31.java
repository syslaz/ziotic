/* Class248_Sub14_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub31 extends Node_Sub14 {
    private int anInt9481;
    static int anInt9482;
    private int anInt9483 = 2048;
    static int anInt9484;
    static IncommingOpcode aIncommingOpcode_9485 = new IncommingOpcode(85, 1);
    static int anInt9486;
    static int anInt9487;
    private int anInt9488;
    static int[][] anIntArrayArray9489 = {{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
    static int anInt9490;
    static int[] anIntArray9491 = new int[256];
    static Class285 aClass285_9492;
    static Class34 aClass34_9493;

    public Node_Sub14_Sub31() {
        super(1, false);
        anInt9481 = 1024;
        anInt9488 = 3072;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9486++;
        if (bool != true)
            anInt9488 = -43;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[][] is_0_ = this.method2267(i, 0, 65535);
            int[] is_1_ = is_0_[0];
            int[] is_2_ = is_0_[1];
            int[] is_3_ = is_0_[2];
            int[] is_4_ = is[0];
            int[] is_5_ = is[1];
            int[] is_6_ = is[2];
            for (int i_7_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
                is_4_[i_7_] = anInt9481 - -(anInt9483 * is_1_[i_7_] >> -1122437620);
                is_5_[i_7_] = anInt9481 - -(anInt9483 * is_2_[i_7_] >> -1188703700);
                is_6_[i_7_] = (is_3_[i_7_] * anInt9483 >> -957038964) + anInt9481;
            }
        }
        return is;
    }

    static final void method2366(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
        anInt9487++;
        if ((i_12_ ^ 0xffffffff) > -513 || i_13_ < 512 || i_12_ > -1024 + Node_Sub8_Sub4.anInt8360 * 512 || 512 * Node_Sub22.anInt7074 + -1024 < i_13_)
            Class303.anIntArray3527[0] = Class303.anIntArray3527[1] = -1;
        else {
            if (i_15_ != 0)
                method2366(14, -53, -69, 92, -65, -79, -97, -88, -79, -26);
            int i_17_ = -i + Class353.method3753(i_13_, i_12_, i_15_ + -79, i_10_);
            if (!Node_Sub8_Sub6.aBoolean8949) {
                Class272.aViewport_3166.method1862(i_16_, 0, 0);
                Class287.aHa3381.a(Class272.aViewport_3166);
            } else
                Class75.method557(true, 4734);
            if (!Class357.aBoolean4416)
                Class287.aHa3381.da(i_12_, i_17_, i_13_, Class303.anIntArray3527);
            else
                Class287.aHa3381.HA(i_12_, i_17_, i_13_, ObjectDefinition.anInt3100, Class303.anIntArray3527);
            if (Node_Sub8_Sub6.aBoolean8949)
                Class206.method1700(false);
            else {
                Class272.aViewport_3166.method1862(-i_16_, 0, 0);
                Class287.aHa3381.a(Class272.aViewport_3166);
            }
        }
    }

    final void method2263(int i) {
        if (i != 8351)
            method2367(false);
        anInt9490++;
        anInt9483 = anInt9488 + -anInt9481;
    }

    public static void method2367(boolean bool) {
        anIntArrayArray9489 = null;
        if (bool == true) {
            aClass285_9492 = null;
            anIntArray9491 = null;
            aClass34_9493 = null;
            aIncommingOpcode_9485 = null;
        }
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_18_) {
        if (i != -61)
            method2264((byte) 68, -107);
        anInt9484++;
        int i_19_ = i_18_;
        while_193_:
        do {
            do {
                if (i_19_ != 0) {
                    if ((i_19_ ^ 0xffffffff) != -2) {
                        if (i_19_ == 2)
                            break;
                        break while_193_;
                    }
                } else {
                    anInt9481 = class248_sub9.readShort(i + 60);
                    return;
                }
                anInt9488 = class248_sub9.readShort(-1);
                return;
            } while (false);
            ((Node_Sub14) this).aBoolean6988 = (class248_sub9.readUnsignedByte((byte) 90) ^ 0xffffffff) == -2;
        } while (false);
    }

    final int[] method2264(byte i, int i_20_) {
        if (i != -40)
            method2366(51, -86, 49, -88, 19, -74, -29, 43, 117, -23);
        anInt9482++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_20_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int[] is_21_ = this.method2265((byte) 64, i_20_, 0);
            for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_22_++)
                is[i_22_] = (anInt9483 * is_21_[i_22_] >> -1025007604) + anInt9481;
        }
        return is;
    }

    static {
        for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
            int i_23_ = i;
            for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -9; i_24_++) {
                if ((i_23_ & 0x1) == 1)
                    i_23_ = ~0x12477cdf ^ i_23_ >>> -1807333727;
                else
                    i_23_ >>>= 1;
            }
            anIntArray9491[i] = i_23_;
        }
        aClass34_9493 = new Class34();
    }
}
