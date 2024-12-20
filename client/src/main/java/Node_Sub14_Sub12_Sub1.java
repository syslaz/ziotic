/* Class248_Sub14_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub12_Sub1 extends Node_Sub14_Sub12 {
    static int anInt10305;
    static s[] aSArray10306;
    static Class129 aClass129_10307;
    static int anInt10308;
    static int anInt10309;
    static int anInt10310;
    static int anInt10311;

    public Node_Sub14_Sub12_Sub1() {
        /* empty */
    }

    static final void method2308(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt10305++;
        Class363.method3820((byte) 0, i);
        if (i_4_ != 18177)
            method2309(40);
        int i_6_ = 0;
        int i_7_ = i + -i_3_;
        if (i_7_ < 0)
            i_7_ = 0;
        int i_8_ = i;
        int i_9_ = -i;
        int i_10_ = i_7_;
        int i_11_ = -i_7_;
        int i_12_ = -1;
        int i_13_ = -1;
        int[] is = Class156.anIntArrayArray1867[i_2_];
        int i_14_ = i_1_ + -i_7_;
        Class149.method1331(i_5_, i_4_ ^ ~0x4772, i_1_ + -i, is, i_14_);
        int i_15_ = i_7_ + i_1_;
        Class149.method1331(i_0_, -49, i_14_, is, i_15_);
        Class149.method1331(i_5_, -77, i_15_, is, i + i_1_);
        while (i_8_ > i_6_) {
            i_12_ += 2;
            i_13_ += 2;
            i_11_ += i_13_;
            i_9_ += i_12_;
            if (i_11_ >= 0 && (i_10_ ^ 0xffffffff) <= -2) {
                Class11.anIntArray247[i_10_] = i_6_;
                i_10_--;
                i_11_ -= i_10_ << -1581878719;
            }
            i_6_++;
            if (i_9_ >= 0) {
                i_8_--;
                if (i_7_ <= i_8_) {
                    int[] is_16_ = Class156.anIntArrayArray1867[i_8_ + i_2_];
                    int[] is_17_ = Class156.anIntArrayArray1867[-i_8_ + i_2_];
                    int i_18_ = i_6_ + i_1_;
                    int i_19_ = -i_6_ + i_1_;
                    Class149.method1331(i_5_, i_4_ ^ ~0x4757, i_19_, is_16_, i_18_);
                    Class149.method1331(i_5_, -61, i_19_, is_17_, i_18_);
                } else {
                    int[] is_20_ = Class156.anIntArrayArray1867[i_2_ - -i_8_];
                    int[] is_21_ = Class156.anIntArrayArray1867[-i_8_ + i_2_];
                    int i_22_ = Class11.anIntArray247[i_8_];
                    int i_23_ = i_1_ + i_6_;
                    int i_24_ = i_1_ - i_6_;
                    int i_25_ = i_1_ - -i_22_;
                    int i_26_ = i_1_ - i_22_;
                    Class149.method1331(i_5_, -59, i_24_, is_20_, i_26_);
                    Class149.method1331(i_0_, -72, i_26_, is_20_, i_25_);
                    Class149.method1331(i_5_, -121, i_25_, is_20_, i_23_);
                    Class149.method1331(i_5_, i_4_ + -18239, i_24_, is_21_, i_26_);
                    Class149.method1331(i_0_, -77, i_26_, is_21_, i_25_);
                    Class149.method1331(i_5_, -73, i_25_, is_21_, i_23_);
                }
                i_9_ -= i_8_ << -1378707903;
            }
            int[] is_27_ = Class156.anIntArrayArray1867[i_2_ - -i_6_];
            int[] is_28_ = Class156.anIntArrayArray1867[i_2_ - i_6_];
            int i_29_ = i_8_ + i_1_;
            int i_30_ = i_1_ + -i_8_;
            if ((i_7_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
                int i_31_ = i_10_ < i_6_ ? Class11.anIntArray247[i_6_] : i_10_;
                int i_32_ = i_1_ + i_31_;
                int i_33_ = i_1_ + -i_31_;
                Class149.method1331(i_5_, i_4_ ^ ~0x4764, i_30_, is_27_, i_33_);
                Class149.method1331(i_0_, i_4_ + -18253, i_33_, is_27_, i_32_);
                Class149.method1331(i_5_, -51, i_32_, is_27_, i_29_);
                Class149.method1331(i_5_, i_4_ + -18268, i_30_, is_28_, i_33_);
                Class149.method1331(i_0_, -52, i_33_, is_28_, i_32_);
                Class149.method1331(i_5_, i_4_ ^ ~0x4750, i_32_, is_28_, i_29_);
            } else {
                Class149.method1331(i_5_, -76, i_30_, is_27_, i_29_);
                Class149.method1331(i_5_, -53, i_30_, is_28_, i_29_);
            }
        }
    }

    public static void method2309(int i) {
        aSArray10306 = null;
        if (i != -1378707903)
            method2310(61);
        aClass129_10307 = null;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt10308++;
        if (bool != true)
            method2271(42, true);
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512 && this.method2306(65280)) {
            int[] is_34_ = is[0];
            int[] is_35_ = is[1];
            int[] is_36_ = is[2];
            int i_37_ = (i % ((Node_Sub14_Sub12) this).anInt9273 * ((Node_Sub14_Sub12) this).anInt9273);
            for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (Class185.anInt2164 ^ 0xffffffff); i_38_++) {
                int i_39_ = (((Node_Sub14_Sub12) this).anIntArray9270[(i_38_ % ((Node_Sub14_Sub12) this).anInt9269 + i_37_)]);
                is_36_[i_38_] = Class112.method794(255, i_39_) << 555472868;
                is_35_[i_38_] = Class112.method794(i_39_ >> 201015460, 4080);
                is_34_[i_38_] = Class112.method794(16711680, i_39_) >> -1092469876;
            }
        }
        return is;
    }

    static final void method2310(int i) {
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353), (byte) -71, 1);
        anInt10310++;
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327), (byte) -71, 2);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, 2);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357), (byte) -71, i);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321), (byte) -71, 0);
        Class212.method1732(8583);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348), (byte) -71, 3);
        Node_Sub20.method2521((byte) 126);
        Class332.method3400(1);
        Class5.aBoolean149 = true;
    }
}
