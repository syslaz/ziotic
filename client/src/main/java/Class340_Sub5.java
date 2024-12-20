/* Class340_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class340_Sub5 extends Class340 {
    static int anInt8126;
    static int anInt8127;
    private Class370 aClass370_8128;
    static int anInt8129;
    static int anInt8130;
    static int anInt8131;
    static int anInt8132;
    static int anInt8133;
    static int anInt8134;
    static int anInt8135;
    static int anInt8136;
    private float aFloat8137 = 0.0F;
    static OutgoingOpcode aOutgoingOpcode_8138 = new OutgoingOpcode(42, 16);
    static IncommingOpcode aIncommingOpcode_8139 = new IncommingOpcode(120, 3);
    static boolean aBoolean8140;
    static int anInt8141;
    static int anInt8142 = -1;
    static Class77 aClass77_8143;

    final void method3442(Interface21 interface21, int i, byte i_0_) {
        if (i_0_ > 68) {
            anInt8135++;
            ((Class340) this).aHa_Sub3_3954.method929(interface21, -8423);
        }
    }

    static final void method3454(RSInterface2 class354, int i, int i_1_, int i_2_) {
        int i_3_ = 30 / ((i_2_ - -5) / 40);
        anInt8133++;
        if ((((RSInterface2) class354).aByte4243 ^ 0xffffffff) == -1)
            ((RSInterface2) class354).anInt4370 = ((RSInterface2) class354).anInt4239;
        else if (((RSInterface2) class354).aByte4243 != 1) {
            if (((RSInterface2) class354).aByte4243 == 2)
                ((RSInterface2) class354).anInt4370 = (-((RSInterface2) class354).anInt4239 + (-((RSInterface2) class354).anInt4223 + i_1_));
            else if (((RSInterface2) class354).aByte4243 == 3)
                ((RSInterface2) class354).anInt4370 = ((RSInterface2) class354).anInt4239 * i_1_ >> -40453234;
            else if (((RSInterface2) class354).aByte4243 != 4)
                ((RSInterface2) class354).anInt4370 = (-(i_1_ * ((RSInterface2) class354).anInt4239 >> -704048530) + (i_1_ - ((RSInterface2) class354).anInt4223));
            else
                ((RSInterface2) class354).anInt4370 = ((((RSInterface2) class354).anInt4239 * i_1_ >> -666199474) + (i_1_ + -((RSInterface2) class354).anInt4223) / 2);
        } else
            ((RSInterface2) class354).anInt4370 = (((RSInterface2) class354).anInt4239 + (i_1_ - ((RSInterface2) class354).anInt4223) / 2);
        if ((((RSInterface2) class354).aByte4298 ^ 0xffffffff) != -1) {
            if (((RSInterface2) class354).aByte4298 != 1) {
                if ((((RSInterface2) class354).aByte4298 ^ 0xffffffff) != -3) {
                    if (((RSInterface2) class354).aByte4298 == 3)
                        ((RSInterface2) class354).anInt4257 = (i * ((RSInterface2) class354).anInt4331 >> 1615405294);
                    else if (((RSInterface2) class354).aByte4298 == 4)
                        ((RSInterface2) class354).anInt4257 = ((-((RSInterface2) class354).anInt4332 + i) / 2 + (i * ((RSInterface2) class354).anInt4331 >> 84178574));
                    else
                        ((RSInterface2) class354).anInt4257 = (-((RSInterface2) class354).anInt4332 + i - (((RSInterface2) class354).anInt4331 * i >> 1010598830));
                } else
                    ((RSInterface2) class354).anInt4257 = (-((RSInterface2) class354).anInt4331 + (i + -((RSInterface2) class354).anInt4332));
            } else
                ((RSInterface2) class354).anInt4257 = ((-((RSInterface2) class354).anInt4332 + i) / 2 - -((RSInterface2) class354).anInt4331);
        } else
            ((RSInterface2) class354).anInt4257 = ((RSInterface2) class354).anInt4331;
        if (Class332.aBoolean3874 && ((((Node_Sub48) client.method113(class354)).anInt7424 ^ 0xffffffff) != -1 || ((RSInterface2) class354).anInt4284 == 0)) {
            if ((((RSInterface2) class354).anInt4370 ^ 0xffffffff) <= -1) {
                if ((((RSInterface2) class354).anInt4370 - -((RSInterface2) class354).anInt4223) > i_1_)
                    ((RSInterface2) class354).anInt4370 = -((RSInterface2) class354).anInt4223 + i_1_;
            } else
                ((RSInterface2) class354).anInt4370 = 0;
            if (((RSInterface2) class354).anInt4257 < 0)
                ((RSInterface2) class354).anInt4257 = 0;
            else if (((((RSInterface2) class354).anInt4257 - -((RSInterface2) class354).anInt4332) ^ 0xffffffff) < (i ^ 0xffffffff))
                ((RSInterface2) class354).anInt4257 = -((RSInterface2) class354).anInt4332 + i;
        }
    }

    final void method3443(boolean bool, boolean bool_4_) {
        anInt8131++;
        ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        ((Class340) this).aHa_Sub3_3954.method955((byte) 110, Class142.aClass5_1669, Class346_Sub4.aClass5_8272);
        ((Class340) this).aHa_Sub3_3954.method1017(-8980, 0, Class147.aClass280_1738, false, bool);
        ((Class340) this).aHa_Sub3_3954.method951(Class346_Sub7_Sub3_Sub1.aClass280_10511, (byte) 94, 0);
        ((Class340) this).aHa_Sub3_3954.method1021((byte) -109, 0);
        ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        ((Class340) this).aHa_Sub3_3954.method976(-16777216, false);
        ((Class340) this).aHa_Sub3_3954.method951(Class380.aClass280_4649, (byte) 110, 0);
        method3431(4095);
    }

    final boolean method3432(int i) {
        if (i != 4095)
            aClass370_8128 = null;
        anInt8136++;
        return aClass370_8128.method3856((byte) -42);
    }

    Class340_Sub5(ha_Sub3 var_ha_Sub3, Class370 class370) {
        super(var_ha_Sub3);
        aClass370_8128 = class370;
    }

    final void method3441(boolean bool) {
        ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        anInt8126++;
        ((Class340) this).aHa_Sub3_3954.method955((byte) 48, Class60.aClass5_821, Class60.aClass5_821);
        ((Class340) this).aHa_Sub3_3954.method946(0, -84, Class147.aClass280_1738);
        ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 99, 0);
        ((Class340) this).aHa_Sub3_3954.method1021((byte) -109, 1);
        if (bool != true)
            aOutgoingOpcode_8138 = null;
        ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
        ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        ((Class340) this).aHa_Sub3_3954.method951(Class147.aClass280_1738, (byte) 109, 0);
    }

    static final void method3455(int i, boolean bool) {
        if (Class289.aClass111_3398 != null) {
            Class289.aClass111_3398.method774(-1);
            Class289.aClass111_3398 = null;
        }
        anInt8132++;
        Class321.loginStage = 0;
        Node_Sub14_Sub35.method2379(true);
        if (i > 14) {
            Class73.method540();
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -5; i_5_++)
                Class182.aClass164Array2114[i_5_].method1518((byte) 12);
            Class262.method2770(false, (byte) -126);
            System.gc();
            Class346_Sub7_Sub2_Sub4.method3627(2, (byte) -50);
            Node_Sub8_Sub3.anInt8927 = -1;
            ha_Sub3_Sub1.aBoolean8709 = false;
            Class253_Sub1.method2728(false);
            Class42.method308(true, (byte) -127);
            Class150.anInt1751 = 0;
            Class368.baseY = 0;
            Class267.anInt4919 = Class270.anInt3134 = 0;
            Node_Sub19.anInt7031 = 0;
            Class67.baseX = 0;
            for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (Class225_Sub3.aClass7Array8477.length ^ 0xffffffff)); i_6_++)
                Class225_Sub3.aClass7Array8477[i_6_] = null;
            Node_Sub14_Sub39.method2397((byte) 73);
            for (int i_7_ = 0; i_7_ < 2048; i_7_++)
                Node_Sub32.aPlayerArray7197[i_7_] = null;
            Class28.anInt4892 = 0;
            Class253_Sub1.aClass65_7514.method504(-1);
            Node_Sub8_Sub16_Sub1.anInt10303 = 0;
            Class346_Sub7_Sub5.aClass65_9959.method504(-1);
            Class282_Sub16.method2990((byte) 77);
            Class69.anInt910 = 0;
            Node_Sub43.aClass291_7306.method3098(-12777);
            Class375.method3879(-125);
            Class54_Sub1.method432(-28128);
            Class211.aLong2446 = 0L;
            Node_Sub14_Sub15.aClass248_Sub43_9326 = null;
            if (!bool) {
                Node_Sub14_Sub15.method2318(3, -21035);
                try {
                    Class78.method571("loggedout", -8364, Class158.anApplet1881);
                } catch (Throwable throwable) {
                    /* empty */
                }
            } else
                Node_Sub14_Sub15.method2318(12, -21035);
        }
    }

    final void method3435(boolean bool, int i) {
        anInt8130++;
        ((Class340) this).aHa_Sub3_3954.method955((byte) 85, Class142.aClass5_1669, Class60.aClass5_821);
        if (i <= 109)
            aBoolean8140 = false;
    }

    static final Node_Sub8_Sub1 method3456(int i) {
        if (i < 122)
            aClass77_8143 = null;
        anInt8129++;
        return Class116.aClass248_Sub8_Sub1_1434;
    }

    static final void method3457(int i, String string) {
        anInt8127++;
        if (string != null) {
            if (string.startsWith("*"))
                string = string.substring(1);
            String string_8_ = Class144.method1298(string, true);
            if (string_8_ != null) {
                if (i != 28678)
                    method3454(null, -105, 123, -26);
                for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (Node_Sub2_Sub3.anInt8854 ^ 0xffffffff)); i_9_++) {
                    String string_10_ = Class340_Sub7.aStringArray8181[i_9_];
                    if (string_10_.startsWith("*"))
                        string_10_ = string_10_.substring(1);
                    string_10_ = Class144.method1298(string_10_, true);
                    if (string_10_ != null && string_10_.equals(string_8_)) {
                        Node_Sub2_Sub3.anInt8854--;
                        for (int i_11_ = i_9_; i_11_ < Node_Sub2_Sub3.anInt8854; i_11_++) {
                            Class340_Sub7.aStringArray8181[i_11_] = Class340_Sub7.aStringArray8181[1 + i_11_];
                            Class54_Sub2.aStringArray5334[i_11_] = Class54_Sub2.aStringArray5334[i_11_ - -1];
                            Node_Sub14_Sub9.aStringArray9242[i_11_] = (Node_Sub14_Sub9.aStringArray9242[1 + i_11_]);
                            Class54_Sub4.aStringArray5360[i_11_] = Class54_Sub4.aStringArray5360[1 + i_11_];
                            Class292.aBooleanArray3422[i_11_] = Class292.aBooleanArray3422[1 + i_11_];
                        }
                        Class84_Sub9.anInt5490++;
                        Class316.anInt3662 = Class164.anInt1934;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub1.aOutgoingOpcode_6819));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(i + -28777, Class208.method1710(true, string));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -91);
                        Class226_Sub3.method1814(class248_sub36, 0);
                        break;
                    }
                }
            }
        }
    }

    final void method3431(int i) {
        if (i != 4095)
            method3455(106, true);
        if (((Class340) this).aHa_Sub3_3954.method963(128) == 0) {
            Class238_Sub2 class238_sub2 = ((Class340) this).aHa_Sub3_3954.method979((byte) 114);
            ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
            Class238_Sub2 class238_sub2_12_ = ((Class340) this).aHa_Sub3_3954.method1022(0);
            class238_sub2_12_.method1868(class238_sub2);
            class238_sub2_12_.method1880(0.125F, (byte) -118, 0.125F, 1.0F);
            class238_sub2_12_.method1885(0.0F, aFloat8137, 0.0F, 13);
            ((Class340) this).aHa_Sub3_3954.method984(3, Node_Sub14_Sub31.aClass34_9493);
            ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
        }
        anInt8141++;
    }

    public static void method3458(int i) {
        if (i != -29859)
            method3456(10);
        aIncommingOpcode_8139 = null;
        aClass77_8143 = null;
        aOutgoingOpcode_8138 = null;
    }

    final void method3433(int i, int i_13_, int i_14_) {
        if (i != -26427)
            aIncommingOpcode_8139 = null;
        ((Class340) this).aHa_Sub3_3954.method1040(1, (byte) -65);
        anInt8134++;
        if ((0x80 & i_13_) != 0)
            ((Class340) this).aHa_Sub3_3954.method929(null, -8423);
        else if ((i_14_ & 0x1) == 1) {
            if (((Class370) aClass370_8128).aBoolean4544) {
                aFloat8137 = (float) ((((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInt6187) % 4000) / 4000.0F;
                ((Class340) this).aHa_Sub3_3954.method929(((Class370) aClass370_8128).anInterface21_Impl1_4554, -8423);
            } else {
                int i_15_ = (16 * (((ha_Sub3) ((Class340) this).aHa_Sub3_3954).anInt6187 % 4000) / 4000);
                ((Class340) this).aHa_Sub3_3954.method929((((Class370) aClass370_8128).anInterface21_Impl2Array4545[i_15_]), -8423);
            }
        } else if (!((Class370) aClass370_8128).aBoolean4544)
            ((Class340) this).aHa_Sub3_3954.method929(((Class370) aClass370_8128).anInterface21_Impl2Array4545[0], -8423);
        else
            ((Class340) this).aHa_Sub3_3954.method929(((Class370) aClass370_8128).anInterface21_Impl1_4554, -8423);
        ((Class340) this).aHa_Sub3_3954.method1040(0, (byte) -65);
    }
}
