/* Class346_Sub7_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub5_Sub1 extends Class346_Sub7_Sub5 implements Interface16 {
    private r aR10025;
    static int anInt10026;
    static int anInt10027;
    static int anInt10028;
    private boolean aBoolean10029;
    private Class38 aClass38_10030;
    static int anInt10031;
    static int anInt10032;
    private boolean aBoolean10033;
    private boolean aBoolean10034;
    static int anInt10035;
    static int anInt10036;
    static String[] aStringArray10037 = {"en", "de", "fr", "pt", "nl"};
    private byte aByte10038;
    static int anInt10039;
    static int anInt10040;
    static int anInt10041;
    private boolean aBoolean10042;
    static int anInt10043;
    static int anInt10044;
    static int anInt10045;
    static int anInt10046;
    static int anInt10047;
    static int anInt10048;
    static int anInt10049;
    static int anInt10050;
    static int anInt10051;
    static int anInt10052;
    static int anInt10053;
    Class162 aClass162_10054;
    private byte aByte10055;
    private short aShort10056;

    final int method3567(byte i) {
        if (i <= 81)
            return 81;
        anInt10046++;
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 == null)
            return 0;
        return ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.ma();
    }

    final boolean method3568(int i) {
        int i_0_ = 104 % ((i - 53) / 45);
        anInt10045++;
        return aBoolean10033;
    }

    final Class38 method3575(byte i, ha var_ha) {
        if (aClass38_10030 == null)
            aClass38_10030 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, method3695((byte) 25, var_ha, 0));
        if (i > -86)
            return null;
        anInt10053++;
        return aClass38_10030;
    }

    private final Class101 method3692(ha var_ha, int i, boolean bool, int i_1_) {
        anInt10028++;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -25, aShort10056 & 0xffff);
        if (i != 3)
            return null;
        s var_s;
        s var_s_2_;
        if (!aBoolean10042) {
            if (((Interactable) this).aByte8322 < 3)
                var_s_2_ = (Node_Sub14_Sub29.aSArray9471[((Interactable) this).aByte8322 - -1]);
            else
                var_s_2_ = null;
            var_s = (Node_Sub14_Sub29.aSArray9471[((Interactable) this).aByte8322]);
        } else {
            var_s = (Node_Sub14_Sub12_Sub1.aSArray10306[((Interactable) this).aByte8322]);
            var_s_2_ = Node_Sub14_Sub29.aSArray9471[0];
        }
        return class266.method2785(aByte10038, bool, null, i_1_, ((Interactable) this).anInt8317, var_ha, (byte) -127, ((Interactable) this).y, aByte10055, ((Interactable) this).x, var_s, var_s_2_);
    }

    public final int method46(byte i) {
        anInt10026++;
        int i_3_ = 60 / ((i - -57) / 53);
        return aByte10055;
    }

    final boolean method3574(byte i) {
        anInt10043++;
        int i_4_ = 42 % ((14 - i) / 57);
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 == null)
            return true;
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.r())
            return false;
        return true;
    }

    public final void method42(boolean bool, ha var_ha) {
        anInt10041++;
        Object object = null;
        r var_r;
        if (aR10025 != null || !aBoolean10034) {
            var_r = aR10025;
            aR10025 = null;
        } else {
            Class101 class101 = method3692(var_ha, 3, true, 262144);
            var_r = class101 == null ? null : ((Class101) class101).aR1289;
        }
        if (bool != true)
            method3693(-77);
        if (var_r != null)
            Class340_Sub6.method3460(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
    }

    public static void method3693(int i) {
        aStringArray10037 = null;
        if (i != 65535)
            method3694(44, 19);
    }

    final void method3577(int i) {
        anInt10039++;
        if (i == 131072) {
            aBoolean10033 = false;
            if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null)
                ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.s(~0x10000 & ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.ua());
        }
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10036++;
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 == null)
            return null;
        Viewport viewport = var_ha.o();
        viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
        if (i != -1)
            aBoolean10029 = false;
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10029, (byte) 120, 1);
        if (Class357.aBoolean4416)
            ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.method1441(viewport, ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0], ObjectDefinition.anInt3100, 0);
        else
            ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.method1440(viewport, ((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0], 0);
        return class346_sub10;
    }

    Class346_Sub7_Sub5_Sub1(ha var_ha, ObjectDefinition class266, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_, boolean bool_11_) {
        super(i_6_, i_7_, i_8_, i, i_5_, Node_Sub48.method2671(i_10_, i_9_, 3));
        aByte10055 = (byte) i_9_;
        ((Interactable) this).y = i_8_;
        aShort10056 = (short) ((ObjectDefinition) class266).anInt3043;
        ((Interactable) this).x = i_6_;
        aBoolean10029 = (((ObjectDefinition) class266).anInt3105 ^ 0xffffffff) != -1 && !bool;
        aBoolean10033 = bool_11_;
        aByte10038 = (byte) i_10_;
        aBoolean10042 = bool;
        aBoolean10034 = (var_ha.s() && ((ObjectDefinition) class266).aBoolean3085 && !aBoolean10042 && (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) ^ 0xffffffff) != -1);
        int i_12_ = 2048;
        if (aBoolean10033)
            i_12_ |= 0x10000;
        Class101 class101 = method3692(var_ha, 3, aBoolean10034, i_12_);
        if (class101 != null) {
            ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 = ((Class101) class101).aClass162_1283;
            aR10025 = ((Class101) class101).aR1289;
            if (aBoolean10033)
                ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 = ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.method1436((byte) 0, i_12_, false);
        }
    }

    final void method3573(ha var_ha, byte i) {
        if (i < 121)
            aStringArray10037 = null;
        anInt10049++;
    }

    public final int method40(byte i) {
        anInt10027++;
        if (i <= 63)
            aBoolean10034 = false;
        return 0xffff & aShort10056;
    }

    public final void method41(int i, ha var_ha) {
        if (i == 6120) {
            anInt10040++;
            Object object = null;
            r var_r;
            if (aR10025 != null || !aBoolean10034) {
                var_r = aR10025;
                aR10025 = null;
            } else {
                Class101 class101 = method3692(var_ha, 3, true, 262144);
                var_r = class101 == null ? null : ((Class101) class101).aR1289;
            }
            if (var_r != null)
                Class334.method3417(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
        }
    }

    public final boolean method45(int i) {
        if (i != -28823)
            aBoolean10034 = false;
        anInt10047++;
        return aBoolean10034;
    }

    static final void method3694(int i, int i_13_) {
        anInt10035++;
        if (i > -37)
            aStringArray10037 = null;
        Node_Sub8_Sub10 class248_sub8_sub10 = Class297.method3136(i_13_, -874792672, 14);
        class248_sub8_sub10.method2076(-70);
    }

    final int method3580(int i) {
        anInt10044++;
        if (i != -32768)
            method3575((byte) -56, null);
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null)
            return ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.fa();
        return 0;
    }

    public final void method44(boolean bool) {
        anInt10052++;
        if (bool != true)
            method3578(85, null);
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null)
            ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.method1435();
    }

    final void method3572(Interactable interactable, ha var_ha, int i, int i_14_, int i_15_, boolean bool, int i_16_) {
        if (i_14_ >= 109) {
            if (interactable instanceof Class346_Sub7_Sub5_Sub1) {
                Class346_Sub7_Sub5_Sub1 class346_sub7_sub5_sub1_17_ = (Class346_Sub7_Sub5_Sub1) interactable;
                if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null && (((Class346_Sub7_Sub5_Sub1) class346_sub7_sub5_sub1_17_).aClass162_10054) != null)
                    ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.method1428(((Class346_Sub7_Sub5_Sub1) class346_sub7_sub5_sub1_17_).aClass162_10054, i, i_16_, i_15_, bool);
            } else if (interactable instanceof Class346_Sub7_Sub2_Sub1) {
                Class346_Sub7_Sub2_Sub1 class346_sub7_sub2_sub1 = (Class346_Sub7_Sub2_Sub1) interactable;
                if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null && (((Class346_Sub7_Sub2_Sub1) class346_sub7_sub2_sub1).aClass162_10012) != null)
                    ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.method1428((((Class346_Sub7_Sub2_Sub1) class346_sub7_sub2_sub1).aClass162_10012), i, i_16_, i_15_, bool);
            }
            anInt10032++;
        }
    }

    private final Class162 method3695(byte i, ha var_ha, int i_18_) {
        anInt10048++;
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null && var_ha.b(((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.ua(), i_18_) == 0)
            return ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054;
        Class101 class101 = method3692(var_ha, 3, false, i_18_);
        if (i < 22)
            aBoolean10033 = true;
        if (class101 != null)
            return ((Class101) class101).aClass162_1283;
        return null;
    }

    public final int method43(byte i) {
        anInt10031++;
        if (i != -111)
            ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 = null;
        return aByte10038;
    }

    final boolean method3579(ha var_ha, int i, int i_19_, byte i_20_) {
        anInt10050++;
        if (i_20_ != 103)
            method45(119);
        Class162 class162 = method3695((byte) 52, var_ha, 131072);
        if (class162 != null) {
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            if (Class357.aBoolean4416)
                return class162.method1420(i_19_, i, viewport, false, 0, ObjectDefinition.anInt3100);
            return class162.method1437(i_19_, i, viewport, false, 0);
        }
        return false;
    }

    final boolean method3563(boolean bool) {
        if (bool != false)
            return false;
        anInt10051++;
        if (((Class346_Sub7_Sub5_Sub1) this).aClass162_10054 != null)
            return ((Class346_Sub7_Sub5_Sub1) this).aClass162_10054.F();
        return false;
    }
}
