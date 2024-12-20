/* Class282_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class282_Sub15 extends Class282 {
    static int anInt7736;
    static int anInt7737;
    static int anInt7738;
    private boolean aBoolean7739 = true;
    static int anInt7740;
    static int anInt7741;
    static int anInt7742;
    static int anInt7743;
    static int anInt7744;
    static int anInt7745;
    static int anInt7746;
    static IncommingOpcode aIncommingOpcode_7747 = new IncommingOpcode(70, 8);
    boolean aBoolean7748 = false;
    static int anInt7749;
    static float aFloat7750;
    static Node_Sub15_Sub3 aClass248_Sub15_Sub3_7751;
    static int anInt7752 = 0;
    /*synthetic*/ static Class aClass7753;
    /*synthetic*/ static Class aClass7754;
    /*synthetic*/ static Class aClass7755;

    final boolean method2979(byte i) {
        int i_0_ = 37 / ((-57 - i) / 62);
        anInt7736++;
        return aBoolean7739;
    }

    final int method2917(int i, int i_1_) {
        anInt7741++;
        if (i != 0)
            method2922(true, 93);
        if (!((Class282) this).aClass248_Sub45_3321.method2652(-18640).method754(-109))
            return 3;
        if ((i_1_ ^ 0xffffffff) == -4 && !Class346_Sub5_Sub2.method3553("jagdx", (byte) -124))
            return 3;
        return 2;
    }

    Class282_Sub15(int i, Node_Sub45 class248_sub45) {
        super(i, class248_sub45);
    }

    public static void method2980(int i) {
        if (i != 0)
            method2985(91);
        aClass248_Sub15_Sub3_7751 = null;
        aIncommingOpcode_7747 = null;
    }

    static final int method2981(int i) {
        anInt7744++;
        int i_2_ = 0;
        Field[] fields = (aClass7753 != null ? aClass7753 : (aClass7753 = method2987("Node_Sub45"))).getDeclaredFields();
        Field[] fields_3_ = fields;
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (fields_3_.length ^ 0xffffffff); i_4_++) {
            Field field = fields_3_[i_4_];
            if ((aClass7754 != null ? aClass7754 : (aClass7754 = method2987("Class282"))).isAssignableFrom(field.getType()))
                i_2_++;
        }
        if (i >= -12)
            aIncommingOpcode_7747 = null;
        return 1 + i_2_;
    }

    final void method2918(byte i) {
        if (i != 98)
            method2982(28);
        anInt7742++;
        if (!((Class282) this).aClass248_Sub45_3321.method2652(-18640).method754(-24))
            ((Class282) this).anInt3320 = 0;
        if ((((Class282) this).anInt3320 ^ 0xffffffff) > -1 || ((Class282) this).anInt3320 > 5)
            ((Class282) this).anInt3320 = method2919(false);
    }

    final boolean method2982(int i) {
        anInt7737++;
        if (i != 260)
            aClass248_Sub15_Sub3_7751 = null;
        if (!((Class282) this).aClass248_Sub45_3321.method2652(-18640).method754(-100))
            return false;
        return true;
    }

    static final void method2983(boolean bool, NPC NPC, boolean bool_5_) {
        anInt7746++;
        if ((Class379.anInt4638 ^ 0xffffffff) > -401) {
            Class255 class255 = (((NPC) NPC).aClass255_10614);
            String string = (((NPC) NPC).aString10604);
            if (((Class255) class255).anIntArray2923 != null) {
                class255 = class255.method2737((byte) 70, Node_Sub43.aClass291_7306);
                if (class255 == null)
                    return;
                string = ((Class255) class255).aString2915;
            }
            if (((Class255) class255).aBoolean2911) {
                if (((NPC) NPC).anInt10608 != 0) {
                    String string_6_ = (Class359.aClass215_4430 == Class12.aClass215_249 ? Class41.aClass41_496.method301(Class191.anInt4822, (byte) -108) : Class41.aClass41_494.method301(Class191.anInt4822, (byte) -108));
                    string = (string + (Class150.method1340((((Player) Class347.myPlayer).anInt10546), !bool, ((NPC) NPC).anInt10608)) + " (" + string_6_ + ((NPC) NPC).anInt10608 + ")");
                }
                if (Class115.aBoolean4952 && !bool_5_) {
                    Class210 class210 = ((aa_Sub2.anInt5262 ^ 0xffffffff) != 0 ? Node_Sub20.aClass240_7045.method1923(-6119, aa_Sub2.anInt5262) : null);
                    if ((Class346_Sub2.anInt8264 & 0x2 ^ 0xffffffff) != -1 && (class210 == null || (class255.method2744(-156, (((Class210) class210).anInt2430), aa_Sub2.anInt5262) != ((Class210) class210).anInt2430))) {
                        r_Sub1.anInt10267++;
                        Class131.method1211(true, (long) ((Entity) NPC).anInt10484, (long) ((Entity) NPC).anInt10484, false, 0, 9, false, -1, Class292.anInt3423, Node_Sub8_Sub4.aString8364, (byte) 87, (Class287.aString3382 + " -> <col=ffff00>" + string), 0);
                    }
                }
                if (!bool_5_) {
                    String[] strings = ((Class255) class255).aStringArray2895;
                    if (Class200.aBoolean2290)
                        strings = Class307.method3225(-28574, strings);
                    if (strings != null) {
                        for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
                            if (strings[i] != null && (((Class255) class255).aByte2902 == 0 || !(strings[i].equalsIgnoreCase(Class41.aClass41_489.method301(Class191.anInt4822, (byte) -108))))) {
                                int i_7_ = 0;
                                if (i == 0)
                                    i_7_ = 59;
                                int i_8_ = Class182.anInt2123;
                                if ((i ^ 0xffffffff) == -2)
                                    i_7_ = 6;
                                if (i == 2)
                                    i_7_ = 18;
                                if ((i ^ 0xffffffff) == -4)
                                    i_7_ = 11;
                                if ((i ^ 0xffffffff) == -5)
                                    i_7_ = 47;
                                if ((((Class255) class255).anInt2872 ^ 0xffffffff) == (i ^ 0xffffffff))
                                    i_8_ = ((Class255) class255).anInt2887;
                                if ((((Class255) class255).anInt2912 ^ 0xffffffff) == (i ^ 0xffffffff))
                                    i_8_ = ((Class255) class255).anInt2866;
                                Class131.method1211(true, (long) (((Entity) NPC).anInt10484), (long) (((Entity) NPC).anInt10484), false, 0, i_7_, false, -1, ((strings[i].equalsIgnoreCase(Class41.aClass41_489.method301(Class191.anInt4822, (byte) -108))) ? ((Class255) class255).anInt2913 : i_8_), strings[i], (byte) 87, "<col=ffff00>" + string, 0);
                                Class130.anInt1577++;
                            }
                        }
                    }
                    if (((Class255) class255).aByte2902 == 1 && strings != null) {
                        for (int i = 4; i >= 0; i--) {
                            if (strings[i] != null && (strings[i].equalsIgnoreCase(Class41.aClass41_489.method301(Class191.anInt4822, (byte) -108)))) {
                                short i_9_ = 0;
                                if ((((NPC) NPC).anInt10608 ^ 0xffffffff) < ((((Player) (Class347.myPlayer)).anInt10546) ^ 0xffffffff))
                                    i_9_ = (short) 2000;
                                short i_10_ = 0;
                                if ((i ^ 0xffffffff) == -1)
                                    i_10_ = (short) 59;
                                if (i == 1)
                                    i_10_ = (short) 6;
                                if (i == 2)
                                    i_10_ = (short) 18;
                                if ((i ^ 0xffffffff) == -4)
                                    i_10_ = (short) 11;
                                if ((i ^ 0xffffffff) == -5)
                                    i_10_ = (short) 47;
                                if ((i_10_ ^ 0xffffffff) != -1)
                                    i_10_ += i_9_;
                                Class131.method1211(true, (long) (((Entity) NPC).anInt10484), (long) (((Entity) NPC).anInt10484), false, 0, i_10_, false, -1, ((Class255) class255).anInt2913, strings[i], (byte) 87, "<col=ffff00>" + string, 0);
                                Class249_Sub1.anInt4717++;
                            }
                        }
                    }
                }
                Node_Sub14_Sub35.anInt9531++;
                Class131.method1211(bool, (long) ((Entity) NPC).anInt10484, (long) ((Entity) NPC).anInt10484, false, 0, 1002, bool_5_, -1, Class340_Sub5.anInt8142, Class41.aClass41_488.method301(Class191.anInt4822, (byte) -108), (byte) 87, "<col=ffff00>" + string, 0);
            }
        }
    }

    final int method2984(boolean bool) {
        anInt7738++;
        if (bool != true)
            method2984(false);
        return ((Class282) this).anInt3320;
    }

    final void method2922(boolean bool, int i) {
        ((Class282_Sub15) this).aBoolean7748 = false;
        if (bool != true)
            method2980(12);
        anInt7745++;
        ((Class282) this).anInt3320 = i;
    }

    static final void method2985(int i) {
        if (i == 3) {
            anInt7749++;
            do {
                if (!((Class174) Node_Sub14_Sub15.aClass174_9328).aBoolean2047) {
                    try {
                        Method method = (aClass7755 != null ? aClass7755 : (aClass7755 = method2987("java.lang.Runtime"))).getMethod("maxMemory", new Class[0]);
                        if (method != null) {
                            try {
                                Runtime runtime = Runtime.getRuntime();
                                Long var_long = (Long) method.invoke(runtime, null);
                                Class75.anInt977 = (int) (var_long.longValue() / 1048576L) - -1;
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                        break;
                    } catch (Exception exception) {
                        break;
                    }
                }
                Class75.anInt977 = 96;
            } while (false);
        }
    }

    Class282_Sub15(Node_Sub45 class248_sub45) {
        super(class248_sub45);
    }

    final void method2986(boolean bool, int i) {
        anInt7743++;
        aBoolean7739 = bool;
        if (i != 0)
            aBoolean7739 = false;
    }

    final int method2919(boolean bool) {
        anInt7740++;
        ((Class282_Sub15) this).aBoolean7748 = true;
        if (bool != false)
            aBoolean7739 = true;
        if (!((Class282) this).aClass248_Sub45_3321.method2652(-18640).method754(-110))
            return 0;
        return 2;
    }

    /*synthetic*/
    static Class method2987(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
