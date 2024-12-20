/* Class346_Sub7_Sub2_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Player extends Entity {
    int anInt10532;
    static int anInt10533;
    static Class317 aClass317_10534;
    static int anInt10535;
    int anInt10536;
    static int anInt10537;
    static int anInt10538;
    static int anInt10539;
    static int anInt10540;
    int anInt10541 = -1;
    int anInt10542;
    static int anInt10543;
    static boolean aBoolean10544 = false;
    int anInt10545;
    int anInt10546;
    private byte aByte10547;
    static int anInt10548;
    Class332 aClass332_10549;
    String aString10550;
    static int anInt10551;
    int anInt10552;
    int anInt10553;
    static int anInt10554;
    String name;
    static int anInt10556;
    static int anInt10557;
    static int anInt10558;
    int anInt10559;
    int anInt10560;
    boolean aBoolean10561;
    int anInt10562;
    static int anInt10563;
    static int anInt10564;
    boolean aBoolean10565;
    int anInt10566;
    static int anInt10567;
    static int anInt10568;
    static int anInt10569;
    boolean aBoolean10570;
    private int renderId;
    int anInt10572;
    int anInt10573;
    static int anInt10574;
    static int anInt10575;
    boolean aBoolean10576;
    int anInt10577;
    private byte aByte10578;
    static int anInt10579;
    static int anInt10580;
    int anInt10581;
    static int anInt10582;
    private byte aByte10583;
    static int anInt10584;
    boolean aBoolean10585;

    final int method3632(int i) {
        anInt10563++;
        if (((Player) this).aClass332_10549 != null && ((Class332) (((Player) this).aClass332_10549)).anInt3879 != -1)
            return ((Class255) (Class148.aClass119_5096.method1123(((Class332) ((Player) this).aClass332_10549).anInt3879, 8881))).size;
        if (i != -1)
            aClass317_10534 = null;
        return super.method3632(-1);
    }

    final int method3647(byte i) {
        int i_0_ = 35 % ((i - 64) / 59);
        anInt10551++;
        return renderId;
    }

    final void method3649(byte i, boolean bool, int i_1_, int i_2_) {
        anInt10582++;
        if ((((Entity) this).anInt10503 ^ 0xffffffff) > -10)
            ((Entity) this).anInt10503++;
        if (bool != true)
            method3572(null, null, -71, 127, 93, false, -27);
        for (int i_3_ = ((Entity) this).anInt10503; i_3_ > 0; i_3_--) {
            ((Entity) this).posQueueX[i_3_] = ((Entity) this).posQueueX[-1 + i_3_];
            ((Entity) this).posQueueY[i_3_] = ((Entity) this).posQueueY[i_3_ - 1];
            ((Entity) this).aByteArray10499[i_3_] = ((Entity) this).aByteArray10499[-1 + i_3_];
        }
        ((Entity) this).posQueueX[0] = i_2_;
        ((Entity) this).posQueueY[0] = i_1_;
        ((Entity) this).aByteArray10499[0] = i;
    }

    final boolean method3650(byte i) {
        anInt10558++;
        if (((Player) this).aClass332_10549 == null)
            return false;
        if (i != -84)
            return true;
        return true;
    }

    final void method3573(ha var_ha, byte i) {
        anInt10575++;
        if (((Player) this).aClass332_10549 != null) {
            if (i <= 121)
                ((Player) this).anInt10581 = 6;
            if (((Entity) this).aBoolean10504 || method3659(0, false, var_ha)) {
                Viewport viewport = var_ha.o();
                viewport.method1857(((Entity) this).aClass109_10471.method759((byte) -78));
                viewport.method1862(((Interactable) this).x, -5 + ((Interactable) this).anInt8317, ((Interactable) this).y);
                this.method3639((((Entity) this).aClass162Array10502), var_ha, (byte) -76, viewport, (((Entity) this).aBoolean10504));
                for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > ((((Entity) this).aClass162Array10502).length ^ 0xffffffff); i_4_++)
                    ((Entity) this).aClass162Array10502[i_4_] = null;
            }
        }
    }

    final boolean method3579(ha var_ha, int i, int i_5_, byte i_6_) {
        anInt10548++;
        if (((Player) this).aClass332_10549 == null || !method3659(131072, false, var_ha))
            return false;
        Viewport viewport = var_ha.o();
        int i_7_ = ((Entity) this).aClass109_10471.method759((byte) -101);
        viewport.method1857(i_7_);
        viewport.method1862(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        boolean bool = false;
        if (i_6_ != 103)
            return true;
        for (int i_8_ = 0; (((Entity) this).aClass162Array10502.length > i_8_); i_8_++) {
            if ((((Entity) this).aClass162Array10502[i_8_] != null) && (!Class357.aBoolean4416 ? ((Entity) this).aClass162Array10502[i_8_].method1437(i_5_, i, viewport, true, 0) : (((Entity) this).aClass162Array10502[i_8_].method1420(i_5_, i, viewport, true, 0, ObjectDefinition.anInt3100)))) {
                bool = true;
                break;
            }
        }
        ((Entity) this).aClass162Array10502[0] = ((Entity) this).aClass162Array10502[1] = ((Entity) this).aClass162Array10502[2] = null;
        return bool;
    }

    final void parseAppearance(boolean bool, ByteStream apperanceBlock) {
        anInt10567++;
        ((ByteStream) apperanceBlock).offset = 0;
        int i = apperanceBlock.readUnsignedByte((byte) -67);
        aByte10547 = (byte) (0x1 & i);
        boolean bool_9_ = ((Player) this).aBoolean10570;
        ((Player) this).aBoolean10570 = (i & 0x2) != 0;
        boolean bool_10_ = (i & 0x4 ^ 0xffffffff) != -1;
        int i_11_ = super.method3632(-1);
        this.setSize((byte) 121, (i >> -910677501 & 0x7) + 1);
        aByte10578 = (byte) (0x3 & i >> -1375732858);
        ((Interactable) this).x += method3632(-1) + -i_11_ << -757309912;
        ((Interactable) this).y += method3632(-1) - i_11_ << -731408472;
        aByte10583 = apperanceBlock.readByte(123);
        ((Player) this).anInt10562 = apperanceBlock.readByte(66);
        ((Player) this).anInt10560 = apperanceBlock.readByte(92);
        ((Player) this).aBoolean10585 = apperanceBlock.readByte(110) == 1;
        if (s_Sub2.aClass339_7951 == Class18.aClass339_295 && Class226_Sub1_Sub1.anInt8801 >= 2)
            ((Player) this).aBoolean10585 = false;
        int i_12_ = -1;
        ((Player) this).anInt10542 = 0;
        int[] is = new int[12];
        for (int lookIndex = 0; lookIndex < 12; lookIndex++) {
            int lookId = apperanceBlock.readUnsignedByte((byte) 120);
            if ((lookId ^ 0xffffffff) == -1)
                is[lookIndex] = 0;
            else {
                int i_15_ = apperanceBlock.readUnsignedByte((byte) -113);
                int i_16_ = i_15_ + (lookId << -1173707544);
                if ((lookIndex ^ 0xffffffff) == -1 && i_16_ == 65535) {
                    i_12_ = apperanceBlock.readShort(-1);
                    ((Player) this).anInt10542 = apperanceBlock.readUnsignedByte((byte) -77);
                    break;
                }
                if (i_16_ >= 32768) {
                    i_16_ = Class269_Sub2.anIntArray7543[i_16_ - 32768];
                    is[lookIndex] = Class358.retrieveLooksSettings(i_16_, 1073741824);
                    int i_17_ = (((Class321) Class283.aClass342_3343.method3482((byte) 113, i_16_)).anInt3723);
                    if (i_17_ != 0)
                        ((Player) this).anInt10542 = i_17_;
                } else
                    is[lookIndex] = Class358.retrieveLooksSettings(i_16_ - 256, -2147483648);
            }
        }
        int[] is_18_ = new int[5];
        int i_19_ = 0;
        if (bool != true)
            method3657(-57, false);
        for (/**/; i_19_ < 5; i_19_++) {
            int i_20_ = apperanceBlock.readUnsignedByte((byte) -29);
            if (((Class226_Sub2.aShortArrayArrayArray6667.length ^ 0xffffffff) > -2) || (i_20_ ^ 0xffffffff) > -1 || i_20_ >= (Class226_Sub2.aShortArrayArrayArray6667[0][i_19_]).length)
                i_20_ = 0;
            is_18_[i_19_] = i_20_;
        }
        renderId = apperanceBlock.readShort(-1);
        ((Player) this).name = apperanceBlock.readString(15598);
        ((Player) this).aString10550 = ((Player) this).name;
        if (Class347.myPlayer == this)
            Node_Sub14_Sub14.aString9306 = ((Player) this).name;
        ((Player) this).anInt10546 = apperanceBlock.readUnsignedByte((byte) -81);
        if (bool_10_) {
            ((Player) this).anInt10545 = apperanceBlock.readShort(-1);
            ((Player) this).anInt10541 = -1;
            if ((((Player) this).anInt10545 ^ 0xffffffff) == -65536)
                ((Player) this).anInt10545 = -1;
            ((Player) this).anInt10573 = ((Player) this).anInt10546;
        } else {
            ((Player) this).anInt10545 = 0;
            ((Player) this).anInt10573 = apperanceBlock.readUnsignedByte((byte) 74);
            ((Player) this).anInt10541 = apperanceBlock.readUnsignedByte((byte) -67);
            if ((((Player) this).anInt10541 ^ 0xffffffff) == -256)
                ((Player) this).anInt10541 = -1;
        }
        int i_21_ = ((Player) this).anInt10553;
        ((Player) this).anInt10553 = apperanceBlock.readUnsignedByte((byte) 126);
        if (((Player) this).anInt10553 == 0)
            Class150.method1345(1073741823, this);
        else {
            int i_22_ = ((Player) this).anInt10572;
            int i_23_ = ((Player) this).anInt10552;
            int i_24_ = ((Player) this).anInt10577;
            int i_25_ = ((Player) this).anInt10532;
            int i_26_ = ((Player) this).anInt10566;
            ((Player) this).anInt10572 = apperanceBlock.readShort(-1);
            ((Player) this).anInt10552 = apperanceBlock.readShort(-1);
            ((Player) this).anInt10577 = apperanceBlock.readShort(-1);
            ((Player) this).anInt10532 = apperanceBlock.readShort(-1);
            ((Player) this).anInt10566 = apperanceBlock.readUnsignedByte((byte) -115);
            if ((!((Player) this).aBoolean10570 != !bool_9_) || ((Player) this).anInt10553 != i_21_ || ((Player) this).anInt10572 != i_22_ || ((Player) this).anInt10552 != i_23_ || i_24_ != ((Player) this).anInt10577 || ((i_25_ ^ 0xffffffff) != (((Player) this).anInt10532 ^ 0xffffffff)) || ((Player) this).anInt10566 != i_26_)
                Node_Sub8_Sub14.method2124(this, 0);
        }
        if (((Player) this).aClass332_10549 == null)
            ((Player) this).aClass332_10549 = new Class332();
        int i_27_ = (((Class332) ((Player) this).aClass332_10549).anInt3879);
        int[] is_28_ = (((Class332) ((Player) this).aClass332_10549).colors);
        ((Player) this).aClass332_10549.method3406((aByte10547 ^ 0xffffffff) == -2, is, 75, i_12_, method3647((byte) 123), is_18_);
        if (i_27_ != i_12_) {
            ((Interactable) this).x = (((Entity) this).posQueueX[0] << 1026654409) - -(method3632(-1) << -1072527224);
            ((Interactable) this).y = (((Entity) this).posQueueY[0] << -535969751) - -(method3632(-1) << -507983672);
        }
        if (((Class282_Sub29.anInt7896 ^ 0xffffffff) == (((Entity) this).anInt10484 ^ 0xffffffff)) && is_28_ != null) {
            for (int i_29_ = 0; i_29_ < is_18_.length; i_29_++) {
                if ((is_18_[i_29_] ^ 0xffffffff) != (is_28_[i_29_] ^ 0xffffffff)) {
                    Class283.aClass342_3343.method3492((byte) 103);
                    break;
                }
            }
        }
        if (((Entity) this).aClass346_Sub8_10506 != null)
            ((Entity) this).aClass346_Sub8_10506.method3713();
        if (((Entity) this).anInt10434 != -1 && ((Entity) this).aBoolean10491) {
            Class281 class281 = this.method3642(0);
            if (!class281.method2909((((Entity) this).anInt10434), -29592)) {
                ((Entity) this).aBoolean10491 = false;
                ((Entity) this).anInt10434 = -1;
            }
        }
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_30_, int i_31_, boolean bool, int i_32_) {
        if (i_30_ > 109) {
            anInt10538++;
            throw new IllegalStateException();
        }
    }

    static final Class208[] method3652(boolean bool) {
        if (bool != false)
            method3652(false);
        anInt10579++;
        return (new Class208[]{Class344.aClass208_4082, Class299.aClass208_3492, Class160.aClass208_1887, Class226_Sub1_Sub1.aClass208_8803, Class87.aClass208_1082, Class94.aClass208_1224, Class352.aClass208_4189, Class276.aClass208_3207, Class169.aClass208_1973, Class377.aClass208_4621});
    }

    final void method3653(int i, int i_33_, byte i_34_) {
        ((Entity) this).anInt10505 = 0;
        ((Entity) this).posQueueX[0] = i_33_;
        if (i_34_ > -27)
            aClass317_10534 = null;
        ((Entity) this).anInt10500 = 0;
        ((Entity) this).anInt10503 = 0;
        anInt10543++;
        ((Entity) this).posQueueY[0] = i;
        int i_35_ = method3632(-1);
        ((Interactable) this).y = (((Entity) this).posQueueY[0] * 512 + i_35_ * 256);
        ((Interactable) this).x = (256 * i_35_ + ((Entity) this).posQueueX[0] * 512);
        if (Class347.myPlayer == this)
            Class332.method3400(1);
        if (((Entity) this).aClass346_Sub8_10506 != null)
            ((Entity) this).aClass346_Sub8_10506.method3713();
    }

    final Class38 method3575(byte i, ha var_ha) {
        anInt10569++;
        if (i > -86)
            ((Player) this).anInt10542 = -88;
        return null;
    }

    final void method3654(byte i, int i_36_, int i_37_, int i_38_) {
        anInt10556++;
        if (i_36_ != (((Entity) this).anInt10444 ^ 0xffffffff) && ((((Class182) Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10444)).anInt2105) ^ 0xffffffff) == -2) {
            ((Entity) this).anIntArray10414 = null;
            ((Entity) this).anInt10444 = -1;
        }
        for (int i_39_ = 0; ((((Entity) this).aClass305Array10441.length ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
            if ((((Class305) (((Entity) this).aClass305Array10441[i_39_])).anInt3537 ^ 0xffffffff) != 0) {
                Class51 class51 = (Class279_Sub2.aClass151_7577.method1353(((Class305) (((Entity) this).aClass305Array10441[i_39_])).anInt3537, -1));
                if (((Class51) class51).aBoolean682 && ((Class51) class51).anInt690 != -1 && (((Class182) Class235.aClass356_2617.method3790((byte) -90, (((Class51) class51).anInt690))).anInt2105) == 1)
                    ((Class305) (((Entity) this).aClass305Array10441[i_39_])).anInt3537 = -1;
            }
        }
        ((Player) this).anInt10536 = -1;
        if ((i_38_ ^ 0xffffffff) <= -1 && (i_38_ ^ 0xffffffff) > (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) && i_37_ >= 0 && i_37_ < Node_Sub22.anInt7074) {
            if ((((Entity) this).posQueueX[0] ^ 0xffffffff) > -1 || (Node_Sub8_Sub4.anInt8360 <= ((Entity) this).posQueueX[0]) || (((Entity) this).posQueueY[0] ^ 0xffffffff) > -1 || (Node_Sub22.anInt7074 <= ((Entity) this).posQueueY[0]))
                method3653(i_37_, i_38_, (byte) -72);
            else {
                if ((i ^ 0xffffffff) == -3)
                    Class89.method669((byte) 2, -51, i_37_, i_38_, this);
                method3649(i, true, i_37_, i_38_);
            }
        } else
            method3653(i_37_, i_38_, (byte) -46);
    }

    final String method3655(byte i, boolean bool) {
        anInt10554++;
        int i_40_ = 116 % ((i - -51) / 48);
        if (bool)
            return ((Player) this).name;
        return ((Player) this).aString10550;
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10537++;
        if (((Player) this).aClass332_10549 == null || !method3659(2048, false, var_ha))
            return null;
        Viewport viewport = var_ha.o();
        int i_41_ = ((Entity) this).aClass109_10471.method759((byte) -108);
        viewport.method1857(i_41_);
        Class137 class137 = (Class311.aClass137ArrayArrayArray3620[((Interactable) this).plane][((Interactable) this).x >> Class96.anInt1249][((Interactable) this).y >> Class96.anInt1249]);
        if (class137 == null || ((Class137) class137).aClass346_Sub7_Sub4_1645 == null)
            ((Entity) this).anInt10411 -= (float) ((Entity) this).anInt10411 / 10.0F;
        else {
            int i_42_ = (((Entity) this).anInt10411 + -(((Class346_Sub7_Sub4) ((Class137) class137).aClass346_Sub7_Sub4_1645).aShort9947));
            ((Entity) this).anInt10411 -= (float) i_42_ / 10.0F;
        }
        viewport.method1862(((Interactable) this).x, (-((Entity) this).anInt10411 + (((Interactable) this).anInt8317 - 20)), ((Interactable) this).y);
        Class346_Sub10 class346_sub10 = null;
        ((Entity) this).aBoolean10501 = false;
        if (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363.method3031(true) == 1) {
            Class281 class281 = this.method3642(i ^ 0xffffffff);
            if (((Class281) class281).aBoolean3311 && ((((Class332) (((Player) this).aClass332_10549)).anInt3879 ^ 0xffffffff) == 0 || ((Class255) (Class148.aClass119_5096.method1123(((Class332) (((Player) this).aClass332_10549)).anInt3879, 8881))).aBoolean2854)) {
                Class182 class182 = ((((Entity) this).anInt10444 != -1 && (((Entity) this).anInt10424 ^ 0xffffffff) == -1) ? (Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10444)) : null);
                Class182 class182_43_ = (((((Entity) this).anInt10434 ^ 0xffffffff) != 0 && !((Player) this).aBoolean10561 && (!((Entity) this).aBoolean10491 || class182 == null)) ? (Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10434)) : null);
                Class162 class162 = (Class64.method489(((Entity) this).anInt10482, (((Entity) this).aClass162Array10502[0]), 1, var_ha, ((Entity) this).anInt10447, ((Entity) this).anInt10423, (class182_43_ == null ? ((Entity) this).anInt10420 : ((Entity) this).anInt10448), i_41_, 160, 240, 0, class182_43_ == null ? class182 : class182_43_, (byte) -54, 0));
                if (class162 != null) {
                    class346_sub10 = (Class282_Sub21.method3013(true, (byte) 122, (((Entity) this).aClass162Array10502).length + 1));
                    ((Entity) this).aBoolean10501 = true;
                    var_ha.C(false);
                    if (!Class357.aBoolean4416)
                        class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[(((Entity) this).aClass162Array10502).length]), 0);
                    else
                        class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[(((Entity) this).aClass162Array10502).length]), ObjectDefinition.anInt3100, 0);
                    var_ha.C(true);
                }
            }
        }
        if (this == Class347.myPlayer) {
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            for (int i_44_ = -1 + Class225_Sub3.aClass7Array8477.length; (i_44_ ^ 0xffffffff) <= -1; i_44_--) {
                Class7 class7 = Class225_Sub3.aClass7Array8477[i_44_];
                if (class7 != null && (((Class7) class7).anInt158 ^ 0xffffffff) != 0) {
                    if (((Class7) class7).anInt169 == 1) {
                        Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) ((Class7) class7).anInt164, (byte) 31)));
                        if (class248_sub10 != null) {
                            NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                            int i_45_ = (((Interactable) NPC).x + -(((Interactable) (Class347.myPlayer)).x));
                            int i_46_ = (-(((Interactable) (Class347.myPlayer)).y) + ((Interactable) NPC).y);
                            if (!Class357.aBoolean4416)
                                method3660(((Class7) class7).anInt158, viewport, var_ha, i_45_, i_46_, 92160000, (byte) 36, (((Entity) this).aClass162Array10502[0]));
                            else
                                method3658(ObjectDefinition.anInt3100, (((Entity) this).aClass162Array10502[0]), i_45_, i_46_, -60, 92160000, ((Class7) class7).anInt158, var_ha, viewport);
                        }
                    }
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -3) {
                        int i_47_ = (256 + ((Class7) class7).anInt159 - (((Interactable) Class347.myPlayer).x));
                        int i_48_ = (-(((Interactable) Class347.myPlayer).y) + 256 + ((Class7) class7).anInt163);
                        int i_49_ = ((Class7) class7).anInt168 << 1288003113;
                        i_49_ *= i_49_;
                        if (!Class357.aBoolean4416)
                            method3660(((Class7) class7).anInt158, viewport, var_ha, i_47_, i_48_, i_49_, (byte) 36, (((Entity) this).aClass162Array10502[0]));
                        else
                            method3658(ObjectDefinition.anInt3100, (((Entity) this).aClass162Array10502[0]), i_47_, i_48_, -99, i_49_, ((Class7) class7).anInt158, var_ha, viewport);
                    }
                    if ((((Class7) class7).anInt169 ^ 0xffffffff) == -11 && (((Class7) class7).anInt164 ^ 0xffffffff) <= -1 && (((Node_Sub32.aPlayerArray7197).length ^ 0xffffffff) < (((Class7) class7).anInt164 ^ 0xffffffff))) {
                        Player player_50_ = (Node_Sub32.aPlayerArray7197[((Class7) class7).anInt164]);
                        if (player_50_ != null) {
                            int i_51_ = (-(((Interactable) (Class347.myPlayer)).x) + (((Interactable) player_50_).x));
                            int i_52_ = (-(((Interactable) (Class347.myPlayer)).y) + (((Interactable) player_50_).y));
                            if (Class357.aBoolean4416)
                                method3658(ObjectDefinition.anInt3100, (((Entity) this).aClass162Array10502[0]), i_51_, i_52_, -113, 92160000, ((Class7) class7).anInt158, var_ha, viewport);
                            else
                                method3660(((Class7) class7).anInt158, viewport, var_ha, i_51_, i_52_, 92160000, (byte) 36, (((Entity) this).aClass162Array10502[0]));
                        }
                    }
                }
            }
            viewport.method1857(i_41_);
            viewport.method1862(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        }
        viewport.method1857(i_41_);
        viewport.method1862(((Interactable) this).x, (-5 + ((Interactable) this).anInt8317 + -((Entity) this).anInt10411), ((Interactable) this).y);
        if (class346_sub10 == null)
            class346_sub10 = Class282_Sub21.method3013(true, (byte) 113, (((Entity) this).aClass162Array10502).length);
        this.method3639(((Entity) this).aClass162Array10502, var_ha, (byte) -112, viewport, false);
        if (Class357.aBoolean4416) {
            for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > ((((Entity) this).aClass162Array10502).length ^ 0xffffffff); i_53_++) {
                if (((Entity) this).aClass162Array10502[i_53_] != null)
                    ((Entity) this).aClass162Array10502[i_53_].method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[i_53_]), ObjectDefinition.anInt3100, (Class347.myPlayer != this ? 0 : 1));
            }
        } else {
            for (int i_54_ = 0; (((Entity) this).aClass162Array10502.length > i_54_); i_54_++) {
                if (((Entity) this).aClass162Array10502[i_54_] != null)
                    ((Entity) this).aClass162Array10502[i_54_].method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[i_54_]), (Class347.myPlayer == this ? 1 : 0));
            }
        }
        if (((Entity) this).aClass346_Sub8_10506 != null) {
            Class338 class338 = ((Entity) this).aClass346_Sub8_10506.method3714();
            if (Class357.aBoolean4416)
                var_ha.a(class338, ObjectDefinition.anInt3100);
            else
                var_ha.a(class338);
        }
        if (i != -1)
            method3578(3, null);
        for (int i_55_ = 0; ((((Entity) this).aClass162Array10502.length ^ 0xffffffff) < (i_55_ ^ 0xffffffff)); i_55_++) {
            if (((Entity) this).aClass162Array10502[i_55_] != null)
                ((Entity) this).aBoolean10501 |= ((Entity) this).aClass162Array10502[i_55_].F();
            ((Entity) this).aClass162Array10502[i_55_] = null;
        }
        ((Entity) this).anInt10445 = Class54.anInt727;
        return class346_sub10;
    }

    final void method3577(int i) {
        anInt10533++;
        if (i != 131072)
            ((Player) this).anInt10573 = -16;
        throw new IllegalStateException();
    }

    public static void method3656(int i) {
        aClass317_10534 = null;
        if (i != 9600)
            method3656(-96);
    }

    final int method3640(byte i) {
        if (i < 80)
            ((Player) this).aBoolean10565 = true;
        anInt10564++;
        return -1;
    }

    final String method3657(int i, boolean bool) {
        anInt10574++;
        String string = "";
        if (i != -116)
            return null;
        if (Class101.aStringArray1286 != null)
            string += Class101.aStringArray1286[aByte10578];
        int[] is;
        if ((aByte10547 ^ 0xffffffff) != -2 || Class282_Sub23.anIntArray7830 == null)
            is = client.anIntArray5241;
        else
            is = Class282_Sub23.anIntArray7830;
        if (is != null && (is[aByte10578] ^ 0xffffffff) != 0) {
            Class218 class218 = Class346_Sub7_Sub1_Sub2.aClass259_10206.method2758(is[aByte10578], (byte) -82);
            if ((((Class218) class218).aChar2493 ^ 0xffffffff) == -116)
                string += class218.method1750(-125, 0xff & aByte10583);
            else {
                Class282_Sub14.method2975("gdn1", new Throwable(), 1);
                is[aByte10578] = -1;
            }
        }
        if (!bool)
            string += ((Player) this).aString10550;
        else
            string += ((Player) this).name;
        if (Class226.aStringArray2546 != null)
            string += Class226.aStringArray2546[aByte10578];
        return string;
    }

    final boolean method3568(int i) {
        anInt10540++;
        int i_56_ = -42 / ((53 - i) / 45);
        return false;
    }

    private final void method3658(int i, Class162 class162, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, ha var_ha, Viewport viewport) {
        anInt10568++;
        int i_62_ = i_57_ * i_57_ + i_58_ * i_58_;
        if (i_59_ >= -32)
            ((Player) this).anInt10581 = -35;
        if (i_62_ >= 262144 && (i_60_ ^ 0xffffffff) <= (i_62_ ^ 0xffffffff)) {
            int i_63_ = 0x3fff & (int) (Math.atan2((double) i_57_, (double) i_58_) * 2607.5945876176133);
            Class162 class162_64_ = (Class79.method577(((Entity) this).anInt10482, var_ha, (byte) 63, ((Entity) this).anInt10423, i_61_, ((Entity) this).anInt10447, i_63_));
            if (class162_64_ != null) {
                var_ha.C(false);
                class162_64_.method1441(viewport, null, i, 0);
                var_ha.C(true);
            }
        }
    }

    private final boolean method3659(int i, boolean bool, ha var_ha) {
        anInt10580++;
        int i_65_ = i;
        Class281 class281 = this.method3642(0);
        if (bool != false)
            parseAppearance(true, null);
        Class182 class182 = ((((Entity) this).anInt10444 != -1 && ((Entity) this).anInt10424 == 0) ? Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10444) : null);
        Class182 class182_66_ = (((((Entity) this).anInt10434 ^ 0xffffffff) == 0 || ((Player) this).aBoolean10561 || (((Entity) this).aBoolean10491 && class182 != null)) ? null : Class235.aClass356_2617.method3790((byte) -90, ((Entity) this).anInt10434));
        int i_67_ = ((Class281) class281).anInt3290;
        int i_68_ = ((Class281) class281).anInt3279;
        if (i_67_ != 0 || i_68_ != 0 || (((Class281) class281).anInt3293 ^ 0xffffffff) != -1 || (((Class281) class281).anInt3303 ^ 0xffffffff) != -1)
            i |= 0x7;
        int i_69_ = ((Entity) this).aClass109_10471.method759((byte) -59);
        boolean bool_70_ = ((((Entity) this).aByte10450 ^ 0xffffffff) != -1 && ((((Entity) this).anInt10479 ^ 0xffffffff) >= (Node_Sub18.anInt7027 ^ 0xffffffff)) && ((Node_Sub18.anInt7027 ^ 0xffffffff) > (((Entity) this).anInt10421 ^ 0xffffffff)));
        if (bool_70_)
            i |= 0x80000;
        Class162 class162 = (((Entity) this).aClass162Array10502[0] = (((Player) this).aClass332_10549.method3404(Class235.aClass356_2617, ((Entity) this).anInt10478, true, Class283.aClass342_3343, 124, var_ha, ((Entity) this).anInt10407, ((Entity) this).anIntArray10425, Node_Sub43.aClass291_7306, i, ((Entity) this).aClass286Array10463, class182_66_, Class148.aClass119_5096, ((Entity) this).anInt10420, ((Entity) this).anInt10448, ((Entity) this).anInt10466, i_69_, Class335.aClass172_3908, Class301_Sub3_Sub1.aClass131_9974, ((Entity) this).anInt10488, class182)));
        int i_71_ = Class342.method3481(50);
        if ((Class75.anInt977 ^ 0xffffffff) > -97 && i_71_ > 50)
            Class233.method1843((byte) 90);
        if (s_Sub2.aClass339_7951 == Class18.aClass339_295 || (i_71_ ^ 0xffffffff) <= -51) {
            if (Class18.aClass339_295 != s_Sub2.aClass339_7951) {
                Node_Sub50.aByteArrayArray7444 = new byte[50][];
                Class282_Sub7.anInt7655 = 0;
            }
        } else {
            int i_72_;
            for (i_72_ = -i_71_ + 50; (Class282_Sub7.anInt7655 ^ 0xffffffff) > (i_72_ ^ 0xffffffff); Class282_Sub7.anInt7655++)
                Node_Sub50.aByteArrayArray7444[Class282_Sub7.anInt7655] = new byte[102400];
            while ((i_72_ ^ 0xffffffff) > (Class282_Sub7.anInt7655 ^ 0xffffffff)) {
                Class282_Sub7.anInt7655--;
                Node_Sub50.aByteArrayArray7444[Class282_Sub7.anInt7655] = null;
            }
        }
        if (class162 == null)
            return false;
        ((Entity) this).height = class162.fa();
        ((Entity) this).anInt10456 = class162.ma();
        this.method3633(0, class162);
        if (i_67_ != 0 || i_68_ != 0) {
            this.method3634(i_67_, ((Class281) class281).anInt3305, i_68_, i_69_, -17993, ((Class281) class281).anInt3314);
            if ((((Entity) this).anInt10423 ^ 0xffffffff) != -1)
                class162.FA(((Entity) this).anInt10423);
            if (((Entity) this).anInt10482 != 0)
                class162.VA(((Entity) this).anInt10482);
            if (((Entity) this).anInt10447 != 0)
                class162.H(0, ((Entity) this).anInt10447, 0);
        } else
            this.method3634(method3632(-1) << -1676918103, 0, method3632(-1) << 818320393, i_69_, -17993, 0);
        if (bool_70_)
            class162.method1433(((Entity) this).aByte10477, ((Entity) this).aByte10413, ((Entity) this).aByte10485, 0xff & (((Entity) this).aByte10450));
        if (!((Player) this).aBoolean10561)
            this.method3646(i_67_, i_65_, i_69_, class281, i_68_, var_ha, false);
        return true;
    }

    private final void method3660(int i, Viewport viewport, ha var_ha, int i_73_, int i_74_, int i_75_, byte i_76_, Class162 class162) {
        if (i_76_ != 36)
            method3657(-10, true);
        anInt10539++;
        int i_77_ = i_74_ * i_74_ + i_73_ * i_73_;
        if ((i_77_ ^ 0xffffffff) <= -262145 && i_77_ <= i_75_) {
            int i_78_ = ((int) (Math.atan2((double) i_73_, (double) i_74_) * 2607.5945876176133) & 0x3fff);
            Class162 class162_79_ = (Class79.method577(((Entity) this).anInt10482, var_ha, (byte) 63, ((Entity) this).anInt10423, i, ((Entity) this).anInt10447, i_78_));
            if (class162_79_ != null) {
                var_ha.C(false);
                class162_79_.method1440(viewport, null, 0);
                var_ha.C(true);
            }
        }
    }

    static final void method3661(int i, int i_80_, byte i_81_, int i_82_, int i_83_, int i_84_) {
        if ((i_80_ ^ 0xffffffff) > (Class302.anInt3500 ^ 0xffffffff) || (Class289.anInt3399 ^ 0xffffffff) > (i_82_ ^ 0xffffffff) || (i_83_ ^ 0xffffffff) > (Class181.anInt2099 ^ 0xffffffff) || i > aa_Sub3.anInt5270)
            Class114.method1073(i, i_80_, i_82_, i_83_, -124, i_84_);
        else
            Class259.method2762(i_82_, i_83_, i, i_84_, i_80_, (byte) -58);
        anInt10535++;
        if (i_81_ >= -116)
            method3661(-118, 39, (byte) -77, 126, -71, -116);
    }

    public Player() {
        ((Player) this).anInt10532 = -1;
        ((Player) this).anInt10536 = -1;
        ((Player) this).anInt10545 = 0;
        ((Player) this).anInt10553 = 0;
        ((Player) this).anInt10546 = 0;
        ((Player) this).anInt10562 = -1;
        ((Player) this).aBoolean10565 = false;
        ((Player) this).anInt10560 = -1;
        ((Player) this).anInt10566 = 255;
        aByte10547 = (byte) 0;
        ((Player) this).aBoolean10561 = false;
        ((Player) this).anInt10572 = -1;
        ((Player) this).anInt10577 = -1;
        ((Player) this).aBoolean10576 = false;
        ((Player) this).anInt10552 = -1;
        ((Player) this).anInt10542 = 0;
        aByte10583 = (byte) 0;
        ((Player) this).anInt10573 = 0;
        ((Player) this).aBoolean10570 = false;
        aByte10578 = (byte) 0;
        ((Player) this).aBoolean10585 = false;
    }
}
