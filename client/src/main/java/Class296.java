/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class296 {
    static int anInt3454;
    static short aShort3455 = 256;
    static byte[][] aByteArrayArray3456;
    static int anInt3457;
    static int anInt3458 = 0;
    static boolean aBoolean3459 = true;
    static int[] anIntArray3460 = new int[4];
    static int anInt3461;

    static final void method3129(byte i) {
        anInt3457++;
        Class261.aBoolean2973 = false;
        if (i != -15)
            method3130(-26, 49, 81);
        Class60.method472(i + -86);
    }

    static final Class137 method3130(int i, int i_0_, int i_1_) {
        if (Class311.aClass137ArrayArrayArray3620[i][i_0_][i_1_] == null) {
            boolean bool = (Class311.aClass137ArrayArrayArray3620[0][i_0_][i_1_] != null && ((Class137) (Class311.aClass137ArrayArrayArray3620[0][i_0_][i_1_])).aClass137_1651 != null);
            if (bool && i >= Class111_Sub1.anInt5531 - 1)
                return null;
            Node_Sub15_Sub5.method2502(i, i_0_, i_1_);
        }
        return Class311.aClass137ArrayArrayArray3620[i][i_0_][i_1_];
    }

    public static void method3131(byte i) {
        aByteArrayArray3456 = null;
        anIntArray3460 = null;
        int i_2_ = 6 / ((i - -13) / 36);
    }

    static final void method3132(byte i) {
        if (Node_Sub14_Sub30.anInt9478 < 0) {
            ha_Sub2.anInt5704 = -1;
            Class59.anInt810 = -1;
            Node_Sub14_Sub30.anInt9478 = 0;
        }
        anInt3454++;
        if ((Node_Sub14_Sub30.anInt9478 ^ 0xffffffff) < (Class116.anInt1465 ^ 0xffffffff)) {
            Class59.anInt810 = -1;
            ha_Sub2.anInt5704 = -1;
            Node_Sub14_Sub30.anInt9478 = Class116.anInt1465;
        }
        if ((Class261.anInt2972 ^ 0xffffffff) > -1) {
            ha_Sub2.anInt5704 = -1;
            Class261.anInt2972 = 0;
            Class59.anInt810 = -1;
        }
        if (i != -7)
            method3129((byte) 79);
        if (Class116.anInt1457 < Class261.anInt2972) {
            Class59.anInt810 = -1;
            ha_Sub2.anInt5704 = -1;
            Class261.anInt2972 = Class116.anInt1457;
        }
    }

    abstract Node_Sub8_Sub14 method3133(Node_Sub8_Sub14 class248_sub8_sub14, int i);
}
