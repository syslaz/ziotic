/* Class248_Sub48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Node_Sub48 extends Node {
    static int[] anIntArray7417 = new int[8];
    int anInt7418;
    static int anInt7419;
    static int anInt7420;
    static int anInt7421;
    static int anInt7422;
    static int anInt7423;
    int anInt7424;
    static int recoveryQuestionsSet;
    static int anInt7426;
    static int anInt7427;
    static Node_Sub8_Sub11 aClass248_Sub8_Sub11_7428;
    static int anInt7429;
    static int[] lookIndices2 = {0, 1, 2, 3, 4, 5, 6, 14};
    static Viewport aViewport_7431;
    static Frame aFrame7432;

    final int method2666(int i) {
        if (i < 117)
            return 22;
        anInt7419++;
        return (0x1c4c78 & ((Node_Sub48) this).anInt7424) >> -990725678;
    }

    final boolean method2667(int i) {
        anInt7421++;
        if (i >= -9)
            ((Node_Sub48) this).anInt7418 = 8;
        if ((((Node_Sub48) this).anInt7424 >> 91113269 & 0x1 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    final boolean method2668(int i) {
        if (i <= 109)
            method2671(69, -51, -30);
        anInt7420++;
        if ((((Node_Sub48) this).anInt7424 & 0x7a367b) >> 1042330134 == 0)
            return false;
        return true;
    }

    static final void method2669(byte i, int i_0_) {
        anInt7422++;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_0_, -874792672, 5);
        int i_1_ = 85 % ((-17 - i) / 47);
        class248_sub8_sub10.method2076(-64);
    }

    final boolean method2670(int i, int i_2_) {
        if (i_2_ != 3)
            lookIndices2 = null;
        anInt7427++;
        if ((((Node_Sub48) this).anInt7424 >> 1 + i & 0x1 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    static final int method2671(int i, int i_3_, int i_4_) {
        if (i_4_ != 3)
            return 70;
        anInt7426++;
        if (i_3_ == 1 || i_3_ == 3)
            return Class68.anIntArray904[i & 0x3];
        return aa_Sub3.anIntArray5265[i & 0x3];
    }

    final boolean method2672(byte i) {
        anInt7429++;
        if (i > -92)
            method2671(-62, 59, 16);
        if ((((Node_Sub48) this).anInt7424 & 0x1) == 0)
            return false;
        return true;
    }

    final int method2673(int i) {
        if (i != 2)
            return -31;
        anInt7423++;
        return Class38.method285((byte) 38, ((Node_Sub48) this).anInt7424);
    }

    public static void method2674(int i) {
        aClass248_Sub8_Sub11_7428 = null;
        aViewport_7431 = null;
        aFrame7432 = null;
        anIntArray7417 = null;
        lookIndices2 = null;
        int i_5_ = -18 % ((57 - i) / 43);
    }

    Node_Sub48(int i, int i_6_) {
        ((Node_Sub48) this).anInt7418 = i_6_;
        ((Node_Sub48) this).anInt7424 = i;
    }
}
