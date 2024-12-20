/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IncommingOpcode {
    static int anInt1471;
    private int opcode;
    static int anInt1473;
    static int anInt1474;
    static int anInt1475;
    static int anInt1476;
    int size;
    static int anInt1478;
    static int[][] anIntArrayArray1479 = {{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};

    public static void method1105(int i) {
        if (i >= 112)
            anIntArrayArray1479 = null;
    }

    static final void method1106(int i, boolean bool) {
        anInt1471++;
        if ((aa.aString104.length() ^ 0xffffffff) != -1) {
            Class106.method750("--> " + aa.aString104, (byte) 126);
            Node_Sub38.method2596(false, false, bool, aa.aString104);
            Node_Sub19.anInt7040 = 0;
            if (i != 1354797057)
                method1106(56, false);
            aa.aString104 = "";
            Node_Sub14_Sub15.anInt9324 = 0;
        }
    }

    public final String toString() {
        anInt1476++;
        throw new IllegalStateException();
    }

    final int getOpcode() {
        return opcode;
    }

    static final void method1108(int i, int i_0_) {
        anInt1474++;
        Class346_Sub7_Sub1.anInt9908 = i_0_;
        synchronized (Node_Sub14_Sub15.aClass278_9325) {
            if (i <= 114)
                return;
            Node_Sub14_Sub15.aClass278_9325.method2872((byte) -78);
        }
        synchronized (Node_Sub14_Sub2.aClass278_9175) {
            Node_Sub14_Sub2.aClass278_9175.method2872((byte) -78);
        }
    }

    static final void method1109(ha var_ha, int i, int i_1_) {
        anInt1473++;
        if (!Class346.aBoolean4120 || !WorldAddress.aBoolean1189)
            Class300.anInt3496 = 0;
        else {
            if (Class349_Sub2.aBoolean4724)
                Class133.aLong5035 = Class282_Sub2.aClass161_7608.method1416(24111);
            Class346_Sub5.anInt8278 = 0;
            Class69.anInt915 = 0;
            Class255.anInt2925 = 0;
            int[] is = var_ha.Y();
            Class226_Sub2_Sub1.anInt8808 = (int) ((float) is[2] / 3.0F);
            Class146.anInt1728 = (int) ((float) is[3] / 3.0F);
            var_ha.a(r_Sub2.anIntArray10283);
            if (Class312.anInt3644 != (int) ((float) r_Sub2.anIntArray10283[0] / 3.0F) || Class64.anInt868 != (int) ((float) r_Sub2.anIntArray10283[1] / 3.0F)) {
                Class312.anInt3644 = (int) ((float) r_Sub2.anIntArray10283[0] / 3.0F);
                Class64.anInt868 = (int) ((float) r_Sub2.anIntArray10283[1] / 3.0F);
                Class162_Sub2.anInt6470 = Class312.anInt3644 >> 1842280449;
                Class103.anIntArray1317 = new int[Class64.anInt868 * Class312.anInt3644];
                Node_Sub14_Sub10.anInt9249 = Class64.anInt868 >> 1354797057;
            }
            Node_Sub48.aViewport_7431 = var_ha.t();
            Class300.anInt3496 = 0;
            for (int i_2_ = i_1_; i_2_ < Node_Sub41.anInt7287; i_2_++)
                Node_Sub8_Sub1.method2030(Class127.aClass2Array1566[i_2_], i, true, var_ha);
            for (int i_3_ = 0; i_3_ < Class164.anInt1937; i_3_++)
                Node_Sub8_Sub1.method2030(Class183.aClass2Array2137[i_3_], i, true, var_ha);
            for (int i_4_ = 0; i_4_ < Player.anInt10584; i_4_++)
                Node_Sub8_Sub1.method2030(Class135.aClass2Array1634[i_4_], i, true, var_ha);
            Class346_Sub7_Sub4_Sub2.anInt10163 = 0;
            if ((Class300.anInt3496 ^ 0xffffffff) < -1) {
                int i_5_ = Class103.anIntArray1317.length;
                int i_6_ = -i_5_ + i_5_ & 0x7;
                int i_7_ = 0;
                while (i_7_ < i_6_) {
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                }
                while (i_7_ < i_5_)
                    Class103.anIntArray1317[i_7_++] = 2147483647;
                Class180.anInt2093 = 1;
                for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class300.anInt3496 ^ 0xffffffff); i_8_++) {
                    Class2 class2 = Node_Sub14_Sub14.aClass2Array9305[i_8_];
                    aa_Sub1.method159(((Class2) class2).aShortArray119[1], ((Class2) class2).aShortArray128[1], ((Class2) class2).aShortArray114[0], -13221, ((Class2) class2).aShortArray128[0], ((Class2) class2).aShortArray128[3], ((Class2) class2).aShortArray114[3], ((Class2) class2).aShortArray114[1], ((Class2) class2).aShortArray119[0], ((Class2) class2).aShortArray119[3]);
                    aa_Sub1.method159(((Class2) class2).aShortArray119[2], ((Class2) class2).aShortArray128[2], ((Class2) class2).aShortArray114[1], -13221, ((Class2) class2).aShortArray128[1], ((Class2) class2).aShortArray128[3], ((Class2) class2).aShortArray114[3], ((Class2) class2).aShortArray114[2], ((Class2) class2).aShortArray119[1], ((Class2) class2).aShortArray119[3]);
                }
                Class180.anInt2093 = 2;
            }
            if (Class349_Sub2.aBoolean4724)
                Node_Sub14_Sub33.aLong9516 = (Class282_Sub2.aClass161_7608.method1416(24111) - Class133.aLong5035);
        }
    }

    IncommingOpcode(int i, int i_9_) {
        ((IncommingOpcode) this).size = i_9_;
        opcode = i;
    }

    static {
        anInt1478 = 0;
    }
}
