/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class227 {
    static int anInt2550;
    private int anInt2551;
    static int anInt2552;
    private int anInt2553;
    static int anInt2554;
    private Node_Sub29[] aClass248_Sub29Array2555;
    private Class293 aClass293_2556;
    private int anInt2557;
    static int anInt2558;
    private int anInt2559 = 0;
    static int anInt2560;
    private int[][] anIntArrayArray2561;
    static int anInt2562;
    static Class31 aClass31_2563 = new Class31();
    boolean aBoolean2564;
    static int anInt2565;

    final int[] method1818(int i, boolean bool) {
        if (bool != true)
            anInt2553 = -7;
        anInt2560++;
        if (anInt2551 == anInt2553) {
            ((Class227) this).aBoolean2564 = aClass248_Sub29Array2555[i] == null;
            aClass248_Sub29Array2555[i] = Class205.aClass248_Sub29_2384;
            return anIntArrayArray2561[i];
        }
        if ((anInt2553 ^ 0xffffffff) != -2) {
            Node_Sub29 class248_sub29 = aClass248_Sub29Array2555[i];
            if (class248_sub29 != null)
                ((Class227) this).aBoolean2564 = false;
            else {
                ((Class227) this).aBoolean2564 = true;
                if ((anInt2553 ^ 0xffffffff) >= (anInt2559 ^ 0xffffffff)) {
                    Node_Sub29 class248_sub29_0_ = (Node_Sub29) aClass293_2556.method3110(0);
                    class248_sub29 = new Node_Sub29(i, ((Node_Sub29) class248_sub29_0_).anInt7173);
                    aClass248_Sub29Array2555[((Node_Sub29) class248_sub29_0_).anInt7171] = null;
                    class248_sub29_0_.remove(true);
                } else {
                    class248_sub29 = new Node_Sub29(i, anInt2559);
                    anInt2559++;
                }
                aClass248_Sub29Array2555[i] = class248_sub29;
            }
            aClass293_2556.method3111(class248_sub29, 593);
            return (anIntArrayArray2561[((Node_Sub29) class248_sub29).anInt7173]);
        }
        ((Class227) this).aBoolean2564 = (anInt2557 ^ 0xffffffff) != (i ^ 0xffffffff);
        anInt2557 = i;
        return anIntArrayArray2561[0];
    }

    final int[][] method1819(byte i) {
        int i_1_ = -46 % ((i - 42) / 35);
        anInt2558++;
        if ((anInt2553 ^ 0xffffffff) != (anInt2551 ^ 0xffffffff))
            throw new RuntimeException("Can only retrieve a full image cache");
        for (int i_2_ = 0; i_2_ < anInt2553; i_2_++)
            aClass248_Sub29Array2555[i_2_] = Class205.aClass248_Sub29_2384;
        return anIntArrayArray2561;
    }

    final void method1820(byte i) {
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (anInt2553 ^ 0xffffffff); i_3_++)
            anIntArrayArray2561[i_3_] = null;
        anInt2552++;
        aClass248_Sub29Array2555 = null;
        anIntArrayArray2561 = null;
        aClass293_2556.method3121(10);
        aClass293_2556 = null;
        int i_4_ = -102 / ((i - 38) / 44);
    }

    static final void method1821(ha var_ha, byte i) {
        anInt2550++;
        int i_5_ = 0;
        if (i <= -31) {
            int i_6_ = 0;
            if (Node_Sub8_Sub6.aBoolean8949) {
                i_5_ = Class337.method3420(-2);
                i_6_ = RSInterface2.method3770((byte) -119);
            }
            int i_7_ = -10660793;
            r_Sub2.method2120(Class346_Sub10.anInt8354 - -i_6_, Class346_Sub2.anInt8261, -16777216, i_7_, Class198.anInt2264, Class239.anInt2654 - -i_5_, false, var_ha);
            Node_Sub14_Sub27.aClass48_9449.method369(true, Class239.anInt2654 + (i_5_ - -3), Class41.aClass41_490.method301(Class191.anInt4822, (byte) -108), 14 + Class346_Sub10.anInt8354 - -i_6_, -1, i_7_);
            int i_8_ = i_5_ + Class46.aClass269_600.method2817((byte) -90);
            int i_9_ = i_6_ + Class46.aClass269_600.method2809(102);
            if (Class342.aBoolean4008) {
                int i_10_ = 0;
                for (Node_Sub8_Sub5 class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method492(896)); class248_sub8_sub5 != null; class248_sub8_sub5 = ((Node_Sub8_Sub5) Class363.aClass64_4478.method490(true))) {
                    int i_11_ = 16 * i_10_ + 31 + (i_6_ + Class346_Sub10.anInt8354);
                    i_10_++;
                    if ((((Node_Sub8_Sub5) class248_sub8_sub5).anInt8937 ^ 0xffffffff) == -2)
                        aa.method149(Class198.anInt2264, i_11_, i_5_ + Class239.anInt2654, var_ha, -1, -256, (byte) 96, ((Node_Sub8_Sub11) (((Node_Sub8) (((Class64) (((Node_Sub8_Sub5) class248_sub8_sub5).aClass64_8936)).aClass248_Sub8_856)).aClass248_Sub8_6871)), i_9_, Class346_Sub2.anInt8261, i_8_, Class346_Sub10.anInt8354 + i_6_);
                    else
                        Class341.method3479(-256, Class346_Sub2.anInt8261, var_ha, Class198.anInt2264, Class346_Sub10.anInt8354 + i_6_, -1, i_11_, i_8_, i_9_, class248_sub8_sub5, 13, Class239.anInt2654 - -i_5_);
                }
                if (Class276.aClass248_Sub8_Sub5_3209 != null) {
                    r_Sub2.method2120(Class54_Sub3.anInt5344, Class316_Sub2.anInt8053, -16777216, i_7_, Class155.anInt1837, Class203.anInt2314, false, var_ha);
                    i_10_ = 0;
                    Node_Sub14_Sub27.aClass48_9449.method369(true, Class203.anInt2314 - -3, ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aString8934, Class54_Sub3.anInt5344 + 14, -1, i_7_);
                    for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936.method492(896)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) ((Node_Sub8_Sub5) Class276.aClass248_Sub8_Sub5_3209).aClass64_8936.method490(true))) {
                        int i_12_ = 16 * i_10_ + 31 + Class54_Sub3.anInt5344;
                        i_10_++;
                        aa.method149(Class155.anInt1837, i_12_, Class203.anInt2314, var_ha, -1, -256, (byte) 24, class248_sub8_sub11, i_9_, Class316_Sub2.anInt8053, i_8_, Class54_Sub3.anInt5344);
                    }
                    Interactable.method3564(Class54_Sub3.anInt5344, Class203.anInt2314, Class316_Sub2.anInt8053, false, Class155.anInt1837);
                }
            } else {
                int i_13_ = 0;
                for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(-127))) {
                    int i_14_ = (16 * (-1 + Class379.anInt4638 - i_13_) + 31 + Class346_Sub10.anInt8354 + i_6_);
                    i_13_++;
                    aa.method149(Class198.anInt2264, i_14_, Class239.anInt2654 - -i_5_, var_ha, -1, -256, (byte) 80, class248_sub8_sub11, i_9_, Class346_Sub2.anInt8261, i_8_, Class346_Sub10.anInt8354 + i_6_);
                }
            }
            Interactable.method3564(i_6_ + Class346_Sub10.anInt8354, Class239.anInt2654 + i_5_, Class346_Sub2.anInt8261, false, Class198.anInt2264);
        }
    }

    static final Class225_Sub1_Sub1 method1822(ByteStream class248_sub9, int i) {
        if (i != 28053)
            anInt2565 = 34;
        anInt2562++;
        Class225_Sub1 class225_sub1 = NPC.method3662(class248_sub9, true);
        int i_15_ = class248_sub9.readUnsignedShort((byte) -10);
        return (new Class225_Sub1_Sub1(((Class225) class225_sub1).aClass186_4993, ((Class225) class225_sub1).aClass272_4994, ((Class225) class225_sub1).anInt4992, ((Class225) class225_sub1).anInt4999, ((Class225) class225_sub1).anInt5000, ((Class225) class225_sub1).anInt5002, ((Class225) class225_sub1).anInt4997, ((Class225) class225_sub1).anInt5001, ((Class225) class225_sub1).anInt4995, ((Class225_Sub1) class225_sub1).anInt8459, ((Class225_Sub1) class225_sub1).anInt8461, ((Class225_Sub1) class225_sub1).anInt8455, ((Class225_Sub1) class225_sub1).anInt8462, ((Class225_Sub1) class225_sub1).anInt8453, ((Class225_Sub1) class225_sub1).anInt8452, i_15_));
    }

    static final void method1823() {
        for (int i = Class118.anInt1482; i < Class111_Sub1.anInt5531; i++) {
            for (int i_16_ = 0; i_16_ < Class225_Sub1.anInt8454; i_16_++) {
                for (int i_17_ = 0; i_17_ < Class89.anInt1106; i_17_++) {
                    Class137 class137 = (Class311.aClass137ArrayArrayArray3620[i][i_16_][i_17_]);
                    if (class137 != null) {
                        Class346_Sub7_Sub5 class346_sub7_sub5 = ((Class137) class137).aClass346_Sub7_Sub5_1636;
                        Class346_Sub7_Sub5 class346_sub7_sub5_18_ = ((Class137) class137).aClass346_Sub7_Sub5_1646;
                        if (class346_sub7_sub5 != null && class346_sub7_sub5.method3568(-38)) {
                            Class241.method1928(class346_sub7_sub5, i, i_16_, i_17_, 1, 1);
                            if (class346_sub7_sub5_18_ != null && class346_sub7_sub5_18_.method3568(-31)) {
                                Class241.method1928(class346_sub7_sub5_18_, i, i_16_, i_17_, 1, 1);
                                class346_sub7_sub5_18_.method3572(class346_sub7_sub5, r.aHa9032, 0, 117, 0, false, 0);
                                class346_sub7_sub5_18_.method3577(131072);
                            }
                            class346_sub7_sub5.method3577(131072);
                        }
                        for (Class49 class49 = ((Class137) class137).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                            Animable animable = ((Class49) class49).aAnimable_656;
                            if (animable != null && animable.method3568(103)) {
                                Class241.method1928(animable, i, i_16_, i_17_, ((((Animable) animable).x2) - (((Animable) animable).x1) + 1), ((((Animable) animable).y2) - (((Animable) animable).y1) + 1));
                                animable.method3577(131072);
                            }
                        }
                        Class346_Sub7_Sub4 class346_sub7_sub4 = ((Class137) class137).aClass346_Sub7_Sub4_1645;
                        if (class346_sub7_sub4 != null && class346_sub7_sub4.method3568(119)) {
                            Class301_Sub3_Sub1.method3197(class346_sub7_sub4, i, i_16_, i_17_);
                            class346_sub7_sub4.method3577(131072);
                        }
                    }
                }
            }
        }
    }

    static final Class54_Sub2 method1824(byte i, ByteStream class248_sub9) {
        int i_19_ = -29 / ((42 - i) / 40);
        anInt2554++;
        return new Class54_Sub2(class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.readUnsignedShort((byte) -10), class248_sub9.method2221(255), class248_sub9.method2221(255), class248_sub9.readUnsignedByte((byte) 115));
    }

    public static void method1825(int i) {
        aClass31_2563 = null;
        int i_20_ = 19 / ((40 - i) / 43);
    }

    Class227(int i, int i_21_, int i_22_) {
        anInt2557 = -1;
        aClass293_2556 = new Class293();
        ((Class227) this).aBoolean2564 = false;
        anInt2553 = i;
        anInt2551 = i_21_;
        aClass248_Sub29Array2555 = new Node_Sub29[anInt2551];
        anIntArrayArray2561 = new int[anInt2553][i_22_];
    }
}
