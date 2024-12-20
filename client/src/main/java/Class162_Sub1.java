/* Class162_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class162_Sub1 extends Class162 {
    private int anInt6307;
    private int anInt6308 = 0;
    private int anInt6309;
    static int anInt6310;
    static int anInt6311;
    static int anInt6312;
    private int[] anIntArray6313;
    private int[] anIntArray6314;
    static int anInt6315;
    static int anInt6316;
    private boolean aBoolean6317;
    private int[] anIntArray6318;
    static int anInt6319;
    private int[] anIntArray6320;
    private int[] anIntArray6321;
    static int anInt6322;
    static int anInt6323;
    private int anInt6324;
    private short[] aShortArray6325;
    static int anInt6326;
    static int anInt6327;
    private short aShort6328;
    static int anInt6329;
    private Class132[] aClass132Array6330;
    private int anInt6331;
    static int anInt6332;
    static int anInt6333;
    static int anInt6334;
    static int anInt6335;
    private int anInt6336;
    static int anInt6337;
    private int anInt6338;
    static int anInt6339;
    private short[] aShortArray6340;
    private byte[] aByteArray6341;
    private short[] aShortArray6342;
    static int anInt6343;
    private Class337 aClass337_6344;
    static int anInt6345;
    static int anInt6346;
    private Class120 aClass120_6347;
    static int anInt6348;
    static int anInt6349;
    static int anInt6350;
    static int anInt6351;
    private int anInt6352;
    static int anInt6353;
    private short[] aShortArray6354;
    static int anInt6355;
    static byte[] aByteArray6356 = new byte[520];
    static int anInt6357;
    static int anInt6358;
    static int anInt6359;
    static int anInt6360;
    private Class284[] aClass284Array6361;
    static int anInt6362;
    static int anInt6363;
    static int anInt6364;
    static int anInt6365;
    private int anInt6366;
    static int anInt6367;
    static int anInt6368;
    private short[] aShortArray6369;
    static int anInt6370;
    static int anInt6371;
    private Class40[] aClass40Array6372;
    private Class337 aClass337_6373;
    static int anInt6374;
    private Class95 aClass95_6375;
    static int anInt6376;
    static int anInt6377;
    private int anInt6378;
    private boolean aBoolean6379 = false;
    private ha_Sub3 aHa_Sub3_6380;
    static int anInt6381;
    static int anInt6382;
    private int[] anIntArray6383;
    private byte[] aByteArray6384;
    private Class124[] aClass124Array6385;
    private short[] aShortArray6386;
    private short[] aShortArray6387;
    static int anInt6388;
    static int anInt6389;
    static int anInt6390;
    static int anInt6391;
    private Class337 aClass337_6392;
    static int anInt6393;
    static int anInt6394;
    private short[] aShortArray6395;
    static int anInt6396;
    private int anInt6397;
    static byte[] aByteArray6398;
    static int anInt6399;
    private short[] aShortArray6400;
    private short[] aShortArray6401;
    private int anInt6402;
    private int anInt6403;
    private int[][] anIntArrayArray6404;
    private boolean aBoolean6405;
    static int anInt6406;
    private int anInt6407;
    private boolean aBoolean6408;
    private int[][] anIntArrayArray6409;
    static int anInt6410;
    static int anInt6411;
    private int[][] anIntArrayArray6412;
    static int anInt6413;
    static int anInt6414;
    private float[] aFloatArray6415;
    private short[] aShortArray6416;
    private short[] aShortArray6417;
    static int anInt6418;
    static int anInt6419;
    private float[] aFloatArray6420;
    private int anInt6421;
    static int anInt6422;
    static int anInt6423;
    static int anInt6424;
    static int anInt6425;
    private int[] anIntArray6426;
    private Class337 aClass337_6427;
    private int anInt6428;
    static int anInt6429;
    static int anInt6430;
    static int anInt6431;
    static int anInt6432;
    private boolean aBoolean6433;
    private short[] aShortArray6434;
    static int anInt6435;
    private short aShort6436;

    private final void method1446(int i) {
        anInt6382++;
        if (i >= 76 && anInt6378 != 0) {
            if (method1451(108) && method1466(8)) {
                aHa_Sub3_6380.method931(0, 8, (((Class337) aClass337_6427).anInterface18_Impl1_3935));
                aHa_Sub3_6380.method931(1, 8, (((Class337) aClass337_6373).anInterface18_Impl1_3935));
                aHa_Sub3_6380.method931(2, 8, (((Class337) aClass337_6392).anInterface18_Impl1_3935));
                boolean bool;
                if ((anInt6397 & 0x37) == 0) {
                    aHa_Sub3_6380.method923(false, -8043);
                    bool = false;
                    aHa_Sub3_6380.method1004((((ha_Sub3) aHa_Sub3_6380).aClass185_6267), (byte) -15);
                } else {
                    aHa_Sub3_6380.method923(true, -8043);
                    bool = true;
                    aHa_Sub3_6380.method931(3, 8, (((Class337) aClass337_6344).anInterface18_Impl1_3935));
                    aHa_Sub3_6380.method1004((((ha_Sub3) aHa_Sub3_6380).aClass185_6265), (byte) -15);
                }
                for (int i_0_ = 0; ((anIntArray6383.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
                    int i_1_ = anIntArray6318[i_0_];
                    int i_2_ = anIntArray6318[1 + i_0_];
                    int i_3_ = 0xffff & aShortArray6416[i_1_];
                    if ((i_3_ ^ 0xffffffff) == -65536)
                        i_3_ = -1;
                    aHa_Sub3_6380.method962(i_3_, 66, true, bool);
                    aHa_Sub3_6380.method1006((((Class95) aClass95_6375).anInterface18_Impl2_1232), OutputStream_Sub1.aClass14_86, -i_1_ + i_2_, i_1_ * 3, anIntArray6426[i_0_], anIntArray6383[i_0_], -229);
                }
            }
            method1465((byte) 1);
        }
    }

    final Class162 method1436(byte i, int i_4_, boolean bool) {
        anInt6339++;
        Class162_Sub1 class162_sub1_5_;
        Class162_Sub1 class162_sub1_6_;
        if ((i ^ 0xffffffff) != -2) {
            if (i != 2) {
                if (i == 3) {
                    class162_sub1_5_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6274;
                    class162_sub1_6_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6255;
                } else if (i == 4) {
                    class162_sub1_5_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6261;
                    class162_sub1_6_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6254;
                } else if ((i ^ 0xffffffff) == -6) {
                    class162_sub1_5_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6257;
                    class162_sub1_6_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6273;
                } else
                    class162_sub1_5_ = class162_sub1_6_ = new Class162_Sub1(aHa_Sub3_6380, 0, 0, true, false);
            } else {
                class162_sub1_6_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6264;
                class162_sub1_5_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6258;
            }
        } else {
            class162_sub1_5_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6260;
            class162_sub1_6_ = ((ha_Sub3) aHa_Sub3_6380).aClass162_Sub1_6266;
        }
        return method1450(class162_sub1_6_, bool, i_4_, (byte) 60, i != 0, class162_sub1_5_);
    }

    final boolean F() {
        anInt6399++;
        return aBoolean6405;
    }

    Class162_Sub1(ha_Sub3 var_ha_Sub3, Class343 class343, int i, int i_7_, int i_8_, int i_9_) {
        this(var_ha_Sub3, i, i_9_, true, false);
        d var_d = ((ha) var_ha_Sub3).aD1414;
        anIntArray6313 = new int[((Class343) class343).anInt4075 + 1];
        int[] is = new int[((Class343) class343).anInt4028];
        for (int i_10_ = 0; ((((Class343) class343).anInt4028 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
            if (((Class343) class343).aByteArray4076 == null || ((Class343) class343).aByteArray4076[i_10_] != 2) {
                if (((Class343) class343).aShortArray4056 != null && ((Class343) class343).aShortArray4056[i_10_] != -1) {
                    Class312 class312 = var_d.method25((((Class343) class343).aShortArray4056[i_10_]) & 0xffff, (byte) 125);
                    if (((anInt6397 & 0x40) == 0 || !((Class312) class312).aBoolean3622) && ((Class312) class312).aBoolean3631)
                        continue;
                }
                is[anInt6338++] = i_10_;
                anIntArray6313[((Class343) class343).aShortArray4046[i_10_]]++;
                anIntArray6313[((Class343) class343).aShortArray4024[i_10_]]++;
                anIntArray6313[((Class343) class343).aShortArray4073[i_10_]]++;
            }
        }
        anInt6378 = anInt6338;
        long[] ls = new long[anInt6338];
        boolean bool = (anInt6324 & 0x100 ^ 0xffffffff) != -1;
        for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (anInt6338 ^ 0xffffffff); i_11_++) {
            int i_12_ = is[i_11_];
            Class312 class312 = null;
            int i_13_ = 0;
            int i_14_ = 0;
            int i_15_ = 0;
            int i_16_ = 0;
            if (((Class343) class343).aClass178Array4048 != null) {
                boolean bool_17_ = false;
                for (int i_18_ = 0; i_18_ < ((Class343) class343).aClass178Array4048.length; i_18_++) {
                    Class178 class178 = ((Class343) class343).aClass178Array4048[i_18_];
                    if ((((Class178) class178).anInt2075 ^ 0xffffffff) == (i_12_ ^ 0xffffffff)) {
                        Class236 class236 = Node_Sub42_Sub3.method2637(0, (((Class178) class178).anInt2078));
                        if (((Class236) class236).aBoolean2631)
                            bool_17_ = true;
                        if (((Class236) class236).anInt2623 != -1) {
                            Class312 class312_19_ = var_d.method25((((Class236) class236).anInt2623), (byte) 127);
                            if ((((Class312) class312_19_).anInt3629 ^ 0xffffffff) == -3)
                                aBoolean6405 = true;
                        }
                    }
                }
                if (bool_17_) {
                    ls[i_11_] = 9223372036854775807L;
                    anInt6378--;
                    continue;
                }
            }
            int i_20_ = -1;
            if (((Class343) class343).aShortArray4056 != null) {
                i_20_ = ((Class343) class343).aShortArray4056[i_12_];
                if (i_20_ != -1) {
                    class312 = var_d.method25(i_20_ & 0xffff, (byte) 126);
                    if ((anInt6397 & 0x40) == 0 || !((Class312) class312).aBoolean3622) {
                        i_16_ = ((Class312) class312).aByte3646;
                        i_15_ = ((Class312) class312).aByte3624;
                    } else {
                        i_20_ = -1;
                        class312 = null;
                    }
                }
            }
            boolean bool_21_ = ((((Class343) class343).aByteArray4061 != null && (((Class343) class343).aByteArray4061[i_12_] ^ 0xffffffff) != -1) || (class312 != null && ((Class312) class312).anInt3629 != 0));
            if ((bool || bool_21_) && ((Class343) class343).aByteArray4072 != null)
                i_13_ += (((Class343) class343).aByteArray4072[i_12_] << -1367973647);
            if (bool_21_)
                i_13_ += 65536;
            i_13_ += 0xff00 & i_15_ << -1832620440;
            i_13_ += 0xff & i_16_;
            i_14_ += (i_20_ & 0xffff) << -639957776;
            i_14_ += i_11_ & 0xffff;
            ls[i_11_] = (long) i_14_ + ((long) i_13_ << -24705632);
            aBoolean6405 |= bool_21_;
            Class162_Sub1 class162_sub1_22_ = this;
            class162_sub1_22_.aBoolean6379 = (class162_sub1_22_.aBoolean6379 | (class312 != null && (((Class312) class312).aByte3643 != 0 || (((Class312) class312).aByte3642 ^ 0xffffffff) != -1)));
        }
        Class346_Sub7_Sub2_Sub2.method3613(ls, is, (byte) -123);
        anIntArray6321 = ((Class343) class343).anIntArray4069;
        aShortArray6417 = ((Class343) class343).aShortArray4038;
        anInt6308 = ((Class343) class343).anInt4063;
        anIntArray6314 = ((Class343) class343).anIntArray4027;
        anIntArray6320 = ((Class343) class343).anIntArray4040;
        anInt6366 = ((Class343) class343).anInt4075;
        Class8[] class8s = new Class8[anInt6366];
        aClass124Array6385 = ((Class343) class343).aClass124Array4060;
        aClass40Array6372 = ((Class343) class343).aClass40Array4045;
        if (((Class343) class343).aClass178Array4048 != null) {
            anInt6403 = ((Class343) class343).aClass178Array4048.length;
            aClass132Array6330 = new Class132[anInt6403];
            aClass284Array6361 = new Class284[anInt6403];
            for (int i_23_ = 0; (anInt6403 ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
                Class178 class178 = ((Class343) class343).aClass178Array4048[i_23_];
                Class236 class236 = Node_Sub42_Sub3.method2637(0, ((Class178) class178).anInt2078);
                int i_24_ = -1;
                for (int i_25_ = 0; i_25_ < anInt6338; i_25_++) {
                    if ((((Class178) class178).anInt2075 ^ 0xffffffff) == (is[i_25_] ^ 0xffffffff)) {
                        i_24_ = i_25_;
                        break;
                    }
                }
                if ((i_24_ ^ 0xffffffff) == 0)
                    throw new RuntimeException();
                int i_26_ = ((Node_Sub14_Sub39.anIntArray9600[0xffff & (((Class343) class343).aShortArray4054[((Class178) class178).anInt2075])]) & 0xffffff);
                i_26_ = (i_26_ | (255 - (((Class343) class343).aByteArray4061 == null ? (int) 0 : (((Class343) class343).aByteArray4061[((Class178) class178).anInt2075])) << 893521336));
                aClass132Array6330[i_23_] = new Class132(i_24_, (((Class343) class343).aShortArray4046[((Class178) class178).anInt2075]), (((Class343) class343).aShortArray4024[((Class178) class178).anInt2075]), (((Class343) class343).aShortArray4073[((Class178) class178).anInt2075]), ((Class236) class236).anInt2627, ((Class236) class236).anInt2626, ((Class236) class236).anInt2623, ((Class236) class236).anInt2628, ((Class236) class236).anInt2622, ((Class236) class236).aBoolean2631, ((Class236) class236).aBoolean2624, ((Class178) class178).anInt2077);
                aClass284Array6361[i_23_] = new Class284(i_26_);
            }
        }
        int i_27_ = anInt6338 * 3;
        aShortArray6387 = new short[i_27_];
        aShortArray6401 = new short[i_27_];
        aShort6328 = (short) i_8_;
        aFloatArray6415 = new float[i_27_];
        aShort6436 = (short) i_7_;
        aShortArray6386 = new short[anInt6338];
        aShortArray6340 = new short[i_27_];
        aShortArray6416 = new short[anInt6338];
        if (((Class343) class343).aShortArray4064 != null)
            aShortArray6354 = new short[anInt6338];
        aShortArray6369 = new short[i_27_];
        aShortArray6434 = new short[i_27_];
        aShortArray6342 = new short[i_27_];
        aShortArray6325 = new short[anInt6338];
        aShortArray6395 = new short[anInt6338];
        aFloatArray6420 = new float[i_27_];
        aByteArray6384 = new byte[anInt6338];
        aByteArray6341 = new byte[i_27_];
        Class312.aLongArray3641 = new long[i_27_];
        aShortArray6400 = new short[anInt6338];
        int i_28_ = 0;
        for (int i_29_ = 0; ((i_29_ ^ 0xffffffff) > (((Class343) class343).anInt4075 ^ 0xffffffff)); i_29_++) {
            int i_30_ = anIntArray6313[i_29_];
            anIntArray6313[i_29_] = i_28_;
            i_28_ += i_30_;
            class8s[i_29_] = new Class8();
        }
        anIntArray6313[((Class343) class343).anInt4075] = i_28_;
        Class75 class75 = Class316_Sub2.method3301(anInt6338, class343, 0, is);
        Class366[] class366s = new Class366[((Class343) class343).anInt4028];
        for (int i_31_ = 0; i_31_ < ((Class343) class343).anInt4028; i_31_++) {
            short i_32_ = ((Class343) class343).aShortArray4046[i_31_];
            short i_33_ = ((Class343) class343).aShortArray4024[i_31_];
            short i_34_ = ((Class343) class343).aShortArray4073[i_31_];
            int i_35_ = anIntArray6314[i_33_] + -anIntArray6314[i_32_];
            int i_36_ = anIntArray6321[i_33_] + -anIntArray6321[i_32_];
            int i_37_ = anIntArray6320[i_33_] + -anIntArray6320[i_32_];
            int i_38_ = -anIntArray6314[i_32_] + anIntArray6314[i_34_];
            int i_39_ = anIntArray6321[i_34_] - anIntArray6321[i_32_];
            int i_40_ = anIntArray6320[i_34_] - anIntArray6320[i_32_];
            int i_41_ = i_40_ * i_36_ + -(i_39_ * i_37_);
            int i_42_ = -(i_40_ * i_35_) + i_38_ * i_37_;
            int i_43_;
            for (i_43_ = i_39_ * i_35_ - i_36_ * i_38_; ((i_41_ ^ 0xffffffff) < -8193 || i_42_ > 8192 || i_43_ > 8192 || i_41_ < -8192 || i_42_ < -8192 || i_43_ < -8192); i_42_ >>= 1) {
                i_41_ >>= 1;
                i_43_ >>= 1;
            }
            int i_44_ = (int) Math.sqrt((double) (i_43_ * i_43_ + (i_42_ * i_42_ + i_41_ * i_41_)));
            if (i_44_ <= 0)
                i_44_ = 1;
            i_42_ = i_42_ * 256 / i_44_;
            i_43_ = i_43_ * 256 / i_44_;
            i_41_ = i_41_ * 256 / i_44_;
            byte i_45_ = (((Class343) class343).aByteArray4076 != null ? ((Class343) class343).aByteArray4076[i_31_] : (byte) 0);
            if ((i_45_ ^ 0xffffffff) != -1) {
                if (i_45_ == 1) {
                    Class366 class366 = class366s[i_31_] = new Class366();
                    ((Class366) class366).anInt4490 = i_41_;
                    ((Class366) class366).anInt4493 = i_42_;
                    ((Class366) class366).anInt4492 = i_43_;
                }
            } else {
                Class8 class8 = class8s[i_32_];
                ((Class8) class8).anInt179 += i_42_;
                ((Class8) class8).anInt177 += i_41_;
                ((Class8) class8).anInt174 += i_43_;
                ((Class8) class8).anInt172++;
                class8 = class8s[i_33_];
                ((Class8) class8).anInt177 += i_41_;
                ((Class8) class8).anInt172++;
                ((Class8) class8).anInt179 += i_42_;
                ((Class8) class8).anInt174 += i_43_;
                class8 = class8s[i_34_];
                ((Class8) class8).anInt179 += i_42_;
                ((Class8) class8).anInt172++;
                ((Class8) class8).anInt177 += i_41_;
                ((Class8) class8).anInt174 += i_43_;
            }
        }
        for (int i_46_ = 0; anInt6338 > i_46_; i_46_++) {
            int i_47_ = is[i_46_];
            int i_48_ = ((Class343) class343).aShortArray4054[i_47_] & 0xffff;
            int i_49_;
            if (((Class343) class343).aByteArray4026 != null)
                i_49_ = ((Class343) class343).aByteArray4026[i_47_];
            else
                i_49_ = -1;
            int i_50_;
            if (((Class343) class343).aByteArray4061 != null)
                i_50_ = ((Class343) class343).aByteArray4061[i_47_] & 0xff;
            else
                i_50_ = 0;
            short i_51_ = (((Class343) class343).aShortArray4056 == null ? (short) -1 : ((Class343) class343).aShortArray4056[i_47_]);
            if (i_51_ != -1 && (0x40 & anInt6397) != 0) {
                Class312 class312 = var_d.method25(i_51_ & 0xffff, (byte) 127);
                if (((Class312) class312).aBoolean3622)
                    i_51_ = (short) -1;
            }
            float f = 0.0F;
            float f_52_ = 0.0F;
            float f_53_ = 0.0F;
            float f_54_ = 0.0F;
            float f_55_ = 0.0F;
            float f_56_ = 0.0F;
            int i_57_ = 0;
            int i_58_ = 0;
            int i_59_ = 0;
            if ((i_51_ ^ 0xffffffff) != 0) {
                if (i_49_ != -1) {
                    i_49_ &= 0xff;
                    byte i_60_ = ((Class343) class343).aByteArray4033[i_49_];
                    if ((i_60_ ^ 0xffffffff) != -1) {
                        short i_61_ = ((Class343) class343).aShortArray4046[i_47_];
                        short i_62_ = ((Class343) class343).aShortArray4024[i_47_];
                        short i_63_ = ((Class343) class343).aShortArray4073[i_47_];
                        int i_64_ = ((Class75) class75).anIntArray974[i_49_];
                        int i_65_ = ((Class75) class75).anIntArray973[i_49_];
                        int i_66_ = ((Class75) class75).anIntArray976[i_49_];
                        float[] fs = ((Class75) class75).aFloatArrayArray979[i_49_];
                        byte i_67_ = ((Class343) class343).aByteArray4042[i_49_];
                        float f_68_ = ((float) (((Class343) class343).anIntArray4041[i_49_]) / 256.0F);
                        if ((i_60_ ^ 0xffffffff) != -2) {
                            if (i_60_ != 2) {
                                if ((i_60_ ^ 0xffffffff) == -4) {
                                    Node_Sub8_Sub11.method2085(i_67_, (((Class343) class343).anIntArray4069[i_61_]), Class269_Sub2.aFloatArray7546, 8, f_68_, i_65_, (((Class343) class343).anIntArray4040[i_61_]), (((Class343) class343).anIntArray4027[i_61_]), i_64_, i_66_, fs);
                                    f_52_ = Class269_Sub2.aFloatArray7546[1];
                                    f = Class269_Sub2.aFloatArray7546[0];
                                    Node_Sub8_Sub11.method2085(i_67_, (((Class343) class343).anIntArray4069[i_62_]), Class269_Sub2.aFloatArray7546, 8, f_68_, i_65_, (((Class343) class343).anIntArray4040[i_62_]), (((Class343) class343).anIntArray4027[i_62_]), i_64_, i_66_, fs);
                                    f_54_ = Class269_Sub2.aFloatArray7546[1];
                                    f_53_ = Class269_Sub2.aFloatArray7546[0];
                                    Node_Sub8_Sub11.method2085(i_67_, (((Class343) class343).anIntArray4069[i_63_]), Class269_Sub2.aFloatArray7546, 8, f_68_, i_65_, (((Class343) class343).anIntArray4040[i_63_]), (((Class343) class343).anIntArray4027[i_63_]), i_64_, i_66_, fs);
                                    f_56_ = Class269_Sub2.aFloatArray7546[1];
                                    f_55_ = Class269_Sub2.aFloatArray7546[0];
                                    if ((0x1 & i_67_) != 0) {
                                        if (f_54_ - f_52_ > 0.5F) {
                                            f_54_--;
                                            i_57_ = 1;
                                        } else if (-f_54_ + f_52_ > 0.5F) {
                                            i_57_ = 2;
                                            f_54_++;
                                        }
                                        if (!(-f_52_ + f_56_ > 0.5F)) {
                                            if (f_52_ - f_56_ > 0.5F) {
                                                i_58_ = 2;
                                                f_56_++;
                                            }
                                        } else {
                                            f_56_--;
                                            i_58_ = 1;
                                        }
                                    } else {
                                        if (-f + f_55_ > 0.5F) {
                                            f_55_--;
                                            i_58_ = 1;
                                        } else if (-f_55_ + f > 0.5F) {
                                            f_55_++;
                                            i_58_ = 2;
                                        }
                                        if (!(f_53_ - f > 0.5F)) {
                                            if (f - f_53_ > 0.5F) {
                                                i_57_ = 2;
                                                f_53_++;
                                            }
                                        } else {
                                            i_57_ = 1;
                                            f_53_--;
                                        }
                                    }
                                }
                            } else {
                                float f_69_ = ((float) (((Class343) class343).anIntArray4032[i_49_]) / 256.0F);
                                float f_70_ = ((float) (((Class343) class343).anIntArray4034[i_49_]) / 256.0F);
                                int i_71_ = ((((Class343) class343).anIntArray4027[i_62_]) + -(((Class343) class343).anIntArray4027[i_61_]));
                                int i_72_ = ((((Class343) class343).anIntArray4069[i_62_]) - (((Class343) class343).anIntArray4069[i_61_]));
                                int i_73_ = (-(((Class343) class343).anIntArray4040[i_61_]) + (((Class343) class343).anIntArray4040[i_62_]));
                                int i_74_ = ((((Class343) class343).anIntArray4027[i_63_]) + -(((Class343) class343).anIntArray4027[i_61_]));
                                int i_75_ = (-(((Class343) class343).anIntArray4069[i_61_]) + (((Class343) class343).anIntArray4069[i_63_]));
                                int i_76_ = (-(((Class343) class343).anIntArray4040[i_61_]) + (((Class343) class343).anIntArray4040[i_63_]));
                                int i_77_ = i_76_ * i_72_ + -(i_73_ * i_75_);
                                int i_78_ = i_74_ * i_73_ - i_76_ * i_71_;
                                int i_79_ = i_71_ * i_75_ + -(i_72_ * i_74_);
                                float f_80_ = 64.0F / (float) (((Class343) class343).anIntArray4058[i_49_]);
                                float f_81_ = 64.0F / (float) (((Class343) class343).anIntArray4029[i_49_]);
                                float f_82_ = 64.0F / (float) (((Class343) class343).anIntArray4021[i_49_]);
                                float f_83_ = ((fs[2] * (float) i_79_ + ((float) i_78_ * fs[1] + (float) i_77_ * fs[0])) / f_80_);
                                float f_84_ = ((fs[5] * (float) i_79_ + (fs[4] * (float) i_78_ + fs[3] * (float) i_77_)) / f_81_);
                                float f_85_ = ((fs[6] * (float) i_77_ + fs[7] * (float) i_78_ + (float) i_79_ * fs[8]) / f_82_);
                                i_59_ = Class139.method1280(f_83_, f_84_, f_85_, (byte) 49);
                                Node_Sub8_Sub6.method2061(f_70_, i_64_, (((Class343) class343).anIntArray4040[i_61_]), i_66_, f_69_, (byte) 9, i_65_, (((Class343) class343).anIntArray4027[i_61_]), (((Class343) class343).anIntArray4069[i_61_]), f_68_, i_67_, Class269_Sub2.aFloatArray7546, fs, i_59_);
                                f_52_ = Class269_Sub2.aFloatArray7546[1];
                                f = Class269_Sub2.aFloatArray7546[0];
                                Node_Sub8_Sub6.method2061(f_70_, i_64_, (((Class343) class343).anIntArray4040[i_62_]), i_66_, f_69_, (byte) 9, i_65_, (((Class343) class343).anIntArray4027[i_62_]), (((Class343) class343).anIntArray4069[i_62_]), f_68_, i_67_, Class269_Sub2.aFloatArray7546, fs, i_59_);
                                f_54_ = Class269_Sub2.aFloatArray7546[1];
                                f_53_ = Class269_Sub2.aFloatArray7546[0];
                                Node_Sub8_Sub6.method2061(f_70_, i_64_, (((Class343) class343).anIntArray4040[i_63_]), i_66_, f_69_, (byte) 9, i_65_, (((Class343) class343).anIntArray4027[i_63_]), (((Class343) class343).anIntArray4069[i_63_]), f_68_, i_67_, Class269_Sub2.aFloatArray7546, fs, i_59_);
                                f_56_ = Class269_Sub2.aFloatArray7546[1];
                                f_55_ = Class269_Sub2.aFloatArray7546[0];
                            }
                        } else {
                            float f_86_ = ((float) (((Class343) class343).anIntArray4021[i_49_]) / 1024.0F);
                            Class9.method192(-113, ((Class343) class343).anIntArray4040[i_61_], Class269_Sub2.aFloatArray7546, i_67_, ((Class343) class343).anIntArray4027[i_61_], i_65_, f_68_, fs, f_86_, i_64_, ((Class343) class343).anIntArray4069[i_61_], i_66_);
                            f_52_ = Class269_Sub2.aFloatArray7546[1];
                            f = Class269_Sub2.aFloatArray7546[0];
                            Class9.method192(-104, ((Class343) class343).anIntArray4040[i_62_], Class269_Sub2.aFloatArray7546, i_67_, ((Class343) class343).anIntArray4027[i_62_], i_65_, f_68_, fs, f_86_, i_64_, ((Class343) class343).anIntArray4069[i_62_], i_66_);
                            f_54_ = Class269_Sub2.aFloatArray7546[1];
                            f_53_ = Class269_Sub2.aFloatArray7546[0];
                            Class9.method192(-119, ((Class343) class343).anIntArray4040[i_63_], Class269_Sub2.aFloatArray7546, i_67_, ((Class343) class343).anIntArray4027[i_63_], i_65_, f_68_, fs, f_86_, i_64_, ((Class343) class343).anIntArray4069[i_63_], i_66_);
                            f_56_ = Class269_Sub2.aFloatArray7546[1];
                            f_55_ = Class269_Sub2.aFloatArray7546[0];
                            float f_87_ = f_86_ / 2.0F;
                            if ((i_67_ & 0x1) != 0) {
                                if (f_87_ < -f_52_ + f_56_) {
                                    f_56_ -= f_86_;
                                    i_58_ = 1;
                                } else if (f_87_ < -f_56_ + f_52_) {
                                    f_56_ += f_86_;
                                    i_58_ = 2;
                                }
                                if (-f_52_ + f_54_ > f_87_) {
                                    f_54_ -= f_86_;
                                    i_57_ = 1;
                                } else if (f_87_ < -f_54_ + f_52_) {
                                    i_57_ = 2;
                                    f_54_ += f_86_;
                                }
                            } else {
                                if (!(-f + f_53_ > f_87_)) {
                                    if (f_87_ < f - f_53_) {
                                        i_57_ = 2;
                                        f_53_ += f_86_;
                                    }
                                } else {
                                    i_57_ = 1;
                                    f_53_ -= f_86_;
                                }
                                if (-f + f_55_ > f_87_) {
                                    i_58_ = 1;
                                    f_55_ -= f_86_;
                                } else if (f_87_ < f - f_55_) {
                                    f_55_ += f_86_;
                                    i_58_ = 2;
                                }
                            }
                        }
                    } else {
                        short i_88_ = ((Class343) class343).aShortArray4046[i_47_];
                        short i_89_ = ((Class343) class343).aShortArray4024[i_47_];
                        short i_90_ = ((Class343) class343).aShortArray4073[i_47_];
                        short i_91_ = ((Class343) class343).aShortArray4047[i_49_];
                        short i_92_ = ((Class343) class343).aShortArray4049[i_49_];
                        short i_93_ = ((Class343) class343).aShortArray4070[i_49_];
                        float f_94_ = (float) (((Class343) class343).anIntArray4027[i_91_]);
                        float f_95_ = (float) (((Class343) class343).anIntArray4069[i_91_]);
                        float f_96_ = (float) (((Class343) class343).anIntArray4040[i_91_]);
                        float f_97_ = ((float) (((Class343) class343).anIntArray4027[i_92_]) - f_94_);
                        float f_98_ = ((float) (((Class343) class343).anIntArray4069[i_92_]) - f_95_);
                        float f_99_ = ((float) (((Class343) class343).anIntArray4040[i_92_]) - f_96_);
                        float f_100_ = -f_94_ + (float) (((Class343) class343).anIntArray4027[i_93_]);
                        float f_101_ = ((float) (((Class343) class343).anIntArray4069[i_93_]) - f_95_);
                        float f_102_ = -f_96_ + (float) (((Class343) class343).anIntArray4040[i_93_]);
                        float f_103_ = ((float) (((Class343) class343).anIntArray4027[i_88_]) - f_94_);
                        float f_104_ = ((float) (((Class343) class343).anIntArray4069[i_88_]) - f_95_);
                        float f_105_ = ((float) (((Class343) class343).anIntArray4040[i_88_]) - f_96_);
                        float f_106_ = ((float) (((Class343) class343).anIntArray4027[i_89_]) - f_94_);
                        float f_107_ = -f_95_ + (float) (((Class343) class343).anIntArray4069[i_89_]);
                        float f_108_ = -f_96_ + (float) (((Class343) class343).anIntArray4040[i_89_]);
                        float f_109_ = ((float) (((Class343) class343).anIntArray4027[i_90_]) - f_94_);
                        float f_110_ = -f_95_ + (float) (((Class343) class343).anIntArray4069[i_90_]);
                        float f_111_ = ((float) (((Class343) class343).anIntArray4040[i_90_]) - f_96_);
                        float f_112_ = f_102_ * f_98_ - f_99_ * f_101_;
                        float f_113_ = f_99_ * f_100_ - f_102_ * f_97_;
                        float f_114_ = -(f_100_ * f_98_) + f_97_ * f_101_;
                        float f_115_ = f_101_ * f_114_ - f_102_ * f_113_;
                        float f_116_ = f_112_ * f_102_ - f_114_ * f_100_;
                        float f_117_ = f_113_ * f_100_ - f_101_ * f_112_;
                        float f_118_ = 1.0F / (f_117_ * f_99_ + (f_97_ * f_115_ + f_116_ * f_98_));
                        f_55_ = f_118_ * (f_117_ * f_111_ + (f_110_ * f_116_ + f_109_ * f_115_));
                        f_53_ = (f_108_ * f_117_ + (f_115_ * f_106_ + f_116_ * f_107_)) * f_118_;
                        f = f_118_ * (f_116_ * f_104_ + f_103_ * f_115_ + f_117_ * f_105_);
                        f_117_ = f_97_ * f_113_ - f_112_ * f_98_;
                        f_115_ = f_114_ * f_98_ - f_99_ * f_113_;
                        f_116_ = -(f_97_ * f_114_) + f_112_ * f_99_;
                        f_118_ = 1.0F / (f_100_ * f_115_ + f_101_ * f_116_ + f_102_ * f_117_);
                        f_54_ = f_118_ * (f_117_ * f_108_ + (f_115_ * f_106_ + f_116_ * f_107_));
                        f_56_ = f_118_ * (f_117_ * f_111_ + (f_109_ * f_115_ + f_116_ * f_110_));
                        f_52_ = (f_115_ * f_103_ + f_104_ * f_116_ + f_105_ * f_117_) * f_118_;
                    }
                } else {
                    f_52_ = 1.0F;
                    f_55_ = 0.0F;
                    f_56_ = 0.0F;
                    i_58_ = 2;
                    f_53_ = 1.0F;
                    i_57_ = 1;
                    f_54_ = 1.0F;
                    f = 0.0F;
                }
            }
            byte i_119_;
            if (((Class343) class343).aByteArray4076 != null)
                i_119_ = ((Class343) class343).aByteArray4076[i_47_];
            else
                i_119_ = (byte) 0;
            if (i_119_ != 0) {
                if ((i_119_ ^ 0xffffffff) == -2) {
                    Class366 class366 = class366s[i_47_];
                    long l = ((long) ((((Class366) class366).anInt4492 - -256 << 799332118) + ((((Class366) class366).anInt4493 + 256 << -1689019700) + (i_49_ << 449258626)) - -(((Class366) class366).anInt4490 > 0 ? 1024 : 2048)) + (((long) i_50_ + (long) (i_48_ << 1080473320) + (long) (i_59_ << 804281176)) << 1664333856));
                    aShortArray6386[i_46_] = method1458(0, class343, i_46_, ((Class366) class366).anInt4490, f, f_52_, 0, l, ((Class366) class366).anInt4492, ((Class366) class366).anInt4493, (((Class343) class343).aShortArray4046[i_47_]));
                    aShortArray6325[i_46_] = method1458(0, class343, i_46_, ((Class366) class366).anInt4490, f_53_, f_54_, 0, (long) i_57_ + l, ((Class366) class366).anInt4492, ((Class366) class366).anInt4493, (((Class343) class343).aShortArray4024[i_47_]));
                    aShortArray6400[i_46_] = method1458(0, class343, i_46_, ((Class366) class366).anInt4490, f_55_, f_56_, 0, (long) i_58_ + l, ((Class366) class366).anInt4492, ((Class366) class366).anInt4493, (((Class343) class343).aShortArray4073[i_47_]));
                }
            } else {
                long l = (((long) i_50_ + ((long) (i_48_ << 1633902792) + (long) (i_59_ << 985491768)) << -1697823008) + (long) (i_49_ << 1908639362));
                short i_120_ = ((Class343) class343).aShortArray4046[i_47_];
                short i_121_ = ((Class343) class343).aShortArray4024[i_47_];
                short i_122_ = ((Class343) class343).aShortArray4073[i_47_];
                Class8 class8 = class8s[i_120_];
                aShortArray6386[i_46_] = method1458(((Class8) class8).anInt172, class343, i_46_, ((Class8) class8).anInt177, f, f_52_, 0, l, ((Class8) class8).anInt174, ((Class8) class8).anInt179, i_120_);
                class8 = class8s[i_121_];
                aShortArray6325[i_46_] = method1458(((Class8) class8).anInt172, class343, i_46_, ((Class8) class8).anInt177, f_53_, f_54_, 0, l + (long) i_57_, ((Class8) class8).anInt174, ((Class8) class8).anInt179, i_121_);
                class8 = class8s[i_122_];
                aShortArray6400[i_46_] = method1458(((Class8) class8).anInt172, class343, i_46_, ((Class8) class8).anInt177, f_55_, f_56_, 0, (long) i_58_ + l, ((Class8) class8).anInt174, ((Class8) class8).anInt179, i_122_);
            }
            if (((Class343) class343).aByteArray4061 != null)
                aByteArray6384[i_46_] = ((Class343) class343).aByteArray4061[i_47_];
            if (((Class343) class343).aShortArray4064 != null)
                aShortArray6354[i_46_] = ((Class343) class343).aShortArray4064[i_47_];
            aShortArray6395[i_46_] = ((Class343) class343).aShortArray4054[i_47_];
            aShortArray6416[i_46_] = i_51_;
        }
        if (anInt6378 > 0) {
            int i_123_ = 1;
            short i_124_ = aShortArray6416[0];
            for (int i_125_ = 0; (i_125_ ^ 0xffffffff) > (anInt6378 ^ 0xffffffff); i_125_++) {
                short i_126_ = aShortArray6416[i_125_];
                if ((i_126_ ^ 0xffffffff) != (i_124_ ^ 0xffffffff)) {
                    i_123_++;
                    i_124_ = i_126_;
                }
            }
            anIntArray6383 = new int[i_123_];
            anIntArray6318 = new int[i_123_ + 1];
            anIntArray6426 = new int[i_123_];
            anIntArray6318[0] = 0;
            int i_127_ = anInt6402;
            int i_128_ = 0;
            i_124_ = aShortArray6416[0];
            i_123_ = 0;
            for (int i_129_ = 0; anInt6378 > i_129_; i_129_++) {
                short i_130_ = aShortArray6416[i_129_];
                if (i_130_ != i_124_) {
                    anIntArray6383[i_123_] = i_127_;
                    anIntArray6426[i_123_] = 1 + (i_128_ - i_127_);
                    anIntArray6318[++i_123_] = i_129_;
                    i_124_ = i_130_;
                    i_128_ = 0;
                    i_127_ = anInt6402;
                }
                int i_131_ = aShortArray6386[i_129_];
                if (i_131_ < i_127_)
                    i_127_ = i_131_;
                if ((i_128_ ^ 0xffffffff) > (i_131_ ^ 0xffffffff))
                    i_128_ = i_131_;
                i_131_ = aShortArray6325[i_129_];
                if ((i_128_ ^ 0xffffffff) > (i_131_ ^ 0xffffffff))
                    i_128_ = i_131_;
                if (i_127_ > i_131_)
                    i_127_ = i_131_;
                i_131_ = aShortArray6400[i_129_];
                if (i_131_ < i_127_)
                    i_127_ = i_131_;
                if ((i_131_ ^ 0xffffffff) < (i_128_ ^ 0xffffffff))
                    i_128_ = i_131_;
            }
            anIntArray6383[i_123_] = i_127_;
            anIntArray6426[i_123_] = i_128_ - (i_127_ + -1);
            anIntArray6318[++i_123_] = anInt6378;
        }
        Class312.aLongArray3641 = null;
        aShortArray6342 = Class40.method299(aShortArray6342, anInt6402, true);
        aShortArray6387 = Class40.method299(aShortArray6387, anInt6402, true);
        aShortArray6401 = Class40.method299(aShortArray6401, anInt6402, true);
        aShortArray6340 = Class40.method299(aShortArray6340, anInt6402, true);
        aShortArray6369 = Class40.method299(aShortArray6369, anInt6402, true);
        aByteArray6341 = Class34.method277(false, anInt6402, aByteArray6341);
        aFloatArray6420 = Class57.method454(aFloatArray6420, (byte) -122, anInt6402);
        aFloatArray6415 = Class57.method454(aFloatArray6415, (byte) -122, anInt6402);
        if (((Class343) class343).anIntArray4057 != null && aa.method152(anInt6397, i, 24048))
            anIntArrayArray6412 = class343.method3504(false, 46);
        if (((Class343) class343).aClass178Array4048 != null && Class346_Sub5_Sub2.method3552(anInt6397, (byte) 85, i))
            anIntArrayArray6409 = class343.method3506(-15362);
        if (((Class343) class343).anIntArray4030 != null && Node_Sub2_Sub4.method1999(anInt6397, i, (byte) 110)) {
            int i_132_ = 0;
            int[] is_133_ = new int[256];
            for (int i_134_ = 0; (i_134_ ^ 0xffffffff) > (anInt6338 ^ 0xffffffff); i_134_++) {
                int i_135_ = ((Class343) class343).anIntArray4030[is[i_134_]];
                if ((i_135_ ^ 0xffffffff) <= -1) {
                    if ((i_135_ ^ 0xffffffff) < (i_132_ ^ 0xffffffff))
                        i_132_ = i_135_;
                    is_133_[i_135_]++;
                }
            }
            anIntArrayArray6404 = new int[i_132_ - -1][];
            for (int i_136_ = 0; i_136_ <= i_132_; i_136_++) {
                anIntArrayArray6404[i_136_] = new int[is_133_[i_136_]];
                is_133_[i_136_] = 0;
            }
            for (int i_137_ = 0; anInt6338 > i_137_; i_137_++) {
                int i_138_ = ((Class343) class343).anIntArray4030[is[i_137_]];
                if ((i_138_ ^ 0xffffffff) <= -1)
                    anIntArrayArray6404[i_138_][is_133_[i_138_]++] = i_137_;
            }
        }
    }

    final void method1440(Viewport viewport, Class346_Sub9 class346_sub9, int i) {
        anInt6419++;
        if (anInt6402 != 0) {
            Class238_Sub2 class238_sub2 = ((ha_Sub3) aHa_Sub3_6380).aClass238_Sub2_6147;
            if (!aBoolean6408)
                method1454(-104);
            Class238_Sub2 class238_sub2_139_ = (Class238_Sub2) viewport;
            Node_Sub8_Sub17.aFloat9057 = ((((Class238_Sub2) class238_sub2_139_).aFloat6737 * ((Class238_Sub2) class238_sub2).aFloat6744) + (((Class238_Sub2) class238_sub2).aFloat6728 * ((Class238_Sub2) class238_sub2_139_).aFloat6750) + (((Class238_Sub2) class238_sub2).aFloat6754 * ((Class238_Sub2) class238_sub2_139_).aFloat6744));
            Class242.aFloat2699 = ((((Class238_Sub2) class238_sub2).aFloat6728 * ((Class238_Sub2) class238_sub2_139_).aFloat6733) + (((Class238_Sub2) class238_sub2_139_).aFloat6715 * ((Class238_Sub2) class238_sub2).aFloat6744) + (((Class238_Sub2) class238_sub2_139_).aFloat6706 * ((Class238_Sub2) class238_sub2).aFloat6754) + ((Class238_Sub2) class238_sub2).aFloat6706);
            float f = ((float) anInt6407 * Node_Sub8_Sub17.aFloat9057 + Class242.aFloat2699);
            float f_140_ = (Node_Sub8_Sub17.aFloat9057 * (float) anInt6352 + Class242.aFloat2699);
            float f_141_;
            float f_142_;
            if (f_140_ < f) {
                f_142_ = f_140_ - (float) anInt6307;
                f_141_ = (float) anInt6307 + f;
            } else {
                f_141_ = f_140_ + (float) anInt6307;
                f_142_ = f - (float) anInt6307;
            }
            if (!(((ha_Sub3) aHa_Sub3_6380).aFloat6197 <= f_142_) && !(f_141_ <= (float) ((ha_Sub3) aHa_Sub3_6380).anInt6173)) {
                Class132.aFloat1622 = ((((Class238_Sub2) class238_sub2_139_).aFloat6750 * ((Class238_Sub2) class238_sub2).aFloat6711) + (((Class238_Sub2) class238_sub2_139_).aFloat6737 * ((Class238_Sub2) class238_sub2).aFloat6750) + (((Class238_Sub2) class238_sub2_139_).aFloat6744 * ((Class238_Sub2) class238_sub2).aFloat6726));
                Node_Sub2_Sub4.aFloat8880 = ((((Class238_Sub2) class238_sub2).aFloat6726 * ((Class238_Sub2) class238_sub2_139_).aFloat6706) + ((((Class238_Sub2) class238_sub2_139_).aFloat6715 * ((Class238_Sub2) class238_sub2).aFloat6750) + (((Class238_Sub2) class238_sub2).aFloat6711 * (((Class238_Sub2) class238_sub2_139_).aFloat6733))) + ((Class238_Sub2) class238_sub2).aFloat6733);
                float f_143_ = (Class132.aFloat1622 * (float) anInt6407 + Node_Sub2_Sub4.aFloat8880);
                float f_144_ = (Class132.aFloat1622 * (float) anInt6352 + Node_Sub2_Sub4.aFloat8880);
                float f_145_;
                float f_146_;
                if (!(f_143_ > f_144_)) {
                    f_145_ = (((float) anInt6307 + f_144_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                    f_146_ = (((float) -anInt6307 + f_143_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                } else {
                    f_145_ = (((float) anInt6307 + f_143_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                    f_146_ = ((f_144_ - (float) anInt6307) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                }
                if (!(f_146_ / f_141_ >= ((ha_Sub3) aHa_Sub3_6380).aFloat6191) && !(((ha_Sub3) aHa_Sub3_6380).aFloat6213 >= f_145_ / f_141_)) {
                    Class282_Sub2.aFloat7610 = (((Class238_Sub2) class238_sub2).aFloat6715 + ((((Class238_Sub2) class238_sub2).aFloat6724 * (((Class238_Sub2) class238_sub2_139_).aFloat6706)) + (((((Class238_Sub2) class238_sub2_139_).aFloat6733) * ((Class238_Sub2) class238_sub2).aFloat6713) + ((((Class238_Sub2) class238_sub2_139_).aFloat6715) * (((Class238_Sub2) class238_sub2).aFloat6737)))));
                    Class340.aFloat3967 = ((((Class238_Sub2) class238_sub2).aFloat6713 * ((Class238_Sub2) class238_sub2_139_).aFloat6750) + (((Class238_Sub2) class238_sub2_139_).aFloat6737 * ((Class238_Sub2) class238_sub2).aFloat6737) + (((Class238_Sub2) class238_sub2_139_).aFloat6744 * ((Class238_Sub2) class238_sub2).aFloat6724));
                    float f_147_ = ((float) anInt6407 * Class340.aFloat3967 + Class282_Sub2.aFloat7610);
                    float f_148_ = ((float) anInt6352 * Class340.aFloat3967 + Class282_Sub2.aFloat7610);
                    float f_149_;
                    float f_150_;
                    if (f_147_ > f_148_) {
                        f_150_ = ((f_148_ - (float) anInt6307) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6243);
                        f_149_ = ((f_147_ + (float) anInt6307) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6243);
                    } else {
                        f_149_ = ((f_148_ + (float) anInt6307) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6243);
                        f_150_ = ((float) ((ha_Sub3) aHa_Sub3_6380).anInt6243 * (f_147_ - (float) anInt6307));
                    }
                    if (!(((ha_Sub3) aHa_Sub3_6380).aFloat6168 <= f_150_ / f_141_) && !(f_149_ / f_141_ <= ((ha_Sub3) aHa_Sub3_6380).aFloat6160)) {
                        if (class346_sub9 != null || aClass132Array6330 != null) {
                            Class136_Sub2.aFloat8395 = (((((Class238_Sub2) class238_sub2_139_).aFloat6728) * (((Class238_Sub2) class238_sub2).aFloat6754)) + (((((Class238_Sub2) class238_sub2_139_).aFloat6713) * (((Class238_Sub2) class238_sub2).aFloat6744)) + ((((Class238_Sub2) class238_sub2_139_).aFloat6711) * (((Class238_Sub2) class238_sub2).aFloat6728))));
                            Class206.aFloat4976 = (((((Class238_Sub2) class238_sub2_139_).aFloat6754) * (((Class238_Sub2) class238_sub2).aFloat6724)) + (((((Class238_Sub2) class238_sub2).aFloat6713) * (((Class238_Sub2) class238_sub2_139_).aFloat6726)) + ((((Class238_Sub2) class238_sub2_139_).aFloat6724) * (((Class238_Sub2) class238_sub2).aFloat6737))));
                            Node_Sub23.aFloat7093 = (((((Class238_Sub2) class238_sub2_139_).aFloat6713) * (((Class238_Sub2) class238_sub2).aFloat6750)) + ((((Class238_Sub2) class238_sub2_139_).aFloat6711) * (((Class238_Sub2) class238_sub2).aFloat6711)) + ((((Class238_Sub2) class238_sub2_139_).aFloat6728) * (((Class238_Sub2) class238_sub2).aFloat6726)));
                            Node_Sub2_Sub3.aFloat8862 = ((((Class238_Sub2) class238_sub2).aFloat6724 * (((Class238_Sub2) class238_sub2_139_).aFloat6728)) + (((((Class238_Sub2) class238_sub2).aFloat6737) * (((Class238_Sub2) class238_sub2_139_).aFloat6713)) + ((((Class238_Sub2) class238_sub2).aFloat6713) * ((Class238_Sub2) class238_sub2_139_).aFloat6711)));
                            Class95.aFloat1236 = ((((Class238_Sub2) class238_sub2).aFloat6754 * (((Class238_Sub2) class238_sub2_139_).aFloat6754)) + (((((Class238_Sub2) class238_sub2_139_).aFloat6724) * (((Class238_Sub2) class238_sub2).aFloat6744)) + ((((Class238_Sub2) class238_sub2_139_).aFloat6726) * (((Class238_Sub2) class238_sub2).aFloat6728))));
                            Class102.aFloat1304 = ((((Class238_Sub2) class238_sub2).aFloat6750 * (((Class238_Sub2) class238_sub2_139_).aFloat6724)) + ((((Class238_Sub2) class238_sub2).aFloat6711) * (((Class238_Sub2) class238_sub2_139_).aFloat6726)) + ((((Class238_Sub2) class238_sub2_139_).aFloat6754) * (((Class238_Sub2) class238_sub2).aFloat6726)));
                        }
                        if (class346_sub9 != null) {
                            boolean bool = false;
                            boolean bool_151_ = true;
                            int i_152_ = anInt6421 + anInt6428 >> -658791487;
                            int i_153_ = anInt6336 + anInt6309 >> 1857023777;
                            int i_154_ = (int) ((float) i_153_ * Class102.aFloat1304 + ((Class132.aFloat1622 * (float) anInt6407) + (((float) i_152_ * Node_Sub23.aFloat7093) + (Node_Sub2_Sub4.aFloat8880))));
                            int i_155_ = (int) (Class282_Sub2.aFloat7610 + ((float) i_152_ * Node_Sub2_Sub3.aFloat8862) + (Class340.aFloat3967 * (float) anInt6407) + ((float) i_153_ * Class206.aFloat4976));
                            int i_156_ = (int) ((float) i_153_ * Class95.aFloat1236 + ((Node_Sub8_Sub17.aFloat9057 * (float) anInt6407) + (Class242.aFloat2699 + ((float) i_152_ * (Class136_Sub2.aFloat8395)))));
                            if ((((ha_Sub3) aHa_Sub3_6380).anInt6173 ^ 0xffffffff) >= (i_156_ ^ 0xffffffff)) {
                                ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub3) aHa_Sub3_6380).anInt6246 + (i_154_ * ((ha_Sub3) aHa_Sub3_6380).anInt6196 / i_156_));
                                ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub3) aHa_Sub3_6380).anInt6166 + (i_155_ * ((ha_Sub3) aHa_Sub3_6380).anInt6243 / i_156_));
                            } else
                                bool = true;
                            int i_157_ = (int) (Node_Sub2_Sub4.aFloat8880 + ((float) i_152_ * Node_Sub23.aFloat7093) + ((float) anInt6352 * Class132.aFloat1622) + ((float) i_153_ * Class102.aFloat1304));
                            int i_158_ = (int) (((float) anInt6352 * Class340.aFloat3967) + (Class282_Sub2.aFloat7610 + (Node_Sub2_Sub3.aFloat8862 * (float) i_152_)) + (Class206.aFloat4976 * (float) i_153_));
                            int i_159_ = (int) ((float) i_153_ * Class95.aFloat1236 + ((Class136_Sub2.aFloat8395 * (float) i_152_) + Class242.aFloat2699 + (Node_Sub8_Sub17.aFloat9057 * (float) anInt6352)));
                            if ((((ha_Sub3) aHa_Sub3_6380).anInt6173 ^ 0xffffffff) < (i_159_ ^ 0xffffffff))
                                bool = true;
                            else {
                                ((Class346_Sub9) class346_sub9).anInt8345 = (((ha_Sub3) aHa_Sub3_6380).anInt6246 - -(((ha_Sub3) aHa_Sub3_6380).anInt6196 * i_157_ / i_159_));
                                ((Class346_Sub9) class346_sub9).anInt8343 = ((((ha_Sub3) aHa_Sub3_6380).anInt6243 * i_158_ / i_159_) + ((ha_Sub3) aHa_Sub3_6380).anInt6166);
                            }
                            if (bool) {
                                if (((i_156_ ^ 0xffffffff) > (((ha_Sub3) aHa_Sub3_6380).anInt6173 ^ 0xffffffff)) && (i_159_ < ((ha_Sub3) aHa_Sub3_6380).anInt6173))
                                    bool_151_ = false;
                                else if (i_156_ >= (((ha_Sub3) aHa_Sub3_6380).anInt6173)) {
                                    if ((((ha_Sub3) aHa_Sub3_6380).anInt6173 ^ 0xffffffff) < (i_159_ ^ 0xffffffff)) {
                                        int i_160_ = (((i_156_ - (((ha_Sub3) aHa_Sub3_6380).anInt6173)) << -1285230000) / (i_156_ + -i_159_));
                                        int i_161_ = (((i_154_ - i_157_) * i_160_ >> -1742246544) + i_154_);
                                        int i_162_ = (((i_155_ + -i_158_) * i_160_ >> 621998512) + i_155_);
                                        ((Class346_Sub9) class346_sub9).anInt8347 = ((i_161_ * (((ha_Sub3) aHa_Sub3_6380).anInt6196) / (((ha_Sub3) aHa_Sub3_6380).anInt6173)) + (((ha_Sub3) aHa_Sub3_6380).anInt6246));
                                        ((Class346_Sub9) class346_sub9).anInt8346 = (((((ha_Sub3) aHa_Sub3_6380).anInt6243) * i_162_ / (((ha_Sub3) aHa_Sub3_6380).anInt6173)) + (((ha_Sub3) aHa_Sub3_6380).anInt6166));
                                    }
                                } else {
                                    int i_163_ = (i_159_ + -(((ha_Sub3) aHa_Sub3_6380).anInt6173) << 1991894352) / (i_159_ - i_156_);
                                    int i_164_ = ((i_163_ * (-i_154_ + i_157_) >> 1137898096) + i_157_);
                                    ((Class346_Sub9) class346_sub9).anInt8347 = ((i_164_ * (((ha_Sub3) aHa_Sub3_6380).anInt6196) / (((ha_Sub3) aHa_Sub3_6380).anInt6173)) + (((ha_Sub3) aHa_Sub3_6380).anInt6246));
                                    int i_165_ = ((i_163_ * (i_158_ - i_155_) >> -2132609840) + i_158_);
                                    ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub3) aHa_Sub3_6380).anInt6166 + ((((ha_Sub3) aHa_Sub3_6380).anInt6243) * i_165_ / (((ha_Sub3) aHa_Sub3_6380).anInt6173)));
                                }
                            }
                            if (bool_151_) {
                                if (i_156_ <= i_159_)
                                    ((Class346_Sub9) class346_sub9).anInt8344 = (-(((Class346_Sub9) class346_sub9).anInt8345) + (((ha_Sub3) aHa_Sub3_6380).anInt6246) - -((((ha_Sub3) aHa_Sub3_6380).anInt6196) * (anInt6307 + i_157_) / i_159_));
                                else
                                    ((Class346_Sub9) class346_sub9).anInt8344 = (((i_154_ + anInt6307) * (((ha_Sub3) aHa_Sub3_6380).anInt6196) / i_156_) + ((((ha_Sub3) aHa_Sub3_6380).anInt6246) + -((Class346_Sub9) class346_sub9).anInt8347));
                                ((Class346_Sub9) class346_sub9).aBoolean8342 = true;
                            }
                        }
                        aHa_Sub3_6380.method1050((byte) -77);
                        aHa_Sub3_6380.method945(class238_sub2_139_, 127);
                        method1446(100);
                        method1457(-127);
                    }
                }
            }
        }
    }

    private final void method1447(int i) {
        anInt6334++;
        if (i != 0)
            aClass337_6373 = null;
        if ((anInt6397 & 0x37 ^ 0xffffffff) != -1) {
            if (aClass337_6344 != null)
                ((Class337) aClass337_6344).aBoolean3927 = false;
        } else if (aClass337_6373 != null)
            ((Class337) aClass337_6373).aBoolean3927 = false;
    }

    private final void method1448(int i) {
        anInt6322++;
        if (i != -5565)
            method1420(105, 27, null, false, -88, -47);
        if (aClass337_6373 != null)
            ((Class337) aClass337_6373).aBoolean3927 = false;
    }

    final boolean method1422() {
        anInt6432++;
        if (aShortArray6416 == null)
            return true;
        for (int i = 0; aShortArray6416.length > i; i++) {
            if ((aShortArray6416[i] ^ 0xffffffff) != 0 && !((ha) aHa_Sub3_6380).aD1414.method23(aShortArray6416[i], -32345))
                return false;
        }
        return true;
    }

    final void aa(short i, short i_166_) {
        anInt6424++;
        d var_d = ((ha) aHa_Sub3_6380).aD1414;
        for (int i_167_ = 0; anInt6338 > i_167_; i_167_++) {
            if (i == aShortArray6416[i_167_])
                aShortArray6416[i_167_] = i_166_;
        }
        byte i_168_ = 0;
        byte i_169_ = 0;
        if (i != -1) {
            Class312 class312 = var_d.method25(0xffff & i, (byte) 127);
            i_169_ = ((Class312) class312).aByte3625;
            i_168_ = ((Class312) class312).aByte3630;
        }
        byte i_170_ = 0;
        byte i_171_ = 0;
        if ((i_166_ ^ 0xffffffff) != 0) {
            Class312 class312 = var_d.method25(0xffff & i_166_, (byte) 126);
            i_170_ = ((Class312) class312).aByte3630;
            if ((((Class312) class312).aByte3643 ^ 0xffffffff) != -1 || ((Class312) class312).aByte3642 != 0)
                aBoolean6379 = true;
            i_171_ = ((Class312) class312).aByte3625;
        }
        if (i_170_ != i_168_ | i_171_ != i_169_) {
            if (aClass132Array6330 != null) {
                for (int i_172_ = 0; anInt6403 > i_172_; i_172_++) {
                    Class132 class132 = aClass132Array6330[i_172_];
                    Class284 class284 = aClass284Array6361[i_172_];
                    ((Class284) class284).anInt3355 = ((Node_Sub14_Sub39.anIntArray9600[(aShortArray6395[((Class132) class132).anInt1619] & 0xffff)]) & 0xffffff | ~0xffffff & ((Class284) class284).anInt3355);
                }
            }
            method1448(-5565);
        }
    }

    static final Entity method1449(int i, int i_173_, int i_174_, int i_175_) {
        anInt6374++;
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_175_][i_174_];
        if (class137 == null)
            return null;
        if (i_173_ != -28802)
            method1455(-87);
        Entity entity = null;
        int i_176_ = -1;
        for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
            Animable animable = ((Class49) class49).aAnimable_656;
            if (animable instanceof Entity) {
                Entity entity_177_ = (Entity) animable;
                int i_178_ = (256 * (-1 + entity_177_.method3632(-1)) + 252);
                int i_179_ = (((Interactable) entity_177_).x - i_178_) >> 142672617;
                int i_180_ = -i_178_ + (((Interactable) entity_177_).y) >> 1253362537;
                int i_181_ = (((Interactable) entity_177_).x - -i_178_) >> -270895799;
                int i_182_ = (i_178_ + (((Interactable) entity_177_).y) >> -1817491383);
                if (i_175_ >= i_179_ && i_180_ <= i_174_ && (i_181_ ^ 0xffffffff) <= (i_175_ ^ 0xffffffff) && i_182_ >= i_174_) {
                    int i_183_ = (i_182_ - -1 + -i_174_) * (i_181_ - (-1 - -i_175_));
                    if ((i_183_ ^ 0xffffffff) < (i_176_ ^ 0xffffffff)) {
                        entity = entity_177_;
                        i_176_ = i_183_;
                    }
                }
            }
        }
        return entity;
    }

    final void method1433(int i, int i_184_, int i_185_, int i_186_) {
        for (int i_187_ = 0; anInt6338 > i_187_; i_187_++) {
            int i_188_ = 0xffff & aShortArray6395[i_187_];
            int i_189_ = (i_188_ & 0xfd26) >> 1537673706;
            int i_190_ = 0x7 & i_188_ >> -114301049;
            if (i_184_ != -1)
                i_190_ = ((i_184_ - i_190_) * i_186_ >> 2037325287) + i_190_;
            if (i != -1)
                i_189_ = (i_186_ * (-i_189_ + i) >> 1732291239) + i_189_;
            int i_191_ = 0x7f & i_188_;
            if ((i_185_ ^ 0xffffffff) != 0)
                i_191_ = ((-i_191_ + i_185_) * i_186_ >> 1069574471) + i_191_;
            aShortArray6395[i_187_] = (short) (Class358.retrieveLooksSettings(i_191_, Class358.retrieveLooksSettings(i_189_ << 357389930, i_190_ << 71916903)));
        }
        anInt6418++;
        if (aClass132Array6330 != null) {
            for (int i_192_ = 0; (i_192_ ^ 0xffffffff) > (anInt6403 ^ 0xffffffff); i_192_++) {
                Class132 class132 = aClass132Array6330[i_192_];
                Class284 class284 = aClass284Array6361[i_192_];
                ((Class284) class284).anInt3355 = ((Node_Sub14_Sub39.anIntArray9600[(aShortArray6395[((Class132) class132).anInt1619] & 0xffff)]) & 0xffffff | ((Class284) class284).anInt3355 & ~0xffffff);
            }
        }
        method1448(-5565);
    }

    final int ua() {
        anInt6430++;
        return anInt6324;
    }

    final void method1435() {
        anInt6410++;
        if ((anInt6402 ^ 0xffffffff) < -1 && anInt6378 > 0) {
            method1451(110);
            method1466(8);
            method1465((byte) 1);
        }
    }

    final boolean r() {
        anInt6414++;
        return aBoolean6379;
    }

    final int fa() {
        anInt6362++;
        if (!aBoolean6408)
            method1454(100);
        return anInt6407;
    }

    final int V() {
        if (!aBoolean6408)
            method1454(116);
        anInt6346++;
        return anInt6428;
    }

    final void v() {
        anInt6413++;
        for (int i = 0; (anInt6366 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
            anIntArray6320[i] = -anIntArray6320[i];
        for (int i = 0; i < anInt6402; i++)
            aShortArray6369[i] = (short) -aShortArray6369[i];
        for (int i = 0; (i ^ 0xffffffff) > (anInt6338 ^ 0xffffffff); i++) {
            short i_193_ = aShortArray6386[i];
            aShortArray6386[i] = aShortArray6400[i];
            aShortArray6400[i] = i_193_;
        }
        method1464(-101);
        method1447(0);
        method1456(12460);
        aBoolean6408 = false;
    }

    final Class124[] method1426() {
        anInt6423++;
        return aClass124Array6385;
    }

    private final Class162 method1450(Class162_Sub1 class162_sub1_194_, boolean bool, int i, byte i_195_, boolean bool_196_, Class162_Sub1 class162_sub1_197_) {
        class162_sub1_197_.anInt6324 = i;
        class162_sub1_197_.aBoolean6379 = aBoolean6379;
        anInt6332++;
        class162_sub1_197_.anInt6403 = anInt6403;
        class162_sub1_197_.anInt6366 = anInt6366;
        class162_sub1_197_.anInt6402 = anInt6402;
        class162_sub1_197_.anInt6338 = anInt6338;
        if ((i & 0x100) == 0)
            class162_sub1_197_.aBoolean6405 = aBoolean6405;
        else
            class162_sub1_197_.aBoolean6405 = true;
        class162_sub1_197_.anInt6308 = anInt6308;
        class162_sub1_197_.aShort6328 = aShort6328;
        class162_sub1_197_.aShort6436 = aShort6436;
        class162_sub1_197_.anInt6397 = anInt6397;
        class162_sub1_197_.anInt6378 = anInt6378;
        boolean bool_198_ = Class198.method1675(102, anInt6397, i);
        boolean bool_199_ = Class346_Sub7_Sub2_Sub3.method3621((byte) -123, anInt6397, i);
        boolean bool_200_ = Class346_Sub7_Sub5.method3690(23606, anInt6397, i);
        boolean bool_201_ = bool_199_ | bool_198_ | bool_200_;
        if (bool_201_) {
            if (bool_198_) {
                if (class162_sub1_194_.anIntArray6314 == null || class162_sub1_194_.anIntArray6314.length < anInt6308)
                    class162_sub1_197_.anIntArray6314 = class162_sub1_194_.anIntArray6314 = new int[anInt6308];
                else
                    class162_sub1_197_.anIntArray6314 = class162_sub1_194_.anIntArray6314;
            } else
                class162_sub1_197_.anIntArray6314 = anIntArray6314;
            if (!bool_199_)
                class162_sub1_197_.anIntArray6321 = anIntArray6321;
            else if (class162_sub1_194_.anIntArray6321 != null && ((anInt6308 ^ 0xffffffff) >= (class162_sub1_194_.anIntArray6321.length ^ 0xffffffff)))
                class162_sub1_197_.anIntArray6321 = class162_sub1_194_.anIntArray6321;
            else
                class162_sub1_197_.anIntArray6321 = class162_sub1_194_.anIntArray6321 = new int[anInt6308];
            if (!bool_200_)
                class162_sub1_197_.anIntArray6320 = anIntArray6320;
            else if (class162_sub1_194_.anIntArray6320 == null || anInt6308 > class162_sub1_194_.anIntArray6320.length)
                class162_sub1_197_.anIntArray6320 = class162_sub1_194_.anIntArray6320 = new int[anInt6308];
            else
                class162_sub1_197_.anIntArray6320 = class162_sub1_194_.anIntArray6320;
            for (int i_202_ = 0; anInt6308 > i_202_; i_202_++) {
                if (bool_198_)
                    class162_sub1_197_.anIntArray6314[i_202_] = anIntArray6314[i_202_];
                if (bool_199_)
                    class162_sub1_197_.anIntArray6321[i_202_] = anIntArray6321[i_202_];
                if (bool_200_)
                    class162_sub1_197_.anIntArray6320[i_202_] = anIntArray6320[i_202_];
            }
        } else {
            class162_sub1_197_.anIntArray6321 = anIntArray6321;
            class162_sub1_197_.anIntArray6320 = anIntArray6320;
            class162_sub1_197_.anIntArray6314 = anIntArray6314;
        }
        if (Class52.method412(i, (byte) -35, anInt6397)) {
            class162_sub1_197_.aClass337_6427 = class162_sub1_194_.aClass337_6427;
            ((Class337) class162_sub1_197_.aClass337_6427).aBoolean3927 = ((Class337) aClass337_6427).aBoolean3927;
            ((Class337) class162_sub1_197_.aClass337_6427).aBoolean3928 = true;
            ((Class337) class162_sub1_197_.aClass337_6427).anInterface18_Impl1_3935 = ((Class337) aClass337_6427).anInterface18_Impl1_3935;
        } else if (ByteStream.method2172(i, true, anInt6397))
            class162_sub1_197_.aClass337_6427 = aClass337_6427;
        else
            class162_sub1_197_.aClass337_6427 = null;
        if (!Class351.method3743((byte) 118, anInt6397, i))
            class162_sub1_197_.aShortArray6395 = aShortArray6395;
        else {
            if (class162_sub1_194_.aShortArray6395 != null && anInt6338 <= class162_sub1_194_.aShortArray6395.length)
                class162_sub1_197_.aShortArray6395 = class162_sub1_194_.aShortArray6395;
            else
                class162_sub1_197_.aShortArray6395 = class162_sub1_194_.aShortArray6395 = new short[anInt6338];
            for (int i_203_ = 0; (anInt6338 ^ 0xffffffff) < (i_203_ ^ 0xffffffff); i_203_++)
                class162_sub1_197_.aShortArray6395[i_203_] = aShortArray6395[i_203_];
        }
        if (Class282_Sub27.method3033(i, anInt6397, false)) {
            if (class162_sub1_194_.aByteArray6384 == null || ((anInt6338 ^ 0xffffffff) < (class162_sub1_194_.aByteArray6384.length ^ 0xffffffff)))
                class162_sub1_197_.aByteArray6384 = class162_sub1_194_.aByteArray6384 = new byte[anInt6338];
            else
                class162_sub1_197_.aByteArray6384 = class162_sub1_194_.aByteArray6384;
            for (int i_204_ = 0; anInt6338 > i_204_; i_204_++)
                class162_sub1_197_.aByteArray6384[i_204_] = aByteArray6384[i_204_];
        } else
            class162_sub1_197_.aByteArray6384 = aByteArray6384;
        if (Class79.method572(anInt6397, 55, i)) {
            class162_sub1_197_.aClass337_6373 = class162_sub1_194_.aClass337_6373;
            ((Class337) class162_sub1_197_.aClass337_6373).anInterface18_Impl1_3935 = ((Class337) aClass337_6373).anInterface18_Impl1_3935;
            ((Class337) class162_sub1_197_.aClass337_6373).aBoolean3927 = ((Class337) aClass337_6373).aBoolean3927;
            ((Class337) class162_sub1_197_.aClass337_6373).aBoolean3928 = true;
        } else if (Class230.method1835(i, anInt6397, 22926))
            class162_sub1_197_.aClass337_6373 = aClass337_6373;
        else
            class162_sub1_197_.aClass337_6373 = null;
        if (RSInterface2.method3766(-31, i, anInt6397)) {
            if (class162_sub1_194_.aShortArray6401 == null || anInt6402 > class162_sub1_194_.aShortArray6401.length) {
                int i_205_ = anInt6402;
                class162_sub1_197_.aShortArray6369 = class162_sub1_194_.aShortArray6369 = new short[i_205_];
                class162_sub1_197_.aShortArray6340 = class162_sub1_194_.aShortArray6340 = new short[i_205_];
                class162_sub1_197_.aShortArray6401 = class162_sub1_194_.aShortArray6401 = new short[i_205_];
            } else {
                class162_sub1_197_.aShortArray6369 = class162_sub1_194_.aShortArray6369;
                class162_sub1_197_.aShortArray6401 = class162_sub1_194_.aShortArray6401;
                class162_sub1_197_.aShortArray6340 = class162_sub1_194_.aShortArray6340;
            }
            if (aClass120_6347 == null) {
                class162_sub1_197_.aClass120_6347 = null;
                for (int i_206_ = 0; (i_206_ ^ 0xffffffff) > (anInt6402 ^ 0xffffffff); i_206_++) {
                    class162_sub1_197_.aShortArray6401[i_206_] = aShortArray6401[i_206_];
                    class162_sub1_197_.aShortArray6340[i_206_] = aShortArray6340[i_206_];
                    class162_sub1_197_.aShortArray6369[i_206_] = aShortArray6369[i_206_];
                }
            } else {
                if (class162_sub1_194_.aClass120_6347 == null)
                    class162_sub1_194_.aClass120_6347 = new Class120();
                Class120 class120 = (class162_sub1_197_.aClass120_6347 = class162_sub1_194_.aClass120_6347);
                if (((Class120) class120).aShortArray1505 == null || (((Class120) class120).aShortArray1505.length ^ 0xffffffff) > (anInt6402 ^ 0xffffffff)) {
                    int i_207_ = anInt6402;
                    ((Class120) class120).aShortArray1505 = new short[i_207_];
                    ((Class120) class120).aByteArray1506 = new byte[i_207_];
                    ((Class120) class120).aShortArray1507 = new short[i_207_];
                    ((Class120) class120).aShortArray1509 = new short[i_207_];
                }
                for (int i_208_ = 0; anInt6402 > i_208_; i_208_++) {
                    class162_sub1_197_.aShortArray6401[i_208_] = aShortArray6401[i_208_];
                    class162_sub1_197_.aShortArray6340[i_208_] = aShortArray6340[i_208_];
                    class162_sub1_197_.aShortArray6369[i_208_] = aShortArray6369[i_208_];
                    ((Class120) class120).aShortArray1505[i_208_] = ((Class120) aClass120_6347).aShortArray1505[i_208_];
                    ((Class120) class120).aShortArray1507[i_208_] = ((Class120) aClass120_6347).aShortArray1507[i_208_];
                    ((Class120) class120).aShortArray1509[i_208_] = ((Class120) aClass120_6347).aShortArray1509[i_208_];
                    ((Class120) class120).aByteArray1506[i_208_] = ((Class120) aClass120_6347).aByteArray1506[i_208_];
                }
            }
            class162_sub1_197_.aByteArray6341 = aByteArray6341;
        } else {
            class162_sub1_197_.aShortArray6340 = aShortArray6340;
            class162_sub1_197_.aShortArray6369 = aShortArray6369;
            class162_sub1_197_.aByteArray6341 = aByteArray6341;
            class162_sub1_197_.aClass120_6347 = aClass120_6347;
            class162_sub1_197_.aShortArray6401 = aShortArray6401;
        }
        if (Class229.method1832(anInt6397, i, (byte) 106)) {
            class162_sub1_197_.aClass337_6344 = class162_sub1_194_.aClass337_6344;
            ((Class337) class162_sub1_197_.aClass337_6344).anInterface18_Impl1_3935 = ((Class337) aClass337_6344).anInterface18_Impl1_3935;
            ((Class337) class162_sub1_197_.aClass337_6344).aBoolean3927 = ((Class337) aClass337_6344).aBoolean3927;
            ((Class337) class162_sub1_197_.aClass337_6344).aBoolean3928 = true;
        } else if (Class112_Sub2.method800(true, anInt6397, i))
            class162_sub1_197_.aClass337_6344 = aClass337_6344;
        else
            class162_sub1_197_.aClass337_6344 = null;
        if (i_195_ < 45)
            anIntArrayArray6404 = null;
        if (!Class36.method282(5, anInt6397, i)) {
            class162_sub1_197_.aFloatArray6420 = aFloatArray6420;
            class162_sub1_197_.aFloatArray6415 = aFloatArray6415;
        } else {
            if (class162_sub1_194_.aFloatArray6420 == null || anInt6338 > class162_sub1_194_.aFloatArray6420.length) {
                int i_209_ = anInt6402;
                class162_sub1_197_.aFloatArray6420 = class162_sub1_194_.aFloatArray6420 = new float[i_209_];
                class162_sub1_197_.aFloatArray6415 = class162_sub1_194_.aFloatArray6415 = new float[i_209_];
            } else {
                class162_sub1_197_.aFloatArray6415 = class162_sub1_194_.aFloatArray6415;
                class162_sub1_197_.aFloatArray6420 = class162_sub1_194_.aFloatArray6420;
            }
            for (int i_210_ = 0; (i_210_ ^ 0xffffffff) > (anInt6402 ^ 0xffffffff); i_210_++) {
                class162_sub1_197_.aFloatArray6420[i_210_] = aFloatArray6420[i_210_];
                class162_sub1_197_.aFloatArray6415[i_210_] = aFloatArray6415[i_210_];
            }
        }
        if (Class282_Sub20.method3005(i, 192, anInt6397)) {
            class162_sub1_197_.aClass337_6392 = class162_sub1_194_.aClass337_6392;
            ((Class337) class162_sub1_197_.aClass337_6392).aBoolean3927 = ((Class337) aClass337_6392).aBoolean3927;
            ((Class337) class162_sub1_197_.aClass337_6392).aBoolean3928 = true;
            ((Class337) class162_sub1_197_.aClass337_6392).anInterface18_Impl1_3935 = ((Class337) aClass337_6392).anInterface18_Impl1_3935;
        } else if (Class249_Sub2.method2703(anInt6397, i, 0))
            class162_sub1_197_.aClass337_6392 = aClass337_6392;
        else
            class162_sub1_197_.aClass337_6392 = null;
        if (!Class9.method196(16, anInt6397, i)) {
            class162_sub1_197_.aShortArray6400 = aShortArray6400;
            class162_sub1_197_.aShortArray6325 = aShortArray6325;
            class162_sub1_197_.aShortArray6386 = aShortArray6386;
        } else {
            if (class162_sub1_194_.aShortArray6386 == null || class162_sub1_194_.aShortArray6386.length < anInt6338) {
                int i_211_ = anInt6338;
                class162_sub1_197_.aShortArray6400 = class162_sub1_194_.aShortArray6400 = new short[i_211_];
                class162_sub1_197_.aShortArray6325 = class162_sub1_194_.aShortArray6325 = new short[i_211_];
                class162_sub1_197_.aShortArray6386 = class162_sub1_194_.aShortArray6386 = new short[i_211_];
            } else {
                class162_sub1_197_.aShortArray6386 = class162_sub1_194_.aShortArray6386;
                class162_sub1_197_.aShortArray6325 = class162_sub1_194_.aShortArray6325;
                class162_sub1_197_.aShortArray6400 = class162_sub1_194_.aShortArray6400;
            }
            for (int i_212_ = 0; anInt6338 > i_212_; i_212_++) {
                class162_sub1_197_.aShortArray6386[i_212_] = aShortArray6386[i_212_];
                class162_sub1_197_.aShortArray6325[i_212_] = aShortArray6325[i_212_];
                class162_sub1_197_.aShortArray6400[i_212_] = aShortArray6400[i_212_];
            }
        }
        if (Node_Sub14_Sub10.method2301(anInt6397, i, (byte) -74)) {
            class162_sub1_197_.aClass95_6375 = class162_sub1_194_.aClass95_6375;
            ((Class95) class162_sub1_197_.aClass95_6375).aBoolean1226 = true;
            ((Class95) class162_sub1_197_.aClass95_6375).aBoolean1228 = ((Class95) aClass95_6375).aBoolean1228;
            ((Class95) class162_sub1_197_.aClass95_6375).anInterface18_Impl2_1232 = ((Class95) aClass95_6375).anInterface18_Impl2_1232;
        } else if (!Class40.method298(i, anInt6397, 122))
            class162_sub1_197_.aClass95_6375 = null;
        else
            class162_sub1_197_.aClass95_6375 = aClass95_6375;
        if (!Class253_Sub1.method2727(i, false, anInt6397))
            class162_sub1_197_.aShortArray6416 = aShortArray6416;
        else {
            if (class162_sub1_194_.aShortArray6416 != null && class162_sub1_194_.aShortArray6416.length >= anInt6338)
                class162_sub1_197_.aShortArray6416 = class162_sub1_194_.aShortArray6416;
            else {
                int i_213_ = anInt6338;
                class162_sub1_197_.aShortArray6416 = class162_sub1_194_.aShortArray6416 = new short[i_213_];
            }
            for (int i_214_ = 0; anInt6338 > i_214_; i_214_++)
                class162_sub1_197_.aShortArray6416[i_214_] = aShortArray6416[i_214_];
        }
        if (!Class316.method3284(i, 28466, anInt6397))
            class162_sub1_197_.aClass284Array6361 = aClass284Array6361;
        else if (class162_sub1_194_.aClass284Array6361 != null && (class162_sub1_194_.aClass284Array6361.length ^ 0xffffffff) <= (anInt6403 ^ 0xffffffff)) {
            class162_sub1_197_.aClass284Array6361 = class162_sub1_194_.aClass284Array6361;
            for (int i_215_ = 0; i_215_ < anInt6403; i_215_++)
                class162_sub1_197_.aClass284Array6361[i_215_].method3062(aClass284Array6361[i_215_], 91);
        } else {
            int i_216_ = anInt6403;
            class162_sub1_197_.aClass284Array6361 = class162_sub1_194_.aClass284Array6361 = new Class284[i_216_];
            for (int i_217_ = 0; i_217_ < anInt6403; i_217_++)
                class162_sub1_197_.aClass284Array6361[i_217_] = aClass284Array6361[i_217_].method3064(24695);
        }
        class162_sub1_197_.anIntArray6426 = anIntArray6426;
        class162_sub1_197_.aShortArray6387 = aShortArray6387;
        class162_sub1_197_.anIntArray6318 = anIntArray6318;
        class162_sub1_197_.aClass124Array6385 = aClass124Array6385;
        class162_sub1_197_.aClass40Array6372 = aClass40Array6372;
        class162_sub1_197_.aShortArray6434 = aShortArray6434;
        class162_sub1_197_.anIntArrayArray6412 = anIntArrayArray6412;
        class162_sub1_197_.aShortArray6417 = aShortArray6417;
        class162_sub1_197_.aShortArray6354 = aShortArray6354;
        class162_sub1_197_.anIntArrayArray6404 = anIntArrayArray6404;
        class162_sub1_197_.aShortArray6342 = aShortArray6342;
        class162_sub1_197_.anIntArray6313 = anIntArray6313;
        class162_sub1_197_.anIntArrayArray6409 = anIntArrayArray6409;
        class162_sub1_197_.anIntArray6383 = anIntArray6383;
        if (aBoolean6408) {
            class162_sub1_197_.aBoolean6408 = true;
            class162_sub1_197_.anInt6428 = anInt6428;
            class162_sub1_197_.anInt6352 = anInt6352;
            class162_sub1_197_.anInt6407 = anInt6407;
            class162_sub1_197_.anInt6307 = anInt6307;
            class162_sub1_197_.anInt6421 = anInt6421;
            class162_sub1_197_.anInt6331 = anInt6331;
            class162_sub1_197_.anInt6309 = anInt6309;
            class162_sub1_197_.anInt6336 = anInt6336;
        } else
            class162_sub1_197_.aBoolean6408 = false;
        class162_sub1_197_.aClass132Array6330 = aClass132Array6330;
        return class162_sub1_197_;
    }

    final int EA() {
        anInt6326++;
        if (!aBoolean6408)
            method1454(-118);
        return anInt6352;
    }

    private final boolean method1451(int i) {
        anInt6368++;
        boolean bool = !((Class337) aClass337_6373).aBoolean3927;
        boolean bool_218_ = ((0x37 & anInt6397 ^ 0xffffffff) != -1 && !((Class337) aClass337_6344).aBoolean3927);
        boolean bool_219_ = !((Class337) aClass337_6427).aBoolean3927;
        boolean bool_220_ = !((Class337) aClass337_6392).aBoolean3927;
        if (!bool_219_ && !bool && !bool_218_ && !bool_220_)
            return true;
        boolean bool_221_ = true;
        if (i <= 106)
            return false;
        if (bool_219_) {
            if (((Class337) aClass337_6427).anInterface18_Impl1_3925 == null)
                ((Class337) aClass337_6427).anInterface18_Impl1_3925 = aHa_Sub3_6380.method1010(41, aBoolean6433);
            Interface18_Impl1 interface18_impl1 = ((Class337) aClass337_6427).anInterface18_Impl1_3925;
            interface18_impl1.method2(12, -30987, 12 * anInt6402);
            Buffer buffer = interface18_impl1.method1(-4448, true);
            if (buffer != null) {
                ((ha_Sub3) aHa_Sub3_6380).aNativeInterface5997.copyPositions(anIntArray6314, anIntArray6321, anIntArray6320, aShortArray6342, 0, 12, anInt6402, buffer.getAddress());
                if (!interface18_impl1.method4(-13472))
                    bool_221_ = false;
                else {
                    ((Class337) aClass337_6427).anInterface18_Impl1_3935 = interface18_impl1;
                    ((Class337) aClass337_6427).aBoolean3927 = true;
                }
            } else
                bool_221_ = false;
        }
        if (bool) {
            if (((Class337) aClass337_6373).anInterface18_Impl1_3925 == null)
                ((Class337) aClass337_6373).anInterface18_Impl1_3925 = aHa_Sub3_6380.method1010(53, aBoolean6433);
            Interface18_Impl1 interface18_impl1 = ((Class337) aClass337_6373).anInterface18_Impl1_3925;
            interface18_impl1.method2(4, -30987, anInt6402 * 4);
            Buffer buffer = interface18_impl1.method1(-4448, true);
            if (buffer != null) {
                if ((0x37 & anInt6397) == 0) {
                    short[] is;
                    short[] is_222_;
                    short[] is_223_;
                    byte[] is_224_;
                    if (aClass120_6347 != null) {
                        is_223_ = ((Class120) aClass120_6347).aShortArray1507;
                        is_224_ = ((Class120) aClass120_6347).aByteArray1506;
                        is_222_ = ((Class120) aClass120_6347).aShortArray1509;
                        is = ((Class120) aClass120_6347).aShortArray1505;
                    } else {
                        is = aShortArray6401;
                        is_222_ = aShortArray6369;
                        is_223_ = aShortArray6340;
                        is_224_ = aByteArray6341;
                    }
                    ((ha_Sub3) aHa_Sub3_6380).aNativeInterface5997.copyLighting(aShortArray6395, aByteArray6384, aShortArray6416, is, is_223_, is_222_, is_224_, aShort6436, aShort6328, aShortArray6387, 0, 4, anInt6402, buffer.getAddress());
                } else
                    ((ha_Sub3) aHa_Sub3_6380).aNativeInterface5997.copyColours(aShortArray6395, aByteArray6384, aShortArray6416, aShort6436, aShortArray6387, 0, 4, anInt6402, buffer.getAddress());
                if (!interface18_impl1.method4(-13472))
                    bool_221_ = false;
                else {
                    ((Class337) aClass337_6373).aBoolean3927 = true;
                    ((Class337) aClass337_6373).anInterface18_Impl1_3935 = interface18_impl1;
                }
            } else
                bool_221_ = false;
        }
        if (bool_218_) {
            if (((Class337) aClass337_6344).anInterface18_Impl1_3925 == null)
                ((Class337) aClass337_6344).anInterface18_Impl1_3925 = aHa_Sub3_6380.method1010(44, aBoolean6433);
            Interface18_Impl1 interface18_impl1 = ((Class337) aClass337_6344).anInterface18_Impl1_3925;
            interface18_impl1.method2(12, -30987, anInt6402 * 12);
            Buffer buffer = interface18_impl1.method1(-4448, true);
            if (buffer != null) {
                short[] is;
                short[] is_225_;
                short[] is_226_;
                byte[] is_227_;
                if (aClass120_6347 == null) {
                    is_226_ = aShortArray6369;
                    is_227_ = aByteArray6341;
                    is_225_ = aShortArray6401;
                    is = aShortArray6340;
                } else {
                    is = ((Class120) aClass120_6347).aShortArray1507;
                    is_225_ = ((Class120) aClass120_6347).aShortArray1505;
                    is_226_ = ((Class120) aClass120_6347).aShortArray1509;
                    is_227_ = ((Class120) aClass120_6347).aByteArray1506;
                }
                ((ha_Sub3) aHa_Sub3_6380).aNativeInterface5997.copyNormals(is_225_, is, is_226_, is_227_, 3.0F / (float) aShort6328, 3.0F / (float) (aShort6328 - -(aShort6328 / 2)), 0, 12, anInt6402, buffer.getAddress());
                if (!interface18_impl1.method4(-13472))
                    bool_221_ = false;
                else {
                    ((Class337) aClass337_6344).anInterface18_Impl1_3935 = interface18_impl1;
                    ((Class337) aClass337_6344).aBoolean3927 = true;
                }
            } else
                bool_221_ = false;
        }
        if (bool_220_) {
            if (((Class337) aClass337_6392).anInterface18_Impl1_3925 == null)
                ((Class337) aClass337_6392).anInterface18_Impl1_3925 = aHa_Sub3_6380.method1010(62, aBoolean6433);
            Interface18_Impl1 interface18_impl1 = ((Class337) aClass337_6392).anInterface18_Impl1_3925;
            interface18_impl1.method2(8, -30987, 8 * anInt6402);
            Buffer buffer = interface18_impl1.method1(-4448, true);
            if (buffer != null) {
                ((ha_Sub3) aHa_Sub3_6380).aNativeInterface5997.copyTexCoords(aFloatArray6420, aFloatArray6415, 0, 8, anInt6402, buffer.getAddress());
                if (!interface18_impl1.method4(-13472))
                    bool_221_ = false;
                else {
                    ((Class337) aClass337_6392).anInterface18_Impl1_3935 = interface18_impl1;
                    ((Class337) aClass337_6392).aBoolean3927 = true;
                }
            } else
                bool_221_ = false;
        }
        return bool_221_;
    }

    final int WA() {
        anInt6359++;
        return aShort6436;
    }

    final void method1427() {
        anInt6335++;
    }

    final void method1438(int i, int[] is, int i_228_, int i_229_, int i_230_, int i_231_, boolean bool) {
        anInt6422++;
        int i_232_ = is.length;
        if (i == 0) {
            i_228_ <<= 4;
            i_229_ <<= 4;
            i_230_ <<= 4;
            int i_233_ = 0;
            Class110.anInt1384 = 0;
            Class297.anInt5009 = 0;
            ha_Sub3_Sub1.anInt8683 = 0;
            for (int i_234_ = 0; i_232_ > i_234_; i_234_++) {
                int i_235_ = is[i_234_];
                if (anIntArrayArray6412.length > i_235_) {
                    int[] is_236_ = anIntArrayArray6412[i_235_];
                    for (int i_237_ = 0; i_237_ < is_236_.length; i_237_++) {
                        int i_238_ = is_236_[i_237_];
                        Class110.anInt1384 += anIntArray6314[i_238_];
                        ha_Sub3_Sub1.anInt8683 += anIntArray6321[i_238_];
                        i_233_++;
                        Class297.anInt5009 += anIntArray6320[i_238_];
                    }
                }
            }
            if (i_233_ > 0) {
                ha_Sub3_Sub1.anInt8683 = i_229_ + ha_Sub3_Sub1.anInt8683 / i_233_;
                Class110.anInt1384 = Class110.anInt1384 / i_233_ - -i_228_;
                Class297.anInt5009 = Class297.anInt5009 / i_233_ + i_230_;
            } else {
                Class110.anInt1384 = i_228_;
                Class297.anInt5009 = i_230_;
                ha_Sub3_Sub1.anInt8683 = i_229_;
            }
        } else if (i == 1) {
            i_230_ <<= 4;
            i_229_ <<= 4;
            i_228_ <<= 4;
            for (int i_239_ = 0; i_239_ < i_232_; i_239_++) {
                int i_240_ = is[i_239_];
                if ((i_240_ ^ 0xffffffff) > (anIntArrayArray6412.length ^ 0xffffffff)) {
                    int[] is_241_ = anIntArrayArray6412[i_240_];
                    for (int i_242_ = 0; (i_242_ ^ 0xffffffff) > (is_241_.length ^ 0xffffffff); i_242_++) {
                        int i_243_ = is_241_[i_242_];
                        anIntArray6314[i_243_] += i_228_;
                        anIntArray6321[i_243_] += i_229_;
                        anIntArray6320[i_243_] += i_230_;
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -3) {
            for (int i_244_ = 0; (i_244_ ^ 0xffffffff) > (i_232_ ^ 0xffffffff); i_244_++) {
                int i_245_ = is[i_244_];
                if ((anIntArrayArray6412.length ^ 0xffffffff) < (i_245_ ^ 0xffffffff)) {
                    int[] is_246_ = anIntArrayArray6412[i_245_];
                    if ((i_231_ & 0x1 ^ 0xffffffff) == -1) {
                        for (int i_247_ = 0; i_247_ < is_246_.length; i_247_++) {
                            int i_248_ = is_246_[i_247_];
                            anIntArray6314[i_248_] -= Class110.anInt1384;
                            anIntArray6321[i_248_] -= ha_Sub3_Sub1.anInt8683;
                            anIntArray6320[i_248_] -= Class297.anInt5009;
                            if (i_230_ != 0) {
                                int i_249_ = (Node_Sub9_Sub1.anIntArray9106[i_230_]);
                                int i_250_ = (Node_Sub9_Sub1.anIntArray9109[i_230_]);
                                int i_251_ = (16383 + (anIntArray6321[i_248_] * i_249_ - -(i_250_ * anIntArray6314[i_248_])) >> -1666054450);
                                anIntArray6321[i_248_] = ((16383 + -(i_249_ * anIntArray6314[i_248_]) + anIntArray6321[i_248_] * i_250_) >> -1179311794);
                                anIntArray6314[i_248_] = i_251_;
                            }
                            if (i_228_ != 0) {
                                int i_252_ = (Node_Sub9_Sub1.anIntArray9106[i_228_]);
                                int i_253_ = (Node_Sub9_Sub1.anIntArray9109[i_228_]);
                                int i_254_ = ((-(i_252_ * anIntArray6320[i_248_]) + (i_253_ * anIntArray6321[i_248_] - -16383)) >> -1674107282);
                                anIntArray6320[i_248_] = ((16383 + anIntArray6320[i_248_] * i_253_ + i_252_ * anIntArray6321[i_248_]) >> 758045294);
                                anIntArray6321[i_248_] = i_254_;
                            }
                            if (i_229_ != 0) {
                                int i_255_ = (Node_Sub9_Sub1.anIntArray9106[i_229_]);
                                int i_256_ = (Node_Sub9_Sub1.anIntArray9109[i_229_]);
                                int i_257_ = ((16383 + i_255_ * anIntArray6320[i_248_] + i_256_ * anIntArray6314[i_248_]) >> -794078450);
                                anIntArray6320[i_248_] = (-(i_255_ * anIntArray6314[i_248_]) + (i_256_ * anIntArray6320[i_248_] + 16383)) >> -1584025522;
                                anIntArray6314[i_248_] = i_257_;
                            }
                            anIntArray6314[i_248_] += Class110.anInt1384;
                            anIntArray6321[i_248_] += ha_Sub3_Sub1.anInt8683;
                            anIntArray6320[i_248_] += Class297.anInt5009;
                        }
                    } else {
                        for (int i_258_ = 0; is_246_.length > i_258_; i_258_++) {
                            int i_259_ = is_246_[i_258_];
                            anIntArray6314[i_259_] -= Class110.anInt1384;
                            anIntArray6321[i_259_] -= ha_Sub3_Sub1.anInt8683;
                            anIntArray6320[i_259_] -= Class297.anInt5009;
                            if ((i_228_ ^ 0xffffffff) != -1) {
                                int i_260_ = (Node_Sub9_Sub1.anIntArray9106[i_228_]);
                                int i_261_ = (Node_Sub9_Sub1.anIntArray9109[i_228_]);
                                int i_262_ = ((16383 + (-(anIntArray6320[i_259_] * i_260_) + anIntArray6321[i_259_] * i_261_)) >> -163580754);
                                anIntArray6320[i_259_] = ((16383 + (anIntArray6320[i_259_] * i_261_ + i_260_ * anIntArray6321[i_259_])) >> -1480849682);
                                anIntArray6321[i_259_] = i_262_;
                            }
                            if (i_230_ != 0) {
                                int i_263_ = (Node_Sub9_Sub1.anIntArray9106[i_230_]);
                                int i_264_ = (Node_Sub9_Sub1.anIntArray9109[i_230_]);
                                int i_265_ = ((anIntArray6321[i_259_] * i_263_ + (anIntArray6314[i_259_] * i_264_ + 16383)) >> -675070002);
                                anIntArray6321[i_259_] = ((16383 + (-(anIntArray6314[i_259_] * i_263_) + i_264_ * anIntArray6321[i_259_])) >> 1919252686);
                                anIntArray6314[i_259_] = i_265_;
                            }
                            if ((i_229_ ^ 0xffffffff) != -1) {
                                int i_266_ = (Node_Sub9_Sub1.anIntArray9106[i_229_]);
                                int i_267_ = (Node_Sub9_Sub1.anIntArray9109[i_229_]);
                                int i_268_ = ((anIntArray6320[i_259_] * i_266_ - -(anIntArray6314[i_259_] * i_267_) + 16383) >> 1753028334);
                                anIntArray6320[i_259_] = ((16383 + (-(anIntArray6314[i_259_] * i_266_) + i_267_ * anIntArray6320[i_259_])) >> -713795122);
                                anIntArray6314[i_259_] = i_268_;
                            }
                            anIntArray6314[i_259_] += Class110.anInt1384;
                            anIntArray6321[i_259_] += ha_Sub3_Sub1.anInt8683;
                            anIntArray6320[i_259_] += Class297.anInt5009;
                        }
                    }
                }
            }
            if (bool) {
                for (int i_269_ = 0; (i_269_ ^ 0xffffffff) > (i_232_ ^ 0xffffffff); i_269_++) {
                    int i_270_ = is[i_269_];
                    if ((anIntArrayArray6412.length ^ 0xffffffff) < (i_270_ ^ 0xffffffff)) {
                        int[] is_271_ = anIntArrayArray6412[i_270_];
                        for (int i_272_ = 0; is_271_.length > i_272_; i_272_++) {
                            int i_273_ = is_271_[i_272_];
                            int i_274_ = anIntArray6313[i_273_];
                            int i_275_ = anIntArray6313[1 + i_273_];
                            for (int i_276_ = i_274_; i_275_ > i_276_; i_276_++) {
                                int i_277_ = aShortArray6434[i_276_] + -1;
                                if (i_277_ == -1)
                                    break;
                                if ((i_230_ ^ 0xffffffff) != -1) {
                                    int i_278_ = (Node_Sub9_Sub1.anIntArray9106[i_230_]);
                                    int i_279_ = (Node_Sub9_Sub1.anIntArray9109[i_230_]);
                                    int i_280_ = ((16383 + (i_279_ * aShortArray6401[i_277_] + (i_278_ * aShortArray6340[i_277_]))) >> -2053547218);
                                    aShortArray6340[i_277_] = (short) ((-(i_278_ * (aShortArray6401[i_277_])) + (aShortArray6340[i_277_] * i_279_) - -16383) >> 537000366);
                                    aShortArray6401[i_277_] = (short) i_280_;
                                }
                                if ((i_228_ ^ 0xffffffff) != -1) {
                                    int i_281_ = (Node_Sub9_Sub1.anIntArray9106[i_228_]);
                                    int i_282_ = (Node_Sub9_Sub1.anIntArray9109[i_228_]);
                                    int i_283_ = ((-(aShortArray6369[i_277_] * i_281_) + aShortArray6340[i_277_] * i_282_ - -16383) >> 1683968174);
                                    aShortArray6369[i_277_] = (short) ((16383 + (aShortArray6340[i_277_] * i_281_) + i_282_ * (aShortArray6369[i_277_])) >> -1582629746);
                                    aShortArray6340[i_277_] = (short) i_283_;
                                }
                                if (i_229_ != 0) {
                                    int i_284_ = (Node_Sub9_Sub1.anIntArray9106[i_229_]);
                                    int i_285_ = (Node_Sub9_Sub1.anIntArray9109[i_229_]);
                                    int i_286_ = ((16383 + aShortArray6369[i_277_] * i_284_ - -(aShortArray6401[i_277_] * i_285_)) >> -771744050);
                                    aShortArray6369[i_277_] = (short) ((-(aShortArray6401[i_277_] * i_284_) + ((i_285_ * (aShortArray6369[i_277_])) + 16383)) >> -333307634);
                                    aShortArray6401[i_277_] = (short) i_286_;
                                }
                            }
                        }
                    }
                }
                method1447(0);
            }
        } else if ((i ^ 0xffffffff) == -4) {
            for (int i_287_ = 0; (i_287_ ^ 0xffffffff) > (i_232_ ^ 0xffffffff); i_287_++) {
                int i_288_ = is[i_287_];
                if ((i_288_ ^ 0xffffffff) > (anIntArrayArray6412.length ^ 0xffffffff)) {
                    int[] is_289_ = anIntArrayArray6412[i_288_];
                    for (int i_290_ = 0; is_289_.length > i_290_; i_290_++) {
                        int i_291_ = is_289_[i_290_];
                        anIntArray6314[i_291_] -= Class110.anInt1384;
                        anIntArray6321[i_291_] -= ha_Sub3_Sub1.anInt8683;
                        anIntArray6320[i_291_] -= Class297.anInt5009;
                        anIntArray6314[i_291_] = anIntArray6314[i_291_] * i_228_ >> 131341127;
                        anIntArray6321[i_291_] = i_229_ * anIntArray6321[i_291_] >> -2130421945;
                        anIntArray6320[i_291_] = i_230_ * anIntArray6320[i_291_] >> -475671545;
                        anIntArray6314[i_291_] += Class110.anInt1384;
                        anIntArray6321[i_291_] += ha_Sub3_Sub1.anInt8683;
                        anIntArray6320[i_291_] += Class297.anInt5009;
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -6) {
            if (anIntArrayArray6404 != null) {
                boolean bool_292_ = false;
                for (int i_293_ = 0; i_293_ < i_232_; i_293_++) {
                    int i_294_ = is[i_293_];
                    if ((anIntArrayArray6404.length ^ 0xffffffff) < (i_294_ ^ 0xffffffff)) {
                        int[] is_295_ = anIntArrayArray6404[i_294_];
                        for (int i_296_ = 0; ((i_296_ ^ 0xffffffff) > (is_295_.length ^ 0xffffffff)); i_296_++) {
                            int i_297_ = is_295_[i_296_];
                            int i_298_ = 8 * i_228_ + (0xff & aByteArray6384[i_297_]);
                            if (i_298_ >= 0) {
                                if (i_298_ > 255)
                                    i_298_ = 255;
                            } else
                                i_298_ = 0;
                            aByteArray6384[i_297_] = (byte) i_298_;
                        }
                        bool_292_ = bool_292_ | (is_295_.length ^ 0xffffffff) < -1;
                    }
                }
                if (bool_292_) {
                    if (aClass132Array6330 != null) {
                        for (int i_299_ = 0; (i_299_ ^ 0xffffffff) > (anInt6403 ^ 0xffffffff); i_299_++) {
                            Class132 class132 = aClass132Array6330[i_299_];
                            Class284 class284 = aClass284Array6361[i_299_];
                            ((Class284) class284).anInt3355 = (((Class284) class284).anInt3355 & 0xffffff | -((aByteArray6384[((Class132) class132).anInt1619]) & 0xff) + 255 << -1366533864);
                        }
                    }
                    method1448(-5565);
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray6404 != null) {
                boolean bool_300_ = false;
                for (int i_301_ = 0; (i_232_ ^ 0xffffffff) < (i_301_ ^ 0xffffffff); i_301_++) {
                    int i_302_ = is[i_301_];
                    if ((anIntArrayArray6404.length ^ 0xffffffff) < (i_302_ ^ 0xffffffff)) {
                        int[] is_303_ = anIntArrayArray6404[i_302_];
                        for (int i_304_ = 0; i_304_ < is_303_.length; i_304_++) {
                            int i_305_ = is_303_[i_304_];
                            int i_306_ = aShortArray6395[i_305_] & 0xffff;
                            int i_307_ = 0x3f & i_306_ >> -1638261782;
                            int i_308_ = i_306_ >> -551542521 & 0x7;
                            i_308_ += i_229_ / 4;
                            int i_309_ = 0x7f & i_306_;
                            i_307_ = 0x3f & i_307_ - -i_228_;
                            i_309_ += i_230_;
                            if (i_308_ >= 0) {
                                if ((i_308_ ^ 0xffffffff) < -8)
                                    i_308_ = 7;
                            } else
                                i_308_ = 0;
                            if (i_309_ < 0)
                                i_309_ = 0;
                            else if ((i_309_ ^ 0xffffffff) < -128)
                                i_309_ = 127;
                            aShortArray6395[i_305_] = (short) (Class358.retrieveLooksSettings((Class358.retrieveLooksSettings(i_307_ << 1525981322, i_308_ << 155046023)), i_309_));
                        }
                        bool_300_ = bool_300_ | (is_303_.length ^ 0xffffffff) < -1;
                    }
                }
                if (bool_300_) {
                    if (aClass132Array6330 != null) {
                        for (int i_310_ = 0; (anInt6403 ^ 0xffffffff) < (i_310_ ^ 0xffffffff); i_310_++) {
                            Class132 class132 = aClass132Array6330[i_310_];
                            Class284 class284 = aClass284Array6361[i_310_];
                            ((Class284) class284).anInt3355 = (((Node_Sub14_Sub39.anIntArray9600[aShortArray6395[(((Class132) class132).anInt1619)] & 0xffff]) & 0xffffff) | (((Class284) class284).anInt3355 & ~0xffffff));
                        }
                    }
                    method1448(-5565);
                }
            }
        } else if ((i ^ 0xffffffff) == -9) {
            if (anIntArrayArray6409 != null) {
                for (int i_311_ = 0; i_311_ < i_232_; i_311_++) {
                    int i_312_ = is[i_311_];
                    if (anIntArrayArray6409.length > i_312_) {
                        int[] is_313_ = anIntArrayArray6409[i_312_];
                        for (int i_314_ = 0; i_314_ < is_313_.length; i_314_++) {
                            Class284 class284 = aClass284Array6361[is_313_[i_314_]];
                            ((Class284) class284).anInt3349 += i_229_;
                            ((Class284) class284).anInt3354 += i_228_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray6409 != null) {
                for (int i_315_ = 0; (i_315_ ^ 0xffffffff) > (i_232_ ^ 0xffffffff); i_315_++) {
                    int i_316_ = is[i_315_];
                    if ((anIntArrayArray6409.length ^ 0xffffffff) < (i_316_ ^ 0xffffffff)) {
                        int[] is_317_ = anIntArrayArray6409[i_316_];
                        for (int i_318_ = 0; ((is_317_.length ^ 0xffffffff) < (i_318_ ^ 0xffffffff)); i_318_++) {
                            Class284 class284 = aClass284Array6361[is_317_[i_318_]];
                            ((Class284) class284).anInt3350 = (((Class284) class284).anInt3350 * i_229_ >> 802049703);
                            ((Class284) class284).anInt3351 = (i_228_ * ((Class284) class284).anInt3351 >> -40827417);
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray6409 != null) {
            for (int i_319_ = 0; i_232_ > i_319_; i_319_++) {
                int i_320_ = is[i_319_];
                if ((anIntArrayArray6409.length ^ 0xffffffff) < (i_320_ ^ 0xffffffff)) {
                    int[] is_321_ = anIntArrayArray6409[i_320_];
                    for (int i_322_ = 0; is_321_.length > i_322_; i_322_++) {
                        Class284 class284 = aClass284Array6361[is_321_[i_322_]];
                        ((Class284) class284).anInt3352 = (0x3fff & i_228_ + ((Class284) class284).anInt3352);
                    }
                }
            }
        }
    }

    private final boolean method1452(boolean bool, int i, boolean bool_323_, int i_324_, int i_325_, Viewport viewport, int i_326_) {
        anInt6337++;
        Class238_Sub2 class238_sub2 = (Class238_Sub2) viewport;
        Class238_Sub2 class238_sub2_327_ = ((ha_Sub3) aHa_Sub3_6380).aClass238_Sub2_6147;
        float f = ((((Class238_Sub2) class238_sub2_327_).aFloat6726 * ((Class238_Sub2) class238_sub2).aFloat6706) + ((((Class238_Sub2) class238_sub2).aFloat6715 * ((Class238_Sub2) class238_sub2_327_).aFloat6750) + (((Class238_Sub2) class238_sub2_327_).aFloat6711 * ((Class238_Sub2) class238_sub2).aFloat6733)) + ((Class238_Sub2) class238_sub2_327_).aFloat6733);
        float f_328_ = (((Class238_Sub2) class238_sub2_327_).aFloat6715 + ((((Class238_Sub2) class238_sub2).aFloat6706 * ((Class238_Sub2) class238_sub2_327_).aFloat6724) + ((((Class238_Sub2) class238_sub2_327_).aFloat6713 * ((Class238_Sub2) class238_sub2).aFloat6733) + (((Class238_Sub2) class238_sub2_327_).aFloat6737 * ((Class238_Sub2) class238_sub2).aFloat6715))));
        Class206.aFloat4976 = ((((Class238_Sub2) class238_sub2_327_).aFloat6724 * ((Class238_Sub2) class238_sub2).aFloat6754) + ((((Class238_Sub2) class238_sub2_327_).aFloat6713 * ((Class238_Sub2) class238_sub2).aFloat6726) + (((Class238_Sub2) class238_sub2).aFloat6724 * ((Class238_Sub2) class238_sub2_327_).aFloat6737)));
        Node_Sub8_Sub17.aFloat9057 = ((((Class238_Sub2) class238_sub2).aFloat6744 * ((Class238_Sub2) class238_sub2_327_).aFloat6754) + ((((Class238_Sub2) class238_sub2).aFloat6750 * ((Class238_Sub2) class238_sub2_327_).aFloat6728) + (((Class238_Sub2) class238_sub2).aFloat6737 * ((Class238_Sub2) class238_sub2_327_).aFloat6744)));
        Class95.aFloat1236 = ((((Class238_Sub2) class238_sub2).aFloat6726 * ((Class238_Sub2) class238_sub2_327_).aFloat6728) + (((Class238_Sub2) class238_sub2).aFloat6724 * ((Class238_Sub2) class238_sub2_327_).aFloat6744) + (((Class238_Sub2) class238_sub2_327_).aFloat6754 * ((Class238_Sub2) class238_sub2).aFloat6754));
        Node_Sub23.aFloat7093 = ((((Class238_Sub2) class238_sub2).aFloat6728 * ((Class238_Sub2) class238_sub2_327_).aFloat6726) + ((((Class238_Sub2) class238_sub2).aFloat6713 * ((Class238_Sub2) class238_sub2_327_).aFloat6750) + (((Class238_Sub2) class238_sub2).aFloat6711 * ((Class238_Sub2) class238_sub2_327_).aFloat6711)));
        Class102.aFloat1304 = ((((Class238_Sub2) class238_sub2_327_).aFloat6711 * ((Class238_Sub2) class238_sub2).aFloat6726) + (((Class238_Sub2) class238_sub2).aFloat6724 * ((Class238_Sub2) class238_sub2_327_).aFloat6750) + (((Class238_Sub2) class238_sub2).aFloat6754 * ((Class238_Sub2) class238_sub2_327_).aFloat6726));
        Node_Sub2_Sub3.aFloat8862 = ((((Class238_Sub2) class238_sub2_327_).aFloat6713 * ((Class238_Sub2) class238_sub2).aFloat6711) + (((Class238_Sub2) class238_sub2).aFloat6713 * ((Class238_Sub2) class238_sub2_327_).aFloat6737) + (((Class238_Sub2) class238_sub2).aFloat6728 * ((Class238_Sub2) class238_sub2_327_).aFloat6724));
        Class136_Sub2.aFloat8395 = ((((Class238_Sub2) class238_sub2).aFloat6713 * ((Class238_Sub2) class238_sub2_327_).aFloat6744) + (((Class238_Sub2) class238_sub2).aFloat6711 * ((Class238_Sub2) class238_sub2_327_).aFloat6728) + (((Class238_Sub2) class238_sub2).aFloat6728 * ((Class238_Sub2) class238_sub2_327_).aFloat6754));
        Class132.aFloat1622 = ((((Class238_Sub2) class238_sub2_327_).aFloat6750 * ((Class238_Sub2) class238_sub2).aFloat6737) + (((Class238_Sub2) class238_sub2).aFloat6750 * ((Class238_Sub2) class238_sub2_327_).aFloat6711) + (((Class238_Sub2) class238_sub2).aFloat6744 * ((Class238_Sub2) class238_sub2_327_).aFloat6726));
        float f_329_ = ((((Class238_Sub2) class238_sub2).aFloat6706 * ((Class238_Sub2) class238_sub2_327_).aFloat6754) + ((((Class238_Sub2) class238_sub2).aFloat6715 * ((Class238_Sub2) class238_sub2_327_).aFloat6744) + (((Class238_Sub2) class238_sub2).aFloat6733 * ((Class238_Sub2) class238_sub2_327_).aFloat6728)) + ((Class238_Sub2) class238_sub2_327_).aFloat6706);
        Class340.aFloat3967 = ((((Class238_Sub2) class238_sub2).aFloat6750 * ((Class238_Sub2) class238_sub2_327_).aFloat6713) + (((Class238_Sub2) class238_sub2_327_).aFloat6737 * ((Class238_Sub2) class238_sub2).aFloat6737) + (((Class238_Sub2) class238_sub2_327_).aFloat6724 * ((Class238_Sub2) class238_sub2).aFloat6744));
        boolean bool_330_ = false;
        float f_331_ = 3.4028235E38F;
        float f_332_ = -3.4028235E38F;
        float f_333_ = 3.4028235E38F;
        float f_334_ = -3.4028235E38F;
        int i_335_ = ((ha_Sub3) aHa_Sub3_6380).anInt6196;
        int i_336_ = ((ha_Sub3) aHa_Sub3_6380).anInt6243;
        if (!aBoolean6408)
            method1454(74);
        int i_337_ = anInt6421 - anInt6428 >> -1804192223;
        int i_338_ = -anInt6407 + anInt6352 >> -1707502143;
        int i_339_ = -anInt6309 + anInt6336 >> -448669919;
        if (bool != true)
            anIntArray6318 = null;
        int i_340_ = i_337_ + anInt6428;
        int i_341_ = i_338_ + anInt6407;
        int i_342_ = i_339_ + anInt6309;
        int i_343_ = -(i_337_ << i_324_) + i_340_;
        int i_344_ = -(i_338_ << i_324_) + i_341_;
        int i_345_ = i_342_ + -(i_339_ << i_324_);
        int i_346_ = i_340_ - -(i_337_ << i_324_);
        int i_347_ = i_341_ - -(i_338_ << i_324_);
        int i_348_ = i_342_ + (i_339_ << i_324_);
        Class346.anIntArray4122[0] = i_343_;
        Node_Sub14_Sub12.anIntArray9279[0] = i_344_;
        Node_Sub29.anIntArray7169[0] = i_345_;
        Class346.anIntArray4122[1] = i_346_;
        Node_Sub14_Sub12.anIntArray9279[1] = i_344_;
        Node_Sub29.anIntArray7169[1] = i_345_;
        Class346.anIntArray4122[2] = i_343_;
        Node_Sub14_Sub12.anIntArray9279[2] = i_347_;
        Node_Sub29.anIntArray7169[2] = i_345_;
        Class346.anIntArray4122[3] = i_346_;
        Node_Sub14_Sub12.anIntArray9279[3] = i_347_;
        Node_Sub29.anIntArray7169[3] = i_345_;
        Class346.anIntArray4122[4] = i_343_;
        Node_Sub14_Sub12.anIntArray9279[4] = i_344_;
        Node_Sub29.anIntArray7169[4] = i_348_;
        Class346.anIntArray4122[5] = i_346_;
        Node_Sub14_Sub12.anIntArray9279[5] = i_344_;
        Node_Sub29.anIntArray7169[5] = i_348_;
        Class346.anIntArray4122[6] = i_343_;
        Node_Sub14_Sub12.anIntArray9279[6] = i_347_;
        Class346.anIntArray4122[7] = i_346_;
        Node_Sub29.anIntArray7169[6] = i_348_;
        Node_Sub14_Sub12.anIntArray9279[7] = i_347_;
        Node_Sub29.anIntArray7169[7] = i_348_;
        for (int i_349_ = 0; i_349_ < 8; i_349_++) {
            float f_350_ = (float) Class346.anIntArray4122[i_349_];
            float f_351_ = (float) Node_Sub14_Sub12.anIntArray9279[i_349_];
            float f_352_ = (float) Node_Sub29.anIntArray7169[i_349_];
            float f_353_ = f + (f_351_ * Class132.aFloat1622 + f_350_ * Node_Sub23.aFloat7093 + f_352_ * Class102.aFloat1304);
            float f_354_ = f_328_ + (f_351_ * Class340.aFloat3967 + Node_Sub2_Sub3.aFloat8862 * f_350_ + f_352_ * Class206.aFloat4976);
            float f_355_ = f_329_ + (Class95.aFloat1236 * f_352_ + (f_351_ * Node_Sub8_Sub17.aFloat9057 + f_350_ * Class136_Sub2.aFloat8395));
            if (f_355_ >= (float) ((ha_Sub3) aHa_Sub3_6380).anInt6173) {
                if (i_325_ > 0)
                    f_355_ = (float) i_325_;
                float f_356_ = (f_353_ * (float) i_335_ / f_355_ + (float) ((ha_Sub3) aHa_Sub3_6380).anInt6246);
                if (f_356_ < f_331_)
                    f_331_ = f_356_;
                float f_357_ = ((float) i_336_ * f_354_ / f_355_ + (float) ((ha_Sub3) aHa_Sub3_6380).anInt6166);
                if (f_356_ > f_332_)
                    f_332_ = f_356_;
                if (f_333_ > f_357_)
                    f_333_ = f_357_;
                if (f_357_ > f_334_)
                    f_334_ = f_357_;
                bool_330_ = true;
            }
        }
        if (bool_330_ && f_331_ < (float) i_326_ && f_332_ > (float) i_326_ && f_333_ < (float) i && f_334_ > (float) i) {
            if (bool_323_)
                return true;
            if ((Class161.anIntArray1892.length ^ 0xffffffff) > (anInt6402 ^ 0xffffffff)) {
                Class326.anIntArray4819 = new int[anInt6402];
                Class161.anIntArray1892 = new int[anInt6402];
            }
            for (int i_358_ = 0; anInt6366 > i_358_; i_358_++) {
                float f_359_ = (float) anIntArray6314[i_358_];
                float f_360_ = (float) anIntArray6320[i_358_];
                float f_361_ = (float) anIntArray6321[i_358_];
                float f_362_ = (f_359_ * Class136_Sub2.aFloat8395 + f_361_ * Node_Sub8_Sub17.aFloat9057 + f_360_ * Class95.aFloat1236 + f_329_);
                float f_363_ = f + (Node_Sub23.aFloat7093 * f_359_ + Class132.aFloat1622 * f_361_ + f_360_ * Class102.aFloat1304);
                float f_364_ = (f_360_ * Class206.aFloat4976 + (Node_Sub2_Sub3.aFloat8862 * f_359_ + Class340.aFloat3967 * f_361_) + f_328_);
                if (f_362_ >= (float) ((ha_Sub3) aHa_Sub3_6380).anInt6173) {
                    if (i_325_ > 0)
                        f_362_ = (float) i_325_;
                    int i_365_ = (int) ((float) ((ha_Sub3) aHa_Sub3_6380).anInt6246 + (float) i_335_ * f_363_ / f_362_);
                    int i_366_ = (int) ((float) ((ha_Sub3) aHa_Sub3_6380).anInt6166 + (float) i_336_ * f_364_ / f_362_);
                    int i_367_ = anIntArray6313[i_358_];
                    int i_368_ = anIntArray6313[1 + i_358_];
                    for (int i_369_ = i_367_; i_368_ > i_369_; i_369_++) {
                        int i_370_ = -1 + aShortArray6434[i_369_];
                        if (i_370_ == -1)
                            break;
                        Class161.anIntArray1892[i_370_] = i_365_;
                        Class326.anIntArray4819[i_370_] = i_366_;
                    }
                } else {
                    int i_371_ = anIntArray6313[i_358_];
                    int i_372_ = anIntArray6313[1 + i_358_];
                    for (int i_373_ = i_371_; (i_372_ ^ 0xffffffff) < (i_373_ ^ 0xffffffff); i_373_++) {
                        int i_374_ = -1 + aShortArray6434[i_373_];
                        if (i_374_ == -1)
                            break;
                        Class161.anIntArray1892[-1 + aShortArray6434[i_373_]] = -999999;
                    }
                }
            }
            for (int i_375_ = 0; (i_375_ ^ 0xffffffff) > (anInt6338 ^ 0xffffffff); i_375_++) {
                if ((Class161.anIntArray1892[aShortArray6386[i_375_]] ^ 0xffffffff) != 999998 && (Class161.anIntArray1892[aShortArray6325[i_375_]] ^ 0xffffffff) != 999998 && (Class161.anIntArray1892[aShortArray6400[i_375_]] != -999999) && (method1453(Class161.anIntArray1892[aShortArray6400[i_375_]], Class326.anIntArray4819[aShortArray6325[i_375_]], Class326.anIntArray4819[aShortArray6400[i_375_]], Class326.anIntArray4819[aShortArray6386[i_375_]], Class161.anIntArray1892[aShortArray6325[i_375_]], Class161.anIntArray1892[aShortArray6386[i_375_]], i, (byte) -124, i_326_)))
                    return true;
            }
        }
        return false;
    }

    final void LA(int i) {
        aShort6328 = (short) i;
        anInt6349++;
        method1464(124);
        method1447(0);
    }

    private final boolean method1453(int i, int i_376_, int i_377_, int i_378_, int i_379_, int i_380_, int i_381_, byte i_382_, int i_383_) {
        anInt6348++;
        if (i_381_ < i_378_ && i_381_ < i_376_ && (i_381_ ^ 0xffffffff) > (i_377_ ^ 0xffffffff))
            return false;
        if (i_382_ > -123)
            anIntArray6313 = null;
        if ((i_381_ ^ 0xffffffff) < (i_378_ ^ 0xffffffff) && i_376_ < i_381_ && (i_381_ ^ 0xffffffff) < (i_377_ ^ 0xffffffff))
            return false;
        if ((i_383_ ^ 0xffffffff) > (i_380_ ^ 0xffffffff) && (i_383_ ^ 0xffffffff) > (i_379_ ^ 0xffffffff) && (i_383_ ^ 0xffffffff) > (i ^ 0xffffffff))
            return false;
        if (i_380_ < i_383_ && (i_379_ ^ 0xffffffff) > (i_383_ ^ 0xffffffff) && i_383_ > i)
            return false;
        return true;
    }

    final boolean method1437(int i, int i_384_, Viewport viewport, boolean bool, int i_385_) {
        anInt6406++;
        return method1452(true, i_384_, bool, i_385_, -1, viewport, i);
    }

    final void a(int i) {
        anInt6355++;
        int i_386_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_387_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_388_ = 0; anInt6366 > i_388_; i_388_++) {
            int i_389_ = ((i_387_ * anIntArray6314[i_388_] + anIntArray6320[i_388_] * i_386_) >> 518149550);
            anIntArray6320[i_388_] = (-(anIntArray6314[i_388_] * i_386_) + i_387_ * anIntArray6320[i_388_]) >> 517331150;
            anIntArray6314[i_388_] = i_389_;
        }
        method1464(3);
        aBoolean6408 = false;
    }

    private final void method1454(int i) {
        anInt6425++;
        int i_390_ = 32767;
        int i_391_ = 32767;
        int i_392_ = 32767;
        int i_393_ = -32768;
        int i_394_ = -32768;
        int i_395_ = -32768;
        int i_396_ = 0;
        int i_397_ = 0;
        int i_398_ = 45 / ((i - -68) / 35);
        for (int i_399_ = 0; (anInt6366 ^ 0xffffffff) < (i_399_ ^ 0xffffffff); i_399_++) {
            int i_400_ = anIntArray6314[i_399_];
            int i_401_ = anIntArray6321[i_399_];
            if ((i_400_ ^ 0xffffffff) > (i_390_ ^ 0xffffffff))
                i_390_ = i_400_;
            int i_402_ = anIntArray6320[i_399_];
            if (i_393_ < i_400_)
                i_393_ = i_400_;
            if ((i_391_ ^ 0xffffffff) < (i_401_ ^ 0xffffffff))
                i_391_ = i_401_;
            if ((i_394_ ^ 0xffffffff) > (i_401_ ^ 0xffffffff))
                i_394_ = i_401_;
            if (i_402_ > i_395_)
                i_395_ = i_402_;
            if ((i_392_ ^ 0xffffffff) < (i_402_ ^ 0xffffffff))
                i_392_ = i_402_;
            int i_403_ = i_400_ * i_400_ - -(i_402_ * i_402_);
            if ((i_403_ ^ 0xffffffff) < (i_396_ ^ 0xffffffff))
                i_396_ = i_403_;
            i_403_ = i_401_ * i_401_ + i_400_ * i_400_ + i_402_ * i_402_;
            if (i_403_ > i_397_)
                i_397_ = i_403_;
        }
        anInt6309 = i_392_;
        anInt6352 = i_394_;
        anInt6421 = i_393_;
        anInt6336 = i_395_;
        anInt6407 = i_391_;
        anInt6428 = i_390_;
        anInt6307 = (int) (Math.sqrt((double) i_396_) + 0.99);
        anInt6331 = (int) (0.99 + Math.sqrt((double) i_397_));
        aBoolean6408 = true;
    }

    final void wa() {
        for (int i = 0; (i ^ 0xffffffff) > (anInt6308 ^ 0xffffffff); i++) {
            anIntArray6314[i] = 7 + anIntArray6314[i] >> 1449582468;
            anIntArray6321[i] = anIntArray6321[i] + 7 >> -1025635100;
            anIntArray6320[i] = anIntArray6320[i] - -7 >> 1177484100;
        }
        anInt6351++;
        method1464(-106);
        aBoolean6408 = false;
    }

    final void p(int i, int i_404_, s var_s, s var_s_405_, int i_406_, int i_407_, int i_408_) {
        if (!aBoolean6408)
            method1454(20);
        anInt6343++;
        int i_409_ = i_406_ + anInt6428;
        int i_410_ = anInt6421 + i_406_;
        int i_411_ = i_408_ - -anInt6309;
        int i_412_ = anInt6336 + i_408_;
        if (((i ^ 0xffffffff) != -2 && (i ^ 0xffffffff) != -3 && (i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -6) || ((i_409_ ^ 0xffffffff) <= -1 && (((s) var_s).anInt3468 > ((s) var_s).anInt3465 + i_410_ >> ((s) var_s).anInt3466) && i_411_ >= 0 && (((s) var_s).anInt3465 + i_412_ >> ((s) var_s).anInt3466 < ((s) var_s).anInt3472))) {
            if ((i ^ 0xffffffff) == -5 || (i ^ 0xffffffff) == -6) {
                if (var_s_405_ == null || ((i_409_ ^ 0xffffffff) > -1 || (((s) var_s_405_).anInt3468 <= (i_410_ + ((s) var_s_405_).anInt3465 >> ((s) var_s_405_).anInt3466)) || (i_411_ ^ 0xffffffff) > -1 || (((s) var_s_405_).anInt3472 <= (i_412_ - -((s) var_s_405_).anInt3465 >> ((s) var_s_405_).anInt3466))))
                    return;
            } else {
                i_409_ >>= ((s) var_s).anInt3466;
                i_410_ = (i_410_ + (-1 + ((s) var_s).anInt3465) >> ((s) var_s).anInt3466);
                i_411_ >>= ((s) var_s).anInt3466;
                i_412_ = (i_412_ - (-((s) var_s).anInt3465 + 1) >> ((s) var_s).anInt3466);
                if (((i_407_ ^ 0xffffffff) == (var_s.method3145(i_409_, 119, i_411_) ^ 0xffffffff)) && var_s.method3145(i_410_, 120, i_411_) == i_407_ && i_407_ == var_s.method3145(i_409_, 79, i_412_) && ((var_s.method3145(i_410_, 62, i_412_) ^ 0xffffffff) == (i_407_ ^ 0xffffffff)))
                    return;
            }
            if ((i ^ 0xffffffff) != -2) {
                if ((i ^ 0xffffffff) != -3) {
                    if ((i ^ 0xffffffff) == -4) {
                        int i_413_ = 4 * (0xff & i_404_);
                        int i_414_ = 4 * (0xff & i_404_ >> 1375914664);
                        int i_415_ = (0xff2998 & i_404_) >> 766829872 << -328624858;
                        int i_416_ = (0xff & i_404_ >> -1914140392) << -1237414298;
                        if (i_406_ - (i_413_ >> -2080343295) < 0 || ((i_406_ + (i_413_ >> -516379871) + ((s) var_s).anInt3465) >= (((s) var_s).anInt3468 << ((s) var_s).anInt3466)) || (i_408_ + -(i_414_ >> -1568882175) ^ 0xffffffff) > -1 || (i_408_ + ((i_414_ >> -1623050495) - -((s) var_s).anInt3465) >= (((s) var_s).anInt3472 << ((s) var_s).anInt3466)))
                            return;
                        this.method1429(var_s, i_415_, i_408_, i_406_, i_413_, 0, i_416_, i_407_, i_414_);
                    } else if ((i ^ 0xffffffff) != -5) {
                        if ((i ^ 0xffffffff) == -6) {
                            int i_417_ = -anInt6407 + anInt6352;
                            for (int i_418_ = 0; anInt6366 > i_418_; i_418_++) {
                                int i_419_ = anIntArray6314[i_418_] - -i_406_;
                                int i_420_ = anIntArray6320[i_418_] - -i_408_;
                                int i_421_ = var_s.method3150((byte) 126, i_419_, i_420_);
                                int i_422_ = var_s_405_.method3150((byte) 122, i_419_, i_420_);
                                int i_423_ = i_421_ + (-i_422_ + -i_404_);
                                anIntArray6321[i_418_] = (-i_407_ - (-i_421_ - (i_423_ * ((anIntArray6321[i_418_] << -1473072984) / i_417_) >> 1403268072)));
                            }
                        }
                    } else {
                        int i_424_ = anInt6352 - anInt6407;
                        for (int i_425_ = 0; (anInt6366 ^ 0xffffffff) < (i_425_ ^ 0xffffffff); i_425_++)
                            anIntArray6321[i_425_] = (anIntArray6321[i_425_] + (-i_407_ + (var_s_405_.method3150((byte) 118, anIntArray6314[i_425_] + i_406_, anIntArray6320[i_425_] + i_408_)) + i_424_));
                    }
                } else {
                    int i_426_ = anInt6407;
                    if (i_426_ == 0)
                        return;
                    for (int i_427_ = 0; (i_427_ ^ 0xffffffff) > (anInt6366 ^ 0xffffffff); i_427_++) {
                        int i_428_ = (anIntArray6321[i_427_] << 1892125584) / i_426_;
                        if (i_428_ < i_404_)
                            anIntArray6321[i_427_] = (anIntArray6321[i_427_] + ((i_404_ - i_428_) * (-i_407_ + var_s.method3150((byte) 114, ((anIntArray6314[i_427_]) - -i_406_), ((anIntArray6320[i_427_]) - -i_408_))) / i_404_));
                    }
                }
            } else {
                for (int i_429_ = 0; (i_429_ ^ 0xffffffff) > (anInt6366 ^ 0xffffffff); i_429_++)
                    anIntArray6321[i_429_] = (anIntArray6321[i_429_] + var_s.method3150((byte) 111, anIntArray6314[i_429_] - -i_406_, i_408_ + anIntArray6320[i_429_]) + -i_407_);
            }
            method1464(8);
            aBoolean6408 = false;
        }
    }

    final void O(int i, int i_430_, int i_431_) {
        anInt6396++;
        for (int i_432_ = 0; i_432_ < anInt6366; i_432_++) {
            if (i != 128)
                anIntArray6314[i_432_] = i * anIntArray6314[i_432_] >> 2018651175;
            if (i_430_ != 128)
                anIntArray6321[i_432_] = anIntArray6321[i_432_] * i_430_ >> -1920358201;
            if (i_431_ != 128)
                anIntArray6320[i_432_] = anIntArray6320[i_432_] * i_431_ >> -1745693529;
        }
        method1464(81);
        aBoolean6408 = false;
    }

    final int HA() {
        if (!aBoolean6408)
            method1454(104);
        anInt6323++;
        return anInt6309;
    }

    final void s(int i) {
        if (aClass337_6427 != null)
            ((Class337) aClass337_6427).aBoolean3928 = Class52.method412(i, (byte) -35, anInt6397);
        anInt6312++;
        if (aClass337_6392 != null)
            ((Class337) aClass337_6392).aBoolean3928 = Class282_Sub20.method3005(i, 192, anInt6397);
        if (aClass337_6373 != null)
            ((Class337) aClass337_6373).aBoolean3928 = Class79.method572(anInt6397, 55, i);
        if (aClass337_6344 != null)
            ((Class337) aClass337_6344).aBoolean3928 = Class229.method1832(anInt6397, i, (byte) -123);
        anInt6324 = i;
        if (aClass120_6347 != null && (anInt6324 & 0x10000 ^ 0xffffffff) == -1) {
            aShortArray6369 = ((Class120) aClass120_6347).aShortArray1509;
            aShortArray6340 = ((Class120) aClass120_6347).aShortArray1507;
            aShortArray6401 = ((Class120) aClass120_6347).aShortArray1505;
            aByteArray6341 = ((Class120) aClass120_6347).aByteArray1506;
            aClass120_6347 = null;
        }
        aBoolean6317 = true;
        method1465((byte) 1);
    }

    final boolean method1420(int i, int i_433_, Viewport viewport, boolean bool, int i_434_, int i_435_) {
        anInt6370++;
        return method1452(true, i_433_, bool, i_434_, i_435_, viewport, i);
    }

    public static void method1455(int i) {
        aByteArray6398 = null;
        if (i != 0)
            method1461((byte) 80);
        aByteArray6356 = null;
    }

    final void C(int i) {
        anInt6345++;
        aShort6436 = (short) i;
        method1448(-5565);
    }

    private final void method1456(int i) {
        if (i != 12460)
            aClass120_6347 = null;
        if (aClass95_6375 != null)
            ((Class95) aClass95_6375).aBoolean1228 = false;
        anInt6333++;
    }

    final void FA(int i) {
        anInt6388++;
        int i_436_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_437_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_438_ = 0; (anInt6366 ^ 0xffffffff) < (i_438_ ^ 0xffffffff); i_438_++) {
            int i_439_ = ((-(anIntArray6320[i_438_] * i_436_) + i_437_ * anIntArray6321[i_438_]) >> -977945170);
            anIntArray6320[i_438_] = (i_437_ * anIntArray6320[i_438_] + anIntArray6321[i_438_] * i_436_) >> -1352200242;
            anIntArray6321[i_438_] = i_439_;
        }
        method1464(-85);
        aBoolean6408 = false;
    }

    final void method1442(Viewport viewport) {
        anInt6310++;
        Class238_Sub2 class238_sub2 = (Class238_Sub2) viewport;
        if (aClass40Array6372 != null) {
            for (int i = 0; (aClass40Array6372.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                Class40 class40 = aClass40Array6372[i];
                Class40 class40_440_ = class40;
                if (((Class40) class40).aClass40_448 != null)
                    class40_440_ = ((Class40) class40).aClass40_448;
                ((Class40) class40_440_).anInt447 = (int) (((Class238_Sub2) class238_sub2).aFloat6733 + (((float) (anIntArray6320[((Class40) class40).anInt446]) * ((Class238_Sub2) class238_sub2).aFloat6726) + ((((Class238_Sub2) class238_sub2).aFloat6750 * (float) (anIntArray6321[((Class40) class40).anInt446])) + ((((Class238_Sub2) class238_sub2).aFloat6711) * (float) (anIntArray6314[(((Class40) class40).anInt446)])))));
                ((Class40) class40_440_).anInt458 = (int) (((Class238_Sub2) class238_sub2).aFloat6715 + (((float) (anIntArray6320[((Class40) class40).anInt446]) * ((Class238_Sub2) class238_sub2).aFloat6724) + (((float) (anIntArray6321[((Class40) class40).anInt446]) * (((Class238_Sub2) class238_sub2).aFloat6737)) + ((float) (anIntArray6314[((Class40) class40).anInt446]) * (((Class238_Sub2) class238_sub2).aFloat6713)))));
                ((Class40) class40_440_).anInt457 = (int) (((Class238_Sub2) class238_sub2).aFloat6706 + ((((Class238_Sub2) class238_sub2).aFloat6744 * (float) (anIntArray6321[((Class40) class40).anInt446])) + (((Class238_Sub2) class238_sub2).aFloat6728 * (float) (anIntArray6314[((Class40) class40).anInt446])) + ((float) (anIntArray6320[((Class40) class40).anInt446]) * (((Class238_Sub2) class238_sub2).aFloat6754))));
                ((Class40) class40_440_).anInt453 = (int) (((Class238_Sub2) class238_sub2).aFloat6733 + ((((Class238_Sub2) class238_sub2).aFloat6750 * (float) (anIntArray6321[((Class40) class40).anInt451])) + (((Class238_Sub2) class238_sub2).aFloat6711 * (float) (anIntArray6314[((Class40) class40).anInt451])) + (((Class238_Sub2) class238_sub2).aFloat6726 * (float) (anIntArray6320[(((Class40) class40).anInt451)]))));
                ((Class40) class40_440_).anInt452 = (int) (((Class238_Sub2) class238_sub2).aFloat6715 + (((float) (anIntArray6320[((Class40) class40).anInt451]) * ((Class238_Sub2) class238_sub2).aFloat6724) + (((float) (anIntArray6314[((Class40) class40).anInt451]) * (((Class238_Sub2) class238_sub2).aFloat6713)) + ((((Class238_Sub2) class238_sub2).aFloat6737) * (float) (anIntArray6321[(((Class40) class40).anInt451)])))));
                ((Class40) class40_440_).anInt440 = (int) (((Class238_Sub2) class238_sub2).aFloat6706 + ((((Class238_Sub2) class238_sub2).aFloat6754 * (float) (anIntArray6320[((Class40) class40).anInt451])) + ((((Class238_Sub2) class238_sub2).aFloat6744 * (float) (anIntArray6321[((Class40) class40).anInt451])) + ((((Class238_Sub2) class238_sub2).aFloat6728) * (float) (anIntArray6314[(((Class40) class40).anInt451)])))));
                ((Class40) class40_440_).anInt439 = (int) (((Class238_Sub2) class238_sub2).aFloat6733 + (((float) (anIntArray6321[((Class40) class40).anInt456]) * ((Class238_Sub2) class238_sub2).aFloat6750) + ((float) (anIntArray6314[((Class40) class40).anInt456]) * (((Class238_Sub2) class238_sub2).aFloat6711)) + ((float) (anIntArray6320[((Class40) class40).anInt456]) * (((Class238_Sub2) class238_sub2).aFloat6726))));
                ((Class40) class40_440_).anInt441 = (int) ((((Class238_Sub2) class238_sub2).aFloat6724 * (float) (anIntArray6320[((Class40) class40).anInt456])) + (((float) (anIntArray6321[((Class40) class40).anInt456]) * ((Class238_Sub2) class238_sub2).aFloat6737) + (((Class238_Sub2) class238_sub2).aFloat6713 * (float) (anIntArray6314[((Class40) class40).anInt456]))) + ((Class238_Sub2) class238_sub2).aFloat6715);
                ((Class40) class40_440_).anInt455 = (int) (((Class238_Sub2) class238_sub2).aFloat6706 + (((float) (anIntArray6314[((Class40) class40).anInt456]) * ((Class238_Sub2) class238_sub2).aFloat6728) + ((float) (anIntArray6321[((Class40) class40).anInt456]) * (((Class238_Sub2) class238_sub2).aFloat6744)) + (((Class238_Sub2) class238_sub2).aFloat6754 * (float) (anIntArray6320[(((Class40) class40).anInt456)]))));
            }
        }
        if (aClass124Array6385 != null) {
            for (int i = 0; (aClass124Array6385.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                Class124 class124 = aClass124Array6385[i];
                Class124 class124_441_ = class124;
                if (((Class124) class124).aClass124_1531 != null)
                    class124_441_ = ((Class124) class124).aClass124_1531;
                if (((Class124) class124).aViewport_1533 == null)
                    ((Class124) class124).aViewport_1533 = class238_sub2.method1863();
                else
                    ((Class124) class124).aViewport_1533.method1868(class238_sub2);
                ((Class124) class124_441_).anInt1536 = (int) (((Class238_Sub2) class238_sub2).aFloat6733 + ((((Class238_Sub2) class238_sub2).aFloat6750 * (float) (anIntArray6321[((Class124) class124).anInt1529])) + (((Class238_Sub2) class238_sub2).aFloat6711 * (float) (anIntArray6314[(((Class124) class124).anInt1529)])) + (((Class238_Sub2) class238_sub2).aFloat6726 * (float) (anIntArray6320[(((Class124) class124).anInt1529)]))));
                ((Class124) class124_441_).anInt1535 = (int) (((Class238_Sub2) class238_sub2).aFloat6715 + ((((Class238_Sub2) class238_sub2).aFloat6724 * (float) (anIntArray6320[((Class124) class124).anInt1529])) + ((((Class238_Sub2) class238_sub2).aFloat6737 * (float) (anIntArray6321[(((Class124) class124).anInt1529)])) + ((((Class238_Sub2) class238_sub2).aFloat6713) * (float) (anIntArray6314[(((Class124) class124).anInt1529)])))));
                ((Class124) class124_441_).anInt1542 = (int) ((((Class238_Sub2) class238_sub2).aFloat6744 * (float) (anIntArray6321[((Class124) class124).anInt1529])) + ((float) (anIntArray6314[((Class124) class124).anInt1529]) * ((Class238_Sub2) class238_sub2).aFloat6728) + (((Class238_Sub2) class238_sub2).aFloat6754 * (float) (anIntArray6320[((Class124) class124).anInt1529])) + ((Class238_Sub2) class238_sub2).aFloat6706);
            }
        }
    }

    final void ia(short i, short i_442_) {
        for (int i_443_ = 0; anInt6338 > i_443_; i_443_++) {
            if (i == aShortArray6395[i_443_])
                aShortArray6395[i_443_] = i_442_;
        }
        anInt6358++;
        if (aClass132Array6330 != null) {
            for (int i_444_ = 0; anInt6403 > i_444_; i_444_++) {
                Class132 class132 = aClass132Array6330[i_444_];
                Class284 class284 = aClass284Array6361[i_444_];
                ((Class284) class284).anInt3355 = ((Node_Sub14_Sub39.anIntArray9600[(aShortArray6395[((Class132) class132).anInt1619] & 0xffff)]) & 0xffffff | ((Class284) class284).anInt3355 & ~0xffffff);
            }
        }
        method1448(-5565);
    }

    private final void method1457(int i) {
        if (aClass132Array6330 != null) {
            aHa_Sub3_6380.C(!aBoolean6405);
            aHa_Sub3_6380.method923(false, -8043);
            aHa_Sub3_6380.method946(1, -104, Class380.aClass280_4649);
            aHa_Sub3_6380.method951(Class380.aClass280_4649, (byte) 106, 1);
            for (int i_445_ = 0; i_445_ < anInt6403; i_445_++) {
                Class132 class132 = aClass132Array6330[i_445_];
                Class284 class284 = aClass284Array6361[i_445_];
                if (!((Class132) class132).aBoolean1612 || !aHa_Sub3_6380.q()) {
                    float f = (0.3333333F * (float) ((anIntArray6314[((Class132) class132).anInt1620]) + ((anIntArray6314[((Class132) class132).anInt1617]) + (anIntArray6314[(((Class132) class132).anInt1607)]))));
                    float f_446_ = (0.3333333F * (float) ((anIntArray6321[((Class132) class132).anInt1620]) + (anIntArray6321[((Class132) class132).anInt1617]) + (anIntArray6321[((Class132) class132).anInt1607])));
                    float f_447_ = (0.3333333F * (float) ((anIntArray6320[((Class132) class132).anInt1617]) + (anIntArray6320[((Class132) class132).anInt1607]) + (anIntArray6320[((Class132) class132).anInt1620])));
                    float f_448_ = (f_446_ * Class132.aFloat1622 + Node_Sub23.aFloat7093 * f + Class102.aFloat1304 * f_447_ + Node_Sub2_Sub4.aFloat8880);
                    float f_449_ = (Class282_Sub2.aFloat7610 + (f * Node_Sub2_Sub3.aFloat8862 + f_446_ * Class340.aFloat3967 + Class206.aFloat4976 * f_447_));
                    float f_450_ = (Class242.aFloat2699 + (Class136_Sub2.aFloat8395 * f + Node_Sub8_Sub17.aFloat9057 * f_446_ + f_447_ * Class95.aFloat1236));
                    float f_451_ = ((float) (1.0 / Math.sqrt((double) (f_450_ * f_450_ + (f_448_ * f_448_ + (f_449_ * f_449_))))) * (float) ((Class132) class132).anInt1611);
                    Class238_Sub2 class238_sub2 = aHa_Sub3_6380.method952(-24720);
                    class238_sub2.method1887((f_449_ + (float) ((Class284) class284).anInt3349 - f_451_ * f_449_), -(f_451_ * f_450_) + f_450_, ((float) ((Class284) class284).anInt3354 + f_448_ - f_451_ * f_448_), ((Class284) class284).anInt3352, (((Class132) class132).aShort1606 * ((Class284) class284).anInt3350) >> 753508615, (((Class284) class284).anInt3351 * ((Class132) class132).aShort1610) >> -917771673, 2);
                    class238_sub2.method1883((((ha_Sub3) aHa_Sub3_6380).aClass238_Sub2_6148), (byte) -32);
                    aHa_Sub3_6380.method948(83);
                    int i_452_ = ((Class284) class284).anInt3355;
                    aHa_Sub3_6380.method962(((Class132) class132).aShort1608, 102, false, false);
                    aHa_Sub3_6380.method942(-129, ((Class132) class132).aByte1616);
                    aHa_Sub3_6380.method976(i_452_, false);
                    aHa_Sub3_6380.method986(-125);
                }
            }
            aHa_Sub3_6380.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 106, 1);
            aHa_Sub3_6380.method946(1, -96, Class346_Sub7_Sub3_Sub1.aClass280_10511);
            aHa_Sub3_6380.C(true);
        }
        anInt6390++;
        int i_453_ = 108 % ((-86 - i) / 39);
    }

    final void VA(int i) {
        anInt6391++;
        int i_454_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_455_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_456_ = 0; (i_456_ ^ 0xffffffff) > (anInt6366 ^ 0xffffffff); i_456_++) {
            int i_457_ = ((i_455_ * anIntArray6314[i_456_] + anIntArray6321[i_456_] * i_454_) >> 2127078830);
            anIntArray6321[i_456_] = anIntArray6321[i_456_] * i_455_ + -(anIntArray6314[i_456_] * i_454_) >> -1188693874;
            anIntArray6314[i_456_] = i_457_;
        }
        method1464(-80);
        aBoolean6408 = false;
    }

    final void method1443(Viewport viewport, int i, boolean bool) {
        anInt6394++;
        if (aShortArray6417 != null) {
            int[] is = new int[3];
            for (int i_458_ = 0; (anInt6366 ^ 0xffffffff) < (i_458_ ^ 0xffffffff); i_458_++) {
                if ((i & aShortArray6417[i_458_] ^ 0xffffffff) != -1) {
                    if (bool)
                        viewport.method1875(anIntArray6314[i_458_], anIntArray6321[i_458_], anIntArray6320[i_458_], is);
                    else
                        viewport.method1865(anIntArray6314[i_458_], anIntArray6321[i_458_], anIntArray6320[i_458_], is);
                    anIntArray6314[i_458_] = is[0];
                    anIntArray6321[i_458_] = is[1];
                    anIntArray6320[i_458_] = is[2];
                }
            }
        }
    }

    final int G() {
        if (!aBoolean6408)
            method1454(19);
        anInt6377++;
        return anInt6336;
    }

    final void H(int i, int i_459_, int i_460_) {
        anInt6376++;
        for (int i_461_ = 0; (anInt6366 ^ 0xffffffff) < (i_461_ ^ 0xffffffff); i_461_++) {
            if ((i ^ 0xffffffff) != -1)
                anIntArray6314[i_461_] += i;
            if (i_459_ != 0)
                anIntArray6321[i_461_] += i_459_;
            if ((i_460_ ^ 0xffffffff) != -1)
                anIntArray6320[i_461_] += i_460_;
        }
        method1464(91);
        aBoolean6408 = false;
    }

    final r ba(r var_r) {
        anInt6327++;
        if ((anInt6402 ^ 0xffffffff) == -1)
            return null;
        if (!aBoolean6408)
            method1454(-118);
        int i;
        int i_462_;
        if ((((ha_Sub3) aHa_Sub3_6380).anInt6210 ^ 0xffffffff) < -1) {
            i = (anInt6428 + -(((ha_Sub3) aHa_Sub3_6380).anInt6210 * anInt6352 >> 264724840) >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
            i_462_ = (-(((ha_Sub3) aHa_Sub3_6380).anInt6210 * anInt6407 >> -1582610712) + anInt6421 >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
        } else {
            i = (anInt6428 - (((ha_Sub3) aHa_Sub3_6380).anInt6210 * anInt6407 >> 1236474440) >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
            i_462_ = (-(anInt6352 * ((ha_Sub3) aHa_Sub3_6380).anInt6210 >> -933558200) + anInt6421 >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
        }
        int i_463_;
        int i_464_;
        if (((ha_Sub3) aHa_Sub3_6380).anInt6176 > 0) {
            i_463_ = (anInt6309 - (((ha_Sub3) aHa_Sub3_6380).anInt6176 * anInt6352 >> -687457752) >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
            i_464_ = (-(((ha_Sub3) aHa_Sub3_6380).anInt6176 * anInt6407 >> -143246616) + anInt6336 >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
        } else {
            i_463_ = (-(anInt6407 * ((ha_Sub3) aHa_Sub3_6380).anInt6176 >> -858527128) + anInt6309 >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
            i_464_ = (-(anInt6352 * ((ha_Sub3) aHa_Sub3_6380).anInt6176 >> -2094344632) + anInt6336 >> ((ha_Sub3) aHa_Sub3_6380).anInt6156);
        }
        int i_465_ = 1 + (-i + i_462_);
        int i_466_ = -i_463_ + (i_464_ - -1);
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        r_Sub2 var_r_Sub2_467_;
        if (var_r_Sub2 != null && var_r_Sub2.method2113(i_466_, -127, i_465_)) {
            var_r_Sub2_467_ = var_r_Sub2;
            var_r_Sub2_467_.method2119(119);
        } else
            var_r_Sub2_467_ = new r_Sub2(aHa_Sub3_6380, i_465_, i_466_);
        var_r_Sub2_467_.method2121(i_464_, i_463_, -18573, i_462_, i);
        method1462((byte) 2, var_r_Sub2_467_);
        return var_r_Sub2_467_;
    }

    private final short method1458(int i, Class343 class343, int i_468_, int i_469_, float f, float f_470_, int i_471_, long l, int i_472_, int i_473_, int i_474_) {
        anInt6381++;
        int i_475_ = anIntArray6313[i_474_];
        int i_476_ = anIntArray6313[i_474_ - -1];
        int i_477_ = i_471_;
        for (int i_478_ = i_475_; i_476_ > i_478_; i_478_++) {
            short i_479_ = aShortArray6434[i_478_];
            if ((i_479_ ^ 0xffffffff) == -1) {
                i_477_ = i_478_;
                break;
            }
            if ((l ^ 0xffffffffffffffffL) == (Class312.aLongArray3641[i_478_] ^ 0xffffffffffffffffL))
                return (short) (-1 + i_479_);
        }
        aShortArray6434[i_477_] = (short) (1 + anInt6402);
        Class312.aLongArray3641[i_477_] = l;
        aShortArray6387[anInt6402] = (short) i_468_;
        aShortArray6342[anInt6402] = (short) i_474_;
        aShortArray6401[anInt6402] = (short) i_469_;
        aShortArray6340[anInt6402] = (short) i_473_;
        aShortArray6369[anInt6402] = (short) i_472_;
        aByteArray6341[anInt6402] = (byte) i;
        aFloatArray6420[anInt6402] = f;
        aFloatArray6415[anInt6402] = f_470_;
        return (short) anInt6402++;
    }

    final int ma() {
        if (!aBoolean6408)
            method1454(95);
        anInt6435++;
        return anInt6331;
    }

    final void method1428(Class162 class162, int i, int i_480_, int i_481_, boolean bool) {
        anInt6350++;
        Class162_Sub1 class162_sub1_482_ = (Class162_Sub1) class162;
        if ((anInt6338 ^ 0xffffffff) != -1 && (class162_sub1_482_.anInt6338 ^ 0xffffffff) != -1) {
            int i_483_ = class162_sub1_482_.anInt6366;
            int[] is = class162_sub1_482_.anIntArray6314;
            int[] is_484_ = class162_sub1_482_.anIntArray6321;
            int[] is_485_ = class162_sub1_482_.anIntArray6320;
            short[] is_486_ = class162_sub1_482_.aShortArray6401;
            short[] is_487_ = class162_sub1_482_.aShortArray6340;
            short[] is_488_ = class162_sub1_482_.aShortArray6369;
            byte[] is_489_ = class162_sub1_482_.aByteArray6341;
            byte[] is_490_;
            short[] is_491_;
            short[] is_492_;
            short[] is_493_;
            if (aClass120_6347 != null) {
                is_493_ = ((Class120) aClass120_6347).aShortArray1505;
                is_491_ = ((Class120) aClass120_6347).aShortArray1509;
                is_490_ = ((Class120) aClass120_6347).aByteArray1506;
                is_492_ = ((Class120) aClass120_6347).aShortArray1507;
            } else {
                is_490_ = null;
                is_491_ = null;
                is_492_ = null;
                is_493_ = null;
            }
            short[] is_494_;
            short[] is_495_;
            byte[] is_496_;
            short[] is_497_;
            if (class162_sub1_482_.aClass120_6347 == null) {
                is_495_ = null;
                is_497_ = null;
                is_494_ = null;
                is_496_ = null;
            } else {
                is_494_ = (((Class120) class162_sub1_482_.aClass120_6347).aShortArray1509);
                is_495_ = (((Class120) class162_sub1_482_.aClass120_6347).aShortArray1505);
                is_496_ = (((Class120) class162_sub1_482_.aClass120_6347).aByteArray1506);
                is_497_ = (((Class120) class162_sub1_482_.aClass120_6347).aShortArray1507);
            }
            int[] is_498_ = class162_sub1_482_.anIntArray6313;
            short[] is_499_ = class162_sub1_482_.aShortArray6434;
            if (!class162_sub1_482_.aBoolean6408)
                class162_sub1_482_.method1454(-127);
            int i_500_ = class162_sub1_482_.anInt6407;
            int i_501_ = class162_sub1_482_.anInt6352;
            int i_502_ = class162_sub1_482_.anInt6428;
            int i_503_ = class162_sub1_482_.anInt6421;
            int i_504_ = class162_sub1_482_.anInt6309;
            int i_505_ = class162_sub1_482_.anInt6336;
            for (int i_506_ = 0; (anInt6366 ^ 0xffffffff) < (i_506_ ^ 0xffffffff); i_506_++) {
                int i_507_ = anIntArray6321[i_506_] + -i_480_;
                if (i_507_ >= i_500_ && (i_507_ ^ 0xffffffff) >= (i_501_ ^ 0xffffffff)) {
                    int i_508_ = anIntArray6314[i_506_] + -i;
                    if ((i_502_ ^ 0xffffffff) >= (i_508_ ^ 0xffffffff) && i_503_ >= i_508_) {
                        int i_509_ = -i_481_ + anIntArray6320[i_506_];
                        if ((i_509_ ^ 0xffffffff) <= (i_504_ ^ 0xffffffff) && i_505_ >= i_509_) {
                            int i_510_ = -1;
                            int i_511_ = anIntArray6313[i_506_];
                            int i_512_ = anIntArray6313[i_506_ + 1];
                            for (int i_513_ = i_511_; (i_512_ ^ 0xffffffff) < (i_513_ ^ 0xffffffff); i_513_++) {
                                i_510_ = aShortArray6434[i_513_] - 1;
                                if ((i_510_ ^ 0xffffffff) == 0 || aByteArray6341[i_510_] != 0)
                                    break;
                            }
                            if ((i_510_ ^ 0xffffffff) != 0) {
                                for (int i_514_ = 0; ((i_514_ ^ 0xffffffff) > (i_483_ ^ 0xffffffff)); i_514_++) {
                                    if (i_508_ == is[i_514_] && ((i_509_ ^ 0xffffffff) == (is_485_[i_514_] ^ 0xffffffff)) && i_507_ == is_484_[i_514_]) {
                                        i_512_ = is_498_[i_514_ - -1];
                                        int i_515_ = -1;
                                        i_511_ = is_498_[i_514_];
                                        for (int i_516_ = i_511_; ((i_516_ ^ 0xffffffff) > (i_512_ ^ 0xffffffff)); i_516_++) {
                                            i_515_ = -1 + is_499_[i_516_];
                                            if ((i_515_ ^ 0xffffffff) == 0 || is_489_[i_515_] != 0)
                                                break;
                                        }
                                        if ((i_515_ ^ 0xffffffff) != 0) {
                                            if (is_493_ == null) {
                                                aClass120_6347 = new Class120();
                                                is_493_ = ((Class120) aClass120_6347).aShortArray1505 = (Node_Sub1.method1971((byte) 64, aShortArray6401));
                                                is_492_ = ((Class120) aClass120_6347).aShortArray1507 = (Node_Sub1.method1971((byte) 64, aShortArray6340));
                                                is_491_ = ((Class120) aClass120_6347).aShortArray1509 = (Node_Sub1.method1971((byte) 64, aShortArray6369));
                                                is_490_ = ((Class120) aClass120_6347).aByteArray1506 = (client.method103((byte) 3, aByteArray6341));
                                            }
                                            if (is_495_ == null) {
                                                Class120 class120 = (class162_sub1_482_.aClass120_6347 = new Class120());
                                                is_495_ = ((Class120) class120).aShortArray1505 = (Node_Sub1.method1971((byte) 64, is_486_));
                                                is_497_ = ((Class120) class120).aShortArray1507 = (Node_Sub1.method1971((byte) 64, is_487_));
                                                is_494_ = ((Class120) class120).aShortArray1509 = (Node_Sub1.method1971((byte) 64, is_488_));
                                                is_496_ = ((Class120) class120).aByteArray1506 = (client.method103((byte) 3, is_489_));
                                            }
                                            short i_517_ = aShortArray6401[i_510_];
                                            short i_518_ = aShortArray6340[i_510_];
                                            short i_519_ = aShortArray6369[i_510_];
                                            i_512_ = is_498_[i_514_ + 1];
                                            i_511_ = is_498_[i_514_];
                                            byte i_520_ = aByteArray6341[i_510_];
                                            for (int i_521_ = i_511_; i_521_ < i_512_; i_521_++) {
                                                int i_522_ = -1 + is_499_[i_521_];
                                                if ((i_522_ ^ 0xffffffff) == 0)
                                                    break;
                                                if ((is_496_[i_522_] ^ 0xffffffff) != -1) {
                                                    is_495_[i_522_] += i_517_;
                                                    is_497_[i_522_] += i_518_;
                                                    is_494_[i_522_] += i_519_;
                                                    is_496_[i_522_] += i_520_;
                                                }
                                            }
                                            i_520_ = is_489_[i_515_];
                                            i_517_ = is_486_[i_515_];
                                            i_518_ = is_487_[i_515_];
                                            i_519_ = is_488_[i_515_];
                                            i_511_ = anIntArray6313[i_506_];
                                            i_512_ = anIntArray6313[i_506_ - -1];
                                            for (int i_523_ = i_511_; ((i_512_ ^ 0xffffffff) < (i_523_ ^ 0xffffffff)); i_523_++) {
                                                int i_524_ = -1 + (aShortArray6434[i_523_]);
                                                if (i_524_ == -1)
                                                    break;
                                                if (is_490_[i_524_] != 0) {
                                                    is_493_[i_524_] += i_517_;
                                                    is_492_[i_524_] += i_518_;
                                                    is_491_[i_524_] += i_519_;
                                                    is_490_[i_524_] += i_520_;
                                                }
                                            }
                                            class162_sub1_482_.method1447(0);
                                            method1447(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final int RA() {
        if (!aBoolean6408)
            method1454(-121);
        anInt6329++;
        return anInt6421;
    }

    final int da() {
        anInt6367++;
        return aShort6328;
    }

    static final boolean method1459(int i, int i_525_) {
        if (i > -25)
            return false;
        anInt6357++;
        if ((i_525_ ^ 0xffffffff) != -5 && i_525_ != 8 && i_525_ != 11)
            return false;
        return true;
    }

    final void k(int i) {
        anInt6431++;
        int i_526_ = Node_Sub9_Sub1.anIntArray9106[i];
        int i_527_ = Node_Sub9_Sub1.anIntArray9109[i];
        for (int i_528_ = 0; i_528_ < anInt6366; i_528_++) {
            int i_529_ = ((i_527_ * anIntArray6314[i_528_] + anIntArray6320[i_528_] * i_526_) >> -1369322674);
            anIntArray6320[i_528_] = (i_527_ * anIntArray6320[i_528_] + -(i_526_ * anIntArray6314[i_528_])) >> -12396786;
            anIntArray6314[i_528_] = i_529_;
        }
        for (int i_530_ = 0; (anInt6402 ^ 0xffffffff) < (i_530_ ^ 0xffffffff); i_530_++) {
            int i_531_ = ((i_527_ * aShortArray6401[i_530_] + aShortArray6369[i_530_] * i_526_) >> -1164652498);
            aShortArray6369[i_530_] = (short) ((aShortArray6369[i_530_] * i_527_ + -(aShortArray6401[i_530_] * i_526_)) >> 1448481710);
            aShortArray6401[i_530_] = (short) i_531_;
        }
        method1464(-83);
        method1447(0);
        aBoolean6408 = false;
    }

    final void method1441(Viewport viewport, Class346_Sub9 class346_sub9, int i, int i_532_) {
        anInt6365++;
        if ((anInt6402 ^ 0xffffffff) != -1) {
            Class238_Sub2 class238_sub2 = ((ha_Sub3) aHa_Sub3_6380).aClass238_Sub2_6147;
            Class238_Sub2 class238_sub2_533_ = (Class238_Sub2) viewport;
            if (!aBoolean6408)
                method1454(82);
            Node_Sub8_Sub17.aFloat9057 = ((((Class238_Sub2) class238_sub2).aFloat6754 * ((Class238_Sub2) class238_sub2_533_).aFloat6744) + ((((Class238_Sub2) class238_sub2_533_).aFloat6750 * ((Class238_Sub2) class238_sub2).aFloat6728) + (((Class238_Sub2) class238_sub2_533_).aFloat6737 * ((Class238_Sub2) class238_sub2).aFloat6744)));
            Class242.aFloat2699 = (((Class238_Sub2) class238_sub2).aFloat6706 + ((((Class238_Sub2) class238_sub2).aFloat6744 * ((Class238_Sub2) class238_sub2_533_).aFloat6715) + (((Class238_Sub2) class238_sub2_533_).aFloat6733 * ((Class238_Sub2) class238_sub2).aFloat6728) + (((Class238_Sub2) class238_sub2).aFloat6754 * ((Class238_Sub2) class238_sub2_533_).aFloat6706)));
            float f = (Class242.aFloat2699 + Node_Sub8_Sub17.aFloat9057 * (float) anInt6407);
            float f_534_ = (Node_Sub8_Sub17.aFloat9057 * (float) anInt6352 + Class242.aFloat2699);
            float f_535_;
            float f_536_;
            if (f > f_534_) {
                f_535_ = f_534_ - (float) anInt6307;
                f_536_ = (float) anInt6307 + f;
            } else {
                f_535_ = (float) -anInt6307 + f;
                f_536_ = f_534_ + (float) anInt6307;
            }
            if (!(((ha_Sub3) aHa_Sub3_6380).aFloat6159 <= f_535_) && !(f_536_ <= (float) ((ha_Sub3) aHa_Sub3_6380).anInt6173)) {
                Node_Sub2_Sub4.aFloat8880 = (((Class238_Sub2) class238_sub2).aFloat6733 + ((((Class238_Sub2) class238_sub2_533_).aFloat6733 * ((Class238_Sub2) class238_sub2).aFloat6711) + (((Class238_Sub2) class238_sub2_533_).aFloat6715 * ((Class238_Sub2) class238_sub2).aFloat6750) + (((Class238_Sub2) class238_sub2).aFloat6726 * (((Class238_Sub2) class238_sub2_533_).aFloat6706))));
                Class132.aFloat1622 = ((((Class238_Sub2) class238_sub2_533_).aFloat6750 * ((Class238_Sub2) class238_sub2).aFloat6711) + (((Class238_Sub2) class238_sub2).aFloat6750 * ((Class238_Sub2) class238_sub2_533_).aFloat6737) + (((Class238_Sub2) class238_sub2_533_).aFloat6744 * ((Class238_Sub2) class238_sub2).aFloat6726));
                float f_537_ = (Class132.aFloat1622 * (float) anInt6407 + Node_Sub2_Sub4.aFloat8880);
                float f_538_ = (Node_Sub2_Sub4.aFloat8880 + Class132.aFloat1622 * (float) anInt6352);
                float f_539_;
                float f_540_;
                if (!(f_537_ > f_538_)) {
                    f_539_ = ((f_538_ + (float) anInt6307) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                    f_540_ = ((f_537_ - (float) anInt6307) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                } else {
                    f_539_ = (((float) anInt6307 + f_537_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                    f_540_ = (((float) -anInt6307 + f_538_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6196);
                }
                if (!(f_540_ / (float) i >= ((ha_Sub3) aHa_Sub3_6380).aFloat6191) && !(f_539_ / (float) i <= ((ha_Sub3) aHa_Sub3_6380).aFloat6213)) {
                    Class282_Sub2.aFloat7610 = (((Class238_Sub2) class238_sub2).aFloat6715 + ((((Class238_Sub2) class238_sub2_533_).aFloat6733 * ((Class238_Sub2) class238_sub2).aFloat6713) + ((((Class238_Sub2) class238_sub2_533_).aFloat6715) * ((Class238_Sub2) class238_sub2).aFloat6737) + (((Class238_Sub2) class238_sub2).aFloat6724 * (((Class238_Sub2) class238_sub2_533_).aFloat6706))));
                    Class340.aFloat3967 = ((((Class238_Sub2) class238_sub2).aFloat6724 * ((Class238_Sub2) class238_sub2_533_).aFloat6744) + ((((Class238_Sub2) class238_sub2).aFloat6737 * (((Class238_Sub2) class238_sub2_533_).aFloat6737)) + (((Class238_Sub2) class238_sub2).aFloat6713 * (((Class238_Sub2) class238_sub2_533_).aFloat6750))));
                    float f_541_ = ((float) anInt6407 * Class340.aFloat3967 + Class282_Sub2.aFloat7610);
                    float f_542_ = (Class340.aFloat3967 * (float) anInt6352 + Class282_Sub2.aFloat7610);
                    float f_543_;
                    float f_544_;
                    if (f_542_ < f_541_) {
                        f_544_ = ((float) ((ha_Sub3) aHa_Sub3_6380).anInt6243 * ((float) -anInt6307 + f_542_));
                        f_543_ = ((float) ((ha_Sub3) aHa_Sub3_6380).anInt6243 * ((float) anInt6307 + f_541_));
                    } else {
                        f_543_ = (((float) anInt6307 + f_542_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6243);
                        f_544_ = (((float) -anInt6307 + f_541_) * (float) ((ha_Sub3) aHa_Sub3_6380).anInt6243);
                    }
                    if (!(((ha_Sub3) aHa_Sub3_6380).aFloat6168 <= f_544_ / (float) i) && !(((ha_Sub3) aHa_Sub3_6380).aFloat6160 >= f_543_ / (float) i)) {
                        if (class346_sub9 != null || aClass132Array6330 != null) {
                            Node_Sub2_Sub3.aFloat8862 = (((((Class238_Sub2) class238_sub2_533_).aFloat6728) * (((Class238_Sub2) class238_sub2).aFloat6724)) + (((((Class238_Sub2) class238_sub2_533_).aFloat6713) * (((Class238_Sub2) class238_sub2).aFloat6737)) + ((((Class238_Sub2) class238_sub2_533_).aFloat6711) * (((Class238_Sub2) class238_sub2).aFloat6713))));
                            Class95.aFloat1236 = ((((Class238_Sub2) class238_sub2).aFloat6754 * (((Class238_Sub2) class238_sub2_533_).aFloat6754)) + (((((Class238_Sub2) class238_sub2).aFloat6744) * (((Class238_Sub2) class238_sub2_533_).aFloat6724)) + ((((Class238_Sub2) class238_sub2).aFloat6728) * ((Class238_Sub2) class238_sub2_533_).aFloat6726)));
                            Class206.aFloat4976 = ((((Class238_Sub2) class238_sub2).aFloat6713 * (((Class238_Sub2) class238_sub2_533_).aFloat6726)) + ((((Class238_Sub2) class238_sub2_533_).aFloat6724) * (((Class238_Sub2) class238_sub2).aFloat6737)) + ((((Class238_Sub2) class238_sub2_533_).aFloat6754) * (((Class238_Sub2) class238_sub2).aFloat6724)));
                            Class102.aFloat1304 = (((((Class238_Sub2) class238_sub2_533_).aFloat6724) * (((Class238_Sub2) class238_sub2).aFloat6750)) + ((((Class238_Sub2) class238_sub2).aFloat6711) * (((Class238_Sub2) class238_sub2_533_).aFloat6726)) + ((((Class238_Sub2) class238_sub2).aFloat6726) * (((Class238_Sub2) class238_sub2_533_).aFloat6754)));
                            Node_Sub23.aFloat7093 = (((((Class238_Sub2) class238_sub2_533_).aFloat6728) * (((Class238_Sub2) class238_sub2).aFloat6726)) + (((((Class238_Sub2) class238_sub2_533_).aFloat6713) * (((Class238_Sub2) class238_sub2).aFloat6750)) + ((((Class238_Sub2) class238_sub2_533_).aFloat6711) * (((Class238_Sub2) class238_sub2).aFloat6711))));
                            Class136_Sub2.aFloat8395 = (((((Class238_Sub2) class238_sub2_533_).aFloat6728) * (((Class238_Sub2) class238_sub2).aFloat6754)) + (((((Class238_Sub2) class238_sub2).aFloat6728) * (((Class238_Sub2) class238_sub2_533_).aFloat6711)) + ((((Class238_Sub2) class238_sub2).aFloat6744) * ((Class238_Sub2) class238_sub2_533_).aFloat6713)));
                        }
                        if (class346_sub9 != null) {
                            int i_545_ = anInt6428 - -anInt6421 >> -741680095;
                            int i_546_ = anInt6336 + anInt6309 >> 881564961;
                            int i_547_ = (int) (Class102.aFloat1304 * (float) i_546_ + (((float) i_545_ * Node_Sub23.aFloat7093) + Node_Sub2_Sub4.aFloat8880 + (Class132.aFloat1622 * (float) anInt6407)));
                            int i_548_ = (int) ((float) i_546_ * Class206.aFloat4976 + (((float) i_545_ * Node_Sub2_Sub3.aFloat8862) + Class282_Sub2.aFloat7610 + (Class340.aFloat3967 * (float) anInt6407)));
                            int i_549_ = (int) (Class95.aFloat1236 * (float) i_546_ + (((float) anInt6407 * Node_Sub8_Sub17.aFloat9057) + (Class242.aFloat2699 + ((float) i_545_ * (Class136_Sub2.aFloat8395)))));
                            int i_550_ = (int) ((Node_Sub23.aFloat7093 * (float) i_545_) + Node_Sub2_Sub4.aFloat8880 + ((float) anInt6352 * Class132.aFloat1622) + (Class102.aFloat1304 * (float) i_546_));
                            int i_551_ = (int) (((float) i_545_ * Node_Sub2_Sub3.aFloat8862) + Class282_Sub2.aFloat7610 + ((float) anInt6352 * Class340.aFloat3967) + ((float) i_546_ * Class206.aFloat4976));
                            ((Class346_Sub9) class346_sub9).anInt8343 = (((ha_Sub3) aHa_Sub3_6380).anInt6166 + (i_551_ * ((ha_Sub3) aHa_Sub3_6380).anInt6243 / i));
                            ((Class346_Sub9) class346_sub9).anInt8347 = (((ha_Sub3) aHa_Sub3_6380).anInt6196 * i_547_ / i) + ((ha_Sub3) aHa_Sub3_6380).anInt6246;
                            ((Class346_Sub9) class346_sub9).anInt8345 = (((ha_Sub3) aHa_Sub3_6380).anInt6196 * i_550_ / i) + ((ha_Sub3) aHa_Sub3_6380).anInt6246;
                            ((Class346_Sub9) class346_sub9).anInt8346 = (((ha_Sub3) aHa_Sub3_6380).anInt6166 - -(i_548_ * ((ha_Sub3) aHa_Sub3_6380).anInt6243 / i));
                            int i_552_ = (int) (Class95.aFloat1236 * (float) i_546_ + (Class242.aFloat2699 + ((float) i_545_ * Class136_Sub2.aFloat8395) + ((float) anInt6352 * (Node_Sub8_Sub17.aFloat9057))));
                            if (((ha_Sub3) aHa_Sub3_6380).anInt6173 <= i_549_ || ((i_552_ ^ 0xffffffff) <= (((ha_Sub3) aHa_Sub3_6380).anInt6173 ^ 0xffffffff))) {
                                ((Class346_Sub9) class346_sub9).anInt8344 = (-(((Class346_Sub9) class346_sub9).anInt8347) + (((ha_Sub3) aHa_Sub3_6380).anInt6246 + ((anInt6307 + i_547_) * (((ha_Sub3) aHa_Sub3_6380).anInt6196) / i)));
                                ((Class346_Sub9) class346_sub9).aBoolean8342 = true;
                            }
                        }
                        aHa_Sub3_6380.method977((float) i, -100);
                        aHa_Sub3_6380.method1052((byte) -95);
                        aHa_Sub3_6380.method945(class238_sub2_533_, 127);
                        method1446(83);
                        method1457(-128);
                    }
                }
            }
        }
    }

    final void method1460(int i) {
        if (aClass337_6427 != null)
            aClass337_6427.method3423(true);
        anInt6360++;
        if (aClass337_6392 != null)
            aClass337_6392.method3423(true);
        if (aClass337_6373 != null)
            aClass337_6373.method3423(true);
        if (aClass337_6344 != null)
            aClass337_6344.method3423(true);
        if (aClass95_6375 != null)
            aClass95_6375.method696((byte) -109);
        if (i != 13783)
            method1447(-118);
    }

    static final void method1461(byte i) {
        ((Class381) Class237.aClass381_2644).anInt4675 = 1;
        anInt6429++;
        ha_Sub2.anInt5762 = 0;
        Class238_Sub2.anInt6718 = 0;
        Class290.anInt3408 = 0;
        Class279.anInt3241 = 0;
        ha_Sub3.anInt6076 = 0;
        ha_Sub2.anInt5676 = 0;
        Class285.anInt3364 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10049 = 0;
        Class238_Sub2.anInt6714 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10525 = 0;
        Node_Sub2_Sub3.anInt8856 = 0;
        Class342.anInt3983 = 0;
        Class356.anInt4388 = 0;
        ha_Sub3_Sub1.anInt8668 = 0;
        Class148.anInt5085 = 0;
        Class148.anInt5098 = 0;
        ha_Sub2.anInt5780 = 0;
        Class171.anInt1987 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10337 = 0;
        Player.anInt10569 = 0;
        Class65.anInt887 = 0;
        Class112_Sub1.anInt8623 = 0;
        Class340_Sub9.anInt8211 = 0;
        Class136.anInt4771 = 0;
        ha_Sub3.anInt6137 = 0;
        Class321.anInt3700 = 0;
        Class275.anInt5149 = 0;
        Class276.anInt3183 = 0;
        ha_Sub2.anInt5616 = 0;
        ha_Sub2.anInt5661 = 0;
        Class367.anInt4510 = 0;
        Class282_Sub6.anInt7645 = 0;
        Class84_Sub2.anInt5388 = 0;
        Node_Sub45.anInt7328 = 0;
        RSInterface2.anInt4240 = 0;
        Class308.anInt3571 = 0;
        Class187.anInt2174 = 0;
        Node_Sub15_Sub5.anInt9709 = 0;
        Node_Sub14.anInt6976 = 0;
        Node_Sub8_Sub14.anInt9041 = 0;
        Class46.anInt598 = 0;
        Class207.anInt2396 = 0;
        Class332.anInt3877 = 0;
        Class188.anInt2183 = 0;
        Class54_Sub2.anInt5342 = 0;
        Node_Sub14_Sub31.anInt9482 = 0;
        Class381.anInt4677 = 0;
        Class164.anInt1927 = 0;
        client.anInt5231 = 0;
        Class297_Sub1.anInt8484 = 0;
        Class48.anInt639 = 0;
        Class238_Sub1.anInt6678 = 0;
        Class238_Sub2.anInt6720 = 0;
        Node_Sub42.anInt7294 = 0;
        Class331.anInt3864 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10393 = 0;
        Class45.anInt561 = 0;
        Class352.anInt4177 = 0;
        Class282_Sub25.anInt7856 = 0;
        Node_Sub2_Sub4.anInt8877 = 0;
        Class372.anInt4580 = 0;
        Class249.anInt2815 = 0;
        Class227.anInt2560 = 0;
        Class31.anInt379 = 0;
        Class282_Sub25.anInt7846 = 0;
        Class346_Sub5.anInt8277 = 0;
        Class111.anInt1391 = 0;
        Class43.anInt554 = 0;
        Entity.anInt10496 = 0;
        Class162.anInt1903 = 0;
        Node_Sub2_Sub1.anInt8826 = 0;
        ha_Sub2.anInt5663 = 0;
        Class246.anInt2773 = 0;
        Class205.anInt2382 = 0;
        ha_Sub3_Sub1.anInt8734 = 0;
        Class112.anInt5222 = 0;
        anInt6368 = 0;
        Class46.anInt590 = 0;
        Node_Sub8_Sub20.anInt9089 = 0;
        Node_Sub2_Sub4.anInt8864 = 0;
        Class216.anInt2483 = 0;
        ha.anInt1420 = 0;
        Class273.anInt5005 = 0;
        Class340_Sub9.anInt8202 = 0;
        Applet_Sub1.anInt19 = 0;
        Class82.anInt1021 = 0;
        Class172.anInt1993 = 0;
        Class50.anInt664 = 0;
        Node_Sub22.anInt7072 = 0;
        Class162_Sub2.anInt6520 = 0;
        WorldAddress.anInt1199 = 0;
        r.anInt9035 = 0;
        Class86_Sub1.anInt5511 = 0;
        ha_Sub2.anInt5692 = 0;
        Class191.anInt4823 = 0;
        Node_Sub14_Sub23.anInt9394 = 0;
        Class29.anInt369 = 0;
        Class48.anInt636 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10227 = 0;
        Class162_Sub2.anInt6480 = 0;
        Class376.anInt4947 = 0;
        ByteStream.anInt6925 = 0;
        Class368.anInt4522 = 0;
        ha_Sub2.anInt5656 = 0;
        Node_Sub14_Sub9.anInt9237 = 0;
        Class130.anInt1581 = 0;
        Class48.anInt647 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10367 = 0;
        Node_Sub8_Sub1.anInt8884 = 0;
        Class133.anInt5034 = 0;
        Class258.anInt2949 = 0;
        Class81_Sub1.anInt8419 = 0;
        Node_Sub22.anInt7082 = 0;
        anInt6327 = 0;
        Canvas_Sub1.anInt64 = 0;
        Class152.anInt1811 = 0;
        Class285.anInt3363 = 0;
        Class40.anInt443 = 0;
        Class56.anInt756 = 0;
        Class340_Sub7.anInt8177 = 0;
        Class200.anInt2288 = 0;
        Node_Sub14_Sub19.anInt9363 = 0;
        Class282_Sub22.anInt7823 = 0;
        Class103.anInt1322 = 0;
        Class129_Sub1.anInt8500 = 0;
        Node_Sub8_Sub13_Sub2.anInt10252 = 0;
        r_Sub1.anInt10265 = 0;
        ha_Sub2.anInt5698 = 0;
        Class282_Sub23.anInt7834 = 0;
        Class281.anInt3286 = 0;
        Node_Sub14_Sub18.anInt9349 = 0;
        Node_Sub18.anInt7021 = 0;
        Class265.anInt3007 = 0;
        Node_Sub14_Sub32.anInt9501 = 0;
        Class125.anInt1546 = 0;
        ha_Sub3.anInt6112 = 0;
        ObjectDefinition.anInt3031 = 0;
        Class316.anInt3665 = 0;
        Node_Sub1.anInt6801 = 0;
        Class112.anInt5225 = 0;
        Class112_Sub1.anInt8621 = 0;
        Node_Sub36.anInt7259 = 0;
        Class282_Sub10.anInt7686 = 0;
        Class129_Sub2.anInt8535 = 0;
        Node_Sub14_Sub19.anInt9360 = 0;
        Class14.anInt262 = 0;
        Class223.anInt5181 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10108 = 0;
        anInt6419 = 0;
        ha_Sub2.anInt5668 = 0;
        Class129_Sub2.anInt8532 = 0;
        Class203.anInt2307 = 0;
        Class212.anInt2455 = 0;
        Class79.anInt1007 = 0;
        Applet_Sub1.anInt6 = 0;
        Class229.anInt2594 = 0;
        Class257.anInt2940 = 0;
        Class30.anInt376 = 0;
        Class346_Sub7_Sub5.anInt9962 = 0;
        Node_Sub42_Sub1.anInt9778 = 0;
        Class346_Sub7_Sub4.anInt9949 = 0;
        s.anInt3469 = 0;
        ha_Sub2.anInt5642 = 0;
        Class238_Sub2.anInt6707 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10162 = 0;
        Class254.anInt5129 = 0;
        Class119.anInt1491 = 0;
        Node_Sub8_Sub20.anInt9100 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10172 = 0;
        Class301_Sub3.anInt8442 = 0;
        ha.anInt1419 = 0;
        Class6.anInt151 = 0;
        Class86.anInt1069 = 0;
        Class367.anInt4499 = 0;
        Class282_Sub15.anInt7743 = 0;
        Class275_Sub1.anInt8585 = 0;
        Class279_Sub1_Sub1.anInt9816 = 0;
        Class54_Sub2.anInt5339 = 0;
        Class340.anInt3958 = 0;
        Node_Sub8_Sub1.anInt8894 = 0;
        Class254.anInt5131 = 0;
        Class285.anInt3362 = 0;
        Class71.anInt5029 = 0;
        Class112_Sub1.anInt8625 = 0;
        Class111_Sub1.anInt5530 = 0;
        Class119.anInt1495 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10402 = 0;
        Node_Sub2_Sub1.anInt8835 = 0;
        Class352.anInt4180 = 0;
        Class46.anInt585 = 0;
        Class112.anInt5214 = 0;
        Class225.anInt4996 = 0;
        Node_Sub8_Sub15.anInt9043 = 0;
        Class94.anInt1210 = 0;
        Class72.anInt4873 = 0;
        Class299.anInt3490 = 0;
        Class297_Sub1.anInt8480 = 0;
        ha_Sub2.anInt5633 = 0;
        Class303.anInt3524 = 0;
        Class240.anInt2677 = 0;
        Class86.anInt1059 = 0;
        NPC.anInt10593 = 0;
        ha_Sub3.anInt6102 = 0;
        Class332.anInt3868 = 0;
        ha_Sub2.anInt5711 = 0;
        ha_Sub2.anInt5722 = 0;
        Class198.anInt2255 = 0;
        ha_Sub3_Sub1.anInt8655 = 0;
        Class340_Sub10.anInt8219 = 0;
        Class253_Sub1.anInt7492 = 0;
        InputStream_Sub2.anInt81 = 0;
        ha_Sub3.anInt6064 = 0;
        Node_Sub2_Sub3.anInt8857 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10529 = 0;
        Class182.anInt2126 = 0;
        Class307.anInt3554 = 0;
        Class49.anInt653 = 0;
        Class84_Sub6.anInt5450 = 0;
        ha_Sub2.anInt5708 = 0;
        ha_Sub3.anInt6114 = 0;
        ha_Sub3.anInt5970 = 0;
        Node_Sub8.anInt6863 = 0;
        Class332.anInt3873 = 0;
        Class26.anInt348 = 0;
        Node_Sub15_Sub1.anInt9602 = 0;
        aa_Sub3.anInt5267 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10323 = 0;
        client.anInt5236 = 0;
        Class58.anInt5080 = 0;
        ByteStream.anInt6890 = 0;
        Class156.anInt1862 = 0;
        Class261.anInt2970 = 0;
        ha_Sub3.anInt6018 = 0;
        Class54_Sub1.anInt5320 = 0;
        Class255.anInt2888 = 0;
        Node_Sub51.anInt7468 = 0;
        Class162_Sub2.anInt6526 = 0;
        ha_Sub3.anInt6044 = 0;
        Class282_Sub14.anInt7729 = 0;
        Class346_Sub7_Sub4.anInt9946 = 0;
        Node_Sub14_Sub5.anInt9199 = 0;
        ha_Sub2.anInt5758 = 0;
        Node.anInt2798 = 0;
        Class340_Sub2.anInt8106 = 0;
        Class136_Sub4.anInt8418 = 0;
        Class253_Sub1.anInt7499 = 0;
        Node_Sub47.anInt7411 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10168 = 0;
        Class291.anInt4744 = 0;
        Node_Sub14_Sub13.anInt9281 = 0;
        anInt6423 = 0;
        IncommingOpcode.anInt1471 = 0;
        Class189.anInt5069 = 0;
        Applet_Sub1.anInt41 = 0;
        ha_Sub2.anInt5598 = 0;
        Class64.anInt857 = 0;
        Node_Sub20.anInt7049 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10189 = 0;
        anInt6388 = 0;
        Class282_Sub29.anInt7900 = 0;
        ha_Sub2.anInt5759 = 0;
        Class38.anInt421 = 0;
        ByteStream.anInt6891 = 0;
        Class337.anInt3931 = 0;
        ha_Sub3_Sub1.anInt8656 = 0;
        Node_Sub15_Sub5.anInt9712 = 0;
        Class316_Sub1_Sub2.anInt9852 = 0;
        Class44_Sub1.anInt5289 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10380 = 0;
        Class347.anInt4139 = 0;
        ha_Sub2.anInt5694 = 0;
        Class194.anInt2226 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10211 = 0;
        ByteStream.anInt6893 = 0;
        Class321.anInt3733 = 0;
        PacketStream.anInt9110 = 0;
        ha_Sub3.anInt5974 = 0;
        Class342.anInt3990 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10093 = 0;
        anInt6312 = 0;
        Class282_Sub26.anInt7866 = 0;
        Class136_Sub3.anInt8399 = 0;
        NPC.anInt10607 = 0;
        Class235.anInt2619 = 0;
        Class302.anInt3507 = 0;
        Class218.anInt2491 = 0;
        ha_Sub3.anInt6053 = 0;
        Class265.anInt3004 = 0;
        Class340_Sub2.anInt8111 = 0;
        Class74.anInt946 = 0;
        Applet_Sub1.anInt32 = 0;
        Class162_Sub2.anInt6494 = 0;
        ha_Sub3.anInt6038 = 0;
        ha_Sub2.anInt5791 = 0;
        aa_Sub3.anInt5264 = 0;
        Class223.anInt5175 = 0;
        Node_Sub15_Sub1.anInt9619 = 0;
        Class315.anInt3656 = 0;
        Class179.anInt2085 = 0;
        Class192.anInt2213 = 0;
        Class150.anInt1782 = 0;
        Class130.anInt1589 = 0;
        Class283.anInt3334 = 0;
        Node_Sub14_Sub7.anInt9222 = 0;
        Class48.anInt644 = 0;
        Class326.anInt4813 = 0;
        Class279_Sub2_Sub2.anInt9837 = 0;
        Node_Sub14_Sub30.anInt9472 = 0;
        Class155.anInt1840 = 0;
        Node_Sub45.anInt7331 = 0;
        Class278.anInt3230 = 0;
        Class138.anInt1653 = 0;
        Class223.anInt5177 = 0;
        Class351.anInt4731 = 0;
        ObjectDefinition.anInt3048 = 0;
        Node_Sub24.anInt7115 = 0;
        client.anInt5243 = 0;
        anInt6430 = 0;
        Class371.anInt4559 = 0;
        r_Sub1.anInt10270 = 0;
        Class48.anInt629 = 0;
        Class34.anInt393 = 0;
        ha_Sub2.anInt5706 = 0;
        ha.anInt1421 = 0;
        Class282_Sub15.anInt7744 = 0;
        Class282_Sub7.anInt7659 = 0;
        Applet_Sub1.anInt13 = 0;
        Node_Sub14_Sub16.anInt9336 = 0;
        Node_Sub42_Sub2.anInt9785 = 0;
        ha.anInt1422 = 0;
        Class84_Sub4.anInt5404 = 0;
        Class282_Sub13.anInt7717 = 0;
        Class381.anInt4668 = 0;
        ha_Sub3_Sub1.anInt8702 = 0;
        Class162_Sub2.anInt6498 = 0;
        Player.anInt10574 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10203 = 0;
        Class282_Sub15.anInt7740 = 0;
        ha_Sub3.anInt6031 = 0;
        ha_Sub2.anInt5743 = 0;
        ha.anInt1416 = 0;
        Class235.anInt2620 = 0;
        Class230.anInt2601 = 0;
        Class16.anInt285 = 0;
        Class226_Sub2_Sub1.anInt8807 = 0;
        RuntimeException_Sub1.anInt4706 = 0;
        Class2.anInt127 = 0;
        Class51.anInt695 = 0;
        Node_Sub48.anInt7429 = 0;
        Class282_Sub29.anInt7899 = 0;
        Class155.anInt1831 = 0;
        Class129_Sub1.anInt8488 = 0;
        Player.anInt10579 = 0;
        anInt6406 = 0;
        ha_Sub3.anInt5985 = 0;
        Node_Sub1.anInt6816 = 0;
        ha_Sub2.anInt5651 = 0;
        Class43.anInt552 = 0;
        Class162.anInt1902 = 0;
        ha_Sub3.anInt6132 = 0;
        ha_Sub3_Sub1.anInt8680 = 0;
        ha_Sub3.anInt6097 = 0;
        Class225_Sub1.anInt8458 = 0;
        Class144.anInt1695 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10013 = 0;
        Class340.anInt3950 = 0;
        RSInterface2.anInt4354 = 0;
        Class238_Sub2.anInt6723 = 0;
        Class270.anInt3137 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10210 = 0;
        Class86.anInt1057 = 0;
        Node_Sub39_Sub2.anInt9756 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10341 = 0;
        Node_Sub14_Sub15.anInt9317 = 0;
        Class223.anInt5179 = 0;
        Class287.anInt3384 = 0;
        Node_Sub48.anInt7423 = 0;
        Class368.anInt4529 = 0;
        Class330_Sub1.anInt8064 = 0;
        Class321.anInt3717 = 0;
        Class139.anInt1659 = 0;
        Node_Sub14_Sub20.anInt9366 = 0;
        ha_Sub3.anInt6082 = 0;
        Node_Sub33.anInt7201 = 0;
        Class17.anInt289 = 0;
        Class282_Sub13.anInt7722 = 0;
        Class81.anInt4914 = 0;
        Class129_Sub2.anInt8518 = 0;
        Class225_Sub2.anInt8469 = 0;
        Class112_Sub4.anInt8649 = 0;
        Class70.anInt920 = 0;
        Class136_Sub2.anInt8387 = 0;
        Class124.anInt1538 = 0;
        Class282_Sub2.anInt7601 = 0;
        Class54_Sub4.anInt5364 = 0;
        Class182.anInt2111 = 0;
        ha.anInt1410 = 0;
        Class284.anInt3353 = 0;
        ByteStream.anInt6902 = 0;
        Node_Sub14_Sub28.anInt9458 = 0;
        Class349_Sub1.anInt4791 = 0;
        s_Sub2.anInt7956 = 0;
        Class353.anInt4190 = 0;
        Class269_Sub2.anInt7537 = 0;
        Class237.anInt2642 = 0;
        ha_Sub3_Sub1.anInt8658 = 0;
        Class185.anInt2163 = 0;
        Class332.anInt3865 = 0;
        Node_Sub24.anInt7107 = 0;
        Class9.anInt194 = 0;
        Class290.anInt3404 = 0;
        ha_Sub2.anInt5750 = 0;
        ha_Sub2.anInt5680 = 0;
        Class282_Sub23.anInt7828 = 0;
        Class375.anInt4601 = 0;
        Class84_Sub4.anInt5407 = 0;
        Class340_Sub10.anInt8226 = 0;
        ByteStream.anInt6888 = 0;
        Node_Sub21.anInt7053 = 0;
        WorldAddress.anInt1194 = 0;
        ha_Sub2.anInt5707 = 0;
        Node_Sub8.anInt6861 = 0;
        Class86.anInt1079 = 0;
        Class162_Sub2.anInt6519 = 0;
        Class173.anInt2013 = 0;
        Class340_Sub2.anInt8104 = 0;
        Node_Sub11_Sub1.anInt9142 = 0;
        Class310.anInt3579 = 0;
        Class340_Sub7.anInt8170 = 0;
        Node_Sub14_Sub18.anInt9347 = 0;
        Node_Sub8_Sub19.anInt9081 = 0;
        Node_Sub8_Sub6.anInt8941 = 0;
        Class346_Sub7_Sub2_Sub1.anInt9994 = 0;
        client.anInt5234 = 0;
        Class242.anInt2701 = 0;
        Class272.anInt3168 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10360 = 0;
        ha.anInt1415 = 0;
        Canvas_Sub1.anInt66 = 0;
        Class219.anInt2522 = 0;
        client.anInt5240 = 0;
        Node_Sub20.anInt7047 = 0;
        Class239.anInt2666 = 0;
        Class282_Sub10.anInt7693 = 0;
        ha_Sub3_Sub1.anInt8691 = 0;
        Class285.anInt3360 = 0;
        ha_Sub3.anInt6135 = 0;
        Class308.anInt3573 = 0;
        Class342.anInt3984 = 0;
        anInt6413 = 0;
        Node_Sub33.anInt7203 = 0;
        Class112.anInt5207 = 0;
        Class282_Sub7.anInt7657 = 0;
        Node_Sub14_Sub8.anInt9229 = 0;
        Node_Sub8_Sub1.anInt8902 = 0;
        Class101.anInt1287 = 0;
        Class238_Sub2.anInt6739 = 0;
        s.anInt3462 = 0;
        Class162.anInt1896 = 0;
        Class11.anInt238 = 0;
        Class58.anInt5078 = 0;
        Class129_Sub1.anInt8516 = 0;
        ha_Sub3_Sub1.anInt8720 = 0;
        Class249_Sub1.anInt4713 = 0;
        Node_Sub14_Sub12.anInt9272 = 0;
        Class360.anInt4438 = 0;
        Class16.anInt286 = 0;
        Node_Sub47.anInt7398 = 0;
        Class282_Sub25.anInt7847 = 0;
        Class340_Sub10.anInt8218 = 0;
        Class249.anInt2810 = 0;
        Class340_Sub3.anInt8121 = 0;
        Class84_Sub7.anInt5459 = 0;
        Class282_Sub1.anInt7592 = 0;
        Class256.anInt2934 = 0;
        anInt6351 = 0;
        s_Sub2.anInt7931 = 0;
        Class224.anInt2544 = 0;
        Class381.anInt4660 = 0;
        Class154.anInt1826 = 0;
        ha_Sub2.anInt5645 = 0;
        Class225_Sub3.anInt8474 = 0;
        Class258.anInt2951 = 0;
        ha_Sub3_Sub1.anInt8677 = 0;
        Class353.anInt4200 = 0;
        ha_Sub3_Sub1.anInt8667 = 0;
        Class340_Sub5.anInt8131 = 0;
        Node_Sub15_Sub1.anInt9655 = 0;
        Node_Sub14_Sub13.anInt9298 = 0;
        Class89.anInt1095 = 0;
        Node_Sub14_Sub22.anInt9393 = 0;
        Class162_Sub2.anInt6528 = 0;
        Class238_Sub1.anInt6679 = 0;
        ha_Sub2.anInt5660 = 0;
        Class357.anInt4414 = 0;
        Class55.anInt734 = 0;
        Class131.anInt1595 = 0;
        Class340_Sub9.anInt8212 = 0;
        ha_Sub3_Sub1.anInt8693 = 0;
        Class64.anInt859 = 0;
        Node_Sub15_Sub4.anInt9703 = 0;
        ha_Sub2.anInt5695 = 0;
        Class298.anInt3476 = 0;
        Class249_Sub2.anInt4798 = 0;
        NPC.anInt10598 = 0;
        Class162_Sub2.anInt6551 = 0;
        ha_Sub3.anInt6028 = 0;
        Class64.anInt864 = 0;
        Class282_Sub2.anInt7603 = 0;
        Class361.anInt4451 = 0;
        ByteStream.anInt6932 = 0;
        Class132.anInt1615 = 0;
        ha_Sub3.anInt6106 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10204 = 0;
        Class250.anInt2826 = 0;
        ha_Sub3_Sub1.anInt8712 = 0;
        client.anInt5244 = 0;
        Node_Sub15_Sub1.anInt9608 = 0;
        Class344.anInt4085 = 0;
        Class340_Sub9.anInt8200 = 0;
        Class360.anInt4449 = 0;
        RSInterface2.anInt4318 = 0;
        Entity.anInt10443 = 0;
        Class131.anInt1601 = 0;
        Class32.anInt382 = 0;
        ha_Sub3_Sub1.anInt8688 = 0;
        Node_Sub27.anInt7158 = 0;
        Class346_Sub7_Sub3.anInt9934 = 0;
        Node_Sub14_Sub5.anInt9207 = 0;
        Class269_Sub2.anInt7526 = 0;
        Class192.anInt2209 = 0;
        ha_Sub3.anInt6069 = 0;
        Class186.anInt2169 = 0;
        RSInterface2.anInt4217 = 0;
        Class44_Sub1.anInt5291 = 0;
        Class276.anInt3179 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10165 = 0;
        Class340_Sub5.anInt8135 = 0;
        Class129_Sub1.anInt8509 = 0;
        Class238_Sub2.anInt6741 = 0;
        ByteStream.anInt6937 = 0;
        WorldAddress.anInt1185 = 0;
        Class112_Sub4.anInt8651 = 0;
        Class198.anInt2246 = 0;
        ha_Sub3.anInt5964 = 0;
        Class301.anInt4928 = 0;
        Class249_Sub1.anInt4715 = 0;
        Class282_Sub9.anInt7678 = 0;
        Class361.anInt4450 = 0;
        Class282_Sub9.anInt7675 = 0;
        Class162_Sub2.anInt6558 = 0;
        Class247.anInt2795 = 0;
        Class329.anInt3845 = 0;
        Node_Sub14_Sub4.anInt9189 = 0;
        Class9.anInt185 = 0;
        Class26.anInt353 = 0;
        Node_Sub14_Sub34.anInt9521 = 0;
        s_Sub2.anInt7942 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10151 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10006 = 0;
        Class139.anInt1656 = 0;
        Class238_Sub2.anInt6731 = 0;
        Node_Sub15_Sub1.anInt9631 = 0;
        Class225_Sub1.anInt8456 = 0;
        Class284.anInt3348 = 0;
        Class56.anInt777 = 0;
        ha_Sub3.anInt6080 = 0;
        Class31.anInt381 = 0;
        Class167.anInt1959 = 0;
        Node_Sub8_Sub20.anInt9103 = 0;
        Class141.anInt5050 = 0;
        Class193.anInt2220 = 0;
        Class269_Sub2.anInt7533 = 0;
        Class84_Sub5.anInt5429 = 0;
        Applet_Sub1.anInt29 = 0;
        Node_Sub14_Sub12.anInt9277 = 0;
        Class136_Sub4.anInt8404 = 0;
        Class90.anInt1110 = 0;
        RSInterface2.anInt4292 = 0;
        Class275_Sub1.anInt8589 = 0;
        Class301_Sub1.anInt8430 = 0;
        Class345.anInt4091 = 0;
        Node_Sub8_Sub7.anInt8957 = 0;
        aa_Sub1.anInt5250 = 0;
        Node_Sub39_Sub2.anInt9752 = 0;
        Class282_Sub19.anInt7782 = 0;
        Class59.anInt794 = 0;
        ha_Sub3.anInt6078 = 0;
        ObjectDefinition.anInt3109 = 0;
        Class238_Sub2.anInt6725 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10099 = 0;
        Class111_Sub1.anInt5528 = 0;
        PacketStream.anInt9120 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10173 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10512 = 0;
        Class275.anInt5148 = 0;
        Class283.anInt3324 = 0;
        aa.anInt98 = 0;
        Class112_Sub1.anInt8622 = 0;
        Class346_Sub10.anInt8349 = 0;
        ByteStream.anInt6929 = 0;
        Class39.anInt432 = 0;
        Node_Sub14_Sub10.anInt9246 = 0;
        Class187.anInt2171 = 0;
        Class282_Sub7.anInt7654 = 0;
        anInt6339 = 0;
        ha_Sub3_Sub1.anInt8689 = 0;
        ha_Sub3_Sub1.anInt8654 = 0;
        ha_Sub3.anInt6042 = 0;
        Class375.anInt4612 = 0;
        Class208.anInt2405 = 0;
        ha_Sub2.anInt5620 = 0;
        Class282_Sub28.anInt7883 = 0;
        Node_Sub18.anInt7019 = 0;
        Class343.anInt4035 = 0;
        Node_Sub14_Sub25.anInt9427 = 0;
        Node_Sub11_Sub1.anInt9138 = 0;
        ByteStream.anInt6923 = 0;
        Class9.anInt196 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10096 = 0;
        Class281.anInt3271 = 0;
        Class349_Sub2.anInt4728 = 0;
        Class211.anInt2443 = 0;
        Class28.anInt4886 = 0;
        Class20.anInt307 = 0;
        Class239.anInt2674 = 0;
        Class282_Sub6.anInt7651 = 0;
        PacketStream.anInt9116 = 0;
        ha_Sub3.anInt5968 = 0;
        Class282_Sub6.anInt7643 = 0;
        ha_Sub2.anInt5593 = 0;
        Class12.anInt250 = 0;
        Class340_Sub2.anInt8102 = 0;
        ByteStream.anInt6910 = 0;
        Class25.anInt339 = 0;
        Node_Sub40_Sub1.anInt9760 = 0;
        Class337.anInt3930 = 0;
        Node_Sub15_Sub4.anInt9704 = 0;
        Class50.anInt661 = 0;
        Node_Sub14_Sub26.anInt9431 = 0;
        Class323.anInt3801 = 0;
        Class279_Sub2.anInt7582 = 0;
        Class47.anInt621 = 0;
        Class9.anInt198 = 0;
        ha_Sub2.anInt5653 = 0;
        Class172.anInt1991 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10011 = 0;
        Class162_Sub2.anInt6443 = 0;
        RSInterface2.anInt4361 = 0;
        Class238_Sub2.anInt6756 = 0;
        s_Sub2.anInt7948 = 0;
        Node_Sub8_Sub5.anInt8933 = 0;
        ha_Sub2.anInt5672 = 0;
        Class347.anInt4136 = 0;
        Class262.anInt2978 = 0;
        Class149.anInt1747 = 0;
        Class282_Sub14.anInt7728 = 0;
        Class112_Sub1.anInt8628 = 0;
        Class346_Sub7_Sub1.anInt9905 = 0;
        ha_Sub3_Sub1.anInt8707 = 0;
        Class368.anInt4515 = 0;
        Class215.anInt2480 = 0;
        Class324.anInt3821 = 0;
        Node_Sub15_Sub1.anInt9635 = 0;
        Class257.anInt2942 = 0;
        Class323.anInt3793 = 0;
        Class299.anInt3482 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10397 = 0;
        ha_Sub2.anInt5748 = 0;
        Class323.anInt3797 = 0;
        Node_Sub8_Sub1.anInt8899 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10384 = 0;
        Class269_Sub2.anInt7532 = 0;
        anInt6345 = 0;
        ha_Sub3.anInt6075 = 0;
        Class282_Sub21.anInt7809 = 0;
        Class356.anInt4386 = 0;
        Class76.anInt984 = 0;
        Class282_Sub22.anInt7820 = 0;
        Class113.anInt1395 = 0;
        Class282_Sub29.anInt7897 = 0;
        Class238_Sub1.anInt6685 = 0;
        ByteStream.anInt6915 = 0;
        anInt6353 = 0;
        Class249.anInt2805 = 0;
        s_Sub2.anInt7933 = 0;
        Class380.anInt4640 = 0;
        ha_Sub3.anInt6100 = 0;
        Class36.anInt402 = 0;
        Node_Sub8_Sub20.anInt9096 = 0;
        Class183.anInt2138 = 0;
        Class282_Sub23.anInt7832 = 0;
        Class129_Sub2.anInt8544 = 0;
        Node_Sub8_Sub20.anInt9093 = 0;
        ha_Sub2.anInt5728 = 0;
        Class337.anInt3926 = 0;
        Class282_Sub10.anInt7690 = 0;
        aa_Sub2.anInt5258 = 0;
        Node_Sub2.anInt6823 = 0;
        Class223.anInt5189 = 0;
        ha_Sub3.anInt5981 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10109 = 0;
        Class340.anInt3956 = 0;
        Node_Sub45.anInt7312 = 0;
        ha_Sub2.anInt5604 = 0;
        ha_Sub3.anInt5965 = 0;
        Node_Sub15_Sub5.anInt9710 = 0;
        Class249_Sub2.anInt4799 = 0;
        anInt6310 = 0;
        Node_Sub14_Sub38.anInt9570 = 0;
        s_Sub3.anInt7999 = 0;
        Class214.anInt2471 = 0;
        Class119.anInt1494 = 0;
        Class321.anInt3772 = 0;
        Class238_Sub2.anInt6704 = 0;
        Class282_Sub28.anInt7889 = 0;
        Node_Sub15_Sub1.anInt9615 = 0;
        Class340_Sub2.anInt8105 = 0;
        Class342.anInt3985 = 0;
        Class136_Sub1.anInt8382 = 0;
        Class282_Sub24.anInt7842 = 0;
        Class84_Sub6.anInt5444 = 0;
        Class282_Sub27.anInt7868 = 0;
        Node_Sub8_Sub13.anInt9029 = 0;
        s_Sub3.anInt8008 = 0;
        Entity.anInt10489 = 0;
        Node_Sub15_Sub1.anInt9661 = 0;
        Class162.anInt1908 = 0;
        Class47.anInt614 = 0;
        ObjectDefinition.anInt3090 = 0;
        Class340.anInt3957 = 0;
        Class81.anInt4903 = 0;
        Applet_Sub1.anInt27 = 0;
        Class212.anInt2454 = 0;
        Class18.anInt296 = 0;
        Class331.anInt3858 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10355 = 0;
        Class8.anInt178 = 0;
        Class84_Sub4.anInt5413 = 0;
        Class162_Sub2.anInt6557 = 0;
        Class282_Sub2.anInt7604 = 0;
        Class255.anInt2863 = 0;
        Class60.anInt820 = 0;
        Class162_Sub2.anInt6534 = 0;
        ha_Sub2.anInt5700 = 0;
        Class279_Sub2_Sub2.anInt9840 = 0;
        Node_Sub15_Sub1.anInt9670 = 0;
        Class368.anInt4518 = 0;
        Class310.anInt3583 = 0;
        Class289.anInt3400 = 0;
        Class370.anInt4549 = 0;
        ha_Sub2.anInt5629 = 0;
        Node_Sub8_Sub7.anInt8954 = 0;
        Class54_Sub2.anInt5338 = 0;
        s_Sub3.anInt8000 = 0;
        Class114.anInt1428 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10064 = 0;
        Class301_Sub1.anInt8429 = 0;
        Class331.anInt3861 = 0;
        Node_Sub15_Sub1.anInt9614 = 0;
        Class283.anInt3339 = 0;
        Class301_Sub3.anInt8441 = 0;
        Node_Sub14_Sub20.anInt9372 = 0;
        Class278.anInt3224 = 0;
        ha_Sub3_Sub1.anInt8679 = 0;
        anInt6425 = 0;
        Class279_Sub1.anInt7559 = 0;
        ha_Sub3.anInt6017 = 0;
        Node_Sub8_Sub10.anInt8985 = 0;
        Class238_Sub2.anInt6738 = 0;
        Class226_Sub1_Sub1.anInt8799 = 0;
        Class284.anInt3347 = 0;
        Class112_Sub4.anInt8652 = 0;
        Class238_Sub2.anInt6734 = 0;
        Class269.anInt3129 = 0;
        ha_Sub3.anInt5980 = 0;
        Node_Sub46.anInt7377 = 0;
        Class254.anInt5130 = 0;
        Class372.anInt4578 = 0;
        Class84_Sub7.anInt5460 = 0;
        anInt6418 = 0;
        Class51.anInt678 = 0;
        ObjectDefinition.anInt3067 = 0;
        ha_Sub3_Sub1.anInt8731 = 0;
        Class103.anInt1320 = 0;
        Node_Sub14_Sub15.anInt9321 = 0;
        aa_Sub2.anInt5261 = 0;
        ha_Sub2.anInt5665 = 0;
        RSInterface2.anInt4347 = 0;
        ha_Sub3.anInt5969 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10002 = 0;
        Class84_Sub6.anInt5436 = 0;
        Canvas_Sub1.anInt68 = 0;
        Class275_Sub2.anInt8601 = 0;
        Class215.anInt2479 = 0;
        Class255.anInt2909 = 0;
        Class330_Sub1.anInt8055 = 0;
        Class340_Sub6.anInt8159 = 0;
        Node_Sub42_Sub1.anInt9780 = 0;
        Class56.anInt776 = 0;
        Player.anInt10539 = 0;
        Class49.anInt654 = 0;
        ha_Sub3.anInt6003 = 0;
        Node_Sub15_Sub1.anInt9638 = 0;
        Class328.anInt3841 = 0;
        Class146.anInt1727 = 0;
        Class65.anInt888 = 0;
        Node_Sub8_Sub7.anInt8960 = 0;
        Node_Sub14_Sub16.anInt9334 = 0;
        ha_Sub3.anInt6103 = 0;
        Class129_Sub2.anInt8523 = 0;
        Class152.anInt1810 = 0;
        ByteStream.anInt6877 = 0;
        Class368.anInt4527 = 0;
        ha_Sub3.anInt6091 = 0;
        Class150.anInt1764 = 0;
        Node_Sub14_Sub11.anInt9261 = 0;
        Class269_Sub2.anInt7530 = 0;
        Class86.anInt1076 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10188 = 0;
        ha_Sub3.anInt6005 = 0;
        Class172.anInt1994 = 0;
        Class223.anInt5184 = 0;
        Class154.anInt1821 = 0;
        Class149.anInt1750 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10344 = 0;
        Class102.anInt1294 = 0;
        Class238_Sub1.anInt6695 = 0;
        Class282_Sub28.anInt7888 = 0;
        Class323.anInt3794 = 0;
        ha_Sub3_Sub1.anInt8727 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10528 = 0;
        Node_Sub13.anInt6968 = 0;
        Class282_Sub5.anInt7638 = 0;
        Class107.anInt1350 = 0;
        Class238_Sub2.anInt6717 = 0;
        Class282_Sub11.anInt7704 = 0;
        Class282_Sub9.anInt7683 = 0;
        Class282_Sub14.anInt7734 = 0;
        Class169.anInt1976 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10396 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10342 = 0;
        Class349_Sub1.anInt4794 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10047 = 0;
        Class340_Sub9.anInt8205 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10526 = 0;
        anInt6424 = 0;
        ha_Sub3.anInt6145 = 0;
        Class162_Sub2.anInt6457 = 0;
        Class131.anInt1594 = 0;
        NPC.anInt10605 = 0;
        Node_Sub45.anInt7366 = 0;
        Class162_Sub2.anInt6503 = 0;
        Class98.anInt1262 = 0;
        Class179.anInt2088 = 0;
        Class84_Sub4.anInt5409 = 0;
        Class346_Sub7_Sub3.anInt9939 = 0;
        Node_Sub15_Sub5.anInt9727 = 0;
        Class225.anInt4998 = 0;
        Class33.anInt4902 = 0;
        Class340_Sub5.anInt8130 = 0;
        ha_Sub3.anInt6120 = 0;
        Class56.anInt755 = 0;
        Class282_Sub21.anInt7808 = 0;
        ha_Sub2.anInt5701 = 0;
        Node_Sub40_Sub1.anInt9765 = 0;
        Class249_Sub2.anInt4796 = 0;
        Node_Sub8_Sub13_Sub2.anInt10255 = 0;
        Class102.anInt1305 = 0;
        ByteStream.anInt6882 = 0;
        Class4.anInt141 = 0;
        Class51.anInt676 = 0;
        Class282_Sub2.anInt7602 = 0;
        PacketStream.anInt9115 = 0;
        Class84_Sub2.anInt5385 = 0;
        ha_Sub2.anInt5674 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10114 = 0;
        s_Sub3.anInt7988 = 0;
        anInt6348 = 0;
        Class253_Sub1.anInt7508 = 0;
        Class136.anInt4767 = 0;
        ha_Sub3.anInt5977 = 0;
        ha_Sub3.anInt6052 = 0;
        Canvas_Sub1.anInt65 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10179 = 0;
        Class229.anInt2585 = 0;
        Class238_Sub2.anInt6736 = 0;
        Node_Sub2_Sub1.anInt8833 = 0;
        Class298.anInt3475 = 0;
        ha_Sub2.anInt5761 = 0;
        Class251.anInt2832 = 0;
        Class209.anInt2417 = 0;
        Entity.anInt10483 = 0;
        PacketStream.anInt9119 = 0;
        Class381.anInt4662 = 0;
        ha_Sub3_Sub1.anInt8721 = 0;
        Class301.anInt4927 = 0;
        Class112_Sub3.anInt8639 = 0;
        Node_Sub4.anInt6835 = 0;
        Class108.anInt1362 = 0;
        Node_Sub15_Sub1.anInt9654 = 0;
        Class378.anInt4637 = 0;
        anInt6362 = 0;
        Class51.anInt677 = 0;
        Class326.anInt4816 = 0;
        Class162_Sub2.anInt6555 = 0;
        Node_Sub18.anInt7022 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10071 = 0;
        Class126.anInt1558 = 0;
        Class133.anInt5046 = 0;
        Class282_Sub2.anInt7599 = 0;
        OutgoingOpcode.anInt1920 = 0;
        Class312.anInt3628 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10359 = 0;
        Class129_Sub2.anInt8546 = 0;
        anInt6360 = 0;
        NPC.anInt10606 = 0;
        Class340_Sub2.anInt8107 = 0;
        Class340_Sub9.anInt8208 = 0;
        Class156.anInt1860 = 0;
        Node_Sub8_Sub16_Sub1.anInt10298 = 0;
        Class162_Sub2.anInt6545 = 0;
        Class330_Sub1.anInt8057 = 0;
        Class323.anInt3806 = 0;
        Class316_Sub1.anInt8047 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10377 = 0;
        Class279_Sub2.anInt7584 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10010 = 0;
        Class161.anInt1893 = 0;
        Class140.anInt1665 = 0;
        ObjectDefinition.anInt3098 = 0;
        Class238_Sub3.anInt6790 = 0;
        Class310_Sub1.anInt8032 = 0;
        ha_Sub3.anInt6021 = 0;
        ObjectDefinition.anInt3094 = 0;
        ha_Sub3_Sub1.anInt8681 = 0;
        Class98.anInt1263 = 0;
        Class282_Sub29.anInt7902 = 0;
        Class282_Sub25.anInt7851 = 0;
        Class84_Sub8.anInt5478 = 0;
        Node_Sub25.anInt5160 = 0;
        Class219.anInt2518 = 0;
        RSInterface2.anInt4315 = 0;
        Class50.anInt671 = 0;
        Class155.anInt1835 = 0;
        Class276.anInt3177 = 0;
        Class225_Sub2.anInt8468 = 0;
        Class51.anInt688 = 0;
        Class331.anInt3859 = 0;
        Node_Sub8.anInt6872 = 0;
        Class340_Sub10.anInt8217 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10197 = 0;
        Class164.anInt1922 = 0;
        Node_Sub2_Sub3.anInt8860 = 0;
        Class162_Sub2.anInt6446 = 0;
        Node_Sub26.anInt7127 = 0;
        Class127.anInt1561 = 0;
        ByteStream.anInt6889 = 0;
        Class32.anInt384 = 0;
        Node.anInt2797 = 0;
        Class281.anInt3302 = 0;
        Node_Sub14_Sub33.anInt9515 = 0;
        ByteStream.anInt6930 = 0;
        ha_Sub2.anInt5785 = 0;
        ha_Sub2.anInt5744 = 0;
        Class340_Sub3.anInt8119 = 0;
        Class282_Sub15.anInt7736 = 0;
        Node_Sub42_Sub3.anInt9795 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10000 = 0;
        Class282_Sub27.anInt7867 = 0;
        Entity.anInt10464 = 0;
        ha_Sub2.anInt5667 = 0;
        Class283.anInt3332 = 0;
        Class381.anInt4651 = 0;
        Class238_Sub1.anInt6701 = 0;
        Class129_Sub1.anInt8507 = 0;
        Class227.anInt2552 = 0;
        Class232.anInt2610 = 0;
        Node_Sub14_Sub12_Sub1.anInt10310 = 0;
        Class131.anInt1598 = 0;
        ha_Sub2.anInt5775 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10065 = 0;
        Class74.anInt970 = 0;
        Animable.anInt9926 = 0;
        Class238_Sub2.anInt6746 = 0;
        Class343.anInt4074 = 0;
        Class84_Sub9.anInt5494 = 0;
        Class238_Sub2.anInt6722 = 0;
        IncommingOpcode.anInt1475 = 0;
        Class282_Sub16.anInt7765 = 0;
        Class158.anInt1878 = 0;
        Class13.anInt257 = 0;
        ha_Sub2.anInt5623 = 0;
        Class27.anInt359 = 0;
        RSInterface.anInt6847 = 0;
        Class71.anInt5031 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10135 = 0;
        Class291.anInt4751 = 0;
        Player.anInt10563 = 0;
        Class154.anInt1824 = 0;
        Class223.anInt5188 = 0;
        Class42.anInt536 = 0;
        Node_Sub15_Sub1.anInt9605 = 0;
        Class282_Sub8.anInt7672 = 0;
        Class279_Sub2_Sub1.anInt9827 = 0;
        Class132.anInt1613 = 0;
        Class282.anInt3322 = 0;
        ha_Sub3.anInt5953 = 0;
        ByteStream.anInt6931 = 0;
        Class282_Sub26.anInt7864 = 0;
        Class178.anInt2076 = 0;
        anInt6376 = 0;
        Class282_Sub20.anInt7799 = 0;
        Node_Sub15_Sub1.anInt9644 = 0;
        Class259.anInt2956 = 0;
        Class282_Sub16.anInt7763 = 0;
        Class112.anInt5211 = 0;
        ha_Sub3.anInt6111 = 0;
        Class110.anInt1382 = 0;
        Class162_Sub2.anInt6506 = 0;
        Class304.anInt3533 = 0;
        ha_Sub3.anInt6096 = 0;
        za.anInt7486 = 0;
        Player.anInt10537 = 0;
        Class238_Sub2.anInt6745 = 0;
        Class162_Sub2.anInt6471 = 0;
        Class207.anInt2397 = 0;
        Class299.anInt3488 = 0;
        Class228.anInt2569 = 0;
        Class310_Sub1.anInt8034 = 0;
        Class194.anInt2221 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10112 = 0;
        Class124.anInt1530 = 0;
        Class144.anInt1694 = 0;
        Class310_Sub1.anInt8041 = 0;
        Class357.anInt4412 = 0;
        ByteStream.anInt6881 = 0;
        Node_Sub14_Sub14.anInt9303 = 0;
        Node_Sub14_Sub39.anInt9592 = 0;
        Class285.anInt3357 = 0;
        ha.anInt1406 = 0;
        Node_Sub14_Sub10.anInt9252 = 0;
        Class381.anInt4682 = 0;
        Class321.anInt3727 = 0;
        Class162_Sub2.anInt6547 = 0;
        Class345.anInt4103 = 0;
        Class343.anInt4067 = 0;
        Class363.anInt4473 = 0;
        Class238_Sub1.anInt6689 = 0;
        Class219.anInt2520 = 0;
        ha_Sub3.anInt5954 = 0;
        Class15.anInt276 = 0;
        Class255.anInt2906 = 0;
        Class148.anInt5104 = 0;
        Node_Sub50.anInt7442 = 0;
        Class79.anInt1000 = 0;
        aa.anInt103 = 0;
        Node_Sub14_Sub38.anInt9569 = 0;
        Class162_Sub2.anInt6460 = 0;
        Class238_Sub3.anInt6765 = 0;
        Interactable.anInt8311 = 0;
        Class340_Sub6.anInt8151 = 0;
        ha_Sub3.anInt5978 = 0;
        Class269_Sub2.anInt7536 = 0;
        Class344.anInt4088 = 0;
        Class162_Sub2.anInt6523 = 0;
        Class326.anInt4815 = 0;
        Class377.anInt4625 = 0;
        Node_Sub2_Sub4.anInt8866 = 0;
        anInt6390 = 0;
        Class129_Sub2.anInt8530 = 0;
        Class131.anInt1602 = 0;
        Class162_Sub2.anInt6485 = 0;
        Class130.anInt1585 = 0;
        Node_Sub14_Sub26.anInt9438 = 0;
        Class44.anInt556 = 0;
        Class282_Sub5.anInt7635 = 0;
        Class340_Sub6.anInt8152 = 0;
        Class179.anInt2087 = 0;
        NPC.anInt10600 = 0;
        Class291.anInt4741 = 0;
        aa_Sub1.anInt5248 = 0;
        Node_Sub14.anInt6975 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10335 = 0;
        Animable.anInt9928 = 0;
        Node_Sub11.anInt6957 = 0;
        Class15.anInt270 = 0;
        ha_Sub3.anInt6024 = 0;
        Class130.anInt1583 = 0;
        Player.anInt10568 = 0;
        Class237.anInt2633 = 0;
        Class56.anInt772 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10131 = 0;
        Class225_Sub1_Sub1.anInt9980 = 0;
        Class310.anInt3586 = 0;
        Node_Sub48.anInt7426 = 0;
        Class255.anInt2908 = 0;
        ha_Sub2.anInt5774 = 0;
        ha_Sub3.anInt5960 = 0;
        s_Sub3.anInt8001 = 0;
        ByteStream.anInt6935 = 0;
        ha_Sub3.anInt6087 = 0;
        Class340_Sub3.anInt8116 = 0;
        Class338.anInt3936 = 0;
        Class112_Sub4.anInt8646 = 0;
        Class282_Sub18.anInt7777 = 0;
        Class255.anInt2856 = 0;
        Class228.anInt2566 = 0;
        Class316_Sub1.anInt8048 = 0;
        ha_Sub2.anInt5615 = 0;
        Class282_Sub9.anInt7676 = 0;
        Class307.anInt3553 = 0;
        Class84_Sub3.anInt5394 = 0;
        Class102.anInt1303 = 0;
        Node_Sub8_Sub12.anInt9009 = 0;
        ByteStream.anInt6928 = 0;
        Class282_Sub23.anInt7827 = 0;
        Class64.anInt861 = 0;
        Class381.anInt4652 = 0;
        Class330_Sub1.anInt8060 = 0;
        Class45.anInt574 = 0;
        ha_Sub3.anInt6002 = 0;
        Class189.anInt5072 = 0;
        NPC.anInt10611 = 0;
        Node_Sub40_Sub1.anInt9769 = 0;
        Class145.anInt1718 = 0;
        Class129_Sub1.anInt8498 = 0;
        Class40.anInt445 = 0;
        Node_Sub15_Sub1.anInt9662 = 0;
        Class86.anInt1081 = 0;
        Class108.anInt1369 = 0;
        Class210.anInt2429 = 0;
        Class249.anInt2806 = 0;
        Class355.anInt4383 = 0;
        Class282_Sub23.anInt7831 = 0;
        Class279_Sub1.anInt7567 = 0;
        Class74.anInt950 = 0;
        Class84_Sub4.anInt5415 = 0;
        Class222.anInt2538 = 0;
        ha_Sub3.anInt6068 = 0;
        ha_Sub3.anInt6107 = 0;
        Class136.anInt4766 = 0;
        Class151.anInt1791 = 0;
        Class269_Sub2.anInt7547 = 0;
        Class65.anInt893 = 0;
        Class281.anInt3304 = 0;
        Entity.anInt10442 = 0;
        Class378.anInt4633 = 0;
        Class221.anInt2532 = 0;
        Class239.anInt2664 = 0;
        Node_Sub14_Sub1.anInt9156 = 0;
        Class108.anInt1360 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10152 = 0;
        Node_Sub8_Sub10.anInt8971 = 0;
        Class282_Sub8.anInt7673 = 0;
        Class376.anInt4941 = 0;
        Class194.anInt2225 = 0;
        Class226.anInt2548 = 0;
        Class80.anInt1008 = 0;
        Class162_Sub2.anInt6464 = 0;
        Class282_Sub22.anInt7826 = 0;
        Node_Sub8_Sub5.anInt8931 = 0;
        Node_Sub14.anInt6979 = 0;
        Applet_Sub1.anInt8 = 0;
        Class223.anInt5187 = 0;
        Class358.anInt4423 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10387 = 0;
        Class317.anInt3669 = 0;
        Node_Sub42_Sub2.anInt9789 = 0;
        ha_Sub2.anInt5689 = 0;
        Class42.anInt538 = 0;
        r_Sub2.anInt10281 = 0;
        Class148.anInt5108 = 0;
        Node_Sub2_Sub1.anInt8816 = 0;
        Class340.anInt3951 = 0;
        Node_Sub8_Sub10.anInt8977 = 0;
        Node_Sub25.anInt5154 = 0;
        Applet_Sub1.anInt11 = 0;
        Class269_Sub2.anInt7528 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10222 = 0;
        Class219.anInt2516 = 0;
        Class34.anInt390 = 0;
        Class310.anInt3607 = 0;
        Class54_Sub3.anInt5356 = 0;
        ha_Sub2.anInt5738 = 0;
        Class282_Sub27.anInt7870 = 0;
        Node_Sub14_Sub12_Sub1.anInt10305 = 0;
        Class340_Sub5.anInt8141 = 0;
        Class111_Sub1.anInt5523 = 0;
        Class356.anInt4387 = 0;
        ha_Sub2.anInt5678 = 0;
        Node_Sub40_Sub1.anInt9770 = 0;
        Node_Sub25.anInt5155 = 0;
        Node_Sub15_Sub4.anInt9706 = 0;
        Node_Sub29.anInt7167 = 0;
        Class345.anInt4099 = 0;
        Class54_Sub2.anInt5335 = 0;
        Class61.anInt829 = 0;
        ha_Sub3.anInt6033 = 0;
        Class85.anInt1041 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10205 = 0;
        Class278.anInt3225 = 0;
        Class162_Sub2.anInt6487 = 0;
        Class238_Sub1.anInt6676 = 0;
        Node_Sub14_Sub22.anInt9389 = 0;
        Class381.anInt4650 = 0;
        Node_Sub15_Sub5.anInt9722 = 0;
        Class372.anInt4582 = 0;
        client.anInt5235 = 0;
        ha_Sub2.anInt5765 = 0;
        Node_Sub15_Sub1.anInt9616 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10239 = 0;
        Node_Sub14_Sub38.anInt9577 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10217 = 0;
        Class102.anInt1301 = 0;
        Class258.anInt2946 = 0;
        Class179.anInt2090 = 0;
        Class166.anInt1950 = 0;
        Class345.anInt4113 = 0;
        Class368.anInt4523 = 0;
        Class321.anInt3744 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10332 = 0;
        r_Sub1.anInt10262 = 0;
        Class278.anInt3222 = 0;
        Class119.anInt1490 = 0;
        Class282_Sub16.anInt7761 = 0;
        ha_Sub2.anInt5664 = 0;
        ha_Sub3.anInt5994 = 0;
        Class54_Sub4.anInt5365 = 0;
        ha_Sub3_Sub1.anInt8716 = 0;
        Node_Sub15_Sub1.anInt9604 = 0;
        ha.anInt1417 = 0;
        Class85.anInt1044 = 0;
        Node_Sub14_Sub24.anInt9412 = 0;
        Class136.anInt4769 = 0;
        Node_Sub14_Sub2.anInt9174 = 0;
        Class301_Sub2.anInt8434 = 0;
        Class378.anInt4632 = 0;
        ha_Sub3_Sub1.anInt8738 = 0;
        Node_Sub14_Sub1.anInt9155 = 0;
        Class162_Sub2.anInt6465 = 0;
        Class52.anInt708 = 0;
        Node_Sub21.anInt7065 = 0;
        Class318.anInt3681 = 0;
        Node_Sub14.anInt6974 = 0;
        Class9.anInt183 = 0;
        Class162_Sub2.anInt6553 = 0;
        ha_Sub3.anInt6104 = 0;
        Class282_Sub7.anInt7656 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10185 = 0;
        Class331.anInt3862 = 0;
        Node_Sub14_Sub37.anInt9556 = 0;
        ha_Sub3.anInt6125 = 0;
        Node_Sub40_Sub1.anInt9762 = 0;
        Class56.anInt747 = 0;
        Class330_Sub1.anInt8066 = 0;
        Class50.anInt665 = 0;
        Class65.anInt875 = 0;
        Class74.anInt947 = 0;
        Class129_Sub1.anInt8510 = 0;
        Node_Sub8_Sub6.anInt8938 = 0;
        Class101.anInt1284 = 0;
        ha_Sub3.anInt6130 = 0;
        Class311.anInt3617 = 0;
        Class253_Sub1.anInt7500 = 0;
        Class2.anInt120 = 0;
        Class346_Sub7_Sub4.anInt9945 = 0;
        Class271.anInt3150 = 0;
        Class372.anInt4570 = 0;
        Player.anInt10554 = 0;
        Node_Sub2_Sub2.anInt8846 = 0;
        Class282_Sub27.anInt7873 = 0;
        Class119.anInt1498 = 0;
        Class155.anInt1844 = 0;
        Class184.anInt2149 = 0;
        Class219.anInt2514 = 0;
        Class279_Sub2_Sub2.anInt9839 = 0;
        Class275_Sub2.anInt8608 = 0;
        Class282_Sub17.anInt7766 = 0;
        Class238_Sub2.anInt6729 = 0;
        Node_Sub14_Sub7.anInt9220 = 0;
        r_Sub2.anInt10273 = 0;
        Class282_Sub21.anInt7814 = 0;
        IncommingOpcode.anInt1474 = 0;
        Class239.anInt2672 = 0;
        Node_Sub14_Sub38.anInt9579 = 0;
        Node_Sub14_Sub26.anInt9437 = 0;
        Node_Sub2_Sub1.anInt8828 = 0;
        ha_Sub2.anInt5760 = 0;
        RSInterface.anInt6846 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10041 = 0;
        Node_Sub33.anInt7207 = 0;
        Node_Sub48.anInt7422 = 0;
        Class250.anInt2827 = 0;
        Class381.anInt4687 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10356 = 0;
        Class89.anInt1091 = 0;
        Class223.anInt5170 = 0;
        Class340_Sub6.anInt8149 = 0;
        Class238_Sub2.anInt6705 = 0;
        NPC.anInt10588 = 0;
        Class282_Sub5.anInt7636 = 0;
        ByteStream.anInt6920 = 0;
        Node_Sub8_Sub12.anInt9020 = 0;
        Class94.anInt1211 = 0;
        Class152.anInt1815 = 0;
        Node_Sub15_Sub5.anInt9717 = 0;
        Class293.anInt3431 = 0;
        ha_Sub2.anInt5602 = 0;
        Class323.anInt3798 = 0;
        ha_Sub3_Sub1.anInt8730 = 0;
        Class282_Sub12.anInt7708 = 0;
        Class259.anInt2960 = 0;
        Class340_Sub7.anInt8168 = 0;
        Class164.anInt1923 = 0;
        Class310.anInt3602 = 0;
        anInt6429 = 0;
        s_Sub3.anInt8009 = 0;
        Class84_Sub3.anInt5397 = 0;
        ha_Sub2.anInt5670 = 0;
        Class136_Sub3.anInt8400 = 0;
        ha_Sub3_Sub1.anInt8670 = 0;
        Class343.anInt4071 = 0;
        Class96.anInt1239 = 0;
        Class352.anInt4184 = 0;
        Applet_Sub1.anInt22 = 0;
        Class84_Sub1.anInt5371 = 0;
        Class188.anInt2184 = 0;
        Class357.anInt4409 = 0;
        Class347.anInt4138 = 0;
        Node_Sub9_Sub1.anInt9108 = 0;
        Class33.anInt4896 = 0;
        Class51.anInt686 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10028 = 0;
        Class340_Sub6.anInt8157 = 0;
        ha_Sub2.anInt5634 = 0;
        Class368.anInt4517 = 0;
        Class231.anInt2607 = 0;
        Class282_Sub22.anInt7824 = 0;
        ha_Sub2.anInt5669 = 0;
        ha_Sub2.anInt5589 = 0;
        ha_Sub3.anInt5987 = 0;
        Class299.anInt3484 = 0;
        Class282_Sub4.anInt7632 = 0;
        Node_Sub14_Sub30.anInt9480 = 0;
        Class238_Sub3.anInt6764 = 0;
        Class345.anInt4110 = 0;
        ha_Sub3_Sub1.anInt8725 = 0;
        Node_Sub14_Sub6.anInt9210 = 0;
        Class282_Sub29.anInt7903 = 0;
        Player.anInt10535 = 0;
        ByteStream.anInt6911 = 0;
        Class47.anInt617 = 0;
        Class1.anInt111 = 0;
        Node_Sub14_Sub15.anInt9319 = 0;
        Node_Sub14_Sub1.anInt9172 = 0;
        Class249_Sub2.anInt4802 = 0;
        Class307.anInt3567 = 0;
        ha_Sub3_Sub1.anInt8664 = 0;
        ha_Sub2.anInt5778 = 0;
        Applet_Sub1.anInt10 = 0;
        Node_Sub8_Sub4.anInt8358 = 0;
        Class59.anInt800 = 0;
        Class143.anInt1690 = 0;
        Player.anInt10567 = 0;
        Class86_Sub1.anInt5507 = 0;
        Class59.anInt807 = 0;
        Class238_Sub3.anInt6796 = 0;
        ha_Sub2.anInt5679 = 0;
        Class162_Sub2.anInt6505 = 0;
        ByteStream.anInt6943 = 0;
        Class284.anInt3345 = 0;
        Class282_Sub18.anInt7775 = 0;
        Class77.anInt995 = 0;
        Class282_Sub3.anInt7617 = 0;
        Class162.anInt1905 = 0;
        Class269_Sub2.anInt7539 = 0;
        Class238_Sub2.anInt6753 = 0;
        Class99.anInt1273 = 0;
        Node_Sub14_Sub17.anInt9344 = 0;
        Class323.anInt3795 = 0;
        ByteStream.anInt6926 = 0;
        Class43.anInt555 = 0;
        Class278.anInt3232 = 0;
        Node_Sub14_Sub28.anInt9456 = 0;
        Class245.anInt2745 = 0;
        Class166.anInt1945 = 0;
        ha_Sub3_Sub1.anInt8675 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10089 = 0;
        Class319.anInt3689 = 0;
        Node_Sub26.anInt7149 = 0;
        Class295.anInt3453 = 0;
        Class136_Sub4.anInt8408 = 0;
        Class282_Sub25.anInt7845 = 0;
        Class253_Sub1.anInt7507 = 0;
        Class25.anInt335 = 0;
        Class136_Sub2.anInt8386 = 0;
        Class249_Sub1.anInt4719 = 0;
        Class81.anInt4906 = 0;
        Class162_Sub2.anInt6538 = 0;
        ha_Sub3.anInt6025 = 0;
        Node_Sub14_Sub33.anInt9514 = 0;
        Node_Sub48.anInt7427 = 0;
        Class84_Sub7.anInt5464 = 0;
        ByteStream.anInt6875 = 0;
        RSInterface2.anInt4343 = 0;
        Class238_Sub2.anInt6727 = 0;
        Class340.anInt3952 = 0;
        Class347.anInt4146 = 0;
        ByteStream.anInt6884 = 0;
        Class192.anInt2205 = 0;
        Class317.anInt3672 = 0;
        Class278.anInt3231 = 0;
        Class282_Sub15.anInt7737 = 0;
        Class45.anInt575 = 0;
        Node_Sub2.anInt6821 = 0;
        ha_Sub2.anInt5682 = 0;
        Class48.anInt640 = 0;
        Player.anInt10548 = 0;
        Animable.anInt9919 = 0;
        Node_Sub1.anInt6815 = 0;
        Class340_Sub10.anInt8216 = 0;
        Class337.anInt3929 = 0;
        Class84_Sub9.anInt5502 = 0;
        Class317.anInt3673 = 0;
        Class84_Sub9.anInt5500 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10107 = 0;
        Node_Sub2_Sub1.anInt8811 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10134 = 0;
        Node_Sub14_Sub26.anInt9439 = 0;
        Class282_Sub17.anInt7772 = 0;
        Class65.anInt889 = 0;
        Class84_Sub8.anInt5475 = 0;
        Class94.anInt1219 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10020 = 0;
        Class119.anInt1488 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10153 = 0;
        Class282_Sub27.anInt7879 = 0;
        Class195.anInt2235 = 0;
        ha.anInt1413 = 0;
        ha_Sub2.anInt5736 = 0;
        Class282_Sub4.anInt7629 = 0;
        ha_Sub2.anInt5612 = 0;
        Node_Sub14_Sub35.anInt9539 = 0;
        ha_Sub3.anInt6016 = 0;
        s_Sub2.anInt7959 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10102 = 0;
        ha_Sub3.anInt6086 = 0;
        Node_Sub14_Sub27.anInt9445 = 0;
        Node_Sub15_Sub1.anInt9645 = 0;
        Animable.anInt9918 = 0;
        Class279_Sub1_Sub2.anInt9820 = 0;
        Node_Sub14_Sub32.anInt9494 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10237 = 0;
        anInt6399 = 0;
        Node_Sub51.anInt7471 = 0;
        Class293.anInt3433 = 0;
        Class178.anInt2081 = 0;
        Class238_Sub3.anInt6777 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10233 = 0;
        Class334.anInt3904 = 0;
        Class48.anInt633 = 0;
        Class279_Sub2_Sub1.anInt9829 = 0;
        Class150.anInt1774 = 0;
        Node_Sub45.anInt7326 = 0;
        Class218.anInt2492 = 0;
        Node_Sub14_Sub27.anInt9448 = 0;
        ha_Sub3_Sub1.anInt8671 = 0;
        Class340_Sub3.anInt8120 = 0;
        Node_Sub19.anInt7042 = 0;
        Entity.anInt10431 = 0;
        Class145.anInt1706 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10230 = 0;
        Class215.anInt2482 = 0;
        Class282_Sub13.anInt7721 = 0;
        Class282_Sub17.anInt7767 = 0;
        Class84_Sub5.anInt5422 = 0;
        ha_Sub2.anInt5734 = 0;
        Class238_Sub2.anInt6708 = 0;
        Class340_Sub5.anInt8136 = 0;
        s_Sub3.anInt8010 = 0;
        Class340.anInt3955 = 0;
        Class77.anInt990 = 0;
        Class96.anInt1243 = 0;
        ha_Sub2.anInt5648 = 0;
        Node_Sub14_Sub38.anInt9574 = 0;
        Node_Sub14_Sub34.anInt9526 = 0;
        ha_Sub3.anInt6070 = 0;
        Class64.anInt870 = 0;
        Class363.anInt4476 = 0;
        ha_Sub2.anInt5687 = 0;
        Class269_Sub2.anInt7529 = 0;
        Interactable.anInt8313 = 0;
        Class86.anInt1056 = 0;
        Class144.anInt1697 = 0;
        Node_Sub8_Sub13_Sub1.anInt10249 = 0;
        Class310_Sub1.anInt8036 = 0;
        Node_Sub14_Sub19.anInt9359 = 0;
        Class164.anInt1933 = 0;
        ha_Sub2.anInt5590 = 0;
        Class342.anInt3986 = 0;
        Class381.anInt4669 = 0;
        Node_Sub11.anInt6954 = 0;
        Class239.anInt2660 = 0;
        Class113.anInt1397 = 0;
        ha_Sub2.anInt5714 = 0;
        s_Sub2.anInt7929 = 0;
        Class282_Sub12.anInt7713 = 0;
        ha_Sub3_Sub1.anInt8713 = 0;
        Class5.anInt148 = 0;
        Class238_Sub1.anInt6681 = 0;
        Node_Sub18.anInt7012 = 0;
        NPC.anInt10589 = 0;
        Class343.anInt4062 = 0;
        Class199.anInt2285 = 0;
        Class282_Sub24.anInt7840 = 0;
        Class320.anInt3692 = 0;
        Node_Sub14_Sub32.anInt9496 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10053 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10074 = 0;
        Class219.anInt2510 = 0;
        Class129_Sub2.anInt8540 = 0;
        Class168.anInt1961 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10060 = 0;
        Class346_Sub7_Sub3.anInt9936 = 0;
        Class34.anInt389 = 0;
        Class101.anInt1291 = 0;
        Class343.anInt4051 = 0;
        Class381.anInt4670 = 0;
        client.anInt5233 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10051 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10022 = 0;
        ha_Sub2.anInt5770 = 0;
        anInt6374 = 0;
        Node_Sub18.anInt7008 = 0;
        Class332.anInt3869 = 0;
        Class129_Sub2.anInt8525 = 0;
        Class43.anInt553 = 0;
        Animable.anInt9920 = 0;
        ha_Sub3.anInt6095 = 0;
        ha_Sub2.anInt5632 = 0;
        Node_Sub24.anInt7104 = 0;
        Class376.anInt4946 = 0;
        Class205.anInt2385 = 0;
        Node_Sub21.anInt7067 = 0;
        ha_Sub3_Sub1.anInt8696 = 0;
        Node_Sub8_Sub2.anInt8909 = 0;
        Class28.anInt4887 = 0;
        ha_Sub2.anInt5766 = 0;
        Class48.anInt630 = 0;
        Class65.anInt891 = 0;
        Class307.anInt3562 = 0;
        Class279.anInt3254 = 0;
        ObjectDefinition.anInt3027 = 0;
        Class282_Sub28.anInt7890 = 0;
        Class143.anInt1683 = 0;
        Node_Sub48.anInt7421 = 0;
        Class282_Sub20.anInt7801 = 0;
        Class279.anInt3256 = 0;
        Node_Sub14_Sub17.anInt9339 = 0;
        Class275.anInt5152 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10226 = 0;
        Class49.anInt658 = 0;
        RSInterface2.anInt4288 = 0;
        Class84_Sub9.anInt5501 = 0;
        ha_Sub3.anInt6077 = 0;
        Class206.anInt4981 = 0;
        Entity.anInt10476 = 0;
        Node_Sub18.anInt7005 = 0;
        Node_Sub8_Sub20.anInt9087 = 0;
        Class283.anInt3325 = 0;
        Node_Sub15_Sub5.anInt9716 = 0;
        Node_Sub14_Sub39.anInt9586 = 0;
        Class275_Sub1.anInt8590 = 0;
        Node_Sub8_Sub7.anInt8959 = 0;
        Class269.anInt3132 = 0;
        Class102.anInt1300 = 0;
        Class84_Sub4.anInt5414 = 0;
        ha_Sub2.anInt5740 = 0;
        Class84_Sub9.anInt5487 = 0;
        Class112_Sub4.anInt8648 = 0;
        Class282_Sub3.anInt7614 = 0;
        Class340_Sub6.anInt8150 = 0;
        Class111.anInt1387 = 0;
        Class54_Sub4.anInt5367 = 0;
        NPC.anInt10610 = 0;
        Class282_Sub26.anInt7865 = 0;
        r_Sub2.anInt10272 = 0;
        Node_Sub14_Sub30.anInt9475 = 0;
        ha_Sub3.anInt6121 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10081 = 0;
        ByteStream.anInt6896 = 0;
        Class316_Sub1_Sub2.anInt9855 = 0;
        Class200.anInt2291 = 0;
        Class275.anInt5140 = 0;
        Class86.anInt1063 = 0;
        Class228.anInt2568 = 0;
        Class310_Sub1.anInt8038 = 0;
        Class158.anInt1882 = 0;
        Class238_Sub2.anInt6730 = 0;
        Node_Sub14_Sub24.anInt9413 = 0;
        Class329.anInt3844 = 0;
        ha_Sub3.anInt6109 = 0;
        Class282_Sub21.anInt7805 = 0;
        Class223.anInt5197 = 0;
        ha_Sub3.anInt6073 = 0;
        Class45.anInt570 = 0;
        ha_Sub3_Sub1.anInt8690 = 0;
        Node_Sub42_Sub1.anInt9781 = 0;
        ByteStream.anInt6883 = 0;
        Class162_Sub2.anInt6540 = 0;
        Class282_Sub18.anInt7781 = 0;
        Class340_Sub6.anInt8144 = 0;
        Node_Sub21.anInt7051 = 0;
        Class48.anInt651 = 0;
        Class28.anInt4885 = 0;
        Class275_Sub2.anInt8609 = 0;
        Class164.anInt1930 = 0;
        ha_Sub3.anInt6009 = 0;
        Class162_Sub2.anInt6549 = 0;
        Class41.anInt462 = 0;
        Class346_Sub7_Sub3.anInt9937 = 0;
        ByteStream.anInt6908 = 0;
        Class340_Sub5.anInt8129 = 0;
        Class164.anInt1941 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10221 = 0;
        Class175.anInt2057 = 0;
        Class346_Sub7_Sub2_Sub1.anInt9995 = 0;
        ha_Sub3.anInt6083 = 0;
        Node_Sub14_Sub29.anInt9464 = 0;
        Class269.anInt3128 = 0;
        Class297_Sub1.anInt8485 = 0;
        Class112_Sub1.anInt8620 = 0;
        Class42.anInt540 = 0;
        ha_Sub2.anInt5713 = 0;
        Class112.anInt5215 = 0;
        ha_Sub3_Sub1.anInt8692 = 0;
        Applet_Sub1.anInt40 = 0;
        Class119.anInt1496 = 0;
        s_Sub3.anInt7993 = 0;
        Class282_Sub1.anInt7593 = 0;
        Class349_Sub2.anInt4729 = 0;
        ha_Sub2.anInt5767 = 0;
        Class345.anInt4095 = 0;
        ObjectDefinition.anInt3053 = 0;
        ha.anInt1408 = 0;
        Class52.anInt706 = 0;
        Class39.anInt437 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10370 = 0;
        Class110.anInt1385 = 0;
        ha_Sub3.anInt6099 = 0;
        Class54_Sub4.anInt5362 = 0;
        Class310_Sub1.anInt8033 = 0;
        ha_Sub2.anInt5709 = 0;
        Class84_Sub2.anInt5387 = 0;
        Class1.anInt105 = 0;
        r_Sub2.anInt10284 = 0;
        Class245.anInt2751 = 0;
        ha_Sub3_Sub1.anInt8687 = 0;
        ha_Sub3.anInt5967 = 0;
        ByteStream.anInt6944 = 0;
        Class283.anInt3331 = 0;
        Node_Sub14_Sub2.anInt9176 = 0;
        Node_Sub8_Sub3.anInt8920 = 0;
        Class99.anInt1275 = 0;
        NPC.anInt10592 = 0;
        Class340_Sub9.anInt8198 = 0;
        Class36.anInt401 = 0;
        Class372.anInt4579 = 0;
        Node_Sub8_Sub14_Sub1.anInt10289 = 0;
        ha_Sub2.anInt5737 = 0;
        Class241.anInt2689 = 0;
        ha_Sub3_Sub1.anInt8700 = 0;
        Class48.anInt634 = 0;
        Class254.anInt5133 = 0;
        Exception_Sub1.anInt94 = 0;
        Class332.anInt3870 = 0;
        Class184.anInt2158 = 0;
        za.anInt7484 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10007 = 0;
        Class291.anInt4750 = 0;
        Class305.anInt3547 = 0;
        Node_Sub47.anInt7413 = 0;
        ha_Sub2.anInt5784 = 0;
        ha_Sub3_Sub1.anInt8684 = 0;
        Class112_Sub3.anInt8642 = 0;
        Class282_Sub4.anInt7631 = 0;
        Class349_Sub2.anInt4727 = 0;
        Class276.anInt3175 = 0;
        Class275.anInt5137 = 0;
        Node_Sub42_Sub3.anInt9790 = 0;
        Node_Sub14_Sub1.anInt9154 = 0;
        ByteStream.anInt6901 = 0;
        Class214.anInt2469 = 0;
        IncommingOpcode.anInt1473 = 0;
        Class109.anInt1376 = 0;
        ha_Sub2.anInt5613 = 0;
        Class236.anInt2625 = 0;
        Class344.anInt4083 = 0;
        Class340_Sub8.anInt8188 = 0;
        ha_Sub2.anInt5662 = 0;
        ha_Sub2.anInt5643 = 0;
        Node_Sub8_Sub12.anInt9018 = 0;
        Class106.anInt1348 = 0;
        s_Sub3.anInt7998 = 0;
        Class293.anInt3432 = 0;
        Class290.anInt3416 = 0;
        Class70.anInt917 = 0;
        anInt6333 = 0;
        ByteStream.anInt6916 = 0;
        Class84_Sub2.anInt5382 = 0;
        Class282_Sub22.anInt7822 = 0;
        Class267.anInt4916 = 0;
        Node_Sub14_Sub22.anInt9385 = 0;
        ha_Sub2.anInt5681 = 0;
        Class279_Sub2_Sub1.anInt9828 = 0;
        Class84_Sub9.anInt5499 = 0;
        Node_Sub8_Sub12.anInt9011 = 0;
        ha_Sub3_Sub1.anInt8719 = 0;
        Class381.anInt4657 = 0;
        Node_Sub14_Sub32.anInt9502 = 0;
        Class32.anInt383 = 0;
        Class112_Sub1.anInt8630 = 0;
        Class162_Sub2.anInt6499 = 0;
        Class264.anInt2989 = 0;
        Class249_Sub1.anInt4717 = 0;
        Node_Sub14_Sub24.anInt9401 = 0;
        ha_Sub3.anInt6074 = 0;
        Applet_Sub1.anInt31 = 0;
        ha_Sub2.anInt5685 = 0;
        Class199.anInt2279 = 0;
        Class380.anInt4641 = 0;
        Class122.anInt1522 = 0;
        Class340_Sub2.anInt8108 = 0;
        Class241.anInt2685 = 0;
        Class316_Sub1_Sub1.anInt9844 = 0;
        Class38.anInt419 = 0;
        Node_Sub14_Sub37.anInt9566 = 0;
        Class84_Sub6.anInt5439 = 0;
        Class129_Sub1.anInt8495 = 0;
        Class238_Sub3.anInt6776 = 0;
        Class342.anInt3997 = 0;
        Node_Sub14_Sub27.anInt9441 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10062 = 0;
        Class60.anInt822 = 0;
        ha_Sub3_Sub1.anInt8736 = 0;
        Class175.anInt2054 = 0;
        Class226_Sub3.anInt6673 = 0;
        Class189.anInt5068 = 0;
        Class382.anInt4700 = 0;
        Class345.anInt4090 = 0;
        Node_Sub42_Sub3.anInt9791 = 0;
        Class343.anInt4022 = 0;
        Class238_Sub2.anInt6721 = 0;
        ByteStream.anInt6919 = 0;
        ha_Sub3.anInt6115 = 0;
        Class74.anInt959 = 0;
        Node_Sub14_Sub35.anInt9531 = 0;
        Class316_Sub2_Sub1.anInt9878 = 0;
        Node_Sub14_Sub39.anInt9599 = 0;
        Class282_Sub9.anInt7677 = 0;
        Class180.anInt2094 = 0;
        Class340_Sub9.anInt8206 = 0;
        Class340_Sub2.anInt8103 = 0;
        Class333.anInt3899 = 0;
        Node_Sub8_Sub5.anInt8929 = 0;
        Class375.anInt4604 = 0;
        Node_Sub14_Sub5.anInt9203 = 0;
        anInt6329 = 0;
        PacketStream.anInt9122 = 0;
        Class69.anInt912 = 0;
        Class316_Sub1.anInt8046 = 0;
        Class131.anInt1604 = 0;
        Class282_Sub14.anInt7730 = 0;
        s_Sub2.anInt7958 = 0;
        Class136.anInt4768 = 0;
        Class279.anInt3247 = 0;
        Node_Sub12.anInt6961 = 0;
        Class238_Sub2.anInt6719 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10106 = 0;
        ha_Sub2.anInt5684 = 0;
        Class297.anInt5017 = 0;
        Class238_Sub2.anInt6757 = 0;
        Class282_Sub16.anInt7758 = 0;
        anInt6350 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10214 = 0;
        anInt6435 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10026 = 0;
        Class81.anInt4912 = 0;
        Class84_Sub6.anInt5452 = 0;
        ha_Sub2.anInt5727 = 0;
        Class315.anInt3657 = 0;
        Class282_Sub28.anInt7880 = 0;
        Node_Sub14_Sub6.anInt9211 = 0;
        Class77.anInt992 = 0;
        Class365.anInt4481 = 0;
        s_Sub3.anInt8014 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10178 = 0;
        Class347.anInt4128 = 0;
        Node_Sub14_Sub10.anInt9250 = 0;
        Node_Sub11.anInt6947 = 0;
        ha_Sub3_Sub1.anInt8728 = 0;
        Class282_Sub20.anInt7796 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10078 = 0;
        anInt6389 = 0;
        Class162_Sub2.anInt6456 = 0;
        Class238_Sub2.anInt6740 = 0;
        Node_Sub14_Sub19.anInt9362 = 0;
        Class310.anInt3584 = 0;
        Node_Sub15_Sub4.anInt9697 = 0;
        Class238_Sub2.anInt6716 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10184 = 0;
        Class282_Sub20.anInt7797 = 0;
        Node_Sub14_Sub20.anInt9367 = 0;
        Class251.anInt2834 = 0;
        Class162_Sub2.anInt6486 = 0;
        Class282_Sub1.anInt7598 = 0;
        Class192.anInt2215 = 0;
        Class323.anInt3799 = 0;
        Player.anInt10558 = 0;
        ha_Sub3_Sub1.anInt8657 = 0;
        Node_Sub36.anInt7253 = 0;
        Class126.anInt1549 = 0;
        Class54_Sub3.anInt5350 = 0;
        Class282_Sub16.anInt7760 = 0;
        Class84_Sub6.anInt5453 = 0;
        Class162_Sub2.anInt6541 = 0;
        za.anInt7488 = 0;
        Node_Sub29.anInt7172 = 0;
        za_Sub1.anInt9796 = 0;
        Class377.anInt4622 = 0;
        Class171.anInt1985 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10070 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10357 = 0;
        Class74.anInt948 = 0;
        Applet_Sub1.anInt34 = 0;
        Node_Sub14_Sub25.anInt9420 = 0;
        Entity.anInt10486 = 0;
        anInt6363 = 0;
        ha_Sub2.anInt5764 = 0;
        Class118.anInt1481 = 0;
        Class48.anInt638 = 0;
        Class188.anInt2181 = 0;
        ha_Sub3.anInt5963 = 0;
        ha_Sub2.anInt5719 = 0;
        Class164.anInt1931 = 0;
        Class162_Sub2.anInt6537 = 0;
        Class282_Sub8.anInt7669 = 0;
        Node_Sub14_Sub36.anInt9542 = 0;
        Class39.anInt428 = 0;
        Class360.anInt4442 = 0;
        Class167.anInt1956 = 0;
        Class141.anInt5053 = 0;
        Class150.anInt1783 = 0;
        Class321.anInt3746 = 0;
        aa.anInt97 = 0;
        Class371.anInt4565 = 0;
        Class275.anInt5147 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10157 = 0;
        Class96.anInt1247 = 0;
        Class360.anInt4439 = 0;
        s_Sub3.anInt8012 = 0;
        Node_Sub21.anInt7052 = 0;
        ha_Sub3.anInt6122 = 0;
        Class129_Sub1.anInt8503 = 0;
        anInt6377 = 0;
        Node_Sub11_Sub1.anInt9147 = 0;
        Class332.anInt3872 = 0;
        Node_Sub14_Sub34.anInt9522 = 0;
        Class316_Sub1_Sub1.anInt9847 = 0;
        Node_Sub8_Sub17.anInt9056 = 0;
        ha_Sub2.anInt5731 = 0;
        Class126.anInt1553 = 0;
        Class326.anInt4806 = 0;
        InputStream_Sub1.anInt74 = 0;
        Class333.anInt3888 = 0;
        Class346_Sub7_Sub4.anInt9948 = 0;
        Class11.anInt242 = 0;
        Node_Sub14_Sub1.anInt9166 = 0;
        Class293.anInt3440 = 0;
        Class255.anInt2873 = 0;
        ha_Sub3.anInt6124 = 0;
        RuntimeException_Sub1.anInt4709 = 0;
        Class255.anInt2920 = 0;
        Node_Sub15_Sub1.anInt9660 = 0;
        Class148.anInt5113 = 0;
        Class90.anInt1160 = 0;
        Node_Sub14_Sub18.anInt9348 = 0;
        Class46.anInt589 = 0;
        Class346_Sub7_Sub5.anInt9956 = 0;
        Class290.anInt3409 = 0;
        Class253_Sub1.anInt7494 = 0;
        Class381.anInt4683 = 0;
        Node_Sub1.anInt6818 = 0;
        ha_Sub3.anInt6063 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10376 = 0;
        Class112.anInt5219 = 0;
        Node_Sub8_Sub13_Sub1.anInt10245 = 0;
        Class96.anInt1246 = 0;
        ha_Sub3_Sub1.anInt8743 = 0;
        Class47.anInt610 = 0;
        Class238_Sub2.anInt6710 = 0;
        Class226_Sub2_Sub1.anInt8806 = 0;
        Class136_Sub4.anInt8417 = 0;
        Class255.anInt2859 = 0;
        ha_Sub2.anInt5746 = 0;
        Class129_Sub1.anInt8504 = 0;
        Class282_Sub17.anInt7771 = 0;
        Class282_Sub22.anInt7825 = 0;
        Class279_Sub1_Sub2.anInt9823 = 0;
        Class300.anInt3497 = 0;
        Class65.anInt876 = 0;
        Class308.anInt3576 = 0;
        Class279_Sub2_Sub2.anInt9834 = 0;
        Class17.anInt288 = 0;
        ha_Sub3.anInt5998 = 0;
        Class135.anInt1633 = 0;
        ObjectDefinition.anInt3103 = 0;
        Applet_Sub1.anInt37 = 0;
        Class238_Sub3.anInt6771 = 0;
        Class172.anInt1992 = 0;
        Node_Sub15_Sub5.anInt9715 = 0;
        Class173.anInt2016 = 0;
        Class48.anInt628 = 0;
        Class340_Sub10.anInt8223 = 0;
        Node_Sub8_Sub1.anInt8885 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10069 = 0;
        Class136.anInt4777 = 0;
        Class267.anInt4917 = 0;
        anInt6371 = 0;
        Class343.anInt4037 = 0;
        ha_Sub3.anInt5995 = 0;
        Class360.anInt4440 = 0;
        Class136_Sub4.anInt8406 = 0;
        Class223.anInt5194 = 0;
        Node_Sub8_Sub13_Sub1.anInt10247 = 0;
        Class308.anInt3568 = 0;
        ha_Sub2.anInt5614 = 0;
        Class343.anInt4065 = 0;
        Class124.anInt1541 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10346 = 0;
        Class148.anInt5116 = 0;
        Class84_Sub9.anInt5489 = 0;
        Class293.anInt3439 = 0;
        Class136.anInt4778 = 0;
        Class373.anInt4590 = 0;
        Class342.anInt3993 = 0;
        ha_Sub3.anInt5992 = 0;
        Class301_Sub1.anInt8427 = 0;
        Node_Sub1.anInt6806 = 0;
        Node_Sub45.anInt7365 = 0;
        Class282_Sub6.anInt7642 = 0;
        OutgoingOpcode.anInt1914 = 0;
        ha_Sub3.anInt6056 = 0;
        Class84_Sub6.anInt5455 = 0;
        Class184.anInt2153 = 0;
        Class26.anInt354 = 0;
        ha_Sub3.anInt5979 = 0;
        Class239.anInt2655 = 0;
        Class39.anInt430 = 0;
        Class279.anInt3249 = 0;
        Class346_Sub7_Sub3.anInt9940 = 0;
        Class107.anInt1353 = 0;
        Class344.anInt4079 = 0;
        Class164.anInt1926 = 0;
        Class377.anInt4617 = 0;
        Interactable.anInt8308 = 0;
        Class381.anInt4689 = 0;
        Class282_Sub12.anInt7709 = 0;
        client.anInt5238 = 0;
        Class342.anInt3996 = 0;
        Class282_Sub20.anInt7803 = 0;
        Class291.anInt4739 = 0;
        Class283.anInt3323 = 0;
        Class282_Sub26.anInt7858 = 0;
        Class84_Sub1.anInt5370 = 0;
        Class84_Sub5.anInt5433 = 0;
        Node_Sub14_Sub32.anInt9495 = 0;
        ha_Sub3_Sub1.anInt8739 = 0;
        ByteStream.anInt6940 = 0;
        Class30.anInt378 = 0;
        ha_Sub3_Sub1.anInt8697 = 0;
        Class225_Sub2.anInt8465 = 0;
        ha_Sub2.anInt5619 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10118 = 0;
        Class282_Sub28.anInt7886 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10517 = 0;
        Node_Sub8_Sub4.anInt8363 = 0;
        Class103.anInt1314 = 0;
        ha_Sub2.anInt5786 = 0;
        Class282_Sub26.anInt7859 = 0;
        ha_Sub2.anInt5666 = 0;
        Class381.anInt4663 = 0;
        Node_Sub8_Sub6.anInt8939 = 0;
        Class374.anInt4593 = 0;
        Class239.anInt2671 = 0;
        ha_Sub3.anInt6040 = 0;
        Class210.anInt2426 = 0;
        Class9.anInt191 = 0;
        Class102.anInt1297 = 0;
        Class136_Sub4.anInt8415 = 0;
        Node_Sub8.anInt6866 = 0;
        Class194.anInt2227 = 0;
        Class347.anInt4145 = 0;
        Node_Sub14_Sub12.anInt9266 = 0;
        Class238_Sub1.anInt6700 = 0;
        s_Sub2.anInt7935 = 0;
        RSInterface2.anInt4367 = 0;
        ha_Sub3.anInt5966 = 0;
        Class145.anInt1708 = 0;
        Class130.anInt1577 = 0;
        ha_Sub2.anInt5763 = 0;
        Node_Sub14_Sub14.anInt9307 = 0;
        r_Sub1.anInt10266 = 0;
        Class282_Sub2.anInt7606 = 0;
        Node_Sub14_Sub39.anInt9593 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10530 = 0;
        Class109.anInt1377 = 0;
        Class380.anInt4647 = 0;
        Class293.anInt3428 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10333 = 0;
        ha_Sub3_Sub1.anInt8672 = 0;
        Class301_Sub3_Sub1.anInt9972 = 0;
        ha_Sub3.anInt6041 = 0;
        Node_Sub40_Sub1.anInt9763 = 0;
        Node_Sub14_Sub28.anInt9452 = 0;
        Class164.anInt1936 = 0;
        ha_Sub3.anInt6061 = 0;
        Class338.requestAttempts = 0;
        Class251.anInt2835 = 0;
        Node_Sub39.anInt7277 = 0;
        Class360.anInt4441 = 0;
        Applet_Sub1.anInt28 = 0;
        ha_Sub3.anInt6136 = 0;
        Class326.anInt4811 = 0;
        Class253_Sub1.anInt7496 = 0;
        ha_Sub3.anInt6011 = 0;
        Class249_Sub1.anInt4712 = 0;
        Node_Sub14_Sub7.anInt9221 = 0;
        Class282_Sub17.anInt7774 = 0;
        Class127.anInt1563 = 0;
        Class147_Sub1.anInt6287 = 0;
        Class282_Sub24.anInt7838 = 0;
        Class342.anInt3995 = 0;
        Node_Sub8_Sub2.anInt8916 = 0;
        Class282_Sub16.anInt7762 = 0;
        ha_Sub3.anInt6000 = 0;
        Class191.anInt4824 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10404 = 0;
        Class150.anInt1780 = 0;
        Class381.anInt4680 = 0;
        Class141.anInt5048 = 0;
        Class192.anInt2210 = 0;
        Class90.anInt1128 = 0;
        Node_Sub8_Sub6.anInt8953 = 0;
        Class340_Sub9.anInt8215 = 0;
        ByteStream.anInt6903 = 0;
        Class316_Sub1_Sub1.anInt9843 = 0;
        ByteStream.anInt6900 = 0;
        Class282_Sub21.anInt7807 = 0;
        Class381.anInt4653 = 0;
        Class164.anInt1925 = 0;
        OutputStream_Sub1.anInt87 = 0;
        Node_Sub14.anInt6986 = 0;
        Node_Sub38.anInt7266 = 0;
        Node_Sub14_Sub22.anInt9386 = 0;
        ha_Sub3.anInt6010 = 0;
        Class340_Sub9.anInt8209 = 0;
        Class301_Sub1.anInt8426 = 0;
        Class223.anInt5178 = 0;
        Class282_Sub26.anInt7861 = 0;
        Class238_Sub3.anInt6762 = 0;
        Class80.anInt1015 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10048 = 0;
        Class253_Sub1.anInt7501 = 0;
        Node_Sub40_Sub1.anInt9764 = 0;
        ha_Sub2.anInt5723 = 0;
        ha_Sub3.anInt6026 = 0;
        Class86.anInt1070 = 0;
        Node_Sub14.anInt6992 = 0;
        Class218.anInt2494 = 0;
        Class340_Sub5.anInt8133 = 0;
        Class278.anInt3233 = 0;
        Class172.anInt1998 = 0;
        Class70.anInt929 = 0;
        Class381.anInt4685 = 0;
        Class66.anInt5027 = 0;
        Class310.anInt3585 = 0;
        Node_Sub30.anInt7178 = 0;
        Class26.anInt352 = 0;
        Node_Sub27.anInt7156 = 0;
        Class144.anInt1701 = 0;
        Class86.anInt1067 = 0;
        Class321.anInt3758 = 0;
        Node_Sub14_Sub17.anInt9345 = 0;
        Node_Sub47.anInt7404 = 0;
        ha_Sub2.anInt5686 = 0;
        Class381.anInt4692 = 0;
        Class106.anInt1349 = 0;
        Node_Sub14_Sub28.anInt9453 = 0;
        Class282_Sub18.anInt7776 = 0;
        ha_Sub3_Sub1.anInt8669 = 0;
        Node_Sub14_Sub34.anInt9520 = 0;
        Node_Sub42_Sub2.anInt9786 = 0;
        ha.anInt1405 = 0;
        ha_Sub3.anInt6043 = 0;
        ha_Sub2.anInt5772 = 0;
        Class100.anInt1282 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10229 = 0;
        Class162.anInt1900 = 0;
        Node_Sub14_Sub4.anInt9192 = 0;
        Class316_Sub1_Sub1.anInt9845 = 0;
        ByteStream.anInt6897 = 0;
        Class340_Sub7.anInt8178 = 0;
        Class340_Sub2.anInt8099 = 0;
        Class340_Sub7.anInt8167 = 0;
        PacketStream.anInt9111 = 0;
        Class275.anInt5144 = 0;
        Class371.anInt4567 = 0;
        Class253_Sub1.anInt7495 = 0;
        Class130.anInt1574 = 0;
        Class307.anInt3555 = 0;
        Class238_Sub2.anInt6755 = 0;
        Class64.anInt872 = 0;
        Class148.anInt5111 = 0;
        za_Sub2.anInt9806 = 0;
        Node_Sub2_Sub2.anInt8841 = 0;
        Class79.anInt1001 = 0;
        Class77.anInt986 = 0;
        Node_Sub2_Sub1.anInt8822 = 0;
        Class4.anInt140 = 0;
        Class282_Sub14.anInt7732 = 0;
        Class33.anInt4898 = 0;
        Class310.anInt3587 = 0;
        Class187.anInt2173 = 0;
        Class65.anInt884 = 0;
        Class84_Sub7.anInt5466 = 0;
        Class269_Sub2.anInt7531 = 0;
        Class54_Sub1.anInt5323 = 0;
        Class73.anInt942 = 0;
        Class155.anInt1846 = 0;
        Class301.anInt4939 = 0;
        ha_Sub3_Sub1.anInt8673 = 0;
        Node_Sub45.anInt7352 = 0;
        Class84_Sub3.anInt5392 = 0;
        client.anInt5237 = 0;
        Class185_Sub1.anInt6652 = 0;
        Node_Sub9_Sub1.anInt9107 = 0;
        Class321.anInt3736 = 0;
        Node_Sub2_Sub2.anInt8845 = 0;
        ha_Sub3.anInt6022 = 0;
        IncommingOpcode.anInt1476 = 0;
        Class255.anInt2871 = 0;
        ByteStream.anInt6942 = 0;
        Node_Sub8_Sub12.anInt9007 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10209 = 0;
        Class346_Sub7_Sub1.anInt9902 = 0;
        Class381.anInt4665 = 0;
        Class321.anInt3757 = 0;
        Node_Sub15_Sub1.anInt9642 = 0;
        ha_Sub2.anInt5752 = 0;
        Class282_Sub23.anInt7829 = 0;
        Class54_Sub1.anInt5327 = 0;
        Class77.anInt989 = 0;
        Class148.anInt5118 = 0;
        Applet_Sub1.anInt23 = 0;
        Class162_Sub2.anInt6509 = 0;
        Class165.anInt4969 = 0;
        Node_Sub14_Sub11.anInt9257 = 0;
        Node_Sub8_Sub10.anInt8986 = 0;
        ha_Sub3.anInt5983 = 0;
        Node_Sub11_Sub1.anInt9128 = 0;
        ha_Sub3_Sub1.anInt8710 = 0;
        Class249_Sub1.anInt4714 = 0;
        Node_Sub8_Sub6.anInt8947 = 0;
        Class141.anInt5054 = 0;
        Node_Sub40_Sub1.anInt9759 = 0;
        ha_Sub2.anInt5649 = 0;
        Node_Sub48.anInt7419 = 0;
        Class282_Sub11.anInt7705 = 0;
        anInt6365 = 0;
        anInt6370 = 0;
        ha_Sub2.anInt5703 = 0;
        Class47.anInt619 = 0;
        Class10.anInt233 = 0;
        Node_Sub14_Sub22.anInt9391 = 0;
        ha_Sub2.anInt5755 = 0;
        Class124.anInt1540 = 0;
        Class203.anInt2352 = 0;
        Class116_Sub1.anInt6278 = 0;
        Class227.anInt2562 = 0;
        Node_Sub14_Sub30.anInt9473 = 0;
        Class358.anInt4419 = 0;
        Class293.anInt3430 = 0;
        Node_Sub2_Sub2.anInt8844 = 0;
        NPC.anInt10590 = 0;
        Class126.anInt1560 = 0;
        Class263.anInt2981 = 0;
        ha_Sub3.anInt6032 = 0;
        ha_Sub2.anInt5726 = 0;
        Node_Sub14_Sub15.anInt9316 = 0;
        Class282_Sub23.anInt7833 = 0;
        Node_Sub8_Sub13.anInt9028 = 0;
        ha_Sub3_Sub1.anInt8735 = 0;
        Class285.anInt3369 = 0;
        Entity.anInt10457 = 0;
        Applet_Sub1.anInt35 = 0;
        Class345.anInt4102 = 0;
        Class272.anInt3167 = 0;
        Class367.anInt4503 = 0;
        Class346_Sub7_Sub5.anInt9953 = 0;
        Class282_Sub21.anInt7812 = 0;
        Node_Sub1.anInt6804 = 0;
        ha_Sub2.anInt5677 = 0;
        Class86.anInt1061 = 0;
        ha_Sub3.anInt6066 = 0;
        Class209.anInt2418 = 0;
        Class282_Sub8.anInt7674 = 0;
        anInt6334 = 0;
        Class45.anInt567 = 0;
        za_Sub2.anInt9804 = 0;
        Node_Sub14_Sub32.anInt9499 = 0;
        Class282_Sub27.anInt7869 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10180 = 0;
        ByteStream.anInt6899 = 0;
        Class64.anInt867 = 0;
        Node_Sub8.anInt6864 = 0;
        Class164.anInt1935 = 0;
        ha_Sub3.anInt6037 = 0;
        Class184.anInt2147 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10224 = 0;
        Applet_Sub1.anInt26 = 0;
        Class282_Sub11.anInt7700 = 0;
        ha_Sub3.anInt5972 = 0;
        Node_Sub50.anInt7441 = 0;
        Class238_Sub3.anInt6766 = 0;
        Class349_Sub1.anInt4793 = 0;
        Class282_Sub17.anInt7770 = 0;
        Class10.anInt230 = 0;
        Class340.anInt3960 = 0;
        Class263.anInt2985 = 0;
        Class112.anInt5205 = 0;
        Node_Sub14_Sub4.anInt9193 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10046 = 0;
        Node_Sub14_Sub39.anInt9590 = 0;
        Node_Sub14_Sub22.anInt9390 = 0;
        ha_Sub3_Sub1.anInt8705 = 0;
        Class374.anInt4596 = 0;
        Class168.anInt1960 = 0;
        Class249.anInt2807 = 0;
        ha_Sub2.anInt5753 = 0;
        ha_Sub2.anInt5724 = 0;
        Node_Sub8_Sub9.anInt8967 = 0;
        Class208.anInt2408 = 0;
        Node_Sub8_Sub6.anInt8940 = 0;
        Class50.anInt670 = 0;
        ha_Sub2.anInt5697 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10129 = 0;
        Class129_Sub2.anInt8527 = 0;
        ByteStream.anInt6945 = 0;
        Class339.anInt3949 = 0;
        Class71.anInt5030 = 0;
        Class282_Sub15.anInt7741 = 0;
        Class282_Sub15.anInt7742 = 0;
        Node_Sub14_Sub9.anInt9239 = 0;
        Node_Sub40_Sub1.anInt9767 = 0;
        Node_Sub14_Sub33.anInt9512 = 0;
        Class381.anInt4691 = 0;
        Class47.anInt603 = 0;
        ha_Sub3_Sub1.anInt8726 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10036 = 0;
        Node_Sub15_Sub1.anInt9630 = 0;
        ha.anInt1404 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10127 = 0;
        za.anInt7485 = 0;
        Node_Sub14_Sub12_Sub1.anInt10308 = 0;
        Class148.anInt5083 = 0;
        Class250.anInt2823 = 0;
        Class269_Sub2.anInt7552 = 0;
        Class15.anInt275 = 0;
        Class83.anInt1032 = 0;
        Class238_Sub1.anInt6703 = 0;
        ByteStream.anInt6934 = 0;
        Node_Sub39_Sub2.anInt9747 = 0;
        Class238_Sub3.anInt6788 = 0;
        Class262.anInt2975 = 0;
        Class291.anInt4748 = 0;
        ha_Sub3_Sub1.anInt8698 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10016 = 0;
        Class279_Sub2.anInt7586 = 0;
        Class151.anInt1794 = 0;
        anInt6394 = 0;
        Class206.anInt4987 = 0;
        Class48.anInt643 = 0;
        Class282_Sub16.anInt7764 = 0;
        Class147.anInt1736 = 0;
        anInt6367 = 0;
        Class34.anInt391 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10199 = 0;
        Node_Sub19.anInt7036 = 0;
        ha_Sub2.anInt5683 = 0;
        Node_Sub11_Sub1.anInt9130 = 0;
        Class167.anInt1955 = 0;
        Class210.anInt2424 = 0;
        ha_Sub3.anInt6067 = 0;
        Node_Sub8_Sub10.anInt8972 = 0;
        Class282_Sub25.anInt7854 = 0;
        Node_Sub42_Sub2.anInt9787 = 0;
        Node_Sub20.anInt7048 = 0;
        Class126.anInt1547 = 0;
        Class162_Sub2.anInt6459 = 0;
        Class206.anInt4985 = 0;
        Class359.anInt4427 = 0;
        Class282_Sub7.anInt7663 = 0;
        Class316_Sub1_Sub1.anInt9841 = 0;
        Entity.anInt10494 = 0;
        Class147.anInt1732 = 0;
        ha_Sub3.anInt6072 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10164 = 0;
        Class343.anInt4025 = 0;
        Class346_Sub1.anInt8247 = 0;
        Class141.anInt5049 = 0;
        ha_Sub2.anInt5771 = 0;
        Class318.anInt3680 = 0;
        ha_Sub3.anInt5961 = 0;
        ha_Sub3_Sub1.anInt8665 = 0;
        Node_Sub14_Sub16.anInt9331 = 0;
        Class381.anInt4661 = 0;
        Node_Sub8_Sub15.anInt9049 = 0;
        ha_Sub2.anInt5717 = 0;
        Class301_Sub3_Sub1.anInt9971 = 0;
        Class282_Sub11.anInt7698 = 0;
        Class84_Sub6.anInt5438 = 0;
        Class59.anInt801 = 0;
        ha_Sub2.anInt5788 = 0;
        anInt6432 = 0;
        Node_Sub15_Sub4.anInt9699 = 0;
        Class84_Sub8.anInt5484 = 0;
        Class90.anInt1180 = 0;
        Class320.anInt3693 = 0;
        Class86.anInt1072 = 0;
        Class84_Sub4.anInt5417 = 0;
        Class351.anInt4732 = 0;
        client.anInt5242 = 0;
        ha_Sub3.anInt6134 = 0;
        Class346.anInt4124 = 0;
        ObjectDefinition.anInt3020 = 0;
        Node_Sub14_Sub33.anInt9511 = 0;
        Class249.anInt2814 = 0;
        Class275_Sub1.anInt8584 = 0;
        Node_Sub14_Sub21.anInt9383 = 0;
        Class340_Sub3.anInt8117 = 0;
        Class281.anInt3292 = 0;
        Class346_Sub10.anInt8356 = 0;
        Class376.anInt4945 = 0;
        Class321.anInt3740 = 0;
        Node_Sub14_Sub8.anInt9232 = 0;
        Class48.anInt650 = 0;
        Node_Sub14_Sub12.anInt9265 = 0;
        Node_Sub47.anInt7408 = 0;
        Class54_Sub1.anInt5325 = 0;
        ha_Sub3_Sub1.anInt8744 = 0;
        Class219.anInt2513 = 0;
        Class28.anInt4883 = 0;
        Class282_Sub25.anInt7849 = 0;
        ha_Sub3.anInt6034 = 0;
        Class48.anInt635 = 0;
        Class238_Sub3.anInt6778 = 0;
        Class129_Sub2.anInt8537 = 0;
        Class374.anInt4594 = 0;
        ha_Sub2.anInt5781 = 0;
        Class70.anInt916 = 0;
        Class80.anInt1018 = 0;
        ha_Sub3.anInt6094 = 0;
        Class147.anInt1741 = 0;
        Class56.anInt784 = 0;
        Node_Sub2_Sub4.anInt8882 = 0;
        Class147.anInt1735 = 0;
        Class84_Sub6.anInt5449 = 0;
        Class61.anInt826 = 0;
        Class112_Sub1.anInt8627 = 0;
        ObjectDefinition.anInt3057 = 0;
        Node_Sub8_Sub6.anInt8943 = 0;
        Class41.anInt463 = 0;
        Class275.anInt5143 = 0;
        Class143.anInt1687 = 0;
        Node_Sub14_Sub19.anInt9357 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10516 = 0;
        Class272.anInt3163 = 0;
        ha_Sub2.anInt5718 = 0;
        Class136_Sub4.anInt8409 = 0;
        Class311.anInt3611 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10145 = 0;
        Class96.anInt1245 = 0;
        Class44.anInt559 = 0;
        Node_Sub2_Sub4.anInt8870 = 0;
        ha_Sub3.anInt6013 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10354 = 0;
        Class48.anInt646 = 0;
        Applet_Sub1.anInt39 = 0;
        Class211.anInt2439 = 0;
        Class282_Sub14.anInt7726 = 0;
        Class293.anInt3427 = 0;
        Class129_Sub2.anInt8521 = 0;
        Node_Sub39_Sub2.anInt9751 = 0;
        Class143.anInt1680 = 0;
        Class282_Sub9.anInt7685 = 0;
        Class55.anInt731 = 0;
        Class240.anInt2678 = 0;
        ha_Sub3.anInt6123 = 0;
        Class282_Sub1.anInt7597 = 0;
        Class340_Sub8.anInt8184 = 0;
        Class84_Sub6.anInt5446 = 0;
        Class301_Sub3.anInt8449 = 0;
        ByteStream.anInt6936 = 0;
        Class338.anInt3943 = 0;
        Node_Sub39_Sub2.anInt9757 = 0;
        Class150.anInt1776 = 0;
        Class301_Sub2.anInt8431 = 0;
        Class205.anInt2381 = 0;
        ha.anInt1409 = 0;
        Class346_Sub7_Sub5.anInt9961 = 0;
        Class95.anInt1230 = 0;
        Class346_Sub7_Sub4.anInt9952 = 0;
        Class249_Sub1.anInt4711 = 0;
        Class340_Sub3.anInt8118 = 0;
        Node_Sub14_Sub8.anInt9231 = 0;
        Class59.anInt797 = 0;
        Class267.anInt4923 = 0;
        Node_Sub8_Sub12.anInt9019 = 0;
        Class280.anInt3259 = 0;
        Class46.anInt593 = 0;
        Class168.anInt1969 = 0;
        Class206.anInt4988 = 0;
        s_Sub2.anInt7938 = 0;
        Class118.anInt1480 = 0;
        Class282_Sub4.anInt7633 = 0;
        Class48.anInt641 = 0;
        ha_Sub3_Sub1.anInt8685 = 0;
        Node_Sub2_Sub4.anInt8872 = 0;
        Node_Sub8_Sub2.anInt8917 = 0;
        Class69.anInt911 = 0;
        Class346_Sub7_Sub1.anInt9904 = 0;
        Class310.anInt3600 = 0;
        Class158.anInt1880 = 0;
        Class368.anInt4528 = 0;
        Class136_Sub1.anInt8380 = 0;
        Node_Sub24.anInt7102 = 0;
        Class102.anInt1295 = 0;
        ha_Sub2.anInt5638 = 0;
        Class111_Sub1.anInt5525 = 0;
        Class315.anInt3651 = 0;
        Class332.anInt3875 = 0;
        Class223.anInt5174 = 0;
        Class381.anInt4672 = 0;
        ByteStream.anInt6913 = 0;
        Class151.anInt1792 = 0;
        Class340_Sub6.anInt8156 = 0;
        ByteStream.anInt6912 = 0;
        Class310_Sub1.anInt8042 = 0;
        Class103.anInt1313 = 0;
        Class11.anInt241 = 0;
        Class210.anInt2434 = 0;
        Class282_Sub13.anInt7716 = 0;
        Class253_Sub1.anInt7503 = 0;
        ByteStream.anInt6876 = 0;
        Class70.anInt922 = 0;
        Class207.anInt2401 = 0;
        Class283.anInt3333 = 0;
        Class340_Sub9.anInt8210 = 0;
        Class61.anInt834 = 0;
        Class59.anInt812 = 0;
        ha_Sub3.anInt6129 = 0;
        r_Sub2.anInt10278 = 0;
        Node_Sub14_Sub28.anInt9454 = 0;
        Class238_Sub3.anInt6792 = 0;
        Node_Sub14.anInt6980 = 0;
        Class115.anInt4955 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10351 = 0;
        ha_Sub3.anInt6007 = 0;
        Node_Sub45.anInt7351 = 0;
        ha_Sub3.anInt6090 = 0;
        Entity.anInt10492 = 0;
        Class329.anInt3846 = 0;
        Class225_Sub1.anInt8460 = 0;
        ha_Sub3.anInt6071 = 0;
        Interactable.anInt8319 = 0;
        Class307.anInt3560 = 0;
        Class299.anInt3493 = 0;
        Class69.anInt907 = 0;
        Class172.anInt1989 = 0;
        Class49.anInt657 = 0;
        Class365.anInt4479 = 0;
        Class381.anInt4673 = 0;
        Class282_Sub5.anInt7639 = 0;
        ha_Sub2.anInt5675 = 0;
        OutgoingOpcode.anInt1913 = 0;
        Node_Sub14_Sub37.anInt9561 = 0;
        Class293.anInt3424 = 0;
        Class111.anInt1388 = 0;
        Class84_Sub3.anInt5391 = 0;
        Class301.anInt4935 = 0;
        ISAACCypher.anInt2191 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10117 = 0;
        Class293.anInt3441 = 0;
        ha_Sub2.anInt5621 = 0;
        s.anInt3463 = 0;
        ha_Sub3_Sub1.anInt8678 = 0;
        Class321.anInt3750 = 0;
        Node_Sub2_Sub3.anInt8855 = 0;
        Class46.anInt581 = 0;
        Class238_Sub2.anInt6748 = 0;
        ha_Sub3_Sub1.anInt8694 = 0;
        Node_Sub15_Sub5.anInt9713 = 0;
        Node_Sub21.anInt7058 = 0;
        ha_Sub3.anInt5975 = 0;
        Class111_Sub1.anInt5534 = 0;
        Class226_Sub1.anInt6658 = 0;
        Class321.anInt3737 = 0;
        Class297.anInt5018 = 0;
        Class279_Sub1_Sub2.anInt9822 = 0;
        Class282_Sub29.anInt7904 = 0;
        ha_Sub3.anInt6105 = 0;
        Class108.anInt1358 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10035 = 0;
        Class249_Sub2.anInt4795 = 0;
        ha_Sub2.anInt5646 = 0;
        Node_Sub15_Sub1.anInt9624 = 0;
        Node_Sub14_Sub20.anInt9368 = 0;
        Class330.anInt3852 = 0;
        Class47.anInt606 = 0;
        Class291.anInt4745 = 0;
        ha_Sub2.anInt5587 = 0;
        Class36.anInt403 = 0;
        Node_Sub14_Sub18.anInt9353 = 0;
        Class332.anInt3878 = 0;
        Class293.anInt3429 = 0;
        Entity.anInt10473 = 0;
        Node_Sub15_Sub5.anInt9726 = 0;
        Class282_Sub11.anInt7699 = 0;
        Class129_Sub2.anInt8541 = 0;
        Class198.anInt2240 = 0;
        Class77.anInt996 = 0;
        Class60.anInt819 = 0;
        Applet_Sub1.anInt14 = 0;
        Class236.anInt2629 = 0;
        Node_Sub35.anInt7248 = 0;
        Class112.anInt5220 = 0;
        Class321.anInt3780 = 0;
        Class84_Sub5.anInt5426 = 0;
        Class269_Sub2.anInt7534 = 0;
        ISAACCypher.anInt2201 = 0;
        Class320.anInt3695 = 0;
        Class144.anInt1693 = 0;
        Class356.anInt4393 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10241 = 0;
        Class45.anInt562 = 0;
        Class59.anInt813 = 0;
        RSInterface2.anInt4352 = 0;
        Class330_Sub1.anInt8068 = 0;
        s_Sub2.anInt7940 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10086 = 0;
        ha_Sub2.anInt5754 = 0;
        Class255.anInt2919 = 0;
        Class224.anInt2542 = 0;
        Class349_Sub2.anInt4723 = 0;
        ha_Sub2.anInt5779 = 0;
        Class318.anInt3679 = 0;
        ByteStream.anInt6918 = 0;
        Class367.anInt4500 = 0;
        Class269_Sub2.anInt7550 = 0;
        Class19.anInt303 = 0;
        Class12.anInt253 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10171 = 0;
        Class7.anInt170 = 0;
        Class192.anInt2208 = 0;
        Node_Sub14_Sub34.anInt9523 = 0;
        ha_Sub3_Sub1.anInt8695 = 0;
        Class251.anInt2833 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10147 = 0;
        Node_Sub15_Sub1.anInt9620 = 0;
        Class238_Sub2.anInt6735 = 0;
        RSInterface.anInt6853 = 0;
        Class137.anInt1643 = 0;
        Class368.anInt4516 = 0;
        Entity.anInt10495 = 0;
        Class231.anInt2605 = 0;
        WorldAddress.anInt1188 = 0;
        Class365.anInt4483 = 0;
        Class279_Sub1_Sub1.anInt9814 = 0;
        Class225_Sub3.anInt8471 = 0;
        ha_Sub3.anInt6015 = 0;
        Class285.anInt3356 = 0;
        Class301.anInt4936 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10139 = 0;
        Class84_Sub1.anInt5373 = 0;
        Class144.anInt1699 = 0;
        Class182.anInt2104 = 0;
        Class86.anInt1054 = 0;
        Class208.anInt2404 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10084 = 0;
        ha_Sub3.anInt5962 = 0;
        ha_Sub3_Sub1.anInt8686 = 0;
        anInt6391 = 0;
        Class111.anInt1389 = 0;
        Class315.anInt3658 = 0;
        Class182.anInt2121 = 0;
        ha_Sub3_Sub1.anInt8682 = 0;
        Class74.anInt960 = 0;
        Applet_Sub1.anInt9 = 0;
        Class302.anInt3503 = 0;
        Class282_Sub3.anInt7615 = 0;
        Class219.anInt2517 = 0;
        Class346_Sub7_Sub3.anInt9935 = 0;
        Class84_Sub5.anInt5423 = 0;
        RSInterface2.anInt4364 = 0;
        Class360.anInt4444 = 0;
        Class310_Sub1.anInt8031 = 0;
        Class339.anInt3945 = 0;
        Class203.anInt2313 = 0;
        Class282_Sub6.anInt7648 = 0;
        Node_Sub40_Sub1.anInt9766 = 0;
        Class50.anInt673 = 0;
        Class359.anInt4429 = 0;
        anInt6316 = 0;
        Class282_Sub21.anInt7811 = 0;
        Class84_Sub2.anInt5389 = 0;
        Class381.anInt4671 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10194 = 0;
        Class296.anInt3457 = 0;
        Class307.anInt3563 = 0;
        Class36.anInt407 = 0;
        Node_Sub45.anInt7361 = 0;
        Class112.anInt5217 = 0;
        anInt6355 = 0;
        Class275.anInt5153 = 0;
        Class340_Sub7.anInt8180 = 0;
        Class278.anInt3239 = 0;
        Class84_Sub4.anInt5412 = 0;
        Node_Sub14_Sub12.anInt9274 = 0;
        ha_Sub3.anInt6142 = 0;
        Class26.anInt349 = 0;
        Class86.anInt1074 = 0;
        Class340_Sub8.anInt8194 = 0;
        Class321.anInt3741 = 0;
        Class72.anInt4880 = 0;
        Class326.anInt4808 = 0;
        Class282_Sub10.anInt7692 = 0;
        Class219.anInt2521 = 0;
        Class252.anInt2837 = 0;
        Class290.anInt3414 = 0;
        Class346_Sub7_Sub4.anInt9950 = 0;
        Class12.anInt254 = 0;
        Class282_Sub21.anInt7804 = 0;
        Node_Sub11_Sub1.anInt9143 = 0;
        Class122.anInt1523 = 0;
        Class371.anInt4568 = 0;
        Class282_Sub4.anInt7627 = 0;
        Node_Sub8_Sub11.anInt8997 = 0;
        RSInterface.anInt6856 = 0;
        Node_Sub14_Sub38.anInt9575 = 0;
        ha_Sub2.anInt5735 = 0;
        Class346_Sub6.anInt8293 = 0;
        Class238_Sub2.anInt6747 = 0;
        Class259.anInt2959 = 0;
        Class86_Sub1.anInt5510 = 0;
        ha_Sub3.anInt6035 = 0;
        Class282_Sub29.anInt7906 = 0;
        Class282_Sub12.anInt7710 = 0;
        Class126.anInt1552 = 0;
        Class343.anInt4052 = 0;
        Class329.anInt3848 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10097 = 0;
        Class262.anInt2976 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10379 = 0;
        Class282_Sub4.anInt7626 = 0;
        Class267.anInt4921 = 0;
        Node_Sub8_Sub1.anInt8907 = 0;
        Class233.anInt2613 = 0;
        Node_Sub14.anInt6977 = 0;
        Class282_Sub15.anInt7746 = 0;
        Class177.anInt2072 = 0;
        Class275_Sub1.anInt8587 = 0;
        Class84_Sub4.anInt5410 = 0;
        Applet_Sub1.anInt7 = 0;
        InputStream_Sub2.anInt77 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10015 = 0;
        Class84_Sub8.anInt5477 = 0;
        Class138.anInt1655 = 0;
        Class218.anInt2496 = 0;
        Class311.anInt3618 = 0;
        Class238_Sub2.anInt6758 = 0;
        Node_Sub8_Sub14_Sub1.anInt10295 = 0;
        Class372.anInt4575 = 0;
        Node_Sub14_Sub7.anInt9216 = 0;
        Canvas_Sub1.anInt67 = 0;
        ha.anInt1412 = 0;
        Class112_Sub4.anInt8653 = 0;
        Class318.anInt3678 = 0;
        Class96.anInt1238 = 0;
        Class84_Sub7.anInt5467 = 0;
        ha_Sub3_Sub1.anInt8699 = 0;
        Class61.anInt836 = 0;
        r_Sub2.anInt10282 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10138 = 0;
        s_Sub2.anInt7930 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10200 = 0;
        Class86.anInt1075 = 0;
        Node_Sub8_Sub13_Sub2.anInt10257 = 0;
        Class290.anInt3415 = 0;
        ha_Sub3.anInt6093 = 0;
        Class282_Sub1.anInt7590 = 0;
        Node_Sub21.anInt7060 = 0;
        Class332.anInt3876 = 0;
        Class54.anInt725 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10389 = 0;
        Node_Sub2_Sub1.anInt8827 = 0;
        Class380.anInt4642 = 0;
        Class65.anInt883 = 0;
        Class68.anInt906 = 0;
        Entity.anInt10426 = 0;
        Player.anInt10582 = 0;
        Class282_Sub29.anInt7901 = 0;
        Class84_Sub1.anInt5374 = 0;
        Class138.anInt1654 = 0;
        int i_553_ = -39 % ((i - -84) / 33);
        Class59.anInt816 = 0;
        Class381.anInt4678 = 0;
        Class340_Sub10.anInt8222 = 0;
        s_Sub2.anInt7947 = 0;
        Class238_Sub3.anInt6759 = 0;
        Class346_Sub1.anInt8252 = 0;
        Node_Sub8_Sub1.anInt8896 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10182 = 0;
        Class11.anInt237 = 0;
        Node_Sub15_Sub1.anInt9613 = 0;
        Node_Sub8_Sub3.anInt8926 = 0;
        Class307.anInt3561 = 0;
        ha_Sub2.anInt5626 = 0;
        Class234.anInt2615 = 0;
        Class357.anInt4406 = 0;
        Node_Sub15_Sub5.anInt9724 = 0;
        ByteStream.anInt6892 = 0;
        Class54_Sub3.anInt5345 = 0;
        Class253.anInt2849 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10196 = 0;
        Node_Sub15_Sub5.anInt9721 = 0;
        Entity.anInt10465 = 0;
        Class240.anInt2683 = 0;
        Class337.anInt3924 = 0;
        Class162_Sub2.anInt6474 = 0;
        Class293.anInt3435 = 0;
        ha_Sub3_Sub1.anInt8676 = 0;
        Node_Sub11_Sub1.anInt9127 = 0;
        Class79.anInt1004 = 0;
        Class80.anInt1013 = 0;
        Class325.anInt3826 = 0;
        ha_Sub2.anInt5671 = 0;
        Player.anInt10543 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10088 = 0;
        Class347.anInt4147 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10143 = 0;
        Node_Sub8_Sub15.anInt9048 = 0;
        ha_Sub3.anInt6046 = 0;
        Class150.anInt1777 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10166 = 0;
        Class239.anInt2673 = 0;
        ByteStream.anInt6894 = 0;
        Node_Sub2_Sub1.anInt8830 = 0;
        ByteStream.anInt6898 = 0;
        Class76.anInt981 = 0;
        Class229.anInt2592 = 0;
        Class149.anInt1746 = 0;
        ha_Sub2.anInt5609 = 0;
        Class321.anInt3710 = 0;
        Class253_Sub1.anInt7510 = 0;
        Class181.anInt2096 = 0;
        Class73.anInt944 = 0;
        Class136_Sub3.anInt8398 = 0;
        Class79.anInt999 = 0;
        ha_Sub3.anInt6084 = 0;
        Class56.anInt739 = 0;
        Class162_Sub2.anInt6441 = 0;
        anInt6358 = 0;
        Node_Sub8_Sub4.anInt8366 = 0;
        Class223.anInt5190 = 0;
        Class207.anInt2393 = 0;
        Class238_Sub2.anInt6749 = 0;
        Class40.anInt444 = 0;
        Class347.anInt4129 = 0;
        Class64.anInt866 = 0;
        ha_Sub2.anInt5594 = 0;
        Class162_Sub2.anInt6512 = 0;
        Class198.anInt2247 = 0;
        Node_Sub42_Sub1.anInt9779 = 0;
        ha_Sub3.anInt6113 = 0;
        Class186.anInt2167 = 0;
        Class162_Sub2.anInt6533 = 0;
        Node_Sub8_Sub13_Sub1.anInt10244 = 0;
        Class340_Sub5.anInt8126 = 0;
        Node_Sub14_Sub4.anInt9196 = 0;
        ha_Sub2.anInt5596 = 0;
        Class310.anInt3596 = 0;
        NPC.anInt10586 = 0;
        Class319.anInt3683 = 0;
        Class18.anInt293 = 0;
        Class279_Sub2.anInt7570 = 0;
        Class84_Sub1.anInt5376 = 0;
        Class282_Sub4.anInt7628 = 0;
        Node_Sub8_Sub6.anInt8952 = 0;
        Class85.anInt1042 = 0;
        Class194.anInt2228 = 0;
        Class378.anInt4635 = 0;
        Class254.anInt5123 = 0;
        ha_Sub3.anInt5991 = 0;
        Node_Sub14_Sub24.anInt9405 = 0;
        Class162_Sub2.anInt6542 = 0;
        Node_Sub3.anInt6829 = 0;
        Class109.anInt1374 = 0;
        Class326.anInt4812 = 0;
        Class9.anInt184 = 0;
        Class136.anInt4776 = 0;
        Class47.anInt604 = 0;
        Class70.anInt928 = 0;
        OutputStream_Sub2.anInt92 = 0;
        Class59.anInt802 = 0;
        Class129_Sub1.anInt8489 = 0;
        aa_Sub2.anInt5257 = 0;
        Class194.anInt2223 = 0;
        Node_Sub8_Sub10.anInt8980 = 0;
        Class141.anInt5047 = 0;
        ha_Sub2.anInt5749 = 0;
        ha_Sub2.anInt5712 = 0;
        Class178.anInt2080 = 0;
        Node_Sub18.anInt7007 = 0;
        Node_Sub40.anInt7286 = 0;
        Node_Sub14_Sub9.anInt9244 = 0;
        Node_Sub8_Sub17.anInt9062 = 0;
        Class279_Sub1.anInt7566 = 0;
        Class19.anInt297 = 0;
        Class238_Sub3.anInt6768 = 0;
        Class119.anInt1500 = 0;
        Applet_Sub1.anInt18 = 0;
        Class349_Sub1.anInt4788 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10058 = 0;
        Class282_Sub24.anInt7844 = 0;
        Animable.anInt9924 = 0;
        Class246.anInt2775 = 0;
        Class238_Sub2.anInt6751 = 0;
        Node_Sub8_Sub14_Sub1.anInt10294 = 0;
        Class66.anInt5024 = 0;
        Node_Sub42.anInt7297 = 0;
        ha_Sub2.anInt5644 = 0;
        Node_Sub8_Sub16_Sub1.anInt10299 = 0;
        Node_Sub14_Sub16.anInt9329 = 0;
        Node_Sub14_Sub32.anInt9505 = 0;
        Node_Sub46.anInt7388 = 0;
        Animable.anInt9915 = 0;
        Class84_Sub5.anInt5428 = 0;
        Class136.anInt4773 = 0;
        Class275.anInt5142 = 0;
        ha_Sub2.anInt5710 = 0;
        anInt6359 = 0;
        Class343.anInt4068 = 0;
        Class327.anInt3834 = 0;
        Class27.anInt363 = 0;
        Class282_Sub16.anInt7757 = 0;
        Applet_Sub1.anInt36 = 0;
        Class238_Sub2.anInt6752 = 0;
        Class112_Sub3.anInt8640 = 0;
        Class289.anInt3402 = 0;
        Class238_Sub3.anInt6795 = 0;
        Class34.anInt392 = 0;
        Class282_Sub10.anInt7689 = 0;
        Node_Sub14_Sub25.anInt9425 = 0;
        Class282_Sub11.anInt7701 = 0;
        Class86_Sub1.anInt5515 = 0;
        Class148.anInt5112 = 0;
        Class227.anInt2550 = 0;
        Player.anInt10564 = 0;
        Node_Sub15_Sub1.anInt9653 = 0;
        Node_Sub29.anInt7174 = 0;
        Class44_Sub1.anInt5285 = 0;
        Class9.anInt189 = 0;
        Node_Sub38.anInt7270 = 0;
        Node_Sub15_Sub1.anInt9610 = 0;
        Class285.anInt3371 = 0;
        Class346_Sub7_Sub2_Sub1.anInt9996 = 0;
        Node_Sub14_Sub31.anInt9490 = 0;
        ha_Sub3_Sub1.anInt8733 = 0;
        Class238_Sub3.anInt6769 = 0;
        Class130.anInt1591 = 0;
        Class84_Sub6.anInt5448 = 0;
        Class321.anInt3777 = 0;
        Class56.anInt764 = 0;
        Class162_Sub2.anInt6453 = 0;
        Node_Sub47.anInt7407 = 0;
        Node_Sub14_Sub7.anInt9219 = 0;
        Class370.anInt4546 = 0;
        Class249_Sub2.anInt4801 = 0;
        Node_Sub8_Sub1.anInt8886 = 0;
        Class26.anInt350 = 0;
        Class173.anInt2003 = 0;
        ha_Sub3_Sub1.anInt8706 = 0;
        Class330_Sub1.anInt8073 = 0;
        ha_Sub2.anInt5650 = 0;
        Class282_Sub27.anInt7875 = 0;
        Class269_Sub2.anInt7554 = 0;
        ha_Sub3.anInt5973 = 0;
        ha_Sub2.anInt5622 = 0;
        ByteStream.anInt6921 = 0;
        Class54_Sub1.anInt5331 = 0;
        Class299.anInt3487 = 0;
        Class325.anInt3827 = 0;
        Class94.anInt1223 = 0;
        Class225_Sub1_Sub1.anInt9977 = 0;
        Class317.anInt3667 = 0;
        Node_Sub14_Sub37.anInt9564 = 0;
        Class218.anInt2505 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10406 = 0;
        ha_Sub3.anInt6088 = 0;
        ha_Sub3_Sub1.anInt8661 = 0;
        Class282_Sub28.anInt7882 = 0;
        Class310.anInt3609 = 0;
        Class330.anInt3855 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10232 = 0;
        Class278.anInt3227 = 0;
        ISAACCypher.anInt2195 = 0;
        Class282_Sub15.anInt7745 = 0;
        NPC.anInt10613 = 0;
        Class186.anInt2165 = 0;
        Class282_Sub3.anInt7619 = 0;
        Class148.anInt5097 = 0;
        Class346_Sub4.anInt8273 = 0;
        Class49.anInt659 = 0;
        Node_Sub15_Sub1.anInt9651 = 0;
        Class218.anInt2495 = 0;
        ha_Sub3.anInt6079 = 0;
        Class114.anInt1427 = 0;
        NPC.anInt10603 = 0;
        Class39.anInt426 = 0;
        anInt6322 = 0;
        Class377.anInt4624 = 0;
        Node_Sub14_Sub33.anInt9509 = 0;
        Class164.anInt1921 = 0;
        Class279_Sub2_Sub1.anInt9826 = 0;
        Class219.anInt2519 = 0;
        Class316_Sub1.anInt8044 = 0;
        Class342.anInt3992 = 0;
        Class219.anInt2511 = 0;
        Class99.anInt1267 = 0;
        ha_Sub2.anInt5635 = 0;
        Node_Sub15_Sub5.anInt9725 = 0;
        ha_Sub2.anInt5607 = 0;
        OutputStream_Sub1.anInt90 = 0;
        Applet_Sub1.anInt25 = 0;
        Node_Sub15_Sub1.anInt9652 = 0;
        Node_Sub14_Sub31.anInt9486 = 0;
        anInt6393 = 0;
        Class84_Sub8.anInt5485 = 0;
        Class65.anInt892 = 0;
        Node_Sub47.anInt7414 = 0;
        Class287.anInt3387 = 0;
        Node_Sub15_Sub1.anInt9640 = 0;
        Class310_Sub1.anInt8035 = 0;
        Class342.anInt3989 = 0;
        Animable.anInt9921 = 0;
        Class162_Sub2.anInt6452 = 0;
        Class112.anInt5208 = 0;
        Class85.anInt1038 = 0;
        Class375.anInt4605 = 0;
        Class4.anInt135 = 0;
        Class343.anInt4043 = 0;
        Class226.anInt2547 = 0;
        Class101.anInt1288 = 0;
        Node_Sub14_Sub31.anInt9487 = 0;
        Node_Sub8_Sub11.anInt9002 = 0;
        Class147.anInt1739 = 0;
        Class128.anInt1571 = 0;
        ByteStream.anInt6907 = 0;
        Class84_Sub6.anInt5451 = 0;
        Class283.anInt3342 = 0;
        Class311.anInt3616 = 0;
        ha_Sub3_Sub1.anInt8663 = 0;
        Class356.anInt4385 = 0;
        Class44_Sub1.anInt5287 = 0;
        Node_Sub14_Sub10.anInt9247 = 0;
        ha_Sub2.anInt5628 = 0;
        Class87.anInt1083 = 0;
        Class285.anInt3361 = 0;
        Class366.anInt4496 = 0;
        Class342.anInt4002 = 0;
        Class282_Sub19.anInt7787 = 0;
        Class346_Sub7_Sub2_Sub1.anInt9992 = 0;
        Class278.anInt3226 = 0;
        Node_Sub2_Sub3.anInt8847 = 0;
        Class250.anInt2818 = 0;
        Class147_Sub1.anInt6286 = 0;
        NPC.anInt10609 = 0;
        Class182.anInt2110 = 0;
        Class82.anInt1019 = 0;
        Class345.anInt4100 = 0;
        Class109.anInt1370 = 0;
        ha_Sub2.anInt5652 = 0;
        Class223.anInt5180 = 0;
        anInt6357 = 0;
        Class218.anInt2500 = 0;
        s_Sub3.anInt7997 = 0;
        RSInterface2.anInt4215 = 0;
        anInt6326 = 0;
        Class64.anInt862 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10080 = 0;
        anInt6335 = 0;
        Class345.anInt4104 = 0;
        ha_Sub2.anInt5690 = 0;
        Class41.anInt461 = 0;
        Class287.anInt3385 = 0;
        Class279_Sub2.anInt7569 = 0;
        Class84_Sub7.anInt5463 = 0;
        Node_Sub14_Sub10.anInt9251 = 0;
        ha_Sub3.anInt6029 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10324 = 0;
        Class223.anInt5176 = 0;
        Node_Sub15_Sub1.anInt9606 = 0;
        ha_Sub3.anInt6126 = 0;
        Class223.anInt5185 = 0;
        Node_Sub39.anInt7276 = 0;
        Class89.anInt1092 = 0;
        Class301_Sub3.anInt8444 = 0;
        Class223.anInt5192 = 0;
        Class269_Sub2.anInt7545 = 0;
        Class381.anInt4690 = 0;
        Class282_Sub3.anInt7620 = 0;
        Class330_Sub1.anInt8062 = 0;
        Node_Sub8_Sub3.anInt8925 = 0;
        RSInterface2.anInt4244 = 0;
        Class282_Sub6.anInt7647 = 0;
        Class330_Sub1.anInt8059 = 0;
        Class275.anInt5138 = 0;
        Class250.anInt2817 = 0;
        Class238_Sub1.anInt6682 = 0;
        Class282_Sub2.anInt7600 = 0;
        Class330_Sub1.anInt8078 = 0;
        Class346_Sub7_Sub1.anInt9914 = 0;
        OutgoingOpcode.anInt1912 = 0;
        Class52.anInt704 = 0;
        aa_Sub3.anInt5266 = 0;
        Class17.anInt292 = 0;
        Class282_Sub24.anInt7843 = 0;
        Class136.anInt4774 = 0;
        Class301_Sub2.anInt8433 = 0;
        Class90.anInt1147 = 0;
        Class209.anInt2420 = 0;
        ByteStream.anInt6939 = 0;
        Node_Sub8_Sub1.anInt8893 = 0;
        Class50.anInt668 = 0;
        ByteStream.anInt6878 = 0;
        RSInterface2.anInt4213 = 0;
        Class282_Sub2.anInt7607 = 0;
        Player.anInt10540 = 0;
        Class346_Sub7_Sub3.anInt9938 = 0;
        ha_Sub3.anInt6030 = 0;
        Class160.anInt1886 = 0;
        ha_Sub3.anInt6144 = 0;
        Node_Sub14_Sub33.anInt9508 = 0;
        Class255.anInt2886 = 0;
        Class150.anInt1775 = 0;
        OutgoingOpcode.anInt1911 = 0;
        ByteStream.anInt6927 = 0;
        Node_Sub2_Sub1.anInt8836 = 0;
        Node_Sub12.anInt6962 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10336 = 0;
        Class282_Sub29.anInt7898 = 0;
        Class315.anInt3659 = 0;
        ha_Sub3.anInt6039 = 0;
        ByteStream.anInt6909 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10146 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10374 = 0;
        Class285.anInt3367 = 0;
        Class85.anInt1039 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10208 = 0;
        Class136.anInt4784 = 0;
        Class269_Sub2.anInt7540 = 0;
        Class332.anInt3886 = 0;
        s_Sub3.anInt8004 = 0;
        Node.anInt2796 = 0;
        Class124.anInt1539 = 0;
        Class279_Sub2.anInt7579 = 0;
        Class121.anInt1515 = 0;
        Class136_Sub1.anInt8379 = 0;
        Node_Sub42.anInt7295 = 0;
        ha_Sub3.anInt6117 = 0;
        Class169.anInt1975 = 0;
        Class355.anInt4380 = 0;
        Class235.anInt2618 = 0;
        Node_Sub14_Sub27.anInt9442 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10235 = 0;
        Class103.anInt1324 = 0;
        Class162_Sub2.anInt6550 = 0;
        ha_Sub3.anInt5958 = 0;
        Class25.anInt333 = 0;
        Class359.anInt4431 = 0;
        Class301_Sub1.anInt8424 = 0;
        Class337.anInt3933 = 0;
        Class226_Sub3.anInt6668 = 0;
        ha_Sub2.anInt5595 = 0;
        Class282_Sub21.anInt7818 = 0;
        Node_Sub8_Sub2.anInt8911 = 0;
        Node_Sub14_Sub26.anInt9436 = 0;
        Class275_Sub1.anInt8588 = 0;
        Class141.anInt5051 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10148 = 0;
        Node_Sub14_Sub29.anInt9467 = 0;
        ha_Sub3_Sub1.anInt8741 = 0;
        Class216.anInt2484 = 0;
        Class156.anInt1855 = 0;
        Class109.anInt1373 = 0;
        Class310_Sub1.anInt8037 = 0;
        ha_Sub3.anInt6051 = 0;
        Class124.anInt1532 = 0;
        Class84.anInt1035 = 0;
        Class84_Sub7.anInt5457 = 0;
        Class321.anInt3766 = 0;
        Class83.anInt1034 = 0;
        Class225_Sub3.anInt8476 = 0;
        ObjectDefinition.anInt3086 = 0;
        Class282_Sub9.anInt7684 = 0;
        Class162_Sub2.anInt6513 = 0;
        Class282_Sub26.anInt7863 = 0;
        ha_Sub3.anInt6119 = 0;
        ha_Sub3.anInt6065 = 0;
        Class346_Sub7_Sub1.anInt9906 = 0;
        client.anInt5229 = 0;
        Class162.anInt1897 = 0;
        Node_Sub14_Sub31.anInt9484 = 0;
        Applet_Sub1.anInt20 = 0;
        Node_Sub42.anInt7302 = 0;
        Node_Sub39_Sub2.anInt9754 = 0;
        Class333.anInt3892 = 0;
        za_Sub2.anInt9808 = 0;
        Node_Sub8_Sub1.anInt8904 = 0;
        ha_Sub2.anInt5729 = 0;
        Class282_Sub8.anInt7671 = 0;
        ha_Sub2.anInt5641 = 0;
        ha_Sub3.anInt6081 = 0;
        Class238_Sub3.anInt6783 = 0;
        Class84_Sub3.anInt5398 = 0;
        Class113.anInt1398 = 0;
        RSInterface2.anInt4326 = 0;
        Class162_Sub2.anInt6552 = 0;
        ha_Sub3.anInt6101 = 0;
        Class305.anInt3543 = 0;
        Node_Sub14_Sub35.anInt9535 = 0;
        Class323.anInt3800 = 0;
        anInt6343 = 0;
        Class335.anInt3907 = 0;
        Class145.anInt1716 = 0;
        Class84_Sub5.anInt5431 = 0;
        Class124.anInt1543 = 0;
        Class257.anInt2943 = 0;
        Node_Sub14_Sub15.anInt9320 = 0;
        Class247.anInt2792 = 0;
        Node_Sub14_Sub5.anInt9202 = 0;
        ha_Sub3.anInt6116 = 0;
        Class86.anInt1078 = 0;
        Class240.anInt2681 = 0;
        Class234.anInt2616 = 0;
        Node_Sub14_Sub3.anInt9178 = 0;
        Class65.anInt880 = 0;
        Class310.anInt3593 = 0;
        ha_Sub2.anInt5588 = 0;
        NPC.anInt10601 = 0;
        Applet_Sub1.anInt38 = 0;
        Class185_Sub1.anInt6656 = 0;
        Class209.anInt2413 = 0;
        Class340_Sub2.anInt8101 = 0;
        ha_Sub3.anInt6012 = 0;
        Node_Sub8_Sub13.anInt9026 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10403 = 0;
        Class340_Sub10.anInt8224 = 0;
        Class278.anInt3221 = 0;
        Class209.anInt2415 = 0;
        Node_Sub14_Sub25.anInt9421 = 0;
        Class242.anInt2702 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10238 = 0;
        Class344.anInt4081 = 0;
        Class303.anInt3518 = 0;
        Class119.anInt1499 = 0;
        Node_Sub14_Sub11.anInt9260 = 0;
        Node_Sub14_Sub13.anInt9296 = 0;
        Node_Sub15_Sub1.anInt9641 = 0;
        ha_Sub3.anInt6146 = 0;
        ha_Sub3.anInt6048 = 0;
        ha_Sub2.anInt5742 = 0;
        Class282_Sub18.anInt7778 = 0;
        Class346_Sub7_Sub1.anInt9911 = 0;
        Class164.anInt1932 = 0;
        ha_Sub3.anInt6036 = 0;
        Class223.anInt5186 = 0;
        Class282_Sub12.anInt7711 = 0;
        Class238_Sub3.anInt6781 = 0;
        Class282_Sub19.anInt7788 = 0;
        Class282_Sub19.anInt7784 = 0;
        ha_Sub2.anInt5747 = 0;
        r_Sub1.anInt10267 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10190 = 0;
        Class8.anInt175 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10050 = 0;
        Class51.anInt692 = 0;
        Class365.anInt4482 = 0;
        Class150.anInt1757 = 0;
        ha_Sub3_Sub1.anInt8674 = 0;
        Node_Sub24.anInt7098 = 0;
        Class311.anInt3615 = 0;
        Node_Sub25.anInt5157 = 0;
        Node_Sub8_Sub14.anInt9038 = 0;
        Class303.anInt3517 = 0;
        PacketStream.anInt9113 = 0;
        ha_Sub3.anInt5971 = 0;
        Node_Sub14_Sub36.anInt9545 = 0;
        Class282_Sub20.anInt7802 = 0;
        ha_Sub2.anInt5702 = 0;
        Node_Sub14_Sub39.anInt9596 = 0;
        Class65.anInt877 = 0;
        Class139.anInt1658 = 0;
        ha_Sub3_Sub1.anInt8729 = 0;
        ha_Sub2.anInt5611 = 0;
        Class111_Sub1.anInt5524 = 0;
        Class106.anInt1347 = 0;
        Node_Sub39_Sub2.anInt9753 = 0;
        Node_Sub47.anInt7402 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10123 = 0;
        Class187.anInt2176 = 0;
        Class278.anInt3237 = 0;
        Class282_Sub1.anInt7596 = 0;
        Class112_Sub2.anInt8637 = 0;
        Class40.anInt449 = 0;
        ha_Sub3.anInt6027 = 0;
        Class282_Sub6.anInt7644 = 0;
        Class368.anInt4526 = 0;
        Class184.anInt2152 = 0;
        Class315.anInt3655 = 0;
        Class275_Sub2.anInt8606 = 0;
        ha_Sub2.anInt5630 = 0;
        Class257.anInt2935 = 0;
        Class299.anInt3486 = 0;
        Node_Sub14_Sub24.anInt9406 = 0;
        Class96.anInt1240 = 0;
        ha_Sub3_Sub1.anInt8732 = 0;
        ha_Sub2.anInt5639 = 0;
        ha_Sub3.anInt6098 = 0;
        Node_Sub50.anInt7443 = 0;
        Class84_Sub3.anInt5393 = 0;
        ha_Sub3_Sub1.anInt8704 = 0;
        ha_Sub2.anInt5757 = 0;
        Class346_Sub6.anInt8290 = 0;
        Node_Sub2_Sub4.anInt8868 = 0;
        Class75.anInt972 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10019 = 0;
        Class238_Sub2.anInt6712 = 0;
        Node_Sub15_Sub1.anInt9626 = 0;
        Class31.anInt380 = 0;
        Class278.anInt3235 = 0;
        ha_Sub2.anInt5603 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10066 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10115 = 0;
        Node_Sub14_Sub1.anInt9161 = 0;
        Node_Sub20.anInt7044 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10083 = 0;
        Class340_Sub9.anInt8207 = 0;
        Node_Sub8_Sub7.anInt8961 = 0;
        Node_Sub42_Sub1.anInt9783 = 0;
        Class356.anInt4384 = 0;
        ha_Sub2.anInt5756 = 0;
        Class275_Sub1.anInt8583 = 0;
        PacketStream.anInt9112 = 0;
        Class206.anInt4975 = 0;
        anInt6315 = 0;
        Class346_Sub7_Sub2_Sub1.anInt9999 = 0;
        Class238_Sub3.anInt6767 = 0;
        Class207.anInt2390 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10218 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10142 = 0;
        Node_Sub14_Sub33.anInt9519 = 0;
        Class74.anInt953 = 0;
        s_Sub2.anInt7936 = 0;
        Class278.anInt3228 = 0;
        Class343.anInt4050 = 0;
        Class131.anInt1593 = 0;
        Node_Sub14_Sub39.anInt9585 = 0;
        Class151.anInt1796 = 0;
        Class225_Sub1_Sub1.anInt9979 = 0;
        Node_Sub39_Sub2.anInt9746 = 0;
        anInt6382 = 0;
        r_Sub2.anInt10288 = 0;
        Class194.anInt2224 = 0;
        Class323.anInt3809 = 0;
        Class293.anInt3426 = 0;
        Class162_Sub2.anInt6530 = 0;
        Class349_Sub1.anInt4792 = 0;
        Class154.anInt1822 = 0;
        Node_Sub14_Sub12.anInt9275 = 0;
        Class225_Sub2.anInt8467 = 0;
        ha_Sub2.anInt5625 = 0;
        Class333.anInt3889 = 0;
        Class209.anInt2409 = 0;
        Class112_Sub1.anInt8631 = 0;
        Node_Sub15_Sub5.anInt9711 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10216 = 0;
        Class136.anInt4782 = 0;
        Class282_Sub1.anInt7591 = 0;
        Class64.anInt860 = 0;
        Node_Sub14_Sub35.anInt9533 = 0;
        Class308.anInt3574 = 0;
        ByteStream.anInt6938 = 0;
        RSInterface2.anInt4251 = 0;
        Class316_Sub2.anInt8051 = 0;
        ByteStream.anInt6914 = 0;
        Node_Sub11.anInt6951 = 0;
        Class282_Sub25.anInt7850 = 0;
        Node_Sub14_Sub1.anInt9160 = 0;
        Class189.anInt5060 = 0;
        Class254.anInt5126 = 0;
        Node_Sub14_Sub23.anInt9396 = 0;
        Class279_Sub1.anInt7564 = 0;
        Node_Sub51.anInt7457 = 0;
        Node_Sub15_Sub1.anInt9656 = 0;
        Class238_Sub1.anInt6691 = 0;
        Class193.anInt2219 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10124 = 0;
        Class42.anInt543 = 0;
        Class345.anInt4096 = 0;
        ha_Sub2.anInt5720 = 0;
        Node_Sub14_Sub13.anInt9280 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10040 = 0;
        client.anInt5239 = 0;
        ha_Sub2.anInt5794 = 0;
        Class129_Sub2.anInt8520 = 0;
        Node_Sub15_Sub1.anInt9658 = 0;
        anInt6332 = 0;
        ByteStream.anInt6917 = 0;
        Class15.anInt281 = 0;
        Class27.anInt362 = 0;
        Node_Sub14_Sub19.anInt9356 = 0;
        Node_Sub14_Sub26.anInt9430 = 0;
        ha_Sub3.anInt5957 = 0;
        Node_Sub11.anInt6948 = 0;
        Class265.anInt3001 = 0;
        ha_Sub3_Sub1.anInt8701 = 0;
        ObjectDefinition.anInt3060 = 0;
        Class282_Sub9.anInt7682 = 0;
        ha_Sub3.anInt6001 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10155 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10098 = 0;
        Class66.anInt5026 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10240 = 0;
        Node_Sub15_Sub4.anInt9696 = 0;
        Class103.anInt1311 = 0;
        ha_Sub3.anInt6054 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10043 = 0;
        Class239.anInt2661 = 0;
        anInt6422 = 0;
        RSInterface2.anInt4286 = 0;
        Class56.anInt737 = 0;
        Class189.anInt5071 = 0;
        Class238_Sub1.anInt6690 = 0;
        anInt6414 = 0;
        Class254.anInt5121 = 0;
        Class238_Sub3.anInt6760 = 0;
        Entity.anInt10429 = 0;
        Node_Sub14_Sub19.anInt9355 = 0;
        Class182.anInt2119 = 0;
        Class296.anInt3454 = 0;
        Class239.anInt2657 = 0;
        Class282_Sub3.anInt7618 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10531 = 0;
        Class95.anInt1233 = 0;
        Class349_Sub2.anInt4725 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10057 = 0;
        Class282_Sub14.anInt7733 = 0;
        Class339.anInt3948 = 0;
        Applet_Sub1.anInt15 = 0;
        Applet_Sub1.anInt17 = 0;
        ha_Sub3_Sub1.anInt8742 = 0;
        Entity.anInt10468 = 0;
        Class150.anInt1765 = 0;
        Class222.anInt2540 = 0;
        Class301_Sub3.anInt8440 = 0;
        Class55.anInt735 = 0;
        Class340_Sub6.anInt8153 = 0;
        ha_Sub3_Sub1.anInt8723 = 0;
        Class304.anInt3532 = 0;
        ByteStream.anInt6922 = 0;
        Class282_Sub27.anInt7874 = 0;
        Class150.anInt1784 = 0;
        Class340_Sub6.anInt8154 = 0;
        Class241.anInt2687 = 0;
        Class290.anInt3403 = 0;
        ha_Sub2.anInt5600 = 0;
        Class23.anInt323 = 0;
        Node_Sub14_Sub3.anInt9181 = 0;
        ha_Sub3.anInt6023 = 0;
        ha_Sub3_Sub1.anInt8714 = 0;
        Class282_Sub9.anInt7680 = 0;
        Class209.anInt2411 = 0;
        Class293.anInt3442 = 0;
        ha_Sub2.anInt5745 = 0;
        Class340_Sub7.anInt8166 = 0;
        Class136_Sub4.anInt8405 = 0;
        Class293.anInt3437 = 0;
        Class210.anInt2433 = 0;
        Class282_Sub27.anInt7872 = 0;
        Class84_Sub9.anInt5488 = 0;
        Class84_Sub7.anInt5462 = 0;
        Class249_Sub1.anInt4716 = 0;
        ha_Sub3_Sub1.anInt8711 = 0;
        aa.anInt99 = 0;
        Class346_Sub7_Sub5.anInt9954 = 0;
        Class289.anInt3401 = 0;
        Class237.anInt2643 = 0;
        anInt6349 = 0;
        Class45.anInt564 = 0;
        Class367.anInt4502 = 0;
        Class112.anInt5218 = 0;
        Class82.anInt1025 = 0;
        Class237.anInt2634 = 0;
        Node_Sub15_Sub1.anInt9611 = 0;
        Class39.anInt433 = 0;
        Entity.anInt10475 = 0;
        Class67.anInt899 = 0;
        Node_Sub42_Sub2.anInt9788 = 0;
        ha_Sub3.anInt6092 = 0;
        Class282_Sub6.anInt7646 = 0;
        Node_Sub8_Sub16_Sub1.anInt10300 = 0;
        Class340_Sub5.anInt8132 = 0;
        Class119.anInt1493 = 0;
        Class164.anInt1939 = 0;
        Class282_Sub21.anInt7806 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10101 = 0;
        Class162_Sub2.anInt6514 = 0;
        Class84_Sub8.anInt5480 = 0;
        s_Sub3.anInt7981 = 0;
        anInt6396 = 0;
        Class11.anInt239 = 0;
        Node_Sub8_Sub15.anInt9044 = 0;
        Class229.anInt2599 = 0;
        Class238_Sub1.anInt6696 = 0;
        Class57.anInt787 = 0;
        Class209.anInt2414 = 0;
        Class81_Sub1.anInt8422 = 0;
        Class150.anInt1772 = 0;
        Class28.anInt4891 = 0;
        Class219.anInt2523 = 0;
        Class162_Sub2.anInt6548 = 0;
        Class282_Sub14.anInt7731 = 0;
        Class177.anInt2068 = 0;
        Class340_Sub8.anInt8185 = 0;
        Class164.anInt1942 = 0;
        Node_Sub48.anInt7420 = 0;
        Class128.anInt1568 = 0;
        Node_Sub11_Sub1.anInt9149 = 0;
        Class319.anInt3687 = 0;
        ha_Sub2.anInt5789 = 0;
        Node_Sub14_Sub25.anInt9414 = 0;
        Class162_Sub2.anInt6447 = 0;
        Class119.anInt1486 = 0;
        Node_Sub14_Sub27.anInt9447 = 0;
        Class272.anInt3162 = 0;
        Class142.anInt1672 = 0;
        Class70.anInt921 = 0;
        Class148.anInt5082 = 0;
        Class84_Sub2.anInt5390 = 0;
        Class74.anInt952 = 0;
        Class199.anInt2272 = 0;
        ha_Sub2.anInt5782 = 0;
        s_Sub2.anInt7949 = 0;
        Class74.anInt951 = 0;
        Class279_Sub2.anInt7580 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10181 = 0;
        Class129_Sub1.anInt8492 = 0;
        Class84_Sub4.anInt5420 = 0;
        anInt6337 = 0;
        Class119.anInt1487 = 0;
        Class279_Sub1.anInt7562 = 0;
        Node_Sub36.anInt7255 = 0;
        ha_Sub2.anInt5715 = 0;
        Class271.anInt3155 = 0;
        Class111_Sub1.anInt5532 = 0;
        Class46.anInt578 = 0;
        ObjectDefinition.anInt3034 = 0;
        Class108.anInt1361 = 0;
        ha_Sub2.anInt5699 = 0;
        Class346_Sub7_Sub2_Sub1.anInt9997 = 0;
        Class45.anInt576 = 0;
        ByteStream.anInt6906 = 0;
        Class162_Sub2.anInt6493 = 0;
        Node_Sub42.anInt7303 = 0;
        Node_Sub39_Sub2.anInt9744 = 0;
        Class162_Sub2.anInt6478 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10017 = 0;
        Node_Sub15_Sub1.anInt9633 = 0;
        Node_Sub14_Sub36.anInt9551 = 0;
        Class324.anInt3825 = 0;
        ha_Sub2.anInt5659 = 0;
        Class353.anInt4196 = 0;
        ha_Sub3_Sub1.anInt8717 = 0;
        Class102.anInt1293 = 0;
        ha_Sub3.anInt6128 = 0;
        Class25.anInt334 = 0;
        Class346_Sub5_Sub2.anInt9890 = 0;
        Node_Sub8_Sub5.anInt8935 = 0;
        ha_Sub2.anInt5624 = 0;
        Node_Sub38.anInt7264 = 0;
        Class271.anInt3153 = 0;
        Class282_Sub21.anInt7819 = 0;
        Class5.anInt147 = 0;
        ha_Sub2.anInt5631 = 0;
        Class162_Sub2.anInt6438 = 0;
        Class269_Sub2.anInt7538 = 0;
        Class279_Sub2_Sub2.anInt9836 = 0;
        Player.anInt10538 = 0;
        Player.anInt10575 = 0;
        Class310.anInt3606 = 0;
        Class113.anInt1393 = 0;
        PacketStream.anInt9118 = 0;
        Node_Sub14_Sub11.anInt9263 = 0;
        Entity.anInt10459 = 0;
        ha_Sub3.anInt6110 = 0;
        Class23.anInt324 = 0;
        Class32.anInt386 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10027 = 0;
        Class382.anInt4705 = 0;
        Class282_Sub24.anInt7841 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10072 = 0;
        Class158.anInt1879 = 0;
        Class160.anInt1888 = 0;
        Class253_Sub1.anInt7504 = 0;
        Class238_Sub1.anInt6687 = 0;
        Class265.anInt3005 = 0;
        Node_Sub14_Sub35.anInt9530 = 0;
        Class282_Sub20.anInt7798 = 0;
        client.anInt5232 = 0;
        Class281.anInt3268 = 0;
        Class129_Sub1.anInt8513 = 0;
        Class156.anInt1863 = 0;
        Class80.anInt1014 = 0;
        Class381.anInt4659 = 0;
        Class129_Sub2.anInt8542 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10201 = 0;
        Class164.anInt1940 = 0;
        anInt6364 = 0;
        Class282_Sub5.anInt7641 = 0;
        ha_Sub2.anInt5721 = 0;
        Class282_Sub7.anInt7667 = 0;
        anInt6323 = 0;
        Class85.anInt1046 = 0;
        Class112_Sub4.anInt8645 = 0;
        ha_Sub2.anInt5691 = 0;
        Node_Sub23.anInt7097 = 0;
        ha_Sub3.anInt6049 = 0;
        RSInterface2.anInt4281 = 0;
        Class133.anInt5036 = 0;
        Node_Sub14_Sub18.anInt9350 = 0;
        r_Sub2.anInt10279 = 0;
        Class48.anInt631 = 0;
        Class79.anInt1005 = 0;
        Class96.anInt1244 = 0;
        ByteStream.anInt6941 = 0;
        Node_Sub14_Sub12_Sub1.anInt10309 = 0;
        Class64.anInt863 = 0;
        Class70.anInt932 = 0;
        Class238_Sub1.anInt6693 = 0;
        Node_Sub8_Sub18.anInt9074 = 0;
        Class182.anInt2132 = 0;
        Node_Sub11_Sub1.anInt9132 = 0;
        ha_Sub3_Sub1.anInt8715 = 0;
        Node_Sub8_Sub20.anInt9097 = 0;
        ha_Sub3.anInt5959 = 0;
        Class181.anInt2097 = 0;
        Class348.anInt4163 = 0;
        Class282_Sub8.anInt7668 = 0;
        Class136_Sub2.anInt8391 = 0;
        ha_Sub3.anInt6006 = 0;
        Class316.anInt3664 = 0;
        Class140.anInt1667 = 0;
        ha_Sub2.anInt5787 = 0;
        Class8.anInt173 = 0;
        Class168.anInt1964 = 0;
        RSInterface2.anInt4303 = 0;
        Class282_Sub13.anInt7720 = 0;
        Class129_Sub1.anInt8514 = 0;
        Applet_Sub1.anInt30 = 0;
        client.anInt5230 = 0;
        Node_Sub33.anInt7206 = 0;
        s_Sub3.anInt7987 = 0;
        Node_Sub14_Sub7.anInt9217 = 0;
        Class282_Sub19.anInt7794 = 0;
        Class282_Sub22.anInt7821 = 0;
        Class282_Sub28.anInt7892 = 0;
        Node_Sub8_Sub13_Sub1.anInt10246 = 0;
        ByteStream.anInt6895 = 0;
        Class238_Sub3.anInt6789 = 0;
        ha_Sub2.anInt5654 = 0;
        Class381.anInt4695 = 0;
        Class340_Sub8.anInt8197 = 0;
        Node_Sub14_Sub8.anInt9226 = 0;
        Class61.anInt835 = 0;
        ha_Sub2.anInt5657 = 0;
        Class143.anInt1679 = 0;
        Class346_Sub10.anInt8350 = 0;
        Class50.anInt667 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10202 = 0;
        Class307.anInt3565 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10122 = 0;
        Class305.anInt3546 = 0;
        ha_Sub2.anInt5705 = 0;
        Class358.anInt4420 = 0;
        ByteStream.anInt6887 = 0;
        Node_Sub14_Sub35.anInt9536 = 0;
        Node_Sub45.anInt7364 = 0;
        Class349_Sub2.anInt4720 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10392 = 0;
        Node_Sub2_Sub3.anInt8852 = 0;
        Class84_Sub8.anInt5476 = 0;
        Class253_Sub1.anInt7493 = 0;
        Node_Sub1.anInt6817 = 0;
        ha_Sub3.anInt6133 = 0;
        Node_Sub15_Sub1.anInt9632 = 0;
        Entity.anInt10432 = 0;
        Class257.anInt2938 = 0;
        Class89.anInt1089 = 0;
        Node_Sub11.anInt6950 = 0;
        Class372.anInt4571 = 0;
        NPC.anInt10596 = 0;
        Node_Sub14_Sub35.anInt9534 = 0;
        Class282_Sub11.anInt7697 = 0;
        Node_Sub11_Sub1.anInt9151 = 0;
        Class155.anInt1838 = 0;
        Class282_Sub15.anInt7749 = 0;
        Class340_Sub9.anInt8201 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10021 = 0;
        s_Sub3.anInt8007 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10126 = 0;
        ISAACCypher.anInt2198 = 0;
        Class282_Sub29.anInt7905 = 0;
        Class340_Sub8.anInt8183 = 0;
        Class84_Sub1.anInt5375 = 0;
        Class151.anInt1795 = 0;
        Class382.anInt4703 = 0;
        Class245.anInt2748 = 0;
        Class150.anInt1788 = 0;
        Class347.anInt4141 = 0;
        Node_Sub25.anInt5163 = 0;
        Class291.anInt4747 = 0;
        Class357.anInt4407 = 0;
        Class346_Sub6.anInt8287 = 0;
        Class45.anInt571 = 0;
        Class218.anInt2504 = 0;
        Node_Sub8_Sub20.anInt9098 = 0;
        Class275_Sub1.anInt8580 = 0;
        Applet_Sub1.anInt12 = 0;
        Class282_Sub16.anInt7759 = 0;
        Node_Sub14_Sub27.anInt9443 = 0;
        Class112.anInt5210 = 0;
        Class136_Sub4.anInt8414 = 0;
        Class275_Sub2.anInt8605 = 0;
        Class77.anInt991 = 0;
        Class330.anInt3853 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10090 = 0;
        ha_Sub2.anInt5739 = 0;
        Node_Sub40_Sub1.anInt9772 = 0;
        anInt6346 = 0;
        Class340_Sub5.anInt8127 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10159 = 0;
        Class355.anInt4379 = 0;
        Class370.anInt4548 = 0;
        Class84_Sub9.anInt5490 = 0;
        Class238_Sub2.anInt6743 = 0;
        Class253_Sub1.anInt7498 = 0;
        Class342.anInt3998 = 0;
        Class70.anInt935 = 0;
        Class345.anInt4101 = 0;
        Class282_Sub9.anInt7679 = 0;
        ha_Sub2.anInt5627 = 0;
        Class342.anInt3987 = 0;
        s_Sub2.anInt7943 = 0;
        Class282_Sub13.anInt7718 = 0;
        Class330_Sub1.anInt8063 = 0;
        Class147_Sub1.anInt6282 = 0;
        ha_Sub2.anInt5725 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10052 = 0;
        Class208.anInt2406 = 0;
        Class34.anInt395 = 0;
        Class110.anInt1381 = 0;
        Class245.anInt2754 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10103 = 0;
        Class230.anInt2603 = 0;
        Node_Sub15_Sub5.anInt9708 = 0;
        Node_Sub14_Sub20.anInt9369 = 0;
        Player.anInt10551 = 0;
        ha_Sub2.anInt5618 = 0;
        anInt6410 = 0;
        Class242.anInt2694 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10192 = 0;
        Class282_Sub14.anInt7735 = 0;
        Class51.anInt694 = 0;
        Class381.anInt4655 = 0;
        Class282_Sub18.anInt7779 = 0;
        Class66.anInt5025 = 0;
        Class41.anInt465 = 0;
        Class381.anInt4656 = 0;
        ha_Sub2.anInt5783 = 0;
        s_Sub3.anInt8027 = 0;
        NPC.anInt10597 = 0;
        Class373.anInt4589 = 0;
        ha_Sub2.anInt5591 = 0;
        Class323.anInt3802 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10228 = 0;
        ha_Sub3_Sub1.anInt8724 = 0;
        Class316_Sub1_Sub1.anInt9846 = 0;
        Class238_Sub2.anInt6742 = 0;
        Class162_Sub2.anInt6511 = 0;
        ha_Sub3.anInt6118 = 0;
        Node_Sub15_Sub5.anInt9718 = 0;
        ha_Sub3_Sub1.anInt8708 = 0;
        ha_Sub3.anInt5990 = 0;
        Class351.anInt4730 = 0;
        Class136_Sub2.anInt8390 = 0;
        Class254.anInt5122 = 0;
        Class52.anInt703 = 0;
        Node.anInt2800 = 0;
        Class111_Sub1.anInt5521 = 0;
        Class273.anInt5003 = 0;
        Class148.anInt5084 = 0;
        ha_Sub2.anInt5608 = 0;
        Class238_Sub3.anInt6787 = 0;
        Class282_Sub4.anInt7630 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10095 = 0;
        Node_Sub2_Sub1.anInt8824 = 0;
        Class58.anInt5076 = 0;
        Class253_Sub1.anInt7506 = 0;
        Class225_Sub1_Sub1.anInt9981 = 0;
        Node_Sub14_Sub1.anInt9164 = 0;
        Node_Sub8_Sub10.anInt8973 = 0;
        Class47.anInt609 = 0;
        anInt6381 = 0;
        Class269_Sub2.anInt7544 = 0;
        Node_Sub14_Sub39.anInt9587 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10039 = 0;
        Node_Sub14.anInt6978 = 0;
        Class257.anInt2939 = 0;
        Class381.anInt4674 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10063 = 0;
        Class129_Sub1.anInt8502 = 0;
        Class229.anInt2596 = 0;
        Class11.anInt244 = 0;
        Class219.anInt2524 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10105 = 0;
        Class195.anInt2230 = 0;
        ISAACCypher.anInt2202 = 0;
        Class343.anInt4044 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10125 = 0;
        ByteStream.anInt6924 = 0;
        Class360.anInt4445 = 0;
        Node_Sub50.anInt7440 = 0;
        Class65.anInt881 = 0;
        Class136.anInt4783 = 0;
        ha_Sub2.anInt5637 = 0;
        Class148.anInt5099 = 0;
        Node_Sub22.anInt7081 = 0;
        Class282_Sub19.anInt7790 = 0;
        Class347.anInt4142 = 0;
        Class9.anInt195 = 0;
        Class112_Sub1.anInt8626 = 0;
        Class253_Sub1.anInt7497 = 0;
        Class65.anInt879 = 0;
        ha_Sub3.anInt6050 = 0;
        ha_Sub3.anInt5989 = 0;
        IOException_Sub1.anInt83 = 0;
        anInt6311 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10032 = 0;
        Class346_Sub7_Sub3_Sub1.anInt10510 = 0;
        Node_Sub11_Sub1.anInt9145 = 0;
        ha_Sub3.anInt5982 = 0;
        Class227.anInt2554 = 0;
        ha_Sub3.anInt6055 = 0;
        Class344.anInt4084 = 0;
        Class162.anInt1899 = 0;
        Class333.anInt3890 = 0;
        Class110.anInt1386 = 0;
        Class358.anInt4418 = 0;
        Class129_Sub1.anInt8487 = 0;
        Class346_Sub7_Sub2_Sub4.anInt10100 = 0;
        Class332.anInt3882 = 0;
        Class70.anInt925 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10003 = 0;
        Class357.anInt4413 = 0;
        Class282_Sub5.anInt7640 = 0;
        Class330_Sub1.anInt8075 = 0;
        Class162_Sub2.anInt6529 = 0;
        Class109.anInt1379 = 0;
        Node_Sub14_Sub17.anInt9346 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10234 = 0;
        ha_Sub2.anInt5636 = 0;
        Class282_Sub28.anInt7885 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10176 = 0;
        Class16.anInt284 = 0;
        Node_Sub8_Sub4.anInt8365 = 0;
        Class346_Sub7_Sub2_Sub1.anInt10004 = 0;
        Class346_Sub7_Sub1_Sub2.anInt10193 = 0;
        Class150.anInt1766 = 0;
        Node_Sub8_Sub4.anInt8373 = 0;
        client.anInt5227 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10170 = 0;
        Class370.anInt4547 = 0;
        ha_Sub3.anInt5988 = 0;
        Class291.anInt4738 = 0;
        WorldAddress.anInt1187 = 0;
        Class346_Sub7_Sub4_Sub1.anInt10061 = 0;
        Class332.anInt3880 = 0;
        Class48.anInt648 = 0;
        Class279_Sub1_Sub1.anInt9811 = 0;
        Node_Sub15_Sub1.anInt9646 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10031 = 0;
        Class156.anInt1858 = 0;
        Node_Sub14_Sub27.anInt9444 = 0;
        Node_Sub23.anInt7096 = 0;
        Class282_Sub9.anInt7681 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10400 = 0;
        r_Sub1.anInt10259 = 0;
        Node_Sub46.anInt7395 = 0;
        Class129_Sub1.anInt8501 = 0;
        Class297.anInt5013 = 0;
        Class282_Sub28.anInt7884 = 0;
        Class166.anInt1947 = 0;
        Node_Sub14_Sub13.anInt9289 = 0;
        WorldAddress.anInt1190 = 0;
        Class47.anInt626 = 0;
        Class51.anInt675 = 0;
        Class84_Sub1.anInt5378 = 0;
        Node_Sub8_Sub10.anInt8984 = 0;
        ha_Sub2.anInt5655 = 0;
        Class349_Sub1.anInt4786 = 0;
        Class120.anInt1510 = 0;
        Node_Sub14_Sub38.anInt9576 = 0;
        Class126.anInt1555 = 0;
        Class57.anInt788 = 0;
        ObjectDefinition.anInt3108 = 0;
        Class298.anInt3473 = 0;
        Class359.anInt4434 = 0;
        Class130.anInt1587 = 0;
        Class207.anInt2399 = 0;
        Node_Sub14_Sub8.anInt9233 = 0;
        Class136_Sub4.anInt8410 = 0;
        Node_Sub14_Sub19.anInt9358 = 0;
        Class222.anInt2539 = 0;
        Class281.anInt3299 = 0;
        Class84_Sub1.anInt5369 = 0;
        Class282_Sub14.anInt7727 = 0;
        Class38.anInt417 = 0;
        Class259.anInt2962 = 0;
        Class84_Sub5.anInt5424 = 0;
        Class346_Sub7_Sub4_Sub2.anInt10175 = 0;
        Class321.anInt3708 = 0;
        Player.anInt10556 = 0;
        Class96.anInt1241 = 0;
        ha_Sub3_Sub1.anInt8662 = 0;
        Class340_Sub8.anInt8191 = 0;
        Class74.anInt945 = 0;
        Class310.anInt3588 = 0;
        Class381.anInt4676 = 0;
        Class84_Sub8.anInt5481 = 0;
        Class264.anInt2990 = 0;
        Class343.anInt4066 = 0;
        Class82.anInt1020 = 0;
        Node_Sub14_Sub35.anInt9532 = 0;
        Class245.anInt2746 = 0;
        Class221.anInt2530 = 0;
        Class279_Sub2.anInt7575 = 0;
        Node_Sub21.anInt7066 = 0;
        ha_Sub3.anInt6019 = 0;
        Node_Sub14.anInt6983 = 0;
        Class112_Sub4.anInt8644 = 0;
        Class275_Sub2.anInt8610 = 0;
        Class48.anInt642 = 0;
        Node_Sub14.anInt6991 = 0;
        Class238_Sub3.anInt6763 = 0;
        Node_Sub8.anInt6869 = 0;
        ha_Sub3.anInt6089 = 0;
        ha_Sub3_Sub1.anInt8660 = 0;
        Node_Sub2_Sub2.anInt8843 = 0;
        Node_Sub14_Sub21.anInt9377 = 0;
        Class223.anInt5182 = 0;
        Class280.anInt3260 = 0;
        ha_Sub2.anInt5640 = 0;
        Class74.anInt958 = 0;
        Class381.anInt4686 = 0;
        Applet_Sub1.anInt16 = 0;
        Class282_Sub26.anInt7862 = 0;
        Node_Sub23.anInt7089 = 0;
        Class9.anInt190 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10363 = 0;
        Class256.anInt2931 = 0;
        Class275_Sub1.anInt8586 = 0;
        Node_Sub8_Sub7.anInt8955 = 0;
        aa_Sub1.anInt5251 = 0;
        Node_Sub15_Sub1.anInt9609 = 0;
        Class165.anInt4958 = 0;
        Class81.anInt4904 = 0;
        ha_Sub2.anInt5716 = 0;
        Class192.anInt2212 = 0;
        Class346_Sub7_Sub2_Sub3.anInt10399 = 0;
        Class329.anInt3849 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10044 = 0;
        ha_Sub3_Sub1.anInt8703 = 0;
        Class239.anInt2668 = 0;
        ByteStream.anInt6904 = 0;
        Class137.anInt1648 = 0;
        Class382.anInt4698 = 0;
        Node_Sub15_Sub4.anInt9695 = 0;
        Class265.anInt3013 = 0;
        Node_Sub14_Sub15.anInt9312 = 0;
        Class265.anInt3012 = 0;
        ha_Sub2.anInt5732 = 0;
        ha_Sub2.anInt5592 = 0;
        ha_Sub3.anInt6047 = 0;
        Node_Sub15_Sub4.anInt9700 = 0;
        Class47.anInt602 = 0;
        Class164.anInt1938 = 0;
        Class238_Sub1.anInt6684 = 0;
        Class198.anInt2254 = 0;
        Class303.anInt3510 = 0;
        Class136_Sub2.anInt8396 = 0;
        Node_Sub25.anInt5167 = 0;
        Class343.anInt4023 = 0;
        Class72.anInt4879 = 0;
        Node_Sub11_Sub1.anInt9137 = 0;
        Class227.anInt2558 = 0;
        Node_Sub28.anInt7163 = 0;
        Class341.anInt3978 = 0;
        Class263.anInt2983 = 0;
        ha_Sub2.anInt5673 = 0;
        ha_Sub2.anInt5605 = 0;
        Class238_Sub3.anInt6779 = 0;
        Node_Sub13.anInt6970 = 0;
        Class171.anInt1986 = 0;
        Class226_Sub3.anInt6672 = 0;
        Entity.anInt10469 = 0;
        Class340_Sub7.anInt8160 = 0;
        ha_Sub3.anInt6058 = 0;
        ha_Sub3.anInt5984 = 0;
        Class346_Sub7_Sub3.anInt9932 = 0;
        Class378.anInt4634 = 0;
        Node_Sub14_Sub16.anInt9332 = 0;
        Node_Sub8_Sub20.anInt9091 = 0;
        Node_Sub1.anInt6805 = 0;
        Class4.anInt139 = 0;
        Class264.anInt2987 = 0;
        Animable.anInt9917 = 0;
        Node_Sub37.anInt7262 = 0;
        Class352.anInt4178 = 0;
        Class129_Sub1.anInt8505 = 0;
        Class90.anInt1126 = 0;
        anInt6319 = 0;
        Node_Sub14_Sub17.anInt9342 = 0;
        Class116_Sub1.anInt6280 = 0;
        Class207.anInt2392 = 0;
        Class57.anInt789 = 0;
        Class282_Sub25.anInt7857 = 0;
        Node_Sub8_Sub2.anInt8910 = 0;
        Class323.anInt3790 = 0;
        Class115.anInt4951 = 0;
        Class282_Sub19.anInt7789 = 0;
        ha_Sub2.anInt5741 = 0;
        Class375.anInt4607 = 0;
        Class162_Sub2.anInt6448 = 0;
        Class282_Sub12.anInt7707 = 0;
        Class319.anInt3688 = 0;
        ha_Sub3_Sub1.anInt8659 = 0;
        Viewport.anInt2650 = 0;
        Class265.anInt3011 = 0;
        Class297.anInt5015 = 0;
        Class333.anInt3896 = 0;
        Class363.anInt4474 = 0;
        Class142.anInt1670 = 0;
        Class188.anInt2185 = 0;
        Node_Sub15_Sub1.anInt9634 = 0;
        Class26.anInt347 = 0;
        Class349_Sub1.anInt4790 = 0;
        Class346_Sub7_Sub5_Sub1.anInt10045 = 0;
        Class46.anInt580 = 0;
        Class38.anInt418 = 0;
        Class282_Sub15.anInt7738 = 0;
        Class203.anInt2308 = 0;
        Class52.anInt707 = 0;
        Class310.anInt3581 = 0;
        ha_Sub2.anInt5688 = 0;
        Class48.anInt632 = 0;
        Class236.anInt2630 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10149 = 0;
        Class162.anInt1898 = 0;
        Class99.anInt1278 = 0;
        Class61.anInt828 = 0;
        Entity.anInt10453 = 0;
        ha_Sub2.anInt5730 = 0;
        s_Sub3.anInt7989 = 0;
        Class112_Sub4.anInt8643 = 0;
        Node_Sub25.anInt5161 = 0;
        Class340_Sub3.anInt8114 = 0;
        Class315.anInt3652 = 0;
        Class346.anInt4123 = 0;
        Class131.anInt1597 = 0;
        ByteStream.anInt6933 = 0;
        ha_Sub3.anInt5976 = 0;
        Player.anInt10533 = 0;
        Class74.anInt957 = 0;
        Class14.anInt261 = 0;
        Class219.anInt2515 = 0;
        Class282.anInt3318 = 0;
        Class238_Sub2.anInt6709 = 0;
        Class303.anInt3509 = 0;
        Class346_Sub5_Sub1.anInt9881 = 0;
        Class346_Sub7_Sub1_Sub1.anInt10154 = 0;
        Class323.anInt3803 = 0;
        Class346_Sub7_Sub2_Sub2.anInt10340 = 0;
        Class282_Sub4.anInt7623 = 0;
        ObjectDefinition.anInt3030 = 0;
        Class301.anInt4930 = 0;
        Class346_Sub5_Sub2.anInt9892 = 0;
        Node_Sub15_Sub1.anInt9643 = 0;
        Class209.anInt2410 = 0;
        Node_Sub23.anInt7086 = 0;
        anInt6431 = 0;
        Node_Sub8_Sub14.anInt9039 = 0;
        ha_Sub2.anInt5658 = 0;
        NPC.anInt10587 = 0;
        Player.anInt10580 = 0;
        ByteStream.anInt6880 = 0;
        Class359.anInt4428 = 0;
        Class112_Sub1.anInt8618 = 0;
        Class24.anInt328 = 0;
        Class259.anInt2957 = 0;
        Class381.anInt4658 = 0;
        Class11.anInt246 = 0;
        Class269_Sub2.anInt7541 = 0;
        ha_Sub3.anInt6014 = 0;
        ha.anInt1411 = 0;
        Class282_Sub5.anInt7637 = 0;
        Class133.anInt5042 = 0;
        Class46.anInt587 = 0;
        Entity.anInt10455 = 0;
        Class180.anInt2092 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10231 = 0;
        ha_Sub2.anInt5768 = 0;
        Class346_Sub7_Sub5_Sub2.anInt10225 = 0;
        aa.anInt102 = 0;
        Class79.anInt1002 = 0;
        Class344.anInt4078 = 0;
        Class323.anInt3792 = 0;
        Class301_Sub1.anInt8428 = 0;
        Node_Sub14_Sub13.anInt9295 = 0;
        Class249_Sub2.anInt4803 = 0;
        Class346_Sub7_Sub1.anInt9909 = 0;
        Class381.anInt4694 = 0;
        Class59.anInt796 = 0;
        Node_Sub1.anInt6803 = 0;
        Class74.anInt955 = 0;
        Class338.anInt3942 = 0;
        ha_Sub2.anInt5792 = 0;
        Node_Sub8_Sub17.anInt9063 = 0;
        Class130.anInt1590 = 0;
        anInt6411 = 0;
        Class162_Sub2.anInt6495 = 0;
        Node_Sub42.anInt7301 = 0;
        Node_Sub14_Sub1.anInt9153 = 0;
        Class112_Sub1.anInt8629 = 0;
        Node_Sub42.anInt7293 = 0;
        Class340_Sub5.anInt8134 = 0;
        Class148.method1326((byte) 97);
        Class172.aBoolean1997 = true;
        Class340_Sub6.aBoolean8146 = true;
        Node_Sub36.method2591(4270);
        for (int i_554_ = 0; Class225_Sub3.aClass7Array8477.length > i_554_; i_554_++)
            Class225_Sub3.aClass7Array8477[i_554_] = null;
        Class115.aBoolean4952 = false;
        Class48.method366(-107);
        Node_Sub41.anInt7288 = (int) (100.0 * Math.random()) - 50;
        Class346_Sub7_Sub5.anInt9958 = -60 + (int) (Math.random() * 120.0);
        Class86.anInt1066 = (int) (80.0 * Math.random()) - 40;
        Class185.anInt2162 = -55 + (int) (110.0 * Math.random());
        Class252.anInt2843 = -20 + (int) (Math.random() * 30.0);
        Class282_Sub7.aFloat7661 = (float) (0x3fff & (int) (160.0 * Math.random()) - 80);
        Class193.method1658(50);
        for (int i_555_ = 0; i_555_ < 2048; i_555_++)
            Node_Sub32.aPlayerArray7197[i_555_] = null;
        Node_Sub8_Sub16_Sub1.anInt10303 = 0;
        Class28.anInt4892 = 0;
        Class253_Sub1.aClass65_7514.method504(-1);
        Node_Sub14_Sub27.aClass293_9440.method3121(10);
        Class198.aClass293_2259.method3121(10);
        Class20.aClass360_308.method3813(0);
        Class346_Sub7_Sub5.aClass65_9959.method504(-1);
        Class225_Sub2.aClass293_8466 = new Class293();
        IOException_Sub1.aClass293_82 = new Class293();
        Node_Sub43.aClass291_7306.method3098(-12777);
        Node_Sub42.method2619(-58);
        Class1.cameraXMovement = 0;
        Class84_Sub2.cameraMovementY = 0;
        Class340_Sub2.anInt8112 = 0;
        OutputStream_Sub2.anInt91 = 0;
        Class282_Sub6.anInt7653 = 0;
        Class281.cameraZMovement = 0;
        Class84_Sub5.anInt5421 = 0;
        Class301.anInt4931 = 0;
        Class346_Sub5.anInt8283 = 0;
        Class375.anInt4606 = 0;
        for (int i_556_ = 0; ((i_556_ ^ 0xffffffff) > (Class357.anIntArray4417.length ^ 0xffffffff)); i_556_++) {
            if (!Class215.aBooleanArray2477[i_556_])
                Class357.anIntArray4417[i_556_] = -1;
        }
        if (Class179.anInt2084 != -1)
            Class136_Sub2.method1257(120, Class179.anInt2084);
        for (Node_Sub12 class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method510(true); class248_sub12 != null; class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method512(false)) {
            if (!class248_sub12.hasNext((byte) 78)) {
                class248_sub12 = (Node_Sub12) Class109.aClass65_1375.method510(true);
                if (class248_sub12 == null)
                    break;
            }
            Class106.method749(false, false, true, class248_sub12);
        }
        Class179.anInt2084 = -1;
        Class109.aClass65_1375 = new Class65(8);
        Class172.method1559((byte) 40);
        Class282_Sub17.aClass354_7773 = null;
        for (int i_557_ = 0; (i_557_ ^ 0xffffffff) > -9; i_557_++) {
            Node_Sub14_Sub14.aStringArray9304[i_557_] = null;
            Node_Sub8.aBooleanArray6868[i_557_] = false;
            Class346_Sub7_Sub3.anIntArray9943[i_557_] = -1;
        }
        Node_Sub27.method2553((byte) 70);
        Class296.aBoolean3459 = true;
        for (int i_558_ = 0; i_558_ < 100; i_558_++)
            Class359.aBooleanArray4435[i_558_] = true;
        for (int i_559_ = 0; i_559_ < 6; i_559_++)
            Class275_Sub2.aClass187Array8602[i_559_] = new Class187();
        for (int i_560_ = 0; (i_560_ ^ 0xffffffff) > -26; i_560_++) {
            Node_Sub14_Sub16.anIntArray9337[i_560_] = 0;
            r_Sub2.anIntArray10286[i_560_] = 0;
            Class9.anIntArray224[i_560_] = 0;
        }
        Class332.method3400(1);
        Class207.aBoolean2398 = true;
        Class166.aShortArray1948 = Class147.aShortArray1734 = Node_Sub14.aShortArray6985 = Class192.aShortArray2217 = new short[256];
        Node_Sub14_Sub28.aString9457 = Class41.aClass41_492.method301(Class191.anInt4822, (byte) -108);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327.method2952(true));
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, ((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353.method2961(true));
        Class69.anInt910 = 0;
        Class178.method1593((byte) -116);
        Class101.method716((byte) 68);
        ((Class381) Class237.aClass381_2644).anInt4675 = 2;
        Class211.aLong2446 = 0L;
        Node_Sub14_Sub15.aClass248_Sub43_9326 = null;
    }

    final int na() {
        anInt6353++;
        if (!aBoolean6408)
            method1454(40);
        return anInt6307;
    }

    final void I(int i, int[] is, int i_561_, int i_562_, int i_563_, boolean bool, int i_564_, int[] is_565_) {
        anInt6411++;
        int i_566_ = is.length;
        if (i == 0) {
            i_561_ <<= 4;
            i_563_ <<= 4;
            i_562_ <<= 4;
            int i_567_ = 0;
            Class110.anInt1384 = 0;
            ha_Sub3_Sub1.anInt8683 = 0;
            Class297.anInt5009 = 0;
            for (int i_568_ = 0; (i_566_ ^ 0xffffffff) < (i_568_ ^ 0xffffffff); i_568_++) {
                int i_569_ = is[i_568_];
                if (i_569_ < anIntArrayArray6412.length) {
                    int[] is_570_ = anIntArrayArray6412[i_569_];
                    for (int i_571_ = 0; is_570_.length > i_571_; i_571_++) {
                        int i_572_ = is_570_[i_571_];
                        if (aShortArray6417 == null || (aShortArray6417[i_572_] & i_564_) != 0) {
                            Class110.anInt1384 += anIntArray6314[i_572_];
                            ha_Sub3_Sub1.anInt8683 += anIntArray6321[i_572_];
                            Class297.anInt5009 += anIntArray6320[i_572_];
                            i_567_++;
                        }
                    }
                }
            }
            if ((i_567_ ^ 0xffffffff) >= -1) {
                Class297.anInt5009 = i_563_;
                Class110.anInt1384 = i_561_;
                ha_Sub3_Sub1.anInt8683 = i_562_;
            } else {
                Class110.anInt1384 = i_561_ + Class110.anInt1384 / i_567_;
                ha_Sub3_Sub1.anInt8683 = ha_Sub3_Sub1.anInt8683 / i_567_ - -i_562_;
                Class297.anInt5009 = Class297.anInt5009 / i_567_ + i_563_;
                Class282_Sub19.aBoolean7783 = true;
            }
        } else if (i == 1) {
            if (is_565_ != null) {
                int i_573_ = (8192 + i_561_ * is_565_[0] + (is_565_[1] * i_562_ - -(is_565_[2] * i_563_)) >> 1099859086);
                int i_574_ = ((8192 + (i_561_ * is_565_[3] - -(i_562_ * is_565_[4])) - -(is_565_[5] * i_563_)) >> 901008782);
                int i_575_ = (8192 + i_562_ * is_565_[7] + (is_565_[6] * i_561_ - -(i_563_ * is_565_[8])) >> 490033614);
                i_561_ = i_573_;
                i_563_ = i_575_;
                i_562_ = i_574_;
            }
            i_563_ <<= 4;
            i_562_ <<= 4;
            i_561_ <<= 4;
            for (int i_576_ = 0; i_566_ > i_576_; i_576_++) {
                int i_577_ = is[i_576_];
                if ((i_577_ ^ 0xffffffff) > (anIntArrayArray6412.length ^ 0xffffffff)) {
                    int[] is_578_ = anIntArrayArray6412[i_577_];
                    for (int i_579_ = 0; i_579_ < is_578_.length; i_579_++) {
                        int i_580_ = is_578_[i_579_];
                        if (aShortArray6417 == null || ((aShortArray6417[i_580_] & i_564_ ^ 0xffffffff) != -1)) {
                            anIntArray6314[i_580_] += i_561_;
                            anIntArray6321[i_580_] += i_562_;
                            anIntArray6320[i_580_] += i_563_;
                        }
                    }
                }
            }
        } else if (i == 2) {
            if (is_565_ != null) {
                int i_581_ = is_565_[9] << -82917308;
                int i_582_ = is_565_[10] << 834923364;
                int i_583_ = is_565_[11] << -1889285244;
                int i_584_ = is_565_[12] << -1295006876;
                int i_585_ = is_565_[13] << 2126236452;
                int i_586_ = is_565_[14] << -1684903484;
                if (Class282_Sub19.aBoolean7783) {
                    int i_587_ = ((Class297.anInt5009 * is_565_[6] + is_565_[3] * ha_Sub3_Sub1.anInt8683 + (is_565_[0] * Class110.anInt1384 + 8192)) >> 854670094);
                    int i_588_ = ((is_565_[7] * Class297.anInt5009 + ha_Sub3_Sub1.anInt8683 * is_565_[4] + (is_565_[1] * Class110.anInt1384 - -8192)) >> 546242638);
                    i_588_ += i_585_;
                    int i_589_ = ((is_565_[8] * Class297.anInt5009 + is_565_[2] * Class110.anInt1384 - (-(ha_Sub3_Sub1.anInt8683 * is_565_[5]) + -8192)) >> 315643310);
                    i_587_ += i_584_;
                    i_589_ += i_586_;
                    ha_Sub3_Sub1.anInt8683 = i_588_;
                    Class110.anInt1384 = i_587_;
                    Class282_Sub19.aBoolean7783 = false;
                    Class297.anInt5009 = i_589_;
                }
                int[] is_590_ = new int[9];
                int i_591_ = Node_Sub9_Sub1.anIntArray9109[i_561_];
                int i_592_ = Node_Sub9_Sub1.anIntArray9106[i_561_];
                int i_593_ = Node_Sub9_Sub1.anIntArray9109[i_562_];
                int i_594_ = Node_Sub9_Sub1.anIntArray9106[i_562_];
                int i_595_ = Node_Sub9_Sub1.anIntArray9109[i_563_];
                int i_596_ = Node_Sub9_Sub1.anIntArray9106[i_563_];
                int i_597_ = i_592_ * i_595_ + 8192 >> -1943086386;
                int i_598_ = 8192 + i_596_ * i_592_ >> -1580564082;
                is_590_[5] = -i_592_;
                is_590_[3] = i_596_ * i_591_ + 8192 >> -1130657906;
                is_590_[4] = i_595_ * i_591_ + 8192 >> 1627189134;
                is_590_[6] = 8192 + (i_595_ * -i_594_ + i_593_ * i_598_) >> 603632750;
                is_590_[2] = i_594_ * i_591_ - -8192 >> 1965429358;
                is_590_[1] = (i_597_ * i_594_ + (-i_593_ * i_596_ + 8192) >> 2136006382);
                is_590_[8] = i_593_ * i_591_ + 8192 >> -1701331314;
                is_590_[7] = i_596_ * i_594_ - -(i_593_ * i_597_) + 8192 >> 306408110;
                is_590_[0] = (i_595_ * i_593_ + (i_594_ * i_598_ - -8192) >> 1398026734);
                int i_599_ = ((is_590_[0] * -Class110.anInt1384 + -ha_Sub3_Sub1.anInt8683 * is_590_[1] - (-(-Class297.anInt5009 * is_590_[2]) + -8192)) >> 329977454);
                int i_600_ = ((8192 + is_590_[5] * -Class297.anInt5009 + (is_590_[4] * -ha_Sub3_Sub1.anInt8683 + -Class110.anInt1384 * is_590_[3])) >> 1961167022);
                int i_601_ = ((is_590_[8] * -Class297.anInt5009 + (is_590_[7] * -ha_Sub3_Sub1.anInt8683 + is_590_[6] * -Class110.anInt1384 - -8192)) >> -1577117298);
                int i_602_ = i_599_ - -Class110.anInt1384;
                int i_603_ = ha_Sub3_Sub1.anInt8683 + i_600_;
                int i_604_ = Class297.anInt5009 + i_601_;
                int[] is_605_ = new int[9];
                for (int i_606_ = 0; i_606_ < 3; i_606_++) {
                    for (int i_607_ = 0; i_607_ < 3; i_607_++) {
                        int i_608_ = 0;
                        for (int i_609_ = 0; (i_609_ ^ 0xffffffff) > -4; i_609_++)
                            i_608_ += (is_590_[i_609_ + i_606_ * 3] * is_565_[i_609_ + i_607_ * 3]);
                        is_605_[i_607_ + i_606_ * 3] = i_608_ + 8192 >> 1428555342;
                    }
                }
                int i_610_ = (i_586_ * is_590_[2] + (is_590_[0] * i_584_ - -(i_585_ * is_590_[1]) + 8192) >> 939433518);
                int i_611_ = ((is_590_[5] * i_586_ + is_590_[4] * i_585_ + i_584_ * is_590_[3] - -8192) >> -1687235154);
                i_610_ += i_602_;
                int i_612_ = (i_585_ * is_590_[7] + (is_590_[6] * i_584_ - -(i_586_ * is_590_[8])) + 8192 >> -199295826);
                i_611_ += i_603_;
                i_612_ += i_604_;
                int[] is_613_ = new int[9];
                for (int i_614_ = 0; (i_614_ ^ 0xffffffff) > -4; i_614_++) {
                    for (int i_615_ = 0; (i_615_ ^ 0xffffffff) > -4; i_615_++) {
                        int i_616_ = 0;
                        for (int i_617_ = 0; i_617_ < 3; i_617_++)
                            i_616_ += (is_605_[i_615_ - -(3 * i_617_)] * is_565_[3 * i_614_ - -i_617_]);
                        is_613_[i_615_ + i_614_ * 3] = i_616_ - -8192 >> 1324822670;
                    }
                }
                int i_618_ = (8192 + (i_611_ * is_565_[1] + is_565_[0] * i_610_ + i_612_ * is_565_[2]) >> -839498290);
                int i_619_ = ((i_612_ * is_565_[5] + i_611_ * is_565_[4] + is_565_[3] * i_610_ + 8192) >> -842355282);
                int i_620_ = (8192 + (i_611_ * is_565_[7] + i_610_ * is_565_[6] + i_612_ * is_565_[8]) >> -138494610);
                i_618_ += i_581_;
                i_619_ += i_582_;
                i_620_ += i_583_;
                for (int i_621_ = 0; i_566_ > i_621_; i_621_++) {
                    int i_622_ = is[i_621_];
                    if ((i_622_ ^ 0xffffffff) > (anIntArrayArray6412.length ^ 0xffffffff)) {
                        int[] is_623_ = anIntArrayArray6412[i_622_];
                        for (int i_624_ = 0; ((i_624_ ^ 0xffffffff) > (is_623_.length ^ 0xffffffff)); i_624_++) {
                            int i_625_ = is_623_[i_624_];
                            if (aShortArray6417 == null || (aShortArray6417[i_625_] & i_564_ ^ 0xffffffff) != -1) {
                                int i_626_ = ((8192 + (anIntArray6314[i_625_] * is_613_[0] + (anIntArray6321[i_625_] * is_613_[1])) - -(anIntArray6320[i_625_] * is_613_[2])) >> -860328114);
                                int i_627_ = ((anIntArray6321[i_625_] * is_613_[4] + is_613_[3] * anIntArray6314[i_625_] + (anIntArray6320[i_625_] * is_613_[5] - -8192)) >> 1590113486);
                                i_627_ += i_619_;
                                int i_628_ = ((8192 + is_613_[8] * anIntArray6320[i_625_] + (is_613_[6] * anIntArray6314[i_625_] + (is_613_[7] * anIntArray6321[i_625_]))) >> 1292637006);
                                i_626_ += i_618_;
                                i_628_ += i_620_;
                                anIntArray6314[i_625_] = i_626_;
                                anIntArray6321[i_625_] = i_627_;
                                anIntArray6320[i_625_] = i_628_;
                            }
                        }
                    }
                }
            } else {
                for (int i_629_ = 0; i_629_ < i_566_; i_629_++) {
                    int i_630_ = is[i_629_];
                    if (anIntArrayArray6412.length > i_630_) {
                        int[] is_631_ = anIntArrayArray6412[i_630_];
                        for (int i_632_ = 0; ((i_632_ ^ 0xffffffff) > (is_631_.length ^ 0xffffffff)); i_632_++) {
                            int i_633_ = is_631_[i_632_];
                            if (aShortArray6417 == null || (i_564_ & aShortArray6417[i_633_] ^ 0xffffffff) != -1) {
                                anIntArray6314[i_633_] -= Class110.anInt1384;
                                anIntArray6321[i_633_] -= ha_Sub3_Sub1.anInt8683;
                                anIntArray6320[i_633_] -= Class297.anInt5009;
                                if (i_563_ != 0) {
                                    int i_634_ = (Node_Sub9_Sub1.anIntArray9106[i_563_]);
                                    int i_635_ = (Node_Sub9_Sub1.anIntArray9109[i_563_]);
                                    int i_636_ = ((16383 + i_635_ * anIntArray6314[i_633_] + anIntArray6321[i_633_] * i_634_) >> -660166802);
                                    anIntArray6321[i_633_] = (16383 + (anIntArray6321[i_633_] * i_635_ + -(anIntArray6314[i_633_] * i_634_))) >> -547405682;
                                    anIntArray6314[i_633_] = i_636_;
                                }
                                if (i_561_ != 0) {
                                    int i_637_ = (Node_Sub9_Sub1.anIntArray9106[i_561_]);
                                    int i_638_ = (Node_Sub9_Sub1.anIntArray9109[i_561_]);
                                    int i_639_ = ((-(anIntArray6320[i_633_] * i_637_) + (i_638_ * anIntArray6321[i_633_] - -16383)) >> -131529202);
                                    anIntArray6320[i_633_] = (16383 + (anIntArray6321[i_633_] * i_637_ + (anIntArray6320[i_633_] * i_638_))) >> -75119890;
                                    anIntArray6321[i_633_] = i_639_;
                                }
                                if ((i_562_ ^ 0xffffffff) != -1) {
                                    int i_640_ = (Node_Sub9_Sub1.anIntArray9106[i_562_]);
                                    int i_641_ = (Node_Sub9_Sub1.anIntArray9109[i_562_]);
                                    int i_642_ = ((16383 + anIntArray6314[i_633_] * i_641_ + anIntArray6320[i_633_] * i_640_) >> 433263246);
                                    anIntArray6320[i_633_] = ((16383 + (i_641_ * anIntArray6320[i_633_] - (i_640_ * anIntArray6314[i_633_]))) >> 1610355726);
                                    anIntArray6314[i_633_] = i_642_;
                                }
                                anIntArray6314[i_633_] += Class110.anInt1384;
                                anIntArray6321[i_633_] += ha_Sub3_Sub1.anInt8683;
                                anIntArray6320[i_633_] += Class297.anInt5009;
                            }
                        }
                    }
                }
                if (bool) {
                    for (int i_643_ = 0; (i_566_ ^ 0xffffffff) < (i_643_ ^ 0xffffffff); i_643_++) {
                        int i_644_ = is[i_643_];
                        if ((anIntArrayArray6412.length ^ 0xffffffff) < (i_644_ ^ 0xffffffff)) {
                            int[] is_645_ = anIntArrayArray6412[i_644_];
                            for (int i_646_ = 0; i_646_ < is_645_.length; i_646_++) {
                                int i_647_ = is_645_[i_646_];
                                if (aShortArray6417 == null || (aShortArray6417[i_647_] & i_564_ ^ 0xffffffff) != -1) {
                                    int i_648_ = anIntArray6313[i_647_];
                                    int i_649_ = anIntArray6313[1 + i_647_];
                                    for (int i_650_ = i_648_; i_650_ < i_649_; i_650_++) {
                                        int i_651_ = aShortArray6434[i_650_] + -1;
                                        if ((i_651_ ^ 0xffffffff) == 0)
                                            break;
                                        if ((i_563_ ^ 0xffffffff) != -1) {
                                            int i_652_ = (Node_Sub9_Sub1.anIntArray9106[i_563_]);
                                            int i_653_ = (Node_Sub9_Sub1.anIntArray9109[i_563_]);
                                            int i_654_ = (((aShortArray6401[i_651_] * i_653_) + (aShortArray6340[i_651_] * i_652_) - -16383) >> 1315481582);
                                            aShortArray6340[i_651_] = (short) (((aShortArray6340[i_651_]) * i_653_ + (-((aShortArray6401[i_651_]) * i_652_) - -16383)) >> -1065040690);
                                            aShortArray6401[i_651_] = (short) i_654_;
                                        }
                                        if ((i_561_ ^ 0xffffffff) != -1) {
                                            int i_655_ = (Node_Sub9_Sub1.anIntArray9106[i_561_]);
                                            int i_656_ = (Node_Sub9_Sub1.anIntArray9109[i_561_]);
                                            int i_657_ = ((16383 + (aShortArray6340[i_651_] * i_656_) + -(i_655_ * (aShortArray6369[i_651_]))) >> -721851794);
                                            aShortArray6369[i_651_] = (short) (((aShortArray6340[i_651_]) * i_655_ + ((aShortArray6369[i_651_]) * i_656_) - -16383) >> -1274240114);
                                            aShortArray6340[i_651_] = (short) i_657_;
                                        }
                                        if (i_562_ != 0) {
                                            int i_658_ = (Node_Sub9_Sub1.anIntArray9106[i_562_]);
                                            int i_659_ = (Node_Sub9_Sub1.anIntArray9109[i_562_]);
                                            int i_660_ = ((16383 + (aShortArray6369[i_651_] * i_658_) - -(aShortArray6401[i_651_] * i_659_)) >> 1279537998);
                                            aShortArray6369[i_651_] = (short) ((-((aShortArray6401[i_651_]) * i_658_) + (((aShortArray6369[i_651_]) * i_659_) + 16383)) >> 633681166);
                                            aShortArray6401[i_651_] = (short) i_660_;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method1447(0);
                }
            }
        } else if ((i ^ 0xffffffff) == -4) {
            if (is_565_ != null) {
                int i_661_ = is_565_[9] << 1005076132;
                int i_662_ = is_565_[10] << -2129083420;
                int i_663_ = is_565_[11] << -1603267932;
                int i_664_ = is_565_[12] << 1098631972;
                int i_665_ = is_565_[13] << 610148196;
                int i_666_ = is_565_[14] << 1104935588;
                if (Class282_Sub19.aBoolean7783) {
                    int i_667_ = ((is_565_[6] * Class297.anInt5009 + (ha_Sub3_Sub1.anInt8683 * is_565_[3] + is_565_[0] * Class110.anInt1384) + 8192) >> 1579670126);
                    int i_668_ = ((8192 + is_565_[7] * Class297.anInt5009 + ha_Sub3_Sub1.anInt8683 * is_565_[4] + Class110.anInt1384 * is_565_[1]) >> -15714706);
                    i_668_ += i_665_;
                    int i_669_ = ((Class297.anInt5009 * is_565_[8] + (ha_Sub3_Sub1.anInt8683 * is_565_[5] + Class110.anInt1384 * is_565_[2]) + 8192) >> 1931802446);
                    i_667_ += i_664_;
                    ha_Sub3_Sub1.anInt8683 = i_668_;
                    i_669_ += i_666_;
                    Class110.anInt1384 = i_667_;
                    Class297.anInt5009 = i_669_;
                    Class282_Sub19.aBoolean7783 = false;
                }
                int i_670_ = i_561_ << 2147383151 >> -1477219929;
                int i_671_ = i_562_ << -559985 >> 490376775;
                int i_672_ = i_563_ << -233668497 >> -397467513;
                int i_673_ = 8192 + i_670_ * -Class110.anInt1384 >> -1520918098;
                int i_674_ = i_671_ * -ha_Sub3_Sub1.anInt8683 + 8192 >> 193761678;
                int i_675_ = 8192 + i_672_ * -Class297.anInt5009 >> 61859086;
                int i_676_ = Class110.anInt1384 + i_673_;
                int i_677_ = ha_Sub3_Sub1.anInt8683 + i_674_;
                int i_678_ = i_675_ + Class297.anInt5009;
                int[] is_679_ = new int[9];
                is_679_[0] = is_565_[0] * i_670_ + 8192 >> -1732446642;
                is_679_[2] = 8192 + i_670_ * is_565_[6] >> -1195899250;
                is_679_[1] = 8192 + is_565_[3] * i_670_ >> -959369970;
                is_679_[5] = 8192 + is_565_[7] * i_671_ >> -543419666;
                is_679_[4] = 8192 + is_565_[4] * i_671_ >> -1579024818;
                is_679_[3] = is_565_[1] * i_671_ - -8192 >> 1147223150;
                is_679_[6] = 8192 + i_672_ * is_565_[2] >> -869781042;
                is_679_[7] = 8192 + is_565_[5] * i_672_ >> -1369764914;
                is_679_[8] = 8192 + i_672_ * is_565_[8] >> -1929210546;
                int i_680_ = i_670_ * i_664_ - -8192 >> -1433644402;
                int i_681_ = i_671_ * i_665_ + 8192 >> 1062181358;
                i_681_ += i_677_;
                i_680_ += i_676_;
                int i_682_ = 8192 + i_666_ * i_672_ >> 1769874350;
                i_682_ += i_678_;
                int[] is_683_ = new int[9];
                for (int i_684_ = 0; (i_684_ ^ 0xffffffff) > -4; i_684_++) {
                    for (int i_685_ = 0; i_685_ < 3; i_685_++) {
                        int i_686_ = 0;
                        for (int i_687_ = 0; i_687_ < 3; i_687_++)
                            i_686_ += (is_565_[i_687_ + 3 * i_684_] * is_679_[i_685_ + 3 * i_687_]);
                        is_683_[i_685_ + 3 * i_684_] = i_686_ + 8192 >> -2057418386;
                    }
                }
                int i_688_ = ((8192 + i_680_ * is_565_[0] + i_681_ * is_565_[1] + i_682_ * is_565_[2]) >> 1733489230);
                int i_689_ = ((i_680_ * is_565_[3] + (is_565_[4] * i_681_ + i_682_ * is_565_[5]) + 8192) >> -1919180338);
                i_689_ += i_662_;
                i_688_ += i_661_;
                int i_690_ = ((is_565_[8] * i_682_ + i_680_ * is_565_[6] + i_681_ * is_565_[7] - -8192) >> -578253394);
                i_690_ += i_663_;
                for (int i_691_ = 0; i_691_ < i_566_; i_691_++) {
                    int i_692_ = is[i_691_];
                    if ((anIntArrayArray6412.length ^ 0xffffffff) < (i_692_ ^ 0xffffffff)) {
                        int[] is_693_ = anIntArrayArray6412[i_692_];
                        for (int i_694_ = 0; ((i_694_ ^ 0xffffffff) > (is_693_.length ^ 0xffffffff)); i_694_++) {
                            int i_695_ = is_693_[i_694_];
                            if (aShortArray6417 == null || (aShortArray6417[i_695_] & i_564_) != 0) {
                                int i_696_ = ((8192 + is_683_[1] * anIntArray6321[i_695_] + (is_683_[0] * anIntArray6314[i_695_] - -(anIntArray6320[i_695_] * is_683_[2]))) >> -1105110610);
                                int i_697_ = ((anIntArray6320[i_695_] * is_683_[5] + is_683_[4] * anIntArray6321[i_695_] + (is_683_[3] * anIntArray6314[i_695_] + 8192)) >> -1496768882);
                                i_697_ += i_689_;
                                int i_698_ = ((is_683_[8] * anIntArray6320[i_695_] + (is_683_[6] * anIntArray6314[i_695_] - -(is_683_[7] * anIntArray6321[i_695_]) + 8192)) >> 1108041486);
                                i_696_ += i_688_;
                                anIntArray6314[i_695_] = i_696_;
                                i_698_ += i_690_;
                                anIntArray6321[i_695_] = i_697_;
                                anIntArray6320[i_695_] = i_698_;
                            }
                        }
                    }
                }
            } else {
                for (int i_699_ = 0; i_699_ < i_566_; i_699_++) {
                    int i_700_ = is[i_699_];
                    if (anIntArrayArray6412.length > i_700_) {
                        int[] is_701_ = anIntArrayArray6412[i_700_];
                        for (int i_702_ = 0; ((i_702_ ^ 0xffffffff) > (is_701_.length ^ 0xffffffff)); i_702_++) {
                            int i_703_ = is_701_[i_702_];
                            if (aShortArray6417 == null || (i_564_ & aShortArray6417[i_703_]) != 0) {
                                anIntArray6314[i_703_] -= Class110.anInt1384;
                                anIntArray6321[i_703_] -= ha_Sub3_Sub1.anInt8683;
                                anIntArray6320[i_703_] -= Class297.anInt5009;
                                anIntArray6314[i_703_] = (i_561_ * anIntArray6314[i_703_] >> 1097419079);
                                anIntArray6321[i_703_] = (anIntArray6321[i_703_] * i_562_ >> -597137753);
                                anIntArray6320[i_703_] = (anIntArray6320[i_703_] * i_563_ >> -930346137);
                                anIntArray6314[i_703_] += Class110.anInt1384;
                                anIntArray6321[i_703_] += ha_Sub3_Sub1.anInt8683;
                                anIntArray6320[i_703_] += Class297.anInt5009;
                            }
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -6) {
            if (anIntArrayArray6404 != null) {
                boolean bool_704_ = false;
                for (int i_705_ = 0; i_566_ > i_705_; i_705_++) {
                    int i_706_ = is[i_705_];
                    if ((i_706_ ^ 0xffffffff) > (anIntArrayArray6404.length ^ 0xffffffff)) {
                        int[] is_707_ = anIntArrayArray6404[i_706_];
                        for (int i_708_ = 0; ((is_707_.length ^ 0xffffffff) < (i_708_ ^ 0xffffffff)); i_708_++) {
                            int i_709_ = is_707_[i_708_];
                            if (aShortArray6354 == null || (i_564_ & aShortArray6354[i_709_] ^ 0xffffffff) != -1) {
                                int i_710_ = (i_561_ * 8 + (0xff & aByteArray6384[i_709_]));
                                if ((i_710_ ^ 0xffffffff) > -1)
                                    i_710_ = 0;
                                else if (i_710_ > 255)
                                    i_710_ = 255;
                                aByteArray6384[i_709_] = (byte) i_710_;
                            }
                        }
                        bool_704_ = bool_704_ | (is_707_.length ^ 0xffffffff) < -1;
                    }
                }
                if (bool_704_) {
                    if (aClass132Array6330 != null) {
                        for (int i_711_ = 0; i_711_ < anInt6403; i_711_++) {
                            Class132 class132 = aClass132Array6330[i_711_];
                            Class284 class284 = aClass284Array6361[i_711_];
                            ((Class284) class284).anInt3355 = (0xffffff & ((Class284) class284).anInt3355 | (-(0xff & aByteArray6384[(((Class132) class132).anInt1619)]) + 255 << 2121268312));
                        }
                    }
                    method1448(-5565);
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray6404 != null) {
                boolean bool_712_ = false;
                for (int i_713_ = 0; (i_566_ ^ 0xffffffff) < (i_713_ ^ 0xffffffff); i_713_++) {
                    int i_714_ = is[i_713_];
                    if (i_714_ < anIntArrayArray6404.length) {
                        int[] is_715_ = anIntArrayArray6404[i_714_];
                        for (int i_716_ = 0; ((is_715_.length ^ 0xffffffff) < (i_716_ ^ 0xffffffff)); i_716_++) {
                            int i_717_ = is_715_[i_716_];
                            if (aShortArray6354 == null || (aShortArray6354[i_717_] & i_564_) != 0) {
                                int i_718_ = 0xffff & aShortArray6395[i_717_];
                                int i_719_ = 0x3f & i_718_ >> 2033036778;
                                int i_720_ = 0x7 & i_718_ >> 1603844167;
                                int i_721_ = 0x7f & i_718_;
                                i_719_ = i_561_ + i_719_ & 0x3f;
                                i_720_ += i_562_ / 4;
                                i_721_ += i_563_;
                                if ((i_720_ ^ 0xffffffff) > -1)
                                    i_720_ = 0;
                                else if (i_720_ > 7)
                                    i_720_ = 7;
                                if ((i_721_ ^ 0xffffffff) > -1)
                                    i_721_ = 0;
                                else if ((i_721_ ^ 0xffffffff) < -128)
                                    i_721_ = 127;
                                aShortArray6395[i_717_] = (short) (Class358.retrieveLooksSettings(i_721_, (Class358.retrieveLooksSettings(i_720_ << -273087929, i_719_ << -1610789014))));
                            }
                        }
                        bool_712_ = bool_712_ | (is_715_.length ^ 0xffffffff) < -1;
                    }
                }
                if (bool_712_) {
                    if (aClass132Array6330 != null) {
                        for (int i_722_ = 0; (anInt6403 ^ 0xffffffff) < (i_722_ ^ 0xffffffff); i_722_++) {
                            Class132 class132 = aClass132Array6330[i_722_];
                            Class284 class284 = aClass284Array6361[i_722_];
                            ((Class284) class284).anInt3355 = (~0xffffff & ((Class284) class284).anInt3355 | (0xffffff & (Node_Sub14_Sub39.anIntArray9600[((aShortArray6395[((Class132) class132).anInt1619]) & 0xffff)])));
                        }
                    }
                    method1448(-5565);
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray6409 != null) {
                for (int i_723_ = 0; (i_566_ ^ 0xffffffff) < (i_723_ ^ 0xffffffff); i_723_++) {
                    int i_724_ = is[i_723_];
                    if (i_724_ < anIntArrayArray6409.length) {
                        int[] is_725_ = anIntArrayArray6409[i_724_];
                        for (int i_726_ = 0; ((is_725_.length ^ 0xffffffff) < (i_726_ ^ 0xffffffff)); i_726_++) {
                            Class284 class284 = aClass284Array6361[is_725_[i_726_]];
                            ((Class284) class284).anInt3349 += i_562_;
                            ((Class284) class284).anInt3354 += i_561_;
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -11) {
            if (anIntArrayArray6409 != null) {
                for (int i_727_ = 0; i_727_ < i_566_; i_727_++) {
                    int i_728_ = is[i_727_];
                    if (anIntArrayArray6409.length > i_728_) {
                        int[] is_729_ = anIntArrayArray6409[i_728_];
                        for (int i_730_ = 0; ((i_730_ ^ 0xffffffff) > (is_729_.length ^ 0xffffffff)); i_730_++) {
                            Class284 class284 = aClass284Array6361[is_729_[i_730_]];
                            ((Class284) class284).anInt3351 = (((Class284) class284).anInt3351 * i_561_ >> -450631641);
                            ((Class284) class284).anInt3350 = (((Class284) class284).anInt3350 * i_562_ >> 887624807);
                        }
                    }
                }
            }
        } else if ((i ^ 0xffffffff) == -10 && anIntArrayArray6409 != null) {
            for (int i_731_ = 0; i_566_ > i_731_; i_731_++) {
                int i_732_ = is[i_731_];
                if ((i_732_ ^ 0xffffffff) > (anIntArrayArray6409.length ^ 0xffffffff)) {
                    int[] is_733_ = anIntArrayArray6409[i_732_];
                    for (int i_734_ = 0; (is_733_.length ^ 0xffffffff) < (i_734_ ^ 0xffffffff); i_734_++) {
                        Class284 class284 = aClass284Array6361[is_733_[i_734_]];
                        ((Class284) class284).anInt3352 = (((Class284) class284).anInt3352 - -i_561_ & 0x3fff);
                    }
                }
            }
        }
    }

    private final void method1462(byte i, r_Sub2 var_r_Sub2) {
        anInt6371++;
        if (i == 2) {
            if ((Class161.anIntArray1892.length ^ 0xffffffff) > (anInt6402 ^ 0xffffffff)) {
                Class161.anIntArray1892 = new int[anInt6402];
                Class326.anIntArray4819 = new int[anInt6402];
            }
            for (int i_735_ = 0; i_735_ < anInt6366; i_735_++) {
                int i_736_ = (-((r_Sub2) var_r_Sub2).anInt10287 + (-((((ha_Sub3) aHa_Sub3_6380).anInt6210 * anIntArray6321[i_735_]) >> -430188888) + anIntArray6314[i_735_] >> ((ha_Sub3) aHa_Sub3_6380).anInt6156));
                int i_737_ = (((anIntArray6320[i_735_] - ((((ha_Sub3) aHa_Sub3_6380).anInt6176 * anIntArray6321[i_735_]) >> 1322567560)) >> ((ha_Sub3) aHa_Sub3_6380).anInt6156) + -((r_Sub2) var_r_Sub2).anInt10285);
                int i_738_ = anIntArray6313[i_735_];
                int i_739_ = anIntArray6313[i_735_ + 1];
                for (int i_740_ = i_738_; (i_740_ ^ 0xffffffff) > (i_739_ ^ 0xffffffff); i_740_++) {
                    int i_741_ = aShortArray6434[i_740_] + -1;
                    if ((i_741_ ^ 0xffffffff) == 0)
                        break;
                    Class161.anIntArray1892[i_741_] = i_736_;
                    Class326.anIntArray4819[i_741_] = i_737_;
                }
            }
            for (int i_742_ = 0; (anInt6378 ^ 0xffffffff) < (i_742_ ^ 0xffffffff); i_742_++) {
                if (aByteArray6384 == null || (aByteArray6384[i_742_] ^ 0xffffffff) >= -129) {
                    short i_743_ = aShortArray6386[i_742_];
                    short i_744_ = aShortArray6325[i_742_];
                    short i_745_ = aShortArray6400[i_742_];
                    int i_746_ = Class161.anIntArray1892[i_743_];
                    int i_747_ = Class161.anIntArray1892[i_744_];
                    int i_748_ = Class161.anIntArray1892[i_745_];
                    int i_749_ = Class326.anIntArray4819[i_743_];
                    int i_750_ = Class326.anIntArray4819[i_744_];
                    int i_751_ = Class326.anIntArray4819[i_745_];
                    if ((-((-i_747_ + i_748_) * (i_750_ - i_749_)) + (i_746_ + -i_747_) * (i_750_ - i_751_)) > 0)
                        var_r_Sub2.method2118(i_746_, i_747_, 4, i_750_, i_751_, i_749_, i_748_);
                }
            }
        }
    }

    static final Class339[] method1463(int i) {
        anInt6315++;
        if (i > -81)
            method1455(53);
        return (new Class339[]{s_Sub2.aClass339_7951, Class187.aClass339_2177, RSInterface2.aClass339_4311, Class346_Sub7_Sub1_Sub1.aClass339_10136, Class14.aClass339_266, Class256.aClass339_2930});
    }

    final Class40[] method1431() {
        anInt6319++;
        return aClass40Array6372;
    }

    final void method1425() {
        anInt6363++;
    }

    private final void method1464(int i) {
        anInt6364++;
        if (aClass337_6427 != null)
            ((Class337) aClass337_6427).aBoolean3927 = false;
        int i_752_ = -4 / ((-42 - i) / 35);
    }

    final void P(int i, int i_753_, int i_754_, int i_755_) {
        anInt6316++;
        if ((i ^ 0xffffffff) == -1) {
            Class110.anInt1384 = 0;
            ha_Sub3_Sub1.anInt8683 = 0;
            int i_756_ = 0;
            Class297.anInt5009 = 0;
            for (int i_757_ = 0; (anInt6366 ^ 0xffffffff) < (i_757_ ^ 0xffffffff); i_757_++) {
                Class110.anInt1384 += anIntArray6314[i_757_];
                ha_Sub3_Sub1.anInt8683 += anIntArray6321[i_757_];
                i_756_++;
                Class297.anInt5009 += anIntArray6320[i_757_];
            }
            if ((i_756_ ^ 0xffffffff) < -1) {
                ha_Sub3_Sub1.anInt8683 = i_754_ + ha_Sub3_Sub1.anInt8683 / i_756_;
                Class110.anInt1384 = Class110.anInt1384 / i_756_ - -i_753_;
                Class297.anInt5009 = i_755_ + Class297.anInt5009 / i_756_;
            } else {
                Class297.anInt5009 = i_755_;
                ha_Sub3_Sub1.anInt8683 = i_754_;
                Class110.anInt1384 = i_753_;
            }
        } else if ((i ^ 0xffffffff) == -2) {
            for (int i_758_ = 0; (anInt6366 ^ 0xffffffff) < (i_758_ ^ 0xffffffff); i_758_++) {
                anIntArray6314[i_758_] += i_753_;
                anIntArray6321[i_758_] += i_754_;
                anIntArray6320[i_758_] += i_755_;
            }
        } else if ((i ^ 0xffffffff) == -3) {
            for (int i_759_ = 0; anInt6366 > i_759_; i_759_++) {
                anIntArray6314[i_759_] -= Class110.anInt1384;
                anIntArray6321[i_759_] -= ha_Sub3_Sub1.anInt8683;
                anIntArray6320[i_759_] -= Class297.anInt5009;
                if ((i_755_ ^ 0xffffffff) != -1) {
                    int i_760_ = Node_Sub9_Sub1.anIntArray9106[i_755_];
                    int i_761_ = Node_Sub9_Sub1.anIntArray9109[i_755_];
                    int i_762_ = ((anIntArray6314[i_759_] * i_761_ + (i_760_ * anIntArray6321[i_759_] - -16383)) >> -1431374450);
                    anIntArray6321[i_759_] = ((-(anIntArray6314[i_759_] * i_760_) + (anIntArray6321[i_759_] * i_761_ + 16383)) >> 717235342);
                    anIntArray6314[i_759_] = i_762_;
                }
                if ((i_753_ ^ 0xffffffff) != -1) {
                    int i_763_ = Node_Sub9_Sub1.anIntArray9106[i_753_];
                    int i_764_ = Node_Sub9_Sub1.anIntArray9109[i_753_];
                    int i_765_ = (16383 + (-(i_763_ * anIntArray6320[i_759_]) + i_764_ * anIntArray6321[i_759_]) >> 1238348398);
                    anIntArray6320[i_759_] = (16383 + i_763_ * anIntArray6321[i_759_] + anIntArray6320[i_759_] * i_764_) >> 1573656206;
                    anIntArray6321[i_759_] = i_765_;
                }
                if (i_754_ != 0) {
                    int i_766_ = Node_Sub9_Sub1.anIntArray9106[i_754_];
                    int i_767_ = Node_Sub9_Sub1.anIntArray9109[i_754_];
                    int i_768_ = ((16383 + i_767_ * anIntArray6314[i_759_] + anIntArray6320[i_759_] * i_766_) >> 687390990);
                    anIntArray6320[i_759_] = ((-(anIntArray6314[i_759_] * i_766_) + anIntArray6320[i_759_] * i_767_ + 16383) >> 75137742);
                    anIntArray6314[i_759_] = i_768_;
                }
                anIntArray6314[i_759_] += Class110.anInt1384;
                anIntArray6321[i_759_] += ha_Sub3_Sub1.anInt8683;
                anIntArray6320[i_759_] += Class297.anInt5009;
            }
        } else if (i == 3) {
            for (int i_769_ = 0; (anInt6366 ^ 0xffffffff) < (i_769_ ^ 0xffffffff); i_769_++) {
                anIntArray6314[i_769_] -= Class110.anInt1384;
                anIntArray6321[i_769_] -= ha_Sub3_Sub1.anInt8683;
                anIntArray6320[i_769_] -= Class297.anInt5009;
                anIntArray6314[i_769_] = anIntArray6314[i_769_] * i_753_ / 128;
                anIntArray6321[i_769_] = anIntArray6321[i_769_] * i_754_ / 128;
                anIntArray6320[i_769_] = i_755_ * anIntArray6320[i_769_] / 128;
                anIntArray6314[i_769_] += Class110.anInt1384;
                anIntArray6321[i_769_] += ha_Sub3_Sub1.anInt8683;
                anIntArray6320[i_769_] += Class297.anInt5009;
            }
        } else if ((i ^ 0xffffffff) == -6) {
            for (int i_770_ = 0; anInt6338 > i_770_; i_770_++) {
                int i_771_ = 8 * i_753_ + (aByteArray6384[i_770_] & 0xff);
                if (i_771_ < 0)
                    i_771_ = 0;
                else if (i_771_ > 255)
                    i_771_ = 255;
                aByteArray6384[i_770_] = (byte) i_771_;
            }
            if (aClass132Array6330 != null) {
                for (int i_772_ = 0; (anInt6403 ^ 0xffffffff) < (i_772_ ^ 0xffffffff); i_772_++) {
                    Class132 class132 = aClass132Array6330[i_772_];
                    Class284 class284 = aClass284Array6361[i_772_];
                    ((Class284) class284).anInt3355 = (((Class284) class284).anInt3355 & 0xffffff | (255 + -(0xff & (aByteArray6384[((Class132) class132).anInt1619])) << -1453034600));
                }
            }
            method1448(-5565);
        } else if (i == 7) {
            for (int i_773_ = 0; i_773_ < anInt6338; i_773_++) {
                int i_774_ = 0xffff & aShortArray6395[i_773_];
                int i_775_ = 0x3f & i_774_ >> -1898777462;
                int i_776_ = (0x39a & i_774_) >> -362557145;
                int i_777_ = 0x7f & i_774_;
                i_775_ = i_753_ + i_775_ & 0x3f;
                i_776_ += i_754_ / 4;
                i_777_ += i_755_;
                if ((i_776_ ^ 0xffffffff) <= -1) {
                    if (i_776_ > 7)
                        i_776_ = 7;
                } else
                    i_776_ = 0;
                if ((i_777_ ^ 0xffffffff) > -1)
                    i_777_ = 0;
                else if (i_777_ > 127)
                    i_777_ = 127;
                aShortArray6395[i_773_] = (short) (Class358.retrieveLooksSettings(i_777_, Class358.retrieveLooksSettings(i_775_ << -143872598, i_776_ << -187147737)));
            }
            if (aClass132Array6330 != null) {
                for (int i_778_ = 0; (i_778_ ^ 0xffffffff) > (anInt6403 ^ 0xffffffff); i_778_++) {
                    Class132 class132 = aClass132Array6330[i_778_];
                    Class284 class284 = aClass284Array6361[i_778_];
                    ((Class284) class284).anInt3355 = (((Class284) class284).anInt3355 & ~0xffffff | 0xffffff & (Node_Sub14_Sub39.anIntArray9600[((aShortArray6395[((Class132) class132).anInt1619]) & 0xffff)]));
                }
            }
            method1448(-5565);
        } else if ((i ^ 0xffffffff) == -9) {
            for (int i_779_ = 0; anInt6403 > i_779_; i_779_++) {
                Class284 class284 = aClass284Array6361[i_779_];
                ((Class284) class284).anInt3354 += i_753_;
                ((Class284) class284).anInt3349 += i_754_;
            }
        } else if ((i ^ 0xffffffff) == -11) {
            for (int i_780_ = 0; anInt6403 > i_780_; i_780_++) {
                Class284 class284 = aClass284Array6361[i_780_];
                ((Class284) class284).anInt3350 = i_754_ * ((Class284) class284).anInt3350 >> -47350105;
                ((Class284) class284).anInt3351 = i_753_ * ((Class284) class284).anInt3351 >> -989470361;
            }
        } else if (i == 9) {
            for (int i_781_ = 0; anInt6403 > i_781_; i_781_++) {
                Class284 class284 = aClass284Array6361[i_781_];
                ((Class284) class284).anInt3352 = i_753_ + ((Class284) class284).anInt3352 & 0x3fff;
            }
        }
    }

    final boolean NA() {
        anInt6389++;
        if (anIntArrayArray6412 == null)
            return false;
        for (int i = 0; (anInt6308 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
            anIntArray6314[i] <<= 4;
            anIntArray6321[i] <<= 4;
            anIntArray6320[i] <<= 4;
        }
        ha_Sub3_Sub1.anInt8683 = 0;
        Class297.anInt5009 = 0;
        Class110.anInt1384 = 0;
        return true;
    }

    private final void method1465(byte i) {
        anInt6311++;
        if (aBoolean6317 && i == 1) {
            aBoolean6317 = false;
            if (aClass40Array6372 == null && aClass124Array6385 == null && aClass132Array6330 == null) {
                if (anIntArray6314 != null && !Class265.method2780(anInt6324, anInt6397, (byte) 125)) {
                    if (aClass337_6427 == null || aClass337_6427.method3424(29782)) {
                        if (!aBoolean6408)
                            method1454(26);
                        anIntArray6314 = null;
                    } else
                        aBoolean6317 = true;
                }
                if (anIntArray6321 != null && !Class250.method2710((byte) 11, anInt6324, anInt6397)) {
                    if (aClass337_6427 != null && !aClass337_6427.method3424(29782))
                        aBoolean6317 = true;
                    else {
                        if (!aBoolean6408)
                            method1454(i ^ 0x37);
                        anIntArray6321 = null;
                    }
                }
                if (anIntArray6320 != null && !Class242.method1934(anInt6397, i ^ 0x1, anInt6324)) {
                    if (aClass337_6427 == null || aClass337_6427.method3424(29782)) {
                        if (!aBoolean6408)
                            method1454(4);
                        anIntArray6320 = null;
                    } else
                        aBoolean6317 = true;
                }
            }
            if (aShortArray6434 != null && anIntArray6314 == null && anIntArray6321 == null && anIntArray6320 == null) {
                anIntArray6313 = null;
                aShortArray6434 = null;
            }
            if (aByteArray6341 != null && !Class305.method3212(1, anInt6397, anInt6324)) {
                if (!((anInt6397 & 0x37 ^ 0xffffffff) == -1 ? (aClass337_6373 == null || aClass337_6373.method3424(29782)) : (aClass337_6344 == null || aClass337_6344.method3424(i + 29781))))
                    aBoolean6317 = true;
                else {
                    aShortArray6401 = aShortArray6340 = aShortArray6369 = null;
                    aByteArray6341 = null;
                }
            }
            if (aShortArray6395 != null && !Class375.method3878(i + 24427, anInt6324, anInt6397)) {
                if (aClass337_6373 == null || aClass337_6373.method3424(29782))
                    aShortArray6395 = null;
                else
                    aBoolean6317 = true;
            }
            if (aByteArray6384 != null && !Class192.method1650(262144, anInt6324, anInt6397)) {
                if (aClass337_6373 == null || aClass337_6373.method3424(i + 29781))
                    aByteArray6384 = null;
                else
                    aBoolean6317 = true;
            }
            if (aFloatArray6420 != null && !Class282_Sub29.method3048(anInt6397, anInt6324, (byte) -10)) {
                if (aClass337_6392 == null || aClass337_6392.method3424(29782))
                    aFloatArray6420 = aFloatArray6415 = null;
                else
                    aBoolean6317 = true;
            }
            if (aShortArray6416 != null && !Node_Sub14_Sub27.method2354(-3, anInt6397, anInt6324)) {
                if (aClass337_6373 != null && !aClass337_6373.method3424(29782))
                    aBoolean6317 = true;
                else
                    aShortArray6416 = null;
            }
            if (aShortArray6386 != null && !Class209.method1716(anInt6324, (byte) -104, anInt6397)) {
                if ((aClass95_6375 == null || aClass95_6375.method694(true)) && (aClass337_6373 == null || aClass337_6373.method3424(29782)))
                    aShortArray6386 = aShortArray6325 = aShortArray6400 = null;
                else
                    aBoolean6317 = true;
            }
            if (aShortArray6342 != null) {
                if (aClass337_6427 == null || aClass337_6427.method3424(i + 29781))
                    aShortArray6342 = null;
                else
                    aBoolean6317 = true;
            }
            if (aShortArray6387 != null) {
                if (aClass337_6373 == null || aClass337_6373.method3424(29782))
                    aShortArray6387 = null;
                else
                    aBoolean6317 = true;
            }
            if (anIntArrayArray6404 != null && !Node_Sub2_Sub4.method1999(anInt6397, anInt6324, (byte) 83)) {
                anIntArrayArray6404 = null;
                aShortArray6354 = null;
            }
            if (anIntArrayArray6412 != null && !aa.method152(anInt6397, anInt6324, i ^ 0x5df1)) {
                aShortArray6417 = null;
                anIntArrayArray6412 = null;
            }
            if (anIntArrayArray6409 != null && !Class346_Sub5_Sub2.method3552(anInt6397, (byte) 100, anInt6324))
                anIntArrayArray6409 = null;
            if (anIntArray6318 != null && (0x800 & anInt6324) == 0 && (anInt6324 & 0x40000) == 0) {
                anIntArray6383 = null;
                anIntArray6426 = null;
                anIntArray6318 = null;
            }
        }
    }

    private final boolean method1466(int i) {
        anInt6393++;
        if (((Class95) aClass95_6375).aBoolean1228)
            return true;
        if (i != 8)
            aFloatArray6420 = null;
        if (((Class95) aClass95_6375).anInterface18_Impl2_1227 == null)
            ((Class95) aClass95_6375).anInterface18_Impl2_1227 = aHa_Sub3_6380.method924(-23469, aBoolean6433);
        Interface18_Impl2 interface18_impl2 = ((Class95) aClass95_6375).anInterface18_Impl2_1227;
        interface18_impl2.method48(6 * anInt6378, (byte) 102);
        Buffer buffer = interface18_impl2.method47(i + 30899, true);
        if (buffer != null) {
            Stream stream = aHa_Sub3_6380.method926((byte) -20, buffer);
            if (Stream.b()) {
                for (int i_782_ = 0; anInt6378 > i_782_; i_782_++) {
                    stream.b(aShortArray6386[i_782_]);
                    stream.b(aShortArray6325[i_782_]);
                    stream.b(aShortArray6400[i_782_]);
                }
            } else {
                for (int i_783_ = 0; (i_783_ ^ 0xffffffff) > (anInt6378 ^ 0xffffffff); i_783_++) {
                    stream.d(aShortArray6386[i_783_]);
                    stream.d(aShortArray6325[i_783_]);
                    stream.d(aShortArray6400[i_783_]);
                }
            }
            stream.a();
            if (interface18_impl2.method50(-17694)) {
                aBoolean6317 = true;
                ((Class95) aClass95_6375).anInterface18_Impl2_1232 = interface18_impl2;
                ((Class95) aClass95_6375).aBoolean1228 = true;
                return true;
            }
        }
        return false;
    }

    Class162_Sub1(ha_Sub3 var_ha_Sub3, int i, int i_784_, boolean bool, boolean bool_785_) {
        anInt6338 = 0;
        aBoolean6405 = false;
        anInt6366 = 0;
        aBoolean6408 = false;
        anInt6378 = 0;
        anInt6402 = 0;
        aBoolean6433 = false;
        aBoolean6317 = true;
        anInt6324 = i;
        anInt6397 = i_784_;
        aHa_Sub3_6380 = var_ha_Sub3;
        aBoolean6433 = bool_785_;
        if (bool || ByteStream.method2172(anInt6324, true, anInt6397))
            aClass337_6427 = new Class337(Class52.method412(anInt6324, (byte) -35, anInt6397));
        if (bool || Class249_Sub2.method2703(anInt6397, anInt6324, 0))
            aClass337_6392 = new Class337(Class282_Sub20.method3005(anInt6324, 192, anInt6397));
        if (bool || Class230.method1835(anInt6324, anInt6397, 22926))
            aClass337_6373 = new Class337(Class79.method572(anInt6397, 55, anInt6324));
        if (bool || Class112_Sub2.method800(true, anInt6397, anInt6324))
            aClass337_6344 = new Class337(Class229.method1832(anInt6397, anInt6324, (byte) -122));
        if (bool || Class40.method298(anInt6324, anInt6397, 125))
            aClass95_6375 = new Class95(Node_Sub14_Sub10.method2301(anInt6397, anInt6324, (byte) -74));
    }
}
