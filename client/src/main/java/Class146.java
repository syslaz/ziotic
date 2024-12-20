/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class146 {
    static int anInt1724;
    static IncommingOpcode aIncommingOpcode_1725;
    static int anInt1726 = 0;
    static int anInt1727;
    static int anInt1728;
    private Class381 aClass381_1729;
    static int[] anIntArray1730 = new int[13];
    int anInt1731;

    public static void method1310(byte i) {
        if (i == 115) {
            anIntArray1730 = null;
            aIncommingOpcode_1725 = null;
        }
    }

    static final int method1311(byte i) {
        anInt1727++;
        if (Class145.aBoolean1721)
            return 6;
        if (Class300.aClass248_Sub8_Sub11_3498 == null)
            return 0;
        int i_0_ = (((Node_Sub8_Sub11) Class300.aClass248_Sub8_Sub11_3498).anInt8999);
        if (i > -83)
            anInt1728 = 101;
        if (Node_Sub8_Sub10.method2081(i_0_, (byte) 99))
            return 1;
        if (Node_Sub3.method2007(i_0_, 50))
            return 2;
        if (Class290.method3093(i_0_, (byte) -114))
            return 3;
        if (Node_Sub15_Sub4.method2491(-65, i_0_))
            return 4;
        return 5;
    }

    Class146(Class215 class215, int i, Class381 class381) {
        new Class278(64);
        aClass381_1729 = class381;
        ((Class146) this).anInt1731 = aClass381_1729.method3899(15, 0);
    }

    static {
        aIncommingOpcode_1725 = new IncommingOpcode(65, -1);
    }
}
