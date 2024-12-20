/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class272 {
    static int anInt3162;
    static int anInt3163;
    static int anInt3164;
    static Class129[] aClass129Array3165;
    static Viewport aViewport_3166;
    static int anInt3167;
    static int anInt3168;
    static int anInt3169 = 0;
    static long aLong3170 = 0L;

    public static void method2835(int i) {
        aViewport_3166 = null;
        int i_0_ = -72 % ((i - -65) / 53);
        aClass129Array3165 = null;
    }

    static final void method2836(RSInterface2[] class354s, int i, byte i_1_) {
        anInt3168++;
        if (i_1_ != -107)
            aClass129Array3165 = null;
        for (int i_2_ = 0; class354s.length > i_2_; i_2_++) {
            RSInterface2 class354 = class354s[i_2_];
            if (class354 != null && ((((RSInterface2) class354).anInt4300 ^ 0xffffffff) == (i ^ 0xffffffff)) && !client.method119(class354)) {
                if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -1) {
                    method2836(class354s, ((RSInterface2) class354).interfaceValues, (byte) -107);
                    if (((RSInterface2) class354).aClass354Array4285 != null)
                        method2836(((RSInterface2) class354).aClass354Array4285, ((RSInterface2) class354).interfaceValues, (byte) -107);
                    Node_Sub12 class248_sub12 = ((Node_Sub12) (Class109.aClass65_1375.method501((long) ((RSInterface2) class354).interfaceValues, (byte) 31)));
                    if (class248_sub12 != null)
                        Class238_Sub3.method1909(-1, ((Node_Sub12) class248_sub12).anInt6964);
                }
                if ((((RSInterface2) class354).anInt4284 ^ 0xffffffff) == -7 && ((RSInterface2) class354).anInt4248 != -1) {
                    Class182 class182 = Class235.aClass356_2617.method3790((byte) -90, (((RSInterface2) class354).anInt4248));
                    if (class182 != null) {
                        ((RSInterface2) class354).anInt4234 += Class77.anInt998;
                        int i_3_ = ((RSInterface2) class354).anInt4237;
                        while ((((Class182) class182).anIntArray2113[((RSInterface2) class354).anInt4237]) < ((RSInterface2) class354).anInt4234) {
                            ((RSInterface2) class354).anInt4234 -= (((Class182) class182).anIntArray2113[((RSInterface2) class354).anInt4237]);
                            ((RSInterface2) class354).anInt4237++;
                            if (((RSInterface2) class354).anInt4237 >= (((Class182) class182).anIntArray2117).length) {
                                ((RSInterface2) class354).anInt4237 -= ((Class182) class182).anInt2130;
                                if ((((RSInterface2) class354).anInt4237 ^ 0xffffffff) > -1 || (((RSInterface2) class354).anInt4237 >= (((Class182) class182).anIntArray2117).length))
                                    ((RSInterface2) class354).anInt4237 = 0;
                            }
                            ((RSInterface2) class354).anInt4282 = 1 + ((RSInterface2) class354).anInt4237;
                            if (((RSInterface2) class354).anInt4282 >= (((Class182) class182).anIntArray2117).length) {
                                ((RSInterface2) class354).anInt4282 -= ((Class182) class182).anInt2130;
                                if (((RSInterface2) class354).anInt4282 < 0 || (((((Class182) class182).anIntArray2117).length ^ 0xffffffff) >= (((RSInterface2) class354).anInt4282 ^ 0xffffffff)))
                                    ((RSInterface2) class354).anInt4282 = -1;
                            }
                            Class376.method3882(class354, i_1_ + 2367);
                        }
                        if (i_3_ != ((RSInterface2) class354).anInt4237)
                            aa_Sub1.method157(class182, false, ((RSInterface2) class354).anInt4237);
                    }
                }
            }
        }
    }

    public Class272() {
        /* empty */
    }

    static final void method2837(Player player, int i, boolean bool) {
        anInt3167++;
        if (Class379.anInt4638 < 400) {
            if (i != 0)
                aClass129Array3165 = null;
            if (player == Class347.myPlayer) {
                if (Class115.aBoolean4952 && (0x10 & Class346_Sub2.anInt8264) != 0) {
                    Node_Sub8_Sub12.anInt9007++;
                    Class131.method1211(true, (long) ((Entity) player).anInt10484, 0L, false, 0, 22, false, -1, Class292.anInt3423, Node_Sub8_Sub4.aString8364, (byte) 87, (Class287.aString3382 + " -> <col=ffffff>" + Class41.aClass41_503.method301(Class191.anInt4822, (byte) -108)), 0);
                }
            } else {
                String string;
                if (((Player) player).anInt10545 != 0) {
                    if (((Player) player).anInt10545 == -1)
                        string = player.method3657(-116, true);
                    else
                        string = (player.method3657(-116, true) + " (" + Class41.aClass41_495.method301((Class191.anInt4822), (byte) -108) + ((Player) player).anInt10545 + ")");
                } else {
                    boolean bool_4_ = true;
                    if (((((Player) Class347.myPlayer).anInt10541) ^ 0xffffffff) != 0 && ((Player) player).anInt10541 != -1) {
                        int i_5_ = (((((Player) Class347.myPlayer).anInt10541) >= ((Player) player).anInt10541) ? ((Player) player).anInt10541 : (((Player) Class347.myPlayer).anInt10541));
                        int i_6_ = ((((Player) Class347.myPlayer).anInt10546) + -((Player) player).anInt10546);
                        if (i_6_ < 0)
                            i_6_ = -i_6_;
                        if ((i_6_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
                            bool_4_ = false;
                    }
                    String string_7_ = (Class359.aClass215_4430 != Class12.aClass215_249 ? Class41.aClass41_494.method301(Class191.anInt4822, (byte) -108) : Class41.aClass41_496.method301(Class191.anInt4822, (byte) -108));
                    if ((((Player) player).anInt10573 ^ 0xffffffff) < (((Player) player).anInt10546 ^ 0xffffffff))
                        string = (player.method3657(i + -116, true) + (!bool_4_ ? "<col=ffffff>" : (Class150.method1340((((Player) (Class347.myPlayer)).anInt10546), false, (((Player) player).anInt10546)))) + " (" + string_7_ + ((Player) player).anInt10546 + "+" + (-((Player) player).anInt10546 + ((Player) player).anInt10573) + ")");
                    else
                        string = (player.method3657(i ^ ~0x73, true) + (!bool_4_ ? "<col=ffffff>" : (Class150.method1340((((Player) (Class347.myPlayer)).anInt10546), false, (((Player) player).anInt10546)))) + " (" + string_7_ + ((Player) player).anInt10546 + ")");
                }
                if (Class115.aBoolean4952 && !bool && (Class346_Sub2.anInt8264 & 0x8) != 0) {
                    Class131.method1211(true, (long) ((Entity) player).anInt10484, (long) ((Entity) player).anInt10484, false, 0, 60, false, -1, Class292.anInt3423, Node_Sub8_Sub4.aString8364, (byte) 87, Class287.aString3382 + " -> <col=ffffff>" + string, 0);
                    Class59.anInt800++;
                }
                if (!bool) {
                    for (int i_8_ = 7; i_8_ >= 0; i_8_--) {
                        if (Node_Sub14_Sub14.aStringArray9304[i_8_] != null) {
                            short i_9_ = 0;
                            if ((Class346_Sub7_Sub2_Sub3.aClass215_10385 != Class12.aClass215_249) || !(Node_Sub14_Sub14.aStringArray9304[i_8_].equalsIgnoreCase(Class41.aClass41_489.method301(Class191.anInt4822, (byte) -108)))) {
                                if (Node_Sub8.aBooleanArray6868[i_8_])
                                    i_9_ = (short) 2000;
                            } else {
                                if ((((Player) (Class347.myPlayer)).anInt10546) < (((Player) player).anInt10546))
                                    i_9_ = (short) 2000;
                                if (((((Player) (Class347.myPlayer)).anInt10542) ^ 0xffffffff) != -1 && ((((Player) player).anInt10542) ^ 0xffffffff) != -1) {
                                    if (((((Player) player).anInt10542) ^ 0xffffffff) == ((((Player) (Class347.myPlayer)).anInt10542) ^ 0xffffffff))
                                        i_9_ = (short) 2000;
                                    else
                                        i_9_ = (short) 0;
                                }
                            }
                            short i_10_ = (short) (Class176.aShortArray2062[i_8_] + i_9_);
                            int i_11_ = ((Class346_Sub7_Sub3.anIntArray9943[i_8_] != -1) ? Class346_Sub7_Sub3.anIntArray9943[i_8_] : Class182.anInt2123);
                            Class131.method1211(true, (long) (((Entity) player).anInt10484), (long) (((Entity) player).anInt10484), false, 0, i_10_, false, -1, i_11_, Node_Sub14_Sub14.aStringArray9304[i_8_], (byte) 87, "<col=ffffff>" + string, 0);
                            Class90.anInt1160++;
                        }
                    }
                } else
                    Class131.method1211(false, (long) (((Entity) player).anInt10484), 0L, false, 0, -1, true, 0, -1, "<col=cccccc>" + string, (byte) 87, "", 0);
                if (!bool) {
                    for (Node_Sub8_Sub11 class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3119(2)); class248_sub8_sub11 != null; class248_sub8_sub11 = ((Node_Sub8_Sub11) Class358.aClass293_4424.method3107(-128))) {
                        if ((((Node_Sub8_Sub11) class248_sub8_sub11).anInt8999) == 45) {
                            ((Node_Sub8_Sub11) class248_sub8_sub11).aString8988 = "<col=ffffff>" + string;
                            break;
                        }
                    }
                }
            }
        }
    }

    final int method2838(byte i, int i_12_, int i_13_) {
        anInt3162++;
        int i_14_ = ((Class282_Sub20.anInt7800 ^ 0xffffffff) >= (i_12_ ^ 0xffffffff) ? i_12_ : Class282_Sub20.anInt7800);
        int i_15_ = -69 % ((51 - i) / 42);
        if (this == NPC.aClass272_10616)
            return 0;
        if (this == Class346_Sub1.aClass272_8251)
            return i_14_ - i_13_;
        if (Node_Sub5.aClass272_6839 == this)
            return (i_14_ - i_13_) / 2;
        return 0;
    }

    public final String toString() {
        anInt3163++;
        throw new IllegalStateException();
    }
}
