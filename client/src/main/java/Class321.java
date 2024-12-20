/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class321 {
    private int anInt3696;
    private int anInt3697;
    int anInt3698;
    int anInt3699;
    static int anInt3700;
    String[] aStringArray3701;
    String aString3702;
    int anInt3703;
    String[] aStringArray3704;
    private int anInt3705;
    private int anInt3706 = 0;
    int anInt3707;
    static int anInt3708;
    private int anInt3709;
    static int anInt3710;
    int anInt3711 = 0;
    private int anInt3712;
    int anInt3713;
    Class342 aClass342_3714;
    private short[] aShortArray3715;
    private int anInt3716;
    static int anInt3717;
    private int anInt3718 = 0;
    private int anInt3719;
    private int anInt3720;
    private int anInt3721;
    private short[] aShortArray3722;
    int anInt3723;
    int anInt3724;
    int anInt3725;
    private short[] aShortArray3726;
    static int anInt3727;
    int anInt3728;
    int anInt3729;
    int anInt3730;
    private int anInt3731;
    int anInt3732;
    static int anInt3733;
    int anInt3734;
    int anInt3735;
    static int anInt3736;
    static int anInt3737;
    boolean aBoolean3738;
    static Class64 aClass64_3739 = new Class64();
    static int anInt3740;
    static int anInt3741;
    int anInt3742;
    private int anInt3743;
    static int anInt3744;
    int anInt3745;
    static int anInt3746;
    int anInt3747;
    int anInt3748;
    private byte[] aByteArray3749;
    static int anInt3750;
    int anInt3751;
    private int anInt3752;
    int anInt3753;
    boolean aBoolean3754;
    private int anInt3755;
    private int anInt3756;
    static int anInt3757;
    static int anInt3758;
    int anInt3759;
    private int anInt3760;
    int[] anIntArray3761;
    static int loginStage = 0;
    private int anInt3763;
    private short[] aShortArray3764;
    static double aDouble3765;
    static int anInt3766;
    Class65 aClass65_3767;
    int anInt3768;
    private int anInt3769;
    int anInt3770;
    int anInt3771;
    static int anInt3772;
    int anInt3773;
    int[] anIntArray3774;
    int anInt3775;
    private int anInt3776;
    static int anInt3777;
    int anInt3778;
    int[] anIntArray3779;
    static int anInt3780;
    int anInt3781;

    private final String method3323(byte i, int i_0_) {
        if (i != -118)
            anInt3769 = 118;
        anInt3736++;
        if (i_0_ < 100000)
            return "<col=ffff00>" + i_0_ + "</col>";
        if (i_0_ < 10000000)
            return ("<col=ffffff>" + i_0_ / 1000 + Class41.aClass41_502.method301((((Class342) (((Class321) this).aClass342_3714)).anInt4001), (byte) -108) + "</col>");
        return ("<col=00ff80>" + i_0_ / 1000000 + Class41.aClass41_500.method301(((Class342) (((Class321) this).aClass342_3714)).anInt4001, (byte) -108) + "</col>");
    }

    public static void method3324(boolean bool) {
        if (bool != true)
            aClass64_3739 = null;
        aClass64_3739 = null;
    }

    final boolean method3325(boolean bool, boolean bool_1_) {
        anInt3746++;
        int i = ((Class321) this).anInt3713;
        int i_2_ = anInt3769;
        int i_3_ = anInt3776;
        if (bool_1_) {
            i_2_ = anInt3755;
            i_3_ = anInt3763;
            i = ((Class321) this).anInt3725;
        }
        if (i == -1)
            return true;
        boolean bool_4_ = bool;
        if (!((Class342) ((Class321) this).aClass342_3714).aClass381_3999.method3915(77, 0, i))
            bool_4_ = false;
        if (i_2_ != -1 && !((Class342) ((Class321) this).aClass342_3714).aClass381_3999.method3915(103, 0, i_2_))
            bool_4_ = false;
        if (i_3_ != -1 && !((Class342) ((Class321) this).aClass342_3714).aClass381_3999.method3915(96, 0, i_3_))
            bool_4_ = false;
        return bool_4_;
    }

    final int[] method3326(ha var_ha, int i, Class48 class48, int i_5_, ha var_ha_6_, int i_7_, Class332 class332, boolean bool, int i_8_, int i_9_) {
        anInt3710++;
        Class343 class343 = OutgoingOpcode.method1513(0, (((Class342) ((Class321) this).aClass342_3714).aClass381_3999), -106, anInt3697);
        if (class343 == null)
            return null;
        if ((((Class343) class343).anInt4053 ^ 0xffffffff) > -14)
            class343.method3497((byte) 1, 2);
        if (aShortArray3764 != null) {
            for (int i_10_ = 0; (aShortArray3764.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
                if (aByteArray3749 != null && (aByteArray3749.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
                    class343.method3509((Class192.aShortArray2217[aByteArray3749[i_10_] & 0xff]), (byte) -119, aShortArray3764[i_10_]);
                else
                    class343.method3509(aShortArray3715[i_10_], (byte) -119, aShortArray3764[i_10_]);
            }
        }
        if (aShortArray3722 != null) {
            for (int i_11_ = 0; aShortArray3722.length > i_11_; i_11_++)
                class343.method3511((byte) 109, aShortArray3722[i_11_], aShortArray3726[i_11_]);
        }
        if (class332 != null) {
            for (int i_12_ = 0; i_12_ < 5; i_12_++) {
                for (int i_13_ = 0; i_13_ < Class226_Sub2.aShortArrayArrayArray6667.length; i_13_++) {
                    if ((Class226_Sub2.aShortArrayArrayArray6667[i_13_][i_12_]).length > ((Class332) class332).colors[i_12_])
                        class343.method3509((Class226_Sub2.aShortArrayArrayArray6667[i_13_][i_12_][(((Class332) class332).colors[i_12_])]), (byte) -119, (Class205.aShortArrayArray2388[i_13_][i_12_]));
                }
            }
        }
        int i_14_ = 2048;
        boolean bool_15_ = false;
        if ((anInt3705 ^ 0xffffffff) != -129 || anInt3760 != 128 || (anInt3709 ^ 0xffffffff) != -129) {
            bool_15_ = true;
            i_14_ |= 0x7;
        }
        Class162 class162 = var_ha.a(class343, i_14_, 64, anInt3752 + 64, anInt3731 + 768);
        if (!class162.method1422())
            return null;
        if (bool_15_)
            class162.O(anInt3705, anInt3760, anInt3709);
        Class129 class129 = null;
        if ((((Class321) this).anInt3747 ^ 0xffffffff) != 0) {
            class129 = (((Class321) this).aClass342_3714.method3486(true, class332, var_ha_6_, true, 0, var_ha, 64, 1, 0, class48, ((Class321) this).anInt3732, 10));
            if (class129 == null)
                return null;
        } else if (((Class321) this).anInt3775 != -1) {
            class129 = (((Class321) this).aClass342_3714.method3486(true, class332, var_ha_6_, false, i_7_, var_ha, 43, i_9_, 0, class48, ((Class321) this).anInt3759, i_5_));
            if (class129 == null)
                return null;
        } else if ((((Class321) this).anInt3735 ^ 0xffffffff) != 0) {
            class129 = (((Class321) this).aClass342_3714.method3486(true, class332, var_ha_6_, false, i_7_, var_ha, 36, i_9_, 0, class48, ((Class321) this).anInt3773, i_5_));
            if (class129 == null)
                return null;
        }
        int i_16_;
        if (!bool) {
            if ((i_9_ ^ 0xffffffff) == -3)
                i_16_ = ((int) ((double) ((Class321) this).anInt3707 * 1.04) << -805989822);
            else
                i_16_ = ((Class321) this).anInt3707 << -719408862;
        } else
            i_16_ = ((int) (1.5 * (double) ((Class321) this).anInt3707) << -1114669054);
        var_ha.DA(16, 16, 512, 512);
        int i_17_ = -66 / ((-71 - i_8_) / 43);
        Viewport viewport = var_ha.e();
        viewport.method1866();
        var_ha.a(viewport);
        var_ha.xa(1.0F);
        var_ha.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        Viewport viewport_18_ = var_ha.o();
        viewport_18_.method1864(-((Class321) this).anInt3748 << 159562627);
        viewport_18_.method1858(((Class321) this).anInt3742 << 1994042915);
        viewport_18_.method1862(((Class321) this).anInt3711 << -1424778558, ((((Node_Sub9_Sub1.anIntArray9106[((Class321) this).anInt3781 << 565141027]) * i_16_) >> 610519310) - (class162.fa() / 2 + -(((Class321) this).anInt3724 << 378655298))), ((((Class321) this).anInt3724 << 2050473378) + (i_16_ * (Node_Sub9_Sub1.anIntArray9109[(((Class321) this).anInt3781 << -704543325)]) >> 801062862)));
        viewport_18_.method1873(((Class321) this).anInt3781 << 657124291);
        int i_19_ = var_ha.i();
        int i_20_ = var_ha.XA();
        var_ha.f(50, 2147483647);
        var_ha.ya();
        var_ha.la();
        var_ha.aa(0, 0, 36, 32, 0, 0);
        class162.method1440(viewport_18_, null, 1);
        var_ha.f(i_19_, i_20_);
        int[] is = var_ha.na(0, 0, 36, 32);
        if ((i_9_ ^ 0xffffffff) <= -2) {
            is = method3335(-16777214, (byte) 112, is);
            if ((i_9_ ^ 0xffffffff) <= -3)
                is = method3335(-1, (byte) 39, is);
        }
        if ((i_7_ ^ 0xffffffff) != -1)
            method3328(i_7_, is, -12989);
        var_ha.method813(32, (byte) 99, 36, is, 0, 36).method1168(0, 0);
        if (((Class321) this).anInt3747 == -1) {
            if (((Class321) this).anInt3775 == -1) {
                if (((Class321) this).anInt3735 != -1)
                    class129.method1168(0, 0);
            } else
                class129.method1168(0, 0);
        } else
            class129.method1168(0, 0);
        if ((i ^ 0xffffffff) == -2 || (i == 2 && (((Class321) this).anInt3771 == 1 || (i_5_ ^ 0xffffffff) != -2) && (i_5_ ^ 0xffffffff) != 0))
            class48.method369(true, 0, method3323((byte) -118, i_5_), 9, -16777215, -256);
        is = var_ha.na(0, 0, 36, 32);
        for (int i_21_ = 0; is.length > i_21_; i_21_++) {
            if ((is[i_21_] & 0xffffff) != 0)
                is[i_21_] = Class358.retrieveLooksSettings(is[i_21_], -16777216);
            else
                is[i_21_] = 0;
        }
        return is;
    }

    final Class343 method3327(int i, boolean bool) {
        anInt3741++;
        int i_22_ = ((Class321) this).anInt3713;
        int i_23_ = anInt3769;
        int i_24_ = anInt3776;
        if (i != 15580)
            return null;
        if (bool) {
            i_22_ = ((Class321) this).anInt3725;
            i_24_ = anInt3763;
            i_23_ = anInt3755;
        }
        if (i_22_ == -1)
            return null;
        Class343 class343 = OutgoingOpcode.method1513(0, (((Class342) ((Class321) this).aClass342_3714).aClass381_3999), -106, i_22_);
        if ((((Class343) class343).anInt4053 ^ 0xffffffff) > -14)
            class343.method3497((byte) 1, 2);
        if ((i_23_ ^ 0xffffffff) != 0) {
            Class343 class343_25_ = OutgoingOpcode.method1513(0, (((Class342) ((Class321) this).aClass342_3714).aClass381_3999), -106, i_23_);
            if ((((Class343) class343_25_).anInt4053 ^ 0xffffffff) > -14)
                class343_25_.method3497((byte) 1, 2);
            if (i_24_ == -1) {
                Class343[] class343s = {class343, class343_25_};
                class343 = new Class343(class343s, 2);
            } else {
                Class343 class343_26_ = OutgoingOpcode.method1513(0, (((Class342) (((Class321) this).aClass342_3714)).aClass381_3999), -106, i_24_);
                if ((((Class343) class343_26_).anInt4053 ^ 0xffffffff) > -14)
                    class343_26_.method3497((byte) 1, 2);
                Class343[] class343s = {class343, class343_25_, class343_26_};
                class343 = new Class343(class343s, 3);
            }
        }
        if (class343 == null)
            return null;
        if (!bool && (anInt3719 != 0 || (anInt3720 ^ 0xffffffff) != -1 || anInt3743 != 0))
            class343.method3496(anInt3719, anInt3720, 0, anInt3743);
        if (bool && (anInt3696 != 0 || anInt3718 != 0 || (anInt3706 ^ 0xffffffff) != -1))
            class343.method3496(anInt3696, anInt3718, 0, anInt3706);
        if (aShortArray3764 != null) {
            for (int i_27_ = 0; i_27_ < aShortArray3764.length; i_27_++)
                class343.method3509(aShortArray3715[i_27_], (byte) -119, aShortArray3764[i_27_]);
        }
        if (aShortArray3722 != null) {
            for (int i_28_ = 0; (aShortArray3722.length ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++)
                class343.method3511((byte) 97, aShortArray3722[i_28_], aShortArray3726[i_28_]);
        }
        return class343;
    }

    private final void method3328(int i, int[] is, int i_29_) {
        if (i_29_ == -12989) {
            for (int i_30_ = 31; (i_30_ ^ 0xffffffff) < -1; i_30_--) {
                int i_31_ = i_30_ * 36;
                for (int i_32_ = 35; (i_32_ ^ 0xffffffff) < -1; i_32_--) {
                    if (is[i_31_ + i_32_] == 0 && (is[-36 + i_32_ - -i_31_ + -1] ^ 0xffffffff) != -1)
                        is[i_31_ + i_32_] = i;
                }
            }
            anInt3758++;
        }
    }

    final void method3329(byte i, ByteStream class248_sub9) {
        anInt3766++;
        for (; ; ) {
            int i_33_ = class248_sub9.readUnsignedByte((byte) 114);
            if (i_33_ == 0)
                break;
            method3332(i_33_, class248_sub9, 10);
        }
        if (i != -33)
            method3341(-20, 86, 113);
    }

    final void method3330(byte i, Class321 class321_34_, Class321 class321_35_) {
        anInt3697 = class321_35_.anInt3697;
        ((Class321) this).anInt3723 = ((Class321) class321_34_).anInt3723;
        anInt3719 = class321_34_.anInt3719;
        anInt3763 = class321_34_.anInt3763;
        anInt3776 = class321_34_.anInt3776;
        ((Class321) this).anInt3742 = ((Class321) class321_35_).anInt3742;
        aShortArray3715 = class321_34_.aShortArray3715;
        anInt3716 = class321_34_.anInt3716;
        ((Class321) this).anInt3725 = ((Class321) class321_34_).anInt3725;
        anInt3743 = class321_34_.anInt3743;
        ((Class321) this).aString3702 = ((Class321) class321_34_).aString3702;
        anInt3780++;
        aShortArray3722 = class321_34_.aShortArray3722;
        ((Class321) this).anInt3753 = 0;
        ((Class321) this).aClass65_3767 = ((Class321) class321_34_).aClass65_3767;
        int i_36_ = -73 / ((57 - i) / 36);
        anInt3706 = class321_34_.anInt3706;
        anInt3696 = class321_34_.anInt3696;
        anInt3712 = class321_34_.anInt3712;
        anInt3756 = class321_34_.anInt3756;
        ((Class321) this).anInt3748 = ((Class321) class321_35_).anInt3748;
        aShortArray3726 = class321_34_.aShortArray3726;
        ((Class321) this).anInt3707 = ((Class321) class321_35_).anInt3707;
        ((Class321) this).aStringArray3701 = new String[5];
        anInt3721 = class321_34_.anInt3721;
        anInt3718 = class321_34_.anInt3718;
        ((Class321) this).anInt3711 = ((Class321) class321_35_).anInt3711;
        ((Class321) this).anInt3781 = ((Class321) class321_35_).anInt3781;
        aByteArray3749 = class321_34_.aByteArray3749;
        anInt3769 = class321_34_.anInt3769;
        aShortArray3764 = class321_34_.aShortArray3764;
        anInt3755 = class321_34_.anInt3755;
        ((Class321) this).anInt3713 = ((Class321) class321_34_).anInt3713;
        ((Class321) this).anInt3771 = ((Class321) class321_34_).anInt3771;
        ((Class321) this).aStringArray3704 = ((Class321) class321_34_).aStringArray3704;
        ((Class321) this).aBoolean3738 = ((Class321) class321_34_).aBoolean3738;
        ((Class321) this).anInt3724 = ((Class321) class321_35_).anInt3724;
        anInt3720 = class321_34_.anInt3720;
        if (((Class321) class321_34_).aStringArray3701 != null) {
            for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > -5; i_37_++)
                ((Class321) this).aStringArray3701[i_37_] = ((Class321) class321_34_).aStringArray3701[i_37_];
        }
        ((Class321) this).aStringArray3701[4] = Class41.aClass41_472.method301((((Class342) (((Class321) this).aClass342_3714)).anInt4001), (byte) -108);
    }

    final void method3331(int i) {
        if (i == -122)
            anInt3708++;
    }

    private final void method3332(int i, ByteStream class248_sub9, int i_38_) {
        if (anInt3751 == 12273)
            System.out.println(anInt3751 + ", " + i);
        if (i_38_ != 10)
            ((Class321) this).anInt3699 = 60;
        if (i != 1) {
            if ((i ^ 0xffffffff) == -3)
                ((Class321) this).aString3702 = class248_sub9.readString(15598);
            else if ((i ^ 0xffffffff) != -5) {
                if (i == 5)
                    ((Class321) this).anInt3781 = class248_sub9.readShort(-1);
                else if (i != 6) {
                    if (i != 7) {
                        if (i == 8) {
                            ((Class321) this).anInt3724 = class248_sub9.readShort(-1);
                            if (((Class321) this).anInt3724 > 32767)
                                ((Class321) this).anInt3724 -= 65536;
                        } else if (i == 11)
                            ((Class321) this).anInt3771 = 1;
                        else if ((i ^ 0xffffffff) != -13) {
                            if ((i ^ 0xffffffff) == -17)
                                ((Class321) this).aBoolean3738 = true;
                            else if ((i ^ 0xffffffff) != -19) {
                                if ((i ^ 0xffffffff) == -24)
                                    ((Class321) this).anInt3713 = class248_sub9.readShort(-1);
                                else if (i != 24) {
                                    if ((i ^ 0xffffffff) != -26) {
                                        if (i != 26) {
                                            if ((i ^ 0xffffffff) > -31 || i >= 35) {
                                                if ((i ^ 0xffffffff) > -36 || ((i ^ 0xffffffff) <= -41)) {
                                                    if ((i ^ 0xffffffff) == -41) {
                                                        int i_39_ = (class248_sub9.readUnsignedByte((byte) -57));
                                                        aShortArray3715 = new short[i_39_];
                                                        aShortArray3764 = new short[i_39_];
                                                        for (int i_40_ = 0; i_39_ > i_40_; i_40_++) {
                                                            aShortArray3764[i_40_] = (short) (class248_sub9.readShort(-1));
                                                            aShortArray3715[i_40_] = (short) (class248_sub9.readShort(-1));
                                                        }
                                                    } else if (i != 41) {
                                                        if ((i ^ 0xffffffff) != -43) {
                                                            if (i == 65)
                                                                ((Class321) this).aBoolean3754 = true;
                                                            else if (i != 78) {
                                                                if ((i ^ 0xffffffff) == -80)
                                                                    anInt3763 = (class248_sub9.readShort(-1));
                                                                else if ((i ^ 0xffffffff) != -91) {
                                                                    if (i == 91)
                                                                        anInt3721 = class248_sub9.readShort(-1);
                                                                    else if ((i ^ 0xffffffff) == -93)
                                                                        anInt3756 = class248_sub9.readShort(i_38_ + -11);
                                                                    else if (i != 93) {
                                                                        if (i != 95) {
                                                                            if ((i ^ 0xffffffff) == -97)
                                                                                ((Class321) this).anInt3768 = class248_sub9.readUnsignedByte((byte) -24);
                                                                            else if ((i ^ 0xffffffff) != -98) {
                                                                                if (i != 98) {
                                                                                    if ((i ^ 0xffffffff) <= -101 && (i ^ 0xffffffff) > -111) {
                                                                                        if (((Class321) this).anIntArray3774 == null) {
                                                                                            ((Class321) this).anIntArray3774 = new int[10];
                                                                                            ((Class321) this).anIntArray3779 = new int[10];
                                                                                        }
                                                                                        ((Class321) this).anIntArray3774[-100 + i] = class248_sub9.readShort(Class316_Sub1.method3291(i_38_, -11));
                                                                                        ((Class321) this).anIntArray3779[i + -100] = class248_sub9.readShort(-1);
                                                                                    } else if ((i ^ 0xffffffff) != -111) {
                                                                                        if (i != 111) {
                                                                                            if (i != 112) {
                                                                                                if (i == 113)
                                                                                                    anInt3752 = class248_sub9.readByte(121);
                                                                                                else if (i != 114) {
                                                                                                    if ((i ^ 0xffffffff) == -116)
                                                                                                        ((Class321) this).anInt3723 = class248_sub9.readUnsignedByte((byte) 100);
                                                                                                    else if ((i ^ 0xffffffff) != -122) {
                                                                                                        if (i != 122) {
                                                                                                            if (i == 125) {
                                                                                                                anInt3719 = class248_sub9.readByte(101) << 321684770;
                                                                                                                anInt3720 = class248_sub9.readByte(56) << -45722302;
                                                                                                                anInt3743 = class248_sub9.readByte(77) << 370725122;
                                                                                                            } else if (i == 126) {
                                                                                                                anInt3696 = class248_sub9.readByte(114) << -1954403902;
                                                                                                                anInt3718 = class248_sub9.readByte(i_38_ ^ 0x36) << 1291279586;
                                                                                                                anInt3706 = class248_sub9.readByte(i_38_ + 59) << 2092885506;
                                                                                                            } else if (i != 127) {
                                                                                                                if (i == 128) {
                                                                                                                    ((Class321) this).anInt3698 = class248_sub9.readUnsignedByte((byte) 119);
                                                                                                                    ((Class321) this).anInt3703 = class248_sub9.readShort(i_38_ + -11);
                                                                                                                } else if ((i ^ 0xffffffff) == -130) {
                                                                                                                    ((Class321) this).anInt3699 = class248_sub9.readUnsignedByte((byte) -90);
                                                                                                                    ((Class321) this).anInt3730 = class248_sub9.readShort(-1);
                                                                                                                } else if (i == 130) {
                                                                                                                    ((Class321) this).anInt3729 = class248_sub9.readUnsignedByte((byte) 76);
                                                                                                                    ((Class321) this).anInt3770 = class248_sub9.readShort(-1);
                                                                                                                } else if (i != 132) {
                                                                                                                    if ((i ^ 0xffffffff) != -135) {
                                                                                                                        if ((i ^ 0xffffffff) != -140) {
                                                                                                                            if ((i ^ 0xffffffff) == -141)
                                                                                                                                ((Class321) this).anInt3735 = class248_sub9.readShort(-1);
                                                                                                                            else if ((i ^ 0xffffffff) == -250) {
                                                                                                                                int i_41_ = class248_sub9.readUnsignedByte((byte) 122);
                                                                                                                                if (((Class321) this).aClass65_3767 == null) {
                                                                                                                                    int i_42_ = Class136_Sub4.method1269(i_41_, (byte) -128);
                                                                                                                                    ((Class321) this).aClass65_3767 = new Class65(i_42_);
                                                                                                                                }
                                                                                                                                for (int i_43_ = 0; i_41_ > i_43_; i_43_++) {
                                                                                                                                    boolean bool = class248_sub9.readUnsignedByte((byte) 81) == 1;
                                                                                                                                    int i_44_ = class248_sub9.method2221(255);
                                                                                                                                    Node node;
                                                                                                                                    if (bool)
                                                                                                                                        node = new Node_Sub32(class248_sub9.readString(i_38_ + 15588));
                                                                                                                                    else
                                                                                                                                        node = new Node_Sub37(class248_sub9.readInt(false));
                                                                                                                                    ((Class321) this).aClass65_3767.method509(i_38_ + -11, node, (long) i_44_);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else
                                                                                                                            ((Class321) this).anInt3773 = class248_sub9.readShort(-1);
                                                                                                                    } else
                                                                                                                        ((Class321) this).anInt3745 = class248_sub9.readUnsignedByte((byte) -62);
                                                                                                                } else {
                                                                                                                    int i_45_ = class248_sub9.readUnsignedByte((byte) -45);
                                                                                                                    ((Class321) this).anIntArray3761 = new int[i_45_];
                                                                                                                    for (int i_46_ = 0; (i_45_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++)
                                                                                                                        ((Class321) this).anIntArray3761[i_46_] = class248_sub9.readShort(-1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                ((Class321) this).anInt3728 = class248_sub9.readUnsignedByte((byte) -82);
                                                                                                                ((Class321) this).anInt3734 = class248_sub9.readShort(-1);
                                                                                                            }
                                                                                                        } else
                                                                                                            ((Class321) this).anInt3775 = class248_sub9.readShort(-1);
                                                                                                    } else
                                                                                                        ((Class321) this).anInt3759 = class248_sub9.readShort(i_38_ ^ ~0xa);
                                                                                                } else
                                                                                                    anInt3731 = class248_sub9.readByte(101) * 5;
                                                                                            } else
                                                                                                anInt3709 = class248_sub9.readShort(-1);
                                                                                        } else
                                                                                            anInt3760 = class248_sub9.readShort(-1);
                                                                                    } else
                                                                                        anInt3705 = class248_sub9.readShort(-1);
                                                                                } else
                                                                                    ((Class321) this).anInt3747 = class248_sub9.readShort(-1);
                                                                            } else
                                                                                ((Class321) this).anInt3732 = class248_sub9.readShort(-1);
                                                                        } else
                                                                            ((Class321) this).anInt3748 = class248_sub9.readShort(-1);
                                                                    } else
                                                                        anInt3716 = class248_sub9.readShort(-1);
                                                                } else
                                                                    anInt3712 = (class248_sub9.readShort(-1));
                                                            } else
                                                                anInt3776 = (class248_sub9.readShort(i_38_ ^ ~0xa));
                                                        } else {
                                                            int i_47_ = (class248_sub9.readUnsignedByte((byte) 96));
                                                            aByteArray3749 = (new byte
                                                                    [i_47_]);
                                                            for (int i_48_ = 0; i_47_ > i_48_; i_48_++)
                                                                aByteArray3749[i_48_] = (class248_sub9.readByte(77));
                                                        }
                                                    } else {
                                                        int i_49_ = (class248_sub9.readUnsignedByte((byte) -17));
                                                        aShortArray3726 = new short[i_49_];
                                                        aShortArray3722 = new short[i_49_];
                                                        for (int i_50_ = 0; ((i_49_ ^ 0xffffffff) < (i_50_ ^ 0xffffffff)); i_50_++) {
                                                            aShortArray3722[i_50_] = (short) (class248_sub9.readShort(Class316_Sub1.method3291(i_38_, -11)));
                                                            aShortArray3726[i_50_] = (short) (class248_sub9.readShort(-1));
                                                        }
                                                    }
                                                } else
                                                    ((Class321) this).aStringArray3701[-35 + i] = (class248_sub9.readString(15598));
                                            } else
                                                ((Class321) this).aStringArray3704[-30 + i] = (class248_sub9.readString(Class316_Sub1.method3291(i_38_, 15588)));
                                        } else
                                            anInt3755 = (class248_sub9.readShort(i_38_ ^ ~0xa));
                                    } else
                                        ((Class321) this).anInt3725 = class248_sub9.readShort(-1);
                                } else
                                    anInt3769 = class248_sub9.readShort(i_38_ ^ ~0xa);
                            } else
                                ((Class321) this).anInt3778 = class248_sub9.readShort(i_38_ + -11);
                        } else
                            ((Class321) this).anInt3753 = class248_sub9.readInt(false);
                    } else {
                        ((Class321) this).anInt3711 = class248_sub9.readShort(-1);
                        if (((Class321) this).anInt3711 > 32767)
                            ((Class321) this).anInt3711 -= 65536;
                    }
                } else
                    ((Class321) this).anInt3742 = class248_sub9.readShort(i_38_ ^ ~0xa);
            } else
                ((Class321) this).anInt3707 = class248_sub9.readShort(i_38_ ^ ~0xa);
        } else
            anInt3697 = class248_sub9.readShort(-1);
        anInt3777++;
    }

    final Class162 method3333(Class182 class182, int i, Class332 class332, ha var_ha, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
        anInt3700++;
        if (((Class321) this).anIntArray3774 != null && i_52_ > 1) {
            int i_56_ = -1;
            for (int i_57_ = 0; i_57_ < 10; i_57_++) {
                if (((Class321) this).anIntArray3779[i_57_] <= i_52_ && ((((Class321) this).anIntArray3779[i_57_] ^ 0xffffffff) != -1))
                    i_56_ = ((Class321) this).anIntArray3774[i_57_];
            }
            if ((i_56_ ^ 0xffffffff) != 0)
                return (((Class321) this).aClass342_3714.method3482((byte) 80, i_56_).method3333(class182, i, class332, var_ha, -26163, 1, i_53_, i_54_, i_55_));
        }
        int i_58_ = i_54_;
        if (class182 != null)
            i_58_ |= class182.method1610((byte) -32, true, i_53_, i_55_);
        Class162 class162;
        synchronized (((Class342) ((Class321) this).aClass342_3714).aClass278_4004) {
            class162 = ((Class162) (((Class342) ((Class321) this).aClass342_3714).aClass278_4004.method2863(i_51_ + 26167, (long) (((Class321) this).anInt3751 | ((ha) var_ha).anInt1418 << -200866435))));
            if (i_51_ != -26163)
                method3328(127, null, 4);
        }
        if (class162 == null || (var_ha.b(class162.ua(), i_58_) ^ 0xffffffff) != -1) {
            if (class162 != null)
                i_58_ = var_ha.c(i_58_, class162.ua());
            int i_59_ = i_58_;
            if (aShortArray3722 != null)
                i_59_ |= 0x8000;
            if (aShortArray3764 != null || class332 != null)
                i_59_ |= 0x4000;
            if ((anInt3705 ^ 0xffffffff) != -129)
                i_59_ |= 0x1;
            if ((anInt3705 ^ 0xffffffff) != -129)
                i_59_ |= 0x2;
            if (anInt3705 != 128)
                i_59_ |= 0x4;
            Class343 class343 = OutgoingOpcode.method1513(0, (((Class342) ((Class321) this).aClass342_3714).aClass381_3999), -106, anInt3697);
            if (class343 == null)
                return null;
            if (((Class343) class343).anInt4053 < 13)
                class343.method3497((byte) 1, 2);
            class162 = var_ha.a(class343, i_59_, (((Class342) ((Class321) this).aClass342_3714).anInt4018), anInt3752 + 64, 850 + anInt3731);
            if (anInt3705 != 128 || (anInt3760 ^ 0xffffffff) != -129 || anInt3709 != 128)
                class162.O(anInt3705, anInt3760, anInt3709);
            if (aShortArray3764 != null) {
                for (int i_60_ = 0; ((aShortArray3764.length ^ 0xffffffff) < (i_60_ ^ 0xffffffff)); i_60_++) {
                    if (aByteArray3749 == null || aByteArray3749.length <= i_60_)
                        class162.ia(aShortArray3764[i_60_], aShortArray3715[i_60_]);
                    else
                        class162.ia(aShortArray3764[i_60_], (Class192.aShortArray2217[0xff & aByteArray3749[i_60_]]));
                }
            }
            if (aShortArray3722 != null) {
                for (int i_61_ = 0; i_61_ < aShortArray3722.length; i_61_++)
                    class162.aa(aShortArray3722[i_61_], aShortArray3726[i_61_]);
            }
            if (class332 != null) {
                for (int i_62_ = 0; i_62_ < 5; i_62_++) {
                    for (int i_63_ = 0; ((i_63_ ^ 0xffffffff) > (Class226_Sub2.aShortArrayArrayArray6667.length ^ 0xffffffff)); i_63_++) {
                        if (((Class332) class332).colors[i_62_] < (Class226_Sub2.aShortArrayArrayArray6667[i_63_][i_62_]).length)
                            class162.ia((Class205.aShortArrayArray2388[i_63_][i_62_]), (Class226_Sub2.aShortArrayArrayArray6667[i_63_][i_62_][(((Class332) class332).colors[i_62_])]));
                    }
                }
            }
            class162.s(i_58_);
            synchronized (((Class342) ((Class321) this).aClass342_3714).aClass278_4004) {
                ((Class342) ((Class321) this).aClass342_3714).aClass278_4004.method2867((byte) 0, (long) (((Class321) this).anInt3751 | ((ha) var_ha).anInt1418 << 929594877), class162);
            }
        }
        if (class182 != null)
            class162 = class182.method1605(i_58_, i, i_53_, class162, false, i_55_);
        class162.s(i_54_);
        return class162;
    }

    final Class343 method3334(boolean bool, boolean bool_64_) {
        anInt3717++;
        int i = anInt3712;
        int i_65_ = anInt3756;
        if (bool_64_) {
            i_65_ = anInt3716;
            i = anInt3721;
        }
        if ((i ^ 0xffffffff) == 0)
            return null;
        Class343 class343 = OutgoingOpcode.method1513(0, (((Class342) ((Class321) this).aClass342_3714).aClass381_3999), -106, i);
        if (bool != false)
            ((Class321) this).anInt3698 = 114;
        if (((Class343) class343).anInt4053 < 13)
            class343.method3497((byte) 1, 2);
        if ((i_65_ ^ 0xffffffff) != 0) {
            Class343 class343_66_ = OutgoingOpcode.method1513(0, (((Class342) ((Class321) this).aClass342_3714).aClass381_3999), -106, i_65_);
            if (((Class343) class343_66_).anInt4053 < 13)
                class343_66_.method3497((byte) 1, 2);
            Class343[] class343s = {class343, class343_66_};
            class343 = new Class343(class343s, 2);
        }
        if (aShortArray3764 != null) {
            for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (aShortArray3764.length ^ 0xffffffff); i_67_++)
                class343.method3509(aShortArray3715[i_67_], (byte) -119, aShortArray3764[i_67_]);
        }
        if (aShortArray3722 != null) {
            for (int i_68_ = 0; i_68_ < aShortArray3722.length; i_68_++)
                class343.method3511((byte) 124, aShortArray3722[i_68_], aShortArray3726[i_68_]);
        }
        return class343;
    }

    private final int[] method3335(int i, byte i_69_, int[] is) {
        anInt3737++;
        int[] is_70_ = new int[1152];
        if (i_69_ < 37)
            anInt3763 = 9;
        int i_71_ = 0;
        for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > -33; i_72_++) {
            for (int i_73_ = 0; i_73_ < 36; i_73_++) {
                int i_74_ = is[i_71_];
                if ((i_74_ ^ 0xffffffff) == -1) {
                    if ((i_73_ ^ 0xffffffff) < -1 && (is[i_71_ + -1] ^ 0xffffffff) != -1)
                        i_74_ = i;
                    else if (i_72_ <= 0 || (is[i_71_ - 36] ^ 0xffffffff) == -1) {
                        if (i_73_ < 35 && (is[1 + i_71_] ^ 0xffffffff) != -1)
                            i_74_ = i;
                        else if (i_72_ < 31 && (is[i_71_ + 36] ^ 0xffffffff) != -1)
                            i_74_ = i;
                    } else
                        i_74_ = i;
                }
                is_70_[i_71_++] = i_74_;
            }
        }
        return is_70_;
    }

    final void method3336(byte i, Class321 class321_75_, Class321 class321_76_) {
        anInt3697 = class321_76_.anInt3697;
        aShortArray3715 = class321_76_.aShortArray3715;
        ((Class321) this).anInt3742 = ((Class321) class321_76_).anInt3742;
        int i_77_ = -122 / ((59 - i) / 39);
        ((Class321) this).anInt3711 = ((Class321) class321_76_).anInt3711;
        ((Class321) this).aString3702 = ((Class321) class321_75_).aString3702;
        aShortArray3764 = class321_76_.aShortArray3764;
        ((Class321) this).anInt3771 = 1;
        aShortArray3726 = class321_76_.aShortArray3726;
        aShortArray3722 = class321_76_.aShortArray3722;
        ((Class321) this).anInt3753 = ((Class321) class321_75_).anInt3753;
        ((Class321) this).anInt3724 = ((Class321) class321_76_).anInt3724;
        anInt3740++;
        ((Class321) this).anInt3781 = ((Class321) class321_76_).anInt3781;
        aByteArray3749 = class321_76_.aByteArray3749;
        ((Class321) this).anInt3707 = ((Class321) class321_76_).anInt3707;
        ((Class321) this).aBoolean3738 = ((Class321) class321_75_).aBoolean3738;
        ((Class321) this).anInt3748 = ((Class321) class321_76_).anInt3748;
    }

    final boolean method3337(byte i, boolean bool) {
        if (i <= 104)
            return true;
        anInt3772++;
        int i_78_ = anInt3712;
        int i_79_ = anInt3756;
        if (bool) {
            i_79_ = anInt3716;
            i_78_ = anInt3721;
        }
        if (i_78_ == -1)
            return true;
        boolean bool_80_ = true;
        if (!((Class342) ((Class321) this).aClass342_3714).aClass381_3999.method3915(44, 0, i_78_))
            bool_80_ = false;
        if ((i_79_ ^ 0xffffffff) != 0 && !((Class342) ((Class321) this).aClass342_3714).aClass381_3999.method3915(115, 0, i_79_))
            bool_80_ = false;
        return bool_80_;
    }

    final String method3338(String string, int i, int i_81_) {
        anInt3733++;
        if (((Class321) this).aClass65_3767 == null)
            return string;
        if (i_81_ != 5)
            return null;
        Node_Sub32 class248_sub32 = ((Node_Sub32) ((Class321) this).aClass65_3767.method501((long) i, (byte) 31));
        if (class248_sub32 == null)
            return string;
        return ((Node_Sub32) class248_sub32).aString7195;
    }

    final void method3339(Class321 class321_82_, int i, Class321 class321_83_) {
        anInt3696 = class321_83_.anInt3696;
        anInt3716 = class321_83_.anInt3716;
        aShortArray3715 = class321_83_.aShortArray3715;
        ((Class321) this).anInt3781 = ((Class321) class321_82_).anInt3781;
        anInt3743 = class321_83_.anInt3743;
        ((Class321) this).aStringArray3701 = new String[5];
        anInt3756 = class321_83_.anInt3756;
        anInt3769 = class321_83_.anInt3769;
        ((Class321) this).anInt3711 = ((Class321) class321_82_).anInt3711;
        ((Class321) this).anInt3724 = ((Class321) class321_82_).anInt3724;
        ((Class321) this).anInt3713 = ((Class321) class321_83_).anInt3713;
        ((Class321) this).aClass65_3767 = ((Class321) class321_83_).aClass65_3767;
        ((Class321) this).anInt3753 = i;
        anInt3697 = class321_82_.anInt3697;
        aByteArray3749 = class321_83_.aByteArray3749;
        ((Class321) this).anInt3723 = ((Class321) class321_83_).anInt3723;
        ((Class321) this).anInt3748 = ((Class321) class321_82_).anInt3748;
        anInt3744++;
        ((Class321) this).aBoolean3738 = ((Class321) class321_83_).aBoolean3738;
        anInt3706 = class321_83_.anInt3706;
        anInt3755 = class321_83_.anInt3755;
        ((Class321) this).anInt3725 = ((Class321) class321_83_).anInt3725;
        aShortArray3764 = class321_83_.aShortArray3764;
        ((Class321) this).aString3702 = ((Class321) class321_83_).aString3702;
        anInt3721 = class321_83_.anInt3721;
        aShortArray3726 = class321_83_.aShortArray3726;
        anInt3719 = class321_83_.anInt3719;
        anInt3776 = class321_83_.anInt3776;
        anInt3712 = class321_83_.anInt3712;
        anInt3763 = class321_83_.anInt3763;
        anInt3718 = class321_83_.anInt3718;
        ((Class321) this).aStringArray3704 = ((Class321) class321_83_).aStringArray3704;
        aShortArray3722 = class321_83_.aShortArray3722;
        ((Class321) this).anInt3707 = ((Class321) class321_82_).anInt3707;
        ((Class321) this).anInt3742 = ((Class321) class321_82_).anInt3742;
        anInt3720 = class321_83_.anInt3720;
        if (((Class321) class321_83_).aStringArray3701 != null) {
            for (int i_84_ = 0; i_84_ < 4; i_84_++)
                ((Class321) this).aStringArray3701[i_84_] = ((Class321) class321_83_).aStringArray3701[i_84_];
        }
        ((Class321) this).aStringArray3701[4] = Class41.aClass41_471.method301((((Class342) (((Class321) this).aClass342_3714)).anInt4001), (byte) -108);
    }

    final Class321 method3340(int i, int i_85_) {
        anInt3750++;
        if (((Class321) this).anIntArray3774 != null && i_85_ > 1) {
            int i_86_ = -1;
            for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > -11; i_87_++) {
                if (i_85_ >= ((Class321) this).anIntArray3779[i_87_] && ((Class321) this).anIntArray3779[i_87_] != 0)
                    i_86_ = ((Class321) this).anIntArray3774[i_87_];
            }
            if ((i_86_ ^ 0xffffffff) != 0)
                return ((Class321) this).aClass342_3714.method3482((byte) 113, i_86_);
        }
        if (i != 18479)
            anInt3763 = 78;
        return this;
    }

    final int method3341(int i, int i_88_, int i_89_) {
        if (i_88_ != -1)
            return 54;
        anInt3757++;
        if (((Class321) this).aClass65_3767 == null)
            return i;
        Node_Sub37 class248_sub37 = ((Node_Sub37) ((Class321) this).aClass65_3767.method501((long) i_89_, (byte) 31));
        if (class248_sub37 == null)
            return i;
        return ((Node_Sub37) class248_sub37).anInt7261;
    }

    public Class321() {
        ((Class321) this).aString3702 = "null";
        ((Class321) this).anInt3732 = -1;
        anInt3696 = 0;
        ((Class321) this).anInt3698 = -1;
        anInt3716 = -1;
        ((Class321) this).anInt3742 = 0;
        ((Class321) this).anInt3729 = -1;
        anInt3720 = 0;
        ((Class321) this).anInt3723 = 0;
        ((Class321) this).anInt3735 = -1;
        ((Class321) this).anInt3699 = -1;
        anInt3721 = -1;
        ((Class321) this).anInt3748 = 0;
        ((Class321) this).anInt3730 = -1;
        ((Class321) this).anInt3747 = -1;
        ((Class321) this).anInt3724 = 0;
        ((Class321) this).aBoolean3738 = false;
        ((Class321) this).anInt3734 = -1;
        ((Class321) this).anInt3728 = -1;
        ((Class321) this).anInt3713 = -1;
        anInt3712 = -1;
        ((Class321) this).aBoolean3754 = false;
        anInt3752 = 0;
        ((Class321) this).anInt3759 = -1;
        anInt3760 = 128;
        ((Class321) this).anInt3707 = 2000;
        anInt3763 = -1;
        anInt3756 = -1;
        ((Class321) this).anInt3770 = -1;
        ((Class321) this).anInt3773 = -1;
        ((Class321) this).anInt3775 = -1;
        ((Class321) this).anInt3768 = 0;
        ((Class321) this).anInt3753 = 1;
        anInt3709 = 128;
        anInt3719 = 0;
        anInt3755 = -1;
        anInt3743 = 0;
        ((Class321) this).anInt3771 = 0;
        anInt3705 = 128;
        ((Class321) this).anInt3725 = -1;
        ((Class321) this).anInt3778 = -1;
        anInt3776 = -1;
        ((Class321) this).anInt3703 = -1;
        ((Class321) this).anInt3745 = 0;
        anInt3731 = 0;
        anInt3769 = -1;
        ((Class321) this).anInt3781 = 0;
    }
}
