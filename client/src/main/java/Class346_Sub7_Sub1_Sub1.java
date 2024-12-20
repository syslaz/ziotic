/* Class346_Sub7_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub1_Sub1 extends Class346_Sub7_Sub1 implements Interface16 {
    static int anInt10126;
    static int anInt10127;
    private boolean aBoolean10128;
    static int anInt10129;
    private byte aByte10130;
    static int anInt10131;
    private byte aByte10132;
    static boolean aBoolean10133 = false;
    static int anInt10134;
    static int anInt10135;
    static Class339 aClass339_10136 = new Class339("WTWIP", "office", "_wip", 3);
    private Class38 aClass38_10137;
    static int anInt10138;
    static int anInt10139;
    private short aShort10140;
    private r aR10141;
    static int anInt10142;
    static int anInt10143;
    private boolean aBoolean10144;
    static int anInt10145;
    static int anInt10146;
    static int anInt10147;
    static int anInt10148;
    static int anInt10149;
    private Class162 aClass162_10150;
    static int anInt10151;
    static int anInt10152;
    static int anInt10153;
    static int anInt10154;
    static int anInt10155;
    private boolean aBoolean10156;

    public final int method46(byte i) {
        anInt10139++;
        int i_0_ = -53 % ((i - -57) / 53);
        return aByte10130;
    }

    public final void method42(boolean bool, ha var_ha) {
        anInt10146++;
        Object object = null;
        if (bool == true) {
            r var_r;
            if (aR10141 == null && aBoolean10144) {
                Class101 class101 = method3588(var_ha, (byte) -107, 262144, true);
                var_r = class101 == null ? null : ((Class101) class101).aR1289;
            } else {
                var_r = aR10141;
                aR10141 = null;
            }
            if (var_r != null)
                Class340_Sub6.method3460(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
        }
    }

    public final void method44(boolean bool) {
        anInt10151++;
        if (bool != true)
            aClass339_10136 = null;
        if (aClass162_10150 != null)
            aClass162_10150.method1435();
    }

    final int method3567(byte i) {
        anInt10148++;
        if (i < 81)
            aClass339_10136 = null;
        if (aClass162_10150 == null)
            return 0;
        return aClass162_10150.ma();
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10129++;
        if (aClass162_10150 == null)
            return null;
        if (i != -1)
            method3574((byte) 27);
        Viewport viewport = var_ha.o();
        viewport.method1859((((Interactable) this).x - -((Class346_Sub7_Sub1) this).aShort9910), ((Interactable) this).anInt8317, (((Class346_Sub7_Sub1) this).aShort9901 + ((Interactable) this).y));
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10128, (byte) 113, 1);
        if (!Class357.aBoolean4416)
            aClass162_10150.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        else
            aClass162_10150.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        return class346_sub10;
    }

    final void method3573(ha var_ha, byte i) {
        anInt10152++;
        if (i <= 121)
            method45(61);
    }

    public final void method41(int i, ha var_ha) {
        anInt10143++;
        if (i == 6120) {
            Object object = null;
            r var_r;
            if (aR10141 != null || !aBoolean10144) {
                var_r = aR10141;
                aR10141 = null;
            } else {
                Class101 class101 = method3588(var_ha, (byte) -107, 262144, true);
                var_r = class101 == null ? null : ((Class101) class101).aR1289;
            }
            if (var_r != null)
                Class334.method3417(var_r, ((Interactable) this).aByte8322, ((Interactable) this).x, ((Interactable) this).y, null);
        }
    }

    static final void method3585(int i) {
        anInt10153++;
        if (Class263.method2771(-6, Class273.anInt5008) || Class188.method1633((byte) -14, Class273.anInt5008))
            Class219.method1756(Class346_Sub7_Sub1.cameraPosX >> 1798584300, Class316_Sub1_Sub2.cameraPosZ >> 251030860, 5000, false);
        else {
            int i_1_ = ((((Entity) Class347.myPlayer).posQueueX[0]) >> 1654363843);
            int i_2_ = ((((Entity) Class347.myPlayer).posQueueY[0]) >> 1942566723);
            if ((i_1_ ^ 0xffffffff) <= -1 && i_1_ < Node_Sub8_Sub4.anInt8360 >> -743390077 && i_2_ >= 0 && ((i_2_ ^ 0xffffffff) > (Node_Sub22.anInt7074 >> -1882076765 ^ 0xffffffff)))
                Class219.method1756(i_1_, i_2_, 5000, false);
            else
                Class219.method1756(Node_Sub8_Sub4.anInt8360 >> -806420444, Node_Sub22.anInt7074 >> -628121948, 0, false);
        }
        Class340_Sub6.method3463(true);
        Class310.method3246(121);
        Class147.method1313(118);
        Node_Sub14_Sub35.method2383(-1);
        int i_3_ = 26 / ((26 - i) / 32);
    }

    final Class38 method3575(byte i, ha var_ha) {
        anInt10145++;
        if (i >= -86)
            aBoolean10156 = true;
        if (aClass38_10137 == null)
            aClass38_10137 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, method3586((byte) -89, 0, var_ha));
        return aClass38_10137;
    }

    public final int method40(byte i) {
        if (i <= 63)
            aByte10132 = (byte) -23;
        anInt10147++;
        return 0xffff & aShort10140;
    }

    public final int method43(byte i) {
        if (i != -111)
            return 127;
        anInt10154++;
        return aByte10132;
    }

    Class346_Sub7_Sub1_Sub1(ha var_ha, ObjectDefinition class266, int i, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_, int i_10_, int i_11_) {
        super(i_5_, i_6_, i_7_, i, i_4_, i_8_, i_9_);
        aBoolean10128 = (((ObjectDefinition) class266).anInt3105 ^ 0xffffffff) != -1 && !bool;
        aByte10130 = (byte) i_10_;
        aShort10140 = (short) ((ObjectDefinition) class266).anInt3043;
        ((Interactable) this).x = i_5_;
        aByte10132 = (byte) i_11_;
        ((Interactable) this).y = i_7_;
        aBoolean10156 = bool;
        aBoolean10144 = (var_ha.s() && ((ObjectDefinition) class266).aBoolean3085 && !aBoolean10156 && (((Node_Sub45) Node_Sub14_Sub38.aClass248_Sub45_9584).aClass282_Sub14_7342.method2976(true) ^ 0xffffffff) != -1);
        Class101 class101 = method3588(var_ha, (byte) -107, 2048, aBoolean10144);
        if (class101 != null) {
            aR10141 = ((Class101) class101).aR1289;
            aClass162_10150 = ((Class101) class101).aClass162_1283;
        }
    }

    final boolean method3563(boolean bool) {
        anInt10138++;
        if (bool != false)
            return false;
        if (aClass162_10150 != null)
            return aClass162_10150.F();
        return false;
    }

    private final Class162 method3586(byte i, int i_12_, ha var_ha) {
        anInt10155++;
        if (i != -89)
            method44(true);
        if (aClass162_10150 != null && (var_ha.b(aClass162_10150.ua(), i_12_) ^ 0xffffffff) == -1)
            return aClass162_10150;
        Class101 class101 = method3588(var_ha, (byte) -107, i_12_, false);
        if (class101 != null)
            return ((Class101) class101).aClass162_1283;
        return null;
    }

    static final byte[] method3587(Object object, boolean bool, int i) {
        if (i != -30711)
            aBoolean10133 = true;
        anInt10149++;
        if (object == null)
            return null;
        if (object instanceof byte[]) {
            byte[] is = (byte[]) object;
            if (bool)
                return Class111.method777(i ^ 0x778f, is);
            return is;
        }
        if (object instanceof Class205) {
            Class205 class205 = (Class205) object;
            return class205.method1697(88);
        }
        throw new IllegalArgumentException();
    }

    final int method3580(int i) {
        anInt10142++;
        if (i != -32768)
            method44(true);
        if (aClass162_10150 != null)
            return aClass162_10150.fa();
        return 0;
    }

    public final boolean method45(int i) {
        if (i != -28823)
            method3575((byte) 113, null);
        anInt10127++;
        return aBoolean10144;
    }

    private final Class101 method3588(ha var_ha, byte i, int i_13_, boolean bool) {
        anInt10131++;
        ObjectDefinition class266 = Class346_Sub7_Sub4_Sub2.aClass368_10161.method3838((byte) -116, aShort10140 & 0xffff);
        if (i != -107)
            return null;
        s var_s;
        s var_s_14_;
        if (aBoolean10156) {
            var_s = Node_Sub14_Sub29.aSArray9471[0];
            var_s_14_ = (Node_Sub14_Sub12_Sub1.aSArray10306[((Interactable) this).aByte8322]);
        } else {
            if ((((Interactable) this).aByte8322 ^ 0xffffffff) <= -4)
                var_s = null;
            else
                var_s = (Node_Sub14_Sub29.aSArray9471[1 + ((Interactable) this).aByte8322]);
            var_s_14_ = (Node_Sub14_Sub29.aSArray9471[((Interactable) this).aByte8322]);
        }
        return class266.method2785(aByte10132, bool, null, i_13_, ((Interactable) this).anInt8317, var_ha, (byte) -36, ((Interactable) this).y, aByte10130, ((Interactable) this).x, var_s_14_, var_s);
    }

    static final void method3589(ha var_ha, int i) {
        if (!Class145.aBoolean1721)
            Class187.method1629(81, var_ha);
        else
            Class52.method413(false, var_ha);
        if (i != 5851)
            method3585(-51);
        anInt10134++;
    }

    final boolean method3579(ha var_ha, int i, int i_15_, byte i_16_) {
        anInt10135++;
        if (i_16_ != 103)
            method45(-105);
        Class162 class162 = method3586((byte) -89, 131072, var_ha);
        if (class162 != null) {
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            if (Class357.aBoolean4416)
                return class162.method1420(i_15_, i, viewport, false, 0, ObjectDefinition.anInt3100);
            return class162.method1437(i_15_, i, viewport, false, 0);
        }
        return false;
    }

    public static void method3590(byte i) {
        aClass339_10136 = null;
        if (i != -4)
            aBoolean10133 = true;
    }

    final boolean method3574(byte i) {
        anInt10126++;
        int i_17_ = -92 / ((14 - i) / 57);
        if (aClass162_10150 != null) {
            if (aClass162_10150.r())
                return false;
            return true;
        }
        return true;
    }
}
