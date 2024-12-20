/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class235 {
    static Class356 aClass356_2617;
    static int anInt2618;
    static int anInt2619;
    static int anInt2620;
    static boolean aBoolean2621 = true;

    public static void method1847(int i) {
        if (i >= -103)
            aClass356_2617 = null;
        aClass356_2617 = null;
    }

    static final void method1848(String string, byte i) {
        if (i != -105)
            aClass356_2617 = null;
        anInt2620++;
        if (string != null) {
            if (string.startsWith("*"))
                string = string.substring(1);
            String string_0_ = Class144.method1298(string, true);
            if (string_0_ != null) {
                for (int i_1_ = 0; client.anInt5226 > i_1_; i_1_++) {
                    String string_2_ = Class282_Sub11.aStringArray7703[i_1_];
                    if (string_2_.startsWith("*"))
                        string_2_ = string_2_.substring(1);
                    string_2_ = Class144.method1298(string_2_, true);
                    if (string_2_ != null && string_2_.equals(string_0_)) {
                        client.anInt5226--;
                        for (int i_3_ = i_1_; i_3_ < client.anInt5226; i_3_++) {
                            Class282_Sub11.aStringArray7703[i_3_] = Class282_Sub11.aStringArray7703[i_3_ + 1];
                            Class132.aStringArray1618[i_3_] = Class132.aStringArray1618[1 + i_3_];
                            Class286.anIntArray3372[i_3_] = Class286.anIntArray3372[1 + i_3_];
                            Node_Sub19.aStringArray7039[i_3_] = Node_Sub19.aStringArray7039[i_3_ - -1];
                            Class346_Sub2.anIntArray8262[i_3_] = Class346_Sub2.anIntArray8262[1 + i_3_];
                            Node_Sub27.aBooleanArray7150[i_3_] = Node_Sub27.aBooleanArray7150[1 + i_3_];
                        }
                        Class270.anInt3137++;
                        Class316.anInt3662 = Class164.anInt1934;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(i ^ ~0x69, (Class346_Sub5_Sub2.aISAACCypher_9889), (Node_Sub13.aOutgoingOpcode_6969));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-89, Class208.method1710(true, string));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -84);
                        Class226_Sub3.method1814(class248_sub36, i ^ ~0x68);
                        break;
                    }
                }
            }
        }
    }
}
