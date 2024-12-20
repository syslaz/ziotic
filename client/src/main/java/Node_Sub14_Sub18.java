/* Class248_Sub14_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub18 extends Node_Sub14 {
    static int anInt9347;
    static int anInt9348;
    static int anInt9349;
    static int anInt9350;
    static Class168 aClass168_9351 = new Class168(2, 4, 4, 0);
    static int anInt9352;
    static int anInt9353;
    static d aD9354;

    static final void method2328(Class156 class156) {
        if (Class297_Sub1.anInt8481 < 65535) {
            Node_Sub42 class248_sub42 = ((Class156) class156).aClass248_Sub42_1853;
            Class340.aClass156Array3963[Class297_Sub1.anInt8481] = class156;
            Class271.aBooleanArray3147[Class297_Sub1.anInt8481] = false;
            Class297_Sub1.anInt8481++;
            int i = ((Class156) class156).anInt1864;
            if (((Class156) class156).aBoolean1856)
                i = 0;
            int i_0_ = ((Class156) class156).anInt1864;
            if (((Class156) class156).aBoolean1848)
                i_0_ = Class111_Sub1.anInt5531 - 1;
            for (int i_1_ = i; i_1_ <= i_0_; i_1_++) {
                int i_2_ = 0;
                int i_3_ = ((class248_sub42.method2625((byte) -118) - class248_sub42.method2628(-31) + Class84_Sub9.anInt5495) >> Class96.anInt1249);
                if (i_3_ < 0) {
                    i_2_ -= i_3_;
                    i_3_ = 0;
                }
                int i_4_ = ((class248_sub42.method2625((byte) -104) + class248_sub42.method2628(-62) - Class84_Sub9.anInt5495) >> Class96.anInt1249);
                if (i_4_ >= Class89.anInt1106)
                    i_4_ = Class89.anInt1106 - 1;
                for (int i_5_ = i_3_; i_5_ <= i_4_; i_5_++) {
                    int i_6_ = ((Class156) class156).aShortArray1857[i_2_++];
                    int i_7_ = (((class248_sub42.method2620(102) - class248_sub42.method2628(-58) + Class84_Sub9.anInt5495) >> Class96.anInt1249) + (i_6_ >>> 8));
                    int i_8_ = i_7_ + (i_6_ & 0xff) - 1;
                    if (i_7_ < 0)
                        i_7_ = 0;
                    if (i_8_ >= Class225_Sub1.anInt8454)
                        i_8_ = Class225_Sub1.anInt8454 - 1;
                    for (int i_9_ = i_7_; i_9_ <= i_8_; i_9_++) {
                        long l = (Class286.aLongArrayArrayArray3380[i_1_][i_9_][i_5_]);
                        if ((l & 0xffffL) == 0L)
                            Class286.aLongArrayArrayArray3380[i_1_][i_9_][i_5_] = l | (long) Class297_Sub1.anInt8481;
                        else if ((l & 0xffff0000L) == 0L)
                            Class286.aLongArrayArrayArray3380[i_1_][i_9_][i_5_] = l | (long) Class297_Sub1.anInt8481 << 16;
                        else if ((l & 0xffff00000000L) == 0L)
                            Class286.aLongArrayArrayArray3380[i_1_][i_9_][i_5_] = l | (long) Class297_Sub1.anInt8481 << 32;
                        else if ((l & ~0xffffffffffffL) == 0L)
                            Class286.aLongArrayArrayArray3380[i_1_][i_9_][i_5_] = l | (long) Class297_Sub1.anInt8481 << 48;
                    }
                }
            }
        }
    }

    private final void method2329(byte i, int i_10_, int i_11_) {
        anInt9353++;
        int i_12_ = Node_Sub8_Sub3.anIntArray8921[i_11_];
        int i_13_ = Node_Sub14_Sub3.anIntArray9184[i_10_];
        float f = (float) Math.atan2((double) (-2048 + i_12_), (double) (i_13_ - 2048));
        if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345) {
            Node_Sub14_Sub3.anInt9182 = i_10_;
            Class279.anInt3252 = i_11_;
        } else if ((double) f <= -1.5707963267948966 && (double) f >= -2.356194490192345) {
            Class279.anInt3252 = i_10_;
            Node_Sub14_Sub3.anInt9182 = i_11_;
        } else if (!((double) f <= -0.7853981633974483) || !((double) f >= -1.5707963267948966)) {
            if (!(f <= 0.0F) || !((double) f >= -0.7853981633974483)) {
                if (f >= 0.0F && (double) f <= 0.7853981633974483) {
                    Node_Sub14_Sub3.anInt9182 = -i_10_ + Class250.anInt2819;
                    Class279.anInt3252 = -i_11_ + Class185.anInt2164;
                } else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
                    Class279.anInt3252 = Class185.anInt2164 - i_10_;
                    Node_Sub14_Sub3.anInt9182 = -i_11_ + Class250.anInt2819;
                } else if (!((double) f >= 1.5707963267948966) || !((double) f <= 2.356194490192345)) {
                    if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
                        Class279.anInt3252 = -i_11_ + Class185.anInt2164;
                        Node_Sub14_Sub3.anInt9182 = i_10_;
                    }
                } else {
                    Node_Sub14_Sub3.anInt9182 = -i_11_ + Class250.anInt2819;
                    Class279.anInt3252 = i_10_;
                }
            } else {
                Node_Sub14_Sub3.anInt9182 = -i_10_ + Class250.anInt2819;
                Class279.anInt3252 = i_11_;
            }
        } else {
            Node_Sub14_Sub3.anInt9182 = i_11_;
            Class279.anInt3252 = Class185.anInt2164 - i_10_;
        }
        if (i != -66)
            aD9354 = null;
        Class279.anInt3252 &= Class226_Sub2.anInt6664;
        Node_Sub14_Sub3.anInt9182 &= za_Sub1.anInt9802;
    }

    final int[] method2264(byte i, int i_14_) {
        anInt9349++;
        int[] is = ((Node_Sub14) this).aClass227_6993.method1818(i_14_, true);
        if (i != -40)
            aClass168_9351 = null;
        if (((Class227) ((Node_Sub14) this).aClass227_6993).aBoolean2564) {
            for (int i_15_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
                method2329((byte) -66, i_14_, i_15_);
                int[] is_16_ = this.method2265((byte) 64, Node_Sub14_Sub3.anInt9182, 0);
                is[i_15_] = is_16_[Class279.anInt3252];
            }
        }
        return is;
    }

    static final void method2330(int i, int i_17_, int i_18_, int i_19_, int i_20_) {
        anInt9347++;
        int i_21_ = 0;
        if (i_17_ != 1)
            aD9354 = null;
        int i_22_ = i;
        int i_23_ = -i;
        int i_24_ = -1;
        int i_25_ = Class49.method389(Class289.anInt3399, i_17_ ^ 0x52, Class302.anInt3500, i + i_20_);
        int i_26_ = Class49.method389(Class289.anInt3399, i_17_ ^ 0x6c, Class302.anInt3500, -i + i_20_);
        Class149.method1331(i_19_, i_17_ + -84, i_26_, Class156.anIntArrayArray1867[i_18_], i_25_);
        while ((i_21_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
            i_24_ += 2;
            i_23_ += i_24_;
            if ((i_23_ ^ 0xffffffff) < -1) {
                i_22_--;
                i_23_ -= i_22_ << 66367201;
                int i_27_ = -i_22_ + i_18_;
                int i_28_ = i_18_ + i_22_;
                if (i_28_ >= Class181.anInt2099 && aa_Sub3.anInt5270 >= i_27_) {
                    int i_29_ = Class49.method389(Class289.anInt3399, i_17_ ^ 0x71, Class302.anInt3500, i_20_ + i_21_);
                    int i_30_ = Class49.method389(Class289.anInt3399, 35, Class302.anInt3500, i_20_ + -i_21_);
                    if (i_28_ <= aa_Sub3.anInt5270)
                        Class149.method1331(i_19_, i_17_ ^ ~0x77, i_30_, (Class156.anIntArrayArray1867[i_28_]), i_29_);
                    if (i_27_ >= Class181.anInt2099)
                        Class149.method1331(i_19_, i_17_ + -71, i_30_, (Class156.anIntArrayArray1867[i_27_]), i_29_);
                }
            }
            i_21_++;
            int i_31_ = i_18_ - i_21_;
            int i_32_ = i_18_ - -i_21_;
            if (Class181.anInt2099 <= i_32_ && aa_Sub3.anInt5270 >= i_31_) {
                int i_33_ = Class49.method389(Class289.anInt3399, 114, Class302.anInt3500, i_22_ + i_20_);
                int i_34_ = Class49.method389(Class289.anInt3399, 70, Class302.anInt3500, i_20_ - i_22_);
                if (i_32_ <= aa_Sub3.anInt5270)
                    Class149.method1331(i_19_, i_17_ ^ ~0x4b, i_34_, Class156.anIntArrayArray1867[i_32_], i_33_);
                if ((i_31_ ^ 0xffffffff) <= (Class181.anInt2099 ^ 0xffffffff))
                    Class149.method1331(i_19_, -87, i_34_, Class156.anIntArrayArray1867[i_31_], i_33_);
            }
        }
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_35_) {
        anInt9348++;
        if (i != -61)
            aClass168_9351 = null;
        if ((i_35_ ^ 0xffffffff) == -1)
            ((Node_Sub14) this).aBoolean6988 = class248_sub9.readUnsignedByte((byte) 117) == 1;
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9350++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (bool != true)
            anInt9352 = 0;
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[] is_36_ = is[0];
            int[] is_37_ = is[1];
            int[] is_38_ = is[2];
            for (int i_39_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
                method2329((byte) -66, i, i_39_);
                int[][] is_40_ = this.method2267(Node_Sub14_Sub3.anInt9182, 0, 65535);
                is_36_[i_39_] = is_40_[0][Class279.anInt3252];
                is_37_[i_39_] = is_40_[1][Class279.anInt3252];
                is_38_[i_39_] = is_40_[2][Class279.anInt3252];
            }
        }
        return is;
    }

    public Node_Sub14_Sub18() {
        super(1, false);
    }

    public static void method2331(int i) {
        aClass168_9351 = null;
        aD9354 = null;
        if (i != -15789)
            method2330(119, -73, 76, 90, 110);
    }
}
