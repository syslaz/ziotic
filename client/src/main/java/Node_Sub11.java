/* Class248_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub11 extends Node {
    static int anInt6947;
    static int anInt6948;
    boolean aBoolean6949;
    static int anInt6950;
    static int anInt6951;
    static Viewport aViewport_6952;
    ha_Sub2 aHa_Sub2_6953;
    static int anInt6954;
    static int anInt6955;
    static int anInt6956 = -60;
    static int anInt6957;

    static final byte method2238(int i, int i_0_, int i_1_) {
        if (i_1_ != -16878)
            method2247(-64);
        anInt6947++;
        if (i != 9)
            return (byte) 0;
        if ((0x1 & i_0_ ^ 0xffffffff) == -1)
            return (byte) 1;
        return (byte) 2;
    }

    final boolean method2239(int i) {
        if (i != 0)
            return true;
        anInt6954++;
        return false;
    }

    abstract boolean method2240(int i);

    abstract void method2241(Class136_Sub4 class136_sub4, Class136_Sub4 class136_sub4_2_, int i, int i_3_);

    abstract boolean method2242(boolean bool);

    final boolean method2243(int i) {
        if (i != 818)
            aViewport_6952 = null;
        anInt6948++;
        return ((Node_Sub11) this).aBoolean6949;
    }

    static final void method2244(byte i) {
        anInt6950++;
        int i_4_ = Class296.aByteArrayArray3456.length;
        for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
            if (Class296.aByteArrayArray3456[i_5_] != null) {
                int i_6_ = -1;
                for (int i_7_ = 0; (Class99.anInt1279 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
                    if ((Node_Sub27.anIntArray7151[i_7_] ^ 0xffffffff) == (Node_Sub14_Sub36.anIntArray9544[i_5_] ^ 0xffffffff)) {
                        i_6_ = i_7_;
                        break;
                    }
                }
                if (i_6_ == -1) {
                    Node_Sub27.anIntArray7151[Class99.anInt1279] = Node_Sub14_Sub36.anIntArray9544[i_5_];
                    i_6_ = Class99.anInt1279++;
                }
                ByteStream class248_sub9 = new ByteStream(Class296.aByteArrayArray3456[i_5_]);
                int i_8_ = 0;
                while ((((ByteStream) class248_sub9).offset ^ 0xffffffff) > (Class296.aByteArrayArray3456[i_5_].length ^ 0xffffffff)) {
                    if ((i_8_ ^ 0xffffffff) <= -512 || Class28.anInt4892 >= 1023)
                        break;
                    int i_9_ = i_8_++ << 1821537254 | i_6_;
                    int i_10_ = class248_sub9.readShort(-1);
                    int i_11_ = i_10_ >> -1819299410;
                    int i_12_ = (i_10_ & 0x1fbe) >> 1561607271;
                    int i_13_ = 0x3f & i_10_;
                    int i_14_ = (64 * (Node_Sub14_Sub36.anIntArray9544[i_5_] >> 492406888) + (-Class67.baseX - -i_12_));
                    int i_15_ = (i_13_ + -Class368.baseY + (Node_Sub14_Sub36.anIntArray9544[i_5_] & 0xff) * 64);
                    Class255 class255 = (Class148.aClass119_5096.method1123(class248_sub9.readShort(i ^ ~0x70), 8881));
                    Node_Sub10 class248_sub10 = ((Node_Sub10) Class253_Sub1.aClass65_7514.method501((long) i_9_, (byte) 31));
                    if (class248_sub10 == null && (0x1 & ((Class255) class255).aByte2867) > 0 && ((Class84_Sub5.anInt5425 ^ 0xffffffff) == (i_11_ ^ 0xffffffff)) && (i_14_ ^ 0xffffffff) <= -1 && ((Node_Sub8_Sub4.anInt8360 ^ 0xffffffff) < (i_14_ + ((Class255) class255).size ^ 0xffffffff)) && i_15_ >= 0 && (Node_Sub22.anInt7074 > i_15_ + ((Class255) class255).size)) {
                        NPC NPC = new NPC();
                        ((Entity) NPC).anInt10484 = i_9_;
                        Node_Sub10 class248_sub10_16_ = new Node_Sub10(NPC);
                        Class253_Sub1.aClass65_7514.method509(-1, class248_sub10_16_, (long) i_9_);
                        Node_Sub30.aClass248_Sub10Array7182[Node_Sub8_Sub16_Sub1.anInt10303++] = class248_sub10_16_;
                        Class346_Sub7_Sub2_Sub3.anIntArray10381[Class28.anInt4892++] = i_9_;
                        ((Entity) NPC).anInt10452 = Node_Sub18.anInt7027;
                        NPC.method3670((byte) -111, class255);
                        NPC.setSize((byte) 127, ((Class255) (((NPC) NPC).aClass255_10614)).size);
                        ((Entity) NPC).anInt10480 = (((Class255) (((NPC) NPC).aClass255_10614)).anInt2910 << 533046499);
                        NPC.method3644((byte) -17, ((~0x127ffff8 & 4 + ((Class255) (((NPC) NPC).aClass255_10614)).aByte2883) << 1670109931), true);
                        NPC.method3666(true, i_14_, i_15_, NPC.method3632(-1), i_11_, i ^ 0x1e);
                    }
                }
            }
        }
        if (i != 112)
            method2247(83);
    }

    abstract void method2245(boolean bool);

    int method2246(byte i) {
        if (i != 30)
            aViewport_6952 = null;
        anInt6951++;
        return 0;
    }

    public static void method2247(int i) {
        if (i > -67)
            method2247(-7);
        aViewport_6952 = null;
    }

    Node_Sub11(ha_Sub2 var_ha_Sub2) {
        ((Node_Sub11) this).aHa_Sub2_6953 = var_ha_Sub2;
    }

    final int method2248(int i) {
        anInt6957++;
        int i_17_ = -70 % ((i - 81) / 45);
        return 1;
    }

    abstract void method2249(int i, boolean bool);

    abstract void method2250(int i, int i_18_, int i_19_);
}
