/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class177 {
    static boolean aBoolean2066;
    static int anInt2067 = -1;
    static int anInt2068;
    static Class345 aClass345_2069;
    static s[] aSArray2070;
    Class285 aClass285_2071 = null;
    static int anInt2072;
    Class48 aClass48_2073 = null;
    static int anInt2074;

    static final boolean method1589(int i, int i_0_, int i_1_, int i_2_, byte[] is, int i_3_, int i_4_) {
        anInt2072++;
        int i_5_ = i_4_ % i_1_;
        if (i < 97)
            method1590(-57, null, -114, 12);
        int i_6_;
        if ((i_5_ ^ 0xffffffff) == -1)
            i_6_ = 0;
        else
            i_6_ = i_1_ + -i_5_;
        int i_7_ = -((i_1_ + (i_0_ + -1)) / i_1_);
        int i_8_ = -((-1 + i_4_ - -i_1_) / i_1_);
        for (int i_9_ = i_7_; (i_9_ ^ 0xffffffff) > -1; i_9_++) {
            for (int i_10_ = i_8_; (i_10_ ^ 0xffffffff) > -1; i_10_++) {
                if (is[i_3_] == 0)
                    return true;
                i_3_ += i_1_;
            }
            i_3_ -= i_6_;
            if (is[i_3_ - 1] == 0)
                return true;
            i_3_ += i_2_;
        }
        return false;
    }

    static final void method1590(int i, ha var_ha, int i_11_, int i_12_) {
        Class122.aClass229ArrayArray1524 = new Class229[i_12_][i];
        Class282_Sub25.aHa7855 = var_ha;
        if (i_11_ != 5)
            method1591(true);
        anInt2068++;
        if (Class282_Sub28.anIntArray7887 != null)
            Class279_Sub1_Sub2.aClass316_9819 = Class337.method3421((byte) -121, Class282_Sub28.anIntArray7887[1], Class282_Sub28.anIntArray7887[3], Class282_Sub28.anIntArray7887[2], Class282_Sub28.anIntArray7887[5], Class282_Sub28.anIntArray7887[4], Class282_Sub28.anIntArray7887[0]);
        Node_Sub18.aClass229_7016 = new Class229();
        aa.method155((byte) 41);
    }

    public static void method1591(boolean bool) {
        if (bool != true)
            anInt2074 = 64;
        aClass345_2069 = null;
        aSArray2070 = null;
    }

    Class177(Class48 class48) {
        ((Class177) this).aClass48_2073 = class48;
    }

    Class177(Class48 class48, Class285 class285) {
        ((Class177) this).aClass285_2071 = class285;
        ((Class177) this).aClass48_2073 = class48;
    }

    static {
        aBoolean2066 = false;
    }
}
