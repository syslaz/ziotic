/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class114 {
    static int anInt1423;
    static int anInt1424;
    static int anInt1425 = 0;
    static int[] anIntArray1426 = new int[2];
    static int anInt1427;
    static int anInt1428;
    static long membershipEnd;

    static final void method1073(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        if (i_3_ >= -120)
            anInt1423 = 119;
        anInt1428++;
        int i_5_ = Class49.method389(aa_Sub3.anInt5270, 101, Class181.anInt2099, i_2_);
        int i_6_ = Class49.method389(aa_Sub3.anInt5270, 19, Class181.anInt2099, i);
        int i_7_ = Class49.method389(Class289.anInt3399, 45, Class302.anInt3500, i_0_);
        int i_8_ = Class49.method389(Class289.anInt3399, 103, Class302.anInt3500, i_1_);
        for (int i_9_ = i_5_; (i_6_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff); i_9_++)
            Class149.method1331(i_4_, -61, i_7_, Class156.anIntArrayArray1867[i_9_], i_8_);
    }

    public static void method1074(int i) {
        if (i >= 3)
            anIntArray1426 = null;
    }

    static final Class253 method1075(Component component, boolean bool) {
        anInt1427++;
        if (bool != true)
            anInt1423 = 4;
        return new Class253_Sub1(component);
    }
}
