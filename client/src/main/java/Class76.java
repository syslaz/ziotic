/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76 {
    static OutgoingOpcode aOutgoingOpcode_980 = new OutgoingOpcode(66, -1);
    static int anInt981;
    static Class168 aClass168_982 = new Class168(13, 0, 1, 0);
    static int[] anIntArray983;
    static int anInt984;

    static final void method559(int[] is, boolean bool, int[] is_0_) {
        anInt984++;
        if (is_0_ == null || is == null) {
            Class50.aByteArrayArrayArray663 = null;
            Node_Sub35.anIntArray7250 = null;
            Class162.anIntArray1906 = null;
        } else {
            if (bool != false)
                method559(null, false, null);
            Node_Sub35.anIntArray7250 = is_0_;
            Class162.anIntArray1906 = new int[is_0_.length];
            Class50.aByteArrayArrayArray663 = new byte[is_0_.length][][];
            for (int i = 0; i < Node_Sub35.anIntArray7250.length; i++)
                Class50.aByteArrayArrayArray663[i] = new byte[is[i]][];
        }
    }

    static final void method560(Class310_Sub1 class310_sub1, int i, byte[][] is) {
        anInt981++;
        int i_1_ = 0;
        if (i > -40)
            method560(null, 42, null);
        for (/**/; (i_1_ ^ 0xffffffff) > (((Class310) class310_sub1).anInt3608 ^ 0xffffffff); i_1_++) {
            Node_Sub37.method2594(-25926);
            for (int i_2_ = 0; i_2_ < Node_Sub8_Sub4.anInt8360 >> 816222019; i_2_++) {
                for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Node_Sub22.anInt7074 >> -236273085 ^ 0xffffffff)); i_3_++) {
                    int i_4_ = Class245.anIntArrayArrayArray2749[i_1_][i_2_][i_3_];
                    if ((i_4_ ^ 0xffffffff) != 0) {
                        int i_5_ = 0x3 & i_4_ >> 1371434840;
                        if (!((Class310) class310_sub1).aBoolean3604 || i_5_ == 0) {
                            int i_6_ = (0x7 & i_4_) >> 1418375297;
                            int i_7_ = (i_4_ & 0xffdafe) >> -1326531122;
                            int i_8_ = 0x7ff & i_4_ >> 395862595;
                            int i_9_ = (i_7_ / 8 << 392960552) - -(i_8_ / 8);
                            for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (Node_Sub14_Sub36.anIntArray9544.length ^ 0xffffffff)); i_10_++) {
                                if (i_9_ == (Node_Sub14_Sub36.anIntArray9544[i_10_]) && is[i_10_] != null) {
                                    class310_sub1.method3260(Class287.aHa3381, i_5_, (0x7 & i_8_) * 8, is[i_10_], 8 * i_2_, Class182.aClass164Array2114, 8 * i_3_, 8 * (0x7 & i_7_), (byte) -124, i_6_, i_1_);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method561(int i) {
        aOutgoingOpcode_980 = null;
        anIntArray983 = null;
        int i_11_ = -126 / ((i - 45) / 40);
        aClass168_982 = null;
    }
}
