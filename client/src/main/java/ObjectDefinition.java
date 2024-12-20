/* ObjectDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectDefinition {
    private int anInt3014;
    String aString3015 = "null";
    boolean aBoolean3016;
    static int anInt3017;
    int anInt3018;
    int anInt3019;
    static int anInt3020;
    private Class65 aClass65_3021;
    private byte[] aByteArray3022;
    int anInt3023;
    private int anInt3024;
    private int anInt3025;
    boolean aBoolean3026;
    static int anInt3027;
    int anInt3028 = 0;
    int[] anIntArray3029;
    static int anInt3030;
    static int anInt3031;
    int anInt3032;
    int anInt3033 = -1;
    static int anInt3034;
    private byte aByte3035;
    int anInt3036;
    private short[] aShortArray3037;
    static IncommingOpcode aIncommingOpcode_3038;
    boolean aBoolean3039;
    private byte aByte3040;
    static int anInt3041;
    int anInt3042;
    int anInt3043;
    private int anInt3044;
    private int anInt3045;
    int[] anIntArray3046;
    int anInt3047;
    static int anInt3048;
    int[] anIntArray3049;
    int anInt3050;
    int anInt3051;
    int anInt3052;
    static int anInt3053;
    private int anInt3054;
    boolean aBoolean3055;
    int anInt3056;
    static int anInt3057;
    private int anInt3058;
    int anInt3059;
    static int anInt3060;
    boolean aBoolean3061;
    boolean aBoolean3062;
    private byte aByte3063;
    boolean aBoolean3064;
    int anInt3065;
    private short[] aShortArray3066;
    static int anInt3067;
    int anInt3068;
    byte[] aByteArray3069;
    int anInt3070;
    int anInt3071;
    private int[] anIntArray3072;
    short[] aShortArray3073;
    private byte aByte3074;
    String[] aStringArray3075;
    boolean aBoolean3076;
    private int anInt3077;
    int anInt3078;
    boolean aBoolean3079;
    int anInt3080;
    private int anInt3081;
    boolean aBoolean3082;
    static byte[][] aByteArrayArray3083 = new byte[250][];
    short[] aShortArray3084;
    boolean aBoolean3085;
    static int anInt3086;
    private int anInt3087;
    boolean aBoolean3088;
    int anInt3089;
    static int anInt3090;
    boolean aBoolean3091;
    int anInt3092;
    int anInt3093;
    static int anInt3094;
    int anInt3095;
    int[] anIntArray3096;
    int anInt3097;
    static int anInt3098;
    int[][] anIntArrayArray3099;
    static int anInt3100;
    private byte aByte3101;
    int anInt3102;
    static int anInt3103;
    boolean aBoolean3104;
    int anInt3105;
    boolean aBoolean3106;
    private int anInt3107;
    static int anInt3108;
    static int anInt3109;
    Class368 aClass368_3110;
    boolean aBoolean3111;
    private int anInt3112;
    private int anInt3113;
    private int anInt3114;
    private int anInt3115;

    final void method2784(boolean bool) {
        if (((ObjectDefinition) this).anInt3105 == -1) {
            ((ObjectDefinition) this).anInt3105 = 0;
            if (((ObjectDefinition) this).aByteArray3069 != null && (((ObjectDefinition) this).aByteArray3069.length ^ 0xffffffff) == -2 && (((ObjectDefinition) this).aByteArray3069[0] ^ 0xffffffff) == -11)
                ((ObjectDefinition) this).anInt3105 = 1;
            for (int i = 0; i < 5; i++) {
                if (((ObjectDefinition) this).aStringArray3075[i] != null) {
                    ((ObjectDefinition) this).anInt3105 = 1;
                    break;
                }
            }
        }
        anInt3034++;
        if (((ObjectDefinition) this).anInt3032 == -1)
            ((ObjectDefinition) this).anInt3032 = (((ObjectDefinition) this).anInt3093 ^ 0xffffffff) != -1 ? 1 : 0;
        if ((((ObjectDefinition) this).anInt3023 ^ 0xffffffff) != 0 || ((ObjectDefinition) this).aBoolean3026 || ((ObjectDefinition) this).anIntArray3049 != null)
            ((ObjectDefinition) this).aBoolean3088 = true;
        if (bool != false)
            ((ObjectDefinition) this).anInt3092 = 43;
    }

    final Class101 method2785(int i, boolean bool, Class21 class21, int i_0_, int i_1_, ha var_ha, byte i_2_, int i_3_, int i_4_, int i_5_, s var_s, s var_s_6_) {
        if (Class133.method1220(i_4_, true))
            i_4_ = 4;
        anInt3090++;
        long l = (long) ((i_4_ << -943563933) + ((((ObjectDefinition) this).anInt3043 << 1433258442) + i));
        l |= (long) (((ha) var_ha).anInt1418 << -1091987331);
        if (class21 != null)
            l |= ((Class21) class21).aLong312 << -907460512;
        int i_7_ = i_0_;
        if ((aByte3035 ^ 0xffffffff) == -4)
            i_7_ |= 0x7;
        else {
            if ((aByte3035 ^ 0xffffffff) != -1 || (anInt3087 ^ 0xffffffff) != -1)
                i_7_ |= 0x2;
            if (anInt3113 != 0)
                i_7_ |= 0x1;
            if (anInt3114 != 0)
                i_7_ |= 0x4;
        }
        if (bool)
            i_7_ |= 0x40000;
        Class101 class101;
        synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4532) {
            class101 = (Class101) ((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4532.method2863(4, l);
            int i_8_ = 65 / ((-81 - i_2_) / 32);
        }
        Class162 class162 = class101 != null ? ((Class101) class101).aClass162_1283 : null;
        r var_r = null;
        if (class162 == null || var_ha.b(class162.ua(), i_7_) != 0) {
            if (class162 != null)
                i_7_ = var_ha.c(i_7_, class162.ua());
            int i_9_ = i_7_;
            if (i_4_ == 10 && (i ^ 0xffffffff) < -4)
                i_9_ |= 0x5;
            class162 = method2790(i, i_4_, (byte) -73, var_ha, i_9_, class21);
            if (class162 == null)
                return null;
            if ((i_4_ ^ 0xffffffff) == -11 && (i ^ 0xffffffff) < -4)
                class162.a(2048);
            if (bool)
                var_r = class162.ba(null);
            class162.s(i_7_);
            class101 = new Class101();
            ((Class101) class101).aR1289 = var_r;
            ((Class101) class101).aClass162_1283 = class162;
            synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4532) {
                ((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4532.method2867((byte) 0, l, class101);
            }
        } else {
            var_r = ((Class101) class101).aR1289;
            class162 = ((Class101) class101).aClass162_1283;
            if (bool && var_r == null)
                var_r = ((Class101) class101).aR1289 = class162.ba(null);
        }
        boolean bool_10_ = aByte3035 != 0 && (var_s != null || var_s_6_ != null);
        boolean bool_11_ = (anInt3113 != 0 || anInt3087 != 0 || (anInt3114 ^ 0xffffffff) != -1);
        if (!bool_10_ && !bool_11_)
            class162 = class162.method1436((byte) 0, i_0_, true);
        else {
            class162 = class162.method1436((byte) 0, i_7_, true);
            if (bool_10_)
                class162.p(aByte3035, anInt3045, var_s, var_s_6_, i_5_, i_1_, i_3_);
            if (bool_11_)
                class162.H(anInt3113, anInt3087, anInt3114);
            class162.s(i_0_);
        }
        ((Class101) NPC.aClass101_10615).aR1289 = var_r;
        ((Class101) NPC.aClass101_10615).aClass162_1283 = class162;
        return NPC.aClass101_10615;
    }

    final Class162 method2786(int i, int i_12_, Class21 class21, int i_13_, int i_14_, int i_15_, s var_s, int i_16_, int i_17_, int i_18_, Class182 class182, s var_s_19_, int i_20_, ha var_ha, int i_21_) {
        anInt3060++;
        if (Class133.method1220(i_14_, true))
            i_14_ = 4;
        long l = (long) ((((ObjectDefinition) this).anInt3043 << 1338743850) + (i_14_ << 1958002051) - -i);
        int i_22_ = i_21_;
        l |= (long) (((ha) var_ha).anInt1418 << -547996195);
        if (class21 != null)
            l |= ((Class21) class21).aLong312 << -945695776;
        if (class182 != null)
            i_21_ |= class182.method1610((byte) -29, false, i_12_, i_20_);
        if ((aByte3035 ^ 0xffffffff) != -4) {
            if ((aByte3035 ^ 0xffffffff) != -1 || (anInt3087 ^ 0xffffffff) != -1)
                i_21_ |= 0x2;
            if ((anInt3113 ^ 0xffffffff) != -1)
                i_21_ |= 0x1;
            if (anInt3114 != 0)
                i_21_ |= 0x4;
        } else
            i_21_ |= 0x7;
        if (i_14_ == 10 && i > 3)
            i_21_ |= 0x5;
        Class162 class162;
        synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4533) {
            class162 = (Class162) ((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4533.method2863(i_18_ + 5, l);
        }
        if (class162 == null || (var_ha.b(class162.ua(), i_21_) ^ 0xffffffff) != -1) {
            if (class162 != null)
                i_21_ = var_ha.c(i_21_, class162.ua());
            class162 = method2790(i, i_14_, (byte) -73, var_ha, i_21_, class21);
            if (class162 == null)
                return null;
            synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4533) {
                ((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4533.method2867((byte) 0, l, class162);
            }
        }
        boolean bool = false;
        if (class182 != null) {
            class162 = class182.method1612((byte) -107, i_15_, i_12_, 0x3 & i, class162, i_21_, i_20_, (byte) 1);
            bool = true;
        }
        if ((i_14_ ^ 0xffffffff) == -11 && (i ^ 0xffffffff) < -4) {
            if (!bool) {
                bool = true;
                class162 = class162.method1436((byte) 3, i_21_, true);
            }
            class162.a(2048);
        }
        if ((aByte3035 ^ 0xffffffff) != -1) {
            if (!bool) {
                class162 = class162.method1436((byte) 3, i_21_, true);
                bool = true;
            }
            class162.p(aByte3035, anInt3045, var_s_19_, var_s, i_13_, i_16_, i_17_);
        }
        if ((anInt3113 ^ 0xffffffff) != i_18_ || (anInt3087 ^ 0xffffffff) != -1 || anInt3114 != 0) {
            if (!bool) {
                bool = true;
                class162 = class162.method1436((byte) 3, i_21_, true);
            }
            class162.H(anInt3113, anInt3087, anInt3114);
        }
        if (bool)
            class162.s(i_22_);
        return class162;
    }

    final void method2787(ByteStream class248_sub9, int i) {
        for (; ; ) {
            int i_23_ = class248_sub9.readUnsignedByte((byte) -88);
            if (i_23_ == 0)
                break;
            method2793(class248_sub9, true, i_23_);
        }
        anInt3086++;
        int i_24_ = -75 % ((i - 10) / 53);
    }

    final boolean method2788(byte i, int i_25_) {
        anInt3027++;
        if (((ObjectDefinition) this).anIntArrayArray3099 == null)
            return true;
        synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass381_4525) {
            for (int i_26_ = 0; ((((ObjectDefinition) this).aByteArray3069.length ^ 0xffffffff) < (i_26_ ^ 0xffffffff)); i_26_++) {
                if (i_25_ == ((ObjectDefinition) this).aByteArray3069[i_26_]) {
                    for (int i_27_ = 0; (((ObjectDefinition) this).anIntArrayArray3099[i_26_].length > i_27_); i_27_++) {
                        if (!((Class368) ((ObjectDefinition) this).aClass368_3110).aClass381_4525.method3915(86, 0, (((ObjectDefinition) this).anIntArrayArray3099[i_26_][i_27_])))
                            return false;
                    }
                    return true;
                }
            }
            if (i != 85)
                aIncommingOpcode_3038 = null;
        }
        return true;
    }

    final int method2789(int i, int i_28_, int i_29_) {
        anInt3030++;
        if (aClass65_3021 == null)
            return i_28_;
        Node_Sub37 class248_sub37 = ((Node_Sub37) aClass65_3021.method501((long) i_29_, (byte) 31));
        if (i >= -66)
            anInt3041 = -121;
        if (class248_sub37 == null)
            return i_28_;
        return ((Node_Sub37) class248_sub37).anInt7261;
    }

    private final Class162 method2790(int i, int i_30_, byte i_31_, ha var_ha, int i_32_, Class21 class21) {
        anInt3020++;
        int i_33_ = anInt3054 + 64;
        if (i_31_ != -73)
            method2796((byte) -119);
        int i_34_ = 850 + anInt3025;
        int i_35_ = i_32_;
        boolean bool = ((ObjectDefinition) this).aBoolean3064 || i_30_ == 2 && i > 3;
        if (bool)
            i_32_ |= 0x10;
        if (i == 0) {
            if (anInt3044 != 128 || (anInt3107 ^ 0xffffffff) != -1)
                i_32_ |= 0x1;
            if ((anInt3058 ^ 0xffffffff) != -129 || (anInt3115 ^ 0xffffffff) != -1)
                i_32_ |= 0x4;
        } else
            i_32_ |= 0xd;
        if (anInt3014 != 128 || anInt3077 != 0)
            i_32_ |= 0x2;
        if (aShortArray3037 != null)
            i_32_ |= 0x4000;
        if (aShortArray3066 != null)
            i_32_ |= 0x8000;
        if ((aByte3074 ^ 0xffffffff) != -1)
            i_32_ |= 0x80000;
        Class162 class162 = null;
        if (((ObjectDefinition) this).aByteArray3069 == null)
            return null;
        int i_36_ = -1;
        for (int i_37_ = 0; i_37_ < ((ObjectDefinition) this).aByteArray3069.length; i_37_++) {
            if (i_30_ == ((ObjectDefinition) this).aByteArray3069[i_37_]) {
                i_36_ = i_37_;
                break;
            }
        }
        if (i_36_ == -1)
            return null;
        int[] is = (class21 != null && ((Class21) class21).anIntArray310 != null ? ((Class21) class21).anIntArray310 : ((ObjectDefinition) this).anIntArrayArray3099[i_36_]);
        int i_38_ = is.length;
        if (i_38_ > 0) {
            long l = (long) ((ha) var_ha).anInt1418;
            for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff); i_39_++)
                l = l * 67783L + (long) is[i_39_];
            synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4531) {
                class162 = (Class162) ((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4531.method2863(i_31_ ^ ~0x4c, l);
            }
            if (class162 != null) {
                if (class162.WA() != i_33_)
                    i_32_ |= 0x1000;
                if ((i_34_ ^ 0xffffffff) != (class162.da() ^ 0xffffffff))
                    i_32_ |= 0x2000;
            }
            if (class162 == null || var_ha.b(class162.ua(), i_32_) != 0) {
                int i_40_ = i_32_ | 0x1f01f;
                if (class162 != null)
                    i_40_ = var_ha.c(i_40_, class162.ua());
                Class343 class343 = null;
                synchronized (Class132.aClass343Array1621) {
                    for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff); i_41_++) {
                        synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass381_4525) {
                            class343 = OutgoingOpcode.method1513(0, (((Class368) (((ObjectDefinition) this).aClass368_3110)).aClass381_4525), -106, 0xffff & is[i_41_]);
                        }
                        if (class343 == null)
                            return null;
                        if (((Class343) class343).anInt4053 < 13)
                            class343.method3497((byte) 1, 2);
                        if ((i_38_ ^ 0xffffffff) < -2)
                            Class132.aClass343Array1621[i_41_] = class343;
                    }
                    if (i_38_ > 1)
                        class343 = new Class343(Class132.aClass343Array1621, i_38_);
                }
                class162 = var_ha.a(class343, i_40_, (((Class368) ((ObjectDefinition) this).aClass368_3110).anInt4535), i_33_, i_34_);
                synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4531) {
                    ((Class368) ((ObjectDefinition) this).aClass368_3110).aClass278_4531.method2867((byte) 0, l, class162);
                }
            }
        }
        if (class162 == null)
            return null;
        Class162 class162_42_ = class162.method1436((byte) 0, i_32_, true);
        if (class162.WA() != i_33_)
            class162_42_.C(i_33_);
        if (i_34_ != class162.da())
            class162_42_.LA(i_34_);
        if (bool)
            class162_42_.v();
        if (i_30_ == 4 && (i ^ 0xffffffff) < -4) {
            class162_42_.k(2048);
            class162_42_.H(180, 0, -180);
        }
        i &= 0x3;
        if ((i ^ 0xffffffff) != -2) {
            if ((i ^ 0xffffffff) != -3) {
                if ((i ^ 0xffffffff) == -4)
                    class162_42_.k(12288);
            } else
                class162_42_.k(8192);
        } else
            class162_42_.k(4096);
        if (aShortArray3037 != null) {
            short[] is_43_;
            if (class21 != null && ((Class21) class21).aShortArray315 != null)
                is_43_ = ((Class21) class21).aShortArray315;
            else
                is_43_ = ((ObjectDefinition) this).aShortArray3073;
            for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (aShortArray3037.length ^ 0xffffffff); i_44_++) {
                if (aByteArray3022 == null || (aByteArray3022.length ^ 0xffffffff) >= (i_44_ ^ 0xffffffff))
                    class162_42_.ia(aShortArray3037[i_44_], is_43_[i_44_]);
                else
                    class162_42_.ia(aShortArray3037[i_44_], (Class147.aShortArray1734[aByteArray3022[i_44_] & 0xff]));
            }
        }
        if (aShortArray3066 != null) {
            short[] is_45_;
            if (class21 != null && ((Class21) class21).aShortArray316 != null)
                is_45_ = ((Class21) class21).aShortArray316;
            else
                is_45_ = ((ObjectDefinition) this).aShortArray3084;
            for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > (aShortArray3066.length ^ 0xffffffff); i_46_++)
                class162_42_.aa(aShortArray3066[i_46_], is_45_[i_46_]);
        }
        if (aByte3074 != 0)
            class162_42_.method1433(aByte3101, aByte3040, aByte3063, aByte3074 & 0xff);
        if (anInt3044 != 128 || (anInt3014 ^ 0xffffffff) != -129 || anInt3058 != 128)
            class162_42_.O(anInt3044, anInt3014, anInt3058);
        if (anInt3107 != 0 || (anInt3077 ^ 0xffffffff) != -1 || anInt3115 != 0)
            class162_42_.H(anInt3107, anInt3077, anInt3115);
        class162_42_.s(i_35_);
        return class162_42_;
    }

    public static void method2791(int i) {
        aByteArrayArray3083 = null;
        aIncommingOpcode_3038 = null;
        if (i != -19550)
            method2795(-99, (byte) -5);
    }

    final boolean method2792(int i) {
        anInt3108++;
        if (((ObjectDefinition) this).anIntArray3049 == null) {
            if (((ObjectDefinition) this).anInt3092 == -1 && ((ObjectDefinition) this).anIntArray3046 == null)
                return false;
            return true;
        }
        for (int i_47_ = 0; i_47_ < ((ObjectDefinition) this).anIntArray3049.length; i_47_++) {
            if (((ObjectDefinition) this).anIntArray3049[i_47_] != -1) {
                ObjectDefinition class266_48_ = (((ObjectDefinition) this).aClass368_3110.method3838((byte) -113, ((ObjectDefinition) this).anIntArray3049[i_47_]));
                if ((((ObjectDefinition) class266_48_).anInt3092 ^ 0xffffffff) != 0 || ((ObjectDefinition) class266_48_).anIntArray3046 != null)
                    return true;
            }
        }
        if (i != -1)
            aByte3101 = (byte) -117;
        return false;
    }

    private final void method2793(ByteStream stream, boolean bool, int opcode) {
        anInt3067++;
        if (opcode != 1 && opcode != 5) {
            if ((opcode ^ 0xffffffff) != -3) {
                if ((opcode ^ 0xffffffff) != -15) {
                    if (opcode == 15)
                        ((ObjectDefinition) this).anInt3065 = stream.readUnsignedByte((byte) 96);
                    else if ((opcode ^ 0xffffffff) == -18) {
                        ((ObjectDefinition) this).anInt3093 = 0;
                        ((ObjectDefinition) this).aBoolean3111 = false;
                    } else if (opcode != 18) {
                        if ((opcode ^ 0xffffffff) == -20)
                            ((ObjectDefinition) this).anInt3105 = stream.readUnsignedByte((byte) 115);
                        else if ((opcode ^ 0xffffffff) == -22)
                            aByte3035 = (byte) 1;
                        else if (opcode == 22)
                            ((ObjectDefinition) this).aBoolean3106 = true;
                        else if (opcode == 23)
                            ((ObjectDefinition) this).anInt3068 = 1;
                        else if ((opcode ^ 0xffffffff) == -25) {
                            ((ObjectDefinition) this).anInt3023 = stream.readShort(-1);
                            if (((ObjectDefinition) this).anInt3023 == 65535)
                                ((ObjectDefinition) this).anInt3023 = -1;
                        } else if ((opcode ^ 0xffffffff) == -28)
                            ((ObjectDefinition) this).anInt3093 = 1;
                        else if ((opcode ^ 0xffffffff) != -29) {
                            if (opcode != 29) {
                                if ((opcode ^ 0xffffffff) == -40)
                                    anInt3025 = 5 * stream.readByte(43);
                                else if (opcode < 30 || (opcode ^ 0xffffffff) <= -36) {
                                    if ((opcode ^ 0xffffffff) != -41) {
                                        if (opcode == 41) {
                                            int i_49_ = stream.readUnsignedByte((byte) 95);
                                            ((ObjectDefinition) this).aShortArray3084 = new short[i_49_];
                                            aShortArray3066 = new short[i_49_];
                                            for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
                                                aShortArray3066[i_50_] = (short) (stream.readShort(-1));
                                                ((ObjectDefinition) this).aShortArray3084[i_50_] = (short) (stream.readShort(-1));
                                            }
                                        } else if (opcode != 42) {
                                            if (opcode == 62)
                                                ((ObjectDefinition) this).aBoolean3064 = true;
                                            else if ((opcode ^ 0xffffffff) != -65) {
                                                if (opcode != 65) {
                                                    if ((opcode ^ 0xffffffff) != -67) {
                                                        if (opcode != 67) {
                                                            if ((opcode ^ 0xffffffff) != -70) {
                                                                if (opcode == 70)
                                                                    anInt3107 = ((stream.readUnsignedShort((byte) -10)) << -317377150);
                                                                else if ((opcode ^ 0xffffffff) == -72)
                                                                    anInt3077 = ((stream.readUnsignedShort((byte) -10)) << 1620898498);
                                                                else if (opcode != 72) {
                                                                    if ((opcode ^ 0xffffffff) != -74) {
                                                                        if (opcode == 74)
                                                                            ((ObjectDefinition) this).aBoolean3082 = true;
                                                                        else if (opcode == 75)
                                                                            ((ObjectDefinition) this).anInt3032 = stream.readUnsignedByte((byte) 80);
                                                                        else if ((opcode ^ 0xffffffff) == -78 || (opcode ^ 0xffffffff) == -93) {
                                                                            anInt3081 = stream.readShort(-1);
                                                                            if ((anInt3081 ^ 0xffffffff) == -65536)
                                                                                anInt3081 = -1;
                                                                            anInt3024 = stream.readShort(-1);
                                                                            if ((anInt3024 ^ 0xffffffff) == -65536)
                                                                                anInt3024 = -1;
                                                                            int i_51_ = -1;
                                                                            if ((opcode ^ 0xffffffff) == -93) {
                                                                                i_51_ = stream.readShort(-1);
                                                                                if (i_51_ == 65535)
                                                                                    i_51_ = -1;
                                                                            }
                                                                            int i_52_ = stream.readUnsignedByte((byte) -121);
                                                                            ((ObjectDefinition) this).anIntArray3049 = new int[2 + i_52_];
                                                                            for (int i_53_ = 0; i_52_ >= i_53_; i_53_++) {
                                                                                ((ObjectDefinition) this).anIntArray3049[i_53_] = stream.readShort(-1);
                                                                                if ((((ObjectDefinition) this).anIntArray3049[i_53_] ^ 0xffffffff) == -65536)
                                                                                    ((ObjectDefinition) this).anIntArray3049[i_53_] = -1;
                                                                            }
                                                                            ((ObjectDefinition) this).anIntArray3049[1 + i_52_] = i_51_;
                                                                        } else if ((opcode ^ 0xffffffff) != -79) {
                                                                            if ((opcode ^ 0xffffffff) == -80) {
                                                                                ((ObjectDefinition) this).anInt3078 = stream.readShort(-1);
                                                                                ((ObjectDefinition) this).anInt3018 = stream.readShort(-1);
                                                                                ((ObjectDefinition) this).anInt3028 = stream.readUnsignedByte((byte) 76);
                                                                                int i_54_ = stream.readUnsignedByte((byte) 70);
                                                                                ((ObjectDefinition) this).anIntArray3046 = new int[i_54_];
                                                                                for (int i_55_ = 0; i_54_ > i_55_; i_55_++)
                                                                                    ((ObjectDefinition) this).anIntArray3046[i_55_] = stream.readShort(-1);
                                                                            } else if ((opcode ^ 0xffffffff) == -82) {
                                                                                aByte3035 = (byte) 2;
                                                                                anInt3045 = 256 * stream.readUnsignedByte((byte) 70);
                                                                            } else if ((opcode ^ 0xffffffff) != -83) {
                                                                                if (opcode == 88)
                                                                                    ((ObjectDefinition) this).aBoolean3085 = false;
                                                                                else if (opcode == 89)
                                                                                    ((ObjectDefinition) this).aBoolean3039 = false;
                                                                                else if (opcode == 91)
                                                                                    ((ObjectDefinition) this).aBoolean3016 = true;
                                                                                else if (opcode == 93) {
                                                                                    aByte3035 = (byte) 3;
                                                                                    anInt3045 = stream.readShort(-1);
                                                                                } else if ((opcode ^ 0xffffffff) == -95)
                                                                                    aByte3035 = (byte) 4;
                                                                                else if ((opcode ^ 0xffffffff) != -96) {
                                                                                    if ((opcode ^ 0xffffffff) != -98) {
                                                                                        if (opcode != 98) {
                                                                                            if ((opcode ^ 0xffffffff) == -100) {
                                                                                                ((ObjectDefinition) this).anInt3089 = stream.readUnsignedByte((byte) 74);
                                                                                                ((ObjectDefinition) this).anInt3102 = stream.readShort(-1);
                                                                                            } else if (opcode == 100) {
                                                                                                ((ObjectDefinition) this).anInt3059 = stream.readUnsignedByte((byte) -19);
                                                                                                ((ObjectDefinition) this).anInt3071 = stream.readShort(-1);
                                                                                            } else if (opcode == 101)
                                                                                                ((ObjectDefinition) this).anInt3056 = stream.readUnsignedByte((byte) 76);
                                                                                            else if ((opcode ^ 0xffffffff) == -103)
                                                                                                ((ObjectDefinition) this).anInt3036 = stream.readShort(-1);
                                                                                            else if (opcode == 103)
                                                                                                ((ObjectDefinition) this).anInt3068 = 0;
                                                                                            else if ((opcode ^ 0xffffffff) == -105)
                                                                                                ((ObjectDefinition) this).anInt3095 = stream.readUnsignedByte((byte) -45);
                                                                                            else if (opcode == 105)
                                                                                                ((ObjectDefinition) this).aBoolean3061 = true;
                                                                                            else if ((opcode ^ 0xffffffff) == -107) {
                                                                                                int i_56_ = stream.readUnsignedByte((byte) -93);
                                                                                                anIntArray3072 = new int[i_56_];
                                                                                                ((ObjectDefinition) this).anIntArray3096 = new int[i_56_];
                                                                                                for (int i_57_ = 0; (i_56_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++) {
                                                                                                    ((ObjectDefinition) this).anIntArray3096[i_57_] = stream.readShort(-1);
                                                                                                    int i_58_ = stream.readUnsignedByte((byte) 115);
                                                                                                    anIntArray3072[i_57_] = i_58_;
                                                                                                    anInt3112 += i_58_;
                                                                                                }
                                                                                            } else if (opcode == 107)
                                                                                                ((ObjectDefinition) this).anInt3033 = stream.readShort(-1);
                                                                                            else if ((opcode ^ 0xffffffff) <= -151 && (opcode ^ 0xffffffff) > -156) {
                                                                                                ((ObjectDefinition) this).aStringArray3075[opcode - 150] = stream.readString(15598);
                                                                                                if (!((Class368) ((ObjectDefinition) this).aClass368_3110).aBoolean4519)
                                                                                                    ((ObjectDefinition) this).aStringArray3075[-150 + opcode] = null;
                                                                                            } else if ((opcode ^ 0xffffffff) != -161) {
                                                                                                if (opcode != 162) {
                                                                                                    if (opcode != 163) {
                                                                                                        if (opcode == 164)
                                                                                                            anInt3113 = stream.readUnsignedShort((byte) -10);
                                                                                                        else if (opcode == 165)
                                                                                                            anInt3087 = stream.readUnsignedShort((byte) -10);
                                                                                                        else if ((opcode ^ 0xffffffff) == -167)
                                                                                                            anInt3114 = stream.readUnsignedShort((byte) -10);
                                                                                                        else if ((opcode ^ 0xffffffff) != -168) {
                                                                                                            if ((opcode ^ 0xffffffff) == -169)
                                                                                                                ((ObjectDefinition) this).aBoolean3079 = true;
                                                                                                            else if ((opcode ^ 0xffffffff) != -170) {
                                                                                                                if (opcode == 170)
                                                                                                                    ((ObjectDefinition) this).anInt3051 = stream.readSmart((byte) 22);
                                                                                                                else if ((opcode ^ 0xffffffff) != -172) {
                                                                                                                    if (opcode == 173) {
                                                                                                                        ((ObjectDefinition) this).anInt3070 = stream.readShort(-1);
                                                                                                                        ((ObjectDefinition) this).anInt3050 = stream.readShort(-1);
                                                                                                                    } else if ((opcode ^ 0xffffffff) != -178) {
                                                                                                                        if (opcode == 178)
                                                                                                                            ((ObjectDefinition) this).anInt3019 = stream.readUnsignedByte((byte) -99);
                                                                                                                        else if ((opcode ^ 0xffffffff) == -250) {
                                                                                                                            int i_59_ = stream.readUnsignedByte((byte) -103);
                                                                                                                            if (aClass65_3021 == null) {
                                                                                                                                int i_60_ = Class136_Sub4.method1269(i_59_, (byte) -128);
                                                                                                                                aClass65_3021 = new Class65(i_60_);
                                                                                                                            }
                                                                                                                            for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > (i_59_ ^ 0xffffffff); i_61_++) {
                                                                                                                                boolean bool_62_ = stream.readUnsignedByte((byte) -113) == 1;
                                                                                                                                int i_63_ = stream.method2221(255);
                                                                                                                                Node node;
                                                                                                                                if (bool_62_)
                                                                                                                                    node = new Node_Sub32(stream.readString(15598));
                                                                                                                                else
                                                                                                                                    node = new Node_Sub37(stream.readInt(false));
                                                                                                                                aClass65_3021.method509(-1, node, (long) i_63_);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        ((ObjectDefinition) this).aBoolean3088 = true;
                                                                                                                } else
                                                                                                                    ((ObjectDefinition) this).anInt3080 = stream.readSmart((byte) 22);
                                                                                                            } else
                                                                                                                ((ObjectDefinition) this).aBoolean3104 = true;
                                                                                                        } else
                                                                                                            ((ObjectDefinition) this).anInt3052 = stream.readShort(-1);
                                                                                                    } else {
                                                                                                        aByte3101 = stream.readByte(99);
                                                                                                        aByte3040 = stream.readByte(80);
                                                                                                        aByte3063 = stream.readByte(112);
                                                                                                        aByte3074 = stream.readByte(78);
                                                                                                    }
                                                                                                } else {
                                                                                                    aByte3035 = (byte) 3;
                                                                                                    anInt3045 = stream.readInt(false);
                                                                                                }
                                                                                            } else {
                                                                                                int i_64_ = stream.readUnsignedByte((byte) -115);
                                                                                                ((ObjectDefinition) this).anIntArray3029 = new int[i_64_];
                                                                                                for (int i_65_ = 0; (i_64_ ^ 0xffffffff) < (i_65_ ^ 0xffffffff); i_65_++)
                                                                                                    ((ObjectDefinition) this).anIntArray3029[i_65_] = stream.readShort(-1);
                                                                                            }
                                                                                        } else
                                                                                            ((ObjectDefinition) this).aBoolean3026 = true;
                                                                                    } else
                                                                                        ((ObjectDefinition) this).aBoolean3055 = true;
                                                                                } else {
                                                                                    aByte3035 = (byte) 5;
                                                                                    anInt3045 = stream.readUnsignedShort((byte) -10);
                                                                                }
                                                                            } else
                                                                                ((ObjectDefinition) this).aBoolean3076 = true;
                                                                        } else {
                                                                            ((ObjectDefinition) this).anInt3092 = stream.readShort(-1);
                                                                            ((ObjectDefinition) this).anInt3028 = stream.readUnsignedByte((byte) -42);
                                                                        }
                                                                    } else
                                                                        ((ObjectDefinition) this).aBoolean3091 = true;
                                                                } else
                                                                    anInt3115 = ((stream.readUnsignedShort((byte) -10)) << -1881581950);
                                                            } else
                                                                ((ObjectDefinition) this).anInt3047 = (stream.readUnsignedByte((byte) 126));
                                                        } else
                                                            anInt3058 = (stream.readShort(-1));
                                                    } else
                                                        anInt3014 = (stream.readShort(-1));
                                                } else
                                                    anInt3044 = stream.readShort(-1);
                                            } else
                                                ((ObjectDefinition) this).aBoolean3062 = false;
                                        } else {
                                            int i_66_ = stream.readUnsignedByte((byte) -103);
                                            aByteArray3022 = new byte[i_66_];
                                            for (int i_67_ = 0; ((i_67_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff)); i_67_++)
                                                aByteArray3022[i_67_] = stream.readByte(84);
                                        }
                                    } else {
                                        int i_68_ = stream.readUnsignedByte((byte) 74);
                                        ((ObjectDefinition) this).aShortArray3073 = new short[i_68_];
                                        aShortArray3037 = new short[i_68_];
                                        for (int i_69_ = 0; i_69_ < i_68_; i_69_++) {
                                            aShortArray3037[i_69_] = (short) stream.readShort(-1);
                                            ((ObjectDefinition) this).aShortArray3073[i_69_] = (short) stream.readShort(-1);
                                        }
                                    }
                                } else
                                    ((ObjectDefinition) this).aStringArray3075[-30 + opcode] = stream.readString(15598);
                            } else
                                anInt3054 = stream.readByte(71);
                        } else
                            ((ObjectDefinition) this).anInt3042 = (stream.readUnsignedByte((byte) 91) << -1958506206);
                    } else
                        ((ObjectDefinition) this).aBoolean3111 = false;
                } else
                    ((ObjectDefinition) this).anInt3097 = stream.readUnsignedByte((byte) 110);
            } else
                ((ObjectDefinition) this).aString3015 = stream.readString(15598);
        } else {
            if (opcode == 5 && ((Class368) ((ObjectDefinition) this).aClass368_3110).aBoolean4514)
                method2799(stream, 2);
            int i_70_ = stream.readUnsignedByte((byte) 123);
            ((ObjectDefinition) this).anIntArrayArray3099 = new int[i_70_][];
            ((ObjectDefinition) this).aByteArray3069 = new byte[i_70_];
            for (int i_71_ = 0; i_70_ > i_71_; i_71_++) {
                ((ObjectDefinition) this).aByteArray3069[i_71_] = stream.readByte(70);
                int i_72_ = stream.readUnsignedByte((byte) -64);
                ((ObjectDefinition) this).anIntArrayArray3099[i_71_] = new int[i_72_];
                for (int i_73_ = 0; i_72_ > i_73_; i_73_++)
                    ((ObjectDefinition) this).anIntArrayArray3099[i_71_][i_73_] = stream.readShort(-1);
            }
            if ((opcode ^ 0xffffffff) == -6 && !((Class368) ((ObjectDefinition) this).aClass368_3110).aBoolean4514)
                method2799(stream, 2);
        }
        if (bool != true)
            aByte3101 = (byte) -59;
    }

    final String method2794(String string, int i, int i_74_) {
        anInt3031++;
        if (aClass65_3021 == null)
            return string;
        if (i > -72)
            aByteArrayArray3083 = null;
        Node_Sub32 class248_sub32 = ((Node_Sub32) aClass65_3021.method501((long) i_74_, (byte) 31));
        if (class248_sub32 == null)
            return string;
        return ((Node_Sub32) class248_sub32).aString7195;
    }

    static final void method2795(int i, byte i_75_) {
        anInt3048++;
        if (i_75_ <= 58)
            anInt3100 = -118;
        if (Class346_Sub7_Sub5_Sub2.method3699(i, (byte) -22)) {
            RSInterface2[] class354s = Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290[i];
            for (int i_76_ = 0; (class354s.length ^ 0xffffffff) < (i_76_ ^ 0xffffffff); i_76_++) {
                RSInterface2 class354 = class354s[i_76_];
                if (class354 != null) {
                    ((RSInterface2) class354).anInt4237 = 0;
                    ((RSInterface2) class354).anInt4282 = 1;
                    ((RSInterface2) class354).anInt4234 = 0;
                }
            }
        }
    }

    final boolean method2796(byte i) {
        anInt3094++;
        if (((ObjectDefinition) this).anIntArrayArray3099 == null)
            return true;
        boolean bool = true;
        if (i != 127)
            anIntArray3072 = null;
        synchronized (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass381_4525) {
            for (int i_77_ = 0; i_77_ < ((ObjectDefinition) this).anIntArrayArray3099.length; i_77_++) {
                for (int i_78_ = 0; ((i_78_ ^ 0xffffffff) > (((ObjectDefinition) this).anIntArrayArray3099[i_77_].length ^ 0xffffffff)); i_78_++)
                    bool &= (((Class368) ((ObjectDefinition) this).aClass368_3110).aClass381_4525.method3915(48, 0, (((ObjectDefinition) this).anIntArrayArray3099[i_77_][i_78_])));
            }
        }
        return bool;
    }

    final ObjectDefinition method2797(Interface3 interface3, int i) {
        anInt3098++;
        int i_79_ = -1;
        if (anInt3081 == -1) {
            if ((anInt3024 ^ 0xffffffff) != 0)
                i_79_ = interface3.method11(anInt3024, (byte) 87);
        } else
            i_79_ = interface3.method10(anInt3081, (byte) -120);
        if ((i_79_ ^ 0xffffffff) > -1 || ((((ObjectDefinition) this).anIntArray3049.length + -1 ^ 0xffffffff) >= (i_79_ ^ 0xffffffff)) || (((ObjectDefinition) this).anIntArray3049[i_79_] ^ 0xffffffff) == 0) {
            int i_80_ = (((ObjectDefinition) this).anIntArray3049[-1 + ((ObjectDefinition) this).anIntArray3049.length]);
            if (i_80_ != -1)
                return ((ObjectDefinition) this).aClass368_3110.method3838((byte) -112, i_80_);
            return null;
        }
        if (i < 119)
            ((ObjectDefinition) this).aBoolean3106 = true;
        return ((ObjectDefinition) this).aClass368_3110.method3838((byte) -106, (((ObjectDefinition) this).anIntArray3049[i_79_]));
    }

    final int method2798(boolean bool) {
        if (bool != false)
            ((ObjectDefinition) this).aStringArray3075 = null;
        anInt3103++;
        if (((ObjectDefinition) this).anIntArray3096 != null) {
            int i = (int) (Math.random() * (double) anInt3112);
            int i_81_;
            for (i_81_ = 0; (anIntArray3072[i_81_] ^ 0xffffffff) >= (i ^ 0xffffffff); i_81_++)
                i -= anIntArray3072[i_81_];
            return ((ObjectDefinition) this).anIntArray3096[i_81_];
        }
        return -1;
    }

    private final void method2799(ByteStream class248_sub9, int i) {
        anInt3053++;
        int i_82_ = class248_sub9.readUnsignedByte((byte) 127);
        int i_83_ = 0;
        if (i != 2)
            method2790(115, -51, (byte) -48, null, 98, null);
        for (/**/; i_83_ < i_82_; i_83_++) {
            ((ByteStream) class248_sub9).offset++;
            int i_84_ = class248_sub9.readUnsignedByte((byte) 74);
            ((ByteStream) class248_sub9).offset += i_84_ * 2;
        }
    }

    final boolean method2800(int i, byte i_85_) {
        anInt3057++;
        if ((i ^ 0xffffffff) == 0)
            return false;
        if (((ObjectDefinition) this).anInt3023 == i)
            return true;
        if (((ObjectDefinition) this).anIntArray3096 != null) {
            for (int i_86_ = 0; ((((ObjectDefinition) this).anIntArray3096.length ^ 0xffffffff) < (i_86_ ^ 0xffffffff)); i_86_++) {
                if ((i ^ 0xffffffff) == (((ObjectDefinition) this).anIntArray3096[i_86_] ^ 0xffffffff))
                    return true;
            }
        }
        if (i_85_ != 28)
            anInt3112 = -23;
        return false;
    }

    static final void method2801(byte i, int i_87_) {
        anInt3109++;
        Node_Sub28.anInt7166 = 3;
        int i_88_ = 68 % ((-52 - i) / 63);
        Class177.anInt2067 = -1;
        Class55.anInt733 = i_87_;
        Class282_Sub1.anInt7595 = 100;
    }

    public ObjectDefinition() {
        anInt3024 = -1;
        anInt3045 = -1;
        ((ObjectDefinition) this).aBoolean3039 = true;
        ((ObjectDefinition) this).anInt3051 = 960;
        ((ObjectDefinition) this).aBoolean3026 = false;
        ((ObjectDefinition) this).aBoolean3016 = false;
        ((ObjectDefinition) this).anInt3050 = 256;
        anInt3054 = 0;
        ((ObjectDefinition) this).anInt3068 = -1;
        ((ObjectDefinition) this).anInt3042 = 64;
        ((ObjectDefinition) this).anInt3019 = 0;
        ((ObjectDefinition) this).anInt3070 = 256;
        aByte3035 = (byte) 0;
        ((ObjectDefinition) this).aBoolean3062 = true;
        ((ObjectDefinition) this).aBoolean3055 = false;
        ((ObjectDefinition) this).anInt3078 = 0;
        ((ObjectDefinition) this).anInt3047 = 0;
        ((ObjectDefinition) this).aBoolean3064 = false;
        ((ObjectDefinition) this).aBoolean3061 = false;
        anInt3081 = -1;
        anInt3058 = 128;
        ((ObjectDefinition) this).anInt3056 = 0;
        ((ObjectDefinition) this).aBoolean3082 = false;
        anIntArray3072 = null;
        anInt3077 = 0;
        ((ObjectDefinition) this).aBoolean3085 = true;
        ((ObjectDefinition) this).anInt3089 = -1;
        anInt3014 = 128;
        ((ObjectDefinition) this).anInt3018 = 0;
        ((ObjectDefinition) this).aBoolean3091 = false;
        ((ObjectDefinition) this).aBoolean3076 = false;
        ((ObjectDefinition) this).anInt3093 = 2;
        ((ObjectDefinition) this).anInt3071 = -1;
        anInt3087 = 0;
        ((ObjectDefinition) this).anInt3023 = -1;
        anInt3025 = 0;
        ((ObjectDefinition) this).anInt3095 = 255;
        ((ObjectDefinition) this).aStringArray3075 = new String[5];
        ((ObjectDefinition) this).anInt3105 = -1;
        ((ObjectDefinition) this).aBoolean3088 = false;
        ((ObjectDefinition) this).anInt3065 = 1;
        aByte3074 = (byte) 0;
        ((ObjectDefinition) this).anIntArray3096 = null;
        ((ObjectDefinition) this).anInt3092 = -1;
        ((ObjectDefinition) this).anInt3080 = 0;
        ((ObjectDefinition) this).anInt3052 = 0;
        anInt3107 = 0;
        ((ObjectDefinition) this).anInt3036 = -1;
        ((ObjectDefinition) this).anInt3102 = -1;
        ((ObjectDefinition) this).aBoolean3104 = false;
        ((ObjectDefinition) this).anInt3032 = -1;
        anInt3112 = 0;
        ((ObjectDefinition) this).aBoolean3106 = false;
        ((ObjectDefinition) this).anInt3059 = -1;
        anInt3044 = 128;
        ((ObjectDefinition) this).anInt3097 = 1;
        ((ObjectDefinition) this).aBoolean3079 = false;
        anInt3115 = 0;
        ((ObjectDefinition) this).aBoolean3111 = true;
        anInt3113 = 0;
        anInt3114 = 0;
    }

    static {
        anInt3041 = 7000;
        anInt3100 = anInt3041;
        aIncommingOpcode_3038 = new IncommingOpcode(27, 2);
    }
}
