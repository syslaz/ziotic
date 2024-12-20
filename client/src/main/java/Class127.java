/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127 {
    static int anInt1561;
    private int[] anIntArray1562;
    static int anInt1563;
    static int anInt1564;
    static int cameraPitch;
    static Class2[] aClass2Array1566;

    final int method1156(byte i, int i_0_) {
        if (i <= 104)
            return 45;
        anInt1561++;
        int i_1_ = (anIntArray1562.length >> 891543169) - 1;
        int i_2_ = i_1_ & i_0_;
        for (; ; ) {
            int i_3_ = anIntArray1562[i_2_ - (-i_2_ - 1)];
            if ((i_3_ ^ 0xffffffff) == 0)
                return -1;
            if ((i_0_ ^ 0xffffffff) == (anIntArray1562[i_2_ - -i_2_] ^ 0xffffffff))
                return i_3_;
            i_2_ = 1 + i_2_ & i_1_;
        }
    }

    static final char method1157(byte i, char c) {
        if (i <= 96)
            method1157((byte) -85, 'c');
        anInt1563++;
        int i_4_ = c;
        while_102_:
        do {
            while_101_:
            do {
                while_100_:
                do {
                    while_99_:
                    do {
                        while_98_:
                        do {
                            while_97_:
                            do {
                                while_96_:
                                do {
                                    while_95_:
                                    do {
                                        while_94_:
                                        do {
                                            do {
                                                if (i_4_ != 32 && ((i_4_ ^ 0xffffffff) != -161) && ((i_4_ ^ 0xffffffff) != -96) && ((i_4_ ^ 0xffffffff) != -46)) {
                                                    if (i_4_ != 91 && i_4_ != 93 && ((i_4_ ^ 0xffffffff) != -36)) {
                                                        if (i_4_ != 224 && ((i_4_ ^ 0xffffffff) != -226) && ((i_4_ ^ 0xffffffff) != -227) && i_4_ != 228 && i_4_ != 227 && i_4_ != 192 && ((i_4_ ^ 0xffffffff) != -194) && i_4_ != 194 && i_4_ != 196 && ((i_4_ ^ 0xffffffff) != -196)) {
                                                            if (((i_4_ ^ 0xffffffff) != -233) && ((i_4_ ^ 0xffffffff) != -234) && ((i_4_ ^ 0xffffffff) != -235) && i_4_ != 235 && ((i_4_ ^ 0xffffffff) != -201) && ((i_4_ ^ 0xffffffff) != -202) && i_4_ != 202 && (i_4_ != 203)) {
                                                                if (((i_4_ ^ 0xffffffff) != -238) && ((i_4_ ^ 0xffffffff) != -239) && ((i_4_ ^ 0xffffffff) != -240) && ((i_4_ ^ 0xffffffff) != -206) && ((i_4_ ^ 0xffffffff) != -207) && (i_4_ != 207)) {
                                                                    if (((i_4_ ^ 0xffffffff) != -243) && (i_4_ != 243) && ((i_4_ ^ 0xffffffff) != -245) && (i_4_ != 246) && ((i_4_ ^ 0xffffffff) != -246) && (i_4_ != 210) && ((i_4_ ^ 0xffffffff) != -212) && ((i_4_ ^ 0xffffffff) != -213) && ((i_4_ ^ 0xffffffff) != -215) && ((i_4_ ^ 0xffffffff) != -214)) {
                                                                        if ((i_4_ ^ 0xffffffff) != -250 && (i_4_ ^ 0xffffffff) != -251 && i_4_ != 251 && i_4_ != 252 && i_4_ != 217 && i_4_ != 218 && i_4_ != 219 && (i_4_ ^ 0xffffffff) != -221) {
                                                                            if ((i_4_ ^ 0xffffffff) != -232 && (i_4_ ^ 0xffffffff) != -200) {
                                                                                if ((i_4_ ^ 0xffffffff) != -256 && i_4_ != 376) {
                                                                                    if ((i_4_ ^ 0xffffffff) != -242 && (i_4_ ^ 0xffffffff) != -210) {
                                                                                        if ((i_4_ ^ 0xffffffff) == -224)
                                                                                            break while_101_;
                                                                                        break while_102_;
                                                                                    }
                                                                                } else
                                                                                    break while_99_;
                                                                                break while_100_;
                                                                            }
                                                                        } else
                                                                            break while_97_;
                                                                        break while_98_;
                                                                    }
                                                                } else
                                                                    break while_95_;
                                                                break while_96_;
                                                            }
                                                        } else
                                                            break;
                                                        break while_94_;
                                                    }
                                                } else
                                                    return '_';
                                                return c;
                                            } while (false);
                                            return 'a';
                                        } while (false);
                                        return 'e';
                                    } while (false);
                                    return 'i';
                                } while (false);
                                return 'o';
                            } while (false);
                            return 'u';
                        } while (false);
                        return 'c';
                    } while (false);
                    return 'y';
                } while (false);
                return 'n';
            } while (false);
            return 'b';
        } while (false);
        return Character.toLowerCase(c);
    }

    Class127(int[] is) {
        int i;
        for (i = 1; (((is.length >> 1976814017) + is.length ^ 0xffffffff) <= (i ^ 0xffffffff)); i <<= 1) {
            /* empty */
        }
        anIntArray1562 = new int[i + i];
        for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i - -i ^ 0xffffffff); i_5_++)
            anIntArray1562[i_5_] = -1;
        for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_6_++) {
            int i_7_;
            for (i_7_ = is[i_6_] & i + -1; anIntArray1562[1 + i_7_ + i_7_] != -1; i_7_ = 1 + i_7_ & -1 + i) {
                /* empty */
            }
            anIntArray1562[i_7_ - -i_7_] = is[i_6_];
            anIntArray1562[1 + i_7_ + i_7_] = i_6_;
        }
    }

    public static void method1158(int i) {
        if (i < 1)
            method1157((byte) 4, '\uffa4');
        aClass2Array1566 = null;
    }
}
