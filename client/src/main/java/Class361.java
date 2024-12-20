/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class361 {
    static int anInt4450;
    static int anInt4451;
    static int anInt4452;
    static int anInt4453 = 0;
    static Class58 aClass58_4454 = new Class58("", 12);
    static int anInt4455;

    public static void method3816(int i) {
        int i_0_ = -2 % ((i - -82) / 40);
        aClass58_4454 = null;
    }

    static final void method3817(int i, byte i_1_, int i_2_, ha var_ha, RSInterface2 class354) {
        anInt4450++;
        if (i_1_ < -101) {
            aa var_aa = class354.method3768(var_ha, 0);
            if (var_aa != null) {
                var_ha.KA(i_2_, i, i_2_ - -((RSInterface2) class354).anInt4332, ((RSInterface2) class354).anInt4223 + i);
                if (Class346_Sub7_Sub1.anInt9907 == 2 || Class346_Sub7_Sub1.anInt9907 == 5 || Class295.aClass129_3452 == null)
                    var_ha.A(-16777216, var_aa, i_2_, i);
                else {
                    int i_3_;
                    int i_4_;
                    int i_5_;
                    int i_6_;
                    if (Node_Sub45.anInt7343 != 4) {
                        i_3_ = 0x3fff & (Class346_Sub7_Sub5.anInt9958 + (int) -Class282_Sub7.aFloat7661);
                        i_6_ = (((Interactable) Class347.myPlayer).y);
                        i_5_ = (((Interactable) Class347.myPlayer).x);
                        i_4_ = -(16 * Class252.anInt2843) + 4096;
                    } else {
                        i_3_ = (int) -Class282_Sub7.aFloat7661 & 0x3fff;
                        i_4_ = 4096;
                        i_5_ = Class61.anInt831;
                        i_6_ = Node_Sub32.anInt7198;
                    }
                    int i_7_ = (-(2 * Node_Sub8_Sub4.anInt8360) + (208 + (i_5_ / 128 + 48)));
                    int i_8_ = (-(i_6_ / 128) + 48 + 4 * Node_Sub22.anInt7074 - 2 * (-104 + Node_Sub22.anInt7074));
                    Class295.aClass129_3452.method1163(((float) i_2_ + (float) ((RSInterface2) class354).anInt4332 / 2.0F), ((float) ((RSInterface2) class354).anInt4223 / 2.0F + (float) i), (float) i_7_, (float) i_8_, i_4_, i_3_ << 581598690, var_aa, i_2_, i);
                    for (Node_Sub37 class248_sub37 = (Node_Sub37) Node_Sub14_Sub28.aClass293_9459.method3119(2); class248_sub37 != null; class248_sub37 = (Node_Sub37) Node_Sub14_Sub28.aClass293_9459.method3107(-127)) {
                        int i_9_ = ((Node_Sub37) class248_sub37).anInt7261;
                        int i_10_ = ((((((Class380) Class102.aClass380_1309).anIntArray4644[i_9_]) & 0xffff924) >> -1315410098) + -Class67.baseX);
                        int i_11_ = (((((Class380) Class102.aClass380_1309).anIntArray4644[i_9_]) & 0x3fff) + -Class368.baseY);
                        int i_12_ = 2 + 4 * i_10_ + -(i_5_ / 128);
                        int i_13_ = 2 + (4 * i_11_ - i_6_ / 128);
                        Class340_Sub10.method3476(class354, i_13_, i, i_2_, -99, (((Class380) Class102.aClass380_1309).anIntArray4646[i_9_]), var_aa, i_12_, var_ha);
                    }
                    for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (Node_Sub8_Sub14.anInt9037 ^ 0xffffffff)); i_14_++) {
                        int i_15_ = (-(i_5_ / 128) + (za.anIntArray7489[i_14_] * 4 - -2));
                        int i_16_ = (-(i_6_ / 128) + (4 * Class112.anIntArray5204[i_14_] + 2));
                        ObjectDefinition class266 = (Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -97, Class340.anIntArray3965[i_14_]));
                        if (((ObjectDefinition) class266).anIntArray3049 != null) {
                            class266 = class266.method2797((Node_Sub43.aClass291_7306), 121);
                            if (class266 == null || ((ObjectDefinition) class266).anInt3033 == -1)
                                continue;
                        }
                        Class340_Sub10.method3476(class354, i_16_, i, i_2_, -109, (((ObjectDefinition) class266).anInt3033), var_aa, i_15_, var_ha);
                    }
                    for (Node_Sub13 class248_sub13 = (Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method510(true); class248_sub13 != null; class248_sub13 = (Node_Sub13) Class346_Sub7_Sub5.aClass65_9959.method512(false)) {
                        int i_17_ = (int) ((((Node) class248_sub13).id >> 545133724) & 0x3L);
                        if ((i_17_ ^ 0xffffffff) == (Class338.anInt3939 ^ 0xffffffff)) {
                            int i_18_ = ((int) (((Node) class248_sub13).id & 0x3fffL) + -Class67.baseX);
                            int i_19_ = (-Class368.baseY + (int) (0x3fffL & (((Node) class248_sub13).id) >> -690873330));
                            int i_20_ = 4 * i_18_ - -2 - i_5_ / 128;
                            int i_21_ = -(i_6_ / 128) + 2 + 4 * i_19_;
                            Class325.method3360(var_aa, i_2_, Class10.aClass129Array232[0], i_21_, i_20_, 110, i, class354);
                        }
                    }
                    for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > (Class28.anInt4892 ^ 0xffffffff)); i_22_++) {
                        Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) (Class346_Sub7_Sub2_Sub3.anIntArray10381[i_22_]), (byte) 31)));
                        if (class248_sub10 != null) {
                            NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                            if (NPC.method3663((byte) -84) && ((((Interactable) (Class347.myPlayer)).plane) == (((Interactable) NPC).plane))) {
                                Class255 class255 = (((NPC) NPC).aClass255_10614);
                                if (class255 != null && (((Class255) class255).anIntArray2923 != null))
                                    class255 = (class255.method2737((byte) 101, Node_Sub43.aClass291_7306));
                                if (class255 != null && ((Class255) class255).aBoolean2921 && ((Class255) class255).aBoolean2911) {
                                    int i_23_ = (-(i_5_ / 128) + (((Interactable) NPC).x) / 128);
                                    int i_24_ = (-(i_6_ / 128) + (((Interactable) NPC).y) / 128);
                                    if (((Class255) class255).anInt2868 != -1)
                                        Class340_Sub10.method3476(class354, i_24_, i, i_2_, -103, ((Class255) class255).anInt2868, var_aa, i_23_, var_ha);
                                    else
                                        Class325.method3360(var_aa, i_2_, (Class10.aClass129Array232[1]), i_24_, i_23_, 97, i, class354);
                                }
                            }
                        }
                    }
                    int i_25_ = Class131.anInt1600;
                    int[] is = Class271.anIntArray3156;
                    for (int i_26_ = 0; i_25_ > i_26_; i_26_++) {
                        Player player = (Node_Sub32.aPlayerArray7197[is[i_26_]]);
                        if (player != null && player.method3650((byte) -84) && !((Player) player).aBoolean10585 && (Class347.myPlayer != player) && ((((Interactable) player).plane) == (((Interactable) (Class347.myPlayer)).plane))) {
                            int i_27_ = (-(i_5_ / 128) + (((Interactable) player).x) / 128);
                            int i_28_ = ((((Interactable) player).y) / 128 - i_6_ / 128);
                            boolean bool = false;
                            for (int i_29_ = 0; ((i_29_ ^ 0xffffffff) > (client.anInt5226 ^ 0xffffffff)); i_29_++) {
                                if ((((Player) player).aString10550.equals(Class282_Sub11.aStringArray7703[i_29_])) && (Class286.anIntArray3372[i_29_] ^ 0xffffffff) != -1) {
                                    bool = true;
                                    break;
                                }
                            }
                            boolean bool_30_ = false;
                            for (int i_31_ = 0; i_31_ < Class74.anInt963; i_31_++) {
                                if (((Player) player).aString10550.equals(((Class211) (Class30.aClass211Array375[i_31_])).aString2441)) {
                                    bool_30_ = true;
                                    break;
                                }
                            }
                            boolean bool_32_ = false;
                            if ((((Player) Class347.myPlayer).anInt10542) != 0 && (((Player) player).anInt10542 != 0) && (((((Player) (Class347.myPlayer)).anInt10542) ^ 0xffffffff) == ((((Player) player).anInt10542) ^ 0xffffffff)))
                                bool_32_ = true;
                            if (!((Player) player).aBoolean10565) {
                                if (!bool) {
                                    if (bool_30_)
                                        Class325.method3360(var_aa, i_2_, (Class10.aClass129Array232[5]), i_28_, i_27_, -3, i, class354);
                                    else if (bool_32_)
                                        Class325.method3360(var_aa, i_2_, (Class10.aClass129Array232[4]), i_28_, i_27_, -81, i, class354);
                                    else
                                        Class325.method3360(var_aa, i_2_, (Class10.aClass129Array232[2]), i_28_, i_27_, 127, i, class354);
                                } else
                                    Class325.method3360(var_aa, i_2_, (Class10.aClass129Array232[3]), i_28_, i_27_, -99, i, class354);
                            } else
                                Class325.method3360(var_aa, i_2_, (Class10.aClass129Array232[6]), i_28_, i_27_, 107, i, class354);
                        }
                    }
                    Class7[] class7s = Class225_Sub3.aClass7Array8477;
                    for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (class7s.length ^ 0xffffffff); i_33_++) {
                        Class7 class7 = class7s[i_33_];
                        if (class7 != null && ((Class7) class7).anInt169 != 0 && Node_Sub18.anInt7027 % 20 < 10) {
                            if (((Class7) class7).anInt169 == 1) {
                                Node_Sub10 class248_sub10 = ((Node_Sub10) (Class253_Sub1.aClass65_7514.method501((long) ((Class7) class7).anInt164, (byte) 31)));
                                if (class248_sub10 != null) {
                                    NPC NPC = (((Node_Sub10) class248_sub10).aNPC_6946);
                                    int i_34_ = ((((Interactable) NPC).x) / 128 - i_5_ / 128);
                                    int i_35_ = ((((Interactable) NPC).y) / 128 + -(i_6_ / 128));
                                    Class132.method1218(i_2_, (byte) -91, i_35_, i_34_, var_aa, i, class354, 360000L, (((Class7) class7).anInt167));
                                }
                            }
                            if ((((Class7) class7).anInt169 ^ 0xffffffff) == -3) {
                                int i_36_ = (-(i_5_ / 128) + ((Class7) class7).anInt159 / 128);
                                int i_37_ = (-(i_6_ / 128) + ((Class7) class7).anInt163 / 128);
                                long l = (long) (((Class7) class7).anInt168 << 554795431);
                                l *= l;
                                Class132.method1218(i_2_, (byte) -95, i_37_, i_36_, var_aa, i, class354, l, (((Class7) class7).anInt167));
                            }
                            if (((((Class7) class7).anInt169 ^ 0xffffffff) == -11) && ((((Class7) class7).anInt164 ^ 0xffffffff) <= -1) && (((Node_Sub32.aPlayerArray7197).length ^ 0xffffffff) < (((Class7) class7).anInt164 ^ 0xffffffff))) {
                                Player player = (Node_Sub32.aPlayerArray7197[((Class7) class7).anInt164]);
                                if (player != null) {
                                    int i_38_ = ((((Interactable) player).x) / 128 + -(i_5_ / 128));
                                    int i_39_ = ((((Interactable) player).y) / 128 - i_6_ / 128);
                                    Class132.method1218(i_2_, (byte) -73, i_39_, i_38_, var_aa, i, class354, 360000L, (((Class7) class7).anInt167));
                                }
                            }
                        }
                    }
                    if (Node_Sub45.anInt7343 != 4) {
                        if (Applet_Sub1.anInt44 != 0) {
                            int i_40_ = (-(i_5_ / 128) + 4 * Applet_Sub1.anInt44 + (2 + ((2 * Class347.myPlayer.method3632(-1)) + -2)));
                            int i_41_ = (Class72.anInt4876 * 4 + (2 - i_6_ / 128 + (-2 + (2 * Class347.myPlayer.method3632(-1)))));
                            Class325.method3360(var_aa, i_2_, (Class66.aClass129Array5028[(!Class381.aBoolean4681 ? 0 : 1)]), i_41_, i_40_, 90, i, class354);
                        }
                        if (!((Player) Class347.myPlayer).aBoolean10585)
                            var_ha.method820(3, 98, 3, (((RSInterface2) class354).anInt4223 / 2) + (i + -1), -1 + (i_2_ - -((((RSInterface2) class354).anInt4332) / 2)), -1);
                    }
                }
            }
        }
    }

    static final void method3818(int i) {
        anInt4451++;
        if (!Class359.aBoolean4437) {
            Class207.aBoolean2398 = true;
            int i_42_ = -73 % ((i - 44) / 40);
            Class192.aFloat2216 += (-Class192.aFloat2216 + -24.0F) / 2.0F;
            Class359.aBoolean4437 = true;
        }
    }
}
