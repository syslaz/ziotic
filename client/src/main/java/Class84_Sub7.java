/* Class84_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class84_Sub7 extends Class84 {
    static int anInt5457;
    static int anInt5458;
    static int anInt5459;
    static int anInt5460;
    static boolean[][][] aBooleanArrayArrayArray5461;
    static int anInt5462;
    static int anInt5463;
    static int anInt5464;
    static OutgoingOpcode aOutgoingOpcode_5465 = new OutgoingOpcode(25, -1);
    static int anInt5466;
    static int anInt5467;
    static float aFloat5468;
    static OutgoingOpcode aOutgoingOpcode_5469 = new OutgoingOpcode(79, -1);
    static float aFloat5470;
    static boolean[][] aBooleanArrayArray5471 = {new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};

    static final void method623(byte i, Class381 class381, Class381 class381_0_, Class381 class381_1_, Class381 class381_2_) {
        anInt5459++;
        Class203.aClass381_2304 = class381;
        Class346_Sub2.aClass381_8257 = class381_2_;
        Class158.aClass381_1884 = class381_1_;
        if (i == -11) {
            Node_Sub8_Sub14_Sub1.aClass354ArrayArray10290 = new RSInterface2[Class346_Sub2.aClass381_8257.method3902(0)][];
            Class77.aBooleanArray988 = new boolean[Class346_Sub2.aClass381_8257.method3902(0)];
        }
    }

    Class84_Sub7(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
    }

    final boolean method600(int i) {
        if (i != -16777216)
            return false;
        anInt5462++;
        return true;
    }

    static final boolean method624(int i, int i_3_, int i_4_) {
        anInt5466++;
        if (i_3_ != -27679)
            aBooleanArrayArrayArray5461 = null;
        if (!(Class282_Sub29.method3045(i_3_ + 27682, i_4_, i) | (i_4_ & 0x800) != 0) && !Class136_Sub2.method1256(i_4_, 124, i))
            return false;
        return true;
    }

    public static void method625(int i) {
        aOutgoingOpcode_5469 = null;
        if (i != 0)
            aBooleanArrayArray5471 = null;
        aOutgoingOpcode_5465 = null;
        aBooleanArrayArrayArray5461 = null;
        aBooleanArrayArray5471 = null;
    }

    final void method597(boolean bool) {
        anInt5457++;
        ((Class84) this).aHa_Sub2_1036.method902(41, bool);
    }

    final void method599(byte i, boolean bool) {
        if (i > -123)
            aBooleanArrayArrayArray5461 = null;
        anInt5467++;
    }

    final void method601(int i, int i_5_, int i_6_) {
        int i_7_ = 46 % ((i_6_ - 74) / 36);
        anInt5463++;
    }

    final void method602(boolean bool, byte i) {
        anInt5464++;
        if (i > 1)
            ((Class84) this).aHa_Sub2_1036.method902(-118, true);
    }

    final void method603(byte i, int i_8_, Class136 class136) {
        anInt5460++;
        ((Class84) this).aHa_Sub2_1036.method889(-2, class136);
        ((Class84) this).aHa_Sub2_1036.method881((byte) 121, i_8_);
        if (i < 53)
            method625(-72);
    }
}
