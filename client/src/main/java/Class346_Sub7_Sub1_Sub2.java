/* Class346_Sub7_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346_Sub7_Sub1_Sub2 extends Class346_Sub7_Sub1 implements Interface16 {
    static int anInt10188;
    static int anInt10189;
    static int anInt10190;
    private Class38 aClass38_10191;
    static int anInt10192;
    static int anInt10193;
    static int anInt10194;
    static int anInt10195;
    static int anInt10196;
    static int anInt10197;
    static OutgoingOpcode aOutgoingOpcode_10198 = new OutgoingOpcode(17, 7);
    static int anInt10199;
    static int anInt10200;
    static int anInt10201;
    static int anInt10202;
    static int anInt10203;
    static int anInt10204;
    static int anInt10205;
    static Class259 aClass259_10206;
    Class150 aClass150_10207;
    static int anInt10208;
    static int anInt10209;
    static int anInt10210;
    static int anInt10211;
    private boolean aBoolean10212;
    private boolean aBoolean10213 = false;

    static final long method3591(int i, String string) {
        anInt10205++;
        if (i != -16337)
            return 50L;
        long l = 0L;
        int i_0_ = string.length();
        for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
            l *= 37L;
            int i_2_ = string.charAt(i_1_);
            if ((i_2_ ^ 0xffffffff) <= -66 && (i_2_ ^ 0xffffffff) >= -91)
                l += (long) (i_2_ + -64);
            else if (i_2_ >= 97 && (i_2_ ^ 0xffffffff) >= -123)
                l += (long) (1 + i_2_ + -97);
            else if ((i_2_ ^ 0xffffffff) <= -49 && (i_2_ ^ 0xffffffff) >= -58)
                l += (long) (-48 + (i_2_ + 27));
            if (l >= 177917621779460413L)
                break;
        }
        for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
            /* empty */
        }
        return l;
    }

    final void method3573(ha var_ha, byte i) {
        anInt10188++;
        Class162 class162 = ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1339(var_ha, true, 262144, -21385, false);
        if (i <= 121)
            aClass259_10206 = null;
        if (class162 != null) {
            int i_3_ = ((Interactable) this).x >> 1229360041;
            int i_4_ = ((Interactable) this).y >> -984103287;
            Viewport viewport = var_ha.o();
            viewport.method1859(((Interactable) this).x, ((Interactable) this).anInt8317, ((Interactable) this).y);
            ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1347(false, i_4_, viewport, i_3_, class162, var_ha, i_3_, i_4_, false);
        }
    }

    final Class346_Sub10 method3578(int i, ha var_ha) {
        anInt10210++;
        Class162 class162 = ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1339(var_ha, true, 2048, -21385, false);
        if (class162 == null)
            return null;
        Viewport viewport = var_ha.o();
        viewport.method1859((((Interactable) this).x + ((Class346_Sub7_Sub1) this).aShort9910), ((Interactable) this).anInt8317, (((Interactable) this).y - -((Class346_Sub7_Sub1) this).aShort9901));
        Class346_Sub10 class346_sub10 = Class282_Sub21.method3013(aBoolean10212, (byte) 123, 1);
        if (i != -1)
            return null;
        int i_5_ = ((Interactable) this).x >> -1709045175;
        int i_6_ = ((Interactable) this).y >> -1001505207;
        ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1347(false, i_6_, viewport, i_5_, class162, var_ha, i_5_, i_6_, true);
        if (!Class357.aBoolean4416)
            class162.method1440(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), 0);
        else
            class162.method1441(viewport, (((Class346_Sub10) class346_sub10).aClass346_Sub9Array8353[0]), ObjectDefinition.anInt3100, 0);
        if ((((Class150) ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207).aClass346_Sub8_1773) != null) {
            Class338 class338 = ((Class150) ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207).aClass346_Sub8_1773.method3714();
            if (Class357.aBoolean4416)
                var_ha.a(class338, ObjectDefinition.anInt3100);
            else
                var_ha.a(class338);
        }
        aBoolean10213 = class162.F() || (((Class150) (((Class346_Sub7_Sub1_Sub2) this).aClass150_10207)).aClass346_Sub8_1773) != null;
        if (aClass38_10191 != null)
            Class225_Sub1.method1788(aClass38_10191, ((Interactable) this).anInt8317, class162, ((Interactable) this).y, i ^ ~0x73, ((Interactable) this).x);
        else
            aClass38_10191 = Class282_Sub11.method2965(((Interactable) this).y, ((Interactable) this).x, ((Interactable) this).anInt8317, 544, class162);
        return class346_sub10;
    }

    final boolean method3579(ha var_ha, int i, int i_7_, byte i_8_) {
        if (i_8_ != 103)
            return false;
        anInt10192++;
        Class162 class162 = ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1339(var_ha, false, 131072, -21385, false);
        if (class162 == null)
            return false;
        Viewport viewport = var_ha.o();
        viewport.method1859((((Class346_Sub7_Sub1) this).aShort9910 + ((Interactable) this).x), ((Interactable) this).anInt8317, (((Interactable) this).y - -((Class346_Sub7_Sub1) this).aShort9901));
        if (!Class357.aBoolean4416)
            return class162.method1437(i_7_, i, viewport, false, 0);
        return class162.method1420(i_7_, i, viewport, false, 0, ObjectDefinition.anInt3100);
    }

    final Class38 method3575(byte i, ha var_ha) {
        if (i > -86)
            aBoolean10212 = true;
        anInt10189++;
        return aClass38_10191;
    }

    public final void method44(boolean bool) {
        if (bool != true)
            method3591(36, null);
        anInt10201++;
    }

    public static void method3592(int i) {
        int i_9_ = 91 / ((i - -85) / 32);
        aClass259_10206 = null;
        aOutgoingOpcode_10198 = null;
    }

    static final void method3593(float[] fs, int i, int[] is, int i_10_, int i_11_, float[] fs_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int[] is_19_) {
        anInt10202++;
        int i_20_ = i_11_ + i_13_ * i_16_;
        int i_21_ = i_18_ + i_17_ * i_14_;
        if (i_15_ != 0)
            method3594(97, -64, -128);
        int i_22_ = -i + i_16_;
        int i_23_ = -i + i_17_;
        if (is_19_ == null) {
            for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_24_++) {
                int i_25_ = i_20_ - -i;
                while ((i_25_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
                    fs[i_21_++] = fs_12_[i_20_++];
                i_21_ += i_23_;
                i_20_ += i_22_;
            }
        } else if (fs_12_ != null) {
            for (int i_26_ = 0; i_10_ > i_26_; i_26_++) {
                int i_27_ = i_20_ + i;
                while (i_27_ > i_20_) {
                    is[i_21_] = is_19_[i_20_];
                    fs[i_21_++] = fs_12_[i_20_++];
                }
                i_20_ += i_22_;
                i_21_ += i_23_;
            }
        } else {
            for (int i_28_ = 0; i_10_ > i_28_; i_28_++) {
                int i_29_ = i_20_ - -i;
                while (i_29_ > i_20_)
                    is[i_21_++] = is_19_[i_20_++];
                i_21_ += i_23_;
                i_20_ += i_22_;
            }
        }
    }

    public final void method41(int i, ha var_ha) {
        anInt10200++;
        if (i != 6120)
            method42(true, null);
        ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1335(var_ha, 20087);
    }

    static final int method3594(int i, int i_30_, int i_31_) {
        anInt10209++;
        if (i_30_ != -429911713)
            return 110;
        int i_32_ = i_31_ >> -429911713 & i - 1;
        return i_32_ + (i_31_ - -(i_31_ >>> 1757497631)) % i;
    }

    final int method3580(int i) {
        if (i != -32768)
            return 72;
        anInt10190++;
        return ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1341(1);
    }

    public final boolean method45(int i) {
        anInt10211++;
        if (i != -28823)
            method3574((byte) -80);
        return ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1338((byte) -127);
    }

    final boolean method3574(byte i) {
        anInt10208++;
        int i_33_ = 87 % ((14 - i) / 57);
        return false;
    }

    public final int method40(byte i) {
        anInt10196++;
        if (i <= 63)
            aOutgoingOpcode_10198 = null;
        return (((Class150) ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207).anInt1754);
    }

    final boolean method3563(boolean bool) {
        if (bool != false)
            method40((byte) 97);
        anInt10204++;
        return aBoolean10213;
    }

    Class346_Sub7_Sub1_Sub2(ha var_ha, ObjectDefinition class266, int i, int i_34_, int i_35_, int i_36_, int i_37_, boolean bool, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
        super(i_35_, i_36_, i_37_, i, i_34_, i_38_, i_39_);
        ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207 = new Class150(var_ha, class266, i_40_, i_41_, ((Interactable) this).plane, i_34_, this, bool, i_42_);
        aBoolean10212 = ((ObjectDefinition) class266).anInt3105 != 0 && !bool;
    }

    public final int method46(byte i) {
        anInt10199++;
        int i_43_ = 53 / ((i - -57) / 53);
        return (((Class150) ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207).anInt1755);
    }

    final int method3567(byte i) {
        anInt10193++;
        if (i < 81)
            aClass259_10206 = null;
        return ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1337(-1);
    }

    public final int method43(byte i) {
        anInt10203++;
        if (i != -111)
            return 54;
        return (((Class150) ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207).anInt1787);
    }

    public final void method42(boolean bool, ha var_ha) {
        if (bool == true) {
            ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1346((byte) 39, var_ha);
            anInt10197++;
        }
    }

    final void method3595(byte i, Class21 class21) {
        ((Class346_Sub7_Sub1_Sub2) this).aClass150_10207.method1344(class21, 0);
        if (i > -100)
            aClass259_10206 = null;
        anInt10194++;
    }
}
