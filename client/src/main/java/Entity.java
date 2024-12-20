/* Class346_Sub7_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Entity extends Animable {
    int anInt10407;
    int anInt10408;
    int anInt10409;
    int anInt10410;
    int anInt10411 = 0;
    int anInt10412;
    byte aByte10413;
    int[] anIntArray10414;
    int forceMovementY2;
    int anInt10416;
    int forceMovementX1;
    int forceMovementSpeed1;
    int anInt10419 = 0;
    int anInt10420;
    int anInt10421;
    int forceMovementX2;
    int anInt10423;
    int anInt10424;
    int[] anIntArray10425;
    static int anInt10426;
    int anInt10427;
    int forceMovementY1;
    static int anInt10429;
    int[] anIntArray10430;
    static int anInt10431;
    static int anInt10432;
    int[] anIntArray10433;
    int anInt10434;
    int[] anIntArray10435;
    private int size;
    private byte aByte10437;
    int anInt10438;
    boolean aBoolean10439;
    int anInt10440;
    Class305[] aClass305Array10441;
    static int anInt10442;
    static int anInt10443;
    int anInt10444;
    int anInt10445;
    int[] anIntArray10446;
    int anInt10447;
    int anInt10448;
    int anInt10449;
    byte aByte10450;
    boolean aBoolean10451;
    int anInt10452;
    static int anInt10453;
    String message;
    static int anInt10455;
    int anInt10456;
    static int anInt10457;
    int anInt10458;
    static int anInt10459;
    int forceMovementSpeed2;
    int forceMovementDirection;
    int anInt10462;
    Class286[] aClass286Array10463;
    static int anInt10464;
    static int anInt10465;
    int anInt10466;
    int[] anIntArray10467;
    static int anInt10468;
    static int anInt10469;
    int[] anIntArray10470;
    Class109 aClass109_10471;
    int[] anIntArray10472;
    static int anInt10473;
    int faceEntity;
    static int anInt10475;
    static int anInt10476;
    byte aByte10477;
    int anInt10478;
    int anInt10479;
    int anInt10480;
    int anInt10481;
    int anInt10482;
    static int anInt10483;
    int anInt10484;
    byte aByte10485;
    static int anInt10486;
    int anInt10487;
    int anInt10488;
    static int anInt10489;
    int anInt10490;
    boolean aBoolean10491;
    static int anInt10492;
    int height;
    static int anInt10494;
    static int anInt10495;
    static int anInt10496;
    private Class109 aClass109_10497;
    private Class109 aClass109_10498;
    byte[] aByteArray10499;
    int anInt10500;
    boolean aBoolean10501;
    Class162[] aClass162Array10502;
    int anInt10503;
    boolean aBoolean10504;
    int anInt10505;
    Class346_Sub8 aClass346_Sub8_10506;
    int anInt10507;
    int[] posQueueY;
    int[] posQueueX;

    final void method3629(int i, int i_0_, int i_1_, int i_2_, byte i_3_, int i_4_) {
        anInt10489++;
        Class305 class305 = ((Entity) this).aClass305Array10441[i_2_];
        int i_5_ = ((Class305) class305).anInt3537;
        if (i_0_ != -1 && i_5_ != -1) {
            if ((i_0_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
                Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_0_, -1);
                Class51 class51_6_ = Class279_Sub2.aClass151_7577.method1353(i_5_, -1);
                if ((((Class51) class51).anInt690 ^ 0xffffffff) != 0 && ((Class51) class51_6_).anInt690 != -1) {
                    Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51).anInt690));
                    Class182 class182_7_ = Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51_6_).anInt690));
                    if ((((Class182) class182_7_).anInt2101 ^ 0xffffffff) < (((Class182) class182).anInt2101 ^ 0xffffffff))
                        return;
                }
            } else {
                Class51 class51 = Class279_Sub2.aClass151_7577.method1353(i_0_, -1);
                if (((Class51) class51).aBoolean682 && ((Class51) class51).anInt690 != -1) {
                    Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51).anInt690));
                    int i_8_ = ((Class182) class182).anInt2102;
                    if ((i_8_ ^ 0xffffffff) == -1)
                        return;
                    if ((i_8_ ^ 0xffffffff) == -3) {
                        ((Class305) class305).anInt3545 = 0;
                        return;
                    }
                }
            }
        }
        int i_9_ = Node_Sub18.anInt7027;
        ((Class305) class305).anInt3537 = i_0_;
        ((Class305) class305).anInt3544 = i;
        ((Class305) class305).anInt3539 = i_1_ >> -1152230192;
        if (i_3_ < 103)
            ((Entity) this).anInt10456 = 30;
        ((Class305) class305).anInt3536 = 1;
        ((Class305) class305).anInt3541 = 0;
        ((Class305) class305).anInt3538 = (0xffff & i_1_) + i_9_;
        ((Class305) class305).anInt3540 = i_4_;
        ((Class305) class305).anInt3542 = 0;
        if (((Class305) class305).anInt3538 > i_9_)
            ((Class305) class305).anInt3542 = -1;
        if ((((Class305) class305).anInt3537 ^ 0xffffffff) != 0 && (i_9_ ^ 0xffffffff) == (((Class305) class305).anInt3538 ^ 0xffffffff)) {
            int i_10_ = (((Class51) Class279_Sub2.aClass151_7577.method1353(((Class305) class305).anInt3537, -1)).anInt690);
            if ((i_10_ ^ 0xffffffff) != 0) {
                Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, i_10_);
                if (class182 != null && ((Class182) class182).anIntArray2117 != null && !((Entity) this).aBoolean10439)
                    Class158.method1396(class182, 0, this, true);
            }
        }
    }

    protected final void finalize() {
        anInt10432++;
        if (((Entity) this).aClass346_Sub8_10506 != null)
            ((Entity) this).aClass346_Sub8_10506.method3706();
    }

    final void faceDir(boolean bool, int i) {
        anInt10457++;
        Class281 class281 = method3642(0);
        if (bool == false && ((((Class281) class281).anInt3307 ^ 0xffffffff) != -1 || ((Entity) this).anInt10480 != 0)) {
            ((Entity) this).aClass109_10471.method763((byte) 112);
            int i_11_ = 0x3fff & i - ((Class109) (((Entity) this).aClass109_10471)).anInt1378;
            if (i_11_ > 8192)
                ((Entity) this).anInt10427 = (((Class109) (((Entity) this).aClass109_10471)).anInt1378 + (-16384 - -i_11_));
            else
                ((Entity) this).anInt10427 = ((Class109) (((Entity) this).aClass109_10471)).anInt1378 - -i_11_;
        }
    }

    final int method3580(int i) {
        anInt10459++;
        if (i == ((Entity) this).height)
            return 0;
        return ((Entity) this).height;
    }

    static final void method3631(int i) {
        anInt10429++;
        if (Class14.aClass339_266 != Class18.aClass339_295) {
            if (i != 23159)
                method3631(-68);
            try {
                Class78.method571("tbrefresh", -8364, Node_Sub8_Sub16_Sub1.aClient10301);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    int method3632(int i) {
        if (i != -1)
            method3631(109);
        anInt10442++;
        return size;
    }

    final boolean method3563(boolean bool) {
        if (bool != false)
            ((Entity) this).anInt10484 = -35;
        anInt10473++;
        return ((Entity) this).aBoolean10501;
    }

    final int method3567(byte i) {
        if (i < 81)
            method3647((byte) 50);
        anInt10431++;
        return ((Entity) this).anInt10456;
    }

    final void method3633(int i, Class162 class162) {
        anInt10468++;
        int i_12_ = ((Class109) aClass109_10497).anInt1378;
        int i_13_ = ((Class109) aClass109_10498).anInt1378;
        if (i != i_12_ || i_13_ != 0) {
            int i_14_ = class162.fa() / 2;
            class162.H(0, -i_14_, 0);
            class162.VA(0x3fff & i_12_);
            class162.FA(i_13_ & 0x3fff);
            class162.H(0, i_14_, 0);
        }
    }

    final void method3634(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
        anInt10465++;
        int i_20_ = ((((Animable) this).x2 - -((Animable) this).x1) >> -1652800255);
        int i_21_ = ((((Animable) this).y1 + ((Animable) this).y2) >> 1587781633);
        int i_22_ = Node_Sub9_Sub1.anIntArray9106[i_17_];
        int i_23_ = Node_Sub9_Sub1.anIntArray9109[i_17_];
        int i_24_ = -i / 2;
        int i_25_ = -i_16_ / 2;
        int i_26_ = i_22_ * i_25_ + i_23_ * i_24_ >> -2147389938;
        int i_27_ = i_23_ * i_25_ + -(i_24_ * i_22_) >> -1983814578;
        int i_28_ = Class164.method1522(((Interactable) this).x - -i_26_, i_20_, ((Interactable) this).plane, i_18_ + 17995, i_27_ + ((Interactable) this).y, i_21_);
        int i_29_ = i / 2;
        int i_30_ = -i_16_ / 2;
        int i_31_ = i_23_ * i_29_ + i_22_ * i_30_ >> -19513906;
        int i_32_ = i_23_ * i_30_ + -(i_22_ * i_29_) >> 1951692462;
        int i_33_ = Class164.method1522(((Interactable) this).x - -i_31_, i_20_, ((Interactable) this).plane, i_18_ + 17995, i_32_ + ((Interactable) this).y, i_21_);
        int i_34_ = -i / 2;
        int i_35_ = i_16_ / 2;
        int i_36_ = i_23_ * i_34_ + i_35_ * i_22_ >> 1673187022;
        if (i_18_ != -17993)
            ((Entity) this).anInt10420 = 83;
        int i_37_ = i_23_ * i_35_ + -(i_22_ * i_34_) >> 1854351182;
        int i_38_ = Class164.method1522(i_36_ + ((Interactable) this).x, i_20_, ((Interactable) this).plane, 2, i_37_ + ((Interactable) this).y, i_21_);
        int i_39_ = i / 2;
        int i_40_ = i_16_ / 2;
        int i_41_ = i_22_ * i_40_ - -(i_23_ * i_39_) >> -651754962;
        int i_42_ = -(i_22_ * i_39_) + i_40_ * i_23_ >> 1029326926;
        int i_43_ = Class164.method1522(i_41_ + ((Interactable) this).x, i_20_, ((Interactable) this).plane, i_18_ ^ ~0x464a, ((Interactable) this).y - -i_42_, i_21_);
        int i_44_ = (i_33_ ^ 0xffffffff) >= (i_28_ ^ 0xffffffff) ? i_33_ : i_28_;
        int i_45_ = i_43_ > i_38_ ? i_38_ : i_43_;
        int i_46_ = i_33_ >= i_43_ ? i_43_ : i_33_;
        int i_47_ = i_38_ > i_28_ ? i_28_ : i_38_;
        ((Entity) this).anInt10423 = (int) (Math.atan2((double) (i_44_ - i_45_), (double) i_16_) * 2607.5945876176133) & 0x3fff;
        ((Entity) this).anInt10482 = (int) (2607.5945876176133 * Math.atan2((double) (-i_46_ + i_47_), (double) i)) & 0x3fff;
        if (((Entity) this).anInt10423 != 0 && (i_19_ ^ 0xffffffff) != -1) {
            int i_48_ = -i_19_ + 16384;
            if (((Entity) this).anInt10423 > 8192) {
                if (((Entity) this).anInt10423 < i_48_)
                    ((Entity) this).anInt10423 = i_48_;
            } else if ((((Entity) this).anInt10423 ^ 0xffffffff) < (i_19_ ^ 0xffffffff))
                ((Entity) this).anInt10423 = i_19_;
        }
        ((Entity) this).anInt10447 = i_28_ + i_43_;
        if (((Entity) this).anInt10482 != 0 && (i_15_ ^ 0xffffffff) != -1) {
            int i_49_ = 16384 + -i_15_;
            if ((((Entity) this).anInt10482 ^ 0xffffffff) >= -8193) {
                if (i_15_ < ((Entity) this).anInt10482)
                    ((Entity) this).anInt10482 = i_15_;
            } else if (i_49_ > ((Entity) this).anInt10482)
                ((Entity) this).anInt10482 = i_49_;
        }
        if ((i_38_ + i_33_ ^ 0xffffffff) > (((Entity) this).anInt10447 ^ 0xffffffff))
            ((Entity) this).anInt10447 = i_33_ - -i_38_;
        ((Entity) this).anInt10447 = ((((Entity) this).anInt10447 >> -650695903) - ((Interactable) this).anInt8317);
    }

    final boolean method3635(int i, int i_50_, int i_51_) {
        anInt10426++;
        if (((Entity) this).anIntArray10425 == null) {
            if (i == -1)
                return true;
            ((Entity) this).anIntArray10425 = new int[12];
            for (int i_52_ = 0; i_52_ < 12; i_52_++)
                ((Entity) this).anIntArray10425[i_52_] = -1;
        }
        Class281 class281 = method3642(i_51_ ^ i_51_);
        int i_53_ = 256;
        if (((Class281) class281).anIntArray3306 != null && ((Class281) class281).anIntArray3306[i_50_] > 0)
            i_53_ = ((Class281) class281).anIntArray3306[i_50_];
        if ((i ^ 0xffffffff) == 0) {
            if (((Entity) this).anIntArray10425[i_50_] == -1)
                return true;
            int i_54_ = ((Entity) this).aClass109_10471.method759((byte) -79);
            int i_55_ = ((Entity) this).anIntArray10425[i_50_];
            int i_56_ = -i_55_ + i_54_;
            if (-i_53_ <= i_56_ && (i_56_ ^ 0xffffffff) >= (i_53_ ^ 0xffffffff)) {
                ((Entity) this).anIntArray10425[i_50_] = -1;
                for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > -13; i_57_++) {
                    if (((Entity) this).anIntArray10425[i_57_] != -1)
                        return true;
                }
                ((Entity) this).anIntArray10425 = null;
                return true;
            }
            if (((i_56_ ^ 0xffffffff) >= -1 || i_56_ > 8192) && i_56_ > -8192)
                ((Entity) this).anIntArray10425[i_50_] = Class112.method794(16383, i_55_ - i_53_);
            else
                ((Entity) this).anIntArray10425[i_50_] = Class112.method794(16383, i_55_ + i_53_);
            return false;
        }
        if (((Entity) this).anIntArray10425[i_50_] == -1)
            ((Entity) this).anIntArray10425[i_50_] = ((Entity) this).aClass109_10471.method759((byte) -71);
        int i_58_ = ((Entity) this).anIntArray10425[i_50_];
        int i_59_ = -i_58_ + i;
        if ((-i_53_ ^ 0xffffffff) >= (i_59_ ^ 0xffffffff) && i_59_ <= i_53_) {
            ((Entity) this).anIntArray10425[i_50_] = i;
            return true;
        }
        if (i_59_ > 0 && (i_59_ ^ 0xffffffff) >= -8193 || i_59_ <= -8192)
            ((Entity) this).anIntArray10425[i_50_] = Class112.method794(16383, i_53_ + i_58_);
        else
            ((Entity) this).anIntArray10425[i_50_] = Class112.method794(-i_53_ + i_58_, 16383);
        return false;
    }

    final void updateCoordinateBounds(byte i) {
        if (i > -125)
            method3642(12);
        anInt10455++;
        int i_60_ = 240 + (-1 + size << -814621496);
        ((Animable) this).x2 = (short) (i_60_ + ((Interactable) this).x >> 179080969);
        ((Animable) this).y2 = (short) (((Interactable) this).y + i_60_ >> 574409577);
        ((Animable) this).x1 = (short) (((Interactable) this).x + -i_60_ >> -1884993111);
        ((Animable) this).y1 = (short) (((Interactable) this).y + -i_60_ >> -1668723383);
    }

    final int method3636(boolean bool) {
        anInt10496++;
        Class281 class281 = method3642(0);
        int i = (((Class109) ((Entity) this).aClass109_10471).anInt1378);
        boolean bool_61_;
        if (((Class281) class281).anInt3307 == 0)
            bool_61_ = (((Entity) this).aClass109_10471.method764(-11598, ((Entity) this).anInt10480, ((Entity) this).anInt10427, ((Entity) this).anInt10480));
        else
            bool_61_ = (((Entity) this).aClass109_10471.method764(-11598, ((Class281) class281).anInt3280, ((Entity) this).anInt10427, ((Class281) class281).anInt3307));
        if (bool != true)
            updateCoordinateBounds((byte) -7);
        int i_62_ = -i + ((Class109) (((Entity) this).aClass109_10471)).anInt1378;
        if ((i_62_ ^ 0xffffffff) == -1) {
            ((Entity) this).anInt10409 = 0;
            ((Entity) this).aClass109_10471.method761(((Entity) this).anInt10427, (byte) -109);
        } else
            ((Entity) this).anInt10409++;
        if (bool_61_) {
            if ((((Class281) class281).anInt3284 ^ 0xffffffff) != -1) {
                if ((i_62_ ^ 0xffffffff) < -1)
                    aClass109_10497.method764(-11598, ((Class281) class281).anInt3288, ((Class281) class281).anInt3293, ((Class281) class281).anInt3284);
                else
                    aClass109_10497.method764(-11598, ((Class281) class281).anInt3288, -((Class281) class281).anInt3293, ((Class281) class281).anInt3284);
            }
            if (((Class281) class281).anInt3297 != 0)
                aClass109_10498.method764(-11598, ((Class281) class281).anInt3287, ((Class281) class281).anInt3303, ((Class281) class281).anInt3297);
        } else {
            if ((((Class281) class281).anInt3284 ^ 0xffffffff) != -1)
                aClass109_10497.method764(-11598, ((Class281) class281).anInt3288, 0, ((Class281) class281).anInt3284);
            else
                aClass109_10497.method761(0, (byte) -109);
            if (((Class281) class281).anInt3297 != 0)
                aClass109_10498.method764(-11598, ((Class281) class281).anInt3287, 0, ((Class281) class281).anInt3297);
            else
                aClass109_10498.method761(0, (byte) -109);
        }
        return i_62_;
    }

    final void method3637(int i) {
        ((Entity) this).anInt10505 = i;
        ((Entity) this).anInt10503 = 0;
        anInt10476++;
    }

    final void method3638(int[] is, boolean bool, int[] is_63_) {
        anInt10492++;
        if (((Entity) this).anIntArray10430 == null && is_63_ != null)
            ((Entity) this).anIntArray10430 = new int[12];
        else if (is_63_ == null) {
            ((Entity) this).anIntArray10430 = null;
            return;
        }
        for (int i = 0; i < ((Entity) this).anIntArray10430.length; i++)
            ((Entity) this).anIntArray10430[i] = -1;
        int i = 0;
        if (bool == false) {
            for (/**/; (is_63_.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                int i_64_ = is[i];
                int i_65_ = 0;
                while (i_65_ < (((Entity) this).anIntArray10430).length) {
                    if ((i_64_ & 0x1 ^ 0xffffffff) != -1)
                        ((Entity) this).anIntArray10430[i_65_] = is_63_[i];
                    i_65_++;
                    i_64_ >>= 1;
                }
            }
        }
    }

    final void method3639(Class162[] class162s, ha var_ha, byte i, Viewport viewport, boolean bool) {
        anInt10494++;
        if (i > -9)
            ((Entity) this).anInt10466 = -75;
        if (!bool) {
            Class162 class162 = class162s[0];
            Class162 class162_66_ = class162s[1];
            Class162 class162_67_ = class162s[2];
            if (class162 != null) {
                class162.method1442(viewport);
                int i_68_ = 0;
                int i_69_ = 0;
                int i_70_ = 0;
                int i_71_ = 0;
                Class40[] class40s = class162.method1431();
                Class124[] class124s = class162.method1426();
                if (class40s != null) {
                    i_68_ += class40s.length;
                    i_69_++;
                }
                if (class124s != null) {
                    i_71_++;
                    i_70_ += class124s.length;
                }
                Class40[] class40s_72_ = null;
                Class124[] class124s_73_ = null;
                if (class162_66_ != null) {
                    class162_66_.method1442(viewport);
                    class40s_72_ = class162_66_.method1431();
                    class124s_73_ = class162_66_.method1426();
                }
                if (class124s_73_ != null) {
                    i_71_++;
                    i_70_ += class124s_73_.length;
                }
                if (class40s_72_ != null) {
                    i_68_ += class40s_72_.length;
                    i_69_++;
                }
                Class40[] class40s_74_ = null;
                Class124[] class124s_75_ = null;
                if (class162_67_ != null) {
                    class162_67_.method1442(viewport);
                    class40s_74_ = class162_67_.method1431();
                    class124s_75_ = class162_67_.method1426();
                }
                if (class40s_74_ != null) {
                    i_69_++;
                    i_68_ += class40s_74_.length;
                }
                if (class124s_75_ != null) {
                    i_70_ += class124s_75_.length;
                    i_71_++;
                }
                if (((((Entity) this).aClass346_Sub8_10506 == null) || ((Class346_Sub8) (((Entity) this).aClass346_Sub8_10506)).aBoolean8330) && (i_69_ > 0 || (i_71_ ^ 0xffffffff) < -1))
                    ((Entity) this).aClass346_Sub8_10506 = Class346_Sub8.method3716(Node_Sub18.anInt7027, true);
                if (((Entity) this).aClass346_Sub8_10506 != null) {
                    Object object = null;
                    Class40[] class40s_76_;
                    if (i_69_ != 1) {
                        class40s_76_ = new Class40[i_68_];
                        int i_77_ = 0;
                        if (class40s != null) {
                            Class159.method1399(class40s, 0, class40s_76_, i_77_, class40s.length);
                            i_77_ += class40s.length;
                        }
                        if (class40s_72_ != null) {
                            Class159.method1399(class40s_72_, 0, class40s_76_, i_77_, class40s_72_.length);
                            i_77_ += class40s_72_.length;
                        }
                        if (class40s_74_ != null)
                            Class159.method1399(class40s_74_, 0, class40s_76_, i_77_, class40s_74_.length);
                    } else if (class40s_72_ == null) {
                        if (class40s_74_ == null)
                            class40s_76_ = class40s;
                        else
                            class40s_76_ = class40s_74_;
                    } else
                        class40s_76_ = class40s_72_;
                    Object object_78_ = null;
                    Class124[] class124s_79_;
                    if ((i_71_ ^ 0xffffffff) != -2) {
                        class124s_79_ = new Class124[i_70_];
                        int i_80_ = 0;
                        if (class124s != null) {
                            Class159.method1399(class124s, 0, class124s_79_, i_80_, class124s.length);
                            i_80_ += class124s.length;
                        }
                        if (class124s_73_ != null) {
                            Class159.method1399(class124s_73_, 0, class124s_79_, i_80_, class124s_73_.length);
                            i_80_ += class124s_73_.length;
                        }
                        if (class124s_75_ != null)
                            Class159.method1399(class124s_75_, 0, class124s_79_, i_80_, class124s_75_.length);
                    } else if (class124s_73_ != null)
                        class124s_79_ = class124s_73_;
                    else if (class124s_75_ == null)
                        class124s_79_ = class124s;
                    else
                        class124s_79_ = class124s_75_;
                    ((Entity) this).aClass346_Sub8_10506.method3712(var_ha, (long) Node_Sub18.anInt7027, class40s_76_, class124s_79_, false);
                }
                ((Entity) this).aBoolean10504 = true;
            }
        } else if (((Entity) this).aClass346_Sub8_10506 != null)
            ((Entity) this).aClass346_Sub8_10506.method3717((long) Node_Sub18.anInt7027);
        if (((Entity) this).aClass346_Sub8_10506 != null)
            ((Entity) this).aClass346_Sub8_10506.method3703(((Interactable) this).plane, ((Animable) this).x1, ((Animable) this).x2, ((Animable) this).y1, ((Animable) this).y2);
    }

    abstract int method3640(byte i);

    int method3641(boolean bool) {
        anInt10495++;
        Class281 class281 = method3642(0);
        int i;
        if ((((Class281) class281).anInt3309 ^ 0xffffffff) != 0)
            i = ((Class281) class281).anInt3309;
        else if (((Entity) this).height != -32768)
            i = -((Entity) this).height;
        else
            i = 200;
        Class137 class137 = (Class311.aClass137ArrayArrayArray3620[((Interactable) this).plane][((Interactable) this).x >> Class96.anInt1249][((Interactable) this).y >> Class96.anInt1249]);
        if (class137 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645 != null)
            return i + (((Class346_Sub7_Sub4) ((Class137) class137).aClass346_Sub7_Sub4_1645).aShort9947);
        if (bool != true)
            ((Entity) this).anInt10466 = -17;
        return i;
    }

    public Entity() {
        super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        ((Entity) this).anIntArray10414 = null;
        ((Entity) this).anInt10424 = 0;
        ((Entity) this).anInt10410 = 0;
        ((Entity) this).aBoolean10439 = true;
        ((Entity) this).anInt10444 = -1;
        ((Entity) this).anInt10420 = 0;
        size = 1;
        ((Entity) this).aByte10450 = (byte) 0;
        ((Entity) this).anInt10407 = -1;
        ((Entity) this).anInt10408 = -1;
        ((Entity) this).anIntArray10433 = new int[Class25.anInt344];
        ((Entity) this).anInt10452 = 0;
        ((Entity) this).anInt10409 = 0;
        ((Entity) this).anInt10434 = -1;
        ((Entity) this).anIntArray10446 = new int[Class25.anInt344];
        aByte10437 = (byte) 0;
        ((Entity) this).aClass286Array10463 = new Class286[12];
        ((Entity) this).anIntArray10435 = new int[Class25.anInt344];
        ((Entity) this).anInt10448 = 0;
        ((Entity) this).anInt10462 = 0;
        ((Entity) this).anInt10421 = -1;
        ((Entity) this).anIntArray10472 = new int[Class25.anInt344];
        ((Entity) this).aBoolean10451 = false;
        ((Entity) this).anInt10466 = 0;
        ((Entity) this).anInt10458 = 0;
        ((Entity) this).anIntArray10467 = new int[Class25.anInt344];
        ((Entity) this).anInt10478 = 0;
        ((Entity) this).anInt10456 = 0;
        ((Entity) this).anInt10479 = -1;
        ((Entity) this).anInt10490 = -1000;
        ((Entity) this).faceEntity = -1;
        ((Entity) this).anInt10480 = 256;
        ((Entity) this).height = -32768;
        ((Entity) this).anInt10488 = -1;
        ((Entity) this).anInt10481 = 100;
        ((Entity) this).anInt10416 = -1000;
        ((Entity) this).anInt10487 = 0;
        ((Entity) this).message = null;
        ((Entity) this).aBoolean10491 = false;
        ((Entity) this).anIntArray10470 = new int[Class25.anInt344];
        ((Entity) this).aClass109_10471 = new Class109();
        aClass109_10497 = new Class109();
        aClass109_10498 = new Class109();
        ((Entity) this).aByteArray10499 = new byte[10];
        ((Entity) this).aBoolean10504 = false;
        ((Entity) this).anInt10500 = 0;
        ((Entity) this).aBoolean10501 = false;
        ((Entity) this).anInt10505 = 0;
        ((Entity) this).anInt10507 = 0;
        ((Entity) this).anInt10503 = 0;
        ((Entity) this).posQueueY = new int[10];
        ((Entity) this).posQueueX = new int[10];
        ((Entity) this).aClass305Array10441 = new Class305[3];
        ((Entity) this).aClass162Array10502 = new Class162[4];
        for (int i = 0; i < 3; i++)
            ((Entity) this).aClass305Array10441[i] = new Class305(this);
    }

    final boolean method3574(byte i) {
        int i_81_ = -112 % ((14 - i) / 57);
        anInt10464++;
        return false;
    }

    final Class281 method3642(int i) {
        anInt10483++;
        int i_82_ = method3647((byte) -28);
        if (i == (i_82_ ^ 0xffffffff))
            return Class282_Sub12.aClass281_7714;
        return Class301_Sub3_Sub1.aClass131_9974.method1213(-20408, i_82_);
    }

    final void method3643(int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
        anInt10453++;
        boolean bool = true;
        boolean bool_90_ = true;
        for (int i_91_ = 0; (i_91_ ^ 0xffffffff) > (Class25.anInt344 ^ 0xffffffff); i_91_++) {
            if ((i_86_ ^ 0xffffffff) > (((Entity) this).anIntArray10435[i_91_] ^ 0xffffffff))
                bool = false;
            else
                bool_90_ = false;
        }
        int i_92_ = -1;
        int i_93_ = 37 / ((i_83_ - -8) / 40);
        int i_94_ = -1;
        int i_95_ = 0;
        if (i_87_ >= 0) {
            Class70 class70 = Class19.aClass4_298.method174(64, i_87_);
            i_95_ = ((Class70) class70).anInt924;
            i_94_ = ((Class70) class70).anInt933;
        }
        if (bool_90_) {
            if ((i_94_ ^ 0xffffffff) == 0)
                return;
            i_92_ = 0;
            int i_96_ = 0;
            if (i_94_ != 0) {
                if ((i_94_ ^ 0xffffffff) == -2)
                    i_96_ = ((Entity) this).anIntArray10472[0];
            } else
                i_96_ = ((Entity) this).anIntArray10435[0];
            for (int i_97_ = 1; (Class25.anInt344 ^ 0xffffffff) < (i_97_ ^ 0xffffffff); i_97_++) {
                if (i_94_ == 0) {
                    if (i_96_ > (((Entity) this).anIntArray10435[i_97_])) {
                        i_92_ = i_97_;
                        i_96_ = (((Entity) this).anIntArray10435[i_97_]);
                    }
                } else if ((i_94_ ^ 0xffffffff) == -2 && i_96_ > (((Entity) this).anIntArray10472[i_97_])) {
                    i_92_ = i_97_;
                    i_96_ = (((Entity) this).anIntArray10472[i_97_]);
                }
            }
            if (i_94_ == 1 && (i_96_ ^ 0xffffffff) <= (i_84_ ^ 0xffffffff))
                return;
        } else {
            if (bool)
                aByte10437 = (byte) 0;
            for (int i_98_ = 0; i_98_ < Class25.anInt344; i_98_++) {
                int i_99_ = aByte10437;
                aByte10437 = (byte) ((1 + aByte10437) % Class25.anInt344);
                if ((((Entity) this).anIntArray10435[i_99_] ^ 0xffffffff) >= (i_86_ ^ 0xffffffff)) {
                    i_92_ = i_99_;
                    break;
                }
            }
        }
        if (i_92_ >= 0) {
            ((Entity) this).anIntArray10470[i_92_] = i_87_;
            ((Entity) this).anIntArray10472[i_92_] = i_84_;
            ((Entity) this).anIntArray10433[i_92_] = i;
            ((Entity) this).anIntArray10467[i_92_] = i_89_;
            ((Entity) this).anIntArray10435[i_92_] = i_85_ + (i_86_ - -i_95_);
            ((Entity) this).anIntArray10446[i_92_] = i_88_;
        }
    }

    final void method3644(byte i, int i_100_, boolean bool) {
        if (i != -17)
            method3574((byte) -9);
        anInt10469++;
        Class281 class281 = method3642(0);
        if (bool || (((Class281) class281).anInt3307 ^ 0xffffffff) != -1 || ((Entity) this).anInt10480 != 0) {
            ((Entity) this).anInt10427 = 0x3fff & i_100_;
            ((Entity) this).aClass109_10471.method761(((Entity) this).anInt10427, (byte) -109);
        }
    }

    static final void method3645(long l, int i) {
        anInt10475++;
        if (Class311.aClass137ArrayArrayArray3620 != null) {
            if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -2 || Node_Sub45.anInt7343 == 5)
                Class30.method262(123, l);
            else if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -5)
                Node_Sub14_Sub19.method2332(false, l);
        }
        Node_Sub14_Sub34.method2376((byte) 125, (long) Node_Sub18.anInt7027, Class287.aHa3381);
        if ((Class179.anInt2084 ^ 0xffffffff) != 0)
            Class238_Sub3.method1909(-1, Class179.anInt2084);
        for (int i_101_ = 0; (Node_Sub14.anInt6990 ^ 0xffffffff) < (i_101_ ^ 0xffffffff); i_101_++) {
            if (Class359.aBooleanArray4435[i_101_])
                Class143.aBooleanArray1678[i_101_] = true;
            Class304.aBooleanArray3530[i_101_] = Class359.aBooleanArray4435[i_101_];
            Class359.aBooleanArray4435[i_101_] = false;
        }
        Class144.anInt1691 = Node_Sub18.anInt7027;
        Class102.method727(-1, -104, null, -1);
        Node_Sub8.method2017(-1, null, -1, (byte) 13);
        if ((Class179.anInt2084 ^ 0xffffffff) != 0) {
            Node_Sub14.anInt6990 = 0;
            Node_Sub12.method2258(false);
        }
        Class287.aHa3381.la();
        Class346_Sub7_Sub1_Sub1.method3589(Class287.aHa3381, 5851);
        int i_102_ = Class17.method225(-73);
        if ((i_102_ ^ 0xffffffff) == 0)
            i_102_ = Class136_Sub4.anInt8413;
        if ((i_102_ ^ 0xffffffff) == 0)
            i_102_ = Node_Sub8_Sub20.anInt9102;
        Node_Sub29.method2558((byte) -108, i_102_);
        int i_103_ = (Class347.myPlayer.method3632(-1) << -526906808);
        if (i < -23) {
            Node_Sub47.method2665((((Interactable) Class347.myPlayer).plane), i_103_ + (((Interactable) Class347.myPlayer).y), Class77.anInt998, i_103_ + (((Interactable) Class347.myPlayer).x), (byte) -68);
            Class77.anInt998 = 0;
        }
    }

    final void method3646(int i, int i_104_, int i_105_, Class281 class281, int i_106_, ha var_ha, boolean bool) {
        for (int i_107_ = 0; (i_107_ < ((Entity) this).aClass305Array10441.length); i_107_++) {
            byte i_108_ = 0;
            if ((i_107_ ^ 0xffffffff) == -1)
                i_108_ = (byte) 2;
            else if (i_107_ == 1)
                i_108_ = (byte) 5;
            else if ((i_107_ ^ 0xffffffff) == -3)
                i_108_ = (byte) 1;
            Class305 class305 = ((Entity) this).aClass305Array10441[i_107_];
            if (((Class305) class305).anInt3537 == -1 || (((Class305) class305).anInt3542 ^ 0xffffffff) == 0)
                ((Entity) this).aClass162Array10502[(i_107_ + 1)] = null;
            else {
                Class51 class51 = Class279_Sub2.aClass151_7577.method1353(((Class305) class305).anInt3537, -1);
                boolean bool_109_ = (((Class51) class51).aByte689 == 3 && ((i ^ 0xffffffff) != -1 || i_106_ != 0));
                int i_110_ = i_104_;
                if (!bool_109_) {
                    if (((Class305) class305).anInt3540 != 0)
                        i_110_ |= 0x5;
                    if (((Class305) class305).anInt3539 != 0)
                        i_110_ |= 0x2;
                    if (((Class305) class305).anInt3544 >= 0)
                        i_110_ |= 0x7;
                } else
                    i_110_ |= 0x7;
                Class162 class162 = (((Entity) this).aClass162Array10502[i_107_ - -1] = class51.method403(((Class305) class305).anInt3542, var_ha, ((Class305) class305).anInt3536, ((Class305) class305).anInt3541, Class235.aClass356_2617, i_108_, (byte) -54, i_110_));
                if (class162 != null) {
                    if (((Class305) class305).anInt3544 < 0 || ((Class281) class281).anIntArrayArray3291 == null || (((Class281) class281).anIntArrayArray3291[((Class305) class305).anInt3544]) == null) {
                        if (((Class305) class305).anInt3540 != 0)
                            class162.a(((Class305) class305).anInt3540 * 2048);
                    } else {
                        int i_111_ = 0;
                        int i_112_ = 0;
                        int i_113_ = 0;
                        if (((Class281) class281).anIntArrayArray3291 != null && (((Class281) class281).anIntArrayArray3291[((Class305) class305).anInt3544]) != null) {
                            i_113_ += (((Class281) class281).anIntArrayArray3291[((Class305) class305).anInt3544][2]);
                            i_112_ += (((Class281) class281).anIntArrayArray3291[((Class305) class305).anInt3544][1]);
                            i_111_ += (((Class281) class281).anIntArrayArray3291[((Class305) class305).anInt3544][0]);
                        }
                        if (((Class281) class281).anIntArrayArray3308 != null && (((Class281) class281).anIntArrayArray3308[((Class305) class305).anInt3544]) != null) {
                            i_111_ += (((Class281) class281).anIntArrayArray3308[((Class305) class305).anInt3544][0]);
                            i_113_ += (((Class281) class281).anIntArrayArray3308[((Class305) class305).anInt3544][2]);
                            i_112_ += (((Class281) class281).anIntArrayArray3308[((Class305) class305).anInt3544][1]);
                        }
                        if (i_113_ != 0 || i_111_ != 0) {
                            int i_114_ = i_105_;
                            if ((((Entity) this).anIntArray10425) != null && ((((Entity) this).anIntArray10425[((Class305) class305).anInt3544]) ^ 0xffffffff) != 0)
                                i_114_ = (((Entity) this).anIntArray10425[((Class305) class305).anInt3544]);
                            int i_115_ = ((-i_105_ + (((Class305) class305).anInt3540 * 2048 - -i_114_)) & 0x3fff);
                            if (i_115_ != 0)
                                class162.a(i_115_);
                            int i_116_ = Node_Sub9_Sub1.anIntArray9106[i_115_];
                            int i_117_ = Node_Sub9_Sub1.anIntArray9109[i_115_];
                            int i_118_ = (i_111_ * i_117_ + i_116_ * i_113_ >> 165022798);
                            i_113_ = (-(i_116_ * i_111_) + i_117_ * i_113_ >> 30114958);
                            i_111_ = i_118_;
                        }
                        class162.H(i_111_, i_112_, i_113_);
                    }
                    if ((((Class305) class305).anInt3539 ^ 0xffffffff) != -1)
                        class162.H(0, (-((Class305) class305).anInt3539 << 530685730), 0);
                    if (bool_109_) {
                        if (((Entity) this).anInt10423 != 0)
                            class162.FA(((Entity) this).anInt10423);
                        if ((((Entity) this).anInt10482 ^ 0xffffffff) != -1)
                            class162.VA(((Entity) this).anInt10482);
                        if (((Entity) this).anInt10447 != 0)
                            class162.H(0, (((Entity) this).anInt10447), 0);
                    }
                }
            }
        }
        if (bool != false)
            method3643(93, -34, 42, 101, 35, -57, -88, 88);
        anInt10486++;
    }

    abstract int method3647(byte i);

    final void setSize(byte i, int i_119_) {
        anInt10443++;
        size = i_119_;
        if (i < 103)
            ((Entity) this).aByteArray10499 = null;
    }
}
