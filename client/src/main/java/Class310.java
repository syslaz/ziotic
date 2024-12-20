/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class310 {
    static int anInt3579;
    int anInt3580;
    static int anInt3581;
    byte[][][] aByteArrayArrayArray3582;
    static int anInt3583;
    static int anInt3584;
    static int anInt3585;
    static int anInt3586;
    static int anInt3587;
    static int anInt3588;
    private byte[][][] aByteArrayArrayArray3589;
    byte[][][] aByteArrayArrayArray3590;
    private int[] anIntArray3591 = {0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
    int[][][] anIntArrayArrayArray3592;
    static int anInt3593;
    private byte[][][] aByteArrayArrayArray3594;
    private Class192 aClass192_3595;
    static int anInt3596;
    int anInt3597;
    static short aShort3598 = 256;
    private Class144 aClass144_3599;
    static int anInt3600;
    private int[] anIntArray3601 = {0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
    static int anInt3602;
    private byte[][][] aByteArrayArrayArray3603;
    boolean aBoolean3604;
    private byte[][][] aByteArrayArrayArray3605;
    static int anInt3606;
    static int anInt3607;
    int anInt3608;
    static int anInt3609;

    static long method3236(long l, long l_0_) {
        return l & l_0_;
    }

    final void method3237(int i, int i_1_, int i_2_, ByteStream class248_sub9, Class164[] class164s, int i_3_, int i_4_) {
        anInt3586++;
        if (!((Class310) this).aBoolean3604) {
            for (int i_5_ = 0; i_5_ < 4; i_5_++) {
                Class164 class164 = class164s[i_5_];
                for (int i_6_ = 0; i_6_ < 64; i_6_++) {
                    for (int i_7_ = 0; i_7_ < 64; i_7_++) {
                        int i_8_ = i_6_ + i_1_;
                        int i_9_ = i_7_ + i_4_;
                        if ((i_8_ ^ 0xffffffff) <= -1 && ((i_8_ ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff)) && i_9_ >= 0 && ((i_9_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)))
                            class164.method1515(i_8_, -112, i_9_);
                    }
                }
            }
        }
        if (i_3_ != -27506)
            method3238(-40, null, null, null);
        int i_10_ = i_2_ - -i_1_;
        int i_11_ = i + i_4_;
        for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (((Class310) this).anInt3608 ^ 0xffffffff); i_12_++) {
            for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -65; i_13_++) {
                for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_++)
                    method3249(0, 0, i_1_ + i_13_, i_13_ + i_10_, class248_sub9, i_11_ + i_14_, i_12_, i_14_ + i_4_, true, 0, false);
            }
        }
    }

    final void method3238(int i, int[][][] is, ha var_ha, Class164[] class164s) {
        anInt3607++;
        if (i <= -58) {
            if (!((Class310) this).aBoolean3604) {
                for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -5; i_15_++) {
                    for (int i_16_ = 0; ((Class310) this).anInt3597 > i_16_; i_16_++) {
                        for (int i_17_ = 0; ((Class310) this).anInt3580 > i_17_; i_17_++) {
                            if ((0x1 & (r.aByteArrayArrayArray9033[i_15_][i_16_][i_17_])) != 0) {
                                int i_18_ = i_15_;
                                if (((r.aByteArrayArrayArray9033[1][i_16_][i_17_]) & 0x2) != 0)
                                    i_18_--;
                                if (i_18_ >= 0)
                                    class164s[i_18_].method1521(2097152, i_16_, i_17_);
                            }
                        }
                    }
                }
            }
            for (int i_19_ = 0; ((Class310) this).anInt3608 > i_19_; i_19_++) {
                int i_20_ = 0;
                int i_21_ = 0;
                if (!((Class310) this).aBoolean3604) {
                    if (ha_Sub3.aBoolean6060)
                        i_21_ |= 0x8;
                    if (Class80.aBoolean1009)
                        i_20_ |= 0x2;
                    if (Class302.anInt3501 != 0) {
                        if (Class348.aBoolean4162 | i_19_ == 0)
                            i_21_ |= 0x10;
                        i_20_ |= 0x1;
                    }
                }
                if (Class80.aBoolean1009)
                    i_21_ |= 0x7;
                if (!Class192.aBoolean2211)
                    i_21_ |= 0x20;
                int[][] is_22_ = (is != null && (i_19_ ^ 0xffffffff) > (is.length ^ 0xffffffff) ? is[i_19_] : ((Class310) this).anIntArrayArrayArray3592[i_19_]);
                Class226_Sub1_Sub1.method1807(i_19_, var_ha.a(((Class310) this).anInt3597, ((Class310) this).anInt3580, (((Class310) this).anIntArrayArrayArray3592[i_19_]), is_22_, 512, i_20_, i_21_));
            }
        }
    }

    static final void method3239(byte i) {
        anInt3581++;
        if ((Class282_Sub21.anInt7817 ^ 0xffffffff) < -2) {
            Class282_Sub21.anInt7817--;
            Class9.anInt225 = Class164.anInt1934;
        }
        if (Player.aBoolean10544) {
            Player.aBoolean10544 = false;
            Class282_Sub2.method2929(16384);
        } else {
            if (!Class145.aBoolean1721)
                Class184.method1616((byte) 60);
            for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -101; i_23_++) {
                if (!OutgoingOpcode.handlePacket((byte) -7))
                    break;
            }
            if ((Class273.anInt5008 ^ 0xffffffff) == -11) {
                while (Class249_Sub1.method2700(0)) {
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class158.aOutgoingOpcode_1883);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-83, 0);
                    int i_24_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                    Class50.method392((((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257), (byte) 101);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, -i_24_ + ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (Node_Sub14_Sub15.aClass248_Sub43_9326 == null) {
                    if ((Class118.method1112(116) ^ 0xffffffffffffffffL) <= (Class211.aLong2446 ^ 0xffffffffffffffffL))
                        Node_Sub14_Sub15.aClass248_Sub43_9326 = (Class346_Sub7_Sub4_Sub2.aClass333_10174.method3412(((WorldAddress) (Class346_Sub7_Sub2_Sub4.aWorldAddress_10119)).address, -23210));
                } else if (((Node_Sub43) (Node_Sub14_Sub15.aClass248_Sub43_9326)).anInt7305 != -1) {
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class44_Sub1.aOutgoingOpcode_5286));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, ((Node_Sub43) (Node_Sub14_Sub15.aClass248_Sub43_9326)).anInt7305);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Node_Sub14_Sub15.aClass248_Sub43_9326 = null;
                    Class211.aLong2446 = Class118.method1112(116) - -30000L;
                }
                Node_Sub39 class248_sub39 = (Node_Sub39) Class368.aClass293_4524.method3119(2);
                if (class248_sub39 != null || ((Class56.aLong749 ^ 0xffffffffffffffffL) > (-2000L + Class118.method1112(116) ^ 0xffffffffffffffffL))) {
                    Node_Sub36 class248_sub36 = null;
                    int i_25_ = 0;
                    for (Node_Sub39 class248_sub39_26_ = (Node_Sub39) Node_Sub14_Sub7.aClass293_9223.method3119(2); class248_sub39_26_ != null; class248_sub39_26_ = (Node_Sub39) Node_Sub14_Sub7.aClass293_9223.method3107(-128)) {
                        if (class248_sub36 != null && ((((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset + -i_25_) ^ 0xffffffff) <= -241)
                            break;
                        class248_sub39_26_.remove(true);
                        int i_27_ = class248_sub39_26_.method2601((byte) 127);
                        if ((i_27_ ^ 0xffffffff) > 0)
                            i_27_ = -1;
                        else if ((i_27_ ^ 0xffffffff) < -65535)
                            i_27_ = 65534;
                        int i_28_ = class248_sub39_26_.method2606(-15204);
                        if ((i_28_ ^ 0xffffffff) > 0)
                            i_28_ = -1;
                        else if ((i_28_ ^ 0xffffffff) < -65535)
                            i_28_ = 65534;
                        if (Class46.anInt595 != i_28_ || i_27_ != Class182.anInt2125) {
                            if (class248_sub36 == null) {
                                class248_sub36 = (Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class282_Sub3.aOutgoingOpcode_7621));
                                Class342.anInt3983++;
                                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-91, 0);
                                i_25_ = ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset;
                            }
                            int i_29_ = -Class46.anInt595 + i_28_;
                            Class46.anInt595 = i_28_;
                            int i_30_ = i_27_ - Class182.anInt2125;
                            Class182.anInt2125 = i_27_;
                            int i_31_ = (int) ((class248_sub39_26_.method2600(0) - Class56.aLong749) / 20L);
                            if (i_31_ >= 8 || i_29_ < -32 || (i_29_ ^ 0xffffffff) < -32 || i_30_ < -32 || (i_30_ ^ 0xffffffff) < -32) {
                                if (i_31_ >= 32 || (i_29_ ^ 0xffffffff) > 127 || (i_29_ ^ 0xffffffff) < -128 || (i_30_ ^ 0xffffffff) > 127 || (i_30_ ^ 0xffffffff) < -128) {
                                    if (i_31_ < 32) {
                                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-58, 192 + i_31_);
                                        if ((i_28_ ^ 0xffffffff) == -2 || (i_27_ ^ 0xffffffff) == 0)
                                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, -2147483648);
                                        else
                                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, i_27_ << 934325072 | i_28_);
                                    } else {
                                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, 57344 + i_31_);
                                        if ((i_28_ ^ 0xffffffff) != -2 && i_27_ != -1)
                                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, i_28_ | i_27_ << 220717104);
                                        else
                                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, -2147483648);
                                    }
                                } else {
                                    i_30_ += 128;
                                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-111, 128 - -i_31_);
                                    i_29_ += 128;
                                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_30_ + (i_29_ << 1443272904));
                                }
                            } else {
                                i_30_ += 32;
                                i_29_ += 32;
                                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_30_ + ((i_29_ << -2066401658) + (i_31_ << -478547892)));
                            }
                            Class56.aLong749 = class248_sub39_26_.method2600(0);
                        }
                    }
                    if (class248_sub36 != null) {
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset + -i_25_);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    }
                }
                if (class248_sub39 != null) {
                    long l = ((class248_sub39.method2600(0) + -Class84_Sub8.aLong5474) / 50L);
                    Class84_Sub8.aLong5474 = class248_sub39.method2600(0);
                    if (l > 32767L)
                        l = 32767L;
                    int i_32_ = class248_sub39.method2601((byte) -56);
                    if ((i_32_ ^ 0xffffffff) <= -1) {
                        if (i_32_ > 65535)
                            i_32_ = 65535;
                    } else
                        i_32_ = 0;
                    int i_33_ = class248_sub39.method2606(-15204);
                    if (i_33_ < 0)
                        i_33_ = 0;
                    else if ((i_33_ ^ 0xffffffff) < -65536)
                        i_33_ = 65535;
                    int i_34_ = 0;
                    if (class248_sub39.method2604(-126) == 2)
                        i_34_ = 1;
                    Class140.anInt1665++;
                    int i_35_ = (int) l;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class329.aOutgoingOpcode_3842);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, i_34_ << -1706582001 | i_35_);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, i_33_ | i_32_ << 1150035248);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (Class370.anInt4555 > 0) {
                    Class335.anInt3907++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class76.aOutgoingOpcode_980);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-120, 3 * Class370.anInt4555);
                    for (int i_36_ = 0; ((i_36_ ^ 0xffffffff) > (Class370.anInt4555 ^ 0xffffffff)); i_36_++) {
                        Interface19 interface19 = (Node_Sub8_Sub16.anInterface19Array9052[i_36_]);
                        long l = ((interface19.method59(30000) - Class171.aLong1984) / 50L);
                        Class171.aLong1984 = interface19.method59(30000);
                        if (l > 65535L)
                            l = 65535L;
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-36, interface19.method61(-18458));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, (int) l);
                    }
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (OutgoingOpcode.anInt1919 > 0)
                    OutgoingOpcode.anInt1919--;
                if (Class207.aBoolean2398 && OutgoingOpcode.anInt1919 <= 0) {
                    OutgoingOpcode.anInt1919 = 20;
                    Class207.aBoolean2398 = false;
                    Class307.anInt3565++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class136_Sub1.aOutgoingOpcode_8381));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA((int) Node_Sub8_Sub13.aFloat9030 >> -2087410845, 110);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShort(1182, (int) Class282_Sub7.aFloat7661 >> 752519299);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (Class340_Sub6.aBoolean8146 == !Class172.aBoolean1997) {
                    aa_Sub3.anInt5267++;
                    Class340_Sub6.aBoolean8146 = Class172.aBoolean1997;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), Class110.aOutgoingOpcode_1383);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-41, !Class172.aBoolean1997 ? 0 : 1);
                    Class226_Sub3.method1814(class248_sub36, 0);
                }
                if (!Class37.aBoolean408) {
                    Node_Sub14_Sub25.anInt9427++;
                    Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class340_Sub10.aOutgoingOpcode_8220));
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-121, 0);
                    int i_37_ = (((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                    ByteStream class248_sub9 = Node_Sub14_Sub38.aClass248_Sub45_9584.method2646((byte) -112);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2215(0, (byte) -32, ((ByteStream) class248_sub9).buffer, ((ByteStream) class248_sub9).offset);
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2216(-20198, -i_37_ + ((ByteStream) (((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257)).offset);
                    Class226_Sub3.method1814(class248_sub36, 0);
                    Class37.aBoolean408 = true;
                }
                if (Class311.aClass137ArrayArrayArray3620 != null) {
                    if ((Node_Sub45.anInt7343 ^ 0xffffffff) != -3) {
                        if ((Node_Sub45.anInt7343 ^ 0xffffffff) == -4)
                            Class158.method1397(2);
                    } else
                        Node_Sub15_Sub5.method2496(18128);
                }
                if (!Class162_Sub2.aBoolean6483)
                    Class325.aFloat3829 /= 2.0F;
                else
                    Class162_Sub2.aBoolean6483 = false;
                if (!Class359.aBoolean4437)
                    Class192.aFloat2216 /= 2.0F;
                else
                    Class359.aBoolean4437 = false;
                Node_Sub11_Sub1.method2253((byte) 34);
                if ((Class273.anInt5008 ^ 0xffffffff) == -11) {
                    Class346_Sub7_Sub1_Sub1.method3585(109);
                    Class304.method3208(2249);
                    Class372.method3865(-119);
                    Class45.anInt569++;
                    if (Class45.anInt569 > 750)
                        Class282_Sub2.method2929(16384);
                    else {
                        Class289.method3088(-24458);
                        Node_Sub14_Sub32.method2370(51);
                        Class121.method1127(32684);
                        for (int i_38_ = Node_Sub43.aClass291_7306.method3099(117, true); (i_38_ ^ 0xffffffff) != 0; i_38_ = Node_Sub43.aClass291_7306.method3099(116, false)) {
                            Class238_Sub2.method1894(false, i_38_);
                            Class282_Sub14.anIntArray7725[Class112.method794(Class115.anInt4949++, 31)] = i_38_;
                        }
                        for (Node_Sub8_Sub10 class248_sub8_sub10 = Class203.method1684(31638); class248_sub8_sub10 != null; class248_sub8_sub10 = Class203.method1684(31638)) {
                            int i_39_ = class248_sub8_sub10.method2077(-126);
                            int i_40_ = class248_sub8_sub10.method2083((byte) 81);
                            if (i_39_ != 1) {
                                if (i_39_ != 2) {
                                    if ((i_39_ ^ 0xffffffff) != -4) {
                                        if ((i_39_ ^ 0xffffffff) == -5) {
                                            RSInterface2 class354 = Class276.method2853(65535, i_40_);
                                            int i_41_ = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                            int i_42_ = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976);
                                            int i_43_ = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981);
                                            if (i_41_ != (((RSInterface2) class354).anInt4222) || (i_42_ != (((RSInterface2) class354).anInt4269)) || (((RSInterface2) class354).anInt4338) != i_43_) {
                                                ((RSInterface2) class354).anInt4222 = i_41_;
                                                ((RSInterface2) class354).anInt4269 = i_42_;
                                                ((RSInterface2) class354).anInt4338 = i_43_;
                                                Class376.method3882(class354, 2260);
                                            }
                                        } else if ((i_39_ ^ 0xffffffff) == -6) {
                                            RSInterface2 class354 = Class276.method2853(65535, i_40_);
                                            if ((((((RSInterface2) class354).anInt4248) ^ 0xffffffff) != ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983) ^ 0xffffffff)) || (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983) == -1) {
                                                ((RSInterface2) class354).anInt4237 = 0;
                                                ((RSInterface2) class354).anInt4234 = 0;
                                                ((RSInterface2) class354).anInt4248 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                ((RSInterface2) class354).anInt4282 = 1;
                                                Class182 class182 = (((((RSInterface2) class354).anInt4248) ^ 0xffffffff) == 0 ? null : (Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248))));
                                                if (class182 != null)
                                                    aa_Sub1.method157(class182, false, (((RSInterface2) class354).anInt4237));
                                                Class376.method3882(class354, 2260);
                                            }
                                        } else if ((i_39_ ^ 0xffffffff) != -7) {
                                            if (i_39_ == 7) {
                                                RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                boolean bool = ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983) == 1);
                                                if (!(((RSInterface2) class354).aBoolean4293) == bool) {
                                                    ((RSInterface2) class354).aBoolean4293 = bool;
                                                    Class376.method3882(class354, 2260);
                                                }
                                            } else if ((i_39_ ^ 0xffffffff) == -9) {
                                                RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                if ((((((RSInterface2) class354).anInt4328) ^ 0xffffffff) != ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983) ^ 0xffffffff)) || ((((RSInterface2) class354).anInt4209) != (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976)) || ((((RSInterface2) class354).anInt4365) != (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981))) {
                                                    ((RSInterface2) class354).anInt4328 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                    ((RSInterface2) class354).anInt4209 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976);
                                                    ((RSInterface2) class354).anInt4365 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981);
                                                    if (((((RSInterface2) class354).id) ^ 0xffffffff) != 0) {
                                                        if ((((RSInterface2) class354).anInt4321) > 0)
                                                            ((RSInterface2) class354).anInt4365 = ((((RSInterface2) class354).anInt4365) * 32 / (((RSInterface2) class354).anInt4321));
                                                        else if ((((RSInterface2) class354).anInt4306) > 0)
                                                            ((RSInterface2) class354).anInt4365 = (32 * (((RSInterface2) class354).anInt4365) / (((RSInterface2) class354).anInt4306));
                                                    }
                                                    Class376.method3882(class354, 2260);
                                                }
                                            } else if (i_39_ != 9) {
                                                if (i_39_ != 10) {
                                                    if (i_39_ == 11) {
                                                        RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                        ((RSInterface2) class354).aByte4298 = (byte) 0;
                                                        ((RSInterface2) class354).anInt4257 = ((RSInterface2) class354).anInt4331 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                        ((RSInterface2) class354).anInt4370 = ((RSInterface2) class354).anInt4239 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976);
                                                        ((RSInterface2) class354).aByte4243 = (byte) 0;
                                                        Class376.method3882(class354, 2260);
                                                    } else if ((i_39_ ^ 0xffffffff) != -13) {
                                                        if (i_39_ == 14) {
                                                            RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                            ((RSInterface2) class354).anInt4254 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                        } else if (i_39_ == 15) {
                                                            Applet_Sub1.anInt44 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                            Class72.anInt4876 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976);
                                                            Class381.aBoolean4681 = true;
                                                        } else if ((i_39_ ^ 0xffffffff) == -17) {
                                                            RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                            ((RSInterface2) class354).anInt4275 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                        } else if (i_39_ == 17) {
                                                            RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                            ((RSInterface2) class354).anInt4336 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                        }
                                                    } else {
                                                        RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                        int i_44_ = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                        if (class354 != null && (((((RSInterface2) class354).anInt4284) ^ 0xffffffff) == -1)) {
                                                            if (i_44_ > (-(((RSInterface2) class354).anInt4223) + (((RSInterface2) class354).anInt4345)))
                                                                i_44_ = ((((RSInterface2) class354).anInt4345) + -(((RSInterface2) class354).anInt4223));
                                                            if ((i_44_ ^ 0xffffffff) > -1)
                                                                i_44_ = 0;
                                                            if (i_44_ != (((RSInterface2) class354).anInt4271)) {
                                                                ((RSInterface2) class354).anInt4271 = i_44_;
                                                                Class376.method3882(class354, 2260);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                    if (((((RSInterface2) class354).anInt4280 ^ 0xffffffff) != ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983) ^ 0xffffffff)) || ((((RSInterface2) class354).anInt4350) != (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976)) || (((((RSInterface2) class354).anInt4289) ^ 0xffffffff) != ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981) ^ 0xffffffff))) {
                                                        ((RSInterface2) class354).anInt4289 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8981);
                                                        ((RSInterface2) class354).anInt4280 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                        ((RSInterface2) class354).anInt4350 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976);
                                                        Class376.method3882(class354, 2260);
                                                    }
                                                }
                                            } else {
                                                RSInterface2 class354 = (Class276.method2853(65535, i_40_));
                                                if ((((((RSInterface2) class354).id) ^ 0xffffffff) != ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983) ^ 0xffffffff)) || (((((RSInterface2) class354).anInt4263) ^ 0xffffffff) != ((((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976) ^ 0xffffffff))) {
                                                    ((RSInterface2) class354).id = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                                    ((RSInterface2) class354).anInt4263 = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8976);
                                                    Class376.method3882(class354, 2260);
                                                }
                                            }
                                        } else {
                                            int i_45_ = (((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983);
                                            int i_46_ = ((0x7db9 & i_45_) >> 786033514);
                                            int i_47_ = 0x1f & i_45_ >> 988431333;
                                            int i_48_ = i_45_ & 0x1f;
                                            int i_49_ = ((i_47_ << -1552101333) + (i_46_ << -682953773) - -(i_48_ << -2116762525));
                                            RSInterface2 class354 = Class276.method2853(65535, i_40_);
                                            if (((RSInterface2) class354).anInt4308 != i_49_) {
                                                ((RSInterface2) class354).anInt4308 = i_49_;
                                                Class376.method3882(class354, 2260);
                                            }
                                        }
                                    } else {
                                        RSInterface2 class354 = Class276.method2853(65535, i_40_);
                                        if (!((Node_Sub8_Sub10) class248_sub8_sub10).aString8974.equals(((RSInterface2) class354).aString4250)) {
                                            ((RSInterface2) class354).aString4250 = (((Node_Sub8_Sub10) class248_sub8_sub10).aString8974);
                                            Class376.method3882(class354, 2260);
                                        }
                                    }
                                } else {
                                    Class282_Sub2.aStringArray7612[i_40_] = ((Node_Sub8_Sub10) class248_sub8_sub10).aString8974;
                                    Node_Sub45.anIntArray7359[Class112.method794(31, Class84_Sub3.anInt5401++)] = i_40_;
                                }
                            } else {
                                Class357.anIntArray4417[i_40_] = ((Node_Sub8_Sub10) class248_sub8_sub10).anInt8983;
                                Class346_Sub7_Sub1_Sub1.aBoolean10133 |= Class215.aBooleanArray2477[i_40_];
                                Class311.anIntArray3621[Class112.method794(31, Class264.anInt2999++)] = i_40_;
                            }
                        }
                        if (Class276.anInt3206 != 0) {
                            Class221.anInt2537 += 20;
                            if (Class221.anInt2537 >= 400)
                                Class276.anInt3206 = 0;
                        }
                        Class77.anInt998++;
                        if (Class18.aClass354_294 != null) {
                            Node_Sub8.anInt6874++;
                            if ((Node_Sub8.anInt6874 ^ 0xffffffff) <= -16) {
                                Class376.method3882(Class18.aClass354_294, 2260);
                                Class18.aClass354_294 = null;
                            }
                        }
                        Class305.aBoolean3549 = false;
                        WorldAddress.aClass354_1193 = null;
                        Class316_Sub2.aClass354_8052 = null;
                        Node_Sub8_Sub13_Sub1.aBoolean10242 = false;
                        Class102.method727(-1, -104, null, -1);
                        Node_Sub8.method2017(-1, null, -1, (byte) 13);
                        if (!Class115.aBoolean4952)
                            Class136_Sub4.anInt8413 = -1;
                        Class282_Sub24.method3021(0);
                        Class164.anInt1934++;
                        if (Class218.aBoolean2507) {
                            Class8.anInt175++;
                            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class333.aOutgoingOpcode_3894));
                            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEInt((byte) 109, (Viewport.anInt2648 << 157079502 | OutputStream_Sub1.anInt88 << 1515474588 | Class338.anInt3938));
                            Class226_Sub3.method1814(class248_sub36, 0);
                            Class218.aBoolean2507 = false;
                        }
                        for (; ; ) {
                            RSInterface class248_sub6 = ((RSInterface) Node_Sub8_Sub10.aClass293_8979.method3108(false));
                            if (class248_sub6 == null)
                                break;
                            RSInterface2 class354 = (((RSInterface) class248_sub6).rsInter);
                            if ((((RSInterface2) class354).index ^ 0xffffffff) <= -1) {
                                RSInterface2 class354_50_ = Class276.method2853(65535, (((RSInterface2) class354).anInt4300));
                                if (class354_50_ == null || (((RSInterface2) class354_50_).aClass354Array4285) == null || (((RSInterface2) class354).index >= (((RSInterface2) class354_50_).aClass354Array4285).length) || ((((RSInterface2) class354_50_).aClass354Array4285[((RSInterface2) class354).index]) != class354))
                                    continue;
                            }
                            Class47.executeScript(class248_sub6);
                        }
                        for (; ; ) {
                            RSInterface class248_sub6 = ((RSInterface) Class71.aClass293_5032.method3108(false));
                            if (class248_sub6 == null)
                                break;
                            RSInterface2 class354 = (((RSInterface) class248_sub6).rsInter);
                            if ((((RSInterface2) class354).index ^ 0xffffffff) <= -1) {
                                RSInterface2 class354_51_ = Class276.method2853(65535, (((RSInterface2) class354).anInt4300));
                                if (class354_51_ == null || (((RSInterface2) class354_51_).aClass354Array4285) == null || (((((RSInterface2) class354_51_).aClass354Array4285).length ^ 0xffffffff) >= (((RSInterface2) class354).index ^ 0xffffffff)) || class354 != (((RSInterface2) class354_51_).aClass354Array4285[(((RSInterface2) class354).index)]))
                                    continue;
                            }
                            Class47.executeScript(class248_sub6);
                        }
                        for (; ; ) {
                            RSInterface class248_sub6 = ((RSInterface) Class176.aClass293_2065.method3108(false));
                            if (class248_sub6 == null)
                                break;
                            RSInterface2 class354 = (((RSInterface) class248_sub6).rsInter);
                            if (((RSInterface2) class354).index >= 0) {
                                RSInterface2 class354_52_ = Class276.method2853(65535, (((RSInterface2) class354).anInt4300));
                                if (class354_52_ == null || (((RSInterface2) class354_52_).aClass354Array4285) == null || (((RSInterface2) class354).index >= (((RSInterface2) class354_52_).aClass354Array4285).length) || class354 != (((RSInterface2) class354_52_).aClass354Array4285[(((RSInterface2) class354).index)]))
                                    continue;
                            }
                            Class47.executeScript(class248_sub6);
                        }
                        if (WorldAddress.aClass354_1193 == null)
                            Class282_Sub12.anInt7715 = 0;
                        if (Class371.aClass354_4564 != null)
                            ha.method815((byte) 65);
                        if (Class226_Sub1_Sub1.anInt8801 > 0 && Class353.aClass253_4192.method2722(true, 82) && Class353.aClass253_4192.method2722(true, 81) && Class329.anInt3851 != 0) {
                            int i_53_ = ((((Interactable) (Class347.myPlayer)).plane) - Class329.anInt3851);
                            if (i_53_ < 0)
                                i_53_ = 0;
                            else if ((i_53_ ^ 0xffffffff) < -4)
                                i_53_ = 3;
                            Class258.method2756((Class368.baseY + (((Entity) (Class347.myPlayer)).posQueueY[0])), (((Entity) Class347.myPlayer).posQueueX[0]) + Class67.baseX, i_53_, false);
                        }
                        Class141.method1285((byte) -16);
                        for (int i_54_ = 0; (i_54_ ^ 0xffffffff) > -6; i_54_++)
                            Class23.anIntArray322[i_54_]++;
                        if (Class346_Sub7_Sub1_Sub1.aBoolean10133 && (Node_Sub8_Sub1.aLong8892 < Class118.method1112(116) - 60000L))
                            Class94.method691((byte) -99);
                        for (Class346_Sub5_Sub1 class346_sub5_sub1 = ((Class346_Sub5_Sub1) Class101.aClass360_1285.method3815((byte) 14)); class346_sub5_sub1 != null; class346_sub5_sub1 = ((Class346_Sub5_Sub1) Class101.aClass360_1285.method3809(-24951))) {
                            if ((long) ((Class346_Sub5_Sub1) class346_sub5_sub1).anInt9879 < Class118.method1112(116) / 1000L + -5L) {
                                if (((((Class346_Sub5_Sub1) class346_sub5_sub1).aShort9883) ^ 0xffffffff) < -1)
                                    Class216.method1740(0, (((Class346_Sub5_Sub1) class346_sub5_sub1).aString9882 + (Class41.aClass41_485.method301(Class191.anInt4822, (byte) -108))), "", (byte) -15, "", "", 5);
                                if (((((Class346_Sub5_Sub1) class346_sub5_sub1).aShort9883) ^ 0xffffffff) == -1)
                                    Class216.method1740(0, (((Class346_Sub5_Sub1) class346_sub5_sub1).aString9882 + (Class41.aClass41_486.method301(Class191.anInt4822, (byte) -108))), "", (byte) -15, "", "", 5);
                                class346_sub5_sub1.method3538(-128);
                            }
                        }
                        Node_Sub14_Sub26.anInt9429++;
                        if (Node_Sub14_Sub26.anInt9429 > 500) {
                            Node_Sub14_Sub26.anInt9429 = 0;
                            int i_55_ = (int) (8.0 * Math.random());
                            if ((i_55_ & 0x1 ^ 0xffffffff) == -2)
                                Node_Sub41.anInt7288 += Class2.anInt116;
                            if ((0x4 & i_55_) == 4)
                                Class86.anInt1066 += Node_Sub8_Sub20.anInt9090;
                            if ((0x2 & i_55_ ^ 0xffffffff) == -3)
                                Class185.anInt2162 += Class346_Sub7_Sub4_Sub2.anInt10169;
                        }
                        if (i <= -5) {
                            if (Node_Sub41.anInt7288 < -50)
                                Class2.anInt116 = 2;
                            if ((Node_Sub41.anInt7288 ^ 0xffffffff) < -51)
                                Class2.anInt116 = -2;
                            if (Class185.anInt2162 < -55)
                                Class346_Sub7_Sub4_Sub2.anInt10169 = 2;
                            if (Class185.anInt2162 > 55)
                                Class346_Sub7_Sub4_Sub2.anInt10169 = -2;
                            if (Class86.anInt1066 < -40)
                                Node_Sub8_Sub20.anInt9090 = 1;
                            Class297_Sub1.anInt8482++;
                            if ((Class86.anInt1066 ^ 0xffffffff) < -41)
                                Node_Sub8_Sub20.anInt9090 = -1;
                            if (Class297_Sub1.anInt8482 > 500) {
                                Class297_Sub1.anInt8482 = 0;
                                int i_56_ = (int) (Math.random() * 8.0);
                                if ((0x2 & i_56_ ^ 0xffffffff) == -3)
                                    Class252.anInt2843 += Class238_Sub3.anInt6782;
                                if ((0x1 & i_56_) == 1)
                                    Class346_Sub7_Sub5.anInt9958 += Node_Sub24.anInt7125;
                            }
                            if (Class346_Sub7_Sub5.anInt9958 < -60)
                                Node_Sub24.anInt7125 = 2;
                            if (Class346_Sub7_Sub5.anInt9958 > 60)
                                Node_Sub24.anInt7125 = -2;
                            if (Class252.anInt2843 < -20)
                                Class238_Sub3.anInt6782 = 1;
                            Class173.anInt2014++;
                            if (Class252.anInt2843 > 10)
                                Class238_Sub3.anInt6782 = -1;
                            if (Class173.anInt2014 > 50) {
                                Class338.requestAttempts++;
                                Node_Sub36 class248_sub36 = (Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class232.aOutgoingOpcode_2612));
                                Class226_Sub3.method1814(class248_sub36, 0);
                                //System.out.println("OUT 83-2");
                            }
                            if (Class113.aBoolean1400) {
                                Class223.method1773(0);
                                Class113.aBoolean1400 = false;
                            }
                            try {
                                Class285.method3074(7388);
                            } catch (java.io.IOException ioexception) {
                                Class282_Sub2.method2929(16384);
                            }
                        }
                    }
                }
            }
        }
    }

    final void method3240(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_) {
        anInt3602++;
        for (int i_62_ = i_61_; i_62_ < i_61_ + i_58_; i_62_++) {
            for (int i_63_ = i_60_; (i_63_ ^ 0xffffffff) > (i_60_ + i_57_ ^ 0xffffffff); i_63_++) {
                if (i_63_ >= 0 && ((((Class310) this).anInt3597 ^ 0xffffffff) < (i_63_ ^ 0xffffffff)) && i_62_ >= 0 && i_62_ < ((Class310) this).anInt3580)
                    ((Class310) this).anIntArrayArrayArray3592[i_59_][i_63_][i_62_] = i_59_ <= 0 ? 0 : -960 + (((Class310) this).anIntArrayArrayArray3592[-1 + i_59_][i_63_][i_62_]);
            }
        }
        if (i_60_ > 0 && i_60_ < ((Class310) this).anInt3597) {
            for (int i_64_ = 1 + i_61_; (i_61_ + i_58_ ^ 0xffffffff) < (i_64_ ^ 0xffffffff); i_64_++) {
                if ((i_64_ ^ 0xffffffff) <= -1 && (i_64_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff))
                    ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_64_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][-1 + i_60_][i_64_]);
            }
        }
        if (i_61_ > 0 && i_61_ < ((Class310) this).anInt3580) {
            for (int i_65_ = i_60_ + 1; (i_65_ ^ 0xffffffff) > (i_57_ + i_60_ ^ 0xffffffff); i_65_++) {
                if (i_65_ >= 0 && ((((Class310) this).anInt3597 ^ 0xffffffff) < (i_65_ ^ 0xffffffff)))
                    ((Class310) this).anIntArrayArrayArray3592[i_59_][i_65_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][i_65_][i_61_ + -1]);
            }
        }
        if (i >= (i_60_ ^ 0xffffffff) && i_61_ >= 0 && (i_60_ ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff) && ((Class310) this).anInt3580 > i_61_) {
            if ((i_59_ ^ 0xffffffff) != -1) {
                if (i_60_ <= 0 || (((((Class310) this).anIntArrayArrayArray3592[i_59_ - 1][-1 + i_60_][i_61_]) ^ 0xffffffff) == ((((Class310) this).anIntArrayArrayArray3592[i_59_][-1 + i_60_][i_61_]) ^ 0xffffffff))) {
                    if (i_61_ <= 0 || (((((Class310) this).anIntArrayArrayArray3592[i_59_ + -1][i_60_][-1 + i_61_]) ^ 0xffffffff) == ((((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][-1 + i_61_]) ^ 0xffffffff))) {
                        if ((i_60_ ^ 0xffffffff) < -1 && (i_61_ ^ 0xffffffff) < -1 && ((((Class310) this).anIntArrayArrayArray3592[-1 + i_59_][-1 + i_60_][i_61_ - 1]) != (((Class310) this).anIntArrayArrayArray3592[i_59_][-1 + i_60_][-1 + i_61_])))
                            ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_ - 1][-1 + i_61_]);
                    } else
                        ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_ - 1]);
                } else
                    ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_ + -1][i_61_]);
            } else if (i_60_ > 0 && ((((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_ + -1][i_61_]) ^ 0xffffffff) != -1)
                ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][-1 + i_60_][i_61_]);
            else if (i_61_ <= 0 || (((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_ - 1]) == 0) {
                if ((i_60_ ^ 0xffffffff) < -1 && i_61_ > 0 && ((((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_ - 1][-1 + i_61_]) ^ 0xffffffff) != -1)
                    ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][-1 + i_60_][i_61_ - 1]);
            } else
                ((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_] = (((Class310) this).anIntArrayArrayArray3592[i_59_][i_60_][i_61_ + -1]);
        }
    }

    static final boolean method3241(int i, boolean bool) {
        anInt3600++;
        if (i <= 24)
            aShort3598 = (short) 91;
        boolean bool_66_ = Class287.aHa3381.q();
        if (!bool != !bool_66_) {
            if (bool) {
                if (!Class287.aHa3381.y())
                    bool = false;
            } else
                Class287.aHa3381.u();
            if (!bool_66_ == bool) {
                Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321), (byte) -71, bool ? 1 : 0);
                Class293.method3113(17458);
                return true;
            }
            return false;
        }
        return true;
    }

    final void method3242(int i, int i_67_, byte i_68_, int i_69_, int i_70_, Class164[] class164s, ByteStream class248_sub9, int i_71_, int i_72_, int i_73_) {
        anInt3585++;
        int i_74_ = (i & 0x7) * 8;
        int i_75_ = (i_72_ & 0x7) * 8;
        if (!((Class310) this).aBoolean3604) {
            Class164 class164 = class164s[i_71_];
            for (int i_76_ = 0; (i_76_ ^ 0xffffffff) > -9; i_76_++) {
                for (int i_77_ = 0; i_77_ < 8; i_77_++) {
                    int i_78_ = (Node_Sub14_Sub8.method2296(i_69_, i_77_ & 0x7, i_76_ & 0x7, i_68_ + 30139) + i_73_);
                    int i_79_ = i_67_ - -Class349_Sub1.method3736(i_77_ & 0x7, i_69_, i_76_ & 0x7, true);
                    if ((i_78_ ^ 0xffffffff) < -1 && ((-1 + ((Class310) this).anInt3597 ^ 0xffffffff) < (i_78_ ^ 0xffffffff)) && (i_79_ ^ 0xffffffff) < -1 && ((Class310) this).anInt3580 + -1 > i_79_)
                        class164.method1515(i_78_, -35, i_79_);
                }
            }
        }
        int i_80_ = i << 1303947939 & ~0x3f;
        int i_81_ = i_72_ << 1445369251 & ~0x3f;
        int i_82_ = 0;
        int i_83_ = 0;
        if ((i_69_ ^ 0xffffffff) != -2) {
            if (i_69_ == 2) {
                i_83_ = 1;
                i_82_ = 1;
            } else if (i_69_ == 3)
                i_82_ = 1;
        } else
            i_83_ = 1;
        if (i_68_ == 2) {
            for (int i_84_ = 0; ((Class310) this).anInt3608 > i_84_; i_84_++) {
                for (int i_85_ = 0; (i_85_ ^ 0xffffffff) > -65; i_85_++) {
                    for (int i_86_ = 0; (i_86_ ^ 0xffffffff) > -65; i_86_++) {
                        if (i_84_ != i_70_ || (i_74_ ^ 0xffffffff) < (i_85_ ^ 0xffffffff) || 8 + i_74_ < i_85_ || i_86_ < i_75_ || (i_86_ ^ 0xffffffff) < (8 + i_75_ ^ 0xffffffff))
                            method3249(0, 0, -1, 0, class248_sub9, 0, 0, -1, true, 0, false);
                        else {
                            int i_87_;
                            int i_88_;
                            if (8 + i_74_ != i_85_ && ((i_75_ - -8 ^ 0xffffffff) != (i_86_ ^ 0xffffffff))) {
                                i_88_ = i_73_ - -(Node_Sub14_Sub8.method2296(i_69_, i_86_ & 0x7, 0x7 & i_85_, 30141));
                                i_87_ = Class349_Sub1.method3736(i_86_ & 0x7, i_69_, 0x7 & i_85_, true) + i_67_;
                                method3249(i_69_, i_83_, i_88_, i_85_ + i_80_, class248_sub9, i_86_ + i_81_, i_71_, i_87_, true, i_82_, false);
                            } else {
                                if (i_69_ == 0) {
                                    i_87_ = i_86_ + (-i_75_ + i_67_);
                                    i_88_ = i_85_ - i_74_ + i_73_;
                                } else if (i_69_ != 1) {
                                    if ((i_69_ ^ 0xffffffff) == -3) {
                                        i_87_ = i_75_ - i_86_ + i_67_ + 8;
                                        i_88_ = 8 + (i_73_ + -i_85_) - -i_74_;
                                    } else {
                                        i_87_ = i_85_ - i_74_ + i_67_;
                                        i_88_ = -i_86_ - (-i_75_ - i_73_ - 8);
                                    }
                                } else {
                                    i_88_ = i_73_ - (i_75_ + -i_86_);
                                    i_87_ = -i_85_ - -i_74_ + (8 + i_67_);
                                }
                                method3249(0, 0, i_88_, i_85_ + i_80_, class248_sub9, i_86_ + i_81_, i_71_, i_87_, true, 0, true);
                            }
                            if ((i_85_ ^ 0xffffffff) == -64 || i_86_ == 63) {
                                int i_89_ = 1;
                                if ((i_85_ ^ 0xffffffff) == -64 && (i_86_ ^ 0xffffffff) == -64)
                                    i_89_ = 3;
                                for (int i_90_ = 0; ((i_90_ ^ 0xffffffff) > (i_89_ ^ 0xffffffff)); i_90_++) {
                                    int i_91_ = i_85_;
                                    int i_92_ = i_86_;
                                    if (i_90_ != 0) {
                                        if ((i_90_ ^ 0xffffffff) != -2) {
                                            if (i_90_ == 2)
                                                i_92_ = 64;
                                        } else
                                            i_91_ = 64;
                                    } else {
                                        i_92_ = ((i_86_ ^ 0xffffffff) != -64 ? i_86_ : 64);
                                        i_91_ = ((i_85_ ^ 0xffffffff) != -64 ? i_85_ : 64);
                                    }
                                    int i_93_;
                                    int i_94_;
                                    if ((i_69_ ^ 0xffffffff) != -1) {
                                        if ((i_69_ ^ 0xffffffff) == -2) {
                                            i_94_ = i_73_ - (-i_92_ + i_75_);
                                            i_93_ = 8 + i_67_ - i_91_ + i_74_;
                                        } else if (i_69_ == 2) {
                                            i_93_ = i_67_ - -8 + (-i_92_ - -i_75_);
                                            i_94_ = 8 + i_73_ - (i_91_ + -i_74_);
                                        } else {
                                            i_94_ = -i_92_ - (-i_75_ - 8 - i_73_);
                                            i_93_ = i_91_ + -i_74_ + i_67_;
                                        }
                                    } else {
                                        i_93_ = i_67_ - (i_75_ + -i_92_);
                                        i_94_ = -i_74_ + i_91_ + i_73_;
                                    }
                                    if (i_94_ >= 0 && ((i_94_ ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff)) && (i_93_ ^ 0xffffffff) <= -1 && ((Class310) this).anInt3580 > i_93_)
                                        ((Class310) this).anIntArrayArrayArray3592[i_71_][i_94_][i_93_] = (((Class310) this).anIntArrayArrayArray3592[i_71_][i_88_ + i_82_][i_83_ + i_87_]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final boolean method3243(int i) {
        if (i > -89)
            return true;
        anInt3596++;
        if (Class332.anInt3883 != 0)
            return true;
        return Class161.aClass248_Sub15_Sub1_1895.method2415(100);
    }

    private final void method3244(int i, s var_s, s var_s_95_, int i_96_, ha var_ha, int[][] is, s var_s_97_) {
        anInt3606++;
        byte[][] is_98_ = aByteArrayArrayArray3589[i_96_];
        byte[][] is_99_ = aByteArrayArrayArray3603[i_96_];
        if (i != 2)
            method3239((byte) -52);
        byte[][] is_100_ = aByteArrayArrayArray3605[i_96_];
        byte[][] is_101_ = aByteArrayArrayArray3594[i_96_];
        for (int i_102_ = 0; ((i_102_ ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff)); i_102_++) {
            int i_103_ = (-1 + ((Class310) this).anInt3597 > i_102_ ? 1 + i_102_ : i_102_);
            for (int i_104_ = 0; ((i_104_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)); i_104_++) {
                int i_105_ = (((Class310) this).anInt3580 - 1 <= i_104_ ? i_104_ : i_104_ + 1);
                if ((client.anInt5245 ^ 0xffffffff) == 0 || Class107.method752(i_102_, client.anInt5245, i_104_, i, i_96_)) {
                    boolean bool = false;
                    boolean bool_106_ = false;
                    boolean[] bools = new boolean[4];
                    byte i_107_ = is_98_[i_102_][i_104_];
                    int i_108_ = is_99_[i_102_][i_104_];
                    int i_109_ = is_101_[i_102_][i_104_] & 0xff;
                    int i_110_ = 0xff & is_100_[i_102_][i_104_];
                    int i_111_ = 0xff & is_100_[i_102_][i_105_];
                    int i_112_ = is_100_[i_103_][i_105_] & 0xff;
                    int i_113_ = is_100_[i_103_][i_104_] & 0xff;
                    if (i_109_ != 0 || i_110_ != 0) {
                        Class145 class145 = ((i_109_ ^ 0xffffffff) == -1 ? null : aClass144_3599.method1299(-1 + i_109_, i + -112));
                        if (i_107_ == 0 && class145 == null)
                            i_107_ = (byte) 12;
                        Class130 class130 = ((i_110_ ^ 0xffffffff) != -1 ? aClass192_3595.method1654(-1 + i_110_, false) : null);
                        Class145 class145_114_ = class145;
                        if (class145 != null) {
                            if (((Class145) class145).anInt1720 == -1 && ((Class145) class145).anInt1712 == -1) {
                                class145_114_ = class145;
                                class145 = null;
                            } else if (class130 != null && i_107_ != 0)
                                bool_106_ = ((Class145) class145).aBoolean1723;
                        }
                        if (((i_107_ ^ 0xffffffff) == -1 || i_107_ == 12) && i_102_ > 0 && (i_104_ ^ 0xffffffff) < -1 && ((((Class310) this).anInt3597 ^ 0xffffffff) < (i_102_ ^ 0xffffffff)) && ((i_104_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff))) {
                            int i_115_ = 0;
                            int i_116_ = 0;
                            int i_117_ = 0;
                            i_117_ = i_117_ + (i_110_ != is_100_[i_103_][i_105_] ? -1 : 1);
                            i_115_ = i_115_ + (((is_100_[-1 + i_102_][-1 + i_104_] ^ 0xffffffff) != (i_110_ ^ 0xffffffff)) ? -1 : 1);
                            i_116_ = i_116_ + (((is_100_[i_103_][i_104_ + -1] ^ 0xffffffff) == (i_110_ ^ 0xffffffff)) ? 1 : -1);
                            int i_118_ = 0;
                            i_118_ = (i_118_ + (is_100_[i_102_ - 1][i_105_] == i_110_ ? 1 : -1));
                            if (is_100_[i_102_][i_104_ - 1] != i_110_) {
                                i_115_--;
                                i_116_--;
                            } else {
                                i_116_++;
                                i_115_++;
                            }
                            if (is_100_[i_103_][i_104_] != i_110_) {
                                i_117_--;
                                i_116_--;
                            } else {
                                i_117_++;
                                i_116_++;
                            }
                            if (i_110_ != is_100_[i_102_][i_105_]) {
                                i_117_--;
                                i_118_--;
                            } else {
                                i_118_++;
                                i_117_++;
                            }
                            if ((is_100_[i_102_ - 1][i_104_] ^ 0xffffffff) == (i_110_ ^ 0xffffffff)) {
                                i_115_++;
                                i_118_++;
                            } else {
                                i_115_--;
                                i_118_--;
                            }
                            int i_119_ = -i_117_ + i_115_;
                            if (i_119_ < 0)
                                i_119_ = -i_119_;
                            int i_120_ = -i_118_ + i_116_;
                            if ((i_120_ ^ 0xffffffff) > -1)
                                i_120_ = -i_120_;
                            if (i_120_ == i_119_) {
                                i_119_ = (var_s_97_.method3145(i_102_, i + 45, i_104_) - var_s_97_.method3145(i_103_, 81, i_105_));
                                if ((i_119_ ^ 0xffffffff) > -1)
                                    i_119_ = -i_119_;
                                i_120_ = (var_s_97_.method3145(i_103_, 53, i_104_) + -var_s_97_.method3145(i_102_, 116, i_105_));
                                if (i_120_ < 0)
                                    i_120_ = -i_120_;
                            }
                            i_108_ = i_120_ > i_119_ ? 1 : 0;
                        }
                        for (int i_121_ = 0; (i_121_ ^ 0xffffffff) > -14; i_121_++) {
                            r_Sub1.anIntArray10269[i_121_] = -1;
                            Node_Sub8.anIntArray6860[i_121_] = 1;
                        }
                        boolean[] bools_122_ = ((class145 != null && ((Class145) class145).aBoolean1723) ? Class22.aBooleanArrayArray321[i_107_] : Class6.aBooleanArrayArray153[i_107_]);
                        method3251(i_104_, bools, is_98_, i_102_, class130, class145, is_101_, ((Class310) this).anInt3580, is_99_, var_ha, i_107_, i ^ 0x5b, ((Class310) this).anInt3597, i_108_);
                        boolean bool_123_ = (class145 != null && ((((Class145) class145).anInt1720 ^ 0xffffffff) != (((Class145) class145).anInt1712 ^ 0xffffffff)));
                        if (!bool_123_) {
                            for (int i_124_ = 0; (i_124_ ^ 0xffffffff) > -9; i_124_++) {
                                if (r_Sub1.anIntArray10269[i_124_] >= 0 && (Class212.anIntArray2457[i_124_] != (Class346_Sub7_Sub1.anIntArray9903[i_124_]))) {
                                    bool_123_ = true;
                                    break;
                                }
                            }
                        }
                        if (!bools_122_[0x3 & 1 + i_108_])
                            bools[1] = (Class278.method2861(bools[1], (Class112.method794((Node_Sub8.anIntArray6860[2]), (Node_Sub8.anIntArray6860[4])) == 0)));
                        if (!bools_122_[0x3 & i_108_ + 3])
                            bools[3] = (Class278.method2861(bools[3], (Class112.method794((Node_Sub8.anIntArray6860[0]), (Node_Sub8.anIntArray6860[6])) == 0)));
                        if (!bools_122_[0x3 & i_108_])
                            bools[0] = (Class278.method2861(bools[0], (Class112.method794((Node_Sub8.anIntArray6860[2]), (Node_Sub8.anIntArray6860[0])) == 0)));
                        if (!bools_122_[0x3 & i_108_ + 2])
                            bools[2] = (Class278.method2861(bools[2], (Class112.method794((Node_Sub8.anIntArray6860[6]), (Node_Sub8.anIntArray6860[4])) == 0)));
                        if (!bool_106_ && (i_107_ == 0 || (i_107_ ^ 0xffffffff) == -13)) {
                            if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
                                i_108_ = 0;
                                bools[0] = bools[3] = false;
                                i_107_ = i_107_ == 0 ? (byte) 13 : (byte) 14;
                            } else if (!bools[0] || !bools[1] || bools[2] || bools[3]) {
                                if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
                                    i_108_ = 2;
                                    bools[1] = bools[2] = false;
                                    i_107_ = ((i_107_ ^ 0xffffffff) == -1 ? (byte) 13 : (byte) 14);
                                } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
                                    i_108_ = 1;
                                    bools[2] = bools[3] = false;
                                    i_107_ = ((i_107_ ^ 0xffffffff) == -1 ? (byte) 13 : (byte) 14);
                                }
                            } else {
                                bools[0] = bools[1] = false;
                                i_108_ = 3;
                                i_107_ = i_107_ != 0 ? (byte) 14 : (byte) 13;
                            }
                        }
                        boolean bool_125_ = (!bool_106_ && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
                        int[] is_126_ = null;
                        int[] is_127_;
                        int i_128_;
                        int[] is_129_;
                        int[] is_130_;
                        int i_131_;
                        if (!bool_125_) {
                            if (bool_106_) {
                                is_130_ = Class316.anIntArrayArray3660[i_107_];
                                i_131_ = (class130 != null ? aa_Sub3.anIntArray5269[i_107_] : 0);
                                i_128_ = (class145 == null ? 0 : Class324.anIntArray3824[i_107_]);
                                is_127_ = (InputStream_Sub2.anIntArrayArray80[i_107_]);
                                is_126_ = IncommingOpcode.anIntArrayArray1479[i_107_];
                                is_129_ = (Node_Sub14_Sub31.anIntArrayArray9489[i_107_]);
                            } else {
                                is_127_ = r_Sub2.anIntArrayArray10274[i_107_];
                                is_129_ = Class216.anIntArrayArray2486[i_107_];
                                i_128_ = (class145 == null ? 0 : Class229.anIntArray2591[i_107_]);
                                is_126_ = Class19.anIntArrayArray304[i_107_];
                                is_130_ = Class268.anIntArrayArray3126[i_107_];
                                i_131_ = (class130 == null ? 0 : (Class346_Sub7_Sub2_Sub4.anIntArray10113[i_107_]));
                            }
                        } else {
                            is_127_ = Class19.anIntArrayArray306[i_107_];
                            i_128_ = (class145 != null ? Class343.anIntArray4059[i_107_] : 0);
                            is_129_ = Class40.anIntArrayArray442[i_107_];
                            is_130_ = (Node_Sub14_Sub4.anIntArrayArray9188[i_107_]);
                            i_131_ = (class130 == null ? 0 : Class140.anIntArray1663[i_107_]);
                        }
                        int i_132_ = i_128_ + i_131_;
                        if ((i_132_ ^ 0xffffffff) >= -1)
                            Node_Sub15_Sub5.method2502(i_96_, i_102_, i_104_);
                        else {
                            if (bools[0])
                                i_132_++;
                            if (bools[2])
                                i_132_++;
                            if (bools[1])
                                i_132_++;
                            if (bools[3])
                                i_132_++;
                            int i_133_ = 0;
                            int i_134_ = 0;
                            int i_135_ = i_132_ * 3;
                            int[] is_136_ = !bool_123_ ? null : new int[i_135_];
                            int[] is_137_ = new int[i_135_];
                            int[] is_138_ = new int[i_135_];
                            int[] is_139_ = new int[i_135_];
                            int[] is_140_ = new int[i_135_];
                            int[] is_141_ = new int[i_135_];
                            int[] is_142_ = var_s == null ? null : new int[i_135_];
                            int[] is_143_ = (var_s == null && var_s_95_ == null ? null : new int[i_135_]);
                            int i_144_ = -1;
                            int i_145_ = -1;
                            int i_146_ = 256;
                            if (class145 != null) {
                                i_145_ = ((Class145) class145).anInt1714;
                                i_146_ = ((Class145) class145).anInt1715;
                                i_144_ = ((Class145) class145).anInt1720;
                                int i_147_ = Class124.method1143(true, class145, var_ha);
                                for (int i_148_ = 0; i_128_ > i_148_; i_148_++) {
                                    boolean bool_149_ = false;
                                    int i_150_;
                                    if (!bools[0x3 & -i_108_] || is_126_[0] != i_133_) {
                                        if (!bools[0x3 & 2 + -i_108_] || ((is_126_[2] ^ 0xffffffff) != (i_133_ ^ 0xffffffff))) {
                                            if (bools[-i_108_ + 1 & 0x3] && ((is_126_[1] ^ 0xffffffff) == (i_133_ ^ 0xffffffff))) {
                                                Class14.anIntArray265[0] = is_127_[i_133_];
                                                Class14.anIntArray265[1] = 3;
                                                Class14.anIntArray265[2] = is_130_[i_133_];
                                                Class14.anIntArray265[3] = 3;
                                                Class14.anIntArray265[4] = is_129_[i_133_];
                                                Class14.anIntArray265[5] = is_130_[i_133_];
                                                i_150_ = 6;
                                            } else if (bools[0x3 & -i_108_ + 3] && ((is_126_[3] ^ 0xffffffff) == (i_133_ ^ 0xffffffff))) {
                                                Class14.anIntArray265[0] = is_127_[i_133_];
                                                Class14.anIntArray265[1] = 7;
                                                Class14.anIntArray265[2] = is_130_[i_133_];
                                                Class14.anIntArray265[3] = 7;
                                                Class14.anIntArray265[4] = is_129_[i_133_];
                                                i_150_ = 6;
                                                Class14.anIntArray265[5] = is_130_[i_133_];
                                            } else {
                                                Class14.anIntArray265[0] = is_127_[i_133_];
                                                Class14.anIntArray265[1] = is_129_[i_133_];
                                                i_150_ = 3;
                                                Class14.anIntArray265[2] = is_130_[i_133_];
                                            }
                                        } else {
                                            Class14.anIntArray265[0] = is_127_[i_133_];
                                            Class14.anIntArray265[1] = 5;
                                            Class14.anIntArray265[2] = is_130_[i_133_];
                                            Class14.anIntArray265[3] = 5;
                                            Class14.anIntArray265[4] = is_129_[i_133_];
                                            Class14.anIntArray265[5] = is_130_[i_133_];
                                            i_150_ = 6;
                                        }
                                    } else {
                                        Class14.anIntArray265[0] = is_127_[i_133_];
                                        Class14.anIntArray265[1] = 1;
                                        Class14.anIntArray265[2] = is_130_[i_133_];
                                        Class14.anIntArray265[3] = 1;
                                        Class14.anIntArray265[4] = is_129_[i_133_];
                                        i_150_ = 6;
                                        Class14.anIntArray265[5] = is_130_[i_133_];
                                    }
                                    i_133_++;
                                    for (int i_151_ = 0; ((i_150_ ^ 0xffffffff) < (i_151_ ^ 0xffffffff)); i_151_++) {
                                        int i_152_ = Class14.anIntArray265[i_151_];
                                        int i_153_ = -(i_108_ * 2) + i_152_ & 0x7;
                                        int i_154_ = anIntArray3601[i_152_];
                                        int i_155_ = anIntArray3591[i_152_];
                                        int i_156_;
                                        int i_157_;
                                        if ((i_108_ ^ 0xffffffff) == -2) {
                                            i_157_ = -i_154_ + 512;
                                            i_156_ = i_155_;
                                        } else if ((i_108_ ^ 0xffffffff) == -3) {
                                            i_156_ = -i_154_ + 512;
                                            i_157_ = -i_155_ + 512;
                                        } else if ((i_108_ ^ 0xffffffff) == -4) {
                                            i_157_ = i_154_;
                                            i_156_ = 512 - i_155_;
                                        } else {
                                            i_157_ = i_155_;
                                            i_156_ = i_154_;
                                        }
                                        is_137_[i_134_] = i_156_;
                                        is_138_[i_134_] = i_157_;
                                        if (is_142_ != null && (Class262.aBooleanArrayArray2980[i_107_][i_152_])) {
                                            int i_158_ = ((i_102_ << -1439067479) - -i_156_);
                                            int i_159_ = ((i_104_ << 1151138217) - -i_157_);
                                            is_142_[i_134_] = (var_s.method3150((byte) 109, i_158_, i_159_) + -(var_s_97_.method3150((byte) 123, i_158_, i_159_)));
                                        }
                                        if (is_143_ != null) {
                                            if (var_s == null || (Class262.aBooleanArrayArray2980[i_107_][i_152_])) {
                                                if (var_s_95_ != null && !(Class84_Sub7.aBooleanArrayArray5471[i_107_][i_152_])) {
                                                    int i_160_ = ((i_102_ << 1645554249) + i_156_);
                                                    int i_161_ = (i_157_ + (i_104_ << 66618153));
                                                    is_143_[i_134_] = ((var_s_95_.method3150((byte) 126, i_160_, i_161_)) + -(var_s_97_.method3150((byte) 120, i_160_, i_161_)));
                                                }
                                            } else {
                                                int i_162_ = (i_156_ + (i_102_ << -1470048663));
                                                int i_163_ = ((i_104_ << 1662922697) + i_157_);
                                                is_143_[i_134_] = ((var_s_97_.method3150((byte) 106, i_162_, i_163_)) + -(var_s.method3150((byte) 109, i_162_, i_163_)));
                                            }
                                        }
                                        if ((i_152_ ^ 0xffffffff) <= -9 || (((((Class145) class145).anInt1709) ^ 0xffffffff) <= ((r_Sub1.anIntArray10269[i_153_]) ^ 0xffffffff))) {
                                            if (is_136_ != null)
                                                is_136_[i_134_] = i_147_;
                                            is_140_[i_134_] = (((Class145) class145).anInt1714);
                                            is_141_[i_134_] = (((Class145) class145).anInt1715);
                                            is_139_[i_134_] = i_144_;
                                        } else {
                                            if (is_136_ != null)
                                                is_136_[i_134_] = (Class346_Sub7_Sub1.anIntArray9903[i_153_]);
                                            is_141_[i_134_] = (Node_Sub23.anIntArray7095[i_153_]);
                                            is_140_[i_134_] = (Class146.anIntArray1730[i_153_]);
                                            is_139_[i_134_] = (Class212.anIntArray2457[i_153_]);
                                        }
                                        i_134_++;
                                    }
                                }
                                if (!((Class310) this).aBoolean3604 && (i_96_ ^ 0xffffffff) == -1)
                                    Class271.method2831(i_102_, i_104_, ((Class145) class145).anInt1713, ((Class145) class145).anInt1705 * 8, ((Class145) class145).anInt1711);
                                if ((i_107_ ^ 0xffffffff) != -13 && (((Class145) class145).anInt1720 ^ 0xffffffff) != 0 && ((Class145) class145).aBoolean1722)
                                    bool = true;
                            } else if (!bool_125_) {
                                if (!bool_106_)
                                    i_133_ += Class229.anIntArray2591[i_107_];
                                else
                                    i_133_ += Class324.anIntArray3824[i_107_];
                            } else
                                i_133_ += Class343.anIntArray4059[i_107_];
                            if (class130 != null) {
                                if ((i_112_ ^ 0xffffffff) == -1)
                                    i_112_ = i_110_;
                                if (i_113_ == 0)
                                    i_113_ = i_110_;
                                if ((i_111_ ^ 0xffffffff) == -1)
                                    i_111_ = i_110_;
                                Class130 class130_164_ = aClass192_3595.method1654(i_110_ - 1, false);
                                Class130 class130_165_ = aClass192_3595.method1654(i_111_ - 1, false);
                                Class130 class130_166_ = aClass192_3595.method1654(-1 + i_112_, false);
                                Class130 class130_167_ = aClass192_3595.method1654(i_113_ + -1, false);
                                for (int i_168_ = 0; ((i_168_ ^ 0xffffffff) > (i_131_ ^ 0xffffffff)); i_168_++) {
                                    boolean bool_169_ = false;
                                    int i_170_;
                                    if (!bools[0x3 & -i_108_] || ((is_126_[0] ^ 0xffffffff) != (i_133_ ^ 0xffffffff))) {
                                        if (!bools[2 + -i_108_ & 0x3] || ((is_126_[2] ^ 0xffffffff) != (i_133_ ^ 0xffffffff))) {
                                            if (bools[0x3 & -i_108_ + 1] && i_133_ == is_126_[1]) {
                                                Class14.anIntArray265[0] = is_127_[i_133_];
                                                Class14.anIntArray265[1] = 3;
                                                Class14.anIntArray265[2] = is_130_[i_133_];
                                                Class14.anIntArray265[3] = 3;
                                                Class14.anIntArray265[4] = is_129_[i_133_];
                                                i_170_ = 6;
                                                Class14.anIntArray265[5] = is_130_[i_133_];
                                            } else if (bools[-i_108_ + 3 & 0x3] && ((is_126_[3] ^ 0xffffffff) == (i_133_ ^ 0xffffffff))) {
                                                Class14.anIntArray265[0] = is_127_[i_133_];
                                                Class14.anIntArray265[1] = 7;
                                                Class14.anIntArray265[2] = is_130_[i_133_];
                                                Class14.anIntArray265[3] = 7;
                                                Class14.anIntArray265[4] = is_129_[i_133_];
                                                i_170_ = 6;
                                                Class14.anIntArray265[5] = is_130_[i_133_];
                                            } else {
                                                Class14.anIntArray265[0] = is_127_[i_133_];
                                                Class14.anIntArray265[1] = is_129_[i_133_];
                                                Class14.anIntArray265[2] = is_130_[i_133_];
                                                i_170_ = 3;
                                            }
                                        } else {
                                            Class14.anIntArray265[0] = is_127_[i_133_];
                                            Class14.anIntArray265[1] = 5;
                                            Class14.anIntArray265[2] = is_130_[i_133_];
                                            Class14.anIntArray265[3] = 5;
                                            Class14.anIntArray265[4] = is_129_[i_133_];
                                            i_170_ = 6;
                                            Class14.anIntArray265[5] = is_130_[i_133_];
                                        }
                                    } else {
                                        Class14.anIntArray265[0] = is_127_[i_133_];
                                        Class14.anIntArray265[1] = 1;
                                        Class14.anIntArray265[2] = is_130_[i_133_];
                                        Class14.anIntArray265[3] = 1;
                                        Class14.anIntArray265[4] = is_129_[i_133_];
                                        Class14.anIntArray265[5] = is_130_[i_133_];
                                        i_170_ = 6;
                                    }
                                    i_133_++;
                                    for (int i_171_ = 0; i_170_ > i_171_; i_171_++) {
                                        int i_172_ = Class14.anIntArray265[i_171_];
                                        int i_173_ = i_172_ - 2 * i_108_ & 0x7;
                                        int i_174_ = anIntArray3601[i_172_];
                                        int i_175_ = anIntArray3591[i_172_];
                                        int i_176_;
                                        int i_177_;
                                        if (i_108_ != 1) {
                                            if (i_108_ == 2) {
                                                i_177_ = 512 + -i_174_;
                                                i_176_ = -i_175_ + 512;
                                            } else if (i_108_ != 3) {
                                                i_176_ = i_175_;
                                                i_177_ = i_174_;
                                            } else {
                                                i_177_ = -i_175_ + 512;
                                                i_176_ = i_174_;
                                            }
                                        } else {
                                            i_176_ = -i_174_ + 512;
                                            i_177_ = i_175_;
                                        }
                                        is_137_[i_134_] = i_177_;
                                        is_138_[i_134_] = i_176_;
                                        if (is_142_ != null && (Class262.aBooleanArrayArray2980[i_107_][i_172_])) {
                                            int i_178_ = ((i_102_ << 1117914121) - -i_177_);
                                            int i_179_ = (i_176_ + (i_104_ << 1616735177));
                                            is_142_[i_134_] = (var_s.method3150((byte) 118, i_178_, i_179_) + -(var_s_97_.method3150((byte) 108, i_178_, i_179_)));
                                        }
                                        if (is_143_ != null) {
                                            if (var_s == null || (Class262.aBooleanArrayArray2980[i_107_][i_172_])) {
                                                if (var_s_95_ != null && !(Class84_Sub7.aBooleanArrayArray5471[i_107_][i_172_])) {
                                                    int i_180_ = ((i_102_ << -297649847) + i_177_);
                                                    int i_181_ = (i_176_ + (i_104_ << -963305655));
                                                    is_143_[i_134_] = ((var_s_95_.method3150((byte) 104, i_180_, i_181_)) + -(var_s_97_.method3150((byte) 110, i_180_, i_181_)));
                                                }
                                            } else {
                                                int i_182_ = ((i_102_ << 1198229225) - -i_177_);
                                                int i_183_ = i_176_ + (i_104_ << 584396809);
                                                is_143_[i_134_] = ((var_s_97_.method3150((byte) 122, i_182_, i_183_)) + -(var_s.method3150((byte) 126, i_182_, i_183_)));
                                            }
                                        }
                                        if ((i_172_ ^ 0xffffffff) <= -9 || (r_Sub1.anIntArray10269[i_173_] ^ 0xffffffff) > -1) {
                                            if (bool_106_ && (Class262.aBooleanArrayArray2980[i_107_][i_172_])) {
                                                is_140_[i_134_] = i_145_;
                                                is_141_[i_134_] = i_146_;
                                                is_139_[i_134_] = i_144_;
                                            } else if (i_177_ != 0 || ((i_176_ ^ 0xffffffff) != -1)) {
                                                if (i_177_ != 0 || ((i_176_ ^ 0xffffffff) != -513)) {
                                                    if (i_177_ != 512 || i_176_ != 512) {
                                                        if (i_177_ == 512 && i_176_ == 0) {
                                                            is_139_[i_134_] = (is[i_103_][i_104_]);
                                                            is_140_[i_134_] = (((Class130) class130_167_).anInt1572);
                                                            is_141_[i_134_] = (((Class130) class130_167_).anInt1586);
                                                        } else {
                                                            if ((i_177_ ^ 0xffffffff) <= -257) {
                                                                if ((i_176_ ^ 0xffffffff) > -257) {
                                                                    is_140_[i_134_] = (((Class130) class130_167_).anInt1572);
                                                                    is_141_[i_134_] = (((Class130) class130_167_).anInt1586);
                                                                } else {
                                                                    is_140_[i_134_] = (((Class130) class130_166_).anInt1572);
                                                                    is_141_[i_134_] = (((Class130) class130_166_).anInt1586);
                                                                }
                                                            } else if ((i_176_ ^ 0xffffffff) <= -257) {
                                                                is_140_[i_134_] = (((Class130) class130_165_).anInt1572);
                                                                is_141_[i_134_] = (((Class130) class130_165_).anInt1586);
                                                            } else {
                                                                is_140_[i_134_] = (((Class130) class130_164_).anInt1572);
                                                                is_141_[i_134_] = (((Class130) class130_164_).anInt1586);
                                                            }
                                                            int i_184_ = (Class15.method219(64512, (is[i_102_][i_104_]), (i_177_ << 381727207 >> 1172916297), (is[i_103_][i_104_])));
                                                            int i_185_ = (Class15.method219(64512, (is[i_102_][i_105_]), (i_177_ << 1432865063 >> -2140647287), (is[i_103_][i_105_])));
                                                            is_139_[i_134_] = (Class15.method219(i + 64510, i_184_, (i_176_ << -1236978745 >> 2081769801), i_185_));
                                                        }
                                                    } else {
                                                        is_139_[i_134_] = (is[i_103_][i_105_]);
                                                        is_140_[i_134_] = (((Class130) class130_166_).anInt1572);
                                                        is_141_[i_134_] = (((Class130) class130_166_).anInt1586);
                                                    }
                                                } else {
                                                    is_139_[i_134_] = is[i_102_][i_105_];
                                                    is_140_[i_134_] = (((Class130) class130_165_).anInt1572);
                                                    is_141_[i_134_] = (((Class130) class130_165_).anInt1586);
                                                }
                                            } else {
                                                is_139_[i_134_] = is[i_102_][i_104_];
                                                is_140_[i_134_] = (((Class130) class130_164_).anInt1572);
                                                is_141_[i_134_] = (((Class130) class130_164_).anInt1586);
                                            }
                                            if (is_136_ != null)
                                                is_136_[i_134_] = is_139_[i_134_];
                                        } else {
                                            if (is_136_ != null)
                                                is_136_[i_134_] = (Class346_Sub7_Sub1.anIntArray9903[i_173_]);
                                            is_141_[i_134_] = (Node_Sub23.anIntArray7095[i_173_]);
                                            is_140_[i_134_] = (Class146.anIntArray1730[i_173_]);
                                            is_139_[i_134_] = (Class212.anIntArray2457[i_173_]);
                                        }
                                        i_134_++;
                                    }
                                }
                                if (i_107_ != 0 && ((Class130) class130).aBoolean1582)
                                    bool = true;
                            }
                            int i_186_ = var_s_97_.method3145(i_102_, i ^ 0x36, i_104_);
                            int i_187_ = var_s_97_.method3145(i_103_, i + 76, i_104_);
                            int i_188_ = var_s_97_.method3145(i_103_, 106, i_105_);
                            int i_189_ = var_s_97_.method3145(i_102_, 118, i_105_);
                            boolean bool_190_ = Class209.method1717(i + -10389, i_102_, i_104_);
                            if (bool_190_ && (i_96_ ^ 0xffffffff) < -2 || !bool_190_ && i_96_ > 0) {
                                boolean bool_191_ = true;
                                if (class130 == null || ((Class130) class130).aBoolean1576) {
                                    if ((i_110_ ^ 0xffffffff) == -1 && (i_107_ ^ 0xffffffff) != -1)
                                        bool_191_ = false;
                                    else if ((i_109_ ^ 0xffffffff) < -1 && class145_114_ != null && !(((Class145) class145_114_).aBoolean1710))
                                        bool_191_ = false;
                                } else
                                    bool_191_ = false;
                                if (bool_191_ && (i_186_ ^ 0xffffffff) == (i_187_ ^ 0xffffffff) && (i_186_ ^ 0xffffffff) == (i_188_ ^ 0xffffffff) && i_189_ == i_186_)
                                    ((Class310) this).aByteArrayArrayArray3582[i_96_][i_102_][i_104_] = (byte) (Class358.retrieveLooksSettings((((Class310) this).aByteArrayArrayArray3582[i_96_][i_102_][i_104_]), 4));
                            }
                            int i_192_ = 0;
                            int i_193_ = 0;
                            int i_194_ = 0;
                            if (((Class310) this).aBoolean3604) {
                                i_192_ = Class346_Sub10.method3722(i_102_, i_104_);
                                i_193_ = Node_Sub3.method2006(i_102_, i_104_);
                                i_194_ = Class342.method3490(i_102_, i_104_);
                            }
                            var_s_97_.U(i_102_, i_104_, is_137_, is_142_, is_138_, is_143_, is_139_, is_136_, is_140_, is_141_, i_192_, i_193_, i_194_, bool);
                            Node_Sub15_Sub5.method2502(i_96_, i_102_, i_104_);
                        }
                    }
                }
            }
        }
    }

    final void method3245(byte i, int i_195_, int i_196_, int i_197_, int i_198_) {
        int i_199_ = 0;
        if (i != -14)
            ((Class310) this).aBoolean3604 = false;
        for (/**/; i_199_ < ((Class310) this).anInt3608; i_199_++)
            method3240(-1, i_198_, i_196_, i_199_, i_197_, i_195_);
        anInt3609++;
    }

    static final void method3246(int i) {
        Class282_Sub25.aHa7855.xa((0.7F + 0.1F * (float) ((Node_Sub45) (Node_Sub14_Sub38.aClass248_Sub45_9584)).aClass282_Sub2_7338.method2927(true)) * Class376.aFloat4940);
        if (i < 105)
            method3241(46, true);
        anInt3587++;
        Class282_Sub25.aHa7855.ZA(Node_Sub13.anInt6973, Node_Sub46.aFloat7374, Class346_Sub7_Sub2_Sub1.aFloat10024, (float) (ha_Sub3.anInt6131 << 1106702818), (float) (Node_Sub11.anInt6956 << -1437854270), (float) (Class282_Sub28.anInt7895 << 1049816162));
        Class282_Sub25.aHa7855.a(Node_Sub8_Sub12.aClass316_9013);
    }

    final void method3247(int[][] is, int i, byte i_200_) {
        if (i_200_ > -103)
            aByteArrayArrayArray3589 = null;
        anInt3584++;
        int[][] is_201_ = ((Class310) this).anIntArrayArrayArray3592[i];
        for (int i_202_ = 0; ((i_202_ ^ 0xffffffff) > (1 + ((Class310) this).anInt3597 ^ 0xffffffff)); i_202_++) {
            for (int i_203_ = 0; ((i_203_ ^ 0xffffffff) > (((Class310) this).anInt3580 - -1 ^ 0xffffffff)); i_203_++)
                is_201_[i_202_][i_203_] += is[i_202_][i_203_];
        }
    }

    final void method3248(s var_s, byte i, ha var_ha, s var_s_204_) {
        anInt3579++;
        int[][] is = (new int[((Class310) this).anInt3597]
                [((Class310) this).anInt3580]);
        if (Class218.anIntArray2503 == null || ((Class310) this).anInt3580 != Class218.anIntArray2503.length) {
            Class218.anIntArray2503 = new int[((Class310) this).anInt3580];
            Node_Sub22.anIntArray7077 = new int[((Class310) this).anInt3580];
            Node_Sub8_Sub9.anIntArray8966 = new int[((Class310) this).anInt3580];
            Class13.anIntArray258 = new int[((Class310) this).anInt3580];
            Class328.anIntArray3840 = new int[((Class310) this).anInt3580];
        }
        for (int i_205_ = 0; i_205_ < ((Class310) this).anInt3608; i_205_++) {
            for (int i_206_ = 0; ((i_206_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)); i_206_++) {
                Class218.anIntArray2503[i_206_] = 0;
                Node_Sub8_Sub9.anIntArray8966[i_206_] = 0;
                Node_Sub22.anIntArray7077[i_206_] = 0;
                Class328.anIntArray3840[i_206_] = 0;
                Class13.anIntArray258[i_206_] = 0;
            }
            for (int i_207_ = -5; ((((Class310) this).anInt3597 ^ 0xffffffff) < (i_207_ ^ 0xffffffff)); i_207_++) {
                for (int i_208_ = 0; ((Class310) this).anInt3580 > i_208_; i_208_++) {
                    int i_209_ = 5 + i_207_;
                    if ((i_209_ ^ 0xffffffff) > (((Class310) this).anInt3597 ^ 0xffffffff)) {
                        int i_210_ = 0xff & (aByteArrayArrayArray3605[i_205_][i_209_][i_208_]);
                        if (i_210_ > 0) {
                            Class130 class130 = aClass192_3595.method1654(i_210_ - 1, false);
                            Class218.anIntArray2503[i_208_] += ((Class130) class130).anInt1579;
                            Node_Sub8_Sub9.anIntArray8966[i_208_] += ((Class130) class130).anInt1575;
                            Node_Sub22.anIntArray7077[i_208_] += ((Class130) class130).anInt1588;
                            Class328.anIntArray3840[i_208_] += ((Class130) class130).anInt1584;
                            Class13.anIntArray258[i_208_]++;
                        }
                    }
                    int i_211_ = i_207_ + -5;
                    if (i_211_ >= 0) {
                        int i_212_ = 0xff & (aByteArrayArrayArray3605[i_205_][i_211_][i_208_]);
                        if (i_212_ > 0) {
                            Class130 class130 = aClass192_3595.method1654(i_212_ + -1, false);
                            Class218.anIntArray2503[i_208_] -= ((Class130) class130).anInt1579;
                            Node_Sub8_Sub9.anIntArray8966[i_208_] -= ((Class130) class130).anInt1575;
                            Node_Sub22.anIntArray7077[i_208_] -= ((Class130) class130).anInt1588;
                            Class328.anIntArray3840[i_208_] -= ((Class130) class130).anInt1584;
                            Class13.anIntArray258[i_208_]--;
                        }
                    }
                }
                if ((i_207_ ^ 0xffffffff) <= -1) {
                    int i_213_ = 0;
                    int i_214_ = 0;
                    int i_215_ = 0;
                    int i_216_ = 0;
                    int i_217_ = 0;
                    for (int i_218_ = -5; i_218_ < ((Class310) this).anInt3580; i_218_++) {
                        int i_219_ = i_218_ + 5;
                        if (i_219_ < ((Class310) this).anInt3580) {
                            i_214_ += Node_Sub8_Sub9.anIntArray8966[i_219_];
                            i_213_ += Class218.anIntArray2503[i_219_];
                            i_217_ += Class13.anIntArray258[i_219_];
                            i_216_ += Class328.anIntArray3840[i_219_];
                            i_215_ += Node_Sub22.anIntArray7077[i_219_];
                        }
                        int i_220_ = i_218_ + -5;
                        if ((i_220_ ^ 0xffffffff) <= -1) {
                            i_217_ -= Class13.anIntArray258[i_220_];
                            i_213_ -= Class218.anIntArray2503[i_220_];
                            i_215_ -= Node_Sub22.anIntArray7077[i_220_];
                            i_214_ -= Node_Sub8_Sub9.anIntArray8966[i_220_];
                            i_216_ -= Class328.anIntArray3840[i_220_];
                        }
                        if (i_218_ >= 0 && i_216_ > 0 && (i_217_ ^ 0xffffffff) < -1)
                            is[i_207_][i_218_] = Class51.method401(i_215_ / i_217_, false, i_213_ * 256 / i_216_, i_214_ / i_217_);
                    }
                }
            }
            if (!Node_Sub45.aBoolean7341)
                method3250(i_205_ == 0 ? var_s : null, var_ha, (i_205_ ^ 0xffffffff) == -1 ? var_s_204_ : null, is, 1, Class177.aSArray2070[i_205_], i_205_);
            else
                method3244(2, (i_205_ ^ 0xffffffff) != -1 ? null : var_s, i_205_ != 0 ? null : var_s_204_, i_205_, var_ha, is, Class177.aSArray2070[i_205_]);
            aByteArrayArrayArray3605[i_205_] = null;
            aByteArrayArrayArray3594[i_205_] = null;
            aByteArrayArrayArray3589[i_205_] = null;
            aByteArrayArrayArray3603[i_205_] = null;
        }
        if (!((Class310) this).aBoolean3604) {
            if ((Class302.anInt3501 ^ 0xffffffff) != -1)
                Viewport.method1874();
            if (Class80.aBoolean1009)
                Class267.method2802();
        }
        if (i >= -6)
            anIntArray3601 = null;
        for (int i_221_ = 0; ((((Class310) this).anInt3608 ^ 0xffffffff) < (i_221_ ^ 0xffffffff)); i_221_++)
            Class177.aSArray2070[i_221_].YA();
    }

    private final void method3249(int i, int i_222_, int i_223_, int i_224_, ByteStream class248_sub9, int i_225_, int i_226_, int i_227_, boolean bool, int i_228_, boolean bool_229_) {
        anInt3593++;
        if ((i ^ 0xffffffff) != -2) {
            if (i != 2) {
                if (i == 3)
                    i_228_ = 1;
            } else {
                i_228_ = 1;
                i_222_ = 1;
            }
        } else
            i_222_ = 1;
        if (i_223_ < 0 || (((Class310) this).anInt3597 ^ 0xffffffff) >= (i_223_ ^ 0xffffffff) || (i_227_ ^ 0xffffffff) > -1 || ((Class310) this).anInt3580 <= i_227_) {
            for (; ; ) {
                int i_230_ = class248_sub9.readUnsignedByte((byte) 127);
                if ((i_230_ ^ 0xffffffff) == -1)
                    break;
                if ((i_230_ ^ 0xffffffff) == -2) {
                    class248_sub9.readUnsignedByte((byte) 106);
                    break;
                }
                if (i_230_ <= 49)
                    class248_sub9.readUnsignedByte((byte) -61);
            }
        } else {
            if (!((Class310) this).aBoolean3604 && !bool_229_)
                r.aByteArrayArrayArray9033[i_226_][i_223_][i_227_] = (byte) 0;
            for (; ; ) {
                int i_231_ = class248_sub9.readUnsignedByte((byte) -61);
                if ((i_231_ ^ 0xffffffff) == -1) {
                    if (!((Class310) this).aBoolean3604) {
                        if (i_226_ != 0)
                            ((Class310) this).anIntArrayArrayArray3592[i_226_][i_223_ + i_228_][i_227_ - -i_222_] = (((Class310) this).anIntArrayArrayArray3592[-1 + i_226_][i_223_ - -i_228_][i_227_ + i_222_]) + -960;
                        else
                            ((Class310) this).anIntArrayArrayArray3592[0][i_228_ + i_223_][i_222_ + i_227_] = (8 * -Class65.method503((byte) 96, i_225_ + 556238, 932731 + i_224_) << 2007772610);
                    } else
                        ((Class310) this).anIntArrayArrayArray3592[0][i_223_ + i_228_][i_227_ - -i_222_] = 0;
                    break;
                }
                if ((i_231_ ^ 0xffffffff) == -2) {
                    int i_232_ = class248_sub9.readUnsignedByte((byte) -92);
                    if (!((Class310) this).aBoolean3604) {
                        if ((i_232_ ^ 0xffffffff) == -2)
                            i_232_ = 0;
                        if (i_226_ != 0)
                            ((Class310) this).anIntArrayArrayArray3592[i_226_][i_228_ + i_223_][i_222_ + i_227_] = ((((Class310) this).anIntArrayArrayArray3592[i_226_ - 1][i_223_ - -i_228_][i_222_ + i_227_]) - (8 * i_232_ << -1735747134));
                        else
                            ((Class310) this).anIntArrayArrayArray3592[0][i_223_ - -i_228_][i_222_ + i_227_] = -i_232_ * 8 << -1235540894;
                    } else
                        ((Class310) this).anIntArrayArrayArray3592[0][i_228_ + i_223_][i_227_ + i_222_] = 8 * i_232_ << -1827593534;
                    break;
                }
                if (i_231_ <= 49) {
                    if (bool_229_)
                        class248_sub9.readUnsignedByte((byte) 103);
                    else {
                        aByteArrayArrayArray3594[i_226_][i_223_][i_227_] = class248_sub9.readByte(120);
                        aByteArrayArrayArray3589[i_226_][i_223_][i_227_] = (byte) ((i_231_ - 2) / 4);
                        aByteArrayArrayArray3603[i_226_][i_223_][i_227_] = (byte) Class112.method794(3, -2 + (i_231_ + i));
                    }
                } else if (i_231_ <= 81) {
                    if (!((Class310) this).aBoolean3604 && !bool_229_)
                        r.aByteArrayArrayArray9033[i_226_][i_223_][i_227_] = (byte) (-49 + i_231_);
                } else if (!bool_229_)
                    aByteArrayArrayArray3605[i_226_][i_223_][i_227_] = (byte) (-81 + i_231_);
            }
        }
        if (bool != true)
            method3251(-99, null, null, 35, null, null, null, 1, null, null, -46, 85, 87, 76);
    }

    private final void method3250(s var_s, ha var_ha, s var_s_233_, int[][] is, int i, s var_s_234_, int i_235_) {
        int i_236_ = 0;
        if (i != 1)
            aByteArrayArrayArray3594 = null;
        for (/**/; i_236_ < ((Class310) this).anInt3597; i_236_++) {
            for (int i_237_ = 0; ((i_237_ ^ 0xffffffff) > (((Class310) this).anInt3580 ^ 0xffffffff)); i_237_++) {
                if (client.anInt5245 == -1 || Class107.method752(i_236_, client.anInt5245, i_237_, 2, i_235_)) {
                    byte i_238_ = aByteArrayArrayArray3589[i_235_][i_236_][i_237_];
                    byte i_239_ = aByteArrayArrayArray3603[i_235_][i_236_][i_237_];
                    int i_240_ = (0xff & aByteArrayArrayArray3594[i_235_][i_236_][i_237_]);
                    int i_241_ = (aByteArrayArrayArray3605[i_235_][i_236_][i_237_] & 0xff);
                    Class145 class145 = ((i_240_ ^ 0xffffffff) != -1 ? aClass144_3599.method1299(-1 + i_240_, -14) : null);
                    Class130 class130 = (i_241_ != 0 ? aClass192_3595.method1654(i_241_ - 1, false) : null);
                    if ((i_238_ ^ 0xffffffff) == -1 && class145 == null)
                        i_238_ = (byte) 12;
                    Class145 class145_242_ = class145;
                    if (class145 != null && (((Class145) class145).anInt1720 ^ 0xffffffff) == 0 && ((((Class145) class145).anInt1712 ^ 0xffffffff) == 0)) {
                        class145_242_ = class145;
                        class145 = null;
                    }
                    if (class145 != null || class130 != null) {
                        int i_243_ = Class140.anIntArray1663[i_238_];
                        int i_244_ = Class343.anIntArray4059[i_238_];
                        int i_245_ = ((class130 == null ? 0 : i_243_) + (class145 != null ? i_244_ : 0));
                        int i_246_ = 0;
                        int i_247_ = 0;
                        int i_248_ = (class145 != null ? ((Class145) class145).anInt1714 : -1);
                        int i_249_ = (class130 == null ? -1 : ((Class130) class130).anInt1572);
                        int[] is_250_ = new int[i_245_];
                        int[] is_251_ = new int[i_245_];
                        int[] is_252_ = new int[i_245_];
                        int[] is_253_ = new int[i_245_];
                        int[] is_254_ = new int[i_245_];
                        int[] is_255_ = new int[i_245_];
                        int[] is_256_ = ((class145 != null && (((Class145) class145).anInt1712 ^ 0xffffffff) != 0) ? new int[i_245_] : null);
                        if (class145 == null)
                            i_247_ += i_244_;
                        else {
                            for (int i_257_ = 0; (i_244_ ^ 0xffffffff) < (i_257_ ^ 0xffffffff); i_257_++) {
                                is_250_[i_246_] = (Class19.anIntArrayArray306[i_238_][i_247_]);
                                is_251_[i_246_] = (Class40.anIntArrayArray442[i_238_][i_247_]);
                                is_252_[i_246_] = (Node_Sub14_Sub4.anIntArrayArray9188[i_238_][i_247_]);
                                is_254_[i_246_] = i_248_;
                                is_255_[i_246_] = ((Class145) class145).anInt1715;
                                is_253_[i_246_] = ((Class145) class145).anInt1720;
                                if (is_256_ != null)
                                    is_256_[i_246_] = ((Class145) class145).anInt1712;
                                i_247_++;
                                i_246_++;
                            }
                            if (!((Class310) this).aBoolean3604 && i_235_ == 0)
                                Class271.method2831(i_236_, i_237_, ((Class145) class145).anInt1713, 8 * ((Class145) class145).anInt1705, ((Class145) class145).anInt1711);
                        }
                        if (class130 != null) {
                            for (int i_258_ = 0; i_243_ > i_258_; i_258_++) {
                                is_250_[i_246_] = (Class19.anIntArrayArray306[i_238_][i_247_]);
                                is_251_[i_246_] = (Class40.anIntArrayArray442[i_238_][i_247_]);
                                is_252_[i_246_] = (Node_Sub14_Sub4.anIntArrayArray9188[i_238_][i_247_]);
                                is_254_[i_246_] = i_249_;
                                is_255_[i_246_] = ((Class130) class130).anInt1586;
                                is_253_[i_246_] = is[i_236_][i_237_];
                                if (is_256_ != null)
                                    is_256_[i_246_] = is_253_[i_246_];
                                i_247_++;
                                i_246_++;
                            }
                        }
                        int i_259_ = anIntArray3601.length;
                        int[] is_260_ = new int[i_259_];
                        int[] is_261_ = new int[i_259_];
                        int[] is_262_ = var_s == null ? null : new int[i_259_];
                        int[] is_263_ = (var_s == null && var_s_233_ == null ? null : new int[i_259_]);
                        for (int i_264_ = 0; i_264_ < i_259_; i_264_++) {
                            int i_265_ = anIntArray3601[i_264_];
                            int i_266_ = anIntArray3591[i_264_];
                            if (i_239_ != 0) {
                                if (i_239_ == 1) {
                                    int i_267_ = i_265_;
                                    is_260_[i_264_] = i_266_;
                                    is_261_[i_264_] = 512 + -i_267_;
                                } else if (i_239_ != 2) {
                                    if ((i_239_ ^ 0xffffffff) == -4) {
                                        is_260_[i_264_] = 512 + -i_266_;
                                        int i_268_ = i_265_;
                                        is_261_[i_264_] = i_268_;
                                    }
                                } else {
                                    is_260_[i_264_] = -i_265_ + 512;
                                    is_261_[i_264_] = 512 + -i_266_;
                                }
                            } else {
                                is_260_[i_264_] = i_265_;
                                is_261_[i_264_] = i_266_;
                            }
                            if (is_262_ != null && (Class262.aBooleanArrayArray2980[i_238_][i_264_])) {
                                int i_269_ = ((i_236_ << -1364265431) - -is_260_[i_264_]);
                                int i_270_ = (i_237_ << 680982697) + is_261_[i_264_];
                                is_262_[i_264_] = (var_s.method3150((byte) 110, i_269_, i_270_) + -var_s_234_.method3150((byte) 98, i_269_, i_270_));
                            }
                            if (is_263_ != null) {
                                if (var_s != null && !(Class262.aBooleanArrayArray2980[i_238_][i_264_])) {
                                    int i_271_ = ((i_236_ << -1332739031) + is_260_[i_264_]);
                                    int i_272_ = ((i_237_ << -1206368983) + is_261_[i_264_]);
                                    is_263_[i_264_] = (var_s_234_.method3150((byte) 121, i_271_, i_272_) + -var_s.method3150((byte) 107, i_271_, i_272_));
                                } else if (var_s_233_ != null && !(Class84_Sub7.aBooleanArrayArray5471[i_238_][i_264_])) {
                                    int i_273_ = (is_260_[i_264_] + (i_236_ << 1534094601));
                                    int i_274_ = ((i_237_ << 2048671721) - -is_261_[i_264_]);
                                    is_263_[i_264_] = (var_s_233_.method3150((byte) 108, i_273_, i_274_) - var_s_234_.method3150((byte) 117, i_273_, i_274_));
                                }
                            }
                        }
                        int i_275_ = var_s_234_.method3145(i_236_, i + 39, i_237_);
                        int i_276_ = var_s_234_.method3145(1 + i_236_, 66, i_237_);
                        int i_277_ = var_s_234_.method3145(1 + i_236_, i ^ 0x7c, 1 + i_237_);
                        int i_278_ = var_s_234_.method3145(i_236_, 89, i_237_ - -1);
                        boolean bool = Class209.method1717(-10387, i_236_, i_237_);
                        if (bool && i_235_ > 1 || !bool && (i_235_ ^ 0xffffffff) < -1) {
                            boolean bool_279_ = true;
                            if (class130 != null && !((Class130) class130).aBoolean1576)
                                bool_279_ = false;
                            else if (i_241_ == 0 && i_238_ != 0)
                                bool_279_ = false;
                            else if (i_240_ > 0 && class145_242_ != null && !(((Class145) class145_242_).aBoolean1710))
                                bool_279_ = false;
                            if (bool_279_ && i_276_ == i_275_ && (i_275_ ^ 0xffffffff) == (i_277_ ^ 0xffffffff) && (i_278_ ^ 0xffffffff) == (i_275_ ^ 0xffffffff))
                                ((Class310) this).aByteArrayArrayArray3582[i_235_][i_236_][i_237_] = (byte) (Class358.retrieveLooksSettings((((Class310) this).aByteArrayArrayArray3582[i_235_][i_236_][i_237_]), 4));
                        }
                        int i_280_ = 0;
                        int i_281_ = 0;
                        int i_282_ = 0;
                        if (((Class310) this).aBoolean3604) {
                            i_280_ = Class346_Sub10.method3722(i_236_, i_237_);
                            i_281_ = Node_Sub3.method2006(i_236_, i_237_);
                            i_282_ = Class342.method3490(i_236_, i_237_);
                        }
                        var_s_234_.method3140(i_236_, i_237_, is_260_, is_262_, is_261_, is_263_, is_250_, is_251_, is_252_, is_253_, is_256_, is_254_, is_255_, i_280_, i_281_, i_282_, false);
                        Node_Sub15_Sub5.method2502(i_235_, i_236_, i_237_);
                    }
                }
            }
        }
        anInt3583++;
    }

    private final void method3251(int i, boolean[] bools, byte[][] is, int i_283_, Class130 class130, Class145 class145, byte[][] is_284_, int i_285_, byte[][] is_286_, ha var_ha, int i_287_, int i_288_, int i_289_, int i_290_) {
        anInt3588++;
        boolean[] bools_291_ = (class145 != null && ((Class145) class145).aBoolean1723 ? Class22.aBooleanArrayArray321[i_287_] : Class6.aBooleanArrayArray153[i_287_]);
        if ((i ^ 0xffffffff) < -1) {
            if ((i_283_ ^ 0xffffffff) < -1) {
                int i_292_ = is_284_[i_283_ + -1][i + -1] & 0xff;
                if ((i_292_ ^ 0xffffffff) < -1) {
                    Class145 class145_293_ = aClass144_3599.method1299(-1 + i_292_, -62);
                    if (((Class145) class145_293_).anInt1720 != -1 && ((Class145) class145_293_).aBoolean1723) {
                        byte i_294_ = is[-1 + i_283_][i + -1];
                        int i_295_ = is_286_[i_283_ + -1][-1 + i] * 2 + 4 & 0x7;
                        int i_296_ = Class124.method1143(true, class145_293_, var_ha);
                        if (Class262.aBooleanArrayArray2980[i_294_][i_295_]) {
                            Class212.anIntArray2457[0] = ((Class145) class145_293_).anInt1720;
                            Class346_Sub7_Sub1.anIntArray9903[0] = i_296_;
                            Class146.anIntArray1730[0] = ((Class145) class145_293_).anInt1714;
                            Node_Sub23.anIntArray7095[0] = ((Class145) class145_293_).anInt1715;
                            r_Sub1.anIntArray10269[0] = ((Class145) class145_293_).anInt1709;
                            Node_Sub8.anIntArray6860[0] = 256;
                        }
                    }
                }
            }
            if ((-1 + i_289_ ^ 0xffffffff) < (i_283_ ^ 0xffffffff)) {
                int i_297_ = 0xff & is_284_[1 + i_283_][i - 1];
                if ((i_297_ ^ 0xffffffff) < -1) {
                    Class145 class145_298_ = aClass144_3599.method1299(i_297_ - 1, -60);
                    if (((((Class145) class145_298_).anInt1720 ^ 0xffffffff) != 0) && ((Class145) class145_298_).aBoolean1723) {
                        byte i_299_ = is[1 + i_283_][i - 1];
                        int i_300_ = 0x7 & is_286_[i_283_ - -1][-1 + i] * 2 + 6;
                        int i_301_ = Class124.method1143(true, class145_298_, var_ha);
                        if (Class262.aBooleanArrayArray2980[i_299_][i_300_]) {
                            Class212.anIntArray2457[2] = ((Class145) class145_298_).anInt1720;
                            Class346_Sub7_Sub1.anIntArray9903[2] = i_301_;
                            Class146.anIntArray1730[2] = ((Class145) class145_298_).anInt1714;
                            Node_Sub23.anIntArray7095[2] = ((Class145) class145_298_).anInt1715;
                            r_Sub1.anIntArray10269[2] = ((Class145) class145_298_).anInt1709;
                            Node_Sub8.anIntArray6860[2] = 512;
                        }
                    }
                }
            }
        }
        if ((i ^ 0xffffffff) > (i_285_ - 1 ^ 0xffffffff)) {
            if ((i_283_ ^ 0xffffffff) < -1) {
                int i_302_ = is_284_[i_283_ + -1][1 + i] & 0xff;
                if (i_302_ > 0) {
                    Class145 class145_303_ = aClass144_3599.method1299(-1 + i_302_, -50);
                    if (((Class145) class145_303_).anInt1720 != -1 && ((Class145) class145_303_).aBoolean1723) {
                        byte i_304_ = is[-1 + i_283_][1 + i];
                        int i_305_ = 2 * is_286_[-1 + i_283_][1 + i] + 2 & 0x7;
                        int i_306_ = Class124.method1143(true, class145_303_, var_ha);
                        if (Class262.aBooleanArrayArray2980[i_304_][i_305_]) {
                            Class212.anIntArray2457[6] = ((Class145) class145_303_).anInt1720;
                            Class346_Sub7_Sub1.anIntArray9903[6] = i_306_;
                            Class146.anIntArray1730[6] = ((Class145) class145_303_).anInt1714;
                            Node_Sub23.anIntArray7095[6] = ((Class145) class145_303_).anInt1715;
                            r_Sub1.anIntArray10269[6] = ((Class145) class145_303_).anInt1709;
                            Node_Sub8.anIntArray6860[6] = 64;
                        }
                    }
                }
            }
            if (-1 + i_289_ > i_283_) {
                int i_307_ = is_284_[1 + i_283_][i - -1] & 0xff;
                if ((i_307_ ^ 0xffffffff) < -1) {
                    Class145 class145_308_ = aClass144_3599.method1299(-1 + i_307_, -9);
                    if (((((Class145) class145_308_).anInt1720 ^ 0xffffffff) != 0) && ((Class145) class145_308_).aBoolean1723) {
                        byte i_309_ = is[1 + i_283_][i + 1];
                        int i_310_ = 0x7 & is_286_[i_283_ - -1][i - -1] * 2;
                        int i_311_ = Class124.method1143(true, class145_308_, var_ha);
                        if (Class262.aBooleanArrayArray2980[i_309_][i_310_]) {
                            Class212.anIntArray2457[4] = ((Class145) class145_308_).anInt1720;
                            Class346_Sub7_Sub1.anIntArray9903[4] = i_311_;
                            Class146.anIntArray1730[4] = ((Class145) class145_308_).anInt1714;
                            Node_Sub23.anIntArray7095[4] = ((Class145) class145_308_).anInt1715;
                            r_Sub1.anIntArray10269[4] = ((Class145) class145_308_).anInt1709;
                            Node_Sub8.anIntArray6860[4] = 128;
                        }
                    }
                }
            }
        }
        if ((i ^ 0xffffffff) < -1) {
            int i_312_ = is_284_[i_283_][-1 + i] & 0xff;
            if (i_312_ > 0) {
                Class145 class145_313_ = aClass144_3599.method1299(i_312_ + -1, -20);
                if (((Class145) class145_313_).anInt1720 != -1) {
                    byte i_314_ = is[i_283_][-1 + i];
                    int i_315_ = is_286_[i_283_][-1 + i];
                    if (((Class145) class145_313_).aBoolean1723) {
                        int i_316_ = 2;
                        int i_317_ = 4 - -(i_315_ * 2);
                        int i_318_ = Class124.method1143(true, class145_313_, var_ha);
                        for (int i_319_ = 0; i_319_ < 3; i_319_++) {
                            i_316_ = 0x7 & i_316_;
                            i_317_ = 0x7 & i_317_;
                            if (Class262.aBooleanArrayArray2980[i_314_][i_317_] && ((r_Sub1.anIntArray10269[i_316_] ^ 0xffffffff) >= (((Class145) class145_313_).anInt1709 ^ 0xffffffff))) {
                                Class212.anIntArray2457[i_316_] = ((Class145) class145_313_).anInt1720;
                                Class346_Sub7_Sub1.anIntArray9903[i_316_] = i_318_;
                                Class146.anIntArray1730[i_316_] = ((Class145) class145_313_).anInt1714;
                                Node_Sub23.anIntArray7095[i_316_] = ((Class145) class145_313_).anInt1715;
                                if ((r_Sub1.anIntArray10269[i_316_] ^ 0xffffffff) == (((Class145) class145_313_).anInt1709 ^ 0xffffffff))
                                    Node_Sub8.anIntArray6860[i_316_] = Class358.retrieveLooksSettings((Node_Sub8.anIntArray6860[i_316_]), 32);
                                else
                                    Node_Sub8.anIntArray6860[i_316_] = 32;
                                r_Sub1.anIntArray10269[i_316_] = ((Class145) class145_313_).anInt1709;
                            }
                            i_316_--;
                            i_317_++;
                        }
                        if (!bools_291_[0x3 & i_290_])
                            bools[0] = (Class22.aBooleanArrayArray321[i_314_][Class112.method794(3, i_315_ + 2)]);
                    } else if (!bools_291_[0x3 & i_290_])
                        bools[0] = (Class6.aBooleanArrayArray153[i_314_][Class112.method794(3, 2 + i_315_)]);
                }
            }
        }
        if ((i_285_ + -1 ^ 0xffffffff) < (i ^ 0xffffffff)) {
            int i_320_ = 0xff & is_284_[i_283_][i + 1];
            if ((i_320_ ^ 0xffffffff) < -1) {
                Class145 class145_321_ = aClass144_3599.method1299(i_320_ + -1, -112);
                if (((Class145) class145_321_).anInt1720 != -1) {
                    byte i_322_ = is[i_283_][1 + i];
                    int i_323_ = is_286_[i_283_][1 + i];
                    if (!((Class145) class145_321_).aBoolean1723) {
                        if (!bools_291_[i_290_ + 2 & 0x3])
                            bools[2] = (Class6.aBooleanArrayArray153[i_322_][Class112.method794(3, i_323_)]);
                    } else {
                        int i_324_ = 4;
                        int i_325_ = 2 - -(2 * i_323_);
                        int i_326_ = Class124.method1143(true, class145_321_, var_ha);
                        for (int i_327_ = 0; i_327_ < 3; i_327_++) {
                            i_325_ = 0x7 & i_325_;
                            i_324_ &= 0x7;
                            if (Class262.aBooleanArrayArray2980[i_322_][i_325_] && ((r_Sub1.anIntArray10269[i_324_] ^ 0xffffffff) >= (((Class145) class145_321_).anInt1709 ^ 0xffffffff))) {
                                Class212.anIntArray2457[i_324_] = ((Class145) class145_321_).anInt1720;
                                Class346_Sub7_Sub1.anIntArray9903[i_324_] = i_326_;
                                Class146.anIntArray1730[i_324_] = ((Class145) class145_321_).anInt1714;
                                Node_Sub23.anIntArray7095[i_324_] = ((Class145) class145_321_).anInt1715;
                                if ((((Class145) class145_321_).anInt1709 ^ 0xffffffff) != (r_Sub1.anIntArray10269[i_324_] ^ 0xffffffff))
                                    Node_Sub8.anIntArray6860[i_324_] = 16;
                                else
                                    Node_Sub8.anIntArray6860[i_324_] = Class358.retrieveLooksSettings((Node_Sub8.anIntArray6860[i_324_]), 16);
                                r_Sub1.anIntArray10269[i_324_] = ((Class145) class145_321_).anInt1709;
                            }
                            i_325_--;
                            i_324_++;
                        }
                        if (!bools_291_[2 + i_290_ & 0x3])
                            bools[2] = (Class22.aBooleanArrayArray321[i_322_][Class112.method794(3, i_323_)]);
                    }
                }
            }
        }
        if (i_283_ > 0) {
            int i_328_ = 0xff & is_284_[-1 + i_283_][i];
            if ((i_328_ ^ 0xffffffff) < -1) {
                Class145 class145_329_ = aClass144_3599.method1299(-1 + i_328_, -64);
                if (((Class145) class145_329_).anInt1720 != -1) {
                    byte i_330_ = is[-1 + i_283_][i];
                    int i_331_ = is_286_[i_283_ - 1][i];
                    if (((Class145) class145_329_).aBoolean1723) {
                        int i_332_ = 6;
                        int i_333_ = 4 - -(i_331_ * 2);
                        int i_334_ = Class124.method1143(true, class145_329_, var_ha);
                        for (int i_335_ = 0; (i_335_ ^ 0xffffffff) > -4; i_335_++) {
                            i_333_ &= 0x7;
                            i_332_ = 0x7 & i_332_;
                            if (Class262.aBooleanArrayArray2980[i_330_][i_333_] && ((r_Sub1.anIntArray10269[i_332_] ^ 0xffffffff) >= (((Class145) class145_329_).anInt1709 ^ 0xffffffff))) {
                                Class212.anIntArray2457[i_332_] = ((Class145) class145_329_).anInt1720;
                                Class346_Sub7_Sub1.anIntArray9903[i_332_] = i_334_;
                                Class146.anIntArray1730[i_332_] = ((Class145) class145_329_).anInt1714;
                                Node_Sub23.anIntArray7095[i_332_] = ((Class145) class145_329_).anInt1715;
                                if ((r_Sub1.anIntArray10269[i_332_] ^ 0xffffffff) == (((Class145) class145_329_).anInt1709 ^ 0xffffffff))
                                    Node_Sub8.anIntArray6860[i_332_] = Class358.retrieveLooksSettings((Node_Sub8.anIntArray6860[i_332_]), 8);
                                else
                                    Node_Sub8.anIntArray6860[i_332_] = 8;
                                r_Sub1.anIntArray10269[i_332_] = ((Class145) class145_329_).anInt1709;
                            }
                            i_333_--;
                            i_332_++;
                        }
                        if (!bools_291_[0x3 & 3 - -i_290_])
                            bools[3] = (Class22.aBooleanArrayArray321[i_330_][Class112.method794(i_331_ + 1, 3)]);
                    } else if (!bools_291_[i_290_ + 3 & 0x3])
                        bools[3] = (Class6.aBooleanArrayArray153[i_330_][Class112.method794(3, 1 + i_331_)]);
                }
            }
        }
        if ((-1 + i_289_ ^ 0xffffffff) < (i_283_ ^ 0xffffffff)) {
            int i_336_ = is_284_[1 + i_283_][i] & 0xff;
            if (i_336_ > 0) {
                Class145 class145_337_ = aClass144_3599.method1299(i_336_ - 1, -92);
                if (((Class145) class145_337_).anInt1720 != -1) {
                    byte i_338_ = is[1 + i_283_][i];
                    int i_339_ = is_286_[i_283_ + 1][i];
                    if (((Class145) class145_337_).aBoolean1723) {
                        int i_340_ = 4;
                        int i_341_ = 6 - -(2 * i_339_);
                        int i_342_ = Class124.method1143(true, class145_337_, var_ha);
                        for (int i_343_ = 0; (i_343_ ^ 0xffffffff) > -4; i_343_++) {
                            i_340_ &= 0x7;
                            i_341_ &= 0x7;
                            if (Class262.aBooleanArrayArray2980[i_338_][i_341_] && ((r_Sub1.anIntArray10269[i_340_] ^ 0xffffffff) >= (((Class145) class145_337_).anInt1709 ^ 0xffffffff))) {
                                Class212.anIntArray2457[i_340_] = ((Class145) class145_337_).anInt1720;
                                Class346_Sub7_Sub1.anIntArray9903[i_340_] = i_342_;
                                Class146.anIntArray1730[i_340_] = ((Class145) class145_337_).anInt1714;
                                Node_Sub23.anIntArray7095[i_340_] = ((Class145) class145_337_).anInt1715;
                                if (((Class145) class145_337_).anInt1709 != r_Sub1.anIntArray10269[i_340_])
                                    Node_Sub8.anIntArray6860[i_340_] = 4;
                                else
                                    Node_Sub8.anIntArray6860[i_340_] = Class358.retrieveLooksSettings((Node_Sub8.anIntArray6860[i_340_]), 4);
                                r_Sub1.anIntArray10269[i_340_] = ((Class145) class145_337_).anInt1709;
                            }
                            i_341_++;
                            i_340_--;
                        }
                        if (!bools_291_[1 + i_290_ & 0x3])
                            bools[1] = (Class22.aBooleanArrayArray321[i_338_][Class112.method794(3, 3 - -i_339_)]);
                    } else if (!bools_291_[i_290_ + 1 & 0x3])
                        bools[1] = (Class6.aBooleanArrayArray153[i_338_][Class112.method794(3, i_339_ + 3)]);
                }
            }
        }
        if (i_288_ >= 46) {
            if (class145 != null) {
                int i_344_ = Class124.method1143(true, class145, var_ha);
                if (((Class145) class145).aBoolean1723) {
                    for (int i_345_ = 0; (i_345_ ^ 0xffffffff) > -9; i_345_++) {
                        int i_346_ = -(i_290_ * 2) + i_345_ & 0x7;
                        if (Class262.aBooleanArrayArray2980[i_287_][i_345_] && ((r_Sub1.anIntArray10269[i_346_] ^ 0xffffffff) >= (((Class145) class145).anInt1709 ^ 0xffffffff))) {
                            Class212.anIntArray2457[i_346_] = ((Class145) class145).anInt1720;
                            Class346_Sub7_Sub1.anIntArray9903[i_346_] = i_344_;
                            Class146.anIntArray1730[i_346_] = ((Class145) class145).anInt1714;
                            Node_Sub23.anIntArray7095[i_346_] = ((Class145) class145).anInt1715;
                            if (r_Sub1.anIntArray10269[i_346_] == ((Class145) class145).anInt1709)
                                Node_Sub8.anIntArray6860[i_346_] = Class358.retrieveLooksSettings((Node_Sub8.anIntArray6860[i_346_]), 2);
                            else
                                Node_Sub8.anIntArray6860[i_346_] = 2;
                            r_Sub1.anIntArray10269[i_346_] = ((Class145) class145).anInt1709;
                        }
                    }
                }
            }
        }
    }

    Class310(int i, int i_347_, int i_348_, boolean bool, Class144 class144, Class192 class192) {
        ((Class310) this).aBoolean3604 = bool;
        aClass144_3599 = class144;
        ((Class310) this).anInt3597 = i_347_;
        ((Class310) this).anInt3580 = i_348_;
        ((Class310) this).anInt3608 = i;
        aClass192_3595 = class192;
        aByteArrayArrayArray3603 = (new byte[((Class310) this).anInt3608]
                [((Class310) this).anInt3597][((Class310) this).anInt3580]);
        ((Class310) this).aByteArrayArrayArray3582 = (new byte[((Class310) this).anInt3608]
                [((Class310) this).anInt3597 - -1]
                [((Class310) this).anInt3580 + 1]);
        ((Class310) this).anIntArrayArrayArray3592 = (new int[((Class310) this).anInt3608]
                [((Class310) this).anInt3597 - -1]
                [((Class310) this).anInt3580 - -1]);
        aByteArrayArrayArray3594 = (new byte[((Class310) this).anInt3608]
                [((Class310) this).anInt3597][((Class310) this).anInt3580]);
        aByteArrayArrayArray3589 = (new byte[((Class310) this).anInt3608]
                [((Class310) this).anInt3597][((Class310) this).anInt3580]);
        aByteArrayArrayArray3605 = (new byte[((Class310) this).anInt3608]
                [((Class310) this).anInt3597][((Class310) this).anInt3580]);
    }
}
