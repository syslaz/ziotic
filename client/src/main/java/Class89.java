/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89 {
    static int anInt1089;
    int anInt1090;
    static int anInt1091;
    static int anInt1092;
    int anInt1093;
    private Class228 aClass228_1094;
    static int anInt1095;
    private int anInt1096;
    static Class89 aClass89_1097 = new Class89(0, 3, Class228.aClass228_2577);
    static Class89 aClass89_1098 = new Class89(1, 3, Class228.aClass228_2577);
    static Class89 aClass89_1099 = new Class89(2, 4, Class228.aClass228_2573);
    static Class89 aClass89_1100 = new Class89(3, 1, Class228.aClass228_2577);
    static Class89 aClass89_1101 = new Class89(4, 2, Class228.aClass228_2577);
    static Class89 aClass89_1102 = new Class89(5, 3, Class228.aClass228_2577);
    static Class89 aClass89_1103 = new Class89(6, 4, Class228.aClass228_2577);
    static int anInt1104 = Class241.method1930(127, 16);
    static IncommingOpcode aIncommingOpcode_1105 = new IncommingOpcode(100, -1);
    static int anInt1106;
    static int anInt1107;

    public final String toString() {
        anInt1092++;
        throw new IllegalStateException();
    }

    public static void method667(int i) {
        if (i < 112)
            method669((byte) -27, 71, 91, -53, null);
        aIncommingOpcode_1105 = null;
        aClass89_1099 = null;
        aClass89_1103 = null;
        aClass89_1098 = null;
        aClass89_1100 = null;
        aClass89_1101 = null;
        aClass89_1102 = null;
        aClass89_1097 = null;
    }

    static final float method668(byte i, float f, int i_0_, float f_1_, float f_2_) {
        if (i >= -51)
            return 0.6021956F;
        anInt1091++;
        float[] fs = Node_Sub46.aFloatArrayArray7370[i_0_];
        return fs[0] * f + fs[1] * f_1_ + f_2_ * fs[2];
    }

    private Class89(int i, int i_3_, Class228 class228) {
        aClass228_1094 = class228;
        ((Class89) this).anInt1090 = i;
        anInt1096 = i_3_;
        ((Class89) this).anInt1093 = anInt1096 * ((Class228) aClass228_1094).anInt2570;
        if ((((Class89) this).anInt1090 ^ 0xffffffff) <= -17)
            throw new RuntimeException();
    }

    static final void method669(byte i, int i_4_, int i_5_, int i_6_, Player player) {
        anInt1095++;
        int i_7_ = (((Entity) player).posQueueX[0]);
        int i_8_ = (((Entity) player).posQueueY[0]);
        int i_9_ = 111 % ((15 - i_4_) / 38);
        if (i_7_ >= 0 && Node_Sub8_Sub4.anInt8360 > i_7_ && (i_8_ ^ 0xffffffff) <= -1 && Node_Sub22.anInt7074 > i_8_ && ((i_6_ ^ 0xffffffff) <= -1 && (Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (i_6_ ^ 0xffffffff) && (i_5_ ^ 0xffffffff) <= -1 && (i_5_ ^ 0xffffffff) > (Node_Sub22.anInt7074 ^ 0xffffffff))) {
            int i_10_ = (Node_Sub8_Sub18.method2144(0, i_7_, (Class182.aClass164Array2114[(((Interactable) player).plane)]), i_8_, player.method3632(-1), Class115.anIntArray4954, true, 0, 0, 28002, i_5_, 0, Class193.anIntArray2218, i_6_, -4));
            if ((i_10_ ^ 0xffffffff) <= -2 && (i_10_ ^ 0xffffffff) >= -4) {
                for (int i_11_ = 0; -1 + i_10_ > i_11_; i_11_++)
                    player.method3649(i, true, Class193.anIntArray2218[i_11_], Class115.anIntArray4954[i_11_]);
            }
        }
    }

    static final Class89 method670(int i, byte i_12_) {
        anInt1089++;
        int i_13_ = i;
        while_67_:
        do {
            while_66_:
            do {
                while_65_:
                do {
                    while_64_:
                    do {
                        while_63_:
                        do {
                            do {
                                if ((i_13_ ^ 0xffffffff) != -1) {
                                    if ((i_13_ ^ 0xffffffff) != -2) {
                                        if ((i_13_ ^ 0xffffffff) != -3) {
                                            if (i_13_ != 3) {
                                                if ((i_13_ ^ 0xffffffff) != -5) {
                                                    if ((i_13_ ^ 0xffffffff) != -6) {
                                                        if (i_13_ == 6)
                                                            break while_66_;
                                                        break while_67_;
                                                    }
                                                } else
                                                    break while_64_;
                                                break while_65_;
                                            }
                                        } else
                                            break;
                                        break while_63_;
                                    }
                                } else
                                    return aClass89_1097;
                                return aClass89_1098;
                            } while (false);
                            return aClass89_1099;
                        } while (false);
                        return aClass89_1100;
                    } while (false);
                    return aClass89_1101;
                } while (false);
                return aClass89_1102;
            } while (false);
            return aClass89_1103;
        } while (false);
        if (i_12_ < 57)
            method667(45);
        return null;
    }
}
