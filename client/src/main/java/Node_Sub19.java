/* Class248_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub19 extends Node {
    static boolean aBoolean7030;
    static int anInt7031;
    static OutgoingOpcode aOutgoingOpcode_7032 = new OutgoingOpcode(32, 3);
    boolean[] aBooleanArray7033;
    int anInt7034;
    int[][] anIntArrayArray7035;
    static int anInt7036;
    int anInt7037;
    static int anInt7038;
    static String[] aStringArray7039 = new String[200];
    static int anInt7040 = 0;
    int[] anIntArray7041;
    static int anInt7042;
    int[] anIntArray7043;

    static final Class346_Sub7_Sub1 method2517(int i, int i_0_, int i_1_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[i][i_0_][i_1_];
        if (class137 == null)
            return null;
        return ((Class137) class137).aClass346_Sub7_Sub1_1644;
    }

    static final void method2518(Class285 class285, Class48 class48, ha var_ha, byte i, boolean bool, String string) {
        anInt7042++;
        boolean bool_2_ = !Class27.aBoolean366 || Class249.method2699((byte) -54);
        if (bool_2_) {
            if (!Class27.aBoolean366 || !bool_2_) {
                int i_3_ = class285.method3070(string, -122, null, 250);
                int i_4_ = 13 * class285.method3066(string, (byte) -46, null, 250);
                int i_5_ = 4;
                int i_6_ = 6 - -i_5_;
                int i_7_ = i_5_ + 6;
                var_ha.aa(-i_5_ + i_6_, -i_5_ + i_7_, i_3_ - -i_5_ + i_5_, i_5_ + (i_4_ - -i_5_), -16777216, 0);
                var_ha.c(-i_5_ + i_6_, -i_5_ + i_7_, i_5_ + i_5_ + i_3_, i_5_ + (i_4_ - -i_5_), -1, 0);
                class48.method370(i_7_, 1, null, string, 0, null, -1, i_6_, i_4_, -1, 0, 0, null, 0, 1, i_3_);
                Class54_Sub2.method435(i_5_ + (i_4_ - -i_5_), i_6_ + -i_5_, -64, -i_5_ + i_7_, i_3_ - (-i_5_ + -i_5_));
            } else {
                class285 = Class13.aClass285_260;
                class48 = var_ha.a(class285, Class32.aClass157Array388, true);
                int i_8_ = class285.method3070(string, -121, null, 250);
                int i_9_ = class285.method3065(i ^ 0x1a, string, 250, null, ((Class285) class285).anInt3365);
                int i_10_ = ((Class157) Class317.aClass157_3668).anInt1873;
                int i_11_ = 4 + i_10_;
                i_8_ += i_11_ * 2;
                i_9_ += i_11_ * 2;
                if ((Node_Sub8_Sub16.anInt9051 ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
                    i_8_ = Node_Sub8_Sub16.anInt9051;
                if ((Class77.anInt985 ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
                    i_9_ = Class77.anInt985;
                int i_12_ = (Class346_Sub7_Sub2_Sub2.aClass186_10353.method1628(i_8_, 0, Class226_Sub1.anInt6661) + Class245.anInt2750);
                int i_13_ = (Class282_Sub21.aClass272_7813.method2838((byte) -87, s_Sub2.anInt7946, i_9_) - -Node_Sub14_Sub12.anInt9264);
                if (Node_Sub8_Sub6.aBoolean8949) {
                    i_12_ += Class337.method3420(-2);
                    i_13_ += RSInterface2.method3770((byte) -81);
                }
                var_ha.a(Class304.aClass157_3534, false).method1180(((Class157) Class352.aClass157_4181).anInt1873 + i_12_, i_13_ - -((Class157) Class352.aClass157_4181).anInt1874, i_8_ + -(((Class157) Class352.aClass157_4181).anInt1873 * 2), (i_9_ + -(2 * ((Class157) Class352.aClass157_4181).anInt1874)), 1, 0, 0);
                var_ha.a(Class352.aClass157_4181, true).method1168(i_12_, i_13_);
                Class352.aClass157_4181.method1389();
                var_ha.a(Class352.aClass157_4181, true).method1168(i_8_ + i_12_ + -i_10_, i_13_);
                Class352.aClass157_4181.method1378();
                var_ha.a(Class352.aClass157_4181, true).method1168(i_8_ + i_12_ - i_10_, -i_10_ + (i_9_ + i_13_));
                Class352.aClass157_4181.method1389();
                var_ha.a(Class352.aClass157_4181, true).method1168(i_12_, -i_10_ + (i_13_ + i_9_));
                Class352.aClass157_4181.method1378();
                var_ha.a(Class317.aClass157_3668, true).method1182(i_12_, ((Class157) Class352.aClass157_4181).anInt1874 + i_13_, i_10_, (i_9_ - ((Class157) Class352.aClass157_4181).anInt1874 * 2));
                Class317.aClass157_3668.method1383();
                var_ha.a(Class317.aClass157_3668, true).method1182(i_12_ - -((Class157) Class352.aClass157_4181).anInt1873, i_13_, (-(((Class157) Class352.aClass157_4181).anInt1873 * 2) + i_8_), i_10_);
                Class317.aClass157_3668.method1383();
                var_ha.a(Class317.aClass157_3668, true).method1182(-i_10_ + (i_8_ + i_12_), ((Class157) Class352.aClass157_4181).anInt1874 + i_13_, i_10_, (-(((Class157) Class352.aClass157_4181).anInt1874 * 2) + i_9_));
                Class317.aClass157_3668.method1383();
                var_ha.a(Class317.aClass157_3668, true).method1182(i_12_ - -((Class157) Class352.aClass157_4181).anInt1873, i_13_ - -i_9_ + -i_10_, (-(2 * ((Class157) Class352.aClass157_4181).anInt1873) + i_8_), i_10_);
                Class317.aClass157_3668.method1383();
                class48.method370(i_13_ - -i_11_, 1, null, string, 0, null, ~0xffffff | Class182.anInt2106, i_11_ + i_12_, -(2 * i_11_) + i_9_, -1, 0, 0, null, 0, 1, i_8_ - i_11_ * 2);
                Class54_Sub2.method435(i_9_, i_12_, -86, i_13_, i_8_);
            }
            if (i == -27) {
                do {
                    if (bool) {
                        try {
                            if (Node_Sub8_Sub6.aBoolean8949)
                                Class247.method1963((byte) 56);
                            else
                                var_ha.method821(5);
                        } catch (Exception_Sub1 exception_sub1) {
                            break;
                        }
                        break;
                    }
                } while (false);
            }
        }
    }

    static final void method2519(int i, int i_14_) {
        Class7.anInt161 = i_14_;
        anInt7036++;
        synchronized (Class340.aClass278_3953) {
            Class340.aClass278_3953.method2872((byte) -78);
            if (i != -15286)
                anInt7038 = -118;
        }
    }

    public static void method2520(boolean bool) {
        aStringArray7039 = null;
        if (bool != false)
            aBoolean7030 = true;
        aOutgoingOpcode_7032 = null;
    }

    Node_Sub19(int i, byte[] is) {
        ((Node_Sub19) this).anInt7037 = i;
        ByteStream class248_sub9 = new ByteStream(is);
        ((Node_Sub19) this).anInt7034 = class248_sub9.readUnsignedByte((byte) -17);
        ((Node_Sub19) this).anIntArray7041 = new int[((Node_Sub19) this).anInt7034];
        ((Node_Sub19) this).aBooleanArray7033 = new boolean[((Node_Sub19) this).anInt7034];
        ((Node_Sub19) this).anIntArray7043 = new int[((Node_Sub19) this).anInt7034];
        ((Node_Sub19) this).anIntArrayArray7035 = new int[((Node_Sub19) this).anInt7034][];
        for (int i_15_ = 0; ((((Node_Sub19) this).anInt7034 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++) {
            ((Node_Sub19) this).anIntArray7043[i_15_] = class248_sub9.readUnsignedByte((byte) 87);
            if ((((Node_Sub19) this).anIntArray7043[i_15_] ^ 0xffffffff) == -7)
                ((Node_Sub19) this).anIntArray7043[i_15_] = 2;
        }
        for (int i_16_ = 0; i_16_ < ((Node_Sub19) this).anInt7034; i_16_++)
            ((Node_Sub19) this).aBooleanArray7033[i_16_] = (class248_sub9.readUnsignedByte((byte) 106) ^ 0xffffffff) == -2;
        for (int i_17_ = 0; i_17_ < ((Node_Sub19) this).anInt7034; i_17_++)
            ((Node_Sub19) this).anIntArray7041[i_17_] = class248_sub9.readShort(-1);
        for (int i_18_ = 0; ((Node_Sub19) this).anInt7034 > i_18_; i_18_++)
            ((Node_Sub19) this).anIntArrayArray7035[i_18_] = new int[class248_sub9.readUnsignedByte((byte) -63)];
        for (int i_19_ = 0; i_19_ < ((Node_Sub19) this).anInt7034; i_19_++) {
            for (int i_20_ = 0; ((((Node_Sub19) this).anIntArrayArray7035[i_19_].length ^ 0xffffffff) < (i_20_ ^ 0xffffffff)); i_20_++)
                ((Node_Sub19) this).anIntArrayArray7035[i_19_][i_20_] = class248_sub9.readUnsignedByte((byte) 104);
        }
    }
}
