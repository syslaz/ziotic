/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 {
    int anInt535;
    static int anInt536;
    Class313 aClass313_537;
    static int anInt538;
    Node_Sub31_Sub1 aClass248_Sub31_Sub1_539;
    static int anInt540;
    byte aByte541;
    Interactable aInteractable_542;
    static int anInt543;
    int anInt544;
    int anInt545;
    int anInt546;
    Node_Sub34 aClass248_Sub34_547;
    static int anInt548 = 0;
    int anInt549;
    Node_Sub15_Sub2 aClass248_Sub15_Sub2_550;
    int anInt551;

    static final void method305(int i, int i_0_, int i_1_, long l, boolean bool, Class381 class381, int i_2_, int i_3_) {
        Class84_Sub9.aBoolean5496 = bool;
        Class113.anInt1399 = i_1_;
        Class341.aClass248_Sub15_Sub1_3980 = null;
        Class351.anInt4736 = i_2_;
        Class15.aLong283 = l;
        NPC.aClass381_10591 = class381;
        anInt540++;
        Class54_Sub1.anInt5328 = 10000;
        Class332.anInt3883 = 1;
        if (i_3_ != 0)
            anInt548 = 19;
        Node_Sub2_Sub2.anInt8839 = i_0_;
        Class278.anInt3236 = i;
    }

    final boolean method306(int i) {
        if (i != 4236)
            return false;
        anInt543++;
        if (((Class42) this).aByte541 != 2 && ((Class42) this).aByte541 != 3)
            return false;
        return true;
    }

    static final void method307(boolean bool, String string, byte i, String string_4_) {
        Class212.aString2453 = string_4_;
        Node_Sub8.aString6862 = string;
        if (i == 16) {
            anInt536++;
            Class346.aBoolean4126 = bool;
            if (!Class346.aBoolean4126 && (Class212.aString2453.equals("") || Node_Sub8.aString6862.equals("")))
                Class84_Sub1.method605(3, (byte) -111);
            else {
                Player.aBoolean10544 = false;
                if ((Class154.loginType ^ 0xffffffff) != -2) {
                    Class81.anInt4908 = -1;
                    Node_Sub8_Sub19.anInt9082 = 0;
                }
                Class84_Sub1.method605(-3, (byte) -111);
                Class321.loginStage = 1;
                Class59.anInt815 = 0;
                Class198.anInt2248 = 0;
            }
        }
    }

    static final void method308(boolean bool, byte i) {
        anInt538++;
        if (i >= -122)
            anInt548 = 71;
        for (Node_Sub51 class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3119(2); class248_sub51 != null; class248_sub51 = (Node_Sub51) Class144.aClass293_1702.method3107(-127)) {
            if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
            }
            if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 != null) {
                Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454);
                ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7454 = null;
            }
            class248_sub51.remove(true);
        }
        if (bool) {
            for (Node_Sub51 class248_sub51 = (Node_Sub51) Class333.aClass293_3901.method3119(2); class248_sub51 != null; class248_sub51 = ((Node_Sub51) Class333.aClass293_3901.method3107(-127))) {
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                }
                class248_sub51.remove(true);
            }
            for (Node_Sub51 class248_sub51 = (Node_Sub51) Class363.aClass65_4475.method510(true); class248_sub51 != null; class248_sub51 = ((Node_Sub51) Class363.aClass65_4475.method512(false))) {
                if (((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 != null) {
                    Class282_Sub15.aClass248_Sub15_Sub3_7751.method2489(((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460);
                    ((Node_Sub51) class248_sub51).aClass248_Sub15_Sub2_7460 = null;
                }
                class248_sub51.remove(true);
            }
        }
    }

    Class42(byte i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, Interactable interactable) {
        ((Class42) this).aInteractable_542 = interactable;
        ((Class42) this).anInt546 = i_10_;
        ((Class42) this).anInt544 = i_6_;
        ((Class42) this).anInt545 = i_7_;
        ((Class42) this).anInt549 = i_5_;
        ((Class42) this).anInt535 = i_8_;
        ((Class42) this).aByte541 = i;
        ((Class42) this).anInt551 = i_9_;
    }
}
