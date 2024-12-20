/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 {
    static Class174 aClass174_1661;
    Interface6 anInterface6_1662;
    static int[] anIntArray1663 = {0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
    byte aByte1664;
    static int anInt1665;
    short aShort1666;
    static int anInt1667;
    byte aByte1668;

    public static void method1281(byte i) {
        aClass174_1661 = null;
        if (i != 85)
            method1281((byte) -56);
        anIntArray1663 = null;
    }

    static final void method1282(byte i, Entity entity) {
        anInt1667++;
        do {
            if (((Entity) entity).anInt10434 != -1) {
                Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, (((Entity) entity).anInt10434)));
                if (class182 == null || ((Class182) class182).anIntArray2117 == null) {
                    ((Entity) entity).anInt10434 = -1;
                    ((Entity) entity).aBoolean10491 = false;
                } else {
                    ((Entity) entity).anInt10478++;
                    if (((((Class182) class182).anIntArray2117.length ^ 0xffffffff) < (((Entity) entity).anInt10448 ^ 0xffffffff)) && (((Entity) entity).anInt10478 > (((Class182) class182).anIntArray2113[((Entity) entity).anInt10448]))) {
                        ((Entity) entity).anInt10448++;
                        ((Entity) entity).anInt10488++;
                        ((Entity) entity).anInt10478 = 1;
                        if (!((Entity) entity).aBoolean10439)
                            Class158.method1396(class182, (((Entity) entity).anInt10448), entity, true);
                    }
                    if ((((Entity) entity).anInt10448) >= ((Class182) class182).anIntArray2117.length) {
                        ((Entity) entity).anInt10478 = 0;
                        ((Entity) entity).anInt10448 = 0;
                        if (((Entity) entity).aBoolean10491) {
                            ((Entity) entity).anInt10434 = entity.method3642(0).method2910(false);
                            if ((((Entity) entity).anInt10434 ^ 0xffffffff) == 0) {
                                ((Entity) entity).aBoolean10491 = false;
                                break;
                            }
                            class182 = (Class235.aClass356_2617.method3790((byte) -90, ((Entity) entity).anInt10434));
                        }
                        if (!((Entity) entity).aBoolean10439)
                            Class158.method1396(class182, (((Entity) entity).anInt10448), entity, true);
                    }
                    ((Entity) entity).anInt10488 = 1 + ((Entity) entity).anInt10448;
                    if (((Class182) class182).anIntArray2117 == null) {
                        ((Entity) entity).aBoolean10491 = false;
                        ((Entity) entity).anInt10434 = -1;
                    } else if ((((Entity) entity).anInt10488 ^ 0xffffffff) <= (((Class182) class182).anIntArray2117.length ^ 0xffffffff))
                        ((Entity) entity).anInt10488 = 0;
                }
            }
        } while (false);
        for (int i_0_ = 0; i_0_ < (((Entity) entity).aClass305Array10441).length; i_0_++) {
            if ((((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 ^ 0xffffffff) != 0 && ((Node_Sub18.anInt7027 ^ 0xffffffff) <= (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3538 ^ 0xffffffff))) {
                Class51 class51 = (Class279_Sub2.aClass151_7577.method1353(((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537, -1));
                int i_1_ = ((Class51) class51).anInt690;
                if ((i_1_ ^ 0xffffffff) != 0) {
                    Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, i_1_);
                    if (((Class51) class51).aBoolean682) {
                        if (((Class182) class182).anInt2107 != 3) {
                            if (((Class182) class182).anInt2107 == 1 && ((Entity) entity).anInt10505 > 0 && (((Entity) entity).forceMovementSpeed1 <= Node_Sub18.anInt7027) && (Node_Sub18.anInt7027 > ((Entity) entity).forceMovementSpeed2)) {
                                ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3538 = 1 + Node_Sub18.anInt7027;
                                continue;
                            }
                        } else if (((Entity) entity).anInt10505 > 0 && ((Node_Sub18.anInt7027 ^ 0xffffffff) <= (((Entity) entity).forceMovementSpeed1 ^ 0xffffffff)) && ((Node_Sub18.anInt7027 ^ 0xffffffff) < (((Entity) entity).forceMovementSpeed2 ^ 0xffffffff))) {
                            ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 = -1;
                            continue;
                        }
                    }
                    if (class182 != null && ((Class182) class182).anIntArray2117 != null) {
                        if (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542 < 0) {
                            ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542 = 0;
                            if (!((Entity) entity).aBoolean10439)
                                Class158.method1396(class182, 0, entity, true);
                        }
                        ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3541++;
                        if ((((((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542) ^ 0xffffffff) > (((Class182) class182).anIntArray2117.length ^ 0xffffffff)) && ((((Class182) class182).anIntArray2113[(((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542)]) < (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3541))) {
                            ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3541 = 1;
                            ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542++;
                            if (!((Entity) entity).aBoolean10439)
                                Class158.method1396(class182, (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542), entity, true);
                        }
                        if ((((Class182) class182).anIntArray2117.length ^ 0xffffffff) >= ((((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542) ^ 0xffffffff)) {
                            if (((Class51) class51).aBoolean682) {
                                ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542 -= ((Class182) class182).anInt2130;
                                ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3545++;
                                if (((Class182) class182).anInt2122 > ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3545) {
                                    if (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542 < 0 || (((((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542) ^ 0xffffffff) <= ((((Class182) class182).anIntArray2117).length ^ 0xffffffff)))
                                        ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 = -1;
                                    else if (!((Entity) entity).aBoolean10439)
                                        Class158.method1396(class182, (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542), entity, true);
                                } else
                                    ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 = -1;
                            } else
                                ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 = -1;
                        }
                        ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536 = (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3542) - -1;
                        if (((Class182) class182).anIntArray2117.length <= (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536)) {
                            if (((Class51) class51).aBoolean682) {
                                ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536 -= ((Class182) class182).anInt2130;
                                if ((((Class182) class182).anInt2122 ^ 0xffffffff) < (1 + (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3545) ^ 0xffffffff)) {
                                    if (((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536 < 0 || (((((Class182) class182).anIntArray2117).length ^ 0xffffffff) >= ((((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536) ^ 0xffffffff)))
                                        ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536 = -1;
                                } else
                                    ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536 = -1;
                            } else
                                ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3536 = -1;
                        }
                    } else
                        ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 = -1;
                } else
                    ((Class305) (((Entity) entity).aClass305Array10441[i_0_])).anInt3537 = -1;
            }
        }
        if (i > -86)
            anIntArray1663 = null;
        if ((((Entity) entity).anInt10444 != -1) && (((Entity) entity).anInt10424 ^ 0xffffffff) >= -2) {
            Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, (((Entity) entity).anInt10444)));
            if ((((Class182) class182).anInt2107 ^ 0xffffffff) == -4) {
                if ((((Entity) entity).anInt10505) > 0 && (((Entity) entity).forceMovementSpeed1) <= Node_Sub18.anInt7027 && (Node_Sub18.anInt7027 > (((Entity) entity).forceMovementSpeed2))) {
                    ((Entity) entity).anIntArray10414 = null;
                    ((Entity) entity).anInt10444 = -1;
                }
            } else if ((((Class182) class182).anInt2107 ^ 0xffffffff) == -2 && ((((Entity) entity).anInt10505) ^ 0xffffffff) < -1 && (Node_Sub18.anInt7027 >= ((Entity) entity).forceMovementSpeed1) && ((((Entity) entity).forceMovementSpeed2 ^ 0xffffffff) > (Node_Sub18.anInt7027 ^ 0xffffffff)))
                ((Entity) entity).anInt10424 = 2;
        }
        if ((((Entity) entity).anInt10444 ^ 0xffffffff) != 0 && (((Entity) entity).anInt10424 ^ 0xffffffff) == -1) {
            Class182 class182 = (Class235.aClass356_2617.method3790((byte) -90, (((Entity) entity).anInt10444)));
            if (class182 == null || ((Class182) class182).anIntArray2117 == null) {
                ((Entity) entity).anIntArray10414 = null;
                ((Entity) entity).anInt10444 = -1;
            } else {
                ((Entity) entity).anInt10466++;
                if ((((((Entity) entity).anInt10420) ^ 0xffffffff) > (((Class182) class182).anIntArray2117.length ^ 0xffffffff)) && (((((Class182) class182).anIntArray2113[(((Entity) entity).anInt10420)]) ^ 0xffffffff) > ((((Entity) entity).anInt10466) ^ 0xffffffff))) {
                    ((Entity) entity).anInt10466 = 1;
                    ((Entity) entity).anInt10420++;
                    if (!((Entity) entity).aBoolean10439)
                        Class158.method1396(class182, (((Entity) entity).anInt10420), entity, true);
                }
                if (((((Entity) entity).anInt10420) ^ 0xffffffff) <= (((Class182) class182).anIntArray2117.length ^ 0xffffffff)) {
                    ((Entity) entity).anInt10419++;
                    ((Entity) entity).anInt10420 -= ((Class182) class182).anInt2130;
                    if ((((Entity) entity).anInt10419) >= ((Class182) class182).anInt2122) {
                        ((Entity) entity).anIntArray10414 = null;
                        ((Entity) entity).anInt10444 = -1;
                    } else if (((Entity) entity).anInt10420 < 0 || ((((Class182) class182).anIntArray2117.length ^ 0xffffffff) >= (((Entity) entity).anInt10420 ^ 0xffffffff))) {
                        ((Entity) entity).anInt10444 = -1;
                        ((Entity) entity).anIntArray10414 = null;
                    } else if (!((Entity) entity).aBoolean10439)
                        Class158.method1396(class182, (((Entity) entity).anInt10420), entity, true);
                }
                ((Entity) entity).anInt10407 = (((Entity) entity).anInt10420) - -1;
                if (((Class182) class182).anIntArray2117.length <= (((Entity) entity).anInt10407)) {
                    ((Entity) entity).anInt10407 -= ((Class182) class182).anInt2130;
                    if (((Class182) class182).anInt2122 <= 1 + ((Entity) entity).anInt10419)
                        ((Entity) entity).anInt10407 = -1;
                    else if ((((Entity) entity).anInt10407 ^ 0xffffffff) > -1 || ((((Entity) entity).anInt10407 ^ 0xffffffff) <= ((((Class182) class182).anIntArray2117).length ^ 0xffffffff)))
                        ((Entity) entity).anInt10407 = -1;
                }
            }
        }
        if (((Entity) entity).anInt10424 > 0)
            ((Entity) entity).anInt10424--;
        for (int i_2_ = 0; (((Entity) entity).aClass286Array10463).length > i_2_; i_2_++) {
            Class286 class286 = (((Entity) entity).aClass286Array10463[i_2_]);
            if (class286 != null) {
                if ((((Class286) class286).anInt3376 ^ 0xffffffff) < -1)
                    ((Class286) class286).anInt3376--;
                else {
                    Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, (((Class286) class286).anInt3379));
                    if (class182 == null || ((Class182) class182).anIntArray2117 == null)
                        ((Entity) entity).aClass286Array10463[i_2_] = null;
                    else {
                        ((Class286) class286).anInt3373++;
                        if ((((Class182) class182).anIntArray2117.length > ((Class286) class286).anInt3374) && ((((Class286) class286).anInt3373 ^ 0xffffffff) < ((((Class182) class182).anIntArray2113[((Class286) class286).anInt3374]) ^ 0xffffffff))) {
                            ((Class286) class286).anInt3373 = 1;
                            ((Class286) class286).anInt3374++;
                            if (!((Entity) entity).aBoolean10439)
                                Class158.method1396(class182, (((Class286) class286).anInt3374), entity, true);
                        }
                        if ((((Class182) class182).anIntArray2117.length ^ 0xffffffff) >= (((Class286) class286).anInt3374 ^ 0xffffffff)) {
                            ((Class286) class286).anInt3374 -= ((Class182) class182).anInt2130;
                            ((Class286) class286).anInt3377++;
                            if ((((Class286) class286).anInt3377 ^ 0xffffffff) <= (((Class182) class182).anInt2122 ^ 0xffffffff))
                                ((Entity) entity).aClass286Array10463[i_2_] = null;
                            else if (((Class286) class286).anInt3374 >= 0 && (((((Class182) class182).anIntArray2117).length ^ 0xffffffff) < (((Class286) class286).anInt3374 ^ 0xffffffff))) {
                                if (!((Entity) entity).aBoolean10439)
                                    Class158.method1396(class182, ((Class286) class286).anInt3374, entity, true);
                            } else
                                ((Entity) entity).aClass286Array10463[i_2_] = null;
                        }
                        ((Class286) class286).anInt3378 = ((Class286) class286).anInt3374 - -1;
                        if (((Class182) class182).anIntArray2117.length <= ((Class286) class286).anInt3378) {
                            ((Class286) class286).anInt3378 -= ((Class182) class182).anInt2130;
                            if ((((Class182) class182).anInt2122 ^ 0xffffffff) >= (((Class286) class286).anInt3377 + 1 ^ 0xffffffff))
                                ((Class286) class286).anInt3378 = -1;
                            else if (((Class286) class286).anInt3378 < 0 || ((((Class182) class182).anIntArray2117).length <= ((Class286) class286).anInt3378))
                                ((Class286) class286).anInt3378 = -1;
                        }
                    }
                }
            }
        }
    }

    Class140(Interface6 interface6, int i, int i_3_, int i_4_) {
        ((Class140) this).aByte1664 = (byte) i_4_;
        ((Class140) this).anInterface6_1662 = interface6;
        ((Class140) this).aShort1666 = (short) i;
        ((Class140) this).aByte1668 = (byte) i_3_;
    }
}
