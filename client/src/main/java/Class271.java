/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class271 {
    byte[][] aByteArrayArray3139;
    int anInt3140;
    int anInt3141;
    static int anInt3142 = -1;
    int[] anIntArray3143;
    int[] anIntArray3144;
    Class127[] aClass127Array3145;
    int anInt3146;
    static boolean[] aBooleanArray3147;
    int[] anIntArray3148;
    int[] anIntArray3149;
    static int anInt3150;
    int[] anIntArray3151;
    private byte[] aByteArray3152;
    static int anInt3153;
    Class127 aClass127_3154;
    static int anInt3155;
    static int[] anIntArray3156 = new int[2048];
    static Class46 aClass46_3157;
    int[] anIntArray3158;
    int anInt3159;
    int[][] anIntArrayArray3160;
    int[][] anIntArrayArray3161;

    private final void method2830(byte[] is, int i) {
        anInt3155++;
        ByteStream class248_sub9 = new ByteStream(Class165.method1533(is, 22047));
        int i_0_ = class248_sub9.readUnsignedByte((byte) 110);
        if (i_0_ < 5 || (i_0_ ^ 0xffffffff) < -7)
            throw new RuntimeException();
        if ((i_0_ ^ 0xffffffff) <= -7)
            ((Class271) this).anInt3140 = class248_sub9.readInt(false);
        else
            ((Class271) this).anInt3140 = 0;
        int i_1_ = class248_sub9.readUnsignedByte((byte) 109);
        boolean bool = (0x1 & i_1_) != 0;
        ((Class271) this).anInt3146 = class248_sub9.readShort(-1);
        boolean bool_2_ = (i_1_ & 0x2 ^ 0xffffffff) != -1;
        int i_3_ = 0;
        int i_4_ = -1;
        ((Class271) this).anIntArray3149 = new int[((Class271) this).anInt3146];
        for (int i_5_ = 0; (((Class271) this).anInt3146 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
            ((Class271) this).anIntArray3149[i_5_] = i_3_ += class248_sub9.readShort(-1);
            if ((i_4_ ^ 0xffffffff) > (((Class271) this).anIntArray3149[i_5_] ^ 0xffffffff))
                i_4_ = ((Class271) this).anIntArray3149[i_5_];
        }
        ((Class271) this).anInt3159 = i_4_ - i;
        ((Class271) this).anIntArray3158 = new int[((Class271) this).anInt3159];
        ((Class271) this).anIntArrayArray3161 = new int[((Class271) this).anInt3159][];
        ((Class271) this).anIntArray3144 = new int[((Class271) this).anInt3159];
        ((Class271) this).anIntArray3148 = new int[((Class271) this).anInt3159];
        if (bool_2_)
            ((Class271) this).aByteArrayArray3139 = new byte[((Class271) this).anInt3159][];
        ((Class271) this).anIntArray3143 = new int[((Class271) this).anInt3159];
        if (bool) {
            ((Class271) this).anIntArray3151 = new int[((Class271) this).anInt3159];
            for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((Class271) this).anInt3159 ^ 0xffffffff)); i_6_++)
                ((Class271) this).anIntArray3151[i_6_] = -1;
            for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (((Class271) this).anInt3146 ^ 0xffffffff)); i_7_++)
                ((Class271) this).anIntArray3151[(((Class271) this).anIntArray3149[i_7_])] = class248_sub9.readInt(false);
            ((Class271) this).aClass127_3154 = new Class127(((Class271) this).anIntArray3151);
        }
        for (int i_8_ = 0; ((Class271) this).anInt3146 > i_8_; i_8_++)
            ((Class271) this).anIntArray3158[(((Class271) this).anIntArray3149[i_8_])] = class248_sub9.readInt(false);
        if (bool_2_) {
            for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (((Class271) this).anInt3146 ^ 0xffffffff)); i_9_++) {
                byte[] is_10_ = new byte[64];
                class248_sub9.method2189(is_10_, 0, 64, i + 127);
                ((Class271) this).aByteArrayArray3139[(((Class271) this).anIntArray3149[i_9_])] = is_10_;
            }
        }
        for (int i_11_ = 0; i_11_ < ((Class271) this).anInt3146; i_11_++)
            ((Class271) this).anIntArray3143[(((Class271) this).anIntArray3149[i_11_])] = class248_sub9.readInt(false);
        for (int i_12_ = 0; i_12_ < ((Class271) this).anInt3146; i_12_++)
            ((Class271) this).anIntArray3148[(((Class271) this).anIntArray3149[i_12_])] = class248_sub9.readShort(-1);
        for (int i_13_ = 0; i_13_ < ((Class271) this).anInt3146; i_13_++) {
            int i_14_ = ((Class271) this).anIntArray3149[i_13_];
            int i_15_ = ((Class271) this).anIntArray3148[i_14_];
            i_3_ = 0;
            ((Class271) this).anIntArrayArray3161[i_14_] = new int[i_15_];
            int i_16_ = -1;
            for (int i_17_ = 0; (i_15_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
                int i_18_ = (((Class271) this).anIntArrayArray3161[i_14_][i_17_] = i_3_ += class248_sub9.readShort(-1));
                if (i_18_ > i_16_)
                    i_16_ = i_18_;
            }
            ((Class271) this).anIntArray3144[i_14_] = i_16_ + 1;
            if (i_15_ == 1 + i_16_)
                ((Class271) this).anIntArrayArray3161[i_14_] = null;
        }
        if (bool) {
            ((Class271) this).anIntArrayArray3160 = new int[i_4_ + 1][];
            ((Class271) this).aClass127Array3145 = new Class127[1 + i_4_];
            for (int i_19_ = 0; i_19_ < ((Class271) this).anInt3146; i_19_++) {
                int i_20_ = ((Class271) this).anIntArray3149[i_19_];
                int i_21_ = ((Class271) this).anIntArray3148[i_20_];
                ((Class271) this).anIntArrayArray3160[i_20_] = new int[((Class271) this).anIntArray3144[i_20_]];
                for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > (((Class271) this).anIntArray3144[i_20_] ^ 0xffffffff)); i_22_++)
                    ((Class271) this).anIntArrayArray3160[i_20_][i_22_] = -1;
                for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_23_++) {
                    int i_24_;
                    if (((Class271) this).anIntArrayArray3161[i_20_] != null)
                        i_24_ = (((Class271) this).anIntArrayArray3161[i_20_][i_23_]);
                    else
                        i_24_ = i_23_;
                    ((Class271) this).anIntArrayArray3160[i_20_][i_24_] = class248_sub9.readInt(false);
                }
                ((Class271) this).aClass127Array3145[i_20_] = new Class127(((Class271) this).anIntArrayArray3160[i_20_]);
            }
        }
    }

    static final void method2831(int i, int i_25_, int i_26_, int i_27_, int i_28_) {
        if (Class340_Sub8.anIntArrayArray8187 != null)
            Class340_Sub8.anIntArrayArray8187[i][i_25_] = ~0xffffff | i_26_;
        if (Class346_Sub7_Sub5.aShortArrayArray9957 != null)
            Class346_Sub7_Sub5.aShortArrayArray9957[i][i_25_] = (short) i_27_;
        if (Class250.aByteArrayArray2822 != null)
            Class250.aByteArrayArray2822[i][i_25_] = (byte) i_28_;
    }

    public static void method2832(byte i) {
        int i_29_ = 61 / ((45 - i) / 38);
        aBooleanArray3147 = null;
        aClass46_3157 = null;
        anIntArray3156 = null;
    }

    static final Class129 method2833(int i, ha var_ha, int i_30_) {
        if (i != 0)
            method2831(-82, -59, 107, -24, -119);
        anInt3153++;
        Node_Sub22 class248_sub22 = ((Node_Sub22) Node_Sub14_Sub35.aClass65_9540.method501((long) i_30_, (byte) 31));
        if (class248_sub22 != null) {
            Node_Sub2_Sub1 class248_sub2_sub1 = ((Node_Sub22) class248_sub22).aClass86_Sub1_7073.method648((byte) -77);
            ((Node_Sub22) class248_sub22).aBoolean7076 = true;
            if (class248_sub2_sub1 != null)
                return class248_sub2_sub1.method1989(var_ha, (byte) 107);
        }
        return null;
    }

    static final Node_Sub50 method2834(int i, Class381 class381, int i_31_) {
        anInt3150++;
        byte[] is = class381.method3930(-1, i);
        if (i_31_ < 63)
            return null;
        if (is == null)
            return null;
        return new Node_Sub50(is);
    }

    Class271(byte[] is, int i, byte[] is_32_) {
        ((Class271) this).anInt3141 = Class289.method3089(is.length, (byte) 103, is);
        if ((i ^ 0xffffffff) != (((Class271) this).anInt3141 ^ 0xffffffff))
            throw new RuntimeException();
        if (is_32_ != null) {
            if ((is_32_.length ^ 0xffffffff) != -65)
                throw new RuntimeException();
            aByteArray3152 = Class19.method230(0, is, is.length, 0);
            for (int i_33_ = 0; i_33_ < 64; i_33_++) {
                if (aByteArray3152[i_33_] != is_32_[i_33_])
                    throw new RuntimeException();
            }
        }
        method2830(is, -1);
    }
}
