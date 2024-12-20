/* Class346_Sub7_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub3_Sub1 extends Class346_Sub7_Sub3 {
    static int anInt10510;
    static Class280 aClass280_10511;
    static int anInt10512;
    static int[] anIntArray10513 = new int[2];
    int anInt10514;
    private int anInt10515 = 0;
    static int anInt10516;
    static int anInt10517;
    int anInt10518;
    int anInt10519 = -1;
    int anInt10520;
    int anInt10521;
    int anInt10522;
    static int[] anIntArray10523;
    int anInt10524;
    static int anInt10525;
    static int anInt10526;
    private boolean aBoolean10527;
    static int anInt10528;
    static int anInt10529;
    static int anInt10530;
    static int anInt10531;

    final Class38 method3575(byte i, ha var_ha) {
        anInt10530++;
        if (i > -86)
            return null;
        return null;
    }

    final int method3580(int i) {
        anInt10526++;
        if (i != -32768)
            ((Class346_Sub7_Sub3_Sub1) this).anInt10520 = -64;
        return -10;
    }

    public static void method3674(int i) {
        anIntArray10523 = null;
        if (i == -16873) {
            anIntArray10513 = null;
            aClass280_10511 = null;
        }
    }

    final boolean method3563(boolean bool) {
        anInt10510++;
        if (bool != false)
            method3574((byte) 120);
        return aBoolean10527;
    }

    static final void method3675(RSInterface2 item1, boolean bool) {
        anInt10516++;
        if (Class115.aBoolean4952 && bool == false) {
            if (((RSInterface2) item1).anObjectArray4287 != null) {
                RSInterface2 class354_0_ = Class188.method1635(Class346_Sub7_Sub5.anInt9963, InputStream_Sub2.anInt76, 0);
                if (class354_0_ != null) {
                    RSInterface class248_sub6 = new RSInterface();
                    ((RSInterface) class248_sub6).rsInter = item1;
                    ((RSInterface) class248_sub6).interfaceOpcodes = ((RSInterface2) item1).anObjectArray4287;
                    ((RSInterface) class248_sub6).aClass354_6850 = class354_0_;
                    Class47.executeScript(class248_sub6);
                }
            }
            Class14.anInt262++;
            Node_Sub36 class248_sub36 = Class346_Sub1.method3540(1, Class346_Sub5_Sub2.aISAACCypher_9889, Class340_Sub5.aOutgoingOpcode_8138);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt(27695, ((RSInterface2) item1).interfaceValues);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(InputStream_Sub2.anInt76, -231665880);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShortA(((RSInterface2) item1).id, -231665880);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeInt2((byte) -128, Class346_Sub7_Sub5.anInt9963);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeShortA(((RSInterface2) item1).index, 81);
            ((Node_Sub36) class248_sub36).aClass248_Sub9_Sub2_7257.writeLEShort(true, Class168.anInt1963);
            Class226_Sub3.method1814(class248_sub36, 0);
        }
    }

    final int method3567(byte i) {
        anInt10529++;
        if (i < 81)
            ((Class346_Sub7_Sub3_Sub1) this).anInt10520 = 52;
        return anInt10515;
    }

    Class346_Sub7_Sub3_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
        super(i, i_1_, i_2_, i_3_, i_4_);
        ((Class346_Sub7_Sub3_Sub1) this).anInt10518 = -1;
        ((Class346_Sub7_Sub3_Sub1) this).anInt10521 = 0;
        aBoolean10527 = false;
    }

    final int method3570(int i) {
        if (i > 0)
            method3567((byte) -11);
        anInt10531++;
        Class321 class321 = Class283.aClass342_3343.method3482((byte) 118, ((Class346_Sub7_Sub3_Sub1) this).anInt10520);
        int i_5_ = ((Class321) class321).anInt3745;
        if (((Class346_Sub7_Sub3_Sub1) this).anInt10519 != -1) {
            Class321 class321_6_ = Class283.aClass342_3343.method3482((byte) 77, ((Class346_Sub7_Sub3_Sub1) this).anInt10519);
            if ((i_5_ ^ 0xffffffff) > (((Class321) class321_6_).anInt3745 ^ 0xffffffff))
                i_5_ = ((Class321) class321_6_).anInt3745;
        }
        if (((Class346_Sub7_Sub3_Sub1) this).anInt10518 != -1) {
            Class321 class321_7_ = Class283.aClass342_3343.method3482((byte) 80, ((Class346_Sub7_Sub3_Sub1) this).anInt10518);
            if ((((Class321) class321_7_).anInt3745 ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                i_5_ = ((Class321) class321_7_).anInt3745;
        }
        return i_5_;
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10528++;
        Class49 class49 = Class316_Sub2.method3300(((Interactable) this).plane, (((Interactable) this).x >> Class96.anInt1249), (((Interactable) this).y >> Class96.anInt1249));
        if (class49 != null && ((Animable) ((Class49) class49).aAnimable_656).aBoolean9927) {
            int i_8_ = ((Class49) class49).aAnimable_656.method3580(-32768);
            if (((Class346_Sub7_Sub3_Sub1) this).anInt10521 != i_8_) {
                ((Interactable) this).anInt8317 -= ((Class346_Sub7_Sub3_Sub1) this).anInt10521;
                ((Interactable) this).anInt8317 += i_8_;
                ((Class346_Sub7_Sub3_Sub1) this).anInt10521 = i_8_;
            }
        }
        Viewport viewport = var_ha.o();
        viewport.method1866();
        if (class49 == null || !((Animable) ((Class49) class49).aAnimable_656).aBoolean9927) {
            boolean bool = false;
            boolean bool_9_ = false;
            boolean bool_10_ = false;
            s var_s = Class177.aSArray2070[((Interactable) this).aByte8322];
            int i_11_ = anInt10515 << 33246081;
            int i_12_ = i_11_;
            int i_13_ = -i_11_ / 2;
            int i_14_ = -i_12_ / 2;
            int i_15_ = var_s.method3150((byte) 96, ((Interactable) this).x + i_13_, i_14_ + ((Interactable) this).y);
            int i_16_ = i_11_ / 2;
            int i_17_ = -i_12_ / 2;
            int i_18_ = var_s.method3150((byte) 116, ((Interactable) this).x - -i_16_, i_17_ + ((Interactable) this).y);
            int i_19_ = -i_11_ / 2;
            int i_20_ = i_12_ / 2;
            int i_21_ = var_s.method3150((byte) 114, ((Interactable) this).x - -i_19_, i_20_ + ((Interactable) this).y);
            int i_22_ = i_11_ / 2;
            int i_23_ = i_12_ / 2;
            int i_24_ = var_s.method3150((byte) 103, i_22_ + ((Interactable) this).x, ((Interactable) this).y - -i_23_);
            int i_25_ = (i_18_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff) ? i_15_ : i_18_;
            int i_26_ = (i_24_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff) ? i_24_ : i_21_;
            int i_27_ = (i_18_ ^ 0xffffffff) <= (i_24_ ^ 0xffffffff) ? i_24_ : i_18_;
            int i_28_ = (i_15_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff) ? i_15_ : i_21_;
            if ((i_12_ ^ 0xffffffff) != -1) {
                int i_29_ = ((int) (2607.5945876176133 * Math.atan2((double) (-i_26_ + i_25_), (double) i_12_)) & 0x3fff);
                if ((i_29_ ^ 0xffffffff) != -1)
                    viewport.method1873(i_29_);
            }
            int i_30_ = i_24_ + i_15_;
            if ((i_11_ ^ 0xffffffff) != -1) {
                int i_31_ = 0x3fff & (int) (Math.atan2((double) (-i_27_ + i_28_), (double) i_11_) * 2607.5945876176133);
                if (i_31_ != 0)
                    viewport.method1872(-i_31_);
            }
            if ((i_30_ ^ 0xffffffff) < (i_18_ - -i_21_ ^ 0xffffffff))
                i_30_ = i_21_ + i_18_;
            i_30_ = -((Interactable) this).anInt8317 + (i_30_ >> -396848351);
            if ((i_30_ ^ 0xffffffff) != -1)
                viewport.method1862(0, i_30_, 0);
        }
        viewport.method1862(((Interactable) this).x, -10 + ((Interactable) this).anInt8317, ((Interactable) this).y);
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(true, (byte) 125, 3);
        anInt10515 = 0;
        aBoolean10527 = false;
        if (((Class346_Sub7_Sub3_Sub1) this).anInt10518 != -1) {
            Class162 class162 = (Class283.aClass342_3343.method3482((byte) 93, ((Class346_Sub7_Sub3_Sub1) this).anInt10518).method3333(null, 0, null, var_ha, i + -26162, ((Class346_Sub7_Sub3_Sub1) this).anInt10522, 0, 2048, -1));
            if (class162 != null) {
                if (!Class357.aBoolean4416)
                    class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[2]), 0);
                else
                    class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[2]), ObjectDefinition.anInt3100, 0);
                aBoolean10527 |= class162.F();
                anInt10515 = class162.ma();
            }
        }
        if ((((Class346_Sub7_Sub3_Sub1) this).anInt10519 ^ 0xffffffff) != 0) {
            Class162 class162 = (Class283.aClass342_3343.method3482((byte) 83, ((Class346_Sub7_Sub3_Sub1) this).anInt10519).method3333(null, 0, null, var_ha, i + -26162, ((Class346_Sub7_Sub3_Sub1) this).anInt10524, 0, 2048, -1));
            if (class162 != null) {
                if (Class357.aBoolean4416)
                    class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[1]), ObjectDefinition.anInt3100, 0);
                else
                    class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[1]), 0);
                aBoolean10527 |= class162.F();
                if (class162.ma() > anInt10515)
                    anInt10515 = class162.ma();
            }
        }
        Class162 class162 = (Class283.aClass342_3343.method3482((byte) 98, ((Class346_Sub7_Sub3_Sub1) this).anInt10520).method3333(null, 0, null, var_ha, -26163, ((Class346_Sub7_Sub3_Sub1) this).anInt10514, 0, 2048, i));
        if (class162 != null) {
            if (Class357.aBoolean4416)
                class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
            else
                class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
            aBoolean10527 |= class162.F();
            if ((class162.ma() ^ 0xffffffff) < (anInt10515 ^ 0xffffffff))
                anInt10515 = class162.ma();
        }
        return class346_sub10;
    }

    final boolean method3579(ha var_ha, int i, int i_32_, byte i_33_) {
        anInt10512++;
        if (i_33_ != 103)
            return false;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317 + -10, ((Interactable) this).y);
        Class321 class321 = Class283.aClass342_3343.method3482((byte) 96, ((Class346_Sub7_Sub3_Sub1) this).anInt10520);
        Class162 class162 = class321.method3333(null, 0, null, var_ha, -26163, ((Class346_Sub7_Sub3_Sub1) this).anInt10514, 0, 131072, -1);
        if (class162 != null && (!Class357.aBoolean4416 ? class162.method1437(i_32_, i, viewport, true, ((Class321) class321).anInt3745) : class162.method1420(i_32_, i, viewport, true, ((Class321) class321).anInt3745, ObjectDefinition.anInt3100)))
            return true;
        if ((((Class346_Sub7_Sub3_Sub1) this).anInt10519 ^ 0xffffffff) != 0) {
            Class321 class321_34_ = Class283.aClass342_3343.method3482((byte) 72, ((Class346_Sub7_Sub3_Sub1) this).anInt10519);
            class162 = class321_34_.method3333(null, 0, null, var_ha, i_33_ + -26266, (((Class346_Sub7_Sub3_Sub1) this).anInt10524), 0, 131072, -1);
            if (class162 != null && (!Class357.aBoolean4416 ? class162.method1437(i_32_, i, viewport, true, ((Class321) class321_34_).anInt3745) : class162.method1420(i_32_, i, viewport, true, ((Class321) class321_34_).anInt3745, ObjectDefinition.anInt3100)))
                return true;
        }
        if (((Class346_Sub7_Sub3_Sub1) this).anInt10518 != -1) {
            Class321 class321_35_ = Class283.aClass342_3343.method3482((byte) 82, ((Class346_Sub7_Sub3_Sub1) this).anInt10518);
            class162 = class321_35_.method3333(null, 0, null, var_ha, -26163, (((Class346_Sub7_Sub3_Sub1) this).anInt10522), 0, 131072, -1);
            if (class162 != null && (Class357.aBoolean4416 ? class162.method1420(i_32_, i, viewport, true, ((Class321) class321_35_).anInt3745, ObjectDefinition.anInt3100) : class162.method1437(i_32_, i, viewport, true, (((Class321) class321_35_).anInt3745))))
                return true;
        }
        return false;
    }

    final boolean method3574(byte i) {
        int i_36_ = -27 % ((i - 14) / 57);
        anInt10517++;
        return false;
    }

    final void method3573(ha var_ha, byte i) {
        if (i < 121)
            method3580(93);
        anInt10525++;
    }

    static {
        aClass280_10511 = new Class280();
        anIntArray10523 = new int[32];
        int i = 2;
        for (int i_37_ = 0; i_37_ < 32; i_37_++) {
            anIntArray10523[i_37_] = -1 + i;
            i += i;
        }
    }
}
