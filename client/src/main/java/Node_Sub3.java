/* Class248_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub3 extends Node {
    static Class381 aClass381_6826;
    static Class257 aClass257_6827;
    short aShort6828;
    static int anInt6829;
    static int anInt6830;

    public static void method2005(int i) {
        aClass257_6827 = null;
        aClass381_6826 = null;
        if (i != 1011)
            method2007(48, 12);
    }

    static final int method2006(int i, int i_0_) {
        if (Class346_Sub7_Sub5.aShortArrayArray9957 != null)
            return Class346_Sub7_Sub5.aShortArrayArray9957[i][i_0_] & 0xffff;
        return 0;
    }

    static final boolean method2007(int i, int i_1_) {
        anInt6829++;
        if (i_1_ != 50)
            anInt6830 = -92;
        if (i == 19 || (i ^ 0xffffffff) == -16 || i == 57 || i == 50 || (i ^ 0xffffffff) == -13)
            return true;
        if (i == 44 || i == 1011)
            return true;
        return false;
    }

    public Node_Sub3() {
        /* empty */
    }

    Node_Sub3(short i) {
        ((Node_Sub3) this).aShort6828 = i;
    }
}
