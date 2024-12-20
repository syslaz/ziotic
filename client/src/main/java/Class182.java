/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class182 {
    static int anInt2100;
    int anInt2101;
    int anInt2102;
    static Class381 aClass381_2103;
    static int anInt2104;
    int anInt2105;
    static int anInt2106;
    int anInt2107 = -1;
    static int anInt2108 = 0;
    int[] anIntArray2109;
    static int anInt2110;
    static int anInt2111;
    int anInt2112;
    int[] anIntArray2113;
    static Class164[] aClass164Array2114 = new Class164[4];
    boolean aBoolean2115;
    boolean aBoolean2116;
    int[] anIntArray2117;
    int[] anIntArray2118;
    static int anInt2119;
    int anInt2120;
    static int anInt2121;
    int anInt2122;
    static int anInt2123;
    Class356 aClass356_2124;
    static int anInt2125 = -1;
    static int anInt2126;
    boolean aBoolean2127;
    private int[] anIntArray2128;
    int[] anIntArray2129;
    int anInt2130;
    int[][] anIntArrayArray2131;
    static int anInt2132;
    boolean[] aBooleanArray2133;
    int anInt2134;
    boolean aBoolean2135;

    final Class162 method1605(int i, int i_0_, int i_1_, Class162 class162, boolean bool, int i_2_) {
        anInt2132++;
        int i_3_ = ((Class182) this).anIntArray2113[i_1_];
        int i_4_ = ((Class182) this).anIntArray2117[i_1_];
        Node_Sub8_Sub2 class248_sub8_sub2 = ((Class182) this).aClass356_2124.method3788(-38, i_4_ >> 1159506416);
        i_4_ &= 0xffff;
        if (class248_sub8_sub2 == null)
            return class162.method1436((byte) 1, i, true);
        Node_Sub8_Sub2 class248_sub8_sub2_5_ = null;
        if ((((Class182) this).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_2_ != -1 && (i_2_ ^ 0xffffffff) > (((Class182) this).anIntArray2117.length ^ 0xffffffff)) {
            i_2_ = ((Class182) this).anIntArray2117[i_2_];
            class248_sub8_sub2_5_ = ((Class182) this).aClass356_2124.method3788(-27, i_2_ >> -878602480);
            i_2_ &= 0xffff;
        }
        Node_Sub8_Sub2 class248_sub8_sub2_6_ = null;
        Node_Sub8_Sub2 class248_sub8_sub2_7_ = null;
        int i_8_ = 0;
        int i_9_ = 0;
        if (anIntArray2128 != null) {
            if (anIntArray2128.length > i_1_) {
                i_8_ = anIntArray2128[i_1_];
                if ((i_8_ ^ 0xffffffff) != -65536) {
                    class248_sub8_sub2_6_ = ((Class182) this).aClass356_2124.method3788(-113, i_8_ >> -122672592);
                    i_8_ &= 0xffff;
                }
            }
            if ((((Class182) this).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_2_ != -1 && (i_2_ ^ 0xffffffff) > (anIntArray2128.length ^ 0xffffffff)) {
                i_9_ = anIntArray2128[i_2_];
                if (i_9_ != 65535) {
                    class248_sub8_sub2_7_ = ((Class182) this).aClass356_2124.method3788(-126, i_9_ >> -498245488);
                    i_9_ &= 0xffff;
                }
            }
        }
        if (((Class182) this).aBoolean2116)
            i |= 0x200;
        if (class248_sub8_sub2.method2035(i_4_, -55))
            i |= 0x80;
        if (class248_sub8_sub2.method2040(1, i_4_))
            i |= 0x100;
        if (class248_sub8_sub2.method2037(1, i_4_))
            i |= 0x400;
        if (class248_sub8_sub2_6_ != null) {
            if (class248_sub8_sub2_6_.method2035(i_8_, -61))
                i |= 0x80;
            if (class248_sub8_sub2_6_.method2040(1, i_8_))
                i |= 0x100;
            if (class248_sub8_sub2_6_.method2037(1, i_8_))
                i |= 0x400;
        }
        if (class248_sub8_sub2_5_ != null) {
            if (class248_sub8_sub2_5_.method2035(i_2_, -109))
                i |= 0x80;
            if (class248_sub8_sub2_5_.method2040(1, i_2_))
                i |= 0x100;
            if (class248_sub8_sub2_5_.method2037(1, i_2_))
                i |= 0x400;
        }
        if (class248_sub8_sub2_7_ != null) {
            if (class248_sub8_sub2_7_.method2035(i_9_, -68))
                i |= 0x80;
            if (class248_sub8_sub2_7_.method2040(1, i_9_))
                i |= 0x100;
            if (class248_sub8_sub2_7_.method2037(1, i_9_))
                i |= 0x400;
        }
        i |= 0x20;
        if (bool != false)
            return null;
        Class162 class162_10_ = class162.method1436((byte) 1, i, true);
        class162_10_.method1421(-89, class248_sub8_sub2, ((Class182) this).aBoolean2116, i_2_, i_3_, i_4_, 0, i_0_ + -1, class248_sub8_sub2_5_);
        if (class248_sub8_sub2_6_ != null)
            class162_10_.method1421(-84, class248_sub8_sub2_6_, ((Class182) this).aBoolean2116, i_9_, i_3_, i_8_, 0, -1 + i_0_, class248_sub8_sub2_7_);
        return class162_10_;
    }

    final void method1606(ByteStream class248_sub9, int i) {
        if (i != 0)
            method1607((byte) 78);
        for (; ; ) {
            int i_11_ = class248_sub9.readUnsignedByte((byte) 116);
            if (i_11_ == 0)
                break;
            method1611(class248_sub9, i_11_, 3);
        }
        anInt2110++;
    }

    final void method1607(byte i) {
        int i_12_ = -81 / ((-41 - i) / 50);
        if (((Class182) this).anInt2105 == -1) {
            if (((Class182) this).aBooleanArray2133 != null)
                ((Class182) this).anInt2105 = 2;
            else
                ((Class182) this).anInt2105 = 0;
        }
        anInt2121++;
        if (((Class182) this).anInt2107 == -1) {
            if (((Class182) this).aBooleanArray2133 == null)
                ((Class182) this).anInt2107 = 0;
            else
                ((Class182) this).anInt2107 = 2;
        }
    }

    static final void method1608(byte i, int i_13_, int i_14_) {
        if (i == 19) {
            if (!(Class116.aFloat1448 > Class116.aFloat1447)) {
                if (Class116.aFloat1448 < Class116.aFloat1447) {
                    Class116.aFloat1447 -= (double) Class116.aFloat1447 / 30.0;
                    if (Class116.aFloat1447 < Class116.aFloat1448)
                        Class116.aFloat1447 = Class116.aFloat1448;
                    Class296.method3132((byte) -7);
                    Class116.anInt1446 = (int) Class116.aFloat1447 >> -1984343039;
                    Class116.aByteArrayArrayArray1442 = Class51.method402(0, Class116.anInt1446);
                }
            } else {
                Class116.aFloat1447 += (double) Class116.aFloat1447 / 30.0;
                if (Class116.aFloat1448 < Class116.aFloat1447)
                    Class116.aFloat1447 = Class116.aFloat1448;
                Class296.method3132((byte) -7);
                Class116.anInt1446 = (int) Class116.aFloat1447 >> 379494625;
                Class116.aByteArrayArrayArray1442 = Class51.method402(i ^ 0x13, Class116.anInt1446);
            }
            anInt2126++;
            if ((Class59.anInt810 ^ 0xffffffff) != 0 && ha_Sub2.anInt5704 != -1) {
                int i_15_ = Class59.anInt810 + -Node_Sub14_Sub30.anInt9478;
                if (i_15_ < 2 || i_15_ > 2)
                    i_15_ /= 8;
                int i_16_ = ha_Sub2.anInt5704 - Class261.anInt2972;
                if (i_16_ < 2 || (i_16_ ^ 0xffffffff) < -3)
                    i_16_ /= 8;
                Node_Sub14_Sub30.anInt9478 = i_15_ + Node_Sub14_Sub30.anInt9478;
                if ((i_15_ ^ 0xffffffff) == -1 && i_16_ == 0) {
                    Class59.anInt810 = -1;
                    ha_Sub2.anInt5704 = -1;
                }
                Class261.anInt2972 = i_16_ + Class261.anInt2972;
                Class296.method3132((byte) -7);
            }
            if (Node_Sub28.anInt7166 > 0) {
                Class282_Sub1.anInt7595--;
                if ((Class282_Sub1.anInt7595 ^ 0xffffffff) == -1) {
                    Node_Sub28.anInt7166--;
                    Class282_Sub1.anInt7595 = 100;
                }
            } else {
                Class177.anInt2067 = -1;
                Class55.anInt733 = -1;
            }
            if (Node_Sub42_Sub3.aBoolean9794 && Class102.aClass293_1308 != null) {
                for (Node_Sub23 class248_sub23 = ((Node_Sub23) Class102.aClass293_1308.method3119(2)); class248_sub23 != null; class248_sub23 = (Node_Sub23) Class102.aClass293_1308.method3107(-128)) {
                    Class56 class56 = (Class116.aClass257_1436.method2750((byte) 54, ((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243));
                    if (class248_sub23.method2541(i_14_, i_13_, 109)) {
                        if (((Class56) class56).aStringArray775 != null) {
                            if (((Class56) class56).aStringArray775[4] != null)
                                Class131.method1211(true, (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), false, 0, 1012, false, -1, -1, ((Class56) class56).aStringArray775[4], (byte) 87, ((Class56) class56).aString785, ((Class56) class56).anInt751);
                            if (((Class56) class56).aStringArray775[3] != null)
                                Class131.method1211(true, (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), false, 0, 1001, false, -1, -1, ((Class56) class56).aStringArray775[3], (byte) 87, ((Class56) class56).aString785, ((Class56) class56).anInt751);
                            if (((Class56) class56).aStringArray775[2] != null)
                                Class131.method1211(true, (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), false, 0, 1007, false, -1, -1, ((Class56) class56).aStringArray775[2], (byte) 87, ((Class56) class56).aString785, ((Class56) class56).anInt751);
                            if (((Class56) class56).aStringArray775[1] != null)
                                Class131.method1211(true, (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), false, 0, 1004, false, -1, -1, ((Class56) class56).aStringArray775[1], (byte) 87, ((Class56) class56).aString785, ((Class56) class56).anInt751);
                            if (((Class56) class56).aStringArray775[0] != null)
                                Class131.method1211(true, (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), (long) (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), false, 0, 1006, false, -1, -1, ((Class56) class56).aStringArray775[0], (byte) 87, ((Class56) class56).aString785, ((Class56) class56).anInt751);
                        }
                        if (!((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).aBoolean7242) {
                            ((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).aBoolean7242 = true;
                            Class47.method351(Class301_Sub2.aClass58_8432, (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), ((Class56) class56).anInt751);
                        }
                        if (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).aBoolean7242)
                            Class47.method351(aa_Sub1.aClass58_5254, (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243), ((Class56) class56).anInt751);
                    } else if (((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).aBoolean7242) {
                        ((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).aBoolean7242 = false;
                        Class47.method351(Class122.aClass58_1517, ((Node_Sub35) (((Node_Sub23) class248_sub23).aClass248_Sub35_7088)).anInt7243, ((Class56) class56).anInt751);
                    }
                }
            }
        }
    }

    public static void method1609(byte i) {
        aClass164Array2114 = null;
        if (i < 59)
            anInt2106 = -123;
        aClass381_2103 = null;
    }

    final int method1610(byte i, boolean bool, int i_17_, int i_18_) {
        anInt2111++;
        int i_19_ = 0;
        int i_20_ = 0;
        int i_21_ = ((Class182) this).anIntArray2117[i_17_];
        Node_Sub8_Sub2 class248_sub8_sub2 = null;
        Node_Sub8_Sub2 class248_sub8_sub2_22_ = ((Class182) this).aClass356_2124.method3788(-72, i_21_ >> 1029812304);
        i_21_ &= 0xffff;
        if (class248_sub8_sub2_22_ == null)
            return i_19_;
        if ((((Class182) this).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_18_ ^ 0xffffffff) != 0 && (i_18_ ^ 0xffffffff) > (((Class182) this).anIntArray2117.length ^ 0xffffffff)) {
            i_20_ = ((Class182) this).anIntArray2117[i_18_];
            class248_sub8_sub2 = ((Class182) this).aClass356_2124.method3788(-113, i_20_ >> -920494000);
            i_20_ &= 0xffff;
        }
        if (((Class182) this).aBoolean2116)
            i_19_ |= 0x200;
        if (class248_sub8_sub2_22_.method2035(i_21_, -94))
            i_19_ |= 0x80;
        if (class248_sub8_sub2_22_.method2040(1, i_21_))
            i_19_ |= 0x100;
        if (class248_sub8_sub2_22_.method2037(1, i_21_))
            i_19_ |= 0x400;
        if (i > -27)
            ((Class182) this).anInt2120 = 27;
        if (class248_sub8_sub2 != null) {
            if (class248_sub8_sub2.method2035(i_20_, -127))
                i_19_ |= 0x80;
            if (class248_sub8_sub2.method2040(1, i_20_))
                i_19_ |= 0x100;
            if (class248_sub8_sub2.method2037(1, i_20_))
                i_19_ |= 0x400;
        }
        if (anIntArray2128 != null && bool) {
            if ((i_17_ ^ 0xffffffff) > (anIntArray2128.length ^ 0xffffffff)) {
                int i_23_ = anIntArray2128[i_17_];
                if (i_23_ != 65535) {
                    Node_Sub8_Sub2 class248_sub8_sub2_24_ = ((Class182) this).aClass356_2124.method3788(-108, i_23_ >> -1648101008);
                    i_23_ &= 0xffff;
                    if (class248_sub8_sub2_24_ != null) {
                        if (class248_sub8_sub2_24_.method2035(i_23_, -16))
                            i_19_ |= 0x80;
                        if (class248_sub8_sub2_24_.method2040(1, i_23_))
                            i_19_ |= 0x100;
                        if (class248_sub8_sub2_24_.method2037(1, i_23_))
                            i_19_ |= 0x400;
                    }
                }
            }
            if ((((Class182) this).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && (i_18_ ^ 0xffffffff) != 0 && i_18_ < anIntArray2128.length) {
                int i_25_ = anIntArray2128[i_18_];
                if (i_25_ != 65535) {
                    Node_Sub8_Sub2 class248_sub8_sub2_26_ = ((Class182) this).aClass356_2124.method3788(-115, i_25_ >> 1157293264);
                    i_25_ &= 0xffff;
                    if (class248_sub8_sub2_26_ != null) {
                        if (class248_sub8_sub2_26_.method2035(i_25_, -43))
                            i_19_ |= 0x80;
                        if (class248_sub8_sub2_26_.method2040(1, i_25_))
                            i_19_ |= 0x100;
                        if (class248_sub8_sub2_26_.method2037(1, i_25_))
                            i_19_ |= 0x400;
                    }
                }
            }
        }
        return i_19_ | 0x20;
    }

    private final void method1611(ByteStream class248_sub9, int i, int i_27_) {
        anInt2104++;
        if (i_27_ == 3) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5)
                            ((Class182) this).anInt2101 = class248_sub9.readUnsignedByte((byte) 117);
                        else if ((i ^ 0xffffffff) != -7) {
                            if ((i ^ 0xffffffff) != -8) {
                                if (i != 8) {
                                    if (i != 9) {
                                        if ((i ^ 0xffffffff) != -11) {
                                            if ((i ^ 0xffffffff) == -12)
                                                ((Class182) this).anInt2102 = (class248_sub9.readUnsignedByte((byte) -81));
                                            else if (i != 12) {
                                                if ((i ^ 0xffffffff) == -14) {
                                                    int i_28_ = class248_sub9.readShort(-1);
                                                    ((Class182) this).anIntArrayArray2131 = new int[i_28_][];
                                                    for (int i_29_ = 0; ((i_28_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
                                                        int i_30_ = (class248_sub9.readUnsignedByte((byte) -16));
                                                        if (i_30_ > 0) {
                                                            ((Class182) this).anIntArrayArray2131[i_29_] = (new int
                                                                    [i_30_]);
                                                            ((Class182) this).anIntArrayArray2131[i_29_][0] = (class248_sub9.method2221(255));
                                                            for (int i_31_ = 1; ((i_30_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff)); i_31_++)
                                                                ((Class182) this).anIntArrayArray2131[i_29_][i_31_] = (class248_sub9.readShort(-1));
                                                        }
                                                    }
                                                } else if ((i ^ 0xffffffff) != -15) {
                                                    if (i == 15)
                                                        ((Class182) this).aBoolean2115 = true;
                                                    else if ((i ^ 0xffffffff) == -17)
                                                        ((Class182) this).aBoolean2127 = true;
                                                    else if (i == 18)
                                                        ((Class182) this).aBoolean2135 = true;
                                                    else if ((i ^ 0xffffffff) != -20) {
                                                        if ((i ^ 0xffffffff) == -21) {
                                                            if (((((Class182) this).anIntArray2109) == null) || ((((Class182) this).anIntArray2118) == null)) {
                                                                ((Class182) this).anIntArray2109 = (new int
                                                                        [(((Class182) this).anIntArrayArray2131).length]);
                                                                ((Class182) this).anIntArray2118 = (new int
                                                                        [(((Class182) this).anIntArrayArray2131).length]);
                                                                for (int i_32_ = 0; ((((Class182) this).anIntArrayArray2131).length > i_32_); i_32_++) {
                                                                    ((Class182) this).anIntArray2109[i_32_] = 256;
                                                                    ((Class182) this).anIntArray2118[i_32_] = 256;
                                                                }
                                                            }
                                                            int i_33_ = (class248_sub9.readUnsignedByte((byte) 84));
                                                            ((Class182) this).anIntArray2109[i_33_] = (class248_sub9.readShort(Class316_Sub1.method3291(i_27_, -4)));
                                                            ((Class182) this).anIntArray2118[i_33_] = (class248_sub9.readShort(-1));
                                                        }
                                                    } else {
                                                        if ((((Class182) this).anIntArray2129) == null) {
                                                            ((Class182) this).anIntArray2129 = (new int
                                                                    [(((Class182) this).anIntArrayArray2131).length]);
                                                            for (int i_34_ = 0; (i_34_ < (((Class182) this).anIntArrayArray2131).length); i_34_++)
                                                                ((Class182) this).anIntArray2129[i_34_] = 255;
                                                        }
                                                        ((Class182) this).anIntArray2129[(class248_sub9.readUnsignedByte((byte) 89))] = (class248_sub9.readUnsignedByte((byte) -63));
                                                    }
                                                } else
                                                    ((Class182) this).aBoolean2116 = true;
                                            } else {
                                                int i_35_ = (class248_sub9.readUnsignedByte((byte) -19));
                                                anIntArray2128 = new int[i_35_];
                                                for (int i_36_ = 0; ((i_35_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++)
                                                    anIntArray2128[i_36_] = (class248_sub9.readShort(Class316_Sub1.method3291(i_27_, -4)));
                                                for (int i_37_ = 0; i_37_ < i_35_; i_37_++)
                                                    anIntArray2128[i_37_] = ((class248_sub9.readShort(-1) << -118159152) + (anIntArray2128[i_37_]));
                                            }
                                        } else
                                            ((Class182) this).anInt2105 = class248_sub9.readUnsignedByte((byte) -83);
                                    } else
                                        ((Class182) this).anInt2107 = class248_sub9.readUnsignedByte((byte) -31);
                                } else
                                    ((Class182) this).anInt2122 = class248_sub9.readUnsignedByte((byte) -38);
                            } else
                                ((Class182) this).anInt2112 = class248_sub9.readShort(-1);
                        } else
                            ((Class182) this).anInt2134 = class248_sub9.readShort(i_27_ + -4);
                    } else {
                        ((Class182) this).aBooleanArray2133 = new boolean[256];
                        int i_38_ = class248_sub9.readUnsignedByte((byte) -83);
                        for (int i_39_ = 0; (i_38_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++)
                            ((Class182) this).aBooleanArray2133[class248_sub9.readUnsignedByte((byte) 78)] = true;
                    }
                } else
                    ((Class182) this).anInt2130 = class248_sub9.readShort(i_27_ + -4);
            } else {
                int i_40_ = class248_sub9.readShort(-1);
                ((Class182) this).anIntArray2113 = new int[i_40_];
                for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
                    ((Class182) this).anIntArray2113[i_41_] = class248_sub9.readShort(-1);
                ((Class182) this).anIntArray2117 = new int[i_40_];
                for (int i_42_ = 0; (i_40_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++)
                    ((Class182) this).anIntArray2117[i_42_] = class248_sub9.readShort(-1);
                for (int i_43_ = 0; (i_40_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++)
                    ((Class182) this).anIntArray2117[i_43_] = ((class248_sub9.readShort(i_27_ + -4) << 1186130992) - -((Class182) this).anIntArray2117[i_43_]);
            }
        }
    }

    final Class162 method1612(byte i, int i_44_, int i_45_, int i_46_, Class162 class162, int i_47_, int i_48_, byte i_49_) {
        anInt2119++;
        int i_50_ = ((Class182) this).anIntArray2113[i_45_];
        i_45_ = ((Class182) this).anIntArray2117[i_45_];
        Node_Sub8_Sub2 class248_sub8_sub2 = ((Class182) this).aClass356_2124.method3788(i + 12, i_45_ >> -1504501872);
        if (i != -107)
            method1609((byte) -71);
        i_45_ &= 0xffff;
        if (class248_sub8_sub2 == null)
            return class162.method1436(i_49_, i_47_, true);
        Node_Sub8_Sub2 class248_sub8_sub2_51_ = null;
        if ((((Class182) this).aBoolean2115 || Node_Sub8_Sub2.aBoolean8918) && i_48_ != -1 && ((((Class182) this).anIntArray2117.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff))) {
            i_48_ = ((Class182) this).anIntArray2117[i_48_];
            class248_sub8_sub2_51_ = ((Class182) this).aClass356_2124.method3788(i + 58, i_48_ >> 2122129648);
            i_48_ &= 0xffff;
        }
        if (((Class182) this).aBoolean2116)
            i_47_ |= 0x200;
        if (class248_sub8_sub2.method2035(i_45_, -118))
            i_47_ |= 0x80;
        if (class248_sub8_sub2.method2040(1, i_45_))
            i_47_ |= 0x100;
        if (class248_sub8_sub2.method2037(1, i_45_))
            i_47_ |= 0x400;
        if (class248_sub8_sub2_51_ != null) {
            if (class248_sub8_sub2_51_.method2035(i_48_, -96))
                i_47_ |= 0x80;
            if (class248_sub8_sub2_51_.method2040(i + 108, i_48_))
                i_47_ |= 0x100;
            if (class248_sub8_sub2_51_.method2037(1, i_48_))
                i_47_ |= 0x400;
        }
        i_47_ |= 0x20;
        Class162 class162_52_ = class162.method1436(i_49_, i_47_, true);
        class162_52_.method1421(-110, class248_sub8_sub2, ((Class182) this).aBoolean2116, i_48_, i_50_, i_45_, i_46_, -1 + i_44_, class248_sub8_sub2_51_);
        return class162_52_;
    }

    public Class182() {
        ((Class182) this).anInt2105 = -1;
        ((Class182) this).aBoolean2116 = false;
        ((Class182) this).aBoolean2115 = false;
        ((Class182) this).anInt2102 = 2;
        ((Class182) this).anInt2101 = 5;
        ((Class182) this).anInt2112 = -1;
        ((Class182) this).anInt2122 = 99;
        ((Class182) this).anInt2130 = -1;
        ((Class182) this).aBoolean2127 = false;
        ((Class182) this).aBoolean2135 = false;
        ((Class182) this).anInt2134 = -1;
    }

    static {
        anInt2100 = 0;
        anInt2123 = -1;
    }
}
