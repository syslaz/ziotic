/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class17 {
    static boolean aBoolean287 = false;
    static int anInt288;
    static int anInt289;
    static float[] aFloatArray290 = {0.0F, -1.0F, 0.0F, 0.0F};
    static int anInt291 = 0;
    static int anInt292;

    public static void method223(int i) {
        aFloatArray290 = null;
        if (i != -33)
            method224(58, -72);
    }

    public final String toString() {
        anInt292++;
        throw new IllegalStateException();
    }

    static final void method224(int i, int i_0_) {
        anInt289++;
        ByteStream.aLong6886 = 1000000000L / (long) i;
        if (i_0_ != -1)
            anInt291 = -76;
    }

    public Class17() {
        /* empty */
    }

    static final int method225(int i) {
        anInt288++;
        int i_1_ = -99 / ((i - -3) / 36);
        if (Class371.aClass354_4564 == null) {
            if (!Class145.aBoolean1721 && Class300.aClass248_Sub8_Sub11_3498 != null)
                return (((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).anInt9004);
            int i_2_ = Class46.aClass269_600.method2817((byte) -109);
            int i_3_ = Class46.aClass269_600.method2809(61);
            if (Class342.aBoolean4008) {
                if (i_2_ > Class239.anInt2654 && (Class239.anInt2654 - -Class346_Sub2.anInt8261 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
                    int i_4_ = -1;
                    for (int i_5_ = 0; Class113.anInt1402 > i_5_; i_5_++) {
                        if (Class240.aBoolean2682) {
                            int i_6_ = Class346_Sub10.anInt8354 - -33 + i_5_ * 16;
                            if ((-13 + i_6_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff) && i_3_ <= 3 + i_6_)
                                i_4_ = i_5_;
                        } else {
                            int i_7_ = i_5_ * 16 + (Class346_Sub10.anInt8354 - -31);
                            if (-13 + i_7_ < i_3_ && 3 + i_7_ >= i_3_)
                                i_4_ = i_5_;
                        }
                    }
                    if ((i_4_ ^ 0xffffffff) != 0) {
                        int i_8_ = 0;
                        Class50 class50 = new Class50(Class363.aClass64_4478);
                        for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) class50.method400((byte) 47)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) class50.method398(false))) {
                            if ((i_4_ ^ 0xffffffff) == (i_8_++ ^ 0xffffffff))
                                return (((Node_Sub8_Sub11) (Node_Sub8_Sub11) (((Node_Sub8) (((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856)).aClass248_Sub8_6871)).anInt9004);
                        }
                    }
                } else if (Class276.aClass248_Sub8_Sub5_3209 != null && ((Class203.anInt2314 ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) && (Class203.anInt2314 - -Class316_Sub2.anInt8053 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
                    int i_9_ = -1;
                    for (int i_10_ = 0; ((((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).anInt8937 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
                        if (!Class240.aBoolean2682) {
                            int i_11_ = i_10_ * 16 + (Class54_Sub3.anInt5344 - -31);
                            if (-13 + i_11_ < i_3_ && i_3_ <= i_11_ + 3)
                                i_9_ = i_10_;
                        } else {
                            int i_12_ = i_10_ * 16 + (33 + Class54_Sub3.anInt5344);
                            if ((i_3_ ^ 0xffffffff) < (i_12_ + -13 ^ 0xffffffff) && (i_3_ ^ 0xffffffff) >= (i_12_ + 3 ^ 0xffffffff))
                                i_9_ = i_10_;
                        }
                    }
                    if ((i_9_ ^ 0xffffffff) != 0) {
                        int i_13_ = 0;
                        Class50 class50 = new Class50(((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936);
                        for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) class50.method400((byte) 47)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) class50.method398(false))) {
                            if (i_9_ == i_13_++)
                                return (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9004);
                        }
                    }
                }
            } else if (Class239.anInt2654 < i_2_ && (i_2_ < Class239.anInt2654 - -Class346_Sub2.anInt8261)) {
                int i_14_ = -1;
                for (int i_15_ = 0; (Class379.anInt4638 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
                    if (!Class240.aBoolean2682) {
                        int i_16_ = ((Class379.anInt4638 + (-1 + -i_15_)) * 16 + Class346_Sub10.anInt8354 + 31);
                        if (-13 + i_16_ < i_3_ && (i_3_ ^ 0xffffffff) >= (3 + i_16_ ^ 0xffffffff))
                            i_14_ = i_15_;
                    } else {
                        int i_17_ = (Class346_Sub10.anInt8354 + 33 + 16 * (-i_15_ + (-1 + Class379.anInt4638)));
                        if (i_17_ - 13 < i_3_ && i_3_ <= i_17_ - -3)
                            i_14_ = i_15_;
                    }
                }
                if (i_14_ != -1) {
                    int i_18_ = 0;
                    Class251 class251 = new Class251(Class358.aClass293_4424);
                    for (Node_Sub8_Sub11 class248_sub8_sub11 = (Node_Sub8_Sub11) class251.method2714(true); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) class251.method2715((byte) -120))) {
                        if ((i_18_++ ^ 0xffffffff) == (i_14_ ^ 0xffffffff))
                            return (((Node_Sub8_Sub11) class248_sub8_sub11).anInt9004);
                    }
                }
            }
        }
        return -1;
    }
}
