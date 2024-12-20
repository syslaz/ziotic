/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node {
    static int anInt2796;
    static int anInt2797;
    static int anInt2798;
    Node prev;
    static int anInt2800;
    static int[] anIntArray2801;
    long id;
    Node next;

    static final void method1964(String string, int i, boolean bool) {
        anInt2798++;
        if (string != null) {
            if ((Node_Sub2_Sub3.anInt8854 ^ 0xffffffff) <= -101)
                Node_Sub14_Sub5.method2289(4, 31663, Class41.aClass41_505.method301(Class191.anInt4822, (byte) -108));
            else {
                String string_0_ = Class144.method1298(string, true);
                if (string_0_ != null) {
                    int i_1_ = 0;
                    if (i <= 81)
                        method1964(null, 126, false);
                    for (/**/; Node_Sub2_Sub3.anInt8854 > i_1_; i_1_++) {
                        String string_2_ = Class144.method1298((Class340_Sub7.aStringArray8181[i_1_]), true);
                        if (string_2_ != null && string_2_.equals(string_0_)) {
                            Node_Sub14_Sub5.method2289(4, 31663, string + (Class41.aClass41_506.method301(Class191.anInt4822, (byte) -108)));
                            return;
                        }
                        if (Node_Sub14_Sub9.aStringArray9242[i_1_] != null) {
                            String string_3_ = Class144.method1298((Node_Sub14_Sub9.aStringArray9242[i_1_]), true);
                            if (string_3_ != null && string_3_.equals(string_0_)) {
                                Node_Sub14_Sub5.method2289(4, 31663, string + (Class41.aClass41_506.method301(Class191.anInt4822, (byte) -108)));
                                return;
                            }
                        }
                    }
                    for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (client.anInt5226 ^ 0xffffffff); i_4_++) {
                        String string_5_ = Class144.method1298((Class282_Sub11.aStringArray7703[i_4_]), true);
                        if (string_5_ != null && string_5_.equals(string_0_)) {
                            Node_Sub14_Sub5.method2289(4, 31663, (Class41.aClass41_511.method301((Class191.anInt4822), (byte) -108) + string + (Class41.aClass41_512.method301(Class191.anInt4822, (byte) -108))));
                            return;
                        }
                        if (Class132.aStringArray1618[i_4_] != null) {
                            String string_6_ = Class144.method1298((Class132.aStringArray1618[i_4_]), true);
                            if (string_6_ != null && string_6_.equals(string_0_)) {
                                Node_Sub14_Sub5.method2289(4, 31663, ((Class41.aClass41_511.method301(Class191.anInt4822, (byte) -108)) + string + (Class41.aClass41_512.method301(Class191.anInt4822, (byte) -108))));
                                return;
                            }
                        }
                    }
                    if (Class144.method1298((((Player) Class347.myPlayer).aString10550), true).equals(string_0_))
                        Node_Sub14_Sub5.method2289(4, 31663, Class41.aClass41_508.method301(Class191.anInt4822, (byte) -108));
                    else {
                        Class18.anInt296++;
                        Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, (Class346_Sub5_Sub2.aISAACCypher_9889), (Class282_Sub21.aOutgoingOpcode_7810));
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-35, Class208.method1710(true, string) + 1);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2183(string, (byte) -103);
                        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-126, !bool ? 0 : 1);
                        Class226_Sub3.method1814(class248_sub36, 0);
                    }
                }
            }
        }
    }

    final void remove(boolean bool) {
        anInt2800++;
        if (((Node) this).next != null) {
            ((Node) ((Node) this).next).prev = ((Node) this).prev;
            ((Node) ((Node) this).prev).next = ((Node) this).next;
            if (bool == true) {
                ((Node) this).prev = null;
                ((Node) this).next = null;
            }
        }
    }

    public static void method1966(boolean bool) {
        if (bool != true)
            method1968(55, false);
        anIntArray2801 = null;
    }

    final boolean hasNext(byte i) {
        if (i != 78)
            return false;
        anInt2796++;
        if (((Node) this).next == null)
            return false;
        return true;
    }

    static final void method1968(int i, boolean bool) {
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7353), (byte) -71, 0);
        anInt2797++;
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub10_7335), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7327), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub8_7333), (byte) -71, 1);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub16_7349), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub28_7329), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub25_7345), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub5_7324), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub13_7314), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub26_7363), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub29_7313), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub11_7347), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub23_7360), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7340), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub6_7357), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub4_7356), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub20_7336), (byte) -71, 0);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub27_7321), (byte) -71, 0);
        Class212.method1732(8583);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub19_7319), (byte) -71, 2);
        Node_Sub14_Sub38.aClass248_Sub45_9584.method2649((((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub24_7348), (byte) -71, i);
        Node_Sub20.method2521((byte) 126);
        Class332.method3400(i);
        Class5.aBoolean149 = true;
    }

    public Node() {
        /* empty */
    }
}
