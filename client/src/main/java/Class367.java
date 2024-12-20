/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367 {
    private int[][][] anIntArrayArrayArray4498;
    static int anInt4499;
    static int anInt4500;
    private Node_Sub5[] aClass248_Sub5Array4501;
    static int anInt4502;
    static int anInt4503;
    private int anInt4504 = 0;
    private int anInt4505;
    static IncommingOpcode aIncommingOpcode_4506 = new IncommingOpcode(69, 4);
    private int anInt4507;
    private Class293 aClass293_4508;
    static int anInt4509 = 0;
    static int anInt4510;
    private int anInt4511 = -1;
    boolean aBoolean4512;
    static int anInt4513;

    public static void method3831(int i) {
        aIncommingOpcode_4506 = null;
        if (i < 113)
            method3831(-100);
    }

    final int[][][] method3832(int i) {
        anInt4500++;
        if ((anInt4505 ^ 0xffffffff) != (anInt4507 ^ 0xffffffff))
            throw new RuntimeException("Can only retrieve a full image cache");
        if (i != -23295)
            method3835(90, 110);
        for (int i_0_ = 0; i_0_ < anInt4505; i_0_++)
            aClass248_Sub5Array4501[i_0_] = Class283.aClass248_Sub5_3330;
        return anIntArrayArrayArray4498;
    }

    final void method3833(int i) {
        anInt4503++;
        for (int i_1_ = 0; i_1_ < anInt4505; i_1_++) {
            anIntArrayArrayArray4498[i_1_][0] = null;
            anIntArrayArrayArray4498[i_1_][1] = null;
            anIntArrayArrayArray4498[i_1_][2] = null;
            anIntArrayArrayArray4498[i_1_] = null;
        }
        anIntArrayArrayArray4498 = null;
        if (i != -6948)
            method3835(18, 45);
        aClass248_Sub5Array4501 = null;
        aClass293_4508.method3121(10);
        aClass293_4508 = null;
    }

    static final void method3834(int i) {
        if (i == 0) {
            anInt4499++;
            if (Class6.aHa154 != null) {
                Class6.aHa154.method819(100);
                s.aClass48_3471 = null;
                Class6.aHa154 = null;
            }
        }
    }

    final int[][] method3835(int i, int i_2_) {
        if (i != 1)
            method3835(-32, 90);
        anInt4502++;
        if ((anInt4507 ^ 0xffffffff) == (anInt4505 ^ 0xffffffff)) {
            ((Class367) this).aBoolean4512 = aClass248_Sub5Array4501[i_2_] == null;
            aClass248_Sub5Array4501[i_2_] = Class283.aClass248_Sub5_3330;
            return anIntArrayArrayArray4498[i_2_];
        }
        if (anInt4505 != 1) {
            Node_Sub5 class248_sub5 = aClass248_Sub5Array4501[i_2_];
            if (class248_sub5 != null)
                ((Class367) this).aBoolean4512 = false;
            else {
                ((Class367) this).aBoolean4512 = true;
                if ((anInt4505 ^ 0xffffffff) >= (anInt4504 ^ 0xffffffff)) {
                    Node_Sub5 class248_sub5_3_ = (Node_Sub5) aClass293_4508.method3110(0);
                    class248_sub5 = new Node_Sub5(i_2_, (((Node_Sub5) class248_sub5_3_).anInt6837));
                    aClass248_Sub5Array4501[(((Node_Sub5) class248_sub5_3_).anInt6840)] = null;
                    class248_sub5_3_.remove(true);
                } else {
                    class248_sub5 = new Node_Sub5(i_2_, anInt4504);
                    anInt4504++;
                }
                aClass248_Sub5Array4501[i_2_] = class248_sub5;
            }
            aClass293_4508.method3111(class248_sub5, i ^ 0x250);
            return (anIntArrayArrayArray4498[((Node_Sub5) class248_sub5).anInt6837]);
        }
        ((Class367) this).aBoolean4512 = i_2_ != anInt4511;
        anInt4511 = i_2_;
        return anIntArrayArrayArray4498[0];
    }

    Class367(int i, int i_4_, int i_5_) {
        aClass293_4508 = new Class293();
        ((Class367) this).aBoolean4512 = false;
        anInt4507 = i_4_;
        anInt4505 = i;
        anIntArrayArrayArray4498 = new int[anInt4505][3][i_5_];
        aClass248_Sub5Array4501 = new Node_Sub5[anInt4507];
    }
}
