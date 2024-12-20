/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class18 {
    static int anInt293;
    static RSInterface2 aClass354_294;
    static Class339 aClass339_295;
    static int anInt296;

    static final void method226(int i) {
        anInt293++;
        do {
            try {
                if ((Class332.anInt3883 ^ 0xffffffff) == -2) {
                    int i_0_ = Class161.aClass248_Sub15_Sub1_1895.method2418(true);
                    if ((i_0_ ^ 0xffffffff) < -1 && Class161.aClass248_Sub15_Sub1_1895.method2415(100)) {
                        i_0_ -= Class54_Sub1.anInt5328;
                        if (i_0_ < 0)
                            i_0_ = 0;
                        Class161.aClass248_Sub15_Sub1_1895.method2413(true, i_0_);
                        break;
                    }
                    Class161.aClass248_Sub15_Sub1_1895.method2420(2064);
                    Class161.aClass248_Sub15_Sub1_1895.method2410(12865);
                    Class45.aClass154_566 = null;
                    Class231.aClass248_Sub44_2609 = null;
                    if (NPC.aClass381_10591 == null)
                        Class332.anInt3883 = 0;
                    else
                        Class332.anInt3883 = 2;
                }
                if (i < -74) {
                    if (Class332.anInt3883 != 3)
                        break;
                    int i_1_ = Class161.aClass248_Sub15_Sub1_1895.method2418(true);
                    if (((Node_Sub2_Sub2.anInt8839 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) && Class161.aClass248_Sub15_Sub1_1895.method2415(100)) {
                        i_1_ += Class351.anInt4736;
                        if ((Node_Sub2_Sub2.anInt8839 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
                            i_1_ = Node_Sub2_Sub2.anInt8839;
                        Class161.aClass248_Sub15_Sub1_1895.method2413(true, i_1_);
                    } else {
                        Class351.anInt4736 = 0;
                        Class332.anInt3883 = 0;
                    }
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                Class161.aClass248_Sub15_Sub1_1895.method2420(2064);
                NPC.aClass381_10591 = null;
                Class332.anInt3883 = 0;
                Class231.aClass248_Sub44_2609 = null;
                Class341.aClass248_Sub15_Sub1_3980 = null;
                Class45.aClass154_566 = null;
                break;
            }
            break;
        } while (false);
    }

    public static void method227(byte i) {
        aClass354_294 = null;
        aClass339_295 = null;
        int i_2_ = 90 % ((i - 58) / 57);
    }
}
