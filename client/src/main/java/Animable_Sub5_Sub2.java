/* Class346_Sub7_Sub2_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPC extends Entity {
    static int anInt10586;
    static int anInt10587;
    static int anInt10588;
    static int anInt10589;
    static int anInt10590;
    static Class381 aClass381_10591;
    static int anInt10592;
    static int anInt10593;
    int anInt10594;
    int anInt10595 = 1;
    static int anInt10596;
    static int anInt10597;
    static int anInt10598;
    int anInt10599;
    static int anInt10600;
    static int anInt10601;
    int anInt10602 = -1;
    static int anInt10603;
    String aString10604;
    static int anInt10605;
    static int anInt10606;
    static int anInt10607;
    int anInt10608;
    static int anInt10609;
    static int anInt10610;
    static int anInt10611;
    Class122 aClass122_10612;
    static int anInt10613;
    Class255 aClass255_10614;
    static Class101 aClass101_10615 = new Class101();
    static Class272 aClass272_10616 = new Class272();

    final int method3570(int i) {
        anInt10606++;
        if (i >= 0)
            return -99;
        if (((NPC) this).aClass255_10614 == null)
            return 0;
        return (((Class255) ((NPC) this).aClass255_10614).anInt2870);
    }

    final boolean method3568(int i) {
        int i_0_ = -84 / ((53 - i) / 45);
        anInt10605++;
        return false;
    }

    static final Class225_Sub1 method3662(ByteStream class248_sub9, boolean bool) {
        anInt10587++;
        Class225 class225 = Class358.method3798(124, class248_sub9);
        int i = class248_sub9.readShort(-1);
        int i_1_ = class248_sub9.readShort(-1);
        if (bool != true)
            method3668(121, null, -107, 14, null);
        int i_2_ = class248_sub9.readShort(-1);
        int i_3_ = class248_sub9.readShort(-1);
        int i_4_ = class248_sub9.readShort(-1);
        int i_5_ = class248_sub9.readShort(-1);
        return new Class225_Sub1(((Class225) class225).aClass186_4993, ((Class225) class225).aClass272_4994, ((Class225) class225).anInt4992, ((Class225) class225).anInt4999, ((Class225) class225).anInt5000, ((Class225) class225).anInt5002, ((Class225) class225).anInt4997, ((Class225) class225).anInt5001, ((Class225) class225).anInt4995, i, i_1_, i_2_, i_3_, i_4_, i_5_);
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_6_, int i_7_, boolean bool, int i_8_) {
        if (i_6_ < 109)
            method3663((byte) -84);
        anInt10601++;
        throw new IllegalStateException();
    }

    final int method3641(boolean bool) {
        anInt10592++;
        if ((((Class255) ((NPC) this).aClass255_10614).anIntArray2923) != null) {
            Class255 class255 = ((NPC) this).aClass255_10614.method2737((byte) 83, Node_Sub43.aClass291_7306);
            if (class255 != null && ((Class255) class255).anInt2878 != -1)
                return ((Class255) class255).anInt2878;
        }
        if (bool != true)
            method3662(null, true);
        if ((((Class255) ((NPC) this).aClass255_10614).anInt2878 ^ 0xffffffff) == 0)
            return super.method3641(bool);
        return (((Class255) ((NPC) this).aClass255_10614).anInt2878);
    }

    final boolean method3663(byte i) {
        anInt10600++;
        if (i != -84)
            return true;
        if (((NPC) this).aClass255_10614 == null)
            return false;
        return true;
    }

    static final void method3664(int i) {
        if ((Class273.anInt5008 ^ 0xffffffff) == -10)
            Node_Sub14_Sub15.method2318(5, -21035);
        else if ((Class273.anInt5008 ^ 0xffffffff) != -6 && Class273.anInt5008 != 6) {
            if (Class273.anInt5008 == 12)
                Node_Sub14_Sub15.method2318(3, -21035);
        } else
            Node_Sub14_Sub15.method2318(3, -21035);
        anInt10597++;
        int i_9_ = -91 / ((26 - i) / 58);
    }

    public static void method3665(boolean bool) {
        aClass381_10591 = null;
        aClass101_10615 = null;
        aClass272_10616 = null;
        if (bool != false)
            method3662(null, true);
    }

    final void method3573(ha var_ha, byte i) {
        anInt10610++;
        if (((NPC) this).aClass255_10614 != null && (((Entity) this).aBoolean10504 || method3667((byte) -104, 0, var_ha))) {
            Viewport viewport = var_ha.o();
            if (i < 121)
                method3671(-112, (byte) -58, -107);
            viewport.method1857(((Entity) this).aClass109_10471.method759((byte) -106));
            viewport.method1862(((Interactable) this).x, ((Interactable) this).anInt8317 + -20, ((Interactable) this).y);
            this.method3639((((Entity) this).aClass162Array10502), var_ha, (byte) -22, viewport, ((Entity) this).aBoolean10504);
            ((Entity) this).aClass162Array10502[0] = ((Entity) this).aClass162Array10502[1] = ((Entity) this).aClass162Array10502[2] = null;
        }
    }

    final Class38 method3575(byte i, ha var_ha) {
        anInt10593++;
        if (i > -86)
            method3572(null, null, -53, -68, 57, false, 85);
        return null;
    }

    final int method3647(byte i) {
        anInt10596++;
        if ((((Class255) ((NPC) this).aClass255_10614).anIntArray2923) != null) {
            Class255 class255 = ((NPC) this).aClass255_10614.method2737((byte) 101, Node_Sub43.aClass291_7306);
            if (class255 != null && (((Class255) class255).anInt2861 ^ 0xffffffff) != 0)
                return ((Class255) class255).anInt2861;
        }
        int i_10_ = 78 % ((i - 64) / 59);
        return (((Class255) ((NPC) this).aClass255_10614).anInt2861);
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10609++;
        if (((NPC) this).aClass255_10614 == null || !method3667((byte) -110, 2048, var_ha))
            return null;
        Viewport viewport = var_ha.o();
        int i_11_ = ((Entity) this).aClass109_10471.method759((byte) -60);
        viewport.method1857(i_11_);
        Class137 class137 = (Class311.aClass137ArrayArrayArray3620[((Interactable) this).plane][((Interactable) this).x >> Class96.anInt1249][((Interactable) this).y >> Class96.anInt1249]);
        if (i != -1)
            ((NPC) this).anInt10595 = 9;
        if (class137 != null && ((Class137) class137).aClass346_Sub7_Sub4_1645 != null) {
            int i_12_ = (((Entity) this).anInt10411 - (((Class346_Sub7_Sub4) ((Class137) class137).aClass346_Sub7_Sub4_1645).aShort9947));
            ((Entity) this).anInt10411 -= (float) i_12_ / 10.0F;
        } else
            ((Entity) this).anInt10411 -= (float) ((Entity) this).anInt10411 / 10.0F;
        viewport.method1862(((Interactable) this).x, (-((Entity) this).anInt10411 + (-20 + ((Interactable) this).anInt8317)), ((Interactable) this).y);
        Class281 class281 = this.method3642(0);
        Class255 class255 = (((Class255) (((NPC) this).aClass255_10614)).anIntArray2923 != null ? ((NPC) this).aClass255_10614.method2737((byte) 94, Node_Sub43.aClass291_7306) : ((NPC) this).aClass255_10614);
        ((Entity) this).aBoolean10501 = false;
        Class346_Sub10 class346_sub10 = null;
        if ((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363.method3031(true) ^ 0xffffffff) == -2 && ((Class255) class255).aBoolean2854 && ((Class281) class281).aBoolean3311) {
            Class182 class182 = ((((((Entity) this).anInt10444 ^ 0xffffffff) == 0) || (((Entity) this).anInt10424 ^ 0xffffffff) != -1) ? null : (Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10444)));
            Class182 class182_13_ = ((((Entity) this).anInt10434 == -1 || (((Entity) this).aBoolean10491 && class182 != null)) ? null : (Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10434)));
            Class162 class162 = (Class64.method489(((Entity) this).anInt10482, ((Entity) this).aClass162Array10502[0], ((Class255) (((NPC) this).aClass255_10614)).size, var_ha, ((Entity) this).anInt10447, ((Entity) this).anInt10423, (class182_13_ == null ? ((Entity) this).anInt10420 : ((Entity) this).anInt10448), i_11_, 0xff & ((Class255) (((NPC) this).aClass255_10614)).aByte2900, 0xff & ((Class255) (((NPC) this).aClass255_10614)).aByte2879, 0xffff & ((Class255) (((NPC) this).aClass255_10614)).aShort2896, class182_13_ == null ? class182 : class182_13_, (byte) -75, ((Class255) (((NPC) this).aClass255_10614)).aShort2928 & 0xffff));
            if (class162 != null) {
                class346_sub10 = (Class282_Sub21.method3013(method3669(-2), (byte) 117, 1 + (((Entity) this).aClass162Array10502).length));
                ((Entity) this).aBoolean10501 = true;
                var_ha.C(false);
                if (Class357.aBoolean4416)
                    class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[(((Entity) this).aClass162Array10502).length]), ObjectDefinition.anInt3100, 0);
                else
                    class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[(((Entity) this).aClass162Array10502).length]), 0);
                var_ha.C(true);
            }
        }
        viewport.method1857(i_11_);
        viewport.method1862(((Interactable) this).x, (-((Entity) this).anInt10411 + (-5 + ((Interactable) this).anInt8317)), ((Interactable) this).y);
        if (class346_sub10 == null)
            class346_sub10 = Class282_Sub21.method3013(method3669(-2), (byte) 127, (((Entity) this).aClass162Array10502).length);
        this.method3639(((Entity) this).aClass162Array10502, var_ha, (byte) -121, viewport, false);
        if (!Class357.aBoolean4416) {
            for (int i_14_ = 0; ((((Entity) this).aClass162Array10502.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
                if (((Entity) this).aClass162Array10502[i_14_] != null)
                    ((Entity) this).aClass162Array10502[i_14_].method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[i_14_]), 0);
            }
        } else {
            for (int i_15_ = 0; i_15_ < (((Entity) this).aClass162Array10502).length; i_15_++) {
                if (((Entity) this).aClass162Array10502[i_15_] != null)
                    ((Entity) this).aClass162Array10502[i_15_].method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[i_15_]), ObjectDefinition.anInt3100, 0);
            }
        }
        if (((Entity) this).aClass346_Sub8_10506 != null) {
            Class338 class338 = ((Entity) this).aClass346_Sub8_10506.method3714();
            if (!Class357.aBoolean4416)
                var_ha.a(class338);
            else
                var_ha.a(class338, ObjectDefinition.anInt3100);
        }
        for (int i_16_ = 0; (((Entity) this).aClass162Array10502.length > i_16_); i_16_++) {
            if (((Entity) this).aClass162Array10502[i_16_] != null)
                ((Entity) this).aBoolean10501 |= ((Entity) this).aClass162Array10502[i_16_].F();
        }
        ((Entity) this).anInt10445 = Class54.anInt727;
        ((Entity) this).aClass162Array10502[0] = ((Entity) this).aClass162Array10502[1] = ((Entity) this).aClass162Array10502[2] = null;
        return class346_sub10;
    }

    final void method3666(boolean bool, int i, int i_17_, int i_18_, int i_19_, int i_20_) {
        ((Interactable) this).plane = ((Interactable) this).aByte8322 = (byte) i_19_;
        anInt10590++;
        if (Class209.method1717(-10387, i, i_17_))
            ((Interactable) this).aByte8322++;
        if ((((Entity) this).anInt10444 ^ 0xffffffff) != 0 && ((((Class182) Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10444)).anInt2105) ^ 0xffffffff) == -2) {
            ((Entity) this).anIntArray10414 = null;
            ((Entity) this).anInt10444 = -1;
        }
        for (int i_21_ = 0; (((Entity) this).aClass305Array10441.length > i_21_); i_21_++) {
            if (((Class305) (((Entity) this).aClass305Array10441[i_21_])).anInt3537 != -1) {
                Class51 class51 = (Class279_Sub2.aClass151_7577.method1353(((Class305) (((Entity) this).aClass305Array10441[i_21_])).anInt3537, -1));
                if (((Class51) class51).aBoolean682 && ((Class51) class51).anInt690 != -1 && ((((Class182) Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51).anInt690))).anInt2105) ^ 0xffffffff) == -2)
                    ((Class305) (((Entity) this).aClass305Array10441[i_21_])).anInt3537 = -1;
            }
        }
        if (!bool) {
            int i_22_ = -((Entity) this).posQueueX[0] + i;
            int i_23_ = -((Entity) this).posQueueY[0] + i_17_;
            if ((i_22_ ^ 0xffffffff) <= 7 && i_22_ <= 8 && i_23_ >= -8 && (i_23_ ^ 0xffffffff) >= -9) {
                if (((Entity) this).anInt10503 < 9)
                    ((Entity) this).anInt10503++;
                for (int i_24_ = ((Entity) this).anInt10503; (i_24_ ^ 0xffffffff) < -1; i_24_--) {
                    ((Entity) this).posQueueX[i_24_] = (((Entity) this).posQueueX[-1 + i_24_]);
                    ((Entity) this).posQueueY[i_24_] = (((Entity) this).posQueueY[-1 + i_24_]);
                    ((Entity) this).aByteArray10499[i_24_] = (((Entity) this).aByteArray10499[-1 + i_24_]);
                }
                ((Entity) this).posQueueX[0] = i;
                ((Entity) this).posQueueY[0] = i_17_;
                ((Entity) this).aByteArray10499[0] = (byte) 1;
                return;
            }
        }
        ((Entity) this).anInt10503 = 0;
        ((Entity) this).posQueueX[0] = i;
        ((Entity) this).anInt10500 = 0;
        ((Entity) this).anInt10505 = 0;
        ((Entity) this).posQueueY[0] = i_17_;
        ((Interactable) this).x = ((i_18_ << -1809089752) + (((Entity) this).posQueueX[0] << -881877015));
        ((Interactable) this).y = (((Entity) this).posQueueY[0] << 1364783113) - -(i_18_ << 225068616);
        int i_25_ = -18 / ((i_20_ - 49) / 49);
        if (((Entity) this).aClass346_Sub8_10506 != null)
            ((Entity) this).aClass346_Sub8_10506.method3713();
    }

    final void method3577(int i) {
        if (i == 131072) {
            anInt10611++;
            throw new IllegalStateException();
        }
    }

    private final boolean method3667(byte i, int i_26_, ha var_ha) {
        anInt10589++;
        int i_27_ = i_26_;
        if (i >= -67)
            method3572(null, null, -125, -64, 126, true, 114);
        Class281 class281 = this.method3642(0);
        Class182 class182 = ((((Entity) this).anInt10444 != -1 && ((Entity) this).anInt10424 == 0) ? Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10444) : null);
        Class182 class182_28_ = (((((Entity) this).anInt10434 ^ 0xffffffff) != 0 && (!((Entity) this).aBoolean10491 || class182 == null)) ? Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10434) : null);
        int i_29_ = ((Class281) class281).anInt3290;
        int i_30_ = ((Class281) class281).anInt3279;
        if ((i_29_ ^ 0xffffffff) != -1 || i_30_ != 0 || ((Class281) class281).anInt3293 != 0 || (((Class281) class281).anInt3303 ^ 0xffffffff) != -1)
            i_26_ |= 0x7;
        boolean bool = ((((Entity) this).aByte10450 ^ 0xffffffff) != -1 && ((Node_Sub18.anInt7027 ^ 0xffffffff) <= (((Entity) this).anInt10479 ^ 0xffffffff)) && ((Node_Sub18.anInt7027 ^ 0xffffffff) > (((Entity) this).anInt10421 ^ 0xffffffff)));
        if (bool)
            i_26_ |= 0x80000;
        int i_31_ = ((Entity) this).aClass109_10471.method759((byte) -100);
        Class162 class162 = (((Entity) this).aClass162Array10502[0] = (((NPC) this).aClass255_10614.method2738(((Entity) this).anIntArray10425, class182, 32, ((NPC) this).aClass122_10612, i_26_, Class301_Sub3_Sub1.aClass131_9974, class182_28_, ((Entity) this).anInt10420, ((Entity) this).anInt10407, ((Entity) this).anInt10466, Node_Sub43.aClass291_7306, ((Entity) this).anInt10448, ((Entity) this).anInt10488, var_ha, ((Entity) this).anInt10478, i_31_, ((Entity) this).aClass286Array10463, Class235.aClass356_2617)));
        if (class162 == null)
            return false;
        ((Entity) this).height = class162.fa();
        ((Entity) this).anInt10456 = class162.ma();
        this.method3633(0, class162);
        if (i_29_ == 0 && i_30_ == 0)
            this.method3634(this.method3632(-1) << 1984115209, 0, this.method3632(-1) << -792369015, i_31_, -17993, 0);
        else {
            this.method3634(i_29_, ((Class281) class281).anInt3305, i_30_, i_31_, -17993, ((Class281) class281).anInt3314);
            if (((Entity) this).anInt10423 != 0)
                ((Entity) this).aClass162Array10502[0].FA(((Entity) this).anInt10423);
            if (((Entity) this).anInt10482 != 0)
                ((Entity) this).aClass162Array10502[0].VA(((Entity) this).anInt10482);
            if (((Entity) this).anInt10447 != 0)
                ((Entity) this).aClass162Array10502[0].H(0, ((Entity) this).anInt10447, 0);
        }
        if (bool)
            class162.method1433(((Entity) this).aByte10477, ((Entity) this).aByte10413, ((Entity) this).aByte10485, (((Entity) this).aByte10450 & 0xff));
        this.method3646(i_29_, i_27_, i_31_, class281, i_30_, var_ha, false);
        return true;
    }

    final int method3640(byte i) {
        anInt10598++;
        if (i <= 80)
            ((NPC) this).anInt10599 = 87;
        if ((((Class255) ((NPC) this).aClass255_10614).anIntArray2923) != null) {
            Class255 class255 = ((NPC) this).aClass255_10614.method2737((byte) 103, Node_Sub43.aClass291_7306);
            if (class255 != null && ((Class255) class255).anInt2869 != -1)
                return ((Class255) class255).anInt2869;
        }
        return (((Class255) ((NPC) this).aClass255_10614).anInt2869);
    }

    final boolean method3579(ha var_ha, int i, int i_32_, byte i_33_) {
        anInt10586++;
        if (((NPC) this).aClass255_10614 == null || !method3667((byte) -120, 131072, var_ha))
            return false;
        Viewport viewport = var_ha.o();
        int i_34_ = ((Entity) this).aClass109_10471.method759((byte) -100);
        viewport.method1857(i_34_);
        viewport.method1862(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        boolean bool = false;
        for (int i_35_ = 0; ((((Entity) this).aClass162Array10502.length ^ 0xffffffff) < (i_35_ ^ 0xffffffff)); i_35_++) {
            if (((Entity) this).aClass162Array10502[i_35_] != null) {
                boolean bool_36_ = ((((Class255) (((NPC) this).aClass255_10614)).anInt2870 ^ 0xffffffff) < -1 || ((((Class255) (((NPC) this).aClass255_10614)).anInt2865 ^ 0xffffffff) == 0 ? ((Class255) (((NPC) this).aClass255_10614)).size == 1 : (((Class255) ((NPC) this).aClass255_10614).anInt2865 ^ 0xffffffff) == -2));
                boolean bool_37_;
                if (Class357.aBoolean4416)
                    bool_37_ = (((Entity) this).aClass162Array10502[i_35_].method1420(i_32_, i, viewport, bool_36_, ((Class255) (((NPC) this).aClass255_10614)).anInt2870, ObjectDefinition.anInt3100));
                else
                    bool_37_ = (((Entity) this).aClass162Array10502[i_35_].method1437(i_32_, i, viewport, bool_36_, ((Class255) (((NPC) this).aClass255_10614)).anInt2870));
                if (bool_37_) {
                    bool = true;
                    break;
                }
            }
        }
        if (i_33_ != 103)
            ((NPC) this).anInt10595 = 89;
        ((Entity) this).aClass162Array10502[0] = ((Entity) this).aClass162Array10502[1] = ((Entity) this).aClass162Array10502[2] = null;
        return bool;
    }

    static final void method3668(int i, ha var_ha, int i_38_, int i_39_, Class293 class293) {
        anInt10603++;
        Class102.aClass293_1308.method3121(10);
        if (!Class141.aBoolean5059) {
            for (Node_Sub35 class248_sub35 = (Node_Sub35) class293.method3119(2); class248_sub35 != null; class248_sub35 = (Node_Sub35) class293.method3107(-128)) {
                Class56 class56 = Class116.aClass257_1436.method2750((byte) 118, (((Node_Sub35) class248_sub35).anInt7243));
                if (Class84_Sub6.method617(class56, 7)) {
                    boolean bool = Class26.method248(class56, i, i_38_, -1789756095, var_ha, class248_sub35);
                    if (bool)
                        Class94.method692(class248_sub35, var_ha, class56, 6983);
                }
            }
            if (i_39_ != -4201)
                method3662(null, false);
        }
    }

    private final boolean method3669(int i) {
        if (i != -2)
            return true;
        anInt10613++;
        return (((Class255) ((NPC) this).aClass255_10614).aBoolean2911);
    }

    final void method3670(byte i, Class255 class255) {
        anInt10607++;
        ((NPC) this).aClass255_10614 = class255;
        if (((NPC) this).aClass255_10614 != null) {
            ((NPC) this).anInt10608 = ((Class255) (((NPC) this).aClass255_10614)).anInt2858;
            ((NPC) this).aString10604 = ((Class255) (((NPC) this).aClass255_10614)).aString2915;
        }
        if (i <= -76) {
            if (((Entity) this).aClass346_Sub8_10506 != null)
                ((Entity) this).aClass346_Sub8_10506.method3713();
        }
    }

    final void method3671(int i, byte i_40_, int i_41_) {
        anInt10588++;
        int i_42_ = ((Entity) this).posQueueX[0];
        if (i_40_ < -72) {
            int i_43_ = ((Entity) this).posQueueY[0];
            if ((i_41_ ^ 0xffffffff) == -1)
                i_43_++;
            if ((i_41_ ^ 0xffffffff) == -2) {
                i_43_++;
                i_42_++;
            }
            if (i_41_ == 2)
                i_42_++;
            if ((i_41_ ^ 0xffffffff) == -4) {
                i_43_--;
                i_42_++;
            }
            if (i_41_ == 4)
                i_43_--;
            if (i_41_ == 5) {
                i_42_--;
                i_43_--;
            }
            if ((i_41_ ^ 0xffffffff) == -7)
                i_42_--;
            if ((i_41_ ^ 0xffffffff) == -8) {
                i_43_++;
                i_42_--;
            }
            if (((Entity) this).anInt10444 != -1 && (((Class182) (Class235.aClass356_2617.method3790((byte) -90, (((Entity) this).anInt10444)))).anInt2105 ^ 0xffffffff) == -2) {
                ((Entity) this).anInt10444 = -1;
                ((Entity) this).anIntArray10414 = null;
            }
            for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > ((((Entity) this).aClass305Array10441).length ^ 0xffffffff); i_44_++) {
                if ((((Class305) (((Entity) this).aClass305Array10441[i_44_])).anInt3537 ^ 0xffffffff) != 0) {
                    Class51 class51 = (Class279_Sub2.aClass151_7577.method1353((((Class305) (((Entity) this).aClass305Array10441[i_44_])).anInt3537), -1));
                    if (((Class51) class51).aBoolean682 && (((Class51) class51).anInt690 ^ 0xffffffff) != 0 && ((((Class182) Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51).anInt690))).anInt2105) ^ 0xffffffff) == -2)
                        ((Class305) (((Entity) this).aClass305Array10441[i_44_])).anInt3537 = -1;
                }
            }
            if ((((Entity) this).anInt10503 ^ 0xffffffff) > -10)
                ((Entity) this).anInt10503++;
            for (int i_45_ = ((Entity) this).anInt10503; (i_45_ ^ 0xffffffff) < -1; i_45_--) {
                ((Entity) this).posQueueX[i_45_] = (((Entity) this).posQueueX[-1 + i_45_]);
                ((Entity) this).posQueueY[i_45_] = (((Entity) this).posQueueY[-1 + i_45_]);
                ((Entity) this).aByteArray10499[i_45_] = (((Entity) this).aByteArray10499[-1 + i_45_]);
            }
            ((Entity) this).posQueueX[0] = i_42_;
            ((Entity) this).aByteArray10499[0] = (byte) i;
            ((Entity) this).posQueueY[0] = i_43_;
        }
    }

    public NPC() {
        ((NPC) this).anInt10594 = -1;
        ((NPC) this).anInt10599 = 1;
    }
}
