/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class116 {
    private static Class65 aClass65_1430 = new Class65(16);
    static Class381 aClass381_1431;
    private static Class192 aClass192_1432;
    private static Class144 aClass144_1433;
    static Node_Sub8_Sub1 aClass248_Sub8_Sub1_1434;
    static Class39 aClass39_1435;
    static Class257 aClass257_1436;
    static Class368 aClass368_1437;
    static Interface3 anInterface3_1438;
    private static short[] aShortArray1439;
    static int anInt1440;
    private static byte[] aByteArray1441;
    static byte[][][] aByteArrayArrayArray1442;
    static Class293 aClass293_1443;
    static Class380 aClass380_1444;
    static int anInt1445 = (int) (Math.random() * 17.0) - 8;
    static int anInt1446;
    static float aFloat1447;
    static float aFloat1448;
    static int anInt1449;
    private static short[] aShortArray1450;
    private static byte[] aByteArray1451;
    private static byte[] aByteArray1452;
    private static Class360[][][] aClass360ArrayArrayArray1453;
    static int anInt1454;
    private static short[] aShortArray1455;
    static int anInt1456;
    static int anInt1457;
    private static int[] anIntArray1458;
    private static byte[] aByteArray1459;
    static int anInt1460;
    static int anInt1461;
    private static Class65 aClass65_1462;
    private static byte[] aByteArray1463;
    static int anInt1464;
    static int anInt1465;
    static int anInt1466;
    private static byte[] aByteArray1467;
    static int anInt1468;
    static int anInt1469;
    static int anInt1470;

    static final void method1078() {
        aByteArray1459 = null;
        aByteArray1452 = null;
        aShortArray1455 = null;
        aByteArray1451 = null;
        aByteArray1463 = null;
        aShortArray1450 = null;
        aByteArray1467 = null;
        aClass65_1462 = null;
        aClass360ArrayArrayArray1453 = null;
        anIntArray1458 = null;
    }

    private static final void method1079(ha var_ha, int i, int i_0_, int i_1_, int i_2_, short[] is, byte[] is_3_) {
        if (is != null) {
            for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
                ObjectDefinition class266 = aClass368_1437.method3838((byte) -12, is[i_4_] & 0xffff);
                int i_5_ = ((ObjectDefinition) class266).anInt3036;
                if (i_5_ != -1) {
                    Class61 class61 = aClass39_1435.method293(i_5_, 125);
                    Class129 class129 = class61.method473((((ObjectDefinition) class266).aBoolean3061 ? (((ObjectDefinition) class266).aBoolean3064) : false), 681903699, var_ha, (((ObjectDefinition) class266).aBoolean3055 ? is_3_[i_4_] >> 6 & 0x3 : 0));
                    if (class129 != null) {
                        int i_6_ = i_1_ * class129.method1169() >> 2;
                        int i_7_ = i_2_ * class129.method1181() >> 2;
                        if (((Class61) class61).aBoolean827) {
                            int i_8_ = ((ObjectDefinition) class266).anInt3097;
                            int i_9_ = ((ObjectDefinition) class266).anInt3065;
                            if ((is_3_[i_4_] >> 6 & 0x1) == 1) {
                                int i_10_ = i_8_;
                                i_8_ = i_9_;
                                i_9_ = i_10_;
                            }
                            i_6_ = i_8_ * i_1_;
                            i_7_ = i_9_ * i_2_;
                        }
                        if (i_6_ != 0 && i_7_ != 0) {
                            if (((Class61) class61).anInt830 != 0)
                                class129.method1166(i, i_0_ - i_7_ + i_2_, i_6_, i_7_, 0, (~0xffffff | (((Class61) class61).anInt830)), 1);
                            else
                                class129.method1185(i, i_0_ - i_7_ + i_2_, i_6_, i_7_);
                        }
                    }
                }
            }
        }
    }

    public static void method1080() {
        aClass144_1433 = null;
        aClass192_1432 = null;
        aClass368_1437 = null;
        aClass257_1436 = null;
        aClass39_1435 = null;
        anInterface3_1438 = null;
        aClass248_Sub8_Sub1_1434 = null;
        aClass381_1431 = null;
        aClass65_1430 = null;
        aByteArrayArrayArray1442 = null;
        aShortArray1439 = null;
        aByteArray1441 = null;
        aClass380_1444 = null;
        aClass293_1443 = null;
        anIntArray1458 = null;
        aByteArray1459 = null;
        aByteArray1452 = null;
        aShortArray1455 = null;
        aByteArray1451 = null;
        aByteArray1463 = null;
        aShortArray1450 = null;
        aByteArray1467 = null;
        aClass65_1462 = null;
        aClass360ArrayArrayArray1453 = null;
    }

    static final Node_Sub8_Sub1 method1081(int i, int i_11_) {
        for (Node_Sub8_Sub1 class248_sub8_sub1 = (Node_Sub8_Sub1) aClass65_1430.method510(true); class248_sub8_sub1 != null; class248_sub8_sub1 = (Node_Sub8_Sub1) aClass65_1430.method512(false)) {
            if (((Node_Sub8_Sub1) class248_sub8_sub1).aBoolean8903 && class248_sub8_sub1.method2029(i, i_11_, 105))
                return class248_sub8_sub1;
        }
        return null;
    }

    private static final void method1082() {
        for (int i = 0; i < anInt1465; i++) {
            for (int i_12_ = 0; i_12_ < anInt1457; i_12_++) {
                int i_13_ = aShortArray1450[i + i_12_ * anInt1465] & 0xffff;
                if (i_13_ != 0) {
                    if (i_13_ == 65535) {
                        Node_Sub7 class248_sub7 = ((Node_Sub7) aClass65_1462.method501((long) (i << 16 | i_12_), (byte) 31));
                        if (class248_sub7 != null) {
                            for (int i_14_ = 0; i_14_ < (((Node_Sub7) class248_sub7).aShortArray6858).length; i_14_++) {
                                ObjectDefinition class266 = (aClass368_1437.method3838((byte) -76, (((Node_Sub7) class248_sub7).aShortArray6858[i_14_]) & 0xffff));
                                int i_15_ = ((ObjectDefinition) class266).anInt3033;
                                if (((ObjectDefinition) class266).anIntArray3049 != null) {
                                    class266 = (class266.method2797(anInterface3_1438, 120));
                                    if (class266 != null)
                                        i_15_ = ((ObjectDefinition) class266).anInt3033;
                                }
                                if (i_15_ != -1) {
                                    Node_Sub35 class248_sub35 = new Node_Sub35(i_15_);
                                    ((Node_Sub35) class248_sub35).anInt7252 = i;
                                    ((Node_Sub35) class248_sub35).anInt7246 = i_12_;
                                    aClass293_1443.method3109(class248_sub35, -123);
                                }
                            }
                        }
                    } else {
                        ObjectDefinition class266 = aClass368_1437.method3838((byte) -23, i_13_ - 1);
                        int i_16_ = ((ObjectDefinition) class266).anInt3033;
                        if (((ObjectDefinition) class266).anIntArray3049 != null) {
                            class266 = class266.method2797(anInterface3_1438, 123);
                            if (class266 != null)
                                i_16_ = ((ObjectDefinition) class266).anInt3033;
                        }
                        if (i_16_ != -1) {
                            Node_Sub35 class248_sub35 = new Node_Sub35(i_16_);
                            ((Node_Sub35) class248_sub35).anInt7252 = i;
                            ((Node_Sub35) class248_sub35).anInt7246 = i_12_;
                            aClass293_1443.method3109(class248_sub35, -113);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int i_17_ = 0; i_17_ < aClass360ArrayArrayArray1453[0].length; i_17_++) {
                for (int i_18_ = 0; i_18_ < aClass360ArrayArrayArray1453[0][0].length; i_18_++) {
                    Class360 class360 = aClass360ArrayArrayArray1453[i][i_17_][i_18_];
                    if (class360 != null) {
                        for (Class346_Sub3 class346_sub3 = ((Class346_Sub3) class360.method3815((byte) 51)); class346_sub3 != null; class346_sub3 = ((Class346_Sub3) class360.method3809(-24951))) {
                            if (((Class346_Sub3) class346_sub3).aShortArray8267 != null) {
                                for (int i_19_ = 0; i_19_ < (((Class346_Sub3) class346_sub3).aShortArray8267).length; i_19_++) {
                                    ObjectDefinition class266 = (aClass368_1437.method3838((byte) -80, ((((Class346_Sub3) class346_sub3).aShortArray8267[i_19_]) & 0xffff)));
                                    int i_20_ = ((ObjectDefinition) class266).anInt3033;
                                    if (((ObjectDefinition) class266).anIntArray3049 != null) {
                                        class266 = (class266.method2797(anInterface3_1438, 125));
                                        if (class266 != null)
                                            i_20_ = (((ObjectDefinition) class266).anInt3033);
                                    }
                                    if (i_20_ != -1) {
                                        Node_Sub35 class248_sub35 = new Node_Sub35(i_20_);
                                        ((Node_Sub35) class248_sub35).anInt7252 = ((i_17_ + (anInt1468 >> 6)) * 64 + ((Class346_Sub3) class346_sub3).aByte8269 - anInt1468);
                                        ((Node_Sub35) class248_sub35).anInt7246 = ((i_18_ + (anInt1469 >> 6)) * 64 + ((Class346_Sub3) class346_sub3).aByte8265 - anInt1469);
                                        aClass293_1443.method3109(class248_sub35, -88);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void method1083(ha var_ha, ByteStream class248_sub9, int i, int i_21_, int i_22_, int i_23_, int[] is, int[] is_24_) {
        int i_25_ = class248_sub9.readUnsignedByte((byte) -15);
        if ((i_25_ & 0x1) == 0) {
            boolean bool = (i_25_ & 0x2) == 0;
            int i_26_ = i_25_ >> 2 & 0x3f;
            if (i_26_ != 62) {
                if (i_26_ == 63)
                    i_26_ = class248_sub9.readUnsignedByte((byte) -40);
                else if (bool)
                    i_26_ = is[i_26_];
                else
                    i_26_ = is_24_[i_26_];
                if (bool) {
                    aByteArray1459[i_22_ + i_23_ * anInt1465] = (byte) i_26_;
                    aByteArray1451[i_22_ + i_23_ * anInt1465] = (byte) 0;
                } else {
                    aByteArray1451[i_22_ + i_23_ * anInt1465] = (byte) i_26_;
                    aByteArray1463[i_22_ + i_23_ * anInt1465] = (byte) 0;
                    aByteArray1459[i_22_ + i_23_ * anInt1465] = class248_sub9.readByte(37);
                }
            }
        } else {
            int i_27_ = (i_25_ >> 1 & 0x3) + 1;
            boolean bool = (i_25_ & 0x8) != 0;
            boolean bool_28_ = (i_25_ & 0x10) != 0;
            for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
                int i_30_ = class248_sub9.readUnsignedByte((byte) 87);
                int i_31_ = 0;
                int i_32_ = 0;
                if (bool) {
                    i_31_ = class248_sub9.readUnsignedByte((byte) 109);
                    i_32_ = class248_sub9.readUnsignedByte((byte) -42);
                }
                int i_33_ = 0;
                if (bool_28_)
                    i_33_ = class248_sub9.readUnsignedByte((byte) 120);
                if (i_29_ == 0) {
                    aByteArray1459[i_22_ + i_23_ * anInt1465] = (byte) i_30_;
                    aByteArray1451[i_22_ + i_23_ * anInt1465] = (byte) i_31_;
                    aByteArray1463[i_22_ + i_23_ * anInt1465] = (byte) i_32_;
                    if (i_33_ == 1) {
                        aShortArray1450[i_22_ + i_23_ * anInt1465] = (short) (class248_sub9.readShort(-1) + 1);
                        aByteArray1467[i_22_ + i_23_ * anInt1465] = class248_sub9.readByte(85);
                    } else if (i_33_ > 1) {
                        aShortArray1450[i_22_ + i_23_ * anInt1465] = (short) -1;
                        short[] is_34_ = new short[i_33_];
                        byte[] is_35_ = new byte[i_33_];
                        for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
                            is_34_[i_36_] = (short) class248_sub9.readShort(-1);
                            is_35_[i_36_] = class248_sub9.readByte(82);
                        }
                        aClass65_1462.method509(-1, new Node_Sub7(is_34_, is_35_), (long) (i_22_ << 16 | i_23_));
                    }
                } else {
                    short[] is_37_ = null;
                    byte[] is_38_ = null;
                    if (i_33_ > 0) {
                        is_37_ = new short[i_33_];
                        is_38_ = new byte[i_33_];
                        for (int i_39_ = 0; i_39_ < i_33_; i_39_++) {
                            is_37_[i_39_] = (short) class248_sub9.readShort(-1);
                            is_38_[i_39_] = class248_sub9.readByte(123);
                        }
                    }
                    if ((aClass360ArrayArrayArray1453[i_29_ - 1][i - (anInt1468 >> 6)][i_21_ - (anInt1469 >> 6)]) == null)
                        aClass360ArrayArrayArray1453[i_29_ - 1][i - (anInt1468 >> 6)][i_21_ - (anInt1469 >> 6)] = new Class360();
                    Class346_Sub3 class346_sub3 = new Class346_Sub3(i_22_ & 0x3f, i_23_ & 0x3f, i_30_, i_31_, i_32_, is_37_, is_38_);
                    aClass360ArrayArrayArray1453[i_29_ - 1][i - (anInt1468 >> 6)][i_21_ - (anInt1469 >> 6)].method3811(class346_sub3, 0);
                }
            }
        }
    }

    static final void method1084(Class381 class381, Class144 class144, Class192 class192, Class368 class368, Class257 class257, Class39 class39, Interface3 interface3) {
        aClass381_1431 = class381;
        aClass144_1433 = class144;
        aClass192_1432 = class192;
        aClass368_1437 = class368;
        aClass257_1436 = class257;
        aClass39_1435 = class39;
        anInterface3_1438 = interface3;
        aClass65_1430.method504(-1);
        int i = aClass381_1431.method3927((byte) 77, "details");
        int[] is = aClass381_1431.method3918(i, 114);
        if (is != null) {
            for (int i_40_ = 0; i_40_ < is.length; i_40_++) {
                Node_Sub8_Sub1 class248_sub8_sub1 = Class282_Sub16.method2992(aClass381_1431, false, is[i_40_], i);
                aClass65_1430.method509(-1, class248_sub8_sub1, (long) ((Node_Sub8_Sub1) class248_sub8_sub1).anInt8895);
            }
        }
        Class48.method361(true, false, true);
    }

    static final void method1085() {
        aByteArray1459 = new byte[anInt1465 * anInt1457];
        aByteArray1451 = new byte[anInt1465 * anInt1457];
        aByteArray1463 = new byte[anInt1465 * anInt1457];
        aShortArray1450 = new short[anInt1465 * anInt1457];
        aByteArray1467 = new byte[anInt1465 * anInt1457];
        aClass65_1462 = new Class65(1024);
        aClass360ArrayArrayArray1453 = new Class360[3][anInt1465 >> 6][anInt1457 >> 6];
        anIntArray1458 = new int[((Class144) aClass144_1433).anInt1696 + 1];
    }

    static final Class64 method1086(int i, int i_41_) {
        Class64 class64 = new Class64();
        for (Node_Sub8_Sub1 class248_sub8_sub1 = (Node_Sub8_Sub1) aClass65_1430.method510(true); class248_sub8_sub1 != null; class248_sub8_sub1 = (Node_Sub8_Sub1) aClass65_1430.method512(false)) {
            if (((Node_Sub8_Sub1) class248_sub8_sub1).aBoolean8903 && class248_sub8_sub1.method2029(i, i_41_, 120))
                class64.method491(class248_sub8_sub1, -109);
        }
        return class64;
    }

    private static final Class293 method1087(ha var_ha, int i, int i_42_, int i_43_, int i_44_) {
        for (Node_Sub35 class248_sub35 = (Node_Sub35) aClass293_1443.method3119(2); class248_sub35 != null; class248_sub35 = (Node_Sub35) aClass293_1443.method3107(-128))
            method1092(var_ha, class248_sub35, i, i_42_, i_43_, i_44_);
        return aClass293_1443;
    }

    static final void method1088(ha var_ha, Node_Sub35 class248_sub35, Class56 class56) {
        if (((Class56) class56).anIntArray754 != null) {
            int[] is = new int[((Class56) class56).anIntArray754.length];
            for (int i = 0; i < is.length / 2; i++) {
                int i_45_ = (((Class56) class56).anIntArray754[i * 2] + ((Node_Sub35) class248_sub35).anInt7252);
                int i_46_ = (((Class56) class56).anIntArray754[i * 2 + 1] + ((Node_Sub35) class248_sub35).anInt7246);
                is[i * 2] = anInt1464 + ((anInt1466 - anInt1464) * (i_45_ - anInt1460) / (anInt1461 - anInt1460));
                is[i * 2 + 1] = anInt1456 - ((anInt1456 - anInt1470) * (i_46_ - anInt1449) / (anInt1454 - anInt1449));
            }
            Class63.method482(var_ha, is, ((Class56) class56).anInt748);
            if (((Class56) class56).anInt783 > 0) {
                for (int i = 0; i < is.length / 2 - 1; i++) {
                    int i_47_ = is[i * 2];
                    int i_48_ = is[i * 2 + 1];
                    int i_49_ = is[(i + 1) * 2];
                    int i_50_ = is[(i + 1) * 2 + 1];
                    if (i_49_ < i_47_) {
                        int i_51_ = i_47_;
                        int i_52_ = i_48_;
                        i_47_ = i_49_;
                        i_48_ = i_50_;
                        i_49_ = i_51_;
                        i_50_ = i_52_;
                    } else if (i_49_ == i_47_ && i_50_ < i_48_) {
                        int i_53_ = i_48_;
                        i_48_ = i_50_;
                        i_50_ = i_53_;
                    }
                    var_ha.a(i_47_, i_48_, i_49_, i_50_, (((Class56) class56).anIntArray750[((Class56) class56).aByteArray761[i] & 0xff]), 1, ((Class56) class56).anInt783, ((Class56) class56).anInt773, ((Class56) class56).anInt766);
                }
                int i = is[is.length - 2];
                int i_54_ = is[is.length - 1];
                int i_55_ = is[0];
                int i_56_ = is[1];
                if (i_55_ < i) {
                    int i_57_ = i;
                    int i_58_ = i_54_;
                    i = i_55_;
                    i_54_ = i_56_;
                    i_55_ = i_57_;
                    i_56_ = i_58_;
                } else if (i_55_ == i && i_56_ < i_54_) {
                    int i_59_ = i_54_;
                    i_54_ = i_56_;
                    i_56_ = i_59_;
                }
                var_ha.a(i, i_54_, i_55_, i_56_, (((Class56) class56).anIntArray750[((((Class56) class56).aByteArray761[((Class56) class56).aByteArray761.length - 1]) & 0xff)]), 1, ((Class56) class56).anInt783, ((Class56) class56).anInt773, ((Class56) class56).anInt766);
            } else {
                for (int i = 0; i < is.length / 2 - 1; i++)
                    var_ha.method811(is[(i + 1) * 2], is[(i + 1) * 2 + 1], is[i * 2 + 1], (((Class56) class56).anIntArray750[(((Class56) class56).aByteArray761[i] & 0xff)]), (byte) 49, is[i * 2]);
                var_ha.method811(is[0], is[1], is[is.length - 1], (((Class56) class56).anIntArray750[(((Class56) class56).aByteArray761[(((Class56) class56).aByteArray761.length - 1)]) & 0xff]), (byte) 49, is[is.length - 2]);
            }
        }
    }

    private static final void method1089(ha var_ha, int i, int i_60_, int i_61_, int i_62_) {
        int i_63_ = anInt1461 - anInt1460;
        int i_64_ = anInt1454 - anInt1449;
        if (anInt1461 < anInt1465)
            i_63_++;
        if (anInt1454 < anInt1457)
            i_64_++;
        for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
            int i_66_ = (i_61_ + i * i_65_ >> 16) + anInt1464;
            int i_67_ = (i_61_ + i * (i_65_ + 1) >> 16) + anInt1464;
            int i_68_ = i_67_ - i_66_;
            if (i_68_ > 0) {
                int i_69_ = anInt1460 + i_65_;
                if (i_69_ < 0 || i_69_ >= anInt1465) {
                    for (int i_70_ = 0; i_70_ < i_64_; i_70_++) {
                        int i_71_ = anInt1456 - (i_62_ + i_60_ * (i_70_ + 1) >> 16);
                        int i_72_ = anInt1456 - (i_62_ + i_60_ * i_70_ >> 16);
                        int i_73_ = i_72_ - i_71_;
                        int i_74_;
                        if ((((Node_Sub8_Sub1) aClass248_Sub8_Sub1_1434).anInt8906) != -1)
                            i_74_ = ~0xffffff | (((Node_Sub8_Sub1) aClass248_Sub8_Sub1_1434).anInt8906);
                        else if ((i_65_ + anInt1460 & 0x4) != (i_70_ + anInt1454 & 0x4))
                            i_74_ = -11840664;
                        else
                            i_74_ = anIntArray1458[(((Class144) aClass144_1433).anInt1703) + 1];
                        if (i_74_ == 0)
                            i_74_ = -16777216;
                        var_ha.aa(i_66_, i_71_, i_68_, i_73_, i_74_, 0);
                    }
                } else {
                    for (int i_75_ = 0; i_75_ < i_64_; i_75_++) {
                        int i_76_ = anInt1456 - (i_62_ + i_60_ * (i_75_ + 1) >> 16);
                        int i_77_ = anInt1456 - (i_62_ + i_60_ * i_75_ >> 16);
                        int i_78_ = i_77_ - i_76_;
                        if (i_78_ > 0) {
                            int i_79_ = i_75_ + anInt1449;
                            int i_80_ = i_69_ + i_79_ * anInt1465;
                            int i_81_ = 0;
                            int i_82_ = 0;
                            int i_83_ = 0;
                            if (i_79_ >= 0 && i_79_ < anInt1457) {
                                i_81_ = ((aByteArray1452[i_80_] & 0xff) << 16 | aShortArray1455[i_80_] & 0xffff);
                                if (i_81_ != 0)
                                    i_81_ |= ~0xffffff;
                                i_82_ = aByteArray1451[i_80_] & 0xff;
                                i_83_ = aShortArray1450[i_80_] & 0xffff;
                            }
                            if (i_81_ == 0 && i_82_ == 0 && i_83_ == 0) {
                                if (((Node_Sub8_Sub1) aClass248_Sub8_Sub1_1434).anInt8906 != -1)
                                    i_81_ = (~0xffffff | (((Node_Sub8_Sub1) aClass248_Sub8_Sub1_1434).anInt8906));
                                else if ((i_65_ + anInt1460 & 0x4) != (i_75_ + anInt1454 & 0x4))
                                    i_81_ = -11840664;
                                else
                                    i_81_ = (anIntArray1458[(((Class144) aClass144_1433).anInt1703) + 1]);
                                if (i_81_ == 0)
                                    i_81_ = -16777216;
                                var_ha.aa(i_66_, i_76_, i_68_, i_78_, i_81_, 0);
                            } else if (i_83_ > 0) {
                                if (i_83_ == 65535) {
                                    Node_Sub7 class248_sub7 = ((Node_Sub7) (aClass65_1462.method501((long) (i_69_ << 16 | i_79_), (byte) 31)));
                                    if (class248_sub7 != null)
                                        method1100(var_ha, i_66_, i_76_, i_68_, i_78_, i_81_, i_82_, aByteArray1463[i_80_], (((Node_Sub7) class248_sub7).aShortArray6858), (((Node_Sub7) class248_sub7).aByteArray6859), true);
                                } else {
                                    aShortArray1439[0] = (short) (i_83_ - 1);
                                    aByteArray1441[0] = aByteArray1467[i_80_];
                                    method1100(var_ha, i_66_, i_76_, i_68_, i_78_, i_81_, i_82_, aByteArray1463[i_80_], aShortArray1439, aByteArray1441, true);
                                }
                            } else
                                method1100(var_ha, i_66_, i_76_, i_68_, i_78_, i_81_, i_82_, aByteArray1463[i_80_], null, null, true);
                        }
                    }
                }
            }
        }
        for (int i_84_ = -16; i_84_ < i_63_ + 16; i_84_++) {
            int i_85_ = (i_61_ + i * i_84_ >> 16) + anInt1464;
            int i_86_ = (i_61_ + i * (i_84_ + 1) >> 16) + anInt1464;
            int i_87_ = i_86_ - i_85_;
            if (i_87_ > 0) {
                int i_88_ = i_84_ + anInt1460;
                if (i_88_ >= 0 && i_88_ < anInt1465) {
                    for (int i_89_ = -16; i_89_ < i_64_ + 16; i_89_++) {
                        int i_90_ = anInt1456 - (i_62_ + i_60_ * (i_89_ + 1) >> 16);
                        int i_91_ = anInt1456 - (i_62_ + i_60_ * i_89_ >> 16);
                        int i_92_ = i_91_ - i_90_;
                        if (i_92_ > 0) {
                            int i_93_ = i_89_ + anInt1449;
                            if (i_93_ >= 0 && i_93_ < anInt1457) {
                                int i_94_ = ((aShortArray1450[i_88_ + i_93_ * anInt1465]) & 0xffff);
                                if (i_94_ > 0) {
                                    if (i_94_ == 65535) {
                                        Node_Sub7 class248_sub7 = ((Node_Sub7) (aClass65_1462.method501((long) (i_88_ << 16 | i_93_), (byte) 31)));
                                        if (class248_sub7 != null)
                                            method1079(var_ha, i_85_, i_90_, i_87_, i_92_, (((Node_Sub7) class248_sub7).aShortArray6858), (((Node_Sub7) class248_sub7).aByteArray6859));
                                    } else {
                                        aShortArray1439[0] = (short) (i_94_ - 1);
                                        aByteArray1441[0] = (aByteArray1467[i_88_ + i_93_ * anInt1465]);
                                        method1079(var_ha, i_85_, i_90_, i_87_, i_92_, aShortArray1439, aByteArray1441);
                                    }
                                } else
                                    method1079(var_ha, i_85_, i_90_, i_87_, i_92_, null, null);
                            }
                        }
                    }
                }
            }
        }
        int i_95_ = anInt1460 >> 6;
        int i_96_ = anInt1449 >> 6;
        if (i_95_ < 0)
            i_95_ = 0;
        if (i_96_ < 0)
            i_96_ = 0;
        int i_97_ = anInt1461 >> 6;
        int i_98_ = anInt1454 >> 6;
        if (i_97_ >= aClass360ArrayArrayArray1453[0].length)
            i_97_ = aClass360ArrayArrayArray1453[0].length - 1;
        if (i_98_ >= aClass360ArrayArrayArray1453[0][0].length)
            i_98_ = aClass360ArrayArrayArray1453[0][0].length - 1;
        for (int i_99_ = 0; i_99_ < 3; i_99_++) {
            for (int i_100_ = i_95_; i_100_ <= i_97_; i_100_++) {
                for (int i_101_ = i_96_; i_101_ <= i_98_; i_101_++) {
                    Class360 class360 = aClass360ArrayArrayArray1453[i_99_][i_100_][i_101_];
                    if (class360 != null) {
                        int i_102_ = (i_100_ + (anInt1468 >> 6)) * 64;
                        int i_103_ = (i_101_ + (anInt1469 >> 6)) * 64;
                        for (Class346_Sub3 class346_sub3 = ((Class346_Sub3) class360.method3815((byte) 126)); class346_sub3 != null; class346_sub3 = ((Class346_Sub3) class360.method3809(-24951))) {
                            int i_104_ = (i_102_ + ((Class346_Sub3) class346_sub3).aByte8269 - anInt1468 - anInt1460);
                            int i_105_ = (i_103_ + ((Class346_Sub3) class346_sub3).aByte8265 - anInt1469 - anInt1449);
                            int i_106_ = (i_61_ + i * i_104_ >> 16) + anInt1464;
                            int i_107_ = (i_61_ + i * (i_104_ + 1) >> 16) + anInt1464;
                            int i_108_ = (anInt1456 - (i_62_ + i_60_ * (i_105_ + 1) >> 16));
                            int i_109_ = anInt1456 - (i_62_ + i_60_ * i_105_ >> 16);
                            method1100(var_ha, i_106_, i_108_, i_107_ - i_106_, i_109_ - i_108_, (((Class346_Sub3) class346_sub3).anInt8266), (((Class346_Sub3) class346_sub3).aByte8271) & 0xff, (((Class346_Sub3) class346_sub3).aByte8268), (((Class346_Sub3) class346_sub3).aShortArray8267), (((Class346_Sub3) class346_sub3).aByteArray8270), false);
                        }
                    }
                }
            }
            for (int i_110_ = i_95_; i_110_ <= i_97_; i_110_++) {
                for (int i_111_ = i_96_; i_111_ <= i_98_; i_111_++) {
                    Class360 class360 = aClass360ArrayArrayArray1453[i_99_][i_110_][i_111_];
                    if (class360 != null) {
                        int i_112_ = (i_110_ + (anInt1468 >> 6)) * 64;
                        int i_113_ = (i_111_ + (anInt1469 >> 6)) * 64;
                        for (Class346_Sub3 class346_sub3 = ((Class346_Sub3) class360.method3815((byte) 52)); class346_sub3 != null; class346_sub3 = ((Class346_Sub3) class360.method3809(-24951))) {
                            int i_114_ = (i_112_ + ((Class346_Sub3) class346_sub3).aByte8269 - anInt1468 - anInt1460);
                            int i_115_ = (i_113_ + ((Class346_Sub3) class346_sub3).aByte8265 - anInt1469 - anInt1449);
                            int i_116_ = (i_61_ + i * i_114_ >> 16) + anInt1464;
                            int i_117_ = (i_61_ + i * (i_114_ + 1) >> 16) + anInt1464;
                            int i_118_ = (anInt1456 - (i_62_ + i_60_ * (i_115_ + 1) >> 16));
                            int i_119_ = anInt1456 - (i_62_ + i_60_ * i_115_ >> 16);
                            method1079(var_ha, i_116_, i_118_, i_117_ - i_116_, i_119_ - i_118_, (((Class346_Sub3) class346_sub3).aShortArray8267), (((Class346_Sub3) class346_sub3).aByteArray8270));
                        }
                    }
                }
            }
        }
    }

    private static final int method1090(d var_d, int i, int i_120_, int i_121_) {
        Class145 class145 = aClass144_1433.method1299(i, -52);
        if (class145 == null)
            return 0;
        int i_122_ = ((Class145) class145).anInt1714;
        if (i_122_ >= 0 && ((Class312) var_d.method25(i_122_, (byte) 125)).aBoolean3622)
            i_122_ = -1;
        int i_123_;
        if (((Class145) class145).anInt1712 >= 0) {
            int i_124_ = ((Class145) class145).anInt1712;
            int i_125_ = (i_124_ & 0x7f) + i_121_;
            if (i_125_ < 0)
                i_125_ = 0;
            else if (i_125_ > 127)
                i_125_ = 127;
            int i_126_ = (i_124_ + i_120_ & 0xfc00) + (i_124_ & 0x380) + i_125_;
            i_123_ = (~0xffffff | (Node.anIntArray2801[(Class183.method1615((byte) -104, Class372.method3868(96, (byte) -56, i_126_)) & 0xffff)]));
        } else if (i_122_ >= 0)
            i_123_ = (~0xffffff | (Node.anIntArray2801[(Class183.method1615((byte) -122, Class372.method3868(96, (byte) -56, (((Class312) var_d.method25(i_122_, (byte) 126)).aShort3634)))) & 0xffff]));
        else if (((Class145) class145).anInt1720 == -1)
            i_123_ = 0;
        else {
            int i_127_ = ((Class145) class145).anInt1720;
            int i_128_ = (i_127_ & 0x7f) + i_121_;
            if (i_128_ < 0)
                i_128_ = 0;
            else if (i_128_ > 127)
                i_128_ = 127;
            int i_129_ = (i_127_ + i_120_ & 0xfc00) + (i_127_ & 0x380) + i_128_;
            i_123_ = (~0xffffff | (Node.anIntArray2801[(Class183.method1615((byte) -107, Class372.method3868(96, (byte) -56, i_129_)) & 0xffff)]));
        }
        return i_123_;
    }

    static final void method1091(ha var_ha) {
        int i = anInt1461 - anInt1460;
        int i_130_ = anInt1454 - anInt1449;
        int i_131_ = (anInt1466 - anInt1464 << 16) / i;
        int i_132_ = (anInt1456 - anInt1470 << 16) / i_130_;
        method1089(var_ha, i_131_, i_132_, 0, 0);
    }

    private static final void method1092(ha var_ha, Node_Sub35 class248_sub35, int i, int i_133_, int i_134_, int i_135_) {
        ((Node_Sub35) class248_sub35).anInt7245 = (anInt1464 + (i_134_ + i * (((Node_Sub35) class248_sub35).anInt7252 - anInt1460) >> 16));
        ((Node_Sub35) class248_sub35).anInt7249 = anInt1456 - (i_135_ + i_133_ * (((Node_Sub35) class248_sub35).anInt7246 - anInt1449) >> 16);
    }

    static final void method1093(int i, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
        anInt1460 = i - anInt1468;
        anInt1454 = i_136_ - anInt1469;
        anInt1461 = i_137_ - anInt1468;
        anInt1449 = i_138_ - anInt1469;
        anInt1464 = i_139_;
        anInt1470 = i_140_;
        anInt1466 = i_141_;
        anInt1456 = i_142_;
    }

    static final Node_Sub8_Sub1 method1094(int i) {
        return ((Node_Sub8_Sub1) aClass65_1430.method501((long) i, (byte) 31));
    }

    private static final void method1095(byte[] is, byte[] is_143_, short[] is_144_, int i, int i_145_) {
        int[] is_146_ = new int[anInt1457];
        int[] is_147_ = new int[anInt1457];
        int[] is_148_ = new int[anInt1457];
        int[] is_149_ = new int[anInt1457];
        int[] is_150_ = new int[anInt1457];
        for (int i_151_ = -5; i_151_ < anInt1465; i_151_++) {
            int i_152_ = i_151_ + 5;
            int i_153_ = i_151_ - 5;
            for (int i_154_ = 0; i_154_ < anInt1457; i_154_++) {
                if (i_152_ < anInt1465) {
                    int i_155_ = is[i_152_ + i_154_ * anInt1465] & 0xff;
                    if (i_155_ > 0) {
                        Class130 class130 = aClass192_1432.method1654(i_155_ - 1, false);
                        is_146_[i_154_] += ((Class130) class130).anInt1579;
                        is_147_[i_154_] += ((Class130) class130).anInt1575;
                        is_148_[i_154_] += ((Class130) class130).anInt1588;
                        is_149_[i_154_] += ((Class130) class130).anInt1584;
                        is_150_[i_154_]++;
                    }
                }
                if (i_153_ >= 0) {
                    int i_156_ = is[i_153_ + i_154_ * anInt1465] & 0xff;
                    if (i_156_ > 0) {
                        Class130 class130 = aClass192_1432.method1654(i_156_ - 1, false);
                        is_146_[i_154_] -= ((Class130) class130).anInt1579;
                        is_147_[i_154_] -= ((Class130) class130).anInt1575;
                        is_148_[i_154_] -= ((Class130) class130).anInt1588;
                        is_149_[i_154_] -= ((Class130) class130).anInt1584;
                        is_150_[i_154_]--;
                    }
                }
            }
            if (i_151_ >= 0) {
                int i_157_ = 0;
                int i_158_ = 0;
                int i_159_ = 0;
                int i_160_ = 0;
                int i_161_ = 0;
                for (int i_162_ = -5; i_162_ < anInt1457; i_162_++) {
                    int i_163_ = i_162_ + 5;
                    if (i_163_ < anInt1457) {
                        i_157_ += is_146_[i_163_];
                        i_158_ += is_147_[i_163_];
                        i_159_ += is_148_[i_163_];
                        i_160_ += is_149_[i_163_];
                        i_161_ += is_150_[i_163_];
                    }
                    int i_164_ = i_162_ - 5;
                    if (i_164_ >= 0) {
                        i_157_ -= is_146_[i_164_];
                        i_158_ -= is_147_[i_164_];
                        i_159_ -= is_148_[i_164_];
                        i_160_ -= is_149_[i_164_];
                        i_161_ -= is_150_[i_164_];
                    }
                    if (i_162_ >= 0 && i_161_ > 0) {
                        if ((is[i_151_ + i_162_ * anInt1465] & 0xff) == 0) {
                            int i_165_ = i_151_ + i_162_ * anInt1465;
                            is_143_[i_165_] = (byte) 0;
                            is_144_[i_165_] = (short) 0;
                        } else {
                            int i_166_ = (i_160_ == 0 ? 0 : Class51.method401(i_159_ / i_161_, false, i_157_ * 256 / i_160_, i_158_ / i_161_));
                            int i_167_ = (i_166_ & 0x7f) + i_145_;
                            if (i_167_ < 0)
                                i_167_ = 0;
                            else if (i_167_ > 127)
                                i_167_ = 127;
                            int i_168_ = ((i_166_ + i & 0xfc00) + (i_166_ & 0x380) + i_167_);
                            int i_169_ = i_151_ + i_162_ * anInt1465;
                            int i_170_ = (Node.anIntArray2801[((Class183.method1615((byte) -109, Class131.method1206(-3, i_168_, 96))) & 0xffff)]);
                            is_143_[i_169_] = (byte) (i_170_ >> 16 & 0xff);
                            is_144_[i_169_] = (short) (i_170_ & 0xffff);
                        }
                    }
                }
            }
        }
    }

    static final Class293 method1096(ha var_ha) {
        int i = anInt1461 - anInt1460;
        int i_171_ = anInt1454 - anInt1449;
        int i_172_ = (anInt1466 - anInt1464 << 16) / i;
        int i_173_ = (anInt1456 - anInt1470 << 16) / i_171_;
        return method1087(var_ha, i_172_, i_173_, 0, 0);
    }

    static final void method1097(d var_d, int i, int i_174_) {
        for (int i_175_ = 0; i_175_ < ((Class144) aClass144_1433).anInt1696; i_175_++)
            anIntArray1458[i_175_ + 1] = method1090(var_d, i_175_, i, i_174_);
    }

    static final void method1098(ha var_ha, int i, int i_176_) {
        ByteStream class248_sub9 = (new ByteStream(aClass381_1431.method3908("area", (((Node_Sub8_Sub1) aClass248_Sub8_Sub1_1434).aString8905), (byte) 127)));
        int i_177_ = class248_sub9.readUnsignedByte((byte) -111);
        int[] is = new int[i_177_];
        for (int i_178_ = 0; i_178_ < i_177_; i_178_++)
            is[i_178_] = class248_sub9.readUnsignedByte((byte) -80);
        int i_179_ = class248_sub9.readUnsignedByte((byte) 100);
        int[] is_180_ = new int[i_179_];
        for (int i_181_ = 0; i_181_ < i_179_; i_181_++)
            is_180_[i_181_] = class248_sub9.readUnsignedByte((byte) -73);
        while (((ByteStream) class248_sub9).offset < ((ByteStream) class248_sub9).buffer.length) {
            if (class248_sub9.readUnsignedByte((byte) -60) == 0) {
                int i_182_ = class248_sub9.readUnsignedByte((byte) 104);
                int i_183_ = class248_sub9.readUnsignedByte((byte) 81);
                for (int i_184_ = 0; i_184_ < 64; i_184_++) {
                    for (int i_185_ = 0; i_185_ < 64; i_185_++) {
                        int i_186_ = i_182_ * 64 + i_184_ - anInt1468;
                        int i_187_ = i_183_ * 64 + i_185_ - anInt1469;
                        method1083(var_ha, class248_sub9, i_182_, i_183_, i_186_, i_187_, is, is_180_);
                    }
                }
            } else {
                int i_188_ = class248_sub9.readUnsignedByte((byte) 89);
                int i_189_ = class248_sub9.readUnsignedByte((byte) 110);
                int i_190_ = class248_sub9.readUnsignedByte((byte) -84);
                int i_191_ = class248_sub9.readUnsignedByte((byte) 70);
                for (int i_192_ = 0; i_192_ < 8; i_192_++) {
                    for (int i_193_ = 0; i_193_ < 8; i_193_++) {
                        int i_194_ = i_188_ * 64 + i_190_ * 8 + i_192_ - anInt1468;
                        int i_195_ = i_189_ * 64 + i_191_ * 8 + i_193_ - anInt1469;
                        method1083(var_ha, class248_sub9, i_188_, i_189_, i_194_, i_195_, is, is_180_);
                    }
                }
            }
        }
        Object object = null;
        aByteArray1452 = new byte[anInt1465 * anInt1457];
        aShortArray1455 = new short[anInt1465 * anInt1457];
        for (int i_196_ = 0; i_196_ < 3; i_196_++) {
            byte[] is_197_ = new byte[anInt1465 * anInt1457];
            for (int i_198_ = 0; i_198_ < aClass360ArrayArrayArray1453[i_196_].length; i_198_++) {
                for (int i_199_ = 0; i_199_ < aClass360ArrayArrayArray1453[i_196_][0].length; i_199_++) {
                    Class360 class360 = aClass360ArrayArrayArray1453[i_196_][i_198_][i_199_];
                    if (class360 != null) {
                        for (Class346_Sub3 class346_sub3 = ((Class346_Sub3) class360.method3815((byte) 58)); class346_sub3 != null; class346_sub3 = (Class346_Sub3) class360.method3809(-24951))
                            is_197_[(i_198_ * 64 + (((Class346_Sub3) class346_sub3).aByte8269) + (i_199_ * 64 + (((Class346_Sub3) class346_sub3).aByte8265)) * anInt1465)] = (byte) (((Class346_Sub3) class346_sub3).anInt8266);
                    }
                }
            }
            method1095(is_197_, aByteArray1452, aShortArray1455, i, i_176_);
            for (int i_200_ = 0; i_200_ < aClass360ArrayArrayArray1453[i_196_].length; i_200_++) {
                for (int i_201_ = 0; i_201_ < aClass360ArrayArrayArray1453[i_196_][0].length; i_201_++) {
                    Class360 class360 = aClass360ArrayArrayArray1453[i_196_][i_200_][i_201_];
                    if (class360 != null) {
                        for (Class346_Sub3 class346_sub3 = ((Class346_Sub3) class360.method3815((byte) 117)); class346_sub3 != null; class346_sub3 = ((Class346_Sub3) class360.method3809(-24951))) {
                            int i_202_ = (i_200_ * 64 + ((Class346_Sub3) class346_sub3).aByte8269 + (i_201_ * 64 + (((Class346_Sub3) class346_sub3).aByte8265)) * anInt1465);
                            ((Class346_Sub3) class346_sub3).anInt8266 = ((aByteArray1452[i_202_] & 0xff) << 16 | aShortArray1455[i_202_] & 0xffff);
                            if (((Class346_Sub3) class346_sub3).anInt8266 != 0)
                                ((Class346_Sub3) class346_sub3).anInt8266 |= ~0xffffff;
                        }
                    }
                }
            }
        }
        method1095(aByteArray1459, aByteArray1452, aShortArray1455, i, i_176_);
        aByteArray1459 = null;
        method1082();
    }

    static final void method1099(int i) {
        aClass248_Sub8_Sub1_1434 = (Node_Sub8_Sub1) aClass65_1430.method501((long) i, (byte) 31);
    }

    private static final void method1100(ha var_ha, int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, short[] is, byte[] is_209_, boolean bool) {
        if (bool || i_206_ != 0 || i_207_ > 0) {
            if (i_207_ == 0)
                var_ha.aa(i, i_203_, i_204_, i_205_, i_206_, 0);
            else {
                int i_210_ = i_208_ & 0x3f;
                if (i_210_ == 0 || i_204_ <= 1 || i_205_ <= 1) {
                    int i_211_ = anIntArray1458[i_207_];
                    if (bool || i_211_ != 0)
                        var_ha.aa(i, i_203_, i_204_, i_205_, i_211_, 0);
                } else {
                    int i_212_ = bool ? 0 : 1;
                    Class44_Sub1.method319(i_212_, anIntArray1458[i_207_], var_ha, i_210_, aByteArrayArrayArray1442, i_208_ >> 6 & 0x3, -18954, i_203_, i_204_, i_205_, i, anInt1446, i_206_);
                }
            }
        }
        if (is != null) {
            int i_213_;
            if (i_204_ == 1)
                i_213_ = i;
            else
                i_213_ = i + i_204_ - 1;
            int i_214_;
            if (i_205_ == 1)
                i_214_ = i_203_;
            else
                i_214_ = i_203_ + i_205_ - 1;
            for (int i_215_ = 0; i_215_ < is.length; i_215_++) {
                int i_216_ = is_209_[i_215_] & 0x3f;
                if (i_216_ == 0 || i_216_ == 2 || i_216_ == 3 || i_216_ == 9) {
                    ObjectDefinition class266 = aClass368_1437.method3838((byte) -125, is[i_215_] & 0xffff);
                    if (((ObjectDefinition) class266).anInt3036 == -1) {
                        int i_217_ = -3355444;
                        if (((ObjectDefinition) class266).anInt3105 == 1)
                            i_217_ = -3407872;
                        int i_218_ = is_209_[i_215_] >> 6 & 0x3;
                        if (i_216_ == 0) {
                            if (i_218_ == 0)
                                var_ha.P(i, i_203_, i_205_, i_217_, 0);
                            else if (i_218_ == 1)
                                var_ha.U(i, i_203_, i_204_, i_217_, 0);
                            else if (i_218_ == 2)
                                var_ha.P(i_213_, i_203_, i_205_, i_217_, 0);
                            else
                                var_ha.U(i, i_214_, i_204_, i_217_, 0);
                        } else if (i_216_ == 2) {
                            if (i_218_ == 0) {
                                var_ha.P(i, i_203_, i_205_, -1, 0);
                                var_ha.U(i, i_203_, i_204_, i_217_, 0);
                            } else if (i_218_ == 1) {
                                var_ha.P(i_213_, i_203_, i_205_, -1, 0);
                                var_ha.U(i, i_203_, i_204_, i_217_, 0);
                            } else if (i_218_ == 2) {
                                var_ha.P(i_213_, i_203_, i_205_, -1, 0);
                                var_ha.U(i, i_214_, i_204_, i_217_, 0);
                            } else {
                                var_ha.P(i, i_203_, i_205_, -1, 0);
                                var_ha.U(i, i_214_, i_204_, i_217_, 0);
                            }
                        } else if (i_216_ == 3) {
                            if (i_218_ == 0)
                                var_ha.U(i, i_203_, 1, i_217_, 0);
                            else if (i_218_ == 1)
                                var_ha.U(i_213_, i_203_, 1, i_217_, 0);
                            else if (i_218_ == 2)
                                var_ha.U(i_213_, i_214_, 1, i_217_, 0);
                            else
                                var_ha.U(i, i_214_, 1, i_217_, 0);
                        } else if (i_216_ == 9) {
                            if (i_218_ == 0 || i_218_ == 2) {
                                for (int i_219_ = 0; i_219_ < i_205_; i_219_++)
                                    var_ha.U(i + i_219_, i_214_ - i_219_, 1, i_217_, 0);
                            } else {
                                for (int i_220_ = 0; i_220_ < i_205_; i_220_++)
                                    var_ha.U(i + i_220_, i_203_ + i_220_, 1, i_217_, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method1101() {
        int[] is = new int[3];
        for (int i = 0; i < ((Class380) aClass380_1444).anInt4643; i++) {
            boolean bool = (aClass248_Sub8_Sub1_1434.method2031(is, (((Class380) aClass380_1444).anIntArray4644[i] >> 14 & 0x3fff), ((Class380) aClass380_1444).anIntArray4644[i] & 0x3fff, ((Class380) aClass380_1444).anIntArray4644[i] >> 28 & 0x3, 0));
            if (bool) {
                Node_Sub35 class248_sub35 = new Node_Sub35(((Class380) aClass380_1444).anIntArray4646[i]);
                ((Node_Sub35) class248_sub35).anInt7252 = is[1] - anInt1468;
                ((Node_Sub35) class248_sub35).anInt7246 = is[2] - anInt1469;
                aClass293_1443.method3109(class248_sub35, -127);
            }
        }
    }

    static {
        aShortArray1439 = new short[1];
        anInt1440 = (int) (Math.random() * 11.0) - 5;
        aByteArray1441 = new byte[1];
        aClass293_1443 = new Class293();
    }
}
