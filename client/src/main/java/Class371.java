/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class371 {
    static IncommingOpcode aIncommingOpcode_4556;
    private Class84[] aClass84Array4557;
    private int anInt4558 = 0;
    static int anInt4559;
    private int anInt4560 = 0;
    private int anInt4561 = 0;
    Class84_Sub6 aClass84_Sub6_4562;
    private ha_Sub2 aHa_Sub2_4563;
    static RSInterface2 aClass354_4564 = null;
    static int anInt4565;
    private Class183 aClass183_4566;
    static int anInt4567;
    static int anInt4568;
    static Class11 aClass11_4569;

    static final void method3857(byte i) {
        Node_Sub14_Sub26.anInt9430++;
        anInt4567++;
        if (i == 17) {
            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class382.aOutgoingOpcode_4701);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeByte(-41, 0);
            Class226_Sub3.method1814(class248_sub36, 0);
        }
    }

    final boolean method3858(int i, int i_0_) {
        if (i_0_ != 12686)
            aClass183_4566 = null;
        anInt4565++;
        return aClass84Array4557[i].method600(-16777216);
    }

    public static void method3859(int i) {
        aClass354_4564 = null;
        aIncommingOpcode_4556 = null;
        aClass11_4569 = null;
        if (i <= 89)
            aClass354_4564 = null;
    }

    final void method3860(int i, int i_1_, int i_2_, boolean bool, boolean bool_3_, int i_4_) {
        bool_3_ &= aHa_Sub2_4563.n();
        if (i_4_ != 0)
            anInt4561 = -63;
        anInt4568++;
        if (!bool_3_ && ((i_2_ ^ 0xffffffff) == -5 || (i_2_ ^ 0xffffffff) == -9 || i_2_ == 9)) {
            if (i_2_ == 4)
                i_1_ = i;
            i_2_ = 2;
        }
        if ((i_2_ ^ 0xffffffff) != -1 && bool)
            i_2_ |= ~0x7fffffff;
        if ((i_2_ ^ 0xffffffff) == (anInt4558 ^ 0xffffffff)) {
            if ((anInt4558 ^ 0xffffffff) != -1) {
                aClass84Array4557[anInt4558 & 0x7fffffff].method599((byte) -125, bool);
                if (anInt4560 != i || (anInt4561 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
                    aClass84Array4557[0x7fffffff & anInt4558].method601(i, i_1_, -22);
                    anInt4560 = i;
                    anInt4561 = i_1_;
                }
            }
        } else {
            if ((anInt4558 ^ 0xffffffff) != -1)
                aClass84Array4557[anInt4558 & 0x7fffffff].method597(false);
            if (i_2_ != 0) {
                aClass84Array4557[i_2_ & 0x7fffffff].method602(bool, (byte) 20);
                aClass84Array4557[0x7fffffff & i_2_].method599((byte) -124, bool);
                aClass84Array4557[0x7fffffff & i_2_].method601(i, i_1_, -107);
            }
            anInt4560 = i;
            anInt4561 = i_1_;
            anInt4558 = i_2_;
        }
    }

    Class371(ha_Sub2 var_ha_Sub2) {
        aHa_Sub2_4563 = var_ha_Sub2;
        aClass183_4566 = new Class183(var_ha_Sub2);
        aClass84Array4557 = new Class84[10];
        aClass84Array4557[1] = new Class84_Sub1(var_ha_Sub2);
        aClass84Array4557[2] = new Class84_Sub4(var_ha_Sub2, aClass183_4566);
        aClass84Array4557[4] = new Class84_Sub5(var_ha_Sub2, aClass183_4566);
        aClass84Array4557[5] = new Class84_Sub9(var_ha_Sub2, aClass183_4566);
        aClass84Array4557[6] = new Class84_Sub7(var_ha_Sub2);
        aClass84Array4557[7] = new Class84_Sub2(var_ha_Sub2);
        aClass84Array4557[3] = ((Class371) this).aClass84_Sub6_4562 = new Class84_Sub6(var_ha_Sub2);
        aClass84Array4557[8] = new Class84_Sub8(var_ha_Sub2, aClass183_4566);
        aClass84Array4557[9] = new Class84_Sub3(var_ha_Sub2, aClass183_4566);
        if (!aClass84Array4557[8].method600(-16777216))
            aClass84Array4557[8] = aClass84Array4557[4];
        if (!aClass84Array4557[9].method600(-16777216))
            aClass84Array4557[9] = aClass84Array4557[8];
    }

    final boolean method3861(Class136 class136, byte i, int i_5_) {
        int i_6_ = -45 / ((i - 55) / 40);
        anInt4559++;
        if (anInt4558 == 0)
            return false;
        aClass84Array4557[anInt4558 & 0x7fffffff].method603((byte) 121, i_5_, class136);
        return true;
    }

    static {
        aIncommingOpcode_4556 = new IncommingOpcode(60, 0);
    }
}
