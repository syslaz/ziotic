/* Class225_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class225_Sub3 extends Class225 {
    int anInt8470;
    static int anInt8471;
    static boolean aBoolean8472;
    int anInt8473;
    static int anInt8474;
    static Class293 aClass293_8475;
    static int anInt8476;
    static Class7[] aClass7Array8477 = new Class7[8];

    public final Class208 method35(byte i) {
        anInt8471++;
        if (i != 62)
            return null;
        return Class160.aClass208_1887;
    }

    static final boolean method1797(byte i, int i_0_) {
        if (i != 63)
            method1799(null);
        anInt8474++;
        if (((i_0_ ^ 0xffffffff) > -1 || i_0_ > 3) && (i_0_ ^ 0xffffffff) != -10)
            return false;
        return true;
    }

    static final void method1798(int i) {
        Node_Sub14_Sub24.method2347((byte) 103);
        anInt8476++;
        Class61.aIncommingOpcode_832 = null;
        Class282_Sub21.anInt7817 = 0;
        ((ByteStream) Node_Sub15_Sub1.aClass248_Sub9_Sub2_9629).offset = 0;
        Class30.currentPacketSize = i;
        Class45.anInt569 = 0;
        Class226_Sub3.aIncommingOpcode_6669 = null;
        Node_Sub8_Sub14_Sub1.aIncommingOpcode_10293 = null;
        Class51.currentIncommingOpcode = null;
        Class178.method1593((byte) -124);
        Class13.method212(104);
        for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -2049; i_1_++)
            Node_Sub32.aPlayerArray7197[i_1_] = null;
        Class347.myPlayer = null;
        for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (Node_Sub8_Sub16_Sub1.anInt10303 ^ 0xffffffff)); i_2_++) {
            NPC NPC = (((Node_Sub10) Node_Sub30.aClass248_Sub10Array7182[i_2_]).aNPC_6946);
            if (NPC != null)
                ((Entity) NPC).faceEntity = -1;
        }
        Node_Sub27.method2553((byte) 70);
        Node_Sub45.anInt7343 = 1;
        Node_Sub14_Sub21.anInt9379 = Class359.anInt4436 = -1;
        Node_Sub14_Sub15.method2318(10, -21035);
        for (int i_3_ = 0; i_3_ < 100; i_3_++)
            Class359.aBooleanArray4435[i_3_] = true;
        Class101.method716((byte) -57);
        Class211.aLong2446 = 0L;
        Node_Sub14_Sub15.aClass248_Sub43_9326 = null;
    }

    static final void method1799(Interactable interactable) {
        r.aHa9032.H(((Interactable) interactable).x, (((Interactable) interactable).anInt8317 + (interactable.method3580(-32768) >> 1)), ((Interactable) interactable).y, Class39.anIntArray435);
        ((Interactable) interactable).anInt8307 = Class39.anIntArray435[0];
        ((Interactable) interactable).anInt8314 = Class39.anIntArray435[1];
        ((Interactable) interactable).anInt8316 = Class39.anIntArray435[2];
    }

    Class225_Sub3(Class186 class186, Class272 class272, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        super(class186, class272, i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
        ((Class225_Sub3) this).anInt8473 = i_11_;
        ((Class225_Sub3) this).anInt8470 = i_12_;
    }

    public static void method1800(int i) {
        if (i == 100) {
            aClass293_8475 = null;
            aClass7Array8477 = null;
        }
    }

    static {
        aClass293_8475 = new Class293();
    }
}
