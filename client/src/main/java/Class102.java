/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class102 {
    static int anInt1293;
    static int anInt1294;
    static int anInt1295;
    static IncommingOpcode aIncommingOpcode_1296 = new IncommingOpcode(102, -2);
    static int anInt1297;
    private Class278 aClass278_1298 = new Class278(16);
    private Class381 aClass381_1299;
    static int anInt1300;
    static int anInt1301;
    static int anInt1302;
    static int anInt1303;
    static float aFloat1304;
    static int anInt1305;
    static IncommingOpcode aIncommingOpcode_1306 = new IncommingOpcode(106, 8);
    static int anInt1307;
    static Class293 aClass293_1308;
    static Class380 aClass380_1309;
    static Class243 aClass243_1310;

    public static void method720(int i) {
        aClass293_1308 = null;
        aClass380_1309 = null;
        aIncommingOpcode_1306 = null;
        aIncommingOpcode_1296 = null;
        aClass243_1310 = null;
        if (i != 2)
            method727(-20, 115, null, 116);
    }

    final void method721(int i, boolean bool) {
        if (bool != true)
            method726(false);
        anInt1295++;
        synchronized (aClass278_1298) {
            aClass278_1298.method2864(i, -15782);
        }
    }

    static final int method722(boolean bool) {
        anInt1297++;
        if (Node_Sub15_Sub4.anInt9694 == 1)
            return Node_Sub38.anInt7269;
        if (bool != false)
            return 124;
        return Class325.anInt3828;
    }

    static final void method723(int i, int i_0_, PacketStream class248_sub9_sub2) {
        anInt1301++;
        boolean bool = class248_sub9_sub2.readBits(2059, 1) == 1;
        if (bool)
            Class269_Sub2.anIntArray7548[Class228.anInt2578++] = i;
        int i_1_ = class248_sub9_sub2.readBits(2059, 2);
        Player player = Node_Sub32.aPlayerArray7197[i];
        if (i_1_ == 0) {
            if (bool)
                ((Player) player).aBoolean10576 = false;
            else {
                if (Class282_Sub29.anInt7896 == i)
                    throw new RuntimeException("s:lr");
                Class107 class107 = (Node_Sub8_Sub16.aClass107Array9053[i] = new Class107());
                ((Class107) class107).anInt1351 = (((((Entity) player).posQueueY[0] + Class368.baseY) >> 575842438) + ((((Interactable) player).plane) << 1917546876) + ((((Entity) player).posQueueX[0] + Class67.baseX) >> 418283814 << 229112782));
                if (((Player) player).anInt10536 == -1)
                    ((Class107) class107).anInt1356 = ((Entity) player).aClass109_10471.method759((byte) -70);
                else
                    ((Class107) class107).anInt1356 = ((Player) player).anInt10536;
                ((Class107) class107).aBoolean1352 = ((Player) player).aBoolean10565;
                ((Class107) class107).anInt1354 = (((Entity) player).faceEntity);
                if (((Player) player).anInt10553 > 0)
                    Class150.method1345(i_0_ + 1073744557, player);
                Node_Sub32.aPlayerArray7197[i] = null;
                if (class248_sub9_sub2.readBits(2059, 1) != 0)
                    Node_Sub8_Sub13_Sub1.method2102(2, i, class248_sub9_sub2);
            }
        } else if (i_1_ == 1) {
            int i_2_ = class248_sub9_sub2.readBits(2059, 3);
            int i_3_ = (((Entity) player).posQueueX[0]);
            int i_4_ = (((Entity) player).posQueueY[0]);
            if (i_2_ == 0) {
                i_3_--;
                i_4_--;
            } else if ((i_2_ ^ 0xffffffff) == -2)
                i_4_--;
            else if ((i_2_ ^ 0xffffffff) != -3) {
                if ((i_2_ ^ 0xffffffff) == -4)
                    i_3_--;
                else if ((i_2_ ^ 0xffffffff) == -5)
                    i_3_++;
                else if ((i_2_ ^ 0xffffffff) == -6) {
                    i_3_--;
                    i_4_++;
                } else if (i_2_ == 6)
                    i_4_++;
                else if ((i_2_ ^ 0xffffffff) == -8) {
                    i_4_++;
                    i_3_++;
                }
            } else {
                i_4_--;
                i_3_++;
            }
            if (!bool)
                player.method3654(Class302.aByteArray3504[i], 0, i_4_, i_3_);
            else {
                ((Player) player).anInt10559 = i_3_;
                ((Player) player).aBoolean10576 = true;
                ((Player) player).anInt10581 = i_4_;
            }
        } else if (i_1_ == 2) {
            int i_5_ = class248_sub9_sub2.readBits(2059, 4);
            int i_6_ = (((Entity) player).posQueueX[0]);
            int i_7_ = (((Entity) player).posQueueY[0]);
            if (i_5_ == 0) {
                i_7_ -= 2;
                i_6_ -= 2;
            } else if ((i_5_ ^ 0xffffffff) == -2) {
                i_7_ -= 2;
                i_6_--;
            } else if (i_5_ == 2)
                i_7_ -= 2;
            else if ((i_5_ ^ 0xffffffff) == -4) {
                i_7_ -= 2;
                i_6_++;
            } else if (i_5_ == 4) {
                i_6_ += 2;
                i_7_ -= 2;
            } else if ((i_5_ ^ 0xffffffff) == -6) {
                i_6_ -= 2;
                i_7_--;
            } else if (i_5_ != 6) {
                if ((i_5_ ^ 0xffffffff) != -8) {
                    if ((i_5_ ^ 0xffffffff) != -9) {
                        if ((i_5_ ^ 0xffffffff) == -10) {
                            i_6_ -= 2;
                            i_7_++;
                        } else if ((i_5_ ^ 0xffffffff) != -11) {
                            if (i_5_ != 11) {
                                if (i_5_ == 12) {
                                    i_7_ += 2;
                                    i_6_--;
                                } else if ((i_5_ ^ 0xffffffff) != -14) {
                                    if (i_5_ != 14) {
                                        if (i_5_ == 15) {
                                            i_6_ += 2;
                                            i_7_ += 2;
                                        }
                                    } else {
                                        i_6_++;
                                        i_7_ += 2;
                                    }
                                } else
                                    i_7_ += 2;
                            } else {
                                i_7_ += 2;
                                i_6_ -= 2;
                            }
                        } else {
                            i_6_ += 2;
                            i_7_++;
                        }
                    } else
                        i_6_ += 2;
                } else
                    i_6_ -= 2;
            } else {
                i_7_--;
                i_6_ += 2;
            }
            if (bool) {
                ((Player) player).aBoolean10576 = true;
                ((Player) player).anInt10581 = i_7_;
                ((Player) player).anInt10559 = i_6_;
            } else
                player.method3654(Class302.aByteArray3504[i], 0, i_7_, i_6_);
        } else {
            int i_8_ = class248_sub9_sub2.readBits(2059, 1);
            if ((i_8_ ^ 0xffffffff) == -1) {
                int i_9_ = class248_sub9_sub2.readBits(2059, 12);
                int i_10_ = i_9_ >> 122684234;
                int i_11_ = (0x3e8 & i_9_) >> 1177146981;
                if ((i_11_ ^ 0xffffffff) < -16)
                    i_11_ -= 32;
                int i_12_ = i_9_ & 0x1f;
                if (i_12_ > 15)
                    i_12_ -= 32;
                int i_13_ = i_11_ + (((Entity) player).posQueueX[0]);
                int i_14_ = (((Entity) player).posQueueY[0]) + i_12_;
                if (bool) {
                    ((Player) player).anInt10581 = i_14_;
                    ((Player) player).aBoolean10576 = true;
                    ((Player) player).anInt10559 = i_13_;
                } else
                    player.method3654((Class302.aByteArray3504[i]), 0, i_14_, i_13_);
                ((Interactable) player).plane = ((Interactable) player).aByte8322 = (byte) (0x3 & (((Interactable) player).plane) + i_10_);
                if (Class209.method1717(-10387, i_13_, i_14_))
                    ((Interactable) player).aByte8322++;
                if (i == Class282_Sub29.anInt7896) {
                    if (((((Interactable) player).plane) ^ 0xffffffff) != (Class177.anInt2074 ^ 0xffffffff))
                        Node_Sub30.aBoolean7192 = true;
                    Class177.anInt2074 = (((Interactable) player).plane);
                }
            } else {
                int i_15_ = class248_sub9_sub2.readBits(2059, 30);
                int i_16_ = i_15_ >> -1742136324;
                int i_17_ = (0xffff3e2 & i_15_) >> 2033934862;
                int i_18_ = i_15_ & 0x3fff;
                int i_19_ = (-Class67.baseX + (0x3fff & ((((Entity) player).posQueueX[0]) + (Class67.baseX - -i_17_))));
                int i_20_ = (-Class368.baseY + (i_18_ + (Class368.baseY + (((Entity) player).posQueueY[0])) & 0x3fff));
                if (!bool)
                    player.method3654((Class302.aByteArray3504[i]), 0, i_20_, i_19_);
                else {
                    ((Player) player).aBoolean10576 = true;
                    ((Player) player).anInt10559 = i_19_;
                    ((Player) player).anInt10581 = i_20_;
                }
                ((Interactable) player).plane = ((Interactable) player).aByte8322 = (byte) (i_16_ + ((Interactable) player).plane & 0x3);
                if (i_0_ != -2734)
                    method720(3);
                if (Class209.method1717(-10387, i_19_, i_20_))
                    ((Interactable) player).aByte8322++;
                if ((i ^ 0xffffffff) == (Class282_Sub29.anInt7896 ^ 0xffffffff))
                    Class177.anInt2074 = (((Interactable) player).plane);
            }
        }
    }

    final void method724(byte i) {
        anInt1300++;
        synchronized (aClass278_1298) {
            aClass278_1298.method2869(0);
        }
        if (i < 120)
            method727(-27, -46, null, 103);
    }

    private final Class52 method725(int i, int i_21_) {
        anInt1305++;
        Class52 class52;
        synchronized (aClass278_1298) {
            class52 = (Class52) aClass278_1298.method2863(4, (long) i_21_);
        }
        if (class52 != null)
            return class52;
        byte[] is;
        synchronized (aClass381_1299) {
            is = aClass381_1299.method3922((byte) 117, 29, i_21_);
        }
        if (i > -20)
            method727(-111, 3, null, 81);
        class52 = new Class52();
        if (is != null)
            class52.method416(-5224, new ByteStream(is));
        synchronized (aClass278_1298) {
            aClass278_1298.method2867((byte) 0, (long) i_21_, class52);
        }
        return class52;
    }

    final void method726(boolean bool) {
        if (bool == true) {
            synchronized (aClass278_1298) {
                aClass278_1298.method2872((byte) -78);
            }
            anInt1294++;
        }
    }

    static final void method727(int i, int i_22_, RSInterface2 class354, int i_23_) {
        anInt1293++;
        Class41.anInt532 = i;
        Class54_Sub4.aClass354_5357 = class354;
        if (i_22_ == -104)
            Class279_Sub1_Sub1.anInt9817 = i_23_;
    }

    final Class199 method728(int i, int i_24_, int i_25_, int i_26_, int i_27_, Class11 class11) {
        anInt1303++;
        Class104[] class104s = null;
        Class52 class52 = method725(-43, i_24_);
        if (i_25_ != -23470)
            return null;
        if (((Class52) class52).anIntArray705 != null) {
            class104s = new Class104[((Class52) class52).anIntArray705.length];
            for (int i_28_ = 0; i_28_ < class104s.length; i_28_++) {
                Class184 class184 = class11.method204(8, (((Class52) class52).anIntArray705[i_28_]));
                class104s[i_28_] = new Class104(((Class184) class184).anInt2159, ((Class184) class184).anInt2150, ((Class184) class184).anInt2148, ((Class184) class184).anInt2157, ((Class184) class184).anInt2151, ((Class184) class184).anInt2155, ((Class184) class184).anInt2156, ((Class184) class184).aBoolean2154);
            }
        }
        return new Class199(((Class52) class52).anInt701, class104s, ((Class52) class52).anInt702, i_26_, i, i_27_);
    }

    Class102(Class215 class215, int i, Class381 class381) {
        aClass381_1299 = class381;
        aClass381_1299.method3899(29, 0);
    }
}
