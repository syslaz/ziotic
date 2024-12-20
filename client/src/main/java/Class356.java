/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class356 {
    static int anInt4384;
    static int anInt4385;
    static int anInt4386;
    static int anInt4387;
    static int anInt4388;
    private Class381 aClass381_4389;
    private Class278 aClass278_4390 = new Class278(64);
    static Class224 aClass224_4391 = new Class224(14, 0);
    private Class278 aClass278_4392 = new Class278(100);
    static int anInt4393;
    static Class224 js5Opcode = new Class224(15, 4);
    static Class224 aClass224_4395 = new Class224(16, -2);
    static Class224 aClass224_4396 = new Class224(17, 0);
    static Class224 aClass224_4397 = new Class224(18, -2);
    static Class224 aClass224_4398 = new Class224(19, -2);
    static Class224 aClass224_4399 = new Class224(22, -2);
    static Class224 aClass224_4400 = new Class224(23, 4);
    static Class224 aClass224_4401 = new Class224(24, -1);
    static Class224 aClass224_4402 = new Class224(26, 0);
    static Class224 aClass224_4403 = new Class224(27, 0);
    static Class224 aClass224_4404 = new Class224(28, -2);
    private static Class224[] aClass224Array4405 = new Class224[32];

    final void method3784(int i, int i_0_) {
        synchronized (aClass278_4390) {
            aClass278_4390.method2864(i, -15782);
        }
        anInt4388++;
        synchronized (aClass278_4392) {
            aClass278_4392.method2864(i, i_0_ + -6075);
        }
        if (i_0_ != -9707)
            method3790((byte) 125, 120);
    }

    static final void method3785(ha var_ha, int i, int i_1_, int i_2_) {
        if (i_2_ != -284797828)
            method3785(null, -118, 11, -79);
        anInt4384++;
        if ((i_1_ ^ 0xffffffff) <= -1 && i >= 0 && Node_Sub42.anInt7292 != 0 && Class84_Sub9.anInt5498 != 0) {
            int i_3_;
            int i_4_;
            int i_5_;
            int i_6_;
            Viewport viewport;
            int i_7_;
            int i_8_;
            if (Node_Sub8_Sub6.aBoolean8949) {
                Class75.method557(false, 4734);
                viewport = var_ha.t();
                int[] is = var_ha.Y();
                i_3_ = is[1];
                i_6_ = is[2];
                i_5_ = is[3];
                i_4_ = is[0];
                i_7_ = i_1_ + Class275.method2844(-1, false);
                i_8_ = i - -Node_Sub47.method2664(false, false);
            } else {
                var_ha.DA(Class360.anInt4446, Class102.anInt1307, Node_Sub42.anInt7292, Class84_Sub9.anInt5498);
                i_3_ = Class102.anInt1307;
                i_4_ = Class360.anInt4446;
                i_5_ = Class84_Sub9.anInt5498;
                i_6_ = Node_Sub42.anInt7292;
                var_ha.KA(Class41.anInt532, Class279_Sub1_Sub1.anInt9817, Node_Sub42.anInt7292, Class84_Sub9.anInt5498);
                viewport = var_ha.e();
                viewport.method1869(Node_Sub19.anInt7038, Node_Sub8_Sub12.anInt9008, Class114.anInt1423, Class262.anInt2979, Class38.anInt414, Class282_Sub19.anInt7786);
                i_7_ = i_1_;
                i_8_ = i;
                var_ha.a(viewport);
            }
            Class325.method3362(true, (byte) -49);
            if (i_5_ == 0)
                i_5_ = 1;
            if (i_6_ == 0)
                i_6_ = 1;
            if (Node_Sub14_Sub29.aSArray9471 != null && (!Class115.aBoolean4952 || (0x40 & Class346_Sub2.anInt8264 ^ 0xffffffff) != -1)) {
                int i_9_ = -1;
                int i_10_ = -1;
                int i_11_ = var_ha.i();
                int i_12_ = var_ha.XA();
                int i_13_;
                int i_14_;
                int i_15_;
                int i_16_;
                if (Class357.aBoolean4416) {
                    i_16_ = i_15_ = (-i_4_ + i_7_) * ObjectDefinition.anInt3100 / i_6_;
                    i_13_ = i_14_ = (-i_3_ + i_8_) * ObjectDefinition.anInt3100 / i_5_;
                } else {
                    i_13_ = i_11_ * (i_8_ + -i_3_) / i_5_;
                    i_14_ = (i_8_ - i_3_) * i_12_ / i_5_;
                    i_15_ = i_12_ * (-i_4_ + i_7_) / i_6_;
                    i_16_ = i_11_ * (-i_4_ + i_7_) / i_6_;
                }
                int[] is = {i_16_, i_13_, i_11_};
                viewport.method1867(is);
                int[] is_17_ = {i_15_, i_14_, i_12_};
                viewport.method1867(is_17_);
                float f = Class315.method3283((float) is_17_[0], 4, (float) is[2], (float) is_17_[2], (float) is_17_[1], (float) is[0], (float) is[1], 0);
                if (f > 0.0F) {
                    int i_18_ = -is[0] + is_17_[0];
                    int i_19_ = -is[2] + is_17_[2];
                    int i_20_ = (int) (f * (float) i_18_ + (float) is[0]);
                    int i_21_ = (int) ((float) i_19_ * f + (float) is[2]);
                    i_9_ = i_20_ - -(Class347.myPlayer.method3632(-1) - 1 << -409221688) >> 180861065;
                    i_10_ = i_21_ - -(Class347.myPlayer.method3632(-1) + -1 << -1826219992) >> -728588503;
                    int i_22_ = (((Interactable) Class347.myPlayer).plane);
                    if (i_22_ < 3 && ((r.aByteArrayArrayArray9033[1][i_20_ >> -378817591][i_21_ >> -295320343]) & 0x2) != 0)
                        i_22_++;
                }
                if ((i_9_ ^ 0xffffffff) != 0 && i_10_ != -1) {
                    if (Class115.aBoolean4952 && (0x40 & Class346_Sub2.anInt8264) != 0) {
                        RSInterface2 class354 = Class188.method1635(Class346_Sub7_Sub5.anInt9963, InputStream_Sub2.anInt76, 0);
                        if (class354 != null)
                            Class131.method1211(true, (long) (i_9_ << -2131871872 | i_10_), 0L, true, i_10_, 21, false, -1, Class292.anInt3423, Node_Sub8_Sub4.aString8364, (byte) 87, " ->", i_9_);
                        else
                            Class1.method168((byte) 101);
                    } else {
                        if (Node_Sub13.aBoolean6971)
                            Class131.method1211(true, (long) (i_10_ | i_9_ << -325021056), 0L, true, i_10_, 2, false, -1, -1, Class41.aClass41_493.method301((Class191.anInt4822), (byte) -108), (byte) 87, "", i_9_);
                        Class131.method1211(true, (long) (i_10_ | i_9_ << 1914608192), 0L, true, i_10_, 45, false, -1, Class64.anInt865, Node_Sub14_Sub28.aString9457, (byte) 87, "", i_9_);
                        za.anInt7484++;
                    }
                }
            }
            if (Node_Sub8_Sub6.aBoolean8949)
                Class206.method1700(false);
            for (int i_23_ = 0; (((!Node_Sub8_Sub6.aBoolean8949 ? 1 : 2) ^ 0xffffffff) < (i_23_ ^ 0xffffffff)); i_23_++) {
                boolean bool = (i_23_ ^ 0xffffffff) == -1;
                Class27 class27 = (bool ? Class352.aClass27_4187 : Node_Sub8_Sub7.aClass27_8958);
                int i_24_ = i_1_;
                int i_25_ = i;
                if (Node_Sub8_Sub6.aBoolean8949) {
                    Class75.method557(bool, i_2_ ^ ~0x10f9b9fd);
                    i_24_ += Class275.method2844(-1, bool);
                    i_25_ += Node_Sub47.method2664(bool, false);
                }
                Class360 class360 = ((Class27) class27).aClass360_358;
                for (Class346_Sub10 class346_sub10 = (Class346_Sub10) class360.method3815((byte) 23); class346_sub10 != null; class346_sub10 = (Class346_Sub10) class360.method3809(-24951)) {
                    if ((Class36.aBoolean404 || (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane == (((Interactable) Class347.myPlayer).plane))) && class346_sub10.method3719(-73, i_24_, var_ha, i_25_)) {
                        boolean bool_26_ = false;
                        boolean bool_27_ = false;
                        int i_28_;
                        int i_29_;
                        if ((((Class346_Sub10) class346_sub10).aInteractable_8355) instanceof Animable) {
                            i_28_ = ((Animable) (Animable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).y1;
                            i_29_ = ((Animable) (Animable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).x1;
                        } else {
                            i_28_ = (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).y >> -178232535);
                            i_29_ = (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).x >> 1191311561);
                        }
                        if ((((Class346_Sub10) class346_sub10).aInteractable_8355) instanceof Player) {
                            Player player = ((Player) (((Class346_Sub10) class346_sub10).aInteractable_8355));
                            int i_30_ = player.method3632(i_2_ ^ 0x10f9ab83);
                            if (((i_30_ & 0x1 ^ 0xffffffff) == -1 && (0x1ff & (((Interactable) player).x) ^ 0xffffffff) == -1 && (0x1ff & (((Interactable) player).y) ^ 0xffffffff) == -1) || ((0x1 & i_30_) == 1 && (0x1ff & (((Interactable) player).x) ^ 0xffffffff) == -257 && (0x1ff & (((Interactable) player).y) ^ 0xffffffff) == -257)) {
                                int i_31_ = (((Interactable) player).x + -(-1 + player.method3632(-1) << 313264776));
                                int i_32_ = (((Interactable) player).y + -(-1 + player.method3632(-1) << -1227786264));
                                for (int i_33_ = 0; i_33_ < Class28.anInt4892; i_33_++) {
                                    Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_33_]), (byte) 31)));
                                    if (class248_sub10 != null) {
                                        NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                                        if ((((((Entity) NPC).anInt10408) ^ 0xffffffff) != (Node_Sub18.anInt7027 ^ 0xffffffff)) && (((Entity) NPC).aBoolean10439)) {
                                            int i_34_ = (-((-1 + (((Class255) (((NPC) NPC).aClass255_10614)).size)) << -1054705656) + (((Interactable) NPC).x));
                                            int i_35_ = ((((Interactable) NPC).y) + -((((Class255) (((NPC) NPC).aClass255_10614)).size) - 1 << 1145478600));
                                            if (i_34_ >= i_31_ && ((((Class255) (((NPC) NPC).aClass255_10614)).size) <= (-(i_34_ + -i_31_ >> -1976122135) + (player.method3632(i_2_ + 284797827)))) && i_32_ <= i_35_ && ((((Class255) (((NPC) NPC).aClass255_10614)).size) <= (player.method3632(-1) - (-i_32_ + i_35_ >> 1512868169)))) {
                                                Class282_Sub15.method2983(true, NPC, (((((Interactable) (Class347.myPlayer)).plane) ^ 0xffffffff) != ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane) ^ 0xffffffff)));
                                                ((Entity) NPC).anInt10408 = Node_Sub18.anInt7027;
                                            }
                                        }
                                    }
                                }
                                int i_36_ = Class131.anInt1600;
                                int[] is = Class271.anIntArray3156;
                                for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff)); i_37_++) {
                                    Player player_38_ = (Node_Sub32.aPlayerArray7197[is[i_37_]]);
                                    if ((player_38_ != null) && (((((Entity) player_38_).anInt10408) ^ 0xffffffff) != (Node_Sub18.anInt7027 ^ 0xffffffff)) && (player_38_ != player) && (((Entity) player_38_).aBoolean10439)) {
                                        int i_39_ = ((((Interactable) player_38_).x) - ((-1 + player_38_.method3632(-1)) << 1553721096));
                                        int i_40_ = ((((Interactable) player_38_).y) - ((player_38_.method3632(i_2_ ^ 0x10f9ab83)) - 1 << 319016136));
                                        if (i_39_ >= i_31_ && ((player_38_.method3632(-1) ^ 0xffffffff) >= ((player.method3632(-1) - (i_39_ + -i_31_ >> 628398761)) ^ 0xffffffff)) && i_40_ >= i_32_ && (((player_38_.method3632(i_2_ ^ 0x10f9ab83)) ^ 0xffffffff) >= ((-(-i_32_ + i_40_ >> -197225911) + player.method3632(-1)) ^ 0xffffffff))) {
                                            Class272.method2837(player_38_, 0, ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane) != (((Interactable) (Class347.myPlayer)).plane)));
                                            ((Entity) player_38_).anInt10408 = Node_Sub18.anInt7027;
                                        }
                                    }
                                }
                            }
                            if (((Entity) player).anInt10408 == Node_Sub18.anInt7027)
                                continue;
                            Class272.method2837(player, 0, (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane != (((Interactable) (Class347.myPlayer)).plane)));
                            ((Entity) player).anInt10408 = Node_Sub18.anInt7027;
                        }
                        if ((((Class346_Sub10) class346_sub10).aInteractable_8355) instanceof NPC) {
                            NPC NPC = ((NPC) (((Class346_Sub10) class346_sub10).aInteractable_8355));
                            if (((NPC) NPC).aClass255_10614 != null) {
                                if (((((Class255) (((NPC) NPC).aClass255_10614)).size & 0x1) == 0 && ((((Interactable) NPC).x) & 0x1ff ^ 0xffffffff) == -1 && ((((Interactable) NPC).y) & 0x1ff) == 0) || ((((Class255) (((NPC) NPC).aClass255_10614)).size & 0x1 ^ 0xffffffff) == -2 && ((0x1ff & (((Interactable) NPC).x)) ^ 0xffffffff) == -257 && ((((Interactable) NPC).y) & 0x1ff ^ 0xffffffff) == -257)) {
                                    int i_41_ = (-(((Class255) (((NPC) NPC).aClass255_10614)).size - 1 << 1934079592) + (((Interactable) NPC).x));
                                    int i_42_ = ((((Interactable) NPC).y) - ((-1 + ((Class255) (((NPC) NPC).aClass255_10614)).size) << -691652856));
                                    for (int i_43_ = 0; Class28.anInt4892 > i_43_; i_43_++) {
                                        Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_43_]), (byte) 31)));
                                        if (class248_sub10 != null) {
                                            NPC NPC_44_ = (((Node_Sub10) class248_sub10).aNPC_6946);
                                            if (((Node_Sub18.anInt7027 ^ 0xffffffff) != ((((Entity) NPC_44_).anInt10408) ^ 0xffffffff)) && (NPC_44_ != NPC) && (((Entity) NPC_44_).aBoolean10439)) {
                                                int i_45_ = (-((-1 + (((Class255) (((NPC) NPC_44_).aClass255_10614)).size)) << -1197066488) + (((Interactable) NPC_44_).x));
                                                int i_46_ = ((((Interactable) NPC_44_).y) + -((((Class255) (((NPC) NPC_44_).aClass255_10614)).size) + -1 << -70264568));
                                                if (((i_45_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff)) && (((-(-i_41_ + i_45_ >> 604988361) + (((Class255) (((NPC) NPC).aClass255_10614)).size)) ^ 0xffffffff) <= ((((Class255) (((NPC) NPC_44_).aClass255_10614)).size) ^ 0xffffffff)) && ((i_42_ ^ 0xffffffff) >= (i_46_ ^ 0xffffffff)) && ((((((Class255) (((NPC) NPC).aClass255_10614)).size) + -(i_46_ + -i_42_ >> -383276343)) ^ 0xffffffff) <= ((((Class255) (((NPC) NPC_44_).aClass255_10614)).size) ^ 0xffffffff))) {
                                                    Class282_Sub15.method2983(true, NPC_44_, ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane) != (((Interactable) (Class347.myPlayer)).plane)));
                                                    ((Entity) NPC_44_).anInt10408 = (Node_Sub18.anInt7027);
                                                }
                                            }
                                        }
                                    }
                                    int i_47_ = Class131.anInt1600;
                                    int[] is = Class271.anIntArray3156;
                                    for (int i_48_ = 0; ((i_47_ ^ 0xffffffff) < (i_48_ ^ 0xffffffff)); i_48_++) {
                                        Player player = (Node_Sub32.aPlayerArray7197[is[i_48_]]);
                                        if ((player != null) && (((((Entity) player).anInt10408) ^ 0xffffffff) != (Node_Sub18.anInt7027 ^ 0xffffffff)) && (((Entity) player).aBoolean10439)) {
                                            int i_49_ = ((((Interactable) player).x) + -((-1 + player.method3632(-1)) << 1888313448));
                                            int i_50_ = ((((Interactable) player).y) + -((-1 + (player.method3632(i_2_ + 284797827))) << 70319624));
                                            if (((i_41_ ^ 0xffffffff) >= (i_49_ ^ 0xffffffff)) && (player.method3632(-1) <= ((((Class255) (((NPC) NPC).aClass255_10614)).size) + -(-i_41_ + i_49_ >> -1352760343))) && ((i_50_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff)) && (player.method3632(-1) <= (-(-i_42_ + i_50_ >> 261813513) + (((Class255) (((NPC) NPC).aClass255_10614)).size)))) {
                                                Class272.method2837(player, 0, ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane) != (((Interactable) (Class347.myPlayer)).plane)));
                                                ((Entity) player).anInt10408 = Node_Sub18.anInt7027;
                                            }
                                        }
                                    }
                                }
                                if (((Entity) NPC).anInt10408 == Node_Sub18.anInt7027)
                                    continue;
                                Class282_Sub15.method2983(true, NPC, ((((Interactable) (Class347.myPlayer)).plane) != ((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane));
                                ((Entity) NPC).anInt10408 = Node_Sub18.anInt7027;
                            }
                        }
                        if ((((Class346_Sub10) class346_sub10).aInteractable_8355) instanceof Class346_Sub7_Sub3_Sub1) {
                            int i_51_ = Class67.baseX + i_29_;
                            int i_52_ = i_28_ - -Class368.baseY;
                            Node_Sub13 class248_sub13 = ((Node_Sub13) (Class346_Sub7_Sub5.aClass65_9959.method501((long) (i_51_ | ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane) << -284797828 | i_52_ << 1068851598)), (byte) 31)));
                            if (class248_sub13 != null) {
                                int i_53_ = 0;
                                Node_Sub28 class248_sub28 = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3110(0));
                                while (class248_sub28 != null) {
                                    Class321 class321 = (Class283.aClass342_3343.method3482((byte) 81, (((Node_Sub28) class248_sub28).anInt7164)));
                                    if (Class115.aBoolean4952 && (((((Interactable) (Class347.myPlayer)).plane) ^ 0xffffffff) == ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane) ^ 0xffffffff))) {
                                        Class210 class210 = ((aa_Sub2.anInt5262 ^ 0xffffffff) != 0 ? (Node_Sub20.aClass240_7045.method1923(-6119, aa_Sub2.anInt5262)) : null);
                                        if (((Class346_Sub2.anInt8264 & 0x1) != 0) && (class210 == null || (((class321.method3341((((Class210) class210).anInt2430), -1, aa_Sub2.anInt5262)) ^ 0xffffffff) != ((((Class210) class210).anInt2430) ^ 0xffffffff)))) {
                                            Class225_Sub1_Sub1.anInt9979++;
                                            Class131.method1211(true, (long) i_53_, (long) (((Node_Sub28) class248_sub28).anInt7164), false, i_28_, 44, false, -1, Class292.anInt3423, (Node_Sub8_Sub4.aString8364), (byte) 87, (Class287.aString3382 + " -> <col=ff9040>" + (((Class321) class321).aString3702)), i_29_);
                                        }
                                    }
                                    if (((((Interactable) (Class347.myPlayer)).plane) ^ 0xffffffff) == (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane ^ 0xffffffff)) {
                                        String[] strings = (((Class321) class321).aStringArray3704);
                                        for (int i_54_ = 4; i_54_ >= 0; i_54_--) {
                                            if (strings != null && strings[i_54_] != null) {
                                                int i_55_ = 0;
                                                if ((i_54_ ^ 0xffffffff) == -1)
                                                    i_55_ = 19;
                                                int i_56_ = Class182.anInt2123;
                                                if ((i_54_ ^ 0xffffffff) == -2)
                                                    i_55_ = 15;
                                                if (i_54_ == 2)
                                                    i_55_ = 57;
                                                if ((i_54_ ^ 0xffffffff) == -4)
                                                    i_55_ = 50;
                                                if ((i_54_ ^ 0xffffffff) == ((((Class321) class321).anInt3728) ^ 0xffffffff))
                                                    i_56_ = ((Class321) class321).anInt3734;
                                                if ((i_54_ ^ 0xffffffff) == -5)
                                                    i_55_ = 12;
                                                if ((((Class321) class321).anInt3698) == i_54_)
                                                    i_56_ = ((Class321) class321).anInt3703;
                                                Class206.anInt4985++;
                                                Class131.method1211(true, (long) i_53_, (long) (((Node_Sub28) class248_sub28).anInt7164), false, i_28_, i_55_, false, -1, i_56_, strings[i_54_], (byte) 87, ("<col=ff9040>" + (((Class321) class321).aString3702)), i_29_);
                                            }
                                        }
                                    }
                                    Class131.method1211(true, (long) i_53_, (long) ((Node_Sub28) class248_sub28).anInt7164, false, i_28_, 1011, (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane != (((Interactable) (Class347.myPlayer)).plane)), -1, Class340_Sub5.anInt8142, (Class41.aClass41_488.method301(Class191.anInt4822, (byte) -108)), (byte) 87, ("<col=ff9040>" + ((Class321) class321).aString3702), i_29_);
                                    Class282_Sub22.anInt7825++;
                                    class248_sub28 = ((Node_Sub28) ((Node_Sub13) class248_sub13).aClass293_6966.method3120(i_2_ + 284815661));
                                    i_53_++;
                                }
                            }
                        }
                        if ((((Class346_Sub10) class346_sub10).aInteractable_8355) instanceof Interface16) {
                            Interface16 interface16 = ((Interface16) (((Class346_Sub10) class346_sub10).aInteractable_8355));
                            ObjectDefinition class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -74, interface16.method40((byte) 74)));
                            if (((ObjectDefinition) class266).anIntArray3049 != null)
                                class266 = class266.method2797((Node_Sub43.aClass291_7306), i_2_ ^ ~0x10f9abf8);
                            if (class266 != null) {
                                if (Class115.aBoolean4952 && (((((Interactable) (Class347.myPlayer)).plane) ^ 0xffffffff) == (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane ^ 0xffffffff))) {
                                    Class210 class210 = (aa_Sub2.anInt5262 != -1 ? (Node_Sub20.aClass240_7045.method1923(-6119, aa_Sub2.anInt5262)) : null);
                                    if ((Class346_Sub2.anInt8264 & 0x4) != 0 && (class210 == null || ((class266.method2789(-112, (((Class210) class210).anInt2430), aa_Sub2.anInt5262)) != (((Class210) class210).anInt2430)))) {
                                        ha.anInt1409++;
                                        Class131.method1211(true, (long) interface16.hashCode(), Class280.method2908(interface16, i_28_, 778239700, i_29_), false, i_28_, 46, false, -1, Class292.anInt3423, Node_Sub8_Sub4.aString8364, (byte) 87, (Class287.aString3382 + " -> <col=00ffff>" + (((ObjectDefinition) class266).aString3015)), i_29_);
                                    }
                                }
                                if ((((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane ^ 0xffffffff) == ((((Interactable) (Class347.myPlayer)).plane) ^ 0xffffffff)) {
                                    String[] strings = (((ObjectDefinition) class266).aStringArray3075);
                                    if (strings != null) {
                                        for (int i_57_ = 4; i_57_ >= 0; i_57_--) {
                                            if (strings[i_57_] != null) {
                                                int i_58_ = 0;
                                                int i_59_ = Class182.anInt2123;
                                                if ((i_57_ ^ 0xffffffff) == -1)
                                                    i_58_ = 16;
                                                if (i_57_ == 1)
                                                    i_58_ = 4;
                                                if (i_57_ == 2)
                                                    i_58_ = 49;
                                                if ((i_57_ ^ 0xffffffff) == -4)
                                                    i_58_ = 10;
                                                if (((((ObjectDefinition) class266).anInt3089) ^ 0xffffffff) == (i_57_ ^ 0xffffffff))
                                                    i_59_ = ((ObjectDefinition) class266).anInt3102;
                                                if (i_57_ == 4)
                                                    i_58_ = 1008;
                                                if ((((ObjectDefinition) class266).anInt3059) == i_57_)
                                                    i_59_ = ((ObjectDefinition) class266).anInt3071;
                                                Class61.anInt834++;
                                                Class131.method1211(true, (long) interface16.hashCode(), (Class280.method2908(interface16, i_28_, 778239700, i_29_)), false, i_28_, i_58_, false, -1, i_59_, strings[i_57_], (byte) 87, ("<col=00ffff>" + (((ObjectDefinition) class266).aString3015)), i_29_);
                                            }
                                        }
                                    }
                                    Node_Sub50.anInt7440++;
                                    Class131.method1211(true, (long) interface16.hashCode(), (long) (((ObjectDefinition) class266).anInt3043), false, i_28_, 1009, ((((Interactable) (Class347.myPlayer)).plane) != (((Interactable) (((Class346_Sub10) class346_sub10).aInteractable_8355)).plane)), -1, Class340_Sub5.anInt8142, (Class41.aClass41_488.method301(Class191.anInt4822, (byte) -108)), (byte) 87, ("<col=00ffff>" + ((ObjectDefinition) class266).aString3015), i_29_);
                                }
                            }
                        }
                    }
                }
                if (Node_Sub8_Sub6.aBoolean8949)
                    Class206.method1700(false);
            }
            Class325.method3362(false, (byte) 126);
        }
    }

    public static void method3786(byte i) {
        aClass224_4395 = null;
        aClass224_4400 = null;
        if (i != -90)
            method3786((byte) 23);
        aClass224_4404 = null;
        aClass224_4396 = null;
        aClass224_4399 = null;
        aClass224_4397 = null;
        aClass224_4401 = null;
        aClass224Array4405 = null;
        js5Opcode = null;
        aClass224_4402 = null;
        aClass224_4403 = null;
        aClass224_4398 = null;
        aClass224_4391 = null;
    }

    final void method3787(boolean bool) {
        anInt4393++;
        if (bool != false)
            method3786((byte) 56);
        synchronized (aClass278_4390) {
            aClass278_4390.method2869(0);
        }
        synchronized (aClass278_4392) {
            aClass278_4392.method2869(0);
        }
    }

    final Node_Sub8_Sub2 method3788(int i, int i_60_) {
        anInt4387++;
        Node_Sub8_Sub2 class248_sub8_sub2;
        synchronized (aClass278_4392) {
            class248_sub8_sub2 = (Node_Sub8_Sub2) aClass278_4392.method2863(4, (long) i_60_);
            if (class248_sub8_sub2 == null) {
                class248_sub8_sub2 = new Node_Sub8_Sub2(i_60_);
                aClass278_4392.method2867((byte) 0, (long) i_60_, class248_sub8_sub2);
            }
            if (i >= -18)
                return null;
            if (!class248_sub8_sub2.method2036(0))
                return null;
        }
        return class248_sub8_sub2;
    }

    final void method3789(int i) {
        synchronized (aClass278_4390) {
            aClass278_4390.method2872((byte) -78);
        }
        if (i != -1)
            aClass381_4389 = null;
        anInt4385++;
        synchronized (aClass278_4392) {
            aClass278_4392.method2872((byte) -78);
        }
    }

    final Class182 method3790(byte i, int i_61_) {
        anInt4386++;
        Class182 class182;
        synchronized (aClass278_4390) {
            class182 = (Class182) aClass278_4390.method2863(i + 94, (long) i_61_);
            if (i != -90)
                method3786((byte) -50);
        }
        if (class182 != null)
            return class182;
        byte[] is;
        synchronized (aClass381_4389) {
            is = aClass381_4389.method3922((byte) 116, Class378.method3891(7600775, i_61_), Class316_Sub1_Sub1.method3298((byte) 37, i_61_));
        }
        class182 = new Class182();
        ((Class182) class182).aClass356_2124 = this;
        ((Class182) class182).anInt2120 = i_61_;
        if (is != null)
            class182.method1606(new ByteStream(is), i + 90);
        class182.method1607((byte) 72);
        synchronized (aClass278_4390) {
            aClass278_4390.method2867((byte) 0, (long) i_61_, class182);
        }
        return class182;
    }

    Class356(Class215 class215, int i, Class381 class381, Class381 class381_62_, Class381 class381_63_) {
        aClass381_4389 = class381;
        if (aClass381_4389 != null) {
            int i_64_ = -1 + aClass381_4389.method3902(0);
            aClass381_4389.method3899(i_64_, 0);
        }
        Class340_Sub2.method3451((byte) 94, 2, class381_63_, class381_62_);
    }

    static {
        Class224[] class224s = Node_Sub14_Sub30.method2364(1376312589);
        for (int i = 0; (class224s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
            aClass224Array4405[((Class224) class224s[i]).opcode] = class224s[i];
    }
}
