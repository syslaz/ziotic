/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 {
    static int anInt270;
    int anInt271;
    int anInt272;
    int anInt273;
    int anInt274 = 128;
    static int anInt275;
    static int anInt276;
    static int anInt277;
    static float aFloat278;
    int anInt279;
    int anInt280;
    static int anInt281;
    static Class310_Sub1 aClass310_Sub1_282;
    static long aLong283;

    final Class15 method215(int i) {
        if (i != -1)
            method219(6, -91, 4, 82);
        anInt281++;
        return new Class15(((Class15) this).anInt280, ((Class15) this).anInt274, ((Class15) this).anInt273, ((Class15) this).anInt271, ((Class15) this).anInt272, ((Class15) this).anInt279);
    }

    static final boolean method216(int i) {
        anInt270++;
        try {
            if (Class332.anInt3883 == 2) {
                if (Class231.aClass248_Sub44_2609 == null) {
                    Class231.aClass248_Sub44_2609 = (Node_Sub44.method2640(NPC.aClass381_10591, Class278.anInt3236, Class113.anInt1399));
                    if (Class231.aClass248_Sub44_2609 == null)
                        return false;
                }
                if (Class45.aClass154_566 == null)
                    Class45.aClass154_566 = new Class154(Class162.aClass381_1910, Node_Sub13.aClass381_6967);
                Node_Sub15_Sub1 class248_sub15_sub1 = Class161.aClass248_Sub15_Sub1_1895;
                if (Class341.aClass248_Sub15_Sub1_3980 != null)
                    class248_sub15_sub1 = Class341.aClass248_Sub15_Sub1_3980;
                if (class248_sub15_sub1.method2433(-28410, (Class231.aClass248_Sub44_2609), Class45.aClass154_566, 22050, Class44.aClass381_558)) {
                    Class161.aClass248_Sub15_Sub1_1895 = class248_sub15_sub1;
                    Class161.aClass248_Sub15_Sub1_1895.method2430((byte) -91);
                    if ((Class351.anInt4736 ^ 0xffffffff) >= -1) {
                        Class332.anInt3883 = 0;
                        Class161.aClass248_Sub15_Sub1_1895.method2413(true, Node_Sub2_Sub2.anInt8839);
                        for (int i_0_ = 0; ((Node_Sub8_Sub3.anIntArray8924.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
                            Class161.aClass248_Sub15_Sub1_1895.method2422((byte) -119, i_0_, Node_Sub8_Sub3.anIntArray8924[i_0_]);
                            Node_Sub8_Sub3.anIntArray8924[i_0_] = 255;
                        }
                    } else {
                        Class332.anInt3883 = 3;
                        Class161.aClass248_Sub15_Sub1_1895.method2413(true, ((Node_Sub2_Sub2.anInt8839 >= Class351.anInt4736) ? Class351.anInt4736 : Node_Sub2_Sub2.anInt8839));
                        for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (Node_Sub8_Sub3.anIntArray8924.length ^ 0xffffffff)); i_1_++) {
                            Class161.aClass248_Sub15_Sub1_1895.method2422((byte) -119, i_1_, Node_Sub8_Sub3.anIntArray8924[i_1_]);
                            Node_Sub8_Sub3.anIntArray8924[i_1_] = 255;
                        }
                    }
                    if (Class341.aClass248_Sub15_Sub1_3980 == null) {
                        if (aLong283 <= 0L)
                            Class161.aClass248_Sub15_Sub1_1895.method2416(i ^ ~0x4eb8, Class231.aClass248_Sub44_2609, Class84_Sub9.aBoolean5496);
                        else
                            Class161.aClass248_Sub15_Sub1_1895.method2426(Class84_Sub9.aBoolean5496, true, Class231.aClass248_Sub44_2609, aLong283, (byte) 28);
                    }
                    if (Class281.aClass345_3273 != null)
                        Class281.aClass345_3273.method3530(Class161.aClass248_Sub15_Sub1_1895, 82);
                    Class231.aClass248_Sub44_2609 = null;
                    aLong283 = 0L;
                    Class341.aClass248_Sub15_Sub1_3980 = null;
                    NPC.aClass381_10591 = null;
                    Class45.aClass154_566 = null;
                    return true;
                }
            }
            if (i != 28984)
                aFloat278 = -1.4794431F;
        } catch (Exception exception) {
            exception.printStackTrace();
            Class161.aClass248_Sub15_Sub1_1895.method2420(2064);
            Class231.aClass248_Sub44_2609 = null;
            Class332.anInt3883 = 0;
            Class45.aClass154_566 = null;
            Class341.aClass248_Sub15_Sub1_3980 = null;
            NPC.aClass381_10591 = null;
        }
        return false;
    }

    final void method217(Class15 class15_2_, boolean bool) {
        ((Class15) this).anInt272 = ((Class15) class15_2_).anInt272;
        anInt276++;
        ((Class15) this).anInt274 = ((Class15) class15_2_).anInt274;
        ((Class15) this).anInt279 = ((Class15) class15_2_).anInt279;
        ((Class15) this).anInt273 = ((Class15) class15_2_).anInt273;
        ((Class15) this).anInt280 = ((Class15) class15_2_).anInt280;
        ((Class15) this).anInt271 = ((Class15) class15_2_).anInt271;
        if (bool != false)
            method218(-103);
    }

    public static void method218(int i) {
        if (i == 0)
            aClass310_Sub1_282 = null;
    }

    static final int method219(int i, int i_3_, int i_4_, int i_5_) {
        anInt275++;
        if ((i_5_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff))
            return i_3_;
        int i_6_ = -i_4_ + 128;
        int i_7_ = i_4_ * (i_5_ & 0x7f) + i_6_ * (i_3_ & 0x7f) >> -2139689625;
        int i_8_ = i_6_ * (0x380 & i_3_) - -((i_5_ & 0x380) * i_4_) >> 618720519;
        int i_9_ = i_6_ * (i & i_3_) - -((i_5_ & 0xfc00) * i_4_) >> 189536903;
        return i_7_ & 0x7f | (0x380 & i_8_ | i_9_ & 0xfc00);
    }

    Class15(int i) {
        ((Class15) this).anInt273 = 128;
        ((Class15) this).anInt280 = i;
    }

    private Class15(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
        ((Class15) this).anInt273 = 128;
        ((Class15) this).anInt280 = i;
        ((Class15) this).anInt279 = i_14_;
        ((Class15) this).anInt271 = i_12_;
        ((Class15) this).anInt272 = i_13_;
        ((Class15) this).anInt273 = i_11_;
        ((Class15) this).anInt274 = i_10_;
    }
}
