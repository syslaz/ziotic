/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class375 {
    int anInt4598;
    int anInt4599;
    int anInt4600;
    static int anInt4601;
    int anInt4602;
    static volatile boolean aBoolean4603 = false;
    static int anInt4604;
    static int anInt4605;
    static int anInt4606;
    static int anInt4607;
    int anInt4608 = 128;
    int anInt4609;
    int anInt4610;
    int anInt4611;
    static int anInt4612;
    int anInt4613;
    int anInt4614 = 128;
    static int[] anIntArray4615;
    int anInt4616;

    public static void method3877(boolean bool) {
        anIntArray4615 = null;
        if (bool != false)
            aBoolean4603 = false;
    }

    static final boolean method3878(int i, int i_0_, int i_1_) {
        if (i != 24428)
            method3879(-108);
        anInt4604++;
        if (!Class351.method3743((byte) 113, i_1_, i_0_) && !Class79.method572(i_1_, 55, i_0_))
            return false;
        return true;
    }

    static final void method3879(int i) {
        if (i > -117)
            method3878(90, 111, -50);
        Class262.method2770(false, (byte) -127);
        anInt4601++;
        if (Class253.anInt2846 >= 0 && Class253.anInt2846 != 0) {
            Node_Sub15_Sub5.method2495(false, -70, Class253.anInt2846);
            Class253.anInt2846 = -1;
        }
    }

    final Class375 method3880(byte i) {
        if (i >= -10)
            return null;
        anInt4605++;
        return new Class375(((Class375) this).anInt4600, ((Class375) this).anInt4614, ((Class375) this).anInt4608, ((Class375) this).anInt4616, ((Class375) this).anInt4613, ((Class375) this).anInt4610);
    }

    final void method3881(int i, Class375 class375_2_) {
        ((Class375) this).anInt4614 = ((Class375) class375_2_).anInt4614;
        anInt4612++;
        ((Class375) this).anInt4600 = ((Class375) class375_2_).anInt4600;
        ((Class375) this).anInt4613 = ((Class375) class375_2_).anInt4613;
        ((Class375) this).anInt4608 = ((Class375) class375_2_).anInt4608;
        int i_3_ = -3 % ((i - 39) / 45);
        ((Class375) this).anInt4610 = ((Class375) class375_2_).anInt4610;
        ((Class375) this).anInt4616 = ((Class375) class375_2_).anInt4616;
    }

    Class375(int i) {
        ((Class375) this).anInt4600 = i;
    }

    private Class375(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        ((Class375) this).anInt4600 = i;
        ((Class375) this).anInt4608 = i_5_;
        ((Class375) this).anInt4614 = i_4_;
        ((Class375) this).anInt4616 = i_6_;
        ((Class375) this).anInt4613 = i_7_;
        ((Class375) this).anInt4610 = i_8_;
    }
}
