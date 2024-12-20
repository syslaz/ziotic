/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class324 {
    static int anInt3821;
    static int[] anIntArray3822 = {-1, -1, 1, 1};
    static int anInt3823;
    static int[] anIntArray3824 = {4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
    static int anInt3825;

    public static void method3357(byte i) {
        if (i != -36)
            method3358((byte) -26, null);
        anIntArray3822 = null;
        anIntArray3824 = null;
    }

    static final void method3358(byte i, String string) {
        anInt3825++;
        if (string != null) {
            if (((client.anInt5226 ^ 0xffffffff) <= -201 && !Class229.aBoolean2580) || (client.anInt5226 ^ 0xffffffff) <= -201) {
                Node_Sub14_Sub5.method2289(4, 31663, Class41.aClass41_476.method301(Class191.anInt4822, (byte) -108));
                String string_0_ = Class41.aClass41_477.method301(Class191.anInt4822, (byte) -108);
                if (string_0_ != null)
                    Node_Sub14_Sub5.method2289(4, 31663, string_0_);
            } else {
                String string_1_ = Class144.method1298(string, true);
                if (string_1_ != null) {
                    for (int i_2_ = 0; i_2_ < client.anInt5226; i_2_++) {
                        String string_3_ = Class144.method1298((Class282_Sub11.aStringArray7703[i_2_]), true);
                        if (string_3_ != null && string_3_.equals(string_1_)) {
                            Node_Sub14_Sub5.method2289(4, 31663, string + (Class41.aClass41_504.method301(Class191.anInt4822, (byte) -108)));
                            return;
                        }
                        if (Class132.aStringArray1618[i_2_] != null) {
                            String string_4_ = Class144.method1298((Class132.aStringArray1618[i_2_]), true);
                            if (string_4_ != null && string_4_.equals(string_1_)) {
                                Node_Sub14_Sub5.method2289(4, 31663, string + (Class41.aClass41_504.method301(Class191.anInt4822, (byte) -108)));
                                return;
                            }
                        }
                    }
                    for (int i_5_ = 0; ((Node_Sub2_Sub3.anInt8854 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
                        String string_6_ = Class144.method1298((Class340_Sub7.aStringArray8181[i_5_]), true);
                        if (string_6_ != null && string_6_.equals(string_1_)) {
                            Node_Sub14_Sub5.method2289(4, 31663, (Class41.aClass41_509.method301((Class191.anInt4822), (byte) -108) + string + (Class41.aClass41_510.method301(Class191.anInt4822, (byte) -108))));
                            return;
                        }
                        if (Node_Sub14_Sub9.aStringArray9242[i_5_] != null) {
                            String string_7_ = Class144.method1298((Node_Sub14_Sub9.aStringArray9242[i_5_]), true);
                            if (string_7_ != null && string_7_.equals(string_1_)) {
                                Node_Sub14_Sub5.method2289(4, 31663, ((Class41.aClass41_509.method301(Class191.anInt4822, (byte) -108)) + string + (Class41.aClass41_510.method301(Class191.anInt4822, (byte) -108))));
                                return;
                            }
                        }
                    }
                    if (Class144.method1298((((Player) Class347.myPlayer).aString10550), true).equals(string_1_))
                        Node_Sub14_Sub5.method2289(4, 31663, Class41.aClass41_507.method301(Class191.anInt4822, (byte) -108));
                    else {
                        Class337.anInt3926++;
                        int i_8_ = 86 / ((-28 - i) / 59);
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class282_Sub25.aOutgoingOpcode_7853));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-117, Class208.method1710(true, string));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -105);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    }
                }
            }
        }
    }

    static final boolean method3359(int i, byte i_9_) {
        anInt3821++;
        if (i_9_ != -14)
            anIntArray3824 = null;
        if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -8)
            return false;
        return true;
    }
}
