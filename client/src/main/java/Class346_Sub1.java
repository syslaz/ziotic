/* Class346_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub1 extends Class346 {
    String aString8243;
    int anInt8244;
    static int anInt8245 = Class241.method1930(86, 1600);
    int anInt8246;
    static int anInt8247;
    int anInt8248;
    int anInt8249;
    static Interface17[] anInterface17Array8250;
    static Class272 aClass272_8251 = new Class272();
    static int anInt8252;
    int anInt8253;
    int anInt8254;

    static final Node_Sub36 method3540(int i, ISAACCypher ISAACCypher, OutgoingOpcode outgoingOpcode) {
        anInt8252++;
        Node_Sub36 class248_sub36 = Class139.method1279((byte) -62);
        ((Node_Sub36) class248_sub36).anInt7260 = ((OutgoingOpcode) outgoingOpcode).size;
        if (i != 1)
            anInterface17Array8250 = null;
        ((Node_Sub36) class248_sub36).aOutgoingOpcode_7256 = outgoingOpcode;
        if ((((Node_Sub36) class248_sub36).anInt7260 ^ 0xffffffff) == 0)
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257 = new PacketStream(260);
        else if ((((Node_Sub36) class248_sub36).anInt7260 ^ 0xffffffff) != 1) {
            if ((((Node_Sub36) class248_sub36).anInt7260 ^ 0xffffffff) < -19) {
                if ((((Node_Sub36) class248_sub36).anInt7260 ^ 0xffffffff) < -99)
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257 = new PacketStream(260);
                else
                    ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257 = new PacketStream(100);
            } else
                ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257 = new PacketStream(20);
        } else
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257 = new PacketStream(10000);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.method2236(ISAACCypher, 8);
        //System.out.println("OUT " + ((Node_Sub36) class248_sub36).aOutgoingOpcode_7256.method1510(-1) + ", " + ((Node_Sub36) class248_sub36).aOutgoingOpcode_7256.size);
        ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeOpcode(false, ((Node_Sub36) class248_sub36).aOutgoingOpcode_7256.method1510(-1));
        ((Node_Sub36) class248_sub36).anInt7254 = 0;
        return class248_sub36;
    }

    public static void method3541(int i) {
        if (i == 10000) {
            aClass272_8251 = null;
            anInterface17Array8250 = null;
        }
    }

    public Class346_Sub1() {
        /* empty */
    }
}
