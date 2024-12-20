/* Class248_Sub14_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node_Sub14_Sub12 extends Node_Sub14 {
    static int anInt9264;
    static int anInt9265;
    static int anInt9266;
    static long[][] aLongArrayArray9267;
    static int anInt9268 = 0;
    int anInt9269;
    int[] anIntArray9270;
    private int anInt9271 = -1;
    static int anInt9272;
    int anInt9273;
    static int anInt9274;
    static int anInt9275;
    static long[] aLongArray9276;
    static int anInt9277;
    static int anInt9278;
    static int[] anIntArray9279;

    public static void method2305(byte i) {
        if (i <= 39)
            method2305((byte) -75);
        aLongArrayArray9267 = null;
        aLongArray9276 = null;
        anIntArray9279 = null;
    }

    final boolean method2306(int i) {
        anInt9265++;
        if (((Node_Sub14_Sub12) this).anIntArray9270 != null)
            return true;
        if (i != 65280)
            method2273(true);
        if ((anInt9271 ^ 0xffffffff) <= -1) {
            Class157 class157 = (Class65.anInt878 < 0 ? Class157.method1382(Class273.aClass381_5004, anInt9271) : Class157.method1379(Class273.aClass381_5004, Class65.anInt878, anInt9271));
            class157.method1390();
            ((Node_Sub14_Sub12) this).anIntArray9270 = class157.method1380();
            ((Node_Sub14_Sub12) this).anInt9269 = ((Class157) class157).anInt1873;
            ((Node_Sub14_Sub12) this).anInt9273 = ((Class157) class157).anInt1874;
            return true;
        }
        return false;
    }

    int[][] method2271(int i, boolean bool) {
        anInt9274++;
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (bool != true)
            return null;
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512 && method2306(65280)) {
            int[] is_0_ = is[0];
            int[] is_1_ = is[1];
            int[] is_2_ = is[2];
            int i_3_ = ((((Class250.anInt2819 ^ 0xffffffff) == (((Node_Sub14_Sub12) this).anInt9273 ^ 0xffffffff)) ? i : (((Node_Sub14_Sub12) this).anInt9273 * i / Class250.anInt2819)) * ((Node_Sub14_Sub12) this).anInt9269);
            if (Class185.anInt2164 != ((Node_Sub14_Sub12) this).anInt9269) {
                for (int i_4_ = 0; i_4_ < Class185.anInt2164; i_4_++) {
                    int i_5_ = (i_4_ * ((Node_Sub14_Sub12) this).anInt9269 / Class185.anInt2164);
                    int i_6_ = (((Node_Sub14_Sub12) this).anIntArray9270[i_5_ + i_3_]);
                    is_2_[i_4_] = Class112.method794(i_6_, 255) << 1508868964;
                    is_1_[i_4_] = Class112.method794(i_6_ >> 1591760996, 4080);
                    is_0_[i_4_] = Class112.method794(16711680, i_6_) >> 1373899372;
                }
            } else {
                for (int i_7_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
                    int i_8_ = ((Node_Sub14_Sub12) this).anIntArray9270[i_3_++];
                    is_2_[i_7_] = Class112.method794(i_8_ << 26419780, 4080);
                    is_1_[i_7_] = Class112.method794(65280, i_8_) >> -671052508;
                    is_0_[i_7_] = Class112.method794(i_8_ >> 698397836, 4080);
                }
            }
        }
        return is;
    }

    final int method2274(int i) {
        anInt9272++;
        if (i != -1)
            method2305((byte) -9);
        return anInt9271;
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_9_) {
        if (i_9_ == 0)
            anInt9271 = class248_sub9.readShort(-1);
        if (i == -61)
            anInt9277++;
    }

    public Node_Sub14_Sub12() {
        super(0, false);
    }

    static final void method2307(Node_Sub8 class248_sub8, byte i, Node_Sub8 class248_sub8_10_) {
        anInt9275++;
        if (((Node_Sub8) class248_sub8_10_).aClass248_Sub8_6867 != null)
            class248_sub8_10_.method2021((byte) -26);
        ((Node_Sub8) class248_sub8_10_).aClass248_Sub8_6867 = ((Node_Sub8) class248_sub8).aClass248_Sub8_6867;
        int i_11_ = -21 % ((66 - i) / 60);
        ((Node_Sub8) class248_sub8_10_).aClass248_Sub8_6871 = class248_sub8;
        ((Node_Sub8) (((Node_Sub8) class248_sub8_10_).aClass248_Sub8_6867)).aClass248_Sub8_6871 = class248_sub8_10_;
        ((Node_Sub8) (((Node_Sub8) class248_sub8_10_).aClass248_Sub8_6871)).aClass248_Sub8_6867 = class248_sub8_10_;
    }

    final void method2273(boolean bool) {
        super.method2273(bool);
        anInt9266++;
        ((Node_Sub14_Sub12) this).anIntArray9270 = null;
    }

    static {
        aLongArrayArray9267 = new long[8][256];
        aLongArray9276 = new long[11];
        for (int i = 0; i < 256; i++) {
            int i_12_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
            long l = (long) ((0x1 & i) != 0 ? 0xff & i_12_ : i_12_ >>> 1009151304);
            long l_13_ = l << 699966273;
            if (l_13_ >= 256L)
                l_13_ ^= 0x11dL;
            long l_14_ = l_13_ << -992858047;
            if (l_14_ >= 256L)
                l_14_ ^= 0x11dL;
            long l_15_ = l_14_ ^ l;
            long l_16_ = l_14_ << -61376895;
            if (l_16_ >= 256L)
                l_16_ ^= 0x11dL;
            long l_17_ = l ^ l_16_;
            aLongArrayArray9267[0][i] = (Class136_Sub1.method1251(l_17_, (Class136_Sub1.method1251(l_13_ << 419204168, (Class136_Sub1.method1251((Class136_Sub1.method1251((Class136_Sub1.method1251(l << 2131756384, (Class136_Sub1.method1251(l_14_ << 2086203432, Class136_Sub1.method1251(l << 463337712, l << -1216420680))))), l_16_ << 270547288)), l_15_ << -124947056))))));
            for (int i_18_ = 1; (i_18_ ^ 0xffffffff) > -9; i_18_++)
                aLongArrayArray9267[i_18_][i] = Class136_Sub1.method1251((aLongArrayArray9267[-1 + i_18_][i]) >>> 573648328, (aLongArrayArray9267[-1 + i_18_][i]) << -229395400);
        }
        aLongArray9276[0] = 0L;
        for (int i = 1; i <= 10; i++) {
            int i_19_ = i * 8 + -8;
            aLongArray9276[i] = (Class84_Sub1.method604((Class84_Sub1.method604((Class84_Sub1.method604((Class84_Sub1.method604(Class310.method3236(4278190080L, (aLongArrayArray9267[4][4 + i_19_])), (Class84_Sub1.method604((Class84_Sub1.method604((Class84_Sub1.method604(Class310.method3236((aLongArrayArray9267[0][i_19_]), -72057594037927936L), Class310.method3236(71776119061217280L, (aLongArrayArray9267[1][i_19_ + 1])))), Class310.method3236((aLongArrayArray9267[2][2 + i_19_]), 280375465082880L))), Class310.method3236(1095216660480L, (aLongArrayArray9267[3][3 + i_19_])))))), Class310.method3236(16711680L, (aLongArrayArray9267[5][5 + i_19_])))), Class310.method3236(aLongArrayArray9267[6][6 + i_19_], 65280L))), Class310.method3236(aLongArrayArray9267[7][7 + i_19_], 255L)));
        }
        anIntArray9279 = new int[8];
        anInt9278 = -1;
    }
}
