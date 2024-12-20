/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class343 {
    int[] anIntArray4021;
    static int anInt4022;
    static int anInt4023;
    short[] aShortArray4024;
    static int anInt4025;
    byte[] aByteArray4026;
    int[] anIntArray4027;
    int anInt4028 = 0;
    int[] anIntArray4029;
    int[] anIntArray4030;
    static Class329 aClass329_4031;
    int[] anIntArray4032;
    byte[] aByteArray4033;
    int[] anIntArray4034;
    static int anInt4035;
    byte aByte4036;
    static int anInt4037;
    short[] aShortArray4038;
    int anInt4039 = 0;
    int[] anIntArray4040;
    int[] anIntArray4041;
    byte[] aByteArray4042;
    static int anInt4043;
    static int anInt4044;
    Class40[] aClass40Array4045;
    short[] aShortArray4046;
    short[] aShortArray4047;
    Class178[] aClass178Array4048;
    short[] aShortArray4049;
    static int anInt4050;
    static int anInt4051;
    static int anInt4052;
    int anInt4053;
    short[] aShortArray4054;
    byte[] aByteArray4055;
    short[] aShortArray4056;
    int[] anIntArray4057;
    int[] anIntArray4058;
    static int[] anIntArray4059 = {2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
    Class124[] aClass124Array4060;
    byte[] aByteArray4061;
    static int anInt4062;
    int anInt4063;
    short[] aShortArray4064;
    static int anInt4065;
    static int anInt4066;
    static int anInt4067;
    static int anInt4068;
    int[] anIntArray4069;
    short[] aShortArray4070;
    static int anInt4071;
    byte[] aByteArray4072;
    short[] aShortArray4073;
    static int anInt4074;
    int anInt4075;
    byte[] aByteArray4076;

    final int method3495(byte i, byte i_0_, byte i_1_, byte i_2_, short i_3_, int i_4_, short i_5_, int i_6_, int i_7_) {
        ((Class343) this).aShortArray4046[((Class343) this).anInt4028] = (short) i_7_;
        anInt4035++;
        if (i != -85)
            method3506(-119);
        ((Class343) this).aShortArray4024[((Class343) this).anInt4028] = (short) i_4_;
        ((Class343) this).aShortArray4073[((Class343) this).anInt4028] = (short) i_6_;
        ((Class343) this).aByteArray4076[((Class343) this).anInt4028] = i_2_;
        ((Class343) this).aByteArray4026[((Class343) this).anInt4028] = i_0_;
        ((Class343) this).aShortArray4054[((Class343) this).anInt4028] = i_5_;
        ((Class343) this).aByteArray4061[((Class343) this).anInt4028] = i_1_;
        ((Class343) this).aShortArray4056[((Class343) this).anInt4028] = i_3_;
        return ((Class343) this).anInt4028++;
    }

    final void method3496(int i, int i_8_, int i_9_, int i_10_) {
        anInt4067++;
        for (int i_11_ = i_9_; (((Class343) this).anInt4063 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
            ((Class343) this).anIntArray4027[i_11_] += i;
            ((Class343) this).anIntArray4069[i_11_] += i_8_;
            ((Class343) this).anIntArray4040[i_11_] += i_10_;
        }
    }

    final void method3497(byte i, int i_12_) {
        anInt4071++;
        for (int i_13_ = 0; (((Class343) this).anInt4063 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
            ((Class343) this).anIntArray4027[i_13_] <<= i_12_;
            ((Class343) this).anIntArray4069[i_13_] <<= i_12_;
            ((Class343) this).anIntArray4040[i_13_] <<= i_12_;
        }
        if (i != 1)
            method3509((short) 17, (byte) -71, (short) -116);
        if (((Class343) this).anInt4039 > 0 && ((Class343) this).anIntArray4058 != null) {
            for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (((Class343) this).anIntArray4058.length ^ 0xffffffff)); i_14_++) {
                ((Class343) this).anIntArray4058[i_14_] <<= i_12_;
                ((Class343) this).anIntArray4029[i_14_] <<= i_12_;
                if ((((Class343) this).aByteArray4033[i_14_] ^ 0xffffffff) != -2)
                    ((Class343) this).anIntArray4021[i_14_] <<= i_12_;
            }
        }
    }

    static final boolean method3498(byte i, int i_15_, int i_16_, int i_17_, Class38 class38, int i_18_, int i_19_) {
        anInt4068++;
        if (!Class346.aBoolean4120 || !WorldAddress.aBoolean1189)
            return false;
        if ((Class346_Sub7_Sub4_Sub2.anInt10163 ^ 0xffffffff) > -101)
            return false;
        int i_20_ = 27 % ((-24 - i) / 61);
        if (i_17_ == i_15_ && i_19_ == i_18_) {
            if (!Class249.method2696((byte) -112, i_16_, i_15_, i_19_))
                return false;
            if (Class226_Sub3.method1817(class38, -3)) {
                Class69.anInt915++;
                return true;
            }
            return false;
        }
        for (int i_21_ = i_15_; (i_17_ ^ 0xffffffff) <= (i_21_ ^ 0xffffffff); i_21_++) {
            for (int i_22_ = i_19_; i_18_ >= i_22_; i_22_++) {
                if ((-za.anInt7490 ^ 0xffffffff) == ((Node_Sub14_Sub27.anIntArrayArrayArray9451[i_16_][i_21_][i_22_]) ^ 0xffffffff))
                    return false;
            }
        }
        if (!Class226_Sub3.method1817(class38, -3))
            return false;
        Class69.anInt915++;
        return true;
    }

    final int method3499(int i, int i_23_, int i_24_, int i_25_) {
        anInt4023++;
        for (int i_26_ = 0; ((Class343) this).anInt4063 > i_26_; i_26_++) {
            if (((((Class343) this).anIntArray4027[i_26_] ^ 0xffffffff) == (i_23_ ^ 0xffffffff)) && ((i_25_ ^ 0xffffffff) == (((Class343) this).anIntArray4069[i_26_] ^ 0xffffffff)) && ((i_24_ ^ 0xffffffff) == (((Class343) this).anIntArray4040[i_26_] ^ 0xffffffff)))
                return i_26_;
        }
        ((Class343) this).anIntArray4027[((Class343) this).anInt4063] = i_23_;
        ((Class343) this).anIntArray4069[((Class343) this).anInt4063] = i_25_;
        ((Class343) this).anIntArray4040[((Class343) this).anInt4063] = i_24_;
        ((Class343) this).anInt4075 = i + ((Class343) this).anInt4063;
        return ((Class343) this).anInt4063++;
    }

    static final void method3500(int i, String string, int i_27_, int i_28_, boolean bool) {
        anInt4062++;
        if (i == 255)
            za.method2687(i_28_, i_27_, null, 108, string, false, bool);
    }

    private final void method3501(boolean bool, byte[] is) {
        anInt4037++;
        boolean bool_29_ = bool;
        boolean bool_30_ = false;
        ByteStream class248_sub9 = new ByteStream(is);
        ByteStream class248_sub9_31_ = new ByteStream(is);
        ByteStream class248_sub9_32_ = new ByteStream(is);
        ByteStream class248_sub9_33_ = new ByteStream(is);
        ByteStream class248_sub9_34_ = new ByteStream(is);
        ((ByteStream) class248_sub9).offset = is.length + -18;
        ((Class343) this).anInt4063 = class248_sub9.readShort(-1);
        ((Class343) this).anInt4028 = class248_sub9.readShort(-1);
        ((Class343) this).anInt4039 = class248_sub9.readUnsignedByte((byte) 115);
        int i = class248_sub9.readUnsignedByte((byte) -23);
        int i_35_ = class248_sub9.readUnsignedByte((byte) 98);
        int i_36_ = class248_sub9.readUnsignedByte((byte) 82);
        int i_37_ = class248_sub9.readUnsignedByte((byte) 80);
        int i_38_ = class248_sub9.readUnsignedByte((byte) -30);
        int i_39_ = class248_sub9.readShort(-1);
        int i_40_ = class248_sub9.readShort(-1);
        int i_41_ = class248_sub9.readShort(-1);
        int i_42_ = class248_sub9.readShort(-1);
        int i_43_ = 0;
        int i_44_ = i_43_;
        i_43_ += ((Class343) this).anInt4063;
        int i_45_ = i_43_;
        i_43_ += ((Class343) this).anInt4028;
        int i_46_ = i_43_;
        if (i_35_ == 255)
            i_43_ += ((Class343) this).anInt4028;
        int i_47_ = i_43_;
        if ((i_37_ ^ 0xffffffff) == -2)
            i_43_ += ((Class343) this).anInt4028;
        int i_48_ = i_43_;
        if (i == 1)
            i_43_ += ((Class343) this).anInt4028;
        int i_49_ = i_43_;
        if ((i_38_ ^ 0xffffffff) == -2)
            i_43_ += ((Class343) this).anInt4063;
        int i_50_ = i_43_;
        if ((i_36_ ^ 0xffffffff) == -2)
            i_43_ += ((Class343) this).anInt4028;
        int i_51_ = i_43_;
        i_43_ += i_42_;
        int i_52_ = i_43_;
        i_43_ += ((Class343) this).anInt4028 * 2;
        int i_53_ = i_43_;
        i_43_ += ((Class343) this).anInt4039 * 6;
        int i_54_ = i_43_;
        i_43_ += i_39_;
        int i_55_ = i_43_;
        i_43_ += i_40_;
        int i_56_ = i_43_;
        ((ByteStream) class248_sub9).offset = i_44_;
        if (((Class343) this).anInt4039 > 0) {
            ((Class343) this).aByteArray4033 = new byte[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4070 = new short[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4049 = new short[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4047 = new short[((Class343) this).anInt4039];
        }
        if ((i ^ 0xffffffff) == -2) {
            ((Class343) this).aByteArray4076 = new byte[((Class343) this).anInt4028];
            ((Class343) this).aByteArray4026 = new byte[((Class343) this).anInt4028];
            ((Class343) this).aShortArray4056 = new short[((Class343) this).anInt4028];
        }
        if ((i_38_ ^ 0xffffffff) == -2)
            ((Class343) this).anIntArray4057 = new int[((Class343) this).anInt4063];
        i_43_ += i_41_;
        ((Class343) this).anIntArray4040 = new int[((Class343) this).anInt4063];
        ((Class343) this).aShortArray4046 = new short[((Class343) this).anInt4028];
        ((Class343) this).aShortArray4073 = new short[((Class343) this).anInt4028];
        ((Class343) this).aShortArray4024 = new short[((Class343) this).anInt4028];
        ((Class343) this).anIntArray4069 = new int[((Class343) this).anInt4063];
        if (i_37_ == 1)
            ((Class343) this).anIntArray4030 = new int[((Class343) this).anInt4028];
        if ((i_36_ ^ 0xffffffff) == -2)
            ((Class343) this).aByteArray4061 = new byte[((Class343) this).anInt4028];
        ((Class343) this).aShortArray4054 = new short[((Class343) this).anInt4028];
        if ((i_35_ ^ 0xffffffff) == -256)
            ((Class343) this).aByteArray4072 = new byte[((Class343) this).anInt4028];
        else
            ((Class343) this).aByte4036 = (byte) i_35_;
        ((Class343) this).anIntArray4027 = new int[((Class343) this).anInt4063];
        ((ByteStream) class248_sub9_31_).offset = i_54_;
        ((ByteStream) class248_sub9_32_).offset = i_55_;
        ((ByteStream) class248_sub9_33_).offset = i_56_;
        ((ByteStream) class248_sub9_34_).offset = i_49_;
        int i_57_ = 0;
        int i_58_ = 0;
        int i_59_ = 0;
        for (int i_60_ = 0; i_60_ < ((Class343) this).anInt4063; i_60_++) {
            int i_61_ = class248_sub9.readUnsignedByte((byte) 77);
            int i_62_ = 0;
            if ((i_61_ & 0x1 ^ 0xffffffff) != -1)
                i_62_ = class248_sub9_31_.method2210((byte) 114);
            int i_63_ = 0;
            if ((0x2 & i_61_) != 0)
                i_63_ = class248_sub9_32_.method2210((byte) -69);
            int i_64_ = 0;
            if ((0x4 & i_61_ ^ 0xffffffff) != -1)
                i_64_ = class248_sub9_33_.method2210((byte) 115);
            ((Class343) this).anIntArray4027[i_60_] = i_57_ + i_62_;
            ((Class343) this).anIntArray4069[i_60_] = i_58_ + i_63_;
            ((Class343) this).anIntArray4040[i_60_] = i_64_ + i_59_;
            i_58_ = ((Class343) this).anIntArray4069[i_60_];
            i_57_ = ((Class343) this).anIntArray4027[i_60_];
            i_59_ = ((Class343) this).anIntArray4040[i_60_];
            if ((i_38_ ^ 0xffffffff) == -2)
                ((Class343) this).anIntArray4057[i_60_] = class248_sub9_34_.readUnsignedByte((byte) -40);
        }
        ((ByteStream) class248_sub9).offset = i_52_;
        ((ByteStream) class248_sub9_31_).offset = i_48_;
        ((ByteStream) class248_sub9_32_).offset = i_46_;
        ((ByteStream) class248_sub9_33_).offset = i_50_;
        ((ByteStream) class248_sub9_34_).offset = i_47_;
        for (int i_65_ = 0; (((Class343) this).anInt4028 ^ 0xffffffff) < (i_65_ ^ 0xffffffff); i_65_++) {
            ((Class343) this).aShortArray4054[i_65_] = (short) class248_sub9.readShort(-1);
            if ((i ^ 0xffffffff) == -2) {
                int i_66_ = class248_sub9_31_.readUnsignedByte((byte) -34);
                if ((i_66_ & 0x1) != 1)
                    ((Class343) this).aByteArray4076[i_65_] = (byte) 0;
                else {
                    ((Class343) this).aByteArray4076[i_65_] = (byte) 1;
                    bool_29_ = true;
                }
                if ((0x2 & i_66_ ^ 0xffffffff) != -3) {
                    ((Class343) this).aByteArray4026[i_65_] = (byte) -1;
                    ((Class343) this).aShortArray4056[i_65_] = (short) -1;
                } else {
                    ((Class343) this).aByteArray4026[i_65_] = (byte) (i_66_ >> 164220322);
                    ((Class343) this).aShortArray4056[i_65_] = ((Class343) this).aShortArray4054[i_65_];
                    ((Class343) this).aShortArray4054[i_65_] = (short) 127;
                    if ((((Class343) this).aShortArray4056[i_65_] ^ 0xffffffff) != 0)
                        bool_30_ = true;
                }
            }
            if ((i_35_ ^ 0xffffffff) == -256)
                ((Class343) this).aByteArray4072[i_65_] = class248_sub9_32_.readByte(73);
            if ((i_36_ ^ 0xffffffff) == -2)
                ((Class343) this).aByteArray4061[i_65_] = class248_sub9_33_.readByte(116);
            if ((i_37_ ^ 0xffffffff) == -2)
                ((Class343) this).anIntArray4030[i_65_] = class248_sub9_34_.readUnsignedByte((byte) -106);
        }
        ((ByteStream) class248_sub9).offset = i_51_;
        ((Class343) this).anInt4075 = -1;
        ((ByteStream) class248_sub9_31_).offset = i_45_;
        short i_67_ = 0;
        short i_68_ = 0;
        short i_69_ = 0;
        int i_70_ = 0;
        for (int i_71_ = 0; (((Class343) this).anInt4028 ^ 0xffffffff) < (i_71_ ^ 0xffffffff); i_71_++) {
            int i_72_ = class248_sub9_31_.readUnsignedByte((byte) -18);
            if (i_72_ == 1) {
                i_67_ = (short) (i_70_ + class248_sub9.method2210((byte) 112));
                i_70_ = i_67_;
                i_68_ = (short) (i_70_ + class248_sub9.method2210((byte) 103));
                i_70_ = i_68_;
                i_69_ = (short) (i_70_ + class248_sub9.method2210((byte) -126));
                ((Class343) this).aShortArray4046[i_71_] = i_67_;
                i_70_ = i_69_;
                ((Class343) this).aShortArray4024[i_71_] = i_68_;
                ((Class343) this).aShortArray4073[i_71_] = i_69_;
                if ((((Class343) this).anInt4075 ^ 0xffffffff) > (i_67_ ^ 0xffffffff))
                    ((Class343) this).anInt4075 = i_67_;
                if (i_68_ > ((Class343) this).anInt4075)
                    ((Class343) this).anInt4075 = i_68_;
                if (i_69_ > ((Class343) this).anInt4075)
                    ((Class343) this).anInt4075 = i_69_;
            }
            if ((i_72_ ^ 0xffffffff) == -3) {
                i_68_ = i_69_;
                i_69_ = (short) (class248_sub9.method2210((byte) -108) + i_70_);
                ((Class343) this).aShortArray4046[i_71_] = i_67_;
                i_70_ = i_69_;
                ((Class343) this).aShortArray4024[i_71_] = i_68_;
                ((Class343) this).aShortArray4073[i_71_] = i_69_;
                if (i_69_ > ((Class343) this).anInt4075)
                    ((Class343) this).anInt4075 = i_69_;
            }
            if ((i_72_ ^ 0xffffffff) == -4) {
                i_67_ = i_69_;
                i_69_ = (short) (class248_sub9.method2210((byte) -88) + i_70_);
                i_70_ = i_69_;
                ((Class343) this).aShortArray4046[i_71_] = i_67_;
                ((Class343) this).aShortArray4024[i_71_] = i_68_;
                ((Class343) this).aShortArray4073[i_71_] = i_69_;
                if ((i_69_ ^ 0xffffffff) < (((Class343) this).anInt4075 ^ 0xffffffff))
                    ((Class343) this).anInt4075 = i_69_;
            }
            if ((i_72_ ^ 0xffffffff) == -5) {
                short i_73_ = i_67_;
                i_67_ = i_68_;
                i_68_ = i_73_;
                i_69_ = (short) (i_70_ + class248_sub9.method2210((byte) -42));
                ((Class343) this).aShortArray4046[i_71_] = i_67_;
                i_70_ = i_69_;
                ((Class343) this).aShortArray4024[i_71_] = i_68_;
                ((Class343) this).aShortArray4073[i_71_] = i_69_;
                if (((Class343) this).anInt4075 < i_69_)
                    ((Class343) this).anInt4075 = i_69_;
            }
        }
        ((ByteStream) class248_sub9).offset = i_53_;
        ((Class343) this).anInt4075++;
        for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > (((Class343) this).anInt4039 ^ 0xffffffff); i_74_++) {
            ((Class343) this).aByteArray4033[i_74_] = (byte) 0;
            ((Class343) this).aShortArray4047[i_74_] = (short) class248_sub9.readShort(-1);
            ((Class343) this).aShortArray4049[i_74_] = (short) class248_sub9.readShort(-1);
            ((Class343) this).aShortArray4070[i_74_] = (short) class248_sub9.readShort(-1);
        }
        if (((Class343) this).aByteArray4026 != null) {
            boolean bool_75_ = false;
            for (int i_76_ = 0; ((i_76_ ^ 0xffffffff) > (((Class343) this).anInt4028 ^ 0xffffffff)); i_76_++) {
                int i_77_ = ((Class343) this).aByteArray4026[i_76_] & 0xff;
                if ((i_77_ ^ 0xffffffff) != -256) {
                    if (((((Class343) this).aShortArray4046[i_76_] ^ 0xffffffff) == (((Class343) this).aShortArray4047[i_77_] & 0xffff ^ 0xffffffff)) && ((((Class343) this).aShortArray4049[i_77_] & 0xffff) == ((Class343) this).aShortArray4024[i_76_]) && ((((Class343) this).aShortArray4073[i_76_] ^ 0xffffffff) == ((0xffff & ((Class343) this).aShortArray4070[i_77_]) ^ 0xffffffff)))
                        ((Class343) this).aByteArray4026[i_76_] = (byte) -1;
                    else
                        bool_75_ = true;
                }
            }
            if (!bool_75_)
                ((Class343) this).aByteArray4026 = null;
        }
        if (!bool_29_)
            ((Class343) this).aByteArray4076 = null;
        if (!bool_30_)
            ((Class343) this).aShortArray4056 = null;
    }

    final int[][] method3502(boolean bool) {
        anInt4066++;
        int[] is = new int[256];
        int i = 0;
        for (int i_78_ = 0; ((Class343) this).anInt4028 > i_78_; i_78_++) {
            int i_79_ = ((Class343) this).anIntArray4030[i_78_];
            if (i_79_ >= 0) {
                if ((i_79_ ^ 0xffffffff) < (i ^ 0xffffffff))
                    i = i_79_;
                is[i_79_]++;
            }
        }
        int[][] is_80_ = new int[1 + i][];
        for (int i_81_ = 0; i >= i_81_; i_81_++) {
            is_80_[i_81_] = new int[is[i_81_]];
            is[i_81_] = 0;
        }
        if (bool != true)
            method3512((short) 14, -97, null, -127);
        for (int i_82_ = 0; i_82_ < ((Class343) this).anInt4028; i_82_++) {
            int i_83_ = ((Class343) this).anIntArray4030[i_82_];
            if (i_83_ >= 0)
                is_80_[i_83_][is[i_83_]++] = i_82_;
        }
        return is_80_;
    }

    final byte method3503(short i, short i_84_, boolean bool, byte i_85_, short i_86_, short i_87_, short i_88_, short i_89_, byte i_90_, byte i_91_) {
        anInt4065++;
        if ((((Class343) this).anInt4039 ^ 0xffffffff) <= -256)
            throw new IllegalStateException();
        ((Class343) this).aByteArray4033[((Class343) this).anInt4039] = (byte) 3;
        ((Class343) this).aShortArray4047[((Class343) this).anInt4039] = i_87_;
        ((Class343) this).aShortArray4049[((Class343) this).anInt4039] = i_84_;
        ((Class343) this).aShortArray4070[((Class343) this).anInt4039] = i_89_;
        ((Class343) this).anIntArray4058[((Class343) this).anInt4039] = i_86_;
        ((Class343) this).anIntArray4029[((Class343) this).anInt4039] = i_88_;
        if (bool != true)
            return (byte) 39;
        ((Class343) this).anIntArray4021[((Class343) this).anInt4039] = i;
        ((Class343) this).aByteArray4055[((Class343) this).anInt4039] = i_90_;
        ((Class343) this).aByteArray4042[((Class343) this).anInt4039] = i_85_;
        ((Class343) this).anIntArray4041[((Class343) this).anInt4039] = i_91_;
        return (byte) ((Class343) this).anInt4039++;
    }

    final int[][] method3504(boolean bool, int i) {
        anInt4043++;
        int[] is = new int[256];
        int i_92_ = 0;
        if (i < 19)
            ((Class343) this).aByteArray4076 = null;
        int i_93_ = bool ? ((Class343) this).anInt4063 : ((Class343) this).anInt4075;
        for (int i_94_ = 0; (i_94_ ^ 0xffffffff) > (i_93_ ^ 0xffffffff); i_94_++) {
            int i_95_ = ((Class343) this).anIntArray4057[i_94_];
            if ((i_95_ ^ 0xffffffff) <= -1) {
                is[i_95_]++;
                if ((i_92_ ^ 0xffffffff) > (i_95_ ^ 0xffffffff))
                    i_92_ = i_95_;
            }
        }
        int[][] is_96_ = new int[1 + i_92_][];
        for (int i_97_ = 0; i_97_ <= i_92_; i_97_++) {
            is_96_[i_97_] = new int[is[i_97_]];
            is[i_97_] = 0;
        }
        for (int i_98_ = 0; i_93_ > i_98_; i_98_++) {
            int i_99_ = ((Class343) this).anIntArray4057[i_98_];
            if (i_99_ >= 0)
                is_96_[i_99_][is[i_99_]++] = i_98_;
        }
        return is_96_;
    }

    final void method3505(int i, int i_100_, int i_101_, int i_102_) {
        anInt4074++;
        if (i != 12)
            method3495((byte) -93, (byte) 12, (byte) 70, (byte) 95, (short) 84, -45, (short) -65, -14, -86);
        if (i_100_ != 0) {
            int i_103_ = Node_Sub9_Sub1.anIntArray9106[i_100_];
            int i_104_ = Node_Sub9_Sub1.anIntArray9109[i_100_];
            for (int i_105_ = 0; ((Class343) this).anInt4063 > i_105_; i_105_++) {
                int i_106_ = ((((Class343) this).anIntArray4027[i_105_] * i_104_ + ((Class343) this).anIntArray4069[i_105_] * i_103_) >> -1634078546);
                ((Class343) this).anIntArray4069[i_105_] = ((((Class343) this).anIntArray4069[i_105_] * i_104_ - ((Class343) this).anIntArray4027[i_105_] * i_103_) >> -757272882);
                ((Class343) this).anIntArray4027[i_105_] = i_106_;
            }
        }
        if (i_102_ != 0) {
            int i_107_ = Node_Sub9_Sub1.anIntArray9106[i_102_];
            int i_108_ = Node_Sub9_Sub1.anIntArray9109[i_102_];
            for (int i_109_ = 0; ((((Class343) this).anInt4063 ^ 0xffffffff) < (i_109_ ^ 0xffffffff)); i_109_++) {
                int i_110_ = ((-(i_107_ * ((Class343) this).anIntArray4040[i_109_]) + ((Class343) this).anIntArray4069[i_109_] * i_108_) >> 1934591534);
                ((Class343) this).anIntArray4040[i_109_] = ((i_108_ * ((Class343) this).anIntArray4040[i_109_] + ((Class343) this).anIntArray4069[i_109_] * i_107_) >> -629056210);
                ((Class343) this).anIntArray4069[i_109_] = i_110_;
            }
        }
        if ((i_101_ ^ 0xffffffff) != -1) {
            int i_111_ = Node_Sub9_Sub1.anIntArray9106[i_101_];
            int i_112_ = Node_Sub9_Sub1.anIntArray9109[i_101_];
            for (int i_113_ = 0; ((i_113_ ^ 0xffffffff) > (((Class343) this).anInt4063 ^ 0xffffffff)); i_113_++) {
                int i_114_ = ((((Class343) this).anIntArray4027[i_113_] * i_112_ + ((Class343) this).anIntArray4040[i_113_] * i_111_) >> -2066974962);
                ((Class343) this).anIntArray4040[i_113_] = ((-(((Class343) this).anIntArray4027[i_113_] * i_111_) + ((Class343) this).anIntArray4040[i_113_] * i_112_) >> -1960247794);
                ((Class343) this).anIntArray4027[i_113_] = i_114_;
            }
        }
    }

    final int[][] method3506(int i) {
        anInt4044++;
        int[] is = new int[256];
        int i_115_ = 0;
        for (int i_116_ = 0; ((Class343) this).aClass178Array4048.length > i_116_; i_116_++) {
            int i_117_ = (((Class178) ((Class343) this).aClass178Array4048[i_116_]).anInt2079);
            if (i_117_ >= 0) {
                is[i_117_]++;
                if (i_115_ < i_117_)
                    i_115_ = i_117_;
            }
        }
        int[][] is_118_ = new int[i_115_ + 1][];
        for (int i_119_ = 0; (i_119_ ^ 0xffffffff) >= (i_115_ ^ 0xffffffff); i_119_++) {
            is_118_[i_119_] = new int[is[i_119_]];
            is[i_119_] = 0;
        }
        for (int i_120_ = 0; i_120_ < ((Class343) this).aClass178Array4048.length; i_120_++) {
            int i_121_ = (((Class178) ((Class343) this).aClass178Array4048[i_120_]).anInt2079);
            if (i_121_ >= 0)
                is_118_[i_121_][is[i_121_]++] = i_120_;
        }
        if (i != -15362)
            method3500(66, null, -103, 97, false);
        return is_118_;
    }

    private final void method3507(int i, byte[] is) {
        anInt4022++;
        ByteStream class248_sub9 = new ByteStream(is);
        ByteStream class248_sub9_122_ = new ByteStream(is);
        ByteStream class248_sub9_123_ = new ByteStream(is);
        ByteStream class248_sub9_124_ = new ByteStream(is);
        ByteStream class248_sub9_125_ = new ByteStream(is);
        ByteStream class248_sub9_126_ = new ByteStream(is);
        ByteStream class248_sub9_127_ = new ByteStream(is);
        ((ByteStream) class248_sub9).offset = -23 + is.length;
        ((Class343) this).anInt4063 = class248_sub9.readShort(-1);
        ((Class343) this).anInt4028 = class248_sub9.readShort(-1);
        ((Class343) this).anInt4039 = class248_sub9.readUnsignedByte((byte) -70);
        int i_128_ = class248_sub9.readUnsignedByte((byte) 93);
        boolean bool = (i_128_ & 0x1) == 1;
        boolean bool_129_ = (0x2 & i_128_) == 2;
        boolean bool_130_ = (0x4 & i_128_) == 4;
        boolean bool_131_ = (i_128_ & 0x8 ^ 0xffffffff) == -9;
        if (bool_131_) {
            ((ByteStream) class248_sub9).offset -= 7;
            ((Class343) this).anInt4053 = class248_sub9.readUnsignedByte((byte) 123);
            ((ByteStream) class248_sub9).offset += 6;
        }
        int i_132_ = class248_sub9.readUnsignedByte((byte) -118);
        int i_133_ = class248_sub9.readUnsignedByte((byte) -32);
        int i_134_ = class248_sub9.readUnsignedByte((byte) 95);
        int i_135_ = class248_sub9.readUnsignedByte((byte) 108);
        int i_136_ = class248_sub9.readUnsignedByte((byte) 76);
        int i_137_ = class248_sub9.readShort(-1);
        int i_138_ = class248_sub9.readShort(-1);
        int i_139_ = class248_sub9.readShort(-1);
        int i_140_ = class248_sub9.readShort(-1);
        int i_141_ = class248_sub9.readShort(-1);
        int i_142_ = 0;
        int i_143_ = 0;
        int i_144_ = 0;
        if (((Class343) this).anInt4039 > 0) {
            ((Class343) this).aByteArray4033 = new byte[((Class343) this).anInt4039];
            ((ByteStream) class248_sub9).offset = 0;
            for (int i_145_ = 0; ((((Class343) this).anInt4039 ^ 0xffffffff) < (i_145_ ^ 0xffffffff)); i_145_++) {
                byte i_146_ = (((Class343) this).aByteArray4033[i_145_] = class248_sub9.readByte(95));
                if ((i_146_ ^ 0xffffffff) <= -2 && (i_146_ ^ 0xffffffff) >= -4)
                    i_143_++;
                if (i_146_ == 0)
                    i_142_++;
                if ((i_146_ ^ 0xffffffff) == -3)
                    i_144_++;
            }
        }
        int i_147_ = ((Class343) this).anInt4039;
        int i_148_ = i_147_;
        i_147_ += ((Class343) this).anInt4063;
        int i_149_ = i_147_;
        if (bool)
            i_147_ += ((Class343) this).anInt4028;
        int i_150_ = i_147_;
        i_147_ += ((Class343) this).anInt4028;
        int i_151_ = i_147_;
        if ((i_132_ ^ 0xffffffff) == -256)
            i_147_ += ((Class343) this).anInt4028;
        int i_152_ = i_147_;
        if ((i_134_ ^ 0xffffffff) == -2)
            i_147_ += ((Class343) this).anInt4028;
        int i_153_ = i_147_;
        if (i_136_ == 1)
            i_147_ += ((Class343) this).anInt4063;
        int i_154_ = i_147_;
        if (i_133_ == 1)
            i_147_ += ((Class343) this).anInt4028;
        int i_155_ = i_147_;
        i_147_ += i_140_;
        int i_156_ = i_147_;
        if ((i_135_ ^ 0xffffffff) == -2)
            i_147_ += ((Class343) this).anInt4028 * 2;
        int i_157_ = i_147_;
        i_147_ += i_141_;
        int i_158_ = i_147_;
        i_147_ += 2 * ((Class343) this).anInt4028;
        int i_159_ = i_147_;
        i_147_ += i_137_;
        int i_160_ = i_147_;
        i_147_ += i_138_;
        int i_161_ = i_147_;
        i_147_ += i_139_;
        int i_162_ = i_147_;
        i_147_ += 6 * i_142_;
        int i_163_ = i_147_;
        i_147_ += 6 * i_143_;
        int i_164_ = 6;
        if (((Class343) this).anInt4053 != 14) {
            if (((Class343) this).anInt4053 >= 15)
                i_164_ = 9;
        } else
            i_164_ = 7;
        int i_165_ = i_147_;
        i_147_ += i_143_ * i_164_;
        int i_166_ = i_147_;
        i_147_ += i_143_;
        int i_167_ = i_147_;
        i_147_ += i_143_;
        int i_168_ = i_147_;
        i_147_ += i_144_ * 2 + i_143_;
        int i_169_ = i_147_;
        ((Class343) this).aShortArray4046 = new short[((Class343) this).anInt4028];
        if ((((Class343) this).anInt4039 ^ 0xffffffff) < -1) {
            if ((i_144_ ^ 0xffffffff) < -1) {
                ((Class343) this).anIntArray4034 = new int[i_144_];
                ((Class343) this).anIntArray4032 = new int[i_144_];
            }
            ((Class343) this).aShortArray4049 = new short[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4047 = new short[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4070 = new short[((Class343) this).anInt4039];
            if (i_143_ > 0) {
                ((Class343) this).anIntArray4029 = new int[i_143_];
                ((Class343) this).aByteArray4042 = new byte[i_143_];
                ((Class343) this).anIntArray4058 = new int[i_143_];
                ((Class343) this).anIntArray4021 = new int[i_143_];
                ((Class343) this).anIntArray4041 = new int[i_143_];
                ((Class343) this).aByteArray4055 = new byte[i_143_];
            }
        }
        if (i_134_ == 1)
            ((Class343) this).anIntArray4030 = new int[((Class343) this).anInt4028];
        if (i >= 101) {
            ((Class343) this).aShortArray4024 = new short[((Class343) this).anInt4028];
            if (i_136_ == 1)
                ((Class343) this).anIntArray4057 = new int[((Class343) this).anInt4063];
            if (i_132_ != 255)
                ((Class343) this).aByte4036 = (byte) i_132_;
            else
                ((Class343) this).aByteArray4072 = new byte[((Class343) this).anInt4028];
            ((Class343) this).anIntArray4027 = new int[((Class343) this).anInt4063];
            ((Class343) this).aShortArray4054 = new short[((Class343) this).anInt4028];
            if ((i_135_ ^ 0xffffffff) == -2)
                ((Class343) this).aShortArray4056 = new short[((Class343) this).anInt4028];
            ((ByteStream) class248_sub9).offset = i_148_;
            ((Class343) this).anIntArray4040 = new int[((Class343) this).anInt4063];
            if ((i_135_ ^ 0xffffffff) == -2 && ((Class343) this).anInt4039 > 0)
                ((Class343) this).aByteArray4026 = new byte[((Class343) this).anInt4028];
            if ((i_133_ ^ 0xffffffff) == -2)
                ((Class343) this).aByteArray4061 = new byte[((Class343) this).anInt4028];
            ((Class343) this).aShortArray4073 = new short[((Class343) this).anInt4028];
            ((Class343) this).anIntArray4069 = new int[((Class343) this).anInt4063];
            if (bool)
                ((Class343) this).aByteArray4076 = new byte[((Class343) this).anInt4028];
            ((ByteStream) class248_sub9_122_).offset = i_159_;
            ((ByteStream) class248_sub9_123_).offset = i_160_;
            ((ByteStream) class248_sub9_124_).offset = i_161_;
            ((ByteStream) class248_sub9_125_).offset = i_153_;
            int i_170_ = 0;
            int i_171_ = 0;
            int i_172_ = 0;
            for (int i_173_ = 0; ((i_173_ ^ 0xffffffff) > (((Class343) this).anInt4063 ^ 0xffffffff)); i_173_++) {
                int i_174_ = class248_sub9.readUnsignedByte((byte) 124);
                int i_175_ = 0;
                if ((0x1 & i_174_ ^ 0xffffffff) != -1)
                    i_175_ = class248_sub9_122_.method2210((byte) 105);
                int i_176_ = 0;
                if ((i_174_ & 0x2 ^ 0xffffffff) != -1)
                    i_176_ = class248_sub9_123_.method2210((byte) -58);
                int i_177_ = 0;
                if ((i_174_ & 0x4) != 0)
                    i_177_ = class248_sub9_124_.method2210((byte) -97);
                ((Class343) this).anIntArray4027[i_173_] = i_170_ - -i_175_;
                ((Class343) this).anIntArray4069[i_173_] = i_171_ + i_176_;
                ((Class343) this).anIntArray4040[i_173_] = i_177_ + i_172_;
                i_170_ = ((Class343) this).anIntArray4027[i_173_];
                i_172_ = ((Class343) this).anIntArray4040[i_173_];
                i_171_ = ((Class343) this).anIntArray4069[i_173_];
                if ((i_136_ ^ 0xffffffff) == -2)
                    ((Class343) this).anIntArray4057[i_173_] = class248_sub9_125_.readUnsignedByte((byte) 100);
            }
            ((ByteStream) class248_sub9).offset = i_158_;
            ((ByteStream) class248_sub9_122_).offset = i_149_;
            ((ByteStream) class248_sub9_123_).offset = i_151_;
            ((ByteStream) class248_sub9_124_).offset = i_154_;
            ((ByteStream) class248_sub9_125_).offset = i_152_;
            ((ByteStream) class248_sub9_126_).offset = i_156_;
            ((ByteStream) class248_sub9_127_).offset = i_157_;
            for (int i_178_ = 0; ((i_178_ ^ 0xffffffff) > (((Class343) this).anInt4028 ^ 0xffffffff)); i_178_++) {
                ((Class343) this).aShortArray4054[i_178_] = (short) class248_sub9.readShort(-1);
                if (bool)
                    ((Class343) this).aByteArray4076[i_178_] = class248_sub9_122_.readByte(73);
                if ((i_132_ ^ 0xffffffff) == -256)
                    ((Class343) this).aByteArray4072[i_178_] = class248_sub9_123_.readByte(62);
                if ((i_133_ ^ 0xffffffff) == -2)
                    ((Class343) this).aByteArray4061[i_178_] = class248_sub9_124_.readByte(109);
                if ((i_134_ ^ 0xffffffff) == -2)
                    ((Class343) this).anIntArray4030[i_178_] = class248_sub9_125_.readUnsignedByte((byte) -89);
                if (i_135_ == 1)
                    ((Class343) this).aShortArray4056[i_178_] = (short) (class248_sub9_126_.readShort(-1) - 1);
                if (((Class343) this).aByteArray4026 != null) {
                    if ((((Class343) this).aShortArray4056[i_178_] ^ 0xffffffff) == 0)
                        ((Class343) this).aByteArray4026[i_178_] = (byte) -1;
                    else
                        ((Class343) this).aByteArray4026[i_178_] = (byte) (class248_sub9_127_.readUnsignedByte((byte) -99) - 1);
                }
            }
            ((Class343) this).anInt4075 = -1;
            ((ByteStream) class248_sub9).offset = i_155_;
            ((ByteStream) class248_sub9_122_).offset = i_150_;
            short i_179_ = 0;
            short i_180_ = 0;
            short i_181_ = 0;
            int i_182_ = 0;
            for (int i_183_ = 0; ((((Class343) this).anInt4028 ^ 0xffffffff) < (i_183_ ^ 0xffffffff)); i_183_++) {
                int i_184_ = class248_sub9_122_.readUnsignedByte((byte) 125);
                if ((i_184_ ^ 0xffffffff) == -2) {
                    i_179_ = (short) (i_182_ + class248_sub9.method2210((byte) 121));
                    i_182_ = i_179_;
                    i_180_ = (short) (i_182_ + class248_sub9.method2210((byte) -54));
                    i_182_ = i_180_;
                    i_181_ = (short) (i_182_ + class248_sub9.method2210((byte) -93));
                    i_182_ = i_181_;
                    ((Class343) this).aShortArray4046[i_183_] = i_179_;
                    ((Class343) this).aShortArray4024[i_183_] = i_180_;
                    ((Class343) this).aShortArray4073[i_183_] = i_181_;
                    if ((((Class343) this).anInt4075 ^ 0xffffffff) > (i_179_ ^ 0xffffffff))
                        ((Class343) this).anInt4075 = i_179_;
                    if (i_180_ > ((Class343) this).anInt4075)
                        ((Class343) this).anInt4075 = i_180_;
                    if (i_181_ > ((Class343) this).anInt4075)
                        ((Class343) this).anInt4075 = i_181_;
                }
                if (i_184_ == 2) {
                    i_180_ = i_181_;
                    i_181_ = (short) (class248_sub9.method2210((byte) -74) + i_182_);
                    i_182_ = i_181_;
                    ((Class343) this).aShortArray4046[i_183_] = i_179_;
                    ((Class343) this).aShortArray4024[i_183_] = i_180_;
                    ((Class343) this).aShortArray4073[i_183_] = i_181_;
                    if ((((Class343) this).anInt4075 ^ 0xffffffff) > (i_181_ ^ 0xffffffff))
                        ((Class343) this).anInt4075 = i_181_;
                }
                if (i_184_ == 3) {
                    i_179_ = i_181_;
                    i_181_ = (short) (class248_sub9.method2210((byte) -85) + i_182_);
                    i_182_ = i_181_;
                    ((Class343) this).aShortArray4046[i_183_] = i_179_;
                    ((Class343) this).aShortArray4024[i_183_] = i_180_;
                    ((Class343) this).aShortArray4073[i_183_] = i_181_;
                    if ((i_181_ ^ 0xffffffff) < (((Class343) this).anInt4075 ^ 0xffffffff))
                        ((Class343) this).anInt4075 = i_181_;
                }
                if (i_184_ == 4) {
                    short i_185_ = i_179_;
                    i_179_ = i_180_;
                    i_181_ = (short) (i_182_ + class248_sub9.method2210((byte) -78));
                    i_180_ = i_185_;
                    ((Class343) this).aShortArray4046[i_183_] = i_179_;
                    i_182_ = i_181_;
                    ((Class343) this).aShortArray4024[i_183_] = i_180_;
                    ((Class343) this).aShortArray4073[i_183_] = i_181_;
                    if (((Class343) this).anInt4075 < i_181_)
                        ((Class343) this).anInt4075 = i_181_;
                }
            }
            ((ByteStream) class248_sub9).offset = i_162_;
            ((Class343) this).anInt4075++;
            ((ByteStream) class248_sub9_122_).offset = i_163_;
            ((ByteStream) class248_sub9_123_).offset = i_165_;
            ((ByteStream) class248_sub9_124_).offset = i_166_;
            ((ByteStream) class248_sub9_125_).offset = i_167_;
            ((ByteStream) class248_sub9_126_).offset = i_168_;
            for (int i_186_ = 0; ((i_186_ ^ 0xffffffff) > (((Class343) this).anInt4039 ^ 0xffffffff)); i_186_++) {
                int i_187_ = ((Class343) this).aByteArray4033[i_186_] & 0xff;
                if (i_187_ == 0) {
                    ((Class343) this).aShortArray4047[i_186_] = (short) class248_sub9.readShort(-1);
                    ((Class343) this).aShortArray4049[i_186_] = (short) class248_sub9.readShort(-1);
                    ((Class343) this).aShortArray4070[i_186_] = (short) class248_sub9.readShort(-1);
                }
                if ((i_187_ ^ 0xffffffff) == -2) {
                    ((Class343) this).aShortArray4047[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    ((Class343) this).aShortArray4049[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    ((Class343) this).aShortArray4070[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    if (((Class343) this).anInt4053 >= 15) {
                        ((Class343) this).anIntArray4058[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4021[i_186_] = class248_sub9_123_.method2221(255);
                    } else {
                        ((Class343) this).anIntArray4058[i_186_] = class248_sub9_123_.readShort(-1);
                        if ((((Class343) this).anInt4053 ^ 0xffffffff) <= -15)
                            ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.method2221(255);
                        else
                            ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.readShort(-1);
                        ((Class343) this).anIntArray4021[i_186_] = class248_sub9_123_.readShort(-1);
                    }
                    ((Class343) this).aByteArray4055[i_186_] = class248_sub9_124_.readByte(71);
                    ((Class343) this).aByteArray4042[i_186_] = class248_sub9_125_.readByte(85);
                    ((Class343) this).anIntArray4041[i_186_] = class248_sub9_126_.readByte(47);
                }
                if ((i_187_ ^ 0xffffffff) == -3) {
                    ((Class343) this).aShortArray4047[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    ((Class343) this).aShortArray4049[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    ((Class343) this).aShortArray4070[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    if (((Class343) this).anInt4053 >= 15) {
                        ((Class343) this).anIntArray4058[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4021[i_186_] = class248_sub9_123_.method2221(255);
                    } else {
                        ((Class343) this).anIntArray4058[i_186_] = class248_sub9_123_.readShort(-1);
                        if (((Class343) this).anInt4053 >= 14)
                            ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.method2221(255);
                        else
                            ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.readShort(-1);
                        ((Class343) this).anIntArray4021[i_186_] = class248_sub9_123_.readShort(-1);
                    }
                    ((Class343) this).aByteArray4055[i_186_] = class248_sub9_124_.readByte(42);
                    ((Class343) this).aByteArray4042[i_186_] = class248_sub9_125_.readByte(34);
                    ((Class343) this).anIntArray4041[i_186_] = class248_sub9_126_.readByte(78);
                    ((Class343) this).anIntArray4032[i_186_] = class248_sub9_126_.readByte(38);
                    ((Class343) this).anIntArray4034[i_186_] = class248_sub9_126_.readByte(37);
                }
                if ((i_187_ ^ 0xffffffff) == -4) {
                    ((Class343) this).aShortArray4047[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    ((Class343) this).aShortArray4049[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    ((Class343) this).aShortArray4070[i_186_] = (short) class248_sub9_122_.readShort(-1);
                    if ((((Class343) this).anInt4053 ^ 0xffffffff) > -16) {
                        ((Class343) this).anIntArray4058[i_186_] = class248_sub9_123_.readShort(-1);
                        if (((Class343) this).anInt4053 < 14)
                            ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.readShort(-1);
                        else
                            ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4021[i_186_] = class248_sub9_123_.readShort(-1);
                    } else {
                        ((Class343) this).anIntArray4058[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4029[i_186_] = class248_sub9_123_.method2221(255);
                        ((Class343) this).anIntArray4021[i_186_] = class248_sub9_123_.method2221(255);
                    }
                    ((Class343) this).aByteArray4055[i_186_] = class248_sub9_124_.readByte(117);
                    ((Class343) this).aByteArray4042[i_186_] = class248_sub9_125_.readByte(49);
                    ((Class343) this).anIntArray4041[i_186_] = class248_sub9_126_.readByte(99);
                }
            }
            ((ByteStream) class248_sub9).offset = i_169_;
            if (bool_129_) {
                int i_188_ = class248_sub9.readUnsignedByte((byte) 87);
                if (i_188_ > 0) {
                    ((Class343) this).aClass40Array4045 = new Class40[i_188_];
                    for (int i_189_ = 0; i_188_ > i_189_; i_189_++) {
                        int i_190_ = class248_sub9.readShort(-1);
                        int i_191_ = class248_sub9.readShort(-1);
                        byte i_192_;
                        if (i_132_ == 255)
                            i_192_ = ((Class343) this).aByteArray4072[i_191_];
                        else
                            i_192_ = (byte) i_132_;
                        ((Class343) this).aClass40Array4045[i_189_] = new Class40(i_190_, (((Class343) this).aShortArray4046[i_191_]), (((Class343) this).aShortArray4024[i_191_]), (((Class343) this).aShortArray4073[i_191_]), i_192_);
                    }
                }
                int i_193_ = class248_sub9.readUnsignedByte((byte) 83);
                if ((i_193_ ^ 0xffffffff) < -1) {
                    ((Class343) this).aClass124Array4060 = new Class124[i_193_];
                    for (int i_194_ = 0; (i_194_ ^ 0xffffffff) > (i_193_ ^ 0xffffffff); i_194_++) {
                        int i_195_ = class248_sub9.readShort(-1);
                        int i_196_ = class248_sub9.readShort(-1);
                        ((Class343) this).aClass124Array4060[i_194_] = new Class124(i_195_, i_196_);
                    }
                }
            }
            if (bool_130_) {
                int i_197_ = class248_sub9.readUnsignedByte((byte) 114);
                if ((i_197_ ^ 0xffffffff) < -1) {
                    ((Class343) this).aClass178Array4048 = new Class178[i_197_];
                    for (int i_198_ = 0; (i_197_ ^ 0xffffffff) < (i_198_ ^ 0xffffffff); i_198_++) {
                        int i_199_ = class248_sub9.readShort(-1);
                        int i_200_ = class248_sub9.readShort(-1);
                        int i_201_ = class248_sub9.readUnsignedByte((byte) -112);
                        byte i_202_ = class248_sub9.readByte(50);
                        ((Class343) this).aClass178Array4048[i_198_] = new Class178(i_199_, i_200_, i_201_, i_202_);
                    }
                }
            }
        }
    }

    static final boolean method3508(int i, int i_203_) {
        if (i_203_ != -31218)
            anIntArray4059 = null;
        anInt4025++;
        if ((i ^ 0xffffffff) != (i & -i ^ 0xffffffff))
            return false;
        return true;
    }

    final void method3509(short i, byte i_204_, short i_205_) {
        anInt4052++;
        if (i_204_ == -119) {
            for (int i_206_ = 0; ((((Class343) this).anInt4028 ^ 0xffffffff) < (i_206_ ^ 0xffffffff)); i_206_++) {
                if ((((Class343) this).aShortArray4054[i_206_] ^ 0xffffffff) == (i_205_ ^ 0xffffffff))
                    ((Class343) this).aShortArray4054[i_206_] = i;
            }
        }
    }

    public static void method3510(int i) {
        if (i != 0)
            anIntArray4059 = null;
        anIntArray4059 = null;
        aClass329_4031 = null;
    }

    final void method3511(byte i, short i_207_, short i_208_) {
        anInt4051++;
        if (((Class343) this).aShortArray4056 != null) {
            if (i < 96)
                method3510(-54);
            for (int i_209_ = 0; ((((Class343) this).anInt4028 ^ 0xffffffff) < (i_209_ ^ 0xffffffff)); i_209_++) {
                if ((i_207_ ^ 0xffffffff) == (((Class343) this).aShortArray4056[i_209_] ^ 0xffffffff))
                    ((Class343) this).aShortArray4056[i_209_] = i_208_;
            }
        }
    }

    public Class343() {
        ((Class343) this).aByte4036 = (byte) 0;
        ((Class343) this).anInt4053 = 12;
        ((Class343) this).anInt4063 = 0;
        ((Class343) this).anInt4075 = 0;
    }

    private final int method3512(short i, int i_210_, Class343 class343_211_, int i_212_) {
        anInt4050++;
        int i_213_ = ((Class343) class343_211_).anIntArray4027[i_210_];
        if (i_212_ >= -105)
            method3512((short) 58, -22, null, -78);
        int i_214_ = ((Class343) class343_211_).anIntArray4069[i_210_];
        int i_215_ = ((Class343) class343_211_).anIntArray4040[i_210_];
        for (int i_216_ = 0; ((((Class343) this).anInt4063 ^ 0xffffffff) < (i_216_ ^ 0xffffffff)); i_216_++) {
            if (((Class343) this).anIntArray4027[i_216_] == i_213_ && ((Class343) this).anIntArray4069[i_216_] == i_214_ && ((Class343) this).anIntArray4040[i_216_] == i_215_) {
                ((Class343) this).aShortArray4038[i_216_] = (short) Class358.retrieveLooksSettings((((Class343) this).aShortArray4038[i_216_]), i);
                return i_216_;
            }
        }
        ((Class343) this).anIntArray4027[((Class343) this).anInt4063] = i_213_;
        ((Class343) this).anIntArray4069[((Class343) this).anInt4063] = i_214_;
        ((Class343) this).anIntArray4040[((Class343) this).anInt4063] = i_215_;
        ((Class343) this).aShortArray4038[((Class343) this).anInt4063] = i;
        ((Class343) this).anIntArray4057[((Class343) this).anInt4063] = (((Class343) class343_211_).anIntArray4057 != null ? ((Class343) class343_211_).anIntArray4057[i_210_] : -1);
        return ((Class343) this).anInt4063++;
    }

    Class343(byte[] is) {
        ((Class343) this).aByte4036 = (byte) 0;
        ((Class343) this).anInt4053 = 12;
        ((Class343) this).anInt4063 = 0;
        ((Class343) this).anInt4075 = 0;
        if ((is[-1 + is.length] ^ 0xffffffff) != 0 || is[-2 + is.length] != -1)
            method3501(false, is);
        else
            method3507(119, is);
    }

    Class343(int i, int i_217_, int i_218_) {
        ((Class343) this).aByte4036 = (byte) 0;
        ((Class343) this).anInt4053 = 12;
        ((Class343) this).anInt4063 = 0;
        ((Class343) this).anInt4075 = 0;
        ((Class343) this).aShortArray4054 = new short[i_217_];
        ((Class343) this).aByteArray4061 = new byte[i_217_];
        ((Class343) this).aShortArray4056 = new short[i_217_];
        ((Class343) this).aShortArray4024 = new short[i_217_];
        ((Class343) this).aByteArray4076 = new byte[i_217_];
        if (i_218_ > 0) {
            ((Class343) this).aShortArray4070 = new short[i_218_];
            ((Class343) this).aByteArray4055 = new byte[i_218_];
            ((Class343) this).anIntArray4029 = new int[i_218_];
            ((Class343) this).aByteArray4033 = new byte[i_218_];
            ((Class343) this).anIntArray4041 = new int[i_218_];
            ((Class343) this).anIntArray4032 = new int[i_218_];
            ((Class343) this).aByteArray4042 = new byte[i_218_];
            ((Class343) this).anIntArray4058 = new int[i_218_];
            ((Class343) this).anIntArray4021 = new int[i_218_];
            ((Class343) this).anIntArray4034 = new int[i_218_];
            ((Class343) this).aShortArray4047 = new short[i_218_];
            ((Class343) this).aShortArray4049 = new short[i_218_];
        }
        ((Class343) this).aByteArray4072 = new byte[i_217_];
        ((Class343) this).aShortArray4073 = new short[i_217_];
        ((Class343) this).anIntArray4027 = new int[i];
        ((Class343) this).anIntArray4030 = new int[i_217_];
        ((Class343) this).anIntArray4057 = new int[i];
        ((Class343) this).anIntArray4069 = new int[i];
        ((Class343) this).aShortArray4046 = new short[i_217_];
        ((Class343) this).aByteArray4026 = new byte[i_217_];
        ((Class343) this).anIntArray4040 = new int[i];
    }

    Class343(Class343[] class343s, int i) {
        ((Class343) this).aByte4036 = (byte) 0;
        ((Class343) this).anInt4053 = 12;
        ((Class343) this).anInt4063 = 0;
        ((Class343) this).anInt4075 = 0;
        ((Class343) this).anInt4063 = 0;
        ((Class343) this).anInt4028 = 0;
        ((Class343) this).anInt4039 = 0;
        int i_219_ = 0;
        int i_220_ = 0;
        int i_221_ = 0;
        boolean bool = false;
        boolean bool_222_ = false;
        boolean bool_223_ = false;
        boolean bool_224_ = false;
        boolean bool_225_ = false;
        ((Class343) this).aByte4036 = (byte) -1;
        boolean bool_226_ = false;
        for (int i_227_ = 0; i > i_227_; i_227_++) {
            Class343 class343_228_ = class343s[i_227_];
            if (class343_228_ != null) {
                ((Class343) this).anInt4063 += ((Class343) class343_228_).anInt4063;
                ((Class343) this).anInt4028 += ((Class343) class343_228_).anInt4028;
                ((Class343) this).anInt4039 += ((Class343) class343_228_).anInt4039;
                if (((Class343) class343_228_).aClass124Array4060 != null)
                    i_220_ += (((Class343) class343_228_).aClass124Array4060).length;
                if (((Class343) class343_228_).aClass178Array4048 != null)
                    i_221_ += (((Class343) class343_228_).aClass178Array4048).length;
                bool = bool | ((Class343) class343_228_).aByteArray4076 != null;
                if (((Class343) class343_228_).aClass40Array4045 != null)
                    i_219_ += ((Class343) class343_228_).aClass40Array4045.length;
                bool_223_ = (bool_223_ | ((Class343) class343_228_).aByteArray4061 != null);
                bool_224_ = (bool_224_ | ((Class343) class343_228_).aByteArray4026 != null);
                if (((Class343) class343_228_).aByteArray4072 != null)
                    bool_222_ = true;
                else {
                    if (((Class343) this).aByte4036 == -1)
                        ((Class343) this).aByte4036 = ((Class343) class343_228_).aByte4036;
                    if (((Class343) class343_228_).aByte4036 != ((Class343) this).aByte4036)
                        bool_222_ = true;
                }
                bool_225_ = (bool_225_ | ((Class343) class343_228_).aShortArray4056 != null);
                bool_226_ = (bool_226_ | ((Class343) class343_228_).anIntArray4030 != null);
            }
        }
        if (bool)
            ((Class343) this).aByteArray4076 = new byte[((Class343) this).anInt4028];
        ((Class343) this).anIntArray4069 = new int[((Class343) this).anInt4063];
        ((Class343) this).aShortArray4038 = new short[((Class343) this).anInt4063];
        if (((Class343) this).anInt4039 > 0) {
            ((Class343) this).anIntArray4041 = new int[((Class343) this).anInt4039];
            ((Class343) this).anIntArray4032 = new int[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4049 = new short[((Class343) this).anInt4039];
            ((Class343) this).aByteArray4042 = new byte[((Class343) this).anInt4039];
            ((Class343) this).anIntArray4021 = new int[((Class343) this).anInt4039];
            ((Class343) this).anIntArray4029 = new int[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4070 = new short[((Class343) this).anInt4039];
            ((Class343) this).anIntArray4034 = new int[((Class343) this).anInt4039];
            ((Class343) this).aByteArray4055 = new byte[((Class343) this).anInt4039];
            ((Class343) this).anIntArray4058 = new int[((Class343) this).anInt4039];
            ((Class343) this).aByteArray4033 = new byte[((Class343) this).anInt4039];
            ((Class343) this).aShortArray4047 = new short[((Class343) this).anInt4039];
        }
        ((Class343) this).aShortArray4024 = new short[((Class343) this).anInt4028];
        ((Class343) this).anIntArray4027 = new int[((Class343) this).anInt4063];
        ((Class343) this).aShortArray4073 = new short[((Class343) this).anInt4028];
        if ((i_219_ ^ 0xffffffff) < -1)
            ((Class343) this).aClass40Array4045 = new Class40[i_219_];
        ((Class343) this).anIntArray4040 = new int[((Class343) this).anInt4063];
        if (bool_224_)
            ((Class343) this).aByteArray4026 = new byte[((Class343) this).anInt4028];
        ((Class343) this).aShortArray4064 = new short[((Class343) this).anInt4028];
        if (bool_225_)
            ((Class343) this).aShortArray4056 = new short[((Class343) this).anInt4028];
        ((Class343) this).aShortArray4054 = new short[((Class343) this).anInt4028];
        if ((i_220_ ^ 0xffffffff) < -1)
            ((Class343) this).aClass124Array4060 = new Class124[i_220_];
        ((Class343) this).aShortArray4046 = new short[((Class343) this).anInt4028];
        if (bool_226_)
            ((Class343) this).anIntArray4030 = new int[((Class343) this).anInt4028];
        if (bool_223_)
            ((Class343) this).aByteArray4061 = new byte[((Class343) this).anInt4028];
        if ((i_221_ ^ 0xffffffff) < -1)
            ((Class343) this).aClass178Array4048 = new Class178[i_221_];
        ((Class343) this).anIntArray4057 = new int[((Class343) this).anInt4063];
        if (bool_222_)
            ((Class343) this).aByteArray4072 = new byte[((Class343) this).anInt4028];
        i_219_ = 0;
        ((Class343) this).anInt4039 = 0;
        i_221_ = 0;
        i_220_ = 0;
        ((Class343) this).anInt4028 = 0;
        ((Class343) this).anInt4063 = 0;
        for (int i_229_ = 0; i > i_229_; i_229_++) {
            short i_230_ = (short) (1 << i_229_);
            Class343 class343_231_ = class343s[i_229_];
            if (class343_231_ != null) {
                if (((Class343) class343_231_).aClass178Array4048 != null) {
                    for (int i_232_ = 0; (((Class343) class343_231_).aClass178Array4048.length > i_232_); i_232_++) {
                        Class178 class178 = (((Class343) class343_231_).aClass178Array4048[i_232_]);
                        ((Class343) this).aClass178Array4048[i_221_++] = class178.method1592(((((Class178) class178).anInt2075) + (((Class343) this).anInt4028)), -97);
                    }
                }
                for (int i_233_ = 0; ((i_233_ ^ 0xffffffff) > (((Class343) class343_231_).anInt4028 ^ 0xffffffff)); i_233_++) {
                    if (bool && ((Class343) class343_231_).aByteArray4076 != null)
                        ((Class343) this).aByteArray4076[(((Class343) this).anInt4028)] = (((Class343) class343_231_).aByteArray4076[i_233_]);
                    if (bool_222_) {
                        if (((Class343) class343_231_).aByteArray4072 == null)
                            ((Class343) this).aByteArray4072[(((Class343) this).anInt4028)] = ((Class343) class343_231_).aByte4036;
                        else
                            ((Class343) this).aByteArray4072[(((Class343) this).anInt4028)] = (((Class343) class343_231_).aByteArray4072[i_233_]);
                    }
                    if (bool_223_ && ((Class343) class343_231_).aByteArray4061 != null)
                        ((Class343) this).aByteArray4061[(((Class343) this).anInt4028)] = (((Class343) class343_231_).aByteArray4061[i_233_]);
                    if (bool_225_) {
                        if (((Class343) class343_231_).aShortArray4056 != null)
                            ((Class343) this).aShortArray4056[((Class343) this).anInt4028] = (((Class343) class343_231_).aShortArray4056[i_233_]);
                        else
                            ((Class343) this).aShortArray4056[((Class343) this).anInt4028] = (short) -1;
                    }
                    if (bool_226_) {
                        if (((Class343) class343_231_).anIntArray4030 == null)
                            ((Class343) this).anIntArray4030[(((Class343) this).anInt4028)] = -1;
                        else
                            ((Class343) this).anIntArray4030[(((Class343) this).anInt4028)] = (((Class343) class343_231_).anIntArray4030[i_233_]);
                    }
                    ((Class343) this).aShortArray4046[(((Class343) this).anInt4028)] = (short) method3512(i_230_, (((Class343) class343_231_).aShortArray4046[i_233_]), class343_231_, -118);
                    ((Class343) this).aShortArray4024[(((Class343) this).anInt4028)] = (short) method3512(i_230_, (((Class343) class343_231_).aShortArray4024[i_233_]), class343_231_, -110);
                    ((Class343) this).aShortArray4073[(((Class343) this).anInt4028)] = (short) method3512(i_230_, (((Class343) class343_231_).aShortArray4073[i_233_]), class343_231_, -117);
                    ((Class343) this).aShortArray4064[(((Class343) this).anInt4028)] = i_230_;
                    ((Class343) this).aShortArray4054[(((Class343) this).anInt4028)] = ((Class343) class343_231_).aShortArray4054[i_233_];
                    ((Class343) this).anInt4028++;
                }
                if (((Class343) class343_231_).aClass40Array4045 != null) {
                    for (int i_234_ = 0; (((Class343) class343_231_).aClass40Array4045.length > i_234_); i_234_++) {
                        int i_235_ = method3512(i_230_, ((Class40) (((Class343) class343_231_).aClass40Array4045[i_234_])).anInt446, class343_231_, -119);
                        int i_236_ = method3512(i_230_, ((Class40) (((Class343) class343_231_).aClass40Array4045[i_234_])).anInt451, class343_231_, -109);
                        int i_237_ = method3512(i_230_, ((Class40) (((Class343) class343_231_).aClass40Array4045[i_234_])).anInt456, class343_231_, -123);
                        ((Class343) this).aClass40Array4045[i_219_] = ((Class343) class343_231_).aClass40Array4045[i_234_].method300(1, i_236_, i_237_, i_235_);
                        i_219_++;
                    }
                }
                if (((Class343) class343_231_).aClass124Array4060 != null) {
                    for (int i_238_ = 0; (i_238_ ^ 0xffffffff) > ((((Class343) class343_231_).aClass124Array4060).length ^ 0xffffffff); i_238_++) {
                        int i_239_ = method3512(i_230_, ((Class124) (((Class343) class343_231_).aClass124Array4060[i_238_])).anInt1529, class343_231_, -117);
                        ((Class343) this).aClass124Array4060[i_220_] = ((Class343) class343_231_).aClass124Array4060[i_238_].method1137(i_239_, 40);
                        i_220_++;
                    }
                }
            }
        }
        ((Class343) this).anInt4075 = ((Class343) this).anInt4063;
        int i_240_ = 0;
        for (int i_241_ = 0; i_241_ < i; i_241_++) {
            short i_242_ = (short) (1 << i_241_);
            Class343 class343_243_ = class343s[i_241_];
            if (class343_243_ != null) {
                for (int i_244_ = 0; ((i_244_ ^ 0xffffffff) > (((Class343) class343_243_).anInt4028 ^ 0xffffffff)); i_244_++) {
                    if (bool_224_)
                        ((Class343) this).aByteArray4026[i_240_++] = (byte) (((((Class343) class343_243_).aByteArray4026) == null || (((Class343) class343_243_).aByteArray4026[i_244_]) == -1) ? -1 : (((Class343) this).anInt4039 + (((Class343) class343_243_).aByteArray4026[i_244_])));
                }
                for (int i_245_ = 0; i_245_ < ((Class343) class343_243_).anInt4039; i_245_++) {
                    byte i_246_ = (((Class343) this).aByteArray4033[(((Class343) this).anInt4039)] = (((Class343) class343_243_).aByteArray4033[i_245_]));
                    if ((i_246_ ^ 0xffffffff) == -1) {
                        ((Class343) this).aShortArray4047[(((Class343) this).anInt4039)] = (short) method3512(i_242_, (((Class343) class343_243_).aShortArray4047[i_245_]), class343_243_, -116);
                        ((Class343) this).aShortArray4049[(((Class343) this).anInt4039)] = (short) method3512(i_242_, (((Class343) class343_243_).aShortArray4049[i_245_]), class343_243_, -112);
                        ((Class343) this).aShortArray4070[(((Class343) this).anInt4039)] = (short) method3512(i_242_, (((Class343) class343_243_).aShortArray4070[i_245_]), class343_243_, -119);
                    }
                    if ((i_246_ ^ 0xffffffff) <= -2 && (i_246_ ^ 0xffffffff) >= -4) {
                        ((Class343) this).aShortArray4047[(((Class343) this).anInt4039)] = (((Class343) class343_243_).aShortArray4047[i_245_]);
                        ((Class343) this).aShortArray4049[(((Class343) this).anInt4039)] = (((Class343) class343_243_).aShortArray4049[i_245_]);
                        ((Class343) this).aShortArray4070[(((Class343) this).anInt4039)] = (((Class343) class343_243_).aShortArray4070[i_245_]);
                        ((Class343) this).anIntArray4058[(((Class343) this).anInt4039)] = (((Class343) class343_243_).anIntArray4058[i_245_]);
                        ((Class343) this).anIntArray4029[(((Class343) this).anInt4039)] = (((Class343) class343_243_).anIntArray4029[i_245_]);
                        ((Class343) this).anIntArray4021[(((Class343) this).anInt4039)] = (((Class343) class343_243_).anIntArray4021[i_245_]);
                        ((Class343) this).aByteArray4055[(((Class343) this).anInt4039)] = (((Class343) class343_243_).aByteArray4055[i_245_]);
                        ((Class343) this).aByteArray4042[(((Class343) this).anInt4039)] = (((Class343) class343_243_).aByteArray4042[i_245_]);
                        ((Class343) this).anIntArray4041[(((Class343) this).anInt4039)] = (((Class343) class343_243_).anIntArray4041[i_245_]);
                    }
                    if (i_246_ == 2) {
                        ((Class343) this).anIntArray4032[(((Class343) this).anInt4039)] = (((Class343) class343_243_).anIntArray4032[i_245_]);
                        ((Class343) this).anIntArray4034[(((Class343) this).anInt4039)] = (((Class343) class343_243_).anIntArray4034[i_245_]);
                    }
                    ((Class343) this).anInt4039++;
                }
            }
        }
    }
}
