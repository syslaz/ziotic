/* Class248_Sub14_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub10 extends Node_Sub14 {
    static int anInt9246;
    static int anInt9247;
    private int anInt9248 = 4;
    static int anInt9249;
    static int anInt9250;
    static int anInt9251;
    static int anInt9252;
    private int anInt9253 = 4;

    final int[][] method2271(int i, boolean bool) {
        if (bool != true)
            method2302(false, null);
        anInt9250++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int i_0_ = Class185.anInt2164 / anInt9253;
            int i_1_ = Class250.anInt2819 / anInt9248;
            int[][] is_2_;
            if (i_1_ > 0) {
                int i_3_ = i % i_1_;
                is_2_ = this.method2267(Class250.anInt2819 * i_3_ / i_1_, 0, 65535);
            } else
                is_2_ = this.method2267(0, 0, 65535);
            int[] is_4_ = is_2_[0];
            int[] is_5_ = is_2_[1];
            int[] is_6_ = is_2_[2];
            int[] is_7_ = is[0];
            int[] is_8_ = is[1];
            int[] is_9_ = is[2];
            for (int i_10_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
                int i_11_;
                if ((i_0_ ^ 0xffffffff) < -1) {
                    int i_12_ = i_10_ % i_0_;
                    i_11_ = i_12_ * Class185.anInt2164 / i_0_;
                } else
                    i_11_ = 0;
                is_7_[i_10_] = is_4_[i_11_];
                is_8_[i_10_] = is_5_[i_11_];
                is_9_[i_10_] = is_6_[i_11_];
            }
        }
        return is;
    }

    public Node_Sub14_Sub10() {
        super(1, false);
    }

    final int[] method2264(byte i, int i_13_) {
        if (i != -40)
            return null;
        anInt9251++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_13_, true);
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            int i_14_ = Class185.anInt2164 / anInt9253;
            int i_15_ = Class250.anInt2819 / anInt9248;
            int[] is_16_;
            if ((i_15_ ^ 0xffffffff) < -1) {
                int i_17_ = i_13_ % i_15_;
                is_16_ = this.method2265((byte) 64, Class250.anInt2819 * i_17_ / i_15_, 0);
            } else
                is_16_ = this.method2265((byte) 64, 0, 0);
            for (int i_18_ = 0; i_18_ < Class185.anInt2164; i_18_++) {
                if (i_14_ > 0) {
                    int i_19_ = i_18_ % i_14_;
                    is[i_18_] = is_16_[Class185.anInt2164 * i_19_ / i_14_];
                } else
                    is[i_18_] = is_16_[0];
            }
        }
        return is;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_20_) {
        int i_21_ = i_20_;
        do {
            if (i_21_ != 0) {
                if (i_21_ != 1)
                    break;
            } else {
                anInt9253 = class248_sub9.readUnsignedByte((byte) 95);
                break;
            }
            anInt9248 = class248_sub9.readUnsignedByte((byte) 100);
        } while (false);
        if (i == -61)
            anInt9247++;
    }

    static final boolean method2301(int i, int i_22_, byte i_23_) {
        anInt9246++;
        if (i_23_ != -74)
            method2302(false, null);
        return (Class9.method196(i_23_ + 90, i, i_22_) & Class40.method298(i_22_, i, 125));
    }

    static final void method2302(boolean bool, Node_Sub8_Sub5 class248_sub8_sub5) {
        anInt9252++;
        if (bool != true)
            method2301(-4, 74, (byte) 34);
        boolean bool_24_ = false;
        class248_sub8_sub5.method2021((byte) -26);
        for (Node_Sub8_Sub5 class248_sub8_sub5_25_ = (Node_Sub8_Sub5) Class363.aClass64_4478.method492(896); class248_sub8_sub5_25_ != null; class248_sub8_sub5_25_ = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
            if (Class299.method3176(class248_sub8_sub5.method2051(116), 0, class248_sub8_sub5_25_.method2051(119))) {
                bool_24_ = true;
                Node_Sub14_Sub12.method2307(class248_sub8_sub5_25_, (byte) -29, class248_sub8_sub5);
                break;
            }
        }
        if (!bool_24_)
            Class363.aClass64_4478.method491(class248_sub8_sub5, -119);
    }
}
