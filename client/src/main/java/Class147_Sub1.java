/* Class147_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class147_Sub1 extends Class147 {
    static int anInt6282;
    String aString6283;
    String aString6284;
    int anInt6285;
    static int anInt6286;
    static int anInt6287;
    int anInt6288 = -1;

    static final void method1318(int i, boolean bool, boolean bool_0_) {
        anInt6286++;
        Node_Sub33 class248_sub33 = IOException_Sub1.method127(bool, i, (byte) -60);
        if (class248_sub33 != null) {
            for (int i_1_ = 0; (i_1_ < ((Node_Sub33) class248_sub33).anIntArray7202.length); i_1_++) {
                ((Node_Sub33) class248_sub33).anIntArray7202[i_1_] = -1;
                ((Node_Sub33) class248_sub33).anIntArray7204[i_1_] = 0;
            }
            if (bool_0_ == false) {
                /* empty */
            }
        }
    }

    final Class55 method1319(int i) {
        if (i != 3)
            ((Class147_Sub1) this).aString6283 = null;
        anInt6287++;
        return Class21.aClass55Array313[((Class147) this).anInt1737];
    }

    static final void method1320(int i) {
        int i_2_ = 46 / ((-59 - i) / 45);
        for (Node_Sub8_Sub11 class248_sub8_sub11 = (Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(-128))) {
            if (Node_Sub8_Sub10.method2081(((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999, (byte) 99))
                Class282_Sub7.method2948(0, class248_sub8_sub11);
        }
        anInt6282++;
    }

    static final void method1321(int i, int i_3_) {
        Class137 class137 = Class311.aClass137ArrayArrayArray3620[0][i][i_3_];
        for (int i_4_ = 0; i_4_ < 3; i_4_++) {
            Class137 class137_5_ = (Class311.aClass137ArrayArrayArray3620[i_4_][i][i_3_] = Class311.aClass137ArrayArrayArray3620[i_4_ + 1][i][i_3_]);
            if (class137_5_ != null) {
                for (Class49 class49 = ((Class137) class137_5_).aClass49_1649; class49 != null; class49 = ((Class49) class49).aClass49_660) {
                    Animable animable = ((Class49) class49).aAnimable_656;
                    if ((((Animable) animable).x1 == i) && (((Animable) animable).y1) == i_3_)
                        ((Interactable) animable).plane--;
                }
                if (((Class137) class137_5_).aClass346_Sub7_Sub4_1645 != null)
                    ((Interactable) (((Class137) class137_5_).aClass346_Sub7_Sub4_1645)).plane--;
                if (((Class137) class137_5_).aClass346_Sub7_Sub5_1636 != null)
                    ((Interactable) (((Class137) class137_5_).aClass346_Sub7_Sub5_1636)).plane--;
                if (((Class137) class137_5_).aClass346_Sub7_Sub5_1646 != null)
                    ((Interactable) (((Class137) class137_5_).aClass346_Sub7_Sub5_1646)).plane--;
                if (((Class137) class137_5_).aClass346_Sub7_Sub1_1644 != null)
                    ((Interactable) (((Class137) class137_5_).aClass346_Sub7_Sub1_1644)).plane--;
                if (((Class137) class137_5_).aClass346_Sub7_Sub1_1642 != null)
                    ((Interactable) (((Class137) class137_5_).aClass346_Sub7_Sub1_1642)).plane--;
            }
        }
        if (Class311.aClass137ArrayArrayArray3620[0][i][i_3_] == null) {
            Class311.aClass137ArrayArrayArray3620[0][i][i_3_] = new Class137(0);
            ((Class137) Class311.aClass137ArrayArrayArray3620[0][i][i_3_]).aByte1637 = (byte) 1;
        }
        ((Class137) Class311.aClass137ArrayArrayArray3620[0][i][i_3_]).aClass137_1651 = class137;
        Class311.aClass137ArrayArrayArray3620[3][i][i_3_] = null;
    }
}
