/* Class248_Sub14_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub14_Sub26 extends Node_Sub14 {
    static int anInt9429 = 0;
    static int anInt9430;
    static int anInt9431;
    static Class258 aClass258_9432;
    static int[] anIntArray9433;
    private int[][] anIntArrayArray9434;
    private int[] anIntArray9435 = new int[257];
    static int anInt9436;
    static int anInt9437;
    static int anInt9438;
    static int anInt9439;

    public Node_Sub14_Sub26() {
        super(1, false);
    }

    final int[][] method2271(int i, boolean bool) {
        anInt9431++;
        if (bool != true)
            method2269(null, (byte) -40, 48);
        int[][] is = ((Node_Sub14) this).aClass367_6981.method3835(1, i);
        if (((Class367) ((Node_Sub14) this).aClass367_6981).aBoolean4512) {
            int[] is_0_ = this.method2265((byte) 64, i, 0);
            int[] is_1_ = is[0];
            int[] is_2_ = is[1];
            int[] is_3_ = is[2];
            for (int i_4_ = 0; (Class185.anInt2164 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                int i_5_ = is_0_[i_4_] >> -704485212;
                if ((i_5_ ^ 0xffffffff) > -1)
                    i_5_ = 0;
                if ((i_5_ ^ 0xffffffff) < -257)
                    i_5_ = 256;
                i_5_ = anIntArray9435[i_5_];
                is_1_[i_4_] = Class112.method794(16711680, i_5_) >> 344765420;
                is_2_[i_4_] = Class112.method794(4080, i_5_ >> -59741852);
                is_3_[i_4_] = Class112.method794(255, i_5_) << -41798108;
            }
        }
        return is;
    }

    public static void method2350(int i) {
        if (i >= 95) {
            anIntArray9433 = null;
            aClass258_9432 = null;
        }
    }

    final void method2263(int i) {
        if (anIntArrayArray9434 == null)
            method2351((byte) -119, 1);
        anInt9439++;
        if (i != 8351)
            aClass258_9432 = null;
        method2352((byte) -120);
    }

    private final void method2351(byte i, int i_6_) {
        anInt9438++;
        int i_7_ = 48 / ((-83 - i) / 34);
        if ((i_6_ ^ 0xffffffff) != -1) {
            int i_8_ = i_6_;
            while_184_:
            do {
                while_183_:
                do {
                    while_182_:
                    do {
                        while_181_:
                        do {
                            do {
                                if ((i_8_ ^ 0xffffffff) != -2) {
                                    if (i_8_ != 2) {
                                        if (i_8_ != 3) {
                                            if (i_8_ != 4) {
                                                if ((i_8_ ^ 0xffffffff) != -6) {
                                                    if ((i_8_ ^ 0xffffffff) != -7)
                                                        break while_184_;
                                                } else
                                                    break while_182_;
                                                break while_183_;
                                            }
                                        } else
                                            break;
                                        break while_181_;
                                    }
                                } else {
                                    anIntArrayArray9434 = new int[2][4];
                                    anIntArrayArray9434[0][3] = 0;
                                    anIntArrayArray9434[0][0] = 0;
                                    anIntArrayArray9434[0][1] = 0;
                                    anIntArrayArray9434[0][2] = 0;
                                    anIntArrayArray9434[1][3] = 4096;
                                    anIntArrayArray9434[1][2] = 4096;
                                    anIntArrayArray9434[1][0] = 4096;
                                    anIntArrayArray9434[1][1] = 4096;
                                    return;
                                }
                                anIntArrayArray9434 = new int[8][4];
                                anIntArrayArray9434[0][1] = 2650;
                                anIntArrayArray9434[0][0] = 0;
                                anIntArrayArray9434[0][2] = 2602;
                                anIntArrayArray9434[0][3] = 2361;
                                anIntArrayArray9434[1][2] = 1799;
                                anIntArrayArray9434[1][3] = 1558;
                                anIntArrayArray9434[1][0] = 2867;
                                anIntArrayArray9434[1][1] = 2313;
                                anIntArrayArray9434[2][3] = 1413;
                                anIntArrayArray9434[2][0] = 3072;
                                anIntArrayArray9434[2][1] = 2618;
                                anIntArrayArray9434[2][2] = 1734;
                                anIntArrayArray9434[3][0] = 3276;
                                anIntArrayArray9434[3][1] = 2296;
                                anIntArrayArray9434[3][3] = 947;
                                anIntArrayArray9434[3][2] = 1220;
                                anIntArrayArray9434[4][2] = 963;
                                anIntArrayArray9434[4][3] = 722;
                                anIntArrayArray9434[4][1] = 2072;
                                anIntArrayArray9434[4][0] = 3481;
                                anIntArrayArray9434[5][2] = 2152;
                                anIntArrayArray9434[5][0] = 3686;
                                anIntArrayArray9434[5][3] = 1766;
                                anIntArrayArray9434[5][1] = 2730;
                                anIntArrayArray9434[6][1] = 2232;
                                anIntArrayArray9434[6][2] = 1060;
                                anIntArrayArray9434[6][3] = 915;
                                anIntArrayArray9434[6][0] = 3891;
                                anIntArrayArray9434[7][3] = 1140;
                                anIntArrayArray9434[7][2] = 1413;
                                anIntArrayArray9434[7][0] = 4096;
                                anIntArrayArray9434[7][1] = 1686;
                                return;
                            } while (false);
                            anIntArrayArray9434 = new int[7][4];
                            anIntArrayArray9434[0][2] = 0;
                            anIntArrayArray9434[0][0] = 0;
                            anIntArrayArray9434[0][3] = 4096;
                            anIntArrayArray9434[0][1] = 0;
                            anIntArrayArray9434[1][0] = 663;
                            anIntArrayArray9434[1][1] = 0;
                            anIntArrayArray9434[1][2] = 4096;
                            anIntArrayArray9434[1][3] = 4096;
                            anIntArrayArray9434[2][0] = 1363;
                            anIntArrayArray9434[2][3] = 0;
                            anIntArrayArray9434[2][2] = 4096;
                            anIntArrayArray9434[2][1] = 0;
                            anIntArrayArray9434[3][0] = 2048;
                            anIntArrayArray9434[3][3] = 0;
                            anIntArrayArray9434[3][1] = 4096;
                            anIntArrayArray9434[3][2] = 4096;
                            anIntArrayArray9434[4][2] = 0;
                            anIntArrayArray9434[4][1] = 4096;
                            anIntArrayArray9434[4][3] = 0;
                            anIntArrayArray9434[4][0] = 2727;
                            anIntArrayArray9434[5][3] = 4096;
                            anIntArrayArray9434[5][0] = 3411;
                            anIntArrayArray9434[5][2] = 0;
                            anIntArrayArray9434[5][1] = 4096;
                            anIntArrayArray9434[6][0] = 4096;
                            anIntArrayArray9434[6][1] = 0;
                            anIntArrayArray9434[6][2] = 0;
                            anIntArrayArray9434[6][3] = 4096;
                            return;
                        } while (false);
                        anIntArrayArray9434 = new int[6][4];
                        anIntArrayArray9434[0][3] = 0;
                        anIntArrayArray9434[0][2] = 0;
                        anIntArrayArray9434[0][1] = 0;
                        anIntArrayArray9434[0][0] = 0;
                        anIntArrayArray9434[1][2] = 0;
                        anIntArrayArray9434[1][1] = 0;
                        anIntArrayArray9434[1][3] = 1493;
                        anIntArrayArray9434[1][0] = 1843;
                        anIntArrayArray9434[2][2] = 0;
                        anIntArrayArray9434[2][0] = 2457;
                        anIntArrayArray9434[2][3] = 2939;
                        anIntArrayArray9434[2][1] = 0;
                        anIntArrayArray9434[3][3] = 3565;
                        anIntArrayArray9434[3][0] = 2781;
                        anIntArrayArray9434[3][1] = 0;
                        anIntArrayArray9434[3][2] = 1124;
                        anIntArrayArray9434[4][3] = 4031;
                        anIntArrayArray9434[4][1] = 546;
                        anIntArrayArray9434[4][0] = 3481;
                        anIntArrayArray9434[4][2] = 3084;
                        anIntArrayArray9434[5][3] = 4096;
                        anIntArrayArray9434[5][1] = 4096;
                        anIntArrayArray9434[5][2] = 4096;
                        anIntArrayArray9434[5][0] = 4096;
                        return;
                    } while (false);
                    anIntArrayArray9434 = new int[16][4];
                    anIntArrayArray9434[0][2] = 192;
                    anIntArrayArray9434[0][3] = 321;
                    anIntArrayArray9434[0][0] = 0;
                    anIntArrayArray9434[0][1] = 80;
                    anIntArrayArray9434[1][3] = 562;
                    anIntArrayArray9434[1][1] = 321;
                    anIntArrayArray9434[1][2] = 449;
                    anIntArrayArray9434[1][0] = 155;
                    anIntArrayArray9434[2][1] = 578;
                    anIntArrayArray9434[2][3] = 803;
                    anIntArrayArray9434[2][2] = 690;
                    anIntArrayArray9434[2][0] = 389;
                    anIntArrayArray9434[3][2] = 995;
                    anIntArrayArray9434[3][3] = 1140;
                    anIntArrayArray9434[3][1] = 947;
                    anIntArrayArray9434[3][0] = 671;
                    anIntArrayArray9434[4][3] = 1509;
                    anIntArrayArray9434[4][0] = 897;
                    anIntArrayArray9434[4][2] = 1397;
                    anIntArrayArray9434[4][1] = 1285;
                    anIntArrayArray9434[5][2] = 1429;
                    anIntArrayArray9434[5][1] = 1525;
                    anIntArrayArray9434[5][3] = 1413;
                    anIntArrayArray9434[5][0] = 1175;
                    anIntArrayArray9434[6][3] = 1333;
                    anIntArrayArray9434[6][1] = 1734;
                    anIntArrayArray9434[6][2] = 1461;
                    anIntArrayArray9434[6][0] = 1368;
                    anIntArrayArray9434[7][2] = 1525;
                    anIntArrayArray9434[7][0] = 1507;
                    anIntArrayArray9434[7][1] = 1413;
                    anIntArrayArray9434[7][3] = 1702;
                    anIntArrayArray9434[8][2] = 1590;
                    anIntArrayArray9434[8][3] = 2056;
                    anIntArrayArray9434[8][0] = 1736;
                    anIntArrayArray9434[8][1] = 1108;
                    anIntArrayArray9434[9][3] = 2666;
                    anIntArrayArray9434[9][2] = 2056;
                    anIntArrayArray9434[9][1] = 1766;
                    anIntArrayArray9434[9][0] = 2088;
                    anIntArrayArray9434[10][1] = 2409;
                    anIntArrayArray9434[10][3] = 3276;
                    anIntArrayArray9434[10][2] = 2586;
                    anIntArrayArray9434[10][0] = 2355;
                    anIntArrayArray9434[11][3] = 3228;
                    anIntArrayArray9434[11][0] = 2691;
                    anIntArrayArray9434[11][1] = 3116;
                    anIntArrayArray9434[11][2] = 3148;
                    anIntArrayArray9434[12][3] = 3196;
                    anIntArrayArray9434[12][0] = 3031;
                    anIntArrayArray9434[12][2] = 3710;
                    anIntArrayArray9434[12][1] = 3806;
                    anIntArrayArray9434[13][1] = 3437;
                    anIntArrayArray9434[13][0] = 3522;
                    anIntArrayArray9434[13][3] = 3019;
                    anIntArrayArray9434[13][2] = 3421;
                    anIntArrayArray9434[14][0] = 3727;
                    anIntArrayArray9434[14][2] = 3148;
                    anIntArrayArray9434[14][3] = 3228;
                    anIntArrayArray9434[14][1] = 3116;
                    anIntArrayArray9434[15][2] = 2505;
                    anIntArrayArray9434[15][3] = 2746;
                    anIntArrayArray9434[15][1] = 2377;
                    anIntArrayArray9434[15][0] = 4096;
                    return;
                } while (false);
                anIntArrayArray9434 = new int[4][4];
                anIntArrayArray9434[0][1] = 0;
                anIntArrayArray9434[0][0] = 2048;
                anIntArrayArray9434[0][3] = 0;
                anIntArrayArray9434[0][2] = 4096;
                anIntArrayArray9434[1][1] = 4096;
                anIntArrayArray9434[1][3] = 0;
                anIntArrayArray9434[1][0] = 2867;
                anIntArrayArray9434[1][2] = 4096;
                anIntArrayArray9434[2][1] = 4096;
                anIntArrayArray9434[2][0] = 3276;
                anIntArrayArray9434[2][2] = 4096;
                anIntArrayArray9434[2][3] = 0;
                anIntArrayArray9434[3][1] = 4096;
                anIntArrayArray9434[3][3] = 0;
                anIntArrayArray9434[3][2] = 0;
                anIntArrayArray9434[3][0] = 4096;
                return;
            } while (false);
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    private final void method2352(byte i) {
        int i_9_ = -4 / ((i - -80) / 37);
        anInt9437++;
        int i_10_ = anIntArrayArray9434.length;
        if ((i_10_ ^ 0xffffffff) < -1) {
            for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -258; i_11_++) {
                int i_12_ = 0;
                int i_13_ = i_11_ << 1124188708;
                for (int i_14_ = 0; (i_10_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
                    if (anIntArrayArray9434[i_14_][0] > i_13_)
                        break;
                    i_12_++;
                }
                int i_15_;
                int i_16_;
                int i_17_;
                if (i_12_ < i_10_) {
                    int[] is = anIntArrayArray9434[i_12_];
                    if (i_12_ <= 0) {
                        i_17_ = is[3];
                        i_15_ = is[2];
                        i_16_ = is[1];
                    } else {
                        int[] is_18_ = anIntArrayArray9434[-1 + i_12_];
                        int i_19_ = ((-is_18_[0] + i_13_ << 1139498828) / (-is_18_[0] + is[0]));
                        int i_20_ = -i_19_ + 4096;
                        i_16_ = is[1] * i_19_ + is_18_[1] * i_20_ >> -1635431412;
                        i_17_ = (i_19_ * is[3] - -(i_20_ * is_18_[3]) >> -265086036);
                        i_15_ = is_18_[2] * i_20_ + is[2] * i_19_ >> 899969964;
                    }
                } else {
                    int[] is = anIntArrayArray9434[i_10_ - 1];
                    i_15_ = is[2];
                    i_16_ = is[1];
                    i_17_ = is[3];
                }
                i_17_ >>= 4;
                i_15_ >>= 4;
                i_16_ >>= 4;
                if (i_17_ < 0)
                    i_17_ = 0;
                else if (i_17_ > 255)
                    i_17_ = 255;
                if ((i_15_ ^ 0xffffffff) <= -1) {
                    if ((i_15_ ^ 0xffffffff) < -256)
                        i_15_ = 255;
                } else
                    i_15_ = 0;
                if ((i_16_ ^ 0xffffffff) <= -1) {
                    if ((i_16_ ^ 0xffffffff) < -256)
                        i_16_ = 255;
                } else
                    i_16_ = 0;
                anIntArray9435[i_11_] = (Class358.retrieveLooksSettings(i_17_, Class358.retrieveLooksSettings(i_16_ << -1877777008, i_15_ << 1999749256)));
            }
        }
    }

    final void method2269(ByteStream class248_sub9, byte i, int i_21_) {
        if (i != -61)
            method2271(-34, true);
        if (i_21_ == 0) {
            int i_22_ = class248_sub9.readUnsignedByte((byte) 109);
            if ((i_22_ ^ 0xffffffff) != -1)
                method2351((byte) -128, i_22_);
            else {
                anIntArrayArray9434 = new int[class248_sub9.readUnsignedByte((byte) 121)][4];
                for (int i_23_ = 0; ((anIntArrayArray9434.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff)); i_23_++) {
                    anIntArrayArray9434[i_23_][0] = class248_sub9.readShort(-1);
                    anIntArrayArray9434[i_23_][1] = class248_sub9.readUnsignedByte((byte) 90) << -709353052;
                    anIntArrayArray9434[i_23_][2] = class248_sub9.readUnsignedByte((byte) 109) << 900648900;
                    anIntArrayArray9434[i_23_][3] = class248_sub9.readUnsignedByte((byte) 92) << -2075950428;
                }
            }
        }
        anInt9436++;
    }
}
